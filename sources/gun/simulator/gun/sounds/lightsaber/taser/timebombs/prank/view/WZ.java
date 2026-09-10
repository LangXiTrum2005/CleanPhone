package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.content.Context;
import androidx.appcompat.app.AppCompatActivity;
import java.nio.charset.StandardCharsets;

/* JADX INFO: loaded from: classes4.dex */
public final class WZ implements RB, InterfaceC3504gB {
    public static volatile WZ b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RB f3926a = C3044b1.b.f4152a.m();

    public static WZ b() {
        if (b == null) {
            synchronized (WZ.class) {
                try {
                    if (b == null) {
                        b = new WZ();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return b;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.RB
    public final void a(AppCompatActivity appCompatActivity, C3491g4 c3491g4, String str, QI qi) {
        RB rb = this.f3926a;
        if (rb != null) {
            rb.a(appCompatActivity, c3491g4, str, qi);
            return;
        }
        byte[] bArr = {-71, 43, -117, -8, -115, -80, -84, -100, -80, 52, -113, -31, -115, -91, -83, -117, -12, com.umeng.analytics.pro.cw.n, -99, -81, -126, -73, -92, -107};
        byte[] bArr2 = {-44, 121, -18, -113, -20, -62, -56, -7};
        int i = 0;
        int i2 = 0;
        while (i < 24) {
            if (i2 >= 8) {
                i2 = 0;
            }
            bArr[i] = (byte) (bArr[i] ^ bArr2[i2]);
            i++;
            i2++;
        }
        new String(bArr, StandardCharsets.UTF_8);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3504gB
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final void i(Context context, C3491g4 c3491g4, NS ns) {
        RB rb = this.f3926a;
        if (rb != null) {
            rb.i(context, c3491g4, ns);
            return;
        }
        byte[] bArr = {101, -42, -113, -39, 96, 31, 10, -45, 108, -55, -117, -64, 96, 10, 11, -60, 40, -19, -103, -114, 111, 24, 2, -38};
        byte[] bArr2 = {8, -124, -22, -82, 1, 109, 110, -74};
        int i = 0;
        int i2 = 0;
        while (i < 24) {
            if (i2 >= 8) {
                i2 = 0;
            }
            bArr[i] = (byte) (bArr[i] ^ bArr2[i2]);
            i++;
            i2++;
        }
        ns.a(new A70(-2, (Object) null, new String(bArr, StandardCharsets.UTF_8), 11));
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3504gB
    public final void k(Context context, C9 c9, InterfaceC5085yB interfaceC5085yB) {
        VZ vz = (VZ) c9;
        NS ns = (NS) interfaceC5085yB;
        RB rb = this.f3926a;
        if (rb != null) {
            rb.k(context, vz, ns);
            return;
        }
        if (ns != null) {
            byte[] bArr = {-57, 36, -12, -127, 127, 91, -100, 5, -50, 59, -16, -104, 127, 78, -99, 18, -118, 31, -30, -42, 112, 92, -108, 12};
            byte[] bArr2 = {-86, 118, -111, -10, 30, 41, -8, 96};
            int i = 0;
            int i2 = 0;
            while (i < 24) {
                if (i2 >= 8) {
                    i2 = 0;
                }
                bArr[i] = (byte) (bArr[i] ^ bArr2[i2]);
                i++;
                i2++;
            }
            ns.a(new A70(-2, (Object) null, new String(bArr, StandardCharsets.UTF_8), 11));
        }
    }
}
