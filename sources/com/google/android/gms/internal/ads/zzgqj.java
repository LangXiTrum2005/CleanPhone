package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.Objects;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes4.dex */
final class zzgqj implements Iterable {
    final /* synthetic */ CharSequence zza;
    final /* synthetic */ zzgqp zzb;

    public zzgqj(zzgqp zzgqpVar, CharSequence charSequence) {
        this.zza = charSequence;
        Objects.requireNonNull(zzgqpVar);
        this.zzb = zzgqpVar;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return this.zzb.zzf(this.zza);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(AbstractJsonLexerKt.BEGIN_LIST);
        zzgpu.zzb(sb, this, ", ");
        sb.append(AbstractJsonLexerKt.END_LIST);
        return sb.toString();
    }
}
