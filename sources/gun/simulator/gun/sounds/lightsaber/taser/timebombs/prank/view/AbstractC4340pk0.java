package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.media.SoundPool;
import android.os.Build;
import android.os.Message;
import android.os.Vibrator;
import android.widget.TextView;
import androidx.core.app.NotificationCompat;
import androidx.lifecycle.LifecycleOwnerKt;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.App;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.activity.WeaponUseActivity;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.bean.Weapon;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.pk0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC4340pk0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WeaponUseActivity f4847a;
    public final Weapon b;
    public final InterfaceC3069bH c;
    public Integer d;
    public Integer e;
    public Integer f;
    public boolean g;
    public final InterfaceC3069bH h;
    public boolean i;
    public int j;
    public int k;
    public Float l;
    public final InterfaceC3069bH m;
    public final InterfaceC3069bH n;
    public final InterfaceC3069bH o;
    public Integer p;

    public AbstractC4340pk0(WeaponUseActivity weaponUseActivity, Weapon weapon) {
        AbstractC2995aW.q(weaponUseActivity, "mActivity");
        this.f4847a = weaponUseActivity;
        this.b = weapon;
        C3286dk0 c3286dk0 = new C3286dk0(this, 1);
        EnumC4124nH enumC4124nH = EnumC4124nH.c;
        this.c = AbstractC2340Cl.H(enumC4124nH, c3286dk0);
        this.h = AbstractC2340Cl.H(enumC4124nH, new C3286dk0(this, 0));
        this.m = AbstractC2340Cl.H(enumC4124nH, C3488g20.j);
        this.n = AbstractC2340Cl.H(enumC4124nH, new C3286dk0(this, 2));
        this.o = AbstractC2340Cl.H(enumC4124nH, C3488g20.k);
    }

    public final AbstractC3477fv a() {
        return (AbstractC3477fv) this.m.getValue();
    }

    public final R7 b() {
        return (R7) this.h.getValue();
    }

    public final SoundPool c() {
        return (SoundPool) this.c.getValue();
    }

    public final Vibrator d() {
        if (Build.VERSION.SDK_INT >= 23) {
            C2498In c2498In = App.n;
            if (C2498In.i().checkSelfPermission("android.permission.VIBRATE") != 0) {
                return null;
            }
        }
        return (Vibrator) this.n.getValue();
    }

    public final C3894kh0 e() {
        return (C3894kh0) this.o.getValue();
    }

    public abstract void f(boolean z);

    public boolean g(Message message) {
        AbstractC2995aW.q(message, NotificationCompat.CATEGORY_MESSAGE);
        return false;
    }

    public void h() {
        C2498In c2498In = App.n;
        WD.D(C2498In.g(), null, 0, new C3550gk0(2, null), 3);
        SoundPool soundPoolC = c();
        if (soundPoolC != null) {
            soundPoolC.release();
        }
        AbstractC3477fv abstractC3477fvA = a();
        if (abstractC3477fvA != null) {
            abstractC3477fvA.a();
        }
        n();
    }

    public final void i(Integer num) {
        if (this.b.getSwitchSound()) {
            WD.D(LifecycleOwnerKt.getLifecycleScope(this.f4847a), AbstractC4437qp.b, 0, new C3638hk0(this, num, null), 2);
        }
    }

    public final void j(Integer num) {
        if (!this.b.getSwitchSound() || num == null) {
            return;
        }
        WD.D(LifecycleOwnerKt.getLifecycleScope(this.f4847a), AbstractC4437qp.b, 0, new C3725ik0(this, num, null), 2);
    }

    public final void k(int i) {
        if (i < 0) {
            i = 0;
        }
        this.j = i;
        WD.D(LifecycleOwnerKt.getLifecycleScope(this.f4847a), null, 0, new C4076mk0(this, i, null), 3);
    }

    public final void l(int i) {
        int i2 = this.k;
        WeaponUseActivity weaponUseActivity = this.f4847a;
        if (i2 < 1 && i < 1) {
            weaponUseActivity.p();
        }
        if (i < 0) {
            i = 0;
        }
        this.k = i;
        C3109bk0 c3109bk0M = weaponUseActivity.m();
        if (c3109bk0M != null) {
            int magazineCapacity = this.b.getMagazineCapacity() * this.k;
            TextView textView = c3109bk0M.q;
            if (textView == null) {
                return;
            }
            textView.setText(String.valueOf(magazineCapacity));
        }
    }

    public final void m(Integer num) {
        WD.D(LifecycleOwnerKt.getLifecycleScope(this.f4847a), AbstractC4437qp.b, 0, new C3812jk0(this, null), 2);
    }

    public final void n() {
        Vibrator vibratorD = d();
        if (vibratorD != null) {
            try {
                vibratorD.cancel();
            } catch (Throwable th) {
                AbstractC3375el.v(th);
            }
        }
    }
}
