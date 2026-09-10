package com.google.android.gms.dynamite;

import android.content.Context;

/* JADX INFO: loaded from: classes3.dex */
final class zzj implements DynamiteModule.VersionPolicy {
    /* JADX WARN: Code duplicated, block: B:7:0x001b A[DONT_INVERT, PHI: r4
  0x001b: PHI (r4v2 int) = (r4v1 int), (r4v3 int) binds: [B:3:0x0014, B:5:0x0017] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:8:0x001d  */
    @Override // com.google.android.gms.dynamite.DynamiteModule.VersionPolicy
    public final DynamiteModule.VersionPolicy.SelectionResult selectModule(Context context, String str, DynamiteModule.VersionPolicy.IVersions iVersions) throws DynamiteModule.LoadingException {
        DynamiteModule.VersionPolicy.SelectionResult selectionResult = new DynamiteModule.VersionPolicy.SelectionResult();
        selectionResult.localVersion = iVersions.zzb(context, str);
        int i2 = 1;
        int iZza = iVersions.zza(context, str, true);
        selectionResult.remoteVersion = iZza;
        int i3 = selectionResult.localVersion;
        if (i3 == 0) {
            i3 = 0;
            if (iZza == 0) {
                i2 = 0;
            } else if (i3 >= iZza) {
                i2 = -1;
            }
        } else if (i3 >= iZza) {
            i2 = -1;
        }
        selectionResult.selection = i2;
        return selectionResult;
    }
}
