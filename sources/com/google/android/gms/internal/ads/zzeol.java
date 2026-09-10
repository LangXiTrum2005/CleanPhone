package com.google.android.gms.internal.ads;

import android.view.View;
import java.util.Collections;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
final class zzeol extends zzctj {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzeol(zzeop zzeopVar, View view, zzcir zzcirVar, zzcvi zzcviVar, zzfhs zzfhsVar) {
        super(view, null, zzcviVar, zzfhsVar);
        Objects.requireNonNull(zzeopVar);
    }

    @Override // com.google.android.gms.internal.ads.zzctj
    public final zzdbw zze(Set set) {
        return new zzdbw(Collections.EMPTY_SET);
    }
}
