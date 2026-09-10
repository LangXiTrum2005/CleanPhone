package com.p004ironsource.mediationsdk;

import androidx.media3.extractor.text.ttml.a;
import com.p004ironsource.x4;
import com.smartdigimkt.h5.f;
import com.smartdigimkt.m3.h;
import com.smartdigimkt.y4.g;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.ironsource.mediationsdk.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u000e\b\u0082\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\u0006\u0010\n\u001a\u00020\u0004\u0012\u0006\u0010\u000b\u001a\u00020\u0004¢\u0006\u0004\b\u001a\u0010\u001bJ\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0004HÆ\u0003J1\u0010\u0003\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00042\b\b\u0002\u0010\n\u001a\u00020\u00042\b\b\u0002\u0010\u000b\u001a\u00020\u0004HÆ\u0001J\t\u0010\r\u001a\u00020\fHÖ\u0001J\t\u0010\u000f\u001a\u00020\u000eHÖ\u0001J\u0013\u0010\u0011\u001a\u00020\u00042\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\n\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0015\u001a\u0004\b\u0018\u0010\u0017R\u0017\u0010\u000b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0015\u001a\u0004\b\u0019\u0010\u0017¨\u0006\u001c"}, d2 = {"Lcom/ironsource/mediationsdk/b;", "", "Lcom/ironsource/mediationsdk/s$d;", "a", "", "b", "c", "d", "sdkState", "isRetryForMoreThan15Secs", "isDemandOnlyInitRequested", "isAdUnitInitRequested", "", "toString", "", "hashCode", x4.DEFAULT_AUCTION_FALLBACK_VALUE, "equals", "Lcom/ironsource/mediationsdk/s$d;", "e", "()Lcom/ironsource/mediationsdk/s$d;", "Z", h.f36614b, "()Z", g.f40227p, f.j, "<init>", "(Lcom/ironsource/mediationsdk/s$d;ZZZ)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
final /* data */ class C3371b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final s.d sdkState;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final boolean isRetryForMoreThan15Secs;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final boolean isDemandOnlyInitRequested;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final boolean isAdUnitInitRequested;

    public C3371b(s.d sdkState, boolean z2, boolean z3, boolean z4) {
        Intrinsics.f(sdkState, "sdkState");
        this.sdkState = sdkState;
        this.isRetryForMoreThan15Secs = z2;
        this.isDemandOnlyInitRequested = z3;
        this.isAdUnitInitRequested = z4;
    }

    public static /* synthetic */ C3371b a(C3371b c3371b, s.d dVar, boolean z2, boolean z3, boolean z4, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            dVar = c3371b.sdkState;
        }
        if ((i2 & 2) != 0) {
            z2 = c3371b.isRetryForMoreThan15Secs;
        }
        if ((i2 & 4) != 0) {
            z3 = c3371b.isDemandOnlyInitRequested;
        }
        if ((i2 & 8) != 0) {
            z4 = c3371b.isAdUnitInitRequested;
        }
        return c3371b.a(dVar, z2, z3, z4);
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final boolean getIsRetryForMoreThan15Secs() {
        return this.isRetryForMoreThan15Secs;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final boolean getIsDemandOnlyInitRequested() {
        return this.isDemandOnlyInitRequested;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final boolean getIsAdUnitInitRequested() {
        return this.isAdUnitInitRequested;
    }

    public final s.d e() {
        return this.sdkState;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C3371b)) {
            return false;
        }
        C3371b c3371b = (C3371b) other;
        return this.sdkState == c3371b.sdkState && this.isRetryForMoreThan15Secs == c3371b.isRetryForMoreThan15Secs && this.isDemandOnlyInitRequested == c3371b.isDemandOnlyInitRequested && this.isAdUnitInitRequested == c3371b.isAdUnitInitRequested;
    }

    public final boolean f() {
        return this.isAdUnitInitRequested;
    }

    public final boolean g() {
        return this.isDemandOnlyInitRequested;
    }

    public final boolean h() {
        return this.isRetryForMoreThan15Secs;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [int] */
    /* JADX WARN: Type inference failed for: r0v5, types: [int] */
    /* JADX WARN: Type inference failed for: r0v7, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v3, types: [int] */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [int] */
    /* JADX WARN: Type inference failed for: r2v2 */
    public int hashCode() {
        int iHashCode = this.sdkState.hashCode() * 31;
        boolean z2 = this.isRetryForMoreThan15Secs;
        ?? r1 = z2;
        if (z2) {
            r1 = 1;
        }
        int i2 = (iHashCode + r1) * 31;
        boolean z3 = this.isDemandOnlyInitRequested;
        ?? r2 = z3;
        if (z3) {
            r2 = 1;
        }
        int i3 = (i2 + r2) * 31;
        boolean z4 = this.isAdUnitInitRequested;
        return i3 + (z4 ? 1 : z4);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("AdUnitInitStateInfo(sdkState=");
        sb.append(this.sdkState);
        sb.append(", isRetryForMoreThan15Secs=");
        sb.append(this.isRetryForMoreThan15Secs);
        sb.append(", isDemandOnlyInitRequested=");
        sb.append(this.isDemandOnlyInitRequested);
        sb.append(", isAdUnitInitRequested=");
        return a.r(sb, this.isAdUnitInitRequested, ')');
    }

    public final C3371b a(s.d sdkState, boolean isRetryForMoreThan15Secs, boolean isDemandOnlyInitRequested, boolean isAdUnitInitRequested) {
        Intrinsics.f(sdkState, "sdkState");
        return new C3371b(sdkState, isRetryForMoreThan15Secs, isDemandOnlyInitRequested, isAdUnitInitRequested);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final s.d getSdkState() {
        return this.sdkState;
    }
}
