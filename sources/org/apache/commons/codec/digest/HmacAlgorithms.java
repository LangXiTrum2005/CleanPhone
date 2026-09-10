package org.apache.commons.codec.digest;

/* JADX INFO: loaded from: classes7.dex */
public enum HmacAlgorithms {
    /* JADX INFO: Fake field, exist only in values array */
    HMAC_MD5("HmacMD5"),
    /* JADX INFO: Fake field, exist only in values array */
    HMAC_SHA_1("HmacSHA1"),
    /* JADX INFO: Fake field, exist only in values array */
    HMAC_SHA_224("HmacSHA224"),
    /* JADX INFO: Fake field, exist only in values array */
    HMAC_SHA_256("HmacSHA256"),
    /* JADX INFO: Fake field, exist only in values array */
    HMAC_SHA_384("HmacSHA384"),
    /* JADX INFO: Fake field, exist only in values array */
    HMAC_SHA_512("HmacSHA512");

    public final String X;

    HmacAlgorithms(String str) {
        this.X = str;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.X;
    }
}
