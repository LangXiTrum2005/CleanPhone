package com.google.android.gms.ads.nonagon.signalgeneration;

import com.google.android.gms.internal.ads.d81;
import java.util.ArrayList;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
final /* synthetic */ class zzal implements d81 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ zzal f11388a = new zzal();

    @Override // com.google.android.gms.internal.ads.d81
    public final /* synthetic */ Object apply(Object obj) {
        ArrayList arrayList = zzap.G;
        return ((JSONObject) obj).optString("nas");
    }
}
