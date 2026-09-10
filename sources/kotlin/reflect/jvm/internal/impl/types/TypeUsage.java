package kotlin.reflect.jvm.internal.impl.types;

import com.google.android.gms.stats.CodePackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
public final class TypeUsage {
    public static final TypeUsage X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public static final TypeUsage f44554Y;
    public static final /* synthetic */ TypeUsage[] Z;

    static {
        TypeUsage typeUsage = new TypeUsage("SUPERTYPE", 0);
        X = typeUsage;
        TypeUsage typeUsage2 = new TypeUsage(CodePackage.COMMON, 1);
        f44554Y = typeUsage2;
        Z = new TypeUsage[]{typeUsage, typeUsage2};
    }

    public static TypeUsage valueOf(String str) {
        return (TypeUsage) Enum.valueOf(TypeUsage.class, str);
    }

    public static TypeUsage[] values() {
        return (TypeUsage[]) Z.clone();
    }
}
