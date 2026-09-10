package com.chartboost.sdk.impl;

import com.chartboost.sdk.internal.Model.CBError;
import java.io.File;
import java.util.HashMap;

/* JADX INFO: loaded from: classes3.dex */
public class v1 extends v2 {
    public final k6 k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final a3 f15342l;
    public final u1 m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final String f15343n;

    public v1(k6 k6Var, a3 a3Var, u1 u1Var, File file, String str) {
        super(v2.c.GET, u1Var.d, ae.NORMAL, file);
        this.f15349i = v2.b.ASYNC;
        this.k = k6Var;
        this.f15342l = a3Var;
        this.m = u1Var;
        this.f15343n = str;
    }

    @Override // com.chartboost.sdk.impl.v2
    public void a(CBError cBError, y2 y2Var) {
        this.k.a(this, cBError, y2Var);
    }

    @Override // com.chartboost.sdk.impl.v2
    public void a(Void r1, y2 y2Var) {
        this.k.a(this, null, null);
    }

    @Override // com.chartboost.sdk.impl.v2
    public w2 a() {
        HashMap map = new HashMap();
        map.put("X-Chartboost-App", this.f15343n);
        map.put("X-Chartboost-Client", g3.b());
        map.put("X-Chartboost-Reachability", Integer.toString(this.f15342l.c().b()));
        return new w2(map, null, null);
    }
}
