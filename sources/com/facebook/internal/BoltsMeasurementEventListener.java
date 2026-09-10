package com.facebook.internal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.facebook.appevents.InternalAppEventsLogger;
import com.facebook.internal.instrument.crashshield.CrashShieldHandler;
import com.smartdigimkt.q0.b;
import com.startapp.simple.bloomfilter.parsing.TokenBuilder;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/facebook/internal/BoltsMeasurementEventListener;", "Landroid/content/BroadcastReceiver;", "Companion", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
public final class BoltsMeasurementEventListener extends BroadcastReceiver {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static BoltsMeasurementEventListener f16260b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f16261a;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/facebook/internal/BoltsMeasurementEventListener$Companion;", "", "", "BOLTS_MEASUREMENT_EVENT_PREFIX", "Ljava/lang/String;", "MEASUREMENT_EVENT_ARGS_KEY", "MEASUREMENT_EVENT_NAME_KEY", "Lcom/facebook/internal/BoltsMeasurementEventListener;", "singleton", "Lcom/facebook/internal/BoltsMeasurementEventListener;", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        public static void a(Context context) {
            Intrinsics.f(context, "context");
            if (BoltsMeasurementEventListener.a() != null) {
                BoltsMeasurementEventListener.a();
                return;
            }
            BoltsMeasurementEventListener boltsMeasurementEventListener = new BoltsMeasurementEventListener(context);
            if (!CrashShieldHandler.b(BoltsMeasurementEventListener.class)) {
                try {
                    if (!CrashShieldHandler.b(boltsMeasurementEventListener)) {
                        try {
                            LocalBroadcastManager localBroadcastManager = LocalBroadcastManager.getInstance(boltsMeasurementEventListener.f16261a);
                            Intrinsics.e(localBroadcastManager, "LocalBroadcastManager.ge…tance(applicationContext)");
                            localBroadcastManager.registerReceiver(boltsMeasurementEventListener, new IntentFilter("com.parse.bolts.measurement_event"));
                        } catch (Throwable th) {
                            CrashShieldHandler.a(boltsMeasurementEventListener, th);
                        }
                    }
                } catch (Throwable th2) {
                    CrashShieldHandler.a(BoltsMeasurementEventListener.class, th2);
                }
            }
            if (!CrashShieldHandler.b(BoltsMeasurementEventListener.class)) {
                try {
                    BoltsMeasurementEventListener.f16260b = boltsMeasurementEventListener;
                } catch (Throwable th3) {
                    CrashShieldHandler.a(BoltsMeasurementEventListener.class, th3);
                }
            }
            BoltsMeasurementEventListener.a();
        }
    }

    public BoltsMeasurementEventListener(Context context) {
        Context applicationContext = context.getApplicationContext();
        Intrinsics.e(applicationContext, "context.applicationContext");
        this.f16261a = applicationContext;
    }

    public static final /* synthetic */ BoltsMeasurementEventListener a() {
        if (CrashShieldHandler.b(BoltsMeasurementEventListener.class)) {
            return null;
        }
        try {
            return f16260b;
        } catch (Throwable th) {
            CrashShieldHandler.a(BoltsMeasurementEventListener.class, th);
            return null;
        }
    }

    public final void finalize() {
        if (CrashShieldHandler.b(this)) {
            return;
        }
        try {
            if (!CrashShieldHandler.b(this)) {
                try {
                    LocalBroadcastManager localBroadcastManager = LocalBroadcastManager.getInstance(this.f16261a);
                    Intrinsics.e(localBroadcastManager, "LocalBroadcastManager.ge…tance(applicationContext)");
                    localBroadcastManager.unregisterReceiver(this);
                } catch (Throwable th) {
                    CrashShieldHandler.a(this, th);
                }
            }
        } catch (Throwable th2) {
            CrashShieldHandler.a(this, th2);
        }
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (CrashShieldHandler.b(this)) {
            return;
        }
        try {
            InternalAppEventsLogger internalAppEventsLogger = new InternalAppEventsLogger(context);
            StringBuilder sb = new StringBuilder("bf_");
            sb.append(intent != null ? intent.getStringExtra(b.S0) : null);
            String string = sb.toString();
            Bundle bundleExtra = intent != null ? intent.getBundleExtra("event_args") : null;
            Bundle bundle = new Bundle();
            Set<String> setKeySet = bundleExtra != null ? bundleExtra.keySet() : null;
            if (setKeySet != null) {
                for (String key : setKeySet) {
                    Intrinsics.e(key, "key");
                    bundle.putString(new Regex("[ -]*$").c("", new Regex("^[ -]*").c("", new Regex("[^0-9a-zA-Z _-]").c(TokenBuilder.TOKEN_DELIMITER, key))), (String) bundleExtra.get(key));
                }
            }
            internalAppEventsLogger.a(bundle, string);
        } catch (Throwable th) {
            CrashShieldHandler.a(this, th);
        }
    }
}
