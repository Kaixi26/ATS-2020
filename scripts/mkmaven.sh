#!/bin/sh

if [[ $# -ne 3 ]]; then 
    echo "usage: $0 <old_project_path> <new_project_path> <project_name>"
    exit
fi

OLD_PROJ_PATH=$1
NEW_PROJ_PATH=$2
PROJ_NAME=$3
GROUP_ID="com"
SRC_DIR=$PROJ_PATH$PROJ_NAME"/src/main/java/"$PROJ_NAME

#echo "PROJECT NAME : '$PROJ_NAME'"
#echo "SOURCES DIR : '$SRC_DIR'"

init_project(){
    cp -r scripts/maven_template/ "$NEW_PROJ_PATH/$PROJ_NAME"
    (sed "s/maven_template/maven_template_$PROJ_NAME/g" "scripts/maven_template/pom.xml") \
        > "$NEW_PROJ_PATH/$PROJ_NAME/pom.xml"
}

copy_sources(){
    find $OLD_PROJ_PATH | grep "\.java" \
        | ./scripts/copy_sources_to.py $NEW_PROJ_PATH/$PROJ_NAME/src/main/java/
    return 0;
}

#setup_main(){
#    pushd $NEW_PROJ_PATH/$PROJ_NAME/src/main/java/app/ > /dev/null
#    for f in $(ls); do
#        grep "static.*main" $f > /dev/null \
#        && echo $f
#    done
#    popd > /dev/null
#}

init_project &&

copy_sources &&

(pushd $NEW_PROJ_PATH/$PROJ_NAME; mvn package; mvn sonar:sonar; popd)
