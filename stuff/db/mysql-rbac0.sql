-- RBAC(role based )  用户
CREATE TABLE
IF NOT EXISTS t_access_user (
  id         BIGINT UNIQUE       NOT NULL AUTO_INCREMENT,
  username   VARCHAR(100) UNIQUE NOT NULL,
  name       VARCHAR(100)        NOT NULL DEFAULT '',
  sex        SMALLINT            NOT NULL,
  birthday   TIMESTAMP           NOT NULL DEFAULT '1970-01-02 00:00:00',
  department INT                 NOT NULL,
  position   INT                 NOT NULL,
  email      VARCHAR(100)        NOT NULL DEFAULT '',
  mobile     VARCHAR(13)         NOT NULL DEFAULT '',
  phone      VARCHAR(13)         NOT NULL DEFAULT '',
  createtime TIMESTAMP(0)        NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (id)
);

-- 部门
CREATE TABLE
IF NOT EXISTS t_department (
  id         INT UNIQUE   NOT NULL AUTO_INCREMENT,
  name       VARCHAR(100) NOT NULL,
  descript   VARCHAR(500)          DEFAULT '',
  createtime TIMESTAMP(0) NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (id)
);

CREATE TABLE
IF NOT EXISTS t_access_action (
  id       INT UNIQUE   NOT NULL AUTO_INCREMENT,
  name     VARCHAR(100) NOT NULL,
  descript VARCHAR(500)          DEFAULT '',
  time     TIMESTAMP(0) NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (id)
);

CREATE TABLE
IF NOT EXISTS t_access_role (
  id       INT UNIQUE   NOT NULL AUTO_INCREMENT,
  name     VARCHAR(100) NOT NULL,
  time     TIMESTAMP(0) NOT NULL DEFAULT CURRENT_TIMESTAMP,
  descript VARCHAR(500)          DEFAULT '',
  PRIMARY KEY (id)
);

-- 用户与角色映射表
CREATE TABLE
IF NOT EXISTS t_access_role_map (
  id     INT UNIQUE   NOT NULL AUTO_INCREMENT,
  uid    BIGINT       NOT NULL, -- 用户ID
  roleid INT          NOT NULL, -- 角色ID
  name   VARCHAR(100) NOT NULL,
  time   TIMESTAMP(0) NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (id)
);

-- 权限
CREATE TABLE
IF NOT EXISTS t_access_permission (
  id       INT UNIQUE   NOT NULL AUTO_INCREMENT,
  name     VARCHAR(100) NOT NULL,
  descript VARCHAR(500)          DEFAULT '',
  time     TIMESTAMP(0) NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (id)
);

-- 权限与角色映射
CREATE TABLE
IF NOT EXISTS t_access_permission_map (
  id           INT UNIQUE   NOT NULL AUTO_INCREMENT,
  permissionid INT          NOT NULL, -- 权限ID
  roleid       INT          NOT NULL, -- 角色ID
  name         VARCHAR(100) NOT NULL,
  time         TIMESTAMP(0) NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (id)
);
