/**
 * Copyright (c) 2016 Kiel University and others.
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 */
package org.eclipse.elk.graph.impl;

import org.eclipse.elk.graph.ElkGraphPackage;
import org.eclipse.elk.graph.ElkNode;
import org.eclipse.elk.graph.ElkPort;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;

import org.eclipse.emf.ecore.util.InternalEList;
import com.google.common.base.Strings;
import java.util.Collection;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Elk Port</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 * <li>{@link org.eclipse.elk.graph.impl.ElkPortImpl#getParent <em>Parent</em>}</li>
 * <li>{@link org.eclipse.elk.graph.impl.ElkPortImpl#getSubPorts <em>Sub Ports</em>}</li>
 * <li>{@link org.eclipse.elk.graph.impl.ElkPortImpl#getParentPort <em>Parent Port</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ElkPortImpl extends ElkConnectableShapeImpl implements ElkPort {
    /**
     * The cached value of the '{@link #getSubPorts() <em>Sub Ports</em>}' containment reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #getSubPorts()
     * @generated
     * @ordered
     */
    protected EList<ElkPort> subPorts;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    protected ElkPortImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return ElkGraphPackage.Literals.ELK_PORT;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated false
     */
    @Override
    public ElkNode getParent() {

        if (this.eContainerFeatureID() != ElkGraphPackage.ELK_PORT__PARENT)
            return null;

        ElkPortImpl currentPort = this;
        while (currentPort.eInternalContainer() instanceof ElkPort) {
            currentPort = (ElkPortImpl) eInternalContainer();
        }
        return (ElkNode) currentPort.eInternalContainer();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public NotificationChain basicSetParent(ElkNode newParent, NotificationChain msgs) {
        msgs = eBasicSetContainer((InternalEObject) newParent, ElkGraphPackage.ELK_PORT__PARENT, msgs);
        return msgs;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public void setParent(ElkNode newParent) {
        if (newParent != eInternalContainer()
                || (eContainerFeatureID() != ElkGraphPackage.ELK_PORT__PARENT && newParent != null)) {
            if (EcoreUtil.isAncestor(this, newParent))
                throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
            NotificationChain msgs = null;
            if (eInternalContainer() != null)
                msgs = eBasicRemoveFromContainer(msgs);
            if (newParent != null)
                msgs = ((InternalEObject) newParent).eInverseAdd(this, ElkGraphPackage.ELK_NODE__PORTS, ElkNode.class,
                        msgs);
            msgs = basicSetParent(newParent, msgs);
            if (msgs != null)
                msgs.dispatch();
        } else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ElkGraphPackage.ELK_PORT__PARENT, newParent,
                    newParent));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EList<ElkPort> getSubPorts() {
        if (subPorts == null) {
            subPorts = new EObjectContainmentWithInverseEList<ElkPort>(ElkPort.class, this,
                    ElkGraphPackage.ELK_PORT__SUB_PORTS, ElkGraphPackage.ELK_PORT__PARENT_PORT);
        }
        return subPorts;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public ElkPort getParentPort() {
        if (eContainerFeatureID() != ElkGraphPackage.ELK_PORT__PARENT_PORT)
            return null;
        return (ElkPort) eInternalContainer();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public NotificationChain basicSetParentPort(ElkPort newParentPort, NotificationChain msgs) {
        msgs = eBasicSetContainer((InternalEObject) newParentPort, ElkGraphPackage.ELK_PORT__PARENT_PORT, msgs);
        return msgs;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public void setParentPort(ElkPort newParentPort) {
        if (newParentPort != eInternalContainer()
                || (eContainerFeatureID() != ElkGraphPackage.ELK_PORT__PARENT_PORT && newParentPort != null)) {
            if (EcoreUtil.isAncestor(this, newParentPort))
                throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
            NotificationChain msgs = null;
            if (eInternalContainer() != null)
                msgs = eBasicRemoveFromContainer(msgs);
            if (newParentPort != null)
                msgs = ((InternalEObject) newParentPort).eInverseAdd(this, ElkGraphPackage.ELK_PORT__SUB_PORTS,
                        ElkPort.class, msgs);
            msgs = basicSetParentPort(newParentPort, msgs);
            if (msgs != null)
                msgs.dispatch();
        } else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ElkGraphPackage.ELK_PORT__PARENT_PORT, newParentPort,
                    newParentPort));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
        case ElkGraphPackage.ELK_PORT__PARENT:
            if (eInternalContainer() != null)
                msgs = eBasicRemoveFromContainer(msgs);
            return basicSetParent((ElkNode) otherEnd, msgs);
        case ElkGraphPackage.ELK_PORT__SUB_PORTS:
            return ((InternalEList<InternalEObject>) (InternalEList<?>) getSubPorts()).basicAdd(otherEnd, msgs);
        case ElkGraphPackage.ELK_PORT__PARENT_PORT:
            if (eInternalContainer() != null)
                msgs = eBasicRemoveFromContainer(msgs);
            return basicSetParentPort((ElkPort) otherEnd, msgs);
        }
        return super.eInverseAdd(otherEnd, featureID, msgs);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
        case ElkGraphPackage.ELK_PORT__PARENT:
            return basicSetParent(null, msgs);
        case ElkGraphPackage.ELK_PORT__SUB_PORTS:
            return ((InternalEList<?>) getSubPorts()).basicRemove(otherEnd, msgs);
        case ElkGraphPackage.ELK_PORT__PARENT_PORT:
            return basicSetParentPort(null, msgs);
        }
        return super.eInverseRemove(otherEnd, featureID, msgs);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
        switch (eContainerFeatureID()) {
        case ElkGraphPackage.ELK_PORT__PARENT:
            return eInternalContainer().eInverseRemove(this, ElkGraphPackage.ELK_NODE__PORTS, ElkNode.class, msgs);
        case ElkGraphPackage.ELK_PORT__PARENT_PORT:
            return eInternalContainer().eInverseRemove(this, ElkGraphPackage.ELK_PORT__SUB_PORTS, ElkPort.class, msgs);
        }
        return super.eBasicRemoveFromContainerFeature(msgs);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
        case ElkGraphPackage.ELK_PORT__PARENT:
            return getParent();
        case ElkGraphPackage.ELK_PORT__SUB_PORTS:
            return getSubPorts();
        case ElkGraphPackage.ELK_PORT__PARENT_PORT:
            return getParentPort();
        }
        return super.eGet(featureID, resolve, coreType);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public void eSet(int featureID, Object newValue) {
        switch (featureID) {
        case ElkGraphPackage.ELK_PORT__PARENT:
            setParent((ElkNode) newValue);
            return;
        case ElkGraphPackage.ELK_PORT__SUB_PORTS:
            getSubPorts().clear();
            getSubPorts().addAll((Collection<? extends ElkPort>) newValue);
            return;
        case ElkGraphPackage.ELK_PORT__PARENT_PORT:
            setParentPort((ElkPort) newValue);
            return;
        }
        super.eSet(featureID, newValue);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public void eUnset(int featureID) {
        switch (featureID) {
        case ElkGraphPackage.ELK_PORT__PARENT:
            setParent((ElkNode) null);
            return;
        case ElkGraphPackage.ELK_PORT__SUB_PORTS:
            getSubPorts().clear();
            return;
        case ElkGraphPackage.ELK_PORT__PARENT_PORT:
            setParentPort((ElkPort) null);
            return;
        }
        super.eUnset(featureID);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public boolean eIsSet(int featureID) {
        switch (featureID) {
        case ElkGraphPackage.ELK_PORT__PARENT:
            return getParent() != null;
        case ElkGraphPackage.ELK_PORT__SUB_PORTS:
            return subPorts != null && !subPorts.isEmpty();
        case ElkGraphPackage.ELK_PORT__PARENT_PORT:
            return getParentPort() != null;
        }
        return super.eIsSet(featureID);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated NOT
     */
    @Override
    public String toString() {
        if (eIsProxy())
            return super.toString();

        StringBuilder builder = new StringBuilder("ElkPort");
        // Use identifier or labels
        String id = getIdentifier();
        if (!Strings.isNullOrEmpty(id)) {
            builder.append(" \"").append(id).append("\"");
        } else if (getLabels().size() > 0) {
            String text = getLabels().get(0).getText();
            if (!Strings.isNullOrEmpty(text)) {
                builder.append(" \"").append(text).append("\"");
            }
        }
        // position and dimension
        builder.append(" (").append(x).append(",").append(y).append(" | ").append(width).append(",").append(height)
                .append(")");

        return builder.toString();
    }

} // ElkPortImpl
