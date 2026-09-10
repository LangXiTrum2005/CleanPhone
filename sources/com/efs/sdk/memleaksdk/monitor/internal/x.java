package com.efs.sdk.memleaksdk.monitor.internal;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.DM;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes2.dex */
final class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Charset f696a = Charset.forName(C.UTF8_NAME);

    public static void a(long j, long j2, long j3) {
        if ((j2 | j3) < 0 || j2 > j || j - j2 < j3) {
            StringBuilder sbP = DM.p("size=", j, " offset=");
            sbP.append(j2);
            sbP.append(" byteCount=");
            sbP.append(j3);
            throw new ArrayIndexOutOfBoundsException(sbP.toString());
        }
    }

    public static boolean a(byte[] bArr, int i, byte[] bArr2, int i2, int i3) {
        for (int i4 = 0; i4 < i3; i4++) {
            if (bArr[i4 + i] != bArr2[i4 + i2]) {
                return false;
            }
        }
        return true;
    }
}
