package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.app.Activity;
import java.nio.charset.StandardCharsets;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Er, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2398Er implements InterfaceC4733uB {
    public static volatile C2398Er b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC4733uB f3043a = C3044b1.b.f4152a.a();

    public static C2398Er a() {
        if (b == null) {
            synchronized (C2398Er.class) {
                try {
                    if (b == null) {
                        b = new C2398Er();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return b;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4733uB
    public final void e(Activity activity, int i, ES es) {
        InterfaceC4733uB interfaceC4733uB = this.f3043a;
        if (interfaceC4733uB != null) {
            interfaceC4733uB.e(activity, i, es);
            return;
        }
        byte[] bArr = {-88, -15, 119, -26, com.umeng.analytics.pro.cw.l, -84, 109, -64, -95, -11, 83, -26, 27, -82, 122, -13, -27, -47, 65, -88, 20, -68, 115, -19};
        byte[] bArr2 = {-59, -72, 50, -120, 122, -55, 31, -127};
        int i2 = 0;
        int i3 = 0;
        while (i2 < 24) {
            if (i3 >= 8) {
                i3 = 0;
            }
            bArr[i2] = (byte) (bArr[i2] ^ bArr2[i3]);
            i2++;
            i3++;
        }
        es.d(new A70(-2, (Object) null, new String(bArr, StandardCharsets.UTF_8), 11));
        es.h(false);
    }
}
