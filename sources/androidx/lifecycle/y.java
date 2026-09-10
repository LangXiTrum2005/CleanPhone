package androidx.lifecycle;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public abstract class y extends Service implements v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v9.e f4619a = new v9.e(this);

    @Override // androidx.lifecycle.v
    public final o getLifecycle() {
        return (x) this.f4619a.f52503b;
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        kotlin.jvm.internal.n.f(intent, "intent");
        this.f4619a.I(m.ON_START);
        return null;
    }

    @Override // android.app.Service
    public void onCreate() {
        this.f4619a.I(m.ON_CREATE);
        super.onCreate();
    }

    @Override // android.app.Service
    public void onDestroy() {
        m mVar = m.ON_STOP;
        v9.e eVar = this.f4619a;
        eVar.I(mVar);
        eVar.I(m.ON_DESTROY);
        super.onDestroy();
    }

    @Override // android.app.Service
    public final void onStart(Intent intent, int i10) {
        this.f4619a.I(m.ON_START);
        super.onStart(intent, i10);
    }
}
