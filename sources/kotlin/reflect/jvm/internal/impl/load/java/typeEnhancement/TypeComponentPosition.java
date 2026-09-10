package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
public final class TypeComponentPosition {
    public static final TypeComponentPosition X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public static final TypeComponentPosition f43955Y;
    public static final TypeComponentPosition Z;
    public static final /* synthetic */ TypeComponentPosition[] e0;

    static {
        TypeComponentPosition typeComponentPosition = new TypeComponentPosition("FLEXIBLE_LOWER", 0);
        X = typeComponentPosition;
        TypeComponentPosition typeComponentPosition2 = new TypeComponentPosition("FLEXIBLE_UPPER", 1);
        f43955Y = typeComponentPosition2;
        TypeComponentPosition typeComponentPosition3 = new TypeComponentPosition("INFLEXIBLE", 2);
        Z = typeComponentPosition3;
        e0 = new TypeComponentPosition[]{typeComponentPosition, typeComponentPosition2, typeComponentPosition3};
    }

    public static TypeComponentPosition valueOf(String str) {
        return (TypeComponentPosition) Enum.valueOf(TypeComponentPosition.class, str);
    }

    public static TypeComponentPosition[] values() {
        return (TypeComponentPosition[]) e0.clone();
    }
}
