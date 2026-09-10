package com.inmobi.media;

import java.util.LinkedHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class Yd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final U0 f23379a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f23380b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f23381c;
    public final String d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f23382e;

    public Yd(U0 u0, String str, String str2, String markupType) {
        Intrinsics.f(markupType, "markupType");
        this.f23379a = u0;
        this.f23380b = str;
        this.f23381c = str2;
        this.d = markupType;
    }

    public final LinkedHashMap a() {
        String strM;
        String strQ;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        U0 u0 = this.f23379a;
        if (u0 != null && (strQ = u0.f23241a.q()) != null) {
            linkedHashMap.put("adType", strQ);
        }
        U0 u1 = this.f23379a;
        if (u1 != null) {
            linkedHashMap.put("plId", Long.valueOf(u1.f23241a.I().l()));
        }
        U0 u2 = this.f23379a;
        if (u2 != null && (strM = u2.f23241a.I().m()) != null) {
            linkedHashMap.put("plType", strM);
        }
        U0 u3 = this.f23379a;
        if (u3 != null) {
            C3312y0 c3312y0Y = u3.f23241a.y();
            Boolean boolO = c3312y0Y != null ? c3312y0Y.o() : null;
            if (boolO != null) {
                linkedHashMap.put("isRewarded", boolO);
            }
        }
        String str = this.f23381c;
        if (str != null) {
            linkedHashMap.put("creativeId", str);
        }
        String str2 = this.f23380b;
        if (str2 != null) {
            linkedHashMap.put("creativeType", str2);
        }
        linkedHashMap.put("markupType", this.d);
        String str3 = this.f23382e;
        if (str3 == null) {
            Intrinsics.m("triggerSource");
            throw null;
        }
        linkedHashMap.put("trigger", str3);
        U0 u4 = this.f23379a;
        if (u4 != null && u4.a().length() > 0) {
            linkedHashMap.put("metadataBlob", this.f23379a.a());
        }
        return linkedHashMap;
    }

    public final void b() {
        Zd zd;
        AtomicBoolean atomicBoolean;
        U0 u0 = this.f23379a;
        if (u0 == null || (zd = u0.f23242b) == null || (atomicBoolean = zd.f23418a) == null || !atomicBoolean.getAndSet(true)) {
            a().put("networkType", L3.q());
            a().put("errorCode", (short) 2180);
            LinkedHashMap linkedHashMapA = a();
            Pd pd = Pd.f23077a;
            Pd.b("AdImpressionSuccessful", linkedHashMapA, Td.SDK);
        }
    }

    public final void c() {
        Zd zd;
        AtomicBoolean atomicBoolean;
        U0 u0 = this.f23379a;
        if (u0 == null || (zd = u0.f23242b) == null || (atomicBoolean = zd.f23418a) == null || !atomicBoolean.getAndSet(true)) {
            a().put("networkType", L3.q());
            a().put("errorCode", (short) 2177);
            LinkedHashMap linkedHashMapA = a();
            Pd pd = Pd.f23077a;
            Pd.b("AdImpressionSuccessful", linkedHashMapA, Td.SDK);
        }
    }

    public final void d() {
        Zd zd;
        AtomicBoolean atomicBoolean;
        U0 u0 = this.f23379a;
        if (u0 == null || (zd = u0.f23242b) == null || (atomicBoolean = zd.f23418a) == null || !atomicBoolean.getAndSet(true)) {
            a().put("networkType", L3.q());
            a().put("errorCode", (short) 0);
            LinkedHashMap linkedHashMapA = a();
            Pd pd = Pd.f23077a;
            Pd.b("AdImpressionSuccessful", linkedHashMapA, Td.SDK);
        }
    }
}
