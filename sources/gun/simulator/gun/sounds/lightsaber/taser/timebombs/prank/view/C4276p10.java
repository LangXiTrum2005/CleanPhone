package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.R;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.activity.RussianRouletteActivity;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.bean.Weapon;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.p10, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C4276p10 extends WG implements InterfaceC2714Qw {
    public final /* synthetic */ RussianRouletteActivity f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4276p10(RussianRouletteActivity russianRouletteActivity) {
        super(0);
        this.f = russianRouletteActivity;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2714Qw
    public final Object invoke() {
        Weapon weaponByNameResId = Weapon.CREATOR.getWeaponByNameResId(R.string.weapon_name_russian_roulette);
        RussianRouletteActivity russianRouletteActivity = this.f;
        return new DialogC2799Ud(russianRouletteActivity, weaponByNameResId, new PL(russianRouletteActivity, 0));
    }
}
