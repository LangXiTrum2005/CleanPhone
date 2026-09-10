package com.thinkup.interstitial.o;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.widget.Toast;
import com.smartdigimkt.v0.k;
import com.thinkup.core.api.TUBaseAdAdapter;
import com.thinkup.core.api.TUEventInterface;
import com.thinkup.core.api.TUNativeAdCustomRender;
import com.thinkup.core.api.TUShowConfig;
import com.thinkup.core.common.n.mo;
import com.thinkup.core.common.n.n0;
import com.thinkup.core.common.n.o0n;
import com.thinkup.core.common.on.o0mm;
import com.thinkup.core.common.ooo.o00;
import com.thinkup.core.common.ooo.omn;
import com.thinkup.core.oo.nm;
import com.thinkup.interstitial.api.TUInterstitialListener;
import com.thinkup.interstitial.unitgroup.api.CustomInterstitialAdapter;
import com.thinkup.interstitial.unitgroup.api.CustomInterstitialEventListener;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public class o {
    private static final String m = "o";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final int f42481n = 1;
    private static final int o0 = 2;
    private final TUInterstitialListener m0;
    private final Map<String, Object> mm;
    private final m mn;
    private final TUEventInterface mo;
    private CustomInterstitialAdapter n0;
    private com.thinkup.core.common.on.o no;
    TUNativeAdCustomRender o;
    private int o00;
    private final String om;
    private final TUShowConfig on;
    private final WeakReference<Activity> oo;
    private int ooo;
    private int nm = 0;
    private int nn = 1;
    private final List<Integer> o0o = Arrays.asList(8, 15, 22, 28);
    private final List<CustomInterstitialAdapter> o0m = new ArrayList();
    private final List<CustomInterstitialAdapter> o0n = new ArrayList();
    private final Map<CustomInterstitialAdapter, WeakReference<Activity>> oo0 = new HashMap();
    private int oom = 3;
    private int oon = -1;
    private final Handler om0 = new Handler(Looper.getMainLooper()) { // from class: com.thinkup.interstitial.o.o.1
        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            int i2 = message.what;
            if (i2 != 1) {
                if (i2 != 2) {
                    return;
                }
                omn.m(mo.oom, "handleMessage:0x002:" + o.this.nm);
                if (o.this.nm != 1) {
                    omn.m(mo.oom, "handleMessage:0x002:carouselState!=1");
                    return;
                }
                Object obj = message.obj;
                if (!(obj instanceof Integer)) {
                    o.nn(o.this);
                    omn.m(mo.oom, "handleMessage:0x002:msg.obj is not Integer");
                    return;
                }
                try {
                    int iIntValue = ((Integer) obj).intValue() / 1000;
                    com.thinkup.core.common.on.o oVarMo = o.this.mo();
                    if (oVarMo == null) {
                        o.nn(o.this);
                        omn.m(mo.oom, "handleMessage:0x002:There are no ads available for carousel, so the carousel is terminated.");
                        return;
                    }
                    o.this.no = oVarMo;
                    if (o.this.no.oo() != null) {
                        omn.m(mo.oom, "handleMessage:nextPlayAdCacheInfo:" + o.this.no.oo().getNetworkName());
                    }
                    Context contextOn = o0n.m().on();
                    if (contextOn == null) {
                        contextOn = o.this.on();
                    }
                    if (contextOn != null) {
                        String string = "";
                        try {
                            string = contextOn.getString(o00.o(contextOn, "interstitial_text_next_play", k.f38992h));
                        } catch (Exception unused) {
                        }
                        o.o(contextOn, string, iIntValue);
                        return;
                    }
                    return;
                } catch (Throwable th) {
                    o.nn(o.this);
                    th.printStackTrace();
                    return;
                }
            }
            try {
                omn.m(mo.oom, "handleMessage:0x001:" + o.this.nm);
                if (o.this.no == null || !o.this.no.mn() || o.this.nm != 1) {
                    if (o.this.no != null) {
                        omn.m(mo.oom, "handleMessage:0x001:nextPlayAdCacheInfo:" + o.this.no.mn() + ":carouselState:" + o.this.nm);
                    } else {
                        omn.m(mo.oom, "handleMessage:0x001:nextPlayAdCacheInfo is null and carouselState=" + o.this.nm);
                    }
                    o.nn(o.this);
                    return;
                }
                if (o.this.nn >= o.this.o00) {
                    o.nn(o.this);
                    omn.m(mo.oom, "handleMessage:0x001:rotation_num is out");
                    return;
                }
                String strOo = o.oo(o.this);
                if (!TextUtils.isEmpty(strOo)) {
                    o.nn(o.this);
                    com.thinkup.core.common.oo0.oo.o("1", o.this.n0 != null ? o.this.n0.getTrackingInfo() : null, o0n.m().n0m(), strOo);
                    omn.m(mo.oom, "handleMessage:0x001:close is exception:".concat(String.valueOf(strOo)));
                    return;
                }
                omn.m(mo.oom, "handleMessage:0x001:close:success");
                if (o.this.mn == null) {
                    o.nn(o.this);
                    return;
                }
                TUBaseAdAdapter tUBaseAdAdapterOo = o.this.no.oo();
                if (tUBaseAdAdapterOo != null) {
                    omn.m(mo.oom, "handleMessage:0x001:internalShow:" + tUBaseAdAdapterOo.getNetworkName());
                    tUBaseAdAdapterOo.setCarouselShowType(1);
                }
                if (o.this.oon > 0) {
                    o.m0(o.this);
                }
                o.mo(o.this);
                o.this.mn.o(o.this.on(), o.this.no, o.this.on, o.this.m0, o.this.mo, o.this.mm, o.this.o);
            } catch (Throwable th2) {
                o.nn(o.this);
                th2.printStackTrace();
            }
        }
    };
    private final n0 omo = new n0() { // from class: com.thinkup.interstitial.o.o.2
        @Override // com.thinkup.core.common.n.n0
        public final void o(boolean z2) {
            omn.m(mo.oom, "backToForeground:".concat(String.valueOf(z2)));
            if (z2) {
                return;
            }
            o.nn(o.this);
            if (o.this.n0 == null || o.this.n0.getTrackingInfo() == null) {
                return;
            }
            com.thinkup.core.common.oo0.oo.o(o.this.n0.getTrackingInfo(), String.valueOf(o.this.om()));
        }
    };
    private final Map<CustomInterstitialAdapter, CustomInterstitialEventListener> omm = new HashMap();

    public o(Activity activity, TUShowConfig tUShowConfig, TUInterstitialListener tUInterstitialListener, TUEventInterface tUEventInterface, Map<String, Object> map, TUNativeAdCustomRender tUNativeAdCustomRender, String str, m mVar) {
        this.oo = new WeakReference<>(activity);
        this.on = tUShowConfig;
        this.m0 = tUInterstitialListener;
        this.mo = tUEventInterface;
        this.mm = map;
        this.o = tUNativeAdCustomRender;
        this.om = str;
        this.mn = mVar;
    }

    public static /* synthetic */ int m0(o oVar) {
        int i2 = oVar.oon;
        oVar.oon = i2 - 1;
        return i2;
    }

    public static /* synthetic */ int mo(o oVar) {
        int i2 = oVar.nn;
        oVar.nn = i2 + 1;
        return i2;
    }

    public static /* synthetic */ int nn(o oVar) {
        oVar.nm = 2;
        return 2;
    }

    public static /* synthetic */ String oo(o oVar) {
        return oVar.o(1);
    }

    private static void m(Context context, String str, int i2) {
        try {
            if (!TextUtils.isEmpty(str)) {
                Toast.makeText(context, str.replace("_SEC_", String.valueOf(i2)), 1).show();
                return;
            }
            Toast.makeText(context, "Show the next ad after " + i2 + " seconds", 1).show();
        } catch (Throwable unused) {
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0038  */
    private void m0() {
        boolean z2;
        com.thinkup.core.common.on.n0 trackingInfo;
        o0mm unitGroupInfo;
        try {
            CustomInterstitialAdapter customInterstitialAdapter = this.n0;
            if (customInterstitialAdapter == null || (trackingInfo = customInterstitialAdapter.getTrackingInfo()) == null || (unitGroupInfo = customInterstitialAdapter.getUnitGroupInfo()) == null) {
                z2 = false;
            } else {
                if (trackingInfo.nm0() == 3) {
                    int iO00m = unitGroupInfo.o00m();
                    if (!this.o0o.contains(Integer.valueOf(trackingInfo.n0n())) || iO00m != 1) {
                        z2 = false;
                    }
                }
                z2 = true;
            }
            omn.m(mo.oom, "startCarouse:canCarouse:".concat(String.valueOf(z2)));
            if (z2) {
                o0n.m().o(this.omo);
                omn.m(mo.oom, "startCarouse:" + this.nm);
                com.thinkup.core.oo.n0 n0VarO = nm.o(o0n.m().on()).o(this.om);
                CustomInterstitialAdapter customInterstitialAdapter2 = this.n0;
                o0mm unitGroupInfo2 = customInterstitialAdapter2 != null ? customInterstitialAdapter2.getUnitGroupInfo() : null;
                if (n0VarO == null || unitGroupInfo2 == null) {
                    this.nm = 0;
                    return;
                }
                this.o00 = n0VarO.m000();
                omn.m(mo.oom, "startCarouse:" + this.o00 + ":" + this.nn);
                int i2 = this.o00;
                if (i2 < 2) {
                    this.nm = 0;
                    return;
                }
                if (this.nn >= i2) {
                    this.nm = 2;
                    omn.m(mo.oom, "startCarouse:The number of carousel items exceeds the limit, so the carousel is terminated.");
                    return;
                }
                int iM00o = n0VarO.m00o();
                int iO00n = unitGroupInfo2.o00n();
                if (iO00n == 0) {
                    iO00n = iM00o;
                }
                int iM00m = n0VarO.m00m();
                this.ooo = iM00o;
                if (this.n0.isMixSplash()) {
                    this.ooo = iO00n;
                }
                int i3 = this.ooo - iM00m;
                omn.m(mo.oom, "startCarouse:interval:" + this.ooo + ":" + i3);
                if (this.ooo <= 0 || i3 <= 0) {
                    omn.m(mo.oom, "startCarouse:currentInterval is exception");
                    this.nm = 0;
                    return;
                }
                this.om0.removeCallbacksAndMessages(null);
                this.om0.sendEmptyMessageDelayed(1, this.ooo);
                Handler handler = this.om0;
                handler.sendMessageDelayed(Message.obtain(handler, 2, Integer.valueOf(iM00m)), i3);
                this.nm = 1;
            }
        } catch (Throwable unused) {
            this.nm = 0;
        }
    }

    private List<com.thinkup.core.common.on.o> mm() {
        com.thinkup.core.common.om omVarO;
        List<com.thinkup.core.common.on.o> listM;
        try {
            m mVar = this.mn;
            if (mVar == null || (omVarO = mVar.o()) == null) {
                return null;
            }
            Context contextOn = o0n.m().on();
            if (contextOn == null) {
                contextOn = on();
            }
            if (contextOn == null || (listM = omVarO.m(contextOn)) == null || listM.isEmpty()) {
                return null;
            }
            omn.m(mo.oom, "getAllAdCacheInfoList:" + listM.size());
            return listM;
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public com.thinkup.core.common.on.o mo() {
        try {
            List<com.thinkup.core.common.on.o> listMm = mm();
            if (listMm != null) {
                omn.m(mo.oom, "checkNextAdCacheInfo:" + listMm.size());
            }
            if (listMm == null || listMm.isEmpty()) {
                return null;
            }
            if (this.o00 - this.nn == 1) {
                omn.m(mo.oom, "checkNextAdCacheInfo:When it comes to the last item, just play randomly.");
                List<com.thinkup.core.common.on.o> listM = m(listMm);
                if (listM.isEmpty()) {
                    return null;
                }
                return listM.get(0);
            }
            List<com.thinkup.core.common.on.o> listO = o(listMm);
            if (listO.isEmpty()) {
                return null;
            }
            this.oon = listO.size();
            List<com.thinkup.core.common.on.o> listM2 = m(listO);
            if (listM2 == null || listM2.isEmpty()) {
                return null;
            }
            return listM2.get(0);
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    private boolean o0(CustomInterstitialAdapter customInterstitialAdapter) {
        com.thinkup.core.common.on.n0 trackingInfo;
        o0mm unitGroupInfo;
        if (customInterstitialAdapter != null && (trackingInfo = customInterstitialAdapter.getTrackingInfo()) != null && (unitGroupInfo = customInterstitialAdapter.getUnitGroupInfo()) != null) {
            if (trackingInfo.nm0() != 3) {
                return true;
            }
            int iO00m = unitGroupInfo.o00m();
            if (this.o0o.contains(Integer.valueOf(trackingInfo.n0n())) && iO00m == 1) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Activity on() {
        Activity activity = this.oo.get() != null ? this.oo.get() : null;
        return activity == null ? o0n.m().mmo() : activity;
    }

    private Activity oo(CustomInterstitialAdapter customInterstitialAdapter) {
        WeakReference<Activity> weakReferenceRemove = this.oo0.remove(customInterstitialAdapter);
        if (weakReferenceRemove != null) {
            return weakReferenceRemove.get();
        }
        return null;
    }

    public final void n(CustomInterstitialAdapter customInterstitialAdapter) {
        omn.m(mo.oom, "notifyAdClose:hashCode:" + hashCode());
        if (customInterstitialAdapter == null || customInterstitialAdapter != this.n0) {
            omn.m(mo.oom, "notifyAdClose:adapter != currentPlayAdapter");
            return;
        }
        if (this.o0m.contains(customInterstitialAdapter)) {
            this.oom = 1;
            omn.m(mo.oom, "notifyAdClose:The closure triggered by the carousel ad:" + customInterstitialAdapter.getNetworkName() + ":" + this.nm);
            return;
        }
        if (this.o0n.contains(customInterstitialAdapter)) {
            this.nm = 2;
            this.oom = 2;
            omn.m(mo.oom, "notifyAdClose:The close triggered by the server-side click shutdown:" + customInterstitialAdapter.getNetworkName() + ":" + this.nm);
            return;
        }
        this.nm = 2;
        this.oom = 3;
        omn.m(mo.oom, "notifyAdClose:The closure triggered by the user clicking the close button:" + customInterstitialAdapter.getNetworkName() + ":" + this.nm);
    }

    public final int om() {
        return this.oon;
    }

    private List<com.thinkup.core.common.on.o> o(List<com.thinkup.core.common.on.o> list) {
        o0mm unitGroupInfo;
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < list.size(); i2++) {
            try {
                com.thinkup.core.common.on.o oVar = list.get(i2);
                TUBaseAdAdapter tUBaseAdAdapterOo = oVar.oo();
                com.thinkup.core.common.on.n0 n0VarMo = oVar.mo();
                if (n0VarMo != null && tUBaseAdAdapterOo != null && (unitGroupInfo = tUBaseAdAdapterOo.getUnitGroupInfo()) != null) {
                    int iO00m = unitGroupInfo.o00m();
                    if (n0VarMo.nm0() != 3) {
                        if (iO00m == 1) {
                            arrayList.add(oVar);
                        }
                    } else if (this.o0o.contains(Integer.valueOf(n0VarMo.n0n())) && iO00m == 1) {
                        arrayList.add(oVar);
                    }
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
        omn.m(mo.oom, "getAdSupportCacheInfoList:" + arrayList.size());
        return arrayList;
    }

    public final int oo() {
        return this.oom;
    }

    private static List<com.thinkup.core.common.on.o> m(List<com.thinkup.core.common.on.o> list) {
        if (list != null) {
            try {
                if (!list.isEmpty()) {
                    Collections.sort(list);
                    return list;
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
        return list;
    }

    public final void m(CustomInterstitialAdapter customInterstitialAdapter) {
        com.thinkup.core.common.on.n0 trackingInfo;
        if (customInterstitialAdapter == null || customInterstitialAdapter != this.n0) {
            omn.m(mo.oom, "notifyAdClick:adapter != currentPlayAdapter");
            return;
        }
        omn.m(mo.oom, "notifyAdClick:" + customInterstitialAdapter.getNetworkName());
        this.nm = 2;
        o0mm unitGroupInfo = this.n0.getUnitGroupInfo();
        if (unitGroupInfo == null || unitGroupInfo.o00o() != 1 || (trackingInfo = this.n0.getTrackingInfo()) == null) {
            return;
        }
        if (trackingInfo.nm0() != 3 || this.o0o.contains(Integer.valueOf(trackingInfo.n0n()))) {
            String strO = o(2);
            if (TextUtils.isEmpty(strO)) {
                return;
            }
            com.thinkup.core.common.oo0.oo.o("2", trackingInfo, o0n.m().n0m(), strO);
        }
    }

    public final int o0() {
        return this.ooo;
    }

    public final int n() {
        return this.nn;
    }

    public final void o(CustomInterstitialAdapter customInterstitialAdapter) {
        omn.m(mo.oom, "notifyAdPlay:hashCode:" + hashCode());
        if (customInterstitialAdapter != null) {
            omn.m(mo.oom, "notifyAdPlay::" + customInterstitialAdapter.getNetworkName());
            CustomInterstitialAdapter customInterstitialAdapter2 = this.n0;
            if (customInterstitialAdapter2 == null) {
                this.n0 = customInterstitialAdapter;
                m0();
            } else {
                if (customInterstitialAdapter != customInterstitialAdapter2) {
                    this.n0 = customInterstitialAdapter;
                    if (this.nm == 1) {
                        m0();
                        return;
                    } else {
                        omn.m(mo.oom, "notifyAdPlay:Currently in a carousel-disabled state.");
                        return;
                    }
                }
                omn.m(mo.oom, "notifyAdPlay:adapter == currentPlayAdapter");
            }
        }
    }

    public final int m() {
        return this.nm;
    }

    public final void o(CustomInterstitialAdapter customInterstitialAdapter, CustomInterstitialEventListener customInterstitialEventListener) {
        if (customInterstitialAdapter != null) {
            this.omm.put(customInterstitialAdapter, customInterstitialEventListener);
        }
    }

    private String o(int i2) {
        try {
            this.oom = i2;
            if (this.n0 != null) {
                omn.m(mo.oom, "closeAd:" + i2 + ":" + this.n0.getNetworkName());
                int i3 = this.oom;
                if (i3 == 1) {
                    this.o0m.add(this.n0);
                } else if (i3 == 2) {
                    this.nm = 2;
                    this.o0n.add(this.n0);
                } else {
                    this.nm = 2;
                }
                if (this.n0.isMixFormatAd()) {
                    WeakReference<Activity> weakReferenceRemove = this.oo0.remove(this.n0);
                    Activity activity = weakReferenceRemove != null ? weakReferenceRemove.get() : null;
                    if (activity != null) {
                        omn.m(mo.oom, "removeMixActivity:" + this.nm + ":" + activity.getClass().getName());
                        activity.finish();
                        activity.overridePendingTransition(0, 0);
                        CustomInterstitialEventListener customInterstitialEventListener = this.omm.get(this.n0);
                        if (customInterstitialEventListener != null) {
                            customInterstitialEventListener.onInterstitialAdClose();
                            return "";
                        }
                        return "";
                    }
                    return "mixActivityMap get is null";
                }
                return this.n0.closeAd();
            }
            return "closeAd currentPlayAdapter is null";
        } catch (Throwable th) {
            return th.getMessage();
        }
    }

    public final void o() {
        try {
            omn.m(mo.oom, "destroy:hashCode:" + hashCode() + ":carouselState:" + this.nm);
            this.nm = 0;
            this.nn = 1;
            this.oom = 3;
            this.oon = -1;
            this.oo0.clear();
            this.o0m.clear();
            this.o0n.clear();
            this.omm.clear();
            this.om0.removeCallbacksAndMessages(null);
            o0n.m().m(this.omo);
        } catch (Throwable unused) {
        }
    }

    public final void o(CustomInterstitialAdapter customInterstitialAdapter, Activity activity) {
        if (customInterstitialAdapter == null || activity == null) {
            return;
        }
        omn.m(mo.oom, "saveMixActivity:" + this.nm + ":" + activity.getClass().getName());
        this.oo0.put(customInterstitialAdapter, new WeakReference<>(activity));
    }

    public static /* synthetic */ void o(Context context, String str, int i2) {
        try {
            if (!TextUtils.isEmpty(str)) {
                Toast.makeText(context, str.replace("_SEC_", String.valueOf(i2)), 1).show();
                return;
            }
            Toast.makeText(context, "Show the next ad after " + i2 + " seconds", 1).show();
        } catch (Throwable unused) {
        }
    }
}
