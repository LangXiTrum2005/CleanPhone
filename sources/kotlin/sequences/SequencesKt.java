package kotlin.sequences;

import androidx.datastore.preferences.protobuf.a;
import androidx.room.b;
import androidx.room.c;
import androidx.room.d;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.coroutines.jvm.internal.BaseContinuationImpl;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"kotlin/sequences/SequencesKt__SequenceBuilderKt", "kotlin/sequences/SequencesKt__SequencesJVMKt", "kotlin/sequences/SequencesKt__SequencesKt", "kotlin/sequences/SequencesKt___SequencesJvmKt", "kotlin/sequences/SequencesKt___SequencesKt"}, k = 4, mv = {2, 1, 0}, xi = 49)
public final class SequencesKt extends SequencesKt___SequencesKt {
    public static Sequence b(final Iterator it) {
        Intrinsics.f(it, "<this>");
        return c(new Sequence<Object>() { // from class: kotlin.sequences.SequencesKt__SequencesKt$asSequence$$inlined$Sequence$1
            @Override // kotlin.sequences.Sequence
            /* JADX INFO: renamed from: iterator, reason: from getter */
            public final Iterator getF44671a() {
                return it;
            }
        });
    }

    public static Sequence c(Sequence sequence) {
        return sequence instanceof ConstrainedOnceSequence ? sequence : new ConstrainedOnceSequence(sequence);
    }

    public static int d(Sequence sequence) {
        Iterator it = sequence.getF44671a();
        int i2 = 0;
        while (it.hasNext()) {
            it.next();
            i2++;
            if (i2 < 0) {
                throw new ArithmeticException("Count overflow has happened.");
            }
        }
        return i2;
    }

    public static Sequence e(Sequence sequence, int i2) {
        if (i2 < 0) {
            throw new IllegalArgumentException(a.k("Requested element count ", i2, " is less than zero.").toString());
        }
        if (i2 == 0) {
            return sequence;
        }
        return sequence instanceof DropTakeSequence ? ((DropTakeSequence) sequence).a(i2) : new DropSequence(sequence, i2);
    }

    public static FilteringSequence g(Sequence sequence, Function1 predicate) {
        Intrinsics.f(sequence, "<this>");
        Intrinsics.f(predicate, "predicate");
        return new FilteringSequence(sequence, true, predicate);
    }

    public static FilteringSequence h(Sequence sequence, Function1 function1) {
        Intrinsics.f(sequence, "<this>");
        return new FilteringSequence(sequence, false, function1);
    }

    public static FlatteningSequence i(Sequence sequence, Function1 function1) {
        return new FlatteningSequence(sequence, function1, SequencesKt___SequencesKt$flatMap$2.X);
    }

    public static FlatteningSequence j(TransformingSequence transformingSequence) {
        return SequencesKt__SequencesKt.a(transformingSequence, new d(14));
    }

    public static Sequence k(Function0 function0) {
        return c(new GeneratorSequence(function0, new b(function0)));
    }

    public static Sequence l(Function1 function1, Object obj) {
        return obj == null ? EmptySequence.f44657a : new GeneratorSequence(new c(obj, 8), function1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Iterator m(Function2 function2) {
        SequenceBuilderIterator sequenceBuilderIterator = new SequenceBuilderIterator();
        sequenceBuilderIterator.e0 = ((BaseContinuationImpl) function2).create(sequenceBuilderIterator, sequenceBuilderIterator);
        return sequenceBuilderIterator;
    }

    public static String n(Sequence sequence, String str) {
        Intrinsics.f(sequence, "<this>");
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) "");
        int i2 = 0;
        for (Object obj : sequence) {
            i2++;
            if (i2 > 1) {
                sb.append((CharSequence) str);
            }
            StringsKt.j(sb, obj, null);
        }
        sb.append((CharSequence) "");
        return sb.toString();
    }

    public static TransformingSequence o(Sequence sequence, Function1 transform) {
        Intrinsics.f(sequence, "<this>");
        Intrinsics.f(transform, "transform");
        return new TransformingSequence(sequence, transform);
    }

    public static FilteringSequence p(Sequence sequence, Function1 function1) {
        return h(new TransformingSequence(sequence, function1), new d(16));
    }

    public static FlatteningSequence q(FlatteningSequence flatteningSequence, Iterable iterable) {
        return SequencesKt__SequencesKt.a(ArraysKt.f(new Sequence[]{flatteningSequence, CollectionsKt.k(iterable)}), new d(13));
    }

    public static FlatteningSequence r(Sequence sequence, TransformingSequence transformingSequence) {
        return SequencesKt__SequencesKt.a(ArraysKt.f(new Sequence[]{sequence, transformingSequence}), new d(13));
    }

    public static FlatteningSequence s(TransformingSequence transformingSequence, Object obj) {
        return SequencesKt__SequencesKt.a(ArraysKt.f(new Sequence[]{transformingSequence, ArraysKt.f(new Object[]{obj})}), new d(13));
    }

    public static SequencesKt__SequenceBuilderKt$sequence$$inlined$Sequence$1 t(SequencesKt___SequencesKt$sortedWith$1 sequencesKt___SequencesKt$sortedWith$1, Pair pair, Function2 operation) {
        Intrinsics.f(operation, "operation");
        return new SequencesKt__SequenceBuilderKt$sequence$$inlined$Sequence$1(new SequencesKt___SequencesKt$runningFold$1(pair, sequencesKt___SequencesKt$sortedWith$1, operation, null));
    }

    public static Sequence u(Sequence sequence, int i2) {
        if (i2 < 0) {
            throw new IllegalArgumentException(a.k("Requested element count ", i2, " is less than zero.").toString());
        }
        if (i2 == 0) {
            return EmptySequence.f44657a;
        }
        return sequence instanceof DropTakeSequence ? ((DropTakeSequence) sequence).b(i2) : new TakeSequence(sequence, i2);
    }

    public static List v(Sequence sequence) {
        Intrinsics.f(sequence, "<this>");
        Iterator it = sequence.getF44671a();
        if (!it.hasNext()) {
            return EmptyList.X;
        }
        Object next = it.next();
        if (!it.hasNext()) {
            return CollectionsKt.H(next);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(next);
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        return arrayList;
    }

    public static ArrayList w(Sequence sequence) {
        Intrinsics.f(sequence, "<this>");
        ArrayList arrayList = new ArrayList();
        Iterator it = sequence.getF44671a();
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        return arrayList;
    }
}
