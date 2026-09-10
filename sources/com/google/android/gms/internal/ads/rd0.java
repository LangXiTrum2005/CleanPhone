package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzba;
import com.ironsource.X3;
import java.lang.ref.WeakReference;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class rd0 implements oq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19561a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final WeakReference f19562b;

    public /* synthetic */ rd0(td0 td0Var, int i10) {
        this.f19561a = i10;
        switch (i10) {
            case 1:
                this.f19562b = new WeakReference(td0Var);
                break;
            default:
                this.f19562b = new WeakReference(td0Var);
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.oq
    public final void b(Object obj, Map map) {
        switch (this.f19561a) {
            case 0:
                td0 td0Var = (td0) this.f19562b.get();
                if (td0Var != null) {
                    pc0 pc0Var = td0Var.f20316i;
                    if ("_ac".equals((String) map.get(X3.i.f27798j0))) {
                        td0Var.f20315h.onAdClicked();
                        if (((Boolean) zzba.zzc().a(am.f12349sc)).booleanValue()) {
                            pc0Var.C();
                            if (!TextUtils.isEmpty((CharSequence) map.get("sccg"))) {
                                pc0Var.O();
                            }
                        }
                    }
                    break;
                }
                break;
            default:
                td0 td0Var2 = (td0) this.f19562b.get();
                if (td0Var2 != null) {
                    pc0 pc0Var2 = td0Var2.f20316i;
                    td0Var2.f20315h.onAdClicked();
                    if (((Boolean) zzba.zzc().a(am.f12349sc)).booleanValue()) {
                        pc0Var2.C();
                        if (!TextUtils.isEmpty((CharSequence) map.get("sccg"))) {
                            pc0Var2.O();
                        }
                    }
                    break;
                }
                break;
        }
    }
}
