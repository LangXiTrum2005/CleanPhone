package com.google.android.gms.ads.nonagon.util.logging.csi;

import androidx.annotation.NonNull;
import com.google.android.gms.internal.ads.gx1;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class CsiUrlBuilder_Factory implements gx1 {
    @NonNull
    public static CsiUrlBuilder_Factory create() {
        return zza.f11546a;
    }

    @NonNull
    public static CsiUrlBuilder newInstance() {
        return new CsiUrlBuilder();
    }

    @Override // com.google.android.gms.internal.ads.kx1
    @NonNull
    /* JADX INFO: renamed from: get, reason: merged with bridge method [inline-methods] */
    public CsiUrlBuilder zzb() {
        return newInstance();
    }
}
