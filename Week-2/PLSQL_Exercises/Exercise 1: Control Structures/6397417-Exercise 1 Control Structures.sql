
/*
  File       : Exercise 1 Control Structures.sql
  Program    : CTS Digital Nurture - PL/SQL Module
  Author     : Shayam Sharan
  Objective  : Demonstrates IF-ELSE, FOR LOOP, and CASE in PL/SQL
*/

DECLARE
    v_score NUMBER := 82;
    v_grade CHAR(1);
BEGIN
    -- Assign grade based on score using IF-ELSIF-ELSE
    IF v_score >= 90 THEN
        v_grade := 'A';
    ELSIF v_score BETWEEN 75 AND 89 THEN
        v_grade := 'B';
    ELSIF v_score BETWEEN 60 AND 74 THEN
        v_grade := 'C';
    ELSE
        v_grade := 'D';
    END IF;

    DBMS_OUTPUT.PUT_LINE('Calculated Grade: ' || v_grade);

    -- Simulate repeated process using FOR LOOP
    FOR i IN 1..4 LOOP
        DBMS_OUTPUT.PUT_LINE('Iteration number: ' || i);
    END LOOP;

    -- Display remarks using CASE statement
    CASE v_grade
        WHEN 'A' THEN DBMS_OUTPUT.PUT_LINE('Remark: Outstanding');
        WHEN 'B' THEN DBMS_OUTPUT.PUT_LINE('Remark: Well Done');
        WHEN 'C' THEN DBMS_OUTPUT.PUT_LINE('Remark: Satisfactory');
        ELSE DBMS_OUTPUT.PUT_LINE('Remark: Needs Improvement');
    END CASE;
END;
/
