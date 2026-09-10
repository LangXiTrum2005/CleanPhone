package com.facebook.internal.instrument.errorreport;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/facebook/internal/instrument/errorreport/ErrorReportData;", "", "Companion", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
public final class ErrorReportData {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f16435a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f16436b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Long f16437c;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/facebook/internal/instrument/errorreport/ErrorReportData$Companion;", "", "", "PARAM_TIMESTAMP", "Ljava/lang/String;", "PRARAM_ERROR_MESSAGE", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
    }

    public ErrorReportData(String str) {
        Long lValueOf = Long.valueOf(System.currentTimeMillis() / ((long) 1000));
        this.f16437c = lValueOf;
        this.f16436b = str;
        StringBuffer stringBuffer = new StringBuffer("error_log_");
        stringBuffer.append(lValueOf.longValue());
        stringBuffer.append(".json");
        String string = stringBuffer.toString();
        Intrinsics.e(string, "StringBuffer()\n         …)\n            .toString()");
        this.f16435a = string;
    }

    public final String toString() {
        JSONObject jSONObject = new JSONObject();
        try {
            Long l2 = this.f16437c;
            if (l2 != null) {
                jSONObject.put("timestamp", l2.longValue());
            }
            jSONObject.put("error_message", this.f16436b);
        } catch (JSONException unused) {
            jSONObject = null;
        }
        if (jSONObject == null) {
            return super.toString();
        }
        String string = jSONObject.toString();
        Intrinsics.e(string, "params.toString()");
        return string;
    }
}
