package com.facebook.ads.internal.dynamicloading;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.util.Log;
import com.bumptech.glide.load.resource.a;
import com.facebook.ads.AudienceNetworkAds;
import com.facebook.ads.BuildConfig;
import com.facebook.ads.internal.settings.MultithreadedBundleWrapper;
import com.facebook.ads.internal.util.common.ANActivityLifecycleCallbacksListener;
import com.facebook.ads.internal.util.common.Preconditions;
import dalvik.system.DexClassLoader;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes3.dex */
public class DynamicLoaderFactory {
    private static final String AUDIENCE_NETWORK_CODE_PATH = "audience_network";
    public static final String AUDIENCE_NETWORK_DEX_FOLDER_NAME = "audience_network";
    private static final String CODE_CACHE_DIR = "code_cache";
    static final String DEX_LOADING_ERROR_MESSAGE = "Can't load Audience Network Dex. Please, check that audience_network folder is inside of assets folder.";
    private static final int DEX_LOAD_RETRY_COUNT = 3;
    private static final int DEX_LOAD_RETRY_DELAY_MS = 200;
    private static final String OPTIMIZED_DEX_PATH = "optimized";
    private static boolean sFallbackMode;
    private static final String DYNAMIC_LOADING_BUILD_TYPE = "releaseDL";
    public static final boolean LOAD_FROM_ASSETS = DYNAMIC_LOADING_BUILD_TYPE.equals(BuildConfig.BUILD_TYPE);
    public static final AtomicReference<DynamicLoader> sDynamicLoader = new AtomicReference<>();
    private static final AtomicBoolean sInitializing = new AtomicBoolean();

    public interface RemoteClassLoaderFactory {
        ClassLoader create(Context context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static AudienceNetworkAds.InitResult createErrorInitResult(final Throwable th) {
        return new AudienceNetworkAds.InitResult() { // from class: com.facebook.ads.internal.dynamicloading.DynamicLoaderFactory.3
            @Override // com.facebook.ads.AudienceNetworkAds.InitResult
            public final String getMessage() {
                return DynamicLoaderFactory.createErrorMessage(th);
            }

            @Override // com.facebook.ads.AudienceNetworkAds.InitResult
            public final boolean isSuccess() {
                return false;
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String createErrorMessage(Throwable th) {
        return "Can't load Audience Network Dex. Please, check that audience_network folder is inside of assets folder.\n" + stackTraceToString(th);
    }

    private static ClassLoader createInMemoryClassLoader(Context context) throws IOException {
        try {
            ClassLoader classLoaderCreate = ((RemoteClassLoaderFactory) context.getClassLoader().loadClass("com.facebook.ads.internal.dynamicloading.RemoteClassLoaderFactoryImpl").getDeclaredConstructor(new Class[0]).newInstance(new Object[0])).create(context);
            if (classLoaderCreate != null) {
                return classLoaderCreate;
            }
        } catch (Exception unused) {
            FlashPreferences.getSharedPreferences(context).edit().clear().apply();
        }
        String[] list = context.getAssets().list("audience_network");
        if (list == null || list.length == 0) {
            Log.e(AudienceNetworkAds.TAG, "Failed to find assets in audience_network");
            throw new RuntimeException("Failed to find assets in audience_network");
        }
        ByteBuffer[] byteBufferArr = new ByteBuffer[list.length];
        for (int i2 = 0; i2 < list.length; i2++) {
            String str = list[i2];
            InputStream inputStreamOpen = context.getAssets().open("audience_network" + File.separator + str);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byte[] bArr = new byte[1024];
            while (true) {
                int i3 = inputStreamOpen.read(bArr);
                if (i3 > 0) {
                    byteArrayOutputStream.write(bArr, 0, i3);
                }
            }
            inputStreamOpen.close();
            byteArrayOutputStream.flush();
            byteArrayOutputStream.close();
            byteBufferArr[i2] = ByteBuffer.wrap(byteArrayOutputStream.toByteArray());
        }
        a.l();
        return androidx.webkit.internal.a.d(byteBufferArr, DynamicLoaderFactory.class.getClassLoader());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void doCallInitialize(Context context, DynamicLoader dynamicLoader, final Throwable th, boolean z2, MultithreadedBundleWrapper multithreadedBundleWrapper, final AudienceNetworkAds.InitListener initListener) {
        if (th != null) {
            if (initListener != null) {
                new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: com.facebook.ads.internal.dynamicloading.DynamicLoaderFactory.2
                    @Override // java.lang.Runnable
                    public final void run() {
                        initListener.onInitialized(DynamicLoaderFactory.createErrorInitResult(th));
                    }
                }, 100L);
                return;
            } else {
                Log.e(AudienceNetworkAds.TAG, DEX_LOADING_ERROR_MESSAGE, th);
                return;
            }
        }
        if (dynamicLoader != null) {
            if (z2) {
                dynamicLoader.createAudienceNetworkAdsApi().onContentProviderCreated(context);
            } else {
                dynamicLoader.createAudienceNetworkAdsApi().initialize(context, multithreadedBundleWrapper, initListener);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static DynamicLoader doMakeLoader(Context context, boolean z2) throws Exception {
        DynamicLoader dynamicLoader;
        AtomicReference<DynamicLoader> atomicReference = sDynamicLoader;
        DynamicLoader dynamicLoader2 = atomicReference.get();
        if (dynamicLoader2 != null) {
            return dynamicLoader2;
        }
        if (LOAD_FROM_ASSETS) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            dynamicLoader = (DynamicLoader) makeAdsSdkClassLoader(context.getApplicationContext()).loadClass("com.facebook.ads.internal.dynamicloading.DynamicLoaderImpl").newInstance();
            Log.d(AudienceNetworkAds.TAG, "SDK dex loading time: " + (System.currentTimeMillis() - jCurrentTimeMillis));
        } else {
            dynamicLoader = (DynamicLoader) Class.forName("com.facebook.ads.internal.dynamicloading.DynamicLoaderImpl").newInstance();
        }
        if (z2) {
            dynamicLoader.maybeInitInternally(context);
        }
        atomicReference.set(dynamicLoader);
        return dynamicLoader;
    }

    private static Context getApplicationContextViaReflection() {
        try {
            return (Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null);
        } catch (Throwable th) {
            Log.e(AudienceNetworkAds.TAG, "Failed to fetch Context from  ActivityThread. Audience Network SDK won't work unless you call AudienceNetworkAds.buildInitSettings().withListener(InitListener).initialize().", th);
            return null;
        }
    }

    private static File getCacheCodeDirLegacy(Context context, File file) throws IOException {
        File file2 = new File(file, CODE_CACHE_DIR);
        try {
            mkdirChecked(file2);
            return file2;
        } catch (IOException unused) {
            File dir = context.getDir(CODE_CACHE_DIR, 0);
            mkdirChecked(dir);
            return dir;
        }
    }

    private static File getCodeCacheDir(Context context, File file) throws IOException {
        return context.getCodeCacheDir();
    }

    public static DynamicLoader getDynamicLoader() {
        return sDynamicLoader.get();
    }

    private static File getSecondaryDir(File file) throws IOException {
        File file2 = new File(file, "audience_network");
        mkdirChecked(file2);
        return file2;
    }

    public static void initialize(final Context context, final MultithreadedBundleWrapper multithreadedBundleWrapper, final AudienceNetworkAds.InitListener initListener, final boolean z2) {
        if (z2 || !sInitializing.getAndSet(true)) {
            new Thread(new Runnable() { // from class: com.facebook.ads.internal.dynamicloading.DynamicLoaderFactory.1
                @Override // java.lang.Runnable
                public final void run() {
                    Throwable th;
                    DynamicLoader dynamicLoader;
                    ANActivityLifecycleCallbacksListener.registerActivityCallbacks(context);
                    synchronized (DynamicLoaderFactory.class) {
                        DynamicLoader dynamicLoaderDoMakeLoader = null;
                        th = null;
                        for (int i2 = 0; i2 < 3; i2++) {
                            try {
                                dynamicLoaderDoMakeLoader = DynamicLoaderFactory.doMakeLoader(context, false);
                                break;
                            } catch (Throwable th2) {
                                if (i2 == 2) {
                                    try {
                                        if (!z2) {
                                            DexLoadErrorReporter.reportDexLoadingIssue(context, DynamicLoaderFactory.createErrorMessage(th2), 0.1d);
                                            DynamicLoaderFactory.setFallbackMode(true);
                                        }
                                        th = th2;
                                    } catch (Throwable th3) {
                                        throw th3;
                                    }
                                } else {
                                    SystemClock.sleep(200L);
                                }
                            }
                        }
                        dynamicLoader = dynamicLoaderDoMakeLoader;
                    }
                    DynamicLoaderFactory.doCallInitialize(context, dynamicLoader, th, z2, multithreadedBundleWrapper, initListener);
                    DynamicLoaderFactory.sInitializing.set(false);
                }
            }).start();
        }
    }

    public static synchronized boolean isFallbackMode() {
        return sFallbackMode;
    }

    private static ClassLoader makeAdsSdkClassLoader(Context context) throws Exception {
        return Build.VERSION.SDK_INT >= 30 ? createInMemoryClassLoader(context) : makeLegacyAdsSdkClassLoader(context);
    }

    private static DexClassLoader makeLegacyAdsSdkClassLoader(Context context) throws Exception {
        String path = context.getFilesDir().getPath();
        String[] list = context.getAssets().list("audience_network");
        if (list == null || list.length == 0) {
            Log.e(AudienceNetworkAds.TAG, "Failed to find assets in audience_network");
            throw new RuntimeException("Failed to find assets in audience_network");
        }
        int length = list.length;
        String[] strArr = new String[length];
        for (int i2 = 0; i2 < list.length; i2++) {
            String str = list[i2];
            StringBuilder sbW = android.support.v4.media.a.w(path);
            String str2 = File.separator;
            strArr[i2] = android.support.v4.media.a.r(sbW, str2, str);
            InputStream inputStreamOpen = context.getAssets().open("audience_network" + str2 + str);
            FileOutputStream fileOutputStream = new FileOutputStream(strArr[i2]);
            byte[] bArr = new byte[1024];
            while (true) {
                int i3 = inputStreamOpen.read(bArr);
                if (i3 > 0) {
                    fileOutputStream.write(bArr, 0, i3);
                }
            }
            inputStreamOpen.close();
            fileOutputStream.flush();
            fileOutputStream.close();
        }
        String str3 = File.pathSeparator;
        if (str3 == null) {
            throw new NullPointerException("delimiter");
        }
        StringBuilder sb = new StringBuilder();
        if (length > 0) {
            sb.append((CharSequence) strArr[0]);
            for (int i4 = 1; i4 < length; i4++) {
                sb.append((CharSequence) str3);
                sb.append((CharSequence) strArr[i4]);
            }
        }
        return new DexClassLoader(sb.toString(), context.getDir(OPTIMIZED_DEX_PATH, 0).getPath(), null, DynamicLoaderFactory.class.getClassLoader());
    }

    public static synchronized DynamicLoader makeLoader(Context context) {
        return makeLoader(context, true);
    }

    public static synchronized DynamicLoader makeLoaderUnsafe() {
        AtomicReference<DynamicLoader> atomicReference = sDynamicLoader;
        if (atomicReference.get() != null) {
            return atomicReference.get();
        }
        Context applicationContextViaReflection = getApplicationContextViaReflection();
        if (applicationContextViaReflection == null) {
            throw new RuntimeException("You must call AudienceNetworkAds.buildInitSettings(Context).initialize() before you can use Audience Network SDK.");
        }
        return makeLoader(applicationContextViaReflection, true);
    }

    private static void mkdirChecked(File file) throws IOException {
        String str;
        file.mkdir();
        if (file.isDirectory()) {
            return;
        }
        File parentFile = file.getParentFile();
        if (parentFile == null) {
            str = "Failed to create dir " + file.getPath() + ". Parent file is null.";
        } else {
            str = "Failed to create dir " + file.getPath() + ". parent file is a dir " + parentFile.isDirectory() + ", a file " + parentFile.isFile() + ", exists " + parentFile.exists() + ", readable " + parentFile.canRead() + ", writable " + parentFile.canWrite();
        }
        Log.e(AudienceNetworkAds.TAG, str);
        throw new IOException("Failed to create directory " + file.getPath() + ", detailed message: " + str);
    }

    public static synchronized void setFallbackMode(boolean z2) {
        try {
            if (z2) {
                sDynamicLoader.set(DynamicLoaderFallback.makeFallbackLoader());
                sFallbackMode = true;
            } else {
                sDynamicLoader.set(null);
                sFallbackMode = false;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    private static String stackTraceToString(Throwable th) {
        return Log.getStackTraceString(th);
    }

    public static synchronized DynamicLoader makeLoader(Context context, boolean z2) {
        Preconditions.checkNotNull(context, "Context can not be null.");
        try {
        } catch (Throwable th) {
            Log.e(AudienceNetworkAds.TAG, DEX_LOADING_ERROR_MESSAGE, th);
            DexLoadErrorReporter.reportDexLoadingIssue(context, createErrorMessage(th), 0.1d);
            DynamicLoader dynamicLoaderMakeFallbackLoader = DynamicLoaderFallback.makeFallbackLoader();
            sDynamicLoader.set(dynamicLoaderMakeFallbackLoader);
            sFallbackMode = true;
            return dynamicLoaderMakeFallbackLoader;
        }
        return doMakeLoader(context, z2);
    }
}
