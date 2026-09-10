package k5;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import d5.o;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public abstract class c extends d {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final String f44312h = o.i("BrdcstRcvrCnstrntTrckr");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final q7.c f44313g;

    public c(Context context, p5.a aVar) {
        super(context, aVar);
        this.f44313g = new q7.c(this, 10);
    }

    @Override // k5.d
    public final void d() {
        o.g().e(f44312h, getClass().getSimpleName().concat(": registering receiver"), new Throwable[0]);
        this.f44316b.registerReceiver(this.f44313g, f());
    }

    @Override // k5.d
    public final void e() {
        o.g().e(f44312h, getClass().getSimpleName().concat(": unregistering receiver"), new Throwable[0]);
        this.f44316b.unregisterReceiver(this.f44313g);
    }

    public abstract IntentFilter f();

    public abstract void g(Intent intent);
}
