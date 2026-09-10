package kotlin.reflect.jvm.internal.impl.resolve.constants;

import com.p004ironsource.d9;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.TypeAttributes;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorScopeKind;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorUtils;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes7.dex */
public final class IntegerLiteralTypeConstructor implements TypeConstructor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkedHashSet f44307a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Lazy f44308b;

    public static final class Companion {

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        public static final class Mode {
            public static final /* synthetic */ Mode[] X = {new Mode("COMMON_SUPER_TYPE", 0), new Mode("INTERSECTION_TYPE", 1)};

            /* JADX INFO: Fake field, exist only in values array */
            Mode EF5;

            public static Mode valueOf(String str) {
                return (Mode) Enum.valueOf(Mode.class, str);
            }

            public static Mode[] values() {
                return (Mode[]) X.clone();
            }
        }

        public /* synthetic */ class WhenMappings {
            static {
                int[] iArr = new int[Mode.values().length];
                try {
                    iArr[0] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[1] = 2;
                } catch (NoSuchFieldError unused2) {
                }
            }
        }
    }

    public IntegerLiteralTypeConstructor(LinkedHashSet linkedHashSet) {
        TypeAttributes.f44529Y.getClass();
        TypeAttributes attributes = TypeAttributes.Z;
        Intrinsics.f(attributes, "attributes");
        KotlinTypeFactory.e(EmptyList.X, ErrorUtils.a(ErrorScopeKind.INTEGER_LITERAL_TYPE_SCOPE, true, "unknown integer literal type"), attributes, this, false);
        this.f44308b = LazyKt.b(new Function0<List<SimpleType>>() { // from class: kotlin.reflect.jvm.internal.impl.resolve.constants.IntegerLiteralTypeConstructor$supertypes$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                this.X.getClass();
                throw null;
            }
        });
        this.f44307a = linkedHashSet;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    public final ClassifierDescriptor c() {
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    public final Collection d() {
        return (List) this.f44308b.getX();
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
        StringBuilder sb = new StringBuilder("IntegerLiteralType");
        sb.append(d9.i.d + CollectionsKt.D(this.f44307a, ",", null, null, IntegerLiteralTypeConstructor$valueToString$1.X, 30) + AbstractJsonLexerKt.END_LIST);
        return sb.toString();
    }
}
