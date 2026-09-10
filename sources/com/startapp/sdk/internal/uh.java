package com.startapp.sdk.internal;

import android.telephony.TelephonyManager;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes6.dex */
public final class uh extends vh {
    public final th d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yh f41548e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uh(yh yhVar, TelephonyManager telephonyManager, Class cls) {
        super(yhVar, telephonyManager, cls);
        this.f41548e = yhVar;
        this.d = new th(this);
    }

    @Override // com.startapp.sdk.internal.vh
    public final void a() {
        this.f41586a.registerTelephonyCallback((Executor) this.f41548e.f41716b.a(), this.d);
    }

    @Override // com.startapp.sdk.internal.vh
    public final void b() {
        this.f41586a.unregisterTelephonyCallback(this.d);
    }
}
