package p002kotlin.reflect.jvm.internal.impl.renderer;

import byname.marial;
import p002kotlin.NoWhenBranchMatchedException;
import p002kotlin.Unit;
import p002kotlin.collections.creditor;
import p002kotlin.jvm.functions.Function1;
import p002kotlin.jvm.internal.DefaultConstructorMarker;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.reflect.jvm.internal.impl.builtins.beachfront;
import p002kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import p002kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationUseSiteTarget;
import p002kotlin.reflect.jvm.internal.impl.descriptors.annotations.dern;
import p002kotlin.reflect.jvm.internal.impl.descriptors.apical;
import p002kotlin.reflect.jvm.internal.impl.descriptors.competently;
import p002kotlin.reflect.jvm.internal.impl.descriptors.cultivated;
import p002kotlin.reflect.jvm.internal.impl.descriptors.overspeculate;
import p002kotlin.reflect.jvm.internal.impl.descriptors.wireman;
import p002kotlin.reflect.jvm.internal.impl.types.oilcan;
import p002kotlin.reflect.jvm.internal.impl.types.timberyard;

/* JADX INFO: compiled from: DescriptorRenderer.kt */
/* JADX INFO: loaded from: classes5.dex */
public abstract class DescriptorRenderer {

    /* JADX INFO: renamed from: apical, reason: collision with root package name */
    public static final DescriptorRenderer f31195apical;

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public static final attabal f31196attabal;

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
    public static final DescriptorRenderer f31197beachfront;

    /* JADX INFO: renamed from: competently, reason: collision with root package name */
    public static final DescriptorRenderer f31198competently;

    /* JADX INFO: renamed from: cutely, reason: collision with root package name */
    public static final DescriptorRenderer f31199cutely;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public static final DescriptorRenderer f31200dern;

    /* JADX INFO: renamed from: impromptu, reason: collision with root package name */
    public static final DescriptorRenderer f31201impromptu;

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public static final DescriptorRenderer f31202marial;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public static final DescriptorRenderer f31203saneness;

    /* JADX INFO: renamed from: taiyuan, reason: collision with root package name */
    public static final DescriptorRenderer f31204taiyuan;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public static final DescriptorRenderer f31205wireman;

    /* JADX INFO: compiled from: DescriptorRenderer.kt */
    public static final class attabal {

        /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer$attabal$attabal, reason: collision with other inner class name */
        /* JADX INFO: compiled from: DescriptorRenderer.kt */
        public /* synthetic */ class C0696attabal {

            /* JADX INFO: renamed from: attabal, reason: collision with root package name */
            public static final /* synthetic */ int[] f31206attabal;

            static {
                int[] iArr = new int[ClassKind.values().length];
                try {
                    iArr[ClassKind.CLASS.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[ClassKind.INTERFACE.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[ClassKind.ENUM_CLASS.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[ClassKind.OBJECT.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[ClassKind.ANNOTATION_CLASS.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[ClassKind.ENUM_ENTRY.ordinal()] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                f31206attabal = iArr;
            }
        }

        public /* synthetic */ attabal(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final String attabal(competently classifier) {
            Intrinsics.checkNotNullParameter(classifier, "classifier");
            if (classifier instanceof overspeculate) {
                return "typealias";
            }
            if (!(classifier instanceof wireman)) {
                throw new AssertionError("Unexpected classifier: " + classifier);
            }
            wireman wiremanVar = (wireman) classifier;
            if (wiremanVar.overspeculate()) {
                return "companion object";
            }
            switch (C0696attabal.f31206attabal[wiremanVar.getKind().ordinal()]) {
                case 1:
                    return "class";
                case 2:
                    return "interface";
                case 3:
                    return "enum class";
                case 4:
                    return "object";
                case 5:
                    return "annotation class";
                case 6:
                    return "enum entry";
                default:
                    throw new NoWhenBranchMatchedException();
            }
        }

        public final DescriptorRenderer saneness(Function1<? super p002kotlin.reflect.jvm.internal.impl.renderer.saneness, Unit> changeOptions) {
            Intrinsics.checkNotNullParameter(changeOptions, "changeOptions");
            DescriptorRendererOptionsImpl descriptorRendererOptionsImpl = new DescriptorRendererOptionsImpl();
            changeOptions.invoke(descriptorRendererOptionsImpl);
            descriptorRendererOptionsImpl.sayid();
            return new DescriptorRendererImpl(descriptorRendererOptionsImpl);
        }

        public attabal() {
        }
    }

    /* JADX INFO: compiled from: DescriptorRenderer.kt */
    public interface saneness {

        /* JADX INFO: compiled from: DescriptorRenderer.kt */
        public static final class attabal implements saneness {

            /* JADX INFO: renamed from: attabal, reason: collision with root package name */
            public static final attabal f31207attabal = new attabal();

            @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer.saneness
            public void attabal(cultivated parameter, int i, int i2, StringBuilder builder) {
                Intrinsics.checkNotNullParameter(parameter, "parameter");
                Intrinsics.checkNotNullParameter(builder, "builder");
            }

            @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer.saneness
            public void dern(cultivated parameter, int i, int i2, StringBuilder builder) {
                Intrinsics.checkNotNullParameter(parameter, "parameter");
                Intrinsics.checkNotNullParameter(builder, "builder");
                if (i != i2 - 1) {
                    builder.append(", ");
                }
            }

            @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer.saneness
            public void saneness(int i, StringBuilder builder) {
                Intrinsics.checkNotNullParameter(builder, "builder");
                builder.append("(");
            }

            @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer.saneness
            public void wireman(int i, StringBuilder builder) {
                Intrinsics.checkNotNullParameter(builder, "builder");
                builder.append(")");
            }
        }

        void attabal(cultivated cultivatedVar, int i, int i2, StringBuilder sb);

        void dern(cultivated cultivatedVar, int i, int i2, StringBuilder sb);

        void saneness(int i, StringBuilder sb);

        void wireman(int i, StringBuilder sb);
    }

    static {
        attabal attabalVar = new attabal(null);
        f31196attabal = attabalVar;
        f31203saneness = attabalVar.saneness(new Function1<p002kotlin.reflect.jvm.internal.impl.renderer.saneness, Unit>() { // from class: kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer$Companion$COMPACT_WITH_MODIFIERS$1
            @Override // p002kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(saneness sanenessVar) {
                invoke2(sanenessVar);
                return Unit.f29295attabal;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(saneness withOptions) {
                Intrinsics.checkNotNullParameter(withOptions, "$this$withOptions");
                withOptions.dern(false);
            }
        });
        f31200dern = attabalVar.saneness(new Function1<p002kotlin.reflect.jvm.internal.impl.renderer.saneness, Unit>() { // from class: kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer$Companion$COMPACT$1
            @Override // p002kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(saneness sanenessVar) {
                invoke2(sanenessVar);
                return Unit.f29295attabal;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(saneness withOptions) {
                Intrinsics.checkNotNullParameter(withOptions, "$this$withOptions");
                withOptions.dern(false);
                withOptions.apical(creditor.marial());
            }
        });
        f31205wireman = attabalVar.saneness(new Function1<p002kotlin.reflect.jvm.internal.impl.renderer.saneness, Unit>() { // from class: kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer$Companion$COMPACT_WITHOUT_SUPERTYPES$1
            @Override // p002kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(saneness sanenessVar) {
                invoke2(sanenessVar);
                return Unit.f29295attabal;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(saneness withOptions) {
                Intrinsics.checkNotNullParameter(withOptions, "$this$withOptions");
                withOptions.dern(false);
                withOptions.apical(creditor.marial());
                withOptions.marial(true);
            }
        });
        f31202marial = attabalVar.saneness(new Function1<p002kotlin.reflect.jvm.internal.impl.renderer.saneness, Unit>() { // from class: kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer$Companion$COMPACT_WITH_SHORT_TYPES$1
            @Override // p002kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(saneness sanenessVar) {
                invoke2(sanenessVar);
                return Unit.f29295attabal;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(saneness withOptions) {
                Intrinsics.checkNotNullParameter(withOptions, "$this$withOptions");
                withOptions.apical(creditor.marial());
                withOptions.formularize(attabal.saneness.f31278attabal);
                withOptions.saneness(ParameterNameRenderingPolicy.ONLY_NON_SYNTHESIZED);
            }
        });
        f31197beachfront = attabalVar.saneness(new Function1<p002kotlin.reflect.jvm.internal.impl.renderer.saneness, Unit>() { // from class: kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer$Companion$ONLY_NAMES_WITH_SHORT_TYPES$1
            @Override // p002kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(saneness sanenessVar) {
                invoke2(sanenessVar);
                return Unit.f29295attabal;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(saneness withOptions) {
                Intrinsics.checkNotNullParameter(withOptions, "$this$withOptions");
                withOptions.dern(false);
                withOptions.apical(creditor.marial());
                withOptions.formularize(attabal.saneness.f31278attabal);
                withOptions.triweekly(true);
                withOptions.saneness(ParameterNameRenderingPolicy.NONE);
                withOptions.beachfront(true);
                withOptions.impassible(true);
                withOptions.marial(true);
                withOptions.attabal(true);
            }
        });
        f31198competently = attabalVar.saneness(new Function1<p002kotlin.reflect.jvm.internal.impl.renderer.saneness, Unit>() { // from class: kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer$Companion$FQ_NAMES_IN_TYPES$1
            @Override // p002kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(saneness sanenessVar) {
                invoke2(sanenessVar);
                return Unit.f29295attabal;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(saneness withOptions) {
                Intrinsics.checkNotNullParameter(withOptions, "$this$withOptions");
                withOptions.apical(DescriptorRendererModifier.ALL_EXCEPT_ANNOTATIONS);
            }
        });
        f31201impromptu = attabalVar.saneness(new Function1<p002kotlin.reflect.jvm.internal.impl.renderer.saneness, Unit>() { // from class: kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer$Companion$FQ_NAMES_IN_TYPES_WITH_ANNOTATIONS$1
            @Override // p002kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(saneness sanenessVar) {
                invoke2(sanenessVar);
                return Unit.f29295attabal;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(saneness withOptions) {
                Intrinsics.checkNotNullParameter(withOptions, "$this$withOptions");
                withOptions.apical(DescriptorRendererModifier.ALL);
            }
        });
        f31204taiyuan = attabalVar.saneness(new Function1<p002kotlin.reflect.jvm.internal.impl.renderer.saneness, Unit>() { // from class: kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer$Companion$SHORT_NAMES_IN_TYPES$1
            @Override // p002kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(saneness sanenessVar) {
                invoke2(sanenessVar);
                return Unit.f29295attabal;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(saneness withOptions) {
                Intrinsics.checkNotNullParameter(withOptions, "$this$withOptions");
                withOptions.formularize(attabal.saneness.f31278attabal);
                withOptions.saneness(ParameterNameRenderingPolicy.ONLY_NON_SYNTHESIZED);
            }
        });
        f31199cutely = attabalVar.saneness(new Function1<p002kotlin.reflect.jvm.internal.impl.renderer.saneness, Unit>() { // from class: kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer$Companion$DEBUG_TEXT$1
            @Override // p002kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(saneness sanenessVar) {
                invoke2(sanenessVar);
                return Unit.f29295attabal;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(saneness withOptions) {
                Intrinsics.checkNotNullParameter(withOptions, "$this$withOptions");
                withOptions.setDebugMode(true);
                withOptions.formularize(attabal.C0698attabal.f31276attabal);
                withOptions.apical(DescriptorRendererModifier.ALL);
            }
        });
        f31195apical = attabalVar.saneness(new Function1<p002kotlin.reflect.jvm.internal.impl.renderer.saneness, Unit>() { // from class: kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer$Companion$HTML$1
            @Override // p002kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(saneness sanenessVar) {
                invoke2(sanenessVar);
                return Unit.f29295attabal;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(saneness withOptions) {
                Intrinsics.checkNotNullParameter(withOptions, "$this$withOptions");
                withOptions.competently(RenderingFormat.HTML);
                withOptions.apical(DescriptorRendererModifier.ALL);
            }
        });
    }

    public static /* synthetic */ String monoploid(DescriptorRenderer descriptorRenderer, dern dernVar, AnnotationUseSiteTarget annotationUseSiteTarget, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: renderAnnotation");
        }
        if ((i & 2) != 0) {
            annotationUseSiteTarget = null;
        }
        return descriptorRenderer.arytenoidectomy(dernVar, annotationUseSiteTarget);
    }

    public abstract String adultoid(oilcan oilcanVar);

    public abstract String arytenoidectomy(dern dernVar, AnnotationUseSiteTarget annotationUseSiteTarget);

    public abstract String dovishness(timberyard timberyardVar);

    public final DescriptorRenderer gintrap(Function1<? super p002kotlin.reflect.jvm.internal.impl.renderer.saneness, Unit> changeOptions) {
        Intrinsics.checkNotNullParameter(changeOptions, "changeOptions");
        Intrinsics.competently(this, "null cannot be cast to non-null type org.jetbrains.kotlin.renderer.DescriptorRendererImpl");
        DescriptorRendererOptionsImpl descriptorRendererOptionsImplKowloon = ((DescriptorRendererImpl) this).milliradian().kowloon();
        changeOptions.invoke(descriptorRendererOptionsImplKowloon);
        descriptorRendererOptionsImplKowloon.sayid();
        return new DescriptorRendererImpl(descriptorRendererOptionsImplKowloon);
    }

    public abstract String graveside(marial marialVar, boolean z);

    public abstract String kowloon(apical apicalVar);

    public abstract String molybdenite(byname.wireman wiremanVar);

    public abstract String polloi(String str, String str2, beachfront beachfrontVar);
}
