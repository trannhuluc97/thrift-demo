namespace java com.luctn.user.thrift

exception TException {
    1: i32 error, 
    2: string message
}

struct TUser {
    1: required i32 id,
    2: string name, 
    3: i32 age
}

struct TUserResult {
    1: required i32 error,
    2: optional string message,
    3: optional TUser data
}

service TUserService {

    TUserResult getUserById(1:i32 id) throws (1:TException e),

    void save(1:TUser resource) throws (1:TException e),

    list <TUser> getList() throws (1:TException e),

    bool ping() throws (1:TException e)
}