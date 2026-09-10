package com.google.android.gms.measurement.internal;

import android.support.v4.media.a;
import com.startapp.simple.bloomfilter.parsing.TokenBuilder;
import java.util.Calendar;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes4.dex */
public final class zzba extends zzjf {
    private long zza;
    private String zzb;

    public zzba(zzic zzicVar) {
        super(zzicVar);
    }

    @Override // com.google.android.gms.measurement.internal.zzjf
    public final boolean zza() {
        Calendar calendar = Calendar.getInstance();
        this.zza = TimeUnit.MINUTES.convert(calendar.get(16) + calendar.get(15), TimeUnit.MILLISECONDS);
        Locale locale = Locale.getDefault();
        String language = locale.getLanguage();
        Locale locale2 = Locale.ENGLISH;
        String lowerCase = language.toLowerCase(locale2);
        String lowerCase2 = locale.getCountry().toLowerCase(locale2);
        this.zzb = a.s(new StringBuilder(String.valueOf(lowerCase).length() + 1 + String.valueOf(lowerCase2).length()), lowerCase, TokenBuilder.TOKEN_DELIMITER, lowerCase2);
        return false;
    }

    public final long zzb() {
        zzw();
        return this.zza;
    }

    public final String zzc() {
        zzw();
        return this.zzb;
    }
}
