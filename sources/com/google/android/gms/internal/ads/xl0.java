package com.google.android.gms.internal.ads;

import android.content.DialogInterface;
import com.google.android.gms.ads.internal.overlay.zzm;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class xl0 implements DialogInterface.OnCancelListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f21917a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ zl0 f21918b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ zzm f21919c;

    public /* synthetic */ xl0(zl0 zl0Var, zzm zzmVar, int i10) {
        this.f21917a = i10;
        this.f21918b = zl0Var;
        this.f21919c = zzmVar;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final /* synthetic */ void onCancel(DialogInterface dialogInterface) {
        switch (this.f21917a) {
            case 0:
                zl0 zl0Var = this.f21918b;
                zl0Var.f22656f.b(zl0Var.f22657g);
                HashMap map = new HashMap();
                map.put("dialog_action", "dismiss");
                zl0Var.D1(zl0Var.f22657g, "dialog_click", map);
                zzm zzmVar = this.f21919c;
                if (zzmVar != null) {
                    zzmVar.zzb();
                }
                break;
            default:
                zl0 zl0Var2 = this.f21918b;
                zl0Var2.f22656f.b(zl0Var2.f22657g);
                HashMap map2 = new HashMap();
                map2.put("dialog_action", "dismiss");
                zl0Var2.D1(zl0Var2.f22657g, "rtsdc", map2);
                zzm zzmVar2 = this.f21919c;
                if (zzmVar2 != null) {
                    zzmVar2.zzb();
                }
                break;
        }
    }
}
