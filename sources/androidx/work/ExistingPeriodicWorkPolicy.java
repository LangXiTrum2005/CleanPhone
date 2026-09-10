package androidx.work;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class ExistingPeriodicWorkPolicy {
    public static final /* synthetic */ ExistingPeriodicWorkPolicy[] X = {new ExistingPeriodicWorkPolicy("REPLACE", 0), new ExistingPeriodicWorkPolicy("KEEP", 1)};

    /* JADX INFO: Fake field, exist only in values array */
    ExistingPeriodicWorkPolicy EF5;

    public static ExistingPeriodicWorkPolicy valueOf(String str) {
        return (ExistingPeriodicWorkPolicy) Enum.valueOf(ExistingPeriodicWorkPolicy.class, str);
    }

    public static ExistingPeriodicWorkPolicy[] values() {
        return (ExistingPeriodicWorkPolicy[]) X.clone();
    }
}
