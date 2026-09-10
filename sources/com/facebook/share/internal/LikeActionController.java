package com.facebook.share.internal;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import androidx.media3.extractor.text.ttml.a;
import com.facebook.AccessToken;
import com.facebook.AccessTokenTracker;
import com.facebook.FacebookException;
import com.facebook.FacebookOperationCanceledException;
import com.facebook.FacebookRequestError;
import com.facebook.FacebookSdk;
import com.facebook.GraphRequest;
import com.facebook.GraphRequestBatch;
import com.facebook.GraphResponse;
import com.facebook.HttpMethod;
import com.facebook.LoggingBehavior;
import com.facebook.appevents.InternalAppEventsLogger;
import com.facebook.internal.AppCall;
import com.facebook.internal.BundleJSONConverter;
import com.facebook.internal.CallbackManagerImpl;
import com.facebook.internal.FileLruCache;
import com.facebook.internal.Logger;
import com.facebook.internal.NativeProtocol;
import com.facebook.internal.PlatformServiceClient;
import com.facebook.internal.Utility;
import com.facebook.internal.WorkQueue;
import com.facebook.internal.instrument.crashshield.CrashShieldHandler;
import com.facebook.share.widget.LikeView;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public class LikeActionController {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static FileLruCache f16534n;
    public static final ConcurrentHashMap o = new ConcurrentHashMap();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final WorkQueue f16535p = new WorkQueue(1, 0);
    public static final WorkQueue q = new WorkQueue(1, 0);
    public static Handler r;
    public static String s;
    public static boolean t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static volatile int f16536u;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f16537a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public LikeView.ObjectType f16538b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f16539c;
    public String d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f16540e;
    public String f;
    public String g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f16541h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f16542i;
    public boolean j;
    public boolean k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Bundle f16543l;
    public InternalAppEventsLogger m;

    /* JADX INFO: renamed from: com.facebook.share.internal.LikeActionController$12, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass12 {
        static {
            try {
                new int[LikeView.ObjectType.values().length][2] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    /* JADX INFO: renamed from: com.facebook.share.internal.LikeActionController$3, reason: invalid class name */
    final class AnonymousClass3 implements CallbackManagerImpl.Callback {
        @Override // com.facebook.internal.CallbackManagerImpl.Callback
        public final boolean a(int i2, Intent intent) {
            int iD = CallbackManagerImpl.RequestCodeOffset.Like.d();
            if (Utility.C(LikeActionController.s)) {
                LikeActionController.s = FacebookSdk.b().getSharedPreferences("com.facebook.LikeActionController.CONTROLLER_STORE_KEY", 0).getString("PENDING_CONTROLLER_KEY", null);
            }
            if (Utility.C(LikeActionController.s)) {
                return false;
            }
            LikeActionController.i(LikeActionController.s, LikeView.ObjectType.UNKNOWN, new CreationCallback(iD, i2, intent) { // from class: com.facebook.share.internal.LikeActionController.1

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ int f16544a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ Intent f16545b;

                {
                    this.f16545b = intent;
                }

                @Override // com.facebook.share.internal.LikeActionController.CreationCallback
                public final void a(final LikeActionController likeActionController, FacebookException facebookException) {
                    if (facebookException != null) {
                        FileLruCache fileLruCache = LikeActionController.f16534n;
                        HashSet hashSet = FacebookSdk.f15915a;
                        return;
                    }
                    final Bundle bundle = likeActionController.f16543l;
                    ShareInternalUtility.f(this.f16544a, this.f16545b, new ResultProcessor() { // from class: com.facebook.share.internal.LikeActionController.6
                        @Override // com.facebook.share.internal.ResultProcessor
                        public final void a(AppCall appCall) {
                            b(appCall, new FacebookOperationCanceledException());
                        }

                        @Override // com.facebook.share.internal.ResultProcessor
                        public final void b(AppCall appCall, FacebookException facebookException2) {
                            LoggingBehavior loggingBehavior = LoggingBehavior.X;
                            FileLruCache fileLruCache2 = LikeActionController.f16534n;
                            HashMap map = Logger.d;
                            FacebookSdk.j(loggingBehavior);
                            Bundle bundle2 = bundle;
                            if (bundle2 == null) {
                                bundle2 = new Bundle();
                            }
                            bundle2.putString("call_id", appCall.b().toString());
                            LikeActionController likeActionController2 = LikeActionController.this;
                            likeActionController2.j(bundle2, "present_dialog");
                            LikeActionController.d(likeActionController2, "com.facebook.sdk.LikeActionController.DID_ERROR", NativeProtocol.c(facebookException2));
                        }

                        @Override // com.facebook.share.internal.ResultProcessor
                        public final void c(AppCall appCall, Bundle bundle2) {
                            String str;
                            String string;
                            String str2;
                            String string2;
                            if (bundle2 == null || !bundle2.containsKey("object_is_liked")) {
                                return;
                            }
                            boolean z2 = bundle2.getBoolean("object_is_liked");
                            LikeActionController likeActionController2 = LikeActionController.this;
                            String str3 = likeActionController2.d;
                            String str4 = likeActionController2.f16540e;
                            if (bundle2.containsKey("like_count_string")) {
                                string = bundle2.getString("like_count_string");
                                str = string;
                            } else {
                                str = str4;
                                string = str3;
                            }
                            String str5 = likeActionController2.f;
                            String str6 = likeActionController2.g;
                            if (bundle2.containsKey("social_sentence")) {
                                string2 = bundle2.getString("social_sentence");
                                str2 = string2;
                            } else {
                                str2 = str6;
                                string2 = str5;
                            }
                            String string3 = bundle2.containsKey("object_is_liked") ? bundle2.getString("unlike_token") : likeActionController2.f16541h;
                            Bundle bundle3 = bundle;
                            if (bundle3 == null) {
                                bundle3 = new Bundle();
                            }
                            bundle3.putString("call_id", appCall.b().toString());
                            likeActionController2.g().d(bundle3, "fb_like_control_dialog_did_succeed");
                            LikeActionController.this.n(z2, string, str, string2, str2, string3);
                        }
                    });
                    likeActionController.f16543l = null;
                    LikeActionController.s = null;
                    FacebookSdk.b().getSharedPreferences("com.facebook.LikeActionController.CONTROLLER_STORE_KEY", 0).edit().putString("PENDING_CONTROLLER_KEY", LikeActionController.s).apply();
                }
            });
            return true;
        }
    }

    /* JADX INFO: renamed from: com.facebook.share.internal.LikeActionController$4, reason: invalid class name */
    final class AnonymousClass4 implements Runnable {
        public final /* synthetic */ CreationCallback X;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        public final /* synthetic */ LikeActionController f16550Y;
        public final /* synthetic */ FacebookException Z;

        public AnonymousClass4(CreationCallback creationCallback, LikeActionController likeActionController, FacebookException facebookException) {
            this.X = creationCallback;
            this.f16550Y = likeActionController;
            this.Z = facebookException;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (CrashShieldHandler.b(this)) {
                return;
            }
            try {
                this.X.a(this.f16550Y, this.Z);
            } catch (Throwable th) {
                CrashShieldHandler.a(this, th);
            }
        }
    }

    /* JADX INFO: renamed from: com.facebook.share.internal.LikeActionController$5, reason: invalid class name */
    final class AnonymousClass5 extends AccessTokenTracker {
        @Override // com.facebook.AccessTokenTracker
        public final void a(AccessToken accessToken, AccessToken accessToken2) {
            Context contextB = FacebookSdk.b();
            if (accessToken2 == null) {
                LikeActionController.f16536u = (LikeActionController.f16536u + 1) % 1000;
                contextB.getSharedPreferences("com.facebook.LikeActionController.CONTROLLER_STORE_KEY", 0).edit().putInt("OBJECT_SUFFIX", LikeActionController.f16536u).apply();
                LikeActionController.o.clear();
                LikeActionController.f16534n.b();
            }
            LikeActionController.d(null, "com.facebook.sdk.LikeActionController.DID_RESET", null);
        }
    }

    public abstract class AbstractRequestWrapper implements RequestWrapper {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public GraphRequest f16564a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f16565b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public FacebookRequestError f16566c;

        public AbstractRequestWrapper(String str, LikeView.ObjectType objectType) {
            this.f16565b = str;
        }

        public void c(FacebookRequestError facebookRequestError) {
            LoggingBehavior loggingBehavior = LoggingBehavior.X;
            FileLruCache fileLruCache = LikeActionController.f16534n;
            HashMap map = Logger.d;
            FacebookSdk.j(loggingBehavior);
        }

        public abstract void d(GraphResponse graphResponse);

        public final void e(GraphRequest graphRequest) {
            this.f16564a = graphRequest;
            graphRequest.f15936e = FacebookSdk.f();
            graphRequest.j(new GraphRequest.Callback() { // from class: com.facebook.share.internal.LikeActionController.AbstractRequestWrapper.1
                @Override // com.facebook.GraphRequest.Callback
                public final void a(GraphResponse graphResponse) {
                    AbstractRequestWrapper abstractRequestWrapper = AbstractRequestWrapper.this;
                    FacebookRequestError facebookRequestError = graphResponse.d;
                    abstractRequestWrapper.f16566c = facebookRequestError;
                    if (facebookRequestError != null) {
                        abstractRequestWrapper.c(facebookRequestError);
                    } else {
                        abstractRequestWrapper.d(graphResponse);
                    }
                }
            });
        }
    }

    public static class CreateLikeActionControllerWorkItem implements Runnable {
        public String X;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        public LikeView.ObjectType f16568Y;
        public CreationCallback Z;

        @Override // java.lang.Runnable
        public final void run() {
            if (CrashShieldHandler.b(this)) {
                return;
            }
            try {
                LikeActionController.c(this.X, this.f16568Y, this.Z);
            } catch (Throwable th) {
                CrashShieldHandler.a(this, th);
            }
        }
    }

    @Deprecated
    public interface CreationCallback {
        void a(LikeActionController likeActionController, FacebookException facebookException);
    }

    public class GetEngagementRequestWrapper extends AbstractRequestWrapper {
        public String d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public String f16569e;
        public String f;
        public String g;

        public GetEngagementRequestWrapper(String str, LikeView.ObjectType objectType) {
            super(str, objectType);
            this.d = LikeActionController.this.d;
            this.f16569e = LikeActionController.this.f16540e;
            this.f = LikeActionController.this.f;
            this.g = LikeActionController.this.g;
            Bundle bundleD = a.d("fields", "engagement.fields(count_string_with_like,count_string_without_like,social_sentence_with_like,social_sentence_without_like)");
            bundleD.putString("locale", Locale.getDefault().toString());
            Date date = AccessToken.m0;
            e(new GraphRequest(AccessToken.Companion.b(), str, bundleD, HttpMethod.X));
        }

        @Override // com.facebook.share.internal.LikeActionController.AbstractRequestWrapper
        public final void c(FacebookRequestError facebookRequestError) {
            LoggingBehavior loggingBehavior = LoggingBehavior.X;
            FileLruCache fileLruCache = LikeActionController.f16534n;
            HashMap map = Logger.d;
            FacebookSdk.j(loggingBehavior);
            LikeActionController.b(LikeActionController.this, "get_engagement", facebookRequestError);
        }

        @Override // com.facebook.share.internal.LikeActionController.AbstractRequestWrapper
        public final void d(GraphResponse graphResponse) {
            JSONObject jSONObject = graphResponse.f15952c;
            JSONObject jSONObjectOptJSONObject = jSONObject != null ? jSONObject.optJSONObject("engagement") : null;
            if (jSONObjectOptJSONObject != null) {
                this.d = jSONObjectOptJSONObject.optString("count_string_with_like", this.d);
                this.f16569e = jSONObjectOptJSONObject.optString("count_string_without_like", this.f16569e);
                this.f = jSONObjectOptJSONObject.optString("social_sentence_with_like", this.f);
                this.g = jSONObjectOptJSONObject.optString("social_sentence_without_like", this.g);
            }
        }
    }

    public class GetOGObjectIdRequestWrapper extends AbstractRequestWrapper {
        public String d;

        @Override // com.facebook.share.internal.LikeActionController.AbstractRequestWrapper
        public final void c(FacebookRequestError facebookRequestError) {
            if (facebookRequestError.a().contains("og_object")) {
                this.f16566c = null;
                return;
            }
            LoggingBehavior loggingBehavior = LoggingBehavior.X;
            FileLruCache fileLruCache = LikeActionController.f16534n;
            HashMap map = Logger.d;
            FacebookSdk.j(loggingBehavior);
        }

        @Override // com.facebook.share.internal.LikeActionController.AbstractRequestWrapper
        public final void d(GraphResponse graphResponse) {
            JSONObject jSONObjectOptJSONObject;
            String str = this.f16565b;
            JSONObject jSONObject = graphResponse.f15952c;
            JSONObject jSONObjectOptJSONObject2 = jSONObject != null ? jSONObject.optJSONObject(str) : null;
            if (jSONObjectOptJSONObject2 == null || (jSONObjectOptJSONObject = jSONObjectOptJSONObject2.optJSONObject("og_object")) == null) {
                return;
            }
            this.d = jSONObjectOptJSONObject.optString("id");
        }
    }

    public class GetOGObjectLikesRequestWrapper extends AbstractRequestWrapper implements LikeRequestWrapper {
        public boolean d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public String f16571e;

        public GetOGObjectLikesRequestWrapper(String str, LikeView.ObjectType objectType) {
            super(str, objectType);
            this.d = LikeActionController.this.f16539c;
            Bundle bundle = new Bundle();
            bundle.putString("fields", "id,application");
            bundle.putString("object", str);
            Date date = AccessToken.m0;
            e(new GraphRequest(AccessToken.Companion.b(), "me/og.likes", bundle, HttpMethod.X));
        }

        @Override // com.facebook.share.internal.LikeActionController.LikeRequestWrapper
        public final boolean a() {
            return this.d;
        }

        @Override // com.facebook.share.internal.LikeActionController.LikeRequestWrapper
        public final String b() {
            return this.f16571e;
        }

        @Override // com.facebook.share.internal.LikeActionController.AbstractRequestWrapper
        public final void c(FacebookRequestError facebookRequestError) {
            LoggingBehavior loggingBehavior = LoggingBehavior.X;
            FileLruCache fileLruCache = LikeActionController.f16534n;
            HashMap map = Logger.d;
            FacebookSdk.j(loggingBehavior);
            LikeActionController.b(LikeActionController.this, "get_og_object_like", facebookRequestError);
        }

        @Override // com.facebook.share.internal.LikeActionController.AbstractRequestWrapper
        public final void d(GraphResponse graphResponse) {
            JSONObject jSONObject = graphResponse.f15952c;
            JSONArray jSONArrayOptJSONArray = jSONObject != null ? jSONObject.optJSONArray("data") : null;
            if (jSONArrayOptJSONArray != null) {
                for (int i2 = 0; i2 < jSONArrayOptJSONArray.length(); i2++) {
                    JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i2);
                    if (jSONObjectOptJSONObject != null) {
                        this.d = true;
                        JSONObject jSONObjectOptJSONObject2 = jSONObjectOptJSONObject.optJSONObject("application");
                        Date date = AccessToken.m0;
                        AccessToken accessTokenB = AccessToken.Companion.b();
                        if (jSONObjectOptJSONObject2 != null && AccessToken.Companion.c() && Utility.a(accessTokenB.i0, jSONObjectOptJSONObject2.optString("id"))) {
                            this.f16571e = jSONObjectOptJSONObject.optString("id");
                        }
                    }
                }
            }
        }
    }

    public class GetPageIdRequestWrapper extends AbstractRequestWrapper {
        public String d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public boolean f16572e;

        @Override // com.facebook.share.internal.LikeActionController.AbstractRequestWrapper
        public final void c(FacebookRequestError facebookRequestError) {
            LoggingBehavior loggingBehavior = LoggingBehavior.X;
            FileLruCache fileLruCache = LikeActionController.f16534n;
            HashMap map = Logger.d;
            FacebookSdk.j(loggingBehavior);
        }

        @Override // com.facebook.share.internal.LikeActionController.AbstractRequestWrapper
        public final void d(GraphResponse graphResponse) {
            String str = this.f16565b;
            JSONObject jSONObject = graphResponse.f15952c;
            JSONObject jSONObjectOptJSONObject = jSONObject != null ? jSONObject.optJSONObject(str) : null;
            if (jSONObjectOptJSONObject != null) {
                String strOptString = jSONObjectOptJSONObject.optString("id");
                this.d = strOptString;
                this.f16572e = !Utility.C(strOptString);
            }
        }
    }

    public class GetPageLikesRequestWrapper extends AbstractRequestWrapper implements LikeRequestWrapper {
        public boolean d;

        public GetPageLikesRequestWrapper(String str) {
            super(str, LikeView.ObjectType.PAGE);
            this.d = LikeActionController.this.f16539c;
            Bundle bundleD = a.d("fields", "id");
            Date date = AccessToken.m0;
            e(new GraphRequest(AccessToken.Companion.b(), android.support.v4.media.a.C("me/likes/", str), bundleD, HttpMethod.X));
        }

        @Override // com.facebook.share.internal.LikeActionController.LikeRequestWrapper
        public final boolean a() {
            return this.d;
        }

        @Override // com.facebook.share.internal.LikeActionController.LikeRequestWrapper
        public final String b() {
            return null;
        }

        @Override // com.facebook.share.internal.LikeActionController.AbstractRequestWrapper
        public final void c(FacebookRequestError facebookRequestError) {
            LoggingBehavior loggingBehavior = LoggingBehavior.X;
            FileLruCache fileLruCache = LikeActionController.f16534n;
            HashMap map = Logger.d;
            FacebookSdk.j(loggingBehavior);
            LikeActionController.b(LikeActionController.this, "get_page_like", facebookRequestError);
        }

        @Override // com.facebook.share.internal.LikeActionController.AbstractRequestWrapper
        public final void d(GraphResponse graphResponse) {
            JSONObject jSONObject = graphResponse.f15952c;
            JSONArray jSONArrayOptJSONArray = jSONObject != null ? jSONObject.optJSONArray("data") : null;
            if (jSONArrayOptJSONArray == null || jSONArrayOptJSONArray.length() <= 0) {
                return;
            }
            this.d = true;
        }
    }

    public interface LikeRequestWrapper extends RequestWrapper {
        boolean a();

        String b();
    }

    public static class MRUCacheWorkItem implements Runnable {
        public static final ArrayList Z = new ArrayList();
        public final String X;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        public final boolean f16574Y;

        public MRUCacheWorkItem(String str, boolean z2) {
            this.X = str;
            this.f16574Y = z2;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (CrashShieldHandler.b(this)) {
                return;
            }
            String str = this.X;
            ArrayList arrayList = Z;
            try {
                arrayList.remove(str);
                arrayList.add(0, str);
                if (!this.f16574Y || arrayList.size() < 128) {
                    return;
                }
                while (64 < arrayList.size()) {
                    LikeActionController.o.remove((String) arrayList.remove(arrayList.size() - 1));
                }
            } catch (Throwable th) {
                CrashShieldHandler.a(this, th);
            }
        }
    }

    public class PublishLikeRequestWrapper extends AbstractRequestWrapper {
        public String d;

        public PublishLikeRequestWrapper(String str, LikeView.ObjectType objectType) {
            super(str, objectType);
            Bundle bundleD = a.d("object", str);
            Date date = AccessToken.m0;
            e(new GraphRequest(AccessToken.Companion.b(), "me/og.likes", bundleD, HttpMethod.f15953Y));
        }

        @Override // com.facebook.share.internal.LikeActionController.AbstractRequestWrapper
        public final void c(FacebookRequestError facebookRequestError) {
            if (facebookRequestError.e0 == 3501) {
                this.f16566c = null;
                return;
            }
            LoggingBehavior loggingBehavior = LoggingBehavior.X;
            FileLruCache fileLruCache = LikeActionController.f16534n;
            HashMap map = Logger.d;
            FacebookSdk.j(loggingBehavior);
            LikeActionController.b(LikeActionController.this, "publish_like", facebookRequestError);
        }

        @Override // com.facebook.share.internal.LikeActionController.AbstractRequestWrapper
        public final void d(GraphResponse graphResponse) {
            JSONObject jSONObject = graphResponse.f15952c;
            String strOptString = "";
            if (jSONObject != null) {
                strOptString = jSONObject.optString("id", "");
                Intrinsics.e(strOptString, "response.optString(propertyName, \"\")");
            }
            this.d = strOptString;
        }
    }

    public class PublishUnlikeRequestWrapper extends AbstractRequestWrapper {
        public PublishUnlikeRequestWrapper(String str) {
            super(null, null);
            Date date = AccessToken.m0;
            e(new GraphRequest(AccessToken.Companion.b(), str, null, HttpMethod.Z));
        }

        @Override // com.facebook.share.internal.LikeActionController.AbstractRequestWrapper
        public final void c(FacebookRequestError facebookRequestError) {
            LoggingBehavior loggingBehavior = LoggingBehavior.X;
            FileLruCache fileLruCache = LikeActionController.f16534n;
            HashMap map = Logger.d;
            FacebookSdk.j(loggingBehavior);
            LikeActionController.b(LikeActionController.this, "publish_unlike", facebookRequestError);
        }

        @Override // com.facebook.share.internal.LikeActionController.AbstractRequestWrapper
        public final void d(GraphResponse graphResponse) {
        }
    }

    public interface RequestCompletionCallback {
        void onComplete();
    }

    public interface RequestWrapper {
    }

    public static class SerializeToDiskWorkItem implements Runnable {
        public String X;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        public String f16576Y;

        /* JADX WARN: Bottom block not found for handler: all -> 0x0034 */
        @Override // java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void run() {
            /*
                r4 = this;
                boolean r0 = com.facebook.internal.instrument.crashshield.CrashShieldHandler.b(r4)
                if (r0 == 0) goto L7
                goto L2d
            L7:
                java.lang.String r0 = r4.X     // Catch: java.lang.Throwable -> L34
                java.lang.String r1 = r4.f16576Y     // Catch: java.lang.Throwable -> L34
                r2 = 0
                com.facebook.internal.FileLruCache r3 = com.facebook.share.internal.LikeActionController.f16534n     // Catch: java.lang.Throwable -> L20 java.io.IOException -> L22
                r3.getClass()     // Catch: java.lang.Throwable -> L20 java.io.IOException -> L22
                java.io.BufferedOutputStream r2 = r3.d(r0, r2)     // Catch: java.lang.Throwable -> L20 java.io.IOException -> L22
                byte[] r0 = r1.getBytes()     // Catch: java.lang.Throwable -> L20 java.io.IOException -> L22
                r2.write(r0)     // Catch: java.lang.Throwable -> L20 java.io.IOException -> L22
            L1c:
                com.facebook.internal.Utility.e(r2)     // Catch: java.lang.Throwable -> L34
                goto L2d
            L20:
                r0 = move-exception
                goto L2e
            L22:
                r0 = move-exception
                java.lang.String r1 = "LikeActionController"
                java.lang.String r3 = "Unable to serialize controller to disk"
                android.util.Log.e(r1, r3, r0)     // Catch: java.lang.Throwable -> L20
                if (r2 == 0) goto L2d
                goto L1c
            L2d:
                return
            L2e:
                if (r2 == 0) goto L33
                com.facebook.internal.Utility.e(r2)     // Catch: java.lang.Throwable -> L34
            L33:
                throw r0     // Catch: java.lang.Throwable -> L34
            L34:
                r0 = move-exception
                com.facebook.internal.instrument.crashshield.CrashShieldHandler.a(r4, r0)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.share.internal.LikeActionController.SerializeToDiskWorkItem.run():void");
        }
    }

    public LikeActionController(String str, LikeView.ObjectType objectType) {
        this.f16537a = str;
        this.f16538b = objectType;
    }

    public static void a(LikeActionController likeActionController) {
        Date date = AccessToken.m0;
        if (AccessToken.Companion.c()) {
            likeActionController.f(new RequestCompletionCallback() { // from class: com.facebook.share.internal.LikeActionController.9
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r1v3, types: [com.facebook.share.internal.LikeActionController$AbstractRequestWrapper, com.facebook.share.internal.LikeActionController$LikeRequestWrapper] */
                /* JADX WARN: Type inference failed for: r1v5 */
                /* JADX WARN: Type inference failed for: r1v6 */
                @Override // com.facebook.share.internal.LikeActionController.RequestCompletionCallback
                public final void onComplete() {
                    LikeActionController likeActionController2 = LikeActionController.this;
                    ?? getOGObjectLikesRequestWrapper = likeActionController2.f16538b.ordinal() != 2 ? likeActionController2.new GetOGObjectLikesRequestWrapper(likeActionController2.f16542i, likeActionController2.f16538b) : likeActionController2.new GetPageLikesRequestWrapper(likeActionController2.f16542i);
                    GetEngagementRequestWrapper getEngagementRequestWrapper = likeActionController2.new GetEngagementRequestWrapper(likeActionController2.f16542i, likeActionController2.f16538b);
                    GraphRequestBatch graphRequestBatch = new GraphRequestBatch();
                    graphRequestBatch.add(getOGObjectLikesRequestWrapper.f16564a);
                    graphRequestBatch.add(getEngagementRequestWrapper.f16564a);
                    graphRequestBatch.c(new GraphRequestBatch.Callback(getOGObjectLikesRequestWrapper, getEngagementRequestWrapper) { // from class: com.facebook.share.internal.LikeActionController.9.1

                        /* JADX INFO: renamed from: a, reason: collision with root package name */
                        public final /* synthetic */ AbstractRequestWrapper f16561a;

                        /* JADX INFO: renamed from: b, reason: collision with root package name */
                        public final /* synthetic */ GetEngagementRequestWrapper f16562b;

                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            this.f16561a = (AbstractRequestWrapper) getOGObjectLikesRequestWrapper;
                            this.f16562b = getEngagementRequestWrapper;
                        }

                        /* JADX WARN: Type inference failed for: r11v1, types: [com.facebook.share.internal.LikeActionController$AbstractRequestWrapper, com.facebook.share.internal.LikeActionController$LikeRequestWrapper] */
                        @Override // com.facebook.GraphRequestBatch.Callback
                        public final void a(GraphRequestBatch graphRequestBatch2) {
                            ?? r11 = this.f16561a;
                            FacebookRequestError facebookRequestError = r11.f16566c;
                            AnonymousClass9 anonymousClass9 = AnonymousClass9.this;
                            if (facebookRequestError == null) {
                                GetEngagementRequestWrapper getEngagementRequestWrapper2 = this.f16562b;
                                if (getEngagementRequestWrapper2.f16566c == null) {
                                    LikeActionController likeActionController3 = LikeActionController.this;
                                    boolean zA = r11.a();
                                    String str = getEngagementRequestWrapper2.d;
                                    String str2 = getEngagementRequestWrapper2.f16569e;
                                    String str3 = getEngagementRequestWrapper2.f;
                                    String str4 = getEngagementRequestWrapper2.g;
                                    String strB = r11.b();
                                    FileLruCache fileLruCache = LikeActionController.f16534n;
                                    likeActionController3.n(zA, str, str2, str3, str4, strB);
                                    return;
                                }
                            }
                            LoggingBehavior loggingBehavior = LoggingBehavior.X;
                            FileLruCache fileLruCache2 = LikeActionController.f16534n;
                            LikeActionController likeActionController4 = LikeActionController.this;
                            HashMap map = Logger.d;
                            FacebookSdk.j(loggingBehavior);
                        }
                    });
                    graphRequestBatch.d();
                }
            });
            return;
        }
        LikeStatusClient likeStatusClient = new LikeStatusClient(FacebookSdk.b(), 65542, 65543, 20141001, FacebookSdk.c(), null);
        likeStatusClient.l0 = likeActionController.f16537a;
        if (likeStatusClient.c()) {
            likeStatusClient.Z = new PlatformServiceClient.CompletedListener() { // from class: com.facebook.share.internal.LikeActionController.10
                @Override // com.facebook.internal.PlatformServiceClient.CompletedListener
                public final void a(Bundle bundle) {
                    if (bundle == null || !bundle.containsKey("com.facebook.platform.extra.OBJECT_IS_LIKED")) {
                        return;
                    }
                    boolean z2 = bundle.getBoolean("com.facebook.platform.extra.OBJECT_IS_LIKED");
                    boolean zContainsKey = bundle.containsKey("com.facebook.platform.extra.LIKE_COUNT_STRING_WITH_LIKE");
                    LikeActionController likeActionController2 = LikeActionController.this;
                    String string = zContainsKey ? bundle.getString("com.facebook.platform.extra.LIKE_COUNT_STRING_WITH_LIKE") : likeActionController2.d;
                    String string2 = bundle.containsKey("com.facebook.platform.extra.LIKE_COUNT_STRING_WITHOUT_LIKE") ? bundle.getString("com.facebook.platform.extra.LIKE_COUNT_STRING_WITHOUT_LIKE") : likeActionController2.f16540e;
                    String string3 = bundle.containsKey("com.facebook.platform.extra.SOCIAL_SENTENCE_WITH_LIKE") ? bundle.getString("com.facebook.platform.extra.SOCIAL_SENTENCE_WITH_LIKE") : likeActionController2.f;
                    String string4 = bundle.containsKey("com.facebook.platform.extra.SOCIAL_SENTENCE_WITHOUT_LIKE") ? bundle.getString("com.facebook.platform.extra.SOCIAL_SENTENCE_WITHOUT_LIKE") : likeActionController2.g;
                    String string5 = bundle.containsKey("com.facebook.platform.extra.UNLIKE_TOKEN") ? bundle.getString("com.facebook.platform.extra.UNLIKE_TOKEN") : likeActionController2.f16541h;
                    FileLruCache fileLruCache = LikeActionController.f16534n;
                    LikeActionController.this.n(z2, string, string2, string3, string4, string5);
                }
            };
        }
    }

    public static void b(LikeActionController likeActionController, String str, FacebookRequestError facebookRequestError) {
        JSONObject jSONObject;
        likeActionController.getClass();
        Bundle bundle = new Bundle();
        if (facebookRequestError != null && (jSONObject = facebookRequestError.j0) != null) {
            bundle.putString("error", jSONObject.toString());
        }
        likeActionController.j(bundle, str);
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0046  */
    /* JADX WARN: Code duplicated, block: B:33:0x0060  */
    /* JADX WARN: Code duplicated, block: B:36:0x0066  */
    /* JADX WARN: Code duplicated, block: B:40:0x0090  */
    /* JADX WARN: Code duplicated, block: B:43:0x009d  */
    /* JADX WARN: Code duplicated, block: B:51:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r0v3 */
    public static void c(String str, LikeView.ObjectType objectType, CreationCallback creationCallback) throws Throwable {
        BufferedInputStream bufferedInputStreamC;
        LikeActionController likeActionController;
        String strH = h(str);
        ConcurrentHashMap concurrentHashMap = o;
        LikeActionController likeActionController2 = (LikeActionController) concurrentHashMap.get(strH);
        if (likeActionController2 != null) {
            MRUCacheWorkItem mRUCacheWorkItem = new MRUCacheWorkItem(strH, false);
            WorkQueue workQueue = f16535p;
            workQueue.getClass();
            WorkQueue.a(workQueue, mRUCacheWorkItem);
        }
        if (likeActionController2 != null) {
            o(likeActionController2, objectType, creationCallback);
            return;
        }
        ?? r0 = 0;
        try {
            try {
                try {
                    String strH2 = h(str);
                    FileLruCache fileLruCache = f16534n;
                    try {
                        fileLruCache.getClass();
                        bufferedInputStreamC = fileLruCache.c(strH2, null);
                        if (bufferedInputStreamC != null) {
                            try {
                                String strP = Utility.P(bufferedInputStreamC);
                                if (Utility.C(strP)) {
                                    likeActionController = null;
                                } else {
                                    likeActionController = e(strP);
                                }
                            } catch (IOException e2) {
                                e = e2;
                                Log.e("LikeActionController", "Unable to deserialize controller from disk", e);
                                if (bufferedInputStreamC != null) {
                                    Utility.e(bufferedInputStreamC);
                                }
                                likeActionController = null;
                            }
                        } else {
                            likeActionController = null;
                        }
                        if (bufferedInputStreamC != null) {
                            Utility.e(bufferedInputStreamC);
                        }
                    } catch (IOException e3) {
                        e = e3;
                        bufferedInputStreamC = null;
                        Log.e("LikeActionController", "Unable to deserialize controller from disk", e);
                        if (bufferedInputStreamC != null) {
                            Utility.e(bufferedInputStreamC);
                        }
                        likeActionController = null;
                        if (likeActionController == null) {
                            likeActionController = new LikeActionController(str, objectType);
                            m(likeActionController);
                        }
                        String strH3 = h(str);
                        MRUCacheWorkItem mRUCacheWorkItem2 = new MRUCacheWorkItem(strH3, true);
                        WorkQueue workQueue2 = f16535p;
                        workQueue2.getClass();
                        WorkQueue.a(workQueue2, mRUCacheWorkItem2);
                        concurrentHashMap.put(strH3, likeActionController);
                        r.post(new Runnable() { // from class: com.facebook.share.internal.LikeActionController.2
                            @Override // java.lang.Runnable
                            public final void run() {
                                if (CrashShieldHandler.b(this)) {
                                    return;
                                }
                                try {
                                    LikeActionController.a(LikeActionController.this);
                                } catch (Throwable th) {
                                    CrashShieldHandler.a(this, th);
                                }
                            }
                        });
                        if (creationCallback == null) {
                            return;
                        }
                        r.post(new AnonymousClass4(creationCallback, likeActionController, null));
                    }
                } catch (IOException e4) {
                    e = e4;
                }
                if (likeActionController == null) {
                    likeActionController = new LikeActionController(str, objectType);
                    m(likeActionController);
                }
                String strH4 = h(str);
                MRUCacheWorkItem mRUCacheWorkItem3 = new MRUCacheWorkItem(strH4, true);
                WorkQueue workQueue3 = f16535p;
                workQueue3.getClass();
                WorkQueue.a(workQueue3, mRUCacheWorkItem3);
                concurrentHashMap.put(strH4, likeActionController);
                r.post(new Runnable() { // from class: com.facebook.share.internal.LikeActionController.2
                    @Override // java.lang.Runnable
                    public final void run() {
                        if (CrashShieldHandler.b(this)) {
                            return;
                        }
                        try {
                            LikeActionController.a(LikeActionController.this);
                        } catch (Throwable th) {
                            CrashShieldHandler.a(this, th);
                        }
                    }
                });
                if (creationCallback == null) {
                    return;
                }
                r.post(new AnonymousClass4(creationCallback, likeActionController, null));
            } catch (Throwable th) {
                th = th;
                if (r0 != 0) {
                    Utility.e(r0);
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            r0 = likeActionController2;
            if (r0 != 0) {
                Utility.e(r0);
            }
            throw th;
        }
    }

    public static void d(LikeActionController likeActionController, String str, Bundle bundle) {
        Intent intent = new Intent(str);
        if (likeActionController != null) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putString("com.facebook.sdk.LikeActionController.OBJECT_ID", likeActionController.f16537a);
        }
        if (bundle != null) {
            intent.putExtras(bundle);
        }
        LocalBroadcastManager.getInstance(FacebookSdk.b()).sendBroadcast(intent);
    }

    public static LikeActionController e(String str) {
        LikeView.ObjectType objectType;
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject.optInt("com.facebook.share.internal.LikeActionController.version", -1) == 3) {
                String string = jSONObject.getString("object_id");
                int i2 = 0;
                int iOptInt = jSONObject.optInt("object_type", 0);
                LikeView.ObjectType[] objectTypeArrValues = LikeView.ObjectType.values();
                int length = objectTypeArrValues.length;
                while (true) {
                    if (i2 >= length) {
                        objectType = null;
                        break;
                    }
                    objectType = objectTypeArrValues[i2];
                    if (objectType.f16643Y == iOptInt) {
                        break;
                    }
                    i2++;
                }
                LikeActionController likeActionController = new LikeActionController(string, objectType);
                likeActionController.d = jSONObject.optString("like_count_string_with_like", null);
                likeActionController.f16540e = jSONObject.optString("like_count_string_without_like", null);
                likeActionController.f = jSONObject.optString("social_sentence_with_like", null);
                likeActionController.g = jSONObject.optString("social_sentence_without_like", null);
                likeActionController.f16539c = jSONObject.optBoolean("is_object_liked");
                likeActionController.f16541h = jSONObject.optString("unlike_token", null);
                JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("facebook_dialog_analytics_bundle");
                if (jSONObjectOptJSONObject == null) {
                    return likeActionController;
                }
                likeActionController.f16543l = BundleJSONConverter.a(jSONObjectOptJSONObject);
                return likeActionController;
            }
        } catch (JSONException e2) {
            Log.e("LikeActionController", "Unable to deserialize controller from JSON", e2);
        }
        return null;
    }

    public static String h(String str) {
        Date date = AccessToken.m0;
        String strK = AccessToken.Companion.c() ? AccessToken.Companion.b().f0 : null;
        if (strK != null) {
            strK = Utility.K(strK);
        }
        Locale locale = Locale.ROOT;
        return str + com.smartdigimkt.b0.a.U1 + Utility.f(strK, "") + "|com.fb.sdk.like|" + f16536u;
    }

    public static void i(String str, LikeView.ObjectType objectType, CreationCallback creationCallback) {
        if (!t) {
            synchronized (LikeActionController.class) {
                if (!t) {
                    r = new Handler(Looper.getMainLooper());
                    f16536u = FacebookSdk.b().getSharedPreferences("com.facebook.LikeActionController.CONTROLLER_STORE_KEY", 0).getInt("OBJECT_SUFFIX", 1);
                    f16534n = new FileLruCache("LikeActionController", new FileLruCache.Limits());
                    new AnonymousClass5();
                    CallbackManagerImpl.a(CallbackManagerImpl.RequestCodeOffset.Like.d(), new AnonymousClass3());
                    t = true;
                }
            }
        }
        String strH = h(str);
        LikeActionController likeActionController = (LikeActionController) o.get(strH);
        if (likeActionController != null) {
            MRUCacheWorkItem mRUCacheWorkItem = new MRUCacheWorkItem(strH, false);
            WorkQueue workQueue = f16535p;
            workQueue.getClass();
            WorkQueue.a(workQueue, mRUCacheWorkItem);
        }
        if (likeActionController != null) {
            o(likeActionController, objectType, creationCallback);
            return;
        }
        WorkQueue workQueue2 = q;
        CreateLikeActionControllerWorkItem createLikeActionControllerWorkItem = new CreateLikeActionControllerWorkItem();
        createLikeActionControllerWorkItem.X = str;
        createLikeActionControllerWorkItem.f16568Y = objectType;
        createLikeActionControllerWorkItem.Z = creationCallback;
        workQueue2.getClass();
        WorkQueue.a(workQueue2, createLikeActionControllerWorkItem);
    }

    public static void m(LikeActionController likeActionController) {
        String string;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("com.facebook.share.internal.LikeActionController.version", 3);
            jSONObject.put("object_id", likeActionController.f16537a);
            jSONObject.put("object_type", likeActionController.f16538b.f16643Y);
            jSONObject.put("like_count_string_with_like", likeActionController.d);
            jSONObject.put("like_count_string_without_like", likeActionController.f16540e);
            jSONObject.put("social_sentence_with_like", likeActionController.f);
            jSONObject.put("social_sentence_without_like", likeActionController.g);
            jSONObject.put("is_object_liked", likeActionController.f16539c);
            jSONObject.put("unlike_token", likeActionController.f16541h);
            Bundle bundle = likeActionController.f16543l;
            if (bundle != null) {
                jSONObject.put("facebook_dialog_analytics_bundle", BundleJSONConverter.b(bundle));
            }
            string = jSONObject.toString();
        } catch (JSONException e2) {
            Log.e("LikeActionController", "Unable to serialize controller to JSON", e2);
            string = null;
        }
        String strH = h(likeActionController.f16537a);
        if (Utility.C(string) || Utility.C(strH)) {
            return;
        }
        SerializeToDiskWorkItem serializeToDiskWorkItem = new SerializeToDiskWorkItem();
        serializeToDiskWorkItem.X = strH;
        serializeToDiskWorkItem.f16576Y = string;
        WorkQueue workQueue = q;
        workQueue.getClass();
        WorkQueue.a(workQueue, serializeToDiskWorkItem);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0017  */
    /* JADX WARN: Code duplicated, block: B:4:0x000b  */
    public static void o(LikeActionController likeActionController, LikeView.ObjectType objectType, CreationCallback creationCallback) {
        LikeView.ObjectType objectType2 = likeActionController.f16538b;
        FacebookException facebookException = null;
        if (CrashShieldHandler.b(ShareInternalUtility.class)) {
            objectType2 = null;
        } else if (objectType == objectType2) {
            objectType2 = objectType;
        } else {
            try {
                LikeView.ObjectType objectType3 = LikeView.ObjectType.UNKNOWN;
                if (objectType != objectType3) {
                    if (objectType2 == objectType3) {
                        objectType2 = objectType;
                    } else {
                        objectType2 = null;
                    }
                }
            } catch (Throwable th) {
                CrashShieldHandler.a(ShareInternalUtility.class, th);
            }
        }
        if (objectType2 == null) {
            FacebookException facebookException2 = new FacebookException("Object with id:\"%s\" is already marked as type:\"%s\". Cannot change the type to:\"%s\"", likeActionController.f16537a, likeActionController.f16538b.X, objectType.X);
            likeActionController = null;
            facebookException = facebookException2;
        } else {
            likeActionController.f16538b = objectType2;
        }
        if (creationCallback == null) {
            return;
        }
        r.post(new AnonymousClass4(creationCallback, likeActionController, facebookException));
    }

    public final void f(final RequestCompletionCallback requestCompletionCallback) {
        if (!Utility.C(this.f16542i)) {
            requestCompletionCallback.onComplete();
            return;
        }
        LikeView.ObjectType objectType = this.f16538b;
        String str = this.f16537a;
        final GetOGObjectIdRequestWrapper getOGObjectIdRequestWrapper = new GetOGObjectIdRequestWrapper(str, objectType);
        Bundle bundle = new Bundle();
        bundle.putString("fields", "og_object.fields(id)");
        bundle.putString("ids", str);
        Date date = AccessToken.m0;
        AccessToken accessTokenB = AccessToken.Companion.b();
        HttpMethod httpMethod = HttpMethod.X;
        getOGObjectIdRequestWrapper.e(new GraphRequest(accessTokenB, "", bundle, httpMethod));
        final GetPageIdRequestWrapper getPageIdRequestWrapper = new GetPageIdRequestWrapper(str, this.f16538b);
        Bundle bundle2 = new Bundle();
        bundle2.putString("fields", "id");
        bundle2.putString("ids", str);
        getPageIdRequestWrapper.e(new GraphRequest(AccessToken.Companion.b(), "", bundle2, httpMethod));
        GraphRequestBatch graphRequestBatch = new GraphRequestBatch();
        graphRequestBatch.add(getOGObjectIdRequestWrapper.f16564a);
        graphRequestBatch.add(getPageIdRequestWrapper.f16564a);
        graphRequestBatch.c(new GraphRequestBatch.Callback() { // from class: com.facebook.share.internal.LikeActionController.11
            @Override // com.facebook.GraphRequestBatch.Callback
            public final void a(GraphRequestBatch graphRequestBatch2) {
                GetOGObjectIdRequestWrapper getOGObjectIdRequestWrapper2 = getOGObjectIdRequestWrapper;
                String str2 = getOGObjectIdRequestWrapper2.d;
                LikeActionController likeActionController = LikeActionController.this;
                likeActionController.f16542i = str2;
                boolean zC = Utility.C(str2);
                GetPageIdRequestWrapper getPageIdRequestWrapper2 = getPageIdRequestWrapper;
                if (zC) {
                    likeActionController.f16542i = getPageIdRequestWrapper2.d;
                    likeActionController.j = getPageIdRequestWrapper2.f16572e;
                }
                if (Utility.C(likeActionController.f16542i)) {
                    LoggingBehavior loggingBehavior = LoggingBehavior.g0;
                    FileLruCache fileLruCache = LikeActionController.f16534n;
                    HashMap map = Logger.d;
                    FacebookSdk.j(loggingBehavior);
                    FacebookRequestError facebookRequestError = getPageIdRequestWrapper2.f16566c;
                    if (facebookRequestError == null) {
                        facebookRequestError = getOGObjectIdRequestWrapper2.f16566c;
                    }
                    LikeActionController.b(likeActionController, "get_verified_id", facebookRequestError);
                }
                requestCompletionCallback.onComplete();
            }
        });
        graphRequestBatch.d();
    }

    public final InternalAppEventsLogger g() {
        if (this.m == null) {
            this.m = new InternalAppEventsLogger(FacebookSdk.b());
        }
        return this.m;
    }

    public final void j(Bundle bundle, String str) {
        Bundle bundle2 = new Bundle(bundle);
        bundle2.putString("object_id", this.f16537a);
        bundle2.putString("object_type", this.f16538b.X);
        bundle2.putString("current_action", str);
        g().c(bundle2, "fb_like_control_error");
    }

    public final void k(boolean z2) {
        n(z2, this.d, this.f16540e, this.f, this.g, this.f16541h);
        Bundle bundle = new Bundle();
        bundle.putString("com.facebook.platform.status.ERROR_DESCRIPTION", "Unable to publish the like/unlike action");
        d(this, "com.facebook.sdk.LikeActionController.DID_ERROR", bundle);
    }

    public final boolean l(boolean z2, final Bundle bundle) {
        Set set;
        Date date = AccessToken.m0;
        if ((this.j || this.f16542i == null || !AccessToken.Companion.c() || (set = AccessToken.Companion.b().f15877Y) == null || !set.contains("publish_actions")) ? false : true) {
            if (z2) {
                f(new RequestCompletionCallback() { // from class: com.facebook.share.internal.LikeActionController.7
                    @Override // com.facebook.share.internal.LikeActionController.RequestCompletionCallback
                    public final void onComplete() {
                        LikeActionController likeActionController = LikeActionController.this;
                        if (Utility.C(likeActionController.f16542i)) {
                            Bundle bundle2 = new Bundle();
                            bundle2.putString("com.facebook.platform.status.ERROR_DESCRIPTION", "Invalid Object Id");
                            LikeActionController.d(likeActionController, "com.facebook.sdk.LikeActionController.DID_ERROR", bundle2);
                        } else {
                            GraphRequestBatch graphRequestBatch = new GraphRequestBatch();
                            final PublishLikeRequestWrapper publishLikeRequestWrapper = likeActionController.new PublishLikeRequestWrapper(likeActionController.f16542i, likeActionController.f16538b);
                            graphRequestBatch.add(publishLikeRequestWrapper.f16564a);
                            graphRequestBatch.c(new GraphRequestBatch.Callback() { // from class: com.facebook.share.internal.LikeActionController.7.1
                                @Override // com.facebook.GraphRequestBatch.Callback
                                public final void a(GraphRequestBatch graphRequestBatch2) {
                                    AnonymousClass7 anonymousClass7 = AnonymousClass7.this;
                                    LikeActionController likeActionController2 = LikeActionController.this;
                                    likeActionController2.getClass();
                                    PublishLikeRequestWrapper publishLikeRequestWrapper2 = publishLikeRequestWrapper;
                                    if (publishLikeRequestWrapper2.f16566c != null) {
                                        likeActionController2.k(false);
                                        return;
                                    }
                                    likeActionController2.f16541h = Utility.f(publishLikeRequestWrapper2.d, null);
                                    LikeActionController likeActionController3 = LikeActionController.this;
                                    likeActionController3.k = true;
                                    InternalAppEventsLogger internalAppEventsLoggerG = likeActionController3.g();
                                    Bundle bundle3 = bundle;
                                    internalAppEventsLoggerG.c(bundle3, "fb_like_control_did_like");
                                    boolean z3 = likeActionController3.f16539c;
                                    if (z3 == likeActionController3.k || likeActionController3.l(z3, bundle3)) {
                                        return;
                                    }
                                    likeActionController3.k(!likeActionController3.f16539c);
                                }
                            });
                            graphRequestBatch.d();
                        }
                    }
                });
                return true;
            }
            if (!Utility.C(this.f16541h)) {
                GraphRequestBatch graphRequestBatch = new GraphRequestBatch();
                final PublishUnlikeRequestWrapper publishUnlikeRequestWrapper = new PublishUnlikeRequestWrapper(this.f16541h);
                graphRequestBatch.add(publishUnlikeRequestWrapper.f16564a);
                graphRequestBatch.c(new GraphRequestBatch.Callback() { // from class: com.facebook.share.internal.LikeActionController.8
                    @Override // com.facebook.GraphRequestBatch.Callback
                    public final void a(GraphRequestBatch graphRequestBatch2) {
                        LikeActionController likeActionController = LikeActionController.this;
                        likeActionController.getClass();
                        if (publishUnlikeRequestWrapper.f16566c != null) {
                            likeActionController.k(true);
                            return;
                        }
                        likeActionController.f16541h = null;
                        likeActionController.k = false;
                        InternalAppEventsLogger internalAppEventsLoggerG = likeActionController.g();
                        Bundle bundle2 = bundle;
                        internalAppEventsLoggerG.c(bundle2, "fb_like_control_did_unlike");
                        boolean z3 = likeActionController.f16539c;
                        if (z3 == likeActionController.k || likeActionController.l(z3, bundle2)) {
                            return;
                        }
                        likeActionController.k(!likeActionController.f16539c);
                    }
                });
                graphRequestBatch.d();
                return true;
            }
        }
        return false;
    }

    public final void n(boolean z2, String str, String str2, String str3, String str4, String str5) {
        String strF = Utility.f(str, null);
        String strF2 = Utility.f(str2, null);
        String strF3 = Utility.f(str3, null);
        String strF4 = Utility.f(str4, null);
        String strF5 = Utility.f(str5, null);
        if (z2 == this.f16539c && Utility.a(strF, this.d) && Utility.a(strF2, this.f16540e) && Utility.a(strF3, this.f) && Utility.a(strF4, this.g) && Utility.a(strF5, this.f16541h)) {
            return;
        }
        this.f16539c = z2;
        this.d = strF;
        this.f16540e = strF2;
        this.f = strF3;
        this.g = strF4;
        this.f16541h = strF5;
        m(this);
        d(this, "com.facebook.sdk.LikeActionController.UPDATED", null);
    }
}
