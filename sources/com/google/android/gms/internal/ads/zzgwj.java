package com.google.android.gms.internal.ads;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes4.dex */
final class zzgwj extends zzgwa {
    private final File zza;

    public final String toString() {
        String string = this.zza.toString();
        return android.support.v4.media.a.s(new StringBuilder(string.length() + 20), "Files.asByteSource(", string, ")");
    }

    @Override // com.google.android.gms.internal.ads.zzgwa
    public final /* bridge */ /* synthetic */ InputStream zza() throws IOException {
        return new FileInputStream(this.zza);
    }
}
