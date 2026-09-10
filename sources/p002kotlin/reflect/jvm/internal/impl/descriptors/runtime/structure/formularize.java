package p002kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import byname.dern;
import genesic.attabal;
import genesic.cutely;
import genesic.rotuma;
import genesic.taiyuan;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import p002kotlin.collections.adultoid;
import p002kotlin.collections.dovishness;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ReflectJavaClassifierType.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class formularize extends rotuma implements cutely {

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final taiyuan f30250dern;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final Type f30251saneness;

    public formularize(Type reflectType) {
        taiyuan reflectJavaClass;
        Intrinsics.checkNotNullParameter(reflectType, "reflectType");
        this.f30251saneness = reflectType;
        Type typeSaran = saran();
        if (typeSaran instanceof Class) {
            reflectJavaClass = new ReflectJavaClass((Class) typeSaran);
        } else if (typeSaran instanceof TypeVariable) {
            reflectJavaClass = new preprohormone((TypeVariable) typeSaran);
        } else {
            if (!(typeSaran instanceof ParameterizedType)) {
                throw new IllegalStateException("Not a classifier type (" + typeSaran.getClass() + "): " + typeSaran);
            }
            Type rawType = ((ParameterizedType) typeSaran).getRawType();
            Intrinsics.competently(rawType, "null cannot be cast to non-null type java.lang.Class<*>");
            reflectJavaClass = new ReflectJavaClass((Class) rawType);
        }
        this.f30250dern = reflectJavaClass;
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.rotuma, genesic.wireman
    public attabal attabal(dern fqName) {
        Intrinsics.checkNotNullParameter(fqName, "fqName");
        return null;
    }

    @Override // genesic.cutely
    public taiyuan dern() {
        return this.f30250dern;
    }

    @Override // genesic.wireman
    public Collection<attabal> getAnnotations() {
        return adultoid.formularize();
    }

    @Override // genesic.cutely
    public boolean molybdenite() {
        Type typeSaran = saran();
        if (typeSaran instanceof Class) {
            TypeVariable[] typeParameters = ((Class) typeSaran).getTypeParameters();
            Intrinsics.checkNotNullExpressionValue(typeParameters, "getTypeParameters(...)");
            if (!(typeParameters.length == 0)) {
                return true;
            }
        }
        return false;
    }

    @Override // genesic.cutely
    public List<rotuma> preprohormone() {
        List<Type> listWireman = ReflectClassUtilKt.wireman(saran());
        rotuma.attabal attabalVar = rotuma.f30257attabal;
        ArrayList arrayList = new ArrayList(dovishness.gintrap(listWireman, 10));
        Iterator<T> it = listWireman.iterator();
        while (it.hasNext()) {
            arrayList.add(attabalVar.attabal((Type) it.next()));
        }
        return arrayList;
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.rotuma
    public Type saran() {
        return this.f30251saneness;
    }

    @Override // genesic.cutely
    public String sealless() {
        throw new UnsupportedOperationException("Type not found: " + saran());
    }

    @Override // genesic.wireman
    public boolean stratoscope() {
        return false;
    }

    @Override // genesic.cutely
    public String trm() {
        return saran().toString();
    }
}
