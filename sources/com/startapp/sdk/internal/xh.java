package com.startapp.sdk.internal;

import android.telephony.TelephonyManager;

/* JADX INFO: loaded from: classes6.dex */
public final class xh extends vh {
    public final wh d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yh f41680e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xh(yh yhVar, TelephonyManager telephonyManager, Class cls) {
        super(yhVar, telephonyManager, cls);
        this.f41680e = yhVar;
        this.d = new wh(this);
    }

    @Override // com.startapp.sdk.internal.vh
    public final void a() {
        this.f41586a.listen(this.d, 257);
    }

    @Override // com.startapp.sdk.internal.vh
    public final void b() {
        this.f41586a.listen(this.d, 0);
    }
}
