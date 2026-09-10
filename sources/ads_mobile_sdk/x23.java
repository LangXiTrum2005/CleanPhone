package ads_mobile_sdk;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.BaseGmsClient;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlinx.coroutines.cutely;
import kotlinx.coroutines.gintrap;
import kotlinx.coroutines.preprohormone;
import kotlinx.coroutines.saran;
import p002kotlin.jvm.internal.Intrinsics;
import saneness.loun;
import saneness.lunation;
import saneness.satisfying;
import saneness.spartacist;

/* JADX INFO: loaded from: classes.dex */
public final class x23 extends satisfying implements BaseGmsClient.BaseConnectionCallbacks, BaseGmsClient.BaseOnConnectionFailedListener {

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public static final /* synthetic */ int f3294dern = 0;
    public final saran a;
    public final Context b;
    public final loun c;
    public final lunation d;
    public final AtomicBoolean e;
    public final AtomicBoolean f;
    public final AtomicBoolean g;
    public final gintrap h;

    public x23(saran backgroundScope, Context context, loun traceLogger) {
        Intrinsics.checkNotNullParameter(backgroundScope, "backgroundScope");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(traceLogger, "traceLogger");
        this.a = backgroundScope;
        this.b = context;
        this.c = traceLogger;
        this.d = new lunation(this, context, Looper.getMainLooper());
        this.e = new AtomicBoolean(false);
        this.f = new AtomicBoolean(false);
        this.g = new AtomicBoolean(false);
        this.h = preprohormone.dern(null, 1, null);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(wretchedly.dern dernVar) {
        t23 t23Var;
        x23 x23Var;
        if (dernVar instanceof t23) {
            t23Var = (t23) dernVar;
            int i = t23Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                t23Var.d = i - Integer.MIN_VALUE;
            } else {
                t23Var = new t23(this, dernVar);
            }
        } else {
            t23Var = new t23(this, dernVar);
        }
        Object objDent = t23Var.b;
        Object objBeachfront = p002kotlin.coroutines.intrinsics.attabal.beachfront();
        int i2 = t23Var.d;
        if (i2 == 0) {
            p002kotlin.dern.saneness(objDent);
            if (this.e.getAndSet(true)) {
                gintrap gintrapVar = this.h;
                t23Var.d = 1;
                Object objDent2 = gintrapVar.dent(t23Var);
                if (objDent2 != objBeachfront) {
                    return objDent2;
                }
            } else {
                this.d.checkAvailabilityAndConnect();
                gintrap gintrapVar2 = this.h;
                t23Var.a = this;
                t23Var.d = 2;
                objDent = gintrapVar2.dent(t23Var);
                if (objDent != objBeachfront) {
                    x23Var = this;
                }
            }
            return objBeachfront;
        }
        if (i2 == 1) {
            p002kotlin.dern.saneness(objDent);
            return objDent;
        }
        if (i2 != 2) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        x23Var = t23Var.a;
        p002kotlin.dern.saneness(objDent);
        spartacist spartacistVar = (spartacist) objDent;
        cutely.wireman(x23Var.a, null, null, new u23(x23Var, null), 3, null);
        return spartacistVar;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnected(Bundle bundle) {
        if (this.g.getAndSet(true)) {
            return;
        }
        cutely.wireman(this.a, null, null, new w23(this, null), 3, null);
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseOnConnectionFailedListener
    public final void onConnectionFailed(ConnectionResult result) {
        Intrinsics.checkNotNullParameter(result, "result");
        rn0 rn0Var = new rn0("Failed to connect to GMSCore. Code: " + result.getErrorCode() + ", message: " + result.getErrorMessage());
        if (this.f.getAndSet(true)) {
            return;
        }
        this.h.saran(rn0Var);
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnectionSuspended(int i) {
        rn0 rn0Var = new rn0("GMSCore connection suspended. Code: " + i);
        if (this.f.getAndSet(true)) {
            return;
        }
        this.h.saran(rn0Var);
    }

    public final void a(if0 exceptionParcel) {
        Intrinsics.checkNotNullParameter(exceptionParcel, "exceptionParcel");
        rn0 rn0Var = new rn0(exceptionParcel.b() + ". Error code: " + exceptionParcel.a());
        if (this.f.getAndSet(true)) {
            return;
        }
        this.h.saran(rn0Var);
    }
}
