package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.activity.WeaponSortActivity;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.xk0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C5043xk0 extends WG implements InterfaceC2714Qw {
    public final /* synthetic */ int f;
    public final /* synthetic */ WeaponSortActivity g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C5043xk0(WeaponSortActivity weaponSortActivity, int i) {
        super(0);
        this.f = i;
        this.g = weaponSortActivity;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2714Qw
    public final Object invoke() {
        int i = this.f;
        WeaponSortActivity weaponSortActivity = this.g;
        switch (i) {
            case 0:
                return new DialogC4476rI(weaponSortActivity, weaponSortActivity, weaponSortActivity);
            default:
                return new DialogC4228oX(weaponSortActivity, weaponSortActivity, weaponSortActivity, false);
        }
    }
}
