package com.facebook.bolts;

import com.facebook.internal.instrument.crashshield.CrashShieldHandler;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "TResult", "run"}, k = 3, mv = {1, 5, 1})
final class Task$Companion$delay$scheduled$1 implements Runnable {
    @Override // java.lang.Runnable
    public final void run() {
        if (CrashShieldHandler.b(this)) {
            return;
        }
        try {
            throw null;
        } catch (Throwable th) {
            CrashShieldHandler.a(this, th);
        }
    }
}
