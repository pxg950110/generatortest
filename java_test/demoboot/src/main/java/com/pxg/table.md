用户表
create table t_user.tb_user(
id serial primary key ,
user_name varchar not null,
password text  not null,
is_deleted boolean ,
create_time timestamp
)

权限表(1 login,2 write 3 update ,4 delete 5 admin)
create table t_user.tb_permissions(
id serial primary key,
user_id int not null,
permission_code int not null,
permission_name varchar,
create_time timestamp
)
--用户账户变更记录表
create table t_user.user_update_log(
id serial primary key,
user_log json,
create_time timestamp
)
user_log 格式
{"user_id": 1
"type":"1,创建，2，修改密码，3 修改权限"
"lastdata"[{
"userId":
"userName":
"password":
"permission":[1,2,3]
}],
"newdata":[{
"userId":
"password":
"permission":[1,2,3]
}]
"time":long
}
