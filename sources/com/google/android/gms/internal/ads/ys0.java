package com.google.android.gms.internal.ads;

import android.os.Handler;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class ys0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ArrayList f22361b = new ArrayList(50);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Handler f22362a;

    public ys0(Handler handler) {
        this.f22362a = handler;
    }

    public static /* synthetic */ void f(ss0 ss0Var) {
        ArrayList arrayList = f22361b;
        synchronized (arrayList) {
            try {
                if (arrayList.size() < 50) {
                    arrayList.add(ss0Var);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static ss0 g() {
        ss0 ss0Var;
        ArrayList arrayList = f22361b;
        synchronized (arrayList) {
            try {
                ss0Var = arrayList.isEmpty() ? new ss0() : (ss0) arrayList.remove(arrayList.size() - 1);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return ss0Var;
    }

    public final boolean a() {
        return this.f22362a.hasMessages(37);
    }

    public final ss0 b(int i10, Object obj) {
        ss0 ss0VarG = g();
        ss0VarG.f20047a = this.f22362a.obtainMessage(i10, obj);
        return ss0VarG;
    }

    public final boolean c(int i10) {
        return this.f22362a.sendEmptyMessage(i10);
    }

    public final void d(int i10) {
        this.f22362a.removeMessages(i10);
    }

    public final boolean e(Runnable runnable) {
        return this.f22362a.post(runnable);
    }
}
