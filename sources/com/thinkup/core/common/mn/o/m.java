package com.thinkup.core.common.mn.o;

import android.app.Activity;
import android.content.Context;
import android.support.v4.media.a;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import com.thinkup.core.api.ITUBaseAdAdapter;
import com.thinkup.core.api.TUAdConst;
import com.thinkup.core.api.TUBaseAdAdapter;
import com.thinkup.core.api.TUBidRequestInfoListener;
import com.thinkup.core.api.TUBiddingListener;
import com.thinkup.core.api.TUBiddingResult;
import com.thinkup.core.api.TUCommonImpressionListener;
import com.thinkup.core.api.TUCustomLoadListener;
import com.thinkup.core.common.mn.on.n;
import com.thinkup.core.common.n.mo;
import com.thinkup.core.common.on.n0;
import com.thinkup.core.common.ooo.o00;
import com.thinkup.core.common.ooo.oo0;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public class m implements ITUBaseAdAdapter {
    private static final String m = "not support this format: %s";
    private static final String o = "m";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private ITUBaseAdAdapter f41872n;
    private Map<Integer, Class<? extends TUBaseAdAdapter>> o0;
    private String oo;

    public m(ITUBaseAdAdapter iTUBaseAdAdapter) {
        this.f41872n = iTUBaseAdAdapter;
    }

    private boolean o() {
        return !TextUtils.isEmpty(this.oo) || this.f41872n == null;
    }

    @Override // com.thinkup.core.api.ITUBaseAdAdapter
    public String closeAd() {
        ITUBaseAdAdapter iTUBaseAdAdapter = this.f41872n;
        return iTUBaseAdAdapter != null ? iTUBaseAdAdapter.closeAd() : "";
    }

    @Override // com.thinkup.core.api.ITUBaseAdAdapter
    public void destory() {
        ITUBaseAdAdapter iTUBaseAdAdapter = this.f41872n;
        if (iTUBaseAdAdapter != null) {
            iTUBaseAdAdapter.destory();
        }
    }

    @Override // com.thinkup.core.api.ITUBaseAdAdapter
    public void getBidRequestInfo(Context context, Map<String, Object> map, Map<String, Object> map2, TUBidRequestInfoListener tUBidRequestInfoListener) {
        if (this.f41872n != null) {
            this.f41872n = o(map, map2);
            if (!o()) {
                this.f41872n.getBidRequestInfo(context, map, map2, tUBidRequestInfoListener);
            } else if (tUBidRequestInfoListener != null) {
                tUBidRequestInfoListener.onFailed(this.oo);
            }
        }
    }

    @Override // com.thinkup.core.api.ITUBaseAdAdapter
    public Map<Integer, Class<? extends TUBaseAdAdapter>> getFormatAdapterMap() {
        ITUBaseAdAdapter iTUBaseAdAdapter = this.f41872n;
        if (iTUBaseAdAdapter != null) {
            return iTUBaseAdAdapter.getFormatAdapterMap();
        }
        return null;
    }

    @Override // com.thinkup.core.api.ITUBaseAdAdapter
    public View getMixView() {
        ITUBaseAdAdapter iTUBaseAdAdapter = this.f41872n;
        if (iTUBaseAdAdapter != null) {
            return iTUBaseAdAdapter.getMixView();
        }
        return null;
    }

    @Override // com.thinkup.core.api.ITUBaseAdAdapter
    public Map<String, Object> getNetworkInfoMap() {
        com.thinkup.core.common.mn.o0.m serverExtraInfo = getServerExtraInfo();
        if (serverExtraInfo != null && serverExtraInfo.o0o() != null) {
            return serverExtraInfo.o0o();
        }
        ITUBaseAdAdapter iTUBaseAdAdapter = this.f41872n;
        if (iTUBaseAdAdapter != null) {
            return iTUBaseAdAdapter.getNetworkInfoMap();
        }
        return null;
    }

    @Override // com.thinkup.core.api.ITUBaseAdAdapter
    public String getNetworkName() {
        ITUBaseAdAdapter iTUBaseAdAdapter = this.f41872n;
        return iTUBaseAdAdapter != null ? iTUBaseAdAdapter.getNetworkName() : "";
    }

    @Override // com.thinkup.core.api.ITUBaseAdAdapter
    public String getNetworkPlacementId() {
        ITUBaseAdAdapter iTUBaseAdAdapter = this.f41872n;
        return iTUBaseAdAdapter != null ? iTUBaseAdAdapter.getNetworkPlacementId() : "";
    }

    @Override // com.thinkup.core.api.ITUBaseAdAdapter
    public String getNetworkSDKVersion() {
        ITUBaseAdAdapter iTUBaseAdAdapter = this.f41872n;
        return iTUBaseAdAdapter != null ? iTUBaseAdAdapter.getNetworkSDKVersion() : "";
    }

    @Override // com.thinkup.core.api.ITUBaseAdAdapter
    public com.thinkup.core.common.mn.o0.m getServerExtraInfo() {
        ITUBaseAdAdapter iTUBaseAdAdapter = this.f41872n;
        if (iTUBaseAdAdapter != null) {
            return iTUBaseAdAdapter.getServerExtraInfo();
        }
        return null;
    }

    @Override // com.thinkup.core.api.ITUBaseAdAdapter
    public n0 getTrackingInfo() {
        ITUBaseAdAdapter iTUBaseAdAdapter = this.f41872n;
        if (iTUBaseAdAdapter != null) {
            return iTUBaseAdAdapter.getTrackingInfo();
        }
        return null;
    }

    @Override // com.thinkup.core.api.ITUBaseAdAdapter
    public boolean initNetworkObjectByPlacementId(Context context, Map<String, Object> map, Map<String, Object> map2) {
        if (this.f41872n != null) {
            ITUBaseAdAdapter iTUBaseAdAdapterO = o(map, map2);
            this.f41872n = iTUBaseAdAdapterO;
            if (iTUBaseAdAdapterO != null && iTUBaseAdAdapterO.initNetworkObjectByPlacementId(context, map, map2)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.thinkup.core.api.ITUBaseAdAdapter
    public void internalFormatShow(Activity activity, ViewGroup viewGroup, TUCommonImpressionListener tUCommonImpressionListener) {
        ITUBaseAdAdapter iTUBaseAdAdapter = this.f41872n;
        if (iTUBaseAdAdapter != null) {
            iTUBaseAdAdapter.internalFormatShow(activity, viewGroup, tUCommonImpressionListener);
        }
    }

    @Override // com.thinkup.core.api.ITUBaseAdAdapter
    public boolean isAdReady() {
        ITUBaseAdAdapter iTUBaseAdAdapter = this.f41872n;
        return iTUBaseAdAdapter != null && iTUBaseAdAdapter.isAdReady();
    }

    @Override // com.thinkup.core.api.ITUBaseAdAdapter
    public void loadCustomNetworkAd(Context context, Map<String, Object> map, Map<String, Object> map2) {
    }

    @Override // com.thinkup.core.api.ITUBaseAdAdapter
    public void parseGlobalParams(Map<String, Object> map, Map<String, Object> map2) {
        ITUBaseAdAdapter iTUBaseAdAdapter = this.f41872n;
        if (iTUBaseAdAdapter != null) {
            iTUBaseAdAdapter.parseGlobalParams(map, map2);
        }
    }

    @Override // com.thinkup.core.api.ITUBaseAdAdapter
    public void setBiddingListener(TUBiddingListener tUBiddingListener) {
        ITUBaseAdAdapter iTUBaseAdAdapter = this.f41872n;
        if (iTUBaseAdAdapter != null) {
            iTUBaseAdAdapter.setBiddingListener(tUBiddingListener);
        }
    }

    @Override // com.thinkup.core.api.ITUBaseAdAdapter
    public void setLoadListener(TUCustomLoadListener tUCustomLoadListener) {
        ITUBaseAdAdapter iTUBaseAdAdapter = this.f41872n;
        if (iTUBaseAdAdapter != null) {
            iTUBaseAdAdapter.setLoadListener(tUCustomLoadListener);
        }
    }

    @Override // com.thinkup.core.api.ITUBaseAdAdapter
    public void setTrackingInfo(n0 n0Var) {
        ITUBaseAdAdapter iTUBaseAdAdapter = this.f41872n;
        if (iTUBaseAdAdapter == null || iTUBaseAdAdapter.getTrackingInfo() != null || n0Var == null) {
            return;
        }
        this.f41872n.setTrackingInfo(n0Var);
    }

    @Override // com.thinkup.core.api.ITUBaseAdAdapter
    public boolean setUserDataConsent(Context context, boolean z2, boolean z3) {
        ITUBaseAdAdapter iTUBaseAdAdapter = this.f41872n;
        if (iTUBaseAdAdapter == null) {
            return false;
        }
        iTUBaseAdAdapter.setUserDataConsent(context, z2, z3);
        return false;
    }

    @Override // com.thinkup.core.api.ITUBaseAdAdapter
    public boolean startBiddingRequest(Context context, Map<String, Object> map, Map<String, Object> map2, TUBiddingListener tUBiddingListener) {
        if (this.f41872n == null) {
            return false;
        }
        this.f41872n = o(map, map2);
        if (o()) {
            if (tUBiddingListener != null) {
                tUBiddingListener.onC2SBiddingResultWithCache(TUBiddingResult.fail(this.oo), null);
            }
            return false;
        }
        ITUBaseAdAdapter iTUBaseAdAdapter = this.f41872n;
        if (iTUBaseAdAdapter == null || tUBiddingListener == null) {
            tUBiddingListener = null;
        } else {
            com.thinkup.core.common.mn.o0.m serverExtraInfo = iTUBaseAdAdapter.getServerExtraInfo();
            if (serverExtraInfo != null && serverExtraInfo.mn()) {
                tUBiddingListener = new com.thinkup.core.common.mn.on.m(tUBiddingListener, serverExtraInfo);
            }
        }
        this.f41872n.setBiddingListener(tUBiddingListener);
        return this.f41872n.startBiddingRequest(context, map, map2, tUBiddingListener);
    }

    @Override // com.thinkup.core.api.ITUBaseAdAdapter
    public boolean supportImpressionCallback() {
        ITUBaseAdAdapter iTUBaseAdAdapter = this.f41872n;
        return iTUBaseAdAdapter == null || iTUBaseAdAdapter.supportImpressionCallback();
    }

    private ITUBaseAdAdapter o(Map<String, Object> map, Map<String, Object> map2) {
        ITUBaseAdAdapter iTUBaseAdAdapterO;
        Class<? extends TUBaseAdAdapter> cls;
        ITUBaseAdAdapter iTUBaseAdAdapter = this.f41872n;
        if (iTUBaseAdAdapter != null) {
            iTUBaseAdAdapter.parseGlobalParams(map, map2);
        }
        com.thinkup.core.common.mn.o0.m serverExtraInfo = getServerExtraInfo();
        if (serverExtraInfo == null || !serverExtraInfo.mn()) {
            iTUBaseAdAdapterO = this.f41872n;
        } else {
            int iM = serverExtraInfo.m();
            if (this.o0 == null) {
                this.o0 = getFormatAdapterMap();
            }
            Map<Integer, Class<? extends TUBaseAdAdapter>> map3 = this.o0;
            if (map3 == null || map3.size() <= 0 || (cls = this.o0.get(Integer.valueOf(iM))) == null) {
                this.oo = a.h(iM, "not support this format: ");
            } else {
                try {
                    iTUBaseAdAdapterO = oo0.o(cls.getName());
                } catch (Throwable th) {
                    Log.e(mo.oo0, th.getMessage());
                    this.oo = th.getMessage();
                    iTUBaseAdAdapterO = null;
                }
            }
            iTUBaseAdAdapterO = null;
        }
        if (iTUBaseAdAdapterO != null && iTUBaseAdAdapterO != this.f41872n) {
            try {
                serverExtraInfo.o(iTUBaseAdAdapterO);
                if (serverExtraInfo.n0()) {
                    int iIntValue = ((Integer) o00.o(map, "nw_firm_id", 0)).intValue();
                    if (iIntValue == 39 && map2 != null) {
                        Object obj = map2.get("huawei_request_custom_dislike");
                        boolean zBooleanValue = obj instanceof Boolean ? ((Boolean) obj).booleanValue() : true;
                        map2.put("huawei_request_custom_dislike", Boolean.valueOf(zBooleanValue));
                        if (zBooleanValue && !map2.containsKey(TUAdConst.KEY.AD_CHOICES_PLACEMENT)) {
                            map2.put(TUAdConst.KEY.AD_CHOICES_PLACEMENT, 2);
                        }
                    }
                    if (!serverExtraInfo.on() || map == null) {
                        if (serverExtraInfo.om() && iIntValue == 2 && map2 != null && !map2.containsKey(TUAdConst.KEY.AD_CHOICES_PLACEMENT)) {
                            map2.put(TUAdConst.KEY.AD_CHOICES_PLACEMENT, 2);
                        }
                    } else if (iIntValue != 2) {
                        if (iIntValue != 6) {
                            if (iIntValue != 8) {
                                if (iIntValue == 28 && !map.containsKey("video_sound")) {
                                    map.put("video_sound", 0);
                                }
                            } else if (!map.containsKey("video_muted")) {
                                map.put("video_muted", "1");
                            }
                        } else if (!map.containsKey("video_muted")) {
                            map.put("video_muted", "0");
                        }
                    } else if (map2 != null && !map2.containsKey(TUAdConst.KEY.AD_CHOICES_PLACEMENT)) {
                        map2.put(TUAdConst.KEY.AD_CHOICES_PLACEMENT, 0);
                    }
                }
                iTUBaseAdAdapterO.parseGlobalParams(map, map2);
                iTUBaseAdAdapterO.setTrackingInfo(this.f41872n.getTrackingInfo());
            } catch (Throwable unused) {
            }
        }
        return iTUBaseAdAdapterO;
    }

    @Override // com.thinkup.core.api.ITUBaseAdAdapter
    public void loadCustomNetworkAd(Context context, Map<String, Object> map, Map<String, Object> map2, TUCustomLoadListener tUCustomLoadListener) {
        if (this.f41872n != null) {
            this.f41872n = o(map, map2);
            if (o()) {
                if (tUCustomLoadListener != null) {
                    tUCustomLoadListener.onAdLoadError("", this.oo);
                    return;
                }
                return;
            }
            ITUBaseAdAdapter iTUBaseAdAdapter = this.f41872n;
            if (iTUBaseAdAdapter == null || tUCustomLoadListener == null) {
                tUCustomLoadListener = null;
            } else {
                com.thinkup.core.common.mn.o0.m serverExtraInfo = iTUBaseAdAdapter.getServerExtraInfo();
                if (serverExtraInfo != null && serverExtraInfo.mn()) {
                    tUCustomLoadListener = new n(tUCustomLoadListener, serverExtraInfo);
                }
            }
            iTUBaseAdAdapter.setLoadListener(tUCustomLoadListener);
            this.f41872n.loadCustomNetworkAd(context, map, map2);
        }
    }

    private static void o(com.thinkup.core.common.mn.o0.m mVar, Map<String, Object> map, Map<String, Object> map2) {
        if (mVar.n0()) {
            int iIntValue = ((Integer) o00.o(map, "nw_firm_id", 0)).intValue();
            if (iIntValue == 39 && map2 != null) {
                Object obj = map2.get("huawei_request_custom_dislike");
                boolean zBooleanValue = obj instanceof Boolean ? ((Boolean) obj).booleanValue() : true;
                map2.put("huawei_request_custom_dislike", Boolean.valueOf(zBooleanValue));
                if (zBooleanValue && !map2.containsKey(TUAdConst.KEY.AD_CHOICES_PLACEMENT)) {
                    map2.put(TUAdConst.KEY.AD_CHOICES_PLACEMENT, 2);
                }
            }
            if (!mVar.on() || map == null) {
                if (!mVar.om() || iIntValue != 2 || map2 == null || map2.containsKey(TUAdConst.KEY.AD_CHOICES_PLACEMENT)) {
                    return;
                }
                map2.put(TUAdConst.KEY.AD_CHOICES_PLACEMENT, 2);
                return;
            }
            if (iIntValue == 2) {
                if (map2 == null || map2.containsKey(TUAdConst.KEY.AD_CHOICES_PLACEMENT)) {
                    return;
                }
                map2.put(TUAdConst.KEY.AD_CHOICES_PLACEMENT, 0);
                return;
            }
            if (iIntValue == 6) {
                if (map.containsKey("video_muted")) {
                    return;
                }
                map.put("video_muted", "0");
            } else {
                if (iIntValue != 8) {
                    if (iIntValue == 28 && !map.containsKey("video_sound")) {
                        map.put("video_sound", 0);
                        return;
                    }
                    return;
                }
                if (map.containsKey("video_muted")) {
                    return;
                }
                map.put("video_muted", "1");
            }
        }
    }
}
