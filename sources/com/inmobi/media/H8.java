package com.inmobi.media;

import com.inmobi.ads.InMobiNative;
import com.inmobi.ads.controllers.PublisherCallbacks;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public abstract class H8 extends PublisherCallbacks {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private WeakReference<InMobiNative> f22862a;

    public H8(InMobiNative inMobiNative) {
        Intrinsics.f(inMobiNative, "inMobiNative");
        this.f22862a = new WeakReference<>(inMobiNative);
    }

    public final WeakReference<InMobiNative> getNativeRef() {
        return this.f22862a;
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public void onImraidLog(String log) {
        U7 mPubListener;
        Intrinsics.f(log, "log");
        InMobiNative inMobiNative = this.f22862a.get();
        if (inMobiNative == null || (mPubListener = inMobiNative.getMPubListener()) == null) {
            return;
        }
        mPubListener.a(inMobiNative, log);
    }

    public final void setNativeRef(WeakReference<InMobiNative> weakReference) {
        Intrinsics.f(weakReference, "<set-?>");
        this.f22862a = weakReference;
    }
}
