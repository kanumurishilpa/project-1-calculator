package kanumuri.shilpa.caluclator;

import kanumuri.shilpa.caluclator.Options.SimpleCaluclations;

/**
 * Created by shilpakanumuri on 1/16/17.
 */
public class SelectOptions {

   public boolean askNextNumber(String selected){

       boolean askforNextNumber = true;

       for (Options.OneInputOperations options : Options.OneInputOperations.values()){

           if(options.name().equalsIgnoreCase(selected)){
               askforNextNumber = false;
           }

       }

       return askforNextNumber;
   }

}
