package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.content.SharedPreferences;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.App;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.activity.WeaponUseActivity;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.ol0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C4254ol0 extends Ea0 implements InterfaceC3567gx {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ WeaponUseActivity f4805a;
    public final /* synthetic */ boolean b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4254ol0(WeaponUseActivity weaponUseActivity, boolean z, InterfaceC2857Wj interfaceC2857Wj) {
        super(2, interfaceC2857Wj);
        this.f4805a = weaponUseActivity;
        this.b = z;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
    public final InterfaceC2857Wj create(Object obj, InterfaceC2857Wj interfaceC2857Wj) {
        return new C4254ol0(this.f4805a, this.b, interfaceC2857Wj);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3567gx
    public final Object invoke(Object obj, Object obj2) {
        C4254ol0 c4254ol0 = (C4254ol0) create((InterfaceC4514rk) obj, (InterfaceC2857Wj) obj2);
        C5033xf0 c5033xf0 = C5033xf0.f5238a;
        c4254ol0.invokeSuspend(c5033xf0);
        return c5033xf0;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
    public final Object invokeSuspend(Object obj) {
        AbstractC3375el.b0(obj);
        Object obj2 = C3850k80.f4589a;
        SharedPreferences.Editor editorEdit = C3850k80.b(this.f4805a, "SpHelper").edit();
        if (this.b) {
            editorEdit.putString("WEAPON_SORT_INDEX_LIST", AbstractC2853Wf.l0(App.s, "||", null, null, null, 62));
        }
        editorEdit.putString("WEAPON_NAME_LIST", AbstractC2853Wf.l0(App.r, "||", null, null, null, 62));
        editorEdit.apply();
        return C5033xf0.f5238a;
    }
}
