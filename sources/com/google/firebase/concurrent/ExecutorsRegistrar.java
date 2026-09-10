package com.google.firebase.concurrent;

import android.annotation.SuppressLint;
import com.google.android.gms.internal.ads.em0;
import com.google.firebase.components.ComponentRegistrar;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
import kd.d;
import sb.a;
import sb.b;
import sb.c;
import tb.l;
import tb.q;
import tj.g0;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
@SuppressLint({"ThreadPoolCreation"})
public class ExecutorsRegistrar implements ComponentRegistrar {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final l f24661a = new l(new d(6));

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final l f24662b = new l(new d(7));

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final l f24663c = new l(new d(8));

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final l f24664d = new l(new d(9));

    @Override // com.google.firebase.components.ComponentRegistrar
    public final List getComponents() {
        q qVar = new q(a.class, ScheduledExecutorService.class);
        q[] qVarArr = {new q(a.class, ExecutorService.class), new q(a.class, Executor.class)};
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        hashSet.add(qVar);
        for (q qVar2 : qVarArr) {
            a.a.f(qVar2, "Null interface");
        }
        Collections.addAll(hashSet, qVarArr);
        tb.a aVar = new tb.a(null, new HashSet(hashSet), new HashSet(hashSet2), 0, 0, new g0(24), hashSet3);
        q qVar3 = new q(b.class, ScheduledExecutorService.class);
        q[] qVarArr2 = {new q(b.class, ExecutorService.class), new q(b.class, Executor.class)};
        HashSet hashSet4 = new HashSet();
        HashSet hashSet5 = new HashSet();
        HashSet hashSet6 = new HashSet();
        hashSet4.add(qVar3);
        for (q qVar4 : qVarArr2) {
            a.a.f(qVar4, "Null interface");
        }
        Collections.addAll(hashSet4, qVarArr2);
        tb.a aVar2 = new tb.a(null, new HashSet(hashSet4), new HashSet(hashSet5), 0, 0, new g0(25), hashSet6);
        q qVar5 = new q(c.class, ScheduledExecutorService.class);
        q[] qVarArr3 = {new q(c.class, ExecutorService.class), new q(c.class, Executor.class)};
        HashSet hashSet7 = new HashSet();
        HashSet hashSet8 = new HashSet();
        HashSet hashSet9 = new HashSet();
        hashSet7.add(qVar5);
        for (q qVar6 : qVarArr3) {
            a.a.f(qVar6, "Null interface");
        }
        Collections.addAll(hashSet7, qVarArr3);
        tb.a aVar3 = new tb.a(null, new HashSet(hashSet7), new HashSet(hashSet8), 0, 0, new g0(26), hashSet9);
        em0 em0VarB = tb.a.b(new q(sb.d.class, Executor.class));
        em0VarB.f14015f = new g0(27);
        return Arrays.asList(aVar, aVar2, aVar3, em0VarB.b());
    }
}
