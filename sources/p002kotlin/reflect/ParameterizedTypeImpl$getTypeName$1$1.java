package p002kotlin.reflect;

import java.lang.reflect.Type;
import p002kotlin.Metadata;
import p002kotlin.jvm.functions.Function1;
import p002kotlin.jvm.internal.FunctionReferenceImpl;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: TypesJVM.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
public final /* synthetic */ class ParameterizedTypeImpl$getTypeName$1$1 extends FunctionReferenceImpl implements Function1<Type, String> {
    public static final ParameterizedTypeImpl$getTypeName$1$1 INSTANCE = new ParameterizedTypeImpl$getTypeName$1$1();

    public ParameterizedTypeImpl$getTypeName$1$1() {
        super(1, TypesJVMKt.class, "typeToString", "typeToString(Ljava/lang/reflect/Type;)Ljava/lang/String;", 1);
    }

    @Override // p002kotlin.jvm.functions.Function1
    public final String invoke(Type p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return TypesJVMKt.impromptu(p0);
    }
}
