package com.inmobi.media;

import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import java.util.LinkedHashMap;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.inmobi.media.l4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3042l4 extends AbstractC3321w9 {
    public final String b;
    public final List c;
    public final boolean d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3042l4(String url, String accountId, List configRequestContexts, boolean z) {
        super(url);
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        Intrinsics.checkNotNullParameter(configRequestContexts, "configRequestContexts");
        this.b = accountId;
        this.c = configRequestContexts;
        this.d = z;
    }

    public final Le a() throws JSONException {
        List<C3067m4> list = this.c;
        JSONArray jSONArray = new JSONArray();
        for (C3067m4 c3067m4 : list) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(com.ironsource.A5.q, c3067m4.b.getType());
            jSONObject.put("t", c3067m4.b.getLastUpdateTimeStamp());
            jSONArray.put(jSONObject);
        }
        String string = jSONArray.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("im-accid", this.b);
        linkedHashMap.put(TtmlNode.TAG_P, string);
        Intrinsics.checkNotNullParameter(linkedHashMap, "<this>");
        JSONObject jSONObjectB = W6.b();
        if (jSONObjectB != null) {
            String string2 = jSONObjectB.toString();
            Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
            linkedHashMap.put("consentObject", string2);
        }
        Intrinsics.checkNotNullParameter(linkedHashMap, "<this>");
        linkedHashMap.putAll(A1.e);
        linkedHashMap.putAll(C3342x5.a.a(false));
        linkedHashMap.putAll(AbstractC3395z8.a());
        Intrinsics.checkNotNullParameter(linkedHashMap, "<this>");
        linkedHashMap.put("u-appsecure", String.valueOf((int) A1.f));
        Intrinsics.checkNotNullParameter(linkedHashMap, "<this>");
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        if (this.d) {
            linkedHashMap2.put("rip", com.ironsource.mediationsdk.metadata.a.g);
        }
        return new Le(this.a, linkedHashMap2, null, new Y6(linkedHashMap), null, 52);
    }
}
