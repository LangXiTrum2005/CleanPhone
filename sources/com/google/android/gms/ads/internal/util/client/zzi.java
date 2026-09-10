package com.google.android.gms.ads.internal.util.client;

import android.util.JsonWriter;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
final /* synthetic */ class zzi implements zzk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f10983a;

    @Override // com.google.android.gms.ads.internal.util.client.zzk
    public final /* synthetic */ void zza(JsonWriter jsonWriter) throws IOException {
        Object obj = zzl.f10988b;
        jsonWriter.name("params").beginObject();
        String str = this.f10983a;
        if (str != null) {
            jsonWriter.name("error_description").value(str);
        }
        jsonWriter.endObject();
    }
}
