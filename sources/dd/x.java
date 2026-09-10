package dd;

import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.perf.config.RemoteConfigManager;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class x implements OnSuccessListener, OnFailureListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ RemoteConfigManager f38834a;

    public /* synthetic */ x(RemoteConfigManager remoteConfigManager) {
        this.f38834a = remoteConfigManager;
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public void onFailure(Exception exc) {
        this.f38834a.lambda$triggerFirebaseRemoteConfigFetchAndActivateOnSuccessfulFetch$1(exc);
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public void onSuccess(Object obj) {
        this.f38834a.lambda$triggerFirebaseRemoteConfigFetchAndActivateOnSuccessfulFetch$0((Boolean) obj);
    }
}
