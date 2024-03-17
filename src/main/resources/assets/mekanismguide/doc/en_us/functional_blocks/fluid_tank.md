# Fluid Tanks
![](item:mekanism:basic_fluid_tank,mekanism:advanced_fluid_tank,mekanism:elite_fluid_tank,mekanism:ultimate_fluid_tank)

Fluid Tanks are storage blocks to store fluids. The amount of fluid (mB) a fluid tank can store is based on its tier. It will retain its contents when broken.

The tanks can fill or empty an item via the GUI. An item containing fluid will be drained (if possible), and an empty one will be filler.

## Bucket Mode
You can hold the sneak key and scroll to change Bucket Mode. If bucket mode is On, the fluid tank will act like a bucket, being able to physically place fluid (sneak right click) and scoop up fluid (right click).

However, by setting it to On, it also removes the ability to place the fluid tank. Bucket mode must be set to Off in order to place the fluid tank.

## Automation
Fluid pipes, such as the Mechanical Pipe, can be attached to any face to insert or extract fluid. Given the tank is not a full block, they will look best on the top or bottom faces

By sneak right-clicking a tank with a Configurator set to any Configurate mode, auto-output can be toggled. When enabled, fluid will automatically be ejected on the bottom face of the tank, assuming that the destination can accept the fluid. A tank will glow when auto-output is enabled.

## Fluid towers
Tanks stacked vertically will automatically push fluid upwards when full as if it were part of the same tank. To push fluid downwards in the stack, auto-eject must be enabled (Sneak + Right-Click the tanks with a configurator that is set to any green mode).
