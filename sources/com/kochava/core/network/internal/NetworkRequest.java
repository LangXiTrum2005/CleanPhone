package com.kochava.core.network.internal;

import android.util.Log;
import com.kochava.core.json.internal.JsonElement;
import com.kochava.core.json.internal.JsonObject;
import com.kochava.core.json.internal.JsonObjectApi;
import com.kochava.core.json.internal.JsonType;
import com.kochava.core.network.base.internal.NetworkBaseRequest;
import com.kochava.core.util.internal.ObjectUtil;
import com.kochava.core.util.internal.TimeUtil;
import com.kochava.tracker.payload.internal.Payload;
import com.kochava.tracker.payload.internal.PayloadMetadata;
import com.kochava.tracker.payload.internal.PayloadType;
import com.p004ironsource.qt;
import java.io.IOException;

/* JADX INFO: loaded from: classes5.dex */
public final class NetworkRequest extends NetworkBaseRequest implements NetworkRequestApi {
    /* JADX WARN: Code duplicated, block: B:34:0x00a3  */
    public final NetworkResponse h(int i2, Payload payload, long j, JsonObject jsonObject, boolean z2, JsonElement jsonElement) {
        NetworkValidateResult networkValidateResult;
        JsonObjectApi jsonObjectApiK;
        PayloadMetadata payloadMetadata = payload.X;
        PayloadType payloadType = PayloadType.v0;
        PayloadType payloadType2 = payloadMetadata.f28257a;
        if (payloadType2 != payloadType) {
            PayloadType payloadType3 = PayloadType.u0;
            JsonType jsonType = JsonType.j0;
            Object obj = jsonElement.f28019a;
            if (payloadType2 == payloadType3) {
                if (z2 && JsonType.a(obj) == jsonType) {
                    networkValidateResult = new NetworkValidateResult(0L, true, false);
                } else {
                    networkValidateResult = new NetworkValidateResult(0L, false, false);
                }
            } else if (JsonType.a(obj) != jsonType || jsonElement.b().length() == 0) {
                networkValidateResult = new NetworkValidateResult(-1L, false, true);
            } else {
                JsonObjectApi jsonObjectApiB = jsonElement.b();
                if (!jsonObjectApiB.j("success", Boolean.FALSE).booleanValue()) {
                    networkValidateResult = new NetworkValidateResult(-1L, false, true);
                } else if (payloadType2 == PayloadType.n0 && (jsonObjectApiK = jsonObjectApiB.k("data", false)) != null && jsonObjectApiK.i("retry")) {
                    long jB = TimeUtil.b(jsonObjectApiK.f("retry", Double.valueOf(0.0d)).doubleValue());
                    if (jB > 0) {
                        networkValidateResult = new NetworkValidateResult(Math.max(0L, jB), false, true);
                    } else {
                        networkValidateResult = new NetworkValidateResult(0L, true, false);
                    }
                } else {
                    networkValidateResult = new NetworkValidateResult(0L, true, false);
                }
            }
        } else if (z2) {
            networkValidateResult = new NetworkValidateResult(0L, true, false);
        } else {
            networkValidateResult = i2 < 3 ? new NetworkValidateResult(-1L, false, true) : new NetworkValidateResult(0L, false, false);
        }
        if (networkValidateResult.f28048a) {
            return new NetworkResponse(true, false, 0L, j, jsonObject, jsonElement);
        }
        long j2 = networkValidateResult.f28050c;
        return j2 < 0 ? new NetworkResponse(false, networkValidateResult.f28049b, e(i2), j, jsonObject, new JsonElement("")) : new NetworkResponse(false, networkValidateResult.f28049b, j2, j, jsonObject, new JsonElement(""));
    }

    public final synchronized NetworkResponse i(int i2, Payload payload) throws Throwable {
        NetworkRequest networkRequest;
        try {
            try {
                long jCurrentTimeMillis = System.currentTimeMillis();
                JsonObject jsonObjectW = JsonObject.w();
                JsonElement jsonElement = new JsonElement("");
                try {
                    JsonElement jsonElementG = NetworkBaseRequest.g(jsonObjectW, this.f28040a, this.f28041b, this.d, this.f28042c);
                    jsonObjectW.q((System.currentTimeMillis() - jCurrentTimeMillis) / 1000.0d, "duration");
                    jsonObjectW.g("url", this.f28041b.toString());
                    jsonObjectW.e(qt.f26623n, jsonElementG);
                    return h(i2, payload, System.currentTimeMillis() - jCurrentTimeMillis, jsonObjectW, true, jsonElementG);
                } catch (IOException e2) {
                    networkRequest = this;
                    try {
                        String strN = ObjectUtil.n(e2.getMessage());
                        jsonObjectW.g("error", strN != null ? strN : "");
                        String strN2 = ObjectUtil.n(Log.getStackTraceString(e2));
                        jsonObjectW.g("stacktrace", strN2 != null ? strN2 : "");
                        NetworkResponse networkResponseH = networkRequest.h(i2, payload, System.currentTimeMillis() - jCurrentTimeMillis, jsonObjectW, false, jsonElement);
                        jsonObjectW.q((System.currentTimeMillis() - jCurrentTimeMillis) / 1000.0d, "duration");
                        jsonObjectW.g("url", networkRequest.f28041b.toString());
                        jsonObjectW.e(qt.f26623n, jsonElement);
                        return networkResponseH;
                    } catch (Throwable th) {
                        th = th;
                        Throwable th2 = th;
                        jsonObjectW.q((System.currentTimeMillis() - jCurrentTimeMillis) / 1000.0d, "duration");
                        jsonObjectW.g("url", networkRequest.f28041b.toString());
                        jsonObjectW.e(qt.f26623n, jsonElement);
                        throw th2;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    networkRequest = this;
                    Throwable th4 = th;
                    jsonObjectW.q((System.currentTimeMillis() - jCurrentTimeMillis) / 1000.0d, "duration");
                    jsonObjectW.g("url", networkRequest.f28041b.toString());
                    jsonObjectW.e(qt.f26623n, jsonElement);
                    throw th4;
                }
            } catch (Throwable th5) {
                th = th5;
                throw th;
            }
        } catch (Throwable th6) {
            th = th6;
            throw th;
        }
    }
}
