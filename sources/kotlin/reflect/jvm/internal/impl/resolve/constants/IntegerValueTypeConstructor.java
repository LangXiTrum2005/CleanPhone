package kotlin.reflect.jvm.internal.impl.resolve.constants;

import java.util.Collection;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructor;

/* JADX INFO: loaded from: classes7.dex */
public final class IntegerValueTypeConstructor implements TypeConstructor {
    @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    public final /* bridge */ /* synthetic */ ClassifierDescriptor c() {
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    public final Collection d() {
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    public final boolean e() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    public final List getParameters() {
        return EmptyList.X;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    public final KotlinBuiltIns k() {
        throw null;
    }

    public final String toString() {
        return "IntegerValueType(0)";
    }
}
