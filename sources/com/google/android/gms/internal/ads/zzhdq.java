package com.google.android.gms.internal.ads;

import com.thinkup.core.common.n.mo;
import java.security.GeneralSecurityException;
import javax.annotation.Nullable;

/* JADX INFO: loaded from: classes4.dex */
public final class zzhdq {

    @Nullable
    private zzhds zza;

    @Nullable
    private String zzb;

    @Nullable
    private zzhdr zzc;

    @Nullable
    private zzhbf zzd;

    private zzhdq() {
        throw null;
    }

    public final zzhdq zza(zzhds zzhdsVar) {
        this.zza = zzhdsVar;
        return this;
    }

    public final zzhdq zzb(String str) {
        this.zzb = str;
        return this;
    }

    public final zzhdq zzc(zzhdr zzhdrVar) {
        this.zzc = zzhdrVar;
        return this;
    }

    public final zzhdq zzd(zzhbf zzhbfVar) {
        this.zzd = zzhbfVar;
        return this;
    }

    public final zzhdt zze() throws GeneralSecurityException {
        if (this.zza == null) {
            this.zza = zzhds.zzb;
        }
        if (this.zzb == null) {
            throw new GeneralSecurityException("kekUri must be set");
        }
        zzhdr zzhdrVar = this.zzc;
        if (zzhdrVar == null) {
            throw new GeneralSecurityException("dekParsingStrategy must be set");
        }
        zzhbf zzhbfVar = this.zzd;
        if (zzhbfVar == null) {
            throw new GeneralSecurityException("dekParametersForNewKeys must be set");
        }
        if (zzhbfVar.zza()) {
            throw new GeneralSecurityException("dekParametersForNewKeys must not have ID Requirements");
        }
        if ((zzhdrVar.equals(zzhdr.zza) && (zzhbfVar instanceof zzhck)) || ((zzhdrVar.equals(zzhdr.zzc) && (zzhbfVar instanceof zzhcz)) || ((zzhdrVar.equals(zzhdr.zzb) && (zzhbfVar instanceof zzhev)) || ((zzhdrVar.equals(zzhdr.zzd) && (zzhbfVar instanceof zzhbt)) || ((zzhdrVar.equals(zzhdr.zze) && (zzhbfVar instanceof zzhcb)) || (zzhdrVar.equals(zzhdr.zzf) && (zzhbfVar instanceof zzhct))))))) {
            return new zzhdt(this.zza, this.zzb, this.zzc, this.zzd, null);
        }
        String string = this.zzc.toString();
        String strValueOf = String.valueOf(this.zzd);
        StringBuilder sb = new StringBuilder(strValueOf.length() + string.length() + 67 + 1);
        androidx.media3.extractor.text.ttml.a.C(sb, "Cannot use parsing strategy ", string, " when new keys are picked according to ", strValueOf);
        sb.append(mo.ono);
        throw new GeneralSecurityException(sb.toString());
    }

    public /* synthetic */ zzhdq(byte[] bArr) {
    }
}
