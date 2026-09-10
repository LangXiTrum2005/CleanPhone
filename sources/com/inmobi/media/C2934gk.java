package com.inmobi.media;

import com.inmobi.media.ads.network.common.model.AdSet;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.LinkedHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.inmobi.media.gk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2934gk {
    public final C3188r1 a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public String f;

    public C2934gk(C3188r1 c3188r1, String str, String str2, String str3, String markupType) {
        Intrinsics.checkNotNullParameter(markupType, "markupType");
        this.a = c3188r1;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = markupType;
    }

    public final LinkedHashMap a() {
        String str;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        C3188r1 c3188r1 = this.a;
        if (c3188r1 != null) {
            linkedHashMap.put("adType", c3188r1.a.l());
        }
        C3188r1 c3188r2 = this.a;
        if (c3188r2 != null) {
            linkedHashMap.put("plId", Long.valueOf(c3188r2.a.l.a));
        }
        C3188r1 c3188r3 = this.a;
        if (c3188r3 != null && (str = c3188r3.a.l.f) != null) {
            linkedHashMap.put("plType", str);
        }
        C3188r1 c3188r4 = this.a;
        String str2 = null;
        if (c3188r4 != null) {
            AdSet adSetR = c3188r4.a.r();
            Boolean boolValueOf = adSetR != null ? Boolean.valueOf(adSetR.getIsRewarded()) : null;
            if (boolValueOf != null) {
                linkedHashMap.put("isRewarded", boolValueOf);
            }
        }
        String str3 = this.c;
        if (str3 != null) {
            linkedHashMap.put("creativeId", str3);
        }
        String str4 = this.b;
        if (str4 != null) {
            linkedHashMap.put("creativeType", str4);
        }
        linkedHashMap.put("markupType", this.e);
        String str5 = this.f;
        if (str5 != null) {
            str2 = str5;
        } else {
            Intrinsics.preprohormone("triggerSource");
        }
        linkedHashMap.put("trigger", str2);
        C3188r1 c3188r5 = this.a;
        if (c3188r5 != null && c3188r5.a().length() > 0) {
            linkedHashMap.put("metadataBlob", this.a.a());
        }
        return linkedHashMap;
    }

    public final void b() {
        C2959hk c2959hk;
        AtomicBoolean atomicBoolean;
        C3188r1 c3188r1 = this.a;
        if (c3188r1 == null || (c2959hk = c3188r1.b) == null || (atomicBoolean = c2959hk.a) == null || !atomicBoolean.getAndSet(true)) {
            LinkedHashMap linkedHashMapA = a();
            linkedHashMapA.put("networkType", C3342x5.m());
            linkedHashMapA.put(IronSourceConstants.EVENTS_ERROR_CODE, (short) 2177);
            String str = this.d;
            if (str == null) {
                str = "";
            }
            linkedHashMapA.put("impressionId", str);
            Wj wj = Wj.a;
            Wj.b("AdImpressionSuccessful", linkedHashMapA, EnumC2779ak.SDK);
        }
    }

    public final void c() {
        C2959hk c2959hk;
        AtomicBoolean atomicBoolean;
        C3188r1 c3188r1 = this.a;
        if (c3188r1 == null || (c2959hk = c3188r1.b) == null || (atomicBoolean = c2959hk.a) == null || !atomicBoolean.getAndSet(true)) {
            LinkedHashMap linkedHashMapA = a();
            linkedHashMapA.put("networkType", C3342x5.m());
            linkedHashMapA.put(IronSourceConstants.EVENTS_ERROR_CODE, (short) 0);
            String str = this.d;
            if (str == null) {
                str = "";
            }
            linkedHashMapA.put("impressionId", str);
            Wj wj = Wj.a;
            Wj.b("AdImpressionSuccessful", linkedHashMapA, EnumC2779ak.SDK);
        }
    }
}
