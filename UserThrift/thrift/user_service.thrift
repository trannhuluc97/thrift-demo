namespace java com.luctn.user.thrift

exception TException {
    1: i32 error, 
    2: string message
}

struct TUser {
    1: i32 id,
    2: string studentName, 
    3: optional string studentid
}

service TUserService {

    TUser get(1:i32 id) throws (1:TException e),

    void save(1:TUser resource) throws (1:TException e),

    list <TUser> getList() throws (1:TException e),

    bool ping() throws (1:TException e)
}

//thrift -r --gen java user_service.thrift