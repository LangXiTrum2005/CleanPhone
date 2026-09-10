package xd;

import android.content.Context;
import android.os.Bundle;
import wj.r;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class a implements o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Bundle f53732a;

    public a(Context appContext) {
        kotlin.jvm.internal.n.f(appContext, "appContext");
        Bundle bundle = appContext.getPackageManager().getApplicationInfo(appContext.getPackageName(), 128).metaData;
        this.f53732a = bundle == null ? Bundle.EMPTY : bundle;
    }

    @Override // xd.o
    public final Boolean a() {
        Bundle bundle = this.f53732a;
        if (bundle.containsKey("firebase_sessions_enabled")) {
            return Boolean.valueOf(bundle.getBoolean("firebase_sessions_enabled"));
        }
        return null;
    }

    @Override // xd.o
    public final Object b(ak.f fVar) {
        return r.f53297a;
    }

    @Override // xd.o
    public final bn.a c() {
        Bundle bundle = this.f53732a;
        if (bundle.containsKey("firebase_sessions_sessions_restart_timeout")) {
            return new bn.a(d0.c.O(bundle.getInt("firebase_sessions_sessions_restart_timeout"), bn.c.SECONDS));
        }
        return null;
    }

    @Override // xd.o
    public final Double d() {
        Bundle bundle = this.f53732a;
        if (bundle.containsKey("firebase_sessions_sampling_rate")) {
            return Double.valueOf(bundle.getDouble("firebase_sessions_sampling_rate"));
        }
        return null;
    }
}
