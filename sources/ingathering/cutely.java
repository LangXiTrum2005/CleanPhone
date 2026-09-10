package ingathering;

import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: compiled from: GetIdListener.java */
/* JADX INFO: loaded from: classes3.dex */
public class cutely implements impassible {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final TaskCompletionSource<String> f28857attabal;

    public cutely(TaskCompletionSource<String> taskCompletionSource) {
        this.f28857attabal = taskCompletionSource;
    }

    @Override // ingathering.impassible
    public boolean attabal(Exception exc) {
        return false;
    }

    @Override // ingathering.impassible
    public boolean saneness(com.google.firebase.installations.local.saneness sanenessVar) {
        if (!sanenessVar.formularize() && !sanenessVar.apical() && !sanenessVar.taiyuan()) {
            return false;
        }
        this.f28857attabal.trySetResult(sanenessVar.wireman());
        return true;
    }
}
