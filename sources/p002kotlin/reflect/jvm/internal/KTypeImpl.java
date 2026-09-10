package p002kotlin.reflect.jvm.internal;

import com.ironsource.C3414a2;
import emmesh.saneness;
import gibeonite.attabal;
import java.lang.reflect.Type;
import java.util.List;
import kurbash.beachfront;
import kurbash.formularize;
import p002kotlin.Metadata;
import p002kotlin.NotImplementedError;
import p002kotlin.collections.CollectionsKt;
import p002kotlin.jvm.functions.Function0;
import p002kotlin.jvm.internal.DefaultConstructorMarker;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.jvm.internal.PropertyReference1Impl;
import p002kotlin.jvm.internal.kowloon;
import p002kotlin.jvm.internal.polloi;
import p002kotlin.reflect.KTypeProjection;
import p002kotlin.reflect.jvm.internal.impl.descriptors.clubfoot;
import p002kotlin.reflect.jvm.internal.impl.descriptors.overspeculate;
import p002kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectClassUtilKt;
import p002kotlin.reflect.jvm.internal.impl.descriptors.wireman;
import p002kotlin.reflect.jvm.internal.impl.types.nosophobia;
import p002kotlin.reflect.jvm.internal.impl.types.oilcan;
import p002kotlin.reflect.jvm.internal.impl.types.timberyard;

/* JADX INFO: compiled from: KTypeImpl.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\f\b\u0000\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0096\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001c\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u001d\u0010!\u001a\u0004\u0018\u00010\u00148VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u001e\u0010\u001d\u001a\u0004\b\u001f\u0010 R!\u0010'\u001a\b\u0012\u0004\u0012\u00020#0\"8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b$\u0010\u001d\u001a\u0004\b%\u0010&R\u0016\u0010*\u001a\u0004\u0018\u00010\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b(\u0010)R\u0014\u0010-\u001a\u00020\u000b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b+\u0010,¨\u0006/²\u0006\u0012\u0010.\u001a\b\u0012\u0004\u0012\u00020\u00050\"8\nX\u008a\u0084\u0002"}, d2 = {"Lkotlin/reflect/jvm/internal/KTypeImpl;", "Lkotlin/jvm/internal/kowloon;", "Lkotlin/reflect/jvm/internal/impl/types/oilcan;", "type", "Lkotlin/Function0;", "Ljava/lang/reflect/Type;", "computeJavaType", "<init>", "(Lorg/jetbrains/kotlin/types/KotlinType;Lkotlin/jvm/functions/Function0;)V", "", C3414a2.d, "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lkurbash/beachfront;", "cutely", "(Lkotlin/reflect/jvm/internal/impl/types/oilcan;)Lkurbash/beachfront;", "kowloon", "Lkotlin/reflect/jvm/internal/impl/types/oilcan;", "getType", "()Lorg/jetbrains/kotlin/types/KotlinType;", "Lkotlin/reflect/jvm/internal/triweekly$attabal;", "arytenoidectomy", "Lkotlin/reflect/jvm/internal/triweekly$attabal;", "monoploid", "dern", "()Lkurbash/beachfront;", "classifier", "", "Lkotlin/reflect/KTypeProjection;", "polloi", "wireman", "()Ljava/util/List;", "arguments", "marial", "()Ljava/lang/reflect/Type;", "javaType", "attabal", "()Z", "isMarkedNullable", "parameterizedTypeArguments", "kotlin-reflection"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class KTypeImpl implements kowloon {

    /* JADX INFO: renamed from: molybdenite, reason: collision with root package name */
    public static final /* synthetic */ formularize<Object>[] f29537molybdenite = {polloi.cutely(new PropertyReference1Impl(polloi.saneness(KTypeImpl.class), "classifier", "getClassifier()Lkotlin/reflect/KClassifier;")), polloi.cutely(new PropertyReference1Impl(polloi.saneness(KTypeImpl.class), "arguments", "getArguments()Ljava/util/List;"))};

    /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name and from kotlin metadata */
    public final triweekly.attabal<Type> computeJavaType;

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name and from kotlin metadata */
    public final oilcan type;

    /* JADX INFO: renamed from: monoploid, reason: collision with root package name and from kotlin metadata */
    public final triweekly.attabal classifier;

    /* JADX INFO: renamed from: polloi, reason: collision with root package name and from kotlin metadata */
    public final triweekly.attabal arguments;

    public KTypeImpl(oilcan type, Function0<? extends Type> function0) {
        Intrinsics.checkNotNullParameter(type, "type");
        this.type = type;
        triweekly.attabal<Type> attabalVarDern = null;
        triweekly.attabal<Type> attabalVar = function0 instanceof triweekly.attabal ? (triweekly.attabal) function0 : null;
        if (attabalVar != null) {
            attabalVarDern = attabalVar;
        } else if (function0 != null) {
            attabalVarDern = triweekly.dern(function0);
        }
        this.computeJavaType = attabalVarDern;
        this.classifier = triweekly.dern(new Function0<beachfront>() { // from class: kotlin.reflect.jvm.internal.KTypeImpl$classifier$2
            {
                super(0);
            }

            @Override // p002kotlin.jvm.functions.Function0
            public final beachfront invoke() {
                KTypeImpl kTypeImpl = this.this$0;
                return kTypeImpl.cutely(kTypeImpl.getType());
            }
        });
        this.arguments = triweekly.dern(new KTypeImpl$arguments$2(this, function0));
    }

    /* JADX INFO: renamed from: apical, reason: from getter */
    public final oilcan getType() {
        return this.type;
    }

    @Override // kurbash.arytenoidectomy
    public boolean attabal() {
        return this.type.mastfed();
    }

    public final beachfront cutely(oilcan type) {
        oilcan type2;
        p002kotlin.reflect.jvm.internal.impl.descriptors.beachfront beachfrontVarWireman = type.setterwort().wireman();
        if (!(beachfrontVarWireman instanceof wireman)) {
            if (beachfrontVarWireman instanceof clubfoot) {
                return new KTypeParameterImpl(null, (clubfoot) beachfrontVarWireman);
            }
            if (!(beachfrontVarWireman instanceof overspeculate)) {
                return null;
            }
            throw new NotImplementedError("An operation is not implemented: Type alias classifiers are not yet supported");
        }
        Class<?> clsMonoploid = molybdenite.monoploid((wireman) beachfrontVarWireman);
        if (clsMonoploid == null) {
            return null;
        }
        if (!clsMonoploid.isArray()) {
            if (nosophobia.formularize(type)) {
                return new KClassImpl(clsMonoploid);
            }
            Class<?> clsMarial = ReflectClassUtilKt.marial(clsMonoploid);
            if (clsMarial != null) {
                clsMonoploid = clsMarial;
            }
            return new KClassImpl(clsMonoploid);
        }
        timberyard timberyardVar = (timberyard) CollectionsKt.outmarry(type.dhss());
        if (timberyardVar == null || (type2 = timberyardVar.getType()) == null) {
            return new KClassImpl(clsMonoploid);
        }
        beachfront beachfrontVarCutely = cutely(type2);
        if (beachfrontVarCutely != null) {
            return new KClassImpl(molybdenite.beachfront(attabal.saneness(saneness.attabal(beachfrontVarCutely))));
        }
        throw new KotlinReflectionInternalError("Cannot determine classifier for array element type: " + this);
    }

    @Override // kurbash.arytenoidectomy
    /* JADX INFO: renamed from: dern */
    public beachfront getClassifier() {
        return (beachfront) this.classifier.saneness(this, f29537molybdenite[0]);
    }

    public boolean equals(Object other) {
        if (!(other instanceof KTypeImpl)) {
            return false;
        }
        KTypeImpl kTypeImpl = (KTypeImpl) other;
        return Intrinsics.wireman(this.type, kTypeImpl.type) && Intrinsics.wireman(getClassifier(), kTypeImpl.getClassifier()) && Intrinsics.wireman(wireman(), kTypeImpl.wireman());
    }

    public int hashCode() {
        int iHashCode = this.type.hashCode() * 31;
        beachfront classifier = getClassifier();
        return ((iHashCode + (classifier != null ? classifier.hashCode() : 0)) * 31) + wireman().hashCode();
    }

    @Override // p002kotlin.jvm.internal.kowloon
    public Type marial() {
        triweekly.attabal<Type> attabalVar = this.computeJavaType;
        if (attabalVar != null) {
            return attabalVar.invoke();
        }
        return null;
    }

    public String toString() {
        return ReflectionObjectRenderer.f29548attabal.impromptu(this.type);
    }

    @Override // kurbash.arytenoidectomy
    public List<KTypeProjection> wireman() {
        T tSaneness = this.arguments.saneness(this, f29537molybdenite[1]);
        Intrinsics.checkNotNullExpressionValue(tSaneness, "getValue(...)");
        return (List) tSaneness;
    }

    public /* synthetic */ KTypeImpl(oilcan oilcanVar, Function0 function0, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(oilcanVar, (i & 2) != 0 ? null : function0);
    }
}
