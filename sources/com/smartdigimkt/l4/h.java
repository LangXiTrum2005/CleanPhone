package com.smartdigimkt.l4;

import com.smartdigimkt.n4.k;
import com.smartdigimkt.p4.f0;
import com.smartdigimkt.w3.m;
import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
public class h extends a {
    private final int m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final long f36354n;
    private final d o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private volatile int f36355p;
    private volatile boolean q;
    private volatile boolean r;

    public h(com.smartdigimkt.n4.h hVar, k kVar, m mVar, int i2, Object obj, long j, long j2, long j3, long j4, int i3, long j5, d dVar) {
        super(hVar, kVar, mVar, i2, obj, j, j2, j3, j4);
        this.m = i3;
        this.f36354n = j5;
        this.o = dVar;
    }

    @Override // com.smartdigimkt.n4.t.c
    public final void a() throws InterruptedException, IOException {
        k kVarA = this.f36340a.a(this.f36355p);
        try {
            com.smartdigimkt.n4.h hVar = this.f36344h;
            com.smartdigimkt.b4.b bVar = new com.smartdigimkt.b4.b(hVar, kVarA.f37006c, hVar.a(kVarA));
            if (this.f36355p == 0) {
                b bVarG = g();
                bVarG.a(this.f36354n);
                d dVar = this.o;
                long j = this.j;
                dVar.a(bVarG, j == -9223372036854775807L ? 0L : j - this.f36354n);
            }
            try {
                com.smartdigimkt.b4.e eVar = this.o.X;
                int iA = 0;
                while (iA == 0 && !this.q) {
                    iA = eVar.a(bVar, (com.smartdigimkt.b4.j) null);
                }
                com.smartdigimkt.p4.a.b(iA != 1);
                this.f36355p = (int) (bVar.d() - this.f36340a.f37006c);
                f0.a(this.f36344h);
                this.r = true;
            } catch (Throwable th) {
                this.f36355p = (int) (bVar.d() - this.f36340a.f37006c);
                throw th;
            }
        } catch (Throwable th2) {
            f0.a(this.f36344h);
            throw th2;
        }
    }

    @Override // com.smartdigimkt.n4.t.c
    public final void b() {
        this.q = true;
    }

    @Override // com.smartdigimkt.l4.c
    public final long c() {
        return this.f36355p;
    }

    @Override // com.smartdigimkt.l4.i
    public long e() {
        return this.f36356i + ((long) this.m);
    }

    @Override // com.smartdigimkt.l4.i
    public boolean f() {
        return this.r;
    }
}
