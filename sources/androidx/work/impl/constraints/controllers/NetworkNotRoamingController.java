package androidx.work.impl.constraints.controllers;

import androidx.work.Logger;
import androidx.work.NetworkType;
import androidx.work.impl.constraints.NetworkState;
import androidx.work.impl.model.WorkSpec;

/* JADX INFO: loaded from: classes.dex */
public class NetworkNotRoamingController extends ConstraintController<NetworkState> {
    static {
        Logger.e("NetworkNotRoamingCtrlr");
    }

    @Override // androidx.work.impl.constraints.controllers.ConstraintController
    public final boolean b(WorkSpec workSpec) {
        return workSpec.j.f8606a == NetworkType.e0;
    }

    @Override // androidx.work.impl.constraints.controllers.ConstraintController
    public final boolean c(Object obj) {
        NetworkState networkState = (NetworkState) obj;
        return (networkState.f8721a && networkState.d) ? false : true;
    }
}
