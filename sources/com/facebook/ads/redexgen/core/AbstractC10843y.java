package com.facebook.ads.redexgen.core;

import android.text.TextUtils;
import java.util.Arrays;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import org.checkerframework.dataflow.qual.Pure;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.3y, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC10843y {
    public static byte[] A00;

    static {
        A06();
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:656)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    @EnsuresNonNull({"#1"})
    @Pure
    public static <T> T A01(T t) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException();
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:656)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    @EnsuresNonNull({"#1"})
    @Pure
    public static <T> T A02(T t) {
        if (t != null) {
            return t;
        }
        throw new IllegalStateException();
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 2 out of bounds for length 2
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:656)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    @EnsuresNonNull({"#1"})
    @Pure
    public static <T> T A03(T t, Object obj) {
        if (t != null) {
            return t;
        }
        throw new IllegalStateException(String.valueOf(obj));
    }

    public static String A04(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] ^ i4) ^ 10);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A06() {
        A00 = new byte[]{54, 17, 27, 26, 7, 69, 95, 90, 27, 81, 95, 44, 11, 30, 13, 11, 69, 95, 90, 27, 81, 95, 51, 22, 18, 22, 11, 69, 95, 90, 27};
    }

    @Pure
    public static int A00(int i2, int i3, int i4) {
        if (i2 < i3 || i2 >= i4) {
            throw new IndexOutOfBoundsException(String.format(A04(0, 31, 117), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)));
        }
        return i2;
    }

    @EnsuresNonNull({"#1"})
    @Pure
    public static String A05(String str) {
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        throw new IllegalArgumentException();
    }

    @Pure
    public static void A07(boolean z2) {
        if (z2) {
        } else {
            throw new IllegalArgumentException();
        }
    }

    @Pure
    public static void A08(boolean z2) {
        if (z2) {
        } else {
            throw new IllegalStateException();
        }
    }

    @Pure
    public static void A09(boolean z2, Object obj) {
        if (z2) {
        } else {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
    }

    @Pure
    public static void A0A(boolean z2, Object obj) {
        if (z2) {
        } else {
            throw new IllegalStateException(String.valueOf(obj));
        }
    }
}
