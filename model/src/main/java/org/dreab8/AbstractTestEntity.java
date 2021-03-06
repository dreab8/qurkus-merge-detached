/*
 * Hibernate, Relational Persistence for Idiomatic Java
 *
 * License: GNU Lesser General Public License (LGPL), version 2.1 or later
 * See the lgpl.txt file in the root directory or http://www.gnu.org/licenses/lgpl-2.1.html
 */
package org.dreab8;

import javax.persistence.Entity;

/**
 * @author Andrea Boriero
 */
public abstract class AbstractTestEntity {
	public abstract long getId();

	public abstract void setId(long id);

}
