package com.efs.sdk.base.core.c;

import com.efs.sdk.base.core.model.LogDto;
import com.efs.sdk.base.core.util.Log;

/* JADX INFO: loaded from: classes2.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private com.efs.sdk.base.core.c.a.a f382a;

    public abstract com.efs.sdk.base.core.c.a.a a();

    public final void a(LogDto logDto) {
        try {
            if (this.f382a == null) {
                synchronized (this) {
                    try {
                        if (this.f382a == null) {
                            com.efs.sdk.base.core.c.a.a aVarA = a();
                            this.f382a = aVarA;
                            if (aVarA == null) {
                                return;
                            }
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            this.f382a.a(logDto);
        } catch (Throwable th2) {
            Log.e("efs.processor", "log handle error", th2);
        }
    }
}
