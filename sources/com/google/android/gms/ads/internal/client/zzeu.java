package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.RemoteException;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.AdInspectorError;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.OnAdInspectorClosedListener;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.ads.initialization.AdapterStatus;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;
import com.google.android.gms.ads.preload.PreloadCallback;
import com.google.android.gms.ads.preload.PreloadConfiguration;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.ads.am;
import com.google.android.gms.internal.ads.dn;
import com.google.android.gms.internal.ads.qt;
import com.google.android.gms.internal.ads.tr;
import com.google.android.gms.internal.ads.vf;
import com.google.android.gms.internal.ads.zr;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import k9.c0;
import q4.a;
import s9.b;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class zzeu {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static zzeu f10846m;
    public static final Set zza = new HashSet(Arrays.asList(AdFormat.APP_OPEN_AD, AdFormat.INTERSTITIAL, AdFormat.REWARDED));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public zzem f10847a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public zzey f10848b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public zzel f10849c;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public zzcy f10856j;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f10850d = new Object();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f10851e = new Object();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f10853g = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f10854h = false;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Object f10855i = new Object();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public OnAdInspectorClosedListener f10857k = null;
    public RequestConfiguration l = new RequestConfiguration.Builder().build();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ArrayList f10852f = new ArrayList();

    public static vf a(List list) {
        HashMap map = new HashMap();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            tr trVar = (tr) it.next();
            map.put(trVar.f20463a, new zr(trVar.f20464b ? AdapterStatus.State.READY : AdapterStatus.State.NOT_READY, trVar.f20466d, trVar.f20465c));
        }
        return new vf(map, 8);
    }

    public static zzeu zzb() {
        zzeu zzeuVar;
        synchronized (zzeu.class) {
            try {
                if (f10846m == null) {
                    f10846m = new zzeu();
                }
                zzeuVar = f10846m;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return zzeuVar;
    }

    public final void b(Context context) {
        if (this.f10856j == null) {
            this.f10856j = (zzcy) new zzat(zzay.zzb(), context).zzd(context, false);
        }
    }

    public final void c() {
        zzcy zzcyVar = this.f10856j;
        if (zzcyVar == null) {
            return;
        }
        try {
            zzcyVar.zze();
            this.f10856j.zzj(null, new b(null));
        } catch (RemoteException e10) {
            com.google.android.gms.ads.internal.util.client.zzo.zzj("MobileAdsSettingManager initialization failed", e10);
        }
    }

    @Nullable
    public final com.google.android.gms.ads.preload.zzb zza(AdFormat adFormat) {
        int iOrdinal = adFormat.ordinal();
        if (iOrdinal == 1) {
            return this.f10847a;
        }
        if (iOrdinal == 2) {
            return this.f10848b;
        }
        if (iOrdinal != 5) {
            return null;
        }
        return this.f10849c;
    }

    /* JADX WARN: Code duplicated, block: B:50:0x00b2 A[Catch: all -> 0x004d, TryCatch #2 {all -> 0x004d, blocks: (B:25:0x0033, B:27:0x003a, B:32:0x0052, B:34:0x005b, B:45:0x007f, B:47:0x0090, B:49:0x00a2, B:56:0x00e5, B:57:0x00fa, B:50:0x00b2, B:52:0x00c0, B:54:0x00d2, B:55:0x00dd, B:36:0x0063, B:39:0x006a, B:42:0x0074, B:44:0x007a), top: B:65:0x0033, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:52:0x00c0 A[Catch: all -> 0x004d, TryCatch #2 {all -> 0x004d, blocks: (B:25:0x0033, B:27:0x003a, B:32:0x0052, B:34:0x005b, B:45:0x007f, B:47:0x0090, B:49:0x00a2, B:56:0x00e5, B:57:0x00fa, B:50:0x00b2, B:52:0x00c0, B:54:0x00d2, B:55:0x00dd, B:36:0x0063, B:39:0x006a, B:42:0x0074, B:44:0x007a), top: B:65:0x0033, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:54:0x00d2 A[Catch: all -> 0x004d, TryCatch #2 {all -> 0x004d, blocks: (B:25:0x0033, B:27:0x003a, B:32:0x0052, B:34:0x005b, B:45:0x007f, B:47:0x0090, B:49:0x00a2, B:56:0x00e5, B:57:0x00fa, B:50:0x00b2, B:52:0x00c0, B:54:0x00d2, B:55:0x00dd, B:36:0x0063, B:39:0x006a, B:42:0x0074, B:44:0x007a), top: B:65:0x0033, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:55:0x00dd A[Catch: all -> 0x004d, TryCatch #2 {all -> 0x004d, blocks: (B:25:0x0033, B:27:0x003a, B:32:0x0052, B:34:0x005b, B:45:0x007f, B:47:0x0090, B:49:0x00a2, B:56:0x00e5, B:57:0x00fa, B:50:0x00b2, B:52:0x00c0, B:54:0x00d2, B:55:0x00dd, B:36:0x0063, B:39:0x006a, B:42:0x0074, B:44:0x007a), top: B:65:0x0033, inners: #0 }] */
    public final void zzc(Context context, @Nullable String str, @Nullable OnInitializationCompleteListener onInitializationCompleteListener) {
        synchronized (this.f10850d) {
            try {
                if (this.f10853g) {
                    if (onInitializationCompleteListener != null) {
                        this.f10852f.add(onInitializationCompleteListener);
                    }
                    return;
                }
                if (this.f10854h) {
                    if (onInitializationCompleteListener != null) {
                        onInitializationCompleteListener.onInitializationComplete(zzl());
                    }
                    return;
                }
                this.f10853g = true;
                if (onInitializationCompleteListener != null) {
                    this.f10852f.add(onInitializationCompleteListener);
                }
                if (context == null) {
                    throw new IllegalArgumentException("Context cannot be null.");
                }
                synchronized (this.f10855i) {
                    try {
                        try {
                            b(context);
                            zzcy zzcyVar = this.f10856j;
                            if (zzcyVar != null) {
                                zzcyVar.zzp(new zzet(this));
                                this.f10856j.zzo(new qt());
                            }
                            if (this.l.getTagForChildDirectedTreatment() != -1 || this.l.getTagForUnderAgeOfConsent() != -1) {
                                RequestConfiguration requestConfiguration = this.l;
                                zzcy zzcyVar2 = this.f10856j;
                                if (zzcyVar2 != null) {
                                    try {
                                        zzcyVar2.zzr(new zzfr(requestConfiguration));
                                    } catch (RemoteException e10) {
                                        com.google.android.gms.ads.internal.util.client.zzo.zzg("Unable to set request configuration parcel.", e10);
                                    }
                                }
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    } catch (RemoteException e11) {
                        com.google.android.gms.ads.internal.util.client.zzo.zzj("MobileAdsSettingManager initialization failed", e11);
                    }
                    am.a(context);
                    if (((Boolean) dn.f13589a.o()).booleanValue()) {
                        if (((Boolean) zzba.zzc().a(am.Nc)).booleanValue()) {
                            com.google.android.gms.ads.internal.util.client.zzo.zzd("Initializing on bg thread");
                            com.google.android.gms.ads.internal.util.client.zzb.zza.execute(new Runnable() { // from class: com.google.android.gms.ads.internal.client.zzer
                                @Override // java.lang.Runnable
                                public final /* synthetic */ void run() {
                                    zzeu zzeuVar = this.f10844a;
                                    synchronized (zzeuVar.f10855i) {
                                        zzeuVar.c();
                                    }
                                }
                            });
                        } else if (((Boolean) dn.f13590b.o()).booleanValue()) {
                            if (((Boolean) zzba.zzc().a(am.Nc)).booleanValue()) {
                                com.google.android.gms.ads.internal.util.client.zzb.zzb.execute(new Runnable() { // from class: com.google.android.gms.ads.internal.client.zzep
                                    @Override // java.lang.Runnable
                                    public final /* synthetic */ void run() {
                                        zzeu zzeuVar = this.f10842a;
                                        synchronized (zzeuVar.f10855i) {
                                            zzeuVar.c();
                                        }
                                    }
                                });
                            } else {
                                com.google.android.gms.ads.internal.util.client.zzo.zzd("Initializing on calling thread");
                                c();
                            }
                        } else {
                            com.google.android.gms.ads.internal.util.client.zzo.zzd("Initializing on calling thread");
                            c();
                        }
                    } else if (((Boolean) dn.f13590b.o()).booleanValue()) {
                        if (((Boolean) zzba.zzc().a(am.Nc)).booleanValue()) {
                            com.google.android.gms.ads.internal.util.client.zzb.zzb.execute(new Runnable() { // from class: com.google.android.gms.ads.internal.client.zzep
                                @Override // java.lang.Runnable
                                public final /* synthetic */ void run() {
                                    zzeu zzeuVar = this.f10842a;
                                    synchronized (zzeuVar.f10855i) {
                                        zzeuVar.c();
                                    }
                                }
                            });
                        } else {
                            com.google.android.gms.ads.internal.util.client.zzo.zzd("Initializing on calling thread");
                            c();
                        }
                    } else {
                        com.google.android.gms.ads.internal.util.client.zzo.zzd("Initializing on calling thread");
                        c();
                    }
                    this.f10847a = new zzem(context);
                    this.f10848b = new zzey(context);
                    this.f10849c = new zzel(context);
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public final void zzd() {
        synchronized (this.f10850d) {
            this.f10854h = false;
            this.f10853g = false;
            this.f10852f.clear();
        }
        synchronized (this.f10855i) {
            try {
                zzcy zzcyVar = this.f10856j;
                if (zzcyVar != null) {
                    zzcyVar.zzw();
                }
            } catch (RemoteException e10) {
                com.google.android.gms.ads.internal.util.client.zzo.zzg("Unable to stop the SDK.", e10);
            }
            this.f10856j = null;
            zzem zzemVar = this.f10847a;
            if (zzemVar != null) {
                zzemVar.zzg();
                this.f10847a = null;
            }
            zzey zzeyVar = this.f10848b;
            if (zzeyVar != null) {
                zzeyVar.zzg();
                this.f10848b = null;
            }
            zzel zzelVar = this.f10849c;
            if (zzelVar != null) {
                zzelVar.zzg();
                this.f10849c = null;
            }
        }
    }

    public final Status zze(@NonNull Context context, @NonNull List list, @NonNull PreloadCallback preloadCallback) {
        Status status;
        boolean z10 = false;
        am.a(context);
        HashSet hashSet = new HashSet();
        HashMap map = new HashMap();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            PreloadConfiguration preloadConfiguration = (PreloadConfiguration) it.next();
            String strValueOf = String.valueOf(preloadConfiguration.getAdFormat());
            String adUnitId = preloadConfiguration.getAdUnitId();
            String strJ = a.j(new StringBuilder(strValueOf.length() + 1 + String.valueOf(adUnitId).length()), strValueOf, "#", adUnitId);
            map.put(strJ, Integer.valueOf(((Integer) com.google.android.gms.ads.internal.util.client.zzf.zzd(map, strJ, 0)).intValue() + 1));
        }
        Iterator it2 = map.entrySet().iterator();
        while (it2.hasNext()) {
            if (((Integer) ((Map.Entry) it2.next()).getValue()).intValue() > 1) {
                hashSet.add("Preload configurations include duplicated ad unit IDs and ad format combinations");
                z10 = true;
                break;
            }
        }
        HashMap map2 = new HashMap();
        Iterator it3 = list.iterator();
        while (it3.hasNext()) {
            PreloadConfiguration preloadConfiguration2 = (PreloadConfiguration) it3.next();
            AdFormat adFormat = preloadConfiguration2.getAdFormat();
            if (zza.contains(preloadConfiguration2.getAdFormat())) {
                map2.put(adFormat, Integer.valueOf(((Integer) com.google.android.gms.ads.internal.util.client.zzf.zzd(map2, adFormat, 0)).intValue() + 1));
                if (preloadConfiguration2.getBufferSize() > 15) {
                    Locale locale = Locale.US;
                    hashSet.add("Preload configurations' buffer size exceeds the maximum limit 15 for " + adFormat.name());
                } else if (preloadConfiguration2.getBufferSize() < 0) {
                    Locale locale2 = Locale.US;
                    hashSet.add("Preload configurations' buffer size less than 0 for " + adFormat.name());
                }
            } else {
                hashSet.add("PreloadConfiguration ad format is not supported:".concat(String.valueOf(preloadConfiguration2.getAdFormat())));
            }
            z10 = true;
        }
        EnumMap enumMap = new EnumMap(AdFormat.class);
        enumMap.put(AdFormat.APP_OPEN_AD, (Integer) zzba.zzc().a(am.D5));
        enumMap.put(AdFormat.INTERSTITIAL, (Integer) zzba.zzc().a(am.B5));
        enumMap.put(AdFormat.REWARDED, (Integer) zzba.zzc().a(am.C5));
        for (Map.Entry entry : map2.entrySet()) {
            AdFormat adFormat2 = (AdFormat) entry.getKey();
            int iIntValue = ((Integer) entry.getValue()).intValue();
            Integer num = (Integer) com.google.android.gms.ads.internal.util.client.zzf.zzd(enumMap, adFormat2, 0);
            if (iIntValue > num.intValue()) {
                Locale locale3 = Locale.US;
                hashSet.add("Preload configurations' size exceeds the maximum limit " + num + " for " + adFormat2.name());
                z10 = true;
            }
        }
        if (z10) {
            StringBuilder sb2 = new StringBuilder();
            Iterator it4 = hashSet.iterator();
            while (it4.hasNext()) {
                sb2.append((String) it4.next());
                if (it4.hasNext()) {
                    sb2.append(", ");
                }
            }
            String string = sb2.toString();
            com.google.android.gms.ads.internal.util.client.zzo.zzf(string);
            status = new Status(13, string, null, null);
        } else {
            status = Status.f11649e;
        }
        String str = status.f11655b;
        if (str == null) {
            str = "";
        }
        c0.a(str, status.b());
        synchronized (this.f10851e) {
            ArrayList arrayList = new ArrayList();
            Iterator it5 = list.iterator();
            while (it5.hasNext()) {
                arrayList.add(com.google.android.gms.ads.internal.util.client.zzf.zzv(context, (PreloadConfiguration) it5.next(), 1));
            }
            try {
                com.google.android.gms.ads.zzb.zza(context).zze(arrayList, new zzen(this, preloadCallback));
            } catch (RemoteException e10) {
                com.google.android.gms.ads.internal.util.client.zzo.zzg("Unable to start preload.", e10);
                return Status.f11651g;
            }
        }
        return Status.f11649e;
    }

    public final void zzf(float f10) {
        boolean z10 = true;
        c0.a("The app volume must be a value between 0 and 1 inclusive.", f10 >= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && f10 <= 1.0f);
        synchronized (this.f10855i) {
            if (this.f10856j == null) {
                z10 = false;
            }
            c0.j("MobileAds.initialize() must be called prior to setting the app volume.", z10);
            zzcy zzcyVar = this.f10856j;
            if (zzcyVar == null) {
                return;
            }
            try {
                zzcyVar.zzf(f10);
            } catch (RemoteException e10) {
                com.google.android.gms.ads.internal.util.client.zzo.zzg("Unable to set app volume.", e10);
            }
        }
    }

    public final float zzg() {
        synchronized (this.f10855i) {
            zzcy zzcyVar = this.f10856j;
            float fZzk = 1.0f;
            if (zzcyVar == null) {
                return 1.0f;
            }
            try {
                fZzk = zzcyVar.zzk();
            } catch (RemoteException e10) {
                com.google.android.gms.ads.internal.util.client.zzo.zzg("Unable to get app volume.", e10);
            }
            return fZzk;
        }
    }

    public final void zzh(boolean z10) {
        synchronized (this.f10855i) {
            c0.j("MobileAds.initialize() must be called prior to setting app muted state.", this.f10856j != null);
            zzcy zzcyVar = this.f10856j;
            if (zzcyVar == null) {
                return;
            }
            try {
                zzcyVar.zzh(z10);
            } catch (RemoteException e10) {
                com.google.android.gms.ads.internal.util.client.zzo.zzg("Unable to set app mute state.", e10);
            }
        }
    }

    public final boolean zzi() {
        synchronized (this.f10855i) {
            zzcy zzcyVar = this.f10856j;
            boolean zZzl = false;
            if (zzcyVar == null) {
                return false;
            }
            try {
                zZzl = zzcyVar.zzl();
            } catch (RemoteException e10) {
                com.google.android.gms.ads.internal.util.client.zzo.zzg("Unable to get app mute state.", e10);
            }
            return zZzl;
        }
    }

    public final void zzj(Context context, String str) {
        synchronized (this.f10855i) {
            c0.j("MobileAds.initialize() must be called prior to opening debug menu.", this.f10856j != null);
            zzcy zzcyVar = this.f10856j;
            if (zzcyVar == null) {
                return;
            }
            try {
                zzcyVar.zzi(new b(context), str);
            } catch (RemoteException e10) {
                com.google.android.gms.ads.internal.util.client.zzo.zzg("Unable to open debug menu.", e10);
            }
        }
    }

    public final void zzk(Class cls) {
        synchronized (this.f10855i) {
            zzcy zzcyVar = this.f10856j;
            if (zzcyVar == null) {
                return;
            }
            try {
                zzcyVar.zzn(cls.getCanonicalName());
            } catch (RemoteException e10) {
                com.google.android.gms.ads.internal.util.client.zzo.zzg("Unable to register RtbAdapter", e10);
            }
        }
    }

    public final InitializationStatus zzl() {
        synchronized (this.f10855i) {
            c0.j("MobileAds.initialize() must be called prior to getting initialization status.", this.f10856j != null);
            zzcy zzcyVar = this.f10856j;
            if (zzcyVar == null) {
                return new InitializationStatus() { // from class: com.google.android.gms.ads.internal.client.zzeq
                    @Override // com.google.android.gms.ads.initialization.InitializationStatus
                    public final Map getAdapterStatusMap() {
                        HashMap map = new HashMap();
                        Objects.requireNonNull(this.f10843a);
                        map.put("com.google.android.gms.ads.MobileAds", new zzeo());
                        return map;
                    }
                };
            }
            try {
                return a(zzcyVar.zzq());
            } catch (RemoteException unused) {
                com.google.android.gms.ads.internal.util.client.zzo.zzf("Unable to get Initialization status.");
                return new InitializationStatus() { // from class: com.google.android.gms.ads.internal.client.zzeq
                    @Override // com.google.android.gms.ads.initialization.InitializationStatus
                    public final Map getAdapterStatusMap() {
                        HashMap map = new HashMap();
                        Objects.requireNonNull(this.f10843a);
                        map.put("com.google.android.gms.ads.MobileAds", new zzeo());
                        return map;
                    }
                };
            }
        }
    }

    public final void zzm(Context context) {
        synchronized (this.f10855i) {
            b(context);
            zzcy zzcyVar = this.f10856j;
            if (zzcyVar == null) {
                return;
            }
            try {
                zzcyVar.zzs();
            } catch (RemoteException unused) {
                com.google.android.gms.ads.internal.util.client.zzo.zzf("Unable to disable mediation adapter initialization.");
            }
        }
    }

    public final void zzn(Context context, OnAdInspectorClosedListener onAdInspectorClosedListener) {
        synchronized (this.f10855i) {
            try {
                b(context);
                zzcy zzcyVar = this.f10856j;
                if (zzcyVar == null) {
                    return;
                }
                this.f10857k = onAdInspectorClosedListener;
                try {
                    zzcyVar.zzt(new zzes());
                } catch (RemoteException unused) {
                    com.google.android.gms.ads.internal.util.client.zzo.zzf("Unable to open the ad inspector.");
                    if (onAdInspectorClosedListener != null) {
                        onAdInspectorClosedListener.onAdInspectorClosed(new AdInspectorError(0, "Ad inspector had an internal error.", MobileAds.ERROR_DOMAIN));
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final String zzo() {
        synchronized (this.f10855i) {
            c0.j("MobileAds.initialize() must be called prior to getting version string.", this.f10856j != null);
            zzcy zzcyVar = this.f10856j;
            if (zzcyVar == null) {
                return "";
            }
            try {
                String strZzm = zzcyVar.zzm();
                if (strZzm == null) {
                    strZzm = "";
                }
                return strZzm;
            } catch (RemoteException e10) {
                com.google.android.gms.ads.internal.util.client.zzo.zzg("Unable to get internal version.", e10);
                return "";
            }
        }
    }

    @NonNull
    public final RequestConfiguration zzp() {
        return this.l;
    }

    public final void zzq(@NonNull RequestConfiguration requestConfiguration) {
        zzcy zzcyVar;
        c0.a("Null passed to setRequestConfiguration.", requestConfiguration != null);
        synchronized (this.f10855i) {
            try {
                RequestConfiguration requestConfiguration2 = this.l;
                this.l = requestConfiguration;
                if (this.f10856j == null) {
                    return;
                }
                if ((requestConfiguration2.getTagForChildDirectedTreatment() != requestConfiguration.getTagForChildDirectedTreatment() || requestConfiguration2.getTagForUnderAgeOfConsent() != requestConfiguration.getTagForUnderAgeOfConsent()) && (zzcyVar = this.f10856j) != null) {
                    try {
                        zzcyVar.zzr(new zzfr(requestConfiguration));
                    } catch (RemoteException e10) {
                        com.google.android.gms.ads.internal.util.client.zzo.zzg("Unable to set request configuration parcel.", e10);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final boolean zzr(boolean z10) {
        synchronized (this.f10855i) {
            c0.j("MobileAds.initialize() must be called prior to enable/disable the publisher first-party ID.", this.f10856j != null);
            zzcy zzcyVar = this.f10856j;
            if (zzcyVar == null) {
                return false;
            }
            try {
                zzcyVar.zzu(z10);
                return true;
            } catch (RemoteException e10) {
                String str = z10 ? com.ironsource.mediationsdk.metadata.a.f29613j : "disable";
                StringBuilder sb2 = new StringBuilder(str.length() + 40);
                sb2.append("Unable to ");
                sb2.append(str);
                sb2.append(" the publisher first-party ID.");
                com.google.android.gms.ads.internal.util.client.zzo.zzg(sb2.toString(), e10);
                return false;
            }
        }
    }

    public final void zzs(String str) {
        synchronized (this.f10855i) {
            c0.j("MobileAds.initialize() must be called prior to setting the plugin.", this.f10856j != null);
            zzcy zzcyVar = this.f10856j;
            if (zzcyVar == null) {
                return;
            }
            try {
                zzcyVar.zzv(str);
            } catch (RemoteException e10) {
                com.google.android.gms.ads.internal.util.client.zzo.zzg("Unable to set plugin.", e10);
            }
        }
    }
}
