package decantation;

import android.os.Bundle;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.android.gms.measurement.internal.zzjm;
import com.google.common.collect.ImmutableSet;
import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-api@@23.0.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class dern implements AppMeasurementSdk.OnEventListener {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final /* synthetic */ wireman f25047attabal;

    public dern(wireman wiremanVar) {
        Objects.requireNonNull(wiremanVar);
        this.f25047attabal = wiremanVar;
    }

    @Override // com.google.android.gms.measurement.api.AppMeasurementSdk.OnEventListener, com.google.android.gms.measurement.internal.zzjq
    public final void onEvent(String str, String str2, Bundle bundle, long j) {
        wireman wiremanVar = this.f25047attabal;
        if (wiremanVar.f25055attabal.contains(str2)) {
            Bundle bundle2 = new Bundle();
            ImmutableSet immutableSet = saneness.f25049attabal;
            String strZza = zzjm.zza(str2);
            if (strZza != null) {
                str2 = strZza;
            }
            bundle2.putString("events", str2);
            wiremanVar.attabal().attabal(2, bundle2);
        }
    }
}
