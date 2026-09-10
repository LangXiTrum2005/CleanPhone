package kotlin.reflect.jvm.internal.impl.util;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType;
import kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaMethodDescriptor;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;

/* JADX INFO: loaded from: classes7.dex */
public abstract class ReturnsCheck implements Check {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Lambda f44630a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f44631b;

    public static final class ReturnsBoolean extends ReturnsCheck {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final ReturnsBoolean f44632c = new ReturnsBoolean("Boolean", AnonymousClass1.X);

        /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.util.ReturnsCheck$ReturnsBoolean$1, reason: invalid class name */
        final class AnonymousClass1 extends Lambda implements Function1<KotlinBuiltIns, KotlinType> {
            public static final AnonymousClass1 X = new AnonymousClass1(1);

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                KotlinBuiltIns kotlinBuiltIns = (KotlinBuiltIns) obj;
                Intrinsics.f(kotlinBuiltIns, "$this$null");
                SimpleType simpleTypeR = kotlinBuiltIns.r(PrimitiveType.BOOLEAN);
                if (simpleTypeR != null) {
                    return simpleTypeR;
                }
                KotlinBuiltIns.a(63);
                throw null;
            }
        }
    }

    public static final class ReturnsInt extends ReturnsCheck {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final ReturnsInt f44633c = new ReturnsInt("Int", AnonymousClass1.X);

        /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.util.ReturnsCheck$ReturnsInt$1, reason: invalid class name */
        final class AnonymousClass1 extends Lambda implements Function1<KotlinBuiltIns, KotlinType> {
            public static final AnonymousClass1 X = new AnonymousClass1(1);

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                KotlinBuiltIns kotlinBuiltIns = (KotlinBuiltIns) obj;
                Intrinsics.f(kotlinBuiltIns, "$this$null");
                SimpleType simpleTypeR = kotlinBuiltIns.r(PrimitiveType.INT);
                if (simpleTypeR != null) {
                    return simpleTypeR;
                }
                KotlinBuiltIns.a(58);
                throw null;
            }
        }
    }

    public static final class ReturnsUnit extends ReturnsCheck {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final ReturnsUnit f44634c = new ReturnsUnit("Unit", AnonymousClass1.X);

        /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.util.ReturnsCheck$ReturnsUnit$1, reason: invalid class name */
        final class AnonymousClass1 extends Lambda implements Function1<KotlinBuiltIns, KotlinType> {
            public static final AnonymousClass1 X = new AnonymousClass1(1);

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                KotlinBuiltIns kotlinBuiltIns = (KotlinBuiltIns) obj;
                Intrinsics.f(kotlinBuiltIns, "$this$null");
                SimpleType unitType = kotlinBuiltIns.v();
                Intrinsics.e(unitType, "unitType");
                return unitType;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ReturnsCheck(String str, Function1 function1) {
        this.f44630a = (Lambda) function1;
        this.f44631b = "must return ".concat(str);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [kotlin.jvm.functions.Function1, kotlin.jvm.internal.Lambda] */
    @Override // kotlin.reflect.jvm.internal.impl.util.Check
    public final boolean a(JavaMethodDescriptor javaMethodDescriptor) {
        return Intrinsics.a(javaMethodDescriptor.h0, this.f44630a.invoke(DescriptorUtilsKt.e(javaMethodDescriptor)));
    }

    @Override // kotlin.reflect.jvm.internal.impl.util.Check
    public final String b(JavaMethodDescriptor javaMethodDescriptor) {
        return Check.DefaultImpls.a(this, javaMethodDescriptor);
    }

    @Override // kotlin.reflect.jvm.internal.impl.util.Check
    public final String getDescription() {
        return this.f44631b;
    }
}
