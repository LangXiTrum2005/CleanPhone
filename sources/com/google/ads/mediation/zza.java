package com.google.ads.mediation;

import android.view.View;
import com.google.android.gms.ads.formats.zzh;
import com.google.android.gms.ads.mediation.UnifiedNativeAdMapper;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
final class zza extends UnifiedNativeAdMapper {
    @Override // com.google.android.gms.ads.mediation.UnifiedNativeAdMapper
    public final void trackViews(View view, Map map, Map map2) {
        if ((view instanceof zzh) || ((com.google.android.gms.ads.formats.zzc) com.google.android.gms.ads.formats.zzc.zza.get(view)) != null) {
            throw null;
        }
    }
}
