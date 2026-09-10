package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.io.IOException;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.dp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3294dp extends AbstractC4883vw {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f4293a;
    public final /* synthetic */ C3821jp b;
    public final /* synthetic */ C3383ep c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3294dp(C5164z6 c5164z6, C3821jp c3821jp, C3383ep c3383ep) {
        super(c5164z6);
        this.b = c3821jp;
        this.c = c3383ep;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC4883vw, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        super.close();
        if (this.f4293a) {
            return;
        }
        this.f4293a = true;
        C3821jp c3821jp = this.b;
        C3383ep c3383ep = this.c;
        synchronized (c3821jp) {
            int i = c3383ep.h - 1;
            c3383ep.h = i;
            if (i == 0 && c3383ep.f) {
                c3821jp.u(c3383ep);
            }
        }
    }
}
