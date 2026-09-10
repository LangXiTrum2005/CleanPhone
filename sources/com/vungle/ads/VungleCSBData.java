package com.vungle.ads;

import com.ironsource.C3414a2;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import java.io.Serializable;
import java.util.Map;
import p002kotlin.Metadata;
import p002kotlin.jvm.internal.DefaultConstructorMarker;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: VungleCSBData.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0015\u0018\u00002\u00020\u0001BQ\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0016\b\u0002\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\n2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0096\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0019\u001a\u0004\b\u001c\u0010\u001bR\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0019\u001a\u0004\b\u001d\u0010\u001bR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\u001e\u001a\u0004\b\u001f\u0010\u0015R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010 \u001a\u0004\b\u000b\u0010!R%\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\r\u0010\"\u001a\u0004\b#\u0010$¨\u0006%"}, d2 = {"Lcom/vungle/ads/VungleCSBData;", "Ljava/io/Serializable;", "", "bidFloor", "", "auctionId", "creativeId", "adUnitId", "", "phase", "", "isVXWinner", "", HandleInvocationsFromAdViewer.KEY_EXTRAS, "<init>", "(DLjava/lang/String;Ljava/lang/String;Ljava/lang/String;IZLjava/util/Map;)V", "", C3414a2.d, "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "D", "getBidFloor", "()D", "Ljava/lang/String;", "getAuctionId", "()Ljava/lang/String;", "getCreativeId", "getAdUnitId", "I", "getPhase", "Z", "()Z", "Ljava/util/Map;", "getExtras", "()Ljava/util/Map;", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class VungleCSBData implements Serializable {
    private final String adUnitId;
    private final String auctionId;
    private final double bidFloor;
    private final String creativeId;
    private final Map<String, String> extras;
    private final boolean isVXWinner;
    private final int phase;

    public /* synthetic */ VungleCSBData(double d, String str, String str2, String str3, int i, boolean z, Map map, DefaultConstructorMarker defaultConstructorMarker) {
        this(d, str, str2, str3, i, z, map);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VungleCSBData)) {
            return false;
        }
        VungleCSBData vungleCSBData = (VungleCSBData) other;
        return Double.compare(this.bidFloor, vungleCSBData.bidFloor) == 0 && Intrinsics.wireman(this.auctionId, vungleCSBData.auctionId) && Intrinsics.wireman(this.creativeId, vungleCSBData.creativeId) && Intrinsics.wireman(this.adUnitId, vungleCSBData.adUnitId) && this.phase == vungleCSBData.phase && this.isVXWinner == vungleCSBData.isVXWinner && Intrinsics.wireman(this.extras, vungleCSBData.extras);
    }

    public final String getAdUnitId() {
        return this.adUnitId;
    }

    public final String getAuctionId() {
        return this.auctionId;
    }

    public final double getBidFloor() {
        return this.bidFloor;
    }

    public final String getCreativeId() {
        return this.creativeId;
    }

    public final Map<String, String> getExtras() {
        return this.extras;
    }

    public final int getPhase() {
        return this.phase;
    }

    public int hashCode() {
        int iHashCode = ((((((((((Double.hashCode(this.bidFloor) * 31) + this.auctionId.hashCode()) * 31) + this.creativeId.hashCode()) * 31) + this.adUnitId.hashCode()) * 31) + this.phase) * 31) + Boolean.hashCode(this.isVXWinner)) * 31;
        Map<String, String> map = this.extras;
        return iHashCode + (map != null ? map.hashCode() : 0);
    }

    /* JADX INFO: renamed from: isVXWinner, reason: from getter */
    public final boolean getIsVXWinner() {
        return this.isVXWinner;
    }

    private VungleCSBData(double d, String str, String str2, String str3, int i, boolean z, Map<String, String> map) {
        this.bidFloor = d;
        this.auctionId = str;
        this.creativeId = str2;
        this.adUnitId = str3;
        this.phase = i;
        this.isVXWinner = z;
        this.extras = map;
    }

    public /* synthetic */ VungleCSBData(double d, String str, String str2, String str3, int i, boolean z, Map map, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(d, str, str2, str3, i, z, (i2 & 64) != 0 ? null : map);
    }
}
