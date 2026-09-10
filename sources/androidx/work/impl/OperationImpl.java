package androidx.work.impl;

import androidx.lifecycle.MutableLiveData;
import androidx.work.Operation;
import androidx.work.impl.utils.futures.SettableFuture;

/* JADX INFO: loaded from: classes.dex */
public class OperationImpl implements Operation {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final MutableLiveData f8661c = new MutableLiveData();
    public final SettableFuture d = new SettableFuture();

    public OperationImpl() {
        a(Operation.f8634b);
    }

    public final void a(Operation.State state) {
        this.f8661c.k(state);
        boolean z2 = state instanceof Operation.State.SUCCESS;
        SettableFuture settableFuture = this.d;
        if (z2) {
            settableFuture.i((Operation.State.SUCCESS) state);
        } else if (state instanceof Operation.State.FAILURE) {
            settableFuture.j(((Operation.State.FAILURE) state).f8635a);
        }
    }
}
