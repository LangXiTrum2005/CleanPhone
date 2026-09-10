package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorWithSource;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.descriptors.SupertypeLoopChecker;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.DescriptorEquivalenceForOverrides;
import kotlin.reflect.jvm.internal.impl.resolve.DescriptorEquivalenceForOverrides$areTypeParametersEquivalent$1;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.LazyScopeAdapter;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.TypeIntersectionScope;
import kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager;
import kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;
import kotlin.reflect.jvm.internal.impl.types.AbstractTypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.TypeAttributes;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorUtils;

/* JADX INFO: loaded from: classes7.dex */
public abstract class AbstractTypeParameterDescriptor extends DeclarationDescriptorNonRootImpl implements TypeParameterDescriptor {
    public final Variance f0;
    public final boolean g0;
    public final int h0;
    public final NotNullLazyValue i0;
    public final NotNullLazyValue j0;
    public final StorageManager k0;

    public class TypeParameterTypeConstructor extends AbstractTypeConstructor {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final SupertypeLoopChecker.EMPTY f43630c;
        public final /* synthetic */ AbstractTypeParameterDescriptor d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TypeParameterTypeConstructor(AbstractTypeParameterDescriptor abstractTypeParameterDescriptor, StorageManager storageManager, SupertypeLoopChecker.EMPTY empty) {
            super(storageManager);
            if (storageManager == null) {
                o(0);
                throw null;
            }
            this.d = abstractTypeParameterDescriptor;
            this.f43630c = empty;
        }

        public static /* synthetic */ void o(int i2) {
            String str = (i2 == 1 || i2 == 2 || i2 == 3 || i2 == 4 || i2 == 5 || i2 == 8) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
            Object[] objArr = new Object[(i2 == 1 || i2 == 2 || i2 == 3 || i2 == 4 || i2 == 5 || i2 == 8) ? 2 : 3];
            switch (i2) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 8:
                    objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractTypeParameterDescriptor$TypeParameterTypeConstructor";
                    break;
                case 6:
                    objArr[0] = "type";
                    break;
                case 7:
                    objArr[0] = "supertypes";
                    break;
                case 9:
                    objArr[0] = "classifier";
                    break;
                default:
                    objArr[0] = "storageManager";
                    break;
            }
            if (i2 == 1) {
                objArr[1] = "computeSupertypes";
            } else if (i2 == 2) {
                objArr[1] = "getParameters";
            } else if (i2 == 3) {
                objArr[1] = "getDeclarationDescriptor";
            } else if (i2 == 4) {
                objArr[1] = "getBuiltIns";
            } else if (i2 == 5) {
                objArr[1] = "getSupertypeLoopChecker";
            } else if (i2 != 8) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractTypeParameterDescriptor$TypeParameterTypeConstructor";
            } else {
                objArr[1] = "processSupertypesWithoutCycles";
            }
            switch (i2) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 8:
                    break;
                case 6:
                    objArr[2] = "reportSupertypeLoopError";
                    break;
                case 7:
                    objArr[2] = "processSupertypesWithoutCycles";
                    break;
                case 9:
                    objArr[2] = "isSameClassifier";
                    break;
                default:
                    objArr[2] = "<init>";
                    break;
            }
            String str2 = String.format(str, objArr);
            if (i2 != 1 && i2 != 2 && i2 != 3 && i2 != 4 && i2 != 5 && i2 != 8) {
                throw new IllegalArgumentException(str2);
            }
            throw new IllegalStateException(str2);
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
        public final ClassifierDescriptor c() {
            AbstractTypeParameterDescriptor abstractTypeParameterDescriptor = this.d;
            if (abstractTypeParameterDescriptor != null) {
                return abstractTypeParameterDescriptor;
            }
            o(3);
            throw null;
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
        public final boolean e() {
            return true;
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.ClassifierBasedTypeConstructor
        public final boolean f(ClassifierDescriptor classifierDescriptor) {
            if (!(classifierDescriptor instanceof TypeParameterDescriptor)) {
                return false;
            }
            AbstractTypeParameterDescriptor a2 = this.d;
            Intrinsics.f(a2, "a");
            return DescriptorEquivalenceForOverrides.f44275a.b(a2, (TypeParameterDescriptor) classifierDescriptor, true, DescriptorEquivalenceForOverrides$areTypeParametersEquivalent$1.X);
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.AbstractTypeConstructor
        public final Collection g() {
            List listH0 = this.d.H0();
            if (listH0 != null) {
                return listH0;
            }
            o(1);
            throw null;
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
        public final List getParameters() {
            List list = Collections.EMPTY_LIST;
            if (list != null) {
                return list;
            }
            o(2);
            throw null;
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.AbstractTypeConstructor
        public final KotlinType h() {
            return ErrorUtils.c(ErrorTypeKind.CYCLIC_UPPER_BOUNDS, new String[0]);
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.AbstractTypeConstructor
        public final SupertypeLoopChecker j() {
            SupertypeLoopChecker.EMPTY empty = this.f43630c;
            if (empty != null) {
                return empty;
            }
            o(5);
            throw null;
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
        public final KotlinBuiltIns k() {
            KotlinBuiltIns kotlinBuiltInsE = DescriptorUtilsKt.e(this.d);
            if (kotlinBuiltInsE != null) {
                return kotlinBuiltInsE;
            }
            o(4);
            throw null;
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.AbstractTypeConstructor
        public final List m(List list) {
            List listF0 = this.d.F0(list);
            if (listF0 != null) {
                return listF0;
            }
            o(8);
            throw null;
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.AbstractTypeConstructor
        public final void n(KotlinType kotlinType) {
            if (kotlinType != null) {
                this.d.G0(kotlinType);
            } else {
                o(6);
                throw null;
            }
        }

        public final String toString() {
            return this.d.getName().X;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public AbstractTypeParameterDescriptor(final StorageManager storageManager, DeclarationDescriptor declarationDescriptor, Annotations annotations, final Name name, Variance variance, boolean z2, int i2, final SupertypeLoopChecker.EMPTY empty) {
        SourceElement sourceElement = SourceElement.f43591a;
        if (storageManager == null) {
            Z(0);
            throw null;
        }
        if (declarationDescriptor == null) {
            Z(1);
            throw null;
        }
        if (annotations == null) {
            Z(2);
            throw null;
        }
        if (name == null) {
            Z(3);
            throw null;
        }
        if (variance == null) {
            Z(4);
            throw null;
        }
        if (empty == null) {
            Z(6);
            throw null;
        }
        super(declarationDescriptor, annotations, name, sourceElement);
        this.f0 = variance;
        this.g0 = z2;
        this.h0 = i2;
        this.i0 = storageManager.a(new Function0<TypeConstructor>() { // from class: kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractTypeParameterDescriptor.1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return new TypeParameterTypeConstructor(AbstractTypeParameterDescriptor.this, storageManager, empty);
            }
        });
        this.j0 = storageManager.a(new Function0<SimpleType>() { // from class: kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractTypeParameterDescriptor.2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                TypeAttributes.f44529Y.getClass();
                TypeAttributes typeAttributes = TypeAttributes.Z;
                TypeConstructor typeConstructorH = AbstractTypeParameterDescriptor.this.h();
                List list = Collections.EMPTY_LIST;
                Function0<MemberScope> function0 = new Function0<MemberScope>() { // from class: kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractTypeParameterDescriptor.2.1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        StringBuilder sb = new StringBuilder("Scope for type parameter ");
                        AnonymousClass2 anonymousClass2 = AnonymousClass2.this;
                        sb.append(name.b());
                        return TypeIntersectionScope.Companion.a(sb.toString(), AbstractTypeParameterDescriptor.this.getUpperBounds());
                    }
                };
                StorageManager NO_LOCKS = LockBasedStorageManager.f44473e;
                Intrinsics.e(NO_LOCKS, "NO_LOCKS");
                return KotlinTypeFactory.e(list, new LazyScopeAdapter(NO_LOCKS, function0), typeAttributes, typeConstructorH, false);
            }
        });
        this.k0 = storageManager;
    }

    public static /* synthetic */ void Z(int i2) {
        String str;
        int i3;
        switch (i2) {
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
                str = "@NotNull method %s.%s must not return null";
                break;
            case 12:
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i2) {
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
                i3 = 2;
                break;
            case 12:
            default:
                i3 = 3;
                break;
        }
        Object[] objArr = new Object[i3];
        switch (i2) {
            case 1:
                objArr[0] = "containingDeclaration";
                break;
            case 2:
                objArr[0] = "annotations";
                break;
            case 3:
                objArr[0] = "name";
                break;
            case 4:
                objArr[0] = "variance";
                break;
            case 5:
                objArr[0] = "source";
                break;
            case 6:
                objArr[0] = "supertypeLoopChecker";
                break;
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractTypeParameterDescriptor";
                break;
            case 12:
                objArr[0] = "bounds";
                break;
            default:
                objArr[0] = "storageManager";
                break;
        }
        switch (i2) {
            case 7:
                objArr[1] = "getVariance";
                break;
            case 8:
                objArr[1] = "getUpperBounds";
                break;
            case 9:
                objArr[1] = "getTypeConstructor";
                break;
            case 10:
                objArr[1] = "getDefaultType";
                break;
            case 11:
                objArr[1] = "getOriginal";
                break;
            case 12:
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractTypeParameterDescriptor";
                break;
            case 13:
                objArr[1] = "processBoundsWithoutCycles";
                break;
            case 14:
                objArr[1] = "getStorageManager";
                break;
        }
        switch (i2) {
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
                break;
            case 12:
                objArr[2] = "processBoundsWithoutCycles";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        switch (i2) {
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
                throw new IllegalStateException(str2);
            case 12:
            default:
                throw new IllegalArgumentException(str2);
        }
    }

    public List F0(List list) {
        return list;
    }

    public abstract void G0(KotlinType kotlinType);

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor
    public final StorageManager H() {
        StorageManager storageManager = this.k0;
        if (storageManager != null) {
            return storageManager;
        }
        Z(14);
        throw null;
    }

    public abstract List H0();

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor
    public final boolean L() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.DeclarationDescriptorNonRootImpl, kotlin.reflect.jvm.internal.impl.descriptors.impl.DeclarationDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    /* JADX INFO: renamed from: a */
    public final ClassifierDescriptor y0() {
        return this;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor
    public final int g() {
        return this.h0;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor
    public final List getUpperBounds() {
        List listL = ((TypeParameterTypeConstructor) h()).d();
        if (listL != null) {
            return listL;
        }
        Z(8);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor
    public final TypeConstructor h() {
        TypeConstructor typeConstructor = (TypeConstructor) this.i0.invoke();
        if (typeConstructor != null) {
            return typeConstructor;
        }
        Z(9);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor
    public final Variance j() {
        Variance variance = this.f0;
        if (variance != null) {
            return variance;
        }
        Z(7);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor
    public final SimpleType o() {
        SimpleType simpleType = (SimpleType) this.j0.invoke();
        if (simpleType != null) {
            return simpleType;
        }
        Z(10);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor
    public final boolean t() {
        return this.g0;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    public final Object v(DeclarationDescriptorVisitor declarationDescriptorVisitor, Object obj) {
        return declarationDescriptorVisitor.m(this, obj);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.DeclarationDescriptorNonRootImpl
    public final DeclarationDescriptorWithSource y0() {
        return this;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.DeclarationDescriptorNonRootImpl, kotlin.reflect.jvm.internal.impl.descriptors.impl.DeclarationDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    /* JADX INFO: renamed from: a */
    public final DeclarationDescriptor y0() {
        return this;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.DeclarationDescriptorNonRootImpl, kotlin.reflect.jvm.internal.impl.descriptors.impl.DeclarationDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    /* JADX INFO: renamed from: a */
    public final TypeParameterDescriptor y0() {
        return this;
    }
}
