package com.umeng.analytics.pro;

import android.text.TextUtils;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class aq implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f2496a = "https://aspect-upush.umeng.com/occa/v1/event/report";
    public static final String b = "https://cnlogs.umeng.com/ext_event";
    private String c;
    private String d;

    public aq(String str, JSONObject jSONObject) {
        this.c = str;
        this.d = jSONObject.toString();
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            if (TextUtils.isEmpty(this.d)) {
                return;
            }
            ap.b(this.c, this.d.getBytes());
        } catch (Throwable unused) {
        }
    }
}
