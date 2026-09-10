package com.google.android.gms.internal.consent_sdk;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class n implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f23106a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f23107b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f23108c;

    public /* synthetic */ n(int i10, Object obj, Object obj2) {
        this.f23106a = i10;
        this.f23107b = obj;
        this.f23108c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zBooleanValue;
        switch (this.f23106a) {
            case 0:
                q qVar = (q) this.f23107b;
                m mVar = (m) this.f23108c;
                AtomicReference atomicReference = qVar.f23168d;
                Objects.requireNonNull(atomicReference);
                mVar.a(new g6(atomicReference, 1), new o4(22));
                return;
            default:
                t tVar = (t) this.f23107b;
                String str = (String) this.f23108c;
                synchronized (j0.class) {
                    if (j0.f23055a == null) {
                        try {
                            tVar.evaluateJavascript("(function(){})()", null);
                            j0.f23055a = Boolean.TRUE;
                        } catch (IllegalStateException unused) {
                            j0.f23055a = Boolean.FALSE;
                        }
                        zBooleanValue = j0.f23055a.booleanValue();
                        break;
                    } else {
                        zBooleanValue = j0.f23055a.booleanValue();
                        break;
                    }
                    throw th;
                }
                if (zBooleanValue) {
                    tVar.evaluateJavascript(str, null);
                    return;
                } else {
                    tVar.loadUrl("javascript:".concat(str));
                    return;
                }
        }
    }
}
