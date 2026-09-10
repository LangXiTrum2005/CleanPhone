package p002kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import byname.dern;
import byname.saneness;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.Iterator;
import p002kotlin.jvm.internal.DefaultConstructorMarker;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ReflectJavaType.kt */
/* JADX INFO: loaded from: classes5.dex */
public abstract class rotuma implements genesic.rotuma {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public static final attabal f30257attabal = new attabal(null);

    /* JADX INFO: compiled from: ReflectJavaType.kt */
    public static final class attabal {
        public /* synthetic */ attabal(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final rotuma attabal(Type type) {
            Intrinsics.checkNotNullParameter(type, "type");
            boolean z = type instanceof Class;
            if (z) {
                Class cls = (Class) type;
                if (cls.isPrimitive()) {
                    return new dovishness(cls);
                }
            }
            if ((type instanceof GenericArrayType) || (z && ((Class) type).isArray())) {
                return new cutely(type);
            }
            return type instanceof WildcardType ? new cuirassed((WildcardType) type) : new formularize(type);
        }

        public attabal() {
        }
    }

    @Override // genesic.wireman
    public genesic.attabal attabal(dern fqName) {
        Object obj;
        Object next;
        saneness sanenessVarCompetently;
        Intrinsics.checkNotNullParameter(fqName, "fqName");
        Iterator<T> it = getAnnotations().iterator();
        do {
            obj = null;
            if (it.hasNext()) {
                next = it.next();
                sanenessVarCompetently = ((genesic.attabal) next).competently();
            }
            return (genesic.attabal) obj;
        } while (!Intrinsics.wireman(sanenessVarCompetently != null ? sanenessVarCompetently.saneness() : null, fqName));
        obj = next;
        return (genesic.attabal) obj;
    }

    public boolean equals(Object obj) {
        return (obj instanceof rotuma) && Intrinsics.wireman(saran(), ((rotuma) obj).saran());
    }

    public int hashCode() {
        return saran().hashCode();
    }

    public abstract Type saran();

    public String toString() {
        return getClass().getName() + ": " + saran();
    }
}
