package androidx.paging;

import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function3;

/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "androidx.paging.SeparatorsKt", f = "Separators.kt", l = {82}, m = "insertInternalSeparators")
final class SeparatorsKt$insertInternalSeparators$1<R, T extends R> extends ContinuationImpl {
    public TransformablePage X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public Function3 f7872Y;
    public ArrayList Z;
    public ArrayList e0;
    public Object f0;
    public int g0;
    public int h0;
    public /* synthetic */ Object i0;
    public int j0;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.i0 = obj;
        this.j0 |= Integer.MIN_VALUE;
        return SeparatorsKt.b(null, this);
    }
}
