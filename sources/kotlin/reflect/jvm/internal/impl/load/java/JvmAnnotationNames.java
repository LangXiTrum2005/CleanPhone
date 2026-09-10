package kotlin.reflect.jvm.internal.impl.load.java;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmClassName;

/* JADX INFO: loaded from: classes7.dex */
public final class JvmAnnotationNames {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final FqName f43765a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Name f43766b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final FqName f43767c;
    public static final FqName d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final FqName f43768e;
    public static final FqName f;
    public static final FqName g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final FqName f43769h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final FqName f43770i;
    public static final FqName j;
    public static final FqName k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final FqName f43771l;
    public static final FqName m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final FqName f43772n;
    public static final FqName o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final FqName f43773p;
    public static final FqName q;

    static {
        FqName fqName = new FqName("kotlin.Metadata");
        f43765a = fqName;
        JvmClassName.c(fqName).e();
        f43766b = Name.g("value");
        f43767c = new FqName(Target.class.getName());
        new FqName(ElementType.class.getName());
        d = new FqName(Retention.class.getName());
        new FqName(RetentionPolicy.class.getName());
        f43768e = new FqName(Deprecated.class.getName());
        f = new FqName(Documented.class.getName());
        g = new FqName("java.lang.annotation.Repeatable");
        f43769h = new FqName("org.jetbrains.annotations.NotNull");
        f43770i = new FqName("org.jetbrains.annotations.Nullable");
        j = new FqName("org.jetbrains.annotations.Mutable");
        k = new FqName("org.jetbrains.annotations.ReadOnly");
        f43771l = new FqName("kotlin.annotations.jvm.ReadOnly");
        m = new FqName("kotlin.annotations.jvm.Mutable");
        f43772n = new FqName("kotlin.jvm.PurelyImplements");
        new FqName("kotlin.jvm.internal");
        FqName fqName2 = new FqName("kotlin.jvm.internal.SerializedIr");
        o = fqName2;
        JvmClassName.c(fqName2).e();
        f43773p = new FqName("kotlin.jvm.internal.EnhancedNullability");
        q = new FqName("kotlin.jvm.internal.EnhancedMutability");
    }
}
