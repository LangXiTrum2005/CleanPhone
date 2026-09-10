package p002kotlin.reflect.jvm.internal;

import com.ironsource.C3414a2;
import com.unity3d.ads.metadata.InAppPurchaseMetaData;
import iaido.saneness;
import java.lang.reflect.Constructor;
import java.lang.reflect.Executable;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kurbash.impromptu;
import p002kotlin.LazyThreadSafetyMode;
import p002kotlin.Metadata;
import p002kotlin.NoWhenBranchMatchedException;
import p002kotlin.jvm.functions.Function0;
import p002kotlin.jvm.internal.CallableReference;
import p002kotlin.jvm.internal.DefaultConstructorMarker;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.jvm.internal.PropertyReference1Impl;
import p002kotlin.jvm.internal.formularize;
import p002kotlin.jvm.internal.polloi;
import p002kotlin.reflect.KParameter;
import p002kotlin.reflect.jvm.internal.calls.AnnotationConstructorCaller;
import p002kotlin.reflect.jvm.internal.calls.ValueClassAwareCaller;
import p002kotlin.reflect.jvm.internal.calls.dern;
import p002kotlin.reflect.jvm.internal.calls.marial;
import p002kotlin.reflect.jvm.internal.calls.wireman;
import p002kotlin.reflect.jvm.internal.impl.descriptors.apical;
import p002kotlin.reflect.jvm.internal.impl.descriptors.cultivated;
import p002kotlin.reflect.jvm.internal.impl.descriptors.cutely;
import p002kotlin.reflect.jvm.internal.impl.descriptors.dovishness;
import p002kotlin.reflect.jvm.internal.impl.resolve.beachfront;
import patroclinal.taiyuan;

/* JADX INFO: compiled from: KFunctionImpl.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0014\b\u0000\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00032\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00042\u00020\u0005B\u0019\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bB7\b\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000e\u001a\u00020\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\n\u0010\u0011B+\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000e\u001a\u00020\f\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\n\u0010\u0013J\u0017\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0019\u0010\u0018J\u0017\u0010\u001a\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u001a\u0010\u0018J5\u0010\u001f\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u001b0\u001e2\n\u0010\u0015\u001a\u0006\u0012\u0002\b\u00030\u001b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u001d\u001a\u00020\u001cH\u0002¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010\"\u001a\u00020\u001c2\b\u0010!\u001a\u0004\u0018\u00010\u0002H\u0096\u0002¢\u0006\u0004\b\"\u0010#J\u000f\u0010%\u001a\u00020$H\u0016¢\u0006\u0004\b%\u0010&J\u000f\u0010'\u001a\u00020\fH\u0016¢\u0006\u0004\b'\u0010(R\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R\u0014\u0010\u000e\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0016\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010/R\u001b\u0010\t\u001a\u00020\b8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u00103R\u001f\u00108\u001a\u0006\u0012\u0002\b\u0003048VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b-\u00107R!\u0010:\u001a\b\u0012\u0002\b\u0003\u0018\u0001048VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b9\u00106\u001a\u0004\b0\u00107R\u0016\u0010\u0012\u001a\u0004\u0018\u00010\u00028BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b;\u0010<R\u0014\u0010?\u001a\u00020\u001c8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b=\u0010>R\u0014\u0010\r\u001a\u00020\f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b@\u0010(R\u0014\u0010B\u001a\u00020$8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bA\u0010&R\u0014\u0010C\u001a\u00020\u001c8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bC\u0010>R\u0014\u0010D\u001a\u00020\u001c8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bD\u0010>R\u0014\u0010E\u001a\u00020\u001c8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bE\u0010>R\u0014\u0010F\u001a\u00020\u001c8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bF\u0010>R\u0014\u0010G\u001a\u00020\u001c8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bG\u0010>¨\u0006H"}, d2 = {"Lkotlin/reflect/jvm/internal/KFunctionImpl;", "Lkotlin/reflect/jvm/internal/KCallableImpl;", "", "Lkurbash/impromptu;", "Lkotlin/jvm/internal/formularize;", "Lkotlin/reflect/jvm/internal/beachfront;", "Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;", "container", "Lkotlin/reflect/jvm/internal/impl/descriptors/dovishness;", "descriptor", "<init>", "(Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;Lorg/jetbrains/kotlin/descriptors/FunctionDescriptor;)V", "", "name", InAppPurchaseMetaData.KEY_SIGNATURE, "descriptorInitialValue", "rawBoundReceiver", "(Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;Ljava/lang/String;Ljava/lang/String;Lorg/jetbrains/kotlin/descriptors/FunctionDescriptor;Ljava/lang/Object;)V", "boundReceiver", "(Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V", "Ljava/lang/reflect/Method;", "member", "Lkotlin/reflect/jvm/internal/calls/wireman$impromptu;", "polder", "(Ljava/lang/reflect/Method;)Lkotlin/reflect/jvm/internal/calls/wireman$impromptu;", "merc", "restrictive", "Ljava/lang/reflect/Constructor;", "", "isDefault", "Lkotlin/reflect/jvm/internal/calls/wireman;", "supplicat", "(Ljava/lang/reflect/Constructor;Lkotlin/reflect/jvm/internal/impl/descriptors/dovishness;Z)Lkotlin/reflect/jvm/internal/calls/wireman;", C3414a2.d, "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "adultoid", "Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;", "gintrap", "()Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;", "dovishness", "Ljava/lang/String;", "Ljava/lang/Object;", "rotuma", "Lkotlin/reflect/jvm/internal/triweekly$attabal;", "getDescriptor", "()Lorg/jetbrains/kotlin/descriptors/FunctionDescriptor;", "Lkotlin/reflect/jvm/internal/calls/dern;", "preprohormone", "Lpatroclinal/taiyuan;", "()Lkotlin/reflect/jvm/internal/calls/dern;", "caller", "cord", "defaultCaller", "seminary", "()Ljava/lang/Object;", "stratoscope", "()Z", "isBound", "getName", "getArity", "arity", "isInline", "isExternal", "isOperator", "isInfix", "isSuspend", "kotlin-reflection"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class KFunctionImpl extends KCallableImpl<Object> implements formularize<Object>, impromptu<Object>, beachfront {

    /* JADX INFO: renamed from: cuirassed, reason: collision with root package name */
    public static final /* synthetic */ kurbash.formularize<Object>[] f29487cuirassed = {polloi.cutely(new PropertyReference1Impl(polloi.saneness(KFunctionImpl.class), "descriptor", "getDescriptor()Lorg/jetbrains/kotlin/descriptors/FunctionDescriptor;"))};

    /* JADX INFO: renamed from: adultoid, reason: collision with root package name and from kotlin metadata */
    public final KDeclarationContainerImpl container;

    /* JADX INFO: renamed from: cord, reason: collision with root package name and from kotlin metadata */
    public final taiyuan defaultCaller;

    /* JADX INFO: renamed from: dovishness, reason: collision with root package name and from kotlin metadata */
    public final String signature;

    /* JADX INFO: renamed from: gintrap, reason: collision with root package name and from kotlin metadata */
    public final Object rawBoundReceiver;

    /* JADX INFO: renamed from: preprohormone, reason: collision with root package name and from kotlin metadata */
    public final taiyuan caller;

    /* JADX INFO: renamed from: rotuma, reason: collision with root package name and from kotlin metadata */
    public final triweekly.attabal descriptor;

    public /* synthetic */ KFunctionImpl(KDeclarationContainerImpl kDeclarationContainerImpl, String str, String str2, dovishness dovishnessVar, Object obj, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(kDeclarationContainerImpl, str, str2, dovishnessVar, (i & 16) != 0 ? CallableReference.NO_RECEIVER : obj);
    }

    private final Object seminary() {
        return p002kotlin.reflect.jvm.internal.calls.impromptu.competently(this.rawBoundReceiver, trm());
    }

    @Override // p002kotlin.reflect.jvm.internal.KCallableImpl
    public dern<?> dovishness() {
        return (dern) this.caller.getValue();
    }

    public boolean equals(Object other) {
        KFunctionImpl kFunctionImplDern = molybdenite.dern(other);
        return kFunctionImplDern != null && Intrinsics.wireman(getContainer(), kFunctionImplDern.getContainer()) && Intrinsics.wireman(getName(), kFunctionImplDern.getName()) && Intrinsics.wireman(this.signature, kFunctionImplDern.signature) && Intrinsics.wireman(this.rawBoundReceiver, kFunctionImplDern.rawBoundReceiver);
    }

    @Override // p002kotlin.jvm.internal.formularize
    public int getArity() {
        return marial.attabal(dovishness());
    }

    @Override // kurbash.dern
    public String getName() {
        String strDern = trm().getName().dern();
        Intrinsics.checkNotNullExpressionValue(strDern, "asString(...)");
        return strDern;
    }

    @Override // p002kotlin.reflect.jvm.internal.KCallableImpl
    /* JADX INFO: renamed from: gintrap, reason: from getter */
    public KDeclarationContainerImpl getContainer() {
        return this.container;
    }

    @Override // p002kotlin.reflect.jvm.internal.KCallableImpl
    /* JADX INFO: renamed from: grimness, reason: merged with bridge method [inline-methods] */
    public dovishness trm() {
        T tSaneness = this.descriptor.saneness(this, f29487cuirassed[0]);
        Intrinsics.checkNotNullExpressionValue(tSaneness, "getValue(...)");
        return (dovishness) tSaneness;
    }

    public int hashCode() {
        return (((getContainer().hashCode() * 31) + getName().hashCode()) * 31) + this.signature.hashCode();
    }

    @Override // p002kotlin.jvm.functions.Function0
    public Object invoke() {
        return beachfront.attabal.attabal(this);
    }

    @Override // kurbash.impromptu
    public boolean isExternal() {
        return trm().isExternal();
    }

    @Override // kurbash.impromptu
    public boolean isInfix() {
        return trm().isInfix();
    }

    @Override // kurbash.impromptu
    public boolean isInline() {
        return trm().isInline();
    }

    @Override // kurbash.impromptu
    public boolean isOperator() {
        return trm().isOperator();
    }

    @Override // kurbash.dern
    public boolean isSuspend() {
        return trm().isSuspend();
    }

    public final wireman.impromptu merc(Method member) {
        return stratoscope() ? new wireman.impromptu.saneness(member) : new wireman.impromptu.beachfront(member);
    }

    public final wireman.impromptu polder(Method member) {
        return stratoscope() ? new wireman.impromptu.dern(member, seminary()) : new wireman.impromptu.competently(member);
    }

    public final wireman.impromptu restrictive(Method member) {
        return stratoscope() ? new wireman.impromptu.attabal(member, seminary()) : new wireman.impromptu.marial(member);
    }

    @Override // p002kotlin.reflect.jvm.internal.KCallableImpl
    public dern<?> rotuma() {
        return (dern) this.defaultCaller.getValue();
    }

    @Override // p002kotlin.reflect.jvm.internal.KCallableImpl
    public boolean stratoscope() {
        return !Intrinsics.wireman(this.rawBoundReceiver, CallableReference.NO_RECEIVER);
    }

    public final wireman<Constructor<?>> supplicat(Constructor<?> member, dovishness descriptor, boolean isDefault) {
        if (isDefault || !saneness.beachfront(descriptor)) {
            return stratoscope() ? new wireman.dern(member, seminary()) : new wireman.marial(member);
        }
        return stratoscope() ? new wireman.attabal(member, seminary()) : new wireman.saneness(member);
    }

    public String toString() {
        return ReflectionObjectRenderer.f29548attabal.wireman(trm());
    }

    @Override // p002kotlin.jvm.functions.Function1
    public Object invoke(Object obj) {
        return beachfront.attabal.saneness(this, obj);
    }

    public KFunctionImpl(KDeclarationContainerImpl kDeclarationContainerImpl, final String str, String str2, dovishness dovishnessVar, Object obj) {
        this.container = kDeclarationContainerImpl;
        this.signature = str2;
        this.rawBoundReceiver = obj;
        this.descriptor = triweekly.saneness(dovishnessVar, new Function0<dovishness>() { // from class: kotlin.reflect.jvm.internal.KFunctionImpl$descriptor$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // p002kotlin.jvm.functions.Function0
            public final dovishness invoke() {
                return this.this$0.getContainer().polloi(str, this.this$0.signature);
            }
        });
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        this.caller = p002kotlin.saneness.attabal(lazyThreadSafetyMode, new Function0<dern<? extends Executable>>() { // from class: kotlin.reflect.jvm.internal.KFunctionImpl$caller$2
            {
                super(0);
            }

            @Override // p002kotlin.jvm.functions.Function0
            public final dern<? extends Executable> invoke() {
                Object objSaneness;
                dern dernVarMerc;
                JvmFunctionSignature jvmFunctionSignatureCompetently = arytenoidectomy.f29551attabal.competently(this.this$0.trm());
                if (jvmFunctionSignatureCompetently instanceof JvmFunctionSignature.saneness) {
                    if (this.this$0.cuirassed()) {
                        Class<?> clsCompetently = this.this$0.getContainer().competently();
                        List<KParameter> parameters = this.this$0.getParameters();
                        ArrayList arrayList = new ArrayList(p002kotlin.collections.dovishness.gintrap(parameters, 10));
                        Iterator<T> it = parameters.iterator();
                        while (it.hasNext()) {
                            String name = ((KParameter) it.next()).getName();
                            Intrinsics.beachfront(name);
                            arrayList.add(name);
                        }
                        return new AnnotationConstructorCaller(clsCompetently, arrayList, AnnotationConstructorCaller.CallMode.POSITIONAL_CALL, AnnotationConstructorCaller.Origin.KOTLIN, null, 16, null);
                    }
                    objSaneness = this.this$0.getContainer().kowloon(((JvmFunctionSignature.saneness) jvmFunctionSignatureCompetently).saneness());
                } else if (jvmFunctionSignatureCompetently instanceof JvmFunctionSignature.dern) {
                    dovishness dovishnessVarTrm = this.this$0.trm();
                    apical apicalVarSaneness = dovishnessVarTrm.saneness();
                    Intrinsics.checkNotNullExpressionValue(apicalVarSaneness, "getContainingDeclaration(...)");
                    if (beachfront.wireman(apicalVarSaneness) && (dovishnessVarTrm instanceof cutely) && ((cutely) dovishnessVarTrm).clubfoot()) {
                        dovishness dovishnessVarTrm2 = this.this$0.trm();
                        KDeclarationContainerImpl container = this.this$0.getContainer();
                        String strSaneness = ((JvmFunctionSignature.dern) jvmFunctionSignatureCompetently).saneness();
                        List<cultivated> listBeachfront = this.this$0.trm().beachfront();
                        Intrinsics.checkNotNullExpressionValue(listBeachfront, "getValueParameters(...)");
                        return new ValueClassAwareCaller.saneness(dovishnessVarTrm2, container, strSaneness, listBeachfront);
                    }
                    JvmFunctionSignature.dern dernVar = (JvmFunctionSignature.dern) jvmFunctionSignatureCompetently;
                    objSaneness = this.this$0.getContainer().molybdenite(dernVar.dern(), dernVar.saneness());
                } else if (jvmFunctionSignatureCompetently instanceof JvmFunctionSignature.attabal) {
                    objSaneness = ((JvmFunctionSignature.attabal) jvmFunctionSignatureCompetently).getMethod();
                } else {
                    if (!(jvmFunctionSignatureCompetently instanceof JvmFunctionSignature.JavaConstructor)) {
                        if (!(jvmFunctionSignatureCompetently instanceof JvmFunctionSignature.FakeJavaAnnotationConstructor)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        List<Method> listSaneness = ((JvmFunctionSignature.FakeJavaAnnotationConstructor) jvmFunctionSignatureCompetently).saneness();
                        Class<?> clsCompetently2 = this.this$0.getContainer().competently();
                        List<Method> list = listSaneness;
                        ArrayList arrayList2 = new ArrayList(p002kotlin.collections.dovishness.gintrap(list, 10));
                        Iterator<T> it2 = list.iterator();
                        while (it2.hasNext()) {
                            arrayList2.add(((Method) it2.next()).getName());
                        }
                        return new AnnotationConstructorCaller(clsCompetently2, arrayList2, AnnotationConstructorCaller.CallMode.POSITIONAL_CALL, AnnotationConstructorCaller.Origin.JAVA, listSaneness);
                    }
                    objSaneness = ((JvmFunctionSignature.JavaConstructor) jvmFunctionSignatureCompetently).saneness();
                }
                if (objSaneness instanceof Constructor) {
                    KFunctionImpl kFunctionImpl = this.this$0;
                    dernVarMerc = kFunctionImpl.supplicat((Constructor) objSaneness, kFunctionImpl.trm(), false);
                } else {
                    if (!(objSaneness instanceof Method)) {
                        throw new KotlinReflectionInternalError("Could not compute caller for function: " + this.this$0.trm() + " (member = " + objSaneness + ')');
                    }
                    Method method = (Method) objSaneness;
                    if (Modifier.isStatic(method.getModifiers())) {
                        dernVarMerc = this.this$0.trm().getAnnotations().attabal(molybdenite.cutely()) != null ? this.this$0.merc(method) : this.this$0.polder(method);
                    } else {
                        dernVarMerc = this.this$0.restrictive(method);
                    }
                }
                return p002kotlin.reflect.jvm.internal.calls.impromptu.taiyuan(dernVarMerc, this.this$0.trm(), false, 2, null);
            }
        });
        this.defaultCaller = p002kotlin.saneness.attabal(lazyThreadSafetyMode, new Function0<dern<? extends Executable>>() { // from class: kotlin.reflect.jvm.internal.KFunctionImpl$defaultCaller$2
            {
                super(0);
            }

            /* JADX WARN: Code duplicated, block: B:44:0x0170  */
            @Override // p002kotlin.jvm.functions.Function0
            public final dern<? extends Executable> invoke() {
                GenericDeclaration genericDeclarationArytenoidectomy;
                dern dernVarPolder;
                JvmFunctionSignature jvmFunctionSignatureCompetently = arytenoidectomy.f29551attabal.competently(this.this$0.trm());
                if (jvmFunctionSignatureCompetently instanceof JvmFunctionSignature.dern) {
                    dovishness dovishnessVarTrm = this.this$0.trm();
                    apical apicalVarSaneness = dovishnessVarTrm.saneness();
                    Intrinsics.checkNotNullExpressionValue(apicalVarSaneness, "getContainingDeclaration(...)");
                    if (beachfront.wireman(apicalVarSaneness) && (dovishnessVarTrm instanceof cutely) && ((cutely) dovishnessVarTrm).clubfoot()) {
                        throw new KotlinReflectionInternalError(this.this$0.trm().saneness() + " cannot have default arguments");
                    }
                    KDeclarationContainerImpl container = this.this$0.getContainer();
                    JvmFunctionSignature.dern dernVar = (JvmFunctionSignature.dern) jvmFunctionSignatureCompetently;
                    String strDern = dernVar.dern();
                    String strSaneness = dernVar.saneness();
                    Member memberSaneness = this.this$0.dovishness().saneness();
                    Intrinsics.beachfront(memberSaneness);
                    genericDeclarationArytenoidectomy = container.monoploid(strDern, strSaneness, !Modifier.isStatic(memberSaneness.getModifiers()));
                } else if (jvmFunctionSignatureCompetently instanceof JvmFunctionSignature.saneness) {
                    if (this.this$0.cuirassed()) {
                        Class<?> clsCompetently = this.this$0.getContainer().competently();
                        List<KParameter> parameters = this.this$0.getParameters();
                        ArrayList arrayList = new ArrayList(p002kotlin.collections.dovishness.gintrap(parameters, 10));
                        Iterator<T> it = parameters.iterator();
                        while (it.hasNext()) {
                            String name = ((KParameter) it.next()).getName();
                            Intrinsics.beachfront(name);
                            arrayList.add(name);
                        }
                        return new AnnotationConstructorCaller(clsCompetently, arrayList, AnnotationConstructorCaller.CallMode.CALL_BY_NAME, AnnotationConstructorCaller.Origin.KOTLIN, null, 16, null);
                    }
                    genericDeclarationArytenoidectomy = this.this$0.getContainer().arytenoidectomy(((JvmFunctionSignature.saneness) jvmFunctionSignatureCompetently).saneness());
                } else {
                    if (jvmFunctionSignatureCompetently instanceof JvmFunctionSignature.FakeJavaAnnotationConstructor) {
                        List<Method> listSaneness = ((JvmFunctionSignature.FakeJavaAnnotationConstructor) jvmFunctionSignatureCompetently).saneness();
                        Class<?> clsCompetently2 = this.this$0.getContainer().competently();
                        List<Method> list = listSaneness;
                        ArrayList arrayList2 = new ArrayList(p002kotlin.collections.dovishness.gintrap(list, 10));
                        Iterator<T> it2 = list.iterator();
                        while (it2.hasNext()) {
                            arrayList2.add(((Method) it2.next()).getName());
                        }
                        return new AnnotationConstructorCaller(clsCompetently2, arrayList2, AnnotationConstructorCaller.CallMode.CALL_BY_NAME, AnnotationConstructorCaller.Origin.JAVA, listSaneness);
                    }
                    genericDeclarationArytenoidectomy = null;
                }
                if (genericDeclarationArytenoidectomy instanceof Constructor) {
                    KFunctionImpl kFunctionImpl = this.this$0;
                    dernVarPolder = kFunctionImpl.supplicat((Constructor) genericDeclarationArytenoidectomy, kFunctionImpl.trm(), true);
                } else if (!(genericDeclarationArytenoidectomy instanceof Method)) {
                    dernVarPolder = null;
                } else if (this.this$0.trm().getAnnotations().attabal(molybdenite.cutely()) != null) {
                    apical apicalVarSaneness2 = this.this$0.trm().saneness();
                    Intrinsics.competently(apicalVarSaneness2, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
                    if (((p002kotlin.reflect.jvm.internal.impl.descriptors.wireman) apicalVarSaneness2).overspeculate()) {
                        dernVarPolder = this.this$0.polder((Method) genericDeclarationArytenoidectomy);
                    } else {
                        dernVarPolder = this.this$0.merc((Method) genericDeclarationArytenoidectomy);
                    }
                } else {
                    dernVarPolder = this.this$0.polder((Method) genericDeclarationArytenoidectomy);
                }
                if (dernVarPolder != null) {
                    return p002kotlin.reflect.jvm.internal.calls.impromptu.impromptu(dernVarPolder, this.this$0.trm(), true);
                }
                return null;
            }
        });
    }

    @Override // p002kotlin.jvm.functions.Function2
    public Object invoke(Object obj, Object obj2) {
        return beachfront.attabal.dern(this, obj, obj2);
    }

    @Override // tetrahedral.triweekly
    public Object invoke(Object obj, Object obj2, Object obj3) {
        return beachfront.attabal.wireman(this, obj, obj2, obj3);
    }

    @Override // tetrahedral.monoploid
    public Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        return beachfront.attabal.marial(this, obj, obj2, obj3, obj4, obj5, obj6);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public KFunctionImpl(KDeclarationContainerImpl container, String name, String signature, Object obj) {
        this(container, name, signature, null, obj);
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(signature, "signature");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public KFunctionImpl(KDeclarationContainerImpl container, dovishness descriptor) {
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        String strDern = descriptor.getName().dern();
        Intrinsics.checkNotNullExpressionValue(strDern, "asString(...)");
        this(container, strDern, arytenoidectomy.f29551attabal.competently(descriptor).get_signature(), descriptor, null, 16, null);
    }
}
