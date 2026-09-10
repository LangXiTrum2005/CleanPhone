package com.smartdigimkt.v6;

import android.text.TextUtils;
import com.smartdigimkt.l8.e;
import com.smartdigimkt.l8.f;
import com.smartdigimkt.w6.g;
import java.io.Serializable;
import java.util.HashMap;

/* JADX INFO: loaded from: classes6.dex */
public class a implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f39163a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f39164b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f39165c;
    public int d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f39166e;
    public String f;
    public String g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f39167h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f39168i;
    public int j;
    public String k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public String f39169l;
    public int m = com.smartdigimkt.m6.b.p().j();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f39170n = -1;
    public String o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public long f39171p;
    public String q;
    public int r;
    public int s;
    public g t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public HashMap<String, Object> f39172u;
    public boolean v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f39173w;
    public double x;
    public int y;

    public static a a(String str, e eVar, f fVar) {
        a aVar = new a();
        aVar.f39168i = fVar.z0();
        aVar.j = fVar.t0();
        aVar.f39166e = fVar.h();
        aVar.f = str;
        aVar.f39163a = eVar.I();
        aVar.f39164b = eVar.v();
        aVar.k = fVar.v0();
        aVar.o = fVar.L();
        com.smartdigimkt.y6.b bVarD = fVar.D();
        if (bVarD != null) {
            bVarD.d(str);
            long jCurrentTimeMillis = System.currentTimeMillis() + bVarD.t;
            bVarD.f40251u = jCurrentTimeMillis;
            if (TextUtils.isEmpty(aVar.f39168i)) {
                aVar.f39168i = bVarD.f40233e;
            }
            aVar.f39170n = bVarD.a(eVar.v());
            aVar.f39167h = bVarD.u();
            aVar.g = bVarD.e();
            aVar.f39169l = bVarD.v;
            aVar.q = bVarD.f40252w;
            aVar.f39171p = jCurrentTimeMillis;
        } else {
            aVar.f39170n = -1;
        }
        aVar.r = eVar.B();
        aVar.s = eVar.A();
        aVar.x = fVar.q();
        aVar.y = fVar.r();
        return aVar;
    }
}
