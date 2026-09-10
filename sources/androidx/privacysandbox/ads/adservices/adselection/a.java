package androidx.privacysandbox.ads.adservices.adselection;

import android.adservices.customaudience.FetchAndJoinCustomAudienceRequest;
import android.adservices.signals.UpdateSignalsRequest;
import android.adservices.topics.EncryptedTopic;
import android.net.Uri;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class a {
    public static /* synthetic */ void B() {
    }

    public static /* synthetic */ void C() {
    }

    public static /* synthetic */ void D() {
    }

    public static /* bridge */ /* synthetic */ android.adservices.adselection.GetAdSelectionDataOutcome b(Object obj) {
        return (android.adservices.adselection.GetAdSelectionDataOutcome) obj;
    }

    public static /* synthetic */ android.adservices.adselection.PersistAdSelectionResultRequest.Builder c() {
        return new android.adservices.adselection.PersistAdSelectionResultRequest.Builder();
    }

    public static /* synthetic */ android.adservices.adselection.ReportEventRequest.Builder f() {
        return new android.adservices.adselection.ReportEventRequest.Builder(0L, (String) null, (String) null, 0);
    }

    public static /* synthetic */ android.adservices.adselection.ReportImpressionRequest i() {
        return new android.adservices.adselection.ReportImpressionRequest(0L);
    }

    public static /* synthetic */ FetchAndJoinCustomAudienceRequest.Builder j() {
        return new FetchAndJoinCustomAudienceRequest.Builder((Uri) null);
    }

    public static /* synthetic */ UpdateSignalsRequest.Builder m() {
        return new UpdateSignalsRequest.Builder((Uri) null);
    }

    public static /* bridge */ /* synthetic */ EncryptedTopic n(Object obj) {
        return (EncryptedTopic) obj;
    }

    public static /* synthetic */ void q() {
        new android.adservices.adselection.AdSelectionFromOutcomesConfig.Builder();
    }

    public static /* synthetic */ void y() {
        new android.adservices.adselection.GetAdSelectionDataRequest.Builder();
    }
}
