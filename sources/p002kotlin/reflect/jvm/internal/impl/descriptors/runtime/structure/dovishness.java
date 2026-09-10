package p002kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import genesic.attabal;
import java.util.Collection;
import p002kotlin.collections.adultoid;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType;
import p002kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType;

/* JADX INFO: compiled from: ReflectJavaPrimitiveType.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class dovishness extends rotuma implements genesic.dovishness {

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final Collection<attabal> f30247dern;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final Class<?> f30248saneness;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public final boolean f30249wireman;

    public dovishness(Class<?> reflectType) {
        Intrinsics.checkNotNullParameter(reflectType, "reflectType");
        this.f30248saneness = reflectType;
        this.f30247dern = adultoid.formularize();
    }

    @Override // genesic.wireman
    public Collection<attabal> getAnnotations() {
        return this.f30247dern;
    }

    @Override // genesic.dovishness
    public PrimitiveType getType() {
        if (Intrinsics.wireman(saran(), Void.TYPE)) {
            return null;
        }
        return JvmPrimitiveType.get(saran().getName()).getPrimitiveType();
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.rotuma
    /* JADX INFO: renamed from: privatdozent, reason: merged with bridge method [inline-methods] */
    public Class<?> saran() {
        return this.f30248saneness;
    }

    @Override // genesic.wireman
    public boolean stratoscope() {
        return this.f30249wireman;
    }
}
