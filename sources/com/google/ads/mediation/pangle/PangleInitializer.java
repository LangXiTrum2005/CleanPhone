package com.google.ads.mediation.pangle;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.api.init.PAGSdk;
import com.google.android.gms.ads.AdError;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public class PangleInitializer implements PAGSdk.PAGInitCallback {

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
    public static PangleInitializer f19028beachfront;

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public boolean f19029attabal;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final ArrayList<Listener> f19030dern;

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public final PangleFactory f19031marial;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public boolean f19032saneness;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public final PangleSdkWrapper f19033wireman;

    public interface Listener {
        void onInitializeError(AdError adError);

        void onInitializeSuccess();
    }

    public PangleInitializer() {
        this.f19029attabal = false;
        this.f19032saneness = false;
        this.f19030dern = new ArrayList<>();
        this.f19033wireman = new PangleSdkWrapper();
        this.f19031marial = new PangleFactory();
    }

    public static PangleInitializer getInstance() {
        if (f19028beachfront == null) {
            f19028beachfront = new PangleInitializer();
        }
        return f19028beachfront;
    }

    @Override // com.bytedance.sdk.openadsdk.api.init.PAGSdk.PAGInitCallback
    public void fail(int i, String str) {
        this.f19029attabal = false;
        this.f19032saneness = false;
        AdError adErrorCreateSdkError = PangleConstants.createSdkError(i, str);
        Iterator<Listener> it = this.f19030dern.iterator();
        while (it.hasNext()) {
            it.next().onInitializeError(adErrorCreateSdkError);
        }
        this.f19030dern.clear();
    }

    public void initialize(Context context, String str, Listener listener) {
        if (TextUtils.isEmpty(str)) {
            AdError adErrorCreateAdapterError = PangleConstants.createAdapterError(101, "Failed to initialize Pangle SDK. Missing or invalid App ID.");
            String str2 = PangleMediationAdapter.TAG;
            adErrorCreateAdapterError.toString();
            listener.onInitializeError(adErrorCreateAdapterError);
            return;
        }
        if (this.f19029attabal) {
            this.f19030dern.add(listener);
            return;
        }
        if (this.f19032saneness) {
            listener.onInitializeSuccess();
            return;
        }
        this.f19029attabal = true;
        this.f19030dern.add(listener);
        this.f19033wireman.init(context, this.f19031marial.attabal().appId(str).setAdxId(PangleConstants.ADX_ID).setUserData(String.format("[{\"name\":\"mediation\",\"value\":\"google\"},{\"name\":\"adapter_version\",\"value\":\"%s\"}]", BuildConfig.ADAPTER_VERSION)).build(), this);
    }

    @Override // com.bytedance.sdk.openadsdk.api.init.PAGSdk.PAGInitCallback
    public void success() {
        this.f19029attabal = false;
        this.f19032saneness = true;
        Iterator<Listener> it = this.f19030dern.iterator();
        while (it.hasNext()) {
            it.next().onInitializeSuccess();
        }
        this.f19030dern.clear();
    }

    public PangleInitializer(PangleSdkWrapper pangleSdkWrapper, PangleFactory pangleFactory) {
        this.f19029attabal = false;
        this.f19032saneness = false;
        this.f19030dern = new ArrayList<>();
        this.f19033wireman = pangleSdkWrapper;
        this.f19031marial = pangleFactory;
    }
}
