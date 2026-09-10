package healthily;

import java.io.InputStream;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.reflect.jvm.internal.impl.load.kotlin.kowloon;

/* JADX INFO: compiled from: ReflectKotlinClassFinder.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class competently implements kowloon {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final ClassLoader f27606attabal;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final droppable.saneness f27607saneness;

    public competently(ClassLoader classLoader) {
        Intrinsics.checkNotNullParameter(classLoader, "classLoader");
        this.f27606attabal = classLoader;
        this.f27607saneness = new droppable.saneness();
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.serialization.deserialization.polloi
    public InputStream attabal(byname.dern packageFqName) {
        Intrinsics.checkNotNullParameter(packageFqName, "packageFqName");
        if (packageFqName.taiyuan(p002kotlin.reflect.jvm.internal.impl.builtins.competently.f29683rotuma)) {
            return this.f27607saneness.attabal(droppable.attabal.f25374polloi.polloi(packageFqName));
        }
        return null;
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.load.kotlin.kowloon
    public kowloon.attabal dern(byname.saneness classId, foreshot.marial jvmMetadataVersion) {
        Intrinsics.checkNotNullParameter(classId, "classId");
        Intrinsics.checkNotNullParameter(jvmMetadataVersion, "jvmMetadataVersion");
        return wireman(impromptu.saneness(classId));
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.load.kotlin.kowloon
    public kowloon.attabal saneness(genesic.competently javaClass, foreshot.marial jvmMetadataVersion) {
        String strSaneness;
        Intrinsics.checkNotNullParameter(javaClass, "javaClass");
        Intrinsics.checkNotNullParameter(jvmMetadataVersion, "jvmMetadataVersion");
        byname.dern dernVarMarial = javaClass.marial();
        if (dernVarMarial == null || (strSaneness = dernVarMarial.saneness()) == null) {
            return null;
        }
        return wireman(strSaneness);
    }

    public final kowloon.attabal wireman(String str) {
        beachfront beachfrontVarAttabal;
        Class<?> clsAttabal = marial.attabal(this.f27606attabal, str);
        if (clsAttabal == null || (beachfrontVarAttabal = beachfront.f27603dern.attabal(clsAttabal)) == null) {
            return null;
        }
        return new kowloon.attabal.saneness(beachfrontVarAttabal, null, 2, null);
    }
}
