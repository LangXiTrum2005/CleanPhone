package com.startapp.sdk.common.advertisingid;

import android.content.Context;
import com.startapp.sdk.internal.g9;
import com.startapp.sdk.internal.l0;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes6.dex */
public final class a implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ b f40716a;

    public a(b bVar) {
        this.f40716a = bVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        b bVar;
        l0 l0VarB;
        try {
            this.f40716a.d.lock();
            try {
                b bVar2 = this.f40716a;
                AtomicReference atomicReference = bVar2.f;
                Context context = bVar2.f40717a;
                try {
                    try {
                        l0VarB = b.a(context);
                    } catch (AdvertisingIdResolver$InternalException e2) {
                        bVar2.b(e2.infoEventFlags);
                        try {
                            try {
                                l0VarB = b.b(context);
                            } catch (Throwable th) {
                                if (bVar2.a(256)) {
                                    g9.a(th);
                                }
                                l0VarB = l0.d;
                            }
                        } catch (AdvertisingIdResolver$InternalException e3) {
                            bVar2.b(e3.infoEventFlags);
                            l0VarB = l0.d;
                        }
                    }
                } catch (Throwable th2) {
                    if (bVar2.a(128)) {
                        g9.a(th2);
                    }
                    l0VarB = b.b(context);
                }
                atomicReference.set(l0VarB);
                bVar = this.f40716a;
            } catch (Throwable th3) {
                try {
                    if (this.f40716a.a(64)) {
                        g9.a(th3);
                    }
                    bVar = this.f40716a;
                } finally {
                    this.f40716a.f40721h = 2;
                    this.f40716a.f40720e.signalAll();
                    this.f40716a.d.unlock();
                }
            }
            bVar.f40721h = 2;
        } catch (Throwable th4) {
            this.f40716a.f40721h = 2;
            if (this.f40716a.a(16384)) {
                g9.a(th4);
            }
        }
    }
}
