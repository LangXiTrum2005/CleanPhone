package com.facebook.ads.redexgen.core;

import android.content.Context;
import android.graphics.Point;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.SystemClock;
import android.util.Pair;
import android.view.Surface;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.view.PointerIconCompat;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.graphics.GL20;
import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomizations;
import com.google.android.exoplayer2.ColorInfo;
import com.google.android.exoplayer2.video.DummySurface;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.umeng.analytics.pro.cw;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.EnumC4719u30;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.0T, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C0T extends AnonymousClass10 {
    public static boolean A0y;
    public static boolean A0z;
    public static byte[] A10;
    public static String[] A11 = {"v9JW9d6mC4vVOXkKiuoPSKLjDHsuSFtl", "gIeHAk6WOzq2Y5rDB1esWl6sHVKNasBe", "EXXUcYdUXUj0vKHwdmCt8An0AEm5LNUx", "3czcsYB4y2EByKzz5ZqHef8RpAiR40Nr", "fs5EyusZMzPeANn58", "Vmk2kqnLGS8cuaCfxBf7qdhnj23D1lK8", "wawdFFlTZY47ktG", "L98TU6fXHJGhXusLAmdJJvi5hEKm1qt"};
    public static final int[] A12;
    public C0948Ox A00;
    public float A01;
    public float A02;
    public float A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public int A08;
    public int A09;
    public int A0A;
    public int A0B;
    public int A0C;
    public int A0D;
    public int A0E;
    public int A0F;
    public int A0G;
    public int A0H;
    public long A0I;
    public long A0J;
    public long A0K;
    public long A0L;
    public long A0M;
    public long A0N;
    public long A0O;
    public long A0P;
    public long A0Q;
    public long A0R;
    public MediaFormat A0S;
    public Surface A0T;
    public Surface A0U;
    public Y2 A0V;
    public C1613gS A0W;
    public InterfaceC1629gi A0X;
    public Object A0Y;
    public boolean A0Z;
    public boolean A0a;
    public boolean A0b;
    public boolean A0c;
    public boolean A0d;
    public boolean A0e;
    public boolean A0f;
    public boolean A0g;
    public boolean A0h;
    public boolean A0i;
    public boolean A0j;
    public final int A0k;
    public final int A0l;
    public final int A0m;
    public final int A0n;
    public final long A0o;
    public final Context A0p;
    public final C1615gU A0q;
    public final C1634gn A0r;
    public final C1637gq A0s;
    public final C1654h7 A0t;
    public final boolean A0u;
    public final boolean A0v;
    public final long[] A0w;
    public final long[] A0x;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 15 out of bounds for length 14
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.restartVar(DebugInfoParser.java:193)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:141)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:656)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    public static Point A07(Z2 z2, ZM zm) throws ZW {
        boolean z = zm.A0A > zm.A0L;
        int i = z ? zm.A0A : zm.A0L;
        int i2 = z ? zm.A0L : zm.A0A;
        float f = i2 / i;
        for (int i3 : A12) {
            int i4 = (int) (i3 * f);
            if (i3 <= i || i4 <= i2) {
                return null;
            }
            if (AbstractC1600gE.A02 >= 21) {
                int i5 = z ? i4 : i3;
                if (!z) {
                    i3 = i4;
                }
                Point pointA0N = z2.A0N(i5, i3);
                if (A11[1].charAt(9) != 'z') {
                    throw new RuntimeException();
                }
                String[] strArr = A11;
                strArr[6] = "eVrgFLGLScT3SQl";
                strArr[4] = "YUCpxf7mgZXJgqA9S";
                if (z2.A0R(pointA0N.x, pointA0N.y, zm.A01)) {
                    return pointA0N;
                }
            } else {
                int iA05 = AbstractC1600gE.A05(i3, 16) * 16;
                int iA06 = AbstractC1600gE.A05(i4, 16) * 16;
                if (iA05 * iA06 <= ZZ.A00()) {
                    int i6 = z ? iA06 : iA05;
                    if (!z) {
                        iA05 = iA06;
                    }
                    return new Point(i6, iA05);
                }
            }
        }
        return null;
    }

    public static String A0B(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A10, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            byte b = bArrCopyOfRange[i4];
            String[] strArr = A11;
            if (strArr[2].charAt(5) != strArr[3].charAt(5)) {
                throw new RuntimeException();
            }
            A11[1] = "mXsQu48WzzV6yd0DLsnHesgPlryuTOfM";
            bArrCopyOfRange[i4] = (byte) ((b - i3) - 29);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A0P() {
        A10 = new byte[]{-69, -64, -70, -69, 100, 106, 100, 102, -73, -67, -73, -70, -82, -98, -99, -102, -92, -99, -77, 125, 109, 108, 105, 115, 108, -120, 113, 97, 102, 96, 97, 113, 98, 96, 97, 102, -111, 100, 96, -106, -116, -123, -123, -123, -126, -74, -81, -91, -98, -98, -98, -34, -38, -29, -31, -122, 124, 117, 118, 117, -90, 121, 125, 124, 114, 107, 109, 107, -100, 111, 115, -57, -52, -38, -57, -37, -32, -18, -24, -120, -102, -100, -102, -90, -97, 119, 119, -120, -117, -87, -69, -67, -69, -57, -64, -104, -104, -87, -84, -87, -80, -62, -60, -62, -50, -57, -97, -97, -80, -77, -78, -100, -82, -80, -82, -70, -77, -117, -117, -100, -97, -70, -115, 119, -92, -102, -88, -91, -93, -105, -82, 86, 119, 104, 108, 121, 106, 126, -62, -14, -10, -30, -47, -16, -8, -26, -13, -50, -59, -9, -7, -9, -29, -34, -58, -71, -76, -76, -49, -48, -113, -61, -64, -81, -83, -100, -67, -62, -77, -83, -128, -85, -75, -86, -84, -76, -106, -102, -63, -43, -27, -44, -23, -36, -44, -77, -57, -34, -77, -59, -61, -60, -56, -84, -68, -85, -64, -77, -85, -55, -85, -66, -64, -100, -92, -76, -93, -72, -85, -93, -63, -93, -74, -72, -107, -63, -106, -83, -119, 119, 118, -125, 107, 105, 106, 105, -110, 124, 99, 101, -91, -78, -86, -109, -104, -110, -101, -62, -49, -40, -73, -78, -34, -56, -81, -81, -65, -21, -32, -31, -33, -100, -23, -35, -12, -100, -18, -31, -17, -21, -24, -15, -16, -27, -21, -22, -100, -35, -32, -26, -15, -17, -16, -31, -32, -100, -16, -21, -74, -100, -39, 5, 3, -1, 5, -23, -57, -79, -95, -94, -96, -97, 115, 122, -125, 117, 111, -115, 111, 97, -115, 126, -96, -99, -116, -109, -100, -114, -120, -90, -107, -74, -69, -84, 116, 123, -124, 118, 112, -114, 127, -95, -104, -100, -118, -111, -102, -116, -122, -92, -105, -90, -66, -92, -99, -77, -28, -45, -32, -63, -30, -49, -32, -51, -63, -83, -102, -104, -104, -104, -111, 126, 124, 124, 126, -87, -106, -108, -108, -103, -61, -80, -81, -82, -82, -69, -88, -89, -90, -88, -101, -120, -121, -122, -118, -105, -124, -124, -126, -126, 101, -128, -117, -110, -124, 98, -121, -124, -126, -118, 63, 122, -117, -124, -122, -128, -126, -104, 101, -111, -128, -116, -124, 114, -120, -103, -124, 75, 63, -122, -120, -114, -115, -124, -124, -98, -122, -127, -117, 118, 114, 117, 111, -87, -85, -79, -80, -89, -89, -63, -75, -71, -71, -109, -104, -110, -101, -103, -101, -95, -96, -105, -105, -79, -91, -87, -87, -125, -120, -124, -119, -29, -27, -21, -22, -31, -31, -5, -17, -13, -13, -51, -46, -49, -51, -79, -77, -71, -72, -81, -81, -55, -63, -84, -74, -97, -95, -102, -94, 111, 113, 119, 118, 109, 109, -121, 127, 106, 116, 95, 91, 94, 93, 101, 103, 109, 108, 99, 99, 125, 117, 96, 106, 85, 83, 79, 87, -116, -82, -108, -109, -118, -118, -92, -120, -121, -111, 124, 122, 118, 120, -38, -4, -30, -31, -40, -40, -14, -38, -43, -33, -54, -58, -60, -52, -123, -110, 126, -108, -126, -122, 93, -117, -107, -111, 106, -119, 111, 118, -44, -29, -50, -40, -38, -71, -44, -85, -70, -90, -92, -80, -112, -85, -101, -86, -104, -96, -97, -74, -59, -60, -68, -63, -101, -74, -60, -45, -45, -67, -49, -87, -60, 122, -97, -105, -102, -97, -102, -87, 94, -119, 102, 104, 99, 126, 123, -114, -53, -44, -49, -82, -51, -77, -78, -34, -56, -61, -12, -57, -61, -76, -81, -107, -77, -100, -101, -104, -47, -52, -78, -46, -73, -70, -75, -30, -23, -61, -53, -58, -57, -51, -78, -53, -44, -43, -36, -43, -122, -89, -104, -106, -105, -100, -56, -103, -106, 124, -107, -98, -97, -90, -97, 80, 123, 97, 96, -111, 100, 96, -55, -30, -21, -20, -13, -20, -99, -56, -75, 115, 91, -119, -47, -55, -51, -34, -39, -29, -47, -71, -80, -69, -103, -102, -78, -79, -74, -82, -112, -68, -79, -78, -80, -93, -74, -79, -78, -68, -97, -78, -69, -79, -78, -65, -78, -65, 118, -104, -99, -104, 110, 91, 81, 93, 112, 86, 117, 125, 110, 82, 110, -112, -107, -112, 104, 84, -92, -84, -97, -102, -97, -105, -54, -44, -79, -80, -83, -58, -125, -115, 106, 108, 104, 127, -115, -117, -106, 108, -91, -83, -83, -91, -86, -93, -38, -7, -16, -37, -9, 0, -2, -64, -33, -127, 103, 105, 98, -103, -127, 126, -27, -41, -57, -62, -53, -52, -59, -30, 122, 113, 120, 95, 92, 98, -21, -30, -23, -47, -52, -53, -122, 125, -124, 108, 103, 103, -119, -123, 126, -63, -61, -64, -88, -60, -126, -102, -109, -96, -90, -95, -97, 104, -38, -13, 2, -17, -10, -86, -21, 4, 19, 4, -49, -56, -46, -6, -50, -30, 122, -109, -94, -109, 95, 87, 91, 90, -119, 94, 113, -65, -95, -93, -98, -28, -57, -59, -55, -61, -26, -55, -57, -52, -118, 109, 108, 106, 105, -67, -95, -91, -95, -123, -118, -84, -103, -77, -87, -99, -92, 125, -31, -12, -13, -4, -8, -81, -61, -25, -114, -95, -96, -87, -91, 92, -118, -85, -80, -95, 92, 110, -33, -14, -15, -6, -10, -83, -37, -4, 1, -14, -83, -64, -99, -80, -71, -81, -80, -67, 107, -70, -64, -65, -69, -64, -65, 107, -79, -84, -76, -73, -80, -81, -79, -60, -46, -50, -53, -44, -45, -56, -50, -51, -46, 127, -44, -51, -54, -51, -50, -42, -51, -115, 127, -94, -50, -61, -60, -62, 127, -52, -64, -41, 127, -47, -60, -46, -50, -53, -44, -45, -56, -50, -51, -103, 127, -98, -104, 120, -110, -124, 126, -128, 123, -92, -98, 126, -101, -125, -127, -127, -104, -90, -31, -37, -69, -40, -64, -66, -66, -37, -59, -65, -97, -64, -85, -93, -94, -60, -90, -64, -62, 
        -76, -82, -65, -115, -64, -90, -52, -49, -55, -90, -67, -51, -49, -86, -82, 120, -111, -122, -103, -118, -124, 117, -105, -108, -106, -78, -79, -68, 99, -105, -92, -91, -81, -88, -73, 99, -106, -23, -41, -56, -62, -52, -56, -59, -37, -43, -61, -76, -82, -72, -76, -79, -39, 125, 107, 92, 86, 97, 94, 89, 111, -38, -56, -71, -77, -66, -69, -74, -45, -84, -57, -57, 120, -59, -71, -58, -47, 120, -53, -52, -54, -67, -71, -59, 120, -69, -64, -71, -58, -65, -67, -53, -124, 120, -53, -57, 120, -68, -54, -57, -56, -56, -63, -58, -65, 120, -57, -66, -66, -53, -67, -52, -110, 120, -44, -81, -36, -72, -71, -51, -56, 122, 89, -25, -28, -55, -55, -63, -36, -73, -29, -52, -49, -32, -51, -70, -32, -26, -30, -65, -60, -60, -63, -28, -69, -68, -23, -38, -36, -39, -71, -105, -113, 125, -121, 74, -123, 127, -109, -126, -121, -115, 75, -111, -125, -111, -111, -121, -115, -116, 75, -121, -126, -19, 1, 0, -5, -71, -14, -2, -17, -44, -93, -97, -46, -33, -43, -29, -32, -38, -43, -97, -46, -25, -94, -98, -43, -46, -25, -94, -43, -97, -43, -42, -44, -32, -43, -42, -29, -120, -105, -108, -107, 82, -121, -108, -103, -103, -108, -110, -117, -102, -105, -104, 85, -108, -115, -114, -100, -65, -50, -53, -52, -119, -50, -59, -61, -60, -48, -66, -51, -54, -53, -120, -49, -54, -53, -33, -14, -83, -43, -24, -91, -118, -121, -108, -115, -121, -110, -55, -54, -57, -34, -20, -23, -22, -48, -29, -34, -33, -23, -68, -17, -32, -32, -33, -20, -95, -89, -86, -119, -110, -106, -105, -120, -107, -20, -8, -25, -13, -21, -77, -8, -25, -6, -21, -28, -13, -27, -13, -107, -96, -105, -108, -108, -105, -100, -104, -107, -103, -105, -104, -92, -107, -95, -112, -116, -110, 98, 99, -102, -103, -116, -111, -95, -94, -103, -80, -65, -119, -108, -115, 117, -112, -89, 119, 110, 113, 111, -66, -73, -74, -63, -63, -115, -116, -120, -118, -76, -114, -115, -123, -117, -68, -59, -68, -58, -119, -125, -101, -90, -105, -98, -111, -123, 102, 99, -47, -103, -33, -45, -37, -52, -48, -43, -38, -8, -18, 1, -14, -16, -71, -72, -70, -76, -100, -107, -113, -88, 102, -36, -33, -25, -99, -36, -47, -28, -43, -34, -45, -23, 3, -56, -74, 4, 5, 10, -5, -74, -86, -73, -73, -78, -73, -80, -113, -125, -108, -117, -112, -111, -127, -120, -75, -87, -64, 117, -80, -83, -79, -81, -80, -68, -40, -52, -29, -104, -44, -39, -37, -32, -33, -104, -34, -44, -27, -48, -98, -110, -87, 94, -88, -102, -107, -91, -103, -6, -11, -117, -121, -126, -115, -2, -6, -2, -10, -62, -75, -63, -75, -56, -68, -103, -108, -114, -106, -105, -116, -96, -98, -118, -111, -82, 112, 111, 112, -18, -33, -20, -29, -22, -22, -35, -30, -85, -100, -87, -96, -89, -89, -102, -97, -89, -77, -92, -79, -88, -81, -81, -94, -89, -74, -60, -75, -62, -71, -64, -64, -77, -72, -56, -76, -74, -83, -77, -74, -83, -72, -67, -83, -96, -89, -96, -100, -82, -96, -118, -80, -81, -85, -80, -81, 125, -80, -95, -95, -96, -83, -80, -83, -78, -97, -78, -89, -83, -84, 107, -94, -93, -91, -80, -93, -93, -79, -18, -76, -85, -80, -13, -85, -84, -77, -67, -85, -72, -66, -71, -72, -77, -48, -56, -58, -51, -77, -58, -63, -62, -52, -97, -46, -61, -61, -62, -49, -54, -73, -65, -70, -59, -75, -56, -59, -51, -91, -108, -99, -112, -106, -90, -30, -29, -36, -36, -45, -38, -45, -46, -101, -34, -38, -49, -25, -48, -49, -47, -39, -51, -68, -55, -59, -68, -68, -74, -92, -116, -6, -19, -24, -23, -13, -77, -73, -21, -12, -12, 3, -10, -15, -14, -4, -68, -18, 3, -67, -66, -97, -110, -115, -114, -104, 88, -118, -97, -116, 10, -3, -8, -7, 3, -61, -8, 3, 0, -10, cw.k, -63, 10, -3, 7, -3, 3, 2, -101, -114, -119, -118, -108, 84, -115, -118, -101, -120, -35, -48, -53, -52, -42, -106, -44, -41, -101, -35, -108, -52, -38, 4, -9, -14, -13, -3, -67, 6, -69, 4, -4, -14, -68, -3, -4, -64, -68, 4, -2, -58, -109, -122, -127, -126, -116, 76, -107, 74, -109, -117, -127, 75, -116, -117, 79, 75, -109, -115, 86, -98, -120, -101, -102, -106, -107, -94, -109, -92, -99, -112, -113, -60, -74, -79, -63, -75, -39, -47, -47, -58, -43, -63, -56, 18, 10, 10, -1, cw.l, -6, 1, 9, -86};
    }

    static {
        A0P();
        A12 = new int[]{1920, 1600, 1440, GL20.GL_INVALID_ENUM, 960, 854, 640, 540, 480};
    }

    public C0T(Context context, C0889Mg c0889Mg, MediaCodecRendererMetaParameters mediaCodecRendererMetaParameters, ZS zs, long j, TO to, boolean z, boolean z2, Handler handler, InterfaceC1655h8 interfaceC1655h8, int i, int i2, int i3, int i4, int i5) {
        super(2, c0889Mg, mediaCodecRendererMetaParameters, zs, to, z, z2, i3, i4);
        this.A0e = true;
        this.A0Z = true;
        boolean z3 = false;
        this.A0f = false;
        this.A0K = C.TIME_UNSET;
        this.A0c = false;
        this.A0v = MetaExoPlayerUpgradeConfig.A03(EnumC0893Mn.A1j);
        this.A0o = j;
        this.A0k = i;
        this.A0l = i2;
        this.A0p = context.getApplicationContext();
        this.A0m = i5;
        this.A0s = new C1637gq(context);
        this.A0r = new C1634gn(this.A0p);
        this.A0t = new C1654h7(handler, interfaceC1655h8);
        this.A0q = new C1615gU(this.A0r, this, this.A0v);
        this.A0u = A0i();
        if (AbstractC1600gE.A02 == 29 && AbstractC1600gE.A06.startsWith(A0B(811, 6, 109))) {
            z3 = true;
        }
        this.A0a = z3;
        this.A0w = new long[10];
        this.A0x = new long[10];
        this.A0R = C.TIME_UNSET;
        this.A0O = C.TIME_UNSET;
        this.A0M = C.TIME_UNSET;
        this.A08 = -1;
        this.A06 = -1;
        this.A01 = -1.0f;
        this.A02 = -1.0f;
        this.A0H = 1;
        A0F();
    }

    private int A00(ZM zm) {
        if (zm.A0B != -1) {
            int i = 0;
            int i2 = zm.A0X.size();
            for (int initializationDataCount = 0; initializationDataCount < i2; initializationDataCount++) {
                int totalInitializationDataSize = zm.A0X.get(initializationDataCount).length;
                i += totalInitializationDataSize;
            }
            int totalInitializationDataSize2 = zm.A0B;
            return totalInitializationDataSize2 + i;
        }
        int i3 = zm.A0L;
        String str = zm.A0W;
        int width = zm.A0A;
        return A02(str, i3, width);
    }

    /* JADX WARN: Code duplicated, block: B:48:0x00b0  */
    public static int A01(ZS zs, ZM zm, boolean z) throws ZW {
        String mimeType = zm.A0W;
        if (!Q2.A0F(mimeType)) {
            return 0;
        }
        boolean z2 = true;
        boolean requiresSecureDecryption = zm.A0O != null;
        String mimeType2 = zm.A0W;
        List<Z2> listA7e = zs.A7e(mimeType2, requiresSecureDecryption, false);
        if (listA7e.isEmpty() && z) {
            listA7e = A0C(zs, zm);
        }
        if (requiresSecureDecryption && listA7e.isEmpty()) {
            if (!requiresSecureDecryption) {
                return 1;
            }
            String mimeType3 = zm.A0W;
            if (zs.A7e(mimeType3, false, false).isEmpty()) {
                return 1;
            }
            return 2;
        }
        if (listA7e.isEmpty()) {
            return AbstractC0976Qb.A00(1);
        }
        if (!AnonymousClass10.A1G(zm)) {
            return AbstractC0976Qb.A00(2);
        }
        Z2 z3 = listA7e.get(0);
        boolean zA0S = z3.A0S(zm);
        if (zA0S && zm.A0L > 0 && zm.A0A > 0) {
            if (AbstractC1600gE.A02 >= 21) {
                int i = zm.A0L;
                int i2 = zm.A0A;
                float f = zm.A01;
                String[] strArr = A11;
                if (strArr[2].charAt(5) != strArr[3].charAt(5)) {
                    throw new RuntimeException();
                }
                A11[0] = "KdZgRHJjPlYRYm8wF99PXX5NM5xTpbny";
                zA0S = z3.A0R(i, i2, f);
            } else {
                if (zm.A0L * zm.A0A > ZZ.A00()) {
                    z2 = false;
                }
                zA0S = z2;
                if (A11[5].charAt(17) != 'C') {
                    A11[0] = "RpTc8KJ45xKor81hlWZ1YoLxPsNTGzmj";
                    if (!zA0S) {
                        StringBuilder sb = new StringBuilder();
                        String mimeType4 = A0B(380, 29, 2);
                        StringBuilder sbAppend = sb.append(mimeType4).append(zm.A0L);
                        String mimeType5 = A0B(1775, 1, 21);
                        StringBuilder sbAppend2 = sbAppend.append(mimeType5).append(zm.A0A);
                        String mimeType6 = A0B(1154, 3, 13);
                        StringBuilder sbAppend3 = sbAppend2.append(mimeType6);
                        String mimeType7 = AbstractC1600gE.A04;
                        StringBuilder sbAppend4 = sbAppend3.append(mimeType7);
                        String mimeType8 = A0B(1153, 1, 3);
                        String string = sbAppend4.append(mimeType8).toString();
                        String mimeType9 = A0B(682, 23, 48);
                        AbstractC1561fb.A04(mimeType9, string);
                    }
                } else {
                    A11[5] = "eBfiFJFcrdpze21as5rDbJyO1lNDgHsg";
                    if (!zA0S) {
                        StringBuilder sb2 = new StringBuilder();
                        String mimeType10 = A0B(380, 29, 2);
                        StringBuilder sbAppend5 = sb2.append(mimeType10).append(zm.A0L);
                        String mimeType11 = A0B(1775, 1, 21);
                        StringBuilder sbAppend6 = sbAppend5.append(mimeType11).append(zm.A0A);
                        String mimeType12 = A0B(1154, 3, 13);
                        StringBuilder sbAppend7 = sbAppend6.append(mimeType12);
                        String mimeType13 = AbstractC1600gE.A04;
                        StringBuilder sbAppend8 = sbAppend7.append(mimeType13);
                        String mimeType14 = A0B(1153, 1, 3);
                        String string2 = sbAppend8.append(mimeType14).toString();
                        String mimeType15 = A0B(682, 23, 48);
                        AbstractC1561fb.A04(mimeType15, string2);
                    }
                }
            }
        }
        int i3 = z3.A04 ? 16 : 8;
        int adaptiveSupport = z3.A08 ? 32 : 0;
        return i3 | adaptiveSupport | (zA0S ? 4 : 3);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:8:0x000d  */
    public static int A02(String str, int i, int i2) {
        byte b;
        int iA05;
        int maxPixels;
        if (i == -1 || i2 == -1) {
            return -1;
        }
        switch (str.hashCode()) {
            case -1664118616:
                if (!str.equals(A0B(1635, 10, 103))) {
                    b = -1;
                } else {
                    b = 0;
                }
                break;
            case -1662541442:
                if (!str.equals(A0B(1682, 10, 8))) {
                    b = -1;
                } else {
                    b = 4;
                }
                break;
            case 1187890754:
                if (!str.equals(A0B(1692, 13, 74))) {
                    b = -1;
                } else {
                    b = 1;
                }
                break;
            case 1331836730:
                if (!str.equals(A0B(1655, 9, 12))) {
                    b = -1;
                } else {
                    b = 2;
                }
                break;
            case 1599127256:
                if (!str.equals(A0B(1705, 19, 113))) {
                    b = -1;
                } else {
                    b = 3;
                }
                break;
            case 1599127257:
                if (!str.equals(A0B(1724, 19, 0))) {
                    b = -1;
                } else {
                    b = 5;
                }
                break;
            default:
                b = -1;
                break;
        }
        switch (b) {
            case 0:
            case 1:
                iA05 = i * i2;
                if (A11[5].charAt(17) != 'C') {
                    A11[0] = "XihfVUbotLZDx4xXTlX7dv9JcUprNuKG";
                    maxPixels = 2;
                } else {
                    throw new RuntimeException();
                }
                break;
            case 2:
                if (A0B(179, 14, EnumC4719u30.PROTOBUF_SERIALIZATION_ERROR_VALUE).equals(AbstractC1600gE.A06)) {
                    return -1;
                }
                iA05 = AbstractC1600gE.A05(i, 16) * AbstractC1600gE.A05(i2, 16) * 16 * 16;
                maxPixels = 2;
                break;
                break;
            case 3:
                iA05 = i * i2;
                maxPixels = 2;
                break;
            case 4:
            case 5:
                iA05 = i * i2;
                maxPixels = 4;
                break;
            default:
                return -1;
        }
        int minCompressionRatio = iA05 * 3;
        return minCompressionRatio / (maxPixels * 2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public long A03(long j, long j2, long j3, long j4, boolean z) {
        double playbackSpeed = A1f();
        long j5 = (long) ((j4 - j) / playbackSpeed);
        if (z) {
            return j5 - (j3 - j2);
        }
        return j5;
    }

    @MetaExoPlayerCustomization("D64704257: Adding a new param to control AI FRC")
    private final MediaFormat A08(ZM zm, C1613gS c1613gS, boolean z, int i) {
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString(A0B(1462, 4, 116), zm.A0W);
        mediaFormat.setInteger(A0B(1755, 5, 48), zm.A0L);
        mediaFormat.setInteger(A0B(1307, 6, 19), zm.A0A);
        AbstractC1563fd.A06(mediaFormat, zm.A0X);
        AbstractC1563fd.A03(mediaFormat, A0B(GL20.GL_INVALID_FRAMEBUFFER_OPERATION, 10, 105), zm.A01);
        AbstractC1563fd.A04(mediaFormat, A0B(1548, 16, 33), zm.A0F);
        AbstractC1563fd.A02(mediaFormat, zm.A0N);
        mediaFormat.setInteger(A0B(1447, 9, 20), c1613gS.A02);
        mediaFormat.setInteger(A0B(1423, 10, 43), c1613gS.A00);
        AbstractC1563fd.A04(mediaFormat, A0B(1433, 14, 78), c1613gS.A01);
        if (AbstractC1600gE.A02 >= 23) {
            mediaFormat.setInteger(A0B(1521, 8, 39), 0);
        }
        if (z) {
            mediaFormat.setInteger(A0B(1173, 8, 111), 0);
        }
        MJ.A03(this.A11, mediaFormat);
        if (i != 0) {
            A0T(mediaFormat, i);
        }
        return mediaFormat;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0046  */
    private final C1613gS A0A(Z2 z2, ZM zm, ZM[] zmArr) throws ZW {
        int maxWidth;
        int iMax = zm.A0L;
        int iMax2 = zm.A0A;
        int iA00 = A00(zm);
        int maxHeight = zmArr.length;
        if (maxHeight == 1) {
            return new C1613gS(iMax, iMax2, iA00);
        }
        int i = 0;
        for (ZM streamFormat : zmArr) {
            boolean z = z2.A04;
            int maxHeight2 = A11[1].charAt(9);
            if (maxHeight2 != 122) {
                throw new RuntimeException();
            }
            A11[1] = "hFYniT29tzMfk4zkiR5Pben0nLKkZMmz";
            if (A0v(z, zm, streamFormat)) {
                int maxWidth2 = streamFormat.A0L;
                if (maxWidth2 != -1) {
                    int maxWidth3 = streamFormat.A0A;
                    if (maxWidth3 == -1) {
                        maxWidth = 1;
                    } else {
                        maxWidth = 0;
                    }
                } else {
                    maxWidth = 1;
                }
                i |= maxWidth;
                int maxWidth4 = streamFormat.A0L;
                iMax = Math.max(iMax, maxWidth4);
                int maxWidth5 = streamFormat.A0A;
                iMax2 = Math.max(iMax2, maxWidth5);
                int maxWidth6 = A00(streamFormat);
                iA00 = Math.max(iA00, maxWidth6);
            }
        }
        if (i != 0) {
            StringBuilder sbAppend = new StringBuilder().append(A0B(921, 43, 66)).append(iMax);
            String strA0B = A0B(1775, 1, 21);
            String string = sbAppend.append(strA0B).append(iMax2).toString();
            String strA0B2 = A0B(682, 23, 48);
            AbstractC1561fb.A07(strA0B2, string);
            Point pointA07 = A07(z2, zm);
            if (pointA07 != null) {
                int maxWidth7 = pointA07.x;
                iMax = Math.max(iMax, maxWidth7);
                int maxWidth8 = pointA07.y;
                iMax2 = Math.max(iMax2, maxWidth8);
                int maxWidth9 = A02(zm.A0W, iMax, iMax2);
                iA00 = Math.max(iA00, maxWidth9);
                AbstractC1561fb.A07(strA0B2, A0B(246, 34, 95) + iMax + strA0B + iMax2);
            }
        }
        return new C1613gS(iMax, iMax2, iA00);
    }

    public static List<Z2> A0C(ZS zs, ZM zm) throws ZW {
        ArrayList arrayList = new ArrayList();
        String alternativeMimeType = ZZ.A0P(zm);
        if (alternativeMimeType != null) {
            List<Z2> listA7e = zs.A7e(alternativeMimeType, false, false);
            if (AbstractC1600gE.A02 >= 26) {
                if (A0B(1664, 18, EnumC4719u30.JSON_ENCODE_ERROR_VALUE).equals(zm.A0W)) {
                    boolean zIsEmpty = listA7e.isEmpty();
                    if (A11[5].charAt(17) == 'C') {
                        throw new RuntimeException();
                    }
                    A11[7] = "MjxkmDR";
                    if (!zIsEmpty) {
                        return listA7e;
                    }
                    return arrayList;
                }
                return arrayList;
            }
            return arrayList;
        }
        return arrayList;
    }

    public static List<Z2> A0D(ZS zs, ZM zm, boolean z) throws ZW {
        String str = zm.A0W;
        if (str == null) {
            return Collections.emptyList();
        }
        String[] strArr = A11;
        if (strArr[2].charAt(5) != strArr[3].charAt(5)) {
            throw new RuntimeException();
        }
        A11[1] = "jfk4bz5Oizy2HT1tkEDilPHWV9VC8mhv";
        return Collections.unmodifiableList(zs.A7e(str, z, false));
    }

    private void A0E() {
        this.A0h = false;
        if (AbstractC1600gE.A02 >= 23 && this.A0j) {
            InterfaceC1197Yz interfaceC1197YzA1j = A1j();
            String[] strArr = A11;
            if (strArr[2].charAt(5) != strArr[3].charAt(5)) {
                throw new RuntimeException();
            }
            A11[0] = "tRf4j3XAuhTUrishLHLLZY0n8xUtf2jr";
            if (interfaceC1197YzA1j != null) {
                this.A00 = new C0948Ox(this, interfaceC1197YzA1j);
            }
        }
    }

    private void A0F() {
        this.A0G = -1;
        this.A0E = -1;
        this.A03 = -1.0f;
        this.A0F = -1;
    }

    @MetaExoPlayerCustomization("need for SR to release EGL context")
    private void A0G() {
        if (this.A0q.A0G() && MetaExoPlayerUpgradeConfig.A03(EnumC0893Mn.A1h)) {
            this.A0q.A0A();
            throw null;
        }
    }

    private void A0H() {
        if (this.A0l > 0 && this.A05 > 0 && this.A05 >= this.A0l) {
            this.A0t.A00(this.A05, SystemClock.elapsedRealtime() - this.A0I);
        }
        this.A05 = 0;
        this.A0I = SystemClock.elapsedRealtime();
    }

    private void A0I() {
        InterfaceC1197Yz interfaceC1197YzA1j = A1j();
        if (interfaceC1197YzA1j != null && !this.A0c && interfaceC1197YzA1j.A9A() > 30) {
            A0V(super.A0j);
            this.A0c = true;
        }
    }

    private void A0J() {
        if (this.A09 > 0) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            long now = this.A0J;
            long elapsedMs = jElapsedRealtime - now;
            this.A0t.A01(this.A09, elapsedMs);
            this.A09 = 0;
            this.A0J = jElapsedRealtime;
        }
    }

    private void A0K() {
        if (this.A08 == -1 && this.A06 == -1) {
            return;
        }
        if (this.A0G != this.A08 || this.A0E != this.A06 || this.A0F != this.A07 || this.A03 != this.A01) {
            this.A0t.A0B(new Y2(this.A08, this.A06, this.A07, this.A01));
            this.A0G = this.A08;
            this.A0E = this.A06;
            this.A0F = this.A07;
            this.A03 = this.A01;
        }
    }

    private void A0L() {
        if (this.A0h) {
            this.A0t.A0D(this.A0U);
        }
    }

    private void A0M() {
        if (this.A0G != -1 || this.A0E != -1) {
            this.A0t.A0B(new Y2(this.A0G, this.A0E, this.A0F, this.A03));
        }
    }

    private void A0N() {
        long jElapsedRealtime;
        if (this.A0o > 0) {
            jElapsedRealtime = SystemClock.elapsedRealtime() + this.A0o;
        } else {
            jElapsedRealtime = C.TIME_UNSET;
        }
        this.A0M = jElapsedRealtime;
    }

    @MetaExoPlayerCustomization("D36797879: Adding implementation for calculating avg render time")
    private void A0O() {
        super.A0i.A03(super.A0h);
    }

    private final void A0Q(int i) {
        super.A0i.A04 += i;
        this.A09 += i;
        this.A05 += i;
        super.A0i.A07 = Math.max(this.A05, super.A0i.A07);
        if (this.A09 >= this.A0k) {
            A0J();
        }
    }

    /* JADX WARN: Code duplicated, block: B:20:0x006c  */
    /* JADX WARN: Code duplicated, block: B:22:0x0073  */
    private final void A0R(long j, long j2, float f) {
        int positionMs;
        int presentationGapMs;
        int iA01 = (int) O5.A01(j);
        int iA02 = (int) O5.A01(j2);
        if (iA02 > 1000 && iA02 < 10000) {
            int i = iA01 + iA02;
            int positionMs2 = this.A0A;
            int presentationGapMs2 = this.A0B;
            if (i > positionMs2 + presentationGapMs2 + 1000) {
                int presentationGapMs3 = this.A0A;
                if (iA01 > presentationGapMs3) {
                    int i2 = this.A0A;
                    int i3 = this.A0B;
                    int positionMs3 = A11[1].charAt(9);
                    if (positionMs3 != 122) {
                        throw new RuntimeException();
                    }
                    String[] strArr = A11;
                    strArr[2] = "bs9qXYsYT8loRf6GvckLlR6pDe1CBFH9";
                    strArr[3] = "Zg7YmY2aXY9EZ5gVNBnC4rp36cey1aFg";
                    if (iA01 < i2 + i3) {
                        OA oa = super.A0i;
                        int i4 = oa.A0E;
                        int i5 = iA01 + iA02;
                        String[] strArr2 = A11;
                        String str = strArr2[2];
                        String str2 = strArr2[3];
                        int positionMs4 = str.charAt(5);
                        int presentationGapMs4 = str2.charAt(5);
                        if (positionMs4 != presentationGapMs4) {
                            throw new RuntimeException();
                        }
                        String[] strArr3 = A11;
                        strArr3[2] = "S6seRYbycKE2NQwE9DxjdMn9egSjrFLO";
                        strArr3[3] = "DAGbTYnYpv3sH0rNuac7wkHdB7hzbjmw";
                        int positionMs5 = this.A0A;
                        int presentationGapMs5 = this.A0B;
                        oa.A0E = i4 + ((int) (((double) ((i5 - (positionMs5 + presentationGapMs5)) * f)) / 1000.0d));
                    } else {
                        positionMs = this.A0A;
                        presentationGapMs = this.A0B;
                        if (iA01 > positionMs + presentationGapMs) {
                            int presentationGapMs6 = (int) (((double) (iA02 * f)) / 1000.0d);
                            super.A0i.A0E += presentationGapMs6;
                        }
                    }
                } else {
                    positionMs = this.A0A;
                    presentationGapMs = this.A0B;
                    if (iA01 > positionMs + presentationGapMs) {
                        int presentationGapMs7 = (int) (((double) (iA02 * f)) / 1000.0d);
                        super.A0i.A0E += presentationGapMs7;
                    }
                }
                this.A0A = iA01;
                this.A0B = iA02;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0S(long j, long j2, ZM zm, MediaFormat mediaFormat) {
        if (this.A0X != null) {
            this.A0X.AFa(j, j2, zm, mediaFormat);
        }
    }

    public static void A0T(MediaFormat mediaFormat, int i) {
        mediaFormat.setFeatureEnabled(A0B(1609, 17, 81), true);
        mediaFormat.setInteger(A0B(1157, 16, 1), i);
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0060  */
    /* JADX WARN: Code duplicated, block: B:39:0x00a5  */
    private void A0U(Surface surface) throws EK {
        boolean z;
        if (surface == null) {
            if (this.A0T != null) {
                surface = this.A0T;
            } else {
                Z2 z2A1k = A1k();
                if (z2A1k != null && A0r(z2A1k)) {
                    this.A0T = DummySurface.A01(this.A0p, z2A1k.A06);
                    surface = this.A0T;
                }
            }
        }
        boolean zA03 = MetaExoPlayerUpgradeConfig.A03(EnumC0893Mn.A0W);
        if (this.A0U != surface) {
            this.A0U = surface;
            this.A0Q = SystemClock.elapsedRealtime();
            int iA90 = A90();
            boolean shouldReInitCodecUponSurfaceSetFailure = this.A0f;
            boolean z2 = false;
            if (shouldReInitCodecUponSurfaceSetFailure) {
                boolean shouldReInitCodecUponSurfaceSetFailure2 = AAT();
                if (shouldReInitCodecUponSurfaceSetFailure2) {
                    z = true;
                } else {
                    z = false;
                }
            } else {
                z = false;
            }
            int state = A11[7].length();
            if (state == 5) {
                throw new RuntimeException();
            }
            A11[0] = "Ia6TBaaCgzvUbxRJYFfm0eaUuCVICv9p";
            if (iA90 == 1 || iA90 == 2) {
                InterfaceC1197Yz interfaceC1197YzA1j = A1j();
                boolean shouldReInitCodecUponSurfaceSetFailure3 = this.A0q.A0G();
                if (!shouldReInitCodecUponSurfaceSetFailure3) {
                    int state2 = AbstractC1600gE.A02;
                    if (state2 < 23 || interfaceC1197YzA1j == null || surface == null) {
                        A1n();
                        A1p();
                    } else {
                        boolean shouldReInitCodecUponSurfaceSetFailure4 = this.A0b;
                        if (!shouldReInitCodecUponSurfaceSetFailure4) {
                            if (zA03) {
                                try {
                                    A0d(interfaceC1197YzA1j, surface);
                                } catch (IllegalStateException unused) {
                                    A1n();
                                    int state3 = A11[5].charAt(17);
                                    if (state3 != 67) {
                                        String[] strArr = A11;
                                        strArr[2] = "WYmnMY5zvd4goA7UxxnHch09FJJxOsHW";
                                        strArr[3] = "0CYk0Yb8EBtPtgU8j5V9Zcb3PC7bavn6";
                                        A1p();
                                    } else {
                                        A1p();
                                    }
                                }
                            } else {
                                A0d(interfaceC1197YzA1j, surface);
                            }
                        } else {
                            A1n();
                            A1p();
                        }
                    }
                }
            }
            if (surface != null && surface != this.A0T) {
                A0M();
                A0E();
                if (iA90 == 2 || z) {
                    A0N();
                }
                if (this.A0q.A0G()) {
                    if (MetaExoPlayerUpgradeConfig.A03(EnumC0893Mn.A0j) && this.A0q.A06 != null) {
                        z2 = true;
                    }
                    if (!z2) {
                        this.A0q.A0C(surface, C1583fx.A04);
                        return;
                    }
                    return;
                }
                return;
            }
            A0F();
            A0E();
            if (!this.A0q.A0G()) {
                return;
            }
            this.A0q.A08();
            throw null;
        }
        if (surface != null && surface != this.A0T) {
            A0M();
            A0L();
        }
    }

    private void A0V(ZM zm) {
        InterfaceC1197Yz codec = A1j();
        if (codec != null && zm != null) {
            Pair<Long, Integer> pairA8Z = codec.A8Z();
            long jLongValue = ((Long) pairA8Z.first).longValue();
            String[] strArr = A11;
            if (strArr[2].charAt(5) != strArr[3].charAt(5)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A11;
            strArr2[6] = "KqB5WjprWJUdF9G";
            strArr2[4] = "cASIJFz4IWmOqOLOe";
            if (jLongValue > 0) {
                super.A0i.A04(pairA8Z);
                this.A0t.A04(super.A0i.A00, zm);
            }
        }
    }

    private final void A0W(InterfaceC1197Yz interfaceC1197Yz, int i, long j) {
        AbstractC1591g5.A02(A0B(1262, 15, 93));
        interfaceC1197Yz.AGq(i, false);
        AbstractC1591g5.A00();
        A0Q(1);
    }

    @MetaExoPlayerCustomization("D36797879: Adding implementation for calculating avg render time")
    private final void A0X(InterfaceC1197Yz interfaceC1197Yz, int i, long j) {
        if (this.A0v) {
            A0Y(interfaceC1197Yz, i, j);
            return;
        }
        A0K();
        try {
            AbstractC1591g5.A02(A0B(1529, 19, 30));
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            interfaceC1197Yz.AGq(i, true);
            long j2 = super.A0h;
            long startRenderTime = SystemClock.elapsedRealtime();
            super.A0h = j2 + (startRenderTime - jElapsedRealtime);
            this.A0P = SystemClock.elapsedRealtime() * 1000;
            super.A0i.A09++;
            A0H();
            A27();
            A0O();
        } finally {
            AbstractC1591g5.A00();
        }
    }

    @MetaExoPlayerCustomization("D36797879: Adding implementation for calculating avg render time")
    private final void A0Y(InterfaceC1197Yz interfaceC1197Yz, int i, long j) {
        AbstractC1591g5.A02(A0B(1529, 19, 30));
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        interfaceC1197Yz.AGq(i, true);
        long j2 = super.A0h;
        long startRenderTime = SystemClock.elapsedRealtime();
        super.A0h = j2 + (startRenderTime - jElapsedRealtime);
        AbstractC1591g5.A00();
        super.A0i.A09++;
        A0H();
        if (!this.A0q.A0G()) {
            long jElapsedRealtime2 = SystemClock.elapsedRealtime();
            if (A11[5].charAt(17) == 'C') {
                throw new RuntimeException();
            }
            A11[5] = "i8cO0zMNSWd1ewKpaUAlLuolVCtgXekF";
            this.A0P = jElapsedRealtime2 * 1000;
            A0K();
            A27();
        }
    }

    private final void A0Z(InterfaceC1197Yz interfaceC1197Yz, int i, long j) {
        AbstractC1591g5.A02(A0B(1579, 15, 64));
        interfaceC1197Yz.AGq(i, false);
        AbstractC1591g5.A00();
        super.A0i.A0B++;
    }

    @MetaExoPlayerCustomization("D36797879: Adding implementation for calculating avg render time")
    private final void A0a(InterfaceC1197Yz interfaceC1197Yz, int i, long j, long j2) {
        if (this.A0v) {
            A0c(interfaceC1197Yz, i, j, j2, true);
            return;
        }
        A0K();
        ZM zm = super.A0j;
        MediaFormat mediaFormat = this.A0S;
        String[] strArr = A11;
        if (strArr[2].charAt(5) != strArr[3].charAt(5)) {
            throw new RuntimeException();
        }
        A11[1] = "1OxvY0lqazwFMaHeED37DJdg2bjujp7s";
        A0S(j, j2, zm, mediaFormat);
        try {
            AbstractC1591g5.A02(A0B(1529, 19, 30));
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            interfaceC1197Yz.AGp(i, j2);
            long j3 = super.A0h;
            long startRenderTime = SystemClock.elapsedRealtime();
            super.A0h = j3 + (startRenderTime - jElapsedRealtime);
            this.A0P = SystemClock.elapsedRealtime() * 1000;
            super.A0i.A09++;
            A0H();
            A27();
            A0O();
        } finally {
            AbstractC1591g5.A00();
        }
    }

    private final void A0b(@MetaExoPlayerCustomization InterfaceC1197Yz interfaceC1197Yz, int i, long j, long j2, boolean z) {
        if (this.A0v) {
            A0c(interfaceC1197Yz, i, j, j2, z);
            return;
        }
        A0K();
        A0S(j, j2, super.A0j, this.A0S);
        try {
            AbstractC1591g5.A02(A0B(1529, 19, 30));
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            interfaceC1197Yz.AGp(i, j2);
            long j3 = super.A0h;
            long startRenderTime = SystemClock.elapsedRealtime();
            super.A0h = j3 + (startRenderTime - jElapsedRealtime);
            this.A0P = SystemClock.elapsedRealtime() * 1000;
            super.A0i.A09++;
            A0H();
            A27();
            A0O();
        } finally {
            AbstractC1591g5.A00();
        }
    }

    @MetaExoPlayerCustomization("notifyFrameMetadataListener be removed once we take the Exo renderOutputBufferNow Function refactor")
    private final void A0c(InterfaceC1197Yz interfaceC1197Yz, int i, long j, long j2, boolean z) {
        if (z) {
            ZM zm = super.A0j;
            MediaFormat mediaFormat = this.A0S;
            if (A11[5].charAt(17) == 'C') {
                throw new RuntimeException();
            }
            A11[7] = "4VguciQ7";
            A0S(j, j2, zm, mediaFormat);
        }
        AbstractC1591g5.A02(A0B(1529, 19, 30));
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        interfaceC1197Yz.AGp(i, j2);
        long j3 = super.A0h;
        long startRenderTime = SystemClock.elapsedRealtime();
        super.A0h = j3 + (startRenderTime - jElapsedRealtime);
        AbstractC1591g5.A00();
        super.A0i.A09++;
        A0H();
        if (!this.A0q.A0G()) {
            this.A0P = SystemClock.elapsedRealtime() * 1000;
            A0K();
            if (A11[1].charAt(9) != 'z') {
                A27();
                A0O();
                return;
            }
            String[] strArr = A11;
            strArr[6] = "G2zU8YwkZwnM36T";
            strArr[4] = "pyfYVO0ogWIcNmhi4";
            A27();
            A0O();
        }
    }

    public static void A0d(InterfaceC1197Yz interfaceC1197Yz, Surface surface) {
        interfaceC1197Yz.AIh(surface);
    }

    @MetaExoPlayerCustomization
    private void A0f(Object obj) {
        this.A0d = ((Boolean) obj).booleanValue();
        A1j();
    }

    private boolean A0g() {
        if (this.A0m <= 0) {
            return false;
        }
        boolean z = this.A0K == C.TIME_UNSET || System.currentTimeMillis() - this.A0K <= ((long) this.A0m);
        String[] strArr = A11;
        if (strArr[2].charAt(5) != strArr[3].charAt(5)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A11;
        strArr2[6] = "tSNEeTj3zvxCS6h";
        strArr2[4] = "zKNG4oagYbeBOD6F4";
        if (this.A0K == C.TIME_UNSET) {
            AbstractC1561fb.A07(A0B(682, 23, 48), A0B(TypedValues.Custom.TYPE_FLOAT, 20, 46));
            this.A0K = System.currentTimeMillis();
        }
        return z;
    }

    public static boolean A0h() {
        return AbstractC1600gE.A02 >= 21;
    }

    public static boolean A0i() {
        return AbstractC1600gE.A02 <= 22 && A0B(GL20.GL_INVALID_ENUM, 6, 6).equals(AbstractC1600gE.A03) && A0B(725, 6, 57).equals(AbstractC1600gE.A05);
    }

    public static /* synthetic */ boolean A0j() {
        boolean zA0h = A0h();
        if (A11[0].charAt(18) == 'P') {
            throw new RuntimeException();
        }
        A11[0] = "7GiRrcnfpEvFmxn3JhCcvJZoro3FYcpR";
        return zA0h;
    }

    public static boolean A0k(long j) {
        return j < -30000;
    }

    public static boolean A0l(long j) {
        return j < -500000;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:10:0x0013  */
    public boolean A0m(long j, long j2) {
        boolean z;
        boolean z2 = A90() == 2;
        boolean isStarted = this.A0i;
        if (!isStarted) {
            if (z2) {
                z = true;
            } else {
                boolean isStarted2 = this.A0g;
                if (isStarted2) {
                    z = true;
                } else {
                    z = false;
                }
            }
        } else {
            boolean isStarted3 = this.A0h;
            z = !isStarted3;
        }
        long jElapsedRealtime = (SystemClock.elapsedRealtime() * 1000) - this.A0P;
        if (this.A0M == C.TIME_UNSET && j >= A1i()) {
            if (z) {
                return true;
            }
            if (z2) {
                boolean isStarted4 = A0p(j2, jElapsedRealtime);
                if (isStarted4) {
                    return true;
                }
            }
        }
        return false;
    }

    private final boolean A0n(long j, long j2) {
        return A0l(j);
    }

    private final boolean A0o(long j, long j2) {
        return A0k(j);
    }

    private final boolean A0p(long j, long j2) {
        return A0k(j) && j2 > 100000;
    }

    private final boolean A0q(InterfaceC1197Yz interfaceC1197Yz, int i, long j, long j2) throws EK {
        int iA1Q = A1Q(j2);
        if (iA1Q == 0) {
            return false;
        }
        OA oa = super.A0i;
        int droppedSourceBufferCount = oa.A06;
        oa.A06 = droppedSourceBufferCount + 1;
        int droppedSourceBufferCount2 = this.A04;
        A0Q(droppedSourceBufferCount2 + iA1Q);
        A1m();
        if (!this.A0q.A0G()) {
            return true;
        }
        this.A0q.A09();
        throw null;
    }

    private boolean A0r(Z2 z2) {
        return AbstractC1600gE.A02 >= 23 && this.A0e && !this.A0j && !A0u(z2.A03) && (!z2.A06 || DummySurface.A05(this.A0p));
    }

    /* JADX WARN: Code duplicated, block: B:404:0x09d3  */
    /* JADX WARN: Code duplicated, block: B:493:0x0be9  */
    private final boolean A0u(String str) {
        byte b = 0;
        if (str.startsWith(A0B(743, 10, 33))) {
            return false;
        }
        synchronized (C0T.class) {
            if (!A0z) {
                if (A0B(1253, 6, 9).equals(AbstractC1600gE.A03)) {
                    A0y = true;
                } else {
                    byte b2 = 27;
                    if (AbstractC1600gE.A02 <= 27 && A0B(563, 5, 54).equals(AbstractC1600gE.A03)) {
                        A0y = true;
                    } else if (AbstractC1600gE.A02 < 27) {
                        String str2 = AbstractC1600gE.A03;
                        switch (str2.hashCode()) {
                            case -2144781245:
                                if (!str2.equals(A0B(423, 14, 69))) {
                                    b2 = -1;
                                } else {
                                    b2 = 43;
                                }
                                break;
                            case -2144781185:
                                if (!str2.equals(A0B(437, 14, 53))) {
                                    b2 = -1;
                                } else {
                                    b2 = 44;
                                }
                                break;
                            case -2144781160:
                                if (!str2.equals(A0B(451, 14, EnumC4719u30.ASSET_FAILED_MAX_SPACE_EXCEEDED_VALUE))) {
                                    b2 = -1;
                                } else {
                                    b2 = 45;
                                }
                                break;
                            case -2097309513:
                                if (!str2.equals(A0B(TypedValues.MotionType.TYPE_QUANTIZE_INTERPOLATOR, 6, EnumC4719u30.PROTOBUF_SERIALIZATION_ERROR_VALUE))) {
                                    b2 = -1;
                                } else {
                                    b2 = 63;
                                }
                                break;
                            case -2022874474:
                                if (!str2.equals(A0B(EnumC4719u30.AD_RESPONSE_RETRY_AFTER_VALUE, 10, 22))) {
                                    b2 = -1;
                                } else {
                                    b2 = 19;
                                }
                                break;
                            case -1978993182:
                                if (!str2.equals(A0B(731, 6, 95))) {
                                    b2 = -1;
                                } else {
                                    b2 = 77;
                                }
                                break;
                            case -1978990237:
                                if (!str2.equals(A0B(737, 6, 24))) {
                                    b2 = -1;
                                } else {
                                    b2 = 78;
                                }
                                break;
                            case -1936688988:
                                if (!str2.equals(A0B(777, 6, 13))) {
                                    b2 = -1;
                                } else {
                                    b2 = 88;
                                }
                                break;
                            case -1936688066:
                                if (!str2.equals(A0B(783, 6, EnumC4719u30.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE))) {
                                    b2 = -1;
                                } else {
                                    b2 = 89;
                                }
                                break;
                            case -1936688065:
                                if (!str2.equals(A0B(789, 6, 25))) {
                                    b2 = -1;
                                } else {
                                    b2 = 90;
                                }
                                break;
                            case -1931988508:
                                if (!str2.equals(A0B(138, 10, 100))) {
                                    b2 = -1;
                                } else {
                                    b2 = 11;
                                }
                                break;
                            case -1696512866:
                                if (!str2.equals(A0B(1137, 6, 113))) {
                                    b2 = -1;
                                } else {
                                    b2 = 123;
                                }
                                break;
                            case -1680025915:
                                if (!str2.equals(A0B(280, 7, 121))) {
                                    b2 = -1;
                                } else {
                                    b2 = 18;
                                }
                                break;
                            case -1615810839:
                                if (!str2.equals(A0B(803, 8, 21))) {
                                    b2 = -1;
                                } else {
                                    b2 = 91;
                                }
                                break;
                            case -1554255044:
                                if (!str2.equals(A0B(1626, 9, 58))) {
                                    b2 = -1;
                                } else {
                                    b2 = 116;
                                }
                                break;
                            case -1481772737:
                                if (!str2.equals(A0B(1494, 9, 30))) {
                                    b2 = -1;
                                } else {
                                    b2 = 84;
                                }
                                break;
                            case -1481772730:
                                if (!str2.equals(A0B(1503, 9, 38))) {
                                    b2 = -1;
                                } else {
                                    b2 = 85;
                                }
                                break;
                            case -1481772729:
                                if (!str2.equals(A0B(1512, 9, 55))) {
                                    b2 = -1;
                                } else {
                                    b2 = 86;
                                }
                                break;
                            case -1320080169:
                                if (!str2.equals(A0B(521, 14, EnumC4719u30.PROTOBUF_SERIALIZATION_ERROR_VALUE))) {
                                    b2 = -1;
                                } else {
                                    b2 = 41;
                                }
                                break;
                            case -1217592143:
                                if (!str2.equals(A0B(Input.Keys.F23, 11, 77))) {
                                    b2 = -1;
                                } else {
                                    b2 = cw.m;
                                }
                                break;
                            case -1180384755:
                                if (!str2.equals(A0B(1353, 6, 54))) {
                                    b2 = -1;
                                } else {
                                    b2 = 59;
                                }
                                break;
                            case -1139198265:
                                if (!str2.equals(A0B(PointerIconCompat.TYPE_VERTICAL_DOUBLE_ARROW, 9, 8))) {
                                    b2 = -1;
                                } else {
                                    b2 = 104;
                                }
                                break;
                            case -1052835013:
                                if (!str2.equals(A0B(1466, 6, 55))) {
                                    b2 = -1;
                                } else {
                                    b2 = 75;
                                }
                                break;
                            case -993250464:
                                if (!str2.equals(A0B(12, 7, 80))) {
                                    b2 = -1;
                                } else {
                                    b2 = 3;
                                }
                                break;
                            case -993250458:
                                if (!str2.equals(A0B(19, 7, 31))) {
                                    b2 = -1;
                                } else {
                                    b2 = 4;
                                }
                                break;
                            case -965403638:
                                if (!str2.equals(A0B(1564, 8, 94))) {
                                    b2 = -1;
                                } else {
                                    b2 = 106;
                                }
                                break;
                            case -958336948:
                                if (!str2.equals(A0B(324, 11, 40))) {
                                    b2 = -1;
                                } else {
                                    b2 = 29;
                                }
                                break;
                            case -879245230:
                                if (!str2.equals(A0B(1603, 6, 20))) {
                                    b2 = -1;
                                } else {
                                    b2 = 112;
                                }
                                break;
                            case -842500323:
                                if (!str2.equals(A0B(1472, 10, 14))) {
                                    b2 = -1;
                                } else {
                                    b2 = 76;
                                }
                                break;
                            case -821392978:
                                if (!str2.equals(A0B(39, 7, 56))) {
                                    b2 = -1;
                                } else {
                                    b2 = 7;
                                }
                                break;
                            case -797483286:
                                if (!str2.equals(A0B(PointerIconCompat.TYPE_CELL, 9, 92))) {
                                    b2 = -1;
                                } else {
                                    b2 = 105;
                                }
                                break;
                            case -794946968:
                                if (!str2.equals(A0B(1743, 6, 10))) {
                                    b2 = -1;
                                } else {
                                    b2 = 117;
                                }
                                break;
                            case -788334647:
                                if (!str2.equals(A0B(1749, 6, 14))) {
                                    b2 = -1;
                                } else {
                                    b2 = 118;
                                }
                                break;
                            case -782144577:
                                if (!str2.equals(A0B(753, 9, 110))) {
                                    b2 = -1;
                                } else {
                                    b2 = 79;
                                }
                                break;
                            case -575125681:
                                if (!str2.equals(A0B(507, 14, 40))) {
                                    b2 = -1;
                                } else {
                                    b2 = 40;
                                }
                                break;
                            case -521118391:
                                if (!str2.equals(A0B(409, 14, 34))) {
                                    b2 = -1;
                                } else {
                                    b2 = 42;
                                }
                                break;
                            case -430914369:
                                if (!str2.equals(A0B(817, 10, EnumC4719u30.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE))) {
                                    b2 = -1;
                                } else {
                                    b2 = 92;
                                }
                                break;
                            case -290434366:
                                if (!str2.equals(A0B(1594, 9, 57))) {
                                    b2 = -1;
                                } else {
                                    b2 = 107;
                                }
                                break;
                            case -282781963:
                                if (!str2.equals(A0B(171, 8, 76))) {
                                    b2 = -1;
                                } else {
                                    b2 = cw.l;
                                }
                                break;
                            case -277133239:
                                if (!str2.equals(A0B(1143, 7, 109))) {
                                    b2 = -1;
                                } else {
                                    b2 = 124;
                                }
                                break;
                            case -173639913:
                                if (!str2.equals(A0B(292, 12, 17))) {
                                    b2 = -1;
                                } else {
                                    b2 = 26;
                                }
                                break;
                            case -56598463:
                                if (!str2.equals(A0B(1767, 8, EnumC4719u30.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE))) {
                                    b2 = -1;
                                } else {
                                    b2 = 120;
                                }
                                break;
                            case 2126:
                                if (!str2.equals(A0B(EnumC4719u30.MRAID_JS_DOES_NOT_EXIST_VALUE, 2, 41))) {
                                    b2 = -1;
                                } else {
                                    b2 = 17;
                                }
                                break;
                            case 2564:
                                if (!str2.equals(A0B(856, 2, 79))) {
                                    b2 = -1;
                                } else {
                                    b2 = 100;
                                }
                                break;
                            case 2715:
                                if (!str2.equals(A0B(1114, 2, 97))) {
                                    b2 = -1;
                                } else {
                                    b2 = 113;
                                }
                                break;
                            case 2719:
                                if (!str2.equals(A0B(1121, 2, 7))) {
                                    b2 = -1;
                                } else {
                                    b2 = 115;
                                }
                                break;
                            case 3483:
                                if (!str2.equals(A0B(1456, 2, 112))) {
                                    b2 = -1;
                                } else {
                                    b2 = 72;
                                }
                                break;
                            case 73405:
                                if (!str2.equals(A0B(594, 3, 23))) {
                                    b2 = -1;
                                } else {
                                    b2 = 62;
                                }
                                break;
                            case 75739:
                                if (!str2.equals(A0B(668, 3, 9))) {
                                    b2 = -1;
                                } else {
                                    b2 = 68;
                                }
                                break;
                            case 76779:
                                if (!str2.equals(A0B(679, 3, 70))) {
                                    b2 = -1;
                                } else {
                                    b2 = 74;
                                }
                                break;
                            case 78669:
                                if (!str2.equals(A0B(766, 3, 44))) {
                                    b2 = -1;
                                } else {
                                    b2 = 82;
                                }
                                break;
                            case 79305:
                                if (!str2.equals(A0B(795, 3, 28))) {
                                    b2 = -1;
                                } else {
                                    b2 = 94;
                                }
                                break;
                            case 80618:
                                if (!str2.equals(A0B(866, 3, 47))) {
                                    b2 = -1;
                                } else {
                                    b2 = 102;
                                }
                                break;
                            case 88274:
                                if (!str2.equals(A0B(1150, 3, 66))) {
                                    b2 = -1;
                                } else {
                                    b2 = 125;
                                }
                                break;
                            case 98846:
                                if (!str2.equals(A0B(1247, 3, 95))) {
                                    b2 = -1;
                                } else {
                                    b2 = 22;
                                }
                                break;
                            case 98848:
                                if (!str2.equals(A0B(1250, 3, 85))) {
                                    b2 = -1;
                                } else {
                                    b2 = 23;
                                }
                                break;
                            case 99329:
                                if (!str2.equals(A0B(1259, 3, 72))) {
                                    b2 = -1;
                                } else {
                                    b2 = 24;
                                }
                                break;
                            case 101481:
                                if (!str2.equals(A0B(1277, 3, 30))) {
                                    b2 = -1;
                                } else {
                                    b2 = 38;
                                }
                                break;
                            case 1513190:
                                if (!str2.equals(A0B(0, 4, 109))) {
                                    b2 = -1;
                                } else {
                                    b2 = 0;
                                }
                                break;
                            case 1514184:
                                if (!str2.equals(A0B(4, 4, 22))) {
                                    b2 = -1;
                                } else {
                                    b2 = 1;
                                }
                                break;
                            case 1514185:
                                if (!str2.equals(A0B(8, 4, 105))) {
                                    b2 = -1;
                                } else {
                                    b2 = 2;
                                }
                                break;
                            case 2436959:
                                if (!str2.equals(A0B(762, 4, 20))) {
                                    b2 = -1;
                                } else {
                                    b2 = 81;
                                }
                                break;
                            case 2463773:
                                if (!str2.equals(A0B(838, 4, 81))) {
                                    b2 = -1;
                                } else {
                                    b2 = 96;
                                }
                                break;
                            case 2464648:
                                if (!str2.equals(A0B(847, 4, 120))) {
                                    b2 = -1;
                                } else {
                                    b2 = 98;
                                }
                                break;
                            case 2689555:
                                if (!str2.equals(A0B(1133, 4, 107))) {
                                    b2 = -1;
                                } else {
                                    b2 = 122;
                                }
                                break;
                            case 3154429:
                                if (!str2.equals(A0B(1296, 4, 97))) {
                                    b2 = -1;
                                } else {
                                    b2 = 39;
                                }
                                break;
                            case 3284551:
                                if (!str2.equals(A0B(1376, 4, 112))) {
                                    b2 = -1;
                                } else {
                                    b2 = 64;
                                }
                                break;
                            case 3351335:
                                if (!str2.equals(A0B(1458, 4, 1))) {
                                    b2 = -1;
                                } else {
                                    b2 = 73;
                                }
                                break;
                            case 3386211:
                                if (!str2.equals(A0B(1482, 4, 33))) {
                                    b2 = -1;
                                } else {
                                    b2 = 80;
                                }
                                break;
                            case 41325051:
                                if (!str2.equals(A0B(671, 8, 103))) {
                                    b2 = -1;
                                } else {
                                    b2 = 71;
                                }
                                break;
                            case 55178625:
                                if (!str2.equals(A0B(Input.Keys.NUMPAD_ENTER, 11, 49))) {
                                    b2 = -1;
                                } else {
                                    b2 = cw.k;
                                }
                                break;
                            case 61542055:
                                if (!str2.equals(A0B(26, 5, 19))) {
                                    b2 = -1;
                                } else {
                                    b2 = 5;
                                }
                                break;
                            case 65355429:
                                if (!str2.equals(A0B(287, 5, 79))) {
                                    b2 = -1;
                                } else {
                                    b2 = 25;
                                }
                                break;
                            case 66214468:
                                if (!str2.equals(A0B(345, 5, 74))) {
                                    b2 = -1;
                                } else {
                                    b2 = 31;
                                }
                                break;
                            case 66214470:
                                if (!str2.equals(A0B(350, 5, 46))) {
                                    b2 = -1;
                                } else {
                                    b2 = 32;
                                }
                                break;
                            case 66214473:
                                if (!str2.equals(A0B(355, 5, 70))) {
                                    b2 = -1;
                                } else {
                                    b2 = 33;
                                }
                                break;
                            case 66215429:
                                if (!str2.equals(A0B(360, 5, 96))) {
                                    b2 = -1;
                                } else {
                                    b2 = 34;
                                }
                                break;
                            case 66215431:
                                if (!str2.equals(A0B(365, 5, 88))) {
                                    b2 = -1;
                                } else {
                                    b2 = 35;
                                }
                                break;
                            case 66215433:
                                if (!str2.equals(A0B(370, 5, 56))) {
                                    b2 = -1;
                                } else {
                                    b2 = 36;
                                }
                                break;
                            case 66216390:
                                if (!str2.equals(A0B(375, 5, 52))) {
                                    b2 = -1;
                                } else {
                                    b2 = 37;
                                }
                                break;
                            case 76402249:
                                if (!str2.equals(A0B(798, 5, 84))) {
                                    b2 = -1;
                                } else {
                                    b2 = 95;
                                }
                                break;
                            case 76404105:
                                if (!str2.equals(A0B(842, 5, EnumC4719u30.PROTOBUF_SERIALIZATION_ERROR_VALUE))) {
                                    b2 = -1;
                                } else {
                                    b2 = 97;
                                }
                                break;
                            case 76404911:
                                if (!str2.equals(A0B(851, 5, 28))) {
                                    b2 = -1;
                                } else {
                                    b2 = 99;
                                }
                                break;
                            case 80963634:
                                if (!str2.equals(A0B(1116, 5, 105))) {
                                    b2 = -1;
                                } else {
                                    b2 = 114;
                                }
                                break;
                            case 82882791:
                                if (!str2.equals(A0B(1128, 5, 103))) {
                                    b2 = -1;
                                } else {
                                    b2 = 121;
                                }
                                break;
                            case 98715550:
                                if (!str2.equals(A0B(1334, 5, 33))) {
                                    b2 = -1;
                                } else {
                                    b2 = 56;
                                }
                                break;
                            case 101370885:
                                if (!str2.equals(A0B(1380, 5, 103))) {
                                    b2 = -1;
                                } else {
                                    b2 = 65;
                                }
                                break;
                            case 102844228:
                                if (!str2.equals(A0B(1385, 5, 19))) {
                                    b2 = -1;
                                } else {
                                    b2 = 66;
                                }
                                break;
                            case 165221241:
                                if (!str2.equals(A0B(31, 8, 19))) {
                                    b2 = -1;
                                } else {
                                    b2 = 6;
                                }
                                break;
                            case 182191441:
                                if (!str2.equals(A0B(237, 9, 98))) {
                                    b2 = -1;
                                } else {
                                    b2 = 21;
                                }
                                break;
                            case 245388979:
                                if (!str2.equals(A0B(1415, 8, 5))) {
                                    b2 = -1;
                                } else {
                                    b2 = 70;
                                }
                                break;
                            case 287431619:
                                if (!str2.equals(A0B(1300, 7, 17))) {
                                    b2 = -1;
                                } else {
                                    b2 = 49;
                                }
                                break;
                            case 307593612:
                                if (!str2.equals(A0B(55, 8, 40))) {
                                    b2 = -1;
                                } else {
                                    b2 = 9;
                                }
                                break;
                            case 308517133:
                                if (!str2.equals(A0B(63, 8, 30))) {
                                    b2 = -1;
                                } else {
                                    b2 = 10;
                                }
                                break;
                            case 316215098:
                                if (!str2.equals(A0B(1037, 8, 120))) {
                                    b2 = -1;
                                } else {
                                    b2 = 108;
                                }
                                break;
                            case 316215116:
                                if (!str2.equals(A0B(1045, 8, 100))) {
                                    b2 = -1;
                                } else {
                                    b2 = 109;
                                }
                                break;
                            case 316246811:
                                if (!str2.equals(A0B(1053, 8, 12))) {
                                    b2 = -1;
                                } else {
                                    b2 = 110;
                                }
                                break;
                            case 316246818:
                                if (!str2.equals(A0B(1061, 8, 105))) {
                                    b2 = -1;
                                } else {
                                    b2 = 111;
                                }
                                break;
                            case 407160593:
                                if (!str2.equals(A0B(827, 11, 13))) {
                                    b2 = -1;
                                } else {
                                    b2 = 93;
                                }
                                break;
                            case 507412548:
                                if (!str2.equals(A0B(858, 8, 55))) {
                                    b2 = -1;
                                } else {
                                    b2 = 101;
                                }
                                break;
                            case 793982701:
                                if (!str2.equals(A0B(465, 14, 77))) {
                                    b2 = -1;
                                } else {
                                    b2 = 46;
                                }
                                break;
                            case 794038622:
                                if (!str2.equals(A0B(479, 14, 11))) {
                                    b2 = -1;
                                } else {
                                    b2 = 47;
                                }
                                break;
                            case 794040393:
                                if (!str2.equals(A0B(493, 14, 1))) {
                                    b2 = -1;
                                } else {
                                    b2 = 48;
                                }
                                break;
                            case 835649806:
                                if (!str2.equals(A0B(1408, 7, 44))) {
                                    b2 = -1;
                                } else {
                                    b2 = 69;
                                }
                                break;
                            case 917340916:
                                if (!str2.equals(A0B(46, 9, 81))) {
                                    b2 = -1;
                                } else {
                                    b2 = 8;
                                }
                                break;
                            case 958008161:
                                if (!str2.equals(A0B(1367, 9, 74))) {
                                    b2 = -1;
                                } else {
                                    b2 = 61;
                                }
                                break;
                            case 1060579533:
                                if (!str2.equals(A0B(1486, 8, 97))) {
                                    b2 = -1;
                                } else {
                                    b2 = 83;
                                }
                                break;
                            case 1150207623:
                                if (!str2.equals(A0B(624, 7, 121))) {
                                    b2 = -1;
                                } else {
                                    b2 = 67;
                                }
                                break;
                            case 1176899427:
                                if (!str2.equals(A0B(1359, 8, 21))) {
                                    b2 = -1;
                                } else {
                                    b2 = 60;
                                }
                                break;
                            case 1280332038:
                                if (!str2.equals(A0B(1327, 7, 43))) {
                                    b2 = -1;
                                } else {
                                    b2 = 51;
                                }
                                break;
                            case 1306947716:
                                if (!str2.equals(A0B(335, 10, 81))) {
                                    b2 = -1;
                                } else {
                                    b2 = 30;
                                }
                                break;
                            case 1349174697:
                                if (!str2.equals(A0B(1313, 14, 16))) {
                                    b2 = -1;
                                } else {
                                    b2 = 50;
                                }
                                break;
                            case 1522194893:
                                if (!str2.equals(A0B(1760, 7, 69))) {
                                    b2 = -1;
                                } else {
                                    b2 = 119;
                                }
                                break;
                            case 1691543273:
                                if (!str2.equals(A0B(230, 7, 69))) {
                                    b2 = -1;
                                } else {
                                    b2 = 20;
                                }
                                break;
                            case 1709443163:
                                if (!str2.equals(A0B(1339, 14, 56))) {
                                    b2 = -1;
                                } else {
                                    b2 = 57;
                                }
                                break;
                            case 1865889110:
                                if (!str2.equals(A0B(1572, 7, 45))) {
                                    b2 = -1;
                                } else {
                                    b2 = 103;
                                }
                                break;
                            case 1906253259:
                                if (!str2.equals(A0B(GL20.GL_ONE_MINUS_SRC_COLOR, 8, 120))) {
                                    b2 = -1;
                                } else {
                                    b2 = 87;
                                }
                                break;
                            case 1977196784:
                                if (!str2.equals(A0B(582, 12, 20))) {
                                    b2 = -1;
                                } else {
                                    b2 = 58;
                                }
                                break;
                            case 2006372676:
                                if (!str2.equals(A0B(204, 14, 69))) {
                                    b2 = -1;
                                } else {
                                    b2 = cw.n;
                                }
                                break;
                            case 2029784656:
                                if (!str2.equals(A0B(549, 7, 111))) {
                                    b2 = -1;
                                } else {
                                    b2 = 52;
                                }
                                break;
                            case 2030379515:
                                if (!str2.equals(A0B(556, 7, 70))) {
                                    b2 = -1;
                                } else {
                                    b2 = 53;
                                }
                                break;
                            case 2033393791:
                                if (!str2.equals(A0B(111, 12, 62))) {
                                    b2 = -1;
                                } else {
                                    b2 = 12;
                                }
                                break;
                            case 2047190025:
                                if (!str2.equals(A0B(304, 10, 42))) {
                                    b2 = -1;
                                }
                                break;
                            case 2047252157:
                                if (!str2.equals(A0B(314, 10, 18))) {
                                    b2 = -1;
                                } else {
                                    b2 = 28;
                                }
                                break;
                            case 2048319463:
                                if (!str2.equals(A0B(568, 7, 81))) {
                                    b2 = -1;
                                } else {
                                    b2 = 54;
                                }
                                break;
                            case 2048855701:
                                if (!str2.equals(A0B(575, 7, 95))) {
                                    b2 = -1;
                                } else {
                                    b2 = 55;
                                }
                                break;
                            default:
                                b2 = -1;
                                break;
                        }
                        switch (b2) {
                            case 0:
                            case 1:
                            case 2:
                            case 3:
                            case 4:
                            case 5:
                            case 6:
                            case 7:
                            case 8:
                            case 9:
                            case 10:
                            case 11:
                            case 12:
                            case 13:
                            case 14:
                            case 15:
                            case 16:
                            case 17:
                            case 18:
                            case 19:
                            case 20:
                            case 21:
                            case 22:
                            case 23:
                            case 24:
                            case 25:
                            case 26:
                            case 27:
                            case 28:
                            case 29:
                            case 30:
                            case 31:
                            case 32:
                            case 33:
                            case 34:
                            case 35:
                            case 36:
                            case 37:
                            case 38:
                            case 39:
                            case 40:
                            case 41:
                            case 42:
                            case 43:
                            case 44:
                            case 45:
                            case 46:
                            case 47:
                            case 48:
                            case 49:
                            case 50:
                            case 51:
                            case 52:
                            case 53:
                            case 54:
                            case 55:
                            case Input.Keys.PERIOD /* 56 */:
                            case Input.Keys.ALT_LEFT /* 57 */:
                            case Input.Keys.ALT_RIGHT /* 58 */:
                            case Input.Keys.SHIFT_LEFT /* 59 */:
                            case 60:
                            case Input.Keys.TAB /* 61 */:
                            case Input.Keys.SPACE /* 62 */:
                            case 63:
                            case 64:
                            case 65:
                            case 66:
                            case 67:
                            case Input.Keys.GRAVE /* 68 */:
                            case Input.Keys.MINUS /* 69 */:
                            case Input.Keys.EQUALS /* 70 */:
                            case Input.Keys.LEFT_BRACKET /* 71 */:
                            case Input.Keys.RIGHT_BRACKET /* 72 */:
                            case Input.Keys.BACKSLASH /* 73 */:
                            case Input.Keys.SEMICOLON /* 74 */:
                            case Input.Keys.APOSTROPHE /* 75 */:
                            case Input.Keys.SLASH /* 76 */:
                            case Input.Keys.AT /* 77 */:
                            case Input.Keys.NUM /* 78 */:
                            case Input.Keys.HEADSETHOOK /* 79 */:
                            case Input.Keys.FOCUS /* 80 */:
                            case Input.Keys.PLUS /* 81 */:
                            case Input.Keys.MENU /* 82 */:
                            case Input.Keys.NOTIFICATION /* 83 */:
                            case Input.Keys.SEARCH /* 84 */:
                            case Input.Keys.MEDIA_PLAY_PAUSE /* 85 */:
                            case Input.Keys.MEDIA_STOP /* 86 */:
                            case Input.Keys.MEDIA_NEXT /* 87 */:
                            case Input.Keys.MEDIA_PREVIOUS /* 88 */:
                            case 89:
                            case Input.Keys.MEDIA_FAST_FORWARD /* 90 */:
                            case Input.Keys.MUTE /* 91 */:
                            case 92:
                            case Input.Keys.PAGE_DOWN /* 93 */:
                            case 94:
                            case Input.Keys.SWITCH_CHARSET /* 95 */:
                            case Input.Keys.BUTTON_A /* 96 */:
                            case Input.Keys.BUTTON_B /* 97 */:
                            case Input.Keys.BUTTON_C /* 98 */:
                            case Input.Keys.BUTTON_X /* 99 */:
                            case 100:
                            case 101:
                            case 102:
                            case 103:
                            case 104:
                            case 105:
                            case 106:
                            case 107:
                            case 108:
                            case 109:
                            case 110:
                            case 111:
                            case 112:
                            case 113:
                            case 114:
                            case 115:
                            case 116:
                            case ASSET_FAILED_STATUS_CODE_VALUE:
                            case PROTOBUF_SERIALIZATION_ERROR_VALUE:
                            case JSON_ENCODE_ERROR_VALUE:
                            case 120:
                            case 121:
                            case 122:
                            case 123:
                            case 124:
                            case INVALID_METRICS_ENDPOINT_VALUE:
                                A0y = true;
                                break;
                        }
                        String str3 = AbstractC1600gE.A06;
                        switch (str3.hashCode()) {
                            case -2038157993:
                                if (!str3.equals(A0B(877, 12, 31))) {
                                    b = -1;
                                } else {
                                    b = 8;
                                }
                                break;
                            case -2038157992:
                                if (!str3.equals(A0B(889, 12, 112))) {
                                    b = -1;
                                } else {
                                    b = 5;
                                }
                                break;
                            case -1984447159:
                                if (!str3.equals(A0B(719, 6, 4))) {
                                    b = -1;
                                } else {
                                    b = cw.m;
                                }
                                break;
                            case -1458559768:
                                if (!str3.equals(A0B(TypedValues.TransitionType.TYPE_INTERPOLATOR, 14, 12))) {
                                    b = -1;
                                } else {
                                    b = cw.n;
                                }
                                break;
                            case -1337484257:
                                if (!str3.equals(A0B(Input.Keys.NUMPAD_4, 12, 103))) {
                                    b = -1;
                                } else {
                                    b = 20;
                                }
                                break;
                            case -1152053872:
                                if (!str3.equals(A0B(998, 8, 80))) {
                                    b = -1;
                                } else {
                                    b = 19;
                                }
                                break;
                            case -1147076792:
                                if (!str3.equals(A0B(631, 15, 73))) {
                                    b = -1;
                                } else {
                                    b = 17;
                                }
                                break;
                            case -708142633:
                                if (!str3.equals(A0B(869, 8, 114))) {
                                    b = -1;
                                } else {
                                    b = 18;
                                }
                                break;
                            case -594534941:
                                if (!str3.equals(A0B(597, 7, 100))) {
                                    b = -1;
                                } else {
                                    b = 2;
                                }
                                break;
                            case -581948979:
                                if (!str3.equals(A0B(1401, 7, 121))) {
                                    b = -1;
                                } else {
                                    b = 11;
                                }
                                break;
                            case -401692983:
                                if (!str3.equals(A0B(964, 8, 46))) {
                                    b = -1;
                                } else {
                                    b = 23;
                                }
                                break;
                            case -399133966:
                                if (!str3.equals(A0B(981, 8, 113))) {
                                    b = -1;
                                } else {
                                    b = 7;
                                }
                                break;
                            case -154985182:
                                if (!str3.equals(A0B(123, 15, 25))) {
                                    b = -1;
                                } else {
                                    b = 9;
                                }
                                break;
                            case 2006354:
                                if (!str3.equals(A0B(71, 4, 105))) {
                                    b = -1;
                                }
                                break;
                            case 2006367:
                                if (!str3.equals(A0B(75, 4, EnumC4719u30.INVALID_METRICS_ENDPOINT_VALUE))) {
                                    b = -1;
                                } else {
                                    b = 1;
                                }
                                break;
                            case 81951059:
                                if (!str3.equals(A0B(1123, 5, 116))) {
                                    b = -1;
                                } else {
                                    b = 24;
                                }
                                break;
                            case 439365079:
                                if (!str3.equals(A0B(535, 14, 32))) {
                                    b = -1;
                                } else {
                                    b = 22;
                                }
                                break;
                            case 511748841:
                                if (!str3.equals(A0B(972, 9, 52))) {
                                    b = -1;
                                } else {
                                    b = 12;
                                }
                                break;
                            case 619782645:
                                if (!str3.equals(A0B(89, 11, 75))) {
                                    b = -1;
                                } else {
                                    b = 4;
                                }
                                break;
                            case 619782647:
                                if (!str3.equals(A0B(100, 11, 82))) {
                                    b = -1;
                                } else {
                                    b = 21;
                                }
                                break;
                            case 632760191:
                                if (!str3.equals(A0B(989, 9, 85))) {
                                    b = -1;
                                } else {
                                    b = 25;
                                }
                                break;
                            case 807317112:
                                if (!str3.equals(A0B(TypedValues.MotionType.TYPE_QUANTIZE_MOTIONSTEPS, 7, 75))) {
                                    b = -1;
                                } else {
                                    b = cw.l;
                                }
                                break;
                            case 807374834:
                                if (!str3.equals(A0B(617, 7, 104))) {
                                    b = -1;
                                } else {
                                    b = 6;
                                }
                                break;
                            case 1070811680:
                                if (!str3.equals(A0B(646, 13, 19))) {
                                    b = -1;
                                } else {
                                    b = cw.k;
                                }
                                break;
                            case 1682560972:
                                if (!str3.equals(A0B(79, 10, 42))) {
                                    b = -1;
                                } else {
                                    b = 3;
                                }
                                break;
                            case 1921424370:
                                if (!str3.equals(A0B(1024, 13, 38))) {
                                    b = -1;
                                } else {
                                    b = 26;
                                }
                                break;
                            case 2133907258:
                                if (!str3.equals(A0B(659, 9, 96))) {
                                    b = -1;
                                } else {
                                    b = 10;
                                }
                                break;
                            default:
                                b = -1;
                                break;
                        }
                        switch (b) {
                            case 0:
                            case 1:
                            case 2:
                                A0y = true;
                                break;
                            case 3:
                            case 4:
                            case 5:
                            case 6:
                            case 7:
                            case 8:
                            case 9:
                            case 10:
                            case 11:
                            case 12:
                            case 13:
                            case 14:
                            case 15:
                            case 16:
                            case 17:
                            case 18:
                            case 19:
                            case 20:
                            case 21:
                            case 22:
                            case 23:
                            case 24:
                            case 25:
                            case 26:
                                A0y = true;
                                break;
                        }
                    }
                }
                A0z = true;
            }
        }
        return A0y;
    }

    public static boolean A0v(boolean z, ZM zm, ZM zm2) {
        return zm.A0W.equals(zm2.A0W) && zm.A0F == zm2.A0F && (z || (zm.A0L == zm2.A0L && zm.A0A == zm2.A0A)) && AbstractC1600gE.A1E(zm.A0N, zm2.A0N);
    }

    @Override // com.facebook.ads.redexgen.core.AnonymousClass10, com.facebook.ads.redexgen.core.AbstractC0697Et
    public final void A1X() {
        super.A1X();
        this.A09 = 0;
        this.A0A = 0;
        this.A0B = 0;
        this.A0J = SystemClock.elapsedRealtime();
        this.A0P = SystemClock.elapsedRealtime() * 1000;
        if (this.A0v) {
            this.A0r.A0D();
        }
    }

    @Override // com.facebook.ads.redexgen.core.AnonymousClass10, com.facebook.ads.redexgen.core.AbstractC0697Et
    public final void A1Y() {
        this.A0M = C.TIME_UNSET;
        A0J();
        A0H();
        if (this.A0v) {
            this.A0r.A0E();
        }
        super.A1Y();
    }

    @Override // com.facebook.ads.redexgen.core.AnonymousClass10, com.facebook.ads.redexgen.core.AbstractC0697Et
    public final void A1Z() {
        this.A08 = -1;
        this.A06 = -1;
        this.A01 = -1.0f;
        this.A02 = -1.0f;
        this.A0R = C.TIME_UNSET;
        this.A0O = C.TIME_UNSET;
        this.A0C = 0;
        A0F();
        A0E();
        this.A0s.A08();
        this.A00 = null;
        this.A0j = false;
        this.A0A = 0;
        this.A0B = 0;
        A0G();
        try {
            super.A1Z();
        } finally {
            super.A0i.A02();
            this.A0t.A05(super.A0i);
        }
    }

    @Override // com.facebook.ads.redexgen.core.AnonymousClass10, com.facebook.ads.redexgen.core.AbstractC0697Et
    public final void A1a(long j, boolean z) throws EK {
        super.A1a(j, z);
        if (this.A0q.A0G()) {
            this.A0q.A09();
            throw null;
        }
        A0E();
        if (this.A0v) {
            C1634gn c1634gn = this.A0r;
            if (A11[0].charAt(18) == 'P') {
                throw new RuntimeException();
            }
            A11[0] = "I0UybRzxhz05UsWfQTuk5Ctxl58niJiW";
            c1634gn.A0C();
        }
        this.A0N = C.TIME_UNSET;
        this.A0L = C.TIME_UNSET;
        this.A0O = C.TIME_UNSET;
        this.A0A = 0;
        this.A0B = 0;
        if (this.A0C != 0) {
            this.A0R = this.A0w[this.A0C - 1];
            this.A0C = 0;
        }
        if (z) {
            A0N();
        } else {
            this.A0M = C.TIME_UNSET;
        }
        A0H();
    }

    @Override // com.facebook.ads.redexgen.core.AnonymousClass10, com.facebook.ads.redexgen.core.AbstractC0697Et
    public final void A1b(boolean z, boolean z2) throws EK {
        super.A1b(z, z2);
        this.A0j = A1V().A00;
        this.A0t.A06(super.A0i);
        this.A0s.A09();
        this.A0g = z2;
        this.A0i = false;
    }

    @Override // com.facebook.ads.redexgen.core.AnonymousClass10, com.facebook.ads.redexgen.core.AbstractC0697Et
    public final void A1c(ZM[] zmArr, long j, long j2) throws EK {
        if (this.A0R == C.TIME_UNSET) {
            this.A0R = j2;
        } else {
            if (this.A0C == this.A0w.length) {
                AbstractC1561fb.A07(A0B(682, 23, 48), A0B(1069, 45, 59) + this.A0w[this.A0C - 1]);
            } else {
                this.A0C++;
            }
            this.A0w[this.A0C - 1] = j2;
            this.A0x[this.A0C - 1] = this.A0O;
        }
        super.A1c(zmArr, j, j2);
    }

    @Override // com.facebook.ads.redexgen.core.AnonymousClass10
    public final int A1g(InterfaceC1197Yz interfaceC1197Yz, Z2 z2, ZM zm, ZM zm2) {
        if (MJ.A04(this.A11, zm.A0L, zm.A0A, zm2.A0L, zm2.A0A)) {
            return 0;
        }
        if (A21() && zm.A0W.equals(zm2.A0W) && zm.A0F == zm2.A0F) {
            return 1;
        }
        if (!A0v(z2.A04, zm, zm2) || zm2.A0L > this.A0W.A02 || zm2.A0A > this.A0W.A00 || A00(zm2) > this.A0W.A01) {
            return 0;
        }
        return zm.A0A(zm2) ? 1 : 3;
    }

    @Override // com.facebook.ads.redexgen.core.AnonymousClass10
    public final int A1h(ZS zs, TO to, ZM zm) throws ZW {
        if (!A24(zm)) {
            return A01(zs, zm, super.A0l);
        }
        if (A11[0].charAt(18) == 'P') {
            throw new RuntimeException();
        }
        A11[5] = "QcszUsFUXpe8IYOI3eCl5U0UDPLgDPye";
        return 20;
    }

    @Override // com.facebook.ads.redexgen.core.AnonymousClass10
    public final List<Z2> A1l(ZS zs, ZM zm, boolean z) throws ZW {
        return A0D(zs, zm, z);
    }

    @Override // com.facebook.ads.redexgen.core.AnonymousClass10
    public final void A1m() throws EK {
        super.A1m();
        this.A04 = 0;
    }

    @Override // com.facebook.ads.redexgen.core.AnonymousClass10
    public final void A1n() {
        try {
            super.A1n();
            this.A04 = 0;
            if (this.A0T != null) {
                if (this.A0U == this.A0T) {
                    this.A0U = null;
                }
                this.A0T.release();
                this.A0T = null;
            }
        } catch (Throwable th) {
            this.A04 = 0;
            Surface surface = this.A0T;
            String[] strArr = A11;
            if (strArr[2].charAt(5) != strArr[3].charAt(5)) {
                throw new RuntimeException();
            }
            A11[5] = "ynWAHKdve9ZDybWNqkJILMjZXiEG9saW";
            if (surface != null) {
                if (this.A0U == this.A0T) {
                    this.A0U = null;
                }
                this.A0T.release();
                this.A0T = null;
            }
            throw th;
        }
    }

    @Override // com.facebook.ads.redexgen.core.AnonymousClass10
    public final void A1q(long j) {
        super.A1q(j);
        this.A04--;
        while (this.A0C != 0 && j >= this.A0x[0]) {
            this.A0R = this.A0w[0];
            this.A0C--;
            System.arraycopy(this.A0w, 1, this.A0w, 0, this.A0C);
            System.arraycopy(this.A0x, 1, this.A0x, 0, this.A0C);
        }
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0031  */
    @Override // com.facebook.ads.redexgen.core.AnonymousClass10
    @MetaExoPlayerCustomization("for SR video effects support of MCM")
    public final void A1r(ZM zm) {
        boolean isSwitchingToDav1d;
        if (A24(zm)) {
            if (super.A0j != null) {
                if (A0B(1645, 10, 112).equals(super.A0j.A0W)) {
                    isSwitchingToDav1d = false;
                } else {
                    isSwitchingToDav1d = true;
                }
            } else {
                isSwitchingToDav1d = false;
            }
            if (isSwitchingToDav1d) {
                boolean isSwitchingToDav1d2 = this.A0q.A0G();
                if (isSwitchingToDav1d2) {
                    this.A0q.A0A();
                    throw null;
                }
            }
            this.A0q.A09 = false;
            return;
        }
        int iA00 = MetaExoPlayerUpgradeConfig.A00(EnumC0894Mo.A09);
        if (A11[7].length() == 5) {
            throw new RuntimeException();
        }
        String[] strArr = A11;
        strArr[2] = "P2ZlpY0ERgZFsQcqSCQjVSg49sFfTOj4";
        strArr[3] = "w0kmHYOrlImNL7pz6PvFVWIP0ajPyIAa";
        if (iA00 <= 0 || zm == null) {
            return;
        }
        int videoWidthToEnableSR = zm.A0L;
        if (videoWidthToEnableSR <= iA00) {
            return;
        }
        this.A0q.A09 = false;
    }

    @Override // com.facebook.ads.redexgen.core.AnonymousClass10
    public final void A1s(ZM zm) throws EK {
        super.A1s(zm);
        this.A0t.A09(zm, null);
        this.A02 = zm.A02;
        this.A0D = zm.A0F;
    }

    @Override // com.facebook.ads.redexgen.core.AnonymousClass10
    public final void A1t(ZM zm) throws EK {
        if (!this.A0q.A0G()) {
            this.A0q.A0J(zm, A1i());
        }
    }

    @Override // com.facebook.ads.redexgen.core.AnonymousClass10
    public final void A1u(C1143Ww c1143Ww) {
        this.A04++;
        this.A0O = Math.max(c1143Ww.A01, this.A0O);
        if (AbstractC1600gE.A02 < 23 && this.A0j) {
            A27();
        }
    }

    /* JADX WARN: Code duplicated, block: B:40:0x0154  */
    @Override // com.facebook.ads.redexgen.core.AnonymousClass10
    public final void A1v(InterfaceC1197Yz interfaceC1197Yz, MediaFormat mediaFormat) {
        boolean z;
        int integer;
        int integer2;
        this.A0S = mediaFormat;
        String strA0B = A0B(1229, 10, 63);
        boolean zContainsKey = mediaFormat.containsKey(strA0B);
        String strA0B2 = A0B(1239, 8, 62);
        String strA0B3 = A0B(1209, 11, 8);
        String strA0B4 = A0B(1220, 9, 11);
        if (zContainsKey && mediaFormat.containsKey(strA0B4) && mediaFormat.containsKey(strA0B3)) {
            boolean zContainsKey2 = mediaFormat.containsKey(strA0B2);
            if (A11[5].charAt(17) == 'C') {
                throw new RuntimeException();
            }
            A11[0] = "SPyuRqGkocAlx5j1Uol0KSkVqvEZfTIA";
            if (zContainsKey2) {
                z = true;
            } else {
                z = false;
            }
        } else {
            z = false;
        }
        if (z) {
            int integer3 = mediaFormat.getInteger(strA0B);
            int unappliedRotationDegrees = mediaFormat.getInteger(strA0B4);
            integer = (integer3 - unappliedRotationDegrees) + 1;
        } else if (A11[7].length() != 5) {
            A11[0] = "epY1b0AmLotLh9xKkmgNPcmi6Tz4KCA7";
            integer = mediaFormat.getInteger(A0B(1755, 5, 48));
        } else {
            integer = mediaFormat.getInteger(A0B(1755, 5, 48));
        }
        this.A08 = integer;
        if (z) {
            int integer4 = mediaFormat.getInteger(strA0B3);
            int unappliedRotationDegrees2 = mediaFormat.getInteger(strA0B2);
            integer2 = (integer4 - unappliedRotationDegrees2) + 1;
        } else if (A11[0].charAt(18) != 'P') {
            A11[5] = "mIB4yCKfHLr0sw2vI5bBjij9lrNSXhcv";
            integer2 = mediaFormat.getInteger(A0B(1307, 6, 19));
        } else {
            integer2 = mediaFormat.getInteger(A0B(1307, 6, 19));
        }
        this.A06 = integer2;
        this.A01 = this.A02;
        if (AbstractC1600gE.A02 >= 21) {
            if (this.A0D == 90 || this.A0D == 270) {
                int rotatedHeight = this.A08;
                int unappliedRotationDegrees3 = this.A06;
                this.A08 = unappliedRotationDegrees3;
                this.A06 = rotatedHeight;
                this.A01 = 1.0f / this.A01;
            }
        } else if (!this.A0q.A0G()) {
            int unappliedRotationDegrees4 = this.A0D;
            this.A07 = unappliedRotationDegrees4;
        }
        int unappliedRotationDegrees5 = this.A0H;
        interfaceC1197Yz.AIy(unappliedRotationDegrees5);
        this.A0V = new Y2(this.A08, this.A06, this.A07, this.A01);
        this.A0r.A0F(super.A0j.A01);
        if (this.A0q.A0G()) {
            C1615gU c1615gU = this.A0q;
            P5 p5A07 = super.A0j.A07();
            int unappliedRotationDegrees6 = this.A08;
            P5 p5A0r = p5A07.A0r(unappliedRotationDegrees6);
            int unappliedRotationDegrees7 = this.A06;
            P5 p5A0f = p5A0r.A0f(unappliedRotationDegrees7);
            int unappliedRotationDegrees8 = this.A07;
            c1615gU.A0D(p5A0f.A0l(unappliedRotationDegrees8).A0Y(this.A01).A14());
            throw null;
        }
    }

    @Override // com.facebook.ads.redexgen.core.AnonymousClass10
    @MetaExoPlayerCustomizations({@MetaExoPlayerCustomization("D40834768: [FBLite][Video] Enable low latency decoding for older Android versions"), @MetaExoPlayerCustomization(type = {"TEMPORARY"}, value = "Google Platform Dav1d Testing with Low Latency Decoding D62649046")})
    public final void A1w(Z2 z2, InterfaceC1197Yz interfaceC1197Yz, ZM zm, MediaCrypto mediaCrypto) throws ZW {
        this.A0W = A0A(z2, zm, A1e());
        MediaFormat mediaFormatA08 = A08(zm, this.A0W, this.A0u, this.A0n);
        if (this.A0U == null) {
            AbstractC1517es.A08(A0r(z2));
            if (this.A0T == null) {
                this.A0T = DummySurface.A01(this.A0p, z2.A06);
            }
            Surface surface = this.A0T;
            if (A11[7].length() == 5) {
                throw new RuntimeException();
            }
            String[] strArr = A11;
            strArr[2] = "eTG1JY0Z0f8x3UejYi9ifF0jnc0dhtvD";
            strArr[3] = "VakliYhQ2UnOyXBlYXsFKcpxhQDYHw32";
            this.A0U = surface;
        }
        boolean z = this.A11.A0H;
        boolean z3 = false;
        String strA0B = A0B(1390, 11, 83);
        boolean z4 = z && z2.A00 != null && z2.A00.isFeatureSupported(strA0B);
        if (z2.A03.equals(A0B(1181, 28, 84))) {
            C0889Mg c0889Mg = this.A11;
            if (A11[0].charAt(18) == 'P') {
                throw new RuntimeException();
            }
            A11[7] = "KYkpr8EtMuI1xIjXVcRBgqNn";
            if (c0889Mg.A09) {
                z3 = true;
            }
        }
        if ((AbstractC1600gE.A02 >= 30 || this.A11.A0I) && z4 && !z3) {
            mediaFormatA08.setFeatureEnabled(strA0B, true);
            if (A11[0].charAt(18) == 'P') {
                throw new RuntimeException();
            }
            String[] strArr2 = A11;
            strArr2[6] = "roSUikaxP4Y8yp0";
            strArr2[4] = "Aub9OVfL4jB7ssjAF";
            mediaFormatA08.setInteger(strA0B, 1);
        }
        if (this.A0q.A0G()) {
            mediaFormatA08 = this.A0q.A06(mediaFormatA08);
        }
        if (this.A0q.A0G()) {
            this.A0q.A07();
            throw null;
        }
        interfaceC1197Yz.A4y(mediaFormatA08, this.A0U, mediaCrypto, 0, this.A0Y);
        int i = AbstractC1600gE.A02;
        if (A11[1].charAt(9) == 'z') {
            String[] strArr3 = A11;
            strArr3[6] = "VlR5SpAC9c46PUq";
            strArr3[4] = "qqt2lYC69MTWVt7g5";
            if (i < 23) {
                return;
            }
        } else if (i < 23) {
            return;
        }
        if (this.A0j) {
            this.A00 = new C0948Ox(this, interfaceC1197Yz);
        }
    }

    @Override // com.facebook.ads.redexgen.core.AnonymousClass10
    @MetaExoPlayerCustomization("D45988204: [FBLite][Video] Add Codec Hooks for Logging")
    public final void A1x(String str) {
        this.A0t.A0F(str);
    }

    @Override // com.facebook.ads.redexgen.core.AnonymousClass10
    public final void A1y(String str, long j, long j2) {
        this.A0t.A0G(str, j, j2);
        this.A0b = A0u(str);
        if (this.A0v) {
            this.A0q.A0E(str);
        }
    }

    @Override // com.facebook.ads.redexgen.core.AnonymousClass10
    @MetaExoPlayerCustomization(type = {"TEMPORARY"}, value = "D60404164: Merge init calls in the renderer")
    public final void A1z(String str, ZM zm) throws EK {
        this.A0t.A0F(str);
        if (!this.A0q.A0G()) {
            this.A0q.A0J(zm, A1i());
        }
    }

    @Override // com.facebook.ads.redexgen.core.AnonymousClass10
    public final boolean A20() {
        return this.A0a && SystemClock.elapsedRealtime() - this.A0Q < 500;
    }

    @Override // com.facebook.ads.redexgen.core.AnonymousClass10
    public final boolean A22() {
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x0202, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x0209, code lost:
    
        if (r31.A0q.A0G() == false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x020b, code lost:
    
        r31.A0q.A0B(r32, r34);
        r31.A0q.A0K(r31.A0j, r0, r43);
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x021a, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x021d, code lost:
    
        if (com.facebook.ads.redexgen.core.AbstractC1600gE.A02 < r11) goto L123;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x0224, code lost:
    
        if (r6 >= com.unity3d.services.core.di.ServiceProvider.SCAR_SIGNALS_FETCH_TIMEOUT) goto L139;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x0228, code lost:
    
        A0a(r24, r38, r0, r16);
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x022f, code lost:
    
        r31.A0K = com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x0237, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x0238, code lost:
    
        r3 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x0239, code lost:
    
        r2 = com.facebook.ads.redexgen.core.C0T.A11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x024a, code lost:
    
        if (r2[2].charAt(5) != r2[3].charAt(5)) goto L116;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x0250, code lost:
    
        if (A0g() != false) goto L118;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x0252, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x0253, code lost:
    
        r2 = com.facebook.ads.redexgen.core.C0T.A11;
        r2[2] = "8NvNAYpc0BoPNabeyDwODwJqz8UEKgP7";
        r2[3] = "yftWtYHfYXRkx0qg1LFYnmo7iQbYy25Y";
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x0263, code lost:
    
        if (A0g() != false) goto L118;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x0266, code lost:
    
        throw r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x0270, code lost:
    
        if (r6 >= androidx.work.WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS) goto L139;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x0276, code lost:
    
        if (r6 <= 11000) goto L145;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x027b, code lost:
    
        java.lang.Thread.sleep((r6 - androidx.work.WorkRequest.MIN_BACKOFF_MILLIS) / 1000);
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x0281, code lost:
    
        java.lang.Thread.currentThread().interrupt();
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x0288, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x0289, code lost:
    
        A0X(r24, r38, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x028e, code lost:
    
        r31.A0K = com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET;
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x0291, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x0292, code lost:
    
        r1 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x0297, code lost:
    
        if (A0g() != false) goto L137;
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x0299, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x029a, code lost:
    
        throw r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x029b, code lost:
    
        r2 = r40 - r32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x02a4, code lost:
    
        if (r31.A0j.A01 == (-1.0f)) goto L144;
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x02a6, code lost:
    
        r0 = r31.A0j.A01;
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x02aa, code lost:
    
        A0R(r32, r2, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x02b2, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x02b3, code lost:
    
        r0 = 30.0f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00b4, code lost:
    
        if (r12 != false) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00b6, code lost:
    
        r7 = 21;
        r2 = com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00dc, code lost:
    
        if (r12 != false) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0160, code lost:
    
        if (r32 == r9) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x016c, code lost:
    
        if (r32 == r9) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x016f, code lost:
    
        r6 = r6 - (r15 - r34);
        r18 = java.lang.System.nanoTime();
        r11 = r18 + (r6 * 1000);
        r15 = com.facebook.ads.redexgen.core.C0T.A11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0192, code lost:
    
        if (r15[2].charAt(5) == r15[3].charAt(5)) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0199, code lost:
    
        throw new java.lang.RuntimeException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x019a, code lost:
    
        com.facebook.ads.redexgen.core.C0T.A11[1] = "mX3HKsb00zQ0Yr0eh5Uruiqbpk7IBAqe";
        r16 = r31.A0s.A07(r40, r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x01ad, code lost:
    
        if (r31.A0q.A0G() != false) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x01af, code lost:
    
        r6 = (r16 - r18) / 1000;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x01b3, code lost:
    
        r15 = A0n(r6, r34);
        r14 = com.facebook.ads.redexgen.core.C0T.A11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x01c7, code lost:
    
        if (r14[6].length() == r14[4].length()) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x01c9, code lost:
    
        com.facebook.ads.redexgen.core.C0T.A11[0] = "4zdnle4o5j0FE7iP1bblazp6pRjlKfuq";
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x01d0, code lost:
    
        if (r15 == false) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x01d2, code lost:
    
        r11 = 21;
        r24 = r24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x01e2, code lost:
    
        if (A0q(r24, r38, r0, r32) == false) goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x01e4, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x01e5, code lost:
    
        r14 = com.facebook.ads.redexgen.core.C0T.A11;
        r14[6] = "pIP5j6ZBfwk5vry";
        r14[4] = "SYbytyslPAjChX5NL";
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x01f1, code lost:
    
        if (r15 == false) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x01f4, code lost:
    
        r11 = 21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x01fa, code lost:
    
        if (A0o(r6, r34) == false) goto L101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x01fc, code lost:
    
        A0W(r24, r38, r0);
     */
    @Override // com.facebook.ads.redexgen.core.AnonymousClass10
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean A23(long r32, long r34, com.facebook.ads.redexgen.core.InterfaceC1197Yz r36, java.nio.ByteBuffer r37, int r38, int r39, long r40, boolean r42, boolean r43) throws com.facebook.ads.redexgen.core.EK {
        /*
            Method dump skipped, instruction units count: 694
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.core.C0T.A23(long, long, com.facebook.ads.redexgen.X.Yz, java.nio.ByteBuffer, int, int, long, boolean, boolean):boolean");
    }

    @Override // com.facebook.ads.redexgen.core.AnonymousClass10
    public final boolean A25(Z2 z2) {
        return (this.A0U != null && (this.A0Z || this.A0U.isValid())) || A0r(z2);
    }

    public final Pair<ColorInfo, ColorInfo> A26(ColorInfo colorInfo) {
        if (!ColorInfo.A09(colorInfo)) {
            return Pair.create(ColorInfo.A09, ColorInfo.A09);
        }
        if (colorInfo.A03 == 7) {
            return Pair.create(colorInfo, colorInfo.A0A().A02(6).A03());
        }
        return Pair.create(colorInfo, colorInfo);
    }

    public final void A27() {
        this.A0i = true;
        if (!this.A0h) {
            this.A0h = true;
            this.A0t.A0D(this.A0U);
        }
    }

    @MetaExoPlayerCustomization("Required for VideoProcessorManager migration")
    public final boolean A28(long j, long j2, boolean z) {
        return A0k(j) && !z;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC0697Et, com.facebook.ads.redexgen.core.QS
    public final void A9Y(int i, Object obj) throws EK {
        if (i == 1) {
            A0U((Surface) obj);
            return;
        }
        if (i == 4) {
            this.A0H = ((Integer) obj).intValue();
            InterfaceC1197Yz interfaceC1197YzA1j = A1j();
            if (interfaceC1197YzA1j == null) {
                return;
            }
            interfaceC1197YzA1j.AIy(this.A0H);
            return;
        }
        if (i == 7) {
            this.A0X = (InterfaceC1629gi) obj;
            return;
        }
        if (i == 10001) {
            A0f(obj);
            return;
        }
        if (i == 13) {
            this.A0q.A0F((List) AbstractC1517es.A01(obj));
            return;
        }
        String[] strArr = A11;
        if (strArr[6].length() == strArr[4].length()) {
            throw new RuntimeException();
        }
        A11[5] = "Jx05LvFPfjBDIELAnIFdUSoDRhvrfVls";
        if (i == 14) {
            C1583fx c1583fx = (C1583fx) AbstractC1517es.A01(obj);
            if (c1583fx.A03() == 0 || c1583fx.A02() == 0 || this.A0U == null) {
                return;
            }
            C1615gU c1615gU = this.A0q;
            String[] strArr2 = A11;
            if (strArr2[2].charAt(5) != strArr2[3].charAt(5)) {
                c1615gU.A0C(this.A0U, c1583fx);
                return;
            }
            String[] strArr3 = A11;
            strArr3[6] = "SvlqXFqKcpo7z8I";
            strArr3[4] = "Eg1jmv6OW92Zroxh5";
            c1615gU.A0C(this.A0U, c1583fx);
            return;
        }
        super.A9Y(i, obj);
    }

    @Override // com.facebook.ads.redexgen.core.AnonymousClass10, com.facebook.ads.redexgen.core.InterfaceC1188Yq
    public final boolean AAE() {
        boolean zAAE = super.AAE();
        boolean isEnded = this.A0q.A0G();
        if (isEnded) {
            boolean isEnded2 = this.A0q.A0I();
            return zAAE & isEnded2;
        }
        return zAAE;
    }

    @Override // com.facebook.ads.redexgen.core.AnonymousClass10, com.facebook.ads.redexgen.core.InterfaceC1188Yq
    @MetaExoPlayerCustomization("D18870411: Adding start stall debug reason")
    public final boolean AAT() {
        if (super.AAT() && !this.A0h && ((this.A0T == null || this.A0U != this.A0T) && A1j() != null && !this.A0j)) {
            ((AbstractC0697Et) this).A0B = MI.A08;
        }
        if (!super.AAT() || ((this.A0q.A0G() && !this.A0q.A0H()) || !(this.A0h || ((this.A0T != null && this.A0U == this.A0T) || A1j() == null || this.A0j)))) {
            if (this.A0M == C.TIME_UNSET) {
                return false;
            }
            if (SystemClock.elapsedRealtime() < this.A0M) {
                return true;
            }
            this.A0M = C.TIME_UNSET;
            return false;
        }
        this.A0M = C.TIME_UNSET;
        if (A11[5].charAt(17) == 'C') {
            throw new RuntimeException();
        }
        String[] strArr = A11;
        strArr[6] = "uTJdMB2Jd3DbzLm";
        strArr[4] = "Vh5Zhx5fq1hbkzod2";
        return true;
    }

    @Override // com.facebook.ads.redexgen.core.AnonymousClass10, com.facebook.ads.redexgen.core.InterfaceC1188Yq
    public final void AHd(long j, long j2) throws EK {
        super.AHd(j, j2);
        if (this.A0q.A0G()) {
            this.A0q.A0B(j, j2);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1188Yq, com.facebook.ads.redexgen.core.InterfaceC0983Qi
    public final String getName() {
        return A0B(682, 23, 48);
    }
}
