package com.startapp.simple.bloomfilter.parsing;

import com.startapp.simple.bloomfilter.algo.OpenBitSet;
import com.startapp.simple.bloomfilter.creation.Serializer;
import com.startapp.simple.bloomfilter.version.BloomVersion;
import com.startapp.simple.bloomfilter.version.VersionFactoryHolder;

/* JADX INFO: loaded from: classes6.dex */
public class TokenBuilder {
    public static final String TOKEN_DELIMITER = "-";
    private final Serializer serializer;
    private final VersionFactoryHolder versionFactoryHolder;

    public TokenBuilder(Serializer serializer, VersionFactoryHolder versionFactoryHolder) {
        this.versionFactoryHolder = versionFactoryHolder;
        this.serializer = serializer;
    }

    public String asToken(BloomVersion bloomVersion, OpenBitSet openBitSet, long j) {
        try {
            String strSerialize = this.serializer.serialize(openBitSet);
            return j + TOKEN_DELIMITER + bloomVersion.getVersion() + TOKEN_DELIMITER + this.versionFactoryHolder.getTokenCompression(bloomVersion).compress(strSerialize);
        } catch (Throwable unused) {
            return null;
        }
    }
}
