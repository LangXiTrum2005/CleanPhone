package com.google.android.gms.ads.internal.util;

import android.annotation.TargetApi;
import android.content.Context;
import com.google.android.gms.internal.ads.am;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
@TargetApi(DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_LOAD_REQUEST_FAILURE_TIME_VALUE)
public final class zzy extends zzx {
    @Override // com.google.android.gms.ads.internal.util.zzz
    public final int zzk(Context context) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(am.Z9)).booleanValue()) {
            return 0;
        }
        return super.zzk(context);
    }
}
