package com.google.firebase.crashlytics.internal.stacktrace;

/* JADX INFO: loaded from: classes4.dex */
public class MiddleOutFallbackStrategy implements StackTraceTrimmingStrategy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final StackTraceTrimmingStrategy[] f20769a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final MiddleOutStrategy f20770b = new MiddleOutStrategy();

    public MiddleOutFallbackStrategy(StackTraceTrimmingStrategy... stackTraceTrimmingStrategyArr) {
        this.f20769a = stackTraceTrimmingStrategyArr;
    }

    @Override // com.google.firebase.crashlytics.internal.stacktrace.StackTraceTrimmingStrategy
    public final StackTraceElement[] a(StackTraceElement[] stackTraceElementArr) {
        if (stackTraceElementArr.length <= 1024) {
            return stackTraceElementArr;
        }
        StackTraceElement[] stackTraceElementArrA = stackTraceElementArr;
        for (StackTraceTrimmingStrategy stackTraceTrimmingStrategy : this.f20769a) {
            if (stackTraceElementArrA.length <= 1024) {
                break;
            }
            stackTraceElementArrA = stackTraceTrimmingStrategy.a(stackTraceElementArr);
        }
        return stackTraceElementArrA.length > 1024 ? this.f20770b.a(stackTraceElementArrA) : stackTraceElementArrA;
    }
}
