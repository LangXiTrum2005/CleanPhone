package kotlin.reflect.jvm.internal.impl.renderer;

import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.collections.EmptySet;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.ReflectionFactory;
import kotlin.reflect.KProperty;

/* JADX INFO: loaded from: classes7.dex */
public final class DescriptorRendererOptionsImpl implements DescriptorRendererOptions {
    public static final /* synthetic */ KProperty[] W;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final DescriptorRendererOptionsImpl$property$$inlined$vetoable$1 f44244A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final DescriptorRendererOptionsImpl$property$$inlined$vetoable$1 f44245B;
    public final DescriptorRendererOptionsImpl$property$$inlined$vetoable$1 C;
    public final DescriptorRendererOptionsImpl$property$$inlined$vetoable$1 D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public final DescriptorRendererOptionsImpl$property$$inlined$vetoable$1 f44246E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public final DescriptorRendererOptionsImpl$property$$inlined$vetoable$1 f44247F;
    public final DescriptorRendererOptionsImpl$property$$inlined$vetoable$1 G;
    public final DescriptorRendererOptionsImpl$property$$inlined$vetoable$1 H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public final DescriptorRendererOptionsImpl$property$$inlined$vetoable$1 f44248I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public final DescriptorRendererOptionsImpl$property$$inlined$vetoable$1 f44249J;
    public final DescriptorRendererOptionsImpl$property$$inlined$vetoable$1 K;
    public final DescriptorRendererOptionsImpl$property$$inlined$vetoable$1 L;
    public final DescriptorRendererOptionsImpl$property$$inlined$vetoable$1 M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public final DescriptorRendererOptionsImpl$property$$inlined$vetoable$1 f44250N;
    public final DescriptorRendererOptionsImpl$property$$inlined$vetoable$1 O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public final DescriptorRendererOptionsImpl$property$$inlined$vetoable$1 f44251P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public final DescriptorRendererOptionsImpl$property$$inlined$vetoable$1 f44252Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public final DescriptorRendererOptionsImpl$property$$inlined$vetoable$1 f44253R;
    public final DescriptorRendererOptionsImpl$property$$inlined$vetoable$1 S;
    public final DescriptorRendererOptionsImpl$property$$inlined$vetoable$1 T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public final DescriptorRendererOptionsImpl$property$$inlined$vetoable$1 f44254U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public final DescriptorRendererOptionsImpl$property$$inlined$vetoable$1 f44255V;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f44256a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final DescriptorRendererOptionsImpl$property$$inlined$vetoable$1 f44257b = new DescriptorRendererOptionsImpl$property$$inlined$vetoable$1(ClassifierNamePolicy.SOURCE_CODE_QUALIFIED.f44236a, this);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final DescriptorRendererOptionsImpl$property$$inlined$vetoable$1 f44258c;
    public final DescriptorRendererOptionsImpl$property$$inlined$vetoable$1 d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final DescriptorRendererOptionsImpl$property$$inlined$vetoable$1 f44259e;
    public final DescriptorRendererOptionsImpl$property$$inlined$vetoable$1 f;
    public final DescriptorRendererOptionsImpl$property$$inlined$vetoable$1 g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final DescriptorRendererOptionsImpl$property$$inlined$vetoable$1 f44260h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final DescriptorRendererOptionsImpl$property$$inlined$vetoable$1 f44261i;
    public final DescriptorRendererOptionsImpl$property$$inlined$vetoable$1 j;
    public final DescriptorRendererOptionsImpl$property$$inlined$vetoable$1 k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final DescriptorRendererOptionsImpl$property$$inlined$vetoable$1 f44262l;
    public final DescriptorRendererOptionsImpl$property$$inlined$vetoable$1 m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final DescriptorRendererOptionsImpl$property$$inlined$vetoable$1 f44263n;
    public final DescriptorRendererOptionsImpl$property$$inlined$vetoable$1 o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final DescriptorRendererOptionsImpl$property$$inlined$vetoable$1 f44264p;
    public final DescriptorRendererOptionsImpl$property$$inlined$vetoable$1 q;
    public final DescriptorRendererOptionsImpl$property$$inlined$vetoable$1 r;
    public final DescriptorRendererOptionsImpl$property$$inlined$vetoable$1 s;
    public final DescriptorRendererOptionsImpl$property$$inlined$vetoable$1 t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final DescriptorRendererOptionsImpl$property$$inlined$vetoable$1 f44265u;
    public final DescriptorRendererOptionsImpl$property$$inlined$vetoable$1 v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final DescriptorRendererOptionsImpl$property$$inlined$vetoable$1 f44266w;
    public final DescriptorRendererOptionsImpl$property$$inlined$vetoable$1 x;
    public final DescriptorRendererOptionsImpl$property$$inlined$vetoable$1 y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final DescriptorRendererOptionsImpl$property$$inlined$vetoable$1 f44267z;

    static {
        ReflectionFactory reflectionFactory = Reflection.f43333a;
        W = new KProperty[]{reflectionFactory.f(new MutablePropertyReference1Impl(reflectionFactory.b(DescriptorRendererOptionsImpl.class), "classifierNamePolicy", "getClassifierNamePolicy()Lorg/jetbrains/kotlin/renderer/ClassifierNamePolicy;")), reflectionFactory.f(new MutablePropertyReference1Impl(reflectionFactory.b(DescriptorRendererOptionsImpl.class), "withDefinedIn", "getWithDefinedIn()Z")), reflectionFactory.f(new MutablePropertyReference1Impl(reflectionFactory.b(DescriptorRendererOptionsImpl.class), "withSourceFileForTopLevel", "getWithSourceFileForTopLevel()Z")), reflectionFactory.f(new MutablePropertyReference1Impl(reflectionFactory.b(DescriptorRendererOptionsImpl.class), "modifiers", "getModifiers()Ljava/util/Set;")), reflectionFactory.f(new MutablePropertyReference1Impl(reflectionFactory.b(DescriptorRendererOptionsImpl.class), "startFromName", "getStartFromName()Z")), reflectionFactory.f(new MutablePropertyReference1Impl(reflectionFactory.b(DescriptorRendererOptionsImpl.class), "startFromDeclarationKeyword", "getStartFromDeclarationKeyword()Z")), reflectionFactory.f(new MutablePropertyReference1Impl(reflectionFactory.b(DescriptorRendererOptionsImpl.class), "debugMode", "getDebugMode()Z")), reflectionFactory.f(new MutablePropertyReference1Impl(reflectionFactory.b(DescriptorRendererOptionsImpl.class), "classWithPrimaryConstructor", "getClassWithPrimaryConstructor()Z")), reflectionFactory.f(new MutablePropertyReference1Impl(reflectionFactory.b(DescriptorRendererOptionsImpl.class), "verbose", "getVerbose()Z")), reflectionFactory.f(new MutablePropertyReference1Impl(reflectionFactory.b(DescriptorRendererOptionsImpl.class), "unitReturnType", "getUnitReturnType()Z")), reflectionFactory.f(new MutablePropertyReference1Impl(reflectionFactory.b(DescriptorRendererOptionsImpl.class), "withoutReturnType", "getWithoutReturnType()Z")), reflectionFactory.f(new MutablePropertyReference1Impl(reflectionFactory.b(DescriptorRendererOptionsImpl.class), "enhancedTypes", "getEnhancedTypes()Z")), reflectionFactory.f(new MutablePropertyReference1Impl(reflectionFactory.b(DescriptorRendererOptionsImpl.class), "normalizedVisibilities", "getNormalizedVisibilities()Z")), reflectionFactory.f(new MutablePropertyReference1Impl(reflectionFactory.b(DescriptorRendererOptionsImpl.class), "renderDefaultVisibility", "getRenderDefaultVisibility()Z")), reflectionFactory.f(new MutablePropertyReference1Impl(reflectionFactory.b(DescriptorRendererOptionsImpl.class), "renderDefaultModality", "getRenderDefaultModality()Z")), reflectionFactory.f(new MutablePropertyReference1Impl(reflectionFactory.b(DescriptorRendererOptionsImpl.class), "renderConstructorDelegation", "getRenderConstructorDelegation()Z")), reflectionFactory.f(new MutablePropertyReference1Impl(reflectionFactory.b(DescriptorRendererOptionsImpl.class), "renderPrimaryConstructorParametersAsProperties", "getRenderPrimaryConstructorParametersAsProperties()Z")), reflectionFactory.f(new MutablePropertyReference1Impl(reflectionFactory.b(DescriptorRendererOptionsImpl.class), "actualPropertiesInPrimaryConstructor", "getActualPropertiesInPrimaryConstructor()Z")), reflectionFactory.f(new MutablePropertyReference1Impl(reflectionFactory.b(DescriptorRendererOptionsImpl.class), "uninferredTypeParameterAsName", "getUninferredTypeParameterAsName()Z")), reflectionFactory.f(new MutablePropertyReference1Impl(reflectionFactory.b(DescriptorRendererOptionsImpl.class), "includePropertyConstant", "getIncludePropertyConstant()Z")), reflectionFactory.f(new MutablePropertyReference1Impl(reflectionFactory.b(DescriptorRendererOptionsImpl.class), "withoutTypeParameters", "getWithoutTypeParameters()Z")), reflectionFactory.f(new MutablePropertyReference1Impl(reflectionFactory.b(DescriptorRendererOptionsImpl.class), "withoutSuperTypes", "getWithoutSuperTypes()Z")), reflectionFactory.f(new MutablePropertyReference1Impl(reflectionFactory.b(DescriptorRendererOptionsImpl.class), "typeNormalizer", "getTypeNormalizer()Lkotlin/jvm/functions/Function1;")), reflectionFactory.f(new MutablePropertyReference1Impl(reflectionFactory.b(DescriptorRendererOptionsImpl.class), "defaultParameterValueRenderer", "getDefaultParameterValueRenderer()Lkotlin/jvm/functions/Function1;")), reflectionFactory.f(new MutablePropertyReference1Impl(reflectionFactory.b(DescriptorRendererOptionsImpl.class), "secondaryConstructorsAsPrimary", "getSecondaryConstructorsAsPrimary()Z")), reflectionFactory.f(new MutablePropertyReference1Impl(reflectionFactory.b(DescriptorRendererOptionsImpl.class), "overrideRenderingPolicy", "getOverrideRenderingPolicy()Lorg/jetbrains/kotlin/renderer/OverrideRenderingPolicy;")), reflectionFactory.f(new MutablePropertyReference1Impl(reflectionFactory.b(DescriptorRendererOptionsImpl.class), "valueParametersHandler", "getValueParametersHandler()Lorg/jetbrains/kotlin/renderer/DescriptorRenderer$ValueParametersHandler;")), reflectionFactory.f(new MutablePropertyReference1Impl(reflectionFactory.b(DescriptorRendererOptionsImpl.class), "textFormat", "getTextFormat()Lorg/jetbrains/kotlin/renderer/RenderingFormat;")), reflectionFactory.f(new MutablePropertyReference1Impl(reflectionFactory.b(DescriptorRendererOptionsImpl.class), "parameterNameRenderingPolicy", "getParameterNameRenderingPolicy()Lorg/jetbrains/kotlin/renderer/ParameterNameRenderingPolicy;")), reflectionFactory.f(new MutablePropertyReference1Impl(reflectionFactory.b(DescriptorRendererOptionsImpl.class), "receiverAfterName", "getReceiverAfterName()Z")), reflectionFactory.f(new MutablePropertyReference1Impl(reflectionFactory.b(DescriptorRendererOptionsImpl.class), "renderCompanionObjectName", "getRenderCompanionObjectName()Z")), reflectionFactory.f(new MutablePropertyReference1Impl(reflectionFactory.b(DescriptorRendererOptionsImpl.class), "propertyAccessorRenderingPolicy", "getPropertyAccessorRenderingPolicy()Lorg/jetbrains/kotlin/renderer/PropertyAccessorRenderingPolicy;")), reflectionFactory.f(new MutablePropertyReference1Impl(reflectionFactory.b(DescriptorRendererOptionsImpl.class), "renderDefaultAnnotationArguments", "getRenderDefaultAnnotationArguments()Z")), reflectionFactory.f(new MutablePropertyReference1Impl(reflectionFactory.b(DescriptorRendererOptionsImpl.class), "eachAnnotationOnNewLine", "getEachAnnotationOnNewLine()Z")), reflectionFactory.f(new MutablePropertyReference1Impl(reflectionFactory.b(DescriptorRendererOptionsImpl.class), "excludedAnnotationClasses", "getExcludedAnnotationClasses()Ljava/util/Set;")), reflectionFactory.f(new MutablePropertyReference1Impl(reflectionFactory.b(DescriptorRendererOptionsImpl.class), "excludedTypeAnnotationClasses", "getExcludedTypeAnnotationClasses()Ljava/util/Set;")), reflectionFactory.f(new MutablePropertyReference1Impl(reflectionFactory.b(DescriptorRendererOptionsImpl.class), "annotationFilter", "getAnnotationFilter()Lkotlin/jvm/functions/Function1;")), reflectionFactory.f(new MutablePropertyReference1Impl(reflectionFactory.b(DescriptorRendererOptionsImpl.class), "annotationArgumentsRenderingPolicy", "getAnnotationArgumentsRenderingPolicy()Lorg/jetbrains/kotlin/renderer/AnnotationArgumentsRenderingPolicy;")), reflectionFactory.f(new MutablePropertyReference1Impl(reflectionFactory.b(DescriptorRendererOptionsImpl.class), "alwaysRenderModifiers", "getAlwaysRenderModifiers()Z")), reflectionFactory.f(new MutablePropertyReference1Impl(reflectionFactory.b(DescriptorRendererOptionsImpl.class), "renderConstructorKeyword", "getRenderConstructorKeyword()Z")), reflectionFactory.f(new MutablePropertyReference1Impl(reflectionFactory.b(DescriptorRendererOptionsImpl.class), "renderUnabbreviatedType", "getRenderUnabbreviatedType()Z")), reflectionFactory.f(new MutablePropertyReference1Impl(reflectionFactory.b(DescriptorRendererOptionsImpl.class), "renderTypeExpansions", "getRenderTypeExpansions()Z")), reflectionFactory.f(new MutablePropertyReference1Impl(reflectionFactory.b(DescriptorRendererOptionsImpl.class), "includeAdditionalModifiers", "getIncludeAdditionalModifiers()Z")), reflectionFactory.f(new MutablePropertyReference1Impl(reflectionFactory.b(DescriptorRendererOptionsImpl.class), "parameterNamesInFunctionalTypes", "getParameterNamesInFunctionalTypes()Z")), reflectionFactory.f(new MutablePropertyReference1Impl(reflectionFactory.b(DescriptorRendererOptionsImpl.class), "renderFunctionContracts", "getRenderFunctionContracts()Z")), reflectionFactory.f(new MutablePropertyReference1Impl(reflectionFactory.b(DescriptorRendererOptionsImpl.class), "presentableUnresolvedTypes", "getPresentableUnresolvedTypes()Z")), reflectionFactory.f(new MutablePropertyReference1Impl(reflectionFactory.b(DescriptorRendererOptionsImpl.class), "boldOnlyForNamesInHtml", "getBoldOnlyForNamesInHtml()Z")), reflectionFactory.f(new MutablePropertyReference1Impl(reflectionFactory.b(DescriptorRendererOptionsImpl.class), "informativeErrorType", "getInformativeErrorType()Z"))};
    }

    public DescriptorRendererOptionsImpl() {
        Boolean bool = Boolean.TRUE;
        this.f44258c = new DescriptorRendererOptionsImpl$property$$inlined$vetoable$1(bool, this);
        this.d = new DescriptorRendererOptionsImpl$property$$inlined$vetoable$1(bool, this);
        this.f44259e = new DescriptorRendererOptionsImpl$property$$inlined$vetoable$1(DescriptorRendererModifier.f44243Y, this);
        Boolean bool2 = Boolean.FALSE;
        this.f = new DescriptorRendererOptionsImpl$property$$inlined$vetoable$1(bool2, this);
        this.g = new DescriptorRendererOptionsImpl$property$$inlined$vetoable$1(bool2, this);
        this.f44260h = new DescriptorRendererOptionsImpl$property$$inlined$vetoable$1(bool2, this);
        this.f44261i = new DescriptorRendererOptionsImpl$property$$inlined$vetoable$1(bool2, this);
        this.j = new DescriptorRendererOptionsImpl$property$$inlined$vetoable$1(bool2, this);
        this.k = new DescriptorRendererOptionsImpl$property$$inlined$vetoable$1(bool, this);
        this.f44262l = new DescriptorRendererOptionsImpl$property$$inlined$vetoable$1(bool2, this);
        this.m = new DescriptorRendererOptionsImpl$property$$inlined$vetoable$1(bool2, this);
        this.f44263n = new DescriptorRendererOptionsImpl$property$$inlined$vetoable$1(bool2, this);
        this.o = new DescriptorRendererOptionsImpl$property$$inlined$vetoable$1(bool, this);
        this.f44264p = new DescriptorRendererOptionsImpl$property$$inlined$vetoable$1(bool, this);
        this.q = new DescriptorRendererOptionsImpl$property$$inlined$vetoable$1(bool2, this);
        this.r = new DescriptorRendererOptionsImpl$property$$inlined$vetoable$1(bool2, this);
        this.s = new DescriptorRendererOptionsImpl$property$$inlined$vetoable$1(bool2, this);
        this.t = new DescriptorRendererOptionsImpl$property$$inlined$vetoable$1(bool2, this);
        this.f44265u = new DescriptorRendererOptionsImpl$property$$inlined$vetoable$1(bool2, this);
        this.v = new DescriptorRendererOptionsImpl$property$$inlined$vetoable$1(bool2, this);
        this.f44266w = new DescriptorRendererOptionsImpl$property$$inlined$vetoable$1(bool2, this);
        this.x = new DescriptorRendererOptionsImpl$property$$inlined$vetoable$1(DescriptorRendererOptionsImpl$typeNormalizer$2.X, this);
        this.y = new DescriptorRendererOptionsImpl$property$$inlined$vetoable$1(DescriptorRendererOptionsImpl$defaultParameterValueRenderer$2.X, this);
        this.f44267z = new DescriptorRendererOptionsImpl$property$$inlined$vetoable$1(bool, this);
        this.f44244A = new DescriptorRendererOptionsImpl$property$$inlined$vetoable$1(OverrideRenderingPolicy.f44271Y, this);
        this.f44245B = new DescriptorRendererOptionsImpl$property$$inlined$vetoable$1(DescriptorRenderer.ValueParametersHandler.DEFAULT.f44240a, this);
        this.C = new DescriptorRendererOptionsImpl$property$$inlined$vetoable$1(RenderingFormat.X, this);
        this.D = new DescriptorRendererOptionsImpl$property$$inlined$vetoable$1(ParameterNameRenderingPolicy.X, this);
        this.f44246E = new DescriptorRendererOptionsImpl$property$$inlined$vetoable$1(bool2, this);
        this.f44247F = new DescriptorRendererOptionsImpl$property$$inlined$vetoable$1(bool2, this);
        this.G = new DescriptorRendererOptionsImpl$property$$inlined$vetoable$1(PropertyAccessorRenderingPolicy.X, this);
        this.H = new DescriptorRendererOptionsImpl$property$$inlined$vetoable$1(bool2, this);
        this.f44248I = new DescriptorRendererOptionsImpl$property$$inlined$vetoable$1(bool2, this);
        this.f44249J = new DescriptorRendererOptionsImpl$property$$inlined$vetoable$1(EmptySet.X, this);
        this.K = new DescriptorRendererOptionsImpl$property$$inlined$vetoable$1(ExcludedTypeAnnotations.f44269a, this);
        this.L = new DescriptorRendererOptionsImpl$property$$inlined$vetoable$1(null, this);
        this.M = new DescriptorRendererOptionsImpl$property$$inlined$vetoable$1(AnnotationArgumentsRenderingPolicy.NO_ARGUMENTS, this);
        this.f44250N = new DescriptorRendererOptionsImpl$property$$inlined$vetoable$1(bool2, this);
        this.O = new DescriptorRendererOptionsImpl$property$$inlined$vetoable$1(bool, this);
        this.f44251P = new DescriptorRendererOptionsImpl$property$$inlined$vetoable$1(bool, this);
        this.f44252Q = new DescriptorRendererOptionsImpl$property$$inlined$vetoable$1(bool2, this);
        this.f44253R = new DescriptorRendererOptionsImpl$property$$inlined$vetoable$1(bool, this);
        this.S = new DescriptorRendererOptionsImpl$property$$inlined$vetoable$1(bool, this);
        new DescriptorRendererOptionsImpl$property$$inlined$vetoable$1(bool2, this);
        this.T = new DescriptorRendererOptionsImpl$property$$inlined$vetoable$1(bool2, this);
        this.f44254U = new DescriptorRendererOptionsImpl$property$$inlined$vetoable$1(bool2, this);
        this.f44255V = new DescriptorRendererOptionsImpl$property$$inlined$vetoable$1(bool, this);
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    public final void a() {
        this.f44246E.setValue(this, W[29], Boolean.TRUE);
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    public final void b() {
        this.f44247F.setValue(this, W[30], Boolean.TRUE);
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    public final void c(ParameterNameRenderingPolicy parameterNameRenderingPolicy) {
        this.D.setValue(this, W[28], parameterNameRenderingPolicy);
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    public final void d() {
        this.v.setValue(this, W[20], Boolean.TRUE);
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    public final void e() {
        AnnotationArgumentsRenderingPolicy annotationArgumentsRenderingPolicy = AnnotationArgumentsRenderingPolicy.UNLESS_EMPTY;
        this.M.setValue(this, W[37], annotationArgumentsRenderingPolicy);
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    public final void f() {
        this.f.setValue(this, W[4], Boolean.TRUE);
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    public final Set g() {
        return (Set) this.K.getValue(this, W[35]);
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    public final void h() {
        this.f44266w.setValue(this, W[21], Boolean.TRUE);
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    public final void i() {
        this.f44260h.setValue(this, W[6], Boolean.TRUE);
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    public final void j(Set set) {
        Intrinsics.f(set, "<set-?>");
        this.f44259e.setValue(this, W[3], set);
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    public final void k(LinkedHashSet linkedHashSet) {
        this.K.setValue(this, W[35], linkedHashSet);
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    public final void l(ClassifierNamePolicy classifierNamePolicy) {
        this.f44257b.setValue(this, W[0], classifierNamePolicy);
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    public final void m() {
        this.j.setValue(this, W[8], Boolean.TRUE);
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    public final void n() {
        this.f44258c.setValue(this, W[1], Boolean.FALSE);
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    public final void o() {
        RenderingFormat renderingFormat = RenderingFormat.f44274Y;
        this.C.setValue(this, W[27], renderingFormat);
    }

    public final boolean p() {
        return ((Boolean) this.f44260h.getValue(this, W[6])).booleanValue();
    }
}
