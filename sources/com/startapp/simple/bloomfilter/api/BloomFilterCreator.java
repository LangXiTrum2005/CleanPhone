package com.startapp.simple.bloomfilter.api;

import com.startapp.simple.bloomfilter.algo.AlwaysNotContainsBloomContainer;
import com.startapp.simple.bloomfilter.algo.BloomContainer;
import com.startapp.simple.bloomfilter.algo.BloomContainerWithValidBitSet;
import com.startapp.simple.bloomfilter.algo.OpenBitSet;
import com.startapp.simple.bloomfilter.codec.StringUtils;
import com.startapp.simple.bloomfilter.creation.DeserializerTokenToBitSet;
import com.startapp.simple.bloomfilter.creation.Serializer;
import com.startapp.simple.bloomfilter.data.TokenData;
import com.startapp.simple.bloomfilter.parsing.TokenBuilder;
import com.startapp.simple.bloomfilter.parsing.TokenParser;
import com.startapp.simple.bloomfilter.version.BloomVersion;
import com.startapp.simple.bloomfilter.version.VersionFactoryHolder;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public class BloomFilterCreator {
    private static final String ALL_EXISTS_TOKEN = "FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF";
    private static final OpenBitSet BIT_SET_ALL_EXIST;
    private final TokenBuilder tokenBuilder;
    private final TokenParser tokenParser;
    private final VersionFactoryHolder versionFactoryHolder;

    static {
        BloomVersion bloomVersion = BloomVersion.FOUR;
        BIT_SET_ALL_EXIST = new DeserializerTokenToBitSet(bloomVersion.getNumberOfHashes(), bloomVersion.getSizeOfBucket()).convert(ALL_EXISTS_TOKEN);
    }

    public BloomFilterCreator() {
        Serializer serializer = new Serializer();
        VersionFactoryHolder versionFactoryHolder = new VersionFactoryHolder();
        this.versionFactoryHolder = versionFactoryHolder;
        this.tokenBuilder = new TokenBuilder(serializer, versionFactoryHolder);
        this.tokenParser = new TokenParser();
    }

    public static BloomFilterCreator createForTesting(TokenBuilder tokenBuilder, TokenParser tokenParser, VersionFactoryHolder versionFactoryHolder) {
        return new BloomFilterCreator(tokenBuilder, tokenParser, versionFactoryHolder);
    }

    public String createToken(BloomVersion bloomVersion, List<String> list, long j) {
        return this.tokenBuilder.asToken(bloomVersion, this.versionFactoryHolder.getBitSetHandling(bloomVersion).keysToBitSet(list), j);
    }

    public String fromKeys(BloomVersion bloomVersion, List<String> list) {
        return createToken(bloomVersion, list, System.currentTimeMillis());
    }

    public BloomContainer fromToken(String str) {
        if (StringUtils.isBlank(str)) {
            return new AlwaysNotContainsBloomContainer(null);
        }
        TokenData tokenDataFromTokenString = this.tokenParser.fromTokenString(str);
        if (tokenDataFromTokenString == null) {
            return new AlwaysNotContainsBloomContainer(null);
        }
        BloomVersion bloomVersion = tokenDataFromTokenString.getBloomVersion();
        OpenBitSet openBitSetConvert = this.versionFactoryHolder.getTokenToBitSet(bloomVersion).convert(this.versionFactoryHolder.getTokenCompression(bloomVersion).decompress(tokenDataFromTokenString.bloom()));
        return openBitSetConvert == null ? new AlwaysNotContainsBloomContainer(bloomVersion) : new BloomContainerWithValidBitSet(this.versionFactoryHolder.getBitSetHandling(bloomVersion), openBitSetConvert, bloomVersion);
    }

    public long[] hashBytesOfKey(String str) {
        return hashBytesOfKey(BloomVersion.FOUR, str);
    }

    public String tokenFromContainer(BloomContainer bloomContainer) {
        return new TokenBuilder(new Serializer(), this.versionFactoryHolder).asToken(bloomContainer.getBloomVersion(), bloomContainer.getBitSet(), System.currentTimeMillis());
    }

    public BloomContainer tokenWithAllExisting() {
        VersionFactoryHolder versionFactoryHolder = this.versionFactoryHolder;
        BloomVersion bloomVersion = BloomVersion.FOUR;
        return new BloomContainerWithValidBitSet(versionFactoryHolder.getBitSetHandling(bloomVersion), BIT_SET_ALL_EXIST, bloomVersion);
    }

    public long[] hashBytesOfKey(BloomVersion bloomVersion, String str) {
        return this.versionFactoryHolder.getBitSetHandling(bloomVersion).hashBucketsFromApplication(str);
    }

    public String fromKeys(List<String> list) {
        return createToken(BloomVersion.FOUR, list, System.currentTimeMillis());
    }

    private BloomFilterCreator(TokenBuilder tokenBuilder, TokenParser tokenParser, VersionFactoryHolder versionFactoryHolder) {
        this.tokenBuilder = tokenBuilder;
        this.tokenParser = tokenParser;
        this.versionFactoryHolder = versionFactoryHolder;
    }
}
