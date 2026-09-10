package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.content.Context;
import android.os.Handler;
import com.google.android.exoplayer2.ui.PlayerView;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.activity.WeaponUseActivity;

/* JADX INFO: loaded from: classes4.dex */
public final class Ch0 {
    public static volatile Ch0 j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f2935a;
    public boolean b;
    public C2736Rs c;
    public PlayerView d;
    public C2388Eh e;
    public G9 f;
    public boolean g;
    public boolean h;
    public C3285dk i;

    public static Ch0 a(WeaponUseActivity weaponUseActivity) {
        if (j == null) {
            synchronized (Ch0.class) {
                try {
                    if (j == null) {
                        Ch0 ch0 = new Ch0();
                        ch0.f2935a = weaponUseActivity;
                        j = ch0;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return j;
    }

    public final void b(boolean z) {
        this.b = false;
        this.h = true;
        if (z) {
            if (!this.g) {
                this.e.B(this.f);
                this.g = true;
            }
        } else if (this.g) {
            C2388Eh c2388Eh = this.e;
            synchronized (c2388Eh) {
                c2388Eh.H();
                Handler handler = c2388Eh.m;
                Ug0.Q(c2388Eh.k, 1, 2);
                if (handler != null) {
                    handler.obtainMessage(1, new C2362Dh(1, 2, null)).sendToTarget();
                }
            }
            this.g = false;
        }
        C2736Rs c2736Rs = this.c;
        if (c2736Rs != null) {
            c2736Rs.K(0);
            this.c.J(true);
            C2736Rs c2736Rs2 = this.c;
            c2736Rs2.getClass();
            c2736Rs2.e(c2736Rs2.p(), com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET, false);
            C2736Rs c2736Rs3 = this.c;
            c2736Rs3.getClass();
            c2736Rs3.J(true);
        }
    }
}
