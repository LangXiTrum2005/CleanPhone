package eo;

import bo.k;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.n;
import xn.m;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class c extends a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final m f40185d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f40186e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f40187f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ g f40188g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(g gVar, m url) {
        super(gVar);
        n.f(url, "url");
        this.f40188g = gVar;
        this.f40185d = url;
        this.f40186e = -1L;
        this.f40187f = true;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        boolean zS;
        if (this.f40180b) {
            return;
        }
        if (this.f40187f) {
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            byte[] bArr = yn.a.f54560a;
            n.f(timeUnit, "timeUnit");
            try {
                zS = yn.a.s(this, 100);
            } catch (IOException unused) {
                zS = false;
            }
            if (!zS) {
                ((k) this.f40188g.f40198d).k();
                d();
            }
        }
        this.f40180b = true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x007e, code lost:
    
        if (r9.f40187f == false) goto L25;
     */
    @Override // eo.a, lo.t
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long l(long r10, lo.e r12) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 216
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: eo.c.l(long, lo.e):long");
    }
}
