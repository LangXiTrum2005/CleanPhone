package com.google.android.gms.internal.ads;

import com.applovin.shadow.okio.Segment;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class zzbfp {

    /* JADX INFO: renamed from: com.google.android.gms.internal.ads.zzbfp$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] zza;

        static {
            int[] iArr = new int[zziaq.values().length];
            zza = iArr;
            try {
                iArr[zziaq.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                zza[zziaq.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                zza[zziaq.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                zza[zziaq.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                zza[zziaq.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                zza[zziaq.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                zza[zziaq.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public final class zza extends zziar<zza, zzb> implements zzf {
        private static final zza zzB;
        private static volatile zzick<zza> zzC = null;
        public static final int zza = 7;
        public static final int zzb = 8;
        public static final int zzc = 9;
        public static final int zzd = 10;
        public static final int zze = 11;
        public static final int zzf = 12;
        public static final int zzg = 13;
        public static final int zzh = 14;
        public static final int zzi = 15;
        public static final int zzj = 16;
        public static final int zzk = 17;
        private int zzl;
        private int zzm;
        private zzg zzo;
        private zzi zzp;
        private zzk zzv;
        private zzah zzw;
        private zzac zzx;
        private zzx zzy;
        private zzz zzz;
        private int zzn = 1000;
        private zzibd<zzd> zzu = zziar.zzbM();
        private zzibd<zzat> zzA = zziar.zzbM();

        /* JADX INFO: renamed from: com.google.android.gms.internal.ads.zzbfp$zza$zza, reason: collision with other inner class name */
        public enum EnumC0185zza implements zziav {
            AD_INITIATER_UNSPECIFIED(0),
            BANNER(1),
            DFP_BANNER(2),
            INTERSTITIAL(3),
            DFP_INTERSTITIAL(4),
            NATIVE_EXPRESS(5),
            AD_LOADER(6),
            REWARD_BASED_VIDEO_AD(7),
            BANNER_SEARCH_ADS(8),
            GOOGLE_MOBILE_ADS_SDK_ADAPTER(9),
            APP_OPEN(10),
            REWARDED_INTERSTITIAL(11);

            public static final int zzm = 0;
            public static final int zzn = 1;
            public static final int zzo = 2;
            public static final int zzp = 3;
            public static final int zzq = 4;
            public static final int zzr = 5;
            public static final int zzs = 6;
            public static final int zzt = 7;
            public static final int zzu = 8;
            public static final int zzv = 9;
            public static final int zzw = 10;
            public static final int zzx = 11;
            private static final zziaw<EnumC0185zza> zzy = new zziaw<EnumC0185zza>() { // from class: com.google.android.gms.internal.ads.zzbfp.zza.zza.1
                /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
                public EnumC0185zza zzb(int i2) {
                    return EnumC0185zza.zzc(i2);
                }
            };
            private final int zzz;

            /* JADX INFO: renamed from: com.google.android.gms.internal.ads.zzbfp$zza$zza$zza, reason: collision with other inner class name */
            final class C0186zza implements zziax {
                static final zziax zza = new C0186zza();

                private C0186zza() {
                }

                @Override // com.google.android.gms.internal.ads.zziax
                public boolean zza(int i2) {
                    return EnumC0185zza.zzc(i2) != null;
                }
            }

            EnumC0185zza(int i2) {
                this.zzz = i2;
            }

            public static EnumC0185zza zzc(int i2) {
                switch (i2) {
                    case 0:
                        return AD_INITIATER_UNSPECIFIED;
                    case 1:
                        return BANNER;
                    case 2:
                        return DFP_BANNER;
                    case 3:
                        return INTERSTITIAL;
                    case 4:
                        return DFP_INTERSTITIAL;
                    case 5:
                        return NATIVE_EXPRESS;
                    case 6:
                        return AD_LOADER;
                    case 7:
                        return REWARD_BASED_VIDEO_AD;
                    case 8:
                        return BANNER_SEARCH_ADS;
                    case 9:
                        return GOOGLE_MOBILE_ADS_SDK_ADAPTER;
                    case 10:
                        return APP_OPEN;
                    case 11:
                        return REWARDED_INTERSTITIAL;
                    default:
                        return null;
                }
            }

            public static zziaw<EnumC0185zza> zzd() {
                return zzy;
            }

            public static zziax zze() {
                return C0186zza.zza;
            }

            @Override // java.lang.Enum
            public final String toString() {
                return Integer.toString(this.zzz);
            }

            @Override // com.google.android.gms.internal.ads.zziav
            public final int zza() {
                return this.zzz;
            }
        }

        public final class zzb extends zzial<zza, zzb> implements zzf {
            public /* synthetic */ zzb(byte[] bArr) {
                this();
            }

            public zzb zzA(int i2, zzd zzdVar) {
                zzbg();
                ((zza) this.zza).zzX(i2, zzdVar);
                return this;
            }

            public zzb zzB(zzd.zzb zzbVar) {
                zzbg();
                ((zza) this.zza).zzW(zzbVar.zzbu());
                return this;
            }

            public zzb zzC(int i2, zzd.zzb zzbVar) {
                zzbg();
                ((zza) this.zza).zzX(i2, zzbVar.zzbu());
                return this;
            }

            public zzb zzD(Iterable<? extends zzd> iterable) {
                zzbg();
                ((zza) this.zza).zzaa(iterable);
                return this;
            }

            public zzb zzE() {
                zzbg();
                ((zza) this.zza).zzab();
                return this;
            }

            public zzb zzF(int i2) {
                zzbg();
                ((zza) this.zza).zzac(i2);
                return this;
            }

            @Override // com.google.android.gms.internal.ads.zzbfp.zzf
            public boolean zzG() {
                return ((zza) this.zza).zzG();
            }

            @Override // com.google.android.gms.internal.ads.zzbfp.zzf
            public zzk zzH() {
                return ((zza) this.zza).zzH();
            }

            public zzb zzI(zzk zzkVar) {
                zzbg();
                ((zza) this.zza).zzad(zzkVar);
                return this;
            }

            public zzb zzJ(zzk.zza zzaVar) {
                zzbg();
                ((zza) this.zza).zzad(zzaVar.zzbu());
                return this;
            }

            public zzb zzK(zzk zzkVar) {
                zzbg();
                ((zza) this.zza).zzag(zzkVar);
                return this;
            }

            public zzb zzL() {
                zzbg();
                ((zza) this.zza).zzah();
                return this;
            }

            @Override // com.google.android.gms.internal.ads.zzbfp.zzf
            public boolean zzM() {
                return ((zza) this.zza).zzM();
            }

            @Override // com.google.android.gms.internal.ads.zzbfp.zzf
            public zzah zzN() {
                return ((zza) this.zza).zzN();
            }

            public zzb zzO(zzah zzahVar) {
                zzbg();
                ((zza) this.zza).zzai(zzahVar);
                return this;
            }

            public zzb zzP(zzah.zza zzaVar) {
                zzbg();
                ((zza) this.zza).zzai(zzaVar.zzbu());
                return this;
            }

            public zzb zzQ(zzah zzahVar) {
                zzbg();
                ((zza) this.zza).zzaj(zzahVar);
                return this;
            }

            public zzb zzR() {
                zzbg();
                ((zza) this.zza).zzan();
                return this;
            }

            @Override // com.google.android.gms.internal.ads.zzbfp.zzf
            public boolean zzS() {
                return ((zza) this.zza).zzS();
            }

            @Override // com.google.android.gms.internal.ads.zzbfp.zzf
            public zzac zzT() {
                return ((zza) this.zza).zzT();
            }

            public zzb zzU(zzac zzacVar) {
                zzbg();
                ((zza) this.zza).zzao(zzacVar);
                return this;
            }

            public zzb zzV(zzac.zza zzaVar) {
                zzbg();
                ((zza) this.zza).zzao(zzaVar.zzbu());
                return this;
            }

            public zzb zzW(zzac zzacVar) {
                zzbg();
                ((zza) this.zza).zzap(zzacVar);
                return this;
            }

            public zzb zzX() {
                zzbg();
                ((zza) this.zza).zzaq();
                return this;
            }

            @Override // com.google.android.gms.internal.ads.zzbfp.zzf
            public boolean zzY() {
                return ((zza) this.zza).zzY();
            }

            @Override // com.google.android.gms.internal.ads.zzbfp.zzf
            public zzx zzZ() {
                return ((zza) this.zza).zzZ();
            }

            @Override // com.google.android.gms.internal.ads.zzbfp.zzf
            public boolean zza() {
                return ((zza) this.zza).zza();
            }

            public zzb zzaa(zzx zzxVar) {
                zzbg();
                ((zza) this.zza).zzar(zzxVar);
                return this;
            }

            public zzb zzab(zzx.zza zzaVar) {
                zzbg();
                ((zza) this.zza).zzar(zzaVar.zzbu());
                return this;
            }

            public zzb zzac(zzx zzxVar) {
                zzbg();
                ((zza) this.zza).zzas(zzxVar);
                return this;
            }

            public zzb zzad() {
                zzbg();
                ((zza) this.zza).zzat();
                return this;
            }

            @Override // com.google.android.gms.internal.ads.zzbfp.zzf
            public boolean zzae() {
                return ((zza) this.zza).zzae();
            }

            @Override // com.google.android.gms.internal.ads.zzbfp.zzf
            public zzz zzaf() {
                return ((zza) this.zza).zzaf();
            }

            public zzb zzag(zzz zzzVar) {
                zzbg();
                ((zza) this.zza).zzau(zzzVar);
                return this;
            }

            public zzb zzah(zzz.zza zzaVar) {
                zzbg();
                ((zza) this.zza).zzau(zzaVar.zzbu());
                return this;
            }

            public zzb zzai(zzz zzzVar) {
                zzbg();
                ((zza) this.zza).zzav(zzzVar);
                return this;
            }

            public zzb zzaj() {
                zzbg();
                ((zza) this.zza).zzaw();
                return this;
            }

            @Override // com.google.android.gms.internal.ads.zzbfp.zzf
            public List<zzat> zzak() {
                return Collections.unmodifiableList(((zza) this.zza).zzak());
            }

            @Override // com.google.android.gms.internal.ads.zzbfp.zzf
            public int zzal() {
                return ((zza) this.zza).zzal();
            }

            @Override // com.google.android.gms.internal.ads.zzbfp.zzf
            public zzat zzam(int i2) {
                return ((zza) this.zza).zzam(i2);
            }

            public zzb zzan(int i2, zzat zzatVar) {
                zzbg();
                ((zza) this.zza).zzax(i2, zzatVar);
                return this;
            }

            public zzb zzao(int i2, zzat.zza zzaVar) {
                zzbg();
                ((zza) this.zza).zzax(i2, zzaVar.zzbu());
                return this;
            }

            public zzb zzap(zzat zzatVar) {
                zzbg();
                ((zza) this.zza).zzay(zzatVar);
                return this;
            }

            public zzb zzaq(int i2, zzat zzatVar) {
                zzbg();
                ((zza) this.zza).zzaz(i2, zzatVar);
                return this;
            }

            public zzb zzar(zzat.zza zzaVar) {
                zzbg();
                ((zza) this.zza).zzay(zzaVar.zzbu());
                return this;
            }

            public zzb zzas(int i2, zzat.zza zzaVar) {
                zzbg();
                ((zza) this.zza).zzaz(i2, zzaVar.zzbu());
                return this;
            }

            public zzb zzat(Iterable<? extends zzat> iterable) {
                zzbg();
                ((zza) this.zza).zzaA(iterable);
                return this;
            }

            public zzb zzau() {
                zzbg();
                ((zza) this.zza).zzaB();
                return this;
            }

            public zzb zzav(int i2) {
                zzbg();
                ((zza) this.zza).zzaC(i2);
                return this;
            }

            @Override // com.google.android.gms.internal.ads.zzbfp.zzf
            public EnumC0185zza zzb() {
                return ((zza) this.zza).zzb();
            }

            public zzb zzc(EnumC0185zza enumC0185zza) {
                zzbg();
                ((zza) this.zza).zzF(enumC0185zza);
                return this;
            }

            public zzb zzd() {
                zzbg();
                ((zza) this.zza).zzI();
                return this;
            }

            @Override // com.google.android.gms.internal.ads.zzbfp.zzf
            public boolean zze() {
                return ((zza) this.zza).zze();
            }

            @Override // com.google.android.gms.internal.ads.zzbfp.zzf
            public zzq zzf() {
                return ((zza) this.zza).zzf();
            }

            public zzb zzg(zzq zzqVar) {
                zzbg();
                ((zza) this.zza).zzJ(zzqVar);
                return this;
            }

            public zzb zzh() {
                zzbg();
                ((zza) this.zza).zzK();
                return this;
            }

            @Override // com.google.android.gms.internal.ads.zzbfp.zzf
            public boolean zzi() {
                return ((zza) this.zza).zzi();
            }

            @Override // com.google.android.gms.internal.ads.zzbfp.zzf
            public zzg zzj() {
                return ((zza) this.zza).zzj();
            }

            public zzb zzk(zzg zzgVar) {
                zzbg();
                ((zza) this.zza).zzL(zzgVar);
                return this;
            }

            public zzb zzl(zzg.zza zzaVar) {
                zzbg();
                ((zza) this.zza).zzL(zzaVar.zzbu());
                return this;
            }

            public zzb zzm(zzg zzgVar) {
                zzbg();
                ((zza) this.zza).zzO(zzgVar);
                return this;
            }

            public zzb zzn() {
                zzbg();
                ((zza) this.zza).zzP();
                return this;
            }

            @Override // com.google.android.gms.internal.ads.zzbfp.zzf
            public boolean zzo() {
                return ((zza) this.zza).zzo();
            }

            @Override // com.google.android.gms.internal.ads.zzbfp.zzf
            public zzi zzp() {
                return ((zza) this.zza).zzp();
            }

            public zzb zzq(zzi zziVar) {
                zzbg();
                ((zza) this.zza).zzQ(zziVar);
                return this;
            }

            public zzb zzr(zzi.zza zzaVar) {
                zzbg();
                ((zza) this.zza).zzQ(zzaVar.zzbu());
                return this;
            }

            public zzb zzs(zzi zziVar) {
                zzbg();
                ((zza) this.zza).zzR(zziVar);
                return this;
            }

            public zzb zzt() {
                zzbg();
                ((zza) this.zza).zzU();
                return this;
            }

            @Override // com.google.android.gms.internal.ads.zzbfp.zzf
            public List<zzd> zzu() {
                return Collections.unmodifiableList(((zza) this.zza).zzu());
            }

            @Override // com.google.android.gms.internal.ads.zzbfp.zzf
            public int zzv() {
                return ((zza) this.zza).zzv();
            }

            @Override // com.google.android.gms.internal.ads.zzbfp.zzf
            public zzd zzw(int i2) {
                return ((zza) this.zza).zzw(i2);
            }

            public zzb zzx(int i2, zzd zzdVar) {
                zzbg();
                ((zza) this.zza).zzV(i2, zzdVar);
                return this;
            }

            public zzb zzy(int i2, zzd.zzb zzbVar) {
                zzbg();
                ((zza) this.zza).zzV(i2, zzbVar.zzbu());
                return this;
            }

            public zzb zzz(zzd zzdVar) {
                zzbg();
                ((zza) this.zza).zzW(zzdVar);
                return this;
            }

            private zzb() {
                super(zza.zzB);
            }
        }

        static {
            zza zzaVar = new zza();
            zzB = zzaVar;
            zziar.zzbu(zza.class, zzaVar);
        }

        private zza() {
        }

        public static zza zzA(zzhzq zzhzqVar, zziab zziabVar) throws IOException {
            return (zza) zziar.zzbZ(zzB, zzhzqVar, zziabVar);
        }

        public static zzb zzB() {
            return (zzb) zzB.zzbn();
        }

        public static zzb zzC(zza zzaVar) {
            return (zzb) zzB.zzbo(zzaVar);
        }

        public static zza zzD() {
            return zzB;
        }

        public static zzick<zza> zzE() {
            return zzB.zzbd();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzaE, reason: merged with bridge method [inline-methods] */
        public void zzF(EnumC0185zza enumC0185zza) {
            this.zzm = enumC0185zza.zza();
            this.zzl |= 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzaF, reason: merged with bridge method [inline-methods] */
        public void zzI() {
            this.zzl &= -2;
            this.zzm = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzaG, reason: merged with bridge method [inline-methods] */
        public void zzJ(zzq zzqVar) {
            this.zzn = zzqVar.zza();
            this.zzl |= 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzaH, reason: merged with bridge method [inline-methods] */
        public void zzK() {
            this.zzl &= -3;
            this.zzn = 1000;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzaI, reason: merged with bridge method [inline-methods] */
        public void zzL(zzg zzgVar) {
            zzgVar.getClass();
            this.zzo = zzgVar;
            this.zzl |= 4;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzaJ, reason: merged with bridge method [inline-methods] */
        public void zzO(zzg zzgVar) {
            zzgVar.getClass();
            zzg zzgVar2 = this.zzo;
            if (zzgVar2 != null && zzgVar2 != zzg.zzz()) {
                zzg.zza zzaVarZzy = zzg.zzy(zzgVar2);
                zzaVarZzy.zzbo(zzgVar);
                zzgVar = zzaVarZzy.zzbt();
            }
            this.zzo = zzgVar;
            this.zzl |= 4;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzaK, reason: merged with bridge method [inline-methods] */
        public void zzP() {
            this.zzo = null;
            this.zzl &= -5;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzaL, reason: merged with bridge method [inline-methods] */
        public void zzQ(zzi zziVar) {
            zziVar.getClass();
            this.zzp = zziVar;
            this.zzl |= 8;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzcA, reason: merged with bridge method [inline-methods] */
        public void zzav(zzz zzzVar) {
            zzzVar.getClass();
            zzz zzzVar2 = this.zzz;
            if (zzzVar2 != null && zzzVar2 != zzz.zzA()) {
                zzz.zza zzaVarZzz = zzz.zzz(zzzVar2);
                zzaVarZzz.zzbo(zzzVar);
                zzzVar = zzaVarZzz.zzbt();
            }
            this.zzz = zzzVar;
            this.zzl |= 256;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzcB, reason: merged with bridge method [inline-methods] */
        public void zzaw() {
            this.zzz = null;
            this.zzl &= -257;
        }

        private void zzcC() {
            zzibd<zzat> zzibdVar = this.zzA;
            if (zzibdVar.zza()) {
                return;
            }
            this.zzA = zziar.zzbN(zzibdVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzcD, reason: merged with bridge method [inline-methods] */
        public void zzax(int i2, zzat zzatVar) {
            zzatVar.getClass();
            zzcC();
            this.zzA.set(i2, zzatVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzcE, reason: merged with bridge method [inline-methods] */
        public void zzay(zzat zzatVar) {
            zzatVar.getClass();
            zzcC();
            this.zzA.add(zzatVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzcF, reason: merged with bridge method [inline-methods] */
        public void zzaz(int i2, zzat zzatVar) {
            zzatVar.getClass();
            zzcC();
            this.zzA.add(i2, zzatVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzcG, reason: merged with bridge method [inline-methods] */
        public void zzaA(Iterable<? extends zzat> iterable) {
            zzcC();
            zzhyu.zzaW(iterable, this.zzA);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzcH, reason: merged with bridge method [inline-methods] */
        public void zzaB() {
            this.zzA = zziar.zzbM();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzcI, reason: merged with bridge method [inline-methods] */
        public void zzaC(int i2) {
            zzcC();
            this.zzA.remove(i2);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzce, reason: merged with bridge method [inline-methods] */
        public void zzR(zzi zziVar) {
            zziVar.getClass();
            zzi zziVar2 = this.zzp;
            if (zziVar2 != null && zziVar2 != zzi.zzD()) {
                zzi.zza zzaVarZzC = zzi.zzC(zziVar2);
                zzaVarZzC.zzbo(zziVar);
                zziVar = zzaVarZzC.zzbt();
            }
            this.zzp = zziVar;
            this.zzl |= 8;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzcf, reason: merged with bridge method [inline-methods] */
        public void zzU() {
            this.zzp = null;
            this.zzl &= -9;
        }

        private void zzcg() {
            zzibd<zzd> zzibdVar = this.zzu;
            if (zzibdVar.zza()) {
                return;
            }
            this.zzu = zziar.zzbN(zzibdVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzch, reason: merged with bridge method [inline-methods] */
        public void zzV(int i2, zzd zzdVar) {
            zzdVar.getClass();
            zzcg();
            this.zzu.set(i2, zzdVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzci, reason: merged with bridge method [inline-methods] */
        public void zzW(zzd zzdVar) {
            zzdVar.getClass();
            zzcg();
            this.zzu.add(zzdVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzcj, reason: merged with bridge method [inline-methods] */
        public void zzX(int i2, zzd zzdVar) {
            zzdVar.getClass();
            zzcg();
            this.zzu.add(i2, zzdVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzck, reason: merged with bridge method [inline-methods] */
        public void zzaa(Iterable<? extends zzd> iterable) {
            zzcg();
            zzhyu.zzaW(iterable, this.zzu);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzcl, reason: merged with bridge method [inline-methods] */
        public void zzab() {
            this.zzu = zziar.zzbM();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzcm, reason: merged with bridge method [inline-methods] */
        public void zzac(int i2) {
            zzcg();
            this.zzu.remove(i2);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzcn, reason: merged with bridge method [inline-methods] */
        public void zzad(zzk zzkVar) {
            zzkVar.getClass();
            this.zzv = zzkVar;
            this.zzl |= 16;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzco, reason: merged with bridge method [inline-methods] */
        public void zzag(zzk zzkVar) {
            zzkVar.getClass();
            zzk zzkVar2 = this.zzv;
            if (zzkVar2 != null && zzkVar2 != zzk.zzB()) {
                zzk.zza zzaVarZzA = zzk.zzA(zzkVar2);
                zzaVarZzA.zzbo(zzkVar);
                zzkVar = zzaVarZzA.zzbt();
            }
            this.zzv = zzkVar;
            this.zzl |= 16;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzcp, reason: merged with bridge method [inline-methods] */
        public void zzah() {
            this.zzv = null;
            this.zzl &= -17;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzcq, reason: merged with bridge method [inline-methods] */
        public void zzai(zzah zzahVar) {
            zzahVar.getClass();
            this.zzw = zzahVar;
            this.zzl |= 32;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzcr, reason: merged with bridge method [inline-methods] */
        public void zzaj(zzah zzahVar) {
            zzahVar.getClass();
            zzah zzahVar2 = this.zzw;
            if (zzahVar2 != null && zzahVar2 != zzah.zzE()) {
                zzah.zza zzaVarZzB = zzah.zzB(zzahVar2);
                zzaVarZzB.zzbo(zzahVar);
                zzahVar = zzaVarZzB.zzbt();
            }
            this.zzw = zzahVar;
            this.zzl |= 32;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzcs, reason: merged with bridge method [inline-methods] */
        public void zzan() {
            this.zzw = null;
            this.zzl &= -33;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzct, reason: merged with bridge method [inline-methods] */
        public void zzao(zzac zzacVar) {
            zzacVar.getClass();
            this.zzx = zzacVar;
            this.zzl |= 64;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzcu, reason: merged with bridge method [inline-methods] */
        public void zzap(zzac zzacVar) {
            zzacVar.getClass();
            zzac zzacVar2 = this.zzx;
            if (zzacVar2 != null && zzacVar2 != zzac.zzs()) {
                zzac.zza zzaVarZzr = zzac.zzr(zzacVar2);
                zzaVarZzr.zzbo(zzacVar);
                zzacVar = zzaVarZzr.zzbt();
            }
            this.zzx = zzacVar;
            this.zzl |= 64;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzcv, reason: merged with bridge method [inline-methods] */
        public void zzaq() {
            this.zzx = null;
            this.zzl &= -65;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzcw, reason: merged with bridge method [inline-methods] */
        public void zzar(zzx zzxVar) {
            zzxVar.getClass();
            this.zzy = zzxVar;
            this.zzl |= 128;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzcx, reason: merged with bridge method [inline-methods] */
        public void zzas(zzx zzxVar) {
            zzxVar.getClass();
            zzx zzxVar2 = this.zzy;
            if (zzxVar2 != null && zzxVar2 != zzx.zzt()) {
                zzx.zza zzaVarZzs = zzx.zzs(zzxVar2);
                zzaVarZzs.zzbo(zzxVar);
                zzxVar = zzaVarZzs.zzbt();
            }
            this.zzy = zzxVar;
            this.zzl |= 128;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzcy, reason: merged with bridge method [inline-methods] */
        public void zzat() {
            this.zzy = null;
            this.zzl &= -129;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzcz, reason: merged with bridge method [inline-methods] */
        public void zzau(zzz zzzVar) {
            zzzVar.getClass();
            this.zzz = zzzVar;
            this.zzl |= 256;
        }

        public static zza zzk(ByteBuffer byteBuffer) throws zzibg {
            return (zza) zziar.zzbR(zzB, byteBuffer);
        }

        public static zza zzl(ByteBuffer byteBuffer, zziab zziabVar) throws zzibg {
            return (zza) zziar.zzbQ(zzB, byteBuffer, zziabVar);
        }

        public static zza zzm(zzhzl zzhzlVar) throws zzibg {
            return (zza) zziar.zzbS(zzB, zzhzlVar);
        }

        public static zza zzn(zzhzl zzhzlVar, zziab zziabVar) throws zzibg {
            return (zza) zziar.zzbT(zzB, zzhzlVar, zziabVar);
        }

        public static zza zzq(byte[] bArr) throws zzibg {
            return (zza) zziar.zzbU(zzB, bArr);
        }

        public static zza zzr(byte[] bArr, zziab zziabVar) throws zzibg {
            return (zza) zziar.zzbV(zzB, bArr, zziabVar);
        }

        public static zza zzs(InputStream inputStream) throws IOException {
            return (zza) zziar.zzbW(zzB, inputStream);
        }

        public static zza zzt(InputStream inputStream, zziab zziabVar) throws IOException {
            return (zza) zziar.zzbX(zzB, inputStream, zziabVar);
        }

        public static zza zzx(InputStream inputStream) throws IOException {
            return (zza) zziar.zzca(zzB, inputStream);
        }

        public static zza zzy(InputStream inputStream, zziab zziabVar) throws IOException {
            return (zza) zziar.zzcb(zzB, inputStream, zziabVar);
        }

        public static zza zzz(zzhzq zzhzqVar) throws IOException {
            return (zza) zziar.zzbY(zzB, zzhzqVar);
        }

        @Override // com.google.android.gms.internal.ads.zzbfp.zzf
        public boolean zzG() {
            return (this.zzl & 16) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbfp.zzf
        public zzk zzH() {
            zzk zzkVar = this.zzv;
            return zzkVar == null ? zzk.zzB() : zzkVar;
        }

        @Override // com.google.android.gms.internal.ads.zzbfp.zzf
        public boolean zzM() {
            return (this.zzl & 32) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbfp.zzf
        public zzah zzN() {
            zzah zzahVar = this.zzw;
            return zzahVar == null ? zzah.zzE() : zzahVar;
        }

        @Override // com.google.android.gms.internal.ads.zzbfp.zzf
        public boolean zzS() {
            return (this.zzl & 64) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbfp.zzf
        public zzac zzT() {
            zzac zzacVar = this.zzx;
            return zzacVar == null ? zzac.zzs() : zzacVar;
        }

        @Override // com.google.android.gms.internal.ads.zzbfp.zzf
        public boolean zzY() {
            return (this.zzl & 128) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbfp.zzf
        public zzx zzZ() {
            zzx zzxVar = this.zzy;
            return zzxVar == null ? zzx.zzt() : zzxVar;
        }

        @Override // com.google.android.gms.internal.ads.zzbfp.zzf
        public boolean zza() {
            return (this.zzl & 1) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbfp.zzf
        public boolean zzae() {
            return (this.zzl & 256) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbfp.zzf
        public zzz zzaf() {
            zzz zzzVar = this.zzz;
            return zzzVar == null ? zzz.zzA() : zzzVar;
        }

        @Override // com.google.android.gms.internal.ads.zzbfp.zzf
        public List<zzat> zzak() {
            return this.zzA;
        }

        @Override // com.google.android.gms.internal.ads.zzbfp.zzf
        public int zzal() {
            return this.zzA.size();
        }

        @Override // com.google.android.gms.internal.ads.zzbfp.zzf
        public zzat zzam(int i2) {
            return this.zzA.get(i2);
        }

        @Override // com.google.android.gms.internal.ads.zzbfp.zzf
        public EnumC0185zza zzb() {
            EnumC0185zza enumC0185zzaZzc = EnumC0185zza.zzc(this.zzm);
            return enumC0185zzaZzc == null ? EnumC0185zza.AD_INITIATER_UNSPECIFIED : enumC0185zzaZzc;
        }

        public List<? extends zze> zzc() {
            return this.zzu;
        }

        public zze zzd(int i2) {
            return this.zzu.get(i2);
        }

        @Override // com.google.android.gms.internal.ads.zziar
        public final Object zzdc(zziaq zziaqVar, Object obj, Object obj2) {
            zzick zziamVar;
            int iOrdinal = zziaqVar.ordinal();
            if (iOrdinal == 0) {
                return (byte) 1;
            }
            if (iOrdinal == 2) {
                return zziar.zzbv(zzB, "\u0004\u000b\u0000\u0001\u0007\u0011\u000b\u0000\u0002\u0000\u0007᠌\u0000\b᠌\u0001\tဉ\u0002\nဉ\u0003\u000b\u001b\fဉ\u0004\rဉ\u0005\u000eဉ\u0006\u000fဉ\u0007\u0010ဉ\b\u0011\u001b", new Object[]{"zzl", "zzm", EnumC0185zza.zze(), "zzn", zzq.zze(), "zzo", "zzp", "zzu", zzd.class, "zzv", "zzw", "zzx", "zzy", "zzz", "zzA", zzat.class});
            }
            if (iOrdinal == 3) {
                return new zza();
            }
            byte[] bArr = null;
            if (iOrdinal == 4) {
                return new zzb(bArr);
            }
            if (iOrdinal == 5) {
                return zzB;
            }
            if (iOrdinal != 6) {
                throw null;
            }
            zzick<zza> zzickVar = zzC;
            if (zzickVar != null) {
                return zzickVar;
            }
            synchronized (zza.class) {
                try {
                    zziamVar = zzC;
                    if (zziamVar == null) {
                        zziamVar = new zziam(zzB);
                        zzC = zziamVar;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return zziamVar;
        }

        @Override // com.google.android.gms.internal.ads.zzbfp.zzf
        public boolean zze() {
            return (this.zzl & 2) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbfp.zzf
        public zzq zzf() {
            zzq zzqVarZzc = zzq.zzc(this.zzn);
            return zzqVarZzc == null ? zzq.ENUM_UNKNOWN : zzqVarZzc;
        }

        public List<? extends zzbi> zzg() {
            return this.zzA;
        }

        public zzbi zzh(int i2) {
            return this.zzA.get(i2);
        }

        @Override // com.google.android.gms.internal.ads.zzbfp.zzf
        public boolean zzi() {
            return (this.zzl & 4) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbfp.zzf
        public zzg zzj() {
            zzg zzgVar = this.zzo;
            return zzgVar == null ? zzg.zzz() : zzgVar;
        }

        @Override // com.google.android.gms.internal.ads.zzbfp.zzf
        public boolean zzo() {
            return (this.zzl & 8) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbfp.zzf
        public zzi zzp() {
            zzi zziVar = this.zzp;
            return zziVar == null ? zzi.zzD() : zziVar;
        }

        @Override // com.google.android.gms.internal.ads.zzbfp.zzf
        public List<zzd> zzu() {
            return this.zzu;
        }

        @Override // com.google.android.gms.internal.ads.zzbfp.zzf
        public int zzv() {
            return this.zzu.size();
        }

        @Override // com.google.android.gms.internal.ads.zzbfp.zzf
        public zzd zzw(int i2) {
            return this.zzu.get(i2);
        }
    }

    public interface zzaa extends zzicd {
        boolean zza();

        zzv zzb();

        List<zzan> zzg();

        int zzh();

        zzan zzi(int i2);

        boolean zzs();

        zzq zzt();

        boolean zzw();

        zzap zzx();
    }

    public final class zzab extends zziar<zzab, zza> implements zzae {
        public static final int zza = 1;
        public static final int zzb = 2;
        private static final zzab zzf;
        private static volatile zzick<zzab> zzg;
        private int zzc;
        private int zzd;
        private int zze;

        public final class zza extends zzial<zzab, zza> implements zzae {
            public /* synthetic */ zza(byte[] bArr) {
                this();
            }

            @Override // com.google.android.gms.internal.ads.zzbfp.zzae
            public boolean zza() {
                return ((zzab) this.zza).zza();
            }

            @Override // com.google.android.gms.internal.ads.zzbfp.zzae
            public zzc zzb() {
                return ((zzab) this.zza).zzb();
            }

            public zza zzc(zzc zzcVar) {
                zzbg();
                ((zzab) this.zza).zzu(zzcVar);
                return this;
            }

            public zza zzd() {
                zzbg();
                ((zzab) this.zza).zzv();
                return this;
            }

            @Override // com.google.android.gms.internal.ads.zzbfp.zzae
            public boolean zze() {
                return ((zzab) this.zza).zze();
            }

            @Override // com.google.android.gms.internal.ads.zzbfp.zzae
            public zzb zzf() {
                return ((zzab) this.zza).zzf();
            }

            public zza zzg(zzb zzbVar) {
                zzbg();
                ((zzab) this.zza).zzw(zzbVar);
                return this;
            }

            public zza zzh() {
                zzbg();
                ((zzab) this.zza).zzx();
                return this;
            }

            private zza() {
                super(zzab.zzf);
            }
        }

        public enum zzb implements zziav {
            CELLULAR_NETWORK_TYPE_UNSPECIFIED(0),
            TWO_G(1),
            THREE_G(2),
            LTE(4);

            public static final int zze = 0;
            public static final int zzf = 1;
            public static final int zzg = 2;
            public static final int zzh = 4;
            private static final zziaw<zzb> zzi = new zziaw<zzb>() { // from class: com.google.android.gms.internal.ads.zzbfp.zzab.zzb.1
                /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
                public zzb zzb(int i2) {
                    return zzb.zzc(i2);
                }
            };
            private final int zzj;

            final class zza implements zziax {
                static final zziax zza = new zza();

                private zza() {
                }

                @Override // com.google.android.gms.internal.ads.zziax
                public boolean zza(int i2) {
                    return zzb.zzc(i2) != null;
                }
            }

            zzb(int i2) {
                this.zzj = i2;
            }

            public static zzb zzc(int i2) {
                if (i2 == 0) {
                    return CELLULAR_NETWORK_TYPE_UNSPECIFIED;
                }
                if (i2 == 1) {
                    return TWO_G;
                }
                if (i2 == 2) {
                    return THREE_G;
                }
                if (i2 != 4) {
                    return null;
                }
                return LTE;
            }

            public static zziaw<zzb> zzd() {
                return zzi;
            }

            public static zziax zze() {
                return zza.zza;
            }

            @Override // java.lang.Enum
            public final String toString() {
                return Integer.toString(this.zzj);
            }

            @Override // com.google.android.gms.internal.ads.zziav
            public final int zza() {
                return this.zzj;
            }
        }

        public enum zzc implements zziav {
            NETWORKTYPE_UNSPECIFIED(0),
            CELL(1),
            WIFI(2);

            public static final int zzd = 0;
            public static final int zze = 1;
            public static final int zzf = 2;
            private static final zziaw<zzc> zzg = new zziaw<zzc>() { // from class: com.google.android.gms.internal.ads.zzbfp.zzab.zzc.1
                /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
                public zzc zzb(int i2) {
                    return zzc.zzc(i2);
                }
            };
            private final int zzh;

            final class zza implements zziax {
                static final zziax zza = new zza();

                private zza() {
                }

                @Override // com.google.android.gms.internal.ads.zziax
                public boolean zza(int i2) {
                    return zzc.zzc(i2) != null;
                }
            }

            zzc(int i2) {
                this.zzh = i2;
            }

            public static zzc zzc(int i2) {
                if (i2 == 0) {
                    return NETWORKTYPE_UNSPECIFIED;
                }
                if (i2 == 1) {
                    return CELL;
                }
                if (i2 != 2) {
                    return null;
                }
                return WIFI;
            }

            public static zziaw<zzc> zzd() {
                return zzg;
            }

            public static zziax zze() {
                return zza.zza;
            }

            @Override // java.lang.Enum
            public final String toString() {
                return Integer.toString(this.zzh);
            }

            @Override // com.google.android.gms.internal.ads.zziav
            public final int zza() {
                return this.zzh;
            }
        }

        static {
            zzab zzabVar = new zzab();
            zzf = zzabVar;
            zziar.zzbu(zzab.class, zzabVar);
        }

        private zzab() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzA, reason: merged with bridge method [inline-methods] */
        public void zzv() {
            this.zzc &= -2;
            this.zzd = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzB, reason: merged with bridge method [inline-methods] */
        public void zzw(zzb zzbVar) {
            this.zze = zzbVar.zza();
            this.zzc |= 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzC, reason: merged with bridge method [inline-methods] */
        public void zzx() {
            this.zzc &= -3;
            this.zze = 0;
        }

        public static zzab zzc(ByteBuffer byteBuffer) throws zzibg {
            return (zzab) zziar.zzbR(zzf, byteBuffer);
        }

        public static zzab zzd(ByteBuffer byteBuffer, zziab zziabVar) throws zzibg {
            return (zzab) zziar.zzbQ(zzf, byteBuffer, zziabVar);
        }

        public static zzab zzg(zzhzl zzhzlVar) throws zzibg {
            return (zzab) zziar.zzbS(zzf, zzhzlVar);
        }

        public static zzab zzh(zzhzl zzhzlVar, zziab zziabVar) throws zzibg {
            return (zzab) zziar.zzbT(zzf, zzhzlVar, zziabVar);
        }

        public static zzab zzi(byte[] bArr) throws zzibg {
            return (zzab) zziar.zzbU(zzf, bArr);
        }

        public static zzab zzj(byte[] bArr, zziab zziabVar) throws zzibg {
            return (zzab) zziar.zzbV(zzf, bArr, zziabVar);
        }

        public static zzab zzk(InputStream inputStream) throws IOException {
            return (zzab) zziar.zzbW(zzf, inputStream);
        }

        public static zzab zzl(InputStream inputStream, zziab zziabVar) throws IOException {
            return (zzab) zziar.zzbX(zzf, inputStream, zziabVar);
        }

        public static zzab zzm(InputStream inputStream) throws IOException {
            return (zzab) zziar.zzca(zzf, inputStream);
        }

        public static zzab zzn(InputStream inputStream, zziab zziabVar) throws IOException {
            return (zzab) zziar.zzcb(zzf, inputStream, zziabVar);
        }

        public static zzab zzo(zzhzq zzhzqVar) throws IOException {
            return (zzab) zziar.zzbY(zzf, zzhzqVar);
        }

        public static zzab zzp(zzhzq zzhzqVar, zziab zziabVar) throws IOException {
            return (zzab) zziar.zzbZ(zzf, zzhzqVar, zziabVar);
        }

        public static zza zzq() {
            return (zza) zzf.zzbn();
        }

        public static zza zzr(zzab zzabVar) {
            return (zza) zzf.zzbo(zzabVar);
        }

        public static zzab zzs() {
            return zzf;
        }

        public static zzick<zzab> zzt() {
            return zzf.zzbd();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzz, reason: merged with bridge method [inline-methods] */
        public void zzu(zzc zzcVar) {
            this.zzd = zzcVar.zza();
            this.zzc |= 1;
        }

        @Override // com.google.android.gms.internal.ads.zzbfp.zzae
        public boolean zza() {
            return (this.zzc & 1) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbfp.zzae
        public zzc zzb() {
            zzc zzcVarZzc = zzc.zzc(this.zzd);
            return zzcVarZzc == null ? zzc.NETWORKTYPE_UNSPECIFIED : zzcVarZzc;
        }

        @Override // com.google.android.gms.internal.ads.zziar
        public final Object zzdc(zziaq zziaqVar, Object obj, Object obj2) {
            zzick zziamVar;
            int iOrdinal = zziaqVar.ordinal();
            if (iOrdinal == 0) {
                return (byte) 1;
            }
            if (iOrdinal == 2) {
                return zziar.zzbv(zzf, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001", new Object[]{"zzc", "zzd", zzc.zze(), "zze", zzb.zze()});
            }
            if (iOrdinal == 3) {
                return new zzab();
            }
            byte[] bArr = null;
            if (iOrdinal == 4) {
                return new zza(bArr);
            }
            if (iOrdinal == 5) {
                return zzf;
            }
            if (iOrdinal != 6) {
                throw null;
            }
            zzick<zzab> zzickVar = zzg;
            if (zzickVar != null) {
                return zzickVar;
            }
            synchronized (zzab.class) {
                try {
                    zziamVar = zzg;
                    if (zziamVar == null) {
                        zziamVar = new zziam(zzf);
                        zzg = zziamVar;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return zziamVar;
        }

        @Override // com.google.android.gms.internal.ads.zzbfp.zzae
        public boolean zze() {
            return (this.zzc & 2) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbfp.zzae
        public zzb zzf() {
            zzb zzbVarZzc = zzb.zzc(this.zze);
            return zzbVarZzc == null ? zzb.CELLULAR_NETWORK_TYPE_UNSPECIFIED : zzbVarZzc;
        }
    }

    public final class zzac extends zziar<zzac, zza> implements zzad {
        public static final int zza = 1;
        public static final int zzb = 2;
        private static final zzac zzf;
        private static volatile zzick<zzac> zzg;
        private int zzc;
        private int zzd;
        private zzap zze;

        public final class zza extends zzial<zzac, zza> implements zzad {
            public /* synthetic */ zza(byte[] bArr) {
                this();
            }

            @Override // com.google.android.gms.internal.ads.zzbfp.zzad
            public boolean zza() {
                return ((zzac) this.zza).zza();
            }

            @Override // com.google.android.gms.internal.ads.zzbfp.zzad
            public zzq zzb() {
                return ((zzac) this.zza).zzb();
            }

            public zza zzc(zzq zzqVar) {
                zzbg();
                ((zzac) this.zza).zzu(zzqVar);
                return this;
            }

            public zza zzd() {
                zzbg();
                ((zzac) this.zza).zzv();
                return this;
            }

            @Override // com.google.android.gms.internal.ads.zzbfp.zzad
            public boolean zze() {
                return ((zzac) this.zza).zze();
            }

            @Override // com.google.android.gms.internal.ads.zzbfp.zzad
            public zzap zzf() {
                return ((zzac) this.zza).zzf();
            }

            public zza zzg(zzap zzapVar) {
                zzbg();
                ((zzac) this.zza).zzw(zzapVar);
                return this;
            }

            public zza zzh(zzap.zza zzaVar) {
                zzbg();
                ((zzac) this.zza).zzw(zzaVar.zzbu());
                return this;
            }

            public zza zzi(zzap zzapVar) {
                zzbg();
                ((zzac) this.zza).zzx(zzapVar);
                return this;
            }

            public zza zzj() {
                zzbg();
                ((zzac) this.zza).zzy();
                return this;
            }

            private zza() {
                super(zzac.zzf);
            }
        }

        static {
            zzac zzacVar = new zzac();
            zzf = zzacVar;
            zziar.zzbu(zzac.class, zzacVar);
        }

        private zzac() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzA, reason: merged with bridge method [inline-methods] */
        public void zzu(zzq zzqVar) {
            this.zzd = zzqVar.zza();
            this.zzc |= 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzB, reason: merged with bridge method [inline-methods] */
        public void zzv() {
            this.zzc &= -2;
            this.zzd = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzC, reason: merged with bridge method [inline-methods] */
        public void zzw(zzap zzapVar) {
            zzapVar.getClass();
            this.zze = zzapVar;
            this.zzc |= 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzD, reason: merged with bridge method [inline-methods] */
        public void zzx(zzap zzapVar) {
            zzapVar.getClass();
            zzap zzapVar2 = this.zze;
            if (zzapVar2 != null && zzapVar2 != zzap.zzs()) {
                zzap.zza zzaVarZzr = zzap.zzr(zzapVar2);
                zzaVarZzr.zzbo(zzapVar);
                zzapVar = zzaVarZzr.zzbt();
            }
            this.zze = zzapVar;
            this.zzc |= 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzE, reason: merged with bridge method [inline-methods] */
        public void zzy() {
            this.zze = null;
            this.zzc &= -3;
        }

        public static zzac zzc(ByteBuffer byteBuffer) throws zzibg {
            return (zzac) zziar.zzbR(zzf, byteBuffer);
        }

        public static zzac zzd(ByteBuffer byteBuffer, zziab zziabVar) throws zzibg {
            return (zzac) zziar.zzbQ(zzf, byteBuffer, zziabVar);
        }

        public static zzac zzg(zzhzl zzhzlVar) throws zzibg {
            return (zzac) zziar.zzbS(zzf, zzhzlVar);
        }

        public static zzac zzh(zzhzl zzhzlVar, zziab zziabVar) throws zzibg {
            return (zzac) zziar.zzbT(zzf, zzhzlVar, zziabVar);
        }

        public static zzac zzi(byte[] bArr) throws zzibg {
            return (zzac) zziar.zzbU(zzf, bArr);
        }

        public static zzac zzj(byte[] bArr, zziab zziabVar) throws zzibg {
            return (zzac) zziar.zzbV(zzf, bArr, zziabVar);
        }

        public static zzac zzk(InputStream inputStream) throws IOException {
            return (zzac) zziar.zzbW(zzf, inputStream);
        }

        public static zzac zzl(InputStream inputStream, zziab zziabVar) throws IOException {
            return (zzac) zziar.zzbX(zzf, inputStream, zziabVar);
        }

        public static zzac zzm(InputStream inputStream) throws IOException {
            return (zzac) zziar.zzca(zzf, inputStream);
        }

        public static zzac zzn(InputStream inputStream, zziab zziabVar) throws IOException {
            return (zzac) zziar.zzcb(zzf, inputStream, zziabVar);
        }

        public static zzac zzo(zzhzq zzhzqVar) throws IOException {
            return (zzac) zziar.zzbY(zzf, zzhzqVar);
        }

        public static zzac zzp(zzhzq zzhzqVar, zziab zziabVar) throws IOException {
            return (zzac) zziar.zzbZ(zzf, zzhzqVar, zziabVar);
        }

        public static zza zzq() {
            return (zza) zzf.zzbn();
        }

        public static zza zzr(zzac zzacVar) {
            return (zza) zzf.zzbo(zzacVar);
        }

        public static zzac zzs() {
            return zzf;
        }

        public static zzick<zzac> zzt() {
            return zzf.zzbd();
        }

        @Override // com.google.android.gms.internal.ads.zzbfp.zzad
        public boolean zza() {
            return (this.zzc & 1) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbfp.zzad
        public zzq zzb() {
            zzq zzqVarZzc = zzq.zzc(this.zzd);
            return zzqVarZzc == null ? zzq.ENUM_FALSE : zzqVarZzc;
        }

        @Override // com.google.android.gms.internal.ads.zziar
        public final Object zzdc(zziaq zziaqVar, Object obj, Object obj2) {
            zzick zziamVar;
            int iOrdinal = zziaqVar.ordinal();
            if (iOrdinal == 0) {
                return (byte) 1;
            }
            if (iOrdinal == 2) {
                return zziar.zzbv(zzf, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002ဉ\u0001", new Object[]{"zzc", "zzd", zzq.zze(), "zze"});
            }
            if (iOrdinal == 3) {
                return new zzac();
            }
            byte[] bArr = null;
            if (iOrdinal == 4) {
                return new zza(bArr);
            }
            if (iOrdinal == 5) {
                return zzf;
            }
            if (iOrdinal != 6) {
                throw null;
            }
            zzick<zzac> zzickVar = zzg;
            if (zzickVar != null) {
                return zzickVar;
            }
            synchronized (zzac.class) {
                try {
                    zziamVar = zzg;
                    if (zziamVar == null) {
                        zziamVar = new zziam(zzf);
                        zzg = zziamVar;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return zziamVar;
        }

        @Override // com.google.android.gms.internal.ads.zzbfp.zzad
        public boolean zze() {
            return (this.zzc & 2) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbfp.zzad
        public zzap zzf() {
            zzap zzapVar = this.zze;
            return zzapVar == null ? zzap.zzs() : zzapVar;
        }
    }

    public interface zzad extends zzicd {
        boolean zza();

        zzq zzb();

        boolean zze();

        zzap zzf();
    }

    public interface zzae extends zzicd {
        boolean zza();

        zzab.zzc zzb();

        boolean zze();

        zzab.zzb zzf();
    }

    public final class zzaf extends zziar<zzaf, zzc> implements zzag {
        public static final int zza = 1;
        public static final int zzb = 2;
        public static final int zzc = 3;
        public static final int zzd = 4;
        public static final int zze = 5;
        public static final int zzf = 6;
        public static final int zzg = 7;
        public static final int zzh = 8;
        private static final zzaf zzv;
        private static volatile zzick<zzaf> zzw;
        private int zzi;
        private int zzk;
        private int zzl;
        private long zzm;
        private long zzp;
        private int zzu;
        private zzibd<zza> zzj = zziar.zzbM();
        private String zzn = "";
        private String zzo = "";

        public final class zza extends zziar<zza, C0187zza> implements zzb {
            private static final zza zzG;
            private static volatile zzick<zza> zzH = null;
            public static final int zza = 1;
            public static final int zzb = 2;
            public static final int zzc = 3;
            public static final int zzd = 4;
            public static final int zze = 5;
            public static final int zzf = 6;
            public static final int zzg = 7;
            public static final int zzh = 8;
            public static final int zzi = 9;
            public static final int zzj = 10;
            public static final int zzk = 11;
            public static final int zzl = 12;
            public static final int zzm = 13;
            private static final zziba<zzd.zza> zzx = new zziba<zzd.zza>() { // from class: com.google.android.gms.internal.ads.zzbfp.zzaf.zza.1
                @Override // com.google.android.gms.internal.ads.zziba
                /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
                public zzd.zza zzb(int i2) {
                    zzd.zza zzaVarZzc = zzd.zza.zzc(i2);
                    return zzaVarZzc == null ? zzd.zza.AD_FORMAT_TYPE_UNSPECIFIED : zzaVarZzc;
                }
            };
            private int zzA;
            private int zzB;
            private int zzC;
            private int zzD;
            private int zzE;
            private long zzF;
            private int zzn;
            private long zzo;
            private int zzp;
            private long zzu;
            private long zzv;
            private zziaz zzw = zziar.zzbC();
            private zzab zzy;
            private int zzz;

            /* JADX INFO: renamed from: com.google.android.gms.internal.ads.zzbfp$zzaf$zza$zza, reason: collision with other inner class name */
            public final class C0187zza extends zzial<zza, C0187zza> implements zzb {
                public /* synthetic */ C0187zza(byte[] bArr) {
                    this();
                }

                public C0187zza zzA(zzab.zza zzaVar) {
                    zzbg();
                    ((zza) this.zza).zzad(zzaVar.zzbu());
                    return this;
                }

                public C0187zza zzB(zzab zzabVar) {
                    zzbg();
                    ((zza) this.zza).zzae(zzabVar);
                    return this;
                }

                public C0187zza zzC() {
                    zzbg();
                    ((zza) this.zza).zzaf();
                    return this;
                }

                @Override // com.google.android.gms.internal.ads.zzbfp.zzaf.zzb
                public boolean zzD() {
                    return ((zza) this.zza).zzD();
                }

                @Override // com.google.android.gms.internal.ads.zzbfp.zzaf.zzb
                public zzq zzE() {
                    return ((zza) this.zza).zzE();
                }

                public C0187zza zzF(zzq zzqVar) {
                    zzbg();
                    ((zza) this.zza).zzag(zzqVar);
                    return this;
                }

                public C0187zza zzG() {
                    zzbg();
                    ((zza) this.zza).zzah();
                    return this;
                }

                @Override // com.google.android.gms.internal.ads.zzbfp.zzaf.zzb
                public boolean zzH() {
                    return ((zza) this.zza).zzH();
                }

                @Override // com.google.android.gms.internal.ads.zzbfp.zzaf.zzb
                public zzq zzI() {
                    return ((zza) this.zza).zzI();
                }

                public C0187zza zzJ(zzq zzqVar) {
                    zzbg();
                    ((zza) this.zza).zzai(zzqVar);
                    return this;
                }

                public C0187zza zzK() {
                    zzbg();
                    ((zza) this.zza).zzaj();
                    return this;
                }

                @Override // com.google.android.gms.internal.ads.zzbfp.zzaf.zzb
                public boolean zzL() {
                    return ((zza) this.zza).zzL();
                }

                @Override // com.google.android.gms.internal.ads.zzbfp.zzaf.zzb
                public zzq zzM() {
                    return ((zza) this.zza).zzM();
                }

                public C0187zza zzN(zzq zzqVar) {
                    zzbg();
                    ((zza) this.zza).zzak(zzqVar);
                    return this;
                }

                public C0187zza zzO() {
                    zzbg();
                    ((zza) this.zza).zzal();
                    return this;
                }

                @Override // com.google.android.gms.internal.ads.zzbfp.zzaf.zzb
                public boolean zzP() {
                    return ((zza) this.zza).zzP();
                }

                @Override // com.google.android.gms.internal.ads.zzbfp.zzaf.zzb
                public int zzQ() {
                    return ((zza) this.zza).zzQ();
                }

                public C0187zza zzR(int i2) {
                    zzbg();
                    ((zza) this.zza).zzam(i2);
                    return this;
                }

                public C0187zza zzS() {
                    zzbg();
                    ((zza) this.zza).zzan();
                    return this;
                }

                @Override // com.google.android.gms.internal.ads.zzbfp.zzaf.zzb
                public boolean zzT() {
                    return ((zza) this.zza).zzT();
                }

                @Override // com.google.android.gms.internal.ads.zzbfp.zzaf.zzb
                public zzq zzU() {
                    return ((zza) this.zza).zzU();
                }

                public C0187zza zzV(zzq zzqVar) {
                    zzbg();
                    ((zza) this.zza).zzao(zzqVar);
                    return this;
                }

                public C0187zza zzW() {
                    zzbg();
                    ((zza) this.zza).zzap();
                    return this;
                }

                @Override // com.google.android.gms.internal.ads.zzbfp.zzaf.zzb
                public boolean zzX() {
                    return ((zza) this.zza).zzX();
                }

                @Override // com.google.android.gms.internal.ads.zzbfp.zzaf.zzb
                public zzd zzY() {
                    return ((zza) this.zza).zzY();
                }

                public C0187zza zzZ(zzd zzdVar) {
                    zzbg();
                    ((zza) this.zza).zzaq(zzdVar);
                    return this;
                }

                @Override // com.google.android.gms.internal.ads.zzbfp.zzaf.zzb
                public boolean zza() {
                    return ((zza) this.zza).zza();
                }

                public C0187zza zzaa() {
                    zzbg();
                    ((zza) this.zza).zzar();
                    return this;
                }

                @Override // com.google.android.gms.internal.ads.zzbfp.zzaf.zzb
                public boolean zzab() {
                    return ((zza) this.zza).zzab();
                }

                @Override // com.google.android.gms.internal.ads.zzbfp.zzaf.zzb
                public long zzac() {
                    return ((zza) this.zza).zzac();
                }

                public C0187zza zzad(long j) {
                    zzbg();
                    ((zza) this.zza).zzas(j);
                    return this;
                }

                public C0187zza zzae() {
                    zzbg();
                    ((zza) this.zza).zzat();
                    return this;
                }

                @Override // com.google.android.gms.internal.ads.zzbfp.zzaf.zzb
                public long zzb() {
                    return ((zza) this.zza).zzb();
                }

                public C0187zza zzc(long j) {
                    zzbg();
                    ((zza) this.zza).zzF(j);
                    return this;
                }

                public C0187zza zzd() {
                    zzbg();
                    ((zza) this.zza).zzG();
                    return this;
                }

                @Override // com.google.android.gms.internal.ads.zzbfp.zzaf.zzb
                public boolean zze() {
                    return ((zza) this.zza).zze();
                }

                @Override // com.google.android.gms.internal.ads.zzbfp.zzaf.zzb
                public zzq zzf() {
                    return ((zza) this.zza).zzf();
                }

                public C0187zza zzg(zzq zzqVar) {
                    zzbg();
                    ((zza) this.zza).zzJ(zzqVar);
                    return this;
                }

                public C0187zza zzh() {
                    zzbg();
                    ((zza) this.zza).zzK();
                    return this;
                }

                @Override // com.google.android.gms.internal.ads.zzbfp.zzaf.zzb
                public boolean zzi() {
                    return ((zza) this.zza).zzi();
                }

                @Override // com.google.android.gms.internal.ads.zzbfp.zzaf.zzb
                public long zzj() {
                    return ((zza) this.zza).zzj();
                }

                public C0187zza zzk(long j) {
                    zzbg();
                    ((zza) this.zza).zzN(j);
                    return this;
                }

                public C0187zza zzl() {
                    zzbg();
                    ((zza) this.zza).zzO();
                    return this;
                }

                @Override // com.google.android.gms.internal.ads.zzbfp.zzaf.zzb
                public boolean zzm() {
                    return ((zza) this.zza).zzm();
                }

                @Override // com.google.android.gms.internal.ads.zzbfp.zzaf.zzb
                public long zzn() {
                    return ((zza) this.zza).zzn();
                }

                public C0187zza zzo(long j) {
                    zzbg();
                    ((zza) this.zza).zzR(j);
                    return this;
                }

                public C0187zza zzp() {
                    zzbg();
                    ((zza) this.zza).zzS();
                    return this;
                }

                @Override // com.google.android.gms.internal.ads.zzbfp.zzaf.zzb
                public List<zzd.zza> zzq() {
                    return ((zza) this.zza).zzq();
                }

                @Override // com.google.android.gms.internal.ads.zzbfp.zzaf.zzb
                public int zzr() {
                    return ((zza) this.zza).zzr();
                }

                @Override // com.google.android.gms.internal.ads.zzbfp.zzaf.zzb
                public zzd.zza zzs(int i2) {
                    return ((zza) this.zza).zzs(i2);
                }

                public C0187zza zzt(int i2, zzd.zza zzaVar) {
                    zzbg();
                    ((zza) this.zza).zzV(i2, zzaVar);
                    return this;
                }

                public C0187zza zzu(zzd.zza zzaVar) {
                    zzbg();
                    ((zza) this.zza).zzW(zzaVar);
                    return this;
                }

                public C0187zza zzv(Iterable<? extends zzd.zza> iterable) {
                    zzbg();
                    ((zza) this.zza).zzZ(iterable);
                    return this;
                }

                public C0187zza zzw() {
                    zzbg();
                    ((zza) this.zza).zzaa();
                    return this;
                }

                @Override // com.google.android.gms.internal.ads.zzbfp.zzaf.zzb
                public boolean zzx() {
                    return ((zza) this.zza).zzx();
                }

                @Override // com.google.android.gms.internal.ads.zzbfp.zzaf.zzb
                public zzab zzy() {
                    return ((zza) this.zza).zzy();
                }

                public C0187zza zzz(zzab zzabVar) {
                    zzbg();
                    ((zza) this.zza).zzad(zzabVar);
                    return this;
                }

                private C0187zza() {
                    super(zza.zzG);
                }
            }

            static {
                zza zzaVar = new zza();
                zzG = zzaVar;
                zziar.zzbu(zza.class, zzaVar);
            }

            private zza() {
            }

            public static C0187zza zzA(zza zzaVar) {
                return (C0187zza) zzG.zzbo(zzaVar);
            }

            public static zza zzB() {
                return zzG;
            }

            public static zzick<zza> zzC() {
                return zzG.zzbd();
            }

            /* JADX INFO: Access modifiers changed from: private */
            /* JADX INFO: renamed from: zzaA, reason: merged with bridge method [inline-methods] */
            public void zzO() {
                this.zzn &= -5;
                this.zzu = 0L;
            }

            /* JADX INFO: Access modifiers changed from: private */
            /* JADX INFO: renamed from: zzaB, reason: merged with bridge method [inline-methods] */
            public void zzR(long j) {
                this.zzn |= 8;
                this.zzv = j;
            }

            /* JADX INFO: Access modifiers changed from: private */
            /* JADX INFO: renamed from: zzaC, reason: merged with bridge method [inline-methods] */
            public void zzS() {
                this.zzn &= -9;
                this.zzv = 0L;
            }

            private void zzaD() {
                zziaz zziazVar = this.zzw;
                if (zziazVar.zza()) {
                    return;
                }
                this.zzw = zziar.zzbD(zziazVar);
            }

            /* JADX INFO: Access modifiers changed from: private */
            /* JADX INFO: renamed from: zzaE, reason: merged with bridge method [inline-methods] */
            public void zzV(int i2, zzd.zza zzaVar) {
                zzaVar.getClass();
                zzaD();
                this.zzw.zzg(i2, zzaVar.zza());
            }

            /* JADX INFO: Access modifiers changed from: private */
            /* JADX INFO: renamed from: zzaF, reason: merged with bridge method [inline-methods] */
            public void zzW(zzd.zza zzaVar) {
                zzaVar.getClass();
                zzaD();
                this.zzw.zzi(zzaVar.zza());
            }

            /* JADX INFO: Access modifiers changed from: private */
            /* JADX INFO: renamed from: zzaG, reason: merged with bridge method [inline-methods] */
            public void zzZ(Iterable<? extends zzd.zza> iterable) {
                zzaD();
                Iterator<? extends zzd.zza> it = iterable.iterator();
                while (it.hasNext()) {
                    this.zzw.zzi(it.next().zza());
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            /* JADX INFO: renamed from: zzaH, reason: merged with bridge method [inline-methods] */
            public void zzaa() {
                this.zzw = zziar.zzbC();
            }

            /* JADX INFO: Access modifiers changed from: private */
            /* JADX INFO: renamed from: zzaI, reason: merged with bridge method [inline-methods] */
            public void zzad(zzab zzabVar) {
                zzabVar.getClass();
                this.zzy = zzabVar;
                this.zzn |= 16;
            }

            /* JADX INFO: Access modifiers changed from: private */
            /* JADX INFO: renamed from: zzaJ, reason: merged with bridge method [inline-methods] */
            public void zzae(zzab zzabVar) {
                zzabVar.getClass();
                zzab zzabVar2 = this.zzy;
                if (zzabVar2 != null && zzabVar2 != zzab.zzs()) {
                    zzab.zza zzaVarZzr = zzab.zzr(zzabVar2);
                    zzaVarZzr.zzbo(zzabVar);
                    zzabVar = zzaVarZzr.zzbt();
                }
                this.zzy = zzabVar;
                this.zzn |= 16;
            }

            /* JADX INFO: Access modifiers changed from: private */
            /* JADX INFO: renamed from: zzaK, reason: merged with bridge method [inline-methods] */
            public void zzaf() {
                this.zzy = null;
                this.zzn &= -17;
            }

            /* JADX INFO: Access modifiers changed from: private */
            /* JADX INFO: renamed from: zzaL, reason: merged with bridge method [inline-methods] */
            public void zzag(zzq zzqVar) {
                this.zzz = zzqVar.zza();
                this.zzn |= 32;
            }

            /* JADX INFO: Access modifiers changed from: private */
            /* JADX INFO: renamed from: zzav, reason: merged with bridge method [inline-methods] */
            public void zzF(long j) {
                this.zzn |= 1;
                this.zzo = j;
            }

            /* JADX INFO: Access modifiers changed from: private */
            /* JADX INFO: renamed from: zzaw, reason: merged with bridge method [inline-methods] */
            public void zzG() {
                this.zzn &= -2;
                this.zzo = 0L;
            }

            /* JADX INFO: Access modifiers changed from: private */
            /* JADX INFO: renamed from: zzax, reason: merged with bridge method [inline-methods] */
            public void zzJ(zzq zzqVar) {
                this.zzp = zzqVar.zza();
                this.zzn |= 2;
            }

            /* JADX INFO: Access modifiers changed from: private */
            /* JADX INFO: renamed from: zzay, reason: merged with bridge method [inline-methods] */
            public void zzK() {
                this.zzn &= -3;
                this.zzp = 0;
            }

            /* JADX INFO: Access modifiers changed from: private */
            /* JADX INFO: renamed from: zzaz, reason: merged with bridge method [inline-methods] */
            public void zzN(long j) {
                this.zzn |= 4;
                this.zzu = j;
            }

            public static zza zzc(ByteBuffer byteBuffer) throws zzibg {
                return (zza) zziar.zzbR(zzG, byteBuffer);
            }

            /* JADX INFO: Access modifiers changed from: private */
            /* JADX INFO: renamed from: zzce, reason: merged with bridge method [inline-methods] */
            public void zzah() {
                this.zzn &= -33;
                this.zzz = 0;
            }

            /* JADX INFO: Access modifiers changed from: private */
            /* JADX INFO: renamed from: zzcf, reason: merged with bridge method [inline-methods] */
            public void zzai(zzq zzqVar) {
                this.zzA = zzqVar.zza();
                this.zzn |= 64;
            }

            /* JADX INFO: Access modifiers changed from: private */
            /* JADX INFO: renamed from: zzcg, reason: merged with bridge method [inline-methods] */
            public void zzaj() {
                this.zzn &= -65;
                this.zzA = 0;
            }

            /* JADX INFO: Access modifiers changed from: private */
            /* JADX INFO: renamed from: zzch, reason: merged with bridge method [inline-methods] */
            public void zzak(zzq zzqVar) {
                this.zzB = zzqVar.zza();
                this.zzn |= 128;
            }

            /* JADX INFO: Access modifiers changed from: private */
            /* JADX INFO: renamed from: zzci, reason: merged with bridge method [inline-methods] */
            public void zzal() {
                this.zzn &= -129;
                this.zzB = 0;
            }

            /* JADX INFO: Access modifiers changed from: private */
            /* JADX INFO: renamed from: zzcj, reason: merged with bridge method [inline-methods] */
            public void zzam(int i2) {
                this.zzn |= 256;
                this.zzC = i2;
            }

            /* JADX INFO: Access modifiers changed from: private */
            /* JADX INFO: renamed from: zzck, reason: merged with bridge method [inline-methods] */
            public void zzan() {
                this.zzn &= -257;
                this.zzC = 0;
            }

            /* JADX INFO: Access modifiers changed from: private */
            /* JADX INFO: renamed from: zzcl, reason: merged with bridge method [inline-methods] */
            public void zzao(zzq zzqVar) {
                this.zzD = zzqVar.zza();
                this.zzn |= 512;
            }

            /* JADX INFO: Access modifiers changed from: private */
            /* JADX INFO: renamed from: zzcm, reason: merged with bridge method [inline-methods] */
            public void zzap() {
                this.zzn &= -513;
                this.zzD = 0;
            }

            /* JADX INFO: Access modifiers changed from: private */
            /* JADX INFO: renamed from: zzcn, reason: merged with bridge method [inline-methods] */
            public void zzaq(zzd zzdVar) {
                this.zzE = zzdVar.zza();
                this.zzn |= 1024;
            }

            /* JADX INFO: Access modifiers changed from: private */
            /* JADX INFO: renamed from: zzco, reason: merged with bridge method [inline-methods] */
            public void zzar() {
                this.zzn &= -1025;
                this.zzE = 0;
            }

            /* JADX INFO: Access modifiers changed from: private */
            /* JADX INFO: renamed from: zzcp, reason: merged with bridge method [inline-methods] */
            public void zzas(long j) {
                this.zzn |= com.p004ironsource.mediationsdk.metadata.a.f25965n;
                this.zzF = j;
            }

            /* JADX INFO: Access modifiers changed from: private */
            /* JADX INFO: renamed from: zzcq, reason: merged with bridge method [inline-methods] */
            public void zzat() {
                this.zzn &= -2049;
                this.zzF = 0L;
            }

            public static zza zzd(ByteBuffer byteBuffer, zziab zziabVar) throws zzibg {
                return (zza) zziar.zzbQ(zzG, byteBuffer, zziabVar);
            }

            public static zza zzg(zzhzl zzhzlVar) throws zzibg {
                return (zza) zziar.zzbS(zzG, zzhzlVar);
            }

            public static zza zzh(zzhzl zzhzlVar, zziab zziabVar) throws zzibg {
                return (zza) zziar.zzbT(zzG, zzhzlVar, zziabVar);
            }

            public static zza zzk(byte[] bArr) throws zzibg {
                return (zza) zziar.zzbU(zzG, bArr);
            }

            public static zza zzl(byte[] bArr, zziab zziabVar) throws zzibg {
                return (zza) zziar.zzbV(zzG, bArr, zziabVar);
            }

            public static zza zzo(InputStream inputStream) throws IOException {
                return (zza) zziar.zzbW(zzG, inputStream);
            }

            public static zza zzp(InputStream inputStream, zziab zziabVar) throws IOException {
                return (zza) zziar.zzbX(zzG, inputStream, zziabVar);
            }

            public static zza zzt(InputStream inputStream) throws IOException {
                return (zza) zziar.zzca(zzG, inputStream);
            }

            public static zza zzu(InputStream inputStream, zziab zziabVar) throws IOException {
                return (zza) zziar.zzcb(zzG, inputStream, zziabVar);
            }

            public static zza zzv(zzhzq zzhzqVar) throws IOException {
                return (zza) zziar.zzbY(zzG, zzhzqVar);
            }

            public static zza zzw(zzhzq zzhzqVar, zziab zziabVar) throws IOException {
                return (zza) zziar.zzbZ(zzG, zzhzqVar, zziabVar);
            }

            public static C0187zza zzz() {
                return (C0187zza) zzG.zzbn();
            }

            @Override // com.google.android.gms.internal.ads.zzbfp.zzaf.zzb
            public boolean zzD() {
                return (this.zzn & 32) != 0;
            }

            @Override // com.google.android.gms.internal.ads.zzbfp.zzaf.zzb
            public zzq zzE() {
                zzq zzqVarZzc = zzq.zzc(this.zzz);
                return zzqVarZzc == null ? zzq.ENUM_FALSE : zzqVarZzc;
            }

            @Override // com.google.android.gms.internal.ads.zzbfp.zzaf.zzb
            public boolean zzH() {
                return (this.zzn & 64) != 0;
            }

            @Override // com.google.android.gms.internal.ads.zzbfp.zzaf.zzb
            public zzq zzI() {
                zzq zzqVarZzc = zzq.zzc(this.zzA);
                return zzqVarZzc == null ? zzq.ENUM_FALSE : zzqVarZzc;
            }

            @Override // com.google.android.gms.internal.ads.zzbfp.zzaf.zzb
            public boolean zzL() {
                return (this.zzn & 128) != 0;
            }

            @Override // com.google.android.gms.internal.ads.zzbfp.zzaf.zzb
            public zzq zzM() {
                zzq zzqVarZzc = zzq.zzc(this.zzB);
                return zzqVarZzc == null ? zzq.ENUM_FALSE : zzqVarZzc;
            }

            @Override // com.google.android.gms.internal.ads.zzbfp.zzaf.zzb
            public boolean zzP() {
                return (this.zzn & 256) != 0;
            }

            @Override // com.google.android.gms.internal.ads.zzbfp.zzaf.zzb
            public int zzQ() {
                return this.zzC;
            }

            @Override // com.google.android.gms.internal.ads.zzbfp.zzaf.zzb
            public boolean zzT() {
                return (this.zzn & 512) != 0;
            }

            @Override // com.google.android.gms.internal.ads.zzbfp.zzaf.zzb
            public zzq zzU() {
                zzq zzqVarZzc = zzq.zzc(this.zzD);
                return zzqVarZzc == null ? zzq.ENUM_FALSE : zzqVarZzc;
            }

            @Override // com.google.android.gms.internal.ads.zzbfp.zzaf.zzb
            public boolean zzX() {
                return (this.zzn & 1024) != 0;
            }

            @Override // com.google.android.gms.internal.ads.zzbfp.zzaf.zzb
            public zzd zzY() {
                zzd zzdVarZzc = zzd.zzc(this.zzE);
                return zzdVarZzc == null ? zzd.UNSPECIFIED : zzdVarZzc;
            }

            @Override // com.google.android.gms.internal.ads.zzbfp.zzaf.zzb
            public boolean zza() {
                return (this.zzn & 1) != 0;
            }

            @Override // com.google.android.gms.internal.ads.zzbfp.zzaf.zzb
            public boolean zzab() {
                return (this.zzn & com.p004ironsource.mediationsdk.metadata.a.f25965n) != 0;
            }

            @Override // com.google.android.gms.internal.ads.zzbfp.zzaf.zzb
            public long zzac() {
                return this.zzF;
            }

            @Override // com.google.android.gms.internal.ads.zzbfp.zzaf.zzb
            public long zzb() {
                return this.zzo;
            }

            @Override // com.google.android.gms.internal.ads.zziar
            public final Object zzdc(zziaq zziaqVar, Object obj, Object obj2) {
                zzick zziamVar;
                int iOrdinal = zziaqVar.ordinal();
                if (iOrdinal == 0) {
                    return (byte) 1;
                }
                if (iOrdinal == 2) {
                    return zziar.zzbv(zzG, "\u0004\r\u0000\u0001\u0001\r\r\u0000\u0001\u0000\u0001ဂ\u0000\u0002᠌\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005ࠞ\u0006ဉ\u0004\u0007᠌\u0005\b᠌\u0006\t᠌\u0007\nင\b\u000b᠌\t\f᠌\n\rဂ\u000b", new Object[]{"zzn", "zzo", "zzp", zzq.zze(), "zzu", "zzv", "zzw", zzd.zza.zze(), "zzy", "zzz", zzq.zze(), "zzA", zzq.zze(), "zzB", zzq.zze(), "zzC", "zzD", zzq.zze(), "zzE", zzd.zze(), "zzF"});
                }
                if (iOrdinal == 3) {
                    return new zza();
                }
                byte[] bArr = null;
                if (iOrdinal == 4) {
                    return new C0187zza(bArr);
                }
                if (iOrdinal == 5) {
                    return zzG;
                }
                if (iOrdinal != 6) {
                    throw null;
                }
                zzick<zza> zzickVar = zzH;
                if (zzickVar != null) {
                    return zzickVar;
                }
                synchronized (zza.class) {
                    try {
                        zziamVar = zzH;
                        if (zziamVar == null) {
                            zziamVar = new zziam(zzG);
                            zzH = zziamVar;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return zziamVar;
            }

            @Override // com.google.android.gms.internal.ads.zzbfp.zzaf.zzb
            public boolean zze() {
                return (this.zzn & 2) != 0;
            }

            @Override // com.google.android.gms.internal.ads.zzbfp.zzaf.zzb
            public zzq zzf() {
                zzq zzqVarZzc = zzq.zzc(this.zzp);
                return zzqVarZzc == null ? zzq.ENUM_FALSE : zzqVarZzc;
            }

            @Override // com.google.android.gms.internal.ads.zzbfp.zzaf.zzb
            public boolean zzi() {
                return (this.zzn & 4) != 0;
            }

            @Override // com.google.android.gms.internal.ads.zzbfp.zzaf.zzb
            public long zzj() {
                return this.zzu;
            }

            @Override // com.google.android.gms.internal.ads.zzbfp.zzaf.zzb
            public boolean zzm() {
                return (this.zzn & 8) != 0;
            }

            @Override // com.google.android.gms.internal.ads.zzbfp.zzaf.zzb
            public long zzn() {
                return this.zzv;
            }

            @Override // com.google.android.gms.internal.ads.zzbfp.zzaf.zzb
            public List<zzd.zza> zzq() {
                return new zzibb(this.zzw, zzx);
            }

            @Override // com.google.android.gms.internal.ads.zzbfp.zzaf.zzb
            public int zzr() {
                return this.zzw.size();
            }

            @Override // com.google.android.gms.internal.ads.zzbfp.zzaf.zzb
            public zzd.zza zzs(int i2) {
                zzd.zza zzaVarZzc = zzd.zza.zzc(this.zzw.zzf(i2));
                return zzaVarZzc == null ? zzd.zza.AD_FORMAT_TYPE_UNSPECIFIED : zzaVarZzc;
            }

            @Override // com.google.android.gms.internal.ads.zzbfp.zzaf.zzb
            public boolean zzx() {
                return (this.zzn & 16) != 0;
            }

            @Override // com.google.android.gms.internal.ads.zzbfp.zzaf.zzb
            public zzab zzy() {
                zzab zzabVar = this.zzy;
                return zzabVar == null ? zzab.zzs() : zzabVar;
            }
        }

        public interface zzb extends zzicd {
            boolean zzD();

            zzq zzE();

            boolean zzH();

            zzq zzI();

            boolean zzL();

            zzq zzM();

            boolean zzP();

            int zzQ();

            boolean zzT();

            zzq zzU();

            boolean zzX();

            zzd zzY();

            boolean zza();

            boolean zzab();

            long zzac();

            long zzb();

            boolean zze();

            zzq zzf();

            boolean zzi();

            long zzj();

            boolean zzm();

            long zzn();

            List<zzd.zza> zzq();

            int zzr();

            zzd.zza zzs(int i2);

            boolean zzx();

            zzab zzy();
        }

        public final class zzc extends zzial<zzaf, zzc> implements zzag {
            public /* synthetic */ zzc(byte[] bArr) {
                this();
            }

            @Override // com.google.android.gms.internal.ads.zzbfp.zzag
            public zzhzl zzA() {
                return ((zzaf) this.zza).zzA();
            }

            public zzc zzB(String str) {
                zzbg();
                ((zzaf) this.zza).zzY(str);
                return this;
            }

            public zzc zzC() {
                zzbg();
                ((zzaf) this.zza).zzZ();
                return this;
            }

            public zzc zzD(zzhzl zzhzlVar) {
                zzbg();
                ((zzaf) this.zza).zzaa(zzhzlVar);
                return this;
            }

            @Override // com.google.android.gms.internal.ads.zzbfp.zzag
            public boolean zzE() {
                return ((zzaf) this.zza).zzE();
            }

            @Override // com.google.android.gms.internal.ads.zzbfp.zzag
            public String zzF() {
                return ((zzaf) this.zza).zzF();
            }

            @Override // com.google.android.gms.internal.ads.zzbfp.zzag
            public zzhzl zzG() {
                return ((zzaf) this.zza).zzG();
            }

            public zzc zzH(String str) {
                zzbg();
                ((zzaf) this.zza).zzab(str);
                return this;
            }

            public zzc zzI() {
                zzbg();
                ((zzaf) this.zza).zzac();
                return this;
            }

            public zzc zzJ(zzhzl zzhzlVar) {
                zzbg();
                ((zzaf) this.zza).zzad(zzhzlVar);
                return this;
            }

            @Override // com.google.android.gms.internal.ads.zzbfp.zzag
            public boolean zzK() {
                return ((zzaf) this.zza).zzK();
            }

            @Override // com.google.android.gms.internal.ads.zzbfp.zzag
            public long zzL() {
                return ((zzaf) this.zza).zzL();
            }

            public zzc zzM(long j) {
                zzbg();
                ((zzaf) this.zza).zzae(j);
                return this;
            }

            public zzc zzN() {
                zzbg();
                ((zzaf) this.zza).zzaf();
                return this;
            }

            @Override // com.google.android.gms.internal.ads.zzbfp.zzag
            public boolean zzO() {
                return ((zzaf) this.zza).zzO();
            }

            @Override // com.google.android.gms.internal.ads.zzbfp.zzag
            public int zzP() {
                return ((zzaf) this.zza).zzP();
            }

            public zzc zzQ(int i2) {
                zzbg();
                ((zzaf) this.zza).zzag(i2);
                return this;
            }

            public zzc zzR() {
                zzbg();
                ((zzaf) this.zza).zzah();
                return this;
            }

            @Override // com.google.android.gms.internal.ads.zzbfp.zzag
            public List<zza> zza() {
                return Collections.unmodifiableList(((zzaf) this.zza).zza());
            }

            @Override // com.google.android.gms.internal.ads.zzbfp.zzag
            public int zzb() {
                return ((zzaf) this.zza).zzb();
            }

            @Override // com.google.android.gms.internal.ads.zzbfp.zzag
            public zza zzc(int i2) {
                return ((zzaf) this.zza).zzc(i2);
            }

            public zzc zzd(int i2, zza zzaVar) {
                zzbg();
                ((zzaf) this.zza).zzI(i2, zzaVar);
                return this;
            }

            public zzc zze(int i2, zza.C0187zza c0187zza) {
                zzbg();
                ((zzaf) this.zza).zzI(i2, c0187zza.zzbu());
                return this;
            }

            public zzc zzf(zza zzaVar) {
                zzbg();
                ((zzaf) this.zza).zzJ(zzaVar);
                return this;
            }

            public zzc zzg(int i2, zza zzaVar) {
                zzbg();
                ((zzaf) this.zza).zzM(i2, zzaVar);
                return this;
            }

            public zzc zzh(zza.C0187zza c0187zza) {
                zzbg();
                ((zzaf) this.zza).zzJ(c0187zza.zzbu());
                return this;
            }

            public zzc zzi(int i2, zza.C0187zza c0187zza) {
                zzbg();
                ((zzaf) this.zza).zzM(i2, c0187zza.zzbu());
                return this;
            }

            public zzc zzj(Iterable<? extends zza> iterable) {
                zzbg();
                ((zzaf) this.zza).zzN(iterable);
                return this;
            }

            public zzc zzk() {
                zzbg();
                ((zzaf) this.zza).zzQ();
                return this;
            }

            public zzc zzl(int i2) {
                zzbg();
                ((zzaf) this.zza).zzR(i2);
                return this;
            }

            @Override // com.google.android.gms.internal.ads.zzbfp.zzag
            public boolean zzm() {
                return ((zzaf) this.zza).zzm();
            }

            @Override // com.google.android.gms.internal.ads.zzbfp.zzag
            public int zzn() {
                return ((zzaf) this.zza).zzn();
            }

            public zzc zzo(int i2) {
                zzbg();
                ((zzaf) this.zza).zzS(i2);
                return this;
            }

            public zzc zzp() {
                zzbg();
                ((zzaf) this.zza).zzT();
                return this;
            }

            @Override // com.google.android.gms.internal.ads.zzbfp.zzag
            public boolean zzq() {
                return ((zzaf) this.zza).zzq();
            }

            @Override // com.google.android.gms.internal.ads.zzbfp.zzag
            public int zzr() {
                return ((zzaf) this.zza).zzr();
            }

            public zzc zzs(int i2) {
                zzbg();
                ((zzaf) this.zza).zzU(i2);
                return this;
            }

            public zzc zzt() {
                zzbg();
                ((zzaf) this.zza).zzV();
                return this;
            }

            @Override // com.google.android.gms.internal.ads.zzbfp.zzag
            public boolean zzu() {
                return ((zzaf) this.zza).zzu();
            }

            @Override // com.google.android.gms.internal.ads.zzbfp.zzag
            public long zzv() {
                return ((zzaf) this.zza).zzv();
            }

            public zzc zzw(long j) {
                zzbg();
                ((zzaf) this.zza).zzW(j);
                return this;
            }

            public zzc zzx() {
                zzbg();
                ((zzaf) this.zza).zzX();
                return this;
            }

            @Override // com.google.android.gms.internal.ads.zzbfp.zzag
            public boolean zzy() {
                return ((zzaf) this.zza).zzy();
            }

            @Override // com.google.android.gms.internal.ads.zzbfp.zzag
            public String zzz() {
                return ((zzaf) this.zza).zzz();
            }

            private zzc() {
                super(zzaf.zzv);
            }
        }

        public enum zzd implements zziav {
            UNSPECIFIED(0),
            CONNECTING(1),
            CONNECTED(2),
            DISCONNECTING(3),
            DISCONNECTED(4),
            SUSPENDED(5);

            public static final int zzg = 0;
            public static final int zzh = 1;
            public static final int zzi = 2;
            public static final int zzj = 3;
            public static final int zzk = 4;
            public static final int zzl = 5;
            private static final zziaw<zzd> zzm = new zziaw<zzd>() { // from class: com.google.android.gms.internal.ads.zzbfp.zzaf.zzd.1
                /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
                public zzd zzb(int i2) {
                    return zzd.zzc(i2);
                }
            };
            private final int zzn;

            final class zza implements zziax {
                static final zziax zza = new zza();

                private zza() {
                }

                @Override // com.google.android.gms.internal.ads.zziax
                public boolean zza(int i2) {
                    return zzd.zzc(i2) != null;
                }
            }

            zzd(int i2) {
                this.zzn = i2;
            }

            public static zzd zzc(int i2) {
                if (i2 == 0) {
                    return UNSPECIFIED;
                }
                if (i2 == 1) {
                    return CONNECTING;
                }
                if (i2 == 2) {
                    return CONNECTED;
                }
                if (i2 == 3) {
                    return DISCONNECTING;
                }
                if (i2 == 4) {
                    return DISCONNECTED;
                }
                if (i2 != 5) {
                    return null;
                }
                return SUSPENDED;
            }

            public static zziaw<zzd> zzd() {
                return zzm;
            }

            public static zziax zze() {
                return zza.zza;
            }

            @Override // java.lang.Enum
            public final String toString() {
                return Integer.toString(this.zzn);
            }

            @Override // com.google.android.gms.internal.ads.zziav
            public final int zza() {
                return this.zzn;
            }
        }

        static {
            zzaf zzafVar = new zzaf();
            zzv = zzafVar;
            zziar.zzbu(zzaf.class, zzafVar);
        }

        private zzaf() {
        }

        public static zzc zzB() {
            return (zzc) zzv.zzbn();
        }

        public static zzc zzC(zzaf zzafVar) {
            return (zzc) zzv.zzbo(zzafVar);
        }

        public static zzaf zzD() {
            return zzv;
        }

        public static zzick<zzaf> zzH() {
            return zzv.zzbd();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzaA, reason: merged with bridge method [inline-methods] */
        public void zzac() {
            this.zzi &= -17;
            this.zzo = zzD().zzF();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzaB, reason: merged with bridge method [inline-methods] */
        public void zzad(zzhzl zzhzlVar) {
            this.zzo = zzhzlVar.zzz();
            this.zzi |= 16;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzaC, reason: merged with bridge method [inline-methods] */
        public void zzae(long j) {
            this.zzi |= 32;
            this.zzp = j;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzaD, reason: merged with bridge method [inline-methods] */
        public void zzaf() {
            this.zzi &= -33;
            this.zzp = 0L;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzaE, reason: merged with bridge method [inline-methods] */
        public void zzag(int i2) {
            this.zzi |= 64;
            this.zzu = i2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzaF, reason: merged with bridge method [inline-methods] */
        public void zzah() {
            this.zzi &= -65;
            this.zzu = 0;
        }

        private void zzaj() {
            zzibd<zza> zzibdVar = this.zzj;
            if (zzibdVar.zza()) {
                return;
            }
            this.zzj = zziar.zzbN(zzibdVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzak, reason: merged with bridge method [inline-methods] */
        public void zzI(int i2, zza zzaVar) {
            zzaVar.getClass();
            zzaj();
            this.zzj.set(i2, zzaVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzal, reason: merged with bridge method [inline-methods] */
        public void zzJ(zza zzaVar) {
            zzaVar.getClass();
            zzaj();
            this.zzj.add(zzaVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzam, reason: merged with bridge method [inline-methods] */
        public void zzM(int i2, zza zzaVar) {
            zzaVar.getClass();
            zzaj();
            this.zzj.add(i2, zzaVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzan, reason: merged with bridge method [inline-methods] */
        public void zzN(Iterable<? extends zza> iterable) {
            zzaj();
            zzhyu.zzaW(iterable, this.zzj);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzao, reason: merged with bridge method [inline-methods] */
        public void zzQ() {
            this.zzj = zziar.zzbM();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzap, reason: merged with bridge method [inline-methods] */
        public void zzR(int i2) {
            zzaj();
            this.zzj.remove(i2);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzaq, reason: merged with bridge method [inline-methods] */
        public void zzS(int i2) {
            this.zzi |= 1;
            this.zzk = i2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzar, reason: merged with bridge method [inline-methods] */
        public void zzT() {
            this.zzi &= -2;
            this.zzk = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzas, reason: merged with bridge method [inline-methods] */
        public void zzU(int i2) {
            this.zzi |= 2;
            this.zzl = i2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzat, reason: merged with bridge method [inline-methods] */
        public void zzV() {
            this.zzi &= -3;
            this.zzl = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzau, reason: merged with bridge method [inline-methods] */
        public void zzW(long j) {
            this.zzi |= 4;
            this.zzm = j;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzav, reason: merged with bridge method [inline-methods] */
        public void zzX() {
            this.zzi &= -5;
            this.zzm = 0L;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzaw, reason: merged with bridge method [inline-methods] */
        public void zzY(String str) {
            str.getClass();
            this.zzi |= 8;
            this.zzn = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzax, reason: merged with bridge method [inline-methods] */
        public void zzZ() {
            this.zzi &= -9;
            this.zzn = zzD().zzz();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzay, reason: merged with bridge method [inline-methods] */
        public void zzaa(zzhzl zzhzlVar) {
            this.zzn = zzhzlVar.zzz();
            this.zzi |= 8;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzaz, reason: merged with bridge method [inline-methods] */
        public void zzab(String str) {
            str.getClass();
            this.zzi |= 16;
            this.zzo = str;
        }

        public static zzaf zzg(ByteBuffer byteBuffer) throws zzibg {
            return (zzaf) zziar.zzbR(zzv, byteBuffer);
        }

        public static zzaf zzh(ByteBuffer byteBuffer, zziab zziabVar) throws zzibg {
            return (zzaf) zziar.zzbQ(zzv, byteBuffer, zziabVar);
        }

        public static zzaf zzi(zzhzl zzhzlVar) throws zzibg {
            return (zzaf) zziar.zzbS(zzv, zzhzlVar);
        }

        public static zzaf zzj(zzhzl zzhzlVar, zziab zziabVar) throws zzibg {
            return (zzaf) zziar.zzbT(zzv, zzhzlVar, zziabVar);
        }

        public static zzaf zzk(byte[] bArr) throws zzibg {
            return (zzaf) zziar.zzbU(zzv, bArr);
        }

        public static zzaf zzl(byte[] bArr, zziab zziabVar) throws zzibg {
            return (zzaf) zziar.zzbV(zzv, bArr, zziabVar);
        }

        public static zzaf zzo(InputStream inputStream) throws IOException {
            return (zzaf) zziar.zzbW(zzv, inputStream);
        }

        public static zzaf zzp(InputStream inputStream, zziab zziabVar) throws IOException {
            return (zzaf) zziar.zzbX(zzv, inputStream, zziabVar);
        }

        public static zzaf zzs(InputStream inputStream) throws IOException {
            return (zzaf) zziar.zzca(zzv, inputStream);
        }

        public static zzaf zzt(InputStream inputStream, zziab zziabVar) throws IOException {
            return (zzaf) zziar.zzcb(zzv, inputStream, zziabVar);
        }

        public static zzaf zzw(zzhzq zzhzqVar) throws IOException {
            return (zzaf) zziar.zzbY(zzv, zzhzqVar);
        }

        public static zzaf zzx(zzhzq zzhzqVar, zziab zziabVar) throws IOException {
            return (zzaf) zziar.zzbZ(zzv, zzhzqVar, zziabVar);
        }

        @Override // com.google.android.gms.internal.ads.zzbfp.zzag
        public zzhzl zzA() {
            return zzhzl.zzv(this.zzn);
        }

        @Override // com.google.android.gms.internal.ads.zzbfp.zzag
        public boolean zzE() {
            return (this.zzi & 16) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbfp.zzag
        public String zzF() {
            return this.zzo;
        }

        @Override // com.google.android.gms.internal.ads.zzbfp.zzag
        public zzhzl zzG() {
            return zzhzl.zzv(this.zzo);
        }

        @Override // com.google.android.gms.internal.ads.zzbfp.zzag
        public boolean zzK() {
            return (this.zzi & 32) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbfp.zzag
        public long zzL() {
            return this.zzp;
        }

        @Override // com.google.android.gms.internal.ads.zzbfp.zzag
        public boolean zzO() {
            return (this.zzi & 64) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbfp.zzag
        public int zzP() {
            return this.zzu;
        }

        @Override // com.google.android.gms.internal.ads.zzbfp.zzag
        public List<zza> zza() {
            return this.zzj;
        }

        @Override // com.google.android.gms.internal.ads.zzbfp.zzag
        public int zzb() {
            return this.zzj.size();
        }

        @Override // com.google.android.gms.internal.ads.zzbfp.zzag
        public zza zzc(int i2) {
            return this.zzj.get(i2);
        }

        public List<? extends zzb> zzd() {
            return this.zzj;
        }

        @Override // com.google.android.gms.internal.ads.zziar
        public final Object zzdc(zziaq zziaqVar, Object obj, Object obj2) {
            zzick zziamVar;
            int iOrdinal = zziaqVar.ordinal();
            if (iOrdinal == 0) {
                return (byte) 1;
            }
            if (iOrdinal == 2) {
                return zziar.zzbv(zzv, "\u0004\b\u0000\u0001\u0001\b\b\u0000\u0001\u0000\u0001\u001b\u0002င\u0000\u0003င\u0001\u0004ဂ\u0002\u0005ဈ\u0003\u0006ဈ\u0004\u0007ဂ\u0005\bင\u0006", new Object[]{"zzi", "zzj", zza.class, "zzk", "zzl", "zzm", "zzn", "zzo", "zzp", "zzu"});
            }
            if (iOrdinal == 3) {
                return new zzaf();
            }
            byte[] bArr = null;
            if (iOrdinal == 4) {
                return new zzc(bArr);
            }
            if (iOrdinal == 5) {
                return zzv;
            }
            if (iOrdinal != 6) {
                throw null;
            }
            zzick<zzaf> zzickVar = zzw;
            if (zzickVar != null) {
                return zzickVar;
            }
            synchronized (zzaf.class) {
                try {
                    zziamVar = zzw;
                    if (zziamVar == null) {
                        zziamVar = new zziam(zzv);
                        zzw = zziamVar;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return zziamVar;
        }

        public zzb zze(int i2) {
            return this.zzj.get(i2);
        }

        @Override // com.google.android.gms.internal.ads.zzbfp.zzag
        public boolean zzm() {
            return (this.zzi & 1) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbfp.zzag
        public int zzn() {
            return this.zzk;
        }

        @Override // com.google.android.gms.internal.ads.zzbfp.zzag
        public boolean zzq() {
            return (this.zzi & 2) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbfp.zzag
        public int zzr() {
            return this.zzl;
        }

        @Override // com.google.android.gms.internal.ads.zzbfp.zzag
        public boolean zzu() {
            return (this.zzi & 4) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbfp.zzag
        public long zzv() {
            return this.zzm;
        }

        @Override // com.google.android.gms.internal.ads.zzbfp.zzag
        public boolean zzy() {
            return (this.zzi & 8) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbfp.zzag
        public String zzz() {
            return this.zzn;
        }
    }

    public interface zzag extends zzicd {
        zzhzl zzA();

        boolean zzE();

        String zzF();

        zzhzl zzG();

        boolean zzK();

        long zzL();

        boolean zzO();

        int zzP();

        List<zzaf.zza> zza();

        int zzb();

        zzaf.zza zzc(int i2);

        boolean zzm();

        int zzn();

        boolean zzq();

        int zzr();

        boolean zzu();

        long zzv();

        boolean zzy();

        String zzz();
    }

    public final class zzah extends zziar<zzah, zza> implements zzak {
        private static final zzah zzB;
        private static volatile zzick<zzah> zzC = null;
        public static final int zza = 1;
        public static final int zzb = 2;
        public static final int zzc = 3;
        public static final int zzd = 4;
        public static final int zze = 5;
        public static final int zzf = 6;
        public static final int zzg = 7;
        public static final int zzh = 8;
        public static final int zzi = 9;
        public static final int zzj = 10;
        public static final int zzk = 11;
        private zzai zzA;
        private int zzl;
        private int zzm = 1000;
        private int zzn = 1000;
        private int zzo;
        private int zzp;
        private int zzu;
        private int zzv;
        private int zzw;
        private int zzx;
        private int zzy;
        private int zzz;

        public final class zza extends zzial<zzah, zza> implements zzak {
            public /* synthetic */ zza(byte[] bArr) {
                this();
            }

            public zza zzA(int i2) {
                zzbg();
                ((zzah) this.zza).zzY(i2);
                return this;
            }

            public zza zzB() {
                zzbg();
                ((zzah) this.zza).zzZ();
                return this;
            }

            @Override // com.google.android.gms.internal.ads.zzbfp.zzak
            public boolean zzC() {
                return ((zzah) this.zza).zzC();
            }

            @Override // com.google.android.gms.internal.ads.zzbfp.zzak
            public int zzD() {
                return ((zzah) this.zza).zzD();
            }

            public zza zzE(int i2) {
                zzbg();
                ((zzah) this.zza).zzaa(i2);
                return this;
            }

            public zza zzF() {
                zzbg();
                ((zzah) this.zza).zzab();
                return this;
            }

            @Override // com.google.android.gms.internal.ads.zzbfp.zzak
            public boolean zzG() {
                return ((zzah) this.zza).zzG();
            }

            @Override // com.google.android.gms.internal.ads.zzbfp.zzak
            public int zzH() {
                return ((zzah) this.zza).zzH();
            }

            public zza zzI(int i2) {
                zzbg();
                ((zzah) this.zza).zzac(i2);
                return this;
            }

            public zza zzJ() {
                zzbg();
                ((zzah) this.zza).zzad();
                return this;
            }

            @Override // com.google.android.gms.internal.ads.zzbfp.zzak
            public boolean zzK() {
                return ((zzah) this.zza).zzK();
            }

            @Override // com.google.android.gms.internal.ads.zzbfp.zzak
            public int zzL() {
                return ((zzah) this.zza).zzL();
            }

            public zza zzM(int i2) {
                zzbg();
                ((zzah) this.zza).zzae(i2);
                return this;
            }

            public zza zzN() {
                zzbg();
                ((zzah) this.zza).zzaf();
                return this;
            }

            @Override // com.google.android.gms.internal.ads.zzbfp.zzak
            public boolean zzO() {
                return ((zzah) this.zza).zzO();
            }

            @Override // com.google.android.gms.internal.ads.zzbfp.zzak
            public zzai zzP() {
                return ((zzah) this.zza).zzP();
            }

            public zza zzQ(zzai zzaiVar) {
                zzbg();
                ((zzah) this.zza).zzag(zzaiVar);
                return this;
            }

            public zza zzR(zzai.zza zzaVar) {
                zzbg();
                ((zzah) this.zza).zzag(zzaVar.zzbu());
                return this;
            }

            public zza zzS(zzai zzaiVar) {
                zzbg();
                ((zzah) this.zza).zzah(zzaiVar);
                return this;
            }

            public zza zzT() {
                zzbg();
                ((zzah) this.zza).zzai();
                return this;
            }

            @Override // com.google.android.gms.internal.ads.zzbfp.zzak
            public boolean zza() {
                return ((zzah) this.zza).zza();
            }

            @Override // com.google.android.gms.internal.ads.zzbfp.zzak
            public zzq zzb() {
                return ((zzah) this.zza).zzb();
            }

            public zza zzc(zzq zzqVar) {
                zzbg();
                ((zzah) this.zza).zzI(zzqVar);
                return this;
            }

            public zza zzd() {
                zzbg();
                ((zzah) this.zza).zzJ();
                return this;
            }

            @Override // com.google.android.gms.internal.ads.zzbfp.zzak
            public boolean zze() {
                return ((zzah) this.zza).zze();
            }

            @Override // com.google.android.gms.internal.ads.zzbfp.zzak
            public zzq zzf() {
                return ((zzah) this.zza).zzf();
            }

            public zza zzg(zzq zzqVar) {
                zzbg();
                ((zzah) this.zza).zzM(zzqVar);
                return this;
            }

            public zza zzh() {
                zzbg();
                ((zzah) this.zza).zzN();
                return this;
            }

            @Override // com.google.android.gms.internal.ads.zzbfp.zzak
            public boolean zzi() {
                return ((zzah) this.zza).zzi();
            }

            @Override // com.google.android.gms.internal.ads.zzbfp.zzak
            public int zzj() {
                return ((zzah) this.zza).zzj();
            }

            public zza zzk(int i2) {
                zzbg();
                ((zzah) this.zza).zzQ(i2);
                return this;
            }

            public zza zzl() {
                zzbg();
                ((zzah) this.zza).zzR();
                return this;
            }

            @Override // com.google.android.gms.internal.ads.zzbfp.zzak
            public boolean zzm() {
                return ((zzah) this.zza).zzm();
            }

            @Override // com.google.android.gms.internal.ads.zzbfp.zzak
            public int zzn() {
                return ((zzah) this.zza).zzn();
            }

            public zza zzo(int i2) {
                zzbg();
                ((zzah) this.zza).zzS(i2);
                return this;
            }

            public zza zzp() {
                zzbg();
                ((zzah) this.zza).zzT();
                return this;
            }

            @Override // com.google.android.gms.internal.ads.zzbfp.zzak
            public boolean zzq() {
                return ((zzah) this.zza).zzq();
            }

            @Override // com.google.android.gms.internal.ads.zzbfp.zzak
            public int zzr() {
                return ((zzah) this.zza).zzr();
            }

            public zza zzs(int i2) {
                zzbg();
                ((zzah) this.zza).zzU(i2);
                return this;
            }

            public zza zzt() {
                zzbg();
                ((zzah) this.zza).zzV();
                return this;
            }

            @Override // com.google.android.gms.internal.ads.zzbfp.zzak
            public boolean zzu() {
                return ((zzah) this.zza).zzu();
            }

            @Override // com.google.android.gms.internal.ads.zzbfp.zzak
            public int zzv() {
                return ((zzah) this.zza).zzv();
            }

            public zza zzw(int i2) {
                zzbg();
                ((zzah) this.zza).zzW(i2);
                return this;
            }

            public zza zzx() {
                zzbg();
                ((zzah) this.zza).zzX();
                return this;
            }

            @Override // com.google.android.gms.internal.ads.zzbfp.zzak
            public boolean zzy() {
                return ((zzah) this.zza).zzy();
            }

            @Override // com.google.android.gms.internal.ads.zzbfp.zzak
            public int zzz() {
                return ((zzah) this.zza).zzz();
            }

            private zza() {
                super(zzah.zzB);
            }
        }

        static {
            zzah zzahVar = new zzah();
            zzB = zzahVar;
            zziar.zzbu(zzah.class, zzahVar);
        }

        private zzah() {
        }

        public static zza zzA() {
            return (zza) zzB.zzbn();
        }

        public static zza zzB(zzah zzahVar) {
            return (zza) zzB.zzbo(zzahVar);
        }

        public static zzah zzE() {
            return zzB;
        }

        public static zzick<zzah> zzF() {
            return zzB.zzbd();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzaA, reason: merged with bridge method [inline-methods] */
        public void zzac(int i2) {
            this.zzl |= 256;
            this.zzy = i2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzaB, reason: merged with bridge method [inline-methods] */
        public void zzad() {
            this.zzl &= -257;
            this.zzy = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzaC, reason: merged with bridge method [inline-methods] */
        public void zzae(int i2) {
            this.zzl |= 512;
            this.zzz = i2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzaD, reason: merged with bridge method [inline-methods] */
        public void zzaf() {
            this.zzl &= -513;
            this.zzz = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzaE, reason: merged with bridge method [inline-methods] */
        public void zzag(zzai zzaiVar) {
            zzaiVar.getClass();
            this.zzA = zzaiVar;
            this.zzl |= 1024;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzaF, reason: merged with bridge method [inline-methods] */
        public void zzah(zzai zzaiVar) {
            zzaiVar.getClass();
            zzai zzaiVar2 = this.zzA;
            if (zzaiVar2 != null && zzaiVar2 != zzai.zzs()) {
                zzai.zza zzaVarZzr = zzai.zzr(zzaiVar2);
                zzaVarZzr.zzbo(zzaiVar);
                zzaiVar = zzaVarZzr.zzbt();
            }
            this.zzA = zzaiVar;
            this.zzl |= 1024;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzaG, reason: merged with bridge method [inline-methods] */
        public void zzai() {
            this.zzA = null;
            this.zzl &= -1025;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzak, reason: merged with bridge method [inline-methods] */
        public void zzI(zzq zzqVar) {
            this.zzm = zzqVar.zza();
            this.zzl |= 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzal, reason: merged with bridge method [inline-methods] */
        public void zzJ() {
            this.zzl &= -2;
            this.zzm = 1000;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzam, reason: merged with bridge method [inline-methods] */
        public void zzM(zzq zzqVar) {
            this.zzn = zzqVar.zza();
            this.zzl |= 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzan, reason: merged with bridge method [inline-methods] */
        public void zzN() {
            this.zzl &= -3;
            this.zzn = 1000;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzao, reason: merged with bridge method [inline-methods] */
        public void zzQ(int i2) {
            this.zzl |= 4;
            this.zzo = i2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzap, reason: merged with bridge method [inline-methods] */
        public void zzR() {
            this.zzl &= -5;
            this.zzo = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzaq, reason: merged with bridge method [inline-methods] */
        public void zzS(int i2) {
            this.zzl |= 8;
            this.zzp = i2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzar, reason: merged with bridge method [inline-methods] */
        public void zzT() {
            this.zzl &= -9;
            this.zzp = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzas, reason: merged with bridge method [inline-methods] */
        public void zzU(int i2) {
            this.zzl |= 16;
            this.zzu = i2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzat, reason: merged with bridge method [inline-methods] */
        public void zzV() {
            this.zzl &= -17;
            this.zzu = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzau, reason: merged with bridge method [inline-methods] */
        public void zzW(int i2) {
            this.zzl |= 32;
            this.zzv = i2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzav, reason: merged with bridge method [inline-methods] */
        public void zzX() {
            this.zzl &= -33;
            this.zzv = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzaw, reason: merged with bridge method [inline-methods] */
        public void zzY(int i2) {
            this.zzl |= 64;
            this.zzw = i2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzax, reason: merged with bridge method [inline-methods] */
        public void zzZ() {
            this.zzl &= -65;
            this.zzw = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzay, reason: merged with bridge method [inline-methods] */
        public void zzaa(int i2) {
            this.zzl |= 128;
            this.zzx = i2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzaz, reason: merged with bridge method [inline-methods] */
        public void zzab() {
            this.zzl &= -129;
            this.zzx = 0;
        }

        public static zzah zzc(ByteBuffer byteBuffer) throws zzibg {
            return (zzah) zziar.zzbR(zzB, byteBuffer);
        }

        public static zzah zzd(ByteBuffer byteBuffer, zziab zziabVar) throws zzibg {
            return (zzah) zziar.zzbQ(zzB, byteBuffer, zziabVar);
        }

        public static zzah zzg(zzhzl zzhzlVar) throws zzibg {
            return (zzah) zziar.zzbS(zzB, zzhzlVar);
        }

        public static zzah zzh(zzhzl zzhzlVar, zziab zziabVar) throws zzibg {
            return (zzah) zziar.zzbT(zzB, zzhzlVar, zziabVar);
        }

        public static zzah zzk(byte[] bArr) throws zzibg {
            return (zzah) zziar.zzbU(zzB, bArr);
        }

        public static zzah zzl(byte[] bArr, zziab zziabVar) throws zzibg {
            return (zzah) zziar.zzbV(zzB, bArr, zziabVar);
        }

        public static zzah zzo(InputStream inputStream) throws IOException {
            return (zzah) zziar.zzbW(zzB, inputStream);
        }

        public static zzah zzp(InputStream inputStream, zziab zziabVar) throws IOException {
            return (zzah) zziar.zzbX(zzB, inputStream, zziabVar);
        }

        public static zzah zzs(InputStream inputStream) throws IOException {
            return (zzah) zziar.zzca(zzB, inputStream);
        }

        public static zzah zzt(InputStream inputStream, zziab zziabVar) throws IOException {
            return (zzah) zziar.zzcb(zzB, inputStream, zziabVar);
        }

        public static zzah zzw(zzhzq zzhzqVar) throws IOException {
            return (zzah) zziar.zzbY(zzB, zzhzqVar);
        }

        public static zzah zzx(zzhzq zzhzqVar, zziab zziabVar) throws IOException {
            return (zzah) zziar.zzbZ(zzB, zzhzqVar, zziabVar);
        }

        @Override // com.google.android.gms.internal.ads.zzbfp.zzak
        public boolean zzC() {
            return (this.zzl & 128) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbfp.zzak
        public int zzD() {
            return this.zzx;
        }

        @Override // com.google.android.gms.internal.ads.zzbfp.zzak
        public boolean zzG() {
            return (this.zzl & 256) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbfp.zzak
        public int zzH() {
            return this.zzy;
        }

        @Override // com.google.android.gms.internal.ads.zzbfp.zzak
        public boolean zzK() {
            return (this.zzl & 512) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbfp.zzak
        public int zzL() {
            return this.zzz;
        }

        @Override // com.google.android.gms.internal.ads.zzbfp.zzak
        public boolean zzO() {
            return (this.zzl & 1024) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbfp.zzak
        public zzai zzP() {
            zzai zzaiVar = this.zzA;
            return zzaiVar == null ? zzai.zzs() : zzaiVar;
        }

        @Override // com.google.android.gms.internal.ads.zzbfp.zzak
        public boolean zza() {
            return (this.zzl & 1) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbfp.zzak
        public zzq zzb() {
            zzq zzqVarZzc = zzq.zzc(this.zzm);
            return zzqVarZzc == null ? zzq.ENUM_UNKNOWN : zzqVarZzc;
        }

        @Override // com.google.android.gms.internal.ads.zziar
        public final Object zzdc(zziaq zziaqVar, Object obj, Object obj2) {
            zzick zziamVar;
            int iOrdinal = zziaqVar.ordinal();
            if (iOrdinal == 0) {
                return (byte) 1;
            }
            if (iOrdinal == 2) {
                return zziar.zzbv(zzB, "\u0004\u000b\u0000\u0001\u0001\u000b\u000b\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001\u0003င\u0002\u0004င\u0003\u0005င\u0004\u0006င\u0005\u0007င\u0006\bင\u0007\tင\b\nင\t\u000bဉ\n", new Object[]{"zzl", "zzm", zzq.zze(), "zzn", zzq.zze(), "zzo", "zzp", "zzu", "zzv", "zzw", "zzx", "zzy", "zzz", "zzA"});
            }
            if (iOrdinal == 3) {
                return new zzah();
            }
            byte[] bArr = null;
            if (iOrdinal == 4) {
                return new zza(bArr);
            }
            if (iOrdinal == 5) {
                return zzB;
            }
            if (iOrdinal != 6) {
                throw null;
            }
            zzick<zzah> zzickVar = zzC;
            if (zzickVar != null) {
                return zzickVar;
            }
            synchronized (zzah.class) {
                try {
                    zziamVar = zzC;
                    if (zziamVar == null) {
                        zziamVar = new zziam(zzB);
                        zzC = zziamVar;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return zziamVar;
        }

        @Override // com.google.android.gms.internal.ads.zzbfp.zzak
        public boolean zze() {
            return (this.zzl & 2) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbfp.zzak
        public zzq zzf() {
            zzq zzqVarZzc = zzq.zzc(this.zzn);
            return zzqVarZzc == null ? zzq.ENUM_UNKNOWN : zzqVarZzc;
        }

        @Override // com.google.android.gms.internal.ads.zzbfp.zzak
        public boolean zzi() {
            return (this.zzl & 4) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbfp.zzak
        public int zzj() {
            return this.zzo;
        }

        @Override // com.google.android.gms.internal.ads.zzbfp.zzak
        public boolean zzm() {
            return (this.zzl & 8) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbfp.zzak
        public int zzn() {
            return this.zzp;
        }

        @Override // com.google.android.gms.internal.ads.zzbfp.zzak
        public boolean zzq() {
            return (this.zzl & 16) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbfp.zzak
        public int zzr() {
            return this.zzu;
        }

        @Override // com.google.android.gms.internal.ads.zzbfp.zzak
        public boolean zzu() {
            return (this.zzl & 32) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbfp.zzak
        public int zzv() {
            return this.zzv;
        }

        @Override // com.google.android.gms.internal.ads.zzbfp.zzak
        public boolean zzy() {
            return (this.zzl & 64) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbfp.zzak
        public int zzz() {
            return this.zzw;
        }
    }

    public final class zzai extends zziar<zzai, zza> implements zzaj {
        public static final int zza = 1;
        public static final int zzb = 2;
        private static final zzai zzf;
        private static volatile zzick<zzai> zzg;
        private int zzc;
        private int zzd;
        private int zze;

        public final class zza extends zzial<zzai, zza> implements zzaj {
            public /* synthetic */ zza(byte[] bArr) {
                this();
            }

            @Override // com.google.android.gms.internal.ads.zzbfp.zzaj
            public boolean zza() {
                return ((zzai) this.zza).zza();
            }

            @Override // com.google.android.gms.internal.ads.zzbfp.zzaj
            public int zzb() {
                return ((zzai) this.zza).zzb();
            }

            public zza zzc(int i2) {
                zzbg();
                ((zzai) this.zza).zzu(i2);
                return this;
            }

            public zza zzd() {
                zzbg();
                ((zzai) this.zza).zzv();
                return this;
            }

            @Override // com.google.android.gms.internal.ads.zzbfp.zzaj
            public boolean zze() {
                return ((zzai) this.zza).zze();
            }

            @Override // com.google.android.gms.internal.ads.zzbfp.zzaj
            public int zzf() {
                return ((zzai) this.zza).zzf();
            }

            public zza zzg(int i2) {
                zzbg();
                ((zzai) this.zza).zzw(i2);
                return this;
            }

            public zza zzh() {
                zzbg();
                ((zzai) this.zza).zzx();
                return this;
            }

            private zza() {
                super(zzai.zzf);
            }
        }

        static {
            zzai zzaiVar = new zzai();
            zzf = zzaiVar;
            zziar.zzbu(zzai.class, zzaiVar);
        }

        private zzai() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzA, reason: merged with bridge method [inline-methods] */
        public void zzv() {
            this.zzc &= -2;
            this.zzd = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzB, reason: merged with bridge method [inline-methods] */
        public void zzw(int i2) {
            this.zzc |= 2;
            this.zze = i2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzC, reason: merged with bridge method [inline-methods] */
        public void zzx() {
            this.zzc &= -3;
            this.zze = 0;
        }

        public static zzai zzc(ByteBuffer byteBuffer) throws zzibg {
            return (zzai) zziar.zzbR(zzf, byteBuffer);
        }

        public static zzai zzd(ByteBuffer byteBuffer, zziab zziabVar) throws zzibg {
            return (zzai) zziar.zzbQ(zzf, byteBuffer, zziabVar);
        }

        public static zzai zzg(zzhzl zzhzlVar) throws zzibg {
            return (zzai) zziar.zzbS(zzf, zzhzlVar);
        }

        public static zzai zzh(zzhzl zzhzlVar, zziab zziabVar) throws zzibg {
            return (zzai) zziar.zzbT(zzf, zzhzlVar, zziabVar);
        }

        public static zzai zzi(byte[] bArr) throws zzibg {
            return (zzai) zziar.zzbU(zzf, bArr);
        }

        public static zzai zzj(byte[] bArr, zziab zziabVar) throws zzibg {
            return (zzai) zziar.zzbV(zzf, bArr, zziabVar);
        }

        public static zzai zzk(InputStream inputStream) throws IOException {
            return (zzai) zziar.zzbW(zzf, inputStream);
        }

        public static zzai zzl(InputStream inputStream, zziab zziabVar) throws IOException {
            return (zzai) zziar.zzbX(zzf, inputStream, zziabVar);
        }

        public static zzai zzm(InputStream inputStream) throws IOException {
            return (zzai) zziar.zzca(zzf, inputStream);
        }

        public static zzai zzn(InputStream inputStream, zziab zziabVar) throws IOException {
            return (zzai) zziar.zzcb(zzf, inputStream, zziabVar);
        }

        public static zzai zzo(zzhzq zzhzqVar) throws IOException {
            return (zzai) zziar.zzbY(zzf, zzhzqVar);
        }

        public static zzai zzp(zzhzq zzhzqVar, zziab zziabVar) throws IOException {
            return (zzai) zziar.zzbZ(zzf, zzhzqVar, zziabVar);
        }

        public static zza zzq() {
            return (zza) zzf.zzbn();
        }

        public static zza zzr(zzai zzaiVar) {
            return (zza) zzf.zzbo(zzaiVar);
        }

        public static zzai zzs() {
            return zzf;
        }

        public static zzick<zzai> zzt() {
            return zzf.zzbd();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzz, reason: merged with bridge method [inline-methods] */
        public void zzu(int i2) {
            this.zzc |= 1;
            this.zzd = i2;
        }

        @Override // com.google.android.gms.internal.ads.zzbfp.zzaj
        public boolean zza() {
            return (this.zzc & 1) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbfp.zzaj
        public int zzb() {
            return this.zzd;
        }

        @Override // com.google.android.gms.internal.ads.zziar
        public final Object zzdc(zziaq zziaqVar, Object obj, Object obj2) {
            zzick zziamVar;
            int iOrdinal = zziaqVar.ordinal();
            if (iOrdinal == 0) {
                return (byte) 1;
            }
            if (iOrdinal == 2) {
                return zziar.zzbv(zzf, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001", new Object[]{"zzc", "zzd", "zze"});
            }
            if (iOrdinal == 3) {
                return new zzai();
            }
            byte[] bArr = null;
            if (iOrdinal == 4) {
                return new zza(bArr);
            }
            if (iOrdinal == 5) {
                return zzf;
            }
            if (iOrdinal != 6) {
                throw null;
            }
            zzick<zzai> zzickVar = zzg;
            if (zzickVar != null) {
                return zzickVar;
            }
            synchronized (zzai.class) {
                try {
                    zziamVar = zzg;
                    if (zziamVar == null) {
                        zziamVar = new zziam(zzf);
                        zzg = zziamVar;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return zziamVar;
        }

        @Override // com.google.android.gms.internal.ads.zzbfp.zzaj
        public boolean zze() {
            return (this.zzc & 2) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbfp.zzaj
        public int zzf() {
            return this.zze;
        }
    }

    public interface zzaj extends zzicd {
        boolean zza();

        int zzb();

        boolean zze();

        int zzf();
    }

    public interface zzak extends zzicd {
        boolean zzC();

        int zzD();

        boolean zzG();

        int zzH();

        boolean zzK();

        int zzL();

        boolean zzO();

        zzai zzP();

        boolean zza();

        zzq zzb();

        boolean zze();

        zzq zzf();

        boolean zzi();

        int zzj();

        boolean zzm();

        int zzn();

        boolean zzq();

        int zzr();

        boolean zzu();

        int zzv();

        boolean zzy();

        int zzz();
    }

    public final class zzal extends zziar<zzal, zza> implements zzam {
        public static final int zza = 1;
        public static final int zzb = 2;
        private static final zzal zzf;
        private static volatile zzick<zzal> zzg;
        private int zzc;
        private int zzd;
        private int zze;

        public final class zza extends zzial<zzal, zza> implements zzam {
            public /* synthetic */ zza(byte[] bArr) {
                this();
            }

            @Override // com.google.android.gms.internal.ads.zzbfp.zzam
            public boolean zza() {
                return ((zzal) this.zza).zza();
            }

            @Override // com.google.android.gms.internal.ads.zzbfp.zzam
            public int zzb() {
                return ((zzal) this.zza).zzb();
            }

            public zza zzc(int i2) {
                zzbg();
                ((zzal) this.zza).zzu(i2);
                return this;
            }

            public zza zzd() {
                zzbg();
                ((zzal) this.zza).zzv();
                return this;
            }

            @Override // com.google.android.gms.internal.ads.zzbfp.zzam
            public boolean zze() {
                return ((zzal) this.zza).zze();
            }

            @Override // com.google.android.gms.internal.ads.zzbfp.zzam
            public int zzf() {
                return ((zzal) this.zza).zzf();
            }

            public zza zzg(int i2) {
                zzbg();
                ((zzal) this.zza).zzw(i2);
                return this;
            }

            public zza zzh() {
                zzbg();
                ((zzal) this.zza).zzx();
                return this;
            }

            private zza() {
                super(zzal.zzf);
            }
        }

        static {
            zzal zzalVar = new zzal();
            zzf = zzalVar;
            zziar.zzbu(zzal.class, zzalVar);
        }

        private zzal() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzA, reason: merged with bridge method [inline-methods] */
        public void zzv() {
            this.zzc &= -2;
            this.zzd = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzB, reason: merged with bridge method [inline-methods] */
        public void zzw(int i2) {
            this.zzc |= 2;
            this.zze = i2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzC, reason: merged with bridge method [inline-methods] */
        public void zzx() {
            this.zzc &= -3;
            this.zze = 0;
        }

        public static zzal zzc(ByteBuffer byteBuffer) throws zzibg {
            return (zzal) zziar.zzbR(zzf, byteBuffer);
        }

        public static zzal zzd(ByteBuffer byteBuffer, zziab zziabVar) throws zzibg {
            return (zzal) zziar.zzbQ(zzf, byteBuffer, zziabVar);
        }

        public static zzal zzg(zzhzl zzhzlVar) throws zzibg {
            return (zzal) zziar.zzbS(zzf, zzhzlVar);
        }

        public static zzal zzh(zzhzl zzhzlVar, zziab zziabVar) throws zzibg {
            return (zzal) zziar.zzbT(zzf, zzhzlVar, zziabVar);
        }

        public static zzal zzi(byte[] bArr) throws zzibg {
            return (zzal) zziar.zzbU(zzf, bArr);
        }

        public static zzal zzj(byte[] bArr, zziab zziabVar) throws zzibg {
            return (zzal) zziar.zzbV(zzf, bArr, zziabVar);
        }

        public static zzal zzk(InputStream inputStream) throws IOException {
            return (zzal) zziar.zzbW(zzf, inputStream);
        }

        public static zzal zzl(InputStream inputStream, zziab zziabVar) throws IOException {
            return (zzal) zziar.zzbX(zzf, inputStream, zziabVar);
        }

        public static zzal zzm(InputStream inputStream) throws IOException {
            return (zzal) zziar.zzca(zzf, inputStream);
        }

        public static zzal zzn(InputStream inputStream, zziab zziabVar) throws IOException {
            return (zzal) zziar.zzcb(zzf, inputStream, zziabVar);
        }

        public static zzal zzo(zzhzq zzhzqVar) throws IOException {
            return (zzal) zziar.zzbY(zzf, zzhzqVar);
        }

        public static zzal zzp(zzhzq zzhzqVar, zziab zziabVar) throws IOException {
            return (zzal) zziar.zzbZ(zzf, zzhzqVar, zziabVar);
        }

        public static zza zzq() {
            return (zza) zzf.zzbn();
        }

        public static zza zzr(zzal zzalVar) {
            return (zza) zzf.zzbo(zzalVar);
        }

        public static zzal zzs() {
            return zzf;
        }

        public static zzick<zzal> zzt() {
            return zzf.zzbd();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzz, reason: merged with bridge method [inline-methods] */
        public void zzu(int i2) {
            this.zzc |= 1;
            this.zzd = i2;
        }

        @Override // com.google.android.gms.internal.ads.zzbfp.zzam
        public boolean zza() {
            return (this.zzc & 1) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbfp.zzam
        public int zzb() {
            return this.zzd;
        }

        @Override // com.google.android.gms.internal.ads.zziar
        public final Object zzdc(zziaq zziaqVar, Object obj, Object obj2) {
            zzick zziamVar;
            int iOrdinal = zziaqVar.ordinal();
            if (iOrdinal == 0) {
                return (byte) 1;
            }
            if (iOrdinal == 2) {
                return zziar.zzbv(zzf, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001", new Object[]{"zzc", "zzd", "zze"});
            }
            if (iOrdinal == 3) {
                return new zzal();
            }
            byte[] bArr = null;
            if (iOrdinal == 4) {
                return new zza(bArr);
            }
            if (iOrdinal == 5) {
                return zzf;
            }
            if (iOrdinal != 6) {
                throw null;
            }
            zzick<zzal> zzickVar = zzg;
            if (zzickVar != null) {
                return zzickVar;
            }
            synchronized (zzal.class) {
                try {
                    zziamVar = zzg;
                    if (zziamVar == null) {
                        zziamVar = new zziam(zzf);
                        zzg = zziamVar;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return zziamVar;
        }

        @Override // com.google.android.gms.internal.ads.zzbfp.zzam
        public boolean zze() {
            return (this.zzc & 2) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbfp.zzam
        public int zzf() {
            return this.zze;
        }
    }

    public interface zzam extends zzicd {
        boolean zza();

        int zzb();

        boolean zze();

        int zzf();
    }

    public final class zzan extends zziar<zzan, zza> implements zzao {
        public static final int zza = 1;
        public static final int zzb = 2;
        public static final int zzc = 3;
        private static final zzan zzh;
        private static volatile zzick<zzan> zzi;
        private int zzd;
        private String zze = "";
        private int zzf;
        private zzap zzg;

        public final class zza extends zzial<zzan, zza> implements zzao {
            public /* synthetic */ zza(byte[] bArr) {
                this();
            }

            @Override // com.google.android.gms.internal.ads.zzbfp.zzao
            public boolean zza() {
                return ((zzan) this.zza).zza();
            }

            @Override // com.google.android.gms.internal.ads.zzbfp.zzao
            public String zzb() {
                return ((zzan) this.zza).zzb();
            }

            @Override // com.google.android.gms.internal.ads.zzbfp.zzao
            public zzhzl zzc() {
                return ((zzan) this.zza).zzc();
            }

            public zza zzd(String str) {
                zzbg();
                ((zzan) this.zza).zzy(str);
                return this;
            }

            public zza zze() {
                zzbg();
                ((zzan) this.zza).zzz();
                return this;
            }

            public zza zzf(zzhzl zzhzlVar) {
                zzbg();
                ((zzan) this.zza).zzA(zzhzlVar);
                return this;
            }

            @Override // com.google.android.gms.internal.ads.zzbfp.zzao
            public boolean zzg() {
                return ((zzan) this.zza).zzg();
            }

            @Override // com.google.android.gms.internal.ads.zzbfp.zzao
            public zzq zzh() {
                return ((zzan) this.zza).zzh();
            }

            public zza zzi(zzq zzqVar) {
                zzbg();
                ((zzan) this.zza).zzB(zzqVar);
                return this;
            }

            public zza zzj() {
                zzbg();
                ((zzan) this.zza).zzC();
                return this;
            }

            @Override // com.google.android.gms.internal.ads.zzbfp.zzao
            public boolean zzk() {
                return ((zzan) this.zza).zzk();
            }

            @Override // com.google.android.gms.internal.ads.zzbfp.zzao
            public zzap zzl() {
                return ((zzan) this.zza).zzl();
            }

            public zza zzm(zzap zzapVar) {
                zzbg();
                ((zzan) this.zza).zzD(zzapVar);
                return this;
            }

            public zza zzn(zzap.zza zzaVar) {
                zzbg();
                ((zzan) this.zza).zzD(zzaVar.zzbu());
                return this;
            }

            public zza zzo(zzap zzapVar) {
                zzbg();
                ((zzan) this.zza).zzE(zzapVar);
                return this;
            }

            public zza zzp() {
                zzbg();
                ((zzan) this.zza).zzF();
                return this;
            }

            private zza() {
                super(zzan.zzh);
            }
        }

        static {
            zzan zzanVar = new zzan();
            zzh = zzanVar;
            zziar.zzbu(zzan.class, zzanVar);
        }

        private zzan() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzH, reason: merged with bridge method [inline-methods] */
        public void zzy(String str) {
            str.getClass();
            this.zzd |= 1;
            this.zze = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzI, reason: merged with bridge method [inline-methods] */
        public void zzz() {
            this.zzd &= -2;
            this.zze = zzw().zzb();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzJ, reason: merged with bridge method [inline-methods] */
        public void zzA(zzhzl zzhzlVar) {
            this.zze = zzhzlVar.zzz();
            this.zzd |= 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzK, reason: merged with bridge method [inline-methods] */
        public void zzB(zzq zzqVar) {
            this.zzf = zzqVar.zza();
            this.zzd |= 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzL, reason: merged with bridge method [inline-methods] */
        public void zzC() {
            this.zzd &= -3;
            this.zzf = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzM, reason: merged with bridge method [inline-methods] */
        public void zzD(zzap zzapVar) {
            zzapVar.getClass();
            this.zzg = zzapVar;
            this.zzd |= 4;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzN, reason: merged with bridge method [inline-methods] */
        public void zzE(zzap zzapVar) {
            zzapVar.getClass();
            zzap zzapVar2 = this.zzg;
            if (zzapVar2 != null && zzapVar2 != zzap.zzs()) {
                zzap.zza zzaVarZzr = zzap.zzr(zzapVar2);
                zzaVarZzr.zzbo(zzapVar);
                zzapVar = zzaVarZzr.zzbt();
            }
            this.zzg = zzapVar;
            this.zzd |= 4;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzO, reason: merged with bridge method [inline-methods] */
        public void zzF() {
            this.zzg = null;
            this.zzd &= -5;
        }

        public static zzan zzd(ByteBuffer byteBuffer) throws zzibg {
            return (zzan) zziar.zzbR(zzh, byteBuffer);
        }

        public static zzan zze(ByteBuffer byteBuffer, zziab zziabVar) throws zzibg {
            return (zzan) zziar.zzbQ(zzh, byteBuffer, zziabVar);
        }

        public static zzan zzi(zzhzl zzhzlVar) throws zzibg {
            return (zzan) zziar.zzbS(zzh, zzhzlVar);
        }

        public static zzan zzj(zzhzl zzhzlVar, zziab zziabVar) throws zzibg {
            return (zzan) zziar.zzbT(zzh, zzhzlVar, zziabVar);
        }

        public static zzan zzm(byte[] bArr) throws zzibg {
            return (zzan) zziar.zzbU(zzh, bArr);
        }

        public static zzan zzn(byte[] bArr, zziab zziabVar) throws zzibg {
            return (zzan) zziar.zzbV(zzh, bArr, zziabVar);
        }

        public static zzan zzo(InputStream inputStream) throws IOException {
            return (zzan) zziar.zzbW(zzh, inputStream);
        }

        public static zzan zzp(InputStream inputStream, zziab zziabVar) throws IOException {
            return (zzan) zziar.zzbX(zzh, inputStream, zziabVar);
        }

        public static zzan zzq(InputStream inputStream) throws IOException {
            return (zzan) zziar.zzca(zzh, inputStream);
        }

        public static zzan zzr(InputStream inputStream, zziab zziabVar) throws IOException {
            return (zzan) zziar.zzcb(zzh, inputStream, zziabVar);
        }

        public static zzan zzs(zzhzq zzhzqVar) throws IOException {
            return (zzan) zziar.zzbY(zzh, zzhzqVar);
        }

        public static zzan zzt(zzhzq zzhzqVar, zziab zziabVar) throws IOException {
            return (zzan) zziar.zzbZ(zzh, zzhzqVar, zziabVar);
        }

        public static zza zzu() {
            return (zza) zzh.zzbn();
        }

        public static zza zzv(zzan zzanVar) {
            return (zza) zzh.zzbo(zzanVar);
        }

        public static zzan zzw() {
            return zzh;
        }

        public static zzick<zzan> zzx() {
            return zzh.zzbd();
        }

        @Override // com.google.android.gms.internal.ads.zzbfp.zzao
        public boolean zza() {
            return (this.zzd & 1) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbfp.zzao
        public String zzb() {
            return this.zze;
        }

        @Override // com.google.android.gms.internal.ads.zzbfp.zzao
        public zzhzl zzc() {
            return zzhzl.zzv(this.zze);
        }

        @Override // com.google.android.gms.internal.ads.zziar
        public final Object zzdc(zziaq zziaqVar, Object obj, Object obj2) {
            zzick zziamVar;
            int iOrdinal = zziaqVar.ordinal();
            if (iOrdinal == 0) {
                return (byte) 1;
            }
            if (iOrdinal == 2) {
                return zziar.zzbv(zzh, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002᠌\u0001\u0003ဉ\u0002", new Object[]{"zzd", "zze", "zzf", zzq.zze(), "zzg"});
            }
            if (iOrdinal == 3) {
                return new zzan();
            }
            byte[] bArr = null;
            if (iOrdinal == 4) {
                return new zza(bArr);
            }
            if (iOrdinal == 5) {
                return zzh;
            }
            if (iOrdinal != 6) {
                throw null;
            }
            zzick<zzan> zzickVar = zzi;
            if (zzickVar != null) {
                return zzickVar;
            }
            synchronized (zzan.class) {
                try {
                    zziamVar = zzi;
                    if (zziamVar == null) {
                        zziamVar = new zziam(zzh);
                        zzi = zziamVar;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return zziamVar;
        }

        @Override // com.google.android.gms.internal.ads.zzbfp.zzao
        public boolean zzg() {
            return (this.zzd & 2) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbfp.zzao
        public zzq zzh() {
            zzq zzqVarZzc = zzq.zzc(this.zzf);
            return zzqVarZzc == null ? zzq.ENUM_FALSE : zzqVarZzc;
        }

        @Override // com.google.android.gms.internal.ads.zzbfp.zzao
        public boolean zzk() {
            return (this.zzd & 4) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbfp.zzao
        public zzap zzl() {
            zzap zzapVar = this.zzg;
            return zzapVar == null ? zzap.zzs() : zzapVar;
        }
    }

    public interface zzao extends zzicd {
        boolean zza();

        String zzb();

        zzhzl zzc();

        boolean zzg();

        zzq zzh();

        boolean zzk();

        zzap zzl();
    }

    public final class zzap extends zziar<zzap, zza> implements zzaq {
        public static final int zza = 1;
        public static final int zzb = 2;
        private static final zzap zzf;
        private static volatile zzick<zzap> zzg;
        private int zzc;
        private int zzd;
        private int zze;

        public final class zza extends zzial<zzap, zza> implements zzaq {
            public /* synthetic */ zza(byte[] bArr) {
                this();
            }

            @Override // com.google.android.gms.internal.ads.zzbfp.zzaq
            public boolean zza() {
                return ((zzap) this.zza).zza();
            }

            @Override // com.google.android.gms.internal.ads.zzbfp.zzaq
            public int zzb() {
                return ((zzap) this.zza).zzb();
            }

            public zza zzc(int i2) {
                zzbg();
                ((zzap) this.zza).zzu(i2);
                return this;
            }

            public zza zzd() {
                zzbg();
                ((zzap) this.zza).zzv();
                return this;
            }

            @Override // com.google.android.gms.internal.ads.zzbfp.zzaq
            public boolean zze() {
                return ((zzap) this.zza).zze();
            }

            @Override // com.google.android.gms.internal.ads.zzbfp.zzaq
            public int zzf() {
                return ((zzap) this.zza).zzf();
            }

            public zza zzg(int i2) {
                zzbg();
                ((zzap) this.zza).zzw(i2);
                return this;
            }

            public zza zzh() {
                zzbg();
                ((zzap) this.zza).zzx();
                return this;
            }

            private zza() {
                super(zzap.zzf);
            }
        }

        static {
            zzap zzapVar = new zzap();
            zzf = zzapVar;
            zziar.zzbu(zzap.class, zzapVar);
        }

        private zzap() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzA, reason: merged with bridge method [inline-methods] */
        public void zzv() {
            this.zzc &= -2;
            this.zzd = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzB, reason: merged with bridge method [inline-methods] */
        public void zzw(int i2) {
            this.zzc |= 2;
            this.zze = i2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzC, reason: merged with bridge method [inline-methods] */
        public void zzx() {
            this.zzc &= -3;
            this.zze = 0;
        }

        public static zzap zzc(ByteBuffer byteBuffer) throws zzibg {
            return (zzap) zziar.zzbR(zzf, byteBuffer);
        }

        public static zzap zzd(ByteBuffer byteBuffer, zziab zziabVar) throws zzibg {
            return (zzap) zziar.zzbQ(zzf, byteBuffer, zziabVar);
        }

        public static zzap zzg(zzhzl zzhzlVar) throws zzibg {
            return (zzap) zziar.zzbS(zzf, zzhzlVar);
        }

        public static zzap zzh(zzhzl zzhzlVar, zziab zziabVar) throws zzibg {
            return (zzap) zziar.zzbT(zzf, zzhzlVar, zziabVar);
        }

        public static zzap zzi(byte[] bArr) throws zzibg {
            return (zzap) zziar.zzbU(zzf, bArr);
        }

        public static zzap zzj(byte[] bArr, zziab zziabVar) throws zzibg {
            return (zzap) zziar.zzbV(zzf, bArr, zziabVar);
        }

        public static zzap zzk(InputStream inputStream) throws IOException {
            return (zzap) zziar.zzbW(zzf, inputStream);
        }

        public static zzap zzl(InputStream inputStream, zziab zziabVar) throws IOException {
            return (zzap) zziar.zzbX(zzf, inputStream, zziabVar);
        }

        public static zzap zzm(InputStream inputStream) throws IOException {
            return (zzap) zziar.zzca(zzf, inputStream);
        }

        public static zzap zzn(InputStream inputStream, zziab zziabVar) throws IOException {
            return (zzap) zziar.zzcb(zzf, inputStream, zziabVar);
        }

        public static zzap zzo(zzhzq zzhzqVar) throws IOException {
            return (zzap) zziar.zzbY(zzf, zzhzqVar);
        }

        public static zzap zzp(zzhzq zzhzqVar, zziab zziabVar) throws IOException {
            return (zzap) zziar.zzbZ(zzf, zzhzqVar, zziabVar);
        }

        public static zza zzq() {
            return (zza) zzf.zzbn();
        }

        public static zza zzr(zzap zzapVar) {
            return (zza) zzf.zzbo(zzapVar);
        }

        public static zzap zzs() {
            return zzf;
        }

        public static zzick<zzap> zzt() {
            return zzf.zzbd();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzz, reason: merged with bridge method [inline-methods] */
        public void zzu(int i2) {
            this.zzc |= 1;
            this.zzd = i2;
        }

        @Override // com.google.android.gms.internal.ads.zzbfp.zzaq
        public boolean zza() {
            return (this.zzc & 1) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbfp.zzaq
        public int zzb() {
            return this.zzd;
        }

        @Override // com.google.android.gms.internal.ads.zziar
        public final Object zzdc(zziaq zziaqVar, Object obj, Object obj2) {
            zzick zziamVar;
            int iOrdinal = zziaqVar.ordinal();
            if (iOrdinal == 0) {
                return (byte) 1;
            }
            if (iOrdinal == 2) {
                return zziar.zzbv(zzf, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001", new Object[]{"zzc", "zzd", "zze"});
            }
            if (iOrdinal == 3) {
                return new zzap();
            }
            byte[] bArr = null;
            if (iOrdinal == 4) {
                return new zza(bArr);
            }
            if (iOrdinal == 5) {
                return zzf;
            }
            if (iOrdinal != 6) {
                throw null;
            }
            zzick<zzap> zzickVar = zzg;
            if (zzickVar != null) {
                return zzickVar;
            }
            synchronized (zzap.class) {
                try {
                    zziamVar = zzg;
                    if (zziamVar == null) {
                        zziamVar = new zziam(zzf);
                        zzg = zziamVar;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return zziamVar;
        }

        @Override // com.google.android.gms.internal.ads.zzbfp.zzaq
        public boolean zze() {
            return (this.zzc & 2) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbfp.zzaq
        public int zzf() {
            return this.zze;
        }
    }

    public interface zzaq extends zzicd {
        boolean zza();

        int zzb();

        boolean zze();

        int zzf();
    }

    public final class zzar extends zziar<zzar, zza> implements zzas {
        public static final int zza = 1;
        public static final int zzb = 2;
        public static final int zzc = 3;
        private static final zzar zzh;
        private static volatile zzick<zzar> zzi;
        private int zzd;
        private int zze;
        private int zzf;
        private int zzg;

        public final class zza extends zzial<zzar, zza> implements zzas {
            public /* synthetic */ zza(byte[] bArr) {
                this();
            }

            @Override // com.google.android.gms.internal.ads.zzbfp.zzas
            public boolean zza() {
                return ((zzar) this.zza).zza();
            }

            @Override // com.google.android.gms.internal.ads.zzbfp.zzas
            public int zzb() {
                return ((zzar) this.zza).zzb();
            }

            public zza zzc(int i2) {
                zzbg();
                ((zzar) this.zza).zzw(i2);
                return this;
            }

            public zza zzd() {
                zzbg();
                ((zzar) this.zza).zzx();
                return this;
            }

            @Override // com.google.android.gms.internal.ads.zzbfp.zzas
            public boolean zze() {
                return ((zzar) this.zza).zze();
            }

            @Override // com.google.android.gms.internal.ads.zzbfp.zzas
            public int zzf() {
                return ((zzar) this.zza).zzf();
            }

            public zza zzg(int i2) {
                zzbg();
                ((zzar) this.zza).zzy(i2);
                return this;
            }

            public zza zzh() {
                zzbg();
                ((zzar) this.zza).zzz();
                return this;
            }

            @Override // com.google.android.gms.internal.ads.zzbfp.zzas
            public boolean zzi() {
                return ((zzar) this.zza).zzi();
            }

            @Override // com.google.android.gms.internal.ads.zzbfp.zzas
            public int zzj() {
                return ((zzar) this.zza).zzj();
            }

            public zza zzk(int i2) {
                zzbg();
                ((zzar) this.zza).zzA(i2);
                return this;
            }

            public zza zzl() {
                zzbg();
                ((zzar) this.zza).zzB();
                return this;
            }

            private zza() {
                super(zzar.zzh);
            }
        }

        static {
            zzar zzarVar = new zzar();
            zzh = zzarVar;
            zziar.zzbu(zzar.class, zzarVar);
        }

        private zzar() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzD, reason: merged with bridge method [inline-methods] */
        public void zzw(int i2) {
            this.zzd |= 1;
            this.zze = i2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzE, reason: merged with bridge method [inline-methods] */
        public void zzx() {
            this.zzd &= -2;
            this.zze = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzF, reason: merged with bridge method [inline-methods] */
        public void zzy(int i2) {
            this.zzd |= 2;
            this.zzf = i2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzG, reason: merged with bridge method [inline-methods] */
        public void zzz() {
            this.zzd &= -3;
            this.zzf = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzH, reason: merged with bridge method [inline-methods] */
        public void zzA(int i2) {
            this.zzd |= 4;
            this.zzg = i2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzI, reason: merged with bridge method [inline-methods] */
        public void zzB() {
            this.zzd &= -5;
            this.zzg = 0;
        }

        public static zzar zzc(ByteBuffer byteBuffer) throws zzibg {
            return (zzar) zziar.zzbR(zzh, byteBuffer);
        }

        public static zzar zzd(ByteBuffer byteBuffer, zziab zziabVar) throws zzibg {
            return (zzar) zziar.zzbQ(zzh, byteBuffer, zziabVar);
        }

        public static zzar zzg(zzhzl zzhzlVar) throws zzibg {
            return (zzar) zziar.zzbS(zzh, zzhzlVar);
        }

        public static zzar zzh(zzhzl zzhzlVar, zziab zziabVar) throws zzibg {
            return (zzar) zziar.zzbT(zzh, zzhzlVar, zziabVar);
        }

        public static zzar zzk(byte[] bArr) throws zzibg {
            return (zzar) zziar.zzbU(zzh, bArr);
        }

        public static zzar zzl(byte[] bArr, zziab zziabVar) throws zzibg {
            return (zzar) zziar.zzbV(zzh, bArr, zziabVar);
        }

        public static zzar zzm(InputStream inputStream) throws IOException {
            return (zzar) zziar.zzbW(zzh, inputStream);
        }

        public static zzar zzn(InputStream inputStream, zziab zziabVar) throws IOException {
            return (zzar) zziar.zzbX(zzh, inputStream, zziabVar);
        }

        public static zzar zzo(InputStream inputStream) throws IOException {
            return (zzar) zziar.zzca(zzh, inputStream);
        }

        public static zzar zzp(InputStream inputStream, zziab zziabVar) throws IOException {
            return (zzar) zziar.zzcb(zzh, inputStream, zziabVar);
        }

        public static zzar zzq(zzhzq zzhzqVar) throws IOException {
            return (zzar) zziar.zzbY(zzh, zzhzqVar);
        }

        public static zzar zzr(zzhzq zzhzqVar, zziab zziabVar) throws IOException {
            return (zzar) zziar.zzbZ(zzh, zzhzqVar, zziabVar);
        }

        public static zza zzs() {
            return (zza) zzh.zzbn();
        }

        public static zza zzt(zzar zzarVar) {
            return (zza) zzh.zzbo(zzarVar);
        }

        public static zzar zzu() {
            return zzh;
        }

        public static zzick<zzar> zzv() {
            return zzh.zzbd();
        }

        @Override // com.google.android.gms.internal.ads.zzbfp.zzas
        public boolean zza() {
            return (this.zzd & 1) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbfp.zzas
        public int zzb() {
            return this.zze;
        }

        @Override // com.google.android.gms.internal.ads.zziar
        public final Object zzdc(zziaq zziaqVar, Object obj, Object obj2) {
            zzick zziamVar;
            int iOrdinal = zziaqVar.ordinal();
            if (iOrdinal == 0) {
                return (byte) 1;
            }
            if (iOrdinal == 2) {
                return zziar.zzbv(zzh, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003င\u0002", new Object[]{"zzd", "zze", "zzf", "zzg"});
            }
            if (iOrdinal == 3) {
                return new zzar();
            }
            byte[] bArr = null;
            if (iOrdinal == 4) {
                return new zza(bArr);
            }
            if (iOrdinal == 5) {
                return zzh;
            }
            if (iOrdinal != 6) {
                throw null;
            }
            zzick<zzar> zzickVar = zzi;
            if (zzickVar != null) {
                return zzickVar;
            }
            synchronized (zzar.class) {
                try {
                    zziamVar = zzi;
                    if (zziamVar == null) {
                        zziamVar = new zziam(zzh);
                        zzi = zziamVar;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return zziamVar;
        }

        @Override // com.google.android.gms.internal.ads.zzbfp.zzas
        public boolean zze() {
            return (this.zzd & 2) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbfp.zzas
        public int zzf() {
            return this.zzf;
        }

        @Override // com.google.android.gms.internal.ads.zzbfp.zzas
        public boolean zzi() {
            return (this.zzd & 4) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbfp.zzas
        public int zzj() {
            return this.zzg;
        }
    }

    public interface zzas extends zzicd {
        boolean zza();

        int zzb();

        boolean zze();

        int zzf();

        boolean zzi();

        int zzj();
    }

    public final class zzat extends zziar<zzat, zza> implements zzbi {
        private static final zzat zzL;
        private static volatile zzick<zzat> zzM = null;
        public static final int zza = 5;
        public static final int zzb = 6;
        public static final int zzc = 7;
        public static final int zzd = 8;
        public static final int zze = 9;
        public static final int zzf = 10;
        public static final int zzg = 11;
        public static final int zzh = 12;
        public static final int zzi = 13;
        public static final int zzj = 14;
        public static final int zzk = 15;
        public static final int zzl = 16;
        public static final int zzm = 17;
        public static final int zzn = 18;
        public static final int zzo = 19;
        public static final int zzp = 20;
        private zzbc zzA;
        private zzay zzB;
        private int zzC;
        private int zzD;
        private zzap zzE;
        private int zzF;
        private int zzG;
        private int zzH;
        private int zzI;
        private int zzJ;
        private long zzK;
        private int zzu;
        private zzba zzv;
        private zzbe zzw;
        private zzbg zzx;
        private zzbj zzy;
        private zzau zzz;

        public final class zza extends zzial<zzat, zza> implements zzbi {
            public /* synthetic */ zza(byte[] bArr) {
                this();
            }

            public zza zzA(zzau zzauVar) {
                zzbg();
                ((zzat) this.zza).zzT(zzauVar);
                return this;
            }

            public zza zzB(zzau.zza zzaVar) {
                zzbg();
                ((zzat) this.zza).zzT(zzaVar.zzbu());
                return this;
            }

            public zza zzC(zzau zzauVar) {
                zzbg();
                ((zzat) this.zza).zzW(zzauVar);
                return this;
            }

            public zza zzD() {
                zzbg();
                ((zzat) this.zza).zzX();
                return this;
            }

            @Override // com.google.android.gms.internal.ads.zzbfp.zzbi
            public boolean zzE() {
                return ((zzat) this.zza).zzE();
            }

            @Override // com.google.android.gms.internal.ads.zzbfp.zzbi
            public zzbc zzF() {
                return ((zzat) this.zza).zzF();
            }

            public zza zzG(zzbc zzbcVar) {
                zzbg();
                ((zzat) this.zza).zzaa(zzbcVar);
                return this;
            }

            public zza zzH(zzbc.zza zzaVar) {
                zzbg();
                ((zzat) this.zza).zzaa(zzaVar.zzbu());
                return this;
            }

            public zza zzI(zzbc zzbcVar) {
                zzbg();
                ((zzat) this.zza).zzab(zzbcVar);
                return this;
            }

            public zza zzJ() {
                zzbg();
                ((zzat) this.zza).zzac();
                return this;
            }

            @Override // com.google.android.gms.internal.ads.zzbfp.zzbi
            public boolean zzK() {
                return ((zzat) this.zza).zzK();
            }

            @Override // com.google.android.gms.internal.ads.zzbfp.zzbi
            public zzay zzL() {
                return ((zzat) this.zza).zzL();
            }

            public zza zzM(zzay zzayVar) {
                zzbg();
                ((zzat) this.zza).zzad(zzayVar);
                return this;
            }

            public zza zzN(zzay.zza zzaVar) {
                zzbg();
                ((zzat) this.zza).zzad(zzaVar.zzbu());
                return this;
            }

            public zza zzO(zzay zzayVar) {
                zzbg();
                ((zzat) this.zza).zzag(zzayVar);
                return this;
            }

            public zza zzP() {
                zzbg();
                ((zzat) this.zza).zzah();
                return this;
            }

            @Override // com.google.android.gms.internal.ads.zzbfp.zzbi
            public boolean zzQ() {
                return ((zzat) this.zza).zzQ();
            }

            @Override // com.google.android.gms.internal.ads.zzbfp.zzbi
            public int zzR() {
                return ((zzat) this.zza).zzR();
            }

            public zza zzS(int i2) {
                zzbg();
                ((zzat) this.zza).zzak(i2);
                return this;
            }

            public zza zzT() {
                zzbg();
                ((zzat) this.zza).zzal();
                return this;
            }

            @Override // com.google.android.gms.internal.ads.zzbfp.zzbi
            public boolean zzU() {
                return ((zzat) this.zza).zzU();
            }

            @Override // com.google.android.gms.internal.ads.zzbfp.zzbi
            public int zzV() {
                return ((zzat) this.zza).zzV();
            }

            public zza zzW(int i2) {
                zzbg();
                ((zzat) this.zza).zzao(i2);
                return this;
            }

            public zza zzX() {
                zzbg();
                ((zzat) this.zza).zzap();
                return this;
            }

            @Override // com.google.android.gms.internal.ads.zzbfp.zzbi
            public boolean zzY() {
                return ((zzat) this.zza).zzY();
            }

            @Override // com.google.android.gms.internal.ads.zzbfp.zzbi
            public zzap zzZ() {
                return ((zzat) this.zza).zzZ();
            }

            @Override // com.google.android.gms.internal.ads.zzbfp.zzbi
            public boolean zza() {
                return ((zzat) this.zza).zza();
            }

            public zza zzaA(long j) {
                zzbg();
                ((zzat) this.zza).zzaJ(j);
                return this;
            }

            public zza zzaB() {
                zzbg();
                ((zzat) this.zza).zzaK();
                return this;
            }

            public zza zzaa(zzap zzapVar) {
                zzbg();
                ((zzat) this.zza).zzas(zzapVar);
                return this;
            }

            public zza zzab(zzap.zza zzaVar) {
                zzbg();
                ((zzat) this.zza).zzas(zzaVar.zzbu());
                return this;
            }

            public zza zzac(zzap zzapVar) {
                zzbg();
                ((zzat) this.zza).zzat(zzapVar);
                return this;
            }

            public zza zzad() {
                zzbg();
                ((zzat) this.zza).zzaw();
                return this;
            }

            @Override // com.google.android.gms.internal.ads.zzbfp.zzbi
            public boolean zzae() {
                return ((zzat) this.zza).zzae();
            }

            @Override // com.google.android.gms.internal.ads.zzbfp.zzbi
            public int zzaf() {
                return ((zzat) this.zza).zzaf();
            }

            public zza zzag(int i2) {
                zzbg();
                ((zzat) this.zza).zzax(i2);
                return this;
            }

            public zza zzah() {
                zzbg();
                ((zzat) this.zza).zzaA();
                return this;
            }

            @Override // com.google.android.gms.internal.ads.zzbfp.zzbi
            public boolean zzai() {
                return ((zzat) this.zza).zzai();
            }

            @Override // com.google.android.gms.internal.ads.zzbfp.zzbi
            public int zzaj() {
                return ((zzat) this.zza).zzaj();
            }

            public zza zzak(int i2) {
                zzbg();
                ((zzat) this.zza).zzaB(i2);
                return this;
            }

            public zza zzal() {
                zzbg();
                ((zzat) this.zza).zzaC();
                return this;
            }

            @Override // com.google.android.gms.internal.ads.zzbfp.zzbi
            public boolean zzam() {
                return ((zzat) this.zza).zzam();
            }

            @Override // com.google.android.gms.internal.ads.zzbfp.zzbi
            public int zzan() {
                return ((zzat) this.zza).zzan();
            }

            public zza zzao(int i2) {
                zzbg();
                ((zzat) this.zza).zzaD(i2);
                return this;
            }

            public zza zzap() {
                zzbg();
                ((zzat) this.zza).zzaE();
                return this;
            }

            @Override // com.google.android.gms.internal.ads.zzbfp.zzbi
            public boolean zzaq() {
                return ((zzat) this.zza).zzaq();
            }

            @Override // com.google.android.gms.internal.ads.zzbfp.zzbi
            public int zzar() {
                return ((zzat) this.zza).zzar();
            }

            public zza zzas(int i2) {
                zzbg();
                ((zzat) this.zza).zzaF(i2);
                return this;
            }

            public zza zzat() {
                zzbg();
                ((zzat) this.zza).zzaG();
                return this;
            }

            @Override // com.google.android.gms.internal.ads.zzbfp.zzbi
            public boolean zzau() {
                return ((zzat) this.zza).zzau();
            }

            @Override // com.google.android.gms.internal.ads.zzbfp.zzbi
            public int zzav() {
                return ((zzat) this.zza).zzav();
            }

            public zza zzaw(int i2) {
                zzbg();
                ((zzat) this.zza).zzaH(i2);
                return this;
            }

            public zza zzax() {
                zzbg();
                ((zzat) this.zza).zzaI();
                return this;
            }

            @Override // com.google.android.gms.internal.ads.zzbfp.zzbi
            public boolean zzay() {
                return ((zzat) this.zza).zzay();
            }

            @Override // com.google.android.gms.internal.ads.zzbfp.zzbi
            public long zzaz() {
                return ((zzat) this.zza).zzaz();
            }

            @Override // com.google.android.gms.internal.ads.zzbfp.zzbi
            public zzba zzb() {
                return ((zzat) this.zza).zzb();
            }

            public zza zzc(zzba zzbaVar) {
                zzbg();
                ((zzat) this.zza).zzB(zzbaVar);
                return this;
            }

            public zza zzd(zzba.zza zzaVar) {
                zzbg();
                ((zzat) this.zza).zzB(zzaVar.zzbu());
                return this;
            }

            public zza zze(zzba zzbaVar) {
                zzbg();
                ((zzat) this.zza).zzC(zzbaVar);
                return this;
            }

            public zza zzf() {
                zzbg();
                ((zzat) this.zza).zzD();
                return this;
            }

            @Override // com.google.android.gms.internal.ads.zzbfp.zzbi
            public boolean zzg() {
                return ((zzat) this.zza).zzg();
            }

            @Override // com.google.android.gms.internal.ads.zzbfp.zzbi
            public zzbe zzh() {
                return ((zzat) this.zza).zzh();
            }

            public zza zzi(zzbe zzbeVar) {
                zzbg();
                ((zzat) this.zza).zzG(zzbeVar);
                return this;
            }

            public zza zzj(zzbe.zza zzaVar) {
                zzbg();
                ((zzat) this.zza).zzG(zzaVar.zzbu());
                return this;
            }

            public zza zzk(zzbe zzbeVar) {
                zzbg();
                ((zzat) this.zza).zzH(zzbeVar);
                return this;
            }

            public zza zzl() {
                zzbg();
                ((zzat) this.zza).zzI();
                return this;
            }

            @Override // com.google.android.gms.internal.ads.zzbfp.zzbi
            public boolean zzm() {
                return ((zzat) this.zza).zzm();
            }

            @Override // com.google.android.gms.internal.ads.zzbfp.zzbi
            public zzbg zzn() {
                return ((zzat) this.zza).zzn();
            }

            public zza zzo(zzbg zzbgVar) {
                zzbg();
                ((zzat) this.zza).zzJ(zzbgVar);
                return this;
            }

            public zza zzp(zzbg.zza zzaVar) {
                zzbg();
                ((zzat) this.zza).zzJ(zzaVar.zzbu());
                return this;
            }

            public zza zzq(zzbg zzbgVar) {
                zzbg();
                ((zzat) this.zza).zzM(zzbgVar);
                return this;
            }

            public zza zzr() {
                zzbg();
                ((zzat) this.zza).zzN();
                return this;
            }

            @Override // com.google.android.gms.internal.ads.zzbfp.zzbi
            public boolean zzs() {
                return ((zzat) this.zza).zzs();
            }

            @Override // com.google.android.gms.internal.ads.zzbfp.zzbi
            public zzbj zzt() {
                return ((zzat) this.zza).zzt();
            }

            public zza zzu(zzbj zzbjVar) {
                zzbg();
                ((zzat) this.zza).zzO(zzbjVar);
                return this;
            }

            public zza zzv(zzbj.zza zzaVar) {
                zzbg();
                ((zzat) this.zza).zzO(zzaVar.zzbu());
                return this;
            }

            public zza zzw(zzbj zzbjVar) {
                zzbg();
                ((zzat) this.zza).zzP(zzbjVar);
                return this;
            }

            public zza zzx() {
                zzbg();
                ((zzat) this.zza).zzS();
                return this;
            }

            @Override // com.google.android.gms.internal.ads.zzbfp.zzbi
            public boolean zzy() {
                return ((zzat) this.zza).zzy();
            }

            @Override // com.google.android.gms.internal.ads.zzbfp.zzbi
            public zzau zzz() {
                return ((zzat) this.zza).zzz();
            }

            private zza() {
                super(zzat.zzL);
            }
        }

        static {
            zzat zzatVar = new zzat();
            zzL = zzatVar;
            zziar.zzbu(zzat.class, zzatVar);
        }

        private zzat() {
        }

        public static zzick<zzat> zzA() {
            return zzL.zzbd();
        }

        public static zzat zzc(ByteBuffer byteBuffer) throws zzibg {
            return (zzat) zziar.zzbR(zzL, byteBuffer);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzcA, reason: merged with bridge method [inline-methods] */
        public void zzal() {
            this.zzu &= -129;
            this.zzC = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzcB, reason: merged with bridge method [inline-methods] */
        public void zzao(int i2) {
            this.zzu |= 256;
            this.zzD = i2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzcC, reason: merged with bridge method [inline-methods] */
        public void zzap() {
            this.zzu &= -257;
            this.zzD = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzcD, reason: merged with bridge method [inline-methods] */
        public void zzas(zzap zzapVar) {
            zzapVar.getClass();
            this.zzE = zzapVar;
            this.zzu |= 512;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzcE, reason: merged with bridge method [inline-methods] */
        public void zzat(zzap zzapVar) {
            zzapVar.getClass();
            zzap zzapVar2 = this.zzE;
            if (zzapVar2 != null && zzapVar2 != zzap.zzs()) {
                zzap.zza zzaVarZzr = zzap.zzr(zzapVar2);
                zzaVarZzr.zzbo(zzapVar);
                zzapVar = zzaVarZzr.zzbt();
            }
            this.zzE = zzapVar;
            this.zzu |= 512;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzcF, reason: merged with bridge method [inline-methods] */
        public void zzaw() {
            this.zzE = null;
            this.zzu &= -513;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzcG, reason: merged with bridge method [inline-methods] */
        public void zzax(int i2) {
            this.zzu |= 1024;
            this.zzF = i2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzcH, reason: merged with bridge method [inline-methods] */
        public void zzaA() {
            this.zzu &= -1025;
            this.zzF = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzcI, reason: merged with bridge method [inline-methods] */
        public void zzaB(int i2) {
            this.zzu |= com.p004ironsource.mediationsdk.metadata.a.f25965n;
            this.zzG = i2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzcJ, reason: merged with bridge method [inline-methods] */
        public void zzaC() {
            this.zzu &= -2049;
            this.zzG = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzcK, reason: merged with bridge method [inline-methods] */
        public void zzaD(int i2) {
            this.zzu |= 4096;
            this.zzH = i2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzcL, reason: merged with bridge method [inline-methods] */
        public void zzaE() {
            this.zzu &= -4097;
            this.zzH = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzcM, reason: merged with bridge method [inline-methods] */
        public void zzaF(int i2) {
            this.zzu |= Segment.SIZE;
            this.zzI = i2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzcN, reason: merged with bridge method [inline-methods] */
        public void zzaG() {
            this.zzu &= -8193;
            this.zzI = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzcO, reason: merged with bridge method [inline-methods] */
        public void zzaH(int i2) {
            this.zzu |= 16384;
            this.zzJ = i2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzcP, reason: merged with bridge method [inline-methods] */
        public void zzaI() {
            this.zzu &= -16385;
            this.zzJ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzcQ, reason: merged with bridge method [inline-methods] */
        public void zzaJ(long j) {
            this.zzu |= 32768;
            this.zzK = j;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzcR, reason: merged with bridge method [inline-methods] */
        public void zzaK() {
            this.zzu &= -32769;
            this.zzK = 0L;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzce, reason: merged with bridge method [inline-methods] */
        public void zzB(zzba zzbaVar) {
            zzbaVar.getClass();
            this.zzv = zzbaVar;
            this.zzu |= 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzcf, reason: merged with bridge method [inline-methods] */
        public void zzC(zzba zzbaVar) {
            zzbaVar.getClass();
            zzba zzbaVar2 = this.zzv;
            if (zzbaVar2 != null && zzbaVar2 != zzba.zzy()) {
                zzba.zza zzaVarZzx = zzba.zzx(zzbaVar2);
                zzaVarZzx.zzbo(zzbaVar);
                zzbaVar = zzaVarZzx.zzbt();
            }
            this.zzv = zzbaVar;
            this.zzu |= 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzcg, reason: merged with bridge method [inline-methods] */
        public void zzD() {
            this.zzv = null;
            this.zzu &= -2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzch, reason: merged with bridge method [inline-methods] */
        public void zzG(zzbe zzbeVar) {
            zzbeVar.getClass();
            this.zzw = zzbeVar;
            this.zzu |= 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzci, reason: merged with bridge method [inline-methods] */
        public void zzH(zzbe zzbeVar) {
            zzbeVar.getClass();
            zzbe zzbeVar2 = this.zzw;
            if (zzbeVar2 != null && zzbeVar2 != zzbe.zzA()) {
                zzbe.zza zzaVarZzz = zzbe.zzz(zzbeVar2);
                zzaVarZzz.zzbo(zzbeVar);
                zzbeVar = zzaVarZzz.zzbt();
            }
            this.zzw = zzbeVar;
            this.zzu |= 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzcj, reason: merged with bridge method [inline-methods] */
        public void zzI() {
            this.zzw = null;
            this.zzu &= -3;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzck, reason: merged with bridge method [inline-methods] */
        public void zzJ(zzbg zzbgVar) {
            zzbgVar.getClass();
            this.zzx = zzbgVar;
            this.zzu |= 4;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzcl, reason: merged with bridge method [inline-methods] */
        public void zzM(zzbg zzbgVar) {
            zzbgVar.getClass();
            zzbg zzbgVar2 = this.zzx;
            if (zzbgVar2 != null && zzbgVar2 != zzbg.zzu()) {
                zzbg.zza zzaVarZzt = zzbg.zzt(zzbgVar2);
                zzaVarZzt.zzbo(zzbgVar);
                zzbgVar = zzaVarZzt.zzbt();
            }
            this.zzx = zzbgVar;
            this.zzu |= 4;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzcm, reason: merged with bridge method [inline-methods] */
        public void zzN() {
            this.zzx = null;
            this.zzu &= -5;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzcn, reason: merged with bridge method [inline-methods] */
        public void zzO(zzbj zzbjVar) {
            zzbjVar.getClass();
            this.zzy = zzbjVar;
            this.zzu |= 8;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzco, reason: merged with bridge method [inline-methods] */
        public void zzP(zzbj zzbjVar) {
            zzbjVar.getClass();
            zzbj zzbjVar2 = this.zzy;
            if (zzbjVar2 != null && zzbjVar2 != zzbj.zzs()) {
                zzbj.zza zzaVarZzr = zzbj.zzr(zzbjVar2);
                zzaVarZzr.zzbo(zzbjVar);
                zzbjVar = zzaVarZzr.zzbt();
            }
            this.zzy = zzbjVar;
            this.zzu |= 8;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzcp, reason: merged with bridge method [inline-methods] */
        public void zzS() {
            this.zzy = null;
            this.zzu &= -9;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzcq, reason: merged with bridge method [inline-methods] */
        public void zzT(zzau zzauVar) {
            zzauVar.getClass();
            this.zzz = zzauVar;
            this.zzu |= 16;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzcr, reason: merged with bridge method [inline-methods] */
        public void zzW(zzau zzauVar) {
            zzauVar.getClass();
            zzau zzauVar2 = this.zzz;
            if (zzauVar2 != null && zzauVar2 != zzau.zzu()) {
                zzau.zza zzaVarZzt = zzau.zzt(zzauVar2);
                zzaVarZzt.zzbo(zzauVar);
                zzauVar = zzaVarZzt.zzbt();
            }
            this.zzz = zzauVar;
            this.zzu |= 16;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzcs, reason: merged with bridge method [inline-methods] */
        public void zzX() {
            this.zzz = null;
            this.zzu &= -17;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzct, reason: merged with bridge method [inline-methods] */
        public void zzaa(zzbc zzbcVar) {
            zzbcVar.getClass();
            this.zzA = zzbcVar;
            this.zzu |= 32;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzcu, reason: merged with bridge method [inline-methods] */
        public void zzab(zzbc zzbcVar) {
            zzbcVar.getClass();
            zzbc zzbcVar2 = this.zzA;
            if (zzbcVar2 != null && zzbcVar2 != zzbc.zzu()) {
                zzbc.zza zzaVarZzt = zzbc.zzt(zzbcVar2);
                zzaVarZzt.zzbo(zzbcVar);
                zzbcVar = zzaVarZzt.zzbt();
            }
            this.zzA = zzbcVar;
            this.zzu |= 32;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzcv, reason: merged with bridge method [inline-methods] */
        public void zzac() {
            this.zzA = null;
            this.zzu &= -33;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzcw, reason: merged with bridge method [inline-methods] */
        public void zzad(zzay zzayVar) {
            zzayVar.getClass();
            this.zzB = zzayVar;
            this.zzu |= 64;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzcx, reason: merged with bridge method [inline-methods] */
        public void zzag(zzay zzayVar) {
            zzayVar.getClass();
            zzay zzayVar2 = this.zzB;
            if (zzayVar2 != null && zzayVar2 != zzay.zzx()) {
                zzay.zza zzaVarZzw = zzay.zzw(zzayVar2);
                zzaVarZzw.zzbo(zzayVar);
                zzayVar = zzaVarZzw.zzbt();
            }
            this.zzB = zzayVar;
            this.zzu |= 64;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzcy, reason: merged with bridge method [inline-methods] */
        public void zzah() {
            this.zzB = null;
            this.zzu &= -65;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzcz, reason: merged with bridge method [inline-methods] */
        public void zzak(int i2) {
            this.zzu |= 128;
            this.zzC = i2;
        }

        public static zzat zzd(ByteBuffer byteBuffer, zziab zziabVar) throws zzibg {
            return (zzat) zziar.zzbQ(zzL, byteBuffer, zziabVar);
        }

        public static zzat zze(zzhzl zzhzlVar) throws zzibg {
            return (zzat) zziar.zzbS(zzL, zzhzlVar);
        }

        public static zzat zzi(zzhzl zzhzlVar, zziab zziabVar) throws zzibg {
            return (zzat) zziar.zzbT(zzL, zzhzlVar, zziabVar);
        }

        public static zzat zzj(byte[] bArr) throws zzibg {
            return (zzat) zziar.zzbU(zzL, bArr);
        }

        public static zzat zzk(byte[] bArr, zziab zziabVar) throws zzibg {
            return (zzat) zziar.zzbV(zzL, bArr, zziabVar);
        }

        public static zzat zzl(InputStream inputStream) throws IOException {
            return (zzat) zziar.zzbW(zzL, inputStream);
        }

        public static zzat zzo(InputStream inputStream, zziab zziabVar) throws IOException {
            return (zzat) zziar.zzbX(zzL, inputStream, zziabVar);
        }

        public static zzat zzp(InputStream inputStream) throws IOException {
            return (zzat) zziar.zzca(zzL, inputStream);
        }

        public static zzat zzq(InputStream inputStream, zziab zziabVar) throws IOException {
            return (zzat) zziar.zzcb(zzL, inputStream, zziabVar);
        }

        public static zzat zzr(zzhzq zzhzqVar) throws IOException {
            return (zzat) zziar.zzbY(zzL, zzhzqVar);
        }

        public static zzat zzu(zzhzq zzhzqVar, zziab zziabVar) throws IOException {
            return (zzat) zziar.zzbZ(zzL, zzhzqVar, zziabVar);
        }

        public static zza zzv() {
            return (zza) zzL.zzbn();
        }

        public static zza zzw(zzat zzatVar) {
            return (zza) zzL.zzbo(zzatVar);
        }

        public static zzat zzx() {
            return zzL;
        }

        @Override // com.google.android.gms.internal.ads.zzbfp.zzbi
        public boolean zzE() {
            return (this.zzu & 32) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbfp.zzbi
        public zzbc zzF() {
            zzbc zzbcVar = this.zzA;
            return zzbcVar == null ? zzbc.zzu() : zzbcVar;
        }

        @Override // com.google.android.gms.internal.ads.zzbfp.zzbi
        public boolean zzK() {
            return (this.zzu & 64) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbfp.zzbi
        public zzay zzL() {
            zzay zzayVar = this.zzB;
            return zzayVar == null ? zzay.zzx() : zzayVar;
        }

        @Override // com.google.android.gms.internal.ads.zzbfp.zzbi
        public boolean zzQ() {
            return (this.zzu & 128) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbfp.zzbi
        public int zzR() {
            return this.zzC;
        }

        @Override // com.google.android.gms.internal.ads.zzbfp.zzbi
        public boolean zzU() {
            return (this.zzu & 256) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbfp.zzbi
        public int zzV() {
            return this.zzD;
        }

        @Override // com.google.android.gms.internal.ads.zzbfp.zzbi
        public boolean zzY() {
            return (this.zzu & 512) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbfp.zzbi
        public zzap zzZ() {
            zzap zzapVar = this.zzE;
            return zzapVar == null ? zzap.zzs() : zzapVar;
        }

        @Override // com.google.android.gms.internal.ads.zzbfp.zzbi
        public boolean zza() {
            return (this.zzu & 1) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbfp.zzbi
        public boolean zzae() {
            return (this.zzu & 1024) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbfp.zzbi
        public int zzaf() {
            return this.zzF;
        }

        @Override // com.google.android.gms.internal.ads.zzbfp.zzbi
        public boolean zzai() {
            return (this.zzu & com.p004ironsource.mediationsdk.metadata.a.f25965n) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbfp.zzbi
        public int zzaj() {
            return this.zzG;
        }

        @Override // com.google.android.gms.internal.ads.zzbfp.zzbi
        public boolean zzam() {
            return (this.zzu & 4096) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbfp.zzbi
        public int zzan() {
            return this.zzH;
        }

        @Override // com.google.android.gms.internal.ads.zzbfp.zzbi
        public boolean zzaq() {
            return (this.zzu & Segment.SIZE) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbfp.zzbi
        public int zzar() {
            return this.zzI;
        }

        @Override // com.google.android.gms.internal.ads.zzbfp.zzbi
        public boolean zzau() {
            return (this.zzu & 16384) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbfp.zzbi
        public int zzav() {
            return this.zzJ;
        }

        @Override // com.google.android.gms.internal.ads.zzbfp.zzbi
        public boolean zzay() {
            return (this.zzu & 32768) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbfp.zzbi
        public long zzaz() {
            return this.zzK;
        }

        @Override // com.google.android.gms.internal.ads.zzbfp.zzbi
        public zzba zzb() {
            zzba zzbaVar = this.zzv;
            return zzbaVar == null ? zzba.zzy() : zzbaVar;
        }

        @Override // com.google.android.gms.internal.ads.zziar
        public final Object zzdc(zziaq zziaqVar, Object obj, Object obj2) {
            zzick zziamVar;
            int iOrdinal = zziaqVar.ordinal();
            if (iOrdinal == 0) {
                return (byte) 1;
            }
            if (iOrdinal == 2) {
                return zziar.zzbv(zzL, "\u0004\u0010\u0000\u0001\u0005\u0014\u0010\u0000\u0000\u0000\u0005ဉ\u0000\u0006ဉ\u0001\u0007ဉ\u0002\bဉ\u0003\tဉ\u0004\nဉ\u0005\u000bဉ\u0006\fင\u0007\rင\b\u000eဉ\t\u000fင\n\u0010င\u000b\u0011င\f\u0012င\r\u0013င\u000e\u0014ဃ\u000f", new Object[]{"zzu", "zzv", "zzw", "zzx", "zzy", "zzz", "zzA", "zzB", "zzC", "zzD", "zzE", "zzF", "zzG", "zzH", "zzI", "zzJ", "zzK"});
            }
            if (iOrdinal == 3) {
                return new zzat();
            }
            byte[] bArr = null;
            if (iOrdinal == 4) {
                return new zza(bArr);
            }
            if (iOrdinal == 5) {
                return zzL;
            }
            if (iOrdinal != 6) {
                throw null;
            }
            zzick<zzat> zzickVar = zzM;
            if (zzickVar != null) {
                return zzickVar;
            }
            synchronized (zzat.class) {
                try {
                    zziamVar = zzM;
                    if (zziamVar == null) {
                        zziamVar = new zziam(zzL);
                        zzM = zziamVar;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return zziamVar;
        }

        @Override // com.google.android.gms.internal.ads.zzbfp.zzbi
        public boolean zzg() {
            return (this.zzu & 2) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbfp.zzbi
        public zzbe zzh() {
            zzbe zzbeVar = this.zzw;
            return zzbeVar == null ? zzbe.zzA() : zzbeVar;
        }

        @Override // com.google.android.gms.internal.ads.zzbfp.zzbi
        public boolean zzm() {
            return (this.zzu & 4) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbfp.zzbi
        public zzbg zzn() {
            zzbg zzbgVar = this.zzx;
            return zzbgVar == null ? zzbg.zzu() : zzbgVar;
        }

        @Override // com.google.android.gms.internal.ads.zzbfp.zzbi
        public boolean zzs() {
            return (this.zzu & 8) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbfp.zzbi
        public zzbj zzt() {
            zzbj zzbjVar = this.zzy;
            return zzbjVar == null ? zzbj.zzs() : zzbjVar;
        }

        @Override // com.google.android.gms.internal.ads.zzbfp.zzbi
        public boolean zzy() {
            return (this.zzu & 16) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbfp.zzbi
        public zzau zzz() {
            zzau zzauVar = this.zzz;
            return zzauVar == null ? zzau.zzu() : zzauVar;
        }
    }

    public final class zzau extends zziar<zzau, zza> implements zzav {
        public static final int zza = 1;
        public static final int zzb = 2;
        public static final int zzc = 3;
        private static final zzau zzh;
        private static volatile zzick<zzau> zzi;
        private int zzd;
        private int zze = 1000;
        private zzaw zzf;
        private zzap zzg;

        public final class zza extends zzial<zzau, zza> implements zzav {
            public /* synthetic */ zza(byte[] bArr) {
                this();
            }

            @Override // com.google.android.gms.internal.ads.zzbfp.zzav
            public boolean zza() {
                return ((zzau) this.zza).zza();
            }

            @Override // com.google.android.gms.internal.ads.zzbfp.zzav
            public zzq zzb() {
                return ((zzau) this.zza).zzb();
            }

            public zza zzc(zzq zzqVar) {
                zzbg();
                ((zzau) this.zza).zzw(zzqVar);
                return this;
            }

            public zza zzd() {
                zzbg();
                ((zzau) this.zza).zzx();
                return this;
            }

            @Override // com.google.android.gms.internal.ads.zzbfp.zzav
            public boolean zze() {
                return ((zzau) this.zza).zze();
            }

            @Override // com.google.android.gms.internal.ads.zzbfp.zzav
            public zzaw zzf() {
                return ((zzau) this.zza).zzf();
            }

            public zza zzg(zzaw zzawVar) {
                zzbg();
                ((zzau) this.zza).zzy(zzawVar);
                return this;
            }

            public zza zzh(zzaw.zza zzaVar) {
                zzbg();
                ((zzau) this.zza).zzy(zzaVar.zzbu());
                return this;
            }

            public zza zzi(zzaw zzawVar) {
                zzbg();
                ((zzau) this.zza).zzz(zzawVar);
                return this;
            }

            public zza zzj() {
                zzbg();
                ((zzau) this.zza).zzA();
                return this;
            }

            @Override // com.google.android.gms.internal.ads.zzbfp.zzav
            public boolean zzk() {
                return ((zzau) this.zza).zzk();
            }

            @Override // com.google.android.gms.internal.ads.zzbfp.zzav
            public zzap zzl() {
                return ((zzau) this.zza).zzl();
            }

            public zza zzm(zzap zzapVar) {
                zzbg();
                ((zzau) this.zza).zzB(zzapVar);
                return this;
            }

            public zza zzn(zzap.zza zzaVar) {
                zzbg();
                ((zzau) this.zza).zzB(zzaVar.zzbu());
                return this;
            }

            public zza zzo(zzap zzapVar) {
                zzbg();
                ((zzau) this.zza).zzC(zzapVar);
                return this;
            }

            public zza zzp() {
                zzbg();
                ((zzau) this.zza).zzD();
                return this;
            }

            private zza() {
                super(zzau.zzh);
            }
        }

        static {
            zzau zzauVar = new zzau();
            zzh = zzauVar;
            zziar.zzbu(zzau.class, zzauVar);
        }

        private zzau() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzF, reason: merged with bridge method [inline-methods] */
        public void zzw(zzq zzqVar) {
            this.zze = zzqVar.zza();
            this.zzd |= 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzG, reason: merged with bridge method [inline-methods] */
        public void zzx() {
            this.zzd &= -2;
            this.zze = 1000;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzH, reason: merged with bridge method [inline-methods] */
        public void zzy(zzaw zzawVar) {
            zzawVar.getClass();
            this.zzf = zzawVar;
            this.zzd |= 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzI, reason: merged with bridge method [inline-methods] */
        public void zzz(zzaw zzawVar) {
            zzawVar.getClass();
            zzaw zzawVar2 = this.zzf;
            if (zzawVar2 != null && zzawVar2 != zzaw.zzr()) {
                zzaw.zza zzaVarZzq = zzaw.zzq(zzawVar2);
                zzaVarZzq.zzbo(zzawVar);
                zzawVar = zzaVarZzq.zzbt();
            }
            this.zzf = zzawVar;
            this.zzd |= 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzJ, reason: merged with bridge method [inline-methods] */
        public void zzA() {
            this.zzf = null;
            this.zzd &= -3;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzK, reason: merged with bridge method [inline-methods] */
        public void zzB(zzap zzapVar) {
            zzapVar.getClass();
            this.zzg = zzapVar;
            this.zzd |= 4;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzL, reason: merged with bridge method [inline-methods] */
        public void zzC(zzap zzapVar) {
            zzapVar.getClass();
            zzap zzapVar2 = this.zzg;
            if (zzapVar2 != null && zzapVar2 != zzap.zzs()) {
                zzap.zza zzaVarZzr = zzap.zzr(zzapVar2);
                zzaVarZzr.zzbo(zzapVar);
                zzapVar = zzaVarZzr.zzbt();
            }
            this.zzg = zzapVar;
            this.zzd |= 4;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzM, reason: merged with bridge method [inline-methods] */
        public void zzD() {
            this.zzg = null;
            this.zzd &= -5;
        }

        public static zzau zzc(ByteBuffer byteBuffer) throws zzibg {
            return (zzau) zziar.zzbR(zzh, byteBuffer);
        }

        public static zzau zzd(ByteBuffer byteBuffer, zziab zziabVar) throws zzibg {
            return (zzau) zziar.zzbQ(zzh, byteBuffer, zziabVar);
        }

        public static zzau zzg(zzhzl zzhzlVar) throws zzibg {
            return (zzau) zziar.zzbS(zzh, zzhzlVar);
        }

        public static zzau zzh(zzhzl zzhzlVar, zziab zziabVar) throws zzibg {
            return (zzau) zziar.zzbT(zzh, zzhzlVar, zziabVar);
        }

        public static zzau zzi(byte[] bArr) throws zzibg {
            return (zzau) zziar.zzbU(zzh, bArr);
        }

        public static zzau zzj(byte[] bArr, zziab zziabVar) throws zzibg {
            return (zzau) zziar.zzbV(zzh, bArr, zziabVar);
        }

        public static zzau zzm(InputStream inputStream) throws IOException {
            return (zzau) zziar.zzbW(zzh, inputStream);
        }

        public static zzau zzn(InputStream inputStream, zziab zziabVar) throws IOException {
            return (zzau) zziar.zzbX(zzh, inputStream, zziabVar);
        }

        public static zzau zzo(InputStream inputStream) throws IOException {
            return (zzau) zziar.zzca(zzh, inputStream);
        }

        public static zzau zzp(InputStream inputStream, zziab zziabVar) throws IOException {
            return (zzau) zziar.zzcb(zzh, inputStream, zziabVar);
        }

        public static zzau zzq(zzhzq zzhzqVar) throws IOException {
            return (zzau) zziar.zzbY(zzh, zzhzqVar);
        }

        public static zzau zzr(zzhzq zzhzqVar, zziab zziabVar) throws IOException {
            return (zzau) zziar.zzbZ(zzh, zzhzqVar, zziabVar);
        }

        public static zza zzs() {
            return (zza) zzh.zzbn();
        }

        public static zza zzt(zzau zzauVar) {
            return (zza) zzh.zzbo(zzauVar);
        }

        public static zzau zzu() {
            return zzh;
        }

        public static zzick<zzau> zzv() {
            return zzh.zzbd();
        }

        @Override // com.google.android.gms.internal.ads.zzbfp.zzav
        public boolean zza() {
            return (this.zzd & 1) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbfp.zzav
        public zzq zzb() {
            zzq zzqVarZzc = zzq.zzc(this.zze);
            return zzqVarZzc == null ? zzq.ENUM_UNKNOWN : zzqVarZzc;
        }

        @Override // com.google.android.gms.internal.ads.zziar
        public final Object zzdc(zziaq zziaqVar, Object obj, Object obj2) {
            zzick zziamVar;
            int iOrdinal = zziaqVar.ordinal();
            if (iOrdinal == 0) {
                return (byte) 1;
            }
            if (iOrdinal == 2) {
                return zziar.zzbv(zzh, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002ဉ\u0001\u0003ဉ\u0002", new Object[]{"zzd", "zze", zzq.zze(), "zzf", "zzg"});
            }
            if (iOrdinal == 3) {
                return new zzau();
            }
            byte[] bArr = null;
            if (iOrdinal == 4) {
                return new zza(bArr);
            }
            if (iOrdinal == 5) {
                return zzh;
            }
            if (iOrdinal != 6) {
                throw null;
            }
            zzick<zzau> zzickVar = zzi;
            if (zzickVar != null) {
                return zzickVar;
            }
            synchronized (zzau.class) {
                try {
                    zziamVar = zzi;
                    if (zziamVar == null) {
                        zziamVar = new zziam(zzh);
                        zzi = zziamVar;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return zziamVar;
        }

        @Override // com.google.android.gms.internal.ads.zzbfp.zzav
        public boolean zze() {
            return (this.zzd & 2) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbfp.zzav
        public zzaw zzf() {
            zzaw zzawVar = this.zzf;
            return zzawVar == null ? zzaw.zzr() : zzawVar;
        }

        @Override // com.google.android.gms.internal.ads.zzbfp.zzav
        public boolean zzk() {
            return (this.zzd & 4) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbfp.zzav
        public zzap zzl() {
            zzap zzapVar = this.zzg;
            return zzapVar == null ? zzap.zzs() : zzapVar;
        }
    }

    public interface zzav extends zzicd {
        boolean zza();

        zzq zzb();

        boolean zze();

        zzaw zzf();

        boolean zzk();

        zzap zzl();
    }

    public final class zzaw extends zziar<zzaw, zza> implements zzax {
        public static final int zza = 1;
        private static final zzaw zzd;
        private static volatile zzick<zzaw> zze;
        private int zzb;
        private int zzc;

        public final class zza extends zzial<zzaw, zza> implements zzax {
            public /* synthetic */ zza(byte[] bArr) {
                this();
            }

            @Override // com.google.android.gms.internal.ads.zzbfp.zzax
            public boolean zza() {
                return ((zzaw) this.zza).zza();
            }

            @Override // com.google.android.gms.internal.ads.zzbfp.zzax
            public zzb zzb() {
                return ((zzaw) this.zza).zzb();
            }

            public zza zzc(zzb zzbVar) {
                zzbg();
                ((zzaw) this.zza).zzt(zzbVar);
                return this;
            }

            public zza zzd() {
                zzbg();
                ((zzaw) this.zza).zzu();
                return this;
            }

            private zza() {
                super(zzaw.zzd);
            }
        }

        public enum zzb implements zziav {
            VIDEO_ERROR_CODE_UNSPECIFIED(0),
            OPENGL_RENDERING_FAILED(1),
            CACHE_LOAD_FAILED(2),
            ANDROID_TARGET_API_TOO_LOW(3);

            public static final int zze = 0;
            public static final int zzf = 1;
            public static final int zzg = 2;
            public static final int zzh = 3;
            private static final zziaw<zzb> zzi = new zziaw<zzb>() { // from class: com.google.android.gms.internal.ads.zzbfp.zzaw.zzb.1
                /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
                public zzb zzb(int i2) {
                    return zzb.zzc(i2);
                }
            };
            private final int zzj;

            final class zza implements zziax {
                static final zziax zza = new zza();

                private zza() {
                }

                @Override // com.google.android.gms.internal.ads.zziax
                public boolean zza(int i2) {
                    return zzb.zzc(i2) != null;
                }
            }

            zzb(int i2) {
                this.zzj = i2;
            }

            public static zzb zzc(int i2) {
                if (i2 == 0) {
                    return VIDEO_ERROR_CODE_UNSPECIFIED;
                }
                if (i2 == 1) {
                    return OPENGL_RENDERING_FAILED;
                }
                if (i2 == 2) {
                    return CACHE_LOAD_FAILED;
                }
                if (i2 != 3) {
                    return null;
                }
                return ANDROID_TARGET_API_TOO_LOW;
            }

            public static zziaw<zzb> zzd() {
                return zzi;
            }

            public static zziax zze() {
                return zza.zza;
            }

            @Override // java.lang.Enum
            public final String toString() {
                return Integer.toString(this.zzj);
            }

            @Override // com.google.android.gms.internal.ads.zziav
            public final int zza() {
                return this.zzj;
            }
        }

        static {
            zzaw zzawVar = new zzaw();
            zzd = zzawVar;
            zziar.zzbu(zzaw.class, zzawVar);
        }

        private zzaw() {
        }

        public static zzaw zzc(ByteBuffer byteBuffer) throws zzibg {
            return (zzaw) zziar.zzbR(zzd, byteBuffer);
        }

        public static zzaw zzd(ByteBuffer byteBuffer, zziab zziabVar) throws zzibg {
            return (zzaw) zziar.zzbQ(zzd, byteBuffer, zziabVar);
        }

        public static zzaw zze(zzhzl zzhzlVar) throws zzibg {
            return (zzaw) zziar.zzbS(zzd, zzhzlVar);
        }

        public static zzaw zzg(zzhzl zzhzlVar, zziab zziabVar) throws zzibg {
            return (zzaw) zziar.zzbT(zzd, zzhzlVar, zziabVar);
        }

        public static zzaw zzh(byte[] bArr) throws zzibg {
            return (zzaw) zziar.zzbU(zzd, bArr);
        }

        public static zzaw zzi(byte[] bArr, zziab zziabVar) throws zzibg {
            return (zzaw) zziar.zzbV(zzd, bArr, zziabVar);
        }

        public static zzaw zzj(InputStream inputStream) throws IOException {
            return (zzaw) zziar.zzbW(zzd, inputStream);
        }

        public static zzaw zzk(InputStream inputStream, zziab zziabVar) throws IOException {
            return (zzaw) zziar.zzbX(zzd, inputStream, zziabVar);
        }

        public static zzaw zzl(InputStream inputStream) throws IOException {
            return (zzaw) zziar.zzca(zzd, inputStream);
        }

        public static zzaw zzm(InputStream inputStream, zziab zziabVar) throws IOException {
            return (zzaw) zziar.zzcb(zzd, inputStream, zziabVar);
        }

        public static zzaw zzn(zzhzq zzhzqVar) throws IOException {
            return (zzaw) zziar.zzbY(zzd, zzhzqVar);
        }

        public static zzaw zzo(zzhzq zzhzqVar, zziab zziabVar) throws IOException {
            return (zzaw) zziar.zzbZ(zzd, zzhzqVar, zziabVar);
        }

        public static zza zzp() {
            return (zza) zzd.zzbn();
        }

        public static zza zzq(zzaw zzawVar) {
            return (zza) zzd.zzbo(zzawVar);
        }

        public static zzaw zzr() {
            return zzd;
        }

        public static zzick<zzaw> zzs() {
            return zzd.zzbd();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzw, reason: merged with bridge method [inline-methods] */
        public void zzt(zzb zzbVar) {
            this.zzc = zzbVar.zza();
            this.zzb |= 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzx, reason: merged with bridge method [inline-methods] */
        public void zzu() {
            this.zzb &= -2;
            this.zzc = 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbfp.zzax
        public boolean zza() {
            return (this.zzb & 1) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbfp.zzax
        public zzb zzb() {
            zzb zzbVarZzc = zzb.zzc(this.zzc);
            return zzbVarZzc == null ? zzb.VIDEO_ERROR_CODE_UNSPECIFIED : zzbVarZzc;
        }

        @Override // com.google.android.gms.internal.ads.zziar
        public final Object zzdc(zziaq zziaqVar, Object obj, Object obj2) {
            zzick zziamVar;
            int iOrdinal = zziaqVar.ordinal();
            if (iOrdinal == 0) {
                return (byte) 1;
            }
            if (iOrdinal == 2) {
                return zziar.zzbv(zzd, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001᠌\u0000", new Object[]{"zzb", "zzc", zzb.zze()});
            }
            if (iOrdinal == 3) {
                return new zzaw();
            }
            byte[] bArr = null;
            if (iOrdinal == 4) {
                return new zza(bArr);
            }
            if (iOrdinal == 5) {
                return zzd;
            }
            if (iOrdinal != 6) {
                throw null;
            }
            zzick<zzaw> zzickVar = zze;
            if (zzickVar != null) {
                return zzickVar;
            }
            synchronized (zzaw.class) {
                try {
                    zziamVar = zze;
                    if (zziamVar == null) {
                        zziamVar = new zziam(zzd);
                        zze = zziamVar;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return zziamVar;
        }
    }

    public interface zzax extends zzicd {
        boolean zza();

        zzaw.zzb zzb();
    }

    public final class zzay extends zziar<zzay, zza> implements zzaz {
        public static final int zza = 1;
        public static final int zzb = 2;
        public static final int zzc = 3;
        public static final int zzd = 4;
        private static final zzay zzj;
        private static volatile zzick<zzay> zzk;
        private int zze;
        private zzar zzf;
        private int zzg = 1000;
        private zzaw zzh;
        private zzap zzi;

        public final class zza extends zzial<zzay, zza> implements zzaz {
            public /* synthetic */ zza(byte[] bArr) {
                this();
            }

            @Override // com.google.android.gms.internal.ads.zzbfp.zzaz
            public boolean zza() {
                return ((zzay) this.zza).zza();
            }

            @Override // com.google.android.gms.internal.ads.zzbfp.zzaz
            public zzar zzb() {
                return ((zzay) this.zza).zzb();
            }

            public zza zzc(zzar zzarVar) {
                zzbg();
                ((zzay) this.zza).zzz(zzarVar);
                return this;
            }

            public zza zzd(zzar.zza zzaVar) {
                zzbg();
                ((zzay) this.zza).zzz(zzaVar.zzbu());
                return this;
            }

            public zza zze(zzar zzarVar) {
                zzbg();
                ((zzay) this.zza).zzA(zzarVar);
                return this;
            }

            public zza zzf() {
                zzbg();
                ((zzay) this.zza).zzB();
                return this;
            }

            @Override // com.google.android.gms.internal.ads.zzbfp.zzaz
            public boolean zzg() {
                return ((zzay) this.zza).zzg();
            }

            @Override // com.google.android.gms.internal.ads.zzbfp.zzaz
            public zzq zzh() {
                return ((zzay) this.zza).zzh();
            }

            public zza zzi(zzq zzqVar) {
                zzbg();
                ((zzay) this.zza).zzC(zzqVar);
                return this;
            }

            public zza zzj() {
                zzbg();
                ((zzay) this.zza).zzD();
                return this;
            }

            @Override // com.google.android.gms.internal.ads.zzbfp.zzaz
            public boolean zzk() {
                return ((zzay) this.zza).zzk();
            }

            @Override // com.google.android.gms.internal.ads.zzbfp.zzaz
            public zzaw zzl() {
                return ((zzay) this.zza).zzl();
            }

            public zza zzm(zzaw zzawVar) {
                zzbg();
                ((zzay) this.zza).zzE(zzawVar);
                return this;
            }

            public zza zzn(zzaw.zza zzaVar) {
                zzbg();
                ((zzay) this.zza).zzE(zzaVar.zzbu());
                return this;
            }

            public zza zzo(zzaw zzawVar) {
                zzbg();
                ((zzay) this.zza).zzF(zzawVar);
                return this;
            }

            public zza zzp() {
                zzbg();
                ((zzay) this.zza).zzG();
                return this;
            }

            @Override // com.google.android.gms.internal.ads.zzbfp.zzaz
            public boolean zzq() {
                return ((zzay) this.zza).zzq();
            }

            @Override // com.google.android.gms.internal.ads.zzbfp.zzaz
            public zzap zzr() {
                return ((zzay) this.zza).zzr();
            }

            public zza zzs(zzap zzapVar) {
                zzbg();
                ((zzay) this.zza).zzH(zzapVar);
                return this;
            }

            public zza zzt(zzap.zza zzaVar) {
                zzbg();
                ((zzay) this.zza).zzH(zzaVar.zzbu());
                return this;
            }

            public zza zzu(zzap zzapVar) {
                zzbg();
                ((zzay) this.zza).zzI(zzapVar);
                return this;
            }

            public zza zzv() {
                zzbg();
                ((zzay) this.zza).zzJ();
                return this;
            }

            private zza() {
                super(zzay.zzj);
            }
        }

        static {
            zzay zzayVar = new zzay();
            zzj = zzayVar;
            zziar.zzbu(zzay.class, zzayVar);
        }

        private zzay() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzL, reason: merged with bridge method [inline-methods] */
        public void zzz(zzar zzarVar) {
            zzarVar.getClass();
            this.zzf = zzarVar;
            this.zze |= 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzM, reason: merged with bridge method [inline-methods] */
        public void zzA(zzar zzarVar) {
            zzarVar.getClass();
            zzar zzarVar2 = this.zzf;
            if (zzarVar2 != null && zzarVar2 != zzar.zzu()) {
                zzar.zza zzaVarZzt = zzar.zzt(zzarVar2);
                zzaVarZzt.zzbo(zzarVar);
                zzarVar = zzaVarZzt.zzbt();
            }
            this.zzf = zzarVar;
            this.zze |= 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzN, reason: merged with bridge method [inline-methods] */
        public void zzB() {
            this.zzf = null;
            this.zze &= -2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzO, reason: merged with bridge method [inline-methods] */
        public void zzC(zzq zzqVar) {
            this.zzg = zzqVar.zza();
            this.zze |= 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzP, reason: merged with bridge method [inline-methods] */
        public void zzD() {
            this.zze &= -3;
            this.zzg = 1000;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzQ, reason: merged with bridge method [inline-methods] */
        public void zzE(zzaw zzawVar) {
            zzawVar.getClass();
            this.zzh = zzawVar;
            this.zze |= 4;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzR, reason: merged with bridge method [inline-methods] */
        public void zzF(zzaw zzawVar) {
            zzawVar.getClass();
            zzaw zzawVar2 = this.zzh;
            if (zzawVar2 != null && zzawVar2 != zzaw.zzr()) {
                zzaw.zza zzaVarZzq = zzaw.zzq(zzawVar2);
                zzaVarZzq.zzbo(zzawVar);
                zzawVar = zzaVarZzq.zzbt();
            }
            this.zzh = zzawVar;
            this.zze |= 4;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzS, reason: merged with bridge method [inline-methods] */
        public void zzG() {
            this.zzh = null;
            this.zze &= -5;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzT, reason: merged with bridge method [inline-methods] */
        public void zzH(zzap zzapVar) {
            zzapVar.getClass();
            this.zzi = zzapVar;
            this.zze |= 8;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzU, reason: merged with bridge method [inline-methods] */
        public void zzI(zzap zzapVar) {
            zzapVar.getClass();
            zzap zzapVar2 = this.zzi;
            if (zzapVar2 != null && zzapVar2 != zzap.zzs()) {
                zzap.zza zzaVarZzr = zzap.zzr(zzapVar2);
                zzaVarZzr.zzbo(zzapVar);
                zzapVar = zzaVarZzr.zzbt();
            }
            this.zzi = zzapVar;
            this.zze |= 8;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzV, reason: merged with bridge method [inline-methods] */
        public void zzJ() {
            this.zzi = null;
            this.zze &= -9;
        }

        public static zzay zzc(ByteBuffer byteBuffer) throws zzibg {
            return (zzay) zziar.zzbR(zzj, byteBuffer);
        }

        public static zzay zzd(ByteBuffer byteBuffer, zziab zziabVar) throws zzibg {
            return (zzay) zziar.zzbQ(zzj, byteBuffer, zziabVar);
        }

        public static zzay zze(zzhzl zzhzlVar) throws zzibg {
            return (zzay) zziar.zzbS(zzj, zzhzlVar);
        }

        public static zzay zzi(zzhzl zzhzlVar, zziab zziabVar) throws zzibg {
            return (zzay) zziar.zzbT(zzj, zzhzlVar, zziabVar);
        }

        public static zzay zzj(byte[] bArr) throws zzibg {
            return (zzay) zziar.zzbU(zzj, bArr);
        }

        public static zzay zzm(byte[] bArr, zziab zziabVar) throws zzibg {
            return (zzay) zziar.zzbV(zzj, bArr, zziabVar);
        }

        public static zzay zzn(InputStream inputStream) throws IOException {
            return (zzay) zziar.zzbW(zzj, inputStream);
        }

        public static zzay zzo(InputStream inputStream, zziab zziabVar) throws IOException {
            return (zzay) zziar.zzbX(zzj, inputStream, zziabVar);
        }

        public static zzay zzp(InputStream inputStream) throws IOException {
            return (zzay) zziar.zzca(zzj, inputStream);
        }

        public static zzay zzs(InputStream inputStream, zziab zziabVar) throws IOException {
            return (zzay) zziar.zzcb(zzj, inputStream, zziabVar);
        }

        public static zzay zzt(zzhzq zzhzqVar) throws IOException {
            return (zzay) zziar.zzbY(zzj, zzhzqVar);
        }

        public static zzay zzu(zzhzq zzhzqVar, zziab zziabVar) throws IOException {
            return (zzay) zziar.zzbZ(zzj, zzhzqVar, zziabVar);
        }

        public static zza zzv() {
            return (zza) zzj.zzbn();
        }

        public static zza zzw(zzay zzayVar) {
            return (zza) zzj.zzbo(zzayVar);
        }

        public static zzay zzx() {
            return zzj;
        }

        public static zzick<zzay> zzy() {
            return zzj.zzbd();
        }

        @Override // com.google.android.gms.internal.ads.zzbfp.zzaz
        public boolean zza() {
            return (this.zze & 1) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbfp.zzaz
        public zzar zzb() {
            zzar zzarVar = this.zzf;
            return zzarVar == null ? zzar.zzu() : zzarVar;
        }

        @Override // com.google.android.gms.internal.ads.zziar
        public final Object zzdc(zziaq zziaqVar, Object obj, Object obj2) {
            zzick zziamVar;
            int iOrdinal = zziaqVar.ordinal();
            if (iOrdinal == 0) {
                return (byte) 1;
            }
            if (iOrdinal == 2) {
                return zziar.zzbv(zzj, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002᠌\u0001\u0003ဉ\u0002\u0004ဉ\u0003", new Object[]{"zze", "zzf", "zzg", zzq.zze(), "zzh", "zzi"});
            }
            if (iOrdinal == 3) {
                return new zzay();
            }
            byte[] bArr = null;
            if (iOrdinal == 4) {
                return new zza(bArr);
            }
            if (iOrdinal == 5) {
                return zzj;
            }
            if (iOrdinal != 6) {
                throw null;
            }
            zzick<zzay> zzickVar = zzk;
            if (zzickVar != null) {
                return zzickVar;
            }
            synchronized (zzay.class) {
                try {
                    zziamVar = zzk;
                    if (zziamVar == null) {
                        zziamVar = new zziam(zzj);
                        zzk = zziamVar;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return zziamVar;
        }

        @Override // com.google.android.gms.internal.ads.zzbfp.zzaz
        public boolean zzg() {
            return (this.zze & 2) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbfp.zzaz
        public zzq zzh() {
            zzq zzqVarZzc = zzq.zzc(this.zzg);
            return zzqVarZzc == null ? zzq.ENUM_UNKNOWN : zzqVarZzc;
        }

        @Override // com.google.android.gms.internal.ads.zzbfp.zzaz
        public boolean zzk() {
            return (this.zze & 4) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbfp.zzaz
        public zzaw zzl() {
            zzaw zzawVar = this.zzh;
            return zzawVar == null ? zzaw.zzr() : zzawVar;
        }

        @Override // com.google.android.gms.internal.ads.zzbfp.zzaz
        public boolean zzq() {
            return (this.zze & 8) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbfp.zzaz
        public zzap zzr() {
            zzap zzapVar = this.zzi;
            return zzapVar == null ? zzap.zzs() : zzapVar;
        }
    }

    public interface zzaz extends zzicd {
        boolean zza();

        zzar zzb();

        boolean zzg();

        zzq zzh();

        boolean zzk();

        zzaw zzl();

        boolean zzq();

        zzap zzr();
    }

    public final class zzb extends zziar<zzb, zzc> implements zzc {
        public static final int zza = 1;
        private static final zzb zzc;
        private static volatile zzick<zzb> zzd;
        private zzibd<zza> zzb = zziar.zzbM();

        public final class zza extends zziar<zza, C0188zza> implements InterfaceC0189zzb {
            public static final int zza = 1;
            public static final int zzb = 2;
            public static final int zzc = 3;
            private static final zza zzh;
            private static volatile zzick<zza> zzi;
            private int zzd;
            private int zze;
            private zze zzf;
            private zzg zzg;

            /* JADX INFO: renamed from: com.google.android.gms.internal.ads.zzbfp$zzb$zza$zza, reason: collision with other inner class name */
            public final class C0188zza extends zzial<zza, C0188zza> implements InterfaceC0189zzb {
                public /* synthetic */ C0188zza(byte[] bArr) {
                    this();
                }

                @Override // com.google.android.gms.internal.ads.zzbfp.zzb.InterfaceC0189zzb
                public boolean zza() {
                    return ((zza) this.zza).zza();
                }

                @Override // com.google.android.gms.internal.ads.zzbfp.zzb.InterfaceC0189zzb
                public zzd zzb() {
                    return ((zza) this.zza).zzb();
                }

                public C0188zza zzc(zzd zzdVar) {
                    zzbg();
                    ((zza) this.zza).zzw(zzdVar);
                    return this;
                }

                public C0188zza zzd() {
                    zzbg();
                    ((zza) this.zza).zzx();
                    return this;
                }

                @Override // com.google.android.gms.internal.ads.zzbfp.zzb.InterfaceC0189zzb
                public boolean zze() {
                    return ((zza) this.zza).zze();
                }

                @Override // com.google.android.gms.internal.ads.zzbfp.zzb.InterfaceC0189zzb
                public zze zzf() {
                    return ((zza) this.zza).zzf();
                }

                public C0188zza zzg(zze zzeVar) {
                    zzbg();
                    ((zza) this.zza).zzy(zzeVar);
                    return this;
                }

                public C0188zza zzh(zze.zza zzaVar) {
                    zzbg();
                    ((zza) this.zza).zzy(zzaVar.zzbu());
                    return this;
                }

                public C0188zza zzi(zze zzeVar) {
                    zzbg();
                    ((zza) this.zza).zzz(zzeVar);
                    return this;
                }

                public C0188zza zzj() {
                    zzbg();
                    ((zza) this.zza).zzA();
                    return this;
                }

                @Override // com.google.android.gms.internal.ads.zzbfp.zzb.InterfaceC0189zzb
                public boolean zzk() {
                    return ((zza) this.zza).zzk();
                }

                @Override // com.google.android.gms.internal.ads.zzbfp.zzb.InterfaceC0189zzb
                public zzg zzl() {
                    return ((zza) this.zza).zzl();
                }

                public C0188zza zzm(zzg zzgVar) {
                    zzbg();
                    ((zza) this.zza).zzB(zzgVar);
                    return this;
                }

                public C0188zza zzn(zzg.zza zzaVar) {
                    zzbg();
                    ((zza) this.zza).zzB(zzaVar.zzbu());
                    return this;
                }

                public C0188zza zzo(zzg zzgVar) {
                    zzbg();
                    ((zza) this.zza).zzC(zzgVar);
                    return this;
                }

                public C0188zza zzp() {
                    zzbg();
                    ((zza) this.zza).zzD();
                    return this;
                }

                private C0188zza() {
                    super(zza.zzh);
                }
            }

            static {
                zza zzaVar = new zza();
                zzh = zzaVar;
                zziar.zzbu(zza.class, zzaVar);
            }

            private zza() {
            }

            /* JADX INFO: Access modifiers changed from: private */
            /* JADX INFO: renamed from: zzF, reason: merged with bridge method [inline-methods] */
            public void zzw(zzd zzdVar) {
                this.zze = zzdVar.zza();
                this.zzd |= 1;
            }

            /* JADX INFO: Access modifiers changed from: private */
            /* JADX INFO: renamed from: zzG, reason: merged with bridge method [inline-methods] */
            public void zzx() {
                this.zzd &= -2;
                this.zze = 0;
            }

            /* JADX INFO: Access modifiers changed from: private */
            /* JADX INFO: renamed from: zzH, reason: merged with bridge method [inline-methods] */
            public void zzy(zze zzeVar) {
                zzeVar.getClass();
                this.zzf = zzeVar;
                this.zzd |= 2;
            }

            /* JADX INFO: Access modifiers changed from: private */
            /* JADX INFO: renamed from: zzI, reason: merged with bridge method [inline-methods] */
            public void zzz(zze zzeVar) {
                zzeVar.getClass();
                zze zzeVar2 = this.zzf;
                if (zzeVar2 != null && zzeVar2 != zze.zzs()) {
                    zze.zza zzaVarZzr = zze.zzr(zzeVar2);
                    zzaVarZzr.zzbo(zzeVar);
                    zzeVar = zzaVarZzr.zzbt();
                }
                this.zzf = zzeVar;
                this.zzd |= 2;
            }

            /* JADX INFO: Access modifiers changed from: private */
            /* JADX INFO: renamed from: zzJ, reason: merged with bridge method [inline-methods] */
            public void zzA() {
                this.zzf = null;
                this.zzd &= -3;
            }

            /* JADX INFO: Access modifiers changed from: private */
            /* JADX INFO: renamed from: zzK, reason: merged with bridge method [inline-methods] */
            public void zzB(zzg zzgVar) {
                zzgVar.getClass();
                this.zzg = zzgVar;
                this.zzd |= 4;
            }

            /* JADX INFO: Access modifiers changed from: private */
            /* JADX INFO: renamed from: zzL, reason: merged with bridge method [inline-methods] */
            public void zzC(zzg zzgVar) {
                zzgVar.getClass();
                zzg zzgVar2 = this.zzg;
                if (zzgVar2 != null && zzgVar2 != zzg.zzu()) {
                    zzg.zza zzaVarZzt = zzg.zzt(zzgVar2);
                    zzaVarZzt.zzbo(zzgVar);
                    zzgVar = zzaVarZzt.zzbt();
                }
                this.zzg = zzgVar;
                this.zzd |= 4;
            }

            /* JADX INFO: Access modifiers changed from: private */
            /* JADX INFO: renamed from: zzM, reason: merged with bridge method [inline-methods] */
            public void zzD() {
                this.zzg = null;
                this.zzd &= -5;
            }

            public static zza zzc(ByteBuffer byteBuffer) throws zzibg {
                return (zza) zziar.zzbR(zzh, byteBuffer);
            }

            public static zza zzd(ByteBuffer byteBuffer, zziab zziabVar) throws zzibg {
                return (zza) zziar.zzbQ(zzh, byteBuffer, zziabVar);
            }

            public static zza zzg(zzhzl zzhzlVar) throws zzibg {
                return (zza) zziar.zzbS(zzh, zzhzlVar);
            }

            public static zza zzh(zzhzl zzhzlVar, zziab zziabVar) throws zzibg {
                return (zza) zziar.zzbT(zzh, zzhzlVar, zziabVar);
            }

            public static zza zzi(byte[] bArr) throws zzibg {
                return (zza) zziar.zzbU(zzh, bArr);
            }

            public static zza zzj(byte[] bArr, zziab zziabVar) throws zzibg {
                return (zza) zziar.zzbV(zzh, bArr, zziabVar);
            }

            public static zza zzm(InputStream inputStream) throws IOException {
                return (zza) zziar.zzbW(zzh, inputStream);
            }

            public static zza zzn(InputStream inputStream, zziab zziabVar) throws IOException {
                return (zza) zziar.zzbX(zzh, inputStream, zziabVar);
            }

            public static zza zzo(InputStream inputStream) throws IOException {
                return (zza) zziar.zzca(zzh, inputStream);
            }

            public static zza zzp(InputStream inputStream, zziab zziabVar) throws IOException {
                return (zza) zziar.zzcb(zzh, inputStream, zziabVar);
            }

            public static zza zzq(zzhzq zzhzqVar) throws IOException {
                return (zza) zziar.zzbY(zzh, zzhzqVar);
            }

            public static zza zzr(zzhzq zzhzqVar, zziab zziabVar) throws IOException {
                return (zza) zziar.zzbZ(zzh, zzhzqVar, zziabVar);
            }

            public static C0188zza zzs() {
                return (C0188zza) zzh.zzbn();
            }

            public static C0188zza zzt(zza zzaVar) {
                return (C0188zza) zzh.zzbo(zzaVar);
            }

            public static zza zzu() {
                return zzh;
            }

            public static zzick<zza> zzv() {
                return zzh.zzbd();
            }

            @Override // com.google.android.gms.internal.ads.zzbfp.zzb.InterfaceC0189zzb
            public boolean zza() {
                return (this.zzd & 1) != 0;
            }

            @Override // com.google.android.gms.internal.ads.zzbfp.zzb.InterfaceC0189zzb
            public zzd zzb() {
                zzd zzdVarZzc = zzd.zzc(this.zze);
                return zzdVarZzc == null ? zzd.UNSPECIFIED : zzdVarZzc;
            }

            @Override // com.google.android.gms.internal.ads.zziar
            public final Object zzdc(zziaq zziaqVar, Object obj, Object obj2) {
                zzick zziamVar;
                int iOrdinal = zziaqVar.ordinal();
                if (iOrdinal == 0) {
                    return (byte) 1;
                }
                if (iOrdinal == 2) {
                    return zziar.zzbv(zzh, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002ဉ\u0001\u0003ဉ\u0002", new Object[]{"zzd", "zze", zzd.zze(), "zzf", "zzg"});
                }
                if (iOrdinal == 3) {
                    return new zza();
                }
                byte[] bArr = null;
                if (iOrdinal == 4) {
                    return new C0188zza(bArr);
                }
                if (iOrdinal == 5) {
                    return zzh;
                }
                if (iOrdinal != 6) {
                    throw null;
                }
                zzick<zza> zzickVar = zzi;
                if (zzickVar != null) {
                    return zzickVar;
                }
                synchronized (zza.class) {
                    try {
                        zziamVar = zzi;
                        if (zziamVar == null) {
                            zziamVar = new zziam(zzh);
                            zzi = zziamVar;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return zziamVar;
            }

            @Override // com.google.android.gms.internal.ads.zzbfp.zzb.InterfaceC0189zzb
            public boolean zze() {
                return (this.zzd & 2) != 0;
            }

            @Override // com.google.android.gms.internal.ads.zzbfp.zzb.InterfaceC0189zzb
            public zze zzf() {
                zze zzeVar = this.zzf;
                return zzeVar == null ? zze.zzs() : zzeVar;
            }

            @Override // com.google.android.gms.internal.ads.zzbfp.zzb.InterfaceC0189zzb
            public boolean zzk() {
                return (this.zzd & 4) != 0;
            }

            @Override // com.google.android.gms.internal.ads.zzbfp.zzb.InterfaceC0189zzb
            public zzg zzl() {
                zzg zzgVar = this.zzg;
                return zzgVar == null ? zzg.zzu() : zzgVar;
            }
        }

        /* JADX INFO: renamed from: com.google.android.gms.internal.ads.zzbfp$zzb$zzb, reason: collision with other inner class name */
        public interface InterfaceC0189zzb extends zzicd {
            boolean zza();

            zzd zzb();

            boolean zze();

            zze zzf();

            boolean zzk();

            zzg zzl();
        }

        public final class zzc extends zzial<zzb, zzc> implements zzc {
            public /* synthetic */ zzc(byte[] bArr) {
                this();
            }

            @Override // com.google.android.gms.internal.ads.zzbfp.zzc
            public List<zza> zza() {
                return Collections.unmodifiableList(((zzb) this.zza).zza());
            }

            @Override // com.google.android.gms.internal.ads.zzbfp.zzc
            public int zzb() {
                return ((zzb) this.zza).zzb();
            }

            @Override // com.google.android.gms.internal.ads.zzbfp.zzc
            public zza zzc(int i2) {
                return ((zzb) this.zza).zzc(i2);
            }

            public zzc zzd(int i2, zza zzaVar) {
                zzbg();
                ((zzb) this.zza).zzw(i2, zzaVar);
                return this;
            }

            public zzc zze(int i2, zza.C0188zza c0188zza) {
                zzbg();
                ((zzb) this.zza).zzw(i2, c0188zza.zzbu());
                return this;
            }

            public zzc zzf(zza zzaVar) {
                zzbg();
                ((zzb) this.zza).zzx(zzaVar);
                return this;
            }

            public zzc zzg(int i2, zza zzaVar) {
                zzbg();
                ((zzb) this.zza).zzy(i2, zzaVar);
                return this;
            }

            public zzc zzh(zza.C0188zza c0188zza) {
                zzbg();
                ((zzb) this.zza).zzx(c0188zza.zzbu());
                return this;
            }

            public zzc zzi(int i2, zza.C0188zza c0188zza) {
                zzbg();
                ((zzb) this.zza).zzy(i2, c0188zza.zzbu());
                return this;
            }

            public zzc zzj(Iterable<? extends zza> iterable) {
                zzbg();
                ((zzb) this.zza).zzz(iterable);
                return this;
            }

            public zzc zzk() {
                zzbg();
                ((zzb) this.zza).zzA();
                return this;
            }

            public zzc zzl(int i2) {
                zzbg();
                ((zzb) this.zza).zzB(i2);
                return this;
            }

            private zzc() {
                super(zzb.zzc);
            }
        }

        public enum zzd implements zziav {
            UNSPECIFIED(0),
            IN_MEMORY(1);

            public static final int zzc = 0;
            public static final int zzd = 1;
            private static final zziaw<zzd> zze = new zziaw<zzd>() { // from class: com.google.android.gms.internal.ads.zzbfp.zzb.zzd.1
                /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
                public zzd zzb(int i2) {
                    return zzd.zzc(i2);
                }
            };
            private final int zzf;

            final class zza implements zziax {
                static final zziax zza = new zza();

                private zza() {
                }

                @Override // com.google.android.gms.internal.ads.zziax
                public boolean zza(int i2) {
                    return zzd.zzc(i2) != null;
                }
            }

            zzd(int i2) {
                this.zzf = i2;
            }

            public static zzd zzc(int i2) {
                if (i2 == 0) {
                    return UNSPECIFIED;
                }
                if (i2 != 1) {
                    return null;
                }
                return IN_MEMORY;
            }

            public static zziaw<zzd> zzd() {
                return zze;
            }

            public static zziax zze() {
                return zza.zza;
            }

            @Override // java.lang.Enum
            public final String toString() {
                return Integer.toString(this.zzf);
            }

            @Override // com.google.android.gms.internal.ads.zziav
            public final int zza() {
                return this.zzf;
            }
        }

        public final class zze extends zziar<zze, zza> implements zzf {
            public static final int zza = 1;
            public static final int zzb = 2;
            private static final zze zzf;
            private static volatile zzick<zze> zzg;
            private int zzc;
            private boolean zzd;
            private int zze;

            public final class zza extends zzial<zze, zza> implements zzf {
                public /* synthetic */ zza(byte[] bArr) {
                    this();
                }

                @Override // com.google.android.gms.internal.ads.zzbfp.zzb.zzf
                public boolean zza() {
                    return ((zze) this.zza).zza();
                }

                @Override // com.google.android.gms.internal.ads.zzbfp.zzb.zzf
                public boolean zzb() {
                    return ((zze) this.zza).zzb();
                }

                public zza zzc(boolean z2) {
                    zzbg();
                    ((zze) this.zza).zzu(z2);
                    return this;
                }

                public zza zzd() {
                    zzbg();
                    ((zze) this.zza).zzv();
                    return this;
                }

                @Override // com.google.android.gms.internal.ads.zzbfp.zzb.zzf
                public boolean zze() {
                    return ((zze) this.zza).zze();
                }

                @Override // com.google.android.gms.internal.ads.zzbfp.zzb.zzf
                public int zzf() {
                    return ((zze) this.zza).zzf();
                }

                public zza zzg(int i2) {
                    zzbg();
                    ((zze) this.zza).zzw(i2);
                    return this;
                }

                public zza zzh() {
                    zzbg();
                    ((zze) this.zza).zzx();
                    return this;
                }

                private zza() {
                    super(zze.zzf);
                }
            }

            static {
                zze zzeVar = new zze();
                zzf = zzeVar;
                zziar.zzbu(zze.class, zzeVar);
            }

            private zze() {
            }

            /* JADX INFO: Access modifiers changed from: private */
            /* JADX INFO: renamed from: zzA, reason: merged with bridge method [inline-methods] */
            public void zzv() {
                this.zzc &= -2;
                this.zzd = false;
            }

            /* JADX INFO: Access modifiers changed from: private */
            /* JADX INFO: renamed from: zzB, reason: merged with bridge method [inline-methods] */
            public void zzw(int i2) {
                this.zzc |= 2;
                this.zze = i2;
            }

            /* JADX INFO: Access modifiers changed from: private */
            /* JADX INFO: renamed from: zzC, reason: merged with bridge method [inline-methods] */
            public void zzx() {
                this.zzc &= -3;
                this.zze = 0;
            }

            public static zze zzc(ByteBuffer byteBuffer) throws zzibg {
                return (zze) zziar.zzbR(zzf, byteBuffer);
            }

            public static zze zzd(ByteBuffer byteBuffer, zziab zziabVar) throws zzibg {
                return (zze) zziar.zzbQ(zzf, byteBuffer, zziabVar);
            }

            public static zze zzg(zzhzl zzhzlVar) throws zzibg {
                return (zze) zziar.zzbS(zzf, zzhzlVar);
            }

            public static zze zzh(zzhzl zzhzlVar, zziab zziabVar) throws zzibg {
                return (zze) zziar.zzbT(zzf, zzhzlVar, zziabVar);
            }

            public static zze zzi(byte[] bArr) throws zzibg {
                return (zze) zziar.zzbU(zzf, bArr);
            }

            public static zze zzj(byte[] bArr, zziab zziabVar) throws zzibg {
                return (zze) zziar.zzbV(zzf, bArr, zziabVar);
            }

            public static zze zzk(InputStream inputStream) throws IOException {
                return (zze) zziar.zzbW(zzf, inputStream);
            }

            public static zze zzl(InputStream inputStream, zziab zziabVar) throws IOException {
                return (zze) zziar.zzbX(zzf, inputStream, zziabVar);
            }

            public static zze zzm(InputStream inputStream) throws IOException {
                return (zze) zziar.zzca(zzf, inputStream);
            }

            public static zze zzn(InputStream inputStream, zziab zziabVar) throws IOException {
                return (zze) zziar.zzcb(zzf, inputStream, zziabVar);
            }

            public static zze zzo(zzhzq zzhzqVar) throws IOException {
                return (zze) zziar.zzbY(zzf, zzhzqVar);
            }

            public static zze zzp(zzhzq zzhzqVar, zziab zziabVar) throws IOException {
                return (zze) zziar.zzbZ(zzf, zzhzqVar, zziabVar);
            }

            public static zza zzq() {
                return (zza) zzf.zzbn();
            }

            public static zza zzr(zze zzeVar) {
                return (zza) zzf.zzbo(zzeVar);
            }

            public static zze zzs() {
                return zzf;
            }

            public static zzick<zze> zzt() {
                return zzf.zzbd();
            }

            /* JADX INFO: Access modifiers changed from: private */
            /* JADX INFO: renamed from: zzz, reason: merged with bridge method [inline-methods] */
            public void zzu(boolean z2) {
                this.zzc |= 1;
                this.zzd = z2;
            }

            @Override // com.google.android.gms.internal.ads.zzbfp.zzb.zzf
            public boolean zza() {
                return (this.zzc & 1) != 0;
            }

            @Override // com.google.android.gms.internal.ads.zzbfp.zzb.zzf
            public boolean zzb() {
                return this.zzd;
            }

            @Override // com.google.android.gms.internal.ads.zziar
            public final Object zzdc(zziaq zziaqVar, Object obj, Object obj2) {
                zzick zziamVar;
                int iOrdinal = zziaqVar.ordinal();
                if (iOrdinal == 0) {
                    return (byte) 1;
                }
                if (iOrdinal == 2) {
                    return zziar.zzbv(zzf, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဋ\u0001", new Object[]{"zzc", "zzd", "zze"});
                }
                if (iOrdinal == 3) {
                    return new zze();
                }
                byte[] bArr = null;
                if (iOrdinal == 4) {
                    return new zza(bArr);
                }
                if (iOrdinal == 5) {
                    return zzf;
                }
                if (iOrdinal != 6) {
                    throw null;
                }
                zzick<zze> zzickVar = zzg;
                if (zzickVar != null) {
                    return zzickVar;
                }
                synchronized (zze.class) {
                    try {
                        zziamVar = zzg;
                        if (zziamVar == null) {
                            zziamVar = new zziam(zzf);
                            zzg = zziamVar;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return zziamVar;
            }

            @Override // com.google.android.gms.internal.ads.zzbfp.zzb.zzf
            public boolean zze() {
                return (this.zzc & 2) != 0;
            }

            @Override // com.google.android.gms.internal.ads.zzbfp.zzb.zzf
            public int zzf() {
                return this.zze;
            }
        }

        public interface zzf extends zzicd {
            boolean zza();

            boolean zzb();

            boolean zze();

            int zzf();
        }

        public final class zzg extends zziar<zzg, zza> implements zzh {
            public static final int zza = 1;
            public static final int zzb = 2;
            public static final int zzc = 3;
            private static final zzg zzh;
            private static volatile zzick<zzg> zzi;
            private int zzd;
            private boolean zze;
            private boolean zzf;
            private int zzg;

            public final class zza extends zzial<zzg, zza> implements zzh {
                public /* synthetic */ zza(byte[] bArr) {
                    this();
                }

                @Override // com.google.android.gms.internal.ads.zzbfp.zzb.zzh
                public boolean zza() {
                    return ((zzg) this.zza).zza();
                }

                @Override // com.google.android.gms.internal.ads.zzbfp.zzb.zzh
                public boolean zzb() {
                    return ((zzg) this.zza).zzb();
                }

                public zza zzc(boolean z2) {
                    zzbg();
                    ((zzg) this.zza).zzw(z2);
                    return this;
                }

                public zza zzd() {
                    zzbg();
                    ((zzg) this.zza).zzx();
                    return this;
                }

                @Override // com.google.android.gms.internal.ads.zzbfp.zzb.zzh
                public boolean zze() {
                    return ((zzg) this.zza).zze();
                }

                @Override // com.google.android.gms.internal.ads.zzbfp.zzb.zzh
                public boolean zzf() {
                    return ((zzg) this.zza).zzf();
                }

                public zza zzg(boolean z2) {
                    zzbg();
                    ((zzg) this.zza).zzy(z2);
                    return this;
                }

                public zza zzh() {
                    zzbg();
                    ((zzg) this.zza).zzz();
                    return this;
                }

                @Override // com.google.android.gms.internal.ads.zzbfp.zzb.zzh
                public boolean zzi() {
                    return ((zzg) this.zza).zzi();
                }

                @Override // com.google.android.gms.internal.ads.zzbfp.zzb.zzh
                public int zzj() {
                    return ((zzg) this.zza).zzj();
                }

                public zza zzk(int i2) {
                    zzbg();
                    ((zzg) this.zza).zzA(i2);
                    return this;
                }

                public zza zzl() {
                    zzbg();
                    ((zzg) this.zza).zzB();
                    return this;
                }

                private zza() {
                    super(zzg.zzh);
                }
            }

            static {
                zzg zzgVar = new zzg();
                zzh = zzgVar;
                zziar.zzbu(zzg.class, zzgVar);
            }

            private zzg() {
            }

            /* JADX INFO: Access modifiers changed from: private */
            /* JADX INFO: renamed from: zzD, reason: merged with bridge method [inline-methods] */
            public void zzw(boolean z2) {
                this.zzd |= 1;
                this.zze = z2;
            }

            /* JADX INFO: Access modifiers changed from: private */
            /* JADX INFO: renamed from: zzE, reason: merged with bridge method [inline-methods] */
            public void zzx() {
                this.zzd &= -2;
                this.zze = false;
            }

            /* JADX INFO: Access modifiers changed from: private */
            /* JADX INFO: renamed from: zzF, reason: merged with bridge method [inline-methods] */
            public void zzy(boolean z2) {
                this.zzd |= 2;
                this.zzf = z2;
            }

            /* JADX INFO: Access modifiers changed from: private */
            /* JADX INFO: renamed from: zzG, reason: merged with bridge method [inline-methods] */
            public void zzz() {
                this.zzd &= -3;
                this.zzf = false;
            }

            /* JADX INFO: Access modifiers changed from: private */
            /* JADX INFO: renamed from: zzH, reason: merged with bridge method [inline-methods] */
            public void zzA(int i2) {
                this.zzd |= 4;
                this.zzg = i2;
            }

            /* JADX INFO: Access modifiers changed from: private */
            /* JADX INFO: renamed from: zzI, reason: merged with bridge method [inline-methods] */
            public void zzB() {
                this.zzd &= -5;
                this.zzg = 0;
            }

            public static zzg zzc(ByteBuffer byteBuffer) throws zzibg {
                return (zzg) zziar.zzbR(zzh, byteBuffer);
            }

            public static zzg zzd(ByteBuffer byteBuffer, zziab zziabVar) throws zzibg {
                return (zzg) zziar.zzbQ(zzh, byteBuffer, zziabVar);
            }

            public static zzg zzg(zzhzl zzhzlVar) throws zzibg {
                return (zzg) zziar.zzbS(zzh, zzhzlVar);
            }

            public static zzg zzh(zzhzl zzhzlVar, zziab zziabVar) throws zzibg {
                return (zzg) zziar.zzbT(zzh, zzhzlVar, zziabVar);
            }

            public static zzg zzk(byte[] bArr) throws zzibg {
                return (zzg) zziar.zzbU(zzh, bArr);
            }

            public static zzg zzl(byte[] bArr, zziab zziabVar) throws zzibg {
                return (zzg) zziar.zzbV(zzh, bArr, zziabVar);
            }

            public static zzg zzm(InputStream inputStream) throws IOException {
                return (zzg) zziar.zzbW(zzh, inputStream);
            }

            public static zzg zzn(InputStream inputStream, zziab zziabVar) throws IOException {
                return (zzg) zziar.zzbX(zzh, inputStream, zziabVar);
            }

            public static zzg zzo(InputStream inputStream) throws IOException {
                return (zzg) zziar.zzca(zzh, inputStream);
            }

            public static zzg zzp(InputStream inputStream, zziab zziabVar) throws IOException {
                return (zzg) zziar.zzcb(zzh, inputStream, zziabVar);
            }

            public static zzg zzq(zzhzq zzhzqVar) throws IOException {
                return (zzg) zziar.zzbY(zzh, zzhzqVar);
            }

            public static zzg zzr(zzhzq zzhzqVar, zziab zziabVar) throws IOException {
                return (zzg) zziar.zzbZ(zzh, zzhzqVar, zziabVar);
            }

            public static zza zzs() {
                return (zza) zzh.zzbn();
            }

            public static zza zzt(zzg zzgVar) {
                return (zza) zzh.zzbo(zzgVar);
            }

            public static zzg zzu() {
                return zzh;
            }

            public static zzick<zzg> zzv() {
                return zzh.zzbd();
            }

            @Override // com.google.android.gms.internal.ads.zzbfp.zzb.zzh
            public boolean zza() {
                return (this.zzd & 1) != 0;
            }

            @Override // com.google.android.gms.internal.ads.zzbfp.zzb.zzh
            public boolean zzb() {
                return this.zze;
            }

            @Override // com.google.android.gms.internal.ads.zziar
            public final Object zzdc(zziaq zziaqVar, Object obj, Object obj2) {
                zzick zziamVar;
                int iOrdinal = zziaqVar.ordinal();
                if (iOrdinal == 0) {
                    return (byte) 1;
                }
                if (iOrdinal == 2) {
                    return zziar.zzbv(zzh, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဋ\u0002", new Object[]{"zzd", "zze", "zzf", "zzg"});
                }
                if (iOrdinal == 3) {
                    return new zzg();
                }
                byte[] bArr = null;
                if (iOrdinal == 4) {
                    return new zza(bArr);
                }
                if (iOrdinal == 5) {
                    return zzh;
                }
                if (iOrdinal != 6) {
                    throw null;
                }
                zzick<zzg> zzickVar = zzi;
                if (zzickVar != null) {
                    return zzickVar;
                }
                synchronized (zzg.class) {
                    try {
                        zziamVar = zzi;
                        if (zziamVar == null) {
                            zziamVar = new zziam(zzh);
                            zzi = zziamVar;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return zziamVar;
            }

            @Override // com.google.android.gms.internal.ads.zzbfp.zzb.zzh
            public boolean zze() {
                return (this.zzd & 2) != 0;
            }

            @Override // com.google.android.gms.internal.ads.zzbfp.zzb.zzh
            public boolean zzf() {
                return this.zzf;
            }

            @Override // com.google.android.gms.internal.ads.zzbfp.zzb.zzh
            public boolean zzi() {
                return (this.zzd & 4) != 0;
            }

            @Override // com.google.android.gms.internal.ads.zzbfp.zzb.zzh
            public int zzj() {
                return this.zzg;
            }
        }

        public interface zzh extends zzicd {
            boolean zza();

            boolean zzb();

            boolean zze();

            boolean zzf();

            boolean zzi();

            int zzj();
        }

        static {
            zzb zzbVar = new zzb();
            zzc = zzbVar;
            zziar.zzbu(zzb.class, zzbVar);
        }

        private zzb() {
        }

        private void zzD() {
            zzibd<zza> zzibdVar = this.zzb;
            if (zzibdVar.zza()) {
                return;
            }
            this.zzb = zziar.zzbN(zzibdVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzE, reason: merged with bridge method [inline-methods] */
        public void zzw(int i2, zza zzaVar) {
            zzaVar.getClass();
            zzD();
            this.zzb.set(i2, zzaVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzF, reason: merged with bridge method [inline-methods] */
        public void zzx(zza zzaVar) {
            zzaVar.getClass();
            zzD();
            this.zzb.add(zzaVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzG, reason: merged with bridge method [inline-methods] */
        public void zzy(int i2, zza zzaVar) {
            zzaVar.getClass();
            zzD();
            this.zzb.add(i2, zzaVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzH, reason: merged with bridge method [inline-methods] */
        public void zzz(Iterable<? extends zza> iterable) {
            zzD();
            zzhyu.zzaW(iterable, this.zzb);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzI, reason: merged with bridge method [inline-methods] */
        public void zzA() {
            this.zzb = zziar.zzbM();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzJ, reason: merged with bridge method [inline-methods] */
        public void zzB(int i2) {
            zzD();
            this.zzb.remove(i2);
        }

        public static zzb zzg(ByteBuffer byteBuffer) throws zzibg {
            return (zzb) zziar.zzbR(zzc, byteBuffer);
        }

        public static zzb zzh(ByteBuffer byteBuffer, zziab zziabVar) throws zzibg {
            return (zzb) zziar.zzbQ(zzc, byteBuffer, zziabVar);
        }

        public static zzb zzi(zzhzl zzhzlVar) throws zzibg {
            return (zzb) zziar.zzbS(zzc, zzhzlVar);
        }

        public static zzb zzj(zzhzl zzhzlVar, zziab zziabVar) throws zzibg {
            return (zzb) zziar.zzbT(zzc, zzhzlVar, zziabVar);
        }

        public static zzb zzk(byte[] bArr) throws zzibg {
            return (zzb) zziar.zzbU(zzc, bArr);
        }

        public static zzb zzl(byte[] bArr, zziab zziabVar) throws zzibg {
            return (zzb) zziar.zzbV(zzc, bArr, zziabVar);
        }

        public static zzb zzm(InputStream inputStream) throws IOException {
            return (zzb) zziar.zzbW(zzc, inputStream);
        }

        public static zzb zzn(InputStream inputStream, zziab zziabVar) throws IOException {
            return (zzb) zziar.zzbX(zzc, inputStream, zziabVar);
        }

        public static zzb zzo(InputStream inputStream) throws IOException {
            return (zzb) zziar.zzca(zzc, inputStream);
        }

        public static zzb zzp(InputStream inputStream, zziab zziabVar) throws IOException {
            return (zzb) zziar.zzcb(zzc, inputStream, zziabVar);
        }

        public static zzb zzq(zzhzq zzhzqVar) throws IOException {
            return (zzb) zziar.zzbY(zzc, zzhzqVar);
        }

        public static zzb zzr(zzhzq zzhzqVar, zziab zziabVar) throws IOException {
            return (zzb) zziar.zzbZ(zzc, zzhzqVar, zziabVar);
        }

        public static zzc zzs() {
            return (zzc) zzc.zzbn();
        }

        public static zzc zzt(zzb zzbVar) {
            return (zzc) zzc.zzbo(zzbVar);
        }

        public static zzb zzu() {
            return zzc;
        }

        public static zzick<zzb> zzv() {
            return zzc.zzbd();
        }

        @Override // com.google.android.gms.internal.ads.zzbfp.zzc
        public List<zza> zza() {
            return this.zzb;
        }

        @Override // com.google.android.gms.internal.ads.zzbfp.zzc
        public int zzb() {
            return this.zzb.size();
        }

        @Override // com.google.android.gms.internal.ads.zzbfp.zzc
        public zza zzc(int i2) {
            return this.zzb.get(i2);
        }

        public List<? extends InterfaceC0189zzb> zzd() {
            return this.zzb;
        }

        @Override // com.google.android.gms.internal.ads.zziar
        public final Object zzdc(zziaq zziaqVar, Object obj, Object obj2) {
            zzick zziamVar;
            int iOrdinal = zziaqVar.ordinal();
            if (iOrdinal == 0) {
                return (byte) 1;
            }
            if (iOrdinal == 2) {
                return zziar.zzbv(zzc, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzb", zza.class});
            }
            if (iOrdinal == 3) {
                return new zzb();
            }
            byte[] bArr = null;
            if (iOrdinal == 4) {
                return new zzc(bArr);
            }
            if (iOrdinal == 5) {
                return zzc;
            }
            if (iOrdinal != 6) {
                throw null;
            }
            zzick<zzb> zzickVar = zzd;
            if (zzickVar != null) {
                return zzickVar;
            }
            synchronized (zzb.class) {
                try {
                    zziamVar = zzd;
                    if (zziamVar == null) {
                        zziamVar = new zziam(zzc);
                        zzd = zziamVar;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return zziamVar;
        }

        public InterfaceC0189zzb zze(int i2) {
            return this.zzb.get(i2);
        }
    }

    public final class zzba extends zziar<zzba, zza> implements zzbb {
        public static final int zza = 1;
        public static final int zzb = 2;
        public static final int zzc = 3;
        public static final int zzd = 4;
        public static final int zze = 5;
        private static final zzba zzl;
        private static volatile zzick<zzba> zzm;
        private int zzf;
        private int zzg = 1000;
        private zzaw zzh;
        private int zzi;
        private int zzj;
        private int zzk;

        public final class zza extends zzial<zzba, zza> implements zzbb {
            public /* synthetic */ zza(byte[] bArr) {
                this();
            }

            @Override // com.google.android.gms.internal.ads.zzbfp.zzbb
            public boolean zza() {
                return ((zzba) this.zza).zza();
            }

            @Override // com.google.android.gms.internal.ads.zzbfp.zzbb
            public zzq zzb() {
                return ((zzba) this.zza).zzb();
            }

            public zza zzc(zzq zzqVar) {
                zzbg();
                ((zzba) this.zza).zzA(zzqVar);
                return this;
            }

            public zza zzd() {
                zzbg();
                ((zzba) this.zza).zzB();
                return this;
            }

            @Override // com.google.android.gms.internal.ads.zzbfp.zzbb
            public boolean zze() {
                return ((zzba) this.zza).zze();
            }

            @Override // com.google.android.gms.internal.ads.zzbfp.zzbb
            public zzaw zzf() {
                return ((zzba) this.zza).zzf();
            }

            public zza zzg(zzaw zzawVar) {
                zzbg();
                ((zzba) this.zza).zzC(zzawVar);
                return this;
            }

            public zza zzh(zzaw.zza zzaVar) {
                zzbg();
                ((zzba) this.zza).zzC(zzaVar.zzbu());
                return this;
            }

            public zza zzi(zzaw zzawVar) {
                zzbg();
                ((zzba) this.zza).zzD(zzawVar);
                return this;
            }

            public zza zzj() {
                zzbg();
                ((zzba) this.zza).zzE();
                return this;
            }

            @Override // com.google.android.gms.internal.ads.zzbfp.zzbb
            public boolean zzk() {
                return ((zzba) this.zza).zzk();
            }

            @Override // com.google.android.gms.internal.ads.zzbfp.zzbb
            public int zzl() {
                return ((zzba) this.zza).zzl();
            }

            public zza zzm(int i2) {
                zzbg();
                ((zzba) this.zza).zzF(i2);
                return this;
            }

            public zza zzn() {
                zzbg();
                ((zzba) this.zza).zzG();
                return this;
            }

            @Override // com.google.android.gms.internal.ads.zzbfp.zzbb
            public boolean zzo() {
                return ((zzba) this.zza).zzo();
            }

            @Override // com.google.android.gms.internal.ads.zzbfp.zzbb
            public int zzp() {
                return ((zzba) this.zza).zzp();
            }

            public zza zzq(int i2) {
                zzbg();
                ((zzba) this.zza).zzH(i2);
                return this;
            }

            public zza zzr() {
                zzbg();
                ((zzba) this.zza).zzI();
                return this;
            }

            @Override // com.google.android.gms.internal.ads.zzbfp.zzbb
            public boolean zzs() {
                return ((zzba) this.zza).zzs();
            }

            @Override // com.google.android.gms.internal.ads.zzbfp.zzbb
            public int zzt() {
                return ((zzba) this.zza).zzt();
            }

            public zza zzu(int i2) {
                zzbg();
                ((zzba) this.zza).zzJ(i2);
                return this;
            }

            public zza zzv() {
                zzbg();
                ((zzba) this.zza).zzK();
                return this;
            }

            private zza() {
                super(zzba.zzl);
            }
        }

        static {
            zzba zzbaVar = new zzba();
            zzl = zzbaVar;
            zziar.zzbu(zzba.class, zzbaVar);
        }

        private zzba() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzM, reason: merged with bridge method [inline-methods] */
        public void zzA(zzq zzqVar) {
            this.zzg = zzqVar.zza();
            this.zzf |= 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzN, reason: merged with bridge method [inline-methods] */
        public void zzB() {
            this.zzf &= -2;
            this.zzg = 1000;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzO, reason: merged with bridge method [inline-methods] */
        public void zzC(zzaw zzawVar) {
            zzawVar.getClass();
            this.zzh = zzawVar;
            this.zzf |= 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzP, reason: merged with bridge method [inline-methods] */
        public void zzD(zzaw zzawVar) {
            zzawVar.getClass();
            zzaw zzawVar2 = this.zzh;
            if (zzawVar2 != null && zzawVar2 != zzaw.zzr()) {
                zzaw.zza zzaVarZzq = zzaw.zzq(zzawVar2);
                zzaVarZzq.zzbo(zzawVar);
                zzawVar = zzaVarZzq.zzbt();
            }
            this.zzh = zzawVar;
            this.zzf |= 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzQ, reason: merged with bridge method [inline-methods] */
        public void zzE() {
            this.zzh = null;
            this.zzf &= -3;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzR, reason: merged with bridge method [inline-methods] */
        public void zzF(int i2) {
            this.zzf |= 4;
            this.zzi = i2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzS, reason: merged with bridge method [inline-methods] */
        public void zzG() {
            this.zzf &= -5;
            this.zzi = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzT, reason: merged with bridge method [inline-methods] */
        public void zzH(int i2) {
            this.zzf |= 8;
            this.zzj = i2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzU, reason: merged with bridge method [inline-methods] */
        public void zzI() {
            this.zzf &= -9;
            this.zzj = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzV, reason: merged with bridge method [inline-methods] */
        public void zzJ(int i2) {
            this.zzf |= 16;
            this.zzk = i2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzW, reason: merged with bridge method [inline-methods] */
        public void zzK() {
            this.zzf &= -17;
            this.zzk = 0;
        }

        public static zzba zzc(ByteBuffer byteBuffer) throws zzibg {
            return (zzba) zziar.zzbR(zzl, byteBuffer);
        }

        public static zzba zzd(ByteBuffer byteBuffer, zziab zziabVar) throws zzibg {
            return (zzba) zziar.zzbQ(zzl, byteBuffer, zziabVar);
        }

        public static zzba zzg(zzhzl zzhzlVar) throws zzibg {
            return (zzba) zziar.zzbS(zzl, zzhzlVar);
        }

        public static zzba zzh(zzhzl zzhzlVar, zziab zziabVar) throws zzibg {
            return (zzba) zziar.zzbT(zzl, zzhzlVar, zziabVar);
        }

        public static zzba zzi(byte[] bArr) throws zzibg {
            return (zzba) zziar.zzbU(zzl, bArr);
        }

        public static zzba zzj(byte[] bArr, zziab zziabVar) throws zzibg {
            return (zzba) zziar.zzbV(zzl, bArr, zziabVar);
        }

        public static zzba zzm(InputStream inputStream) throws IOException {
            return (zzba) zziar.zzbW(zzl, inputStream);
        }

        public static zzba zzn(InputStream inputStream, zziab zziabVar) throws IOException {
            return (zzba) zziar.zzbX(zzl, inputStream, zziabVar);
        }

        public static zzba zzq(InputStream inputStream) throws IOException {
            return (zzba) zziar.zzca(zzl, inputStream);
        }

        public static zzba zzr(InputStream inputStream, zziab zziabVar) throws IOException {
            return (zzba) zziar.zzcb(zzl, inputStream, zziabVar);
        }

        public static zzba zzu(zzhzq zzhzqVar) throws IOException {
            return (zzba) zziar.zzbY(zzl, zzhzqVar);
        }

        public static zzba zzv(zzhzq zzhzqVar, zziab zziabVar) throws IOException {
            return (zzba) zziar.zzbZ(zzl, zzhzqVar, zziabVar);
        }

        public static zza zzw() {
            return (zza) zzl.zzbn();
        }

        public static zza zzx(zzba zzbaVar) {
            return (zza) zzl.zzbo(zzbaVar);
        }

        public static zzba zzy() {
            return zzl;
        }

        public static zzick<zzba> zzz() {
            return zzl.zzbd();
        }

        @Override // com.google.android.gms.internal.ads.zzbfp.zzbb
        public boolean zza() {
            return (this.zzf & 1) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbfp.zzbb
        public zzq zzb() {
            zzq zzqVarZzc = zzq.zzc(this.zzg);
            return zzqVarZzc == null ? zzq.ENUM_UNKNOWN : zzqVarZzc;
        }

        @Override // com.google.android.gms.internal.ads.zziar
        public final Object zzdc(zziaq zziaqVar, Object obj, Object obj2) {
            zzick zziamVar;
            int iOrdinal = zziaqVar.ordinal();
            if (iOrdinal == 0) {
                return (byte) 1;
            }
            if (iOrdinal == 2) {
                return zziar.zzbv(zzl, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001᠌\u0000\u0002ဉ\u0001\u0003င\u0002\u0004င\u0003\u0005င\u0004", new Object[]{"zzf", "zzg", zzq.zze(), "zzh", "zzi", "zzj", "zzk"});
            }
            if (iOrdinal == 3) {
                return new zzba();
            }
            byte[] bArr = null;
            if (iOrdinal == 4) {
                return new zza(bArr);
            }
            if (iOrdinal == 5) {
                return zzl;
            }
            if (iOrdinal != 6) {
                throw null;
            }
            zzick<zzba> zzickVar = zzm;
            if (zzickVar != null) {
                return zzickVar;
            }
            synchronized (zzba.class) {
                try {
                    zziamVar = zzm;
                    if (zziamVar == null) {
                        zziamVar = new zziam(zzl);
                        zzm = zziamVar;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return zziamVar;
        }

        @Override // com.google.android.gms.internal.ads.zzbfp.zzbb
        public boolean zze() {
            return (this.zzf & 2) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbfp.zzbb
        public zzaw zzf() {
            zzaw zzawVar = this.zzh;
            return zzawVar == null ? zzaw.zzr() : zzawVar;
        }

        @Override // com.google.android.gms.internal.ads.zzbfp.zzbb
        public boolean zzk() {
            return (this.zzf & 4) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbfp.zzbb
        public int zzl() {
            return this.zzi;
        }

        @Override // com.google.android.gms.internal.ads.zzbfp.zzbb
        public boolean zzo() {
            return (this.zzf & 8) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbfp.zzbb
        public int zzp() {
            return this.zzj;
        }

        @Override // com.google.android.gms.internal.ads.zzbfp.zzbb
        public boolean zzs() {
            return (this.zzf & 16) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbfp.zzbb
        public int zzt() {
            return this.zzk;
        }
    }

    public interface zzbb extends zzicd {
        boolean zza();

        zzq zzb();

        boolean zze();

        zzaw zzf();

        boolean zzk();

        int zzl();

        boolean zzo();

        int zzp();

        boolean zzs();

        int zzt();
    }

    public final class zzbc extends zziar<zzbc, zza> implements zzbd {
        public static final int zza = 1;
        public static final int zzb = 2;
        public static final int zzc = 3;
        private static final zzbc zzh;
        private static volatile zzick<zzbc> zzi;
        private int zzd;
        private int zze = 1000;
        private zzaw zzf;
        private zzap zzg;

        public final class zza extends zzial<zzbc, zza> implements zzbd {
            public /* synthetic */ zza(byte[] bArr) {
                this();
            }

            @Override // com.google.android.gms.internal.ads.zzbfp.zzbd
            public boolean zza() {
                return ((zzbc) this.zza).zza();
            }

            @Override // com.google.android.gms.internal.ads.zzbfp.zzbd
            public zzq zzb() {
                return ((zzbc) this.zza).zzb();
            }

            public zza zzc(zzq zzqVar) {
                zzbg();
                ((zzbc) this.zza).zzw(zzqVar);
                return this;
            }

            public zza zzd() {
                zzbg();
                ((zzbc) this.zza).zzx();
                return this;
            }

            @Override // com.google.android.gms.internal.ads.zzbfp.zzbd
            public boolean zze() {
                return ((zzbc) this.zza).zze();
            }

            @Override // com.google.android.gms.internal.ads.zzbfp.zzbd
            public zzaw zzf() {
                return ((zzbc) this.zza).zzf();
            }

            public zza zzg(zzaw zzawVar) {
                zzbg();
                ((zzbc) this.zza).zzy(zzawVar);
                return this;
            }

            public zza zzh(zzaw.zza zzaVar) {
                zzbg();
                ((zzbc) this.zza).zzy(zzaVar.zzbu());
                return this;
            }

            public zza zzi(zzaw zzawVar) {
                zzbg();
                ((zzbc) this.zza).zzz(zzawVar);
                return this;
            }

            public zza zzj() {
                zzbg();
                ((zzbc) this.zza).zzA();
                return this;
            }

            @Override // com.google.android.gms.internal.ads.zzbfp.zzbd
            public boolean zzk() {
                return ((zzbc) this.zza).zzk();
            }

            @Override // com.google.android.gms.internal.ads.zzbfp.zzbd
            public zzap zzl() {
                return ((zzbc) this.zza).zzl();
            }

            public zza zzm(zzap zzapVar) {
                zzbg();
                ((zzbc) this.zza).zzB(zzapVar);
                return this;
            }

            public zza zzn(zzap.zza zzaVar) {
                zzbg();
                ((zzbc) this.zza).zzB(zzaVar.zzbu());
                return this;
            }

            public zza zzo(zzap zzapVar) {
                zzbg();
                ((zzbc) this.zza).zzC(zzapVar);
                return this;
            }

            public zza zzp() {
                zzbg();
                ((zzbc) this.zza).zzD();
                return this;
            }

            private zza() {
                super(zzbc.zzh);
            }
        }

        static {
            zzbc zzbcVar = new zzbc();
            zzh = zzbcVar;
            zziar.zzbu(zzbc.class, zzbcVar);
        }

        private zzbc() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzF, reason: merged with bridge method [inline-methods] */
        public void zzw(zzq zzqVar) {
            this.zze = zzqVar.zza();
            this.zzd |= 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzG, reason: merged with bridge method [inline-methods] */
        public void zzx() {
            this.zzd &= -2;
            this.zze = 1000;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzH, reason: merged with bridge method [inline-methods] */
        public void zzy(zzaw zzawVar) {
            zzawVar.getClass();
            this.zzf = zzawVar;
            this.zzd |= 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzI, reason: merged with bridge method [inline-methods] */
        public void zzz(zzaw zzawVar) {
            zzawVar.getClass();
            zzaw zzawVar2 = this.zzf;
            if (zzawVar2 != null && zzawVar2 != zzaw.zzr()) {
                zzaw.zza zzaVarZzq = zzaw.zzq(zzawVar2);
                zzaVarZzq.zzbo(zzawVar);
                zzawVar = zzaVarZzq.zzbt();
            }
            this.zzf = zzawVar;
            this.zzd |= 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzJ, reason: merged with bridge method [inline-methods] */
        public void zzA() {
            this.zzf = null;
            this.zzd &= -3;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzK, reason: merged with bridge method [inline-methods] */
        public void zzB(zzap zzapVar) {
            zzapVar.getClass();
            this.zzg = zzapVar;
            this.zzd |= 4;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzL, reason: merged with bridge method [inline-methods] */
        public void zzC(zzap zzapVar) {
            zzapVar.getClass();
            zzap zzapVar2 = this.zzg;
            if (zzapVar2 != null && zzapVar2 != zzap.zzs()) {
                zzap.zza zzaVarZzr = zzap.zzr(zzapVar2);
                zzaVarZzr.zzbo(zzapVar);
                zzapVar = zzaVarZzr.zzbt();
            }
            this.zzg = zzapVar;
            this.zzd |= 4;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzM, reason: merged with bridge method [inline-methods] */
        public void zzD() {
            this.zzg = null;
            this.zzd &= -5;
        }

        public static zzbc zzc(ByteBuffer byteBuffer) throws zzibg {
            return (zzbc) zziar.zzbR(zzh, byteBuffer);
        }

        public static zzbc zzd(ByteBuffer byteBuffer, zziab zziabVar) throws zzibg {
            return (zzbc) zziar.zzbQ(zzh, byteBuffer, zziabVar);
        }

        public static zzbc zzg(zzhzl zzhzlVar) throws zzibg {
            return (zzbc) zziar.zzbS(zzh, zzhzlVar);
        }

        public static zzbc zzh(zzhzl zzhzlVar, zziab zziabVar) throws zzibg {
            return (zzbc) zziar.zzbT(zzh, zzhzlVar, zziabVar);
        }

        public static zzbc zzi(byte[] bArr) throws zzibg {
            return (zzbc) zziar.zzbU(zzh, bArr);
        }

        public static zzbc zzj(byte[] bArr, zziab zziabVar) throws zzibg {
            return (zzbc) zziar.zzbV(zzh, bArr, zziabVar);
        }

        public static zzbc zzm(InputStream inputStream) throws IOException {
            return (zzbc) zziar.zzbW(zzh, inputStream);
        }

        public static zzbc zzn(InputStream inputStream, zziab zziabVar) throws IOException {
            return (zzbc) zziar.zzbX(zzh, inputStream, zziabVar);
        }

        public static zzbc zzo(InputStream inputStream) throws IOException {
            return (zzbc) zziar.zzca(zzh, inputStream);
        }

        public static zzbc zzp(InputStream inputStream, zziab zziabVar) throws IOException {
            return (zzbc) zziar.zzcb(zzh, inputStream, zziabVar);
        }

        public static zzbc zzq(zzhzq zzhzqVar) throws IOException {
            return (zzbc) zziar.zzbY(zzh, zzhzqVar);
        }

        public static zzbc zzr(zzhzq zzhzqVar, zziab zziabVar) throws IOException {
            return (zzbc) zziar.zzbZ(zzh, zzhzqVar, zziabVar);
        }

        public static zza zzs() {
            return (zza) zzh.zzbn();
        }

        public static zza zzt(zzbc zzbcVar) {
            return (zza) zzh.zzbo(zzbcVar);
        }

        public static zzbc zzu() {
            return zzh;
        }

        public static zzick<zzbc> zzv() {
            return zzh.zzbd();
        }

        @Override // com.google.android.gms.internal.ads.zzbfp.zzbd
        public boolean zza() {
            return (this.zzd & 1) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbfp.zzbd
        public zzq zzb() {
            zzq zzqVarZzc = zzq.zzc(this.zze);
            return zzqVarZzc == null ? zzq.ENUM_UNKNOWN : zzqVarZzc;
        }

        @Override // com.google.android.gms.internal.ads.zziar
        public final Object zzdc(zziaq zziaqVar, Object obj, Object obj2) {
            zzick zziamVar;
            int iOrdinal = zziaqVar.ordinal();
            if (iOrdinal == 0) {
                return (byte) 1;
            }
            if (iOrdinal == 2) {
                return zziar.zzbv(zzh, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002ဉ\u0001\u0003ဉ\u0002", new Object[]{"zzd", "zze", zzq.zze(), "zzf", "zzg"});
            }
            if (iOrdinal == 3) {
                return new zzbc();
            }
            byte[] bArr = null;
            if (iOrdinal == 4) {
                return new zza(bArr);
            }
            if (iOrdinal == 5) {
                return zzh;
            }
            if (iOrdinal != 6) {
                throw null;
            }
            zzick<zzbc> zzickVar = zzi;
            if (zzickVar != null) {
                return zzickVar;
            }
            synchronized (zzbc.class) {
                try {
                    zziamVar = zzi;
                    if (zziamVar == null) {
                        zziamVar = new zziam(zzh);
                        zzi = zziamVar;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return zziamVar;
        }

        @Override // com.google.android.gms.internal.ads.zzbfp.zzbd
        public boolean zze() {
            return (this.zzd & 2) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbfp.zzbd
        public zzaw zzf() {
            zzaw zzawVar = this.zzf;
            return zzawVar == null ? zzaw.zzr() : zzawVar;
        }

        @Override // com.google.android.gms.internal.ads.zzbfp.zzbd
        public boolean zzk() {
            return (this.zzd & 4) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbfp.zzbd
        public zzap zzl() {
            zzap zzapVar = this.zzg;
            return zzapVar == null ? zzap.zzs() : zzapVar;
        }
    }

    public interface zzbd extends zzicd {
        boolean zza();

        zzq zzb();

        boolean zze();

        zzaw zzf();

        boolean zzk();

        zzap zzl();
    }

    public final class zzbe extends zziar<zzbe, zza> implements zzbf {
        public static final int zza = 1;
        public static final int zzb = 2;
        public static final int zzc = 3;
        public static final int zzd = 4;
        public static final int zze = 5;
        public static final int zzf = 6;
        private static final zzbe zzn;
        private static volatile zzick<zzbe> zzo;
        private int zzg;
        private int zzh = 1000;
        private zzaw zzi;
        private int zzj;
        private int zzk;
        private int zzl;
        private long zzm;

        public final class zza extends zzial<zzbe, zza> implements zzbf {
            public /* synthetic */ zza(byte[] bArr) {
                this();
            }

            @Override // com.google.android.gms.internal.ads.zzbfp.zzbf
            public boolean zza() {
                return ((zzbe) this.zza).zza();
            }

            @Override // com.google.android.gms.internal.ads.zzbfp.zzbf
            public zzq zzb() {
                return ((zzbe) this.zza).zzb();
            }

            public zza zzc(zzq zzqVar) {
                zzbg();
                ((zzbe) this.zza).zzC(zzqVar);
                return this;
            }

            public zza zzd() {
                zzbg();
                ((zzbe) this.zza).zzD();
                return this;
            }

            @Override // com.google.android.gms.internal.ads.zzbfp.zzbf
            public boolean zze() {
                return ((zzbe) this.zza).zze();
            }

            @Override // com.google.android.gms.internal.ads.zzbfp.zzbf
            public zzaw zzf() {
                return ((zzbe) this.zza).zzf();
            }

            public zza zzg(zzaw zzawVar) {
                zzbg();
                ((zzbe) this.zza).zzE(zzawVar);
                return this;
            }

            public zza zzh(zzaw.zza zzaVar) {
                zzbg();
                ((zzbe) this.zza).zzE(zzaVar.zzbu());
                return this;
            }

            public zza zzi(zzaw zzawVar) {
                zzbg();
                ((zzbe) this.zza).zzF(zzawVar);
                return this;
            }

            public zza zzj() {
                zzbg();
                ((zzbe) this.zza).zzG();
                return this;
            }

            @Override // com.google.android.gms.internal.ads.zzbfp.zzbf
            public boolean zzk() {
                return ((zzbe) this.zza).zzk();
            }

            @Override // com.google.android.gms.internal.ads.zzbfp.zzbf
            public int zzl() {
                return ((zzbe) this.zza).zzl();
            }

            public zza zzm(int i2) {
                zzbg();
                ((zzbe) this.zza).zzH(i2);
                return this;
            }

            public zza zzn() {
                zzbg();
                ((zzbe) this.zza).zzI();
                return this;
            }

            @Override // com.google.android.gms.internal.ads.zzbfp.zzbf
            public boolean zzo() {
                return ((zzbe) this.zza).zzo();
            }

            @Override // com.google.android.gms.internal.ads.zzbfp.zzbf
            public int zzp() {
                return ((zzbe) this.zza).zzp();
            }

            public zza zzq(int i2) {
                zzbg();
                ((zzbe) this.zza).zzJ(i2);
                return this;
            }

            public zza zzr() {
                zzbg();
                ((zzbe) this.zza).zzK();
                return this;
            }

            @Override // com.google.android.gms.internal.ads.zzbfp.zzbf
            public boolean zzs() {
                return ((zzbe) this.zza).zzs();
            }

            @Override // com.google.android.gms.internal.ads.zzbfp.zzbf
            public int zzt() {
                return ((zzbe) this.zza).zzt();
            }

            public zza zzu(int i2) {
                zzbg();
                ((zzbe) this.zza).zzL(i2);
                return this;
            }

            public zza zzv() {
                zzbg();
                ((zzbe) this.zza).zzM();
                return this;
            }

            @Override // com.google.android.gms.internal.ads.zzbfp.zzbf
            public boolean zzw() {
                return ((zzbe) this.zza).zzw();
            }

            @Override // com.google.android.gms.internal.ads.zzbfp.zzbf
            public long zzx() {
                return ((zzbe) this.zza).zzx();
            }

            public zza zzy(long j) {
                zzbg();
                ((zzbe) this.zza).zzN(j);
                return this;
            }

            public zza zzz() {
                zzbg();
                ((zzbe) this.zza).zzO();
                return this;
            }

            private zza() {
                super(zzbe.zzn);
            }
        }

        static {
            zzbe zzbeVar = new zzbe();
            zzn = zzbeVar;
            zziar.zzbu(zzbe.class, zzbeVar);
        }

        private zzbe() {
        }

        public static zzbe zzA() {
            return zzn;
        }

        public static zzick<zzbe> zzB() {
            return zzn.zzbd();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzQ, reason: merged with bridge method [inline-methods] */
        public void zzC(zzq zzqVar) {
            this.zzh = zzqVar.zza();
            this.zzg |= 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzR, reason: merged with bridge method [inline-methods] */
        public void zzD() {
            this.zzg &= -2;
            this.zzh = 1000;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzS, reason: merged with bridge method [inline-methods] */
        public void zzE(zzaw zzawVar) {
            zzawVar.getClass();
            this.zzi = zzawVar;
            this.zzg |= 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzT, reason: merged with bridge method [inline-methods] */
        public void zzF(zzaw zzawVar) {
            zzawVar.getClass();
            zzaw zzawVar2 = this.zzi;
            if (zzawVar2 != null && zzawVar2 != zzaw.zzr()) {
                zzaw.zza zzaVarZzq = zzaw.zzq(zzawVar2);
                zzaVarZzq.zzbo(zzawVar);
                zzawVar = zzaVarZzq.zzbt();
            }
            this.zzi = zzawVar;
            this.zzg |= 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzU, reason: merged with bridge method [inline-methods] */
        public void zzG() {
            this.zzi = null;
            this.zzg &= -3;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzV, reason: merged with bridge method [inline-methods] */
        public void zzH(int i2) {
            this.zzg |= 4;
            this.zzj = i2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzW, reason: merged with bridge method [inline-methods] */
        public void zzI() {
            this.zzg &= -5;
            this.zzj = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzX, reason: merged with bridge method [inline-methods] */
        public void zzJ(int i2) {
            this.zzg |= 8;
            this.zzk = i2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzY, reason: merged with bridge method [inline-methods] */
        public void zzK() {
            this.zzg &= -9;
            this.zzk = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzZ, reason: merged with bridge method [inline-methods] */
        public void zzL(int i2) {
            this.zzg |= 16;
            this.zzl = i2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzaa, reason: merged with bridge method [inline-methods] */
        public void zzM() {
            this.zzg &= -17;
            this.zzl = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzab, reason: merged with bridge method [inline-methods] */
        public void zzN(long j) {
            this.zzg |= 32;
            this.zzm = j;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzac, reason: merged with bridge method [inline-methods] */
        public void zzO() {
            this.zzg &= -33;
            this.zzm = 0L;
        }

        public static zzbe zzc(ByteBuffer byteBuffer) throws zzibg {
            return (zzbe) zziar.zzbR(zzn, byteBuffer);
        }

        public static zzbe zzd(ByteBuffer byteBuffer, zziab zziabVar) throws zzibg {
            return (zzbe) zziar.zzbQ(zzn, byteBuffer, zziabVar);
        }

        public static zzbe zzg(zzhzl zzhzlVar) throws zzibg {
            return (zzbe) zziar.zzbS(zzn, zzhzlVar);
        }

        public static zzbe zzh(zzhzl zzhzlVar, zziab zziabVar) throws zzibg {
            return (zzbe) zziar.zzbT(zzn, zzhzlVar, zziabVar);
        }

        public static zzbe zzi(byte[] bArr) throws zzibg {
            return (zzbe) zziar.zzbU(zzn, bArr);
        }

        public static zzbe zzj(byte[] bArr, zziab zziabVar) throws zzibg {
            return (zzbe) zziar.zzbV(zzn, bArr, zziabVar);
        }

        public static zzbe zzm(InputStream inputStream) throws IOException {
            return (zzbe) zziar.zzbW(zzn, inputStream);
        }

        public static zzbe zzn(InputStream inputStream, zziab zziabVar) throws IOException {
            return (zzbe) zziar.zzbX(zzn, inputStream, zziabVar);
        }

        public static zzbe zzq(InputStream inputStream) throws IOException {
            return (zzbe) zziar.zzca(zzn, inputStream);
        }

        public static zzbe zzr(InputStream inputStream, zziab zziabVar) throws IOException {
            return (zzbe) zziar.zzcb(zzn, inputStream, zziabVar);
        }

        public static zzbe zzu(zzhzq zzhzqVar) throws IOException {
            return (zzbe) zziar.zzbY(zzn, zzhzqVar);
        }

        public static zzbe zzv(zzhzq zzhzqVar, zziab zziabVar) throws IOException {
            return (zzbe) zziar.zzbZ(zzn, zzhzqVar, zziabVar);
        }

        public static zza zzy() {
            return (zza) zzn.zzbn();
        }

        public static zza zzz(zzbe zzbeVar) {
            return (zza) zzn.zzbo(zzbeVar);
        }

        @Override // com.google.android.gms.internal.ads.zzbfp.zzbf
        public boolean zza() {
            return (this.zzg & 1) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbfp.zzbf
        public zzq zzb() {
            zzq zzqVarZzc = zzq.zzc(this.zzh);
            return zzqVarZzc == null ? zzq.ENUM_UNKNOWN : zzqVarZzc;
        }

        @Override // com.google.android.gms.internal.ads.zziar
        public final Object zzdc(zziaq zziaqVar, Object obj, Object obj2) {
            zzick zziamVar;
            int iOrdinal = zziaqVar.ordinal();
            if (iOrdinal == 0) {
                return (byte) 1;
            }
            if (iOrdinal == 2) {
                return zziar.zzbv(zzn, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001᠌\u0000\u0002ဉ\u0001\u0003င\u0002\u0004င\u0003\u0005င\u0004\u0006ဃ\u0005", new Object[]{"zzg", "zzh", zzq.zze(), "zzi", "zzj", "zzk", "zzl", "zzm"});
            }
            if (iOrdinal == 3) {
                return new zzbe();
            }
            byte[] bArr = null;
            if (iOrdinal == 4) {
                return new zza(bArr);
            }
            if (iOrdinal == 5) {
                return zzn;
            }
            if (iOrdinal != 6) {
                throw null;
            }
            zzick<zzbe> zzickVar = zzo;
            if (zzickVar != null) {
                return zzickVar;
            }
            synchronized (zzbe.class) {
                try {
                    zziamVar = zzo;
                    if (zziamVar == null) {
                        zziamVar = new zziam(zzn);
                        zzo = zziamVar;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return zziamVar;
        }

        @Override // com.google.android.gms.internal.ads.zzbfp.zzbf
        public boolean zze() {
            return (this.zzg & 2) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbfp.zzbf
        public zzaw zzf() {
            zzaw zzawVar = this.zzi;
            return zzawVar == null ? zzaw.zzr() : zzawVar;
        }

        @Override // com.google.android.gms.internal.ads.zzbfp.zzbf
        public boolean zzk() {
            return (this.zzg & 4) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbfp.zzbf
        public int zzl() {
            return this.zzj;
        }

        @Override // com.google.android.gms.internal.ads.zzbfp.zzbf
        public boolean zzo() {
            return (this.zzg & 8) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbfp.zzbf
        public int zzp() {
            return this.zzk;
        }

        @Override // com.google.android.gms.internal.ads.zzbfp.zzbf
        public boolean zzs() {
            return (this.zzg & 16) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbfp.zzbf
        public int zzt() {
            return this.zzl;
        }

        @Override // com.google.android.gms.internal.ads.zzbfp.zzbf
        public boolean zzw() {
            return (this.zzg & 32) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbfp.zzbf
        public long zzx() {
            return this.zzm;
        }
    }

    public interface zzbf extends zzicd {
        boolean zza();

        zzq zzb();

        boolean zze();

        zzaw zzf();

        boolean zzk();

        int zzl();

        boolean zzo();

        int zzp();

        boolean zzs();

        int zzt();

        boolean zzw();

        long zzx();
    }

    public final class zzbg extends zziar<zzbg, zza> implements zzbh {
        public static final int zza = 1;
        public static final int zzb = 2;
        public static final int zzc = 3;
        private static final zzbg zzh;
        private static volatile zzick<zzbg> zzi;
        private int zzd;
        private int zze = 1000;
        private zzaw zzf;
        private zzap zzg;

        public final class zza extends zzial<zzbg, zza> implements zzbh {
            public /* synthetic */ zza(byte[] bArr) {
                this();
            }

            @Override // com.google.android.gms.internal.ads.zzbfp.zzbh
            public boolean zza() {
                return ((zzbg) this.zza).zza();
            }

            @Override // com.google.android.gms.internal.ads.zzbfp.zzbh
            public zzq zzb() {
                return ((zzbg) this.zza).zzb();
            }

            public zza zzc(zzq zzqVar) {
                zzbg();
                ((zzbg) this.zza).zzw(zzqVar);
                return this;
            }

            public zza zzd() {
                zzbg();
                ((zzbg) this.zza).zzx();
                return this;
            }

            @Override // com.google.android.gms.internal.ads.zzbfp.zzbh
            public boolean zze() {
                return ((zzbg) this.zza).zze();
            }

            @Override // com.google.android.gms.internal.ads.zzbfp.zzbh
            public zzaw zzf() {
                return ((zzbg) this.zza).zzf();
            }

            public zza zzg(zzaw zzawVar) {
                zzbg();
                ((zzbg) this.zza).zzy(zzawVar);
                return this;
            }

            public zza zzh(zzaw.zza zzaVar) {
                zzbg();
                ((zzbg) this.zza).zzy(zzaVar.zzbu());
                return this;
            }

            public zza zzi(zzaw zzawVar) {
                zzbg();
                ((zzbg) this.zza).zzz(zzawVar);
                return this;
            }

            public zza zzj() {
                zzbg();
                ((zzbg) this.zza).zzA();
                return this;
            }

            @Override // com.google.android.gms.internal.ads.zzbfp.zzbh
            public boolean zzk() {
                return ((zzbg) this.zza).zzk();
            }

            @Override // com.google.android.gms.internal.ads.zzbfp.zzbh
            public zzap zzl() {
                return ((zzbg) this.zza).zzl();
            }

            public zza zzm(zzap zzapVar) {
                zzbg();
                ((zzbg) this.zza).zzB(zzapVar);
                return this;
            }

            public zza zzn(zzap.zza zzaVar) {
                zzbg();
                ((zzbg) this.zza).zzB(zzaVar.zzbu());
                return this;
            }

            public zza zzo(zzap zzapVar) {
                zzbg();
                ((zzbg) this.zza).zzC(zzapVar);
                return this;
            }

            public zza zzp() {
                zzbg();
                ((zzbg) this.zza).zzD();
                return this;
            }

            private zza() {
                super(zzbg.zzh);
            }
        }

        static {
            zzbg zzbgVar = new zzbg();
            zzh = zzbgVar;
            zziar.zzbu(zzbg.class, zzbgVar);
        }

        private zzbg() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzF, reason: merged with bridge method [inline-methods] */
        public void zzw(zzq zzqVar) {
            this.zze = zzqVar.zza();
            this.zzd |= 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzG, reason: merged with bridge method [inline-methods] */
        public void zzx() {
            this.zzd &= -2;
            this.zze = 1000;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzH, reason: merged with bridge method [inline-methods] */
        public void zzy(zzaw zzawVar) {
            zzawVar.getClass();
            this.zzf = zzawVar;
            this.zzd |= 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzI, reason: merged with bridge method [inline-methods] */
        public void zzz(zzaw zzawVar) {
            zzawVar.getClass();
            zzaw zzawVar2 = this.zzf;
            if (zzawVar2 != null && zzawVar2 != zzaw.zzr()) {
                zzaw.zza zzaVarZzq = zzaw.zzq(zzawVar2);
                zzaVarZzq.zzbo(zzawVar);
                zzawVar = zzaVarZzq.zzbt();
            }
            this.zzf = zzawVar;
            this.zzd |= 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzJ, reason: merged with bridge method [inline-methods] */
        public void zzA() {
            this.zzf = null;
            this.zzd &= -3;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzK, reason: merged with bridge method [inline-methods] */
        public void zzB(zzap zzapVar) {
            zzapVar.getClass();
            this.zzg = zzapVar;
            this.zzd |= 4;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzL, reason: merged with bridge method [inline-methods] */
        public void zzC(zzap zzapVar) {
            zzapVar.getClass();
            zzap zzapVar2 = this.zzg;
            if (zzapVar2 != null && zzapVar2 != zzap.zzs()) {
                zzap.zza zzaVarZzr = zzap.zzr(zzapVar2);
                zzaVarZzr.zzbo(zzapVar);
                zzapVar = zzaVarZzr.zzbt();
            }
            this.zzg = zzapVar;
            this.zzd |= 4;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzM, reason: merged with bridge method [inline-methods] */
        public void zzD() {
            this.zzg = null;
            this.zzd &= -5;
        }

        public static zzbg zzc(ByteBuffer byteBuffer) throws zzibg {
            return (zzbg) zziar.zzbR(zzh, byteBuffer);
        }

        public static zzbg zzd(ByteBuffer byteBuffer, zziab zziabVar) throws zzibg {
            return (zzbg) zziar.zzbQ(zzh, byteBuffer, zziabVar);
        }

        public static zzbg zzg(zzhzl zzhzlVar) throws zzibg {
            return (zzbg) zziar.zzbS(zzh, zzhzlVar);
        }

        public static zzbg zzh(zzhzl zzhzlVar, zziab zziabVar) throws zzibg {
            return (zzbg) zziar.zzbT(zzh, zzhzlVar, zziabVar);
        }

        public static zzbg zzi(byte[] bArr) throws zzibg {
            return (zzbg) zziar.zzbU(zzh, bArr);
        }

        public static zzbg zzj(byte[] bArr, zziab zziabVar) throws zzibg {
            return (zzbg) zziar.zzbV(zzh, bArr, zziabVar);
        }

        public static zzbg zzm(InputStream inputStream) throws IOException {
            return (zzbg) zziar.zzbW(zzh, inputStream);
        }

        public static zzbg zzn(InputStream inputStream, zziab zziabVar) throws IOException {
            return (zzbg) zziar.zzbX(zzh, inputStream, zziabVar);
        }

        public static zzbg zzo(InputStream inputStream) throws IOException {
            return (zzbg) zziar.zzca(zzh, inputStream);
        }

        public static zzbg zzp(InputStream inputStream, zziab zziabVar) throws IOException {
            return (zzbg) zziar.zzcb(zzh, inputStream, zziabVar);
        }

        public static zzbg zzq(zzhzq zzhzqVar) throws IOException {
            return (zzbg) zziar.zzbY(zzh, zzhzqVar);
        }

        public static zzbg zzr(zzhzq zzhzqVar, zziab zziabVar) throws IOException {
            return (zzbg) zziar.zzbZ(zzh, zzhzqVar, zziabVar);
        }

        public static zza zzs() {
            return (zza) zzh.zzbn();
        }

        public static zza zzt(zzbg zzbgVar) {
            return (zza) zzh.zzbo(zzbgVar);
        }

        public static zzbg zzu() {
            return zzh;
        }

        public static zzick<zzbg> zzv() {
            return zzh.zzbd();
        }

        @Override // com.google.android.gms.internal.ads.zzbfp.zzbh
        public boolean zza() {
            return (this.zzd & 1) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbfp.zzbh
        public zzq zzb() {
            zzq zzqVarZzc = zzq.zzc(this.zze);
            return zzqVarZzc == null ? zzq.ENUM_UNKNOWN : zzqVarZzc;
        }

        @Override // com.google.android.gms.internal.ads.zziar
        public final Object zzdc(zziaq zziaqVar, Object obj, Object obj2) {
            zzick zziamVar;
            int iOrdinal = zziaqVar.ordinal();
            if (iOrdinal == 0) {
                return (byte) 1;
            }
            if (iOrdinal == 2) {
                return zziar.zzbv(zzh, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002ဉ\u0001\u0003ဉ\u0002", new Object[]{"zzd", "zze", zzq.zze(), "zzf", "zzg"});
            }
            if (iOrdinal == 3) {
                return new zzbg();
            }
            byte[] bArr = null;
            if (iOrdinal == 4) {
                return new zza(bArr);
            }
            if (iOrdinal == 5) {
                return zzh;
            }
            if (iOrdinal != 6) {
                throw null;
            }
            zzick<zzbg> zzickVar = zzi;
            if (zzickVar != null) {
                return zzickVar;
            }
            synchronized (zzbg.class) {
                try {
                    zziamVar = zzi;
                    if (zziamVar == null) {
                        zziamVar = new zziam(zzh);
                        zzi = zziamVar;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return zziamVar;
        }

        @Override // com.google.android.gms.internal.ads.zzbfp.zzbh
        public boolean zze() {
            return (this.zzd & 2) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbfp.zzbh
        public zzaw zzf() {
            zzaw zzawVar = this.zzf;
            return zzawVar == null ? zzaw.zzr() : zzawVar;
        }

        @Override // com.google.android.gms.internal.ads.zzbfp.zzbh
        public boolean zzk() {
            return (this.zzd & 4) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbfp.zzbh
        public zzap zzl() {
            zzap zzapVar = this.zzg;
            return zzapVar == null ? zzap.zzs() : zzapVar;
        }
    }

    public interface zzbh extends zzicd {
        boolean zza();

        zzq zzb();

        boolean zze();

        zzaw zzf();

        boolean zzk();

        zzap zzl();
    }

    public interface zzbi extends zzicd {
        boolean zzE();

        zzbc zzF();

        boolean zzK();

        zzay zzL();

        boolean zzQ();

        int zzR();

        boolean zzU();

        int zzV();

        boolean zzY();

        zzap zzZ();

        boolean zza();

        boolean zzae();

        int zzaf();

        boolean zzai();

        int zzaj();

        boolean zzam();

        int zzan();

        boolean zzaq();

        int zzar();

        boolean zzau();

        int zzav();

        boolean zzay();

        long zzaz();

        zzba zzb();

        boolean zzg();

        zzbe zzh();

        boolean zzm();

        zzbg zzn();

        boolean zzs();

        zzbj zzt();

        boolean zzy();

        zzau zzz();
    }

    public final class zzbj extends zziar<zzbj, zza> implements zzbk {
        public static final int zza = 1;
        public static final int zzb = 2;
        private static final zzbj zzf;
        private static volatile zzick<zzbj> zzg;
        private int zzc;
        private int zzd = 1000;
        private zzaw zze;

        public final class zza extends zzial<zzbj, zza> implements zzbk {
            public /* synthetic */ zza(byte[] bArr) {
                this();
            }

            @Override // com.google.android.gms.internal.ads.zzbfp.zzbk
            public boolean zza() {
                return ((zzbj) this.zza).zza();
            }

            @Override // com.google.android.gms.internal.ads.zzbfp.zzbk
            public zzq zzb() {
                return ((zzbj) this.zza).zzb();
            }

            public zza zzc(zzq zzqVar) {
                zzbg();
                ((zzbj) this.zza).zzu(zzqVar);
                return this;
            }

            public zza zzd() {
                zzbg();
                ((zzbj) this.zza).zzv();
                return this;
            }

            @Override // com.google.android.gms.internal.ads.zzbfp.zzbk
            public boolean zze() {
                return ((zzbj) this.zza).zze();
            }

            @Override // com.google.android.gms.internal.ads.zzbfp.zzbk
            public zzaw zzf() {
                return ((zzbj) this.zza).zzf();
            }

            public zza zzg(zzaw zzawVar) {
                zzbg();
                ((zzbj) this.zza).zzw(zzawVar);
                return this;
            }

            public zza zzh(zzaw.zza zzaVar) {
                zzbg();
                ((zzbj) this.zza).zzw(zzaVar.zzbu());
                return this;
            }

            public zza zzi(zzaw zzawVar) {
                zzbg();
                ((zzbj) this.zza).zzx(zzawVar);
                return this;
            }

            public zza zzj() {
                zzbg();
                ((zzbj) this.zza).zzy();
                return this;
            }

            private zza() {
                super(zzbj.zzf);
            }
        }

        static {
            zzbj zzbjVar = new zzbj();
            zzf = zzbjVar;
            zziar.zzbu(zzbj.class, zzbjVar);
        }

        private zzbj() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzA, reason: merged with bridge method [inline-methods] */
        public void zzu(zzq zzqVar) {
            this.zzd = zzqVar.zza();
            this.zzc |= 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzB, reason: merged with bridge method [inline-methods] */
        public void zzv() {
            this.zzc &= -2;
            this.zzd = 1000;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzC, reason: merged with bridge method [inline-methods] */
        public void zzw(zzaw zzawVar) {
            zzawVar.getClass();
            this.zze = zzawVar;
            this.zzc |= 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzD, reason: merged with bridge method [inline-methods] */
        public void zzx(zzaw zzawVar) {
            zzawVar.getClass();
            zzaw zzawVar2 = this.zze;
            if (zzawVar2 != null && zzawVar2 != zzaw.zzr()) {
                zzaw.zza zzaVarZzq = zzaw.zzq(zzawVar2);
                zzaVarZzq.zzbo(zzawVar);
                zzawVar = zzaVarZzq.zzbt();
            }
            this.zze = zzawVar;
            this.zzc |= 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzE, reason: merged with bridge method [inline-methods] */
        public void zzy() {
            this.zze = null;
            this.zzc &= -3;
        }

        public static zzbj zzc(ByteBuffer byteBuffer) throws zzibg {
            return (zzbj) zziar.zzbR(zzf, byteBuffer);
        }

        public static zzbj zzd(ByteBuffer byteBuffer, zziab zziabVar) throws zzibg {
            return (zzbj) zziar.zzbQ(zzf, byteBuffer, zziabVar);
        }

        public static zzbj zzg(zzhzl zzhzlVar) throws zzibg {
            return (zzbj) zziar.zzbS(zzf, zzhzlVar);
        }

        public static zzbj zzh(zzhzl zzhzlVar, zziab zziabVar) throws zzibg {
            return (zzbj) zziar.zzbT(zzf, zzhzlVar, zziabVar);
        }

        public static zzbj zzi(byte[] bArr) throws zzibg {
            return (zzbj) zziar.zzbU(zzf, bArr);
        }

        public static zzbj zzj(byte[] bArr, zziab zziabVar) throws zzibg {
            return (zzbj) zziar.zzbV(zzf, bArr, zziabVar);
        }

        public static zzbj zzk(InputStream inputStream) throws IOException {
            return (zzbj) zziar.zzbW(zzf, inputStream);
        }

        public static zzbj zzl(InputStream inputStream, zziab zziabVar) throws IOException {
            return (zzbj) zziar.zzbX(zzf, inputStream, zziabVar);
        }

        public static zzbj zzm(InputStream inputStream) throws IOException {
            return (zzbj) zziar.zzca(zzf, inputStream);
        }

        public static zzbj zzn(InputStream inputStream, zziab zziabVar) throws IOException {
            return (zzbj) zziar.zzcb(zzf, inputStream, zziabVar);
        }

        public static zzbj zzo(zzhzq zzhzqVar) throws IOException {
            return (zzbj) zziar.zzbY(zzf, zzhzqVar);
        }

        public static zzbj zzp(zzhzq zzhzqVar, zziab zziabVar) throws IOException {
            return (zzbj) zziar.zzbZ(zzf, zzhzqVar, zziabVar);
        }

        public static zza zzq() {
            return (zza) zzf.zzbn();
        }

        public static zza zzr(zzbj zzbjVar) {
            return (zza) zzf.zzbo(zzbjVar);
        }

        public static zzbj zzs() {
            return zzf;
        }

        public static zzick<zzbj> zzt() {
            return zzf.zzbd();
        }

        @Override // com.google.android.gms.internal.ads.zzbfp.zzbk
        public boolean zza() {
            return (this.zzc & 1) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbfp.zzbk
        public zzq zzb() {
            zzq zzqVarZzc = zzq.zzc(this.zzd);
            return zzqVarZzc == null ? zzq.ENUM_UNKNOWN : zzqVarZzc;
        }

        @Override // com.google.android.gms.internal.ads.zziar
        public final Object zzdc(zziaq zziaqVar, Object obj, Object obj2) {
            zzick zziamVar;
            int iOrdinal = zziaqVar.ordinal();
            if (iOrdinal == 0) {
                return (byte) 1;
            }
            if (iOrdinal == 2) {
                return zziar.zzbv(zzf, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002ဉ\u0001", new Object[]{"zzc", "zzd", zzq.zze(), "zze"});
            }
            if (iOrdinal == 3) {
                return new zzbj();
            }
            byte[] bArr = null;
            if (iOrdinal == 4) {
                return new zza(bArr);
            }
            if (iOrdinal == 5) {
                return zzf;
            }
            if (iOrdinal != 6) {
                throw null;
            }
            zzick<zzbj> zzickVar = zzg;
            if (zzickVar != null) {
                return zzickVar;
            }
            synchronized (zzbj.class) {
                try {
                    zziamVar = zzg;
                    if (zziamVar == null) {
                        zziamVar = new zziam(zzf);
                        zzg = zziamVar;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return zziamVar;
        }

        @Override // com.google.android.gms.internal.ads.zzbfp.zzbk
        public boolean zze() {
            return (this.zzc & 2) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbfp.zzbk
        public zzaw zzf() {
            zzaw zzawVar = this.zze;
            return zzawVar == null ? zzaw.zzr() : zzawVar;
        }
    }

    public interface zzbk extends zzicd {
        boolean zza();

        zzq zzb();

        boolean zze();

        zzaw zzf();
    }

    public final class zzbl extends zziar<zzbl, zza> implements zzbm {
        public static final int zza = 1;
        public static final int zzb = 2;
        private static final zzbl zzf;
        private static volatile zzick<zzbl> zzg;
        private int zzc;
        private boolean zzd;
        private int zze;

        public final class zza extends zzial<zzbl, zza> implements zzbm {
            public /* synthetic */ zza(byte[] bArr) {
                this();
            }

            @Override // com.google.android.gms.internal.ads.zzbfp.zzbm
            public boolean zza() {
                return ((zzbl) this.zza).zza();
            }

            @Override // com.google.android.gms.internal.ads.zzbfp.zzbm
            public boolean zzb() {
                return ((zzbl) this.zza).zzb();
            }

            public zza zzc(boolean z2) {
                zzbg();
                ((zzbl) this.zza).zzu(z2);
                return this;
            }

            public zza zzd() {
                zzbg();
                ((zzbl) this.zza).zzv();
                return this;
            }

            @Override // com.google.android.gms.internal.ads.zzbfp.zzbm
            public boolean zze() {
                return ((zzbl) this.zza).zze();
            }

            @Override // com.google.android.gms.internal.ads.zzbfp.zzbm
            public int zzf() {
                return ((zzbl) this.zza).zzf();
            }

            public zza zzg(int i2) {
                zzbg();
                ((zzbl) this.zza).zzw(i2);
                return this;
            }

            public zza zzh() {
                zzbg();
                ((zzbl) this.zza).zzx();
                return this;
            }

            private zza() {
                super(zzbl.zzf);
            }
        }

        static {
            zzbl zzblVar = new zzbl();
            zzf = zzblVar;
            zziar.zzbu(zzbl.class, zzblVar);
        }

        private zzbl() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzA, reason: merged with bridge method [inline-methods] */
        public void zzv() {
            this.zzc &= -2;
            this.zzd = false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzB, reason: merged with bridge method [inline-methods] */
        public void zzw(int i2) {
            this.zzc |= 2;
            this.zze = i2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzC, reason: merged with bridge method [inline-methods] */
        public void zzx() {
            this.zzc &= -3;
            this.zze = 0;
        }

        public static zzbl zzc(ByteBuffer byteBuffer) throws zzibg {
            return (zzbl) zziar.zzbR(zzf, byteBuffer);
        }

        public static zzbl zzd(ByteBuffer byteBuffer, zziab zziabVar) throws zzibg {
            return (zzbl) zziar.zzbQ(zzf, byteBuffer, zziabVar);
        }

        public static zzbl zzg(zzhzl zzhzlVar) throws zzibg {
            return (zzbl) zziar.zzbS(zzf, zzhzlVar);
        }

        public static zzbl zzh(zzhzl zzhzlVar, zziab zziabVar) throws zzibg {
            return (zzbl) zziar.zzbT(zzf, zzhzlVar, zziabVar);
        }

        public static zzbl zzi(byte[] bArr) throws zzibg {
            return (zzbl) zziar.zzbU(zzf, bArr);
        }

        public static zzbl zzj(byte[] bArr, zziab zziabVar) throws zzibg {
            return (zzbl) zziar.zzbV(zzf, bArr, zziabVar);
        }

        public static zzbl zzk(InputStream inputStream) throws IOException {
            return (zzbl) zziar.zzbW(zzf, inputStream);
        }

        public static zzbl zzl(InputStream inputStream, zziab zziabVar) throws IOException {
            return (zzbl) zziar.zzbX(zzf, inputStream, zziabVar);
        }

        public static zzbl zzm(InputStream inputStream) throws IOException {
            return (zzbl) zziar.zzca(zzf, inputStream);
        }

        public static zzbl zzn(InputStream inputStream, zziab zziabVar) throws IOException {
            return (zzbl) zziar.zzcb(zzf, inputStream, zziabVar);
        }

        public static zzbl zzo(zzhzq zzhzqVar) throws IOException {
            return (zzbl) zziar.zzbY(zzf, zzhzqVar);
        }

        public static zzbl zzp(zzhzq zzhzqVar, zziab zziabVar) throws IOException {
            return (zzbl) zziar.zzbZ(zzf, zzhzqVar, zziabVar);
        }

        public static zza zzq() {
            return (zza) zzf.zzbn();
        }

        public static zza zzr(zzbl zzblVar) {
            return (zza) zzf.zzbo(zzblVar);
        }

        public static zzbl zzs() {
            return zzf;
        }

        public static zzick<zzbl> zzt() {
            return zzf.zzbd();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzz, reason: merged with bridge method [inline-methods] */
        public void zzu(boolean z2) {
            this.zzc |= 1;
            this.zzd = z2;
        }

        @Override // com.google.android.gms.internal.ads.zzbfp.zzbm
        public boolean zza() {
            return (this.zzc & 1) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbfp.zzbm
        public boolean zzb() {
            return this.zzd;
        }

        @Override // com.google.android.gms.internal.ads.zziar
        public final Object zzdc(zziaq zziaqVar, Object obj, Object obj2) {
            zzick zziamVar;
            int iOrdinal = zziaqVar.ordinal();
            if (iOrdinal == 0) {
                return (byte) 1;
            }
            if (iOrdinal == 2) {
                return zziar.zzbv(zzf, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဇ\u0000\u0002င\u0001", new Object[]{"zzc", "zzd", "zze"});
            }
            if (iOrdinal == 3) {
                return new zzbl();
            }
            byte[] bArr = null;
            if (iOrdinal == 4) {
                return new zza(bArr);
            }
            if (iOrdinal == 5) {
                return zzf;
            }
            if (iOrdinal != 6) {
                throw null;
            }
            zzick<zzbl> zzickVar = zzg;
            if (zzickVar != null) {
                return zzickVar;
            }
            synchronized (zzbl.class) {
                try {
                    zziamVar = zzg;
                    if (zziamVar == null) {
                        zziamVar = new zziam(zzf);
                        zzg = zziamVar;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return zziamVar;
        }

        @Override // com.google.android.gms.internal.ads.zzbfp.zzbm
        public boolean zze() {
            return (this.zzc & 2) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbfp.zzbm
        public int zzf() {
            return this.zze;
        }
    }

    public interface zzbm extends zzicd {
        boolean zza();

        boolean zzb();

        boolean zze();

        int zzf();
    }

    public interface zzc extends zzicd {
        List<zzb.zza> zza();

        int zzb();

        zzb.zza zzc(int i2);
    }

    public final class zzd extends zziar<zzd, zzb> implements zze {
        public static final int zza = 1;
        public static final int zzb = 2;
        private static final zzd zzf;
        private static volatile zzick<zzd> zzg;
        private int zzc;
        private int zzd;
        private zzal zze;

        public enum zza implements zziav {
            AD_FORMAT_TYPE_UNSPECIFIED(0),
            BANNER(1),
            INTERSTITIAL(2),
            NATIVE_EXPRESS(3),
            NATIVE_CONTENT(4),
            NATIVE_APP_INSTALL(5),
            NATIVE_CUSTOM_TEMPLATE(6),
            DFP_BANNER(7),
            DFP_INTERSTITIAL(8),
            REWARD_BASED_VIDEO_AD(9),
            BANNER_SEARCH_ADS(10);

            public static final int zzl = 0;
            public static final int zzm = 1;
            public static final int zzn = 2;
            public static final int zzo = 3;
            public static final int zzp = 4;
            public static final int zzq = 5;
            public static final int zzr = 6;
            public static final int zzs = 7;
            public static final int zzt = 8;
            public static final int zzu = 9;
            public static final int zzv = 10;
            private static final zziaw<zza> zzw = new zziaw<zza>() { // from class: com.google.android.gms.internal.ads.zzbfp.zzd.zza.1
                /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
                public zza zzb(int i2) {
                    return zza.zzc(i2);
                }
            };
            private final int zzx;

            /* JADX INFO: renamed from: com.google.android.gms.internal.ads.zzbfp$zzd$zza$zza, reason: collision with other inner class name */
            final class C0190zza implements zziax {
                static final zziax zza = new C0190zza();

                private C0190zza() {
                }

                @Override // com.google.android.gms.internal.ads.zziax
                public boolean zza(int i2) {
                    return zza.zzc(i2) != null;
                }
            }

            zza(int i2) {
                this.zzx = i2;
            }

            public static zza zzc(int i2) {
                switch (i2) {
                    case 0:
                        return AD_FORMAT_TYPE_UNSPECIFIED;
                    case 1:
                        return BANNER;
                    case 2:
                        return INTERSTITIAL;
                    case 3:
                        return NATIVE_EXPRESS;
                    case 4:
                        return NATIVE_CONTENT;
                    case 5:
                        return NATIVE_APP_INSTALL;
                    case 6:
                        return NATIVE_CUSTOM_TEMPLATE;
                    case 7:
                        return DFP_BANNER;
                    case 8:
                        return DFP_INTERSTITIAL;
                    case 9:
                        return REWARD_BASED_VIDEO_AD;
                    case 10:
                        return BANNER_SEARCH_ADS;
                    default:
                        return null;
                }
            }

            public static zziaw<zza> zzd() {
                return zzw;
            }

            public static zziax zze() {
                return C0190zza.zza;
            }

            @Override // java.lang.Enum
            public final String toString() {
                return Integer.toString(this.zzx);
            }

            @Override // com.google.android.gms.internal.ads.zziav
            public final int zza() {
                return this.zzx;
            }
        }

        public final class zzb extends zzial<zzd, zzb> implements zze {
            public /* synthetic */ zzb(byte[] bArr) {
                this();
            }

            @Override // com.google.android.gms.internal.ads.zzbfp.zze
            public boolean zza() {
                return ((zzd) this.zza).zza();
            }

            @Override // com.google.android.gms.internal.ads.zzbfp.zze
            public zza zzb() {
                return ((zzd) this.zza).zzb();
            }

            public zzb zzc(zza zzaVar) {
                zzbg();
                ((zzd) this.zza).zzu(zzaVar);
                return this;
            }

            public zzb zzd() {
                zzbg();
                ((zzd) this.zza).zzv();
                return this;
            }

            @Override // com.google.android.gms.internal.ads.zzbfp.zze
            public boolean zze() {
                return ((zzd) this.zza).zze();
            }

            @Override // com.google.android.gms.internal.ads.zzbfp.zze
            public zzal zzf() {
                return ((zzd) this.zza).zzf();
            }

            public zzb zzg(zzal zzalVar) {
                zzbg();
                ((zzd) this.zza).zzw(zzalVar);
                return this;
            }

            public zzb zzh(zzal.zza zzaVar) {
                zzbg();
                ((zzd) this.zza).zzw(zzaVar.zzbu());
                return this;
            }

            public zzb zzi(zzal zzalVar) {
                zzbg();
                ((zzd) this.zza).zzx(zzalVar);
                return this;
            }

            public zzb zzj() {
                zzbg();
                ((zzd) this.zza).zzy();
                return this;
            }

            private zzb() {
                super(zzd.zzf);
            }
        }

        static {
            zzd zzdVar = new zzd();
            zzf = zzdVar;
            zziar.zzbu(zzd.class, zzdVar);
        }

        private zzd() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzA, reason: merged with bridge method [inline-methods] */
        public void zzu(zza zzaVar) {
            this.zzd = zzaVar.zza();
            this.zzc |= 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzB, reason: merged with bridge method [inline-methods] */
        public void zzv() {
            this.zzc &= -2;
            this.zzd = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzC, reason: merged with bridge method [inline-methods] */
        public void zzw(zzal zzalVar) {
            zzalVar.getClass();
            this.zze = zzalVar;
            this.zzc |= 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzD, reason: merged with bridge method [inline-methods] */
        public void zzx(zzal zzalVar) {
            zzalVar.getClass();
            zzal zzalVar2 = this.zze;
            if (zzalVar2 != null && zzalVar2 != zzal.zzs()) {
                zzal.zza zzaVarZzr = zzal.zzr(zzalVar2);
                zzaVarZzr.zzbo(zzalVar);
                zzalVar = zzaVarZzr.zzbt();
            }
            this.zze = zzalVar;
            this.zzc |= 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzE, reason: merged with bridge method [inline-methods] */
        public void zzy() {
            this.zze = null;
            this.zzc &= -3;
        }

        public static zzd zzc(ByteBuffer byteBuffer) throws zzibg {
            return (zzd) zziar.zzbR(zzf, byteBuffer);
        }

        public static zzd zzd(ByteBuffer byteBuffer, zziab zziabVar) throws zzibg {
            return (zzd) zziar.zzbQ(zzf, byteBuffer, zziabVar);
        }

        public static zzd zzg(zzhzl zzhzlVar) throws zzibg {
            return (zzd) zziar.zzbS(zzf, zzhzlVar);
        }

        public static zzd zzh(zzhzl zzhzlVar, zziab zziabVar) throws zzibg {
            return (zzd) zziar.zzbT(zzf, zzhzlVar, zziabVar);
        }

        public static zzd zzi(byte[] bArr) throws zzibg {
            return (zzd) zziar.zzbU(zzf, bArr);
        }

        public static zzd zzj(byte[] bArr, zziab zziabVar) throws zzibg {
            return (zzd) zziar.zzbV(zzf, bArr, zziabVar);
        }

        public static zzd zzk(InputStream inputStream) throws IOException {
            return (zzd) zziar.zzbW(zzf, inputStream);
        }

        public static zzd zzl(InputStream inputStream, zziab zziabVar) throws IOException {
            return (zzd) zziar.zzbX(zzf, inputStream, zziabVar);
        }

        public static zzd zzm(InputStream inputStream) throws IOException {
            return (zzd) zziar.zzca(zzf, inputStream);
        }

        public static zzd zzn(InputStream inputStream, zziab zziabVar) throws IOException {
            return (zzd) zziar.zzcb(zzf, inputStream, zziabVar);
        }

        public static zzd zzo(zzhzq zzhzqVar) throws IOException {
            return (zzd) zziar.zzbY(zzf, zzhzqVar);
        }

        public static zzd zzp(zzhzq zzhzqVar, zziab zziabVar) throws IOException {
            return (zzd) zziar.zzbZ(zzf, zzhzqVar, zziabVar);
        }

        public static zzb zzq() {
            return (zzb) zzf.zzbn();
        }

        public static zzb zzr(zzd zzdVar) {
            return (zzb) zzf.zzbo(zzdVar);
        }

        public static zzd zzs() {
            return zzf;
        }

        public static zzick<zzd> zzt() {
            return zzf.zzbd();
        }

        @Override // com.google.android.gms.internal.ads.zzbfp.zze
        public boolean zza() {
            return (this.zzc & 1) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbfp.zze
        public zza zzb() {
            zza zzaVarZzc = zza.zzc(this.zzd);
            return zzaVarZzc == null ? zza.AD_FORMAT_TYPE_UNSPECIFIED : zzaVarZzc;
        }

        @Override // com.google.android.gms.internal.ads.zziar
        public final Object zzdc(zziaq zziaqVar, Object obj, Object obj2) {
            zzick zziamVar;
            int iOrdinal = zziaqVar.ordinal();
            if (iOrdinal == 0) {
                return (byte) 1;
            }
            if (iOrdinal == 2) {
                return zziar.zzbv(zzf, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002ဉ\u0001", new Object[]{"zzc", "zzd", zza.zze(), "zze"});
            }
            if (iOrdinal == 3) {
                return new zzd();
            }
            byte[] bArr = null;
            if (iOrdinal == 4) {
                return new zzb(bArr);
            }
            if (iOrdinal == 5) {
                return zzf;
            }
            if (iOrdinal != 6) {
                throw null;
            }
            zzick<zzd> zzickVar = zzg;
            if (zzickVar != null) {
                return zzickVar;
            }
            synchronized (zzd.class) {
                try {
                    zziamVar = zzg;
                    if (zziamVar == null) {
                        zziamVar = new zziam(zzf);
                        zzg = zziamVar;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return zziamVar;
        }

        @Override // com.google.android.gms.internal.ads.zzbfp.zze
        public boolean zze() {
            return (this.zzc & 2) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbfp.zze
        public zzal zzf() {
            zzal zzalVar = this.zze;
            return zzalVar == null ? zzal.zzs() : zzalVar;
        }
    }

    public interface zze extends zzicd {
        boolean zza();

        zzd.zza zzb();

        boolean zze();

        zzal zzf();
    }

    public interface zzf extends zzicd {
        boolean zzG();

        zzk zzH();

        boolean zzM();

        zzah zzN();

        boolean zzS();

        zzac zzT();

        boolean zzY();

        zzx zzZ();

        boolean zza();

        boolean zzae();

        zzz zzaf();

        List<zzat> zzak();

        int zzal();

        zzat zzam(int i2);

        zza.EnumC0185zza zzb();

        boolean zze();

        zzq zzf();

        boolean zzi();

        zzg zzj();

        boolean zzo();

        zzi zzp();

        List<zzd> zzu();

        int zzv();

        zzd zzw(int i2);
    }

    public final class zzg extends zziar<zzg, zza> implements zzh {
        public static final int zza = 1;
        public static final int zzb = 2;
        public static final int zzc = 3;
        private static final zzg zzh;
        private static volatile zzick<zzg> zzi;
        private int zzd;
        private String zze = "";
        private zzibd<zzd> zzf = zziar.zzbM();
        private int zzg;

        public final class zza extends zzial<zzg, zza> implements zzh {
            public /* synthetic */ zza(byte[] bArr) {
                this();
            }

            @Override // com.google.android.gms.internal.ads.zzbfp.zzh
            public boolean zza() {
                return ((zzg) this.zza).zza();
            }

            @Override // com.google.android.gms.internal.ads.zzbfp.zzh
            public String zzb() {
                return ((zzg) this.zza).zzb();
            }

            @Override // com.google.android.gms.internal.ads.zzbfp.zzh
            public zzhzl zzc() {
                return ((zzg) this.zza).zzc();
            }

            public zza zzd(String str) {
                zzbg();
                ((zzg) this.zza).zzB(str);
                return this;
            }

            public zza zze() {
                zzbg();
                ((zzg) this.zza).zzC();
                return this;
            }

            public zza zzf(zzhzl zzhzlVar) {
                zzbg();
                ((zzg) this.zza).zzD(zzhzlVar);
                return this;
            }

            @Override // com.google.android.gms.internal.ads.zzbfp.zzh
            public List<zzd> zzg() {
                return Collections.unmodifiableList(((zzg) this.zza).zzg());
            }

            @Override // com.google.android.gms.internal.ads.zzbfp.zzh
            public int zzh() {
                return ((zzg) this.zza).zzh();
            }

            @Override // com.google.android.gms.internal.ads.zzbfp.zzh
            public zzd zzi(int i2) {
                return ((zzg) this.zza).zzi(i2);
            }

            public zza zzj(int i2, zzd zzdVar) {
                zzbg();
                ((zzg) this.zza).zzE(i2, zzdVar);
                return this;
            }

            public zza zzk(int i2, zzd.zzb zzbVar) {
                zzbg();
                ((zzg) this.zza).zzE(i2, zzbVar.zzbu());
                return this;
            }

            public zza zzl(zzd zzdVar) {
                zzbg();
                ((zzg) this.zza).zzF(zzdVar);
                return this;
            }

            public zza zzm(int i2, zzd zzdVar) {
                zzbg();
                ((zzg) this.zza).zzG(i2, zzdVar);
                return this;
            }

            public zza zzn(zzd.zzb zzbVar) {
                zzbg();
                ((zzg) this.zza).zzF(zzbVar.zzbu());
                return this;
            }

            public zza zzo(int i2, zzd.zzb zzbVar) {
                zzbg();
                ((zzg) this.zza).zzG(i2, zzbVar.zzbu());
                return this;
            }

            public zza zzp(Iterable<? extends zzd> iterable) {
                zzbg();
                ((zzg) this.zza).zzH(iterable);
                return this;
            }

            public zza zzq() {
                zzbg();
                ((zzg) this.zza).zzI();
                return this;
            }

            public zza zzr(int i2) {
                zzbg();
                ((zzg) this.zza).zzJ(i2);
                return this;
            }

            @Override // com.google.android.gms.internal.ads.zzbfp.zzh
            public boolean zzs() {
                return ((zzg) this.zza).zzs();
            }

            @Override // com.google.android.gms.internal.ads.zzbfp.zzh
            public zzq zzt() {
                return ((zzg) this.zza).zzt();
            }

            public zza zzu(zzq zzqVar) {
                zzbg();
                ((zzg) this.zza).zzK(zzqVar);
                return this;
            }

            public zza zzv() {
                zzbg();
                ((zzg) this.zza).zzL();
                return this;
            }

            private zza() {
                super(zzg.zzh);
            }
        }

        static {
            zzg zzgVar = new zzg();
            zzh = zzgVar;
            zziar.zzbu(zzg.class, zzgVar);
        }

        private zzg() {
        }

        public static zzick<zzg> zzA() {
            return zzh.zzbd();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzN, reason: merged with bridge method [inline-methods] */
        public void zzB(String str) {
            str.getClass();
            this.zzd |= 1;
            this.zze = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzO, reason: merged with bridge method [inline-methods] */
        public void zzC() {
            this.zzd &= -2;
            this.zze = zzz().zzb();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzP, reason: merged with bridge method [inline-methods] */
        public void zzD(zzhzl zzhzlVar) {
            this.zze = zzhzlVar.zzz();
            this.zzd |= 1;
        }

        private void zzQ() {
            zzibd<zzd> zzibdVar = this.zzf;
            if (zzibdVar.zza()) {
                return;
            }
            this.zzf = zziar.zzbN(zzibdVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzR, reason: merged with bridge method [inline-methods] */
        public void zzE(int i2, zzd zzdVar) {
            zzdVar.getClass();
            zzQ();
            this.zzf.set(i2, zzdVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzS, reason: merged with bridge method [inline-methods] */
        public void zzF(zzd zzdVar) {
            zzdVar.getClass();
            zzQ();
            this.zzf.add(zzdVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzT, reason: merged with bridge method [inline-methods] */
        public void zzG(int i2, zzd zzdVar) {
            zzdVar.getClass();
            zzQ();
            this.zzf.add(i2, zzdVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzU, reason: merged with bridge method [inline-methods] */
        public void zzH(Iterable<? extends zzd> iterable) {
            zzQ();
            zzhyu.zzaW(iterable, this.zzf);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzV, reason: merged with bridge method [inline-methods] */
        public void zzI() {
            this.zzf = zziar.zzbM();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzW, reason: merged with bridge method [inline-methods] */
        public void zzJ(int i2) {
            zzQ();
            this.zzf.remove(i2);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzX, reason: merged with bridge method [inline-methods] */
        public void zzK(zzq zzqVar) {
            this.zzg = zzqVar.zza();
            this.zzd |= 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzY, reason: merged with bridge method [inline-methods] */
        public void zzL() {
            this.zzd &= -3;
            this.zzg = 0;
        }

        public static zzg zzj(ByteBuffer byteBuffer) throws zzibg {
            return (zzg) zziar.zzbR(zzh, byteBuffer);
        }

        public static zzg zzk(ByteBuffer byteBuffer, zziab zziabVar) throws zzibg {
            return (zzg) zziar.zzbQ(zzh, byteBuffer, zziabVar);
        }

        public static zzg zzl(zzhzl zzhzlVar) throws zzibg {
            return (zzg) zziar.zzbS(zzh, zzhzlVar);
        }

        public static zzg zzm(zzhzl zzhzlVar, zziab zziabVar) throws zzibg {
            return (zzg) zziar.zzbT(zzh, zzhzlVar, zziabVar);
        }

        public static zzg zzn(byte[] bArr) throws zzibg {
            return (zzg) zziar.zzbU(zzh, bArr);
        }

        public static zzg zzo(byte[] bArr, zziab zziabVar) throws zzibg {
            return (zzg) zziar.zzbV(zzh, bArr, zziabVar);
        }

        public static zzg zzp(InputStream inputStream) throws IOException {
            return (zzg) zziar.zzbW(zzh, inputStream);
        }

        public static zzg zzq(InputStream inputStream, zziab zziabVar) throws IOException {
            return (zzg) zziar.zzbX(zzh, inputStream, zziabVar);
        }

        public static zzg zzr(InputStream inputStream) throws IOException {
            return (zzg) zziar.zzca(zzh, inputStream);
        }

        public static zzg zzu(InputStream inputStream, zziab zziabVar) throws IOException {
            return (zzg) zziar.zzcb(zzh, inputStream, zziabVar);
        }

        public static zzg zzv(zzhzq zzhzqVar) throws IOException {
            return (zzg) zziar.zzbY(zzh, zzhzqVar);
        }

        public static zzg zzw(zzhzq zzhzqVar, zziab zziabVar) throws IOException {
            return (zzg) zziar.zzbZ(zzh, zzhzqVar, zziabVar);
        }

        public static zza zzx() {
            return (zza) zzh.zzbn();
        }

        public static zza zzy(zzg zzgVar) {
            return (zza) zzh.zzbo(zzgVar);
        }

        public static zzg zzz() {
            return zzh;
        }

        @Override // com.google.android.gms.internal.ads.zzbfp.zzh
        public boolean zza() {
            return (this.zzd & 1) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbfp.zzh
        public String zzb() {
            return this.zze;
        }

        @Override // com.google.android.gms.internal.ads.zzbfp.zzh
        public zzhzl zzc() {
            return zzhzl.zzv(this.zze);
        }

        public List<? extends zze> zzd() {
            return this.zzf;
        }

        @Override // com.google.android.gms.internal.ads.zziar
        public final Object zzdc(zziaq zziaqVar, Object obj, Object obj2) {
            zzick zziamVar;
            int iOrdinal = zziaqVar.ordinal();
            if (iOrdinal == 0) {
                return (byte) 1;
            }
            if (iOrdinal == 2) {
                return zziar.zzbv(zzh, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b\u0003᠌\u0001", new Object[]{"zzd", "zze", "zzf", zzd.class, "zzg", zzq.zze()});
            }
            if (iOrdinal == 3) {
                return new zzg();
            }
            byte[] bArr = null;
            if (iOrdinal == 4) {
                return new zza(bArr);
            }
            if (iOrdinal == 5) {
                return zzh;
            }
            if (iOrdinal != 6) {
                throw null;
            }
            zzick<zzg> zzickVar = zzi;
            if (zzickVar != null) {
                return zzickVar;
            }
            synchronized (zzg.class) {
                try {
                    zziamVar = zzi;
                    if (zziamVar == null) {
                        zziamVar = new zziam(zzh);
                        zzi = zziamVar;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return zziamVar;
        }

        public zze zze(int i2) {
            return this.zzf.get(i2);
        }

        @Override // com.google.android.gms.internal.ads.zzbfp.zzh
        public List<zzd> zzg() {
            return this.zzf;
        }

        @Override // com.google.android.gms.internal.ads.zzbfp.zzh
        public int zzh() {
            return this.zzf.size();
        }

        @Override // com.google.android.gms.internal.ads.zzbfp.zzh
        public zzd zzi(int i2) {
            return this.zzf.get(i2);
        }

        @Override // com.google.android.gms.internal.ads.zzbfp.zzh
        public boolean zzs() {
            return (this.zzd & 2) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbfp.zzh
        public zzq zzt() {
            zzq zzqVarZzc = zzq.zzc(this.zzg);
            return zzqVarZzc == null ? zzq.ENUM_FALSE : zzqVarZzc;
        }
    }

    public interface zzh extends zzicd {
        boolean zza();

        String zzb();

        zzhzl zzc();

        List<zzd> zzg();

        int zzh();

        zzd zzi(int i2);

        boolean zzs();

        zzq zzt();
    }

    public final class zzi extends zziar<zzi, zza> implements zzj {
        public static final int zza = 1;
        public static final int zzb = 2;
        public static final int zzc = 3;
        public static final int zzd = 4;
        public static final int zze = 5;
        private static final zzi zzl;
        private static volatile zzick<zzi> zzm;
        private int zzf;
        private String zzg = "";
        private zzibd<zzd> zzh = zziar.zzbM();
        private int zzi = 1000;
        private int zzj = 1000;
        private int zzk = 1000;

        public final class zza extends zzial<zzi, zza> implements zzj {
            public /* synthetic */ zza(byte[] bArr) {
                this();
            }

            @Override // com.google.android.gms.internal.ads.zzbfp.zzj
            public boolean zzA() {
                return ((zzi) this.zza).zzA();
            }

            @Override // com.google.android.gms.internal.ads.zzbfp.zzj
            public zzq zzB() {
                return ((zzi) this.zza).zzB();
            }

            public zza zzC(zzq zzqVar) {
                zzbg();
                ((zzi) this.zza).zzS(zzqVar);
                return this;
            }

            public zza zzD() {
                zzbg();
                ((zzi) this.zza).zzT();
                return this;
            }

            @Override // com.google.android.gms.internal.ads.zzbfp.zzj
            public boolean zza() {
                return ((zzi) this.zza).zza();
            }

            @Override // com.google.android.gms.internal.ads.zzbfp.zzj
            public String zzb() {
                return ((zzi) this.zza).zzb();
            }

            @Override // com.google.android.gms.internal.ads.zzbfp.zzj
            public zzhzl zzc() {
                return ((zzi) this.zza).zzc();
            }

            public zza zzd(String str) {
                zzbg();
                ((zzi) this.zza).zzF(str);
                return this;
            }

            public zza zze() {
                zzbg();
                ((zzi) this.zza).zzG();
                return this;
            }

            public zza zzf(zzhzl zzhzlVar) {
                zzbg();
                ((zzi) this.zza).zzH(zzhzlVar);
                return this;
            }

            @Override // com.google.android.gms.internal.ads.zzbfp.zzj
            public List<zzd> zzg() {
                return Collections.unmodifiableList(((zzi) this.zza).zzg());
            }

            @Override // com.google.android.gms.internal.ads.zzbfp.zzj
            public int zzh() {
                return ((zzi) this.zza).zzh();
            }

            @Override // com.google.android.gms.internal.ads.zzbfp.zzj
            public zzd zzi(int i2) {
                return ((zzi) this.zza).zzi(i2);
            }

            public zza zzj(int i2, zzd zzdVar) {
                zzbg();
                ((zzi) this.zza).zzI(i2, zzdVar);
                return this;
            }

            public zza zzk(int i2, zzd.zzb zzbVar) {
                zzbg();
                ((zzi) this.zza).zzI(i2, zzbVar.zzbu());
                return this;
            }

            public zza zzl(zzd zzdVar) {
                zzbg();
                ((zzi) this.zza).zzJ(zzdVar);
                return this;
            }

            public zza zzm(int i2, zzd zzdVar) {
                zzbg();
                ((zzi) this.zza).zzK(i2, zzdVar);
                return this;
            }

            public zza zzn(zzd.zzb zzbVar) {
                zzbg();
                ((zzi) this.zza).zzJ(zzbVar.zzbu());
                return this;
            }

            public zza zzo(int i2, zzd.zzb zzbVar) {
                zzbg();
                ((zzi) this.zza).zzK(i2, zzbVar.zzbu());
                return this;
            }

            public zza zzp(Iterable<? extends zzd> iterable) {
                zzbg();
                ((zzi) this.zza).zzL(iterable);
                return this;
            }

            public zza zzq() {
                zzbg();
                ((zzi) this.zza).zzM();
                return this;
            }

            public zza zzr(int i2) {
                zzbg();
                ((zzi) this.zza).zzN(i2);
                return this;
            }

            @Override // com.google.android.gms.internal.ads.zzbfp.zzj
            public boolean zzs() {
                return ((zzi) this.zza).zzs();
            }

            @Override // com.google.android.gms.internal.ads.zzbfp.zzj
            public zzq zzt() {
                return ((zzi) this.zza).zzt();
            }

            public zza zzu(zzq zzqVar) {
                zzbg();
                ((zzi) this.zza).zzO(zzqVar);
                return this;
            }

            public zza zzv() {
                zzbg();
                ((zzi) this.zza).zzP();
                return this;
            }

            @Override // com.google.android.gms.internal.ads.zzbfp.zzj
            public boolean zzw() {
                return ((zzi) this.zza).zzw();
            }

            @Override // com.google.android.gms.internal.ads.zzbfp.zzj
            public zzq zzx() {
                return ((zzi) this.zza).zzx();
            }

            public zza zzy(zzq zzqVar) {
                zzbg();
                ((zzi) this.zza).zzQ(zzqVar);
                return this;
            }

            public zza zzz() {
                zzbg();
                ((zzi) this.zza).zzR();
                return this;
            }

            private zza() {
                super(zzi.zzl);
            }
        }

        static {
            zzi zziVar = new zzi();
            zzl = zziVar;
            zziar.zzbu(zzi.class, zziVar);
        }

        private zzi() {
        }

        public static zza zzC(zzi zziVar) {
            return (zza) zzl.zzbo(zziVar);
        }

        public static zzi zzD() {
            return zzl;
        }

        public static zzick<zzi> zzE() {
            return zzl.zzbd();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzV, reason: merged with bridge method [inline-methods] */
        public void zzF(String str) {
            str.getClass();
            this.zzf |= 1;
            this.zzg = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzW, reason: merged with bridge method [inline-methods] */
        public void zzG() {
            this.zzf &= -2;
            this.zzg = zzD().zzb();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzX, reason: merged with bridge method [inline-methods] */
        public void zzH(zzhzl zzhzlVar) {
            this.zzg = zzhzlVar.zzz();
            this.zzf |= 1;
        }

        private void zzY() {
            zzibd<zzd> zzibdVar = this.zzh;
            if (zzibdVar.zza()) {
                return;
            }
            this.zzh = zziar.zzbN(zzibdVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzZ, reason: merged with bridge method [inline-methods] */
        public void zzI(int i2, zzd zzdVar) {
            zzdVar.getClass();
            zzY();
            this.zzh.set(i2, zzdVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzaa, reason: merged with bridge method [inline-methods] */
        public void zzJ(zzd zzdVar) {
            zzdVar.getClass();
            zzY();
            this.zzh.add(zzdVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzab, reason: merged with bridge method [inline-methods] */
        public void zzK(int i2, zzd zzdVar) {
            zzdVar.getClass();
            zzY();
            this.zzh.add(i2, zzdVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzac, reason: merged with bridge method [inline-methods] */
        public void zzL(Iterable<? extends zzd> iterable) {
            zzY();
            zzhyu.zzaW(iterable, this.zzh);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzad, reason: merged with bridge method [inline-methods] */
        public void zzM() {
            this.zzh = zziar.zzbM();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzae, reason: merged with bridge method [inline-methods] */
        public void zzN(int i2) {
            zzY();
            this.zzh.remove(i2);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzaf, reason: merged with bridge method [inline-methods] */
        public void zzO(zzq zzqVar) {
            this.zzi = zzqVar.zza();
            this.zzf |= 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzag, reason: merged with bridge method [inline-methods] */
        public void zzP() {
            this.zzf &= -3;
            this.zzi = 1000;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzah, reason: merged with bridge method [inline-methods] */
        public void zzQ(zzq zzqVar) {
            this.zzj = zzqVar.zza();
            this.zzf |= 4;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzai, reason: merged with bridge method [inline-methods] */
        public void zzR() {
            this.zzf &= -5;
            this.zzj = 1000;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzaj, reason: merged with bridge method [inline-methods] */
        public void zzS(zzq zzqVar) {
            this.zzk = zzqVar.zza();
            this.zzf |= 8;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzak, reason: merged with bridge method [inline-methods] */
        public void zzT() {
            this.zzf &= -9;
            this.zzk = 1000;
        }

        public static zzi zzj(ByteBuffer byteBuffer) throws zzibg {
            return (zzi) zziar.zzbR(zzl, byteBuffer);
        }

        public static zzi zzk(ByteBuffer byteBuffer, zziab zziabVar) throws zzibg {
            return (zzi) zziar.zzbQ(zzl, byteBuffer, zziabVar);
        }

        public static zzi zzl(zzhzl zzhzlVar) throws zzibg {
            return (zzi) zziar.zzbS(zzl, zzhzlVar);
        }

        public static zzi zzm(zzhzl zzhzlVar, zziab zziabVar) throws zzibg {
            return (zzi) zziar.zzbT(zzl, zzhzlVar, zziabVar);
        }

        public static zzi zzn(byte[] bArr) throws zzibg {
            return (zzi) zziar.zzbU(zzl, bArr);
        }

        public static zzi zzo(byte[] bArr, zziab zziabVar) throws zzibg {
            return (zzi) zziar.zzbV(zzl, bArr, zziabVar);
        }

        public static zzi zzp(InputStream inputStream) throws IOException {
            return (zzi) zziar.zzbW(zzl, inputStream);
        }

        public static zzi zzq(InputStream inputStream, zziab zziabVar) throws IOException {
            return (zzi) zziar.zzbX(zzl, inputStream, zziabVar);
        }

        public static zzi zzr(InputStream inputStream) throws IOException {
            return (zzi) zziar.zzca(zzl, inputStream);
        }

        public static zzi zzu(InputStream inputStream, zziab zziabVar) throws IOException {
            return (zzi) zziar.zzcb(zzl, inputStream, zziabVar);
        }

        public static zzi zzv(zzhzq zzhzqVar) throws IOException {
            return (zzi) zziar.zzbY(zzl, zzhzqVar);
        }

        public static zzi zzy(zzhzq zzhzqVar, zziab zziabVar) throws IOException {
            return (zzi) zziar.zzbZ(zzl, zzhzqVar, zziabVar);
        }

        public static zza zzz() {
            return (zza) zzl.zzbn();
        }

        @Override // com.google.android.gms.internal.ads.zzbfp.zzj
        public boolean zzA() {
            return (this.zzf & 8) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbfp.zzj
        public zzq zzB() {
            zzq zzqVarZzc = zzq.zzc(this.zzk);
            return zzqVarZzc == null ? zzq.ENUM_UNKNOWN : zzqVarZzc;
        }

        @Override // com.google.android.gms.internal.ads.zzbfp.zzj
        public boolean zza() {
            return (this.zzf & 1) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbfp.zzj
        public String zzb() {
            return this.zzg;
        }

        @Override // com.google.android.gms.internal.ads.zzbfp.zzj
        public zzhzl zzc() {
            return zzhzl.zzv(this.zzg);
        }

        public List<? extends zze> zzd() {
            return this.zzh;
        }

        @Override // com.google.android.gms.internal.ads.zziar
        public final Object zzdc(zziaq zziaqVar, Object obj, Object obj2) {
            zzick zziamVar;
            int iOrdinal = zziaqVar.ordinal();
            if (iOrdinal == 0) {
                return (byte) 1;
            }
            if (iOrdinal == 2) {
                return zziar.zzbv(zzl, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b\u0003᠌\u0001\u0004᠌\u0002\u0005᠌\u0003", new Object[]{"zzf", "zzg", "zzh", zzd.class, "zzi", zzq.zze(), "zzj", zzq.zze(), "zzk", zzq.zze()});
            }
            if (iOrdinal == 3) {
                return new zzi();
            }
            byte[] bArr = null;
            if (iOrdinal == 4) {
                return new zza(bArr);
            }
            if (iOrdinal == 5) {
                return zzl;
            }
            if (iOrdinal != 6) {
                throw null;
            }
            zzick<zzi> zzickVar = zzm;
            if (zzickVar != null) {
                return zzickVar;
            }
            synchronized (zzi.class) {
                try {
                    zziamVar = zzm;
                    if (zziamVar == null) {
                        zziamVar = new zziam(zzl);
                        zzm = zziamVar;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return zziamVar;
        }

        public zze zze(int i2) {
            return this.zzh.get(i2);
        }

        @Override // com.google.android.gms.internal.ads.zzbfp.zzj
        public List<zzd> zzg() {
            return this.zzh;
        }

        @Override // com.google.android.gms.internal.ads.zzbfp.zzj
        public int zzh() {
            return this.zzh.size();
        }

        @Override // com.google.android.gms.internal.ads.zzbfp.zzj
        public zzd zzi(int i2) {
            return this.zzh.get(i2);
        }

        @Override // com.google.android.gms.internal.ads.zzbfp.zzj
        public boolean zzs() {
            return (this.zzf & 2) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbfp.zzj
        public zzq zzt() {
            zzq zzqVarZzc = zzq.zzc(this.zzi);
            return zzqVarZzc == null ? zzq.ENUM_UNKNOWN : zzqVarZzc;
        }

        @Override // com.google.android.gms.internal.ads.zzbfp.zzj
        public boolean zzw() {
            return (this.zzf & 4) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbfp.zzj
        public zzq zzx() {
            zzq zzqVarZzc = zzq.zzc(this.zzj);
            return zzqVarZzc == null ? zzq.ENUM_UNKNOWN : zzqVarZzc;
        }
    }

    public interface zzj extends zzicd {
        boolean zzA();

        zzq zzB();

        boolean zza();

        String zzb();

        zzhzl zzc();

        List<zzd> zzg();

        int zzh();

        zzd zzi(int i2);

        boolean zzs();

        zzq zzt();

        boolean zzw();

        zzq zzx();
    }

    public final class zzk extends zziar<zzk, zza> implements zzl {
        public static final int zza = 1;
        public static final int zzb = 2;
        public static final int zzc = 3;
        public static final int zzd = 4;
        public static final int zze = 5;
        public static final int zzf = 6;
        private static final zzk zzn;
        private static volatile zzick<zzk> zzo;
        private int zzg;
        private int zzh;
        private zzap zzi;
        private zzap zzj;
        private zzap zzk;
        private zzibd<zzap> zzl = zziar.zzbM();
        private int zzm;

        public final class zza extends zzial<zzk, zza> implements zzl {
            public /* synthetic */ zza(byte[] bArr) {
                this();
            }

            public zza zzA(int i2, zzap.zza zzaVar) {
                zzbg();
                ((zzk) this.zza).zzQ(i2, zzaVar.zzbu());
                return this;
            }

            public zza zzB(zzap zzapVar) {
                zzbg();
                ((zzk) this.zza).zzR(zzapVar);
                return this;
            }

            public zza zzC(int i2, zzap zzapVar) {
                zzbg();
                ((zzk) this.zza).zzS(i2, zzapVar);
                return this;
            }

            public zza zzD(zzap.zza zzaVar) {
                zzbg();
                ((zzk) this.zza).zzR(zzaVar.zzbu());
                return this;
            }

            public zza zzE(int i2, zzap.zza zzaVar) {
                zzbg();
                ((zzk) this.zza).zzS(i2, zzaVar.zzbu());
                return this;
            }

            public zza zzF(Iterable<? extends zzap> iterable) {
                zzbg();
                ((zzk) this.zza).zzT(iterable);
                return this;
            }

            public zza zzG() {
                zzbg();
                ((zzk) this.zza).zzU();
                return this;
            }

            public zza zzH(int i2) {
                zzbg();
                ((zzk) this.zza).zzV(i2);
                return this;
            }

            @Override // com.google.android.gms.internal.ads.zzbfp.zzl
            public boolean zzI() {
                return ((zzk) this.zza).zzI();
            }

            @Override // com.google.android.gms.internal.ads.zzbfp.zzl
            public int zzJ() {
                return ((zzk) this.zza).zzJ();
            }

            public zza zzK(int i2) {
                zzbg();
                ((zzk) this.zza).zzW(i2);
                return this;
            }

            public zza zzL() {
                zzbg();
                ((zzk) this.zza).zzX();
                return this;
            }

            @Override // com.google.android.gms.internal.ads.zzbfp.zzl
            public boolean zza() {
                return ((zzk) this.zza).zza();
            }

            @Override // com.google.android.gms.internal.ads.zzbfp.zzl
            public int zzb() {
                return ((zzk) this.zza).zzb();
            }

            public zza zzc(int i2) {
                zzbg();
                ((zzk) this.zza).zzD(i2);
                return this;
            }

            public zza zzd() {
                zzbg();
                ((zzk) this.zza).zzE();
                return this;
            }

            @Override // com.google.android.gms.internal.ads.zzbfp.zzl
            public boolean zze() {
                return ((zzk) this.zza).zze();
            }

            @Override // com.google.android.gms.internal.ads.zzbfp.zzl
            public zzap zzf() {
                return ((zzk) this.zza).zzf();
            }

            public zza zzg(zzap zzapVar) {
                zzbg();
                ((zzk) this.zza).zzF(zzapVar);
                return this;
            }

            public zza zzh(zzap.zza zzaVar) {
                zzbg();
                ((zzk) this.zza).zzF(zzaVar.zzbu());
                return this;
            }

            public zza zzi(zzap zzapVar) {
                zzbg();
                ((zzk) this.zza).zzG(zzapVar);
                return this;
            }

            public zza zzj() {
                zzbg();
                ((zzk) this.zza).zzH();
                return this;
            }

            @Override // com.google.android.gms.internal.ads.zzbfp.zzl
            public boolean zzk() {
                return ((zzk) this.zza).zzk();
            }

            @Override // com.google.android.gms.internal.ads.zzbfp.zzl
            public zzap zzl() {
                return ((zzk) this.zza).zzl();
            }

            public zza zzm(zzap zzapVar) {
                zzbg();
                ((zzk) this.zza).zzK(zzapVar);
                return this;
            }

            public zza zzn(zzap.zza zzaVar) {
                zzbg();
                ((zzk) this.zza).zzK(zzaVar.zzbu());
                return this;
            }

            public zza zzo(zzap zzapVar) {
                zzbg();
                ((zzk) this.zza).zzL(zzapVar);
                return this;
            }

            public zza zzp() {
                zzbg();
                ((zzk) this.zza).zzM();
                return this;
            }

            @Override // com.google.android.gms.internal.ads.zzbfp.zzl
            public boolean zzq() {
                return ((zzk) this.zza).zzq();
            }

            @Override // com.google.android.gms.internal.ads.zzbfp.zzl
            public zzap zzr() {
                return ((zzk) this.zza).zzr();
            }

            public zza zzs(zzap zzapVar) {
                zzbg();
                ((zzk) this.zza).zzN(zzapVar);
                return this;
            }

            public zza zzt(zzap.zza zzaVar) {
                zzbg();
                ((zzk) this.zza).zzN(zzaVar.zzbu());
                return this;
            }

            public zza zzu(zzap zzapVar) {
                zzbg();
                ((zzk) this.zza).zzO(zzapVar);
                return this;
            }

            public zza zzv() {
                zzbg();
                ((zzk) this.zza).zzP();
                return this;
            }

            @Override // com.google.android.gms.internal.ads.zzbfp.zzl
            public List<zzap> zzw() {
                return Collections.unmodifiableList(((zzk) this.zza).zzw());
            }

            @Override // com.google.android.gms.internal.ads.zzbfp.zzl
            public int zzx() {
                return ((zzk) this.zza).zzx();
            }

            @Override // com.google.android.gms.internal.ads.zzbfp.zzl
            public zzap zzy(int i2) {
                return ((zzk) this.zza).zzy(i2);
            }

            public zza zzz(int i2, zzap zzapVar) {
                zzbg();
                ((zzk) this.zza).zzQ(i2, zzapVar);
                return this;
            }

            private zza() {
                super(zzk.zzn);
            }
        }

        static {
            zzk zzkVar = new zzk();
            zzn = zzkVar;
            zziar.zzbu(zzk.class, zzkVar);
        }

        private zzk() {
        }

        public static zza zzA(zzk zzkVar) {
            return (zza) zzn.zzbo(zzkVar);
        }

        public static zzk zzB() {
            return zzn;
        }

        public static zzick<zzk> zzC() {
            return zzn.zzbd();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzZ, reason: merged with bridge method [inline-methods] */
        public void zzD(int i2) {
            this.zzg |= 1;
            this.zzh = i2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzaa, reason: merged with bridge method [inline-methods] */
        public void zzE() {
            this.zzg &= -2;
            this.zzh = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzab, reason: merged with bridge method [inline-methods] */
        public void zzF(zzap zzapVar) {
            zzapVar.getClass();
            this.zzi = zzapVar;
            this.zzg |= 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzac, reason: merged with bridge method [inline-methods] */
        public void zzG(zzap zzapVar) {
            zzapVar.getClass();
            zzap zzapVar2 = this.zzi;
            if (zzapVar2 != null && zzapVar2 != zzap.zzs()) {
                zzap.zza zzaVarZzr = zzap.zzr(zzapVar2);
                zzaVarZzr.zzbo(zzapVar);
                zzapVar = zzaVarZzr.zzbt();
            }
            this.zzi = zzapVar;
            this.zzg |= 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzad, reason: merged with bridge method [inline-methods] */
        public void zzH() {
            this.zzi = null;
            this.zzg &= -3;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzae, reason: merged with bridge method [inline-methods] */
        public void zzK(zzap zzapVar) {
            zzapVar.getClass();
            this.zzj = zzapVar;
            this.zzg |= 4;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzaf, reason: merged with bridge method [inline-methods] */
        public void zzL(zzap zzapVar) {
            zzapVar.getClass();
            zzap zzapVar2 = this.zzj;
            if (zzapVar2 != null && zzapVar2 != zzap.zzs()) {
                zzap.zza zzaVarZzr = zzap.zzr(zzapVar2);
                zzaVarZzr.zzbo(zzapVar);
                zzapVar = zzaVarZzr.zzbt();
            }
            this.zzj = zzapVar;
            this.zzg |= 4;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzag, reason: merged with bridge method [inline-methods] */
        public void zzM() {
            this.zzj = null;
            this.zzg &= -5;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzah, reason: merged with bridge method [inline-methods] */
        public void zzN(zzap zzapVar) {
            zzapVar.getClass();
            this.zzk = zzapVar;
            this.zzg |= 8;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzai, reason: merged with bridge method [inline-methods] */
        public void zzO(zzap zzapVar) {
            zzapVar.getClass();
            zzap zzapVar2 = this.zzk;
            if (zzapVar2 != null && zzapVar2 != zzap.zzs()) {
                zzap.zza zzaVarZzr = zzap.zzr(zzapVar2);
                zzaVarZzr.zzbo(zzapVar);
                zzapVar = zzaVarZzr.zzbt();
            }
            this.zzk = zzapVar;
            this.zzg |= 8;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzaj, reason: merged with bridge method [inline-methods] */
        public void zzP() {
            this.zzk = null;
            this.zzg &= -9;
        }

        private void zzak() {
            zzibd<zzap> zzibdVar = this.zzl;
            if (zzibdVar.zza()) {
                return;
            }
            this.zzl = zziar.zzbN(zzibdVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzal, reason: merged with bridge method [inline-methods] */
        public void zzQ(int i2, zzap zzapVar) {
            zzapVar.getClass();
            zzak();
            this.zzl.set(i2, zzapVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzam, reason: merged with bridge method [inline-methods] */
        public void zzR(zzap zzapVar) {
            zzapVar.getClass();
            zzak();
            this.zzl.add(zzapVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzan, reason: merged with bridge method [inline-methods] */
        public void zzS(int i2, zzap zzapVar) {
            zzapVar.getClass();
            zzak();
            this.zzl.add(i2, zzapVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzao, reason: merged with bridge method [inline-methods] */
        public void zzT(Iterable<? extends zzap> iterable) {
            zzak();
            zzhyu.zzaW(iterable, this.zzl);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzap, reason: merged with bridge method [inline-methods] */
        public void zzU() {
            this.zzl = zziar.zzbM();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzaq, reason: merged with bridge method [inline-methods] */
        public void zzV(int i2) {
            zzak();
            this.zzl.remove(i2);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzar, reason: merged with bridge method [inline-methods] */
        public void zzW(int i2) {
            this.zzg |= 16;
            this.zzm = i2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzas, reason: merged with bridge method [inline-methods] */
        public void zzX() {
            this.zzg &= -17;
            this.zzm = 0;
        }

        public static zzk zzg(ByteBuffer byteBuffer) throws zzibg {
            return (zzk) zziar.zzbR(zzn, byteBuffer);
        }

        public static zzk zzh(ByteBuffer byteBuffer, zziab zziabVar) throws zzibg {
            return (zzk) zziar.zzbQ(zzn, byteBuffer, zziabVar);
        }

        public static zzk zzi(zzhzl zzhzlVar) throws zzibg {
            return (zzk) zziar.zzbS(zzn, zzhzlVar);
        }

        public static zzk zzj(zzhzl zzhzlVar, zziab zziabVar) throws zzibg {
            return (zzk) zziar.zzbT(zzn, zzhzlVar, zziabVar);
        }

        public static zzk zzm(byte[] bArr) throws zzibg {
            return (zzk) zziar.zzbU(zzn, bArr);
        }

        public static zzk zzn(byte[] bArr, zziab zziabVar) throws zzibg {
            return (zzk) zziar.zzbV(zzn, bArr, zziabVar);
        }

        public static zzk zzo(InputStream inputStream) throws IOException {
            return (zzk) zziar.zzbW(zzn, inputStream);
        }

        public static zzk zzp(InputStream inputStream, zziab zziabVar) throws IOException {
            return (zzk) zziar.zzbX(zzn, inputStream, zziabVar);
        }

        public static zzk zzs(InputStream inputStream) throws IOException {
            return (zzk) zziar.zzca(zzn, inputStream);
        }

        public static zzk zzt(InputStream inputStream, zziab zziabVar) throws IOException {
            return (zzk) zziar.zzcb(zzn, inputStream, zziabVar);
        }

        public static zzk zzu(zzhzq zzhzqVar) throws IOException {
            return (zzk) zziar.zzbY(zzn, zzhzqVar);
        }

        public static zzk zzv(zzhzq zzhzqVar, zziab zziabVar) throws IOException {
            return (zzk) zziar.zzbZ(zzn, zzhzqVar, zziabVar);
        }

        public static zza zzz() {
            return (zza) zzn.zzbn();
        }

        @Override // com.google.android.gms.internal.ads.zzbfp.zzl
        public boolean zzI() {
            return (this.zzg & 16) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbfp.zzl
        public int zzJ() {
            return this.zzm;
        }

        @Override // com.google.android.gms.internal.ads.zzbfp.zzl
        public boolean zza() {
            return (this.zzg & 1) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbfp.zzl
        public int zzb() {
            return this.zzh;
        }

        public List<? extends zzaq> zzc() {
            return this.zzl;
        }

        public zzaq zzd(int i2) {
            return this.zzl.get(i2);
        }

        @Override // com.google.android.gms.internal.ads.zziar
        public final Object zzdc(zziaq zziaqVar, Object obj, Object obj2) {
            zzick zziamVar;
            int iOrdinal = zziaqVar.ordinal();
            if (iOrdinal == 0) {
                return (byte) 1;
            }
            if (iOrdinal == 2) {
                return zziar.zzbv(zzn, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001င\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003\u0005\u001b\u0006င\u0004", new Object[]{"zzg", "zzh", "zzi", "zzj", "zzk", "zzl", zzap.class, "zzm"});
            }
            if (iOrdinal == 3) {
                return new zzk();
            }
            byte[] bArr = null;
            if (iOrdinal == 4) {
                return new zza(bArr);
            }
            if (iOrdinal == 5) {
                return zzn;
            }
            if (iOrdinal != 6) {
                throw null;
            }
            zzick<zzk> zzickVar = zzo;
            if (zzickVar != null) {
                return zzickVar;
            }
            synchronized (zzk.class) {
                try {
                    zziamVar = zzo;
                    if (zziamVar == null) {
                        zziamVar = new zziam(zzn);
                        zzo = zziamVar;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return zziamVar;
        }

        @Override // com.google.android.gms.internal.ads.zzbfp.zzl
        public boolean zze() {
            return (this.zzg & 2) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbfp.zzl
        public zzap zzf() {
            zzap zzapVar = this.zzi;
            return zzapVar == null ? zzap.zzs() : zzapVar;
        }

        @Override // com.google.android.gms.internal.ads.zzbfp.zzl
        public boolean zzk() {
            return (this.zzg & 4) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbfp.zzl
        public zzap zzl() {
            zzap zzapVar = this.zzj;
            return zzapVar == null ? zzap.zzs() : zzapVar;
        }

        @Override // com.google.android.gms.internal.ads.zzbfp.zzl
        public boolean zzq() {
            return (this.zzg & 8) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbfp.zzl
        public zzap zzr() {
            zzap zzapVar = this.zzk;
            return zzapVar == null ? zzap.zzs() : zzapVar;
        }

        @Override // com.google.android.gms.internal.ads.zzbfp.zzl
        public List<zzap> zzw() {
            return this.zzl;
        }

        @Override // com.google.android.gms.internal.ads.zzbfp.zzl
        public int zzx() {
            return this.zzl.size();
        }

        @Override // com.google.android.gms.internal.ads.zzbfp.zzl
        public zzap zzy(int i2) {
            return this.zzl.get(i2);
        }
    }

    public interface zzl extends zzicd {
        boolean zzI();

        int zzJ();

        boolean zza();

        int zzb();

        boolean zze();

        zzap zzf();

        boolean zzk();

        zzap zzl();

        boolean zzq();

        zzap zzr();

        List<zzap> zzw();

        int zzx();

        zzap zzy(int i2);
    }

    public final class zzm extends zziar<zzm, zza> implements zzn {
        public static final int zza = 1;
        public static final int zzb = 2;
        public static final int zzc = 3;
        public static final int zzd = 4;
        public static final int zze = 5;
        public static final int zzf = 6;
        public static final int zzg = 7;
        public static final int zzh = 8;
        private static final zzm zzv;
        private static volatile zzick<zzm> zzw;
        private int zzi;
        private zzap zzk;
        private int zzl;
        private zzar zzm;
        private int zzn;
        private String zzj = "";
        private int zzo = 1000;
        private int zzp = 1000;
        private int zzu = 1000;

        public final class zza extends zzial<zzm, zza> implements zzn {
            public /* synthetic */ zza(byte[] bArr) {
                this();
            }

            @Override // com.google.android.gms.internal.ads.zzbfp.zzn
            public boolean zzA() {
                return ((zzm) this.zza).zzA();
            }

            @Override // com.google.android.gms.internal.ads.zzbfp.zzn
            public zzq zzB() {
                return ((zzm) this.zza).zzB();
            }

            public zza zzC(zzq zzqVar) {
                zzbg();
                ((zzm) this.zza).zzV(zzqVar);
                return this;
            }

            public zza zzD() {
                zzbg();
                ((zzm) this.zza).zzW();
                return this;
            }

            @Override // com.google.android.gms.internal.ads.zzbfp.zzn
            public boolean zzE() {
                return ((zzm) this.zza).zzE();
            }

            @Override // com.google.android.gms.internal.ads.zzbfp.zzn
            public zzq zzF() {
                return ((zzm) this.zza).zzF();
            }

            public zza zzG(zzq zzqVar) {
                zzbg();
                ((zzm) this.zza).zzX(zzqVar);
                return this;
            }

            public zza zzH() {
                zzbg();
                ((zzm) this.zza).zzY();
                return this;
            }

            @Override // com.google.android.gms.internal.ads.zzbfp.zzn
            public boolean zzI() {
                return ((zzm) this.zza).zzI();
            }

            @Override // com.google.android.gms.internal.ads.zzbfp.zzn
            public zzq zzJ() {
                return ((zzm) this.zza).zzJ();
            }

            public zza zzK(zzq zzqVar) {
                zzbg();
                ((zzm) this.zza).zzZ(zzqVar);
                return this;
            }

            public zza zzL() {
                zzbg();
                ((zzm) this.zza).zzaa();
                return this;
            }

            @Override // com.google.android.gms.internal.ads.zzbfp.zzn
            public boolean zza() {
                return ((zzm) this.zza).zza();
            }

            @Override // com.google.android.gms.internal.ads.zzbfp.zzn
            public String zzb() {
                return ((zzm) this.zza).zzb();
            }

            @Override // com.google.android.gms.internal.ads.zzbfp.zzn
            public zzhzl zzc() {
                return ((zzm) this.zza).zzc();
            }

            public zza zzd(String str) {
                zzbg();
                ((zzm) this.zza).zzG(str);
                return this;
            }

            public zza zze() {
                zzbg();
                ((zzm) this.zza).zzH();
                return this;
            }

            public zza zzf(zzhzl zzhzlVar) {
                zzbg();
                ((zzm) this.zza).zzK(zzhzlVar);
                return this;
            }

            @Override // com.google.android.gms.internal.ads.zzbfp.zzn
            public boolean zzg() {
                return ((zzm) this.zza).zzg();
            }

            @Override // com.google.android.gms.internal.ads.zzbfp.zzn
            public zzap zzh() {
                return ((zzm) this.zza).zzh();
            }

            public zza zzi(zzap zzapVar) {
                zzbg();
                ((zzm) this.zza).zzL(zzapVar);
                return this;
            }

            public zza zzj(zzap.zza zzaVar) {
                zzbg();
                ((zzm) this.zza).zzL(zzaVar.zzbu());
                return this;
            }

            public zza zzk(zzap zzapVar) {
                zzbg();
                ((zzm) this.zza).zzM(zzapVar);
                return this;
            }

            public zza zzl() {
                zzbg();
                ((zzm) this.zza).zzN();
                return this;
            }

            @Override // com.google.android.gms.internal.ads.zzbfp.zzn
            public boolean zzm() {
                return ((zzm) this.zza).zzm();
            }

            @Override // com.google.android.gms.internal.ads.zzbfp.zzn
            public int zzn() {
                return ((zzm) this.zza).zzn();
            }

            public zza zzo(int i2) {
                zzbg();
                ((zzm) this.zza).zzO(i2);
                return this;
            }

            public zza zzp() {
                zzbg();
                ((zzm) this.zza).zzP();
                return this;
            }

            @Override // com.google.android.gms.internal.ads.zzbfp.zzn
            public boolean zzq() {
                return ((zzm) this.zza).zzq();
            }

            @Override // com.google.android.gms.internal.ads.zzbfp.zzn
            public zzar zzr() {
                return ((zzm) this.zza).zzr();
            }

            public zza zzs(zzar zzarVar) {
                zzbg();
                ((zzm) this.zza).zzQ(zzarVar);
                return this;
            }

            public zza zzt(zzar.zza zzaVar) {
                zzbg();
                ((zzm) this.zza).zzQ(zzaVar.zzbu());
                return this;
            }

            public zza zzu(zzar zzarVar) {
                zzbg();
                ((zzm) this.zza).zzR(zzarVar);
                return this;
            }

            public zza zzv() {
                zzbg();
                ((zzm) this.zza).zzS();
                return this;
            }

            @Override // com.google.android.gms.internal.ads.zzbfp.zzn
            public boolean zzw() {
                return ((zzm) this.zza).zzw();
            }

            @Override // com.google.android.gms.internal.ads.zzbfp.zzn
            public int zzx() {
                return ((zzm) this.zza).zzx();
            }

            public zza zzy(int i2) {
                zzbg();
                ((zzm) this.zza).zzT(i2);
                return this;
            }

            public zza zzz() {
                zzbg();
                ((zzm) this.zza).zzU();
                return this;
            }

            private zza() {
                super(zzm.zzv);
            }
        }

        static {
            zzm zzmVar = new zzm();
            zzv = zzmVar;
            zziar.zzbu(zzm.class, zzmVar);
        }

        private zzm() {
        }

        public static zzm zzC() {
            return zzv;
        }

        public static zzick<zzm> zzD() {
            return zzv.zzbd();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzac, reason: merged with bridge method [inline-methods] */
        public void zzG(String str) {
            str.getClass();
            this.zzi |= 1;
            this.zzj = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzad, reason: merged with bridge method [inline-methods] */
        public void zzH() {
            this.zzi &= -2;
            this.zzj = zzC().zzb();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzae, reason: merged with bridge method [inline-methods] */
        public void zzK(zzhzl zzhzlVar) {
            this.zzj = zzhzlVar.zzz();
            this.zzi |= 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzaf, reason: merged with bridge method [inline-methods] */
        public void zzL(zzap zzapVar) {
            zzapVar.getClass();
            this.zzk = zzapVar;
            this.zzi |= 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzag, reason: merged with bridge method [inline-methods] */
        public void zzM(zzap zzapVar) {
            zzapVar.getClass();
            zzap zzapVar2 = this.zzk;
            if (zzapVar2 != null && zzapVar2 != zzap.zzs()) {
                zzap.zza zzaVarZzr = zzap.zzr(zzapVar2);
                zzaVarZzr.zzbo(zzapVar);
                zzapVar = zzaVarZzr.zzbt();
            }
            this.zzk = zzapVar;
            this.zzi |= 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzah, reason: merged with bridge method [inline-methods] */
        public void zzN() {
            this.zzk = null;
            this.zzi &= -3;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzai, reason: merged with bridge method [inline-methods] */
        public void zzO(int i2) {
            this.zzi |= 4;
            this.zzl = i2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzaj, reason: merged with bridge method [inline-methods] */
        public void zzP() {
            this.zzi &= -5;
            this.zzl = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzak, reason: merged with bridge method [inline-methods] */
        public void zzQ(zzar zzarVar) {
            zzarVar.getClass();
            this.zzm = zzarVar;
            this.zzi |= 8;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzal, reason: merged with bridge method [inline-methods] */
        public void zzR(zzar zzarVar) {
            zzarVar.getClass();
            zzar zzarVar2 = this.zzm;
            if (zzarVar2 != null && zzarVar2 != zzar.zzu()) {
                zzar.zza zzaVarZzt = zzar.zzt(zzarVar2);
                zzaVarZzt.zzbo(zzarVar);
                zzarVar = zzaVarZzt.zzbt();
            }
            this.zzm = zzarVar;
            this.zzi |= 8;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzam, reason: merged with bridge method [inline-methods] */
        public void zzS() {
            this.zzm = null;
            this.zzi &= -9;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzan, reason: merged with bridge method [inline-methods] */
        public void zzT(int i2) {
            this.zzi |= 16;
            this.zzn = i2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzao, reason: merged with bridge method [inline-methods] */
        public void zzU() {
            this.zzi &= -17;
            this.zzn = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzap, reason: merged with bridge method [inline-methods] */
        public void zzV(zzq zzqVar) {
            this.zzo = zzqVar.zza();
            this.zzi |= 32;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzaq, reason: merged with bridge method [inline-methods] */
        public void zzW() {
            this.zzi &= -33;
            this.zzo = 1000;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzar, reason: merged with bridge method [inline-methods] */
        public void zzX(zzq zzqVar) {
            this.zzp = zzqVar.zza();
            this.zzi |= 64;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzas, reason: merged with bridge method [inline-methods] */
        public void zzY() {
            this.zzi &= -65;
            this.zzp = 1000;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzat, reason: merged with bridge method [inline-methods] */
        public void zzZ(zzq zzqVar) {
            this.zzu = zzqVar.zza();
            this.zzi |= 128;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzau, reason: merged with bridge method [inline-methods] */
        public void zzaa() {
            this.zzi &= -129;
            this.zzu = 1000;
        }

        public static zzm zzd(ByteBuffer byteBuffer) throws zzibg {
            return (zzm) zziar.zzbR(zzv, byteBuffer);
        }

        public static zzm zze(ByteBuffer byteBuffer, zziab zziabVar) throws zzibg {
            return (zzm) zziar.zzbQ(zzv, byteBuffer, zziabVar);
        }

        public static zzm zzi(zzhzl zzhzlVar) throws zzibg {
            return (zzm) zziar.zzbS(zzv, zzhzlVar);
        }

        public static zzm zzj(zzhzl zzhzlVar, zziab zziabVar) throws zzibg {
            return (zzm) zziar.zzbT(zzv, zzhzlVar, zziabVar);
        }

        public static zzm zzk(byte[] bArr) throws zzibg {
            return (zzm) zziar.zzbU(zzv, bArr);
        }

        public static zzm zzl(byte[] bArr, zziab zziabVar) throws zzibg {
            return (zzm) zziar.zzbV(zzv, bArr, zziabVar);
        }

        public static zzm zzo(InputStream inputStream) throws IOException {
            return (zzm) zziar.zzbW(zzv, inputStream);
        }

        public static zzm zzp(InputStream inputStream, zziab zziabVar) throws IOException {
            return (zzm) zziar.zzbX(zzv, inputStream, zziabVar);
        }

        public static zzm zzs(InputStream inputStream) throws IOException {
            return (zzm) zziar.zzca(zzv, inputStream);
        }

        public static zzm zzt(InputStream inputStream, zziab zziabVar) throws IOException {
            return (zzm) zziar.zzcb(zzv, inputStream, zziabVar);
        }

        public static zzm zzu(zzhzq zzhzqVar) throws IOException {
            return (zzm) zziar.zzbY(zzv, zzhzqVar);
        }

        public static zzm zzv(zzhzq zzhzqVar, zziab zziabVar) throws IOException {
            return (zzm) zziar.zzbZ(zzv, zzhzqVar, zziabVar);
        }

        public static zza zzy() {
            return (zza) zzv.zzbn();
        }

        public static zza zzz(zzm zzmVar) {
            return (zza) zzv.zzbo(zzmVar);
        }

        @Override // com.google.android.gms.internal.ads.zzbfp.zzn
        public boolean zzA() {
            return (this.zzi & 32) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbfp.zzn
        public zzq zzB() {
            zzq zzqVarZzc = zzq.zzc(this.zzo);
            return zzqVarZzc == null ? zzq.ENUM_UNKNOWN : zzqVarZzc;
        }

        @Override // com.google.android.gms.internal.ads.zzbfp.zzn
        public boolean zzE() {
            return (this.zzi & 64) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbfp.zzn
        public zzq zzF() {
            zzq zzqVarZzc = zzq.zzc(this.zzp);
            return zzqVarZzc == null ? zzq.ENUM_UNKNOWN : zzqVarZzc;
        }

        @Override // com.google.android.gms.internal.ads.zzbfp.zzn
        public boolean zzI() {
            return (this.zzi & 128) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbfp.zzn
        public zzq zzJ() {
            zzq zzqVarZzc = zzq.zzc(this.zzu);
            return zzqVarZzc == null ? zzq.ENUM_UNKNOWN : zzqVarZzc;
        }

        @Override // com.google.android.gms.internal.ads.zzbfp.zzn
        public boolean zza() {
            return (this.zzi & 1) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbfp.zzn
        public String zzb() {
            return this.zzj;
        }

        @Override // com.google.android.gms.internal.ads.zzbfp.zzn
        public zzhzl zzc() {
            return zzhzl.zzv(this.zzj);
        }

        @Override // com.google.android.gms.internal.ads.zziar
        public final Object zzdc(zziaq zziaqVar, Object obj, Object obj2) {
            zzick zziamVar;
            int iOrdinal = zziaqVar.ordinal();
            if (iOrdinal == 0) {
                return (byte) 1;
            }
            if (iOrdinal == 2) {
                return zziar.zzbv(zzv, "\u0004\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဉ\u0001\u0003င\u0002\u0004ဉ\u0003\u0005င\u0004\u0006᠌\u0005\u0007᠌\u0006\b᠌\u0007", new Object[]{"zzi", "zzj", "zzk", "zzl", "zzm", "zzn", "zzo", zzq.zze(), "zzp", zzq.zze(), "zzu", zzq.zze()});
            }
            if (iOrdinal == 3) {
                return new zzm();
            }
            byte[] bArr = null;
            if (iOrdinal == 4) {
                return new zza(bArr);
            }
            if (iOrdinal == 5) {
                return zzv;
            }
            if (iOrdinal != 6) {
                throw null;
            }
            zzick<zzm> zzickVar = zzw;
            if (zzickVar != null) {
                return zzickVar;
            }
            synchronized (zzm.class) {
                try {
                    zziamVar = zzw;
                    if (zziamVar == null) {
                        zziamVar = new zziam(zzv);
                        zzw = zziamVar;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return zziamVar;
        }

        @Override // com.google.android.gms.internal.ads.zzbfp.zzn
        public boolean zzg() {
            return (this.zzi & 2) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbfp.zzn
        public zzap zzh() {
            zzap zzapVar = this.zzk;
            return zzapVar == null ? zzap.zzs() : zzapVar;
        }

        @Override // com.google.android.gms.internal.ads.zzbfp.zzn
        public boolean zzm() {
            return (this.zzi & 4) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbfp.zzn
        public int zzn() {
            return this.zzl;
        }

        @Override // com.google.android.gms.internal.ads.zzbfp.zzn
        public boolean zzq() {
            return (this.zzi & 8) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbfp.zzn
        public zzar zzr() {
            zzar zzarVar = this.zzm;
            return zzarVar == null ? zzar.zzu() : zzarVar;
        }

        @Override // com.google.android.gms.internal.ads.zzbfp.zzn
        public boolean zzw() {
            return (this.zzi & 16) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbfp.zzn
        public int zzx() {
            return this.zzn;
        }
    }

    public interface zzn extends zzicd {
        boolean zzA();

        zzq zzB();

        boolean zzE();

        zzq zzF();

        boolean zzI();

        zzq zzJ();

        boolean zza();

        String zzb();

        zzhzl zzc();

        boolean zzg();

        zzap zzh();

        boolean zzm();

        int zzn();

        boolean zzq();

        zzar zzr();

        boolean zzw();

        int zzx();
    }

    public final class zzo extends zziar<zzo, zza> implements zzp {
        public static final int zza = 5;
        public static final int zzb = 6;
        public static final int zzc = 7;
        public static final int zzd = 8;
        private static final zzo zzj;
        private static volatile zzick<zzo> zzk;
        private int zze;
        private int zzf;
        private zzar zzg;
        private String zzh = "";
        private String zzi = "";

        public final class zza extends zzial<zzo, zza> implements zzp {
            public /* synthetic */ zza(byte[] bArr) {
                this();
            }

            @Override // com.google.android.gms.internal.ads.zzbfp.zzp
            public boolean zza() {
                return ((zzo) this.zza).zza();
            }

            @Override // com.google.android.gms.internal.ads.zzbfp.zzp
            public zzb zzb() {
                return ((zzo) this.zza).zzb();
            }

            public zza zzc(zzb zzbVar) {
                zzbg();
                ((zzo) this.zza).zzA(zzbVar);
                return this;
            }

            public zza zzd() {
                zzbg();
                ((zzo) this.zza).zzB();
                return this;
            }

            @Override // com.google.android.gms.internal.ads.zzbfp.zzp
            public boolean zze() {
                return ((zzo) this.zza).zze();
            }

            @Override // com.google.android.gms.internal.ads.zzbfp.zzp
            public zzar zzf() {
                return ((zzo) this.zza).zzf();
            }

            public zza zzg(zzar zzarVar) {
                zzbg();
                ((zzo) this.zza).zzC(zzarVar);
                return this;
            }

            public zza zzh(zzar.zza zzaVar) {
                zzbg();
                ((zzo) this.zza).zzC(zzaVar.zzbu());
                return this;
            }

            public zza zzi(zzar zzarVar) {
                zzbg();
                ((zzo) this.zza).zzD(zzarVar);
                return this;
            }

            public zza zzj() {
                zzbg();
                ((zzo) this.zza).zzE();
                return this;
            }

            @Override // com.google.android.gms.internal.ads.zzbfp.zzp
            public boolean zzk() {
                return ((zzo) this.zza).zzk();
            }

            @Override // com.google.android.gms.internal.ads.zzbfp.zzp
            public String zzl() {
                return ((zzo) this.zza).zzl();
            }

            @Override // com.google.android.gms.internal.ads.zzbfp.zzp
            public zzhzl zzm() {
                return ((zzo) this.zza).zzm();
            }

            public zza zzn(String str) {
                zzbg();
                ((zzo) this.zza).zzF(str);
                return this;
            }

            public zza zzo() {
                zzbg();
                ((zzo) this.zza).zzG();
                return this;
            }

            public zza zzp(zzhzl zzhzlVar) {
                zzbg();
                ((zzo) this.zza).zzH(zzhzlVar);
                return this;
            }

            @Override // com.google.android.gms.internal.ads.zzbfp.zzp
            public boolean zzq() {
                return ((zzo) this.zza).zzq();
            }

            @Override // com.google.android.gms.internal.ads.zzbfp.zzp
            public String zzr() {
                return ((zzo) this.zza).zzr();
            }

            @Override // com.google.android.gms.internal.ads.zzbfp.zzp
            public zzhzl zzs() {
                return ((zzo) this.zza).zzs();
            }

            public zza zzt(String str) {
                zzbg();
                ((zzo) this.zza).zzI(str);
                return this;
            }

            public zza zzu() {
                zzbg();
                ((zzo) this.zza).zzJ();
                return this;
            }

            public zza zzv(zzhzl zzhzlVar) {
                zzbg();
                ((zzo) this.zza).zzK(zzhzlVar);
                return this;
            }

            private zza() {
                super(zzo.zzj);
            }
        }

        public enum zzb implements zziav {
            PLATFORM_UNSPECIFIED(0),
            IOS(1),
            ANDROID(2);

            public static final int zzd = 0;
            public static final int zze = 1;
            public static final int zzf = 2;
            private static final zziaw<zzb> zzg = new zziaw<zzb>() { // from class: com.google.android.gms.internal.ads.zzbfp.zzo.zzb.1
                /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
                public zzb zzb(int i2) {
                    return zzb.zzc(i2);
                }
            };
            private final int zzh;

            final class zza implements zziax {
                static final zziax zza = new zza();

                private zza() {
                }

                @Override // com.google.android.gms.internal.ads.zziax
                public boolean zza(int i2) {
                    return zzb.zzc(i2) != null;
                }
            }

            zzb(int i2) {
                this.zzh = i2;
            }

            public static zzb zzc(int i2) {
                if (i2 == 0) {
                    return PLATFORM_UNSPECIFIED;
                }
                if (i2 == 1) {
                    return IOS;
                }
                if (i2 != 2) {
                    return null;
                }
                return ANDROID;
            }

            public static zziaw<zzb> zzd() {
                return zzg;
            }

            public static zziax zze() {
                return zza.zza;
            }

            @Override // java.lang.Enum
            public final String toString() {
                return Integer.toString(this.zzh);
            }

            @Override // com.google.android.gms.internal.ads.zziav
            public final int zza() {
                return this.zzh;
            }
        }

        static {
            zzo zzoVar = new zzo();
            zzj = zzoVar;
            zziar.zzbu(zzo.class, zzoVar);
        }

        private zzo() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzM, reason: merged with bridge method [inline-methods] */
        public void zzA(zzb zzbVar) {
            this.zzf = zzbVar.zza();
            this.zze |= 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzN, reason: merged with bridge method [inline-methods] */
        public void zzB() {
            this.zze &= -2;
            this.zzf = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzO, reason: merged with bridge method [inline-methods] */
        public void zzC(zzar zzarVar) {
            zzarVar.getClass();
            this.zzg = zzarVar;
            this.zze |= 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzP, reason: merged with bridge method [inline-methods] */
        public void zzD(zzar zzarVar) {
            zzarVar.getClass();
            zzar zzarVar2 = this.zzg;
            if (zzarVar2 != null && zzarVar2 != zzar.zzu()) {
                zzar.zza zzaVarZzt = zzar.zzt(zzarVar2);
                zzaVarZzt.zzbo(zzarVar);
                zzarVar = zzaVarZzt.zzbt();
            }
            this.zzg = zzarVar;
            this.zze |= 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzQ, reason: merged with bridge method [inline-methods] */
        public void zzE() {
            this.zzg = null;
            this.zze &= -3;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzR, reason: merged with bridge method [inline-methods] */
        public void zzF(String str) {
            str.getClass();
            this.zze |= 4;
            this.zzh = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzS, reason: merged with bridge method [inline-methods] */
        public void zzG() {
            this.zze &= -5;
            this.zzh = zzy().zzl();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzT, reason: merged with bridge method [inline-methods] */
        public void zzH(zzhzl zzhzlVar) {
            this.zzh = zzhzlVar.zzz();
            this.zze |= 4;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzU, reason: merged with bridge method [inline-methods] */
        public void zzI(String str) {
            str.getClass();
            this.zze |= 8;
            this.zzi = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzV, reason: merged with bridge method [inline-methods] */
        public void zzJ() {
            this.zze &= -9;
            this.zzi = zzy().zzr();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzW, reason: merged with bridge method [inline-methods] */
        public void zzK(zzhzl zzhzlVar) {
            this.zzi = zzhzlVar.zzz();
            this.zze |= 8;
        }

        public static zzo zzc(ByteBuffer byteBuffer) throws zzibg {
            return (zzo) zziar.zzbR(zzj, byteBuffer);
        }

        public static zzo zzd(ByteBuffer byteBuffer, zziab zziabVar) throws zzibg {
            return (zzo) zziar.zzbQ(zzj, byteBuffer, zziabVar);
        }

        public static zzo zzg(zzhzl zzhzlVar) throws zzibg {
            return (zzo) zziar.zzbS(zzj, zzhzlVar);
        }

        public static zzo zzh(zzhzl zzhzlVar, zziab zziabVar) throws zzibg {
            return (zzo) zziar.zzbT(zzj, zzhzlVar, zziabVar);
        }

        public static zzo zzi(byte[] bArr) throws zzibg {
            return (zzo) zziar.zzbU(zzj, bArr);
        }

        public static zzo zzj(byte[] bArr, zziab zziabVar) throws zzibg {
            return (zzo) zziar.zzbV(zzj, bArr, zziabVar);
        }

        public static zzo zzn(InputStream inputStream) throws IOException {
            return (zzo) zziar.zzbW(zzj, inputStream);
        }

        public static zzo zzo(InputStream inputStream, zziab zziabVar) throws IOException {
            return (zzo) zziar.zzbX(zzj, inputStream, zziabVar);
        }

        public static zzo zzp(InputStream inputStream) throws IOException {
            return (zzo) zziar.zzca(zzj, inputStream);
        }

        public static zzo zzt(InputStream inputStream, zziab zziabVar) throws IOException {
            return (zzo) zziar.zzcb(zzj, inputStream, zziabVar);
        }

        public static zzo zzu(zzhzq zzhzqVar) throws IOException {
            return (zzo) zziar.zzbY(zzj, zzhzqVar);
        }

        public static zzo zzv(zzhzq zzhzqVar, zziab zziabVar) throws IOException {
            return (zzo) zziar.zzbZ(zzj, zzhzqVar, zziabVar);
        }

        public static zza zzw() {
            return (zza) zzj.zzbn();
        }

        public static zza zzx(zzo zzoVar) {
            return (zza) zzj.zzbo(zzoVar);
        }

        public static zzo zzy() {
            return zzj;
        }

        public static zzick<zzo> zzz() {
            return zzj.zzbd();
        }

        @Override // com.google.android.gms.internal.ads.zzbfp.zzp
        public boolean zza() {
            return (this.zze & 1) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbfp.zzp
        public zzb zzb() {
            zzb zzbVarZzc = zzb.zzc(this.zzf);
            return zzbVarZzc == null ? zzb.PLATFORM_UNSPECIFIED : zzbVarZzc;
        }

        @Override // com.google.android.gms.internal.ads.zziar
        public final Object zzdc(zziaq zziaqVar, Object obj, Object obj2) {
            zzick zziamVar;
            int iOrdinal = zziaqVar.ordinal();
            if (iOrdinal == 0) {
                return (byte) 1;
            }
            if (iOrdinal == 2) {
                return zziar.zzbv(zzj, "\u0004\u0004\u0000\u0001\u0005\b\u0004\u0000\u0000\u0000\u0005᠌\u0000\u0006ဉ\u0001\u0007ဈ\u0002\bဈ\u0003", new Object[]{"zze", "zzf", zzb.zze(), "zzg", "zzh", "zzi"});
            }
            if (iOrdinal == 3) {
                return new zzo();
            }
            byte[] bArr = null;
            if (iOrdinal == 4) {
                return new zza(bArr);
            }
            if (iOrdinal == 5) {
                return zzj;
            }
            if (iOrdinal != 6) {
                throw null;
            }
            zzick<zzo> zzickVar = zzk;
            if (zzickVar != null) {
                return zzickVar;
            }
            synchronized (zzo.class) {
                try {
                    zziamVar = zzk;
                    if (zziamVar == null) {
                        zziamVar = new zziam(zzj);
                        zzk = zziamVar;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return zziamVar;
        }

        @Override // com.google.android.gms.internal.ads.zzbfp.zzp
        public boolean zze() {
            return (this.zze & 2) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbfp.zzp
        public zzar zzf() {
            zzar zzarVar = this.zzg;
            return zzarVar == null ? zzar.zzu() : zzarVar;
        }

        @Override // com.google.android.gms.internal.ads.zzbfp.zzp
        public boolean zzk() {
            return (this.zze & 4) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbfp.zzp
        public String zzl() {
            return this.zzh;
        }

        @Override // com.google.android.gms.internal.ads.zzbfp.zzp
        public zzhzl zzm() {
            return zzhzl.zzv(this.zzh);
        }

        @Override // com.google.android.gms.internal.ads.zzbfp.zzp
        public boolean zzq() {
            return (this.zze & 8) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbfp.zzp
        public String zzr() {
            return this.zzi;
        }

        @Override // com.google.android.gms.internal.ads.zzbfp.zzp
        public zzhzl zzs() {
            return zzhzl.zzv(this.zzi);
        }
    }

    public interface zzp extends zzicd {
        boolean zza();

        zzo.zzb zzb();

        boolean zze();

        zzar zzf();

        boolean zzk();

        String zzl();

        zzhzl zzm();

        boolean zzq();

        String zzr();

        zzhzl zzs();
    }

    public enum zzq implements zziav {
        ENUM_FALSE(0),
        ENUM_TRUE(1),
        ENUM_UNKNOWN(1000);

        public static final int zzd = 0;
        public static final int zze = 1;
        public static final int zzf = 1000;
        private static final zziaw<zzq> zzg = new zziaw<zzq>() { // from class: com.google.android.gms.internal.ads.zzbfp.zzq.1
            /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
            public zzq zzb(int i2) {
                return zzq.zzc(i2);
            }
        };
        private final int zzh;

        final class zza implements zziax {
            static final zziax zza = new zza();

            private zza() {
            }

            @Override // com.google.android.gms.internal.ads.zziax
            public boolean zza(int i2) {
                return zzq.zzc(i2) != null;
            }
        }

        zzq(int i2) {
            this.zzh = i2;
        }

        public static zzq zzc(int i2) {
            if (i2 == 0) {
                return ENUM_FALSE;
            }
            if (i2 == 1) {
                return ENUM_TRUE;
            }
            if (i2 != 1000) {
                return null;
            }
            return ENUM_UNKNOWN;
        }

        public static zziaw<zzq> zzd() {
            return zzg;
        }

        public static zziax zze() {
            return zza.zza;
        }

        @Override // java.lang.Enum
        public final String toString() {
            return Integer.toString(this.zzh);
        }

        @Override // com.google.android.gms.internal.ads.zziav
        public final int zza() {
            return this.zzh;
        }
    }

    public final class zzr extends zziar<zzr, zza> implements zzs {
        private static final zzr zzB;
        private static volatile zzick<zzr> zzC = null;
        public static final int zza = 7;
        public static final int zzb = 8;
        public static final int zzc = 9;
        public static final int zzd = 10;
        public static final int zze = 11;
        public static final int zzf = 12;
        public static final int zzg = 13;
        public static final int zzh = 14;
        public static final int zzi = 15;
        public static final int zzj = 16;
        private int zzk;
        private int zzl;
        private zzar zzn;
        private int zzo;
        private int zzv;
        private int zzw;
        private static final zziba<zzd.zza> zzy = new zziba<zzd.zza>() { // from class: com.google.android.gms.internal.ads.zzbfp.zzr.1
            @Override // com.google.android.gms.internal.ads.zziba
            /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
            public zzd.zza zzb(int i2) {
                zzd.zza zzaVarZzc = zzd.zza.zzc(i2);
                return zzaVarZzc == null ? zzd.zza.AD_FORMAT_TYPE_UNSPECIFIED : zzaVarZzc;
            }
        };
        private static final zziba<zzd.zza> zzA = new zziba<zzd.zza>() { // from class: com.google.android.gms.internal.ads.zzbfp.zzr.2
            @Override // com.google.android.gms.internal.ads.zziba
            /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
            public zzd.zza zzb(int i2) {
                zzd.zza zzaVarZzc = zzd.zza.zzc(i2);
                return zzaVarZzc == null ? zzd.zza.AD_FORMAT_TYPE_UNSPECIFIED : zzaVarZzc;
            }
        };
        private String zzm = "";
        private String zzp = "";
        private String zzu = "";
        private zziaz zzx = zziar.zzbC();
        private zziaz zzz = zziar.zzbC();

        public final class zza extends zzial<zzr, zza> implements zzs {
            public /* synthetic */ zza(byte[] bArr) {
                this();
            }

            @Override // com.google.android.gms.internal.ads.zzbfp.zzs
            public boolean zzA() {
                return ((zzr) this.zza).zzA();
            }

            @Override // com.google.android.gms.internal.ads.zzbfp.zzs
            public String zzB() {
                return ((zzr) this.zza).zzB();
            }

            @Override // com.google.android.gms.internal.ads.zzbfp.zzs
            public zzhzl zzC() {
                return ((zzr) this.zza).zzC();
            }

            public zza zzD(String str) {
                zzbg();
                ((zzr) this.zza).zzac(str);
                return this;
            }

            public zza zzE() {
                zzbg();
                ((zzr) this.zza).zzad();
                return this;
            }

            public zza zzF(zzhzl zzhzlVar) {
                zzbg();
                ((zzr) this.zza).zzae(zzhzlVar);
                return this;
            }

            @Override // com.google.android.gms.internal.ads.zzbfp.zzs
            public boolean zzG() {
                return ((zzr) this.zza).zzG();
            }

            @Override // com.google.android.gms.internal.ads.zzbfp.zzs
            public zzab.zzc zzH() {
                return ((zzr) this.zza).zzH();
            }

            public zza zzI(zzab.zzc zzcVar) {
                zzbg();
                ((zzr) this.zza).zzaf(zzcVar);
                return this;
            }

            public zza zzJ() {
                zzbg();
                ((zzr) this.zza).zzag();
                return this;
            }

            @Override // com.google.android.gms.internal.ads.zzbfp.zzs
            public boolean zzK() {
                return ((zzr) this.zza).zzK();
            }

            @Override // com.google.android.gms.internal.ads.zzbfp.zzs
            public zza.EnumC0185zza zzL() {
                return ((zzr) this.zza).zzL();
            }

            public zza zzM(zza.EnumC0185zza enumC0185zza) {
                zzbg();
                ((zzr) this.zza).zzah(enumC0185zza);
                return this;
            }

            public zza zzN() {
                zzbg();
                ((zzr) this.zza).zzai();
                return this;
            }

            @Override // com.google.android.gms.internal.ads.zzbfp.zzs
            public List<zzd.zza> zzO() {
                return ((zzr) this.zza).zzO();
            }

            @Override // com.google.android.gms.internal.ads.zzbfp.zzs
            public int zzP() {
                return ((zzr) this.zza).zzP();
            }

            @Override // com.google.android.gms.internal.ads.zzbfp.zzs
            public zzd.zza zzQ(int i2) {
                return ((zzr) this.zza).zzQ(i2);
            }

            public zza zzR(int i2, zzd.zza zzaVar) {
                zzbg();
                ((zzr) this.zza).zzaj(i2, zzaVar);
                return this;
            }

            public zza zzS(zzd.zza zzaVar) {
                zzbg();
                ((zzr) this.zza).zzak(zzaVar);
                return this;
            }

            public zza zzT(Iterable<? extends zzd.zza> iterable) {
                zzbg();
                ((zzr) this.zza).zzal(iterable);
                return this;
            }

            public zza zzU() {
                zzbg();
                ((zzr) this.zza).zzam();
                return this;
            }

            @Override // com.google.android.gms.internal.ads.zzbfp.zzs
            public List<zzd.zza> zzV() {
                return ((zzr) this.zza).zzV();
            }

            @Override // com.google.android.gms.internal.ads.zzbfp.zzs
            public int zzW() {
                return ((zzr) this.zza).zzW();
            }

            @Override // com.google.android.gms.internal.ads.zzbfp.zzs
            public zzd.zza zzX(int i2) {
                return ((zzr) this.zza).zzX(i2);
            }

            public zza zzY(int i2, zzd.zza zzaVar) {
                zzbg();
                ((zzr) this.zza).zzan(i2, zzaVar);
                return this;
            }

            public zza zzZ(zzd.zza zzaVar) {
                zzbg();
                ((zzr) this.zza).zzao(zzaVar);
                return this;
            }

            @Override // com.google.android.gms.internal.ads.zzbfp.zzs
            public boolean zza() {
                return ((zzr) this.zza).zza();
            }

            public zza zzaa(Iterable<? extends zzd.zza> iterable) {
                zzbg();
                ((zzr) this.zza).zzap(iterable);
                return this;
            }

            public zza zzab() {
                zzbg();
                ((zzr) this.zza).zzaq();
                return this;
            }

            @Override // com.google.android.gms.internal.ads.zzbfp.zzs
            public int zzb() {
                return ((zzr) this.zza).zzb();
            }

            public zza zzc(int i2) {
                zzbg();
                ((zzr) this.zza).zzF(i2);
                return this;
            }

            public zza zzd() {
                zzbg();
                ((zzr) this.zza).zzI();
                return this;
            }

            @Override // com.google.android.gms.internal.ads.zzbfp.zzs
            public boolean zze() {
                return ((zzr) this.zza).zze();
            }

            @Override // com.google.android.gms.internal.ads.zzbfp.zzs
            public String zzf() {
                return ((zzr) this.zza).zzf();
            }

            @Override // com.google.android.gms.internal.ads.zzbfp.zzs
            public zzhzl zzg() {
                return ((zzr) this.zza).zzg();
            }

            public zza zzh(String str) {
                zzbg();
                ((zzr) this.zza).zzJ(str);
                return this;
            }

            public zza zzi() {
                zzbg();
                ((zzr) this.zza).zzM();
                return this;
            }

            public zza zzj(zzhzl zzhzlVar) {
                zzbg();
                ((zzr) this.zza).zzN(zzhzlVar);
                return this;
            }

            @Override // com.google.android.gms.internal.ads.zzbfp.zzs
            public boolean zzk() {
                return ((zzr) this.zza).zzk();
            }

            @Override // com.google.android.gms.internal.ads.zzbfp.zzs
            public zzar zzl() {
                return ((zzr) this.zza).zzl();
            }

            public zza zzm(zzar zzarVar) {
                zzbg();
                ((zzr) this.zza).zzR(zzarVar);
                return this;
            }

            public zza zzn(zzar.zza zzaVar) {
                zzbg();
                ((zzr) this.zza).zzR(zzaVar.zzbu());
                return this;
            }

            public zza zzo(zzar zzarVar) {
                zzbg();
                ((zzr) this.zza).zzS(zzarVar);
                return this;
            }

            public zza zzp() {
                zzbg();
                ((zzr) this.zza).zzT();
                return this;
            }

            @Override // com.google.android.gms.internal.ads.zzbfp.zzs
            public boolean zzq() {
                return ((zzr) this.zza).zzq();
            }

            @Override // com.google.android.gms.internal.ads.zzbfp.zzs
            public zzo.zzb zzr() {
                return ((zzr) this.zza).zzr();
            }

            public zza zzs(zzo.zzb zzbVar) {
                zzbg();
                ((zzr) this.zza).zzU(zzbVar);
                return this;
            }

            public zza zzt() {
                zzbg();
                ((zzr) this.zza).zzY();
                return this;
            }

            @Override // com.google.android.gms.internal.ads.zzbfp.zzs
            public boolean zzu() {
                return ((zzr) this.zza).zzu();
            }

            @Override // com.google.android.gms.internal.ads.zzbfp.zzs
            public String zzv() {
                return ((zzr) this.zza).zzv();
            }

            @Override // com.google.android.gms.internal.ads.zzbfp.zzs
            public zzhzl zzw() {
                return ((zzr) this.zza).zzw();
            }

            public zza zzx(String str) {
                zzbg();
                ((zzr) this.zza).zzZ(str);
                return this;
            }

            public zza zzy() {
                zzbg();
                ((zzr) this.zza).zzaa();
                return this;
            }

            public zza zzz(zzhzl zzhzlVar) {
                zzbg();
                ((zzr) this.zza).zzab(zzhzlVar);
                return this;
            }

            private zza() {
                super(zzr.zzB);
            }
        }

        static {
            zzr zzrVar = new zzr();
            zzB = zzrVar;
            zziar.zzbu(zzr.class, zzrVar);
        }

        private zzr() {
        }

        public static zzr zzD() {
            return zzB;
        }

        public static zzick<zzr> zzE() {
            return zzB.zzbd();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzaA, reason: merged with bridge method [inline-methods] */
        public void zzU(zzo.zzb zzbVar) {
            this.zzo = zzbVar.zza();
            this.zzk |= 8;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzaB, reason: merged with bridge method [inline-methods] */
        public void zzY() {
            this.zzk &= -9;
            this.zzo = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzaC, reason: merged with bridge method [inline-methods] */
        public void zzZ(String str) {
            str.getClass();
            this.zzk |= 16;
            this.zzp = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzaD, reason: merged with bridge method [inline-methods] */
        public void zzaa() {
            this.zzk &= -17;
            this.zzp = zzD().zzv();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzaE, reason: merged with bridge method [inline-methods] */
        public void zzab(zzhzl zzhzlVar) {
            this.zzp = zzhzlVar.zzz();
            this.zzk |= 16;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzaF, reason: merged with bridge method [inline-methods] */
        public void zzac(String str) {
            str.getClass();
            this.zzk |= 32;
            this.zzu = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzaG, reason: merged with bridge method [inline-methods] */
        public void zzad() {
            this.zzk &= -33;
            this.zzu = zzD().zzB();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzaH, reason: merged with bridge method [inline-methods] */
        public void zzae(zzhzl zzhzlVar) {
            this.zzu = zzhzlVar.zzz();
            this.zzk |= 32;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzaI, reason: merged with bridge method [inline-methods] */
        public void zzaf(zzab.zzc zzcVar) {
            this.zzv = zzcVar.zza();
            this.zzk |= 64;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzaJ, reason: merged with bridge method [inline-methods] */
        public void zzag() {
            this.zzk &= -65;
            this.zzv = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzaK, reason: merged with bridge method [inline-methods] */
        public void zzah(zza.EnumC0185zza enumC0185zza) {
            this.zzw = enumC0185zza.zza();
            this.zzk |= 128;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzaL, reason: merged with bridge method [inline-methods] */
        public void zzai() {
            this.zzk &= -129;
            this.zzw = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzas, reason: merged with bridge method [inline-methods] */
        public void zzF(int i2) {
            this.zzk |= 1;
            this.zzl = i2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzat, reason: merged with bridge method [inline-methods] */
        public void zzI() {
            this.zzk &= -2;
            this.zzl = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzau, reason: merged with bridge method [inline-methods] */
        public void zzJ(String str) {
            str.getClass();
            this.zzk |= 2;
            this.zzm = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzav, reason: merged with bridge method [inline-methods] */
        public void zzM() {
            this.zzk &= -3;
            this.zzm = zzD().zzf();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzaw, reason: merged with bridge method [inline-methods] */
        public void zzN(zzhzl zzhzlVar) {
            this.zzm = zzhzlVar.zzz();
            this.zzk |= 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzax, reason: merged with bridge method [inline-methods] */
        public void zzR(zzar zzarVar) {
            zzarVar.getClass();
            this.zzn = zzarVar;
            this.zzk |= 4;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzay, reason: merged with bridge method [inline-methods] */
        public void zzS(zzar zzarVar) {
            zzarVar.getClass();
            zzar zzarVar2 = this.zzn;
            if (zzarVar2 != null && zzarVar2 != zzar.zzu()) {
                zzar.zza zzaVarZzt = zzar.zzt(zzarVar2);
                zzaVarZzt.zzbo(zzarVar);
                zzarVar = zzaVarZzt.zzbt();
            }
            this.zzn = zzarVar;
            this.zzk |= 4;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzaz, reason: merged with bridge method [inline-methods] */
        public void zzT() {
            this.zzn = null;
            this.zzk &= -5;
        }

        public static zzr zzc(ByteBuffer byteBuffer) throws zzibg {
            return (zzr) zziar.zzbR(zzB, byteBuffer);
        }

        private void zzce() {
            zziaz zziazVar = this.zzx;
            if (zziazVar.zza()) {
                return;
            }
            this.zzx = zziar.zzbD(zziazVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzcf, reason: merged with bridge method [inline-methods] */
        public void zzaj(int i2, zzd.zza zzaVar) {
            zzaVar.getClass();
            zzce();
            this.zzx.zzg(i2, zzaVar.zza());
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzcg, reason: merged with bridge method [inline-methods] */
        public void zzak(zzd.zza zzaVar) {
            zzaVar.getClass();
            zzce();
            this.zzx.zzi(zzaVar.zza());
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzch, reason: merged with bridge method [inline-methods] */
        public void zzal(Iterable<? extends zzd.zza> iterable) {
            zzce();
            Iterator<? extends zzd.zza> it = iterable.iterator();
            while (it.hasNext()) {
                this.zzx.zzi(it.next().zza());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzci, reason: merged with bridge method [inline-methods] */
        public void zzam() {
            this.zzx = zziar.zzbC();
        }

        private void zzcj() {
            zziaz zziazVar = this.zzz;
            if (zziazVar.zza()) {
                return;
            }
            this.zzz = zziar.zzbD(zziazVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzck, reason: merged with bridge method [inline-methods] */
        public void zzan(int i2, zzd.zza zzaVar) {
            zzaVar.getClass();
            zzcj();
            this.zzz.zzg(i2, zzaVar.zza());
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzcl, reason: merged with bridge method [inline-methods] */
        public void zzao(zzd.zza zzaVar) {
            zzaVar.getClass();
            zzcj();
            this.zzz.zzi(zzaVar.zza());
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzcm, reason: merged with bridge method [inline-methods] */
        public void zzap(Iterable<? extends zzd.zza> iterable) {
            zzcj();
            Iterator<? extends zzd.zza> it = iterable.iterator();
            while (it.hasNext()) {
                this.zzz.zzi(it.next().zza());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzcn, reason: merged with bridge method [inline-methods] */
        public void zzaq() {
            this.zzz = zziar.zzbC();
        }

        public static zzr zzd(ByteBuffer byteBuffer, zziab zziabVar) throws zzibg {
            return (zzr) zziar.zzbQ(zzB, byteBuffer, zziabVar);
        }

        public static zzr zzh(zzhzl zzhzlVar) throws zzibg {
            return (zzr) zziar.zzbS(zzB, zzhzlVar);
        }

        public static zzr zzi(zzhzl zzhzlVar, zziab zziabVar) throws zzibg {
            return (zzr) zziar.zzbT(zzB, zzhzlVar, zziabVar);
        }

        public static zzr zzj(byte[] bArr) throws zzibg {
            return (zzr) zziar.zzbU(zzB, bArr);
        }

        public static zzr zzm(byte[] bArr, zziab zziabVar) throws zzibg {
            return (zzr) zziar.zzbV(zzB, bArr, zziabVar);
        }

        public static zzr zzn(InputStream inputStream) throws IOException {
            return (zzr) zziar.zzbW(zzB, inputStream);
        }

        public static zzr zzo(InputStream inputStream, zziab zziabVar) throws IOException {
            return (zzr) zziar.zzbX(zzB, inputStream, zziabVar);
        }

        public static zzr zzp(InputStream inputStream) throws IOException {
            return (zzr) zziar.zzca(zzB, inputStream);
        }

        public static zzr zzs(InputStream inputStream, zziab zziabVar) throws IOException {
            return (zzr) zziar.zzcb(zzB, inputStream, zziabVar);
        }

        public static zzr zzt(zzhzq zzhzqVar) throws IOException {
            return (zzr) zziar.zzbY(zzB, zzhzqVar);
        }

        public static zzr zzx(zzhzq zzhzqVar, zziab zziabVar) throws IOException {
            return (zzr) zziar.zzbZ(zzB, zzhzqVar, zziabVar);
        }

        public static zza zzy() {
            return (zza) zzB.zzbn();
        }

        public static zza zzz(zzr zzrVar) {
            return (zza) zzB.zzbo(zzrVar);
        }

        @Override // com.google.android.gms.internal.ads.zzbfp.zzs
        public boolean zzA() {
            return (this.zzk & 32) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbfp.zzs
        public String zzB() {
            return this.zzu;
        }

        @Override // com.google.android.gms.internal.ads.zzbfp.zzs
        public zzhzl zzC() {
            return zzhzl.zzv(this.zzu);
        }

        @Override // com.google.android.gms.internal.ads.zzbfp.zzs
        public boolean zzG() {
            return (this.zzk & 64) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbfp.zzs
        public zzab.zzc zzH() {
            zzab.zzc zzcVarZzc = zzab.zzc.zzc(this.zzv);
            return zzcVarZzc == null ? zzab.zzc.NETWORKTYPE_UNSPECIFIED : zzcVarZzc;
        }

        @Override // com.google.android.gms.internal.ads.zzbfp.zzs
        public boolean zzK() {
            return (this.zzk & 128) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbfp.zzs
        public zza.EnumC0185zza zzL() {
            zza.EnumC0185zza enumC0185zzaZzc = zza.EnumC0185zza.zzc(this.zzw);
            return enumC0185zzaZzc == null ? zza.EnumC0185zza.AD_INITIATER_UNSPECIFIED : enumC0185zzaZzc;
        }

        @Override // com.google.android.gms.internal.ads.zzbfp.zzs
        public List<zzd.zza> zzO() {
            return new zzibb(this.zzx, zzy);
        }

        @Override // com.google.android.gms.internal.ads.zzbfp.zzs
        public int zzP() {
            return this.zzx.size();
        }

        @Override // com.google.android.gms.internal.ads.zzbfp.zzs
        public zzd.zza zzQ(int i2) {
            zzd.zza zzaVarZzc = zzd.zza.zzc(this.zzx.zzf(i2));
            return zzaVarZzc == null ? zzd.zza.AD_FORMAT_TYPE_UNSPECIFIED : zzaVarZzc;
        }

        @Override // com.google.android.gms.internal.ads.zzbfp.zzs
        public List<zzd.zza> zzV() {
            return new zzibb(this.zzz, zzA);
        }

        @Override // com.google.android.gms.internal.ads.zzbfp.zzs
        public int zzW() {
            return this.zzz.size();
        }

        @Override // com.google.android.gms.internal.ads.zzbfp.zzs
        public zzd.zza zzX(int i2) {
            zzd.zza zzaVarZzc = zzd.zza.zzc(this.zzz.zzf(i2));
            return zzaVarZzc == null ? zzd.zza.AD_FORMAT_TYPE_UNSPECIFIED : zzaVarZzc;
        }

        @Override // com.google.android.gms.internal.ads.zzbfp.zzs
        public boolean zza() {
            return (this.zzk & 1) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbfp.zzs
        public int zzb() {
            return this.zzl;
        }

        @Override // com.google.android.gms.internal.ads.zziar
        public final Object zzdc(zziaq zziaqVar, Object obj, Object obj2) {
            zzick zziamVar;
            int iOrdinal = zziaqVar.ordinal();
            if (iOrdinal == 0) {
                return (byte) 1;
            }
            if (iOrdinal == 2) {
                return zziar.zzbv(zzB, "\u0004\n\u0000\u0001\u0007\u0010\n\u0000\u0002\u0000\u0007င\u0000\bဈ\u0001\tဉ\u0002\n᠌\u0003\u000bဈ\u0004\fဈ\u0005\r᠌\u0006\u000e᠌\u0007\u000fࠞ\u0010ࠞ", new Object[]{"zzk", "zzl", "zzm", "zzn", "zzo", zzo.zzb.zze(), "zzp", "zzu", "zzv", zzab.zzc.zze(), "zzw", zza.EnumC0185zza.zze(), "zzx", zzd.zza.zze(), "zzz", zzd.zza.zze()});
            }
            if (iOrdinal == 3) {
                return new zzr();
            }
            byte[] bArr = null;
            if (iOrdinal == 4) {
                return new zza(bArr);
            }
            if (iOrdinal == 5) {
                return zzB;
            }
            if (iOrdinal != 6) {
                throw null;
            }
            zzick<zzr> zzickVar = zzC;
            if (zzickVar != null) {
                return zzickVar;
            }
            synchronized (zzr.class) {
                try {
                    zziamVar = zzC;
                    if (zziamVar == null) {
                        zziamVar = new zziam(zzB);
                        zzC = zziamVar;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return zziamVar;
        }

        @Override // com.google.android.gms.internal.ads.zzbfp.zzs
        public boolean zze() {
            return (this.zzk & 2) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbfp.zzs
        public String zzf() {
            return this.zzm;
        }

        @Override // com.google.android.gms.internal.ads.zzbfp.zzs
        public zzhzl zzg() {
            return zzhzl.zzv(this.zzm);
        }

        @Override // com.google.android.gms.internal.ads.zzbfp.zzs
        public boolean zzk() {
            return (this.zzk & 4) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbfp.zzs
        public zzar zzl() {
            zzar zzarVar = this.zzn;
            return zzarVar == null ? zzar.zzu() : zzarVar;
        }

        @Override // com.google.android.gms.internal.ads.zzbfp.zzs
        public boolean zzq() {
            return (this.zzk & 8) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbfp.zzs
        public zzo.zzb zzr() {
            zzo.zzb zzbVarZzc = zzo.zzb.zzc(this.zzo);
            return zzbVarZzc == null ? zzo.zzb.PLATFORM_UNSPECIFIED : zzbVarZzc;
        }

        @Override // com.google.android.gms.internal.ads.zzbfp.zzs
        public boolean zzu() {
            return (this.zzk & 16) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbfp.zzs
        public String zzv() {
            return this.zzp;
        }

        @Override // com.google.android.gms.internal.ads.zzbfp.zzs
        public zzhzl zzw() {
            return zzhzl.zzv(this.zzp);
        }
    }

    public interface zzs extends zzicd {
        boolean zzA();

        String zzB();

        zzhzl zzC();

        boolean zzG();

        zzab.zzc zzH();

        boolean zzK();

        zza.EnumC0185zza zzL();

        List<zzd.zza> zzO();

        int zzP();

        zzd.zza zzQ(int i2);

        List<zzd.zza> zzV();

        int zzW();

        zzd.zza zzX(int i2);

        boolean zza();

        int zzb();

        boolean zze();

        String zzf();

        zzhzl zzg();

        boolean zzk();

        zzar zzl();

        boolean zzq();

        zzo.zzb zzr();

        boolean zzu();

        String zzv();

        zzhzl zzw();
    }

    public final class zzt extends zziar<zzt, zza> implements zzu {
        private static final zzt zzF;
        private static volatile zzick<zzt> zzG = null;
        public static final int zza = 9;
        public static final int zzb = 10;
        public static final int zzc = 11;
        public static final int zzd = 12;
        public static final int zze = 13;
        public static final int zzf = 14;
        public static final int zzg = 15;
        public static final int zzh = 16;
        public static final int zzi = 17;
        public static final int zzj = 18;
        public static final int zzk = 19;
        public static final int zzl = 20;
        public static final int zzm = 21;
        private zzab zzA;
        private zza zzB;
        private zzaf zzC;
        private zzbl zzD;
        private zzb zzE;
        private int zzn;
        private int zzo;
        private int zzu;
        private zzar zzw;
        private zzm zzy;
        private zzo zzz;
        private String zzp = "";
        private int zzv = 1000;
        private zzibc zzx = zziar.zzbE();

        public final class zza extends zzial<zzt, zza> implements zzu {
            public /* synthetic */ zza(byte[] bArr) {
                this();
            }

            @Override // com.google.android.gms.internal.ads.zzbfp.zzu
            public long zzA(int i2) {
                return ((zzt) this.zza).zzA(i2);
            }

            public zza zzB(int i2, long j) {
                zzbg();
                ((zzt) this.zza).zzW(i2, j);
                return this;
            }

            public zza zzC(long j) {
                zzbg();
                ((zzt) this.zza).zzZ(j);
                return this;
            }

            public zza zzD(Iterable<? extends Long> iterable) {
                zzbg();
                ((zzt) this.zza).zzaa(iterable);
                return this;
            }

            public zza zzE() {
                zzbg();
                ((zzt) this.zza).zzab();
                return this;
            }

            @Override // com.google.android.gms.internal.ads.zzbfp.zzu
            public boolean zzF() {
                return ((zzt) this.zza).zzF();
            }

            @Override // com.google.android.gms.internal.ads.zzbfp.zzu
            public zzm zzG() {
                return ((zzt) this.zza).zzG();
            }

            public zza zzH(zzm zzmVar) {
                zzbg();
                ((zzt) this.zza).zzac(zzmVar);
                return this;
            }

            public zza zzI(zzm.zza zzaVar) {
                zzbg();
                ((zzt) this.zza).zzac(zzaVar.zzbu());
                return this;
            }

            public zza zzJ(zzm zzmVar) {
                zzbg();
                ((zzt) this.zza).zzaf(zzmVar);
                return this;
            }

            public zza zzK() {
                zzbg();
                ((zzt) this.zza).zzag();
                return this;
            }

            @Override // com.google.android.gms.internal.ads.zzbfp.zzu
            public boolean zzL() {
                return ((zzt) this.zza).zzL();
            }

            @Override // com.google.android.gms.internal.ads.zzbfp.zzu
            public zzo zzM() {
                return ((zzt) this.zza).zzM();
            }

            public zza zzN(zzo zzoVar) {
                zzbg();
                ((zzt) this.zza).zzah(zzoVar);
                return this;
            }

            public zza zzO(zzo.zza zzaVar) {
                zzbg();
                ((zzt) this.zza).zzah(zzaVar.zzbu());
                return this;
            }

            public zza zzP(zzo zzoVar) {
                zzbg();
                ((zzt) this.zza).zzai(zzoVar);
                return this;
            }

            public zza zzQ() {
                zzbg();
                ((zzt) this.zza).zzal();
                return this;
            }

            @Override // com.google.android.gms.internal.ads.zzbfp.zzu
            public boolean zzR() {
                return ((zzt) this.zza).zzR();
            }

            @Override // com.google.android.gms.internal.ads.zzbfp.zzu
            public zzab zzS() {
                return ((zzt) this.zza).zzS();
            }

            public zza zzT(zzab zzabVar) {
                zzbg();
                ((zzt) this.zza).zzam(zzabVar);
                return this;
            }

            public zza zzU(zzab.zza zzaVar) {
                zzbg();
                ((zzt) this.zza).zzam(zzaVar.zzbu());
                return this;
            }

            public zza zzV(zzab zzabVar) {
                zzbg();
                ((zzt) this.zza).zzan(zzabVar);
                return this;
            }

            public zza zzW() {
                zzbg();
                ((zzt) this.zza).zzao();
                return this;
            }

            @Override // com.google.android.gms.internal.ads.zzbfp.zzu
            public boolean zzX() {
                return ((zzt) this.zza).zzX();
            }

            @Override // com.google.android.gms.internal.ads.zzbfp.zzu
            public zza zzY() {
                return ((zzt) this.zza).zzY();
            }

            public zza zzZ(zza zzaVar) {
                zzbg();
                ((zzt) this.zza).zzar(zzaVar);
                return this;
            }

            @Override // com.google.android.gms.internal.ads.zzbfp.zzu
            public boolean zza() {
                return ((zzt) this.zza).zza();
            }

            public zza zzaa(zza.zzb zzbVar) {
                zzbg();
                ((zzt) this.zza).zzar(zzbVar.zzbu());
                return this;
            }

            public zza zzab(zza zzaVar) {
                zzbg();
                ((zzt) this.zza).zzas(zzaVar);
                return this;
            }

            public zza zzac() {
                zzbg();
                ((zzt) this.zza).zzat();
                return this;
            }

            @Override // com.google.android.gms.internal.ads.zzbfp.zzu
            public boolean zzad() {
                return ((zzt) this.zza).zzad();
            }

            @Override // com.google.android.gms.internal.ads.zzbfp.zzu
            public zzaf zzae() {
                return ((zzt) this.zza).zzae();
            }

            public zza zzaf(zzaf zzafVar) {
                zzbg();
                ((zzt) this.zza).zzau(zzafVar);
                return this;
            }

            public zza zzag(zzaf.zzc zzcVar) {
                zzbg();
                ((zzt) this.zza).zzau(zzcVar.zzbu());
                return this;
            }

            public zza zzah(zzaf zzafVar) {
                zzbg();
                ((zzt) this.zza).zzav(zzafVar);
                return this;
            }

            public zza zzai() {
                zzbg();
                ((zzt) this.zza).zzaw();
                return this;
            }

            @Override // com.google.android.gms.internal.ads.zzbfp.zzu
            public boolean zzaj() {
                return ((zzt) this.zza).zzaj();
            }

            @Override // com.google.android.gms.internal.ads.zzbfp.zzu
            public zzbl zzak() {
                return ((zzt) this.zza).zzak();
            }

            public zza zzal(zzbl zzblVar) {
                zzbg();
                ((zzt) this.zza).zzax(zzblVar);
                return this;
            }

            public zza zzam(zzbl.zza zzaVar) {
                zzbg();
                ((zzt) this.zza).zzax(zzaVar.zzbu());
                return this;
            }

            public zza zzan(zzbl zzblVar) {
                zzbg();
                ((zzt) this.zza).zzay(zzblVar);
                return this;
            }

            public zza zzao() {
                zzbg();
                ((zzt) this.zza).zzaz();
                return this;
            }

            @Override // com.google.android.gms.internal.ads.zzbfp.zzu
            public boolean zzap() {
                return ((zzt) this.zza).zzap();
            }

            @Override // com.google.android.gms.internal.ads.zzbfp.zzu
            public zzb zzaq() {
                return ((zzt) this.zza).zzaq();
            }

            public zza zzar(zzb zzbVar) {
                zzbg();
                ((zzt) this.zza).zzaA(zzbVar);
                return this;
            }

            public zza zzas(zzb.zzc zzcVar) {
                zzbg();
                ((zzt) this.zza).zzaA(zzcVar.zzbu());
                return this;
            }

            public zza zzat(zzb zzbVar) {
                zzbg();
                ((zzt) this.zza).zzaB(zzbVar);
                return this;
            }

            public zza zzau() {
                zzbg();
                ((zzt) this.zza).zzaC();
                return this;
            }

            @Override // com.google.android.gms.internal.ads.zzbfp.zzu
            public int zzb() {
                return ((zzt) this.zza).zzb();
            }

            public zza zzc(int i2) {
                zzbg();
                ((zzt) this.zza).zzE(i2);
                return this;
            }

            public zza zzd() {
                zzbg();
                ((zzt) this.zza).zzH();
                return this;
            }

            @Override // com.google.android.gms.internal.ads.zzbfp.zzu
            public boolean zze() {
                return ((zzt) this.zza).zze();
            }

            @Override // com.google.android.gms.internal.ads.zzbfp.zzu
            public String zzf() {
                return ((zzt) this.zza).zzf();
            }

            @Override // com.google.android.gms.internal.ads.zzbfp.zzu
            public zzhzl zzg() {
                return ((zzt) this.zza).zzg();
            }

            public zza zzh(String str) {
                zzbg();
                ((zzt) this.zza).zzI(str);
                return this;
            }

            public zza zzi() {
                zzbg();
                ((zzt) this.zza).zzJ();
                return this;
            }

            public zza zzj(zzhzl zzhzlVar) {
                zzbg();
                ((zzt) this.zza).zzK(zzhzlVar);
                return this;
            }

            @Override // com.google.android.gms.internal.ads.zzbfp.zzu
            public boolean zzk() {
                return ((zzt) this.zza).zzk();
            }

            @Override // com.google.android.gms.internal.ads.zzbfp.zzu
            public int zzl() {
                return ((zzt) this.zza).zzl();
            }

            public zza zzm(int i2) {
                zzbg();
                ((zzt) this.zza).zzN(i2);
                return this;
            }

            public zza zzn() {
                zzbg();
                ((zzt) this.zza).zzO();
                return this;
            }

            @Override // com.google.android.gms.internal.ads.zzbfp.zzu
            public boolean zzo() {
                return ((zzt) this.zza).zzo();
            }

            @Override // com.google.android.gms.internal.ads.zzbfp.zzu
            public zzq zzp() {
                return ((zzt) this.zza).zzp();
            }

            public zza zzq(zzq zzqVar) {
                zzbg();
                ((zzt) this.zza).zzP(zzqVar);
                return this;
            }

            public zza zzr() {
                zzbg();
                ((zzt) this.zza).zzQ();
                return this;
            }

            @Override // com.google.android.gms.internal.ads.zzbfp.zzu
            public boolean zzs() {
                return ((zzt) this.zza).zzs();
            }

            @Override // com.google.android.gms.internal.ads.zzbfp.zzu
            public zzar zzt() {
                return ((zzt) this.zza).zzt();
            }

            public zza zzu(zzar zzarVar) {
                zzbg();
                ((zzt) this.zza).zzT(zzarVar);
                return this;
            }

            public zza zzv(zzar.zza zzaVar) {
                zzbg();
                ((zzt) this.zza).zzT(zzaVar.zzbu());
                return this;
            }

            public zza zzw(zzar zzarVar) {
                zzbg();
                ((zzt) this.zza).zzU(zzarVar);
                return this;
            }

            public zza zzx() {
                zzbg();
                ((zzt) this.zza).zzV();
                return this;
            }

            @Override // com.google.android.gms.internal.ads.zzbfp.zzu
            public List<Long> zzy() {
                return Collections.unmodifiableList(((zzt) this.zza).zzy());
            }

            @Override // com.google.android.gms.internal.ads.zzbfp.zzu
            public int zzz() {
                return ((zzt) this.zza).zzz();
            }

            private zza() {
                super(zzt.zzF);
            }
        }

        static {
            zzt zztVar = new zzt();
            zzF = zztVar;
            zziar.zzbu(zzt.class, zztVar);
        }

        private zzt() {
        }

        public static zza zzB(zzt zztVar) {
            return (zza) zzF.zzbo(zztVar);
        }

        public static zzt zzC() {
            return zzF;
        }

        public static zzick<zzt> zzD() {
            return zzF.zzbd();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzaE, reason: merged with bridge method [inline-methods] */
        public void zzE(int i2) {
            this.zzn |= 1;
            this.zzo = i2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzaF, reason: merged with bridge method [inline-methods] */
        public void zzH() {
            this.zzn &= -2;
            this.zzo = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzaG, reason: merged with bridge method [inline-methods] */
        public void zzI(String str) {
            str.getClass();
            this.zzn |= 2;
            this.zzp = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzaH, reason: merged with bridge method [inline-methods] */
        public void zzJ() {
            this.zzn &= -3;
            this.zzp = zzC().zzf();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzaI, reason: merged with bridge method [inline-methods] */
        public void zzK(zzhzl zzhzlVar) {
            this.zzp = zzhzlVar.zzz();
            this.zzn |= 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzaJ, reason: merged with bridge method [inline-methods] */
        public void zzN(int i2) {
            this.zzn |= 4;
            this.zzu = i2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzaK, reason: merged with bridge method [inline-methods] */
        public void zzO() {
            this.zzn &= -5;
            this.zzu = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzaL, reason: merged with bridge method [inline-methods] */
        public void zzP(zzq zzqVar) {
            this.zzv = zzqVar.zza();
            this.zzn |= 8;
        }

        public static zzt zzc(ByteBuffer byteBuffer) throws zzibg {
            return (zzt) zziar.zzbR(zzF, byteBuffer);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzcA, reason: merged with bridge method [inline-methods] */
        public void zzav(zzaf zzafVar) {
            zzafVar.getClass();
            zzaf zzafVar2 = this.zzC;
            if (zzafVar2 != null && zzafVar2 != zzaf.zzD()) {
                zzaf.zzc zzcVarZzC = zzaf.zzC(zzafVar2);
                zzcVarZzC.zzbo(zzafVar);
                zzafVar = zzcVarZzC.zzbt();
            }
            this.zzC = zzafVar;
            this.zzn |= 512;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzcB, reason: merged with bridge method [inline-methods] */
        public void zzaw() {
            this.zzC = null;
            this.zzn &= -513;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzcC, reason: merged with bridge method [inline-methods] */
        public void zzax(zzbl zzblVar) {
            zzblVar.getClass();
            this.zzD = zzblVar;
            this.zzn |= 1024;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzcD, reason: merged with bridge method [inline-methods] */
        public void zzay(zzbl zzblVar) {
            zzblVar.getClass();
            zzbl zzblVar2 = this.zzD;
            if (zzblVar2 != null && zzblVar2 != zzbl.zzs()) {
                zzbl.zza zzaVarZzr = zzbl.zzr(zzblVar2);
                zzaVarZzr.zzbo(zzblVar);
                zzblVar = zzaVarZzr.zzbt();
            }
            this.zzD = zzblVar;
            this.zzn |= 1024;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzcE, reason: merged with bridge method [inline-methods] */
        public void zzaz() {
            this.zzD = null;
            this.zzn &= -1025;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzcF, reason: merged with bridge method [inline-methods] */
        public void zzaA(zzb zzbVar) {
            zzbVar.getClass();
            this.zzE = zzbVar;
            this.zzn |= com.p004ironsource.mediationsdk.metadata.a.f25965n;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzcG, reason: merged with bridge method [inline-methods] */
        public void zzaB(zzb zzbVar) {
            zzbVar.getClass();
            zzb zzbVar2 = this.zzE;
            if (zzbVar2 != null && zzbVar2 != zzb.zzu()) {
                zzb.zzc zzcVarZzt = zzb.zzt(zzbVar2);
                zzcVarZzt.zzbo(zzbVar);
                zzbVar = zzcVarZzt.zzbt();
            }
            this.zzE = zzbVar;
            this.zzn |= com.p004ironsource.mediationsdk.metadata.a.f25965n;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzcH, reason: merged with bridge method [inline-methods] */
        public void zzaC() {
            this.zzE = null;
            this.zzn &= -2049;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzce, reason: merged with bridge method [inline-methods] */
        public void zzQ() {
            this.zzn &= -9;
            this.zzv = 1000;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzcf, reason: merged with bridge method [inline-methods] */
        public void zzT(zzar zzarVar) {
            zzarVar.getClass();
            this.zzw = zzarVar;
            this.zzn |= 16;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzcg, reason: merged with bridge method [inline-methods] */
        public void zzU(zzar zzarVar) {
            zzarVar.getClass();
            zzar zzarVar2 = this.zzw;
            if (zzarVar2 != null && zzarVar2 != zzar.zzu()) {
                zzar.zza zzaVarZzt = zzar.zzt(zzarVar2);
                zzaVarZzt.zzbo(zzarVar);
                zzarVar = zzaVarZzt.zzbt();
            }
            this.zzw = zzarVar;
            this.zzn |= 16;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzch, reason: merged with bridge method [inline-methods] */
        public void zzV() {
            this.zzw = null;
            this.zzn &= -17;
        }

        private void zzci() {
            zzibc zzibcVar = this.zzx;
            if (zzibcVar.zza()) {
                return;
            }
            this.zzx = zziar.zzbF(zzibcVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzcj, reason: merged with bridge method [inline-methods] */
        public void zzW(int i2, long j) {
            zzci();
            this.zzx.zze(i2, j);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzck, reason: merged with bridge method [inline-methods] */
        public void zzZ(long j) {
            zzci();
            this.zzx.zzd(j);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzcl, reason: merged with bridge method [inline-methods] */
        public void zzaa(Iterable<? extends Long> iterable) {
            zzci();
            zzhyu.zzaW(iterable, this.zzx);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzcm, reason: merged with bridge method [inline-methods] */
        public void zzab() {
            this.zzx = zziar.zzbE();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzcn, reason: merged with bridge method [inline-methods] */
        public void zzac(zzm zzmVar) {
            zzmVar.getClass();
            this.zzy = zzmVar;
            this.zzn |= 32;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzco, reason: merged with bridge method [inline-methods] */
        public void zzaf(zzm zzmVar) {
            zzmVar.getClass();
            zzm zzmVar2 = this.zzy;
            if (zzmVar2 != null && zzmVar2 != zzm.zzC()) {
                zzm.zza zzaVarZzz = zzm.zzz(zzmVar2);
                zzaVarZzz.zzbo(zzmVar);
                zzmVar = zzaVarZzz.zzbt();
            }
            this.zzy = zzmVar;
            this.zzn |= 32;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzcp, reason: merged with bridge method [inline-methods] */
        public void zzag() {
            this.zzy = null;
            this.zzn &= -33;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzcq, reason: merged with bridge method [inline-methods] */
        public void zzah(zzo zzoVar) {
            zzoVar.getClass();
            this.zzz = zzoVar;
            this.zzn |= 64;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzcr, reason: merged with bridge method [inline-methods] */
        public void zzai(zzo zzoVar) {
            zzoVar.getClass();
            zzo zzoVar2 = this.zzz;
            if (zzoVar2 != null && zzoVar2 != zzo.zzy()) {
                zzo.zza zzaVarZzx = zzo.zzx(zzoVar2);
                zzaVarZzx.zzbo(zzoVar);
                zzoVar = zzaVarZzx.zzbt();
            }
            this.zzz = zzoVar;
            this.zzn |= 64;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzcs, reason: merged with bridge method [inline-methods] */
        public void zzal() {
            this.zzz = null;
            this.zzn &= -65;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzct, reason: merged with bridge method [inline-methods] */
        public void zzam(zzab zzabVar) {
            zzabVar.getClass();
            this.zzA = zzabVar;
            this.zzn |= 128;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzcu, reason: merged with bridge method [inline-methods] */
        public void zzan(zzab zzabVar) {
            zzabVar.getClass();
            zzab zzabVar2 = this.zzA;
            if (zzabVar2 != null && zzabVar2 != zzab.zzs()) {
                zzab.zza zzaVarZzr = zzab.zzr(zzabVar2);
                zzaVarZzr.zzbo(zzabVar);
                zzabVar = zzaVarZzr.zzbt();
            }
            this.zzA = zzabVar;
            this.zzn |= 128;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzcv, reason: merged with bridge method [inline-methods] */
        public void zzao() {
            this.zzA = null;
            this.zzn &= -129;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzcw, reason: merged with bridge method [inline-methods] */
        public void zzar(zza zzaVar) {
            zzaVar.getClass();
            this.zzB = zzaVar;
            this.zzn |= 256;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzcx, reason: merged with bridge method [inline-methods] */
        public void zzas(zza zzaVar) {
            zzaVar.getClass();
            zza zzaVar2 = this.zzB;
            if (zzaVar2 != null && zzaVar2 != zza.zzD()) {
                zza.zzb zzbVarZzC = zza.zzC(zzaVar2);
                zzbVarZzC.zzbo(zzaVar);
                zzaVar = zzbVarZzC.zzbt();
            }
            this.zzB = zzaVar;
            this.zzn |= 256;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzcy, reason: merged with bridge method [inline-methods] */
        public void zzat() {
            this.zzB = null;
            this.zzn &= -257;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzcz, reason: merged with bridge method [inline-methods] */
        public void zzau(zzaf zzafVar) {
            zzafVar.getClass();
            this.zzC = zzafVar;
            this.zzn |= 512;
        }

        public static zzt zzd(ByteBuffer byteBuffer, zziab zziabVar) throws zzibg {
            return (zzt) zziar.zzbQ(zzF, byteBuffer, zziabVar);
        }

        public static zzt zzh(zzhzl zzhzlVar) throws zzibg {
            return (zzt) zziar.zzbS(zzF, zzhzlVar);
        }

        public static zzt zzi(zzhzl zzhzlVar, zziab zziabVar) throws zzibg {
            return (zzt) zziar.zzbT(zzF, zzhzlVar, zziabVar);
        }

        public static zzt zzj(byte[] bArr) throws zzibg {
            return (zzt) zziar.zzbU(zzF, bArr);
        }

        public static zzt zzm(byte[] bArr, zziab zziabVar) throws zzibg {
            return (zzt) zziar.zzbV(zzF, bArr, zziabVar);
        }

        public static zzt zzn(InputStream inputStream) throws IOException {
            return (zzt) zziar.zzbW(zzF, inputStream);
        }

        public static zzt zzq(InputStream inputStream, zziab zziabVar) throws IOException {
            return (zzt) zziar.zzbX(zzF, inputStream, zziabVar);
        }

        public static zzt zzr(InputStream inputStream) throws IOException {
            return (zzt) zziar.zzca(zzF, inputStream);
        }

        public static zzt zzu(InputStream inputStream, zziab zziabVar) throws IOException {
            return (zzt) zziar.zzcb(zzF, inputStream, zziabVar);
        }

        public static zzt zzv(zzhzq zzhzqVar) throws IOException {
            return (zzt) zziar.zzbY(zzF, zzhzqVar);
        }

        public static zzt zzw(zzhzq zzhzqVar, zziab zziabVar) throws IOException {
            return (zzt) zziar.zzbZ(zzF, zzhzqVar, zziabVar);
        }

        public static zza zzx() {
            return (zza) zzF.zzbn();
        }

        @Override // com.google.android.gms.internal.ads.zzbfp.zzu
        public long zzA(int i2) {
            return this.zzx.zzc(i2);
        }

        @Override // com.google.android.gms.internal.ads.zzbfp.zzu
        public boolean zzF() {
            return (this.zzn & 32) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbfp.zzu
        public zzm zzG() {
            zzm zzmVar = this.zzy;
            return zzmVar == null ? zzm.zzC() : zzmVar;
        }

        @Override // com.google.android.gms.internal.ads.zzbfp.zzu
        public boolean zzL() {
            return (this.zzn & 64) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbfp.zzu
        public zzo zzM() {
            zzo zzoVar = this.zzz;
            return zzoVar == null ? zzo.zzy() : zzoVar;
        }

        @Override // com.google.android.gms.internal.ads.zzbfp.zzu
        public boolean zzR() {
            return (this.zzn & 128) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbfp.zzu
        public zzab zzS() {
            zzab zzabVar = this.zzA;
            return zzabVar == null ? zzab.zzs() : zzabVar;
        }

        @Override // com.google.android.gms.internal.ads.zzbfp.zzu
        public boolean zzX() {
            return (this.zzn & 256) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbfp.zzu
        public zza zzY() {
            zza zzaVar = this.zzB;
            return zzaVar == null ? zza.zzD() : zzaVar;
        }

        @Override // com.google.android.gms.internal.ads.zzbfp.zzu
        public boolean zza() {
            return (this.zzn & 1) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbfp.zzu
        public boolean zzad() {
            return (this.zzn & 512) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbfp.zzu
        public zzaf zzae() {
            zzaf zzafVar = this.zzC;
            return zzafVar == null ? zzaf.zzD() : zzafVar;
        }

        @Override // com.google.android.gms.internal.ads.zzbfp.zzu
        public boolean zzaj() {
            return (this.zzn & 1024) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbfp.zzu
        public zzbl zzak() {
            zzbl zzblVar = this.zzD;
            return zzblVar == null ? zzbl.zzs() : zzblVar;
        }

        @Override // com.google.android.gms.internal.ads.zzbfp.zzu
        public boolean zzap() {
            return (this.zzn & com.p004ironsource.mediationsdk.metadata.a.f25965n) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbfp.zzu
        public zzb zzaq() {
            zzb zzbVar = this.zzE;
            return zzbVar == null ? zzb.zzu() : zzbVar;
        }

        @Override // com.google.android.gms.internal.ads.zzbfp.zzu
        public int zzb() {
            return this.zzo;
        }

        @Override // com.google.android.gms.internal.ads.zziar
        public final Object zzdc(zziaq zziaqVar, Object obj, Object obj2) {
            zzick zziamVar;
            int iOrdinal = zziaqVar.ordinal();
            if (iOrdinal == 0) {
                return (byte) 1;
            }
            if (iOrdinal == 2) {
                return zziar.zzbv(zzF, "\u0004\r\u0000\u0001\t\u0015\r\u0000\u0001\u0000\tင\u0000\nဈ\u0001\u000bဋ\u0002\f᠌\u0003\rဉ\u0004\u000e\u0015\u000fဉ\u0005\u0010ဉ\u0006\u0011ဉ\u0007\u0012ဉ\b\u0013ဉ\t\u0014ဉ\n\u0015ဉ\u000b", new Object[]{"zzn", "zzo", "zzp", "zzu", "zzv", zzq.zze(), "zzw", "zzx", "zzy", "zzz", "zzA", "zzB", "zzC", "zzD", "zzE"});
            }
            if (iOrdinal == 3) {
                return new zzt();
            }
            byte[] bArr = null;
            if (iOrdinal == 4) {
                return new zza(bArr);
            }
            if (iOrdinal == 5) {
                return zzF;
            }
            if (iOrdinal != 6) {
                throw null;
            }
            zzick<zzt> zzickVar = zzG;
            if (zzickVar != null) {
                return zzickVar;
            }
            synchronized (zzt.class) {
                try {
                    zziamVar = zzG;
                    if (zziamVar == null) {
                        zziamVar = new zziam(zzF);
                        zzG = zziamVar;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return zziamVar;
        }

        @Override // com.google.android.gms.internal.ads.zzbfp.zzu
        public boolean zze() {
            return (this.zzn & 2) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbfp.zzu
        public String zzf() {
            return this.zzp;
        }

        @Override // com.google.android.gms.internal.ads.zzbfp.zzu
        public zzhzl zzg() {
            return zzhzl.zzv(this.zzp);
        }

        @Override // com.google.android.gms.internal.ads.zzbfp.zzu
        public boolean zzk() {
            return (this.zzn & 4) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbfp.zzu
        public int zzl() {
            return this.zzu;
        }

        @Override // com.google.android.gms.internal.ads.zzbfp.zzu
        public boolean zzo() {
            return (this.zzn & 8) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbfp.zzu
        public zzq zzp() {
            zzq zzqVarZzc = zzq.zzc(this.zzv);
            return zzqVarZzc == null ? zzq.ENUM_UNKNOWN : zzqVarZzc;
        }

        @Override // com.google.android.gms.internal.ads.zzbfp.zzu
        public boolean zzs() {
            return (this.zzn & 16) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbfp.zzu
        public zzar zzt() {
            zzar zzarVar = this.zzw;
            return zzarVar == null ? zzar.zzu() : zzarVar;
        }

        @Override // com.google.android.gms.internal.ads.zzbfp.zzu
        public List<Long> zzy() {
            return this.zzx;
        }

        @Override // com.google.android.gms.internal.ads.zzbfp.zzu
        public int zzz() {
            return this.zzx.size();
        }
    }

    public interface zzu extends zzicd {
        long zzA(int i2);

        boolean zzF();

        zzm zzG();

        boolean zzL();

        zzo zzM();

        boolean zzR();

        zzab zzS();

        boolean zzX();

        zza zzY();

        boolean zza();

        boolean zzad();

        zzaf zzae();

        boolean zzaj();

        zzbl zzak();

        boolean zzap();

        zzb zzaq();

        int zzb();

        boolean zze();

        String zzf();

        zzhzl zzg();

        boolean zzk();

        int zzl();

        boolean zzo();

        zzq zzp();

        boolean zzs();

        zzar zzt();

        List<Long> zzy();

        int zzz();
    }

    public final class zzv extends zziar<zzv, zza> implements zzw {
        public static final int zza = 1;
        public static final int zzb = 2;
        public static final int zzc = 3;
        public static final int zzd = 4;
        private static final zzv zzj;
        private static volatile zzick<zzv> zzk;
        private int zze;
        private int zzg;
        private zzap zzi;
        private String zzf = "";
        private zziaz zzh = zziar.zzbC();

        public final class zza extends zzial<zzv, zza> implements zzw {
            public /* synthetic */ zza(byte[] bArr) {
                this();
            }

            @Override // com.google.android.gms.internal.ads.zzbfp.zzw
            public boolean zza() {
                return ((zzv) this.zza).zza();
            }

            @Override // com.google.android.gms.internal.ads.zzbfp.zzw
            public String zzb() {
                return ((zzv) this.zza).zzb();
            }

            @Override // com.google.android.gms.internal.ads.zzbfp.zzw
            public zzhzl zzc() {
                return ((zzv) this.zza).zzc();
            }

            public zza zzd(String str) {
                zzbg();
                ((zzv) this.zza).zzB(str);
                return this;
            }

            public zza zze() {
                zzbg();
                ((zzv) this.zza).zzC();
                return this;
            }

            public zza zzf(zzhzl zzhzlVar) {
                zzbg();
                ((zzv) this.zza).zzD(zzhzlVar);
                return this;
            }

            @Override // com.google.android.gms.internal.ads.zzbfp.zzw
            public boolean zzg() {
                return ((zzv) this.zza).zzg();
            }

            @Override // com.google.android.gms.internal.ads.zzbfp.zzw
            public zzq zzh() {
                return ((zzv) this.zza).zzh();
            }

            public zza zzi(zzq zzqVar) {
                zzbg();
                ((zzv) this.zza).zzE(zzqVar);
                return this;
            }

            public zza zzj() {
                zzbg();
                ((zzv) this.zza).zzF();
                return this;
            }

            @Override // com.google.android.gms.internal.ads.zzbfp.zzw
            public List<Integer> zzk() {
                return Collections.unmodifiableList(((zzv) this.zza).zzk());
            }

            @Override // com.google.android.gms.internal.ads.zzbfp.zzw
            public int zzl() {
                return ((zzv) this.zza).zzl();
            }

            @Override // com.google.android.gms.internal.ads.zzbfp.zzw
            public int zzm(int i2) {
                return ((zzv) this.zza).zzm(i2);
            }

            public zza zzn(int i2, int i3) {
                zzbg();
                ((zzv) this.zza).zzG(i2, i3);
                return this;
            }

            public zza zzo(int i2) {
                zzbg();
                ((zzv) this.zza).zzH(i2);
                return this;
            }

            public zza zzp(Iterable<? extends Integer> iterable) {
                zzbg();
                ((zzv) this.zza).zzI(iterable);
                return this;
            }

            public zza zzq() {
                zzbg();
                ((zzv) this.zza).zzJ();
                return this;
            }

            @Override // com.google.android.gms.internal.ads.zzbfp.zzw
            public boolean zzr() {
                return ((zzv) this.zza).zzr();
            }

            @Override // com.google.android.gms.internal.ads.zzbfp.zzw
            public zzap zzs() {
                return ((zzv) this.zza).zzs();
            }

            public zza zzt(zzap zzapVar) {
                zzbg();
                ((zzv) this.zza).zzK(zzapVar);
                return this;
            }

            public zza zzu(zzap.zza zzaVar) {
                zzbg();
                ((zzv) this.zza).zzK(zzaVar.zzbu());
                return this;
            }

            public zza zzv(zzap zzapVar) {
                zzbg();
                ((zzv) this.zza).zzL(zzapVar);
                return this;
            }

            public zza zzw() {
                zzbg();
                ((zzv) this.zza).zzM();
                return this;
            }

            private zza() {
                super(zzv.zzj);
            }
        }

        static {
            zzv zzvVar = new zzv();
            zzj = zzvVar;
            zziar.zzbu(zzv.class, zzvVar);
        }

        private zzv() {
        }

        public static zzick<zzv> zzA() {
            return zzj.zzbd();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzO, reason: merged with bridge method [inline-methods] */
        public void zzB(String str) {
            str.getClass();
            this.zze |= 1;
            this.zzf = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzP, reason: merged with bridge method [inline-methods] */
        public void zzC() {
            this.zze &= -2;
            this.zzf = zzz().zzb();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzQ, reason: merged with bridge method [inline-methods] */
        public void zzD(zzhzl zzhzlVar) {
            this.zzf = zzhzlVar.zzz();
            this.zze |= 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzR, reason: merged with bridge method [inline-methods] */
        public void zzE(zzq zzqVar) {
            this.zzg = zzqVar.zza();
            this.zze |= 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzS, reason: merged with bridge method [inline-methods] */
        public void zzF() {
            this.zze &= -3;
            this.zzg = 0;
        }

        private void zzT() {
            zziaz zziazVar = this.zzh;
            if (zziazVar.zza()) {
                return;
            }
            this.zzh = zziar.zzbD(zziazVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzU, reason: merged with bridge method [inline-methods] */
        public void zzG(int i2, int i3) {
            zzT();
            this.zzh.zzg(i2, i3);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzV, reason: merged with bridge method [inline-methods] */
        public void zzH(int i2) {
            zzT();
            this.zzh.zzi(i2);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzW, reason: merged with bridge method [inline-methods] */
        public void zzI(Iterable<? extends Integer> iterable) {
            zzT();
            zzhyu.zzaW(iterable, this.zzh);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzX, reason: merged with bridge method [inline-methods] */
        public void zzJ() {
            this.zzh = zziar.zzbC();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzY, reason: merged with bridge method [inline-methods] */
        public void zzK(zzap zzapVar) {
            zzapVar.getClass();
            this.zzi = zzapVar;
            this.zze |= 4;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzZ, reason: merged with bridge method [inline-methods] */
        public void zzL(zzap zzapVar) {
            zzapVar.getClass();
            zzap zzapVar2 = this.zzi;
            if (zzapVar2 != null && zzapVar2 != zzap.zzs()) {
                zzap.zza zzaVarZzr = zzap.zzr(zzapVar2);
                zzaVarZzr.zzbo(zzapVar);
                zzapVar = zzaVarZzr.zzbt();
            }
            this.zzi = zzapVar;
            this.zze |= 4;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzaa, reason: merged with bridge method [inline-methods] */
        public void zzM() {
            this.zzi = null;
            this.zze &= -5;
        }

        public static zzv zzd(ByteBuffer byteBuffer) throws zzibg {
            return (zzv) zziar.zzbR(zzj, byteBuffer);
        }

        public static zzv zze(ByteBuffer byteBuffer, zziab zziabVar) throws zzibg {
            return (zzv) zziar.zzbQ(zzj, byteBuffer, zziabVar);
        }

        public static zzv zzi(zzhzl zzhzlVar) throws zzibg {
            return (zzv) zziar.zzbS(zzj, zzhzlVar);
        }

        public static zzv zzj(zzhzl zzhzlVar, zziab zziabVar) throws zzibg {
            return (zzv) zziar.zzbT(zzj, zzhzlVar, zziabVar);
        }

        public static zzv zzn(byte[] bArr) throws zzibg {
            return (zzv) zziar.zzbU(zzj, bArr);
        }

        public static zzv zzo(byte[] bArr, zziab zziabVar) throws zzibg {
            return (zzv) zziar.zzbV(zzj, bArr, zziabVar);
        }

        public static zzv zzp(InputStream inputStream) throws IOException {
            return (zzv) zziar.zzbW(zzj, inputStream);
        }

        public static zzv zzq(InputStream inputStream, zziab zziabVar) throws IOException {
            return (zzv) zziar.zzbX(zzj, inputStream, zziabVar);
        }

        public static zzv zzt(InputStream inputStream) throws IOException {
            return (zzv) zziar.zzca(zzj, inputStream);
        }

        public static zzv zzu(InputStream inputStream, zziab zziabVar) throws IOException {
            return (zzv) zziar.zzcb(zzj, inputStream, zziabVar);
        }

        public static zzv zzv(zzhzq zzhzqVar) throws IOException {
            return (zzv) zziar.zzbY(zzj, zzhzqVar);
        }

        public static zzv zzw(zzhzq zzhzqVar, zziab zziabVar) throws IOException {
            return (zzv) zziar.zzbZ(zzj, zzhzqVar, zziabVar);
        }

        public static zza zzx() {
            return (zza) zzj.zzbn();
        }

        public static zza zzy(zzv zzvVar) {
            return (zza) zzj.zzbo(zzvVar);
        }

        public static zzv zzz() {
            return zzj;
        }

        @Override // com.google.android.gms.internal.ads.zzbfp.zzw
        public boolean zza() {
            return (this.zze & 1) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbfp.zzw
        public String zzb() {
            return this.zzf;
        }

        @Override // com.google.android.gms.internal.ads.zzbfp.zzw
        public zzhzl zzc() {
            return zzhzl.zzv(this.zzf);
        }

        @Override // com.google.android.gms.internal.ads.zziar
        public final Object zzdc(zziaq zziaqVar, Object obj, Object obj2) {
            zzick zziamVar;
            int iOrdinal = zziaqVar.ordinal();
            if (iOrdinal == 0) {
                return (byte) 1;
            }
            if (iOrdinal == 2) {
                return zziar.zzbv(zzj, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001ဈ\u0000\u0002᠌\u0001\u0003\u0016\u0004ဉ\u0002", new Object[]{"zze", "zzf", "zzg", zzq.zze(), "zzh", "zzi"});
            }
            if (iOrdinal == 3) {
                return new zzv();
            }
            byte[] bArr = null;
            if (iOrdinal == 4) {
                return new zza(bArr);
            }
            if (iOrdinal == 5) {
                return zzj;
            }
            if (iOrdinal != 6) {
                throw null;
            }
            zzick<zzv> zzickVar = zzk;
            if (zzickVar != null) {
                return zzickVar;
            }
            synchronized (zzv.class) {
                try {
                    zziamVar = zzk;
                    if (zziamVar == null) {
                        zziamVar = new zziam(zzj);
                        zzk = zziamVar;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return zziamVar;
        }

        @Override // com.google.android.gms.internal.ads.zzbfp.zzw
        public boolean zzg() {
            return (this.zze & 2) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbfp.zzw
        public zzq zzh() {
            zzq zzqVarZzc = zzq.zzc(this.zzg);
            return zzqVarZzc == null ? zzq.ENUM_FALSE : zzqVarZzc;
        }

        @Override // com.google.android.gms.internal.ads.zzbfp.zzw
        public List<Integer> zzk() {
            return this.zzh;
        }

        @Override // com.google.android.gms.internal.ads.zzbfp.zzw
        public int zzl() {
            return this.zzh.size();
        }

        @Override // com.google.android.gms.internal.ads.zzbfp.zzw
        public int zzm(int i2) {
            return this.zzh.zzf(i2);
        }

        @Override // com.google.android.gms.internal.ads.zzbfp.zzw
        public boolean zzr() {
            return (this.zze & 4) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbfp.zzw
        public zzap zzs() {
            zzap zzapVar = this.zzi;
            return zzapVar == null ? zzap.zzs() : zzapVar;
        }
    }

    public interface zzw extends zzicd {
        boolean zza();

        String zzb();

        zzhzl zzc();

        boolean zzg();

        zzq zzh();

        List<Integer> zzk();

        int zzl();

        int zzm(int i2);

        boolean zzr();

        zzap zzs();
    }

    public final class zzx extends zziar<zzx, zza> implements zzy {
        public static final int zza = 1;
        public static final int zzb = 2;
        private static final zzx zzf;
        private static volatile zzick<zzx> zzg;
        private int zzc;
        private int zzd;
        private zziaz zze = zziar.zzbC();

        public final class zza extends zzial<zzx, zza> implements zzy {
            public /* synthetic */ zza(byte[] bArr) {
                this();
            }

            @Override // com.google.android.gms.internal.ads.zzbfp.zzy
            public boolean zza() {
                return ((zzx) this.zza).zza();
            }

            @Override // com.google.android.gms.internal.ads.zzbfp.zzy
            public zzq zzb() {
                return ((zzx) this.zza).zzb();
            }

            public zza zzc(zzq zzqVar) {
                zzbg();
                ((zzx) this.zza).zzv(zzqVar);
                return this;
            }

            public zza zzd() {
                zzbg();
                ((zzx) this.zza).zzw();
                return this;
            }

            @Override // com.google.android.gms.internal.ads.zzbfp.zzy
            public List<Integer> zze() {
                return Collections.unmodifiableList(((zzx) this.zza).zze());
            }

            @Override // com.google.android.gms.internal.ads.zzbfp.zzy
            public int zzf() {
                return ((zzx) this.zza).zzf();
            }

            @Override // com.google.android.gms.internal.ads.zzbfp.zzy
            public int zzg(int i2) {
                return ((zzx) this.zza).zzg(i2);
            }

            public zza zzh(int i2, int i3) {
                zzbg();
                ((zzx) this.zza).zzx(i2, i3);
                return this;
            }

            public zza zzi(int i2) {
                zzbg();
                ((zzx) this.zza).zzy(i2);
                return this;
            }

            public zza zzj(Iterable<? extends Integer> iterable) {
                zzbg();
                ((zzx) this.zza).zzz(iterable);
                return this;
            }

            public zza zzk() {
                zzbg();
                ((zzx) this.zza).zzA();
                return this;
            }

            private zza() {
                super(zzx.zzf);
            }
        }

        static {
            zzx zzxVar = new zzx();
            zzf = zzxVar;
            zziar.zzbu(zzx.class, zzxVar);
        }

        private zzx() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzC, reason: merged with bridge method [inline-methods] */
        public void zzv(zzq zzqVar) {
            this.zzd = zzqVar.zza();
            this.zzc |= 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzD, reason: merged with bridge method [inline-methods] */
        public void zzw() {
            this.zzc &= -2;
            this.zzd = 0;
        }

        private void zzE() {
            zziaz zziazVar = this.zze;
            if (zziazVar.zza()) {
                return;
            }
            this.zze = zziar.zzbD(zziazVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzF, reason: merged with bridge method [inline-methods] */
        public void zzx(int i2, int i3) {
            zzE();
            this.zze.zzg(i2, i3);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzG, reason: merged with bridge method [inline-methods] */
        public void zzy(int i2) {
            zzE();
            this.zze.zzi(i2);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzH, reason: merged with bridge method [inline-methods] */
        public void zzz(Iterable<? extends Integer> iterable) {
            zzE();
            zzhyu.zzaW(iterable, this.zze);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzI, reason: merged with bridge method [inline-methods] */
        public void zzA() {
            this.zze = zziar.zzbC();
        }

        public static zzx zzc(ByteBuffer byteBuffer) throws zzibg {
            return (zzx) zziar.zzbR(zzf, byteBuffer);
        }

        public static zzx zzd(ByteBuffer byteBuffer, zziab zziabVar) throws zzibg {
            return (zzx) zziar.zzbQ(zzf, byteBuffer, zziabVar);
        }

        public static zzx zzh(zzhzl zzhzlVar) throws zzibg {
            return (zzx) zziar.zzbS(zzf, zzhzlVar);
        }

        public static zzx zzi(zzhzl zzhzlVar, zziab zziabVar) throws zzibg {
            return (zzx) zziar.zzbT(zzf, zzhzlVar, zziabVar);
        }

        public static zzx zzj(byte[] bArr) throws zzibg {
            return (zzx) zziar.zzbU(zzf, bArr);
        }

        public static zzx zzk(byte[] bArr, zziab zziabVar) throws zzibg {
            return (zzx) zziar.zzbV(zzf, bArr, zziabVar);
        }

        public static zzx zzl(InputStream inputStream) throws IOException {
            return (zzx) zziar.zzbW(zzf, inputStream);
        }

        public static zzx zzm(InputStream inputStream, zziab zziabVar) throws IOException {
            return (zzx) zziar.zzbX(zzf, inputStream, zziabVar);
        }

        public static zzx zzn(InputStream inputStream) throws IOException {
            return (zzx) zziar.zzca(zzf, inputStream);
        }

        public static zzx zzo(InputStream inputStream, zziab zziabVar) throws IOException {
            return (zzx) zziar.zzcb(zzf, inputStream, zziabVar);
        }

        public static zzx zzp(zzhzq zzhzqVar) throws IOException {
            return (zzx) zziar.zzbY(zzf, zzhzqVar);
        }

        public static zzx zzq(zzhzq zzhzqVar, zziab zziabVar) throws IOException {
            return (zzx) zziar.zzbZ(zzf, zzhzqVar, zziabVar);
        }

        public static zza zzr() {
            return (zza) zzf.zzbn();
        }

        public static zza zzs(zzx zzxVar) {
            return (zza) zzf.zzbo(zzxVar);
        }

        public static zzx zzt() {
            return zzf;
        }

        public static zzick<zzx> zzu() {
            return zzf.zzbd();
        }

        @Override // com.google.android.gms.internal.ads.zzbfp.zzy
        public boolean zza() {
            return (this.zzc & 1) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbfp.zzy
        public zzq zzb() {
            zzq zzqVarZzc = zzq.zzc(this.zzd);
            return zzqVarZzc == null ? zzq.ENUM_FALSE : zzqVarZzc;
        }

        @Override // com.google.android.gms.internal.ads.zziar
        public final Object zzdc(zziaq zziaqVar, Object obj, Object obj2) {
            zzick zziamVar;
            int iOrdinal = zziaqVar.ordinal();
            if (iOrdinal == 0) {
                return (byte) 1;
            }
            if (iOrdinal == 2) {
                return zziar.zzbv(zzf, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001᠌\u0000\u0002\u0016", new Object[]{"zzc", "zzd", zzq.zze(), "zze"});
            }
            if (iOrdinal == 3) {
                return new zzx();
            }
            byte[] bArr = null;
            if (iOrdinal == 4) {
                return new zza(bArr);
            }
            if (iOrdinal == 5) {
                return zzf;
            }
            if (iOrdinal != 6) {
                throw null;
            }
            zzick<zzx> zzickVar = zzg;
            if (zzickVar != null) {
                return zzickVar;
            }
            synchronized (zzx.class) {
                try {
                    zziamVar = zzg;
                    if (zziamVar == null) {
                        zziamVar = new zziam(zzf);
                        zzg = zziamVar;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return zziamVar;
        }

        @Override // com.google.android.gms.internal.ads.zzbfp.zzy
        public List<Integer> zze() {
            return this.zze;
        }

        @Override // com.google.android.gms.internal.ads.zzbfp.zzy
        public int zzf() {
            return this.zze.size();
        }

        @Override // com.google.android.gms.internal.ads.zzbfp.zzy
        public int zzg(int i2) {
            return this.zze.zzf(i2);
        }
    }

    public interface zzy extends zzicd {
        boolean zza();

        zzq zzb();

        List<Integer> zze();

        int zzf();

        int zzg(int i2);
    }

    public final class zzz extends zziar<zzz, zza> implements zzaa {
        public static final int zza = 1;
        public static final int zzb = 2;
        public static final int zzc = 3;
        public static final int zzd = 4;
        private static final zzz zzj;
        private static volatile zzick<zzz> zzk;
        private int zze;
        private zzv zzf;
        private zzibd<zzan> zzg = zziar.zzbM();
        private int zzh;
        private zzap zzi;

        public final class zza extends zzial<zzz, zza> implements zzaa {
            public /* synthetic */ zza(byte[] bArr) {
                this();
            }

            public zza zzA(zzap zzapVar) {
                zzbg();
                ((zzz) this.zza).zzO(zzapVar);
                return this;
            }

            public zza zzB() {
                zzbg();
                ((zzz) this.zza).zzP();
                return this;
            }

            @Override // com.google.android.gms.internal.ads.zzbfp.zzaa
            public boolean zza() {
                return ((zzz) this.zza).zza();
            }

            @Override // com.google.android.gms.internal.ads.zzbfp.zzaa
            public zzv zzb() {
                return ((zzz) this.zza).zzb();
            }

            public zza zzc(zzv zzvVar) {
                zzbg();
                ((zzz) this.zza).zzC(zzvVar);
                return this;
            }

            public zza zzd(zzv.zza zzaVar) {
                zzbg();
                ((zzz) this.zza).zzC(zzaVar.zzbu());
                return this;
            }

            public zza zze(zzv zzvVar) {
                zzbg();
                ((zzz) this.zza).zzD(zzvVar);
                return this;
            }

            public zza zzf() {
                zzbg();
                ((zzz) this.zza).zzE();
                return this;
            }

            @Override // com.google.android.gms.internal.ads.zzbfp.zzaa
            public List<zzan> zzg() {
                return Collections.unmodifiableList(((zzz) this.zza).zzg());
            }

            @Override // com.google.android.gms.internal.ads.zzbfp.zzaa
            public int zzh() {
                return ((zzz) this.zza).zzh();
            }

            @Override // com.google.android.gms.internal.ads.zzbfp.zzaa
            public zzan zzi(int i2) {
                return ((zzz) this.zza).zzi(i2);
            }

            public zza zzj(int i2, zzan zzanVar) {
                zzbg();
                ((zzz) this.zza).zzF(i2, zzanVar);
                return this;
            }

            public zza zzk(int i2, zzan.zza zzaVar) {
                zzbg();
                ((zzz) this.zza).zzF(i2, zzaVar.zzbu());
                return this;
            }

            public zza zzl(zzan zzanVar) {
                zzbg();
                ((zzz) this.zza).zzG(zzanVar);
                return this;
            }

            public zza zzm(int i2, zzan zzanVar) {
                zzbg();
                ((zzz) this.zza).zzH(i2, zzanVar);
                return this;
            }

            public zza zzn(zzan.zza zzaVar) {
                zzbg();
                ((zzz) this.zza).zzG(zzaVar.zzbu());
                return this;
            }

            public zza zzo(int i2, zzan.zza zzaVar) {
                zzbg();
                ((zzz) this.zza).zzH(i2, zzaVar.zzbu());
                return this;
            }

            public zza zzp(Iterable<? extends zzan> iterable) {
                zzbg();
                ((zzz) this.zza).zzI(iterable);
                return this;
            }

            public zza zzq() {
                zzbg();
                ((zzz) this.zza).zzJ();
                return this;
            }

            public zza zzr(int i2) {
                zzbg();
                ((zzz) this.zza).zzK(i2);
                return this;
            }

            @Override // com.google.android.gms.internal.ads.zzbfp.zzaa
            public boolean zzs() {
                return ((zzz) this.zza).zzs();
            }

            @Override // com.google.android.gms.internal.ads.zzbfp.zzaa
            public zzq zzt() {
                return ((zzz) this.zza).zzt();
            }

            public zza zzu(zzq zzqVar) {
                zzbg();
                ((zzz) this.zza).zzL(zzqVar);
                return this;
            }

            public zza zzv() {
                zzbg();
                ((zzz) this.zza).zzM();
                return this;
            }

            @Override // com.google.android.gms.internal.ads.zzbfp.zzaa
            public boolean zzw() {
                return ((zzz) this.zza).zzw();
            }

            @Override // com.google.android.gms.internal.ads.zzbfp.zzaa
            public zzap zzx() {
                return ((zzz) this.zza).zzx();
            }

            public zza zzy(zzap zzapVar) {
                zzbg();
                ((zzz) this.zza).zzN(zzapVar);
                return this;
            }

            public zza zzz(zzap.zza zzaVar) {
                zzbg();
                ((zzz) this.zza).zzN(zzaVar.zzbu());
                return this;
            }

            private zza() {
                super(zzz.zzj);
            }
        }

        static {
            zzz zzzVar = new zzz();
            zzj = zzzVar;
            zziar.zzbu(zzz.class, zzzVar);
        }

        private zzz() {
        }

        public static zzz zzA() {
            return zzj;
        }

        public static zzick<zzz> zzB() {
            return zzj.zzbd();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzR, reason: merged with bridge method [inline-methods] */
        public void zzC(zzv zzvVar) {
            zzvVar.getClass();
            this.zzf = zzvVar;
            this.zze |= 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzS, reason: merged with bridge method [inline-methods] */
        public void zzD(zzv zzvVar) {
            zzvVar.getClass();
            zzv zzvVar2 = this.zzf;
            if (zzvVar2 != null && zzvVar2 != zzv.zzz()) {
                zzv.zza zzaVarZzy = zzv.zzy(zzvVar2);
                zzaVarZzy.zzbo(zzvVar);
                zzvVar = zzaVarZzy.zzbt();
            }
            this.zzf = zzvVar;
            this.zze |= 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzT, reason: merged with bridge method [inline-methods] */
        public void zzE() {
            this.zzf = null;
            this.zze &= -2;
        }

        private void zzU() {
            zzibd<zzan> zzibdVar = this.zzg;
            if (zzibdVar.zza()) {
                return;
            }
            this.zzg = zziar.zzbN(zzibdVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzV, reason: merged with bridge method [inline-methods] */
        public void zzF(int i2, zzan zzanVar) {
            zzanVar.getClass();
            zzU();
            this.zzg.set(i2, zzanVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzW, reason: merged with bridge method [inline-methods] */
        public void zzG(zzan zzanVar) {
            zzanVar.getClass();
            zzU();
            this.zzg.add(zzanVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzX, reason: merged with bridge method [inline-methods] */
        public void zzH(int i2, zzan zzanVar) {
            zzanVar.getClass();
            zzU();
            this.zzg.add(i2, zzanVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzY, reason: merged with bridge method [inline-methods] */
        public void zzI(Iterable<? extends zzan> iterable) {
            zzU();
            zzhyu.zzaW(iterable, this.zzg);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzZ, reason: merged with bridge method [inline-methods] */
        public void zzJ() {
            this.zzg = zziar.zzbM();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzaa, reason: merged with bridge method [inline-methods] */
        public void zzK(int i2) {
            zzU();
            this.zzg.remove(i2);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzab, reason: merged with bridge method [inline-methods] */
        public void zzL(zzq zzqVar) {
            this.zzh = zzqVar.zza();
            this.zze |= 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzac, reason: merged with bridge method [inline-methods] */
        public void zzM() {
            this.zze &= -3;
            this.zzh = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzad, reason: merged with bridge method [inline-methods] */
        public void zzN(zzap zzapVar) {
            zzapVar.getClass();
            this.zzi = zzapVar;
            this.zze |= 4;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzae, reason: merged with bridge method [inline-methods] */
        public void zzO(zzap zzapVar) {
            zzapVar.getClass();
            zzap zzapVar2 = this.zzi;
            if (zzapVar2 != null && zzapVar2 != zzap.zzs()) {
                zzap.zza zzaVarZzr = zzap.zzr(zzapVar2);
                zzaVarZzr.zzbo(zzapVar);
                zzapVar = zzaVarZzr.zzbt();
            }
            this.zzi = zzapVar;
            this.zze |= 4;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzaf, reason: merged with bridge method [inline-methods] */
        public void zzP() {
            this.zzi = null;
            this.zze &= -5;
        }

        public static zzz zze(ByteBuffer byteBuffer) throws zzibg {
            return (zzz) zziar.zzbR(zzj, byteBuffer);
        }

        public static zzz zzj(ByteBuffer byteBuffer, zziab zziabVar) throws zzibg {
            return (zzz) zziar.zzbQ(zzj, byteBuffer, zziabVar);
        }

        public static zzz zzk(zzhzl zzhzlVar) throws zzibg {
            return (zzz) zziar.zzbS(zzj, zzhzlVar);
        }

        public static zzz zzl(zzhzl zzhzlVar, zziab zziabVar) throws zzibg {
            return (zzz) zziar.zzbT(zzj, zzhzlVar, zziabVar);
        }

        public static zzz zzm(byte[] bArr) throws zzibg {
            return (zzz) zziar.zzbU(zzj, bArr);
        }

        public static zzz zzn(byte[] bArr, zziab zziabVar) throws zzibg {
            return (zzz) zziar.zzbV(zzj, bArr, zziabVar);
        }

        public static zzz zzo(InputStream inputStream) throws IOException {
            return (zzz) zziar.zzbW(zzj, inputStream);
        }

        public static zzz zzp(InputStream inputStream, zziab zziabVar) throws IOException {
            return (zzz) zziar.zzbX(zzj, inputStream, zziabVar);
        }

        public static zzz zzq(InputStream inputStream) throws IOException {
            return (zzz) zziar.zzca(zzj, inputStream);
        }

        public static zzz zzr(InputStream inputStream, zziab zziabVar) throws IOException {
            return (zzz) zziar.zzcb(zzj, inputStream, zziabVar);
        }

        public static zzz zzu(zzhzq zzhzqVar) throws IOException {
            return (zzz) zziar.zzbY(zzj, zzhzqVar);
        }

        public static zzz zzv(zzhzq zzhzqVar, zziab zziabVar) throws IOException {
            return (zzz) zziar.zzbZ(zzj, zzhzqVar, zziabVar);
        }

        public static zza zzy() {
            return (zza) zzj.zzbn();
        }

        public static zza zzz(zzz zzzVar) {
            return (zza) zzj.zzbo(zzzVar);
        }

        @Override // com.google.android.gms.internal.ads.zzbfp.zzaa
        public boolean zza() {
            return (this.zze & 1) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbfp.zzaa
        public zzv zzb() {
            zzv zzvVar = this.zzf;
            return zzvVar == null ? zzv.zzz() : zzvVar;
        }

        public List<? extends zzao> zzc() {
            return this.zzg;
        }

        public zzao zzd(int i2) {
            return this.zzg.get(i2);
        }

        @Override // com.google.android.gms.internal.ads.zziar
        public final Object zzdc(zziaq zziaqVar, Object obj, Object obj2) {
            zzick zziamVar;
            int iOrdinal = zziaqVar.ordinal();
            if (iOrdinal == 0) {
                return (byte) 1;
            }
            if (iOrdinal == 2) {
                return zziar.zzbv(zzj, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001ဉ\u0000\u0002\u001b\u0003᠌\u0001\u0004ဉ\u0002", new Object[]{"zze", "zzf", "zzg", zzan.class, "zzh", zzq.zze(), "zzi"});
            }
            if (iOrdinal == 3) {
                return new zzz();
            }
            byte[] bArr = null;
            if (iOrdinal == 4) {
                return new zza(bArr);
            }
            if (iOrdinal == 5) {
                return zzj;
            }
            if (iOrdinal != 6) {
                throw null;
            }
            zzick<zzz> zzickVar = zzk;
            if (zzickVar != null) {
                return zzickVar;
            }
            synchronized (zzz.class) {
                try {
                    zziamVar = zzk;
                    if (zziamVar == null) {
                        zziamVar = new zziam(zzj);
                        zzk = zziamVar;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return zziamVar;
        }

        @Override // com.google.android.gms.internal.ads.zzbfp.zzaa
        public List<zzan> zzg() {
            return this.zzg;
        }

        @Override // com.google.android.gms.internal.ads.zzbfp.zzaa
        public int zzh() {
            return this.zzg.size();
        }

        @Override // com.google.android.gms.internal.ads.zzbfp.zzaa
        public zzan zzi(int i2) {
            return this.zzg.get(i2);
        }

        @Override // com.google.android.gms.internal.ads.zzbfp.zzaa
        public boolean zzs() {
            return (this.zze & 2) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbfp.zzaa
        public zzq zzt() {
            zzq zzqVarZzc = zzq.zzc(this.zzh);
            return zzqVarZzc == null ? zzq.ENUM_FALSE : zzqVarZzc;
        }

        @Override // com.google.android.gms.internal.ads.zzbfp.zzaa
        public boolean zzw() {
            return (this.zze & 4) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbfp.zzaa
        public zzap zzx() {
            zzap zzapVar = this.zzi;
            return zzapVar == null ? zzap.zzs() : zzapVar;
        }
    }

    private zzbfp() {
    }

    public static void zza(zziab zziabVar) {
    }
}
