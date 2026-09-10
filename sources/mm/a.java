package mm;

import an.p;
import kotlin.jvm.internal.n;
import zl.g;
import zl.m;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class a extends km.a {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final a f46254m;

    static {
        g gVar = new g();
        ul.b.a(gVar);
        m packageFqName = ul.b.f52256a;
        n.e(packageFqName, "packageFqName");
        m constructorAnnotation = ul.b.f52258c;
        n.e(constructorAnnotation, "constructorAnnotation");
        m classAnnotation = ul.b.f52257b;
        n.e(classAnnotation, "classAnnotation");
        m functionAnnotation = ul.b.f52259d;
        n.e(functionAnnotation, "functionAnnotation");
        m propertyAnnotation = ul.b.f52260e;
        n.e(propertyAnnotation, "propertyAnnotation");
        m propertyGetterAnnotation = ul.b.f52261f;
        n.e(propertyGetterAnnotation, "propertyGetterAnnotation");
        m propertySetterAnnotation = ul.b.f52262g;
        n.e(propertySetterAnnotation, "propertySetterAnnotation");
        m enumEntryAnnotation = ul.b.f52264i;
        n.e(enumEntryAnnotation, "enumEntryAnnotation");
        m compileTimeValue = ul.b.f52263h;
        n.e(compileTimeValue, "compileTimeValue");
        m parameterAnnotation = ul.b.f52265j;
        n.e(parameterAnnotation, "parameterAnnotation");
        m typeAnnotation = ul.b.f52266k;
        n.e(typeAnnotation, "typeAnnotation");
        m typeParameterAnnotation = ul.b.l;
        n.e(typeParameterAnnotation, "typeParameterAnnotation");
        f46254m = new a(gVar, packageFqName, constructorAnnotation, classAnnotation, functionAnnotation, propertyAnnotation, propertyGetterAnnotation, propertySetterAnnotation, enumEntryAnnotation, compileTimeValue, parameterAnnotation, typeAnnotation, typeParameterAnnotation);
    }

    public static String a(yl.c fqName) {
        String strB;
        n.f(fqName, "fqName");
        StringBuilder sb2 = new StringBuilder();
        sb2.append(p.m0(fqName.b(), '.', '/'));
        sb2.append('/');
        if (fqName.d()) {
            strB = "default-package";
        } else {
            strB = fqName.f().b();
            n.e(strB, "fqName.shortName().asString()");
        }
        sb2.append(strB.concat(".kotlin_builtins"));
        return sb2.toString();
    }
}
