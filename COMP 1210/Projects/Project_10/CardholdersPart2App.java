import java.io.FileNotFoundException;

/**
 * Program to print out a report of Cardholder accounts from 
 *    read in file.
 * 
 * Project 10 
 * @author Kevin Bumgarner - COMP - 1210 - 003
 * @version November 15th, 2018 
 */

public class CardholdersPart2App {

// ********** //
// Main       //
// ********** //

/**
 * Main method generates reports based on Cardholder accounts read in.
 *
 * @param args command line arguments - USED
 * @throws FileNotFoundException if file not found 
 */ 


   public static void main(String[] args) throws FileNotFoundException {
   
      if (args.length == 0) {
         System.out.print("File name expected as command line argument.\n" 
            + "Program ending.");
      }
      
      else {
         
         // Create processor object and read in file
         CardholderProcessor cP = new CardholderProcessor();
         cP.readCardholderFile(args[0]);
         
         // Print normal report 
         String reportNorm = cP.generateReport();
         System.out.print(reportNorm);
         
         // Print report based off name 
         String reportName = cP.generateReportByName();
         System.out.print(reportName);
         
         // Print report based off current balance 
         String reportCB = cP.generateReportByCurrentBalance();
         System.out.print(reportCB);
      }
   }
}