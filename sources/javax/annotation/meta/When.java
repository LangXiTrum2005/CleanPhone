package javax.annotation.meta;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
public final class When {
    public static final When X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public static final /* synthetic */ When[] f43242Y;

    static {
        When when = new When("ALWAYS", 0);
        X = when;
        f43242Y = new When[]{when, new When("UNKNOWN", 1), new When("MAYBE", 2), new When("NEVER", 3)};
    }

    public static When valueOf(String str) {
        return (When) Enum.valueOf(When.class, str);
    }

    public static When[] values() {
        return (When[]) f43242Y.clone();
    }
}
