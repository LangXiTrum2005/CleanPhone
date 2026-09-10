package kotlin.reflect.jvm.internal.calls;

import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001:\u0002\u0003\u0004\u0082\u0001\u0002\u0005\u0006¨\u0006\u0007"}, d2 = {"Lkotlin/reflect/jvm/internal/calls/InternalUnderlyingValOfInlineClass;", "Lkotlin/reflect/jvm/internal/calls/Caller;", "Ljava/lang/reflect/Method;", "Bound", "Unbound", "Lkotlin/reflect/jvm/internal/calls/InternalUnderlyingValOfInlineClass$Bound;", "Lkotlin/reflect/jvm/internal/calls/InternalUnderlyingValOfInlineClass$Unbound;", "kotlin-reflection"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class InternalUnderlyingValOfInlineClass implements Caller<Method> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Method f43449a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f43450b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Class f43451c;

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lkotlin/reflect/jvm/internal/calls/InternalUnderlyingValOfInlineClass$Bound;", "Lkotlin/reflect/jvm/internal/calls/InternalUnderlyingValOfInlineClass;", "Lkotlin/reflect/jvm/internal/calls/BoundCaller;", "kotlin-reflection"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Bound extends InternalUnderlyingValOfInlineClass implements BoundCaller {
        public final Object d;

        public Bound(Object obj, Method method) {
            super(method, EmptyList.X);
            this.d = obj;
        }

        @Override // kotlin.reflect.jvm.internal.calls.Caller
        public final Object call(Object[] args) {
            Intrinsics.f(args, "args");
            Caller.DefaultImpls.a(this, args);
            return this.f43449a.invoke(this.d, Arrays.copyOf(args, args.length));
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkotlin/reflect/jvm/internal/calls/InternalUnderlyingValOfInlineClass$Unbound;", "Lkotlin/reflect/jvm/internal/calls/InternalUnderlyingValOfInlineClass;", "kotlin-reflection"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Unbound extends InternalUnderlyingValOfInlineClass {
        @Override // kotlin.reflect.jvm.internal.calls.Caller
        public final Object call(Object[] args) {
            Intrinsics.f(args, "args");
            Caller.DefaultImpls.a(this, args);
            Object obj = args[0];
            Object[] objArrR = args.length <= 1 ? new Object[0] : ArraysKt.r(args, 1, args.length);
            return this.f43449a.invoke(obj, Arrays.copyOf(objArrR, objArrR.length));
        }
    }

    public InternalUnderlyingValOfInlineClass(Method method, List list) {
        this.f43449a = method;
        this.f43450b = list;
        Class<?> returnType = method.getReturnType();
        Intrinsics.e(returnType, "unboxMethod.returnType");
        this.f43451c = returnType;
    }

    @Override // kotlin.reflect.jvm.internal.calls.Caller
    /* JADX INFO: renamed from: a, reason: from getter */
    public final List getF43450b() {
        return this.f43450b;
    }

    @Override // kotlin.reflect.jvm.internal.calls.Caller
    public final /* bridge */ /* synthetic */ Member b() {
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.calls.Caller
    public final Type getReturnType() {
        return this.f43451c;
    }
}
