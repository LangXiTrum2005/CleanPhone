package eddy;

import android.os.Bundle;
import com.google.android.libraries.ads.mobile.sdk.common.RequestConfiguration;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import p002kotlin.Metadata;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u00192\u00020\u0001:\u0002\u0003\bR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0003\u0010\u0005R\u0017\u0010\f\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\r\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\n\u0010\t\u001a\u0004\b\b\u0010\u000bR\u0017\u0010\u0012\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000f\u0010\u0011R\u0017\u0010\u0018\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u001a"}, d2 = {"Leddy/attabal;", "", "", "attabal", "Ljava/lang/String;", "()Ljava/lang/String;", "applicationId", "", "saneness", "Z", "dern", "()Z", "nativeAdDebuggerDisabled", "mediationAdapterInitializationDisabled", "Lcom/google/android/libraries/ads/mobile/sdk/common/RequestConfiguration;", "wireman", "Lcom/google/android/libraries/ads/mobile/sdk/common/RequestConfiguration;", "()Lcom/google/android/libraries/ads/mobile/sdk/common/RequestConfiguration;", "requestConfiguration", "Landroid/os/Bundle;", "marial", "Landroid/os/Bundle;", "getExtras", "()Landroid/os/Bundle;", HandleInvocationsFromAdViewer.KEY_EXTRAS, "beachfront", "ads-mobile-sdk_release"}, k = 1, mv = {1, 9, 0})
public final class attabal {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name and from kotlin metadata */
    public final String applicationId;

    /* JADX INFO: renamed from: dern, reason: collision with root package name and from kotlin metadata */
    public final boolean mediationAdapterInitializationDisabled;

    /* JADX INFO: renamed from: marial, reason: collision with root package name and from kotlin metadata */
    public final Bundle extras;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name and from kotlin metadata */
    public final boolean nativeAdDebuggerDisabled;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name and from kotlin metadata */
    public final RequestConfiguration requestConfiguration;

    /* JADX INFO: renamed from: eddy.attabal$attabal, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Leddy/attabal$attabal;", "", "", "applicationId", "<init>", "(Ljava/lang/String;)V", "Leddy/attabal;", "attabal", "()Leddy/attabal;", "ads-mobile-sdk_release"}, k = 1, mv = {1, 9, 0})
    public static final class C0594attabal {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final String f25582attabal;

        /* JADX INFO: renamed from: dern, reason: collision with root package name */
        public RequestConfiguration f25583dern;

        /* JADX INFO: renamed from: marial, reason: collision with root package name */
        public boolean f25584marial;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public Bundle f25585saneness;

        /* JADX INFO: renamed from: wireman, reason: collision with root package name */
        public boolean f25586wireman;

        public C0594attabal(String applicationId) {
            Intrinsics.checkNotNullParameter(applicationId, "applicationId");
            this.f25582attabal = applicationId;
            this.f25585saneness = new Bundle();
            this.f25583dern = new RequestConfiguration.attabal().attabal();
        }

        public final attabal attabal() {
            return new attabal(this.f25582attabal, this.f25586wireman, this.f25584marial, this.f25583dern, this.f25585saneness, 0);
        }
    }

    public /* synthetic */ attabal(String str, boolean z, boolean z2, RequestConfiguration requestConfiguration, Bundle bundle, int i) {
        this(str, z, z2, requestConfiguration, bundle);
    }

    /* JADX INFO: renamed from: attabal, reason: from getter */
    public final String getApplicationId() {
        return this.applicationId;
    }

    /* JADX INFO: renamed from: dern, reason: from getter */
    public final boolean getNativeAdDebuggerDisabled() {
        return this.nativeAdDebuggerDisabled;
    }

    /* JADX INFO: renamed from: saneness, reason: from getter */
    public final boolean getMediationAdapterInitializationDisabled() {
        return this.mediationAdapterInitializationDisabled;
    }

    /* JADX INFO: renamed from: wireman, reason: from getter */
    public final RequestConfiguration getRequestConfiguration() {
        return this.requestConfiguration;
    }

    public attabal(String str, boolean z, boolean z2, RequestConfiguration requestConfiguration, Bundle bundle) {
        this.applicationId = str;
        this.nativeAdDebuggerDisabled = z;
        this.mediationAdapterInitializationDisabled = z2;
        this.requestConfiguration = requestConfiguration;
        this.extras = bundle;
    }
}
