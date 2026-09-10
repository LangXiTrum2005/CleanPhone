package kotlin.reflect.jvm.internal.impl.metadata.builtins;

import java.io.DataInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IntIterator;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntProgressionIterator;
import kotlin.ranges.IntRange;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.BinaryVersion;

/* JADX INFO: loaded from: classes7.dex */
public final class BuiltInsBinaryVersion extends BinaryVersion {
    public static final BuiltInsBinaryVersion f = new BuiltInsBinaryVersion(1, 0, 7);

    public static final class Companion {
        public static BuiltInsBinaryVersion a(InputStream inputStream) {
            DataInputStream dataInputStream = new DataInputStream(inputStream);
            IntRange intRange = new IntRange(1, dataInputStream.readInt(), 1);
            ArrayList arrayList = new ArrayList(CollectionsKt.n(intRange, 10));
            Iterator<Integer> it = intRange.iterator();
            while (((IntProgressionIterator) it).Z) {
                ((IntIterator) it).a();
                arrayList.add(Integer.valueOf(dataInputStream.readInt()));
            }
            int[] iArrH0 = CollectionsKt.h0(arrayList);
            return new BuiltInsBinaryVersion(Arrays.copyOf(iArrH0, iArrH0.length));
        }
    }

    static {
        new BuiltInsBinaryVersion(new int[0]);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BuiltInsBinaryVersion(int... numbers) {
        super(Arrays.copyOf(numbers, numbers.length));
        Intrinsics.f(numbers, "numbers");
    }
}
