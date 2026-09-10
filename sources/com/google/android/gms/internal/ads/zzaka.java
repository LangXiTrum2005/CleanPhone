package com.google.android.gms.internal.ads;

import android.util.Pair;
import com.applovin.impl.Z;
import com.applovin.shadow.okio.Segment;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import com.startapp.simple.bloomfilter.codec.IOUtils;
import com.thinkup.core.common.n.mo;
import com.unity3d.services.core.device.MimeTypes;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
public final class zzaka {
    public static final /* synthetic */ int zza = 0;
    private static final byte[] zzb;

    static {
        String str = zzfj.zza;
        zzb = "OpusHead".getBytes(StandardCharsets.UTF_8);
    }

    public static int zza(int i2) {
        return (i2 >> 24) & 255;
    }

    /* JADX WARN: Code duplicated, block: B:295:0x05dc  */
    /* JADX WARN: Code duplicated, block: B:304:0x06d4  */
    /* JADX WARN: Code duplicated, block: B:306:0x06da  */
    /* JADX WARN: Code duplicated, block: B:308:0x06e4  */
    /* JADX WARN: Code duplicated, block: B:309:0x06e9  */
    /* JADX WARN: Code duplicated, block: B:312:0x0701  */
    /* JADX WARN: Code duplicated, block: B:315:0x0710  */
    /* JADX WARN: Code duplicated, block: B:317:0x0716  */
    /* JADX WARN: Code duplicated, block: B:318:0x071c  */
    /* JADX WARN: Code duplicated, block: B:320:0x0721  */
    /* JADX WARN: Code duplicated, block: B:321:0x0724  */
    /* JADX WARN: Code duplicated, block: B:325:0x075e  */
    /* JADX WARN: Code duplicated, block: B:327:0x076b  */
    /* JADX WARN: Code duplicated, block: B:330:0x078d  */
    /* JADX WARN: Code duplicated, block: B:331:0x078f  */
    /* JADX WARN: Code duplicated, block: B:333:0x0795  */
    /* JADX WARN: Code duplicated, block: B:334:0x079a  */
    /* JADX WARN: Code duplicated, block: B:337:0x07ab  */
    /* JADX WARN: Code duplicated, block: B:339:0x07b1  */
    /* JADX WARN: Code duplicated, block: B:341:0x07b5  */
    /* JADX WARN: Code duplicated, block: B:344:0x07c9  */
    /* JADX WARN: Code duplicated, block: B:345:0x07cf  */
    /* JADX WARN: Code duplicated, block: B:347:0x0805  */
    /* JADX WARN: Code duplicated, block: B:349:0x080a  */
    /* JADX WARN: Code duplicated, block: B:351:0x0810  */
    /* JADX WARN: Code duplicated, block: B:353:0x0814  */
    /* JADX WARN: Code duplicated, block: B:356:0x0828  */
    /* JADX WARN: Code duplicated, block: B:357:0x082e  */
    /* JADX WARN: Code duplicated, block: B:361:0x083c  */
    /* JADX WARN: Code duplicated, block: B:363:0x0883  */
    /* JADX WARN: Code duplicated, block: B:365:0x0888  */
    /* JADX WARN: Code duplicated, block: B:367:0x0899  */
    /* JADX WARN: Code duplicated, block: B:369:0x08a2  */
    /* JADX WARN: Code duplicated, block: B:370:0x08a5  */
    /* JADX WARN: Code duplicated, block: B:371:0x08a7  */
    /* JADX WARN: Code duplicated, block: B:374:0x08be  */
    /* JADX WARN: Code duplicated, block: B:375:0x08c1  */
    /* JADX WARN: Code duplicated, block: B:378:0x08cc A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:379:0x08ce  */
    /* JADX WARN: Code duplicated, block: B:380:0x08d1  */
    /* JADX WARN: Code duplicated, block: B:384:0x08dc A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:385:0x08de  */
    /* JADX WARN: Code duplicated, block: B:386:0x08e1  */
    /* JADX WARN: Code duplicated, block: B:390:0x08ec A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:391:0x08ee  */
    /* JADX WARN: Code duplicated, block: B:392:0x08f1  */
    /* JADX WARN: Code duplicated, block: B:396:0x08fb  */
    /* JADX WARN: Code duplicated, block: B:397:0x08fe  */
    /* JADX WARN: Code duplicated, block: B:400:0x0908  */
    /* JADX WARN: Code duplicated, block: B:401:0x090b  */
    /* JADX WARN: Code duplicated, block: B:404:0x0913  */
    /* JADX WARN: Code duplicated, block: B:405:0x0927  */
    /* JADX WARN: Code duplicated, block: B:407:0x094d  */
    /* JADX WARN: Code duplicated, block: B:409:0x0952  */
    /* JADX WARN: Code duplicated, block: B:412:0x0964  */
    /* JADX WARN: Code duplicated, block: B:414:0x096d  */
    /* JADX WARN: Code duplicated, block: B:415:0x0972  */
    /* JADX WARN: Code duplicated, block: B:418:0x0983  */
    /* JADX WARN: Code duplicated, block: B:421:0x0992  */
    /* JADX WARN: Code duplicated, block: B:423:0x099b  */
    /* JADX WARN: Code duplicated, block: B:424:0x099e  */
    /* JADX WARN: Code duplicated, block: B:429:0x09be  */
    /* JADX WARN: Code duplicated, block: B:431:0x09c3  */
    /* JADX WARN: Code duplicated, block: B:434:0x09c8  */
    /* JADX WARN: Code duplicated, block: B:435:0x09cc  */
    /* JADX WARN: Code duplicated, block: B:437:0x09d1  */
    /* JADX WARN: Code duplicated, block: B:438:0x09d3  */
    /* JADX WARN: Code duplicated, block: B:440:0x09e2 A[LOOP:7: B:419:0x098e->B:440:0x09e2, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:442:0x09f4  */
    /* JADX WARN: Code duplicated, block: B:446:0x0a0c  */
    /* JADX WARN: Code duplicated, block: B:447:0x0a0e  */
    /* JADX WARN: Code duplicated, block: B:449:0x0a15 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:450:0x0a17  */
    /* JADX WARN: Code duplicated, block: B:452:0x0a20  */
    /* JADX WARN: Code duplicated, block: B:457:0x0a51  */
    /* JADX WARN: Code duplicated, block: B:459:0x0a55  */
    /* JADX WARN: Code duplicated, block: B:461:0x0a67  */
    /* JADX WARN: Code duplicated, block: B:465:0x0a73  */
    /* JADX WARN: Code duplicated, block: B:466:0x0a76  */
    /* JADX WARN: Code duplicated, block: B:467:0x0a7f  */
    /* JADX WARN: Code duplicated, block: B:473:0x0a96  */
    /* JADX WARN: Code duplicated, block: B:592:0x0e0c  */
    /* JADX WARN: Code duplicated, block: B:593:0x0e1e  */
    /* JADX WARN: Code duplicated, block: B:596:0x0e2d  */
    /* JADX WARN: Code duplicated, block: B:600:0x0e4f  */
    /* JADX WARN: Code duplicated, block: B:601:0x0e59  */
    /* JADX WARN: Code duplicated, block: B:603:0x0ebc  */
    /* JADX WARN: Code duplicated, block: B:604:0x0ec1  */
    /* JADX WARN: Code duplicated, block: B:607:0x0ed8  */
    /* JADX WARN: Code duplicated, block: B:608:0x0eef A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:609:0x0ef1  */
    /* JADX WARN: Code duplicated, block: B:623:0x0f89  */
    /* JADX WARN: Code duplicated, block: B:624:0x0f8d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:625:0x0f8f  */
    /* JADX WARN: Code duplicated, block: B:627:0x0f9e  */
    /* JADX WARN: Code duplicated, block: B:628:0x0faa  */
    /* JADX WARN: Code duplicated, block: B:654:0x0775 A[EDGE_INSN: B:654:0x0775->B:329:0x0775 BREAK  A[LOOP:5: B:323:0x075a->B:598:0x0e39], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:668:0x09ec A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:669:0x09ad A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:68:0x0176  */
    /* JADX WARN: Code duplicated, block: B:71:0x017c  */
    /* JADX WARN: Code duplicated, block: B:73:0x0182  */
    /* JADX WARN: Code duplicated, block: B:74:0x0184  */
    /* JADX WARN: Code duplicated, block: B:76:0x0188  */
    /* JADX WARN: Code duplicated, block: B:77:0x018a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:78:0x018c  */
    /* JADX WARN: Code duplicated, block: B:79:0x018f  */
    /* JADX WARN: Code duplicated, block: B:82:0x0194 A[PHI: r1
  0x0194: PHI (r1v9 int) = (r1v10 int), (r1v4 int) binds: [B:87:0x019f, B:76:0x0188] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:84:0x0198 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:85:0x019a  */
    /* JADX WARN: Code duplicated, block: B:86:0x019d  */
    /* JADX WARN: Code duplicated, block: B:88:0x01a1  */
    /* JADX WARN: Code duplicated, block: B:89:0x01a4  */
    /* JADX WARN: Code duplicated, block: B:91:0x01a8  */
    /* JADX WARN: Code duplicated, block: B:95:0x01b0 A[ADDED_TO_REGION] */
    /* JADX WARN: Multi-variable type inference failed */
    public static List zzb(zzfu zzfuVar, zzafg zzafgVar, long j, zzq zzqVar, boolean z2, boolean z3, zzgpr zzgprVar, boolean z4) throws zzat {
        int i2;
        String str;
        long jZzz;
        int i3;
        char c2;
        char c3;
        char c4;
        char c5;
        long j2;
        long jZzt;
        ArrayList arrayList;
        long jZzt2;
        String str2;
        String str3;
        ArrayList arrayList2;
        int i4;
        int i5;
        int i6;
        int i7;
        zzfu zzfuVar2;
        long[] jArr;
        long[] jArr2;
        zzv zzvVarZzM;
        zzakv zzakvVar;
        zzft zzftVar;
        zzap zzapVar;
        zzap zzapVar2;
        Pair pairZzn;
        boolean z5;
        int i8;
        int i9;
        int iZzt;
        int iZzt2;
        int iZzg;
        int iIntValue;
        zzq zzqVar2;
        int i10;
        String str4;
        zzq zzqVar3;
        int i11;
        String str5;
        char c6;
        String str6;
        String str7;
        float fZzH;
        int i12;
        int i13;
        int i14;
        zzgj zzgjVar;
        List listZzj;
        int i15;
        int i16;
        boolean z6;
        int i17;
        int i18;
        int i19;
        ByteBuffer byteBufferZzm;
        zzajp zzajpVarZzq;
        byte[] bArrCopyOfRange;
        zzajr zzajrVar;
        int i20;
        String str8;
        int i21;
        int iZzc;
        int i22;
        int i23;
        zzajw zzajwVar;
        int i24;
        int i25;
        zzt zztVar;
        byte[] bArrArray;
        int iZzg2;
        int iZzB;
        int i26;
        boolean z7;
        int iZzB2;
        String str9;
        zzajw zzajwVar2;
        int i27;
        int i28;
        byte[] bArr;
        zzgtd zzgtdVarZzi;
        zzfr zzfrVarZza;
        zzgj zzgjVar2;
        int i29;
        boolean z8;
        int i30;
        int iZzg3;
        zzajs zzajsVar;
        zzajz zzajzVar;
        int iZzB3;
        boolean z9;
        String str10;
        int iZzg4;
        int iZzB4;
        boolean z10;
        int iZzs;
        int i31;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        zzafh zzafhVarZzb;
        boolean z16;
        int i32;
        int i33;
        int i34;
        boolean z17;
        boolean z18;
        zzgtd zzgtdVarZzi2;
        boolean z19;
        boolean z20;
        boolean z21;
        boolean z22;
        zzafh zzafhVarZza;
        boolean z23;
        int i35;
        boolean z24;
        zzadt zzadtVarZza;
        boolean z25;
        Pair pairZzr;
        zzq zzqVarZzb;
        zzgtd zzgtdVarZzj;
        String str11;
        long j3;
        char c7;
        char c8;
        int i36;
        char c9;
        String str12 = "application/ttml+xml";
        String str13 = "BoxParsers";
        int i37 = 1835297121;
        int i38 = 10;
        int i39 = 4;
        int i40 = 8;
        ArrayList arrayList3 = new ArrayList();
        int i41 = 0;
        char c10 = 0;
        while (true) {
            List list = zzfuVar.zzc;
            if (i41 >= list.size()) {
                return arrayList3;
            }
            zzfu zzfuVar3 = (zzfu) list.get(i41);
            if (zzfuVar3.zzd != 1953653099) {
                i5 = i41;
                str3 = str13;
                i36 = i37;
                i4 = i38;
                i7 = i39;
                str = str12;
                i6 = i40;
                c9 = c10;
            } else {
                zzfv zzfvVarZzc = zzfuVar.zzc(1836476516);
                zzfvVarZzc.getClass();
                zzfu zzfuVarZzd = zzfuVar3.zzd(i37);
                zzfuVarZzd.getClass();
                zzfv zzfvVarZzc2 = zzfuVarZzd.zzc(1751411826);
                zzfvVarZzc2.getClass();
                int iZzi = zzi(zzfvVarZzc2.zza);
                if (iZzi == 1936684398) {
                    i2 = 1;
                } else if (iZzi == 1986618469) {
                    i2 = 2;
                } else if (iZzi == 1952807028 || iZzi == 1935832172 || iZzi == 1937072756 || iZzi == 1668047728 || iZzi == 1937072752) {
                    i2 = 3;
                } else {
                    i2 = iZzi == 1835365473 ? 5 : -1;
                }
                if (i2 == -1) {
                    arrayList2 = arrayList3;
                    i5 = i41;
                    str3 = str13;
                    i4 = i38;
                    i7 = i39;
                    str = str12;
                    zzfuVar2 = zzfuVar3;
                    i6 = i40;
                    zzakvVar = null;
                } else {
                    zzfv zzfvVarZzc3 = zzfuVar3.zzc(1953196132);
                    zzfvVarZzc3.getClass();
                    zzer zzerVar = zzfvVarZzc3.zza;
                    zzerVar.zzh(i40);
                    int iZza = zza(zzerVar.zzB());
                    if (iZza != 0) {
                        i40 = 16;
                    }
                    zzerVar.zzk(i40);
                    int iZzB5 = zzerVar.zzB();
                    zzerVar.zzk(i39);
                    int iZzg5 = zzerVar.zzg();
                    int i42 = c10;
                    while (true) {
                        int i43 = iZza == 0 ? i39 : 8;
                        str = str12;
                        if (i42 >= i43) {
                            zzerVar.zzk(i43);
                        } else {
                            if (zzerVar.zzi()[iZzg5 + i42] != -1) {
                                jZzz = iZza == 0 ? zzerVar.zzz() : zzerVar.zzJ();
                                if (jZzz != 0) {
                                    break;
                                }
                                break;
                            }
                            i42++;
                            str12 = str;
                            i39 = 4;
                        }
                        jZzz = -9223372036854775807L;
                        break;
                    }
                    zzerVar.zzk(i38);
                    int iZzt3 = zzerVar.zzt();
                    zzerVar.zzk(4);
                    int iZzB6 = zzerVar.zzB();
                    int i44 = i38;
                    int iZzB7 = zzerVar.zzB();
                    zzerVar.zzk(4);
                    int iZzB8 = zzerVar.zzB();
                    int iZzB9 = zzerVar.zzB();
                    if (iZzB6 != 0) {
                        if (iZzB6 == 0) {
                            if (iZzB7 == -65536) {
                                if (iZzB8 != 65536) {
                                    if (iZzB8 == -65536) {
                                        if (iZzB9 == 0) {
                                            c5 = c10;
                                        } else {
                                            c5 = 1;
                                        }
                                        c4 = c5;
                                        iZzB8 = -65536;
                                    }
                                    iZzB7 = -65536;
                                } else if (iZzB9 == 0) {
                                    c4 = c10;
                                } else {
                                    c4 = 1;
                                }
                                if (1 != c4) {
                                    c2 = 270;
                                } else {
                                    iZzB7 = -65536;
                                }
                                c3 = c2;
                            }
                            i3 = c10;
                        } else {
                            i3 = iZzB6;
                        }
                        if ((i3 != -65536 || i3 == 65536) && iZzB7 == 0 && iZzB8 == 0 && iZzB9 == -65536) {
                            c3 = c2;
                        } else {
                            c3 = c10;
                        }
                    } else {
                        if (iZzB7 != 65536) {
                            iZzB6 = c10;
                            if (iZzB6 == 0) {
                                if (iZzB7 == -65536) {
                                    if (iZzB8 != 65536) {
                                        if (iZzB8 == -65536) {
                                            if (iZzB9 == 0) {
                                                c5 = c10;
                                            } else {
                                                c5 = 1;
                                            }
                                            c4 = c5;
                                            iZzB8 = -65536;
                                        }
                                        iZzB7 = -65536;
                                    } else if (iZzB9 == 0) {
                                        c4 = c10;
                                    } else {
                                        c4 = 1;
                                    }
                                    if (1 != c4) {
                                        c2 = 270;
                                    } else {
                                        iZzB7 = -65536;
                                    }
                                }
                                i3 = c10;
                            } else {
                                i3 = iZzB6;
                            }
                            c2 = i3 != -65536 ? (char) 180 : (char) 180;
                            c3 = c10;
                        } else {
                            if (iZzB8 == -65536) {
                                if (iZzB9 == 0) {
                                    c7 = c10;
                                } else {
                                    c7 = 1;
                                    c8 = 1;
                                }
                                if (c8 != c7) {
                                    c2 = 'Z';
                                } else {
                                    iZzB6 = c10;
                                    iZzB7 = 65536;
                                    if (iZzB6 == 0) {
                                        if (iZzB7 == -65536) {
                                            if (iZzB8 != 65536) {
                                                if (iZzB8 == -65536) {
                                                    if (iZzB9 == 0) {
                                                        c5 = c10;
                                                    } else {
                                                        c5 = 1;
                                                    }
                                                    c4 = c5;
                                                    iZzB8 = -65536;
                                                }
                                                iZzB7 = -65536;
                                            } else if (iZzB9 == 0) {
                                                c4 = c10;
                                            } else {
                                                c4 = 1;
                                            }
                                            if (1 != c4) {
                                                c2 = 270;
                                            } else {
                                                iZzB7 = -65536;
                                            }
                                        }
                                        i3 = c10;
                                    } else {
                                        i3 = iZzB6;
                                    }
                                    if (i3 != -65536) {
                                    }
                                    c3 = c10;
                                }
                            } else if (iZzB8 == 65536) {
                                c7 = iZzB9 == 0 ? c10 : (char) 1;
                                iZzB8 = 65536;
                            } else {
                                iZzB7 = 65536;
                                iZzB6 = c10;
                                if (iZzB6 == 0) {
                                    if (iZzB7 == -65536) {
                                        if (iZzB8 != 65536) {
                                            if (iZzB8 == -65536) {
                                                if (iZzB9 == 0) {
                                                    c5 = c10;
                                                } else {
                                                    c5 = 1;
                                                }
                                                c4 = c5;
                                                iZzB8 = -65536;
                                            }
                                            iZzB7 = -65536;
                                        } else if (iZzB9 == 0) {
                                            c4 = c10;
                                        } else {
                                            c4 = 1;
                                        }
                                        if (1 != c4) {
                                            c2 = 270;
                                        } else {
                                            iZzB7 = -65536;
                                        }
                                    }
                                    i3 = c10;
                                } else {
                                    i3 = iZzB6;
                                }
                                if (i3 != -65536) {
                                }
                                c3 = c10;
                            }
                            c8 = 1;
                            if (c8 != c7) {
                                c2 = 'Z';
                            } else {
                                iZzB6 = c10;
                                iZzB7 = 65536;
                                if (iZzB6 == 0) {
                                    if (iZzB7 == -65536) {
                                        if (iZzB8 != 65536) {
                                            if (iZzB8 == -65536) {
                                                if (iZzB9 == 0) {
                                                    c5 = c10;
                                                } else {
                                                    c5 = 1;
                                                }
                                                c4 = c5;
                                                iZzB8 = -65536;
                                            }
                                            iZzB7 = -65536;
                                        } else if (iZzB9 == 0) {
                                            c4 = c10;
                                        } else {
                                            c4 = 1;
                                        }
                                        if (1 != c4) {
                                            c2 = 270;
                                        } else {
                                            iZzB7 = -65536;
                                        }
                                    }
                                    i3 = c10;
                                } else {
                                    i3 = iZzB6;
                                }
                                if (i3 != -65536) {
                                }
                                c3 = c10;
                            }
                        }
                        c3 = c2;
                    }
                    zzerVar.zzk(16);
                    short sZzv = zzerVar.zzv();
                    zzerVar.zzk(2);
                    short sZzv2 = zzerVar.zzv();
                    long j4 = j == -9223372036854775807L ? jZzz : j;
                    long j5 = zzd(zzfvVarZzc.zza).zzc;
                    if (j4 == -9223372036854775807L) {
                        j2 = j5;
                        jZzt = -9223372036854775807L;
                    } else {
                        j2 = j5;
                        jZzt = zzfj.zzt(j4, 1000000L, j2, RoundingMode.DOWN);
                    }
                    zzfu zzfuVarZzd2 = zzfuVarZzd.zzd(1835626086);
                    zzfuVarZzd2.getClass();
                    zzfu zzfuVarZzd3 = zzfuVarZzd2.zzd(1937007212);
                    zzfuVarZzd3.getClass();
                    zzfv zzfvVarZzc4 = zzfuVarZzd.zzc(1835296868);
                    zzfvVarZzc4.getClass();
                    zzer zzerVar2 = zzfvVarZzc4.zza;
                    zzerVar2.zzh(8);
                    int iZza2 = zza(zzerVar2.zzB());
                    zzerVar2.zzk(iZza2 == 0 ? 8 : 16);
                    long jZzz2 = zzerVar2.zzz();
                    int iZzg6 = zzerVar2.zzg();
                    int i45 = c10;
                    while (true) {
                        int i46 = iZza2 == 0 ? 4 : 8;
                        if (i45 >= i46) {
                            arrayList = arrayList3;
                            zzerVar2.zzk(i46);
                            jZzt2 = -9223372036854775807L;
                            break;
                        }
                        arrayList = arrayList3;
                        if (zzerVar2.zzi()[iZzg6 + i45] != -1) {
                            long jZzz3 = iZza2 == 0 ? zzerVar2.zzz() : zzerVar2.zzJ();
                            if (jZzz3 != 0) {
                                jZzt2 = zzfj.zzt(jZzz3, 1000000L, jZzz2, RoundingMode.DOWN);
                                break;
                            }
                            jZzt2 = -9223372036854775807L;
                            break;
                        }
                        i45++;
                        arrayList3 = arrayList;
                        iZzt3 = iZzt3;
                        zzfuVar3 = zzfuVar3;
                    }
                    int iZzt4 = zzerVar2.zzt();
                    int i47 = i41;
                    int i48 = 3;
                    char[] cArr = new char[3];
                    cArr[c10] = (char) (((iZzt4 >> 10) & 31) + 96);
                    cArr[1] = (char) (((iZzt4 >> 5) & 31) + 96);
                    cArr[2] = (char) ((iZzt4 & 31) + 96);
                    int i49 = c10;
                    while (true) {
                        if (i49 >= i48) {
                            str2 = new String(cArr);
                            break;
                        }
                        char c11 = cArr[i49];
                        if (c11 < 'a' || c11 > 'z') {
                            str2 = null;
                            break;
                        }
                        i49++;
                        i48 = 3;
                    }
                    zzfv zzfvVarZzc5 = zzfuVarZzd3.zzc(1937011556);
                    if (zzfvVarZzc5 == null) {
                        zzee.zzc(str13, "Ignoring track where sample table (stbl) box is missing a sample description (stsd).");
                        str3 = str13;
                        arrayList2 = arrayList;
                        i4 = i44;
                        i5 = i47;
                        zzfuVar2 = zzfuVar3;
                        zzakvVar = null;
                        i6 = 8;
                        i7 = 4;
                    } else {
                        int i50 = i2;
                        String strZzc = zzajt.zzc(jZzz2, jZzt2, str2);
                        zzer zzerVar3 = zzfvVarZzc5.zza;
                        zzerVar3.zzh(12);
                        int iZzB10 = zzerVar3.zzB();
                        zzajw zzajwVar3 = new zzajw(iZzB10);
                        int i51 = c10;
                        while (i51 < iZzB10) {
                            long j6 = jZzt2;
                            int iZzg7 = zzerVar3.zzg();
                            String str14 = str13;
                            int iZzB11 = zzerVar3.zzB();
                            int i52 = iZzg7;
                            String str15 = "childAtomSize must be positive";
                            zzaes.zza(iZzB11 > 0 ? 1 : c10, "childAtomSize must be positive");
                            int iZzB12 = zzerVar3.zzB();
                            int i53 = iZzB11;
                            int i54 = i50;
                            if (iZzB12 == 1635148593 || iZzB12 == 1635148595 || iZzB12 == 1701733238 || iZzB12 == 1831958048 || iZzB12 == 1836070006 || iZzB12 == 1752589105 || iZzB12 == 1751479857 || iZzB12 == 1932670515 || iZzB12 == 1211250227 || iZzB12 == 1748121139 || iZzB12 == 1987063864 || iZzB12 == 1987063865 || iZzB12 == 1635135537 || iZzB12 == 1685479798 || iZzB12 == 1685479729 || iZzB12 == 1685481573 || iZzB12 == 1685481521) {
                                z5 = true;
                                i8 = 12;
                                i9 = 16;
                                zzerVar3.zzh(i52 + 16);
                                zzerVar3.zzk(i9);
                                iZzt = zzerVar3.zzt();
                                iZzt2 = zzerVar3.zzt();
                                zzerVar3.zzk(50);
                                iZzg = zzerVar3.zzg();
                                i51 = i51;
                                iIntValue = 1701733238;
                                if (iZzB12 == 1701733238) {
                                    pairZzr = zzr(zzerVar3, i52, i53);
                                    if (pairZzr != null) {
                                        iIntValue = ((Integer) pairZzr.first).intValue();
                                        if (zzqVar == 0) {
                                            zzqVarZzb = null;
                                        } else {
                                            zzqVarZzb = zzqVar.zzb(((zzakw) pairZzr.second).zzb);
                                        }
                                        zzajwVar3.zza[i51] = (zzakw) pairZzr.second;
                                    } else {
                                        i52 = i52;
                                        zzqVarZzb = zzqVar;
                                    }
                                    int i55 = iIntValue;
                                    zzerVar3.zzh(iZzg);
                                    iZzB12 = i55;
                                    zzqVar2 = zzqVarZzb;
                                } else {
                                    i52 = i52;
                                    zzqVar2 = zzqVar;
                                }
                                if (iZzB12 == 1831958048) {
                                    i10 = iZzB12;
                                    str4 = "video/mpeg";
                                } else {
                                    i10 = 1211250227;
                                    if (iZzB12 == 1211250227) {
                                        str4 = "video/3gpp";
                                    } else {
                                        i10 = iZzB12;
                                        str4 = null;
                                    }
                                }
                                zzqVar3 = zzqVar2;
                                i11 = iZzB5;
                                str5 = strZzc;
                                c6 = c3;
                                str6 = str14;
                                sZzv = sZzv;
                                str7 = str4;
                                fZzH = 1.0f;
                                i12 = -1;
                                i13 = -1;
                                i14 = -1;
                                zzgjVar = null;
                                listZzj = null;
                                i15 = 8;
                                i16 = 8;
                                z6 = false;
                                i17 = -1;
                                i18 = -1;
                                i19 = -1;
                                byteBufferZzm = null;
                                zzajpVarZzq = null;
                                bArrCopyOfRange = null;
                                zzajrVar = null;
                                i20 = -1;
                                str8 = null;
                                i21 = iZzg;
                                iZzc = -1;
                                while (i21 - i52 < i53) {
                                    zzerVar3.zzh(i21);
                                    iZzg2 = zzerVar3.zzg();
                                    iZzB = zzerVar3.zzB();
                                    if (iZzB == 0) {
                                        i26 = iZzB;
                                    } else {
                                        if (zzerVar3.zzg() - i52 == i53) {
                                            break;
                                        }
                                        i26 = 0;
                                    }
                                    if (i26 > 0) {
                                        z7 = z5;
                                    } else {
                                        z7 = false;
                                    }
                                    zzaes.zza(z7, str15);
                                    iZzB2 = zzerVar3.zzB();
                                    if (iZzB2 == 1635148611) {
                                        int i56 = iZzg2 + 8;
                                        if (str7 == null) {
                                            z24 = z5;
                                        } else {
                                            z24 = false;
                                        }
                                        zzaes.zza(z24, null);
                                        zzerVar3.zzh(i56);
                                        zzadtVarZza = zzadt.zza(zzerVar3);
                                        List list2 = zzadtVarZza.zza;
                                        zzajwVar3.zzc = zzadtVarZza.zzb;
                                        if (z6) {
                                            z25 = z5;
                                        } else {
                                            fZzH = zzadtVarZza.zzk;
                                            z25 = false;
                                        }
                                        String str16 = zzadtVarZza.zzl;
                                        int i57 = zzadtVarZza.zzj;
                                        int i58 = zzadtVarZza.zzg;
                                        int i59 = zzadtVarZza.zzh;
                                        int i60 = zzadtVarZza.zzi;
                                        int i61 = zzadtVarZza.zze;
                                        z6 = z25;
                                        str7 = "video/avc";
                                        i27 = zzadtVarZza.zzf;
                                        str9 = str15;
                                        str8 = str16;
                                        i18 = i57;
                                        zzajwVar2 = zzajwVar3;
                                        i10 = i10;
                                        i14 = i58;
                                        i13 = i59;
                                        iZzc = i60;
                                        i15 = i61;
                                        str6 = str6;
                                        listZzj = list2;
                                    } else if (iZzB2 == 1752589123) {
                                        int i62 = iZzg2 + 8;
                                        if (str7 == null) {
                                            z22 = z5;
                                        } else {
                                            z22 = false;
                                        }
                                        zzaes.zza(z22, null);
                                        zzerVar3.zzh(i62);
                                        zzafhVarZza = zzafh.zza(zzerVar3);
                                        List list3 = zzafhVarZza.zza;
                                        zzajwVar3.zzc = zzafhVarZza.zzb;
                                        if (z6) {
                                            z23 = z5;
                                        } else {
                                            fZzH = zzafhVarZza.zzl;
                                            z23 = false;
                                        }
                                        int i63 = zzafhVarZza.zzm;
                                        int i64 = zzafhVarZza.zzc;
                                        String str17 = zzafhVarZza.zzn;
                                        i35 = zzafhVarZza.zzk;
                                        if (i35 == -1) {
                                            i35 = i12;
                                        }
                                        int i65 = zzafhVarZza.zzd;
                                        int i66 = zzafhVarZza.zze;
                                        int i67 = zzafhVarZza.zzh;
                                        int i68 = zzafhVarZza.zzi;
                                        int i69 = zzafhVarZza.zzj;
                                        int i70 = zzafhVarZza.zzf;
                                        i17 = i64;
                                        iZzc = i69;
                                        i27 = zzafhVarZza.zzg;
                                        str9 = str15;
                                        str8 = str17;
                                        zzajwVar2 = zzajwVar3;
                                        i10 = i10;
                                        i12 = i35;
                                        i13 = i68;
                                        i20 = i65;
                                        str6 = str6;
                                        zzgjVar = zzafhVarZza.zzo;
                                        listZzj = list3;
                                        z6 = z23;
                                        str7 = "video/hevc";
                                        i19 = i66;
                                        i15 = i70;
                                        i18 = i63;
                                        i14 = i67;
                                    } else if (iZzB2 == 1818785347) {
                                        int i71 = iZzg2 + 8;
                                        zzaes.zza("video/hevc".equals(str7), "lhvC must follow hvcC atom");
                                        if (zzgjVar != null) {
                                            z15 = false;
                                            zzgjVar = null;
                                        } else if (zzgjVar.zza.size() >= 2) {
                                            z15 = z5;
                                        } else {
                                            z15 = false;
                                        }
                                        zzaes.zza(z15, "must have at least two layers");
                                        zzerVar3.zzh(i71);
                                        zzgjVar.getClass();
                                        zzafhVarZzb = zzafh.zzb(zzerVar3, zzgjVar);
                                        if (zzajwVar3.zzc == zzafhVarZzb.zzb) {
                                            z16 = z5;
                                        } else {
                                            z16 = false;
                                        }
                                        zzaes.zza(z16, "nalUnitLengthFieldLength must be same for both hvcC and lhvC atoms");
                                        i32 = zzafhVarZzb.zzh;
                                        if (i32 != -1) {
                                            if (i14 == i32) {
                                                z21 = z5;
                                            } else {
                                                z21 = false;
                                            }
                                            zzaes.zza(z21, "colorSpace must be the same for both views");
                                        }
                                        i33 = zzafhVarZzb.zzi;
                                        if (i33 != -1) {
                                            if (i13 == i33) {
                                                z20 = z5;
                                            } else {
                                                z20 = false;
                                            }
                                            zzaes.zza(z20, "colorRange must be the same for both views");
                                        }
                                        i34 = zzafhVarZzb.zzj;
                                        if (i34 != -1) {
                                            if (iZzc == i34) {
                                                z19 = z5;
                                            } else {
                                                z19 = false;
                                            }
                                            zzaes.zza(z19, "colorTransfer must be the same for both views");
                                        }
                                        if (i15 == zzafhVarZzb.zzf) {
                                            z17 = z5;
                                        } else {
                                            z17 = false;
                                        }
                                        zzaes.zza(z17, "bitdepthLuma must be the same for both views");
                                        if (i16 == zzafhVarZzb.zzg) {
                                            z18 = z5;
                                        } else {
                                            z18 = false;
                                        }
                                        zzaes.zza(z18, "bitdepthChroma must be the same for both views");
                                        if (listZzj != null) {
                                            int i72 = zzgtd.zzd;
                                            zzgta zzgtaVar = new zzgta();
                                            zzgtaVar.zzh(listZzj);
                                            zzgtaVar.zzh(zzafhVarZzb.zza);
                                            zzgtdVarZzi2 = zzgtaVar.zzi();
                                        } else {
                                            zzaes.zza(false, "initializationData must be already set from hvcC atom");
                                            zzgtdVarZzi2 = null;
                                        }
                                        listZzj = zzgtdVarZzi2;
                                        str7 = "video/mv-hevc";
                                        i13 = i13;
                                        str9 = str15;
                                        str8 = zzafhVarZzb.zzn;
                                        zzajwVar2 = zzajwVar3;
                                        i10 = i10;
                                        i27 = i16;
                                        str6 = str6;
                                    } else if (iZzB2 == 1986361461) {
                                        zzerVar3.zzh(iZzg2 + 8);
                                        iZzg3 = zzerVar3.zzg();
                                        zzajwVar2 = zzajwVar3;
                                        zzajsVar = null;
                                        while (iZzg3 - iZzg2 < i26) {
                                            zzerVar3.zzh(iZzg3);
                                            iZzB3 = zzerVar3.zzB();
                                            if (iZzB3 > 0) {
                                                z9 = z5;
                                            } else {
                                                z9 = false;
                                            }
                                            zzaes.zza(z9, str15);
                                            int i73 = i16;
                                            if (zzerVar3.zzB() == 1702454643) {
                                                zzerVar3.zzh(iZzg3 + 8);
                                                iZzg4 = zzerVar3.zzg();
                                                while (true) {
                                                    if (iZzg4 - iZzg3 < iZzB3) {
                                                        str10 = str15;
                                                        zzajsVar = null;
                                                        break;
                                                    }
                                                    zzerVar3.zzh(iZzg4);
                                                    iZzB4 = zzerVar3.zzB();
                                                    if (iZzB4 > 0) {
                                                        z10 = z5;
                                                    } else {
                                                        z10 = false;
                                                    }
                                                    zzaes.zza(z10, str15);
                                                    str10 = str15;
                                                    if (zzerVar3.zzB() == 1937011305) {
                                                        zzerVar3.zzk(4);
                                                        iZzs = zzerVar3.zzs();
                                                        i31 = iZzs & 1;
                                                        if ((iZzs & 2) == 2) {
                                                            z11 = z5;
                                                        } else {
                                                            z11 = false;
                                                        }
                                                        if ((iZzs & 8) == 8) {
                                                            z13 = z5;
                                                            z12 = z13;
                                                        } else {
                                                            z12 = z5;
                                                            z13 = false;
                                                        }
                                                        if (z12 != i31) {
                                                            z14 = false;
                                                        } else {
                                                            z14 = true;
                                                        }
                                                        zzajsVar = new zzajs(new zzajv(z14, z11, z13));
                                                        break;
                                                    }
                                                    iZzg4 += iZzB4;
                                                    str15 = str10;
                                                    z5 = true;
                                                }
                                            } else {
                                                str10 = str15;
                                            }
                                            iZzg3 += iZzB3;
                                            i16 = i73;
                                            str15 = str10;
                                            z5 = true;
                                        }
                                        str9 = str15;
                                        i27 = i16;
                                        if (zzajsVar == null) {
                                            zzajzVar = null;
                                        } else {
                                            zzajzVar = new zzajz(zzajsVar);
                                        }
                                        if (zzajzVar != null) {
                                            if (zzgjVar != null) {
                                                zzgjVar = null;
                                            } else if (zzgjVar.zza.size() >= 2) {
                                                zzaes.zza(zzajzVar.zza(), "both eye views must be marked as available");
                                                zzaes.zza(!zzajzVar.zzb().zza().zzc(), "for MV-HEVC, eye_views_reversed must be set to false");
                                            }
                                            if (i12 == -1) {
                                                i13 = i13;
                                                i10 = i10;
                                                if (true != zzajzVar.zzb().zza().zzc()) {
                                                    i12 = 4;
                                                } else {
                                                    i12 = 5;
                                                }
                                                str6 = str6;
                                            } else {
                                                i13 = i13;
                                                i10 = i10;
                                                str6 = str6;
                                            }
                                        }
                                        i28 = i12;
                                        i13 = i13;
                                        zzgjVar2 = zzgjVar;
                                        i10 = i10;
                                        i29 = i15;
                                        zzgjVar = zzgjVar2;
                                        i15 = i29;
                                        i12 = i28;
                                    } else {
                                        str9 = str15;
                                        zzajwVar2 = zzajwVar3;
                                        i27 = i16;
                                        if (iZzB2 != 1685480259 || iZzB2 == 1685485123 || iZzB2 == 1685485379) {
                                            i28 = i12;
                                            i13 = i13;
                                            zzgj zzgjVar3 = zzgjVar;
                                            i10 = i10;
                                            int i74 = i15;
                                            int i75 = i26 - 8;
                                            int i76 = iZzg2 + 8;
                                            bArr = new byte[i75];
                                            zzerVar3.zzm(bArr, 0, i75);
                                            if (listZzj != null) {
                                                int i77 = zzgtd.zzd;
                                                zzgta zzgtaVar2 = new zzgta();
                                                zzgtaVar2.zzh(listZzj);
                                                zzgtaVar2.zzf(bArr);
                                                zzgtdVarZzi = zzgtaVar2.zzi();
                                            } else {
                                                zzaes.zza(false, "initializationData must already be set from hvcC or avcC atom");
                                                zzgtdVarZzi = null;
                                            }
                                            zzerVar3.zzh(i76);
                                            zzfrVarZza = zzfr.zza(zzerVar3);
                                            if (zzfrVarZza != null) {
                                                str7 = "video/dolby-vision";
                                                str8 = zzfrVarZza.zza;
                                            }
                                            listZzj = zzgtdVarZzi;
                                            zzgjVar = zzgjVar3;
                                            i15 = i74;
                                        } else if (iZzB2 == 1987076931) {
                                            int i78 = iZzg2 + 12;
                                            zzaes.zza(str7 == null, null);
                                            zzerVar3.zzh(i78);
                                            byte bZzs = (byte) zzerVar3.zzs();
                                            byte bZzs2 = (byte) zzerVar3.zzs();
                                            int iZzs2 = zzerVar3.zzs();
                                            int i79 = iZzs2 >> 4;
                                            int i80 = iZzs2 >> 1;
                                            String str18 = i10 == 1987063864 ? "video/x-vnd.on2.vp8" : "video/x-vnd.on2.vp9";
                                            if (str18.equals("video/x-vnd.on2.vp9")) {
                                                int i81 = zzdo.zza;
                                                byte[] bArr2 = new byte[i8];
                                                i30 = 1;
                                                bArr2[0] = 1;
                                                bArr2[1] = 1;
                                                bArr2[2] = bZzs;
                                                bArr2[3] = 2;
                                                bArr2[4] = 1;
                                                bArr2[5] = bZzs2;
                                                bArr2[6] = 3;
                                                bArr2[7] = 1;
                                                bArr2[8] = (byte) i79;
                                                bArr2[9] = 4;
                                                bArr2[i44] = 1;
                                                bArr2[11] = (byte) (i80 & 7);
                                                listZzj = zzgtd.zzj(bArr2);
                                            } else {
                                                i30 = 1;
                                            }
                                            int i82 = iZzs2 & 1;
                                            int iZzs3 = zzerVar3.zzs();
                                            int iZzs4 = zzerVar3.zzs();
                                            int iZzb = zzi.zzb(iZzs3);
                                            i13 = i30 != i82 ? 2 : 1;
                                            i14 = iZzb;
                                            i15 = i79;
                                            i27 = i15;
                                            str7 = str18;
                                            i10 = i10;
                                            str6 = str6;
                                            i8 = 12;
                                            iZzc = zzi.zzc(iZzs4);
                                        } else if (iZzB2 == 1635135811) {
                                            int i83 = i26 - 8;
                                            byte[] bArr3 = new byte[i83];
                                            zzerVar3.zzm(bArr3, 0, i83);
                                            zzgtd zzgtdVarZzj2 = zzgtd.zzj(bArr3);
                                            zzerVar3.zzh(iZzg2 + 8);
                                            zzi zziVarZzk = zzk(zzerVar3);
                                            int i84 = zziVarZzk.zzf;
                                            int i85 = zziVarZzk.zzg;
                                            i14 = zziVarZzk.zzb;
                                            int i86 = zziVarZzk.zzc;
                                            int i87 = zziVarZzk.zzd;
                                            i15 = i84;
                                            i27 = i85;
                                            i13 = i86;
                                            i10 = i10;
                                            str7 = MimeTypes.VIDEO_AV1;
                                            i8 = 12;
                                            listZzj = zzgtdVarZzj2;
                                            iZzc = i87;
                                            str6 = str6;
                                        } else {
                                            if (iZzB2 == 1668050025) {
                                                if (byteBufferZzm == null) {
                                                    byteBufferZzm = zzm();
                                                }
                                                ByteBuffer byteBuffer = byteBufferZzm;
                                                byteBuffer.position(21);
                                                byteBuffer.putShort(zzerVar3.zzv());
                                                byteBuffer.putShort(zzerVar3.zzv());
                                                byteBufferZzm = byteBuffer;
                                            } else if (iZzB2 == 1835295606) {
                                                if (byteBufferZzm == null) {
                                                    byteBufferZzm = zzm();
                                                }
                                                ByteBuffer byteBuffer2 = byteBufferZzm;
                                                short sZzv3 = zzerVar3.zzv();
                                                short sZzv4 = zzerVar3.zzv();
                                                short sZzv5 = zzerVar3.zzv();
                                                short sZzv6 = zzerVar3.zzv();
                                                zzgj zzgjVar4 = zzgjVar;
                                                short sZzv7 = zzerVar3.zzv();
                                                short sZzv8 = zzerVar3.zzv();
                                                int i88 = i15;
                                                short sZzv9 = zzerVar3.zzv();
                                                short sZzv10 = zzerVar3.zzv();
                                                long jZzz4 = zzerVar3.zzz();
                                                long jZzz5 = zzerVar3.zzz();
                                                byteBuffer2.position(1);
                                                byteBuffer2.putShort(sZzv7);
                                                byteBuffer2.putShort(sZzv8);
                                                byteBuffer2.putShort(sZzv3);
                                                byteBuffer2.putShort(sZzv4);
                                                byteBuffer2.putShort(sZzv5);
                                                byteBuffer2.putShort(sZzv6);
                                                byteBuffer2.putShort(sZzv9);
                                                byteBuffer2.putShort(sZzv10);
                                                byteBuffer2.putShort((short) (jZzz4 / 10000));
                                                byteBuffer2.putShort((short) (jZzz5 / 10000));
                                                byteBufferZzm = byteBuffer2;
                                                zzgjVar = zzgjVar4;
                                                i15 = i88;
                                                i12 = i12;
                                            } else {
                                                i28 = i12;
                                                i13 = i13;
                                                zzgjVar2 = zzgjVar;
                                                i10 = i10;
                                                i29 = i15;
                                                if (iZzB2 == 1681012275) {
                                                    zzaes.zza(str7 == null, null);
                                                    str7 = "video/3gpp";
                                                } else if (iZzB2 == 1702061171) {
                                                    zzaes.zza(str7 == null, null);
                                                    zzajr zzajrVarZzp = zzp(zzerVar3, iZzg2);
                                                    String strZza = zzajrVarZzp.zza();
                                                    byte[] bArrZzb = zzajrVarZzp.zzb();
                                                    if (bArrZzb != null) {
                                                        zzajrVar = zzajrVarZzp;
                                                        str7 = strZza;
                                                        listZzj = zzgtd.zzj(bArrZzb);
                                                    } else {
                                                        zzajrVar = zzajrVarZzp;
                                                        str7 = strZza;
                                                    }
                                                } else if (iZzB2 == 1651798644) {
                                                    zzajpVarZzq = zzq(zzerVar3, iZzg2);
                                                } else if (iZzB2 == 1885434736) {
                                                    zzerVar3.zzh(iZzg2 + 8);
                                                    fZzH = zzerVar3.zzH() / zzerVar3.zzH();
                                                    str6 = str6;
                                                    zzgjVar = zzgjVar2;
                                                    i15 = i29;
                                                    i12 = i28;
                                                    i8 = 12;
                                                    z6 = true;
                                                } else if (iZzB2 == 1937126244) {
                                                    int i89 = iZzg2 + 8;
                                                    while (true) {
                                                        if (i89 - iZzg2 >= i26) {
                                                            bArrCopyOfRange = null;
                                                            break;
                                                        }
                                                        zzerVar3.zzh(i89);
                                                        int iZzB13 = zzerVar3.zzB() + i89;
                                                        if (zzerVar3.zzB() == 1886547818) {
                                                            bArrCopyOfRange = Arrays.copyOfRange(zzerVar3.zzi(), i89, iZzB13);
                                                            break;
                                                        }
                                                        i89 = iZzB13;
                                                    }
                                                } else {
                                                    if (iZzB2 == 1936995172) {
                                                        int iZzs5 = zzerVar3.zzs();
                                                        zzerVar3.zzk(3);
                                                        if (iZzs5 == 0) {
                                                            int iZzs6 = zzerVar3.zzs();
                                                            if (iZzs6 == 0) {
                                                                str6 = str6;
                                                                zzgjVar = zzgjVar2;
                                                                i15 = i29;
                                                                i12 = 0;
                                                            } else if (iZzs6 == 1) {
                                                                str6 = str6;
                                                                zzgjVar = zzgjVar2;
                                                                i15 = i29;
                                                                i12 = 1;
                                                            } else if (iZzs6 == 2) {
                                                                str6 = str6;
                                                                zzgjVar = zzgjVar2;
                                                                i15 = i29;
                                                                i12 = 2;
                                                            } else if (iZzs6 == 3) {
                                                                i12 = 3;
                                                                str6 = str6;
                                                                zzgjVar = zzgjVar2;
                                                                i15 = i29;
                                                            }
                                                            i8 = 12;
                                                        }
                                                        str6 = str6;
                                                        i8 = 12;
                                                    } else if (iZzB2 == 1634760259) {
                                                        i8 = 12;
                                                        int i90 = i26 - 12;
                                                        byte[] bArr4 = new byte[i90];
                                                        zzerVar3.zzh(iZzg2 + 12);
                                                        zzerVar3.zzm(bArr4, 0, i90);
                                                        String strZzc2 = zzdo.zzc(bArr4);
                                                        zzgtd zzgtdVarZzj3 = zzgtd.zzj(bArr4);
                                                        zzi zziVarZzl = zzl(new zzer(bArr4));
                                                        str8 = strZzc2;
                                                        listZzj = zzgtdVarZzj3;
                                                        i15 = zziVarZzl.zzf;
                                                        i27 = zziVarZzl.zzg;
                                                        i14 = zziVarZzl.zzb;
                                                        i13 = zziVarZzl.zzc;
                                                        str7 = "video/apv";
                                                        zzgjVar = zzgjVar2;
                                                        i12 = i28;
                                                        iZzc = zziVarZzl.zzd;
                                                        str6 = str6;
                                                    } else {
                                                        i8 = 12;
                                                        if (iZzB2 == 1668246642) {
                                                            if (i14 != -1) {
                                                                str6 = str6;
                                                            } else if (iZzc == -1) {
                                                                int iZzB14 = zzerVar3.zzB();
                                                                if (iZzB14 == 1852009592 || iZzB14 == 1852009571) {
                                                                    int iZzt5 = zzerVar3.zzt();
                                                                    int iZzt6 = zzerVar3.zzt();
                                                                    zzerVar3.zzk(2);
                                                                    if (i26 != 19) {
                                                                        z8 = false;
                                                                    } else if ((zzerVar3.zzs() & 128) != 0) {
                                                                        i26 = 19;
                                                                        z8 = true;
                                                                    } else {
                                                                        i26 = 19;
                                                                        z8 = false;
                                                                    }
                                                                    int iZzb2 = zzi.zzb(iZzt5);
                                                                    int i91 = true != z8 ? 2 : 1;
                                                                    iZzc = zzi.zzc(iZzt6);
                                                                    i13 = i91;
                                                                    zzgjVar = zzgjVar2;
                                                                    i15 = i29;
                                                                    i14 = iZzb2;
                                                                } else {
                                                                    str6 = str6;
                                                                    zzee.zzc(str6, "Unsupported color type: ".concat(zzfw.zze(iZzB14)));
                                                                    i14 = -1;
                                                                    iZzc = -1;
                                                                    zzgjVar = zzgjVar2;
                                                                    i15 = i29;
                                                                    i12 = i28;
                                                                }
                                                            } else {
                                                                str6 = str6;
                                                                i14 = -1;
                                                            }
                                                        }
                                                    }
                                                    zzgjVar = zzgjVar2;
                                                    i15 = i29;
                                                    i12 = i28;
                                                }
                                                str6 = str6;
                                                zzgjVar = zzgjVar2;
                                                i15 = i29;
                                                i12 = i28;
                                                i8 = 12;
                                            }
                                            i8 = 12;
                                        }
                                        i12 = i28;
                                    }
                                    i21 += i26;
                                    str6 = str6;
                                    i53 = i53;
                                    zzajwVar3 = zzajwVar2;
                                    i16 = i27;
                                    str15 = str9;
                                    i10 = i10;
                                    i13 = i13;
                                    z5 = true;
                                }
                                i22 = i12;
                                i23 = i13;
                                i53 = i53;
                                zzajwVar = zzajwVar3;
                                i24 = i15;
                                i25 = i16;
                                str14 = str6;
                                if (str7 == null) {
                                    strZzc = str5;
                                    c3 = c6;
                                    iZzB5 = i11;
                                    zzajwVar3 = zzajwVar;
                                } else {
                                    zztVar = new zzt();
                                    iZzB5 = i11;
                                    zztVar.zzb(iZzB5);
                                    zztVar.zzm(str7);
                                    zztVar.zzj(str8);
                                    zztVar.zzt(iZzt);
                                    zztVar.zzu(iZzt2);
                                    zztVar.zzv(i20);
                                    zztVar.zzw(i19);
                                    zztVar.zzz(fZzH);
                                    c3 = c6;
                                    zztVar.zzy(c3);
                                    zztVar.zzA(bArrCopyOfRange);
                                    zztVar.zzB(i22);
                                    zztVar.zzp(listZzj);
                                    zztVar.zzo(i18);
                                    zztVar.zzD(i17);
                                    zztVar.zzq(zzqVar3);
                                    strZzc = str5;
                                    zztVar.zze(strZzc);
                                    zzh zzhVar = new zzh();
                                    zzhVar.zza(i14);
                                    zzhVar.zzb(i23);
                                    zzhVar.zzc(iZzc);
                                    if (byteBufferZzm != null) {
                                        bArrArray = byteBufferZzm.array();
                                    } else {
                                        bArrArray = null;
                                    }
                                    zzhVar.zzd(bArrArray);
                                    zzhVar.zze(i24);
                                    zzhVar.zzf(i25);
                                    zztVar.zzC(zzhVar.zzg());
                                    if (zzajpVarZzq != null) {
                                        zztVar.zzh(zzgwx.zzb(zzajpVarZzq.zza()));
                                        zztVar.zzi(zzgwx.zzb(zzajpVarZzq.zzb()));
                                    } else if (zzajrVar != null) {
                                        zztVar.zzh(zzgwx.zzb(zzajrVar.zzc()));
                                        zztVar.zzi(zzgwx.zzb(zzajrVar.zzd()));
                                    }
                                    zzajwVar3 = zzajwVar;
                                    zzajwVar3.zzb = zztVar.zzM();
                                }
                            } else if (iZzB12 == 1634760241) {
                                str2 = str2;
                                sZzv2 = sZzv2;
                                zzerVar3 = zzerVar3;
                                iZzB10 = iZzB10;
                                zzajwVar3 = zzajwVar3;
                                jZzz2 = jZzz2;
                                iZzB5 = iZzB5;
                                arrayList = arrayList;
                                i44 = i44;
                                i47 = i47;
                                str14 = str14;
                                j6 = j6;
                                i53 = i53;
                                i9 = 16;
                                z5 = true;
                                i8 = 12;
                                iZzB12 = iZzB12;
                                i51 = i51;
                                i52 = i52;
                                zzerVar3.zzh(i52 + 16);
                                zzerVar3.zzk(i9);
                                iZzt = zzerVar3.zzt();
                                iZzt2 = zzerVar3.zzt();
                                zzerVar3.zzk(50);
                                iZzg = zzerVar3.zzg();
                                i51 = i51;
                                iIntValue = 1701733238;
                                if (iZzB12 == 1701733238) {
                                    pairZzr = zzr(zzerVar3, i52, i53);
                                    if (pairZzr != null) {
                                        iIntValue = ((Integer) pairZzr.first).intValue();
                                        if (zzqVar == 0) {
                                            zzqVarZzb = null;
                                        } else {
                                            zzqVarZzb = zzqVar.zzb(((zzakw) pairZzr.second).zzb);
                                        }
                                        zzajwVar3.zza[i51] = (zzakw) pairZzr.second;
                                    } else {
                                        i52 = i52;
                                        zzqVarZzb = zzqVar;
                                    }
                                    int i510 = iIntValue;
                                    zzerVar3.zzh(iZzg);
                                    iZzB12 = i510;
                                    zzqVar2 = zzqVarZzb;
                                } else {
                                    i52 = i52;
                                    zzqVar2 = zzqVar;
                                }
                                if (iZzB12 == 1831958048) {
                                    i10 = iZzB12;
                                    str4 = "video/mpeg";
                                } else {
                                    i10 = 1211250227;
                                    if (iZzB12 == 1211250227) {
                                        str4 = "video/3gpp";
                                    } else {
                                        i10 = iZzB12;
                                        str4 = null;
                                    }
                                }
                                zzqVar3 = zzqVar2;
                                i11 = iZzB5;
                                str5 = strZzc;
                                c6 = c3;
                                str6 = str14;
                                sZzv = sZzv;
                                str7 = str4;
                                fZzH = 1.0f;
                                i12 = -1;
                                i13 = -1;
                                i14 = -1;
                                zzgjVar = null;
                                listZzj = null;
                                i15 = 8;
                                i16 = 8;
                                z6 = false;
                                i17 = -1;
                                i18 = -1;
                                i19 = -1;
                                byteBufferZzm = null;
                                zzajpVarZzq = null;
                                bArrCopyOfRange = null;
                                zzajrVar = null;
                                i20 = -1;
                                str8 = null;
                                i21 = iZzg;
                                iZzc = -1;
                                while (i21 - i52 < i53) {
                                    zzerVar3.zzh(i21);
                                    iZzg2 = zzerVar3.zzg();
                                    iZzB = zzerVar3.zzB();
                                    if (iZzB == 0) {
                                        i26 = iZzB;
                                    } else {
                                        if (zzerVar3.zzg() - i52 == i53) {
                                            break;
                                            break;
                                        }
                                        i26 = 0;
                                    }
                                    if (i26 > 0) {
                                        z7 = z5;
                                    } else {
                                        z7 = false;
                                    }
                                    zzaes.zza(z7, str15);
                                    iZzB2 = zzerVar3.zzB();
                                    if (iZzB2 == 1635148611) {
                                        int i511 = iZzg2 + 8;
                                        if (str7 == null) {
                                            z24 = z5;
                                        } else {
                                            z24 = false;
                                        }
                                        zzaes.zza(z24, null);
                                        zzerVar3.zzh(i511);
                                        zzadtVarZza = zzadt.zza(zzerVar3);
                                        List list4 = zzadtVarZza.zza;
                                        zzajwVar3.zzc = zzadtVarZza.zzb;
                                        if (z6) {
                                            fZzH = zzadtVarZza.zzk;
                                            z25 = false;
                                        } else {
                                            z25 = z5;
                                        }
                                        String str19 = zzadtVarZza.zzl;
                                        int i512 = zzadtVarZza.zzj;
                                        int i513 = zzadtVarZza.zzg;
                                        int i514 = zzadtVarZza.zzh;
                                        int i610 = zzadtVarZza.zzi;
                                        int i611 = zzadtVarZza.zze;
                                        z6 = z25;
                                        str7 = "video/avc";
                                        i27 = zzadtVarZza.zzf;
                                        str9 = str15;
                                        str8 = str19;
                                        i18 = i512;
                                        zzajwVar2 = zzajwVar3;
                                        i10 = i10;
                                        i14 = i513;
                                        i13 = i514;
                                        iZzc = i610;
                                        i15 = i611;
                                        str6 = str6;
                                        listZzj = list4;
                                    } else if (iZzB2 == 1752589123) {
                                        int i612 = iZzg2 + 8;
                                        if (str7 == null) {
                                            z22 = z5;
                                        } else {
                                            z22 = false;
                                        }
                                        zzaes.zza(z22, null);
                                        zzerVar3.zzh(i612);
                                        zzafhVarZza = zzafh.zza(zzerVar3);
                                        List list5 = zzafhVarZza.zza;
                                        zzajwVar3.zzc = zzafhVarZza.zzb;
                                        if (z6) {
                                            fZzH = zzafhVarZza.zzl;
                                            z23 = false;
                                        } else {
                                            z23 = z5;
                                        }
                                        int i613 = zzafhVarZza.zzm;
                                        int i614 = zzafhVarZza.zzc;
                                        String str110 = zzafhVarZza.zzn;
                                        i35 = zzafhVarZza.zzk;
                                        if (i35 == -1) {
                                            i35 = i12;
                                        }
                                        int i615 = zzafhVarZza.zzd;
                                        int i616 = zzafhVarZza.zze;
                                        int i617 = zzafhVarZza.zzh;
                                        int i618 = zzafhVarZza.zzi;
                                        int i619 = zzafhVarZza.zzj;
                                        int i710 = zzafhVarZza.zzf;
                                        i17 = i614;
                                        iZzc = i619;
                                        i27 = zzafhVarZza.zzg;
                                        str9 = str15;
                                        str8 = str110;
                                        zzajwVar2 = zzajwVar3;
                                        i10 = i10;
                                        i12 = i35;
                                        i13 = i618;
                                        i20 = i615;
                                        str6 = str6;
                                        zzgjVar = zzafhVarZza.zzo;
                                        listZzj = list5;
                                        z6 = z23;
                                        str7 = "video/hevc";
                                        i19 = i616;
                                        i15 = i710;
                                        i18 = i613;
                                        i14 = i617;
                                    } else if (iZzB2 == 1818785347) {
                                        int i711 = iZzg2 + 8;
                                        zzaes.zza("video/hevc".equals(str7), "lhvC must follow hvcC atom");
                                        if (zzgjVar != null) {
                                            z15 = false;
                                            zzgjVar = null;
                                        } else if (zzgjVar.zza.size() >= 2) {
                                            z15 = z5;
                                        } else {
                                            z15 = false;
                                        }
                                        zzaes.zza(z15, "must have at least two layers");
                                        zzerVar3.zzh(i711);
                                        zzgjVar.getClass();
                                        zzafhVarZzb = zzafh.zzb(zzerVar3, zzgjVar);
                                        if (zzajwVar3.zzc == zzafhVarZzb.zzb) {
                                            z16 = z5;
                                        } else {
                                            z16 = false;
                                        }
                                        zzaes.zza(z16, "nalUnitLengthFieldLength must be same for both hvcC and lhvC atoms");
                                        i32 = zzafhVarZzb.zzh;
                                        if (i32 != -1) {
                                            if (i14 == i32) {
                                                z21 = z5;
                                            } else {
                                                z21 = false;
                                            }
                                            zzaes.zza(z21, "colorSpace must be the same for both views");
                                        }
                                        i33 = zzafhVarZzb.zzi;
                                        if (i33 != -1) {
                                            if (i13 == i33) {
                                                z20 = z5;
                                            } else {
                                                z20 = false;
                                            }
                                            zzaes.zza(z20, "colorRange must be the same for both views");
                                        }
                                        i34 = zzafhVarZzb.zzj;
                                        if (i34 != -1) {
                                            if (iZzc == i34) {
                                                z19 = z5;
                                            } else {
                                                z19 = false;
                                            }
                                            zzaes.zza(z19, "colorTransfer must be the same for both views");
                                        }
                                        if (i15 == zzafhVarZzb.zzf) {
                                            z17 = z5;
                                        } else {
                                            z17 = false;
                                        }
                                        zzaes.zza(z17, "bitdepthLuma must be the same for both views");
                                        if (i16 == zzafhVarZzb.zzg) {
                                            z18 = z5;
                                        } else {
                                            z18 = false;
                                        }
                                        zzaes.zza(z18, "bitdepthChroma must be the same for both views");
                                        if (listZzj != null) {
                                            int i712 = zzgtd.zzd;
                                            zzgta zzgtaVar3 = new zzgta();
                                            zzgtaVar3.zzh(listZzj);
                                            zzgtaVar3.zzh(zzafhVarZzb.zza);
                                            zzgtdVarZzi2 = zzgtaVar3.zzi();
                                        } else {
                                            zzaes.zza(false, "initializationData must be already set from hvcC atom");
                                            zzgtdVarZzi2 = null;
                                        }
                                        listZzj = zzgtdVarZzi2;
                                        str7 = "video/mv-hevc";
                                        i13 = i13;
                                        str9 = str15;
                                        str8 = zzafhVarZzb.zzn;
                                        zzajwVar2 = zzajwVar3;
                                        i10 = i10;
                                        i27 = i16;
                                        str6 = str6;
                                    } else if (iZzB2 == 1986361461) {
                                        zzerVar3.zzh(iZzg2 + 8);
                                        iZzg3 = zzerVar3.zzg();
                                        zzajwVar2 = zzajwVar3;
                                        zzajsVar = null;
                                        while (iZzg3 - iZzg2 < i26) {
                                            zzerVar3.zzh(iZzg3);
                                            iZzB3 = zzerVar3.zzB();
                                            if (iZzB3 > 0) {
                                                z9 = z5;
                                            } else {
                                                z9 = false;
                                            }
                                            zzaes.zza(z9, str15);
                                            int i713 = i16;
                                            if (zzerVar3.zzB() == 1702454643) {
                                                zzerVar3.zzh(iZzg3 + 8);
                                                iZzg4 = zzerVar3.zzg();
                                                while (true) {
                                                    if (iZzg4 - iZzg3 < iZzB3) {
                                                        str10 = str15;
                                                        zzajsVar = null;
                                                        break;
                                                        break;
                                                    }
                                                    zzerVar3.zzh(iZzg4);
                                                    iZzB4 = zzerVar3.zzB();
                                                    if (iZzB4 > 0) {
                                                        z10 = z5;
                                                    } else {
                                                        z10 = false;
                                                    }
                                                    zzaes.zza(z10, str15);
                                                    str10 = str15;
                                                    if (zzerVar3.zzB() == 1937011305) {
                                                        zzerVar3.zzk(4);
                                                        iZzs = zzerVar3.zzs();
                                                        i31 = iZzs & 1;
                                                        if ((iZzs & 2) == 2) {
                                                            z11 = z5;
                                                        } else {
                                                            z11 = false;
                                                        }
                                                        if ((iZzs & 8) == 8) {
                                                            z13 = z5;
                                                            z12 = z13;
                                                        } else {
                                                            z12 = z5;
                                                            z13 = false;
                                                        }
                                                        if (z12 != i31) {
                                                            z14 = false;
                                                        } else {
                                                            z14 = true;
                                                        }
                                                        zzajsVar = new zzajs(new zzajv(z14, z11, z13));
                                                        break;
                                                        break;
                                                    }
                                                    iZzg4 += iZzB4;
                                                    str15 = str10;
                                                    z5 = true;
                                                }
                                            } else {
                                                str10 = str15;
                                            }
                                            iZzg3 += iZzB3;
                                            i16 = i713;
                                            str15 = str10;
                                            z5 = true;
                                        }
                                        str9 = str15;
                                        i27 = i16;
                                        if (zzajsVar == null) {
                                            zzajzVar = null;
                                        } else {
                                            zzajzVar = new zzajz(zzajsVar);
                                        }
                                        if (zzajzVar != null) {
                                            if (zzgjVar != null) {
                                                zzgjVar = null;
                                            } else if (zzgjVar.zza.size() >= 2) {
                                                zzaes.zza(zzajzVar.zza(), "both eye views must be marked as available");
                                                zzaes.zza(!zzajzVar.zzb().zza().zzc(), "for MV-HEVC, eye_views_reversed must be set to false");
                                            }
                                            if (i12 == -1) {
                                                i13 = i13;
                                                i10 = i10;
                                                if (true != zzajzVar.zzb().zza().zzc()) {
                                                    i12 = 4;
                                                } else {
                                                    i12 = 5;
                                                }
                                                str6 = str6;
                                            } else {
                                                i13 = i13;
                                                i10 = i10;
                                                str6 = str6;
                                            }
                                        }
                                        i28 = i12;
                                        i13 = i13;
                                        zzgjVar2 = zzgjVar;
                                        i10 = i10;
                                        i29 = i15;
                                        zzgjVar = zzgjVar2;
                                        i15 = i29;
                                        i12 = i28;
                                    } else {
                                        str9 = str15;
                                        zzajwVar2 = zzajwVar3;
                                        i27 = i16;
                                        if (iZzB2 != 1685480259) {
                                            i28 = i12;
                                            i13 = i13;
                                            zzgj zzgjVar5 = zzgjVar;
                                            i10 = i10;
                                            int i714 = i15;
                                            int i715 = i26 - 8;
                                            int i716 = iZzg2 + 8;
                                            bArr = new byte[i715];
                                            zzerVar3.zzm(bArr, 0, i715);
                                            if (listZzj != null) {
                                                int i717 = zzgtd.zzd;
                                                zzgta zzgtaVar4 = new zzgta();
                                                zzgtaVar4.zzh(listZzj);
                                                zzgtaVar4.zzf(bArr);
                                                zzgtdVarZzi = zzgtaVar4.zzi();
                                            } else {
                                                zzaes.zza(false, "initializationData must already be set from hvcC or avcC atom");
                                                zzgtdVarZzi = null;
                                            }
                                            zzerVar3.zzh(i716);
                                            zzfrVarZza = zzfr.zza(zzerVar3);
                                            if (zzfrVarZza != null) {
                                                str7 = "video/dolby-vision";
                                                str8 = zzfrVarZza.zza;
                                            }
                                            listZzj = zzgtdVarZzi;
                                            zzgjVar = zzgjVar5;
                                            i15 = i714;
                                            i12 = i28;
                                        } else {
                                            i28 = i12;
                                            i13 = i13;
                                            zzgj zzgjVar6 = zzgjVar;
                                            i10 = i10;
                                            int i718 = i15;
                                            int i719 = i26 - 8;
                                            int i7110 = iZzg2 + 8;
                                            bArr = new byte[i719];
                                            zzerVar3.zzm(bArr, 0, i719);
                                            if (listZzj != null) {
                                                int i7111 = zzgtd.zzd;
                                                zzgta zzgtaVar5 = new zzgta();
                                                zzgtaVar5.zzh(listZzj);
                                                zzgtaVar5.zzf(bArr);
                                                zzgtdVarZzi = zzgtaVar5.zzi();
                                            } else {
                                                zzaes.zza(false, "initializationData must already be set from hvcC or avcC atom");
                                                zzgtdVarZzi = null;
                                            }
                                            zzerVar3.zzh(i7110);
                                            zzfrVarZza = zzfr.zza(zzerVar3);
                                            if (zzfrVarZza != null) {
                                                str7 = "video/dolby-vision";
                                                str8 = zzfrVarZza.zza;
                                            }
                                            listZzj = zzgtdVarZzi;
                                            zzgjVar = zzgjVar6;
                                            i15 = i718;
                                            i12 = i28;
                                        }
                                    }
                                    i21 += i26;
                                    str6 = str6;
                                    i53 = i53;
                                    zzajwVar3 = zzajwVar2;
                                    i16 = i27;
                                    str15 = str9;
                                    i10 = i10;
                                    i13 = i13;
                                    z5 = true;
                                }
                                i22 = i12;
                                i23 = i13;
                                i53 = i53;
                                zzajwVar = zzajwVar3;
                                i24 = i15;
                                i25 = i16;
                                str14 = str6;
                                if (str7 == null) {
                                    strZzc = str5;
                                    c3 = c6;
                                    iZzB5 = i11;
                                    zzajwVar3 = zzajwVar;
                                } else {
                                    zztVar = new zzt();
                                    iZzB5 = i11;
                                    zztVar.zzb(iZzB5);
                                    zztVar.zzm(str7);
                                    zztVar.zzj(str8);
                                    zztVar.zzt(iZzt);
                                    zztVar.zzu(iZzt2);
                                    zztVar.zzv(i20);
                                    zztVar.zzw(i19);
                                    zztVar.zzz(fZzH);
                                    c3 = c6;
                                    zztVar.zzy(c3);
                                    zztVar.zzA(bArrCopyOfRange);
                                    zztVar.zzB(i22);
                                    zztVar.zzp(listZzj);
                                    zztVar.zzo(i18);
                                    zztVar.zzD(i17);
                                    zztVar.zzq(zzqVar3);
                                    strZzc = str5;
                                    zztVar.zze(strZzc);
                                    zzh zzhVar2 = new zzh();
                                    zzhVar2.zza(i14);
                                    zzhVar2.zzb(i23);
                                    zzhVar2.zzc(iZzc);
                                    if (byteBufferZzm != null) {
                                        bArrArray = byteBufferZzm.array();
                                    } else {
                                        bArrArray = null;
                                    }
                                    zzhVar2.zzd(bArrArray);
                                    zzhVar2.zze(i24);
                                    zzhVar2.zzf(i25);
                                    zztVar.zzC(zzhVar2.zzg());
                                    if (zzajpVarZzq != null) {
                                        zztVar.zzh(zzgwx.zzb(zzajpVarZzq.zza()));
                                        zztVar.zzi(zzgwx.zzb(zzajpVarZzq.zzb()));
                                    } else if (zzajrVar != null) {
                                        zztVar.zzh(zzgwx.zzb(zzajrVar.zzc()));
                                        zztVar.zzi(zzgwx.zzb(zzajrVar.zzd()));
                                    }
                                    zzajwVar3 = zzajwVar;
                                    zzajwVar3.zzb = zztVar.zzM();
                                }
                            } else if (iZzB12 == 1836069985 || iZzB12 == 1701733217 || iZzB12 == 1633889587 || iZzB12 == 1700998451 || iZzB12 == 1633889588 || iZzB12 == 1835823201 || iZzB12 == 1685353315 || iZzB12 == 1685353317 || iZzB12 == 1685353320 || iZzB12 == 1685353324 || iZzB12 == 1685353336 || iZzB12 == 1935764850 || iZzB12 == 1935767394 || iZzB12 == 1819304813 || iZzB12 == 1936684916 || iZzB12 == 1953984371 || iZzB12 == 778924082 || iZzB12 == 778924083 || iZzB12 == 1835557169 || iZzB12 == 1835560241 || iZzB12 == 1634492771 || iZzB12 == 1634492791 || iZzB12 == 1970037111 || iZzB12 == 1332770163 || iZzB12 == 1716281667 || iZzB12 == 1767992678 || iZzB12 == 1768973165 || iZzB12 == 1718641517) {
                                Object obj = null;
                                int i92 = i51;
                                zzo(zzerVar3, iZzB12, i52, i53, iZzB5, strZzc, z3, zzqVar, zzajwVar3, i92);
                                i52 = i52;
                                i53 = i53;
                                iZzB5 = iZzB5;
                                strZzc = strZzc;
                                i51 = i92;
                                c3 = c3;
                                str14 = str14;
                                sZzv = sZzv;
                            } else if (iZzB12 == 1414810956 || iZzB12 == 1954034535 || iZzB12 == 2004251764 || iZzB12 == 1937010800 || iZzB12 == 1664495672 || iZzB12 == 1836070003) {
                                zzerVar3.zzh(i52 + 16);
                                if (iZzB12 == 1414810956) {
                                    str2 = str2;
                                    str11 = str;
                                } else {
                                    str2 = str2;
                                    if (iZzB12 == 1954034535) {
                                        int i93 = i53 - 16;
                                        byte[] bArr5 = new byte[i93];
                                        zzerVar3.zzm(bArr5, 0, i93);
                                        zzgtdVarZzj = zzgtd.zzj(bArr5);
                                        str11 = "application/x-quicktime-tx3g";
                                    } else if (iZzB12 == 2004251764) {
                                        str11 = "application/x-mp4-vtt";
                                    } else if (iZzB12 == 1937010800) {
                                        zzerVar3 = zzerVar3;
                                        j3 = 0;
                                        str11 = str;
                                        zzgtdVarZzj = null;
                                        if (str11 != null) {
                                            zzt zztVar2 = new zzt();
                                            zztVar2.zzb(iZzB5);
                                            zztVar2.zzm(str11);
                                            zztVar2.zze(strZzc);
                                            zztVar2.zzr(j3);
                                            zztVar2.zzp(zzgtdVarZzj);
                                            zzajwVar3.zzb = zztVar2.zzM();
                                        }
                                        zzerVar3 = zzerVar3;
                                    } else if (iZzB12 == 1664495672) {
                                        zzajwVar3.zzd = 1;
                                        str11 = "application/x-mp4-cea-608";
                                        zzgtdVarZzj = null;
                                    } else {
                                        int iZzg8 = zzerVar3.zzg();
                                        zzerVar3.zzk(4);
                                        if (zzerVar3.zzB() == 1702061171) {
                                            zzajr zzajrVarZzp2 = zzp(zzerVar3, iZzg8);
                                            if (zzajrVarZzp2.zzb() == null || zzajrVarZzp2.zzb().length != 64) {
                                                sZzv2 = sZzv2;
                                                zzerVar3 = zzerVar3;
                                                i51 = i51;
                                                iZzB10 = iZzB10;
                                                zzajwVar3 = zzajwVar3;
                                                c3 = c3;
                                                jZzz2 = jZzz2;
                                                arrayList = arrayList;
                                                i44 = i44;
                                                i47 = i47;
                                                str14 = str14;
                                                j6 = j6;
                                                i52 = i52;
                                                i53 = i53;
                                                iZzB5 = iZzB5;
                                            } else {
                                                String strZzj = zzj(zzajrVarZzp2.zzb(), sZzv, sZzv2);
                                                String str20 = zzfj.zza;
                                                zzgtdVarZzj = zzgtd.zzj(strZzj.getBytes(StandardCharsets.UTF_8));
                                                str11 = "application/vobsub";
                                            }
                                        } else {
                                            zzgtdVarZzj = null;
                                            str11 = null;
                                        }
                                    }
                                    zzerVar3 = zzerVar3;
                                    j3 = Long.MAX_VALUE;
                                    if (str11 != null) {
                                        zzt zztVar3 = new zzt();
                                        zztVar3.zzb(iZzB5);
                                        zztVar3.zzm(str11);
                                        zztVar3.zze(strZzc);
                                        zztVar3.zzr(j3);
                                        zztVar3.zzp(zzgtdVarZzj);
                                        zzajwVar3.zzb = zztVar3.zzM();
                                    }
                                    zzerVar3 = zzerVar3;
                                }
                                zzgtdVarZzj = null;
                                j3 = Long.MAX_VALUE;
                                if (str11 != null) {
                                    zzt zztVar4 = new zzt();
                                    zztVar4.zzb(iZzB5);
                                    zztVar4.zzm(str11);
                                    zztVar4.zze(strZzc);
                                    zztVar4.zzr(j3);
                                    zztVar4.zzp(zzgtdVarZzj);
                                    zzajwVar3.zzb = zztVar4.zzM();
                                }
                                zzerVar3 = zzerVar3;
                            } else {
                                if (iZzB12 == 1835365492) {
                                    zzerVar3.zzh(i52 + 16);
                                    char c12 = c10;
                                    zzerVar3.zzM(c12);
                                    String strZzM = zzerVar3.zzM(c12);
                                    if (strZzM != null) {
                                        zzt zztVar5 = new zzt();
                                        zztVar5.zzb(iZzB5);
                                        zztVar5.zzm(strZzM);
                                        zzajwVar3.zzb = zztVar5.zzM();
                                    }
                                } else if (iZzB12 == 1667329389) {
                                    zzt zztVar6 = new zzt();
                                    zztVar6.zzb(iZzB5);
                                    zztVar6.zzm("application/x-camera-motion");
                                    zzajwVar3.zzb = zztVar6.zzM();
                                }
                                str2 = str2;
                                zzerVar3 = zzerVar3;
                            }
                            zzerVar3.zzh(i52 + i53);
                            iZzB5 = iZzB5;
                            c3 = c3;
                            strZzc = strZzc;
                            zzajwVar3 = zzajwVar3;
                            i47 = i47;
                            iZzB10 = iZzB10;
                            sZzv = sZzv;
                            i50 = i54;
                            jZzz2 = jZzz2;
                            arrayList = arrayList;
                            c10 = 0;
                            i51++;
                            zzerVar3 = zzerVar3;
                            str13 = str14;
                            str2 = str2;
                            sZzv2 = sZzv2;
                            i44 = i44;
                            jZzt2 = j6;
                        }
                        String str21 = str2;
                        long j7 = jZzt2;
                        str3 = str13;
                        int i94 = i50;
                        zzajw zzajwVar4 = zzajwVar3;
                        long j8 = jZzz2;
                        int i95 = iZzB5;
                        arrayList2 = arrayList;
                        i4 = i44;
                        i5 = i47;
                        i6 = 8;
                        i7 = 4;
                        if (z2) {
                            zzfuVar2 = zzfuVar3;
                        } else {
                            zzfuVar2 = zzfuVar3;
                            zzfu zzfuVarZzd4 = zzfuVar2.zzd(1701082227);
                            if (zzfuVarZzd4 != null && (pairZzn = zzn(zzfuVarZzd4)) != null) {
                                long[] jArr3 = (long[]) pairZzn.first;
                                jArr2 = (long[]) pairZzn.second;
                                jArr = jArr3;
                            }
                            zzvVarZzM = zzajwVar4.zzb;
                            if (zzvVarZzM == null) {
                                zzakvVar = null;
                            } else {
                                if (iZzt3 != 0) {
                                    zzftVar = new zzft(iZzt3);
                                    zzt zztVarZza = zzvVarZzM.zza();
                                    zzapVar = zzvVarZzM.zzl;
                                    if (zzapVar != null) {
                                        zzapVar2 = zzapVar.zzg(zzftVar);
                                    } else {
                                        zzapVar2 = new zzap(-9223372036854775807L, zzftVar);
                                    }
                                    zztVarZza.zzk(zzapVar2);
                                    zzvVarZzM = zztVarZza.zzM();
                                }
                                zzakvVar = new zzakv(i95, i94, zzajt.zza(j8, j7, str21), j2, jZzt, zzajt.zzb(j8, j7, str21), zzvVarZzM, zzajwVar4.zzd, zzajwVar4.zza, zzajwVar4.zzc, jArr, jArr2);
                            }
                        }
                        jArr = null;
                        jArr2 = null;
                        zzvVarZzM = zzajwVar4.zzb;
                        if (zzvVarZzM == null) {
                            zzakvVar = null;
                        } else {
                            if (iZzt3 != 0) {
                                zzftVar = new zzft(iZzt3);
                                zzt zztVarZza2 = zzvVarZzM.zza();
                                zzapVar = zzvVarZzM.zzl;
                                if (zzapVar != null) {
                                    zzapVar2 = zzapVar.zzg(zzftVar);
                                } else {
                                    zzapVar2 = new zzap(-9223372036854775807L, zzftVar);
                                }
                                zztVarZza2.zzk(zzapVar2);
                                zzvVarZzM = zztVarZza2.zzM();
                            }
                            zzakvVar = new zzakv(i95, i94, zzajt.zza(j8, j7, str21), j2, jZzt, zzajt.zzb(j8, j7, str21), zzvVarZzM, zzajwVar4.zzd, zzajwVar4.zza, zzajwVar4.zzc, jArr, jArr2);
                        }
                    }
                }
                zzakv zzakvVar2 = (zzakv) zzgprVar.apply(zzakvVar);
                if (zzakvVar2 != null) {
                    i36 = 1835297121;
                    zzfu zzfuVarZzd5 = zzfuVar2.zzd(1835297121);
                    zzfuVarZzd5.getClass();
                    zzfu zzfuVarZzd6 = zzfuVarZzd5.zzd(1835626086);
                    zzfuVarZzd6.getClass();
                    zzfu zzfuVarZzd7 = zzfuVarZzd6.zzd(1937007212);
                    zzfuVarZzd7.getClass();
                    c9 = 0;
                    zzaky zzakyVarZzg = zzg(zzakvVar2, zzfuVarZzd7, zzafgVar, false);
                    arrayList3 = arrayList2;
                    arrayList3.add(zzakyVarZzg);
                } else {
                    arrayList3 = arrayList2;
                    i36 = 1835297121;
                    c9 = 0;
                }
            }
            i37 = i36;
            c10 = c9;
            i38 = i4;
            i40 = i6;
            str12 = str;
            i39 = i7;
            str13 = str3;
            i41 = i5 + 1;
        }
    }

    /* JADX WARN: Code duplicated, block: B:51:0x00d9  */
    public static zzap zzc(zzfv zzfvVar) {
        int iZzF;
        zzer zzerVar = zzfvVar.zza;
        zzerVar.zzh(8);
        zzap zzapVar = new zzap(-9223372036854775807L, new zzao[0]);
        while (zzerVar.zzd() >= 8) {
            int iZzg = zzerVar.zzg();
            int iZzB = zzerVar.zzB() + iZzg;
            int iZzB2 = zzerVar.zzB();
            zzap zzapVar2 = null;
            if (iZzB2 == 1835365473) {
                zzerVar.zzh(iZzg);
                zzerVar.zzk(8);
                zzf(zzerVar);
                while (zzerVar.zzg() < iZzB) {
                    int iZzg2 = zzerVar.zzg();
                    int iZzB3 = zzerVar.zzB() + iZzg2;
                    if (zzerVar.zzB() == 1768715124) {
                        zzerVar.zzh(iZzg2);
                        zzerVar.zzk(8);
                        ArrayList arrayList = new ArrayList();
                        while (zzerVar.zzg() < iZzB3) {
                            zzao zzaoVarZzc = zzakj.zzc(zzerVar);
                            if (zzaoVarZzc != null) {
                                arrayList.add(zzaoVarZzc);
                            }
                        }
                        if (!arrayList.isEmpty()) {
                            zzapVar2 = new zzap(arrayList);
                            break;
                        }
                        break;
                    }
                    zzerVar.zzh(iZzB3);
                }
                zzapVar = zzapVar.zzf(zzapVar2);
            } else if (iZzB2 == 1936553057) {
                zzerVar.zzh(iZzg);
                zzerVar.zzk(12);
                while (zzerVar.zzg() < iZzB) {
                    int iZzg3 = zzerVar.zzg();
                    int iZzB4 = zzerVar.zzB();
                    if (zzerVar.zzB() == 1935766900) {
                        if (iZzB4 < 16) {
                            break;
                        }
                        zzerVar.zzk(4);
                        int i2 = -1;
                        int i3 = 0;
                        for (int i4 = 0; i4 < 2; i4++) {
                            int iZzs = zzerVar.zzs();
                            int iZzs2 = zzerVar.zzs();
                            if (iZzs == 0) {
                                i2 = iZzs2;
                            } else if (iZzs == 1) {
                                i3 = iZzs2;
                            }
                        }
                        if (i2 == 12) {
                            iZzF = PsExtractor.VIDEO_STREAM_MASK;
                        } else if (i2 == 13) {
                            iZzF = 120;
                        } else if (i2 == 21 && zzerVar.zzd() >= 8 && zzerVar.zzg() + 8 <= iZzB) {
                            int iZzB5 = zzerVar.zzB();
                            int iZzB6 = zzerVar.zzB();
                            if (iZzB5 < 12 || iZzB6 != 1936877170) {
                                iZzF = -2147483647;
                            } else {
                                iZzF = zzerVar.zzF();
                            }
                        } else {
                            iZzF = -2147483647;
                        }
                        if (iZzF == -2147483647) {
                            break;
                        }
                        zzapVar2 = new zzap(-9223372036854775807L, new zzaiq(iZzF, i3));
                        break;
                    }
                    zzerVar.zzh(iZzg3 + iZzB4);
                }
                zzapVar = zzapVar.zzf(zzapVar2);
            } else if (iZzB2 == -1451722374) {
                zzapVar = zzapVar.zzf(zzh(zzerVar));
            }
            zzerVar.zzh(iZzB);
        }
        return zzapVar;
    }

    public static zzfy zzd(zzer zzerVar) {
        long jZzD;
        long jZzD2;
        zzerVar.zzh(8);
        if (zza(zzerVar.zzB()) == 0) {
            jZzD = zzerVar.zzz();
            jZzD2 = zzerVar.zzz();
        } else {
            jZzD = zzerVar.zzD();
            jZzD2 = zzerVar.zzD();
        }
        return new zzfy(jZzD, jZzD2, zzerVar.zzz());
    }

    public static zzap zze(zzfu zzfuVar) {
        zzfs zzfsVar;
        zzfv zzfvVarZzc = zzfuVar.zzc(1751411826);
        zzfv zzfvVarZzc2 = zzfuVar.zzc(1801812339);
        zzfv zzfvVarZzc3 = zzfuVar.zzc(1768715124);
        if (zzfvVarZzc != null && zzfvVarZzc2 != null && zzfvVarZzc3 != null && zzi(zzfvVarZzc.zza) == 1835299937) {
            zzer zzerVar = zzfvVarZzc2.zza;
            zzerVar.zzh(12);
            int iZzB = zzerVar.zzB();
            String[] strArr = new String[iZzB];
            for (int i2 = 0; i2 < iZzB; i2++) {
                int iZzB2 = zzerVar.zzB();
                zzerVar.zzk(4);
                strArr[i2] = zzerVar.zzK(iZzB2 - 8, StandardCharsets.UTF_8);
            }
            zzer zzerVar2 = zzfvVarZzc3.zza;
            zzerVar2.zzh(8);
            ArrayList arrayList = new ArrayList();
            while (zzerVar2.zzd() > 8) {
                int iZzB3 = zzerVar2.zzB() + zzerVar2.zzg();
                int iZzB4 = zzerVar2.zzB() - 1;
                if (iZzB4 < 0 || iZzB4 >= iZzB) {
                    Z.w(new StringBuilder(String.valueOf(iZzB4).length() + 41), "Skipped metadata with unknown key index: ", iZzB4, "BoxParsers");
                } else {
                    String str = strArr[iZzB4];
                    while (true) {
                        int iZzg = zzerVar2.zzg();
                        if (iZzg >= iZzB3) {
                            zzfsVar = null;
                            break;
                        }
                        int iZzB5 = zzerVar2.zzB();
                        if (zzerVar2.zzB() == 1684108385) {
                            int iZzB6 = zzerVar2.zzB();
                            int iZzB7 = zzerVar2.zzB();
                            int i3 = iZzB5 - 16;
                            byte[] bArr = new byte[i3];
                            zzerVar2.zzm(bArr, 0, i3);
                            zzfsVar = new zzfs(str, bArr, iZzB7, iZzB6);
                            break;
                        }
                        zzerVar2.zzh(iZzg + iZzB5);
                    }
                    if (zzfsVar != null) {
                        arrayList.add(zzfsVar);
                    }
                }
                zzerVar2.zzh(iZzB3);
            }
            if (!arrayList.isEmpty()) {
                return new zzap(arrayList);
            }
        }
        return null;
    }

    public static void zzf(zzer zzerVar) {
        int iZzg = zzerVar.zzg();
        zzerVar.zzk(4);
        if (zzerVar.zzB() != 1751411826) {
            iZzg += 4;
        }
        zzerVar.zzh(iZzg);
    }

    /* JADX WARN: Code duplicated, block: B:100:0x027e  */
    /* JADX WARN: Code duplicated, block: B:106:0x0297  */
    /* JADX WARN: Code duplicated, block: B:109:0x02a0 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:110:0x02a2  */
    /* JADX WARN: Code duplicated, block: B:111:0x02b0  */
    /* JADX WARN: Code duplicated, block: B:116:0x02ce A[DONT_INVERT, LOOP:14: B:116:0x02ce->B:120:0x02d9, LOOP_START, PHI: r33
  0x02ce: PHI (r33v2 int) = (r33v1 int), (r33v3 int) binds: [B:115:0x02cc, B:120:0x02d9] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:117:0x02d0  */
    /* JADX WARN: Code duplicated, block: B:120:0x02d9 A[LOOP:14: B:116:0x02ce->B:120:0x02d9, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:121:0x02df A[EDGE_INSN: B:121:0x02df->B:122:0x02e1 BREAK  A[LOOP:14: B:116:0x02ce->B:120:0x02d9]] */
    /* JADX WARN: Code duplicated, block: B:123:0x02e3 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:124:0x02e5 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:125:0x02e7 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:126:0x02e9 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:127:0x02eb A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:128:0x02ed  */
    /* JADX WARN: Code duplicated, block: B:130:0x02fc  */
    /* JADX WARN: Code duplicated, block: B:131:0x0308  */
    /* JADX WARN: Code duplicated, block: B:133:0x0315  */
    /* JADX WARN: Code duplicated, block: B:135:0x0321  */
    /* JADX WARN: Code duplicated, block: B:136:0x032c  */
    /* JADX WARN: Code duplicated, block: B:137:0x033c  */
    /* JADX WARN: Code duplicated, block: B:140:0x0397  */
    /* JADX WARN: Code duplicated, block: B:141:0x039a  */
    /* JADX WARN: Code duplicated, block: B:146:0x03df  */
    /* JADX WARN: Code duplicated, block: B:151:0x0407  */
    /* JADX WARN: Code duplicated, block: B:154:0x0420  */
    /* JADX WARN: Code duplicated, block: B:156:0x042f  */
    /* JADX WARN: Code duplicated, block: B:158:0x0435  */
    /* JADX WARN: Code duplicated, block: B:185:0x04e7  */
    /* JADX WARN: Code duplicated, block: B:186:0x04e9  */
    /* JADX WARN: Code duplicated, block: B:198:0x0541  */
    /* JADX WARN: Code duplicated, block: B:199:0x0543  */
    /* JADX WARN: Code duplicated, block: B:203:0x0554  */
    /* JADX WARN: Code duplicated, block: B:205:0x055f  */
    /* JADX WARN: Code duplicated, block: B:208:0x058e  */
    /* JADX WARN: Code duplicated, block: B:210:0x0594  */
    /* JADX WARN: Code duplicated, block: B:211:0x0596  */
    /* JADX WARN: Code duplicated, block: B:222:0x05b9  */
    /* JADX WARN: Code duplicated, block: B:224:0x05c1  */
    /* JADX WARN: Code duplicated, block: B:230:0x05d6  */
    /* JADX WARN: Code duplicated, block: B:233:0x05df  */
    /* JADX WARN: Code duplicated, block: B:234:0x05e1  */
    /* JADX WARN: Code duplicated, block: B:237:0x05ea  */
    /* JADX WARN: Code duplicated, block: B:241:0x060b  */
    /* JADX WARN: Code duplicated, block: B:242:0x060d  */
    /* JADX WARN: Code duplicated, block: B:245:0x0612  */
    /* JADX WARN: Code duplicated, block: B:246:0x0615  */
    /* JADX WARN: Code duplicated, block: B:248:0x0619  */
    /* JADX WARN: Code duplicated, block: B:250:0x061d  */
    /* JADX WARN: Code duplicated, block: B:252:0x0621  */
    /* JADX WARN: Code duplicated, block: B:254:0x0625  */
    /* JADX WARN: Code duplicated, block: B:255:0x0628  */
    /* JADX WARN: Code duplicated, block: B:257:0x062b  */
    /* JADX WARN: Code duplicated, block: B:258:0x0631  */
    /* JADX WARN: Code duplicated, block: B:262:0x063e  */
    /* JADX WARN: Code duplicated, block: B:264:0x064a  */
    /* JADX WARN: Code duplicated, block: B:265:0x065a  */
    /* JADX WARN: Code duplicated, block: B:268:0x0662  */
    /* JADX WARN: Code duplicated, block: B:270:0x0686  */
    /* JADX WARN: Code duplicated, block: B:272:0x068b  */
    /* JADX WARN: Code duplicated, block: B:283:0x06b0  */
    /* JADX WARN: Code duplicated, block: B:288:0x06e2  */
    /* JADX WARN: Code duplicated, block: B:299:0x05a2 A[EDGE_INSN: B:299:0x05a2->B:215:0x05a2 BREAK  A[LOOP:6: B:206:0x058b->B:214:0x059f], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:302:0x059f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:312:0x02c0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:313:0x0230 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:315:0x02b2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:317:0x022a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:318:0x0227 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:320:0x025d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:321:0x02df A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:322:0x02d6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:58:0x0139  */
    /* JADX WARN: Code duplicated, block: B:59:0x013c  */
    /* JADX WARN: Code duplicated, block: B:61:0x0140  */
    /* JADX WARN: Code duplicated, block: B:64:0x014c A[LOOP:0: B:62:0x0146->B:64:0x014c, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:67:0x0160 A[LOOP:1: B:66:0x015e->B:67:0x0160, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:70:0x0184  */
    /* JADX WARN: Code duplicated, block: B:72:0x0198 A[LOOP:3: B:71:0x0196->B:72:0x0198, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:76:0x01e4  */
    /* JADX WARN: Code duplicated, block: B:79:0x0210  */
    /* JADX WARN: Code duplicated, block: B:81:0x0214  */
    /* JADX WARN: Code duplicated, block: B:83:0x021c A[LOOP:12: B:80:0x0212->B:83:0x021c, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:88:0x024b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:90:0x024e A[ADDED_TO_REGION, LOOP:13: B:90:0x024e->B:92:0x0252, LOOP_START, PHI: r10 r33 r34
  0x024e: PHI (r10v16 int) = (r10v3 int), (r10v17 int) binds: [B:88:0x024b, B:92:0x0252] A[DONT_GENERATE, DONT_INLINE]
  0x024e: PHI (r33v5 int) = (r33v1 int), (r33v6 int) binds: [B:88:0x024b, B:92:0x0252] A[DONT_GENERATE, DONT_INLINE]
  0x024e: PHI (r34v3 int) = (r34v1 int), (r34v7 int) binds: [B:88:0x024b, B:92:0x0252] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:91:0x0250 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:92:0x0252 A[LOOP:13: B:90:0x024e->B:92:0x0252, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:97:0x026e  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v12 */
    /* JADX WARN: Type inference failed for: r15v13 */
    /* JADX WARN: Type inference failed for: r15v3 */
    /* JADX WARN: Type inference failed for: r15v4 */
    /* JADX WARN: Type inference failed for: r15v5 */
    /* JADX WARN: Type inference failed for: r15v6 */
    /* JADX WARN: Type inference failed for: r2v34 */
    /* JADX WARN: Type inference failed for: r30v2, types: [int[], java.lang.Object] */
    /* JADX WARN: Type inference failed for: r30v3, types: [int[]] */
    /* JADX WARN: Type inference failed for: r30v5, types: [int[]] */
    /* JADX WARN: Type inference failed for: r32v0 */
    /* JADX WARN: Type inference failed for: r32v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r32v2 */
    /* JADX WARN: Type inference failed for: r36v1 */
    /* JADX WARN: Type inference failed for: r36v15 */
    /* JADX WARN: Type inference failed for: r36v16 */
    /* JADX WARN: Type inference failed for: r36v17 */
    /* JADX WARN: Type inference failed for: r36v2 */
    /* JADX WARN: Type inference failed for: r36v3 */
    /* JADX WARN: Type inference failed for: r4v16 */
    /* JADX WARN: Type inference failed for: r5v38 */
    /* JADX WARN: Type inference failed for: r5v40 */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v18, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v5, types: [int[]] */
    /* JADX WARN: Type inference failed for: r6v52 */
    public static zzaky zzg(zzakv zzakvVar, zzfu zzfuVar, zzafg zzafgVar, boolean z2) throws zzat {
        zzaju zzajyVar;
        boolean z3;
        int iZzH;
        int iZzH2;
        int iZzH3;
        int i2;
        int i3;
        int i4;
        ArrayList arrayList;
        ?? r32;
        long[] jArr;
        int[] iArr;
        zzer zzerVar;
        long[] jArr2;
        zzer zzerVar2;
        ?? r6;
        zzaju zzajuVar;
        int i5;
        int i6;
        int iZzH4;
        long j;
        long j2;
        int i7;
        int iZzH5;
        int i8;
        int iZzB;
        int i9;
        int i10;
        int iZzH6;
        long j3;
        zzakv zzakvVar2;
        long[] jArr3;
        ?? CopyOf;
        int[] iArrCopyOf;
        long[] jArrCopyOf;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        long j4;
        long j5;
        int[] iArr2;
        String str;
        ?? r36;
        int i19;
        ?? r37;
        int iZzc;
        int i20;
        boolean zZza;
        ?? r15;
        long[] jArr4;
        long j6;
        zzakv zzakvVarZzb;
        long j7;
        long jZzt;
        int[] iArrZzf;
        long[] jArr5;
        ?? r30;
        int length;
        int i21;
        long j8;
        long j9;
        long[] jArr6;
        int[] iArr3;
        int i22;
        boolean z4;
        long[] jArr7;
        int[] iArr4;
        int[] iArr5;
        int i23;
        int i24;
        boolean z5;
        int i25;
        int[] iArr6;
        int[] iArr7;
        long[] jArr8;
        boolean z6;
        boolean z7;
        long[] jArr9;
        int[] iArr8;
        ?? r7;
        ArrayList arrayList2;
        long[] jArr10;
        int i26;
        boolean z8;
        int i27;
        long j10;
        long j11;
        int i28;
        int i29;
        boolean z9;
        long[] jArr11;
        int i30;
        long jZzt2;
        boolean z10;
        int i31;
        int[] iArr9;
        int[] iArr10;
        int i32;
        long j12;
        int[] iArr11;
        int[] iArr12;
        long jZzt3;
        int i33;
        int i34;
        int i35;
        int i36;
        int i37;
        boolean z11;
        boolean z12;
        int length2;
        long jZzt4;
        int i38;
        long[] jArr12;
        int[] iArr13;
        long j13;
        int i39;
        int i40;
        int i41;
        int[] iArr14;
        int[] iArr15;
        int i42;
        int i43;
        int i44;
        int i45;
        int i46;
        long j14;
        int iMax;
        int i47;
        int i48;
        zzakv zzakvVarZzb2 = zzakvVar;
        zzfv zzfvVarZzc = zzfuVar.zzc(1937011578);
        if (zzfvVarZzc != null) {
            zzajyVar = new zzajx(zzfvVarZzc, zzakvVarZzb2.zzg);
        } else {
            zzfv zzfvVarZzc2 = zzfuVar.zzc(1937013298);
            if (zzfvVarZzc2 == null) {
                throw zzat.zzb("Track has no sample table size information", null);
            }
            zzajyVar = new zzajy(zzfvVarZzc2);
        }
        int iZza = zzajyVar.zza();
        if (iZza == 0) {
            return new zzaky(zzakvVarZzb2, new long[0], new int[0], 0, new long[0], new int[0], new int[0], false, 0L, 0);
        }
        if (zzakvVarZzb2.zzb == 2) {
            long j15 = zzakvVarZzb2.zzf;
            if (j15 > 0) {
                zzt zztVarZza = zzakvVarZzb2.zzg.zza();
                zztVarZza.zzx(iZza / (j15 / 1000000.0f));
                zzakvVarZzb2 = zzakvVarZzb2.zzb(zztVarZza.zzM());
            }
        }
        zzfv zzfvVarZzc3 = zzfuVar.zzc(1937007471);
        if (zzfvVarZzc3 == null) {
            zzfvVarZzc3 = zzfuVar.zzc(1668232756);
            zzfvVarZzc3.getClass();
            z3 = true;
        } else {
            z3 = false;
        }
        zzfv zzfvVarZzc4 = zzfuVar.zzc(1937011555);
        zzfvVarZzc4.getClass();
        zzer zzerVar3 = zzfvVarZzc4.zza;
        zzfv zzfvVarZzc5 = zzfuVar.zzc(1937011827);
        zzfvVarZzc5.getClass();
        zzer zzerVar4 = zzfvVarZzc5.zza;
        zzfv zzfvVarZzc6 = zzfuVar.zzc(1937011571);
        zzer zzerVar5 = zzfvVarZzc6 != null ? zzfvVarZzc6.zza : null;
        zzfv zzfvVarZzc7 = zzfuVar.zzc(1668576371);
        zzer zzerVar6 = zzfvVarZzc7 != null ? zzfvVarZzc7.zza : null;
        zzajq zzajqVar = new zzajq(zzerVar3, zzfvVarZzc3.zza, z3);
        zzerVar4.zzh(12);
        int iZzH7 = zzerVar4.zzH() - 1;
        int iZzH8 = zzerVar4.zzH();
        int iZzH9 = zzerVar4.zzH();
        if (zzerVar6 != null) {
            zzerVar6.zzh(12);
            iZzH = zzerVar6.zzH();
        } else {
            iZzH = 0;
        }
        if (zzerVar5 != null) {
            zzerVar5.zzh(12);
            iZzH3 = zzerVar5.zzH();
            if (iZzH3 > 0) {
                iZzH2 = zzerVar5.zzH() - 1;
                i2 = 0;
            } else {
                iZzH2 = -1;
                i2 = 0;
                zzerVar5 = null;
            }
        } else {
            iZzH2 = -1;
            iZzH3 = 0;
            i2 = 0;
        }
        int iZzb = zzajyVar.zzb();
        zzv zzvVar = zzakvVarZzb2.zzg;
        if (iZzb != -1) {
            String str2 = zzvVar.zzo;
            i3 = 1;
            if (("audio/raw".equals(str2) || "audio/g711-mlaw".equals(str2) || "audio/g711-alaw".equals(str2)) && iZzH7 == 0) {
                if (iZzH == 0 && iZzH3 == 0) {
                    iZzH7 = i2;
                    i4 = 1;
                } else {
                    i4 = i2;
                    iZzH7 = i4;
                }
            }
            arrayList = new ArrayList();
            if (zzerVar5 == null) {
                r32 = i3;
            } else {
                r32 = i2;
            }
            if (i4 != 0) {
                i38 = zzajqVar.zza;
                jArr12 = new long[i38];
                iArr13 = new int[i38];
                while (zzajqVar.zza()) {
                    int i49 = zzajqVar.zzb;
                    jArr12[i49] = zzajqVar.zzd;
                    iArr13[i49] = zzajqVar.zzc;
                }
                j13 = iZzH9;
                i39 = Segment.SIZE / iZzb;
                i40 = i2;
                i41 = i40;
                while (i40 < i38) {
                    int i50 = iArr13[i40];
                    String str3 = zzfj.zza;
                    i41 += ((i50 + i39) - 1) / i39;
                    i40++;
                }
                jArr3 = new long[i41];
                iArr14 = new int[i41];
                jArrCopyOf = new long[i41];
                iArr15 = new int[i41];
                i42 = i2;
                i43 = i42;
                i44 = i43;
                i45 = i44;
                i46 = i45;
                while (i42 < i38) {
                    int i51 = iArr13[i42];
                    j14 = jArr12[i42];
                    int i52 = i46;
                    int i53 = i38;
                    iMax = i45;
                    i47 = i52;
                    int i54 = i42;
                    i48 = i51;
                    while (i48 > 0) {
                        int iMin = Math.min(i39, i48);
                        jArr3[i47] = j14;
                        int i55 = i48;
                        int i56 = iZzb * iMin;
                        iArr14[i47] = i56;
                        iMax = Math.max(iMax, i56);
                        jArrCopyOf[i47] = ((long) i43) * j13;
                        iArr15[i47] = i3;
                        j14 += (long) iArr14[i47];
                        i43 += iMin;
                        i47++;
                        i44 += i56;
                        i48 = i55 - iMin;
                        i39 = i39;
                    }
                    int i57 = i39;
                    i42 = i54 + 1;
                    int i58 = i47;
                    i45 = iMax;
                    i38 = i53;
                    i46 = i58;
                    i39 = i57;
                }
                long j16 = j13 * ((long) i43);
                j5 = i44;
                zzakvVar2 = zzakvVarZzb2;
                arrayList = arrayList;
                j4 = j16;
                i17 = i41;
                iArr2 = iArr14;
                i18 = i45;
                r15 = iArr15;
            } else {
                jArr = new long[iZza];
                iArr = new int[iZza];
                zzerVar = zzerVar6;
                jArr2 = new long[iZza];
                zzerVar2 = zzerVar5;
                r6 = new int[iZza];
                zzajuVar = zzajyVar;
                i5 = iZzH3;
                i6 = iZzH7;
                iZzH4 = iZzH8;
                j = 0;
                j2 = 0;
                i7 = iZzH;
                iZzH5 = iZzH2;
                i8 = i2;
                iZzB = i8;
                i9 = iZzB;
                i10 = i9;
                iZzH6 = i10;
                j3 = 0;
                while (true) {
                    if (i8 < iZza) {
                        zzakvVar2 = zzakvVarZzb2;
                        jArr3 = jArr;
                        CopyOf = r6;
                        iArrCopyOf = iArr;
                        jArrCopyOf = jArr2;
                        break;
                    }
                    r36 = i3;
                    while (true) {
                        if (i10 == 0) {
                            zzakvVar2 = zzakvVarZzb2;
                            i19 = i10;
                            r37 = r36;
                            break;
                        }
                        zZza = zzajqVar.zza();
                        zzakvVar2 = zzakvVarZzb2;
                        if (zZza) {
                            i19 = i2;
                            r37 = zZza;
                            break;
                        }
                        j3 = zzajqVar.zzd;
                        i10 = zzajqVar.zzc;
                        zzakvVarZzb2 = zzakvVar2;
                        r36 = zZza;
                    }
                    if (r37 == 0) {
                        zzee.zzc("BoxParsers", "Unexpected end of chunk data");
                        long[] jArrCopyOf2 = Arrays.copyOf(jArr, i8);
                        iArrCopyOf = Arrays.copyOf(iArr, i8);
                        jArrCopyOf = Arrays.copyOf(jArr2, i8);
                        jArr3 = jArrCopyOf2;
                        CopyOf = Arrays.copyOf((int[]) r6, i8);
                        iZza = i8;
                        break;
                    }
                    if (zzerVar != null) {
                        while (iZzH6 == 0) {
                            if (i7 > 0) {
                                iZzH6 = i2;
                                break;
                            }
                            i7--;
                            iZzH6 = zzerVar.zzH();
                            iZzB = zzerVar.zzB();
                        }
                        iZzH6--;
                    }
                    iZzc = zzajuVar.zzc();
                    long[] jArr13 = jArr2;
                    int i59 = i19;
                    long j17 = iZzc;
                    j2 += j17;
                    if (iZzc > i9) {
                        i9 = iZzc;
                    }
                    jArr[i8] = j3;
                    iArr[i8] = iZzc;
                    jArr13[i8] = j + ((long) iZzB);
                    r6[i8] = r32;
                    if (i8 == iZzH5) {
                        r6[i8] = i3;
                        arrayList.add(Integer.valueOf(i8));
                    }
                    if (zzerVar2 == null && i8 == iZzH5) {
                        i20 = i5 - 1;
                        if (i20 > 0) {
                            iZzH5 = zzerVar2.zzH() - 1;
                        }
                    } else {
                        i20 = i5;
                    }
                    j += (long) iZzH9;
                    iZzH4--;
                    if (iZzH4 != 0) {
                        if (i6 > 0) {
                            i6--;
                            iZzH4 = zzerVar4.zzH();
                            iZzH9 = zzerVar4.zzB();
                        } else {
                            iZzH4 = i2;
                        }
                    }
                    j3 += j17;
                    i10 = i59 - 1;
                    i8++;
                    i5 = i20;
                    jArr2 = jArr13;
                    zzakvVarZzb2 = zzakvVar2;
                }
                long j18 = j + ((long) iZzB);
                if (zzerVar != null) {
                    i11 = i3;
                    break;
                }
                while (true) {
                    if (i7 > 0) {
                        i11 = i3;
                        break;
                    }
                    if (zzerVar.zzH() != 0) {
                        i11 = i2;
                        break;
                    }
                    zzerVar.zzB();
                    i7--;
                }
                if (i5 == 0) {
                    i11 = i11;
                    iArrCopyOf = iArrCopyOf;
                    arrayList = arrayList;
                    i12 = i10;
                    i13 = i6;
                    i14 = iZzH6;
                    i15 = iZzH4;
                    i16 = i5;
                } else if (iZzH4 == 0) {
                    if (i10 == 0) {
                        if (i6 == 0) {
                            i16 = i2;
                            i15 = i16;
                            i12 = i15;
                        } else if (iZzH6 == 0) {
                            i11 = i11;
                            iArrCopyOf = iArrCopyOf;
                            arrayList = arrayList;
                            i16 = i2;
                            i15 = i16;
                            i12 = i15;
                            i13 = i12;
                            i14 = iZzH6;
                        } else if (i11 == 0) {
                            iArrCopyOf = iArrCopyOf;
                            arrayList = arrayList;
                            i16 = i2;
                            i15 = i16;
                            i12 = i15;
                            i13 = i12;
                            i14 = i13;
                            i11 = i14;
                        } else {
                            iArrCopyOf = iArrCopyOf;
                            arrayList = arrayList;
                            zzakvVar2 = zzakvVar2;
                        }
                        i17 = iZza;
                        i18 = i9;
                        j4 = j18;
                        j5 = j2;
                        iArr2 = iArrCopyOf;
                        r15 = CopyOf;
                    } else {
                        i16 = i2;
                        i15 = i16;
                        i12 = i10;
                    }
                    i13 = i6;
                    i14 = iZzH6;
                } else {
                    i11 = i11;
                    iArrCopyOf = iArrCopyOf;
                    arrayList = arrayList;
                    i16 = i2;
                    i12 = i10;
                    i13 = i6;
                    i14 = iZzH6;
                    i15 = iZzH4;
                }
                int i60 = zzakvVar2.zza;
                int length3 = String.valueOf(i13).length() + String.valueOf(i12).length() + String.valueOf(i15).length() + String.valueOf(i16).length() + String.valueOf(i60).length() + 66 + 35 + 26 + 33 + 36;
                int length4 = String.valueOf(i14).length();
                if (i3 != i11) {
                    str = ", ctts invalid";
                } else {
                    str = "";
                }
                StringBuilder sb = new StringBuilder(str.length() + length3 + length4);
                androidx.datastore.preferences.protobuf.a.z(sb, "Inconsistent stbl box for track ", i60, ": remainingSynchronizationSamples ", i16);
                androidx.datastore.preferences.protobuf.a.z(sb, ", remainingSamplesAtTimestampDelta ", i15, ", remainingSamplesInChunk ", i12);
                androidx.datastore.preferences.protobuf.a.z(sb, ", remainingTimestampDeltaChanges ", i13, ", remainingSamplesAtTimestampOffset ", i14);
                sb.append(str);
                zzee.zzc("BoxParsers", sb.toString());
                i17 = iZza;
                i18 = i9;
                j4 = j18;
                j5 = j2;
                iArr2 = iArrCopyOf;
                r15 = CopyOf;
            }
            jArr4 = jArr3;
            j6 = zzakvVar2.zzf;
            if (j6 > 0) {
                jZzt4 = zzfj.zzt(j5 * 8, 1000000L, j6, RoundingMode.HALF_DOWN);
                if (jZzt4 > 0 || jZzt4 >= 2147483647L) {
                    zzakvVarZzb = zzakvVar2;
                } else {
                    zzt zztVarZza2 = zzvVar.zza();
                    zztVarZza2.zzh((int) jZzt4);
                    zzakvVarZzb = zzakvVar2.zzb(zztVarZza2.zzM());
                }
            } else {
                zzakvVarZzb = zzakvVar2;
            }
            j7 = zzakvVarZzb.zzc;
            RoundingMode roundingMode = RoundingMode.DOWN;
            jZzt = zzfj.zzt(j4, 1000000L, j7, roundingMode);
            iArrZzf = zzgwx.zzf(arrayList);
            jArr5 = zzakvVarZzb.zzi;
            if (jArr5 == null) {
                zzfj.zzu(jArrCopyOf, 1000000L, j7);
                return new zzaky(zzakvVarZzb, jArr4, iArr2, i18, jArrCopyOf, r15, iArrZzf, r32, jZzt, i17);
            }
            r30 = r15;
            length = jArr5.length;
            if (length == 1) {
                if (zzakvVarZzb.zzb == 1 || (length2 = jArrCopyOf.length) < 2) {
                    j8 = j7;
                } else {
                    long[] jArr14 = zzakvVarZzb.zzj;
                    jArr14.getClass();
                    long j19 = jArr14[i2];
                    long j20 = jArr5[i2];
                    long j21 = zzakvVarZzb.zzd;
                    long jZzt5 = zzfj.zzt(j20, j7, j21, roundingMode) + j19;
                    int i61 = length2 - 1;
                    int i62 = i2;
                    int iMax2 = Math.max(i62, Math.min(4, i61));
                    int iMax3 = Math.max(i62, Math.min(length2 - 4, i61));
                    if (jArrCopyOf[i62] > j19 || j19 >= jArrCopyOf[iMax2] || jArrCopyOf[iMax3] >= jZzt5 || jZzt5 > 2 + j4) {
                        j8 = j7;
                    } else {
                        long jMax = Math.max(0L, j4 - jZzt5);
                        long j22 = j19 - jArrCopyOf[0];
                        long j23 = zzakvVarZzb.zzg.zzH;
                        long jZzt6 = zzfj.zzt(j22, j23, j7, roundingMode);
                        long jZzt7 = zzfj.zzt(jMax, j23, j7, roundingMode);
                        j8 = j7;
                        if (jZzt6 != 0) {
                            if (jZzt6 <= 2147483647L && jZzt7 <= 2147483647L) {
                                zzafgVar.zza = (int) jZzt6;
                                zzafgVar.zzb = (int) jZzt7;
                                zzfj.zzu(jArrCopyOf, 1000000L, j8);
                                return new zzaky(zzakvVarZzb, jArr4, iArr2, i18, jArrCopyOf, r30, iArrZzf, r32, zzfj.zzt(jArr5[0], 1000000L, j21, roundingMode), i17);
                            }
                        } else if (jZzt7 != 0) {
                            jZzt6 = 0;
                            if (jZzt6 <= 2147483647L) {
                                zzafgVar.zza = (int) jZzt6;
                                zzafgVar.zzb = (int) jZzt7;
                                zzfj.zzu(jArrCopyOf, 1000000L, j8);
                                return new zzaky(zzakvVarZzb, jArr4, iArr2, i18, jArrCopyOf, r30, iArrZzf, r32, zzfj.zzt(jArr5[0], 1000000L, j21, roundingMode), i17);
                            }
                        }
                    }
                }
                i21 = 1;
            } else {
                i21 = length;
                j8 = j7;
            }
            if (i21 != 1 && jArr5[0] == 0) {
                long[] jArr15 = zzakvVarZzb.zzj;
                jArr15.getClass();
                long j24 = jArr15[0];
                int i63 = 0;
                while (i63 < jArrCopyOf.length) {
                    long j25 = j8;
                    jArrCopyOf[i63] = zzfj.zzt(jArrCopyOf[i63] - j24, 1000000L, j25, RoundingMode.DOWN);
                    i63++;
                    j8 = j25;
                }
                return new zzaky(zzakvVarZzb, jArr4, iArr2, i18, jArrCopyOf, r30, iArrZzf, r32, zzfj.zzt(j4 - j24, 1000000L, j8, RoundingMode.DOWN), i17);
            }
            j9 = j8;
            jArr6 = jArr4;
            iArr3 = iArr2;
            i22 = i17;
            if (zzakvVarZzb.zzb == 1) {
                z4 = true;
            } else {
                z4 = false;
            }
            jArr7 = zzakvVarZzb.zzj;
            iArr4 = new int[i21];
            iArr5 = new int[i21];
            jArr7.getClass();
            i23 = 0;
            i24 = 0;
            z5 = false;
            i25 = 0;
            while (i23 < jArr5.length) {
                iArr10 = iArr4;
                i32 = i23;
                j12 = jArr7[i32];
                if (j12 != -1) {
                    iArr12 = iArr10;
                    long j26 = j9;
                    j9 = j26;
                    jZzt3 = zzfj.zzt(jArr5[i32], j26, zzakvVarZzb.zzd, RoundingMode.DOWN) + j12;
                    iArr11 = iArr5;
                    iArr12[i32] = zzfj.zzm(jArrCopyOf, j12, true, true);
                    int iZzo = zzfj.zzo(jArrCopyOf, jZzt3, z4, false);
                    i34 = iZzo - 1;
                    i35 = 0;
                    for (i33 = iZzo; i33 < jArrCopyOf.length; i33++) {
                        if (jArrCopyOf[i33] < jZzt3) {
                            i35++;
                            if (i35 > zzakvVarZzb.zzg.zzq) {
                                break;
                            }
                        } else {
                            i34 = i33;
                        }
                    }
                    iArr11[i32] = i34 + 1;
                    i36 = iArr12[i32];
                    while (true) {
                        i37 = iArr12[i32];
                        if (i37 <= 0 || (r30[i37] & 1) != 0) {
                            break;
                        }
                        iArr12[i32] = i37 - 1;
                    }
                    if (i37 == 0) {
                        z11 = false;
                        if ((r30[0] & 1) == 0) {
                            iArr12[i32] = i36;
                            while (true) {
                                i37 = iArr12[i32];
                                if (i37 >= iArr11[i32] || (r30[i37] & 1) != 0) {
                                    break;
                                }
                                iArr12[i32] = i37 + 1;
                            }
                        }
                    } else {
                        z11 = false;
                    }
                    int i64 = iArr11[i32];
                    int i65 = (i64 - i37) + i24;
                    if (i25 != i37) {
                        z12 = true;
                    } else {
                        z12 = z11;
                    }
                    i25 = i64;
                    z5 = z12 | z5;
                    i24 = i65;
                } else {
                    iArr11 = iArr5;
                    iArr12 = iArr10;
                }
                i23 = i32 + 1;
                iArr4 = iArr12;
                iArr5 = iArr11;
                z4 = z4;
                jArr6 = jArr6;
            }
            iArr6 = iArr5;
            iArr7 = iArr4;
            jArr8 = jArr6;
            if (i24 != i22) {
                z6 = true;
            } else {
                z6 = false;
            }
            z7 = z6 | z5;
            if (z7) {
                jArr9 = new long[i24];
            } else {
                jArr9 = jArr8;
            }
            if (z7) {
                iArr8 = new int[i24];
            } else {
                iArr8 = iArr3;
            }
            if (true == z7) {
                i18 = 0;
            }
            if (z7) {
                iArr9 = new int[i24];
            } else {
                r7 = r30;
            }
            if (z7) {
                r7 = iArr9;
                arrayList2 = new ArrayList();
            } else {
                r7 = iArr9;
                arrayList2 = arrayList;
            }
            jArr10 = new long[i24];
            i26 = 0;
            z8 = false;
            i27 = 0;
            j10 = 0;
            while (i26 < jArr5.length) {
                j11 = jArr7[i26];
                i28 = iArr7[i26];
                long[] jArr16 = jArr5;
                i29 = iArr6[i26];
                z9 = z7;
                if (z7) {
                    int i66 = i29 - i28;
                    jArr11 = jArr8;
                    System.arraycopy(jArr11, i28, jArr9, i27, i66);
                    System.arraycopy(iArr3, i28, iArr8, i27, i66);
                    System.arraycopy(r30, i28, r7, i27, i66);
                } else {
                    jArr11 = jArr8;
                }
                i30 = i18;
                while (i28 < i29) {
                    long[] jArr17 = jArr11;
                    int[] iArr16 = iArr8;
                    long j27 = zzakvVarZzb.zzd;
                    RoundingMode roundingMode2 = RoundingMode.DOWN;
                    long jZzt8 = zzfj.zzt(j10, 1000000L, j27, roundingMode2);
                    jZzt2 = zzfj.zzt(jArrCopyOf[i28] - j11, 1000000L, j9, roundingMode2);
                    if (jZzt2 < 0) {
                        z10 = false;
                    } else {
                        z10 = true;
                    }
                    z8 = (!z10) | z8;
                    jArr10[i27] = jZzt8 + jZzt2;
                    if (z9 && iArr16[i27] > i30) {
                        i30 = iArr3[i28];
                    }
                    if (z9 || r32 != 0) {
                        i31 = 1;
                    } else {
                        i31 = 1;
                        if ((r7[i27] & 1) != 0) {
                            arrayList2.add(Integer.valueOf(i27));
                        }
                    }
                    i27 += i31;
                    i28 += i31;
                    jArr11 = jArr17;
                    iArr8 = iArr16;
                }
                jArr8 = jArr11;
                j10 += jArr16[i26];
                i26++;
                i18 = i30;
                jArr5 = jArr16;
                jArr7 = jArr7;
                iArr8 = iArr8;
                z7 = z9;
            }
            int[] iArr17 = iArr8;
            long jZzt9 = zzfj.zzt(j10, 1000000L, zzakvVarZzb.zzd, RoundingMode.DOWN);
            if (z8) {
                zzt zztVarZza3 = zzakvVarZzb.zzg.zza();
                zztVarZza3.zzs(true);
                zzakvVarZzb = zzakvVarZzb.zzb(zztVarZza3.zzM());
            }
            return new zzaky(zzakvVarZzb, jArr9, iArr17, i18, jArr10, r7, zzgwx.zzf(arrayList2), r32, jZzt9, jArr9.length);
        }
        i3 = 1;
        i4 = i2;
        arrayList = new ArrayList();
        if (zzerVar5 == null) {
            r32 = i3;
        } else {
            r32 = i2;
        }
        if (i4 != 0) {
            i38 = zzajqVar.zza;
            jArr12 = new long[i38];
            iArr13 = new int[i38];
            while (zzajqVar.zza()) {
                int i410 = zzajqVar.zzb;
                jArr12[i410] = zzajqVar.zzd;
                iArr13[i410] = zzajqVar.zzc;
            }
            j13 = iZzH9;
            i39 = Segment.SIZE / iZzb;
            i40 = i2;
            i41 = i40;
            while (i40 < i38) {
                int i510 = iArr13[i40];
                String str4 = zzfj.zza;
                i41 += ((i510 + i39) - 1) / i39;
                i40++;
            }
            jArr3 = new long[i41];
            iArr14 = new int[i41];
            jArrCopyOf = new long[i41];
            iArr15 = new int[i41];
            i42 = i2;
            i43 = i42;
            i44 = i43;
            i45 = i44;
            i46 = i45;
            while (i42 < i38) {
                int i511 = iArr13[i42];
                j14 = jArr12[i42];
                int i512 = i46;
                int i513 = i38;
                iMax = i45;
                i47 = i512;
                int i514 = i42;
                i48 = i511;
                while (i48 > 0) {
                    int iMin2 = Math.min(i39, i48);
                    jArr3[i47] = j14;
                    int i515 = i48;
                    int i516 = iZzb * iMin2;
                    iArr14[i47] = i516;
                    iMax = Math.max(iMax, i516);
                    jArrCopyOf[i47] = ((long) i43) * j13;
                    iArr15[i47] = i3;
                    j14 += (long) iArr14[i47];
                    i43 += iMin2;
                    i47++;
                    i44 += i516;
                    i48 = i515 - iMin2;
                    i39 = i39;
                }
                int i517 = i39;
                i42 = i514 + 1;
                int i518 = i47;
                i45 = iMax;
                i38 = i513;
                i46 = i518;
                i39 = i517;
            }
            long j110 = j13 * ((long) i43);
            j5 = i44;
            zzakvVar2 = zzakvVarZzb2;
            arrayList = arrayList;
            j4 = j110;
            i17 = i41;
            iArr2 = iArr14;
            i18 = i45;
            r15 = iArr15;
        } else {
            jArr = new long[iZza];
            iArr = new int[iZza];
            zzerVar = zzerVar6;
            jArr2 = new long[iZza];
            zzerVar2 = zzerVar5;
            r6 = new int[iZza];
            zzajuVar = zzajyVar;
            i5 = iZzH3;
            i6 = iZzH7;
            iZzH4 = iZzH8;
            j = 0;
            j2 = 0;
            i7 = iZzH;
            iZzH5 = iZzH2;
            i8 = i2;
            iZzB = i8;
            i9 = iZzB;
            i10 = i9;
            iZzH6 = i10;
            j3 = 0;
            while (true) {
                if (i8 < iZza) {
                    zzakvVar2 = zzakvVarZzb2;
                    jArr3 = jArr;
                    CopyOf = r6;
                    iArrCopyOf = iArr;
                    jArrCopyOf = jArr2;
                    break;
                }
                r36 = i3;
                while (true) {
                    if (i10 == 0) {
                        zzakvVar2 = zzakvVarZzb2;
                        i19 = i10;
                        r37 = r36;
                        break;
                    }
                    zZza = zzajqVar.zza();
                    zzakvVar2 = zzakvVarZzb2;
                    if (zZza) {
                        i19 = i2;
                        r37 = zZza;
                        break;
                    }
                    j3 = zzajqVar.zzd;
                    i10 = zzajqVar.zzc;
                    zzakvVarZzb2 = zzakvVar2;
                    r36 = zZza;
                }
                if (r37 == 0) {
                    zzee.zzc("BoxParsers", "Unexpected end of chunk data");
                    long[] jArrCopyOf3 = Arrays.copyOf(jArr, i8);
                    iArrCopyOf = Arrays.copyOf(iArr, i8);
                    jArrCopyOf = Arrays.copyOf(jArr2, i8);
                    jArr3 = jArrCopyOf3;
                    CopyOf = Arrays.copyOf((int[]) r6, i8);
                    iZza = i8;
                    break;
                }
                if (zzerVar != null) {
                    while (iZzH6 == 0) {
                        if (i7 > 0) {
                            iZzH6 = i2;
                            break;
                        }
                        i7--;
                        iZzH6 = zzerVar.zzH();
                        iZzB = zzerVar.zzB();
                    }
                    iZzH6--;
                }
                iZzc = zzajuVar.zzc();
                long[] jArr18 = jArr2;
                int i519 = i19;
                long j111 = iZzc;
                j2 += j111;
                if (iZzc > i9) {
                    i9 = iZzc;
                }
                jArr[i8] = j3;
                iArr[i8] = iZzc;
                jArr18[i8] = j + ((long) iZzB);
                r6[i8] = r32;
                if (i8 == iZzH5) {
                    r6[i8] = i3;
                    arrayList.add(Integer.valueOf(i8));
                }
                if (zzerVar2 == null) {
                    i20 = i5;
                } else {
                    i20 = i5;
                }
                j += (long) iZzH9;
                iZzH4--;
                if (iZzH4 != 0) {
                    if (i6 > 0) {
                        i6--;
                        iZzH4 = zzerVar4.zzH();
                        iZzH9 = zzerVar4.zzB();
                    } else {
                        iZzH4 = i2;
                    }
                }
                j3 += j111;
                i10 = i519 - 1;
                i8++;
                i5 = i20;
                jArr2 = jArr18;
                zzakvVarZzb2 = zzakvVar2;
            }
            long j112 = j + ((long) iZzB);
            if (zzerVar != null) {
                i11 = i3;
                break;
            }
            while (true) {
                if (i7 > 0) {
                    i11 = i3;
                    break;
                }
                if (zzerVar.zzH() != 0) {
                    i11 = i2;
                    break;
                }
                zzerVar.zzB();
                i7--;
            }
            if (i5 == 0) {
                i11 = i11;
                iArrCopyOf = iArrCopyOf;
                arrayList = arrayList;
                i12 = i10;
                i13 = i6;
                i14 = iZzH6;
                i15 = iZzH4;
                i16 = i5;
            } else if (iZzH4 == 0) {
                if (i10 == 0) {
                    if (i6 == 0) {
                        i16 = i2;
                        i15 = i16;
                        i12 = i15;
                    } else if (iZzH6 == 0) {
                        i11 = i11;
                        iArrCopyOf = iArrCopyOf;
                        arrayList = arrayList;
                        i16 = i2;
                        i15 = i16;
                        i12 = i15;
                        i13 = i12;
                        i14 = iZzH6;
                    } else if (i11 == 0) {
                        iArrCopyOf = iArrCopyOf;
                        arrayList = arrayList;
                        i16 = i2;
                        i15 = i16;
                        i12 = i15;
                        i13 = i12;
                        i14 = i13;
                        i11 = i14;
                    } else {
                        iArrCopyOf = iArrCopyOf;
                        arrayList = arrayList;
                        zzakvVar2 = zzakvVar2;
                    }
                    i17 = iZza;
                    i18 = i9;
                    j4 = j112;
                    j5 = j2;
                    iArr2 = iArrCopyOf;
                    r15 = CopyOf;
                } else {
                    i16 = i2;
                    i15 = i16;
                    i12 = i10;
                }
                i13 = i6;
                i14 = iZzH6;
            } else {
                i11 = i11;
                iArrCopyOf = iArrCopyOf;
                arrayList = arrayList;
                i16 = i2;
                i12 = i10;
                i13 = i6;
                i14 = iZzH6;
                i15 = iZzH4;
            }
            int i67 = zzakvVar2.zza;
            int length5 = String.valueOf(i13).length() + String.valueOf(i12).length() + String.valueOf(i15).length() + String.valueOf(i16).length() + String.valueOf(i67).length() + 66 + 35 + 26 + 33 + 36;
            int length6 = String.valueOf(i14).length();
            if (i3 != i11) {
                str = ", ctts invalid";
            } else {
                str = "";
            }
            StringBuilder sb2 = new StringBuilder(str.length() + length5 + length6);
            androidx.datastore.preferences.protobuf.a.z(sb2, "Inconsistent stbl box for track ", i67, ": remainingSynchronizationSamples ", i16);
            androidx.datastore.preferences.protobuf.a.z(sb2, ", remainingSamplesAtTimestampDelta ", i15, ", remainingSamplesInChunk ", i12);
            androidx.datastore.preferences.protobuf.a.z(sb2, ", remainingTimestampDeltaChanges ", i13, ", remainingSamplesAtTimestampOffset ", i14);
            sb2.append(str);
            zzee.zzc("BoxParsers", sb2.toString());
            i17 = iZza;
            i18 = i9;
            j4 = j112;
            j5 = j2;
            iArr2 = iArrCopyOf;
            r15 = CopyOf;
        }
        jArr4 = jArr3;
        j6 = zzakvVar2.zzf;
        if (j6 > 0) {
            jZzt4 = zzfj.zzt(j5 * 8, 1000000L, j6, RoundingMode.HALF_DOWN);
            if (jZzt4 > 0) {
                zzakvVarZzb = zzakvVar2;
            } else {
                zzakvVarZzb = zzakvVar2;
            }
        } else {
            zzakvVarZzb = zzakvVar2;
        }
        j7 = zzakvVarZzb.zzc;
        RoundingMode roundingMode3 = RoundingMode.DOWN;
        jZzt = zzfj.zzt(j4, 1000000L, j7, roundingMode3);
        iArrZzf = zzgwx.zzf(arrayList);
        jArr5 = zzakvVarZzb.zzi;
        if (jArr5 == null) {
            zzfj.zzu(jArrCopyOf, 1000000L, j7);
            return new zzaky(zzakvVarZzb, jArr4, iArr2, i18, jArrCopyOf, r15, iArrZzf, r32, jZzt, i17);
        }
        r30 = r15;
        length = jArr5.length;
        if (length == 1) {
            if (zzakvVarZzb.zzb == 1) {
                j8 = j7;
            } else {
                j8 = j7;
            }
            i21 = 1;
        } else {
            i21 = length;
            j8 = j7;
        }
        if (i21 != 1) {
        }
        j9 = j8;
        jArr6 = jArr4;
        iArr3 = iArr2;
        i22 = i17;
        if (zzakvVarZzb.zzb == 1) {
            z4 = true;
        } else {
            z4 = false;
        }
        jArr7 = zzakvVarZzb.zzj;
        iArr4 = new int[i21];
        iArr5 = new int[i21];
        jArr7.getClass();
        i23 = 0;
        i24 = 0;
        z5 = false;
        i25 = 0;
        while (i23 < jArr5.length) {
            iArr10 = iArr4;
            i32 = i23;
            j12 = jArr7[i32];
            if (j12 != -1) {
                iArr12 = iArr10;
                long j28 = j9;
                j9 = j28;
                jZzt3 = zzfj.zzt(jArr5[i32], j28, zzakvVarZzb.zzd, RoundingMode.DOWN) + j12;
                iArr11 = iArr5;
                iArr12[i32] = zzfj.zzm(jArrCopyOf, j12, true, true);
                int iZzo2 = zzfj.zzo(jArrCopyOf, jZzt3, z4, false);
                i34 = iZzo2 - 1;
                i35 = 0;
                while (i33 < jArrCopyOf.length) {
                    if (jArrCopyOf[i33] < jZzt3) {
                        i35++;
                        if (i35 > zzakvVarZzb.zzg.zzq) {
                            break;
                            break;
                        }
                    } else {
                        i34 = i33;
                    }
                }
                iArr11[i32] = i34 + 1;
                i36 = iArr12[i32];
                while (true) {
                    i37 = iArr12[i32];
                    if (i37 <= 0) {
                        break;
                    }
                    break;
                    break;
                    iArr12[i32] = i37 - 1;
                }
                if (i37 == 0) {
                    z11 = false;
                    if ((r30[0] & 1) == 0) {
                        iArr12[i32] = i36;
                        while (true) {
                            i37 = iArr12[i32];
                            if (i37 >= iArr11[i32]) {
                                break;
                            }
                            break;
                            break;
                            iArr12[i32] = i37 + 1;
                        }
                    }
                } else {
                    z11 = false;
                }
                int i68 = iArr11[i32];
                int i69 = (i68 - i37) + i24;
                if (i25 != i37) {
                    z12 = true;
                } else {
                    z12 = z11;
                }
                i25 = i68;
                z5 = z12 | z5;
                i24 = i69;
            } else {
                iArr11 = iArr5;
                iArr12 = iArr10;
            }
            i23 = i32 + 1;
            iArr4 = iArr12;
            iArr5 = iArr11;
            z4 = z4;
            jArr6 = jArr6;
        }
        iArr6 = iArr5;
        iArr7 = iArr4;
        jArr8 = jArr6;
        if (i24 != i22) {
            z6 = true;
        } else {
            z6 = false;
        }
        z7 = z6 | z5;
        if (z7) {
            jArr9 = new long[i24];
        } else {
            jArr9 = jArr8;
        }
        if (z7) {
            iArr8 = new int[i24];
        } else {
            iArr8 = iArr3;
        }
        if (true == z7) {
            i18 = 0;
        }
        if (z7) {
            iArr9 = new int[i24];
        } else {
            r7 = r30;
        }
        if (z7) {
            r7 = iArr9;
            arrayList2 = new ArrayList();
        } else {
            r7 = iArr9;
            arrayList2 = arrayList;
        }
        jArr10 = new long[i24];
        i26 = 0;
        z8 = false;
        i27 = 0;
        j10 = 0;
        while (i26 < jArr5.length) {
            j11 = jArr7[i26];
            i28 = iArr7[i26];
            long[] jArr19 = jArr5;
            i29 = iArr6[i26];
            z9 = z7;
            if (z7) {
                int i610 = i29 - i28;
                jArr11 = jArr8;
                System.arraycopy(jArr11, i28, jArr9, i27, i610);
                System.arraycopy(iArr3, i28, iArr8, i27, i610);
                System.arraycopy(r30, i28, r7, i27, i610);
            } else {
                jArr11 = jArr8;
            }
            i30 = i18;
            while (i28 < i29) {
                long[] jArr110 = jArr11;
                int[] iArr18 = iArr8;
                long j29 = zzakvVarZzb.zzd;
                RoundingMode roundingMode4 = RoundingMode.DOWN;
                long jZzt10 = zzfj.zzt(j10, 1000000L, j29, roundingMode4);
                jZzt2 = zzfj.zzt(jArrCopyOf[i28] - j11, 1000000L, j9, roundingMode4);
                if (jZzt2 < 0) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                z8 = (!z10) | z8;
                jArr10[i27] = jZzt10 + jZzt2;
                if (z9) {
                    i30 = iArr3[i28];
                }
                if (z9) {
                    i31 = 1;
                } else {
                    i31 = 1;
                }
                i27 += i31;
                i28 += i31;
                jArr11 = jArr110;
                iArr8 = iArr18;
            }
            jArr8 = jArr11;
            j10 += jArr19[i26];
            i26++;
            i18 = i30;
            jArr5 = jArr19;
            jArr7 = jArr7;
            iArr8 = iArr8;
            z7 = z9;
        }
        int[] iArr19 = iArr8;
        long jZzt11 = zzfj.zzt(j10, 1000000L, zzakvVarZzb.zzd, RoundingMode.DOWN);
        if (z8) {
            zzt zztVarZza4 = zzakvVarZzb.zzg.zza();
            zztVarZza4.zzs(true);
            zzakvVarZzb = zzakvVarZzb.zzb(zztVarZza4.zzM());
        }
        return new zzaky(zzakvVarZzb, jArr9, iArr19, i18, jArr10, r7, zzgwx.zzf(arrayList2), r32, jZzt11, jArr9.length);
    }

    private static zzap zzh(zzer zzerVar) {
        short sZzv = zzerVar.zzv();
        zzerVar.zzk(2);
        String strZzK = zzerVar.zzK(sZzv, StandardCharsets.UTF_8);
        int iMax = Math.max(strZzK.lastIndexOf(43), strZzK.lastIndexOf(45));
        try {
            return new zzap(-9223372036854775807L, new zzfx(Float.parseFloat(strZzK.substring(0, iMax)), Float.parseFloat(strZzK.substring(iMax, strZzK.length() - 1))));
        } catch (IndexOutOfBoundsException | NumberFormatException unused) {
            return null;
        }
    }

    private static int zzi(zzer zzerVar) {
        zzerVar.zzh(16);
        return zzerVar.zzB();
    }

    private static String zzj(byte[] bArr, int i2, int i3) {
        zzgqa.zzi(bArr.length == 64);
        ArrayList arrayList = new ArrayList(16);
        for (int i4 = 0; i4 < bArr.length - 3; i4 += 4) {
            int iZze = zzgwx.zze(bArr[i4], bArr[i4 + 1], bArr[i4 + 2], bArr[i4 + 3]);
            String str = zzfj.zza;
            int i5 = ((iZze >> 8) & 255) - 128;
            int i6 = (iZze >> 16) & 255;
            int i7 = (iZze & 255) - 128;
            arrayList.add(String.format("%06x", Integer.valueOf(Math.max(0, Math.min(((i7 * 17790) / 10000) + i6, 255)) | (Math.max(0, Math.min(((i5 * 14075) / 10000) + i6, 255)) << 16) | (Math.max(0, Math.min((i6 - ((i7 * 3455) / 10000)) - ((i5 * 7169) / 10000), 255)) << 8))));
        }
        String strZzd = zzgpu.zzd(arrayList, ", ");
        StringBuilder sb = new StringBuilder(Z.d(strZzd, Z.d(String.valueOf(i3), String.valueOf(i2).length() + 7, 10), 1));
        sb.append("size: ");
        sb.append(i2);
        sb.append("x");
        sb.append(i3);
        return android.support.v4.media.a.s(sb, "\npalette: ", strZzd, IOUtils.LINE_SEPARATOR_UNIX);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0047 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:12:0x0049  */
    /* JADX WARN: Code duplicated, block: B:75:0x015e  */
    /* JADX WARN: Code duplicated, block: B:83:0x0178 A[PHI: r3
  0x0178: PHI (r3v5 int) = (r3v4 int), (r3v4 int), (r3v8 int) binds: [B:76:0x016a, B:77:0x016c, B:82:0x0177] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:88:0x0187  */
    private static zzi zzk(zzer zzerVar) {
        int i2;
        int iZzj;
        int iZzj2;
        zzh zzhVar = new zzh();
        byte[] bArrZzi = zzerVar.zzi();
        zzeq zzeqVar = new zzeq(bArrZzi, bArrZzi.length);
        zzeqVar.zzf(zzerVar.zzg() * 8);
        zzeqVar.zzo(1);
        int iZzj3 = zzeqVar.zzj(3);
        zzeqVar.zzh(6);
        boolean zZzi = zzeqVar.zzi();
        boolean zZzi2 = zzeqVar.zzi();
        boolean z2 = false;
        if (iZzj3 != 2) {
            if (iZzj3 <= 2) {
                i2 = true != zZzi ? 8 : 10;
                zzhVar.zze(i2);
                zzhVar.zzf(i2);
            }
        } else if (zZzi) {
            i2 = true == zZzi2 ? 12 : 10;
            zzhVar.zze(i2);
            zzhVar.zzf(i2);
        } else {
            zZzi = false;
            iZzj3 = 2;
            if (iZzj3 <= 2) {
                if (true != zZzi) {
                }
                zzhVar.zze(i2);
                zzhVar.zzf(i2);
            }
        }
        int i3 = 13;
        zzeqVar.zzh(13);
        zzeqVar.zzg();
        int iZzj4 = zzeqVar.zzj(4);
        if (iZzj4 != 1) {
            StringBuilder sb = new StringBuilder(String.valueOf(iZzj4).length() + 22);
            sb.append("Unsupported obu_type: ");
            sb.append(iZzj4);
            zzee.zzb("BoxParsers", sb.toString());
            return zzhVar.zzg();
        }
        if (zzeqVar.zzi()) {
            zzee.zzb("BoxParsers", "Unsupported obu_extension_flag");
            return zzhVar.zzg();
        }
        boolean zZzi3 = zzeqVar.zzi();
        zzeqVar.zzg();
        if (zZzi3 && zzeqVar.zzj(8) > 127) {
            zzee.zzb("BoxParsers", "Excessive obu_size");
            return zzhVar.zzg();
        }
        int iZzj5 = zzeqVar.zzj(3);
        zzeqVar.zzg();
        if (zzeqVar.zzi()) {
            zzee.zzb("BoxParsers", "Unsupported reduced_still_picture_header");
            return zzhVar.zzg();
        }
        if (zzeqVar.zzi()) {
            zzee.zzb("BoxParsers", "Unsupported timing_info_present_flag");
            return zzhVar.zzg();
        }
        if (zzeqVar.zzi()) {
            zzee.zzb("BoxParsers", "Unsupported initial_display_delay_present_flag");
            return zzhVar.zzg();
        }
        int iZzj6 = zzeqVar.zzj(5);
        for (int i4 = 0; i4 <= iZzj6; i4++) {
            zzeqVar.zzh(12);
            if (zzeqVar.zzj(5) > 7) {
                zzeqVar.zzg();
            }
        }
        int iZzj7 = zzeqVar.zzj(4);
        int iZzj8 = zzeqVar.zzj(4);
        zzeqVar.zzh(iZzj7 + 1);
        zzeqVar.zzh(iZzj8 + 1);
        if (zzeqVar.zzi()) {
            zzeqVar.zzh(7);
        }
        zzeqVar.zzh(7);
        boolean zZzi4 = zzeqVar.zzi();
        if (zZzi4) {
            zzeqVar.zzh(2);
        }
        if ((zzeqVar.zzi() || zzeqVar.zzj(1) > 0) && !zzeqVar.zzi()) {
            zzeqVar.zzh(1);
        }
        if (zZzi4) {
            zzeqVar.zzh(3);
        }
        zzeqVar.zzh(3);
        boolean zZzi5 = zzeqVar.zzi();
        if (iZzj5 != 2) {
            if (iZzj5 != 1) {
            }
            if (zzeqVar.zzi()) {
                int iZzj9 = zzeqVar.zzj(8);
                iZzj = zzeqVar.zzj(8);
                int iZzj10 = zzeqVar.zzj(8);
                if (!z2 || iZzj9 != 1) {
                    i3 = iZzj;
                    iZzj2 = zzeqVar.zzj(1);
                } else if (iZzj != 13) {
                    iZzj9 = 1;
                    i3 = iZzj;
                    iZzj2 = zzeqVar.zzj(1);
                } else if (iZzj10 == 0) {
                    iZzj2 = 1;
                    iZzj9 = 1;
                } else {
                    iZzj9 = 1;
                    iZzj2 = zzeqVar.zzj(1);
                }
                zzhVar.zza(zzi.zzb(iZzj9));
                zzhVar.zzb(iZzj2 != 1 ? 2 : 1);
                zzhVar.zzc(zzi.zzc(i3));
            }
            return zzhVar.zzg();
        }
        if (zZzi5) {
            zzeqVar.zzg();
        }
        if (zzeqVar.zzi()) {
            z2 = true;
        }
        if (zzeqVar.zzi()) {
            int iZzj11 = zzeqVar.zzj(8);
            iZzj = zzeqVar.zzj(8);
            int iZzj12 = zzeqVar.zzj(8);
            if (!z2) {
                i3 = iZzj;
                iZzj2 = zzeqVar.zzj(1);
            } else {
                i3 = iZzj;
                iZzj2 = zzeqVar.zzj(1);
            }
            zzhVar.zza(zzi.zzb(iZzj11));
            zzhVar.zzb(iZzj2 != 1 ? 2 : 1);
            zzhVar.zzc(zzi.zzc(i3));
        }
        return zzhVar.zzg();
    }

    private static zzi zzl(zzer zzerVar) {
        zzh zzhVar = new zzh();
        byte[] bArrZzi = zzerVar.zzi();
        zzeq zzeqVar = new zzeq(bArrZzi, bArrZzi.length);
        zzeqVar.zzf(zzerVar.zzg() * 8);
        zzeqVar.zzo(1);
        int iZzj = zzeqVar.zzj(8);
        for (int i2 = 0; i2 < iZzj; i2++) {
            zzeqVar.zzo(1);
            int iZzj2 = zzeqVar.zzj(8);
            for (int i3 = 0; i3 < iZzj2; i3++) {
                zzeqVar.zzh(6);
                boolean zZzi = zzeqVar.zzi();
                zzeqVar.zzg();
                zzeqVar.zzo(11);
                zzeqVar.zzh(4);
                int iZzj3 = zzeqVar.zzj(4) + 8;
                zzhVar.zze(iZzj3);
                zzhVar.zzf(iZzj3);
                zzeqVar.zzo(1);
                if (zZzi) {
                    int iZzj4 = zzeqVar.zzj(8);
                    int iZzj5 = zzeqVar.zzj(8);
                    zzeqVar.zzo(1);
                    boolean zZzi2 = zzeqVar.zzi();
                    zzhVar.zza(zzi.zzb(iZzj4));
                    zzhVar.zzb(true != zZzi2 ? 2 : 1);
                    zzhVar.zzc(zzi.zzc(iZzj5));
                }
            }
        }
        return zzhVar.zzg();
    }

    private static ByteBuffer zzm() {
        return ByteBuffer.allocate(25).order(ByteOrder.LITTLE_ENDIAN);
    }

    private static Pair zzn(zzfu zzfuVar) {
        zzfv zzfvVarZzc = zzfuVar.zzc(1701606260);
        if (zzfvVarZzc == null) {
            return null;
        }
        zzer zzerVar = zzfvVarZzc.zza;
        zzerVar.zzh(8);
        int iZza = zza(zzerVar.zzB());
        int iZzH = zzerVar.zzH();
        long[] jArr = new long[iZzH];
        long[] jArr2 = new long[iZzH];
        for (int i2 = 0; i2 < iZzH; i2++) {
            jArr[i2] = iZza == 1 ? zzerVar.zzJ() : zzerVar.zzz();
            jArr2[i2] = iZza == 1 ? zzerVar.zzD() : zzerVar.zzB();
            if (zzerVar.zzv() != 1) {
                throw new IllegalArgumentException("Unsupported media rate.");
            }
            zzerVar.zzk(2);
        }
        return Pair.create(jArr, jArr2);
    }

    /* JADX WARN: Code duplicated, block: B:137:0x01f4  */
    /* JADX WARN: Code duplicated, block: B:139:0x01fd  */
    /* JADX WARN: Code duplicated, block: B:140:0x01ff  */
    /* JADX WARN: Code duplicated, block: B:143:0x020e  */
    /* JADX WARN: Code duplicated, block: B:145:0x0224  */
    /* JADX WARN: Code duplicated, block: B:146:0x0233  */
    /* JADX WARN: Code duplicated, block: B:149:0x0251  */
    /* JADX WARN: Code duplicated, block: B:153:0x0265  */
    /* JADX WARN: Code duplicated, block: B:154:0x0270  */
    /* JADX WARN: Code duplicated, block: B:156:0x0278  */
    /* JADX WARN: Code duplicated, block: B:158:0x0283  */
    /* JADX WARN: Code duplicated, block: B:160:0x028a  */
    /* JADX WARN: Code duplicated, block: B:161:0x028f  */
    /* JADX WARN: Code duplicated, block: B:164:0x02a3  */
    /* JADX WARN: Code duplicated, block: B:166:0x02a8  */
    /* JADX WARN: Code duplicated, block: B:189:0x0303  */
    /* JADX WARN: Code duplicated, block: B:191:0x030a  */
    /* JADX WARN: Code duplicated, block: B:193:0x030f  */
    /* JADX WARN: Code duplicated, block: B:194:0x031f  */
    /* JADX WARN: Code duplicated, block: B:196:0x0324  */
    /* JADX WARN: Code duplicated, block: B:197:0x0334  */
    /* JADX WARN: Code duplicated, block: B:199:0x0339  */
    /* JADX WARN: Code duplicated, block: B:200:0x0349  */
    /* JADX WARN: Code duplicated, block: B:202:0x034e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:203:0x0350  */
    /* JADX WARN: Code duplicated, block: B:206:0x037a  */
    /* JADX WARN: Code duplicated, block: B:210:0x0385  */
    /* JADX WARN: Code duplicated, block: B:258:0x0577 A[PHI: r8 r11 r14 r19 r22 r31 r34 r37
  0x0577: PHI (r8v52 java.lang.String) = 
  (r8v51 java.lang.String)
  (r8v51 java.lang.String)
  (r8v51 java.lang.String)
  (r8v51 java.lang.String)
  (r8v56 java.lang.String)
  (r8v51 java.lang.String)
 binds: [B:282:0x0600, B:280:0x05d0, B:279:0x05cd, B:277:0x05c8, B:278:0x05ca, B:257:0x056f] A[DONT_GENERATE, DONT_INLINE]
  0x0577: PHI (r11v13 int) = (r11v14 int), (r11v24 int), (r11v28 int), (r11v29 int), (r11v29 int), (r11v32 int) binds: [B:282:0x0600, B:280:0x05d0, B:279:0x05cd, B:277:0x05c8, B:278:0x05ca, B:257:0x056f] A[DONT_GENERATE, DONT_INLINE]
  0x0577: PHI (r14v7 java.util.List) = 
  (r14v6 java.util.List)
  (r14v6 java.util.List)
  (r14v6 java.util.List)
  (r14v6 java.util.List)
  (r14v6 java.util.List)
  (r14v22 java.util.List)
 binds: [B:282:0x0600, B:280:0x05d0, B:279:0x05cd, B:277:0x05c8, B:278:0x05ca, B:257:0x056f] A[DONT_GENERATE, DONT_INLINE]
  0x0577: PHI (r19v1 java.lang.String) = 
  (r19v2 java.lang.String)
  (r19v3 java.lang.String)
  (r19v4 java.lang.String)
  (r19v4 java.lang.String)
  (r19v4 java.lang.String)
  (r19v5 java.lang.String)
 binds: [B:282:0x0600, B:280:0x05d0, B:279:0x05cd, B:277:0x05c8, B:278:0x05ca, B:257:0x056f] A[DONT_GENERATE, DONT_INLINE]
  0x0577: PHI (r22v9 int) = (r22v8 int), (r22v8 int), (r22v8 int), (r22v10 int), (r22v10 int), (r22v8 int) binds: [B:282:0x0600, B:280:0x05d0, B:279:0x05cd, B:277:0x05c8, B:278:0x05ca, B:257:0x056f] A[DONT_GENERATE, DONT_INLINE]
  0x0577: PHI (r31v2 java.lang.String) = 
  (r31v1 java.lang.String)
  (r31v1 java.lang.String)
  (r31v1 java.lang.String)
  (r31v1 java.lang.String)
  (r31v1 java.lang.String)
  (r31v7 java.lang.String)
 binds: [B:282:0x0600, B:280:0x05d0, B:279:0x05cd, B:277:0x05c8, B:278:0x05ca, B:257:0x056f] A[DONT_GENERATE, DONT_INLINE]
  0x0577: PHI (r34v1 int) = (r34v2 int), (r34v3 int), (r34v3 int), (r34v3 int), (r34v3 int), (r34v3 int) binds: [B:282:0x0600, B:280:0x05d0, B:279:0x05cd, B:277:0x05c8, B:278:0x05ca, B:257:0x056f] A[DONT_GENERATE, DONT_INLINE]
  0x0577: PHI (r37v1 int) = (r37v2 int), (r37v3 int), (r37v4 int), (r37v4 int), (r37v4 int), (r37v5 int) binds: [B:282:0x0600, B:280:0x05d0, B:279:0x05cd, B:277:0x05c8, B:278:0x05ca, B:257:0x056f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:281:0x05f0  */
    /* JADX WARN: Code duplicated, block: B:283:0x0602  */
    /* JADX WARN: Code duplicated, block: B:285:0x0610  */
    /* JADX WARN: Code duplicated, block: B:287:0x0618  */
    /* JADX WARN: Code duplicated, block: B:290:0x0628  */
    /* JADX WARN: Code duplicated, block: B:292:0x0630 A[LOOP:2: B:288:0x0622->B:292:0x0630, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:29:0x008b  */
    /* JADX WARN: Code duplicated, block: B:302:0x0675  */
    /* JADX WARN: Code duplicated, block: B:304:0x067e  */
    /* JADX WARN: Code duplicated, block: B:305:0x0689  */
    /* JADX WARN: Code duplicated, block: B:307:0x0692  */
    /* JADX WARN: Code duplicated, block: B:320:0x0359 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:326:0x0639 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:327:0x063b A[EDGE_INSN: B:327:0x063b->B:294:0x063b BREAK  A[LOOP:2: B:288:0x0622->B:292:0x0630], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:88:0x0165  */
    private static void zzo(zzer zzerVar, int i2, int i3, int i4, int i5, String str, boolean z2, zzq zzqVar, zzajw zzajwVar, int i6) throws zzat {
        int i7;
        int i8;
        int iZzt;
        int iZzB;
        int i9;
        int i10;
        String str2;
        List listZzj;
        zzajr zzajrVarZzp;
        zzajp zzajpVarZzq;
        String str3;
        int iZzB2;
        boolean z3;
        int iZzB3;
        String str4;
        int i11;
        int iZzg;
        int i12;
        String strZza;
        byte[] bArrZzb;
        String str5;
        zzer zzerVar2;
        int i13;
        int i14;
        int i15;
        int i16;
        int iZzz;
        int i17;
        int iZzs;
        byte[] bArr;
        int iZzs2;
        String str6;
        byte[] bArr2;
        int i18 = i2;
        int i19 = i4;
        zzq zzqVarZzb = zzqVar;
        String str7 = "childAtomSize must be positive";
        zzerVar.zzh(i3 + 16);
        if (z2) {
            int iZzt2 = zzerVar.zzt();
            zzerVar.zzk(6);
            i7 = iZzt2;
        } else {
            zzerVar.zzk(8);
            i7 = 0;
        }
        int i20 = 268435456;
        if (i7 == 0 || i7 == 1) {
            i8 = 2;
            iZzt = zzerVar.zzt();
            zzerVar.zzk(6);
            int iZzF = zzerVar.zzF();
            zzerVar.zzh(zzerVar.zzg() - 4);
            iZzB = zzerVar.zzB();
            if (i7 == 1) {
                zzerVar.zzk(16);
            }
            i9 = iZzF;
            i10 = -1;
        } else {
            if (i7 != 2) {
                return;
            }
            zzerVar.zzk(16);
            int iRound = (int) Math.round(Double.longBitsToDouble(zzerVar.zzD()));
            int iZzH = zzerVar.zzH();
            zzerVar.zzk(4);
            i8 = 2;
            int iZzH2 = zzerVar.zzH();
            int iZzH3 = zzerVar.zzH();
            int i21 = iZzH3 & 1;
            int i22 = iZzH3 & 2;
            if (i21 == 0) {
                if (iZzH2 == 8) {
                    i10 = 3;
                } else if (iZzH2 == 16) {
                    i10 = i22 != 0 ? 268435456 : 2;
                } else if (iZzH2 == 24) {
                    i10 = i22 != 0 ? 1342177280 : 21;
                } else if (iZzH2 == 32) {
                    i10 = i22 != 0 ? 1610612736 : 22;
                } else {
                    i10 = -1;
                }
            } else if (iZzH2 == 32) {
                i10 = 4;
            } else {
                i10 = -1;
            }
            zzerVar.zzk(8);
            i9 = iRound;
            iZzt = iZzH;
            iZzB = 0;
        }
        if (i18 == 1767992678) {
            iZzt = -1;
            i9 = -1;
        } else {
            if (i18 == 1935764850) {
                i9 = 8000;
            } else if (i18 == 1935767394) {
                i9 = 16000;
                i18 = 1935767394;
            }
            iZzt = 1;
        }
        int iZzg2 = zzerVar.zzg();
        int iIntValue = 1701733217;
        if (i18 == 1701733217) {
            Pair pairZzr = zzr(zzerVar, i3, i19);
            if (pairZzr != null) {
                iIntValue = ((Integer) pairZzr.first).intValue();
                zzqVarZzb = zzqVarZzb == null ? null : zzqVarZzb.zzb(((zzakw) pairZzr.second).zzb);
                zzajwVar.zza[i6] = (zzakw) pairZzr.second;
            }
            i18 = iIntValue;
            zzerVar.zzh(iZzg2);
        }
        String str8 = "audio/mhm1";
        if (i18 == 1633889587) {
            str2 = "audio/ac3";
        } else if (i18 == 1700998451) {
            str2 = "audio/eac3";
        } else if (i18 == 1633889588) {
            str2 = "audio/ac4";
        } else if (i18 == 1685353315) {
            str2 = "audio/vnd.dts";
        } else if (i18 == 1685353320 || i18 == 1685353324) {
            str2 = "audio/vnd.dts.hd";
        } else if (i18 == 1685353317) {
            str2 = "audio/vnd.dts.hd;profile=lbr";
        } else if (i18 == 1685353336) {
            str2 = "audio/vnd.dts.uhd;profile=p2";
        } else if (i18 == 1935764850) {
            str2 = "audio/3gpp";
        } else {
            if (i18 != 1935767394) {
                if (i18 == 1936684916) {
                    i20 = i8;
                    str2 = "audio/raw";
                } else if (i18 == 1953984371) {
                    str2 = "audio/raw";
                } else if (i18 == 1819304813) {
                    if (i10 == -1) {
                        i20 = i8;
                    } else {
                        i20 = i10;
                    }
                    str2 = "audio/raw";
                } else if (i18 == 778924082 || i18 == 778924083) {
                    str2 = "audio/mpeg";
                } else if (i18 == 1835557169) {
                    str2 = "audio/mha1";
                } else if (i18 == 1835560241) {
                    i20 = i10;
                    str2 = "audio/mhm1";
                } else if (i18 == 1634492771) {
                    str2 = "audio/alac";
                } else if (i18 == 1634492791) {
                    str2 = "audio/g711-alaw";
                } else if (i18 == 1970037111) {
                    str2 = "audio/g711-mlaw";
                } else if (i18 == 1332770163) {
                    str2 = "audio/opus";
                } else if (i18 == 1716281667) {
                    str2 = "audio/flac";
                } else if (i18 == 1835823201) {
                    str2 = "audio/true-hd";
                } else if (i18 == 1767992678) {
                    str2 = "audio/iamf";
                    i18 = 1767992678;
                } else {
                    i20 = i10;
                    str2 = null;
                }
                listZzj = null;
                zzajrVarZzp = null;
                zzajpVarZzq = null;
                str3 = null;
                while (iZzg2 - i3 < i19) {
                    zzerVar.zzh(iZzg2);
                    iZzB2 = zzerVar.zzB();
                    if (iZzB2 > 0) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    zzaes.zza(z3, str7);
                    iZzB3 = zzerVar.zzB();
                    i9 = i9;
                    if (iZzB3 == 1835557187) {
                        zzerVar.zzh(iZzg2 + 8);
                        zzerVar.zzk(1);
                        iZzs2 = zzerVar.zzs();
                        zzerVar.zzk(1);
                        if (Objects.equals(str2, str8)) {
                            str6 = String.format("mhm1.%02X", Integer.valueOf(iZzs2));
                        } else {
                            str6 = String.format("mha1.%02X", Integer.valueOf(iZzs2));
                        }
                        int iZzt3 = zzerVar.zzt();
                        str3 = str6;
                        bArr2 = new byte[iZzt3];
                        str4 = str8;
                        zzerVar.zzm(bArr2, 0, iZzt3);
                        if (listZzj == null) {
                            listZzj = zzgtd.zzj(bArr2);
                        } else {
                            listZzj = zzgtd.zzk(bArr2, (byte[]) listZzj.get(0));
                        }
                    } else {
                        str4 = str8;
                        if (iZzB3 == 1835557200) {
                            zzerVar.zzh(iZzg2 + 8);
                            iZzs = zzerVar.zzs();
                            if (iZzs > 0) {
                                bArr = new byte[iZzs];
                                zzerVar.zzm(bArr, 0, iZzs);
                                if (listZzj == null) {
                                    listZzj = zzgtd.zzj(bArr);
                                } else {
                                    listZzj = zzgtd.zzk((byte[]) listZzj.get(0), bArr);
                                    i11 = iZzB2;
                                }
                            }
                        } else {
                            if (iZzB3 != 1702061171) {
                                if (!z2 && iZzB3 == 2002876005) {
                                    iZzg = zzerVar.zzg();
                                    zzaes.zza(iZzg >= iZzg2, null);
                                    while (true) {
                                        if (iZzg - iZzg2 >= iZzB2) {
                                            i11 = iZzB2;
                                            i12 = -1;
                                            iZzg = -1;
                                            break;
                                        }
                                        zzerVar.zzh(iZzg);
                                        int iZzB4 = zzerVar.zzB();
                                        zzaes.zza(iZzB4 > 0, str7);
                                        i11 = iZzB2;
                                        if (zzerVar.zzB() == 1702061171) {
                                            i12 = -1;
                                            break;
                                        } else {
                                            iZzg += iZzB4;
                                            iZzB2 = i11;
                                        }
                                    }
                                } else {
                                    i11 = iZzB2;
                                    if (iZzB3 == 1651798644) {
                                        zzajpVarZzq = zzq(zzerVar, iZzg2);
                                    } else if (iZzB3 == 1684103987) {
                                        zzerVar.zzh(iZzg2 + 8);
                                        zzajwVar.zzb = zzadp.zza(zzerVar, Integer.toString(i5), str, zzqVarZzb);
                                    } else if (iZzB3 == 1684366131) {
                                        zzerVar.zzh(iZzg2 + 8);
                                        zzajwVar.zzb = zzadp.zzb(zzerVar, Integer.toString(i5), str, zzqVarZzb);
                                    } else if (iZzB3 == 1684103988) {
                                        zzerVar.zzh(iZzg2 + 8);
                                        zzajwVar.zzb = zzads.zza(zzerVar, Integer.toString(i5), str, zzqVarZzb);
                                    } else if (iZzB3 == 1684892784) {
                                        if (iZzB > 0) {
                                            StringBuilder sb = new StringBuilder(String.valueOf(iZzB).length() + 49);
                                            sb.append("Invalid sample rate for Dolby TrueHD MLP stream: ");
                                            sb.append(iZzB);
                                            throw zzat.zzb(sb.toString(), null);
                                        }
                                        i9 = iZzB;
                                        iZzB = i9;
                                        iZzt = i8;
                                    } else if (iZzB3 != 1684305011 || iZzB3 == 1969517683) {
                                        iZzB = iZzB;
                                        str7 = str7;
                                        zzt zztVar = new zzt();
                                        zztVar.zzb(i5);
                                        zztVar.zzm(str2);
                                        zztVar.zzE(iZzt);
                                        i9 = i9;
                                        zztVar.zzF(i9);
                                        zztVar.zzq(zzqVarZzb);
                                        zztVar.zze(str);
                                        zzajwVar.zzb = zztVar.zzM();
                                    } else if (iZzB3 == 1682927731) {
                                        int i23 = i11 - 8;
                                        byte[] bArr3 = zzb;
                                        int length = bArr3.length;
                                        byte[] bArrCopyOf = Arrays.copyOf(bArr3, length + i23);
                                        zzerVar.zzh(iZzg2 + 8);
                                        zzerVar.zzm(bArrCopyOf, length, i23);
                                        listZzj = zzafn.zza(bArrCopyOf);
                                    } else if (iZzB3 == 1684425825) {
                                        byte[] bArr4 = new byte[i11 - 8];
                                        bArr4[0] = 102;
                                        bArr4[1] = 76;
                                        bArr4[i8] = 97;
                                        bArr4[3] = 67;
                                        zzerVar.zzh(iZzg2 + 12);
                                        zzerVar.zzm(bArr4, 4, i11 - 12);
                                        listZzj = zzgtd.zzj(bArr4);
                                    } else if (iZzB3 == 1634492771) {
                                        int i24 = i11 - 12;
                                        byte[] bArr5 = new byte[i24];
                                        zzerVar.zzh(iZzg2 + 12);
                                        zzerVar.zzm(bArr5, 0, i24);
                                        int i25 = zzdo.zza;
                                        zzer zzerVar3 = new zzer(bArr5);
                                        zzerVar3.zzh(5);
                                        int iZzs3 = zzerVar3.zzs();
                                        zzerVar3.zzh(9);
                                        int iZzs4 = zzerVar3.zzs();
                                        zzerVar3.zzh(20);
                                        int[] iArr = {zzerVar3.zzH(), iZzs4, iZzs3};
                                        int i26 = iArr[0];
                                        int i27 = iArr[1];
                                        int iZzz2 = zzfj.zzz(iZzs3, ByteOrder.LITTLE_ENDIAN);
                                        listZzj = zzgtd.zzj(bArr5);
                                        i9 = i26;
                                        iZzB = iZzB;
                                        i20 = iZzz2;
                                        str7 = str7;
                                        iZzt = i27;
                                    } else if (iZzB3 == 1767990114) {
                                        zzerVar.zzh(iZzg2 + 9);
                                        int iZza = zzgwx.zza(zzerVar.zzP());
                                        byte[] bArr6 = new byte[iZza];
                                        zzerVar.zzm(bArr6, 0, iZza);
                                        int i28 = zzdo.zza;
                                        zzer zzerVar4 = new zzer(bArr6);
                                        String str9 = null;
                                        String str10 = null;
                                        while (zzerVar4.zzd() > 0 && (str10 == null || str9 == null)) {
                                            int iZzs5 = zzerVar4.zzs();
                                            int i29 = iZzs5 >> 3;
                                            int i30 = iZzs5 & 2;
                                            int i31 = iZzs5 & 1;
                                            int iZza2 = zzgwx.zza(zzerVar4.zzP());
                                            int i32 = iZzB;
                                            if (i29 > 4 && i29 < 24 && i30 != 0) {
                                                zzerVar4.zzQ();
                                                zzerVar4.zzQ();
                                            }
                                            if (i31 != 0) {
                                                zzerVar4.zzk(zzgwx.zza(zzerVar4.zzP()));
                                            }
                                            int iZzg3 = zzerVar4.zzg() + iZza2;
                                            byte[] bArr7 = bArr6;
                                            if (i29 == 31) {
                                                zzerVar4.zzk(4);
                                                Object[] objArr = {Integer.valueOf(zzerVar4.zzs()), Integer.valueOf(zzerVar4.zzs())};
                                                String str11 = zzfj.zza;
                                                str10 = String.format(Locale.US, "iamf.%03X.%03X", objArr);
                                            } else {
                                                if (i29 == 0) {
                                                    zzerVar4.zzQ();
                                                    String strZzK = zzerVar4.zzK(4, StandardCharsets.UTF_8);
                                                    if (strZzK.equals("mp4a")) {
                                                        zzerVar4.zzQ();
                                                        zzerVar4.zzk(i8);
                                                        zzeq zzeqVar = new zzeq();
                                                        zzeqVar.zza(zzerVar4);
                                                        int iZzj = zzeqVar.zzj(5);
                                                        if (iZzj == 31) {
                                                            iZzj = zzeqVar.zzj(6) + 32;
                                                        }
                                                        StringBuilder sb2 = new StringBuilder(strZzK.length() + 4 + String.valueOf(iZzj).length());
                                                        sb2.append(strZzK);
                                                        sb2.append(".40.");
                                                        sb2.append(iZzj);
                                                        strZzK = sb2.toString();
                                                    }
                                                    str9 = strZzK;
                                                }
                                                zzerVar4.zzh(iZzg3);
                                                str7 = str7;
                                                bArr6 = bArr7;
                                                iZzB = i32;
                                                i8 = 2;
                                            }
                                            str7 = str7;
                                            zzerVar4.zzh(iZzg3);
                                            str7 = str7;
                                            bArr6 = bArr7;
                                            iZzB = i32;
                                            i8 = 2;
                                        }
                                        iZzB = iZzB;
                                        byte[] bArr8 = bArr6;
                                        str7 = str7;
                                        String strS = (str10 == null || str9 == null) ? null : android.support.v4.media.a.s(new StringBuilder(str10.length() + 1 + str9.length()), str10, mo.ono, str9);
                                        listZzj = zzgtd.zzj(bArr8);
                                        i9 = i9;
                                        str3 = strS;
                                    } else {
                                        iZzB = iZzB;
                                        str7 = str7;
                                        if (iZzB3 == 1885564227) {
                                            zzerVar.zzh(iZzg2 + 12);
                                            ByteOrder byteOrder = (zzerVar.zzs() & 1) != 0 ? ByteOrder.LITTLE_ENDIAN : ByteOrder.BIG_ENDIAN;
                                            int iZzs6 = zzerVar.zzs();
                                            if (i18 == 1768973165) {
                                                iZzz = zzfj.zzz(iZzs6, byteOrder);
                                                i17 = -1;
                                            } else {
                                                iZzz = (i18 == 1718641517 && iZzs6 == 32 && byteOrder.equals(ByteOrder.LITTLE_ENDIAN)) ? 4 : i20;
                                                i17 = -1;
                                            }
                                            i9 = i9;
                                            i20 = iZzz;
                                            if (iZzz != i17) {
                                                str2 = "audio/raw";
                                            }
                                        } else {
                                            i9 = i9;
                                        }
                                    }
                                }
                                iZzg2 += i11;
                                i19 = i4;
                                str7 = str7;
                                str8 = str4;
                                iZzB = iZzB;
                                i8 = 2;
                            } else {
                                i9 = i9;
                                i11 = iZzB2;
                                iZzB = iZzB;
                                str7 = str7;
                                iZzg = iZzg2;
                                i12 = -1;
                            }
                            if (iZzg != i12) {
                                zzajrVarZzp = zzp(zzerVar, iZzg);
                                strZza = zzajrVarZzp.zza();
                                bArrZzb = zzajrVarZzp.zzb();
                                if (bArrZzb != null) {
                                    if ("audio/vorbis".equals(strZza)) {
                                        zzerVar2 = new zzer(bArrZzb);
                                        i13 = 1;
                                        zzerVar2.zzk(1);
                                        i14 = 0;
                                        while (true) {
                                            if (zzerVar2.zzd() > 0) {
                                                i15 = 255;
                                                break;
                                            }
                                            i15 = 255;
                                            if (zzerVar2.zzn() == 255) {
                                                break;
                                            }
                                            zzerVar2.zzk(i13);
                                            i14 += 255;
                                            i13 = 1;
                                        }
                                        int iZzs7 = zzerVar2.zzs() + i14;
                                        i16 = 0;
                                        while (zzerVar2.zzd() > 0 && zzerVar2.zzn() == i15) {
                                            zzerVar2.zzk(1);
                                            i16 += i15;
                                        }
                                        int iZzs8 = zzerVar2.zzs() + i16;
                                        byte[] bArr9 = new byte[iZzs7];
                                        int iZzg4 = zzerVar2.zzg();
                                        System.arraycopy(bArrZzb, iZzg4, bArr9, 0, iZzs7);
                                        int i33 = iZzg4 + iZzs7 + iZzs8;
                                        int length2 = bArrZzb.length - i33;
                                        byte[] bArr10 = new byte[length2];
                                        System.arraycopy(bArrZzb, i33, bArr10, 0, length2);
                                        listZzj = zzgtd.zzk(bArr9, bArr10);
                                    } else {
                                        if ("audio/mp4a-latm".equals(strZza)) {
                                            zzadm zzadmVarZza = zzadn.zza(bArrZzb);
                                            i9 = zzadmVarZza.zza;
                                            iZzt = zzadmVarZza.zzb;
                                            str5 = zzadmVarZza.zzc;
                                        } else {
                                            str5 = str3;
                                        }
                                        listZzj = zzgtd.zzj(bArrZzb);
                                        str3 = str5;
                                    }
                                    str2 = strZza;
                                } else {
                                    str2 = strZza;
                                }
                                iZzg2 += i11;
                                i19 = i4;
                                str7 = str7;
                                str8 = str4;
                                iZzB = iZzB;
                                i8 = 2;
                            }
                            iZzg2 += i11;
                            i19 = i4;
                            str7 = str7;
                            str8 = str4;
                            iZzB = iZzB;
                            i8 = 2;
                        }
                        iZzB = iZzB;
                        iZzg2 += i11;
                        i19 = i4;
                        str7 = str7;
                        str8 = str4;
                        iZzB = iZzB;
                        i8 = 2;
                    }
                    i9 = i9;
                    i11 = iZzB2;
                    iZzB = iZzB;
                    str7 = str7;
                    iZzg2 += i11;
                    i19 = i4;
                    str7 = str7;
                    str8 = str4;
                    iZzB = iZzB;
                    i8 = 2;
                }
                if (zzajwVar.zzb == null || str2 == null) {
                }
                zzt zztVar2 = new zzt();
                zztVar2.zzb(i5);
                zztVar2.zzm(str2);
                zztVar2.zzj(str3);
                zztVar2.zzE(iZzt);
                zztVar2.zzF(i9);
                zztVar2.zzG(i20);
                zztVar2.zzp(listZzj);
                zztVar2.zzq(zzqVarZzb);
                zztVar2.zze(str);
                if (zzajrVarZzp != null) {
                    zztVar2.zzh(zzgwx.zzb(zzajrVarZzp.zzc()));
                    zztVar2.zzi(zzgwx.zzb(zzajrVarZzp.zzd()));
                } else if (zzajpVarZzq != null) {
                    zztVar2.zzh(zzgwx.zzb(zzajpVarZzq.zza()));
                    zztVar2.zzi(zzgwx.zzb(zzajpVarZzq.zzb()));
                }
                zzajwVar.zzb = zztVar2.zzM();
                return;
            }
            str2 = "audio/amr-wb";
        }
        i20 = i10;
        listZzj = null;
        zzajrVarZzp = null;
        zzajpVarZzq = null;
        str3 = null;
        while (iZzg2 - i3 < i19) {
            zzerVar.zzh(iZzg2);
            iZzB2 = zzerVar.zzB();
            if (iZzB2 > 0) {
                z3 = true;
            } else {
                z3 = false;
            }
            zzaes.zza(z3, str7);
            iZzB3 = zzerVar.zzB();
            i9 = i9;
            if (iZzB3 == 1835557187) {
                zzerVar.zzh(iZzg2 + 8);
                zzerVar.zzk(1);
                iZzs2 = zzerVar.zzs();
                zzerVar.zzk(1);
                if (Objects.equals(str2, str8)) {
                    str6 = String.format("mhm1.%02X", Integer.valueOf(iZzs2));
                } else {
                    str6 = String.format("mha1.%02X", Integer.valueOf(iZzs2));
                }
                int iZzt4 = zzerVar.zzt();
                str3 = str6;
                bArr2 = new byte[iZzt4];
                str4 = str8;
                zzerVar.zzm(bArr2, 0, iZzt4);
                if (listZzj == null) {
                    listZzj = zzgtd.zzj(bArr2);
                } else {
                    listZzj = zzgtd.zzk(bArr2, (byte[]) listZzj.get(0));
                }
            } else {
                str4 = str8;
                if (iZzB3 == 1835557200) {
                    zzerVar.zzh(iZzg2 + 8);
                    iZzs = zzerVar.zzs();
                    if (iZzs > 0) {
                        bArr = new byte[iZzs];
                        zzerVar.zzm(bArr, 0, iZzs);
                        if (listZzj == null) {
                            listZzj = zzgtd.zzj(bArr);
                        } else {
                            listZzj = zzgtd.zzk((byte[]) listZzj.get(0), bArr);
                            i11 = iZzB2;
                        }
                    }
                } else {
                    if (iZzB3 != 1702061171) {
                        if (!z2) {
                        }
                        i11 = iZzB2;
                        if (iZzB3 == 1651798644) {
                            zzajpVarZzq = zzq(zzerVar, iZzg2);
                        } else if (iZzB3 == 1684103987) {
                            zzerVar.zzh(iZzg2 + 8);
                            zzajwVar.zzb = zzadp.zza(zzerVar, Integer.toString(i5), str, zzqVarZzb);
                        } else if (iZzB3 == 1684366131) {
                            zzerVar.zzh(iZzg2 + 8);
                            zzajwVar.zzb = zzadp.zzb(zzerVar, Integer.toString(i5), str, zzqVarZzb);
                        } else if (iZzB3 == 1684103988) {
                            zzerVar.zzh(iZzg2 + 8);
                            zzajwVar.zzb = zzads.zza(zzerVar, Integer.toString(i5), str, zzqVarZzb);
                        } else {
                            if (iZzB3 == 1684892784) {
                                if (iZzB > 0) {
                                    StringBuilder sb3 = new StringBuilder(String.valueOf(iZzB).length() + 49);
                                    sb3.append("Invalid sample rate for Dolby TrueHD MLP stream: ");
                                    sb3.append(iZzB);
                                    throw zzat.zzb(sb3.toString(), null);
                                }
                                i9 = iZzB;
                                iZzB = i9;
                                iZzt = i8;
                            } else if (iZzB3 != 1684305011) {
                                iZzB = iZzB;
                                str7 = str7;
                                zzt zztVar3 = new zzt();
                                zztVar3.zzb(i5);
                                zztVar3.zzm(str2);
                                zztVar3.zzE(iZzt);
                                i9 = i9;
                                zztVar3.zzF(i9);
                                zztVar3.zzq(zzqVarZzb);
                                zztVar3.zze(str);
                                zzajwVar.zzb = zztVar3.zzM();
                            } else {
                                iZzB = iZzB;
                                str7 = str7;
                                zzt zztVar4 = new zzt();
                                zztVar4.zzb(i5);
                                zztVar4.zzm(str2);
                                zztVar4.zzE(iZzt);
                                i9 = i9;
                                zztVar4.zzF(i9);
                                zztVar4.zzq(zzqVarZzb);
                                zztVar4.zze(str);
                                zzajwVar.zzb = zztVar4.zzM();
                            }
                            iZzg2 += i11;
                            i19 = i4;
                            str7 = str7;
                            str8 = str4;
                            iZzB = iZzB;
                            i8 = 2;
                        }
                    } else {
                        i9 = i9;
                        i11 = iZzB2;
                        iZzB = iZzB;
                        str7 = str7;
                        iZzg = iZzg2;
                        i12 = -1;
                    }
                    if (iZzg != i12) {
                        zzajrVarZzp = zzp(zzerVar, iZzg);
                        strZza = zzajrVarZzp.zza();
                        bArrZzb = zzajrVarZzp.zzb();
                        if (bArrZzb != null) {
                            if ("audio/vorbis".equals(strZza)) {
                                zzerVar2 = new zzer(bArrZzb);
                                i13 = 1;
                                zzerVar2.zzk(1);
                                i14 = 0;
                                while (true) {
                                    if (zzerVar2.zzd() > 0) {
                                        i15 = 255;
                                        break;
                                    }
                                    i15 = 255;
                                    if (zzerVar2.zzn() == 255) {
                                        break;
                                        break;
                                    } else {
                                        zzerVar2.zzk(i13);
                                        i14 += 255;
                                        i13 = 1;
                                    }
                                }
                                int iZzs9 = zzerVar2.zzs() + i14;
                                i16 = 0;
                                while (zzerVar2.zzd() > 0) {
                                    zzerVar2.zzk(1);
                                    i16 += i15;
                                }
                                int iZzs10 = zzerVar2.zzs() + i16;
                                byte[] bArr11 = new byte[iZzs9];
                                int iZzg5 = zzerVar2.zzg();
                                System.arraycopy(bArrZzb, iZzg5, bArr11, 0, iZzs9);
                                int i34 = iZzg5 + iZzs9 + iZzs10;
                                int length3 = bArrZzb.length - i34;
                                byte[] bArr12 = new byte[length3];
                                System.arraycopy(bArrZzb, i34, bArr12, 0, length3);
                                listZzj = zzgtd.zzk(bArr11, bArr12);
                            } else {
                                if ("audio/mp4a-latm".equals(strZza)) {
                                    zzadm zzadmVarZza2 = zzadn.zza(bArrZzb);
                                    i9 = zzadmVarZza2.zza;
                                    iZzt = zzadmVarZza2.zzb;
                                    str5 = zzadmVarZza2.zzc;
                                } else {
                                    str5 = str3;
                                }
                                listZzj = zzgtd.zzj(bArrZzb);
                                str3 = str5;
                            }
                            str2 = strZza;
                        } else {
                            str2 = strZza;
                        }
                        iZzg2 += i11;
                        i19 = i4;
                        str7 = str7;
                        str8 = str4;
                        iZzB = iZzB;
                        i8 = 2;
                    }
                    iZzg2 += i11;
                    i19 = i4;
                    str7 = str7;
                    str8 = str4;
                    iZzB = iZzB;
                    i8 = 2;
                }
                iZzB = iZzB;
                iZzg2 += i11;
                i19 = i4;
                str7 = str7;
                str8 = str4;
                iZzB = iZzB;
                i8 = 2;
            }
            i9 = i9;
            i11 = iZzB2;
            iZzB = iZzB;
            str7 = str7;
            iZzg2 += i11;
            i19 = i4;
            str7 = str7;
            str8 = str4;
            iZzB = iZzB;
            i8 = 2;
        }
        if (zzajwVar.zzb == null) {
        }
    }

    private static zzajr zzp(zzer zzerVar, int i2) {
        zzerVar.zzh(i2 + 12);
        zzerVar.zzk(1);
        zzs(zzerVar);
        zzerVar.zzk(2);
        int iZzs = zzerVar.zzs();
        if ((iZzs & 128) != 0) {
            zzerVar.zzk(2);
        }
        if ((iZzs & 64) != 0) {
            zzerVar.zzk(zzerVar.zzs());
        }
        if ((iZzs & 32) != 0) {
            zzerVar.zzk(2);
        }
        zzerVar.zzk(1);
        zzs(zzerVar);
        String strZze = zzas.zze(zzerVar.zzs());
        if ("audio/mpeg".equals(strZze) || "audio/vnd.dts".equals(strZze) || "audio/vnd.dts.hd".equals(strZze)) {
            return new zzajr(strZze, null, -1L, -1L);
        }
        zzerVar.zzk(4);
        long jZzz = zzerVar.zzz();
        long jZzz2 = zzerVar.zzz();
        zzerVar.zzk(1);
        int iZzs2 = zzs(zzerVar);
        long j = jZzz2;
        byte[] bArr = new byte[iZzs2];
        zzerVar.zzm(bArr, 0, iZzs2);
        if (j <= 0) {
            j = -1;
        }
        return new zzajr(strZze, bArr, j, jZzz > 0 ? jZzz : -1L);
    }

    private static zzajp zzq(zzer zzerVar, int i2) {
        zzerVar.zzh(i2 + 8);
        zzerVar.zzk(4);
        return new zzajp(zzerVar.zzz(), zzerVar.zzz());
    }

    private static Pair zzr(zzer zzerVar, int i2, int i3) throws zzat {
        zzakw zzakwVar;
        Pair pairCreate;
        int i4;
        int i5;
        int iZzg = zzerVar.zzg();
        while (iZzg - i2 < i3) {
            zzerVar.zzh(iZzg);
            int iZzB = zzerVar.zzB();
            zzaes.zza(iZzB > 0, "childAtomSize must be positive");
            if (zzerVar.zzB() == 1936289382) {
                int i6 = iZzg + 8;
                int i7 = 0;
                int i8 = -1;
                Integer numValueOf = null;
                String strZzK = null;
                while (i6 - iZzg < iZzB) {
                    zzerVar.zzh(i6);
                    int iZzB2 = zzerVar.zzB();
                    int iZzB3 = zzerVar.zzB();
                    if (iZzB3 == 1718775137) {
                        numValueOf = Integer.valueOf(zzerVar.zzB());
                    } else if (iZzB3 == 1935894637) {
                        zzerVar.zzk(4);
                        strZzK = zzerVar.zzK(4, StandardCharsets.UTF_8);
                    } else if (iZzB3 == 1935894633) {
                        i8 = i6;
                        i7 = iZzB2;
                    }
                    i6 += iZzB2;
                }
                byte[] bArr = null;
                if ("cenc".equals(strZzK) || "cbc1".equals(strZzK) || "cens".equals(strZzK) || "cbcs".equals(strZzK)) {
                    zzaes.zza(numValueOf != null, "frma atom is mandatory");
                    zzaes.zza(i8 != -1, "schi atom is mandatory");
                    int i9 = i8 + 8;
                    while (true) {
                        if (i9 - i8 >= i7) {
                            zzakwVar = null;
                            break;
                        }
                        zzerVar.zzh(i9);
                        int iZzB4 = zzerVar.zzB();
                        if (zzerVar.zzB() == 1952804451) {
                            int iZza = zza(zzerVar.zzB());
                            zzerVar.zzk(1);
                            if (iZza == 0) {
                                zzerVar.zzk(1);
                                i5 = 0;
                                i4 = 0;
                            } else {
                                int iZzs = zzerVar.zzs();
                                i4 = iZzs & 15;
                                i5 = (iZzs & PsExtractor.VIDEO_STREAM_MASK) >> 4;
                            }
                            boolean z2 = zzerVar.zzs() == 1;
                            int iZzs2 = zzerVar.zzs();
                            byte[] bArr2 = new byte[16];
                            zzerVar.zzm(bArr2, 0, 16);
                            if (z2 && iZzs2 == 0) {
                                int iZzs3 = zzerVar.zzs();
                                byte[] bArr3 = new byte[iZzs3];
                                zzerVar.zzm(bArr3, 0, iZzs3);
                                bArr = bArr3;
                            }
                            zzakwVar = new zzakw(z2, strZzK, iZzs2, bArr2, i5, i4, bArr);
                            break;
                        }
                        i9 += iZzB4;
                    }
                    zzaes.zza(zzakwVar != null, "tenc atom is mandatory");
                    String str = zzfj.zza;
                    pairCreate = Pair.create(numValueOf, zzakwVar);
                } else {
                    pairCreate = null;
                }
                if (pairCreate != null) {
                    return pairCreate;
                }
            }
            iZzg += iZzB;
        }
        return null;
    }

    private static int zzs(zzer zzerVar) {
        int iZzs = zzerVar.zzs();
        int i2 = iZzs & 127;
        while ((iZzs & 128) == 128) {
            iZzs = zzerVar.zzs();
            i2 = (i2 << 7) | (iZzs & 127);
        }
        return i2;
    }
}
