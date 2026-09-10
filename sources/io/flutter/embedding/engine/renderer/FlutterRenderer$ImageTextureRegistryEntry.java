package io.flutter.embedding.engine.renderer;

import android.media.Image;
import android.os.Build;
import android.util.Log;
import androidx.annotation.Keep;
import com.google.android.gms.internal.ads.d30;
import io.flutter.view.TextureRegistry$ImageConsumer;
import io.flutter.view.TextureRegistry$ImageTextureEntry;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
@Keep
final class FlutterRenderer$ImageTextureRegistryEntry implements TextureRegistry$ImageTextureEntry, TextureRegistry$ImageConsumer {
    private static final String TAG = "ImageTextureRegistryEntry";

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    private final long f43212id;
    private boolean ignoringFence = false;
    private Image image;
    private boolean released;
    final /* synthetic */ h this$0;

    public FlutterRenderer$ImageTextureRegistryEntry(h hVar, long j10) {
        this.this$0 = hVar;
        this.f43212id = j10;
    }

    private void maybeWaitOnFence(Image image) {
        if (image == null || this.ignoringFence) {
            return;
        }
        if (Build.VERSION.SDK_INT >= 33) {
            waitOnFence(image);
        } else {
            this.ignoringFence = true;
        }
    }

    private void waitOnFence(Image image) {
        try {
            image.getFence().awaitForever();
        } catch (IOException unused) {
        }
    }

    @Override // io.flutter.view.TextureRegistry$ImageConsumer
    public Image acquireLatestImage() {
        Image image;
        synchronized (this) {
            image = this.image;
            this.image = null;
        }
        maybeWaitOnFence(image);
        return image;
    }

    public void finalize() throws Throwable {
        try {
            if (this.released) {
                return;
            }
            Image image = this.image;
            if (image != null) {
                image.close();
                this.image = null;
            }
            this.released = true;
            h hVar = this.this$0;
            hVar.f43251e.post(new d30(this.f43212id, hVar.f43247a));
        } finally {
            super.finalize();
        }
    }

    @Override // io.flutter.view.TextureRegistry$ImageTextureEntry
    public long id() {
        return this.f43212id;
    }

    @Override // io.flutter.view.TextureRegistry$ImageTextureEntry
    public void pushImage(Image image) {
        Image image2;
        if (this.released) {
            return;
        }
        synchronized (this) {
            image2 = this.image;
            this.image = image;
        }
        if (image2 != null) {
            Log.e(TAG, "Dropping PlatformView Frame");
            image2.close();
        }
        if (image != null) {
            this.this$0.f43247a.scheduleFrame();
        }
    }

    @Override // io.flutter.view.TextureRegistry$ImageTextureEntry
    public void release() {
        if (this.released) {
            return;
        }
        this.released = true;
        Image image = this.image;
        if (image != null) {
            image.close();
            this.image = null;
        }
        h hVar = this.this$0;
        hVar.f43247a.unregisterTexture(this.f43212id);
    }
}
