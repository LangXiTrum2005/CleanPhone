package p002kotlin.reflect.jvm.internal.impl.resolve.constants;

import java.util.List;
import p002kotlin.jvm.functions.Function1;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.reflect.jvm.internal.impl.descriptors.trm;
import p002kotlin.reflect.jvm.internal.impl.types.oilcan;

/* JADX INFO: compiled from: constantValues.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class TypedArrayValue extends saneness {

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final oilcan f31323saneness;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TypedArrayValue(List<? extends competently<?>> value, final oilcan type) {
        super(value, new Function1<trm, oilcan>() { // from class: kotlin.reflect.jvm.internal.impl.resolve.constants.TypedArrayValue.1
            {
                super(1);
            }

            @Override // p002kotlin.jvm.functions.Function1
            public final oilcan invoke(trm it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return type;
            }
        });
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(type, "type");
        this.f31323saneness = type;
    }

    public final oilcan dern() {
        return this.f31323saneness;
    }
}
