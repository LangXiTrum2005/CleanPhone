package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.io.FileInputStream;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.nC, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C4119nC implements InterfaceC4207oC {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.bumptech.glide.load.data.a f4734a;
    public final /* synthetic */ C4391qK b;

    public /* synthetic */ C4119nC(com.bumptech.glide.load.data.a aVar, C4391qK c4391qK) {
        this.f4734a = aVar;
        this.b = c4391qK;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4207oC
    public final int g(InterfaceC3943lC interfaceC3943lC) throws Throwable {
        C4391qK c4391qK = this.b;
        com.bumptech.glide.load.data.a aVar = this.f4734a;
        VX vx = null;
        try {
            VX vx2 = new VX(new FileInputStream(aVar.c().getFileDescriptor()), c4391qK);
            try {
                int iC = interfaceC3943lC.c(vx2, c4391qK);
                vx2.release();
                aVar.c();
                return iC;
            } catch (Throwable th) {
                th = th;
                vx = vx2;
                if (vx != null) {
                    vx.release();
                }
                aVar.c();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }
}
