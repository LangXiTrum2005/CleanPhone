package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.Intent;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class r71 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19453a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ln0 f19454b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Runnable f19455c;

    public /* synthetic */ r71(ln0 ln0Var, Runnable runnable, int i10) {
        this.f19453a = i10;
        this.f19454b = ln0Var;
        this.f19455c = runnable;
    }

    @Override // java.lang.Runnable
    public final /* synthetic */ void run() {
        switch (this.f19453a) {
            case 0:
                ln0 ln0Var = this.f19454b;
                Runnable runnable = this.f19455c;
                if (((e71) ln0Var.f17079j) != null || ln0Var.f17070a) {
                    if (!ln0Var.f17070a) {
                        runnable.run();
                        return;
                    }
                    ((tf1) ln0Var.f17073d).b("Waiting to bind to the service.", new Object[0]);
                    ArrayList arrayList = (ArrayList) ln0Var.f17075f;
                    synchronized (arrayList) {
                        arrayList.add(runnable);
                        break;
                    }
                    return;
                }
                ((tf1) ln0Var.f17073d).b("Initiate binding to the service.", new Object[0]);
                ArrayList arrayList2 = (ArrayList) ln0Var.f17075f;
                synchronized (arrayList2) {
                    arrayList2.add(runnable);
                    break;
                }
                p71 p71Var = new p71(ln0Var);
                ln0Var.f17078i = p71Var;
                ln0Var.f17070a = true;
                if (((Context) ln0Var.f17071b).bindService((Intent) ln0Var.f17076g, p71Var, 1)) {
                    return;
                }
                ((tf1) ln0Var.f17073d).b("Failed to bind to the service.", new Object[0]);
                ln0Var.f17070a = false;
                ArrayList arrayList3 = (ArrayList) ln0Var.f17075f;
                synchronized (arrayList3) {
                    arrayList3.clear();
                    break;
                }
                return;
            default:
                ln0 ln0Var2 = this.f19454b;
                try {
                    this.f19455c.run();
                    return;
                } catch (RuntimeException e10) {
                    ((tf1) ln0Var2.f17073d).d("error caused by ", e10);
                    return;
                }
        }
    }
}
