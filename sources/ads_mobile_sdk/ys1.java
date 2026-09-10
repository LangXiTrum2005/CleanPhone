package ads_mobile_sdk;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.view.View;
import com.google.common.base.formularize;
import com.google.common.util.concurrent.adultoid;
import com.google.common.util.concurrent.arytenoidectomy;
import java.util.HashMap;
import java.util.concurrent.ExecutorService;
import saneness.sakeen;
import saneness.ventriculoatrial;

/* JADX INFO: loaded from: classes.dex */
public final class ys1 implements sakeen, ventriculoatrial {
    public final Context a;
    public final ExecutorService b;
    public NetworkCapabilities c = null;

    public ys1(Context context, ExecutorService executorService) {
        this.a = context;
        this.b = executorService;
    }

    @Override // saneness.sakeen
    public final void a(HashMap map, Context context, View view) {
    }

    @Override // saneness.sakeen
    public final void b(HashMap map) {
    }

    public final void c() {
        try {
            ((ConnectivityManager) formularize.triweekly(this.a.getSystemService("connectivity"))).registerDefaultNetworkCallback(new xs1(this));
        } catch (Throwable unused) {
        }
    }

    @Override // saneness.sakeen
    public final void a(HashMap map) {
        NetworkCapabilities networkCapabilities;
        synchronized (this) {
            networkCapabilities = this.c;
        }
        map.put("ntc", networkCapabilities);
        map.put("nt", Long.valueOf(b()));
    }

    public final long b() {
        synchronized (this) {
            try {
                NetworkCapabilities networkCapabilities = this.c;
                if (networkCapabilities != null) {
                    if (networkCapabilities.hasTransport(4)) {
                        return 2L;
                    }
                    if (this.c.hasTransport(1)) {
                        return 1L;
                    }
                    if (this.c.hasTransport(0)) {
                        return 0L;
                    }
                }
                return -1L;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // saneness.ventriculoatrial
    public final adultoid a() {
        return arytenoidectomy.cutely(new Runnable() { // from class: saneness.unrivaled
            @Override // java.lang.Runnable
            public final void run() {
                this.f37356kowloon.c();
            }
        }, this.b);
    }
}
