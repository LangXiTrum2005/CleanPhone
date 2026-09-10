package com.mbridge.msdk.config.component.common.express.operator;

import android.text.TextUtils;
import android.util.Base64;
import com.applovin.shadow.okhttp3.internal.ws.WebSocketProtocol;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.ironsource.InterfaceC0435l1;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.TsExtractor;
import java.lang.reflect.Array;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int[] f31910a = {99, 124, 119, 123, 242, 107, InterfaceC0435l1.d.b.f29112i, 197, 48, 1, InterfaceC0435l1.d.b.f29107d, 43, 254, 215, 171, 118, InterfaceC0435l1.c.b.f29097c, TsExtractor.TS_STREAM_TYPE_HDMV_DTS, InterfaceC0435l1.c.b.f29096b, 125, 250, 89, 71, PsExtractor.VIDEO_STREAM_MASK, 173, 212, 162, 175, 156, 164, 114, PsExtractor.AUDIO_STREAM, 183, 253, 147, 38, 54, 63, 247, 204, 52, 165, 229, 241, InterfaceC0435l1.d.b.f29114k, 216, 49, 21, 4, 199, 35, 195, 24, 150, 5, 154, 7, 18, 128, 226, 235, 39, 178, 117, 9, 131, 44, 26, 27, InterfaceC0435l1.d.b.f29111h, 90, 160, 82, 59, 214, 179, 41, 227, 47, 132, 83, 209, 0, 237, 32, 252, 177, 91, 106, InterfaceC0435l1.c.b.f29098d, 190, 57, 74, 76, 88, InterfaceC0435l1.c.b.f29102h, 208, 239, 170, 251, 67, 77, 51, 133, 69, 249, 2, 127, 80, 60, 159, 168, 81, 163, 64, 143, 146, 157, 56, 245, 188, 182, 218, 33, 16, 255, 243, 210, InterfaceC0435l1.c.b.f29100f, 12, 19, 236, 95, 151, 68, 23, 196, 167, WebSocketProtocol.PAYLOAD_SHORT, 61, 100, 93, 25, 115, 96, TsExtractor.TS_STREAM_TYPE_AC3, 79, 220, 34, 42, 144, 136, 70, 238, 184, 20, 222, 94, 11, 219, 224, 50, 58, 10, 73, 6, 36, 92, 194, 211, 172, 98, 145, 149, 228, 121, 231, 200, 55, InterfaceC0435l1.d.b.f29110g, 141, 213, 78, 169, 108, 86, 244, 234, InterfaceC0435l1.d.b.f29105b, 122, 174, 8, 186, 120, 37, 46, 28, 166, 180, 198, 232, 221, 116, 31, 75, PsExtractor.PRIVATE_STREAM_1, 139, TsExtractor.TS_STREAM_TYPE_DTS, InterfaceC0435l1.d.b.f29113j, 62, 181, InterfaceC0435l1.d.b.f29106c, 72, 3, 246, 14, 97, 53, 87, ModuleDescriptor.MODULE_VERSION, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 193, 29, 158, 225, 248, 152, 17, InterfaceC0435l1.d.b.f29109f, 217, 142, 148, 155, 30, TsExtractor.TS_STREAM_TYPE_E_AC3, 233, InterfaceC0435l1.c.b.f29101g, 85, 40, 223, 140, 161, 137, 13, 191, 230, 66, InterfaceC0435l1.d.b.f29108e, 65, 153, 45, 15, 176, 84, 187, 22};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private byte[][] f31911b;

    public h(com.mbridge.msdk.config.component.common.express.operator.parts.c cVar) {
    }

    private com.mbridge.msdk.config.component.common.express.operator.parts.a b(String str, Object obj, List<Object> list) {
        if (obj == null) {
            return com.mbridge.msdk.config.component.common.express.operator.parts.a.a("");
        }
        try {
            if (str.equals(com.mbridge.msdk.config.component.common.util.c.c("886"))) {
                return a(obj, list);
            }
            if (str.equals(com.mbridge.msdk.config.component.common.util.c.c("887"))) {
                return f(obj, list);
            }
            if (str.equals(com.mbridge.msdk.config.component.common.util.c.c("888"))) {
                return e(obj, list);
            }
            if (str.equals(com.mbridge.msdk.config.component.common.util.c.c("889"))) {
                return h(obj, list);
            }
            if (str.equals(com.mbridge.msdk.config.component.common.util.c.c("890"))) {
                return b(obj, list);
            }
            if (str.equals(com.mbridge.msdk.config.component.common.util.c.c("891"))) {
                return c(obj, list);
            }
            if (str.equals(com.mbridge.msdk.config.component.common.util.c.c("892"))) {
                return i(obj, list);
            }
            if (str.equals(com.mbridge.msdk.config.component.common.util.c.c("893"))) {
                return g(obj, list);
            }
            if (str.equals(com.mbridge.msdk.config.component.common.util.c.c("894"))) {
                return d(obj, list);
            }
            return com.mbridge.msdk.config.component.common.express.operator.parts.a.a("");
        } catch (Exception unused) {
        }
    }

    private com.mbridge.msdk.config.component.common.express.operator.parts.a c(Object obj, List<Object> list) {
        if (obj == null || !(obj instanceof String) || list == null || list.size() != 1) {
            return com.mbridge.msdk.config.component.common.express.operator.parts.a.a("");
        }
        byte[] bArrDecode = Base64.decode(obj.toString(), 10);
        if (bArrDecode.length < 16) {
            return com.mbridge.msdk.config.component.common.express.operator.parts.a.a("");
        }
        if (bArrDecode.length > 16) {
            bArrDecode = Arrays.copyOf(bArrDecode, 16);
        }
        int i10 = Integer.parseInt(list.get(0).toString()) % 8;
        for (int i11 = 0; i11 < 16; i11++) {
            int i12 = bArrDecode[i11] & 255;
            bArrDecode[i11] = (byte) ((i12 >>> (8 - i10)) | (i12 << i10));
        }
        return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(Base64.encodeToString(bArrDecode, 10));
    }

    private com.mbridge.msdk.config.component.common.express.operator.parts.a d(Object obj, List<Object> list) {
        if (obj == null || !(obj instanceof String) || list == null || list.size() != 1) {
            return com.mbridge.msdk.config.component.common.express.operator.parts.a.a("");
        }
        byte[] bArrDecode = Base64.decode(obj.toString(), 10);
        if (bArrDecode.length < 16) {
            return com.mbridge.msdk.config.component.common.express.operator.parts.a.a("");
        }
        if (bArrDecode.length > 16) {
            bArrDecode = Arrays.copyOf(bArrDecode, 16);
        }
        int i10 = ((Integer.parseInt(list.get(0).toString()) % 128) * 2) + 1;
        for (int i11 = 0; i11 < 16; i11++) {
            bArrDecode[i11] = (byte) (bArrDecode[i11] * i10);
        }
        return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(Base64.encodeToString(bArrDecode, 10));
    }

    private com.mbridge.msdk.config.component.common.express.operator.parts.a e(Object obj, List<Object> list) {
        if (obj == null || !(obj instanceof String) || list == null || list.size() != 1) {
            return com.mbridge.msdk.config.component.common.express.operator.parts.a.a("");
        }
        byte[] bArrDecode = Base64.decode(obj.toString(), 10);
        if (bArrDecode.length < 16) {
            return com.mbridge.msdk.config.component.common.express.operator.parts.a.a("");
        }
        if (bArrDecode.length > 16) {
            bArrDecode = Arrays.copyOf(bArrDecode, 16);
        }
        int i10 = Integer.parseInt(list.get(0).toString()) % 16;
        if (i10 > 0) {
            byte[] bArrCopyOf = Arrays.copyOf(bArrDecode, 16);
            for (int i11 = 0; i11 < 16; i11++) {
                bArrDecode[i11] = bArrCopyOf[(i11 + i10) % 16];
            }
        }
        return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(Base64.encodeToString(bArrDecode, 10));
    }

    private com.mbridge.msdk.config.component.common.express.operator.parts.a f(Object obj, List<Object> list) {
        if (obj == null || !(obj instanceof String) || list == null || list.size() != 1) {
            return com.mbridge.msdk.config.component.common.express.operator.parts.a.a("");
        }
        byte[] bArrDecode = Base64.decode(obj.toString(), 10);
        if (bArrDecode.length < 16) {
            return com.mbridge.msdk.config.component.common.express.operator.parts.a.a("");
        }
        if (bArrDecode.length > 16) {
            bArrDecode = Arrays.copyOf(bArrDecode, 16);
        }
        for (int i10 = 0; i10 < 16; i10++) {
            bArrDecode[i10] = (byte) this.f31910a[bArrDecode[i10] & 255];
        }
        return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(Base64.encodeToString(bArrDecode, 10));
    }

    private com.mbridge.msdk.config.component.common.express.operator.parts.a g(Object obj, List<Object> list) {
        if (obj != null && (obj instanceof String) && list != null) {
            if (list.size() == 1) {
                byte[] bArrDecode = Base64.decode(obj.toString(), 10);
                if (bArrDecode.length < 16) {
                    return com.mbridge.msdk.config.component.common.express.operator.parts.a.a("");
                }
                if (bArrDecode.length > 16) {
                    bArrDecode = Arrays.copyOf(bArrDecode, 16);
                }
                int i10 = Integer.parseInt(list.get(0).toString()) % 16;
                int i11 = i10 != 0 ? i10 : 1;
                for (int i12 = 0; i12 < 16; i12 += 2) {
                    int i13 = (i12 + i11) % 16;
                    byte b10 = bArrDecode[i12];
                    bArrDecode[i12] = bArrDecode[i13];
                    bArrDecode[i13] = b10;
                }
                return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(Base64.encodeToString(bArrDecode, 10));
            }
        }
        return com.mbridge.msdk.config.component.common.express.operator.parts.a.a("");
    }

    private com.mbridge.msdk.config.component.common.express.operator.parts.a h(Object obj, List<Object> list) {
        if (obj == null || !(obj instanceof String) || list == null || list.size() != 1) {
            return com.mbridge.msdk.config.component.common.express.operator.parts.a.a("");
        }
        byte[] bArrDecode = Base64.decode(obj.toString(), 10);
        if (bArrDecode.length < 16) {
            return com.mbridge.msdk.config.component.common.express.operator.parts.a.a("");
        }
        if (bArrDecode.length > 16) {
            bArrDecode = Arrays.copyOf(bArrDecode, 16);
        }
        for (int i10 = 0; i10 < 16; i10++) {
            bArrDecode[i10] = (byte) (bArrDecode[i10] ^ ((byte) Integer.parseInt(list.get(0).toString())));
        }
        return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(Base64.encodeToString(bArrDecode, 10));
    }

    private com.mbridge.msdk.config.component.common.express.operator.parts.a i(Object obj, List<Object> list) {
        if (obj == null || !(obj instanceof String) || list == null || list.size() != 1) {
            return com.mbridge.msdk.config.component.common.express.operator.parts.a.a("");
        }
        byte[] bArrDecode = Base64.decode(obj.toString(), 10);
        if (bArrDecode.length < 16) {
            return com.mbridge.msdk.config.component.common.express.operator.parts.a.a("");
        }
        if (bArrDecode.length > 16) {
            bArrDecode = Arrays.copyOf(bArrDecode, 16);
        }
        int i10 = 0;
        while (i10 < 16) {
            int i11 = i10 + 1;
            bArrDecode[i10] = (byte) (bArrDecode[i10] ^ bArrDecode[i11 % 16]);
            i10 = i11;
        }
        return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(Base64.encodeToString(bArrDecode, 10));
    }

    public com.mbridge.msdk.config.component.common.express.operator.parts.a a(String str, Object obj, List<Object> list) {
        if (TextUtils.isEmpty(str)) {
            return com.mbridge.msdk.config.component.common.express.operator.parts.a.c();
        }
        return b(str) ? b(str, obj, list) : com.mbridge.msdk.config.component.common.express.operator.parts.a.c();
    }

    private void a(String str) {
        this.f31911b = (byte[][]) Array.newInstance((Class<?>) Byte.TYPE, 16, 16);
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            for (int i10 = 0; i10 < 16; i10++) {
                System.arraycopy(messageDigest.digest((str + "_round_" + i10).getBytes(StandardCharsets.UTF_8)), 0, this.f31911b[i10], 0, 16);
            }
        } catch (Exception e10) {
            q0.b("OperatorEnMethod", e10.getMessage());
        }
    }

    private com.mbridge.msdk.config.component.common.express.operator.parts.a a(Object obj, List<Object> list) {
        if (obj != null && (obj instanceof String) && list != null && list.size() == 1) {
            String string = obj.toString();
            byte[] bArrDecode = Base64.decode(string, 10);
            if (bArrDecode.length < 16) {
                return com.mbridge.msdk.config.component.common.express.operator.parts.a.a("");
            }
            if (bArrDecode.length > 16) {
                bArrDecode = Arrays.copyOf(bArrDecode, 16);
            }
            a(string);
            byte[] bArr = this.f31911b[Integer.parseInt(list.get(0).toString()) % 16];
            for (int i10 = 0; i10 < 16; i10++) {
                bArrDecode[i10] = (byte) (bArrDecode[i10] ^ bArr[i10]);
            }
            return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(Base64.encodeToString(bArrDecode, 10));
        }
        return com.mbridge.msdk.config.component.common.express.operator.parts.a.a("");
    }

    private com.mbridge.msdk.config.component.common.express.operator.parts.a b(Object obj, List<Object> list) {
        if (obj != null && (obj instanceof String) && list != null && list.size() == 1) {
            byte[] bArrDecode = Base64.decode(obj.toString(), 10);
            if (bArrDecode.length < 16) {
                return com.mbridge.msdk.config.component.common.express.operator.parts.a.a("");
            }
            if (bArrDecode.length > 16) {
                bArrDecode = Arrays.copyOf(bArrDecode, 16);
            }
            for (int i10 = 0; i10 < 16; i10++) {
                bArrDecode[i10] = (byte) (Integer.parseInt(list.get(0).toString()) + bArrDecode[i10]);
            }
            return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(Base64.encodeToString(bArrDecode, 10));
        }
        return com.mbridge.msdk.config.component.common.express.operator.parts.a.a("");
    }

    private boolean b(String str) {
        return str.equals(com.mbridge.msdk.config.component.common.util.c.c("886")) || str.equals(com.mbridge.msdk.config.component.common.util.c.c("887")) || str.equals(com.mbridge.msdk.config.component.common.util.c.c("888")) || str.equals(com.mbridge.msdk.config.component.common.util.c.c("889")) || str.equals(com.mbridge.msdk.config.component.common.util.c.c("890")) || str.equals(com.mbridge.msdk.config.component.common.util.c.c("891")) || str.equals(com.mbridge.msdk.config.component.common.util.c.c("892")) || str.equals(com.mbridge.msdk.config.component.common.util.c.c("893")) || str.equals(com.mbridge.msdk.config.component.common.util.c.c("894"));
    }
}
