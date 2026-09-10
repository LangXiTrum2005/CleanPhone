package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;

/* JADX INFO: loaded from: classes4.dex */
public class zzhq extends zzhc {
    public final int zzb;

    public zzhq(zzhf zzhfVar, int i2, int i3) {
        super(zzb(2008, 1));
        this.zzb = 1;
    }

    public static zzhq zza(IOException iOException, zzhf zzhfVar, int i2) {
        int i3;
        String message = iOException.getMessage();
        if (iOException instanceof SocketTimeoutException) {
            i3 = 2002;
        } else if (iOException instanceof InterruptedIOException) {
            i3 = 1004;
        } else {
            i3 = (message == null || !zzgpj.zza(message).matches("cleartext.*not permitted.*")) ? 2001 : 2007;
        }
        return i3 == 2007 ? new zzhp(iOException, zzhfVar) : new zzhq(iOException, zzhfVar, i3, i2);
    }

    private static int zzb(int i2, int i3) {
        if (i2 == 2000) {
            return i3 != 1 ? 2000 : 2001;
        }
        return i2;
    }

    public zzhq(IOException iOException, zzhf zzhfVar, int i2, int i3) {
        super(iOException, zzb(i2, i3));
        this.zzb = i3;
    }

    public zzhq(String str, zzhf zzhfVar, int i2, int i3) {
        super(str, zzb(i2, i3));
        this.zzb = i3;
    }

    public zzhq(String str, IOException iOException, zzhf zzhfVar, int i2, int i3) {
        super(str, iOException, zzb(i2, i3));
        this.zzb = i3;
    }
}
