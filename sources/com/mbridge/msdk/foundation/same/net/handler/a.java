package com.mbridge.msdk.foundation.same.net.handler;

import com.mbridge.msdk.foundation.same.net.c;
import com.mbridge.msdk.foundation.same.net.e;
import com.mbridge.msdk.foundation.tools.q0;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class a extends c<String> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f33830a = "a";

    public abstract void a(String str);

    public abstract void b(String str);

    @Override // com.mbridge.msdk.foundation.same.net.c, com.mbridge.msdk.foundation.same.net.b
    public void onError(com.mbridge.msdk.foundation.same.net.exception.a aVar) {
        q0.b(f33830a, "errorCode = " + aVar.f33812a);
        a(com.mbridge.msdk.foundation.same.net.utils.a.a(aVar));
    }

    @Override // com.mbridge.msdk.foundation.same.net.c, com.mbridge.msdk.foundation.same.net.b
    public void onSuccess(e<String> eVar) {
        if (eVar != null) {
            b(eVar.f33811c);
        }
    }
}
