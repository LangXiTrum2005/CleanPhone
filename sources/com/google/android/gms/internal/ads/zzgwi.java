package com.google.android.gms.internal.ads;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
final class zzgwi {
    public static final FileOutputStream zza(File file, zzgtn zzgtnVar, zzgvz zzgvzVar) throws IOException {
        return new FileOutputStream(file, zzgtnVar.contains(zzgwh.APPEND));
    }
}
