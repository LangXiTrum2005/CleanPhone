package com.kochava.core.log.internal;

/* JADX INFO: loaded from: classes5.dex */
public final class LogItem {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f28023a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f28024b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f28025c;
    public final String d;

    public LogItem(int i2, String str, String str2, String str3) {
        this.f28023a = i2;
        this.f28024b = str;
        this.f28025c = str2;
        this.d = str3;
    }

    public final String toString() {
        StringBuilder sbX = android.support.v4.media.a.x(Logger.b(this.f28023a, false), "/KVA/");
        sbX.append(this.f28024b);
        sbX.append(": ");
        sbX.append(this.f28025c);
        sbX.append(": ");
        sbX.append(this.d);
        return sbX.toString();
    }
}
