package p002kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import genesic.attabal;
import genesic.beachfront;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.util.Collection;
import p002kotlin.collections.adultoid;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ReflectJavaArrayType.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class cutely extends rotuma implements beachfront {

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final rotuma f30239dern;

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public final boolean f30240marial;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final Type f30241saneness;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public final Collection<attabal> f30242wireman;

    public cutely(Type reflectType) {
        rotuma rotumaVarAttabal;
        Intrinsics.checkNotNullParameter(reflectType, "reflectType");
        this.f30241saneness = reflectType;
        Type typeSaran = saran();
        if (!(typeSaran instanceof GenericArrayType)) {
            if (typeSaran instanceof Class) {
                Class cls = (Class) typeSaran;
                if (cls.isArray()) {
                    rotuma.attabal attabalVar = rotuma.f30257attabal;
                    Class<?> componentType = cls.getComponentType();
                    Intrinsics.checkNotNullExpressionValue(componentType, "getComponentType(...)");
                    rotumaVarAttabal = attabalVar.attabal(componentType);
                }
            }
            throw new IllegalArgumentException("Not an array type (" + saran().getClass() + "): " + saran());
        }
        rotuma.attabal attabalVar2 = rotuma.f30257attabal;
        Type genericComponentType = ((GenericArrayType) typeSaran).getGenericComponentType();
        Intrinsics.checkNotNullExpressionValue(genericComponentType, "getGenericComponentType(...)");
        rotumaVarAttabal = attabalVar2.attabal(genericComponentType);
        this.f30239dern = rotumaVarAttabal;
        this.f30242wireman = adultoid.formularize();
    }

    @Override // genesic.wireman
    public Collection<attabal> getAnnotations() {
        return this.f30242wireman;
    }

    @Override // genesic.beachfront
    /* JADX INFO: renamed from: privatdozent, reason: merged with bridge method [inline-methods] */
    public rotuma triweekly() {
        return this.f30239dern;
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.rotuma
    public Type saran() {
        return this.f30241saneness;
    }

    @Override // genesic.wireman
    public boolean stratoscope() {
        return this.f30240marial;
    }
}
