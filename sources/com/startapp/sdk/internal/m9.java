package com.startapp.sdk.internal;

import com.startapp.sdk.adsbase.remoteconfig.AnalyticsCategoryFilterConfig;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes6.dex */
public final class m9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f41244a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f41245b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f41246c;
    public final List d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List f41247e;
    public final long f;

    public m9(l9 l9Var) {
        ArrayList arrayList = l9Var.f41207a;
        WeakHashMap weakHashMap = vi.f41589a;
        this.f41244a = arrayList != null ? Collections.unmodifiableList(arrayList) : Collections.EMPTY_LIST;
        ArrayList arrayList2 = l9Var.f41208b;
        this.f41245b = arrayList2 != null ? Collections.unmodifiableList(arrayList2) : Collections.EMPTY_LIST;
        List list = Collections.EMPTY_LIST;
        this.f41246c = list;
        this.d = list;
        ArrayList arrayList3 = l9Var.f41209c;
        this.f41247e = arrayList3 != null ? Collections.unmodifiableList(arrayList3) : list;
        this.f = Math.max(0L, vi.e(l9Var.d));
    }

    public m9(AnalyticsCategoryFilterConfig analyticsCategoryFilterConfig) {
        List listE = analyticsCategoryFilterConfig.e();
        WeakHashMap weakHashMap = vi.f41589a;
        this.f41244a = listE != null ? Collections.unmodifiableList(listE) : Collections.EMPTY_LIST;
        List listB = analyticsCategoryFilterConfig.b();
        this.f41245b = listB != null ? Collections.unmodifiableList(listB) : Collections.EMPTY_LIST;
        List listD = analyticsCategoryFilterConfig.d();
        this.f41246c = listD != null ? Collections.unmodifiableList(listD) : Collections.EMPTY_LIST;
        List listA = analyticsCategoryFilterConfig.a();
        this.d = listA != null ? Collections.unmodifiableList(listA) : Collections.EMPTY_LIST;
        List listC = analyticsCategoryFilterConfig.c();
        this.f41247e = listC != null ? Collections.unmodifiableList(listC) : Collections.EMPTY_LIST;
        this.f = Math.max(0L, vi.e(analyticsCategoryFilterConfig.f()));
    }
}
