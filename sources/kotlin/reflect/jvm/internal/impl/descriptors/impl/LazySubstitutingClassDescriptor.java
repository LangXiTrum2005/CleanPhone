package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassConstructorDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorNonRoot;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor;
import kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility;
import kotlin.reflect.jvm.internal.impl.descriptors.InlineClassRepresentation;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.MultiFieldValueClassRepresentation;
import kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueClassRepresentation;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.SubstitutingScope;
import kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager;
import kotlin.reflect.jvm.internal.impl.types.ClassTypeConstructorImpl;
import kotlin.reflect.jvm.internal.impl.types.DefaultTypeAttributeTranslator;
import kotlin.reflect.jvm.internal.impl.types.DescriptorSubstitutor;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitution;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor;
import kotlin.reflect.jvm.internal.impl.types.TypeUtils;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;
import kotlin.reflect.jvm.internal.impl.types.model.SimpleTypeMarker;

/* JADX INFO: loaded from: classes7.dex */
public class LazySubstitutingClassDescriptor extends ModuleAwareClassDescriptor {
    public final ModuleAwareClassDescriptor X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final TypeSubstitutor f43650Y;
    public TypeSubstitutor Z;
    public ArrayList e0;
    public ArrayList f0;
    public ClassTypeConstructorImpl g0;

    /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.descriptors.impl.LazySubstitutingClassDescriptor$1, reason: invalid class name */
    class AnonymousClass1 implements Function1<TypeParameterDescriptor, Boolean> {
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            return Boolean.valueOf(!((TypeParameterDescriptor) obj).L());
        }
    }

    public LazySubstitutingClassDescriptor(ModuleAwareClassDescriptor moduleAwareClassDescriptor, TypeSubstitutor typeSubstitutor) {
        this.X = moduleAwareClassDescriptor;
        this.f43650Y = typeSubstitutor;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0051  */
    /* JADX WARN: Code duplicated, block: B:35:0x0056  */
    /* JADX WARN: Code duplicated, block: B:36:0x005b  */
    public static /* synthetic */ void y0(int i2) {
        String str = (i2 == 2 || i2 == 3 || i2 == 5 || i2 == 6 || i2 == 8 || i2 == 10 || i2 == 13 || i2 == 23) ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
        Object[] objArr = new Object[(i2 == 2 || i2 == 3 || i2 == 5 || i2 == 6 || i2 == 8 || i2 == 10 || i2 == 13 || i2 == 23) ? 3 : 2];
        if (i2 == 2) {
            objArr[0] = "typeArguments";
        } else if (i2 == 3) {
            objArr[0] = "kotlinTypeRefiner";
        } else if (i2 == 5) {
            objArr[0] = "typeSubstitution";
        } else if (i2 == 6) {
            objArr[0] = "kotlinTypeRefiner";
        } else if (i2 == 8) {
            objArr[0] = "typeArguments";
        } else if (i2 == 10) {
            objArr[0] = "typeSubstitution";
        } else if (i2 == 13) {
            objArr[0] = "kotlinTypeRefiner";
        } else if (i2 != 23) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/LazySubstitutingClassDescriptor";
        } else {
            objArr[0] = "substitutor";
        }
        switch (i2) {
            case 2:
            case 3:
            case 5:
            case 6:
            case 8:
            case 10:
            case 13:
            case 23:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/LazySubstitutingClassDescriptor";
                break;
            case 4:
            case 7:
            case 9:
            case 11:
                objArr[1] = "getMemberScope";
                break;
            case 12:
            case 14:
                objArr[1] = "getUnsubstitutedMemberScope";
                break;
            case 15:
                objArr[1] = "getStaticScope";
                break;
            case 16:
                objArr[1] = "getDefaultType";
                break;
            case 17:
                objArr[1] = "getContextReceivers";
                break;
            case 18:
                objArr[1] = "getConstructors";
                break;
            case 19:
                objArr[1] = "getAnnotations";
                break;
            case 20:
                objArr[1] = "getName";
                break;
            case 21:
                objArr[1] = "getOriginal";
                break;
            case 22:
                objArr[1] = "getContainingDeclaration";
                break;
            case 24:
                objArr[1] = "substitute";
                break;
            case 25:
                objArr[1] = "getKind";
                break;
            case 26:
                objArr[1] = "getModality";
                break;
            case 27:
                objArr[1] = "getVisibility";
                break;
            case 28:
                objArr[1] = "getUnsubstitutedInnerClassesScope";
                break;
            case 29:
                objArr[1] = "getSource";
                break;
            case 30:
                objArr[1] = "getDeclaredTypeParameters";
                break;
            case 31:
                objArr[1] = "getSealedSubclasses";
                break;
            default:
                objArr[1] = "getTypeConstructor";
                break;
        }
        if (i2 == 2 || i2 == 3 || i2 == 5 || i2 == 6 || i2 == 8 || i2 == 10) {
            objArr[2] = "getMemberScope";
        } else if (i2 == 13) {
            objArr[2] = "getUnsubstitutedMemberScope";
        } else if (i2 == 23) {
            objArr[2] = "substitute";
        }
        String str2 = String.format(str, objArr);
        if (i2 != 2 && i2 != 3 && i2 != 5 && i2 != 6 && i2 != 8 && i2 != 10 && i2 != 13 && i2 != 23) {
            throw new IllegalStateException(str2);
        }
        throw new IllegalArgumentException(str2);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public final boolean D0() {
        return this.X.D0();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public final ReceiverParameterDescriptor E0() {
        throw new UnsupportedOperationException();
    }

    public final TypeSubstitutor F0() {
        if (this.Z == null) {
            TypeSubstitutor typeSubstitutor = this.f43650Y;
            if (typeSubstitutor.f44551a.e()) {
                this.Z = typeSubstitutor;
            } else {
                List parameters = this.X.h().getParameters();
                this.e0 = new ArrayList(parameters.size());
                this.Z = DescriptorSubstitutor.b(parameters, typeSubstitutor.f(), this, this.e0);
                this.f0 = CollectionsKt.t(this.e0, new AnonymousClass1());
            }
        }
        return this.Z;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public final MemberScope N() {
        MemberScope memberScopeN = this.X.N();
        if (memberScopeN != null) {
            return memberScopeN;
        }
        y0(28);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public final ValueClassRepresentation O() {
        ValueClassRepresentation valueClassRepresentationO = this.X.O();
        if (valueClassRepresentationO == null) {
            return null;
        }
        Function1<SimpleType, SimpleType> function1 = new Function1<SimpleType, SimpleType>() { // from class: kotlin.reflect.jvm.internal.impl.descriptors.impl.LazySubstitutingClassDescriptor.2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                SimpleType simpleType = (SimpleType) obj;
                LazySubstitutingClassDescriptor lazySubstitutingClassDescriptor = LazySubstitutingClassDescriptor.this;
                if (simpleType != null) {
                    return lazySubstitutingClassDescriptor.f43650Y.f44551a.e() ? simpleType : (SimpleType) lazySubstitutingClassDescriptor.F0().i(simpleType, Variance.INVARIANT);
                }
                lazySubstitutingClassDescriptor.getClass();
                return simpleType;
            }
        };
        if (valueClassRepresentationO instanceof InlineClassRepresentation) {
            InlineClassRepresentation inlineClassRepresentation = (InlineClassRepresentation) valueClassRepresentationO;
            return new InlineClassRepresentation(inlineClassRepresentation.f43571a, (SimpleTypeMarker) function1.invoke(inlineClassRepresentation.f43572b));
        }
        if (!(valueClassRepresentationO instanceof MultiFieldValueClassRepresentation)) {
            throw new NoWhenBranchMatchedException();
        }
        ArrayList<Pair> arrayList = ((MultiFieldValueClassRepresentation) valueClassRepresentationO).f43576a;
        ArrayList arrayList2 = new ArrayList(CollectionsKt.n(arrayList, 10));
        for (Pair pair : arrayList) {
            arrayList2.add(new Pair((Name) pair.X, function1.invoke((SimpleTypeMarker) pair.f43249Y)));
        }
        return new MultiFieldValueClassRepresentation(arrayList2);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public final MemberScope Q() {
        DescriptorUtilsKt.i(DescriptorUtils.d(this.X));
        return c0(KotlinTypeRefiner.Default.f44564a);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor
    public final boolean R() {
        return this.X.R();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public final List S() {
        List list = Collections.EMPTY_LIST;
        if (list != null) {
            return list;
        }
        y0(17);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public final boolean T() {
        return this.X.T();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public final boolean W() {
        return this.X.W();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.ModuleAwareClassDescriptor
    public final MemberScope Z(TypeSubstitution typeSubstitution, KotlinTypeRefiner kotlinTypeRefiner) {
        MemberScope memberScopeZ = this.X.Z(typeSubstitution, kotlinTypeRefiner);
        if (!this.f43650Y.f44551a.e()) {
            return new SubstitutingScope(memberScopeZ, F0());
        }
        if (memberScopeZ != null) {
            return memberScopeZ;
        }
        y0(7);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.Substitutable
    public final DeclarationDescriptorNonRoot b(TypeSubstitutor typeSubstitutor) {
        if (typeSubstitutor != null) {
            return typeSubstitutor.f44551a.e() ? this : new LazySubstitutingClassDescriptor(this, TypeSubstitutor.e(typeSubstitutor.f(), F0().f()));
        }
        y0(23);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public final boolean b0() {
        return this.X.b0();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.ModuleAwareClassDescriptor
    public final MemberScope c0(KotlinTypeRefiner kotlinTypeRefiner) {
        if (kotlinTypeRefiner == null) {
            y0(13);
            throw null;
        }
        MemberScope memberScopeC0 = this.X.c0(kotlinTypeRefiner);
        if (!this.f43650Y.f44551a.e()) {
            return new SubstitutingScope(memberScopeC0, F0());
        }
        if (memberScopeC0 != null) {
            return memberScopeC0;
        }
        y0(14);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    public final DeclarationDescriptor d() {
        DeclarationDescriptor declarationDescriptorD = this.X.d();
        if (declarationDescriptorD != null) {
            return declarationDescriptorD;
        }
        y0(22);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor
    public final boolean d0() {
        return this.X.d0();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorWithSource
    public final SourceElement f() {
        return SourceElement.f43591a;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public final MemberScope f0() {
        MemberScope memberScopeF0 = this.X.f0();
        if (memberScopeF0 != null) {
            return memberScopeF0;
        }
        y0(15);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public final ClassDescriptor g0() {
        return this.X.g0();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotated
    public final Annotations getAnnotations() {
        Annotations annotations = this.X.getAnnotations();
        if (annotations != null) {
            return annotations;
        }
        y0(19);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public final ClassKind getKind() {
        ClassKind kind = this.X.getKind();
        if (kind != null) {
            return kind;
        }
        y0(25);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.Named
    public final Name getName() {
        Name name = this.X.getName();
        if (name != null) {
            return name;
        }
        y0(20);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorWithVisibility, kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor
    public final DescriptorVisibility getVisibility() {
        DescriptorVisibility visibility = this.X.getVisibility();
        if (visibility != null) {
            return visibility;
        }
        y0(27);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor
    public final TypeConstructor h() {
        TypeConstructor typeConstructorH = this.X.h();
        if (this.f43650Y.f44551a.e()) {
            if (typeConstructorH != null) {
                return typeConstructorH;
            }
            y0(0);
            throw null;
        }
        if (this.g0 == null) {
            TypeSubstitutor typeSubstitutorF0 = F0();
            Collection collectionD = typeConstructorH.d();
            ArrayList arrayList = new ArrayList(collectionD.size());
            Iterator it = collectionD.iterator();
            while (it.hasNext()) {
                arrayList.add(typeSubstitutorF0.i((KotlinType) it.next(), Variance.INVARIANT));
            }
            this.g0 = new ClassTypeConstructorImpl(this, this.e0, arrayList, (LockBasedStorageManager) LockBasedStorageManager.f44473e);
        }
        ClassTypeConstructorImpl classTypeConstructorImpl = this.g0;
        if (classTypeConstructorImpl != null) {
            return classTypeConstructorImpl;
        }
        y0(1);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public final Collection i() {
        Collection<ClassConstructorDescriptor> collectionI = this.X.i();
        ArrayList arrayList = new ArrayList(collectionI.size());
        for (ClassConstructorDescriptor classConstructorDescriptor : collectionI) {
            arrayList.add(((ClassConstructorDescriptor) classConstructorDescriptor.A0().k(classConstructorDescriptor.y0()).l(classConstructorDescriptor.q()).f(classConstructorDescriptor.getVisibility()).p(classConstructorDescriptor.getKind()).d().build()).b(F0()));
        }
        return arrayList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor
    public final boolean isExternal() {
        return this.X.isExternal();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public final boolean isInline() {
        return this.X.isInline();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public final MemberScope j0(TypeSubstitution typeSubstitution) {
        DescriptorUtilsKt.i(DescriptorUtils.d(this));
        return Z(typeSubstitution, KotlinTypeRefiner.Default.f44564a);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor
    public final SimpleType o() {
        return KotlinTypeFactory.e(TypeUtils.d(h().getParameters()), Q(), DefaultTypeAttributeTranslator.f44500a.a(getAnnotations()), h(), false);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptorWithTypeParameters
    public final List p() {
        F0();
        ArrayList arrayList = this.f0;
        if (arrayList != null) {
            return arrayList;
        }
        y0(30);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor
    public final Modality q() {
        Modality modalityQ = this.X.q();
        if (modalityQ != null) {
            return modalityQ;
        }
        y0(26);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public final Collection u() {
        Collection collectionU = this.X.u();
        if (collectionU != null) {
            return collectionU;
        }
        y0(31);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    public final Object v(DeclarationDescriptorVisitor declarationDescriptorVisitor, Object obj) {
        return declarationDescriptorVisitor.c(this, obj);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptorWithTypeParameters
    public final boolean w() {
        return this.X.w();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public final ClassConstructorDescriptor z() {
        return this.X.z();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.ModuleAwareClassDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    /* JADX INFO: renamed from: a */
    public final ClassDescriptor y0() {
        ClassDescriptor classDescriptorY0 = this.X.y0();
        if (classDescriptorY0 != null) {
            return classDescriptorY0;
        }
        y0(21);
        throw null;
    }
}
