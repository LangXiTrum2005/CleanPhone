package kotlin.reflect.jvm.internal.impl.descriptors.annotations;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.name.FqName;

/* JADX INFO: loaded from: classes7.dex */
public final class FilteredAnnotations implements Annotations {
    public final Annotations X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final Function1 f43618Y;

    public FilteredAnnotations(Annotations annotations, Function1 function1) {
        this.X = annotations;
        this.f43618Y = function1;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations
    public final boolean E0(FqName fqName) {
        Intrinsics.f(fqName, "fqName");
        if (((Boolean) this.f43618Y.invoke(fqName)).booleanValue()) {
            return this.X.E0(fqName);
        }
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations
    public final AnnotationDescriptor b(FqName fqName) {
        Intrinsics.f(fqName, "fqName");
        if (((Boolean) this.f43618Y.invoke(fqName)).booleanValue()) {
            return this.X.b(fqName);
        }
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations
    public final boolean isEmpty() {
        Annotations annotations = this.X;
        if ((annotations instanceof Collection) && ((Collection) annotations).isEmpty()) {
            return false;
        }
        Iterator<AnnotationDescriptor> it = annotations.iterator();
        while (it.hasNext()) {
            FqName fqNameC = it.next().c();
            if (fqNameC != null && ((Boolean) this.f43618Y.invoke(fqNameC)).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    @Override // java.lang.Iterable
    public final Iterator<AnnotationDescriptor> iterator() {
        ArrayList arrayList = new ArrayList();
        for (AnnotationDescriptor annotationDescriptor : this.X) {
            FqName fqNameC = annotationDescriptor.c();
            if (fqNameC != null && ((Boolean) this.f43618Y.invoke(fqNameC)).booleanValue()) {
                arrayList.add(annotationDescriptor);
            }
        }
        return arrayList.iterator();
    }
}
