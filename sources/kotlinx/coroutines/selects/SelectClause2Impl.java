package kotlinx.coroutines.selects;

import kotlin.Metadata;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlinx.coroutines.channels.Channel;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0003¨\u0006\u0004"}, d2 = {"Lkotlinx/coroutines/selects/SelectClause2Impl;", "P", "Q", "Lkotlinx/coroutines/selects/SelectClause2;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SelectClause2Impl<P, Q> implements SelectClause2<P, Q> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Channel f45083a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final FunctionReferenceImpl f45084b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Function3 f45085c;

    /* JADX WARN: Multi-variable type inference failed */
    public SelectClause2Impl(Channel channel, Function3 function3, Function3 function4) {
        this.f45083a = channel;
        this.f45084b = (FunctionReferenceImpl) function3;
        this.f45085c = function4;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [kotlin.jvm.functions.Function3, kotlin.jvm.internal.FunctionReferenceImpl] */
    @Override // kotlinx.coroutines.selects.SelectClause
    public final Function3 a() {
        return this.f45084b;
    }

    @Override // kotlinx.coroutines.selects.SelectClause
    /* JADX INFO: renamed from: c, reason: from getter */
    public final Function3 getF45085c() {
        return this.f45085c;
    }
}
