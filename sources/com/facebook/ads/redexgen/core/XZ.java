package com.facebook.ads.redexgen.core;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.LinkedBlockingQueue;

/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class XZ implements InvocationHandler {
    public static byte[] A03;
    public final /* synthetic */ int A00;
    public final /* synthetic */ T8 A01;
    public final /* synthetic */ LinkedBlockingQueue A02;

    static {
        A01();
    }

    public static String A00(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A03, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] ^ i4) ^ 52);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A03 = new byte[]{40, 42, 33, 42, 61, 38, 44, 43, 41, 56, 31, 60, 32, 37, 56, 2, 45, 33, 41, 43, 41, 56, 24, 53, 60, 41, 73, 75, 90, 120, 79, 66, 91, 75, 29, 28, 49, 26, 23, 17, 25, 1, 7, 31, 1, 32, 23, 19, 22, 11};
    }

    public XZ(int i2, LinkedBlockingQueue linkedBlockingQueue, T8 t8) {
        this.A00 = i2;
        this.A02 = linkedBlockingQueue;
        this.A01 = t8;
    }

    @Override // java.lang.reflect.InvocationHandler
    public final Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
        try {
            if (method.getName().equals(A00(34, 16, 70)) && objArr.length == 1 && (objArr[0] instanceof List)) {
                for (Object c2 : (List) objArr[0]) {
                    String str = (String) c2.getClass().getMethod(A00(7, 12, 120), new Class[0]).invoke(c2, new Object[0]);
                    int iIntValue = ((Integer) c2.getClass().getMethod(A00(19, 7, 120), new Class[0]).invoke(c2, new Object[0])).intValue();
                    if (str == null && iIntValue == this.A00) {
                        byte[] value = (byte[]) c2.getClass().getMethod(A00(26, 8, 26), new Class[0]).invoke(c2, new Object[0]);
                        this.A02.put(value);
                        return null;
                    }
                }
                this.A02.put(null);
            }
        } catch (Throwable t) {
            this.A01.A08().ABC(A00(0, 7, 123), AbstractC1712Td.A1G, new C1713Te(t));
        }
        return null;
    }
}
