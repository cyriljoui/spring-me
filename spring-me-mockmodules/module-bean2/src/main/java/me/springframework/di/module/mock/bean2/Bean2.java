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
package me.springframework.di.module.mock.bean2;

/**
 * Bean2 mock implementation.
 * Do nothing but depends on bean1 object.
 * And implement initialize / destroy methods.
 * @author Cyril Joui
 * @version %I%, %G%
 * @since 1.1
 */
public class Bean2 {

	/**
	 * Bean1 object reference.
	 */
	private Object bean1;

	/**
	 * @param bean1 the bean1 to set
	 */
	public void setBean1(Object bean1) {
		this.bean1 = bean1;
	}

	/**
	 * Init method.
	 */
	public void initialize() {
		System.out.println("bean1 reference: " + bean1);
	}

	/**
	 * Destroy method.
	 */
	public void destroy() {
		bean1 = null;
	}
}
