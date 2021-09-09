CREATE TABLE `post_it_note_entity` (
  `post_Id` INT(11) NOT NULL,
  `post_content` VARCHAR(50) NULL DEFAULT NULL,
  `post_text` VARCHAR(50) NULL DEFAULT NULL,
  `post_title` VARCHAR(50) NULL DEFAULT NULL,
  PRIMARY KEY (`post_id`)
);

CREATE SEQUENCE CLIENT_SEQUENCE_ID START WITH 100 INCREMENT BY 1 NOCACHE NOCYCLE;