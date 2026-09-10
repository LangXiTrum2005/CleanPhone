package ads_mobile_sdk;

import saneness.transpositive;
import saneness.utwa;

/* JADX INFO: loaded from: classes.dex */
public final class mc2 implements utwa {
    public final transpositive a;
    public final String b;
    public final Object[] c;
    public final int d;

    public mc2(xm0 xm0Var, String str, Object[] objArr) {
        this.a = xm0Var;
        this.b = str;
        this.c = objArr;
        char cCharAt = str.charAt(0);
        if (cCharAt < 55296) {
            this.d = cCharAt;
            return;
        }
        int i = cCharAt & 8191;
        int i2 = 13;
        int i3 = 1;
        while (true) {
            int i4 = i3 + 1;
            char cCharAt2 = str.charAt(i3);
            if (cCharAt2 < 55296) {
                this.d = i | (cCharAt2 << i2);
                return;
            } else {
                i |= (cCharAt2 & 8191) << i2;
                i2 += 13;
                i3 = i4;
            }
        }
    }

    public final transpositive a() {
        return this.a;
    }

    public final Object[] b() {
        return this.c;
    }

    public final String c() {
        return this.b;
    }

    public final int d() {
        int i = this.d;
        if ((i & 1) != 0) {
            return 1;
        }
        return (i & 4) == 4 ? 3 : 2;
    }
}
