package com.facebook.ads.redexgen.core;

import com.badlogic.gdx.Input;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.Arrays;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.gT, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1614gT {
    public static Constructor<?> A00;
    public static Constructor<?> A01;
    public static Method A02;
    public static Method A03;
    public static Method A04;
    public static byte[] A05;
    public static String[] A06 = {"b5MpoMqdCtxbpaHiKYU8ZrrcKbPbKxZ4", "rVlSXWEll2abPHnTG37ldI3ZWI0j4EYI", "bGd83DrSC01C5yrcJqOBO7jBwgXSb074", "3hqFvgE1pATp", "svuN1ZMsD5ZLFfebqsH7J9v5", "pYsatv2Hd96sOLV98Ex0KQFTl", "bIrCgVON0FMdWVGAPeCzoxoY8u16D0ca", "gxdDUTlKZSSPFJ9C1uZsra9DHHIDmDTf"};

    public static String A02(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A05, i, i + i2);
        int i4 = 0;
        while (true) {
            int length = bArrCopyOfRange.length;
            String[] strArr = A06;
            if (strArr[6].charAt(29) != strArr[2].charAt(29)) {
                throw new RuntimeException();
            }
            A06[0] = "2YvNtwrEQGRbor3vOIRVFYebvwT9ZPQ2";
            if (i4 >= length) {
                return new String(bArrCopyOfRange);
            }
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 22);
            i4++;
        }
    }

    public static void A03() {
        A05 = new byte[]{-41, -22, -34, -31, -39, -77, -65, -67, 126, -73, -65, -65, -73, -68, -75, 126, -79, -66, -76, -62, -65, -71, -76, 126, -75, -56, -65, -64, -68, -79, -55, -75, -62, -126, 126, -75, -74, -74, -75, -77, -60, 126, -108, -75, -74, -79, -59, -68, -60, -90, -71, -76, -75, -65, -106, -62, -79, -67, -75, -96, -62, -65, -77, -75, -61, -61, -65, -62, 116, -106, -79, -77, -60, -65, -62, -55, 116, -110, -59, -71, -68, -76, -75, -62, -85, -73, -75, 118, -81, -73, -73, -81, -76, -83, 118, -87, -74, -84, -70, -73, -79, -84, 118, -83, -64, -73, -72, -76, -87, -63, -83, -70, 122, 118, -83, -82, -82, -83, -85, -68, 118, -101, -85, -87, -76, -83, -119, -74, -84, -102, -73, -68, -87, -68, -83, -100, -70, -87, -74, -69, -82, -73, -70, -75, -87, -68, -79, -73, -74, 108, -118, -67, -79, -76, -84, -83, -70, -115, 127, -114, 108, -119, -114, 123, -114, -125, -119, -120, 94, 127, -127, -116, 127, 127, -115};
    }

    static {
        A03();
    }

    public static InterfaceC1536fC A00(float f) throws Exception {
        A04();
        Object objNewInstance = A00.newInstance(new Object[0]);
        A04.invoke(objNewInstance, Float.valueOf(f));
        Object builder = A02.invoke(objNewInstance, new Object[0]);
        AbstractC1517es.A01(builder);
        return null;
    }

    public static InterfaceC1602gG A01() throws Exception {
        A04();
        Object builder = A03.invoke(A01.newInstance(new Object[0]), new Object[0]);
        AbstractC1517es.A01(builder);
        return null;
    }

    @EnsuresNonNull({"scaleAndRotateTransformationBuilderConstructor", "setRotationMethod", "buildScaleAndRotateTransformationMethod", "videoFrameProcessorFactoryBuilderConstructor", "buildVideoFrameProcessorFactoryMethod"})
    public static void A04() throws Exception {
        Constructor<?> constructor = A00;
        String strA02 = A02(0, 5, 95);
        if (constructor == null || A04 == null || A02 == null) {
            Class<?> cls = Class.forName(A02(84, 73, 50));
            A00 = cls.getConstructor(new Class[0]);
            Class<?> scaleAndRotateTransformationBuilderClass = Float.TYPE;
            A04 = cls.getMethod(A02(Input.Keys.NUMPAD_ADD, 18, 4), scaleAndRotateTransformationBuilderClass);
            A02 = cls.getMethod(strA02, new Class[0]);
        }
        if (A01 == null || A03 == null) {
            Class<?> cls2 = Class.forName(A02(5, 79, 58));
            A01 = cls2.getConstructor(new Class[0]);
            A03 = cls2.getMethod(strA02, new Class[0]);
        }
    }
}
