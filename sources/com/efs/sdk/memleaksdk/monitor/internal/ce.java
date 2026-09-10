package com.efs.sdk.memleaksdk.monitor.internal;

import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;

/* JADX INFO: loaded from: classes2.dex */
public final class ce {
    public static final short a(byte[] bArr, int i) {
        AbstractC2995aW.q(bArr, "$this$readShort");
        int i2 = i + 1;
        return (short) ((bArr[i2] & 255) | ((bArr[i] & 255) << 8));
    }

    public static final int b(byte[] bArr, int i) {
        AbstractC2995aW.q(bArr, "$this$readInt");
        int i2 = ((bArr[i + 1] & 255) << 16) | ((bArr[i] & 255) << 24);
        return (bArr[i + 3] & 255) | i2 | ((bArr[i + 2] & 255) << 8);
    }

    public static final long c(byte[] bArr, int i) {
        AbstractC2995aW.q(bArr, "$this$readLong");
        long j = ((((long) bArr[i]) & 255) << 56) | ((((long) bArr[i + 1]) & 255) << 48) | ((((long) bArr[i + 2]) & 255) << 40) | ((((long) bArr[i + 3]) & 255) << 32) | ((((long) bArr[i + 4]) & 255) << 24) | ((((long) bArr[i + 5]) & 255) << 16);
        return (((long) bArr[i + 7]) & 255) | j | ((((long) bArr[i + 6]) & 255) << 8);
    }
}
