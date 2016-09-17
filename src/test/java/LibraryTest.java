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
		Assert.assertEquals(tp.getproglength(1757, 3), 1760.0,0.00002);
		
	}

}

