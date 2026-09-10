package kotlin.reflect.jvm.internal.impl.types;

import com.p004ironsource.d9;
import java.util.Iterator;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor;
import kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer;
import kotlin.reflect.jvm.internal.impl.types.model.SimpleTypeMarker;
import kotlin.reflect.jvm.internal.impl.types.model.TypeArgumentListMarker;

/* JADX INFO: loaded from: classes7.dex */
public abstract class SimpleType extends UnwrappedType implements SimpleTypeMarker, TypeArgumentListMarker {
    @Override // kotlin.reflect.jvm.internal.impl.types.UnwrappedType
    /* JADX INFO: renamed from: O0, reason: merged with bridge method [inline-methods] */
    public abstract SimpleType L0(boolean z2);

    @Override // kotlin.reflect.jvm.internal.impl.types.UnwrappedType
    /* JADX INFO: renamed from: P0, reason: merged with bridge method [inline-methods] */
    public abstract SimpleType N0(TypeAttributes typeAttributes);

    public String toString() {
        StringBuilder sb = new StringBuilder();
        Iterator<AnnotationDescriptor> it = getAnnotations().iterator();
        while (it.hasNext()) {
            String[] strArr = {d9.i.d, DescriptorRenderer.f44239c.y(it.next(), null), "] "};
            for (int i2 = 0; i2 < 3; i2++) {
                sb.append(strArr[i2]);
            }
        }
        sb.append(H0());
        if (!F0().isEmpty()) {
            CollectionsKt.C(F0(), sb, ", ", "<", ">", null, 112);
        }
        if (I0()) {
            sb.append("?");
        }
        String string = sb.toString();
        Intrinsics.e(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }
}
