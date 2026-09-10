package com.google.android.gms.internal.ads;

import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
public class zzibg extends IOException {
    private boolean zza;

    public zzibg(IOException iOException) {
        super(iOException.getMessage(), iOException);
    }

    public final void zza() {
        this.zza = true;
    }

    public final boolean zzb() {
        return this.zza;
    }

    public zzibg(String str) {
        super(str);
    }

    public zzibg(String str, IOException iOException) {
        super("Unable to parse map entry.", iOException);
    }
}
