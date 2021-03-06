/**
 * Copyright (C) 2009 Original Authors
 *
 * This file is part of Spring ME.
 *
 * Spring ME is free software; you can redistribute it and/or modify it
 * under the terms of the GNU General Public License as published by the
 * Free Software Foundation; either version 2, or (at your option) any
 * later version.
 *
 * Spring ME is distributed in the hope that it will be useful, but
 * WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with Spring ME; see the file COPYING. If not, write to the Free
 * Software Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA
 * 02110-1301 USA.
 *
 * Linking this library statically or dynamically with other modules is
 * making a combined work based on this library. Thus, the terms and
 * conditions of the GNU General Public License cover the whole
 * combination.
 *
 * As a special exception, the copyright holders of this library give you
 * permission to link this library with independent modules to produce an
 * executable, regardless of the license terms of these independent
 * modules, and to copy and distribute the resulting executable under
 * terms of your choice, provided that you also meet, for each linked
 * independent module, the terms and conditions of the license of that
 * module. An independent module is a module which is not derived from or
 * based on this library. If you modify this library, you may extend this
 * exception to your version of the library, but you are not obligated to
 * do so. If you do not wish to do so, delete this exception statement
 * from your version.
 */
package me.springframework.di.maven;

/**
 * Styles define how instances are rendered. Currently, all they define is a
 * color. Styles will be matched to instances based on their classname. The
 * style will be applied whenever the regular expression in {@link #getExpr()}
 * matches the fully qualified classname of an instance.
 * 
 * @author Wilfred Springer (wis)
 * 
 */
public class Style {

    /**
     * The regular expression that will be applied to the fully qualified type
     * name.
     */
    private String expr;

    /**
     * The color associated to the style.
     */
    private String color;

    /**
     * Sets the regular expression used for matching the style.
     * 
     * @param expr
     *            The regular expression that will be used to match the style
     *            with an instance.
     */
    public void setExpr(String expr) {
        this.expr = expr;
    }

    /**
     * Returns the regular expression used for matching the style.
     * 
     * @return The regular expression that will be used to match the style with
     *         an instance.
     */
    public String getExpr() {
        return expr;
    }

    /**
     * Sets the color.
     * 
     * @param color
     *            The color. (A dot color name.)
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * Returns the color. (A dot color name.)
     * 
     * @return The color. (A dot color name.)
     */
    public String getColor() {
        return color;
    }

}
