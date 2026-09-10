package com.startapp.simple.bloomfilter.data;

import com.startapp.simple.bloomfilter.version.BloomVersion;
import java.io.Serializable;

/* JADX INFO: loaded from: classes6.dex */
public class TokenData implements Serializable {
    private static final long serialVersionUID = 1261418233150941470L;
    private final String bloom;
    private final long timestamp;
    private final BloomVersion version;

    public TokenData(BloomVersion bloomVersion, long j, String str) {
        this.version = bloomVersion;
        this.timestamp = j;
        this.bloom = str;
    }

    private boolean differentBloom(TokenData tokenData) {
        return !this.version.substringFromBloom(this.bloom).equals(tokenData.version.substringFromBloom(tokenData.bloom()));
    }

    private boolean isNewerByTime(TokenData tokenData) {
        return this.timestamp - tokenData.timestamp > 0;
    }

    private boolean isNewerByVersion(TokenData tokenData) {
        return this.version.ordinal() > tokenData.version.ordinal();
    }

    public String bloom() {
        return this.bloom;
    }

    public BloomVersion getBloomVersion() {
        return this.version;
    }

    public long timestamp() {
        return this.timestamp;
    }

    public String toString() {
        return String.format("TokenData [version=%s, timestamp=%s, bloom=%s]", this.version, Long.valueOf(this.timestamp), this.bloom);
    }

    public String version() {
        return this.version.getVersion();
    }

    public boolean wasModified(TokenData tokenData) {
        if (!this.version.equals(tokenData.version)) {
            return isNewerByVersion(tokenData);
        }
        if (isNewerByTime(tokenData)) {
            return differentBloom(tokenData);
        }
        return false;
    }
}
