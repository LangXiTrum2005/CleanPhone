package com.google.android.gms.internal.ads;

import android.view.View;
import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
public final class zzfse extends zzfsh {
    private static final zzfse zzb = new zzfse();

    private zzfse() {
    }

    public static zzfse zza() {
        return zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzfsh
    public final boolean zzb() {
        Iterator it = zzfsf.zza().zzf().iterator();
        while (it.hasNext()) {
            View viewZzi = ((zzfrl) it.next()).zzi();
            if (viewZzi != null && viewZzi.hasWindowFocus()) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzfsh
    public final void zzc(boolean z2) {
        Iterator it = zzfsf.zza().zze().iterator();
        while (it.hasNext()) {
            ((zzfrl) it.next()).zzg().zzf(z2);
        }
    }
}
