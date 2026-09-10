package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.media.MediaCodecInfo;
import android.util.Pair;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes2.dex */
public abstract class GN {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Pattern f3119a = Pattern.compile("^\\D?(\\d+)$");
    public static final HashMap b = new HashMap();
    public static int c = -1;

    public static void a(String str, ArrayList arrayList) {
        if (MimeTypes.AUDIO_RAW.equals(str)) {
            if (Ug0.f3833a < 26 && Ug0.b.equals("R9") && arrayList.size() == 1 && ((C4745uN) arrayList.get(0)).f5075a.equals("OMX.MTK.AUDIO.DECODER.RAW")) {
                arrayList.add(C4745uN.h("OMX.google.raw.decoder", MimeTypes.AUDIO_RAW, MimeTypes.AUDIO_RAW, null, false, true, false, false));
            }
            Collections.sort(arrayList, new BN(new C2911Yl(7)));
        }
        int i = Ug0.f3833a;
        if (i < 21 && arrayList.size() > 1) {
            String str2 = ((C4745uN) arrayList.get(0)).f5075a;
            if ("OMX.SEC.mp3.dec".equals(str2) || "OMX.SEC.MP3.Decoder".equals(str2) || "OMX.brcm.audio.mp3.decoder".equals(str2)) {
                Collections.sort(arrayList, new BN(new C2911Yl(8)));
            }
        }
        if (i >= 32 || arrayList.size() <= 1 || !"OMX.qti.audio.decoder.flac".equals(((C4745uN) arrayList.get(0)).f5075a)) {
            return;
        }
        arrayList.add((C4745uN) arrayList.remove(0));
    }

    public static String b(C4619sw c4619sw) {
        Pair pairD;
        if (MimeTypes.AUDIO_E_AC3_JOC.equals(c4619sw.l)) {
            return MimeTypes.AUDIO_E_AC3;
        }
        if (!"video/dolby-vision".equals(c4619sw.l) || (pairD = d(c4619sw)) == null) {
            return null;
        }
        int iIntValue = ((Integer) pairD.first).intValue();
        if (iIntValue == 16 || iIntValue == 256) {
            return "video/hevc";
        }
        if (iIntValue == 512) {
            return "video/avc";
        }
        return null;
    }

    public static String c(MediaCodecInfo mediaCodecInfo, String str, String str2) {
        for (String str3 : mediaCodecInfo.getSupportedTypes()) {
            if (str3.equalsIgnoreCase(str2)) {
                return str3;
            }
        }
        if (str2.equals("video/dolby-vision")) {
            if ("OMX.MS.HEVCDV.Decoder".equals(str)) {
                return "video/hevcdv";
            }
            if ("OMX.RTK.video.decoder".equals(str) || "OMX.realtek.video.decoder.tunneled".equals(str)) {
                return "video/dv_hevc";
            }
            return null;
        }
        if (str2.equals(MimeTypes.AUDIO_ALAC) && "OMX.lge.alac.decoder".equals(str)) {
            return "audio/x-lg-alac";
        }
        if (str2.equals(MimeTypes.AUDIO_FLAC) && "OMX.lge.flac.decoder".equals(str)) {
            return "audio/x-lg-flac";
        }
        if (str2.equals(MimeTypes.AUDIO_AC3) && "OMX.lge.ac3.decoder".equals(str)) {
            return "audio/lg-ac3";
        }
        return null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:151:0x0215  */
    /* JADX WARN: Code duplicated, block: B:15:0x005a  */
    /* JADX WARN: Code duplicated, block: B:18:0x0064  */
    /* JADX WARN: Code duplicated, block: B:289:0x03a9  */
    /* JADX WARN: Code duplicated, block: B:292:0x03b3  */
    /* JADX WARN: Code duplicated, block: B:75:0x0115  */
    /* JADX WARN: Code duplicated, block: B:78:0x011f  */
    public static Pair d(C4619sw c4619sw) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        Integer num;
        int i6;
        Integer num2;
        Integer num3;
        String str = c4619sw.i;
        if (str == null) {
            return null;
        }
        String[] strArrSplit = str.split("\\.");
        boolean zEquals = "video/dolby-vision".equals(c4619sw.l);
        Pattern pattern = f3119a;
        int i7 = 16;
        int i8 = 3;
        int i9 = 2;
        if (zEquals) {
            if (strArrSplit.length < 3) {
                AbstractC4038mJ.f();
                return null;
            }
            Matcher matcher = pattern.matcher(strArrSplit[1]);
            if (!matcher.matches()) {
                AbstractC4038mJ.f();
                return null;
            }
            String strGroup = matcher.group(1);
            if (strGroup != null) {
                switch (strGroup) {
                    case "00":
                        num2 = 1;
                        break;
                    case "01":
                        num2 = 2;
                        break;
                    case "02":
                        num2 = 4;
                        break;
                    case "03":
                        num2 = 8;
                        break;
                    case "04":
                        num2 = 16;
                        break;
                    case "05":
                        num2 = 32;
                        break;
                    case "06":
                        num2 = 64;
                        break;
                    case "07":
                        num2 = 128;
                        break;
                    case "08":
                        num2 = 256;
                        break;
                    case "09":
                        num2 = 512;
                        break;
                    default:
                        num2 = null;
                        break;
                }
            } else {
                num2 = null;
            }
            if (num2 == null) {
                AbstractC4038mJ.f();
                return null;
            }
            String str2 = strArrSplit[2];
            if (str2 != null) {
                switch (str2) {
                    case "01":
                        num3 = 1;
                        break;
                    case "02":
                        num3 = 2;
                        break;
                    case "03":
                        num3 = 4;
                        break;
                    case "04":
                        num3 = 8;
                        break;
                    case "05":
                        num3 = 16;
                        break;
                    case "06":
                        num3 = 32;
                        break;
                    case "07":
                        num3 = 64;
                        break;
                    case "08":
                        num3 = 128;
                        break;
                    case "09":
                        num3 = 256;
                        break;
                    case "10":
                        num3 = 512;
                        break;
                    case "11":
                        num3 = 1024;
                        break;
                    case "12":
                        num3 = 2048;
                        break;
                    case "13":
                        num3 = 4096;
                        break;
                    default:
                        num3 = null;
                        break;
                }
            } else {
                num3 = null;
            }
            if (num3 != null) {
                return new Pair(num2, num3);
            }
            AbstractC4038mJ.f();
            return null;
        }
        String str3 = strArrSplit[0];
        str3.getClass();
        switch (str3) {
            case "av01":
                if (strArrSplit.length < 4) {
                    AbstractC4038mJ.f();
                } else {
                    try {
                        int i10 = Integer.parseInt(strArrSplit[1]);
                        int i11 = Integer.parseInt(strArrSplit[2].substring(0, 2));
                        int i12 = Integer.parseInt(strArrSplit[3]);
                        if (i10 != 0) {
                            AbstractC4038mJ.f();
                        } else if (i12 == 8 || i12 == 10) {
                            if (i12 == 8) {
                                i = 1;
                            } else {
                                C2879Xf c2879Xf = c4619sw.x;
                                i = (c2879Xf == null || !(c2879Xf.d != null || (i2 = c2879Xf.c) == 7 || i2 == 6)) ? 2 : 4096;
                            }
                            switch (i11) {
                                case 0:
                                    i7 = 1;
                                    break;
                                case 1:
                                    i7 = 2;
                                    break;
                                case 2:
                                    i7 = 4;
                                    break;
                                case 3:
                                    i7 = 8;
                                    break;
                                case 4:
                                    break;
                                case 5:
                                    i7 = 32;
                                    break;
                                case 6:
                                    i7 = 64;
                                    break;
                                case 7:
                                    i7 = 128;
                                    break;
                                case 8:
                                    i7 = 256;
                                    break;
                                case 9:
                                    i7 = 512;
                                    break;
                                case 10:
                                    i7 = 1024;
                                    break;
                                case 11:
                                    i7 = 2048;
                                    break;
                                case 12:
                                    i7 = 4096;
                                    break;
                                case 13:
                                    i7 = 8192;
                                    break;
                                case 14:
                                    i7 = 16384;
                                    break;
                                case 15:
                                    i7 = 32768;
                                    break;
                                case 16:
                                    i7 = 65536;
                                    break;
                                case 17:
                                    i7 = 131072;
                                    break;
                                case 18:
                                    i7 = 262144;
                                    break;
                                case 19:
                                    i7 = 524288;
                                    break;
                                case 20:
                                    i7 = 1048576;
                                    break;
                                case 21:
                                    i7 = 2097152;
                                    break;
                                case 22:
                                    i7 = 4194304;
                                    break;
                                case 23:
                                    i7 = 8388608;
                                    break;
                                default:
                                    i7 = -1;
                                    break;
                            }
                            if (i7 != -1) {
                                return new Pair(Integer.valueOf(i), Integer.valueOf(i7));
                            }
                            AbstractC4038mJ.f();
                        } else {
                            AbstractC4038mJ.f();
                        }
                    } catch (NumberFormatException unused) {
                        AbstractC4038mJ.f();
                    }
                }
                return null;
            case "avc1":
            case "avc2":
                if (strArrSplit.length < 2) {
                    AbstractC4038mJ.f();
                } else {
                    try {
                        if (strArrSplit[1].length() == 6) {
                            i3 = Integer.parseInt(strArrSplit[1].substring(0, 2), 16);
                            i4 = Integer.parseInt(strArrSplit[1].substring(4), 16);
                        } else if (strArrSplit.length >= 3) {
                            i3 = Integer.parseInt(strArrSplit[1]);
                            i4 = Integer.parseInt(strArrSplit[2]);
                        } else {
                            AbstractC4038mJ.f();
                        }
                        if (i3 == 66) {
                            i9 = 1;
                        } else if (i3 != 77) {
                            if (i3 == 88) {
                                i9 = 4;
                            } else if (i3 == 100) {
                                i9 = 8;
                            } else if (i3 == 110) {
                                i9 = 16;
                            } else if (i3 != 122) {
                                i9 = i3 != 244 ? -1 : 64;
                            } else {
                                i9 = 32;
                            }
                        }
                        if (i9 == -1) {
                            AbstractC4038mJ.f();
                        } else {
                            switch (i4) {
                                case 10:
                                    i7 = 1;
                                    break;
                                case 11:
                                    i7 = 4;
                                    break;
                                case 12:
                                    i7 = 8;
                                    break;
                                case 13:
                                    break;
                                default:
                                    switch (i4) {
                                        case 20:
                                            i7 = 32;
                                            break;
                                        case 21:
                                            i7 = 64;
                                            break;
                                        case 22:
                                            i7 = 128;
                                            break;
                                        default:
                                            switch (i4) {
                                                case 30:
                                                    i7 = 256;
                                                    break;
                                                case 31:
                                                    i7 = 512;
                                                    break;
                                                case 32:
                                                    i7 = 1024;
                                                    break;
                                                default:
                                                    switch (i4) {
                                                        case 40:
                                                            i7 = 2048;
                                                            break;
                                                        case 41:
                                                            i7 = 4096;
                                                            break;
                                                        case 42:
                                                            i7 = 8192;
                                                            break;
                                                        default:
                                                            switch (i4) {
                                                                case 50:
                                                                    i7 = 16384;
                                                                    break;
                                                                case 51:
                                                                    i7 = 32768;
                                                                    break;
                                                                case 52:
                                                                    i7 = 65536;
                                                                    break;
                                                                default:
                                                                    i7 = -1;
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
                            if (i7 != -1) {
                                return new Pair(Integer.valueOf(i9), Integer.valueOf(i7));
                            }
                            AbstractC4038mJ.f();
                        }
                    } catch (NumberFormatException unused2) {
                        AbstractC4038mJ.f();
                    }
                }
                return null;
            case "hev1":
            case "hvc1":
                if (strArrSplit.length < 4) {
                    AbstractC4038mJ.f();
                } else {
                    Matcher matcher2 = pattern.matcher(strArrSplit[1]);
                    if (matcher2.matches()) {
                        String strGroup2 = matcher2.group(1);
                        if ("1".equals(strGroup2)) {
                            i5 = 1;
                        } else if ("2".equals(strGroup2)) {
                            C2879Xf c2879Xf2 = c4619sw.x;
                            i5 = (c2879Xf2 == null || c2879Xf2.c != 6) ? 2 : 4096;
                        } else {
                            AbstractC4038mJ.f();
                        }
                        String str4 = strArrSplit[3];
                        if (str4 != null) {
                            switch (str4.hashCode()) {
                                case 70821:
                                    if (!str4.equals("H30")) {
                                    }
                                    break;
                                case 70914:
                                    if (!str4.equals("H60")) {
                                    }
                                    break;
                                case 70917:
                                    if (!str4.equals("H63")) {
                                    }
                                    break;
                                case 71007:
                                    if (!str4.equals("H90")) {
                                    }
                                    break;
                                case 71010:
                                    if (!str4.equals("H93")) {
                                    }
                                    break;
                                case 74665:
                                    if (!str4.equals("L30")) {
                                    }
                                    break;
                                case 74758:
                                    if (!str4.equals("L60")) {
                                    }
                                    break;
                                case 74761:
                                    if (!str4.equals("L63")) {
                                    }
                                    break;
                                case 74851:
                                    if (!str4.equals("L90")) {
                                    }
                                    break;
                                case 74854:
                                    if (!str4.equals("L93")) {
                                    }
                                    break;
                                case 2193639:
                                    if (!str4.equals("H120")) {
                                    }
                                    break;
                                case 2193642:
                                    if (!str4.equals("H123")) {
                                    }
                                    break;
                                case 2193732:
                                    if (!str4.equals("H150")) {
                                    }
                                    break;
                                case 2193735:
                                    if (!str4.equals("H153")) {
                                    }
                                    break;
                                case 2193738:
                                    if (!str4.equals("H156")) {
                                    }
                                    break;
                                case 2193825:
                                    if (!str4.equals("H180")) {
                                    }
                                    break;
                                case 2193828:
                                    if (!str4.equals("H183")) {
                                    }
                                    break;
                                case 2193831:
                                    if (!str4.equals("H186")) {
                                    }
                                    break;
                                case 2312803:
                                    if (!str4.equals("L120")) {
                                    }
                                    break;
                                case 2312806:
                                    if (!str4.equals("L123")) {
                                    }
                                    break;
                                case 2312896:
                                    if (!str4.equals("L150")) {
                                    }
                                    break;
                                case 2312899:
                                    if (!str4.equals("L153")) {
                                    }
                                    break;
                                case 2312902:
                                    if (!str4.equals("L156")) {
                                    }
                                    break;
                                case 2312989:
                                    if (!str4.equals("L180")) {
                                    }
                                    break;
                                case 2312992:
                                    if (!str4.equals("L183")) {
                                    }
                                    break;
                                case 2312995:
                                    if (!str4.equals("L186")) {
                                    }
                                    break;
                                default:
                                    break;
                            }
                            /*  JADX ERROR: Method code generation error
                                java.lang.NullPointerException: Switch insn not found in header
                                	at java.base/java.util.Objects.requireNonNull(Unknown Source)
                                	at jadx.core.codegen.RegionGen.makeSwitch(RegionGen.java:246)
                                	at jadx.core.dex.regions.SwitchRegion.generate(SwitchRegion.java:90)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                                	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                                	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:140)
                                	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                	at jadx.core.codegen.RegionGen.makeSwitch(RegionGen.java:267)
                                	at jadx.core.dex.regions.SwitchRegion.generate(SwitchRegion.java:90)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:291)
                                	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:270)
                                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:420)
                                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:345)
                                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:299)
                                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(Unknown Source)
                                	at java.base/java.util.ArrayList.forEach(Unknown Source)
                                	at java.base/java.util.stream.SortedOps$RefSortingSink.end(Unknown Source)
                                	at java.base/java.util.stream.Sink$ChainedReference.end(Unknown Source)
                                	at java.base/java.util.stream.ReferencePipeline$7$1FlatMap.end(Unknown Source)
                                	at java.base/java.util.stream.AbstractPipeline.copyInto(Unknown Source)
                                	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(Unknown Source)
                                	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(Unknown Source)
                                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(Unknown Source)
                                	at java.base/java.util.stream.AbstractPipeline.evaluate(Unknown Source)
                                	at java.base/java.util.stream.ReferencePipeline.forEach(Unknown Source)
                                	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:295)
                                	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:284)
                                	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:268)
                                	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:160)
                                	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:104)
                                	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:45)
                                	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:34)
                                	at jadx.core.codegen.CodeGen.generate(CodeGen.java:22)
                                	at jadx.core.ProcessClass.process(ProcessClass.java:89)
                                	at jadx.core.ProcessClass.generateCode(ProcessClass.java:127)
                                	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:405)
                                	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:393)
                                	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:343)
                                */
                            /*
                                Method dump skipped, instruction units count: 2316
                                To view this dump change 'Code comments level' option to 'DEBUG'
                            */
                            throw new UnsupportedOperationException("Method not decompiled: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.GN.d(gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.sw):android.util.Pair");
                        }

                        public static synchronized List e(String str, boolean z, boolean z2) {
                            EN c4710tz;
                            try {
                                CN cn = new CN(str, z, z2);
                                HashMap map = b;
                                List list = (List) map.get(cn);
                                if (list != null) {
                                    return list;
                                }
                                int i = Ug0.f3833a;
                                Object obj = null;
                                if (i >= 21) {
                                    C2329Ca c2329Ca = new C2329Ca();
                                    c2329Ca.f2927a = (z || z2) ? 1 : 0;
                                    c4710tz = c2329Ca;
                                } else {
                                    c4710tz = new C4710tz(obj);
                                }
                                ArrayList arrayListF = f(cn, c4710tz);
                                if (z && arrayListF.isEmpty() && 21 <= i && i <= 23) {
                                    arrayListF = f(cn, new C4710tz(obj));
                                    if (!arrayListF.isEmpty()) {
                                        String str2 = ((C4745uN) arrayListF.get(0)).f5075a;
                                        AbstractC4038mJ.f();
                                    }
                                }
                                a(str, arrayListF);
                                AC acJ = AC.j(arrayListF);
                                map.put(cn, acJ);
                                return acJ;
                            } catch (Throwable th) {
                                throw th;
                            }
                        }

                        /* JADX WARN: Code duplicated, block: B:9:0x002c  */
                        public static ArrayList f(CN cn, EN en) throws DN {
                            String strC;
                            int i;
                            boolean z;
                            boolean z2;
                            boolean zIsHardwareAccelerated;
                            boolean zIsVendor;
                            CN cn2 = cn;
                            try {
                                ArrayList arrayList = new ArrayList();
                                String str = cn2.f2917a;
                                int codecCount = en.getCodecCount();
                                boolean zSecureDecodersExplicit = en.secureDecodersExplicit();
                                int i2 = 0;
                                while (i2 < codecCount) {
                                    MediaCodecInfo codecInfoAt = en.getCodecInfoAt(i2);
                                    int i3 = Ug0.f3833a;
                                    if (i3 < 29 || !codecInfoAt.isAlias()) {
                                        String name = codecInfoAt.getName();
                                        if (g(codecInfoAt, name, zSecureDecodersExplicit, str) && (strC = c(codecInfoAt, name, str)) != null) {
                                            try {
                                                MediaCodecInfo.CodecCapabilities capabilitiesForType = codecInfoAt.getCapabilitiesForType(strC);
                                                boolean zC = en.c("tunneled-playback", strC, capabilitiesForType);
                                                boolean zF = en.f("tunneled-playback", capabilitiesForType);
                                                boolean z3 = cn2.c;
                                                if ((z3 || !zF) && (!z3 || zC)) {
                                                    boolean zC2 = en.c("secure-playback", strC, capabilitiesForType);
                                                    boolean zF2 = en.f("secure-playback", capabilitiesForType);
                                                    boolean z4 = cn2.b;
                                                    if ((z4 || !zF2) && (!z4 || zC2)) {
                                                        if (i3 >= 29) {
                                                            zIsHardwareAccelerated = codecInfoAt.isHardwareAccelerated();
                                                            z2 = true;
                                                        } else {
                                                            z2 = true;
                                                            zIsHardwareAccelerated = !h(codecInfoAt, str);
                                                        }
                                                        boolean zH = h(codecInfoAt, str);
                                                        if (i3 >= 29) {
                                                            zIsVendor = codecInfoAt.isVendor();
                                                        } else {
                                                            String strH0 = FW.h0(codecInfoAt.getName());
                                                            if (strH0.startsWith("omx.google.") || strH0.startsWith("c2.android.") || strH0.startsWith("c2.google.")) {
                                                                z2 = false;
                                                            }
                                                            zIsVendor = z2;
                                                        }
                                                        if (!(zSecureDecodersExplicit && z4 == zC2) && (zSecureDecodersExplicit || z4)) {
                                                            i = i2;
                                                            z = zSecureDecodersExplicit;
                                                            if (!z && zC2) {
                                                                arrayList.add(C4745uN.h(name + ".secure", str, strC, capabilitiesForType, zIsHardwareAccelerated, zH, zIsVendor, true));
                                                                return arrayList;
                                                            }
                                                        } else {
                                                            i = i2;
                                                            z = zSecureDecodersExplicit;
                                                            try {
                                                                arrayList.add(C4745uN.h(name, str, strC, capabilitiesForType, zIsHardwareAccelerated, zH, zIsVendor, false));
                                                            } catch (Exception e) {
                                                                e = e;
                                                                if (Ug0.f3833a > 23 || arrayList.isEmpty()) {
                                                                    AbstractC4038mJ.c();
                                                                    throw e;
                                                                }
                                                                AbstractC4038mJ.c();
                                                            }
                                                        }
                                                    } else {
                                                        i = i2;
                                                        z = zSecureDecodersExplicit;
                                                    }
                                                } else {
                                                    i = i2;
                                                    z = zSecureDecodersExplicit;
                                                }
                                            } catch (Exception e2) {
                                                e = e2;
                                                i = i2;
                                                z = zSecureDecodersExplicit;
                                            }
                                        } else {
                                            i = i2;
                                            z = zSecureDecodersExplicit;
                                        }
                                    } else {
                                        i = i2;
                                        z = zSecureDecodersExplicit;
                                    }
                                    i2 = i + 1;
                                    cn2 = cn;
                                    zSecureDecodersExplicit = z;
                                }
                                return arrayList;
                            } catch (Exception e3) {
                                throw new DN("Failed to query underlying media codecs", e3);
                            }
                        }

                        public static boolean g(MediaCodecInfo mediaCodecInfo, String str, boolean z, String str2) {
                            if (mediaCodecInfo.isEncoder() || (!z && str.endsWith(".secure"))) {
                                return false;
                            }
                            int i = Ug0.f3833a;
                            if (i < 21 && ("CIPAACDecoder".equals(str) || "CIPMP3Decoder".equals(str) || "CIPVorbisDecoder".equals(str) || "CIPAMRNBDecoder".equals(str) || "AACDecoder".equals(str) || "MP3Decoder".equals(str))) {
                                return false;
                            }
                            if (i < 18 && "OMX.MTK.AUDIO.DECODER.AAC".equals(str)) {
                                String str3 = Ug0.b;
                                if ("a70".equals(str3) || ("Xiaomi".equals(Ug0.c) && str3.startsWith("HM"))) {
                                    return false;
                                }
                            }
                            if (i == 16 && "OMX.qcom.audio.decoder.mp3".equals(str)) {
                                String str4 = Ug0.b;
                                if ("dlxu".equals(str4) || "protou".equals(str4) || "ville".equals(str4) || "villeplus".equals(str4) || "villec2".equals(str4) || str4.startsWith("gee") || "C6602".equals(str4) || "C6603".equals(str4) || "C6606".equals(str4) || "C6616".equals(str4) || "L36h".equals(str4) || "SO-02E".equals(str4)) {
                                    return false;
                                }
                            }
                            if (i == 16 && "OMX.qcom.audio.decoder.aac".equals(str)) {
                                String str5 = Ug0.b;
                                if ("C1504".equals(str5) || "C1505".equals(str5) || "C1604".equals(str5) || "C1605".equals(str5)) {
                                    return false;
                                }
                            }
                            if (i < 24 && (("OMX.SEC.aac.dec".equals(str) || "OMX.Exynos.AAC.Decoder".equals(str)) && "samsung".equals(Ug0.c))) {
                                String str6 = Ug0.b;
                                if (str6.startsWith("zeroflte") || str6.startsWith("zerolte") || str6.startsWith("zenlte") || "SC-05G".equals(str6) || "marinelteatt".equals(str6) || "404SC".equals(str6) || "SC-04G".equals(str6) || "SCV31".equals(str6)) {
                                    return false;
                                }
                            }
                            if (i <= 19 && "OMX.SEC.vp8.dec".equals(str) && "samsung".equals(Ug0.c)) {
                                String str7 = Ug0.b;
                                if (str7.startsWith("d2") || str7.startsWith("serrano") || str7.startsWith("jflte") || str7.startsWith("santos") || str7.startsWith("t0")) {
                                    return false;
                                }
                            }
                            if (i <= 19 && Ug0.b.startsWith("jflte") && "OMX.qcom.video.decoder.vp8".equals(str)) {
                                return false;
                            }
                            return (i <= 23 && MimeTypes.AUDIO_E_AC3_JOC.equals(str2) && "OMX.MTK.AUDIO.DECODER.DSPAC3".equals(str)) ? false : true;
                        }

                        public static boolean h(MediaCodecInfo mediaCodecInfo, String str) {
                            if (Ug0.f3833a >= 29) {
                                return mediaCodecInfo.isSoftwareOnly();
                            }
                            if (AbstractC5011xP.k(str)) {
                                return true;
                            }
                            String strH0 = FW.h0(mediaCodecInfo.getName());
                            if (strH0.startsWith("arc.")) {
                                return false;
                            }
                            if (strH0.startsWith("omx.google.") || strH0.startsWith("omx.ffmpeg.")) {
                                return true;
                            }
                            if ((strH0.startsWith("omx.sec.") && strH0.contains(".sw.")) || strH0.equals("omx.qcom.video.decoder.hevcswvdec") || strH0.startsWith("c2.android.") || strH0.startsWith("c2.google.")) {
                                return true;
                            }
                            return (strH0.startsWith("omx.") || strH0.startsWith("c2.")) ? false : true;
                        }

                        public static int i() {
                            MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
                            int i;
                            if (c == -1) {
                                int iMax = 0;
                                List listE = e("video/avc", false, false);
                                C4745uN c4745uN = listE.isEmpty() ? null : (C4745uN) listE.get(0);
                                if (c4745uN != null) {
                                    MediaCodecInfo.CodecCapabilities codecCapabilities = c4745uN.d;
                                    if (codecCapabilities == null || (codecProfileLevelArr = codecCapabilities.profileLevels) == null) {
                                        codecProfileLevelArr = new MediaCodecInfo.CodecProfileLevel[0];
                                    }
                                    int length = codecProfileLevelArr.length;
                                    int iMax2 = 0;
                                    while (iMax < length) {
                                        int i2 = codecProfileLevelArr[iMax].level;
                                        if (i2 != 1 && i2 != 2) {
                                            switch (i2) {
                                                case 8:
                                                case 16:
                                                case 32:
                                                    i = 101376;
                                                    break;
                                                case 64:
                                                    i = 202752;
                                                    break;
                                                case 128:
                                                case 256:
                                                    i = 414720;
                                                    break;
                                                case 512:
                                                    i = 921600;
                                                    break;
                                                case 1024:
                                                    i = 1310720;
                                                    break;
                                                case 2048:
                                                case 4096:
                                                    i = 2097152;
                                                    break;
                                                case 8192:
                                                    i = 2228224;
                                                    break;
                                                case 16384:
                                                    i = 5652480;
                                                    break;
                                                case 32768:
                                                case 65536:
                                                    i = 9437184;
                                                    break;
                                                case 131072:
                                                case 262144:
                                                case 524288:
                                                    i = 35651584;
                                                    break;
                                                default:
                                                    i = -1;
                                                    break;
                                            }
                                        } else {
                                            i = 25344;
                                        }
                                        iMax2 = Math.max(i, iMax2);
                                        iMax++;
                                    }
                                    iMax = Math.max(iMax2, Ug0.f3833a >= 21 ? 345600 : 172800);
                                }
                                c = iMax;
                            }
                            return c;
                        }
                    }
