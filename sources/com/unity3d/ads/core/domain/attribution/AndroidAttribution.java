package com.unity3d.ads.core.domain.attribution;

import ak.f;
import ak.m;
import android.adservices.AdServicesState;
import android.adservices.measurement.MeasurementManager;
import android.annotation.SuppressLint;
import android.content.Context;
import android.net.Uri;
import android.os.OutcomeReceiver;
import android.os.ext.SdkExtensions;
import android.view.InputEvent;
import cn.d0;
import com.google.android.gms.internal.play_billing.q1;
import com.unity3d.ads.adplayer.AdPlayer;
import com.unity3d.ads.adplayer.WebViewContainer;
import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.data.repository.SessionRepository;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import com.unity3d.ads.core.extensions.ProtobufExtensionsKt;
import com.unity3d.services.core.device.Device;
import com.unity3d.services.core.domain.ISDKDispatchers;
import fn.y0;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import kotlin.Metadata;
import kotlin.jvm.internal.n;
import r9.b;
import wj.d;
import wj.r;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\r\b\u0001\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0013\u0010\u0015\u001a\u00020\u0014H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016J#\u0010\u0018\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019J#\u0010\u001a\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0086@ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u0019R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001bR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u001cR\u001d\u0010 \u001a\u0004\u0018\u00010\n8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u000b\u0010\u001f\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006!"}, d2 = {"Lcom/unity3d/ads/core/domain/attribution/AndroidAttribution;", "", "Landroid/content/Context;", "context", "Lcom/unity3d/services/core/domain/ISDKDispatchers;", "dispatchers", "Lcom/unity3d/ads/core/data/repository/SessionRepository;", "sessionRepository", "<init>", "(Landroid/content/Context;Lcom/unity3d/services/core/domain/ISDKDispatchers;Lcom/unity3d/ads/core/data/repository/SessionRepository;)V", "Landroid/adservices/measurement/MeasurementManager;", "getMeasurementManager", "(Landroid/content/Context;)Landroid/adservices/measurement/MeasurementManager;", "", "baseUrl", "Lcom/unity3d/ads/core/data/model/AdObject;", "adObject", "Landroid/net/Uri;", "getUri", "(Ljava/lang/String;Lcom/unity3d/ads/core/data/model/AdObject;)Landroid/net/Uri;", "", "isAvailable", "(Lak/f;)Ljava/lang/Object;", "url", "registerView", "(Ljava/lang/String;Lcom/unity3d/ads/core/data/model/AdObject;Lak/f;)Ljava/lang/Object;", "registerClick", "Lcom/unity3d/services/core/domain/ISDKDispatchers;", "Lcom/unity3d/ads/core/data/repository/SessionRepository;", "measurementManager$delegate", "Lwj/d;", "()Landroid/adservices/measurement/MeasurementManager;", "measurementManager", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
@SuppressLint({"NewApi", "MissingPermission"})
public final class AndroidAttribution {
    private final ISDKDispatchers dispatchers;

    /* JADX INFO: renamed from: measurementManager$delegate, reason: from kotlin metadata */
    private final d measurementManager;
    private final SessionRepository sessionRepository;

    public AndroidAttribution(Context context, ISDKDispatchers dispatchers, SessionRepository sessionRepository) {
        n.f(context, "context");
        n.f(dispatchers, "dispatchers");
        n.f(sessionRepository, "sessionRepository");
        this.dispatchers = dispatchers;
        this.sessionRepository = sessionRepository;
        this.measurementManager = b.u(new AndroidAttribution$measurementManager$2(this, context));
    }

    private final MeasurementManager getMeasurementManager() {
        return com.unity3d.ads.adplayer.b.c(this.measurementManager.getValue());
    }

    private final Uri getUri(String baseUrl, AdObject adObject) {
        Uri uri = Uri.parse(baseUrl);
        n.e(uri, "parse(this)");
        Uri uriBuild = uri.buildUpon().appendQueryParameter("sessionToken", ProtobufExtensionsKt.toBase64$default(this.sessionRepository.getSessionToken(), false, 1, null)).appendQueryParameter(HandleInvocationsFromAdViewer.KEY_TRACKING_TOKEN, ProtobufExtensionsKt.toBase64$default(adObject.getTrackingToken(), false, 1, null)).build();
        n.e(uriBuild, "baseUrl.toUri()\n        …4())\n            .build()");
        return uriBuild;
    }

    public final Object isAvailable(f fVar) {
        r rVar;
        if (Device.getApiLevel() < 33) {
            return Boolean.FALSE;
        }
        if (SdkExtensions.getExtensionVersion(1000000) < 4) {
            return Boolean.FALSE;
        }
        if (getMeasurementManager() == null) {
            return Boolean.FALSE;
        }
        if (!AdServicesState.isAdServicesStateEnabled()) {
            return Boolean.FALSE;
        }
        final m mVar = new m(q1.t(fVar));
        MeasurementManager measurementManager = getMeasurementManager();
        if (measurementManager != null) {
            measurementManager.getMeasurementApiStatus(d0.f(this.dispatchers.getDefault()), new OutcomeReceiver() { // from class: com.unity3d.ads.core.domain.attribution.AndroidAttribution$isAvailable$2$1
                public /* bridge */ /* synthetic */ void onResult(Object obj) {
                    onResult(((Number) obj).intValue());
                }

                public void onError(Exception error) {
                    n.f(error, "error");
                    mVar.resumeWith(Boolean.FALSE);
                }

                public void onResult(int status) {
                    mVar.resumeWith(Boolean.valueOf(status == 1));
                }
            });
            rVar = r.f53297a;
        } else {
            rVar = null;
        }
        if (rVar == null) {
            mVar.resumeWith(Boolean.FALSE);
        }
        return mVar.a();
    }

    public final Object registerClick(String str, AdObject adObject, f fVar) {
        WebViewContainer webViewContainer;
        y0 lastInputEvent;
        InputEvent inputEvent;
        r rVar;
        if (getMeasurementManager() == null) {
            return Boolean.FALSE;
        }
        AdPlayer adPlayer = adObject.getAdPlayer();
        if (adPlayer == null || (webViewContainer = adPlayer.getWebViewContainer()) == null || (lastInputEvent = webViewContainer.getLastInputEvent()) == null || (inputEvent = (InputEvent) lastInputEvent.getValue()) == null) {
            return Boolean.FALSE;
        }
        final m mVar = new m(q1.t(fVar));
        MeasurementManager measurementManager = getMeasurementManager();
        if (measurementManager != null) {
            measurementManager.registerSource(getUri(str, adObject), inputEvent, d0.f(this.dispatchers.getDefault()), new OutcomeReceiver() { // from class: com.unity3d.ads.core.domain.attribution.AndroidAttribution$registerClick$2$1
                public void onResult(Object p10) {
                    n.f(p10, "p0");
                    mVar.resumeWith(Boolean.TRUE);
                }

                public void onError(Exception error) {
                    n.f(error, "error");
                    mVar.resumeWith(Boolean.FALSE);
                }
            });
            rVar = r.f53297a;
        } else {
            rVar = null;
        }
        if (rVar == null) {
            mVar.resumeWith(Boolean.FALSE);
        }
        return mVar.a();
    }

    public final Object registerView(String str, AdObject adObject, f fVar) {
        if (getMeasurementManager() == null) {
            return Boolean.FALSE;
        }
        final m mVar = new m(q1.t(fVar));
        MeasurementManager measurementManager = getMeasurementManager();
        r rVar = null;
        if (measurementManager != null) {
            measurementManager.registerSource(getUri(str, adObject), null, d0.f(this.dispatchers.getDefault()), new OutcomeReceiver() { // from class: com.unity3d.ads.core.domain.attribution.AndroidAttribution$registerView$2$1
                public void onResult(Object p10) {
                    n.f(p10, "p0");
                    mVar.resumeWith(Boolean.TRUE);
                }

                public void onError(Exception error) {
                    n.f(error, "error");
                    mVar.resumeWith(Boolean.FALSE);
                }
            });
            rVar = r.f53297a;
        }
        if (rVar == null) {
            mVar.resumeWith(Boolean.FALSE);
        }
        return mVar.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final MeasurementManager getMeasurementManager(Context context) {
        if (Device.getApiLevel() >= 33 && SdkExtensions.getExtensionVersion(1000000) >= 4) {
            return com.unity3d.ads.adplayer.b.c(context.getSystemService(com.unity3d.ads.adplayer.b.g()));
        }
        return null;
    }
}
