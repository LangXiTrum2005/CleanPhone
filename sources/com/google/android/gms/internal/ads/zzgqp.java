package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes4.dex */
public final class zzgqp {
    private final zzgqo zza;

    private zzgqp(zzgqo zzgqoVar) {
        int i2 = zzgpn.zzb;
        this.zza = zzgqoVar;
    }

    public static zzgqp zza(final zzgpo zzgpoVar) {
        return new zzgqp(new zzgqo() { // from class: com.google.android.gms.internal.ads.zzgqm
            @Override // com.google.android.gms.internal.ads.zzgqo
            public final /* synthetic */ Iterator zza(zzgqp zzgqpVar, CharSequence charSequence) {
                return new zzgqg(zzgqpVar, charSequence, zzgpoVar);
            }
        });
    }

    public static zzgqp zzb(Pattern pattern) {
        final zzgpt zzgptVar = new zzgpt(pattern);
        zzgqa.zzf(!((zzgps) zzgptVar.zza("")).zza.matches(), "The pattern may not match the empty string: %s", zzgptVar);
        return new zzgqp(new zzgqo() { // from class: com.google.android.gms.internal.ads.zzgqk
            @Override // com.google.android.gms.internal.ads.zzgqo
            public final /* synthetic */ Iterator zza(zzgqp zzgqpVar, CharSequence charSequence) {
                return new zzgqh(zzgqpVar, charSequence, zzgptVar.zza(charSequence));
            }
        });
    }

    public static zzgqp zzc(int i2) {
        final int i3 = 4000;
        return new zzgqp(new zzgqo(i3) { // from class: com.google.android.gms.internal.ads.zzgql
            @Override // com.google.android.gms.internal.ads.zzgqo
            public final /* synthetic */ Iterator zza(zzgqp zzgqpVar, CharSequence charSequence) {
                return new zzgqi(zzgqpVar, charSequence, 4000);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: zzg, reason: merged with bridge method [inline-methods] */
    public final Iterator zzf(CharSequence charSequence) {
        return this.zza.zza(this, charSequence);
    }

    public final Iterable zzd(CharSequence charSequence) {
        charSequence.getClass();
        return new zzgqj(this, charSequence);
    }

    public final List zze(CharSequence charSequence) {
        charSequence.getClass();
        Iterator itZzf = zzf(charSequence);
        ArrayList arrayList = new ArrayList();
        while (itZzf.hasNext()) {
            arrayList.add((String) itZzf.next());
        }
        return Collections.unmodifiableList(arrayList);
    }
}
