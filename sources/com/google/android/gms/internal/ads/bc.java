package com.google.android.gms.internal.ads;

import androidx.core.app.NotificationCompat;
import com.ironsource.X3;
import java.nio.ByteBuffer;
import java.util.Date;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class bc extends xw1 {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f12711i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Date f12712j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Date f12713k;
    public long l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f12714m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public double f12715n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public float f12716o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public cx1 f12717p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public long f12718q;

    @Override // com.google.android.gms.internal.ads.xw1
    public final void c(ByteBuffer byteBuffer) {
        int i10 = byteBuffer.get();
        if (i10 < 0) {
            i10 += NotificationCompat.FLAG_LOCAL_ONLY;
        }
        this.f12711i = i10;
        byteBuffer.get();
        byteBuffer.get();
        byteBuffer.get();
        if (!this.f22013b) {
            d();
        }
        if (this.f12711i == 1) {
            this.f12712j = jd1.b(x10.s(byteBuffer));
            this.f12713k = jd1.b(x10.s(byteBuffer));
            this.l = x10.a(byteBuffer);
            this.f12714m = x10.s(byteBuffer);
        } else {
            this.f12712j = jd1.b(x10.a(byteBuffer));
            this.f12713k = jd1.b(x10.a(byteBuffer));
            this.l = x10.a(byteBuffer);
            this.f12714m = x10.a(byteBuffer);
        }
        this.f12715n = x10.v(byteBuffer);
        byte[] bArr = new byte[2];
        byteBuffer.get(bArr);
        this.f12716o = ((short) ((bArr[1] & 255) | ((short) (65280 & (bArr[0] << 8))))) / 256.0f;
        byteBuffer.get();
        byteBuffer.get();
        x10.a(byteBuffer);
        x10.a(byteBuffer);
        this.f12717p = new cx1(x10.v(byteBuffer), x10.v(byteBuffer), x10.v(byteBuffer), x10.v(byteBuffer), x10.z(byteBuffer), x10.z(byteBuffer), x10.z(byteBuffer), x10.v(byteBuffer), x10.v(byteBuffer));
        byteBuffer.getInt();
        byteBuffer.getInt();
        byteBuffer.getInt();
        byteBuffer.getInt();
        byteBuffer.getInt();
        byteBuffer.getInt();
        this.f12718q = x10.a(byteBuffer);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("MovieHeaderBox[creationTime=");
        sb2.append(this.f12712j);
        sb2.append(";modificationTime=");
        sb2.append(this.f12713k);
        sb2.append(";timescale=");
        sb2.append(this.l);
        sb2.append(";duration=");
        sb2.append(this.f12714m);
        sb2.append(";rate=");
        sb2.append(this.f12715n);
        sb2.append(";volume=");
        sb2.append(this.f12716o);
        sb2.append(";matrix=");
        sb2.append(this.f12717p);
        sb2.append(";nextTrackId=");
        return defpackage.e.r(sb2, this.f12718q, X3.j.f27836e);
    }
}
