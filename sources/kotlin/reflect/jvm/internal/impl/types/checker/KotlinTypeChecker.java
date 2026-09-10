package kotlin.reflect.jvm.internal.impl.types.checker;

import kotlin.reflect.jvm.internal.impl.types.TypeConstructor;

/* JADX INFO: loaded from: classes7.dex */
public interface KotlinTypeChecker {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final NewKotlinTypeCheckerImpl f44562a;

    public interface TypeConstructorEquality {
        boolean a(TypeConstructor typeConstructor, TypeConstructor typeConstructor2);
    }

    static {
        NewKotlinTypeChecker.f44572b.getClass();
        f44562a = NewKotlinTypeChecker.Companion.f44574b;
    }
}
