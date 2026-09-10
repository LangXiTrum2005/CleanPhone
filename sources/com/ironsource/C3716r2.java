package com.ironsource;

import java.util.Map;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.ironsource.r2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3716r2 {
    private final String a;
    private final com.ironsource.mediationsdk.d b;

    public C3716r2(String serverData) {
        Intrinsics.checkNotNullParameter(serverData, "serverData");
        this.a = serverData;
        this.b = com.ironsource.mediationsdk.d.b();
    }

    private final String c() {
        return this.a;
    }

    public final C3716r2 a(String serverData) {
        Intrinsics.checkNotNullParameter(serverData, "serverData");
        return new C3716r2(serverData);
    }

    public final Map<String, String> b() {
        Map<String, String> mapB = this.b.b(this.a);
        Intrinsics.checkNotNullExpressionValue(mapB, "auctionDataUtils.getAuct…verDataParams(serverData)");
        return mapB;
    }

    public final String d() {
        String strC = this.b.c(this.a);
        Intrinsics.checkNotNullExpressionValue(strC, "auctionDataUtils.getDyna…romServerData(serverData)");
        return strC;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C3716r2) && Intrinsics.wireman(this.a, ((C3716r2) obj).a);
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public String toString() {
        return "AuctionServerData(serverData=" + this.a + ")";
    }

    public static /* synthetic */ C3716r2 a(C3716r2 c3716r2, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = c3716r2.a;
        }
        return c3716r2.a(str);
    }

    public final String a() {
        String strA = this.b.a(this.a);
        Intrinsics.checkNotNullExpressionValue(strA, "auctionDataUtils.getAdmFromServerData(serverData)");
        return strA;
    }
}
