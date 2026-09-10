package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: loaded from: classes4.dex */
public final class zzayp extends zzayo {
    private zzayp(Context context, zzayn zzaynVar) {
        super(context, zzaynVar);
    }

    public static zzayp zzt(Context context, zzauu zzauuVar) {
        zzayn zzaynVar = new zzayn(zzauuVar);
        zzayo.zzo(context, zzaynVar);
        return new zzayp(context, zzaynVar);
    }
}
