package androidx.core.provider;

import android.graphics.Typeface;
import android.os.Handler;
import androidx.core.content.res.ResourcesCompat;
import androidx.core.graphics.TypefaceCompat;

/* JADX INFO: loaded from: classes.dex */
class CallbackWithHandler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TypefaceCompat.ResourcesCallbackAdapter f4358a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Handler f4359b;

    public CallbackWithHandler(TypefaceCompat.ResourcesCallbackAdapter resourcesCallbackAdapter, Handler handler) {
        this.f4358a = resourcesCallbackAdapter;
        this.f4359b = handler;
    }

    public final void a(FontRequestWorker.TypefaceResult typefaceResult) {
        final int i2 = typefaceResult.f4374b;
        Handler handler = this.f4359b;
        final TypefaceCompat.ResourcesCallbackAdapter resourcesCallbackAdapter = this.f4358a;
        if (i2 != 0) {
            handler.post(new Runnable() { // from class: androidx.core.provider.CallbackWithHandler.2
                @Override // java.lang.Runnable
                public final void run() {
                    ResourcesCompat.FontCallback fontCallback = resourcesCallbackAdapter.f4305a;
                    if (fontCallback != null) {
                        fontCallback.b(i2);
                    }
                }
            });
        } else {
            final Typeface typeface = typefaceResult.f4373a;
            handler.post(new Runnable() { // from class: androidx.core.provider.CallbackWithHandler.1
                @Override // java.lang.Runnable
                public final void run() {
                    ResourcesCompat.FontCallback fontCallback = resourcesCallbackAdapter.f4305a;
                    if (fontCallback != null) {
                        fontCallback.c(typeface);
                    }
                }
            });
        }
    }
}
