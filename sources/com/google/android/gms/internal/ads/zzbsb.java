package com.google.android.gms.internal.ads;

import java.io.ByteArrayInputStream;
import java.nio.charset.StandardCharsets;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
final /* synthetic */ class zzbsb implements zzbrx {
    static final /* synthetic */ zzbsb zza = new zzbsb();

    private /* synthetic */ zzbsb() {
    }

    @Override // com.google.android.gms.internal.ads.zzbrx
    public final /* synthetic */ Object zza(JSONObject jSONObject) {
        return new ByteArrayInputStream(jSONObject.toString().getBytes(StandardCharsets.UTF_8));
    }
}
