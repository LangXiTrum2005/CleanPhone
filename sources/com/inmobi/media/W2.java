package com.inmobi.media;

import com.inmobi.commons.core.configs.Config;
import com.unity3d.services.UnityAdsConstants;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public final class W2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Config f23313a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f23314b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public R2 f23315c;

    /* JADX WARN: Code duplicated, block: B:13:0x0027 A[PHI: r5
  0x0027: PHI (r5v1 int) = (r5v0 int), (r5v2 int) binds: [B:9:0x0020, B:11:0x0024] A[DONT_GENERATE, DONT_INLINE]] */
    public W2(JSONObject jSONObject, Config config) {
        Intrinsics.f(config, "config");
        this.f23313a = config;
        int i2 = -1;
        this.f23314b = -1;
        if (jSONObject != null) {
            try {
                int i3 = jSONObject.getInt("status");
                if (i3 == 200) {
                    i2 = 200;
                } else if (i3 != 304) {
                    int i4 = 404;
                    if (i3 != 404) {
                        i4 = 500;
                        if (i3 == 500) {
                            i2 = i4;
                        }
                    } else {
                        i2 = i4;
                    }
                } else {
                    i2 = 304;
                }
                this.f23314b = i2;
                if (i2 != 200) {
                    if (i2 == 304) {
                        config.getType();
                        return;
                    }
                    R2 r2 = new R2((byte) 1, UnityAdsConstants.Messages.MSG_INTERNAL_ERROR);
                    config.getType();
                    this.f23315c = r2;
                    return;
                }
                JSONObject jSONObject2 = jSONObject.getJSONObject("content");
                G2 g2 = Config.Companion;
                String type = config.getType();
                Intrinsics.c(jSONObject2);
                String accountId$media_release = config.getAccountId$media_release();
                long jCurrentTimeMillis = System.currentTimeMillis();
                g2.getClass();
                Config configA = G2.a(type, jSONObject2, accountId$media_release, jCurrentTimeMillis);
                if (configA == null) {
                    this.f23315c = new R2((byte) 3, "The received config has failed backend contract.");
                } else {
                    this.f23313a = configA;
                }
                this.f23313a.getType();
                this.f23313a.isValid();
                if (this.f23313a.isValid()) {
                    return;
                }
                R2 r3 = new R2((byte) 2, "The received config has failed validation.");
                this.f23313a.getType();
                this.f23315c = r3;
            } catch (JSONException e2) {
                String localizedMessage = e2.getLocalizedMessage();
                R2 r4 = new R2((byte) 2, localizedMessage == null ? "Exception in config validation" : localizedMessage);
                this.f23313a.getType();
                this.f23315c = r4;
            }
        }
    }
}
