package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.view.MotionEvent;
import android.view.View;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.activity.WeaponUseActivity;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.bean.Weapon;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class Dk0 implements View.OnTouchListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2986a;
    public final /* synthetic */ AbstractC4340pk0 b;

    public /* synthetic */ Dk0(AbstractC4340pk0 abstractC4340pk0, int i) {
        this.f2986a = i;
        this.b = abstractC4340pk0;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        Float f;
        int i = this.f2986a;
        AbstractC4340pk0 abstractC4340pk0 = this.b;
        switch (i) {
            case 0:
                Zb0 zb0 = WeaponUseActivity.n;
                AbstractC2995aW.q(abstractC4340pk0, "$it");
                C5081y80 c5081y80 = (C5081y80) abstractC4340pk0;
                AbstractC2995aW.n(motionEvent);
                int action = motionEvent.getAction();
                Weapon weapon = c5081y80.b;
                if (action == 0) {
                    if (c5081y80.j < 1 && c5081y80.l == null) {
                        c5081y80.l = Float.valueOf(motionEvent.getY());
                    }
                    if (!weapon.getCanConsecutive()) {
                        c5081y80.p();
                    } else {
                        c5081y80.q();
                    }
                } else {
                    WeaponUseActivity weaponUseActivity = c5081y80.f4847a;
                    if (action == 1) {
                        if (c5081y80.g) {
                            weaponUseActivity.o();
                            c5081y80.g = false;
                        }
                        c5081y80.l = null;
                        if (weapon.getCanConsecutive()) {
                            c5081y80.n();
                            c5081y80.b().removeMessages(101);
                        }
                    } else if (action == 2 && (f = c5081y80.l) != null) {
                        if (motionEvent.getRawY() - f.floatValue() > 100.0f) {
                            c5081y80.l = null;
                            c5081y80.b().removeMessages(102);
                            c5081y80.b().removeMessages(101);
                            weaponUseActivity.r();
                            if (c5081y80.k >= 1) {
                                c5081y80.g = true;
                                c5081y80.j(c5081y80.e);
                            } else {
                                weaponUseActivity.p();
                            }
                        }
                    }
                }
                break;
            case 1:
                AbstractC2995aW.o(abstractC4340pk0, "null cannot be cast to non-null type gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.helper.LightSaberFireHelper");
                AbstractC2995aW.n(motionEvent);
                ((C4213oI) abstractC4340pk0).B(view, motionEvent);
                break;
            case 2:
                AbstractC2995aW.o(abstractC4340pk0, "null cannot be cast to non-null type gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.helper.GunFireHelper");
                AbstractC2995aW.n(motionEvent);
                ((C2612My) abstractC4340pk0).B(view, motionEvent);
                break;
            case 3:
                AbstractC2995aW.o(abstractC4340pk0, "null cannot be cast to non-null type gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.helper.TaserFireHelper");
                AbstractC2995aW.n(motionEvent);
                ((C3794jb0) abstractC4340pk0).B(view, motionEvent);
                break;
            default:
                AbstractC2995aW.n(motionEvent);
                ((Gb0) abstractC4340pk0).B(view, motionEvent);
                break;
        }
        return true;
    }
}
