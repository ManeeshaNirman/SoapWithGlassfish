package model;

import service.BDServiceImpl;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public class BDFinder {

    BDServiceImpl serviceImpl=new BDServiceImpl();

    @WebMethod
    public int calculateBD(int year,int month,int day){

        return serviceImpl.calculateDB(year, month, day);

    }


}
