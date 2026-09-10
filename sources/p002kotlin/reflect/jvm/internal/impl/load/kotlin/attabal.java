package p002kotlin.reflect.jvm.internal.impl.load.kotlin;

import foreshot.taiyuan;
import foreshot.wireman;
import genesis.competently;
import genesis.dern;
import genesis.marial;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Property;
import p002kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf;
import p002kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite;

/* JADX INFO: compiled from: AbstractBinaryClassAnnotationLoader.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class attabal {
    public static final graveside attabal(ProtoBuf$Property proto, dern nameResolver, competently typeTable, boolean z, boolean z2, boolean z3) {
        Intrinsics.checkNotNullParameter(proto, "proto");
        Intrinsics.checkNotNullParameter(nameResolver, "nameResolver");
        Intrinsics.checkNotNullParameter(typeTable, "typeTable");
        GeneratedMessageLite.marial<ProtoBuf$Property, JvmProtoBuf.JvmPropertySignature> propertySignature = JvmProtoBuf.f31037wireman;
        Intrinsics.checkNotNullExpressionValue(propertySignature, "propertySignature");
        JvmProtoBuf.JvmPropertySignature jvmPropertySignature = (JvmProtoBuf.JvmPropertySignature) marial.attabal(proto, propertySignature);
        if (jvmPropertySignature == null) {
            return null;
        }
        if (z) {
            wireman.attabal attabalVarDern = taiyuan.f26288attabal.dern(proto, nameResolver, typeTable, z3);
            if (attabalVarDern == null) {
                return null;
            }
            return graveside.f30756saneness.saneness(attabalVarDern);
        }
        if (!z2 || !jvmPropertySignature.hasSyntheticMethod()) {
            return null;
        }
        graveside.attabal attabalVar = graveside.f30756saneness;
        JvmProtoBuf.JvmMethodSignature syntheticMethod = jvmPropertySignature.getSyntheticMethod();
        Intrinsics.checkNotNullExpressionValue(syntheticMethod, "getSyntheticMethod(...)");
        return attabalVar.dern(nameResolver, syntheticMethod);
    }

    public static /* synthetic */ graveside saneness(ProtoBuf$Property protoBuf$Property, dern dernVar, competently competentlyVar, boolean z, boolean z2, boolean z3, int i, Object obj) {
        if ((i & 8) != 0) {
            z = false;
        }
        if ((i & 16) != 0) {
            z2 = false;
        }
        if ((i & 32) != 0) {
            z3 = true;
        }
        return attabal(protoBuf$Property, dernVar, competentlyVar, z, z2, z3);
    }
}
