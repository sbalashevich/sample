#!/usr/bin/env bash
fly -t tutorial set-pipeline -c ci/pipeline.yml -p blue-green-deployment -l ci/credentials.yml