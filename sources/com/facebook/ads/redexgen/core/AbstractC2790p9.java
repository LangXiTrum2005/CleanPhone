package com.facebook.ads.redexgen.core;

import com.google.common.collect.ElementTypesAreNonnullByDefault;
import com.google.common.collect.ParametricNullness;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;
import javax.annotation.CheckForNull;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.p9, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
@ElementTypesAreNonnullByDefault
public abstract class AbstractC2790p9 {
    public static byte[] A00;
    public static String[] A01 = {"K5wWXkn1kn3vTm5TWZRpAJ13TGij4Off", "na1woSjLgBJfLtqhSRSkwOGg", "PhLAgNdVWkw0DSh4SzNoPunxC5fhlr", "P2EphC6Qbo", "AgH7SjrpzHTBb", "6lZG", "iuGyz0SG3T5uD6f3liiVpcsGpl9NN6eU", "8JXy4no7J"};

    public static String A07(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] - i4) - 50);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A08() {
        A00 = new byte[]{-67, -65, -78, -79, -74, -80, -82, -63, -78};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static <T> boolean A0B(Iterator<T> iterator, InterfaceC2531kj<? super T> predicate) {
        return A00(iterator, predicate) != -1;
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static boolean A0F(Iterator<?> iterator1, Iterator<?> iterator2) {
        while (iterator1.hasNext()) {
            if (!iterator2.hasNext() || !CB.A01(iterator1.next(), iterator2.next())) {
                return false;
            }
        }
        return !iterator2.hasNext();
    }

    static {
        A08();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.kj != com.google.common.base.Predicate<? super T> */
    public static <T> int A00(Iterator<T> iterator, InterfaceC2531kj<? super T> predicate) {
        AbstractC2530ki.A05(predicate, A07(0, 9, 27));
        int i2 = 0;
        while (iterator.hasNext()) {
            if (predicate.A4C(iterator.next())) {
                return i2;
            }
            i2++;
        }
        return -1;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.kj != com.google.common.base.Predicate<? super T> */
    public static <T> C4C<T> A01(final Iterator<T> unfiltered, final InterfaceC2531kj<? super T> retainIfTrue) {
        AbstractC2530ki.A04(unfiltered);
        AbstractC2530ki.A04(retainIfTrue);
        return new AbstractC1273Bv<T>() { // from class: com.facebook.ads.redexgen.X.2I
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
            @Override // com.facebook.ads.redexgen.core.AbstractC1273Bv
            @CheckForNull
            public final T A02() {
                while (unfiltered.hasNext()) {
                    T t = (T) unfiltered.next();
                    if (retainIfTrue.A4C(t)) {
                        return t;
                    }
                }
                return A01();
            }
        };
    }

    public static <T> Iterator<T> A02() {
        return EnumC2788p7.A03;
    }

    public static <T> C4C<T> A03(@ParametricNullness T value) {
        return new BN(value);
    }

    @CheckForNull
    public static <T> T A04(Iterator<T> iterator) {
        if (iterator.hasNext()) {
            T result = iterator.next();
            iterator.remove();
            return result;
        }
        return null;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.kj != com.google.common.base.Predicate<? super T> */
    @ParametricNullness
    public static <T> T A05(Iterator<T> iterator, InterfaceC2531kj<? super T> predicate) {
        AbstractC2530ki.A04(iterator);
        AbstractC2530ki.A04(predicate);
        while (iterator.hasNext()) {
            T next = iterator.next();
            if (predicate.A4C(next)) {
                return next;
            }
        }
        throw new NoSuchElementException();
    }

    @ParametricNullness
    public static <T> T A06(@ParametricNullness Iterator<? extends T> iterator, T defaultValue) {
        if (!iterator.hasNext()) {
            return defaultValue;
        }
        T defaultValue2 = iterator.next();
        return defaultValue2;
    }

    public static void A09(Iterator<?> iterator) {
        AbstractC2530ki.A04(iterator);
        while (iterator.hasNext()) {
            iterator.next();
            iterator.remove();
        }
    }

    public static <T> boolean A0A(Collection<T> addTo, Iterator<? extends T> iterator) {
        AbstractC2530ki.A04(addTo);
        AbstractC2530ki.A04(iterator);
        boolean z2 = false;
        while (wasModified) {
            boolean wasModified = addTo.add(iterator.next());
            z2 |= wasModified;
        }
        return z2;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.kj != com.google.common.base.Predicate<? super T> */
    public static <T> boolean A0C(Iterator<T> removeFrom, InterfaceC2531kj<? super T> predicate) {
        AbstractC2530ki.A04(predicate);
        boolean z2 = false;
        while (modified) {
            boolean modified = predicate.A4C(removeFrom.next());
            if (modified) {
                removeFrom.remove();
                if (A01[5].length() != 4) {
                    throw new RuntimeException();
                }
                A01[7] = "wI9B4C2he";
                z2 = true;
            }
        }
        return z2;
    }

    public static boolean A0D(@CheckForNull Iterator<?> iterator, Object element) {
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

    public static boolean A0E(Iterator<?> removeFrom, Collection<?> elementsToRemove) {
        AbstractC2530ki.A04(elementsToRemove);
        boolean z2 = false;
        while (result) {
            boolean result = elementsToRemove.contains(removeFrom.next());
            if (result) {
                removeFrom.remove();
                z2 = true;
            }
        }
        return z2;
    }
}
