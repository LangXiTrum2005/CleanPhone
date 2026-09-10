package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType;

/* JADX INFO: loaded from: classes7.dex */
public final class PredefinedEnhancementInfoKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final JavaTypeQualifiers f43933a = new JavaTypeQualifiers(NullabilityQualifier.f43930Y, false);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final JavaTypeQualifiers f43934b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final JavaTypeQualifiers f43935c;
    public static final LinkedHashMap d;

    static {
        NullabilityQualifier nullabilityQualifier = NullabilityQualifier.Z;
        f43934b = new JavaTypeQualifiers(nullabilityQualifier, false);
        f43935c = new JavaTypeQualifiers(nullabilityQualifier, true);
        final String strConcat = "java/lang/".concat("Object");
        final String strConcat2 = "java/util/function/".concat("Predicate");
        final String strConcat3 = "java/util/function/".concat("Function");
        final String strConcat4 = "java/util/function/".concat("Consumer");
        final String strConcat5 = "java/util/function/".concat("BiFunction");
        final String strConcat6 = "java/util/function/".concat("BiConsumer");
        final String strConcat7 = "java/util/function/".concat("UnaryOperator");
        final String strConcat8 = "java/util/".concat("stream/Stream");
        final String strConcat9 = "java/util/".concat("Optional");
        SignatureEnhancementBuilder signatureEnhancementBuilder = new SignatureEnhancementBuilder();
        new SignatureEnhancementBuilder.ClassEnhancementBuilder(signatureEnhancementBuilder, "java/util/".concat("Iterator")).a("forEachRemaining", new Function1<SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder, Unit>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.PredefinedEnhancementInfoKt$PREDEFINED_FUNCTION_ENHANCEMENT_INFO_BY_SIGNATURE$1$1$1$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder function = (SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder) obj;
                Intrinsics.f(function, "$this$function");
                JavaTypeQualifiers javaTypeQualifiers = PredefinedEnhancementInfoKt.f43934b;
                function.a(strConcat4, javaTypeQualifiers, javaTypeQualifiers);
                return Unit.f43263a;
            }
        });
        new SignatureEnhancementBuilder.ClassEnhancementBuilder(signatureEnhancementBuilder, "java/lang/".concat("Iterable")).a("spliterator", new PredefinedEnhancementInfoKt$PREDEFINED_FUNCTION_ENHANCEMENT_INFO_BY_SIGNATURE$1$1$2$1(1));
        SignatureEnhancementBuilder.ClassEnhancementBuilder classEnhancementBuilder = new SignatureEnhancementBuilder.ClassEnhancementBuilder(signatureEnhancementBuilder, "java/util/".concat("Collection"));
        classEnhancementBuilder.a("removeIf", new Function1<SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder, Unit>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.PredefinedEnhancementInfoKt$PREDEFINED_FUNCTION_ENHANCEMENT_INFO_BY_SIGNATURE$1$1$3$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder function = (SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder) obj;
                Intrinsics.f(function, "$this$function");
                JavaTypeQualifiers javaTypeQualifiers = PredefinedEnhancementInfoKt.f43934b;
                function.a(strConcat2, javaTypeQualifiers, javaTypeQualifiers);
                function.c(JvmPrimitiveType.BOOLEAN);
                return Unit.f43263a;
            }
        });
        classEnhancementBuilder.a("stream", new Function1<SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder, Unit>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.PredefinedEnhancementInfoKt$PREDEFINED_FUNCTION_ENHANCEMENT_INFO_BY_SIGNATURE$1$1$3$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder function = (SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder) obj;
                Intrinsics.f(function, "$this$function");
                JavaTypeQualifiers javaTypeQualifiers = PredefinedEnhancementInfoKt.f43934b;
                function.b(strConcat8, javaTypeQualifiers, javaTypeQualifiers);
                return Unit.f43263a;
            }
        });
        classEnhancementBuilder.a("parallelStream", new Function1<SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder, Unit>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.PredefinedEnhancementInfoKt$PREDEFINED_FUNCTION_ENHANCEMENT_INFO_BY_SIGNATURE$1$1$3$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder function = (SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder) obj;
                Intrinsics.f(function, "$this$function");
                JavaTypeQualifiers javaTypeQualifiers = PredefinedEnhancementInfoKt.f43934b;
                function.b(strConcat8, javaTypeQualifiers, javaTypeQualifiers);
                return Unit.f43263a;
            }
        });
        new SignatureEnhancementBuilder.ClassEnhancementBuilder(signatureEnhancementBuilder, "java/util/".concat("List")).a("replaceAll", new Function1<SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder, Unit>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.PredefinedEnhancementInfoKt$PREDEFINED_FUNCTION_ENHANCEMENT_INFO_BY_SIGNATURE$1$1$4$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder function = (SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder) obj;
                Intrinsics.f(function, "$this$function");
                JavaTypeQualifiers javaTypeQualifiers = PredefinedEnhancementInfoKt.f43934b;
                function.a(strConcat7, javaTypeQualifiers, javaTypeQualifiers);
                return Unit.f43263a;
            }
        });
        SignatureEnhancementBuilder.ClassEnhancementBuilder classEnhancementBuilder2 = new SignatureEnhancementBuilder.ClassEnhancementBuilder(signatureEnhancementBuilder, "java/util/".concat("Map"));
        classEnhancementBuilder2.a("forEach", new Function1<SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder, Unit>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.PredefinedEnhancementInfoKt$PREDEFINED_FUNCTION_ENHANCEMENT_INFO_BY_SIGNATURE$1$1$5$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder function = (SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder) obj;
                Intrinsics.f(function, "$this$function");
                JavaTypeQualifiers javaTypeQualifiers = PredefinedEnhancementInfoKt.f43934b;
                function.a(strConcat6, javaTypeQualifiers, javaTypeQualifiers, javaTypeQualifiers);
                return Unit.f43263a;
            }
        });
        classEnhancementBuilder2.a("putIfAbsent", new Function1<SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder, Unit>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.PredefinedEnhancementInfoKt$PREDEFINED_FUNCTION_ENHANCEMENT_INFO_BY_SIGNATURE$1$1$5$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder function = (SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder) obj;
                Intrinsics.f(function, "$this$function");
                JavaTypeQualifiers javaTypeQualifiers = PredefinedEnhancementInfoKt.f43934b;
                String str = strConcat;
                function.a(str, javaTypeQualifiers);
                function.a(str, javaTypeQualifiers);
                function.b(str, PredefinedEnhancementInfoKt.f43933a);
                return Unit.f43263a;
            }
        });
        classEnhancementBuilder2.a("replace", new Function1<SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder, Unit>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.PredefinedEnhancementInfoKt$PREDEFINED_FUNCTION_ENHANCEMENT_INFO_BY_SIGNATURE$1$1$5$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder function = (SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder) obj;
                Intrinsics.f(function, "$this$function");
                JavaTypeQualifiers javaTypeQualifiers = PredefinedEnhancementInfoKt.f43934b;
                String str = strConcat;
                function.a(str, javaTypeQualifiers);
                function.a(str, javaTypeQualifiers);
                function.b(str, PredefinedEnhancementInfoKt.f43933a);
                return Unit.f43263a;
            }
        });
        classEnhancementBuilder2.a("replace", new Function1<SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder, Unit>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.PredefinedEnhancementInfoKt$PREDEFINED_FUNCTION_ENHANCEMENT_INFO_BY_SIGNATURE$1$1$5$4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder function = (SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder) obj;
                Intrinsics.f(function, "$this$function");
                JavaTypeQualifiers javaTypeQualifiers = PredefinedEnhancementInfoKt.f43934b;
                String str = strConcat;
                function.a(str, javaTypeQualifiers);
                function.a(str, javaTypeQualifiers);
                function.a(str, javaTypeQualifiers);
                function.c(JvmPrimitiveType.BOOLEAN);
                return Unit.f43263a;
            }
        });
        classEnhancementBuilder2.a("replaceAll", new Function1<SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder, Unit>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.PredefinedEnhancementInfoKt$PREDEFINED_FUNCTION_ENHANCEMENT_INFO_BY_SIGNATURE$1$1$5$5
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder function = (SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder) obj;
                Intrinsics.f(function, "$this$function");
                JavaTypeQualifiers javaTypeQualifiers = PredefinedEnhancementInfoKt.f43934b;
                function.a(strConcat5, javaTypeQualifiers, javaTypeQualifiers, javaTypeQualifiers, javaTypeQualifiers);
                return Unit.f43263a;
            }
        });
        classEnhancementBuilder2.a("compute", new Function1<SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder, Unit>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.PredefinedEnhancementInfoKt$PREDEFINED_FUNCTION_ENHANCEMENT_INFO_BY_SIGNATURE$1$1$5$6
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder function = (SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder) obj;
                Intrinsics.f(function, "$this$function");
                JavaTypeQualifiers javaTypeQualifiers = PredefinedEnhancementInfoKt.f43934b;
                String str = strConcat;
                function.a(str, javaTypeQualifiers);
                JavaTypeQualifiers javaTypeQualifiers2 = PredefinedEnhancementInfoKt.f43933a;
                function.a(strConcat5, javaTypeQualifiers, javaTypeQualifiers, javaTypeQualifiers2, javaTypeQualifiers2);
                function.b(str, javaTypeQualifiers2);
                return Unit.f43263a;
            }
        });
        classEnhancementBuilder2.a("computeIfAbsent", new Function1<SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder, Unit>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.PredefinedEnhancementInfoKt$PREDEFINED_FUNCTION_ENHANCEMENT_INFO_BY_SIGNATURE$1$1$5$7
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder function = (SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder) obj;
                Intrinsics.f(function, "$this$function");
                JavaTypeQualifiers javaTypeQualifiers = PredefinedEnhancementInfoKt.f43934b;
                String str = strConcat;
                function.a(str, javaTypeQualifiers);
                function.a(strConcat3, javaTypeQualifiers, javaTypeQualifiers, javaTypeQualifiers);
                function.b(str, javaTypeQualifiers);
                return Unit.f43263a;
            }
        });
        classEnhancementBuilder2.a("computeIfPresent", new Function1<SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder, Unit>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.PredefinedEnhancementInfoKt$PREDEFINED_FUNCTION_ENHANCEMENT_INFO_BY_SIGNATURE$1$1$5$8
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder function = (SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder) obj;
                Intrinsics.f(function, "$this$function");
                JavaTypeQualifiers javaTypeQualifiers = PredefinedEnhancementInfoKt.f43934b;
                String str = strConcat;
                function.a(str, javaTypeQualifiers);
                JavaTypeQualifiers javaTypeQualifiers2 = PredefinedEnhancementInfoKt.f43935c;
                JavaTypeQualifiers javaTypeQualifiers3 = PredefinedEnhancementInfoKt.f43933a;
                function.a(strConcat5, javaTypeQualifiers, javaTypeQualifiers, javaTypeQualifiers2, javaTypeQualifiers3);
                function.b(str, javaTypeQualifiers3);
                return Unit.f43263a;
            }
        });
        classEnhancementBuilder2.a("merge", new Function1<SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder, Unit>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.PredefinedEnhancementInfoKt$PREDEFINED_FUNCTION_ENHANCEMENT_INFO_BY_SIGNATURE$1$1$5$9
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder function = (SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder) obj;
                Intrinsics.f(function, "$this$function");
                JavaTypeQualifiers javaTypeQualifiers = PredefinedEnhancementInfoKt.f43934b;
                String str = strConcat;
                function.a(str, javaTypeQualifiers);
                JavaTypeQualifiers javaTypeQualifiers2 = PredefinedEnhancementInfoKt.f43935c;
                function.a(str, javaTypeQualifiers2);
                JavaTypeQualifiers javaTypeQualifiers3 = PredefinedEnhancementInfoKt.f43933a;
                function.a(strConcat5, javaTypeQualifiers, javaTypeQualifiers2, javaTypeQualifiers2, javaTypeQualifiers3);
                function.b(str, javaTypeQualifiers3);
                return Unit.f43263a;
            }
        });
        SignatureEnhancementBuilder.ClassEnhancementBuilder classEnhancementBuilder3 = new SignatureEnhancementBuilder.ClassEnhancementBuilder(signatureEnhancementBuilder, strConcat9);
        classEnhancementBuilder3.a("empty", new Function1<SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder, Unit>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.PredefinedEnhancementInfoKt$PREDEFINED_FUNCTION_ENHANCEMENT_INFO_BY_SIGNATURE$1$1$6$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder function = (SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder) obj;
                Intrinsics.f(function, "$this$function");
                function.b(strConcat9, PredefinedEnhancementInfoKt.f43934b, PredefinedEnhancementInfoKt.f43935c);
                return Unit.f43263a;
            }
        });
        classEnhancementBuilder3.a("of", new Function1<SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder, Unit>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.PredefinedEnhancementInfoKt$PREDEFINED_FUNCTION_ENHANCEMENT_INFO_BY_SIGNATURE$1$1$6$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder function = (SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder) obj;
                Intrinsics.f(function, "$this$function");
                JavaTypeQualifiers javaTypeQualifiers = PredefinedEnhancementInfoKt.f43935c;
                function.a(strConcat, javaTypeQualifiers);
                function.b(strConcat9, PredefinedEnhancementInfoKt.f43934b, javaTypeQualifiers);
                return Unit.f43263a;
            }
        });
        classEnhancementBuilder3.a("ofNullable", new Function1<SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder, Unit>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.PredefinedEnhancementInfoKt$PREDEFINED_FUNCTION_ENHANCEMENT_INFO_BY_SIGNATURE$1$1$6$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder function = (SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder) obj;
                Intrinsics.f(function, "$this$function");
                function.a(strConcat, PredefinedEnhancementInfoKt.f43933a);
                function.b(strConcat9, PredefinedEnhancementInfoKt.f43934b, PredefinedEnhancementInfoKt.f43935c);
                return Unit.f43263a;
            }
        });
        classEnhancementBuilder3.a("get", new Function1<SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder, Unit>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.PredefinedEnhancementInfoKt$PREDEFINED_FUNCTION_ENHANCEMENT_INFO_BY_SIGNATURE$1$1$6$4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder function = (SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder) obj;
                Intrinsics.f(function, "$this$function");
                function.b(strConcat, PredefinedEnhancementInfoKt.f43935c);
                return Unit.f43263a;
            }
        });
        classEnhancementBuilder3.a("ifPresent", new Function1<SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder, Unit>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.PredefinedEnhancementInfoKt$PREDEFINED_FUNCTION_ENHANCEMENT_INFO_BY_SIGNATURE$1$1$6$5
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder function = (SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder) obj;
                Intrinsics.f(function, "$this$function");
                function.a(strConcat4, PredefinedEnhancementInfoKt.f43934b, PredefinedEnhancementInfoKt.f43935c);
                return Unit.f43263a;
            }
        });
        new SignatureEnhancementBuilder.ClassEnhancementBuilder(signatureEnhancementBuilder, "java/lang/".concat("ref/Reference")).a("get", new Function1<SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder, Unit>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.PredefinedEnhancementInfoKt$PREDEFINED_FUNCTION_ENHANCEMENT_INFO_BY_SIGNATURE$1$1$7$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder function = (SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder) obj;
                Intrinsics.f(function, "$this$function");
                function.b(strConcat, PredefinedEnhancementInfoKt.f43933a);
                return Unit.f43263a;
            }
        });
        new SignatureEnhancementBuilder.ClassEnhancementBuilder(signatureEnhancementBuilder, strConcat2).a("test", new Function1<SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder, Unit>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.PredefinedEnhancementInfoKt$PREDEFINED_FUNCTION_ENHANCEMENT_INFO_BY_SIGNATURE$1$1$8$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder function = (SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder) obj;
                Intrinsics.f(function, "$this$function");
                function.a(strConcat, PredefinedEnhancementInfoKt.f43934b);
                function.c(JvmPrimitiveType.BOOLEAN);
                return Unit.f43263a;
            }
        });
        new SignatureEnhancementBuilder.ClassEnhancementBuilder(signatureEnhancementBuilder, "java/util/function/".concat("BiPredicate")).a("test", new Function1<SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder, Unit>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.PredefinedEnhancementInfoKt$PREDEFINED_FUNCTION_ENHANCEMENT_INFO_BY_SIGNATURE$1$1$9$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder function = (SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder) obj;
                Intrinsics.f(function, "$this$function");
                JavaTypeQualifiers javaTypeQualifiers = PredefinedEnhancementInfoKt.f43934b;
                String str = strConcat;
                function.a(str, javaTypeQualifiers);
                function.a(str, javaTypeQualifiers);
                function.c(JvmPrimitiveType.BOOLEAN);
                return Unit.f43263a;
            }
        });
        new SignatureEnhancementBuilder.ClassEnhancementBuilder(signatureEnhancementBuilder, strConcat4).a("accept", new Function1<SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder, Unit>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.PredefinedEnhancementInfoKt$PREDEFINED_FUNCTION_ENHANCEMENT_INFO_BY_SIGNATURE$1$1$10$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder function = (SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder) obj;
                Intrinsics.f(function, "$this$function");
                function.a(strConcat, PredefinedEnhancementInfoKt.f43934b);
                return Unit.f43263a;
            }
        });
        new SignatureEnhancementBuilder.ClassEnhancementBuilder(signatureEnhancementBuilder, strConcat6).a("accept", new Function1<SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder, Unit>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.PredefinedEnhancementInfoKt$PREDEFINED_FUNCTION_ENHANCEMENT_INFO_BY_SIGNATURE$1$1$11$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder function = (SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder) obj;
                Intrinsics.f(function, "$this$function");
                JavaTypeQualifiers javaTypeQualifiers = PredefinedEnhancementInfoKt.f43934b;
                String str = strConcat;
                function.a(str, javaTypeQualifiers);
                function.a(str, javaTypeQualifiers);
                return Unit.f43263a;
            }
        });
        new SignatureEnhancementBuilder.ClassEnhancementBuilder(signatureEnhancementBuilder, strConcat3).a("apply", new Function1<SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder, Unit>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.PredefinedEnhancementInfoKt$PREDEFINED_FUNCTION_ENHANCEMENT_INFO_BY_SIGNATURE$1$1$12$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder function = (SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder) obj;
                Intrinsics.f(function, "$this$function");
                JavaTypeQualifiers javaTypeQualifiers = PredefinedEnhancementInfoKt.f43934b;
                String str = strConcat;
                function.a(str, javaTypeQualifiers);
                function.b(str, javaTypeQualifiers);
                return Unit.f43263a;
            }
        });
        new SignatureEnhancementBuilder.ClassEnhancementBuilder(signatureEnhancementBuilder, strConcat5).a("apply", new Function1<SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder, Unit>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.PredefinedEnhancementInfoKt$PREDEFINED_FUNCTION_ENHANCEMENT_INFO_BY_SIGNATURE$1$1$13$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder function = (SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder) obj;
                Intrinsics.f(function, "$this$function");
                JavaTypeQualifiers javaTypeQualifiers = PredefinedEnhancementInfoKt.f43934b;
                String str = strConcat;
                function.a(str, javaTypeQualifiers);
                function.a(str, javaTypeQualifiers);
                function.b(str, javaTypeQualifiers);
                return Unit.f43263a;
            }
        });
        new SignatureEnhancementBuilder.ClassEnhancementBuilder(signatureEnhancementBuilder, "java/util/function/".concat("Supplier")).a("get", new Function1<SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder, Unit>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.PredefinedEnhancementInfoKt$PREDEFINED_FUNCTION_ENHANCEMENT_INFO_BY_SIGNATURE$1$1$14$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder function = (SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder) obj;
                Intrinsics.f(function, "$this$function");
                function.b(strConcat, PredefinedEnhancementInfoKt.f43934b);
                return Unit.f43263a;
            }
        });
        d = signatureEnhancementBuilder.f43945a;
    }
}
