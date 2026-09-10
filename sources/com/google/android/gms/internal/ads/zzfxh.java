package com.google.android.gms.internal.ads;

import android.net.Network;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;

/* JADX INFO: loaded from: classes4.dex */
public final class zzfxh extends zzfwv {
    private zzgqs<Integer> zza;
    private zzgqs<Integer> zzb;
    private zzfwx zzc;
    private HttpURLConnection zzd;

    public zzfxh(zzgqs<Integer> zzgqsVar, zzgqs<Integer> zzgqsVar2, zzfwx zzfwxVar) {
        this.zza = zzgqsVar;
        this.zzb = zzgqsVar2;
        this.zzc = zzfwxVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Integer zzA() {
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Integer zzB() {
        return -1;
    }

    public static void zzi(HttpURLConnection httpURLConnection) {
        zzfww.zzb();
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        zzi(this.zzd);
    }

    public URLConnection zzf(final URL url, final int i2) throws IOException {
        this.zza = new zzgqs() { // from class: com.google.android.gms.internal.ads.zzfwz
            @Override // com.google.android.gms.internal.ads.zzgqs
            public final /* synthetic */ Object zza() {
                return Integer.valueOf(i2);
            }
        };
        this.zzc = new zzfwx() { // from class: com.google.android.gms.internal.ads.zzfxa
            @Override // com.google.android.gms.internal.ads.zzfwx
            public final /* synthetic */ URLConnection zza() {
                return url.openConnection();
            }
        };
        return zzj();
    }

    public HttpURLConnection zzg(final Network network, final URL url, final int i2, final int i3) throws IOException {
        this.zza = new zzgqs() { // from class: com.google.android.gms.internal.ads.zzfxb
            @Override // com.google.android.gms.internal.ads.zzgqs
            public final /* synthetic */ Object zza() {
                return Integer.valueOf(i2);
            }
        };
        this.zzb = new zzgqs() { // from class: com.google.android.gms.internal.ads.zzfxc
            @Override // com.google.android.gms.internal.ads.zzgqs
            public final /* synthetic */ Object zza() {
                return Integer.valueOf(i3);
            }
        };
        this.zzc = new zzfwx() { // from class: com.google.android.gms.internal.ads.zzfxd
            @Override // com.google.android.gms.internal.ads.zzfwx
            public final /* synthetic */ URLConnection zza() {
                return network.openConnection(url);
            }
        };
        return zzj();
    }

    public HttpURLConnection zzh(zzfwx zzfwxVar, final int i2, final int i3) throws IOException {
        this.zza = new zzgqs() { // from class: com.google.android.gms.internal.ads.zzfxe
            @Override // com.google.android.gms.internal.ads.zzgqs
            public final /* synthetic */ Object zza() {
                return Integer.valueOf(i2);
            }
        };
        this.zzb = new zzgqs() { // from class: com.google.android.gms.internal.ads.zzfxf
            @Override // com.google.android.gms.internal.ads.zzgqs
            public final /* synthetic */ Object zza() {
                return Integer.valueOf(i3);
            }
        };
        this.zzc = zzfwxVar;
        return zzj();
    }

    public HttpURLConnection zzj() throws IOException {
        zzfww.zza(((Integer) this.zza.zza()).intValue(), ((Integer) this.zzb.zza()).intValue());
        zzfwx zzfwxVar = this.zzc;
        zzfwxVar.getClass();
        HttpURLConnection httpURLConnection = (HttpURLConnection) zzfwxVar.zza();
        this.zzd = httpURLConnection;
        return httpURLConnection;
    }

    public zzfxh() {
        this(zzfxg.zza, zzfwy.zza, null);
    }
}
