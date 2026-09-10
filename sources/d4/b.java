package d4;

import android.adservices.measurement.MeasurementManager;
import android.content.Context;
import kotlin.jvm.internal.n;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class b extends c {
    /* JADX WARN: Illegal instructions before constructor call */
    public b(Context context, int i10) {
        switch (i10) {
            case 1:
                n.f(context, "context");
                Object systemService = context.getSystemService((Class<Object>) com.unity3d.ads.adplayer.b.g());
                n.e(systemService, "context.getSystemService…ementManager::class.java)");
                super(com.unity3d.ads.adplayer.b.c(systemService));
                break;
            default:
                n.f(context, "context");
                MeasurementManager measurementManager = MeasurementManager.get(context);
                n.e(measurementManager, "get(context)");
                super(measurementManager);
                break;
        }
    }
}
