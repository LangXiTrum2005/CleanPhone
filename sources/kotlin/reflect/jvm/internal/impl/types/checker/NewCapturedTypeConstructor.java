package kotlin.reflect.jvm.internal.impl.types.checker;

import java.util.Collection;
import java.util.List;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.collections.EmptyList;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.resolve.calls.inference.CapturedTypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.TypeProjection;
import kotlin.reflect.jvm.internal.impl.types.UnwrappedType;
import kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;

/* JADX INFO: loaded from: classes7.dex */
public final class NewCapturedTypeConstructor implements CapturedTypeConstructor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TypeProjection f44567a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Function0 f44568b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final NewCapturedTypeConstructor f44569c;
    public final TypeParameterDescriptor d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f44570e;

    public /* synthetic */ NewCapturedTypeConstructor(TypeProjection typeProjection, Function0 function0, TypeParameterDescriptor typeParameterDescriptor, int i2) {
        this(typeProjection, (i2 & 2) != 0 ? null : function0, (NewCapturedTypeConstructor) null, (i2 & 8) != 0 ? null : typeParameterDescriptor);
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.calls.inference.CapturedTypeConstructor
    public final TypeProjection b() {
        return this.f44567a;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    public final ClassifierDescriptor c() {
        return null;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    public final Collection d() {
        Collection collection = (List) this.f44570e.getX();
        if (collection == null) {
            collection = EmptyList.X;
        }
        return collection;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    public final boolean e() {
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!NewCapturedTypeConstructor.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        Intrinsics.d(obj, "null cannot be cast to non-null type org.jetbrains.kotlin.types.checker.NewCapturedTypeConstructor");
        NewCapturedTypeConstructor newCapturedTypeConstructor = (NewCapturedTypeConstructor) obj;
        NewCapturedTypeConstructor newCapturedTypeConstructor2 = this.f44569c;
        if (newCapturedTypeConstructor2 == null) {
            newCapturedTypeConstructor2 = this;
        }
        NewCapturedTypeConstructor newCapturedTypeConstructor3 = newCapturedTypeConstructor.f44569c;
        if (newCapturedTypeConstructor3 != null) {
            newCapturedTypeConstructor = newCapturedTypeConstructor3;
        }
        return newCapturedTypeConstructor2 == newCapturedTypeConstructor;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    public final List getParameters() {
        return EmptyList.X;
    }

    public final int hashCode() {
        NewCapturedTypeConstructor newCapturedTypeConstructor = this.f44569c;
        return newCapturedTypeConstructor != null ? newCapturedTypeConstructor.hashCode() : super.hashCode();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    public final KotlinBuiltIns k() {
        KotlinType type = this.f44567a.getType();
        Intrinsics.e(type, "projection.type");
        return TypeUtilsKt.f(type);
    }

    public final String toString() {
        return "CapturedType(" + this.f44567a + ')';
    }

    public NewCapturedTypeConstructor(TypeProjection projection, Function0 function0, NewCapturedTypeConstructor newCapturedTypeConstructor, TypeParameterDescriptor typeParameterDescriptor) {
        Intrinsics.f(projection, "projection");
        this.f44567a = projection;
        this.f44568b = function0;
        this.f44569c = newCapturedTypeConstructor;
        this.d = typeParameterDescriptor;
        this.f44570e = LazyKt.a(LazyThreadSafetyMode.f43248Y, new Function0<List<? extends UnwrappedType>>() { // from class: kotlin.reflect.jvm.internal.impl.types.checker.NewCapturedTypeConstructor$_supertypes$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Function0 function1 = this.X.f44568b;
                if (function1 != null) {
                    return (List) function1.invoke();
                }
                return null;
            }
        });
    }
}
