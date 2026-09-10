package com.google.android.gms.ads;

import android.os.Bundle;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.AbstractAdRequestBuilder;
import com.google.android.gms.ads.internal.client.zzeg;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.mediation.MediationExtrasReceiver;
import com.google.android.gms.ads.mediation.customevent.CustomEvent;
import java.util.List;
import k9.c0;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractAdRequestBuilder<T extends AbstractAdRequestBuilder<T>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zzeg f10616a;

    public AbstractAdRequestBuilder() {
        zzeg zzegVar = new zzeg();
        this.f10616a = zzegVar;
        zzegVar.zze(AdRequest.DEVICE_ID_EMULATOR);
    }

    @NonNull
    @Deprecated
    public T addCustomEventExtrasBundle(@NonNull Class<? extends CustomEvent> cls, @NonNull Bundle bundle) {
        this.f10616a.zzd(cls, bundle);
        return (T) self();
    }

    @NonNull
    public T addCustomTargeting(@NonNull String str, @NonNull String str2) {
        if (!TextUtils.isEmpty(str2) && str2.contains(",")) {
            StringBuilder sb2 = new StringBuilder(str2.length() + 108);
            sb2.append("Value ");
            sb2.append(str2);
            sb2.append(" contains invalid character ',' (comma). The server will parse it as a list of comma-separated values.");
            zzo.zzi(sb2.toString());
        }
        this.f10616a.zzl(str, str2);
        return (T) self();
    }

    @NonNull
    public T addKeyword(@NonNull String str) {
        this.f10616a.zza(str);
        return (T) self();
    }

    @NonNull
    public T addNetworkExtrasBundle(@NonNull Class<? extends MediationExtrasReceiver> cls, @NonNull Bundle bundle) {
        zzeg zzegVar = this.f10616a;
        zzegVar.zzc(cls, bundle);
        if (cls.equals(AdMobAdapter.class) && bundle.getBoolean("_emulatorLiveAds")) {
            zzegVar.zzf(AdRequest.DEVICE_ID_EMULATOR);
        }
        return (T) self();
    }

    public abstract AbstractAdRequestBuilder self();

    @NonNull
    public T setAdString(@NonNull String str) {
        this.f10616a.zzo(str);
        return (T) self();
    }

    @NonNull
    public T setContentUrl(@NonNull String str) {
        c0.i(str, "Content URL must be non-null.");
        c0.f(str, "Content URL must be non-empty.");
        int length = str.length();
        Object[] objArr = {512, Integer.valueOf(str.length())};
        if (!(length <= 512)) {
            throw new IllegalArgumentException(String.format("Content URL must not exceed %d in length.  Provided length was %d.", objArr));
        }
        this.f10616a.zzg(str);
        return (T) self();
    }

    @NonNull
    public T setHttpTimeoutMillis(int i10) {
        this.f10616a.zzp(i10);
        return (T) self();
    }

    @NonNull
    public T setNeighboringContentUrls(@NonNull List<String> list) {
        if (list == null) {
            zzo.zzi("neighboring content URLs list should not be null");
            return (T) self();
        }
        this.f10616a.zzh(list);
        return (T) self();
    }

    @NonNull
    public T setPlacementId(long j10) {
        this.f10616a.zzq(j10);
        return (T) self();
    }

    @NonNull
    public T setRequestAgent(@NonNull String str) {
        this.f10616a.zzj(str);
        return (T) self();
    }

    @NonNull
    public final AbstractAdRequestBuilder zza(@NonNull Bundle bundle) {
        this.f10616a.zzb(bundle);
        return self();
    }

    @NonNull
    @Deprecated
    public final AbstractAdRequestBuilder zzb(@NonNull String str) {
        this.f10616a.zze(str);
        return self();
    }

    @NonNull
    @Deprecated
    public final AbstractAdRequestBuilder zzc(boolean z10) {
        this.f10616a.zzk(z10);
        return self();
    }

    @NonNull
    @Deprecated
    public final AbstractAdRequestBuilder zzd(boolean z10) {
        this.f10616a.zzn(z10);
        return self();
    }

    @NonNull
    public T addCustomTargeting(@NonNull String str, @NonNull List<String> list) {
        if (list != null) {
            for (String str2 : list) {
                if (!TextUtils.isEmpty(str2) && str2.contains(",")) {
                    StringBuilder sb2 = new StringBuilder(str2.length() + 108);
                    sb2.append("Value ");
                    sb2.append(str2);
                    sb2.append(" contains invalid character ',' (comma). The server will parse it as a list of comma-separated values.");
                    zzo.zzi(sb2.toString());
                }
            }
            this.f10616a.zzl(str, TextUtils.join(",", list));
        }
        return (T) self();
    }
}
