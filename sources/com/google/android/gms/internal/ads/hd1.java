package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import com.ironsource.X3;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public abstract class hd1 extends ud1 implements Runnable {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ int f15263j = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public ListenableFuture f15264h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Object f15265i;

    public hd1(ListenableFuture listenableFuture, Object obj) {
        listenableFuture.getClass();
        this.f15264h = listenableFuture;
        this.f15265i = obj;
    }

    @Override // com.google.android.gms.internal.ads.uc1
    public final void e() {
        n(this.f15264h);
        this.f15264h = null;
        this.f15265i = null;
    }

    @Override // com.google.android.gms.internal.ads.uc1
    public final String f() {
        String strJ;
        ListenableFuture listenableFuture = this.f15264h;
        Object obj = this.f15265i;
        String strF = super.f();
        if (listenableFuture != null) {
            String string = listenableFuture.toString();
            strJ = q4.a.j(new StringBuilder(string.length() + 16), "inputFuture=[", string, "], ");
        } else {
            strJ = "";
        }
        if (obj == null) {
            if (strF != null) {
                return strJ.concat(strF);
            }
            return null;
        }
        int length = strJ.length();
        String string2 = obj.toString();
        return d5.u.h(new StringBuilder(string2.length() + length + 10 + 1), strJ, "function=[", string2, X3.j.f27836e);
    }

    @Override // java.lang.Runnable
    public final void run() {
        ListenableFuture listenableFuture = this.f15264h;
        Object obj = this.f15265i;
        if (((this.f13503a instanceof nc1) | (listenableFuture == null)) || (obj == null)) {
            return;
        }
        this.f15264h = null;
        if (listenableFuture.isCancelled()) {
            l(listenableFuture);
            return;
        }
        try {
            try {
                Object objT = t(obj, zw1.G(listenableFuture));
                this.f15265i = null;
                s(objT);
            } catch (Throwable th2) {
                try {
                    if (th2 instanceof InterruptedException) {
                        Thread.currentThread().interrupt();
                    }
                    d(th2);
                } finally {
                    this.f15265i = null;
                }
            }
        } catch (Error e10) {
            d(e10);
        } catch (CancellationException unused) {
            cancel(false);
        } catch (ExecutionException e11) {
            d(e11.getCause());
        } catch (Exception e12) {
            d(e12);
        }
    }

    public abstract void s(Object obj);

    public abstract Object t(Object obj, Object obj2);
}
