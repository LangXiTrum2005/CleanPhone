package com.smartdigimkt.expressad.video.bt.module;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Handler;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Base64;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.RelativeLayout;
import com.smartdigimkt.expressad.atsignalcommon.windvane.BaseAbsFeedBackForH5;
import com.smartdigimkt.expressad.atsignalcommon.windvane.WindVaneWebView;
import com.smartdigimkt.expressad.video.module.AnythinkContainerView;
import com.smartdigimkt.expressad.video.module.AnythinkVideoView;
import com.smartdigimkt.expressad.video.signal.container.AbstractJSContainer;
import com.smartdigimkt.v0.v;
import com.smartdigimkt.x.t;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public class ATTempContainer extends AbstractJSContainer {
    private static final int A1 = -3;
    private static final int B1 = -4;
    private static final int C1 = 250;
    private static final String s1 = "ATTempContainer";
    protected static final int t1 = 0;
    private static final long u1 = 5000;
    private static final long v1 = 2000;
    private static final long w1 = 100;
    private static final int x1 = -1;
    private static final int y1 = -2;
    private static final int z1 = -3;
    private com.smartdigimkt.a2.b A0;
    private com.smartdigimkt.i2.a B0;
    private int C0;
    private String D0;
    private com.smartdigimkt.y2.b E0;
    private int F0;
    private int G0;
    private boolean H0;
    private int I0;
    private int J0;
    private int K0;
    private int L0;
    private int M0;
    private String N0;
    private String O0;
    private List<com.smartdigimkt.x.d> P0;
    private int Q0;
    private com.smartdigimkt.s2.a R0;
    protected boolean S0;
    private LayoutInflater T0;
    protected boolean U0;
    protected i V0;
    protected WindVaneWebView W0;
    protected AnythinkContainerView X0;
    protected Handler Y0;
    private int Z0;
    private int a1;
    private int b1;
    protected Runnable c1;
    protected Runnable d1;
    private View e1;
    private boolean f1;
    private boolean g1;
    private boolean h1;
    private boolean i1;
    private boolean j1;
    private boolean k1;
    private boolean l1;
    private boolean m1;
    public AnythinkVideoView mbridgeVideoView;
    private boolean n1;
    private boolean o1;
    private com.smartdigimkt.s4.c p1;
    private Runnable q1;
    com.smartdigimkt.i1.c r1;
    private View w0;
    private com.smartdigimkt.x.d x0;
    private com.smartdigimkt.c3.c y0;
    private com.smartdigimkt.b2.h z0;

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (ATTempContainer.this.getActivityProxy().a() != 0) {
                ATTempContainer.this.Z0 = -3;
            } else {
                Log.d(ATTempContainer.s1, "run: WebView load timeout");
                ATTempContainer.this.defaultLoad(-1, "WebView load timeout");
            }
        }
    }

    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (ATTempContainer.this.getActivityProxy().a() == 0) {
                ATTempContainer.this.defaultLoad(-3, "JS bridge connect timeout");
            } else {
                ATTempContainer.this.Z0 = -4;
            }
        }
    }

    public class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (ATTempContainer.this.e1 != null) {
                ATTempContainer.this.e1.setVisibility(8);
            }
        }
    }

    public class d implements Runnable {
        public d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (((AbstractJSContainer) ATTempContainer.this).g0 != null) {
                ((AbstractJSContainer) ATTempContainer.this).g0.finish();
            }
        }
    }

    public class f implements com.smartdigimkt.s4.c.b {
        public f() {
        }

        @Override // com.smartdigimkt.s4.c.b
        public void a(double d) {
            AnythinkContainerView anythinkContainerView;
            String unused = ATTempContainer.s1;
            try {
                if (!ATTempContainer.this.x0.K2() || (anythinkContainerView = ATTempContainer.this.X0) == null || anythinkContainerView.getH5EndCardView() == null) {
                    return;
                }
                ATTempContainer.this.X0.getH5EndCardView().volumeChange(d);
            } catch (Exception e2) {
                String unused2 = ATTempContainer.s1;
                e2.getMessage();
            }
        }
    }

    public class g implements Runnable {
        public g() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ATTempContainer.this.e1.setBackgroundColor(0);
            ATTempContainer.this.e1.setVisibility(0);
            ATTempContainer.this.e1.bringToFront();
        }
    }

    public class h implements Runnable {
        public h() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ATTempContainer.this.e1.setVisibility(8);
        }
    }

    public interface i {

        public static class a implements i {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private static final String f34751b = "ActivityErrorListener";

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private boolean f34752a = false;

            @Override // com.smartdigimkt.expressad.video.bt.module.ATTempContainer.i
            public void a(String str) {
                this.f34752a = true;
            }

            @Override // com.smartdigimkt.expressad.video.bt.module.ATTempContainer.i
            public boolean a() {
                return this.f34752a;
            }

            @Override // com.smartdigimkt.expressad.video.bt.module.ATTempContainer.i
            public void a(boolean z2) {
                this.f34752a = z2;
            }
        }

        void a(String str);

        void a(boolean z2);

        boolean a();
    }

    public final class k extends com.smartdigimkt.u2.f {
        private Activity W;
        private com.smartdigimkt.x.d X;

        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                ATTempContainer.this.onAdClose();
            }
        }

        public k(Activity activity, com.smartdigimkt.x.d dVar) {
            this.W = activity;
            this.X = dVar;
        }

        @Override // com.smartdigimkt.u2.f, com.smartdigimkt.t2.a
        public void a(int i2, Object obj) {
            Context context = ATTempContainer.this.getContext();
            if (context != null && context != context.getApplicationContext()) {
                ATTempContainer.this.getJSCommon().a(context);
            }
            if (this.W != null) {
                ATTempContainer.this.getJSCommon().setActivity(this.W);
            }
            ATTempContainer.this.m1 = true;
            if (i2 == 108) {
                ATTempContainer.this.getJSCommon().a(new com.smartdigimkt.z2.c.b(ATTempContainer.this.getJSCommon(), new m(ATTempContainer.this, null)));
                ATTempContainer.this.getJSCommon().click(1, obj != null ? obj.toString() : "");
            } else if (i2 == 113) {
                ATTempContainer.this.z0.onVideoAdClicked(this.X);
                com.smartdigimkt.i1.c cVar = ATTempContainer.this.r1;
                if (cVar != null) {
                    cVar.a();
                }
            } else if (i2 == 117) {
                AnythinkVideoView anythinkVideoView = ATTempContainer.this.mbridgeVideoView;
                if (anythinkVideoView != null) {
                    anythinkVideoView.setVisible(4);
                }
                ATTempContainer.this.m1 = true;
                ATTempContainer.this.z0.onEndcardShow();
                com.smartdigimkt.i1.c cVar2 = ATTempContainer.this.r1;
                if (cVar2 != null) {
                    cVar2.c();
                }
            } else if (i2 == 126 || i2 == 128) {
                ATTempContainer.this.z0.onVideoAdClicked(this.X);
                com.smartdigimkt.i1.c cVar3 = ATTempContainer.this.r1;
                if (cVar3 != null) {
                    cVar3.a();
                }
            } else if (i2 != 131) {
                switch (i2) {
                    case 103:
                    case 104:
                        ATTempContainer.this.onAdClose();
                        break;
                    case 105:
                        ATTempContainer.this.getJSCommon().click(1, obj != null ? obj.toString() : "");
                        break;
                    case 106:
                        if (ATTempContainer.this.A0 != null) {
                            ATTempContainer.this.A0.a(ATTempContainer.this.D0, this.X);
                        } else {
                            ATTempContainer.this.z0.onVideoAdClicked(this.X);
                        }
                        com.smartdigimkt.i1.c cVar4 = ATTempContainer.this.r1;
                        if (cVar4 != null) {
                            cVar4.a();
                        }
                        if (this.W != null && this.X != null) {
                            com.smartdigimkt.l7.b.a().b((Runnable) new a(), 50L);
                        }
                        break;
                }
            } else {
                ATTempContainer.this.z0.onVideoAdClicked(this.X);
            }
            super.a(i2, obj);
        }
    }

    public final class l extends com.smartdigimkt.u2.f {
        private l() {
        }

        @Override // com.smartdigimkt.u2.f, com.smartdigimkt.t2.a
        public void a(int i2, Object obj) {
            super.a(i2, obj);
            try {
                String string = obj instanceof JSONObject ? obj.toString() : (String) obj;
                if (((AbstractJSContainer) ATTempContainer.this).o0 && !TextUtils.isEmpty(string)) {
                    JSONObject jSONObject = new JSONObject(string);
                    int iOptInt = jSONObject.optInt("type");
                    int iOptInt2 = jSONObject.optInt("complete");
                    if (iOptInt == 2) {
                        ATTempContainer.this.F0 = com.smartdigimkt.b0.a.B2;
                    } else if (iOptInt != 3) {
                        ATTempContainer.this.F0 = com.smartdigimkt.b0.a.z2;
                    } else {
                        ATTempContainer.this.F0 = com.smartdigimkt.b0.a.A2;
                    }
                    ATTempContainer.this.G0 = iOptInt2;
                }
            } catch (Exception unused) {
            }
            if (i2 == 120) {
                ATTempContainer.this.z0.onEndcardShow();
                com.smartdigimkt.i1.c cVar = ATTempContainer.this.r1;
                if (cVar != null) {
                    cVar.c();
                }
                return;
            }
            if (i2 == 126) {
                ATTempContainer.this.z0.onVideoAdClicked(ATTempContainer.this.x0);
                com.smartdigimkt.i1.c cVar2 = ATTempContainer.this.r1;
                if (cVar2 != null) {
                    cVar2.a();
                    return;
                }
                return;
            }
            if (i2 == 127) {
                ATTempContainer.this.g1 = true;
                ATTempContainer.this.z0.onAdShow();
                ATTempContainer.this.z0.onEndcardShow();
                com.smartdigimkt.i1.c cVar3 = ATTempContainer.this.r1;
                if (cVar3 != null) {
                    cVar3.c();
                }
                ATTempContainer.this.getJSContainerModule().showEndcard(100);
                return;
            }
            switch (i2) {
                case 100:
                    ATTempContainer.this.n1 = true;
                    ATTempContainer aTTempContainer = ATTempContainer.this;
                    aTTempContainer.Y0.postDelayed(aTTempContainer.q1, 250L);
                    ATTempContainer.this.z0.onAdShow();
                    break;
                case 101:
                case 102:
                    ATTempContainer.this.getJSCommon().a();
                    break;
                case 103:
                    ATTempContainer.this.g1 = true;
                    if (!ATTempContainer.this.x0.K2()) {
                        ATTempContainer.this.getJSCommon().a();
                    } else {
                        ATTempContainer.this.onAdClose();
                    }
                    break;
                case 104:
                    ATTempContainer.this.onAdClose();
                    break;
                case 105:
                    ATTempContainer.this.getJSCommon().click(1, obj != null ? obj.toString() : "");
                    break;
            }
        }

        public /* synthetic */ l(ATTempContainer aTTempContainer, a aVar) {
            this();
        }
    }

    public class m extends com.smartdigimkt.z2.c.a {
        private m() {
        }

        @Override // com.smartdigimkt.z2.c.a, com.smartdigimkt.x2.c.a
        public void a() {
            super.a();
            ATTempContainer.this.receiveSuccess();
        }

        @Override // com.smartdigimkt.z2.c.a, com.smartdigimkt.x2.c.a
        public void b() {
            super.b();
            ATTempContainer aTTempContainer = ATTempContainer.this;
            Handler handler = aTTempContainer.Y0;
            if (handler != null) {
                handler.removeCallbacks(aTTempContainer.c1);
            }
        }

        @Override // com.smartdigimkt.z2.c.a, com.smartdigimkt.f1.q.c
        public void onFinishRedirection(com.smartdigimkt.f1.k kVar, String str) {
            super.onFinishRedirection(kVar, str);
            ATTempContainer.this.k1 = true;
            ATTempContainer.this.o();
            if (kVar == null || !(kVar instanceof com.smartdigimkt.x.d)) {
                return;
            }
            try {
                com.smartdigimkt.x.d dVar = (com.smartdigimkt.x.d) kVar;
                String strOptString = new JSONObject(ATTempContainer.this.getJSVideoModule().getCurrentProgress()).optString("progress", "");
                if (dVar.e1() == 3 && dVar.y0() == 2 && strOptString.equals("1.0") && ((AbstractJSContainer) ATTempContainer.this).g0 != null) {
                    if (((AbstractJSContainer) ATTempContainer.this).t0) {
                        ATTempContainer.this.onAdClose();
                    } else {
                        ((AbstractJSContainer) ATTempContainer.this).g0.finish();
                    }
                }
            } catch (JSONException e2) {
                e2.printStackTrace();
            }
        }

        @Override // com.smartdigimkt.z2.c.a, com.smartdigimkt.f1.q.c
        public void onRedirectionFailed(com.smartdigimkt.f1.k kVar, String str) {
            super.onRedirectionFailed(kVar, str);
            ATTempContainer.this.o();
            ATTempContainer.this.k1 = true;
        }

        public /* synthetic */ m(ATTempContainer aTTempContainer, a aVar) {
            this();
        }

        @Override // com.smartdigimkt.z2.c.a, com.smartdigimkt.f1.q.c
        public void a(com.smartdigimkt.x.d dVar, String str) {
            super.a(dVar, str);
            ATTempContainer.this.y();
        }

        @Override // com.smartdigimkt.z2.c.a, com.smartdigimkt.x2.c.a
        public void a(com.smartdigimkt.x.d dVar, boolean z2) {
            super.a(dVar, z2);
            ATTempContainer.this.z0.onVideoAdClicked(dVar);
            com.smartdigimkt.i1.c cVar = ATTempContainer.this.r1;
            if (cVar != null) {
                cVar.a();
            }
        }

        @Override // com.smartdigimkt.z2.c.a, com.smartdigimkt.x2.c.a
        public void a(int i2, String str) {
            super.a(i2, str);
            ATTempContainer.this.defaultLoad(i2, str);
        }
    }

    public final class n extends com.smartdigimkt.u2.f {
        private n() {
        }

        @Override // com.smartdigimkt.u2.f, com.smartdigimkt.t2.a
        public void a(int i2, Object obj) {
            super.a(i2, obj);
            if (((AbstractJSContainer) ATTempContainer.this).o0) {
                try {
                    if (obj instanceof String) {
                        String str = (String) obj;
                        if (!TextUtils.isEmpty(str)) {
                            JSONObject jSONObject = new JSONObject(str);
                            ATTempContainer.this.F0 = jSONObject.getInt("Alert_window_status");
                            ATTempContainer.this.G0 = jSONObject.getInt("complete_info");
                        }
                    }
                } catch (Exception e2) {
                    e2.getMessage();
                }
            }
            if (i2 != 2) {
                if (i2 == 121) {
                    ATTempContainer.this.g1 = true;
                    ATTempContainer.this.z0.onVideoComplete();
                    ATTempContainer.this.l1 = false;
                    return;
                }
                if (i2 == 16) {
                    ATTempContainer.this.onAdClose();
                    return;
                }
                if (i2 == 17) {
                    ATTempContainer.this.g1 = true;
                    AnythinkContainerView anythinkContainerView = ATTempContainer.this.X0;
                    if (anythinkContainerView != null) {
                        anythinkContainerView.setRewardStatus(true);
                        return;
                    }
                    return;
                }
                switch (i2) {
                    case 10:
                        ATTempContainer.this.l1 = true;
                        if (ATTempContainer.this.x0 != null) {
                            if (!ATTempContainer.this.x0.H2()) {
                                ATTempContainer.this.z0.onAdShow();
                            } else if (!((AbstractJSContainer) ATTempContainer.this).t0) {
                                ATTempContainer.this.z0.onAdShow();
                            } else if (ATTempContainer.this.x0.G2()) {
                                ATTempContainer.this.z0.onAdShow();
                            }
                        }
                        break;
                }
            }
            if (i2 == 12) {
                try {
                    if (obj instanceof String) {
                        obj.getClass();
                    }
                } catch (Throwable th) {
                    th.getMessage();
                }
                if (!ATTempContainer.this.l1) {
                    if (((AbstractJSContainer) ATTempContainer.this).j0.W() == 0) {
                        ATTempContainer.this.z0.onShowFail("play error");
                        ATTempContainer.this.l1 = false;
                        ATTempContainer.this.onAdClose();
                        return;
                    } else if (ATTempContainer.this.x0 == null || !ATTempContainer.this.x0.H2() || !((AbstractJSContainer) ATTempContainer.this).t0 || ATTempContainer.this.x0.G2()) {
                        ATTempContainer.this.z0.onAdShow();
                    }
                }
            }
            ATTempContainer.this.getJSVideoModule().videoOperate(3);
            ATTempContainer.this.l1 = false;
        }

        public /* synthetic */ n(ATTempContainer aTTempContainer, a aVar) {
            this();
        }
    }

    public ATTempContainer(Context context) {
        super(context);
        this.C0 = 1;
        this.D0 = "";
        this.F0 = com.smartdigimkt.b0.a.z2;
        this.H0 = false;
        this.N0 = "";
        this.P0 = new ArrayList();
        this.Q0 = 0;
        this.S0 = false;
        this.U0 = false;
        this.V0 = new i.a();
        this.Y0 = new Handler();
        this.Z0 = 0;
        this.a1 = 0;
        this.b1 = 0;
        this.c1 = new a();
        this.d1 = new b();
        this.f1 = false;
        this.g1 = false;
        this.h1 = false;
        this.j1 = false;
        this.k1 = false;
        this.l1 = false;
        this.m1 = false;
        this.n1 = false;
        this.o1 = false;
        this.q1 = new c();
        init(context);
    }

    private void A() {
        com.smartdigimkt.k1.c cVarA;
        if (this.x0 == null) {
            return;
        }
        try {
            cVarA = com.smartdigimkt.k1.a.a().a(this.x0);
        } catch (Exception e2) {
            if (com.smartdigimkt.b.b.f33800a) {
                e2.printStackTrace();
            }
            cVarA = null;
        }
        if (cVarA != null) {
            try {
                if (cVarA.a(0)) {
                    cVarA.b(false);
                    cVarA.a(0, new j(this.x0));
                }
            } catch (Exception e3) {
                cVarA.b();
                if (com.smartdigimkt.b.b.f33800a) {
                    e3.printStackTrace();
                }
            }
        }
    }

    private int getBufferTimeout() {
        try {
            com.smartdigimkt.f3.a aVarC = com.smartdigimkt.f3.c.b().c();
            if (aVarC == null) {
                com.smartdigimkt.f3.c.b().a();
            }
            if (aVarC != null) {
                return (int) aVarC.i();
            }
            return 5;
        } catch (Throwable th) {
            th.printStackTrace();
            return 5;
        }
    }

    private int getCloseBtnTime() {
        com.smartdigimkt.x.d dVar = this.x0;
        if (dVar == null) {
            return 1;
        }
        boolean zA = v.a("clsdly", dVar.B2());
        int iB = v.b(this.x0.B2(), "clsdly");
        if (!zA || iB < 0) {
            return this.x0.l0() > -2 ? this.x0.l0() : this.j0.q();
        }
        return iB;
    }

    private void n() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onAdClose() {
        int i2;
        try {
            com.smartdigimkt.a2.b bVar = this.A0;
            if (bVar == null) {
                Activity activity = this.g0;
                if (activity != null) {
                    activity.finish();
                    return;
                }
                return;
            }
            if (this.o0 && ((i2 = this.q0) == com.smartdigimkt.b0.a.v2 || i2 == com.smartdigimkt.b0.a.w2)) {
                boolean z2 = true;
                if (this.G0 != 1) {
                    z2 = false;
                }
                bVar.onAdCloseWithIVReward(z2, this.F0);
            }
            this.A0.a(this.D0, this.g1, this.l0);
        } catch (Exception unused) {
            Activity activity2 = this.g0;
            if (activity2 != null) {
                activity2.finish();
            }
        }
    }

    private void t() {
    }

    private void u() {
        Runnable runnable;
        int i2 = this.Z0;
        if (i2 == -3) {
            runnable = this.c1;
        } else {
            runnable = i2 == -4 ? this.d1 : null;
        }
        if (runnable != null) {
            runnable.run();
            this.Z0 = 0;
        }
    }

    private void v() {
        if (this.g1) {
            com.smartdigimkt.v2.a.a(this.x0, this.l0, this.h0, this.k0, this.O0);
        }
    }

    private void w() {
        getJSCommon().g(this.n0);
        getJSCommon().setUnitId(this.h0);
        getJSCommon().setRewardUnitSetting(this.j0);
        getJSCommon().a(new m(this, null));
        com.smartdigimkt.x.d dVar = this.x0;
        if (dVar != null) {
            if (dVar.K2() || this.x0.C2()) {
                com.smartdigimkt.s4.c cVar = new com.smartdigimkt.s4.c(getContext());
                this.p1 = cVar;
                cVar.c();
                this.p1.a();
                this.p1.a(new f());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void y() {
        if (isLoadSuccess()) {
            this.g0.runOnUiThread(new g());
        }
    }

    public boolean canBackPress() {
        AnythinkContainerView anythinkContainerView = this.X0;
        return anythinkContainerView == null || anythinkContainerView.canBackPress();
    }

    public void defaultLoad(int i2, String str) {
        int i3;
        superDefaultLoad(i2, str);
        if (!isLoadSuccess()) {
            b(i2, str);
            Activity activity = this.g0;
            if (activity != null) {
                activity.finish();
                return;
            }
            return;
        }
        a aVar = null;
        if (this.x0.B1() == 2) {
            this.X0.setCampaign(this.x0);
            this.X0.addOrderViewData(this.P0);
            this.X0.setUnitID(this.h0);
            this.X0.setCloseDelayTime(getCloseBtnTime());
            this.X0.setPlayCloseBtnTm(this.j0.H());
            this.X0.setNotifyListener(new com.smartdigimkt.u2.h(this.x0, this.y0, this.l0, getInnerPlacementId(), this.h0, new l(this, aVar), this.j0.P(), this.t0));
            this.X0.preLoadData(this.E0);
            this.X0.showPlayableView();
            return;
        }
        b(i2, str);
        this.e1.setVisibility(8);
        loadModuleDatas();
        int iY = this.j0.Y();
        int h5CloseType = getH5CloseType();
        int i4 = h5CloseType != 0 ? h5CloseType : iY;
        com.smartdigimkt.x.d dVar = this.x0;
        if (dVar != null && dVar.H2()) {
            this.mbridgeVideoView.setContainerViewOnNotifyListener(new k(this.g0, this.x0));
        }
        com.smartdigimkt.x.d dVar2 = this.x0;
        int iZ = (dVar2 == null || dVar2.w2() <= -2) ? this.j0.Z() : this.x0.w2();
        com.smartdigimkt.x.d dVar3 = this.x0;
        if (dVar3 != null && dVar3.t0() == 5 && (i3 = this.C0) > 1) {
            iZ = a(iZ, i3);
            this.x0.z0(iZ);
        }
        int i5 = iZ;
        this.mbridgeVideoView.setVideoSkipTime(i5);
        AnythinkVideoView anythinkVideoView = this.mbridgeVideoView;
        anythinkVideoView.setNotifyListener(new com.smartdigimkt.u2.m(anythinkVideoView, this.X0, this.x0, this.l0, this.y0, getInnerPlacementId(), this.h0, i4, i5, new n(this, aVar), this.j0.P(), this.t0, this.j0.W()));
        this.mbridgeVideoView.defaultShow();
        AnythinkContainerView anythinkContainerView = this.X0;
        anythinkContainerView.setNotifyListener(new com.smartdigimkt.u2.b(this.mbridgeVideoView, anythinkContainerView, this.x0, this.l0, this.y0, getInnerPlacementId(), this.h0, new k(this.g0, this.x0), this.j0.P(), this.t0));
        this.X0.defaultShow();
    }

    public AnythinkContainerView findAnythinkContainerView() {
        return (AnythinkContainerView) findViewById(findID("sdm_video_templete_container"));
    }

    public AnythinkVideoView findAnythinkVideoView() {
        return (AnythinkVideoView) findViewById(findID("sdm_video_templete_videoview"));
    }

    public int findID(String str) {
        return com.smartdigimkt.v0.k.a(getContext(), str, "id");
    }

    public int findLayout(String str) {
        return com.smartdigimkt.v0.k.a(getContext(), str, "layout");
    }

    public WindVaneWebView findWindVaneWebView() {
        try {
            if (!this.t0) {
                com.smartdigimkt.a3.a.C0428a c0428aA = this.o0 ? com.smartdigimkt.a3.a.a(287, this.x0) : com.smartdigimkt.a3.a.a(94, this.x0);
                if (c0428aA == null || !c0428aA.c()) {
                    return null;
                }
                if (this.o0) {
                    com.smartdigimkt.a3.a.b(287, this.x0);
                } else {
                    com.smartdigimkt.a3.a.b(94, this.x0);
                }
                WindVaneWebView windVaneWebViewB = c0428aA.b();
                if (this.j1) {
                    windVaneWebViewB.setWebViewTransparent();
                }
                return windVaneWebViewB;
            }
            com.smartdigimkt.x.d dVar = this.x0;
            if (dVar == null || dVar.U1() == null) {
                return null;
            }
            com.smartdigimkt.a3.a.C0428a c0428aB = com.smartdigimkt.a3.a.b(this.h0 + "_" + this.x0.j() + "_" + this.x0.N1() + "_" + this.x0.U1().f());
            if (c0428aB != null) {
                return c0428aB.b();
            }
            return null;
        } catch (Exception e2) {
            if (!com.smartdigimkt.b.b.f33800a) {
                return null;
            }
            e2.printStackTrace();
            return null;
        }
    }

    public com.smartdigimkt.x.d getCampaign() {
        return this.x0;
    }

    public RelativeLayout.LayoutParams getContentLayoutParams() {
        return new RelativeLayout.LayoutParams(-1, -1);
    }

    public int getH5CloseType() {
        com.smartdigimkt.z2.j jVarB = b(this.x0);
        if (jVarB != null) {
            return jVarB.getH5CloseType();
        }
        return 0;
    }

    public int getH5DialogRole() {
        if (getJSCommon() != null) {
            return getJSCommon().f();
        }
        return 1;
    }

    public int getH5MuteState() {
        com.smartdigimkt.z2.j jVarB = b(this.x0);
        if (jVarB != null) {
            return jVarB.getH5MuteState();
        }
        return 0;
    }

    public String getInstanceId() {
        return this.D0;
    }

    public boolean getIsShowingTransparent() {
        com.smartdigimkt.z2.j jVarB = b(this.x0);
        if (jVarB != null) {
            return jVarB.j();
        }
        return false;
    }

    public int getLayoutID() {
        return findLayout(this.j1 ? "sdm_reward_activity_video_templete_transparent" : "sdm_reward_activity_video_templete");
    }

    public void init(Context context) {
        this.T0 = LayoutInflater.from(context);
    }

    public boolean initViews() {
        View viewFindViewById = findViewById(findID("sdm_video_templete_progressbar"));
        this.e1 = viewFindViewById;
        return viewFindViewById != null;
    }

    public boolean isLoadSuccess() {
        return this.U0;
    }

    public void loadModuleDatas() {
        int i2;
        int i3;
        int h5MuteState = getH5MuteState();
        if (h5MuteState != 0) {
            this.n0 = h5MuteState;
        }
        int iY = this.j0.Y();
        int h5CloseType = getH5CloseType();
        int i4 = h5CloseType != 0 ? h5CloseType : iY;
        this.mbridgeVideoView.setSoundState(this.n0);
        this.mbridgeVideoView.setCampaign(this.x0);
        this.mbridgeVideoView.setPlayURL(this.y0.g());
        com.smartdigimkt.x.d dVar = this.x0;
        int iZ = (dVar == null || dVar.w2() <= -2) ? this.j0.Z() : this.x0.w2();
        com.smartdigimkt.x.d dVar2 = this.x0;
        if (dVar2 != null && dVar2.t0() == 5 && (i3 = this.C0) > 1) {
            iZ = a(iZ, i3);
            this.x0.z0(iZ);
        }
        int i5 = iZ;
        this.mbridgeVideoView.setVideoSkipTime(i5);
        this.mbridgeVideoView.setCloseAlert(this.j0.p());
        this.mbridgeVideoView.setBufferTimeout(getBufferTimeout());
        a aVar = null;
        this.mbridgeVideoView.setNotifyListener(new com.smartdigimkt.u2.n(this.E0, this.x0, this.l0, this.y0, getInnerPlacementId(), this.h0, i4, i5, new n(this, aVar), this.j0.P(), this.t0, this.j0.W()));
        this.mbridgeVideoView.setShowingTransparent(this.j1);
        if (this.o0 && ((i2 = this.q0) == com.smartdigimkt.b0.a.v2 || i2 == com.smartdigimkt.b0.a.w2)) {
            this.mbridgeVideoView.setIVRewardEnable(i2, this.r0, this.s0);
            this.mbridgeVideoView.setDialogRole(getH5DialogRole());
        }
        this.X0.setCampaign(this.x0);
        this.X0.addOrderViewData(this.P0);
        this.X0.setUnitID(this.h0);
        this.X0.setCloseDelayTime(getCloseBtnTime());
        this.X0.setPlayCloseBtnTm(this.j0.H());
        this.X0.setVideoInteractiveType(this.j0.X());
        this.X0.setEndscreenType(this.j0.v());
        this.X0.setVideoSkipTime(i5);
        this.X0.setShowingTransparent(this.j1);
        this.X0.setJSFactory(this.E0);
        if (this.x0.B1() == 2) {
            this.X0.setNotifyListener(new com.smartdigimkt.u2.h(this.x0, this.y0, this.l0, getInnerPlacementId(), this.h0, new l(this, aVar), this.j0.P(), this.t0));
            this.X0.preLoadData(this.E0);
            this.X0.showPlayableView();
        } else {
            this.X0.setNotifyListener(new com.smartdigimkt.u2.c(this.E0, this.x0, this.l0, this.y0, getInnerPlacementId(), this.h0, new k(this.g0, this.x0), this.j0.P(), this.t0));
            this.X0.preLoadData(this.E0);
            this.mbridgeVideoView.preLoadData(this.E0);
        }
        if (this.j1) {
            this.X0.setAnythinkClickMiniCardViewTransparent();
        }
    }

    public void notifyEvent(String str) {
        WindVaneWebView windVaneWebView = this.W0;
        if (windVaneWebView != null) {
            a(windVaneWebView, str, this.D0);
        }
    }

    public void onBackPressed() {
        Activity activity;
        AnythinkContainerView anythinkContainerView;
        AnythinkContainerView anythinkContainerView2;
        AnythinkVideoView anythinkVideoView;
        AnythinkVideoView anythinkVideoView2;
        if (this.j1 && (anythinkVideoView2 = this.mbridgeVideoView) != null) {
            anythinkVideoView2.notifyVideoClose();
            return;
        }
        if (this.l1 && (anythinkVideoView = this.mbridgeVideoView) != null) {
            if (!anythinkVideoView.isMiniCardShowing()) {
                this.mbridgeVideoView.onBackPress();
                return;
            }
            AnythinkContainerView anythinkContainerView3 = this.X0;
            if (anythinkContainerView3 != null) {
                anythinkContainerView3.onMiniEndcardBackPress();
                return;
            }
            return;
        }
        if (this.n1 && (anythinkContainerView2 = this.X0) != null) {
            anythinkContainerView2.onPlayableBackPress();
            return;
        }
        if (this.m1 && (anythinkContainerView = this.X0) != null) {
            anythinkContainerView.onEndcardBackPress();
        }
        if (getJSCommon().b()) {
            if (getJSContainerModule() == null || !getJSContainerModule().miniCardShowing()) {
                getActivityProxy().e();
                return;
            }
            return;
        }
        if (!canBackPress() || (activity = this.g0) == null || this.t0 || this.o1) {
            return;
        }
        this.o1 = true;
        activity.onBackPressed();
    }

    @Override // com.smartdigimkt.expressad.video.signal.container.AbstractJSContainer, android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
    }

    public void onCreate() {
        m();
        try {
            A();
        } catch (Exception e2) {
            if (com.smartdigimkt.b.b.f33800a) {
                e2.printStackTrace();
            }
        }
        this.o1 = false;
        try {
            if (this.t0) {
                com.smartdigimkt.x.d dVar = this.x0;
                if (dVar == null || !dVar.H2()) {
                    this.z0 = new com.smartdigimkt.b2.d(this.A0, this.D0);
                } else {
                    this.z0 = new com.smartdigimkt.b2.e(getContext(), this.o0, this.j0, this.x0, this.z0, getInnerPlacementId(), this.h0);
                }
            } else {
                this.z0 = new com.smartdigimkt.b2.e(getContext(), this.o0, this.j0, this.x0, this.z0, getInnerPlacementId(), this.h0);
            }
            registerErrorListener(new com.smartdigimkt.b2.f(this.z0));
            a(this.j0, this.x0);
            setShowingTransparent();
            int layoutID = getLayoutID();
            if (layoutID <= 0) {
                b("layoutID not found");
                return;
            }
            View viewInflate = this.T0.inflate(layoutID, (ViewGroup) null);
            this.w0 = viewInflate;
            addView(viewInflate, getContentLayoutParams());
            x();
            if (p()) {
                this.U0 = true;
                r();
                return;
            }
            this.V0.a(com.smartdigimkt.y.a.f39969b);
            Activity activity = this.g0;
            if (activity != null) {
                activity.finish();
            }
        } catch (Throwable th) {
            b("onCreate error" + th);
        }
    }

    @Override // com.smartdigimkt.expressad.video.signal.container.AbstractJSContainer
    public void onDestroy() {
        if (this.H0) {
            return;
        }
        this.H0 = true;
        super.onDestroy();
        try {
            AnythinkVideoView anythinkVideoView = this.mbridgeVideoView;
            if (anythinkVideoView != null) {
                anythinkVideoView.releasePlayer();
            }
            n();
            WindVaneWebView windVaneWebView = this.W0;
            if (windVaneWebView != null) {
                ViewGroup viewGroup = (ViewGroup) windVaneWebView.getParent();
                if (viewGroup != null) {
                    viewGroup.removeAllViews();
                }
                this.W0.clearWebView();
                this.W0.release();
            }
            if (this.A0 != null) {
                this.A0 = null;
            }
            this.Y0.removeCallbacks(this.c1);
            this.Y0.removeCallbacks(this.d1);
            getJSCommon().release();
            if (this.o0) {
                com.smartdigimkt.n1.b.b().e(this.h0);
            }
            if (!this.f1) {
                s();
            }
            if (!this.i1) {
                t();
            }
            com.smartdigimkt.s4.c cVar = this.p1;
            if (cVar != null) {
                cVar.d();
            }
            if (!this.t0) {
                if (isLoadSuccess()) {
                    this.Y0.postDelayed(new d(), 100L);
                } else {
                    Activity activity = this.g0;
                    if (activity != null) {
                        activity.finish();
                    }
                }
            }
            if (!this.i1) {
                t();
            }
            com.smartdigimkt.z1.c.c().a(this.D0);
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    @Override // com.smartdigimkt.expressad.video.signal.container.AbstractJSContainer
    public void onPause() {
        super.onPause();
        this.h1 = true;
        try {
            getJSVideoModule().videoOperate(2);
            AnythinkContainerView anythinkContainerView = this.X0;
            if (anythinkContainerView != null) {
                anythinkContainerView.setOnPause();
            }
            AnythinkVideoView anythinkVideoView = this.mbridgeVideoView;
            if (anythinkVideoView != null) {
                anythinkVideoView.onActivityPause();
            }
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    @Override // com.smartdigimkt.expressad.video.signal.container.AbstractJSContainer
    public void onResume() {
        Activity activity;
        super.onResume();
        u();
        try {
            if (this.mbridgeVideoView != null && !q() && !this.mbridgeVideoView.isMiniCardShowing() && !com.smartdigimkt.z.b.f) {
                this.mbridgeVideoView.setCover(false);
            }
            AnythinkContainerView anythinkContainerView = this.X0;
            if (anythinkContainerView != null) {
                anythinkContainerView.setOnResume();
            }
            AnythinkVideoView anythinkVideoView = this.mbridgeVideoView;
            if (anythinkVideoView != null) {
                anythinkVideoView.onActivityResume();
            }
            if (this.h1 && !q() && !com.smartdigimkt.z.b.f) {
                getJSVideoModule().videoOperate(1);
            }
            Activity activity2 = this.g0;
            if (activity2 != null) {
                v.a(activity2.getWindow().getDecorView());
            }
            if (this.j1 && this.k1 && (activity = this.g0) != null) {
                activity.finish();
            }
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    @Override // com.smartdigimkt.expressad.video.signal.container.AbstractJSContainer
    public void onStop() {
        super.onStop();
        AnythinkVideoView anythinkVideoView = this.mbridgeVideoView;
        if (anythinkVideoView != null) {
            anythinkVideoView.setCover(true);
            this.mbridgeVideoView.onActivityStop();
        }
    }

    public void preload() {
    }

    public void receiveSuccess() {
        this.Y0.removeCallbacks(this.d1);
        this.Y0.postDelayed(this.q1, 250L);
    }

    public void registerErrorListener(i iVar) {
        this.V0 = iVar;
    }

    public void setAnythinkTempCallback(com.smartdigimkt.a2.b bVar) {
        this.A0 = bVar;
    }

    public void setCamPlayOrderCallback(com.smartdigimkt.i2.a aVar, int i2) {
        this.B0 = aVar;
        this.C0 = i2;
    }

    public void setCampOrderViewData(List<com.smartdigimkt.x.d> list, int i2) {
        if (list != null) {
            this.P0 = list;
        }
        this.Q0 = i2;
    }

    public void setCampaign(com.smartdigimkt.x.d dVar) {
        this.x0 = dVar;
        if (dVar != null) {
            if (TextUtils.isEmpty(dVar.i0()) && !TextUtils.isEmpty(this.h0)) {
                dVar.G(this.h0);
            }
            com.smartdigimkt.z.b.b().a(dVar.i0() + "_1", dVar);
        }
    }

    public void setCampaignDownLoadTask(com.smartdigimkt.c3.c cVar) {
        this.y0 = cVar;
    }

    public void setCampaignExpired(boolean z2) {
        try {
            com.smartdigimkt.x.d dVar = this.x0;
            if (dVar != null) {
                if (!z2) {
                    dVar.k0(0);
                    if (this.x0.D2()) {
                        this.x0.v(0);
                        return;
                    }
                    com.smartdigimkt.f3.d dVar2 = this.j0;
                    if (dVar2 != null) {
                        this.x0.v(dVar2.x());
                        return;
                    }
                    return;
                }
                dVar.k0(1);
                if (this.p0) {
                    this.x0.v(0);
                    return;
                }
                com.smartdigimkt.f3.d dVar3 = this.j0;
                if (dVar3 != null) {
                    if (dVar3.P() == 1) {
                        this.x0.v(1);
                    } else {
                        this.x0.v(0);
                    }
                }
            }
        } catch (Exception e2) {
            e2.getMessage();
        }
    }

    public void setDeveloperExtraData(String str) {
        this.O0 = str;
    }

    public void setH5Cbp(int i2) {
        this.b1 = i2;
    }

    public void setInstanceId(String str) {
        this.D0 = str;
    }

    public void setJSFactory(com.smartdigimkt.y2.b bVar) {
        this.E0 = bVar;
    }

    public void setMatchParent() {
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams == null) {
            setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        } else {
            layoutParams.height = -1;
            layoutParams.width = -1;
        }
    }

    public void setMediaPlayerUrl(String str) {
    }

    public void setNotchPadding(int i2, int i3, int i4, int i5, int i6) {
        this.I0 = i2;
        this.J0 = i3;
        this.K0 = i4;
        this.L0 = i5;
        this.M0 = i6;
        this.N0 = com.smartdigimkt.v0.i.a(i2, i3, i4, i5, i6);
        if (getJSCommon() != null && !TextUtils.isEmpty(this.N0)) {
            getJSCommon().a(this.N0);
            if (this.W0 != null && !TextUtils.isEmpty(this.N0)) {
                com.smartdigimkt.n.h.a().a((WebView) this.W0, "oncutoutfetched", Base64.encodeToString(this.N0.getBytes(), 0));
            }
        }
        AnythinkVideoView anythinkVideoView = this.mbridgeVideoView;
        if (anythinkVideoView != null) {
            anythinkVideoView.setNotchPadding(i3, i4, i5, i6);
        }
        AnythinkContainerView anythinkContainerView = this.X0;
        if (anythinkContainerView != null) {
            anythinkContainerView.setNotchPadding(i2, i3, i4, i5, i6);
        }
    }

    public void setShowRewardListener(com.smartdigimkt.b2.h hVar) {
        this.z0 = hVar;
    }

    public void setShowingTransparent() {
        int iA;
        Activity activity;
        boolean isShowingTransparent = getIsShowingTransparent();
        this.j1 = isShowingTransparent;
        if (isShowingTransparent || (iA = com.smartdigimkt.v0.k.a(getContext(), "sdm_reward_theme", "style")) <= 1 || (activity = this.g0) == null) {
            return;
        }
        activity.setTheme(iA);
    }

    public void setSoundListener(com.smartdigimkt.s2.a aVar) {
        this.R0 = aVar;
    }

    public void setTempEventListener(com.smartdigimkt.i1.c cVar) {
        this.r1 = cVar;
    }

    public void setWebViewFront(int i2) {
        this.a1 = i2;
    }

    public void superDefaultLoad(int i2, String str) {
        this.Y0.removeCallbacks(this.c1);
        this.Y0.removeCallbacks(this.d1);
        this.V0.a(true);
        WindVaneWebView windVaneWebView = this.W0;
        if (windVaneWebView != null) {
            windVaneWebView.setVisibility(8);
        }
    }

    public void x() {
        if (this.S0) {
            setMatchParent();
        }
    }

    public void z() {
        int iG;
        int iF;
        try {
            if (this.W0 != null) {
                int i2 = getResources().getConfiguration().orientation;
                if (getIsShowingTransparent()) {
                    iG = v.i(getContext());
                    iF = v.h(getContext());
                    if (com.smartdigimkt.v0.g.a(getContext())) {
                        int iC = v.c(getContext());
                        if (i2 == 2) {
                            iG += iC;
                        } else {
                            iF += iC;
                        }
                    }
                } else {
                    iG = v.g(getContext());
                    iF = v.f(getContext());
                }
                int iC2 = this.x0.U1().c();
                if (a(this.x0) == 1) {
                    iC2 = i2;
                }
                getJSNotifyProxy().a(i2, iC2, iG, iF);
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(com.smartdigimkt.b0.a.l2, v.d(getContext()));
                try {
                    if (this.l0 != null) {
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("name", this.l0.c());
                        jSONObject2.put("amount", this.l0.a());
                        jSONObject2.put("id", this.m0);
                        jSONObject.put("userId", this.k0);
                        jSONObject.put("reward", jSONObject2);
                        jSONObject.put("playVideoMute", this.n0);
                        jSONObject.put("extra", this.O0);
                    }
                } catch (JSONException e2) {
                    e2.getMessage();
                } catch (Exception e3) {
                    e3.getMessage();
                }
                getJSNotifyProxy().a(jSONObject.toString());
                com.smartdigimkt.n.h.a().a((WebView) this.W0, "oncutoutfetched", Base64.encodeToString(this.N0.getBytes(), 0));
                getJSCommon().b(true);
                loadModuleDatas();
                this.Y0.postDelayed(this.c1, 2000L);
            }
        } catch (Exception e4) {
            if (com.smartdigimkt.b.b.f33800a) {
                e4.printStackTrace();
            }
        }
    }

    public static final class j extends com.smartdigimkt.k1.b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private com.smartdigimkt.x.d f34753b;

        public j(com.smartdigimkt.x.d dVar) {
            this.f34753b = dVar;
        }

        @Override // com.smartdigimkt.k1.b
        public void b() {
            if (com.smartdigimkt.b.b.f33800a) {
                String unused = ATTempContainer.s1;
            }
        }

        @Override // com.smartdigimkt.k1.b
        public void c(int i2, String str, String str2) {
            if (com.smartdigimkt.b.b.f33800a) {
                String unused = ATTempContainer.s1;
            }
            try {
                com.smartdigimkt.x.d dVar = this.f34753b;
                if (dVar != null) {
                    dVar.H(str2);
                }
            } catch (Exception e2) {
                if (com.smartdigimkt.b.b.f33800a) {
                    String unused2 = ATTempContainer.s1;
                    e2.getMessage();
                }
            }
        }

        @Override // com.smartdigimkt.k1.b
        public void b(String str) {
            if (com.smartdigimkt.b.b.f33800a) {
                String unused = ATTempContainer.s1;
            }
            try {
                com.smartdigimkt.x.d dVar = this.f34753b;
                if (dVar != null) {
                    dVar.J(str);
                }
            } catch (Exception e2) {
                if (com.smartdigimkt.b.b.f33800a) {
                    String unused2 = ATTempContainer.s1;
                    e2.getMessage();
                }
            }
        }
    }

    private void m() {
        if (this.j0 == null) {
            this.j0 = com.smartdigimkt.f3.c.b().a(com.smartdigimkt.u.a.f().a(), this.h0, this.o0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void o() {
        if (isLoadSuccess()) {
            this.g0.runOnUiThread(new h());
        }
    }

    private void s() {
        com.smartdigimkt.x.d dVar;
        int i2;
        boolean z2 = true;
        try {
            this.f1 = true;
            com.smartdigimkt.x.d dVar2 = this.x0;
            if (dVar2 != null && dVar2.B1() == 2) {
                this.g1 = true;
            }
            com.smartdigimkt.b2.h hVar = this.z0;
            if (hVar != null) {
                if (this.o0 && ((i2 = this.q0) == com.smartdigimkt.b0.a.v2 || i2 == com.smartdigimkt.b0.a.w2)) {
                    if (this.G0 != 1) {
                        z2 = false;
                    }
                    hVar.onAdCloseWithIVReward(z2, this.F0);
                }
                if (!this.g1) {
                    this.l0.a(0);
                }
                this.z0.a(this.g1, this.l0);
            }
            this.Y0.removeCallbacks(this.q1);
            if ((!this.o0 && !this.t0) || ((dVar = this.x0) != null && dVar.H2())) {
                v();
            }
            if (!this.t0) {
                if (this.o0) {
                    com.smartdigimkt.a3.a.b(287, this.x0);
                } else {
                    com.smartdigimkt.a3.a.b(94, this.x0);
                }
            }
            AnythinkContainerView anythinkContainerView = this.X0;
            if (anythinkContainerView != null) {
                anythinkContainerView.release();
            }
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    public boolean p() {
        this.W0 = findWindVaneWebView();
        AnythinkVideoView anythinkVideoViewFindAnythinkVideoView = findAnythinkVideoView();
        this.mbridgeVideoView = anythinkVideoViewFindAnythinkVideoView;
        anythinkVideoViewFindAnythinkVideoView.setVideoLayout(this.x0);
        this.mbridgeVideoView.setIsIV(this.o0);
        this.mbridgeVideoView.setUnitId(this.h0);
        this.mbridgeVideoView.setCamPlayOrderCallback(this.B0, this.P0, this.C0, this.Q0);
        this.mbridgeVideoView.setTempEventListener(this.r1);
        this.mbridgeVideoView.setSoundListener(this.R0);
        if (this.t0) {
            this.mbridgeVideoView.setNotchPadding(this.J0, this.K0, this.L0, this.M0);
        }
        AnythinkContainerView anythinkContainerViewFindAnythinkContainerView = findAnythinkContainerView();
        this.X0 = anythinkContainerViewFindAnythinkContainerView;
        if (this.t0) {
            anythinkContainerViewFindAnythinkContainerView.setNotchPadding(this.I0, this.J0, this.K0, this.L0, this.M0);
        }
        return (this.mbridgeVideoView == null || this.X0 == null || !initViews()) ? false : true;
    }

    public boolean q() {
        AnythinkVideoView anythinkVideoView = this.mbridgeVideoView;
        if (anythinkVideoView != null) {
            return anythinkVideoView.isShowingAlertView() || this.mbridgeVideoView.isInstallDialogShowing() || this.mbridgeVideoView.isRewardPopViewShowing();
        }
        return false;
    }

    public void r() {
        ViewGroup viewGroup;
        List<com.smartdigimkt.x.d> list;
        WindVaneWebView windVaneWebView = this.W0;
        this.E0 = new com.smartdigimkt.y2.b(this.g0, windVaneWebView, this.mbridgeVideoView, this.X0, this.x0, new m(this, null));
        com.smartdigimkt.x.d dVar = this.x0;
        if (dVar != null && dVar.t0() == 5 && (list = this.P0) != null) {
            this.E0.a(list);
        }
        registerJsFactory(this.E0);
        com.smartdigimkt.z.b.b().a(android.support.v4.media.a.r(new StringBuilder(), this.h0, "_1"), new e());
        if (windVaneWebView == null) {
            defaultLoad(0, "preload template webview is null or load error");
            return;
        }
        ViewGroup viewGroup2 = (ViewGroup) this.w0.findViewById(com.smartdigimkt.v0.k.a(getContext(), "sdm_video_templete_webview_parent", "id"));
        windVaneWebView.setApiManagerJSFactory(this.E0);
        if (windVaneWebView.getParent() != null) {
            defaultLoad(0, "preload template webview is null or load error");
            return;
        }
        if (windVaneWebView.getObject() instanceof com.smartdigimkt.z2.j) {
            this.E0.a((com.smartdigimkt.z2.j) windVaneWebView.getObject());
            w();
            getJSContainerModule().readyStatus(((com.smartdigimkt.z2.j) windVaneWebView.getObject()).q());
            z();
            ((com.smartdigimkt.z2.j) windVaneWebView.getObject()).o0.a();
            if (this.t0) {
                getJSCommon().setWebViewFront(this.a1);
                getJSCommon().setH5Cbp(this.b1);
            }
        }
        if (getJSCommon().c() == 1 && (viewGroup = (ViewGroup) this.w0.findViewById(com.smartdigimkt.v0.k.a(getContext(), "sdm_video_templete_webview_parent", "id"))) != null) {
            ((ViewGroup) this.w0).removeView(viewGroup);
            ((ViewGroup) this.w0).addView(viewGroup, 1);
        }
        viewGroup2.addView(windVaneWebView, new ViewGroup.LayoutParams(-1, -1));
    }

    private int a(int i2, int i3) {
        List<com.smartdigimkt.x.d> list;
        if (i2 < 0 || (list = this.P0) == null || list.size() == 0 || i3 <= 1) {
            return i2;
        }
        int iT = 0;
        for (int i4 = 0; i4 < i3 - 1; i4++) {
            if (this.P0.get(i4) != null) {
                iT += this.P0.get(i4).t();
            }
        }
        if (i2 > iT) {
            return i2 - iT;
        }
        return 0;
    }

    @Override // com.smartdigimkt.expressad.video.signal.container.AbstractJSContainer
    public void b(String str) {
        com.smartdigimkt.b2.h hVar = this.z0;
        if (hVar != null) {
            hVar.onShowFail(str);
        }
        super.b(str);
    }

    private void b(int i2, String str) {
        try {
            t tVar = new t();
            tVar.l(t.T);
            tVar.h("code=" + i2 + ",desc=" + str);
            com.smartdigimkt.x.d dVar = this.x0;
            tVar.u((dVar == null || dVar.U1() == null) ? "" : this.x0.U1().f());
            tVar.w(this.h0);
            com.smartdigimkt.x.d dVar2 = this.x0;
            tVar.b(dVar2 != null ? dVar2.j() : "");
            com.smartdigimkt.x.d dVar3 = this.x0;
            if (dVar3 != null && !TextUtils.isEmpty(dVar3.N1())) {
                tVar.q(this.x0.N1());
            }
            com.smartdigimkt.x.d dVar4 = this.x0;
            if (dVar4 != null && !TextUtils.isEmpty(dVar4.O1())) {
                tVar.r(this.x0.O1());
            }
            int iH = com.smartdigimkt.v0.n.h(getContext());
            tVar.f(iH);
            tVar.n(com.smartdigimkt.v0.n.a(getContext(), iH));
            com.smartdigimkt.v2.a.a(t.g(tVar), this.h0);
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    public class e implements com.smartdigimkt.z.a {
        public e() {
        }

        @Override // com.smartdigimkt.z.a
        public void a() {
            String string;
            ATTempContainer.this.onPause();
            try {
                JSONObject jSONObject = new JSONObject();
                if (com.smartdigimkt.m6.b.p().k() != null) {
                    jSONObject.put("status", 1);
                }
                string = jSONObject.toString();
            } catch (Throwable th) {
                String unused = ATTempContainer.s1;
                th.getMessage();
                string = "";
            }
            com.smartdigimkt.n.h.a().a((WebView) ATTempContainer.this.W0, BaseAbsFeedBackForH5.g, Base64.encodeToString(string.getBytes(), 2));
        }

        @Override // com.smartdigimkt.z.a
        public void close() {
            String string;
            ATTempContainer.this.onResume();
            try {
                JSONObject jSONObject = new JSONObject();
                if (com.smartdigimkt.m6.b.p().k() != null) {
                    jSONObject.put("status", 2);
                }
                string = jSONObject.toString();
            } catch (Throwable th) {
                String unused = ATTempContainer.s1;
                th.getMessage();
                string = "";
            }
            com.smartdigimkt.n.h.a().a((WebView) ATTempContainer.this.W0, BaseAbsFeedBackForH5.g, Base64.encodeToString(string.getBytes(), 2));
        }

        @Override // com.smartdigimkt.z.a
        public void a(String str) {
            String string;
            ATTempContainer.this.onResume();
            try {
                JSONObject jSONObject = new JSONObject();
                if (com.smartdigimkt.m6.b.p().k() != null) {
                    jSONObject.put("status", 2);
                }
                string = jSONObject.toString();
            } catch (Throwable th) {
                String unused = ATTempContainer.s1;
                th.getMessage();
                string = "";
            }
            com.smartdigimkt.n.h.a().a((WebView) ATTempContainer.this.W0, BaseAbsFeedBackForH5.g, Base64.encodeToString(string.getBytes(), 2));
        }
    }

    public ATTempContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.C0 = 1;
        this.D0 = "";
        this.F0 = com.smartdigimkt.b0.a.z2;
        this.H0 = false;
        this.N0 = "";
        this.P0 = new ArrayList();
        this.Q0 = 0;
        this.S0 = false;
        this.U0 = false;
        this.V0 = new i.a();
        this.Y0 = new Handler();
        this.Z0 = 0;
        this.a1 = 0;
        this.b1 = 0;
        this.c1 = new a();
        this.d1 = new b();
        this.f1 = false;
        this.g1 = false;
        this.h1 = false;
        this.j1 = false;
        this.k1 = false;
        this.l1 = false;
        this.m1 = false;
        this.n1 = false;
        this.o1 = false;
        this.q1 = new c();
        init(context);
    }
}
