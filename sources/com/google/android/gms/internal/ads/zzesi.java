package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.RoundedCorner;
import android.view.WindowInsets;
import androidx.core.graphics.Insets;
import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: loaded from: classes4.dex */
public final class zzesi implements zzezx {
    private final zzezx zza;
    private final zzfik zzb;
    private final Context zzc;
    private final zzcda zzd;

    public zzesi(zzeul zzeulVar, zzfik zzfikVar, Context context, zzcda zzcdaVar) {
        this.zza = zzeulVar;
        this.zzb = zzfikVar;
        this.zzc = context;
        this.zzd = zzcdaVar;
    }

    private static final int zzd(WindowInsets windowInsets, int i2) {
        RoundedCorner roundedCorner = windowInsets.getRoundedCorner(i2);
        if (roundedCorner != null) {
            return roundedCorner.getRadius();
        }
        return 0;
    }

    private static final int zze(int i2, float f) {
        if (f == 0.0f) {
            return 0;
        }
        return (int) Math.ceil(i2 / f);
    }

    private static final Insets zzf(Insets insets, float f) {
        return f == 0.0f ? Insets.f4296e : Insets.b((int) Math.ceil(insets.f4297a / f), (int) Math.ceil(insets.f4298b / f), (int) Math.ceil(insets.f4299c / f), (int) Math.ceil(insets.d / f));
    }

    @Override // com.google.android.gms.internal.ads.zzezx
    public final ListenableFuture zza() {
        return zzgym.zzk(this.zza.zza(), new zzgpr() { // from class: com.google.android.gms.internal.ads.zzesh
            @Override // com.google.android.gms.internal.ads.zzgpr
            public final /* synthetic */ Object apply(Object obj) {
                return this.zza.zzc((zzfag) obj);
            }
        }, zzcdo.zzg);
    }

    @Override // com.google.android.gms.internal.ads.zzezx
    public final int zzb() {
        return 7;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r3v1 com.google.android.gms.internal.ads.zzesj, still in use, count: 4, list:
          (r3v1 com.google.android.gms.internal.ads.zzesj) from 0x02d9: MOVE (r20v0 com.google.android.gms.internal.ads.zzesj) = (r3v1 com.google.android.gms.internal.ads.zzesj) (LINE:730)
          (r3v1 com.google.android.gms.internal.ads.zzesj) from 0x01a9: MOVE (r20v3 com.google.android.gms.internal.ads.zzesj) = (r3v1 com.google.android.gms.internal.ads.zzesj) (LINE:426)
          (r3v1 com.google.android.gms.internal.ads.zzesj) from 0x01ce: MOVE (r20v5 com.google.android.gms.internal.ads.zzesj) = (r3v1 com.google.android.gms.internal.ads.zzesj) (LINE:463)
          (r3v1 com.google.android.gms.internal.ads.zzesj) from 0x0182: MOVE (r20v7 com.google.android.gms.internal.ads.zzesj) = (r3v1 com.google.android.gms.internal.ads.zzesj) (LINE:387)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
        	at jadx.core.utils.InsnRemover.addAndUnbind(InsnRemover.java:59)
        	at jadx.core.dex.visitors.ModVisitor.removeStep(ModVisitor.java:463)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:97)
        */
    public final /* synthetic */ com.google.android.gms.internal.ads.zzesj zzc(com.google.android.gms.internal.ads.zzfag r25) {
        /*
            Method dump skipped, instruction units count: 963
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzesi.zzc(com.google.android.gms.internal.ads.zzfag):com.google.android.gms.internal.ads.zzesj");
    }
}
