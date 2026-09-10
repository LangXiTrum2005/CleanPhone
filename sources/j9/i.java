package j9;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.os.Looper;
import com.google.android.gms.common.api.GoogleApiActivity;
import com.google.android.gms.common.api.internal.BasePendingResult;
import com.google.android.gms.common.api.internal.f0;
import com.google.android.gms.common.api.internal.v;
import com.google.android.gms.common.api.internal.z;
import com.google.android.gms.internal.measurement.u6;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import eb.d0;
import java.util.Collections;
import java.util.Set;
import k9.c0;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public abstract class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f43740a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f43741b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final r9.a f43742c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final d0 f43743d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final b f43744e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final com.google.android.gms.common.api.internal.a f43745f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Looper f43746g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f43747h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final v f43748i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final fd.b f43749j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final com.google.android.gms.common.api.internal.e f43750k;

    public i(Context context, Activity activity, d0 d0Var, b bVar, h hVar) {
        c0.i(context, "Null context is not permitted.");
        c0.i(d0Var, "Api must not be null.");
        c0.i(hVar, "Settings must not be null; use Settings.DEFAULT_SETTINGS instead.");
        Context applicationContext = context.getApplicationContext();
        c0.i(applicationContext, "The provided context did not have an application context.");
        this.f43740a = applicationContext;
        int i10 = Build.VERSION.SDK_INT;
        String attributionTag = context.getAttributionTag();
        this.f43741b = attributionTag;
        this.f43742c = i10 >= 31 ? new r9.a(context.getAttributionSource()) : null;
        this.f43743d = d0Var;
        this.f43744e = bVar;
        this.f43746g = hVar.f43739b;
        com.google.android.gms.common.api.internal.a aVar = new com.google.android.gms.common.api.internal.a(d0Var, bVar, attributionTag);
        this.f43745f = aVar;
        this.f43748i = new v(this);
        com.google.android.gms.common.api.internal.e eVarD = com.google.android.gms.common.api.internal.e.d(applicationContext);
        this.f43750k = eVarD;
        this.f43747h = eVarD.f11700h.getAndIncrement();
        this.f43749j = hVar.f43738a;
        if (activity != null && !(activity instanceof GoogleApiActivity) && Looper.myLooper() == Looper.getMainLooper()) {
            com.google.android.gms.common.api.internal.h fragment = com.google.android.gms.common.api.internal.g.getFragment(activity);
            com.google.android.gms.common.api.internal.o oVar = (com.google.android.gms.common.api.internal.o) fragment.j(com.google.android.gms.common.api.internal.o.class, "ConnectionlessLifecycleHelper");
            if (oVar == null) {
                Object obj = i9.d.f42925d;
                oVar = new com.google.android.gms.common.api.internal.o(fragment, eVarD);
            }
            oVar.f11745e.add(aVar);
            eVarD.e(oVar);
        }
        u6 u6Var = eVarD.f11705n;
        u6Var.sendMessage(u6Var.obtainMessage(7, this));
    }

    public final g9.k a() {
        g9.k kVar = new g9.k(20);
        Set set = Collections.EMPTY_SET;
        if (((x.f) kVar.f41770b) == null) {
            kVar.f41770b = new x.f(0);
        }
        ((x.f) kVar.f41770b).addAll(set);
        Context context = this.f43740a;
        kVar.f41772d = context.getClass().getName();
        kVar.f41771c = context.getPackageName();
        return kVar;
    }

    public final void b(int i10, g9.i iVar) {
        boolean z10 = true;
        if (!iVar.f11666m && !((Boolean) BasePendingResult.f11658n.get()).booleanValue()) {
            z10 = false;
        }
        iVar.f11666m = z10;
        com.google.android.gms.common.api.internal.e eVar = this.f43750k;
        eVar.getClass();
        z zVar = new z(new com.google.android.gms.common.api.internal.d0(i10, iVar), eVar.f11701i.get(), this);
        u6 u6Var = eVar.f11705n;
        u6Var.sendMessage(u6Var.obtainMessage(4, zVar));
    }

    public final Task c(int i10, com.google.android.gms.common.api.internal.m mVar) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        com.google.android.gms.common.api.internal.e eVar = this.f43750k;
        eVar.getClass();
        eVar.b(taskCompletionSource, mVar.f11731c, this);
        z zVar = new z(new f0(i10, mVar, taskCompletionSource, this.f43749j), eVar.f11701i.get(), this);
        u6 u6Var = eVar.f11705n;
        u6Var.sendMessage(u6Var.obtainMessage(4, zVar));
        return taskCompletionSource.getTask();
    }
}
