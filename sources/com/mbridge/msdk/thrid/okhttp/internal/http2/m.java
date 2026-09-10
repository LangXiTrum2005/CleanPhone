package com.mbridge.msdk.thrid.okhttp.internal.http2;

import com.applovin.shadow.okhttp3.internal.http2.Settings;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f36566a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int[] f36567b = new int[10];

    public void a() {
        this.f36566a = 0;
        Arrays.fill(this.f36567b, 0);
    }

    public int b() {
        if ((this.f36566a & 2) != 0) {
            return this.f36567b[1];
        }
        return -1;
    }

    public int c(int i10) {
        return (this.f36566a & 32) != 0 ? this.f36567b[5] : i10;
    }

    public boolean d(int i10) {
        return (this.f36566a & (1 << i10)) != 0;
    }

    public int b(int i10) {
        return (this.f36566a & 16) != 0 ? this.f36567b[4] : i10;
    }

    public int c() {
        return (this.f36566a & 128) != 0 ? this.f36567b[7] : Settings.DEFAULT_INITIAL_WINDOW_SIZE;
    }

    public int d() {
        return Integer.bitCount(this.f36566a);
    }

    public m a(int i10, int i11) {
        if (i10 >= 0) {
            int[] iArr = this.f36567b;
            if (i10 < iArr.length) {
                this.f36566a = (1 << i10) | this.f36566a;
                iArr[i10] = i11;
            }
        }
        return this;
    }

    public int a(int i10) {
        return this.f36567b[i10];
    }

    public void a(m mVar) {
        for (int i10 = 0; i10 < 10; i10++) {
            if (mVar.d(i10)) {
                a(i10, mVar.a(i10));
            }
        }
    }
}
