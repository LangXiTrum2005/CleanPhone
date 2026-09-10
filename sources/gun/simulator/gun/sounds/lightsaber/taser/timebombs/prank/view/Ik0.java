package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import com.badlogic.gdx.backends.android.SpineController;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.activity.WeaponUseActivity;

/* JADX INFO: loaded from: classes4.dex */
public final class Ik0 extends Ea0 implements InterfaceC3567gx {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ WeaponUseActivity f3235a;
    public final /* synthetic */ String b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Ik0(WeaponUseActivity weaponUseActivity, String str, InterfaceC2857Wj interfaceC2857Wj) {
        super(2, interfaceC2857Wj);
        this.f3235a = weaponUseActivity;
        this.b = str;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
    public final InterfaceC2857Wj create(Object obj, InterfaceC2857Wj interfaceC2857Wj) {
        return new Ik0(this.f3235a, this.b, interfaceC2857Wj);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3567gx
    public final Object invoke(Object obj, Object obj2) {
        return ((Ik0) create((InterfaceC4514rk) obj, (InterfaceC2857Wj) obj2)).invokeSuspend(C5033xf0.f5238a);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
    public final Object invokeSuspend(Object obj) {
        C4991x70 skeleton;
        AbstractC3375el.b0(obj);
        SpineController spineController = this.f3235a.g;
        if (spineController == null || (skeleton = spineController.getSkeleton(this.b)) == null) {
            return null;
        }
        return skeleton.a("root");
    }
}
