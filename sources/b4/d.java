package b4;

import al.f;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.util.Log;
import android.view.InputEvent;
import cc.a2;
import cn.d0;
import cn.n0;
import com.google.common.util.concurrent.ListenableFuture;
import kotlin.jvm.internal.n;
import t9.e;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f5490a;

    public d(e eVar) {
        this.f5490a = eVar;
    }

    public static final d b(Context context) {
        e bVar;
        Object objInvoke;
        n.f(context, "context");
        StringBuilder sb2 = new StringBuilder("AdServicesInfo.version=");
        int i10 = Build.VERSION.SDK_INT;
        z3.b bVar2 = z3.b.f54634a;
        sb2.append(i10 >= 33 ? bVar2.a() : 0);
        Log.d("MeasurementManager", sb2.toString());
        if ((i10 >= 33 ? bVar2.a() : 0) >= 5) {
            bVar = new d4.b(context, 1);
        } else {
            z3.a aVar = z3.a.f54633a;
            if (((i10 == 31 || i10 == 32) ? aVar.a() : 0) >= 9) {
                try {
                    objInvoke = new f(context, 5).invoke(context);
                } catch (NoClassDefFoundError unused) {
                    StringBuilder sb3 = new StringBuilder("Unable to find adservices code, check manifest for uses-library tag, versionS=");
                    int i11 = Build.VERSION.SDK_INT;
                    sb3.append((i11 == 31 || i11 == 32) ? aVar.a() : 0);
                    Log.d("MeasurementManager", sb3.toString());
                    objInvoke = null;
                }
                bVar = (e) objInvoke;
            } else {
                bVar = null;
            }
        }
        if (bVar != null) {
            return new d(bVar);
        }
        return null;
    }

    public ListenableFuture a(d4.a deletionRequest) {
        n.f(deletionRequest, "deletionRequest");
        throw null;
    }

    public ListenableFuture c() {
        return a2.a(d0.g(d0.b(n0.f6748a), new a(this, null, 0), 3));
    }

    public ListenableFuture d(Uri attributionSource, InputEvent inputEvent) {
        n.f(attributionSource, "attributionSource");
        return a2.a(d0.g(d0.b(n0.f6748a), new b(this, attributionSource, inputEvent, null, 0), 3));
    }

    public ListenableFuture e(d4.d request) {
        n.f(request, "request");
        throw null;
    }

    public ListenableFuture f(Uri trigger) {
        n.f(trigger, "trigger");
        return a2.a(d0.g(d0.b(n0.f6748a), new c(this, trigger, (ak.f) null, 0), 3));
    }

    public ListenableFuture g(d4.e request) {
        n.f(request, "request");
        throw null;
    }

    public ListenableFuture h(d4.f request) {
        n.f(request, "request");
        throw null;
    }
}
