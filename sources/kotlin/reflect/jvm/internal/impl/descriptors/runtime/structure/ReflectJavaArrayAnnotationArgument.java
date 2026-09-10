package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaArrayAnnotationArgument;
import kotlin.reflect.jvm.internal.impl.name.Name;

/* JADX INFO: loaded from: classes7.dex */
public final class ReflectJavaArrayAnnotationArgument extends ReflectJavaAnnotationArgument implements JavaArrayAnnotationArgument {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object[] f43699b;

    public ReflectJavaArrayAnnotationArgument(Name name, Object[] objArr) {
        super(name);
        this.f43699b = objArr;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaArrayAnnotationArgument
    public final ArrayList c() {
        Object[] objArr = this.f43699b;
        ArrayList arrayList = new ArrayList(objArr.length);
        for (Object obj : objArr) {
            Intrinsics.c(obj);
            arrayList.add(ReflectJavaAnnotationArgument.Factory.a(obj, null));
        }
        return arrayList;
    }
}
