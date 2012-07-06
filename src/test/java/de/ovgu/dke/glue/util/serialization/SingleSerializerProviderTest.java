package de.ovgu.dke.glue.util.serialization;

import java.util.List;

import de.ovgu.dke.glue.api.serialization.AbstractSerializationProviderTests;
import de.ovgu.dke.glue.api.serialization.SerializationProvider;
import de.ovgu.dke.glue.api.serialization.Serializer;

public class SingleSerializerProviderTest extends
		AbstractSerializationProviderTests {

	@Override
	public int getMaxNumOfSerializers() {
		return 1;
	}

	@Override
	public SerializationProvider getSerializationProvider(
			List<Serializer> serializers) {
		return SingleSerializerProvider.of(serializers.get(0));
	}

}