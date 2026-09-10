package decantation;

import android.os.Bundle;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-api@@23.0.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class marial implements AppMeasurementSdk.OnEventListener {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final /* synthetic */ beachfront f25048attabal;

    public marial(beachfront beachfrontVar) {
        Objects.requireNonNull(beachfrontVar);
        this.f25048attabal = beachfrontVar;
    }

    @Override // com.google.android.gms.measurement.api.AppMeasurementSdk.OnEventListener, com.google.android.gms.measurement.internal.zzjq
    public final void onEvent(String str, String str2, Bundle bundle, long j) {
        if (str == null || !saneness.dern(str2)) {
            return;
        }
        Bundle bundle2 = new Bundle();
        bundle2.putString("name", str2);
        bundle2.putLong("timestampInMillis", j);
        bundle2.putBundle("params", bundle);
        this.f25048attabal.attabal().attabal(3, bundle2);
    }
}
