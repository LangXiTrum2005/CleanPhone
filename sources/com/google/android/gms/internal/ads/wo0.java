package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.telephony.TelephonyManager;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class wo0 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static wo0 f21555f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Executor f21556a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CopyOnWriteArrayList f21557b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f21558c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f21559d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f21560e;

    public wo0(Context context) {
        Executor executorG = rb0.g();
        this.f21556a = executorG;
        this.f21557b = new CopyOnWriteArrayList();
        this.f21558c = new Object();
        this.f21559d = 0;
        executorG.execute(new gm0(3, this, context));
    }

    public static synchronized wo0 a(Context context) {
        try {
            if (f21555f == null) {
                f21555f = new wo0(context);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f21555f;
    }

    public final int b() {
        int i10;
        synchronized (this.f21558c) {
            i10 = this.f21559d;
        }
        return i10;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0035  */
    /* JADX WARN: Code duplicated, block: B:21:0x0037  */
    /* JADX WARN: Code duplicated, block: B:22:0x0039  */
    /* JADX WARN: Code duplicated, block: B:24:0x0040  */
    /* JADX WARN: Code duplicated, block: B:25:0x0042  */
    /* JADX WARN: Code duplicated, block: B:26:0x0044  */
    /* JADX WARN: Code duplicated, block: B:27:0x0046  */
    public final /* synthetic */ void c(Context context) {
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        int i10 = 0;
        if (connectivityManager != null) {
            try {
                NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
                i10 = 1;
                if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
                    int type = activeNetworkInfo.getType();
                    if (type == 0) {
                        switch (activeNetworkInfo.getSubtype()) {
                            case 1:
                            case 2:
                                i10 = 3;
                                break;
                            case 3:
                            case 4:
                            case 5:
                            case 6:
                            case 7:
                            case 8:
                            case 9:
                            case 10:
                            case 11:
                            case 12:
                            case 14:
                            case 15:
                            case 17:
                                i10 = 4;
                                break;
                            case 13:
                                i10 = 5;
                                break;
                            case 16:
                            case 19:
                            default:
                                i10 = 6;
                                break;
                            case 18:
                                i10 = 2;
                                break;
                            case 20:
                                i10 = 9;
                                break;
                        }
                    } else if (type == 1) {
                        i10 = 2;
                    } else if (type == 4 || type == 5) {
                        switch (activeNetworkInfo.getSubtype()) {
                            case 1:
                            case 2:
                                i10 = 3;
                                break;
                            case 3:
                            case 4:
                            case 5:
                            case 6:
                            case 7:
                            case 8:
                            case 9:
                            case 10:
                            case 11:
                            case 12:
                            case 14:
                            case 15:
                            case 17:
                                i10 = 4;
                                break;
                            case 13:
                                i10 = 5;
                                break;
                            case 16:
                            case 19:
                            default:
                                i10 = 6;
                                break;
                            case 18:
                                i10 = 2;
                                break;
                            case 20:
                                i10 = 9;
                                break;
                        }
                    } else if (type != 6) {
                        i10 = type != 9 ? 8 : 7;
                    } else {
                        i10 = 5;
                    }
                }
            } catch (SecurityException unused) {
            }
        }
        if (Build.VERSION.SDK_INT < 31 || i10 != 5) {
            d(i10);
            return;
        }
        try {
            TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
            if (telephonyManager == null) {
                throw null;
            }
            am0 am0Var = new am0(this, 0);
            telephonyManager.registerTelephonyCallback(this.f21556a, am0Var);
            telephonyManager.unregisterTelephonyCallback(am0Var);
        } catch (RuntimeException unused2) {
            d(5);
        }
    }

    public final void d(int i10) {
        CopyOnWriteArrayList<nn0> copyOnWriteArrayList = this.f21557b;
        for (nn0 nn0Var : copyOnWriteArrayList) {
            if (nn0Var.f17867a.get() == null) {
                copyOnWriteArrayList.remove(nn0Var);
            }
        }
        synchronized (this.f21558c) {
            try {
                if (this.f21560e && this.f21559d == i10) {
                    return;
                }
                this.f21560e = true;
                this.f21559d = i10;
                for (nn0 nn0Var2 : this.f21557b) {
                    nn0Var2.getClass();
                    nn0Var2.f17868b.execute(new x60(nn0Var2, 18));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
