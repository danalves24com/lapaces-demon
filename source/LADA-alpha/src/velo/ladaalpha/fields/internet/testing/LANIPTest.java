package velo.ladaalpha.fields.internet.testing;

import static org.junit.jupiter.api.Assertions.*;

import java.net.SocketException;
import java.util.Arrays;

import org.junit.jupiter.api.Test;

import velo.ladaalpha.fields.internet.Internet;

// TODO: Auto-generated Javadoc
/**
 * The Class LANIPTest.
 */
class LANIPTest {

	/**
	 * Test.
	 */
	@Test
	void test() {
		Internet.getLANIP();
	}
	
	/**
	 * Network scan.
	 */
	@Test
	void networkScan() {
		System.out.println(Arrays.toString(Internet.scanNetwork(1).toArray()));;
	}

}
