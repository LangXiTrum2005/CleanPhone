package com.chartboost.sdk.impl;

import com.chartboost.sdk.internal.Model.CBError;
import java.io.File;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class gj extends v2 {
    public final a3 k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final a f14031l;
    public final String m;

    public interface a {
        void a(String str, String str2);

        void a(String str, String str2, long j, p0 p0Var);

        void a(String str, String str2, CBError cBError);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gj(a3 a3Var, File outputFile, String uri, a aVar, ae priority, String appId) {
        super(v2.c.GET, uri, priority, outputFile);
        Intrinsics.f(outputFile, "outputFile");
        Intrinsics.f(uri, "uri");
        Intrinsics.f(priority, "priority");
        Intrinsics.f(appId, "appId");
        this.k = a3Var;
        this.f14031l = aVar;
        this.m = appId;
        this.f15349i = v2.b.ASYNC;
    }

    @Override // com.chartboost.sdk.impl.v2
    public w2 a() {
        HashMap map = new HashMap();
        map.put("X-Chartboost-App", this.m);
        map.put("X-Chartboost-Client", g3.b());
        a3 a3Var = this.k;
        map.put("X-Chartboost-Reachability", String.valueOf(a3Var != null ? a3Var.c() : null));
        return new w2(map, null, null);
    }

    @Override // com.chartboost.sdk.impl.v2
    public void a(CBError cBError, y2 y2Var) {
        a aVar = this.f14031l;
        if (aVar != null) {
            String strE = e();
            File file = this.d;
            Intrinsics.c(file);
            String name = file.getName();
            Intrinsics.e(name, "getName(...)");
            aVar.a(strE, name, cBError);
        }
    }

    @Override // com.chartboost.sdk.impl.v2
    public void a(Object obj, y2 y2Var) {
        a aVar = this.f14031l;
        if (aVar != null) {
            String strE = e();
            File file = this.d;
            Intrinsics.c(file);
            String name = file.getName();
            Intrinsics.e(name, "getName(...)");
            aVar.a(strE, name);
        }
    }

    @Override // com.chartboost.sdk.impl.v2
    public void a(String uri, long j) {
        Intrinsics.f(uri, "uri");
        a aVar = this.f14031l;
        if (aVar != null) {
            File file = this.d;
            Intrinsics.c(file);
            String name = file.getName();
            Intrinsics.e(name, "getName(...)");
            aVar.a(uri, name, j, null);
        }
    }
}
