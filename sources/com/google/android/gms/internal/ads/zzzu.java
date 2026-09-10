package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Point;
import android.os.Build;
import android.text.TextUtils;
import android.util.Pair;
import android.view.accessibility.CaptioningManager;
import com.startapp.simple.bloomfilter.parsing.TokenBuilder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes4.dex */
public final class zzzu extends zzaaa implements zzmj {
    public static final /* synthetic */ int zzb = 0;
    private static final zzgux zzc = zzgux.zzc(zzza.zza);
    public final Context zza;
    private final Object zzd;
    private zzzf zze;
    private Thread zzf;
    private zzzj zzg;
    private zzd zzh;
    private Boolean zzi;
    private final zzyn zzj;

    public zzzu(Context context) {
        zzyn zzynVar = new zzyn();
        zzzf zzzfVar = zzzf.zzJ;
        this.zzd = new Object();
        byte[] bArr = null;
        this.zza = context != null ? context.getApplicationContext() : null;
        this.zzj = zzynVar;
        if (zzzfVar != null) {
            this.zze = zzzfVar;
        } else {
            zzze zzzeVar = new zzze(zzzfVar, bArr);
            zzzeVar.zzx((zzbl) zzzfVar);
            this.zze = new zzzf(zzzeVar, bArr);
        }
        this.zzh = zzd.zza;
        if (this.zze.zzU && context == null) {
            zzee.zzc("DefaultTrackSelector", "Audio channel count constraints cannot be applied without reference to Context. Build the track selector instance with one of the non-deprecated constructors that take a Context argument.");
        }
    }

    public static String zzi(String str) {
        if (TextUtils.isEmpty(str) || TextUtils.equals(str, "und")) {
            return null;
        }
        return str;
    }

    public static int zzj(zzv zzvVar, String str, boolean z2) {
        if (!TextUtils.isEmpty(str) && str.equals(zzvVar.zzd)) {
            return 4;
        }
        String strZzi = zzi(str);
        String strZzi2 = zzi(zzvVar.zzd);
        if (strZzi2 == null || strZzi == null) {
            return (z2 && strZzi2 == null) ? 1 : 0;
        }
        if (strZzi2.startsWith(strZzi) || strZzi.startsWith(strZzi2)) {
            return 3;
        }
        String str2 = zzfj.zza;
        return strZzi2.split(TokenBuilder.TOKEN_DELIMITER, 2)[0].equals(strZzi.split(TokenBuilder.TOKEN_DELIMITER, 2)[0]) ? 2 : 0;
    }

    public static /* synthetic */ int zzm(int i2, int i3) {
        if (i2 == 0 || i2 != i3) {
            return Integer.bitCount(i2 & i3);
        }
        return Integer.MAX_VALUE;
    }

    public static /* synthetic */ int zzn(zzv zzvVar, zzgtd zzgtdVar) {
        for (int i2 = 0; i2 < zzgtdVar.size(); i2++) {
            int i3 = 0;
            while (true) {
                List list = zzvVar.zzc;
                if (i3 < list.size()) {
                    if (((zzx) list.get(i3)).zzb.equals(zzgtdVar.get(i2))) {
                        return i2;
                    }
                    i3++;
                }
            }
        }
        return Integer.MAX_VALUE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: zzu, reason: merged with bridge method [inline-methods] */
    public final void zzl() {
        boolean z2;
        zzzj zzzjVar;
        synchronized (this.zzd) {
            try {
                z2 = false;
                if (this.zze.zzU && Build.VERSION.SDK_INT >= 32 && (zzzjVar = this.zzg) != null && zzzjVar.zza()) {
                    z2 = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z2) {
            zzs();
        }
    }

    private static void zzv(zzyh zzyhVar, zzbl zzblVar, Map map) {
        for (int i2 = 0; i2 < zzyhVar.zzb; i2++) {
            if (((zzbh) zzblVar.zzH.get(zzyhVar.zza(i2))) != null) {
                throw null;
            }
        }
    }

    private static final Pair zzw(int i2, zzzz zzzzVar, int[][][] iArr, zzzl zzzlVar, Comparator comparator) {
        RandomAccess randomAccessZzj;
        ArrayList arrayList = new ArrayList();
        for (int i3 = 0; i3 < 2; i3++) {
            if (i2 == zzzzVar.zza(i3)) {
                zzyh zzyhVarZzb = zzzzVar.zzb(i3);
                for (int i4 = 0; i4 < zzyhVarZzb.zzb; i4++) {
                    zzbg zzbgVarZza = zzyhVarZzb.zza(i4);
                    List listZza = zzzlVar.zza(i3, zzbgVarZza, iArr[i3][i4]);
                    int i5 = zzbgVarZza.zza;
                    boolean[] zArr = new boolean[i5];
                    int i6 = 0;
                    while (i6 < i5) {
                        int i7 = i6 + 1;
                        zzzm zzzmVar = (zzzm) listZza.get(i6);
                        int iZza = zzzmVar.zza();
                        if (!zArr[i6] && iZza != 0) {
                            if (iZza == 1) {
                                randomAccessZzj = zzgtd.zzj(zzzmVar);
                            } else {
                                ArrayList arrayList2 = new ArrayList();
                                arrayList2.add(zzzmVar);
                                for (int i8 = i7; i8 < i5; i8++) {
                                    zzzm zzzmVar2 = (zzzm) listZza.get(i8);
                                    if (zzzmVar2.zza() == 2 && zzzmVar.zzc(zzzmVar2)) {
                                        arrayList2.add(zzzmVar2);
                                        zArr[i8] = true;
                                    }
                                }
                                randomAccessZzj = arrayList2;
                            }
                            arrayList.add(randomAccessZzj);
                        }
                        i6 = i7;
                    }
                }
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        List list = (List) Collections.max(arrayList, comparator);
        int[] iArr2 = new int[list.size()];
        for (int i9 = 0; i9 < list.size(); i9++) {
            iArr2[i9] = ((zzzm) list.get(i9)).zzc;
        }
        zzzm zzzmVar3 = (zzzm) list.get(0);
        return Pair.create(new zzzv(zzzmVar3.zzb, iArr2, 0), Integer.valueOf(zzzmVar3.zza));
    }

    @Override // com.google.android.gms.internal.ads.zzmj
    public final void zza(zzmi zzmiVar) {
        synchronized (this.zzd) {
            boolean z2 = this.zze.zzY;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaad
    public final void zzb() {
        zzzj zzzjVar;
        synchronized (this.zzd) {
            try {
                Thread thread = this.zzf;
                if (thread != null) {
                    zzgqa.zzj(thread == Thread.currentThread(), "DefaultTrackSelector is accessed on the wrong thread.");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (Build.VERSION.SDK_INT >= 32 && (zzzjVar = this.zzg) != null) {
            zzzjVar.zze();
            this.zzg = null;
        }
        super.zzb();
    }

    public final zzzf zzc() {
        zzzf zzzfVar;
        synchronized (this.zzd) {
            zzzfVar = this.zze;
        }
        return zzzfVar;
    }

    @Override // com.google.android.gms.internal.ads.zzaad
    public final boolean zzd() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzaad
    public final void zze(zzd zzdVar) {
        if (this.zzh.equals(zzdVar)) {
            return;
        }
        this.zzh = zzdVar;
        zzl();
    }

    public final void zzf(zzze zzzeVar) {
        boolean zEquals;
        zzzf zzzfVar = new zzzf(zzzeVar, null);
        synchronized (this.zzd) {
            zEquals = this.zze.equals(zzzfVar);
            this.zze = zzzfVar;
        }
        if (zEquals) {
            return;
        }
        if (zzzfVar.zzU && this.zza == null) {
            zzee.zzc("DefaultTrackSelector", "Audio channel count constraints cannot be applied without reference to Context. Build the track selector instance with one of the non-deprecated constructors that take a Context argument.");
        }
        zzs();
    }

    @Override // com.google.android.gms.internal.ads.zzaad
    public final zzmj zzg() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzaaa
    public final Pair zzh(zzzz zzzzVar, int[][][] iArr, final int[] iArr2, zzwg zzwgVar, zzbf zzbfVar) throws zzit {
        final zzzf zzzfVar;
        final boolean z2;
        final String str;
        final String languageTag;
        int i2;
        Context context;
        CaptioningManager captioningManager;
        Locale locale;
        Context context2;
        Context context3;
        int i3 = 1;
        synchronized (this.zzd) {
            this.zzf = Thread.currentThread();
            zzzfVar = this.zze;
        }
        if (this.zzi == null && (context3 = this.zza) != null) {
            this.zzi = Boolean.valueOf(zzfj.zzM(context3));
        }
        if (zzzfVar.zzU && Build.VERSION.SDK_INT >= 32 && this.zzg == null) {
            this.zzg = new zzzj(this.zza, this, this.zzi);
        }
        int i4 = 2;
        zzzv[] zzzvVarArr = new zzzv[2];
        int i5 = 0;
        int i6 = 0;
        while (true) {
            if (i6 >= 2) {
                z2 = false;
                break;
            }
            if (zzzzVar.zza(i6) == 2 && zzzzVar.zzb(i6).zzb > 0) {
                z2 = true;
                break;
            }
            i6++;
        }
        Pair pairZzw = zzw(1, zzzzVar, iArr, new zzzl() { // from class: com.google.android.gms.internal.ads.zzyw
            @Override // com.google.android.gms.internal.ads.zzzl
            public final /* synthetic */ List zza(int i7, zzbg zzbgVar, int[] iArr3) {
                final zzzu zzzuVar = this.zza;
                final zzzf zzzfVar2 = zzzfVar;
                zzgqb zzgqbVar = new zzgqb() { // from class: com.google.android.gms.internal.ads.zzyz
                    @Override // com.google.android.gms.internal.ads.zzgqb
                    public final /* synthetic */ boolean zza(Object obj) {
                        return zzzuVar.zzk(zzzfVar2, (zzv) obj);
                    }
                };
                int i8 = iArr2[i7];
                int i9 = zzgtd.zzd;
                zzgta zzgtaVar = new zzgta();
                for (int i10 = 0; i10 < zzbgVar.zza; i10++) {
                    zzgtaVar.zzf(new zzyr(i7, zzbgVar, i10, zzzfVar2, iArr3[i10], z2, zzgqbVar, i8));
                }
                return zzgtaVar.zzi();
            }
        }, zzys.zza);
        if (pairZzw != null) {
            zzzvVarArr[((Integer) pairZzw.second).intValue()] = (zzzv) pairZzw.first;
        }
        if (pairZzw == null) {
            str = null;
        } else {
            Object obj = pairZzw.first;
            str = ((zzzv) obj).zza.zza(((zzzv) obj).zzb[0]).zzd;
        }
        int i7 = zzzfVar.zzw.zzb;
        final Point pointZzO = (!zzzfVar.zzk || (context2 = this.zza) == null) ? null : zzfj.zzO(context2);
        Pair pairZzw2 = zzw(2, zzzzVar, iArr, new zzzl() { // from class: com.google.android.gms.internal.ads.zzzb
            /* JADX WARN: Code duplicated, block: B:34:0x005e  */
            /* JADX WARN: Code duplicated, block: B:35:0x006a  */
            @Override // com.google.android.gms.internal.ads.zzzl
            public final /* synthetic */ List zza(int i8, zzbg zzbgVar, int[] iArr3) {
                boolean z3;
                int i9;
                int i10;
                int i11;
                boolean z4;
                int i12;
                int i13;
                int i14;
                int i15;
                int i16;
                Point point;
                zzbg zzbgVar2 = zzbgVar;
                int i17 = zzzu.zzb;
                Point point2 = pointZzO;
                int i18 = iArr2[i8];
                zzzf zzzfVar2 = zzzfVar;
                int i19 = point2 != null ? point2.x : zzzfVar2.zzi;
                int i20 = point2 != null ? point2.y : zzzfVar2.zzj;
                boolean z5 = zzzfVar2.zzl;
                if (i19 == Integer.MAX_VALUE) {
                    z3 = true;
                    i9 = -1;
                    i10 = Integer.MAX_VALUE;
                } else if (i20 == Integer.MAX_VALUE) {
                    i10 = Integer.MAX_VALUE;
                    z3 = true;
                    i9 = -1;
                } else {
                    int i21 = Integer.MAX_VALUE;
                    for (int i22 = 0; i22 < zzbgVar2.zza; i22++) {
                        zzv zzvVarZza = zzbgVar2.zza(i22);
                        int i23 = zzvVarZza.zzv;
                        if (i23 > 0 && (i12 = zzvVarZza.zzw) > 0) {
                            if (z5) {
                                if ((i23 > i12) != (i19 > i20)) {
                                    i14 = i20;
                                    i13 = i19;
                                }
                                i15 = i23 * i13;
                                i16 = i12 * i14;
                                if (i15 >= i16) {
                                    String str2 = zzfj.zza;
                                    point = new Point(i14, ((i16 + i23) - 1) / i23);
                                } else {
                                    String str3 = zzfj.zza;
                                    point = new Point(((i15 + i12) - 1) / i12, i13);
                                }
                                int i24 = i23 * i12;
                                if (i23 < ((int) (point.x * 0.98f)) && i12 >= ((int) (point.y * 0.98f)) && i24 < i21) {
                                    i21 = i24;
                                }
                            }
                            i13 = i20;
                            i14 = i19;
                            i15 = i23 * i13;
                            i16 = i12 * i14;
                            if (i15 >= i16) {
                                String str4 = zzfj.zza;
                                point = new Point(i14, ((i16 + i23) - 1) / i23);
                            } else {
                                String str5 = zzfj.zza;
                                point = new Point(((i15 + i12) - 1) / i12, i13);
                            }
                            int i25 = i23 * i12;
                            if (i23 < ((int) (point.x * 0.98f))) {
                            }
                        }
                    }
                    z3 = true;
                    i9 = -1;
                    i10 = i21;
                }
                int i26 = zzgtd.zzd;
                zzgta zzgtaVar = new zzgta();
                int i27 = 0;
                while (i27 < zzbgVar2.zza) {
                    int iZzc = zzbgVar2.zza(i27).zzc();
                    if (i10 != Integer.MAX_VALUE) {
                        i11 = i9;
                        if (iZzc == i11 || iZzc > i10) {
                            z4 = false;
                        }
                        zzgtaVar.zzf(new zzzt(i8, zzbgVar2, i27, zzzfVar2, iArr3[i27], str, i18, z4));
                        i27++;
                        zzbgVar2 = zzbgVar;
                        i9 = i11;
                    } else {
                        i11 = i9;
                    }
                    z4 = z3;
                    zzgtaVar.zzf(new zzzt(i8, zzbgVar2, i27, zzzfVar2, iArr3[i27], str, i18, z4));
                    i27++;
                    zzbgVar2 = zzbgVar;
                    i9 = i11;
                }
                return zzgtaVar.zzi();
            }
        }, zzyv.zza);
        int i8 = 4;
        Pair pairZzw3 = pairZzw2 == null ? zzw(4, zzzzVar, iArr, new zzzl() { // from class: com.google.android.gms.internal.ads.zzyy
            @Override // com.google.android.gms.internal.ads.zzzl
            public final /* synthetic */ List zza(int i9, zzbg zzbgVar, int[] iArr3) {
                int i10 = zzzu.zzb;
                int i11 = zzgtd.zzd;
                zzgta zzgtaVar = new zzgta();
                for (int i12 = 0; i12 < zzbgVar.zza; i12++) {
                    zzgtaVar.zzf(new zzzc(i9, zzbgVar, i12, zzzfVar, iArr3[i12]));
                }
                return zzgtaVar.zzi();
            }
        }, zzyt.zza) : null;
        if (pairZzw3 != null) {
            zzzvVarArr[((Integer) pairZzw3.second).intValue()] = (zzzv) pairZzw3.first;
        } else if (pairZzw2 != null) {
            zzzvVarArr[((Integer) pairZzw2.second).intValue()] = (zzzv) pairZzw2.first;
        }
        if (!zzzfVar.zzB || (context = this.zza) == null || (captioningManager = (CaptioningManager) context.getSystemService("captioning")) == null || !captioningManager.isEnabled() || (locale = captioningManager.getLocale()) == null) {
            languageTag = null;
        } else {
            String str2 = zzfj.zza;
            languageTag = locale.toLanguageTag();
        }
        int i9 = 3;
        Pair pairZzw4 = zzw(3, zzzzVar, iArr, new zzzl() { // from class: com.google.android.gms.internal.ads.zzyx
            @Override // com.google.android.gms.internal.ads.zzzl
            public final /* synthetic */ List zza(int i10, zzbg zzbgVar, int[] iArr3) {
                int i11 = zzzu.zzb;
                int i12 = zzgtd.zzd;
                zzgta zzgtaVar = new zzgta();
                for (int i13 = 0; i13 < zzbgVar.zza; i13++) {
                    zzgtaVar.zzf(new zzzk(i10, zzbgVar, i13, zzzfVar, iArr3[i13], str, languageTag));
                }
                return zzgtaVar.zzi();
            }
        }, zzyu.zza);
        if (pairZzw4 != null) {
            zzzvVarArr[((Integer) pairZzw4.second).intValue()] = (zzzv) pairZzw4.first;
        }
        int i10 = 0;
        while (i10 < i4) {
            int iZza = zzzzVar.zza(i10);
            if (iZza == i4 || iZza == i3 || iZza == i9 || iZza == i8) {
                i2 = i3;
            } else {
                zzyh zzyhVarZzb = zzzzVar.zzb(i10);
                int[][] iArr3 = iArr[i10];
                int i11 = i5;
                int i12 = i11;
                zzbg zzbgVar = null;
                zzzd zzzdVar = null;
                while (i11 < zzyhVarZzb.zzb) {
                    zzbg zzbgVarZza = zzyhVarZzb.zza(i11);
                    int[] iArr4 = iArr3[i11];
                    zzzd zzzdVar2 = zzzdVar;
                    int i13 = i3;
                    for (int i14 = i5; i14 < zzbgVarZza.zza; i14++) {
                        if (zzmk.zzaa(iArr4[i14], zzzfVar.zzV)) {
                            zzzd zzzdVar3 = new zzzd(zzbgVarZza.zza(i14), iArr4[i14]);
                            if (zzzdVar2 == null || zzzdVar3.compareTo(zzzdVar2) > 0) {
                                zzzdVar2 = zzzdVar3;
                                zzbgVar = zzbgVarZza;
                                i12 = i14;
                            }
                        }
                    }
                    i11++;
                    i3 = i13;
                    i5 = 0;
                    zzzdVar = zzzdVar2;
                }
                i2 = i3;
                zzzvVarArr[i10] = zzbgVar == null ? null : new zzzv(zzbgVar, new int[]{i12}, 0);
            }
            i10++;
            i3 = i2;
            i4 = 2;
            i5 = 0;
            i9 = 3;
            i8 = 4;
        }
        int i15 = i3;
        HashMap map = new HashMap();
        int i16 = 2;
        for (int i17 = 0; i17 < 2; i17++) {
            zzv(zzzzVar.zzb(i17), zzzfVar, map);
        }
        zzv(zzzzVar.zze(), zzzfVar, map);
        for (int i18 = 0; i18 < 2; i18++) {
            if (((zzbh) map.get(Integer.valueOf(zzzzVar.zza(i18)))) != null) {
                throw null;
            }
        }
        int i19 = 0;
        while (i19 < i16) {
            zzyh zzyhVarZzb2 = zzzzVar.zzb(i19);
            if (zzzfVar.zzb(i19, zzyhVarZzb2)) {
                if (zzzfVar.zzc(i19, zzyhVarZzb2) != null) {
                    throw null;
                }
                zzzvVarArr[i19] = null;
            }
            i19++;
            i16 = 2;
        }
        int i20 = 0;
        while (i20 < i16) {
            int iZza2 = zzzzVar.zza(i20);
            if (zzzfVar.zza(i20) || zzzfVar.zzI.contains(Integer.valueOf(iZza2))) {
                zzzvVarArr[i20] = null;
            }
            i20++;
            i16 = 2;
        }
        zzyn zzynVar = this.zzj;
        zzaam zzaamVarZzt = zzt();
        zzgtd zzgtdVarZzd = zzyo.zzd(zzzvVarArr);
        int i21 = 2;
        zzzw[] zzzwVarArr = new zzzw[2];
        int i22 = 0;
        while (i22 < i21) {
            zzzv zzzvVar = zzzvVarArr[i22];
            if (zzzvVar != null) {
                int[] iArr5 = zzzvVar.zzb;
                int length = iArr5.length;
                if (length != 0) {
                    zzzwVarArr[i22] = length == i15 ? new zzzx(zzzvVar.zza, iArr5[0], 0, 0, null) : zzynVar.zza(zzzvVar.zza, iArr5, 0, zzaamVarZzt, (zzgtd) zzgtdVarZzd.get(i22));
                }
                i22++;
                i21 = 2;
                i15 = 1;
            }
            i22++;
            i21 = 2;
            i15 = 1;
        }
        zzml[] zzmlVarArr = new zzml[i21];
        for (int i23 = 0; i23 < i21; i23++) {
            zzmlVarArr[i23] = (zzzfVar.zza(i23) || zzzfVar.zzI.contains(Integer.valueOf(zzzzVar.zza(i23))) || (zzzzVar.zza(i23) != -2 && zzzwVarArr[i23] == null)) ? null : zzml.zza;
        }
        return Pair.create(zzmlVarArr, zzzwVarArr);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final /* synthetic */ boolean zzk(zzzf zzzfVar, zzv zzvVar) {
        Boolean bool;
        zzzj zzzjVar;
        zzzj zzzjVar2;
        if (!zzzfVar.zzU || ((bool = this.zzi) != null && bool.booleanValue())) {
            return true;
        }
        int i2 = zzvVar.zzG;
        byte b2 = -1;
        if (i2 != -1 && i2 > 2) {
            String str = zzvVar.zzo;
            if (str != null) {
                switch (str.hashCode()) {
                    case -2123537834:
                        if (str.equals("audio/eac3-joc")) {
                            b2 = 2;
                        }
                        break;
                    case 187078296:
                        if (str.equals("audio/ac3")) {
                            b2 = 0;
                        }
                        break;
                    case 187078297:
                        if (str.equals("audio/ac4")) {
                            b2 = 3;
                        }
                        break;
                    case 1504578661:
                        if (str.equals("audio/eac3")) {
                            b2 = 1;
                        }
                        break;
                }
                if ((b2 == 0 || b2 == 1 || b2 == 2 || b2 == 3) && (Build.VERSION.SDK_INT < 32 || (zzzjVar2 = this.zzg) == null || !zzzjVar2.zza())) {
                    return true;
                }
            }
            return Build.VERSION.SDK_INT >= 32 && (zzzjVar = this.zzg) != null && zzzjVar.zza() && zzzjVar.zzb() && this.zzg.zzc() && this.zzg.zzd(this.zzh, zzvVar);
        }
        return true;
    }
}
