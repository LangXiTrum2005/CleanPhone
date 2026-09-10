package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.util.concurrent.Callable;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.qj0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C4426qj0 {
    private C4426qj0() {
    }

    public /* synthetic */ C4426qj0(AbstractC2471Hm abstractC2471Hm) {
        this();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final <T> Callable<T> getWrappedCallableWithFallback(Callable<T> callable, InterfaceC2714Qw interfaceC2714Qw) {
        return new GJ(5, callable, interfaceC2714Qw);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: getWrappedCallableWithFallback$lambda-0, reason: not valid java name */
    public static final Object m271getWrappedCallableWithFallback$lambda0(Callable callable, InterfaceC2714Qw interfaceC2714Qw) {
        AbstractC2995aW.q(callable, "$command");
        AbstractC2995aW.q(interfaceC2714Qw, "$failFallback");
        try {
            return callable.call();
        } catch (OutOfMemoryError unused) {
            interfaceC2714Qw.invoke();
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final InterfaceRunnableC4513rj0 getWrappedRunnableWithFail(Runnable runnable, Runnable runnable2) {
        return runnable instanceof KV ? new C4250oj0(runnable, runnable2) : new C4338pj0(runnable, runnable2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void wrapRunnableWithFail(Runnable runnable, Runnable runnable2) {
        try {
            runnable.run();
        } catch (OutOfMemoryError unused) {
            runnable2.run();
        }
    }
}
