public interface SceneObjects {

    // sceneObjects implement methods here so they can be automatically looped
    public boolean intersectionDiscard(Ray ray);
    public boolean intersectionCheck(Ray ray);
    public int getObjectID();
    public double getPosX();
    public double getPosY();
    public double getPosZ();

}

