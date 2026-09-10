package ml;

import tl.q0;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class l extends kotlin.jvm.internal.j implements jk.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f46213b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l(int i10, int i11, Object obj) {
        super(i10, obj);
        this.f46213b = i11;
    }

    @Override // kotlin.jvm.internal.d, qk.c
    public final String getName() {
        switch (this.f46213b) {
            case 0:
                return "searchMethodsByNameWithoutBuiltinMagic";
            case 1:
                return "searchMethodsInSupertypesWithoutBuiltinMagic";
            case 2:
                return "loadResource";
            case 3:
                return "simpleType";
            case 4:
                return "getValueClassPropertyType";
            case 5:
                return "<init>";
            default:
                return "prepareType";
        }
    }

    @Override // kotlin.jvm.internal.d
    public final qk.f getOwner() {
        switch (this.f46213b) {
            case 0:
                return kotlin.jvm.internal.d0.f44761a.b(p.class);
            case 1:
                return kotlin.jvm.internal.d0.f44761a.b(p.class);
            case 2:
                return kotlin.jvm.internal.d0.f44761a.b(mm.d.class);
            case 3:
                return kotlin.jvm.internal.d0.f44761a.b(kotlin.jvm.internal.m.class);
            case 4:
                return kotlin.jvm.internal.d0.f44761a.b(nm.h.class);
            case 5:
                return kotlin.jvm.internal.d0.f44761a.b(nm.f.class);
            default:
                return kotlin.jvm.internal.d0.f44761a.b(qm.e.class);
        }
    }

    @Override // kotlin.jvm.internal.d
    public final String getSignature() {
        switch (this.f46213b) {
            case 0:
                return "searchMethodsByNameWithoutBuiltinMagic(Lorg/jetbrains/kotlin/name/Name;)Ljava/util/Collection;";
            case 1:
                return "searchMethodsInSupertypesWithoutBuiltinMagic(Lorg/jetbrains/kotlin/name/Name;)Ljava/util/Collection;";
            case 2:
                return "loadResource(Ljava/lang/String;)Ljava/io/InputStream;";
            case 3:
                return "computeValueClassRepresentation$simpleType(Lorg/jetbrains/kotlin/serialization/deserialization/TypeDeserializer;Lorg/jetbrains/kotlin/metadata/ProtoBuf$Type;)Lorg/jetbrains/kotlin/types/SimpleType;";
            case 4:
                return "getValueClassPropertyType(Lorg/jetbrains/kotlin/name/Name;)Lorg/jetbrains/kotlin/types/SimpleType;";
            case 5:
                return "<init>(Lorg/jetbrains/kotlin/serialization/deserialization/descriptors/DeserializedClassDescriptor;Lorg/jetbrains/kotlin/types/checker/KotlinTypeRefiner;)V";
            default:
                return "prepareType(Lorg/jetbrains/kotlin/types/model/KotlinTypeMarker;)Lorg/jetbrains/kotlin/types/UnwrappedType;";
        }
    }

    @Override // jk.b
    public final Object invoke(Object obj) {
        switch (this.f46213b) {
            case 0:
                yl.f p10 = (yl.f) obj;
                kotlin.jvm.internal.n.f(p10, "p0");
                return p.v((p) this.receiver, p10);
            case 1:
                yl.f p11 = (yl.f) obj;
                kotlin.jvm.internal.n.f(p11, "p0");
                return p.w((p) this.receiver, p11);
            case 2:
                String p12 = (String) obj;
                kotlin.jvm.internal.n.f(p12, "p0");
                ((mm.d) this.receiver).getClass();
                return mm.d.a(p12);
            case 3:
                q0 p13 = (q0) obj;
                kotlin.jvm.internal.n.f(p13, "p0");
                return ((lm.b0) this.receiver).d(p13, true);
            case 4:
                yl.f p14 = (yl.f) obj;
                kotlin.jvm.internal.n.f(p14, "p0");
                return ((nm.h) this.receiver).P(p14);
            case 5:
                qm.f p15 = (qm.f) obj;
                kotlin.jvm.internal.n.f(p15, "p0");
                return new nm.f((nm.h) this.receiver, p15);
            default:
                sm.c p16 = (sm.c) obj;
                kotlin.jvm.internal.n.f(p16, "p0");
                return ((qm.e) this.receiver).a(p16);
        }
    }
}
