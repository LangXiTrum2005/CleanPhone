package am;

import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.internal.d0;
import kotlin.jvm.internal.e0;
import qk.w;
import xj.x;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class k implements j {
    public static final /* synthetic */ w[] W;
    public final wf.a A;
    public final wf.a B;
    public final wf.a C;
    public final wf.a D;
    public final wf.a E;
    public final wf.a F;
    public final wf.a G;
    public final wf.a H;
    public final wf.a I;
    public final wf.a J;
    public final wf.a K;
    public final wf.a L;
    public final wf.a M;
    public final wf.a N;
    public final wf.a O;
    public final wf.a P;
    public final wf.a Q;
    public final wf.a R;
    public final wf.a S;
    public final wf.a T;
    public final wf.a U;
    public final wf.a V;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f3728a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final wf.a f3729b = new wf.a(b.f3694d, this);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final wf.a f3730c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final wf.a f3731d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final wf.a f3732e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final wf.a f3733f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final wf.a f3734g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final wf.a f3735h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final wf.a f3736i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final wf.a f3737j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final wf.a f3738k;
    public final wf.a l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final wf.a f3739m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final wf.a f3740n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final wf.a f3741o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final wf.a f3742p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final wf.a f3743q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final wf.a f3744r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final wf.a f3745s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final wf.a f3746t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final wf.a f3747u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final wf.a f3748v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final wf.a f3749w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final wf.a f3750x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final wf.a f3751y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final wf.a f3752z;

    static {
        e0 e0Var = d0.f44761a;
        W = new w[]{e0Var.e(new kotlin.jvm.internal.r(e0Var.b(k.class), "classifierNamePolicy", "getClassifierNamePolicy()Lorg/jetbrains/kotlin/renderer/ClassifierNamePolicy;")), e0Var.e(new kotlin.jvm.internal.r(e0Var.b(k.class), "withDefinedIn", "getWithDefinedIn()Z")), e0Var.e(new kotlin.jvm.internal.r(e0Var.b(k.class), "withSourceFileForTopLevel", "getWithSourceFileForTopLevel()Z")), e0Var.e(new kotlin.jvm.internal.r(e0Var.b(k.class), "modifiers", "getModifiers()Ljava/util/Set;")), e0Var.e(new kotlin.jvm.internal.r(e0Var.b(k.class), "startFromName", "getStartFromName()Z")), e0Var.e(new kotlin.jvm.internal.r(e0Var.b(k.class), "startFromDeclarationKeyword", "getStartFromDeclarationKeyword()Z")), e0Var.e(new kotlin.jvm.internal.r(e0Var.b(k.class), "debugMode", "getDebugMode()Z")), e0Var.e(new kotlin.jvm.internal.r(e0Var.b(k.class), "classWithPrimaryConstructor", "getClassWithPrimaryConstructor()Z")), e0Var.e(new kotlin.jvm.internal.r(e0Var.b(k.class), "verbose", "getVerbose()Z")), e0Var.e(new kotlin.jvm.internal.r(e0Var.b(k.class), "unitReturnType", "getUnitReturnType()Z")), e0Var.e(new kotlin.jvm.internal.r(e0Var.b(k.class), "withoutReturnType", "getWithoutReturnType()Z")), e0Var.e(new kotlin.jvm.internal.r(e0Var.b(k.class), "enhancedTypes", "getEnhancedTypes()Z")), e0Var.e(new kotlin.jvm.internal.r(e0Var.b(k.class), "normalizedVisibilities", "getNormalizedVisibilities()Z")), e0Var.e(new kotlin.jvm.internal.r(e0Var.b(k.class), "renderDefaultVisibility", "getRenderDefaultVisibility()Z")), e0Var.e(new kotlin.jvm.internal.r(e0Var.b(k.class), "renderDefaultModality", "getRenderDefaultModality()Z")), e0Var.e(new kotlin.jvm.internal.r(e0Var.b(k.class), "renderConstructorDelegation", "getRenderConstructorDelegation()Z")), e0Var.e(new kotlin.jvm.internal.r(e0Var.b(k.class), "renderPrimaryConstructorParametersAsProperties", "getRenderPrimaryConstructorParametersAsProperties()Z")), e0Var.e(new kotlin.jvm.internal.r(e0Var.b(k.class), "actualPropertiesInPrimaryConstructor", "getActualPropertiesInPrimaryConstructor()Z")), e0Var.e(new kotlin.jvm.internal.r(e0Var.b(k.class), "uninferredTypeParameterAsName", "getUninferredTypeParameterAsName()Z")), e0Var.e(new kotlin.jvm.internal.r(e0Var.b(k.class), "includePropertyConstant", "getIncludePropertyConstant()Z")), e0Var.e(new kotlin.jvm.internal.r(e0Var.b(k.class), "withoutTypeParameters", "getWithoutTypeParameters()Z")), e0Var.e(new kotlin.jvm.internal.r(e0Var.b(k.class), "withoutSuperTypes", "getWithoutSuperTypes()Z")), e0Var.e(new kotlin.jvm.internal.r(e0Var.b(k.class), "typeNormalizer", "getTypeNormalizer()Lkotlin/jvm/functions/Function1;")), e0Var.e(new kotlin.jvm.internal.r(e0Var.b(k.class), "defaultParameterValueRenderer", "getDefaultParameterValueRenderer()Lkotlin/jvm/functions/Function1;")), e0Var.e(new kotlin.jvm.internal.r(e0Var.b(k.class), "secondaryConstructorsAsPrimary", "getSecondaryConstructorsAsPrimary()Z")), e0Var.e(new kotlin.jvm.internal.r(e0Var.b(k.class), "overrideRenderingPolicy", "getOverrideRenderingPolicy()Lorg/jetbrains/kotlin/renderer/OverrideRenderingPolicy;")), e0Var.e(new kotlin.jvm.internal.r(e0Var.b(k.class), "valueParametersHandler", "getValueParametersHandler()Lorg/jetbrains/kotlin/renderer/DescriptorRenderer$ValueParametersHandler;")), e0Var.e(new kotlin.jvm.internal.r(e0Var.b(k.class), "textFormat", "getTextFormat()Lorg/jetbrains/kotlin/renderer/RenderingFormat;")), e0Var.e(new kotlin.jvm.internal.r(e0Var.b(k.class), "parameterNameRenderingPolicy", "getParameterNameRenderingPolicy()Lorg/jetbrains/kotlin/renderer/ParameterNameRenderingPolicy;")), e0Var.e(new kotlin.jvm.internal.r(e0Var.b(k.class), "receiverAfterName", "getReceiverAfterName()Z")), e0Var.e(new kotlin.jvm.internal.r(e0Var.b(k.class), "renderCompanionObjectName", "getRenderCompanionObjectName()Z")), e0Var.e(new kotlin.jvm.internal.r(e0Var.b(k.class), "propertyAccessorRenderingPolicy", "getPropertyAccessorRenderingPolicy()Lorg/jetbrains/kotlin/renderer/PropertyAccessorRenderingPolicy;")), e0Var.e(new kotlin.jvm.internal.r(e0Var.b(k.class), "renderDefaultAnnotationArguments", "getRenderDefaultAnnotationArguments()Z")), e0Var.e(new kotlin.jvm.internal.r(e0Var.b(k.class), "eachAnnotationOnNewLine", "getEachAnnotationOnNewLine()Z")), e0Var.e(new kotlin.jvm.internal.r(e0Var.b(k.class), "excludedAnnotationClasses", "getExcludedAnnotationClasses()Ljava/util/Set;")), e0Var.e(new kotlin.jvm.internal.r(e0Var.b(k.class), "excludedTypeAnnotationClasses", "getExcludedTypeAnnotationClasses()Ljava/util/Set;")), e0Var.e(new kotlin.jvm.internal.r(e0Var.b(k.class), "annotationFilter", "getAnnotationFilter()Lkotlin/jvm/functions/Function1;")), e0Var.e(new kotlin.jvm.internal.r(e0Var.b(k.class), "annotationArgumentsRenderingPolicy", "getAnnotationArgumentsRenderingPolicy()Lorg/jetbrains/kotlin/renderer/AnnotationArgumentsRenderingPolicy;")), e0Var.e(new kotlin.jvm.internal.r(e0Var.b(k.class), "alwaysRenderModifiers", "getAlwaysRenderModifiers()Z")), e0Var.e(new kotlin.jvm.internal.r(e0Var.b(k.class), "renderConstructorKeyword", "getRenderConstructorKeyword()Z")), e0Var.e(new kotlin.jvm.internal.r(e0Var.b(k.class), "renderUnabbreviatedType", "getRenderUnabbreviatedType()Z")), e0Var.e(new kotlin.jvm.internal.r(e0Var.b(k.class), "renderTypeExpansions", "getRenderTypeExpansions()Z")), e0Var.e(new kotlin.jvm.internal.r(e0Var.b(k.class), "includeAdditionalModifiers", "getIncludeAdditionalModifiers()Z")), e0Var.e(new kotlin.jvm.internal.r(e0Var.b(k.class), "parameterNamesInFunctionalTypes", "getParameterNamesInFunctionalTypes()Z")), e0Var.e(new kotlin.jvm.internal.r(e0Var.b(k.class), "renderFunctionContracts", "getRenderFunctionContracts()Z")), e0Var.e(new kotlin.jvm.internal.r(e0Var.b(k.class), "presentableUnresolvedTypes", "getPresentableUnresolvedTypes()Z")), e0Var.e(new kotlin.jvm.internal.r(e0Var.b(k.class), "boldOnlyForNamesInHtml", "getBoldOnlyForNamesInHtml()Z")), e0Var.e(new kotlin.jvm.internal.r(e0Var.b(k.class), "informativeErrorType", "getInformativeErrorType()Z"))};
    }

    public k() {
        Boolean bool = Boolean.TRUE;
        this.f3730c = new wf.a(bool, this);
        this.f3731d = new wf.a(bool, this);
        this.f3732e = new wf.a(i.f3711b, this);
        Boolean bool2 = Boolean.FALSE;
        this.f3733f = new wf.a(bool2, this);
        this.f3734g = new wf.a(bool2, this);
        this.f3735h = new wf.a(bool2, this);
        this.f3736i = new wf.a(bool2, this);
        this.f3737j = new wf.a(bool2, this);
        this.f3738k = new wf.a(bool, this);
        this.l = new wf.a(bool2, this);
        this.f3739m = new wf.a(bool2, this);
        this.f3740n = new wf.a(bool2, this);
        this.f3741o = new wf.a(bool, this);
        this.f3742p = new wf.a(bool, this);
        this.f3743q = new wf.a(bool2, this);
        this.f3744r = new wf.a(bool2, this);
        this.f3745s = new wf.a(bool2, this);
        this.f3746t = new wf.a(bool2, this);
        this.f3747u = new wf.a(bool2, this);
        this.f3748v = new wf.a(bool2, this);
        this.f3749w = new wf.a(bool2, this);
        this.f3750x = new wf.a(g.f3704i, this);
        this.f3751y = new wf.a(g.f3703h, this);
        this.f3752z = new wf.a(bool, this);
        this.A = new wf.a(n.f3756b, this);
        this.B = new wf.a(d.f3696a, this);
        this.C = new wf.a(s.f3765a, this);
        this.D = new wf.a(o.f3758a, this);
        this.E = new wf.a(bool2, this);
        this.F = new wf.a(bool2, this);
        this.G = new wf.a(p.f3762a, this);
        this.H = new wf.a(bool2, this);
        this.I = new wf.a(bool2, this);
        this.J = new wf.a(x.f53868a, this);
        this.K = new wf.a(l.f3753a, this);
        this.L = new wf.a((Object) null, this);
        this.M = new wf.a(a.NO_ARGUMENTS, this);
        this.N = new wf.a(bool2, this);
        this.O = new wf.a(bool, this);
        this.P = new wf.a(bool, this);
        this.Q = new wf.a(bool2, this);
        this.R = new wf.a(bool, this);
        this.S = new wf.a(bool, this);
        this.T = new wf.a(bool2, this);
        this.U = new wf.a(bool2, this);
        this.V = new wf.a(bool, this);
    }

    @Override // am.j
    public final void a() {
        this.E.setValue(this, W[29], Boolean.TRUE);
    }

    @Override // am.j
    public final void b() {
        this.F.setValue(this, W[30], Boolean.TRUE);
    }

    @Override // am.j
    public final void c(o oVar) {
        this.D.setValue(this, W[28], oVar);
    }

    @Override // am.j
    public final void d() {
        this.f3748v.setValue(this, W[20], Boolean.TRUE);
    }

    @Override // am.j
    public final void e() {
        this.f3733f.setValue(this, W[4], Boolean.TRUE);
    }

    @Override // am.j
    public final Set f() {
        return (Set) this.K.getValue(this, W[35]);
    }

    @Override // am.j
    public final void g() {
        this.f3749w.setValue(this, W[21], Boolean.TRUE);
    }

    @Override // am.j
    public final void h() {
        this.f3735h.setValue(this, W[6], Boolean.TRUE);
    }

    @Override // am.j
    public final void i(c cVar) {
        this.f3729b.setValue(this, W[0], cVar);
    }

    @Override // am.j
    public final void j(Set set) {
        kotlin.jvm.internal.n.f(set, "<set-?>");
        this.f3732e.setValue(this, W[3], set);
    }

    @Override // am.j
    public final void k(LinkedHashSet linkedHashSet) {
        this.K.setValue(this, W[35], linkedHashSet);
    }

    @Override // am.j
    public final void l() {
        this.f3730c.setValue(this, W[1], Boolean.FALSE);
    }

    @Override // am.j
    public final void m() {
        this.C.setValue(this, W[27], s.f3766b);
    }

    public final boolean n() {
        return ((Boolean) this.f3735h.getValue(this, W[6])).booleanValue();
    }
}
