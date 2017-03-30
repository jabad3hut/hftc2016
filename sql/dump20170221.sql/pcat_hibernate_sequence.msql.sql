BEGIN transaction;
DROP TABLE IF EXISTS "hibernate_sequence";
CREATE TABLE "hibernate_sequence" (
  "next_val" bigint DEFAULT NULL
) ;
COMMIT transaction;
