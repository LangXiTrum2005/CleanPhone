package kotlin.reflect.jvm.internal.impl.incremental.components;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
public final class ScopeKind {
    public static final /* synthetic */ ScopeKind[] X = {new ScopeKind("PACKAGE", 0), new ScopeKind("CLASSIFIER", 1)};

    /* JADX INFO: Fake field, exist only in values array */
    ScopeKind EF5;

    public static ScopeKind valueOf(String str) {
        return (ScopeKind) Enum.valueOf(ScopeKind.class, str);
    }

    public static ScopeKind[] values() {
        return (ScopeKind[]) X.clone();
    }
}
