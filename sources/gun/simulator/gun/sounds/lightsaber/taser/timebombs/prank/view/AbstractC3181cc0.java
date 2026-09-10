package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.cc0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC3181cc0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final SE f4230a = new SE("NO_THREAD_ELEMENTS", 1);
    public static final C3093bc0 b = C3093bc0.g;
    public static final C3093bc0 c = C3093bc0.h;
    public static final C3093bc0 d = C3093bc0.i;

    public static final void a(InterfaceC3549gk interfaceC3549gk, Object obj) {
        if (obj == f4230a) {
            return;
        }
        if (!(obj instanceof C3534gc0)) {
            Object objFold = interfaceC3549gk.fold(null, c);
            AbstractC2995aW.o(objFold, "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
            AbstractC3950lJ.z(objFold);
            throw null;
        }
        C3534gc0 c3534gc0 = (C3534gc0) obj;
        InterfaceC3004ac0[] interfaceC3004ac0Arr = c3534gc0.b;
        int length = interfaceC3004ac0Arr.length - 1;
        if (length < 0) {
            return;
        }
        InterfaceC3004ac0 interfaceC3004ac0 = interfaceC3004ac0Arr[length];
        AbstractC2995aW.n(null);
        Object obj2 = c3534gc0.f4421a[length];
        throw null;
    }

    public static final Object b(InterfaceC3549gk interfaceC3549gk) {
        Object objFold = interfaceC3549gk.fold(0, b);
        AbstractC2995aW.n(objFold);
        return objFold;
    }

    public static final Object c(InterfaceC3549gk interfaceC3549gk, Object obj) {
        if (obj == null) {
            obj = b(interfaceC3549gk);
        }
        if (obj == 0) {
            return f4230a;
        }
        if (obj instanceof Integer) {
            return interfaceC3549gk.fold(new C3534gc0(interfaceC3549gk, ((Number) obj).intValue()), d);
        }
        AbstractC3950lJ.z(obj);
        throw null;
    }
}
