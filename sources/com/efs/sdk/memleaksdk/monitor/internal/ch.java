package com.efs.sdk.memleaksdk.monitor.internal;

import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;

/* JADX INFO: loaded from: classes2.dex */
public final class ch {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f636a;
    private final ba.a.AbstractC0127a.b b;
    private final int c;

    public ch(ba.a.AbstractC0127a.b bVar, int i) {
        AbstractC2995aW.q(bVar, "record");
        this.b = bVar;
        this.c = i;
    }

    private final long b(int i, byte[] bArr) {
        return (bArr[i + 3] & 255) | ((bArr[i + 1] & 255) << 16) | ((bArr[i] & 255) << 24) | ((bArr[i + 2] & 255) << 8);
    }

    private final long c(int i, byte[] bArr) {
        long j = ((((long) bArr[i]) & 255) << 56) | ((((long) bArr[i + 1]) & 255) << 48) | ((((long) bArr[i + 2]) & 255) << 40) | ((((long) bArr[i + 3]) & 255) << 32) | ((((long) bArr[i + 4]) & 255) << 24) | ((((long) bArr[i + 5]) & 255) << 16);
        return (((long) bArr[i + 7]) & 255) | j | ((((long) bArr[i + 6]) & 255) << 8);
    }

    public final long a() {
        long jA;
        int i = this.c;
        if (i == 1) {
            jA = this.b.f588a[this.f636a];
        } else if (i == 2) {
            jA = a(this.f636a, this.b.f588a);
        } else if (i == 4) {
            jA = b(this.f636a, this.b.f588a);
        } else {
            if (i != 8) {
                throw new IllegalStateException("ID Length must be 1, 2, 4, or 8".toString());
            }
            jA = c(this.f636a, this.b.f588a);
        }
        this.f636a += this.c;
        return jA;
    }

    public final void a(int i) {
        this.f636a += i;
    }

    private final long a(int i, byte[] bArr) {
        return ((bArr[i] & 255) << 8) | (bArr[i + 1] & 255);
    }
}
