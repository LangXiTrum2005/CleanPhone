package com.google.android.gms.internal.ads;

import com.p004ironsource.d9;
import java.io.IOException;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class zzhxp extends zzhxq {
    final /* synthetic */ zzhxq zza;

    public /* synthetic */ zzhxp(zzhxq zzhxqVar, byte[] bArr) {
        Objects.requireNonNull(zzhxqVar);
        this.zza = zzhxqVar;
    }

    public final String toString() {
        String string = this.zza.toString();
        return android.support.v4.media.a.s(new StringBuilder(string.length() + 21), "NullSafeTypeAdapter[", string, d9.i.f24752e);
    }

    @Override // com.google.android.gms.internal.ads.zzhxq
    public final void zza(zzhyq zzhyqVar, Object obj) throws IOException {
        throw null;
    }
}
