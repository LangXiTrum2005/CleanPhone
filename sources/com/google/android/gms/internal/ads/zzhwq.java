package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Objects;
import javax.crypto.Mac;

/* JADX INFO: loaded from: classes4.dex */
final class zzhwq extends ThreadLocal {
    final /* synthetic */ zzhwr zza;

    public zzhwq(zzhwr zzhwrVar) {
        Objects.requireNonNull(zzhwrVar);
        this.zza = zzhwrVar;
    }

    @Override // java.lang.ThreadLocal
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final Mac initialValue() {
        try {
            zzhwc zzhwcVar = zzhwc.zzb;
            zzhwr zzhwrVar = this.zza;
            Mac mac = (Mac) zzhwcVar.zzb(zzhwrVar.zzb());
            mac.init(zzhwrVar.zzc());
            return mac;
        } catch (GeneralSecurityException e2) {
            throw new IllegalStateException(e2);
        }
    }
}
