package p002kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import genesis.competently;
import genesis.dern;
import p002kotlin.jvm.internal.DefaultConstructorMarker;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.reflect.jvm.internal.impl.descriptors.walach;
import p002kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Class;

/* JADX INFO: compiled from: ProtoContainer.kt */
/* JADX INFO: loaded from: classes5.dex */
public abstract class dovishness {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final dern f31567attabal;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final walach f31568dern;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final competently f31569saneness;

    /* JADX INFO: compiled from: ProtoContainer.kt */
    public static final class attabal extends dovishness {

        /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
        public final byname.saneness f31570beachfront;

        /* JADX INFO: renamed from: competently, reason: collision with root package name */
        public final ProtoBuf$Class.Kind f31571competently;

        /* JADX INFO: renamed from: impromptu, reason: collision with root package name */
        public final boolean f31572impromptu;

        /* JADX INFO: renamed from: marial, reason: collision with root package name */
        public final attabal f31573marial;

        /* JADX INFO: renamed from: wireman, reason: collision with root package name */
        public final ProtoBuf$Class f31574wireman;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public attabal(ProtoBuf$Class classProto, dern nameResolver, competently typeTable, walach walachVar, attabal attabalVar) {
            super(nameResolver, typeTable, walachVar, null);
            Intrinsics.checkNotNullParameter(classProto, "classProto");
            Intrinsics.checkNotNullParameter(nameResolver, "nameResolver");
            Intrinsics.checkNotNullParameter(typeTable, "typeTable");
            this.f31574wireman = classProto;
            this.f31573marial = attabalVar;
            this.f31570beachfront = graveside.attabal(nameResolver, classProto.getFqName());
            ProtoBuf$Class.Kind kindWireman = genesis.saneness.f26676beachfront.wireman(classProto.getFlags());
            this.f31571competently = kindWireman == null ? ProtoBuf$Class.Kind.CLASS : kindWireman;
            Boolean boolWireman = genesis.saneness.f26677competently.wireman(classProto.getFlags());
            Intrinsics.checkNotNullExpressionValue(boolWireman, "get(...)");
            this.f31572impromptu = boolWireman.booleanValue();
        }

        @Override // p002kotlin.reflect.jvm.internal.impl.serialization.deserialization.dovishness
        public byname.dern attabal() {
            byname.dern dernVarSaneness = this.f31570beachfront.saneness();
            Intrinsics.checkNotNullExpressionValue(dernVarSaneness, "asSingleFqName(...)");
            return dernVarSaneness;
        }

        public final ProtoBuf$Class beachfront() {
            return this.f31574wireman;
        }

        public final ProtoBuf$Class.Kind competently() {
            return this.f31571competently;
        }

        public final attabal impromptu() {
            return this.f31573marial;
        }

        public final byname.saneness marial() {
            return this.f31570beachfront;
        }

        public final boolean taiyuan() {
            return this.f31572impromptu;
        }
    }

    /* JADX INFO: compiled from: ProtoContainer.kt */
    public static final class saneness extends dovishness {

        /* JADX INFO: renamed from: wireman, reason: collision with root package name */
        public final byname.dern f31575wireman;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public saneness(byname.dern fqName, dern nameResolver, competently typeTable, walach walachVar) {
            super(nameResolver, typeTable, walachVar, null);
            Intrinsics.checkNotNullParameter(fqName, "fqName");
            Intrinsics.checkNotNullParameter(nameResolver, "nameResolver");
            Intrinsics.checkNotNullParameter(typeTable, "typeTable");
            this.f31575wireman = fqName;
        }

        @Override // p002kotlin.reflect.jvm.internal.impl.serialization.deserialization.dovishness
        public byname.dern attabal() {
            return this.f31575wireman;
        }
    }

    public /* synthetic */ dovishness(dern dernVar, competently competentlyVar, walach walachVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(dernVar, competentlyVar, walachVar);
    }

    public abstract byname.dern attabal();

    public final walach dern() {
        return this.f31568dern;
    }

    public final dern saneness() {
        return this.f31567attabal;
    }

    public String toString() {
        return getClass().getSimpleName() + ": " + attabal();
    }

    public final competently wireman() {
        return this.f31569saneness;
    }

    public dovishness(dern dernVar, competently competentlyVar, walach walachVar) {
        this.f31567attabal = dernVar;
        this.f31569saneness = competentlyVar;
        this.f31568dern = walachVar;
    }
}
