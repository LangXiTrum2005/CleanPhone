package p002kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import java.util.Map;
import p002kotlin.Unit;
import p002kotlin.jvm.functions.Function1;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.reflect.jvm.internal.impl.load.kotlin.SignatureBuildingComponents;
import p002kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType;

/* JADX INFO: compiled from: predefinedEnhancementInfo.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class PredefinedEnhancementInfoKt {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public static final wireman f30621attabal = new wireman(NullabilityQualifier.NULLABLE, null, false, false, 8, null);

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public static final wireman f30622dern;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public static final wireman f30623saneness;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public static final Map<String, competently> f30624wireman;

    static {
        NullabilityQualifier nullabilityQualifier = NullabilityQualifier.NOT_NULL;
        f30623saneness = new wireman(nullabilityQualifier, null, false, false, 8, null);
        f30622dern = new wireman(nullabilityQualifier, null, true, false, 8, null);
        final SignatureBuildingComponents signatureBuildingComponents = SignatureBuildingComponents.f30687attabal;
        final String strImpromptu = signatureBuildingComponents.impromptu("Object");
        final String strCompetently = signatureBuildingComponents.competently("Predicate");
        final String strCompetently2 = signatureBuildingComponents.competently("Function");
        final String strCompetently3 = signatureBuildingComponents.competently("Consumer");
        final String strCompetently4 = signatureBuildingComponents.competently("BiFunction");
        final String strCompetently5 = signatureBuildingComponents.competently("BiConsumer");
        final String strCompetently6 = signatureBuildingComponents.competently("UnaryOperator");
        final String strTaiyuan = signatureBuildingComponents.taiyuan("stream/Stream");
        final String strTaiyuan2 = signatureBuildingComponents.taiyuan("Optional");
        impromptu impromptuVar = new impromptu();
        new impromptu.attabal(impromptuVar, signatureBuildingComponents.taiyuan("Iterator")).attabal("forEachRemaining", new Function1<impromptu.attabal.C0682attabal, Unit>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.PredefinedEnhancementInfoKt$PREDEFINED_FUNCTION_ENHANCEMENT_INFO_BY_SIGNATURE$1$1$1$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // p002kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(impromptu.attabal.C0682attabal c0682attabal) {
                invoke2(c0682attabal);
                return Unit.f29295attabal;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(impromptu.attabal.C0682attabal function) {
                Intrinsics.checkNotNullParameter(function, "$this$function");
                function.saneness(strCompetently3, PredefinedEnhancementInfoKt.f30623saneness, PredefinedEnhancementInfoKt.f30623saneness);
            }
        });
        new impromptu.attabal(impromptuVar, signatureBuildingComponents.impromptu("Iterable")).attabal("spliterator", new Function1<impromptu.attabal.C0682attabal, Unit>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.PredefinedEnhancementInfoKt$PREDEFINED_FUNCTION_ENHANCEMENT_INFO_BY_SIGNATURE$1$1$2$1
            {
                super(1);
            }

            @Override // p002kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(impromptu.attabal.C0682attabal c0682attabal) {
                invoke2(c0682attabal);
                return Unit.f29295attabal;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(impromptu.attabal.C0682attabal function) {
                Intrinsics.checkNotNullParameter(function, "$this$function");
                function.dern(signatureBuildingComponents.taiyuan("Spliterator"), PredefinedEnhancementInfoKt.f30623saneness, PredefinedEnhancementInfoKt.f30623saneness);
            }
        });
        impromptu.attabal attabalVar = new impromptu.attabal(impromptuVar, signatureBuildingComponents.taiyuan("Collection"));
        attabalVar.attabal("removeIf", new Function1<impromptu.attabal.C0682attabal, Unit>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.PredefinedEnhancementInfoKt$PREDEFINED_FUNCTION_ENHANCEMENT_INFO_BY_SIGNATURE$1$1$3$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // p002kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(impromptu.attabal.C0682attabal c0682attabal) {
                invoke2(c0682attabal);
                return Unit.f29295attabal;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(impromptu.attabal.C0682attabal function) {
                Intrinsics.checkNotNullParameter(function, "$this$function");
                function.saneness(strCompetently, PredefinedEnhancementInfoKt.f30623saneness, PredefinedEnhancementInfoKt.f30623saneness);
                function.wireman(JvmPrimitiveType.BOOLEAN);
            }
        });
        attabalVar.attabal("stream", new Function1<impromptu.attabal.C0682attabal, Unit>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.PredefinedEnhancementInfoKt$PREDEFINED_FUNCTION_ENHANCEMENT_INFO_BY_SIGNATURE$1$1$3$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // p002kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(impromptu.attabal.C0682attabal c0682attabal) {
                invoke2(c0682attabal);
                return Unit.f29295attabal;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(impromptu.attabal.C0682attabal function) {
                Intrinsics.checkNotNullParameter(function, "$this$function");
                function.dern(strTaiyuan, PredefinedEnhancementInfoKt.f30623saneness, PredefinedEnhancementInfoKt.f30623saneness);
            }
        });
        attabalVar.attabal("parallelStream", new Function1<impromptu.attabal.C0682attabal, Unit>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.PredefinedEnhancementInfoKt$PREDEFINED_FUNCTION_ENHANCEMENT_INFO_BY_SIGNATURE$1$1$3$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // p002kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(impromptu.attabal.C0682attabal c0682attabal) {
                invoke2(c0682attabal);
                return Unit.f29295attabal;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(impromptu.attabal.C0682attabal function) {
                Intrinsics.checkNotNullParameter(function, "$this$function");
                function.dern(strTaiyuan, PredefinedEnhancementInfoKt.f30623saneness, PredefinedEnhancementInfoKt.f30623saneness);
            }
        });
        new impromptu.attabal(impromptuVar, signatureBuildingComponents.taiyuan("List")).attabal("replaceAll", new Function1<impromptu.attabal.C0682attabal, Unit>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.PredefinedEnhancementInfoKt$PREDEFINED_FUNCTION_ENHANCEMENT_INFO_BY_SIGNATURE$1$1$4$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // p002kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(impromptu.attabal.C0682attabal c0682attabal) {
                invoke2(c0682attabal);
                return Unit.f29295attabal;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(impromptu.attabal.C0682attabal function) {
                Intrinsics.checkNotNullParameter(function, "$this$function");
                function.saneness(strCompetently6, PredefinedEnhancementInfoKt.f30623saneness, PredefinedEnhancementInfoKt.f30623saneness);
            }
        });
        impromptu.attabal attabalVar2 = new impromptu.attabal(impromptuVar, signatureBuildingComponents.taiyuan("Map"));
        attabalVar2.attabal("forEach", new Function1<impromptu.attabal.C0682attabal, Unit>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.PredefinedEnhancementInfoKt$PREDEFINED_FUNCTION_ENHANCEMENT_INFO_BY_SIGNATURE$1$1$5$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // p002kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(impromptu.attabal.C0682attabal c0682attabal) {
                invoke2(c0682attabal);
                return Unit.f29295attabal;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(impromptu.attabal.C0682attabal function) {
                Intrinsics.checkNotNullParameter(function, "$this$function");
                function.saneness(strCompetently5, PredefinedEnhancementInfoKt.f30623saneness, PredefinedEnhancementInfoKt.f30623saneness, PredefinedEnhancementInfoKt.f30623saneness);
            }
        });
        attabalVar2.attabal("putIfAbsent", new Function1<impromptu.attabal.C0682attabal, Unit>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.PredefinedEnhancementInfoKt$PREDEFINED_FUNCTION_ENHANCEMENT_INFO_BY_SIGNATURE$1$1$5$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // p002kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(impromptu.attabal.C0682attabal c0682attabal) {
                invoke2(c0682attabal);
                return Unit.f29295attabal;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(impromptu.attabal.C0682attabal function) {
                Intrinsics.checkNotNullParameter(function, "$this$function");
                function.saneness(strImpromptu, PredefinedEnhancementInfoKt.f30623saneness);
                function.saneness(strImpromptu, PredefinedEnhancementInfoKt.f30623saneness);
                function.dern(strImpromptu, PredefinedEnhancementInfoKt.f30621attabal);
            }
        });
        attabalVar2.attabal("replace", new Function1<impromptu.attabal.C0682attabal, Unit>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.PredefinedEnhancementInfoKt$PREDEFINED_FUNCTION_ENHANCEMENT_INFO_BY_SIGNATURE$1$1$5$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // p002kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(impromptu.attabal.C0682attabal c0682attabal) {
                invoke2(c0682attabal);
                return Unit.f29295attabal;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(impromptu.attabal.C0682attabal function) {
                Intrinsics.checkNotNullParameter(function, "$this$function");
                function.saneness(strImpromptu, PredefinedEnhancementInfoKt.f30623saneness);
                function.saneness(strImpromptu, PredefinedEnhancementInfoKt.f30623saneness);
                function.dern(strImpromptu, PredefinedEnhancementInfoKt.f30621attabal);
            }
        });
        attabalVar2.attabal("replace", new Function1<impromptu.attabal.C0682attabal, Unit>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.PredefinedEnhancementInfoKt$PREDEFINED_FUNCTION_ENHANCEMENT_INFO_BY_SIGNATURE$1$1$5$4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // p002kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(impromptu.attabal.C0682attabal c0682attabal) {
                invoke2(c0682attabal);
                return Unit.f29295attabal;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(impromptu.attabal.C0682attabal function) {
                Intrinsics.checkNotNullParameter(function, "$this$function");
                function.saneness(strImpromptu, PredefinedEnhancementInfoKt.f30623saneness);
                function.saneness(strImpromptu, PredefinedEnhancementInfoKt.f30623saneness);
                function.saneness(strImpromptu, PredefinedEnhancementInfoKt.f30623saneness);
                function.wireman(JvmPrimitiveType.BOOLEAN);
            }
        });
        attabalVar2.attabal("replaceAll", new Function1<impromptu.attabal.C0682attabal, Unit>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.PredefinedEnhancementInfoKt$PREDEFINED_FUNCTION_ENHANCEMENT_INFO_BY_SIGNATURE$1$1$5$5
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // p002kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(impromptu.attabal.C0682attabal c0682attabal) {
                invoke2(c0682attabal);
                return Unit.f29295attabal;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(impromptu.attabal.C0682attabal function) {
                Intrinsics.checkNotNullParameter(function, "$this$function");
                function.saneness(strCompetently4, PredefinedEnhancementInfoKt.f30623saneness, PredefinedEnhancementInfoKt.f30623saneness, PredefinedEnhancementInfoKt.f30623saneness, PredefinedEnhancementInfoKt.f30623saneness);
            }
        });
        attabalVar2.attabal("compute", new Function1<impromptu.attabal.C0682attabal, Unit>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.PredefinedEnhancementInfoKt$PREDEFINED_FUNCTION_ENHANCEMENT_INFO_BY_SIGNATURE$1$1$5$6
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // p002kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(impromptu.attabal.C0682attabal c0682attabal) {
                invoke2(c0682attabal);
                return Unit.f29295attabal;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(impromptu.attabal.C0682attabal function) {
                Intrinsics.checkNotNullParameter(function, "$this$function");
                function.saneness(strImpromptu, PredefinedEnhancementInfoKt.f30623saneness);
                function.saneness(strCompetently4, PredefinedEnhancementInfoKt.f30623saneness, PredefinedEnhancementInfoKt.f30623saneness, PredefinedEnhancementInfoKt.f30621attabal, PredefinedEnhancementInfoKt.f30621attabal);
                function.dern(strImpromptu, PredefinedEnhancementInfoKt.f30621attabal);
            }
        });
        attabalVar2.attabal("computeIfAbsent", new Function1<impromptu.attabal.C0682attabal, Unit>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.PredefinedEnhancementInfoKt$PREDEFINED_FUNCTION_ENHANCEMENT_INFO_BY_SIGNATURE$1$1$5$7
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // p002kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(impromptu.attabal.C0682attabal c0682attabal) {
                invoke2(c0682attabal);
                return Unit.f29295attabal;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(impromptu.attabal.C0682attabal function) {
                Intrinsics.checkNotNullParameter(function, "$this$function");
                function.saneness(strImpromptu, PredefinedEnhancementInfoKt.f30623saneness);
                function.saneness(strCompetently2, PredefinedEnhancementInfoKt.f30623saneness, PredefinedEnhancementInfoKt.f30623saneness, PredefinedEnhancementInfoKt.f30623saneness);
                function.dern(strImpromptu, PredefinedEnhancementInfoKt.f30623saneness);
            }
        });
        attabalVar2.attabal("computeIfPresent", new Function1<impromptu.attabal.C0682attabal, Unit>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.PredefinedEnhancementInfoKt$PREDEFINED_FUNCTION_ENHANCEMENT_INFO_BY_SIGNATURE$1$1$5$8
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // p002kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(impromptu.attabal.C0682attabal c0682attabal) {
                invoke2(c0682attabal);
                return Unit.f29295attabal;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(impromptu.attabal.C0682attabal function) {
                Intrinsics.checkNotNullParameter(function, "$this$function");
                function.saneness(strImpromptu, PredefinedEnhancementInfoKt.f30623saneness);
                function.saneness(strCompetently4, PredefinedEnhancementInfoKt.f30623saneness, PredefinedEnhancementInfoKt.f30623saneness, PredefinedEnhancementInfoKt.f30622dern, PredefinedEnhancementInfoKt.f30621attabal);
                function.dern(strImpromptu, PredefinedEnhancementInfoKt.f30621attabal);
            }
        });
        attabalVar2.attabal("merge", new Function1<impromptu.attabal.C0682attabal, Unit>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.PredefinedEnhancementInfoKt$PREDEFINED_FUNCTION_ENHANCEMENT_INFO_BY_SIGNATURE$1$1$5$9
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // p002kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(impromptu.attabal.C0682attabal c0682attabal) {
                invoke2(c0682attabal);
                return Unit.f29295attabal;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(impromptu.attabal.C0682attabal function) {
                Intrinsics.checkNotNullParameter(function, "$this$function");
                function.saneness(strImpromptu, PredefinedEnhancementInfoKt.f30623saneness);
                function.saneness(strImpromptu, PredefinedEnhancementInfoKt.f30622dern);
                function.saneness(strCompetently4, PredefinedEnhancementInfoKt.f30623saneness, PredefinedEnhancementInfoKt.f30622dern, PredefinedEnhancementInfoKt.f30622dern, PredefinedEnhancementInfoKt.f30621attabal);
                function.dern(strImpromptu, PredefinedEnhancementInfoKt.f30621attabal);
            }
        });
        impromptu.attabal attabalVar3 = new impromptu.attabal(impromptuVar, strTaiyuan2);
        attabalVar3.attabal("empty", new Function1<impromptu.attabal.C0682attabal, Unit>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.PredefinedEnhancementInfoKt$PREDEFINED_FUNCTION_ENHANCEMENT_INFO_BY_SIGNATURE$1$1$6$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // p002kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(impromptu.attabal.C0682attabal c0682attabal) {
                invoke2(c0682attabal);
                return Unit.f29295attabal;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(impromptu.attabal.C0682attabal function) {
                Intrinsics.checkNotNullParameter(function, "$this$function");
                function.dern(strTaiyuan2, PredefinedEnhancementInfoKt.f30623saneness, PredefinedEnhancementInfoKt.f30622dern);
            }
        });
        attabalVar3.attabal("of", new Function1<impromptu.attabal.C0682attabal, Unit>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.PredefinedEnhancementInfoKt$PREDEFINED_FUNCTION_ENHANCEMENT_INFO_BY_SIGNATURE$1$1$6$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // p002kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(impromptu.attabal.C0682attabal c0682attabal) {
                invoke2(c0682attabal);
                return Unit.f29295attabal;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(impromptu.attabal.C0682attabal function) {
                Intrinsics.checkNotNullParameter(function, "$this$function");
                function.saneness(strImpromptu, PredefinedEnhancementInfoKt.f30622dern);
                function.dern(strTaiyuan2, PredefinedEnhancementInfoKt.f30623saneness, PredefinedEnhancementInfoKt.f30622dern);
            }
        });
        attabalVar3.attabal("ofNullable", new Function1<impromptu.attabal.C0682attabal, Unit>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.PredefinedEnhancementInfoKt$PREDEFINED_FUNCTION_ENHANCEMENT_INFO_BY_SIGNATURE$1$1$6$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // p002kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(impromptu.attabal.C0682attabal c0682attabal) {
                invoke2(c0682attabal);
                return Unit.f29295attabal;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(impromptu.attabal.C0682attabal function) {
                Intrinsics.checkNotNullParameter(function, "$this$function");
                function.saneness(strImpromptu, PredefinedEnhancementInfoKt.f30621attabal);
                function.dern(strTaiyuan2, PredefinedEnhancementInfoKt.f30623saneness, PredefinedEnhancementInfoKt.f30622dern);
            }
        });
        attabalVar3.attabal("get", new Function1<impromptu.attabal.C0682attabal, Unit>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.PredefinedEnhancementInfoKt$PREDEFINED_FUNCTION_ENHANCEMENT_INFO_BY_SIGNATURE$1$1$6$4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // p002kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(impromptu.attabal.C0682attabal c0682attabal) {
                invoke2(c0682attabal);
                return Unit.f29295attabal;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(impromptu.attabal.C0682attabal function) {
                Intrinsics.checkNotNullParameter(function, "$this$function");
                function.dern(strImpromptu, PredefinedEnhancementInfoKt.f30622dern);
            }
        });
        attabalVar3.attabal("ifPresent", new Function1<impromptu.attabal.C0682attabal, Unit>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.PredefinedEnhancementInfoKt$PREDEFINED_FUNCTION_ENHANCEMENT_INFO_BY_SIGNATURE$1$1$6$5
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // p002kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(impromptu.attabal.C0682attabal c0682attabal) {
                invoke2(c0682attabal);
                return Unit.f29295attabal;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(impromptu.attabal.C0682attabal function) {
                Intrinsics.checkNotNullParameter(function, "$this$function");
                function.saneness(strCompetently3, PredefinedEnhancementInfoKt.f30623saneness, PredefinedEnhancementInfoKt.f30622dern);
            }
        });
        new impromptu.attabal(impromptuVar, signatureBuildingComponents.impromptu("ref/Reference")).attabal("get", new Function1<impromptu.attabal.C0682attabal, Unit>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.PredefinedEnhancementInfoKt$PREDEFINED_FUNCTION_ENHANCEMENT_INFO_BY_SIGNATURE$1$1$7$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // p002kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(impromptu.attabal.C0682attabal c0682attabal) {
                invoke2(c0682attabal);
                return Unit.f29295attabal;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(impromptu.attabal.C0682attabal function) {
                Intrinsics.checkNotNullParameter(function, "$this$function");
                function.dern(strImpromptu, PredefinedEnhancementInfoKt.f30621attabal);
            }
        });
        new impromptu.attabal(impromptuVar, strCompetently).attabal("test", new Function1<impromptu.attabal.C0682attabal, Unit>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.PredefinedEnhancementInfoKt$PREDEFINED_FUNCTION_ENHANCEMENT_INFO_BY_SIGNATURE$1$1$8$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // p002kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(impromptu.attabal.C0682attabal c0682attabal) {
                invoke2(c0682attabal);
                return Unit.f29295attabal;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(impromptu.attabal.C0682attabal function) {
                Intrinsics.checkNotNullParameter(function, "$this$function");
                function.saneness(strImpromptu, PredefinedEnhancementInfoKt.f30623saneness);
                function.wireman(JvmPrimitiveType.BOOLEAN);
            }
        });
        new impromptu.attabal(impromptuVar, signatureBuildingComponents.competently("BiPredicate")).attabal("test", new Function1<impromptu.attabal.C0682attabal, Unit>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.PredefinedEnhancementInfoKt$PREDEFINED_FUNCTION_ENHANCEMENT_INFO_BY_SIGNATURE$1$1$9$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // p002kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(impromptu.attabal.C0682attabal c0682attabal) {
                invoke2(c0682attabal);
                return Unit.f29295attabal;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(impromptu.attabal.C0682attabal function) {
                Intrinsics.checkNotNullParameter(function, "$this$function");
                function.saneness(strImpromptu, PredefinedEnhancementInfoKt.f30623saneness);
                function.saneness(strImpromptu, PredefinedEnhancementInfoKt.f30623saneness);
                function.wireman(JvmPrimitiveType.BOOLEAN);
            }
        });
        new impromptu.attabal(impromptuVar, strCompetently3).attabal("accept", new Function1<impromptu.attabal.C0682attabal, Unit>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.PredefinedEnhancementInfoKt$PREDEFINED_FUNCTION_ENHANCEMENT_INFO_BY_SIGNATURE$1$1$10$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // p002kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(impromptu.attabal.C0682attabal c0682attabal) {
                invoke2(c0682attabal);
                return Unit.f29295attabal;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(impromptu.attabal.C0682attabal function) {
                Intrinsics.checkNotNullParameter(function, "$this$function");
                function.saneness(strImpromptu, PredefinedEnhancementInfoKt.f30623saneness);
            }
        });
        new impromptu.attabal(impromptuVar, strCompetently5).attabal("accept", new Function1<impromptu.attabal.C0682attabal, Unit>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.PredefinedEnhancementInfoKt$PREDEFINED_FUNCTION_ENHANCEMENT_INFO_BY_SIGNATURE$1$1$11$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // p002kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(impromptu.attabal.C0682attabal c0682attabal) {
                invoke2(c0682attabal);
                return Unit.f29295attabal;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(impromptu.attabal.C0682attabal function) {
                Intrinsics.checkNotNullParameter(function, "$this$function");
                function.saneness(strImpromptu, PredefinedEnhancementInfoKt.f30623saneness);
                function.saneness(strImpromptu, PredefinedEnhancementInfoKt.f30623saneness);
            }
        });
        new impromptu.attabal(impromptuVar, strCompetently2).attabal("apply", new Function1<impromptu.attabal.C0682attabal, Unit>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.PredefinedEnhancementInfoKt$PREDEFINED_FUNCTION_ENHANCEMENT_INFO_BY_SIGNATURE$1$1$12$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // p002kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(impromptu.attabal.C0682attabal c0682attabal) {
                invoke2(c0682attabal);
                return Unit.f29295attabal;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(impromptu.attabal.C0682attabal function) {
                Intrinsics.checkNotNullParameter(function, "$this$function");
                function.saneness(strImpromptu, PredefinedEnhancementInfoKt.f30623saneness);
                function.dern(strImpromptu, PredefinedEnhancementInfoKt.f30623saneness);
            }
        });
        new impromptu.attabal(impromptuVar, strCompetently4).attabal("apply", new Function1<impromptu.attabal.C0682attabal, Unit>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.PredefinedEnhancementInfoKt$PREDEFINED_FUNCTION_ENHANCEMENT_INFO_BY_SIGNATURE$1$1$13$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // p002kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(impromptu.attabal.C0682attabal c0682attabal) {
                invoke2(c0682attabal);
                return Unit.f29295attabal;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(impromptu.attabal.C0682attabal function) {
                Intrinsics.checkNotNullParameter(function, "$this$function");
                function.saneness(strImpromptu, PredefinedEnhancementInfoKt.f30623saneness);
                function.saneness(strImpromptu, PredefinedEnhancementInfoKt.f30623saneness);
                function.dern(strImpromptu, PredefinedEnhancementInfoKt.f30623saneness);
            }
        });
        new impromptu.attabal(impromptuVar, signatureBuildingComponents.competently("Supplier")).attabal("get", new Function1<impromptu.attabal.C0682attabal, Unit>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.PredefinedEnhancementInfoKt$PREDEFINED_FUNCTION_ENHANCEMENT_INFO_BY_SIGNATURE$1$1$14$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // p002kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(impromptu.attabal.C0682attabal c0682attabal) {
                invoke2(c0682attabal);
                return Unit.f29295attabal;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(impromptu.attabal.C0682attabal function) {
                Intrinsics.checkNotNullParameter(function, "$this$function");
                function.dern(strImpromptu, PredefinedEnhancementInfoKt.f30623saneness);
            }
        });
        f30624wireman = impromptuVar.saneness();
    }

    public static final Map<String, competently> wireman() {
        return f30624wireman;
    }
}
