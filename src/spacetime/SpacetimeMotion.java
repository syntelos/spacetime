/*
 * Spacetime
 * Copyright (C) 2013, John Pritchard.
 * 
 * This program is free software: you can redistribute it and/or
 * modify it under the terms of the GNU General Public License as
 * published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful, but
 * WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see
 * <http://www.gnu.org/licenses/>.
 */
package spacetime;

/**
 * Instantaneous motion
 */
public interface SpacetimeMotion<F extends Number>
{
    public F getSpacetimeT();

    public F getSpacetimeDeltaX(F dt);

    public F getSpacetimeDX1();
    public F getSpacetimeDX2();
    public F getSpacetimeDX3();

    public F getSpacetimeDeltaY(F dt);

    public F getSpacetimeDY1();
    public F getSpacetimeDY2();
    public F getSpacetimeDY3();

    public F getSpacetimeDeltaZ(F dt);

    public F getSpacetimeDZ1();
    public F getSpacetimeDZ2();
    public F getSpacetimeDZ3();

}
