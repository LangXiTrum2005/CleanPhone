package com.p004ironsource;

import com.p004ironsource.mediationsdk.d;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0002H\u0016¨\u0006\b"}, d2 = {"Lcom/ironsource/nb;", "Lcom/ironsource/nn;", "", "Lcom/ironsource/mediationsdk/d$a;", "input", "a", "<init>", "()V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public final class nb implements nn<String, d.a> {
    @Override // com.p004ironsource.nn
    public d.a a(String input) throws JSONException {
        Intrinsics.f(input, "input");
        d.a aVarA = d.b().a(new JSONObject(input));
        Intrinsics.e(aVarA, "getInstance().getAuction…sponse(JSONObject(input))");
        return aVarA;
    }
}
