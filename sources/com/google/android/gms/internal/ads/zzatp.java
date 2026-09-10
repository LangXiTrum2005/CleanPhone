package com.google.android.gms.internal.ads;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.Optional;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class zzatp implements zzauk {
    public static final /* synthetic */ zzatp zza;
    public static final /* synthetic */ zzatp zzb;
    public static final /* synthetic */ zzatp zzc;
    public static final /* synthetic */ zzatp zzd;
    public static final /* synthetic */ zzatp zze;
    public static final /* synthetic */ zzatp zzf;
    public static final /* synthetic */ zzatp zzg;
    public static final /* synthetic */ zzatp zzh;
    public static final /* synthetic */ zzatp zzi;
    public static final /* synthetic */ zzatp zzj;
    public static final /* synthetic */ zzatp zzk;
    public static final /* synthetic */ zzatp zzl;
    public static final /* synthetic */ zzatp zzm;
    public static final /* synthetic */ zzatp zzn;
    public static final /* synthetic */ zzatp zzo;
    public static final /* synthetic */ zzatp zzp;
    public static final /* synthetic */ zzatp zzq;
    public static final /* synthetic */ zzatp zzr;
    public static final /* synthetic */ zzatp zzs;
    public static final /* synthetic */ zzatp zzt;
    public static final /* synthetic */ zzatp zzu;
    private final /* synthetic */ int zzv;

    static {
        int i2 = (((((~1272469786) & 1097507524) | 723881402) + ((1272469786 & 1078604356) | 746642480)) - (-1830851820)) ^ (1544617505 % 243268139);
        int i3 = (((((~1722060049) & 1087578905) | 70644109) + ((1722060049 & 1625428690) | 673239279)) - 1747544094) ^ (860516127 % 777720504);
        int i4 = (((((~168057522) & 567809569) | 2007585082) + ((168057522 & 1112917761) | 1200484666)) - (-1753249985)) ^ (1761250573 % 1089653714);
        int i5 = (((((~386839851) & 502322088) | 1879579687) + ((386839851 & 1341449096) | 1376723987)) - (-1804183292)) ^ (2118801173 % 1119399015);
        int i6 = (((((~627992393) & 399075139) | 1263590114) + ((627992393 & 1418280193) | 1644468862)) - (-1502362592)) ^ (1449228398 % 989241888);
        int i7 = (((((~1687776787) & 1627592001) | 771768986) + ((1687776787 & 1226806633) | 136094264)) - 1910482017) ^ (992028067 % 180785147);
        int i8 = (((((~1111088131) & 1881672142) | 1222111317) + ((1111088131 & 807995786) | 38123124)) - 1508183881) ^ (1348361729 % 788380902);
        zzu = new zzatp((((((~636453333) & 363983206) | 1075208291) + ((636453333 & 2146013964) | 1783382730)) - (-1139191409)) ^ (1564003050 % 99885196));
        zzt = new zzatp((((((~338346092) & 646267944) | 2030210865) + ((338346092 & 109431182) | 1768591350)) - (-956795148)) ^ (1912163036 % 671068506));
        zzs = new zzatp((((((~1374600938) & 269492393) | 962980710) + ((1374600938 & (-2079309685)) | (-1096234186))) - (-724963331)) ^ (1587992726 % 995234140));
        zzr = new zzatp(i8);
        zzq = new zzatp(i5);
        zzp = new zzatp(i6);
        zzatp zzatpVar = new zzatp(i7);
        int i9 = (((((~406011017) & 1269108768) | 73167649) + ((406011017 & 2074166272) | 872470299)) - 1878158194) ^ (1615935710 % 639806732);
        int i10 = (((((~257675105) & 286888065) | 1680106172) + ((257675105 & 353998857) | 216033710)) - (-2120570644)) ^ (2033505236 % 29777560);
        int i11 = (((((~2137100237) & 243279585) | 1476690352) + ((2137100237 & 1182836297) | 1215531406)) - (-1785612177)) ^ (1251300606 % 959372260);
        int i12 = (((((~1280321648) & 1509448282) | 1074834725) + ((1280321648 & 434689663) | 67544101)) - 1396684682) ^ (1309383303 % 1129033333);
        int i13 = (((((~1635905385) & 436500164) | 1627617040) + ((1635905385 & 1527677388) | 1092341018)) - (-1251599253)) ^ (1253207672 % 570073850);
        int i14 = (((((~2058657199) & 1077280871) | 426331554) + ((2058657199 & 1242960213) | 260153146)) - 1453981149) ^ (711845894 % 404158660);
        int i15 = (((((~2077486715) & 1348527492) | 196553360) + ((2077486715 & 1547749134) | 218380923)) - 1621461405) ^ (1713258270 % 1573363368);
        int i16 = (((((~1194953865) & 541827704) | 1410336387) + ((1194953865 & 676044922) | 221517442)) - 2090845028) ^ (485560280 % 402724286);
        int i17 = (((((~1424268980) & 433259076) | 136627722) + ((1424268980 & 299303110) | 33824130)) - 448747429) ^ (1129566413 % 184803526);
        zzo = zzatpVar;
        zzn = new zzatp(i4);
        zzm = new zzatp(i9);
        zzl = new zzatp(i10);
        zzk = new zzatp(i11);
        zzj = new zzatp(i3);
        zzi = new zzatp(i12);
        zzh = new zzatp(i13);
        zzg = new zzatp(i14);
        zzf = new zzatp(i2);
        zze = new zzatp(i15);
        zzd = new zzatp(i16);
        zzc = new zzatp(i17);
        zzb = new zzatp(1);
        zza = new zzatp(0);
    }

    private /* synthetic */ zzatp(int i2) {
        this.zzv = i2;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:98:0x01e3 A[Catch: zzaui -> 0x0061, zzauf | zzauh -> 0x00f2, ClassNotFoundException -> 0x01f3, zzaup -> 0x01f7, TryCatch #2 {zzaui -> 0x0061, blocks: (B:5:0x0036, B:9:0x0052, B:11:0x005a, B:16:0x0068, B:18:0x0071, B:32:0x00e3, B:19:0x007a, B:20:0x007f, B:21:0x0080, B:24:0x00a8, B:25:0x00ad, B:29:0x00b6, B:31:0x00be, B:35:0x00eb, B:36:0x00f0, B:37:0x00f1, B:42:0x0101, B:43:0x0111, B:45:0x0117, B:47:0x0125, B:48:0x0127, B:50:0x012c, B:51:0x0132, B:53:0x014a, B:54:0x014d, B:61:0x016c, B:66:0x018a, B:99:0x01e7, B:70:0x0195, B:74:0x01a0, B:81:0x01b4, B:85:0x01bf, B:89:0x01ca, B:93:0x01d5, B:97:0x01e0, B:98:0x01e3, B:105:0x01ff, B:109:0x0216, B:114:0x0239, B:121:0x0267, B:126:0x0288, B:135:0x02b0, B:137:0x02c6, B:138:0x02c8, B:140:0x02cd, B:144:0x02de, B:146:0x02f6, B:147:0x02f9, B:166:0x041b, B:192:0x04c9, B:194:0x04d1, B:198:0x04db, B:199:0x04e1, B:200:0x04e5, B:201:0x04ec, B:214:0x0532, B:218:0x0555, B:222:0x05a6, B:226:0x05c3, B:239:0x060e, B:243:0x0634, B:247:0x0657), top: B:252:0x000f }] */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // java.util.function.Function
    public final /* synthetic */ Object apply(Object obj) throws zzaty, zzaua {
        zzatc zzatcVar;
        long j;
        zzauj zzaujVar;
        zzaus zzausVarZza;
        zzatc zzatcVar2;
        zzatc zzatcVar3;
        int i2 = this.zzv;
        long j2 = 1;
        Class<?> cls = Void.TYPE;
        long j3 = 0;
        int i3 = 0;
        try {
            try {
                try {
                    try {
                        switch (i2) {
                            case 0:
                                zzauj zzaujVar2 = ((zzaun) obj).zzb;
                                zzaujVar2.zzb(zzaus.zzb(zzaujVar2.zzc().zzm() + zzaujVar2.zzc().zzm()));
                                return Optional.empty();
                            case 1:
                                zzauj zzaujVar3 = ((zzaun) obj).zzb;
                                zzaujVar3.zzb(zzaus.zzc(zzaujVar3.zzc().zzq() + zzaujVar3.zzc().zzq()));
                                return Optional.empty();
                            case 2:
                                zzauj zzaujVar4 = ((zzaun) obj).zzb;
                                zzaujVar4.zzb(zzaus.zzd(zzaujVar4.zzc().zzn().zzd(zzaujVar4.zzc().zzn())));
                                return Optional.empty();
                            case 3:
                                zzaun zzaunVar = (zzaun) obj;
                                try {
                                    long jZze = zzaunVar.zzd.zze();
                                    for (long j4 = 0; j4 < jZze; j4++) {
                                        zzaunVar.zzb.zzb(zzaus.zza(null));
                                    }
                                    return Optional.empty();
                                } catch (zzaui unused) {
                                    zzatcVar = zzatc.zza;
                                    return Optional.of(zzatcVar);
                                }
                            case 4:
                                zzauj zzaujVar5 = ((zzaun) obj).zzb;
                                zzaujVar5.zzb(zzaus.zzb(zzaujVar5.zzc().zzm() & zzaujVar5.zzc().zzm()));
                                return Optional.empty();
                            case 5:
                                long[] jArr = {916768482, 1259538933, 805446160, -15648283, -1266372608, 883303887, 6538657, 384868448, 102194872};
                                long j5 = jArr[0];
                                long j6 = jArr[1];
                                long j7 = jArr[2];
                                long j8 = jArr[3];
                                long j9 = jArr[4];
                                long j10 = jArr[5];
                                long j11 = jArr[6];
                                long j12 = jArr[7];
                                long j13 = (((((~j5) & j6) | j7) + ((j5 & j8) | j9)) - j10) + j11;
                                long j14 = j12 % 102194872;
                                zzauj zzaujVar6 = ((zzaun) obj).zzb;
                                zzaujVar6.zzb(zzaus.zzb((j13 ^ j14) ^ zzaujVar6.zzc().zzm()));
                                return Optional.empty();
                            case 6:
                                zzauj zzaujVar7 = ((zzaun) obj).zzb;
                                zzaujVar7.zzb(zzaus.zzb(zzaujVar7.zzc().zzm() | zzaujVar7.zzc().zzm()));
                                return Optional.empty();
                            case 7:
                                zzauj zzaujVar8 = ((zzaun) obj).zzb;
                                zzaujVar8.zzb(zzaus.zzb(zzaujVar8.zzc().zzm() ^ zzaujVar8.zzc().zzm()));
                                return Optional.empty();
                            case 8:
                                zzaun zzaunVar2 = (zzaun) obj;
                                try {
                                    zzauj zzaujVar9 = zzaunVar2.zzb;
                                    long jZzm = zzaujVar9.zzc().zzm();
                                    zzaug zzaugVar = zzaunVar2.zzc;
                                    zzaub zzaubVar = zzaunVar2.zzd;
                                    zzaugVar.zza(zzaubVar.zzb(), 0L, zzaujVar9.zzb);
                                    zzaubVar.zza(jZzm);
                                    return Optional.empty();
                                } catch (zzatz | zzaua unused2) {
                                    zzatcVar = zzatc.zzr;
                                    return Optional.of(zzatcVar);
                                } catch (zzaue unused3) {
                                    zzatcVar = zzatc.zzB;
                                    return Optional.of(zzatcVar);
                                }
                            case 9:
                                zzaun zzaunVar3 = (zzaun) obj;
                                try {
                                    zzauj zzaujVar10 = zzaunVar3.zzb;
                                    long jZzm2 = zzaujVar10.zzc().zzm();
                                    List listZzo = zzaujVar10.zzc().zzo();
                                    int size = listZzo.size();
                                    Object objZzh = zzaujVar10.zzc().zzh();
                                    Object objZzl = zzaujVar10.zzc().zzl();
                                    if (objZzl instanceof Method) {
                                        Method method = (Method) objZzl;
                                        Class<?>[] parameterTypes = method.getParameterTypes();
                                        if (parameterTypes.length == size) {
                                            Object[] objArr = new Object[size];
                                            if (objZzh instanceof Constructor) {
                                                Class<?>[] parameterTypes2 = ((Constructor) objZzh).getParameterTypes();
                                                int length = parameterTypes2.length;
                                                Object[] objArr2 = new Object[length];
                                                List listZzo2 = ((zzaus) listZzo.get(0)).zzo();
                                                if (listZzo2.size() == length) {
                                                    int i4 = 0;
                                                    while (i4 < listZzo2.size()) {
                                                        objArr2[i4] = ((zzaus) listZzo2.get(i4)).zzi(parameterTypes2[i4]);
                                                        i4++;
                                                        j3 = j3;
                                                    }
                                                    j = j3;
                                                    objArr[0] = objArr2;
                                                }
                                            } else {
                                                j = 0;
                                                while (i3 < size) {
                                                    objArr[i3] = ((zzaus) listZzo.get(i3)).zzi(parameterTypes[i3]);
                                                    i3++;
                                                }
                                            }
                                            try {
                                                Object objInvoke = method.invoke(objZzh, objArr);
                                                if (method.getReturnType() == Void.class || method.getReturnType() == cls) {
                                                    zzaujVar = zzaunVar3.zzb;
                                                    zzausVarZza = zzaus.zza(null);
                                                } else if (jZzm2 != j) {
                                                    zzaujVar = zzaunVar3.zzb;
                                                    zzausVarZza = zzaus.zzg(objInvoke);
                                                } else {
                                                    zzaujVar = zzaunVar3.zzb;
                                                    zzausVarZza = zzaus.zza(objInvoke);
                                                }
                                                zzaujVar.zzb(zzausVarZza);
                                                return Optional.empty();
                                            } catch (Throwable unused4) {
                                                zzatcVar = zzatc.zzq;
                                                return Optional.of(zzatcVar);
                                            }
                                        }
                                    }
                                    return Optional.of(zzatc.zzp);
                                } catch (zzaup unused5) {
                                    zzatcVar = zzatc.zzp;
                                }
                                break;
                            case 10:
                                int i5 = ((((~2084546560) & 73475461) | 438076064) + ((2084546560 & 611428101) | 2023412224)) - (-1830321789);
                                int i6 = 1073781763 % 1003463633;
                                int i7 = ((((~461273879) & 107429921) | 378966045) + ((461273879 & 283197472) | 1937909388)) - 2133058944;
                                int i8 = 1917305981 % 575705360;
                                zzaun zzaunVar4 = (zzaun) obj;
                                zzauj zzaujVar11 = zzaunVar4.zzb;
                                int intExact = Math.toIntExact(zzaujVar11.zzc().zzm());
                                zzatw zzatwVarZzn = zzaujVar11.zzc().zzn();
                                zzatw zzatwVarZzn2 = zzaujVar11.zzc().zzn();
                                if (zzatwVarZzn.zza.length != (i5 ^ i6)) {
                                    return Optional.of(zzatc.zzH);
                                }
                                int[] iArr = new int[i7 ^ i8];
                                ByteBuffer.wrap(zzatwVarZzn.zza()).asIntBuffer().get(iArr);
                                zzato zzatoVar = new zzato(intExact, iArr);
                                int i9 = ((((~1183912267) & 781500673) | 1683555012) + ((1183912267 & 180666625) | 541077750)) - (-1949988574);
                                int i10 = 1527793660 % 245277883;
                                int i11 = ((((~95266356) & 568641509) | 183483904) + ((95266356 & 553669093) | 504469010)) - 874379764;
                                int i12 = 2026478004 % 1659239833;
                                byte[] bArrZza = zzatwVarZzn2.zza();
                                int i13 = (((((~1787189168) & 1360184381) | 611517270) + ((1787189168 & 1426637867) | 612056018)) - 1771476931) ^ (1821115873 % 1010014811);
                                byte[] bArr = new byte[i13];
                                int i14 = 0;
                                while (i14 < bArrZza.length) {
                                    if (i14 % i13 == 0) {
                                        zzatoVar.zza(i14 >>> (i9 ^ i10), bArr);
                                    } else if (i14 == 0) {
                                        i14 = 0;
                                        zzatoVar.zza(i14 >>> (i9 ^ i10), bArr);
                                    }
                                    int i15 = i11 ^ i12;
                                    bArrZza[i14] = (byte) (((bArrZza[i14] ^ bArr[i14 % i13]) << i15) >> i15);
                                    i14++;
                                }
                                zzaunVar4.zzb.zzb(zzaus.zzd(zzatw.zze(bArrZza)));
                                return Optional.empty();
                            case 11:
                                zzauj zzaujVar12 = ((zzaun) obj).zzb;
                                double dZzq = zzaujVar12.zzc().zzq();
                                double dZzq2 = zzaujVar12.zzc().zzq();
                                if (dZzq == 0.0d) {
                                    zzatcVar2 = zzatc.zzF;
                                    return Optional.of(zzatcVar2);
                                }
                                zzaujVar12.zzb(zzaus.zzc(dZzq2 / dZzq));
                                return Optional.empty();
                            case 12:
                                zzauj zzaujVar13 = ((zzaun) obj).zzb;
                                long jZzm3 = zzaujVar13.zzc().zzm();
                                long jZzm4 = zzaujVar13.zzc().zzm();
                                if (jZzm3 == 0) {
                                    zzatcVar2 = zzatc.zzF;
                                    return Optional.of(zzatcVar2);
                                }
                                zzaujVar13.zzb(zzaus.zzb(jZzm4 / jZzm3));
                                return Optional.empty();
                            case 13:
                                try {
                                    ((zzaun) obj).zzb.zzc();
                                    return Optional.empty();
                                } catch (zzauh unused6) {
                                    zzatcVar = zzatc.zzA;
                                    return Optional.of(zzatcVar);
                                }
                            case 14:
                                zzaun zzaunVar5 = (zzaun) obj;
                                long jZzm5 = zzaunVar5.zzb.zzc().zzm();
                                zzauj zzaujVar14 = zzaunVar5.zzb;
                                zzaujVar14.zzb(zzaus.zzj(zzaujVar14.zzd(jZzm5)));
                                return Optional.empty();
                            case 15:
                                zzaun zzaunVar6 = (zzaun) obj;
                                long jZzm6 = zzaunVar6.zzc.zzb().zzb + zzaunVar6.zzb.zzc().zzm();
                                zzauj zzaujVar15 = zzaunVar6.zzb;
                                zzaujVar15.zzb(zzaus.zzj(zzaujVar15.zzd(-jZzm6)));
                                return Optional.empty();
                            case 16:
                                zzaun zzaunVar7 = (zzaun) obj;
                                long jZze2 = zzaunVar7.zzc.zzb().zzb + zzaunVar7.zzd.zze();
                                zzauj zzaujVar16 = zzaunVar7.zzb;
                                zzaujVar16.zzb(zzaus.zzj(zzaujVar16.zzd(-jZze2)));
                                return Optional.empty();
                            case 17:
                                try {
                                    zzauj zzaujVar17 = ((zzaun) obj).zzb;
                                    if (new zzauo(true).compare(zzaujVar17.zzc(), zzaujVar17.zzc()) != 0) {
                                        j2 = 0;
                                    }
                                    zzaujVar17.zzb(zzaus.zzb(j2));
                                    return Optional.empty();
                                } catch (IllegalArgumentException unused7) {
                                    zzatcVar = zzatc.zzd;
                                    return Optional.of(zzatcVar);
                                }
                            case 18:
                                try {
                                    zzauj zzaujVar18 = ((zzaun) obj).zzb;
                                    String strZzc = zzaujVar18.zzc().zzn().zzc();
                                    switch (strZzc.hashCode()) {
                                        case -1325958191:
                                            if (strZzc.equals("double")) {
                                                cls = Double.TYPE;
                                            } else {
                                                cls = Class.forName(strZzc);
                                            }
                                            break;
                                        case 104431:
                                            if (strZzc.equals("int")) {
                                                cls = Integer.TYPE;
                                            } else {
                                                cls = Class.forName(strZzc);
                                            }
                                            break;
                                        case 3039496:
                                            if (strZzc.equals("byte")) {
                                                cls = Byte.TYPE;
                                            } else {
                                                cls = Class.forName(strZzc);
                                            }
                                            break;
                                        case 3052374:
                                            if (strZzc.equals("char")) {
                                                cls = Character.TYPE;
                                            } else {
                                                cls = Class.forName(strZzc);
                                            }
                                            break;
                                        case 3327612:
                                            if (strZzc.equals("long")) {
                                                cls = Long.TYPE;
                                            } else {
                                                cls = Class.forName(strZzc);
                                            }
                                            break;
                                        case 3625364:
                                            if (!strZzc.equals("void")) {
                                                cls = Class.forName(strZzc);
                                            }
                                            break;
                                        case 64711720:
                                            if (strZzc.equals("boolean")) {
                                                cls = Boolean.TYPE;
                                            } else {
                                                cls = Class.forName(strZzc);
                                            }
                                            break;
                                        case 97526364:
                                            if (strZzc.equals("float")) {
                                                cls = Float.TYPE;
                                            } else {
                                                cls = Class.forName(strZzc);
                                            }
                                            break;
                                        case 109413500:
                                            if (strZzc.equals("short")) {
                                                cls = Short.TYPE;
                                            } else {
                                                cls = Class.forName(strZzc);
                                            }
                                            break;
                                        default:
                                            cls = Class.forName(strZzc);
                                            break;
                                    }
                                    zzaujVar18.zzb(zzaus.zza(cls));
                                    return Optional.empty();
                                } catch (zzaup unused8) {
                                    zzatcVar = zzatc.zzl;
                                    return Optional.of(zzatcVar);
                                } catch (ClassNotFoundException unused9) {
                                    zzatcVar = zzatc.zzm;
                                    return Optional.of(zzatcVar);
                                }
                            case 19:
                                try {
                                    zzauj zzaujVar19 = ((zzaun) obj).zzb;
                                    List listZzo3 = zzaujVar19.zzc().zzo();
                                    Class<?>[] clsArr = new Class[listZzo3.size()];
                                    while (i3 < listZzo3.size()) {
                                        Object objZzl2 = ((zzaus) listZzo3.get(i3)).zzl();
                                        if (!(objZzl2 instanceof Class)) {
                                            zzatcVar3 = zzatc.zzn;
                                            return Optional.of(zzatcVar3);
                                        }
                                        clsArr[i3] = (Class) objZzl2;
                                        i3++;
                                    }
                                    String strZzc2 = zzaujVar19.zzc().zzn().zzc();
                                    Object objZzl3 = zzaujVar19.zzc().zzl();
                                    if (objZzl3 instanceof Class) {
                                        zzaujVar19.zzb(zzaus.zza(((Class) objZzl3).getMethod(strZzc2, clsArr)));
                                        return Optional.empty();
                                    }
                                    zzatcVar3 = zzatc.zzn;
                                    return Optional.of(zzatcVar3);
                                } catch (zzaup unused10) {
                                    zzatcVar = zzatc.zzn;
                                    return Optional.of(zzatcVar);
                                } catch (NoSuchMethodException unused11) {
                                    zzatcVar = zzatc.zzo;
                                    return Optional.of(zzatcVar);
                                } catch (SecurityException unused12) {
                                    zzatcVar = zzatc.zzC;
                                    return Optional.of(zzatcVar);
                                }
                            default:
                                int i16 = ((((~306851320) & 2040670728) | 1372152390) + ((306851320 & (-1473639347)) | (-2036492681))) - 244167092;
                                int i17 = 1764892438 % 764851988;
                                zzauj zzaujVar20 = ((zzaun) obj).zzb;
                                long jZzm7 = zzaujVar20.zzc().zzm();
                                zzaus zzausVarZzc = zzaujVar20.zzc();
                                zzaus zzausVarZzc2 = zzaujVar20.zzc();
                                int i18 = zzausVarZzc2.zza;
                                int i19 = (i16 ^ i17) + i18;
                                if (i18 == 0) {
                                    throw null;
                                }
                                if (i19 == 3) {
                                    zzatw zzatwVarZzn3 = zzausVarZzc2.zzn();
                                    int i20 = ((((~284327308) & 44384696) | 1708231444) + ((284327308 & 1647591593) | 1951966997)) - (-1088446899);
                                    int i21 = 2085308422 % 531900034;
                                    if (jZzm7 < 0) {
                                        jZzm7 += (long) zzatwVarZzn3.zza.length;
                                    }
                                    if (zzausVarZzc.zza != (i20 ^ i21)) {
                                        throw new zzaup();
                                    }
                                    if (jZzm7 >= 0 && jZzm7 < zzatwVarZzn3.zza.length) {
                                        char cCharAt = zzatwVarZzn3.zzc().charAt((int) jZzm7);
                                        StringBuilder sb = new StringBuilder(String.valueOf(cCharAt).length());
                                        sb.append(cCharAt);
                                        zzausVarZzc = zzaus.zzd(zzatw.zzf(sb.toString()));
                                    }
                                } else {
                                    if (i19 != 4) {
                                        throw new zzaup();
                                    }
                                    List listZzo4 = zzausVarZzc2.zzo();
                                    if (jZzm7 < 0) {
                                        jZzm7 += (long) listZzo4.size();
                                    }
                                    if (jZzm7 >= 0 && jZzm7 < listZzo4.size()) {
                                        zzausVarZzc = (zzaus) listZzo4.get((int) jZzm7);
                                    }
                                }
                                zzaujVar20.zzb(zzausVarZzc);
                                return Optional.empty();
                        }
                    } catch (zzaty | zzaua | zzaup unused13) {
                        zzatcVar = zzatc.zzy;
                    }
                } catch (zzauf | zzauh unused14) {
                    zzatcVar = zzatc.zzx;
                }
            } catch (zzauh unused15) {
                zzatcVar = zzatc.zzf;
            }
        } catch (zzaui e2) {
            throw new AssertionError(zzatu.zza("CEiv6BFfPnitUE+D"), e2);
        }
    }
}
