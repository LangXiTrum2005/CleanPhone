package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import com.badlogic.gdx.backends.android.SpineController;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.activity.RussianRouletteActivity;
import java.util.Iterator;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.w10, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C4891w10 extends Ea0 implements InterfaceC3567gx {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ RussianRouletteActivity f5164a;
    public final /* synthetic */ SpineController b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4891w10(RussianRouletteActivity russianRouletteActivity, SpineController spineController, InterfaceC2857Wj interfaceC2857Wj) {
        super(2, interfaceC2857Wj);
        this.f5164a = russianRouletteActivity;
        this.b = spineController;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
    public final InterfaceC2857Wj create(Object obj, InterfaceC2857Wj interfaceC2857Wj) {
        return new C4891w10(this.f5164a, this.b, interfaceC2857Wj);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3567gx
    public final Object invoke(Object obj, Object obj2) {
        return ((C4891w10) create((InterfaceC4514rk) obj, (InterfaceC2857Wj) obj2)).invokeSuspend(C5033xf0.f5238a);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
    public final Object invokeSuspend(Object obj) {
        AbstractC3375el.b0(obj);
        Iterator it = AbstractC2340Cl.K("banji", "jichui", "dancao", "qiang").iterator();
        while (it.hasNext()) {
            C4991x70 skeleton = this.b.getSkeleton((String) it.next());
            if (skeleton != null) {
                skeleton.d();
            }
        }
        RussianRouletteActivity russianRouletteActivity = this.f5164a;
        SpineController spineController = russianRouletteActivity.e;
        if (spineController != null) {
            spineController.hideSlot("reload");
        }
        SpineController spineController2 = russianRouletteActivity.e;
        if (spineController2 != null) {
            spineController2.hideSlot("gun");
        }
        SpineController spineController3 = russianRouletteActivity.e;
        if (spineController3 != null) {
            spineController3.showSlotExcludeRedSlots("dancao");
        }
        SpineController spineController4 = russianRouletteActivity.e;
        if (spineController4 != null) {
            spineController4.showSlotExcludeRedSlots("banji");
        }
        SpineController spineController5 = russianRouletteActivity.e;
        if (spineController5 != null) {
            spineController5.showSlotExcludeRedSlots("jichui");
        }
        SpineController spineController6 = russianRouletteActivity.e;
        if (spineController6 == null) {
            return null;
        }
        spineController6.showSlot("qiang");
        return C5033xf0.f5238a;
    }
}
