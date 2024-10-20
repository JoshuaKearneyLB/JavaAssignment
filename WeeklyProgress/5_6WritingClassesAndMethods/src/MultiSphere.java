public class MultiSphere {
    public static void main(String[] args){

        Sphere sphere1 = new Sphere(3);
        sphere1.getVolume();
        sphere1.getSurfaceArea();
        System.out.println(sphere1.toString());
        sphere1.updateDiameter();

        Sphere sphere2 = new Sphere(20);
        System.out.println("Sphere 2 volume = " + sphere2.getVolume());

    }
    


}
