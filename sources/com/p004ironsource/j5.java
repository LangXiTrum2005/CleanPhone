package com.p004ironsource;

import androidx.media3.extractor.text.ttml.a;
import com.p004ironsource.mediationsdk.utils.IronSourceConstants;
import com.smartdigimkt.h5.f;
import com.smartdigimkt.m3.h;
import com.smartdigimkt.q8.i;
import com.smartdigimkt.y4.g;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0086\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\u000e\u001a\u00020\b\u0012\u0006\u0010\u000f\u001a\u00020\u0002¢\u0006\u0004\b\"\u0010#J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\u000b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\t\u0010\t\u001a\u00020\bHÆ\u0003J\t\u0010\n\u001a\u00020\u0002HÆ\u0003J?\u0010\u0003\u001a\u00020\u00002\b\b\u0002\u0010\u000b\u001a\u00020\u00022\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u000e\u001a\u00020\b2\b\b\u0002\u0010\u000f\u001a\u00020\u0002HÆ\u0001J\t\u0010\u0010\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0011\u001a\u00020\bHÖ\u0001J\u0013\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u000b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0019\u0010\f\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0019\u0010\r\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\u000e\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010\u000f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u0015\u001a\u0004\b!\u0010\u0017¨\u0006$"}, d2 = {"Lcom/ironsource/j5;", "", "", "a", "Lorg/json/JSONObject;", "b", "Lcom/ironsource/m5;", "c", "", "d", "e", "auctionId", "auctionResponseGenericParam", "genericNotifications", "auctionTrial", IronSourceConstants.AUCTION_FALLBACK, "toString", "hashCode", x4.DEFAULT_AUCTION_FALLBACK_VALUE, "", "equals", "Ljava/lang/String;", g.f40227p, "()Ljava/lang/String;", "Lorg/json/JSONObject;", h.f36614b, "()Lorg/json/JSONObject;", "Lcom/ironsource/m5;", "j", "()Lcom/ironsource/m5;", "I", i.f37957c, "()I", f.j, "<init>", "(Ljava/lang/String;Lorg/json/JSONObject;Lcom/ironsource/m5;ILjava/lang/String;)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public final /* data */ class j5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final String auctionId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final JSONObject auctionResponseGenericParam;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final m5 genericNotifications;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final int auctionTrial;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final String auctionFallback;

    public j5(String auctionId, JSONObject jSONObject, m5 m5Var, int i2, String auctionFallback) {
        Intrinsics.f(auctionId, "auctionId");
        Intrinsics.f(auctionFallback, "auctionFallback");
        this.auctionId = auctionId;
        this.auctionResponseGenericParam = jSONObject;
        this.genericNotifications = m5Var;
        this.auctionTrial = i2;
        this.auctionFallback = auctionFallback;
    }

    public static /* synthetic */ j5 a(j5 j5Var, String str, JSONObject jSONObject, m5 m5Var, int i2, String str2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = j5Var.auctionId;
        }
        if ((i3 & 2) != 0) {
            jSONObject = j5Var.auctionResponseGenericParam;
        }
        if ((i3 & 4) != 0) {
            m5Var = j5Var.genericNotifications;
        }
        if ((i3 & 8) != 0) {
            i2 = j5Var.auctionTrial;
        }
        if ((i3 & 16) != 0) {
            str2 = j5Var.auctionFallback;
        }
        String str3 = str2;
        m5 m5Var2 = m5Var;
        return j5Var.a(str, jSONObject, m5Var2, i2, str3);
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final JSONObject getAuctionResponseGenericParam() {
        return this.auctionResponseGenericParam;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final m5 getGenericNotifications() {
        return this.genericNotifications;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final int getAuctionTrial() {
        return this.auctionTrial;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getAuctionFallback() {
        return this.auctionFallback;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof j5)) {
            return false;
        }
        j5 j5Var = (j5) other;
        return Intrinsics.a(this.auctionId, j5Var.auctionId) && Intrinsics.a(this.auctionResponseGenericParam, j5Var.auctionResponseGenericParam) && Intrinsics.a(this.genericNotifications, j5Var.genericNotifications) && this.auctionTrial == j5Var.auctionTrial && Intrinsics.a(this.auctionFallback, j5Var.auctionFallback);
    }

    public final String f() {
        return this.auctionFallback;
    }

    public final String g() {
        return this.auctionId;
    }

    public final JSONObject h() {
        return this.auctionResponseGenericParam;
    }

    public int hashCode() {
        int iHashCode = this.auctionId.hashCode() * 31;
        JSONObject jSONObject = this.auctionResponseGenericParam;
        int iHashCode2 = (iHashCode + (jSONObject == null ? 0 : jSONObject.hashCode())) * 31;
        m5 m5Var = this.genericNotifications;
        return this.auctionFallback.hashCode() + a.a(this.auctionTrial, (iHashCode2 + (m5Var != null ? m5Var.hashCode() : 0)) * 31, 31);
    }

    public final int i() {
        return this.auctionTrial;
    }

    public final m5 j() {
        return this.genericNotifications;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("AuctionResponseData(auctionId=");
        sb.append(this.auctionId);
        sb.append(", auctionResponseGenericParam=");
        sb.append(this.auctionResponseGenericParam);
        sb.append(", genericNotifications=");
        sb.append(this.genericNotifications);
        sb.append(", auctionTrial=");
        sb.append(this.auctionTrial);
        sb.append(", auctionFallback=");
        return a.p(sb, this.auctionFallback, ')');
    }

    public final j5 a(String auctionId, JSONObject auctionResponseGenericParam, m5 genericNotifications, int auctionTrial, String auctionFallback) {
        Intrinsics.f(auctionId, "auctionId");
        Intrinsics.f(auctionFallback, "auctionFallback");
        return new j5(auctionId, auctionResponseGenericParam, genericNotifications, auctionTrial, auctionFallback);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getAuctionId() {
        return this.auctionId;
    }
}
