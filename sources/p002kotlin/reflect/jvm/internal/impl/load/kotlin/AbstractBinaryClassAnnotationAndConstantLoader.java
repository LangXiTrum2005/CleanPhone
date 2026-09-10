package p002kotlin.reflect.jvm.internal.impl.load.kotlin;

import byname.marial;
import foreshot.taiyuan;
import genesis.saneness;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p002kotlin.jvm.functions.Function1;
import p002kotlin.jvm.functions.Function2;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.reflect.jvm.internal.impl.descriptors.walach;
import p002kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Property;
import p002kotlin.reflect.jvm.internal.impl.resolve.constants.competently;
import p002kotlin.reflect.jvm.internal.impl.resolve.constants.kowloon;
import p002kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotatedCallableKind;
import p002kotlin.reflect.jvm.internal.impl.serialization.deserialization.dovishness;
import p002kotlin.reflect.jvm.internal.impl.types.oilcan;
import yeast.beachfront;
import yeast.formularize;

/* JADX INFO: compiled from: AbstractBinaryClassAnnotationAndConstantLoader.kt */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractBinaryClassAnnotationAndConstantLoader<A, C> extends AbstractBinaryClassAnnotationLoader<A, saneness<? extends A, ? extends C>> implements p002kotlin.reflect.jvm.internal.impl.serialization.deserialization.attabal<A, C> {

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final beachfront<monoploid, saneness<A, C>> f30663dern;

    /* JADX INFO: compiled from: AbstractBinaryClassAnnotationAndConstantLoader.kt */
    public static final class attabal implements monoploid.wireman {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final /* synthetic */ AbstractBinaryClassAnnotationAndConstantLoader<A, C> f30664attabal;

        /* JADX INFO: renamed from: dern, reason: collision with root package name */
        public final /* synthetic */ monoploid f30665dern;

        /* JADX INFO: renamed from: marial, reason: collision with root package name */
        public final /* synthetic */ HashMap<graveside, C> f30666marial;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public final /* synthetic */ HashMap<graveside, List<A>> f30667saneness;

        /* JADX INFO: renamed from: wireman, reason: collision with root package name */
        public final /* synthetic */ HashMap<graveside, C> f30668wireman;

        /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.load.kotlin.AbstractBinaryClassAnnotationAndConstantLoader$attabal$attabal, reason: collision with other inner class name */
        /* JADX INFO: compiled from: AbstractBinaryClassAnnotationAndConstantLoader.kt */
        public final class C0683attabal extends kotlin.reflect.jvm.internal.impl.load.kotlin.AbstractBinaryClassAnnotationAndConstantLoader$attabal.saneness implements monoploid.marial {

            /* JADX INFO: renamed from: wireman, reason: collision with root package name */
            public final /* synthetic */ attabal f30669wireman;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0683attabal(attabal attabalVar, graveside signature) {
                super(attabalVar, signature);
                Intrinsics.checkNotNullParameter(signature, "signature");
                this.f30669wireman = attabalVar;
            }

            @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.monoploid.marial
            public monoploid.attabal saneness(int i, byname.saneness classId, walach source) {
                Intrinsics.checkNotNullParameter(classId, "classId");
                Intrinsics.checkNotNullParameter(source, "source");
                graveside gravesideVarMarial = graveside.f30756saneness.marial(wireman(), i);
                List<A> arrayList = this.f30669wireman.f30667saneness.get(gravesideVarMarial);
                if (arrayList == null) {
                    arrayList = new ArrayList<>();
                    this.f30669wireman.f30667saneness.put(gravesideVarMarial, arrayList);
                }
                return this.f30669wireman.f30664attabal.preprohormone(classId, source, arrayList);
            }
        }

        /* JADX INFO: compiled from: AbstractBinaryClassAnnotationAndConstantLoader.kt */
        public class saneness implements monoploid.dern {

            /* JADX INFO: renamed from: attabal, reason: collision with root package name */
            public final graveside f30670attabal;

            /* JADX INFO: renamed from: dern, reason: collision with root package name */
            public final /* synthetic */ attabal f30671dern;

            /* JADX INFO: renamed from: saneness, reason: collision with root package name */
            public final ArrayList<A> f30672saneness;

            public saneness(attabal attabalVar, graveside signature) {
                Intrinsics.checkNotNullParameter(signature, "signature");
                this.f30671dern = attabalVar;
                this.f30670attabal = signature;
                this.f30672saneness = new ArrayList<>();
            }

            @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.monoploid.dern
            public void attabal() {
                if (this.f30672saneness.isEmpty()) {
                    return;
                }
                this.f30671dern.f30667saneness.put(this.f30670attabal, this.f30672saneness);
            }

            @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.monoploid.dern
            public monoploid.attabal dern(byname.saneness classId, walach source) {
                Intrinsics.checkNotNullParameter(classId, "classId");
                Intrinsics.checkNotNullParameter(source, "source");
                return this.f30671dern.f30664attabal.preprohormone(classId, source, this.f30672saneness);
            }

            public final graveside wireman() {
                return this.f30670attabal;
            }
        }

        public attabal(AbstractBinaryClassAnnotationAndConstantLoader<A, C> abstractBinaryClassAnnotationAndConstantLoader, HashMap<graveside, List<A>> map, monoploid monoploidVar, HashMap<graveside, C> map2, HashMap<graveside, C> map3) {
            this.f30664attabal = abstractBinaryClassAnnotationAndConstantLoader;
            this.f30667saneness = map;
            this.f30665dern = monoploidVar;
            this.f30668wireman = map2;
            this.f30666marial = map3;
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.monoploid.wireman
        public monoploid.marial attabal(marial name, String desc) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(desc, "desc");
            graveside.attabal attabalVar = graveside.f30756saneness;
            String strDern = name.dern();
            Intrinsics.checkNotNullExpressionValue(strDern, "asString(...)");
            return new C0683attabal(this, attabalVar.wireman(strDern, desc));
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.monoploid.wireman
        public monoploid.dern saneness(marial name, String desc, Object obj) {
            C cSealless;
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(desc, "desc");
            graveside.attabal attabalVar = graveside.f30756saneness;
            String strDern = name.dern();
            Intrinsics.checkNotNullExpressionValue(strDern, "asString(...)");
            graveside gravesideVarAttabal = attabalVar.attabal(strDern, desc);
            if (obj != null && (cSealless = this.f30664attabal.sealless(desc, obj)) != null) {
                this.f30666marial.put(gravesideVarAttabal, cSealless);
            }
            return new saneness(this, gravesideVarAttabal);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractBinaryClassAnnotationAndConstantLoader(formularize storageManager, kowloon kotlinClassFinder) {
        super(kotlinClassFinder);
        Intrinsics.checkNotNullParameter(storageManager, "storageManager");
        Intrinsics.checkNotNullParameter(kotlinClassFinder, "kotlinClassFinder");
        this.f30663dern = storageManager.taiyuan(new Function1<monoploid, saneness<? extends A, ? extends C>>(this) { // from class: kotlin.reflect.jvm.internal.impl.load.kotlin.AbstractBinaryClassAnnotationAndConstantLoader$storage$1
            final /* synthetic */ AbstractBinaryClassAnnotationAndConstantLoader<A, C> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
                this.this$0 = this;
            }

            @Override // p002kotlin.jvm.functions.Function1
            public final saneness<A, C> invoke(monoploid kotlinClass) {
                Intrinsics.checkNotNullParameter(kotlinClass, "kotlinClass");
                return this.this$0.yemenite(kotlinClass);
            }
        });
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.serialization.deserialization.attabal
    public C beachfront(dovishness container, ProtoBuf$Property proto, oilcan expectedType) {
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(proto, "proto");
        Intrinsics.checkNotNullParameter(expectedType, "expectedType");
        return kattegat(container, proto, AnnotatedCallableKind.PROPERTY_GETTER, expectedType, new Function2<saneness<? extends A, ? extends C>, graveside, C>() { // from class: kotlin.reflect.jvm.internal.impl.load.kotlin.AbstractBinaryClassAnnotationAndConstantLoader$loadAnnotationDefaultValue$1
            @Override // p002kotlin.jvm.functions.Function2
            public final C invoke(saneness<? extends A, ? extends C> loadConstantFromProperty, graveside it) {
                Intrinsics.checkNotNullParameter(loadConstantFromProperty, "$this$loadConstantFromProperty");
                Intrinsics.checkNotNullParameter(it, "it");
                return loadConstantFromProperty.saneness().get(it);
            }
        });
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.serialization.deserialization.attabal
    public C competently(dovishness container, ProtoBuf$Property proto, oilcan expectedType) {
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(proto, "proto");
        Intrinsics.checkNotNullParameter(expectedType, "expectedType");
        return kattegat(container, proto, AnnotatedCallableKind.PROPERTY, expectedType, new Function2<saneness<? extends A, ? extends C>, graveside, C>() { // from class: kotlin.reflect.jvm.internal.impl.load.kotlin.AbstractBinaryClassAnnotationAndConstantLoader$loadPropertyConstant$1
            @Override // p002kotlin.jvm.functions.Function2
            public final C invoke(saneness<? extends A, ? extends C> loadConstantFromProperty, graveside it) {
                Intrinsics.checkNotNullParameter(loadConstantFromProperty, "$this$loadConstantFromProperty");
                Intrinsics.checkNotNullParameter(it, "it");
                return loadConstantFromProperty.dern().get(it);
            }
        });
    }

    public final C kattegat(dovishness dovishnessVar, ProtoBuf$Property protoBuf$Property, AnnotatedCallableKind annotatedCallableKind, oilcan oilcanVar, Function2<? super saneness<? extends A, ? extends C>, ? super graveside, ? extends C> function2) {
        C cInvoke;
        monoploid monoploidVarKowloon = kowloon(dovishnessVar, AbstractBinaryClassAnnotationLoader.f30673saneness.attabal(dovishnessVar, true, true, saneness.f26707stratoscope.wireman(protoBuf$Property.getFlags()), taiyuan.beachfront(protoBuf$Property), adultoid(), graveside()));
        if (monoploidVarKowloon == null) {
            return null;
        }
        graveside gravesideVarPolloi = polloi(protoBuf$Property, dovishnessVar.saneness(), dovishnessVar.wireman(), annotatedCallableKind, monoploidVarKowloon.saneness().wireman().wireman(DeserializedDescriptorResolver.f30684saneness.attabal()));
        if (gravesideVarPolloi == null || (cInvoke = function2.invoke(this.f30663dern.invoke(monoploidVarKowloon), gravesideVarPolloi)) == null) {
            return null;
        }
        return p002kotlin.reflect.jvm.internal.impl.builtins.taiyuan.wireman(oilcanVar) ? supplicat(cInvoke) : cInvoke;
    }

    public final boolean oilcan(byname.saneness annotationClassId, Map<marial, ? extends competently<?>> arguments) {
        Intrinsics.checkNotNullParameter(annotationClassId, "annotationClassId");
        Intrinsics.checkNotNullParameter(arguments, "arguments");
        if (!Intrinsics.wireman(annotationClassId, anadyr.attabal.f4429attabal.attabal())) {
            return false;
        }
        competently<?> competentlyVar = arguments.get(marial.cutely("value"));
        kowloon kowloonVar = competentlyVar instanceof kowloon ? (kowloon) competentlyVar : null;
        if (kowloonVar == null) {
            return false;
        }
        kowloon.saneness sanenessVarSaneness = kowloonVar.saneness();
        kowloon.saneness.C0700saneness c0700saneness = sanenessVarSaneness instanceof kowloon.saneness.C0700saneness ? (kowloon.saneness.C0700saneness) sanenessVarSaneness : null;
        if (c0700saneness == null) {
            return false;
        }
        return dovishness(c0700saneness.saneness());
    }

    public abstract C sealless(String str, Object obj);

    public abstract C supplicat(C c);

    @Override // p002kotlin.reflect.jvm.internal.impl.load.kotlin.AbstractBinaryClassAnnotationLoader
    /* JADX INFO: renamed from: trm, reason: merged with bridge method [inline-methods] */
    public saneness<A, C> arytenoidectomy(monoploid binaryClass) {
        Intrinsics.checkNotNullParameter(binaryClass, "binaryClass");
        return this.f30663dern.invoke(binaryClass);
    }

    public final saneness<A, C> yemenite(monoploid monoploidVar) {
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        HashMap map3 = new HashMap();
        monoploidVar.attabal(new attabal(this, map, monoploidVar, map3, map2), monoploid(monoploidVar));
        return new saneness<>(map, map2, map3);
    }
}
