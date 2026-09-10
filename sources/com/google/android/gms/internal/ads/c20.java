package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import android.view.View;
import androidx.core.app.NotificationCompat;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class c20 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12993a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f12994b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f12995c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f12996d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f12997e;

    public /* synthetic */ c20(g30 g30Var, View view, bz bzVar, int i10) {
        this.f12995c = g30Var;
        this.f12996d = view;
        this.f12997e = bzVar;
        this.f12994b = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f12993a) {
            case 0:
                HashMap mapN = com.applovin.impl.ca.n(NotificationCompat.CATEGORY_EVENT, "precacheComplete");
                mapN.put("src", (String) this.f12995c);
                mapN.put("cachedSrc", (String) this.f12996d);
                mapN.put("totalBytes", Integer.toString(this.f12994b));
                ((e20) this.f12997e).r(mapN);
                return;
            case 1:
                ((g30) this.f12995c).Q((View) this.f12996d, (bz) this.f12997e, this.f12994b - 1);
                return;
            default:
                l71 l71Var = (l71) this.f12995c;
                j71 j71Var = (j71) this.f12996d;
                int i10 = this.f12994b;
                o71 o71Var = (o71) this.f12997e;
                String str = l71Var.f16777b;
                try {
                    ln0 ln0Var = l71Var.f16776a;
                    if (ln0Var == null) {
                        throw null;
                    }
                    e71 e71Var = (e71) ln0Var.f17079j;
                    if (e71Var == null) {
                        return;
                    }
                    Bundle bundle = new Bundle();
                    bundle.putString("callerPackage", str);
                    bundle.putInt("displayMode", i10);
                    String str2 = j71Var.f16007a;
                    if (!l71.b(str2)) {
                        str2.getClass();
                        bundle.putString("sessionToken", str2.trim());
                    }
                    String str3 = j71Var.f16008b;
                    if (!l71.b(str3)) {
                        str3.getClass();
                        bundle.putString("appId", str3.trim());
                    }
                    k71 k71Var = new k71(l71Var, o71Var);
                    c71 c71Var = (c71) e71Var;
                    Parcel parcelQ = c71Var.q();
                    rh.c(parcelQ, bundle);
                    rh.e(parcelQ, k71Var);
                    c71Var.u1(parcelQ, 3);
                    return;
                } catch (RemoteException e10) {
                    l71.f16774c.e(e10, "switchDisplayMode overlay display to %d from: %s", Integer.valueOf(i10), str);
                    return;
                }
        }
    }

    public /* synthetic */ c20(l71 l71Var, j71 j71Var, int i10, o71 o71Var) {
        this.f12995c = l71Var;
        this.f12996d = j71Var;
        this.f12994b = i10;
        this.f12997e = o71Var;
    }

    public c20(e20 e20Var, String str, String str2, int i10) {
        this.f12995c = str;
        this.f12996d = str2;
        this.f12994b = i10;
        this.f12997e = e20Var;
    }
}
