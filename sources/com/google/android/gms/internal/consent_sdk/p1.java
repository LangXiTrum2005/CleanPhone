package com.google.android.gms.internal.consent_sdk;

import android.util.Log;
import com.google.android.ump.FormError;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class p1 extends Exception {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f23161a;

    public p1(int i10, String str) {
        super(str);
        this.f23161a = i10;
    }

    public final FormError d() {
        if (getCause() == null) {
            Log.w("UserMessagingPlatform", super.getMessage());
        } else {
            Log.w("UserMessagingPlatform", super.getMessage(), getCause());
        }
        return new FormError(this.f23161a, super.getMessage());
    }

    public p1(int i10, IOException iOException, String str) {
        super(str, iOException);
        this.f23161a = i10;
    }
}
