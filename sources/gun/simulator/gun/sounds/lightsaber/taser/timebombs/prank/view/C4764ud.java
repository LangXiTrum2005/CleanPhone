package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.App;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.adapter.RvLightSaberEffectChangeAdapter;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.bean.ShootEffect;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.ud, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C4764ud extends WG implements InterfaceC3567gx {
    public final /* synthetic */ DialogC5116yd f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4764ud(DialogC5116yd dialogC5116yd) {
        super(2);
        this.f = dialogC5116yd;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3567gx
    public final Object invoke(Object obj, Object obj2) {
        ShootEffect shootEffect = (ShootEffect) obj;
        RvLightSaberEffectChangeAdapter.EffectViewHolder effectViewHolder = (RvLightSaberEffectChangeAdapter.EffectViewHolder) obj2;
        AbstractC2995aW.q(shootEffect, "dataItem");
        AbstractC2995aW.q(effectViewHolder, "viewHolder");
        C2498In c2498In = App.n;
        WD.D(C2498In.g(), null, 0, new C4676td(effectViewHolder, this.f, shootEffect, null), 3);
        return C5033xf0.f5238a;
    }
}
