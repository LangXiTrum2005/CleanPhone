package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import com.mbridge.msdk.newreward.player.view.hybrid.util.MRAIDCommunicatorUtil;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.App;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.activity.WeaponUseActivity;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.adapter.RvSceneChangeAdapter;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Hd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2462Hd extends WG implements InterfaceC3567gx {
    public final /* synthetic */ DialogC2540Kd f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2462Hd(DialogC2540Kd dialogC2540Kd) {
        super(2);
        this.f = dialogC2540Kd;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3567gx
    public final Object invoke(Object obj, Object obj2) {
        int iIntValue = ((Number) obj).intValue();
        RvSceneChangeAdapter.SceneViewHolder sceneViewHolder = (RvSceneChangeAdapter.SceneViewHolder) obj2;
        AbstractC2995aW.q(sceneViewHolder, "viewHolder");
        int adapterPosition = sceneViewHolder.getAdapterPosition();
        if (adapterPosition == 0) {
            S3.b("scene_select", MRAIDCommunicatorUtil.STATES_DEFAULT);
        } else if (adapterPosition == 1) {
            S3.b("scene_select", "battlefield");
        } else if (adapterPosition == 2) {
            S3.b("scene_select", "rainforest");
        } else if (adapterPosition == 3) {
            S3.b("scene_select", "universe");
        } else if (adapterPosition == 4) {
            S3.b("scene_select", "cyber");
        } else if (adapterPosition == 5) {
            S3.b("scene_select", "city");
        }
        DialogC2540Kd dialogC2540Kd = this.f;
        dialogC2540Kd.d.g(Integer.valueOf(iIntValue));
        C2498In c2498In = App.n;
        WD.D(C2498In.g(), AbstractC4437qp.b, 0, new C2436Gd(dialogC2540Kd, sceneViewHolder, null), 2);
        int adapterPosition2 = sceneViewHolder.getAdapterPosition();
        WeaponUseActivity weaponUseActivity = dialogC2540Kd.c;
        if (adapterPosition2 == 0) {
            Object obj3 = AbstractC3197ck0.k.get(weaponUseActivity.h);
            AbstractC2995aW.p(obj3, "get(...)");
            weaponUseActivity.s(((Number) obj3).intValue());
        } else {
            weaponUseActivity.s(DialogC2540Kd.e(dialogC2540Kd, sceneViewHolder.getAdapterPosition()));
        }
        AbstractC3651ht.b(dialogC2540Kd);
        return C5033xf0.f5238a;
    }
}
