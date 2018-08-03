package MacBook;

class ramCustomizer extends ModelCustomizer {
    Model model ;
    int ramSize ;
    ramCustomizer(Model model,int ramSize){
        this.model = model ;
        this.ramSize = ramSize ;
    }

    @Override
    String getDescription() {
        if(ramSize == 8){
            return model.getDescription() + "\n 8GB Ram " ;
        }
        else{
            return model.getDescription() + "\n 16GB Ram " ;
        }
    }

    @Override
    int getCost() {
        if(ramSize==8){
            return model.getCost() + 0 ;
        }
        else{
            return model.getCost() + 300 ;
        }
    }
}
