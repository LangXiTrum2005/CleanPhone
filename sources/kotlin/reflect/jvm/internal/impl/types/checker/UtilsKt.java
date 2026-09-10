package kotlin.reflect.jvm.internal.impl.types.checker;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructor;

/* JADX INFO: loaded from: classes7.dex */
public final class UtilsKt {
    public static final String a(TypeConstructor typeConstructor) {
        StringBuilder sb = new StringBuilder();
        b(sb, "type: " + typeConstructor);
        b(sb, "hashCode: " + typeConstructor.hashCode());
        b(sb, "javaClass: " + typeConstructor.getClass().getCanonicalName());
        for (DeclarationDescriptor declarationDescriptorC = typeConstructor.c(); declarationDescriptorC != null; declarationDescriptorC = declarationDescriptorC.d()) {
            b(sb, "fqName: ".concat(DescriptorRenderer.f44237a.x(declarationDescriptorC)));
            b(sb, "javaClass: " + declarationDescriptorC.getClass().getCanonicalName());
        }
        String string = sb.toString();
        Intrinsics.e(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    public static final void b(StringBuilder sb, String str) {
        Intrinsics.f(str, "<this>");
        sb.append(str);
        sb.append('\n');
    }
}
