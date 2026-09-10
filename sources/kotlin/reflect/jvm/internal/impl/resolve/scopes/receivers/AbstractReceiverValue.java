package kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers;

import kotlin.reflect.jvm.internal.impl.types.KotlinType;

/* JADX INFO: loaded from: classes7.dex */
public abstract class AbstractReceiverValue implements ReceiverValue {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final KotlinType f44359a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ReceiverValue f44360b;

    public AbstractReceiverValue(KotlinType kotlinType, ReceiverValue receiverValue) {
        if (kotlinType == null) {
            c(0);
            throw null;
        }
        this.f44359a = kotlinType;
        this.f44360b = receiverValue == null ? this : receiverValue;
    }

    public static /* synthetic */ void c(int i2) {
        String str = (i2 == 1 || i2 == 2) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i2 == 1 || i2 == 2) ? 2 : 3];
        if (i2 == 1 || i2 == 2) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/resolve/scopes/receivers/AbstractReceiverValue";
        } else {
            objArr[0] = "receiverType";
        }
        if (i2 == 1) {
            objArr[1] = "getType";
        } else if (i2 != 2) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/scopes/receivers/AbstractReceiverValue";
        } else {
            objArr[1] = "getOriginal";
        }
        if (i2 != 1 && i2 != 2) {
            objArr[2] = "<init>";
        }
        String str2 = String.format(str, objArr);
        if (i2 != 1 && i2 != 2) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.ReceiverValue
    public final KotlinType getType() {
        KotlinType kotlinType = this.f44359a;
        if (kotlinType != null) {
            return kotlinType;
        }
        c(1);
        throw null;
    }
}
