package a1;

import android.util.Log;
import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f3326a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f3327b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f3328c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final byte[] f3329d;

    public d(byte[] bArr, int i10, int i11) {
        this(-1L, bArr, i10, i11);
    }

    public static d a(String str) {
        if (str.length() == 1 && str.charAt(0) >= '0' && str.charAt(0) <= '1') {
            return new d(new byte[]{(byte) (str.charAt(0) - '0')}, 1, 1);
        }
        byte[] bytes = str.getBytes(h.f3339d0);
        return new d(bytes, 1, bytes.length);
    }

    public static d b(String str) {
        byte[] bytes = str.concat(WebViewProviderFactoryBoundaryInterface.MULTI_COOKIE_VALUE_SEPARATOR).getBytes(h.f3339d0);
        return new d(bytes, 2, bytes.length);
    }

    public static d c(long j10, ByteOrder byteOrder) {
        return d(new long[]{j10}, byteOrder);
    }

    public static d d(long[] jArr, ByteOrder byteOrder) {
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[h.U[4] * jArr.length]);
        byteBufferWrap.order(byteOrder);
        for (long j10 : jArr) {
            byteBufferWrap.putInt((int) j10);
        }
        return new d(byteBufferWrap.array(), 4, jArr.length);
    }

    public static d e(f[] fVarArr, ByteOrder byteOrder) {
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[h.U[5] * fVarArr.length]);
        byteBufferWrap.order(byteOrder);
        for (f fVar : fVarArr) {
            byteBufferWrap.putInt((int) fVar.f3334a);
            byteBufferWrap.putInt((int) fVar.f3335b);
        }
        return new d(byteBufferWrap.array(), 5, fVarArr.length);
    }

    public static d f(int i10, ByteOrder byteOrder) {
        return g(new int[]{i10}, byteOrder);
    }

    public static d g(int[] iArr, ByteOrder byteOrder) {
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[h.U[3] * iArr.length]);
        byteBufferWrap.order(byteOrder);
        for (int i10 : iArr) {
            byteBufferWrap.putShort((short) i10);
        }
        return new d(byteBufferWrap.array(), 3, iArr.length);
    }

    public final double h(ByteOrder byteOrder) throws Throwable {
        Object objK = k(byteOrder);
        if (objK == null) {
            throw new NumberFormatException("NULL can't be converted to a double value");
        }
        if (objK instanceof String) {
            return Double.parseDouble((String) objK);
        }
        if (objK instanceof long[]) {
            long[] jArr = (long[]) objK;
            if (jArr.length == 1) {
                return jArr[0];
            }
            throw new NumberFormatException("There are more than one component");
        }
        if (objK instanceof int[]) {
            int[] iArr = (int[]) objK;
            if (iArr.length == 1) {
                return iArr[0];
            }
            throw new NumberFormatException("There are more than one component");
        }
        if (objK instanceof double[]) {
            double[] dArr = (double[]) objK;
            if (dArr.length == 1) {
                return dArr[0];
            }
            throw new NumberFormatException("There are more than one component");
        }
        if (!(objK instanceof f[])) {
            throw new NumberFormatException("Couldn't find a double value");
        }
        f[] fVarArr = (f[]) objK;
        if (fVarArr.length != 1) {
            throw new NumberFormatException("There are more than one component");
        }
        f fVar = fVarArr[0];
        return fVar.f3334a / fVar.f3335b;
    }

    public final int i(ByteOrder byteOrder) throws Throwable {
        Object objK = k(byteOrder);
        if (objK == null) {
            throw new NumberFormatException("NULL can't be converted to a integer value");
        }
        if (objK instanceof String) {
            return Integer.parseInt((String) objK);
        }
        if (objK instanceof long[]) {
            long[] jArr = (long[]) objK;
            if (jArr.length == 1) {
                return (int) jArr[0];
            }
            throw new NumberFormatException("There are more than one component");
        }
        if (!(objK instanceof int[])) {
            throw new NumberFormatException("Couldn't find a integer value");
        }
        int[] iArr = (int[]) objK;
        if (iArr.length == 1) {
            return iArr[0];
        }
        throw new NumberFormatException("There are more than one component");
    }

    public final String j(ByteOrder byteOrder) throws Throwable {
        Object objK = k(byteOrder);
        if (objK == null) {
            return null;
        }
        if (objK instanceof String) {
            return (String) objK;
        }
        StringBuilder sb2 = new StringBuilder();
        int i10 = 0;
        if (objK instanceof long[]) {
            long[] jArr = (long[]) objK;
            while (i10 < jArr.length) {
                sb2.append(jArr[i10]);
                i10++;
                if (i10 != jArr.length) {
                    sb2.append(",");
                }
            }
            return sb2.toString();
        }
        if (objK instanceof int[]) {
            int[] iArr = (int[]) objK;
            while (i10 < iArr.length) {
                sb2.append(iArr[i10]);
                i10++;
                if (i10 != iArr.length) {
                    sb2.append(",");
                }
            }
            return sb2.toString();
        }
        if (objK instanceof double[]) {
            double[] dArr = (double[]) objK;
            while (i10 < dArr.length) {
                sb2.append(dArr[i10]);
                i10++;
                if (i10 != dArr.length) {
                    sb2.append(",");
                }
            }
            return sb2.toString();
        }
        if (!(objK instanceof f[])) {
            return null;
        }
        f[] fVarArr = (f[]) objK;
        while (i10 < fVarArr.length) {
            sb2.append(fVarArr[i10].f3334a);
            sb2.append('/');
            sb2.append(fVarArr[i10].f3335b);
            i10++;
            if (i10 != fVarArr.length) {
                sb2.append(",");
            }
        }
        return sb2.toString();
    }

    /* JADX WARN: Code duplicated, block: B:103:0x0134 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 4, insn: 0x0032: MOVE (r3 I:??[OBJECT, ARRAY]) = (r4 I:??[OBJECT, ARRAY]) (LINE:51), block:B:17:0x0032 */
    /* JADX WARN: Type inference failed for: r13v14, types: [int[]] */
    /* JADX WARN: Type inference failed for: r13v15, types: [long[]] */
    /* JADX WARN: Type inference failed for: r13v16, types: [a1.f[]] */
    /* JADX WARN: Type inference failed for: r13v17, types: [int[]] */
    /* JADX WARN: Type inference failed for: r13v18, types: [int[]] */
    /* JADX WARN: Type inference failed for: r13v19, types: [a1.f[]] */
    /* JADX WARN: Type inference failed for: r13v20, types: [double[]] */
    /* JADX WARN: Type inference failed for: r13v21, types: [java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r13v22, types: [double[]] */
    public final Serializable k(ByteOrder byteOrder) throws Throwable {
        b bVar;
        InputStream inputStream;
        String str;
        byte b10;
        ?? r13;
        byte[] bArr = this.f3329d;
        InputStream inputStream2 = null;
        try {
            try {
                bVar = new b(bArr);
                try {
                    bVar.f3321c = byteOrder;
                    int i10 = this.f3326a;
                    int length = 0;
                    int i11 = this.f3327b;
                    switch (i10) {
                        case 1:
                        case 6:
                            if (bArr.length != 1 || (b10 = bArr[0]) < 0 || b10 > 1) {
                                str = new String(bArr, h.f3339d0);
                                try {
                                    bVar.close();
                                    return str;
                                } catch (IOException e10) {
                                    Log.e("ExifInterface", "IOException occurred while closing InputStream", e10);
                                    return str;
                                }
                            }
                            String str2 = new String(new char[]{(char) (b10 + 48)});
                            try {
                                bVar.close();
                                return str2;
                            } catch (IOException e11) {
                                Log.e("ExifInterface", "IOException occurred while closing InputStream", e11);
                                return str2;
                            }
                        case 2:
                        case 7:
                            if (i11 >= h.V.length) {
                                int i12 = 0;
                                while (true) {
                                    byte[] bArr2 = h.V;
                                    if (i12 >= bArr2.length) {
                                        length = bArr2.length;
                                    } else if (bArr[i12] == bArr2[i12]) {
                                        i12++;
                                    }
                                }
                            }
                            StringBuilder sb2 = new StringBuilder();
                            while (length < i11) {
                                byte b11 = bArr[length];
                                if (b11 == 0) {
                                    str = sb2.toString();
                                    bVar.close();
                                    return str;
                                }
                                if (b11 >= 32) {
                                    sb2.append((char) b11);
                                } else {
                                    sb2.append('?');
                                }
                                length++;
                            }
                            str = sb2.toString();
                            bVar.close();
                            return str;
                        case 3:
                            r13 = new int[i11];
                            while (length < i11) {
                                r13[length] = bVar.readUnsignedShort();
                                length++;
                            }
                            try {
                                bVar.close();
                                return r13;
                            } catch (IOException e12) {
                                Log.e("ExifInterface", "IOException occurred while closing InputStream", e12);
                                return r13;
                            }
                        case 4:
                            r13 = new long[i11];
                            while (length < i11) {
                                r13[length] = ((long) bVar.readInt()) & 4294967295L;
                                length++;
                            }
                            bVar.close();
                            return r13;
                        case 5:
                            r13 = new f[i11];
                            while (length < i11) {
                                r13[length] = new f(((long) bVar.readInt()) & 4294967295L, ((long) bVar.readInt()) & 4294967295L);
                                length++;
                            }
                            bVar.close();
                            return r13;
                        case 8:
                            r13 = new int[i11];
                            while (length < i11) {
                                r13[length] = bVar.readShort();
                                length++;
                            }
                            bVar.close();
                            return r13;
                        case 9:
                            r13 = new int[i11];
                            while (length < i11) {
                                r13[length] = bVar.readInt();
                                length++;
                            }
                            bVar.close();
                            return r13;
                        case 10:
                            r13 = new f[i11];
                            while (length < i11) {
                                r13[length] = new f(bVar.readInt(), bVar.readInt());
                                length++;
                            }
                            bVar.close();
                            return r13;
                        case 11:
                            r13 = new double[i11];
                            while (length < i11) {
                                r13[length] = bVar.readFloat();
                                length++;
                            }
                            bVar.close();
                            return r13;
                        case 12:
                            r13 = new double[i11];
                            while (length < i11) {
                                r13[length] = bVar.readDouble();
                                length++;
                            }
                            bVar.close();
                            return r13;
                        default:
                            try {
                                bVar.close();
                                return null;
                            } catch (IOException e13) {
                                Log.e("ExifInterface", "IOException occurred while closing InputStream", e13);
                                return null;
                            }
                    }
                } catch (IOException e14) {
                    e = e14;
                    Log.w("ExifInterface", "IOException occurred during reading a value", e);
                    if (bVar != null) {
                        try {
                            bVar.close();
                        } catch (IOException e15) {
                            Log.e("ExifInterface", "IOException occurred while closing InputStream", e15);
                        }
                    }
                    return null;
                }
            } catch (IOException e16) {
                e = e16;
                bVar = null;
            } catch (Throwable th2) {
                th = th2;
                if (inputStream2 != null) {
                    try {
                        inputStream2.close();
                    } catch (IOException e17) {
                        Log.e("ExifInterface", "IOException occurred while closing InputStream", e17);
                    }
                }
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            inputStream2 = inputStream;
            if (inputStream2 != null) {
                inputStream2.close();
            }
            throw th;
        }
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("(");
        sb2.append(h.T[this.f3326a]);
        sb2.append(", data length:");
        return l1.d.i(sb2, this.f3329d.length, ")");
    }

    public d(long j10, byte[] bArr, int i10, int i11) {
        this.f3326a = i10;
        this.f3327b = i11;
        this.f3328c = j10;
        this.f3329d = bArr;
    }
}
