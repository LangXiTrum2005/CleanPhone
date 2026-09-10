package com.bumptech.glide.load.engine;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* JADX INFO: loaded from: classes.dex */
class ResourceRecycler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f12477a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Handler f12478b = new Handler(Looper.getMainLooper(), new ResourceRecyclerCallback());

    public static final class ResourceRecyclerCallback implements Handler.Callback {
        @Override // android.os.Handler.Callback
        public final boolean handleMessage(Message message) {
            if (message.what != 1) {
                return false;
            }
            ((Resource) message.obj).a();
            return true;
        }
    }

    public final synchronized void a(Resource resource, boolean z2) {
        try {
            if (this.f12477a || z2) {
                this.f12478b.obtainMessage(1, resource).sendToTarget();
            } else {
                this.f12477a = true;
                resource.a();
                this.f12477a = false;
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
