package kotlin.reflect.jvm.internal.impl.builtins.functions;

import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.GivenFunctionsMemberScope;

/* JADX INFO: loaded from: classes7.dex */
public final class FunctionClassScope extends GivenFunctionsMemberScope {

    public /* synthetic */ class WhenMappings {
        static {
            int[] iArr = new int[FunctionClassKind.values().length];
            try {
                iArr[FunctionClassKind.e0.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[FunctionClassKind.f0.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.GivenFunctionsMemberScope
    public final List h() {
        FunctionClassDescriptor functionClassDescriptor = (FunctionClassDescriptor) this.f44342b;
        int iOrdinal = functionClassDescriptor.h0.ordinal();
        if (iOrdinal != 0) {
            return iOrdinal != 1 ? EmptyList.X : CollectionsKt.H(FunctionInvokeDescriptor.Factory.a(functionClassDescriptor, true));
        }
        return CollectionsKt.H(FunctionInvokeDescriptor.Factory.a(functionClassDescriptor, false));
    }
}
