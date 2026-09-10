package com.facebook.ads.redexgen.core;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import com.badlogic.gdx.Input;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.EnumC4719u30;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Zb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1199Zb implements InterfaceC0987Qm {
    public static byte[] A05;
    public InterfaceC1381cf A00;
    public final int A01;
    public final long A02;
    public final Context A03;
    public final TO A04;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A05, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 20);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A05 = new byte[]{-124, -91, -90, -95, -75, -84, -76, -110, -91, -82, -92, -91, -78, -91, -78, -77, -122, -95, -93, -76, -81, -78, -71, -53, -8, -8, -11, -8, -90, -17, -12, -7, -6, -25, -12, -6, -17, -25, -6, -17, -12, -19, -90, -52, -52, -13, -10, -21, -19, -90, -21, -2, -6, -21, -12, -7, -17, -11, -12, -127, -82, -82, -85, -82, 92, -91, -86, -81, -80, -99, -86, -80, -91, -99, -80, -91, -86, -93, 92, -126, -120, 125, 127, 92, -95, -76, -80, -95, -86, -81, -91, -85, -86, 112, -99, -99, -102, -99, 75, -108, -103, -98, -97, -116, -103, -97, -108, -116, -97, -108, -103, -110, 75, 122, -101, -96, -98, 75, -112, -93, -97, -112, -103, -98, -108, -102, -103, 126, -85, -85, -88, -85, 89, -94, -89, -84, -83, -102, -89, -83, -94, -102, -83, -94, -89, -96, 89, -113, -119, 114, 89, -98, -79, -83, -98, -89, -84, -94, -88, -89, -115, -80, -94, -91, -90, -91, 97, -121, -89, -82, -79, -90, -88, -126, -74, -91, -86, -80, -109, -90, -81, -91, -90, -77, -90, -77, 111, 115, -106, -120, -117, -116, -117, 71, 115, -112, -119, -115, -109, -120, -118, 104, -100, -117, -112, -106, 121, -116, -107, -117, -116, -103, -116, -103, 85, -47, -12, -26, -23, -22, -23, -91, -47, -18, -25, -12, -11, -6, -8, -58, -6, -23, -18, -12, -41, -22, -13, -23, -22, -9, -22, -9, -77, -40, -5, -19, -16, -15, -16, -84, -40, -11, -18, 2, -4, 4, -30, -11, -16, -15, -5, -34, -15, -6, -16, -15, -2, -15, -2, -70, -12, 0, -2, -65, -8, 0, 0, -8, -3, -10, -65, -14, -1, -11, 3, 0, -6, -11, -65, -10, 9, 0, 1, -3, -14, 10, -10, 3, -61, -65, -10, 9, 5, -65, -9, -9, -2, 1, -10, -8, -65, -41, -9, -2, 1, -10, -8, -46, 6, -11, -6, 0, -29, -10, -1, -11, -10, 3, -10, 3, -64, -52, -54, -117, -60, -52, -52, -60, -55, -62, -117, -66, -53, -63, -49, -52, -58, -63, -117, -62, -43, -52, -51, -55, -66, -42, -62, -49, -113, -117, -62, -43, -47, -117, -61, -55, -66, -64, -117, -87, -58, -65, -61, -55, -66, -64, -98, -46, -63, -58, -52, -81, -62, -53, -63, -62, -49, -62, -49, -116, -104, -106, 87, -112, -104, -104, -112, -107, -114, 87, -118, -105, -115, -101, -104, -110, -115, 87, -114, -95, -104, -103, -107, -118, -94, -114, -101, 91, 87, -114, -95, -99, 87, -104, -103, -98, -100, 87, 117, -110, -117, -104, -103, -98, -100, 106, -98, -115, -110, -104, 123, -114, -105, -115, -114, -101, -114, -101, -67, -55, -57, -120, -63, -55, -55, -63, -58, -65, -120, -69, -56, -66, -52, -55, -61, -66, -120, -65, -46, -55, -54, -58, -69, -45, -65, -52, -116, -120, -65, -46, -50, -120, -48, -54, -109, -120, -90, -61, -68, -48, -54, -46, -80, -61, -66, -65, -55, -84, -65, -56, -66, -65, -52, -65, -52};
    }

    public C1199Zb(Context context) {
        this(context, 0);
    }

    public C1199Zb(Context context, int i) {
        this(context, null, i, 5000L);
    }

    @Deprecated
    public C1199Zb(Context context, TO to, int i, long j) {
        this.A00 = new C1201Zd(this);
        this.A03 = context;
        this.A01 = i;
        this.A02 = j;
        this.A04 = to;
    }

    private final void A02(Context context, TO to, long j, Handler handler, InterfaceC1655h8 interfaceC1655h8, int extensionRendererIndex, ArrayList<InterfaceC1188Yq> arrayList) throws Exception {
        arrayList.add(new C0T(context, C0889Mg.A0S, new MediaCodecRendererMetaParameters(null, false), ZS.A00, j, to, false, false, handler, interfaceC1655h8, 50, 5, 0, 0, 0));
        if (extensionRendererIndex == 0) {
            return;
        }
        int size = arrayList.size();
        if (extensionRendererIndex == 2) {
            size--;
        }
        try {
            try {
                Class<?> cls = Class.forName(A00(448, 57, 70));
                Class<?> clazz = Boolean.TYPE;
                Class<?> clazz2 = Long.TYPE;
                Class<?> clazz3 = Integer.TYPE;
                try {
                    arrayList.add(size, (InterfaceC1188Yq) cls.getConstructor(clazz, clazz2, Handler.class, InterfaceC1655h8.class, clazz3, clazz3).newInstance(true, Long.valueOf(j), handler, interfaceC1655h8, 50, 5));
                    Log.i(A00(0, 23, 44), A00(Input.Keys.COLON, 27, 120));
                } catch (Exception e) {
                    e = e;
                    throw new RuntimeException(A00(EnumC4719u30.ASSET_FAILED_MAX_SPACE_EXCEEDED_VALUE, 33, 37), e);
                }
            } catch (ClassNotFoundException unused) {
            }
        } catch (Exception e2) {
            e = e2;
        }
    }

    private final void A03(Context context, TO to, RV[] rvArr, Handler handler, InterfaceC1015Rp interfaceC1015Rp, int extensionRendererIndex, ArrayList<InterfaceC1188Yq> arrayList) throws Exception {
        int extensionRendererIndex2;
        int extensionRendererIndex3;
        String strA00 = A00(0, 23, 44);
        arrayList.add(new C0V(context, C0889Mg.A0S, new MediaCodecRendererMetaParameters(null, false), ZS.A00, to, false, false, false, handler, interfaceC1015Rp, RN.A02(context), rvArr));
        if (extensionRendererIndex == 0) {
            return;
        }
        int size = arrayList.size();
        if (extensionRendererIndex == 2) {
            size--;
        }
        try {
            extensionRendererIndex2 = size + 1;
            try {
                arrayList.add(size, (InterfaceC1188Yq) Class.forName(A00(389, 59, 21)).getConstructor(Handler.class, InterfaceC1015Rp.class, RV[].class).newInstance(handler, interfaceC1015Rp, rvArr));
                Log.i(strA00, A00(EnumC4719u30.AD_RESPONSE_EMPTY_VALUE, 28, 113));
            } catch (ClassNotFoundException unused) {
                size = extensionRendererIndex2;
                extensionRendererIndex2 = size;
            } catch (Exception e) {
                e = e;
                throw new RuntimeException(A00(93, 34, 23), e);
            }
        } catch (ClassNotFoundException unused2) {
        } catch (Exception e2) {
            e = e2;
        }
        try {
            Constructor<?> constructor = Class.forName(A00(330, 59, 73)).getConstructor(Handler.class, InterfaceC1015Rp.class, RV[].class);
            extensionRendererIndex3 = extensionRendererIndex2 + 1;
            try {
                arrayList.add(extensionRendererIndex2, (InterfaceC1188Yq) constructor.newInstance(handler, interfaceC1015Rp, rvArr));
                Log.i(strA00, A00(Input.Keys.F17, 28, 19));
            } catch (ClassNotFoundException unused3) {
                extensionRendererIndex2 = extensionRendererIndex3;
                extensionRendererIndex3 = extensionRendererIndex2;
            } catch (Exception e3) {
                e = e3;
                throw new RuntimeException(A00(59, 34, 40), e);
            }
        } catch (ClassNotFoundException unused4) {
        } catch (Exception e4) {
            e = e4;
        }
        try {
            try {
                Constructor<?> constructor2 = Class.forName(A00(270, 60, EnumC4719u30.INVALID_METRICS_ENDPOINT_VALUE)).getConstructor(Handler.class, InterfaceC1015Rp.class, RV[].class);
                try {
                    arrayList.add(extensionRendererIndex3, (InterfaceC1188Yq) constructor2.newInstance(handler, interfaceC1015Rp, rvArr));
                    Log.i(strA00, A00(Input.Keys.NUMPAD_ENTER, 27, 45));
                } catch (Exception e5) {
                    e = e5;
                    throw new RuntimeException(A00(23, 36, 114), e);
                }
            } catch (ClassNotFoundException unused5) {
            }
        } catch (Exception e6) {
            e = e6;
        }
    }

    private final void A04(Context context, InterfaceC1202Ze interfaceC1202Ze, Looper looper, int i, ArrayList<InterfaceC1188Yq> arrayList) {
        arrayList.add(new C03620z(interfaceC1202Ze, looper));
    }

    private final void A05(Context context, InterfaceC1388cm interfaceC1388cm, Looper looper, int i, ArrayList<InterfaceC1188Yq> arrayList) {
        arrayList.add(new C03590v(interfaceC1388cm, looper, this.A00));
    }

    private final RV[] A06() {
        return new RV[0];
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0987Qm
    public final InterfaceC1188Yq[] A5O(Handler handler, InterfaceC1655h8 interfaceC1655h8, InterfaceC1015Rp interfaceC1015Rp, InterfaceC1388cm interfaceC1388cm, InterfaceC1202Ze interfaceC1202Ze, TO to) throws Exception {
        TO to2 = to;
        if (to2 == null) {
            to2 = this.A04;
        }
        ArrayList<InterfaceC1188Yq> arrayList = new ArrayList<>();
        A02(this.A03, to2, this.A02, handler, interfaceC1655h8, this.A01, arrayList);
        A03(this.A03, to2, A06(), handler, interfaceC1015Rp, this.A01, arrayList);
        A05(this.A03, interfaceC1388cm, handler.getLooper(), this.A01, arrayList);
        A04(this.A03, interfaceC1202Ze, handler.getLooper(), this.A01, arrayList);
        return (InterfaceC1188Yq[]) arrayList.toArray(new InterfaceC1188Yq[arrayList.size()]);
    }
}
