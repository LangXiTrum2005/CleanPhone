package healthily;

import genesic.adultoid;
import java.util.Set;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaClass;
import p002kotlin.text.dovishness;

/* JADX INFO: compiled from: ReflectJavaClassFinder.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class wireman implements p002kotlin.reflect.jvm.internal.impl.load.java.cutely {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final ClassLoader f27615attabal;

    public wireman(ClassLoader classLoader) {
        Intrinsics.checkNotNullParameter(classLoader, "classLoader");
        this.f27615attabal = classLoader;
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.load.java.cutely
    public genesic.competently attabal(kotlin.reflect.jvm.internal.impl.load.java.cutely.attabal request) {
        Intrinsics.checkNotNullParameter(request, "request");
        byname.saneness sanenessVarAttabal = request.attabal();
        byname.dern dernVarImpromptu = sanenessVarAttabal.impromptu();
        Intrinsics.checkNotNullExpressionValue(dernVarImpromptu, "getPackageFqName(...)");
        String strSaneness = sanenessVarAttabal.taiyuan().saneness();
        Intrinsics.checkNotNullExpressionValue(strSaneness, "asString(...)");
        String strMerc = dovishness.merc(strSaneness, '.', '$', false, 4, null);
        if (!dernVarImpromptu.wireman()) {
            strMerc = dernVarImpromptu.saneness() + '.' + strMerc;
        }
        Class<?> clsAttabal = marial.attabal(this.f27615attabal, strMerc);
        if (clsAttabal != null) {
            return new ReflectJavaClass(clsAttabal);
        }
        return null;
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.load.java.cutely
    public adultoid dern(byname.dern fqName, boolean z) {
        Intrinsics.checkNotNullParameter(fqName, "fqName");
        return new p002kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.adultoid(fqName);
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.load.java.cutely
    public Set<String> saneness(byname.dern packageFqName) {
        Intrinsics.checkNotNullParameter(packageFqName, "packageFqName");
        return null;
    }
}
