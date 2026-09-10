package com.inmobi.media;

import com.inmobi.unifiedId.InMobiUserDataModel;
import com.inmobi.unifiedId.InMobiUserDataTypes;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Objects;
import org.json.JSONObject;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.ranges.IntRange;

/* JADX INFO: loaded from: classes3.dex */
public final class Qk extends AbstractC3321w9 {
    public final Ak b;
    public final String c;
    public final int d;
    public final int e;
    public final int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Qk(String url, Ak uidMap, String str, int i, int i2, int i3) {
        super(url);
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(uidMap, "uidMap");
        this.b = uidMap;
        this.c = str;
        this.d = i;
        this.e = i2;
        this.f = i3;
    }

    public final Le a() {
        String string;
        InMobiUserDataTypes obj;
        InMobiUserDataTypes obj2;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Objects.toString(C2766a7.a);
        String str = (String) Tg.a().get("u-age");
        if (str != null) {
        }
        String string2 = Ok.b().toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        linkedHashMap.put("ufids", string2);
        C3238t1 c3238t1 = AbstractC3407zk.a;
        Boolean bool = c3238t1 != null ? c3238t1.c : null;
        if (bool == null || (string = bool.toString()) == null) {
            string = com.ironsource.mediationsdk.metadata.a.g;
        }
        linkedHashMap.put(com.ironsource.L6.s, string);
        linkedHashMap.put("mk-version", Ki.a());
        String str2 = A1.a;
        if (str2 != null) {
        }
        linkedHashMap.put(com.ironsource.L6.d0, Ji.c());
        linkedHashMap.put("ts", String.valueOf(System.currentTimeMillis()));
        String str3 = this.c;
        if (str3 != null) {
        }
        InMobiUserDataModel inMobiUserDataModel = C2766a7.b;
        if (inMobiUserDataModel == null || (obj = inMobiUserDataModel.getEmailId()) == null || (obj.getMd5() == null && obj.getSha1() == null && obj.getSha256() == null)) {
            obj = null;
        }
        if (obj != null) {
            Intrinsics.checkNotNullParameter(obj, "obj");
        }
        InMobiUserDataModel inMobiUserDataModel2 = C2766a7.b;
        if (inMobiUserDataModel2 == null || (obj2 = inMobiUserDataModel2.getPhoneNumber()) == null || (obj2.getMd5() == null && obj2.getSha1() == null && obj2.getSha256() == null)) {
            obj2 = null;
        }
        if (obj2 != null) {
            Intrinsics.checkNotNullParameter(obj2, "obj");
        }
        InMobiUserDataModel inMobiUserDataModel3 = C2766a7.b;
        HashMap<String, String> extras = inMobiUserDataModel3 != null ? inMobiUserDataModel3.getExtras() : null;
        if (extras != null) {
            linkedHashMap.putAll(extras);
        }
        linkedHashMap.putAll(this.b.a());
        Intrinsics.checkNotNullParameter(linkedHashMap, "<this>");
        linkedHashMap.putAll(A1.e);
        linkedHashMap.putAll(C3342x5.a.a(false));
        linkedHashMap.putAll(AbstractC3395z8.a());
        Intrinsics.checkNotNullParameter(linkedHashMap, "<this>");
        JSONObject jSONObjectB = W6.b();
        if (jSONObjectB != null) {
            String string3 = jSONObjectB.toString();
            Intrinsics.checkNotNullExpressionValue(string3, "toString(...)");
            linkedHashMap.put("consentObject", string3);
        }
        String str4 = this.a;
        Y6 y6 = new Y6(linkedHashMap);
        int i = this.d;
        int i2 = this.e;
        IntRange intRange = Se.a;
        Ai ai = new Ai(i, i2 * 1000, 0);
        long j = this.f * 1000;
        return new Le(str4, null, new C3158pk(j, j, j), y6, ai, 32);
    }
}
