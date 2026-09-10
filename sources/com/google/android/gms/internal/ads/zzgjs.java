package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Base64;
import java.util.Optional;

/* JADX INFO: loaded from: classes4.dex */
final class zzgjs {
    private Optional zza;
    private Optional zzb;

    public final boolean zza(zzbbo zzbboVar) {
        byte[] bArrZzy = zzbboVar.zza().zzb().zzb().zzy();
        byte[] bArrZzy2 = zzbboVar.zza().zzd().zzy();
        try {
            try {
                if (this.zza == null && this.zzb == null) {
                    try {
                        zzhtr.zza();
                        this.zza = Optional.of((zzhaq) zzhas.zza(new String(Base64.getDecoder().decode("eyJwcmltYXJ5S2V5SWQiOjMzMTUxOTk4MTksImtleSI6W3sia2V5RGF0YSI6eyJ0eXBlVXJsIjoidHlwZS5nb29nbGVhcGlzLmNvbS9nb29nbGUuY3J5cHRvLnRpbmsuRWNkc2FQdWJsaWNLZXkiLCJ2YWx1ZSI6IkVnWUlBeEFDR0FFYUlRQVNoRGZwOUM5QjcrMU1nMmJQbHJ5WExPOHVScDd6YWZJMldSYURmR1ZqVmlJaEFJNFZzTmVrcCs0bVY0d2toZlhVb3pQZWs5TjgxcUdIK2plNnhjOFpoQkhQIiwia2V5TWF0ZXJpYWxUeXBlIjoiQVNZTU1FVFJJQ19QVUJMSUMifSwic3RhdHVzIjoiRU5BQkxFRCIsImtleUlkIjozMzE1MTk5ODE5LCJvdXRwdXRQcmVmaXhUeXBlIjoiVElOSyJ9XX0="))).zzg(zzhkd.zzc(), zzhaq.class));
                        this.zzb = Optional.of((zzhaq) zzhas.zza(new String(Base64.getDecoder().decode("eyJwcmltYXJ5S2V5SWQiOjMwODI3ODA4ODgsImtleSI6W3sia2V5RGF0YSI6eyJ0eXBlVXJsIjoidHlwZS5nb29nbGVhcGlzLmNvbS9nb29nbGUuY3J5cHRvLnRpbmsuRWNkc2FQdWJsaWNLZXkiLCJ2YWx1ZSI6IkVnWUlBeEFDR0FFYUlRQkEyWW5HaWFpc3pEcGtJcWpjalorUTJ2alFUUldQZjhFcTlkZVlhNFpKa3lJaEFCQWFESTd6QWJkQXVpQmlnOWdHSkJ1VTUzSGg5Z0RCa0t2amswS2tabDhjIiwia2V5TWF0ZXJpYWxUeXBlIjoiQVNZTU1FVFJJQ19QVUJMSUMifSwic3RhdHVzIjoiRU5BQkxFRCIsImtleUlkIjozMDgyNzgwODg4LCJvdXRwdXRQcmVmaXhUeXBlIjoiVElOSyJ9XX0="))).zzg(zzhkd.zzc(), zzhaq.class));
                    } catch (Exception e2) {
                        throw new GeneralSecurityException("Failed to verify program", e2);
                    }
                }
                this.zza.isPresent();
                ((zzhaq) this.zza.get()).zza(bArrZzy, bArrZzy2);
                return true;
            } catch (GeneralSecurityException unused) {
                return false;
            }
        } catch (GeneralSecurityException unused2) {
            this.zzb.isPresent();
            ((zzhaq) this.zzb.get()).zza(bArrZzy, bArrZzy2);
            return true;
        }
    }
}
