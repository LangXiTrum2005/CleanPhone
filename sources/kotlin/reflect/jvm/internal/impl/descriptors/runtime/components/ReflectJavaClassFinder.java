package kotlin.reflect.jvm.internal.impl.descriptors.runtime.components;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaClass;
import kotlin.reflect.jvm.internal.impl.load.java.JavaClassFinder;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes7.dex */
public final class ReflectJavaClassFinder implements JavaClassFinder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ClassLoader f43672a;

    public ReflectJavaClassFinder(ClassLoader classLoader) {
        this.f43672a = classLoader;
    }

    public final ReflectJavaClass a(JavaClassFinder.Request request) {
        ClassId classId = request.f43739a;
        FqName fqNameG = classId.g();
        Intrinsics.e(fqNameG, "classId.packageFqName");
        String strH = StringsKt.H(classId.h().b(), '.', '$');
        if (!fqNameG.d()) {
            strH = fqNameG.b() + '.' + strH;
        }
        Class clsA = ReflectJavaClassFinderKt.a(this.f43672a, strH);
        if (clsA != null) {
            return new ReflectJavaClass(clsA);
        }
        return null;
    }
}
