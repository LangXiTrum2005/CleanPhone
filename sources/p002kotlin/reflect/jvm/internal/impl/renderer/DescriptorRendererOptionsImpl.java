package p002kotlin.reflect.jvm.internal.impl.renderer;

import bren.ObservableProperty;
import bren.wireman;
import byname.dern;
import java.lang.reflect.Field;
import java.util.Set;
import kurbash.formularize;
import p002kotlin.collections.creditor;
import p002kotlin.jvm.functions.Function1;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.jvm.internal.MutablePropertyReference1Impl;
import p002kotlin.jvm.internal.PropertyReference1Impl;
import p002kotlin.jvm.internal.polloi;
import p002kotlin.reflect.jvm.internal.impl.descriptors.cultivated;
import p002kotlin.reflect.jvm.internal.impl.resolve.constants.competently;
import p002kotlin.reflect.jvm.internal.impl.types.oilcan;
import p002kotlin.text.dovishness;

/* JADX INFO: compiled from: DescriptorRendererOptionsImpl.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class DescriptorRendererOptionsImpl implements saneness {

    /* JADX INFO: renamed from: dent, reason: collision with root package name */
    public static final /* synthetic */ formularize<Object>[] f31216dent = {polloi.competently(new MutablePropertyReference1Impl(polloi.saneness(DescriptorRendererOptionsImpl.class), "classifierNamePolicy", "getClassifierNamePolicy()Lorg/jetbrains/kotlin/renderer/ClassifierNamePolicy;")), polloi.competently(new MutablePropertyReference1Impl(polloi.saneness(DescriptorRendererOptionsImpl.class), "withDefinedIn", "getWithDefinedIn()Z")), polloi.competently(new MutablePropertyReference1Impl(polloi.saneness(DescriptorRendererOptionsImpl.class), "withSourceFileForTopLevel", "getWithSourceFileForTopLevel()Z")), polloi.competently(new MutablePropertyReference1Impl(polloi.saneness(DescriptorRendererOptionsImpl.class), "modifiers", "getModifiers()Ljava/util/Set;")), polloi.competently(new MutablePropertyReference1Impl(polloi.saneness(DescriptorRendererOptionsImpl.class), "startFromName", "getStartFromName()Z")), polloi.competently(new MutablePropertyReference1Impl(polloi.saneness(DescriptorRendererOptionsImpl.class), "startFromDeclarationKeyword", "getStartFromDeclarationKeyword()Z")), polloi.competently(new MutablePropertyReference1Impl(polloi.saneness(DescriptorRendererOptionsImpl.class), "debugMode", "getDebugMode()Z")), polloi.competently(new MutablePropertyReference1Impl(polloi.saneness(DescriptorRendererOptionsImpl.class), "classWithPrimaryConstructor", "getClassWithPrimaryConstructor()Z")), polloi.competently(new MutablePropertyReference1Impl(polloi.saneness(DescriptorRendererOptionsImpl.class), "verbose", "getVerbose()Z")), polloi.competently(new MutablePropertyReference1Impl(polloi.saneness(DescriptorRendererOptionsImpl.class), "unitReturnType", "getUnitReturnType()Z")), polloi.competently(new MutablePropertyReference1Impl(polloi.saneness(DescriptorRendererOptionsImpl.class), "withoutReturnType", "getWithoutReturnType()Z")), polloi.competently(new MutablePropertyReference1Impl(polloi.saneness(DescriptorRendererOptionsImpl.class), "enhancedTypes", "getEnhancedTypes()Z")), polloi.competently(new MutablePropertyReference1Impl(polloi.saneness(DescriptorRendererOptionsImpl.class), "normalizedVisibilities", "getNormalizedVisibilities()Z")), polloi.competently(new MutablePropertyReference1Impl(polloi.saneness(DescriptorRendererOptionsImpl.class), "renderDefaultVisibility", "getRenderDefaultVisibility()Z")), polloi.competently(new MutablePropertyReference1Impl(polloi.saneness(DescriptorRendererOptionsImpl.class), "renderDefaultModality", "getRenderDefaultModality()Z")), polloi.competently(new MutablePropertyReference1Impl(polloi.saneness(DescriptorRendererOptionsImpl.class), "renderConstructorDelegation", "getRenderConstructorDelegation()Z")), polloi.competently(new MutablePropertyReference1Impl(polloi.saneness(DescriptorRendererOptionsImpl.class), "renderPrimaryConstructorParametersAsProperties", "getRenderPrimaryConstructorParametersAsProperties()Z")), polloi.competently(new MutablePropertyReference1Impl(polloi.saneness(DescriptorRendererOptionsImpl.class), "actualPropertiesInPrimaryConstructor", "getActualPropertiesInPrimaryConstructor()Z")), polloi.competently(new MutablePropertyReference1Impl(polloi.saneness(DescriptorRendererOptionsImpl.class), "uninferredTypeParameterAsName", "getUninferredTypeParameterAsName()Z")), polloi.competently(new MutablePropertyReference1Impl(polloi.saneness(DescriptorRendererOptionsImpl.class), "includePropertyConstant", "getIncludePropertyConstant()Z")), polloi.competently(new MutablePropertyReference1Impl(polloi.saneness(DescriptorRendererOptionsImpl.class), "propertyConstantRenderer", "getPropertyConstantRenderer()Lkotlin/jvm/functions/Function1;")), polloi.competently(new MutablePropertyReference1Impl(polloi.saneness(DescriptorRendererOptionsImpl.class), "withoutTypeParameters", "getWithoutTypeParameters()Z")), polloi.competently(new MutablePropertyReference1Impl(polloi.saneness(DescriptorRendererOptionsImpl.class), "withoutSuperTypes", "getWithoutSuperTypes()Z")), polloi.competently(new MutablePropertyReference1Impl(polloi.saneness(DescriptorRendererOptionsImpl.class), "typeNormalizer", "getTypeNormalizer()Lkotlin/jvm/functions/Function1;")), polloi.competently(new MutablePropertyReference1Impl(polloi.saneness(DescriptorRendererOptionsImpl.class), "defaultParameterValueRenderer", "getDefaultParameterValueRenderer()Lkotlin/jvm/functions/Function1;")), polloi.competently(new MutablePropertyReference1Impl(polloi.saneness(DescriptorRendererOptionsImpl.class), "secondaryConstructorsAsPrimary", "getSecondaryConstructorsAsPrimary()Z")), polloi.competently(new MutablePropertyReference1Impl(polloi.saneness(DescriptorRendererOptionsImpl.class), "overrideRenderingPolicy", "getOverrideRenderingPolicy()Lorg/jetbrains/kotlin/renderer/OverrideRenderingPolicy;")), polloi.competently(new MutablePropertyReference1Impl(polloi.saneness(DescriptorRendererOptionsImpl.class), "valueParametersHandler", "getValueParametersHandler()Lorg/jetbrains/kotlin/renderer/DescriptorRenderer$ValueParametersHandler;")), polloi.competently(new MutablePropertyReference1Impl(polloi.saneness(DescriptorRendererOptionsImpl.class), "textFormat", "getTextFormat()Lorg/jetbrains/kotlin/renderer/RenderingFormat;")), polloi.competently(new MutablePropertyReference1Impl(polloi.saneness(DescriptorRendererOptionsImpl.class), "parameterNameRenderingPolicy", "getParameterNameRenderingPolicy()Lorg/jetbrains/kotlin/renderer/ParameterNameRenderingPolicy;")), polloi.competently(new MutablePropertyReference1Impl(polloi.saneness(DescriptorRendererOptionsImpl.class), "receiverAfterName", "getReceiverAfterName()Z")), polloi.competently(new MutablePropertyReference1Impl(polloi.saneness(DescriptorRendererOptionsImpl.class), "renderCompanionObjectName", "getRenderCompanionObjectName()Z")), polloi.competently(new MutablePropertyReference1Impl(polloi.saneness(DescriptorRendererOptionsImpl.class), "propertyAccessorRenderingPolicy", "getPropertyAccessorRenderingPolicy()Lorg/jetbrains/kotlin/renderer/PropertyAccessorRenderingPolicy;")), polloi.competently(new MutablePropertyReference1Impl(polloi.saneness(DescriptorRendererOptionsImpl.class), "renderDefaultAnnotationArguments", "getRenderDefaultAnnotationArguments()Z")), polloi.competently(new MutablePropertyReference1Impl(polloi.saneness(DescriptorRendererOptionsImpl.class), "eachAnnotationOnNewLine", "getEachAnnotationOnNewLine()Z")), polloi.competently(new MutablePropertyReference1Impl(polloi.saneness(DescriptorRendererOptionsImpl.class), "excludedAnnotationClasses", "getExcludedAnnotationClasses()Ljava/util/Set;")), polloi.competently(new MutablePropertyReference1Impl(polloi.saneness(DescriptorRendererOptionsImpl.class), "excludedTypeAnnotationClasses", "getExcludedTypeAnnotationClasses()Ljava/util/Set;")), polloi.competently(new MutablePropertyReference1Impl(polloi.saneness(DescriptorRendererOptionsImpl.class), "annotationFilter", "getAnnotationFilter()Lkotlin/jvm/functions/Function1;")), polloi.competently(new MutablePropertyReference1Impl(polloi.saneness(DescriptorRendererOptionsImpl.class), "annotationArgumentsRenderingPolicy", "getAnnotationArgumentsRenderingPolicy()Lorg/jetbrains/kotlin/renderer/AnnotationArgumentsRenderingPolicy;")), polloi.competently(new MutablePropertyReference1Impl(polloi.saneness(DescriptorRendererOptionsImpl.class), "alwaysRenderModifiers", "getAlwaysRenderModifiers()Z")), polloi.competently(new MutablePropertyReference1Impl(polloi.saneness(DescriptorRendererOptionsImpl.class), "renderConstructorKeyword", "getRenderConstructorKeyword()Z")), polloi.competently(new MutablePropertyReference1Impl(polloi.saneness(DescriptorRendererOptionsImpl.class), "renderUnabbreviatedType", "getRenderUnabbreviatedType()Z")), polloi.competently(new MutablePropertyReference1Impl(polloi.saneness(DescriptorRendererOptionsImpl.class), "renderTypeExpansions", "getRenderTypeExpansions()Z")), polloi.competently(new MutablePropertyReference1Impl(polloi.saneness(DescriptorRendererOptionsImpl.class), "includeAdditionalModifiers", "getIncludeAdditionalModifiers()Z")), polloi.competently(new MutablePropertyReference1Impl(polloi.saneness(DescriptorRendererOptionsImpl.class), "parameterNamesInFunctionalTypes", "getParameterNamesInFunctionalTypes()Z")), polloi.competently(new MutablePropertyReference1Impl(polloi.saneness(DescriptorRendererOptionsImpl.class), "renderFunctionContracts", "getRenderFunctionContracts()Z")), polloi.competently(new MutablePropertyReference1Impl(polloi.saneness(DescriptorRendererOptionsImpl.class), "presentableUnresolvedTypes", "getPresentableUnresolvedTypes()Z")), polloi.competently(new MutablePropertyReference1Impl(polloi.saneness(DescriptorRendererOptionsImpl.class), "boldOnlyForNamesInHtml", "getBoldOnlyForNamesInHtml()Z")), polloi.competently(new MutablePropertyReference1Impl(polloi.saneness(DescriptorRendererOptionsImpl.class), "informativeErrorType", "getInformativeErrorType()Z"))};

    /* JADX INFO: renamed from: adultoid, reason: collision with root package name */
    public final wireman f31217adultoid;

    /* JADX INFO: renamed from: apical, reason: collision with root package name */
    public final wireman f31218apical;

    /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
    public final wireman f31219arytenoidectomy;

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public boolean f31220attabal;

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
    public final wireman f31221beachfront;

    /* JADX INFO: renamed from: clubfoot, reason: collision with root package name */
    public final wireman f31222clubfoot;

    /* JADX INFO: renamed from: competently, reason: collision with root package name */
    public final wireman f31223competently;

    /* JADX INFO: renamed from: cord, reason: collision with root package name */
    public final wireman f31224cord;

    /* JADX INFO: renamed from: creditor, reason: collision with root package name */
    public final wireman f31225creditor;

    /* JADX INFO: renamed from: cuirassed, reason: collision with root package name */
    public final wireman f31226cuirassed;

    /* JADX INFO: renamed from: cutely, reason: collision with root package name */
    public final wireman f31227cutely;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final wireman f31228dern;

    /* JADX INFO: renamed from: dovishness, reason: collision with root package name */
    public final wireman f31229dovishness;

    /* JADX INFO: renamed from: formularize, reason: collision with root package name */
    public final wireman f31230formularize;

    /* JADX INFO: renamed from: gintrap, reason: collision with root package name */
    public final wireman f31231gintrap;

    /* JADX INFO: renamed from: graveside, reason: collision with root package name */
    public final wireman f31232graveside;

    /* JADX INFO: renamed from: grimness, reason: collision with root package name */
    public final wireman f31233grimness;

    /* JADX INFO: renamed from: hydrovane, reason: collision with root package name */
    public final wireman f31234hydrovane;

    /* JADX INFO: renamed from: impassible, reason: collision with root package name */
    public final wireman f31235impassible;

    /* JADX INFO: renamed from: impromptu, reason: collision with root package name */
    public final wireman f31236impromptu;

    /* JADX INFO: renamed from: kattegat, reason: collision with root package name */
    public final wireman f31237kattegat;

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
    public final wireman f31238kowloon;

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public final wireman f31239marial;

    /* JADX INFO: renamed from: mathsort, reason: collision with root package name */
    public final wireman f31240mathsort;

    /* JADX INFO: renamed from: merc, reason: collision with root package name */
    public final wireman f31241merc;

    /* JADX INFO: renamed from: molybdenite, reason: collision with root package name */
    public final wireman f31242molybdenite;

    /* JADX INFO: renamed from: monoploid, reason: collision with root package name */
    public final wireman f31243monoploid;

    /* JADX INFO: renamed from: oilcan, reason: collision with root package name */
    public final wireman f31244oilcan;

    /* JADX INFO: renamed from: overspeculate, reason: collision with root package name */
    public final wireman f31245overspeculate;

    /* JADX INFO: renamed from: peridotite, reason: collision with root package name */
    public final wireman f31246peridotite;

    /* JADX INFO: renamed from: polder, reason: collision with root package name */
    public final wireman f31247polder;

    /* JADX INFO: renamed from: polloi, reason: collision with root package name */
    public final wireman f31248polloi;

    /* JADX INFO: renamed from: preprohormone, reason: collision with root package name */
    public final wireman f31249preprohormone;

    /* JADX INFO: renamed from: privatdozent, reason: collision with root package name */
    public final wireman f31250privatdozent;

    /* JADX INFO: renamed from: restrictive, reason: collision with root package name */
    public final wireman f31251restrictive;

    /* JADX INFO: renamed from: rotuma, reason: collision with root package name */
    public final wireman f31252rotuma;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final wireman f31253saneness = empress(kotlin.reflect.jvm.internal.impl.renderer.attabal.dern.f31277attabal);

    /* JADX INFO: renamed from: saran, reason: collision with root package name */
    public final wireman f31254saran;

    /* JADX INFO: renamed from: sealless, reason: collision with root package name */
    public final wireman f31255sealless;

    /* JADX INFO: renamed from: seminary, reason: collision with root package name */
    public final wireman f31256seminary;

    /* JADX INFO: renamed from: splinterproof, reason: collision with root package name */
    public final wireman f31257splinterproof;

    /* JADX INFO: renamed from: starveling, reason: collision with root package name */
    public final wireman f31258starveling;

    /* JADX INFO: renamed from: stratoscope, reason: collision with root package name */
    public final wireman f31259stratoscope;

    /* JADX INFO: renamed from: supplicat, reason: collision with root package name */
    public final wireman f31260supplicat;

    /* JADX INFO: renamed from: taiyuan, reason: collision with root package name */
    public final wireman f31261taiyuan;

    /* JADX INFO: renamed from: triweekly, reason: collision with root package name */
    public final wireman f31262triweekly;

    /* JADX INFO: renamed from: trm, reason: collision with root package name */
    public final wireman f31263trm;

    /* JADX INFO: renamed from: walach, reason: collision with root package name */
    public final wireman f31264walach;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public final wireman f31265wireman;

    /* JADX INFO: renamed from: yemenite, reason: collision with root package name */
    public final wireman f31266yemenite;

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: compiled from: Delegates.kt */
    public static final class attabal<T> extends ObservableProperty<T> {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final /* synthetic */ DescriptorRendererOptionsImpl f31267attabal;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public attabal(Object obj, DescriptorRendererOptionsImpl descriptorRendererOptionsImpl) {
            super(obj);
            this.f31267attabal = descriptorRendererOptionsImpl;
        }

        @Override // bren.ObservableProperty
        public boolean beforeChange(formularize<?> property, T t, T t2) {
            Intrinsics.checkNotNullParameter(property, "property");
            if (this.f31267attabal.lotta()) {
                throw new IllegalStateException("Cannot modify readonly DescriptorRendererOptions");
            }
            return true;
        }
    }

    public DescriptorRendererOptionsImpl() {
        Boolean bool = Boolean.TRUE;
        this.f31228dern = empress(bool);
        this.f31265wireman = empress(bool);
        this.f31239marial = empress(DescriptorRendererModifier.ALL_EXCEPT_ANNOTATIONS);
        Boolean bool2 = Boolean.FALSE;
        this.f31221beachfront = empress(bool2);
        this.f31223competently = empress(bool2);
        this.f31236impromptu = empress(bool2);
        this.f31261taiyuan = empress(bool2);
        this.f31227cutely = empress(bool2);
        this.f31218apical = empress(bool);
        this.f31230formularize = empress(bool2);
        this.f31235impassible = empress(bool2);
        this.f31262triweekly = empress(bool2);
        this.f31238kowloon = empress(bool);
        this.f31219arytenoidectomy = empress(bool);
        this.f31243monoploid = empress(bool2);
        this.f31248polloi = empress(bool2);
        this.f31242molybdenite = empress(bool2);
        this.f31232graveside = empress(bool2);
        this.f31217adultoid = empress(bool2);
        this.f31229dovishness = empress(null);
        this.f31231gintrap = empress(bool2);
        this.f31252rotuma = empress(bool2);
        this.f31249preprohormone = empress(new Function1<oilcan, oilcan>() { // from class: kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptionsImpl$typeNormalizer$2
            @Override // p002kotlin.jvm.functions.Function1
            public final oilcan invoke(oilcan it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return it;
            }
        });
        this.f31224cord = empress(new Function1<cultivated, String>() { // from class: kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptionsImpl$defaultParameterValueRenderer$2
            @Override // p002kotlin.jvm.functions.Function1
            public final String invoke(cultivated it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return "...";
            }
        });
        this.f31226cuirassed = empress(bool);
        this.f31259stratoscope = empress(OverrideRenderingPolicy.RENDER_OPEN);
        this.f31263trm = empress(DescriptorRenderer.saneness.attabal.f31207attabal);
        this.f31244oilcan = empress(RenderingFormat.PLAIN);
        this.f31266yemenite = empress(ParameterNameRenderingPolicy.ALL);
        this.f31255sealless = empress(bool2);
        this.f31237kattegat = empress(bool2);
        this.f31260supplicat = empress(PropertyAccessorRenderingPolicy.DEBUG);
        this.f31251restrictive = empress(bool2);
        this.f31241merc = empress(bool2);
        this.f31247polder = empress(creditor.marial());
        this.f31256seminary = empress(dern.f31279attabal.attabal());
        this.f31233grimness = empress(null);
        this.f31254saran = empress(AnnotationArgumentsRenderingPolicy.NO_ARGUMENTS);
        this.f31250privatdozent = empress(bool2);
        this.f31225creditor = empress(bool);
        this.f31258starveling = empress(bool);
        this.f31234hydrovane = empress(bool2);
        this.f31264walach = empress(bool);
        this.f31246peridotite = empress(bool);
        this.f31240mathsort = empress(bool2);
        this.f31257splinterproof = empress(bool2);
        this.f31245overspeculate = empress(bool2);
        this.f31222clubfoot = empress(bool);
    }

    public p002kotlin.reflect.jvm.internal.impl.renderer.attabal adultoid() {
        return (p002kotlin.reflect.jvm.internal.impl.renderer.attabal) this.f31253saneness.getValue(this, f31216dent[0]);
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.renderer.saneness
    public void apical(Set<? extends DescriptorRendererModifier> set) {
        Intrinsics.checkNotNullParameter(set, "<set-?>");
        this.f31239marial.setValue(this, f31216dent[3], set);
    }

    public boolean arytenoidectomy() {
        return ((Boolean) this.f31242molybdenite.getValue(this, f31216dent[17])).booleanValue();
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.renderer.saneness
    public void attabal(boolean z) {
        this.f31221beachfront.setValue(this, f31216dent[4], Boolean.valueOf(z));
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.renderer.saneness
    public void beachfront(boolean z) {
        this.f31255sealless.setValue(this, f31216dent[30], Boolean.valueOf(z));
    }

    public boolean clubfoot() {
        return ((Boolean) this.f31221beachfront.getValue(this, f31216dent[4])).booleanValue();
    }

    public boolean coffeecake() {
        return ((Boolean) this.f31230formularize.getValue(this, f31216dent[10])).booleanValue();
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.renderer.saneness
    public void competently(RenderingFormat renderingFormat) {
        Intrinsics.checkNotNullParameter(renderingFormat, "<set-?>");
        this.f31244oilcan.setValue(this, f31216dent[28], renderingFormat);
    }

    public boolean cord() {
        return saneness.attabal.attabal(this);
    }

    public boolean creditor() {
        return ((Boolean) this.f31251restrictive.getValue(this, f31216dent[33])).booleanValue();
    }

    public boolean cuirassed() {
        return saneness.attabal.saneness(this);
    }

    public boolean cultivated() {
        return ((Boolean) this.f31232graveside.getValue(this, f31216dent[18])).booleanValue();
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.renderer.saneness
    public void cutely(Set<dern> set) {
        Intrinsics.checkNotNullParameter(set, "<set-?>");
        this.f31256seminary.setValue(this, f31216dent[36], set);
    }

    public RenderingFormat dent() {
        return (RenderingFormat) this.f31244oilcan.getValue(this, f31216dent[28]);
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.renderer.saneness
    public void dern(boolean z) {
        this.f31228dern.setValue(this, f31216dent[1], Boolean.valueOf(z));
    }

    public Function1<cultivated, String> dovishness() {
        return (Function1) this.f31224cord.getValue(this, f31216dent[24]);
    }

    public final <T> wireman<DescriptorRendererOptionsImpl, T> empress(T t) {
        bren.attabal attabalVar = bren.attabal.f15137attabal;
        return new attabal(t, this);
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.renderer.saneness
    public void formularize(p002kotlin.reflect.jvm.internal.impl.renderer.attabal attabalVar) {
        Intrinsics.checkNotNullParameter(attabalVar, "<set-?>");
        this.f31253saneness.setValue(this, f31216dent[0], attabalVar);
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.renderer.saneness
    public boolean getDebugMode() {
        return ((Boolean) this.f31236impromptu.getValue(this, f31216dent[6])).booleanValue();
    }

    public boolean gintrap() {
        return ((Boolean) this.f31241merc.getValue(this, f31216dent[34])).booleanValue();
    }

    public boolean graveside() {
        return ((Boolean) this.f31261taiyuan.getValue(this, f31216dent[7])).booleanValue();
    }

    public boolean grimness() {
        return ((Boolean) this.f31237kattegat.getValue(this, f31216dent[31])).booleanValue();
    }

    public boolean hydrovane() {
        return ((Boolean) this.f31238kowloon.getValue(this, f31216dent[13])).booleanValue();
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.renderer.saneness
    public void impassible(boolean z) {
        this.f31237kattegat.setValue(this, f31216dent[31], Boolean.valueOf(z));
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.renderer.saneness
    public Set<dern> impromptu() {
        return (Set) this.f31256seminary.getValue(this, f31216dent[36]);
    }

    public boolean itchy() {
        return ((Boolean) this.f31265wireman.getValue(this, f31216dent[2])).booleanValue();
    }

    public ParameterNameRenderingPolicy kattegat() {
        return (ParameterNameRenderingPolicy) this.f31266yemenite.getValue(this, f31216dent[29]);
    }

    public final DescriptorRendererOptionsImpl kowloon() {
        DescriptorRendererOptionsImpl descriptorRendererOptionsImpl = new DescriptorRendererOptionsImpl();
        Field[] declaredFields = DescriptorRendererOptionsImpl.class.getDeclaredFields();
        Intrinsics.checkNotNullExpressionValue(declaredFields, "getDeclaredFields(...)");
        for (Field field : declaredFields) {
            if ((field.getModifiers() & 8) == 0) {
                field.setAccessible(true);
                Object obj = field.get(this);
                ObservableProperty observableProperty = obj instanceof ObservableProperty ? (ObservableProperty) obj : null;
                if (observableProperty != null) {
                    String name = field.getName();
                    Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
                    dovishness.starveling(name, "is", false, 2, null);
                    kurbash.wireman wiremanVarSaneness = polloi.saneness(DescriptorRendererOptionsImpl.class);
                    String name2 = field.getName();
                    StringBuilder sb = new StringBuilder();
                    sb.append("get");
                    String name3 = field.getName();
                    Intrinsics.checkNotNullExpressionValue(name3, "getName(...)");
                    if (name3.length() > 0) {
                        char upperCase = Character.toUpperCase(name3.charAt(0));
                        String strSubstring = name3.substring(1);
                        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
                        name3 = upperCase + strSubstring;
                    }
                    sb.append(name3);
                    field.set(descriptorRendererOptionsImpl, descriptorRendererOptionsImpl.empress(observableProperty.getValue(this, new PropertyReference1Impl(wiremanVarSaneness, name2, sb.toString()))));
                }
            }
        }
        return descriptorRendererOptionsImpl;
    }

    public boolean lerp() {
        return ((Boolean) this.f31252rotuma.getValue(this, f31216dent[22])).booleanValue();
    }

    public final boolean lotta() {
        return this.f31220attabal;
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.renderer.saneness
    public void marial(boolean z) {
        this.f31252rotuma.setValue(this, f31216dent[22], Boolean.valueOf(z));
    }

    public boolean mathsort() {
        return ((Boolean) this.f31258starveling.getValue(this, f31216dent[41])).booleanValue();
    }

    public PropertyAccessorRenderingPolicy merc() {
        return (PropertyAccessorRenderingPolicy) this.f31260supplicat.getValue(this, f31216dent[32]);
    }

    public boolean milliradian() {
        return ((Boolean) this.f31227cutely.getValue(this, f31216dent[8])).booleanValue();
    }

    public boolean molybdenite() {
        return ((Boolean) this.f31245overspeculate.getValue(this, f31216dent[47])).booleanValue();
    }

    public boolean monoploid() {
        return ((Boolean) this.f31250privatdozent.getValue(this, f31216dent[39])).booleanValue();
    }

    public boolean nosophobia() {
        return ((Boolean) this.f31231gintrap.getValue(this, f31216dent[21])).booleanValue();
    }

    public Set<DescriptorRendererModifier> oilcan() {
        return (Set) this.f31239marial.getValue(this, f31216dent[3]);
    }

    public boolean overspeculate() {
        return ((Boolean) this.f31223competently.getValue(this, f31216dent[5])).booleanValue();
    }

    public boolean peridotite() {
        return ((Boolean) this.f31234hydrovane.getValue(this, f31216dent[42])).booleanValue();
    }

    public Function1<oilcan, oilcan> permissivist() {
        return (Function1) this.f31249preprohormone.getValue(this, f31216dent[23]);
    }

    public Function1<competently<?>, String> polder() {
        return (Function1) this.f31229dovishness.getValue(this, f31216dent[20]);
    }

    public Function1<p002kotlin.reflect.jvm.internal.impl.descriptors.annotations.dern, Boolean> polloi() {
        return (Function1) this.f31233grimness.getValue(this, f31216dent[37]);
    }

    public boolean premeiotic() {
        return ((Boolean) this.f31218apical.getValue(this, f31216dent[9])).booleanValue();
    }

    public boolean preprohormone() {
        return ((Boolean) this.f31264walach.getValue(this, f31216dent[43])).booleanValue();
    }

    public boolean privatdozent() {
        return ((Boolean) this.f31225creditor.getValue(this, f31216dent[40])).booleanValue();
    }

    public boolean restrictive() {
        return ((Boolean) this.f31257splinterproof.getValue(this, f31216dent[46])).booleanValue();
    }

    public Set<dern> rotuma() {
        return (Set) this.f31247polder.getValue(this, f31216dent[35]);
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.renderer.saneness
    public void saneness(ParameterNameRenderingPolicy parameterNameRenderingPolicy) {
        Intrinsics.checkNotNullParameter(parameterNameRenderingPolicy, "<set-?>");
        this.f31266yemenite.setValue(this, f31216dent[29], parameterNameRenderingPolicy);
    }

    public boolean saran() {
        return ((Boolean) this.f31243monoploid.getValue(this, f31216dent[15])).booleanValue();
    }

    public final void sayid() {
        this.f31220attabal = true;
    }

    public OverrideRenderingPolicy sealless() {
        return (OverrideRenderingPolicy) this.f31259stratoscope.getValue(this, f31216dent[26]);
    }

    public boolean seminary() {
        return ((Boolean) this.f31255sealless.getValue(this, f31216dent[30])).booleanValue();
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.renderer.saneness
    public void setDebugMode(boolean z) {
        this.f31236impromptu.setValue(this, f31216dent[6], Boolean.valueOf(z));
    }

    public boolean splinterproof() {
        return ((Boolean) this.f31226cuirassed.getValue(this, f31216dent[25])).booleanValue();
    }

    public boolean starveling() {
        return ((Boolean) this.f31219arytenoidectomy.getValue(this, f31216dent[14])).booleanValue();
    }

    public boolean stratoscope() {
        return ((Boolean) this.f31217adultoid.getValue(this, f31216dent[19])).booleanValue();
    }

    public boolean supplicat() {
        return ((Boolean) this.f31246peridotite.getValue(this, f31216dent[44])).booleanValue();
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.renderer.saneness
    public AnnotationArgumentsRenderingPolicy taiyuan() {
        return (AnnotationArgumentsRenderingPolicy) this.f31254saran.getValue(this, f31216dent[38]);
    }

    public DescriptorRenderer.saneness timberyard() {
        return (DescriptorRenderer.saneness) this.f31263trm.getValue(this, f31216dent[27]);
    }

    public boolean treadless() {
        return ((Boolean) this.f31228dern.getValue(this, f31216dent[1])).booleanValue();
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.renderer.saneness
    public void triweekly(boolean z) {
        this.f31231gintrap.setValue(this, f31216dent[21], Boolean.valueOf(z));
    }

    public boolean trm() {
        return ((Boolean) this.f31222clubfoot.getValue(this, f31216dent[48])).booleanValue();
    }

    public boolean walach() {
        return ((Boolean) this.f31248polloi.getValue(this, f31216dent[16])).booleanValue();
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.renderer.saneness
    public boolean wireman() {
        return ((Boolean) this.f31235impassible.getValue(this, f31216dent[11])).booleanValue();
    }

    public boolean yemenite() {
        return ((Boolean) this.f31262triweekly.getValue(this, f31216dent[12])).booleanValue();
    }
}
