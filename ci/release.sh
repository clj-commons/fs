#!/usr/bin/env bash

set -eu

RELEASE_VERSION="$(date "+%Y%m%d-%H%M%S").${TRAVIS_COMMIT:0:8}"

lein with-profile +set-version set-version $RELEASE_VERSION

lein deploy releases