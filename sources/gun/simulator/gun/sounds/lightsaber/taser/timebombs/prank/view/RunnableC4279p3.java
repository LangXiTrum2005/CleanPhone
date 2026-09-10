package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.nio.charset.StandardCharsets;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.p3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class RunnableC4279p3 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ I9 f4819a;
    public final /* synthetic */ String b;
    public final /* synthetic */ S c;
    public final /* synthetic */ AbstractC4454r3 d;

    public RunnableC4279p3(AbstractC4454r3 abstractC4454r3, I9 i9, String str, S s) {
        this.d = abstractC4454r3;
        this.f4819a = i9;
        this.b = str;
        this.c = s;
    }

    @Override // java.lang.Runnable
    public final void run() {
        S s;
        AbstractC4454r3 abstractC4454r3 = this.d;
        abstractC4454r3.getClass();
        I9 i9 = this.f4819a;
        if (i9 == null || (s = this.c) == null) {
            return;
        }
        String str = this.b;
        if (abstractC4454r3.m0(str) != 1) {
            byte[] bArr = {77, -117, -5, com.umeng.analytics.pro.cw.n, 53, 11, 39, 25, 96, -98, -75, 8, 57, 10, 110, 21, 99, -113, -71, 94, 35, 18, 110, 7, 47, -104, -16, 24, 34, 28, 116, 31, 47, -119, -3, 27, 51, 18};
            byte[] bArr2 = {com.umeng.analytics.pro.cw.m, -22, -107, 126, 80, 121, 7, 119};
            int i = 0;
            int i2 = 0;
            while (i < 38) {
                if (i2 >= 8) {
                    i2 = 0;
                }
                bArr[i] = (byte) (bArr[i] ^ bArr2[i2]);
                i++;
                i2++;
            }
            new String(bArr, StandardCharsets.UTF_8);
            return;
        }
        long jN0 = abstractC4454r3.n0();
        long jCurrentTimeMillis = s.b;
        if (s.c && s.f3691a > 0) {
            jCurrentTimeMillis += System.currentTimeMillis() - s.f3691a;
        }
        if (jCurrentTimeMillis >= jN0) {
            abstractC4454r3.o0(i9, str, s);
            return;
        }
        byte[] bArr3 = {-20, 87, 116, -53, com.umeng.analytics.pro.cw.k, -124, -71, -63, -57, 69, 115, -57, 4, -109, -71, -43, -37, 66, 58, -53, 7, -126, -71, -59, -53, 87, 121, -51, com.umeng.analytics.pro.cw.k, -110, -71, -122, -101, 69, 54, -123, 26, -109, -22, -44, -58, 83, 126, -48, 4, -109, -71, -44, -58, 83, 121, -50};
        byte[] bArr4 = {-82, 54, 26, -91, 104, -10, -103, -73};
        int i3 = 0;
        int i4 = 0;
        while (i3 < 52) {
            if (i4 >= 8) {
                i4 = 0;
            }
            bArr3[i3] = (byte) (bArr3[i3] ^ bArr4[i4]);
            i3++;
            i4++;
        }
        new String(bArr3, StandardCharsets.UTF_8);
        abstractC4454r3.k0(i9, str, s);
    }
}
