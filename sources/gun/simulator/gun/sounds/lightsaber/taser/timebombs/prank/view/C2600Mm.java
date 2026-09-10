package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.content.Context;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Mm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2600Mm implements InterfaceC4341pl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f3422a;
    public final InterfaceC4341pl b;

    public C2600Mm(Context context) {
        C3817jn c3817jn = new C3817jn();
        this.f3422a = context.getApplicationContext();
        this.b = c3817jn;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4341pl
    public final InterfaceC4429ql createDataSource() {
        return new C2626Nm(this.f3422a, this.b.createDataSource());
    }
}
