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
 * Practical occupation of physical space-time 
 */
public interface Spacetime<F extends Number,S extends SpacetimeObject<F>>
    extends Iterable<S>
{

    public <R extends S> R get(F x, F y, F z, F t);

    public <R extends S> R put(R p);

    public <R extends S> java.lang.Iterable<R> iterable();
}
