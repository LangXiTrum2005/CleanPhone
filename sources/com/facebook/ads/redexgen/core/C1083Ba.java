package com.facebook.ads.redexgen.core;

import android.media.MediaCodecInfo;
import android.util.Pair;
import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.facebook.ads.androidx.media3.common.ColorInfo;
import com.inmobi.media.core.config.models.AdConfig;
import com.ironsource.A5;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.unity3d.services.UnityAdsConstants;
import com.vungle.ads.internal.protos.Sdk$SDKError;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.jacoco.core.data.ExecutionDataWriter;
import org.objectweb.asm.Opcodes;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Ba, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
@Deprecated
public final class C1083Ba {
    public static int A00;
    public static byte[] A01;
    public static String[] A02 = {"eqdzSiIdqnT3hCSsTENYLmZ4", "qLAEi2WvCJu9wjJ", "toce", "QmOxXIzlvE53d2X", "WAyVnYX8HOamSHc7hCznsAV7J1o4yjh4", "2Jg1vBhmBkCi6YoALSajSHGhL27exhse", "FyqWibsIBjeEGSoGFPMxHwupdmiGrYAl", "dJbg5x7m2zG"};
    public static final HashMap<BW, List<B3>> A03;
    public static final Pattern A04;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 5
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:656)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    public static int A00() throws BX {
        int i = A00;
        String[] strArr = A02;
        if (strArr[0].length() == strArr[2].length()) {
            throw new RuntimeException();
        }
        A02[7] = "ayn8";
        if (i == -1) {
            int iMax = 0;
            B3 b3A0J = A0J(A0N(1756, 9, 19), false, false);
            if (b3A0J != null) {
                for (MediaCodecInfo.CodecProfileLevel codecProfileLevel : b3A0J.A0V()) {
                    iMax = Math.max(A03(codecProfileLevel.level), iMax);
                }
                iMax = Math.max(iMax, C5C.A02 >= 21 ? 345600 : AdConfig.DEFAULT_PING_V2_EXPIRY_HIGH);
            }
            A00 = iMax;
        }
        return A00;
    }

    public static String A0N(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 13);
        }
        return new String(bArrCopyOfRange);
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0170 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:109:0x005f A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:41:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:47:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:48:0x00c7 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:62:0x0117  */
    /* JADX WARN: Code duplicated, block: B:65:0x0130  */
    /* JADX WARN: Code duplicated, block: B:67:0x013c A[Catch: Exception -> 0x01b2, PHI: r0
  0x013c: PHI (r0v18 java.lang.String) = (r0v16 java.lang.String), (r0v22 java.lang.String) binds: [B:66:0x013a, B:63:0x012d] A[DONT_GENERATE, DONT_INLINE], TRY_ENTER, TryCatch #7 {Exception -> 0x01b2, blocks: (B:3:0x0014, B:5:0x002a, B:8:0x0035, B:11:0x0040, B:59:0x0101, B:71:0x0170, B:72:0x01aa, B:67:0x013c, B:69:0x0142), top: B:93:0x0014 }] */
    /* JADX WARN: Code duplicated, block: B:69:0x0142 A[Catch: Exception -> 0x01b2, TryCatch #7 {Exception -> 0x01b2, blocks: (B:3:0x0014, B:5:0x002a, B:8:0x0035, B:11:0x0040, B:59:0x0101, B:71:0x0170, B:72:0x01aa, B:67:0x013c, B:69:0x0142), top: B:93:0x0014 }] */
    /* JADX WARN: Code duplicated, block: B:89:0x00a7 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:98:0x0170 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:99:0x0170 A[SYNTHETIC] */
    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    /*  JADX ERROR: JadxRuntimeException in pass: ProcessVariables
        jadx.core.utils.exceptions.JadxRuntimeException: Method arg registers not loaded: com.facebook.ads.redexgen.X.BX.<init>(java.lang.Throwable, com.facebook.ads.redexgen.X.BV):void, class status: GENERATED_AND_UNLOADED
        	at jadx.core.dex.nodes.MethodNode.getArgRegs(MethodNode.java:309)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables$1.isArgUnused(ProcessVariables.java:146)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables$1.lambda$isVarUnused$0(ProcessVariables.java:131)
        	at jadx.core.utils.ListUtils.allMatch(ListUtils.java:224)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables$1.isVarUnused(ProcessVariables.java:131)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables$1.processBlock(ProcessVariables.java:82)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:93)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:27)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables.removeUnusedResults(ProcessVariables.java:73)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables.visit(ProcessVariables.java:48)
        */
    public static java.util.ArrayList<com.facebook.ads.redexgen.core.B3> A0Q(com.facebook.ads.redexgen.core.BW r23, com.facebook.ads.redexgen.core.BY r24) throws com.facebook.ads.redexgen.core.BX {
        /*
            Method dump skipped, instruction units count: 442
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.core.C1083Ba.A0Q(com.facebook.ads.redexgen.X.BW, com.facebook.ads.redexgen.X.BY):java.util.ArrayList");
    }

    public static void A0S() {
        A01 = new byte[]{-121, -113, 94, 102, -92, -97, -89, -86, -93, -94, 94, -78, -83, 94, -81, -77, -93, -80, -73, 94, -95, -97, -82, -97, -96, -89, -86, -89, -78, -89, -93, -79, 103, 56, -111, -125, -92, -42, -42, -40, -48, -52, -47, -54, -99, -125, 65, -122, 120, 118, -120, -123, 120, -72, -3, 1, -72, 66, 66, -90, -89, 85, 87, -84, -81, 111, 115, 65, 70, -115, -109, -98, -91, -95, -87, 99, 108, -73, -89, -90, 87, 87, 65, 66, 68, 70, 103, -116, -120, -116, -85, -101, -127, -127, -125, -124, -91, -93, -81, -92, -91, -78, 92, 74, 78, 73, 77, 119, 101, 105, 100, 105, 121, 103, 108, 102, 106, -113, 125, -126, 124, -127, -97, -110, -110, -116, -114, -70, -83, -83, -89, -86, -59, -72, -72, -78, -72, 90, 77, 77, 72, 77, -72, -66, -59, -74, -74, -72, -71, -38, -40, -28, -39, -38, -25, -60, -54, -47, -62, -50, -45, -49, -61, -59, -26, -28, -16, -27, -26, -13, -73, -67, -60, -63, -60, -89, -72, -39, -41, -29, -40, -39, -26, -51, -45, -38, -32, -7, -4, -20, -13, -3, -50, -17, -19, -7, -18, -17, -4, -81, -54, -46, -43, -50, -51, -119, -35, -40, -119, -38, -34, -50, -37, -30, -119, -52, -40, -51, -50, -52, -119, -63, -86, -85, -87, 103, 80, 81, 82, -68, -91, -87, -92, -119, 114, 118, 116, -58, -81, -77, -76, -78, -101, -94, -102, 88, 65, 72, 67, -128, 105, 112, 110, -95, -116, -119, -79, -97, -103, -117, 121, 118, 114, 99, 90, -93, -108, -114, -84, -79, -107, -77, -70, -69, -66, -75, -70, -77, 108, -71, -83, -72, -78, -69, -66, -71, -79, -80, 108, -115, -94, 125, 108, -81, -69, -80, -79, -81, 108, -65, -64, -66, -75, -70, -77, -122, 108, 120, -106, -99, -98, -95, -104, -99, -106, 79, -100, -112, -101, -107, -98, -95, -100, -108, -109, 79, 112, -123, 114, 79, -110, -98, -109, -108, -110, 79, -94, -93, -95, -104, -99, -106, 105, 79, -85, -55, -48, -47, -44, -53, -48, -55, -126, -49, -61, -50, -56, -47, -44, -49, -57, -58, -126, -90, -47, -50, -60, -37, -126, -72, -53, -43, -53, -47, -48, -126, -59, -47, -58, -57, -59, -126, -43, -42, -44, -53, -48, -55, -100, -126, -122, -92, -85, -84, -81, -90, -85, -92, 93, -86, -98, -87, -93, -84, -81, -86, -94, -95, 93, -123, -126, -109, -128, 93, -96, -84, -95, -94, -96, 93, -80, -79, -81, -90, -85, -92, 119, 93, -71, -41, -34, -33, -30, -39, -34, -41, -112, -35, -47, -36, -42, -33, -30, -35, -43, -44, -112, -67, -64, -92, -79, -112, -45, -33, -44, -43, -45, -112, -29, -28, -30, -39, -34, -41, -86, -112, 90, 120, 127, -128, -125, 122, 127, 120, 49, 126, 114, 125, 119, -128, -125, 126, 118, 117, 49, 103, 97, 74, 49, 116, -128, 117, 118, 116, 49, -124, -123, -125, 122, 127, 120, 75, 49, -112, 117, 118, 116, -53, -80, -79, -78, -65, -92, -88, -93, -63, -90, -86, -88, -124, 105, 109, 110, -92, -119, -112, -120, -64, -91, -84, -89, 108, 81, 88, 86, -66, -91, -94, -61, -86, -83, -33, -98, -120, -126, -44, -66, -69, -96, -115, -124, -119, 118, 112, 92, 95, 66, 83, 116, 114, 126, 115, 116, -127, -105, -81, -82, -77, -85, -115, -71, -82, -81, -83, -106, -77, -67, -66, 106, -117, -102, -109, 106, -82, -77, -82, -72, 113, -66, 106, -74, -77, -67, -66, 106, -67, -81, -83, -65, -68, -81, 106, -82, -81, -83, -71, -82, -81, -68, 106, -80, -71, -68, -124, 106, -86, -62, -63, -58, -66, -96, -52, -63, -62, -64, -78, -47, -58, -55, -85, -87, -76, -118, -95, -44, -43, -54, -53, -49, -118, -99, -99, -97, -118, -96, -63, -65, -53, -64, -63, -50, -40, -42, -31, -73, -42, -36, -73, -47, -50, -33, -52, -51, -33, -73, -51, -18, -20, -8, -19, -18, -5, -48, -50, -39, -81, -50, -43, -52, -81, -62, -42, -59, -54, -48, -81, -59, -58, -60, -48, -59, -58, -45, -81, -62, -62, -60, -68, -70, -59, -101, -70, -63, -72, -101, -82, -62, -79, -74, -68, -101, -79, -78, -80, -68, -79, -78, -65, -101, -79, -64, -67, -82, -80, -96, -120, -122, -111, 103, -122, -115, -124, 103, 122, -114, 125, -126, -120, 103, 125, 126, 124, -120, 125, 126, -117, 103, -117, 122, -112, -102, -104, -93, 121, -99, -97, -106, 121, -63, -76, -81, -80, -70, 121, -81, -80, -82, -70, -81, -80, -67, -127, 127, -118, 96, -123, 119, 117, 96, 127, -126, 101, 96, 118, -105, -107, -95, -106, -105, -92, -46, -48, -37, -79, -42, -56, -58, -79, -28, -28, -26, -79, -25, -24, -26, -82, -84, -73, -115, -78, -92, -94, -115, -52, -49, -110, -115, -61, -60, -62, -126, -128, -117, 97, -122, 120, 118, 97, -87, -93, 107, 97, -105, -104, -106, -119, -121, -110, 104, -100, -84, -99, -89, 104, -101, -81, -98, -93, -87, 104, -89, -86, 109, 104, -98, -97, -99, -87, -98, -97, -84, -124, -126, -115, 99, -100, -92, -92, -100, -95, -102, -86, -88, -77, -119, -62, -54, -54, -62, -57, -64, -119, -51, -68, -46, -119, -65, -64, -66, -54, -65, -64, -51, -84, -86, -75, -117, -55, -60, -62, -117, -66, -64, -112, -117, -63, -62, -64, -52, -63, -62, -49, -72, -74, -63, -105, -43, -48, -50, -105, -54, -43, -54, -52, -105, -51, -50, -52, -40, -51, -50, -37, -114, -116, -105, 109, -85, -90, -92, 109, -91, -85, -96, -94, 109, -93, -92, -94, -82, -93, -92, -79, 108, 106, 117, 75, -114, -128, -116, -118, 75, 126, -110, -127, -122, -116, 75, -127, -126, -128, -116, -127, -126, -113, 75, 126, 126, -128, 107, 105, 116, 74, -115, 127, -117, -119, 74, 125, -111, -128, -123, -117, 74, -128, -127, 127, -117, -128, -127, -114, 
        74, -119, -116, 79, -75, -77, -66, -108, -41, -55, -43, -45, -108, -36, -49, -54, -53, -43, -108, -54, -53, -55, -43, -54, -53, -40, -108, -36, -42, -98, 114, 112, 123, 81, -108, -105, -116, 81, -124, -104, -121, -116, -110, 81, -121, -120, -122, -110, -121, -120, -107, 81, -119, -113, -124, -122, -105, -107, -96, 118, -70, -83, -87, -76, -68, -83, -77, 118, -66, -79, -84, -83, -73, 118, -84, -83, -85, -73, -84, -83, -70, 118, -68, -67, -74, -74, -83, -76, -83, -84, -80, -105, -102, -118, 116, 119, 123, -114, -40, -56, -78, -75, -70, -52, -45, -61, -42, -77, -79, -121, -125, 97, 100, 102, 121, -112, -88, -90, -83, -83, -90, -85, -92, 93, -96, -84, -95, -94, -96, 93, -50, -25, -28, -25, -24, -16, -25, -103, -70, -49, -86, -103, -37, -30, -19, -103, -35, -34, -23, -19, -31, -77, -103, -78, -53, -56, -53, -52, -44, -53, 125, -98, -77, -114, 125, -55, -62, -45, -62, -55, -105, 125, -41, -16, -19, -16, -15, -7, -16, -94, -61, -40, -77, -94, -14, -12, -15, -24, -21, -18, -25, -68, -94, -124, -99, -102, -99, -98, -90, -99, 79, 112, -123, 114, 79, -101, -108, -91, -108, -101, 105, 79, -84, -59, -62, -59, -58, -50, -59, 119, -104, -83, -102, 119, -57, -55, -58, -67, -64, -61, -68, -111, 119, -111, -86, -89, -86, -85, -77, -86, 92, -128, -85, -88, -98, -75, 92, -110, -91, -81, -91, -85, -86, 92, -88, -95, -78, -95, -88, 92, -81, -80, -82, -91, -86, -93, 118, 92, 100, 125, 122, 125, 126, -122, 125, 47, 83, 126, 123, 113, -120, 47, 101, 120, -126, 120, 126, 125, 47, 127, -127, 126, 117, 120, 123, 116, 47, -126, -125, -127, 120, 125, 118, 73, 47, -75, -50, -53, -50, -49, -41, -50, -128, -88, -91, -74, -93, -128, -52, -59, -42, -59, -52, -128, -45, -44, -46, -55, -50, -57, -102, -128, -52, -27, -30, -27, -26, -18, -27, -105, -65, -68, -51, -70, -105, -25, -23, -26, -35, -32, -29, -36, -105, -22, -21, -23, -32, -27, -34, -79, -105, -93, -68, -71, -68, -67, -59, -68, 110, -92, -98, -121, 110, -70, -77, -60, -77, -70, -120, 110, -101, -76, -79, -76, -75, -67, -76, 102, -100, -106, 127, 102, -74, -72, -75, -84, -81, -78, -85, -128, 102, 112, -127, 121, -121, -123, -127, -44, -90, -37, -39, -63, -68, -91, -39, -31, -88, -90, -95, -89, 125, 118, -36, -19, -34, -87, 122, -114, 125, -126, -120, 72, 122, 124, 76, -38, -18, -35, -30, -24, -88, -38, -27, -38, -36, 116, -120, 119, 124, -126, 66, 120, 116, 118, 70, -48, -28, -45, -40, -34, -98, -44, -48, -46, -94, -100, -39, -34, -46, -96, -76, -93, -88, -82, 110, -91, -85, -96, -94, 120, -116, 123, -128, -122, 70, -125, 126, 68, 120, 122, 74, -125, -105, -122, -117, -111, 81, -113, -110, 86, -125, 79, -114, -125, -106, -113, -54, -34, -51, -46, -40, -104, -37, -54, -32, -46, -26, -43, -38, -32, -96, -23, -98, -35, -40, -98, -46, -35, -46, -44, -37, -17, -34, -29, -23, -87, -14, -89, -26, -31, -89, -32, -26, -37, -35, -118, -97, 89, 90, 127, -108, -127, 79, 126, -109, -128, 79, -82, 125, 121, -101, 106, 102, -103, -90, -100, -86, -89, -95, -100, -59, -108, -112, -61, -48, -58, -44, -47, -53, -58, -112, 114, 65, 61, 118, 126, 126, 118, 123, 116, 61, 120, 70, -39, -31, -19, -22, -17, -19, -19, -96, -99, -82, 105, -21, -7, -26, -76, -33, -37, -31, -23, -38, -82, -94, -77, -86, -81, -90, -83, -75, -90, -94, -75, -75, -113, -110, 86, -125, -58, -60, -49, -123, -54, -56, -45, -119, -63, -63, -56, -53, -64, -62, -119, -88, -90, -79, 103, -96, -88, -88, -96, -91, -98, 103, -66, -68, -57, 125, -64, -78, -66, -68, 125, -59, -72, -77, -76, -66, 125, -77, -76, -78, -66, -77, -76, -63, 125, -73, -76, -59, -78, -62, -58, -59, -77, -76, -78, -100, -102, -91, 91, -96, -110, -112, 91, -10, -8, -11, -6, -11, -5, -116, 122, -122, -116, -114, -121, -128, -109, -127, -114, -108, -113, -109, -8, -22, -24, -6, -9, -22, -78, -11, -15, -26, -2, -25, -26, -24, -16, -119, 123, -120, -120, 119, -124, -123, -69, 119, -82, -81, -88, -88, -97, -90, -97, -98, 103, -86, -90, -101, -77, -100, -101, -99, -91, -106, -119, -124, -123, -113, 79, -127, -106, -125, -99, -112, -117, -116, -106, 86, -117, -106, -109, -119, -96, 84, -99, -112, -102, -112, -106, -107, -77, -90, -95, -94, -84, 108, -95, -77, -100, -91, -94, -77, -96, -101, -114, -119, -118, -108, 84, -115, -118, -101, -120, -66, -79, -84, -83, -73, 119, -80, -83, -66, -85, -84, -66, -28, -41, -38, -38, -45, -107, -120, -117, -117, -124, -126, 81, -64, -77, -74, -74, -81, -70, -74, -65, -67, -78, -84, 108, 117, -64, -85, -76, -78, -70, -85, -43, -64, -51, -54, -63, -57, -49, -64, -52, -73, -60, -63, -66, -58, -73};
    }

    static {
        A0S();
        A04 = Pattern.compile(A0N(1409, 10, 112));
        A03 = new HashMap<>();
        A00 = -1;
    }

    public static int A01(int i) {
        switch (i) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 4;
            case 3:
                return 8;
            case 4:
                return 16;
            case 5:
                return 32;
            case 6:
                return 64;
            case 7:
                return 128;
            case 8:
                return 256;
            case 9:
                if (A02[7].length() == 25) {
                    throw new RuntimeException();
                }
                String[] strArr = A02;
                strArr[1] = "p3tScLodvmBhgJu";
                strArr[3] = "blAckLRsjuERKNr";
                return 512;
            case 10:
                return 1024;
            case 11:
                return 2048;
            case 12:
                return 4096;
            case 13:
                return 8192;
            case 14:
                return 16384;
            case 15:
                return 32768;
            case 16:
                String[] strArr2 = A02;
                if (strArr2[6].charAt(8) == strArr2[5].charAt(8)) {
                    A02[7] = "bdr4r1uDMPeXB3s0e5pOX5Q";
                    return 65536;
                }
                break;
            case 17:
                return 131072;
            case 18:
                String[] strArr3 = A02;
                if (strArr3[6].charAt(8) != strArr3[5].charAt(8)) {
                    String[] strArr4 = A02;
                    strArr4[6] = "34IRfUzRBRFF7aBglEcwMApXZqeFGI1m";
                    strArr4[5] = "iRGVlhZlB1b37DNJ3kG6hrLab0t0wQjp";
                    return Opcodes.ASM4;
                }
                String[] strArr5 = A02;
                strArr5[0] = "eT6IL44S7u9o4A5QFAcxcvIY";
                strArr5[2] = "bWAi";
                return Opcodes.ASM4;
            case 19:
                return Opcodes.ASM8;
            case 20:
                return ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
            case 21:
                String[] strArr6 = A02;
                if (strArr6[6].charAt(8) != strArr6[5].charAt(8)) {
                    A02[4] = "Kx02KfDWNZB3bbiKdLxxGACkAkNM6rJP";
                    return 2097152;
                }
                A02[4] = "WnzQHL4oKpbMUVBkEywLAA92oYxlOTj8";
                return 2097152;
            case 22:
                if (A02[4].charAt(21) == 'A') {
                    A02[4] = "cAiGKOliFB77vtIZojZGlA8hvOCkEVbR";
                    return 4194304;
                }
                break;
            case 23:
                return 8388608;
            default:
                return -1;
        }
        throw new RuntimeException();
    }

    public static int A02(int i) {
        switch (i) {
            case 10:
                return 1;
            case 11:
                return 4;
            case 12:
                return 8;
            case 13:
                return 16;
            case 20:
                return 32;
            case 21:
                return 64;
            case 22:
                return 128;
            case 30:
                return 256;
            case 31:
                return 512;
            case 32:
                return 1024;
            case 40:
                return 2048;
            case 41:
                return 4096;
            case 42:
                return 8192;
            case 50:
                return 16384;
            case 51:
                String[] strArr = A02;
                if (strArr[1].length() != strArr[3].length()) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A02;
                strArr2[1] = "Dd2HPoEYdkjLRr8";
                strArr2[3] = "8RMIphYW42mwAMu";
                return 32768;
            case 52:
                return 65536;
            default:
                return -1;
        }
    }

    public static int A03(int i) {
        switch (i) {
            case 1:
            case 2:
                return 25344;
            case 8:
            case 16:
            case 32:
                return 101376;
            case 64:
                String[] strArr = A02;
                if (strArr[0].length() == strArr[2].length()) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A02;
                strArr2[1] = "3QcVs4uE13o5U89";
                strArr2[3] = "HwwNiq3rR5E2ArP";
                return 202752;
            case 128:
            case 256:
                return 414720;
            case 512:
                return 921600;
            case 1024:
                return 1310720;
            case 2048:
            case 4096:
                return 2097152;
            case 8192:
                return 2228224;
            case 16384:
                return 5652480;
            case 32768:
            case 65536:
                return 9437184;
            case 131072:
            case Opcodes.ASM4 /* 262144 */:
            case Opcodes.ASM8 /* 524288 */:
                return 35651584;
            default:
                return -1;
        }
    }

    public static int A04(int i) {
        switch (i) {
            case 66:
                return 1;
            case 77:
                return 2;
            case 88:
                return 4;
            case 100:
                return 8;
            case 110:
                return 16;
            case 122:
                return 32;
            case 244:
                return 64;
            default:
                return -1;
        }
    }

    public static int A05(int i) {
        switch (i) {
            case 1:
                if (A02[4].charAt(21) != 'A') {
                    throw new RuntimeException();
                }
                String[] strArr = A02;
                strArr[0] = "QMC9ZT5BEMY9TcRggpPTke3A";
                strArr[2] = "gCyl";
                return 1;
            case 2:
                return 2;
            case 3:
                return 3;
            case 4:
                return 4;
            case 5:
                String[] strArr2 = A02;
                if (strArr2[6].charAt(8) != strArr2[5].charAt(8)) {
                    throw new RuntimeException();
                }
                A02[4] = "69A91wQXEtxdKe6VEWAWvAWn2bPjhSLd";
                return 5;
            case 6:
                return 6;
            case 17:
                return 17;
            case 20:
                return 20;
            case 23:
                return 23;
            case 29:
                return 29;
            case 39:
                return 39;
            case 42:
                return 42;
            default:
                return -1;
        }
    }

    public static int A06(int i) {
        switch (i) {
            case 10:
                return 1;
            case 11:
                return 2;
            case 20:
                return 4;
            case 21:
                return 8;
            case 30:
                return 16;
            case 31:
                return 32;
            case 40:
                return 64;
            case 41:
                if (A02[7].length() == 25) {
                    throw new RuntimeException();
                }
                String[] strArr = A02;
                strArr[1] = "FYHyz6Jn9nffJKB";
                strArr[3] = "LZRAC8LId4dogw6";
                return 128;
            case 50:
                return 256;
            case 51:
                return 512;
            case 60:
                return 2048;
            case 61:
                return 4096;
            case 62:
                return 8192;
            default:
                return -1;
        }
    }

    public static int A07(int i) {
        switch (i) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 4;
            case 3:
                if (A02[7].length() == 25) {
                    throw new RuntimeException();
                }
                A02[4] = "pIa0SKSMXaKd1ZRZCUAsSAHaUimoLOpx";
                return 8;
            default:
                String[] strArr = A02;
                if (strArr[0].length() == strArr[2].length()) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A02;
                strArr2[0] = "vDav2EVX30wYgrXK4P9ZX6kx";
                strArr2[2] = "QW4Z";
                return -1;
        }
    }

    public static /* synthetic */ int A08(B3 b3) {
        String str = b3.A03;
        String name = A0N(861, 10, 40);
        if (str.startsWith(name)) {
            return 1;
        }
        String name2 = A0N(1560, 10, 43);
        if (str.startsWith(name2)) {
            return 1;
        }
        if (C5C.A02 >= 26) {
            return 0;
        }
        String name3 = A0N(725, 25, 44);
        if (str.equals(name3)) {
            return -1;
        }
        return 0;
    }

    public static /* synthetic */ int A09(B3 b3) {
        return b3.A03.startsWith(A0N(861, 10, 40)) ? 1 : 0;
    }

    public static /* synthetic */ int A0A(BZ bz, Object obj, Object obj2) {
        return bz.A8w(obj2) - bz.A8w(obj);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:15:0x0057  */
    /* JADX WARN: Code duplicated, block: B:17:0x005b A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:42:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:44:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:46:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:48:0x0104  */
    /* JADX WARN: Code duplicated, block: B:50:0x010b  */
    public static Pair<Integer, Integer> A0B(C2691qI c2691qI) {
        if (c2691qI.A0R == null) {
            return null;
        }
        String[] strArrSplit = c2691qI.A0R.split(A0N(1407, 2, 107));
        if (A0N(1765, 18, 26).equals(c2691qI.A0W)) {
            return A0E(c2691qI.A0R, strArrSplit);
        }
        byte b = 0;
        String[] strArr = A02;
        if (strArr[1].length() == strArr[3].length()) {
            A02[7] = "tNXQa1vGcfp5ezAoaXcp0CKZSytrXWro";
            String str = strArrSplit[0];
            switch (str.hashCode()) {
                case 3004662:
                    if (str.equals(A0N(1545, 4, 28))) {
                        b = 5;
                    } else {
                        b = -1;
                    }
                    switch (b) {
                        case 0:
                        case 1:
                            return A0D(c2691qI.A0R, strArrSplit);
                        case 2:
                            return A0F(c2691qI.A0R, strArrSplit);
                        case 3:
                        case 4:
                            return A0H(c2691qI.A0R, strArrSplit, c2691qI.A0N);
                        case 5:
                            return A0G(c2691qI.A0R, strArrSplit, c2691qI.A0N);
                        case 6:
                            return A0C(c2691qI.A0R, strArrSplit);
                        default:
                            return null;
                    }
                case 3006243:
                    if (A02[4].charAt(21) == 'A') {
                        A02[4] = "3GHWnNsivmk8fIs2ywxIWAiS03xMF18F";
                        if (!str.equals(A0N(1549, 4, 17))) {
                            b = -1;
                        }
                        switch (b) {
                            case 0:
                            case 1:
                                return A0D(c2691qI.A0R, strArrSplit);
                            case 2:
                                return A0F(c2691qI.A0R, strArrSplit);
                            case 3:
                            case 4:
                                return A0H(c2691qI.A0R, strArrSplit, c2691qI.A0N);
                            case 5:
                                return A0G(c2691qI.A0R, strArrSplit, c2691qI.A0N);
                            case 6:
                                return A0C(c2691qI.A0R, strArrSplit);
                            default:
                                return null;
                        }
                    }
                    break;
                case 3006244:
                    if (str.equals(A0N(1553, 4, 16))) {
                        b = 1;
                    } else {
                        b = -1;
                    }
                    switch (b) {
                        case 0:
                        case 1:
                            return A0D(c2691qI.A0R, strArrSplit);
                        case 2:
                            return A0F(c2691qI.A0R, strArrSplit);
                        case 3:
                        case 4:
                            return A0H(c2691qI.A0R, strArrSplit, c2691qI.A0N);
                        case 5:
                            return A0G(c2691qI.A0R, strArrSplit, c2691qI.A0N);
                        case 6:
                            return A0C(c2691qI.A0R, strArrSplit);
                        default:
                            return null;
                    }
                case 3199032:
                    if (str.equals(A0N(1600, 4, 43))) {
                        b = 3;
                    } else {
                        b = -1;
                    }
                    switch (b) {
                        case 0:
                        case 1:
                            return A0D(c2691qI.A0R, strArrSplit);
                        case 2:
                            return A0F(c2691qI.A0R, strArrSplit);
                        case 3:
                        case 4:
                            return A0H(c2691qI.A0R, strArrSplit, c2691qI.A0N);
                        case 5:
                            return A0G(c2691qI.A0R, strArrSplit, c2691qI.A0N);
                        case 6:
                            return A0C(c2691qI.A0R, strArrSplit);
                        default:
                            return null;
                    }
                case 3214780:
                    if (str.equals(A0N(1604, 4, 118))) {
                        b = 4;
                    } else {
                        b = -1;
                    }
                    switch (b) {
                        case 0:
                        case 1:
                            return A0D(c2691qI.A0R, strArrSplit);
                        case 2:
                            return A0F(c2691qI.A0R, strArrSplit);
                        case 3:
                        case 4:
                            return A0H(c2691qI.A0R, strArrSplit, c2691qI.A0N);
                        case 5:
                            return A0G(c2691qI.A0R, strArrSplit, c2691qI.A0N);
                        case 6:
                            return A0C(c2691qI.A0R, strArrSplit);
                        default:
                            return null;
                    }
                case 3356560:
                    if (str.equals(A0N(1625, 4, 21))) {
                        b = 6;
                    } else {
                        b = -1;
                    }
                    switch (b) {
                        case 0:
                        case 1:
                            return A0D(c2691qI.A0R, strArrSplit);
                        case 2:
                            return A0F(c2691qI.A0R, strArrSplit);
                        case 3:
                        case 4:
                            return A0H(c2691qI.A0R, strArrSplit, c2691qI.A0N);
                        case 5:
                            return A0G(c2691qI.A0R, strArrSplit, c2691qI.A0N);
                        case 6:
                            return A0C(c2691qI.A0R, strArrSplit);
                        default:
                            return null;
                    }
                case 3624515:
                    if (str.equals(A0N(1839, 4, 47))) {
                        b = 2;
                    } else {
                        b = -1;
                    }
                    switch (b) {
                        case 0:
                        case 1:
                            return A0D(c2691qI.A0R, strArrSplit);
                        case 2:
                            return A0F(c2691qI.A0R, strArrSplit);
                        case 3:
                        case 4:
                            return A0H(c2691qI.A0R, strArrSplit, c2691qI.A0N);
                        case 5:
                            return A0G(c2691qI.A0R, strArrSplit, c2691qI.A0N);
                        case 6:
                            return A0C(c2691qI.A0R, strArrSplit);
                        default:
                            return null;
                    }
                default:
                    b = -1;
                    switch (b) {
                        case 0:
                        case 1:
                            return A0D(c2691qI.A0R, strArrSplit);
                        case 2:
                            return A0F(c2691qI.A0R, strArrSplit);
                        case 3:
                        case 4:
                            return A0H(c2691qI.A0R, strArrSplit, c2691qI.A0N);
                        case 5:
                            return A0G(c2691qI.A0R, strArrSplit, c2691qI.A0N);
                        case 6:
                            return A0C(c2691qI.A0R, strArrSplit);
                        default:
                            return null;
                    }
            }
        }
        throw new RuntimeException();
    }

    public static Pair<Integer, Integer> A0C(String str, String[] strArr) {
        int length = strArr.length;
        String strA0N = A0N(428, 38, 99);
        String strA0N2 = A0N(IronSourceError.ERROR_BN_LOAD_NO_CONFIG, 14, 80);
        if (length != 3) {
            AbstractC09234g.A07(strA0N2, strA0N + str);
            return null;
        }
        try {
            int objectTypeIndication = Integer.parseInt(strArr[1], 16);
            if (A0N(1491, 15, 21).equals(C3J.A05(objectTypeIndication))) {
                int objectTypeIndication2 = Integer.parseInt(strArr[2]);
                int iA05 = A05(objectTypeIndication2);
                if (iA05 != -1) {
                    return new Pair<>(Integer.valueOf(iA05), 0);
                }
            }
        } catch (NumberFormatException unused) {
            AbstractC09234g.A07(strA0N2, strA0N + str);
        }
        return null;
    }

    public static Pair<Integer, Integer> A0D(String str, String[] strArr) {
        int i;
        int i2;
        int length = strArr.length;
        String strA0N = A0N(307, 37, 34);
        String strA0N2 = A0N(IronSourceError.ERROR_BN_LOAD_NO_CONFIG, 14, 80);
        if (length < 2) {
            AbstractC09234g.A07(strA0N2, strA0N + str);
            return null;
        }
        try {
            if (strArr[1].length() == 6) {
                i = Integer.parseInt(strArr[1].substring(0, 2), 16);
                i2 = Integer.parseInt(strArr[1].substring(4), 16);
            } else if (strArr.length >= 3) {
                i = Integer.parseInt(strArr[1]);
                i2 = Integer.parseInt(strArr[2]);
            } else {
                AbstractC09234g.A07(strA0N2, strA0N + str);
                return null;
            }
            int iA04 = A04(i);
            if (iA04 == -1) {
                AbstractC09234g.A07(strA0N2, A0N(1212, 21, 74) + i);
                return null;
            }
            int levelInteger = A02(i2);
            if (levelInteger == -1) {
                AbstractC09234g.A07(strA0N2, A0N(1193, 19, 34) + i2);
                return null;
            }
            return new Pair<>(Integer.valueOf(iA04), Integer.valueOf(levelInteger));
        } catch (NumberFormatException unused) {
            AbstractC09234g.A07(strA0N2, strA0N + str);
            return null;
        }
    }

    public static Pair<Integer, Integer> A0E(String str, String[] strArr) {
        int length = strArr.length;
        String strA0N = A0N(344, 46, 85);
        String levelString = A0N(IronSourceError.ERROR_BN_LOAD_NO_CONFIG, 14, 80);
        if (length < 3) {
            AbstractC09234g.A07(levelString, strA0N + str);
            return null;
        }
        Matcher matcher = A04.matcher(strArr[1]);
        if (!matcher.matches()) {
            AbstractC09234g.A07(levelString, strA0N + str);
            return null;
        }
        String strGroup = matcher.group(1);
        Integer profile = A0L(strGroup);
        if (profile == null) {
            AbstractC09234g.A07(levelString, A0N(1268, 37, 2) + strGroup);
            return null;
        }
        String str2 = strArr[2];
        Integer numA0K = A0K(str2);
        if (numA0K == null) {
            AbstractC09234g.A07(levelString, A0N(1233, 35, 47) + str2);
            return null;
        }
        return new Pair<>(profile, numA0K);
    }

    public static Pair<Integer, Integer> A0F(String str, String[] strArr) {
        int length = strArr.length;
        String strA0N = A0N(466, 37, 4);
        String strA0N2 = A0N(IronSourceError.ERROR_BN_LOAD_NO_CONFIG, 14, 80);
        if (length < 3) {
            AbstractC09234g.A07(strA0N2, strA0N + str);
            return null;
        }
        try {
            int i = Integer.parseInt(strArr[1]);
            int i2 = Integer.parseInt(strArr[2]);
            int profile = A07(i);
            if (profile == -1) {
                AbstractC09234g.A07(strA0N2, A0N(1380, 21, 57) + i);
                return null;
            }
            int profileInteger = A06(i2);
            if (profileInteger == -1) {
                AbstractC09234g.A07(strA0N2, A0N(1361, 19, 65) + i2);
                return null;
            }
            return new Pair<>(Integer.valueOf(profile), Integer.valueOf(profileInteger));
        } catch (NumberFormatException unused) {
            AbstractC09234g.A07(strA0N2, strA0N + str);
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:35:0x00ed  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r5v2, types: [int] */
    public static Pair<Integer, Integer> A0G(String str, String[] strArr, ColorInfo colorInfo) {
        int bitDepthInteger;
        int length = strArr.length;
        String strA0N = A0N(270, 37, 63);
        String strA0N2 = A0N(IronSourceError.ERROR_BN_LOAD_NO_CONFIG, 14, 80);
        if (length < 4) {
            AbstractC09234g.A07(strA0N2, ((String) strA0N) + str);
            return null;
        }
        try {
            int i = Integer.parseInt(strArr[1]);
            int i2 = Integer.parseInt(strArr[2].substring(0, 2));
            strA0N = Integer.parseInt(strArr[3]);
            if (i != 0) {
                AbstractC09234g.A07(strA0N2, A0N(1172, 21, 117) + i);
                return null;
            }
            if (strA0N != 8 && strA0N != 10) {
                AbstractC09234g.A07(strA0N2, A0N(1130, 23, 108) + ((int) strA0N));
                return null;
            }
            if (strA0N == 8) {
                bitDepthInteger = 1;
            } else if (colorInfo != null) {
                byte[] bArr = colorInfo.A04;
                int levelInteger = A02[4].charAt(21);
                if (levelInteger != 65) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A02;
                strArr2[0] = "3Naka6lMBkjhse4CHD6m4SHW";
                strArr2[2] = "4qp9";
                if (bArr == null) {
                    int levelInteger2 = colorInfo.A03;
                    if (levelInteger2 != 7) {
                        int levelInteger3 = colorInfo.A03;
                        if (levelInteger3 != 6) {
                            bitDepthInteger = 2;
                        }
                    }
                }
                bitDepthInteger = 4096;
            } else {
                bitDepthInteger = 2;
            }
            int levelInteger4 = A01(i2);
            if (levelInteger4 == -1) {
                AbstractC09234g.A07(strA0N2, A0N(1153, 19, 80) + i2);
                return null;
            }
            return new Pair<>(Integer.valueOf(bitDepthInteger), Integer.valueOf(levelInteger4));
        } catch (NumberFormatException unused) {
            AbstractC09234g.A07(strA0N2, strA0N + str);
            return null;
        }
    }

    public static Pair<Integer, Integer> A0H(String str, String[] strArr, ColorInfo colorInfo) {
        int i;
        int length = strArr.length;
        String strA0N = A0N(390, 38, 48);
        String strA0N2 = A0N(IronSourceError.ERROR_BN_LOAD_NO_CONFIG, 14, 80);
        if (length < 4) {
            AbstractC09234g.A07(strA0N2, strA0N + str);
            return null;
        }
        Matcher matcher = A04.matcher(strArr[1]);
        boolean zMatches = matcher.matches();
        if (A02[7].length() != 25) {
            String[] strArr2 = A02;
            strArr2[6] = "KQD5T9TnBB7A1Qau37dPwA8fp0YnC9XP";
            strArr2[5] = "pnb4d0x2BWoBz7rcvfU2b1k7Wl63lPA1";
            if (!zMatches) {
                AbstractC09234g.A07(strA0N2, strA0N + str);
                return null;
            }
            String strGroup = matcher.group(1);
            if (A0N(77, 1, 121).equals(strGroup)) {
                i = 1;
            } else if (A0N(86, 1, 40).equals(strGroup)) {
                if (colorInfo != null && colorInfo.A03 == 6) {
                    i = 4096;
                } else {
                    i = 2;
                }
            } else {
                AbstractC09234g.A07(strA0N2, A0N(1332, 29, 106) + strGroup);
                return null;
            }
            String[] strArr3 = A02;
            if (strArr3[6].charAt(8) == strArr3[5].charAt(8)) {
                A02[7] = "4AE";
                String profileString = strArr[3];
                Integer numA0M = A0M(profileString);
                if (numA0M == null) {
                    AbstractC09234g.A07(strA0N2, A0N(1305, 27, 83) + profileString);
                    return null;
                }
                return new Pair<>(Integer.valueOf(i), numA0M);
            }
        }
        throw new RuntimeException();
    }

    public static B3 A0I() throws BX {
        return A0J(A0N(1506, 9, 92), false, false);
    }

    public static B3 A0J(String str, boolean z, boolean z2) throws BX {
        List<B3> listA0R = A0R(str, z, z2);
        if (listA0R.isEmpty()) {
            return null;
        }
        return listA0R.get(0);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:51:0x0113  */
    /* JADX WARN: Code duplicated, block: B:53:0x011a  */
    /* JADX WARN: Code duplicated, block: B:55:0x0121  */
    /* JADX WARN: Code duplicated, block: B:57:0x0128  */
    /* JADX WARN: Code duplicated, block: B:59:0x013c  */
    /* JADX WARN: Code duplicated, block: B:61:0x014d  */
    /* JADX WARN: Code duplicated, block: B:63:0x015e  */
    /* JADX WARN: Code duplicated, block: B:65:0x0176  */
    /* JADX WARN: Code duplicated, block: B:67:0x0183  */
    /* JADX WARN: Code duplicated, block: B:69:0x0189  */
    /* JADX WARN: Code duplicated, block: B:71:0x0190  */
    /* JADX WARN: Code duplicated, block: B:73:0x01aa A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:74:0x01ab  */
    /* JADX WARN: Code duplicated, block: B:76:0x01b8  */
    /* JADX WARN: Code duplicated, block: B:78:0x01bf  */
    /* JADX WARN: Code duplicated, block: B:7:0x0010  */
    /* JADX WARN: Code duplicated, block: B:80:0x01c6  */
    /* JADX WARN: Code duplicated, block: B:82:0x01cb  */
    /* JADX WARN: Code duplicated, block: B:84:0x01d0  */
    /* JADX WARN: Code duplicated, block: B:86:0x01e3 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:87:0x01e4  */
    /* JADX WARN: Code duplicated, block: B:89:0x01f1  */
    /* JADX WARN: Code duplicated, block: B:91:0x0207  */
    /* JADX WARN: Code duplicated, block: B:9:0x0014 A[RETURN] */
    public static Integer A0K(String str) {
        byte b;
        String[] strArr;
        String[] strArr2;
        String[] strArr3;
        String[] strArr4;
        if (str == null) {
            return null;
        }
        switch (str.hashCode()) {
            case 1537:
                if (str.equals(A0N(59, 2, 105))) {
                    b = 0;
                } else {
                    b = -1;
                }
                switch (b) {
                    case 0:
                        strArr = A02;
                        if (strArr[0].length() != strArr[2].length()) {
                            A02[4] = "XQhIYEIiJgH52NRyploGMAGgN5DPAsce";
                            return 1;
                        }
                        break;
                    case 1:
                        if (A02[4].charAt(21) != 'A') {
                            return 2;
                        }
                        String[] strArr5 = A02;
                        strArr5[0] = "NcQyspmINFMcRuLYZZaVZBrz";
                        strArr5[2] = "mM9F";
                        return 2;
                    case 2:
                        return 4;
                    case 3:
                        return 8;
                    case 4:
                        return 16;
                    case 5:
                        return 32;
                    case 6:
                        strArr2 = A02;
                        if (strArr2[6].charAt(8) != strArr2[5].charAt(8)) {
                            return 64;
                        }
                        String[] strArr6 = A02;
                        strArr6[0] = "UDGIwR651ijO548zFQsUwwxK";
                        strArr6[2] = "M6So";
                        return 64;
                    case 7:
                        return 128;
                    case 8:
                        strArr3 = A02;
                        if (strArr3[0].length() != strArr3[2].length()) {
                            throw new RuntimeException();
                        }
                        String[] strArr7 = A02;
                        strArr7[1] = "TGauph7jBQEYmTr";
                        strArr7[3] = "n0Og3rwDrR2czMW";
                        return 256;
                    case 9:
                        strArr4 = A02;
                        if (strArr4[0].length() != strArr4[2].length()) {
                            String[] strArr8 = A02;
                            strArr8[6] = "JZSyC5vCBXuabnbyozrLobOBW6DRabKm";
                            strArr8[5] = "SUTiquDjBRLooF3seq5WKCluMSkODYPH";
                            return 512;
                        }
                        String[] strArr9 = A02;
                        strArr9[6] = "4frbtvvdB1MyLLrjo3HhsejHsVGyEKsL";
                        strArr9[5] = "ORKdFCu3BJGZr1GMWmsvkKy1b1R8zlrH";
                        return 512;
                    case 10:
                        return 1024;
                    case 11:
                        return 2048;
                    case 12:
                        return 4096;
                    default:
                        return null;
                }
                throw new RuntimeException();
            case 1538:
                if (str.equals(A0N(61, 2, 24))) {
                    b = 1;
                } else {
                    b = -1;
                }
                switch (b) {
                    case 0:
                        strArr = A02;
                        if (strArr[0].length() != strArr[2].length()) {
                            A02[4] = "XQhIYEIiJgH52NRyploGMAGgN5DPAsce";
                            return 1;
                        }
                        break;
                    case 1:
                        if (A02[4].charAt(21) != 'A') {
                            return 2;
                        }
                        String[] strArr10 = A02;
                        strArr10[0] = "NcQyspmINFMcRuLYZZaVZBrz";
                        strArr10[2] = "mM9F";
                        return 2;
                    case 2:
                        return 4;
                    case 3:
                        return 8;
                    case 4:
                        return 16;
                    case 5:
                        return 32;
                    case 6:
                        strArr2 = A02;
                        if (strArr2[6].charAt(8) != strArr2[5].charAt(8)) {
                            return 64;
                        }
                        String[] strArr11 = A02;
                        strArr11[0] = "UDGIwR651ijO548zFQsUwwxK";
                        strArr11[2] = "M6So";
                        return 64;
                    case 7:
                        return 128;
                    case 8:
                        strArr3 = A02;
                        if (strArr3[0].length() != strArr3[2].length()) {
                            throw new RuntimeException();
                        }
                        String[] strArr12 = A02;
                        strArr12[1] = "TGauph7jBQEYmTr";
                        strArr12[3] = "n0Og3rwDrR2czMW";
                        return 256;
                    case 9:
                        strArr4 = A02;
                        if (strArr4[0].length() != strArr4[2].length()) {
                            String[] strArr13 = A02;
                            strArr13[6] = "JZSyC5vCBXuabnbyozrLobOBW6DRabKm";
                            strArr13[5] = "SUTiquDjBRLooF3seq5WKCluMSkODYPH";
                            return 512;
                        }
                        String[] strArr14 = A02;
                        strArr14[6] = "4frbtvvdB1MyLLrjo3HhsejHsVGyEKsL";
                        strArr14[5] = "ORKdFCu3BJGZr1GMWmsvkKy1b1R8zlrH";
                        return 512;
                    case 10:
                        return 1024;
                    case 11:
                        return 2048;
                    case 12:
                        return 4096;
                    default:
                        return null;
                }
                throw new RuntimeException();
            case 1539:
                String[] strArr15 = A02;
                if (strArr15[0].length() != strArr15[2].length()) {
                    A02[4] = "4lxnqF3Aq6PG5fAKBVQihAUdAnfaVY4u";
                    if (str.equals(A0N(63, 2, 111))) {
                        b = 2;
                    } else {
                        b = -1;
                    }
                    switch (b) {
                        case 0:
                            strArr = A02;
                            if (strArr[0].length() != strArr[2].length()) {
                                A02[4] = "XQhIYEIiJgH52NRyploGMAGgN5DPAsce";
                                return 1;
                            }
                            break;
                        case 1:
                            if (A02[4].charAt(21) != 'A') {
                                return 2;
                            }
                            String[] strArr16 = A02;
                            strArr16[0] = "NcQyspmINFMcRuLYZZaVZBrz";
                            strArr16[2] = "mM9F";
                            return 2;
                        case 2:
                            return 4;
                        case 3:
                            return 8;
                        case 4:
                            return 16;
                        case 5:
                            return 32;
                        case 6:
                            strArr2 = A02;
                            if (strArr2[6].charAt(8) != strArr2[5].charAt(8)) {
                                return 64;
                            }
                            String[] strArr17 = A02;
                            strArr17[0] = "UDGIwR651ijO548zFQsUwwxK";
                            strArr17[2] = "M6So";
                            return 64;
                        case 7:
                            return 128;
                        case 8:
                            strArr3 = A02;
                            if (strArr3[0].length() != strArr3[2].length()) {
                                throw new RuntimeException();
                            }
                            String[] strArr18 = A02;
                            strArr18[1] = "TGauph7jBQEYmTr";
                            strArr18[3] = "n0Og3rwDrR2czMW";
                            return 256;
                        case 9:
                            strArr4 = A02;
                            if (strArr4[0].length() != strArr4[2].length()) {
                                String[] strArr19 = A02;
                                strArr19[6] = "JZSyC5vCBXuabnbyozrLobOBW6DRabKm";
                                strArr19[5] = "SUTiquDjBRLooF3seq5WKCluMSkODYPH";
                                return 512;
                            }
                            String[] strArr110 = A02;
                            strArr110[6] = "4frbtvvdB1MyLLrjo3HhsejHsVGyEKsL";
                            strArr110[5] = "ORKdFCu3BJGZr1GMWmsvkKy1b1R8zlrH";
                            return 512;
                        case 10:
                            return 1024;
                        case 11:
                            return 2048;
                        case 12:
                            return 4096;
                        default:
                            return null;
                    }
                }
                throw new RuntimeException();
            case 1540:
                if (str.equals(A0N(65, 2, 50))) {
                    b = 3;
                } else {
                    b = -1;
                }
                switch (b) {
                    case 0:
                        strArr = A02;
                        if (strArr[0].length() != strArr[2].length()) {
                            A02[4] = "XQhIYEIiJgH52NRyploGMAGgN5DPAsce";
                            return 1;
                        }
                        break;
                    case 1:
                        if (A02[4].charAt(21) != 'A') {
                            return 2;
                        }
                        String[] strArr111 = A02;
                        strArr111[0] = "NcQyspmINFMcRuLYZZaVZBrz";
                        strArr111[2] = "mM9F";
                        return 2;
                    case 2:
                        return 4;
                    case 3:
                        return 8;
                    case 4:
                        return 16;
                    case 5:
                        return 32;
                    case 6:
                        strArr2 = A02;
                        if (strArr2[6].charAt(8) != strArr2[5].charAt(8)) {
                            return 64;
                        }
                        String[] strArr112 = A02;
                        strArr112[0] = "UDGIwR651ijO548zFQsUwwxK";
                        strArr112[2] = "M6So";
                        return 64;
                    case 7:
                        return 128;
                    case 8:
                        strArr3 = A02;
                        if (strArr3[0].length() != strArr3[2].length()) {
                            throw new RuntimeException();
                        }
                        String[] strArr113 = A02;
                        strArr113[1] = "TGauph7jBQEYmTr";
                        strArr113[3] = "n0Og3rwDrR2czMW";
                        return 256;
                    case 9:
                        strArr4 = A02;
                        if (strArr4[0].length() != strArr4[2].length()) {
                            String[] strArr114 = A02;
                            strArr114[6] = "JZSyC5vCBXuabnbyozrLobOBW6DRabKm";
                            strArr114[5] = "SUTiquDjBRLooF3seq5WKCluMSkODYPH";
                            return 512;
                        }
                        String[] strArr115 = A02;
                        strArr115[6] = "4frbtvvdB1MyLLrjo3HhsejHsVGyEKsL";
                        strArr115[5] = "ORKdFCu3BJGZr1GMWmsvkKy1b1R8zlrH";
                        return 512;
                    case 10:
                        return 1024;
                    case 11:
                        return 2048;
                    case 12:
                        return 4096;
                    default:
                        return null;
                }
                throw new RuntimeException();
            case 1541:
                if (str.equals(A0N(67, 2, 4))) {
                    b = 4;
                } else {
                    b = -1;
                }
                switch (b) {
                    case 0:
                        strArr = A02;
                        if (strArr[0].length() != strArr[2].length()) {
                            A02[4] = "XQhIYEIiJgH52NRyploGMAGgN5DPAsce";
                            return 1;
                        }
                        break;
                    case 1:
                        if (A02[4].charAt(21) != 'A') {
                            return 2;
                        }
                        String[] strArr116 = A02;
                        strArr116[0] = "NcQyspmINFMcRuLYZZaVZBrz";
                        strArr116[2] = "mM9F";
                        return 2;
                    case 2:
                        return 4;
                    case 3:
                        return 8;
                    case 4:
                        return 16;
                    case 5:
                        return 32;
                    case 6:
                        strArr2 = A02;
                        if (strArr2[6].charAt(8) != strArr2[5].charAt(8)) {
                            return 64;
                        }
                        String[] strArr117 = A02;
                        strArr117[0] = "UDGIwR651ijO548zFQsUwwxK";
                        strArr117[2] = "M6So";
                        return 64;
                    case 7:
                        return 128;
                    case 8:
                        strArr3 = A02;
                        if (strArr3[0].length() != strArr3[2].length()) {
                            throw new RuntimeException();
                        }
                        String[] strArr118 = A02;
                        strArr118[1] = "TGauph7jBQEYmTr";
                        strArr118[3] = "n0Og3rwDrR2czMW";
                        return 256;
                    case 9:
                        strArr4 = A02;
                        if (strArr4[0].length() != strArr4[2].length()) {
                            String[] strArr119 = A02;
                            strArr119[6] = "JZSyC5vCBXuabnbyozrLobOBW6DRabKm";
                            strArr119[5] = "SUTiquDjBRLooF3seq5WKCluMSkODYPH";
                            return 512;
                        }
                        String[] strArr1110 = A02;
                        strArr1110[6] = "4frbtvvdB1MyLLrjo3HhsejHsVGyEKsL";
                        strArr1110[5] = "ORKdFCu3BJGZr1GMWmsvkKy1b1R8zlrH";
                        return 512;
                    case 10:
                        return 1024;
                    case 11:
                        return 2048;
                    case 12:
                        return 4096;
                    default:
                        return null;
                }
                throw new RuntimeException();
            case 1542:
                if (str.equals(A0N(69, 2, 80))) {
                    b = 5;
                } else {
                    b = -1;
                }
                switch (b) {
                    case 0:
                        strArr = A02;
                        if (strArr[0].length() != strArr[2].length()) {
                            A02[4] = "XQhIYEIiJgH52NRyploGMAGgN5DPAsce";
                            return 1;
                        }
                        break;
                    case 1:
                        if (A02[4].charAt(21) != 'A') {
                            return 2;
                        }
                        String[] strArr1111 = A02;
                        strArr1111[0] = "NcQyspmINFMcRuLYZZaVZBrz";
                        strArr1111[2] = "mM9F";
                        return 2;
                    case 2:
                        return 4;
                    case 3:
                        return 8;
                    case 4:
                        return 16;
                    case 5:
                        return 32;
                    case 6:
                        strArr2 = A02;
                        if (strArr2[6].charAt(8) != strArr2[5].charAt(8)) {
                            return 64;
                        }
                        String[] strArr1112 = A02;
                        strArr1112[0] = "UDGIwR651ijO548zFQsUwwxK";
                        strArr1112[2] = "M6So";
                        return 64;
                    case 7:
                        return 128;
                    case 8:
                        strArr3 = A02;
                        if (strArr3[0].length() != strArr3[2].length()) {
                            throw new RuntimeException();
                        }
                        String[] strArr1113 = A02;
                        strArr1113[1] = "TGauph7jBQEYmTr";
                        strArr1113[3] = "n0Og3rwDrR2czMW";
                        return 256;
                    case 9:
                        strArr4 = A02;
                        if (strArr4[0].length() != strArr4[2].length()) {
                            String[] strArr1114 = A02;
                            strArr1114[6] = "JZSyC5vCBXuabnbyozrLobOBW6DRabKm";
                            strArr1114[5] = "SUTiquDjBRLooF3seq5WKCluMSkODYPH";
                            return 512;
                        }
                        String[] strArr1115 = A02;
                        strArr1115[6] = "4frbtvvdB1MyLLrjo3HhsejHsVGyEKsL";
                        strArr1115[5] = "ORKdFCu3BJGZr1GMWmsvkKy1b1R8zlrH";
                        return 512;
                    case 10:
                        return 1024;
                    case 11:
                        return 2048;
                    case 12:
                        return 4096;
                    default:
                        return null;
                }
                throw new RuntimeException();
            case 1543:
                if (str.equals(A0N(71, 2, 97))) {
                    b = 6;
                } else {
                    b = -1;
                }
                switch (b) {
                    case 0:
                        strArr = A02;
                        if (strArr[0].length() != strArr[2].length()) {
                            A02[4] = "XQhIYEIiJgH52NRyploGMAGgN5DPAsce";
                            return 1;
                        }
                        break;
                    case 1:
                        if (A02[4].charAt(21) != 'A') {
                            return 2;
                        }
                        String[] strArr1116 = A02;
                        strArr1116[0] = "NcQyspmINFMcRuLYZZaVZBrz";
                        strArr1116[2] = "mM9F";
                        return 2;
                    case 2:
                        return 4;
                    case 3:
                        return 8;
                    case 4:
                        return 16;
                    case 5:
                        return 32;
                    case 6:
                        strArr2 = A02;
                        if (strArr2[6].charAt(8) != strArr2[5].charAt(8)) {
                            return 64;
                        }
                        String[] strArr1117 = A02;
                        strArr1117[0] = "UDGIwR651ijO548zFQsUwwxK";
                        strArr1117[2] = "M6So";
                        return 64;
                    case 7:
                        return 128;
                    case 8:
                        strArr3 = A02;
                        if (strArr3[0].length() != strArr3[2].length()) {
                            throw new RuntimeException();
                        }
                        String[] strArr1118 = A02;
                        strArr1118[1] = "TGauph7jBQEYmTr";
                        strArr1118[3] = "n0Og3rwDrR2czMW";
                        return 256;
                    case 9:
                        strArr4 = A02;
                        if (strArr4[0].length() != strArr4[2].length()) {
                            String[] strArr1119 = A02;
                            strArr1119[6] = "JZSyC5vCBXuabnbyozrLobOBW6DRabKm";
                            strArr1119[5] = "SUTiquDjBRLooF3seq5WKCluMSkODYPH";
                            return 512;
                        }
                        String[] strArr11110 = A02;
                        strArr11110[6] = "4frbtvvdB1MyLLrjo3HhsejHsVGyEKsL";
                        strArr11110[5] = "ORKdFCu3BJGZr1GMWmsvkKy1b1R8zlrH";
                        return 512;
                    case 10:
                        return 1024;
                    case 11:
                        return 2048;
                    case 12:
                        return 4096;
                    default:
                        return null;
                }
                throw new RuntimeException();
            case 1544:
                if (str.equals(A0N(73, 2, 100))) {
                    b = 7;
                } else {
                    b = -1;
                }
                switch (b) {
                    case 0:
                        strArr = A02;
                        if (strArr[0].length() != strArr[2].length()) {
                            A02[4] = "XQhIYEIiJgH52NRyploGMAGgN5DPAsce";
                            return 1;
                        }
                        break;
                    case 1:
                        if (A02[4].charAt(21) != 'A') {
                            return 2;
                        }
                        String[] strArr11111 = A02;
                        strArr11111[0] = "NcQyspmINFMcRuLYZZaVZBrz";
                        strArr11111[2] = "mM9F";
                        return 2;
                    case 2:
                        return 4;
                    case 3:
                        return 8;
                    case 4:
                        return 16;
                    case 5:
                        return 32;
                    case 6:
                        strArr2 = A02;
                        if (strArr2[6].charAt(8) != strArr2[5].charAt(8)) {
                            return 64;
                        }
                        String[] strArr11112 = A02;
                        strArr11112[0] = "UDGIwR651ijO548zFQsUwwxK";
                        strArr11112[2] = "M6So";
                        return 64;
                    case 7:
                        return 128;
                    case 8:
                        strArr3 = A02;
                        if (strArr3[0].length() != strArr3[2].length()) {
                            throw new RuntimeException();
                        }
                        String[] strArr11113 = A02;
                        strArr11113[1] = "TGauph7jBQEYmTr";
                        strArr11113[3] = "n0Og3rwDrR2czMW";
                        return 256;
                    case 9:
                        strArr4 = A02;
                        if (strArr4[0].length() != strArr4[2].length()) {
                            String[] strArr11114 = A02;
                            strArr11114[6] = "JZSyC5vCBXuabnbyozrLobOBW6DRabKm";
                            strArr11114[5] = "SUTiquDjBRLooF3seq5WKCluMSkODYPH";
                            return 512;
                        }
                        String[] strArr11115 = A02;
                        strArr11115[6] = "4frbtvvdB1MyLLrjo3HhsejHsVGyEKsL";
                        strArr11115[5] = "ORKdFCu3BJGZr1GMWmsvkKy1b1R8zlrH";
                        return 512;
                    case 10:
                        return 1024;
                    case 11:
                        return 2048;
                    case 12:
                        return 4096;
                    default:
                        return null;
                }
                throw new RuntimeException();
            case 1545:
                if (str.equals(A0N(75, 2, 38))) {
                    b = 8;
                } else {
                    b = -1;
                }
                switch (b) {
                    case 0:
                        strArr = A02;
                        if (strArr[0].length() != strArr[2].length()) {
                            A02[4] = "XQhIYEIiJgH52NRyploGMAGgN5DPAsce";
                            return 1;
                        }
                        break;
                    case 1:
                        if (A02[4].charAt(21) != 'A') {
                            return 2;
                        }
                        String[] strArr11116 = A02;
                        strArr11116[0] = "NcQyspmINFMcRuLYZZaVZBrz";
                        strArr11116[2] = "mM9F";
                        return 2;
                    case 2:
                        return 4;
                    case 3:
                        return 8;
                    case 4:
                        return 16;
                    case 5:
                        return 32;
                    case 6:
                        strArr2 = A02;
                        if (strArr2[6].charAt(8) != strArr2[5].charAt(8)) {
                            return 64;
                        }
                        String[] strArr11117 = A02;
                        strArr11117[0] = "UDGIwR651ijO548zFQsUwwxK";
                        strArr11117[2] = "M6So";
                        return 64;
                    case 7:
                        return 128;
                    case 8:
                        strArr3 = A02;
                        if (strArr3[0].length() != strArr3[2].length()) {
                            throw new RuntimeException();
                        }
                        String[] strArr11118 = A02;
                        strArr11118[1] = "TGauph7jBQEYmTr";
                        strArr11118[3] = "n0Og3rwDrR2czMW";
                        return 256;
                    case 9:
                        strArr4 = A02;
                        if (strArr4[0].length() != strArr4[2].length()) {
                            String[] strArr11119 = A02;
                            strArr11119[6] = "JZSyC5vCBXuabnbyozrLobOBW6DRabKm";
                            strArr11119[5] = "SUTiquDjBRLooF3seq5WKCluMSkODYPH";
                            return 512;
                        }
                        String[] strArr111110 = A02;
                        strArr111110[6] = "4frbtvvdB1MyLLrjo3HhsejHsVGyEKsL";
                        strArr111110[5] = "ORKdFCu3BJGZr1GMWmsvkKy1b1R8zlrH";
                        return 512;
                    case 10:
                        return 1024;
                    case 11:
                        return 2048;
                    case 12:
                        return 4096;
                    default:
                        return null;
                }
                throw new RuntimeException();
            case 1567:
                if (str.equals(A0N(78, 2, 105))) {
                    b = 9;
                } else {
                    b = -1;
                }
                switch (b) {
                    case 0:
                        strArr = A02;
                        if (strArr[0].length() != strArr[2].length()) {
                            A02[4] = "XQhIYEIiJgH52NRyploGMAGgN5DPAsce";
                            return 1;
                        }
                        break;
                    case 1:
                        if (A02[4].charAt(21) != 'A') {
                            return 2;
                        }
                        String[] strArr111111 = A02;
                        strArr111111[0] = "NcQyspmINFMcRuLYZZaVZBrz";
                        strArr111111[2] = "mM9F";
                        return 2;
                    case 2:
                        return 4;
                    case 3:
                        return 8;
                    case 4:
                        return 16;
                    case 5:
                        return 32;
                    case 6:
                        strArr2 = A02;
                        if (strArr2[6].charAt(8) != strArr2[5].charAt(8)) {
                            return 64;
                        }
                        String[] strArr111112 = A02;
                        strArr111112[0] = "UDGIwR651ijO548zFQsUwwxK";
                        strArr111112[2] = "M6So";
                        return 64;
                    case 7:
                        return 128;
                    case 8:
                        strArr3 = A02;
                        if (strArr3[0].length() != strArr3[2].length()) {
                            throw new RuntimeException();
                        }
                        String[] strArr111113 = A02;
                        strArr111113[1] = "TGauph7jBQEYmTr";
                        strArr111113[3] = "n0Og3rwDrR2czMW";
                        return 256;
                    case 9:
                        strArr4 = A02;
                        if (strArr4[0].length() != strArr4[2].length()) {
                            String[] strArr111114 = A02;
                            strArr111114[6] = "JZSyC5vCBXuabnbyozrLobOBW6DRabKm";
                            strArr111114[5] = "SUTiquDjBRLooF3seq5WKCluMSkODYPH";
                            return 512;
                        }
                        String[] strArr111115 = A02;
                        strArr111115[6] = "4frbtvvdB1MyLLrjo3HhsejHsVGyEKsL";
                        strArr111115[5] = "ORKdFCu3BJGZr1GMWmsvkKy1b1R8zlrH";
                        return 512;
                    case 10:
                        return 1024;
                    case 11:
                        return 2048;
                    case 12:
                        return 4096;
                    default:
                        return null;
                }
                throw new RuntimeException();
            case 1568:
                if (str.equals(A0N(80, 2, 25))) {
                    b = 10;
                } else {
                    b = -1;
                }
                switch (b) {
                    case 0:
                        strArr = A02;
                        if (strArr[0].length() != strArr[2].length()) {
                            A02[4] = "XQhIYEIiJgH52NRyploGMAGgN5DPAsce";
                            return 1;
                        }
                        break;
                    case 1:
                        if (A02[4].charAt(21) != 'A') {
                            return 2;
                        }
                        String[] strArr111116 = A02;
                        strArr111116[0] = "NcQyspmINFMcRuLYZZaVZBrz";
                        strArr111116[2] = "mM9F";
                        return 2;
                    case 2:
                        return 4;
                    case 3:
                        return 8;
                    case 4:
                        return 16;
                    case 5:
                        return 32;
                    case 6:
                        strArr2 = A02;
                        if (strArr2[6].charAt(8) != strArr2[5].charAt(8)) {
                            return 64;
                        }
                        String[] strArr111117 = A02;
                        strArr111117[0] = "UDGIwR651ijO548zFQsUwwxK";
                        strArr111117[2] = "M6So";
                        return 64;
                    case 7:
                        return 128;
                    case 8:
                        strArr3 = A02;
                        if (strArr3[0].length() != strArr3[2].length()) {
                            throw new RuntimeException();
                        }
                        String[] strArr111118 = A02;
                        strArr111118[1] = "TGauph7jBQEYmTr";
                        strArr111118[3] = "n0Og3rwDrR2czMW";
                        return 256;
                    case 9:
                        strArr4 = A02;
                        if (strArr4[0].length() != strArr4[2].length()) {
                            String[] strArr111119 = A02;
                            strArr111119[6] = "JZSyC5vCBXuabnbyozrLobOBW6DRabKm";
                            strArr111119[5] = "SUTiquDjBRLooF3seq5WKCluMSkODYPH";
                            return 512;
                        }
                        String[] strArr1111110 = A02;
                        strArr1111110[6] = "4frbtvvdB1MyLLrjo3HhsejHsVGyEKsL";
                        strArr1111110[5] = "ORKdFCu3BJGZr1GMWmsvkKy1b1R8zlrH";
                        return 512;
                    case 10:
                        return 1024;
                    case 11:
                        return 2048;
                    case 12:
                        return 4096;
                    default:
                        return null;
                }
                throw new RuntimeException();
            case 1569:
                if (str.equals(A0N(82, 2, 3))) {
                    b = 11;
                } else {
                    b = -1;
                }
                switch (b) {
                    case 0:
                        strArr = A02;
                        if (strArr[0].length() != strArr[2].length()) {
                            A02[4] = "XQhIYEIiJgH52NRyploGMAGgN5DPAsce";
                            return 1;
                        }
                        break;
                    case 1:
                        if (A02[4].charAt(21) != 'A') {
                            return 2;
                        }
                        String[] strArr1111111 = A02;
                        strArr1111111[0] = "NcQyspmINFMcRuLYZZaVZBrz";
                        strArr1111111[2] = "mM9F";
                        return 2;
                    case 2:
                        return 4;
                    case 3:
                        return 8;
                    case 4:
                        return 16;
                    case 5:
                        return 32;
                    case 6:
                        strArr2 = A02;
                        if (strArr2[6].charAt(8) != strArr2[5].charAt(8)) {
                            return 64;
                        }
                        String[] strArr1111112 = A02;
                        strArr1111112[0] = "UDGIwR651ijO548zFQsUwwxK";
                        strArr1111112[2] = "M6So";
                        return 64;
                    case 7:
                        return 128;
                    case 8:
                        strArr3 = A02;
                        if (strArr3[0].length() != strArr3[2].length()) {
                            throw new RuntimeException();
                        }
                        String[] strArr1111113 = A02;
                        strArr1111113[1] = "TGauph7jBQEYmTr";
                        strArr1111113[3] = "n0Og3rwDrR2czMW";
                        return 256;
                    case 9:
                        strArr4 = A02;
                        if (strArr4[0].length() != strArr4[2].length()) {
                            String[] strArr1111114 = A02;
                            strArr1111114[6] = "JZSyC5vCBXuabnbyozrLobOBW6DRabKm";
                            strArr1111114[5] = "SUTiquDjBRLooF3seq5WKCluMSkODYPH";
                            return 512;
                        }
                        String[] strArr1111115 = A02;
                        strArr1111115[6] = "4frbtvvdB1MyLLrjo3HhsejHsVGyEKsL";
                        strArr1111115[5] = "ORKdFCu3BJGZr1GMWmsvkKy1b1R8zlrH";
                        return 512;
                    case 10:
                        return 1024;
                    case 11:
                        return 2048;
                    case 12:
                        return 4096;
                    default:
                        return null;
                }
                throw new RuntimeException();
            case 1570:
                if (str.equals(A0N(84, 2, 6))) {
                    b = 12;
                } else {
                    b = -1;
                }
                switch (b) {
                    case 0:
                        strArr = A02;
                        if (strArr[0].length() != strArr[2].length()) {
                            A02[4] = "XQhIYEIiJgH52NRyploGMAGgN5DPAsce";
                            return 1;
                        }
                        break;
                    case 1:
                        if (A02[4].charAt(21) != 'A') {
                            return 2;
                        }
                        String[] strArr1111116 = A02;
                        strArr1111116[0] = "NcQyspmINFMcRuLYZZaVZBrz";
                        strArr1111116[2] = "mM9F";
                        return 2;
                    case 2:
                        return 4;
                    case 3:
                        return 8;
                    case 4:
                        return 16;
                    case 5:
                        return 32;
                    case 6:
                        strArr2 = A02;
                        if (strArr2[6].charAt(8) != strArr2[5].charAt(8)) {
                            return 64;
                        }
                        String[] strArr1111117 = A02;
                        strArr1111117[0] = "UDGIwR651ijO548zFQsUwwxK";
                        strArr1111117[2] = "M6So";
                        return 64;
                    case 7:
                        return 128;
                    case 8:
                        strArr3 = A02;
                        if (strArr3[0].length() != strArr3[2].length()) {
                            throw new RuntimeException();
                        }
                        String[] strArr1111118 = A02;
                        strArr1111118[1] = "TGauph7jBQEYmTr";
                        strArr1111118[3] = "n0Og3rwDrR2czMW";
                        return 256;
                    case 9:
                        strArr4 = A02;
                        if (strArr4[0].length() != strArr4[2].length()) {
                            String[] strArr1111119 = A02;
                            strArr1111119[6] = "JZSyC5vCBXuabnbyozrLobOBW6DRabKm";
                            strArr1111119[5] = "SUTiquDjBRLooF3seq5WKCluMSkODYPH";
                            return 512;
                        }
                        String[] strArr11111110 = A02;
                        strArr11111110[6] = "4frbtvvdB1MyLLrjo3HhsejHsVGyEKsL";
                        strArr11111110[5] = "ORKdFCu3BJGZr1GMWmsvkKy1b1R8zlrH";
                        return 512;
                    case 10:
                        return 1024;
                    case 11:
                        return 2048;
                    case 12:
                        return 4096;
                    default:
                        return null;
                }
                throw new RuntimeException();
            default:
                b = -1;
                switch (b) {
                    case 0:
                        strArr = A02;
                        if (strArr[0].length() != strArr[2].length()) {
                            A02[4] = "XQhIYEIiJgH52NRyploGMAGgN5DPAsce";
                            return 1;
                        }
                        break;
                    case 1:
                        if (A02[4].charAt(21) != 'A') {
                            return 2;
                        }
                        String[] strArr11111111 = A02;
                        strArr11111111[0] = "NcQyspmINFMcRuLYZZaVZBrz";
                        strArr11111111[2] = "mM9F";
                        return 2;
                    case 2:
                        return 4;
                    case 3:
                        return 8;
                    case 4:
                        return 16;
                    case 5:
                        return 32;
                    case 6:
                        strArr2 = A02;
                        if (strArr2[6].charAt(8) != strArr2[5].charAt(8)) {
                            return 64;
                        }
                        String[] strArr11111112 = A02;
                        strArr11111112[0] = "UDGIwR651ijO548zFQsUwwxK";
                        strArr11111112[2] = "M6So";
                        return 64;
                    case 7:
                        return 128;
                    case 8:
                        strArr3 = A02;
                        if (strArr3[0].length() != strArr3[2].length()) {
                            throw new RuntimeException();
                        }
                        String[] strArr11111113 = A02;
                        strArr11111113[1] = "TGauph7jBQEYmTr";
                        strArr11111113[3] = "n0Og3rwDrR2czMW";
                        return 256;
                    case 9:
                        strArr4 = A02;
                        if (strArr4[0].length() != strArr4[2].length()) {
                            String[] strArr11111114 = A02;
                            strArr11111114[6] = "JZSyC5vCBXuabnbyozrLobOBW6DRabKm";
                            strArr11111114[5] = "SUTiquDjBRLooF3seq5WKCluMSkODYPH";
                            return 512;
                        }
                        String[] strArr11111115 = A02;
                        strArr11111115[6] = "4frbtvvdB1MyLLrjo3HhsejHsVGyEKsL";
                        strArr11111115[5] = "ORKdFCu3BJGZr1GMWmsvkKy1b1R8zlrH";
                        return 512;
                    case 10:
                        return 1024;
                    case 11:
                        return 2048;
                    case 12:
                        return 4096;
                    default:
                        return null;
                }
                throw new RuntimeException();
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:7:0x0010  */
    public static Integer A0L(String str) {
        byte b;
        if (str == null) {
            return null;
        }
        switch (str.hashCode()) {
            case 1536:
                if (!str.equals(A0N(57, 2, 5))) {
                    b = -1;
                } else {
                    b = 0;
                }
                break;
            case 1537:
                if (!str.equals(A0N(59, 2, 105))) {
                    b = -1;
                } else {
                    b = 1;
                }
                break;
            case 1538:
                if (!str.equals(A0N(61, 2, 24))) {
                    b = -1;
                } else {
                    b = 2;
                }
                break;
            case 1539:
                if (!str.equals(A0N(63, 2, 111))) {
                    b = -1;
                } else {
                    b = 3;
                }
                break;
            case 1540:
                if (!str.equals(A0N(65, 2, 50))) {
                    b = -1;
                } else {
                    b = 4;
                }
                break;
            case 1541:
                if (!str.equals(A0N(67, 2, 4))) {
                    b = -1;
                } else {
                    b = 5;
                }
                break;
            case 1542:
                if (!str.equals(A0N(69, 2, 80))) {
                    b = -1;
                } else {
                    b = 6;
                }
                break;
            case 1543:
                if (!str.equals(A0N(71, 2, 97))) {
                    b = -1;
                } else {
                    b = 7;
                }
                break;
            case 1544:
                if (!str.equals(A0N(73, 2, 100))) {
                    b = -1;
                } else {
                    b = 8;
                }
                break;
            case 1545:
                if (!str.equals(A0N(75, 2, 38))) {
                    b = -1;
                } else {
                    b = 9;
                }
                break;
            default:
                b = -1;
                break;
        }
        switch (b) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 4;
            case 3:
                String[] strArr = A02;
                if (strArr[6].charAt(8) != strArr[5].charAt(8)) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A02;
                strArr2[6] = "0KPemZPlBkz6ir7aaqTED1Pw3reeXjRU";
                strArr2[5] = "kXrOI8miBty6c848hwuI9lm7Gcuo04IC";
                return 8;
            case 4:
                return 16;
            case 5:
                return 32;
            case 6:
                return 64;
            case 7:
                return 128;
            case 8:
                return 256;
            case 9:
                return 512;
            default:
                return null;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:102:0x026e  */
    /* JADX WARN: Code duplicated, block: B:104:0x0275  */
    /* JADX WARN: Code duplicated, block: B:106:0x027c  */
    /* JADX WARN: Code duplicated, block: B:108:0x0283  */
    /* JADX WARN: Code duplicated, block: B:110:0x028a  */
    /* JADX WARN: Code duplicated, block: B:112:0x0291  */
    /* JADX WARN: Code duplicated, block: B:114:0x0299  */
    /* JADX WARN: Code duplicated, block: B:116:0x02a0  */
    /* JADX WARN: Code duplicated, block: B:118:0x02a7  */
    /* JADX WARN: Code duplicated, block: B:120:0x02ae  */
    /* JADX WARN: Code duplicated, block: B:122:0x02c6  */
    /* JADX WARN: Code duplicated, block: B:124:0x02cc  */
    /* JADX WARN: Code duplicated, block: B:126:0x02d4  */
    /* JADX WARN: Code duplicated, block: B:128:0x02db  */
    /* JADX WARN: Code duplicated, block: B:130:0x02e0  */
    /* JADX WARN: Code duplicated, block: B:132:0x02e5  */
    /* JADX WARN: Code duplicated, block: B:134:0x02ec  */
    /* JADX WARN: Code duplicated, block: B:136:0x02f3  */
    /* JADX WARN: Code duplicated, block: B:138:0x02fa  */
    /* JADX WARN: Code duplicated, block: B:140:0x0301  */
    /* JADX WARN: Code duplicated, block: B:142:0x0308  */
    /* JADX WARN: Code duplicated, block: B:144:0x030f  */
    /* JADX WARN: Code duplicated, block: B:146:0x0316  */
    /* JADX WARN: Code duplicated, block: B:148:0x031d  */
    /* JADX WARN: Code duplicated, block: B:150:0x0324  */
    /* JADX WARN: Code duplicated, block: B:152:0x032b  */
    /* JADX WARN: Code duplicated, block: B:154:0x0330  */
    /* JADX WARN: Code duplicated, block: B:156:0x0335  */
    /* JADX WARN: Code duplicated, block: B:7:0x0012  */
    /* JADX WARN: Code duplicated, block: B:9:0x0016 A[RETURN] */
    public static Integer A0M(String str) {
        byte b;
        String[] strArr;
        if (str == null) {
            return null;
        }
        switch (str.hashCode()) {
            case 70821:
                if (str.equals(A0N(253, 3, 76))) {
                    b = 13;
                } else {
                    b = -1;
                }
                switch (b) {
                    case 0:
                        return 1;
                    case 1:
                        return 4;
                    case 2:
                        return 16;
                    case 3:
                        return 64;
                    case 4:
                        return 256;
                    case 5:
                        return 1024;
                    case 6:
                        return 4096;
                    case 7:
                        return 16384;
                    case 8:
                        return 65536;
                    case 9:
                        return Integer.valueOf(Opcodes.ASM4);
                    case 10:
                        return Integer.valueOf(ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES);
                    case 11:
                        return 4194304;
                    case 12:
                        return 16777216;
                    case 13:
                        return 2;
                    case 14:
                        return 8;
                    case 15:
                        return 32;
                    case 16:
                        strArr = A02;
                        if (strArr[1].length() != strArr[3].length()) {
                            throw new RuntimeException();
                        }
                        A02[4] = "4yKsGogzWqFml28tpN5dAAPmkRirWlaH";
                        return 128;
                    case 17:
                        return 512;
                    case 18:
                        return 2048;
                    case 19:
                        return 8192;
                    case 20:
                        return 32768;
                    case 21:
                        return 131072;
                    case 22:
                        return Integer.valueOf(Opcodes.ASM8);
                    case 23:
                        return 2097152;
                    case 24:
                        return 8388608;
                    case 25:
                        return 33554432;
                    default:
                        return null;
                }
            case 70914:
                if (str.equals(A0N(256, 3, 92))) {
                    b = 14;
                } else {
                    b = -1;
                }
                switch (b) {
                    case 0:
                        return 1;
                    case 1:
                        return 4;
                    case 2:
                        return 16;
                    case 3:
                        return 64;
                    case 4:
                        return 256;
                    case 5:
                        return 1024;
                    case 6:
                        return 4096;
                    case 7:
                        return 16384;
                    case 8:
                        return 65536;
                    case 9:
                        return Integer.valueOf(Opcodes.ASM4);
                    case 10:
                        return Integer.valueOf(ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES);
                    case 11:
                        return 4194304;
                    case 12:
                        return 16777216;
                    case 13:
                        return 2;
                    case 14:
                        return 8;
                    case 15:
                        return 32;
                    case 16:
                        strArr = A02;
                        if (strArr[1].length() != strArr[3].length()) {
                            throw new RuntimeException();
                        }
                        A02[4] = "4yKsGogzWqFml28tpN5dAAPmkRirWlaH";
                        return 128;
                    case 17:
                        return 512;
                    case 18:
                        return 2048;
                    case 19:
                        return 8192;
                    case 20:
                        return 32768;
                    case 21:
                        return 131072;
                    case 22:
                        return Integer.valueOf(Opcodes.ASM8);
                    case 23:
                        return 2097152;
                    case 24:
                        return 8388608;
                    case 25:
                        return 33554432;
                    default:
                        return null;
                }
            case 70917:
                if (str.equals(A0N(259, 3, 54))) {
                    b = 15;
                } else {
                    b = -1;
                }
                switch (b) {
                    case 0:
                        return 1;
                    case 1:
                        return 4;
                    case 2:
                        return 16;
                    case 3:
                        return 64;
                    case 4:
                        return 256;
                    case 5:
                        return 1024;
                    case 6:
                        return 4096;
                    case 7:
                        return 16384;
                    case 8:
                        return 65536;
                    case 9:
                        return Integer.valueOf(Opcodes.ASM4);
                    case 10:
                        return Integer.valueOf(ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES);
                    case 11:
                        return 4194304;
                    case 12:
                        return 16777216;
                    case 13:
                        return 2;
                    case 14:
                        return 8;
                    case 15:
                        return 32;
                    case 16:
                        strArr = A02;
                        if (strArr[1].length() != strArr[3].length()) {
                            throw new RuntimeException();
                        }
                        A02[4] = "4yKsGogzWqFml28tpN5dAAPmkRirWlaH";
                        return 128;
                    case 17:
                        return 512;
                    case 18:
                        return 2048;
                    case 19:
                        return 8192;
                    case 20:
                        return 32768;
                    case 21:
                        return 131072;
                    case 22:
                        return Integer.valueOf(Opcodes.ASM8);
                    case 23:
                        return 2097152;
                    case 24:
                        return 8388608;
                    case 25:
                        return 33554432;
                    default:
                        return null;
                }
            case 71007:
                String strA0N = A0N(262, 3, 29);
                String[] strArr2 = A02;
                if (strArr2[0].length() != strArr2[2].length()) {
                    A02[7] = A5.q;
                    if (str.equals(strA0N)) {
                        b = ExecutionDataWriter.BLOCK_SESSIONINFO;
                    } else {
                        b = -1;
                    }
                    switch (b) {
                        case 0:
                            return 1;
                        case 1:
                            return 4;
                        case 2:
                            return 16;
                        case 3:
                            return 64;
                        case 4:
                            return 256;
                        case 5:
                            return 1024;
                        case 6:
                            return 4096;
                        case 7:
                            return 16384;
                        case 8:
                            return 65536;
                        case 9:
                            return Integer.valueOf(Opcodes.ASM4);
                        case 10:
                            return Integer.valueOf(ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES);
                        case 11:
                            return 4194304;
                        case 12:
                            return 16777216;
                        case 13:
                            return 2;
                        case 14:
                            return 8;
                        case 15:
                            return 32;
                        case 16:
                            strArr = A02;
                            if (strArr[1].length() != strArr[3].length()) {
                                throw new RuntimeException();
                            }
                            A02[4] = "4yKsGogzWqFml28tpN5dAAPmkRirWlaH";
                            return 128;
                        case 17:
                            return 512;
                        case 18:
                            return 2048;
                        case 19:
                            return 8192;
                        case 20:
                            return 32768;
                        case 21:
                            return 131072;
                        case 22:
                            return Integer.valueOf(Opcodes.ASM8);
                        case 23:
                            return 2097152;
                        case 24:
                            return 8388608;
                        case 25:
                            return 33554432;
                        default:
                            return null;
                    }
                }
                throw new RuntimeException();
            case 71010:
                if (str.equals(A0N(265, 3, 78))) {
                    b = ExecutionDataWriter.BLOCK_EXECUTIONDATA;
                } else {
                    b = -1;
                }
                switch (b) {
                    case 0:
                        return 1;
                    case 1:
                        return 4;
                    case 2:
                        return 16;
                    case 3:
                        return 64;
                    case 4:
                        return 256;
                    case 5:
                        return 1024;
                    case 6:
                        return 4096;
                    case 7:
                        return 16384;
                    case 8:
                        return 65536;
                    case 9:
                        return Integer.valueOf(Opcodes.ASM4);
                    case 10:
                        return Integer.valueOf(ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES);
                    case 11:
                        return 4194304;
                    case 12:
                        return 16777216;
                    case 13:
                        return 2;
                    case 14:
                        return 8;
                    case 15:
                        return 32;
                    case 16:
                        strArr = A02;
                        if (strArr[1].length() != strArr[3].length()) {
                            throw new RuntimeException();
                        }
                        A02[4] = "4yKsGogzWqFml28tpN5dAAPmkRirWlaH";
                        return 128;
                    case 17:
                        return 512;
                    case 18:
                        return 2048;
                    case 19:
                        return 8192;
                    case 20:
                        return 32768;
                    case 21:
                        return 131072;
                    case 22:
                        return Integer.valueOf(Opcodes.ASM8);
                    case 23:
                        return 2097152;
                    case 24:
                        return 8388608;
                    case 25:
                        return 33554432;
                    default:
                        return null;
                }
            case 74665:
                if (str.equals(A0N(535, 3, 101))) {
                    b = 0;
                } else {
                    b = -1;
                }
                switch (b) {
                    case 0:
                        return 1;
                    case 1:
                        return 4;
                    case 2:
                        return 16;
                    case 3:
                        return 64;
                    case 4:
                        return 256;
                    case 5:
                        return 1024;
                    case 6:
                        return 4096;
                    case 7:
                        return 16384;
                    case 8:
                        return 65536;
                    case 9:
                        return Integer.valueOf(Opcodes.ASM4);
                    case 10:
                        return Integer.valueOf(ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES);
                    case 11:
                        return 4194304;
                    case 12:
                        return 16777216;
                    case 13:
                        return 2;
                    case 14:
                        return 8;
                    case 15:
                        return 32;
                    case 16:
                        strArr = A02;
                        if (strArr[1].length() != strArr[3].length()) {
                            throw new RuntimeException();
                        }
                        A02[4] = "4yKsGogzWqFml28tpN5dAAPmkRirWlaH";
                        return 128;
                    case 17:
                        return 512;
                    case 18:
                        return 2048;
                    case 19:
                        return 8192;
                    case 20:
                        return 32768;
                    case 21:
                        return 131072;
                    case 22:
                        return Integer.valueOf(Opcodes.ASM8);
                    case 23:
                        return 2097152;
                    case 24:
                        return 8388608;
                    case 25:
                        return 33554432;
                    default:
                        return null;
                }
            case 74758:
                if (str.equals(A0N(542, 3, 69))) {
                    b = 1;
                } else {
                    b = -1;
                }
                switch (b) {
                    case 0:
                        return 1;
                    case 1:
                        return 4;
                    case 2:
                        return 16;
                    case 3:
                        return 64;
                    case 4:
                        return 256;
                    case 5:
                        return 1024;
                    case 6:
                        return 4096;
                    case 7:
                        return 16384;
                    case 8:
                        return 65536;
                    case 9:
                        return Integer.valueOf(Opcodes.ASM4);
                    case 10:
                        return Integer.valueOf(ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES);
                    case 11:
                        return 4194304;
                    case 12:
                        return 16777216;
                    case 13:
                        return 2;
                    case 14:
                        return 8;
                    case 15:
                        return 32;
                    case 16:
                        strArr = A02;
                        if (strArr[1].length() != strArr[3].length()) {
                            throw new RuntimeException();
                        }
                        A02[4] = "4yKsGogzWqFml28tpN5dAAPmkRirWlaH";
                        return 128;
                    case 17:
                        return 512;
                    case 18:
                        return 2048;
                    case 19:
                        return 8192;
                    case 20:
                        return 32768;
                    case 21:
                        return 131072;
                    case 22:
                        return Integer.valueOf(Opcodes.ASM8);
                    case 23:
                        return 2097152;
                    case 24:
                        return 8388608;
                    case 25:
                        return 33554432;
                    default:
                        return null;
                }
            case 74761:
                if (str.equals(A0N(545, 3, 123))) {
                    b = 2;
                } else {
                    b = -1;
                }
                switch (b) {
                    case 0:
                        return 1;
                    case 1:
                        return 4;
                    case 2:
                        return 16;
                    case 3:
                        return 64;
                    case 4:
                        return 256;
                    case 5:
                        return 1024;
                    case 6:
                        return 4096;
                    case 7:
                        return 16384;
                    case 8:
                        return 65536;
                    case 9:
                        return Integer.valueOf(Opcodes.ASM4);
                    case 10:
                        return Integer.valueOf(ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES);
                    case 11:
                        return 4194304;
                    case 12:
                        return 16777216;
                    case 13:
                        return 2;
                    case 14:
                        return 8;
                    case 15:
                        return 32;
                    case 16:
                        strArr = A02;
                        if (strArr[1].length() != strArr[3].length()) {
                            throw new RuntimeException();
                        }
                        A02[4] = "4yKsGogzWqFml28tpN5dAAPmkRirWlaH";
                        return 128;
                    case 17:
                        return 512;
                    case 18:
                        return 2048;
                    case 19:
                        return 8192;
                    case 20:
                        return 32768;
                    case 21:
                        return 131072;
                    case 22:
                        return Integer.valueOf(Opcodes.ASM8);
                    case 23:
                        return 2097152;
                    case 24:
                        return 8388608;
                    case 25:
                        return 33554432;
                    default:
                        return null;
                }
            case 74851:
                if (str.equals(A0N(548, 3, 71))) {
                    b = 3;
                } else {
                    b = -1;
                }
                switch (b) {
                    case 0:
                        return 1;
                    case 1:
                        return 4;
                    case 2:
                        return 16;
                    case 3:
                        return 64;
                    case 4:
                        return 256;
                    case 5:
                        return 1024;
                    case 6:
                        return 4096;
                    case 7:
                        return 16384;
                    case 8:
                        return 65536;
                    case 9:
                        return Integer.valueOf(Opcodes.ASM4);
                    case 10:
                        return Integer.valueOf(ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES);
                    case 11:
                        return 4194304;
                    case 12:
                        return 16777216;
                    case 13:
                        return 2;
                    case 14:
                        return 8;
                    case 15:
                        return 32;
                    case 16:
                        strArr = A02;
                        if (strArr[1].length() != strArr[3].length()) {
                            throw new RuntimeException();
                        }
                        A02[4] = "4yKsGogzWqFml28tpN5dAAPmkRirWlaH";
                        return 128;
                    case 17:
                        return 512;
                    case 18:
                        return 2048;
                    case 19:
                        return 8192;
                    case 20:
                        return 32768;
                    case 21:
                        return 131072;
                    case 22:
                        return Integer.valueOf(Opcodes.ASM8);
                    case 23:
                        return 2097152;
                    case 24:
                        return 8388608;
                    case 25:
                        return 33554432;
                    default:
                        return null;
                }
            case 74854:
                if (str.equals(A0N(551, 3, 48))) {
                    b = 4;
                } else {
                    b = -1;
                }
                switch (b) {
                    case 0:
                        return 1;
                    case 1:
                        return 4;
                    case 2:
                        return 16;
                    case 3:
                        return 64;
                    case 4:
                        return 256;
                    case 5:
                        return 1024;
                    case 6:
                        return 4096;
                    case 7:
                        return 16384;
                    case 8:
                        return 65536;
                    case 9:
                        return Integer.valueOf(Opcodes.ASM4);
                    case 10:
                        return Integer.valueOf(ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES);
                    case 11:
                        return 4194304;
                    case 12:
                        return 16777216;
                    case 13:
                        return 2;
                    case 14:
                        return 8;
                    case 15:
                        return 32;
                    case 16:
                        strArr = A02;
                        if (strArr[1].length() != strArr[3].length()) {
                            throw new RuntimeException();
                        }
                        A02[4] = "4yKsGogzWqFml28tpN5dAAPmkRirWlaH";
                        return 128;
                    case 17:
                        return 512;
                    case 18:
                        return 2048;
                    case 19:
                        return 8192;
                    case 20:
                        return 32768;
                    case 21:
                        return 131072;
                    case 22:
                        return Integer.valueOf(Opcodes.ASM8);
                    case 23:
                        return 2097152;
                    case 24:
                        return 8388608;
                    case 25:
                        return 33554432;
                    default:
                        return null;
                }
            case 2193639:
                if (str.equals(A0N(Sdk$SDKError.Reason.AD_LOAD_FAIL_RETRY_AFTER_VALUE, 4, 108))) {
                    b = 18;
                } else {
                    b = -1;
                }
                switch (b) {
                    case 0:
                        return 1;
                    case 1:
                        return 4;
                    case 2:
                        return 16;
                    case 3:
                        return 64;
                    case 4:
                        return 256;
                    case 5:
                        return 1024;
                    case 6:
                        return 4096;
                    case 7:
                        return 16384;
                    case 8:
                        return 65536;
                    case 9:
                        return Integer.valueOf(Opcodes.ASM4);
                    case 10:
                        return Integer.valueOf(ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES);
                    case 11:
                        return 4194304;
                    case 12:
                        return 16777216;
                    case 13:
                        return 2;
                    case 14:
                        return 8;
                    case 15:
                        return 32;
                    case 16:
                        strArr = A02;
                        if (strArr[1].length() != strArr[3].length()) {
                            throw new RuntimeException();
                        }
                        A02[4] = "4yKsGogzWqFml28tpN5dAAPmkRirWlaH";
                        return 128;
                    case 17:
                        return 512;
                    case 18:
                        return 2048;
                    case 19:
                        return 8192;
                    case 20:
                        return 32768;
                    case 21:
                        return 131072;
                    case 22:
                        return Integer.valueOf(Opcodes.ASM8);
                    case 23:
                        return 2097152;
                    case 24:
                        return 8388608;
                    case 25:
                        return 33554432;
                    default:
                        return null;
                }
            case 2193642:
                if (str.equals(A0N(Sdk$SDKError.Reason.AD_LOAD_FAIL_PLACEMENT_ID_MISMATCH_VALUE, 4, 18))) {
                    b = 19;
                } else {
                    b = -1;
                }
                switch (b) {
                    case 0:
                        return 1;
                    case 1:
                        return 4;
                    case 2:
                        return 16;
                    case 3:
                        return 64;
                    case 4:
                        return 256;
                    case 5:
                        return 1024;
                    case 6:
                        return 4096;
                    case 7:
                        return 16384;
                    case 8:
                        return 65536;
                    case 9:
                        return Integer.valueOf(Opcodes.ASM4);
                    case 10:
                        return Integer.valueOf(ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES);
                    case 11:
                        return 4194304;
                    case 12:
                        return 16777216;
                    case 13:
                        return 2;
                    case 14:
                        return 8;
                    case 15:
                        return 32;
                    case 16:
                        strArr = A02;
                        if (strArr[1].length() != strArr[3].length()) {
                            throw new RuntimeException();
                        }
                        A02[4] = "4yKsGogzWqFml28tpN5dAAPmkRirWlaH";
                        return 128;
                    case 17:
                        return 512;
                    case 18:
                        return 2048;
                    case 19:
                        return 8192;
                    case 20:
                        return 32768;
                    case 21:
                        return 131072;
                    case 22:
                        return Integer.valueOf(Opcodes.ASM8);
                    case 23:
                        return 2097152;
                    case 24:
                        return 8388608;
                    case 25:
                        return 33554432;
                    default:
                        return null;
                }
            case 2193732:
                if (str.equals(A0N(229, 4, 103))) {
                    b = 20;
                } else {
                    b = -1;
                }
                switch (b) {
                    case 0:
                        return 1;
                    case 1:
                        return 4;
                    case 2:
                        return 16;
                    case 3:
                        return 64;
                    case 4:
                        return 256;
                    case 5:
                        return 1024;
                    case 6:
                        return 4096;
                    case 7:
                        return 16384;
                    case 8:
                        return 65536;
                    case 9:
                        return Integer.valueOf(Opcodes.ASM4);
                    case 10:
                        return Integer.valueOf(ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES);
                    case 11:
                        return 4194304;
                    case 12:
                        return 16777216;
                    case 13:
                        return 2;
                    case 14:
                        return 8;
                    case 15:
                        return 32;
                    case 16:
                        strArr = A02;
                        if (strArr[1].length() != strArr[3].length()) {
                            throw new RuntimeException();
                        }
                        A02[4] = "4yKsGogzWqFml28tpN5dAAPmkRirWlaH";
                        return 128;
                    case 17:
                        return 512;
                    case 18:
                        return 2048;
                    case 19:
                        return 8192;
                    case 20:
                        return 32768;
                    case 21:
                        return 131072;
                    case 22:
                        return Integer.valueOf(Opcodes.ASM8);
                    case 23:
                        return 2097152;
                    case 24:
                        return 8388608;
                    case 25:
                        return 33554432;
                    default:
                        return null;
                }
            case 2193735:
                if (str.equals(A0N(233, 4, 52))) {
                    b = 21;
                } else {
                    b = -1;
                }
                switch (b) {
                    case 0:
                        return 1;
                    case 1:
                        return 4;
                    case 2:
                        return 16;
                    case 3:
                        return 64;
                    case 4:
                        return 256;
                    case 5:
                        return 1024;
                    case 6:
                        return 4096;
                    case 7:
                        return 16384;
                    case 8:
                        return 65536;
                    case 9:
                        return Integer.valueOf(Opcodes.ASM4);
                    case 10:
                        return Integer.valueOf(ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES);
                    case 11:
                        return 4194304;
                    case 12:
                        return 16777216;
                    case 13:
                        return 2;
                    case 14:
                        return 8;
                    case 15:
                        return 32;
                    case 16:
                        strArr = A02;
                        if (strArr[1].length() != strArr[3].length()) {
                            throw new RuntimeException();
                        }
                        A02[4] = "4yKsGogzWqFml28tpN5dAAPmkRirWlaH";
                        return 128;
                    case 17:
                        return 512;
                    case 18:
                        return 2048;
                    case 19:
                        return 8192;
                    case 20:
                        return 32768;
                    case 21:
                        return 131072;
                    case 22:
                        return Integer.valueOf(Opcodes.ASM8);
                    case 23:
                        return 2097152;
                    case 24:
                        return 8388608;
                    case 25:
                        return 33554432;
                    default:
                        return null;
                }
            case 2193738:
                if (A02[4].charAt(21) != 'A') {
                    throw new RuntimeException();
                }
                String[] strArr3 = A02;
                strArr3[0] = "gU6PtQLn9s6J6gQuv9ZEK0nw";
                strArr3[2] = "GdK9";
                if (str.equals(A0N(237, 4, 113))) {
                    b = 22;
                } else {
                    b = -1;
                }
                switch (b) {
                    case 0:
                        return 1;
                    case 1:
                        return 4;
                    case 2:
                        return 16;
                    case 3:
                        return 64;
                    case 4:
                        return 256;
                    case 5:
                        return 1024;
                    case 6:
                        return 4096;
                    case 7:
                        return 16384;
                    case 8:
                        return 65536;
                    case 9:
                        return Integer.valueOf(Opcodes.ASM4);
                    case 10:
                        return Integer.valueOf(ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES);
                    case 11:
                        return 4194304;
                    case 12:
                        return 16777216;
                    case 13:
                        return 2;
                    case 14:
                        return 8;
                    case 15:
                        return 32;
                    case 16:
                        strArr = A02;
                        if (strArr[1].length() != strArr[3].length()) {
                            throw new RuntimeException();
                        }
                        A02[4] = "4yKsGogzWqFml28tpN5dAAPmkRirWlaH";
                        return 128;
                    case 17:
                        return 512;
                    case 18:
                        return 2048;
                    case 19:
                        return 8192;
                    case 20:
                        return 32768;
                    case 21:
                        return 131072;
                    case 22:
                        return Integer.valueOf(Opcodes.ASM8);
                    case 23:
                        return 2097152;
                    case 24:
                        return 8388608;
                    case 25:
                        return 33554432;
                    default:
                        return null;
                }
            case 2193825:
                if (str.equals(A0N(241, 4, 93))) {
                    b = 23;
                } else {
                    b = -1;
                }
                switch (b) {
                    case 0:
                        return 1;
                    case 1:
                        return 4;
                    case 2:
                        return 16;
                    case 3:
                        return 64;
                    case 4:
                        return 256;
                    case 5:
                        return 1024;
                    case 6:
                        return 4096;
                    case 7:
                        return 16384;
                    case 8:
                        return 65536;
                    case 9:
                        return Integer.valueOf(Opcodes.ASM4);
                    case 10:
                        return Integer.valueOf(ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES);
                    case 11:
                        return 4194304;
                    case 12:
                        return 16777216;
                    case 13:
                        return 2;
                    case 14:
                        return 8;
                    case 15:
                        return 32;
                    case 16:
                        strArr = A02;
                        if (strArr[1].length() != strArr[3].length()) {
                            throw new RuntimeException();
                        }
                        A02[4] = "4yKsGogzWqFml28tpN5dAAPmkRirWlaH";
                        return 128;
                    case 17:
                        return 512;
                    case 18:
                        return 2048;
                    case 19:
                        return 8192;
                    case 20:
                        return 32768;
                    case 21:
                        return 131072;
                    case 22:
                        return Integer.valueOf(Opcodes.ASM8);
                    case 23:
                        return 2097152;
                    case 24:
                        return 8388608;
                    case 25:
                        return 33554432;
                    default:
                        return null;
                }
            case 2193828:
                if (str.equals(A0N(245, 4, 3))) {
                    b = 24;
                } else {
                    b = -1;
                }
                switch (b) {
                    case 0:
                        return 1;
                    case 1:
                        return 4;
                    case 2:
                        return 16;
                    case 3:
                        return 64;
                    case 4:
                        return 256;
                    case 5:
                        return 1024;
                    case 6:
                        return 4096;
                    case 7:
                        return 16384;
                    case 8:
                        return 65536;
                    case 9:
                        return Integer.valueOf(Opcodes.ASM4);
                    case 10:
                        return Integer.valueOf(ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES);
                    case 11:
                        return 4194304;
                    case 12:
                        return 16777216;
                    case 13:
                        return 2;
                    case 14:
                        return 8;
                    case 15:
                        return 32;
                    case 16:
                        strArr = A02;
                        if (strArr[1].length() != strArr[3].length()) {
                            throw new RuntimeException();
                        }
                        A02[4] = "4yKsGogzWqFml28tpN5dAAPmkRirWlaH";
                        return 128;
                    case 17:
                        return 512;
                    case 18:
                        return 2048;
                    case 19:
                        return 8192;
                    case 20:
                        return 32768;
                    case 21:
                        return 131072;
                    case 22:
                        return Integer.valueOf(Opcodes.ASM8);
                    case 23:
                        return 2097152;
                    case 24:
                        return 8388608;
                    case 25:
                        return 33554432;
                    default:
                        return null;
                }
            case 2193831:
                if (str.equals(A0N(249, 4, 43))) {
                    b = 25;
                } else {
                    b = -1;
                }
                switch (b) {
                    case 0:
                        return 1;
                    case 1:
                        return 4;
                    case 2:
                        return 16;
                    case 3:
                        return 64;
                    case 4:
                        return 256;
                    case 5:
                        return 1024;
                    case 6:
                        return 4096;
                    case 7:
                        return 16384;
                    case 8:
                        return 65536;
                    case 9:
                        return Integer.valueOf(Opcodes.ASM4);
                    case 10:
                        return Integer.valueOf(ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES);
                    case 11:
                        return 4194304;
                    case 12:
                        return 16777216;
                    case 13:
                        return 2;
                    case 14:
                        return 8;
                    case 15:
                        return 32;
                    case 16:
                        strArr = A02;
                        if (strArr[1].length() != strArr[3].length()) {
                            throw new RuntimeException();
                        }
                        A02[4] = "4yKsGogzWqFml28tpN5dAAPmkRirWlaH";
                        return 128;
                    case 17:
                        return 512;
                    case 18:
                        return 2048;
                    case 19:
                        return 8192;
                    case 20:
                        return 32768;
                    case 21:
                        return 131072;
                    case 22:
                        return Integer.valueOf(Opcodes.ASM8);
                    case 23:
                        return 2097152;
                    case 24:
                        return 8388608;
                    case 25:
                        return 33554432;
                    default:
                        return null;
                }
            case 2312803:
                String[] strArr4 = A02;
                if (strArr4[1].length() != strArr4[3].length()) {
                    throw new RuntimeException();
                }
                A02[7] = "nulQl7CSoY";
                if (str.equals(A0N(PglCryptUtils.COMPRESS_FAILED, 4, 55))) {
                    b = 5;
                } else {
                    b = -1;
                }
                switch (b) {
                    case 0:
                        return 1;
                    case 1:
                        return 4;
                    case 2:
                        return 16;
                    case 3:
                        return 64;
                    case 4:
                        return 256;
                    case 5:
                        return 1024;
                    case 6:
                        return 4096;
                    case 7:
                        return 16384;
                    case 8:
                        return 65536;
                    case 9:
                        return Integer.valueOf(Opcodes.ASM4);
                    case 10:
                        return Integer.valueOf(ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES);
                    case 11:
                        return 4194304;
                    case 12:
                        return 16777216;
                    case 13:
                        return 2;
                    case 14:
                        return 8;
                    case 15:
                        return 32;
                    case 16:
                        strArr = A02;
                        if (strArr[1].length() != strArr[3].length()) {
                            throw new RuntimeException();
                        }
                        A02[4] = "4yKsGogzWqFml28tpN5dAAPmkRirWlaH";
                        return 128;
                    case 17:
                        return 512;
                    case 18:
                        return 2048;
                    case 19:
                        return 8192;
                    case 20:
                        return 32768;
                    case 21:
                        return 131072;
                    case 22:
                        return Integer.valueOf(Opcodes.ASM8);
                    case 23:
                        return 2097152;
                    case 24:
                        return 8388608;
                    case 25:
                        return 33554432;
                    default:
                        return null;
                }
            case 2312806:
                if (str.equals(A0N(PglCryptUtils.UNKNOWN_ERR, 4, 114))) {
                    b = 6;
                } else {
                    b = -1;
                }
                switch (b) {
                    case 0:
                        return 1;
                    case 1:
                        return 4;
                    case 2:
                        return 16;
                    case 3:
                        return 64;
                    case 4:
                        return 256;
                    case 5:
                        return 1024;
                    case 6:
                        return 4096;
                    case 7:
                        return 16384;
                    case 8:
                        return 65536;
                    case 9:
                        return Integer.valueOf(Opcodes.ASM4);
                    case 10:
                        return Integer.valueOf(ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES);
                    case 11:
                        return 4194304;
                    case 12:
                        return 16777216;
                    case 13:
                        return 2;
                    case 14:
                        return 8;
                    case 15:
                        return 32;
                    case 16:
                        strArr = A02;
                        if (strArr[1].length() != strArr[3].length()) {
                            throw new RuntimeException();
                        }
                        A02[4] = "4yKsGogzWqFml28tpN5dAAPmkRirWlaH";
                        return 128;
                    case 17:
                        return 512;
                    case 18:
                        return 2048;
                    case 19:
                        return 8192;
                    case 20:
                        return 32768;
                    case 21:
                        return 131072;
                    case 22:
                        return Integer.valueOf(Opcodes.ASM8);
                    case 23:
                        return 2097152;
                    case 24:
                        return 8388608;
                    case 25:
                        return 33554432;
                    default:
                        return null;
                }
            case 2312896:
                if (str.equals(A0N(511, 4, 102))) {
                    b = 7;
                } else {
                    b = -1;
                }
                switch (b) {
                    case 0:
                        return 1;
                    case 1:
                        return 4;
                    case 2:
                        return 16;
                    case 3:
                        return 64;
                    case 4:
                        return 256;
                    case 5:
                        return 1024;
                    case 6:
                        return 4096;
                    case 7:
                        return 16384;
                    case 8:
                        return 65536;
                    case 9:
                        return Integer.valueOf(Opcodes.ASM4);
                    case 10:
                        return Integer.valueOf(ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES);
                    case 11:
                        return 4194304;
                    case 12:
                        return 16777216;
                    case 13:
                        return 2;
                    case 14:
                        return 8;
                    case 15:
                        return 32;
                    case 16:
                        strArr = A02;
                        if (strArr[1].length() != strArr[3].length()) {
                            throw new RuntimeException();
                        }
                        A02[4] = "4yKsGogzWqFml28tpN5dAAPmkRirWlaH";
                        return 128;
                    case 17:
                        return 512;
                    case 18:
                        return 2048;
                    case 19:
                        return 8192;
                    case 20:
                        return 32768;
                    case 21:
                        return 131072;
                    case 22:
                        return Integer.valueOf(Opcodes.ASM8);
                    case 23:
                        return 2097152;
                    case 24:
                        return 8388608;
                    case 25:
                        return 33554432;
                    default:
                        return null;
                }
            case 2312899:
                if (str.equals(A0N(515, 4, 104))) {
                    b = 8;
                } else {
                    b = -1;
                }
                switch (b) {
                    case 0:
                        return 1;
                    case 1:
                        return 4;
                    case 2:
                        return 16;
                    case 3:
                        return 64;
                    case 4:
                        return 256;
                    case 5:
                        return 1024;
                    case 6:
                        return 4096;
                    case 7:
                        return 16384;
                    case 8:
                        return 65536;
                    case 9:
                        return Integer.valueOf(Opcodes.ASM4);
                    case 10:
                        return Integer.valueOf(ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES);
                    case 11:
                        return 4194304;
                    case 12:
                        return 16777216;
                    case 13:
                        return 2;
                    case 14:
                        return 8;
                    case 15:
                        return 32;
                    case 16:
                        strArr = A02;
                        if (strArr[1].length() != strArr[3].length()) {
                            throw new RuntimeException();
                        }
                        A02[4] = "4yKsGogzWqFml28tpN5dAAPmkRirWlaH";
                        return 128;
                    case 17:
                        return 512;
                    case 18:
                        return 2048;
                    case 19:
                        return 8192;
                    case 20:
                        return 32768;
                    case 21:
                        return 131072;
                    case 22:
                        return Integer.valueOf(Opcodes.ASM8);
                    case 23:
                        return 2097152;
                    case 24:
                        return 8388608;
                    case 25:
                        return 33554432;
                    default:
                        return null;
                }
            case 2312902:
                boolean zEquals = str.equals(A0N(519, 4, 43));
                String[] strArr5 = A02;
                if (strArr5[1].length() == strArr5[3].length()) {
                    A02[4] = "crD2koPf8HiM7FLITwbLUAokMU0ofExW";
                    if (zEquals) {
                        b = 9;
                    } else {
                        b = -1;
                    }
                    switch (b) {
                        case 0:
                            return 1;
                        case 1:
                            return 4;
                        case 2:
                            return 16;
                        case 3:
                            return 64;
                        case 4:
                            return 256;
                        case 5:
                            return 1024;
                        case 6:
                            return 4096;
                        case 7:
                            return 16384;
                        case 8:
                            return 65536;
                        case 9:
                            return Integer.valueOf(Opcodes.ASM4);
                        case 10:
                            return Integer.valueOf(ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES);
                        case 11:
                            return 4194304;
                        case 12:
                            return 16777216;
                        case 13:
                            return 2;
                        case 14:
                            return 8;
                        case 15:
                            return 32;
                        case 16:
                            strArr = A02;
                            if (strArr[1].length() != strArr[3].length()) {
                                throw new RuntimeException();
                            }
                            A02[4] = "4yKsGogzWqFml28tpN5dAAPmkRirWlaH";
                            return 128;
                        case 17:
                            return 512;
                        case 18:
                            return 2048;
                        case 19:
                            return 8192;
                        case 20:
                            return 32768;
                        case 21:
                            return 131072;
                        case 22:
                            return Integer.valueOf(Opcodes.ASM8);
                        case 23:
                            return 2097152;
                        case 24:
                            return 8388608;
                        case 25:
                            return 33554432;
                        default:
                            return null;
                    }
                }
                throw new RuntimeException();
            case 2312989:
                if (str.equals(A0N(523, 4, 75))) {
                    b = 10;
                } else {
                    b = -1;
                }
                switch (b) {
                    case 0:
                        return 1;
                    case 1:
                        return 4;
                    case 2:
                        return 16;
                    case 3:
                        return 64;
                    case 4:
                        return 256;
                    case 5:
                        return 1024;
                    case 6:
                        return 4096;
                    case 7:
                        return 16384;
                    case 8:
                        return 65536;
                    case 9:
                        return Integer.valueOf(Opcodes.ASM4);
                    case 10:
                        return Integer.valueOf(ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES);
                    case 11:
                        return 4194304;
                    case 12:
                        return 16777216;
                    case 13:
                        return 2;
                    case 14:
                        return 8;
                    case 15:
                        return 32;
                    case 16:
                        strArr = A02;
                        if (strArr[1].length() != strArr[3].length()) {
                            throw new RuntimeException();
                        }
                        A02[4] = "4yKsGogzWqFml28tpN5dAAPmkRirWlaH";
                        return 128;
                    case 17:
                        return 512;
                    case 18:
                        return 2048;
                    case 19:
                        return 8192;
                    case 20:
                        return 32768;
                    case 21:
                        return 131072;
                    case 22:
                        return Integer.valueOf(Opcodes.ASM8);
                    case 23:
                        return 2097152;
                    case 24:
                        return 8388608;
                    case 25:
                        return 33554432;
                    default:
                        return null;
                }
            case 2312992:
                if (str.equals(A0N(IronSourceError.ERROR_NON_EXISTENT_INSTANCE, 4, 103))) {
                    b = 11;
                } else {
                    b = -1;
                }
                switch (b) {
                    case 0:
                        return 1;
                    case 1:
                        return 4;
                    case 2:
                        return 16;
                    case 3:
                        return 64;
                    case 4:
                        return 256;
                    case 5:
                        return 1024;
                    case 6:
                        return 4096;
                    case 7:
                        return 16384;
                    case 8:
                        return 65536;
                    case 9:
                        return Integer.valueOf(Opcodes.ASM4);
                    case 10:
                        return Integer.valueOf(ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES);
                    case 11:
                        return 4194304;
                    case 12:
                        return 16777216;
                    case 13:
                        return 2;
                    case 14:
                        return 8;
                    case 15:
                        return 32;
                    case 16:
                        strArr = A02;
                        if (strArr[1].length() != strArr[3].length()) {
                            throw new RuntimeException();
                        }
                        A02[4] = "4yKsGogzWqFml28tpN5dAAPmkRirWlaH";
                        return 128;
                    case 17:
                        return 512;
                    case 18:
                        return 2048;
                    case 19:
                        return 8192;
                    case 20:
                        return 32768;
                    case 21:
                        return 131072;
                    case 22:
                        return Integer.valueOf(Opcodes.ASM8);
                    case 23:
                        return 2097152;
                    case 24:
                        return 8388608;
                    case 25:
                        return 33554432;
                    default:
                        return null;
                }
            case 2312995:
                if (str.equals(A0N(531, 4, 19))) {
                    b = 12;
                } else {
                    b = -1;
                }
                switch (b) {
                    case 0:
                        return 1;
                    case 1:
                        return 4;
                    case 2:
                        return 16;
                    case 3:
                        return 64;
                    case 4:
                        return 256;
                    case 5:
                        return 1024;
                    case 6:
                        return 4096;
                    case 7:
                        return 16384;
                    case 8:
                        return 65536;
                    case 9:
                        return Integer.valueOf(Opcodes.ASM4);
                    case 10:
                        return Integer.valueOf(ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES);
                    case 11:
                        return 4194304;
                    case 12:
                        return 16777216;
                    case 13:
                        return 2;
                    case 14:
                        return 8;
                    case 15:
                        return 32;
                    case 16:
                        strArr = A02;
                        if (strArr[1].length() != strArr[3].length()) {
                            throw new RuntimeException();
                        }
                        A02[4] = "4yKsGogzWqFml28tpN5dAAPmkRirWlaH";
                        return 128;
                    case 17:
                        return 512;
                    case 18:
                        return 2048;
                    case 19:
                        return 8192;
                    case 20:
                        return 32768;
                    case 21:
                        return 131072;
                    case 22:
                        return Integer.valueOf(Opcodes.ASM8);
                    case 23:
                        return 2097152;
                    case 24:
                        return 8388608;
                    case 25:
                        return 33554432;
                    default:
                        return null;
                }
            default:
                b = -1;
                switch (b) {
                    case 0:
                        return 1;
                    case 1:
                        return 4;
                    case 2:
                        return 16;
                    case 3:
                        return 64;
                    case 4:
                        return 256;
                    case 5:
                        return 1024;
                    case 6:
                        return 4096;
                    case 7:
                        return 16384;
                    case 8:
                        return 65536;
                    case 9:
                        return Integer.valueOf(Opcodes.ASM4);
                    case 10:
                        return Integer.valueOf(ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES);
                    case 11:
                        return 4194304;
                    case 12:
                        return 16777216;
                    case 13:
                        return 2;
                    case 14:
                        return 8;
                    case 15:
                        return 32;
                    case 16:
                        strArr = A02;
                        if (strArr[1].length() != strArr[3].length()) {
                            throw new RuntimeException();
                        }
                        A02[4] = "4yKsGogzWqFml28tpN5dAAPmkRirWlaH";
                        return 128;
                    case 17:
                        return 512;
                    case 18:
                        return 2048;
                    case 19:
                        return 8192;
                    case 20:
                        return 32768;
                    case 21:
                        return 131072;
                    case 22:
                        return Integer.valueOf(Opcodes.ASM8);
                    case 23:
                        return 2097152;
                    case 24:
                        return 8388608;
                    case 25:
                        return 33554432;
                    default:
                        return null;
                }
        }
    }

    public static String A0O(MediaCodecInfo mediaCodecInfo, String str, String str2) {
        for (String str3 : mediaCodecInfo.getSupportedTypes()) {
            if (str3.equalsIgnoreCase(str2)) {
                return str3;
            }
        }
        if (str2.equals(A0N(1765, 18, 26))) {
            if (A0N(651, 21, 124).equals(str)) {
                return A0N(1806, 12, 59);
            }
            String[] strArr = A02;
            if (strArr[1].length() == strArr[3].length()) {
                String[] strArr2 = A02;
                strArr2[0] = "SNR7DEuQkTqundc8fpfLWSSq";
                strArr2[2] = "Am34";
                if (A0N(UnityAdsConstants.AdOperations.GET_TOKEN_TIMEOUT_MS, 21, 62).equals(str) || A0N(IronSourceError.ERROR_DO_RV_LOAD_DURING_SHOW, 34, 59).equals(str)) {
                    return A0N(1783, 13, 48);
                }
                return null;
            }
        } else {
            if (str2.equals(A0N(1435, 10, 108)) && A0N(912, 20, 92).equals(str)) {
                return A0N(1515, 15, 100);
            }
            String[] strArr3 = A02;
            if (strArr3[1].length() == strArr3[3].length()) {
                String[] strArr4 = A02;
                strArr4[0] = "F6UQuKTk39X0DFpi3syODLNA";
                strArr4[2] = "oGjK";
                if (str2.equals(A0N(1469, 10, 50)) && A0N(932, 20, 50).equals(str)) {
                    return A0N(1530, 15, 109);
                }
                if (str2.equals(A0N(1426, 9, 12)) && A0N(893, 19, 80).equals(str)) {
                    return A0N(1479, 12, 10);
                }
                return null;
            }
        }
        throw new RuntimeException();
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0090  */
    /* JADX WARN: Code duplicated, block: B:26:0x00a3  */
    public static String A0P(C2691qI c2691qI) {
        String[] strArr;
        Pair<Integer, Integer> codecProfileAndLevel;
        if (A0N(1455, 14, 98).equals(c2691qI.A0W)) {
            String strA0N = A0N(1445, 10, 6);
            if (A02[7].length() != 25) {
                String[] strArr2 = A02;
                strArr2[6] = "ZfndW6AJBdBNuLe7GaNBaOlzT6fPhO3e";
                strArr2[5] = "cwvehiRLBehKtkGil8NX01GWyhG4bC3G";
                return strA0N;
            }
        } else if (!A0N(1765, 18, 26).equals(c2691qI.A0W) || (codecProfileAndLevel = A0B(c2691qI)) == null) {
            strArr = A02;
            if (strArr[0].length() != strArr[2].length()) {
                String[] strArr3 = A02;
                strArr3[6] = "fWQmLDMHB8f7NLxxt23iYDut8JSJcJup";
                strArr3[5] = "lo0RJuE4BwIH2JQYtOHz0H7ocrHx9GAy";
                return null;
            }
        } else {
            int profile = ((Integer) codecProfileAndLevel.first).intValue();
            if (profile == 16 || profile == 256) {
                return A0N(1796, 10, 24);
            }
            if (profile == 512) {
                String[] strArr4 = A02;
                if (strArr4[0].length() != strArr4[2].length()) {
                    A02[7] = "uUyr2eIguxRStOoGPtni7X3Qg6do19s";
                    return A0N(1756, 9, 19);
                }
            } else {
                strArr = A02;
                if (strArr[0].length() != strArr[2].length()) {
                    String[] strArr5 = A02;
                    strArr5[6] = "fWQmLDMHB8f7NLxxt23iYDut8JSJcJup";
                    strArr5[5] = "lo0RJuE4BwIH2JQYtOHz0H7ocrHx9GAy";
                    return null;
                }
            }
        }
        throw new RuntimeException();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.BP != com.google.common.collect.ImmutableList<com.facebook.ads.androidx.media3.exoplayer.mediacodec.MediaCodecInfo> */
    public static synchronized List<B3> A0R(String str, boolean z, boolean z2) throws BX {
        BY c2558o8;
        BW bw = new BW(str, z, z2);
        List<B3> list = A03.get(bw);
        if (list != null) {
            return list;
        }
        if (C5C.A02 >= 21) {
            c2558o8 = new C2557o7(z, z2);
        } else {
            c2558o8 = new C2558o8();
        }
        ArrayList<B3> arrayListA0Q = A0Q(bw, c2558o8);
        if (z && arrayListA0Q.isEmpty() && 21 <= C5C.A02 && C5C.A02 <= 23) {
            arrayListA0Q = A0Q(bw, new C2558o8());
            if (!arrayListA0Q.isEmpty()) {
                AbstractC09234g.A07(A0N(IronSourceError.ERROR_BN_LOAD_NO_CONFIG, 14, 80), A0N(564, 51, 61) + str + A0N(34, 12, 86) + arrayListA0Q.get(0).A03);
            }
        }
        A0T(str, arrayListA0Q);
        BP bpA05 = BP.A05(arrayListA0Q);
        A03.put(bw, bpA05);
        return bpA05;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x00dd  */
    public static void A0T(String str, List<B3> list) {
        if (A0N(1506, 9, 92).equals(str)) {
            if (C5C.A02 < 26 && C5C.A03.equals(A0N(1090, 2, 81))) {
                int size = list.size();
                String[] strArr = A02;
                if (strArr[1].length() != strArr[3].length()) {
                    throw new RuntimeException();
                }
                A02[7] = "javvHYyhFf0KGd1kb";
                if (size == 1 && list.get(0).A03.equals(A0N(725, 25, 44))) {
                    list.add(B3.A02(A0N(871, 22, 78), A0N(1506, 9, 92), A0N(1506, 9, 92), null, false, true, false, false, false));
                }
            }
            A0U(list, new BZ() { // from class: com.facebook.ads.redexgen.X.oA
                @Override // com.facebook.ads.redexgen.core.BZ
                public final int A8w(Object obj) {
                    return C1083Ba.A08((B3) obj);
                }
            });
        }
        if (C5C.A02 < 21 && list.size() > 1) {
            String str2 = list.get(0).A03;
            String firstCodecName = A0N(805, 15, 82);
            if (!firstCodecName.equals(str2)) {
                String firstCodecName2 = A0N(771, 19, 37);
                if (!firstCodecName2.equals(str2)) {
                    String firstCodecName3 = A0N(835, 26, 45);
                    if (firstCodecName3.equals(str2)) {
                        A0U(list, new BZ() { // from class: com.facebook.ads.redexgen.X.o9
                            @Override // com.facebook.ads.redexgen.core.BZ
                            public final int A8w(Object obj) {
                                return C1083Ba.A09((B3) obj);
                            }
                        });
                    }
                } else {
                    A0U(list, new BZ() { // from class: com.facebook.ads.redexgen.X.o9
                        @Override // com.facebook.ads.redexgen.core.BZ
                        public final int A8w(Object obj) {
                            return C1083Ba.A09((B3) obj);
                        }
                    });
                }
            } else {
                A0U(list, new BZ() { // from class: com.facebook.ads.redexgen.X.o9
                    @Override // com.facebook.ads.redexgen.core.BZ
                    public final int A8w(Object obj) {
                        return C1083Ba.A09((B3) obj);
                    }
                });
            }
        }
        if (C5C.A02 < 32 && list.size() > 1) {
            String str3 = list.get(0).A03;
            String firstCodecName4 = A0N(IronSourceError.ERROR_RV_LOAD_FAIL_UNEXPECTED, 26, 22);
            if (firstCodecName4.equals(str3)) {
                list.add(list.remove(0));
            }
        }
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.BZ != com.facebook.ads.androidx.media3.exoplayer.mediacodec.MediaCodecUtil$ScoreProvider<T> */
    public static <T> void A0U(List<T> list, final BZ<T> bz) {
        Collections.sort(list, new Comparator() { // from class: com.facebook.ads.redexgen.X.BU
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return C1083Ba.A0A(bz, obj, obj2);
            }
        });
    }

    public static boolean A0V(MediaCodecInfo mediaCodecInfo) {
        return C5C.A02 >= 29 && A0W(mediaCodecInfo);
    }

    public static boolean A0W(MediaCodecInfo mediaCodecInfo) {
        return mediaCodecInfo.isAlias();
    }

    public static boolean A0X(MediaCodecInfo mediaCodecInfo) {
        return mediaCodecInfo.isHardwareAccelerated();
    }

    public static boolean A0Y(MediaCodecInfo mediaCodecInfo) {
        return mediaCodecInfo.isSoftwareOnly();
    }

    public static boolean A0Z(MediaCodecInfo mediaCodecInfo) {
        if (C5C.A02 >= 29) {
            return A0a(mediaCodecInfo);
        }
        String strA01 = AbstractC2326k7.A01(mediaCodecInfo.getName());
        String codecName = A0N(1644, 11, 44);
        if (!strA01.startsWith(codecName)) {
            String codecName2 = A0N(1570, 11, 85);
            if (!strA01.startsWith(codecName2)) {
                String codecName3 = A0N(1581, 10, 2);
                if (!strA01.startsWith(codecName3)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean A0a(MediaCodecInfo mediaCodecInfo) {
        return mediaCodecInfo.isVendor();
    }

    public static boolean A0b(MediaCodecInfo mediaCodecInfo, String str) {
        if (C5C.A02 >= 29) {
            return A0X(mediaCodecInfo);
        }
        boolean zA0c = A0c(mediaCodecInfo, str);
        if (A02[7].length() == 25) {
            throw new RuntimeException();
        }
        String[] strArr = A02;
        strArr[1] = "KoKjuGysRdwz5u0";
        strArr[3] = "VFpylWMq2S0rj93";
        return !zA0c;
    }

    public static boolean A0c(MediaCodecInfo mediaCodecInfo, String str) {
        if (C5C.A02 >= 29) {
            boolean zA0Y = A0Y(mediaCodecInfo);
            if (A02[7].length() == 25) {
                throw new RuntimeException();
            }
            A02[7] = DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_D;
            return zA0Y;
        }
        if (C3J.A0C(str)) {
            return true;
        }
        String strA01 = AbstractC2326k7.A01(mediaCodecInfo.getName());
        String codecName = A0N(1422, 4, 110);
        if (strA01.startsWith(codecName)) {
            return false;
        }
        String codecName2 = A0N(1644, 11, 44);
        if (strA01.startsWith(codecName2)) {
            return true;
        }
        String codecName3 = A0N(1633, 11, 78);
        if (strA01.startsWith(codecName3)) {
            return true;
        }
        String codecName4 = A0N(1688, 8, 32);
        if (strA01.startsWith(codecName4)) {
            String strA0N = A0N(53, 4, 125);
            String[] strArr = A02;
            if (strArr[6].charAt(8) == strArr[5].charAt(8)) {
                A02[4] = "Tb2zdMoNeySIBbx0V3f9cAwRo38zez7f";
                if (strA01.contains(strA0N)) {
                    return true;
                }
            } else if (strA01.contains(strA0N)) {
                return true;
            }
        }
        String codecName5 = A0N(1655, 33, 66);
        if (strA01.equals(codecName5)) {
            return true;
        }
        String codecName6 = A0N(1570, 11, 85);
        if (strA01.startsWith(codecName6)) {
            return true;
        }
        String codecName7 = A0N(1581, 10, 2);
        if (strA01.startsWith(codecName7)) {
            return true;
        }
        String codecName8 = A0N(1629, 4, 74);
        if (!strA01.startsWith(codecName8)) {
            String codecName9 = A0N(1557, 3, 62);
            if (!strA01.startsWith(codecName9)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:108:0x0326  */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x0335, code lost:
    
        if (A0N(1104, 5, 115).equals(com.facebook.ads.redexgen.core.C5C.A03) != false) goto L110;
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x03df, code lost:
    
        if (r3 != false) goto L132;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00c5, code lost:
    
        if (com.facebook.ads.redexgen.core.C5C.A03.startsWith(A0N(268, 2, 87)) != false) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x01c7, code lost:
    
        if (A0N(1109, 6, 39).equals(com.facebook.ads.redexgen.core.C5C.A03) != false) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0239, code lost:
    
        if (A0N(117, 5, 63).equals(com.facebook.ads.redexgen.core.C5C.A03) != false) goto L79;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean A0d(android.media.MediaCodecInfo r8, java.lang.String r9, boolean r10, java.lang.String r11) {
        /*
            Method dump skipped, instruction units count: 1070
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.core.C1083Ba.A0d(android.media.MediaCodecInfo, java.lang.String, boolean, java.lang.String):boolean");
    }
}
