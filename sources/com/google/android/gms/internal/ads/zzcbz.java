package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;
import java.util.Iterator;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class zzcbz implements SharedPreferences.OnSharedPreferenceChangeListener {
    final /* synthetic */ zzccc zza;
    private final String zzb;

    public zzcbz(zzccc zzcccVar, String str) {
        Objects.requireNonNull(zzcccVar);
        this.zza = zzcccVar;
        this.zzb = str;
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        zzccc zzcccVar = this.zza;
        synchronized (zzcccVar) {
            try {
                Iterator it = zzcccVar.zzd().iterator();
                while (it.hasNext()) {
                    ((zzcca) it.next()).zza(sharedPreferences, this.zzb, str);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
