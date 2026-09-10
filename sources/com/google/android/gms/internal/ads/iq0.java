package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zzx;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class iq0 implements as0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15824a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f15825b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f15826c;

    public /* synthetic */ iq0(int i10, Object obj, boolean z10) {
        this.f15824a = i10;
        this.f15825b = obj;
        this.f15826c = z10;
    }

    @Override // com.google.android.gms.internal.ads.as0
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        switch (this.f15824a) {
            case 0:
                String str = (String) this.f15825b;
                Bundle bundle = (Bundle) obj;
                if (str != null) {
                    Bundle bundleB = rb0.b(bundle, "pii");
                    bundleB.putString("afai", str);
                    bundleB.putBoolean("is_afai_lat", this.f15826c);
                }
                break;
            case 1:
                Bundle bundle2 = (Bundle) obj;
                bundle2.putString("gct", (String) this.f15825b);
                if (this.f15826c) {
                    bundle2.putString(DownloadCommon.DOWNLOAD_REPORT_DOWNLOAD_ERROR, "1");
                }
                break;
            default:
                Bundle bundle3 = (Bundle) obj;
                if (((Boolean) zzba.zzc().a(am.A6)).booleanValue()) {
                    bundle3.putBoolean("app_switched", this.f15826c);
                }
                zzx zzxVar = (zzx) this.f15825b;
                if (zzxVar != null) {
                    int i10 = zzxVar.zza;
                    if (i10 == 1) {
                        bundle3.putString("avo", TtmlNode.TAG_P);
                    } else if (i10 == 2) {
                        bundle3.putString("avo", "l");
                    }
                }
                break;
        }
    }
}
