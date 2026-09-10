package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.internal.client.zzbu;
import com.google.android.gms.ads.internal.client.zzcg;
import com.google.android.gms.ads.internal.client.zzfp;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zze;
import java.util.HashMap;
import java.util.Map;
import java.util.Queue;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class yx0 extends zzcg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zx0 f22393a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final sx0 f22394b;

    public yx0(zx0 zx0Var, sx0 sx0Var) {
        this.f22393a = zx0Var;
        this.f22394b = sx0Var;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x003b A[Catch: all -> 0x0033, TRY_LEAVE, TryCatch #1 {all -> 0x0033, blocks: (B:4:0x0003, B:33:0x0089, B:34:0x0098, B:36:0x009e, B:39:0x00b6, B:41:0x00ba, B:42:0x00c1, B:43:0x00ca, B:45:0x00da, B:46:0x00db, B:51:0x0113, B:52:0x0114, B:7:0x000e, B:9:0x0012, B:21:0x0032, B:24:0x0037, B:26:0x003b, B:32:0x007d, B:28:0x0053, B:31:0x005f, B:44:0x00cb, B:10:0x0013, B:12:0x0017, B:18:0x002f, B:17:0x0028), top: B:59:0x0003, inners: #0, #2, #4 }] */
    /* JADX WARN: Code duplicated, block: B:36:0x009e A[Catch: all -> 0x0033, TryCatch #1 {all -> 0x0033, blocks: (B:4:0x0003, B:33:0x0089, B:34:0x0098, B:36:0x009e, B:39:0x00b6, B:41:0x00ba, B:42:0x00c1, B:43:0x00ca, B:45:0x00da, B:46:0x00db, B:51:0x0113, B:52:0x0114, B:7:0x000e, B:9:0x0012, B:21:0x0032, B:24:0x0037, B:26:0x003b, B:32:0x007d, B:28:0x0053, B:31:0x005f, B:44:0x00cb, B:10:0x0013, B:12:0x0017, B:18:0x002f, B:17:0x0028), top: B:59:0x0003, inners: #0, #2, #4 }] */
    /* JADX WARN: Code duplicated, block: B:64:0x0053 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00db, code lost:
    
        r0.put(r4, java.lang.Integer.valueOf(((java.lang.Integer) com.google.android.gms.ads.internal.util.client.zzf.zzd(r0, r4, 0)).intValue() + 1));
        r6 = new com.google.android.gms.internal.ads.by0(new com.google.android.gms.internal.ads.ay0(r3, r4));
        r3 = r2.zzd;
        ((p9.b) r10.f22749h).getClass();
        r2.h(r3, java.lang.System.currentTimeMillis(), r6, "1");
     */
    @Override // com.google.android.gms.ads.internal.client.zzch
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zze(java.util.List r11, com.google.android.gms.ads.internal.client.zzcb r12) {
        /*
            Method dump skipped, instruction units count: 296
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.yx0.zze(java.util.List, com.google.android.gms.ads.internal.client.zzcb):void");
    }

    @Override // com.google.android.gms.ads.internal.client.zzch
    public final boolean zzf(String str) {
        boolean zE;
        zx0 zx0Var = this.f22393a;
        synchronized (zx0Var) {
            zE = zx0Var.e(str, AdFormat.REWARDED);
        }
        return zE;
    }

    @Override // com.google.android.gms.ads.internal.client.zzch
    public final iy zzg(String str) {
        iy iyVar;
        zx0 zx0Var = this.f22393a;
        synchronized (zx0Var) {
            iyVar = (iy) zx0Var.f(AdFormat.REWARDED, iy.class, str);
        }
        return iyVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzch
    public final boolean zzh(String str) {
        boolean zE;
        zx0 zx0Var = this.f22393a;
        synchronized (zx0Var) {
            zE = zx0Var.e(str, AdFormat.APP_OPEN_AD);
        }
        return zE;
    }

    @Override // com.google.android.gms.ads.internal.client.zzch
    public final wi zzi(String str) {
        wi wiVar;
        zx0 zx0Var = this.f22393a;
        synchronized (zx0Var) {
            wiVar = (wi) zx0Var.f(AdFormat.APP_OPEN_AD, wi.class, str);
        }
        return wiVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzch
    public final boolean zzj(String str) {
        boolean zE;
        zx0 zx0Var = this.f22393a;
        synchronized (zx0Var) {
            zE = zx0Var.e(str, AdFormat.INTERSTITIAL);
        }
        return zE;
    }

    @Override // com.google.android.gms.ads.internal.client.zzch
    public final zzbu zzk(String str) {
        zzbu zzbuVar;
        zx0 zx0Var = this.f22393a;
        synchronized (zx0Var) {
            zzbuVar = (zzbu) zx0Var.f(AdFormat.INTERSTITIAL, zzbu.class, str);
        }
        return zzbuVar;
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x0206 */
    /* JADX WARN: Code duplicated, block: B:64:0x00f8  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v10 */
    /* JADX WARN: Type inference failed for: r15v11 */
    /* JADX WARN: Type inference failed for: r15v2 */
    /* JADX WARN: Type inference failed for: r15v3 */
    /* JADX WARN: Type inference failed for: r15v4, types: [java.util.HashMap] */
    /* JADX WARN: Type inference failed for: r15v6 */
    /* JADX WARN: Type inference failed for: r15v7 */
    /* JADX WARN: Type inference failed for: r15v8 */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.util.HashMap] */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v25 */
    /* JADX WARN: Type inference failed for: r3v26 */
    /* JADX WARN: Type inference failed for: r3v9 */
    @Override // com.google.android.gms.ads.internal.client.zzch
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean zzm(java.lang.String r18, com.google.android.gms.ads.internal.client.zzfp r19, com.google.android.gms.ads.internal.client.zzce r20) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 520
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.yx0.zzm(java.lang.String, com.google.android.gms.ads.internal.client.zzfp, com.google.android.gms.ads.internal.client.zzce):boolean");
    }

    @Override // com.google.android.gms.ads.internal.client.zzch
    public final boolean zzn(int i10, String str) {
        by0 by0Var;
        AdFormat adFormat = AdFormat.getAdFormat(i10);
        if (adFormat == null) {
            return false;
        }
        sx0 sx0Var = this.f22394b;
        ((p9.b) sx0Var.f20067g).getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        HashMap map = sx0Var.f20061a;
        synchronized (map) {
            try {
                if (!map.containsKey(adFormat)) {
                    return false;
                }
                ux0 ux0Var = (ux0) ((Map) map.get(adFormat)).get(str);
                String strO = ux0Var == null ? null : ux0Var.o();
                boolean z10 = strO != null && adFormat.equals(ux0Var.q());
                Long lValueOf = z10 ? Long.valueOf(System.currentTimeMillis()) : null;
                if (ux0Var == null) {
                    by0Var = null;
                } else {
                    ay0 ay0Var = new ay0(ux0Var.r(), adFormat);
                    ay0Var.f12538c = str;
                    by0Var = new by0(ay0Var);
                }
                sx0Var.f20063c.n(ux0Var == null ? 0 : ux0Var.s(), ux0Var != null ? ux0Var.t() : 0, jCurrentTimeMillis, lValueOf, strO, by0Var, "2");
                return z10;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzch
    public final zzbu zzo(String str) {
        return (zzbu) this.f22394b.b(AdFormat.INTERSTITIAL, zzbu.class, str);
    }

    @Override // com.google.android.gms.ads.internal.client.zzch
    public final wi zzp(String str) {
        return (wi) this.f22394b.b(AdFormat.APP_OPEN_AD, wi.class, str);
    }

    @Override // com.google.android.gms.ads.internal.client.zzch
    public final iy zzq(String str) {
        return (iy) this.f22394b.b(AdFormat.REWARDED, iy.class, str);
    }

    @Override // com.google.android.gms.ads.internal.client.zzch
    public final zzfp zzr(int i10, String str) {
        AdFormat adFormat = AdFormat.getAdFormat(i10);
        if (adFormat != null) {
            sx0 sx0Var = this.f22394b;
            HashMap map = sx0Var.f20061a;
            synchronized (map) {
                try {
                    if (!map.containsKey(adFormat)) {
                        return null;
                    }
                    ux0 ux0Var = (ux0) ((Map) map.get(adFormat)).get(str);
                    uo0 uo0Var = sx0Var.f20063c;
                    ((p9.b) sx0Var.f20067g).getClass();
                    uo0Var.q("pgc", System.currentTimeMillis(), str, ux0Var == null ? null : ux0Var.r(), adFormat, ux0Var == null ? -1 : ux0Var.s(), ux0Var != null ? ux0Var.t() : -1, 1);
                    if (ux0Var != null) {
                        return (zzfp) ux0Var.f20926e.get();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzch
    public final Bundle zzs(int i10) {
        sx0 sx0Var = this.f22394b;
        sx0Var.getClass();
        HashMap map = new HashMap();
        HashMap map2 = sx0Var.f20061a;
        AdFormat adFormat = AdFormat.getAdFormat(i10);
        synchronized (map2) {
            if (adFormat != null) {
                try {
                    if (map2.containsKey(adFormat)) {
                        for (ux0 ux0Var : ((Map) map2.get(adFormat)).values()) {
                            map.put(ux0Var.l, (zzfp) ux0Var.f20926e.get());
                        }
                        uo0 uo0Var = sx0Var.f20063c;
                        ((p9.b) sx0Var.f20067g).getClass();
                        uo0Var.q("pgcs", System.currentTimeMillis(), null, null, adFormat, -1, -1, map.size());
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        Bundle bundle = new Bundle();
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            zzfp zzfpVar = (zzfp) entry.getValue();
            Parcel parcelObtain = Parcel.obtain();
            zzfpVar.writeToParcel(parcelObtain, 0);
            byte[] bArrMarshall = parcelObtain.marshall();
            parcelObtain.recycle();
            bundle.putByteArray(str, bArrMarshall);
        }
        return bundle;
    }

    @Override // com.google.android.gms.ads.internal.client.zzch
    public final int zzt(int i10, String str) {
        AdFormat adFormat = AdFormat.getAdFormat(i10);
        if (adFormat == null) {
            return 0;
        }
        sx0 sx0Var = this.f22394b;
        HashMap map = sx0Var.f20061a;
        synchronized (map) {
            try {
                if (!map.containsKey(adFormat)) {
                    return 0;
                }
                ux0 ux0Var = (ux0) ((Map) map.get(adFormat)).get(str);
                int iT = ux0Var != null ? ux0Var.t() : 0;
                uo0 uo0Var = sx0Var.f20063c;
                ((p9.b) sx0Var.f20067g).getClass();
                uo0Var.q("pnav", System.currentTimeMillis(), str, ux0Var == null ? null : ux0Var.r(), adFormat, ux0Var == null ? -1 : ux0Var.s(), iT, 1);
                return iT;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzch
    public final boolean zzu(int i10, String str) {
        AdFormat adFormat = AdFormat.getAdFormat(i10);
        if (adFormat == null) {
            return false;
        }
        sx0 sx0Var = this.f22394b;
        HashMap map = sx0Var.f20061a;
        synchronized (map) {
            try {
                if (!map.containsKey(adFormat)) {
                    return false;
                }
                ux0 ux0Var = (ux0) ((Map) map.get(adFormat)).remove(str);
                if (ux0Var == null) {
                    return false;
                }
                ux0Var.f20928g.set(false);
                ux0Var.f20936p.set(false);
                qx0 qx0Var = sx0Var.f20069i;
                if (qx0Var != null) {
                    qx0Var.d(ux0Var);
                }
                int iT = ux0Var.t();
                Queue queue = ux0Var.f20931j;
                synchronized (queue) {
                    queue.clear();
                }
                uo0 uo0Var = sx0Var.f20063c;
                ((p9.b) sx0Var.f20067g).getClass();
                uo0Var.q("pd", System.currentTimeMillis(), str, ux0Var.r(), adFormat, ux0Var.s(), iT, 1);
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzch
    public final void zzv(int i10) {
        sx0 sx0Var = this.f22394b;
        sx0Var.getClass();
        AdFormat adFormat = AdFormat.getAdFormat(i10);
        if (adFormat == null) {
            return;
        }
        HashMap map = sx0Var.f20061a;
        synchronized (map) {
            try {
                if (map.containsKey(adFormat)) {
                    Map map2 = (Map) map.get(adFormat);
                    int size = map2.size();
                    if (size == 0) {
                        return;
                    }
                    ca1 ca1VarY = ca1.y(map2.values());
                    map2.clear();
                    int size2 = ca1VarY.size();
                    for (int i11 = 0; i11 < size2; i11++) {
                        ux0 ux0Var = (ux0) ca1VarY.get(i11);
                        if (ux0Var != null) {
                            ux0Var.f20928g.set(false);
                            ux0Var.f20936p.set(false);
                            qx0 qx0Var = sx0Var.f20069i;
                            if (qx0Var != null) {
                                qx0Var.d(ux0Var);
                            }
                            Queue queue = ux0Var.f20931j;
                            synchronized (queue) {
                                queue.clear();
                            }
                            String strValueOf = String.valueOf(ux0Var.l);
                            int i12 = zze.zza;
                            zzo.zzh("Destroyed ad preloader for preloadId: ".concat(strValueOf));
                        }
                    }
                    String strConcat = "Destroyed all ad preloaders for ad format: ".concat(adFormat.toString());
                    int i13 = zze.zza;
                    zzo.zzh(strConcat);
                    uo0 uo0Var = sx0Var.f20063c;
                    ((p9.b) sx0Var.f20067g).getClass();
                    uo0Var.q("pda", System.currentTimeMillis(), null, null, adFormat, -1, -1, size);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzch
    public final void zzl(st stVar) {
    }
}
