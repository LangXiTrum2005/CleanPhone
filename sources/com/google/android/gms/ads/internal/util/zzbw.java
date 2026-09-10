package com.google.android.gms.ads.internal.util;

import android.content.SharedPreferences;
import java.util.Iterator;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
final class zzbw implements SharedPreferences.OnSharedPreferenceChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f11098a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ zzbz f11099b;

    public zzbw(zzbz zzbzVar, String str) {
        Objects.requireNonNull(zzbzVar);
        this.f11099b = zzbzVar;
        this.f11098a = str;
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        zzbz zzbzVar = this.f11099b;
        synchronized (zzbzVar) {
            try {
                Iterator it = zzbzVar.f11102b.iterator();
                while (it.hasNext()) {
                    ((zzbx) it.next()).zza(sharedPreferences, this.f11098a, str);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
