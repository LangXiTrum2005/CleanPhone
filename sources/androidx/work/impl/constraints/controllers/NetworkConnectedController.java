package androidx.work.impl.constraints.controllers;

import android.os.Build;
import androidx.work.NetworkType;
import androidx.work.impl.constraints.NetworkState;
import androidx.work.impl.model.WorkSpec;

/* JADX INFO: loaded from: classes.dex */
public class NetworkConnectedController extends ConstraintController<NetworkState> {
    @Override // androidx.work.impl.constraints.controllers.ConstraintController
    public final boolean b(WorkSpec workSpec) {
        return workSpec.j.f8606a == NetworkType.f8632Y;
    }

    @Override // androidx.work.impl.constraints.controllers.ConstraintController
    public final boolean c(Object obj) {
        NetworkState networkState = (NetworkState) obj;
        if (Build.VERSION.SDK_INT >= 26) {
            return (networkState.f8721a && networkState.f8722b) ? false : true;
        }
        return !networkState.f8721a;
    }
}
