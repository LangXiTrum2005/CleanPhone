package com.google.android.gms.internal.ads;

import android.text.TextUtils;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class dm {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final dm f13579b = new dm(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final dm f13580c = new dm(1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final dm f13581d = new dm(2);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13582a;

    public /* synthetic */ dm(int i10) {
        this.f13582a = i10;
    }

    public static final String b(String str) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        int length = str.length();
        int i10 = 0;
        int i11 = 0;
        while (i11 < str.length() && str.charAt(i11) == ',') {
            i11++;
        }
        while (length > 0) {
            int i12 = length - 1;
            if (str.charAt(i12) != ',') {
                break;
            }
            length = i12;
        }
        if (length < i11) {
            return null;
        }
        if (i11 != 0) {
            i10 = i11;
        } else if (length == str.length()) {
            return str;
        }
        return str.substring(i10, length);
    }

    public final String a(String str, String str2) {
        switch (this.f13582a) {
            case 0:
                return str2;
            case 1:
                return str != null ? str : str2;
            default:
                String strB = b(str);
                String strB2 = b(str2);
                if (TextUtils.isEmpty(strB)) {
                    return strB2;
                }
                if (TextUtils.isEmpty(strB2)) {
                    return strB;
                }
                return q4.a.j(new StringBuilder(String.valueOf(strB).length() + 1 + String.valueOf(strB2).length()), strB, ",", strB2);
        }
    }
}
