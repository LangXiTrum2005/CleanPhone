package kotlin.reflect.jvm.internal.impl.resolve.constants;

import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.builtins.StandardNames;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;

/* JADX INFO: loaded from: classes7.dex */
public class ArrayValue extends ConstantValue<List<? extends ConstantValue<?>>> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Lambda f44299b;

    /* JADX WARN: Multi-variable type inference failed */
    public ArrayValue(List list, Function1 function1) {
        super(list);
        this.f44299b = (Lambda) function1;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [kotlin.jvm.functions.Function1, kotlin.jvm.internal.Lambda] */
    @Override // kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue
    public final KotlinType a(ModuleDescriptor module) {
        Intrinsics.f(module, "module");
        KotlinType kotlinType = (KotlinType) this.f44299b.invoke(module);
        if (!KotlinBuiltIns.x(kotlinType) && !KotlinBuiltIns.E(kotlinType) && !KotlinBuiltIns.A(kotlinType, StandardNames.FqNames.f43492V.i()) && !KotlinBuiltIns.A(kotlinType, StandardNames.FqNames.W.i()) && !KotlinBuiltIns.A(kotlinType, StandardNames.FqNames.X.i())) {
            KotlinBuiltIns.A(kotlinType, StandardNames.FqNames.f43493Y.i());
        }
        return kotlinType;
    }
}
