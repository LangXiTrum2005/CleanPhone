package p002kotlin.reflect.jvm.internal;

import com.ironsource.C3414a2;
import healthily.beachfront;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kurbash.arytenoidectomy;
import kurbash.formularize;
import kurbash.monoploid;
import p002kotlin.Metadata;
import p002kotlin.NoWhenBranchMatchedException;
import p002kotlin.Unit;
import p002kotlin.collections.dovishness;
import p002kotlin.jvm.functions.Function0;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.jvm.internal.PropertyReference1Impl;
import p002kotlin.jvm.internal.polloi;
import p002kotlin.jvm.internal.preprohormone;
import p002kotlin.reflect.KVariance;
import p002kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import p002kotlin.reflect.jvm.internal.impl.descriptors.apical;
import p002kotlin.reflect.jvm.internal.impl.descriptors.clubfoot;
import p002kotlin.reflect.jvm.internal.impl.descriptors.wireman;
import p002kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.marial;
import p002kotlin.reflect.jvm.internal.impl.types.Variance;
import p002kotlin.reflect.jvm.internal.impl.types.oilcan;

/* JADX INFO: compiled from: KTypeParameterImpl.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0019\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0096\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0016\u001a\u0006\u0012\u0002\b\u00030\u0015*\u00020\u0014H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u001a\u001a\u0006\u0012\u0002\b\u00030\u0019*\u00020\u0018H\u0002¢\u0006\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR!\u0010&\u001a\b\u0012\u0004\u0012\u00020!0 8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010*\u001a\u00020\u00118VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b)\u0010\u0013R\u0014\u0010.\u001a\u00020+8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b,\u0010-¨\u0006/"}, d2 = {"Lkotlin/reflect/jvm/internal/KTypeParameterImpl;", "Lkurbash/monoploid;", "Lkotlin/reflect/jvm/internal/impromptu;", "Lkotlin/reflect/jvm/internal/formularize;", "container", "Lkotlin/reflect/jvm/internal/impl/descriptors/clubfoot;", "descriptor", "<init>", "(Lkotlin/reflect/jvm/internal/formularize;Lorg/jetbrains/kotlin/descriptors/TypeParameterDescriptor;)V", "", C3414a2.d, "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lkotlin/reflect/jvm/internal/impl/descriptors/wireman;", "Lkotlin/reflect/jvm/internal/KClassImpl;", "dern", "(Lkotlin/reflect/jvm/internal/impl/descriptors/wireman;)Lkotlin/reflect/jvm/internal/KClassImpl;", "Lkotlin/reflect/jvm/internal/impl/serialization/deserialization/descriptors/marial;", "Ljava/lang/Class;", "attabal", "(Lkotlin/reflect/jvm/internal/impl/serialization/deserialization/descriptors/marial;)Ljava/lang/Class;", "kowloon", "Lkotlin/reflect/jvm/internal/impl/descriptors/clubfoot;", "getDescriptor", "()Lorg/jetbrains/kotlin/descriptors/TypeParameterDescriptor;", "", "Lkurbash/arytenoidectomy;", "arytenoidectomy", "Lkotlin/reflect/jvm/internal/triweekly$attabal;", "getUpperBounds", "()Ljava/util/List;", "upperBounds", "monoploid", "Lkotlin/reflect/jvm/internal/formularize;", "getName", "name", "Lkotlin/reflect/KVariance;", "cutely", "()Lkotlin/reflect/KVariance;", "variance", "kotlin-reflection"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class KTypeParameterImpl implements monoploid, impromptu {

    /* JADX INFO: renamed from: polloi, reason: collision with root package name */
    public static final /* synthetic */ formularize<Object>[] f29543polloi = {polloi.cutely(new PropertyReference1Impl(polloi.saneness(KTypeParameterImpl.class), "upperBounds", "getUpperBounds()Ljava/util/List;"))};

    /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name and from kotlin metadata */
    public final triweekly.attabal upperBounds;

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name and from kotlin metadata */
    public final clubfoot descriptor;

    /* JADX INFO: renamed from: monoploid, reason: collision with root package name and from kotlin metadata */
    public final formularize container;

    /* JADX INFO: compiled from: KTypeParameterImpl.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class attabal {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public static final /* synthetic */ int[] f29547attabal;

        static {
            int[] iArr = new int[Variance.values().length];
            try {
                iArr[Variance.INVARIANT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Variance.IN_VARIANCE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Variance.OUT_VARIANCE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f29547attabal = iArr;
        }
    }

    public KTypeParameterImpl(formularize formularizeVar, clubfoot descriptor) {
        KClassImpl<?> kClassImplDern;
        Object objDovishness;
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        this.descriptor = descriptor;
        this.upperBounds = triweekly.dern(new Function0<List<? extends KTypeImpl>>() { // from class: kotlin.reflect.jvm.internal.KTypeParameterImpl$upperBounds$2
            {
                super(0);
            }

            @Override // p002kotlin.jvm.functions.Function0
            public final List<? extends KTypeImpl> invoke() {
                List<oilcan> upperBounds = this.this$0.getDescriptor().getUpperBounds();
                Intrinsics.checkNotNullExpressionValue(upperBounds, "getUpperBounds(...)");
                List<oilcan> list = upperBounds;
                ArrayList arrayList = new ArrayList(dovishness.gintrap(list, 10));
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(new KTypeImpl((oilcan) it.next(), null, 2, null));
                }
                return arrayList;
            }
        });
        if (formularizeVar == null) {
            apical apicalVarSaneness = getDescriptor().saneness();
            Intrinsics.checkNotNullExpressionValue(apicalVarSaneness, "getContainingDeclaration(...)");
            if (apicalVarSaneness instanceof wireman) {
                objDovishness = dern((wireman) apicalVarSaneness);
            } else {
                if (!(apicalVarSaneness instanceof CallableMemberDescriptor)) {
                    throw new KotlinReflectionInternalError("Unknown type parameter container: " + apicalVarSaneness);
                }
                apical apicalVarSaneness2 = ((CallableMemberDescriptor) apicalVarSaneness).saneness();
                Intrinsics.checkNotNullExpressionValue(apicalVarSaneness2, "getContainingDeclaration(...)");
                if (apicalVarSaneness2 instanceof wireman) {
                    kClassImplDern = dern((wireman) apicalVarSaneness2);
                } else {
                    marial marialVar = apicalVarSaneness instanceof marial ? (marial) apicalVarSaneness : null;
                    if (marialVar == null) {
                        throw new KotlinReflectionInternalError("Non-class callable descriptor must be deserialized: " + apicalVarSaneness);
                    }
                    kurbash.wireman wiremanVarMarial = gibeonite.attabal.marial(attabal(marialVar));
                    Intrinsics.competently(wiremanVarMarial, "null cannot be cast to non-null type kotlin.reflect.jvm.internal.KClassImpl<*>");
                    kClassImplDern = (KClassImpl) wiremanVarMarial;
                }
                objDovishness = apicalVarSaneness.dovishness(new wireman(kClassImplDern), Unit.f29295attabal);
            }
            Intrinsics.beachfront(objDovishness);
            formularizeVar = (formularize) objDovishness;
        }
        this.container = formularizeVar;
    }

    public final Class<?> attabal(marial marialVar) {
        Class<?> clsWireman;
        p002kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.wireman wiremanVarYemenite = marialVar.yemenite();
        p002kotlin.reflect.jvm.internal.impl.load.kotlin.apical apicalVar = wiremanVarYemenite instanceof p002kotlin.reflect.jvm.internal.impl.load.kotlin.apical ? (p002kotlin.reflect.jvm.internal.impl.load.kotlin.apical) wiremanVarYemenite : null;
        p002kotlin.reflect.jvm.internal.impl.load.kotlin.monoploid monoploidVarCompetently = apicalVar != null ? apicalVar.competently() : null;
        beachfront beachfrontVar = monoploidVarCompetently instanceof beachfront ? (beachfront) monoploidVarCompetently : null;
        if (beachfrontVar != null && (clsWireman = beachfrontVar.wireman()) != null) {
            return clsWireman;
        }
        throw new KotlinReflectionInternalError("Container of deserialized member is not resolved: " + marialVar);
    }

    @Override // kurbash.monoploid
    /* JADX INFO: renamed from: cutely */
    public KVariance getVariance() {
        int i = attabal.f29547attabal[getDescriptor().cutely().ordinal()];
        if (i == 1) {
            return KVariance.INVARIANT;
        }
        if (i == 2) {
            return KVariance.IN;
        }
        if (i == 3) {
            return KVariance.OUT;
        }
        throw new NoWhenBranchMatchedException();
    }

    public final KClassImpl<?> dern(wireman wiremanVar) {
        Class<?> clsMonoploid = molybdenite.monoploid(wiremanVar);
        KClassImpl<?> kClassImpl = (KClassImpl) (clsMonoploid != null ? gibeonite.attabal.marial(clsMonoploid) : null);
        if (kClassImpl != null) {
            return kClassImpl;
        }
        throw new KotlinReflectionInternalError("Type parameter container is not resolved: " + wiremanVar.saneness());
    }

    public boolean equals(Object other) {
        if (!(other instanceof KTypeParameterImpl)) {
            return false;
        }
        KTypeParameterImpl kTypeParameterImpl = (KTypeParameterImpl) other;
        return Intrinsics.wireman(this.container, kTypeParameterImpl.container) && Intrinsics.wireman(getName(), kTypeParameterImpl.getName());
    }

    @Override // kurbash.monoploid
    public String getName() {
        String strDern = getDescriptor().getName().dern();
        Intrinsics.checkNotNullExpressionValue(strDern, "asString(...)");
        return strDern;
    }

    @Override // kurbash.monoploid
    public List<arytenoidectomy> getUpperBounds() {
        T tSaneness = this.upperBounds.saneness(this, f29543polloi[0]);
        Intrinsics.checkNotNullExpressionValue(tSaneness, "getValue(...)");
        return (List) tSaneness;
    }

    public int hashCode() {
        return (this.container.hashCode() * 31) + getName().hashCode();
    }

    @Override // p002kotlin.reflect.jvm.internal.impromptu
    /* JADX INFO: renamed from: saneness, reason: from getter */
    public clubfoot getDescriptor() {
        return this.descriptor;
    }

    public String toString() {
        return preprohormone.INSTANCE.attabal(this);
    }
}
