package io.flutter.embedding.engine;

import am.e;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.media.MediaExtractor;
import android.os.Build;
import android.os.LocaleList;
import android.os.Looper;
import android.util.DisplayMetrics;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.Choreographer;
import android.view.Surface;
import android.view.SurfaceControl;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.widget.FrameLayout;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.internal.ads.y2;
import com.mbridge.msdk.config.component.info.provider.subprovider.f;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import d5.u;
import io.flutter.embedding.engine.mutatorsstack.FlutterMutatorsStack;
import io.flutter.embedding.engine.renderer.SurfaceTextureWrapper;
import io.flutter.plugin.platform.m;
import io.flutter.plugin.platform.n;
import io.flutter.view.FlutterCallbackInformation;
import io.flutter.view.TextureRegistry$ImageConsumer;
import io.flutter.view.d;
import io.flutter.view.g;
import io.flutter.view.q;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import m0.s1;
import mi.r;
import n6.b0;
import ni.b;
import ni.h;
import ni.i;
import ni.j;
import oi.c;
import pi.a;
import r1.s;
import wi.k;
import wi.l;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
@Keep
public class FlutterJNI {
    private static final String TAG = "FlutterJNI";

    @Nullable
    private static j asyncWaitForVsyncDelegate = null;
    private static float displayDensity = -1.0f;
    private static float displayHeight = -1.0f;
    private static float displayWidth = -1.0f;
    private static boolean initCalled = false;
    private static boolean loadLibraryCalled = false;
    private static boolean prefetchDefaultFontManagerCalled = false;
    private static float refreshRateFPS = 60.0f;

    @Nullable
    private static String vmServiceUri;

    @Nullable
    private i accessibilityDelegate;

    @Nullable
    private a deferredComponentManager;

    @Nullable
    private yi.a localizationPlugin;

    @Nullable
    private Long nativeShellHolderId;

    @Nullable
    private oi.i platformMessageHandler;

    @Nullable
    private n platformViewsController;

    @Nullable
    private m platformViewsController2;

    @Nullable
    private l settingsChannel;
    private ReentrantReadWriteLock shellHolderLock = new ReentrantReadWriteLock();

    @NonNull
    private final Set<b> engineLifecycleListeners = new CopyOnWriteArraySet();

    @NonNull
    private final Set<io.flutter.embedding.engine.renderer.i> flutterUiDisplayListeners = new CopyOnWriteArraySet();

    @NonNull
    private final Set<io.flutter.embedding.engine.renderer.j> flutterUiResizeListeners = new CopyOnWriteArraySet();

    @NonNull
    private final Looper mainLooper = Looper.getMainLooper();

    private static void asyncWaitForVsync(long j10) {
        j jVar = asyncWaitForVsyncDelegate;
        if (jVar == null) {
            throw new IllegalStateException("An AsyncWaitForVsyncDelegate must be registered with FlutterJNI before asyncWaitForVsync() is invoked.");
        }
        io.flutter.view.a aVar = (io.flutter.view.a) jVar;
        aVar.getClass();
        Choreographer choreographer = Choreographer.getInstance();
        bo.l lVar = (bo.l) aVar.f43416a;
        q qVar = (q) lVar.f5820c;
        if (qVar != null) {
            qVar.f43515a = j10;
            lVar.f5820c = null;
        } else {
            qVar = new q(lVar, j10);
        }
        choreographer.postFrameCallback(qVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v9 */
    @Nullable
    public static Bitmap decodeImage(@NonNull ByteBuffer byteBuffer, long j10) {
        qi.b bVar;
        h hVar = new h(j10);
        y2 y2Var = new y2();
        int iRemaining = byteBuffer.remaining();
        byte[] bArr = new byte[iRemaining];
        byteBuffer.get(bArr);
        byteBuffer.rewind();
        try {
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeByteArray(bArr, 0, iRemaining, options);
            y2Var.f22083b = options.outMimeType;
            y2Var.f22087f = options.outHeight;
            y2Var.f22088g = options.outWidth;
        } catch (Exception e10) {
            Log.e("BitmapMetadataReader", "Failed to decode image for mime type", e10);
        }
        if ("image/heif".equals(y2Var.f22083b)) {
            try {
                b0 b0Var = new b0(bArr, 1);
                MediaExtractor mediaExtractor = new MediaExtractor();
                mediaExtractor.setDataSource(b0Var);
                no.b.D(y2Var, mediaExtractor);
            } catch (Exception e11) {
                Log.e("MediaMetadataReader", "Failed to decode HEIF image using MediaExtractor", e11);
            }
            nativeImageHeaderCallback(hVar.f46766a, y2Var.f22082a, y2Var.f22084c);
            try {
                ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
                try {
                    y2Var.f22086e = new a1.h(byteArrayInputStream).d(1, "Orientation");
                    byteArrayInputStream.close();
                } catch (Throwable th2) {
                    try {
                        byteArrayInputStream.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                    throw th2;
                }
            } catch (IOException e12) {
                Log.e("ExifMetadataReader", "Failed to read EXIF metadata", e12);
            }
        }
        e eVar = 0;
        eVar = 0;
        if ("image/heif".equals(y2Var.f22083b)) {
            int i10 = Build.VERSION.SDK_INT;
            if (i10 == 36) {
                bVar = new qi.b(eVar, 0);
            } else if (i10 < 36) {
                bVar = new qi.b(eVar, 1);
            }
            eVar = bVar;
        }
        if (eVar == 0) {
            eVar = new e(hVar, 29);
        }
        return eVar.x(byteBuffer, y2Var);
    }

    private void ensureAttachedToNative() {
        if (this.nativeShellHolderId == null) {
            throw new RuntimeException("Cannot execute operation because FlutterJNI is not attached to native.");
        }
    }

    private void ensureNotAttachedToNative() {
        if (this.nativeShellHolderId != null) {
            throw new RuntimeException("Cannot execute operation because FlutterJNI is attached to native.");
        }
    }

    private void ensureRunningOnMainThread() {
        if (Looper.myLooper() == this.mainLooper) {
            return;
        }
        throw new RuntimeException("Methods marked with @UiThread must be executed on the main thread. Current thread: " + Thread.currentThread().getName());
    }

    @Nullable
    public static String getVMServiceUri() {
        return vmServiceUri;
    }

    private void handlePlatformMessageResponse(int i10, ByteBuffer byteBuffer) {
        xi.e eVar;
        oi.i iVar = this.platformMessageHandler;
        if (iVar == null || (eVar = (xi.e) ((oi.h) iVar).f47457f.remove(Integer.valueOf(i10))) == null) {
            return;
        }
        try {
            eVar.a(byteBuffer);
            if (byteBuffer == null || !byteBuffer.isDirect()) {
                return;
            }
            byteBuffer.limit(0);
        } catch (Error e10) {
            Thread threadCurrentThread = Thread.currentThread();
            if (threadCurrentThread.getUncaughtExceptionHandler() == null) {
                throw e10;
            }
            threadCurrentThread.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread, e10);
        } catch (Exception e11) {
            Log.e("DartMessenger", "Uncaught exception in binary message reply handler", e11);
        }
    }

    private native long nativeAttach(@NonNull FlutterJNI flutterJNI);

    private native void nativeCleanupMessageData(long j10);

    private native void nativeDeferredComponentInstallFailure(int i10, @NonNull String str, boolean z10);

    private native void nativeDestroy(long j10);

    private native void nativeDispatchEmptyPlatformMessage(long j10, @NonNull String str, int i10);

    private native void nativeDispatchPlatformMessage(long j10, @NonNull String str, @Nullable ByteBuffer byteBuffer, int i10, int i11);

    private native void nativeDispatchPointerDataPacket(long j10, @NonNull ByteBuffer byteBuffer, int i10);

    private native void nativeDispatchSemanticsAction(long j10, int i10, int i11, @Nullable ByteBuffer byteBuffer, int i12);

    private native boolean nativeFlutterTextUtilsIsEmoji(int i10);

    private native boolean nativeFlutterTextUtilsIsEmojiModifier(int i10);

    private native boolean nativeFlutterTextUtilsIsEmojiModifierBase(int i10);

    private native boolean nativeFlutterTextUtilsIsRegionalIndicator(int i10);

    private native boolean nativeFlutterTextUtilsIsVariationSelector(int i10);

    private native Bitmap nativeGetBitmap(long j10);

    private native boolean nativeGetIsSoftwareRenderingEnabled();

    public static native void nativeImageHeaderCallback(long j10, int i10, int i11);

    private static native void nativeInit(@NonNull Context context, @NonNull String[] strArr, @Nullable String str, @NonNull String str2, @NonNull String str3, long j10, int i10);

    private native void nativeInvokePlatformMessageEmptyResponseCallback(long j10, int i10);

    private native void nativeInvokePlatformMessageResponseCallback(long j10, int i10, @Nullable ByteBuffer byteBuffer, int i11);

    private native boolean nativeIsSurfaceControlEnabled(long j10);

    private native void nativeLoadDartDeferredLibrary(long j10, int i10, @NonNull String[] strArr);

    @NonNull
    @Deprecated
    public static native FlutterCallbackInformation nativeLookupCallbackInformation(long j10);

    private native void nativeMarkTextureFrameAvailable(long j10, long j11);

    private native void nativeNotifyLowMemoryWarning(long j10);

    private native void nativeOnVsync(long j10, long j11, long j12);

    private static native void nativePrefetchDefaultFontManager();

    private native void nativeRegisterImageTexture(long j10, long j11, @NonNull WeakReference<TextureRegistry$ImageConsumer> weakReference, boolean z10);

    private native void nativeRegisterTexture(long j10, long j11, @NonNull WeakReference<SurfaceTextureWrapper> weakReference);

    private native void nativeRunBundleAndSnapshotFromLibrary(long j10, @NonNull String str, @Nullable String str2, @Nullable String str3, @NonNull AssetManager assetManager, @Nullable List<String> list, long j11);

    private native void nativeScheduleFrame(long j10);

    private native void nativeSetAccessibilityFeatures(long j10, int i10);

    private native void nativeSetSemanticsEnabled(long j10, boolean z10);

    private native void nativeSetViewportMetrics(long j10, float f10, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i20, int i21, int i22, int i23, int i24, int[] iArr, int[] iArr2, int[] iArr3, int i25, int i26, int i27, int i28);

    private native FlutterJNI nativeSpawn(long j10, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable List<String> list, long j11);

    private native void nativeSurfaceChanged(long j10, int i10, int i11);

    private native void nativeSurfaceCreated(long j10, @NonNull Surface surface);

    private native void nativeSurfaceDestroyed(long j10);

    private native void nativeSurfaceWindowChanged(long j10, @NonNull Surface surface);

    private native void nativeUnregisterTexture(long j10, long j11);

    private native void nativeUpdateDisplayMetrics(long j10);

    private native void nativeUpdateJavaAssetManager(long j10, @NonNull AssetManager assetManager, @NonNull String str);

    private native void nativeUpdateRefreshRate(float f10);

    private void onPreEngineRestart() {
        Iterator<b> it = this.engineLifecycleListeners.iterator();
        while (it.hasNext()) {
            it.next().a();
        }
    }

    private void setApplicationLocale(@NonNull String str) {
        ensureRunningOnMainThread();
        i iVar = this.accessibilityDelegate;
        if (iVar != null) {
            ((g) ((io.flutter.view.a) iVar).f43416a).f43490m = str;
        }
    }

    private void updateCustomAccessibilityActions(@NonNull ByteBuffer byteBuffer, @NonNull String[] strArr) {
        ensureRunningOnMainThread();
        i iVar = this.accessibilityDelegate;
        if (iVar != null) {
            byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
            g gVar = (g) ((io.flutter.view.a) iVar).f43416a;
            while (byteBuffer.hasRemaining()) {
                io.flutter.view.e eVarB = gVar.b(byteBuffer.getInt());
                eVarB.f43447c = byteBuffer.getInt();
                eVarB.f43448d = g.d(byteBuffer, strArr);
                eVarB.f43449e = g.d(byteBuffer, strArr);
            }
        }
    }

    private void updateSemantics(@NonNull ByteBuffer byteBuffer, @NonNull String[] strArr, @NonNull ByteBuffer[] byteBufferArr) {
        ensureRunningOnMainThread();
        i iVar = this.accessibilityDelegate;
        if (iVar != null) {
            ((io.flutter.view.a) iVar).a(byteBuffer, strArr, byteBufferArr);
        }
    }

    public boolean IsSurfaceControlEnabled() {
        return nativeIsSurfaceControlEnabled(this.nativeShellHolderId.longValue());
    }

    public void addEngineLifecycleListener(@NonNull b bVar) {
        ensureRunningOnMainThread();
        this.engineLifecycleListeners.add(bVar);
    }

    public void addIsDisplayingFlutterUiListener(@NonNull io.flutter.embedding.engine.renderer.i iVar) {
        ensureRunningOnMainThread();
        this.flutterUiDisplayListeners.add(iVar);
    }

    public void addResizingFlutterUiListener(@NonNull io.flutter.embedding.engine.renderer.j jVar) {
        ensureRunningOnMainThread();
        this.flutterUiResizeListeners.add(jVar);
    }

    @SuppressLint({"NewApi"})
    public void applyTransactions() {
        m mVar = this.platformViewsController2;
        if (mVar == null) {
            throw new RuntimeException("");
        }
        ArrayList arrayList = mVar.l;
        SurfaceControl.Transaction transaction = new SurfaceControl.Transaction();
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            transaction = transaction.merge((SurfaceControl.Transaction) arrayList.get(i10));
        }
        transaction.apply();
        arrayList.clear();
    }

    public void attachToNative() {
        ensureRunningOnMainThread();
        ensureNotAttachedToNative();
        this.shellHolderLock.writeLock().lock();
        try {
            this.nativeShellHolderId = Long.valueOf(performNativeAttach(this));
        } finally {
            this.shellHolderLock.writeLock().unlock();
        }
    }

    public void cleanupMessageData(long j10) {
        nativeCleanupMessageData(j10);
    }

    public String[] computePlatformResolvedLocale(@NonNull String[] strArr) {
        Locale localeLookup;
        if (this.localizationPlugin == null) {
            return new String[0];
        }
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < strArr.length; i10 += 3) {
            String str = strArr[i10];
            String str2 = strArr[i10 + 1];
            String str3 = strArr[i10 + 2];
            Locale.Builder builder = new Locale.Builder();
            if (!str.isEmpty()) {
                builder.setLanguage(str);
            }
            if (!str2.isEmpty()) {
                builder.setRegion(str2);
            }
            if (!str3.isEmpty()) {
                builder.setScript(str3);
            }
            arrayList.add(builder.build());
        }
        yi.a aVar = this.localizationPlugin;
        aVar.getClass();
        if (arrayList.isEmpty()) {
            localeLookup = null;
        } else {
            ArrayList arrayList2 = new ArrayList();
            LocaleList locales = aVar.f54402b.getResources().getConfiguration().getLocales();
            int size = locales.size();
            for (int i11 = 0; i11 < size; i11++) {
                Locale locale = locales.get(i11);
                String language = locale.getLanguage();
                if (!locale.getScript().isEmpty()) {
                    StringBuilder sbJ = u.j(language, "-");
                    sbJ.append(locale.getScript());
                    language = sbJ.toString();
                }
                if (!locale.getCountry().isEmpty()) {
                    StringBuilder sbJ2 = u.j(language, "-");
                    sbJ2.append(locale.getCountry());
                    language = sbJ2.toString();
                }
                arrayList2.add(new Locale.LanguageRange(language));
                arrayList2.add(new Locale.LanguageRange(locale.getLanguage()));
                arrayList2.add(new Locale.LanguageRange(locale.getLanguage() + "-*"));
            }
            localeLookup = Locale.lookup(arrayList2, arrayList);
            if (localeLookup == null) {
                localeLookup = (Locale) arrayList.get(0);
            }
        }
        return localeLookup == null ? new String[0] : new String[]{localeLookup.getLanguage(), localeLookup.getCountry(), localeLookup.getScript()};
    }

    public FlutterOverlaySurface createOverlaySurface() {
        ensureRunningOnMainThread();
        n nVar = this.platformViewsController;
        if (nVar == null) {
            throw new RuntimeException("platformViewsController must be set before attempting to position an overlay surface");
        }
        Context context = nVar.f43355d.getContext();
        int width = nVar.f43355d.getWidth();
        int height = nVar.f43355d.getHeight();
        io.flutter.plugin.platform.a aVar = nVar.f43360i;
        io.flutter.plugin.platform.b bVar = new io.flutter.plugin.platform.b(context, width, height, 2);
        bVar.f43311h = aVar;
        int i10 = nVar.f43366p;
        nVar.f43366p = i10 + 1;
        nVar.f43364n.put(i10, bVar);
        return new FlutterOverlaySurface(i10, bVar.getSurface());
    }

    @SuppressLint({"NewApi"})
    public FlutterOverlaySurface createOverlaySurface2() {
        m mVar = this.platformViewsController2;
        if (mVar != null) {
            return mVar.a();
        }
        throw new RuntimeException("platformViewsController must be set before attempting to position an overlay surface");
    }

    @SuppressLint({"NewApi"})
    public SurfaceControl.Transaction createTransaction() {
        m mVar = this.platformViewsController2;
        if (mVar == null) {
            throw new RuntimeException("");
        }
        mVar.getClass();
        SurfaceControl.Transaction transaction = new SurfaceControl.Transaction();
        mVar.l.add(transaction);
        return transaction;
    }

    public void deferredComponentInstallFailure(int i10, @NonNull String str, boolean z10) {
        ensureRunningOnMainThread();
        nativeDeferredComponentInstallFailure(i10, str, z10);
    }

    @SuppressLint({"NewApi"})
    public void destroyOverlaySurface2() {
        ensureRunningOnMainThread();
        m mVar = this.platformViewsController2;
        if (mVar == null) {
            throw new RuntimeException("platformViewsController must be set before attempting to destroy an overlay surface");
        }
        Surface surface = mVar.f43348n;
        if (surface != null) {
            surface.release();
            mVar.f43348n = null;
            mVar.f43349o = null;
        }
    }

    public void destroyOverlaySurfaces() {
        ensureRunningOnMainThread();
        n nVar = this.platformViewsController;
        if (nVar == null) {
            throw new RuntimeException("platformViewsController must be set before attempting to destroy an overlay surface");
        }
        nVar.c();
    }

    public void detachFromNativeAndReleaseResources() {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        this.shellHolderLock.writeLock().lock();
        try {
            nativeDestroy(this.nativeShellHolderId.longValue());
            this.nativeShellHolderId = null;
        } finally {
            this.shellHolderLock.writeLock().unlock();
        }
    }

    public void dispatchEmptyPlatformMessage(@NonNull String str, int i10) {
        ensureRunningOnMainThread();
        if (isAttached()) {
            nativeDispatchEmptyPlatformMessage(this.nativeShellHolderId.longValue(), str, i10);
            return;
        }
        Log.w(TAG, "Tried to send a platform message to Flutter, but FlutterJNI was detached from native C++. Could not send. Channel: " + str + ". Response ID: " + i10);
    }

    public void dispatchPlatformMessage(@NonNull String str, @Nullable ByteBuffer byteBuffer, int i10, int i11) {
        ensureRunningOnMainThread();
        if (isAttached()) {
            nativeDispatchPlatformMessage(this.nativeShellHolderId.longValue(), str, byteBuffer, i10, i11);
            return;
        }
        Log.w(TAG, "Tried to send a platform message to Flutter, but FlutterJNI was detached from native C++. Could not send. Channel: " + str + ". Response ID: " + i11);
    }

    public void dispatchPointerDataPacket(@NonNull ByteBuffer byteBuffer, int i10) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeDispatchPointerDataPacket(this.nativeShellHolderId.longValue(), byteBuffer, i10);
    }

    public void dispatchSemanticsAction(int i10, @NonNull d dVar) {
        dispatchSemanticsAction(i10, dVar, null);
    }

    @SuppressLint({"NewApi"})
    public void endFrame2() {
        m mVar = this.platformViewsController2;
        if (mVar == null) {
            throw new RuntimeException("");
        }
        mVar.c();
    }

    public Bitmap getBitmap() {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        return nativeGetBitmap(this.nativeShellHolderId.longValue());
    }

    public boolean getIsSoftwareRenderingEnabled() {
        return nativeGetIsSoftwareRenderingEnabled();
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0067  */
    @Nullable
    public float getScaledFontSize(float f10, int i10) {
        k kVar;
        l lVar = this.settingsChannel;
        DisplayMetrics displayMetrics = null;
        if (lVar != null) {
            s sVar = lVar.f53252a;
            ConcurrentLinkedQueue concurrentLinkedQueue = (ConcurrentLinkedQueue) sVar.f49338b;
            if (((k) sVar.f49339c) == null) {
                sVar.f49339c = (k) concurrentLinkedQueue.poll();
            }
            while (true) {
                kVar = (k) sVar.f49339c;
                if (kVar == null || kVar.f53250a >= i10) {
                    break;
                }
                sVar.f49339c = (k) concurrentLinkedQueue.poll();
            }
            if (kVar == null) {
                Log.e("SettingsChannel", "Cannot find config with generation: " + i10 + ", after exhausting the queue.");
            } else if (kVar.f53250a != i10) {
                StringBuilder sbU = defpackage.e.u(i10, "Cannot find config with generation: ", ", the oldest config is now: ");
                sbU.append(((k) sVar.f49339c).f53250a);
                Log.e("SettingsChannel", sbU.toString());
            } else if (kVar != null) {
                displayMetrics = kVar.f53251b;
            }
            kVar = null;
            if (kVar != null) {
                displayMetrics = kVar.f53251b;
            }
        }
        if (displayMetrics != null) {
            return TypedValue.applyDimension(2, f10, displayMetrics) / displayMetrics.density;
        }
        Log.e(TAG, "getScaledFontSize called with configurationId " + String.valueOf(i10) + ", which can't be found.");
        return -1.0f;
    }

    public void handlePlatformMessage(@NonNull String str, ByteBuffer byteBuffer, int i10, long j10) {
        oi.e eVar;
        boolean z10;
        oi.i iVar = this.platformMessageHandler;
        if (iVar == null) {
            nativeCleanupMessageData(j10);
            return;
        }
        oi.h hVar = (oi.h) iVar;
        synchronized (hVar.f47455d) {
            try {
                eVar = (oi.e) hVar.f47453b.get(str);
                z10 = hVar.f47456e.get() && eVar == null;
                if (z10) {
                    if (!hVar.f47454c.containsKey(str)) {
                        hVar.f47454c.put(str, new LinkedList());
                    }
                    ((List) hVar.f47454c.get(str)).add(new c(j10, byteBuffer, i10));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (z10) {
            return;
        }
        hVar.b(str, eVar, byteBuffer, i10, j10);
    }

    @SuppressLint({"NewApi"})
    public void hideOverlaySurface2() {
        m mVar = this.platformViewsController2;
        if (mVar == null) {
            throw new RuntimeException("platformViewsController must be set before attempting to destroy an overlay surface");
        }
        if (mVar.f43349o == null) {
            return;
        }
        SurfaceControl.Transaction transaction = new SurfaceControl.Transaction();
        transaction.setVisibility(mVar.f43349o, false);
        transaction.apply();
    }

    @SuppressLint({"NewApi"})
    public void hidePlatformView2(int i10) {
        ensureRunningOnMainThread();
        m mVar = this.platformViewsController2;
        if (mVar == null) {
            throw new RuntimeException("platformViewsController must be set before attempting to hide a platform view");
        }
        if (mVar.b(i10)) {
            ((si.a) mVar.f43345j.get(i10)).setVisibility(8);
        }
    }

    public void init(@NonNull Context context, @NonNull String[] strArr, @Nullable String str, @NonNull String str2, @NonNull String str3, long j10, int i10) {
        if (initCalled) {
            Log.w(TAG, "FlutterJNI.init called more than once");
        }
        nativeInit(context, strArr, str, str2, str3, j10, i10);
        initCalled = true;
    }

    public void invokePlatformMessageEmptyResponseCallback(int i10) {
        this.shellHolderLock.readLock().lock();
        try {
            if (isAttached()) {
                nativeInvokePlatformMessageEmptyResponseCallback(this.nativeShellHolderId.longValue(), i10);
            } else {
                Log.w(TAG, "Tried to send a platform message response, but FlutterJNI was detached from native C++. Could not send. Response ID: " + i10);
            }
        } finally {
            this.shellHolderLock.readLock().unlock();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v5, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v8, types: [io.flutter.embedding.engine.FlutterJNI] */
    public void invokePlatformMessageResponseCallback(int i10, @NonNull ByteBuffer byteBuffer, int i11) throws Throwable {
        FlutterJNI flutterJNIIsAttached;
        if (!byteBuffer.isDirect()) {
            throw new IllegalArgumentException("Expected a direct ByteBuffer.");
        }
        this.shellHolderLock.readLock().lock();
        try {
            flutterJNIIsAttached = isAttached();
            try {
                if (flutterJNIIsAttached != 0) {
                    FlutterJNI flutterJNI = this;
                    flutterJNI.nativeInvokePlatformMessageResponseCallback(this.nativeShellHolderId.longValue(), i10, byteBuffer, i11);
                    flutterJNIIsAttached = flutterJNI;
                } else {
                    flutterJNIIsAttached = this;
                    Log.w(TAG, "Tried to send a platform message response, but FlutterJNI was detached from native C++. Could not send. Response ID: " + i10);
                }
                flutterJNIIsAttached.shellHolderLock.readLock().unlock();
            } catch (Throwable th2) {
                th = th2;
                Throwable th3 = th;
                flutterJNIIsAttached.shellHolderLock.readLock().unlock();
                throw th3;
            }
        } catch (Throwable th4) {
            th = th4;
            flutterJNIIsAttached = this;
        }
    }

    public boolean isAttached() {
        return this.nativeShellHolderId != null;
    }

    public boolean isCodePointEmoji(int i10) {
        return nativeFlutterTextUtilsIsEmoji(i10);
    }

    public boolean isCodePointEmojiModifier(int i10) {
        return nativeFlutterTextUtilsIsEmojiModifier(i10);
    }

    public boolean isCodePointEmojiModifierBase(int i10) {
        return nativeFlutterTextUtilsIsEmojiModifierBase(i10);
    }

    public boolean isCodePointRegionalIndicator(int i10) {
        return nativeFlutterTextUtilsIsRegionalIndicator(i10);
    }

    public boolean isCodePointVariantSelector(int i10) {
        return nativeFlutterTextUtilsIsVariationSelector(i10);
    }

    public void loadDartDeferredLibrary(int i10, @NonNull String[] strArr) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeLoadDartDeferredLibrary(this.nativeShellHolderId.longValue(), i10, strArr);
    }

    public void loadLibrary(Context context) throws Throwable {
        String[] strArrA;
        InputStream inputStream;
        InputStream inputStream2;
        FileOutputStream fileOutputStream;
        if (loadLibraryCalled) {
            Log.w(TAG, "FlutterJNI.loadLibrary called more than once");
        }
        ni.g gVar = new ni.g(0);
        k5.g gVar2 = new k5.g(10);
        gVar2.f44328d = gVar;
        if (context == null) {
            throw new IllegalArgumentException("Given context is null");
        }
        gVar2.s("Beginning load of %s...", "flutter");
        j2.n nVar = (j2.n) gVar2.f44326b;
        HashSet hashSet = (HashSet) gVar2.f44325a;
        if (hashSet.contains("flutter")) {
            gVar2.s("%s already loaded previously!", "flutter");
        } else {
            s1 s1Var = null;
            try {
                nVar.getClass();
                System.loadLibrary("flutter");
                hashSet.add("flutter");
                gVar2.s("%s (%s) was loaded normally!", "flutter", null);
            } catch (UnsatisfiedLinkError e10) {
                gVar2.s("Loading the library normally failed: %s", Log.getStackTraceString(e10));
                gVar2.s("%s (%s) was not loaded normally, re-linking...", "flutter", null);
                File fileR = gVar2.r(context);
                if (!fileR.exists()) {
                    File dir = context.getDir("lib", 0);
                    File fileR2 = gVar2.r(context);
                    nVar.getClass();
                    File[] fileArrListFiles = dir.listFiles(new m8.a(System.mapLibraryName("flutter")));
                    if (fileArrListFiles != null) {
                        for (File file : fileArrListFiles) {
                            if (!file.getAbsolutePath().equals(fileR2.getAbsolutePath())) {
                                file.delete();
                            }
                        }
                    }
                    jj.d dVar = (jj.d) gVar2.f44327c;
                    String[] strArr = Build.SUPPORTED_ABIS;
                    if (strArr.length <= 0) {
                        String str = Build.CPU_ABI2;
                        strArr = (str == null || str.length() == 0) ? new String[]{Build.CPU_ABI} : new String[]{Build.CPU_ABI, str};
                    }
                    String strMapLibraryName = System.mapLibraryName("flutter");
                    dVar.getClass();
                    try {
                        s1 s1VarW = jj.d.w(context, strArr, strMapLibraryName, gVar2);
                        try {
                            if (s1VarW == null) {
                                try {
                                    strArrA = jj.d.A(context, strMapLibraryName);
                                } catch (Exception e11) {
                                    strArrA = new String[]{e11.toString()};
                                }
                                throw new aa.b(strMapLibraryName, strArr, strArrA);
                            }
                            ZipFile zipFile = (ZipFile) s1VarW.f45751b;
                            int i10 = 0;
                            while (true) {
                                int i11 = i10 + 1;
                                if (i10 >= 5) {
                                    if (((ni.g) gVar2.f44328d) == null) {
                                        break;
                                    }
                                    lambda$loadLibrary$0("FATAL! Couldn't extract the library from the APK!");
                                    break;
                                }
                                gVar2.s("Found %s! Extracting...", strMapLibraryName);
                                try {
                                    if (fileR.exists() || fileR.createNewFile()) {
                                        try {
                                            inputStream2 = zipFile.getInputStream((ZipEntry) s1VarW.f45752c);
                                            try {
                                                fileOutputStream = new FileOutputStream(fileR);
                                                try {
                                                    try {
                                                        byte[] bArr = new byte[4096];
                                                        long j10 = 0;
                                                        while (true) {
                                                            int i12 = inputStream2.read(bArr);
                                                            if (i12 == -1) {
                                                                break;
                                                            }
                                                            fileOutputStream.write(bArr, 0, i12);
                                                            j10 += (long) i12;
                                                        }
                                                        fileOutputStream.flush();
                                                        fileOutputStream.getFD().sync();
                                                        if (j10 == fileR.length()) {
                                                            jj.d.r(inputStream2);
                                                            jj.d.r(fileOutputStream);
                                                            fileR.setReadable(true, false);
                                                            fileR.setExecutable(true, false);
                                                            fileR.setWritable(true);
                                                            break;
                                                        }
                                                    } catch (Throwable th2) {
                                                        th = th2;
                                                        inputStream = inputStream2;
                                                        jj.d.r(inputStream);
                                                        jj.d.r(fileOutputStream);
                                                        throw th;
                                                    }
                                                } catch (FileNotFoundException | IOException unused) {
                                                }
                                            } catch (FileNotFoundException unused2) {
                                                fileOutputStream = null;
                                                jj.d.r(inputStream2);
                                                jj.d.r(fileOutputStream);
                                                i10 = i11;
                                            } catch (IOException unused3) {
                                                fileOutputStream = null;
                                                jj.d.r(inputStream2);
                                                jj.d.r(fileOutputStream);
                                                i10 = i11;
                                            } catch (Throwable th3) {
                                                th = th3;
                                                inputStream = inputStream2;
                                                fileOutputStream = null;
                                                jj.d.r(inputStream);
                                                jj.d.r(fileOutputStream);
                                                throw th;
                                            }
                                        } catch (FileNotFoundException unused4) {
                                            inputStream2 = null;
                                        } catch (IOException unused5) {
                                            inputStream2 = null;
                                        } catch (Throwable th4) {
                                            th = th4;
                                            inputStream = null;
                                        }
                                        jj.d.r(inputStream2);
                                        jj.d.r(fileOutputStream);
                                    }
                                } catch (IOException unused6) {
                                }
                                i10 = i11;
                            }
                            try {
                                zipFile.close();
                            } catch (IOException unused7) {
                            }
                        } catch (Throwable th5) {
                            th = th5;
                            s1Var = s1VarW;
                            if (s1Var != null) {
                                try {
                                    ((ZipFile) s1Var.f45751b).close();
                                } catch (IOException unused8) {
                                }
                            }
                            throw th;
                        }
                    } catch (Throwable th6) {
                        th = th6;
                    }
                }
                String absolutePath = fileR.getAbsolutePath();
                nVar.getClass();
                System.load(absolutePath);
                hashSet.add("flutter");
                gVar2.s("%s (%s) was re-linked!", "flutter", null);
            }
        }
        loadLibraryCalled = true;
    }

    public void markTextureFrameAvailable(long j10) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeMarkTextureFrameAvailable(this.nativeShellHolderId.longValue(), j10);
    }

    public void maybeResizeSurfaceView(int i10, int i11) {
        boolean z10;
        Iterator<io.flutter.embedding.engine.renderer.j> it = this.flutterUiResizeListeners.iterator();
        while (it.hasNext()) {
            mi.s sVar = ((mi.q) it.next()).f46046a;
            View view = sVar.f46055f;
            if (view != null) {
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                boolean z11 = true;
                if (view.getHeight() != i11) {
                    layoutParams.height = i11;
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (view.getWidth() != i10) {
                    layoutParams.width = i10;
                } else {
                    z11 = z10;
                }
                if (z11) {
                    sVar.f46050a.set(false);
                    view.setLayoutParams(layoutParams);
                }
            } else {
                Log.e("FlutterView", "Flutter engine view not set.");
            }
        }
    }

    public void notifyLowMemoryWarning() {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeNotifyLowMemoryWarning(this.nativeShellHolderId.longValue());
    }

    public void onBeginFrame() {
        ensureRunningOnMainThread();
        n nVar = this.platformViewsController;
        if (nVar == null) {
            throw new RuntimeException("platformViewsController must be set before attempting to begin the frame");
        }
        nVar.f43369s.clear();
        nVar.f43370t.clear();
    }

    public void onDisplayOverlaySurface(int i10, int i11, int i12, int i13, int i14) {
        ensureRunningOnMainThread();
        n nVar = this.platformViewsController;
        if (nVar == null) {
            throw new RuntimeException("platformViewsController must be set before attempting to position an overlay surface");
        }
        SparseArray sparseArray = nVar.f43364n;
        if (sparseArray.get(i10) == null) {
            throw new IllegalStateException(defpackage.e.h(i10, "The overlay surface (id:", ") doesn't exist"));
        }
        nVar.h();
        View view = (io.flutter.plugin.platform.b) sparseArray.get(i10);
        if (view.getParent() == null) {
            nVar.f43355d.addView(view);
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i13, i14);
        layoutParams.leftMargin = i11;
        layoutParams.topMargin = i12;
        view.setLayoutParams(layoutParams);
        view.setVisibility(0);
        view.bringToFront();
        nVar.f43369s.add(Integer.valueOf(i10));
    }

    public void onDisplayPlatformView(int i10, int i11, int i12, int i13, int i14, int i15, int i16, FlutterMutatorsStack flutterMutatorsStack) {
        ensureRunningOnMainThread();
        n nVar = this.platformViewsController;
        if (nVar == null) {
            throw new RuntimeException("platformViewsController must be set before attempting to position a platform view");
        }
        nVar.h();
        SparseArray sparseArray = nVar.f43363m;
        SparseArray sparseArray2 = nVar.l;
        io.flutter.plugin.platform.d dVar = (io.flutter.plugin.platform.d) sparseArray2.get(i10);
        if (dVar == null) {
            return;
        }
        if (sparseArray.get(i10) == null) {
            View view = dVar.getView();
            if (view == null) {
                throw new IllegalStateException("PlatformView#getView() returned null, but an Android view reference was expected.");
            }
            if (view.getParent() != null) {
                throw new IllegalStateException("The Android view returned from PlatformView#getView() was already added to a parent view.");
            }
            Activity activity = nVar.f43354c;
            si.a aVar = new si.a(activity, activity.getResources().getDisplayMetrics().density, nVar.f43353b);
            aVar.setOnDescendantFocusChangeListener(new io.flutter.plugin.platform.i(nVar, i10, 0));
            sparseArray.put(i10, aVar);
            view.setImportantForAccessibility(4);
            aVar.addView(view);
            nVar.f43355d.addView(aVar);
        }
        si.a aVar2 = (si.a) sparseArray.get(i10);
        aVar2.f50247a = flutterMutatorsStack;
        aVar2.f50249c = i11;
        aVar2.f50250d = i12;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i13, i14);
        layoutParams.leftMargin = i11;
        layoutParams.topMargin = i12;
        aVar2.setLayoutParams(layoutParams);
        aVar2.setWillNotDraw(false);
        aVar2.setVisibility(0);
        aVar2.bringToFront();
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(i15, i16);
        View view2 = ((io.flutter.plugin.platform.d) sparseArray2.get(i10)).getView();
        if (view2 != null) {
            view2.setLayoutParams(layoutParams2);
            view2.bringToFront();
        }
        nVar.f43370t.add(Integer.valueOf(i10));
    }

    @SuppressLint({"NewApi"})
    public void onDisplayPlatformView2(int i10, int i11, int i12, int i13, int i14, int i15, int i16, FlutterMutatorsStack flutterMutatorsStack) {
        ensureRunningOnMainThread();
        m mVar = this.platformViewsController2;
        if (mVar == null) {
            throw new RuntimeException("platformViewsController must be set before attempting to position a platform view");
        }
        if (mVar.b(i10)) {
            si.a aVar = (si.a) mVar.f43345j.get(i10);
            aVar.f50247a = flutterMutatorsStack;
            aVar.f50249c = i11;
            aVar.f50250d = i12;
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i13, i14);
            layoutParams.leftMargin = i11;
            layoutParams.topMargin = i12;
            aVar.setLayoutParams(layoutParams);
            aVar.setWillNotDraw(false);
            aVar.setVisibility(0);
            aVar.bringToFront();
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(i15, i16);
            View view = ((io.flutter.plugin.platform.d) mVar.f43344i.get(i10)).getView();
            if (view != null) {
                view.setLayoutParams(layoutParams2);
                view.bringToFront();
            }
        }
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [android.view.View, io.flutter.embedding.engine.renderer.k] */
    public void onEndFrame() {
        ?? r2;
        ensureRunningOnMainThread();
        n nVar = this.platformViewsController;
        if (nVar == null) {
            throw new RuntimeException("platformViewsController must be set before attempting to end the frame");
        }
        boolean z10 = false;
        if (!nVar.f43367q || !nVar.f43370t.isEmpty()) {
            if (nVar.f43367q) {
                mi.l lVar = nVar.f43355d.f46054e;
                if (lVar != null ? lVar.c() : false) {
                    z10 = true;
                }
            }
            nVar.f(z10);
            return;
        }
        nVar.f43367q = false;
        mi.s sVar = nVar.f43355d;
        f fVar = new f(nVar, 16);
        mi.l lVar2 = sVar.f46054e;
        if (lVar2 == null || (r2 = sVar.f46056g) == 0) {
            return;
        }
        sVar.f46055f = r2;
        sVar.f46056g = null;
        io.flutter.embedding.engine.renderer.h hVar = sVar.f46059j.f46738b;
        if (hVar != null) {
            r2.resume();
            r rVar = new r(sVar, hVar, fVar);
            hVar.f43247a.addIsDisplayingFlutterUiListener(rVar);
            if (hVar.f43250d) {
                rVar.d();
                return;
            }
            return;
        }
        lVar2.b();
        mi.l lVar3 = sVar.f46054e;
        if (lVar3 != null) {
            lVar3.f46027a.close();
            sVar.removeView(sVar.f46054e);
            sVar.f46054e = null;
        }
        fVar.run();
    }

    public void onFirstFrame() {
        ensureRunningOnMainThread();
        Iterator<io.flutter.embedding.engine.renderer.i> it = this.flutterUiDisplayListeners.iterator();
        while (it.hasNext()) {
            it.next().d();
        }
    }

    public void onRenderingStopped() {
        ensureRunningOnMainThread();
        Iterator<io.flutter.embedding.engine.renderer.i> it = this.flutterUiDisplayListeners.iterator();
        while (it.hasNext()) {
            it.next().c();
        }
    }

    public void onSurfaceChanged(int i10, int i11) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeSurfaceChanged(this.nativeShellHolderId.longValue(), i10, i11);
    }

    public void onSurfaceCreated(@NonNull Surface surface) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeSurfaceCreated(this.nativeShellHolderId.longValue(), surface);
    }

    public void onSurfaceDestroyed() {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        onRenderingStopped();
        nativeSurfaceDestroyed(this.nativeShellHolderId.longValue());
    }

    public void onSurfaceWindowChanged(@NonNull Surface surface) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeSurfaceWindowChanged(this.nativeShellHolderId.longValue(), surface);
    }

    public void onVsync(long j10, long j11, long j12) {
        nativeOnVsync(j10, j11, j12);
    }

    public long performNativeAttach(@NonNull FlutterJNI flutterJNI) {
        return nativeAttach(flutterJNI);
    }

    public void prefetchDefaultFontManager() {
        if (prefetchDefaultFontManagerCalled) {
            Log.w(TAG, "FlutterJNI.prefetchDefaultFontManager called more than once");
        }
        nativePrefetchDefaultFontManager();
        prefetchDefaultFontManagerCalled = true;
    }

    public void registerImageTexture(long j10, @NonNull TextureRegistry$ImageConsumer textureRegistry$ImageConsumer, boolean z10) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeRegisterImageTexture(this.nativeShellHolderId.longValue(), j10, new WeakReference<>(textureRegistry$ImageConsumer), z10);
    }

    public void registerTexture(long j10, @NonNull SurfaceTextureWrapper surfaceTextureWrapper) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeRegisterTexture(this.nativeShellHolderId.longValue(), j10, new WeakReference<>(surfaceTextureWrapper));
    }

    public void removeEngineLifecycleListener(@NonNull b bVar) {
        ensureRunningOnMainThread();
        this.engineLifecycleListeners.remove(bVar);
    }

    public void removeIsDisplayingFlutterUiListener(@NonNull io.flutter.embedding.engine.renderer.i iVar) {
        ensureRunningOnMainThread();
        this.flutterUiDisplayListeners.remove(iVar);
    }

    public void removeResizingFlutterUiListener(@NonNull io.flutter.embedding.engine.renderer.j jVar) {
        ensureRunningOnMainThread();
        this.flutterUiResizeListeners.remove(jVar);
    }

    public void requestDartDeferredLibrary(int i10) {
        Log.e(TAG, "No DeferredComponentManager found. Android setup must be completed before using split AOT deferred components.");
    }

    public void runBundleAndSnapshotFromLibrary(@NonNull String str, @Nullable String str2, @Nullable String str3, @NonNull AssetManager assetManager, @Nullable List<String> list, long j10) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeRunBundleAndSnapshotFromLibrary(this.nativeShellHolderId.longValue(), str, str2, str3, assetManager, list, j10);
    }

    public void scheduleFrame() {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeScheduleFrame(this.nativeShellHolderId.longValue());
    }

    public void setAccessibilityDelegate(@Nullable i iVar) {
        ensureRunningOnMainThread();
        this.accessibilityDelegate = iVar;
    }

    public void setAccessibilityFeatures(int i10) {
        ensureRunningOnMainThread();
        if (isAttached()) {
            setAccessibilityFeaturesInNative(i10);
        }
    }

    public void setAccessibilityFeaturesInNative(int i10) {
        nativeSetAccessibilityFeatures(this.nativeShellHolderId.longValue(), i10);
    }

    public void setAsyncWaitForVsyncDelegate(@Nullable j jVar) {
        asyncWaitForVsyncDelegate = jVar;
    }

    public void setDeferredComponentManager(@Nullable a aVar) {
        ensureRunningOnMainThread();
        if (aVar != null) {
            aVar.a();
        }
    }

    public void setLocalizationPlugin(@Nullable yi.a aVar) {
        ensureRunningOnMainThread();
        this.localizationPlugin = aVar;
    }

    public void setPlatformMessageHandler(@Nullable oi.i iVar) {
        ensureRunningOnMainThread();
        this.platformMessageHandler = iVar;
    }

    public void setPlatformViewsController(@NonNull n nVar) {
        ensureRunningOnMainThread();
        this.platformViewsController = nVar;
    }

    public void setPlatformViewsController2(@NonNull m mVar) {
        ensureRunningOnMainThread();
        this.platformViewsController2 = mVar;
    }

    public void setRefreshRateFPS(float f10) {
        refreshRateFPS = f10;
        updateRefreshRate();
    }

    public void setSemanticsEnabled(boolean z10) {
        ensureRunningOnMainThread();
        if (isAttached()) {
            setSemanticsEnabledInNative(z10);
        }
    }

    public void setSemanticsEnabledInNative(boolean z10) {
        nativeSetSemanticsEnabled(this.nativeShellHolderId.longValue(), z10);
    }

    public void setSemanticsTreeEnabled(boolean z10) {
        ensureRunningOnMainThread();
        i iVar = this.accessibilityDelegate;
        if (iVar == null || z10) {
            return;
        }
        g gVar = (g) ((io.flutter.view.a) iVar).f43416a;
        gVar.f43485g.clear();
        io.flutter.view.f fVar = gVar.f43487i;
        if (fVar != null) {
            gVar.h(fVar.f43452b, C.DEFAULT_BUFFER_SEGMENT_SIZE);
        }
        gVar.f43487i = null;
        gVar.f43493p = null;
        AccessibilityEvent accessibilityEventE = gVar.e(0, com.ironsource.mediationsdk.metadata.a.f29616n);
        accessibilityEventE.setContentChangeTypes(1);
        gVar.i(accessibilityEventE);
    }

    public void setSettingsChannel(@Nullable l lVar) {
        ensureRunningOnMainThread();
        this.settingsChannel = lVar;
    }

    public void setViewportMetrics(float f10, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i20, int i21, int i22, int i23, int i24, int[] iArr, int[] iArr2, int[] iArr3, int i25, int i26, int i27, int i28) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeSetViewportMetrics(this.nativeShellHolderId.longValue(), f10, i10, i11, i12, i13, i14, i15, i16, i17, i18, i19, i20, i21, i22, i23, i24, iArr, iArr2, iArr3, i25, i26, i27, i28);
    }

    @SuppressLint({"NewApi"})
    public void showOverlaySurface2() {
        m mVar = this.platformViewsController2;
        if (mVar == null) {
            throw new RuntimeException("platformViewsController must be set before attempting to destroy an overlay surface");
        }
        if (mVar.f43349o == null) {
            return;
        }
        SurfaceControl.Transaction transaction = new SurfaceControl.Transaction();
        transaction.setVisibility(mVar.f43349o, true);
        transaction.apply();
    }

    @NonNull
    public FlutterJNI spawn(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable List<String> list, long j10) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        FlutterJNI flutterJNINativeSpawn = nativeSpawn(this.nativeShellHolderId.longValue(), str, str2, str3, list, j10);
        Long l = flutterJNINativeSpawn.nativeShellHolderId;
        if ((l == null || l.longValue() == 0) ? false : true) {
            return flutterJNINativeSpawn;
        }
        throw new IllegalStateException("Failed to spawn new JNI connected shell from existing shell.");
    }

    @SuppressLint({"NewApi"})
    public void swapTransactions() {
        m mVar = this.platformViewsController2;
        if (mVar == null) {
            throw new RuntimeException("");
        }
        synchronized (mVar) {
            try {
                mVar.f43347m.clear();
                for (int i10 = 0; i10 < mVar.l.size(); i10++) {
                    mVar.f43347m.add((SurfaceControl.Transaction) mVar.l.get(i10));
                }
                mVar.l.clear();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void unregisterTexture(long j10) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeUnregisterTexture(this.nativeShellHolderId.longValue(), j10);
    }

    public void updateDisplayMetrics(int i10, float f10, float f11, float f12) {
        displayWidth = f10;
        displayHeight = f11;
        displayDensity = f12;
        if (loadLibraryCalled) {
            nativeUpdateDisplayMetrics(this.nativeShellHolderId.longValue());
        }
    }

    public void updateJavaAssetManager(@NonNull AssetManager assetManager, @NonNull String str) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeUpdateJavaAssetManager(this.nativeShellHolderId.longValue(), assetManager, str);
    }

    public void updateRefreshRate() {
        if (loadLibraryCalled) {
            nativeUpdateRefreshRate(refreshRateFPS);
        }
    }

    public void dispatchSemanticsAction(int i10, @NonNull d dVar, @Nullable Object obj) {
        ByteBuffer byteBufferA;
        int iPosition;
        ensureAttachedToNative();
        if (obj != null) {
            byteBufferA = xi.u.f53827a.a(obj);
            iPosition = byteBufferA.position();
        } else {
            byteBufferA = null;
            iPosition = 0;
        }
        dispatchSemanticsAction(i10, dVar.f43444a, byteBufferA, iPosition);
    }

    public void dispatchSemanticsAction(int i10, int i11, @Nullable ByteBuffer byteBuffer, int i12) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeDispatchSemanticsAction(this.nativeShellHolderId.longValue(), i10, i11, byteBuffer, i12);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$loadLibrary$0(String str) {
    }
}
