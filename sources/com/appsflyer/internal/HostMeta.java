package com.appsflyer.internal;

import p002kotlin.Metadata;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.appsflyer.internal.AFe1xSDK, reason: from toString */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\n\u001a\u00020\t2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0013\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0014\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0016\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0015"}, d2 = {"Lcom/appsflyer/internal/AFe1xSDK;", "", "", "p0", "p1", "Lcom/appsflyer/internal/AFe1tSDK;", "p2", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/appsflyer/internal/AFe1tSDK;)V", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "getCurrencyIso4217Code", "Lcom/appsflyer/internal/AFe1tSDK;", "AFAdRevenueData", "getMonetizationNetwork", "Ljava/lang/String;", "getRevenue"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class HostMeta {

    /* JADX INFO: renamed from: getCurrencyIso4217Code, reason: from kotlin metadata and from toString */
    public final AFe1tSDK method;

    /* JADX INFO: renamed from: getMonetizationNetwork, reason: from kotlin metadata and from toString */
    public final String name;

    /* JADX INFO: renamed from: getRevenue, reason: from kotlin metadata and from toString */
    public final String prefix;

    public HostMeta(String str, String str2, AFe1tSDK aFe1tSDK) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(aFe1tSDK, "");
        this.name = str;
        this.prefix = str2;
        this.method = aFe1tSDK;
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof HostMeta)) {
            return false;
        }
        HostMeta hostMeta = (HostMeta) p0;
        return Intrinsics.wireman(this.name, hostMeta.name) && Intrinsics.wireman(this.prefix, hostMeta.prefix) && this.method == hostMeta.method;
    }

    public final int hashCode() {
        int iHashCode = this.name.hashCode() * 31;
        String str = this.prefix;
        return ((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.method.hashCode();
    }

    public final String toString() {
        return "HostMeta(name=" + this.name + ", prefix=" + this.prefix + ", method=" + this.method + ")";
    }
}
