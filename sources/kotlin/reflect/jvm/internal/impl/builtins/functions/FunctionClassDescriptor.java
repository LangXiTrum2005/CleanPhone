package kotlin.reflect.jvm.internal.impl.builtins.functions;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.collections.IntIterator;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntProgressionIterator;
import kotlin.ranges.IntRange;
import kotlin.reflect.jvm.internal.impl.builtins.BuiltInsPackageFragment;
import kotlin.reflect.jvm.internal.impl.builtins.StandardNames;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassConstructorDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibilities;
import kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility;
import kotlin.reflect.jvm.internal.impl.descriptors.FindClassInModuleKt;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.descriptors.SupertypeLoopChecker;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueClassRepresentation;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.TypeParameterDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager;
import kotlin.reflect.jvm.internal.impl.types.AbstractClassTypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import kotlin.reflect.jvm.internal.impl.types.TypeAttributes;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.TypeProjectionImpl;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;

/* JADX INFO: loaded from: classes7.dex */
public final class FunctionClassDescriptor extends AbstractClassDescriptor {
    public static final ClassId m0 = new ClassId(StandardNames.k, Name.g("Function"));
    public static final ClassId n0 = new ClassId(StandardNames.f43476h, Name.g("KFunction"));
    public final LockBasedStorageManager f0;
    public final BuiltInsPackageFragment g0;
    public final FunctionClassKind h0;
    public final int i0;
    public final FunctionTypeConstructor j0;
    public final FunctionClassScope k0;
    public final List l0;

    public static final class Companion {
    }

    public final class FunctionTypeConstructor extends AbstractClassTypeConstructor {

        public /* synthetic */ class WhenMappings {
            static {
                int[] iArr = new int[FunctionClassKind.values().length];
                try {
                    iArr[FunctionClassKind.e0.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[FunctionClassKind.g0.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[FunctionClassKind.f0.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[FunctionClassKind.h0.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
            }
        }

        public FunctionTypeConstructor() {
            super(FunctionClassDescriptor.this.f0);
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.AbstractClassTypeConstructor, kotlin.reflect.jvm.internal.impl.types.TypeConstructor
        public final ClassifierDescriptor c() {
            return FunctionClassDescriptor.this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
        public final boolean e() {
            return true;
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.AbstractTypeConstructor
        public final Collection g() {
            List listH;
            FunctionClassDescriptor functionClassDescriptor = FunctionClassDescriptor.this;
            int iOrdinal = functionClassDescriptor.h0.ordinal();
            if (iOrdinal == 0 || iOrdinal == 1) {
                listH = CollectionsKt.H(FunctionClassDescriptor.m0);
            } else {
                int i2 = functionClassDescriptor.i0;
                if (iOrdinal == 2) {
                    listH = CollectionsKt.I(FunctionClassDescriptor.n0, new ClassId(StandardNames.k, FunctionClassKind.e0.a(i2)));
                } else {
                    if (iOrdinal != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    listH = CollectionsKt.I(FunctionClassDescriptor.n0, new ClassId(StandardNames.f43475e, FunctionClassKind.f0.a(i2)));
                }
            }
            ModuleDescriptor moduleDescriptorD = functionClassDescriptor.g0.d();
            List<ClassId> list = listH;
            ArrayList arrayList = new ArrayList(CollectionsKt.n(list, 10));
            for (ClassId classId : list) {
                ClassDescriptor classDescriptorA = FindClassInModuleKt.a(moduleDescriptorD, classId);
                if (classDescriptorA == null) {
                    throw new IllegalStateException(("Built-in class " + classId + " not found").toString());
                }
                List listE0 = CollectionsKt.e0(classDescriptorA.h().getParameters().size(), functionClassDescriptor.l0);
                ArrayList arrayList2 = new ArrayList(CollectionsKt.n(listE0, 10));
                Iterator it = listE0.iterator();
                while (it.hasNext()) {
                    arrayList2.add(new TypeProjectionImpl(((TypeParameterDescriptor) it.next()).o()));
                }
                TypeAttributes.f44529Y.getClass();
                arrayList.add(KotlinTypeFactory.c(TypeAttributes.Z, classDescriptorA, arrayList2));
            }
            return CollectionsKt.i0(arrayList);
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
        public final List getParameters() {
            return FunctionClassDescriptor.this.l0;
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.AbstractTypeConstructor
        public final SupertypeLoopChecker j() {
            return SupertypeLoopChecker.EMPTY.f43593a;
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.AbstractClassTypeConstructor
        /* JADX INFO: renamed from: p */
        public final ClassDescriptor c() {
            return FunctionClassDescriptor.this;
        }

        public final String toString() {
            return FunctionClassDescriptor.this.toString();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FunctionClassDescriptor(LockBasedStorageManager lockBasedStorageManager, BuiltInsPackageFragment containingDeclaration, FunctionClassKind functionClassKind, int i2) {
        super(lockBasedStorageManager, functionClassKind.a(i2));
        Intrinsics.f(containingDeclaration, "containingDeclaration");
        this.f0 = lockBasedStorageManager;
        this.g0 = containingDeclaration;
        this.h0 = functionClassKind;
        this.i0 = i2;
        this.j0 = new FunctionTypeConstructor();
        this.k0 = new FunctionClassScope(lockBasedStorageManager, this);
        ArrayList arrayList = new ArrayList();
        IntRange intRange = new IntRange(1, i2, 1);
        ArrayList arrayList2 = new ArrayList(CollectionsKt.n(intRange, 10));
        Iterator<Integer> it = intRange.iterator();
        while (((IntProgressionIterator) it).Z) {
            int iA = ((IntIterator) it).a();
            arrayList.add(TypeParameterDescriptorImpl.J0(this, Variance.IN_VARIANCE, Name.g("P" + iA), arrayList.size(), this.f0));
            arrayList2.add(Unit.f43263a);
        }
        arrayList.add(TypeParameterDescriptorImpl.J0(this, Variance.OUT_VARIANCE, Name.g("R"), arrayList.size(), this.f0));
        this.l0 = CollectionsKt.i0(arrayList);
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
        return this.k0;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    public final DeclarationDescriptor d() {
        return this.g0;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor
    public final boolean d0() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorWithSource
    public final SourceElement f() {
        return SourceElement.f43591a;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public final /* bridge */ /* synthetic */ MemberScope f0() {
        return MemberScope.Empty.f44351b;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public final /* bridge */ /* synthetic */ ClassDescriptor g0() {
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotated
    public final Annotations getAnnotations() {
        return Annotations.Companion.f43614a;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public final ClassKind getKind() {
        return ClassKind.f43559Y;
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
    public final /* bridge */ /* synthetic */ Collection i() {
        return EmptyList.X;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor
    public final boolean isExternal() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public final boolean isInline() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptorWithTypeParameters
    public final List p() {
        return this.l0;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor
    public final Modality q() {
        return Modality.e0;
    }

    public final String toString() {
        String strB = getName().b();
        Intrinsics.e(strB, "name.asString()");
        return strB;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public final /* bridge */ /* synthetic */ Collection u() {
        return EmptyList.X;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptorWithTypeParameters
    public final boolean w() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public final /* bridge */ /* synthetic */ ClassConstructorDescriptor z() {
        return null;
    }
}
