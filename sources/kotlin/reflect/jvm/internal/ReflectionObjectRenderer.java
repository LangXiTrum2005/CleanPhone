package kotlin.reflect.jvm.internal;

import com.thinkup.core.common.n.mo;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KParameter;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer;
import kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererImpl;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkotlin/reflect/jvm/internal/ReflectionObjectRenderer;", "", "kotlin-reflection"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class ReflectionObjectRenderer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final DescriptorRendererImpl f43418a = DescriptorRenderer.f44237a;

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        static {
            int[] iArr = new int[KParameter.Kind.values().length];
            try {
                iArr[1] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                KParameter.Kind kind = KParameter.Kind.X;
                iArr[0] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                KParameter.Kind kind2 = KParameter.Kind.X;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public static void a(StringBuilder sb, CallableMemberDescriptor callableMemberDescriptor) {
        ReceiverParameterDescriptor receiverParameterDescriptorG = UtilKt.g(callableMemberDescriptor);
        ReceiverParameterDescriptor receiverParameterDescriptorJ = callableMemberDescriptor.J();
        if (receiverParameterDescriptorG != null) {
            KotlinType type = receiverParameterDescriptorG.getType();
            Intrinsics.e(type, "receiver.type");
            sb.append(d(type));
            sb.append(mo.ono);
        }
        boolean z2 = (receiverParameterDescriptorG == null || receiverParameterDescriptorJ == null) ? false : true;
        if (z2) {
            sb.append("(");
        }
        if (receiverParameterDescriptorJ != null) {
            KotlinType type2 = receiverParameterDescriptorJ.getType();
            Intrinsics.e(type2, "receiver.type");
            sb.append(d(type2));
            sb.append(mo.ono);
        }
        if (z2) {
            sb.append(")");
        }
    }

    public static String b(FunctionDescriptor descriptor) {
        Intrinsics.f(descriptor, "descriptor");
        StringBuilder sb = new StringBuilder();
        sb.append("fun ");
        a(sb, descriptor);
        Name name = descriptor.getName();
        Intrinsics.e(name, "descriptor.name");
        sb.append(f43418a.Q(name, true));
        List listE = descriptor.e();
        Intrinsics.e(listE, "descriptor.valueParameters");
        CollectionsKt.C(listE, sb, ", ", "(", ")", ReflectionObjectRenderer$renderFunction$1$1.X, 48);
        sb.append(": ");
        KotlinType returnType = descriptor.getReturnType();
        Intrinsics.c(returnType);
        sb.append(d(returnType));
        String string = sb.toString();
        Intrinsics.e(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    public static String c(PropertyDescriptor descriptor) {
        Intrinsics.f(descriptor, "descriptor");
        StringBuilder sb = new StringBuilder();
        sb.append(descriptor.I() ? "var " : "val ");
        a(sb, descriptor);
        Name name = descriptor.getName();
        Intrinsics.e(name, "descriptor.name");
        sb.append(f43418a.Q(name, true));
        sb.append(": ");
        KotlinType type = descriptor.getType();
        Intrinsics.e(type, "descriptor.type");
        sb.append(d(type));
        String string = sb.toString();
        Intrinsics.e(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    public static String d(KotlinType type) {
        Intrinsics.f(type, "type");
        return f43418a.a0(type);
    }
}
