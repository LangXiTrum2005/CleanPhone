package com.p004ironsource;

import androidx.media3.extractor.text.ttml.a;
import com.smartdigimkt.h5.f;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\r\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0005¢\u0006\u0004\b\u0017\u0010\u0018J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0005HÆ\u0003J'\u0010\u0003\u001a\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u0005HÆ\u0001J\t\u0010\u000b\u001a\u00020\nHÖ\u0001J\t\u0010\r\u001a\u00020\fHÖ\u0001J\u0013\u0010\u000f\u001a\u00020\u00052\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0010\u001a\u0004\b\u0013\u0010\u0012R\u0017\u0010\t\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0019"}, d2 = {"Lcom/ironsource/ol;", "", "", "a", "b", "", "c", v6.d, "visibilityCheckerInterval", "isAutoRefreshEnabled", "", "toString", "", "hashCode", x4.DEFAULT_AUCTION_FALLBACK_VALUE, "equals", "J", "d", "()J", "e", "Z", f.j, "()Z", "<init>", "(JJZ)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public final /* data */ class ol {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final long refreshInterval;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final long visibilityCheckerInterval;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final boolean isAutoRefreshEnabled;

    public ol(long j, long j2, boolean z2) {
        this.refreshInterval = j;
        this.visibilityCheckerInterval = j2;
        this.isAutoRefreshEnabled = z2;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final long getRefreshInterval() {
        return this.refreshInterval;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final long getVisibilityCheckerInterval() {
        return this.visibilityCheckerInterval;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final boolean getIsAutoRefreshEnabled() {
        return this.isAutoRefreshEnabled;
    }

    public final long d() {
        return this.refreshInterval;
    }

    public final long e() {
        return this.visibilityCheckerInterval;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ol)) {
            return false;
        }
        ol olVar = (ol) other;
        return this.refreshInterval == olVar.refreshInterval && this.visibilityCheckerInterval == olVar.visibilityCheckerInterval && this.isAutoRefreshEnabled == olVar.isAutoRefreshEnabled;
    }

    public final boolean f() {
        return this.isAutoRefreshEnabled;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [int] */
    /* JADX WARN: Type inference failed for: r1v2, types: [int] */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4 */
    public int hashCode() {
        int iB = a.b(Long.hashCode(this.refreshInterval) * 31, 31, this.visibilityCheckerInterval);
        boolean z2 = this.isAutoRefreshEnabled;
        ?? r1 = z2;
        if (z2) {
            r1 = 1;
        }
        return iB + r1;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("LevelPlayBannerReloadAdUnitStrategyConfig(refreshInterval=");
        sb.append(this.refreshInterval);
        sb.append(", visibilityCheckerInterval=");
        sb.append(this.visibilityCheckerInterval);
        sb.append(", isAutoRefreshEnabled=");
        return a.r(sb, this.isAutoRefreshEnabled, ')');
    }

    public final ol a(long refreshInterval, long visibilityCheckerInterval, boolean isAutoRefreshEnabled) {
        return new ol(refreshInterval, visibilityCheckerInterval, isAutoRefreshEnabled);
    }

    public static /* synthetic */ ol a(ol olVar, long j, long j2, boolean z2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            j = olVar.refreshInterval;
        }
        long j3 = j;
        if ((i2 & 2) != 0) {
            j2 = olVar.visibilityCheckerInterval;
        }
        long j4 = j2;
        if ((i2 & 4) != 0) {
            z2 = olVar.isAutoRefreshEnabled;
        }
        return olVar.a(j3, j4, z2);
    }
}
