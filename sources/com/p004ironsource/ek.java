package com.p004ironsource;

import androidx.media3.extractor.text.ttml.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\u001d\u0010\u0003\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0002HÆ\u0001J\t\u0010\u0007\u001a\u00020\u0002HÖ\u0001J\t\u0010\t\u001a\u00020\bHÖ\u0001J\u0013\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\r\u001a\u0004\b\u0010\u0010\u000f¨\u0006\u0013"}, d2 = {"Lcom/ironsource/ek;", "", "", "a", "b", "advId", "advIdType", "toString", "", "hashCode", x4.DEFAULT_AUCTION_FALLBACK_VALUE, "", "equals", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "d", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public final /* data */ class ek {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final String advId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final String advIdType;

    public ek(String advId, String advIdType) {
        Intrinsics.f(advId, "advId");
        Intrinsics.f(advIdType, "advIdType");
        this.advId = advId;
        this.advIdType = advIdType;
    }

    public static /* synthetic */ ek a(ek ekVar, String str, String str2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = ekVar.advId;
        }
        if ((i2 & 2) != 0) {
            str2 = ekVar.advIdType;
        }
        return ekVar.a(str, str2);
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getAdvIdType() {
        return this.advIdType;
    }

    public final String c() {
        return this.advId;
    }

    public final String d() {
        return this.advIdType;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ek)) {
            return false;
        }
        ek ekVar = (ek) other;
        return Intrinsics.a(this.advId, ekVar.advId) && Intrinsics.a(this.advIdType, ekVar.advIdType);
    }

    public int hashCode() {
        return this.advIdType.hashCode() + (this.advId.hashCode() * 31);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("IronSourceAdvId(advId=");
        sb.append(this.advId);
        sb.append(", advIdType=");
        return a.p(sb, this.advIdType, ')');
    }

    public final ek a(String advId, String advIdType) {
        Intrinsics.f(advId, "advId");
        Intrinsics.f(advIdType, "advIdType");
        return new ek(advId, advIdType);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getAdvId() {
        return this.advId;
    }
}
