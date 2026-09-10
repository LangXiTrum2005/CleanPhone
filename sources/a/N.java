package A;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiClient;
import com.inmobi.media.X6;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class N implements GoogleApiClient.OnConnectionFailedListener {
    @Override // com.google.android.gms.common.api.internal.OnConnectionFailedListener
    public final void onConnectionFailed(ConnectionResult connectionResult) {
        X6.a(connectionResult);
    }
}
