package com.facebook.ads.redexgen.core;

import com.google.common.collect.ElementTypesAreNonnullByDefault;
import com.google.common.collect.ParametricNullness;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.mH, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
@ElementTypesAreNonnullByDefault
public abstract class AbstractC1963mH {
    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 2 out of bounds for length 2
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:656)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    @ParametricNullness
    public static <T> T A00(@ParametricNullness Iterable<? extends T> iterable, T t) {
        return (T) AbstractC1970mO.A07(iterable.iterator(), t);
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 2 out of bounds for length 2
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:656)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    public static <T> boolean A02(Iterable<T> iterable, InterfaceC1719iE<? super T> predicate) {
        return AbstractC1970mO.A0C(iterable.iterator(), predicate);
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 3 out of bounds for length 3
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:656)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    public static <T> boolean A03(Iterable<T> removeFrom, InterfaceC1719iE<? super T> predicate) {
        return ((removeFrom instanceof RandomAccess) && (removeFrom instanceof List)) ? A04((List) removeFrom, (InterfaceC1719iE) AbstractC1718iD.A04(predicate)) : AbstractC1970mO.A0D(removeFrom.iterator(), predicate);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.iE != com.google.common.base.Predicate<? super T> */
    public static <T> void A01(List<T> list, InterfaceC1719iE<? super T> predicate, int to, int from) {
        for (int size = list.size() - 1; size > from; size--) {
            if (predicate.A42(list.get(size))) {
                list.remove(size);
            }
        }
        for (int n = from - 1; n >= to; n--) {
            list.remove(n);
        }
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.iE != com.google.common.base.Predicate<? super T> */
    public static <T> boolean A04(List<T> list, InterfaceC1719iE<? super T> predicate) {
        int i = 0;
        int i2 = 0;
        while (i < from) {
            T t = list.get(i);
            if (!predicate.A42(t)) {
                if (i > i2) {
                    try {
                        list.set(i2, t);
                    } catch (IllegalArgumentException unused) {
                        A01(list, predicate, i2, i);
                        return true;
                    } catch (UnsupportedOperationException unused2) {
                        A01(list, predicate, i2, i);
                        return true;
                    }
                }
                i2++;
            }
            i++;
        }
        int from = list.size();
        list.subList(i2, from).clear();
        return i != i2;
    }
}
