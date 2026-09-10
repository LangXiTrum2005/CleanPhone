package com.facebook.ads.redexgen.core;

import com.google.common.collect.ElementTypesAreNonnullByDefault;
import com.google.common.collect.ParametricNullness;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;
import javax.annotation.CheckForNull;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.mO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
@ElementTypesAreNonnullByDefault
public abstract class AbstractC1970mO {
    public static byte[] A00;
    public static String[] A01 = {"K5wWXkn1kn3vTm5TWZRpAJ13TGij4Off", "na1woSjLgBJfLtqhSRSkwOGg", "PhLAgNdVWkw0DSh4SzNoPunxC5fhlr", "P2EphC6Qbo", "AgH7SjrpzHTBb", "6lZG", "iuGyz0SG3T5uD6f3liiVpcsGpl9NN6eU", "8JXy4no7J"};

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 2 out of bounds for length 2
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:656)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    public static <T> AbstractC2093oj<T> A03(@ParametricNullness T value) {
        return value != null ? new OE(value) : new OC(null);
    }

    public static String A08(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 50);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A09() {
        A00 = new byte[]{-67, -65, -78, -79, -74, -80, -82, -63, -78};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 2 out of bounds for length 2
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:656)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    public static <T> boolean A0C(Iterator<T> iterator, InterfaceC1719iE<? super T> predicate) {
        return A00(iterator, predicate) != -1;
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 5
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:656)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    public static boolean A0G(Iterator<?> iterator1, Iterator<?> iterator2) {
        while (iterator1.hasNext()) {
            if (!iterator2.hasNext() || !AbstractC0942Or.A01(iterator1.next(), iterator2.next())) {
                return false;
            }
        }
        return !iterator2.hasNext();
    }

    static {
        A09();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.iE != com.google.common.base.Predicate<? super T> */
    public static <T> int A00(Iterator<T> iterator, InterfaceC1719iE<? super T> predicate) {
        AbstractC1718iD.A05(predicate, A08(0, 9, 27));
        int i = 0;
        while (iterator.hasNext()) {
            if (predicate.A42(iterator.next())) {
                return i;
            }
            i++;
        }
        return -1;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.iE != com.google.common.base.Predicate<? super T> */
    public static <T> AbstractC2093oj<T> A01(final Iterator<T> unfiltered, final InterfaceC1719iE<? super T> retainIfTrue) {
        AbstractC1718iD.A04(unfiltered);
        AbstractC1718iD.A04(retainIfTrue);
        return new On<T>() { // from class: com.facebook.ads.redexgen.X.4O
            /* JADX WARN: Type inference fix 'apply assigned field type' failed
            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
             */
            @Override // com.facebook.ads.redexgen.core.On
            @CheckForNull
            public final T A02() {
                while (unfiltered.hasNext()) {
                    T t = (T) unfiltered.next();
                    if (retainIfTrue.A42(t)) {
                        return t;
                    }
                }
                return A01();
            }
        };
    }

    public static <T> Iterator<T> A02() {
        return EnumC1968mM.A03;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.oj != com.google.common.collect.UnmodifiableIterator<T> */
    public static <T> AbstractC2093oj<T> A04(Iterator<? extends T> iterator) {
        AbstractC1718iD.A04(iterator);
        if (iterator instanceof AbstractC2093oj) {
            return (AbstractC2093oj) iterator;
        }
        return new OF(iterator);
    }

    @CheckForNull
    public static <T> T A05(Iterator<T> iterator) {
        if (iterator.hasNext()) {
            T result = iterator.next();
            iterator.remove();
            return result;
        }
        return null;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.iE != com.google.common.base.Predicate<? super T> */
    @ParametricNullness
    public static <T> T A06(Iterator<T> iterator, InterfaceC1719iE<? super T> predicate) {
        AbstractC1718iD.A04(iterator);
        AbstractC1718iD.A04(predicate);
        while (iterator.hasNext()) {
            T next = iterator.next();
            if (predicate.A42(next)) {
                return next;
            }
        }
        throw new NoSuchElementException();
    }

    @ParametricNullness
    public static <T> T A07(@ParametricNullness Iterator<? extends T> iterator, T defaultValue) {
        if (!iterator.hasNext()) {
            return defaultValue;
        }
        T defaultValue2 = iterator.next();
        return defaultValue2;
    }

    public static void A0A(Iterator<?> iterator) {
        AbstractC1718iD.A04(iterator);
        while (iterator.hasNext()) {
            iterator.next();
            iterator.remove();
        }
    }

    public static <T> boolean A0B(Collection<T> addTo, Iterator<? extends T> iterator) {
        AbstractC1718iD.A04(addTo);
        AbstractC1718iD.A04(iterator);
        boolean z = false;
        while (wasModified) {
            boolean wasModified = addTo.add(iterator.next());
            z |= wasModified;
        }
        return z;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.iE != com.google.common.base.Predicate<? super T> */
    public static <T> boolean A0D(Iterator<T> removeFrom, InterfaceC1719iE<? super T> predicate) {
        AbstractC1718iD.A04(predicate);
        boolean z = false;
        while (modified) {
            boolean modified = predicate.A42(removeFrom.next());
            if (modified) {
                removeFrom.remove();
                if (A01[5].length() != 4) {
                    throw new RuntimeException();
                }
                A01[7] = "wI9B4C2he";
                z = true;
            }
        }
        return z;
    }

    public static boolean A0E(@CheckForNull Iterator<?> iterator, Object element) {
        if (element == null) {
            while (iterator.hasNext()) {
                if (iterator.next() == null) {
                    return true;
                }
            }
            return false;
        }
        while (iterator.hasNext()) {
            if (element.equals(iterator.next())) {
                return true;
            }
        }
        return false;
    }

    public static boolean A0F(Iterator<?> removeFrom, Collection<?> elementsToRemove) {
        AbstractC1718iD.A04(elementsToRemove);
        boolean z = false;
        while (result) {
            boolean result = elementsToRemove.contains(removeFrom.next());
            if (result) {
                removeFrom.remove();
                z = true;
            }
        }
        return z;
    }
}
