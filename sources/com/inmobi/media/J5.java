package com.inmobi.media;

import com.inmobi.unifiedId.InMobiUnifiedIdService;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public final class J5 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ JSONObject f22902a;

    public J5(JSONObject jSONObject) {
        this.f22902a = jSONObject;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Boolean boolC = C3246te.f24014a.c();
        boolean zBooleanValue = boolC != null ? boolC.booleanValue() : true;
        if (zBooleanValue) {
            InMobiUnifiedIdService.reset();
        }
        if (zBooleanValue) {
            return;
        }
        Q5.a(this.f22902a);
    }
}
