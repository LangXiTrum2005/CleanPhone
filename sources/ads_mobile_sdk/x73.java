package ads_mobile_sdk;

import android.app.AppOpsManager;
import android.content.Context;
import android.os.Build;
import android.view.View;
import com.google.common.base.formularize;
import com.google.common.util.concurrent.adultoid;
import com.google.common.util.concurrent.arytenoidectomy;
import java.util.HashMap;
import java.util.concurrent.ExecutorService;
import saneness.amphitheatre;
import saneness.sakeen;
import saneness.ventriculoatrial;

/* JADX INFO: loaded from: classes.dex */
public final class x73 implements sakeen, ventriculoatrial {
    public static final String[] h = {"android:establish_vpn_service", "android:establish_vpn_manager"};
    public final amphitheatre a;
    public final Context b;
    public final ExecutorService c;
    public long d = 0;
    public long e = 0;
    public long f = -1;
    public boolean g = false;

    public x73(Context context, amphitheatre amphitheatreVar, ExecutorService executorService, String[] strArr) {
        this.a = amphitheatreVar;
        this.b = context;
        this.c = executorService;
    }

    @Override // saneness.sakeen
    public final void a(HashMap map) {
        long j;
        c();
        synchronized (this) {
            try {
                j = this.g ? this.e - this.d : -1L;
            } catch (Throwable th) {
                throw th;
            }
        }
        map.put("vs", Long.valueOf(j));
        map.put("vf", Long.valueOf(b()));
    }

    @Override // saneness.sakeen
    public final void b(HashMap map) {
        c();
    }

    public final void c() {
        synchronized (this) {
            try {
                if (this.g) {
                    this.a.getClass();
                    this.e = System.currentTimeMillis();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void d() {
        try {
            ((AppOpsManager) formularize.triweekly(this.b.getSystemService("appops"))).startWatchingActive(h, this.c, new w73(this));
        } catch (Throwable unused) {
        }
    }

    public final long b() {
        long j;
        synchronized (this) {
            j = this.f;
            this.f = -1L;
        }
        return j;
    }

    @Override // saneness.sakeen
    public final void a(HashMap map, Context context, View view) {
        c();
    }

    @Override // saneness.ventriculoatrial
    public final adultoid a() {
        if (Build.VERSION.SDK_INT < 30) {
            return arytenoidectomy.taiyuan();
        }
        return arytenoidectomy.cutely(new Runnable() { // from class: saneness.dural
            @Override // java.lang.Runnable
            public final void run() {
                this.f37134kowloon.d();
            }
        }, this.c);
    }
}
