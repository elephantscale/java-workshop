package fruad_detection;

import java.util.Set;

public class InMemoryBlacklistedIPLookup implements IBlacklistedIPLookup {

	static final Set<String> blacklistedIPs = Set.of("10.10", "20.20");

	@Override
	public boolean isBlacklisted(String ip) {
		// TODO Auto-generated method stub
		return false;
	}

}
