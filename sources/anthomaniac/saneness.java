package anthomaniac;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzfb;
import com.google.android.gms.measurement.AppMeasurement;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import iiion.beachfront;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-api@@23.0.0 */
/* JADX INFO: loaded from: classes3.dex */
public class saneness implements anthomaniac.attabal {

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public static volatile anthomaniac.attabal f14227dern;

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final AppMeasurementSdk f14228attabal;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final Map f14229saneness;

    /* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-api@@23.0.0 */
    public class attabal implements anthomaniac.attabal.InterfaceC0114attabal {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final /* synthetic */ String f14230attabal;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public final /* synthetic */ saneness f14231saneness;

        public attabal(saneness sanenessVar, String str) {
            this.f14230attabal = str;
            Objects.requireNonNull(sanenessVar);
            this.f14231saneness = sanenessVar;
        }
    }

    public saneness(AppMeasurementSdk appMeasurementSdk) {
        Preconditions.checkNotNull(appMeasurementSdk);
        this.f14228attabal = appMeasurementSdk;
        this.f14229saneness = new ConcurrentHashMap();
    }

    public static /* synthetic */ void beachfront(silty.attabal attabalVar) {
        boolean z = ((iiion.saneness) attabalVar.attabal()).f28437attabal;
        synchronized (saneness.class) {
            ((saneness) Preconditions.checkNotNull(f14227dern)).f14228attabal.zza(z);
        }
    }

    public static anthomaniac.attabal marial(beachfront beachfrontVar, Context context, silty.wireman wiremanVar) {
        Preconditions.checkNotNull(beachfrontVar);
        Preconditions.checkNotNull(context);
        Preconditions.checkNotNull(wiremanVar);
        Preconditions.checkNotNull(context.getApplicationContext());
        if (f14227dern == null) {
            synchronized (saneness.class) {
                try {
                    if (f14227dern == null) {
                        Bundle bundle = new Bundle(1);
                        if (beachfrontVar.dovishness()) {
                            wiremanVar.saneness(iiion.saneness.class, new Executor() { // from class: anthomaniac.wireman
                                @Override // java.util.concurrent.Executor
                                public final /* synthetic */ void execute(Runnable runnable) {
                                    runnable.run();
                                }
                            }, new silty.saneness() { // from class: anthomaniac.dern
                                @Override // silty.saneness
                                public final /* synthetic */ void attabal(silty.attabal attabalVar) {
                                    saneness.beachfront(attabalVar);
                                }
                            });
                            bundle.putBoolean("dataCollectionDefaultEnabled", beachfrontVar.adultoid());
                        }
                        f14227dern = new saneness(zzfb.zza(context, bundle).zzb());
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f14227dern;
    }

    @Override // anthomaniac.attabal
    public void attabal(String str, String str2, Bundle bundle) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        if (decantation.saneness.attabal(str) && decantation.saneness.saneness(str2, bundle) && decantation.saneness.marial(str, str2, bundle)) {
            if ("clx".equals(str) && "_ae".equals(str2)) {
                bundle.putLong("_r", 1L);
            }
            this.f14228attabal.logEvent(str, str2, bundle);
        }
    }

    public final boolean competently(String str) {
        if (str.isEmpty()) {
            return false;
        }
        Map map = this.f14229saneness;
        return map.containsKey(str) && map.get(str) != null;
    }

    @Override // anthomaniac.attabal
    public Map<String, Object> dern(boolean z) {
        return this.f14228attabal.getUserProperties(null, null, z);
    }

    @Override // anthomaniac.attabal
    public void saneness(String str, String str2, Object obj) {
        if (decantation.saneness.attabal(str) && decantation.saneness.wireman(str, str2)) {
            this.f14228attabal.setUserProperty(str, str2, obj);
        }
    }

    @Override // anthomaniac.attabal
    public anthomaniac.attabal.InterfaceC0114attabal wireman(String str, anthomaniac.attabal.saneness sanenessVar) {
        Object beachfrontVar;
        Preconditions.checkNotNull(sanenessVar);
        if (decantation.saneness.attabal(str) && !competently(str)) {
            AppMeasurementSdk appMeasurementSdk = this.f14228attabal;
            if (AppMeasurement.FIAM_ORIGIN.equals(str)) {
                beachfrontVar = new decantation.wireman(appMeasurementSdk, sanenessVar);
            } else {
                beachfrontVar = "clx".equals(str) ? new decantation.beachfront(appMeasurementSdk, sanenessVar) : null;
            }
            if (beachfrontVar != null) {
                this.f14229saneness.put(str, beachfrontVar);
                return new attabal(this, str);
            }
        }
        return null;
    }
}
