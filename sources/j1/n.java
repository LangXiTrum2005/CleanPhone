package j1;

import com.applovin.shadow.okhttp3.internal.ws.RealWebSocket;
import com.google.android.gms.internal.ads.t60;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import l1.y;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class n implements k {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f43611b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f43612c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f43613d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public h f43614e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public h f43615f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public h f43616g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public h f43617h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f43618i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public t60 f43619j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public ByteBuffer f43620k;
    public ByteBuffer l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f43621m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public long f43622n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f43623o;

    @Override // j1.k
    public final h a(h hVar) throws j {
        int i10 = hVar.f43599c;
        if (i10 != 2 && i10 != 4) {
            throw new j(hVar);
        }
        int i11 = this.f43611b;
        if (i11 == -1) {
            i11 = hVar.f43597a;
        }
        this.f43614e = hVar;
        h hVar2 = new h(i11, hVar.f43598b, i10);
        this.f43615f = hVar2;
        this.f43618i = true;
        return hVar2;
    }

    @Override // j1.k
    public final long b(long j10) {
        if (this.f43622n < RealWebSocket.DEFAULT_MINIMUM_DEFLATE_SIZE) {
            return (long) (j10 / ((double) this.f43612c));
        }
        long j11 = this.f43621m;
        t60 t60Var = this.f43619j;
        t60Var.getClass();
        long jY = j11 - ((long) (((m) t60Var.f20214q).y() * (t60Var.f20207i * t60Var.f20200b)));
        int i10 = this.f43617h.f43597a;
        int i11 = this.f43616g.f43597a;
        return i10 == i11 ? y.U(j10, this.f43622n, jY, RoundingMode.DOWN) : y.U(j10, this.f43622n * ((long) i11), jY * ((long) i10), RoundingMode.DOWN);
    }

    @Override // j1.k
    public final void flush() {
        if (isActive()) {
            h hVar = this.f43614e;
            this.f43616g = hVar;
            h hVar2 = this.f43615f;
            this.f43617h = hVar2;
            if (this.f43618i) {
                this.f43619j = new t60(hVar.f43597a, hVar.f43598b, this.f43612c, this.f43613d, hVar2.f43597a, hVar.f43599c == 4, 1);
            } else {
                t60 t60Var = this.f43619j;
                if (t60Var != null) {
                    t60Var.f20207i = 0;
                    t60Var.f20208j = 0;
                    t60Var.f20209k = 0;
                    t60Var.l = 0;
                    t60Var.f20210m = 0;
                    t60Var.f20211n = 0;
                    t60Var.f20212o = 0;
                    t60Var.f20213p = 0.0d;
                    ((m) t60Var.f20214q).flush();
                }
            }
        }
        this.l = k.f43603a;
        this.f43621m = 0L;
        this.f43622n = 0L;
        this.f43623o = false;
    }

    @Override // j1.k
    public final ByteBuffer getOutput() {
        t60 t60Var = this.f43619j;
        if (t60Var != null) {
            m mVar = (m) t60Var.f20214q;
            int i10 = t60Var.f20200b;
            go.k.t(t60Var.f20208j >= 0);
            int iY = mVar.y() * t60Var.f20208j * i10;
            if (iY > 0) {
                if (this.f43620k.capacity() < iY) {
                    this.f43620k = ByteBuffer.allocateDirect(iY).order(ByteOrder.nativeOrder());
                } else {
                    this.f43620k.clear();
                }
                ByteBuffer byteBuffer = this.f43620k;
                go.k.t(t60Var.f20208j >= 0);
                int iMin = Math.min(byteBuffer.remaining() / (mVar.y() * i10), t60Var.f20208j);
                mVar.d(iMin, byteBuffer);
                t60Var.f20208j -= iMin;
                System.arraycopy(mVar.t(), iMin * i10, mVar.t(), 0, t60Var.f20208j * i10);
                this.f43620k.flip();
                this.f43622n += (long) iY;
                this.l = this.f43620k;
            }
        }
        ByteBuffer byteBuffer2 = this.l;
        this.l = k.f43603a;
        return byteBuffer2;
    }

    @Override // j1.k
    public final boolean isActive() {
        if (this.f43615f.f43597a != -1) {
            return Math.abs(this.f43612c - 1.0f) >= 1.0E-4f || Math.abs(this.f43613d - 1.0f) >= 1.0E-4f || this.f43615f.f43597a != this.f43614e.f43597a;
        }
        return false;
    }

    @Override // j1.k
    public final boolean isEnded() {
        if (this.f43623o) {
            t60 t60Var = this.f43619j;
            if (t60Var != null) {
                go.k.t(t60Var.f20208j >= 0);
                if (((m) t60Var.f20214q).y() * t60Var.f20208j * t60Var.f20200b == 0) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // j1.k
    public final void queueEndOfStream() {
        t60 t60Var = this.f43619j;
        if (t60Var != null) {
            int i10 = t60Var.f20207i;
            float f10 = t60Var.f20201c;
            float f11 = t60Var.f20202d;
            double d10 = f10 / f11;
            double d11 = t60Var.f20203e * f11;
            int i11 = t60Var.f20211n;
            int i12 = t60Var.f20208j + ((int) ((((((((double) (i10 - i11)) / d10) + ((double) i11)) + t60Var.f20213p) + ((double) t60Var.f20209k)) / d11) + 0.5d));
            t60Var.f20213p = 0.0d;
            m mVar = (m) t60Var.f20214q;
            int i13 = t60Var.f20206h * 2;
            mVar.l(i13 + i10);
            mVar.e(i10 * t60Var.f20200b, i13);
            t60Var.f20207i = i13 + t60Var.f20207i;
            t60Var.b();
            if (t60Var.f20208j > i12) {
                t60Var.f20208j = Math.max(i12, 0);
            }
            t60Var.f20207i = 0;
            t60Var.f20211n = 0;
            t60Var.f20209k = 0;
        }
        this.f43623o = true;
    }

    @Override // j1.k
    public final void queueInput(ByteBuffer byteBuffer) {
        if (byteBuffer.hasRemaining()) {
            t60 t60Var = this.f43619j;
            t60Var.getClass();
            this.f43621m += (long) byteBuffer.remaining();
            int iRemaining = byteBuffer.remaining();
            int i10 = t60Var.f20200b;
            m mVar = (m) t60Var.f20214q;
            int iY = iRemaining / (mVar.y() * i10);
            mVar.l(iY);
            mVar.c(iRemaining, byteBuffer);
            t60Var.f20207i += iY;
            t60Var.b();
        }
    }

    @Override // j1.k
    public final void reset() {
        this.f43612c = 1.0f;
        this.f43613d = 1.0f;
        h hVar = h.f43596e;
        this.f43614e = hVar;
        this.f43615f = hVar;
        this.f43616g = hVar;
        this.f43617h = hVar;
        ByteBuffer byteBuffer = k.f43603a;
        this.f43620k = byteBuffer;
        this.l = byteBuffer;
        this.f43611b = -1;
        this.f43618i = false;
        this.f43619j = null;
        this.f43621m = 0L;
        this.f43622n = 0L;
        this.f43623o = false;
    }
}
