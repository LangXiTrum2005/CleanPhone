package com.startapp.sdk.internal;

import android.telephony.ServiceState;
import android.telephony.SignalStrength;
import android.telephony.TelephonyCallback;

/* JADX INFO: loaded from: classes6.dex */
public final class th extends TelephonyCallback implements TelephonyCallback.ServiceStateListener, TelephonyCallback.SignalStrengthsListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ uh f41525a;

    public th(uh uhVar) {
        this.f41525a = uhVar;
    }

    public final void onServiceStateChanged(ServiceState serviceState) {
        this.f41525a.a(ServiceState.class, serviceState);
    }

    public final void onSignalStrengthsChanged(SignalStrength signalStrength) {
        this.f41525a.f41548e.a(signalStrength);
        this.f41525a.a(SignalStrength.class, signalStrength);
    }
}
