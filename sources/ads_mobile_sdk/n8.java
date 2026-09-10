package ads_mobile_sdk;

import com.google.android.libraries.ads.mobile.sdk.initialization.AdapterStatus;

/* JADX INFO: loaded from: classes.dex */
public final class n8 implements AdapterStatus {
    public final AdapterStatus.InitializationState a;
    public final String b;
    public final int c;

    public n8(AdapterStatus.InitializationState initializationState, String str, int i) {
        this.a = initializationState;
        this.b = str;
        this.c = i;
    }

    @Override // com.google.android.libraries.ads.mobile.sdk.initialization.AdapterStatus
    public final String getDescription() {
        return this.b;
    }

    @Override // com.google.android.libraries.ads.mobile.sdk.initialization.AdapterStatus
    public final AdapterStatus.InitializationState getInitializationState() {
        return this.a;
    }

    @Override // com.google.android.libraries.ads.mobile.sdk.initialization.AdapterStatus
    public final int getLatency() {
        return this.c;
    }
}
