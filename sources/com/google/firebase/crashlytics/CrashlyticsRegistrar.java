package com.google.firebase.crashlytics;

import android.util.Log;
import com.google.android.gms.internal.ads.em0;
import com.google.android.gms.internal.auth.i;
import com.google.firebase.components.ComponentRegistrar;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import mb.g;
import sb.a;
import sb.b;
import sb.c;
import tb.h;
import tb.q;
import tj.i0;
import vd.d;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class CrashlyticsRegistrar implements ComponentRegistrar {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f24665d = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q f24666a = new q(a.class, ExecutorService.class);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q f24667b = new q(b.class, ExecutorService.class);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final q f24668c = new q(c.class, ExecutorService.class);

    static {
        Map map = vd.c.f52565b;
        d dVar = d.f52566a;
        if (map.containsKey(dVar)) {
            Log.d("FirebaseSessions", "Dependency " + dVar + " already added.");
            return;
        }
        map.put(dVar, new vd.a(new CountDownLatch(1)));
        Log.d("FirebaseSessions", "Dependency to " + dVar + " added.");
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public final List getComponents() {
        em0 em0VarA = tb.a.a(vb.c.class);
        em0VarA.f14010a = "fire-cls";
        em0VarA.a(h.b(g.class));
        em0VarA.a(h.b(uc.d.class));
        em0VarA.a(new h(this.f24666a, 1, 0));
        em0VarA.a(new h(this.f24667b, 1, 0));
        em0VarA.a(new h(this.f24668c, 1, 0));
        em0VarA.a(new h(0, 2, wb.a.class));
        em0VarA.a(new h(0, 2, qb.b.class));
        em0VarA.a(new h(0, 2, sd.a.class));
        em0VarA.f14015f = new i0(this, 4);
        em0VarA.c(2);
        return Arrays.asList(em0VarA.b(), i.f("fire-cls", "20.1.0"));
    }
}
