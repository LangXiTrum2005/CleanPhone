package kotlin.sequences;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
final /* synthetic */ class SequencesKt___SequencesKt$flatMap$1 extends FunctionReferenceImpl implements Function1<Iterable<Object>, Iterator<Object>> {
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Iterable p0 = (Iterable) obj;
        Intrinsics.f(p0, "p0");
        return p0.iterator();
    }
}
