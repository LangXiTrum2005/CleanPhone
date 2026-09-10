package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.os.Bundle;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.e4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3315e4 implements InterfaceC3227d4 {
    public static volatile C3315e4 b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AppMeasurementSdk f4306a;

    public C3315e4(AppMeasurementSdk appMeasurementSdk) {
        Preconditions.checkNotNull(appMeasurementSdk);
        this.f4306a = appMeasurementSdk;
        new ConcurrentHashMap();
    }

    public final void a(String str, String str2, Bundle bundle) {
        if ((!gp0.b.contains(str)) && gp0.b(bundle, str2) && gp0.a(str, str2, bundle)) {
            if ("clx".equals(str) && "_ae".equals(str2)) {
                bundle.putLong("_r", 1L);
            }
            this.f4306a.logEvent(str, str2, bundle);
        }
    }
}
