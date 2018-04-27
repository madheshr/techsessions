WAC_BUILD_VERSION=$(git describe --tag --long)
ARRAY_GIT_DESCRIBE=(${WAC_BUILD_VERSION//-/ })
echo "Array Value " $ARRAY_GIT_DESCRIBE
TAG=${ARRAY_GIT_DESCRIBE[0]}
echo "Tag = " $TAG
COMMIT_COUNT=${ARRAY_GIT_DESCRIBE[1]}
SHA=${ARRAY_GIT_DESCRIBE[2]}
DISPLAY_BUILD_VERSION=$TAG'.'$COMMIT_COUNT'#'$SHA
echo 'versionId=' $WAC_BUILD_VERSION > propsfile
echo "build_version : $DISPLAY_BUILD_VERSION" > build_version.yml
cat build_version.yml
