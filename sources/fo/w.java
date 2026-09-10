package fo;

import com.applovin.shadow.okhttp3.internal.http2.Http2;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class w implements Closeable {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Logger f41320f = Logger.getLogger(f.class.getName());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final lo.f f41321a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final lo.e f41322b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f41323c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f41324d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final d f41325e;

    public w(lo.m sink) {
        kotlin.jvm.internal.n.f(sink, "sink");
        this.f41321a = sink;
        lo.e eVar = new lo.e();
        this.f41322b = eVar;
        this.f41323c = Http2.INITIAL_MAX_FRAME_SIZE;
        this.f41325e = new d(eVar);
    }

    public final synchronized void a(z peerSettings) {
        try {
            kotlin.jvm.internal.n.f(peerSettings, "peerSettings");
            if (this.f41324d) {
                throw new IOException("closed");
            }
            int i10 = this.f41323c;
            int i11 = peerSettings.f41330a;
            if ((i11 & 32) != 0) {
                i10 = peerSettings.f41331b[5];
            }
            this.f41323c = i10;
            if (((i11 & 2) != 0 ? peerSettings.f41331b[1] : -1) != -1) {
                d dVar = this.f41325e;
                int i12 = (i11 & 2) != 0 ? peerSettings.f41331b[1] : -1;
                dVar.getClass();
                int iMin = Math.min(i12, Http2.INITIAL_MAX_FRAME_SIZE);
                int i13 = dVar.f41223d;
                if (i13 != iMin) {
                    if (iMin < i13) {
                        dVar.f41221b = Math.min(dVar.f41221b, iMin);
                    }
                    dVar.f41222c = true;
                    dVar.f41223d = iMin;
                    int i14 = dVar.f41227h;
                    if (iMin < i14) {
                        if (iMin == 0) {
                            b[] bVarArr = dVar.f41224e;
                            xj.k.k0(bVarArr, null, 0, bVarArr.length);
                            dVar.f41225f = dVar.f41224e.length - 1;
                            dVar.f41226g = 0;
                            dVar.f41227h = 0;
                        } else {
                            dVar.a(i14 - iMin);
                        }
                    }
                }
            }
            c(0, 0, 4, 1);
            this.f41321a.flush();
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized void b(boolean z10, int i10, lo.e eVar, int i11) {
        if (this.f41324d) {
            throw new IOException("closed");
        }
        c(i10, i11, 0, z10 ? 1 : 0);
        if (i11 > 0) {
            lo.f fVar = this.f41321a;
            kotlin.jvm.internal.n.c(eVar);
            fVar.e(i11, eVar);
        }
    }

    public final void c(int i10, int i11, int i12, int i13) {
        Level level = Level.FINE;
        Logger logger = f41320f;
        if (logger.isLoggable(level)) {
            logger.fine(f.a(false, i10, i11, i12, i13));
        }
        if (i11 > this.f41323c) {
            throw new IllegalArgumentException(("FRAME_SIZE_ERROR length > " + this.f41323c + ": " + i11).toString());
        }
        if ((Integer.MIN_VALUE & i10) != 0) {
            throw new IllegalArgumentException(l1.d.e(i10, "reserved bit set: ").toString());
        }
        byte[] bArr = yn.a.f54560a;
        lo.f fVar = this.f41321a;
        kotlin.jvm.internal.n.f(fVar, "<this>");
        fVar.writeByte((i11 >>> 16) & 255);
        fVar.writeByte((i11 >>> 8) & 255);
        fVar.writeByte(i11 & 255);
        fVar.writeByte(i12 & 255);
        fVar.writeByte(i13 & 255);
        fVar.writeInt(i10 & Integer.MAX_VALUE);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        this.f41324d = true;
        this.f41321a.close();
    }

    public final synchronized void d(byte[] bArr, int i10, int i11) {
        d5.u.n(i11, IronSourceConstants.EVENTS_ERROR_CODE);
        if (this.f41324d) {
            throw new IOException("closed");
        }
        if (v0.i.c(i11) == -1) {
            throw new IllegalArgumentException("errorCode.httpCode == -1");
        }
        c(0, bArr.length + 8, 7, 0);
        this.f41321a.writeInt(i10);
        this.f41321a.writeInt(v0.i.c(i11));
        if (bArr.length != 0) {
            this.f41321a.write(bArr);
        }
        this.f41321a.flush();
    }

    public final synchronized void flush() {
        if (this.f41324d) {
            throw new IOException("closed");
        }
        this.f41321a.flush();
    }

    public final synchronized void h(int i10, ArrayList arrayList, boolean z10) {
        if (this.f41324d) {
            throw new IOException("closed");
        }
        this.f41325e.d(arrayList);
        long j10 = this.f41322b.f45637b;
        long jMin = Math.min(this.f41323c, j10);
        int i11 = j10 == jMin ? 4 : 0;
        if (z10) {
            i11 |= 1;
        }
        c(i10, (int) jMin, 1, i11);
        this.f41321a.e(jMin, this.f41322b);
        if (j10 > jMin) {
            long j11 = j10 - jMin;
            while (j11 > 0) {
                long jMin2 = Math.min(this.f41323c, j11);
                j11 -= jMin2;
                c(i10, (int) jMin2, 9, j11 == 0 ? 4 : 0);
                this.f41321a.e(jMin2, this.f41322b);
            }
        }
    }

    public final synchronized void j(boolean z10, int i10, int i11) {
        if (this.f41324d) {
            throw new IOException("closed");
        }
        c(0, 8, 6, z10 ? 1 : 0);
        this.f41321a.writeInt(i10);
        this.f41321a.writeInt(i11);
        this.f41321a.flush();
    }

    public final synchronized void k(int i10, int i11) {
        d5.u.n(i11, IronSourceConstants.EVENTS_ERROR_CODE);
        if (this.f41324d) {
            throw new IOException("closed");
        }
        if (v0.i.c(i11) == -1) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        c(i10, 4, 3, 0);
        this.f41321a.writeInt(v0.i.c(i11));
        this.f41321a.flush();
    }

    public final synchronized void n(int i10, long j10) {
        if (this.f41324d) {
            throw new IOException("closed");
        }
        if (j10 == 0 || j10 > 2147483647L) {
            throw new IllegalArgumentException(("windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: " + j10).toString());
        }
        c(i10, 4, 8, 0);
        this.f41321a.writeInt((int) j10);
        this.f41321a.flush();
    }
}
