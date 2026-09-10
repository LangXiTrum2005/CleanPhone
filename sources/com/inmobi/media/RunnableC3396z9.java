package com.inmobi.media;

import org.json.JSONObject;

/* JADX INFO: renamed from: com.inmobi.media.z9, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class RunnableC3396z9 implements Runnable {
    public final /* synthetic */ JSONObject a;

    public RunnableC3396z9(JSONObject jSONObject) {
        this.a = jSONObject;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (Ok.c()) {
            return;
        }
        F9.a(this.a);
    }
}
