package testeSleep;

import static org.junit.Assert.fail;
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

import java.util.Observer;

import org.junit.Test;

public class SleeperTest {
	private Sleeper s1;
	private Observer mockObserver;

	@Before
	public void setUp() {
		s1 = new Sleeper();
		mockObserver = mock(Observer.class);
	}

	@Test
	public void test() {
		fail("Not yet implemented");
	}

}
