
/*
  File       : Exercise 3 Stored Procedures.sql
  Program    : CTS Digital Nurture - PL/SQL Module
  Author     : Shayam Sharan
  Objective  : Use PL/SQL block to check if a number is even or odd (without stored procedure)
*/

-- Step 1: Enable DBMS_OUTPUT (for Oracle SQL Developer / Live SQL)
-- Uncomment below if needed in SQL Developer
-- SET SERVEROUTPUT ON;

BEGIN
    DECLARE
        v_num NUMBER := 14;
    BEGIN
        IF MOD(v_num, 2) = 0 THEN
            DBMS_OUTPUT.PUT_LINE(v_num || ' is an Even number.');
        ELSE
            DBMS_OUTPUT.PUT_LINE(v_num || ' is an Odd number.');
        END IF;

        v_num := 9;

        IF MOD(v_num, 2) = 0 THEN
            DBMS_OUTPUT.PUT_LINE(v_num || ' is an Even number.');
        ELSE
            DBMS_OUTPUT.PUT_LINE(v_num || ' is an Odd number.');
        END IF;
    END;
END;
/
