package com.google.android.gms.ads.internal;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import androidx.annotation.Nullable;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.internal.client.zzft;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.zzac;
import com.google.android.gms.internal.ads.um;
import com.ironsource.X3;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import r9.c;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
final class zzr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f11214a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f11215b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TreeMap f11216c = new TreeMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f11217d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f11218e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f11219f;

    public zzr(Context context, String str) {
        String strConcat;
        this.f11214a = context.getApplicationContext();
        this.f11215b = str;
        String packageName = context.getPackageName();
        try {
            String str2 = c.a(context).f(0, context.getPackageName()).versionName;
            StringBuilder sb2 = new StringBuilder(String.valueOf(packageName).length() + 1 + String.valueOf(str2).length());
            sb2.append(packageName);
            sb2.append("-");
            sb2.append(str2);
            strConcat = sb2.toString();
        } catch (PackageManager.NameNotFoundException e10) {
            int i10 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzg("Unable to get package version name for reporting", e10);
            strConcat = String.valueOf(packageName).concat("-missing");
        }
        this.f11219f = strConcat;
    }

    public final String zza() {
        return this.f11218e;
    }

    @Nullable
    public final String zzb() {
        return this.f11217d;
    }

    public final String zzc() {
        return this.f11215b;
    }

    public final String zzd() {
        return this.f11219f;
    }

    public final Map zze() {
        return this.f11216c;
    }

    public final void zzf(com.google.android.gms.ads.internal.client.zzm zzmVar, VersionInfoParcel versionInfoParcel) {
        TreeMap treeMap;
        zzft zzftVar = zzmVar.zzj;
        if (zzftVar != null) {
            this.f11217d = zzftVar.zza;
        }
        Bundle bundle = zzmVar.zzm;
        Bundle bundle2 = bundle != null ? bundle.getBundle(AdMobAdapter.class.getName()) : null;
        if (bundle2 == null) {
            return;
        }
        String str = (String) um.f20821c.o();
        Iterator<String> it = bundle2.keySet().iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            treeMap = this.f11216c;
            if (!zHasNext) {
                break;
            }
            String next = it.next();
            if (str.equals(next)) {
                this.f11218e = bundle2.getString(next);
            } else if (next.startsWith("csa_")) {
                treeMap.put(next.substring(4), bundle2.getString(next));
            }
        }
        treeMap.put(X3.j.f27858q, versionInfoParcel.afmaVersion);
        if (((Boolean) um.f20819a.o()).booleanValue()) {
            Bundle bundleZzb = zzac.zzb(this.f11214a, (String) um.f20820b.o());
            for (String str2 : bundleZzb.keySet()) {
                treeMap.put(str2, bundleZzb.get(str2).toString());
            }
        }
    }
}
