package webby;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.iab.omid.library.vungle.Omid;
import com.ironsource.X3;
import com.vungle.ads.internal.util.arytenoidectomy;
import com.vungle.ads.rotuma;
import interaction.formularize;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import p002kotlin.Metadata;
import p002kotlin.Result;
import p002kotlin.Unit;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.text.Charsets;

/* JADX INFO: compiled from: OMInjector.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 &2\u00020\u0001:\u0001'B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0011\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\u000b\u001a\u0004\u0018\u00010\u00062\b\b\u0001\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ!\u0010\u0010\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\r\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0013\u0010\u0014J\u001d\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00162\u0006\u0010\u0015\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0011\u0010\u001b\u001a\u0004\u0018\u00010\u0006H\u0000¢\u0006\u0004\b\u001a\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0014\u0010 \u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u001c\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00060\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$R\u001c\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00060\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010$¨\u0006("}, d2 = {"Lwebby/saneness;", "", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "", "getOMSessionJS", "()Ljava/lang/String;", "", "resId", "loadJsFromRaw", "(I)Ljava/lang/String;", "lines", "Ljava/io/File;", "outputFile", "writeToFile", "(Ljava/lang/String;Ljava/io/File;)Ljava/io/File;", "", X3.a.f, "()V", "dir", "", "injectJsFiles$vungle_ads_release", "(Ljava/io/File;)Ljava/util/List;", "injectJsFiles", "getOMSDKJS$vungle_ads_release", "getOMSDKJS", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "Landroid/os/Handler;", "uiHandler", "Landroid/os/Handler;", "Ljava/util/concurrent/atomic/AtomicReference;", "cachedOMSDKJS", "Ljava/util/concurrent/atomic/AtomicReference;", "cachedOMSessionJS", "Companion", "attabal", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class saneness {
    private static final String TAG = "OMInjector";
    private AtomicReference<String> cachedOMSDKJS;
    private AtomicReference<String> cachedOMSessionJS;
    private final Context context;
    private final Handler uiHandler;

    public saneness(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
        this.uiHandler = new Handler(Looper.getMainLooper());
        this.cachedOMSDKJS = new AtomicReference<>(null);
        this.cachedOMSessionJS = new AtomicReference<>(null);
    }

    private final String getOMSessionJS() {
        String str = this.cachedOMSessionJS.get();
        if (str != null) {
            return str;
        }
        String strLoadJsFromRaw = loadJsFromRaw(rotuma.omid_session_client_v1_6_2);
        this.cachedOMSessionJS.set(strLoadJsFromRaw);
        return strLoadJsFromRaw;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: init$lambda-2, reason: not valid java name */
    public static final void m3370init$lambda2(saneness this$0) {
        Object objM3351constructorimpl;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        try {
            Result.Companion companion = Result.INSTANCE;
            if (!Omid.isActive()) {
                Omid.activate(this$0.context);
            }
            objM3351constructorimpl = Result.m3351constructorimpl(Unit.f29295attabal);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM3351constructorimpl = Result.m3351constructorimpl(p002kotlin.dern.attabal(th));
        }
        Throwable thM3354exceptionOrNullimpl = Result.m3354exceptionOrNullimpl(objM3351constructorimpl);
        if (thM3354exceptionOrNullimpl != null) {
            arytenoidectomy.INSTANCE.e(TAG, "error: " + thM3354exceptionOrNullimpl.getLocalizedMessage());
        }
    }

    private final String loadJsFromRaw(int resId) {
        Object objM3351constructorimpl;
        try {
            Result.Companion companion = Result.INSTANCE;
            InputStream inputStreamOpenRawResource = this.context.getResources().openRawResource(resId);
            Intrinsics.checkNotNullExpressionValue(inputStreamOpenRawResource, "context.resources.openRawResource(resId)");
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStreamOpenRawResource, Charsets.UTF_8), 8192);
            try {
                String strImpromptu = formularize.impromptu(bufferedReader);
                interaction.saneness.attabal(bufferedReader, null);
                objM3351constructorimpl = Result.m3351constructorimpl(strImpromptu);
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    interaction.saneness.attabal(bufferedReader, th);
                    throw th2;
                }
            }
        } catch (Throwable th3) {
            Result.Companion companion2 = Result.INSTANCE;
            objM3351constructorimpl = Result.m3351constructorimpl(p002kotlin.dern.attabal(th3));
        }
        return (String) (Result.m3356isFailureimpl(objM3351constructorimpl) ? null : objM3351constructorimpl);
    }

    private final File writeToFile(String lines, File outputFile) throws IOException {
        if (lines == null) {
            throw new IOException("omsdk js must not be null");
        }
        FileWriter fileWriter = new FileWriter(outputFile);
        try {
            fileWriter.write(lines);
            fileWriter.flush();
            interaction.saneness.attabal(fileWriter, null);
            return outputFile;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                interaction.saneness.attabal(fileWriter, th);
                throw th2;
            }
        }
    }

    public final Context getContext() {
        return this.context;
    }

    public final String getOMSDKJS$vungle_ads_release() {
        String str = this.cachedOMSDKJS.get();
        if (str != null) {
            return str;
        }
        String strLoadJsFromRaw = loadJsFromRaw(rotuma.omsdk_v1_6_2);
        this.cachedOMSDKJS.set(strLoadJsFromRaw);
        return strLoadJsFromRaw;
    }

    public final void init() {
        this.uiHandler.post(new Runnable() { // from class: webby.attabal
            @Override // java.lang.Runnable
            public final void run() {
                saneness.m3370init$lambda2(this.f39609kowloon);
            }
        });
    }

    public final List<File> injectJsFiles$vungle_ads_release(File dir) throws IOException {
        Intrinsics.checkNotNullParameter(dir, "dir");
        ArrayList arrayList = new ArrayList();
        File file = new File(dir, com.vungle.ads.internal.saneness.OM_SDK_JS);
        if (!file.exists()) {
            arytenoidectomy.INSTANCE.d(TAG, "injecting omsdk.js to " + file.getAbsolutePath());
            String oMSDKJS$vungle_ads_release = getOMSDKJS$vungle_ads_release();
            if (oMSDKJS$vungle_ads_release != null) {
                writeToFile(oMSDKJS$vungle_ads_release, file);
            }
            arrayList.add(file);
        }
        File file2 = new File(dir, com.vungle.ads.internal.saneness.OM_SESSION_JS);
        if (!file2.exists()) {
            arytenoidectomy.INSTANCE.d(TAG, "injecting omsdk-session.js to " + file2.getAbsolutePath());
            String oMSessionJS = getOMSessionJS();
            if (oMSessionJS != null) {
                writeToFile(oMSessionJS, file2);
            }
            arrayList.add(file2);
        }
        return arrayList;
    }
}
