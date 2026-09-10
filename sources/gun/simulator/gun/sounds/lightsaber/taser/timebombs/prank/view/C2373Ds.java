package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.util.Base64;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Ds, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C2373Ds implements Ca0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2994a;

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Ca0
    public final Object get() {
        switch (this.f2994a) {
            case 0:
                return new C4696tn();
            default:
                byte[] bArr = new byte[12];
                C2446Gn.h.nextBytes(bArr);
                return Base64.encodeToString(bArr, 10);
        }
    }
}
