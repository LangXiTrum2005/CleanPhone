package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.content.Intent;
import android.view.View;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.R;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.activity.RussianRouletteActivity;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.activity.SettingActivity;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.bean.Weapon;

/* JADX INFO: loaded from: classes4.dex */
public final class E10 extends WG implements InterfaceC2766Sw {
    public final /* synthetic */ RussianRouletteActivity f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public E10(RussianRouletteActivity russianRouletteActivity) {
        super(1);
        this.f = russianRouletteActivity;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2766Sw
    public final Object invoke(Object obj) {
        AbstractC2995aW.q((View) obj, "it");
        S3.b("russian_roulette_click", "settings");
        Weapon weaponByNameResId = Weapon.CREATOR.getWeaponByNameResId(R.string.weapon_name_russian_roulette);
        if (weaponByNameResId != null) {
            int i = SettingActivity.f2779a;
            RussianRouletteActivity russianRouletteActivity = this.f;
            AbstractC2995aW.q(russianRouletteActivity, "activity");
            Intent intent = new Intent(russianRouletteActivity, (Class<?>) SettingActivity.class);
            intent.putExtra("IntentKeySetting", weaponByNameResId.getNameId());
            intent.putExtra("IsFromRussianRoulette", true);
            russianRouletteActivity.startActivityForResult(intent, 1001);
        }
        return C5033xf0.f5238a;
    }
}
