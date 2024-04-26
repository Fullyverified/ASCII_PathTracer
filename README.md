I'm trying to make an Ascii Raytracer. Nothing that hasn't been done before :)

Done:
1. Create ray and sphere objects.
2. Give the ray a positon and a direction vector.
3. Normalise the direction vector.
4. Discard the sphere if the Ray has no intersection points.
5. If the ray will intersect, march the ray until it intersects.
6. Add an interface that runs intersectionCheck() for each object added to the scene.
7. End the ray if it finds an intersection

TODO:
1. Store the intersection location as part of the ray object.
2. Create more than one ray, such that each ray is a pixel of the camera.
4. Spawn a ray new ray at the intersection location to simulate light bounces
5. Create a lookup table for values of brightess and their corresponding character, e.g. . , : ; / % # @