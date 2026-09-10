package com.startapp.sdk.internal;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import com.startapp.sdk.adsbase.AdsCommonMetaData;
import com.startapp.sdk.adsbase.AutoInterstitialPreferences;
import com.startapp.sdk.adsbase.StartAppAd;
import com.startapp.sdk.adsbase.cache.CacheMetaData;
import com.startapp.sdk.adsbase.model.AdPreferences;
import com.startapp.sdk.adsbase.remoteconfig.MetaData;
import com.startapp.sdk.adsbase.remoteconfig.MetaDataRequest$RequestReason;
import com.thinkup.core.common.n.mo;
import java.util.Iterator;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes6.dex */
public final class gh extends l6 {
    @Override // com.startapp.sdk.internal.l6, android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        boolean zStartsWith;
        jh jhVar = ih.f41097a;
        jhVar.getClass();
        boolean z2 = true;
        if (activity.getClass().getName().equals(vi.a(activity))) {
            jhVar.r = true;
        }
        jhVar.f41160p = bundle;
        if ((jhVar.r || activity.getClass().getName().equals(vi.a(activity))) && jhVar.f41160p == null && jhVar.f41156h.isEmpty() && ((h6) com.startapp.sdk.components.a.a(activity).j.a()).a(false, null, null, null, null, null)) {
            jhVar.r = false;
        }
        com.startapp.sdk.adsbase.e eVar = ma.f41248a;
        boolean zEquals = activity.getClass().getName().equals(vi.a(activity));
        if (bundle == null) {
            String[] strArrSplit = com.startapp.sdk.adsbase.e.class.getName().split("\\.");
            if (strArrSplit.length < 3) {
                zStartsWith = false;
            } else {
                zStartsWith = activity.getClass().getName().startsWith(strArrSplit[0] + mo.ono + strArrSplit[1] + mo.ono + strArrSplit[2]);
            }
            if (zStartsWith || zEquals) {
                return;
            }
            eVar.d++;
            if (eVar.f40655a && AdsCommonMetaData.k().H()) {
                if (eVar.f40656b == null) {
                    eVar.f40656b = new AutoInterstitialPreferences();
                }
                boolean z3 = eVar.f40657c <= 0 || System.currentTimeMillis() >= eVar.f40657c + ((long) (eVar.f40656b.getSecondsBetweenAds() * 1000));
                int i2 = eVar.d;
                if (i2 > 0 && i2 < eVar.f40656b.getActivitiesBetweenAds()) {
                    z2 = false;
                }
                if (z3 && z2) {
                    if (eVar.f40658e == null) {
                        eVar.f40658e = new StartAppAd(activity);
                    }
                    eVar.f40658e.loadAd(StartAppAd.AdMode.AUTOMATIC, new AdPreferences().setAi(Boolean.TRUE), new la());
                }
            }
        }
    }

    @Override // com.startapp.sdk.internal.l6, android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        jh jhVar = ih.f41097a;
        jhVar.getClass();
        if (activity.getClass().getName().equals(vi.a(activity))) {
            jhVar.r = false;
        }
        if (jhVar.f41156h.size() == 0) {
            jhVar.f41154c = false;
        }
    }

    @Override // com.startapp.sdk.internal.l6, android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        jh jhVar = ih.f41097a;
        jhVar.getClass();
        jhVar.f = System.currentTimeMillis();
        jhVar.k = null;
    }

    @Override // com.startapp.sdk.internal.l6, android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        jh jhVar = ih.f41097a;
        if (jhVar.f41153b && jhVar.d) {
            jhVar.d = false;
            p pVar = (p) com.startapp.sdk.components.a.a(activity).M.a();
            if (!pVar.d) {
                synchronized (pVar.f41333a) {
                    try {
                        Iterator it = pVar.f41333a.values().iterator();
                        while (it.hasNext()) {
                            ((x2) it.next()).a();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        }
        if (jhVar.f41158l) {
            jhVar.f41158l = false;
            com.startapp.sdk.adsbase.g.f(activity);
        }
        jhVar.k = activity;
    }

    @Override // com.startapp.sdk.internal.l6, android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        jh jhVar = ih.f41097a;
        if (jhVar.f41154c && System.currentTimeMillis() - jhVar.f > MetaData.E().V()) {
            pg.d.a(activity, MetaDataRequest$RequestReason.APP_IDLE);
        }
        jhVar.f41155e = false;
        jhVar.f41154c = false;
        Integer num = (Integer) jhVar.f41156h.get(Integer.valueOf(activity.hashCode()));
        if (num == null) {
            num = 0;
        }
        jhVar.f41156h.put(Integer.valueOf(activity.hashCode()), Integer.valueOf(num.intValue() + 1));
    }

    @Override // com.startapp.sdk.internal.l6, android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        jh jhVar = ih.f41097a;
        Integer num = (Integer) jhVar.f41156h.get(Integer.valueOf(activity.hashCode()));
        if (num != null) {
            int iIntValue = num.intValue() - 1;
            Integer numValueOf = Integer.valueOf(iIntValue);
            if (iIntValue == 0) {
                jhVar.f41156h.remove(Integer.valueOf(activity.hashCode()));
            } else {
                jhVar.f41156h.put(Integer.valueOf(activity.hashCode()), numValueOf);
            }
            if (jhVar.f41156h.size() == 0) {
                if (!jhVar.f41155e) {
                    jhVar.f41154c = true;
                }
                if (jhVar.f41153b) {
                    p pVar = (p) com.startapp.sdk.components.a.a(activity).M.a();
                    try {
                        if (!pVar.f41335c && CacheMetaData.b().a().g() && MetaData.E().f0()) {
                            ((Executor) pVar.f41337h.a()).execute(new l(pVar));
                        }
                        for (x2 x2Var : pVar.f41333a.values()) {
                            r2 r2Var = x2Var.t;
                            Handler handler = r2Var.f41384b;
                            if (handler != null) {
                                handler.removeCallbacksAndMessages(null);
                            }
                            r2Var.d = false;
                            o2 o2Var = x2Var.f41662u;
                            Handler handler2 = o2Var.f41384b;
                            if (handler2 != null) {
                                handler2.removeCallbacksAndMessages(null);
                            }
                            o2Var.d = false;
                        }
                    } catch (Throwable th) {
                        g9.a(th);
                    }
                    jhVar.d = true;
                }
            }
        }
    }
}
