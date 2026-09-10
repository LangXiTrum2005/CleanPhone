package kotlin.text;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
final /* synthetic */ class Regex$findAll$2 extends FunctionReferenceImpl implements Function1<MatchResult, MatchResult> {
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        MatchResult p0 = (MatchResult) obj;
        Intrinsics.f(p0, "p0");
        return p0.next();
    }
}
