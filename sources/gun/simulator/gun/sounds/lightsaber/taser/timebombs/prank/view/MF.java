package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.io.Closeable;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public abstract class MF implements Closeable {
    public static final String[] e = new String[128];

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f3398a;
    public int[] b;
    public String[] c;
    public int[] d;

    static {
        for (int i = 0; i <= 31; i++) {
            e[i] = String.format("\\u%04x", Integer.valueOf(i));
        }
        String[] strArr = e;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
    }

    public final String getPath() {
        int i = this.f3398a;
        int[] iArr = this.b;
        String[] strArr = this.c;
        int[] iArr2 = this.d;
        StringBuilder sb = new StringBuilder("$");
        for (int i2 = 0; i2 < i; i2++) {
            int i3 = iArr[i2];
            if (i3 == 1 || i3 == 2) {
                sb.append('[');
                sb.append(iArr2[i2]);
                sb.append(']');
            } else if (i3 == 3 || i3 == 4 || i3 == 5) {
                sb.append('.');
                String str = strArr[i2];
                if (str != null) {
                    sb.append(str);
                }
            }
        }
        return sb.toString();
    }

    public abstract void h();

    public abstract void k();

    public abstract void m();

    public abstract void n();

    public abstract boolean o();

    public abstract boolean p();

    public abstract double q();

    public abstract int r();

    public abstract String s();

    public abstract int t();

    public final void u(int i) {
        int i2 = this.f3398a;
        int[] iArr = this.b;
        if (i2 == iArr.length) {
            if (i2 == 256) {
                throw new C3770jF("Nesting too deep at " + getPath(), 0);
            }
            this.b = Arrays.copyOf(iArr, iArr.length * 2);
            String[] strArr = this.c;
            this.c = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
            int[] iArr2 = this.d;
            this.d = Arrays.copyOf(iArr2, iArr2.length * 2);
        }
        int[] iArr3 = this.b;
        int i3 = this.f3398a;
        this.f3398a = i3 + 1;
        iArr3[i3] = i;
    }

    public abstract int v(C3692iN c3692iN);

    public abstract void w();

    public abstract void x();

    public final void y(String str) throws C3124bu {
        StringBuilder sbQ = DM.q(str, " at path ");
        sbQ.append(getPath());
        throw new C3124bu(sbQ.toString());
    }
}
