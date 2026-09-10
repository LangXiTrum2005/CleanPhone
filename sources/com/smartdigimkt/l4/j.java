package com.smartdigimkt.l4;

import com.smartdigimkt.n4.k;
import com.smartdigimkt.p4.f0;
import com.smartdigimkt.w3.m;
import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
public final class j extends a {
    private final int m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final m f36357n;
    private volatile int o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private volatile boolean f36358p;

    public j(com.smartdigimkt.n4.h hVar, k kVar, m mVar, int i2, Object obj, long j, long j2, long j3, int i3, m mVar2) {
        super(hVar, kVar, mVar, i2, obj, j, j2, -9223372036854775807L, j3);
        this.m = i3;
        this.f36357n = mVar2;
    }

    @Override // com.smartdigimkt.n4.t.c
    public void a() throws InterruptedException, IOException {
        try {
            long jA = this.f36344h.a(this.f36340a.a(this.o));
            if (jA != -1) {
                jA += (long) this.o;
            }
            com.smartdigimkt.b4.b bVar = new com.smartdigimkt.b4.b(this.f36344h, this.o, jA);
            b bVarG = g();
            bVarG.a(0L);
            com.smartdigimkt.b4.m mVarA = bVarG.a(0, this.m);
            mVarA.a(this.f36357n);
            for (int iA = 0; iA != -1; iA = mVarA.a(bVar, Integer.MAX_VALUE, true)) {
                this.o += iA;
            }
            mVarA.a(this.f, 1, this.o, 0, null);
            f0.a(this.f36344h);
            this.f36358p = true;
        } catch (Throwable th) {
            f0.a(this.f36344h);
            throw th;
        }
    }

    @Override // com.smartdigimkt.n4.t.c
    public void b() {
    }

    @Override // com.smartdigimkt.l4.c
    public long c() {
        return this.o;
    }

    @Override // com.smartdigimkt.l4.i
    public boolean f() {
        return this.f36358p;
    }
}
