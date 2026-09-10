package com.thinkup.splashad.o;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.widget.Toast;
import com.smartdigimkt.v0.k;
import com.thinkup.core.api.AdError;
import com.thinkup.core.api.TUAdStatusInfo;
import com.thinkup.core.api.TUNetworkConfirmInfo;
import com.thinkup.core.common.n.mn;
import com.thinkup.core.common.n.mo;
import com.thinkup.core.common.n.o0n;
import com.thinkup.core.common.on.mmm;
import com.thinkup.core.common.on.n0;
import com.thinkup.core.common.on.o0mm;
import com.thinkup.core.common.on.on;
import com.thinkup.core.common.oo0.m0;
import com.thinkup.core.common.ooo;
import com.thinkup.core.common.ooo.m0m;
import com.thinkup.core.common.ooo.moo;
import com.thinkup.core.common.ooo.o00;
import com.thinkup.core.common.ooo.omn;
import com.thinkup.splashad.api.ITUSplashEyeAd;
import com.thinkup.splashad.api.TUSplashAdExtraInfo;
import com.thinkup.splashad.api.TUSplashSkipAdListener;
import com.thinkup.splashad.api.TUSplashSkipInfo;
import com.thinkup.splashad.unitgroup.api.CustomSplashAdapter;
import com.thinkup.splashad.unitgroup.api.CustomSplashEventListener;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;

/* JADX INFO: loaded from: classes6.dex */
public final class om implements CustomSplashEventListener {
    private static final int mm = 1;
    private static final int mn = 2;
    private static final String om = "thinkup_s_m_i";
    o m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    boolean f42657n;
    CustomSplashAdapter o;
    long o0;
    private Timer oo;
    private boolean on = false;
    private int m0 = 0;
    private final List<Integer> mo = Arrays.asList(8, 15, 22, 28);
    private Handler n0 = null;

    /* JADX INFO: renamed from: com.thinkup.splashad.o.om$3, reason: invalid class name */
    public class AnonymousClass3 extends TimerTask {
        final /* synthetic */ com.thinkup.core.common.ooo.o.om.m m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ TUSplashSkipAdListener f42658n;
        final /* synthetic */ ViewGroup o;
        final /* synthetic */ long o0;
        final /* synthetic */ long oo;

        public AnonymousClass3(ViewGroup viewGroup, com.thinkup.core.common.ooo.o.om.m mVar, TUSplashSkipAdListener tUSplashSkipAdListener, long j, long j2) {
            this.o = viewGroup;
            this.m = mVar;
            this.f42658n = tUSplashSkipAdListener;
            this.o0 = j;
            this.oo = j2;
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public final void run() {
            ViewGroup viewGroup = this.o;
            if (viewGroup == null || moo.o(viewGroup, this.m)) {
                o0n.m().m(new Runnable() { // from class: com.thinkup.splashad.o.om.3.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        AnonymousClass3 anonymousClass3 = AnonymousClass3.this;
                        om omVar = om.this;
                        long j = omVar.o0;
                        if (j <= 0) {
                            omVar.o(3);
                            om.this.onSplashAdDismiss();
                        } else {
                            TUSplashSkipAdListener tUSplashSkipAdListener = anonymousClass3.f42658n;
                            if (tUSplashSkipAdListener != null) {
                                tUSplashSkipAdListener.onAdTick(anonymousClass3.o0, j);
                            }
                        }
                        AnonymousClass3 anonymousClass4 = AnonymousClass3.this;
                        om.this.o0 -= anonymousClass4.oo;
                    }
                });
            }
        }
    }

    /* JADX INFO: renamed from: com.thinkup.splashad.o.om$4, reason: invalid class name */
    public class AnonymousClass4 implements Runnable {
        final /* synthetic */ long m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ long f42659n;
        final /* synthetic */ TUSplashSkipAdListener o;

        public AnonymousClass4(TUSplashSkipAdListener tUSplashSkipAdListener, long j, long j2) {
            this.o = tUSplashSkipAdListener;
            this.m = j;
            this.f42659n = j2;
        }

        @Override // java.lang.Runnable
        public final void run() {
            TUSplashSkipAdListener tUSplashSkipAdListener = this.o;
            if (tUSplashSkipAdListener != null) {
                tUSplashSkipAdListener.onAdTick(this.m, om.this.o0);
                om.this.o0 -= this.f42659n;
            }
        }
    }

    public om(CustomSplashAdapter customSplashAdapter, o oVar) {
        this.o = customSplashAdapter;
        this.m = oVar;
    }

    private void m() {
        Timer timer = this.oo;
        if (timer != null) {
            timer.cancel();
            this.oo = null;
        }
    }

    private o0mm o() {
        CustomSplashAdapter customSplashAdapter = this.o;
        if (customSplashAdapter == null) {
            return null;
        }
        boolean zIsMixInterstitial = customSplashAdapter.isMixInterstitial();
        omn.m(om, "onSplashAdShow:mixInterstitial:".concat(String.valueOf(zIsMixInterstitial)));
        o0mm unitGroupInfo = this.o.getUnitGroupInfo();
        if (!zIsMixInterstitial || unitGroupInfo == null) {
            return null;
        }
        int iOn = unitGroupInfo.on();
        int iNm = unitGroupInfo.nm();
        omn.m(om, "onSplashAdShow:networkFirmId:" + iNm + ":" + iOn);
        if (iOn == 1 && this.mo.contains(Integer.valueOf(iNm))) {
            return unitGroupInfo;
        }
        return null;
    }

    @Override // com.thinkup.splashad.unitgroup.api.CustomSplashEventListener
    public final void onDeeplinkCallback(boolean z2) {
        o oVar = this.m;
        if (oVar != null) {
            oVar.onDeeplinkCallback(mn.o(this.o), z2);
        }
        CustomSplashAdapter customSplashAdapter = this.o;
        if (customSplashAdapter != null) {
            omn.o(customSplashAdapter.getTrackingInfo(), mo.o0m.mm, z2 ? mo.o0m.no : mo.o0m.nm, "");
        }
    }

    @Override // com.thinkup.splashad.unitgroup.api.CustomSplashEventListener
    public final void onDownloadConfirm(Context context, TUNetworkConfirmInfo tUNetworkConfirmInfo) {
        o oVar = this.m;
        if (oVar != null) {
            oVar.onDownloadConfirm(context, mn.o(this.o), tUNetworkConfirmInfo);
        }
        CustomSplashAdapter customSplashAdapter = this.o;
        if (customSplashAdapter != null) {
            omn.o(customSplashAdapter.getTrackingInfo(), mo.o0m.mn, mo.o0m.no, "");
        }
    }

    @Override // com.thinkup.splashad.unitgroup.api.CustomSplashEventListener
    public final void onSplashAdClicked() {
        CustomSplashAdapter customSplashAdapter = this.o;
        if (customSplashAdapter != null) {
            n0 trackingInfo = customSplashAdapter.getTrackingInfo();
            m0m.n(trackingInfo, this.o);
            com.thinkup.core.common.oo0.n.o(o0n.m().on()).o(6, trackingInfo);
            if (trackingInfo != null ? trackingInfo.o0no() : false) {
                return;
            } else {
                omn.o(trackingInfo, mo.o0m.o0, mo.o0m.no, "");
            }
        }
        com.thinkup.core.common.ooo.n.o().m(this.o);
        o oVar = this.m;
        if (oVar != null) {
            oVar.onAdClick(mn.o(this.o));
        }
        o0mm o0mmVarO = o();
        if (o0mmVarO == null || o0mmVarO.om() != 1) {
            return;
        }
        o(2, 0L);
    }

    @Override // com.thinkup.splashad.unitgroup.api.CustomSplashEventListener
    public final void onSplashAdDismiss() {
        boolean zBooleanValue;
        omn.m(om, "onSplashAdDismiss");
        Timer timer = this.oo;
        if (timer != null) {
            timer.cancel();
        }
        Handler handler = this.n0;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            this.n0 = null;
        }
        CustomSplashAdapter customSplashAdapter = this.o;
        if (customSplashAdapter != null) {
            n0 trackingInfo = customSplashAdapter.getTrackingInfo();
            int dismissType = this.m0;
            if (dismissType != 0) {
                trackingInfo.moo(dismissType);
            } else {
                dismissType = this.o.getDismissType();
                if (dismissType == 0) {
                    dismissType = 1;
                }
                trackingInfo.moo(dismissType);
            }
            Map<String, Object> adExtraInfoMap = this.o.getAdExtraInfoMap();
            if (adExtraInfoMap != null) {
                Object objRemove = adExtraInfoMap.remove("close_scene");
                Object objRemove2 = adExtraInfoMap.remove("cb_to_developer");
                if (objRemove instanceof Integer) {
                    trackingInfo.mno(((Integer) objRemove).intValue());
                }
                zBooleanValue = objRemove2 instanceof Boolean ? ((Boolean) objRemove2).booleanValue() : true;
                Object objRemove3 = adExtraInfoMap.remove("splash_close_video_ctn_to_play");
                Object objRemove4 = adExtraInfoMap.remove("splash_close_show_end_card");
                if (objRemove3 instanceof Integer) {
                    trackingInfo.mnm(((Integer) objRemove3).intValue());
                } else {
                    trackingInfo.mnm(2);
                }
                if (objRemove4 instanceof Integer) {
                    trackingInfo.mnn(((Integer) objRemove4).intValue());
                } else {
                    trackingInfo.mnn(2);
                }
            } else {
                zBooleanValue = true;
            }
            com.thinkup.core.common.oo0.oo.o(trackingInfo, false);
            TUSplashSkipInfo splashSkipInfo = this.o.getSplashSkipInfo();
            if (splashSkipInfo != null && splashSkipInfo.canUseCustomSkipView()) {
                this.o.startSplashCustomSkipViewClickEye();
                Timer timer2 = this.oo;
                if (timer2 != null) {
                    timer2.cancel();
                    this.oo = null;
                }
                splashSkipInfo.destroy();
                this.o.setSplashSkipInfo(null);
            }
            omn.o(trackingInfo, mo.o0m.oo, mo.o0m.no, "");
            o(trackingInfo.oomn());
            ITUSplashEyeAd splashEyeAd = this.o != null ? this.o.getSplashEyeAd() : null;
            if (this.m != null && !this.on) {
                this.on = true;
                if (trackingInfo.n0n() != 66 || zBooleanValue) {
                    this.m.onCallbackAdDismiss(mn.o(trackingInfo, this.o), new TUSplashAdExtraInfo(dismissType, splashEyeAd));
                }
            }
            if (splashEyeAd == null) {
                CustomSplashAdapter customSplashAdapter2 = this.o;
                if (customSplashAdapter2 != null) {
                    customSplashAdapter2.cleanImpressionListener();
                }
                if (this.o != null) {
                    com.thinkup.core.common.ooo.o0.o().o0(this.o);
                    this.o.internalDestory();
                }
            }
            o(trackingInfo.oomn(), 18);
        }
    }

    @Override // com.thinkup.splashad.unitgroup.api.CustomSplashEventListener
    public final void onSplashAdShow() {
        om omVar = this;
        if ((omVar.o == null || (com.thinkup.core.common.ooo.o0.o().o(omVar.o) && com.thinkup.core.common.ooo.o0.o().m(omVar.o))) && !omVar.f42657n) {
            omVar.f42657n = true;
            com.thinkup.core.common.ooo.n.o().o(omVar.o);
            mn mnVarO = mn.o(omVar.o);
            CustomSplashAdapter customSplashAdapter = omVar.o;
            if (customSplashAdapter != null) {
                final n0 trackingInfo = customSplashAdapter.getTrackingInfo();
                trackingInfo.o(omVar.o.getInternalNetworkInfoMap());
                com.thinkup.core.common.ooo.o0.o().o(trackingInfo, omVar.o.getUnitGroupInfo(), 6);
                com.thinkup.core.common.ooo.o0.o().o(omVar.o, new com.thinkup.core.common.ooo.o0.o() { // from class: com.thinkup.splashad.o.om.2
                    @Override // com.thinkup.core.common.ooo.o0.o
                    public final void m() {
                    }

                    @Override // com.thinkup.core.common.ooo.o0.o
                    public final void o() {
                        m0m.m(trackingInfo, om.this.o);
                        com.thinkup.core.common.oo0.n.o(o0n.m().on()).o(4, trackingInfo, om.this.o.getUnitGroupInfo());
                    }
                });
                omn.o(trackingInfo, mo.o0m.f41901n, mo.o0m.no, "");
                TUSplashSkipInfo splashSkipInfo = omVar.o.getSplashSkipInfo();
                if (splashSkipInfo != null && splashSkipInfo.canUseCustomSkipView() && omVar.o.isSupportCustomSkipView() && omVar.oo == null) {
                    long callbackInterval = splashSkipInfo.getCallbackInterval();
                    long countDownDuration = splashSkipInfo.getCountDownDuration();
                    ViewGroup container = splashSkipInfo.getContainer();
                    com.thinkup.core.common.ooo.o.om.m mVar = new com.thinkup.core.common.ooo.o.om.m(1);
                    TUSplashSkipAdListener tUSplashSkipAdListener = splashSkipInfo.getTUSplashSkipAdListener();
                    omVar.o0 = countDownDuration;
                    Timer timer = new Timer();
                    omVar.oo = timer;
                    timer.schedule(omVar.new AnonymousClass3(container, mVar, tUSplashSkipAdListener, countDownDuration, callbackInterval), callbackInterval, callbackInterval);
                    omVar = this;
                    o0n.m().m(omVar.new AnonymousClass4(tUSplashSkipAdListener, countDownDuration, callbackInterval));
                }
                ooo.o().o(trackingInfo.oomn(), mnVarO);
                o(trackingInfo.oomn(), 6);
            }
            if (omVar.m != null) {
                if (mnVarO.getNetworkFirmId() == -1) {
                    m0.o("Splash", omVar.o, null);
                }
                omVar.m.onAdShow(mnVarO);
            }
            o0mm o0mmVarO = omVar.o();
            if (o0mmVarO == null || o0mmVarO.m0() <= 0) {
                return;
            }
            omVar.o(1, o0mmVarO.m0());
        }
    }

    @Override // com.thinkup.splashad.unitgroup.api.CustomSplashEventListener
    public final void onSplashAdShowFail(AdError adError) {
        String strOomn;
        CustomSplashAdapter customSplashAdapter = this.o;
        if (customSplashAdapter != null) {
            n0 trackingInfo = customSplashAdapter.getTrackingInfo();
            com.thinkup.core.common.oo0.oo.o(trackingInfo, adError, this.o.getInternalNetworkInfoMap());
            if (trackingInfo != null) {
                strOomn = trackingInfo.oomn();
                o(trackingInfo.oomn());
            } else {
                strOomn = "";
            }
            o(strOomn, 7);
            omn.o(trackingInfo, mo.o0m.n0, mo.o0m.nm, adError != null ? adError.getFullErrorInfo() : "");
        }
    }

    private void o(int i2, long j) {
        if (this.n0 == null) {
            this.n0 = new Handler(Looper.getMainLooper()) { // from class: com.thinkup.splashad.o.om.1
                @Override // android.os.Handler
                public final void handleMessage(Message message) {
                    if (message != null) {
                        try {
                            CustomSplashAdapter customSplashAdapter = om.this.o;
                            if (customSplashAdapter != null) {
                                String strCloseAd = customSplashAdapter.closeAd();
                                if (TextUtils.isEmpty(strCloseAd)) {
                                    omn.m(om.om, "onSplashAdShow:0x001:close:success");
                                } else {
                                    omn.m(om.om, "onSplashAdShow:0x001:close is exception:".concat(String.valueOf(strCloseAd)));
                                    com.thinkup.core.common.oo0.oo.o(String.valueOf(message.arg1), om.this.o.getTrackingInfo(), o0n.m().n0m(), strCloseAd);
                                }
                            }
                        } catch (Throwable unused) {
                        }
                    }
                }
            };
        }
        if (i2 != 1) {
            if (i2 == 2) {
                Message messageObtain = Message.obtain();
                messageObtain.what = 2;
                messageObtain.arg1 = 2;
                this.n0.sendMessage(messageObtain);
                return;
            }
            return;
        }
        Message messageObtain2 = Message.obtain();
        messageObtain2.what = 1;
        messageObtain2.arg1 = 1;
        this.n0.sendMessageDelayed(messageObtain2, j);
        Context contextOn = o0n.m().on();
        if (contextOn != null) {
            try {
                String string = contextOn.getString(o00.o(contextOn, "splash_mix_inter_will_close", k.f38992h));
                if (TextUtils.isEmpty(string)) {
                    return;
                }
                Toast.makeText(contextOn, string.replace("_SEC_", String.valueOf(j / 1000)), 0).show();
            } catch (Throwable unused) {
            }
        }
    }

    private void o(TUSplashSkipInfo tUSplashSkipInfo) {
        if (this.oo == null) {
            long callbackInterval = tUSplashSkipInfo.getCallbackInterval();
            long countDownDuration = tUSplashSkipInfo.getCountDownDuration();
            ViewGroup container = tUSplashSkipInfo.getContainer();
            com.thinkup.core.common.ooo.o.om.m mVar = new com.thinkup.core.common.ooo.o.om.m(1);
            TUSplashSkipAdListener tUSplashSkipAdListener = tUSplashSkipInfo.getTUSplashSkipAdListener();
            this.o0 = countDownDuration;
            Timer timer = new Timer();
            this.oo = timer;
            timer.schedule(new AnonymousClass3(container, mVar, tUSplashSkipAdListener, countDownDuration, callbackInterval), callbackInterval, callbackInterval);
            o0n.m().m(new AnonymousClass4(tUSplashSkipAdListener, countDownDuration, callbackInterval));
        }
    }

    public final void o(int i2) {
        this.m0 = i2;
    }

    private static void o(String str) {
        on onVarN;
        if (TextUtils.isEmpty(str) || (onVarN = ooo.o().n(str)) == null) {
            return;
        }
        ooo.o().o0(str);
        com.thinkup.core.common.om.o(o0n.m().on(), str, "4").n(ooo.o().m(str, onVarN.o()));
    }

    private static void o(String str, int i2) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        com.thinkup.core.common.om omVarO = com.thinkup.core.common.om.o(o0n.m().mm0(), str, "4");
        if (omVarO.o((TUAdStatusInfo) null, i2)) {
            mmm mmmVar = new mmm();
            mmmVar.o(o0n.m().mm0());
            mmmVar.f42198n = i2;
            omVarO.m(o0n.m().mm0(), "4", str, mmmVar, null);
        }
    }
}
