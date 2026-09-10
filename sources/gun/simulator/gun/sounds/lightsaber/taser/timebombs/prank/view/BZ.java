package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.nio.charset.Charset;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes4.dex */
public final class BZ {
    public static AZ a(InterfaceC2460Hb interfaceC2460Hb, RO ro, long j) {
        AbstractC2995aW.q(interfaceC2460Hb, "<this>");
        return new AZ(ro, j, interfaceC2460Hb);
    }

    public static AZ b(String str, RO ro) {
        AbstractC2995aW.q(str, "<this>");
        Charset charset = AbstractC2307Be.f2881a;
        if (ro != null) {
            Pattern pattern = RO.c;
            Charset charsetA = ro.a(null);
            if (charsetA == null) {
                ro = C3887ke.u(ro + "; charset=utf-8");
            } else {
                charset = charsetA;
            }
        }
        C4848vb c4848vb = new C4848vb();
        AbstractC2995aW.q(charset, "charset");
        c4848vb.W(str, 0, str.length(), charset);
        return a(c4848vb, ro, c4848vb.b);
    }

    public static AZ c(byte[] bArr, RO ro) {
        AbstractC2995aW.q(bArr, "<this>");
        C4848vb c4848vb = new C4848vb();
        c4848vb.y(bArr, 0, bArr.length);
        return a(c4848vb, ro, bArr.length);
    }
}
