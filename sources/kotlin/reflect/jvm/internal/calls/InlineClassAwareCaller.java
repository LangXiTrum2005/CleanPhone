package kotlin.reflect.jvm.internal.calls;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt;
import kotlin.reflect.jvm.internal.KotlinReflectionInternalError;
import kotlin.reflect.jvm.internal.UtilKt;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ConstructorDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.resolve.InlineClassesUtilsKt;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0000\u0018\u0000*\f\b\u0000\u0010\u0002 \u0001*\u0004\u0018\u00010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003:\u0001\u000bB%\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"Lkotlin/reflect/jvm/internal/calls/InlineClassAwareCaller;", "Ljava/lang/reflect/Member;", "M", "Lkotlin/reflect/jvm/internal/calls/Caller;", "Lkotlin/reflect/jvm/internal/impl/descriptors/CallableMemberDescriptor;", "descriptor", "caller", "", "isDefault", "<init>", "(Lorg/jetbrains/kotlin/descriptors/CallableMemberDescriptor;Lkotlin/reflect/jvm/internal/calls/Caller;Z)V", "BoxUnboxData", "kotlin-reflection"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class InlineClassAwareCaller<M extends Member> implements Caller<M> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Caller f43443a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f43444b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final BoxUnboxData f43445c;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkotlin/reflect/jvm/internal/calls/InlineClassAwareCaller$BoxUnboxData;", "", "kotlin-reflection"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class BoxUnboxData {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final IntRange f43446a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Method[] f43447b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Method f43448c;

        public BoxUnboxData(IntRange argumentRange, Method[] methodArr, Method method) {
            Intrinsics.f(argumentRange, "argumentRange");
            this.f43446a = argumentRange;
            this.f43447b = methodArr;
            this.f43448c = method;
        }
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0078  */
    public InlineClassAwareCaller(Caller caller, FunctionDescriptor descriptor, boolean z2) {
        Method declaredMethod;
        BoxUnboxData boxUnboxData;
        Class clsF;
        Intrinsics.f(descriptor, "descriptor");
        this.f43443a = caller;
        this.f43444b = z2;
        KotlinType returnType = descriptor.getReturnType();
        Intrinsics.c(returnType);
        Class clsF2 = InlineClassAwareCallerKt.f(returnType);
        if (clsF2 != null) {
            try {
                declaredMethod = clsF2.getDeclaredMethod("box-impl", InlineClassAwareCallerKt.d(clsF2, descriptor).getReturnType());
                Intrinsics.e(declaredMethod, "{\n        getDeclaredMet…riptor).returnType)\n    }");
            } catch (NoSuchMethodException unused) {
                throw new KotlinReflectionInternalError("No box method found in inline class: " + clsF2 + " (calling " + descriptor + ')');
            }
        } else {
            declaredMethod = null;
        }
        int i2 = 0;
        if (InlineClassesUtilsKt.a(descriptor)) {
            boxUnboxData = new BoxUnboxData(IntRange.e0, new Method[0], declaredMethod);
        } else {
            int i3 = -1;
            if (!(caller instanceof CallerImpl.Method.BoundStatic)) {
                if (descriptor instanceof ConstructorDescriptor) {
                    if (!(caller instanceof BoundCaller)) {
                        i3 = 0;
                    }
                } else if (descriptor.G() == null || (caller instanceof BoundCaller)) {
                    i3 = 0;
                } else {
                    DeclarationDescriptor declarationDescriptorD = descriptor.d();
                    Intrinsics.e(declarationDescriptorD, "descriptor.containingDeclaration");
                    if (InlineClassesUtilsKt.b(declarationDescriptorD)) {
                        i3 = 0;
                    } else {
                        i3 = 1;
                    }
                }
            }
            ArrayList arrayList = new ArrayList();
            ReceiverParameterDescriptor receiverParameterDescriptorJ = descriptor.J();
            KotlinType type = receiverParameterDescriptorJ != null ? receiverParameterDescriptorJ.getType() : null;
            if (type != null) {
                arrayList.add(type);
            } else if (descriptor instanceof ConstructorDescriptor) {
                ClassDescriptor classDescriptorV = ((ConstructorDescriptor) descriptor).V();
                Intrinsics.e(classDescriptorV, "descriptor.constructedClass");
                if (classDescriptorV.w()) {
                    DeclarationDescriptor declarationDescriptorD2 = classDescriptorV.d();
                    Intrinsics.d(declarationDescriptorD2, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
                    arrayList.add(((ClassDescriptor) declarationDescriptorD2).o());
                }
            } else {
                DeclarationDescriptor declarationDescriptorD3 = descriptor.d();
                Intrinsics.e(declarationDescriptorD3, "descriptor.containingDeclaration");
                if ((declarationDescriptorD3 instanceof ClassDescriptor) && InlineClassesUtilsKt.b(declarationDescriptorD3)) {
                    arrayList.add(((ClassDescriptor) declarationDescriptorD3).o());
                }
            }
            List listE = descriptor.e();
            Intrinsics.e(listE, "descriptor.valueParameters");
            Iterator it = listE.iterator();
            while (it.hasNext()) {
                arrayList.add(((ValueParameterDescriptor) it.next()).getType());
            }
            int size = arrayList.size() + i3 + (descriptor.isSuspend() ? 1 : 0) + (this.f43444b ? ((arrayList.size() + 31) / 32) + 1 : 0);
            if (CallerKt.a(this) != size) {
                throw new KotlinReflectionInternalError("Inconsistent number of parameters in the descriptor and Java reflection object: " + CallerKt.a(this) + " != " + size + "\nCalling: " + descriptor + "\nParameter types: " + this.f43443a.getD() + ")\nDefault: " + this.f43444b);
            }
            IntRange intRangeE = RangesKt.e(Math.max(i3, 0), arrayList.size() + i3);
            Method[] methodArr = new Method[size];
            while (i2 < size) {
                methodArr[i2] = (i2 > intRangeE.f43343Y || intRangeE.X > i2 || (clsF = InlineClassAwareCallerKt.f((KotlinType) arrayList.get(i2 - i3))) == null) ? null : InlineClassAwareCallerKt.d(clsF, descriptor);
                i2++;
            }
            boxUnboxData = new BoxUnboxData(intRangeE, methodArr, declaredMethod);
        }
        this.f43445c = boxUnboxData;
    }

    @Override // kotlin.reflect.jvm.internal.calls.Caller
    /* JADX INFO: renamed from: a */
    public final List getD() {
        return this.f43443a.getD();
    }

    @Override // kotlin.reflect.jvm.internal.calls.Caller
    /* JADX INFO: renamed from: b */
    public final Member getF43435a() {
        return this.f43443a.getF43435a();
    }

    @Override // kotlin.reflect.jvm.internal.calls.Caller
    public final Object call(Object[] args) throws IllegalAccessException, InvocationTargetException {
        Object objInvoke;
        Intrinsics.f(args, "args");
        BoxUnboxData boxUnboxData = this.f43445c;
        IntRange intRange = boxUnboxData.f43446a;
        Object[] objArrCopyOf = Arrays.copyOf(args, args.length);
        Intrinsics.e(objArrCopyOf, "copyOf(this, size)");
        int i2 = intRange.X;
        int i3 = intRange.f43343Y;
        if (i2 <= i3) {
            while (true) {
                Method method = boxUnboxData.f43447b[i2];
                Object objE = args[i2];
                if (method != null) {
                    if (objE != null) {
                        objE = method.invoke(objE, new Object[0]);
                    } else {
                        Class<?> returnType = method.getReturnType();
                        Intrinsics.e(returnType, "method.returnType");
                        objE = UtilKt.e(returnType);
                    }
                }
                objArrCopyOf[i2] = objE;
                if (i2 == i3) {
                    break;
                }
                i2++;
            }
        }
        Object objCall = this.f43443a.call(objArrCopyOf);
        Method method2 = boxUnboxData.f43448c;
        return (method2 == null || (objInvoke = method2.invoke(null, objCall)) == null) ? objCall : objInvoke;
    }

    @Override // kotlin.reflect.jvm.internal.calls.Caller
    /* JADX INFO: renamed from: getReturnType */
    public final Type getF43436b() {
        return this.f43443a.getF43436b();
    }
}
