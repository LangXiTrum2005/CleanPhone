package io.flutter.plugin.platform;

import android.app.AlertDialog;
import android.content.Context;
import android.content.ContextWrapper;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class r extends ContextWrapper {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y f43379a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public y f43380b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Context f43381c;

    public r(Context context, y yVar, Context context2) {
        super(context);
        this.f43379a = yVar;
        this.f43381c = context2;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Object getSystemService(String str) {
        if (!"window".equals(str)) {
            return super.getSystemService(str);
        }
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        for (int i10 = 0; i10 < stackTrace.length && i10 < 11; i10++) {
            if (stackTrace[i10].getClassName().equals(AlertDialog.class.getCanonicalName()) && stackTrace[i10].getMethodName().equals("<init>")) {
                return this.f43381c.getSystemService(str);
            }
        }
        if (this.f43380b == null) {
            this.f43380b = this.f43379a;
        }
        return this.f43380b;
    }
}
