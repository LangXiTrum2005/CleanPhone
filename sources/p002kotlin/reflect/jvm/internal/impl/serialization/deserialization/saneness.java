package p002kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import genesis.marial;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p002kotlin.collections.adultoid;
import p002kotlin.collections.dovishness;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.reflect.jvm.internal.impl.descriptors.NotFoundClasses;
import p002kotlin.reflect.jvm.internal.impl.descriptors.annotations.dern;
import p002kotlin.reflect.jvm.internal.impl.descriptors.trm;
import p002kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Annotation;
import p002kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Constructor;
import p002kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$EnumEntry;
import p002kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Function;
import p002kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Property;
import p002kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type;
import p002kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeParameter;
import p002kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$ValueParameter;
import p002kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite;
import p002kotlin.reflect.jvm.internal.impl.protobuf.triweekly;
import p002kotlin.reflect.jvm.internal.impl.resolve.constants.competently;
import p002kotlin.reflect.jvm.internal.impl.types.oilcan;

/* JADX INFO: compiled from: AnnotationAndConstantLoaderImpl.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class saneness implements p002kotlin.reflect.jvm.internal.impl.serialization.deserialization.attabal<dern, competently<?>> {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final haemopoiesis.attabal f31620attabal;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final dern f31621saneness;

    /* JADX INFO: compiled from: AnnotationAndConstantLoaderImpl.kt */
    public /* synthetic */ class attabal {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public static final /* synthetic */ int[] f31622attabal;

        static {
            int[] iArr = new int[AnnotatedCallableKind.values().length];
            try {
                iArr[AnnotatedCallableKind.PROPERTY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AnnotatedCallableKind.PROPERTY_GETTER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AnnotatedCallableKind.PROPERTY_SETTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f31622attabal = iArr;
        }
    }

    public saneness(trm module, NotFoundClasses notFoundClasses, haemopoiesis.attabal protocol) {
        Intrinsics.checkNotNullParameter(module, "module");
        Intrinsics.checkNotNullParameter(notFoundClasses, "notFoundClasses");
        Intrinsics.checkNotNullParameter(protocol, "protocol");
        this.f31620attabal = protocol;
        this.f31621saneness = new dern(module, notFoundClasses);
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.serialization.deserialization.wireman
    public List<dern> apical(ProtoBuf$Type proto, genesis.dern nameResolver) {
        Intrinsics.checkNotNullParameter(proto, "proto");
        Intrinsics.checkNotNullParameter(nameResolver, "nameResolver");
        List listFormularize = (List) proto.getExtension(this.f31620attabal.kowloon());
        if (listFormularize == null) {
            listFormularize = adultoid.formularize();
        }
        List list = listFormularize;
        ArrayList arrayList = new ArrayList(dovishness.gintrap(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(this.f31621saneness.attabal((ProtoBuf$Annotation) it.next(), nameResolver));
        }
        return arrayList;
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.serialization.deserialization.wireman
    public List<dern> attabal(dovishness container, triweekly callableProto, AnnotatedCallableKind kind, int i, ProtoBuf$ValueParameter proto) {
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(callableProto, "callableProto");
        Intrinsics.checkNotNullParameter(kind, "kind");
        Intrinsics.checkNotNullParameter(proto, "proto");
        List listFormularize = (List) proto.getExtension(this.f31620attabal.impromptu());
        if (listFormularize == null) {
            listFormularize = adultoid.formularize();
        }
        List list = listFormularize;
        ArrayList arrayList = new ArrayList(dovishness.gintrap(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(this.f31621saneness.attabal((ProtoBuf$Annotation) it.next(), container.saneness()));
        }
        return arrayList;
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.serialization.deserialization.wireman
    public List<dern> cutely(dovishness container, ProtoBuf$Property proto) {
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(proto, "proto");
        GeneratedMessageLite.marial<ProtoBuf$Property, List<ProtoBuf$Annotation>> marialVarApical = this.f31620attabal.apical();
        List listFormularize = marialVarApical != null ? (List) proto.getExtension(marialVarApical) : null;
        if (listFormularize == null) {
            listFormularize = adultoid.formularize();
        }
        List list = listFormularize;
        ArrayList arrayList = new ArrayList(dovishness.gintrap(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(this.f31621saneness.attabal((ProtoBuf$Annotation) it.next(), container.saneness()));
        }
        return arrayList;
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.serialization.deserialization.wireman
    public List<dern> dern(ProtoBuf$TypeParameter proto, genesis.dern nameResolver) {
        Intrinsics.checkNotNullParameter(proto, "proto");
        Intrinsics.checkNotNullParameter(nameResolver, "nameResolver");
        List listFormularize = (List) proto.getExtension(this.f31620attabal.arytenoidectomy());
        if (listFormularize == null) {
            listFormularize = adultoid.formularize();
        }
        List list = listFormularize;
        ArrayList arrayList = new ArrayList(dovishness.gintrap(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(this.f31621saneness.attabal((ProtoBuf$Annotation) it.next(), nameResolver));
        }
        return arrayList;
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.serialization.deserialization.attabal
    /* JADX INFO: renamed from: formularize, reason: merged with bridge method [inline-methods] */
    public competently<?> beachfront(dovishness container, ProtoBuf$Property proto, oilcan expectedType) {
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(proto, "proto");
        Intrinsics.checkNotNullParameter(expectedType, "expectedType");
        return null;
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.serialization.deserialization.attabal
    /* JADX INFO: renamed from: impassible, reason: merged with bridge method [inline-methods] */
    public competently<?> competently(dovishness container, ProtoBuf$Property proto, oilcan expectedType) {
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(proto, "proto");
        Intrinsics.checkNotNullParameter(expectedType, "expectedType");
        ProtoBuf$Annotation.Argument.Value value = (ProtoBuf$Annotation.Argument.Value) marial.attabal(proto, this.f31620attabal.saneness());
        if (value == null) {
            return null;
        }
        return this.f31621saneness.beachfront(expectedType, value, container.saneness());
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.serialization.deserialization.wireman
    public List<dern> impromptu(dovishness container, ProtoBuf$Property proto) {
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(proto, "proto");
        GeneratedMessageLite.marial<ProtoBuf$Property, List<ProtoBuf$Annotation>> marialVarCutely = this.f31620attabal.cutely();
        List listFormularize = marialVarCutely != null ? (List) proto.getExtension(marialVarCutely) : null;
        if (listFormularize == null) {
            listFormularize = adultoid.formularize();
        }
        List list = listFormularize;
        ArrayList arrayList = new ArrayList(dovishness.gintrap(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(this.f31621saneness.attabal((ProtoBuf$Annotation) it.next(), container.saneness()));
        }
        return arrayList;
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.serialization.deserialization.wireman
    public List<dern> marial(dovishness container, triweekly proto, AnnotatedCallableKind kind) {
        List listFormularize;
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(proto, "proto");
        Intrinsics.checkNotNullParameter(kind, "kind");
        if (proto instanceof ProtoBuf$Constructor) {
            listFormularize = (List) ((ProtoBuf$Constructor) proto).getExtension(this.f31620attabal.dern());
        } else if (proto instanceof ProtoBuf$Function) {
            listFormularize = (List) ((ProtoBuf$Function) proto).getExtension(this.f31620attabal.beachfront());
        } else {
            if (!(proto instanceof ProtoBuf$Property)) {
                throw new IllegalStateException(("Unknown message: " + proto).toString());
            }
            int i = attabal.f31622attabal[kind.ordinal()];
            if (i == 1) {
                listFormularize = (List) ((ProtoBuf$Property) proto).getExtension(this.f31620attabal.taiyuan());
            } else if (i == 2) {
                listFormularize = (List) ((ProtoBuf$Property) proto).getExtension(this.f31620attabal.impassible());
            } else {
                if (i != 3) {
                    throw new IllegalStateException("Unsupported callable kind with property proto");
                }
                listFormularize = (List) ((ProtoBuf$Property) proto).getExtension(this.f31620attabal.triweekly());
            }
        }
        if (listFormularize == null) {
            listFormularize = adultoid.formularize();
        }
        List list = listFormularize;
        ArrayList arrayList = new ArrayList(dovishness.gintrap(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(this.f31621saneness.attabal((ProtoBuf$Annotation) it.next(), container.saneness()));
        }
        return arrayList;
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.serialization.deserialization.wireman
    public List<dern> saneness(dovishness.attabal container) {
        Intrinsics.checkNotNullParameter(container, "container");
        List listFormularize = (List) container.beachfront().getExtension(this.f31620attabal.attabal());
        if (listFormularize == null) {
            listFormularize = adultoid.formularize();
        }
        List list = listFormularize;
        ArrayList arrayList = new ArrayList(dovishness.gintrap(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(this.f31621saneness.attabal((ProtoBuf$Annotation) it.next(), container.saneness()));
        }
        return arrayList;
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.serialization.deserialization.wireman
    public List<dern> taiyuan(dovishness container, triweekly proto, AnnotatedCallableKind kind) {
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(proto, "proto");
        Intrinsics.checkNotNullParameter(kind, "kind");
        List listFormularize = null;
        if (proto instanceof ProtoBuf$Function) {
            GeneratedMessageLite.marial<ProtoBuf$Function, List<ProtoBuf$Annotation>> marialVarCompetently = this.f31620attabal.competently();
            if (marialVarCompetently != null) {
                listFormularize = (List) ((ProtoBuf$Function) proto).getExtension(marialVarCompetently);
            }
        } else {
            if (!(proto instanceof ProtoBuf$Property)) {
                throw new IllegalStateException(("Unknown message: " + proto).toString());
            }
            int i = attabal.f31622attabal[kind.ordinal()];
            if (i != 1 && i != 2 && i != 3) {
                throw new IllegalStateException(("Unsupported callable kind with property proto for receiver annotations: " + kind).toString());
            }
            GeneratedMessageLite.marial<ProtoBuf$Property, List<ProtoBuf$Annotation>> marialVarFormularize = this.f31620attabal.formularize();
            if (marialVarFormularize != null) {
                listFormularize = (List) ((ProtoBuf$Property) proto).getExtension(marialVarFormularize);
            }
        }
        if (listFormularize == null) {
            listFormularize = adultoid.formularize();
        }
        List list = listFormularize;
        ArrayList arrayList = new ArrayList(dovishness.gintrap(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(this.f31621saneness.attabal((ProtoBuf$Annotation) it.next(), container.saneness()));
        }
        return arrayList;
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.serialization.deserialization.wireman
    public List<dern> wireman(dovishness container, ProtoBuf$EnumEntry proto) {
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(proto, "proto");
        List listFormularize = (List) proto.getExtension(this.f31620attabal.wireman());
        if (listFormularize == null) {
            listFormularize = adultoid.formularize();
        }
        List list = listFormularize;
        ArrayList arrayList = new ArrayList(dovishness.gintrap(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(this.f31621saneness.attabal((ProtoBuf$Annotation) it.next(), container.saneness()));
        }
        return arrayList;
    }
}
