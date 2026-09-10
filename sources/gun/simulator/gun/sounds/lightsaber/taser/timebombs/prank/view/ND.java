package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.app.Activity;
import android.content.Context;
import java.nio.charset.StandardCharsets;

/* JADX INFO: loaded from: classes4.dex */
public final class ND implements InterfaceC4909wB {
    public static volatile ND b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC4909wB f3446a = C3044b1.b.f4152a.i();

    public static ND b() {
        if (b == null) {
            synchronized (ND.class) {
                try {
                    if (b == null) {
                        b = new ND();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return b;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4909wB
    public final void h(Activity activity, String str, int i, HS hs) {
        InterfaceC4909wB interfaceC4909wB = this.f3446a;
        if (interfaceC4909wB != null) {
            interfaceC4909wB.h(activity, str, i, hs);
            return;
        }
        byte[] bArr = {-16, -6, 54, -125, -32, 56, -112, -100, -7, -2, 30, -125, -11, 58, -121, -81, -67, -38, 12, -51, -6, 40, -114, -79};
        byte[] bArr2 = {-99, -77, 127, -19, -108, 93, -30, -35};
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
        hs.d(new A70(-2, (Object) null, new String(bArr, StandardCharsets.UTF_8), 11));
        hs.h(false);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3504gB
    public final void i(Context context, C3491g4 c3491g4, InterfaceC5085yB interfaceC5085yB) {
        throw null;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3504gB
    public final void k(Context context, C9 c9, InterfaceC5085yB interfaceC5085yB) {
        MD md = (MD) c9;
        GS gs = (GS) interfaceC5085yB;
        InterfaceC4909wB interfaceC4909wB = this.f3446a;
        if (interfaceC4909wB != null) {
            interfaceC4909wB.k(context, md, gs);
            return;
        }
        if (gs != null) {
            byte[] bArr = {104, -37, -117, 24, 127, 114, -31, 62, 97, -33, -93, 24, 106, 112, -10, com.umeng.analytics.pro.cw.k, 37, -5, -79, 86, 101, 98, -1, 19};
            byte[] bArr2 = {5, -110, -62, 118, 11, 23, -109, 127};
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
            gs.a(new A70(-2, (Object) null, new String(bArr, StandardCharsets.UTF_8), 11));
        }
    }
}
