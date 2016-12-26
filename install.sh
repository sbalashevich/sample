#!/usr/bin/env bash
fly -t local set-pipeline -c ci/pipeline.yml -p blue-green-pipeline -l ci/credentials.yml
