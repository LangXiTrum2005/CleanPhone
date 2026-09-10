package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.nio.charset.StandardCharsets;

/* JADX INFO: loaded from: classes4.dex */
public final class V0 implements InterfaceC2647Oh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AbstractApplicationC2673Ph f3853a;
    public final /* synthetic */ X0 b;

    public V0(X0 x0, AbstractApplicationC2673Ph abstractApplicationC2673Ph) {
        this.b = x0;
        this.f3853a = abstractApplicationC2673Ph;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2647Oh
    public final void a() {
        String str = this.b.f;
        byte[] bArr = {-89, -17, -46, 58, 92, 103, -1, 65, -81, -27, -122, 54, 64, 120, -22, 127, -117, -20, -55, 43, 75, 88, -16, 89, -117, -13, -48, 62, 66, 69, -9, 64, -117, -95, -64, 58, 90, 114, -10, 107, -113, -24, -54};
        byte[] bArr2 = {-18, -127, -90, 95, 46, 17, -98, 45};
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
        C2328Bz.u().t(new Ff0(25, this, this.f3853a));
    }
}
