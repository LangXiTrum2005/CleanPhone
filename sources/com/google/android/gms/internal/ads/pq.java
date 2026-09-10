package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.zzt;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class pq implements oq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18761a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final lj0 f18762b;

    public /* synthetic */ pq(lj0 lj0Var, int i10) {
        this.f18761a = i10;
        this.f18762b = lj0Var;
    }

    @Override // com.google.android.gms.internal.ads.oq
    public final void b(Object obj, Map map) {
        switch (this.f18761a) {
            case 0:
                if (map == null || !map.containsKey("persistentData") || TextUtils.isEmpty((CharSequence) map.get("persistentData"))) {
                    return;
                }
                lj0 lj0Var = this.f18762b;
                String str = (String) map.get("persistentData");
                synchronized (lj0Var) {
                    lj0Var.f17034x = str;
                    zzt.zzh().g().zzO(lj0Var.f17034x);
                }
                return;
            default:
                if (map == null || !map.containsKey(HandleInvocationsFromAdViewer.KEY_EXTRAS)) {
                    return;
                }
                long j10 = Long.MAX_VALUE;
                if (map.containsKey("expires")) {
                    try {
                        j10 = Long.parseLong((String) map.get("expires"));
                        break;
                    } catch (NumberFormatException unused) {
                    }
                }
                lj0 lj0Var2 = this.f18762b;
                String str2 = (String) map.get(HandleInvocationsFromAdViewer.KEY_EXTRAS);
                synchronized (lj0Var2) {
                    lj0Var2.f17025o = str2;
                    lj0Var2.f17027q = j10;
                    lj0Var2.m();
                }
                return;
        }
    }
}
