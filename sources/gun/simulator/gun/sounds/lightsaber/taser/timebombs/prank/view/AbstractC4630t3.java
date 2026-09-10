package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.app.Activity;
import android.util.ArrayMap;
import androidx.appcompat.app.AppCompatActivity;
import com.google.android.gms.ads.rewarded.RewardedAd;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.t3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC4630t3 extends AbstractC4170nn0 implements RB {
    public final /* synthetic */ int k;
    public final ArrayMap l;
    public XZ m;

    public AbstractC4630t3(int i) {
        this.k = i;
        if (i != 1) {
            this.l = new ArrayMap();
            this.m = null;
        } else {
            this.l = new ArrayMap();
            this.m = null;
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC4170nn0
    public final AbstractC4379q9 K(C3491g4 c3491g4, boolean z) {
        int i = this.k;
        switch (i) {
            case 0:
                switch (i) {
                    case 0:
                        break;
                    default:
                        break;
                }
                break;
            default:
                switch (i) {
                    case 0:
                        break;
                    default:
                        break;
                }
                break;
        }
        return new VZ(c3491g4, true, false);
    }

    public abstract void V(Activity activity, RewardedAd rewardedAd, XZ xz, InterfaceC4821vB interfaceC4821vB);

    public abstract void W(AppCompatActivity appCompatActivity, XZ xz, QI qi);

    public final O9 X(C3491g4 c3491g4) {
        O9 o9;
        synchronized (this.l) {
            o9 = (O9) this.l.get(c3491g4);
        }
        return o9;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.RB
    public final void a(AppCompatActivity appCompatActivity, C3491g4 c3491g4, String str, QI qi) {
        int i = ((N9) r()).f;
        XZ xz = new XZ();
        xz.f3354a = c3491g4;
        xz.f = null;
        xz.b = str;
        xz.e = true;
        xz.g = false;
        xz.d = i;
        W(appCompatActivity, xz, qi);
    }
}
