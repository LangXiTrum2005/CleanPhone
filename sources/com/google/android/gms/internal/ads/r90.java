package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class r90 implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19479a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f19480b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f19481c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f19482d;

    public /* synthetic */ r90(uv0 uv0Var, mx mxVar, uv0 uv0Var2) {
        this.f19479a = 1;
        this.f19480b = uv0Var;
        this.f19481c = mxVar;
        this.f19482d = uv0Var2;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        Bundle bundle;
        int i10 = this.f19479a;
        Object obj = this.f19482d;
        Object obj2 = this.f19480b;
        Object obj3 = this.f19481c;
        switch (i10) {
            case 0:
                s90 s90Var = (s90) obj3;
                Bundle bundle2 = (Bundle) obj;
                Bundle bundle3 = (Bundle) ((uv0) obj2).f20915c.get();
                String str = (String) ((ListenableFuture) s90Var.f19917g.zzb()).get();
                boolean z10 = false;
                if (((Boolean) zzba.zzc().a(am.f12117d8)).booleanValue() && s90Var.f19920j.zzx()) {
                    z10 = true;
                }
                boolean z11 = z10;
                String str2 = s90Var.f19918h;
                PackageInfo packageInfo = s90Var.f19916f;
                ArrayList arrayList = s90Var.f19915e;
                String str3 = s90Var.f19914d;
                ApplicationInfo applicationInfo = s90Var.f19913c;
                return new mx(bundle3, s90Var.f19912b, applicationInfo, str3, arrayList, packageInfo, str, str2, null, null, z11, s90Var.f19921k.f18366g.matches((String) zzba.zzc().a(am.f12252m4)), bundle2);
            case 1:
                nx nxVar = (nx) ((uv0) obj2).f20915c.get();
                if (((Boolean) zzba.zzc().a(am.S2)).booleanValue() && (bundle = ((mx) obj3).f17577m) != null) {
                    bundle.putLong("get-ad-dictionary-sdkcore-start", nxVar.f18014j);
                    bundle.putLong("get-ad-dictionary-sdkcore-end", nxVar.f18015k);
                }
                return new kl0((JSONObject) ((uv0) obj).f20915c.get(), nxVar);
            case 2:
                fr0 fr0Var = ur0.f20864j;
                JSONArray jSONArray = new JSONArray();
                for (ListenableFuture listenableFuture : (ArrayList) obj3) {
                    if (((JSONObject) listenableFuture.get()) != null) {
                        jSONArray.put(listenableFuture.get());
                    }
                }
                String str4 = (String) obj2;
                Bundle bundle4 = (Bundle) obj;
                if (jSONArray.length() != 0) {
                    return new fr0(jSONArray.toString(), bundle4, str4);
                }
                if (((Boolean) zzba.zzc().a(am.f12238l5)).booleanValue()) {
                    return new fr0(new JSONArray().toString(), bundle4, str4);
                }
                return null;
            default:
                ((i61) obj3).f15628a.a((l31) obj2, null, (byte[]) obj);
                return null;
        }
    }

    public /* synthetic */ r90(Object obj, Object obj2, Cloneable cloneable, int i10) {
        this.f19479a = i10;
        this.f19481c = obj;
        this.f19480b = obj2;
        this.f19482d = cloneable;
    }

    public /* synthetic */ r90(String str, ArrayList arrayList, Bundle bundle) {
        this.f19479a = 2;
        this.f19481c = arrayList;
        this.f19482d = bundle;
        this.f19480b = str;
    }
}
