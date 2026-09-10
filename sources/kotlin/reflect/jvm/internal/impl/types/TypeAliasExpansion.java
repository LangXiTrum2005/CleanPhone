package kotlin.reflect.jvm.internal.impl.types;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeAliasDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;

/* JADX INFO: loaded from: classes7.dex */
public final class TypeAliasExpansion {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TypeAliasExpansion f44525a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TypeAliasDescriptor f44526b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f44527c;
    public final Map d;

    public static final class Companion {
        public static TypeAliasExpansion a(TypeAliasExpansion typeAliasExpansion, TypeAliasDescriptor typeAliasDescriptor, List arguments) {
            Intrinsics.f(typeAliasDescriptor, "typeAliasDescriptor");
            Intrinsics.f(arguments, "arguments");
            List parameters = typeAliasDescriptor.h().getParameters();
            Intrinsics.e(parameters, "typeAliasDescriptor.typeConstructor.parameters");
            List list = parameters;
            ArrayList arrayList = new ArrayList(CollectionsKt.n(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((TypeParameterDescriptor) it.next()).y0());
            }
            return new TypeAliasExpansion(typeAliasExpansion, typeAliasDescriptor, arguments, MapsKt.p(CollectionsKt.n0(arrayList, arguments)));
        }
    }

    public TypeAliasExpansion(TypeAliasExpansion typeAliasExpansion, TypeAliasDescriptor typeAliasDescriptor, List list, Map map) {
        this.f44525a = typeAliasExpansion;
        this.f44526b = typeAliasDescriptor;
        this.f44527c = list;
        this.d = map;
    }

    public final boolean a(TypeAliasDescriptor descriptor) {
        Intrinsics.f(descriptor, "descriptor");
        if (Intrinsics.a(this.f44526b, descriptor)) {
            return true;
        }
        TypeAliasExpansion typeAliasExpansion = this.f44525a;
        return typeAliasExpansion != null ? typeAliasExpansion.a(descriptor) : false;
    }
}
