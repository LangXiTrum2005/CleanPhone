package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import com.startapp.simple.bloomfilter.codec.IOUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.ReflectionFactory;
import kotlin.reflect.KProperty;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.PackageFragmentDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.ContextKt;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.JavaResolverComponents;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaAnnotationsKt;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaPackage;
import kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinClassFinderKt;
import kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass;
import kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryPackageSourceElement;
import kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmMetadataVersion;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmClassName;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager;
import kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue;
import kotlin.reflect.jvm.internal.impl.storage.StorageKt;
import kotlin.reflect.jvm.internal.impl.utils.DeserializationHelpersKt;

/* JADX INFO: loaded from: classes7.dex */
public final class LazyJavaPackageFragment extends PackageFragmentDescriptorImpl {
    public static final /* synthetic */ KProperty[] p0;
    public final JavaPackage h0;
    public final LazyJavaResolverContext i0;
    public final JvmMetadataVersion j0;
    public final NotNullLazyValue k0;
    public final JvmPackageScope l0;
    public final NotNullLazyValue m0;
    public final Annotations n0;
    public final NotNullLazyValue o0;

    static {
        ReflectionFactory reflectionFactory = Reflection.f43333a;
        p0 = new KProperty[]{reflectionFactory.i(new PropertyReference1Impl(reflectionFactory.b(LazyJavaPackageFragment.class), "binaryClasses", "getBinaryClasses$descriptors_jvm()Ljava/util/Map;")), reflectionFactory.i(new PropertyReference1Impl(reflectionFactory.b(LazyJavaPackageFragment.class), "partToFacade", "getPartToFacade()Ljava/util/HashMap;"))};
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public LazyJavaPackageFragment(LazyJavaResolverContext outerContext, JavaPackage javaPackage) {
        Intrinsics.f(outerContext, "outerContext");
        JavaResolverComponents javaResolverComponents = outerContext.f43840a;
        super(javaResolverComponents.o, javaPackage.c());
        this.h0 = javaPackage;
        LazyJavaResolverContext lazyJavaResolverContextA = ContextKt.a(outerContext, this, null, 6);
        this.i0 = lazyJavaResolverContextA;
        this.j0 = DeserializationHelpersKt.a(javaResolverComponents.d.c().f44393c);
        JavaResolverComponents javaResolverComponents2 = lazyJavaResolverContextA.f43840a;
        LockBasedStorageManager lockBasedStorageManager = javaResolverComponents2.f43824a;
        this.k0 = lockBasedStorageManager.a(new Function0<Map<String, ? extends KotlinJvmBinaryClass>>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaPackageFragment$binaryClasses$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                LazyJavaPackageFragment lazyJavaPackageFragment = this.X;
                lazyJavaPackageFragment.i0.f43840a.f43830l.a(lazyJavaPackageFragment.f0.b());
                EmptyList<String> emptyList = EmptyList.X;
                ArrayList arrayList = new ArrayList();
                for (String str : emptyList) {
                    KotlinJvmBinaryClass kotlinJvmBinaryClassA = KotlinClassFinderKt.a(lazyJavaPackageFragment.i0.f43840a.f43826c, ClassId.j(new FqName(JvmClassName.d(str).f44320a.replace(IOUtils.DIR_SEPARATOR_UNIX, '.'))), lazyJavaPackageFragment.j0);
                    Pair pair = kotlinJvmBinaryClassA != null ? new Pair(str, kotlinJvmBinaryClassA) : null;
                    if (pair != null) {
                        arrayList.add(pair);
                    }
                }
                return MapsKt.p(arrayList);
            }
        });
        this.l0 = new JvmPackageScope(lazyJavaResolverContextA, javaPackage, this);
        this.m0 = lockBasedStorageManager.i(new Function0<List<? extends FqName>>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaPackageFragment$subPackages$1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                this.X.h0.getClass();
                EmptyList emptyList = EmptyList.X;
                ArrayList arrayList = new ArrayList(CollectionsKt.n(emptyList, 10));
                Iterator<E> it = emptyList.iterator();
                while (it.hasNext()) {
                    arrayList.add(((JavaPackage) it.next()).c());
                }
                return arrayList;
            }
        });
        this.n0 = javaResolverComponents2.v.f43757c ? Annotations.Companion.f43614a : LazyJavaAnnotationsKt.a(lazyJavaResolverContextA, javaPackage);
        this.o0 = lockBasedStorageManager.a(new Function0<HashMap<JvmClassName, JvmClassName>>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaPackageFragment$partToFacade$2

            public /* synthetic */ class WhenMappings {
                static {
                    int[] iArr = new int[KotlinClassHeader.Kind.values().length];
                    try {
                        iArr[5] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        LinkedHashMap linkedHashMap = KotlinClassHeader.Kind.f44025Y;
                        iArr[2] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                }
            }

            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                HashMap map = new HashMap();
                LazyJavaPackageFragment lazyJavaPackageFragment = this.X;
                lazyJavaPackageFragment.getClass();
                for (Map.Entry entry : ((Map) StorageKt.a(lazyJavaPackageFragment.k0, LazyJavaPackageFragment.p0[0])).entrySet()) {
                    String str = (String) entry.getKey();
                    KotlinJvmBinaryClass kotlinJvmBinaryClass = (KotlinJvmBinaryClass) entry.getValue();
                    JvmClassName jvmClassNameD = JvmClassName.d(str);
                    KotlinClassHeader kotlinClassHeaderD = kotlinJvmBinaryClass.d();
                    int iOrdinal = kotlinClassHeaderD.f44021a.ordinal();
                    if (iOrdinal == 2) {
                        map.put(jvmClassNameD, jvmClassNameD);
                    } else if (iOrdinal == 5) {
                        String str2 = kotlinClassHeaderD.f44021a == KotlinClassHeader.Kind.MULTIFILE_CLASS_PART ? kotlinClassHeaderD.f : null;
                        if (str2 != null) {
                            map.put(jvmClassNameD, JvmClassName.d(str2));
                        }
                    }
                }
                return map;
            }
        });
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.PackageFragmentDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.impl.DeclarationDescriptorNonRootImpl, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorWithSource
    public final SourceElement f() {
        return new KotlinJvmBinaryPackageSourceElement(this);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotatedImpl, kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotated
    public final Annotations getAnnotations() {
        return this.n0;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor
    public final MemberScope n() {
        return this.l0;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.PackageFragmentDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.impl.DeclarationDescriptorImpl
    public final String toString() {
        return "Lazy Java package fragment: " + this.f0 + " of module " + this.i0.f43840a.o;
    }
}
