package com.mbridge.msdk.newreward.function.command.receiver.tagreceiver;

import com.mbridge.apt_anotation.ReceiverAction;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.dycreator.baseview.cusview.SoundImageView;
import com.mbridge.msdk.foundation.controller.c;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.o0;
import com.mbridge.msdk.newreward.adapter.e;
import com.mbridge.msdk.newreward.function.command.receiver.b;
import com.mbridge.msdk.newreward.player.iview.IBaseWebView;
import com.mbridge.msdk.newreward.player.view.BaseTemplate;
import com.mbridge.msdk.newreward.player.view.ectemplate.BaseECTemplate;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Bj0;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C3203cn0;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C4363q1;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.EnumC2584Lw;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.N2;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.VN;
import java.lang.reflect.Method;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
@ReceiverAction(id = "OMSDKReceiver", type = b.class)
public class OMSDKReceiver implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    e f1673a;
    Object b;
    Object[] c;
    N2 d;
    C4363q1 e;
    VN f;
    float g = 0.0f;

    private void b() {
        try {
            o0.b("OMSDK_TAG", "onOMSdkCreate");
            e eVar = this.f1673a;
            if (eVar != null && eVar.g() != null && this.f1673a.g().b() != null) {
                List<CampaignEx> listB = this.f1673a.g().b();
                if (!listB.isEmpty() && listB.get(0) != null) {
                    CampaignEx campaignEx = listB.get(0);
                    if (campaignEx.isActiveOm()) {
                        N2 n2A = com.mbridge.msdk.omsdk.b.a(c.n().d(), false, campaignEx.getOmid(), campaignEx.getRequestId(), campaignEx.getId(), this.f1673a.R(), campaignEx.getVideoUrlEncode(), campaignEx.getRequestIdNotice());
                        this.d = n2A;
                        if (n2A != null) {
                            this.e = C4363q1.a(n2A);
                            this.f = VN.e(this.d);
                        }
                        this.f1673a.a(this.d);
                        this.f1673a.a(this.e);
                        this.f1673a.a(this.f);
                    }
                }
            }
        } catch (Throwable th) {
            if (MBridgeConstans.DEBUG) {
                th.printStackTrace();
            }
        }
    }

    private void c() {
        if (this.f == null) {
            return;
        }
        try {
            o0.b("OMSDK_TAG", "onOMSDKResume");
            this.f.h();
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                e.printStackTrace();
            }
        }
    }

    private void d() {
        if (this.f == null) {
            return;
        }
        try {
            o0.b("OMSDK_TAG", "onOMSdkBuffEnd");
            this.f.b();
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                e.printStackTrace();
            }
        }
    }

    private void e() {
        if (this.f == null) {
            return;
        }
        try {
            o0.b("OMSDK_TAG", "onOMSdkBuffStart");
            this.f.c();
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                e.printStackTrace();
            }
        }
    }

    private void f() {
        if (this.f == null) {
            return;
        }
        try {
            Object[] objArr = this.c;
            if (objArr != null && objArr.length > 0 && (objArr[0] instanceof Boolean)) {
                o0.b("OMSDK_TAG", "onOMSdkChangeVolume");
                if (((Boolean) this.c[0]).booleanValue()) {
                    this.f.l(0.0f);
                } else {
                    this.f.l(1.0f);
                }
            }
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                e.printStackTrace();
            }
        }
    }

    private void g() {
        if (this.f == null) {
            return;
        }
        try {
            o0.b("OMSDK_TAG", "onOMSdkClick");
            this.f.a();
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                e.printStackTrace();
            }
        }
    }

    private void h() {
        if (this.d != null) {
            try {
                o0.b("OMSDK_TAG", "onOMSdkDestory");
                this.d.e();
                this.d.c();
                this.d = null;
            } catch (Exception e) {
                if (MBridgeConstans.DEBUG) {
                    e.printStackTrace();
                }
            }
        }
    }

    private void i() {
        if (this.f == null) {
            return;
        }
        try {
            o0.b("OMSDK_TAG", "onOMSdkPause");
            C3203cn0 c3203cn0 = this.f.f3869a;
            AbstractC2995aW.c(c3203cn0);
            c3203cn0.e.c(CampaignEx.JSON_NATIVE_VIDEO_PAUSE, null);
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                e.printStackTrace();
            }
        }
    }

    private void j() {
        if (this.f == null) {
            return;
        }
        try {
            Object[] objArr = this.c;
            if (objArr != null && objArr.length == 2) {
                Object obj = objArr[0];
                if ((obj instanceof Integer) && (objArr[1] instanceof Integer)) {
                    int iIntValue = ((Integer) obj).intValue();
                    int iIntValue2 = ((Integer) this.c[1]).intValue();
                    if (iIntValue == 0) {
                        o0.b("OMSDK_TAG", "onOMSdkProgress 0");
                        this.f.j(iIntValue2, this.g);
                    } else if (iIntValue == 25) {
                        o0.b("OMSDK_TAG", "onOMSdkProgress 25");
                        this.f.f();
                    } else if (iIntValue == 50) {
                        o0.b("OMSDK_TAG", "onOMSdkProgress 50");
                        this.f.g();
                    } else if (iIntValue == 75) {
                        o0.b("OMSDK_TAG", "onOMSdkProgress 75");
                        this.f.k();
                    } else if (iIntValue == 100) {
                        o0.b("OMSDK_TAG", "onOMSdkProgress 100");
                        this.f.d();
                    }
                }
            }
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                e.printStackTrace();
            }
        }
    }

    private void k() {
        if (this.f == null) {
            return;
        }
        try {
            o0.b("OMSDK_TAG", "onOMSdkSkipped");
            this.f.i();
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                e.printStackTrace();
            }
        }
    }

    private void l() {
        e eVar = this.f1673a;
        if (eVar == null || this.d == null || eVar.k0()) {
            return;
        }
        try {
            o0.b("OMSDK_TAG", "onOMSdkStart");
            this.d.f();
            this.f1673a.o(true);
            C4363q1 c4363q1 = this.e;
            if (c4363q1 != null) {
                c4363q1.d(new Bj0());
                this.e.b();
            }
            Object obj = this.b;
            boolean z = obj instanceof BaseTemplate;
            EnumC2584Lw enumC2584Lw = EnumC2584Lw.f3380a;
            if (!z) {
                if (!(obj instanceof BaseECTemplate)) {
                    if (obj instanceof IBaseWebView) {
                        this.d.d(((IBaseWebView) obj).getWebView());
                        return;
                    }
                    return;
                }
                BaseECTemplate baseECTemplate = (BaseECTemplate) obj;
                this.d.d(baseECTemplate);
                if (baseECTemplate.getCloseView() != null) {
                    this.d.a(baseECTemplate.getCloseView(), enumC2584Lw);
                }
                if (baseECTemplate.getNoticeIV() != null) {
                    this.d.a(baseECTemplate.getNoticeIV(), enumC2584Lw);
                    return;
                }
                return;
            }
            BaseTemplate baseTemplate = (BaseTemplate) obj;
            if (baseTemplate.getmPlayerView() != null) {
                this.g = baseTemplate.getmPlayerView().getVolume();
                this.d.d(baseTemplate.getmPlayerView());
            }
            SoundImageView soundImageView = baseTemplate.getmSoundImageView();
            EnumC2584Lw enumC2584Lw2 = EnumC2584Lw.d;
            if (soundImageView != null) {
                this.d.a(baseTemplate.getmSoundImageView(), enumC2584Lw2);
            }
            if (baseTemplate.getmTvCountDown() != null) {
                this.d.a(baseTemplate.getmTvCountDown(), enumC2584Lw2);
            }
            if (baseTemplate.getmViewPlayingClose() != null) {
                this.d.a(baseTemplate.getmViewPlayingClose(), enumC2584Lw);
            }
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                e.printStackTrace();
            }
        }
    }

    @Override // com.mbridge.msdk.newreward.function.command.receiver.b
    public void a(Object obj) {
        try {
            if (obj instanceof Map) {
                Map map = (Map) obj;
                Method method = (Method) map.get("methodName");
                this.b = map.get("target");
                if (map.get("args") != null && (map.get("args") instanceof Object[])) {
                    this.c = (Object[]) map.get("args");
                }
                e eVar = (e) map.get("adapter_model");
                this.f1673a = eVar;
                this.d = eVar.c();
                this.e = this.f1673a.a();
                this.f = this.f1673a.S();
                a(method.getName());
            }
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                e.printStackTrace();
            }
        }
    }

    private void a(String str) {
        str.getClass();
        switch (str) {
            case "setMuteState":
                f();
                return;
            case "resume":
                c();
                return;
            case "initViews":
                l();
                return;
            case "pause":
                i();
                return;
            case "onAdClick":
                g();
                return;
            case "onBufferingEnd":
                d();
                return;
            case "checkOMSdkProgress":
                break;
            case "activityReport":
                a();
                return;
            case "onBufferingStart":
                e();
                return;
            case "skipped":
                k();
                break;
            default:
                return;
        }
        j();
    }

    private void a() {
        try {
            Object[] objArr = this.c;
            if (objArr == null || objArr.length <= 0) {
                return;
            }
            Object obj = objArr[0];
            if (obj instanceof String) {
                String str = (String) obj;
                if (str.equals("onCreate")) {
                    b();
                }
                if (str.equals("onDestroy")) {
                    h();
                }
            }
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                e.printStackTrace();
            }
        }
    }
}
