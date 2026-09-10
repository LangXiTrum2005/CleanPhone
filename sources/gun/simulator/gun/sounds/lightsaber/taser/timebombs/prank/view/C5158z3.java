package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.app.Dialog;
import android.content.Context;
import java.nio.charset.StandardCharsets;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.z3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C5158z3 implements HS {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5313a;
    public final /* synthetic */ D3 b;
    public final /* synthetic */ HS c;
    public final /* synthetic */ C3 d;

    public C5158z3(C3 c3, int i, D3 d3, HS hs) {
        this.d = c3;
        this.f5313a = i;
        this.b = d3;
        this.c = hs;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4821vB
    public final void d(A70 a70) {
        HS hs = this.c;
        if (hs != null) {
            hs.d(a70);
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4821vB
    public final void e(InterfaceC3240dB interfaceC3240dB) {
        Sm0 sm0 = (Sm0) interfaceC3240dB;
        String str = this.d.f4440a;
        byte[] bArr = {-22, 109, 40, 7, -93, -23, -49, -29, -125, 97, 57, 4, -66, -24, -21, -44, -53, 108, 43, 43, -73, -42, -31, -26, -57, 102, 56};
        byte[] bArr2 = {-93, 3, 92, 98, -47, -102, -114, -121};
        int i = 0;
        int i2 = 0;
        while (i < 27) {
            if (i2 >= 8) {
                i2 = 0;
            }
            bArr[i] = (byte) (bArr[i] ^ bArr2[i2]);
            i++;
            i2++;
        }
        new String(bArr, StandardCharsets.UTF_8);
        HS hs = this.c;
        if (hs != null) {
            hs.e(sm0);
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4821vB
    public final void h(boolean z) {
        D3 d3;
        Dialog dialog;
        int i = this.f5313a;
        HS hs = this.c;
        if (i == 2 && (dialog = (d3 = this.b).g) != null && z) {
            dialog.show();
            C4981x20.u().v(d3.h, new BW(d3, hs, z));
        } else if (hs != null) {
            hs.h(z);
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4821vB
    public final void onAdClicked() {
        Context contextJ = X0.j.j();
        D3 d3 = this.b;
        this.d.n(contextJ, (C3491g4) d3.f3354a, (String) d3.b);
        HS hs = this.c;
        if (hs != null) {
            hs.onAdClicked();
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4821vB
    public final void onAdClosed() {
        HS hs = this.c;
        if (hs != null) {
            hs.onAdClosed();
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4821vB
    public final void onAdImpression() {
        HS hs = this.c;
        if (hs != null) {
            hs.onAdImpression();
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4821vB
    public final void onAdShowed() {
        Context contextJ = X0.j.j();
        D3 d3 = this.b;
        this.d.E(contextJ, (C3491g4) d3.f3354a, (String) d3.b);
        HS hs = this.c;
        if (hs != null) {
            hs.onAdShowed();
        }
    }
}
