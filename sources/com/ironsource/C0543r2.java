package com.ironsource;

import java.util.Map;

/* JADX INFO: renamed from: com.ironsource.r2, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class C0543r2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f30133a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.ironsource.mediationsdk.d f30134b;

    public C0543r2(String serverData) {
        kotlin.jvm.internal.n.f(serverData, "serverData");
        this.f30133a = serverData;
        this.f30134b = com.ironsource.mediationsdk.d.b();
    }

    private final String c() {
        return this.f30133a;
    }

    public final C0543r2 a(String serverData) {
        kotlin.jvm.internal.n.f(serverData, "serverData");
        return new C0543r2(serverData);
    }

    public final Map<String, String> b() {
        Map<String, String> mapB = this.f30134b.b(this.f30133a);
        kotlin.jvm.internal.n.e(mapB, "auctionDataUtils.getAuct…verDataParams(serverData)");
        return mapB;
    }

    public final String d() {
        String strC = this.f30134b.c(this.f30133a);
        kotlin.jvm.internal.n.e(strC, "auctionDataUtils.getDyna…romServerData(serverData)");
        return strC;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0543r2) && kotlin.jvm.internal.n.a(this.f30133a, ((C0543r2) obj).f30133a);
    }

    public int hashCode() {
        return this.f30133a.hashCode();
    }

    public String toString() {
        return defpackage.e.o("AuctionServerData(serverData=", this.f30133a, ")");
    }

    public static /* synthetic */ C0543r2 a(C0543r2 c0543r2, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = c0543r2.f30133a;
        }
        return c0543r2.a(str);
    }

    public final String a() {
        String strA = this.f30134b.a(this.f30133a);
        kotlin.jvm.internal.n.e(strA, "auctionDataUtils.getAdmFromServerData(serverData)");
        return strA;
    }
}
