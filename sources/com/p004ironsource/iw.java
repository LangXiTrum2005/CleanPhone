package com.p004ironsource;

import android.content.Context;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0007J\u000e\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005R\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\tR\u0014\u0010\u000e\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u0011"}, d2 = {"Lcom/ironsource/iw;", "", "Lorg/json/JSONObject;", "tokenData", "a", "Landroid/content/Context;", "context", "", "", "[Ljava/lang/String;", "mTokenKeyList", "Lcom/ironsource/pe;", "b", "Lcom/ironsource/pe;", "mGlobalDataReader", "<init>", "()V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public final class iw {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final String[] mTokenKeyList = hw.INSTANCE.a();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final pe mGlobalDataReader = new pe();

    @Deprecated
    public final JSONObject a() throws JSONException {
        JSONObject jSONObjectA = this.mGlobalDataReader.a(this.mTokenKeyList);
        Intrinsics.e(jSONObjectA, "mGlobalDataReader.getDataByKeys(mTokenKeyList)");
        return a(jSONObjectA);
    }

    public final JSONObject a(Context context) {
        Intrinsics.f(context, "context");
        JSONObject jSONObjectA = this.mGlobalDataReader.a(context, this.mTokenKeyList);
        Intrinsics.e(jSONObjectA, "mGlobalDataReader.getDat…s(context, mTokenKeyList)");
        return a(jSONObjectA);
    }

    private final JSONObject a(JSONObject tokenData) throws JSONException {
        JSONObject jSONObjectB = qe.b(tokenData.optJSONObject(ne.f26279u));
        if (jSONObjectB != null) {
            tokenData.put(ne.f26279u, jSONObjectB);
        }
        return tokenData;
    }
}
