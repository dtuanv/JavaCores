package Stream;

import model.Module;
import model.Product;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

public class AnyMatchEx{

    public static void main(String args[]){
        Set<Module> moduleSet = createModuleSet();

        Set<Module> moduleSetToSave = getModuleSetToSave();

        Product product = new Product(1,"aop", moduleSet);

        System.out.println("size: Before "+product.getModuleSet().size());


        updateModuleSetInProduct(product, moduleSetToSave);

        System.out.println("size: "+product.getModuleSet().size());
        product.getModuleSet().stream()
                .forEach
                        (m -> System.out.println(
                                m.getName() + " nameIntern: "+m.getNameIntern()));

    }

    private static void updateModuleSetInProduct(Product product, Set<Module> moduleSetToSave) {
        moduleSetToSave.stream().forEach(moduleToSave -> updateModule(moduleToSave,product));
    }

    private static void updateModule(Module moduleToSave,Product product) {
        Optional<Module> findModule = product.getModuleSet().stream()
                .filter( m -> m.getId() == moduleToSave.getId()).findAny();
        if(findModule.isPresent()){
            findModule.get().setName(moduleToSave.getName());
            findModule.get().setNameIntern(moduleToSave.getNameIntern());
        }else{
            System.out.println("add");
            product.getModuleSet().add(moduleToSave);
        }

    }

    private static Set<Module> getModuleSetToSave() {
        Set<Module> moduleSetToSave = new HashSet<>();
        moduleSetToSave.add(new Module(1,"ap", "iAp"));
        moduleSetToSave.add(new Module(2,"kl","iKl"));
        moduleSetToSave.add(new Module(3,"ps","iPs"));
        moduleSetToSave.add(new Module(4,"tk","iTk"));

        return moduleSetToSave;
    }

    private static Set<Module> createModuleSet() {
        Set<Module> moduleSet = new HashSet<>();
        moduleSet.add(new Module(1,"ap"));
        moduleSet.add(new Module(2,"kl"));
        moduleSet.add(new Module(3,"ps"));
        return moduleSet;
    }

}
