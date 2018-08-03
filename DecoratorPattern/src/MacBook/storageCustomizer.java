package MacBook;

public class storageCustomizer extends ModelCustomizer {
    Model model ;
    int storageSize ;
    storageCustomizer(Model model,int storageSize){
        this.model = model ;
        this.storageSize = storageSize ;
    }

    @Override
    String getDescription() {
        if(storageSize == 128){
            return model.getDescription() + "\n Storage 128GB " ;
        }
        else if(storageSize == 256){
            return model.getDescription() + "\n Storage 256GB " ;
        }
        else{
            return model.getDescription() + "\n Storage 512GB " ;
        }
    }

    @Override
    int getCost() {
        if(storageSize == 128){
            return model.getCost() + 0 ;
        }
        else if(storageSize == 256){
            return model.getCost() + 200 ;
        }
        else{
            return model.getCost() + 400 ;
        }
    }
}
