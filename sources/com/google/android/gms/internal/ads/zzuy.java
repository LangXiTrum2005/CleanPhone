package com.google.android.gms.internal.ads;

import android.os.Build;

/* JADX INFO: loaded from: classes4.dex */
final /* synthetic */ class zzuy implements zzvb {
    static final /* synthetic */ zzuy zza = new zzuy();

    private /* synthetic */ zzuy() {
    }

    @Override // com.google.android.gms.internal.ads.zzvb
    public final /* synthetic */ int zza(Object obj) {
        int i2 = zzvc.zza;
        String str = ((zzuj) obj).zza;
        if (str.startsWith("OMX.google") || str.startsWith("c2.android")) {
            return 1;
        }
        return (Build.VERSION.SDK_INT >= 26 || !str.equals("OMX.MTK.AUDIO.DECODER.RAW")) ? 0 : -1;
    }
}
