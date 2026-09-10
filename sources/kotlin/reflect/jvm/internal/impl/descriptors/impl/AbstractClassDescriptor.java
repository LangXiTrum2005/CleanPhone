package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import java.util.Collections;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor;
import kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.InnerClassesScopeWrapper;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.SubstitutingScope;
import kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager;
import kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitution;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor;
import kotlin.reflect.jvm.internal.impl.types.TypeUtils;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorType;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorUtils;

/* JADX INFO: loaded from: classes7.dex */
public abstract class AbstractClassDescriptor extends ModuleAwareClassDescriptor {
    public final Name X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final NotNullLazyValue f43626Y;
    public final NotNullLazyValue Z;
    public final NotNullLazyValue e0;

    public AbstractClassDescriptor(LockBasedStorageManager lockBasedStorageManager, Name name) {
        if (lockBasedStorageManager == null) {
            y0(0);
            throw null;
        }
        if (name == null) {
            y0(1);
            throw null;
        }
        this.X = name;
        this.f43626Y = lockBasedStorageManager.a(new Function0<SimpleType>() { // from class: kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractClassDescriptor.1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                AbstractClassDescriptor abstractClassDescriptor = AbstractClassDescriptor.this;
                MemberScope memberScopeQ = abstractClassDescriptor.Q();
                Function1<KotlinTypeRefiner, SimpleType> function1 = new Function1<KotlinTypeRefiner, SimpleType>() { // from class: kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractClassDescriptor.1.1
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        AbstractClassDescriptor abstractClassDescriptor2 = AbstractClassDescriptor.this;
                        ((KotlinTypeRefiner) obj).d(abstractClassDescriptor2);
                        return (SimpleType) abstractClassDescriptor2.f43626Y.invoke();
                    }
                };
                ErrorType errorType = TypeUtils.f44555a;
                return ErrorUtils.f(abstractClassDescriptor) ? ErrorUtils.c(ErrorTypeKind.UNABLE_TO_SUBSTITUTE_TYPE, abstractClassDescriptor.toString()) : TypeUtils.l(abstractClassDescriptor.h(), memberScopeQ, function1);
            }
        });
        this.Z = lockBasedStorageManager.a(new Function0<MemberScope>() { // from class: kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractClassDescriptor.2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return new InnerClassesScopeWrapper(AbstractClassDescriptor.this.Q());
            }
        });
        this.e0 = lockBasedStorageManager.a(new Function0<ReceiverParameterDescriptor>() { // from class: kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractClassDescriptor.3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return new LazyClassReceiverParameterDescriptor(AbstractClassDescriptor.this);
            }
        });
    }

    public static /* synthetic */ void y0(int i2) {
        String str = (i2 == 2 || i2 == 3 || i2 == 4 || i2 == 5 || i2 == 6 || i2 == 9 || i2 == 12 || i2 == 14 || i2 == 16 || i2 == 17 || i2 == 19 || i2 == 20) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i2 == 2 || i2 == 3 || i2 == 4 || i2 == 5 || i2 == 6 || i2 == 9 || i2 == 12 || i2 == 14 || i2 == 16 || i2 == 17 || i2 == 19 || i2 == 20) ? 2 : 3];
        switch (i2) {
            case 1:
                objArr[0] = "name";
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 9:
            case 12:
            case 14:
            case 16:
            case 17:
            case 19:
            case 20:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractClassDescriptor";
                break;
            case 7:
            case 13:
                objArr[0] = "typeArguments";
                break;
            case 8:
            case 11:
                objArr[0] = "kotlinTypeRefiner";
                break;
            case 10:
            case 15:
                objArr[0] = "typeSubstitution";
                break;
            case 18:
                objArr[0] = "substitutor";
                break;
            default:
                objArr[0] = "storageManager";
                break;
        }
        if (i2 == 2) {
            objArr[1] = "getName";
        } else if (i2 == 3) {
            objArr[1] = "getOriginal";
        } else if (i2 == 4) {
            objArr[1] = "getUnsubstitutedInnerClassesScope";
        } else if (i2 == 5) {
            objArr[1] = "getThisAsReceiverParameter";
        } else if (i2 == 6) {
            objArr[1] = "getContextReceivers";
        } else if (i2 == 9 || i2 == 12 || i2 == 14 || i2 == 16) {
            objArr[1] = "getMemberScope";
        } else if (i2 == 17) {
            objArr[1] = "getUnsubstitutedMemberScope";
        } else if (i2 == 19) {
            objArr[1] = "substitute";
        } else if (i2 != 20) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractClassDescriptor";
        } else {
            objArr[1] = "getDefaultType";
        }
        switch (i2) {
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 9:
            case 12:
            case 14:
            case 16:
            case 17:
            case 19:
            case 20:
                break;
            case 7:
            case 8:
            case 10:
            case 11:
            case 13:
            case 15:
                objArr[2] = "getMemberScope";
                break;
            case 18:
                objArr[2] = "substitute";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i2 != 2 && i2 != 3 && i2 != 4 && i2 != 5 && i2 != 6 && i2 != 9 && i2 != 12 && i2 != 14 && i2 != 16 && i2 != 17 && i2 != 19 && i2 != 20) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public final ReceiverParameterDescriptor E0() {
        ReceiverParameterDescriptor receiverParameterDescriptor = (ReceiverParameterDescriptor) this.e0.invoke();
        if (receiverParameterDescriptor != null) {
            return receiverParameterDescriptor;
        }
        y0(5);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.Substitutable
    /* JADX INFO: renamed from: F0, reason: merged with bridge method [inline-methods] */
    public ClassDescriptor b(TypeSubstitutor typeSubstitutor) {
        if (typeSubstitutor != null) {
            return typeSubstitutor.f44551a.e() ? this : new LazySubstitutingClassDescriptor(this, typeSubstitutor);
        }
        y0(18);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public MemberScope N() {
        MemberScope memberScope = (MemberScope) this.Z.invoke();
        if (memberScope != null) {
            return memberScope;
        }
        y0(4);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public MemberScope Q() {
        DescriptorUtilsKt.i(DescriptorUtils.d(this));
        MemberScope memberScopeC0 = c0(KotlinTypeRefiner.Default.f44564a);
        if (memberScopeC0 != null) {
            return memberScopeC0;
        }
        y0(17);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public List S() {
        List list = Collections.EMPTY_LIST;
        if (list != null) {
            return list;
        }
        y0(6);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.ModuleAwareClassDescriptor
    public MemberScope Z(TypeSubstitution typeSubstitution, KotlinTypeRefiner kotlinTypeRefiner) {
        if (!typeSubstitution.e()) {
            return new SubstitutingScope(c0(kotlinTypeRefiner), new TypeSubstitutor(typeSubstitution));
        }
        MemberScope memberScopeC0 = c0(kotlinTypeRefiner);
        if (memberScopeC0 != null) {
            return memberScopeC0;
        }
        y0(12);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.ModuleAwareClassDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    /* JADX INFO: renamed from: a */
    public final ClassDescriptor y0() {
        return this;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.Named
    public final Name getName() {
        Name name = this.X;
        if (name != null) {
            return name;
        }
        y0(2);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public final MemberScope j0(TypeSubstitution typeSubstitution) {
        DescriptorUtilsKt.i(DescriptorUtils.d(this));
        MemberScope memberScopeZ = Z(typeSubstitution, KotlinTypeRefiner.Default.f44564a);
        if (memberScopeZ != null) {
            return memberScopeZ;
        }
        y0(16);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor
    public final SimpleType o() {
        SimpleType simpleType = (SimpleType) this.f43626Y.invoke();
        if (simpleType != null) {
            return simpleType;
        }
        y0(20);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    public final Object v(DeclarationDescriptorVisitor declarationDescriptorVisitor, Object obj) {
        return declarationDescriptorVisitor.c(this, obj);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.ModuleAwareClassDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    /* JADX INFO: renamed from: a */
    public final ClassifierDescriptor y0() {
        return this;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.ModuleAwareClassDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    /* JADX INFO: renamed from: a */
    public final DeclarationDescriptor y0() {
        return this;
    }
}
