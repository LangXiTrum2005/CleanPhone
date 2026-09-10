package androidx.privacysandbox.ads.adservices.measurement;

import android.content.Context;
import android.net.Uri;
import android.util.Log;
import android.view.InputEvent;
import androidx.privacysandbox.ads.adservices.internal.AdServicesInfo;
import androidx.privacysandbox.ads.adservices.internal.BackCompatManager;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b&\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Landroidx/privacysandbox/ads/adservices/measurement/MeasurementManager;", "", "Companion", "ads-adservices_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class MeasurementManager {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\u0006"}, d2 = {"Landroidx/privacysandbox/ads/adservices/measurement/MeasurementManager$Companion;", "", "", "MEASUREMENT_API_STATE_DISABLED", "I", "MEASUREMENT_API_STATE_ENABLED", "ads-adservices_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public static MeasurementManager a(final Context context) {
            Intrinsics.f(context, "context");
            Log.d("MeasurementManager", "AdServicesInfo.version=" + AdServicesInfo.a());
            if (AdServicesInfo.a() >= 5) {
                Object systemService = context.getSystemService((Class<Object>) androidx.privacysandbox.ads.adservices.customaudience.a.p());
                Intrinsics.e(systemService, "context.getSystemService…ementManager::class.java)");
                return new MeasurementManagerApi33Ext5Impl(androidx.privacysandbox.ads.adservices.customaudience.a.h(systemService));
            }
            if (AdServicesInfo.b() >= 9) {
                return (MeasurementManager) BackCompatManager.a(context, "MeasurementManager", new Function1<Context, MeasurementManagerApi31Ext9Impl>() { // from class: androidx.privacysandbox.ads.adservices.measurement.MeasurementManager$Companion$obtain$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        Context it = (Context) obj;
                        Intrinsics.f(it, "it");
                        Context context2 = context;
                        Intrinsics.f(context2, "context");
                        android.adservices.measurement.MeasurementManager measurementManager = android.adservices.measurement.MeasurementManager.get(context2);
                        Intrinsics.e(measurementManager, "get(context)");
                        return new MeasurementManagerApi31Ext9Impl(measurementManager);
                    }
                });
            }
            return null;
        }
    }

    public abstract Object a(DeletionRequest deletionRequest, Continuation continuation);

    public abstract Object b(Continuation continuation);

    public abstract Object c(Uri uri, InputEvent inputEvent, Continuation continuation);

    public abstract Object d(SourceRegistrationRequest sourceRegistrationRequest, Continuation continuation);

    public abstract Object e(Uri uri, Continuation continuation);

    public abstract Object f(WebSourceRegistrationRequest webSourceRegistrationRequest, Continuation continuation);

    public abstract Object g(WebTriggerRegistrationRequest webTriggerRegistrationRequest, Continuation continuation);
}
