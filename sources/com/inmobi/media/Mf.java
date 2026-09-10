package com.inmobi.media;

import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import java.util.concurrent.ScheduledExecutorService;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public final class mf extends T5 {
    public final StackTraceElement[] g;

    public mf(StackTraceElement[] stackTrace) {
        Intrinsics.f(stackTrace, "stackTrace");
        ScheduledExecutorService scheduledExecutorService = Ie.f22893a;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("name", "Blocked");
            jSONObject.put(PglCryptUtils.KEY_MESSAGE, "MainThreadBlocked");
            jSONObject.put("stack", Ie.a(stackTrace));
        } catch (JSONException e2) {
            e2.toString();
        }
        String string = jSONObject.toString();
        Intrinsics.e(string, "toString(...)");
        super("ANRWatchDog", "ANRWatchDogEvent", string);
        this.g = stackTrace;
    }
}
