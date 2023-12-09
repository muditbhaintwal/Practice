package org.mudit.dsa;

import java.util.Arrays;

/**
 * Given a list of N students, every student is marked for M subjects. Each student is denoted by an index value.
 * Their teacher Ms. Margaret must ignore the marks of any 1 subject for every student.
 * For this she decides to ignore the subject which has the lowest class average.
 * Your task is to help her find that subject, calculate the total marks of each student in all the other subjects and then finally return the
 * array of the total marks scored by each student.
 *
 *
 *
 * Input Specification:
 * input1:
 * An integer value N denoting number of students
 *
 * input2:
 * An integer value M denoting number of subjects
 *
 * input3:
 * A 2-D integer array of size N'M containing the marks of all students in each subject.
 *
 * Output Specification:
 *
 * Return an integer array of size N containing the total marks of each student afte deducting the score for that one subject.
 *
 *
 *
 *
 * Example 1:
 * INPUT
 * 3 5
 * 75 76 65 87 87
 * 78 76 68 56 89
 * 67 87 78 77 65
 *
 * OUTPUT
 * 325 299 296
 */

public class ReportCard {

    public static void main(String[] args) {
        int subj = 5;
        int students = 3;
        //int[][] stdMarks = new int[3][5];
        int[][] stdMarks = {
                {500, 420, 130, 401, 350},
                {400, 410, 310, 400, 250},
                {400, 430, 350, 405, 150}
        };

        int avgMarksPerSubj[] = avgMarsPerStudentExcludingLeastMarkSub(students, subj, stdMarks);

    }

    private static int[] avgMarsPerStudentExcludingLeastMarkSub(int students, int subj, int[][] stdMarks) {
        int[] result = new int[students];
        int leastNumberSub = 0;
        int leastNumSubIndex = 0;
        // find least average subject column index.
        for (int i = 0; i < subj; i++) {
            int subWiseSum = 0;

            for (int j = 0; j < students; j++) {
                subWiseSum = subWiseSum + stdMarks[j][i];
            }

            if (leastNumberSub == 0 || subWiseSum < leastNumberSub) {
                leastNumberSub = subWiseSum;
                leastNumSubIndex = i;
            }
        }

        System.out.println("least num sub index " + leastNumSubIndex);

        // sum column wise subject excluding least number subject index

        for (int i = 0; i < students; i++) {
            int preStudentMarks = 0;
            for (int j = 0; j < subj && (j != leastNumSubIndex); j++) {
                preStudentMarks = preStudentMarks + stdMarks[i][j];
            }

            result[i] = preStudentMarks;
        }
        Arrays.stream(result).forEach(System.out::println);
        return result;
    }


}
