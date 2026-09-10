package com.startapp.sdk.internal;

import com.mbridge.msdk.playercommon.exoplayer2.source.chunk.ChunkedTrackBlacklistUtil;
import com.startapp.sdk.adsbase.remoteconfig.AnalyticsCategoryConfig;
import com.startapp.sdk.adsbase.remoteconfig.AnalyticsCategoryFilterConfig;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes6.dex */
public final class j9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final double f41136a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f41137b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f41138c;
    public final boolean d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f41139e;
    public final long f;
    public final List g;

    public j9(i9 i9Var) {
        this.f41136a = i9Var.f41084a;
        this.f41137b = i9Var.f41085b;
        this.f41138c = i9Var.f41086c;
        this.d = i9Var.d;
        this.f41139e = Math.max(ChunkedTrackBlacklistUtil.DEFAULT_TRACK_BLACKLIST_MS, vi.e(i9Var.f41087e));
        this.f = Math.max(0L, vi.e(i9Var.f));
        ArrayList arrayList = i9Var.g;
        this.g = arrayList != null ? Collections.unmodifiableList(arrayList) : Collections.EMPTY_LIST;
    }

    public j9(j9 j9Var, AnalyticsCategoryConfig analyticsCategoryConfig) {
        long jMax;
        long jMax2;
        Double dValueOf = Double.valueOf(j9Var.f41136a);
        Double dA = analyticsCategoryConfig.a();
        this.f41136a = (dA != null ? dA : dValueOf).doubleValue();
        Integer numValueOf = Integer.valueOf(j9Var.f41137b);
        Integer numD = analyticsCategoryConfig.d();
        this.f41137b = (numD != null ? numD : numValueOf).intValue();
        Integer numValueOf2 = Integer.valueOf(j9Var.f41138c);
        Integer numE = analyticsCategoryConfig.e();
        this.f41138c = (numE != null ? numE : numValueOf2).intValue();
        Boolean boolValueOf = Boolean.valueOf(j9Var.d);
        Boolean boolF = analyticsCategoryConfig.f();
        this.d = (boolF != null ? boolF : boolValueOf).booleanValue();
        if (analyticsCategoryConfig.g() == null) {
            jMax = j9Var.f41139e;
        } else {
            jMax = Math.max(ChunkedTrackBlacklistUtil.DEFAULT_TRACK_BLACKLIST_MS, vi.e(analyticsCategoryConfig.g()));
        }
        this.f41139e = jMax;
        if (analyticsCategoryConfig.c() == null) {
            jMax2 = j9Var.f;
        } else {
            jMax2 = Math.max(0L, vi.e(analyticsCategoryConfig.c()));
        }
        this.f = jMax2;
        List list = j9Var.g;
        List<AnalyticsCategoryFilterConfig> listB = analyticsCategoryConfig.b();
        List listUnmodifiableList = null;
        if (listB != null) {
            for (AnalyticsCategoryFilterConfig analyticsCategoryFilterConfig : listB) {
                if (analyticsCategoryFilterConfig != null) {
                    listUnmodifiableList = listUnmodifiableList == null ? new ArrayList(listB.size()) : listUnmodifiableList;
                    listUnmodifiableList.add(new m9(analyticsCategoryFilterConfig));
                }
            }
            if (listUnmodifiableList != null) {
                WeakHashMap weakHashMap = vi.f41589a;
                listUnmodifiableList = Collections.unmodifiableList(listUnmodifiableList);
            }
        }
        this.g = listUnmodifiableList != null ? listUnmodifiableList : list;
    }
}
