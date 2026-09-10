package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes2.dex */
public final class Il0 {
    public static final Pattern c = Pattern.compile("\\[voice=\"([^\"]*)\"\\]");
    public static final Pattern d = Pattern.compile("^((?:[0-9]*\\.)?[0-9]+)(px|em|%)$");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final JT f3237a = new JT();
    public final StringBuilder b = new StringBuilder();

    public static String a(JT jt, StringBuilder sb) {
        boolean z = false;
        sb.setLength(0);
        int i = jt.b;
        int i2 = jt.c;
        while (i < i2 && !z) {
            char c2 = (char) jt.f3266a[i];
            if ((c2 < 'A' || c2 > 'Z') && ((c2 < 'a' || c2 > 'z') && !((c2 >= '0' && c2 <= '9') || c2 == '#' || c2 == '-' || c2 == '.' || c2 == '_'))) {
                z = true;
            } else {
                i++;
                sb.append(c2);
            }
        }
        jt.F(i - jt.b);
        return sb.toString();
    }

    public static String b(JT jt, StringBuilder sb) {
        c(jt);
        if (jt.a() == 0) {
            return null;
        }
        String strA = a(jt, sb);
        if (!"".equals(strA)) {
            return strA;
        }
        return "" + ((char) jt.t());
    }

    public static void c(JT jt) {
        while (true) {
            for (boolean z = true; jt.a() > 0 && z; z = false) {
                int i = jt.b;
                byte[] bArr = jt.f3266a;
                byte b = bArr[i];
                char c2 = (char) b;
                if (c2 == '\t' || c2 == '\n' || c2 == '\f' || c2 == '\r' || c2 == ' ') {
                    jt.F(1);
                } else {
                    int i2 = jt.c;
                    int i3 = i + 2;
                    if (i3 <= i2) {
                        int i4 = i + 1;
                        if (b == 47 && bArr[i4] == 42) {
                            while (true) {
                                int i5 = i3 + 1;
                                if (i5 >= i2) {
                                    break;
                                }
                                if (((char) bArr[i3]) == '*' && ((char) bArr[i5]) == '/') {
                                    i3 += 2;
                                    i2 = i3;
                                } else {
                                    i3 = i5;
                                }
                            }
                            jt.F(i2 - jt.b);
                        }
                    }
                }
            }
            return;
        }
    }
}
