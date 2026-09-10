package com.bumptech.glide.request.target;

import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.bumptech.glide.request.Request;
import com.bumptech.glide.request.transition.Transition;

/* JADX INFO: loaded from: classes.dex */
public final class PreloadTarget<Z> extends CustomTarget<Z> {
    public static final Handler e0 = new Handler(Looper.getMainLooper(), new AnonymousClass1());

    /* JADX INFO: renamed from: com.bumptech.glide.request.target.PreloadTarget$1, reason: invalid class name */
    public class AnonymousClass1 implements Handler.Callback {
        @Override // android.os.Handler.Callback
        public final boolean handleMessage(Message message) {
            if (message.what != 1) {
                return false;
            }
            ((PreloadTarget) message.obj).getClass();
            throw null;
        }
    }

    @Override // com.bumptech.glide.request.target.Target
    public final void f(Drawable drawable) {
    }

    @Override // com.bumptech.glide.request.target.Target
    public final void g(Object obj, Transition transition) {
        Request request = this.Z;
        if (request == null || !request.e()) {
            return;
        }
        e0.obtainMessage(1, this).sendToTarget();
    }
}
