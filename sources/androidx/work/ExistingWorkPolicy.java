package androidx.work;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class ExistingWorkPolicy {
    public static final /* synthetic */ ExistingWorkPolicy[] X = {new ExistingWorkPolicy("REPLACE", 0), new ExistingWorkPolicy("KEEP", 1), new ExistingWorkPolicy("APPEND", 2), new ExistingWorkPolicy("APPEND_OR_REPLACE", 3)};

    /* JADX INFO: Fake field, exist only in values array */
    ExistingWorkPolicy EF5;

    public static ExistingWorkPolicy valueOf(String str) {
        return (ExistingWorkPolicy) Enum.valueOf(ExistingWorkPolicy.class, str);
    }

    public static ExistingWorkPolicy[] values() {
        return (ExistingWorkPolicy[]) X.clone();
    }
}
