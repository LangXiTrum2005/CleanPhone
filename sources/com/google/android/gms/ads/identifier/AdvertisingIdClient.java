package com.google.android.gms.ads.identifier;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.applovin.impl.ca;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.ironsource.X3;
import com.unity3d.services.UnityAdsConstants;
import i9.a;
import i9.e;
import i9.f;
import i9.g;
import java.io.IOException;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
import k9.c0;
import u9.b;
import u9.c;
import u9.d;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public class AdvertisingIdClient {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f10709a = 0;
    private static final Object zzg = new Object();
    private static volatile AdvertisingIdClient zzh;

    @Nullable
    a zza;

    @Nullable
    d zzb;
    boolean zzc;
    final Object zzd;

    @Nullable
    zzb zze;
    final long zzf;
    private final Context zzi;

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static final class Info {

        @Nullable
        private final String zza;
        private final boolean zzb;

        @Deprecated
        public Info(@Nullable String str, boolean z10) {
            this.zza = str;
            this.zzb = z10;
        }

        @Nullable
        public String getId() {
            return this.zza;
        }

        public boolean isLimitAdTrackingEnabled() {
            return this.zzb;
        }

        @NonNull
        public String toString() {
            return "{" + this.zza + "}" + this.zzb;
        }
    }

    public AdvertisingIdClient(@NonNull Context context) {
        this(context, 30000L, false, false);
    }

    /* JADX WARN: Code duplicated, block: B:41:0x0097  */
    /* JADX WARN: Code duplicated, block: B:43:0x009b  */
    /* JADX WARN: Code duplicated, block: B:45:0x009f  */
    /* JADX WARN: Code duplicated, block: B:47:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:49:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:50:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:51:0x00ae  */
    @NonNull
    public static Info getAdvertisingIdInfo(@NonNull Context context) throws Throwable {
        Context context2;
        AdvertisingIdClient advertisingIdClient;
        zzd zzdVar;
        Throwable th2;
        AdvertisingIdClient advertisingIdClient2 = zzh;
        if (advertisingIdClient2 == null) {
            synchronized (zzg) {
                try {
                    advertisingIdClient2 = zzh;
                    if (advertisingIdClient2 == null) {
                        Log.d("AdvertisingIdClient", "Creating AdvertisingIdClient");
                        context2 = context;
                        advertisingIdClient2 = new AdvertisingIdClient(context2);
                        zzh = advertisingIdClient2;
                    } else {
                        context2 = context;
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        } else {
            context2 = context;
        }
        Log.d("AdvertisingIdClient", "AdvertisingIdClient already created.");
        zzd zzdVarZza = zzd.zza(context2);
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        int i10 = -1;
        try {
            Info infoZzf = advertisingIdClient2.zzf(-1);
            long jElapsedRealtime2 = SystemClock.elapsedRealtime() - jElapsedRealtime;
            advertisingIdClient = advertisingIdClient2;
            try {
                advertisingIdClient.zze(infoZzf, true, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, jElapsedRealtime2, "", null);
                try {
                    try {
                        zzdVarZza.zzc(35401, 0, jElapsedRealtime, System.currentTimeMillis(), (int) (SystemClock.elapsedRealtime() - jElapsedRealtime));
                        zzdVar = zzdVarZza;
                        jElapsedRealtime = jElapsedRealtime;
                        try {
                            Log.i("AdvertisingIdClient", "GetInfoInternal elapse " + jElapsedRealtime2 + "ms");
                            return infoZzf;
                        } catch (Throwable th4) {
                            th = th4;
                            th2 = th;
                            advertisingIdClient.zze(null, true, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, -1L, "", th2);
                            if (th2 instanceof IOException) {
                                i10 = 1;
                            } else if (th2 instanceof f) {
                                i10 = 9;
                            } else if (th2 instanceof g) {
                                i10 = 16;
                            } else if (th2 instanceof IllegalStateException) {
                                i10 = 8;
                            }
                            long j10 = jElapsedRealtime;
                            zzdVar.zzc(35401, i10, j10, System.currentTimeMillis(), (int) (SystemClock.elapsedRealtime() - j10));
                            throw th2;
                        }
                    } catch (Throwable th5) {
                        th = th5;
                        zzdVar = zzdVarZza;
                        jElapsedRealtime = jElapsedRealtime;
                        th2 = th;
                        advertisingIdClient.zze(null, true, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, -1L, "", th2);
                        if (th2 instanceof IOException) {
                            i10 = 1;
                        } else if (th2 instanceof f) {
                            i10 = 9;
                        } else if (th2 instanceof g) {
                            i10 = 16;
                        } else if (th2 instanceof IllegalStateException) {
                            i10 = 8;
                        }
                        long j11 = jElapsedRealtime;
                        zzdVar.zzc(35401, i10, j11, System.currentTimeMillis(), (int) (SystemClock.elapsedRealtime() - j11));
                        throw th2;
                    }
                } catch (Throwable th6) {
                    th = th6;
                    zzdVar = zzdVarZza;
                }
            } catch (Throwable th7) {
                th = th7;
                zzdVar = zzdVarZza;
                th2 = th;
                advertisingIdClient.zze(null, true, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, -1L, "", th2);
                if (th2 instanceof IOException) {
                    i10 = 1;
                } else if (th2 instanceof f) {
                    i10 = 9;
                } else if (th2 instanceof g) {
                    i10 = 16;
                } else if (th2 instanceof IllegalStateException) {
                    i10 = 8;
                }
                long j12 = jElapsedRealtime;
                zzdVar.zzc(35401, i10, j12, System.currentTimeMillis(), (int) (SystemClock.elapsedRealtime() - j12));
                throw th2;
            }
        } catch (Throwable th8) {
            th = th8;
            advertisingIdClient = advertisingIdClient2;
        }
    }

    public static boolean getIsAdIdFakeForDebugLogging(@NonNull Context context) throws f, g, IOException {
        boolean z10;
        AdvertisingIdClient advertisingIdClient = new AdvertisingIdClient(context, -1L, false, false);
        try {
            advertisingIdClient.zzc(false);
            c0.g("Calling this from your main thread can lead to deadlock");
            synchronized (advertisingIdClient) {
                advertisingIdClient.zzd();
                c0.h(advertisingIdClient.zza);
                c0.h(advertisingIdClient.zzb);
                try {
                    b bVar = (b) advertisingIdClient.zzb;
                    bVar.getClass();
                    Parcel parcelObtain = Parcel.obtain();
                    parcelObtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                    Parcel parcelQ = bVar.q(parcelObtain, 6);
                    int i10 = u9.a.f51936a;
                    z10 = parcelQ.readInt() != 0;
                    parcelQ.recycle();
                } catch (RemoteException e10) {
                    Log.i("AdvertisingIdClient", "GMS remote exception ", e10);
                    throw new IOException("Remote exception", e10);
                }
            }
            advertisingIdClient.zzb();
            advertisingIdClient.zza();
            return z10;
        } catch (Throwable th2) {
            advertisingIdClient.zza();
            throw th2;
        }
    }

    private final Info zzf(int i10) throws IOException {
        Info info;
        c0.g("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            zzd();
            c0.h(this.zza);
            c0.h(this.zzb);
            try {
                b bVar = (b) this.zzb;
                bVar.getClass();
                Parcel parcelObtain = Parcel.obtain();
                parcelObtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                boolean z10 = true;
                Parcel parcelQ = bVar.q(parcelObtain, 1);
                String string = parcelQ.readString();
                parcelQ.recycle();
                b bVar2 = (b) this.zzb;
                bVar2.getClass();
                Parcel parcelObtain2 = Parcel.obtain();
                parcelObtain2.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                int i11 = u9.a.f51936a;
                parcelObtain2.writeInt(1);
                Parcel parcelQ2 = bVar2.q(parcelObtain2, 2);
                if (parcelQ2.readInt() == 0) {
                    z10 = false;
                }
                parcelQ2.recycle();
                info = new Info(string, z10);
            } catch (RemoteException e10) {
                Log.i("AdvertisingIdClient", "GMS remote exception ", e10);
                throw new IOException("Remote exception", e10);
            }
        }
        zzb();
        return info;
    }

    public final void finalize() throws Throwable {
        zza();
        super.finalize();
    }

    @NonNull
    public Info getInfo() throws IOException {
        return zzf(-1);
    }

    public void start() throws IllegalStateException, f, g, IOException {
        zzc(true);
    }

    public final void zza() {
        c0.g("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            try {
                if (this.zzi == null || this.zza == null) {
                    return;
                }
                try {
                    if (this.zzc) {
                        o9.a.b().c(this.zzi, this.zza);
                    }
                } catch (Throwable th2) {
                    Log.i("AdvertisingIdClient", "AdvertisingIdClient unbindService failed.", th2);
                }
                this.zzc = false;
                this.zzb = null;
                this.zza = null;
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public final void zzb() {
        synchronized (this.zzd) {
            zzb zzbVar = this.zze;
            if (zzbVar != null) {
                zzbVar.zza.countDown();
                try {
                    this.zze.join();
                } catch (InterruptedException unused) {
                }
            }
            long j10 = this.zzf;
            if (j10 > 0) {
                this.zze = new zzb(this, j10);
            }
        }
    }

    public final void zzc(boolean z10) throws IllegalStateException, f, g, IOException {
        c0.g("Calling this from your main thread can lead to deadlock");
        if (z10) {
            zzb();
        }
        synchronized (this) {
            try {
                if (this.zzc) {
                    return;
                }
                Context context = this.zzi;
                try {
                    context.getPackageManager().getPackageInfo("com.android.vending", 0);
                    int iC = e.f42929b.c(context, 12451000);
                    if (iC != 0 && iC != 2) {
                        throw new IOException("Google Play services not available");
                    }
                    a aVar = new a();
                    Intent intent = new Intent("com.google.android.gms.ads.identifier.service.START");
                    intent.setPackage("com.google.android.gms");
                    try {
                        if (!o9.a.b().a(context, intent, aVar, 1)) {
                            throw new IOException("Connection failure");
                        }
                        this.zza = aVar;
                        try {
                            try {
                                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                                IBinder iBinderB = aVar.b();
                                int i10 = c.f51938a;
                                IInterface iInterfaceQueryLocalInterface = iBinderB.queryLocalInterface("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                                this.zzb = iInterfaceQueryLocalInterface instanceof d ? (d) iInterfaceQueryLocalInterface : new b(iBinderB);
                                this.zzc = true;
                            } catch (InterruptedException unused) {
                                throw new IOException("Interrupted exception");
                            }
                        } catch (Throwable th2) {
                            throw new IOException(th2);
                        }
                    } catch (Throwable th3) {
                        throw new IOException(th3);
                    }
                } catch (PackageManager.NameNotFoundException unused2) {
                    throw new f();
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }

    public final synchronized void zzd() throws IOException {
        try {
            if (!this.zzc) {
                try {
                    Log.d("AdvertisingIdClient", "AdvertisingIdClient is not bounded. Starting to bind it...");
                    zzc(false);
                    Log.d("AdvertisingIdClient", "AdvertisingIdClient is bounded");
                    if (!this.zzc) {
                        throw new IOException("AdvertisingIdClient cannot reconnect.");
                    }
                } catch (Exception e10) {
                    throw new IOException("AdvertisingIdClient cannot reconnect.", e10);
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final boolean zze(@Nullable Info info, boolean z10, float f10, long j10, String str, @Nullable Throwable th2) {
        if (Math.random() > 0.0d) {
            return false;
        }
        HashMap mapN = ca.n(X3.i.L0, "1");
        if (info != null) {
            mapN.put("limit_ad_tracking", true != info.isLimitAdTrackingEnabled() ? "0" : "1");
            String id2 = info.getId();
            if (id2 != null) {
                mapN.put("ad_id_size", Integer.toString(id2.length()));
            }
        }
        if (th2 != null) {
            mapN.put("error", th2.getClass().getName());
        }
        mapN.put(ViewHierarchyConstants.TAG_KEY, "AdvertisingIdClient");
        mapN.put("time_spent", Long.toString(j10));
        new zza(this, mapN).start();
        return true;
    }

    public AdvertisingIdClient(@NonNull Context context, long j10, boolean z10, boolean z11) {
        this.zzd = new Object();
        c0.h(context);
        this.zzi = context.getApplicationContext();
        this.zzc = false;
        this.zzf = j10;
    }

    public static void setShouldSkipGmsCoreVersionCheck(boolean z10) {
    }
}
