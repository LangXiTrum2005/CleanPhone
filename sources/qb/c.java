package qb;

import android.os.Bundle;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.concurrent.ConcurrentHashMap;
import k9.c0;
import m0.s1;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class c implements b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static volatile c f48929c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AppMeasurementSdk f48930a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ConcurrentHashMap f48931b;

    public c(AppMeasurementSdk appMeasurementSdk) {
        c0.h(appMeasurementSdk);
        this.f48930a = appMeasurementSdk;
        this.f48931b = new ConcurrentHashMap();
    }

    public final void a(String str, String str2, Bundle bundle) {
        if (rb.a.a(str) && rb.a.b(bundle, str2) && rb.a.d(str, bundle, str2)) {
            if ("clx".equals(str) && "_ae".equals(str2)) {
                bundle.putLong("_r", 1L);
            }
            this.f48930a.logEvent(str, str2, bundle);
        }
    }

    public final ne.c b(String str, v6.c cVar) {
        vj.a cVar2;
        if (rb.a.a(str)) {
            boolean zIsEmpty = str.isEmpty();
            ConcurrentHashMap concurrentHashMap = this.f48931b;
            if (zIsEmpty || !concurrentHashMap.containsKey(str) || concurrentHashMap.get(str) == null) {
                boolean zEquals = "fiam".equals(str);
                AppMeasurementSdk appMeasurementSdk = this.f48930a;
                if (zEquals) {
                    cVar2 = new s1(appMeasurementSdk, cVar);
                } else {
                    cVar2 = "clx".equals(str) ? new rb.c(appMeasurementSdk, cVar) : null;
                }
                if (cVar2 != null) {
                    concurrentHashMap.put(str, cVar2);
                    return new ne.c(8);
                }
            }
        }
        return null;
    }
}
