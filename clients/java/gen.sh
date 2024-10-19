#!/bin/bash

API_VERSION=$1

buf generate --include-imports buf.build/idnorm/id-extract:$API_VERSION