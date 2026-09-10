package com.facebook.ads.redexgen.core;

import com.google.common.collect.ElementTypesAreNonnullByDefault;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.SortedSet;
import javax.annotation.CheckForNull;
import org.jacoco.core.data.ExecutionDataWriter;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.qj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
@ElementTypesAreNonnullByDefault
public abstract class AbstractC2714qj {
    public static byte[] A00;
    public static String[] A01 = {"QMNv5OeLi", "JpCyGMjCH0qsxjrywkKfLwsh76HDYAsW", "KBfMQLxtUMBpcerO39v", "kcWpGIrroOmjfPs85a", "Ek92TFQTKr4621X3uMn", "aSOd7mkF1z21DVbAzu", "Gro5DGcboyXTTqFPFEdSQ7qnAhBJScvW", "47M7luGjiBOnZ0iOunZSyxDazaCqRcyy"};

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 4 out of bounds for length 4
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:656)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    public static int A00(Set<?> s) {
        int i = 0;
        Iterator<?> it = s.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            i = ~(~(i + (next != null ? next.hashCode() : 0)));
        }
        return i;
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 5
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:656)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    /* JADX WARN: Multi-variable type inference failed */
    public static <E> SortedSet<E> A03(SortedSet<E> unfiltered, InterfaceC2362kj<? super E> predicate) {
        if (!(unfiltered instanceof C1078Av)) {
            return new AnonymousClass26((SortedSet) AbstractC2361ki.A04(unfiltered), (InterfaceC2362kj) AbstractC2361ki.A04(predicate));
        }
        C1078Av c1078Av = (C1078Av) unfiltered;
        return new AnonymousClass26((SortedSet) c1078Av.A01, AbstractC2364kl.A00(c1078Av.A00, predicate));
    }

    public static String A04(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 125);
        }
        return new String(bArrCopyOfRange);
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 5
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:656)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    public static <E> Set<E> A07(Set<E> unfiltered, InterfaceC2362kj<? super E> predicate) {
        if (unfiltered instanceof SortedSet) {
            return A03((SortedSet) unfiltered, predicate);
        }
        if (!(unfiltered instanceof C1078Av)) {
            return new C1078Av((Set) AbstractC2361ki.A04(unfiltered), (InterfaceC2362kj) AbstractC2361ki.A04(predicate));
        }
        C1078Av c1078Av = (C1078Av) unfiltered;
        return new C1078Av((Set) c1078Av.A01, AbstractC2364kl.A00(c1078Av.A00, predicate));
    }

    public static void A08() {
        A00 = new byte[]{25, ExecutionDataWriter.BLOCK_SESSIONINFO, 25, ExecutionDataWriter.BLOCK_EXECUTIONDATA, 25, 18, 8, 47, 25, 8, 121, 111, 126, 59, 19, 5, 20, 82};
    }

    static {
        A08();
    }

    public static <E> AbstractC2712qh<E> A01(final Set<? extends E> set1, final Set<? extends E> set2) {
        AbstractC2361ki.A05(set1, A04(10, 4, 119));
        AbstractC2361ki.A05(set2, A04(14, 4, 29));
        return new C1080Ax(set1, set2);
    }

    public static <E> AbstractC2712qh<E> A02(final Set<E> set1, final Set<?> set2) {
        AbstractC2361ki.A05(set1, A04(10, 4, 119));
        AbstractC2361ki.A05(set2, A04(14, 4, 29));
        return new C1079Aw(set1, set2);
    }

    public static <E> HashSet<E> A05() {
        return new HashSet<>();
    }

    public static <E> HashSet<E> A06(int expectedSize) {
        return new HashSet<>(AbstractC2661po.A00(expectedSize));
    }

    public static boolean A09(@CheckForNull Set<?> s, Object object) {
        if (s == object) {
            return true;
        }
        if (!(object instanceof Set)) {
            return false;
        }
        if (A01[0].length() != 9) {
            throw new RuntimeException();
        }
        String[] strArr = A01;
        strArr[2] = "mkkUVP7U2mO33UgVMEf";
        strArr[4] = "sZqEaXQqwVxNGw5Qr8W";
        Set set = (Set) object;
        try {
            return s.size() == set.size() && s.containsAll(set);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    public static boolean A0A(Set<?> set, Collection<?> collection2) {
        AbstractC2361ki.A04(collection2);
        if (0 != 0) {
            throw new NullPointerException(A04(0, 10, 1));
        }
        if (collection2 instanceof Set) {
            int size = collection2.size();
            int size2 = set.size();
            if (A01[0].length() != 9) {
                throw new RuntimeException();
            }
            String[] strArr = A01;
            strArr[2] = "1Hjzr9oWssjCwBhAVsj";
            strArr[4] = "95dUReBvqcjLhc0vRoV";
            if (size > size2) {
                return AbstractC2621p9.A0E(set.iterator(), collection2);
            }
        }
        Iterator<?> it = collection2.iterator();
        String[] strArr2 = A01;
        if (strArr2[2].length() != strArr2[4].length()) {
            A01[1] = "sptQvlXJPhLrnOvdD6zGRYz2Tqrv0eAh";
            return A0B(set, it);
        }
        String[] strArr3 = A01;
        strArr3[2] = "FhrMChMKSM6HFLoTDqL";
        strArr3[4] = "aqz5QQGy23EnDjT9ypo";
        return A0B(set, it);
    }

    public static boolean A0B(Set<?> set, Iterator<?> iterator) {
        boolean z = false;
        while (changed) {
            boolean changed = set.remove(iterator.next());
            z |= changed;
        }
        return z;
    }
}
