package kotlin.reflect.jvm.internal.impl.load.java.lazy.types;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
public final class JavaTypeFlexibility {
    public static final JavaTypeFlexibility X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public static final JavaTypeFlexibility f43903Y;
    public static final JavaTypeFlexibility Z;
    public static final /* synthetic */ JavaTypeFlexibility[] e0;

    static {
        JavaTypeFlexibility javaTypeFlexibility = new JavaTypeFlexibility("INFLEXIBLE", 0);
        X = javaTypeFlexibility;
        JavaTypeFlexibility javaTypeFlexibility2 = new JavaTypeFlexibility("FLEXIBLE_UPPER_BOUND", 1);
        f43903Y = javaTypeFlexibility2;
        JavaTypeFlexibility javaTypeFlexibility3 = new JavaTypeFlexibility("FLEXIBLE_LOWER_BOUND", 2);
        Z = javaTypeFlexibility3;
        e0 = new JavaTypeFlexibility[]{javaTypeFlexibility, javaTypeFlexibility2, javaTypeFlexibility3};
    }

    public static JavaTypeFlexibility valueOf(String str) {
        return (JavaTypeFlexibility) Enum.valueOf(JavaTypeFlexibility.class, str);
    }

    public static JavaTypeFlexibility[] values() {
        return (JavaTypeFlexibility[]) e0.clone();
    }
}
