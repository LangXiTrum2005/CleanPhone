package com.google.thirdparty.publicsuffix;

import com.google.common.base.Joiner;
import com.google.common.collect.ImmutableMap;
import java.util.ArrayDeque;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
final class TrieParser {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Joiner f21330a = new Joiner("");

    public static int a(ArrayDeque arrayDeque, String str, int i2, ImmutableMap.Builder builder) {
        PublicSuffixType publicSuffixType;
        int length = str.length();
        int i3 = 0;
        int i4 = i2;
        char cCharAt = 0;
        while (i4 < length && (cCharAt = str.charAt(i4)) != '&' && cCharAt != '?' && cCharAt != '!' && cCharAt != ':' && cCharAt != ',') {
            i4++;
        }
        arrayDeque.push(new StringBuilder(str.subSequence(i2, i4)).reverse());
        if (cCharAt == '!' || cCharAt == '?' || cCharAt == ':' || cCharAt == ',') {
            String strC = f21330a.c(arrayDeque);
            if (strC.length() > 0) {
                PublicSuffixType[] publicSuffixTypeArrValues = PublicSuffixType.values();
                int length2 = publicSuffixTypeArrValues.length;
                while (true) {
                    if (i3 >= length2) {
                        throw new IllegalArgumentException("No enum corresponding to given code: " + cCharAt);
                    }
                    publicSuffixType = publicSuffixTypeArrValues[i3];
                    if (publicSuffixType.X == cCharAt || publicSuffixType.f21329Y == cCharAt) {
                        break;
                    }
                    i3++;
                }
                builder.c(strC, publicSuffixType);
            }
        }
        int iA = i4 + 1;
        if (cCharAt != '?' && cCharAt != ',') {
            while (iA < length) {
                iA += a(arrayDeque, str, iA, builder);
                if (str.charAt(iA) == '?' || str.charAt(iA) == ',') {
                    iA++;
                    break;
                }
            }
        }
        arrayDeque.pop();
        return iA - i2;
    }

    public static void b(CharSequence... charSequenceArr) {
        Joiner joiner = f21330a;
        joiner.getClass();
        String strC = joiner.c(Arrays.asList(charSequenceArr));
        ImmutableMap.Builder builderD = ImmutableMap.d();
        int length = strC.length();
        for (int iA = 0; iA < length; iA += a(new ArrayDeque(), strC, iA, builderD)) {
        }
        builderD.a(true);
    }
}
