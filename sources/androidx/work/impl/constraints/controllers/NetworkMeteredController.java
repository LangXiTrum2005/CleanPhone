package androidx.work.impl.constraints.controllers;

import android.os.Build;
import androidx.work.Logger;
import androidx.work.NetworkType;
import androidx.work.impl.constraints.NetworkState;
import androidx.work.impl.model.WorkSpec;

/* JADX INFO: loaded from: classes.dex */
public class NetworkMeteredController extends ConstraintController<NetworkState> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f8730e = Logger.e("NetworkMeteredCtrlr");

    @Override // androidx.work.impl.constraints.controllers.ConstraintController
    public final boolean b(WorkSpec workSpec) {
        return workSpec.j.f8606a == NetworkType.f0;
    }

    @Override // androidx.work.impl.constraints.controllers.ConstraintController
    public final boolean c(Object obj) {
        NetworkState networkState = (NetworkState) obj;
        if (Build.VERSION.SDK_INT >= 26) {
            return (networkState.f8721a && networkState.f8723c) ? false : true;
        }
        Logger.c().a(f8730e, "Metered network constraint is not supported before API 26, only checking for connected state.", new Throwable[0]);
        return !networkState.f8721a;
    }
}
