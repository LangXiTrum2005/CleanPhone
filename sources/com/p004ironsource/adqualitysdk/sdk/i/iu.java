package com.p004ironsource.adqualitysdk.sdk.i;

import android.text.TextUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public final class iu {

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private String f2485;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private long f2486;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private b f2487;

    public static class b {

        /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
        private String f2488;

        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
        private int f2489;

        public b(int i2, String str) {
            this.f2489 = i2;
            this.f2488 = str;
        }

        /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
        public final int m2450() {
            return this.f2489;
        }

        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
        public final String m2451() {
            return this.f2488;
        }
    }

    public iu(String str, int i2, String str2, long j) {
        this.f2485 = str;
        this.f2486 = j;
        this.f2487 = new b(i2, str2);
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public final JSONObject m2446() throws JSONException {
        return !TextUtils.isEmpty(this.f2485) ? new JSONObject(this.f2485) : new JSONObject();
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public final long m2447() {
        return this.f2486;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public final String m2448() {
        return this.f2485;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final b m2449() {
        return this.f2487;
    }
}
