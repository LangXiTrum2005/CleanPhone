package kotlin.reflect.jvm.internal;

import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.startapp.simple.bloomfilter.codec.IOUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Triple;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.ReflectionFactory;
import kotlin.reflect.KProperty;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.EmptyPackageFragmentDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.PackagePartScopeCache;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.ReflectKotlinClass;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.RuntimeModuleData;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectClassUtilKt;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.load.kotlin.DeserializedDescriptorResolver;
import kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinClassFinderKt;
import kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass;
import kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.TypeTable;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmMetadataVersion;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmNameResolver;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmProtoBufUtil;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;
import kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmClassName;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.ChainedMemberScope;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedPackageMemberScope;
import kotlin.reflect.jvm.internal.impl.utils.DeserializationHelpersKt;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0006R\u0014\u0010\u0005\u001a\u00020\u00028BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lkotlin/reflect/jvm/internal/KPackageImpl;", "Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;", "Lkotlin/reflect/jvm/internal/impl/resolve/scopes/MemberScope;", "getScope", "()Lorg/jetbrains/kotlin/resolve/scopes/MemberScope;", "scope", "Data", "kotlin-reflection"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class KPackageImpl extends KDeclarationContainerImpl {

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final Class f43405Y;
    public final ReflectProperties.LazyVal Z;

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u00002\u00060\u0001R\u00020\u0002¨\u0006\u0003"}, d2 = {"Lkotlin/reflect/jvm/internal/KPackageImpl$Data;", "Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl$Data;", "Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;", "kotlin-reflection"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public final class Data extends KDeclarationContainerImpl.Data {
        public static final /* synthetic */ KProperty[] g;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final ReflectProperties.LazySoftVal f43406c;
        public final ReflectProperties.LazySoftVal d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final ReflectProperties.LazyVal f43407e;
        public final ReflectProperties.LazyVal f;

        static {
            ReflectionFactory reflectionFactory = Reflection.f43333a;
            g = new KProperty[]{reflectionFactory.i(new PropertyReference1Impl(reflectionFactory.b(Data.class), "kotlinClass", "getKotlinClass()Lorg/jetbrains/kotlin/descriptors/runtime/components/ReflectKotlinClass;")), reflectionFactory.i(new PropertyReference1Impl(reflectionFactory.b(Data.class), "scope", "getScope()Lorg/jetbrains/kotlin/resolve/scopes/MemberScope;")), reflectionFactory.i(new PropertyReference1Impl(reflectionFactory.b(Data.class), "multifileFacade", "getMultifileFacade()Ljava/lang/Class;")), reflectionFactory.i(new PropertyReference1Impl(reflectionFactory.b(Data.class), TtmlNode.TAG_METADATA, "getMetadata()Lkotlin/Triple;")), reflectionFactory.i(new PropertyReference1Impl(reflectionFactory.b(Data.class), "members", "getMembers()Ljava/util/Collection;"))};
        }

        public Data(final KPackageImpl kPackageImpl) {
            super(kPackageImpl);
            this.f43406c = ReflectProperties.a(null, new Function0<ReflectKotlinClass>() { // from class: kotlin.reflect.jvm.internal.KPackageImpl$Data$kotlinClass$2
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return ReflectKotlinClass.Factory.a(kPackageImpl.f43405Y);
                }
            });
            this.d = ReflectProperties.a(null, new Function0<MemberScope>() { // from class: kotlin.reflect.jvm.internal.KPackageImpl$Data$scope$2
                {
                    super(0);
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r5v14, types: [java.util.ArrayList] */
                /* JADX WARN: Type inference failed for: r5v5, types: [java.util.List] */
                /* JADX WARN: Type inference failed for: r5v6 */
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    ?? H;
                    KProperty[] kPropertyArr = KPackageImpl.Data.g;
                    KPackageImpl.Data data = this.X;
                    data.getClass();
                    KProperty kProperty = KPackageImpl.Data.g[0];
                    ReflectKotlinClass reflectKotlinClass = (ReflectKotlinClass) data.f43406c.invoke();
                    if (reflectKotlinClass == null) {
                        return MemberScope.Empty.f44351b;
                    }
                    KProperty kProperty2 = KDeclarationContainerImpl.Data.f43401b[0];
                    Object objInvoke = data.f43402a.invoke();
                    Intrinsics.e(objInvoke, "<get-moduleData>(...)");
                    PackagePartScopeCache packagePartScopeCache = ((RuntimeModuleData) objInvoke).f43679b;
                    ConcurrentHashMap concurrentHashMap = packagePartScopeCache.f43670c;
                    Class cls = reflectKotlinClass.f43673a;
                    ClassId classIdA = ReflectClassUtilKt.a(cls);
                    Object obj = concurrentHashMap.get(classIdA);
                    if (obj == null) {
                        FqName fqNameG = ReflectClassUtilKt.a(cls).g();
                        Intrinsics.e(fqNameG, "fileClass.classId.packageFqName");
                        KotlinClassHeader kotlinClassHeader = reflectKotlinClass.f43674b;
                        KotlinClassHeader.Kind kind = KotlinClassHeader.Kind.MULTIFILE_CLASS;
                        DeserializedDescriptorResolver deserializedDescriptorResolver = packagePartScopeCache.f43668a;
                        KotlinClassHeader.Kind kind2 = kotlinClassHeader.f44021a;
                        if (kind2 == kind) {
                            String[] strArr = kind2 == kind ? kotlinClassHeader.f44023c : null;
                            List listE = strArr != null ? ArraysKt.e(strArr) : null;
                            if (listE == null) {
                                listE = EmptyList.X;
                            }
                            H = new ArrayList();
                            Iterator it = listE.iterator();
                            while (it.hasNext()) {
                                KotlinJvmBinaryClass kotlinJvmBinaryClassA = KotlinClassFinderKt.a(packagePartScopeCache.f43669b, ClassId.j(new FqName(JvmClassName.d((String) it.next()).f44320a.replace(IOUtils.DIR_SEPARATOR_UNIX, '.'))), DeserializationHelpersKt.a(deserializedDescriptorResolver.c().f44393c));
                                if (kotlinJvmBinaryClassA != null) {
                                    H.add(kotlinJvmBinaryClassA);
                                }
                            }
                        } else {
                            H = CollectionsKt.H(reflectKotlinClass);
                        }
                        EmptyPackageFragmentDescriptor emptyPackageFragmentDescriptor = new EmptyPackageFragmentDescriptor(deserializedDescriptorResolver.c().f44392b, fqNameG);
                        ArrayList arrayList = new ArrayList();
                        Iterator it2 = ((Iterable) H).iterator();
                        while (it2.hasNext()) {
                            DeserializedPackageMemberScope deserializedPackageMemberScopeA = deserializedDescriptorResolver.a(emptyPackageFragmentDescriptor, (KotlinJvmBinaryClass) it2.next());
                            if (deserializedPackageMemberScopeA != null) {
                                arrayList.add(deserializedPackageMemberScopeA);
                            }
                        }
                        MemberScope memberScopeA = ChainedMemberScope.Companion.a(CollectionsKt.i0(arrayList), "package " + fqNameG + " (" + reflectKotlinClass + ')');
                        Object objPutIfAbsent = concurrentHashMap.putIfAbsent(classIdA, memberScopeA);
                        obj = objPutIfAbsent == null ? memberScopeA : objPutIfAbsent;
                    }
                    Intrinsics.e(obj, "cache.getOrPut(fileClass…ileClass)\", scopes)\n    }");
                    return (MemberScope) obj;
                }
            });
            this.f43407e = new ReflectProperties.LazyVal(new Function0<Class<?>>() { // from class: kotlin.reflect.jvm.internal.KPackageImpl$Data$multifileFacade$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0022  */
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String str;
                    KProperty[] kPropertyArr = KPackageImpl.Data.g;
                    KPackageImpl.Data data = this.X;
                    data.getClass();
                    KProperty kProperty = KPackageImpl.Data.g[0];
                    ReflectKotlinClass reflectKotlinClass = (ReflectKotlinClass) data.f43406c.invoke();
                    if (reflectKotlinClass != null) {
                        KotlinClassHeader kotlinClassHeader = reflectKotlinClass.f43674b;
                        if (kotlinClassHeader.f44021a == KotlinClassHeader.Kind.MULTIFILE_CLASS_PART) {
                            str = kotlinClassHeader.f;
                        } else {
                            str = null;
                        }
                    } else {
                        str = null;
                    }
                    if (str == null || str.length() <= 0) {
                        return null;
                    }
                    return kPackageImpl.f43405Y.getClassLoader().loadClass(StringsKt.H(str, IOUtils.DIR_SEPARATOR_UNIX, '.'));
                }
            });
            this.f = new ReflectProperties.LazyVal(new Function0<Triple<? extends JvmNameResolver, ? extends ProtoBuf.Package, ? extends JvmMetadataVersion>>() { // from class: kotlin.reflect.jvm.internal.KPackageImpl$Data$metadata$2
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() throws InvalidProtocolBufferException {
                    KotlinClassHeader kotlinClassHeader;
                    String[] strArr;
                    String[] strArr2;
                    KProperty[] kPropertyArr = KPackageImpl.Data.g;
                    KPackageImpl.Data data = this.X;
                    data.getClass();
                    KProperty kProperty = KPackageImpl.Data.g[0];
                    ReflectKotlinClass reflectKotlinClass = (ReflectKotlinClass) data.f43406c.invoke();
                    if (reflectKotlinClass == null || (strArr = (kotlinClassHeader = reflectKotlinClass.f43674b).f44023c) == null || (strArr2 = kotlinClassHeader.f44024e) == null) {
                        return null;
                    }
                    Pair pairH = JvmProtoBufUtil.h(strArr, strArr2);
                    return new Triple((JvmNameResolver) pairH.X, (ProtoBuf.Package) pairH.f43249Y, kotlinClassHeader.f44022b);
                }
            });
            ReflectProperties.a(null, new Function0<Collection<? extends KCallableImpl<?>>>(this) { // from class: kotlin.reflect.jvm.internal.KPackageImpl$Data$members$2

                /* JADX INFO: renamed from: Y, reason: collision with root package name */
                public final /* synthetic */ KPackageImpl.Data f43408Y;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                    this.f43408Y = this;
                }

                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    KPackageImpl.Data data = this.f43408Y;
                    data.getClass();
                    KProperty kProperty = KPackageImpl.Data.g[1];
                    Object objInvoke = data.d.invoke();
                    Intrinsics.e(objInvoke, "<get-scope>(...)");
                    KDeclarationContainerImpl.MemberBelonginess memberBelonginess = KDeclarationContainerImpl.MemberBelonginess.X;
                    return kPackageImpl.p((MemberScope) objInvoke, memberBelonginess);
                }
            });
        }
    }

    public KPackageImpl(Class jClass) {
        Intrinsics.f(jClass, "jClass");
        this.f43405Y = jClass;
        this.Z = new ReflectProperties.LazyVal(new Function0<Data>() { // from class: kotlin.reflect.jvm.internal.KPackageImpl$data$1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return new KPackageImpl.Data(this.X);
            }
        });
    }

    @Override // kotlin.jvm.internal.ClassBasedDeclarationContainer
    /* JADX INFO: renamed from: a, reason: from getter */
    public final Class getF43405Y() {
        return this.f43405Y;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof KPackageImpl) {
            return Intrinsics.a(this.f43405Y, ((KPackageImpl) obj).f43405Y);
        }
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.KDeclarationContainerImpl
    public final Collection f() {
        return EmptyList.X;
    }

    public final int hashCode() {
        return this.f43405Y.hashCode();
    }

    @Override // kotlin.reflect.jvm.internal.KDeclarationContainerImpl
    public final Collection n(Name name) {
        Data data = (Data) this.Z.invoke();
        data.getClass();
        KProperty kProperty = Data.g[1];
        Object objInvoke = data.d.invoke();
        Intrinsics.e(objInvoke, "<get-scope>(...)");
        return ((MemberScope) objInvoke).d(name, NoLookupLocation.f43721Y);
    }

    @Override // kotlin.reflect.jvm.internal.KDeclarationContainerImpl
    public final PropertyDescriptor o(int i2) {
        Data data = (Data) this.Z.invoke();
        data.getClass();
        KProperty kProperty = Data.g[3];
        Triple triple = (Triple) data.f.invoke();
        if (triple != null) {
            JvmNameResolver jvmNameResolver = (JvmNameResolver) triple.X;
            ProtoBuf.Package r2 = (ProtoBuf.Package) triple.f43253Y;
            JvmMetadataVersion jvmMetadataVersion = (JvmMetadataVersion) triple.Z;
            GeneratedMessageLite.GeneratedExtension packageLocalVariable = JvmProtoBuf.f44135n;
            Intrinsics.e(packageLocalVariable, "packageLocalVariable");
            Intrinsics.f(r2, "<this>");
            ProtoBuf.Property property = (ProtoBuf.Property) (i2 < r2.k(packageLocalVariable) ? r2.j(packageLocalVariable, i2) : null);
            if (property != null) {
                ProtoBuf.TypeTable typeTable = r2.h0;
                Intrinsics.e(typeTable, "packageProto.typeTable");
                return (PropertyDescriptor) UtilKt.f(this.f43405Y, property, jvmNameResolver, new TypeTable(typeTable), jvmMetadataVersion, KPackageImpl$getLocalProperty$1$1$1.X);
            }
        }
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.KDeclarationContainerImpl
    public final Class q() {
        Data data = (Data) this.Z.invoke();
        data.getClass();
        KProperty kProperty = Data.g[2];
        Class cls = (Class) data.f43407e.invoke();
        return cls == null ? this.f43405Y : cls;
    }

    @Override // kotlin.reflect.jvm.internal.KDeclarationContainerImpl
    public final Collection r(Name name) {
        Data data = (Data) this.Z.invoke();
        data.getClass();
        KProperty kProperty = Data.g[1];
        Object objInvoke = data.d.invoke();
        Intrinsics.e(objInvoke, "<get-scope>(...)");
        return ((MemberScope) objInvoke).b(name, NoLookupLocation.f43721Y);
    }

    public final String toString() {
        return "file class " + ReflectClassUtilKt.a(this.f43405Y).b();
    }
}
