package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
public final class NF {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public char[] f3448a;
    public int b;

    public final void a(int i, int i2) {
        int i3 = i2 + i;
        char[] cArr = this.f3448a;
        if (cArr.length <= i3) {
            int i4 = i * 2;
            if (i3 < i4) {
                i3 = i4;
            }
            char[] cArrCopyOf = Arrays.copyOf(cArr, i3);
            AbstractC2995aW.p(cArrCopyOf, "copyOf(this, newSize)");
            this.f3448a = cArrCopyOf;
        }
    }

    public final void b() {
        C4415qe c4415qe = C4415qe.f4892a;
        char[] cArr = this.f3448a;
        AbstractC2995aW.q(cArr, "array");
        synchronized (c4415qe) {
            int i = C4415qe.c;
            if (cArr.length + i < C4415qe.d) {
                C4415qe.c = i + cArr.length;
                C4415qe.b.addLast(cArr);
            }
        }
    }

    public final void c(String str) {
        AbstractC2995aW.q(str, MimeTypes.BASE_TYPE_TEXT);
        int length = str.length();
        if (length == 0) {
            return;
        }
        a(this.b, length);
        str.getChars(0, str.length(), this.f3448a, this.b);
        this.b += length;
    }

    public final String toString() {
        return new String(this.f3448a, 0, this.b);
    }
}
