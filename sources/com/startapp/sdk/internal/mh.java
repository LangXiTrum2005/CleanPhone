package com.startapp.sdk.internal;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class mh {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final mh f41255b = new mh();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final JSONObject f41256a;

    public mh() {
        this.f41256a = new JSONObject();
    }

    public final void a(int i2, Object obj) {
        try {
            this.f41256a.put(String.valueOf(i2), obj);
        } catch (JSONException unused) {
        }
    }

    public final String a(int i2) {
        Object objOpt = this.f41256a.opt(String.valueOf(i2));
        if (objOpt != null) {
            return objOpt.toString();
        }
        return null;
    }

    public mh(JSONObject jSONObject) {
        this.f41256a = jSONObject;
    }
}
