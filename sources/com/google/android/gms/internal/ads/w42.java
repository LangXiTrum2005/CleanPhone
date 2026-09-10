package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class w42 extends ab {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ca1 f21413c;

    public w42(String str, ya1 ya1Var) {
        super(str, null, false, 1);
        this.f21413c = ca1.y(ya1Var);
    }

    @Override // com.google.android.gms.internal.ads.ab, java.lang.Throwable
    public final String getMessage() {
        String message = super.getMessage();
        ca1 ca1Var = this.f21413c;
        if (ca1Var.isEmpty()) {
            return message;
        }
        int length = message.length();
        String strValueOf = String.valueOf(ca1Var);
        return q4.a.j(new StringBuilder(length + 17 + strValueOf.length()), message, "\nsniff failures: ", strValueOf);
    }
}
