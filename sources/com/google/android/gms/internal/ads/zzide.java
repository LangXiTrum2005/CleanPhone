package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
public final class zzide extends RuntimeException {
    public zzide(zzicc zziccVar) {
        super("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
    }

    public final zzibg zza() {
        return new zzibg(getMessage());
    }
}
