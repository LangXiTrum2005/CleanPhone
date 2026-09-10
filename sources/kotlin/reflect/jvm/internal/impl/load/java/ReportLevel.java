package kotlin.reflect.jvm.internal.impl.load.java;

/* JADX INFO: loaded from: classes7.dex */
public enum ReportLevel {
    IGNORE("ignore"),
    WARN("warn"),
    STRICT("strict");

    public final String X;

    public static final class Companion {
    }

    ReportLevel(String str) {
        this.X = str;
    }
}
