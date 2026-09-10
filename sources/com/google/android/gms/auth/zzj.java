package com.google.android.gms.auth;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.internal.auth.zzby;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
final class zzj implements zzk {
    final /* synthetic */ String zza;

    public zzj(String str) {
        this.zza = str;
    }

    @Override // com.google.android.gms.auth.zzk
    public final /* bridge */ /* synthetic */ Object zza(IBinder iBinder) throws RemoteException, IOException, GoogleAuthException {
        Bundle bundleZzg = com.google.android.gms.internal.auth.zze.zzb(iBinder).zzg(this.zza);
        zzl.zzd(bundleZzg);
        String string = bundleZzg.getString("Error");
        Intent intent = (Intent) bundleZzg.getParcelable("userRecoveryIntent");
        zzby zzbyVarZza = zzby.zza(string);
        if (zzby.SUCCESS.equals(zzbyVarZza)) {
            return Boolean.TRUE;
        }
        if (!zzby.zzb(zzbyVarZza)) {
            throw new GoogleAuthException(string);
        }
        zzl.zzd.w("isUserRecoverableError status: ".concat(String.valueOf(zzbyVarZza)), new Object[0]);
        throw new UserRecoverableAuthException(string, intent);
    }
}
