/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Values.test;

import java.util.ArrayList;
import physobjects.interfaces.Pallet;
import java.util.List;
import physobjects.interfaces.Container;
import physobjects.implementation.Physobjects;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author abg667
 */
public class Bounded3DimStackImplTest {
    
    public Bounded3DimStackImplTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }
//##############################################################################
    
    private static List<Pallet> initStaplePallet(int bays,int rows,int tiers){
        List<Pallet> arrayPallet = new ArrayList<Pallet>();
        int i=0;
       int elem_count = bays*rows*tiers;
        while(i<elem_count){
            Pallet np = Physobjects.pallet();
            arrayPallet.add(np);
            i++;
        }
        
        return arrayPallet;
    }
    Container a = Physobjects.container();
    
    Container b = Physobjects.container();
    List<Pallet> palletList = initStaplePallet(1, 9, 3);
        
    
    @Test
    public void test_load1() {
        
    }
    @Test
    public void test_load2() {
        
    }
    @Test
    public void test_load3() {
        
    }
    @Test
    public void test_load4() {
      
    }
    
    @Test
    public void test_loadAll() {
        assertEquals(true, b.loadAll(palletList));
    }
    
    @Test
    public void test_isEmpty() {
        assertEquals(true,  a.isEmpty());
     
    }

    @Test
    public void test_isFull() {
        assertEquals(true, b.isFull());
        
    }

    @Test
    public void test_tierIsEmpty() {
        assertEquals(true, a.tierIsEmpty(0, 0));
       
    }

    @Test
    public void test_tierIsFull() {
        assertEquals(true, b.tierIsFull(0, 0));
    }

    @Test
    public void test_contains() {
      
    }

    @Test
    public void test_containsAll() {
       
    }

    @Test
    public void test_get() {
       
    }
    

    @Test
    public void test_getAll() {
       
    }

    @Test
    public void test_locationOf() {
       
    }

    @Test
    public void test_getBoundingBox() {
        
    }
       

    @Test
    public void test_emptyMass() {
        
    
    }

    @Test
    public void test_maxMass() {
        
    }


    @Test
    public void test_printStack() {
       
    }
    
    public void test_freeSpace(){
       
    }

    

    @Test
    public void test_mass() {
     
    }

}
