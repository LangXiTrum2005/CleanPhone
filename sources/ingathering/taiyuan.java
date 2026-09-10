package ingathering;

import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: compiled from: GetAuthTokenListener.java */
/* JADX INFO: loaded from: classes3.dex */
public class taiyuan implements impassible {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final triweekly f28865attabal;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final TaskCompletionSource<apical> f28866saneness;

    public taiyuan(triweekly triweeklyVar, TaskCompletionSource<apical> taskCompletionSource) {
        this.f28865attabal = triweeklyVar;
        this.f28866saneness = taskCompletionSource;
    }

    @Override // ingathering.impassible
    public boolean attabal(Exception exc) {
        this.f28866saneness.trySetException(exc);
        return true;
    }

    @Override // ingathering.impassible
    public boolean saneness(com.google.firebase.installations.local.saneness sanenessVar) {
        if (!sanenessVar.apical() || this.f28865attabal.beachfront(sanenessVar)) {
            return false;
        }
        this.f28866saneness.setResult(apical.attabal().saneness(sanenessVar.saneness()).wireman(sanenessVar.dern()).dern(sanenessVar.impromptu()).attabal());
        return true;
    }
}
