package org.eclipse.elk.alg.layered.nestedports;

import java.io.IOException;
import java.util.Iterator;

import org.eclipse.elk.alg.layered.LayeredLayoutProvider;
import org.eclipse.elk.alg.layered.options.LayeredOptions;
import org.eclipse.elk.core.AbstractLayoutProvider;
import org.eclipse.elk.core.data.LayoutMetaDataService;
import org.eclipse.elk.core.options.Direction;
import org.eclipse.elk.core.options.PortConstraints;
import org.eclipse.elk.core.options.PortSide;
import org.eclipse.elk.core.util.BasicProgressMonitor;
import org.eclipse.elk.core.util.IElkProgressMonitor;
import org.eclipse.elk.core.util.persistence.ElkGraphResourceFactory;
import org.eclipse.elk.graph.ElkEdge;
import org.eclipse.elk.graph.ElkGraphPackage;
import org.eclipse.elk.graph.ElkNode;
import org.eclipse.elk.graph.ElkPort;
import org.eclipse.elk.graph.util.ElkGraphUtil;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class SubPortTest {

    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        LayoutMetaDataService.initElkReflect();
    }

    @AfterClass
    public static void tearDownAfterClass() throws Exception {

    }

    @Before
    public void setUp() throws Exception {

    }

    @After
    public void tearDown() throws Exception {
    }
    
    @Test
    public void testPorts() throws IOException {

        ElkNode parentNode = ElkGraphUtil.createGraph();
        parentNode.setProperty(LayeredOptions.DIRECTION, Direction.RIGHT);

        ElkNode nodeA = ElkGraphUtil.createNode(parentNode);
        nodeA.setIdentifier("A");
        nodeA.setProperty(LayeredOptions.PORT_CONSTRAINTS, PortConstraints.FIXED_SIDE);
         
        ElkPort portA1 = ElkGraphUtil.createPort(nodeA);
        portA1.setIdentifier("A1");
        portA1.setProperty(LayeredOptions.PORT_SIDE, PortSide.WEST);
        
        ElkPort portA1_1 = ElkGraphUtil.createSubPort(portA1);
        portA1_1.setIdentifier("A1_1");
        ElkPort portA1_2 = ElkGraphUtil.createSubPort(portA1);
        portA1_2.setIdentifier("A1_2");
        ElkPort portA1_3 = ElkGraphUtil.createSubPort(portA1);
        portA1_3.setIdentifier("A1_3");
        
        ElkPort portA2 = ElkGraphUtil.createPort(nodeA);
        portA2.setIdentifier("A2");
        portA2.setProperty(LayeredOptions.PORT_SIDE, PortSide.WEST);
        
        ElkNode nodeB = ElkGraphUtil.createNode(parentNode);
        nodeB.setIdentifier("B");
        nodeB.setProperty(LayeredOptions.PORT_CONSTRAINTS, PortConstraints.FIXED_SIDE);
         
        ElkPort portB1 = ElkGraphUtil.createPort(nodeB);
        portB1.setIdentifier("B1");
        portB1.setProperty(LayeredOptions.PORT_SIDE, PortSide.WEST);
        
        ElkPort portB1_1 = ElkGraphUtil.createSubPort(portB1);
        portB1_1.setIdentifier("B1_1");
        ElkPort portB1_2 = ElkGraphUtil.createSubPort(portB1);
        portB1_2.setIdentifier("B1_2");
        
        ElkPort portB2 = ElkGraphUtil.createPort(nodeB);
        portB2.setIdentifier("B2");
        portB2.setProperty(LayeredOptions.PORT_SIDE, PortSide.WEST);
        
        
        ElkEdge edge1 = ElkGraphUtil.createSimpleEdge(portA1, portB1);
        ElkEdge edge2 = ElkGraphUtil.createSimpleEdge(portA1_1, portB1_1);
        
        

        ResourceSet resourceSet = new ResourceSetImpl();
        resourceSet.getPackageRegistry().put(ElkGraphPackage.eNS_URI, ElkGraphPackage.eINSTANCE);
        resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("elkg", new ElkGraphResourceFactory());
        Resource elktResource = resourceSet.createResource(org.eclipse.emf.common.util.URI.createFileURI("dummy.elkg"));
        elktResource.getContents().add(parentNode);

        // create a progress monitor
        IElkProgressMonitor progressMonitor = new BasicProgressMonitor();

        // create the layout provider
        AbstractLayoutProvider layoutProvider = new LayeredLayoutProvider();
        layoutProvider.initialize(null);

        System.out.println("\nBEFORE LAYOUT");
        TreeIterator<EObject> iterator = elktResource.getAllContents();
        while (iterator.hasNext()) {
            EObject eObject = iterator.next();
            System.out.println(eObject);
        }

        System.out.println("\nTRANSFORM");
        // perform layout on the created graph
        layoutProvider.layout(parentNode, progressMonitor);

        System.out.println("\nAFTER LAYOUT");
        iterator = elktResource.getAllContents();
        while (iterator.hasNext()) {
            EObject eObject = iterator.next();
            System.out.println(eObject);
        }

        System.out.println("Finished!");
    }

}
