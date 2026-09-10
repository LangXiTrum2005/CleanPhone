package com.startapp.sdk.internal;

import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p f41233a;

    public m(p pVar) {
        this.f41233a = pVar;
    }

    public final void a(x2 x2Var) {
        synchronized (this.f41233a.f41333a) {
            try {
                Iterator it = this.f41233a.f41333a.values().iterator();
                while (it.hasNext()) {
                    if (it.next() == x2Var) {
                        it.remove();
                        break;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
