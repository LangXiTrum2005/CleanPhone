package com.google.firebase.concurrent;

import android.os.Process;
import android.os.StrictMode;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class a implements Runnable {
    public final /* synthetic */ int X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final /* synthetic */ Object f20258Y;
    public final /* synthetic */ Object Z;

    public /* synthetic */ a(int i2, Object obj, Object obj2) {
        this.X = i2;
        this.f20258Y = obj;
        this.Z = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.X) {
            case 0:
                CustomThreadFactory customThreadFactory = (CustomThreadFactory) this.f20258Y;
                Process.setThreadPriority(customThreadFactory.Z);
                StrictMode.ThreadPolicy threadPolicy = customThreadFactory.e0;
                if (threadPolicy != null) {
                    StrictMode.setThreadPolicy(threadPolicy);
                }
                ((Runnable) this.Z).run();
                break;
            default:
                Callable callable = (Callable) this.f20258Y;
                DelegatingScheduledFuture.AnonymousClass1 anonymousClass1 = (DelegatingScheduledFuture.AnonymousClass1) this.Z;
                try {
                    anonymousClass1.a(callable.call());
                } catch (Exception e2) {
                    anonymousClass1.b(e2);
                }
                break;
        }
    }
}
