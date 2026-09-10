package com.ironsource;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class A1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f25598a;

    public A1() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public final String a() {
        return this.f25598a;
    }

    public final String b() {
        return this.f25598a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof A1) && kotlin.jvm.internal.n.a(this.f25598a, ((A1) obj).f25598a);
    }

    public int hashCode() {
        return this.f25598a.hashCode();
    }

    public String toString() {
        return defpackage.e.o("ApplicationAuctionSettings(auctionData=", this.f25598a, ")");
    }

    public A1(String auctionData) {
        kotlin.jvm.internal.n.f(auctionData, "auctionData");
        this.f25598a = auctionData;
    }

    public final A1 a(String auctionData) {
        kotlin.jvm.internal.n.f(auctionData, "auctionData");
        return new A1(auctionData);
    }

    public /* synthetic */ A1(String str, int i10, kotlin.jvm.internal.g gVar) {
        this((i10 & 1) != 0 ? "" : str);
    }

    public static /* synthetic */ A1 a(A1 a8, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = a8.f25598a;
        }
        return a8.a(str);
    }
}
