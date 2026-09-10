package kotlinx.coroutines.selects;

import kotlin.Metadata;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlinx.coroutines.channels.BufferedChannel;
import kotlinx.coroutines.channels.a;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002¨\u0006\u0003"}, d2 = {"Lkotlinx/coroutines/selects/SelectClause1Impl;", "Q", "Lkotlinx/coroutines/selects/SelectClause1;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SelectClause1Impl<Q> implements SelectClause1<Q> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BufferedChannel f45080a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final FunctionReferenceImpl f45081b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final FunctionReferenceImpl f45082c;

    /* JADX WARN: Multi-variable type inference failed */
    public SelectClause1Impl(BufferedChannel bufferedChannel, Function3 function3, Function3 function4, a aVar) {
        this.f45080a = bufferedChannel;
        this.f45081b = (FunctionReferenceImpl) function3;
        this.f45082c = (FunctionReferenceImpl) function4;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [kotlin.jvm.functions.Function3, kotlin.jvm.internal.FunctionReferenceImpl] */
    @Override // kotlinx.coroutines.selects.SelectClause
    /* JADX INFO: renamed from: a */
    public final Function3 getF45078b() {
        return this.f45081b;
    }

    @Override // kotlinx.coroutines.selects.SelectClause
    public final Function3 b() {
        return null;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [kotlin.jvm.functions.Function3, kotlin.jvm.internal.FunctionReferenceImpl] */
    @Override // kotlinx.coroutines.selects.SelectClause
    /* JADX INFO: renamed from: c */
    public final Function3 getF45079c() {
        return this.f45082c;
    }

    @Override // kotlinx.coroutines.selects.SelectClause
    /* JADX INFO: renamed from: d */
    public final Object getF45077a() {
        return this.f45080a;
    }
}
