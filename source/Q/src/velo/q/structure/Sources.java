package velo.q.structure;

import velo.q.structure.data.Cameras;
import velo.q.structure.data.Finance;
import velo.q.structure.data.Nasa;
import velo.q.structure.data.Opensky;
import velo.q.structure.data.Who;
import velo.q.structure.data.WorldBank;

public class Sources {
	public static Source[] getSoruces() {
		return new Source[] { new Cameras(), new Opensky(), new Finance(), new Nasa(), new WorldBank(), new Who() };
	};
}