package kotlin.reflect.jvm.internal.impl.load.java;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.util.capitalizeDecapitalize.CapitalizeDecapitalizeKt;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes7.dex */
public final class JvmAbi {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final FqName f43763a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ClassId f43764b;

    static {
        FqName fqName = new FqName("kotlin.jvm.JvmField");
        f43763a = fqName;
        ClassId.j(fqName);
        ClassId.j(new FqName("kotlin.reflect.jvm.internal.ReflectionFactoryImpl"));
        f43764b = ClassId.e("kotlin/jvm/internal/RepeatableContainer", false);
    }

    public static final String a(String propertyName) {
        Intrinsics.f(propertyName, "propertyName");
        if (c(propertyName)) {
            return propertyName;
        }
        return "get" + CapitalizeDecapitalizeKt.a(propertyName);
    }

    public static final String b(String str) {
        String strA;
        StringBuilder sb = new StringBuilder("set");
        if (c(str)) {
            strA = str.substring(2);
            Intrinsics.e(strA, "this as java.lang.String).substring(startIndex)");
        } else {
            strA = CapitalizeDecapitalizeKt.a(str);
        }
        sb.append(strA);
        return sb.toString();
    }

    public static final boolean c(String name) {
        Intrinsics.f(name, "name");
        if (StringsKt.M(name, "is", false) && name.length() != 2) {
            char cCharAt = name.charAt(2);
            if (Intrinsics.h(97, cCharAt) > 0 || Intrinsics.h(cCharAt, 122) > 0) {
                return true;
            }
        }
        return false;
    }
}
