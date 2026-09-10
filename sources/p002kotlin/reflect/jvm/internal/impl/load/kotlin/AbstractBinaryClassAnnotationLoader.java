package p002kotlin.reflect.jvm.internal.impl.load.kotlin;

import foreshot.marial;
import foreshot.taiyuan;
import genesis.beachfront;
import genesis.competently;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.reflect.jvm.internal.impl.load.kotlin.AbstractBinaryClassAnnotationLoader.attabal;
import p002kotlin.collections.adultoid;
import p002kotlin.jvm.internal.DefaultConstructorMarker;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.reflect.jvm.internal.impl.descriptors.walach;
import p002kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Annotation;
import p002kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Class;
import p002kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Constructor;
import p002kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$EnumEntry;
import p002kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Function;
import p002kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Property;
import p002kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type;
import p002kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeParameter;
import p002kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$ValueParameter;
import p002kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf;
import p002kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite;
import p002kotlin.reflect.jvm.internal.impl.protobuf.triweekly;
import p002kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotatedCallableKind;
import p002kotlin.reflect.jvm.internal.impl.serialization.deserialization.dovishness;
import p002kotlin.text.StringsKt;

/* JADX INFO: compiled from: AbstractBinaryClassAnnotationLoader.kt */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractBinaryClassAnnotationLoader<A, S extends attabal<? extends A>> implements p002kotlin.reflect.jvm.internal.impl.serialization.deserialization.wireman<A> {

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public static final saneness f30673saneness = new saneness(null);

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final kowloon f30674attabal;

    /* JADX INFO: compiled from: AbstractBinaryClassAnnotationLoader.kt */
    public enum PropertyRelatedElement {
        PROPERTY,
        BACKING_FIELD,
        DELEGATE_FIELD;


        /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
        public static final /* synthetic */ pussyfooter.attabal f30675arytenoidectomy = p002kotlin.enums.attabal.attabal(attabal());
    }

    /* JADX INFO: compiled from: AbstractBinaryClassAnnotationLoader.kt */
    public static abstract class attabal<A> {
        public abstract Map<graveside, List<A>> attabal();
    }

    /* JADX INFO: compiled from: AbstractBinaryClassAnnotationLoader.kt */
    public /* synthetic */ class dern {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public static final /* synthetic */ int[] f30677attabal;

        static {
            int[] iArr = new int[AnnotatedCallableKind.values().length];
            try {
                iArr[AnnotatedCallableKind.PROPERTY_GETTER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AnnotatedCallableKind.PROPERTY_SETTER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AnnotatedCallableKind.PROPERTY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f30677attabal = iArr;
        }
    }

    /* JADX INFO: compiled from: AbstractBinaryClassAnnotationLoader.kt */
    public static final class saneness {
        public /* synthetic */ saneness(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final monoploid attabal(dovishness container, boolean z, boolean z2, Boolean bool, boolean z3, kowloon kotlinClassFinder, marial jvmMetadataVersion) {
            dovishness.attabal attabalVarImpromptu;
            Intrinsics.checkNotNullParameter(container, "container");
            Intrinsics.checkNotNullParameter(kotlinClassFinder, "kotlinClassFinder");
            Intrinsics.checkNotNullParameter(jvmMetadataVersion, "jvmMetadataVersion");
            if (z) {
                if (bool == null) {
                    throw new IllegalStateException(("isConst should not be null for property (container=" + container + ')').toString());
                }
                if (container instanceof dovishness.attabal) {
                    dovishness.attabal attabalVar = (dovishness.attabal) container;
                    if (attabalVar.competently() == ProtoBuf$Class.Kind.INTERFACE) {
                        byname.saneness sanenessVarWireman = attabalVar.marial().wireman(byname.marial.cutely("DefaultImpls"));
                        Intrinsics.checkNotNullExpressionValue(sanenessVarWireman, "createNestedClassId(...)");
                        return arytenoidectomy.attabal(kotlinClassFinder, sanenessVarWireman, jvmMetadataVersion);
                    }
                }
                if (bool.booleanValue() && (container instanceof dovishness.saneness)) {
                    walach walachVarDern = container.dern();
                    apical apicalVar = walachVarDern instanceof apical ? (apical) walachVarDern : null;
                    iaido.wireman wiremanVarBeachfront = apicalVar != null ? apicalVar.beachfront() : null;
                    if (wiremanVarBeachfront != null) {
                        String strBeachfront = wiremanVarBeachfront.beachfront();
                        Intrinsics.checkNotNullExpressionValue(strBeachfront, "getInternalName(...)");
                        byname.saneness sanenessVarImpassible = byname.saneness.impassible(new byname.dern(p002kotlin.text.dovishness.merc(strBeachfront, '/', '.', false, 4, null)));
                        Intrinsics.checkNotNullExpressionValue(sanenessVarImpassible, "topLevel(...)");
                        return arytenoidectomy.attabal(kotlinClassFinder, sanenessVarImpassible, jvmMetadataVersion);
                    }
                }
            }
            if (z2 && (container instanceof dovishness.attabal)) {
                dovishness.attabal attabalVar2 = (dovishness.attabal) container;
                if (attabalVar2.competently() == ProtoBuf$Class.Kind.COMPANION_OBJECT && (attabalVarImpromptu = attabalVar2.impromptu()) != null && (attabalVarImpromptu.competently() == ProtoBuf$Class.Kind.CLASS || attabalVarImpromptu.competently() == ProtoBuf$Class.Kind.ENUM_CLASS || (z3 && (attabalVarImpromptu.competently() == ProtoBuf$Class.Kind.INTERFACE || attabalVarImpromptu.competently() == ProtoBuf$Class.Kind.ANNOTATION_CLASS)))) {
                    walach walachVarDern2 = attabalVarImpromptu.dern();
                    molybdenite molybdeniteVar = walachVarDern2 instanceof molybdenite ? (molybdenite) walachVarDern2 : null;
                    if (molybdeniteVar != null) {
                        return molybdeniteVar.wireman();
                    }
                    return null;
                }
            }
            if (!(container instanceof dovishness.saneness) || !(container.dern() instanceof apical)) {
                return null;
            }
            walach walachVarDern3 = container.dern();
            Intrinsics.competently(walachVarDern3, "null cannot be cast to non-null type org.jetbrains.kotlin.load.kotlin.JvmPackagePartSource");
            apical apicalVar2 = (apical) walachVarDern3;
            monoploid monoploidVarCompetently = apicalVar2.competently();
            return monoploidVarCompetently == null ? arytenoidectomy.attabal(kotlinClassFinder, apicalVar2.wireman(), jvmMetadataVersion) : monoploidVarCompetently;
        }

        public saneness() {
        }
    }

    public AbstractBinaryClassAnnotationLoader(kowloon kotlinClassFinder) {
        Intrinsics.checkNotNullParameter(kotlinClassFinder, "kotlinClassFinder");
        this.f30674attabal = kotlinClassFinder;
    }

    public static /* synthetic */ graveside molybdenite(AbstractBinaryClassAnnotationLoader abstractBinaryClassAnnotationLoader, triweekly triweeklyVar, genesis.dern dernVar, competently competentlyVar, AnnotatedCallableKind annotatedCallableKind, boolean z, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getCallableSignature");
        }
        if ((i & 16) != 0) {
            z = false;
        }
        return abstractBinaryClassAnnotationLoader.polloi(triweeklyVar, dernVar, competentlyVar, annotatedCallableKind, z);
    }

    public static /* synthetic */ List triweekly(AbstractBinaryClassAnnotationLoader abstractBinaryClassAnnotationLoader, dovishness dovishnessVar, graveside gravesideVar, boolean z, boolean z2, Boolean bool, boolean z3, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: findClassAndLoadMemberAnnotations");
        }
        if ((i & 4) != 0) {
            z = false;
        }
        if ((i & 8) != 0) {
            z2 = false;
        }
        if ((i & 16) != 0) {
            bool = null;
        }
        if ((i & 32) != 0) {
            z3 = false;
        }
        return abstractBinaryClassAnnotationLoader.impassible(dovishnessVar, gravesideVar, z, z2, bool, z3);
    }

    public final kowloon adultoid() {
        return this.f30674attabal;
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.serialization.deserialization.wireman
    public List<A> apical(ProtoBuf$Type proto, genesis.dern nameResolver) {
        Intrinsics.checkNotNullParameter(proto, "proto");
        Intrinsics.checkNotNullParameter(nameResolver, "nameResolver");
        Object extension = proto.getExtension(JvmProtoBuf.f31026beachfront);
        Intrinsics.checkNotNullExpressionValue(extension, "getExtension(...)");
        Iterable<ProtoBuf$Annotation> iterable = (Iterable) extension;
        ArrayList arrayList = new ArrayList(p002kotlin.collections.dovishness.gintrap(iterable, 10));
        for (ProtoBuf$Annotation protoBuf$Annotation : iterable) {
            Intrinsics.beachfront(protoBuf$Annotation);
            arrayList.add(gintrap(protoBuf$Annotation, nameResolver));
        }
        return arrayList;
    }

    public abstract S arytenoidectomy(monoploid monoploidVar);

    @Override // p002kotlin.reflect.jvm.internal.impl.serialization.deserialization.wireman
    public List<A> attabal(dovishness container, triweekly callableProto, AnnotatedCallableKind kind, int i, ProtoBuf$ValueParameter proto) {
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(callableProto, "callableProto");
        Intrinsics.checkNotNullParameter(kind, "kind");
        Intrinsics.checkNotNullParameter(proto, "proto");
        graveside gravesideVarMolybdenite = molybdenite(this, callableProto, container.saneness(), container.wireman(), kind, false, 16, null);
        if (gravesideVarMolybdenite == null) {
            return adultoid.formularize();
        }
        return triweekly(this, container, graveside.f30756saneness.marial(gravesideVarMolybdenite, i + formularize(container, callableProto)), false, false, null, false, 60, null);
    }

    public final List<A> cord(dovishness dovishnessVar, ProtoBuf$Property protoBuf$Property, PropertyRelatedElement propertyRelatedElement) {
        Boolean boolWireman = genesis.saneness.f26707stratoscope.wireman(protoBuf$Property.getFlags());
        Intrinsics.checkNotNullExpressionValue(boolWireman, "get(...)");
        boolWireman.booleanValue();
        boolean zBeachfront = taiyuan.beachfront(protoBuf$Property);
        if (propertyRelatedElement == PropertyRelatedElement.PROPERTY) {
            graveside gravesideVarSaneness = p002kotlin.reflect.jvm.internal.impl.load.kotlin.attabal.saneness(protoBuf$Property, dovishnessVar.saneness(), dovishnessVar.wireman(), false, true, false, 40, null);
            return gravesideVarSaneness == null ? adultoid.formularize() : triweekly(this, dovishnessVar, gravesideVarSaneness, true, false, boolWireman, zBeachfront, 8, null);
        }
        graveside gravesideVarSaneness2 = p002kotlin.reflect.jvm.internal.impl.load.kotlin.attabal.saneness(protoBuf$Property, dovishnessVar.saneness(), dovishnessVar.wireman(), true, false, false, 48, null);
        if (gravesideVarSaneness2 == null) {
            return adultoid.formularize();
        }
        return StringsKt.overspeculate(gravesideVarSaneness2.attabal(), "$delegate", false, 2, null) != (propertyRelatedElement == PropertyRelatedElement.DELEGATE_FIELD) ? adultoid.formularize() : impassible(dovishnessVar, gravesideVarSaneness2, true, true, boolWireman, zBeachfront);
    }

    public final monoploid cuirassed(dovishness.attabal attabalVar) {
        walach walachVarDern = attabalVar.dern();
        molybdenite molybdeniteVar = walachVarDern instanceof molybdenite ? (molybdenite) walachVarDern : null;
        if (molybdeniteVar != null) {
            return molybdeniteVar.wireman();
        }
        return null;
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.serialization.deserialization.wireman
    public List<A> cutely(dovishness container, ProtoBuf$Property proto) {
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(proto, "proto");
        return cord(container, proto, PropertyRelatedElement.DELEGATE_FIELD);
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.serialization.deserialization.wireman
    public List<A> dern(ProtoBuf$TypeParameter proto, genesis.dern nameResolver) {
        Intrinsics.checkNotNullParameter(proto, "proto");
        Intrinsics.checkNotNullParameter(nameResolver, "nameResolver");
        Object extension = proto.getExtension(JvmProtoBuf.f31032impromptu);
        Intrinsics.checkNotNullExpressionValue(extension, "getExtension(...)");
        Iterable<ProtoBuf$Annotation> iterable = (Iterable) extension;
        ArrayList arrayList = new ArrayList(p002kotlin.collections.dovishness.gintrap(iterable, 10));
        for (ProtoBuf$Annotation protoBuf$Annotation : iterable) {
            Intrinsics.beachfront(protoBuf$Annotation);
            arrayList.add(gintrap(protoBuf$Annotation, nameResolver));
        }
        return arrayList;
    }

    public final boolean dovishness(byname.saneness classId) {
        monoploid monoploidVarAttabal;
        Intrinsics.checkNotNullParameter(classId, "classId");
        return classId.competently() != null && Intrinsics.wireman(classId.cutely().dern(), "Container") && (monoploidVarAttabal = arytenoidectomy.attabal(this.f30674attabal, classId, graveside())) != null && anadyr.attabal.f4429attabal.dern(monoploidVarAttabal);
    }

    public final int formularize(dovishness dovishnessVar, triweekly triweeklyVar) {
        if (triweeklyVar instanceof ProtoBuf$Function) {
            return beachfront.competently((ProtoBuf$Function) triweeklyVar) ? 1 : 0;
        }
        if (triweeklyVar instanceof ProtoBuf$Property) {
            return beachfront.impromptu((ProtoBuf$Property) triweeklyVar) ? 1 : 0;
        }
        if (!(triweeklyVar instanceof ProtoBuf$Constructor)) {
            throw new UnsupportedOperationException("Unsupported message: " + triweeklyVar.getClass());
        }
        Intrinsics.competently(dovishnessVar, "null cannot be cast to non-null type org.jetbrains.kotlin.serialization.deserialization.ProtoContainer.Class");
        dovishness.attabal attabalVar = (dovishness.attabal) dovishnessVar;
        if (attabalVar.competently() == ProtoBuf$Class.Kind.ENUM_CLASS) {
            return 2;
        }
        return attabalVar.taiyuan() ? 1 : 0;
    }

    public abstract A gintrap(ProtoBuf$Annotation protoBuf$Annotation, genesis.dern dernVar);

    public abstract marial graveside();

    public final List<A> impassible(dovishness dovishnessVar, graveside gravesideVar, boolean z, boolean z2, Boolean bool, boolean z3) {
        monoploid monoploidVarKowloon = kowloon(dovishnessVar, f30673saneness.attabal(dovishnessVar, z, z2, bool, z3, this.f30674attabal, graveside()));
        if (monoploidVarKowloon == null) {
            return adultoid.formularize();
        }
        List<A> list = arytenoidectomy(monoploidVarKowloon).attabal().get(gravesideVar);
        return list == null ? adultoid.formularize() : list;
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.serialization.deserialization.wireman
    public List<A> impromptu(dovishness container, ProtoBuf$Property proto) {
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(proto, "proto");
        return cord(container, proto, PropertyRelatedElement.BACKING_FIELD);
    }

    public final monoploid kowloon(dovishness container, monoploid monoploidVar) {
        Intrinsics.checkNotNullParameter(container, "container");
        if (monoploidVar != null) {
            return monoploidVar;
        }
        if (container instanceof dovishness.attabal) {
            return cuirassed((dovishness.attabal) container);
        }
        return null;
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.serialization.deserialization.wireman
    public List<A> marial(dovishness container, triweekly proto, AnnotatedCallableKind kind) {
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(proto, "proto");
        Intrinsics.checkNotNullParameter(kind, "kind");
        if (kind == AnnotatedCallableKind.PROPERTY) {
            return cord(container, (ProtoBuf$Property) proto, PropertyRelatedElement.PROPERTY);
        }
        graveside gravesideVarMolybdenite = molybdenite(this, proto, container.saneness(), container.wireman(), kind, false, 16, null);
        return gravesideVarMolybdenite == null ? adultoid.formularize() : triweekly(this, container, gravesideVarMolybdenite, false, false, null, false, 60, null);
    }

    public byte[] monoploid(monoploid kotlinClass) {
        Intrinsics.checkNotNullParameter(kotlinClass, "kotlinClass");
        return null;
    }

    public final graveside polloi(triweekly proto, genesis.dern nameResolver, competently typeTable, AnnotatedCallableKind kind, boolean z) {
        Intrinsics.checkNotNullParameter(proto, "proto");
        Intrinsics.checkNotNullParameter(nameResolver, "nameResolver");
        Intrinsics.checkNotNullParameter(typeTable, "typeTable");
        Intrinsics.checkNotNullParameter(kind, "kind");
        if (proto instanceof ProtoBuf$Constructor) {
            graveside.attabal attabalVar = graveside.f30756saneness;
            foreshot.wireman.saneness sanenessVarSaneness = taiyuan.f26288attabal.saneness((ProtoBuf$Constructor) proto, nameResolver, typeTable);
            if (sanenessVarSaneness == null) {
                return null;
            }
            return attabalVar.saneness(sanenessVarSaneness);
        }
        if (proto instanceof ProtoBuf$Function) {
            graveside.attabal attabalVar2 = graveside.f30756saneness;
            foreshot.wireman.saneness sanenessVarMarial = taiyuan.f26288attabal.marial((ProtoBuf$Function) proto, nameResolver, typeTable);
            if (sanenessVarMarial == null) {
                return null;
            }
            return attabalVar2.saneness(sanenessVarMarial);
        }
        if (proto instanceof ProtoBuf$Property) {
            GeneratedMessageLite.marial<ProtoBuf$Property, JvmProtoBuf.JvmPropertySignature> propertySignature = JvmProtoBuf.f31037wireman;
            Intrinsics.checkNotNullExpressionValue(propertySignature, "propertySignature");
            JvmProtoBuf.JvmPropertySignature jvmPropertySignature = (JvmProtoBuf.JvmPropertySignature) genesis.marial.attabal((GeneratedMessageLite.ExtendableMessage) proto, propertySignature);
            if (jvmPropertySignature == null) {
                return null;
            }
            int i = dern.f30677attabal[kind.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        return null;
                    }
                    return p002kotlin.reflect.jvm.internal.impl.load.kotlin.attabal.attabal((ProtoBuf$Property) proto, nameResolver, typeTable, true, true, z);
                }
                if (!jvmPropertySignature.hasSetter()) {
                    return null;
                }
                graveside.attabal attabalVar3 = graveside.f30756saneness;
                JvmProtoBuf.JvmMethodSignature setter = jvmPropertySignature.getSetter();
                Intrinsics.checkNotNullExpressionValue(setter, "getSetter(...)");
                return attabalVar3.dern(nameResolver, setter);
            }
            if (jvmPropertySignature.hasGetter()) {
                graveside.attabal attabalVar4 = graveside.f30756saneness;
                JvmProtoBuf.JvmMethodSignature getter = jvmPropertySignature.getGetter();
                Intrinsics.checkNotNullExpressionValue(getter, "getGetter(...)");
                return attabalVar4.dern(nameResolver, getter);
            }
        }
        return null;
    }

    public final monoploid.attabal preprohormone(byname.saneness annotationClassId, walach source, List<A> result) {
        Intrinsics.checkNotNullParameter(annotationClassId, "annotationClassId");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(result, "result");
        if (anadyr.attabal.f4429attabal.saneness().contains(annotationClassId)) {
            return null;
        }
        return rotuma(annotationClassId, source, result);
    }

    public abstract monoploid.attabal rotuma(byname.saneness sanenessVar, walach walachVar, List<A> list);

    @Override // p002kotlin.reflect.jvm.internal.impl.serialization.deserialization.wireman
    public List<A> saneness(dovishness.attabal container) {
        Intrinsics.checkNotNullParameter(container, "container");
        monoploid monoploidVarCuirassed = cuirassed(container);
        if (monoploidVarCuirassed != null) {
            ArrayList arrayList = new ArrayList(1);
            monoploidVarCuirassed.dern(new wireman(this, arrayList), monoploid(monoploidVarCuirassed));
            return arrayList;
        }
        throw new IllegalStateException(("Class for loading annotations is not found: " + container.attabal()).toString());
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.serialization.deserialization.wireman
    public List<A> taiyuan(dovishness container, triweekly proto, AnnotatedCallableKind kind) {
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(proto, "proto");
        Intrinsics.checkNotNullParameter(kind, "kind");
        graveside gravesideVarMolybdenite = molybdenite(this, proto, container.saneness(), container.wireman(), kind, false, 16, null);
        return gravesideVarMolybdenite != null ? triweekly(this, container, graveside.f30756saneness.marial(gravesideVarMolybdenite, 0), false, false, null, false, 60, null) : adultoid.formularize();
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.serialization.deserialization.wireman
    public List<A> wireman(dovishness container, ProtoBuf$EnumEntry proto) {
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(proto, "proto");
        graveside.attabal attabalVar = graveside.f30756saneness;
        String string = container.saneness().getString(proto.getName());
        String strDern = ((dovishness.attabal) container).marial().dern();
        Intrinsics.checkNotNullExpressionValue(strDern, "asString(...)");
        return triweekly(this, container, attabalVar.attabal(string, foreshot.saneness.saneness(strDern)), false, false, null, false, 60, null);
    }

    /* JADX INFO: compiled from: AbstractBinaryClassAnnotationLoader.kt */
    public static final class wireman implements monoploid.dern {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final /* synthetic */ AbstractBinaryClassAnnotationLoader<A, S> f30678attabal;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public final /* synthetic */ ArrayList<A> f30679saneness;

        public wireman(AbstractBinaryClassAnnotationLoader<A, S> abstractBinaryClassAnnotationLoader, ArrayList<A> arrayList) {
            this.f30678attabal = abstractBinaryClassAnnotationLoader;
            this.f30679saneness = arrayList;
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.monoploid.dern
        public monoploid.attabal dern(byname.saneness classId, walach source) {
            Intrinsics.checkNotNullParameter(classId, "classId");
            Intrinsics.checkNotNullParameter(source, "source");
            return this.f30678attabal.preprohormone(classId, source, this.f30679saneness);
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.monoploid.dern
        public void attabal() {
        }
    }
}
