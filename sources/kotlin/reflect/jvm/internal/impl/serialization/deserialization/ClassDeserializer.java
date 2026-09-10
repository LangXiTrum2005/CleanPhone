package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import java.util.Iterator;
import java.util.Set;
import kotlin.collections.SetsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.builtins.StandardNames;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentProviderKt;
import kotlin.reflect.jvm.internal.impl.descriptors.deserialization.ClassDescriptorFactory;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.BinaryVersion;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.TypeTable;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.VersionRequirementTable;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope;
import kotlin.reflect.jvm.internal.impl.storage.MemoizedFunctionToNullable;

/* JADX INFO: loaded from: classes7.dex */
public final class ClassDeserializer {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Set f44385c = SetsKt.h(ClassId.j(StandardNames.FqNames.f43497c.g()));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DeserializationComponents f44386a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final MemoizedFunctionToNullable f44387b;

    public static final class ClassKey {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ClassId f44388a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ClassData f44389b;

        public ClassKey(ClassId classId, ClassData classData) {
            Intrinsics.f(classId, "classId");
            this.f44388a = classId;
            this.f44389b = classData;
        }

        public final boolean equals(Object obj) {
            if (obj instanceof ClassKey) {
                return Intrinsics.a(this.f44388a, ((ClassKey) obj).f44388a);
            }
            return false;
        }

        public final int hashCode() {
            return this.f44388a.hashCode();
        }
    }

    public static final class Companion {
    }

    public ClassDeserializer(DeserializationComponents components) {
        Intrinsics.f(components, "components");
        this.f44386a = components;
        this.f44387b = components.f44391a.h(new Function1<ClassKey, ClassDescriptor>() { // from class: kotlin.reflect.jvm.internal.impl.serialization.deserialization.ClassDeserializer$classes$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                ClassData classDataA;
                Object next;
                DeserializationContext deserializationContextA;
                DeserializedPackageFragment deserializedPackageFragment;
                Name nameI;
                ClassDescriptor classDescriptorC;
                ClassDeserializer.ClassKey key = (ClassDeserializer.ClassKey) obj;
                Intrinsics.f(key, "key");
                Set set = ClassDeserializer.f44385c;
                ClassDeserializer classDeserializer = this.X;
                classDeserializer.getClass();
                DeserializationComponents deserializationComponents = classDeserializer.f44386a;
                Iterator it = deserializationComponents.k.iterator();
                do {
                    boolean zHasNext = it.hasNext();
                    ClassId classId = key.f44388a;
                    if (!zHasNext) {
                        if (!ClassDeserializer.f44385c.contains(classId) && ((classDataA = key.f44389b) != null || (classDataA = deserializationComponents.d.a(classId)) != null)) {
                            ClassId classIdF = classId.f();
                            BinaryVersion binaryVersion = classDataA.f44384c;
                            NameResolver nameResolver = classDataA.f44382a;
                            ProtoBuf.Class r12 = classDataA.f44383b;
                            if (classIdF != null) {
                                ClassDescriptor classDescriptorA = classDeserializer.a(classIdF, null);
                                DeserializedClassDescriptor deserializedClassDescriptor = classDescriptorA instanceof DeserializedClassDescriptor ? (DeserializedClassDescriptor) classDescriptorA : null;
                                if (deserializedClassDescriptor != null) {
                                    Name nameI2 = classId.i();
                                    Intrinsics.e(nameI2, "classId.shortClassName");
                                    if (deserializedClassDescriptor.G0().m().contains(nameI2)) {
                                        deserializationContextA = deserializedClassDescriptor.m0;
                                        return new DeserializedClassDescriptor(deserializationContextA, r12, nameResolver, binaryVersion, classDataA.d);
                                    }
                                }
                            } else {
                                FqName fqNameG = classId.g();
                                Intrinsics.e(fqNameG, "classId.packageFqName");
                                Iterator it2 = PackageFragmentProviderKt.c(deserializationComponents.f, fqNameG).iterator();
                                do {
                                    if (!it2.hasNext()) {
                                        next = null;
                                        break;
                                    }
                                    next = it2.next();
                                    PackageFragmentDescriptor packageFragmentDescriptor = (PackageFragmentDescriptor) next;
                                    if (!(packageFragmentDescriptor instanceof DeserializedPackageFragment)) {
                                        break;
                                    }
                                    deserializedPackageFragment = (DeserializedPackageFragment) packageFragmentDescriptor;
                                    nameI = classId.i();
                                    Intrinsics.e(nameI, "classId.shortClassName");
                                    deserializedPackageFragment.getClass();
                                } while (!((DeserializedMemberScope) ((DeserializedPackageFragmentImpl) deserializedPackageFragment).n()).m().contains(nameI));
                                PackageFragmentDescriptor packageFragmentDescriptor2 = (PackageFragmentDescriptor) next;
                                if (packageFragmentDescriptor2 != null) {
                                    ProtoBuf.TypeTable typeTable = r12.F0;
                                    Intrinsics.e(typeTable, "classProto.typeTable");
                                    TypeTable typeTable2 = new TypeTable(typeTable);
                                    VersionRequirementTable versionRequirementTable = VersionRequirementTable.f44126b;
                                    ProtoBuf.VersionRequirementTable versionRequirementTable2 = r12.H0;
                                    Intrinsics.e(versionRequirementTable2, "classProto.versionRequirementTable");
                                    deserializationContextA = classDeserializer.f44386a.a(packageFragmentDescriptor2, nameResolver, typeTable2, VersionRequirementTable.Companion.a(versionRequirementTable2), binaryVersion, null);
                                    binaryVersion = binaryVersion;
                                    return new DeserializedClassDescriptor(deserializationContextA, r12, nameResolver, binaryVersion, classDataA.d);
                                }
                            }
                        }
                        return null;
                    }
                    classDescriptorC = ((ClassDescriptorFactory) it.next()).c(classId);
                } while (classDescriptorC == null);
                return classDescriptorC;
            }
        });
    }

    public final ClassDescriptor a(ClassId classId, ClassData classData) {
        Intrinsics.f(classId, "classId");
        return (ClassDescriptor) this.f44387b.invoke(new ClassKey(classId, classData));
    }
}
