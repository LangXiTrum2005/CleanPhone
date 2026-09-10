package com.google.android.gms.internal.ads;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class zzatt implements zzauk {
    public static final /* synthetic */ zzatt zza;
    public static final /* synthetic */ zzatt zzb;
    public static final /* synthetic */ zzatt zzc;
    public static final /* synthetic */ zzatt zzd;
    public static final /* synthetic */ zzatt zze;
    public static final /* synthetic */ zzatt zzf;
    public static final /* synthetic */ zzatt zzg;
    public static final /* synthetic */ zzatt zzh;
    public static final /* synthetic */ zzatt zzi;
    public static final /* synthetic */ zzatt zzj;
    public static final /* synthetic */ zzatt zzk;
    public static final /* synthetic */ zzatt zzl;
    public static final /* synthetic */ zzatt zzm;
    public static final /* synthetic */ zzatt zzn;
    public static final /* synthetic */ zzatt zzo;
    public static final /* synthetic */ zzatt zzp;
    private final /* synthetic */ int zzq;

    static {
        int i2 = (((((~358984857) & 11257432) | 369424399) + ((358984857 & 615188052) | 873771151)) - 1245366369) ^ (1985433483 % 395279207);
        int i3 = (((((~1402492972) & 1009329808) | 1643537068) + ((1402492972 & 503911450) | 580170602)) - (-2136216298)) ^ (1489001354 % 953691761);
        int i4 = (((((~1389079342) & 405954790) | 5768193) + ((1389079342 & 967468022) | 1640566552)) - 1618010502) ^ (1588695568 % 1155465115);
        int i5 = (((((~1666231349) & 289538432) | 621649449) + ((1666231349 & 406985104) | 264059443)) - 1093855303) ^ (1698487330 % 272312086);
        int i6 = (((((~1953161956) & 2021553924) | 1308628610) + ((1953161956 & 813590916) | 134225131)) - 2074905685) ^ (1172063133 % 990526343);
        int i7 = (((((~1889804310) & 69748745) | 707083896) + ((1889804310 & 604795185) | 951435262)) - 1284100923) ^ (1663080928 % 610506582);
        int i8 = (((((~279121308) & 136482862) | 293951273) + ((279121308 & 1302561302) | 1440046744)) - 1857458389) ^ (1404515797 % 695748720);
        int i9 = (((((~1460082195) & 849562858) | 543970048) + ((1460082195 & 381881578) | 1279262981)) - 1872584419) ^ (1122336503 % 861109485);
        int i10 = (((((~70788355) & 1377181904) | 713084892) + ((70788355 & 1410740224) | 99160279)) - 1955016785) ^ (1156541312 % 318561886);
        int i11 = (((((~12895151) & 1277237303) | 185162640) + ((12895151 & 1411547303) | 306429832)) - 1475739783) ^ (1498617647 % 669908538);
        int i12 = (((((~1566288819) & 1018167620) | 793479703) + ((1566288819 & 284165456) | 1648575546)) - (-1895196318)) ^ (846942590 % 524688209);
        int i13 = (((((~1540846267) & 571107379) | 1484708373) + ((1540846267 & 709108258) | 1568035525)) - (-834164565)) ^ (2037335344 % 1874960596);
        zzp = new zzatt((((((~1245644428) & 268473430) | 2019232319) + ((1245644428 & 2266696) | 1693582250)) - (-827594116)) ^ (1308581515 % 354367395));
        zzo = new zzatt((((((~464837581) & 1181588952) | 603091067) + ((464837581 & 1544523140) | 967967255)) - (-2124025763)) ^ (1295815494 % 753959819));
        zzn = new zzatt(i13);
        zzm = new zzatt(i4);
        zzl = new zzatt(i5);
        zzk = new zzatt(i6);
        zzj = new zzatt(i3);
        zzi = new zzatt(i7);
        zzh = new zzatt(i8);
        zzg = new zzatt(i9);
        zzf = new zzatt(i2);
        zze = new zzatt(i10);
        zzd = new zzatt(i11);
        zzc = new zzatt(i12);
        zzb = new zzatt(1);
        zza = new zzatt(0);
    }

    private /* synthetic */ zzatt(int i2) {
        this.zzq = i2;
    }

    @Override // java.util.function.Function
    public final /* synthetic */ Object apply(Object obj) {
        zzatc zzatcVar;
        zzaus zzausVarZzc;
        int i2 = ((((~603123090) & 1079339320) | 204100681) + ((603123090 & 1131784560) | 52466888)) - 1316176740;
        int i3 = 1216803069 % 33252481;
        try {
            try {
                try {
                    try {
                        try {
                            switch (this.zzq) {
                                case 0:
                                    return ((zzaun) obj).zza();
                                case 1:
                                    try {
                                        zzauj zzaujVar = ((zzaun) obj).zzb;
                                        long jZzm = zzaujVar.zzc().zzm();
                                        zzaus zzausVarZzc2 = zzaujVar.zzc();
                                        List listZzo = zzausVarZzc2.zzo();
                                        if (jZzm < 0) {
                                            jZzm += (long) listZzo.size();
                                        }
                                        if (jZzm < 0 || jZzm >= listZzo.size()) {
                                            throw new zzauq();
                                        }
                                        listZzo.remove((int) jZzm);
                                        zzaujVar.zzb(zzausVarZzc2);
                                        return Optional.empty();
                                    } catch (zzauq unused) {
                                        zzatcVar = zzatc.zzI;
                                    }
                                    break;
                                case 2:
                                    zzaun zzaunVar = (zzaun) obj;
                                    zzauj zzaujVar2 = zzaunVar.zzb;
                                    zzaus zzausVarZzc3 = zzaujVar2.zzc();
                                    zzatw zzatwVarZzn = zzaujVar2.zzc().zzn();
                                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                                    zzausVarZzc3.zzk(byteArrayOutputStream);
                                    zzaunVar.zzb.zzb(zzaus.zzd(zzatwVarZzn.zzd(zzatw.zze(byteArrayOutputStream.toByteArray()))));
                                    return Optional.empty();
                                case 3:
                                    zzaun zzaunVar2 = (zzaun) obj;
                                    zzauj zzaujVar3 = zzaunVar2.zzb;
                                    zzaus zzausVarZzc4 = zzaujVar3.zzc();
                                    zzatw zzatwVarZzn2 = zzaujVar3.zzc().zzn();
                                    ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                                    zzats.zzb(zzausVarZzc4.zzm(), new zzaur(byteArrayOutputStream2, i2 ^ i3), false);
                                    zzaunVar2.zzb.zzb(zzaus.zzd(zzatwVarZzn2.zzd(zzatw.zze(byteArrayOutputStream2.toByteArray()))));
                                    return Optional.empty();
                                case 4:
                                    zzaun zzaunVar3 = (zzaun) obj;
                                    zzaunVar3.zzb.zze(-(zzaunVar3.zzc.zzb().zzb + zzaunVar3.zzd.zze()), zzaunVar3.zzb.zzc());
                                    return Optional.empty();
                                case 5:
                                    zzauj zzaujVar4 = ((zzaun) obj).zzb;
                                    zzaujVar4.zzb(zzaus.zzb(zzaujVar4.zzc().zzm() << ((int) zzaujVar4.zzc().zzm())));
                                    return Optional.empty();
                                case 6:
                                    zzauj zzaujVar5 = ((zzaun) obj).zzb;
                                    zzaujVar5.zzb(zzaus.zzb(zzaujVar5.zzc().zzm() >>> ((int) zzaujVar5.zzc().zzm())));
                                    return Optional.empty();
                                case 7:
                                    zzauj zzaujVar6 = ((zzaun) obj).zzb;
                                    zzaujVar6.zzb(zzaus.zzc(zzaujVar6.zzc().zzq() - zzaujVar6.zzc().zzq()));
                                    return Optional.empty();
                                case 8:
                                    zzauj zzaujVar7 = ((zzaun) obj).zzb;
                                    zzaujVar7.zzb(zzaus.zzb(zzaujVar7.zzc().zzm() - zzaujVar7.zzc().zzm()));
                                    return Optional.empty();
                                case 9:
                                    zzaun zzaunVar4 = (zzaun) obj;
                                    zzauj zzaujVar8 = zzaunVar4.zzb;
                                    long jZzm2 = zzaujVar8.zzc().zzm();
                                    zzaus zzausVarZzc5 = zzaujVar8.zzc();
                                    zzauj zzaujVar9 = zzaunVar4.zzb;
                                    zzaus zzausVarZzd = zzaujVar9.zzd(jZzm2);
                                    zzaujVar9.zze(jZzm2, zzausVarZzc5);
                                    zzaujVar9.zzb(zzausVarZzd);
                                    return Optional.empty();
                                case 10:
                                    zzaun zzaunVar5 = (zzaun) obj;
                                    zzauj zzaujVar10 = zzaunVar5.zzb;
                                    long jZzm3 = zzaunVar5.zzc.zzb().zzb + zzaujVar10.zzc().zzm();
                                    zzaus zzausVarZzc6 = zzaujVar10.zzc();
                                    zzauj zzaujVar11 = zzaunVar5.zzb;
                                    long j = -jZzm3;
                                    zzaus zzausVarZzd2 = zzaujVar11.zzd(j);
                                    zzaujVar11.zze(j, zzausVarZzc6);
                                    zzaujVar11.zzb(zzausVarZzd2);
                                    return Optional.empty();
                                case 11:
                                    zzaun zzaunVar6 = (zzaun) obj;
                                    long jZze = zzaunVar6.zzc.zzb().zzb + zzaunVar6.zzd.zze();
                                    zzaus zzausVarZzc7 = zzaunVar6.zzb.zzc();
                                    zzauj zzaujVar12 = zzaunVar6.zzb;
                                    long j2 = -jZze;
                                    zzaus zzausVarZzd3 = zzaujVar12.zzd(j2);
                                    zzaujVar12.zze(j2, zzausVarZzc7);
                                    zzaujVar12.zzb(zzausVarZzd3);
                                    return Optional.empty();
                                case 12:
                                    zzaun zzaunVar7 = (zzaun) obj;
                                    long jZzm4 = zzaunVar7.zzb.zzc().zzm();
                                    try {
                                        zzauj zzaujVar13 = zzaunVar7.zzb;
                                        int i4 = ((((~1349029729) & 1683806466) | 298308136) + ((1349029729 & (-199751405)) | (-1830723495))) - 438321650;
                                        int i5 = 1478326644 % 593443203;
                                        if (jZzm4 == 0) {
                                            zzausVarZzc = zzaujVar13.zzc();
                                        } else {
                                            int iZza = zzaujVar13.zza(jZzm4);
                                            zzaujVar13.zzb += i4 ^ i5;
                                            zzausVarZzc = (zzaus) zzaujVar13.zza.remove(iZza);
                                        }
                                        zzaujVar13.zzb(zzausVarZzc);
                                        return Optional.empty();
                                    } catch (zzauh unused2) {
                                        zzatcVar = zzatc.zzg;
                                    }
                                    break;
                                case 13:
                                    zzaun zzaunVar8 = (zzaun) obj;
                                    try {
                                        zzauj zzaujVar14 = zzaunVar8.zzb;
                                        long jZzm5 = zzaujVar14.zzc().zzm();
                                        long jZzm6 = zzaujVar14.zzc().zzm();
                                        zzaug zzaugVar = zzaunVar8.zzc;
                                        zzaub zzaubVar = zzaunVar8.zzd;
                                        zzaugVar.zza(zzaubVar.zzb(), jZzm6, zzaugVar.zzb().zzb);
                                        zzaubVar.zza(jZzm5);
                                        return Optional.empty();
                                    } catch (zzatz | zzaua unused3) {
                                        zzatcVar = zzatc.zzr;
                                    } catch (zzaue unused4) {
                                        zzatcVar = zzatc.zzB;
                                    } catch (zzauf unused5) {
                                        zzatcVar = zzatc.zzw;
                                    }
                                    break;
                                case 14:
                                    zzaun zzaunVar9 = (zzaun) obj;
                                    try {
                                        zzaunVar9.zzb.zzb(zzaus.zzg(zzaunVar9.zzb.zzc().zzl()));
                                        return Optional.empty();
                                    } catch (zzaup unused6) {
                                        zzatcVar = zzatc.zzp;
                                    }
                                    break;
                                default:
                                    try {
                                        zzauj zzaujVar15 = ((zzaun) obj).zzb;
                                        Iterator it = zzaujVar15.zzc().zzo().iterator();
                                        while (it.hasNext()) {
                                            zzaujVar15.zzb((zzaus) it.next());
                                        }
                                        return Optional.empty();
                                    } catch (zzaui unused7) {
                                        zzatcVar = zzatc.zza;
                                    }
                                    break;
                            }
                        } catch (zzaup unused8) {
                            zzatcVar = zzatc.zzk;
                        } catch (IOException e2) {
                            e = e2;
                            throw new AssertionError(zzatu.zza("CEiv6BFfPnitUE+D"), e);
                        }
                    } catch (zzaty | zzaua | zzaup unused9) {
                        zzatcVar = zzatc.zzy;
                    }
                } catch (zzaui e3) {
                    e = e3;
                    throw new AssertionError(zzatu.zza("CEiv6BFfPnitUE+D"), e);
                }
            } catch (zzauh unused10) {
                zzatcVar = zzatc.zzh;
            }
        } catch (zzauf | zzauh unused11) {
            zzatcVar = zzatc.zzx;
        }
        return Optional.of(zzatcVar);
    }
}
