package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.content.Intent;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.activity.MainActivity;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.activity.WeaponSortActivity;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.bean.WeaponSorts;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.yL, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C5095yL implements ES {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ MainActivity f5272a;
    public final /* synthetic */ WeaponSorts b;

    public C5095yL(MainActivity mainActivity, WeaponSorts weaponSorts) {
        this.f5272a = mainActivity;
        this.b = weaponSorts;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4821vB
    public final void h(boolean z) {
        MainActivity mainActivity = this.f5272a;
        Intent intent = new Intent(mainActivity.getBaseContext(), (Class<?>) WeaponSortActivity.class);
        intent.putExtra("weaponSort", this.b);
        mainActivity.startActivity(intent);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4821vB
    public final void onAdShowed() {
        this.f5272a.h = true;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4821vB
    public final /* synthetic */ void onAdClicked() {
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4821vB
    public final /* synthetic */ void onAdClosed() {
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4821vB
    public final /* synthetic */ void onAdImpression() {
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4821vB
    public final /* synthetic */ void d(A70 a70) {
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4821vB
    public final /* synthetic */ void e(InterfaceC3240dB interfaceC3240dB) {
    }
}
