package galaxyraiders.core.game

import galaxyraiders.core.physics.Point2D
import galaxyraiders.core.physics.Vector2D

class Explosion(
  initialPosition: Point2D,
  initialVelocity: Vector2D,
  radius: Double,
  mass: Double,
) :
  SpaceObject("Explosion", 'O', initialPosition, initialVelocity, radius, mass)
