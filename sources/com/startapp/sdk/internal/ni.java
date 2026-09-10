package com.startapp.sdk.internal;

import org.json.JSONArray;
import org.json.JSONException;

/* JADX INFO: loaded from: classes6.dex */
public final class ni implements i7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ JSONArray f41279a;

    public ni(JSONArray jSONArray) {
        this.f41279a = jSONArray;
    }

    @Override // com.startapp.sdk.internal.i7
    public final Object a(Object obj) {
        try {
            return this.f41279a.getJSONObject(((Integer) obj).intValue());
        } catch (JSONException e2) {
            throw new RuntimeException(e2);
        }
    }
}
