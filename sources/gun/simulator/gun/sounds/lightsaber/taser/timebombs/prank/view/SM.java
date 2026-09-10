package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.adservices.measurement.DeletionRequest;
import android.adservices.measurement.WebSourceParams;
import android.adservices.measurement.WebSourceRegistrationRequest;
import android.adservices.measurement.WebTriggerRegistrationRequest;
import android.adservices.topics.GetTopicsRequest;
import android.adservices.topics.GetTopicsResponse;
import android.adservices.topics.Topic;
import android.adservices.topics.TopicsManager;
import android.net.Uri;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class SM {
    public static /* synthetic */ void B() {
    }

    public static /* synthetic */ void C() {
    }

    public static /* synthetic */ void D() {
    }

    public static /* synthetic */ DeletionRequest.Builder b() {
        return new DeletionRequest.Builder();
    }

    public static /* synthetic */ WebSourceParams.Builder f(Uri uri) {
        return new WebSourceParams.Builder(uri);
    }

    public static /* synthetic */ WebSourceRegistrationRequest.Builder h(List list, Uri uri) {
        return new WebSourceRegistrationRequest.Builder(list, uri);
    }

    public static /* synthetic */ WebTriggerRegistrationRequest.Builder i(List list, Uri uri) {
        return new WebTriggerRegistrationRequest.Builder(list, uri);
    }

    public static /* synthetic */ GetTopicsRequest.Builder j() {
        return new GetTopicsRequest.Builder();
    }

    public static /* bridge */ /* synthetic */ GetTopicsResponse n(Object obj) {
        return (GetTopicsResponse) obj;
    }

    public static /* bridge */ /* synthetic */ Topic o(Object obj) {
        return (Topic) obj;
    }

    public static /* bridge */ /* synthetic */ TopicsManager p(Object obj) {
        return (TopicsManager) obj;
    }

    public static /* bridge */ /* synthetic */ Class q() {
        return TopicsManager.class;
    }

    public static /* synthetic */ void s() {
    }
}
