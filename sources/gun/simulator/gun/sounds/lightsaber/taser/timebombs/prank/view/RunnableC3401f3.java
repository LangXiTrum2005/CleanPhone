package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import androidx.work.WorkRequest;
import java.nio.charset.StandardCharsets;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.f3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class RunnableC3401f3 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4346a;
    public final /* synthetic */ C3927l3 b;

    public /* synthetic */ RunnableC3401f3(C3927l3 c3927l3, int i) {
        this.f4346a = i;
        this.b = c3927l3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f4346a;
        int i2 = 2;
        C3927l3 c3927l3 = this.b;
        switch (i) {
            case 0:
                P0 p0 = new P0(this, i2);
                if (!c3927l3.l.get()) {
                    p0.run();
                } else {
                    C4981x20.u().v(800L, p0);
                }
                break;
            case 1:
                c3927l3.getClass();
                X0 x0 = X0.j;
                if (x0.r().d.z() != 0) {
                    c3927l3.B(x0.r().d);
                    c3927l3.A(x0.r().d);
                    c3927l3.M(x0.d, x0.r().d, false, null);
                }
                break;
            default:
                X0 x1 = X0.j;
                if (x1.d.d <= 0) {
                    String str = c3927l3.f4440a;
                    byte[] bArr = {-26, -37, 47, -92, -6, -103, -31, 112, -61, -117, 48, -123, -39, -120, -32, 65, -26, -37, 47, -47, -86, -111, -50, 82, -45, -62, 41, -126, -2, -123, -52, 94, -46, -59, 43, -53, -74, -63, -81, 1};
                    byte[] bArr2 = {-89, -85, 95, -21, -118, -4, -113, 49};
                    int i3 = 0;
                    int i4 = 0;
                    while (i3 < 40) {
                        if (i4 >= 8) {
                            i4 = 0;
                        }
                        bArr[i3] = (byte) (bArr[i3] ^ bArr2[i4]);
                        i3++;
                        i4++;
                    }
                    new String(bArr, StandardCharsets.UTF_8);
                } else {
                    try {
                        if (c3927l3.k.get() && x1.r().d != null && x1.r().d.z() != 0) {
                            if (x1.r().d.z() != 2) {
                                long jCurrentTimeMillis = x1.r().g - (System.currentTimeMillis() - x1.r().d.y());
                                if (jCurrentTimeMillis > x1.r().g || jCurrentTimeMillis <= 0) {
                                    jCurrentTimeMillis = x1.r().g;
                                }
                                C4981x20.u().v(jCurrentTimeMillis, c3927l3.m);
                            } else {
                                byte[] bArr3 = {-34, -44, 103, 54, 122, -8, -49, 63, -5, -124, 91, 54, 75, -39, -28, 58, -64, -30, 86, 48, 70};
                                byte[] bArr4 = {-97, -92, 23, 121, 10, -99, -95, 126};
                                int i5 = 0;
                                int i6 = 0;
                                while (i5 < 21) {
                                    if (i6 >= 8) {
                                        i6 = 0;
                                    }
                                    bArr3[i5] = (byte) (bArr3[i5] ^ bArr4[i6]);
                                    i5++;
                                    i6++;
                                }
                                new String(bArr3, StandardCharsets.UTF_8);
                                if (System.currentTimeMillis() - ((((long) c3927l3.q) * WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS) + c3927l3.r) >= 0) {
                                    c3927l3.B(x1.r().d);
                                    c3927l3.A(x1.r().d);
                                    c3927l3.q++;
                                    c3927l3.r = System.currentTimeMillis();
                                    c3927l3.R(x1.d, x1.r().d, false, null);
                                }
                            }
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
                break;
        }
    }
}
