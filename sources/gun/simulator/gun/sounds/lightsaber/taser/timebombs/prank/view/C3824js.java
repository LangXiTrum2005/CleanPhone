package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.js, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3824js extends WG implements InterfaceC2766Sw {
    public final /* synthetic */ int f;
    public final /* synthetic */ Constructor g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C3824js(Constructor constructor, int i) {
        super(1);
        this.f = i;
        this.g = constructor;
    }

    public final Throwable a(Throwable th) throws IllegalAccessException, InstantiationException, InvocationTargetException {
        int i = this.f;
        Constructor constructor = this.g;
        switch (i) {
            case 0:
                Object objNewInstance = constructor.newInstance(th.getMessage(), th);
                AbstractC2995aW.o(objNewInstance, "null cannot be cast to non-null type kotlin.Throwable");
                return (Throwable) objNewInstance;
            case 1:
                Object objNewInstance2 = constructor.newInstance(th.getMessage());
                AbstractC2995aW.o(objNewInstance2, "null cannot be cast to non-null type kotlin.Throwable");
                Throwable th2 = (Throwable) objNewInstance2;
                th2.initCause(th);
                return th2;
            case 2:
                Object objNewInstance3 = constructor.newInstance(th);
                AbstractC2995aW.o(objNewInstance3, "null cannot be cast to non-null type kotlin.Throwable");
                return (Throwable) objNewInstance3;
            default:
                Object objNewInstance4 = constructor.newInstance(new Object[0]);
                AbstractC2995aW.o(objNewInstance4, "null cannot be cast to non-null type kotlin.Throwable");
                Throwable th3 = (Throwable) objNewInstance4;
                th3.initCause(th);
                return th3;
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2766Sw
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.f) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
        }
        return a((Throwable) obj);
    }
}
