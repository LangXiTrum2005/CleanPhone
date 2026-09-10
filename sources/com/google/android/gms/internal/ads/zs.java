package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public class zs extends Exception {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22702a;

    @Override // java.lang.Throwable
    public synchronized Throwable fillInStackTrace() {
        switch (this.f22702a) {
            case 5:
                synchronized (this) {
                    setStackTrace(new StackTraceElement[0]);
                }
                return this;
            default:
                return super.fillInStackTrace();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zs(int i10, String str, Throwable th2) {
        super(str, th2);
        this.f22702a = i10;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zs(String str, int i10) {
        super(str);
        this.f22702a = i10;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zs(Throwable th2) {
        super(th2);
        this.f22702a = 9;
    }
}
