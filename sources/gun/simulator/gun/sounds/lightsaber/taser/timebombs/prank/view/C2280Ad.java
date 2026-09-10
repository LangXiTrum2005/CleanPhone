package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.activity.RussianRouletteActivity;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.adapter.RvSceneChangeAdapter;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Ad, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2280Ad extends Ea0 implements InterfaceC3567gx {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ DialogC2384Ed f2822a;
    public final /* synthetic */ RvSceneChangeAdapter.SceneViewHolder b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2280Ad(DialogC2384Ed dialogC2384Ed, RvSceneChangeAdapter.SceneViewHolder sceneViewHolder, InterfaceC2857Wj interfaceC2857Wj) {
        super(2, interfaceC2857Wj);
        this.f2822a = dialogC2384Ed;
        this.b = sceneViewHolder;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
    public final InterfaceC2857Wj create(Object obj, InterfaceC2857Wj interfaceC2857Wj) {
        return new C2280Ad(this.f2822a, this.b, interfaceC2857Wj);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3567gx
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        C2280Ad c2280Ad = (C2280Ad) create((InterfaceC4514rk) obj, (InterfaceC2857Wj) obj2);
        C5033xf0 c5033xf0 = C5033xf0.f5238a;
        c2280Ad.invokeSuspend(c5033xf0);
        return c5033xf0;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
    public final Object invokeSuspend(Object obj) throws Throwable {
        AbstractC3375el.b0(obj);
        DialogC2384Ed dialogC2384Ed = this.f2822a;
        RussianRouletteActivity russianRouletteActivity = dialogC2384Ed.b;
        RvSceneChangeAdapter.SceneViewHolder sceneViewHolder = this.b;
        russianRouletteActivity.b = DialogC2384Ed.d(dialogC2384Ed, sceneViewHolder.getAdapterPosition());
        ((C2856Wi) AbstractC2934Zi.c.getValue()).b(new Integer(DialogC2384Ed.d(dialogC2384Ed, sceneViewHolder.getAdapterPosition())));
        return C5033xf0.f5238a;
    }
}
