package com.google.android.datatransport.runtime;

import com.google.android.datatransport.Encoding;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class EncodedPayload {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Encoding f16832a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f16833b;

    public EncodedPayload(Encoding encoding, byte[] bArr) {
        if (encoding == null) {
            throw new NullPointerException("encoding is null");
        }
        if (bArr == null) {
            throw new NullPointerException("bytes is null");
        }
        this.f16832a = encoding;
        this.f16833b = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EncodedPayload)) {
            return false;
        }
        EncodedPayload encodedPayload = (EncodedPayload) obj;
        if (this.f16832a.equals(encodedPayload.f16832a)) {
            return Arrays.equals(this.f16833b, encodedPayload.f16833b);
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f16832a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f16833b);
    }

    public final String toString() {
        return "EncodedPayload{encoding=" + this.f16832a + ", bytes=[...]}";
    }
}
