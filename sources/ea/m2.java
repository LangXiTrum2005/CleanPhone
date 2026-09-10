package ea;

import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import com.adjust.sdk.Constants;
import com.google.android.gms.internal.ads.d30;
import com.google.android.gms.internal.measurement.k7;
import java.util.ArrayDeque;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class m2 implements Application.ActivityLifecycleCallbacks {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f39607a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f39608b;

    public m2(p2 p2Var) {
        this.f39607a = 0;
        this.f39608b = p2Var;
    }

    public void i(k7 k7Var, Bundle bundle) {
        z2 z2Var;
        m1 m1Var;
        Uri uri;
        p2 p2Var = (p2) this.f39608b;
        try {
            try {
                m1 m1Var2 = (m1) p2Var.f3623a;
                s0 s0Var = m1Var2.f39587f;
                m1.h(s0Var);
                s0Var.f39760n.b("onActivityCreated");
                Intent intent = k7Var.f23676c;
                if (intent != null) {
                    Uri data = intent.getData();
                    if (data == null || !data.isHierarchical()) {
                        Bundle extras = intent.getExtras();
                        if (extras != null) {
                            String string = extras.getString("com.android.vending.referral_url");
                            if (!TextUtils.isEmpty(string)) {
                                data = Uri.parse(string);
                                uri = data;
                            }
                        }
                        uri = null;
                    } else {
                        uri = data;
                    }
                    if (uri != null && uri.isHierarchical()) {
                        m1.f(m1Var2.f39590i);
                        String str = l4.H1(intent) ? "gs" : "auto";
                        String queryParameter = uri.getQueryParameter(Constants.REFERRER);
                        boolean z10 = bundle == null;
                        j1 j1Var = m1Var2.f39588g;
                        m1.h(j1Var);
                        j1Var.P0(new g2(this, z10, uri, str, queryParameter));
                        m1Var = (m1) p2Var.f3623a;
                    }
                    z2Var = m1Var.l;
                }
                m1Var = (m1) p2Var.f3623a;
            } catch (RuntimeException e10) {
                s0 s0Var2 = ((m1) p2Var.f3623a).f39587f;
                m1.h(s0Var2);
                s0Var2.f39753f.c(e10, "Throwable caught in onActivityCreated");
            }
            z2Var = m1Var.l;
        } finally {
            z2Var = ((m1) p2Var.f3623a).l;
            m1.g(z2Var);
            z2Var.N0(k7Var, bundle);
        }
    }

    public void j(k7 k7Var) {
        z2 z2Var = ((m1) ((p2) this.f39608b).f3623a).l;
        m1.g(z2Var);
        synchronized (z2Var.l) {
            try {
                if (Objects.equals(z2Var.f39953g, k7Var)) {
                    z2Var.f39953g = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (((m1) z2Var.f3623a).f39585d.V0()) {
            z2Var.f39952f.remove(Integer.valueOf(k7Var.f23674a));
        }
    }

    public void k(k7 k7Var) {
        m1 m1Var = (m1) ((p2) this.f39608b).f3623a;
        z2 z2Var = m1Var.l;
        m1.g(z2Var);
        synchronized (z2Var.l) {
            z2Var.f39957k = false;
            z2Var.f39954h = true;
        }
        m1 m1Var2 = (m1) z2Var.f3623a;
        m1Var2.f39592k.getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (m1Var2.f39585d.V0()) {
            w2 w2VarQ0 = z2Var.Q0(k7Var);
            z2Var.f39950d = z2Var.f39949c;
            z2Var.f39949c = null;
            j1 j1Var = m1Var2.f39588g;
            m1.h(j1Var);
            j1Var.P0(new com.google.android.gms.internal.ads.q1(z2Var, w2VarQ0, jElapsedRealtime));
        } else {
            z2Var.f39949c = null;
            j1 j1Var2 = m1Var2.f39588g;
            m1.h(j1Var2);
            j1Var2.P0(new d30(z2Var, jElapsedRealtime));
        }
        p3 p3Var = m1Var.f39589h;
        m1.g(p3Var);
        m1 m1Var3 = (m1) p3Var.f3623a;
        m1Var3.f39592k.getClass();
        long jElapsedRealtime2 = SystemClock.elapsedRealtime();
        j1 j1Var3 = m1Var3.f39588g;
        m1.h(j1Var3);
        j1Var3.P0(new m3(p3Var, jElapsedRealtime2, 1));
    }

    public void l(k7 k7Var) {
        m1 m1Var = (m1) ((p2) this.f39608b).f3623a;
        p3 p3Var = m1Var.f39589h;
        m1.g(p3Var);
        m1 m1Var2 = (m1) p3Var.f3623a;
        m1Var2.f39592k.getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        j1 j1Var = m1Var2.f39588g;
        m1.h(j1Var);
        j1Var.P0(new m3(p3Var, jElapsedRealtime, 0));
        z2 z2Var = m1Var.l;
        m1.g(z2Var);
        Object obj = z2Var.l;
        synchronized (obj) {
            try {
                z2Var.f39957k = true;
                if (!Objects.equals(k7Var, z2Var.f39953g)) {
                    synchronized (obj) {
                        z2Var.f39953g = k7Var;
                        z2Var.f39954h = false;
                        m1 m1Var3 = (m1) z2Var.f3623a;
                        if (m1Var3.f39585d.V0()) {
                            z2Var.f39955i = null;
                            j1 j1Var2 = m1Var3.f39588g;
                            m1.h(j1Var2);
                            j1Var2.P0(new y2(z2Var, 1));
                        }
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        m1 m1Var4 = (m1) z2Var.f3623a;
        if (!m1Var4.f39585d.V0()) {
            z2Var.f39949c = z2Var.f39955i;
            j1 j1Var3 = m1Var4.f39588g;
            m1.h(j1Var3);
            j1Var3.P0(new y2(z2Var, 0));
            return;
        }
        z2Var.O0(k7Var.f23675b, z2Var.Q0(k7Var), false);
        y yVar = ((m1) z2Var.f3623a).f39594n;
        m1.e(yVar);
        m1 m1Var5 = (m1) yVar.f3623a;
        m1Var5.f39592k.getClass();
        long jElapsedRealtime2 = SystemClock.elapsedRealtime();
        j1 j1Var4 = m1Var5.f39588g;
        m1.h(j1Var4);
        j1Var4.P0(new d30(yVar, jElapsedRealtime2));
    }

    public void m(k7 k7Var, Bundle bundle) {
        w2 w2Var;
        z2 z2Var = ((m1) ((p2) this.f39608b).f3623a).l;
        m1.g(z2Var);
        if (!((m1) z2Var.f3623a).f39585d.V0() || bundle == null || (w2Var = (w2) z2Var.f39952f.get(Integer.valueOf(k7Var.f23674a))) == null) {
            return;
        }
        Bundle bundle2 = new Bundle();
        bundle2.putLong("id", w2Var.f39864c);
        bundle2.putString("name", w2Var.f39862a);
        bundle2.putString("referrer_name", w2Var.f39863b);
        bundle.putBundle("com.google.app_measurement.screen_service", bundle2);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        switch (this.f39607a) {
            case 0:
                i(k7.b(activity), bundle);
                break;
            default:
                Intent intent = activity.getIntent();
                if (intent != null) {
                    ArrayDeque arrayDeque = (ArrayDeque) this.f39608b;
                    Bundle bundle2 = null;
                    try {
                        Bundle extras = intent.getExtras();
                        if (extras != null) {
                            String string = extras.getString("google.message_id");
                            if (string == null) {
                                string = extras.getString("message_id");
                            }
                            if (!TextUtils.isEmpty(string)) {
                                if (!arrayDeque.contains(string)) {
                                    arrayDeque.add(string);
                                }
                            }
                            bundle2 = extras.getBundle("gcm.n.analytics_data");
                        }
                    } catch (RuntimeException e10) {
                        Log.w("FirebaseMessaging", "Failed trying to get analytics data from Intent extras.", e10);
                    }
                    if (bundle2 == null ? false : "1".equals(bundle2.getString("google.c.a.e"))) {
                        d0.c.B(bundle2);
                    }
                    break;
                }
                break;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        switch (this.f39607a) {
            case 0:
                j(k7.b(activity));
                break;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        switch (this.f39607a) {
            case 0:
                k(k7.b(activity));
                break;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        switch (this.f39607a) {
            case 0:
                l(k7.b(activity));
                break;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        switch (this.f39607a) {
            case 0:
                m(k7.b(activity), bundle);
                break;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        int i10 = this.f39607a;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        int i10 = this.f39607a;
    }

    public m2() {
        this.f39607a = 1;
        this.f39608b = new ArrayDeque(10);
    }

    private final void a(Activity activity) {
    }

    private final void b(Activity activity) {
    }

    private final void c(Activity activity) {
    }

    private final void e(Activity activity) {
    }

    private final void f(Activity activity) {
    }

    private final void g(Activity activity) {
    }

    private final void h(Activity activity) {
    }

    private final void d(Activity activity, Bundle bundle) {
    }
}
