/*******************************************************************************
 * Copyright (c) 2023 alfa and others.
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 * 
 * SPDX-License-Identifier: EPL-2.0 
 *******************************************************************************/
package org.eclipse.elk.alg.layered.nestedports;

import org.eclipse.elk.graph.ElkPort;
import org.eclipse.elk.graph.properties.IProperty;
import org.eclipse.elk.graph.properties.Property;

/**
 * @author alfa
 *
 */
public class NestedPorts {

    public static final IProperty<ElkPort> PARENT_PORT = new Property<ElkPort>("PARENT_PORT");
}
