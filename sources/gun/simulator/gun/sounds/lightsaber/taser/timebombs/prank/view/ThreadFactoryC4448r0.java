package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.util.concurrent.ThreadFactory;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.r0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class ThreadFactoryC4448r0 implements ThreadFactory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4911a;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ThreadFactoryC4448r0() {
        this(1);
        this.f4911a = 1;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        switch (this.f4911a) {
            case 0:
                return new Thread(new RunnableC3252dN(2, this, runnable), "glide-active-resources");
            case 1:
                return new C3216cy(this, runnable, 0);
            default:
                C3216cy c3216cy = new C3216cy(this, runnable, 1);
                c3216cy.setName("csj_video_preload_" + c3216cy.getId());
                c3216cy.setDaemon(true);
                if (AbstractC4648tE.c) {
                    c3216cy.getName();
                }
                return c3216cy;
        }
    }

    public /* synthetic */ ThreadFactoryC4448r0(int i) {
        this.f4911a = i;
    }
}
