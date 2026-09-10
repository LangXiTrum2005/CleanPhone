package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.App;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.adapter.RvEffectChangeAdapter;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.bean.ShootEffect;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Rd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2721Rd extends WG implements InterfaceC3567gx {
    public final /* synthetic */ DialogC2799Ud f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2721Rd(DialogC2799Ud dialogC2799Ud) {
        super(2);
        this.f = dialogC2799Ud;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3567gx
    public final Object invoke(Object obj, Object obj2) {
        ShootEffect shootEffect = (ShootEffect) obj;
        RvEffectChangeAdapter.EffectViewHolder effectViewHolder = (RvEffectChangeAdapter.EffectViewHolder) obj2;
        AbstractC2995aW.q(shootEffect, "dataItem");
        AbstractC2995aW.q(effectViewHolder, "viewHolder");
        int adapterPosition = effectViewHolder.getAdapterPosition();
        if (adapterPosition == 0) {
            S3.b("effect_machine_gun", "standard");
        } else if (adapterPosition == 1) {
            S3.b("effect_machine_gun", "buckshot");
        } else if (adapterPosition == 2) {
            S3.b("effect_machine_gun", "poison");
        } else if (adapterPosition == 3) {
            S3.b("effect_machine_gun", "incendiary");
        } else if (adapterPosition == 4) {
            S3.b("effect_machine_gun", "tracer");
        } else if (adapterPosition == 5) {
            S3.b("effect_machine_gun", "anime");
        }
        DialogC2799Ud dialogC2799Ud = this.f;
        dialogC2799Ud.d.g(shootEffect);
        C2498In c2498In = App.n;
        WD.D(C2498In.g(), null, 0, new C2695Qd(dialogC2799Ud, shootEffect, null), 3);
        return C5033xf0.f5238a;
    }
}
