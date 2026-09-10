package com.google.firebase.crashlytics.internal.stacktrace;

/* JADX INFO: loaded from: classes4.dex */
public class TrimmedThrowableData {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f20771a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f20772b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final StackTraceElement[] f20773c;
    public final TrimmedThrowableData d;

    public TrimmedThrowableData(String str, String str2, StackTraceElement[] stackTraceElementArr, TrimmedThrowableData trimmedThrowableData) {
        this.f20771a = str;
        this.f20772b = str2;
        this.f20773c = stackTraceElementArr;
        this.d = trimmedThrowableData;
    }
}
