package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.nio.charset.Charset;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes4.dex */
public final class MY {
    public static LY a(String str, RO ro) {
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
        byte[] bytes = str.getBytes(charset);
        AbstractC2995aW.p(bytes, "this as java.lang.String).getBytes(charset)");
        return b(bytes, ro, 0, bytes.length);
    }

    public static LY b(byte[] bArr, RO ro, int i, int i2) {
        AbstractC2995aW.q(bArr, "<this>");
        long length = bArr.length;
        long j = i;
        long j2 = i2;
        byte[] bArr2 = Vg0.f3884a;
        if ((j | j2) < 0 || j > length || length - j < j2) {
            throw new ArrayIndexOutOfBoundsException();
        }
        return new LY(ro, bArr, i2, i);
    }

    public static LY c(MY my, RO ro, byte[] bArr, int i, int i2) {
        if ((i2 & 4) != 0) {
            i = 0;
        }
        int length = bArr.length;
        my.getClass();
        AbstractC2995aW.q(bArr, "content");
        return b(bArr, ro, i, length);
    }

    public static /* synthetic */ LY d(MY my, byte[] bArr, RO ro, int i, int i2) {
        if ((i2 & 1) != 0) {
            ro = null;
        }
        if ((i2 & 2) != 0) {
            i = 0;
        }
        int length = bArr.length;
        my.getClass();
        return b(bArr, ro, i, length);
    }
}
