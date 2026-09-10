package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.content.Intent;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.activity.MainActivity;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.activity.WeaponUseActivity;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.bean.Weapon;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.rL, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C4479rL extends WG implements InterfaceC2714Qw {
    public final /* synthetic */ int f;
    public final /* synthetic */ MainActivity g;
    public final /* synthetic */ Weapon h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C4479rL(MainActivity mainActivity, Weapon weapon, int i) {
        super(0);
        this.f = i;
        this.g = mainActivity;
        this.h = weapon;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2714Qw
    public final /* bridge */ /* synthetic */ Object invoke() {
        C5033xf0 c5033xf0 = C5033xf0.f5238a;
        switch (this.f) {
            case 0:
                m274invoke();
                break;
            default:
                m274invoke();
                break;
        }
        return c5033xf0;
    }

    /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
    public final void m274invoke() {
        int i = this.f;
        Weapon weapon = this.h;
        MainActivity mainActivity = this.g;
        switch (i) {
            case 0:
                Intent intent = new Intent(mainActivity, (Class<?>) WeaponUseActivity.class);
                intent.putExtra("weapon", weapon);
                mainActivity.startActivityForResult(intent, 1111);
                break;
            default:
                Intent intent2 = new Intent(mainActivity, (Class<?>) WeaponUseActivity.class);
                intent2.putExtra("weapon", weapon);
                mainActivity.startActivityForResult(intent2, 1111);
                break;
        }
    }
}
