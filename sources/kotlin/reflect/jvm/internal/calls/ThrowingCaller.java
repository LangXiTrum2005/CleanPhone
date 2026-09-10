package kotlin.reflect.jvm.internal.calls;

import java.lang.reflect.Member;
import java.lang.reflect.Type;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\bÀ\u0002\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001¨\u0006\u0003"}, d2 = {"Lkotlin/reflect/jvm/internal/calls/ThrowingCaller;", "Lkotlin/reflect/jvm/internal/calls/Caller;", "", "kotlin-reflection"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class ThrowingCaller implements Caller {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ThrowingCaller f43452a = new ThrowingCaller();

    @Override // kotlin.reflect.jvm.internal.calls.Caller
    public final List a() {
        return EmptyList.X;
    }

    @Override // kotlin.reflect.jvm.internal.calls.Caller
    public final /* bridge */ /* synthetic */ Member b() {
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.calls.Caller
    public final Object call(Object[] args) {
        Intrinsics.f(args, "args");
        throw new UnsupportedOperationException("call/callBy are not supported for this declaration.");
    }

    @Override // kotlin.reflect.jvm.internal.calls.Caller
    public final Type getReturnType() {
        Class TYPE = Void.TYPE;
        Intrinsics.e(TYPE, "TYPE");
        return TYPE;
    }
}
