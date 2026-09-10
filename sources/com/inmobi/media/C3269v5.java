package com.inmobi.media;

import android.content.Context;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.inmobi.media.v5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C3269v5 extends S1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final C3269v5 f24048c = new C3269v5();
    public static final AtomicBoolean d = new AtomicBoolean(true);

    public final JSONObject a() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        AtomicBoolean atomicBoolean = d;
        jSONObject.put("a-audioBannerEnabled", String.valueOf(atomicBoolean.get()));
        if (atomicBoolean.get()) {
            long j = this.f23148a / 1000;
            if (j != 0) {
                jSONObject.put("a-lastAudioBannerPlayedTs", String.valueOf(j));
            }
            int i2 = this.f23149b;
            if (i2 > 0) {
                jSONObject.put("a-audioBannerFreq", String.valueOf(i2));
            }
            Context contextD = Uc.d();
            if (contextD != null) {
                ConcurrentHashMap concurrentHashMap = C6.f22734b;
                int i3 = B6.a(contextD, "banner_audio_pref_file").f22735a.getInt("user_mute_count", -1);
                if (i3 > 0) {
                    jSONObject.put("a-b-umc", String.valueOf(i3));
                }
            }
        }
        return jSONObject;
    }
}
