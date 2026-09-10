package com.google.firebase.analytics;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.internal.measurement.c8;
import com.google.android.gms.internal.measurement.k7;
import com.google.android.gms.internal.measurement.m7;
import com.google.android.gms.internal.measurement.n7;
import com.google.android.gms.tasks.Tasks;
import ea.q2;
import java.util.HashMap;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import k9.c0;
import mb.g;
import pb.a;
import pb.b;
import pb.c;
import pb.e;
import uc.d;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class FirebaseAnalytics {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static volatile FirebaseAnalytics f24658c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c8 f24659a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public c f24660b;

    public FirebaseAnalytics(c8 c8Var) {
        c0.h(c8Var);
        this.f24659a = c8Var;
    }

    @NonNull
    @Keep
    public static FirebaseAnalytics getInstance(@NonNull Context context) {
        if (f24658c == null) {
            synchronized (FirebaseAnalytics.class) {
                try {
                    if (f24658c == null) {
                        f24658c = new FirebaseAnalytics(c8.e(context, null));
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f24658c;
    }

    @Nullable
    @Keep
    public static q2 getScionFrontendApiImplementation(Context context, @Nullable Bundle bundle) {
        c8 c8VarE = c8.e(context, bundle);
        if (c8VarE == null) {
            return null;
        }
        return new e(c8VarE);
    }

    public final void a(HashMap map) {
        Bundle bundle = new Bundle();
        a aVar = (a) map.get(b.f48299a);
        if (aVar != null) {
            int iOrdinal = aVar.ordinal();
            if (iOrdinal == 0) {
                bundle.putString("ad_storage", "granted");
            } else if (iOrdinal == 1) {
                bundle.putString("ad_storage", "denied");
            }
        }
        a aVar2 = (a) map.get(b.f48300b);
        if (aVar2 != null) {
            int iOrdinal2 = aVar2.ordinal();
            if (iOrdinal2 == 0) {
                bundle.putString("analytics_storage", "granted");
            } else if (iOrdinal2 == 1) {
                bundle.putString("analytics_storage", "denied");
            }
        }
        a aVar3 = (a) map.get(b.f48301c);
        if (aVar3 != null) {
            int iOrdinal3 = aVar3.ordinal();
            if (iOrdinal3 == 0) {
                bundle.putString("ad_user_data", "granted");
            } else if (iOrdinal3 == 1) {
                bundle.putString("ad_user_data", "denied");
            }
        }
        a aVar4 = (a) map.get(b.f48302d);
        if (aVar4 != null) {
            int iOrdinal4 = aVar4.ordinal();
            if (iOrdinal4 == 0) {
                bundle.putString("ad_personalization", "granted");
            } else if (iOrdinal4 == 1) {
                bundle.putString("ad_personalization", "denied");
            }
        }
        c8 c8Var = this.f24659a;
        c8Var.getClass();
        c8Var.c(new m7(c8Var, bundle, 1));
    }

    public final ExecutorService b() {
        c cVar;
        synchronized (FirebaseAnalytics.class) {
            try {
                if (this.f24660b == null) {
                    this.f24660b = new c(0, 1, 30L, TimeUnit.SECONDS, new ArrayBlockingQueue(100));
                }
                cVar = this.f24660b;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return cVar;
    }

    @NonNull
    @Keep
    public String getFirebaseInstanceId() {
        try {
            Object obj = uc.c.f51984m;
            return (String) Tasks.await(((uc.c) g.e().c(d.class)).c(), 30000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e10) {
            throw new IllegalStateException(e10);
        } catch (ExecutionException e11) {
            throw new IllegalStateException(e11.getCause());
        } catch (TimeoutException unused) {
            throw new IllegalThreadStateException("Firebase Installations getId Task has timed out.");
        }
    }

    @Keep
    @Deprecated
    public void setCurrentScreen(@NonNull Activity activity, @Nullable String str, @Nullable String str2) {
        k7 k7VarB = k7.b(activity);
        c8 c8Var = this.f24659a;
        c8Var.getClass();
        c8Var.c(new n7(c8Var, k7VarB, str, str2));
    }
}
