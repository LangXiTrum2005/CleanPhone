package ads_mobile_sdk;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.VersionInfo;
import com.google.android.gms.ads.mediation.Adapter;
import com.google.android.gms.ads.mediation.MediationConfiguration;
import igo.beachfront;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlinx.coroutines.kowloon;
import p002kotlin.Result;
import p002kotlin.collections.dovishness;
import p002kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public abstract class ux0 {
    public final Adapter a;

    public ux0(Adapter adapter) {
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        this.a = adapter;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:35:0x008b  */
    public static final ArrayList a(ux0 ux0Var, j8 j8Var) {
        AdFormat adFormat;
        ux0Var.getClass();
        List<m8> listP = j8Var.p();
        Intrinsics.checkNotNullExpressionValue(listP, "getInitializationDataList(...)");
        ArrayList arrayList = new ArrayList(dovishness.gintrap(listP, 10));
        for (m8 m8Var : listP) {
            String strP = m8Var.p();
            Intrinsics.checkNotNullExpressionValue(strP, "getFormat(...)");
            switch (strP) {
                case "banner":
                    adFormat = AdFormat.BANNER;
                    break;
                case "native":
                    adFormat = AdFormat.NATIVE;
                    break;
                case "rewarded":
                    adFormat = AdFormat.REWARDED;
                    break;
                case "interstitial":
                    adFormat = AdFormat.INTERSTITIAL;
                    break;
                case "app_open":
                    adFormat = AdFormat.APP_OPEN_AD;
                    break;
                case "app_open_ad":
                    adFormat = AdFormat.APP_OPEN_AD;
                    break;
                case "rewarded_interstitial":
                    adFormat = AdFormat.REWARDED_INTERSTITIAL;
                    break;
                default:
                    adFormat = AdFormat.UNKNOWN;
                    break;
            }
            Bundle bundle = new Bundle();
            Map mapO = m8Var.o();
            Intrinsics.checkNotNullExpressionValue(mapO, "getExtrasMap(...)");
            for (Map.Entry entry : mapO.entrySet()) {
                bundle.putString((String) entry.getKey(), (String) entry.getValue());
            }
            arrayList.add(new MediationConfiguration(adFormat, bundle));
        }
        return arrayList;
    }

    public final VersionInfo b() {
        return this.a.getVersionInfo();
    }

    public final Object b(Context context, j8 j8Var, wretchedly.dern dernVar) {
        if (!Intrinsics.wireman(Looper.getMainLooper(), Looper.myLooper())) {
            throw new IllegalStateException("Check failed.");
        }
        kowloon kowloonVar = new kowloon(IntrinsicsKt__IntrinsicsJvmKt.dern(dernVar), 1);
        kowloonVar.kattegat();
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        try {
            this.a.initialize(context, new tx0(atomicBoolean, kowloonVar), a(this, j8Var));
        } catch (Throwable th) {
            if (!atomicBoolean.getAndSet(true)) {
                Result.Companion companion = Result.INSTANCE;
                kowloonVar.resumeWith(Result.m3351constructorimpl(new on0(th, k41.ADAPTER_INITIALIZATION_ERROR, "Exception caught initializing adapter: " + th.getClass().getName())));
            }
        }
        Object objCuirassed = kowloonVar.cuirassed();
        if (objCuirassed == p002kotlin.coroutines.intrinsics.attabal.beachfront()) {
            beachfront.dern(dernVar);
        }
        return objCuirassed;
    }

    public final VersionInfo a() {
        return this.a.getSDKVersionInfo();
    }

    public Object a(Context context, j8 j8Var, wretchedly.dern dernVar) {
        return b(context, j8Var, dernVar);
    }
}
