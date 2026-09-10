package kotlin.reflect.jvm.internal.impl.builtins;

import java.util.Set;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function0;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.Name;

/* JADX INFO: loaded from: classes7.dex */
public enum PrimitiveType {
    BOOLEAN("Boolean"),
    CHAR("Char"),
    BYTE("Byte"),
    SHORT("Short"),
    INT("Int"),
    FLOAT("Float"),
    LONG("Long"),
    DOUBLE("Double");

    public final Name X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final Name f43467Y;
    public final Object Z;
    public final Object e0;
    public static final Set f0 = ArraysKt.O(new PrimitiveType[]{CHAR, BYTE, SHORT, INT, FLOAT, LONG, DOUBLE});

    public static final class Companion {
    }

    PrimitiveType(String str) {
        this.X = Name.g(str);
        this.f43467Y = Name.g(str.concat("Array"));
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.f43248Y;
        this.Z = LazyKt.a(lazyThreadSafetyMode, new Function0<FqName>() { // from class: kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType$typeFqName$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return StandardNames.k.c(this.X.X);
            }
        });
        this.e0 = LazyKt.a(lazyThreadSafetyMode, new Function0<FqName>() { // from class: kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType$arrayTypeFqName$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return StandardNames.k.c(this.X.f43467Y);
            }
        });
    }
}
