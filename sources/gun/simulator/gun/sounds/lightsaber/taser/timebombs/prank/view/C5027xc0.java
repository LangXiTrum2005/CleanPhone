package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.content.Context;
import android.os.Handler;
import android.view.View;
import android.widget.TextView;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.databinding.LayoutWeaponActivityActionBinding;
import java.util.Formatter;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.xc0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C5027xc0 {
    public final Ma0 A;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f5232a;
    public Lj0 b;
    public C3355eb c;
    public final Ma0 d;
    public boolean e;
    public boolean f;
    public boolean g;
    public boolean h;
    public boolean i;
    public boolean j;
    public boolean k;
    public View l;
    public View m;
    public View n;
    public View o;
    public View p;
    public View q;
    public View r;
    public TextView s;
    public long t;
    public boolean u;
    public long v;
    public int w;
    public long x;
    public boolean y;
    public final Ma0 z;

    public C5027xc0(Context context) {
        AbstractC2995aW.q(context, "mContext");
        this.f5232a = context;
        this.d = AbstractC2340Cl.I(new C4763uc0(this, 1));
        this.t = 5000L;
        this.z = AbstractC2340Cl.I(C4851vc0.f);
        this.A = AbstractC2340Cl.I(new C4763uc0(this, 0));
    }

    public static long b(C5027xc0 c5027xc0, long j, long j2) {
        long j3 = j2 + j;
        if (j3 <= 0) {
            return 0L;
        }
        return j3 >= 6000000 ? j : j3;
    }

    public final Handler a() {
        return (Handler) this.d.getValue();
    }

    public final void c(boolean z) {
        View view = this.l;
        if (view != null) {
            view.setEnabled(z);
        }
        View view2 = this.n;
        if (view2 != null) {
            view2.setEnabled(z);
        }
        View view3 = this.o;
        if (view3 != null) {
            view3.setEnabled(z);
        }
        View view4 = this.p;
        if (view4 != null) {
            view4.setEnabled(z);
        }
        View view5 = this.q;
        if (view5 != null) {
            view5.setEnabled(z);
        }
        View view6 = this.r;
        if (view6 != null) {
            view6.setEnabled(z);
        }
        Lj0 lj0 = this.b;
        if (lj0 != null) {
            LayoutWeaponActivityActionBinding layoutWeaponActivityActionBinding = (LayoutWeaponActivityActionBinding) lj0.f3368a.b;
            layoutWeaponActivityActionBinding.ivBack.setEnabled(z);
            layoutWeaponActivityActionBinding.ivSetting.setEnabled(z);
            layoutWeaponActivityActionBinding.ivImmersive.setEnabled(z);
            layoutWeaponActivityActionBinding.ivSceneMenu.setEnabled(z);
            layoutWeaponActivityActionBinding.ivUnlimitedBullet.setEnabled(z);
        }
    }

    public final void d(long j) {
        String string;
        TextView textView = this.s;
        if (textView == null) {
            return;
        }
        Formatter formatter = (Formatter) this.A.getValue();
        long j2 = j < 0 ? 0L : j;
        if (j2 == com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET) {
            j2 = 0;
        }
        String str = j2 < 0 ? "-" : "";
        long jAbs = Math.abs(j2);
        long j3 = 1000;
        long j4 = jAbs / j3;
        long j5 = 60;
        long j6 = j4 % j5;
        long j7 = (j4 / j5) % ((long) 100);
        ((StringBuilder) this.z.getValue()).setLength(0);
        if (this.u) {
            string = formatter.format("%s%02d:%02d:%02d", str, Long.valueOf(j7), Long.valueOf(j6), Long.valueOf((jAbs % j3) / ((long) 10))).toString();
            AbstractC2995aW.n(string);
        } else {
            string = formatter.format("%s%02d:%02d", str, Long.valueOf(j7), Long.valueOf(j6)).toString();
            AbstractC2995aW.n(string);
        }
        textView.setText(string);
    }
}
