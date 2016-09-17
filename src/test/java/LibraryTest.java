import static org.junit.Assert.*;
import org.junit.*;

import java.io.File;
import java.io.IOException;

import org.junit.Test;


public class LibraryTest {

	@Test
	public void test() {
		Visitor testvisitor = new Visitor();
		try {
			TestParser.parse("src/testing/Main.java",testvisitor);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Assert.assertEquals(testvisitor.getoperators(),11);
		
		
	}
	@Test
	public void test1() {
		Visitor testvisitor = new Visitor();
		TestParser tp=new TestParser();
		File inputFile= new File("src/testapp");
		try {
			TestParser.listFilesForFolder(inputFile,testvisitor);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Assert.assertEquals(testvisitor.getoperators(),1757);
		Assert.assertEquals(testvisitor.getoperands(),33792);
		Assert.assertEquals(tp.getproglength(1757, 33792), 35549.0,0.00002);
		Assert.assertEquals(tp.getprogvocab(2531.0,26.0),2557.0,0.000002);
		Assert.assertEquals(tp.getprogdiff(2531.0,26.0,33729),173.56617937,1);
		Assert.assertEquals(tp.getvol(35549.0,2557.0),402423.085,1);
		Assert.assertEquals(tp.getcalc(26.0,2531.0),28736.4111,1);
		Assert.assertEquals(tp.geteffort(173.5661793757408,402423.0853918954),6.984703742406878E7,1);
		Assert.assertEquals(tp.gettimetoprog(6.984703742406878E7),3880390.96800,1);
		Assert.assertEquals(tp.getbugs(402423.0853918954),134.1410284,1);
		
	}

}

