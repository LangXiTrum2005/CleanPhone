package com.mbridge.msdk.mbsignalcommon.mapping;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class a extends Throwable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Class<?> f34871a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f34872b;

    public a(String str) {
        super(str);
    }

    public void a(Class<?> cls) {
        this.f34871a = cls;
    }

    @Override // java.lang.Throwable
    public String toString() {
        if (getCause() == null) {
            return super.toString();
        }
        return getClass().getName() + ": " + getCause();
    }

    public a(Exception exc) {
        super(exc);
    }

    public void a(String str) {
        this.f34872b = str;
    }
}
