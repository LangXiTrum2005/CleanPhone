package b2;

import android.net.Uri;
import java.util.Arrays;
import java.util.Locale;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class q0 extends n1.c implements e {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final LinkedBlockingQueue f5388e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f5389f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public byte[] f5390g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f5391h;

    public q0() {
        super(true);
        this.f5389f = 8000L;
        this.f5388e = new LinkedBlockingQueue();
        this.f5390g = new byte[0];
        this.f5391h = -1;
    }

    @Override // n1.h
    public final long C(n1.k kVar) {
        this.f5391h = kVar.f46369a.getPort();
        return -1L;
    }

    @Override // b2.e
    public final String a() {
        go.k.t(this.f5391h != -1);
        int i10 = this.f5391h;
        int i11 = this.f5391h + 1;
        String str = l1.y.f44830a;
        Locale locale = Locale.US;
        return defpackage.e.g(i10, i11, "RTP/AVP/TCP;unicast;interleaved=", "-");
    }

    @Override // b2.e
    public final int f() {
        return this.f5391h;
    }

    @Override // n1.h
    public final Uri getUri() {
        return null;
    }

    @Override // b2.e
    public final boolean r() {
        return false;
    }

    @Override // i1.i
    public final int read(byte[] bArr, int i10, int i11) {
        if (i11 == 0) {
            return 0;
        }
        int iMin = Math.min(i11, this.f5390g.length);
        System.arraycopy(this.f5390g, 0, bArr, i10, iMin);
        byte[] bArr2 = this.f5390g;
        this.f5390g = Arrays.copyOfRange(bArr2, iMin, bArr2.length);
        if (iMin == i11) {
            return iMin;
        }
        try {
            byte[] bArr3 = (byte[]) this.f5388e.poll(this.f5389f, TimeUnit.MILLISECONDS);
            if (bArr3 == null) {
                return -1;
            }
            int iMin2 = Math.min(i11 - iMin, bArr3.length);
            System.arraycopy(bArr3, 0, bArr, i10 + iMin, iMin2);
            if (iMin2 < bArr3.length) {
                this.f5390g = Arrays.copyOfRange(bArr3, iMin2, bArr3.length);
            }
            return iMin + iMin2;
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            return -1;
        }
    }

    @Override // n1.h
    public final void close() {
    }

    @Override // b2.e
    public final q0 s() {
        return this;
    }
}
