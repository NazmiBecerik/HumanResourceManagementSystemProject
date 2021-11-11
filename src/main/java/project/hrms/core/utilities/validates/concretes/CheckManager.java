package project.hrms.core.utilities.validates.concretes;

import project.hrms.dataAccess.abstracts.EmployerDao;
import project.hrms.dataAccess.abstracts.JobSeekerDao;
import project.hrms.dataAccess.abstracts.JobTitleDao;
import project.hrms.entities.concretes.Employer;
import project.hrms.entities.concretes.JobSeeker;
import project.hrms.entities.concretes.JobTitle;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CheckManager {
    private EmployerDao employerDao;
    private JobSeekerDao jobSeekerDao;
    private Employer employer;
    private JobSeeker jobSeeker;
    private JobTitleDao jobTitleDao;
    private JobTitle jobTitle;
    public CheckManager(EmployerDao employerDao) {
        this.employerDao = employerDao;
    }
    public CheckManager(JobSeekerDao jobSeekerDao){
        this.jobSeekerDao=jobSeekerDao;
    }
    public CheckManager(JobTitleDao jobTitleDao)
    {
        this.jobTitleDao=jobTitleDao;
    }

   public boolean mailMatchCheckEmployer(String mail)
   {
       if (employerDao.findByEmail(mail)==null)
       {
           return true;
       }
       else
       {
           return false;
       }

   }
    public boolean mailMatchCheckJobSeeker(String mail)
    {
        if (jobSeekerDao.findByEmail(mail)==null)
            return true;
        else
            return false;

    }
    public boolean IdentityIdMatchCheck(String identityId)
    {
        if (jobSeekerDao.findByIdentityId(identityId)==null)
            return true;
        else
            return false;
    }

   public boolean mailRegexCheck(String mail)
   {
       String regex = "^[\\w!#$%&'*+/=?`{|}~^-]+(?:\\.[\\w!#$%&'*+/=?`{|}~^-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,6}$";
       Pattern pattern = Pattern.compile(regex);
       Matcher matcher = pattern.matcher(mail);
       if(matcher.matches())
           return true;
       else
           return false;
   }

   public boolean mernisCheck()
   {
       return true;
   }
   public boolean phoneNumberMatchCheck(String phoneNumber)
   {
       if(employerDao.findByPhoneNumber(phoneNumber)==null)
       {
           return true;
       }
       else
       {
           return false;
       }
   }

   public boolean domainCheck(String website,Employer employer)
   {
       int noktasirasi=website.indexOf(".");
       String employerWebSiteDomain=website.substring(0,noktasirasi);
       String employerMail=employer.getEmail();
       int etsirasi= employerMail.indexOf("@");
       String employerMailDomain=employer.getEmail().substring(0,etsirasi);
       if(employerMailDomain.equals(employerWebSiteDomain))
       {
           return true;
       }
       else {
           return false;
       }

      }
   // public boolean jobTitleMatchCheck(String jobTitle)
   // {
   //     if(jobTitleDao.findByTitle(jobTitle)==null)
   //     {
   //         return true;
   //     }
   //     else
   //     {
   //         return false;
   //     }
   // }
}


