package kotlin.reflect.jvm.internal.impl.builtins;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.TypeUtils;

/* JADX INFO: loaded from: classes7.dex */
public final class UnsignedTypes {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Set f43511a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final HashMap f43512b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final HashMap f43513c;
    public static final LinkedHashSet d;

    static {
        UnsignedType[] unsignedTypeArrValues = UnsignedType.values();
        ArrayList arrayList = new ArrayList(unsignedTypeArrValues.length);
        for (UnsignedType unsignedType : unsignedTypeArrValues) {
            arrayList.add(unsignedType.f43510Y);
        }
        f43511a = CollectionsKt.l0(arrayList);
        UnsignedArrayType[] unsignedArrayTypeArrValues = UnsignedArrayType.values();
        ArrayList arrayList2 = new ArrayList(unsignedArrayTypeArrValues.length);
        for (UnsignedArrayType unsignedArrayType : unsignedArrayTypeArrValues) {
            arrayList2.add(unsignedArrayType.X);
        }
        CollectionsKt.l0(arrayList2);
        f43512b = new HashMap();
        f43513c = new HashMap();
        MapsKt.g(new Pair(UnsignedArrayType.UBYTEARRAY, Name.g("ubyteArrayOf")), new Pair(UnsignedArrayType.USHORTARRAY, Name.g("ushortArrayOf")), new Pair(UnsignedArrayType.UINTARRAY, Name.g("uintArrayOf")), new Pair(UnsignedArrayType.ULONGARRAY, Name.g("ulongArrayOf")));
        UnsignedType[] unsignedTypeArrValues2 = UnsignedType.values();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (UnsignedType unsignedType2 : unsignedTypeArrValues2) {
            linkedHashSet.add(unsignedType2.Z.i());
        }
        d = linkedHashSet;
        for (UnsignedType unsignedType3 : UnsignedType.values()) {
            HashMap map = f43512b;
            ClassId classId = unsignedType3.Z;
            ClassId classId2 = unsignedType3.X;
            map.put(classId, classId2);
            f43513c.put(classId2, unsignedType3.Z);
        }
    }

    public static final boolean a(KotlinType kotlinType) {
        ClassifierDescriptor classifierDescriptorC;
        if (TypeUtils.m(kotlinType) || (classifierDescriptorC = kotlinType.H0().c()) == null) {
            return false;
        }
        DeclarationDescriptor declarationDescriptorD = classifierDescriptorC.d();
        return (declarationDescriptorD instanceof PackageFragmentDescriptor) && Intrinsics.a(((PackageFragmentDescriptor) declarationDescriptorD).c(), StandardNames.k) && f43511a.contains(classifierDescriptorC.getName());
    }
}
