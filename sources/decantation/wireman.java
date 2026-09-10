package decantation;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-api@@23.0.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class wireman {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final Set f25055attabal;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final AppMeasurementSdk f25056dern;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final anthomaniac.attabal.saneness f25057saneness;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public final dern f25058wireman;

    public wireman(AppMeasurementSdk appMeasurementSdk, anthomaniac.attabal.saneness sanenessVar) {
        this.f25057saneness = sanenessVar;
        this.f25056dern = appMeasurementSdk;
        dern dernVar = new dern(this);
        this.f25058wireman = dernVar;
        appMeasurementSdk.registerOnMeasurementEventListener(dernVar);
        this.f25055attabal = new HashSet();
    }

    public final /* synthetic */ anthomaniac.attabal.saneness attabal() {
        return this.f25057saneness;
    }
}
