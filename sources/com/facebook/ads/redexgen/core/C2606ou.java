package com.facebook.ads.redexgen.core;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.vungle.ads.internal.protos.Sdk$SDKError;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Arrays;
import org.jacoco.core.data.ExecutionDataWriter;
import org.objectweb.asm.Opcodes;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.ou, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C2606ou implements InterfaceC10147t {
    public static byte[] A05;
    public EP A00;
    public final int A01;
    public final long A02;
    public final Context A03;
    public final A6 A04;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A05, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 82);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A05 = new byte[]{-77, -44, -43, -48, -28, -37, -29, -63, -44, -35, -45, -44, -31, -44, -31, -30, -75, -48, -46, -29, -34, -31, -24, -95, -50, -50, -53, -50, 124, -59, -54, -49, -48, -67, -54, -48, -59, -67, -48, -59, -54, -61, 124, -94, -94, -55, -52, -63, -61, 124, -63, -44, -48, -63, -54, -49, -59, -53, -54, -70, -25, -25, -28, -25, -107, -34, -29, -24, -23, -42, -29, -23, -34, -42, -23, -34, -29, -36, -107, -69, -63, -74, -72, -107, -38, -19, -23, -38, -29, -24, -34, -28, -29, -12, 33, 33, 30, 33, -49, 24, 29, 34, 35, ExecutionDataWriter.BLOCK_SESSIONINFO, 29, 35, 24, ExecutionDataWriter.BLOCK_SESSIONINFO, 35, 24, 29, 22, -49, -2, 31, 36, 34, -49, 20, 39, 35, 20, 29, 34, 24, 30, 29, 6, 51, 51, 48, 51, -31, 42, 47, 52, 53, 34, 47, 53, 42, 34, 53, 42, 47, 40, -31, 23, ExecutionDataWriter.BLOCK_EXECUTIONDATA, -6, -31, 38, 57, 53, 38, 47, 52, 42, 48, 47, ExecutionDataWriter.BLOCK_SESSIONINFO, 51, 37, 40, 41, 40, -28, 10, 42, 49, 52, 41, 43, 5, 57, 40, 45, 51, 22, 41, 50, 40, 41, 54, 41, 54, -14, 14, 49, 35, 38, 39, 38, -30, 14, 43, 36, 40, 46, 35, 37, 3, 55, 38, 43, 49, 20, 39, 48, 38, 39, 52, 39, 52, -16, 6, 41, 27, 30, 31, 30, -38, 6, 35, 28, 41, 42, 47, 45, -5, 47, 30, 35, 41, 12, 31, 40, 30, 31, 44, 31, 44, -24, 4, 39, 25, 28, 29, 28, -40, 4, 33, 26, 46, 40, 48, 14, 33, 28, 29, 39, 10, 29, 38, 28, 29, 42, 29, 42, -26, -7, 5, 3, -60, -4, -9, -7, -5, -8, 5, 5, 1, -60, -9, -6, 9, -60, -9, 4, -6, 8, 5, -1, -6, 14, -60, 3, -5, -6, -1, -9, -55, -60, -5, 14, 5, 6, 2, -9, 15, -5, 8, -60, -5, 14, 10, -60, -4, -4, 3, 6, -5, -3, -60, -36, -4, 3, 6, -5, -3, -41, 11, -6, -1, 5, -24, -5, 4, -6, -5, 8, -5, 8, 27, 39, 37, -26, 30, 25, 27, 29, 26, 39, 39, 35, -26, 25, 28, 43, -26, 25, 38, 28, 42, 39, 33, 28, 48, -26, 37, 29, 28, 33, 25, -21, -26, 29, 48, 39, 40, 36, 25, 49, 29, 42, -26, 29, 48, 44, -26, 30, 36, 25, 27, -26, 4, 33, 26, 30, 36, 25, 27, -7, 45, 28, 33, 39, 10, 29, 38, 28, 29, 42, 29, 42, -56, -44, -46, -109, -53, -58, -56, -54, -57, -44, -44, -48, -109, -58, -55, -40, -109, -58, -45, -55, -41, -44, -50, -55, -35, -109, -46, -54, -55, -50, -58, -104, -109, -54, -35, -44, -43, -47, -58, -34, -54, -41, -109, -54, -35, -39, -109, -44, -43, -38, -40, -109, -79, -50, -57, -44, -43, -38, -40, -90, -38, -55, -50, -44, -73, -54, -45, -55, -54, -41, -54, -41, 35, 47, 45, -18, 38, 33, 35, 37, 34, 47, 47, 43, -18, 33, 36, 51, -18, 33, 46, 36, 50, 47, 41, 36, 56, -18, 45, 37, 36, 41, 33, -13, -18, 37, 56, 47, 48, 44, 33, 57, 37, 50, -18, 37, 56, 52, -18, 54, 48, -7, -18, 12, 41, 34, 54, 48, 56, 22, 41, 36, 37, 47, 18, 37, 46, 36, 37, 50, 37, 50};
    }

    public C2606ou(Context context) {
        this(context, 0);
    }

    public C2606ou(Context context, int i) {
        this(context, null, i, 5000L);
    }

    @Deprecated
    public C2606ou(Context context, A6 a6, int i, long j) {
        this.A00 = new C2607ov(this);
        this.A03 = context;
        this.A01 = i;
        this.A02 = j;
        this.A04 = a6;
    }

    private final void A02(Context context, A6 a6, long j, Handler handler, GQ gq, int extensionRendererIndex, ArrayList<InterfaceC2600oo> arrayList) throws Exception {
        arrayList.add(new AnonymousClass10(context, C2287jQ.A0T, new MediaCodecRendererMetaParameters(null, false), BT.A00, j, a6, false, false, handler, gq, 50, 5, 0, 0, 0));
        if (extensionRendererIndex == 0) {
            return;
        }
        int size = arrayList.size();
        if (extensionRendererIndex == 2) {
            size--;
        }
        try {
            try {
                Class<?> cls = Class.forName(A00(487, 70, 110));
                Class<?> clazz = Boolean.TYPE;
                Class<?> clazz2 = Long.TYPE;
                Class<?> clazz3 = Integer.TYPE;
                try {
                    arrayList.add(size, (InterfaceC2600oo) cls.getConstructor(clazz, clazz2, Handler.class, GQ.class, clazz3, clazz3).newInstance(true, Long.valueOf(j), handler, gq, 50, 5));
                    Log.i(A00(0, 23, 29), A00(243, 27, 102));
                } catch (Exception e) {
                    e = e;
                    throw new RuntimeException(A00(127, 33, 111), e);
                }
            } catch (ClassNotFoundException unused) {
            }
        } catch (Exception e2) {
            e = e2;
        }
    }

    private final void A03(Context context, A6 a6, InterfaceC09013k[] interfaceC09013kArr, Handler handler, InterfaceC10358p interfaceC10358p, int extensionRendererIndex, ArrayList<InterfaceC2600oo> arrayList) throws Exception {
        int extensionRendererIndex2;
        int extensionRendererIndex3;
        String strA00 = A00(0, 23, 29);
        arrayList.add(new AnonymousClass12(context, C2287jQ.A0T, new MediaCodecRendererMetaParameters(null, false), BT.A00, a6, false, false, false, handler, interfaceC10358p, C8R.A02(context), interfaceC09013kArr));
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
                arrayList.add(size, (InterfaceC2600oo) Class.forName(A00(TTAdConstant.VIDEO_COVER_URL_CODE, 72, 19)).getConstructor(Handler.class, InterfaceC10358p.class, InterfaceC09013k[].class).newInstance(handler, interfaceC10358p, interfaceC09013kArr));
                Log.i(strA00, A00(Sdk$SDKError.Reason.AD_RESPONSE_EMPTY_VALUE, 28, 104));
            } catch (ClassNotFoundException unused) {
                size = extensionRendererIndex2;
                extensionRendererIndex2 = size;
            } catch (Exception e) {
                e = e;
                throw new RuntimeException(A00(93, 34, 93), e);
            }
        } catch (ClassNotFoundException unused2) {
        } catch (Exception e2) {
            e = e2;
        }
        try {
            Constructor<?> constructor = Class.forName(A00(343, 72, 102)).getConstructor(Handler.class, InterfaceC10358p.class, InterfaceC09013k[].class);
            extensionRendererIndex3 = extensionRendererIndex2 + 1;
            try {
                arrayList.add(extensionRendererIndex2, (InterfaceC2600oo) constructor.newInstance(handler, interfaceC10358p, interfaceC09013kArr));
                Log.i(strA00, A00(Opcodes.NEW, 28, 112));
            } catch (ClassNotFoundException unused3) {
                extensionRendererIndex2 = extensionRendererIndex3;
                extensionRendererIndex3 = extensionRendererIndex2;
            } catch (Exception e3) {
                e = e3;
                throw new RuntimeException(A00(59, 34, 35), e);
            }
        } catch (ClassNotFoundException unused4) {
        } catch (Exception e4) {
            e = e4;
        }
        try {
            try {
                Constructor<?> constructor2 = Class.forName(A00(270, 73, 68)).getConstructor(Handler.class, InterfaceC10358p.class, InterfaceC09013k[].class);
                try {
                    arrayList.add(extensionRendererIndex3, (InterfaceC2600oo) constructor2.newInstance(handler, interfaceC10358p, interfaceC09013kArr));
                    Log.i(strA00, A00(160, 27, 114));
                } catch (Exception e5) {
                    e = e5;
                    throw new RuntimeException(A00(23, 36, 10), e);
                }
            } catch (ClassNotFoundException unused5) {
            }
        } catch (Exception e6) {
            e = e6;
        }
    }

    private final void A04(Context context, InterfaceC1088Bf interfaceC1088Bf, Looper looper, int i, ArrayList<InterfaceC2600oo> arrayList) {
        arrayList.add(new C08481f(interfaceC1088Bf, looper));
    }

    private final void A05(Context context, ES es, Looper looper, int i, ArrayList<InterfaceC2600oo> arrayList) {
        arrayList.add(new C08441b(es, looper, this.A00));
    }

    private final InterfaceC09013k[] A06() {
        return new InterfaceC09013k[0];
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC10147t
    public final InterfaceC2600oo[] A5Y(Handler handler, GQ gq, InterfaceC10358p interfaceC10358p, ES es, InterfaceC1088Bf interfaceC1088Bf, A6 a6) throws Exception {
        A6 a7 = a6;
        if (a7 == null) {
            a7 = this.A04;
        }
        ArrayList<InterfaceC2600oo> arrayList = new ArrayList<>();
        A02(this.A03, a7, this.A02, handler, gq, this.A01, arrayList);
        A03(this.A03, a7, A06(), handler, interfaceC10358p, this.A01, arrayList);
        A05(this.A03, es, handler.getLooper(), this.A01, arrayList);
        A04(this.A03, interfaceC1088Bf, handler.getLooper(), this.A01, arrayList);
        return (InterfaceC2600oo[]) arrayList.toArray(new InterfaceC2600oo[arrayList.size()]);
    }
}
