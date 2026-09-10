package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.util.concurrent.ThreadFactory;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class Pg0 implements ThreadFactory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f3565a;
    public final /* synthetic */ boolean b;

    public /* synthetic */ Pg0(String str, boolean z) {
        this.f3565a = str;
        this.b = z;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        String str = this.f3565a;
        AbstractC2995aW.q(str, "$name");
        Thread thread = new Thread(runnable, str);
        thread.setDaemon(this.b);
        return thread;
    }
}
