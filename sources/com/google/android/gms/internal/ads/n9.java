package com.google.android.gms.internal.ads;

import com.mbridge.msdk.playercommon.exoplayer2.C;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class n9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f17715a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f17716b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f17717c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f17718d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f17719e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f17720f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f17721g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Object f17722h;

    public void a(byte[] bArr, int i10, int i11) {
        if (this.f17716b) {
            int i12 = this.f17719e;
            int i13 = (i10 + 1) - i12;
            if (i13 >= i11) {
                this.f17719e = (i11 - i10) + i12;
            } else {
                this.f17717c = ((bArr[i13] & 192) >> 6) == 0;
                this.f17716b = false;
            }
        }
    }

    public void b(long j10, int i10, boolean z10) {
        go.k.t(this.f17721g != C.TIME_UNSET);
        if (this.f17718d == 182 && z10 && this.f17715a) {
            ((n2.a0) this.f17722h).a(this.f17721g, this.f17717c ? 1 : 0, (int) (j10 - this.f17720f), i10, null);
        }
        if (this.f17718d != 179) {
            this.f17720f = j10;
        }
    }

    public void c(byte[] bArr, int i10, int i11) {
        if (this.f17716b) {
            int i12 = this.f17719e;
            int i13 = (i10 + 1) - i12;
            if (i13 >= i11) {
                this.f17719e = (i11 - i10) + i12;
            } else {
                this.f17717c = ((bArr[i13] & 192) >> 6) == 0;
                this.f17716b = false;
            }
        }
    }

    public void d(long j10, int i10, boolean z10) {
        ps1.c0(this.f17721g != C.TIME_UNSET);
        if (this.f17718d == 182 && z10 && this.f17715a) {
            ((h3) this.f17722h).c(this.f17721g, this.f17717c ? 1 : 0, (int) (j10 - this.f17720f), i10, null);
        }
        if (this.f17718d != 179) {
            this.f17720f = j10;
        }
    }
}
