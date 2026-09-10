package com.google.android.gms.internal.ads;

import com.applovin.impl.Z;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class zzatq implements zzauk {
    public static final /* synthetic */ zzatq zza;
    public static final /* synthetic */ zzatq zzb;
    public static final /* synthetic */ zzatq zzc;
    public static final /* synthetic */ zzatq zzd;
    public static final /* synthetic */ zzatq zze;
    public static final /* synthetic */ zzatq zzf;
    public static final /* synthetic */ zzatq zzg;
    public static final /* synthetic */ zzatq zzh;
    public static final /* synthetic */ zzatq zzi;
    public static final /* synthetic */ zzatq zzj;
    public static final /* synthetic */ zzatq zzk;
    public static final /* synthetic */ zzatq zzl;
    public static final /* synthetic */ zzatq zzm;
    public static final /* synthetic */ zzatq zzn;
    public static final /* synthetic */ zzatq zzo;
    public static final /* synthetic */ zzatq zzp;
    public static final /* synthetic */ zzatq zzq;
    public static final /* synthetic */ zzatq zzr;
    public static final /* synthetic */ zzatq zzs;
    public static final /* synthetic */ zzatq zzt;
    public static final /* synthetic */ zzatq zzu;
    private final /* synthetic */ int zzv;

    static {
        int i2 = (((((~574682290) & 203332142) | 828655825) + ((574682290 & 488280686) | 1367367889)) - 2039730118) ^ (1891066487 % 382926234);
        int i3 = (((((~138700754) & 1311190796) | 1098494210) + ((138700754 & 235277837) | 2126145)) - 1303500118) ^ (631340353 % 54449299);
        int i4 = (((((~429857344) & 761470753) | 244716435) + ((429857344 & 862030880) | 1585885407)) - (-1912977126)) ^ (1209597698 % 1200977805);
        int i5 = (((((~353056618) & 587352576) | 1209239528) + ((353056618 & 1728108930) | 1420269559)) - (-1847305937)) ^ (1896236448 % 1127167744);
        int i6 = (((((~899633766) & 123837830) | 368257288) + ((899633766 & 167810182) | 1023429240)) - 1335244442) ^ (2104001379 % 2013966848);
        int i7 = (((((~1451163042) & 1144033732) | 979119168) + ((1451163042 & 1142985108) | 17523737)) - 1635219142) ^ (1178835412 % 674426555);
        int i8 = (((((~2129768394) & 1627076842) | 1930240353) + ((2129768394 & 384997514) | 369722160)) - (-1995771891)) ^ (1450967523 % 42186306);
        zzu = new zzatq((((((~880944650) & 1717883648) | 10231720) + ((880944650 & 1718140932) | 277359766)) - 1470954277) ^ (2122533302 % 1588279465));
        zzt = new zzatq((((((~2105342203) & 63587109) | 1700430907) + ((2105342203 & 42025732) | 358031402)) - 2053339984) ^ (1059789835 % 1012707329));
        zzs = new zzatq((((((~217704412) & 144255288) | 1174857666) + ((217704412 & 1788447288) | 1667270208)) - (-1441824169)) ^ (1234644696 % 220282619));
        zzr = new zzatq(i8);
        zzq = new zzatq(i5);
        zzp = new zzatq(i6);
        zzatq zzatqVar = new zzatq(i7);
        int i9 = (((((~363159161) & 562794784) | 672605403) + ((363159161 & 25727904) | 2081572569)) - (-1616076716)) ^ (912078408 % 135177290);
        int i10 = (((((~1362243428) & 18451060) | 1179867339) + ((1362243428 & 558662325) | 550966467)) - 1623872455) ^ (1106211926 % 327305250);
        int i11 = (((((~1725362297) & 1360741300) | 1109702041) + ((1725362297 & 354116135) | 1147188355)) - (-1834394863)) ^ (1760481135 % 279527351);
        int i12 = (((((~167368542) & 67146177) | 1656237739) + ((167368542 & 1145098568) | 1113671327)) - (-1733089599)) ^ (1999038585 % 574620392);
        int i13 = (((((~1855103807) & 659964675) | 1290440236) + ((1855103807 & 588562691) | 482511980)) - 1987315200) ^ (988506952 % 614340012);
        int i14 = (((((~309667127) & 3230344) | 101519449) + ((309667127 & 607439488) | 793023522)) - 846909944) ^ (1953534826 % 1902736997);
        int i15 = (((((~682736626) & 1985796848) | 208315317) + ((682736626 & 1922324801) | 8464129)) - 2089727599) ^ (649022765 % 608034986);
        int i16 = (((((~2068224547) & 575179716) | 1587938398) + ((2068224547 & 1013484418) | 1605526586)) - (-1152499266)) ^ (1603386966 % 1010764797);
        int i17 = (((((~1281944976) & 1463473736) | 847256033) + ((1281944976 & 1698424328) | 948255187)) - (-1974214194)) ^ (1727952741 % 1091714937);
        zzo = zzatqVar;
        zzn = new zzatq(i4);
        zzm = new zzatq(i9);
        zzl = new zzatq(i10);
        zzk = new zzatq(i11);
        zzj = new zzatq(i3);
        zzi = new zzatq(i12);
        zzh = new zzatq(i13);
        zzg = new zzatq(i14);
        zzf = new zzatq(i2);
        zze = new zzatq(i15);
        zzd = new zzatq(i16);
        zzc = new zzatq(i17);
        zzb = new zzatq(1);
        zza = new zzatq(0);
    }

    private /* synthetic */ zzatq(int i2) {
        this.zzv = i2;
    }

    @Override // java.util.function.Function
    public final /* synthetic */ Object apply(Object obj) {
        zzatc zzatcVar;
        long j = 1;
        try {
            try {
                try {
                    try {
                        try {
                            try {
                                try {
                                    try {
                                        switch (this.zzv) {
                                            case 0:
                                                zzaun zzaunVar = (zzaun) obj;
                                                zzauj zzaujVar = zzaunVar.zzb;
                                                long jZzm = zzaujVar.zzc().zzm();
                                                if (zzaujVar.zzc().zzm() != 0) {
                                                    zzaunVar.zzd.zza(jZzm);
                                                }
                                                return Optional.empty();
                                            case 1:
                                                try {
                                                    zzauj zzaujVar2 = ((zzaun) obj).zzb;
                                                    long jZzm2 = zzaujVar2.zzc().zzm();
                                                    zzaus zzausVarZzc = zzaujVar2.zzc();
                                                    zzaus zzausVarZzc2 = zzaujVar2.zzc();
                                                    List listZzo = zzausVarZzc2.zzo();
                                                    if (jZzm2 < 0) {
                                                        jZzm2 += (long) (listZzo.size() + 1);
                                                    }
                                                    if (jZzm2 < 0 || jZzm2 >= listZzo.size() + 1) {
                                                        throw new zzauq();
                                                    }
                                                    listZzo.add((int) jZzm2, zzausVarZzc);
                                                    zzaujVar2.zzb(zzausVarZzc2);
                                                    return Optional.empty();
                                                } catch (zzauq unused) {
                                                    zzatcVar = zzatc.zzI;
                                                }
                                                break;
                                            case 2:
                                                zzaun zzaunVar2 = (zzaun) obj;
                                                zzauj zzaujVar3 = zzaunVar2.zzb;
                                                long jZzm3 = zzaujVar3.zzc().zzm();
                                                if (zzaujVar3.zzc().zzm() == 0) {
                                                    zzaunVar2.zzd.zza(jZzm3);
                                                }
                                                return Optional.empty();
                                            case 3:
                                                zzauj zzaujVar4 = ((zzaun) obj).zzb;
                                                zzaujVar4.zzb(zzaus.zzb(zzaujVar4.zzc().zzo().size()));
                                                return Optional.empty();
                                            case 4:
                                                zzauj zzaujVar5 = ((zzaun) obj).zzb;
                                                zzaujVar5.zzb(zzaus.zzb(zzaujVar5.zzc().zzn().zza.length));
                                                return Optional.empty();
                                            case 5:
                                                zzauj zzaujVar6 = ((zzaun) obj).zzb;
                                                zzaujVar6.zzb(zzaus.zzc(Math.log(zzaujVar6.zzc().zzq())));
                                                return Optional.empty();
                                            case 6:
                                                zzauj zzaujVar7 = ((zzaun) obj).zzb;
                                                long jZzm4 = zzaujVar7.zzc().zzm();
                                                long jZzm5 = zzaujVar7.zzc().zzm();
                                                if (jZzm4 == 0 || jZzm5 == 0) {
                                                    j = 0;
                                                }
                                                zzaujVar7.zzb(zzaus.zzb(j));
                                                return Optional.empty();
                                            case 7:
                                                zzauj zzaujVar8 = ((zzaun) obj).zzb;
                                                if (zzaujVar8.zzc().zzm() != 0) {
                                                    j = 0;
                                                }
                                                zzaujVar8.zzb(zzaus.zzb(j));
                                                return Optional.empty();
                                            case 8:
                                                zzauj zzaujVar9 = ((zzaun) obj).zzb;
                                                long jZzm6 = zzaujVar9.zzc().zzm();
                                                long jZzm7 = zzaujVar9.zzc().zzm();
                                                if (jZzm6 == 0 && jZzm7 == 0) {
                                                    j = 0;
                                                }
                                                zzaujVar9.zzb(zzaus.zzb(j));
                                                return Optional.empty();
                                            case 9:
                                                zzaun zzaunVar3 = (zzaun) obj;
                                                zzauj zzaujVar10 = zzaunVar3.zzb;
                                                try {
                                                    int iCompare = new zzauo(false).compare(zzaujVar10.zzc(), zzaujVar10.zzc());
                                                    zzauj zzaujVar11 = zzaunVar3.zzb;
                                                    if (iCompare >= 0) {
                                                        j = 0;
                                                    }
                                                    zzaujVar11.zzb(zzaus.zzb(j));
                                                    return Optional.empty();
                                                } catch (IllegalArgumentException unused2) {
                                                    return Optional.of(zzatc.zzd);
                                                }
                                            case 10:
                                                int[] iArr = {1944216249, 348137722, 926438168, 13122018, 1882968836, -1273372307, 246144337, 1723705710, 1677157265};
                                                int i2 = iArr[0];
                                                int i3 = iArr[1];
                                                int i4 = iArr[2];
                                                int i5 = iArr[3];
                                                int i6 = iArr[4];
                                                int i7 = iArr[5];
                                                int i8 = iArr[6];
                                                int i9 = iArr[7];
                                                int iC = Z.c((i3 & (~i2)) | i4, (i2 & i5) | i6, i7, i8);
                                                int i10 = i9 % 1677157265;
                                                zzaun zzaunVar4 = (zzaun) obj;
                                                try {
                                                    zzauj zzaujVar12 = zzaunVar4.zzb;
                                                    long jZzm8 = zzaujVar12.zzc().zzm();
                                                    zzati zzatiVar = zzaunVar4.zza;
                                                    zzauj zzaujVar13 = new zzauj(i10 ^ iC);
                                                    for (int i11 = 0; i11 < zzaujVar12.zzb; i11++) {
                                                        try {
                                                            zzaujVar13.zzb(zzaus.zzj((zzaus) zzaujVar12.zza.get(i11)));
                                                        } catch (zzaui e2) {
                                                            throw new AssertionError(zzatu.zza("CEiv6BFfPnitUE+D"), e2);
                                                        }
                                                    }
                                                    zzaub zzaubVar = zzaunVar4.zzd;
                                                    new zzaun(zzatiVar, zzaujVar13, new zzaub(zzaubVar.zzb, zzaubVar.zza, zzaubVar.zzc.zzc(), zzaubVar.zzd)).zzd.zza(jZzm8);
                                                    zzaujVar12.zzb(zzaus.zza(new zzats()));
                                                    return Optional.empty();
                                                } catch (zzatz | zzaua unused3) {
                                                    zzatcVar = zzatc.zzt;
                                                }
                                                break;
                                            case 11:
                                                try {
                                                    zzauj zzaujVar14 = ((zzaun) obj).zzb;
                                                    zzaujVar14.zzb(zzaus.zza(zzaujVar14.zzc().zzi((Class) zzaujVar14.zzc().zzl())));
                                                    return Optional.empty();
                                                } catch (zzaup unused4) {
                                                    zzatcVar = zzatc.zzp;
                                                }
                                                break;
                                            case 12:
                                                zzauj zzaujVar15 = ((zzaun) obj).zzb;
                                                long jZzm9 = zzaujVar15.zzc().zzm();
                                                long jZzm10 = zzaujVar15.zzc().zzm();
                                                if (jZzm9 == 0) {
                                                    return Optional.of(zzatc.zzF);
                                                }
                                                zzaujVar15.zzb(zzaus.zzb(jZzm10 % jZzm9));
                                                return Optional.empty();
                                            case 13:
                                                zzauj zzaujVar16 = ((zzaun) obj).zzb;
                                                zzaujVar16.zzb(zzaus.zzc(zzaujVar16.zzc().zzq() * zzaujVar16.zzc().zzq()));
                                                return Optional.empty();
                                            case 14:
                                                zzauj zzaujVar17 = ((zzaun) obj).zzb;
                                                zzaujVar17.zzb(zzaus.zzb(zzaujVar17.zzc().zzm() * zzaujVar17.zzc().zzm()));
                                                return Optional.empty();
                                            case 15:
                                                zzauj zzaujVar18 = ((zzaun) obj).zzb;
                                                long jZzm11 = zzaujVar18.zzc().zzm();
                                                ArrayList arrayList = new ArrayList();
                                                for (long j2 = 0; j2 < jZzm11; j2++) {
                                                    arrayList.add(zzaujVar18.zzc());
                                                }
                                                Collections.reverse(arrayList);
                                                zzaujVar18.zzb(zzaus.zze(arrayList));
                                                return Optional.empty();
                                            case 16:
                                                zzauj zzaujVar19 = ((zzaun) obj).zzb;
                                                zzaujVar19.zzb(zzaus.zzc(Math.pow(zzaujVar19.zzc().zzq(), zzaujVar19.zzc().zzq())));
                                                return Optional.empty();
                                            case 17:
                                                ((zzaun) obj).zzb.zzb(zzaus.zza(null));
                                                return Optional.empty();
                                            case 18:
                                                zzaun zzaunVar5 = (zzaun) obj;
                                                ByteBuffer byteBufferWrap = ByteBuffer.wrap(zzaunVar5.zzd.zzf((((((~1201162069L) & 403189074) | 1043752718) + ((1201162069 & 95979632) | 900760100)) - 1766798336) ^ (507611410 % 329370448)).zza());
                                                byteBufferWrap.order(ByteOrder.LITTLE_ENDIAN);
                                                zzaunVar5.zzb.zzb(zzaus.zzc(Double.longBitsToDouble(byteBufferWrap.getLong())));
                                                return Optional.empty();
                                            case 19:
                                                zzaun zzaunVar6 = (zzaun) obj;
                                                zzaunVar6.zzb.zzb(zzaus.zzb(zzaunVar6.zzd.zze()));
                                                return Optional.empty();
                                            default:
                                                long j3 = ((((~346030096L) & 203234088) | 575197286) + ((346030096 & 2352425736L) | 2745332883L)) - 1505840317;
                                                long j4 = 1246101662 % 372004513;
                                                long j5 = ((((~1810821955L) & 1747262537) | 563863662) + ((1810821955 & 1295301633) | 94020008)) - 1690999106;
                                                long j6 = 1675644664 % 749217043;
                                                zzaun zzaunVar7 = (zzaun) obj;
                                                zzaub zzaubVar2 = zzaunVar7.zzd;
                                                long jZze = zzaubVar2.zze();
                                                if (jZze >= 0 && jZze <= (j3 ^ j4)) {
                                                    if (((j5 ^ j6) & jZze) != 0) {
                                                        return Optional.of(zzatc.zze);
                                                    }
                                                    zzaunVar7.zzb.zzb(zzaus.zzd(zzaubVar2.zzf(jZze)));
                                                    return Optional.empty();
                                                }
                                                return Optional.of(zzatc.zzz);
                                        }
                                    } catch (zzaty unused5) {
                                        zzatcVar = zzatc.zzD;
                                    }
                                } catch (zzauh unused6) {
                                    zzatcVar = zzatc.zzx;
                                }
                            } catch (zzatz e3) {
                                e = e3;
                                throw new AssertionError(zzatu.zza("CEiv6BFfPnitUE+D"), e);
                            }
                        } catch (zzatz | zzaua unused7) {
                            zzatcVar = zzatc.zzi;
                        }
                    } catch (zzaui e4) {
                        e = e4;
                        throw new AssertionError(zzatu.zza("CEiv6BFfPnitUE+D"), e);
                    }
                } catch (zzaua unused8) {
                    zzatcVar = zzatc.zzz;
                }
            } catch (zzaui unused9) {
                zzatcVar = zzatc.zza;
            }
        } catch (zzaup unused10) {
            zzatcVar = zzatc.zzy;
        }
        return Optional.of(zzatcVar);
    }
}
