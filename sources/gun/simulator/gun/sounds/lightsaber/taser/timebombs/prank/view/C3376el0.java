package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.activity.WeaponUseActivity;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.el0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3376el0 extends AbstractC2883Xj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public WeaponUseActivity f4335a;
    public /* synthetic */ Object b;
    public final /* synthetic */ WeaponUseActivity c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3376el0(WeaponUseActivity weaponUseActivity, InterfaceC2857Wj interfaceC2857Wj) {
        super(interfaceC2857Wj);
        this.c = weaponUseActivity;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.q(this);
    }
}
