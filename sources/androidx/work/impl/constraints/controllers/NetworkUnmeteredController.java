package androidx.work.impl.constraints.controllers;

import android.os.Build;
import androidx.work.NetworkType;
import androidx.work.impl.constraints.NetworkState;
import androidx.work.impl.model.WorkSpec;

/* JADX INFO: loaded from: classes.dex */
public class NetworkUnmeteredController extends ConstraintController<NetworkState> {
    @Override // androidx.work.impl.constraints.controllers.ConstraintController
    public final boolean b(WorkSpec workSpec) {
        NetworkType networkType = workSpec.j.f8606a;
        if (networkType != NetworkType.Z) {
            return Build.VERSION.SDK_INT >= 30 && networkType == NetworkType.g0;
        }
        return true;
    }

    @Override // androidx.work.impl.constraints.controllers.ConstraintController
    public final boolean c(Object obj) {
        NetworkState networkState = (NetworkState) obj;
        return !networkState.f8721a || networkState.f8723c;
    }
}
