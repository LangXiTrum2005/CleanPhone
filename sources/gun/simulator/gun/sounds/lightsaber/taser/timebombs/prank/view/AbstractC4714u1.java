package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.adservices.adid.AdId;
import android.adservices.adid.AdIdManager;
import android.adservices.adselection.AdSelectionConfig;
import android.adservices.adselection.AdSelectionManager;
import android.adservices.adselection.AdSelectionOutcome;
import android.adservices.adselection.ReportImpressionRequest;
import android.adservices.measurement.MeasurementManager;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.u1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC4714u1 {
    public static /* bridge */ /* synthetic */ Class D() {
        return AdSelectionManager.class;
    }

    public static /* bridge */ /* synthetic */ AdId b(Object obj) {
        return (AdId) obj;
    }

    public static /* bridge */ /* synthetic */ AdIdManager c(Object obj) {
        return (AdIdManager) obj;
    }

    public static /* synthetic */ AdSelectionConfig.Builder d() {
        return new AdSelectionConfig.Builder();
    }

    public static /* bridge */ /* synthetic */ AdSelectionManager k(Object obj) {
        return (AdSelectionManager) obj;
    }

    public static /* bridge */ /* synthetic */ AdSelectionOutcome l(Object obj) {
        return (AdSelectionOutcome) obj;
    }

    public static /* synthetic */ ReportImpressionRequest m(long j, AdSelectionConfig adSelectionConfig) {
        return new ReportImpressionRequest(j, adSelectionConfig);
    }

    public static /* bridge */ /* synthetic */ MeasurementManager p(Object obj) {
        return (MeasurementManager) obj;
    }

    public static /* bridge */ /* synthetic */ Class r() {
        return AdIdManager.class;
    }

    public static /* synthetic */ void t() {
    }
}
