package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import com.ironsource.X3;
import java.util.concurrent.ExecutionException;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public abstract class mc1 extends ud1 implements Runnable {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ int f17394k = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public ListenableFuture f17395h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Class f17396i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Object f17397j;

    public mc1(ListenableFuture listenableFuture, Class cls, Object obj) {
        listenableFuture.getClass();
        this.f17395h = listenableFuture;
        this.f17396i = cls;
        this.f17397j = obj;
    }

    @Override // com.google.android.gms.internal.ads.uc1
    public final void e() {
        n(this.f17395h);
        this.f17395h = null;
        this.f17396i = null;
        this.f17397j = null;
    }

    @Override // com.google.android.gms.internal.ads.uc1
    public final String f() {
        String strJ;
        ListenableFuture listenableFuture = this.f17395h;
        Class cls = this.f17396i;
        Object obj = this.f17397j;
        String strF = super.f();
        if (listenableFuture != null) {
            String string = listenableFuture.toString();
            strJ = q4.a.j(new StringBuilder(string.length() + 16), "inputFuture=[", string, "], ");
        } else {
            strJ = "";
        }
        if (cls == null || obj == null) {
            if (strF != null) {
                return strJ.concat(strF);
            }
            return null;
        }
        int length = strJ.length();
        String string2 = cls.toString();
        int length2 = string2.length();
        String string3 = obj.toString();
        StringBuilder sb2 = new StringBuilder(string3.length() + length + 15 + length2 + 13 + 1);
        d5.u.r(sb2, strJ, "exceptionType=[", string2, "], fallback=[");
        return defpackage.e.q(string3, X3.j.f27836e, sb2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        Object objG;
        ListenableFuture listenableFuture = this.f17395h;
        Class cls = this.f17396i;
        Object obj = this.f17397j;
        if (((obj == null) || ((listenableFuture == 0) | (cls == null))) || (this.f13503a instanceof nc1)) {
            return;
        }
        this.f17395h = null;
        try {
            th = listenableFuture instanceof qe1 ? ((qe1) listenableFuture).a() : null;
            objG = th == null ? zw1.G(listenableFuture) : null;
        } catch (ExecutionException e10) {
            Throwable cause = e10.getCause();
            if (cause == null) {
                String strValueOf = String.valueOf(listenableFuture.getClass());
                String strValueOf2 = String.valueOf(e10.getClass());
                StringBuilder sb2 = new StringBuilder(strValueOf2.length() + strValueOf.length() + 19 + 16);
                d5.u.r(sb2, "Future type ", strValueOf, " threw ", strValueOf2);
                sb2.append(" without a cause");
                cause = new NullPointerException(sb2.toString());
            }
            th = cause;
        } catch (Throwable th2) {
            th = th2;
        }
        if (th == null) {
            c(objG);
            return;
        }
        if (!cls.isInstance(th)) {
            l(listenableFuture);
            return;
        }
        try {
            Object objT = t(obj, th);
            this.f17396i = null;
            this.f17397j = null;
            s(objT);
        } catch (Throwable th3) {
            try {
                if (th3 instanceof InterruptedException) {
                    Thread.currentThread().interrupt();
                }
                d(th3);
            } finally {
                this.f17396i = null;
                this.f17397j = null;
            }
        }
    }

    public abstract void s(Object obj);

    public abstract Object t(Object obj, Throwable th2);
}
