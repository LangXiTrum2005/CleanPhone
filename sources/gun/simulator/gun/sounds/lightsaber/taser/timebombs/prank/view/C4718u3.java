package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.content.Context;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.u3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C4718u3 implements GS {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f5061a;
    public final /* synthetic */ C4982x3 b;

    public C4718u3(C4982x3 c4982x3, Context context) {
        this.b = c4982x3;
        this.f5061a = context;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC5085yB
    public final void b(InterfaceC3240dB interfaceC3240dB) {
        Context applicationContext = this.f5061a.getApplicationContext();
        String str = AbstractC3661i1.f4483a;
        this.b.I(applicationContext, (Sm0) interfaceC3240dB, str);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC5085yB
    public final void a(A70 a70) {
    }
}
