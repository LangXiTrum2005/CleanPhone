package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.content.Context;
import android.content.res.Resources;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.R;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.adapter.RvSceneChangeAdapter;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Cd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2332Cd extends Ea0 implements InterfaceC3567gx {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ DialogC2384Ed f2931a;
    public final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2332Cd(DialogC2384Ed dialogC2384Ed, int i, InterfaceC2857Wj interfaceC2857Wj) {
        super(2, interfaceC2857Wj);
        this.f2931a = dialogC2384Ed;
        this.b = i;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
    public final InterfaceC2857Wj create(Object obj, InterfaceC2857Wj interfaceC2857Wj) {
        return new C2332Cd(this.f2931a, this.b, interfaceC2857Wj);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3567gx
    public final Object invoke(Object obj, Object obj2) {
        C2332Cd c2332Cd = (C2332Cd) create((InterfaceC4514rk) obj, (InterfaceC2857Wj) obj2);
        C5033xf0 c5033xf0 = C5033xf0.f5238a;
        c2332Cd.invokeSuspend(c5033xf0);
        return c5033xf0;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
    public final Object invokeSuspend(Object obj) {
        String resourceEntryName;
        AbstractC3375el.b0(obj);
        DialogC2384Ed dialogC2384Ed = this.f2931a;
        RvSceneChangeAdapter rvSceneChangeAdapter = dialogC2384Ed.c;
        int i = this.b;
        Context context = dialogC2384Ed.getContext();
        AbstractC2995aW.p(context, "getContext(...)");
        try {
            resourceEntryName = context.getResources().getResourceEntryName(i);
            AbstractC2995aW.n(resourceEntryName);
        } catch (Resources.NotFoundException unused) {
            resourceEntryName = "unknown";
        }
        int iIntValue = 0;
        switch (resourceEntryName.hashCode()) {
            case -290305467:
                if (resourceEntryName.equals("universe")) {
                    iIntValue = R.drawable.bg_scene_universe;
                }
                break;
            case -284840886:
                if (resourceEntryName.equals("unknown")) {
                    Object obj2 = AbstractC3197ck0.l.get(0);
                    AbstractC2995aW.n(obj2);
                    iIntValue = ((Number) obj2).intValue();
                }
                break;
            case 117480:
                if (resourceEntryName.equals("war")) {
                    iIntValue = R.drawable.bg_scene_war;
                }
                break;
            case 3053931:
                if (resourceEntryName.equals("city")) {
                    iIntValue = R.drawable.bg_scene_city_war;
                }
                break;
            case 3492756:
                if (resourceEntryName.equals("rain")) {
                    iIntValue = R.drawable.bg_scene_rain;
                }
                break;
            case 3526175:
                if (resourceEntryName.equals("sebo")) {
                    iIntValue = R.drawable.bg_scene_sebo;
                }
                break;
        }
        rvSceneChangeAdapter.g(new Integer(iIntValue));
        return C5033xf0.f5238a;
    }
}
