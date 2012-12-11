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
package me.springframework.di.spring;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.Resource;

/**
 * Own implementation of {@link XmlBeanFactory} to read imports from class path.
 * See Spring <import resource ... />
 * @author Cyril Joui
 * @since 15 sept. 2009 (imported from my developments)
 * @since 1.1
 * @version 1.0.0
 */
public class XmlBeanFactoryWithClassLoader extends DefaultListableBeanFactory {

	/**
	 * Reader instance.
	 */
	private final XmlBeanDefinitionReader reader;

	/**
	 * Constructor from root resource and class loader.
	 * @param resource resource to load
	 * @param beanClassLoader class loader to use
	 * @throws BeansException error loading beans
	 */
	public XmlBeanFactoryWithClassLoader(Resource resource, ClassLoader beanClassLoader) throws BeansException {
		super(null);
		// Set reader class loader (to load classpath resource imports)
		reader = new XmlBeanDefinitionReader(this);
		ClassPathXmlApplicationContext resourceLoader = new ClassPathXmlApplicationContext();
		resourceLoader.setClassLoader(beanClassLoader);
		reader.setResourceLoader(resourceLoader);
		reader.loadBeanDefinitions(resource);
	}
}
