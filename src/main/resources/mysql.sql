/*建表语句*/
CREATE TABLE proposals
(
    pid          INT PRIMARY KEY AUTO_INCREMENT,
    proposerName VARCHAR(64)  NOT NULL,
    proposerJob  VARCHAR(32)  NOT NULL,
    idNum        VARCHAR(18)  NOT NULL,
    phoneNum     VARCHAR(11)  NOT NULL,
    email        VARCHAR(64)  NOT NULL,
    sort         VARCHAR(32)  NOT NULL,
    problem      VARCHAR(128) NOT NULL,
    title        VARCHAR(256) NOT NULL,
    content      TEXT         NOT NULL,
    isPublic     BOOLEAN      NOT NULL
);
