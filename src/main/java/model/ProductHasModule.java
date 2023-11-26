package model;

public class ProductHasModule {
    private long id;
    private Product product;

    private Module module;

    public ProductHasModule(long id, Product product, Module module) {
        this.id = id;
        this.product = product;
        this.module = module;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Module getModule() {
        return module;
    }

    public void setModule(Module module) {
        this.module = module;
    }


}
