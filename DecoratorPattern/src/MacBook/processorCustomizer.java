package MacBook;

class processorCustomizer extends ModelCustomizer {
    Model model ;
    String processorModel ;
    processorCustomizer(Model model,String processorModel){
        this.model = model ;
        this.processorModel = processorModel ;
    }

    @Override
    String getDescription() {
        if(processorModel.equals("i5")){
            return model.getDescription() + "\n Core i5 " ;
        }
        else{
            return model.getDescription() + "\n Core i7 " ;
        }
    }

    @Override
    int getCost() {
        if(processorModel.equals("i5")){
            return model.getCost() + 0 ;
        }
        else{
            return model.getCost() + 300 ;
        }
    }
}
