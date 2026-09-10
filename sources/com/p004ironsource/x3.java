package com.p004ironsource;

import androidx.media3.extractor.text.ttml.a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\u0013\u0010\u0003\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001J\t\u0010\u0005\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0007\u001a\u00020\u0006HÖ\u0001J\u0013\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u0010"}, d2 = {"Lcom/ironsource/x3;", "", "", "a", "auctionData", "toString", "", "hashCode", x4.DEFAULT_AUCTION_FALLBACK_VALUE, "", "equals", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "<init>", "(Ljava/lang/String;)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public final /* data */ class x3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final String auctionData;

    public x3() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ x3 a(x3 x3Var, String str, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = x3Var.auctionData;
        }
        return x3Var.a(str);
    }

    public final String b() {
        return this.auctionData;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof x3) && Intrinsics.a(this.auctionData, ((x3) other).auctionData);
    }

    public int hashCode() {
        return this.auctionData.hashCode();
    }

    public String toString() {
        return a.p(new StringBuilder("ApplicationAuctionSettings(auctionData="), this.auctionData, ')');
    }

    public x3(String auctionData) {
        Intrinsics.f(auctionData, "auctionData");
        this.auctionData = auctionData;
    }

    public final x3 a(String auctionData) {
        Intrinsics.f(auctionData, "auctionData");
        return new x3(auctionData);
    }

    public /* synthetic */ x3(String str, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "" : str);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getAuctionData() {
        return this.auctionData;
    }
}
