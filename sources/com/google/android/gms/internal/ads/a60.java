package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.zzg;
import com.google.android.gms.ads.internal.util.zzj;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class a60 implements y50 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11907a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final zzg f11908b;

    public /* synthetic */ a60(zzj zzjVar, int i10) {
        this.f11907a = i10;
        this.f11908b = zzjVar;
    }

    @Override // com.google.android.gms.internal.ads.y50
    public final void a(HashMap map) {
        int iIntValue;
        int iIntValue2;
        switch (this.f11907a) {
            case 0:
                this.f11908b.zzb(Boolean.parseBoolean((String) map.get("content_url_opted_out")));
                break;
            case 1:
                this.f11908b.zzd(Boolean.parseBoolean((String) map.get("content_vertical_opted_out")));
                break;
            case 2:
                String str = (String) map.get("default_queue_capacity");
                if (str != null && (iIntValue = Float.valueOf(str).intValue()) > 0) {
                    this.f11908b.zzU(iIntValue);
                    break;
                }
                break;
            default:
                String str2 = (String) map.get("total_inflight_ad_limit");
                if (str2 != null && (iIntValue2 = Float.valueOf(str2).intValue()) > 0) {
                    this.f11908b.zzS(iIntValue2);
                    break;
                }
                break;
        }
    }
}
