package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import com.badlogic.gdx.backends.android.IControl;
import com.badlogic.gdx.backends.android.SpineController;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.kI, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3861kI extends Ea0 implements InterfaceC3567gx {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C4213oI f4593a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3861kI(C4213oI c4213oI, InterfaceC2857Wj interfaceC2857Wj) {
        super(2, interfaceC2857Wj);
        this.f4593a = c4213oI;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
    public final InterfaceC2857Wj create(Object obj, InterfaceC2857Wj interfaceC2857Wj) {
        return new C3861kI(this.f4593a, interfaceC2857Wj);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3567gx
    public final Object invoke(Object obj, Object obj2) {
        C3861kI c3861kI = (C3861kI) create((InterfaceC4514rk) obj, (InterfaceC2857Wj) obj2);
        C5033xf0 c5033xf0 = C5033xf0.f5238a;
        c3861kI.invokeSuspend(c5033xf0);
        return c5033xf0;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
    public final Object invokeSuspend(Object obj) {
        AbstractC3375el.b0(obj);
        C4213oI c4213oI = this.f4593a;
        synchronized (c4213oI.Z) {
            try {
                SpineController spineController = c4213oI.N;
                if (spineController != null) {
                    IControl.DefaultImpls.addAnimation$default(spineController, "LIGHT_RECTANGLE", 5, "guangyun_chuxian", false, 0.0f, null, 56, null);
                }
                SpineController spineController2 = c4213oI.N;
                if (spineController2 != null) {
                    IControl.DefaultImpls.addAnimation$default(spineController2, "LIGHT_RECTANGLE", 6, "guangzhu_chuxian", false, 0.0f, null, 56, null);
                }
                c4213oI.N(c4213oI.b.getName());
            } catch (Throwable th) {
                throw th;
            }
        }
        return C5033xf0.f5238a;
    }
}
