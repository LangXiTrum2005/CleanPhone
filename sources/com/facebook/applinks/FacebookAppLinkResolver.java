package com.facebook.applinks;

import android.net.Uri;
import com.facebook.GraphRequest;
import com.facebook.GraphResponse;
import com.facebook.bolts.AppLink;
import com.facebook.bolts.AppLinkResolver;
import com.facebook.bolts.Continuation;
import com.facebook.bolts.Task;
import com.facebook.internal.instrument.crashshield.CrashShieldHandler;
import java.util.Map;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: loaded from: classes3.dex */
public class FacebookAppLinkResolver implements AppLinkResolver {

    /* JADX INFO: renamed from: com.facebook.applinks.FacebookAppLinkResolver$1, reason: invalid class name */
    class AnonymousClass1 implements Continuation<Map<Uri, AppLink>, AppLink> {
        @Override // com.facebook.bolts.Continuation
        public final Object a(Task task) {
            ReentrantLock reentrantLock = task.f16221a;
            reentrantLock.lock();
            try {
                return (AppLink) ((Map) task.f16224e).get(null);
            } finally {
                reentrantLock.unlock();
            }
        }
    }

    /* JADX INFO: renamed from: com.facebook.applinks.FacebookAppLinkResolver$2, reason: invalid class name */
    class AnonymousClass2 implements GraphRequest.Callback {
        @Override // com.facebook.GraphRequest.Callback
        public final void a(GraphResponse graphResponse) {
            if (CrashShieldHandler.b(this)) {
                return;
            }
            try {
                if (graphResponse.d == null && graphResponse.f15952c != null) {
                    throw null;
                }
                throw null;
            } catch (Throwable th) {
                CrashShieldHandler.a(this, th);
            }
        }
    }
}
