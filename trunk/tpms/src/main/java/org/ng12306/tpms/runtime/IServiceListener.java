package org.ng12306.tpms.runtime;

import java.util.*;

public interface IServiceListener  {

	
	void serviceInitialized(EventObject e);
	void serviceUninitialized(EventObject e);
}
