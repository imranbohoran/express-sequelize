
CREATE USER express_sandbox_user WITH password 'supersecret';
CREATE DATABASE express_sandbox WITH owner=express_sandbox_user TEMPLATE postgres;
GRANT ALL PRIVILEGES ON DATABASE express_sandbox TO express_sandbox_user;
