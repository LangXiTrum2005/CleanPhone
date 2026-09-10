package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.nio.charset.Charset;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes4.dex */
public final class RO {
    public static final Pattern c = Pattern.compile("([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)/([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)");
    public static final Pattern d = Pattern.compile(";\\s*(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)=(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)|\"([^\"]*)\"))?");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f3657a;
    public final String[] b;

    public RO(String str, String[] strArr) {
        this.f3657a = str;
        this.b = strArr;
    }

    public final Charset a(Charset charset) {
        String str;
        String[] strArr = this.b;
        int i = 0;
        int iM = AbstractC2995aW.M(0, strArr.length - 1, 2);
        if (iM < 0) {
            str = null;
            break;
        }
        while (true) {
            int i2 = i + 2;
            if (AbstractC3089ba0.o0(strArr[i], "charset")) {
                str = strArr[i + 1];
                break;
            }
            if (i == iM) {
                str = null;
                break;
            }
            i = i2;
        }
        if (str == null) {
            return charset;
        }
        try {
            return Charset.forName(str);
        } catch (IllegalArgumentException unused) {
            return charset;
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof RO) && AbstractC2995aW.i(((RO) obj).f3657a, this.f3657a);
    }

    public final int hashCode() {
        return this.f3657a.hashCode();
    }

    public final String toString() {
        return this.f3657a;
    }
}
