package com.google.android.gms.ads.internal.util.client;

import android.util.Base64;
import android.util.JsonWriter;
import java.io.IOException;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
final /* synthetic */ class zzj implements zzk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f10984a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f10985b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Map f10986c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ byte[] f10987d;

    public /* synthetic */ zzj(String str, String str2, Map map, byte[] bArr) {
        this.f10984a = str;
        this.f10985b = str2;
        this.f10986c = map;
        this.f10987d = bArr;
    }

    @Override // com.google.android.gms.ads.internal.util.client.zzk
    public final void zza(JsonWriter jsonWriter) throws IOException {
        Object obj = zzl.f10988b;
        jsonWriter.name("params").beginObject();
        jsonWriter.name("firstline").beginObject();
        jsonWriter.name("uri").value(this.f10984a);
        jsonWriter.name("verb").value(this.f10985b);
        jsonWriter.endObject();
        zzl.a(jsonWriter, this.f10986c);
        byte[] bArr = this.f10987d;
        if (bArr != null) {
            jsonWriter.name("body").value(Base64.encodeToString(bArr, 0));
        }
        jsonWriter.endObject();
    }
}
