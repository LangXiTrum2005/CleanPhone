package com.inmobi.media;

import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import java.util.concurrent.ScheduledExecutorService;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.inmobi.media.d1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C2977d1 extends T5 {
    public final int g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f23506h;

    public C2977d1(String str, int i2, String trace) {
        Intrinsics.f(trace, "trace");
        StringBuilder sb = new StringBuilder("reason - ");
        sb.append(i2);
        sb.append(" description - ");
        sb.append(str == null ? "ApplicationExit" : str);
        String message = sb.toString();
        ScheduledExecutorService scheduledExecutorService = Ie.f22893a;
        Intrinsics.f(message, "message");
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("name", "AppExitEvent");
            jSONObject.put(PglCryptUtils.KEY_MESSAGE, message);
            jSONObject.put("stack", trace);
        } catch (JSONException e2) {
            e2.toString();
        }
        String string = jSONObject.toString();
        Intrinsics.e(string, "toString(...)");
        super("AppExitReasonReporting", "AppExitReasonEvent", string);
        this.g = i2;
        this.f23506h = trace;
    }
}
