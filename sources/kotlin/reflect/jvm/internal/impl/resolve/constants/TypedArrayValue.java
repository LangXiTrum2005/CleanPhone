package kotlin.reflect.jvm.internal.impl.resolve.constants;

import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;

/* JADX INFO: loaded from: classes7.dex */
public final class TypedArrayValue extends ArrayValue {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final KotlinType f44311c;

    public TypedArrayValue(List list, final KotlinType kotlinType) {
        super(list, new Function1<ModuleDescriptor, KotlinType>() { // from class: kotlin.reflect.jvm.internal.impl.resolve.constants.TypedArrayValue.1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                ModuleDescriptor it = (ModuleDescriptor) obj;
                Intrinsics.f(it, "it");
                return kotlinType;
            }
        });
        this.f44311c = kotlinType;
    }
}
