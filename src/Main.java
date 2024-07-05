import java.util.ArrayList;
import java.util.List;

public class Main {

    public static int RenderResolutionX = 400;
    public static int aspectX = 4;
    public static int aspectY = 3;
    public static int fov = 60;
    public static int frameTime = 16; // Milliseconds
    public static int raysPerPixel = 1200;
    public static int bouncesPerRay = 1;
    public static boolean ASCIIMode = false;

    public static void main(String[] args) {

        List<SceneObjects> sceneObjectsList = new ArrayList<>();

        sceneObjectsList.add(new Sphere(7, 1.25, 0, 1,1,1,1));
        sceneObjectsList.add(new AABCubeCenter(7, -1.25, 0, 1,1,1, 1));

        //sceneObjectsList.add(new SphereLight(3, 0,2, 1,40,1));
        sceneObjectsList.add(new SphereLight(3, 0,2, 1,40,40,40,1,1,1));

        sceneObjectsList.add(new AABCubeBounds(13, 14, -12, 12,-12,12,1));

        Camera cam = new Camera(1, RenderResolutionX, fov, aspectX, aspectY, 0,0,-3.5, 0.75, 0, 0.25, 0, 1, 0);

        cam.directionVector();
        cam.upVector();
        cam.rightVector();
        cam.imagePlane();

        //RenderSingleThreaded renderSingleThreaded = new RenderSingleThreaded();
        RenderSingleThreadedRGB renderSingleThreaded = new RenderSingleThreadedRGB();

        renderSingleThreaded.computePixels(sceneObjectsList, cam, raysPerPixel, bouncesPerRay, frameTime, ASCIIMode);

        //RenderMultiThreaded renderMultiThreaded = new RenderMultiThreaded();
        //renderMultiThreaded.computePixels(sceneObjectsList, cam, 6000, 4);
    }
}