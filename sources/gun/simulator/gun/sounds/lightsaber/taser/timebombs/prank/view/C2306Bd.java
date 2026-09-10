package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import com.mbridge.msdk.newreward.player.view.hybrid.util.MRAIDCommunicatorUtil;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.App;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.R;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.activity.RussianRouletteActivity;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.adapter.RvSceneChangeAdapter;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Bd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2306Bd extends WG implements InterfaceC3567gx {
    public final /* synthetic */ DialogC2384Ed f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2306Bd(DialogC2384Ed dialogC2384Ed) {
        super(2);
        this.f = dialogC2384Ed;
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
        DialogC2384Ed dialogC2384Ed = this.f;
        dialogC2384Ed.c.g(Integer.valueOf(iIntValue));
        C2498In c2498In = App.n;
        WD.D(C2498In.g(), AbstractC4437qp.b, 0, new C2280Ad(dialogC2384Ed, sceneViewHolder, null), 2);
        int adapterPosition2 = sceneViewHolder.getAdapterPosition();
        if (adapterPosition2 == 0) {
            S3.b("russian_roulette_click", MRAIDCommunicatorUtil.STATES_DEFAULT);
        } else if (adapterPosition2 == 1) {
            S3.b("russian_roulette_click", "battlefield");
        } else if (adapterPosition2 == 2) {
            S3.b("russian_roulette_click", "rainforest");
        } else if (adapterPosition2 == 3) {
            S3.b("russian_roulette_click", "universe");
        } else if (adapterPosition2 == 4) {
            S3.b("russian_roulette_click", "cyber");
        } else if (adapterPosition2 == 5) {
            S3.b("russian_roulette_click", "city");
        }
        int adapterPosition3 = sceneViewHolder.getAdapterPosition();
        RussianRouletteActivity russianRouletteActivity = dialogC2384Ed.b;
        if (adapterPosition3 == 0) {
            russianRouletteActivity.j(R.drawable.bg_scene_russain_roulette);
        } else {
            russianRouletteActivity.r(DialogC2384Ed.d(dialogC2384Ed, sceneViewHolder.getAdapterPosition()));
        }
        AbstractC3651ht.b(dialogC2384Ed);
        return C5033xf0.f5238a;
    }
}
