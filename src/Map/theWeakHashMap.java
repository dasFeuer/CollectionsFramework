package Map;

import java.util.Map;
import java.util.WeakHashMap;

class Image {
    private final String name;

    public Image(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}public class theWeakHashMap {
    public static void main(String[] args) {
        WeakHashMap<String, Image> imageCache = new WeakHashMap<>();
        loadCache(imageCache);
        System.out.println(imageCache);
        System.gc();
        simulateApplicationRunning();
        System.out.println("Cache after running (some entries may be cleared): " + imageCache);
    }

    public static void loadCache(Map<String, Image> imageCache){
        String a1 = "image1";
        String a2 = "image2";
        imageCache.put(a1, new Image("Image 1"));
        imageCache.put(a2, new Image("Image 2"));
    }

    private static void simulateApplicationRunning(){
        try{
            System.out.println("Simulating application running......");
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
