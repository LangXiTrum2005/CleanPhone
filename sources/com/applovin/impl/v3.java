package com.applovin.impl;

import android.text.TextUtils;
import com.applovin.mediation.MaxAdFormat;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public class v3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private a f9884a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f9885b;

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public enum a {
        AD_UNIT_ID,
        AD_FORMAT,
        AD
    }

    public v3(a aVar, String str) {
        this.f9884a = aVar;
        this.f9885b = str;
    }

    public a a() {
        return this.f9884a;
    }

    public String b() {
        return this.f9885b;
    }

    public static v3 a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return new v3(a.AD_UNIT_ID, str);
    }

    public static v3 a(MaxAdFormat maxAdFormat) {
        String label = maxAdFormat.getLabel();
        if (TextUtils.isEmpty(label)) {
            return null;
        }
        return new v3(a.AD_FORMAT, label);
    }

    public static v3 a(a3 a3Var) {
        String strT = a3Var.T();
        MaxAdFormat format = a3Var.getFormat();
        if (TextUtils.isEmpty(strT) || format == null) {
            return null;
        }
        return new s3(new l3(strT, format));
    }
}
