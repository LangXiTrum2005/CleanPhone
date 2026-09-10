package com.facebook.appevents.ondeviceprocessing;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import com.facebook.appevents.AppEvent;
import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.facebook.appevents.internal.AppEventUtility;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.n;
import l7.s;
import q7.e0;
import q7.k;
import xj.v;
import z7.b;
import z7.c;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001:\u0003\u001a\u001b\u001cB\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\f\u001a\u0004\u0018\u00010\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0002J\b\u0010\t\u001a\u00020\nH\u0007J\u001e\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00042\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014H\u0007J&\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0012\u001a\u00020\u00042\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014H\u0002J\u0010\u0010\u0019\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0004H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u0016\u0010\u0007\u001a\n \b*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u000b¨\u0006\u001d"}, d2 = {"Lcom/facebook/appevents/ondeviceprocessing/RemoteServiceWrapper;", "", "()V", "RECEIVER_SERVICE_ACTION", "", "RECEIVER_SERVICE_PACKAGE", "RECEIVER_SERVICE_PACKAGE_WAKIZASHI", "TAG", "kotlin.jvm.PlatformType", "isServiceAvailable", "", "Ljava/lang/Boolean;", "getVerifiedServiceIntent", "Landroid/content/Intent;", "context", "Landroid/content/Context;", "sendCustomEvents", "Lcom/facebook/appevents/ondeviceprocessing/RemoteServiceWrapper$ServiceResult;", "applicationId", "appEvents", "", "Lcom/facebook/appevents/AppEvent;", "sendEvents", "eventType", "Lcom/facebook/appevents/ondeviceprocessing/RemoteServiceWrapper$EventType;", "sendInstallEvent", "EventType", "RemoteServiceConnection", "ServiceResult", "facebook-core_release"}, k = 1, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
public final class RemoteServiceWrapper {
    public static final String RECEIVER_SERVICE_ACTION = "ReceiverService";
    public static final String RECEIVER_SERVICE_PACKAGE = "com.facebook.katana";
    public static final String RECEIVER_SERVICE_PACKAGE_WAKIZASHI = "com.facebook.wakizashi";
    private static Boolean isServiceAvailable;
    public static final RemoteServiceWrapper INSTANCE = new RemoteServiceWrapper();
    private static final String TAG = "RemoteServiceWrapper";

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0003H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/facebook/appevents/ondeviceprocessing/RemoteServiceWrapper$EventType;", "", "eventType", "", "(Ljava/lang/String;ILjava/lang/String;)V", InAppPurchaseConstants.METHOD_TO_STRING, "MOBILE_APP_INSTALL", "CUSTOM_APP_EVENTS", "facebook-core_release"}, k = 1, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
    public enum EventType {
        MOBILE_APP_INSTALL("MOBILE_APP_INSTALL"),
        CUSTOM_APP_EVENTS("CUSTOM_APP_EVENTS");

        private final String eventType;

        EventType(String str) {
            this.eventType = str;
        }

        @Override // java.lang.Enum
        public String toString() {
            return this.eventType;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\r\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\r\u0010\fJ\u000f\u0010\u000e\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lcom/facebook/appevents/ondeviceprocessing/RemoteServiceWrapper$RemoteServiceConnection;", "Landroid/content/ServiceConnection;", "<init>", "()V", "Landroid/content/ComponentName;", "name", "Landroid/os/IBinder;", "serviceBinder", "Lwj/r;", "onServiceConnected", "(Landroid/content/ComponentName;Landroid/os/IBinder;)V", "onNullBinding", "(Landroid/content/ComponentName;)V", "onServiceDisconnected", "getBinder", "()Landroid/os/IBinder;", "Ljava/util/concurrent/CountDownLatch;", "latch", "Ljava/util/concurrent/CountDownLatch;", "binder", "Landroid/os/IBinder;", "facebook-core_release"}, k = 1, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
    public static final class RemoteServiceConnection implements ServiceConnection {
        private IBinder binder;
        private final CountDownLatch latch = new CountDownLatch(1);

        public final IBinder getBinder() throws InterruptedException {
            this.latch.await(5L, TimeUnit.SECONDS);
            return this.binder;
        }

        @Override // android.content.ServiceConnection
        public void onNullBinding(ComponentName name) {
            n.f(name, "name");
            this.latch.countDown();
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName name, IBinder serviceBinder) {
            n.f(name, "name");
            n.f(serviceBinder, "serviceBinder");
            this.binder = serviceBinder;
            this.latch.countDown();
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName name) {
            n.f(name, "name");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/facebook/appevents/ondeviceprocessing/RemoteServiceWrapper$ServiceResult;", "", "(Ljava/lang/String;I)V", "OPERATION_SUCCESS", "SERVICE_NOT_AVAILABLE", "SERVICE_ERROR", "facebook-core_release"}, k = 1, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
    public enum ServiceResult {
        OPERATION_SUCCESS,
        SERVICE_NOT_AVAILABLE,
        SERVICE_ERROR
    }

    private RemoteServiceWrapper() {
    }

    private final Intent getVerifiedServiceIntent(Context context) {
        if (v7.a.b(this)) {
            return null;
        }
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager != null) {
                Intent intent = new Intent(RECEIVER_SERVICE_ACTION);
                intent.setPackage(RECEIVER_SERVICE_PACKAGE);
                if (packageManager.resolveService(intent, 0) != null && k.a(context, RECEIVER_SERVICE_PACKAGE)) {
                    return intent;
                }
                Intent intent2 = new Intent(RECEIVER_SERVICE_ACTION);
                intent2.setPackage(RECEIVER_SERVICE_PACKAGE_WAKIZASHI);
                if (packageManager.resolveService(intent2, 0) != null && k.a(context, RECEIVER_SERVICE_PACKAGE_WAKIZASHI)) {
                    return intent2;
                }
            }
            return null;
        } catch (Throwable th2) {
            v7.a.a(this, th2);
            return null;
        }
    }

    public static final boolean isServiceAvailable() {
        if (v7.a.b(RemoteServiceWrapper.class)) {
            return false;
        }
        try {
            if (isServiceAvailable == null) {
                isServiceAvailable = Boolean.valueOf(INSTANCE.getVerifiedServiceIntent(s.b()) != null);
            }
            Boolean bool = isServiceAvailable;
            if (bool != null) {
                return bool.booleanValue();
            }
            return false;
        } catch (Throwable th2) {
            v7.a.a(RemoteServiceWrapper.class, th2);
            return false;
        }
    }

    public static final ServiceResult sendCustomEvents(String applicationId, List<AppEvent> appEvents) {
        if (v7.a.b(RemoteServiceWrapper.class)) {
            return null;
        }
        try {
            n.f(applicationId, "applicationId");
            n.f(appEvents, "appEvents");
            return INSTANCE.sendEvents(EventType.CUSTOM_APP_EVENTS, applicationId, appEvents);
        } catch (Throwable th2) {
            v7.a.a(RemoteServiceWrapper.class, th2);
            return null;
        }
    }

    private final ServiceResult sendEvents(EventType eventType, String applicationId, List<AppEvent> appEvents) {
        ServiceResult serviceResult;
        String str;
        if (v7.a.b(this)) {
            return null;
        }
        try {
            ServiceResult serviceResult2 = ServiceResult.SERVICE_NOT_AVAILABLE;
            AppEventUtility.assertIsNotMainThread();
            Context contextB = s.b();
            Intent verifiedServiceIntent = getVerifiedServiceIntent(contextB);
            if (verifiedServiceIntent == null) {
                return serviceResult2;
            }
            RemoteServiceConnection remoteServiceConnection = new RemoteServiceConnection();
            try {
                if (!contextB.bindService(verifiedServiceIntent, remoteServiceConnection, 1)) {
                    return ServiceResult.SERVICE_ERROR;
                }
                try {
                    IBinder binder = remoteServiceConnection.getBinder();
                    if (binder != null) {
                        c cVarQ = b.q(binder);
                        Bundle bundleBuildEventsBundle = RemoteServiceParametersHelper.buildEventsBundle(eventType, applicationId, appEvents);
                        if (bundleBuildEventsBundle != null) {
                            ((z7.a) cVarQ).q(bundleBuildEventsBundle);
                            e0.B(TAG, "Successfully sent events to the remote service: " + bundleBuildEventsBundle);
                        }
                        serviceResult2 = ServiceResult.OPERATION_SUCCESS;
                    }
                    contextB.unbindService(remoteServiceConnection);
                    e0.B(TAG, "Unbound from the remote service");
                    return serviceResult2;
                } catch (RemoteException e10) {
                    serviceResult = ServiceResult.SERVICE_ERROR;
                    str = TAG;
                    e0.A(str, e10);
                    contextB.unbindService(remoteServiceConnection);
                    e0.B(str, "Unbound from the remote service");
                    return serviceResult;
                } catch (InterruptedException e11) {
                    serviceResult = ServiceResult.SERVICE_ERROR;
                    str = TAG;
                    e0.A(str, e11);
                    contextB.unbindService(remoteServiceConnection);
                    e0.B(str, "Unbound from the remote service");
                    return serviceResult;
                }
            } catch (Throwable th2) {
                contextB.unbindService(remoteServiceConnection);
                e0.B(TAG, "Unbound from the remote service");
                throw th2;
            }
        } catch (Throwable th3) {
            v7.a.a(this, th3);
            return null;
        }
    }

    public static final ServiceResult sendInstallEvent(String applicationId) {
        if (v7.a.b(RemoteServiceWrapper.class)) {
            return null;
        }
        try {
            n.f(applicationId, "applicationId");
            return INSTANCE.sendEvents(EventType.MOBILE_APP_INSTALL, applicationId, v.f53866a);
        } catch (Throwable th2) {
            v7.a.a(RemoteServiceWrapper.class, th2);
            return null;
        }
    }
}
