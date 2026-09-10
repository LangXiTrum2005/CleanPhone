package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import com.google.android.gms.ads.internal.client.zzba;
import java.util.Set;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class oc0 extends mu1 implements ai {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final WeakHashMap f18233c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Context f18234d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final du0 f18235e;

    public oc0(Context context, Set set, du0 du0Var) {
        super(set);
        this.f18233c = new WeakHashMap(1);
        this.f18234d = context;
        this.f18235e = du0Var;
    }

    public final synchronized void X0(View view) {
        try {
            WeakHashMap weakHashMap = this.f18233c;
            bi biVar = (bi) weakHashMap.get(view);
            if (biVar == null) {
                bi biVar2 = new bi(this.f18234d, view);
                biVar2.l.add(this);
                biVar2.d(3);
                weakHashMap.put(view, biVar2);
                biVar = biVar2;
            }
            if (this.f18235e.X) {
                if (((Boolean) zzba.zzc().a(am.f12144f2)).booleanValue()) {
                    biVar.f12788i.zzb(((Long) zzba.zzc().a(am.f12128e2)).longValue());
                    return;
                }
            }
            biVar.f12788i.zzb(bi.f12779o);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // com.google.android.gms.internal.ads.ai
    public final synchronized void v(zh zhVar) {
        S0(new vf(zhVar, 19));
    }
}
