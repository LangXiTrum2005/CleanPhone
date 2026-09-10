package com.google.ads.mediation.inmobi;

import android.content.Context;
import com.google.android.gms.ads.AdError;
import com.inmobi.sdk.SdkInitializationListener;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public class InMobiInitializer implements SdkInitializationListener {
    public static final int INITIALIZED = 2;
    public static final int INITIALIZING = 1;
    public static final int UNINITIALIZED = 0;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public static InMobiInitializer f18882wireman;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final ArrayList<Listener> f18885saneness = new ArrayList<>();

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public int f18883attabal = 0;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final InMobiSdkWrapper f18884dern = new InMobiSdkWrapper();

    @Retention(RetentionPolicy.SOURCE)
    public @interface InitializationStatus {
    }

    public interface Listener {
        void onInitializeError(AdError adError);

        void onInitializeSuccess();
    }

    public static InMobiInitializer getInstance() {
        if (f18882wireman == null) {
            f18882wireman = new InMobiInitializer();
        }
        return f18882wireman;
    }

    public void init(Context context, String str, Listener listener) {
        if (this.f18883attabal == 2) {
            listener.onInitializeSuccess();
            return;
        }
        this.f18885saneness.add(listener);
        if (this.f18883attabal == 1) {
            return;
        }
        this.f18883attabal = 1;
        this.f18884dern.init(context, str, InMobiConsent.attabal(), this);
    }

    @Override // com.inmobi.sdk.SdkInitializationListener
    public void onInitializationComplete(Error error) {
        if (error == null) {
            String str = InMobiMediationAdapter.ERROR_MESSAGE_FOR_INVALID_ACCOUNTID;
            this.f18883attabal = 2;
            Iterator<Listener> it = this.f18885saneness.iterator();
            while (it.hasNext()) {
                it.next().onInitializeSuccess();
            }
        } else {
            this.f18883attabal = 0;
            AdError adErrorCreateAdapterError = InMobiConstants.createAdapterError(101, error.getLocalizedMessage());
            Iterator<Listener> it2 = this.f18885saneness.iterator();
            while (it2.hasNext()) {
                it2.next().onInitializeError(adErrorCreateAdapterError);
            }
        }
        this.f18885saneness.clear();
    }
}
