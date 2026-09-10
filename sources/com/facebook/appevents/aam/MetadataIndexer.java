package com.facebook.appevents.aam;

import android.app.Activity;
import com.applovin.impl.sdk.x;
import com.ironsource.mediationsdk.metadata.a;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import kotlin.Metadata;
import kotlin.jvm.internal.n;
import l7.s;
import q7.b;
import q7.e0;
import q7.f;
import q7.r;
import q7.u;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\u0003J\u000f\u0010\n\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\n\u0010\u0003R\u001c\u0010\r\u001a\n \f*\u0004\u0018\u00010\u000b0\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0016\u0010\u0010\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/facebook/appevents/aam/MetadataIndexer;", "", "<init>", "()V", "Landroid/app/Activity;", "activity", "Lwj/r;", "onActivityResumed", "(Landroid/app/Activity;)V", "updateRules", a.f29613j, "", "kotlin.jvm.PlatformType", "TAG", "Ljava/lang/String;", "", "enabled", "Z", "facebook-core_release"}, k = 1, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
public final class MetadataIndexer {
    public static final MetadataIndexer INSTANCE = new MetadataIndexer();
    private static final String TAG = MetadataIndexer.class.getCanonicalName();
    private static boolean enabled;

    private MetadataIndexer() {
    }

    public static final void enable() {
        if (v7.a.b(MetadataIndexer.class)) {
            return;
        }
        try {
            try {
                s.d().execute(new x(13));
            } catch (Exception e10) {
                e0.A(TAG, e10);
            }
        } catch (Throwable th2) {
            v7.a.a(MetadataIndexer.class, th2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void enable$lambda$0() {
        if (v7.a.b(MetadataIndexer.class)) {
            return;
        }
        try {
            b bVarB = f.b(s.b());
            if (bVarB == null || !bVarB.f48664e) {
                INSTANCE.updateRules();
                enabled = true;
            }
        } catch (Throwable th2) {
            v7.a.a(MetadataIndexer.class, th2);
        }
    }

    public static final void onActivityResumed(Activity activity) {
        if (v7.a.b(MetadataIndexer.class)) {
            return;
        }
        try {
            n.f(activity, "activity");
            try {
                if (enabled && !MetadataRule.INSTANCE.getRules().isEmpty()) {
                    MetadataViewObserver.INSTANCE.startTrackingActivity(activity);
                }
            } catch (Exception unused) {
            }
        } catch (Throwable th2) {
            v7.a.a(MetadataIndexer.class, th2);
        }
    }

    private final void updateRules() {
        String str;
        if (v7.a.b(this)) {
            return;
        }
        try {
            r rVarK = u.k(s.c(), false);
            if (rVarK == null || (str = rVarK.f48766j) == null) {
                return;
            }
            MetadataRule.INSTANCE.updateRules(str);
        } catch (Throwable th2) {
            v7.a.a(this, th2);
        }
    }
}
