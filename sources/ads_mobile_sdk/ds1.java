package ads_mobile_sdk;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.os.SystemClock;
import com.google.common.base.triweekly;
import kotlinx.coroutines.cutely;
import kotlinx.coroutines.saran;
import p002kotlin.coroutines.EmptyCoroutineContext;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.time.DurationUnit;

/* JADX INFO: loaded from: classes.dex */
public final class ds1 extends ConnectivityManager.NetworkCallback {
    public final /* synthetic */ js1 a;

    public ds1(js1 js1Var) {
        this.a = js1Var;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onAvailable(Network network) {
        Intrinsics.checkNotNullParameter(network, "network");
        p002kotlin.time.saneness.Companion companion = p002kotlin.time.saneness.INSTANCE;
        this.a.c.getClass();
        long jGraveside = p002kotlin.time.dern.graveside(SystemClock.elapsedRealtime(), DurationUnit.MILLISECONDS);
        triweekly triweeklyVar = kn0.a;
        kn0.a(new xr1(jGraveside, network));
        js1 js1Var = this.a;
        saran saranVar = js1Var.b;
        yr1 block = new yr1(js1Var, jGraveside, network, null);
        EmptyCoroutineContext context = EmptyCoroutineContext.INSTANCE;
        Intrinsics.checkNotNullParameter(saranVar, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(block, "block");
        cutely.wireman(saranVar, context, null, new x13(block, null), 2, null);
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
        Intrinsics.checkNotNullParameter(network, "network");
        Intrinsics.checkNotNullParameter(networkCapabilities, "networkCapabilities");
        p002kotlin.time.saneness.Companion companion = p002kotlin.time.saneness.INSTANCE;
        this.a.c.getClass();
        long jGraveside = p002kotlin.time.dern.graveside(SystemClock.elapsedRealtime(), DurationUnit.MILLISECONDS);
        triweekly triweeklyVar = kn0.a;
        kn0.a(new zr1(jGraveside, network, networkCapabilities));
        js1 js1Var = this.a;
        saran saranVar = js1Var.b;
        as1 block = new as1(js1Var, jGraveside, network, networkCapabilities, null);
        EmptyCoroutineContext context = EmptyCoroutineContext.INSTANCE;
        Intrinsics.checkNotNullParameter(saranVar, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(block, "block");
        cutely.wireman(saranVar, context, null, new x13(block, null), 2, null);
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        Intrinsics.checkNotNullParameter(network, "network");
        p002kotlin.time.saneness.Companion companion = p002kotlin.time.saneness.INSTANCE;
        this.a.c.getClass();
        long jGraveside = p002kotlin.time.dern.graveside(SystemClock.elapsedRealtime(), DurationUnit.MILLISECONDS);
        triweekly triweeklyVar = kn0.a;
        kn0.a(new bs1(jGraveside, network));
        js1 js1Var = this.a;
        saran saranVar = js1Var.b;
        cs1 block = new cs1(js1Var, jGraveside, null);
        EmptyCoroutineContext context = EmptyCoroutineContext.INSTANCE;
        Intrinsics.checkNotNullParameter(saranVar, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(block, "block");
        cutely.wireman(saranVar, context, null, new x13(block, null), 2, null);
    }
}
