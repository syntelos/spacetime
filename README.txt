
  This package defines interfaces common to spacetime indeces.

  Spacetime index

    A spacetime index is a spatial data collection or repository, and is
    useful for coordinate data applications such as hardware data base
    or collision detection.

    A spacetime index is an N dimensional space for N in two, three, or
    four.  The cases of N on zero or one have no or little utility.


  Spacetime application interfaces

    The following interfaces represent a "space time" index in X,Y,Z,T.

      SpacetimeObject
      SpacetimeFrame
      Spacetime

        In the most general case, a SpacetimeFrame class is a set of
        parameters and a Spacetime class is a data service.

        In the simplest case, the primary storage interfaces may be
        implemented by one class that is both object and container.  In
        another case, two classes define an object and container.

      SpacetimeBounds
      SpacetimeMotion

        Complex properties of Spacetime Object.


See also

  http://github.com/syntelos/spacetime-standalone
  http://github.com/syntelos/spacetime-standalone-airfoil
