package kotlin.sequences;

import androidx.room.d;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"kotlin-stdlib"}, k = 5, mv = {2, 1, 0}, xi = 49, xs = "kotlin/sequences/SequencesKt")
class SequencesKt__SequencesKt extends SequencesKt__SequencesJVMKt {
    public static final FlatteningSequence a(Sequence sequence, Function1 function1) {
        if (!(sequence instanceof TransformingSequence)) {
            return new FlatteningSequence(sequence, new d(15), function1);
        }
        TransformingSequence transformingSequence = (TransformingSequence) sequence;
        return new FlatteningSequence(transformingSequence.f44686a, transformingSequence.f44687b, function1);
    }
}
