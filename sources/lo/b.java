package lo;

import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class b implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f45623a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f45624b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f45625c;

    public /* synthetic */ b(int i10, Object obj, Object obj2) {
        this.f45623a = i10;
        this.f45624b = obj;
        this.f45625c = obj2;
    }

    @Override // lo.r, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        switch (this.f45623a) {
            case 0:
                s sVar = (s) this.f45624b;
                b bVar = (b) this.f45625c;
                sVar.h();
                try {
                    try {
                        bVar.close();
                        if (sVar.i()) {
                            throw sVar.k(null);
                        }
                        return;
                    } catch (IOException e10) {
                        if (!sVar.i()) {
                            throw e10;
                        }
                        throw sVar.k(e10);
                    }
                } catch (Throwable th2) {
                    sVar.i();
                    throw th2;
                }
            default:
                ((OutputStream) this.f45624b).close();
                return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0093 A[LOOP:1: B:12:0x005a->B:25:0x0093, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:49:0x0095 A[SYNTHETIC] */
    @Override // lo.r
    public final void e(long j10, e eVar) throws IOException {
        s sVar;
        switch (this.f45623a) {
            case 0:
                com.google.android.gms.internal.auth.i.b(eVar.f45637b, 0L, j10);
                long j11 = j10;
                while (true) {
                    long j12 = 0;
                    if (j11 <= 0) {
                        return;
                    }
                    o oVar = eVar.f45636a;
                    kotlin.jvm.internal.n.c(oVar);
                    try {
                        try {
                            while (j12 < 65536) {
                                j12 += (long) (oVar.f45661c - oVar.f45660b);
                                if (j12 >= j11) {
                                    j12 = j11;
                                    sVar = (s) this.f45624b;
                                    b bVar = (b) this.f45625c;
                                    sVar.h();
                                    bVar.e(j12, eVar);
                                    if (!sVar.i()) {
                                        throw sVar.k(null);
                                    }
                                    j11 -= j12;
                                } else {
                                    oVar = oVar.f45664f;
                                    kotlin.jvm.internal.n.c(oVar);
                                }
                            }
                            bVar.e(j12, eVar);
                            if (!sVar.i()) {
                                throw sVar.k(null);
                            }
                            j11 -= j12;
                        } catch (IOException e10) {
                            if (!sVar.i()) {
                                throw e10;
                            }
                            throw sVar.k(e10);
                        }
                    } catch (Throwable th2) {
                        sVar.i();
                        throw th2;
                    }
                    sVar = (s) this.f45624b;
                    b bVar2 = (b) this.f45625c;
                    sVar.h();
                }
                break;
            default:
                com.google.android.gms.internal.auth.i.b(eVar.f45637b, 0L, j10);
                while (j10 > 0) {
                    ((v) this.f45625c).f();
                    o oVar2 = eVar.f45636a;
                    kotlin.jvm.internal.n.c(oVar2);
                    int iMin = (int) Math.min(j10, oVar2.f45661c - oVar2.f45660b);
                    ((OutputStream) this.f45624b).write(oVar2.f45659a, oVar2.f45660b, iMin);
                    int i10 = oVar2.f45660b + iMin;
                    oVar2.f45660b = i10;
                    long j13 = iMin;
                    j10 -= j13;
                    eVar.f45637b -= j13;
                    if (i10 == oVar2.f45661c) {
                        eVar.f45636a = oVar2.a();
                        p.a(oVar2);
                    }
                }
                return;
        }
    }

    @Override // lo.r, java.io.Flushable
    public final void flush() throws IOException {
        switch (this.f45623a) {
            case 0:
                s sVar = (s) this.f45624b;
                b bVar = (b) this.f45625c;
                sVar.h();
                try {
                    try {
                        bVar.flush();
                        if (sVar.i()) {
                            throw sVar.k(null);
                        }
                        return;
                    } catch (IOException e10) {
                        if (!sVar.i()) {
                            throw e10;
                        }
                        throw sVar.k(e10);
                    }
                } catch (Throwable th2) {
                    sVar.i();
                    throw th2;
                }
            default:
                ((OutputStream) this.f45624b).flush();
                return;
        }
    }

    @Override // lo.r
    public final v timeout() {
        switch (this.f45623a) {
            case 0:
                return (s) this.f45624b;
            default:
                return (v) this.f45625c;
        }
    }

    public final String toString() {
        switch (this.f45623a) {
            case 0:
                return "AsyncTimeout.sink(" + ((b) this.f45625c) + ')';
            default:
                return "sink(" + ((OutputStream) this.f45624b) + ')';
        }
    }
}
