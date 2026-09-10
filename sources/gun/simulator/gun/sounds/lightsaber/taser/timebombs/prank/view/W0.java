package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.nio.charset.StandardCharsets;

/* JADX INFO: loaded from: classes4.dex */
public final class W0 implements InterfaceC2647Oh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AbstractApplicationC2673Ph f3902a;
    public final /* synthetic */ String b;
    public final /* synthetic */ String c;
    public final /* synthetic */ X0 d;

    public W0(X0 x0, AbstractApplicationC2673Ph abstractApplicationC2673Ph, String str, String str2) {
        this.d = x0;
        this.f3902a = abstractApplicationC2673Ph;
        this.b = str;
        this.c = str2;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2647Oh
    public final void a() {
        String str = this.d.f;
        byte[] bArr = {-9, 28, -41, -48, -45, 26, 45, -19, -32, 28, -123, -38, -40, 29, 45, -51, -23, 24, -55, -54, -59, 17, 9, -23, -11, 26, -64, -35, -62, 21, 62, -23, -56, 23, -55, -38, -40, 17, 121, -22, -30, com.umeng.analytics.pro.cw.k, -58, -37, -16, 21, 48, -32};
        byte[] bArr2 = {-121, 121, -91, -77, -74, 116, 89, -116};
        int length = bArr.length;
        int length2 = bArr2.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            if (i2 >= length2) {
                i2 = 0;
            }
            bArr[i] = (byte) (bArr[i] ^ bArr2[i2]);
            i++;
            i2++;
        }
        new String(bArr, StandardCharsets.UTF_8);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2647Oh
    public final void b() {
        C2328Bz.u().t(new RunnableC5099yP(this, this.f3902a, this.b, this.c, 7));
    }
}
