package l1;

import android.app.UiModeManager;
import android.content.Context;
import android.graphics.Point;
import android.hardware.display.DisplayManager;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.Display;
import android.view.WindowManager;
import com.applovin.shadow.okhttp3.internal.ws.WebSocketProtocol;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.google.android.gms.internal.ads.bl0;
import com.google.android.gms.internal.play_billing.q1;
import com.ironsource.InterfaceC0435l1;
import com.ironsource.X3;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.TsExtractor;
import com.mbridge.msdk.playercommon.exoplayer2.source.chunk.ChunkedTrackBlacklistUtil;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.unity3d.ads.BuildConfig;
import com.unity3d.services.ads.gmascar.utils.ScarConstants;
import i1.d0;
import i1.e0;
import java.io.Closeable;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.nio.ByteOrder;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.MissingResourceException;
import java.util.Objects;
import java.util.TimeZone;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public abstract class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f44830a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final byte[] f44831b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final long[] f44832c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Pattern f44833d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Pattern f44834e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Pattern f44835f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static HashMap f44836g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final String[] f44837h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final String[] f44838i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int[] f44839j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int[] f44840k;
    public static final int[] l;

    static {
        int i10 = Build.VERSION.SDK_INT;
        String str = Build.DEVICE;
        String str2 = Build.MANUFACTURER;
        String str3 = Build.MODEL;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append(", ");
        sb2.append(str3);
        sb2.append(", ");
        sb2.append(str2);
        f44830a = d.k(sb2, ", ", i10);
        f44831b = new byte[0];
        f44832c = new long[0];
        f44833d = Pattern.compile("(\\d\\d\\d\\d)\\-(\\d\\d)\\-(\\d\\d)[Tt ](\\d\\d):(\\d\\d):(\\d\\d)([\\.,](\\d+))?([Zz]|((\\+|\\-)(\\d?\\d):?(\\d\\d)?))?");
        f44834e = Pattern.compile("^(-)?P(([0-9]*)Y)?(([0-9]*)M)?(([0-9]*)D)?(T(([0-9]*)H)?(([0-9]*)M)?(([0-9.]*)S)?)?$");
        Pattern.compile("%([A-Fa-f0-9]{2})");
        f44835f = Pattern.compile("(?:.*\\.)?isml?(?:/(manifest(.*))?)?", 2);
        f44837h = new String[]{"alb", "sq", "arm", "hy", "baq", "eu", "bur", "my", "tib", "bo", "chi", "zh", "cze", "cs", "dut", "nl", "ger", DownloadCommon.DOWNLOAD_REPORT_DOWNLOAD_ERROR, "gre", "el", "fre", "fr", "geo", "ka", "ice", "is", "mac", "mk", "mao", "mi", "may", "ms", "per", "fa", "rum", "ro", "scc", "hbs-srp", "slo", "sk", "wel", "cy", "id", "ms-ind", "iw", "he", "heb", "he", "ji", "yi", "arb", "ar-arb", ScarConstants.IN_SIGNAL_KEY, "ms-ind", "ind", "ms-ind", "nb", "no-nob", "nob", "no-nob", "nn", "no-nno", "nno", "no-nno", "tw", "ak-twi", "twi", "ak-twi", "bs", "hbs-bos", "bos", "hbs-bos", "hr", "hbs-hrv", "hrv", "hbs-hrv", "sr", "hbs-srp", "srp", "hbs-srp", "cmn", "zh-cmn", "hak", "zh-hak", "nan", "zh-nan", "hsn", "zh-hsn"};
        f44838i = new String[]{"i-lux", "lb", "i-hak", "zh-hak", "i-navajo", "nv", "no-bok", "no-nob", "no-nyn", "no-nno", "zh-guoyu", "zh-cmn", "zh-hakka", "zh-hak", "zh-min-nan", "zh-nan", "zh-xiang", "zh-hsn"};
        f44839j = new int[]{0, 79764919, 159529838, 222504665, 319059676, 398814059, 445009330, 507990021, 638119352, 583659535, 797628118, 726387553, 890018660, 835552979, 1015980042, 944750013, 1276238704, 1221641927, 1167319070, 1095957929, 1595256236, 1540665371, 1452775106, 1381403509, 1780037320, 1859660671, 1671105958, 1733955601, 2031960084, 2111593891, 1889500026, 1952343757, -1742489888, -1662866601, -1851683442, -1788833735, -1960329156, -1880695413, -2103051438, -2040207643, -1104454824, -1159051537, -1213636554, -1284997759, -1389417084, -1444007885, -1532160278, -1603531939, -734892656, -789352409, -575645954, -646886583, -952755380, -1007220997, -827056094, -898286187, -231047128, -151282273, -71779514, -8804623, -515967244, -436212925, -390279782, -327299027, 881225847, 809987520, 1023691545, 969234094, 662832811, 591600412, 771767749, 717299826, 311336399, 374308984, 453813921, 533576470, 25881363, 88864420, 134795389, 214552010, 2023205639, 2086057648, 1897238633, 1976864222, 1804852699, 1867694188, 1645340341, 1724971778, 1587496639, 1516133128, 1461550545, 1406951526, 1302016099, 1230646740, 1142491917, 1087903418, -1398421865, -1469785312, -1524105735, -1578704818, -1079922613, -1151291908, -1239184603, -1293773166, -1968362705, -1905510760, -2094067647, -2014441994, -1716953613, -1654112188, -1876203875, -1796572374, -525066777, -462094256, -382327159, -302564546, -206542021, -143559028, -97365931, -17609246, -960696225, -1031934488, -817968335, -872425850, -709327229, -780559564, -600130067, -654598054, 1762451694, 1842216281, 1619975040, 1682949687, 2047383090, 2127137669, 1938468188, 2001449195, 1325665622, 1271206113, 1183200824, 1111960463, 1543535498, 1489069629, 1434599652, 1363369299, 622672798, 568075817, 748617968, 677256519, 907627842, 853037301, 1067152940, 995781531, 51762726, 131386257, 177728840, 240578815, 269590778, 349224269, 429104020, 491947555, -248556018, -168932423, -122852000, -60002089, -500490030, -420856475, -341238852, -278395381, -685261898, -739858943, -559578920, -630940305, -1004286614, -1058877219, -845023740, -916395085, -1119974018, -1174433591, -1262701040, -1333941337, -1371866206, -1426332139, -1481064244, -1552294533, -1690935098, -1611170447, -1833673816, -1770699233, -2009983462, -1930228819, -2119160460, -2056179517, 1569362073, 1498123566, 1409854455, 1355396672, 1317987909, 1246755826, 1192025387, 1137557660, 2072149281, 2135122070, 1912620623, 1992383480, 1753615357, 1816598090, 1627664531, 1707420964, 295390185, 358241886, 404320391, 483945776, 43990325, 106832002, 186451547, 266083308, 932423249, 861060070, 1041341759, 986742920, 613929101, 542559546, 756411363, 701822548, -978770311, -1050133554, -869589737, -924188512, -693284699, -764654318, -550540341, -605129092, -475935807, -413084042, -366743377, -287118056, -257573603, -194731862, -114850189, -35218492, -1984365303, -1921392450, -2143631769, -2063868976, -1698919467, -1635936670, -1824608069, -1744851700, -1347415887, -1418654458, -1506661409, -1561119128, -1129027987, -1200260134, -1254728445, -1309196108};
        f44840k = new int[]{0, 4129, 8258, 12387, 16516, 20645, 24774, 28903, 33032, 37161, 41290, 45419, 49548, 53677, 57806, 61935};
        l = new int[]{0, 7, 14, 9, 28, 27, 18, 21, 56, 63, 54, 49, 36, 35, 42, 45, InterfaceC0435l1.d.b.f29113j, 119, WebSocketProtocol.PAYLOAD_SHORT, 121, 108, 107, 98, InterfaceC0435l1.d.b.f29105b, 72, 79, 70, 65, 84, 83, 90, 93, 224, 231, 238, 233, 252, 251, 242, 245, 216, 223, 214, 209, 196, 195, InterfaceC0435l1.c.b.f29097c, InterfaceC0435l1.c.b.f29100f, 144, 151, 158, 153, 140, 139, TsExtractor.TS_STREAM_TYPE_HDMV_DTS, 133, 168, 175, 166, 161, 180, 179, 186, PsExtractor.PRIVATE_STREAM_1, 199, PsExtractor.AUDIO_STREAM, InterfaceC0435l1.c.b.f29096b, InterfaceC0435l1.c.b.f29101g, 219, 220, 213, 210, 255, 248, 241, 246, 227, 228, 237, 234, 183, 176, ModuleDescriptor.MODULE_VERSION, 190, 171, 172, 165, 162, 143, 136, TsExtractor.TS_STREAM_TYPE_AC3, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 147, 148, 157, 154, 39, 32, 41, 46, 59, 60, 53, 50, 31, 24, 17, 22, 3, 4, 13, 10, 87, 80, 89, 94, 75, 76, 69, 66, InterfaceC0435l1.d.b.f29112i, InterfaceC0435l1.d.b.f29108e, 97, InterfaceC0435l1.d.b.f29106c, 115, 116, 125, 122, 137, 142, TsExtractor.TS_STREAM_TYPE_E_AC3, 128, 149, 146, 155, 156, 177, 182, 191, 184, 173, 170, 163, 164, 249, 254, 247, PsExtractor.VIDEO_STREAM_MASK, 229, 226, 235, 236, 193, 198, InterfaceC0435l1.c.b.f29102h, 200, 221, 218, 211, 212, InterfaceC0435l1.d.b.f29109f, InterfaceC0435l1.d.b.f29111h, InterfaceC0435l1.d.b.f29107d, 96, 117, 114, 123, 124, 81, 86, 95, 88, 77, 74, 67, 68, 25, 30, 23, 16, 5, 2, 11, 12, 33, 38, 47, 40, 61, 58, 51, 52, 78, 73, 64, 71, 82, 85, 92, 91, 118, InterfaceC0435l1.d.b.f29114k, 120, 127, 106, InterfaceC0435l1.d.b.f29110g, 100, 99, 62, 57, 48, 55, 34, 37, 44, 43, 6, 1, 8, 15, 26, 29, 20, 19, 174, 169, 160, 167, 178, 181, 188, 187, 150, 145, 152, 159, TsExtractor.TS_STREAM_TYPE_DTS, 141, 132, 131, 222, 217, 208, 215, 194, 197, 204, InterfaceC0435l1.c.b.f29098d, 230, 225, 232, 239, 250, 253, 244, 243};
    }

    public static long A(long j10, float f10) {
        return f10 == 1.0f ? j10 : Math.round(j10 * ((double) f10));
    }

    public static long B(long j10) {
        return j10 == C.TIME_UNSET ? System.currentTimeMillis() : SystemClock.elapsedRealtime() + j10;
    }

    public static int C(int i10, ByteOrder byteOrder) {
        if (i10 == 8) {
            return 3;
        }
        if (i10 == 16) {
            return byteOrder.equals(ByteOrder.LITTLE_ENDIAN) ? 2 : 268435456;
        }
        if (i10 == 24) {
            return byteOrder.equals(ByteOrder.LITTLE_ENDIAN) ? 21 : 1342177280;
        }
        if (i10 != 32) {
            return 0;
        }
        return byteOrder.equals(ByteOrder.LITTLE_ENDIAN) ? 22 : 1610612736;
    }

    public static long D(long j10, float f10) {
        return f10 == 1.0f ? j10 : Math.round(j10 / ((double) f10));
    }

    public static String E(int i10) {
        switch (i10) {
            case -2:
                return "none";
            case -1:
                return "unknown";
            case 0:
                return BuildConfig.FLAVOR;
            case 1:
                return "audio";
            case 2:
                return "video";
            case 3:
                return "text";
            case 4:
                return "image";
            case 5:
                return TtmlNode.TAG_METADATA;
            case 6:
                return "camera motion";
            default:
                return i10 >= 10000 ? defpackage.e.h(i10, "custom (", ")") : "?";
        }
    }

    /* JADX WARN: Code duplicated, block: B:76:0x00e1 A[RETURN] */
    public static int F(Uri uri, String str) {
        int i10;
        if (str != null) {
            switch (str) {
                case "application/x-mpegURL":
                    return 2;
                case "application/vnd.ms-sstr+xml":
                    return 1;
                case "application/dash+xml":
                    return 0;
                case "application/x-rtsp":
                    return 3;
                default:
                    return 4;
            }
        }
        String scheme = uri.getScheme();
        if (scheme == null || (!q1.m("rtsp", scheme) && !q1.m("rtspt", scheme))) {
            String lastPathSegment = uri.getLastPathSegment();
            if (lastPathSegment != null) {
                int iLastIndexOf = lastPathSegment.lastIndexOf(46);
                if (iLastIndexOf >= 0) {
                    String strF = q1.F(lastPathSegment.substring(iLastIndexOf + 1));
                    strF.getClass();
                    switch (strF.hashCode()) {
                        case 104579:
                            if (strF.equals("ism")) {
                            }
                            break;
                        case 108321:
                            if (strF.equals("mpd")) {
                            }
                            break;
                        case 3242057:
                            if (strF.equals("isml")) {
                            }
                            break;
                        case 3299913:
                            if (strF.equals("m3u8")) {
                            }
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
                        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                        	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
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
                        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:414)
                        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:402)
                        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:352)
                        */
                    /*
                        Method dump skipped, instruction units count: 286
                        To view this dump change 'Code comments level' option to 'DEBUG'
                    */
                    throw new UnsupportedOperationException("Method not decompiled: l1.y.F(android.net.Uri, java.lang.String):int");
                }

                public static void G(int i10) {
                    Integer.toString(i10, 36);
                }

                public static boolean H(int i10) {
                    return i10 == 3 || i10 == 2 || i10 == 268435456 || i10 == 21 || i10 == 1342177280 || i10 == 22 || i10 == 1610612736 || i10 == 4;
                }

                public static boolean I(Context context) {
                    int i10 = Build.VERSION.SDK_INT;
                    if (context.getApplicationInfo().targetSdkVersion < 29) {
                        return true;
                    }
                    if (i10 == 30) {
                        String str = Build.MODEL;
                        if (q1.m(str, "moto g(20)") || q1.m(str, "rmx3231")) {
                            return true;
                        }
                    }
                    return i10 == 34 && q1.m(Build.MODEL, "sm-x200");
                }

                public static boolean J(int i10) {
                    return i10 == 10 || i10 == 13;
                }

                public static boolean K(Context context) {
                    UiModeManager uiModeManager = (UiModeManager) context.getApplicationContext().getSystemService("uimode");
                    return uiModeManager != null && uiModeManager.getCurrentModeType() == 4;
                }

                public static boolean L(q qVar, q qVar2, Inflater inflater) {
                    if (qVar.a() > 0 && qVar.j() == 120 && qVar.a() != 0) {
                        if (qVar2.f44813a.length < qVar.a()) {
                            qVar2.c(qVar.a() * 2);
                        }
                        if (inflater == null) {
                            inflater = new Inflater();
                        }
                        inflater.setInput(qVar.f44813a, qVar.f44814b, qVar.a());
                        int iInflate = 0;
                        while (true) {
                            try {
                                byte[] bArr = qVar2.f44813a;
                                iInflate += inflater.inflate(bArr, iInflate, bArr.length - iInflate);
                                if (inflater.finished()) {
                                    qVar2.L(iInflate);
                                    inflater.reset();
                                    return true;
                                }
                                if (!inflater.needsDictionary() && !inflater.needsInput()) {
                                    byte[] bArr2 = qVar2.f44813a;
                                    if (iInflate == bArr2.length) {
                                        qVar2.c(bArr2.length * 2);
                                    }
                                }
                            } catch (DataFormatException unused) {
                            } catch (Throwable th2) {
                                inflater.reset();
                                throw th2;
                            }
                            inflater.reset();
                        }
                    }
                    return false;
                }

                public static long M(long j10) {
                    return (j10 == C.TIME_UNSET || j10 == Long.MIN_VALUE) ? j10 : j10 * 1000;
                }

                public static String N(String str) {
                    if (str == null) {
                        return null;
                    }
                    String strReplace = str.replace('_', '-');
                    if (!strReplace.isEmpty() && !strReplace.equals(C.LANGUAGE_UNDETERMINED)) {
                        str = strReplace;
                    }
                    String strF = q1.F(str);
                    int i10 = 0;
                    String str2 = strF.split("-", 2)[0];
                    if (f44836g == null) {
                        String[] iSOLanguages = Locale.getISOLanguages();
                        int length = iSOLanguages.length;
                        String[] strArr = f44837h;
                        HashMap map = new HashMap(length + strArr.length);
                        for (String str3 : iSOLanguages) {
                            try {
                                String iSO3Language = new Locale(str3).getISO3Language();
                                if (!TextUtils.isEmpty(iSO3Language)) {
                                    map.put(iSO3Language, str3);
                                }
                            } catch (MissingResourceException unused) {
                            }
                        }
                        for (int i11 = 0; i11 < strArr.length; i11 += 2) {
                            map.put(strArr[i11], strArr[i11 + 1]);
                        }
                        f44836g = map;
                    }
                    String str4 = (String) f44836g.get(str2);
                    if (str4 != null) {
                        StringBuilder sbI = d5.u.i(str4);
                        sbI.append(strF.substring(str2.length()));
                        strF = sbI.toString();
                        str2 = str4;
                    }
                    if (!"no".equals(str2) && !"i".equals(str2) && !"zh".equals(str2)) {
                        return strF;
                    }
                    while (true) {
                        String[] strArr2 = f44838i;
                        if (i10 >= strArr2.length) {
                            return strF;
                        }
                        if (strF.startsWith(strArr2[i10])) {
                            return strArr2[i10 + 1] + strF.substring(strArr2[i10].length());
                        }
                        i10 += 2;
                    }
                }

                public static Object[] O(Object[] objArr, int i10) {
                    go.k.i(i10 <= objArr.length);
                    return Arrays.copyOf(objArr, i10);
                }

                public static long P(String str) throws e0 {
                    Matcher matcher = f44833d.matcher(str);
                    if (!matcher.matches()) {
                        throw e0.a(null, "Invalid date/time format: " + str);
                    }
                    int i10 = 0;
                    if (matcher.group(9) != null && !matcher.group(9).equalsIgnoreCase("Z")) {
                        int i11 = Integer.parseInt(matcher.group(12)) * 60;
                        String strGroup = matcher.group(13);
                        i10 = strGroup != null ? Integer.parseInt(strGroup) + i11 : i11;
                        if ("-".equals(matcher.group(11))) {
                            i10 *= -1;
                        }
                    }
                    GregorianCalendar gregorianCalendar = new GregorianCalendar(TimeZone.getTimeZone("GMT"));
                    gregorianCalendar.clear();
                    gregorianCalendar.set(Integer.parseInt(matcher.group(1)), Integer.parseInt(matcher.group(2)) - 1, Integer.parseInt(matcher.group(3)), Integer.parseInt(matcher.group(4)), Integer.parseInt(matcher.group(5)), Integer.parseInt(matcher.group(6)));
                    if (!TextUtils.isEmpty(matcher.group(8))) {
                        gregorianCalendar.set(14, new BigDecimal("0." + matcher.group(8)).movePointRight(3).intValue());
                    }
                    long timeInMillis = gregorianCalendar.getTimeInMillis();
                    return i10 != 0 ? timeInMillis - (((long) i10) * ChunkedTrackBlacklistUtil.DEFAULT_TRACK_BLACKLIST_MS) : timeInMillis;
                }

                public static void Q(Handler handler, Runnable runnable) {
                    Looper looper = handler.getLooper();
                    if (looper.getThread().isAlive()) {
                        if (looper == Looper.myLooper()) {
                            runnable.run();
                        } else {
                            handler.post(runnable);
                        }
                    }
                }

                public static void R(ArrayList arrayList, int i10, int i11) {
                    if (i10 < 0 || i11 > arrayList.size() || i10 > i11) {
                        throw new IllegalArgumentException();
                    }
                    if (i10 != i11) {
                        arrayList.subList(i10, i11).clear();
                    }
                }

                public static long S(int i10, long j10) {
                    return U(j10, 1000000L, i10, RoundingMode.DOWN);
                }

                public static void T(long[] jArr, long j10) {
                    long j11;
                    RoundingMode roundingMode = RoundingMode.DOWN;
                    int i10 = 0;
                    if (j10 >= 1000000 && j10 % 1000000 == 0) {
                        long j12 = com.bumptech.glide.c.j(j10, 1000000L, RoundingMode.UNNECESSARY);
                        while (i10 < jArr.length) {
                            jArr[i10] = com.bumptech.glide.c.j(jArr[i10], j12, roundingMode);
                            i10++;
                        }
                        return;
                    }
                    if (j10 < 1000000 && 1000000 % j10 == 0) {
                        long j13 = com.bumptech.glide.c.j(1000000L, j10, RoundingMode.UNNECESSARY);
                        while (i10 < jArr.length) {
                            jArr[i10] = com.bumptech.glide.c.E(jArr[i10], j13);
                            i10++;
                        }
                        return;
                    }
                    int i11 = 0;
                    while (i11 < jArr.length) {
                        long j14 = jArr[i11];
                        if (j14 != 0) {
                            if (j10 >= j14 && j10 % j14 == 0) {
                                jArr[i11] = com.bumptech.glide.c.j(1000000L, com.bumptech.glide.c.j(j10, j14, RoundingMode.UNNECESSARY), roundingMode);
                            } else if (j10 >= j14 || j14 % j10 != 0) {
                                j11 = j10;
                                jArr[i11] = V(j14, 1000000L, j11, roundingMode);
                            } else {
                                jArr[i11] = com.bumptech.glide.c.E(1000000L, com.bumptech.glide.c.j(j14, j10, RoundingMode.UNNECESSARY));
                            }
                            j11 = j10;
                        } else {
                            j11 = j10;
                        }
                        i11++;
                        j10 = j11;
                    }
                }

                public static long U(long j10, long j11, long j12, RoundingMode roundingMode) {
                    if (j10 == 0 || j11 == 0) {
                        return 0L;
                    }
                    if (j12 >= j11 && j12 % j11 == 0) {
                        return com.bumptech.glide.c.j(j10, com.bumptech.glide.c.j(j12, j11, RoundingMode.UNNECESSARY), roundingMode);
                    }
                    if (j12 < j11 && j11 % j12 == 0) {
                        return com.bumptech.glide.c.E(j10, com.bumptech.glide.c.j(j11, j12, RoundingMode.UNNECESSARY));
                    }
                    if (j12 < j10 || j12 % j10 != 0) {
                        return (j12 >= j10 || j10 % j12 != 0) ? V(j10, j11, j12, roundingMode) : com.bumptech.glide.c.E(j11, com.bumptech.glide.c.j(j10, j12, RoundingMode.UNNECESSARY));
                    }
                    return com.bumptech.glide.c.j(j11, com.bumptech.glide.c.j(j12, j10, RoundingMode.UNNECESSARY), roundingMode);
                }

                /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
                /* JADX WARN: Code duplicated, block: B:54:0x00de  */
                /* JADX WARN: Code duplicated, block: B:58:0x00f0  */
                /* JADX WARN: Code duplicated, block: B:59:0x00f2  */
                /* JADX WARN: Code duplicated, block: B:63:0x00f8  */
                /* JADX WARN: Code duplicated, block: B:66:0x00fd  */
                /* JADX WARN: Code duplicated, block: B:68:0x00ff  */
                /* JADX WARN: Instruction removed from duplicated block: B:68:0x00ff, please report this as an issue */
                public static long V(long j10, long j11, long j12, RoundingMode roundingMode) {
                    double dRint;
                    long j13;
                    boolean z10;
                    long jE = com.bumptech.glide.c.E(j10, j11);
                    if (jE != Long.MAX_VALUE && jE != Long.MIN_VALUE) {
                        return com.bumptech.glide.c.j(jE, j12, roundingMode);
                    }
                    long jN = com.bumptech.glide.c.n(Math.abs(j11), Math.abs(j12));
                    RoundingMode roundingMode2 = RoundingMode.UNNECESSARY;
                    long j14 = com.bumptech.glide.c.j(j11, jN, roundingMode2);
                    long j15 = com.bumptech.glide.c.j(j12, jN, roundingMode2);
                    long jN2 = com.bumptech.glide.c.n(Math.abs(j10), Math.abs(j15));
                    long j16 = com.bumptech.glide.c.j(j10, jN2, roundingMode2);
                    long j17 = com.bumptech.glide.c.j(j15, jN2, roundingMode2);
                    long jE2 = com.bumptech.glide.c.E(j16, j14);
                    if (jE2 != Long.MAX_VALUE && jE2 != Long.MIN_VALUE) {
                        return com.bumptech.glide.c.j(jE2, j17, roundingMode);
                    }
                    double d10 = j16 * (j14 / j17);
                    if (d10 > 9.223372036854776E18d) {
                        return Long.MAX_VALUE;
                    }
                    if (d10 < -9.223372036854776E18d) {
                        return Long.MIN_VALUE;
                    }
                    int i10 = ra.c.f49517a;
                    if (!android.support.v4.media.session.a.x(d10)) {
                        throw new ArithmeticException("input is infinite or NaN");
                    }
                    switch (ra.b.f49516a[roundingMode.ordinal()]) {
                        case 1:
                            com.bumptech.glide.d.k(ra.c.a(d10));
                            dRint = d10;
                            if ((-9.223372036854776E18d) - dRint < 1.0d) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            if (z10 && (dRint < 9.223372036854776E18d)) {
                                return (long) dRint;
                            }
                            throw new ArithmeticException("rounded value is out of range for input " + d10 + " and rounding mode " + roundingMode);
                        case 2:
                            if (d10 >= 0.0d || ra.c.a(d10)) {
                                dRint = d10;
                            } else {
                                j13 = ((long) d10) - 1;
                                dRint = j13;
                            }
                            if ((-9.223372036854776E18d) - dRint < 1.0d) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            if (z10 && (dRint < 9.223372036854776E18d)) {
                                return (long) dRint;
                            }
                            throw new ArithmeticException("rounded value is out of range for input " + d10 + " and rounding mode " + roundingMode);
                        case 3:
                            if (d10 <= 0.0d || ra.c.a(d10)) {
                                dRint = d10;
                            } else {
                                j13 = ((long) d10) + 1;
                                dRint = j13;
                            }
                            if ((-9.223372036854776E18d) - dRint < 1.0d) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            if (z10 && (dRint < 9.223372036854776E18d)) {
                                return (long) dRint;
                            }
                            throw new ArithmeticException("rounded value is out of range for input " + d10 + " and rounding mode " + roundingMode);
                        case 4:
                            dRint = d10;
                            if ((-9.223372036854776E18d) - dRint < 1.0d) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            if (z10 && (dRint < 9.223372036854776E18d)) {
                                return (long) dRint;
                            }
                            throw new ArithmeticException("rounded value is out of range for input " + d10 + " and rounding mode " + roundingMode);
                        case 5:
                            if (ra.c.a(d10)) {
                                dRint = d10;
                            } else {
                                dRint = ((long) d10) + ((long) (d10 > 0.0d ? 1 : -1));
                            }
                            if ((-9.223372036854776E18d) - dRint < 1.0d) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            if (z10 && (dRint < 9.223372036854776E18d)) {
                                return (long) dRint;
                            }
                            throw new ArithmeticException("rounded value is out of range for input " + d10 + " and rounding mode " + roundingMode);
                        case 6:
                            dRint = Math.rint(d10);
                            if ((-9.223372036854776E18d) - dRint < 1.0d) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            if (z10 && (dRint < 9.223372036854776E18d)) {
                                return (long) dRint;
                            }
                            throw new ArithmeticException("rounded value is out of range for input " + d10 + " and rounding mode " + roundingMode);
                        case 7:
                            dRint = Math.rint(d10);
                            if (Math.abs(d10 - dRint) == 0.5d) {
                                dRint = Math.copySign(0.5d, d10) + d10;
                            }
                            if ((-9.223372036854776E18d) - dRint < 1.0d) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            if (z10 && (dRint < 9.223372036854776E18d)) {
                                return (long) dRint;
                            }
                            throw new ArithmeticException("rounded value is out of range for input " + d10 + " and rounding mode " + roundingMode);
                        case 8:
                            dRint = Math.rint(d10);
                            if (Math.abs(d10 - dRint) == 0.5d) {
                                dRint = d10;
                            }
                            if ((-9.223372036854776E18d) - dRint < 1.0d) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            if (z10 && (dRint < 9.223372036854776E18d)) {
                                return (long) dRint;
                            }
                            throw new ArithmeticException("rounded value is out of range for input " + d10 + " and rounding mode " + roundingMode);
                        default:
                            throw new AssertionError();
                    }
                }

                public static String[] W(String str) {
                    return TextUtils.isEmpty(str) ? new String[0] : str.trim().split("(\\s*,\\s*)", -1);
                }

                public static String X(int i10) {
                    return new String(new byte[]{(byte) (i10 >> 24), (byte) (i10 >> 16), (byte) (i10 >> 8), (byte) i10}, StandardCharsets.US_ASCII);
                }

                public static String Y(byte[] bArr) {
                    boolean z10;
                    qa.b bVar = qa.e.f48910f;
                    qa.e bVar2 = bVar.f48913c;
                    if (bVar2 == null) {
                        qa.a aVarB = bVar.f48911a;
                        char[] cArr = aVarB.f48900b;
                        for (char c4 : cArr) {
                            if (q1.w(c4)) {
                                int length = cArr.length;
                                int i10 = 0;
                                while (true) {
                                    if (i10 >= length) {
                                        z10 = false;
                                        break;
                                    }
                                    char c5 = cArr[i10];
                                    if (c5 >= 'a' && c5 <= 'z') {
                                        z10 = true;
                                        break;
                                    }
                                    i10++;
                                }
                                go.k.s("Cannot call lowerCase() on a mixed-case alphabet", !z10);
                                char[] cArr2 = new char[cArr.length];
                                for (int i11 = 0; i11 < cArr.length; i11++) {
                                    char c10 = cArr[i11];
                                    if (q1.w(c10)) {
                                        c10 = (char) (c10 ^ ' ');
                                    }
                                    cArr2[i11] = c10;
                                }
                                qa.a aVar = new qa.a(defpackage.e.q(aVarB.f48899a, ".lowerCase()", new StringBuilder()), cArr2);
                                if (!aVarB.f48907i) {
                                    aVarB = aVar;
                                    break;
                                }
                                aVarB = aVar.b();
                                break;
                            }
                        }
                        bVar2 = aVarB == bVar.f48911a ? bVar : new qa.b(aVarB);
                        bVar.f48913c = bVar2;
                    }
                    return bVar2.b(bArr);
                }

                public static long Z(long j10) {
                    return (j10 == C.TIME_UNSET || j10 == Long.MIN_VALUE) ? j10 : j10 / 1000;
                }

                public static long a(long j10, long j11) {
                    long j12 = j10 + j11;
                    long j13 = (((j11 ^ j10) > 0L ? 1 : ((j11 ^ j10) == 0L ? 0 : -1)) < 0) | ((j10 ^ j12) >= 0) ? j12 : ((j12 >>> 63) ^ 1) + Long.MAX_VALUE;
                    if ((j13 != Long.MIN_VALUE || j12 == Long.MIN_VALUE) && (j13 != Long.MAX_VALUE || j12 == Long.MAX_VALUE)) {
                        return j13;
                    }
                    return Long.MAX_VALUE;
                }

                public static int b(long[] jArr, long j10, boolean z10) {
                    int i10;
                    int iBinarySearch = Arrays.binarySearch(jArr, j10);
                    if (iBinarySearch < 0) {
                        return ~iBinarySearch;
                    }
                    while (true) {
                        i10 = iBinarySearch + 1;
                        if (i10 >= jArr.length || jArr[i10] != j10) {
                            break;
                        }
                        iBinarySearch = i10;
                    }
                    return z10 ? iBinarySearch : i10;
                }

                public static int c(bl0 bl0Var, long j10) {
                    int i10 = bl0Var.f12818a - 1;
                    int i11 = 0;
                    while (i11 <= i10) {
                        int i12 = (i11 + i10) >>> 1;
                        if (bl0Var.c(i12) < j10) {
                            i11 = i12 + 1;
                        } else {
                            i10 = i12 - 1;
                        }
                    }
                    int i13 = i10 + 1;
                    if (i13 < bl0Var.f12818a && bl0Var.c(i13) == j10) {
                        return i13;
                    }
                    if (i10 == -1) {
                        return 0;
                    }
                    return i10;
                }

                public static int d(List list, Long l10, boolean z10) {
                    int i10;
                    int iBinarySearch = Collections.binarySearch(list, l10);
                    if (iBinarySearch < 0) {
                        i10 = -(iBinarySearch + 2);
                    } else {
                        while (true) {
                            int i11 = iBinarySearch - 1;
                            if (i11 < 0 || ((Comparable) list.get(i11)).compareTo(l10) != 0) {
                                break;
                            }
                            iBinarySearch = i11;
                        }
                        i10 = iBinarySearch;
                    }
                    return z10 ? Math.max(0, i10) : i10;
                }

                public static int e(int[] iArr, int i10, boolean z10, boolean z11) {
                    int i11;
                    int i12;
                    int iBinarySearch = Arrays.binarySearch(iArr, i10);
                    if (iBinarySearch < 0) {
                        i12 = -(iBinarySearch + 2);
                    } else {
                        while (true) {
                            i11 = iBinarySearch - 1;
                            if (i11 < 0 || iArr[i11] != i10) {
                                break;
                            }
                            iBinarySearch = i11;
                        }
                        i12 = z10 ? iBinarySearch : i11;
                    }
                    return z11 ? Math.max(0, i12) : i12;
                }

                public static int f(long[] jArr, long j10, boolean z10) {
                    int i10;
                    int iBinarySearch = Arrays.binarySearch(jArr, j10);
                    if (iBinarySearch < 0) {
                        i10 = -(iBinarySearch + 2);
                    } else {
                        while (true) {
                            int i11 = iBinarySearch - 1;
                            if (i11 < 0 || jArr[i11] != j10) {
                                break;
                            }
                            iBinarySearch = i11;
                        }
                        i10 = iBinarySearch;
                    }
                    return z10 ? Math.max(0, i10) : i10;
                }

                public static int g(int i10, int i11) {
                    return ((i10 + i11) - 1) / i11;
                }

                public static void h(Closeable closeable) {
                    if (closeable != null) {
                        try {
                            closeable.close();
                        } catch (IOException unused) {
                        }
                    }
                }

                public static float i(float f10, float f11, float f12) {
                    return Math.max(f11, Math.min(f10, f12));
                }

                public static int j(int i10, int i11, int i12) {
                    return Math.max(i11, Math.min(i10, i12));
                }

                public static long k(long j10, long j11, long j12) {
                    return Math.max(j11, Math.min(j10, j12));
                }

                public static boolean l(SparseArray sparseArray, int i10) {
                    return sparseArray.indexOfKey(i10) >= 0;
                }

                public static boolean m(Object[] objArr, Object obj) {
                    for (Object obj2 : objArr) {
                        if (Objects.equals(obj2, obj)) {
                            return true;
                        }
                    }
                    return false;
                }

                public static boolean n(SparseArray sparseArray, SparseArray sparseArray2) {
                    if (sparseArray == null) {
                        return sparseArray2 == null;
                    }
                    if (sparseArray2 == null) {
                        return false;
                    }
                    if (Build.VERSION.SDK_INT >= 31) {
                        return sparseArray.contentEquals(sparseArray2);
                    }
                    int size = sparseArray.size();
                    if (size != sparseArray2.size()) {
                        return false;
                    }
                    for (int i10 = 0; i10 < size; i10++) {
                        if (!Objects.equals(sparseArray.valueAt(i10), sparseArray2.get(sparseArray.keyAt(i10)))) {
                            return false;
                        }
                    }
                    return true;
                }

                public static int o(SparseArray sparseArray) {
                    if (Build.VERSION.SDK_INT >= 31) {
                        return sparseArray.contentHashCode();
                    }
                    int iHashCode = 17;
                    for (int i10 = 0; i10 < sparseArray.size(); i10++) {
                        iHashCode = Objects.hashCode(sparseArray.valueAt(i10)) + ((sparseArray.keyAt(i10) + (iHashCode * 31)) * 31);
                    }
                    return iHashCode;
                }

                public static int p(int i10, int i11, int i12, byte[] bArr) {
                    while (i10 < i11) {
                        i12 = f44839j[((i12 >>> 24) ^ (bArr[i10] & 255)) & 255] ^ (i12 << 8);
                        i10++;
                    }
                    return i12;
                }

                public static Handler q(Handler.Callback callback) {
                    Looper looperMyLooper = Looper.myLooper();
                    looperMyLooper.getClass();
                    return new Handler(looperMyLooper, callback);
                }

                public static int r(int i10) {
                    if (i10 == 30) {
                        return 34;
                    }
                    switch (i10) {
                        case 2:
                        case 3:
                            return 3;
                        case 4:
                        case 5:
                        case 6:
                            return 21;
                        case 7:
                        case 8:
                            return 23;
                        case 9:
                        case 10:
                        case 11:
                        case 12:
                            return 28;
                        default:
                            switch (i10) {
                                case 14:
                                    return 25;
                                case 15:
                                case 16:
                                case 17:
                                case 18:
                                    return 28;
                                default:
                                    switch (i10) {
                                        case 20:
                                            return 30;
                                        case 21:
                                        case 22:
                                            return 31;
                                        default:
                                            return Integer.MAX_VALUE;
                                    }
                            }
                    }
                }

                public static int s(int i10) {
                    if (i10 == 10) {
                        return Build.VERSION.SDK_INT >= 32 ? 737532 : 6396;
                    }
                    if (i10 == 16) {
                        return Build.VERSION.SDK_INT >= 32 ? 205215996 : 0;
                    }
                    if (i10 == 24) {
                        return Build.VERSION.SDK_INT >= 32 ? 67108860 : 0;
                    }
                    switch (i10) {
                        case 1:
                            return 4;
                        case 2:
                            return 12;
                        case 3:
                            return 28;
                        case 4:
                            return 204;
                        case 5:
                            return 220;
                        case 6:
                            return 252;
                        case 7:
                            return 1276;
                        case 8:
                            return 6396;
                        default:
                            switch (i10) {
                                case 12:
                                    return 743676;
                                case 13:
                                    return Build.VERSION.SDK_INT >= 32 ? 30136348 : 0;
                                case 14:
                                    return Build.VERSION.SDK_INT >= 32 ? 202070268 : 0;
                                default:
                                    return 0;
                            }
                    }
                }

                public static int t(int i10) {
                    if (i10 != 2) {
                        if (i10 == 3) {
                            return 1;
                        }
                        if (i10 != 4) {
                            if (i10 != 21) {
                                if (i10 != 22) {
                                    if (i10 != 268435456) {
                                        if (i10 != 1342177280) {
                                            if (i10 != 1610612736) {
                                                throw new IllegalArgumentException();
                                            }
                                        }
                                    }
                                }
                            }
                            return 3;
                        }
                        return 4;
                    }
                    return 2;
                }

                public static byte[] u(String str) {
                    qa.b bVar = qa.e.f48910f;
                    qa.e bVar2 = bVar.f48914d;
                    if (bVar2 == null) {
                        qa.a aVarB = bVar.f48911a.b();
                        bVar2 = aVarB == bVar.f48911a ? bVar : new qa.b(aVarB);
                        bVar.f48914d = bVar2;
                    }
                    try {
                        CharSequence charSequenceE = bVar2.e(str);
                        int length = (int) (((((long) bVar2.f48911a.f48902d) * ((long) charSequenceE.length())) + 7) / 8);
                        byte[] bArr = new byte[length];
                        int iA = bVar2.a(bArr, charSequenceE);
                        if (iA == length) {
                            return bArr;
                        }
                        byte[] bArr2 = new byte[iA];
                        System.arraycopy(bArr, 0, bArr2, 0, iA);
                        return bArr2;
                    } catch (qa.d e10) {
                        throw new IllegalArgumentException(e10);
                    }
                }

                public static int v(int i10, String str) {
                    int i11 = 0;
                    for (String str2 : W(str)) {
                        if (i10 == d0.h(d0.d(str2))) {
                            i11++;
                        }
                    }
                    return i11;
                }

                public static String w(String str, int i10) {
                    String[] strArrW = W(str);
                    if (strArrW.length == 0) {
                        return null;
                    }
                    StringBuilder sb2 = new StringBuilder();
                    for (String str2 : strArrW) {
                        if (i10 == d0.h(d0.d(str2))) {
                            if (sb2.length() > 0) {
                                sb2.append(",");
                            }
                            sb2.append(str2);
                        }
                    }
                    if (sb2.length() > 0) {
                        return sb2.toString();
                    }
                    return null;
                }

                public static Point x(Context context) {
                    DisplayManager displayManager = (DisplayManager) context.getSystemService(X3.i.f27786d);
                    String str = null;
                    Display display = displayManager != null ? displayManager.getDisplay(0) : null;
                    if (display == null) {
                        WindowManager windowManager = (WindowManager) context.getSystemService("window");
                        windowManager.getClass();
                        display = windowManager.getDefaultDisplay();
                    }
                    if (display.getDisplayId() == 0 && K(context)) {
                        try {
                            Class<?> cls = Class.forName("android.os.SystemProperties");
                            str = (String) cls.getMethod("get", String.class).invoke(cls, "vendor.display-size");
                        } catch (Exception e10) {
                            a.f("Util", "Failed to read system property vendor.display-size", e10);
                        }
                        if (!TextUtils.isEmpty(str)) {
                            try {
                                String[] strArrSplit = str.trim().split("x", -1);
                                if (strArrSplit.length == 2) {
                                    int i10 = Integer.parseInt(strArrSplit[0]);
                                    int i11 = Integer.parseInt(strArrSplit[1]);
                                    if (i10 > 0 && i11 > 0) {
                                        return new Point(i10, i11);
                                    }
                                }
                            } catch (NumberFormatException unused) {
                            }
                            a.e("Util", "Invalid display size: " + str);
                        }
                        if ("Sony".equals(Build.MANUFACTURER) && Build.MODEL.startsWith("BRAVIA") && context.getPackageManager().hasSystemFeature("com.sony.dtv.hardware.panel.qfhd")) {
                            return new Point(3840, 2160);
                        }
                    }
                    Point point = new Point();
                    Display.Mode mode = display.getMode();
                    point.x = mode.getPhysicalWidth();
                    point.y = mode.getPhysicalHeight();
                    return point;
                }

                public static int y(int i10) {
                    if (i10 == 2 || i10 == 4) {
                        return 6005;
                    }
                    if (i10 == 10) {
                        return 6004;
                    }
                    if (i10 == 7) {
                        return 6005;
                    }
                    if (i10 == 8) {
                        return 6003;
                    }
                    switch (i10) {
                        case 15:
                            return 6003;
                        case 16:
                        case 18:
                            return 6005;
                        case 17:
                        case 19:
                        case 20:
                        case 21:
                        case 22:
                            return 6004;
                        default:
                            switch (i10) {
                                case 24:
                                case 25:
                                case DIAGNOSTIC_EVENT_TYPE_NATIVE_LOAD_STARTED_AD_VIEWER_VALUE:
                                case 27:
                                case DIAGNOSTIC_EVENT_TYPE_NATIVE_MEMORY_WARNING_VALUE:
                                    return 6002;
                                default:
                                    return 6006;
                            }
                    }
                }

                public static int z(String str) {
                    String[] strArrSplit;
                    int length;
                    int i10 = 0;
                    if (str == null || (length = (strArrSplit = str.split("_", -1)).length) < 2) {
                        return 0;
                    }
                    String str2 = strArrSplit[length - 1];
                    boolean z10 = length >= 3 && "neg".equals(strArrSplit[length - 2]);
                    try {
                        str2.getClass();
                        i10 = Integer.parseInt(str2);
                        if (z10) {
                            return -i10;
                        }
                    } catch (NumberFormatException unused) {
                    }
                    return i10;
                }
            }
