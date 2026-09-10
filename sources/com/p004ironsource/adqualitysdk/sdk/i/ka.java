package com.p004ironsource.adqualitysdk.sdk.i;

import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.p004ironsource.dc;
import com.startapp.simple.bloomfilter.codec.CharEncoding;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes5.dex */
public final class ka {

    public static class d implements InvocationHandler {

        /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
        private static int f2839 = 1;

        /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
        private static int f2840;

        /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
        private static char[] f2841 = {281, 278, 289, 258, 294, 293, 284, 287, 253, 288, dc.T, 157, 196, 198, 201, 199, 196, 161, 167, 209, 201, 197, 193, 198, 190, 181, 189, 155, 157, 195, 200, 205, 205, 198, 159, 164, 203, 203, 205, 182, 128, 279, 302, 300, 300, 261, 256, 295, 302, 302, 297, 292, 254, 258, 294, 298, 303, 296, 293, 293, 295, 274, 233, 135, 271, 275, 274, 29, 'O', 'i', 'k', 'n', 'l', 'i', 'F', 'w', 260, 283, 281, 281, 242, 236, 271, 277, 285, 279, 276, 275, 236, 237, 276, 283, 283, 274, 267, 275, 279, 277, 279, 240, 233, 274, 277, 278, '5', 'g', 'b', 'a', 'g', 'l', 'f', 'R', 'S', 'd', 'l', 'j', 'i', 'p', 'i', 'd', 'T', '\\', 'l', 'f'};

        /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
        private Object f2842;

        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
        private e f2843;

        public d(Object obj, e eVar) {
            this.f2842 = obj;
            this.f2843 = eVar;
        }

        /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
        private Object m2739(Method method) {
            int i2 = f2839;
            f2840 = (i2 + 123) % 128;
            if (method != null) {
                int i3 = i2 + 73;
                f2840 = i3 % 128;
                if (i3 % 2 != 0) {
                    method.getName().hashCode();
                    throw null;
                }
                String name = method.getName();
                if (name.hashCode() == 1622498214 && name.equals(m2743(true, new int[]{104, 20, 0, 0}, "\u0001\u0000\u0000\u0001\u0000\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0000\u0001\u0000").intern())) {
                    f2840 = (f2839 + 67) % 128;
                    return m2742();
                }
            }
            return null;
        }

        /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
        private static Object[] m2741(Object[] objArr) {
            if (objArr != null) {
                try {
                    ArrayList arrayList = new ArrayList();
                    for (Object obj : objArr) {
                        f2839 = (f2840 + 81) % 128;
                        if (Proxy.isProxyClass(obj.getClass())) {
                            f2840 = (f2839 + 79) % 128;
                            arrayList.add(Proxy.getInvocationHandler(obj));
                        } else {
                            arrayList.add(obj);
                        }
                    }
                    return arrayList.toArray();
                } catch (Throwable th) {
                    kb.m2752(m2743(true, new int[]{0, 10, TTAdConstant.IMAGE_MODE_VERTICAL_IMG_173, 9}, null).intern(), m2743(false, new int[]{75, 29, 169, 0}, "\u0000\u0001\u0000\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0000\u0001\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0000").intern(), th, true);
                }
            }
            return objArr;
        }

        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
        private Object m2742() {
            int i2 = f2839;
            Object obj = this.f2842;
            f2840 = (i2 + 91) % 128;
            return obj;
        }

        @Override // java.lang.reflect.InvocationHandler
        public final Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
            int i2 = f2839 + 97;
            f2840 = i2 % 128;
            if (i2 % 2 != 0) {
                m2740(method);
                throw null;
            }
            if (m2740(method)) {
                try {
                    return m2739(method);
                } catch (Throwable th) {
                    String strIntern = m2743(true, new int[]{0, 10, TTAdConstant.IMAGE_MODE_VERTICAL_IMG_173, 9}, null).intern();
                    StringBuilder sb = new StringBuilder();
                    sb.append(m2743(true, new int[]{10, 30, 91, 0}, "\u0001\u0000\u0001\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0000\u0001").intern());
                    sb.append(method.getName());
                    kb.m2752(strIntern, sb.toString(), th, true);
                    return null;
                }
            }
            try {
                this.f2843.mo1773(obj, method, objArr);
            } catch (Throwable th2) {
                String strIntern2 = m2743(true, new int[]{0, 10, TTAdConstant.IMAGE_MODE_VERTICAL_IMG_173, 9}, null).intern();
                StringBuilder sb2 = new StringBuilder();
                sb2.append(m2743(false, new int[]{40, 23, 188, 0}, "\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0000\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0000\u0000").intern());
                Object obj2 = this.f2842;
                sb2.append(obj2 != null ? obj2.toString() : m2743(false, new int[]{63, 4, 162, 1}, "\u0000\u0000\u0001\u0001").intern());
                sb2.append(m2743(true, new int[]{67, 8, 0, 0}, "\u0000\u0000\u0001\u0001\u0000\u0001\u0000\u0001").intern());
                sb2.append(method.getName());
                kb.m2752(strIntern2, sb2.toString(), th2, true);
            }
            Object obj3 = this.f2842;
            if (obj3 != null) {
                f2839 = (f2840 + 67) % 128;
                return method.invoke(obj3, objArr);
            }
            if (Object.class.equals(method.getDeclaringClass())) {
                Object objInvoke = method.invoke(this, m2741(objArr));
                f2840 = (f2839 + 125) % 128;
                return objInvoke;
            }
            int i3 = f2840 + 3;
            f2839 = i3 % 128;
            if (i3 % 2 != 0) {
                return null;
            }
            throw null;
        }

        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
        private static String m2743(boolean z2, int[] iArr, String str) throws UnsupportedEncodingException {
            String str2;
            Object bytes = str;
            if (str != null) {
                bytes = str.getBytes(CharEncoding.ISO_8859_1);
            }
            byte[] bArr = (byte[]) bytes;
            synchronized (h.f2186) {
                try {
                    int i2 = iArr[0];
                    int i3 = iArr[1];
                    int i4 = iArr[2];
                    int i5 = iArr[3];
                    char[] cArr = new char[i3];
                    System.arraycopy(f2841, i2, cArr, 0, i3);
                    if (bArr != null) {
                        char[] cArr2 = new char[i3];
                        h.f2185 = 0;
                        char c2 = 0;
                        while (true) {
                            int i6 = h.f2185;
                            if (i6 >= i3) {
                                break;
                            }
                            if (bArr[i6] == 1) {
                                cArr2[i6] = (char) (((cArr[i6] << 1) + 1) - c2);
                            } else {
                                cArr2[i6] = (char) ((cArr[i6] << 1) - c2);
                            }
                            c2 = cArr2[i6];
                            h.f2185 = i6 + 1;
                        }
                        cArr = cArr2;
                    }
                    if (i5 > 0) {
                        char[] cArr3 = new char[i3];
                        System.arraycopy(cArr, 0, cArr3, 0, i3);
                        int i7 = i3 - i5;
                        System.arraycopy(cArr3, 0, cArr, i7, i5);
                        System.arraycopy(cArr3, i5, cArr, 0, i7);
                    }
                    if (z2) {
                        char[] cArr4 = new char[i3];
                        h.f2185 = 0;
                        while (true) {
                            int i8 = h.f2185;
                            if (i8 >= i3) {
                                break;
                            }
                            cArr4[i8] = cArr[(i3 - i8) - 1];
                            h.f2185 = i8 + 1;
                        }
                        cArr = cArr4;
                    }
                    if (i4 > 0) {
                        h.f2185 = 0;
                        while (true) {
                            int i9 = h.f2185;
                            if (i9 >= i3) {
                                break;
                            }
                            cArr[i9] = (char) (cArr[i9] - iArr[2]);
                            h.f2185 = i9 + 1;
                        }
                    }
                    str2 = new String(cArr);
                } catch (Throwable th) {
                    throw th;
                }
            }
            return str2;
        }

        /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
        private static boolean m2740(Method method) {
            String name = method.getName();
            if (name.hashCode() == 1622498214 && name.equals(m2743(true, new int[]{104, 20, 0, 0}, "\u0001\u0000\u0000\u0001\u0000\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0000\u0001\u0000").intern())) {
                f2840 = (f2839 + 85) % 128;
                return true;
            }
            int i2 = f2840 + 23;
            f2839 = i2 % 128;
            if (i2 % 2 != 0) {
                return false;
            }
            throw null;
        }
    }

    public interface e {
        /* JADX INFO: renamed from: ﻐ */
        void mo1773(Object obj, Method method, Object[] objArr);
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public static boolean m2737(Object obj) {
        return obj != null && Proxy.isProxyClass(obj.getClass()) && (obj instanceof hg);
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static Object m2738(Class<?> cls, Object obj, e eVar) {
        return Proxy.newProxyInstance(Thread.currentThread().getContextClassLoader(), new Class[]{cls, hg.class}, new d(obj, eVar));
    }
}
