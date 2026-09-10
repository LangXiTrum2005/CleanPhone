package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class b60 implements y50 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12655a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final lj0 f12656b;

    public /* synthetic */ b60(lj0 lj0Var, int i10) {
        this.f12655a = i10;
        this.f12656b = lj0Var;
    }

    @Override // com.google.android.gms.internal.ads.y50
    public final void a(HashMap map) {
        switch (this.f12655a) {
            case 0:
                String str = (String) map.get("gesture");
                if (!TextUtils.isEmpty(str)) {
                    int iHashCode = str.hashCode();
                    lj0 lj0Var = this.f12656b;
                    if (iHashCode == 97520651) {
                        if (str.equals("flick")) {
                            lj0Var.h(ij0.f15770c, true);
                        }
                    } else if (iHashCode == 109399814 && str.equals("shake")) {
                        lj0Var.h(ij0.f15769b, true);
                    }
                    lj0Var.h(ij0.f15768a, true);
                    break;
                }
                break;
            default:
                String str2 = (String) map.get("test_mode_enabled");
                if (!TextUtils.isEmpty(str2)) {
                    this.f12656b.b(str2.equals(com.ironsource.mediationsdk.metadata.a.f29610g));
                    break;
                }
                break;
        }
    }
}
