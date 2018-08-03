package OnlinePackage;

class PackageFactory {
    HolidayPackage getPackage(String option){
        if(option.equalsIgnoreCase("Student"))
        {
            return new StudentPackage() ;
        }
        if(option.equalsIgnoreCase("Business")){
            return new BusinessPackage() ;
        }
        return null ;
    }
}
