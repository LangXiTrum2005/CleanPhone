package kotlin.reflect.jvm.internal.impl.descriptors;

import com.p004ironsource.ch;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.ServiceLoader;
import kotlin.collections.ArraysKt;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.TypeAliasConstructorDescriptor;
import kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.ReceiverValue;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.ThisClassReceiver;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.util.ModuleVisibilityHelper;

/* JADX INFO: loaded from: classes7.dex */
public class DescriptorVisibilities {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final DescriptorVisibility f43561a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final DescriptorVisibility f43562b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final DescriptorVisibility f43563c;
    public static final DescriptorVisibility d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final DescriptorVisibility f43564e;
    public static final DescriptorVisibility f;
    public static final DescriptorVisibility g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final DescriptorVisibility f43565h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final DescriptorVisibility f43566i;
    public static final Map j;
    public static final DescriptorVisibility k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final ReceiverValue f43567l;
    public static final ReceiverValue m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final ReceiverValue f43568n;
    public static final ModuleVisibilityHelper o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final HashMap f43569p;

    /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibilities$1, reason: invalid class name */
    public static class AnonymousClass1 extends DelegatedDescriptorVisibility {
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r3v12 */
        /* JADX WARN: Type inference failed for: r4v0, types: [kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorWithVisibility] */
        /* JADX WARN: Type inference failed for: r4v6, types: [kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor] */
        /* JADX WARN: Type inference failed for: r4v7, types: [kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor] */
        /* JADX WARN: Type inference failed for: r4v9, types: [kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor] */
        @Override // kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility
        public final boolean c(ReceiverValue receiverValue, DeclarationDescriptorWithVisibility declarationDescriptorWithVisibility, DeclarationDescriptor declarationDescriptor) {
            if (declarationDescriptor == null) {
                throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "from", "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$1", ch.k));
            }
            if (DescriptorUtils.s(declarationDescriptorWithVisibility) && DescriptorUtils.f(declarationDescriptor) != SourceFile.f43592a) {
                return DescriptorVisibilities.d(declarationDescriptorWithVisibility, declarationDescriptor);
            }
            if (declarationDescriptorWithVisibility instanceof ConstructorDescriptor) {
                ((ConstructorDescriptor) declarationDescriptorWithVisibility).d();
            }
            while (declarationDescriptorWithVisibility != 0) {
                declarationDescriptorWithVisibility = declarationDescriptorWithVisibility.d();
                if (((declarationDescriptorWithVisibility instanceof ClassDescriptor) && !DescriptorUtils.l(declarationDescriptorWithVisibility)) || (declarationDescriptorWithVisibility instanceof PackageFragmentDescriptor)) {
                    break;
                }
            }
            if (declarationDescriptorWithVisibility == 0) {
                return false;
            }
            while (declarationDescriptor != null) {
                if (declarationDescriptorWithVisibility == declarationDescriptor) {
                    return true;
                }
                if (declarationDescriptor instanceof PackageFragmentDescriptor) {
                    return (declarationDescriptorWithVisibility instanceof PackageFragmentDescriptor) && ((PackageFragmentDescriptor) declarationDescriptorWithVisibility).c().equals(((PackageFragmentDescriptor) declarationDescriptor).c()) && DescriptorUtils.d(declarationDescriptor).equals(DescriptorUtils.d(declarationDescriptorWithVisibility));
                }
                declarationDescriptor = declarationDescriptor.d();
            }
            return false;
        }
    }

    /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibilities$10, reason: invalid class name */
    public static class AnonymousClass10 implements ReceiverValue {
        @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.ReceiverValue
        public final KotlinType getType() {
            throw new IllegalStateException("This method should not be called");
        }
    }

    /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibilities$11, reason: invalid class name */
    public static class AnonymousClass11 implements ReceiverValue {
        @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.ReceiverValue
        public final KotlinType getType() {
            throw new IllegalStateException("This method should not be called");
        }
    }

    /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibilities$12, reason: invalid class name */
    public static class AnonymousClass12 implements ReceiverValue {
        @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.ReceiverValue
        public final KotlinType getType() {
            throw new IllegalStateException("This method should not be called");
        }
    }

    /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibilities$2, reason: invalid class name */
    public static class AnonymousClass2 extends DelegatedDescriptorVisibility {
        @Override // kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility
        public final boolean c(ReceiverValue receiverValue, DeclarationDescriptorWithVisibility declarationDescriptorWithVisibility, DeclarationDescriptor declarationDescriptor) {
            DeclarationDescriptor declarationDescriptorI;
            if (declarationDescriptor == null) {
                throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "from", "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$2", ch.k));
            }
            if (!DescriptorVisibilities.f43561a.c(receiverValue, declarationDescriptorWithVisibility, declarationDescriptor)) {
                return false;
            }
            if (receiverValue == DescriptorVisibilities.m) {
                return true;
            }
            if (receiverValue == DescriptorVisibilities.f43567l || (declarationDescriptorI = DescriptorUtils.i(declarationDescriptorWithVisibility, ClassDescriptor.class, true)) == null || !(receiverValue instanceof ThisClassReceiver)) {
                return false;
            }
            return ((ThisClassReceiver) receiverValue).r().y0().equals(declarationDescriptorI.y0());
        }
    }

    /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibilities$3, reason: invalid class name */
    public static class AnonymousClass3 extends DelegatedDescriptorVisibility {
        /* JADX WARN: Code restructure failed: missing block: B:45:0x0089, code lost:
        
            if (kotlin.reflect.jvm.internal.impl.types.DynamicTypesKt.a(r0) == false) goto L49;
         */
        @Override // kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final boolean c(kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.ReceiverValue r7, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorWithVisibility r8, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor r9) {
            /*
                r6 = this;
                r0 = 0
                r1 = 1
                if (r9 == 0) goto L9b
                java.lang.Class<kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor> r2 = kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor.class
                kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor r3 = kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils.i(r8, r2, r1)
                kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor r3 = (kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor) r3
                r4 = 0
                kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor r9 = kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils.i(r9, r2, r4)
                kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor r9 = (kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor) r9
                if (r9 != 0) goto L16
                goto L4a
            L16:
                if (r3 == 0) goto L35
                boolean r5 = kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils.l(r3)
                if (r5 == 0) goto L35
                kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor r3 = kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils.i(r3, r2, r1)
                kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor r3 = (kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor) r3
                if (r3 == 0) goto L35
                kotlin.reflect.jvm.internal.impl.types.SimpleType r5 = r9.o()
                kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor r3 = r3.y0()
                boolean r3 = kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils.r(r5, r3)
                if (r3 == 0) goto L35
                goto L8b
            L35:
                boolean r3 = r8 instanceof kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor
                if (r3 == 0) goto L41
                r3 = r8
                kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor r3 = (kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor) r3
                kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor r3 = kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils.t(r3)
                goto L42
            L41:
                r3 = r8
            L42:
                kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor r2 = kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils.i(r3, r2, r1)
                kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor r2 = (kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor) r2
                if (r2 != 0) goto L4b
            L4a:
                return r4
            L4b:
                kotlin.reflect.jvm.internal.impl.types.SimpleType r4 = r9.o()
                kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor r2 = r2.y0()
                boolean r2 = kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils.r(r4, r2)
                if (r2 == 0) goto L92
                kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.ReceiverValue r2 = kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibilities.f43568n
                if (r7 != r2) goto L5e
                goto L92
            L5e:
                boolean r2 = r3 instanceof kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor
                if (r2 != 0) goto L63
                goto L8b
            L63:
                boolean r2 = r3 instanceof kotlin.reflect.jvm.internal.impl.descriptors.ConstructorDescriptor
                if (r2 == 0) goto L68
                goto L8b
            L68:
                kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.ReceiverValue r2 = kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibilities.m
                if (r7 != r2) goto L6d
                goto L8b
            L6d:
                kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.ReceiverValue r2 = kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibilities.f43567l
                if (r7 == r2) goto L92
                if (r7 != 0) goto L74
                goto L92
            L74:
                boolean r2 = r7 instanceof kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.SuperCallReceiverValue
                if (r2 == 0) goto L8c
                r0 = r7
                kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.SuperCallReceiverValue r0 = (kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.SuperCallReceiverValue) r0
                kotlin.reflect.jvm.internal.impl.types.KotlinType r0 = r0.b()
                boolean r2 = kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils.r(r0, r9)
                if (r2 != 0) goto L8b
                boolean r0 = kotlin.reflect.jvm.internal.impl.types.DynamicTypesKt.a(r0)
                if (r0 == 0) goto L92
            L8b:
                return r1
            L8c:
                kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibilities$11 r7 = (kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibilities.AnonymousClass11) r7
                r7.getType()
                throw r0
            L92:
                kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor r9 = r9.d()
                boolean r7 = r6.c(r7, r8, r9)
                return r7
            L9b:
                r7 = 3
                java.lang.Object[] r7 = new java.lang.Object[r7]
                r8 = 1
                r9 = 0
                r0 = 2
                java.lang.String r1 = "from"
                r7[r9] = r1
                java.lang.String r9 = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$3"
                r7[r8] = r9
                java.lang.String r8 = "isVisible"
                r7[r0] = r8
                java.lang.String r8 = "Argument for @NotNull parameter '%s' of %s.%s must not be null"
                java.lang.String r7 = java.lang.String.format(r8, r7)
                java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
                r8.<init>(r7)
                throw r8
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibilities.AnonymousClass3.c(kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.ReceiverValue, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorWithVisibility, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor):boolean");
        }
    }

    /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibilities$4, reason: invalid class name */
    public static class AnonymousClass4 extends DelegatedDescriptorVisibility {
        @Override // kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility
        public final boolean c(ReceiverValue receiverValue, DeclarationDescriptorWithVisibility declarationDescriptorWithVisibility, DeclarationDescriptor declarationDescriptor) {
            if (declarationDescriptor == null) {
                throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "from", "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$4", ch.k));
            }
            if (!DescriptorUtils.d(declarationDescriptor).F(DescriptorUtils.d(declarationDescriptorWithVisibility))) {
                return false;
            }
            DescriptorVisibilities.o.a(declarationDescriptorWithVisibility, declarationDescriptor);
            return true;
        }
    }

    /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibilities$5, reason: invalid class name */
    public static class AnonymousClass5 extends DelegatedDescriptorVisibility {
        @Override // kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility
        public final boolean c(ReceiverValue receiverValue, DeclarationDescriptorWithVisibility declarationDescriptorWithVisibility, DeclarationDescriptor declarationDescriptor) {
            if (declarationDescriptor != null) {
                return true;
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "from", "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$5", ch.k));
        }
    }

    /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibilities$6, reason: invalid class name */
    public static class AnonymousClass6 extends DelegatedDescriptorVisibility {
        @Override // kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility
        public final boolean c(ReceiverValue receiverValue, DeclarationDescriptorWithVisibility declarationDescriptorWithVisibility, DeclarationDescriptor declarationDescriptor) {
            if (declarationDescriptor == null) {
                throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "from", "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$6", ch.k));
            }
            throw new IllegalStateException("This method shouldn't be invoked for LOCAL visibility");
        }
    }

    /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibilities$7, reason: invalid class name */
    public static class AnonymousClass7 extends DelegatedDescriptorVisibility {
        @Override // kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility
        public final boolean c(ReceiverValue receiverValue, DeclarationDescriptorWithVisibility declarationDescriptorWithVisibility, DeclarationDescriptor declarationDescriptor) {
            if (declarationDescriptor == null) {
                throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "from", "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$7", ch.k));
            }
            throw new IllegalStateException("Visibility is unknown yet");
        }
    }

    /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibilities$8, reason: invalid class name */
    public static class AnonymousClass8 extends DelegatedDescriptorVisibility {
        @Override // kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility
        public final boolean c(ReceiverValue receiverValue, DeclarationDescriptorWithVisibility declarationDescriptorWithVisibility, DeclarationDescriptor declarationDescriptor) {
            if (declarationDescriptor != null) {
                return false;
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "from", "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$8", ch.k));
        }
    }

    /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibilities$9, reason: invalid class name */
    public static class AnonymousClass9 extends DelegatedDescriptorVisibility {
        @Override // kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility
        public final boolean c(ReceiverValue receiverValue, DeclarationDescriptorWithVisibility declarationDescriptorWithVisibility, DeclarationDescriptor declarationDescriptor) {
            if (declarationDescriptor != null) {
                return false;
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "from", "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$9", ch.k));
        }
    }

    static {
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(Visibilities.Private.f43599c);
        f43561a = anonymousClass1;
        AnonymousClass2 anonymousClass2 = new AnonymousClass2(Visibilities.PrivateToThis.f43600c);
        f43562b = anonymousClass2;
        AnonymousClass3 anonymousClass3 = new AnonymousClass3(Visibilities.Protected.f43601c);
        f43563c = anonymousClass3;
        AnonymousClass4 anonymousClass4 = new AnonymousClass4(Visibilities.Internal.f43596c);
        d = anonymousClass4;
        AnonymousClass5 anonymousClass5 = new AnonymousClass5(Visibilities.Public.f43602c);
        f43564e = anonymousClass5;
        AnonymousClass6 anonymousClass6 = new AnonymousClass6(Visibilities.Local.f43598c);
        f = anonymousClass6;
        AnonymousClass7 anonymousClass7 = new AnonymousClass7(Visibilities.Inherited.f43595c);
        g = anonymousClass7;
        AnonymousClass8 anonymousClass8 = new AnonymousClass8(Visibilities.InvisibleFake.f43597c);
        f43565h = anonymousClass8;
        AnonymousClass9 anonymousClass9 = new AnonymousClass9(Visibilities.Unknown.f43603c);
        f43566i = anonymousClass9;
        Collections.unmodifiableSet(ArraysKt.O(new DescriptorVisibility[]{anonymousClass1, anonymousClass2, anonymousClass4, anonymousClass6}));
        HashMap map = new HashMap(6);
        map.put(anonymousClass2, 0);
        map.put(anonymousClass1, 0);
        map.put(anonymousClass4, 1);
        map.put(anonymousClass3, 1);
        map.put(anonymousClass5, 2);
        j = Collections.unmodifiableMap(map);
        k = anonymousClass5;
        f43567l = new AnonymousClass10();
        m = new AnonymousClass11();
        f43568n = new AnonymousClass12();
        Iterator it = ServiceLoader.load(ModuleVisibilityHelper.class, ModuleVisibilityHelper.class.getClassLoader()).iterator();
        o = it.hasNext() ? (ModuleVisibilityHelper) it.next() : ModuleVisibilityHelper.EMPTY.f44616a;
        f43569p = new HashMap();
        f(anonymousClass1);
        f(anonymousClass2);
        f(anonymousClass3);
        f(anonymousClass4);
        f(anonymousClass5);
        f(anonymousClass6);
        f(anonymousClass7);
        f(anonymousClass8);
        f(anonymousClass9);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x003a  */
    public static /* synthetic */ void a(int i2) {
        String str = i2 != 16 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
        Object[] objArr = new Object[i2 != 16 ? 3 : 2];
        if (i2 != 1 && i2 != 3 && i2 != 5 && i2 != 7) {
            switch (i2) {
                case 9:
                    objArr[0] = "from";
                    break;
                case 10:
                case 12:
                    objArr[0] = "first";
                    break;
                case 11:
                case 13:
                    objArr[0] = "second";
                    break;
                case 14:
                case 15:
                    objArr[0] = "visibility";
                    break;
                case 16:
                    objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities";
                    break;
                default:
                    objArr[0] = "what";
                    break;
            }
        } else {
            objArr[0] = "from";
        }
        if (i2 != 16) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities";
        } else {
            objArr[1] = "toDescriptorVisibility";
        }
        switch (i2) {
            case 2:
            case 3:
                objArr[2] = "isVisibleIgnoringReceiver";
                break;
            case 4:
            case 5:
                objArr[2] = "isVisibleWithAnyReceiver";
                break;
            case 6:
            case 7:
                objArr[2] = "inSameFile";
                break;
            case 8:
            case 9:
                objArr[2] = "findInvisibleMember";
                break;
            case 10:
            case 11:
                objArr[2] = "compareLocal";
                break;
            case 12:
            case 13:
                objArr[2] = "compare";
                break;
            case 14:
                objArr[2] = "isPrivate";
                break;
            case 15:
                objArr[2] = "toDescriptorVisibility";
                break;
            case 16:
                break;
            default:
                objArr[2] = ch.k;
                break;
        }
        String str2 = String.format(str, objArr);
        if (i2 == 16) {
            throw new IllegalStateException(str2);
        }
    }

    public static Integer b(DescriptorVisibility descriptorVisibility, DescriptorVisibility descriptorVisibility2) {
        if (descriptorVisibility == null) {
            a(12);
            throw null;
        }
        if (descriptorVisibility2 == null) {
            a(13);
            throw null;
        }
        Integer numA = descriptorVisibility.a().a(descriptorVisibility2.a());
        if (numA != null) {
            return numA;
        }
        Integer numA2 = descriptorVisibility2.a().a(descriptorVisibility.a());
        if (numA2 != null) {
            return Integer.valueOf(-numA2.intValue());
        }
        return null;
    }

    public static DeclarationDescriptorWithVisibility c(ReceiverValue receiverValue, CallableMemberDescriptor callableMemberDescriptor, DeclarationDescriptor declarationDescriptor) {
        DeclarationDescriptorWithVisibility declarationDescriptorWithVisibilityC;
        if (callableMemberDescriptor == null) {
            a(8);
            throw null;
        }
        if (declarationDescriptor == null) {
            a(9);
            throw null;
        }
        for (DeclarationDescriptorWithVisibility declarationDescriptorWithVisibility = (DeclarationDescriptorWithVisibility) callableMemberDescriptor.y0(); declarationDescriptorWithVisibility != null && declarationDescriptorWithVisibility.getVisibility() != f; declarationDescriptorWithVisibility = (DeclarationDescriptorWithVisibility) DescriptorUtils.i(declarationDescriptorWithVisibility, DeclarationDescriptorWithVisibility.class, true)) {
            if (!declarationDescriptorWithVisibility.getVisibility().c(receiverValue, declarationDescriptorWithVisibility, declarationDescriptor)) {
                return declarationDescriptorWithVisibility;
            }
        }
        if (!(callableMemberDescriptor instanceof TypeAliasConstructorDescriptor) || (declarationDescriptorWithVisibilityC = c(receiverValue, ((TypeAliasConstructorDescriptor) callableMemberDescriptor).M(), declarationDescriptor)) == null) {
            return null;
        }
        return declarationDescriptorWithVisibilityC;
    }

    public static boolean d(DeclarationDescriptorWithVisibility declarationDescriptorWithVisibility, DeclarationDescriptor declarationDescriptor) {
        if (declarationDescriptor == null) {
            a(7);
            throw null;
        }
        SourceFile sourceFileF = DescriptorUtils.f(declarationDescriptor);
        if (sourceFileF != SourceFile.f43592a) {
            return sourceFileF.equals(DescriptorUtils.f(declarationDescriptorWithVisibility));
        }
        return false;
    }

    public static boolean e(DescriptorVisibility descriptorVisibility) {
        if (descriptorVisibility != null) {
            return descriptorVisibility == f43561a || descriptorVisibility == f43562b;
        }
        a(14);
        throw null;
    }

    public static void f(DelegatedDescriptorVisibility delegatedDescriptorVisibility) {
        f43569p.put(delegatedDescriptorVisibility.f43560a, delegatedDescriptorVisibility);
    }

    public static DescriptorVisibility g(Visibility visibility) {
        if (visibility == null) {
            a(15);
            throw null;
        }
        DescriptorVisibility descriptorVisibility = (DescriptorVisibility) f43569p.get(visibility);
        if (descriptorVisibility != null) {
            return descriptorVisibility;
        }
        throw new IllegalArgumentException("Inapplicable visibility: " + visibility);
    }
}
