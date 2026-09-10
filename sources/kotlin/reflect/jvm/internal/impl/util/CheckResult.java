package kotlin.reflect.jvm.internal.impl.util;

/* JADX INFO: loaded from: classes7.dex */
public abstract class CheckResult {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f44605a;

    public static final class IllegalFunctionName extends CheckResult {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final IllegalFunctionName f44606b = new IllegalFunctionName(false);
    }

    public static final class IllegalSignature extends CheckResult {
    }

    public static final class SuccessCheck extends CheckResult {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final SuccessCheck f44607b = new SuccessCheck(true);
    }

    public CheckResult(boolean z2) {
        this.f44605a = z2;
    }
}
