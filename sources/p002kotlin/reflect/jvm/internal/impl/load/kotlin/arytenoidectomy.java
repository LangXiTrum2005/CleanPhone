package p002kotlin.reflect.jvm.internal.impl.load.kotlin;

import byname.saneness;
import foreshot.marial;
import genesic.competently;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: KotlinClassFinder.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class arytenoidectomy {
    public static final monoploid attabal(kowloon kowloonVar, saneness classId, marial jvmMetadataVersion) {
        Intrinsics.checkNotNullParameter(kowloonVar, "<this>");
        Intrinsics.checkNotNullParameter(classId, "classId");
        Intrinsics.checkNotNullParameter(jvmMetadataVersion, "jvmMetadataVersion");
        kowloon.attabal attabalVarDern = kowloonVar.dern(classId, jvmMetadataVersion);
        if (attabalVarDern != null) {
            return attabalVarDern.attabal();
        }
        return null;
    }

    public static final monoploid saneness(kowloon kowloonVar, competently javaClass, marial jvmMetadataVersion) {
        Intrinsics.checkNotNullParameter(kowloonVar, "<this>");
        Intrinsics.checkNotNullParameter(javaClass, "javaClass");
        Intrinsics.checkNotNullParameter(jvmMetadataVersion, "jvmMetadataVersion");
        kowloon.attabal attabalVarSaneness = kowloonVar.saneness(javaClass, jvmMetadataVersion);
        if (attabalVarSaneness != null) {
            return attabalVarSaneness.attabal();
        }
        return null;
    }
}
