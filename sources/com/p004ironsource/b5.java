package com.p004ironsource;

import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0006\u0010\u0004\u001a\u00020\u0002R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0006R$\u0010\r\u001a\u0012\u0012\u0004\u0012\u00020\t0\bj\b\u0012\u0004\u0012\u00020\t`\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\u0011\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0014"}, d2 = {"Lcom/ironsource/b5;", "", "Lorg/json/JSONObject;", "tokenData", "a", "Lcom/ironsource/ne$a;", "Lcom/ironsource/ne$a;", "adUnit", "Ljava/util/ArrayList;", "", "Lkotlin/collections/ArrayList;", "b", "Ljava/util/ArrayList;", "mAuctionKeyList", "Lcom/ironsource/pe;", "c", "Lcom/ironsource/pe;", "mGlobalDataReader", "<init>", "(Lcom/ironsource/ne$a;)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public final class b5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final ne.a adUnit;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final ArrayList<String> mAuctionKeyList = new ArrayList<>(new z4().a());

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final pe mGlobalDataReader = new pe();

    public b5(ne.a aVar) {
        this.adUnit = aVar;
    }

    public final JSONObject a() {
        ne.a aVar = this.adUnit;
        JSONObject jSONObjectA = aVar != null ? this.mGlobalDataReader.a(this.mAuctionKeyList, aVar) : null;
        if (jSONObjectA == null) {
            jSONObjectA = this.mGlobalDataReader.a(this.mAuctionKeyList);
            Intrinsics.e(jSONObjectA, "mGlobalDataReader.getDataByKeys(mAuctionKeyList)");
        }
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
