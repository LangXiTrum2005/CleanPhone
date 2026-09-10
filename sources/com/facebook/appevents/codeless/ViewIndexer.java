package com.facebook.appevents.codeless;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Base64;
import android.util.Log;
import android.view.View;
import androidx.core.app.NotificationCompat;
import b2.o;
import com.facebook.appevents.codeless.internal.Constants;
import com.facebook.appevents.codeless.internal.ViewHierarchy;
import com.facebook.appevents.internal.AppEventUtility;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.ironsource.C0526q2;
import com.mbridge.msdk.foundation.tools.SameMD5;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import go.k;
import java.io.ByteArrayOutputStream;
import java.lang.ref.WeakReference;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.Date;
import java.util.Locale;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.n;
import l7.a;
import l7.b0;
import l7.e0;
import l7.g0;
import l7.s;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import q7.x;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 \u001e2\u00020\u0001:\u0002\u001e\u001fB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\r\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\r\u001a\u00020\b¢\u0006\u0004\b\r\u0010\fJ!\u0010\u0011\u001a\u00020\b2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0018\u0010\u001c\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006 "}, d2 = {"Lcom/facebook/appevents/codeless/ViewIndexer;", "", "Landroid/app/Activity;", "activity", "<init>", "(Landroid/app/Activity;)V", "", ViewIndexer.TREE_PARAM, "Lwj/r;", "sendToServer", "(Ljava/lang/String;)V", "schedule", "()V", "unschedule", "Ll7/b0;", "request", "currentDigest", "processRequest", "(Ll7/b0;Ljava/lang/String;)V", "Landroid/os/Handler;", "uiThreadHandler", "Landroid/os/Handler;", "Ljava/lang/ref/WeakReference;", "activityReference", "Ljava/lang/ref/WeakReference;", "Ljava/util/Timer;", "indexingTimer", "Ljava/util/Timer;", "previousDigest", "Ljava/lang/String;", "Companion", "ScreenshotTaker", "facebook-core_release"}, k = 1, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
public final class ViewIndexer {
    private static final String APP_VERSION_PARAM = "app_version";

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final String PLATFORM_PARAM = "platform";
    private static final String REQUEST_TYPE = "request_type";
    private static final String SUCCESS = "success";
    private static final String TAG;
    private static final String TREE_PARAM = "tree";
    private static ViewIndexer instance;
    private final WeakReference<Activity> activityReference;
    private Timer indexingTimer;
    private String previousDigest;
    private final Handler uiThreadHandler;

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ7\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\u0010\t\u001a\u0004\u0018\u00010\u00042\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\f\u001a\u0004\u0018\u00010\u00042\u0006\u0010\r\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0013\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0012R\u0014\u0010\u0014\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0012R\u0014\u0010\u0015\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0012R\u0014\u0010\u0017\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0017\u0010\u0012R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lcom/facebook/appevents/codeless/ViewIndexer$Companion;", "", "<init>", "()V", "", ViewIndexer.TREE_PARAM, "Lwj/r;", "sendToServerUnityInstance", "(Ljava/lang/String;)V", "appIndex", "Ll7/a;", "accessToken", "appId", "requestType", "Ll7/b0;", "buildAppIndexingRequest", "(Ljava/lang/String;Ll7/a;Ljava/lang/String;Ljava/lang/String;)Ll7/b0;", "APP_VERSION_PARAM", "Ljava/lang/String;", "PLATFORM_PARAM", "REQUEST_TYPE", "SUCCESS", "TAG", "TREE_PARAM", "Lcom/facebook/appevents/codeless/ViewIndexer;", C0526q2.f30050p, "Lcom/facebook/appevents/codeless/ViewIndexer;", "facebook-core_release"}, k = 1, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
    public static final class Companion {
        public /* synthetic */ Companion(g gVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void buildAppIndexingRequest$lambda$0(e0 it) {
            n.f(it, "it");
            x.f48792c.s(g0.f45136d, ViewIndexer.access$getTAG$cp(), "App index sent to FB!");
        }

        public final b0 buildAppIndexingRequest(String appIndex, a accessToken, String appId, String requestType) {
            n.f(requestType, "requestType");
            if (appIndex == null) {
                return null;
            }
            String str = b0.f45085j;
            int i10 = 1;
            b0 b0VarA = j2.n.A(accessToken, String.format(Locale.US, "%s/app_indexing", Arrays.copyOf(new Object[]{appId}, 1)), null, null);
            Bundle bundle = b0VarA.f45090d;
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putString(ViewIndexer.TREE_PARAM, appIndex);
            bundle.putString(ViewIndexer.APP_VERSION_PARAM, AppEventUtility.getAppVersion());
            bundle.putString("platform", "android");
            bundle.putString(ViewIndexer.REQUEST_TYPE, requestType);
            if (requestType.equals(Constants.APP_INDEXING)) {
                bundle.putString(Constants.DEVICE_SESSION_ID, CodelessManager.getCurrentDeviceSessionID$facebook_core_release());
            }
            b0VarA.f45090d = bundle;
            b0VarA.j(new com.facebook.appevents.cloudbridge.a(i10));
            return b0VarA;
        }

        public final void sendToServerUnityInstance(String tree) {
            n.f(tree, "tree");
            ViewIndexer viewIndexerAccess$getInstance$cp = ViewIndexer.access$getInstance$cp();
            if (viewIndexerAccess$getInstance$cp != null) {
                ViewIndexer.access$sendToServer(viewIndexerAccess$getInstance$cp, tree);
            }
        }

        private Companion() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\b\u0010\u0007\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/facebook/appevents/codeless/ViewIndexer$ScreenshotTaker;", "Ljava/util/concurrent/Callable;", "", "rootView", "Landroid/view/View;", "(Landroid/view/View;)V", "Ljava/lang/ref/WeakReference;", NotificationCompat.CATEGORY_CALL, "facebook-core_release"}, k = 1, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
    public static final class ScreenshotTaker implements Callable<String> {
        private final WeakReference<View> rootView;

        public ScreenshotTaker(View rootView) {
            n.f(rootView, "rootView");
            this.rootView = new WeakReference<>(rootView);
        }

        @Override // java.util.concurrent.Callable
        public String call() {
            View view = this.rootView.get();
            if (view == null || view.getWidth() == 0 || view.getHeight() == 0) {
                return "";
            }
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(view.getWidth(), view.getHeight(), Bitmap.Config.RGB_565);
            n.e(bitmapCreateBitmap, "createBitmap(view.width,…t, Bitmap.Config.RGB_565)");
            view.draw(new Canvas(bitmapCreateBitmap));
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            bitmapCreateBitmap.compress(Bitmap.CompressFormat.JPEG, 10, byteArrayOutputStream);
            String strEncodeToString = Base64.encodeToString(byteArrayOutputStream.toByteArray(), 2);
            n.e(strEncodeToString, "encodeToString(outputStr…eArray(), Base64.NO_WRAP)");
            return strEncodeToString;
        }
    }

    static {
        String canonicalName = ViewIndexer.class.getCanonicalName();
        if (canonicalName == null) {
            canonicalName = "";
        }
        TAG = canonicalName;
    }

    public ViewIndexer(Activity activity) {
        n.f(activity, "activity");
        this.activityReference = new WeakReference<>(activity);
        this.previousDigest = null;
        this.uiThreadHandler = new Handler(Looper.getMainLooper());
        instance = this;
    }

    public static final /* synthetic */ WeakReference access$getActivityReference$p(ViewIndexer viewIndexer) {
        if (v7.a.b(ViewIndexer.class)) {
            return null;
        }
        try {
            return viewIndexer.activityReference;
        } catch (Throwable th2) {
            v7.a.a(ViewIndexer.class, th2);
            return null;
        }
    }

    public static final /* synthetic */ ViewIndexer access$getInstance$cp() {
        if (v7.a.b(ViewIndexer.class)) {
            return null;
        }
        try {
            return instance;
        } catch (Throwable th2) {
            v7.a.a(ViewIndexer.class, th2);
            return null;
        }
    }

    public static final /* synthetic */ String access$getTAG$cp() {
        if (v7.a.b(ViewIndexer.class)) {
            return null;
        }
        try {
            return TAG;
        } catch (Throwable th2) {
            v7.a.a(ViewIndexer.class, th2);
            return null;
        }
    }

    public static final /* synthetic */ Handler access$getUiThreadHandler$p(ViewIndexer viewIndexer) {
        if (v7.a.b(ViewIndexer.class)) {
            return null;
        }
        try {
            return viewIndexer.uiThreadHandler;
        } catch (Throwable th2) {
            v7.a.a(ViewIndexer.class, th2);
            return null;
        }
    }

    public static final /* synthetic */ void access$sendToServer(ViewIndexer viewIndexer, String str) {
        if (v7.a.b(ViewIndexer.class)) {
            return;
        }
        try {
            viewIndexer.sendToServer(str);
        } catch (Throwable th2) {
            v7.a.a(ViewIndexer.class, th2);
        }
    }

    public static final b0 buildAppIndexingRequest(String str, a aVar, String str2, String str3) {
        if (v7.a.b(ViewIndexer.class)) {
            return null;
        }
        try {
            return INSTANCE.buildAppIndexingRequest(str, aVar, str2, str3);
        } catch (Throwable th2) {
            v7.a.a(ViewIndexer.class, th2);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void schedule$lambda$0(ViewIndexer this$0, TimerTask indexingTask) {
        if (v7.a.b(ViewIndexer.class)) {
            return;
        }
        try {
            n.f(this$0, "this$0");
            n.f(indexingTask, "$indexingTask");
            try {
                Timer timer = this$0.indexingTimer;
                if (timer != null) {
                    timer.cancel();
                }
                this$0.previousDigest = null;
                Timer timer2 = new Timer();
                timer2.scheduleAtFixedRate(indexingTask, 0L, 1000L);
                this$0.indexingTimer = timer2;
            } catch (Exception e10) {
                Log.e(TAG, "Error scheduling indexing job", e10);
            }
        } catch (Throwable th2) {
            v7.a.a(ViewIndexer.class, th2);
        }
    }

    private final void sendToServer(String tree) {
        if (v7.a.b(this)) {
            return;
        }
        try {
            s.d().execute(new o(16, tree, this));
        } catch (Throwable th2) {
            v7.a.a(this, th2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void sendToServer$lambda$1(String tree, ViewIndexer this$0) {
        String string;
        if (v7.a.b(ViewIndexer.class)) {
            return;
        }
        try {
            n.f(tree, "$tree");
            n.f(this$0, "this$0");
            byte[] bytes = tree.getBytes(an.a.f3768a);
            n.e(bytes, "this as java.lang.String).getBytes(charset)");
            try {
                MessageDigest hash = MessageDigest.getInstance(SameMD5.TAG);
                n.e(hash, "hash");
                hash.update(bytes);
                byte[] digest = hash.digest();
                StringBuilder sb2 = new StringBuilder();
                n.e(digest, "digest");
                for (byte b10 : digest) {
                    sb2.append(Integer.toHexString((b10 >> 4) & 15));
                    sb2.append(Integer.toHexString(b10 & 15));
                }
                string = sb2.toString();
                n.e(string, "builder.toString()");
            } catch (NoSuchAlgorithmException unused) {
                string = null;
            }
            Date date = a.l;
            a aVarD = k.D();
            if (string == null || !string.equals(this$0.previousDigest)) {
                this$0.processRequest(INSTANCE.buildAppIndexingRequest(tree, aVarD, s.c(), Constants.APP_INDEXING), string);
            }
        } catch (Throwable th2) {
            v7.a.a(ViewIndexer.class, th2);
        }
    }

    public static final void sendToServerUnityInstance(String str) {
        if (v7.a.b(ViewIndexer.class)) {
            return;
        }
        try {
            INSTANCE.sendToServerUnityInstance(str);
        } catch (Throwable th2) {
            v7.a.a(ViewIndexer.class, th2);
        }
    }

    public final void processRequest(b0 request, String currentDigest) {
        if (v7.a.b(this) || request == null) {
            return;
        }
        try {
            e0 e0VarC = request.c();
            try {
                JSONObject jSONObject = e0VarC.f45110b;
                if (jSONObject == null) {
                    Log.e(TAG, "Error sending UI component tree to Facebook: " + e0VarC.f45111c);
                    return;
                }
                if (com.ironsource.mediationsdk.metadata.a.f29610g.equals(jSONObject.optString("success"))) {
                    x.f48792c.s(g0.f45136d, TAG, "Successfully send UI component tree to server");
                    this.previousDigest = currentDigest;
                }
                if (jSONObject.has(Constants.APP_INDEXING_ENABLED)) {
                    CodelessManager.updateAppIndexing$facebook_core_release(jSONObject.getBoolean(Constants.APP_INDEXING_ENABLED));
                }
            } catch (JSONException e10) {
                Log.e(TAG, "Error decoding server response.", e10);
            }
        } catch (Throwable th2) {
            v7.a.a(this, th2);
        }
    }

    public final void schedule() {
        if (v7.a.b(this)) {
            return;
        }
        try {
            try {
                s.d().execute(new o(15, this, new TimerTask() { // from class: com.facebook.appevents.codeless.ViewIndexer$schedule$indexingTask$1
                    @Override // java.util.TimerTask, java.lang.Runnable
                    public void run() {
                        try {
                            Activity activity = (Activity) ViewIndexer.access$getActivityReference$p(this.this$0).get();
                            View rootView = AppEventUtility.getRootView(activity);
                            if (activity != null && rootView != null) {
                                String simpleName = activity.getClass().getSimpleName();
                                if (CodelessManager.getIsAppIndexingEnabled$facebook_core_release()) {
                                    FutureTask futureTask = new FutureTask(new ViewIndexer.ScreenshotTaker(rootView));
                                    ViewIndexer.access$getUiThreadHandler$p(this.this$0).post(futureTask);
                                    String str = "";
                                    try {
                                        str = (String) futureTask.get(1L, TimeUnit.SECONDS);
                                    } catch (Exception e10) {
                                        Log.e(ViewIndexer.access$getTAG$cp(), "Failed to take screenshot.", e10);
                                    }
                                    JSONObject jSONObject = new JSONObject();
                                    try {
                                        jSONObject.put(ViewHierarchyConstants.SCREEN_NAME_KEY, simpleName);
                                        jSONObject.put("screenshot", str);
                                        JSONArray jSONArray = new JSONArray();
                                        jSONArray.put(ViewHierarchy.getDictionaryOfView(rootView));
                                        jSONObject.put("view", jSONArray);
                                    } catch (JSONException unused) {
                                        Log.e(ViewIndexer.access$getTAG$cp(), "Failed to create JSONObject");
                                    }
                                    String string = jSONObject.toString();
                                    n.e(string, "viewTree.toString()");
                                    ViewIndexer.access$sendToServer(this.this$0, string);
                                }
                            }
                        } catch (Exception e11) {
                            Log.e(ViewIndexer.access$getTAG$cp(), "UI Component tree indexing failure!", e11);
                        }
                    }
                }));
            } catch (RejectedExecutionException e10) {
                Log.e(TAG, "Error scheduling indexing job", e10);
            }
        } catch (Throwable th2) {
            v7.a.a(this, th2);
        }
    }

    public final void unschedule() {
        if (v7.a.b(this)) {
            return;
        }
        try {
            if (this.activityReference.get() == null) {
                return;
            }
            try {
                Timer timer = this.indexingTimer;
                if (timer != null) {
                    timer.cancel();
                }
                this.indexingTimer = null;
            } catch (Exception e10) {
                Log.e(TAG, "Error unscheduling indexing job", e10);
            }
        } catch (Throwable th2) {
            v7.a.a(this, th2);
        }
    }
}
