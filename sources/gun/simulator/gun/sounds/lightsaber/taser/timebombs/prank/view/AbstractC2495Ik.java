package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.adservices.common.AdData;
import android.adservices.customaudience.CustomAudience;
import android.adservices.customaudience.CustomAudienceManager;
import android.adservices.customaudience.JoinCustomAudienceRequest;
import android.adservices.customaudience.LeaveCustomAudienceRequest;
import android.adservices.measurement.MeasurementManager;
import android.adservices.measurement.WebTriggerParams;
import android.net.Uri;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Ik, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC2495Ik {
    public static /* synthetic */ AdData.Builder a() {
        return new AdData.Builder();
    }

    public static /* synthetic */ CustomAudience.Builder b() {
        return new CustomAudience.Builder();
    }

    public static /* bridge */ /* synthetic */ CustomAudienceManager g(Object obj) {
        return (CustomAudienceManager) obj;
    }

    public static /* synthetic */ JoinCustomAudienceRequest.Builder h() {
        return new JoinCustomAudienceRequest.Builder();
    }

    public static /* synthetic */ LeaveCustomAudienceRequest.Builder i() {
        return new LeaveCustomAudienceRequest.Builder();
    }

    public static /* bridge */ /* synthetic */ MeasurementManager l(Object obj) {
        return (MeasurementManager) obj;
    }

    public static /* synthetic */ WebTriggerParams.Builder q(Uri uri) {
        return new WebTriggerParams.Builder(uri);
    }

    public static /* bridge */ /* synthetic */ Class t() {
        return MeasurementManager.class;
    }
}
