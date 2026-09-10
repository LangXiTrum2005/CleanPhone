package com.google.android.gms.appset;

import androidx.annotation.NonNull;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public class AppSetIdInfo {
    public static final int SCOPE_APP = 1;
    public static final int SCOPE_DEVELOPER = 2;

    @NonNull
    private final String zza;
    private final int zzb;

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    @Retention(RetentionPolicy.SOURCE)
    public @interface Scope {
    }

    public AppSetIdInfo(@NonNull String str, int i10) {
        this.zza = str;
        this.zzb = i10;
    }

    @NonNull
    public String getId() {
        return this.zza;
    }

    public int getScope() {
        return this.zzb;
    }
}
