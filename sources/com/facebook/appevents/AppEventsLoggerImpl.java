package com.facebook.appevents;

import an.h;
import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.webkit.WebView;
import androidx.core.app.NotificationCompat;
import b2.o;
import com.adjust.sdk.Constants;
import com.android.installreferrer.api.InstallReferrerClient;
import com.applovin.impl.sdk.b0;
import com.applovin.impl.sdk.x;
import com.facebook.appevents.gps.ara.GpsAraTriggersManager;
import com.facebook.appevents.gps.pa.PACustomAudienceClient;
import com.facebook.appevents.iap.InAppPurchase;
import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.facebook.appevents.iap.InAppPurchaseDedupeConfig;
import com.facebook.appevents.iap.InAppPurchaseManager;
import com.facebook.appevents.integrity.BannedParamManager;
import com.facebook.appevents.integrity.BlocklistEventsManager;
import com.facebook.appevents.integrity.MACARuleMatchingManager;
import com.facebook.appevents.integrity.ProtectedModeManager;
import com.facebook.appevents.integrity.SensitiveParamsManager;
import com.facebook.appevents.integrity.StdParamsEnforcementManager;
import com.facebook.appevents.integrity.VVPManager;
import com.facebook.appevents.internal.ActivityLifecycleTracker;
import com.facebook.appevents.internal.AutomaticAnalyticsLogger;
import com.facebook.appevents.ondeviceprocessing.OnDeviceProcessingManager;
import com.ironsource.X3;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import go.k;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Currency;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.UUID;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.n;
import l7.g0;
import l7.m0;
import l7.s;
import m0.s1;
import org.json.JSONException;
import org.json.JSONObject;
import q7.e0;
import q7.p;
import q7.q;
import q7.u;
import q7.w;
import wj.f;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u0000 M2\u00020\u0001:\u0001MB%\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bB'\b\u0010\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ#\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u000e\u0010\u0012J\u001f\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u000e\u0010\u0015J)\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0014\u001a\u00020\u00132\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u000e\u0010\u0016J!\u0010\u0018\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u00022\b\u0010\u0017\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0018\u0010\u0019J!\u0010\u001e\u001a\u00020\r2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c¢\u0006\u0004\b\u001e\u0010\u001fJ-\u0010\u001e\u001a\u00020\r2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u001e\u0010 J7\u0010#\u001a\u00020\r2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010!¢\u0006\u0004\b#\u0010$J?\u0010\u001e\u001a\u00020\r2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0006\u0010&\u001a\u00020%2\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010!¢\u0006\u0004\b\u001e\u0010'J\u001f\u0010*\u001a\u00020\r2\u0006\u0010(\u001a\u00020\u00102\b\u0010)\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b*\u0010+J\u008f\u0001\u00109\u001a\u00020\r2\b\u0010,\u001a\u0004\u0018\u00010\u00022\b\u0010.\u001a\u0004\u0018\u00010-2\b\u00100\u001a\u0004\u0018\u00010/2\b\u00101\u001a\u0004\u0018\u00010\u00022\b\u00102\u001a\u0004\u0018\u00010\u00022\b\u00103\u001a\u0004\u0018\u00010\u00022\b\u00104\u001a\u0004\u0018\u00010\u00022\b\u00105\u001a\u0004\u0018\u00010\u001a2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\b\u00106\u001a\u0004\u0018\u00010\u00022\b\u00107\u001a\u0004\u0018\u00010\u00022\b\u00108\u001a\u0004\u0018\u00010\u00022\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b9\u0010:J\r\u0010;\u001a\u00020\r¢\u0006\u0004\b;\u0010<J\u0015\u0010=\u001a\u00020%2\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b=\u0010>J)\u0010?\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u00022\b\u0010\u0014\u001a\u0004\u0018\u00010\u00132\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b?\u0010@J+\u0010A\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u00022\b\u0010\u0014\u001a\u0004\u0018\u00010\u00132\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\bA\u0010@JA\u0010A\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u00022\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010!¢\u0006\u0004\bA\u0010BJI\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u00022\b\u0010\u0014\u001a\u0004\u0018\u00010\u00132\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0006\u0010&\u001a\u00020%2\b\u0010D\u001a\u0004\u0018\u00010C2\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010!¢\u0006\u0004\b\u000e\u0010ER\u0014\u0010F\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bF\u0010GR\u0016\u0010I\u001a\u00020H8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bI\u0010JR\u0011\u0010\u0004\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\bK\u0010L¨\u0006N"}, d2 = {"Lcom/facebook/appevents/AppEventsLoggerImpl;", "", "", "activityName", "applicationId", "Ll7/a;", "accessToken", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ll7/a;)V", "Landroid/content/Context;", "context", "(Landroid/content/Context;Ljava/lang/String;Ll7/a;)V", X3.i.f27798j0, "Lwj/r;", "logEvent", "(Ljava/lang/String;)V", "Landroid/os/Bundle;", "parameters", "(Ljava/lang/String;Landroid/os/Bundle;)V", "", "valueToSum", "(Ljava/lang/String;D)V", "(Ljava/lang/String;DLandroid/os/Bundle;)V", "buttonText", "logEventFromSE", "(Ljava/lang/String;Ljava/lang/String;)V", "Ljava/math/BigDecimal;", "purchaseAmount", "Ljava/util/Currency;", "currency", "logPurchase", "(Ljava/math/BigDecimal;Ljava/util/Currency;)V", "(Ljava/math/BigDecimal;Ljava/util/Currency;Landroid/os/Bundle;)V", "Lcom/facebook/appevents/OperationalData;", "operationalData", "logPurchaseImplicitly", "(Ljava/math/BigDecimal;Ljava/util/Currency;Landroid/os/Bundle;Lcom/facebook/appevents/OperationalData;)V", "", "isImplicitlyLogged", "(Ljava/math/BigDecimal;Ljava/util/Currency;Landroid/os/Bundle;ZLcom/facebook/appevents/OperationalData;)V", "payload", "action", "logPushNotificationOpen", "(Landroid/os/Bundle;Ljava/lang/String;)V", "itemID", "Lcom/facebook/appevents/AppEventsLogger$ProductAvailability;", "availability", "Lcom/facebook/appevents/AppEventsLogger$ProductCondition;", "condition", "description", "imageLink", "link", "title", "priceAmount", "gtin", "mpn", "brand", "logProductItem", "(Ljava/lang/String;Lcom/facebook/appevents/AppEventsLogger$ProductAvailability;Lcom/facebook/appevents/AppEventsLogger$ProductCondition;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/util/Currency;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)V", "flush", "()V", "isValidForAccessToken", "(Ll7/a;)Z", "logSdkEvent", "(Ljava/lang/String;Ljava/lang/Double;Landroid/os/Bundle;)V", "logEventImplicitly", "(Ljava/lang/String;Ljava/math/BigDecimal;Ljava/util/Currency;Landroid/os/Bundle;Lcom/facebook/appevents/OperationalData;)V", "Ljava/util/UUID;", "currentSessionId", "(Ljava/lang/String;Ljava/lang/Double;Landroid/os/Bundle;ZLjava/util/UUID;Lcom/facebook/appevents/OperationalData;)V", "contextName", "Ljava/lang/String;", "Lcom/facebook/appevents/AccessTokenAppIdPair;", "accessTokenAppId", "Lcom/facebook/appevents/AccessTokenAppIdPair;", "getApplicationId", "()Ljava/lang/String;", "Companion", "facebook-core_release"}, k = 1, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
public final class AppEventsLoggerImpl {
    private static final String ACCOUNT_KIT_EVENT_NAME_PREFIX = "fb_ak";
    public static final String APP_EVENTS_KILLSWITCH = "app_events_killswitch";
    private static final String APP_EVENT_NAME_PUSH_OPENED = "fb_mobile_push_opened";
    private static final String APP_EVENT_PREFERENCES = "com.facebook.sdk.appEventPreferences";
    private static final String APP_EVENT_PUSH_PARAMETER_ACTION = "fb_push_action";
    private static final String APP_EVENT_PUSH_PARAMETER_CAMPAIGN = "fb_push_campaign";
    private static final int APP_SUPPORTS_ATTRIBUTION_ID_RECHECK_PERIOD_IN_SECONDS = 86400;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final String PUSH_PAYLOAD_CAMPAIGN_KEY = "campaign";
    private static final String PUSH_PAYLOAD_KEY = "fb_push_payload";
    private static final String TAG;
    private static volatile String anonymousAppDeviceGUID;
    private static ScheduledThreadPoolExecutor backgroundExecutor;
    private static AppEventsLogger.FlushBehavior flushBehaviorField;
    private static final w installReferrerCallback;
    private static boolean isActivateAppEventRequested;
    private static String pushNotificationsRegistrationIdField;
    private static final Object staticLock;
    private AccessTokenAppIdPair accessTokenAppId;
    private final String contextName;

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    @Metadata(d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0011\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\b\u0010\u0003J\u001f\u0010\r\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0007¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u0012H\u0007¢\u0006\u0004\b\u0016\u0010\u0017J\u0011\u0010\u0018\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\u0018\u0010\u0006J\u0019\u0010\u001a\u001a\u00020\u00072\b\u0010\u0019\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\u001a\u0010\u0011J!\u0010\u001e\u001a\u00020\u00072\u0006\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\u001e\u0010\u001fJ;\u0010'\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010 \u0012\u0006\u0012\u0004\u0018\u00010\"0&2\b\u0010!\u001a\u0004\u0018\u00010 2\b\u0010#\u001a\u0004\u0018\u00010\"2\u0006\u0010%\u001a\u00020$H\u0007¢\u0006\u0004\b'\u0010(J\u0017\u0010*\u001a\u00020\u00072\u0006\u0010)\u001a\u00020\u0004H\u0007¢\u0006\u0004\b*\u0010\u0011J!\u0010-\u001a\u00020\u00072\u0006\u0010,\u001a\u00020+2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b-\u0010.J\u000f\u0010/\u001a\u00020\u0007H\u0007¢\u0006\u0004\b/\u0010\u0003J\u0011\u00100\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b0\u0010\u0006J\u0011\u00101\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b1\u0010\u0006J\u0019\u00103\u001a\u00020\u00072\b\u00102\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b3\u0010\u0011J!\u00106\u001a\u00020\u00072\u0006\u00105\u001a\u0002042\b\u0010,\u001a\u0004\u0018\u00010+H\u0007¢\u0006\u0004\b6\u00107J\r\u00108\u001a\u00020\u0007¢\u0006\u0004\b8\u0010\u0003J\u000f\u0010:\u001a\u000209H\u0007¢\u0006\u0004\b:\u0010;J\u0017\u0010<\u001a\u00020\u00042\u0006\u0010,\u001a\u00020+H\u0007¢\u0006\u0004\b<\u0010=R\u0014\u0010>\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b>\u0010?R\u0014\u0010@\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b@\u0010?R\u0014\u0010A\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\bA\u0010?R\u0014\u0010B\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\bB\u0010?R\u0014\u0010C\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\bC\u0010?R\u0014\u0010D\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\bD\u0010?R\u0014\u0010F\u001a\u00020E8\u0002X\u0082T¢\u0006\u0006\n\u0004\bF\u0010GR\u0014\u0010H\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\bH\u0010?R\u0014\u0010I\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\bI\u0010?R\u0014\u0010J\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bJ\u0010?R\u0018\u0010K\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bK\u0010?R\u0018\u0010M\u001a\u0004\u0018\u00010L8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bM\u0010NR\u0016\u0010O\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bO\u0010PR\u0014\u0010R\u001a\u00020Q8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bR\u0010SR\u0016\u0010T\u001a\u00020$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bT\u0010UR\u0018\u0010V\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bV\u0010?R\u0014\u0010W\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bW\u0010X¨\u0006Y"}, d2 = {"Lcom/facebook/appevents/AppEventsLoggerImpl$Companion;", "", "<init>", "()V", "", "readInstallReferrerFromPrefs", "()Ljava/lang/String;", "Lwj/r;", "initializeTimersIfNeeded", "Lcom/facebook/appevents/AppEvent;", NotificationCompat.CATEGORY_EVENT, "Lcom/facebook/appevents/AccessTokenAppIdPair;", "accessTokenAppId", "logEvent", "(Lcom/facebook/appevents/AppEvent;Lcom/facebook/appevents/AccessTokenAppIdPair;)V", "message", "notifyDeveloperError", "(Ljava/lang/String;)V", "Lcom/facebook/appevents/AppEventsLogger$FlushBehavior;", "getFlushBehavior", "()Lcom/facebook/appevents/AppEventsLogger$FlushBehavior;", "flushBehavior", "setFlushBehavior", "(Lcom/facebook/appevents/AppEventsLogger$FlushBehavior;)V", "getPushNotificationsRegistrationId", "registrationId", "setPushNotificationsRegistrationId", "Landroid/app/Application;", "application", "applicationId", "activateApp", "(Landroid/app/Application;Ljava/lang/String;)V", "Landroid/os/Bundle;", "params", "Lcom/facebook/appevents/OperationalData;", "operationalData", "", "isImplicitlyLogged", "Lwj/f;", "addImplicitPurchaseParameters", "(Landroid/os/Bundle;Lcom/facebook/appevents/OperationalData;Z)Lwj/f;", "extraMsg", "functionDEPRECATED", "Landroid/content/Context;", "context", "initializeLib", "(Landroid/content/Context;Ljava/lang/String;)V", "onContextStop", "getInstallReferrer", "getInstallReferrerBlocking", Constants.REFERRER, "setInstallReferrer", "Landroid/webkit/WebView;", "webView", "augmentWebView", "(Landroid/webkit/WebView;Landroid/content/Context;)V", "eagerFlush", "Ljava/util/concurrent/Executor;", "getAnalyticsExecutor", "()Ljava/util/concurrent/Executor;", "getAnonymousAppDeviceGUID", "(Landroid/content/Context;)Ljava/lang/String;", "ACCOUNT_KIT_EVENT_NAME_PREFIX", "Ljava/lang/String;", "APP_EVENTS_KILLSWITCH", "APP_EVENT_NAME_PUSH_OPENED", "APP_EVENT_PREFERENCES", "APP_EVENT_PUSH_PARAMETER_ACTION", "APP_EVENT_PUSH_PARAMETER_CAMPAIGN", "", "APP_SUPPORTS_ATTRIBUTION_ID_RECHECK_PERIOD_IN_SECONDS", "I", "PUSH_PAYLOAD_CAMPAIGN_KEY", "PUSH_PAYLOAD_KEY", "TAG", "anonymousAppDeviceGUID", "Ljava/util/concurrent/ScheduledThreadPoolExecutor;", "backgroundExecutor", "Ljava/util/concurrent/ScheduledThreadPoolExecutor;", "flushBehaviorField", "Lcom/facebook/appevents/AppEventsLogger$FlushBehavior;", "Lq7/w;", "installReferrerCallback", "Lq7/w;", "isActivateAppEventRequested", "Z", "pushNotificationsRegistrationIdField", "staticLock", "Ljava/lang/Object;", "facebook-core_release"}, k = 1, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
    public static final class Companion {
        public /* synthetic */ Companion(g gVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void initializeLib$lambda$4(Context context, AppEventsLoggerImpl logger) {
            n.f(context, "$context");
            n.f(logger, "$logger");
            Bundle bundle = new Bundle();
            String[] strArr = {"com.facebook.core.Core", "com.facebook.login.Login", "com.facebook.share.Share", "com.facebook.places.Places", "com.facebook.messenger.Messenger", "com.facebook.applinks.AppLinks", "com.facebook.marketing.Marketing", "com.facebook.gamingservices.GamingServices", "com.facebook.all.All", InAppPurchaseConstants.CLASSNAME_BILLING_CLIENT, "com.android.vending.billing.IInAppBillingService"};
            String[] strArr2 = {"core_lib_included", "login_lib_included", "share_lib_included", "places_lib_included", "messenger_lib_included", "applinks_lib_included", "marketing_lib_included", "gamingservices_lib_included", "all_lib_included", "billing_client_lib_included", "billing_service_lib_included"};
            int i10 = 0;
            for (int i11 = 0; i11 < 11; i11++) {
                String str = strArr[i11];
                String str2 = strArr2[i11];
                try {
                    Class.forName(str);
                    bundle.putInt(str2, 1);
                    i10 |= 1 << i11;
                } catch (ClassNotFoundException unused) {
                }
            }
            SharedPreferences sharedPreferences = context.getSharedPreferences(AppEventsLoggerImpl.APP_EVENT_PREFERENCES, 0);
            if (sharedPreferences.getInt("kitsBitmask", 0) != i10) {
                sharedPreferences.edit().putInt("kitsBitmask", i10).apply();
                logger.logEventImplicitly("fb_sdk_initialize", null, bundle);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void initializeTimersIfNeeded() {
            synchronized (AppEventsLoggerImpl.access$getStaticLock$cp()) {
                if (AppEventsLoggerImpl.access$getBackgroundExecutor$cp() != null) {
                    return;
                }
                AppEventsLoggerImpl.access$setBackgroundExecutor$cp(new ScheduledThreadPoolExecutor(1));
                x xVar = new x(4);
                ScheduledThreadPoolExecutor scheduledThreadPoolExecutorAccess$getBackgroundExecutor$cp = AppEventsLoggerImpl.access$getBackgroundExecutor$cp();
                if (scheduledThreadPoolExecutorAccess$getBackgroundExecutor$cp == null) {
                    throw new IllegalStateException("Required value was null.");
                }
                scheduledThreadPoolExecutorAccess$getBackgroundExecutor$cp.scheduleAtFixedRate(xVar, 0L, 86400L, TimeUnit.SECONDS);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void initializeTimersIfNeeded$lambda$6() {
            HashSet hashSet = new HashSet();
            Iterator<AccessTokenAppIdPair> it = AppEventQueue.getKeySet().iterator();
            while (it.hasNext()) {
                hashSet.add(it.next().getApplicationId());
            }
            Iterator it2 = hashSet.iterator();
            while (it2.hasNext()) {
                u.k((String) it2.next(), true);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void logEvent(AppEvent event, AccessTokenAppIdPair accessTokenAppId) {
            AppEventQueue.add(accessTokenAppId, event);
            if (p.b(q7.n.OnDevicePostInstallEventProcessing) && OnDeviceProcessingManager.isOnDeviceProcessingEnabled()) {
                OnDeviceProcessingManager.sendCustomEventAsync(accessTokenAppId.getApplicationId(), event);
            }
            if (p.b(q7.n.GPSARATriggers)) {
                GpsAraTriggersManager.INSTANCE.registerTriggerAsync(accessTokenAppId.getApplicationId(), event);
            }
            if (p.b(q7.n.GPSPACAProcessing)) {
                PACustomAudienceClient.INSTANCE.joinCustomAudience(accessTokenAppId.getApplicationId(), event);
            }
            if (event.getIsImplicit() || AppEventsLoggerImpl.access$isActivateAppEventRequested$cp()) {
                return;
            }
            if (n.a(event.getName(), AppEventsConstants.EVENT_NAME_ACTIVATED_APP)) {
                AppEventsLoggerImpl.access$setActivateAppEventRequested$cp(true);
            } else {
                q7.x.f48792c.s(g0.f45136d, "AppEvents", "Warning: Please call AppEventsLogger.activateApp(...)from the long-lived activity's onResume() methodbefore logging other app events.");
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void notifyDeveloperError(String message) {
            q7.x.f48792c.s(g0.f45137e, "AppEvents", message);
        }

        private final String readInstallReferrerFromPrefs() {
            return s.b().getSharedPreferences(AppEventsLoggerImpl.APP_EVENT_PREFERENCES, 0).getString(Constants.INSTALL_REFERRER, null);
        }

        public final void activateApp(Application application, String applicationId) {
            n.f(application, "application");
            if (!s.f45226p.get()) {
                throw new l7.n("The Facebook sdk must be initialized before calling activateApp");
            }
            AnalyticsUserIDStore.initStore();
            UserDataStore.initStore();
            if (applicationId == null) {
                applicationId = s.c();
            }
            if (!v7.a.b(s.class)) {
                try {
                    Context applicationContext = application.getApplicationContext();
                    if (applicationContext != null) {
                        if (!q.b(AppEventsLoggerImpl.APP_EVENTS_KILLSWITCH, s.c(), false)) {
                            s.d().execute(new l2.u(4, applicationContext, applicationId));
                        }
                        if (p.b(q7.n.OnDeviceEventProcessing) && OnDeviceProcessingManager.isOnDeviceProcessingEnabled()) {
                            OnDeviceProcessingManager.sendInstallEventAsync(applicationId, "com.facebook.sdk.attributionTracking");
                        }
                    }
                } catch (Throwable th2) {
                    v7.a.a(s.class, th2);
                }
            }
            ActivityLifecycleTracker.startTracking(application, applicationId);
            if (p.b(q7.n.GPSPACAProcessing)) {
                PACustomAudienceClient.INSTANCE.joinCustomAudience(applicationId, "fb_mobile_app_install");
            }
            if (p.b(q7.n.GPSARATriggers)) {
                GpsAraTriggersManager.INSTANCE.registerTriggerAsync(applicationId, new AppEvent("unknown", "MOBILE_INSTALL_EVENT", null, null, false, ActivityLifecycleTracker.isInBackground(), ActivityLifecycleTracker.getCurrentSessionGuid(), null));
            }
        }

        /* JADX WARN: Code duplicated, block: B:16:0x0056  */
        public final f addImplicitPurchaseParameters(Bundle params, OperationalData operationalData, boolean isImplicitlyLogged) {
            OperationalData.Companion companion;
            OperationalDataEnum operationalDataEnum;
            String str = AutomaticAnalyticsLogger.isImplicitPurchaseLoggingEnabled() ? "1" : "0";
            OperationalData.Companion companion2 = OperationalData.INSTANCE;
            OperationalDataEnum operationalDataEnum2 = OperationalDataEnum.IAPParameters;
            f fVarAddParameterAndReturn = companion2.addParameterAndReturn(operationalDataEnum2, com.facebook.appevents.internal.Constants.EVENT_PARAM_IS_IMPLICIT_PURCHASE_LOGGING_ENABLED, str, params, operationalData);
            Object parameter = companion2.getParameter(operationalDataEnum2, com.facebook.appevents.internal.Constants.IAP_PRODUCT_ID, params, operationalData);
            String str2 = parameter instanceof String ? (String) parameter : null;
            if (isImplicitlyLogged) {
                companion = companion2;
                operationalDataEnum = operationalDataEnum2;
            } else {
                if ((params != null ? params.getString(AppEventsConstants.EVENT_PARAM_CONTENT_ID) : null) != null || str2 == null) {
                    companion = companion2;
                    operationalDataEnum = operationalDataEnum2;
                } else {
                    companion = companion2;
                    operationalDataEnum = operationalDataEnum2;
                    f fVarAddParameterAndReturn2 = companion.addParameterAndReturn(operationalDataEnum, AppEventsConstants.EVENT_PARAM_CONTENT_ID, str2, params, operationalData);
                    fVarAddParameterAndReturn = companion.addParameterAndReturn(operationalDataEnum, com.facebook.appevents.internal.Constants.ANDROID_DYNAMIC_ADS_CONTENT_ID, "client_manual", (Bundle) fVarAddParameterAndReturn2.f53283a, (OperationalData) fVarAddParameterAndReturn2.f53284b);
                }
            }
            f fVarAddParameterAndReturn3 = companion.addParameterAndReturn(operationalDataEnum, com.facebook.appevents.internal.Constants.EVENT_PARAM_IS_AUTOLOG_APP_EVENTS_ENABLED, m0.c() ? "1" : "0", (Bundle) fVarAddParameterAndReturn.f53283a, (OperationalData) fVarAddParameterAndReturn.f53284b);
            return new f((Bundle) fVarAddParameterAndReturn3.f53283a, (OperationalData) fVarAddParameterAndReturn3.f53284b);
        }

        public final void augmentWebView(WebView webView, Context context) {
            n.f(webView, "webView");
            String RELEASE = Build.VERSION.RELEASE;
            n.e(RELEASE, "RELEASE");
            String[] strArr = (String[]) h.I0(RELEASE, new String[]{"."}, 0, 6).toArray(new String[0]);
            int i10 = strArr.length == 0 ? 0 : Integer.parseInt(strArr[0]);
            int i11 = strArr.length > 1 ? Integer.parseInt(strArr[1]) : 0;
            if (i10 < 4 || (i10 == 4 && i11 <= 1)) {
                q7.x.f48792c.s(g0.f45137e, AppEventsLoggerImpl.access$getTAG$cp(), "augmentWebView is only available for Android SDK version >= 17 on devices running Android >= 4.2");
            } else {
                webView.addJavascriptInterface(new FacebookSDKJSInterface(context), "fbmq_".concat(s.c()));
            }
        }

        public final void eagerFlush() {
            if (getFlushBehavior() != AppEventsLogger.FlushBehavior.EXPLICIT_ONLY) {
                AppEventQueue.flush(FlushReason.EAGER_FLUSHING_EVENT);
            }
        }

        public final void functionDEPRECATED(String extraMsg) {
            n.f(extraMsg, "extraMsg");
            Log.w(AppEventsLoggerImpl.access$getTAG$cp(), "This function is deprecated. ".concat(extraMsg));
        }

        public final Executor getAnalyticsExecutor() {
            if (AppEventsLoggerImpl.access$getBackgroundExecutor$cp() == null) {
                initializeTimersIfNeeded();
            }
            ScheduledThreadPoolExecutor scheduledThreadPoolExecutorAccess$getBackgroundExecutor$cp = AppEventsLoggerImpl.access$getBackgroundExecutor$cp();
            if (scheduledThreadPoolExecutorAccess$getBackgroundExecutor$cp != null) {
                return scheduledThreadPoolExecutorAccess$getBackgroundExecutor$cp;
            }
            throw new IllegalStateException("Required value was null.");
        }

        public final String getAnonymousAppDeviceGUID(Context context) {
            n.f(context, "context");
            if (AppEventsLoggerImpl.access$getAnonymousAppDeviceGUID$cp() == null) {
                synchronized (AppEventsLoggerImpl.access$getStaticLock$cp()) {
                    if (AppEventsLoggerImpl.access$getAnonymousAppDeviceGUID$cp() == null) {
                        AppEventsLoggerImpl.access$setAnonymousAppDeviceGUID$cp(context.getSharedPreferences(AppEventsLoggerImpl.APP_EVENT_PREFERENCES, 0).getString("anonymousAppDeviceGUID", null));
                        if (AppEventsLoggerImpl.access$getAnonymousAppDeviceGUID$cp() == null) {
                            AppEventsLoggerImpl.access$setAnonymousAppDeviceGUID$cp("XZ" + UUID.randomUUID());
                            context.getSharedPreferences(AppEventsLoggerImpl.APP_EVENT_PREFERENCES, 0).edit().putString("anonymousAppDeviceGUID", AppEventsLoggerImpl.access$getAnonymousAppDeviceGUID$cp()).apply();
                        }
                    }
                }
            }
            String strAccess$getAnonymousAppDeviceGUID$cp = AppEventsLoggerImpl.access$getAnonymousAppDeviceGUID$cp();
            if (strAccess$getAnonymousAppDeviceGUID$cp != null) {
                return strAccess$getAnonymousAppDeviceGUID$cp;
            }
            throw new IllegalStateException("Required value was null.");
        }

        public final AppEventsLogger.FlushBehavior getFlushBehavior() {
            AppEventsLogger.FlushBehavior flushBehaviorAccess$getFlushBehaviorField$cp;
            synchronized (AppEventsLoggerImpl.access$getStaticLock$cp()) {
                flushBehaviorAccess$getFlushBehaviorField$cp = AppEventsLoggerImpl.access$getFlushBehaviorField$cp();
            }
            return flushBehaviorAccess$getFlushBehaviorField$cp;
        }

        public final String getInstallReferrer() {
            w callback = AppEventsLoggerImpl.access$getInstallReferrerCallback$cp();
            n.f(callback, "callback");
            if (!s.b().getSharedPreferences(AppEventsLoggerImpl.APP_EVENT_PREFERENCES, 0).getBoolean("is_referrer_updated", false)) {
                InstallReferrerClient installReferrerClientBuild = InstallReferrerClient.newBuilder(s.b()).build();
                try {
                    installReferrerClientBuild.startConnection(new s1(installReferrerClientBuild, callback, (CountDownLatch) null));
                } catch (Exception unused) {
                }
            }
            return readInstallReferrerFromPrefs();
        }

        public final String getInstallReferrerBlocking() {
            w callback = AppEventsLoggerImpl.access$getInstallReferrerCallback$cp();
            n.f(callback, "callback");
            if (!s.b().getSharedPreferences(AppEventsLoggerImpl.APP_EVENT_PREFERENCES, 0).getBoolean("is_referrer_updated", false)) {
                CountDownLatch countDownLatch = new CountDownLatch(1);
                InstallReferrerClient installReferrerClientBuild = InstallReferrerClient.newBuilder(s.b()).build();
                try {
                    installReferrerClientBuild.startConnection(new s1(installReferrerClientBuild, callback, countDownLatch));
                } catch (Exception unused) {
                    countDownLatch.countDown();
                }
                try {
                    countDownLatch.await(5L, TimeUnit.SECONDS);
                } catch (InterruptedException unused2) {
                }
            }
            return readInstallReferrerFromPrefs();
        }

        public final String getPushNotificationsRegistrationId() {
            String strAccess$getPushNotificationsRegistrationIdField$cp;
            synchronized (AppEventsLoggerImpl.access$getStaticLock$cp()) {
                strAccess$getPushNotificationsRegistrationIdField$cp = AppEventsLoggerImpl.access$getPushNotificationsRegistrationIdField$cp();
            }
            return strAccess$getPushNotificationsRegistrationIdField$cp;
        }

        public final void initializeLib(Context context, String applicationId) {
            n.f(context, "context");
            s sVar = s.f45212a;
            if (m0.c()) {
                AppEventsLoggerImpl appEventsLoggerImpl = new AppEventsLoggerImpl(context, applicationId, (l7.a) null);
                ScheduledThreadPoolExecutor scheduledThreadPoolExecutorAccess$getBackgroundExecutor$cp = AppEventsLoggerImpl.access$getBackgroundExecutor$cp();
                if (scheduledThreadPoolExecutorAccess$getBackgroundExecutor$cp == null) {
                    throw new IllegalStateException("Required value was null.");
                }
                scheduledThreadPoolExecutorAccess$getBackgroundExecutor$cp.execute(new o(13, context, appEventsLoggerImpl));
            }
        }

        public final void onContextStop() {
            AppEventQueue.persistToDisk();
        }

        public final void setFlushBehavior(AppEventsLogger.FlushBehavior flushBehavior) {
            n.f(flushBehavior, "flushBehavior");
            synchronized (AppEventsLoggerImpl.access$getStaticLock$cp()) {
                AppEventsLoggerImpl.access$setFlushBehaviorField$cp(flushBehavior);
            }
        }

        public final void setInstallReferrer(String referrer) {
            SharedPreferences sharedPreferences = s.b().getSharedPreferences(AppEventsLoggerImpl.APP_EVENT_PREFERENCES, 0);
            if (referrer != null) {
                sharedPreferences.edit().putString(Constants.INSTALL_REFERRER, referrer).apply();
            }
        }

        public final void setPushNotificationsRegistrationId(String registrationId) {
            synchronized (AppEventsLoggerImpl.access$getStaticLock$cp()) {
                String strAccess$getPushNotificationsRegistrationIdField$cp = AppEventsLoggerImpl.access$getPushNotificationsRegistrationIdField$cp();
                boolean zA = true;
                boolean z10 = strAccess$getPushNotificationsRegistrationIdField$cp == null || strAccess$getPushNotificationsRegistrationIdField$cp.length() == 0;
                boolean z11 = registrationId == null || registrationId.length() == 0;
                if (!z10 || !z11) {
                    zA = (z10 || z11) ? false : n.a(strAccess$getPushNotificationsRegistrationIdField$cp, registrationId);
                }
                if (!zA) {
                    AppEventsLoggerImpl.access$setPushNotificationsRegistrationIdField$cp(registrationId);
                    AppEventsLoggerImpl appEventsLoggerImpl = new AppEventsLoggerImpl(s.b(), (String) null, (l7.a) null);
                    appEventsLoggerImpl.logEvent(AppEventsConstants.EVENT_NAME_PUSH_TOKEN_OBTAINED);
                    if (AppEventsLoggerImpl.INSTANCE.getFlushBehavior() != AppEventsLogger.FlushBehavior.EXPLICIT_ONLY) {
                        appEventsLoggerImpl.flush();
                    }
                }
            }
        }

        private Companion() {
        }
    }

    static {
        String canonicalName = AppEventsLoggerImpl.class.getCanonicalName();
        if (canonicalName == null) {
            canonicalName = "com.facebook.appevents.AppEventsLoggerImpl";
        }
        TAG = canonicalName;
        flushBehaviorField = AppEventsLogger.FlushBehavior.AUTO;
        staticLock = new Object();
        installReferrerCallback = new b0(3);
    }

    public AppEventsLoggerImpl(String activityName, String str, l7.a aVar) {
        n.f(activityName, "activityName");
        q7.f.o();
        this.contextName = activityName;
        if (aVar == null) {
            Date date = l7.a.l;
            aVar = k.D();
        }
        if (aVar == null || new Date().after(aVar.f45071a) || !(str == null || str.equals(aVar.f45078h))) {
            if (str == null) {
                s.b();
                str = s.c();
            }
            this.accessTokenAppId = new AccessTokenAppIdPair(null, str);
        } else {
            this.accessTokenAppId = new AccessTokenAppIdPair(aVar);
        }
        INSTANCE.initializeTimersIfNeeded();
    }

    public static final /* synthetic */ String access$getAnonymousAppDeviceGUID$cp() {
        if (v7.a.b(AppEventsLoggerImpl.class)) {
            return null;
        }
        try {
            return anonymousAppDeviceGUID;
        } catch (Throwable th2) {
            v7.a.a(AppEventsLoggerImpl.class, th2);
            return null;
        }
    }

    public static final /* synthetic */ ScheduledThreadPoolExecutor access$getBackgroundExecutor$cp() {
        if (v7.a.b(AppEventsLoggerImpl.class)) {
            return null;
        }
        try {
            return backgroundExecutor;
        } catch (Throwable th2) {
            v7.a.a(AppEventsLoggerImpl.class, th2);
            return null;
        }
    }

    public static final /* synthetic */ AppEventsLogger.FlushBehavior access$getFlushBehaviorField$cp() {
        if (v7.a.b(AppEventsLoggerImpl.class)) {
            return null;
        }
        try {
            return flushBehaviorField;
        } catch (Throwable th2) {
            v7.a.a(AppEventsLoggerImpl.class, th2);
            return null;
        }
    }

    public static final /* synthetic */ w access$getInstallReferrerCallback$cp() {
        if (v7.a.b(AppEventsLoggerImpl.class)) {
            return null;
        }
        try {
            return installReferrerCallback;
        } catch (Throwable th2) {
            v7.a.a(AppEventsLoggerImpl.class, th2);
            return null;
        }
    }

    public static final /* synthetic */ String access$getPushNotificationsRegistrationIdField$cp() {
        if (v7.a.b(AppEventsLoggerImpl.class)) {
            return null;
        }
        try {
            return pushNotificationsRegistrationIdField;
        } catch (Throwable th2) {
            v7.a.a(AppEventsLoggerImpl.class, th2);
            return null;
        }
    }

    public static final /* synthetic */ Object access$getStaticLock$cp() {
        if (v7.a.b(AppEventsLoggerImpl.class)) {
            return null;
        }
        try {
            return staticLock;
        } catch (Throwable th2) {
            v7.a.a(AppEventsLoggerImpl.class, th2);
            return null;
        }
    }

    public static final /* synthetic */ String access$getTAG$cp() {
        if (v7.a.b(AppEventsLoggerImpl.class)) {
            return null;
        }
        try {
            return TAG;
        } catch (Throwable th2) {
            v7.a.a(AppEventsLoggerImpl.class, th2);
            return null;
        }
    }

    public static final /* synthetic */ boolean access$isActivateAppEventRequested$cp() {
        if (v7.a.b(AppEventsLoggerImpl.class)) {
            return false;
        }
        try {
            return isActivateAppEventRequested;
        } catch (Throwable th2) {
            v7.a.a(AppEventsLoggerImpl.class, th2);
            return false;
        }
    }

    public static final /* synthetic */ void access$setActivateAppEventRequested$cp(boolean z10) {
        if (v7.a.b(AppEventsLoggerImpl.class)) {
            return;
        }
        try {
            isActivateAppEventRequested = z10;
        } catch (Throwable th2) {
            v7.a.a(AppEventsLoggerImpl.class, th2);
        }
    }

    public static final /* synthetic */ void access$setAnonymousAppDeviceGUID$cp(String str) {
        if (v7.a.b(AppEventsLoggerImpl.class)) {
            return;
        }
        try {
            anonymousAppDeviceGUID = str;
        } catch (Throwable th2) {
            v7.a.a(AppEventsLoggerImpl.class, th2);
        }
    }

    public static final /* synthetic */ void access$setBackgroundExecutor$cp(ScheduledThreadPoolExecutor scheduledThreadPoolExecutor) {
        if (v7.a.b(AppEventsLoggerImpl.class)) {
            return;
        }
        try {
            backgroundExecutor = scheduledThreadPoolExecutor;
        } catch (Throwable th2) {
            v7.a.a(AppEventsLoggerImpl.class, th2);
        }
    }

    public static final /* synthetic */ void access$setFlushBehaviorField$cp(AppEventsLogger.FlushBehavior flushBehavior) {
        if (v7.a.b(AppEventsLoggerImpl.class)) {
            return;
        }
        try {
            flushBehaviorField = flushBehavior;
        } catch (Throwable th2) {
            v7.a.a(AppEventsLoggerImpl.class, th2);
        }
    }

    public static final /* synthetic */ void access$setPushNotificationsRegistrationIdField$cp(String str) {
        if (v7.a.b(AppEventsLoggerImpl.class)) {
            return;
        }
        try {
            pushNotificationsRegistrationIdField = str;
        } catch (Throwable th2) {
            v7.a.a(AppEventsLoggerImpl.class, th2);
        }
    }

    public static final void activateApp(Application application, String str) {
        if (v7.a.b(AppEventsLoggerImpl.class)) {
            return;
        }
        try {
            INSTANCE.activateApp(application, str);
        } catch (Throwable th2) {
            v7.a.a(AppEventsLoggerImpl.class, th2);
        }
    }

    public static final f addImplicitPurchaseParameters(Bundle bundle, OperationalData operationalData, boolean z10) {
        if (v7.a.b(AppEventsLoggerImpl.class)) {
            return null;
        }
        try {
            return INSTANCE.addImplicitPurchaseParameters(bundle, operationalData, z10);
        } catch (Throwable th2) {
            v7.a.a(AppEventsLoggerImpl.class, th2);
            return null;
        }
    }

    public static final void augmentWebView(WebView webView, Context context) {
        if (v7.a.b(AppEventsLoggerImpl.class)) {
            return;
        }
        try {
            INSTANCE.augmentWebView(webView, context);
        } catch (Throwable th2) {
            v7.a.a(AppEventsLoggerImpl.class, th2);
        }
    }

    public static final void functionDEPRECATED(String str) {
        if (v7.a.b(AppEventsLoggerImpl.class)) {
            return;
        }
        try {
            INSTANCE.functionDEPRECATED(str);
        } catch (Throwable th2) {
            v7.a.a(AppEventsLoggerImpl.class, th2);
        }
    }

    public static final Executor getAnalyticsExecutor() {
        if (v7.a.b(AppEventsLoggerImpl.class)) {
            return null;
        }
        try {
            return INSTANCE.getAnalyticsExecutor();
        } catch (Throwable th2) {
            v7.a.a(AppEventsLoggerImpl.class, th2);
            return null;
        }
    }

    public static final String getAnonymousAppDeviceGUID(Context context) {
        if (v7.a.b(AppEventsLoggerImpl.class)) {
            return null;
        }
        try {
            return INSTANCE.getAnonymousAppDeviceGUID(context);
        } catch (Throwable th2) {
            v7.a.a(AppEventsLoggerImpl.class, th2);
            return null;
        }
    }

    public static final AppEventsLogger.FlushBehavior getFlushBehavior() {
        if (v7.a.b(AppEventsLoggerImpl.class)) {
            return null;
        }
        try {
            return INSTANCE.getFlushBehavior();
        } catch (Throwable th2) {
            v7.a.a(AppEventsLoggerImpl.class, th2);
            return null;
        }
    }

    public static final String getInstallReferrer() {
        if (v7.a.b(AppEventsLoggerImpl.class)) {
            return null;
        }
        try {
            return INSTANCE.getInstallReferrer();
        } catch (Throwable th2) {
            v7.a.a(AppEventsLoggerImpl.class, th2);
            return null;
        }
    }

    public static final String getInstallReferrerBlocking() {
        if (v7.a.b(AppEventsLoggerImpl.class)) {
            return null;
        }
        try {
            return INSTANCE.getInstallReferrerBlocking();
        } catch (Throwable th2) {
            v7.a.a(AppEventsLoggerImpl.class, th2);
            return null;
        }
    }

    public static final String getPushNotificationsRegistrationId() {
        if (v7.a.b(AppEventsLoggerImpl.class)) {
            return null;
        }
        try {
            return INSTANCE.getPushNotificationsRegistrationId();
        } catch (Throwable th2) {
            v7.a.a(AppEventsLoggerImpl.class, th2);
            return null;
        }
    }

    public static final void initializeLib(Context context, String str) {
        if (v7.a.b(AppEventsLoggerImpl.class)) {
            return;
        }
        try {
            INSTANCE.initializeLib(context, str);
        } catch (Throwable th2) {
            v7.a.a(AppEventsLoggerImpl.class, th2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void installReferrerCallback$lambda$0(String str) {
        if (v7.a.b(AppEventsLoggerImpl.class)) {
            return;
        }
        try {
            INSTANCE.setInstallReferrer(str);
        } catch (Throwable th2) {
            v7.a.a(AppEventsLoggerImpl.class, th2);
        }
    }

    public static /* synthetic */ void logEvent$default(AppEventsLoggerImpl appEventsLoggerImpl, String str, Bundle bundle, int i10, Object obj) {
        if (v7.a.b(AppEventsLoggerImpl.class)) {
            return;
        }
        if ((i10 & 2) != 0) {
            bundle = null;
        }
        try {
            appEventsLoggerImpl.logEvent(str, bundle);
        } catch (Throwable th2) {
            v7.a.a(AppEventsLoggerImpl.class, th2);
        }
    }

    public static /* synthetic */ void logEventImplicitly$default(AppEventsLoggerImpl appEventsLoggerImpl, String str, BigDecimal bigDecimal, Currency currency, Bundle bundle, OperationalData operationalData, int i10, Object obj) {
        if (v7.a.b(AppEventsLoggerImpl.class)) {
            return;
        }
        if ((i10 & 16) != 0) {
            operationalData = null;
        }
        try {
            appEventsLoggerImpl.logEventImplicitly(str, bigDecimal, currency, bundle, operationalData);
        } catch (Throwable th2) {
            v7.a.a(AppEventsLoggerImpl.class, th2);
        }
    }

    public static /* synthetic */ void logPurchase$default(AppEventsLoggerImpl appEventsLoggerImpl, BigDecimal bigDecimal, Currency currency, Bundle bundle, int i10, Object obj) {
        if (v7.a.b(AppEventsLoggerImpl.class)) {
            return;
        }
        if ((i10 & 4) != 0) {
            bundle = null;
        }
        try {
            appEventsLoggerImpl.logPurchase(bigDecimal, currency, bundle);
        } catch (Throwable th2) {
            v7.a.a(AppEventsLoggerImpl.class, th2);
        }
    }

    public static /* synthetic */ void logPurchaseImplicitly$default(AppEventsLoggerImpl appEventsLoggerImpl, BigDecimal bigDecimal, Currency currency, Bundle bundle, OperationalData operationalData, int i10, Object obj) {
        if (v7.a.b(AppEventsLoggerImpl.class)) {
            return;
        }
        if ((i10 & 8) != 0) {
            operationalData = null;
        }
        try {
            appEventsLoggerImpl.logPurchaseImplicitly(bigDecimal, currency, bundle, operationalData);
        } catch (Throwable th2) {
            v7.a.a(AppEventsLoggerImpl.class, th2);
        }
    }

    public static final void onContextStop() {
        if (v7.a.b(AppEventsLoggerImpl.class)) {
            return;
        }
        try {
            INSTANCE.onContextStop();
        } catch (Throwable th2) {
            v7.a.a(AppEventsLoggerImpl.class, th2);
        }
    }

    public static final void setFlushBehavior(AppEventsLogger.FlushBehavior flushBehavior) {
        if (v7.a.b(AppEventsLoggerImpl.class)) {
            return;
        }
        try {
            INSTANCE.setFlushBehavior(flushBehavior);
        } catch (Throwable th2) {
            v7.a.a(AppEventsLoggerImpl.class, th2);
        }
    }

    public static final void setInstallReferrer(String str) {
        if (v7.a.b(AppEventsLoggerImpl.class)) {
            return;
        }
        try {
            INSTANCE.setInstallReferrer(str);
        } catch (Throwable th2) {
            v7.a.a(AppEventsLoggerImpl.class, th2);
        }
    }

    public static final void setPushNotificationsRegistrationId(String str) {
        if (v7.a.b(AppEventsLoggerImpl.class)) {
            return;
        }
        try {
            INSTANCE.setPushNotificationsRegistrationId(str);
        } catch (Throwable th2) {
            v7.a.a(AppEventsLoggerImpl.class, th2);
        }
    }

    public final void flush() {
        if (v7.a.b(this)) {
            return;
        }
        try {
            AppEventQueue.flush(FlushReason.EXPLICIT);
        } catch (Throwable th2) {
            v7.a.a(this, th2);
        }
    }

    public final String getApplicationId() {
        if (v7.a.b(this)) {
            return null;
        }
        try {
            return this.accessTokenAppId.getApplicationId();
        } catch (Throwable th2) {
            v7.a.a(this, th2);
            return null;
        }
    }

    public final boolean isValidForAccessToken(l7.a accessToken) {
        if (v7.a.b(this)) {
            return false;
        }
        try {
            n.f(accessToken, "accessToken");
            return n.a(this.accessTokenAppId, new AccessTokenAppIdPair(accessToken));
        } catch (Throwable th2) {
            v7.a.a(this, th2);
            return false;
        }
    }

    public final void logEvent(String eventName) {
        if (v7.a.b(this)) {
            return;
        }
        try {
            logEvent(eventName, (Bundle) null);
        } catch (Throwable th2) {
            v7.a.a(this, th2);
        }
    }

    public final void logEventFromSE(String eventName, String buttonText) {
        if (v7.a.b(this)) {
            return;
        }
        try {
            Bundle bundle = new Bundle();
            bundle.putString("_is_suggested_event", "1");
            bundle.putString("_button_text", buttonText);
            logEvent(eventName, bundle);
        } catch (Throwable th2) {
            v7.a.a(this, th2);
        }
    }

    public final void logEventImplicitly(String eventName, Double valueToSum, Bundle parameters) {
        AppEventsLoggerImpl appEventsLoggerImpl;
        if (v7.a.b(this)) {
            return;
        }
        try {
            appEventsLoggerImpl = this;
            try {
                logEvent$default(appEventsLoggerImpl, eventName, valueToSum, parameters, true, ActivityLifecycleTracker.getCurrentSessionGuid(), null, 32, null);
            } catch (Throwable th2) {
                th = th2;
                v7.a.a(appEventsLoggerImpl, th);
            }
        } catch (Throwable th3) {
            th = th3;
            appEventsLoggerImpl = this;
        }
    }

    public final void logProductItem(String itemID, AppEventsLogger.ProductAvailability availability, AppEventsLogger.ProductCondition condition, String description, String imageLink, String link, String title, BigDecimal priceAmount, Currency currency, String gtin, String mpn, String brand, Bundle parameters) {
        if (v7.a.b(this)) {
            return;
        }
        try {
            if (itemID == null) {
                INSTANCE.notifyDeveloperError("itemID cannot be null");
                return;
            }
            if (availability == null) {
                INSTANCE.notifyDeveloperError("availability cannot be null");
                return;
            }
            if (condition == null) {
                INSTANCE.notifyDeveloperError("condition cannot be null");
                return;
            }
            if (description == null) {
                INSTANCE.notifyDeveloperError("description cannot be null");
                return;
            }
            if (imageLink == null) {
                INSTANCE.notifyDeveloperError("imageLink cannot be null");
                return;
            }
            if (link == null) {
                INSTANCE.notifyDeveloperError("link cannot be null");
                return;
            }
            if (title == null) {
                INSTANCE.notifyDeveloperError("title cannot be null");
                return;
            }
            if (priceAmount == null) {
                INSTANCE.notifyDeveloperError("priceAmount cannot be null");
                return;
            }
            if (currency == null) {
                INSTANCE.notifyDeveloperError("currency cannot be null");
                return;
            }
            if (gtin == null && mpn == null && brand == null) {
                INSTANCE.notifyDeveloperError("Either gtin, mpn or brand is required");
                return;
            }
            if (parameters == null) {
                parameters = new Bundle();
            }
            parameters.putString(com.facebook.appevents.internal.Constants.EVENT_PARAM_PRODUCT_ITEM_ID, itemID);
            parameters.putString(com.facebook.appevents.internal.Constants.EVENT_PARAM_PRODUCT_AVAILABILITY, availability.name());
            parameters.putString(com.facebook.appevents.internal.Constants.EVENT_PARAM_PRODUCT_CONDITION, condition.name());
            parameters.putString(com.facebook.appevents.internal.Constants.EVENT_PARAM_PRODUCT_DESCRIPTION, description);
            parameters.putString(com.facebook.appevents.internal.Constants.EVENT_PARAM_PRODUCT_IMAGE_LINK, imageLink);
            parameters.putString(com.facebook.appevents.internal.Constants.EVENT_PARAM_PRODUCT_LINK, link);
            parameters.putString(com.facebook.appevents.internal.Constants.EVENT_PARAM_PRODUCT_TITLE, title);
            parameters.putString(com.facebook.appevents.internal.Constants.EVENT_PARAM_PRODUCT_PRICE_AMOUNT, priceAmount.setScale(3, RoundingMode.HALF_UP).toString());
            parameters.putString(com.facebook.appevents.internal.Constants.EVENT_PARAM_PRODUCT_PRICE_CURRENCY, currency.getCurrencyCode());
            if (gtin != null) {
                parameters.putString(com.facebook.appevents.internal.Constants.EVENT_PARAM_PRODUCT_GTIN, gtin);
            }
            if (mpn != null) {
                parameters.putString(com.facebook.appevents.internal.Constants.EVENT_PARAM_PRODUCT_MPN, mpn);
            }
            if (brand != null) {
                parameters.putString(com.facebook.appevents.internal.Constants.EVENT_PARAM_PRODUCT_BRAND, brand);
            }
            logEvent(AppEventsConstants.EVENT_NAME_PRODUCT_CATALOG_UPDATE, parameters);
            INSTANCE.eagerFlush();
        } catch (Throwable th2) {
            v7.a.a(this, th2);
        }
    }

    public final void logPurchase(BigDecimal purchaseAmount, Currency currency) {
        if (v7.a.b(this)) {
            return;
        }
        try {
            logPurchase(purchaseAmount, currency, null);
        } catch (Throwable th2) {
            v7.a.a(this, th2);
        }
    }

    public final void logPurchaseImplicitly(BigDecimal purchaseAmount, Currency currency, Bundle parameters, OperationalData operationalData) {
        if (v7.a.b(this)) {
            return;
        }
        try {
            logPurchase(purchaseAmount, currency, parameters, true, operationalData);
        } catch (Throwable th2) {
            v7.a.a(this, th2);
        }
    }

    public final void logPushNotificationOpen(Bundle payload, String action) {
        String string;
        if (v7.a.b(this)) {
            return;
        }
        try {
            n.f(payload, "payload");
            try {
                String string2 = payload.getString(PUSH_PAYLOAD_KEY);
                if (e0.w(string2)) {
                    return;
                } else {
                    string = new JSONObject(string2).getString("campaign");
                }
            } catch (JSONException unused) {
                string = null;
            }
            if (string == null) {
                q7.x.f48792c.s(g0.f45137e, TAG, "Malformed payload specified for logging a push notification open.");
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putString(APP_EVENT_PUSH_PARAMETER_CAMPAIGN, string);
            if (action != null) {
                bundle.putString(APP_EVENT_PUSH_PARAMETER_ACTION, action);
            }
            logEvent(APP_EVENT_NAME_PUSH_OPENED, bundle);
        } catch (Throwable th2) {
            v7.a.a(this, th2);
        }
    }

    public final void logSdkEvent(String eventName, Double valueToSum, Bundle parameters) {
        AppEventsLoggerImpl appEventsLoggerImpl;
        Throwable th2;
        if (v7.a.b(this)) {
            return;
        }
        try {
            n.f(eventName, "eventName");
            if (an.p.p0(eventName, ACCOUNT_KIT_EVENT_NAME_PREFIX, false)) {
                try {
                    s sVar = s.f45212a;
                    if (!m0.c()) {
                        return;
                    }
                    appEventsLoggerImpl = this;
                    try {
                        logEvent$default(appEventsLoggerImpl, eventName, valueToSum, parameters, true, ActivityLifecycleTracker.getCurrentSessionGuid(), null, 32, null);
                        return;
                    } catch (Throwable th3) {
                        th = th3;
                    }
                } catch (Throwable th4) {
                    appEventsLoggerImpl = this;
                    th2 = th4;
                }
                th2 = th;
            } else {
                try {
                    Log.e(TAG, "logSdkEvent is deprecated and only supports account kit for legacy, please use logEvent instead");
                    return;
                } catch (Throwable th5) {
                    th2 = th5;
                    appEventsLoggerImpl = this;
                }
            }
        } catch (Throwable th6) {
            th = th6;
            appEventsLoggerImpl = this;
        }
        v7.a.a(appEventsLoggerImpl, th2);
    }

    public static /* synthetic */ void logEvent$default(AppEventsLoggerImpl appEventsLoggerImpl, String str, Double d10, Bundle bundle, boolean z10, UUID uuid, OperationalData operationalData, int i10, Object obj) {
        if (v7.a.b(AppEventsLoggerImpl.class)) {
            return;
        }
        if ((i10 & 32) != 0) {
            operationalData = null;
        }
        try {
            appEventsLoggerImpl.logEvent(str, d10, bundle, z10, uuid, operationalData);
        } catch (Throwable th2) {
            v7.a.a(AppEventsLoggerImpl.class, th2);
        }
    }

    public static /* synthetic */ void logPurchase$default(AppEventsLoggerImpl appEventsLoggerImpl, BigDecimal bigDecimal, Currency currency, Bundle bundle, boolean z10, OperationalData operationalData, int i10, Object obj) {
        if (v7.a.b(AppEventsLoggerImpl.class)) {
            return;
        }
        if ((i10 & 16) != 0) {
            operationalData = null;
        }
        try {
            appEventsLoggerImpl.logPurchase(bigDecimal, currency, bundle, z10, operationalData);
        } catch (Throwable th2) {
            v7.a.a(AppEventsLoggerImpl.class, th2);
        }
    }

    public final void logEvent(String eventName, Bundle parameters) {
        AppEventsLoggerImpl appEventsLoggerImpl;
        if (v7.a.b(this)) {
            return;
        }
        try {
            appEventsLoggerImpl = this;
            try {
                logEvent$default(appEventsLoggerImpl, eventName, null, parameters, false, ActivityLifecycleTracker.getCurrentSessionGuid(), null, 32, null);
            } catch (Throwable th2) {
                th = th2;
                v7.a.a(appEventsLoggerImpl, th);
            }
        } catch (Throwable th3) {
            th = th3;
            appEventsLoggerImpl = this;
        }
    }

    public final void logEventImplicitly(String eventName, BigDecimal purchaseAmount, Currency currency, Bundle parameters, OperationalData operationalData) {
        Throwable th2;
        if (v7.a.b(this)) {
            return;
        }
        try {
            if (purchaseAmount != null && currency != null) {
                if (parameters == null) {
                    try {
                        parameters = new Bundle();
                    } catch (Throwable th3) {
                        th2 = th3;
                        v7.a.a(this, th2);
                        return;
                    }
                }
                Bundle bundle = parameters;
                try {
                    bundle.putString(AppEventsConstants.EVENT_PARAM_CURRENCY, currency.getCurrencyCode());
                    logEvent(eventName, Double.valueOf(purchaseAmount.doubleValue()), bundle, true, ActivityLifecycleTracker.getCurrentSessionGuid(), operationalData);
                    return;
                } catch (Throwable th4) {
                    th = th4;
                    th2 = th;
                    v7.a.a(this, th2);
                    return;
                }
            }
            e0.B(TAG, "purchaseAmount and currency cannot be null");
        } catch (Throwable th5) {
            th = th5;
        }
    }

    public final void logPurchase(BigDecimal purchaseAmount, Currency currency, Bundle parameters) {
        if (v7.a.b(this)) {
            return;
        }
        try {
            logPurchase$default(this, purchaseAmount, currency, parameters, false, null, 16, null);
        } catch (Throwable th2) {
            v7.a.a(this, th2);
        }
    }

    public final void logEvent(String eventName, double valueToSum) {
        if (v7.a.b(this)) {
            return;
        }
        try {
            logEvent(eventName, valueToSum, null);
        } catch (Throwable th2) {
            v7.a.a(this, th2);
        }
    }

    public final void logPurchase(BigDecimal purchaseAmount, Currency currency, Bundle parameters, boolean isImplicitlyLogged, OperationalData operationalData) {
        Throwable th2;
        AppEventsLoggerImpl appEventsLoggerImpl;
        if (v7.a.b(this)) {
            return;
        }
        try {
            if (purchaseAmount == null) {
                INSTANCE.notifyDeveloperError("purchaseAmount cannot be null");
                return;
            }
            if (currency == null) {
                INSTANCE.notifyDeveloperError("currency cannot be null");
                return;
            }
            if (parameters == null) {
                parameters = new Bundle();
            }
            Bundle bundle = parameters;
            try {
                bundle.putString(AppEventsConstants.EVENT_PARAM_CURRENCY, currency.getCurrencyCode());
                appEventsLoggerImpl = this;
                try {
                    appEventsLoggerImpl.logEvent(AppEventsConstants.EVENT_NAME_PURCHASED, Double.valueOf(purchaseAmount.doubleValue()), bundle, isImplicitlyLogged, ActivityLifecycleTracker.getCurrentSessionGuid(), operationalData);
                    INSTANCE.eagerFlush();
                } catch (Throwable th3) {
                    th = th3;
                    th2 = th;
                    v7.a.a(appEventsLoggerImpl, th2);
                }
            } catch (Throwable th4) {
                th = th4;
                appEventsLoggerImpl = this;
            }
        } catch (Throwable th5) {
            th2 = th5;
            appEventsLoggerImpl = this;
        }
    }

    public final void logEvent(String eventName, double valueToSum, Bundle parameters) {
        AppEventsLoggerImpl appEventsLoggerImpl;
        if (v7.a.b(this)) {
            return;
        }
        try {
            appEventsLoggerImpl = this;
            try {
                logEvent$default(appEventsLoggerImpl, eventName, Double.valueOf(valueToSum), parameters, false, ActivityLifecycleTracker.getCurrentSessionGuid(), null, 32, null);
            } catch (Throwable th2) {
                th = th2;
                v7.a.a(appEventsLoggerImpl, th);
            }
        } catch (Throwable th3) {
            th = th3;
            appEventsLoggerImpl = this;
        }
    }

    public final void logEvent(String eventName, Double valueToSum, Bundle parameters, boolean isImplicitlyLogged, UUID currentSessionId, OperationalData operationalData) {
        Bundle bundle = parameters;
        OperationalData operationalData2 = operationalData;
        if (v7.a.b(this) || eventName == null) {
            return;
        }
        try {
            if (eventName.length() == 0) {
                return;
            }
            if (!isImplicitlyLogged && AutomaticAnalyticsLogger.isImplicitPurchaseLoggingEnabled() && (eventName.equals(AppEventsConstants.EVENT_NAME_PURCHASED) || eventName.equals(AppEventsConstants.EVENT_NAME_SUBSCRIBE) || eventName.equals(AppEventsConstants.EVENT_NAME_START_TRIAL))) {
                Log.w(TAG, "You are logging purchase events while auto-logging of in-app purchase is enabled in the SDK. Make sure you don't log duplicate events");
                if ((p.b(q7.n.AndroidManualImplicitPurchaseDedupe) && eventName.equals(AppEventsConstants.EVENT_NAME_PURCHASED)) || (p.b(q7.n.AndroidManualImplicitSubsDedupe) && (eventName.equals(AppEventsConstants.EVENT_NAME_SUBSCRIBE) || eventName.equals(AppEventsConstants.EVENT_NAME_START_TRIAL)))) {
                    InAppPurchaseDedupeConfig inAppPurchaseDedupeConfig = InAppPurchaseDedupeConfig.INSTANCE;
                    Double valueOfManualEvent = inAppPurchaseDedupeConfig.getValueOfManualEvent(valueToSum, bundle);
                    Currency currencyOfManualEvent = inAppPurchaseDedupeConfig.getCurrencyOfManualEvent(bundle);
                    if (valueOfManualEvent != null && currencyOfManualEvent != null) {
                        f fVarAddDedupeParameters = inAppPurchaseDedupeConfig.addDedupeParameters(InAppPurchaseManager.performDedupe(j1.f.C(new InAppPurchase(eventName, valueOfManualEvent.doubleValue(), currencyOfManualEvent)), System.currentTimeMillis(), false, j1.f.C(new f(bundle, operationalData2))), bundle, operationalData2);
                        Bundle bundle2 = (Bundle) fVarAddDedupeParameters.f53283a;
                        operationalData2 = (OperationalData) fVarAddDedupeParameters.f53284b;
                        bundle = bundle2;
                    }
                }
            }
            boolean zB = q.b(APP_EVENTS_KILLSWITCH, s.c(), false);
            g0 g0Var = g0.f45136d;
            if (zB) {
                q7.x.f48792c.t(g0Var, "AppEvents", "KillSwitch is enabled and fail to log app event: %s", eventName);
                return;
            }
            if (BlocklistEventsManager.isInBlocklist(eventName)) {
                return;
            }
            Companion companion = INSTANCE;
            f fVarAddImplicitPurchaseParameters = companion.addImplicitPurchaseParameters(bundle, operationalData2, isImplicitlyLogged);
            Bundle bundle3 = (Bundle) fVarAddImplicitPurchaseParameters.f53283a;
            OperationalData operationalData3 = (OperationalData) fVarAddImplicitPurchaseParameters.f53284b;
            try {
                if (!ProtectedModeManager.INSTANCE.protectedModeIsApplied(bundle3)) {
                    SensitiveParamsManager.processFilterSensitiveParams(bundle3, eventName);
                }
                BannedParamManager.processFilterBannedParams(bundle3);
                MACARuleMatchingManager.processParameters(bundle3, eventName);
                StdParamsEnforcementManager.processFilterParamSchemaBlocking(bundle3);
                ProtectedModeManager.processParametersForProtectedMode(bundle3);
                VVPManager.processParametersForVVP(eventName, bundle3);
                companion.logEvent(new AppEvent(this.contextName, eventName, valueToSum, bundle3, isImplicitlyLogged, ActivityLifecycleTracker.isInBackground(), currentSessionId, operationalData3), this.accessTokenAppId);
            } catch (l7.n e10) {
                q7.x.f48792c.t(g0Var, "AppEvents", "Invalid app event: %s", e10.toString());
            } catch (JSONException e11) {
                q7.x.f48792c.t(g0Var, "AppEvents", "JSON encoding for app event failed: '%s'", e11.toString());
            }
        } catch (Throwable th2) {
            v7.a.a(this, th2);
        }
    }

    public AppEventsLoggerImpl(Context context, String str, l7.a aVar) {
        this(e0.k(context), str, aVar);
    }
}
