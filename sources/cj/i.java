package cj;

import android.app.NotificationManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Binder;
import android.util.Log;
import com.applovin.impl.i0;
import com.applovin.impl.v2;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdRequestListener;
import com.applovin.mediation.MaxAdRevenueListener;
import com.google.android.gms.internal.measurement.c8;
import com.google.android.gms.internal.measurement.p7;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.ironsource.Aa;
import com.ironsource.sdk.controller.v;
import com.unity3d.mediation.LevelPlayAdInfo;
import java.util.HashMap;
import kotlin.jvm.internal.n;
import wj.r;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class i implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6451a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f6452b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f6453c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f6454d;

    public /* synthetic */ i(Object obj, boolean z10, Object obj2, int i10) {
        this.f6451a = i10;
        this.f6453c = obj;
        this.f6452b = z10;
        this.f6454d = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f6451a;
        Object obj = this.f6454d;
        boolean z10 = this.f6452b;
        Object obj2 = this.f6453c;
        switch (i10) {
            case 0:
                TaskCompletionSource taskCompletionSource = (TaskCompletionSource) obj;
                try {
                    FirebaseAnalytics firebaseAnalytics = ((m) obj2).f6466a;
                    if (firebaseAnalytics == null) {
                        n.l("analytics");
                        throw null;
                    }
                    c8 c8Var = firebaseAnalytics.f24659a;
                    Boolean boolValueOf = Boolean.valueOf(z10);
                    c8Var.getClass();
                    c8Var.c(new p7(c8Var, boolValueOf));
                    taskCompletionSource.setResult(null);
                    return;
                } catch (Exception e10) {
                    taskCompletionSource.setException(e10);
                    return;
                }
            case 1:
                ((i0) obj2).a(z10, (Runnable) obj);
                return;
            case 2:
                v2.a(z10, (MaxAdRevenueListener) obj2, (MaxAd) obj);
                return;
            case 3:
                v2.a(z10, (MaxAdRequestListener) obj2, (String) obj);
                return;
            case 4:
                Aa.a(z10, (LevelPlayAdInfo) obj2, (Aa) obj);
                return;
            case 5:
                ((v.s) obj2).a(z10, (String) obj);
                return;
            case 6:
                c cVar = (c) obj2;
                ej.d dVar = (ej.d) obj;
                try {
                    vb.c.a().b(z10);
                    mb.g gVarE = mb.g.e();
                    dVar.getClass();
                    cVar.invoke(new wj.h(Boolean.valueOf(ej.d.b(gVarE))));
                    return;
                } catch (Exception e11) {
                    dVar.getClass();
                    ej.d.a(cVar, e11);
                    return;
                }
            case 7:
                hj.b bVar = (hj.b) obj2;
                hj.f fVar = (hj.f) obj;
                HashMap map = hj.f.f42368a;
                try {
                    bd.c.a().b(z10);
                    bVar.invoke(new wj.h(r.f53297a));
                    return;
                } catch (Exception e12) {
                    fVar.getClass();
                    hj.f.a(bVar, e12);
                    return;
                }
            default:
                Context context = (Context) obj2;
                TaskCompletionSource taskCompletionSource2 = (TaskCompletionSource) obj;
                try {
                    if (Binder.getCallingUid() == context.getApplicationInfo().uid) {
                        SharedPreferences.Editor editorEdit = go.k.I(context).edit();
                        editorEdit.putBoolean("proxy_notification_initialized", true);
                        editorEdit.apply();
                        NotificationManager notificationManager = (NotificationManager) context.getSystemService(NotificationManager.class);
                        if (z10) {
                            notificationManager.setNotificationDelegate("com.google.android.gms");
                        } else if ("com.google.android.gms".equals(notificationManager.getNotificationDelegate())) {
                            notificationManager.setNotificationDelegate(null);
                        }
                    } else {
                        Log.e("FirebaseMessaging", "error configuring notification delegate for package " + context.getPackageName());
                    }
                    return;
                } finally {
                    taskCompletionSource2.trySetResult(null);
                }
        }
    }

    public /* synthetic */ i(boolean z10, Object obj, Object obj2, int i10) {
        this.f6451a = i10;
        this.f6452b = z10;
        this.f6453c = obj;
        this.f6454d = obj2;
    }
}
