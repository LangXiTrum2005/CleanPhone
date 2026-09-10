package com.google.android.gms.ads.internal.overlay;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.internal.ads.am;
import com.google.android.gms.internal.ads.i71;
import com.google.android.gms.internal.ads.n71;
import com.google.android.gms.internal.ads.o71;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
final class zzx implements o71 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ zzz f10958a;

    public zzx(zzz zzzVar) {
        this.f10958a = zzzVar;
    }

    @Override // com.google.android.gms.internal.ads.o71
    public final void zza(n71 n71Var) {
        zzz zzzVar = this.f10958a;
        zzzVar.getClass();
        i71 i71Var = (i71) n71Var;
        if (!TextUtils.isEmpty(i71Var.f15645b)) {
            if (!((Boolean) zzba.zzc().a(am.f12184hd)).booleanValue()) {
                zzzVar.f10962a = i71Var.f15645b;
            }
        }
        int i10 = i71Var.f15644a;
        switch (i10) {
            case 8152:
                zzzVar.b("onLMDOverlayOpened", new HashMap());
                break;
            case 8153:
                zzzVar.b("onLMDOverlayClicked", new HashMap());
                break;
            case 8155:
                zzzVar.b("onLMDOverlayClose", new HashMap());
                break;
            case 8157:
                zzzVar.f10962a = null;
                zzzVar.f10963b = null;
                zzzVar.f10966e = false;
                break;
            case 8160:
            case 8161:
            case 8162:
                HashMap map = new HashMap();
                map.put("error", String.valueOf(i10));
                zzzVar.b("onLMDOverlayFailedToOpen", map);
                break;
        }
    }
}
