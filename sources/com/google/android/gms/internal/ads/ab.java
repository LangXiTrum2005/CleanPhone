package com.google.android.gms.internal.ads;

import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public class ab extends IOException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f11966a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f11967b;

    public ab(String str, Throwable th2, boolean z10, int i10) {
        super(str, th2);
        this.f11966a = z10;
        this.f11967b = i10;
    }

    public static ab a(RuntimeException runtimeException, String str) {
        return new ab(str, runtimeException, true, 1);
    }

    public static ab b(String str) {
        return new ab(str, null, false, 1);
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        String message = super.getMessage();
        String strConcat = message != null ? message.concat(" ") : "";
        int length = strConcat.length();
        boolean z10 = this.f11966a;
        int length2 = String.valueOf(z10).length() + length + 20;
        int i10 = this.f11967b;
        StringBuilder sb2 = new StringBuilder(String.valueOf(i10).length() + length2 + 11 + 1);
        sb2.append(strConcat);
        sb2.append("{contentIsMalformed=");
        sb2.append(z10);
        sb2.append(", dataType=");
        return l1.d.i(sb2, i10, "}");
    }
}
