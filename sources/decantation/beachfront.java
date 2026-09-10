package decantation;

import com.google.android.gms.measurement.api.AppMeasurementSdk;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-api@@23.0.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class beachfront {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final anthomaniac.attabal.saneness f25044attabal;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final marial f25045dern;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final AppMeasurementSdk f25046saneness;

    public beachfront(AppMeasurementSdk appMeasurementSdk, anthomaniac.attabal.saneness sanenessVar) {
        this.f25044attabal = sanenessVar;
        this.f25046saneness = appMeasurementSdk;
        marial marialVar = new marial(this);
        this.f25045dern = marialVar;
        appMeasurementSdk.registerOnMeasurementEventListener(marialVar);
    }

    public final /* synthetic */ anthomaniac.attabal.saneness attabal() {
        return this.f25044attabal;
    }
}
