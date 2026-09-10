package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import com.badlogic.gdx.backends.android.SpineController;
import com.badlogic.gdx.backends.android.SpineData;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.activity.RussianRouletteActivity;
import java.util.UUID;

/* JADX INFO: loaded from: classes4.dex */
public final class O10 extends Ea0 implements InterfaceC3567gx {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ RussianRouletteActivity f3489a;
    public final /* synthetic */ String b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public O10(RussianRouletteActivity russianRouletteActivity, String str, InterfaceC2857Wj interfaceC2857Wj) {
        super(2, interfaceC2857Wj);
        this.f3489a = russianRouletteActivity;
        this.b = str;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
    public final InterfaceC2857Wj create(Object obj, InterfaceC2857Wj interfaceC2857Wj) {
        return new O10(this.f3489a, this.b, interfaceC2857Wj);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3567gx
    public final Object invoke(Object obj, Object obj2) {
        return ((O10) create((InterfaceC4514rk) obj, (InterfaceC2857Wj) obj2)).invokeSuspend(C5033xf0.f5238a);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
    public final Object invokeSuspend(Object obj) {
        C5033xf0 c5033xf0 = C5033xf0.f5238a;
        RussianRouletteActivity russianRouletteActivity = this.f3489a;
        AbstractC3375el.b0(obj);
        try {
            SpineController spineController = russianRouletteActivity.e;
            String str = this.b;
            if (spineController != null) {
                String string = UUID.randomUUID().toString();
                AbstractC2995aW.p(string, "toString(...)");
                spineController.updateSpine(russianRouletteActivity, "effect", new SpineData(string, AbstractC3375el.D(russianRouletteActivity).x / 2.0f, AbstractC3375el.D(russianRouletteActivity).y / 2.0f, 1.0f, "spine/effect/" + str + ".atlas", "spine/effect/" + str + ".json", true, null, 128, null));
            }
            SpineController spineController2 = russianRouletteActivity.e;
            if (spineController2 == null) {
                return null;
            }
            String string2 = UUID.randomUUID().toString();
            AbstractC2995aW.p(string2, "toString(...)");
            spineController2.updateSpine(russianRouletteActivity, "smoke", new SpineData(string2, AbstractC3375el.D(russianRouletteActivity).x / 2.0f, AbstractC3375el.D(russianRouletteActivity).y / 2.0f, 1.0f, "spine/effect/" + str + "_smoke.atlas", "spine/effect/" + str + "_smoke.json", true, null, 128, null));
            return c5033xf0;
        } catch (Exception e) {
            e.printStackTrace();
            return c5033xf0;
        }
    }
}
