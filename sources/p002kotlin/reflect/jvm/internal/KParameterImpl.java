package p002kotlin.reflect.jvm.internal;

import byname.marial;
import com.ironsource.C3414a2;
import com.ironsource.X3;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.List;
import kurbash.arytenoidectomy;
import kurbash.formularize;
import p002kotlin.Metadata;
import p002kotlin.collections.CollectionsKt;
import p002kotlin.jvm.KotlinReflectionNotSupportedError;
import p002kotlin.jvm.functions.Function0;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.jvm.internal.PropertyReference1Impl;
import p002kotlin.jvm.internal.polloi;
import p002kotlin.reflect.KParameter;
import p002kotlin.reflect.jvm.internal.calls.ValueClassAwareCaller;
import p002kotlin.reflect.jvm.internal.calls.dern;
import p002kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import p002kotlin.reflect.jvm.internal.impl.descriptors.apical;
import p002kotlin.reflect.jvm.internal.impl.descriptors.cultivated;
import p002kotlin.reflect.jvm.internal.impl.descriptors.polder;
import p002kotlin.reflect.jvm.internal.impl.descriptors.starveling;
import p002kotlin.reflect.jvm.internal.impl.descriptors.wireman;
import p002kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import p002kotlin.reflect.jvm.internal.impl.types.oilcan;

/* JADX INFO: compiled from: KParameterImpl.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010 \n\u0002\u0010\u001b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u00002\u00020\u0001:\u0001=B1\u0012\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0096\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J#\u0010\u001a\u001a\u00020\u00182\u0012\u0010\u0019\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00180\u0017\"\u00020\u0018H\u0002¢\u0006\u0004\b\u001a\u0010\u001bR\u001b\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010\u0013R\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u001b\u0010+\u001a\u00020\t8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R!\u00101\u001a\b\u0012\u0004\u0012\u00020-0,8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b.\u0010(\u001a\u0004\b/\u00100R\u0016\u00103\u001a\u0004\u0018\u00010\u00148VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b2\u0010\u0016R\u0014\u00107\u001a\u0002048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b5\u00106R\u0014\u0010:\u001a\u00020\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b8\u00109R\u0014\u0010<\u001a\u00020\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b;\u00109¨\u0006>"}, d2 = {"Lkotlin/reflect/jvm/internal/KParameterImpl;", "Lkotlin/reflect/KParameter;", "Lkotlin/reflect/jvm/internal/KCallableImpl;", "callable", "", "index", "Lkotlin/reflect/KParameter$Kind;", "kind", "Lkotlin/Function0;", "Lkotlin/reflect/jvm/internal/impl/descriptors/polder;", "computeDescriptor", "<init>", "(Lkotlin/reflect/jvm/internal/KCallableImpl;ILkotlin/reflect/KParameter$Kind;Lkotlin/jvm/functions/Function0;)V", "", C3414a2.d, "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "", "Ljava/lang/reflect/Type;", "types", "apical", "([Ljava/lang/reflect/Type;)Ljava/lang/reflect/Type;", "kowloon", "Lkotlin/reflect/jvm/internal/KCallableImpl;", "impassible", "()Lkotlin/reflect/jvm/internal/KCallableImpl;", "arytenoidectomy", "I", "getIndex", "monoploid", "Lkotlin/reflect/KParameter$Kind;", "getKind", "()Lkotlin/reflect/KParameter$Kind;", "polloi", "Lkotlin/reflect/jvm/internal/triweekly$attabal;", "getDescriptor", "()Lorg/jetbrains/kotlin/descriptors/ParameterDescriptor;", "descriptor", "", "", "molybdenite", "getAnnotations", "()Ljava/util/List;", "annotations", "getName", "name", "Lkurbash/arytenoidectomy;", "getType", "()Lkurbash/arytenoidectomy;", "type", "formularize", "()Z", "isOptional", "saneness", "isVararg", "attabal", "kotlin-reflection"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class KParameterImpl implements KParameter {

    /* JADX INFO: renamed from: graveside, reason: collision with root package name */
    public static final /* synthetic */ formularize<Object>[] f29507graveside = {polloi.cutely(new PropertyReference1Impl(polloi.saneness(KParameterImpl.class), "descriptor", "getDescriptor()Lorg/jetbrains/kotlin/descriptors/ParameterDescriptor;")), polloi.cutely(new PropertyReference1Impl(polloi.saneness(KParameterImpl.class), "annotations", "getAnnotations()Ljava/util/List;"))};

    /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name and from kotlin metadata */
    public final int index;

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name and from kotlin metadata */
    public final KCallableImpl<?> callable;

    /* JADX INFO: renamed from: molybdenite, reason: collision with root package name and from kotlin metadata */
    public final triweekly.attabal annotations;

    /* JADX INFO: renamed from: monoploid, reason: collision with root package name and from kotlin metadata */
    public final KParameter.Kind kind;

    /* JADX INFO: renamed from: polloi, reason: collision with root package name and from kotlin metadata */
    public final triweekly.attabal descriptor;

    /* JADX INFO: compiled from: KParameterImpl.kt */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\u0010\u0003\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0096\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0011\u0010\bR\u001f\u0010\u0003\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lkotlin/reflect/jvm/internal/KParameterImpl$attabal;", "Ljava/lang/reflect/Type;", "", "types", "<init>", "([Ljava/lang/reflect/Type;)V", "", "getTypeName", "()Ljava/lang/String;", "", C3414a2.d, "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "kowloon", "[Ljava/lang/reflect/Type;", "getTypes", "()[Ljava/lang/reflect/Type;", "arytenoidectomy", "I", "kotlin-reflection"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class attabal implements Type {

        /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name and from kotlin metadata */
        public final int hashCode;

        /* JADX INFO: renamed from: kowloon, reason: collision with root package name and from kotlin metadata */
        public final Type[] types;

        public attabal(Type[] types) {
            Intrinsics.checkNotNullParameter(types, "types");
            this.types = types;
            this.hashCode = Arrays.hashCode(types);
        }

        public boolean equals(Object other) {
            return (other instanceof attabal) && Arrays.equals(this.types, ((attabal) other).types);
        }

        @Override // java.lang.reflect.Type
        public String getTypeName() {
            return p002kotlin.collections.polloi.lerp(this.types, ", ", X3.j.d, X3.j.e, 0, null, null, 56, null);
        }

        /* JADX INFO: renamed from: hashCode, reason: from getter */
        public int getHashCode() {
            return this.hashCode;
        }

        public String toString() {
            return getTypeName();
        }
    }

    public KParameterImpl(KCallableImpl<?> callable, int i, KParameter.Kind kind, Function0<? extends polder> computeDescriptor) {
        Intrinsics.checkNotNullParameter(callable, "callable");
        Intrinsics.checkNotNullParameter(kind, "kind");
        Intrinsics.checkNotNullParameter(computeDescriptor, "computeDescriptor");
        this.callable = callable;
        this.index = i;
        this.kind = kind;
        this.descriptor = triweekly.dern(computeDescriptor);
        this.annotations = triweekly.dern(new Function0<List<? extends Annotation>>() { // from class: kotlin.reflect.jvm.internal.KParameterImpl$annotations$2
            {
                super(0);
            }

            @Override // p002kotlin.jvm.functions.Function0
            public final List<? extends Annotation> invoke() {
                return molybdenite.marial(this.this$0.triweekly());
            }
        });
    }

    public final Type apical(Type... types) {
        int length = types.length;
        if (length != 0) {
            return length != 1 ? new attabal(types) : (Type) p002kotlin.collections.polloi.czestochowa(types);
        }
        throw new KotlinReflectionNotSupportedError("Expected at least 1 type for compound type");
    }

    public boolean equals(Object other) {
        if (!(other instanceof KParameterImpl)) {
            return false;
        }
        KParameterImpl kParameterImpl = (KParameterImpl) other;
        return Intrinsics.wireman(this.callable, kParameterImpl.callable) && getIndex() == kParameterImpl.getIndex();
    }

    @Override // p002kotlin.reflect.KParameter
    public boolean formularize() {
        polder polderVarTriweekly = triweekly();
        cultivated cultivatedVar = polderVarTriweekly instanceof cultivated ? (cultivated) polderVarTriweekly : null;
        if (cultivatedVar != null) {
            return DescriptorUtilsKt.dern(cultivatedVar);
        }
        return false;
    }

    @Override // p002kotlin.reflect.KParameter
    public int getIndex() {
        return this.index;
    }

    @Override // p002kotlin.reflect.KParameter
    public KParameter.Kind getKind() {
        return this.kind;
    }

    @Override // p002kotlin.reflect.KParameter
    public String getName() {
        polder polderVarTriweekly = triweekly();
        cultivated cultivatedVar = polderVarTriweekly instanceof cultivated ? (cultivated) polderVarTriweekly : null;
        if (cultivatedVar == null || cultivatedVar.saneness().premeiotic()) {
            return null;
        }
        marial name = cultivatedVar.getName();
        Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
        if (name.apical()) {
            return null;
        }
        return name.dern();
    }

    @Override // p002kotlin.reflect.KParameter
    public arytenoidectomy getType() {
        oilcan type = triweekly().getType();
        Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
        return new KTypeImpl(type, new Function0<Type>() { // from class: kotlin.reflect.jvm.internal.KParameterImpl$type$1
            {
                super(0);
            }

            @Override // p002kotlin.jvm.functions.Function0
            public final Type invoke() {
                polder polderVarTriweekly = this.this$0.triweekly();
                if ((polderVarTriweekly instanceof starveling) && Intrinsics.wireman(molybdenite.taiyuan(this.this$0.impassible().trm()), polderVarTriweekly) && this.this$0.impassible().trm().getKind() == CallableMemberDescriptor.Kind.FAKE_OVERRIDE) {
                    apical apicalVarSaneness = this.this$0.impassible().trm().saneness();
                    Intrinsics.competently(apicalVarSaneness, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
                    Class<?> clsMonoploid = molybdenite.monoploid((wireman) apicalVarSaneness);
                    if (clsMonoploid != null) {
                        return clsMonoploid;
                    }
                    throw new KotlinReflectionInternalError("Cannot determine receiver Java type of inherited declaration: " + polderVarTriweekly);
                }
                dern<?> dernVarDovishness = this.this$0.impassible().dovishness();
                if (dernVarDovishness instanceof ValueClassAwareCaller) {
                    List listDhss = CollectionsKt.dhss(dernVarDovishness.attabal(), ((ValueClassAwareCaller) dernVarDovishness).wireman(this.this$0.getIndex()));
                    KParameterImpl kParameterImpl = this.this$0;
                    Type[] typeArr = (Type[]) listDhss.toArray(new Type[0]);
                    return kParameterImpl.apical((Type[]) Arrays.copyOf(typeArr, typeArr.length));
                }
                if (!(dernVarDovishness instanceof ValueClassAwareCaller.saneness)) {
                    return dernVarDovishness.attabal().get(this.this$0.getIndex());
                }
                KParameterImpl kParameterImpl2 = this.this$0;
                Class[] clsArr = (Class[]) ((ValueClassAwareCaller.saneness) dernVarDovishness).wireman().get(this.this$0.getIndex()).toArray(new Class[0]);
                return kParameterImpl2.apical((Type[]) Arrays.copyOf(clsArr, clsArr.length));
            }
        });
    }

    public int hashCode() {
        return (this.callable.hashCode() * 31) + Integer.hashCode(getIndex());
    }

    public final KCallableImpl<?> impassible() {
        return this.callable;
    }

    @Override // p002kotlin.reflect.KParameter
    public boolean saneness() {
        polder polderVarTriweekly = triweekly();
        return (polderVarTriweekly instanceof cultivated) && ((cultivated) polderVarTriweekly).wostteth() != null;
    }

    public String toString() {
        return ReflectionObjectRenderer.f29548attabal.beachfront(this);
    }

    public final polder triweekly() {
        T tSaneness = this.descriptor.saneness(this, f29507graveside[0]);
        Intrinsics.checkNotNullExpressionValue(tSaneness, "getValue(...)");
        return (polder) tSaneness;
    }
}
