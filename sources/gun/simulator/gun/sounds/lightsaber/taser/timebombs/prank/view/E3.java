package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.nio.charset.StandardCharsets;

/* JADX INFO: loaded from: classes4.dex */
public final class E3 implements NS {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ NS f3003a;
    public final /* synthetic */ H3 b;

    public E3(H3 h3, C4542s3 c4542s3) {
        this.b = h3;
        this.f3003a = c4542s3;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC5085yB
    public final void a(A70 a70) {
        H3 h3 = this.b;
        String str = h3.f4440a;
        byte[] bArr = {-108, -111, -127, 39, 43, -12, -119, 5, -121, -112, -42, 49, 56, -7, -104, 32, -94, -72, -103, 39, 61, -11, -120, 32, -88, -112, -91, 46, 54, -25, -52, com.umeng.analytics.pro.cw.l, -88, -75, -110, 0, 56, -7, -128, 4, -94, -96, -103, 10, 54, -15, -120, 91, -26, -58};
        byte[] bArr2 = {-58, -12, -10, 70, 89, -112, -20, 97};
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
        this.f3003a.a(a70);
        h3.g = null;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC5085yB
    public final void b(InterfaceC3240dB interfaceC3240dB) {
        Bn0 bn0 = (Bn0) interfaceC3240dB;
        H3 h3 = this.b;
        String str = h3.f4440a;
        byte[] bArr = {-30, -68, 82, -3, 47, -100, -50, -85, -15, -67, 5, -21, 60, -111, -33, -114, -44, -107, 74, -3, 57, -99, -49, -114, -34, -67, 118, -12, 50, -113, -117, -96, -34, -104, 65, -48, 50, -103, -49, -86, -44, -29, 5, -83};
        byte[] bArr2 = {-80, -39, 37, -100, 93, -8, -85, -49};
        int i = 0;
        int i2 = 0;
        while (i < 44) {
            if (i2 >= 8) {
                i2 = 0;
            }
            bArr[i] = (byte) (bArr[i] ^ bArr2[i2]);
            i++;
            i2++;
        }
        new String(bArr, StandardCharsets.UTF_8);
        this.f3003a.b(bn0);
        h3.g = null;
    }
}
