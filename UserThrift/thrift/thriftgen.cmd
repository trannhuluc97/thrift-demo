#!/bin/sh

echo ========== Thrift generating 
rm -rf ../src/main/gen-java/*/*/*/*/*/*
thrift -r --gen java -o ../src/main/ user_service.thrift
