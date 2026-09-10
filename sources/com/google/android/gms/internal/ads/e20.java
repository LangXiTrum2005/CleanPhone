package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.zzf;
import com.google.android.gms.ads.internal.zzt;
import java.lang.ref.WeakReference;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public abstract class e20 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f13806a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f13807b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final WeakReference f13808c;

    public e20(b30 b30Var) {
        Context context = b30Var.getContext();
        this.f13806a = context;
        this.f13807b = zzt.zzc().zze(context, b30Var.zzs().afmaVersion);
        this.f13808c = new WeakReference(b30Var);
    }

    public abstract boolean h(String str);

    public boolean j(String str, String[] strArr) {
        return h(str);
    }

    public boolean k(String str, String[] strArr, w10 w10Var) {
        return h(str);
    }

    public abstract void p();

    public final void q(String str, String str2, String str3, String str4) {
        zzf.zza.post(new d20(this, str, str2, str3, str4));
    }

    public final /* synthetic */ void r(HashMap map) {
        b30 b30Var = (b30) this.f13808c.get();
        if (b30Var != null) {
            b30Var.e("onPrecacheEvent", map);
        }
    }

    public void g() {
    }

    public void l(int i10) {
    }

    public void m(int i10) {
    }

    public void n(int i10) {
    }

    public void o(int i10) {
    }
}
