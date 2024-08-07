I'm trying to make a Pathtracer in Java. Nothing that hasn't been done before :)
Global Illuminiation and Bounding Volume Heirarchys (BVH) are now implemented!

This project has no dependencies. If you clone it you should be able to built it easily.

BVH is approximately a speed up of:
1. Primary Rays: ~22 times faster
2. Secondary Rays: 2 times faster
   - Strongly depends on the ray step size (precision) and distance between objects. For larger scenes it could easily be 20 or 40 times faster.

![room v13 hires 2500 rays](https://github.com/user-attachments/assets/d193faab-f5e2-4a45-bfa5-da8864d12166)

![room v12 ASCII](https://github.com/Fullyverified/ASCII_PathTracer/assets/138776324/ff3a5337-c5ff-42c6-b8fa-b449b0a4eb01)
Downsampling makes text look weird. Fullscreen it :)

Done:
1. Create ray and sphere objects.
2. Give the ray a positon and a direction vector.
3. Normalise the direction vector.
4. Discard the sphere if the renderlogic.Ray has no intersection points.
5. If the ray will intersect, march the ray until it intersects.
6. Add an interface that runs intersectionCheck() for each object added to the scene.
7. End the ray if it finds an intersection
8. Store the intersection location as part of the ray object.
9. Create more than one ray, such that each ray is a pixel of the camera.
10. Print (render) the final output :)
11. Spawn a new ray at the intersection with a random bounce direction
12. Create a lookup table for values of brightness and their corresponding character: . . , : ; * X # @
13. Change the order of operations so that the first bounce, second bounce, third bounce etc is calculated for a pixel, then move onto the next pixel.
    Instead of doing for the first bounce for each pixel, then moving onto the second bounce etc.
    This is to truly make each pixel an independent entity to enable multi-threading in the future.
14. Completely reorganised the render thread. Method now works for an arbitrary number of bounces.
15. Cubes!
16. Add the possibility to output actual pixel values instead of ACSCII
17. Refresh the screen as rays continue to be calculated
18. Change ray bounce direction to be biased by a roughness parameter so that specular lighting becomes possible
19. Implemented colour in the form of RGB (0 -> 255)
20. Implemented cosine weighted hemisphere importance sampling
21. BVH (bounding volume hierarchy) now implemented!
22. Implemented basic denoiser. Takes weighted average of neirhbouring pixels. Not amazing by any stretch.
23. Implemented refraction. Currently only supports Sphere. Does not support roughness parameter except for total internal reflection. Will fix later.

TODO LIST OF THINGS TODO:
1. Add controls for camera or objects
2. Add local rotation for objects
3. Ability to import objects defined by vertices.
4. Textures
5. Rebuild in C++ with multi-threading
6. Vulkan?

I have attempted multithreading several times now, and found it's either way slower or just doesn't work. Probably beyond the capability of a first year xD
