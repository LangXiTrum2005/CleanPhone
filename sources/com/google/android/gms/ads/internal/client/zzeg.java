package com.google.android.gms.ads.internal.client;

import android.os.Bundle;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.AdRequest;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import k9.c0;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class zzeg {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f10800g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f10802i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f10803j;
    public boolean l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public String f10805m;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public long f10807o;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashSet f10794a = new HashSet();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Bundle f10795b = new Bundle();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashMap f10796c = new HashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final HashSet f10797d = new HashSet();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Bundle f10798e = new Bundle();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final HashSet f10799f = new HashSet();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ArrayList f10801h = new ArrayList();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f10804k = -1;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f10806n = 60000;

    public final void zza(String str) {
        this.f10794a.add(str);
    }

    public final void zzb(Bundle bundle) {
        this.f10795b.putAll(bundle);
    }

    public final void zzc(Class cls, @Nullable Bundle bundle) {
        this.f10795b.putBundle(cls.getName(), bundle);
    }

    public final void zzd(Class cls, Bundle bundle) {
        Bundle bundle2 = this.f10795b;
        if (bundle2.getBundle("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter") == null) {
            bundle2.putBundle("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter", new Bundle());
        }
        Bundle bundle3 = bundle2.getBundle("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter");
        c0.h(bundle3);
        bundle3.putBundle(cls.getName(), bundle);
    }

    public final void zze(String str) {
        this.f10797d.add(str);
    }

    public final void zzf(String str) {
        this.f10797d.remove(AdRequest.DEVICE_ID_EMULATOR);
    }

    public final void zzg(String str) {
        this.f10800g = str;
    }

    public final void zzh(List list) {
        ArrayList arrayList = this.f10801h;
        arrayList.clear();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            if (TextUtils.isEmpty(str)) {
                com.google.android.gms.ads.internal.util.client.zzo.zzi("neighboring content URL should not be null or empty");
            } else {
                arrayList.add(str);
            }
        }
    }

    public final void zzi(String str) {
        this.f10802i = str;
    }

    public final void zzj(String str) {
        this.f10803j = str;
    }

    @Deprecated
    public final void zzk(boolean z10) {
        this.f10804k = z10 ? 1 : 0;
    }

    public final void zzl(String str, String str2) {
        this.f10798e.putString(str, str2);
    }

    public final void zzm(String str) {
        this.f10799f.add(str);
    }

    @Deprecated
    public final void zzn(boolean z10) {
        this.l = z10;
    }

    public final void zzo(String str) {
        this.f10805m = str;
    }

    public final void zzp(int i10) {
        this.f10806n = i10;
    }

    public final void zzq(long j10) {
        this.f10807o = j10;
    }
}
