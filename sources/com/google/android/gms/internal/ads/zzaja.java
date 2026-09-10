package com.google.android.gms.internal.ads;

import android.util.SparseArray;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.inmobi.commons.core.configs.AdConfig;
import java.io.IOException;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* JADX INFO: loaded from: classes4.dex */
public final class zzaja implements zzaeo {
    public static final /* synthetic */ int zza = 0;
    private static final byte[] zzb = {49, 10, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 10};
    private static final byte[] zzc;
    private static final byte[] zzd;
    private static final byte[] zze;
    private static final UUID zzf;
    private static final Map zzg;
    private long zzA;
    private long zzB;
    private boolean zzC;
    private boolean zzD;
    private zzaiz zzE;
    private boolean zzF;
    private int zzG;
    private long zzH;
    private final SparseArray zzI;
    private boolean zzJ;
    private long zzK;
    private int zzL;
    private long zzM;
    private long zzN;
    private int zzO;
    private boolean zzP;
    private long zzQ;
    private long zzR;
    private long zzS;
    private boolean zzT;
    private int zzU;
    private long zzV;
    private long zzW;
    private int zzX;
    private int zzY;
    private int[] zzZ;
    private int zzaa;
    private int zzab;
    private int zzac;
    private int zzad;
    private boolean zzae;
    private long zzaf;
    private int zzag;
    private int zzah;
    private int zzai;
    private boolean zzaj;
    private boolean zzak;
    private boolean zzal;
    private int zzam;
    private byte zzan;
    private boolean zzao;
    private zzaer zzap;
    private final zzait zzaq;
    private final zzajc zzh;
    private final SparseArray zzi;
    private final boolean zzj;
    private final boolean zzk;
    private final zzalw zzl;
    private final zzer zzm;
    private final zzer zzn;
    private final zzer zzo;
    private final zzer zzp;
    private final zzer zzq;
    private final zzer zzr;
    private final zzer zzs;
    private final zzer zzt;
    private final zzer zzu;
    private final zzer zzv;
    private ByteBuffer zzw;
    private long zzx;
    private long zzy;
    private long zzz;

    static {
        String str = zzfj.zza;
        zzc = "Format: Start, End, ReadOrder, Layer, Style, Name, MarginL, MarginR, MarginV, Effect, Text".getBytes(StandardCharsets.UTF_8);
        zzd = new byte[]{68, 105, 97, 108, 111, 103, 117, 101, 58, 32, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44};
        zze = new byte[]{87, 69, 66, 86, 84, 84, 10, 10, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 10};
        zzf = new UUID(72057594037932032L, -9223371306706625679L);
        HashMap map = new HashMap();
        androidx.datastore.preferences.protobuf.a.v(0, map, "htc_video_rotA-000", 90, "htc_video_rotA-090");
        androidx.datastore.preferences.protobuf.a.v(180, map, "htc_video_rotA-180", 270, "htc_video_rotA-270");
        zzg = Collections.unmodifiableMap(map);
    }

    @Deprecated
    public zzaja() {
        this(new zzait(), 2, zzalw.zza);
    }

    private static int[] zzA(int[] iArr, int i2) {
        if (iArr == null) {
            return new int[i2];
        }
        int length = iArr.length;
        return length >= i2 ? iArr : new int[Math.max(length + length, i2)];
    }

    private final void zzB() {
        if (!this.zzD) {
            return;
        }
        int i2 = 0;
        while (true) {
            SparseArray sparseArray = this.zzi;
            if (i2 >= sparseArray.size()) {
                zzaer zzaerVar = this.zzap;
                zzaerVar.getClass();
                zzaerVar.zzv();
                this.zzD = false;
                return;
            }
            if (((zzaiz) sparseArray.valueAt(i2)).zzV) {
                return;
            } else {
                i2++;
            }
        }
    }

    @EnsuresNonNull
    private final void zzq(int i2) throws zzat {
        if (this.zzE != null) {
            return;
        }
        StringBuilder sb = new StringBuilder(String.valueOf(i2).length() + 32);
        sb.append("Element ");
        sb.append(i2);
        sb.append(" must be in a TrackEntry");
        throw zzat.zzb(sb.toString(), null);
    }

    private final void zzr(int i2) throws zzat {
        if (this.zzJ) {
            return;
        }
        StringBuilder sb = new StringBuilder(String.valueOf(i2).length() + 26);
        sb.append("Element ");
        sb.append(i2);
        sb.append(" must be in a Cues");
        throw zzat.zzb(sb.toString(), null);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:35:0x008f  */
    @RequiresNonNull
    private final void zzs(zzaiz zzaizVar, long j, int i2, int i3, int i4) {
        byte b2;
        byte[] bArrZzx;
        int i5;
        int iZze;
        zzagb zzagbVar = zzaizVar.zzU;
        if (zzagbVar != null) {
            zzagbVar.zzc(zzaizVar.zzY, j, i2, i3, i4, zzaizVar.zzj);
        } else {
            String str = zzaizVar.zzc;
            if ("S_TEXT/UTF8".equals(str) || "S_TEXT/ASS".equals(str) || "S_TEXT/SSA".equals(str) || "S_TEXT/WEBVTT".equals(str)) {
                if (this.zzY > 1) {
                    zzee.zzc("MatroskaExtractor", "Skipping subtitle sample in laced block.");
                } else {
                    long j2 = this.zzW;
                    if (j2 == -9223372036854775807L) {
                        zzee.zzc("MatroskaExtractor", "Skipping subtitle sample with no duration.");
                    } else {
                        zzer zzerVar = this.zzs;
                        byte[] bArrZzi = zzerVar.zzi();
                        switch (str) {
                            case "S_TEXT/ASS":
                                b2 = 1;
                                break;
                            case "S_TEXT/SSA":
                                b2 = 2;
                                break;
                            case "S_TEXT/WEBVTT":
                                b2 = 3;
                                break;
                            case "S_TEXT/UTF8":
                                b2 = 0;
                                break;
                            default:
                                b2 = -1;
                                break;
                        }
                        if (b2 == 0) {
                            bArrZzx = zzx(j2, "%02d:%02d:%02d,%03d", 1000L);
                            i5 = 19;
                        } else if (b2 == 1 || b2 == 2) {
                            bArrZzx = zzx(j2, "%01d:%02d:%02d:%02d", 10000L);
                            i5 = 21;
                        } else {
                            if (b2 != 3) {
                                throw new IllegalArgumentException();
                            }
                            bArrZzx = zzx(j2, "%02d:%02d:%02d.%03d", 1000L);
                            i5 = 25;
                        }
                        System.arraycopy(bArrZzx, 0, bArrZzi, i5, bArrZzx.length);
                        for (int iZzg = zzerVar.zzg(); iZzg < zzerVar.zze(); iZzg++) {
                            if (zzerVar.zzi()[iZzg] == 0) {
                                zzerVar.zzf(iZzg);
                                zzaizVar.zzY.zzz(zzerVar, zzerVar.zze());
                                iZze = zzerVar.zze() + i3;
                            }
                        }
                        zzaizVar.zzY.zzz(zzerVar, zzerVar.zze());
                        iZze = zzerVar.zze() + i3;
                    }
                }
                iZze = i3;
            } else {
                iZze = i3;
            }
            if ((i2 & 268435456) != 0) {
                if (this.zzY > 1) {
                    this.zzv.zza(0);
                } else {
                    zzer zzerVar2 = this.zzv;
                    int iZze2 = zzerVar2.zze();
                    zzaizVar.zzY.zzw(zzerVar2, iZze2, 2);
                    iZze += iZze2;
                }
            }
            zzaizVar.zzY.zzx(j, i2, iZze, i4, zzaizVar.zzj);
        }
        this.zzT = true;
    }

    private final void zzt(zzaep zzaepVar, int i2) throws IOException {
        zzer zzerVar = this.zzo;
        if (zzerVar.zze() >= i2) {
            return;
        }
        if (zzerVar.zzj() < i2) {
            int iZzj = zzerVar.zzj();
            zzerVar.zzc(Math.max(iZzj + iZzj, i2));
        }
        zzaepVar.zzc(zzerVar.zzi(), zzerVar.zze(), i2 - zzerVar.zze());
        zzerVar.zzf(i2);
    }

    @RequiresNonNull
    private final int zzu(zzaep zzaepVar, zzaiz zzaizVar, int i2, boolean z2) throws IOException {
        int i3;
        String str = zzaizVar.zzc;
        if ("S_TEXT/UTF8".equals(str)) {
            zzw(zzaepVar, zzb, i2);
            int i4 = this.zzah;
            zzv();
            return i4;
        }
        if ("S_TEXT/ASS".equals(str) || "S_TEXT/SSA".equals(str)) {
            zzw(zzaepVar, zzd, i2);
            int i5 = this.zzah;
            zzv();
            return i5;
        }
        if ("S_TEXT/WEBVTT".equals(str)) {
            zzw(zzaepVar, zze, i2);
            int i6 = this.zzah;
            zzv();
            return i6;
        }
        if (zzaizVar.zzV) {
            zzaizVar.zzZ.getClass();
            zzer zzerVar = new zzer(i2);
            if (zzaepVar.zzh(zzerVar.zzi(), 0, i2, true)) {
                zzaepVar.zzl();
                if (zzaen.zza(zzerVar.zzr()) == 1 && zzerVar.zzd() >= 10) {
                    byte[] bArr = new byte[10];
                    zzerVar.zzm(bArr, 0, 10);
                    zzerVar.zzh(0);
                    int iZzc = zzaen.zzc(bArr);
                    if (zzerVar.zzd() >= iZzc + 4) {
                        zzerVar.zzk(iZzc);
                        if (zzaen.zza(zzerVar.zzB()) == 2) {
                            zzt zztVarZza = zzaizVar.zzZ.zza();
                            zztVarZza.zzm("audio/vnd.dts.hd");
                            zzaizVar.zzZ = zztVarZza.zzM();
                        }
                    }
                }
            }
            zzaizVar.zzY.zzu(zzaizVar.zzZ);
            zzaizVar.zzV = false;
            zzB();
        }
        zzaga zzagaVar = zzaizVar.zzY;
        if (!this.zzaj) {
            if (zzaizVar.zzh) {
                this.zzac &= -1073741825;
                if (!this.zzak) {
                    zzer zzerVar2 = this.zzo;
                    zzaepVar.zzc(zzerVar2.zzi(), 0, 1);
                    this.zzag++;
                    if ((zzerVar2.zzi()[0] & 128) == 128) {
                        throw zzat.zzb("Extension bit is set in signal byte", null);
                    }
                    this.zzan = zzerVar2.zzi()[0];
                    this.zzak = true;
                }
                byte b2 = this.zzan;
                if ((b2 & 1) == 1) {
                    int i7 = b2 & 2;
                    this.zzac |= 1073741824;
                    if (!this.zzao) {
                        zzer zzerVar3 = this.zzt;
                        zzaepVar.zzc(zzerVar3.zzi(), 0, 8);
                        this.zzag += 8;
                        this.zzao = true;
                        zzer zzerVar4 = this.zzo;
                        zzerVar4.zzi()[0] = (byte) ((i7 != 2 ? 0 : 128) | 8);
                        zzerVar4.zzh(0);
                        zzagaVar.zzw(zzerVar4, 1, 1);
                        this.zzah++;
                        zzerVar3.zzh(0);
                        zzagaVar.zzw(zzerVar3, 8, 1);
                        this.zzah += 8;
                    }
                    if (i7 == 2) {
                        if (!this.zzal) {
                            zzer zzerVar5 = this.zzo;
                            zzaepVar.zzc(zzerVar5.zzi(), 0, 1);
                            this.zzag++;
                            zzerVar5.zzh(0);
                            this.zzam = zzerVar5.zzs();
                            this.zzal = true;
                        }
                        int i8 = this.zzam * 4;
                        zzer zzerVar6 = this.zzo;
                        zzerVar6.zza(i8);
                        zzaepVar.zzc(zzerVar6.zzi(), 0, i8);
                        this.zzag += i8;
                        int i9 = (this.zzam >> 1) + 1;
                        int i10 = (i9 * 6) + 2;
                        ByteBuffer byteBuffer = this.zzw;
                        if (byteBuffer == null || byteBuffer.capacity() < i10) {
                            this.zzw = ByteBuffer.allocate(i10);
                        }
                        this.zzw.position(0);
                        this.zzw.putShort((short) i9);
                        int i11 = 0;
                        int i12 = 0;
                        while (true) {
                            i3 = this.zzam;
                            if (i11 >= i3) {
                                break;
                            }
                            int iZzH = zzerVar6.zzH();
                            int i13 = iZzH - i12;
                            if (i11 % 2 == 0) {
                                this.zzw.putShort((short) i13);
                            } else {
                                this.zzw.putInt(i13);
                            }
                            i11++;
                            i12 = iZzH;
                        }
                        int i14 = (i2 - this.zzag) - i12;
                        if ((i3 & 1) == 1) {
                            this.zzw.putInt(i14);
                        } else {
                            this.zzw.putShort((short) i14);
                            this.zzw.putInt(0);
                        }
                        zzer zzerVar7 = this.zzu;
                        zzerVar7.zzb(this.zzw.array(), i10);
                        zzagaVar.zzw(zzerVar7, i10, 1);
                        this.zzah += i10;
                    }
                }
            } else {
                byte[] bArr2 = zzaizVar.zzi;
                if (bArr2 != null) {
                    this.zzr.zzb(bArr2, bArr2.length);
                }
            }
            if (!"A_OPUS".equals(zzaizVar.zzc) ? zzaizVar.zzg > 0 : z2) {
                this.zzac |= 268435456;
                this.zzv.zza(0);
                int iZze = (this.zzr.zze() + i2) - this.zzag;
                zzer zzerVar8 = this.zzo;
                zzerVar8.zza(4);
                zzerVar8.zzi()[0] = (byte) ((iZze >> 24) & 255);
                zzerVar8.zzi()[1] = (byte) ((iZze >> 16) & 255);
                zzerVar8.zzi()[2] = (byte) ((iZze >> 8) & 255);
                zzerVar8.zzi()[3] = (byte) (iZze & 255);
                zzagaVar.zzw(zzerVar8, 4, 2);
                this.zzah += 4;
            }
            this.zzaj = true;
        }
        zzer zzerVar9 = this.zzr;
        int iZze2 = zzerVar9.zze() + i2;
        String str2 = zzaizVar.zzc;
        if (!"V_MPEG4/ISO/AVC".equals(str2) && !"V_MPEGH/ISO/HEVC".equals(str2)) {
            if (zzaizVar.zzU != null) {
                zzgqa.zzi(zzerVar9.zze() == 0);
                zzaizVar.zzU.zzb(zzaepVar);
            }
            while (true) {
                int i15 = this.zzag;
                if (i15 >= iZze2) {
                    break;
                }
                int iZzy = zzy(zzaepVar, zzagaVar, iZze2 - i15);
                this.zzag += iZzy;
                this.zzah += iZzy;
            }
        } else {
            zzer zzerVar10 = this.zzn;
            byte[] bArrZzi = zzerVar10.zzi();
            bArrZzi[0] = 0;
            bArrZzi[1] = 0;
            bArrZzi[2] = 0;
            int i16 = zzaizVar.zzaa;
            int i17 = 4 - i16;
            while (this.zzag < iZze2) {
                int i18 = this.zzai;
                if (i18 == 0) {
                    int iMin = Math.min(i16, zzerVar9.zzd());
                    zzaepVar.zzc(bArrZzi, i17 + iMin, i16 - iMin);
                    if (iMin > 0) {
                        zzerVar9.zzm(bArrZzi, i17, iMin);
                    }
                    this.zzag += i16;
                    zzerVar10.zzh(0);
                    this.zzai = zzerVar10.zzH();
                    zzer zzerVar11 = this.zzm;
                    zzerVar11.zzh(0);
                    zzagaVar.zzz(zzerVar11, 4);
                    this.zzah += 4;
                } else {
                    int iZzy2 = zzy(zzaepVar, zzagaVar, i18);
                    this.zzag += iZzy2;
                    this.zzah += iZzy2;
                    this.zzai -= iZzy2;
                }
            }
        }
        if ("A_VORBIS".equals(zzaizVar.zzc)) {
            zzer zzerVar12 = this.zzp;
            zzerVar12.zzh(0);
            zzagaVar.zzz(zzerVar12, 4);
            this.zzah += 4;
        }
        int i19 = this.zzah;
        zzv();
        return i19;
    }

    private final void zzv() {
        this.zzag = 0;
        this.zzah = 0;
        this.zzai = 0;
        this.zzaj = false;
        this.zzak = false;
        this.zzal = false;
        this.zzam = 0;
        this.zzan = (byte) 0;
        this.zzao = false;
        this.zzr.zza(0);
    }

    private final void zzw(zzaep zzaepVar, byte[] bArr, int i2) throws IOException {
        int length = bArr.length;
        int i3 = length + i2;
        zzer zzerVar = this.zzs;
        if (zzerVar.zzj() < i3) {
            byte[] bArrCopyOf = Arrays.copyOf(bArr, i3 + i2);
            zzerVar.zzb(bArrCopyOf, bArrCopyOf.length);
        } else {
            System.arraycopy(bArr, 0, zzerVar.zzi(), 0, length);
        }
        zzaepVar.zzc(zzerVar.zzi(), length, i2);
        zzerVar.zzh(0);
        zzerVar.zzf(i3);
    }

    private static byte[] zzx(long j, String str, long j2) {
        zzgqa.zza(j != -9223372036854775807L);
        Locale locale = Locale.US;
        int i2 = (int) (j / 3600000000L);
        Integer numValueOf = Integer.valueOf(i2);
        long j3 = j - (((long) i2) * 3600000000L);
        int i3 = (int) (j3 / 60000000);
        Integer numValueOf2 = Integer.valueOf(i3);
        long j4 = j3 - (((long) i3) * 60000000);
        int i4 = (int) (j4 / 1000000);
        String str2 = String.format(locale, str, numValueOf, numValueOf2, Integer.valueOf(i4), Integer.valueOf((int) ((j4 - (((long) i4) * 1000000)) / j2)));
        String str3 = zzfj.zza;
        return str2.getBytes(StandardCharsets.UTF_8);
    }

    private final int zzy(zzaep zzaepVar, zzaga zzagaVar, int i2) throws IOException {
        zzer zzerVar = this.zzr;
        int iZzd = zzerVar.zzd();
        if (iZzd <= 0) {
            return zzagaVar.zzy(zzaepVar, i2, false);
        }
        int iMin = Math.min(i2, iZzd);
        zzagaVar.zzz(zzerVar, iMin);
        return iMin;
    }

    private final long zzz(long j) throws zzat {
        long j2 = this.zzz;
        if (j2 != -9223372036854775807L) {
            return zzfj.zzt(j, j2, 1000L, RoundingMode.DOWN);
        }
        throw zzat.zzb("Can't scale timecode prior to timecodeScale being set.", null);
    }

    @Override // com.google.android.gms.internal.ads.zzaeo
    public final boolean zza(zzaep zzaepVar) throws IOException {
        return new zzajb().zza(zzaepVar);
    }

    @Override // com.google.android.gms.internal.ads.zzaeo
    public final void zzc(zzaer zzaerVar) {
        if (this.zzk) {
            zzaerVar = new zzalz(zzaerVar, this.zzl);
        }
        this.zzap = zzaerVar;
    }

    @Override // com.google.android.gms.internal.ads.zzaeo
    public final int zzd(zzaep zzaepVar, zzafo zzafoVar) throws IOException {
        int i2 = 0;
        this.zzT = false;
        while (!this.zzT) {
            if (this.zzaq.zzc(zzaepVar)) {
                long jZzn = zzaepVar.zzn();
                if (this.zzP) {
                    this.zzR = jZzn;
                    zzafoVar.zza = this.zzQ;
                    this.zzP = false;
                    return 1;
                }
                if (this.zzF) {
                    long j = this.zzR;
                    if (j != -1) {
                        zzafoVar.zza = j;
                        this.zzR = -1L;
                        return 1;
                    }
                }
            } else {
                while (true) {
                    SparseArray sparseArray = this.zzi;
                    if (i2 >= sparseArray.size()) {
                        return -1;
                    }
                    zzaiz zzaizVar = (zzaiz) sparseArray.valueAt(i2);
                    zzaizVar.zzb();
                    zzagb zzagbVar = zzaizVar.zzU;
                    if (zzagbVar != null) {
                        zzagbVar.zzd(zzaizVar.zzY, zzaizVar.zzj);
                    }
                    i2++;
                }
            }
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzaeo
    public final void zze(long j, long j2) {
        this.zzS = -9223372036854775807L;
        int i2 = 0;
        this.zzU = 0;
        this.zzaq.zzb();
        this.zzh.zza();
        zzv();
        this.zzJ = false;
        this.zzK = -9223372036854775807L;
        this.zzL = -1;
        this.zzM = -1L;
        this.zzN = -1L;
        if (!this.zzF) {
            this.zzI.clear();
        }
        while (true) {
            SparseArray sparseArray = this.zzi;
            if (i2 >= sparseArray.size()) {
                return;
            }
            zzagb zzagbVar = ((zzaiz) sparseArray.valueAt(i2)).zzU;
            if (zzagbVar != null) {
                zzagbVar.zza();
            }
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaeo
    public final void zzf() {
    }

    public final void zzh(int i2, long j, long j2) throws zzat {
        zzaer zzaerVar = this.zzap;
        zzaerVar.getClass();
        if (i2 == 160) {
            this.zzae = false;
            this.zzaf = 0L;
            return;
        }
        if (i2 == 174) {
            zzaiz zzaizVar = new zzaiz();
            this.zzE = zzaizVar;
            zzaizVar.zza = this.zzC;
            return;
        }
        if (i2 == 183) {
            if (this.zzF) {
                return;
            }
            zzr(i2);
            this.zzL = -1;
            this.zzM = -1L;
            this.zzN = -1L;
            return;
        }
        if (i2 == 187) {
            if (this.zzF) {
                return;
            }
            zzr(i2);
            this.zzK = -9223372036854775807L;
            return;
        }
        if (i2 == 19899) {
            this.zzG = -1;
            this.zzH = -1L;
            return;
        }
        if (i2 == 20533) {
            zzq(i2);
            this.zzE.zzh = true;
            return;
        }
        if (i2 == 21968) {
            zzq(i2);
            this.zzE.zzy = true;
            return;
        }
        if (i2 == 408125543) {
            long j3 = this.zzy;
            if (j3 != -1 && j3 != j) {
                throw zzat.zzb("Multiple Segment elements not supported", null);
            }
            this.zzy = j;
            this.zzx = j2;
            return;
        }
        if (i2 == 475249515) {
            if (this.zzF) {
                return;
            }
            this.zzJ = true;
        } else if (i2 == 524531317 && !this.zzF) {
            if (this.zzj && this.zzQ != -1) {
                this.zzP = true;
            } else {
                zzaerVar.zzw(new zzafq(this.zzB, 0L));
                this.zzF = true;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:319:0x01ea A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:321:0x01d4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:323:0x0114 A[EDGE_INSN: B:323:0x0114->B:55:0x0114 BREAK  A[LOOP:2: B:52:0x0101->B:66:0x0175], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:325:0x0175 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:326:0x0175 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:40:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:42:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:49:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:51:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:53:0x0103  */
    /* JADX WARN: Code duplicated, block: B:56:0x011a  */
    /* JADX WARN: Code duplicated, block: B:58:0x0124  */
    /* JADX WARN: Code duplicated, block: B:60:0x0154  */
    /* JADX WARN: Code duplicated, block: B:63:0x016b  */
    /* JADX WARN: Code duplicated, block: B:65:0x0172  */
    /* JADX WARN: Code duplicated, block: B:69:0x0182  */
    /* JADX WARN: Code duplicated, block: B:72:0x0190  */
    /* JADX WARN: Code duplicated, block: B:74:0x019e  */
    /* JADX WARN: Code duplicated, block: B:75:0x01ab  */
    /* JADX WARN: Code duplicated, block: B:79:0x01c7  */
    public final void zzi(int i2) throws zzat {
        int i3;
        int i4;
        int i5;
        int i6;
        SparseArray sparseArray;
        zzaiz zzaizVar;
        long j;
        long j2;
        long j3;
        long j4;
        List list;
        int iMin;
        double d;
        int i7;
        int i8;
        int i9;
        SparseArray sparseArray2;
        long jZza;
        zzaix zzaixVar;
        int i10;
        long jZzb;
        long jZzb2;
        long jZza2;
        long j5;
        long j6;
        double d2;
        zzap zzapVar;
        zzahq zzahqVar;
        zzap zzapVarZzg;
        int i11 = 0;
        this.zzap.getClass();
        long j7 = 0;
        int i12 = 2;
        if (i2 == 160) {
            if (this.zzU == 2) {
                zzaiz zzaizVar2 = (zzaiz) this.zzi.get(this.zzaa);
                zzaizVar2.zzb();
                if (this.zzaf > 0 && "A_OPUS".equals(zzaizVar2.zzc)) {
                    zzer zzerVar = this.zzv;
                    byte[] bArrArray = ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putLong(this.zzaf).array();
                    zzerVar.zzb(bArrArray, bArrArray.length);
                }
                int i13 = 0;
                for (int i14 = 0; i14 < this.zzY; i14++) {
                    i13 += this.zzZ[i14];
                }
                int i15 = 0;
                while (i15 < this.zzY) {
                    long j8 = this.zzV + ((long) ((zzaizVar2.zzf * i15) / 1000));
                    int i16 = this.zzac;
                    if (i15 == 0) {
                        if (!this.zzae) {
                            i16 |= 1;
                        }
                        i3 = 0;
                    } else {
                        i3 = i15;
                    }
                    int i17 = this.zzZ[i3];
                    int i18 = i13 - i17;
                    zzs(zzaizVar2, j8, i16, i17, i18);
                    i15 = i3 + 1;
                    i13 = i18;
                }
                this.zzU = 0;
                return;
            }
            return;
        }
        int i19 = 20;
        if (i2 == 174) {
            zzaiz zzaizVar3 = this.zzE;
            zzaizVar3.getClass();
            String str = zzaizVar3.zzc;
            if (str == null) {
                throw zzat.zzb("CodecId is missing in TrackEntry element", null);
            }
            switch (str) {
                case "V_VP8":
                case "V_VP9":
                case "V_AV1":
                case "V_MPEG2":
                case "V_MPEG4/ISO/SP":
                case "V_MPEG4/ISO/ASP":
                case "V_MPEG4/ISO/AP":
                case "V_MPEG4/ISO/AVC":
                case "V_MPEGH/ISO/HEVC":
                case "V_MS/VFW/FOURCC":
                case "V_THEORA":
                case "A_OPUS":
                case "A_VORBIS":
                case "A_AAC":
                case "A_MPEG/L2":
                case "A_MPEG/L3":
                case "A_AC3":
                case "A_EAC3":
                case "A_TRUEHD":
                case "A_DTS":
                case "A_DTS/EXPRESS":
                case "A_DTS/LOSSLESS":
                case "A_FLAC":
                case "A_MS/ACM":
                case "A_PCM/INT/LIT":
                case "A_PCM/INT/BIG":
                case "A_PCM/FLOAT/IEEE":
                case "S_TEXT/UTF8":
                case "S_TEXT/ASS":
                case "S_TEXT/SSA":
                case "S_TEXT/WEBVTT":
                case "S_VOBSUB":
                case "S_HDMV/PGS":
                case "S_DVBSUB":
                    zzaizVar3.zza(zzaizVar3.zzd);
                    zzaizVar3.zzY = this.zzap.zzu(zzaizVar3.zzd, zzaizVar3.zze);
                    this.zzi.put(zzaizVar3.zzd, zzaizVar3);
                    break;
            }
            this.zzE = null;
            return;
        }
        long j9 = -9223372036854775807L;
        if (i2 == 183) {
            if (this.zzF) {
                return;
            }
            zzr(i2);
            if (this.zzK == -9223372036854775807L || (i4 = this.zzL) == -1 || this.zzM == -1) {
                return;
            }
            SparseArray sparseArray3 = this.zzI;
            List arrayList = (List) sparseArray3.get(i4);
            if (arrayList == null) {
                arrayList = new ArrayList();
                sparseArray3.put(this.zzL, arrayList);
            }
            arrayList.add(new zzaix(this.zzK, this.zzy + this.zzM, this.zzN, null));
            return;
        }
        if (i2 == 19899) {
            int i20 = this.zzG;
            if (i20 != -1) {
                long j10 = this.zzH;
                if (j10 != -1) {
                    if (i20 == 475249515) {
                        this.zzQ = j10;
                        return;
                    }
                    return;
                }
            }
            throw zzat.zzb("Mandatory element SeekID or SeekPosition not found", null);
        }
        if (i2 == 25152) {
            zzq(i2);
            zzaiz zzaizVar4 = this.zzE;
            if (zzaizVar4.zzh) {
                if (zzaizVar4.zzj == null) {
                    throw zzat.zzb("Encrypted Track found but ContentEncKeyID was not found", null);
                }
                zzaizVar4.zzl = new zzq(null, new zzp(zzg.zza, null, "video/webm", this.zzE.zzj.zzb));
                return;
            }
            return;
        }
        if (i2 == 28032) {
            zzq(i2);
            zzaiz zzaizVar5 = this.zzE;
            if (zzaizVar5.zzh && zzaizVar5.zzi != null) {
                throw zzat.zzb("Combining encryption and compression is not supported", null);
            }
            return;
        }
        if (i2 == 357149030) {
            if (this.zzz == -9223372036854775807L) {
                this.zzz = 1000000L;
            }
            long j11 = this.zzA;
            if (j11 != -9223372036854775807L) {
                this.zzB = zzz(j11);
                return;
            }
            return;
        }
        if (i2 == 374648427) {
            SparseArray sparseArray4 = this.zzi;
            if (sparseArray4.size() == 0) {
                throw zzat.zzb("No valid tracks were found", null);
            }
            boolean z2 = !this.zzj || this.zzQ == -1;
            int i21 = -1;
            int i22 = -1;
            int i23 = -1;
            int i24 = -1;
            for (int i25 = 0; i25 < sparseArray4.size(); i25++) {
                zzaiz zzaizVar6 = (zzaiz) sparseArray4.valueAt(i25);
                int i26 = zzaizVar6.zze;
                if (i26 == 2) {
                    if (zzaizVar6.zzX) {
                        i21 = zzaizVar6.zzd;
                    }
                    if (i22 == -1) {
                        i22 = zzaizVar6.zzd;
                    }
                } else if (i26 == 1) {
                    if (zzaizVar6.zzX) {
                        i23 = zzaizVar6.zzd;
                    }
                    if (i24 == -1) {
                        i24 = zzaizVar6.zzd;
                    }
                }
                if (z2) {
                    zzaizVar6.zzb();
                    if (!zzaizVar6.zzV) {
                        zzaga zzagaVar = zzaizVar6.zzY;
                        zzv zzvVar = zzaizVar6.zzZ;
                        zzvVar.getClass();
                        zzagaVar.zzu(zzvVar);
                    }
                }
            }
            if (i21 != -1) {
                this.zzO = i21;
            } else if (i22 != -1) {
                this.zzO = i22;
            } else if (i23 != -1) {
                this.zzO = i23;
            } else if (i24 != -1) {
                this.zzO = i24;
            } else {
                this.zzO = sparseArray4.size() > 0 ? ((zzaiz) sparseArray4.valueAt(0)).zzd : -1;
            }
            if (z2) {
                zzB();
                return;
            }
            return;
        }
        if (i2 != 475249515 || this.zzF) {
            return;
        }
        int i27 = 0;
        while (true) {
            SparseArray sparseArray5 = this.zzI;
            if (i27 < sparseArray5.size()) {
                if (((List) sparseArray5.valueAt(i27)).isEmpty()) {
                    i27++;
                } else {
                    if (this.zzB != -9223372036854775807L) {
                        for (int i28 = 0; i28 < sparseArray5.size(); i28++) {
                            Collections.sort((List) sparseArray5.valueAt(i28));
                        }
                        i5 = -1;
                        this.zzap.zzw(new zzaiy(sparseArray5, this.zzB, this.zzO, this.zzy, this.zzx));
                    }
                    this.zzF = true;
                    this.zzJ = false;
                    i6 = 0;
                    while (true) {
                        sparseArray = this.zzi;
                        if (i6 < sparseArray.size()) {
                            zzB();
                            return;
                        }
                        zzaizVar = (zzaiz) sparseArray.valueAt(i6);
                        j = this.zzB;
                        j2 = this.zzy;
                        j3 = j7;
                        j4 = this.zzx;
                        if (zzaizVar.zze == i12 || (list = (List) sparseArray5.get(zzaizVar.zzd)) == null || list.isEmpty()) {
                            i9 = i6;
                            sparseArray2 = sparseArray5;
                            i7 = i11;
                        } else {
                            if (list.isEmpty()) {
                                i9 = i6;
                                sparseArray2 = sparseArray5;
                                i7 = i11;
                            } else {
                                iMin = Math.min(list.size(), i19);
                                d = 0.0d;
                                i7 = i11;
                                i8 = i5;
                                while (i11 < iMin) {
                                    zzaixVar = (zzaix) list.get(i11);
                                    if (zzaixVar.zza() > 10000000) {
                                        break;
                                    }
                                    i10 = i11 + 1;
                                    if (i11 < list.size() - 1) {
                                        zzaix zzaixVar2 = (zzaix) list.get(i10);
                                        jZzb = zzaixVar2.zzb() + zzaixVar2.zzc();
                                        jZzb2 = zzaixVar.zzb() + zzaixVar.zzc();
                                        jZza2 = zzaixVar2.zza() - zzaixVar.zza();
                                    } else {
                                        jZzb = j2 + j4;
                                        jZzb2 = zzaixVar.zzb() + zzaixVar.zzc();
                                        jZza2 = j - zzaixVar.zza();
                                    }
                                    j5 = jZzb - jZzb2;
                                    int i29 = i6;
                                    SparseArray sparseArray6 = sparseArray5;
                                    long j12 = j4;
                                    j6 = jZza2;
                                    if (j6 > j3) {
                                        d2 = j5 / j6;
                                        if (d2 > d) {
                                            d = d2;
                                            i8 = i11;
                                        }
                                    }
                                    sparseArray5 = sparseArray6;
                                    i11 = i10;
                                    i6 = i29;
                                    j4 = j12;
                                }
                                i9 = i6;
                                sparseArray2 = sparseArray5;
                                if (i8 == i5) {
                                    jZza = ((zzaix) list.get(i8)).zza();
                                }
                                if (jZza != j9) {
                                    zzv zzvVar2 = zzaizVar.zzZ;
                                    zzvVar2.getClass();
                                    zzapVar = zzvVar2.zzl;
                                    zzahqVar = new zzahq(jZza);
                                    if (zzapVar == null) {
                                        zzao[] zzaoVarArr = new zzao[1];
                                        zzaoVarArr[i7] = zzahqVar;
                                        zzapVarZzg = new zzap(j9, zzaoVarArr);
                                    } else {
                                        zzao[] zzaoVarArr2 = new zzao[1];
                                        zzaoVarArr2[i7] = zzahqVar;
                                        zzapVarZzg = zzapVar.zzg(zzaoVarArr2);
                                    }
                                    zzt zztVarZza = zzaizVar.zzZ.zza();
                                    zztVarZza.zzk(zzapVarZzg);
                                    zzaizVar.zzZ = zztVarZza.zzM();
                                }
                            }
                            jZza = j9;
                            if (jZza != j9) {
                                zzv zzvVar3 = zzaizVar.zzZ;
                                zzvVar3.getClass();
                                zzapVar = zzvVar3.zzl;
                                zzahqVar = new zzahq(jZza);
                                if (zzapVar == null) {
                                    zzao[] zzaoVarArr3 = new zzao[1];
                                    zzaoVarArr3[i7] = zzahqVar;
                                    zzapVarZzg = new zzap(j9, zzaoVarArr3);
                                } else {
                                    zzao[] zzaoVarArr4 = new zzao[1];
                                    zzaoVarArr4[i7] = zzahqVar;
                                    zzapVarZzg = zzapVar.zzg(zzaoVarArr4);
                                }
                                zzt zztVarZza2 = zzaizVar.zzZ.zza();
                                zztVarZza2.zzk(zzapVarZzg);
                                zzaizVar.zzZ = zztVarZza2.zzM();
                            }
                        }
                        if (!zzaizVar.zzV) {
                            zzaizVar.zzb();
                            zzaga zzagaVar2 = zzaizVar.zzY;
                            zzv zzvVar4 = zzaizVar.zzZ;
                            zzvVar4.getClass();
                            zzagaVar2.zzu(zzvVar4);
                        }
                        i6 = i9 + 1;
                        sparseArray5 = sparseArray2;
                        j7 = j3;
                        i11 = i7;
                        i12 = 2;
                        i19 = 20;
                        j9 = -9223372036854775807L;
                        i5 = -1;
                    }
                }
            }
            i5 = -1;
            this.zzap.zzw(new zzafq(this.zzB, 0L));
            this.zzF = true;
            this.zzJ = false;
            i6 = 0;
            while (true) {
                sparseArray = this.zzi;
                if (i6 < sparseArray.size()) {
                    zzB();
                    return;
                }
                zzaizVar = (zzaiz) sparseArray.valueAt(i6);
                j = this.zzB;
                j2 = this.zzy;
                j3 = j7;
                j4 = this.zzx;
                if (zzaizVar.zze == i12) {
                    i9 = i6;
                    sparseArray2 = sparseArray5;
                    i7 = i11;
                } else {
                    if (list.isEmpty()) {
                        i9 = i6;
                        sparseArray2 = sparseArray5;
                        i7 = i11;
                    } else {
                        iMin = Math.min(list.size(), i19);
                        d = 0.0d;
                        i7 = i11;
                        i8 = i5;
                        while (i11 < iMin) {
                            zzaixVar = (zzaix) list.get(i11);
                            if (zzaixVar.zza() > 10000000) {
                                break;
                                break;
                            }
                            i10 = i11 + 1;
                            if (i11 < list.size() - 1) {
                                zzaix zzaixVar3 = (zzaix) list.get(i10);
                                jZzb = zzaixVar3.zzb() + zzaixVar3.zzc();
                                jZzb2 = zzaixVar.zzb() + zzaixVar.zzc();
                                jZza2 = zzaixVar3.zza() - zzaixVar.zza();
                            } else {
                                jZzb = j2 + j4;
                                jZzb2 = zzaixVar.zzb() + zzaixVar.zzc();
                                jZza2 = j - zzaixVar.zza();
                            }
                            j5 = jZzb - jZzb2;
                            int i210 = i6;
                            SparseArray sparseArray7 = sparseArray5;
                            long j13 = j4;
                            j6 = jZza2;
                            if (j6 > j3) {
                                d2 = j5 / j6;
                                if (d2 > d) {
                                    d = d2;
                                    i8 = i11;
                                }
                            }
                            sparseArray5 = sparseArray7;
                            i11 = i10;
                            i6 = i210;
                            j4 = j13;
                        }
                        i9 = i6;
                        sparseArray2 = sparseArray5;
                        if (i8 == i5) {
                            jZza = ((zzaix) list.get(i8)).zza();
                        }
                        if (jZza != j9) {
                            zzv zzvVar5 = zzaizVar.zzZ;
                            zzvVar5.getClass();
                            zzapVar = zzvVar5.zzl;
                            zzahqVar = new zzahq(jZza);
                            if (zzapVar == null) {
                                zzao[] zzaoVarArr5 = new zzao[1];
                                zzaoVarArr5[i7] = zzahqVar;
                                zzapVarZzg = new zzap(j9, zzaoVarArr5);
                            } else {
                                zzao[] zzaoVarArr6 = new zzao[1];
                                zzaoVarArr6[i7] = zzahqVar;
                                zzapVarZzg = zzapVar.zzg(zzaoVarArr6);
                            }
                            zzt zztVarZza3 = zzaizVar.zzZ.zza();
                            zztVarZza3.zzk(zzapVarZzg);
                            zzaizVar.zzZ = zztVarZza3.zzM();
                        }
                    }
                    jZza = j9;
                    if (jZza != j9) {
                        zzv zzvVar6 = zzaizVar.zzZ;
                        zzvVar6.getClass();
                        zzapVar = zzvVar6.zzl;
                        zzahqVar = new zzahq(jZza);
                        if (zzapVar == null) {
                            zzao[] zzaoVarArr7 = new zzao[1];
                            zzaoVarArr7[i7] = zzahqVar;
                            zzapVarZzg = new zzap(j9, zzaoVarArr7);
                        } else {
                            zzao[] zzaoVarArr8 = new zzao[1];
                            zzaoVarArr8[i7] = zzahqVar;
                            zzapVarZzg = zzapVar.zzg(zzaoVarArr8);
                        }
                        zzt zztVarZza4 = zzaizVar.zzZ.zza();
                        zztVarZza4.zzk(zzapVarZzg);
                        zzaizVar.zzZ = zztVarZza4.zzM();
                    }
                }
                if (!zzaizVar.zzV) {
                    zzaizVar.zzb();
                    zzaga zzagaVar3 = zzaizVar.zzY;
                    zzv zzvVar7 = zzaizVar.zzZ;
                    zzvVar7.getClass();
                    zzagaVar3.zzu(zzvVar7);
                }
                i6 = i9 + 1;
                sparseArray5 = sparseArray2;
                j7 = j3;
                i11 = i7;
                i12 = 2;
                i19 = 20;
                j9 = -9223372036854775807L;
                i5 = -1;
            }
        }
    }

    public final void zzj(int i2, long j) throws zzat {
        boolean z2;
        if (i2 == 240) {
            if (this.zzF) {
                return;
            }
            zzr(i2);
            if (this.zzN == -1) {
                this.zzN = j;
                return;
            }
            return;
        }
        if (i2 == 241) {
            if (this.zzF) {
                return;
            }
            zzr(i2);
            if (this.zzM == -1) {
                this.zzM = j;
                return;
            }
            return;
        }
        if (i2 == 20529) {
            if (j == 0) {
                return;
            }
            StringBuilder sb = new StringBuilder(String.valueOf(j).length() + 35);
            sb.append("ContentEncodingOrder ");
            sb.append(j);
            sb.append(" not supported");
            throw zzat.zzb(sb.toString(), null);
        }
        if (i2 == 20530) {
            if (j == 1) {
                return;
            }
            StringBuilder sb2 = new StringBuilder(String.valueOf(j).length() + 35);
            sb2.append("ContentEncodingScope ");
            sb2.append(j);
            sb2.append(" not supported");
            throw zzat.zzb(sb2.toString(), null);
        }
        switch (i2) {
            case 131:
                int i3 = (int) j;
                if (i3 == 1) {
                    zzq(i2);
                    this.zzE.zze = 2;
                    return;
                }
                if (i3 == 2) {
                    zzq(i2);
                    this.zzE.zze = 1;
                    return;
                } else if (i3 == 17) {
                    zzq(i2);
                    this.zzE.zze = 3;
                    return;
                } else if (i3 != 33) {
                    zzq(i2);
                    this.zzE.zze = -1;
                    return;
                } else {
                    zzq(i2);
                    this.zzE.zze = 5;
                    return;
                }
            case PRIVACY_URL_ERROR_VALUE:
                z2 = j == 1;
                zzq(i2);
                this.zzE.zzX = z2;
                return;
            case ModuleDescriptor.MODULE_VERSION /* 155 */:
                this.zzW = zzz(j);
                return;
            case 159:
                zzq(i2);
                this.zzE.zzP = (int) j;
                return;
            case 176:
                zzq(i2);
                this.zzE.zzm = (int) j;
                return;
            case 179:
                if (this.zzF) {
                    return;
                }
                zzr(i2);
                this.zzK = zzz(j);
                return;
            case 186:
                zzq(i2);
                this.zzE.zzn = (int) j;
                return;
            case AD_RESPONSE_EMPTY_VALUE:
                zzq(i2);
                this.zzE.zzd = (int) j;
                return;
            case 231:
                this.zzS = zzz(j);
                return;
            case 238:
                this.zzad = (int) j;
                return;
            case 247:
                if (this.zzF) {
                    return;
                }
                zzr(i2);
                this.zzL = (int) j;
                return;
            case 251:
                this.zzae = true;
                return;
            case 16871:
                zzq(i2);
                this.zzE.zzd((int) j);
                return;
            case 16980:
                if (j == 3) {
                    return;
                }
                StringBuilder sb3 = new StringBuilder(String.valueOf(j).length() + 30);
                sb3.append("ContentCompAlgo ");
                sb3.append(j);
                sb3.append(" not supported");
                throw zzat.zzb(sb3.toString(), null);
            case 17029:
                if (j < 1 || j > 2) {
                    StringBuilder sb4 = new StringBuilder(String.valueOf(j).length() + 33);
                    sb4.append("DocTypeReadVersion ");
                    sb4.append(j);
                    sb4.append(" not supported");
                    throw zzat.zzb(sb4.toString(), null);
                }
                return;
            case 17143:
                if (j == 1) {
                    return;
                }
                StringBuilder sb5 = new StringBuilder(String.valueOf(j).length() + 30);
                sb5.append("EBMLReadVersion ");
                sb5.append(j);
                sb5.append(" not supported");
                throw zzat.zzb(sb5.toString(), null);
            case 18401:
                if (j == 5) {
                    return;
                }
                StringBuilder sb6 = new StringBuilder(String.valueOf(j).length() + 29);
                sb6.append("ContentEncAlgo ");
                sb6.append(j);
                sb6.append(" not supported");
                throw zzat.zzb(sb6.toString(), null);
            case 18408:
                if (j == 1) {
                    return;
                }
                StringBuilder sb7 = new StringBuilder(String.valueOf(j).length() + 36);
                sb7.append("AESSettingsCipherMode ");
                sb7.append(j);
                sb7.append(" not supported");
                throw zzat.zzb(sb7.toString(), null);
            case 21420:
                this.zzH = j + this.zzy;
                return;
            case 21432:
                int i4 = (int) j;
                zzq(i2);
                if (i4 == 0) {
                    this.zzE.zzx = 0;
                    return;
                }
                if (i4 == 1) {
                    this.zzE.zzx = 2;
                    return;
                } else if (i4 == 3) {
                    this.zzE.zzx = 1;
                    return;
                } else {
                    if (i4 != 15) {
                        return;
                    }
                    this.zzE.zzx = 3;
                    return;
                }
            case 21680:
                zzq(i2);
                this.zzE.zzp = (int) j;
                return;
            case 21682:
                zzq(i2);
                this.zzE.zzr = (int) j;
                return;
            case 21690:
                zzq(i2);
                this.zzE.zzq = (int) j;
                return;
            case 21930:
                z2 = j == 1;
                zzq(i2);
                this.zzE.zzW = z2;
                return;
            case 21938:
                zzq(i2);
                zzaiz zzaizVar = this.zzE;
                zzaizVar.zzy = true;
                zzaizVar.zzo = (int) j;
                return;
            case 21998:
                zzq(i2);
                this.zzE.zzg = (int) j;
                return;
            case 22186:
                zzq(i2);
                this.zzE.zzS = j;
                return;
            case 22203:
                zzq(i2);
                this.zzE.zzT = j;
                return;
            case 25188:
                zzq(i2);
                this.zzE.zzQ = (int) j;
                return;
            case 30114:
                this.zzaf = j;
                return;
            case 30321:
                int i5 = (int) j;
                zzq(i2);
                if (i5 == 0) {
                    this.zzE.zzs = 0;
                    return;
                }
                if (i5 == 1) {
                    this.zzE.zzs = 1;
                    return;
                } else if (i5 == 2) {
                    this.zzE.zzs = 2;
                    return;
                } else {
                    if (i5 != 3) {
                        return;
                    }
                    this.zzE.zzs = 3;
                    return;
                }
            case 2352003:
                zzq(i2);
                this.zzE.zzf = (int) j;
                return;
            case 2807729:
                this.zzz = j;
                return;
            default:
                switch (i2) {
                    case 21945:
                        int i6 = (int) j;
                        zzq(i2);
                        if (i6 == 1) {
                            this.zzE.zzB = 2;
                            return;
                        } else {
                            if (i6 != 2) {
                                return;
                            }
                            this.zzE.zzB = 1;
                            return;
                        }
                    case 21946:
                        zzq(i2);
                        int iZzc = zzi.zzc((int) j);
                        if (iZzc != -1) {
                            this.zzE.zzA = iZzc;
                            return;
                        }
                        return;
                    case 21947:
                        zzq(i2);
                        this.zzE.zzy = true;
                        int iZzb = zzi.zzb((int) j);
                        if (iZzb != -1) {
                            this.zzE.zzz = iZzb;
                            return;
                        }
                        return;
                    case 21948:
                        zzq(i2);
                        this.zzE.zzC = (int) j;
                        return;
                    case 21949:
                        zzq(i2);
                        this.zzE.zzD = (int) j;
                        return;
                    default:
                        return;
                }
        }
    }

    public final void zzk(int i2, double d) throws zzat {
        if (i2 == 181) {
            zzq(i2);
            this.zzE.zzR = (int) d;
            return;
        }
        if (i2 == 17545) {
            this.zzA = (long) d;
            return;
        }
        switch (i2) {
            case 21969:
                zzq(i2);
                this.zzE.zzE = (float) d;
                break;
            case 21970:
                zzq(i2);
                this.zzE.zzF = (float) d;
                break;
            case 21971:
                zzq(i2);
                this.zzE.zzG = (float) d;
                break;
            case 21972:
                zzq(i2);
                this.zzE.zzH = (float) d;
                break;
            case 21973:
                zzq(i2);
                this.zzE.zzI = (float) d;
                break;
            case 21974:
                zzq(i2);
                this.zzE.zzJ = (float) d;
                break;
            case 21975:
                zzq(i2);
                this.zzE.zzK = (float) d;
                break;
            case 21976:
                zzq(i2);
                this.zzE.zzL = (float) d;
                break;
            case 21977:
                zzq(i2);
                this.zzE.zzM = (float) d;
                break;
            case 21978:
                zzq(i2);
                this.zzE.zzN = (float) d;
                break;
            default:
                switch (i2) {
                    case 30323:
                        zzq(i2);
                        this.zzE.zzt = (float) d;
                        break;
                    case 30324:
                        zzq(i2);
                        this.zzE.zzu = (float) d;
                        break;
                    case 30325:
                        zzq(i2);
                        this.zzE.zzv = (float) d;
                        break;
                }
                break;
        }
    }

    public final void zzl(int i2, String str) throws zzat {
        if (i2 == 134) {
            zzq(i2);
            this.zzE.zzc = str;
            return;
        }
        if (i2 != 17026) {
            if (i2 == 21358) {
                zzq(i2);
                this.zzE.zzb = str;
                return;
            } else {
                if (i2 != 2274716) {
                    return;
                }
                zzq(i2);
                this.zzE.zze(str);
                return;
            }
        }
        if ("webm".equals(str) || "matroska".equals(str)) {
            this.zzC = Objects.equals(str, "webm");
            return;
        }
        StringBuilder sb = new StringBuilder(str.length() + 22);
        sb.append("DocType ");
        sb.append(str);
        sb.append(" not supported");
        throw zzat.zzb(sb.toString(), null);
    }

    /* JADX WARN: Code duplicated, block: B:110:0x02af  */
    /* JADX WARN: Code duplicated, block: B:112:0x02b3  */
    /* JADX WARN: Code duplicated, block: B:114:0x02be  */
    /* JADX WARN: Code duplicated, block: B:115:0x02c0 A[PHI: r1
  0x02c0: PHI (r1v14 int) = (r1v0 int), (r1v20 int) binds: [B:109:0x02ad, B:114:0x02be] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:116:0x02c2  */
    /* JADX WARN: Code duplicated, block: B:117:0x02c7  */
    public final void zzm(int i2, int i3, zzaep zzaepVar) throws IOException {
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        long j;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15 = i2;
        int i16 = 2;
        int i17 = 1;
        int i18 = 0;
        if (i15 != 161 && i15 != 163) {
            if (i15 == 165) {
                if (this.zzU != 2) {
                    return;
                }
                zzaiz zzaizVar = (zzaiz) this.zzi.get(this.zzaa);
                if (this.zzad != 4 || !"V_VP9".equals(zzaizVar.zzc)) {
                    zzaepVar.zzf(i3);
                    return;
                }
                zzer zzerVar = this.zzv;
                zzerVar.zza(i3);
                zzaepVar.zzc(zzerVar.zzi(), 0, i3);
                return;
            }
            if (i15 == 16877) {
                zzq(i2);
                zzaiz zzaizVar2 = this.zzE;
                if (zzaizVar2.zzc() != 1685485123 && zzaizVar2.zzc() != 1685480259) {
                    zzaepVar.zzf(i3);
                    return;
                }
                byte[] bArr = new byte[i3];
                zzaizVar2.zzO = bArr;
                zzaepVar.zzc(bArr, 0, i3);
                return;
            }
            if (i15 == 16981) {
                zzq(i2);
                byte[] bArr2 = new byte[i3];
                this.zzE.zzi = bArr2;
                zzaepVar.zzc(bArr2, 0, i3);
                return;
            }
            if (i15 == 18402) {
                byte[] bArr3 = new byte[i3];
                zzaepVar.zzc(bArr3, 0, i3);
                zzq(i2);
                this.zzE.zzj = new zzafz(1, bArr3, 0, 0);
                return;
            }
            if (i15 == 21419) {
                zzer zzerVar2 = this.zzq;
                Arrays.fill(zzerVar2.zzi(), (byte) 0);
                zzaepVar.zzc(zzerVar2.zzi(), 4 - i3, i3);
                zzerVar2.zzh(0);
                this.zzG = (int) zzerVar2.zzz();
                return;
            }
            if (i15 == 25506) {
                zzq(i2);
                byte[] bArr4 = new byte[i3];
                this.zzE.zzk = bArr4;
                zzaepVar.zzc(bArr4, 0, i3);
                return;
            }
            if (i15 != 30322) {
                StringBuilder sb = new StringBuilder(String.valueOf(i15).length() + 15);
                sb.append("Unexpected id: ");
                sb.append(i15);
                throw zzat.zzb(sb.toString(), null);
            }
            zzq(i2);
            byte[] bArr5 = new byte[i3];
            this.zzE.zzw = bArr5;
            zzaepVar.zzc(bArr5, 0, i3);
            return;
        }
        int i19 = 8;
        if (this.zzU == 0) {
            zzajc zzajcVar = this.zzh;
            this.zzaa = (int) zzajcVar.zzb(zzaepVar, false, true, 8);
            this.zzab = zzajcVar.zzc();
            this.zzW = -9223372036854775807L;
            this.zzU = 1;
            this.zzo.zza(0);
        }
        zzaiz zzaizVar3 = (zzaiz) this.zzi.get(this.zzaa);
        if (zzaizVar3 == null) {
            zzaepVar.zzf(i3 - this.zzab);
            this.zzU = 0;
            return;
        }
        zzaizVar3.zzb();
        if (this.zzU == 1) {
            zzt(zzaepVar, 3);
            zzer zzerVar3 = this.zzo;
            int i20 = (zzerVar3.zzi()[2] & 6) >> 1;
            if (i20 == 0) {
                this.zzY = 1;
                int[] iArrZzA = zzA(this.zzZ, 1);
                this.zzZ = iArrZzA;
                iArrZzA[0] = (i3 - this.zzab) - 3;
            } else {
                zzt(zzaepVar, 4);
                int i21 = (zzerVar3.zzi()[3] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) + 1;
                this.zzY = i21;
                int[] iArrZzA2 = zzA(this.zzZ, i21);
                this.zzZ = iArrZzA2;
                if (i20 == 2) {
                    int i22 = (i3 - this.zzab) - 4;
                    int i23 = this.zzY;
                    Arrays.fill(iArrZzA2, 0, i23, i22 / i23);
                } else {
                    if (i20 == 1) {
                        int i24 = 0;
                        int i25 = 0;
                        int i26 = 4;
                        while (true) {
                            i11 = this.zzY - 1;
                            if (i24 >= i11) {
                                break;
                            }
                            this.zzZ[i24] = 0;
                            while (true) {
                                i12 = i26 + 1;
                                zzt(zzaepVar, i12);
                                int i27 = zzerVar3.zzi()[i26] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
                                int[] iArr = this.zzZ;
                                i13 = iArr[i24] + i27;
                                iArr[i24] = i13;
                                if (i27 != 255) {
                                    break;
                                } else {
                                    i26 = i12;
                                }
                            }
                            i25 += i13;
                            i24++;
                            i26 = i12;
                        }
                        this.zzZ[i11] = ((i3 - this.zzab) - i26) - i25;
                    } else {
                        if (i20 != 3) {
                            throw zzat.zzb("Unexpected lacing value: 2", null);
                        }
                        int i28 = 0;
                        int i29 = 0;
                        int i30 = 4;
                        while (true) {
                            int i31 = this.zzY - 1;
                            if (i28 >= i31) {
                                i5 = i16;
                                i6 = i17;
                                i7 = i18;
                                this.zzZ[i31] = ((i3 - this.zzab) - i30) - i29;
                                break;
                            }
                            this.zzZ[i28] = i18;
                            int i32 = i30 + 1;
                            zzt(zzaepVar, i32);
                            if (zzerVar3.zzi()[i30] == 0) {
                                throw zzat.zzb("No valid varint length mask found", null);
                            }
                            int i33 = i18;
                            while (true) {
                                if (i18 >= i19) {
                                    i8 = i16;
                                    i9 = i17;
                                    i10 = i19;
                                    j = 0;
                                    break;
                                }
                                i10 = i19;
                                int i34 = i17 << (7 - i18);
                                if ((zzerVar3.zzi()[i30] & i34) != 0) {
                                    i32 += i18;
                                    zzt(zzaepVar, i32);
                                    int i35 = i30 + 1;
                                    int i36 = zzerVar3.zzi()[i30] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED & (~i34);
                                    int i37 = i16;
                                    j = i36;
                                    i8 = i37;
                                    int i38 = i35;
                                    while (i38 < i32) {
                                        j = (j << i10) | ((long) (zzerVar3.zzi()[i38] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED));
                                        i17 = i17;
                                        i38++;
                                        i18 = i18;
                                    }
                                    i9 = i17;
                                    int i39 = i18;
                                    if (i28 <= 0) {
                                        break;
                                    }
                                    j -= (1 << ((i39 * 7) + 6)) - 1;
                                    break;
                                }
                                i18++;
                                i19 = i10;
                            }
                            if (j < -2147483648L || j > 2147483647L) {
                                throw zzat.zzb("EBML lacing sample size out of range.", null);
                            }
                            int[] iArr2 = this.zzZ;
                            int i40 = (int) j;
                            if (i28 != 0) {
                                i40 += iArr2[i28 - 1];
                            }
                            iArr2[i28] = i40;
                            i29 += i40;
                            i28++;
                            i30 = i32;
                            i18 = i33;
                            i16 = i8;
                            i19 = i10;
                            i17 = i9;
                        }
                    }
                    this.zzV = this.zzS + zzz((zzerVar3.zzi()[i7] << 8) | (zzerVar3.zzi()[i6] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED));
                    if (zzaizVar3.zze == i6) {
                        i14 = 1;
                    } else if (i15 == 163) {
                        i14 = i7;
                    } else if ((zzerVar3.zzi()[i5] & 128) == 128) {
                        i15 = 163;
                        i14 = 1;
                    } else {
                        i14 = i7;
                        i15 = 163;
                    }
                    this.zzac = i14;
                    this.zzU = i5;
                    this.zzX = i7;
                    i4 = 163;
                }
            }
            i5 = 2;
            i6 = 1;
            i7 = 0;
            this.zzV = this.zzS + zzz((zzerVar3.zzi()[i7] << 8) | (zzerVar3.zzi()[i6] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED));
            if (zzaizVar3.zze == i6) {
                i14 = 1;
            } else if (i15 == 163) {
                i14 = i7;
            } else if ((zzerVar3.zzi()[i5] & 128) == 128) {
                i15 = 163;
                i14 = 1;
            } else {
                i14 = i7;
                i15 = 163;
            }
            this.zzac = i14;
            this.zzU = i5;
            this.zzX = i7;
            i4 = 163;
        } else {
            i4 = 163;
        }
        if (i15 == i4) {
            while (true) {
                int i41 = this.zzX;
                if (i41 >= this.zzY) {
                    this.zzU = 0;
                    return;
                }
                int iZzu = zzu(zzaepVar, zzaizVar3, this.zzZ[i41], false);
                zzaiz zzaizVar4 = zzaizVar3;
                zzs(zzaizVar4, this.zzV + ((long) ((this.zzX * zzaizVar3.zzf) / 1000)), this.zzac, iZzu, 0);
                this.zzX++;
                zzaizVar3 = zzaizVar4;
            }
        } else {
            while (true) {
                int i42 = this.zzX;
                if (i42 >= this.zzY) {
                    return;
                }
                int[] iArr3 = this.zzZ;
                iArr3[i42] = zzu(zzaepVar, zzaizVar3, iArr3[i42], true);
                this.zzX++;
            }
        }
    }

    public zzaja(zzait zzaitVar, int i2, zzalw zzalwVar) {
        this.zzy = -1L;
        this.zzz = -9223372036854775807L;
        this.zzA = -9223372036854775807L;
        this.zzB = -9223372036854775807L;
        this.zzK = -9223372036854775807L;
        this.zzL = -1;
        this.zzM = -1L;
        this.zzN = -1L;
        this.zzO = -1;
        this.zzQ = -1L;
        this.zzR = -1L;
        this.zzS = -9223372036854775807L;
        this.zzaq = zzaitVar;
        zzaitVar.zza(new zzaiv(this, null));
        this.zzl = zzalwVar;
        this.zzI = new SparseArray();
        this.zzj = 1 == ((i2 & 1) ^ 1);
        this.zzk = (i2 & 2) == 0;
        this.zzh = new zzajc();
        this.zzi = new SparseArray();
        this.zzo = new zzer(4);
        this.zzp = new zzer(ByteBuffer.allocate(4).putInt(-1).array());
        this.zzq = new zzer(4);
        this.zzm = new zzer(zzgm.zza);
        this.zzn = new zzer(4);
        this.zzr = new zzer();
        this.zzs = new zzer();
        this.zzt = new zzer(8);
        this.zzu = new zzer();
        this.zzv = new zzer();
        this.zzZ = new int[1];
        this.zzD = true;
    }

    public zzaja(zzalw zzalwVar, int i2) {
        this(new zzait(), 0, zzalwVar);
    }
}
