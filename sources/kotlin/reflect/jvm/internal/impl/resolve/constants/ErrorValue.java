package kotlin.reflect.jvm.internal.impl.resolve.constants;

import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorUtils;

/* JADX INFO: loaded from: classes7.dex */
public abstract class ErrorValue extends ConstantValue<Unit> {

    public static final class Companion {
    }

    public static final class ErrorValueWithMessage extends ErrorValue {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f44306b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ErrorValueWithMessage(String message) {
            super(Unit.f43263a);
            Intrinsics.f(message, "message");
            this.f44306b = message;
        }

        @Override // kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue
        public final KotlinType a(ModuleDescriptor module) {
            Intrinsics.f(module, "module");
            return ErrorUtils.c(ErrorTypeKind.ERROR_CONSTANT_VALUE, this.f44306b);
        }

        @Override // kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue
        public final String toString() {
            return this.f44306b;
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue
    public final Object b() {
        throw new UnsupportedOperationException();
    }
}
