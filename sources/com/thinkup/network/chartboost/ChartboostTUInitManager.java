package com.thinkup.network.chartboost;

import android.content.Context;
import com.chartboost.sdk.Chartboost;
import com.chartboost.sdk.Mediation;
import com.chartboost.sdk.callbacks.StartCallback;
import com.chartboost.sdk.events.StartError;
import com.chartboost.sdk.privacy.model.CCPA;
import com.chartboost.sdk.privacy.model.GDPR;
import com.thinkup.core.api.MediationInitCallback;
import com.thinkup.core.api.TUInitMediation;
import com.thinkup.core.api.TUSDK;
import com.thinkup.core.common.n.mo;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public class ChartboostTUInitManager extends TUInitMediation {
    public static final Mediation MEDIATION = new Mediation("TOPON", TUSDK.getSDKVersionName(), ChartboostTUConst.getNetworkVersion());
    private static final String o = "ChartboostTUInitManager";
    private static volatile ChartboostTUInitManager o0;
    private volatile boolean m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private volatile boolean f42539n;
    private final Object om = new Object();
    private List<MediationInitCallback> oo;

    private ChartboostTUInitManager() {
    }

    public static ChartboostTUInitManager getInstance() {
        if (o0 == null) {
            synchronized (ChartboostTUInitManager.class) {
                try {
                    if (o0 == null) {
                        o0 = new ChartboostTUInitManager();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return o0;
    }

    private void o() {
        synchronized (this.om) {
            try {
                this.m = true;
                this.f42539n = false;
                int size = this.oo.size();
                for (int i2 = 0; i2 < size; i2++) {
                    MediationInitCallback mediationInitCallback = this.oo.get(i2);
                    if (mediationInitCallback != null) {
                        mediationInitCallback.onSuccess();
                    }
                }
                this.oo.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.thinkup.core.api.TUInitMediation
    public List getActivityStatus() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("com.chartboost.sdk.view.CBImpressionActivity");
        return arrayList;
    }

    @Override // com.thinkup.core.api.TUInitMediation
    public String getAdapterVersion() {
        return mo.m;
    }

    @Override // com.thinkup.core.api.TUInitMediation
    public String getNetworkName() {
        return "Chartboost";
    }

    @Override // com.thinkup.core.api.TUInitMediation
    public String getNetworkSDKClass() {
        return "com.chartboost.sdk.Chartboost";
    }

    @Override // com.thinkup.core.api.TUInitMediation
    public String getNetworkVersion() {
        return ChartboostTUConst.getNetworkVersion();
    }

    @Override // com.thinkup.core.api.TUInitMediation
    public Map<String, Boolean> getPluginClassStatus() {
        HashMap map = new HashMap();
        Boolean bool = Boolean.FALSE;
        map.put("play-services-ads-identifier-*.aar", bool);
        map.put("play-services-basement-*.aar", bool);
        map.put("play-services-base-*.aar", bool);
        map.put("play-services-tasks-*.aar", bool);
        try {
            map.put("play-services-ads-identifier-*.aar", Boolean.TRUE);
        } catch (Throwable th) {
            th.printStackTrace();
        }
        try {
            map.put("play-services-basement-*.aar", Boolean.TRUE);
        } catch (Throwable th2) {
            th2.printStackTrace();
        }
        try {
            map.put("play-services-base-*.aar", Boolean.TRUE);
        } catch (Throwable th3) {
            th3.printStackTrace();
        }
        try {
            map.put("play-services-tasks-*.aar", Boolean.TRUE);
        } catch (Throwable th4) {
            th4.printStackTrace();
        }
        return map;
    }

    @Override // com.thinkup.core.api.TUInitMediation
    public void initSDK(Context context, Map<String, Object> map, MediationInitCallback mediationInitCallback) {
        synchronized (this.om) {
            try {
                if (this.m) {
                    if (mediationInitCallback != null) {
                        mediationInitCallback.onSuccess();
                    }
                    return;
                }
                if (this.oo == null) {
                    this.oo = new ArrayList(4);
                }
                if (this.f42539n) {
                    if (mediationInitCallback != null) {
                        this.oo.add(mediationInitCallback);
                    }
                    return;
                }
                this.f42539n = true;
                if (mediationInitCallback != null) {
                    this.oo.add(mediationInitCallback);
                }
                String stringFromMap = TUInitMediation.getStringFromMap(map, "app_id");
                String stringFromMap2 = TUInitMediation.getStringFromMap(map, "app_signature");
                try {
                    if (TUInitMediation.getBooleanFromMap(map, "app_ccpa_switch")) {
                        Chartboost.addDataUseConsent(context, new CCPA(CCPA.CCPA_CONSENT.OPT_OUT_SALE));
                    }
                } catch (Throwable unused) {
                }
                Chartboost.startWithAppId(context.getApplicationContext(), stringFromMap, stringFromMap2, new StartCallback() { // from class: com.thinkup.network.chartboost.ChartboostTUInitManager.1
                    @Override // com.chartboost.sdk.callbacks.StartCallback
                    public final void onStartCompleted(StartError startError) {
                        try {
                            if (startError == null) {
                                ChartboostTUInitManager.o(ChartboostTUInitManager.this);
                                return;
                            }
                            Exception exception = startError.getException();
                            String message = exception == null ? "" : exception.getMessage();
                            ChartboostTUInitManager chartboostTUInitManager = ChartboostTUInitManager.this;
                            startError.getCode().getErrorCode();
                            ChartboostTUInitManager.o(chartboostTUInitManager, message);
                        } catch (Exception e2) {
                            ChartboostTUInitManager.o(ChartboostTUInitManager.this, e2.getMessage());
                        }
                    }
                });
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.thinkup.core.api.TUInitMediation
    public boolean setUserDataConsent(Context context, boolean z2, boolean z3) {
        Chartboost.addDataUseConsent(context, new GDPR(z2 ? GDPR.GDPR_CONSENT.BEHAVIORAL : GDPR.GDPR_CONSENT.NON_BEHAVIORAL));
        return true;
    }

    private void o(String str) {
        synchronized (this.om) {
            try {
                this.m = false;
                this.f42539n = false;
                int size = this.oo.size();
                for (int i2 = 0; i2 < size; i2++) {
                    MediationInitCallback mediationInitCallback = this.oo.get(i2);
                    if (mediationInitCallback != null) {
                        mediationInitCallback.onFail(str);
                    }
                }
                this.oo.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static /* synthetic */ void o(ChartboostTUInitManager chartboostTUInitManager) {
        synchronized (chartboostTUInitManager.om) {
            try {
                chartboostTUInitManager.m = true;
                chartboostTUInitManager.f42539n = false;
                int size = chartboostTUInitManager.oo.size();
                for (int i2 = 0; i2 < size; i2++) {
                    MediationInitCallback mediationInitCallback = chartboostTUInitManager.oo.get(i2);
                    if (mediationInitCallback != null) {
                        mediationInitCallback.onSuccess();
                    }
                }
                chartboostTUInitManager.oo.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static /* synthetic */ void o(ChartboostTUInitManager chartboostTUInitManager, String str) {
        synchronized (chartboostTUInitManager.om) {
            try {
                chartboostTUInitManager.m = false;
                chartboostTUInitManager.f42539n = false;
                int size = chartboostTUInitManager.oo.size();
                for (int i2 = 0; i2 < size; i2++) {
                    MediationInitCallback mediationInitCallback = chartboostTUInitManager.oo.get(i2);
                    if (mediationInitCallback != null) {
                        mediationInitCallback.onFail(str);
                    }
                }
                chartboostTUInitManager.oo.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
