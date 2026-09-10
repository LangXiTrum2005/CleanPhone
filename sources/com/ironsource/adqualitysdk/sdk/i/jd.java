package com.ironsource.adqualitysdk.sdk.i;

import android.text.TextUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class jd {

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private String f2655;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private long f2656;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private d f2657;

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static class d {

        /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
        private String f2658;

        /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
        private int f2659;

        public d(int i10, String str) {
            this.f2659 = i10;
            this.f2658 = str;
        }

        /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
        public final String m2575() {
            return this.f2658;
        }

        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
        public final int m2576() {
            return this.f2659;
        }
    }

    public jd(String str, int i10, String str2, long j10) {
        this.f2655 = str;
        this.f2656 = j10;
        this.f2657 = new d(i10, str2);
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public final d m2571() {
        return this.f2657;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public final String m2572() {
        return this.f2655;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final long m2573() {
        return this.f2656;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final JSONObject m2574() throws JSONException {
        return !TextUtils.isEmpty(this.f2655) ? new JSONObject(this.f2655) : new JSONObject();
    }
}
