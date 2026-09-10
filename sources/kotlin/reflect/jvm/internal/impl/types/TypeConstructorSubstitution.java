package kotlin.reflect.jvm.internal.impl.types;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;

/* JADX INFO: loaded from: classes7.dex */
public abstract class TypeConstructorSubstitution extends TypeSubstitution {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Companion f44539b = new Companion();

    public static final class Companion {
        public final TypeSubstitution a(TypeConstructor typeConstructor, List arguments) {
            Intrinsics.f(typeConstructor, "typeConstructor");
            Intrinsics.f(arguments, "arguments");
            List parameters = typeConstructor.getParameters();
            Intrinsics.e(parameters, "typeConstructor.parameters");
            TypeParameterDescriptor typeParameterDescriptor = (TypeParameterDescriptor) CollectionsKt.G(parameters);
            if (typeParameterDescriptor == null || !typeParameterDescriptor.L()) {
                return new IndexedParametersSubstitution((TypeParameterDescriptor[]) parameters.toArray(new TypeParameterDescriptor[0]), (TypeProjection[]) arguments.toArray(new TypeProjection[0]), false);
            }
            List parameters2 = typeConstructor.getParameters();
            Intrinsics.e(parameters2, "typeConstructor.parameters");
            List list = parameters2;
            ArrayList arrayList = new ArrayList(CollectionsKt.n(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((TypeParameterDescriptor) it.next()).h());
            }
            return new TypeConstructorSubstitution$Companion$createByConstructorsMap$1(MapsKt.p(CollectionsKt.n0(arrayList, arguments)));
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeSubstitution
    public final TypeProjection d(KotlinType kotlinType) {
        return g(kotlinType.H0());
    }

    public abstract TypeProjection g(TypeConstructor typeConstructor);
}
