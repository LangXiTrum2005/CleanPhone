package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class u61 implements p61 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f20666a = new ArrayList();

    @Override // com.google.android.gms.internal.ads.p61
    public final synchronized void a(HashMap map, Context context, View view) {
        ArrayList arrayList = this.f20666a;
        map.put(CampaignEx.JSON_KEY_NEW_INTERSTITIAL_VST, new ArrayList(arrayList));
        arrayList.clear();
    }

    @Override // com.google.android.gms.internal.ads.p61
    public final void b(HashMap map) {
    }

    @Override // com.google.android.gms.internal.ads.p61
    public final void c(HashMap map) {
    }
}
