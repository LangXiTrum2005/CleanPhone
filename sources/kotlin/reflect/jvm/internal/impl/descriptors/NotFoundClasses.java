package kotlin.reflect.jvm.internal.impl.descriptors;

import com.google.android.gms.ads.RequestConfiguration;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptySet;
import kotlin.collections.IntIterator;
import kotlin.collections.SetsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntProgressionIterator;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.ClassDescriptorBase;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.EmptyPackageFragmentDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.TypeParameterDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager;
import kotlin.reflect.jvm.internal.impl.storage.MemoizedFunctionToNotNull;
import kotlin.reflect.jvm.internal.impl.types.ClassTypeConstructorImpl;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;

/* JADX INFO: loaded from: classes7.dex */
public final class NotFoundClasses {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LockBasedStorageManager f43578a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ModuleDescriptor f43579b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final MemoizedFunctionToNotNull f43580c;
    public final MemoizedFunctionToNotNull d;

    public static final class ClassRequest {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ClassId f43581a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final List f43582b;

        public ClassRequest(ClassId classId, List list) {
            Intrinsics.f(classId, "classId");
            this.f43581a = classId;
            this.f43582b = list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ClassRequest)) {
                return false;
            }
            ClassRequest classRequest = (ClassRequest) obj;
            return Intrinsics.a(this.f43581a, classRequest.f43581a) && Intrinsics.a(this.f43582b, classRequest.f43582b);
        }

        public final int hashCode() {
            return this.f43582b.hashCode() + (this.f43581a.hashCode() * 31);
        }

        public final String toString() {
            return "ClassRequest(classId=" + this.f43581a + ", typeParametersCount=" + this.f43582b + ')';
        }
    }

    public static final class MockClassDescriptor extends ClassDescriptorBase {
        public final boolean h0;
        public final ArrayList i0;
        public final ClassTypeConstructorImpl j0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public MockClassDescriptor(LockBasedStorageManager lockBasedStorageManager, ClassOrPackageFragmentDescriptor container, Name name, boolean z2, int i2) {
            super(lockBasedStorageManager, container, name, SourceElement.f43591a);
            Intrinsics.f(container, "container");
            this.h0 = z2;
            IntRange intRangeE = RangesKt.e(0, i2);
            ArrayList arrayList = new ArrayList(CollectionsKt.n(intRangeE, 10));
            Iterator<Integer> it = intRangeE.iterator();
            while (((IntProgressionIterator) it).Z) {
                int iA = ((IntIterator) it).a();
                arrayList.add(TypeParameterDescriptorImpl.J0(this, Variance.INVARIANT, Name.g(RequestConfiguration.MAX_AD_CONTENT_RATING_T + iA), iA, lockBasedStorageManager));
            }
            this.i0 = arrayList;
            this.j0 = new ClassTypeConstructorImpl(this, TypeParameterUtilsKt.b(this), SetsKt.h(DescriptorUtilsKt.j(this).k().e()), lockBasedStorageManager);
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
        public final boolean D0() {
            return false;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
        public final ValueClassRepresentation O() {
            return null;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor
        public final boolean R() {
            return false;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
        public final boolean T() {
            return false;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
        public final boolean W() {
            return false;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
        public final boolean b0() {
            return false;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.ModuleAwareClassDescriptor
        public final MemberScope c0(KotlinTypeRefiner kotlinTypeRefiner) {
            Intrinsics.f(kotlinTypeRefiner, "kotlinTypeRefiner");
            return MemberScope.Empty.f44351b;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor
        public final boolean d0() {
            return false;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
        public final /* bridge */ /* synthetic */ MemberScope f0() {
            return MemberScope.Empty.f44351b;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
        public final ClassDescriptor g0() {
            return null;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotated
        public final Annotations getAnnotations() {
            return Annotations.Companion.f43614a;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
        public final ClassKind getKind() {
            return ClassKind.X;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorWithVisibility, kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor
        public final DescriptorVisibility getVisibility() {
            DescriptorVisibility PUBLIC = DescriptorVisibilities.f43564e;
            Intrinsics.e(PUBLIC, "PUBLIC");
            return PUBLIC;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor
        public final TypeConstructor h() {
            return this.j0;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
        public final Collection i() {
            return EmptySet.X;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.ClassDescriptorBase, kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor
        public final boolean isExternal() {
            return false;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
        public final boolean isInline() {
            return false;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptorWithTypeParameters
        public final List p() {
            return this.i0;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor
        public final Modality q() {
            return Modality.X;
        }

        public final String toString() {
            return "class " + getName() + " (not found)";
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
        public final Collection u() {
            return EmptyList.X;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptorWithTypeParameters
        public final boolean w() {
            return this.h0;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
        public final ClassConstructorDescriptor z() {
            return null;
        }
    }

    public NotFoundClasses(LockBasedStorageManager lockBasedStorageManager, ModuleDescriptor module) {
        Intrinsics.f(module, "module");
        this.f43578a = lockBasedStorageManager;
        this.f43579b = module;
        this.f43580c = lockBasedStorageManager.g(new Function1<FqName, PackageFragmentDescriptor>() { // from class: kotlin.reflect.jvm.internal.impl.descriptors.NotFoundClasses$packageFragments$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                FqName fqName = (FqName) obj;
                Intrinsics.f(fqName, "fqName");
                return new EmptyPackageFragmentDescriptor(this.X.f43579b, fqName);
            }
        });
        this.d = lockBasedStorageManager.g(new Function1<ClassRequest, ClassDescriptor>() { // from class: kotlin.reflect.jvm.internal.impl.descriptors.NotFoundClasses$classes$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                ClassOrPackageFragmentDescriptor classOrPackageFragmentDescriptorA;
                NotFoundClasses.ClassRequest classRequest = (NotFoundClasses.ClassRequest) obj;
                Intrinsics.f(classRequest, "<name for destructuring parameter 0>");
                ClassId classId = classRequest.f43581a;
                if (classId.f44163c) {
                    throw new UnsupportedOperationException("Unresolved local class: " + classId);
                }
                ClassId classIdF = classId.f();
                List list = classRequest.f43582b;
                NotFoundClasses notFoundClasses = this.X;
                if (classIdF == null || (classOrPackageFragmentDescriptorA = notFoundClasses.a(classIdF, CollectionsKt.r(list))) == null) {
                    MemoizedFunctionToNotNull memoizedFunctionToNotNull = notFoundClasses.f43580c;
                    FqName fqNameG = classId.g();
                    Intrinsics.e(fqNameG, "classId.packageFqName");
                    classOrPackageFragmentDescriptorA = (ClassOrPackageFragmentDescriptor) memoizedFunctionToNotNull.invoke(fqNameG);
                }
                ClassOrPackageFragmentDescriptor classOrPackageFragmentDescriptor = classOrPackageFragmentDescriptorA;
                boolean z2 = !classId.f44162b.e().d();
                LockBasedStorageManager lockBasedStorageManager2 = notFoundClasses.f43578a;
                Name nameI = classId.i();
                Intrinsics.e(nameI, "classId.shortClassName");
                Integer num = (Integer) CollectionsKt.y(list);
                return new NotFoundClasses.MockClassDescriptor(lockBasedStorageManager2, classOrPackageFragmentDescriptor, nameI, z2, num != null ? num.intValue() : 0);
            }
        });
    }

    public final ClassDescriptor a(ClassId classId, List list) {
        Intrinsics.f(classId, "classId");
        return (ClassDescriptor) this.d.invoke(new ClassRequest(classId, list));
    }
}
