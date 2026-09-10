package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class ib {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicInteger f15694a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashSet f15695b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final PriorityBlockingQueue f15696c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final PriorityBlockingQueue f15697d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final tb f15698e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final md0 f15699f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final db[] f15700g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public xa f15701h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final ArrayList f15702i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ArrayList f15703j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final b21 f15704k;

    public ib(tb tbVar, md0 md0Var) {
        b21 b21Var = new b21(new Handler(Looper.getMainLooper()));
        this.f15694a = new AtomicInteger();
        this.f15695b = new HashSet();
        this.f15696c = new PriorityBlockingQueue();
        this.f15697d = new PriorityBlockingQueue();
        this.f15702i = new ArrayList();
        this.f15703j = new ArrayList();
        this.f15698e = tbVar;
        this.f15699f = md0Var;
        this.f15700g = new db[4];
        this.f15704k = b21Var;
    }

    public final void a() {
        xa xaVar = this.f15701h;
        if (xaVar != null) {
            xaVar.f21805d = true;
            xaVar.interrupt();
        }
        db[] dbVarArr = this.f15700g;
        for (int i10 = 0; i10 < 4; i10++) {
            db dbVar = dbVarArr[i10];
            if (dbVar != null) {
                dbVar.f13482d = true;
                dbVar.interrupt();
            }
        }
        PriorityBlockingQueue priorityBlockingQueue = this.f15696c;
        PriorityBlockingQueue priorityBlockingQueue2 = this.f15697d;
        tb tbVar = this.f15698e;
        b21 b21Var = this.f15704k;
        xa xaVar2 = new xa(priorityBlockingQueue, priorityBlockingQueue2, tbVar, b21Var);
        this.f15701h = xaVar2;
        xaVar2.start();
        for (int i11 = 0; i11 < 4; i11++) {
            db dbVar2 = new db(priorityBlockingQueue2, this.f15699f, tbVar, b21Var);
            dbVarArr[i11] = dbVar2;
            dbVar2.start();
        }
    }

    public final void b(hb hbVar) {
        hbVar.zzf(this);
        HashSet hashSet = this.f15695b;
        synchronized (hashSet) {
            hashSet.add(hbVar);
        }
        hbVar.zzg(this.f15694a.incrementAndGet());
        hbVar.zzc("add-to-queue");
        c();
        this.f15696c.add(hbVar);
    }

    public final void c() {
        ArrayList arrayList = this.f15703j;
        synchronized (arrayList) {
            try {
                Iterator it = arrayList.iterator();
                if (it.hasNext()) {
                    if (it.next() != null) {
                        throw new ClassCastException();
                    }
                    throw null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
