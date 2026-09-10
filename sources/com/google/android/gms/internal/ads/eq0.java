package com.google.android.gms.internal.ads;

import android.os.Bundle;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class eq0 implements as0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14048a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f14049b;

    public /* synthetic */ eq0(ArrayList arrayList, int i10) {
        this.f14048a = i10;
        this.f14049b = arrayList;
    }

    @Override // com.google.android.gms.internal.ads.as0
    public final void zza(Object obj) {
        switch (this.f14048a) {
            case 0:
                ((Bundle) obj).putStringArrayList("ad_types", this.f14049b);
                break;
            default:
                Bundle bundle = (Bundle) obj;
                ArrayList arrayList = this.f14049b;
                if (arrayList != null) {
                    bundle.putStringArrayList("android_permissions", new ArrayList<>(arrayList));
                }
                break;
        }
    }
}
