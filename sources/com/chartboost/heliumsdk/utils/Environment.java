package com.chartboost.heliumsdk.utils;

import android.content.ContentResolver;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.os.Build;
import android.os.SystemClock;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import android.util.DisplayMetrics;
import android.webkit.WebView;
import androidx.core.content.ContextCompat;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.chartboost.heliumsdk.HeliumSdk;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.appset.AppSet;
import com.google.android.gms.appset.AppSetIdInfo;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.p004ironsource.d9;
import com.p004ironsource.x4;
import com.startapp.simple.bloomfilter.parsing.TokenBuilder;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import com.unity3d.services.core.device.reader.JsonStorageKeyNames;
import j$.time.OffsetTime;
import j$.time.ZoneId;
import java.util.Calendar;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.internal.MainDispatcherLoader;
import kotlinx.coroutines.scheduling.DefaultIoScheduler;
import kotlinx.coroutines.scheduling.DefaultScheduler;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexKt;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\"\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0010\t\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001^B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\n\u0010H\u001a\u0004\u0018\u00010IH\u0002J\n\u0010J\u001a\u0004\u0018\u00010KH\u0002J\u0013\u0010L\u001a\u00020\u0004H\u0080@ø\u0001\u0000¢\u0006\u0004\bM\u0010NJ\u0013\u0010O\u001a\u00020\tH\u0080@ø\u0001\u0000¢\u0006\u0004\bP\u0010NJ\b\u0010Q\u001a\u0004\u0018\u00010\u0004J\u0006\u0010R\u001a\u00020SJ\b\u0010T\u001a\u00020\u0004H\u0002J\u000e\u0010U\u001a\u00020S2\u0006\u0010V\u001a\u00020WJ\u0019\u0010X\u001a\u00020S2\u0006\u0010V\u001a\u00020WH\u0082@ø\u0001\u0000¢\u0006\u0002\u0010YJ!\u0010Z\u001a\u0002H[\"\u0004\b\u0000\u0010[*\b\u0012\u0004\u0012\u0002H[0\\H\u0082@ø\u0001\u0000¢\u0006\u0002\u0010]R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\nR\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u00048F¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0011\u0010\u000e\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\rR\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0012\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R$\u0010\u0016\u001a\u0004\u0018\u00010\u00042\b\u0010\u0015\u001a\u0004\u0018\u00010\u00048F@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\rR$\u0010\u0018\u001a\u0004\u0018\u00010\u00042\b\u0010\u0015\u001a\u0004\u0018\u00010\u00048F@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\rR\u0011\u0010\u001a\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u0014R&\u0010\u001c\u001a\u0004\u0018\u00010\t2\b\u0010\u0015\u001a\u0004\u0018\u00010\t8F@BX\u0086\u000e¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\u001d\u0010\u001eR\u0011\u0010\u001f\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b \u0010\u0014R\u0011\u0010!\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\"\u0010\u0014R$\u0010#\u001a\u0004\u0018\u00010\u00042\b\u0010\u0015\u001a\u0004\u0018\u00010\u00048F@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\rR$\u0010%\u001a\u0004\u0018\u00010\u00042\b\u0010\u0015\u001a\u0004\u0018\u00010\u00048F@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\rR&\u0010'\u001a\u0004\u0018\u00010\t2\b\u0010\u0015\u001a\u0004\u0018\u00010\t8F@BX\u0086\u000e¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b(\u0010\u001eR\u0011\u0010)\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b*\u0010\rR\u0015\u0010+\u001a\u0004\u0018\u00010\u00048F¢\u0006\b\n\u0000\u001a\u0004\b,\u0010\rR\u0011\u0010-\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b.\u0010\rR\u0014\u0010/\u001a\u00020\u0004X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b0\u0010\rR\u0011\u00101\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b2\u0010\rR\u0010\u00103\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R&\u00105\u001a\u0004\u0018\u0001042\b\u0010\u0015\u001a\u0004\u0018\u0001048F@BX\u0086\u000e¢\u0006\n\n\u0002\u00108\u001a\u0004\b6\u00107R\u001e\u00109\u001a\u0004\u0018\u00010\u00048@X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b:\u0010\r\"\u0004\b;\u0010<R\u0012\u0010=\u001a\u0004\u0018\u00010>X\u0082\u000e¢\u0006\u0004\n\u0002\u0010?R\u0011\u0010@\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\bA\u0010\u0014R\u0013\u0010B\u001a\u0004\u0018\u00010\u00048F¢\u0006\u0006\u001a\u0004\bC\u0010\rR\u0011\u0010D\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\bE\u0010\rR\u0011\u0010F\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\bG\u0010\u0014\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006_"}, d2 = {"Lcom/chartboost/heliumsdk/utils/Environment;", "", "()V", "HELIUM_ENV_SHARED_PREFS_KEY", "", "HELIUM_UA_IDENTIFIER_KEY", "TC_STRING", "_appSetId", "_appSetIdScope", "", "Ljava/lang/Integer;", "appBundle", "getAppBundle", "()Ljava/lang/String;", "appSetId", "getAppSetId", "appSetIdMutex", "Lkotlinx/coroutines/sync/Mutex;", "appSetIdScope", "getAppSetIdScope", "()I", "<set-?>", "appVersionName", "getAppVersionName", "carrierName", "getCarrierName", d9.i.t, "getConnectionType", "deviceType", "getDeviceType", "()Ljava/lang/Integer;", "displayHeight", "getDisplayHeight", "displayWidth", "getDisplayWidth", "ifa", "getIfa", "language", "getLanguage", "lmt", "getLmt", "manufacturer", "getManufacturer", "mccmnc", "getMccmnc", "model", "getModel", "operatingSystem", "getOperatingSystem", "operatingSystemVersion", "getOperatingSystemVersion", HandleInvocationsFromAdViewer.KEY_PACKAGE_NAME, "", "pxRatio", "getPxRatio", "()Ljava/lang/Float;", "Ljava/lang/Float;", JsonStorageKeyNames.SESSION_ID_KEY, "getSessionId$Helium_release", "setSessionId$Helium_release", "(Ljava/lang/String;)V", "sessionStart", "", "Ljava/lang/Long;", "sessionTimeSeconds", "getSessionTimeSeconds", "tcString", "getTcString", "userAgent", "getUserAgent", "utcOffsetTime", "getUtcOffsetTime", "advertisingIdClient", "Lcom/google/android/gms/ads/identifier/AdvertisingIdClient$Info;", "advertisingIdNonGooglePlay", "Lcom/chartboost/heliumsdk/utils/Environment$NonGooglePlayAdvertisingClient;", "fetchAppSetId", "fetchAppSetId$Helium_release", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "fetchAppSetIdScope", "fetchAppSetIdScope$Helium_release", "fetchSessionId", "fetchUserAgent", "", "generateSessionId", "startSession", "context", "Landroid/content/Context;", "updateAppSetIdAndScope", "(Landroid/content/Context;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "await", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Lcom/google/android/gms/tasks/Task;", "(Lcom/google/android/gms/tasks/Task;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "NonGooglePlayAdvertisingClient", "Helium_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class Environment {
    private static final String HELIUM_ENV_SHARED_PREFS_KEY = "com.chartboost.helium";
    private static final String HELIUM_UA_IDENTIFIER_KEY = "HELIUM_UA_IDENTIFIER";
    private static final String TC_STRING = "IABTCF_TCString";
    private static String _appSetId;
    private static Integer _appSetIdScope;
    private static String appVersionName;
    private static String carrierName;
    private static Integer deviceType;
    private static String ifa;
    private static String language;
    private static Integer lmt;
    private static final String mccmnc = null;
    private static String packageName;
    private static Float pxRatio;
    private static String sessionId;
    private static Long sessionStart;
    public static final Environment INSTANCE = new Environment();
    private static final String operatingSystem = d9.d;
    private static final Mutex appSetIdMutex = MutexKt.a();

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0082\b\u0018\u00002\u00020\u0001B\u0017\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001f\u0010\r\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, d2 = {"Lcom/chartboost/heliumsdk/utils/Environment$NonGooglePlayAdvertisingClient;", "", "id", "", "lmt", "", "(Ljava/lang/String;I)V", "getId", "()Ljava/lang/String;", "getLmt", "()I", "component1", "component2", "copy", "equals", "", x4.DEFAULT_AUCTION_FALLBACK_VALUE, "hashCode", "toString", "Helium_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class NonGooglePlayAdvertisingClient {
        private final String id;
        private final int lmt;

        public NonGooglePlayAdvertisingClient(String str, int i2) {
            this.id = str;
            this.lmt = i2;
        }

        public static /* synthetic */ NonGooglePlayAdvertisingClient copy$default(NonGooglePlayAdvertisingClient nonGooglePlayAdvertisingClient, String str, int i2, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                str = nonGooglePlayAdvertisingClient.id;
            }
            if ((i3 & 2) != 0) {
                i2 = nonGooglePlayAdvertisingClient.lmt;
            }
            return nonGooglePlayAdvertisingClient.copy(str, i2);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getId() {
            return this.id;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final int getLmt() {
            return this.lmt;
        }

        public final NonGooglePlayAdvertisingClient copy(String id, int lmt) {
            return new NonGooglePlayAdvertisingClient(id, lmt);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof NonGooglePlayAdvertisingClient)) {
                return false;
            }
            NonGooglePlayAdvertisingClient nonGooglePlayAdvertisingClient = (NonGooglePlayAdvertisingClient) other;
            return Intrinsics.a(this.id, nonGooglePlayAdvertisingClient.id) && this.lmt == nonGooglePlayAdvertisingClient.lmt;
        }

        public final String getId() {
            return this.id;
        }

        public final int getLmt() {
            return this.lmt;
        }

        public int hashCode() {
            String str = this.id;
            return Integer.hashCode(this.lmt) + ((str == null ? 0 : str.hashCode()) * 31);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("NonGooglePlayAdvertisingClient(id=");
            sb.append(this.id);
            sb.append(", lmt=");
            return android.support.v4.media.a.p(sb, this.lmt, ')');
        }
    }

    /* JADX INFO: renamed from: com.chartboost.heliumsdk.utils.Environment$fetchUserAgent$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "com.chartboost.heliumsdk.utils.Environment$fetchUserAgent$2", f = "Environment.kt", l = {}, m = "invokeSuspend")
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        public AnonymousClass2(Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass2(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.X;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
            Context context = HeliumSdk.INSTANCE.getContext();
            if (context != null) {
                WebView webView = new WebView(context);
                String userAgentString = webView.getSettings().getUserAgentString();
                webView.destroy();
                if (userAgentString != null) {
                    context.getSharedPreferences(Environment.HELIUM_UA_IDENTIFIER_KEY, 0).edit().putString(Environment.HELIUM_UA_IDENTIFIER_KEY, userAgentString).apply();
                }
            }
            return Unit.f43263a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.f43263a);
        }
    }

    /* JADX INFO: renamed from: com.chartboost.heliumsdk.utils.Environment$startSession$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "com.chartboost.heliumsdk.utils.Environment$startSession$1", f = "Environment.kt", l = {696, 493}, m = "invokeSuspend")
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Context $context;
        Object L$0;
        Object L$1;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Context context, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$context = context;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$context, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Mutex mutex;
            Context context;
            Mutex mutex2;
            Throwable th;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.X;
            int i2 = this.label;
            try {
                if (i2 == 0) {
                    ResultKt.b(obj);
                    mutex = Environment.appSetIdMutex;
                    context = this.$context;
                    this.L$0 = mutex;
                    this.L$1 = context;
                    this.label = 1;
                    if (mutex.a(this) != coroutineSingletons) {
                    }
                    return coroutineSingletons;
                }
                if (i2 != 1) {
                    if (i2 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    mutex2 = (Mutex) this.L$0;
                    try {
                        ResultKt.b(obj);
                        mutex2.b(null);
                        return Unit.f43263a;
                    } catch (Throwable th2) {
                        th = th2;
                        mutex2.b(null);
                        throw th;
                    }
                }
                context = (Context) this.L$1;
                Mutex mutex3 = (Mutex) this.L$0;
                ResultKt.b(obj);
                mutex = mutex3;
                Environment environment = Environment.INSTANCE;
                this.L$0 = mutex;
                this.L$1 = null;
                this.label = 2;
                if (environment.updateAppSetIdAndScope(context, this) != coroutineSingletons) {
                    mutex2 = mutex;
                    mutex2.b(null);
                    return Unit.f43263a;
                }
                return coroutineSingletons;
            } catch (Throwable th3) {
                mutex2 = mutex;
                th = th3;
                mutex2.b(null);
                throw th;
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.f43263a);
        }
    }

    /* JADX INFO: renamed from: com.chartboost.heliumsdk.utils.Environment$updateAppSetIdAndScope$2, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "com.chartboost.heliumsdk.utils.Environment$updateAppSetIdAndScope$2", f = "Environment.kt", l = {TTAdConstant.STYLE_SIZE_RADIO_9_16}, m = "invokeSuspend")
    public static final class C10032 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Context $context;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10032(Context context, Continuation<? super C10032> continuation) {
            super(2, continuation);
            this.$context = context;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C10032(this.$context, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.X;
            int i2 = this.label;
            try {
                if (i2 == 0) {
                    ResultKt.b(obj);
                    Environment environment = Environment.INSTANCE;
                    Task<AppSetIdInfo> appSetIdInfo = AppSet.getClient(this.$context.getApplicationContext()).getAppSetIdInfo();
                    Intrinsics.e(appSetIdInfo, "getClient(context.applicationContext).appSetIdInfo");
                    this.label = 1;
                    obj = environment.await(appSetIdInfo, this);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.b(obj);
                }
                AppSetIdInfo appSetIdInfo2 = (AppSetIdInfo) obj;
                Environment environment2 = Environment.INSTANCE;
                Environment._appSetIdScope = new Integer(appSetIdInfo2.getScope());
                Environment._appSetId = appSetIdInfo2.getId();
            } catch (Exception e2) {
                LogController.INSTANCE.e("Exception raised while retrieving AppSet ID: " + e2.getMessage());
            }
            return Unit.f43263a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C10032) create(coroutineScope, continuation)).invokeSuspend(Unit.f43263a);
        }
    }

    private Environment() {
    }

    private final AdvertisingIdClient.Info advertisingIdClient() {
        Context context = HeliumSdk.INSTANCE.getContext();
        if (context == null) {
            return null;
        }
        try {
            return AdvertisingIdClient.getAdvertisingIdInfo(context.getApplicationContext());
        } catch (Exception e2) {
            LogController.INSTANCE.e("Exception raised while retrieving adInfo: " + e2.getMessage());
            return null;
        }
    }

    private final NonGooglePlayAdvertisingClient advertisingIdNonGooglePlay() {
        ContentResolver contentResolver;
        try {
            Context context = HeliumSdk.INSTANCE.getContext();
            if (context != null && (contentResolver = context.getContentResolver()) != null) {
                try {
                    int i2 = Settings.Secure.getInt(contentResolver, "limit_ad_tracking");
                    String string = Settings.Secure.getString(contentResolver, "advertising_id");
                    if (string != null) {
                        return new NonGooglePlayAdvertisingClient(string, i2);
                    }
                } catch (Settings.SettingNotFoundException e2) {
                    LogController.INSTANCE.e("Exception raised while retrieving lmt " + e2.getMessage());
                    return null;
                }
            }
        } catch (RuntimeException e3) {
            LogController.INSTANCE.e("Exception raised while retrieving ad information: " + e3.getMessage());
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final <T> Object await(Task<T> task, Continuation<? super T> continuation) throws Throwable {
        final CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(1, IntrinsicsKt.b(continuation));
        cancellableContinuationImpl.q();
        final Function1<T, Unit> function1 = new Function1<T, Unit>() { // from class: com.chartboost.heliumsdk.utils.Environment$await$2$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                m168invoke(obj);
                return Unit.f43263a;
            }

            /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
            public final void m168invoke(T t) {
                Environment.await$lambda$30$resumeOnce(cancellableContinuationImpl, t);
            }
        };
        task.addOnSuccessListener(new OnSuccessListener(function1) { // from class: com.chartboost.heliumsdk.utils.Environment$sam$com_google_android_gms_tasks_OnSuccessListener$0
            private final /* synthetic */ Function1 function;

            {
                Intrinsics.f(function1, "function");
                this.function = function1;
            }

            @Override // com.google.android.gms.tasks.OnSuccessListener
            public final /* synthetic */ void onSuccess(Object obj) {
                this.function.invoke(obj);
            }
        });
        task.addOnFailureListener(new OnFailureListener() { // from class: com.chartboost.heliumsdk.utils.Environment$await$2$2
            @Override // com.google.android.gms.tasks.OnFailureListener
            public final void onFailure(Exception exception) {
                Intrinsics.f(exception, "exception");
                Environment.await$lambda$30$resumeOnce(cancellableContinuationImpl, ResultKt.a(exception));
            }
        });
        Object objP = cancellableContinuationImpl.p();
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.X;
        return objP;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T> void await$lambda$30$resumeOnce(CancellableContinuation<? super T> cancellableContinuation, Object obj) {
        if (cancellableContinuation.isActive()) {
            if (!(obj instanceof Result.Failure)) {
                cancellableContinuation.resumeWith(obj);
            }
            Throwable thA = Result.a(obj);
            if (thA != null) {
                cancellableContinuation.resumeWith(ResultKt.a(thA));
            }
        }
    }

    private final String generateSessionId() {
        return androidx.media3.extractor.text.ttml.a.m("randomUUID().toString()");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object updateAppSetIdAndScope(Context context, Continuation<? super Unit> continuation) throws Throwable {
        DefaultScheduler defaultScheduler = Dispatchers.f44752a;
        Object objF = BuildersKt.f(DefaultIoScheduler.f45062Y, new C10032(context, null), continuation);
        return objF == CoroutineSingletons.X ? objF : Unit.f43263a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object fetchAppSetId$Helium_release(Continuation<? super String> continuation) {
        Environment$fetchAppSetId$1 environment$fetchAppSetId$1;
        if (continuation instanceof Environment$fetchAppSetId$1) {
            environment$fetchAppSetId$1 = (Environment$fetchAppSetId$1) continuation;
            int i2 = environment$fetchAppSetId$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                environment$fetchAppSetId$1.label = i2 - Integer.MIN_VALUE;
            } else {
                environment$fetchAppSetId$1 = new Environment$fetchAppSetId$1(this, continuation);
            }
        } else {
            environment$fetchAppSetId$1 = new Environment$fetchAppSetId$1(this, continuation);
        }
        Object obj = environment$fetchAppSetId$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.X;
        int i3 = environment$fetchAppSetId$1.label;
        if (i3 == 0) {
            ResultKt.b(obj);
            if (_appSetId == null) {
                DefaultScheduler defaultScheduler = Dispatchers.f44752a;
                DefaultIoScheduler defaultIoScheduler = DefaultIoScheduler.f45062Y;
                Environment$fetchAppSetId$2 environment$fetchAppSetId$2 = new Environment$fetchAppSetId$2(null);
                environment$fetchAppSetId$1.label = 1;
                if (BuildersKt.f(defaultIoScheduler, environment$fetchAppSetId$2, environment$fetchAppSetId$1) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
        }
        String str = _appSetId;
        return str == null ? "" : str;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object fetchAppSetIdScope$Helium_release(Continuation<? super Integer> continuation) {
        Environment$fetchAppSetIdScope$1 environment$fetchAppSetIdScope$1;
        if (continuation instanceof Environment$fetchAppSetIdScope$1) {
            environment$fetchAppSetIdScope$1 = (Environment$fetchAppSetIdScope$1) continuation;
            int i2 = environment$fetchAppSetIdScope$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                environment$fetchAppSetIdScope$1.label = i2 - Integer.MIN_VALUE;
            } else {
                environment$fetchAppSetIdScope$1 = new Environment$fetchAppSetIdScope$1(this, continuation);
            }
        } else {
            environment$fetchAppSetIdScope$1 = new Environment$fetchAppSetIdScope$1(this, continuation);
        }
        Object obj = environment$fetchAppSetIdScope$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.X;
        int i3 = environment$fetchAppSetIdScope$1.label;
        if (i3 == 0) {
            ResultKt.b(obj);
            if (_appSetIdScope == null) {
                DefaultScheduler defaultScheduler = Dispatchers.f44752a;
                DefaultIoScheduler defaultIoScheduler = DefaultIoScheduler.f45062Y;
                Environment$fetchAppSetIdScope$2 environment$fetchAppSetIdScope$2 = new Environment$fetchAppSetIdScope$2(null);
                environment$fetchAppSetIdScope$1.label = 1;
                if (BuildersKt.f(defaultIoScheduler, environment$fetchAppSetIdScope$2, environment$fetchAppSetIdScope$1) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
        }
        Integer num = _appSetIdScope;
        return new Integer(num != null ? num.intValue() : 0);
    }

    public final String fetchSessionId() {
        if (getSessionId$Helium_release() == null) {
            sessionId = generateSessionId();
        }
        return getSessionId$Helium_release();
    }

    public final void fetchUserAgent() {
        DefaultScheduler defaultScheduler = Dispatchers.f44752a;
        BuildersKt.c(CoroutineScopeKt.a(MainDispatcherLoader.f45042a), new Environment$fetchUserAgent$$inlined$CoroutineExceptionHandler$1(CoroutineExceptionHandler.Key.X), null, new AnonymousClass2(null), 2);
    }

    public final String getAppBundle() {
        Context context = HeliumSdk.INSTANCE.getContext();
        if (context != null) {
            packageName = context.getPackageName();
        }
        return packageName;
    }

    public final String getAppSetId() {
        DefaultScheduler defaultScheduler = Dispatchers.f44752a;
        BuildersKt.c(CoroutineScopeKt.a(DefaultIoScheduler.f45062Y), null, null, new Environment$appSetId$1(null), 3);
        String str = _appSetId;
        return str == null ? "" : str;
    }

    public final int getAppSetIdScope() {
        DefaultScheduler defaultScheduler = Dispatchers.f44752a;
        BuildersKt.c(CoroutineScopeKt.a(DefaultIoScheduler.f45062Y), null, null, new Environment$appSetIdScope$1(null), 3);
        Integer num = _appSetIdScope;
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    public final String getAppVersionName() {
        Context context = HeliumSdk.INSTANCE.getContext();
        if (context != null) {
            try {
                PackageManager packageManager = context.getApplicationContext().getPackageManager();
                String packageName2 = context.getPackageName();
                if (packageManager != null && packageName2 != null) {
                    PackageInfo packageInfo = Build.VERSION.SDK_INT >= 33 ? packageManager.getPackageInfo(packageName2, PackageManager.PackageInfoFlags.of(0L)) : packageManager.getPackageInfo(packageName2, 0);
                    if (packageInfo != null) {
                        appVersionName = packageInfo.versionName;
                    }
                }
            } catch (PackageManager.NameNotFoundException e2) {
                LogController.INSTANCE.e("Exception raised while retrieving appVersionName: " + e2.getMessage());
            }
        }
        return appVersionName;
    }

    public final String getCarrierName() {
        String networkOperatorName;
        Context context = HeliumSdk.INSTANCE.getContext();
        if (context != null) {
            Object systemService = context.getSystemService("phone");
            TelephonyManager telephonyManager = systemService instanceof TelephonyManager ? (TelephonyManager) systemService : null;
            if (telephonyManager != null && (networkOperatorName = telephonyManager.getNetworkOperatorName()) != null) {
                carrierName = networkOperatorName;
            }
        }
        return carrierName;
    }

    public final int getConnectionType() {
        ConnectivityManager connectivityManager;
        NetworkCapabilities networkCapabilities;
        HeliumSdk.Companion companion = HeliumSdk.INSTANCE;
        Context context = companion.getContext();
        if (context != null && (connectivityManager = (ConnectivityManager) context.getApplicationContext().getSystemService(ConnectivityManager.class)) != null && (networkCapabilities = connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork())) != null) {
            if (networkCapabilities.hasTransport(3)) {
                return 1;
            }
            if (networkCapabilities.hasTransport(1)) {
                return 2;
            }
        }
        Context context2 = companion.getContext();
        int dataNetworkType = 0;
        if (context2 != null && ContextCompat.checkSelfPermission(context2, "android.permission.READ_PHONE_STATE") == 0) {
            Object systemService = context2.getSystemService("phone");
            TelephonyManager telephonyManager = systemService instanceof TelephonyManager ? (TelephonyManager) systemService : null;
            if (telephonyManager != null) {
                dataNetworkType = telephonyManager.getDataNetworkType();
            }
        }
        switch (dataNetworkType) {
            case 0:
                return 3;
            case 1:
            case 2:
            case 4:
            case 7:
            case 11:
            case 16:
                return 4;
            case 3:
            case 5:
            case 6:
            case 8:
            case 9:
            case 10:
            case 12:
            case 14:
            case 15:
            case 17:
                return 5;
            case 13:
                return 6;
            case 18:
                return 2;
            case 19:
            default:
                return 3;
            case 20:
                return 7;
        }
    }

    public final Integer getDeviceType() {
        Resources resources;
        Context context = HeliumSdk.INSTANCE.getContext();
        if (context != null && (resources = context.getResources()) != null) {
            DisplayMetrics displayMetrics = resources.getDisplayMetrics();
            float f = displayMetrics.heightPixels / displayMetrics.ydpi;
            float f2 = displayMetrics.widthPixels / displayMetrics.xdpi;
            deviceType = Math.sqrt((double) ((f * f) + (f2 * f2))) >= 6.5d ? 5 : 4;
        }
        return deviceType;
    }

    public final int getDisplayHeight() {
        Resources resources;
        Context context = HeliumSdk.INSTANCE.getContext();
        if (context == null || (resources = context.getResources()) == null) {
            return 0;
        }
        return resources.getDisplayMetrics().heightPixels;
    }

    public final int getDisplayWidth() {
        Resources resources;
        Context context = HeliumSdk.INSTANCE.getContext();
        if (context == null || (resources = context.getResources()) == null) {
            return 0;
        }
        return resources.getDisplayMetrics().widthPixels;
    }

    public final String getIfa() {
        AdvertisingIdClient.Info infoAdvertisingIdClient = advertisingIdClient();
        if (infoAdvertisingIdClient != null) {
            return infoAdvertisingIdClient.getId();
        }
        NonGooglePlayAdvertisingClient nonGooglePlayAdvertisingClientAdvertisingIdNonGooglePlay = advertisingIdNonGooglePlay();
        if (nonGooglePlayAdvertisingClientAdvertisingIdNonGooglePlay != null) {
            return nonGooglePlayAdvertisingClientAdvertisingIdNonGooglePlay.getId();
        }
        return null;
    }

    public final String getLanguage() {
        return Locale.getDefault().getLanguage();
    }

    public final Integer getLmt() {
        AdvertisingIdClient.Info infoAdvertisingIdClient = advertisingIdClient();
        if (infoAdvertisingIdClient != null) {
            return infoAdvertisingIdClient.isLimitAdTrackingEnabled() ? 1 : 0;
        }
        NonGooglePlayAdvertisingClient nonGooglePlayAdvertisingClientAdvertisingIdNonGooglePlay = advertisingIdNonGooglePlay();
        if (nonGooglePlayAdvertisingClientAdvertisingIdNonGooglePlay != null) {
            return Integer.valueOf(nonGooglePlayAdvertisingClientAdvertisingIdNonGooglePlay.getLmt());
        }
        return null;
    }

    public final String getManufacturer() {
        String MANUFACTURER = Build.MANUFACTURER;
        Intrinsics.e(MANUFACTURER, "MANUFACTURER");
        return MANUFACTURER;
    }

    public final String getMccmnc() {
        Context context = HeliumSdk.INSTANCE.getContext();
        if (context != null && ContextCompat.checkSelfPermission(context, "android.permission.READ_PHONE_STATE") == 0) {
            Object systemService = context.getSystemService("phone");
            TelephonyManager telephonyManager = systemService instanceof TelephonyManager ? (TelephonyManager) systemService : null;
            if (telephonyManager != null && telephonyManager.getSimState() == 5) {
                String simOperator = telephonyManager.getSimOperator();
                if (simOperator != null) {
                    return new StringBuffer(simOperator).insert(3, TokenBuilder.TOKEN_DELIMITER).toString();
                }
                return null;
            }
        }
        return mccmnc;
    }

    public final String getModel() {
        String MODEL = Build.MODEL;
        Intrinsics.e(MODEL, "MODEL");
        return MODEL;
    }

    public final String getOperatingSystem() {
        return operatingSystem;
    }

    public final String getOperatingSystemVersion() {
        String RELEASE = Build.VERSION.RELEASE;
        Intrinsics.e(RELEASE, "RELEASE");
        return RELEASE;
    }

    public final Float getPxRatio() {
        Context context = HeliumSdk.INSTANCE.getContext();
        if (context != null) {
            pxRatio = Float.valueOf(context.getResources().getDisplayMetrics().density);
        }
        return pxRatio;
    }

    public final String getSessionId$Helium_release() {
        if (sessionId == null) {
            sessionId = generateSessionId();
        }
        return sessionId;
    }

    public final int getSessionTimeSeconds() {
        Long l2 = sessionStart;
        if (l2 == null) {
            return 0;
        }
        return (int) ((SystemClock.uptimeMillis() / 1000) - l2.longValue());
    }

    public final String getTcString() {
        Context context = HeliumSdk.INSTANCE.getContext();
        if (context == null) {
            LogController.INSTANCE.w("null TC String because context is null");
            return null;
        }
        return context.getSharedPreferences(context.getPackageName() + "_preferences", 0).getString("IABTCF_TCString", null);
    }

    public final String getUserAgent() {
        String string;
        Context context = HeliumSdk.INSTANCE.getContext();
        return (context == null || (string = context.getSharedPreferences(HELIUM_UA_IDENTIFIER_KEY, 0).getString(HELIUM_UA_IDENTIFIER_KEY, "")) == null) ? "" : string;
    }

    public final int getUtcOffsetTime() {
        if (Build.VERSION.SDK_INT >= 26) {
            return OffsetTime.now(ZoneId.systemDefault()).getOffset().getTotalSeconds() / 60;
        }
        Calendar calendar = Calendar.getInstance(Locale.getDefault());
        return (calendar.get(16) + calendar.get(15)) / 60000;
    }

    public final void setSessionId$Helium_release(String str) {
        sessionId = str;
    }

    public final void startSession(Context context) {
        Intrinsics.f(context, "context");
        if (getSessionId$Helium_release() == null) {
            sessionId = generateSessionId();
        }
        if (sessionStart == null) {
            sessionStart = Long.valueOf(SystemClock.uptimeMillis() / 1000);
        }
        DefaultScheduler defaultScheduler = Dispatchers.f44752a;
        BuildersKt.c(CoroutineScopeKt.a(DefaultIoScheduler.f45062Y), null, null, new AnonymousClass1(context, null), 3);
    }
}
