package com.google.android.gms.ads.internal.util;

import android.os.Looper;
import android.os.Message;
import com.google.android.gms.internal.ads.y01;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class zzf extends y01 {
    public zzf(Looper looper) {
        super(looper);
    }

    @Override // com.google.android.gms.internal.ads.y01
    public final void a(Message message) {
        try {
            super.a(message);
        } catch (Throwable th2) {
            com.google.android.gms.ads.internal.zzt.zzc();
            zzs.zzP(com.google.android.gms.ads.internal.zzt.zzh().f14133e, th2);
            throw th2;
        }
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        try {
            super.handleMessage(message);
        } catch (Exception e10) {
            com.google.android.gms.ads.internal.zzt.zzh().d("AdMobHandler.handleMessage", e10);
        }
    }
}
