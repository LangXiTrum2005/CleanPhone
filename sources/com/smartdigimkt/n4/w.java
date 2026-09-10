package com.smartdigimkt.n4;

import android.net.Uri;
import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
public final class w implements h {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final h f37071b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.smartdigimkt.p4.v f37072c;
    private final int d;

    public w(h hVar, com.smartdigimkt.p4.v vVar, int i2) {
        this.f37071b = (h) com.smartdigimkt.p4.a.a(hVar);
        this.f37072c = (com.smartdigimkt.p4.v) com.smartdigimkt.p4.a.a(vVar);
        this.d = i2;
    }

    @Override // com.smartdigimkt.n4.h
    public long a(k kVar) throws IOException {
        this.f37072c.d(this.d);
        return this.f37071b.a(kVar);
    }

    @Override // com.smartdigimkt.n4.h
    public Uri c() {
        return this.f37071b.c();
    }

    @Override // com.smartdigimkt.n4.h
    public void close() throws IOException {
        this.f37071b.close();
    }

    @Override // com.smartdigimkt.n4.h
    public int a(byte[] bArr, int i2, int i3) throws IOException {
        this.f37072c.d(this.d);
        return this.f37071b.a(bArr, i2, i3);
    }
}
