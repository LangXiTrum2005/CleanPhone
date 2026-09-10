package com.smartdigimkt.n4;

import android.net.Uri;
import android.util.Base64;
import com.smartdigimkt.p4.f0;
import java.io.IOException;
import java.net.URLDecoder;

/* JADX INFO: loaded from: classes4.dex */
public final class f implements h {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f36993e = "data";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private k f36994b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f36995c;
    private byte[] d;

    @Override // com.smartdigimkt.n4.h
    public long a(k kVar) throws IOException {
        this.f36994b = kVar;
        Uri uri = kVar.f37004a;
        String scheme = uri.getScheme();
        if (!"data".equals(scheme)) {
            throw new com.smartdigimkt.w3.t(android.support.v4.media.a.C("Unsupported scheme: ", scheme));
        }
        String[] strArrA = f0.a(uri.getSchemeSpecificPart(), ",");
        if (strArrA.length != 2) {
            throw new com.smartdigimkt.w3.t(android.support.v4.media.a.k(uri, "Unexpected URI format: "));
        }
        String str = strArrA[1];
        if (strArrA[0].contains(";base64")) {
            try {
                this.d = Base64.decode(str, 0);
            } catch (IllegalArgumentException e2) {
                throw new com.smartdigimkt.w3.t(android.support.v4.media.a.C("Error while parsing Base64 encoded string: ", str), e2);
            }
        } else {
            this.d = URLDecoder.decode(str, "US-ASCII").getBytes();
        }
        return this.d.length;
    }

    @Override // com.smartdigimkt.n4.h
    public Uri c() {
        k kVar = this.f36994b;
        if (kVar != null) {
            return kVar.f37004a;
        }
        return null;
    }

    @Override // com.smartdigimkt.n4.h
    public void close() throws IOException {
        this.f36994b = null;
        this.d = null;
    }

    @Override // com.smartdigimkt.n4.h
    public int a(byte[] bArr, int i2, int i3) {
        if (i3 == 0) {
            return 0;
        }
        int length = this.d.length - this.f36995c;
        if (length == 0) {
            return -1;
        }
        int iMin = Math.min(i3, length);
        System.arraycopy(this.d, this.f36995c, bArr, i2, iMin);
        this.f36995c += iMin;
        return iMin;
    }
}
