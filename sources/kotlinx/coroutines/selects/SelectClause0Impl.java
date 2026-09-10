package kotlinx.coroutines.selects;

import kotlin.Metadata;
import kotlin.jvm.functions.Function3;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkotlinx/coroutines/selects/SelectClause0Impl;", "Lkotlinx/coroutines/selects/SelectClause0;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SelectClause0Impl implements SelectClause0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f45077a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Function3 f45078b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Function3 f45079c;

    public SelectClause0Impl(Object obj) {
        OnTimeout$selectClause$1 onTimeout$selectClause$1 = OnTimeout$selectClause$1.X;
        this.f45077a = obj;
        this.f45078b = onTimeout$selectClause$1;
        Function3 function3 = SelectKt.f45095a;
        this.f45079c = SelectKt$DUMMY_PROCESS_RESULT_FUNCTION$1.X;
    }

    @Override // kotlinx.coroutines.selects.SelectClause
    /* JADX INFO: renamed from: a, reason: from getter */
    public final Function3 getF45078b() {
        return this.f45078b;
    }

    @Override // kotlinx.coroutines.selects.SelectClause
    public final Function3 b() {
        return null;
    }

    @Override // kotlinx.coroutines.selects.SelectClause
    /* JADX INFO: renamed from: c, reason: from getter */
    public final Function3 getF45079c() {
        return this.f45079c;
    }

    @Override // kotlinx.coroutines.selects.SelectClause
    /* JADX INFO: renamed from: d, reason: from getter */
    public final Object getF45077a() {
        return this.f45077a;
    }
}
