package com.google.android.gms.internal.ads;

import android.util.Log;

/* JADX INFO: loaded from: classes4.dex */
public final class zziit extends zziiy {
    final String zza;

    public zziit(String str) {
        this.zza = str;
    }

    @Override // com.google.android.gms.internal.ads.zziiy
    public final void zza(String str) {
        String str2 = this.zza;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + String.valueOf(str2).length() + 1);
        sb.append(str2);
        sb.append(":");
        sb.append(str);
        Log.d("isoparser", sb.toString());
    }
}
