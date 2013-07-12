import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;
import static org.mockito.Matchers.any;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.never;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.verifyNoMoreInteractions;
import static org.mockito.Mockito.when;

import java.util.List;
import java.util.Observable;
import java.util.Observer;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import org.junit.Test;

public class MinhaThreadTestWithMock {
	private int indiceInicial, numeroThreads, indiceMaximo;
	private Observer mockObserver;
	private MinhaThread m1;

	@Before
	public void setUp() {
		m1 = new MinhaThread(1, 1, 100);
		mockObserver = mock(Observer.class);
	}
	
	@After
	public void tearDown() {
		//m1.deleteObserver(mockObserver);
	}

	@Test
	public void test() {
		fail("Not yet implemented");
	}

}
