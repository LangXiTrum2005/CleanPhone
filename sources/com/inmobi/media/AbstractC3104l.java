package com.inmobi.media;

import android.net.Uri;
import java.io.File;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.inmobi.media.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC3104l {
    public static String a(C3072j asset, File file, long j, long j2) {
        Intrinsics.f(asset, "asset");
        Intrinsics.f(file, "file");
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("url", asset.f23703b);
            jSONObject.put("saved_url", Uri.fromFile(file));
            jSONObject.put("size_in_bytes", file.length());
            jSONObject.put("download_started_at", j);
            jSONObject.put("download_ended_at", j2);
        } catch (JSONException e2) {
            S5 s5 = S5.f23167a;
            S5.d.a(new C3011f2(e2));
        }
        String string = jSONObject.toString();
        Intrinsics.e(string, "toString(...)");
        return StringsKt.I(string, "\"", "\\\"");
    }
}
