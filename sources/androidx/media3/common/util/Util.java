package androidx.media3.common.util;

import android.app.Notification;
import android.app.Service;
import android.app.UiModeManager;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.media.AudioFormat;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import androidx.media3.common.Player;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.google.common.base.Ascii;
import com.google.common.base.Charsets;
import com.google.common.math.DoubleMath;
import com.google.common.math.LongMath;
import com.inmobi.commons.core.configs.AdConfig;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.smartdigimkt.expressad.advanced.js.NativeAdvancedJsUtils;
import com.smartdigimkt.q8.i;
import com.smartdigimkt.sdk.basead.ui.BaseATView;
import com.smartdigimkt.x.d;
import com.startapp.simple.bloomfilter.parsing.TokenBuilder;
import com.unity3d.services.ads.gmascar.utils.ScarConstants;
import com.vungle.ads.internal.protos.Sdk;
import java.io.Closeable;
import java.io.IOException;
import java.math.RoundingMode;
import java.util.Arrays;
import java.util.Formatter;
import java.util.HashMap;
import java.util.Locale;
import java.util.MissingResourceException;
import java.util.regex.Pattern;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;

/* JADX INFO: loaded from: classes.dex */
public final class Util {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f5683a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f5684b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f5685c;
    public static final String d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f5686e;
    public static final byte[] f;
    public static final long[] g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Pattern f5687h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static HashMap f5688i;
    public static final String[] j;
    public static final String[] k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int[] f5689l;
    public static final int[] m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int[] f5690n;

    public static final class Api21 {
        public static Drawable a(Context context, Resources resources, int i2) {
            return resources.getDrawable(i2, context.getTheme());
        }
    }

    public static class Api29 {
        public static void a(Service service, int i2, Notification notification, int i3, String str) {
            try {
                service.startForeground(i2, notification, i3);
            } catch (RuntimeException e2) {
                Log.c("Util", "The service must be declared with a foregroundServiceType that includes " + str);
                throw e2;
            }
        }
    }

    static {
        int i2 = Build.VERSION.SDK_INT;
        f5683a = i2;
        String str = Build.DEVICE;
        f5684b = str;
        String str2 = Build.MANUFACTURER;
        f5685c = str2;
        String str3 = Build.MODEL;
        d = str3;
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(", ");
        sb.append(str3);
        sb.append(", ");
        sb.append(str2);
        f5686e = androidx.datastore.preferences.protobuf.a.g(i2, ", ", sb);
        f = new byte[0];
        g = new long[0];
        Pattern.compile("(\\d\\d\\d\\d)\\-(\\d\\d)\\-(\\d\\d)[Tt](\\d\\d):(\\d\\d):(\\d\\d)([\\.,](\\d+))?([Zz]|((\\+|\\-)(\\d?\\d):?(\\d\\d)))?");
        Pattern.compile("^(-)?P(([0-9]*)Y)?(([0-9]*)M)?(([0-9]*)D)?(T(([0-9]*)H)?(([0-9]*)M)?(([0-9.]*)S)?)?$");
        Pattern.compile("%([A-Fa-f0-9]{2})");
        f5687h = Pattern.compile("(?:.*\\.)?isml?(?:/(manifest(.*))?)?", 2);
        j = new String[]{"alb", NativeAdvancedJsUtils.o, "arm", "hy", "baq", "eu", "bur", "my", "tib", "bo", "chi", com.smartdigimkt.d2.a.S, "cze", "cs", com.smartdigimkt.o1.b.p0, "nl", "ger", "de", "gre", "el", "fre", com.smartdigimkt.d2.a.W, "geo", "ka", "ice", "is", "mac", "mk", "mao", "mi", "may", "ms", com.smartdigimkt.q0.b.Z0, "fa", "rum", "ro", "scc", "hbs-srp", "slo", "sk", "wel", "cy", "id", "ms-ind", "iw", "he", "heb", "he", "ji", "yi", "arb", "ar-arb", ScarConstants.IN_SIGNAL_KEY, "ms-ind", com.smartdigimkt.q0.b.W0, "ms-ind", "nb", "no-nob", "nob", "no-nob", "nn", "no-nno", "nno", "no-nno", "tw", "ak-twi", "twi", "ak-twi", "bs", "hbs-bos", "bos", "hbs-bos", "hr", "hbs-hrv", "hrv", "hbs-hrv", "sr", "hbs-srp", "srp", "hbs-srp", "cmn", "zh-cmn", "hak", "zh-hak", "nan", "zh-nan", "hsn", "zh-hsn"};
        k = new String[]{"i-lux", "lb", "i-hak", "zh-hak", "i-navajo", "nv", "no-bok", "no-nob", "no-nyn", "no-nno", "zh-guoyu", "zh-cmn", "zh-hakka", "zh-hak", "zh-min-nan", "zh-nan", "zh-xiang", "zh-hsn"};
        f5689l = new int[]{0, 79764919, 159529838, 222504665, 319059676, 398814059, 445009330, 507990021, 638119352, 583659535, 797628118, 726387553, 890018660, 835552979, 1015980042, 944750013, 1276238704, 1221641927, 1167319070, 1095957929, 1595256236, 1540665371, 1452775106, 1381403509, 1780037320, 1859660671, 1671105958, 1733955601, 2031960084, 2111593891, 1889500026, 1952343757, -1742489888, -1662866601, -1851683442, -1788833735, -1960329156, -1880695413, -2103051438, -2040207643, -1104454824, -1159051537, -1213636554, -1284997759, -1389417084, -1444007885, -1532160278, -1603531939, -734892656, -789352409, -575645954, -646886583, -952755380, -1007220997, -827056094, -898286187, -231047128, -151282273, -71779514, -8804623, -515967244, -436212925, -390279782, -327299027, 881225847, 809987520, 1023691545, 969234094, 662832811, 591600412, 771767749, 717299826, 311336399, 374308984, 453813921, 533576470, 25881363, 88864420, 134795389, 214552010, 2023205639, 2086057648, 1897238633, 1976864222, 1804852699, 1867694188, 1645340341, 1724971778, 1587496639, 1516133128, 1461550545, 1406951526, 1302016099, 1230646740, 1142491917, 1087903418, -1398421865, -1469785312, -1524105735, -1578704818, -1079922613, -1151291908, -1239184603, -1293773166, -1968362705, -1905510760, -2094067647, -2014441994, -1716953613, -1654112188, -1876203875, -1796572374, -525066777, -462094256, -382327159, -302564546, -206542021, -143559028, -97365931, -17609246, -960696225, -1031934488, -817968335, -872425850, -709327229, -780559564, -600130067, -654598054, 1762451694, 1842216281, 1619975040, 1682949687, 2047383090, 2127137669, 1938468188, 2001449195, 1325665622, 1271206113, 1183200824, 1111960463, 1543535498, 1489069629, 1434599652, 1363369299, 622672798, 568075817, 748617968, 677256519, 907627842, 853037301, 1067152940, 995781531, 51762726, 131386257, 177728840, 240578815, 269590778, 349224269, 429104020, 491947555, -248556018, -168932423, -122852000, -60002089, -500490030, -420856475, -341238852, -278395381, -685261898, -739858943, -559578920, -630940305, -1004286614, -1058877219, -845023740, -916395085, -1119974018, -1174433591, -1262701040, -1333941337, -1371866206, -1426332139, -1481064244, -1552294533, -1690935098, -1611170447, -1833673816, -1770699233, -2009983462, -1930228819, -2119160460, -2056179517, 1569362073, 1498123566, 1409854455, 1355396672, 1317987909, 1246755826, 1192025387, 1137557660, 2072149281, 2135122070, 1912620623, 1992383480, 1753615357, 1816598090, 1627664531, 1707420964, 295390185, 358241886, 404320391, 483945776, 43990325, 106832002, 186451547, 266083308, 932423249, 861060070, 1041341759, 986742920, 613929101, 542559546, 756411363, 701822548, -978770311, -1050133554, -869589737, -924188512, -693284699, -764654318, -550540341, -605129092, -475935807, -413084042, -366743377, -287118056, -257573603, -194731862, -114850189, -35218492, -1984365303, -1921392450, -2143631769, -2063868976, -1698919467, -1635936670, -1824608069, -1744851700, -1347415887, -1418654458, -1506661409, -1561119128, -1129027987, -1200260134, -1254728445, -1309196108};
        m = new int[]{0, 4129, 8258, 12387, 16516, 20645, 24774, 28903, 33032, 37161, 41290, 45419, 49548, 53677, 57806, 61935};
        f5690n = new int[]{0, 7, 14, 9, 28, 27, 18, 21, 56, 63, 54, 49, 36, 35, 42, 45, 112, 119, 126, 121, 108, 107, 98, 101, 72, 79, 70, 65, 84, 83, 90, 93, 224, 231, 238, 233, 252, 251, 242, 245, Sdk.SDKError.Reason.AD_RESPONSE_INVALID_TEMPLATE_TYPE_VALUE, Sdk.SDKError.Reason.STALE_CACHED_RESPONSE_VALUE, Sdk.SDKError.Reason.INVALID_GZIP_BID_PAYLOAD_VALUE, 209, 196, 195, 202, 205, 144, 151, 158, 153, 140, 139, 130, Sdk.SDKError.Reason.OMSDK_JS_WRITE_FAILED_VALUE, 168, 175, 166, 161, 180, 179, 186, PsExtractor.PRIVATE_STREAM_1, 199, PsExtractor.AUDIO_STREAM, 201, 206, Sdk.SDKError.Reason.MRAID_JS_COPY_FAILED_VALUE, Sdk.SDKError.Reason.AD_RESPONSE_RETRY_AFTER_VALUE, Sdk.SDKError.Reason.INVALID_ADUNIT_BID_PAYLOAD_VALUE, 210, 255, 248, 241, 246, 227, 228, 237, 234, 183, 176, 185, 190, 171, 172, 165, 162, 143, Sdk.SDKError.Reason.PRIVACY_URL_ERROR_VALUE, 129, 134, 147, 148, 157, 154, 39, 32, 41, 46, 59, 60, 53, 50, 31, 24, 17, 22, 3, 4, 13, 10, 87, 80, 89, 94, 75, 76, 69, 66, 111, 104, 97, 102, 115, 116, 125, 122, Sdk.SDKError.Reason.TPAT_RETRY_FAILED_VALUE, 142, 135, 128, 149, 146, ModuleDescriptor.MODULE_VERSION, 156, 177, 182, 191, 184, TTAdConstant.IMAGE_MODE_VERTICAL_IMG_173, 170, 163, 164, 249, 254, 247, PsExtractor.VIDEO_STREAM_MASK, 229, Sdk.SDKError.Reason.PRIVACY_ICON_FALLBACK_ERROR_VALUE, 235, 236, 193, 198, 207, 200, Sdk.SDKError.Reason.AD_LOAD_FAIL_RETRY_AFTER_VALUE, Sdk.SDKError.Reason.MRAID_JS_DOES_NOT_EXIST_VALUE, BaseATView.g.f38289J, 212, 105, 110, 103, 96, 117, 114, 123, 124, 81, 86, 95, 88, 77, 74, 67, 68, 25, 30, 23, 16, 5, 2, 11, 12, 33, 38, 47, 40, 61, 58, 51, 52, 78, 73, 64, 71, 82, 85, 92, 91, 118, 113, 120, 127, 106, 109, 100, 99, 62, 57, 48, 55, 34, 37, 44, 43, 6, 1, 8, 15, 26, 29, 20, 19, 174, 169, 160, 167, 178, 181, 188, 187, 150, 145, 152, 159, 138, 141, Sdk.SDKError.Reason.OMSDK_DOWNLOAD_JS_ERROR_VALUE, 131, Sdk.SDKError.Reason.INVALID_WATERFALL_PLACEMENT_ID_VALUE, Sdk.SDKError.Reason.AD_RESPONSE_TIMED_OUT_VALUE, 208, Sdk.SDKError.Reason.AD_RESPONSE_EMPTY_VALUE, 194, 197, 204, 203, 230, Sdk.SDKError.Reason.AD_LOAD_FAIL_PLACEMENT_ID_MISMATCH_VALUE, 232, 239, 250, 253, 244, 243};
    }

    public static String A(int i2) {
        switch (i2) {
            case -2:
                return "none";
            case -1:
                return "unknown";
            case 0:
                return "default";
            case 1:
                return "audio";
            case 2:
                return "video";
            case 3:
                return "text";
            case 4:
                return d.c.k;
            case 5:
                return TtmlNode.TAG_METADATA;
            case 6:
                return "camera motion";
            default:
                return i2 >= 10000 ? androidx.datastore.preferences.protobuf.a.k("custom (", i2, ")") : "?";
        }
    }

    /* JADX WARN: Code duplicated, block: B:18:0x002a  */
    /* JADX WARN: Code duplicated, block: B:20:0x002e A[RETURN] */
    public static boolean B(Player player) {
        boolean z2 = false;
        if (player == null) {
            return false;
        }
        int playbackState = player.getPlaybackState();
        if (playbackState != 1 || !player.k(2)) {
            if (playbackState == 4 && player.k(4)) {
                player.seekToDefaultPosition();
            }
            if (player.k(1)) {
                return z2;
            }
            player.play();
            return true;
        }
        player.prepare();
        z2 = true;
        if (player.k(1)) {
            return z2;
        }
        player.play();
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:74:0x00d9 A[RETURN] */
    public static int C(Uri uri, String str) {
        int i2;
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
        if (scheme == null || !Ascii.a("rtsp", scheme)) {
            String lastPathSegment = uri.getLastPathSegment();
            if (lastPathSegment != null) {
                int iLastIndexOf = lastPathSegment.lastIndexOf(46);
                if (iLastIndexOf >= 0) {
                    String strB = Ascii.b(lastPathSegment.substring(iLastIndexOf + 1));
                    strB.getClass();
                    switch (strB.hashCode()) {
                        case 104579:
                            if (strB.equals("ism")) {
                            }
                            break;
                        case 108321:
                            if (strB.equals("mpd")) {
                            }
                            break;
                        case 3242057:
                            if (strB.equals("isml")) {
                            }
                            break;
                        case 3299913:
                            if (strB.equals("m3u8")) {
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
                        Method dump skipped, instruction units count: 278
                        To view this dump change 'Code comments level' option to 'DEBUG'
                    */
                    throw new UnsupportedOperationException("Method not decompiled: androidx.media3.common.util.Util.C(android.net.Uri, java.lang.String):int");
                }

                public static boolean D(ParsableByteArray parsableByteArray, ParsableByteArray parsableByteArray2, Inflater inflater) {
                    if (parsableByteArray.a() <= 0) {
                        return false;
                    }
                    if (parsableByteArray2.f5667a.length < parsableByteArray.a()) {
                        parsableByteArray2.b(parsableByteArray.a() * 2);
                    }
                    if (inflater == null) {
                        inflater = new Inflater();
                    }
                    inflater.setInput(parsableByteArray.f5667a, parsableByteArray.f5668b, parsableByteArray.a());
                    int iInflate = 0;
                    while (true) {
                        try {
                            byte[] bArr = parsableByteArray2.f5667a;
                            iInflate += inflater.inflate(bArr, iInflate, bArr.length - iInflate);
                            if (inflater.finished()) {
                                parsableByteArray2.F(iInflate);
                                inflater.reset();
                                return true;
                            }
                            if (!inflater.needsDictionary() && !inflater.needsInput()) {
                                byte[] bArr2 = parsableByteArray2.f5667a;
                                if (iInflate == bArr2.length) {
                                    parsableByteArray2.b(bArr2.length * 2);
                                }
                            }
                            inflater.reset();
                            return false;
                        } catch (DataFormatException unused) {
                            inflater.reset();
                            return false;
                        } catch (Throwable th) {
                            inflater.reset();
                            throw th;
                        }
                    }
                }

                public static void E(int i2) {
                    Integer.toString(i2, 36);
                }

                public static boolean F(int i2) {
                    return i2 == 3 || i2 == 2 || i2 == 268435456 || i2 == 21 || i2 == 1342177280 || i2 == 22 || i2 == 1610612736 || i2 == 4;
                }

                public static boolean G(Context context) {
                    int i2 = f5683a;
                    if (i2 < 29 || context.getApplicationInfo().targetSdkVersion < 29) {
                        return true;
                    }
                    if (i2 != 30) {
                        return false;
                    }
                    String str = d;
                    return Ascii.a(str, "moto g(20)") || Ascii.a(str, "rmx3231");
                }

                public static boolean H(Context context) {
                    UiModeManager uiModeManager = (UiModeManager) context.getApplicationContext().getSystemService("uimode");
                    return uiModeManager != null && uiModeManager.getCurrentModeType() == 4;
                }

                public static long I(long j2) {
                    return (j2 == -9223372036854775807L || j2 == Long.MIN_VALUE) ? j2 : j2 * 1000;
                }

                public static String J(String str) {
                    if (str == null) {
                        return null;
                    }
                    String strReplace = str.replace('_', '-');
                    if (!strReplace.isEmpty() && !strReplace.equals("und")) {
                        str = strReplace;
                    }
                    String strB = Ascii.b(str);
                    int i2 = 0;
                    String str2 = strB.split(TokenBuilder.TOKEN_DELIMITER, 2)[0];
                    if (f5688i == null) {
                        String[] iSOLanguages = Locale.getISOLanguages();
                        int length = iSOLanguages.length;
                        String[] strArr = j;
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
                        for (int i3 = 0; i3 < strArr.length; i3 += 2) {
                            map.put(strArr[i3], strArr[i3 + 1]);
                        }
                        f5688i = map;
                    }
                    String str4 = (String) f5688i.get(str2);
                    if (str4 != null) {
                        StringBuilder sbW = android.support.v4.media.a.w(str4);
                        sbW.append(strB.substring(str2.length()));
                        strB = sbW.toString();
                        str2 = str4;
                    }
                    if (!"no".equals(str2) && !i.f37957c.equals(str2) && !com.smartdigimkt.d2.a.S.equals(str2)) {
                        return strB;
                    }
                    while (true) {
                        String[] strArr2 = k;
                        if (i2 >= strArr2.length) {
                            return strB;
                        }
                        if (strB.startsWith(strArr2[i2])) {
                            return strArr2[i2 + 1] + strB.substring(strArr2[i2].length());
                        }
                        i2 += 2;
                    }
                }

                public static Object[] K(Object[] objArr, int i2) {
                    Assertions.b(i2 <= objArr.length);
                    return Arrays.copyOf(objArr, i2);
                }

                public static void L(Handler handler, Runnable runnable) {
                    if (handler.getLooper().getThread().isAlive()) {
                        if (handler.getLooper() == Looper.myLooper()) {
                            runnable.run();
                        } else {
                            handler.post(runnable);
                        }
                    }
                }

                public static long M(int i2, long j2) {
                    return O(j2, 1000000L, i2, RoundingMode.FLOOR);
                }

                public static void N(long[] jArr, long j2) {
                    long j3;
                    RoundingMode roundingMode = RoundingMode.FLOOR;
                    int i2 = 0;
                    if (j2 >= 1000000 && j2 % 1000000 == 0) {
                        long jB = LongMath.b(j2, 1000000L, RoundingMode.UNNECESSARY);
                        while (i2 < jArr.length) {
                            jArr[i2] = LongMath.b(jArr[i2], jB, roundingMode);
                            i2++;
                        }
                        return;
                    }
                    if (j2 < 1000000 && 1000000 % j2 == 0) {
                        long jB2 = LongMath.b(1000000L, j2, RoundingMode.UNNECESSARY);
                        while (i2 < jArr.length) {
                            jArr[i2] = LongMath.d(jArr[i2], jB2);
                            i2++;
                        }
                        return;
                    }
                    int i3 = 0;
                    while (i3 < jArr.length) {
                        long j4 = jArr[i3];
                        if (j4 != 0) {
                            if (j2 >= j4 && j2 % j4 == 0) {
                                jArr[i3] = LongMath.b(1000000L, LongMath.b(j2, j4, RoundingMode.UNNECESSARY), roundingMode);
                            } else if (j2 >= j4 || j4 % j2 != 0) {
                                j3 = j2;
                                jArr[i3] = P(j4, 1000000L, j3, roundingMode);
                            } else {
                                jArr[i3] = LongMath.d(1000000L, LongMath.b(j4, j2, RoundingMode.UNNECESSARY));
                            }
                            j3 = j2;
                        } else {
                            j3 = j2;
                        }
                        i3++;
                        j2 = j3;
                    }
                }

                public static long O(long j2, long j3, long j4, RoundingMode roundingMode) {
                    if (j2 == 0 || j3 == 0) {
                        return 0L;
                    }
                    if (j4 >= j3 && j4 % j3 == 0) {
                        return LongMath.b(j2, LongMath.b(j4, j3, RoundingMode.UNNECESSARY), roundingMode);
                    }
                    if (j4 < j3 && j3 % j4 == 0) {
                        return LongMath.d(j2, LongMath.b(j3, j4, RoundingMode.UNNECESSARY));
                    }
                    if (j4 < j2 || j4 % j2 != 0) {
                        return (j4 >= j2 || j2 % j4 != 0) ? P(j2, j3, j4, roundingMode) : LongMath.d(j3, LongMath.b(j2, j4, RoundingMode.UNNECESSARY));
                    }
                    return LongMath.b(j3, LongMath.b(j4, j2, RoundingMode.UNNECESSARY), roundingMode);
                }

                public static long P(long j2, long j3, long j4, RoundingMode roundingMode) {
                    long jD = LongMath.d(j2, j3);
                    if (jD != Long.MAX_VALUE && jD != Long.MIN_VALUE) {
                        return LongMath.b(jD, j4, roundingMode);
                    }
                    long jC = LongMath.c(Math.abs(j3), Math.abs(j4));
                    RoundingMode roundingMode2 = RoundingMode.UNNECESSARY;
                    long jB = LongMath.b(j3, jC, roundingMode2);
                    long jB2 = LongMath.b(j4, jC, roundingMode2);
                    long jC2 = LongMath.c(Math.abs(j2), Math.abs(jB2));
                    long jB3 = LongMath.b(j2, jC2, roundingMode2);
                    long jB4 = LongMath.b(jB2, jC2, roundingMode2);
                    long jD2 = LongMath.d(jB3, jB);
                    if (jD2 != Long.MAX_VALUE && jD2 != Long.MIN_VALUE) {
                        return LongMath.b(jD2, jB4, roundingMode);
                    }
                    double d2 = jB3 * (jB / jB4);
                    if (d2 > 9.223372036854776E18d) {
                        return Long.MAX_VALUE;
                    }
                    if (d2 < -9.223372036854776E18d) {
                        return Long.MIN_VALUE;
                    }
                    return DoubleMath.b(d2, roundingMode);
                }

                public static boolean Q(Player player, boolean z2) {
                    return player == null || !player.getPlayWhenReady() || player.getPlaybackState() == 1 || player.getPlaybackState() == 4 || (z2 && player.e() != 0);
                }

                public static String[] R(String str) {
                    return TextUtils.isEmpty(str) ? new String[0] : str.trim().split("(\\s*,\\s*)", -1);
                }

                public static String S(byte[] bArr) {
                    StringBuilder sb = new StringBuilder(bArr.length * 2);
                    for (int i2 = 0; i2 < bArr.length; i2++) {
                        sb.append(Character.forDigit((bArr[i2] >> 4) & 15, 16));
                        sb.append(Character.forDigit(bArr[i2] & 15, 16));
                    }
                    return sb.toString();
                }

                public static long T(long j2) {
                    return (j2 == -9223372036854775807L || j2 == Long.MIN_VALUE) ? j2 : j2 / 1000;
                }

                public static boolean a(Object obj, Object obj2) {
                    if (obj == null) {
                        return obj2 == null;
                    }
                    return obj.equals(obj2);
                }

                public static int b(long[] jArr, long j2, boolean z2) {
                    int i2;
                    int iBinarySearch = Arrays.binarySearch(jArr, j2);
                    if (iBinarySearch < 0) {
                        return ~iBinarySearch;
                    }
                    while (true) {
                        i2 = iBinarySearch + 1;
                        if (i2 >= jArr.length || jArr[i2] != j2) {
                            break;
                        }
                        iBinarySearch = i2;
                    }
                    return z2 ? iBinarySearch : i2;
                }

                public static int c(LongArray longArray, long j2) {
                    int i2 = longArray.f5652a - 1;
                    int i3 = 0;
                    while (i3 <= i2) {
                        int i4 = (i3 + i2) >>> 1;
                        if (longArray.b(i4) < j2) {
                            i3 = i4 + 1;
                        } else {
                            i2 = i4 - 1;
                        }
                    }
                    int i5 = i2 + 1;
                    if (i5 < longArray.f5652a && longArray.b(i5) == j2) {
                        return i5;
                    }
                    if (i2 == -1) {
                        return 0;
                    }
                    return i2;
                }

                public static int d(int[] iArr, int i2, boolean z2, boolean z3) {
                    int i3;
                    int i4;
                    int iBinarySearch = Arrays.binarySearch(iArr, i2);
                    if (iBinarySearch < 0) {
                        i4 = -(iBinarySearch + 2);
                    } else {
                        while (true) {
                            i3 = iBinarySearch - 1;
                            if (i3 < 0 || iArr[i3] != i2) {
                                break;
                            }
                            iBinarySearch = i3;
                        }
                        i4 = z2 ? iBinarySearch : i3;
                    }
                    return z3 ? Math.max(0, i4) : i4;
                }

                public static int e(long[] jArr, long j2, boolean z2) {
                    int i2;
                    int iBinarySearch = Arrays.binarySearch(jArr, j2);
                    if (iBinarySearch < 0) {
                        i2 = -(iBinarySearch + 2);
                    } else {
                        while (true) {
                            int i3 = iBinarySearch - 1;
                            if (i3 < 0 || jArr[i3] != j2) {
                                break;
                            }
                            iBinarySearch = i3;
                        }
                        i2 = iBinarySearch;
                    }
                    return z2 ? Math.max(0, i2) : i2;
                }

                public static int f(int i2, int i3) {
                    return ((i2 + i3) - 1) / i3;
                }

                public static void g(Closeable closeable) {
                    if (closeable != null) {
                        try {
                            closeable.close();
                        } catch (IOException unused) {
                        }
                    }
                }

                public static int h(long j2, long j3) {
                    if (j2 < j3) {
                        return -1;
                    }
                    return j2 == j3 ? 0 : 1;
                }

                public static float i(float f2, float f3, float f4) {
                    return Math.max(f3, Math.min(f2, f4));
                }

                public static int j(int i2, int i3, int i4) {
                    return Math.max(i3, Math.min(i2, i4));
                }

                public static long k(long j2, long j3, long j4) {
                    return Math.max(j3, Math.min(j2, j4));
                }

                public static int l(int i2, int i3, int i4, byte[] bArr) {
                    while (i2 < i3) {
                        i4 = f5689l[((i4 >>> 24) ^ (bArr[i2] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED)) & 255] ^ (i4 << 8);
                        i2++;
                    }
                    return i4;
                }

                public static Handler m(Handler.Callback callback) {
                    Looper looperMyLooper = Looper.myLooper();
                    Assertions.f(looperMyLooper);
                    return new Handler(looperMyLooper, callback);
                }

                public static String n(byte[] bArr) {
                    return new String(bArr, Charsets.f19705c);
                }

                public static int o(int i2) {
                    if (i2 == 20) {
                        return 30;
                    }
                    if (i2 == 22) {
                        return 31;
                    }
                    if (i2 == 30) {
                        return 34;
                    }
                    switch (i2) {
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
                            switch (i2) {
                                case 14:
                                    return 25;
                                case 15:
                                case 16:
                                case 17:
                                case 18:
                                    return 28;
                                default:
                                    return Integer.MAX_VALUE;
                            }
                    }
                }

                public static AudioFormat p(int i2, int i3, int i4) {
                    return new AudioFormat.Builder().setSampleRate(i2).setChannelMask(i3).setEncoding(i4).build();
                }

                /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
                /* JADX WARN: Code duplicated, block: B:12:0x0015 A[RETURN] */
                public static int q(int i2) {
                    switch (i2) {
                        case 1:
                            return 4;
                        case 2:
                            return 12;
                        case 3:
                            return 28;
                        case 4:
                            return 204;
                        case 5:
                            return Sdk.SDKError.Reason.AD_RESPONSE_RETRY_AFTER_VALUE;
                        case 6:
                            return 252;
                        case 7:
                            return 1276;
                        case 8:
                            return 6396;
                        case 9:
                        case 11:
                        default:
                            return 0;
                        case 10:
                            if (f5683a >= 32) {
                                return 737532;
                            }
                            return 6396;
                        case 12:
                            return 743676;
                    }
                }

                public static Drawable r(Context context, Resources resources, int i2) {
                    return f5683a >= 21 ? Api21.a(context, resources, i2) : resources.getDrawable(i2);
                }

                public static int s(int i2) {
                    if (i2 == 2 || i2 == 4) {
                        return 6005;
                    }
                    if (i2 == 10) {
                        return 6004;
                    }
                    if (i2 == 7) {
                        return 6005;
                    }
                    if (i2 == 8) {
                        return 6003;
                    }
                    switch (i2) {
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
                            switch (i2) {
                                case 24:
                                case 25:
                                case 26:
                                case 27:
                                case 28:
                                    return 6002;
                                default:
                                    return 6006;
                            }
                    }
                }

                public static int t(String str) {
                    String[] strArrSplit;
                    int length;
                    int i2 = 0;
                    if (str == null || (length = (strArrSplit = str.split("_", -1)).length) < 2) {
                        return 0;
                    }
                    String str2 = strArrSplit[length - 1];
                    boolean z2 = length >= 3 && "neg".equals(strArrSplit[length - 2]);
                    try {
                        str2.getClass();
                        i2 = Integer.parseInt(str2);
                        if (z2) {
                            return -i2;
                        }
                    } catch (NumberFormatException unused) {
                    }
                    return i2;
                }

                public static String u(int i2) {
                    if (i2 == 0) {
                        return "NO";
                    }
                    if (i2 == 1) {
                        return "NO_UNSUPPORTED_TYPE";
                    }
                    if (i2 == 2) {
                        return "NO_UNSUPPORTED_DRM";
                    }
                    if (i2 == 3) {
                        return "NO_EXCEEDS_CAPABILITIES";
                    }
                    if (i2 == 4) {
                        return "YES";
                    }
                    throw new IllegalStateException();
                }

                public static long v(long j2, float f2) {
                    return f2 == 1.0f ? j2 : Math.round(j2 * ((double) f2));
                }

                public static int w(int i2) {
                    if (i2 == 8) {
                        return 3;
                    }
                    if (i2 == 16) {
                        return 2;
                    }
                    if (i2 != 24) {
                        return i2 != 32 ? 0 : 22;
                    }
                    return 21;
                }

                public static int x(int i2, int i3) {
                    if (i2 != 2) {
                        if (i2 == 3) {
                            return i3;
                        }
                        if (i2 != 4) {
                            if (i2 != 21) {
                                if (i2 != 22) {
                                    if (i2 != 268435456) {
                                        if (i2 != 1342177280) {
                                            if (i2 != 1610612736) {
                                                throw new IllegalArgumentException();
                                            }
                                        }
                                    }
                                }
                            }
                            return i3 * 3;
                        }
                        return i3 * 4;
                    }
                    return i3 * 2;
                }

                public static String y(StringBuilder sb, Formatter formatter, long j2) {
                    if (j2 == -9223372036854775807L) {
                        j2 = 0;
                    }
                    String str = j2 < 0 ? TokenBuilder.TOKEN_DELIMITER : "";
                    long jAbs = (Math.abs(j2) + 500) / 1000;
                    long j3 = jAbs % 60;
                    long j4 = (jAbs / 60) % 60;
                    long j5 = jAbs / com.smartdigimkt.o1.b.f37307P;
                    sb.setLength(0);
                    return j5 > 0 ? formatter.format("%s%d:%02d:%02d", str, Long.valueOf(j5), Long.valueOf(j4), Long.valueOf(j3)).toString() : formatter.format("%s%02d:%02d", str, Long.valueOf(j4), Long.valueOf(j3)).toString();
                }

                public static String z(String str) {
                    try {
                        Class<?> cls = Class.forName("android.os.SystemProperties");
                        return (String) cls.getMethod("get", String.class).invoke(cls, str);
                    } catch (Exception e2) {
                        Log.d("Util", "Failed to read system property ".concat(str), e2);
                        return null;
                    }
                }
            }
