package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.App;
import java.util.Set;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Ui, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2804Ui extends Ea0 implements InterfaceC3567gx {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C2856Wi f3836a;
    public final /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2804Ui(C2856Wi c2856Wi, Object obj, InterfaceC2857Wj interfaceC2857Wj) {
        super(2, interfaceC2857Wj);
        this.f3836a = c2856Wi;
        this.b = obj;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
    public final InterfaceC2857Wj create(Object obj, InterfaceC2857Wj interfaceC2857Wj) {
        return new C2804Ui(this.f3836a, this.b, interfaceC2857Wj);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3567gx
    public final Object invoke(Object obj, Object obj2) throws ClassNotFoundException {
        C2804Ui c2804Ui = (C2804Ui) create((InterfaceC4514rk) obj, (InterfaceC2857Wj) obj2);
        C5033xf0 c5033xf0 = C5033xf0.f5238a;
        c2804Ui.invokeSuspend(c5033xf0);
        return c5033xf0;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
    public final Object invokeSuspend(Object obj) throws ClassNotFoundException {
        SharedPreferences.Editor editorPutFloat;
        AbstractC3375el.b0(obj);
        Object obj2 = C3850k80.f4589a;
        Context contextF = App.n.f();
        String str = this.f3836a.f3934a;
        AbstractC2995aW.q(str, "key");
        Object obj3 = this.b;
        AbstractC2995aW.q(obj3, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        if (obj3 instanceof Boolean) {
            editorPutFloat = C3850k80.a((AbstractApplicationC2673Ph) contextF).putBoolean(str, ((Boolean) obj3).booleanValue());
        } else if (obj3 instanceof String) {
            editorPutFloat = C3850k80.a((AbstractApplicationC2673Ph) contextF).putString(str, (String) obj3);
        } else if (obj3 instanceof Set) {
            if (!(AbstractC2853Wf.h0((Iterable) obj3) instanceof String)) {
                throw C3850k80.c(obj3);
            }
            editorPutFloat = C3850k80.a((AbstractApplicationC2673Ph) contextF).putStringSet(str, (Set) obj3);
        } else if (obj3 instanceof Integer) {
            editorPutFloat = C3850k80.a((AbstractApplicationC2673Ph) contextF).putInt(str, ((Number) obj3).intValue());
        } else if (obj3 instanceof Long) {
            editorPutFloat = C3850k80.a((AbstractApplicationC2673Ph) contextF).putLong(str, ((Number) obj3).longValue());
        } else {
            if (!(obj3 instanceof Float)) {
                throw C3850k80.c(obj3);
            }
            editorPutFloat = C3850k80.a((AbstractApplicationC2673Ph) contextF).putFloat(str, ((Number) obj3).floatValue());
        }
        editorPutFloat.apply();
        return C5033xf0.f5238a;
    }
}
