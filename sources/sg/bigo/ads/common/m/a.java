package sg.bigo.ads.common.m;

import sg.bigo.ads.common.utils.q;

/* JADX INFO: loaded from: classes7.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int[] f47318a = {1, 3, 4, 2, 7, 9, 10};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int[] f47319b = {2, 7, 9, 10};

    public static boolean a() {
        String str;
        String strValueOf;
        String strConcat;
        if (b()) {
            String strB = b.b();
            if (!q.a((CharSequence) strB)) {
                if (strB.length() < 11) {
                    strConcat = "purposeConsents length < 11, so return false";
                } else {
                    int[] iArr = f47318a;
                    int length = iArr.length;
                    int i2 = 0;
                    while (true) {
                        if (i2 < length) {
                            int i3 = iArr[i2];
                            if (strB.charAt(i3 - 1) == '0') {
                                str = "purposeConsents return false ,the checkBit is: ";
                                strValueOf = String.valueOf(i3);
                            } else {
                                i2++;
                            }
                        }
                        strConcat = str.concat(strValueOf);
                    }
                }
                sg.bigo.ads.common.t.a.a(0, 3, "GdprHelper", strConcat);
                return false;
            }
            sg.bigo.ads.common.t.a.a(0, 3, "GdprHelper", "purposeConsents is empty, so return true");
            String strD = b.d();
            if (!q.a((CharSequence) strD)) {
                if (strD.length() < 11) {
                    strConcat = "purposeLegitimateInterests length < 11, so return false";
                } else {
                    for (int i4 : f47319b) {
                        if (strD.charAt(i4 - 1) == '0') {
                            str = "purposeLegitimateInterests return false ,the checkBit is: ";
                            strValueOf = String.valueOf(i4);
                            strConcat = str.concat(strValueOf);
                        }
                    }
                }
                sg.bigo.ads.common.t.a.a(0, 3, "GdprHelper", strConcat);
                return false;
            }
            sg.bigo.ads.common.t.a.a(0, 3, "GdprHelper", "purposeLegitimateInterests is empty, so return true");
        }
        return true;
    }

    public static boolean b() {
        return b.c() == 1;
    }
}
