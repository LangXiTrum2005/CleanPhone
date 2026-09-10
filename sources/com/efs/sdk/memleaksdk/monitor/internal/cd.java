package com.efs.sdk.memleaksdk.monitor.internal;

import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC5044xl;

/* JADX INFO: loaded from: classes2.dex */
public final class cd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f632a;
    private int b;
    private final byte[] c;
    private final int d;
    private final boolean e;

    public cd(byte[] bArr, int i, int i2, boolean z) {
        AbstractC2995aW.q(bArr, "array");
        this.c = bArr;
        this.d = i;
        this.e = z;
        this.f632a = i2 - 1;
    }

    public final byte a() {
        int i = this.b;
        this.b = i + 1;
        int i2 = this.f632a;
        if (i >= 0 && i2 >= i) {
            return this.c[this.d + i];
        }
        StringBuilder sbQ = AbstractC5044xl.q("Index ", i, " should be between 0 and ");
        sbQ.append(this.f632a);
        throw new IllegalArgumentException(sbQ.toString().toString());
    }

    public final long b() {
        return this.e ? d() : c();
    }

    public final int c() {
        int i = this.b;
        this.b = i + 4;
        if (i >= 0 && i <= this.f632a - 3) {
            return ce.b(this.c, this.d + i);
        }
        StringBuilder sbQ = AbstractC5044xl.q("Index ", i, " should be between 0 and ");
        sbQ.append(this.f632a - 3);
        throw new IllegalArgumentException(sbQ.toString().toString());
    }

    public final long d() {
        int i = this.b;
        this.b = i + 8;
        if (i >= 0 && i <= this.f632a - 7) {
            return ce.c(this.c, this.d + i);
        }
        StringBuilder sbQ = AbstractC5044xl.q("Index ", i, " should be between 0 and ");
        sbQ.append(this.f632a - 7);
        throw new IllegalArgumentException(sbQ.toString().toString());
    }

    public final long a(int i) {
        int i2 = this.b;
        this.b = i2 + i;
        if (i2 >= 0 && i2 <= this.f632a - (i - 1)) {
            int i3 = this.d + i2;
            byte[] bArr = this.c;
            int i4 = (i - 1) * 8;
            long j = 0;
            while (i4 >= 8) {
                j |= (255 & ((long) bArr[i3])) << i4;
                i4 -= 8;
                i3++;
            }
            return (((long) bArr[i3]) & 255) | j;
        }
        StringBuilder sbQ = AbstractC5044xl.q("Index ", i2, " should be between 0 and ");
        sbQ.append(this.f632a - (i - 1));
        throw new IllegalArgumentException(sbQ.toString().toString());
    }
}
