package io.flutter.embedding.engine.renderer;

import android.media.Image;
import android.media.ImageReader;
import android.os.Build;
import android.view.Surface;
import androidx.annotation.Keep;
import com.google.android.gms.internal.ads.d30;
import io.flutter.view.TextureRegistry$ImageConsumer;
import io.flutter.view.TextureRegistry$SurfaceProducer;
import io.flutter.view.n;
import io.flutter.view.o;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
@Keep
final class FlutterRenderer$ImageReaderSurfaceProducer implements TextureRegistry$SurfaceProducer, TextureRegistry$ImageConsumer, n {
    private static final boolean CLEANUP_ON_MEMORY_PRESSURE = true;
    private static final int MAX_DEQUEUED_IMAGES = 2;
    private static final int MAX_IMAGES = 7;
    private static final String TAG = "ImageReaderSurfaceProducer";
    private static final boolean VERBOSE_LOGS = false;
    private static final boolean trimOnMemoryPressure = true;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    private final long f43211id;
    private boolean released;
    final /* synthetic */ h this$0;
    private boolean ignoringFence = false;
    private int requestedWidth = 1;
    private int requestedHeight = 1;
    private boolean createNewReader = true;
    boolean notifiedDestroy = false;
    private long lastDequeueTime = 0;
    private long lastQueueTime = 0;
    private long lastScheduleTime = 0;
    private int numTrims = 0;
    private final Object lock = new Object();
    private final ArrayDeque<f> imageReaderQueue = new ArrayDeque<>();
    private final HashMap<ImageReader, f> perImageReaders = new HashMap<>();
    private ArrayList<d> lastDequeuedImage = new ArrayList<>();
    private f lastReaderDequeuedFrom = null;
    o callback = null;

    public FlutterRenderer$ImageReaderSurfaceProducer(h hVar, long j10) {
        this.this$0 = hVar;
        this.f43211id = j10;
    }

    private void cleanup() {
        synchronized (this.lock) {
            try {
                for (f fVar : this.perImageReaders.values()) {
                    if (this.lastReaderDequeuedFrom == fVar) {
                        this.lastReaderDequeuedFrom = null;
                    }
                    fVar.f43224c = true;
                    fVar.f43222a.close();
                    fVar.f43223b.clear();
                }
                this.perImageReaders.clear();
                if (this.lastDequeuedImage.size() > 0) {
                    Iterator<d> it = this.lastDequeuedImage.iterator();
                    while (it.hasNext()) {
                        it.next().f43219a.close();
                    }
                    this.lastDequeuedImage.clear();
                }
                f fVar2 = this.lastReaderDequeuedFrom;
                if (fVar2 != null) {
                    fVar2.f43224c = true;
                    fVar2.f43222a.close();
                    fVar2.f43223b.clear();
                    this.lastReaderDequeuedFrom = null;
                }
                this.imageReaderQueue.clear();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private ImageReader createImageReader29() {
        return ImageReader.newInstance(this.requestedWidth, this.requestedHeight, 34, 7, 256L);
    }

    private ImageReader createImageReader33() {
        ImageReader.Builder builder = new ImageReader.Builder(this.requestedWidth, this.requestedHeight);
        builder.setMaxImages(7);
        builder.setImageFormat(34);
        builder.setUsage(256L);
        return builder.build();
    }

    private f getActiveReader() {
        synchronized (this.lock) {
            try {
                if (!this.createNewReader) {
                    f fVarPeekLast = this.imageReaderQueue.peekLast();
                    if (fVarPeekLast.f43222a.getSurface().isValid()) {
                        return fVarPeekLast;
                    }
                }
                this.createNewReader = false;
                return getOrCreatePerImageReader(createImageReader());
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private f getOrCreatePerImageReader(ImageReader imageReader) {
        f fVar = this.perImageReaders.get(imageReader);
        if (fVar != null) {
            return fVar;
        }
        f fVarCreatePerImageReader = createPerImageReader(imageReader);
        this.perImageReaders.put(imageReader, fVarCreatePerImageReader);
        this.imageReaderQueue.add(fVarCreatePerImageReader);
        return fVarCreatePerImageReader;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lambda$dequeueImage$0() {
        if (this.released) {
            return;
        }
        this.this$0.f43247a.scheduleFrame();
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

    private void releaseInternal() {
        cleanup();
        this.released = true;
        HashSet<WeakReference> hashSet = this.this$0.f43252f;
        for (WeakReference weakReference : hashSet) {
            if (weakReference.get() == this) {
                hashSet.remove(weakReference);
                break;
            }
        }
        this.this$0.f43253g.remove(this);
    }

    private void waitOnFence(Image image) {
        try {
            image.getFence().awaitForever();
        } catch (IOException unused) {
        }
    }

    @Override // io.flutter.view.TextureRegistry$ImageConsumer
    public Image acquireLatestImage() {
        d dVarDequeueImage = dequeueImage();
        if (dVarDequeueImage == null) {
            return null;
        }
        Image image = dVarDequeueImage.f43219a;
        maybeWaitOnFence(image);
        return image;
    }

    public ImageReader createImageReader() {
        return Build.VERSION.SDK_INT >= 33 ? createImageReader33() : createImageReader29();
    }

    public f createPerImageReader(ImageReader imageReader) {
        return new f(this, imageReader);
    }

    public double deltaMillis(long j10) {
        return j10 / 1000000.0d;
    }

    public d dequeueImage() {
        d dVar;
        boolean z10;
        synchronized (this.lock) {
            try {
                Iterator<f> it = this.imageReaderQueue.iterator();
                dVar = null;
                while (true) {
                    z10 = false;
                    if (!it.hasNext()) {
                        break;
                    }
                    f next = it.next();
                    ArrayDeque arrayDeque = next.f43223b;
                    d dVar2 = arrayDeque.isEmpty() ? null : (d) arrayDeque.removeFirst();
                    if (dVar2 != null) {
                        while (this.lastDequeuedImage.size() > 2) {
                            this.lastDequeuedImage.remove(0).f43219a.close();
                        }
                        this.lastDequeuedImage.add(dVar2);
                        this.lastReaderDequeuedFrom = next;
                        dVar = dVar2;
                        break;
                    }
                    dVar = dVar2;
                }
                pruneImageReaderQueue();
                Iterator<f> it2 = this.imageReaderQueue.iterator();
                while (it2.hasNext()) {
                    if (!it2.next().f43223b.isEmpty()) {
                        z10 = true;
                        break;
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (z10) {
            this.this$0.f43251e.post(new Runnable() { // from class: io.flutter.embedding.engine.renderer.c
                @Override // java.lang.Runnable
                public final void run() {
                    this.f43218a.lambda$dequeueImage$0();
                }
            });
        }
        return dVar;
    }

    public void disableFenceForTest() {
        this.ignoringFence = true;
    }

    public void finalize() throws Throwable {
        try {
            if (this.released) {
                return;
            }
            releaseInternal();
            h hVar = this.this$0;
            hVar.f43251e.post(new d30(this.f43211id, hVar.f43247a));
        } finally {
            super.finalize();
        }
    }

    @Override // io.flutter.view.TextureRegistry$SurfaceProducer
    public Surface getForcedNewSurface() {
        this.createNewReader = true;
        return getSurface();
    }

    @Override // io.flutter.view.TextureRegistry$SurfaceProducer
    public int getHeight() {
        return this.requestedHeight;
    }

    @Override // io.flutter.view.TextureRegistry$SurfaceProducer
    public Surface getSurface() {
        return getActiveReader().f43222a.getSurface();
    }

    @Override // io.flutter.view.TextureRegistry$SurfaceProducer
    public int getWidth() {
        return this.requestedWidth;
    }

    @Override // io.flutter.view.TextureRegistry$SurfaceProducer
    public boolean handlesCropAndRotation() {
        return false;
    }

    @Override // io.flutter.view.TextureRegistry$SurfaceProducer
    public long id() {
        return this.f43211id;
    }

    public int numImageReaders() {
        int size;
        synchronized (this.lock) {
            size = this.imageReaderQueue.size();
        }
        return size;
    }

    public int numImages() {
        int size;
        synchronized (this.lock) {
            try {
                Iterator<f> it = this.imageReaderQueue.iterator();
                size = 0;
                while (it.hasNext()) {
                    size += it.next().f43223b.size();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return size;
    }

    public int numTrims() {
        int i10;
        synchronized (this.lock) {
            i10 = this.numTrims;
        }
        return i10;
    }

    public void onImage(ImageReader imageReader, Image image) {
        d dVar;
        synchronized (this.lock) {
            f orCreatePerImageReader = getOrCreatePerImageReader(imageReader);
            ArrayDeque arrayDeque = orCreatePerImageReader.f43223b;
            if (orCreatePerImageReader.f43224c) {
                dVar = null;
            } else {
                FlutterRenderer$ImageReaderSurfaceProducer flutterRenderer$ImageReaderSurfaceProducer = orCreatePerImageReader.f43225d;
                System.nanoTime();
                d dVar2 = new d(flutterRenderer$ImageReaderSurfaceProducer, image);
                arrayDeque.add(dVar2);
                while (arrayDeque.size() > 2) {
                    ((d) arrayDeque.removeFirst()).f43219a.close();
                }
                dVar = dVar2;
            }
        }
        if (dVar == null) {
            return;
        }
        this.this$0.f43247a.scheduleFrame();
    }

    @Override // io.flutter.view.n
    public void onTrimMemory(int i10) {
        if (i10 < 40) {
            return;
        }
        synchronized (this.lock) {
            this.numTrims++;
        }
        o oVar = this.callback;
        if (oVar != null) {
            this.notifiedDestroy = true;
            oVar.a();
        }
        cleanup();
        this.createNewReader = true;
    }

    public int pendingDequeuedImages() {
        return this.lastDequeuedImage.size();
    }

    public void pruneImageReaderQueue() {
        f fVarPeekFirst;
        while (this.imageReaderQueue.size() > 1 && (fVarPeekFirst = this.imageReaderQueue.peekFirst()) != null) {
            ImageReader imageReader = fVarPeekFirst.f43222a;
            ArrayDeque arrayDeque = fVarPeekFirst.f43223b;
            if (!arrayDeque.isEmpty() || fVarPeekFirst.f43225d.lastReaderDequeuedFrom == fVarPeekFirst) {
                return;
            }
            this.imageReaderQueue.removeFirst();
            this.perImageReaders.remove(imageReader);
            fVarPeekFirst.f43224c = true;
            imageReader.close();
            arrayDeque.clear();
        }
    }

    @Override // io.flutter.view.TextureRegistry$SurfaceProducer
    public void release() {
        if (this.released) {
            return;
        }
        releaseInternal();
        h hVar = this.this$0;
        hVar.f43247a.unregisterTexture(this.f43211id);
    }

    @Override // io.flutter.view.TextureRegistry$SurfaceProducer
    public void scheduleFrame() {
        this.this$0.f43247a.scheduleFrame();
    }

    @Override // io.flutter.view.TextureRegistry$SurfaceProducer
    public void setCallback(o oVar) {
        this.callback = oVar;
    }

    @Override // io.flutter.view.TextureRegistry$SurfaceProducer
    public void setSize(int i10, int i11) {
        int iMax = Math.max(1, i10);
        int iMax2 = Math.max(1, i11);
        if (this.requestedWidth == iMax && this.requestedHeight == iMax2) {
            return;
        }
        this.createNewReader = true;
        this.requestedHeight = iMax2;
        this.requestedWidth = iMax;
    }
}
