package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import androidx.work.WorkRequest;
import java.nio.charset.StandardCharsets;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.sT, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class RunnableC4575sT implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4981a;
    public final /* synthetic */ C4663tT b;

    public /* synthetic */ RunnableC4575sT(C4663tT c4663tT, int i) {
        this.f4981a = i;
        this.b = c4663tT;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f4981a;
        C4663tT c4663tT = this.b;
        switch (i) {
            case 0:
                if (!c4663tT.h()) {
                    c4663tT.n();
                } else {
                    C3784jT c3784jTB = C4663tT.b(c4663tT);
                    if (c3784jTB != null) {
                        C4663tT.a(c4663tT, c3784jTB, c4663tT.c);
                        c4663tT.n = true;
                        Qm0.D(new byte[]{-27, 93, -102, 24, 75, 60, 74, -125, -12, 122, -126, com.umeng.analytics.pro.cw.n, 90, 34}, new byte[]{-75, 30, -44, 121, 63, 85, 60, -26});
                        Qm0.D(new byte[]{58, 126, -121, 100, -44, 20, 20, -31, com.umeng.analytics.pro.cw.m, 46, -121, 43, -53, 12, 28, -3, 28, 52, -41, 37, -61, 64, 17, -6, 8, 126, -101, 37, -34, 5, 17, -65, 91, 121, -98, 40, -53, 64, 27, -4, com.umeng.analytics.pro.cw.m, 46, -123, 33, -63, 18, com.umeng.analytics.pro.cw.n, -32, 19, 46, -126, 42, -45, 9, 25, -77, 21, 107, -113, 48, -121, 1, 5, -29, 91, 125, -125, 37, -43, 20}, new byte[]{123, com.umeng.analytics.pro.cw.l, -9, 68, -89, 96, 117, -109});
                    }
                }
                break;
            default:
                Qm0.D(new byte[]{116, -22, 103, 36, 97, 73, -111, 12, 101, -51, 127, 44, 112, 87}, new byte[]{36, -87, 41, 69, 21, 32, -25, 105});
                Qm0.D(new byte[]{44, 110, 111, 47, -40, 11, 8, -85, 10, 98, 113, 34, -40, 9, 2, -95, 20, 110, 108, 45, -62, 89, 0, -114, com.umeng.analytics.pro.cw.k, 117, 112, 47, -106, com.umeng.analytics.pro.cw.k, 61, -94, 11, 110, 118, 35, -105, 23, 77, -16, 88}, new byte[]{120, 7, 2, 74, -8, 121, 109, -51});
                int i2 = c4663tT.f;
                if (!c4663tT.h()) {
                    c4663tT.n();
                } else {
                    C3784jT c3784jTB2 = C4663tT.b(c4663tT);
                    if (c3784jTB2 != null) {
                        C4663tT.a(c4663tT, c3784jTB2, c4663tT.c);
                    }
                    if (c4663tT.i != null) {
                        long j = c4663tT.o;
                        if (j <= 0) {
                            try {
                                C4312pT.n.getClass();
                                j = C3044b1.b.d().d;
                                if (j <= 0) {
                                    j = WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS;
                                }
                            } catch (Exception unused) {
                                byte[] bArr = {-26, -126, -33, 71, com.umeng.analytics.pro.cw.n, -52, 87, -99, -49, -61, -47, 78, 1, -120, 5, -116, -58, -111, -45, 88, 29, -4, 30, -124, -59, -82, -27, 11, 19, -38, 24, -124, -128, -124, -38, 68, 23, -55, 27, -55, -61, -116, -40, 77, 28, -49};
                                byte[] bArr2 = {-96, -29, -74, 43, 117, -88, 119, -23};
                                int i3 = 0;
                                int i4 = 0;
                                while (i3 < 46) {
                                    if (i4 >= 8) {
                                        i4 = 0;
                                    }
                                    bArr[i3] = (byte) (bArr[i3] ^ bArr2[i4]);
                                    i3++;
                                    i4++;
                                }
                                new String(bArr, StandardCharsets.UTF_8);
                            }
                        }
                        c4663tT.i.postDelayed(this, j);
                        Qm0.D(new byte[]{-16, 4, 32, -126, -27, -74, -119, 97, -31, 35, 56, -118, -12, -88}, new byte[]{-96, 71, 110, -29, -111, -33, -1, 4});
                        Qm0.D(new byte[]{-114, -109, 43, 112, 112, 110, 70, -118, -78, -109, 32, 108, 112, 111, 64, -124, -91, -110, 38, 104, 53, 120, 3, -123, -82, -42}, new byte[]{-64, -10, 83, 4, 80, 28, 35, -20});
                        Qm0.D(new byte[]{-86, 26}, new byte[]{-57, 105, 88, -56, -65, 88, 31, 107});
                    }
                }
                break;
        }
    }
}
