/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package info5100.university.example.CourseSchedule;

import java.util.ArrayList;

/**
 *
 * @author kal bugrara
 */
public class CourseLoad {
    String semester;
    ArrayList<SeatAssignment> seatassignments;
    
    public CourseLoad(String s){
        seatassignments = new ArrayList();
        semester = s;

    }
    public SeatAssignment newSeatAssignment(CourseOffer co){
        
        Seat seat = co.getEmptySeat(); // seat linked to courseoffer
        if (seat==null) return null;
        SeatAssignment sa = seat.newSeatAssignment(this);
        seatassignments.add(sa);  //add to students course 
        return sa;
    }
    
    public void registerStudent(SeatAssignment sa){
        
        
        sa.assignSeatToStudent(this);
        seatassignments.add(sa);
    }
    
    public float getSemesterScore(){ //total score for a full semeter
        float sum = 0;
        for (SeatAssignment sa: seatassignments){
            sum = sum + sa.GetCourseStudentScore();
        }
        return sum;
    }
        public ArrayList<SeatAssignment> getSeatAssignments(){
            return seatassignments;
        }

        public int getSemesterSpend(){
            int cost = 0;
            for(SeatAssignment s: seatassignments){
              cost += s.getAssociatedCourse().getCoursePrice();
            }
            return cost;
        }

        public float getAverageGPA(){
            float total = 0;
            for(SeatAssignment seatAssignment :seatassignments ){
            total = seatAssignment.getGrade() + total;

            }
            
           return total/seatassignments.size();

        }



    @Override
    public String toString() {
        String value = "";


        for(SeatAssignment s: seatassignments){
           
            value += "\n" + s.getCourseOffer() + "\n" + "Grade " + s.getGrade() + "\n";
            

        }


        return value;
    }
            
}
