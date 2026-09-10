package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.ads.internal.client.zzv;
import com.google.android.gms.ads.internal.zzt;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class sm0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f20002c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public fu0 f20003d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public du0 f20004e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public zzv f20005f = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map f20001b = defpackage.e.w();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f20000a = Collections.synchronizedList(new ArrayList());

    public sm0(String str) {
        this.f20002c = str;
    }

    public static String d(du0 du0Var) {
        return ((Boolean) zzba.zzc().a(am.E4)).booleanValue() ? du0Var.f13704p0 : du0Var.f13715w;
    }

    public final void a(du0 du0Var) {
        String strD = d(du0Var);
        Map map = this.f20001b;
        Object obj = map.get(strD);
        List list = this.f20000a;
        int iIndexOf = list.indexOf(obj);
        if (iIndexOf < 0 || iIndexOf >= map.size()) {
            iIndexOf = list.indexOf(this.f20005f);
        }
        if (iIndexOf < 0 || iIndexOf >= map.size()) {
            return;
        }
        this.f20005f = (zzv) list.get(iIndexOf);
        while (true) {
            iIndexOf++;
            if (iIndexOf >= list.size()) {
                return;
            }
            zzv zzvVar = (zzv) list.get(iIndexOf);
            zzvVar.zzb = 0L;
            zzvVar.zzc = null;
        }
    }

    public final synchronized void b(du0 du0Var, int i10) {
        Map map = this.f20001b;
        String strD = d(du0Var);
        if (map.containsKey(strD)) {
            return;
        }
        Bundle bundle = new Bundle();
        JSONObject jSONObject = du0Var.f13713v;
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            try {
                bundle.putString(next, jSONObject.getString(next));
            } catch (JSONException unused) {
            }
        }
        zzv zzvVar = new zzv(du0Var.E, 0L, null, bundle, du0Var.F, du0Var.G, du0Var.H, du0Var.I);
        try {
            this.f20000a.add(i10, zzvVar);
        } catch (IndexOutOfBoundsException e10) {
            zzt.zzh().d("AdapterResponseInfoCollector.addAdapterResponseInfoEntryAtLocation", e10);
        }
        this.f20001b.put(strD, zzvVar);
    }

    public final void c(du0 du0Var, long j10, zze zzeVar, boolean z10) {
        String strD = d(du0Var);
        Map map = this.f20001b;
        if (map.containsKey(strD)) {
            if (this.f20004e == null) {
                this.f20004e = du0Var;
            }
            zzv zzvVar = (zzv) map.get(strD);
            zzvVar.zzb = j10;
            zzvVar.zzc = zzeVar;
            if (((Boolean) zzba.zzc().a(am.P7)).booleanValue() && z10) {
                this.f20005f = zzvVar;
            }
        }
    }
}
