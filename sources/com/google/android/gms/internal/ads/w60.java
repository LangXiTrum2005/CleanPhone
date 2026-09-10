package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class w60 implements oq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f21429a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ y60 f21430b;

    public /* synthetic */ w60(y60 y60Var, int i10) {
        this.f21429a = i10;
        this.f21430b = y60Var;
    }

    @Override // com.google.android.gms.internal.ads.oq
    public final void b(Object obj, Map map) {
        switch (this.f21429a) {
            case 0:
                y60 y60Var = this.f21430b;
                y60Var.getClass();
                if (map != null) {
                    String str = (String) map.get("hashCode");
                    if (!TextUtils.isEmpty(str) && str.equals(y60Var.f22176a)) {
                        y60Var.f22178c.execute(new d(this, 29));
                        break;
                    }
                }
                break;
            default:
                y60 y60Var2 = this.f21430b;
                y60Var2.getClass();
                if (map != null) {
                    String str2 = (String) map.get("hashCode");
                    if (!TextUtils.isEmpty(str2) && str2.equals(y60Var2.f22176a)) {
                        y60Var2.f22178c.execute(new x60(this, 0));
                        break;
                    }
                }
                break;
        }
    }
}
