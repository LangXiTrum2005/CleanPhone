package com.smartdigimkt.n4;

import android.net.Uri;
import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
public final class z implements h {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final h f37081b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final g f37082c;
    private boolean d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f37083e;

    public z(h hVar, g gVar) {
        this.f37081b = (h) com.smartdigimkt.p4.a.a(hVar);
        this.f37082c = (g) com.smartdigimkt.p4.a.a(gVar);
    }

    @Override // com.smartdigimkt.n4.h
    public long a(k kVar) throws IOException {
        long jA = this.f37081b.a(kVar);
        this.f37083e = jA;
        if (jA == 0) {
            return 0L;
        }
        if (kVar.f37007e == -1 && jA != -1) {
            kVar = new k(kVar.f37004a, kVar.f37006c, kVar.d, jA, kVar.f, kVar.g);
        }
        this.d = true;
        this.f37082c.a(kVar);
        return this.f37083e;
    }

    @Override // com.smartdigimkt.n4.h
    public Uri c() {
        return this.f37081b.c();
    }

    @Override // com.smartdigimkt.n4.h
    public void close() throws IOException {
        try {
            this.f37081b.close();
        } finally {
            if (this.d) {
                this.d = false;
                this.f37082c.close();
            }
        }
    }

    @Override // com.smartdigimkt.n4.h
    public int a(byte[] bArr, int i2, int i3) throws IOException {
        if (this.f37083e == 0) {
            return -1;
        }
        int iA = this.f37081b.a(bArr, i2, i3);
        if (iA > 0) {
            this.f37082c.a(bArr, i2, iA);
            long j = this.f37083e;
            if (j != -1) {
                this.f37083e = j - ((long) iA);
            }
        }
        return iA;
    }
}
