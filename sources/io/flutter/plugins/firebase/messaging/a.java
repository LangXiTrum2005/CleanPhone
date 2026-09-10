package io.flutter.plugins.firebase.messaging;

import android.app.Service;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import androidx.lifecycle.a0;
import ea.b0;
import gj.i;
import gj.j;
import gj.m;
import gj.n;
import gj.o;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.ExecutorService;
import v9.e;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class a extends Service {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Object f43404f = new Object();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final HashMap f43405g = new HashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public m f43406a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public o f43407b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public e f43408c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f43409d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ArrayList f43410e = new ArrayList();

    public static o b(Context context, ComponentName componentName, boolean z10, int i10, boolean z11) {
        o iVar;
        b0 b0Var = new b0(20);
        HashMap map = f43405g;
        o oVar = (o) map.get(b0Var);
        if (oVar != null) {
            return oVar;
        }
        if (z11) {
            iVar = new i(context, componentName);
        } else {
            if (!z10) {
                throw new IllegalArgumentException("Can't be here without a job id");
            }
            iVar = new n(context, componentName, i10);
        }
        map.put(b0Var, iVar);
        return iVar;
    }

    public final void a(boolean z10) {
        if (this.f43408c == null) {
            this.f43408c = new e(this);
            o oVar = this.f43407b;
            if (oVar != null && z10) {
                oVar.d();
            }
            e eVar = this.f43408c;
            ((ExecutorService) eVar.f52505d).execute(new a0(eVar, 21));
        }
    }

    public final void c() {
        ArrayList arrayList = this.f43410e;
        if (arrayList != null) {
            synchronized (arrayList) {
                try {
                    this.f43408c = null;
                    ArrayList arrayList2 = this.f43410e;
                    if (arrayList2 != null && arrayList2.size() > 0) {
                        a(false);
                    } else if (!this.f43409d) {
                        this.f43407b.c();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        m mVar = this.f43406a;
        if (mVar != null) {
            return mVar.getBinder();
        }
        return null;
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        this.f43406a = new m(this);
        this.f43407b = null;
        this.f43407b = b(this, new ComponentName(this, getClass()), false, 0, true);
    }

    @Override // android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        e eVar = this.f43408c;
        if (eVar != null) {
            ((a) eVar.f52504c).c();
        }
        synchronized (this.f43410e) {
            this.f43409d = true;
            this.f43407b.c();
        }
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i10, int i11) {
        this.f43407b.e();
        synchronized (this.f43410e) {
            ArrayList arrayList = this.f43410e;
            if (intent == null) {
                intent = new Intent();
            }
            arrayList.add(new j(this, intent, i11));
            a(true);
        }
        return 3;
    }
}
