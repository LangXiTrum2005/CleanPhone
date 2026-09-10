package com.applovin.impl.mediation;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.applovin.impl.a3;
import com.applovin.impl.c3;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdWaterfallInfo;
import com.applovin.mediation.MaxNetworkResponseInfo;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public class MaxAdWaterfallInfoImpl implements MaxAdWaterfallInfo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a3 f8426a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f8427b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f8428c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final List f8429d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final long f8430e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final c3 f8431f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final List f8432g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final String f8433h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final String f8434i;

    public MaxAdWaterfallInfoImpl(a3 a3Var, long j10, List<MaxNetworkResponseInfo> list, String str) {
        this(a3Var, a3Var.X(), a3Var.Y(), j10, list, a3Var.Q(), a3Var.W(), str, a3Var.T());
    }

    public String getEventId() {
        return this.f8434i;
    }

    @Override // com.applovin.mediation.MaxAdWaterfallInfo
    public long getLatencyMillis() {
        return this.f8430e;
    }

    @Override // com.applovin.mediation.MaxAdWaterfallInfo
    public MaxAd getLoadedAd() {
        return this.f8426a;
    }

    public String getMCode() {
        return this.f8433h;
    }

    @Override // com.applovin.mediation.MaxAdWaterfallInfo
    public String getName() {
        return this.f8427b;
    }

    @Override // com.applovin.mediation.MaxAdWaterfallInfo
    public List<MaxNetworkResponseInfo> getNetworkResponses() {
        return this.f8429d;
    }

    public List<String> getPostbackUrls() {
        return this.f8432g;
    }

    public c3 getRequestParameters() {
        return this.f8431f;
    }

    @Override // com.applovin.mediation.MaxAdWaterfallInfo
    public String getTestName() {
        return this.f8428c;
    }

    @NonNull
    public String toString() {
        return "MaxAdWaterfallInfo{name=" + this.f8427b + ", testName=" + this.f8428c + ", networkResponses=" + this.f8429d + ", latencyMillis=" + this.f8430e + '}';
    }

    public MaxAdWaterfallInfoImpl(@Nullable a3 a3Var, String str, String str2, long j10, List<MaxNetworkResponseInfo> list, c3 c3Var, List<String> list2, String str3, String str4) {
        this.f8426a = a3Var;
        this.f8427b = str;
        this.f8428c = str2;
        this.f8430e = j10;
        this.f8429d = list;
        this.f8431f = c3Var;
        this.f8432g = list2;
        this.f8433h = str3;
        this.f8434i = str4;
    }
}
