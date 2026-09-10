package com.google.android.gms.ads.internal.util.client;

import android.util.JsonWriter;
import java.io.IOException;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
final /* synthetic */ class zzg implements zzk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10980a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Map f10981b;

    public /* synthetic */ zzg(int i10, Map map) {
        this.f10980a = i10;
        this.f10981b = map;
    }

    @Override // com.google.android.gms.ads.internal.util.client.zzk
    public final /* synthetic */ void zza(JsonWriter jsonWriter) throws IOException {
        Object obj = zzl.f10988b;
        jsonWriter.name("params").beginObject();
        jsonWriter.name("firstline").beginObject();
        jsonWriter.name("code").value(this.f10980a);
        jsonWriter.endObject();
        zzl.a(jsonWriter, this.f10981b);
        jsonWriter.endObject();
    }
}
