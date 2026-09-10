package com.facebook.ads.redexgen.core;

import com.google.common.base.ElementTypesAreNonnullByDefault;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.k7, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
@ElementTypesAreNonnullByDefault
public abstract class AbstractC2495k7 {
    public static String[] A00 = {"lKk5JaLmUx95KK", "mYuNW", "CjAKdLXppofA1D702KwO", "uXJpTDaVRtNVAp70rLVfm", "1hSAC5HvnjUxrHV2J", "HaqnzSsBrGrjOCqNCVI", "GKVrteGYxon0I6T9VCiXJnLEHrJ03INP", "n4WaWuAzWRB0VbcGBeRJywBcIsl3WCc7"};

    public static int A00(char c2) {
        return (char) ((c2 | ' ') - 97);
    }

    public static String A01(String string) {
        int length = string.length();
        int i2 = 0;
        while (i2 < length) {
            if (A02(string.charAt(i2))) {
                char[] chars = string.toCharArray();
                while (i2 < length) {
                    char c2 = chars[i2];
                    if (A02(c2)) {
                        int length2 = c2 ^ ' ';
                        chars[i2] = (char) length2;
                    }
                    i2++;
                }
                String strValueOf = String.valueOf(chars);
                int i3 = A00[5].length();
                if (i3 == 28) {
                    throw new RuntimeException();
                }
                A00[5] = "jxLLbSZUx5pXLcCA85YTs8Y";
                return strValueOf;
            }
            i2++;
        }
        return string;
    }

    public static boolean A02(char c2) {
        return c2 >= 'A' && c2 <= 'Z';
    }

    public static boolean A03(CharSequence s1, CharSequence s2) {
        int length = s1.length();
        if (s1 == s2) {
            return true;
        }
        int length2 = s2.length();
        if (length != length2) {
            return false;
        }
        for (int i2 = 0; i2 < length; i2++) {
            char cCharAt = s1.charAt(i2);
            char cCharAt2 = s2.charAt(i2);
            if (cCharAt != cCharAt2) {
                int iA00 = A00(cCharAt);
                if (A00[6].charAt(27) != '0') {
                    throw new RuntimeException();
                }
                A00[6] = "1S1N8LGAQqFvlHlBSY2lJ7CUB7v0Wvcl";
                if (iA00 < 26) {
                    int length3 = A00(cCharAt2);
                    if (iA00 == length3) {
                    }
                }
                return false;
            }
        }
        return true;
    }
}
