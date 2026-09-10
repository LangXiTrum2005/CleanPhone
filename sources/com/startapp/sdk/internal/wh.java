package com.startapp.sdk.internal;

import android.telephony.PhoneStateListener;
import android.telephony.ServiceState;
import android.telephony.SignalStrength;

/* JADX INFO: loaded from: classes6.dex */
public final class wh extends PhoneStateListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ xh f41638a;

    public wh(xh xhVar) {
        this.f41638a = xhVar;
    }

    @Override // android.telephony.PhoneStateListener
    public final void onServiceStateChanged(ServiceState serviceState) {
        this.f41638a.a(ServiceState.class, serviceState);
    }

    @Override // android.telephony.PhoneStateListener
    public final void onSignalStrengthsChanged(SignalStrength signalStrength) {
        this.f41638a.f41680e.a(signalStrength);
        this.f41638a.a(SignalStrength.class, signalStrength);
    }
}
