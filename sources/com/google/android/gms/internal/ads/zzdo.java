package com.google.android.gms.internal.ads;

import android.util.Pair;
import com.applovin.impl.Z;
import com.applovin.shadow.okio.Segment;
import com.p004ironsource.mediationsdk.logger.IronSourceError;
import com.thinkup.core.common.n.mo;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes4.dex */
public final class zzdo {
    public static final /* synthetic */ int zza = 0;
    private static final byte[] zzb = {0, 0, 0, 1};
    private static final String[] zzc = {"", "A", "B", "C"};
    private static final Pattern zzd = Pattern.compile("^\\D?(\\d+)$");

    public static String zza(int i2, int i3, int i4) {
        return String.format("avc1.%02X%02X%02X", Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4));
    }

    public static String zzb(int i2, boolean z2, int i3, int i4, int[] iArr, int i5) {
        int i6;
        Object[] objArr = {zzc[i2], Integer.valueOf(i3), Integer.valueOf(i4), Character.valueOf(true != z2 ? 'L' : 'H'), Integer.valueOf(i5)};
        String str = zzfj.zza;
        StringBuilder sb = new StringBuilder(String.format(Locale.US, "hvc1.%s%d.%X.%c%d", objArr));
        int i7 = 6;
        while (true) {
            if (i7 <= 0) {
                break;
            }
            int i8 = i7 - 1;
            if (iArr[i8] != 0) {
                break;
            }
            i7 = i8;
        }
        for (i6 = 0; i6 < i7; i6++) {
            sb.append(String.format(".%02X", Integer.valueOf(iArr[i6])));
        }
        return sb.toString();
    }

    public static String zzc(byte[] bArr) {
        int length = bArr.length;
        zzgqa.zzd(length >= 17, "Invalid APV CSD length: %s", length);
        byte b2 = bArr[0];
        zzgqa.zzd(b2 == 1, "Invalid APV CSD version: %s", b2);
        byte b3 = bArr[5];
        byte b4 = bArr[6];
        byte b5 = bArr[7];
        String str = zzfj.zza;
        Locale locale = Locale.US;
        StringBuilder sbP = androidx.datastore.preferences.protobuf.a.p(b3, b4, "apv1.apvf", ".apvl", ".apvb");
        sbP.append((int) b5);
        return sbP.toString();
    }

    /* JADX WARN: Code duplicated, block: B:145:0x026d A[PHI: r20
  0x026d: PHI (r20v13 int) = 
  (r20v1 int)
  (r20v2 int)
  (r20v3 int)
  (r20v4 int)
  (r20v5 int)
  (r20v6 int)
  (r20v7 int)
  (r20v8 int)
  (r20v9 int)
  (r20v10 int)
  (r20v11 int)
  (r20v14 int)
 binds: [B:143:0x0268, B:140:0x025c, B:137:0x0250, B:134:0x0244, B:131:0x0238, B:128:0x022c, B:125:0x0220, B:122:0x0213, B:119:0x0206, B:116:0x01f9, B:113:0x01ec, B:111:0x01e0] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:191:0x031d  */
    /* JADX WARN: Failed to clean up code after switch over string restore
    jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r1v97 int, still in use, count: 1, list:
  (r1v97 int) from 0x0067: IF  (r1v97 int) != (1567 int)  -> B:20:0x0069 A[HIDDEN] (LINE:104)
    	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
    	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
    	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
    	at java.base/java.util.ArrayList.forEach(Unknown Source)
    	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
    	at jadx.core.utils.InsnRemover.perform(InsnRemover.java:75)
    	at jadx.core.utils.InsnRemover.removeAllMarked(InsnRemover.java:276)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.replaceWithMergedSwitch(SwitchOverStringVisitor.java:354)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:111)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:72)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:140)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterative(DepthRegionTraversal.java:47)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visit(SwitchOverStringVisitor.java:66)
     */
    /* JADX WARN: Failed to clean up code after switch over string restore
    jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r1v97 int, still in use, count: 1, list:
  (r1v97 int) from 0x0067: IF  (r1v97 int) != (1567 int)  -> B:20:0x0069 A[HIDDEN] (LINE:104)
    	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
    	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
    	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
    	at jadx.core.utils.InsnRemover.remove(InsnRemover.java:226)
    	at jadx.core.utils.InsnRemover.remove(InsnRemover.java:215)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.replaceWithMergedSwitch(SwitchOverStringVisitor.java:355)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:111)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:72)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:140)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterative(DepthRegionTraversal.java:47)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visit(SwitchOverStringVisitor.java:66)
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static Pair zzd(zzv zzvVar) {
        int i2;
        byte b2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        Integer num;
        Integer numValueOf;
        String str = zzvVar.zzk;
        if (str == null) {
            return null;
        }
        String[] strArrSplit = str.split("\\.");
        int i11 = 8;
        int i12 = 3;
        int i13 = 2;
        if ("video/dolby-vision".equals(zzvVar.zzo)) {
            if (strArrSplit.length < 3) {
                zzee.zzc("CodecSpecificDataUtil", "Ignoring malformed Dolby Vision codec string: ".concat(str));
                return null;
            }
            Matcher matcher = zzd.matcher(strArrSplit[1]);
            if (!matcher.matches()) {
                zzee.zzc("CodecSpecificDataUtil", "Ignoring malformed Dolby Vision codec string: ".concat(str));
                return null;
            }
            String strGroup = matcher.group(1);
            if (strGroup == null) {
                num = null;
            } else {
                if (strGroup.hashCode() != 1567) {
                    switch (strGroup) {
                        case "00":
                            num = 1;
                            break;
                        case "01":
                            num = 2;
                            break;
                        case "02":
                            num = 4;
                            break;
                        case "03":
                            num = 8;
                            break;
                        case "04":
                            num = 16;
                            break;
                        case "05":
                            num = 32;
                            break;
                        case "06":
                            num = 64;
                            break;
                        case "07":
                            num = 128;
                            break;
                        case "08":
                            num = 256;
                            break;
                        case "09":
                            num = 512;
                            break;
                        default:
                            num = null;
                            break;
                    }
                } else {
                    num = strGroup.equals("10") ? 1024 : null;
                }
            }
            if (num == null) {
                Z.D(strGroup, "Unknown Dolby Vision profile string: ", "CodecSpecificDataUtil");
                return null;
            }
            String str2 = strArrSplit[2];
            if (str2 != null) {
                str2.hashCode();
                switch (str2) {
                    case "01":
                        numValueOf = 1;
                        break;
                    case "02":
                        numValueOf = 2;
                        break;
                    case "03":
                        numValueOf = 4;
                        break;
                    case "04":
                        numValueOf = 8;
                        break;
                    case "05":
                        numValueOf = 16;
                        break;
                    case "06":
                        numValueOf = 32;
                        break;
                    case "07":
                        numValueOf = 64;
                        break;
                    case "08":
                        numValueOf = 128;
                        break;
                    case "09":
                        numValueOf = 256;
                        break;
                    default:
                        switch (str2) {
                            case 1567:
                                numValueOf = !str2.equals("10") ? null : 512;
                                break;
                            case 1568:
                                numValueOf = !str2.equals("11") ? null : 1024;
                                break;
                            case 1569:
                                numValueOf = !str2.equals("12") ? null : Integer.valueOf(com.p004ironsource.mediationsdk.metadata.a.f25965n);
                                break;
                            case 1570:
                                numValueOf = !str2.equals("13") ? null : 4096;
                                break;
                            default:
                                numValueOf = null;
                                break;
                        }
                }
            } else {
                numValueOf = null;
            }
            if (numValueOf != null) {
                return new Pair(num, numValueOf);
            }
            Z.D(str2, "Unknown Dolby Vision level string: ", "CodecSpecificDataUtil");
            return null;
        }
        int i14 = 0;
        String str3 = strArrSplit[0];
        byte b3 = -1;
        switch (str3.hashCode()) {
            case 2986313:
                i2 = 256;
                if (!str3.equals("ac-4")) {
                    b2 = -1;
                } else {
                    b2 = 9;
                }
                break;
            case 3001066:
                i2 = 256;
                if (!str3.equals("apv1")) {
                    b2 = -1;
                } else {
                    b2 = 7;
                }
                break;
            case 3004662:
                i2 = 256;
                if (!str3.equals("av01")) {
                    b2 = -1;
                } else {
                    b2 = 6;
                }
                break;
            case 3006243:
                i2 = 256;
                if (!str3.equals("avc1")) {
                    b2 = -1;
                } else {
                    b2 = 1;
                }
                break;
            case 3006244:
                i2 = 256;
                if (!str3.equals("avc2")) {
                    b2 = -1;
                } else {
                    b2 = 2;
                }
                break;
            case 3199032:
                i2 = 256;
                if (!str3.equals("hev1")) {
                    b2 = -1;
                } else {
                    b2 = 4;
                }
                break;
            case 3214780:
                i2 = 256;
                if (!str3.equals("hvc1")) {
                    b2 = -1;
                } else {
                    b2 = 5;
                }
                break;
            case 3224753:
                i2 = 256;
                if (!str3.equals("iamf")) {
                    b2 = -1;
                } else {
                    b2 = 10;
                }
                break;
            case 3356560:
                i2 = 256;
                if (!str3.equals("mp4a")) {
                    b2 = -1;
                } else {
                    b2 = 8;
                }
                break;
            case 3475740:
                i2 = 256;
                if (!str3.equals("s263")) {
                    b2 = -1;
                } else {
                    b2 = 0;
                }
                break;
            case 3624515:
                i2 = 256;
                if (!str3.equals("vp09")) {
                    b2 = -1;
                } else {
                    b2 = 3;
                }
                break;
            default:
                i2 = 256;
                b2 = -1;
                break;
        }
        switch (b2) {
            case 0:
                String str4 = zzvVar.zzk;
                Pair pair = new Pair(1, 1);
                if (strArrSplit.length < 3) {
                    Z.D(str4, "Ignoring malformed H263 codec string: ", "CodecSpecificDataUtil");
                    return pair;
                }
                try {
                    return new Pair(Integer.valueOf(Integer.parseInt(strArrSplit[1])), Integer.valueOf(Integer.parseInt(strArrSplit[2])));
                } catch (NumberFormatException unused) {
                    Z.D(str4, "Ignoring malformed H263 codec string: ", "CodecSpecificDataUtil");
                    return pair;
                }
            case 1:
            case 2:
                String str5 = zzvVar.zzk;
                int length = strArrSplit.length;
                if (length < 2) {
                    Z.D(str5, "Ignoring malformed AVC codec string: ", "CodecSpecificDataUtil");
                    return null;
                }
                try {
                    if (strArrSplit[1].length() == 6) {
                        i3 = Integer.parseInt(strArrSplit[1].substring(0, 2), 16);
                        i4 = Integer.parseInt(strArrSplit[1].substring(4), 16);
                    } else {
                        if (length < 3) {
                            StringBuilder sb = new StringBuilder(String.valueOf(str5).length() + 37);
                            sb.append("Ignoring malformed AVC codec string: ");
                            sb.append(str5);
                            zzee.zzc("CodecSpecificDataUtil", sb.toString());
                            return null;
                        }
                        i3 = Integer.parseInt(strArrSplit[1]);
                        i4 = Integer.parseInt(strArrSplit[2]);
                    }
                    if (i3 == 66) {
                        i13 = 1;
                    } else if (i3 != 77) {
                        if (i3 == 88) {
                            i13 = 4;
                        } else if (i3 == 100) {
                            i13 = 8;
                        } else if (i3 == 110) {
                            i13 = 16;
                        } else if (i3 != 122) {
                            i13 = i3 != 244 ? -1 : 64;
                        } else {
                            i13 = 32;
                        }
                    }
                    if (i13 == -1) {
                        Z.w(new StringBuilder(String.valueOf(i3).length() + 21), "Unknown AVC profile: ", i3, "CodecSpecificDataUtil");
                        return null;
                    }
                    switch (i4) {
                        case 10:
                            i5 = 1;
                            break;
                        case 11:
                            i5 = 4;
                            break;
                        case 12:
                            i5 = 8;
                            break;
                        case 13:
                            i5 = 16;
                            break;
                        default:
                            switch (i4) {
                                case 20:
                                    i5 = 32;
                                    break;
                                case 21:
                                    i5 = 64;
                                    break;
                                case 22:
                                    i5 = 128;
                                    break;
                                default:
                                    switch (i4) {
                                        case 30:
                                            i5 = i2;
                                            break;
                                        case 31:
                                            i5 = 512;
                                            break;
                                        case 32:
                                            i5 = 1024;
                                            break;
                                        default:
                                            switch (i4) {
                                                case 40:
                                                    i5 = 2048;
                                                    break;
                                                case 41:
                                                    i5 = 4096;
                                                    break;
                                                case 42:
                                                    i5 = Segment.SIZE;
                                                    break;
                                                default:
                                                    switch (i4) {
                                                        case 50:
                                                            i5 = 16384;
                                                            break;
                                                        case AD_REWARD_USER_VALUE:
                                                            i5 = 32768;
                                                            break;
                                                        case AD_REQUIRED_DOWNLOAD_DURATION_MS_VALUE:
                                                            i5 = 65536;
                                                            break;
                                                        default:
                                                            i5 = -1;
                                                            break;
                                                    }
                                                    break;
                                            }
                                            break;
                                    }
                                    break;
                            }
                            break;
                    }
                    if (i5 != -1) {
                        return new Pair(Integer.valueOf(i13), Integer.valueOf(i5));
                    }
                    Z.w(new StringBuilder(String.valueOf(i4).length() + 19), "Unknown AVC level: ", i4, "CodecSpecificDataUtil");
                    return null;
                } catch (NumberFormatException unused2) {
                    Z.D(str5, "Ignoring malformed AVC codec string: ", "CodecSpecificDataUtil");
                }
                break;
            case 3:
                String str6 = zzvVar.zzk;
                if (strArrSplit.length < 3) {
                    Z.D(str6, "Ignoring malformed VP9 codec string: ", "CodecSpecificDataUtil");
                    return null;
                }
                try {
                    int i15 = Integer.parseInt(strArrSplit[1]);
                    int i16 = Integer.parseInt(strArrSplit[2]);
                    if (i15 == 0) {
                        i6 = 1;
                    } else if (i15 == 1) {
                        i6 = 2;
                    } else if (i15 != 2) {
                        i6 = i15 != 3 ? -1 : 8;
                    } else {
                        i6 = 4;
                    }
                    if (i6 == -1) {
                        Z.w(new StringBuilder(String.valueOf(i15).length() + 21), "Unknown VP9 profile: ", i15, "CodecSpecificDataUtil");
                        return null;
                    }
                    if (i16 == 10) {
                        i13 = 1;
                    } else if (i16 != 11) {
                        if (i16 == 20) {
                            i13 = 4;
                        } else if (i16 == 21) {
                            i13 = 8;
                        } else if (i16 == 30) {
                            i13 = 16;
                        } else if (i16 == 31) {
                            i13 = 32;
                        } else if (i16 == 40) {
                            i13 = 64;
                        } else if (i16 == 41) {
                            i13 = 128;
                        } else if (i16 == 50) {
                            i13 = i2;
                        } else if (i16 != 51) {
                            switch (i16) {
                                case 60:
                                    i13 = 2048;
                                    break;
                                case APP_BACKGROUND_DURING_AD_LOAD_VALUE:
                                    i13 = 4096;
                                    break;
                                case 62:
                                    i13 = Segment.SIZE;
                                    break;
                                default:
                                    i13 = -1;
                                    break;
                            }
                        } else {
                            i13 = 512;
                        }
                    }
                    if (i13 != -1) {
                        return new Pair(Integer.valueOf(i6), Integer.valueOf(i13));
                    }
                    Z.w(new StringBuilder(String.valueOf(i16).length() + 19), "Unknown VP9 level: ", i16, "CodecSpecificDataUtil");
                    return null;
                } catch (NumberFormatException unused3) {
                    Z.D(str6, "Ignoring malformed VP9 codec string: ", "CodecSpecificDataUtil");
                }
                break;
            case 4:
            case 5:
                return zze(zzvVar.zzk, strArrSplit, zzvVar.zzE);
            case 6:
                String str7 = zzvVar.zzk;
                zzi zziVar = zzvVar.zzE;
                if (strArrSplit.length < 4) {
                    Z.D(str7, "Ignoring malformed AV1 codec string: ", "CodecSpecificDataUtil");
                    return null;
                }
                try {
                    int i17 = Integer.parseInt(strArrSplit[1]);
                    int i18 = Integer.parseInt(strArrSplit[2].substring(0, 2));
                    int i19 = Integer.parseInt(strArrSplit[3]);
                    if (i17 != 0) {
                        Z.w(new StringBuilder(String.valueOf(i17).length() + 21), "Unknown AV1 profile: ", i17, "CodecSpecificDataUtil");
                        return null;
                    }
                    if (i19 == 8) {
                        i7 = 1;
                    } else {
                        if (i19 != 10) {
                            Z.w(new StringBuilder(String.valueOf(i19).length() + 23), "Unknown AV1 bit depth: ", i19, "CodecSpecificDataUtil");
                            return null;
                        }
                        i7 = (zziVar == null || !(zziVar.zze != null || (i8 = zziVar.zzd) == 7 || i8 == 6)) ? 2 : 4096;
                    }
                    switch (i18) {
                        case 0:
                            i13 = 1;
                            break;
                        case 1:
                            break;
                        case 2:
                            i13 = 4;
                            break;
                        case 3:
                            i13 = 8;
                            break;
                        case 4:
                            i13 = 16;
                            break;
                        case 5:
                            i13 = 32;
                            break;
                        case 6:
                            i13 = 64;
                            break;
                        case 7:
                            i13 = 128;
                            break;
                        case 8:
                            i13 = i2;
                            break;
                        case 9:
                            i13 = 512;
                            break;
                        case 10:
                            i13 = 1024;
                            break;
                        case 11:
                            i13 = 2048;
                            break;
                        case 12:
                            i13 = 4096;
                            break;
                        case 13:
                            i13 = Segment.SIZE;
                            break;
                        case 14:
                            i13 = 16384;
                            break;
                        case 15:
                            i13 = 32768;
                            break;
                        case 16:
                            i13 = 65536;
                            break;
                        case 17:
                            i13 = 131072;
                            break;
                        case 18:
                            i13 = 262144;
                            break;
                        case 19:
                            i13 = 524288;
                            break;
                        case 20:
                            i13 = 1048576;
                            break;
                        case 21:
                            i13 = 2097152;
                            break;
                        case 22:
                            i13 = 4194304;
                            break;
                        case 23:
                            i13 = 8388608;
                            break;
                        default:
                            i13 = -1;
                            break;
                    }
                    if (i13 != -1) {
                        return new Pair(Integer.valueOf(i7), Integer.valueOf(i13));
                    }
                    Z.w(new StringBuilder(String.valueOf(i18).length() + 19), "Unknown AV1 level: ", i18, "CodecSpecificDataUtil");
                    return null;
                } catch (NumberFormatException unused4) {
                    Z.D(str7, "Ignoring malformed AV1 codec string: ", "CodecSpecificDataUtil");
                }
                break;
            case 7:
                String str8 = zzvVar.zzk;
                if (strArrSplit.length < 4) {
                    Z.D(str8, "Ignoring malformed APV codec string: ", "CodecSpecificDataUtil");
                    return null;
                }
                try {
                    int i20 = Integer.parseInt(strArrSplit[1].substring(4));
                    int i21 = Integer.parseInt(strArrSplit[2].substring(4));
                    int i22 = Integer.parseInt(strArrSplit[3].substring(4));
                    if (i20 == 33) {
                        i9 = 1;
                    } else {
                        if (i20 != 44) {
                            StringBuilder sb2 = new StringBuilder(Z.a(i20, 30));
                            sb2.append("Ignoring invalid APV profile: ");
                            sb2.append(i20);
                            zzee.zzc("CodecSpecificDataUtil", sb2.toString());
                            return null;
                        }
                        i9 = Segment.SIZE;
                    }
                    int i23 = i21 / 30;
                    int i24 = i23 + i23;
                    if (i21 % 30 == 0) {
                        i24--;
                    }
                    return new Pair(Integer.valueOf(i9), Integer.valueOf((i2 << (i24 - 1)) | (1 << i22)));
                } catch (NumberFormatException e2) {
                    zzee.zzd("CodecSpecificDataUtil", "Ignoring malformed APV codec string: ".concat(String.valueOf(str8)), e2);
                }
                break;
            case 8:
                String str9 = zzvVar.zzk;
                if (strArrSplit.length != 3) {
                    Z.D(str9, "Ignoring malformed MP4A codec string: ", "CodecSpecificDataUtil");
                    return null;
                }
                try {
                    if ("audio/mp4a-latm".equals(zzas.zze(Integer.parseInt(strArrSplit[1], 16)))) {
                        int i25 = Integer.parseInt(strArrSplit[2]);
                        if (i25 == 17) {
                            i12 = 17;
                        } else if (i25 == 20) {
                            i12 = 20;
                        } else if (i25 == 23) {
                            i12 = 23;
                        } else if (i25 == 29) {
                            i12 = 29;
                        } else if (i25 == 39) {
                            i12 = 39;
                        } else if (i25 != 42) {
                            switch (i25) {
                                case 1:
                                    i12 = 1;
                                    break;
                                case 2:
                                    i12 = 2;
                                    break;
                                case 3:
                                    break;
                                case 4:
                                    i12 = 4;
                                    break;
                                case 5:
                                    i12 = 5;
                                    break;
                                case 6:
                                    i12 = 6;
                                    break;
                                default:
                                    i12 = -1;
                                    break;
                            }
                        } else {
                            i12 = 42;
                        }
                        if (i12 != -1) {
                            return new Pair(Integer.valueOf(i12), 0);
                        }
                    }
                    return null;
                } catch (NumberFormatException unused5) {
                    Z.D(str9, "Ignoring malformed MP4A codec string: ", "CodecSpecificDataUtil");
                }
                break;
            case 9:
                String str10 = zzvVar.zzk;
                if (strArrSplit.length != 4) {
                    Z.D(str10, "Ignoring malformed AC-4 codec string: ", "CodecSpecificDataUtil");
                    return null;
                }
                try {
                    int i26 = Integer.parseInt(strArrSplit[1]);
                    int i27 = Integer.parseInt(strArrSplit[2]);
                    int i28 = Integer.parseInt(strArrSplit[3]);
                    if (i26 != 0) {
                        if (i26 != 1) {
                            if (i26 != 2) {
                                i14 = i27;
                                i10 = -1;
                            } else if (i27 == 1) {
                                i10 = IronSourceError.ERROR_RV_LOAD_DURING_LOAD;
                                i14 = 1;
                            } else if (i27 == 2) {
                                i10 = IronSourceError.ERROR_RV_LOAD_SUCCESS_UNEXPECTED;
                                i14 = 2;
                            } else {
                                i14 = i27;
                                i10 = -1;
                            }
                        } else if (i27 == 0) {
                            i10 = 513;
                        } else if (i27 == 1) {
                            i10 = 514;
                            i14 = 1;
                        } else {
                            i14 = i27;
                            i10 = -1;
                        }
                    } else if (i27 == 0) {
                        i10 = 257;
                    } else {
                        i14 = i27;
                        i10 = -1;
                    }
                    if (i10 == -1) {
                        zzee.zzc("CodecSpecificDataUtil", p005e.a.a(new StringBuilder(String.valueOf(i26).length() + 23 + String.valueOf(i14).length()), i26, "Unknown AC-4 profile: ", i14, mo.ono));
                        return null;
                    }
                    if (i28 == 0) {
                        i11 = 1;
                    } else if (i28 == 1) {
                        i11 = 2;
                    } else if (i28 == 2) {
                        i11 = 4;
                    } else if (i28 != 3) {
                        i11 = i28 != 4 ? -1 : 16;
                    }
                    if (i11 != -1) {
                        return new Pair(Integer.valueOf(i10), Integer.valueOf(i11));
                    }
                    Z.w(new StringBuilder(String.valueOf(i28).length() + 20), "Unknown AC-4 level: ", i28, "CodecSpecificDataUtil");
                    return null;
                } catch (NumberFormatException unused6) {
                    Z.D(str10, "Ignoring malformed AC-4 codec string: ", "CodecSpecificDataUtil");
                }
                break;
            case 10:
                if (strArrSplit.length < 4) {
                    zzee.zzc("CodecSpecificDataUtil", "Ignoring malformed IAMF codec string: ".concat(str));
                    return null;
                }
                try {
                    int i29 = 1 << (Integer.parseInt(strArrSplit[1]) + 16);
                    String str11 = strArrSplit[3];
                    switch (str11.hashCode()) {
                        case 2464863:
                            if (str11.equals("Opus")) {
                                b3 = 0;
                            }
                            break;
                        case 3114792:
                            if (str11.equals("fLaC")) {
                                b3 = 2;
                            }
                            break;
                        case 3238865:
                            if (str11.equals("ipcm")) {
                                b3 = 3;
                            }
                            break;
                        case 3356560:
                            if (str11.equals("mp4a")) {
                                b3 = 1;
                            }
                            break;
                    }
                    if (b3 == 0) {
                        i11 = 1;
                    } else if (b3 == 1) {
                        i11 = 2;
                    } else if (b3 == 2) {
                        i11 = 4;
                    } else if (b3 != 3) {
                        zzee.zzc("CodecSpecificDataUtil", "Ignoring unknown codec identifier for IAMF auxiliary profile: ".concat(str11));
                        return null;
                    }
                    return new Pair(Integer.valueOf(i29 | 16777216 | i11), 0);
                } catch (NumberFormatException e3) {
                    zzee.zzd("CodecSpecificDataUtil", "Ignoring malformed primary profile in IAMF codec string: ".concat(String.valueOf(strArrSplit[1])), e3);
                }
                break;
            default:
                return null;
        }
        return null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:107:0x0186  */
    /* JADX WARN: Code duplicated, block: B:25:0x0052  */
    public static Pair zze(String str, String[] strArr, zzi zziVar) {
        int i2;
        Integer numValueOf;
        if (strArr.length < 4) {
            Z.D(str, "Ignoring malformed HEVC codec string: ", "CodecSpecificDataUtil");
            return null;
        }
        Matcher matcher = zzd.matcher(strArr[1]);
        if (!matcher.matches()) {
            Z.D(str, "Ignoring malformed HEVC codec string: ", "CodecSpecificDataUtil");
            return null;
        }
        String strGroup = matcher.group(1);
        if ("1".equals(strGroup)) {
            i2 = 1;
        } else if ("2".equals(strGroup)) {
            i2 = (zziVar == null || zziVar.zzd != 6) ? 2 : 4096;
        } else {
            if (!"6".equals(strGroup)) {
                Z.D(strGroup, "Unknown HEVC profile string: ", "CodecSpecificDataUtil");
                return null;
            }
            i2 = 6;
        }
        String str2 = strArr[3];
        if (str2 != null) {
            switch (str2) {
                case "L30":
                    numValueOf = 1;
                    break;
                case "L60":
                    numValueOf = 4;
                    break;
                case "L63":
                    numValueOf = 16;
                    break;
                case "L90":
                    numValueOf = 64;
                    break;
                case "L93":
                    numValueOf = 256;
                    break;
                case "L120":
                    numValueOf = 1024;
                    break;
                case "L123":
                    numValueOf = 4096;
                    break;
                case "L150":
                    numValueOf = 16384;
                    break;
                case "L153":
                    numValueOf = 65536;
                    break;
                case "L156":
                    numValueOf = 262144;
                    break;
                case "L180":
                    numValueOf = 1048576;
                    break;
                case "L183":
                    numValueOf = 4194304;
                    break;
                case "L186":
                    numValueOf = 16777216;
                    break;
                case "H30":
                    numValueOf = 2;
                    break;
                case "H60":
                    numValueOf = 8;
                    break;
                case "H63":
                    numValueOf = 32;
                    break;
                case "H90":
                    numValueOf = 128;
                    break;
                case "H93":
                    numValueOf = 512;
                    break;
                case "H120":
                    numValueOf = Integer.valueOf(com.p004ironsource.mediationsdk.metadata.a.f25965n);
                    break;
                case "H123":
                    numValueOf = Integer.valueOf(Segment.SIZE);
                    break;
                case "H150":
                    numValueOf = 32768;
                    break;
                case "H153":
                    numValueOf = 131072;
                    break;
                case "H156":
                    numValueOf = 524288;
                    break;
                case "H180":
                    numValueOf = 2097152;
                    break;
                case "H183":
                    numValueOf = 8388608;
                    break;
                case "H186":
                    numValueOf = 33554432;
                    break;
                default:
                    numValueOf = null;
                    break;
            }
        } else {
            numValueOf = null;
        }
        if (numValueOf != null) {
            return new Pair(Integer.valueOf(i2), numValueOf);
        }
        Z.D(str2, "Unknown HEVC level string: ", "CodecSpecificDataUtil");
        return null;
    }

    public static byte[] zzf(byte[] bArr, int i2, int i3) {
        byte[] bArr2 = new byte[i3 + 4];
        System.arraycopy(zzb, 0, bArr2, 0, 4);
        System.arraycopy(bArr, i2, bArr2, 4, i3);
        return bArr2;
    }
}
