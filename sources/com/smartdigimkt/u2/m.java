package com.smartdigimkt.u2;

import android.text.TextUtils;
import com.smartdigimkt.expressad.video.module.AnythinkContainerView;
import com.smartdigimkt.expressad.video.module.AnythinkVideoView;

/* JADX INFO: loaded from: classes6.dex */
public class m extends o {
    public static final long D0 = 3000;
    private int A0;
    private int B0;
    private final com.smartdigimkt.h7.b C0;
    private AnythinkVideoView u0;
    private AnythinkContainerView v0;
    private int w0;
    private final com.smartdigimkt.h7.a x0;
    private boolean y0;
    private boolean z0;

    public class a implements com.smartdigimkt.h7.b {
        public a() {
        }

        @Override // com.smartdigimkt.h7.b
        public boolean a() {
            return true;
        }

        @Override // java.lang.Runnable
        public void run() {
            m.this.v0.showVideoClickView(-1);
            m.this.u0.soundOperate(0, 2);
        }
    }

    public m(AnythinkVideoView anythinkVideoView, AnythinkContainerView anythinkContainerView, com.smartdigimkt.x.d dVar, com.smartdigimkt.d3.c cVar, com.smartdigimkt.c3.c cVar2, String str, String str2, int i2, int i3, com.smartdigimkt.t2.a aVar, int i4, boolean z2, int i5) {
        super(dVar, cVar, cVar2, str, str2, aVar, i4, z2);
        this.x0 = com.smartdigimkt.h7.e.c();
        this.y0 = false;
        this.z0 = false;
        this.A0 = 1;
        this.C0 = new a();
        this.u0 = anythinkVideoView;
        this.v0 = anythinkContainerView;
        this.B0 = i2;
        this.w0 = i3;
        this.A0 = i5;
        if (anythinkVideoView != null) {
            this.y0 = anythinkVideoView.getVideoSkipTime() == 0;
        }
        if (anythinkVideoView == null || anythinkContainerView == null) {
            this.W = false;
        }
    }

    private void n() {
        this.x0.a(this.C0);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x005c  */
    private void o() {
        com.smartdigimkt.x.d dVar;
        com.smartdigimkt.x.d dVar2 = this.X;
        if (dVar2 == null || dVar2.t0() != 5) {
            return;
        }
        AnythinkVideoView anythinkVideoView = this.u0;
        if (anythinkVideoView == null || anythinkVideoView.mCampOrderViewData == null) {
            dVar = null;
        } else {
            int i2 = 0;
            for (int i3 = 0; i3 < this.u0.mCampOrderViewData.size(); i3++) {
                if (this.u0.mCampOrderViewData.get(i3) != null && this.u0.mCampOrderViewData.get(i3).j() == this.X.j()) {
                    i2 = i3 - 1;
                    break;
                }
            }
            if (i2 < 0 || this.u0.mCampOrderViewData.get(i2) == null) {
                dVar = null;
            } else {
                dVar = this.u0.mCampOrderViewData.get(i2);
            }
        }
        if (dVar != null) {
            AnythinkVideoView anythinkVideoView2 = this.u0;
            if (anythinkVideoView2 != null) {
                anythinkVideoView2.setCampaign(dVar);
            }
            AnythinkContainerView anythinkContainerView = this.v0;
            if (anythinkContainerView != null) {
                anythinkContainerView.setCampaign(dVar);
            }
            a(dVar);
        }
    }

    private void p() {
        n();
        this.x0.a(this.C0, D0);
    }

    /* JADX WARN: Code duplicated, block: B:113:0x01d0  */
    /* JADX WARN: Code duplicated, block: B:127:0x020d  */
    /* JADX WARN: Code duplicated, block: B:129:0x0211  */
    /* JADX WARN: Code duplicated, block: B:135:0x022e  */
    /* JADX WARN: Code duplicated, block: B:87:0x015e  */
    /* JADX WARN: Code duplicated, block: B:89:0x0166  */
    /* JADX WARN: Code duplicated, block: B:90:0x016d  */
    @Override // com.smartdigimkt.u2.o, com.smartdigimkt.u2.k, com.smartdigimkt.u2.f, com.smartdigimkt.t2.a
    public void a(int i2, Object obj) {
        com.smartdigimkt.x.d dVar;
        int i3;
        if (this.W) {
            if (i2 != 1) {
                if (i2 == 2) {
                    this.u0.dismissAllAlert();
                    this.u0.videoOperate(3);
                    dVar = this.X;
                    if (dVar == null && dVar.H2() && this.X.t0() == 5 && this.v0 != null) {
                        AnythinkVideoView anythinkVideoView = this.u0;
                        if (anythinkVideoView.mCurrPlayNum == anythinkVideoView.mCampaignSize) {
                            if (this.X.R() == 2) {
                                i2 = 16;
                            } else {
                                this.v0.setRewardStatus(true);
                                this.v0.showOrderCampView();
                            }
                        } else if (this.B0 == 2) {
                            i2 = 16;
                        } else {
                            i2 = 16;
                        }
                    } else if (this.B0 == 2 || this.v0.endCardShowing() || this.X.R() == 2) {
                        i2 = 16;
                    } else {
                        this.v0.showEndcard(this.X.v2());
                    }
                } else if (i2 != 5) {
                    if (i2 == 6) {
                        this.u0.dismissAllAlert();
                        this.u0.videoOperate(3);
                        dVar = this.X;
                        if (dVar == null) {
                            if (this.B0 == 2) {
                                i2 = 16;
                            } else {
                                i2 = 16;
                            }
                        } else if (this.B0 == 2) {
                            i2 = 16;
                        } else {
                            i2 = 16;
                        }
                    } else if (i2 != 8) {
                        switch (i2) {
                            case 10:
                                this.z0 = true;
                                this.u0.soundOperate(0, 2);
                                this.u0.progressOperate(0, 2);
                                break;
                            case 11:
                                this.u0.videoOperate(3);
                                this.u0.dismissAllAlert();
                                if (this.X.v2() == 3) {
                                    this.u0.setVisibility(0);
                                } else if (this.X.R() != 2) {
                                    this.u0.setVisibility(8);
                                }
                                com.smartdigimkt.x.d dVar2 = this.X;
                                if (dVar2 != null && dVar2.t0() == 5) {
                                    AnythinkVideoView anythinkVideoView2 = this.u0;
                                    if (anythinkVideoView2.mCurrPlayNum == anythinkVideoView2.mCampaignSize) {
                                        AnythinkContainerView anythinkContainerView = this.v0;
                                        if (anythinkContainerView != null) {
                                            anythinkContainerView.setRewardStatus(true);
                                            this.v0.showOrderCampView();
                                        }
                                    } else if (this.X.R() == 2) {
                                        this.v0.showEndcard(this.X.v2());
                                    } else {
                                        this.v0.showVideoEndCover();
                                    }
                                } else if (this.X.R() == 2) {
                                    this.v0.showEndcard(this.X.v2());
                                } else {
                                    this.v0.showVideoEndCover();
                                }
                                break;
                            case 12:
                                k();
                                this.u0.videoOperate(3);
                                this.u0.dismissAllAlert();
                                if (this.X.v2() != 3) {
                                    this.u0.setVisibility(8);
                                } else {
                                    this.u0.setVisibility(0);
                                }
                                if (this.z0 || this.A0 != 0) {
                                    if (this.X.H2() && this.X.t0() == 5 && TextUtils.isEmpty(this.X.B2())) {
                                        o();
                                        this.A0 = 0;
                                    }
                                    if (!this.z0 && this.A0 == 1) {
                                        j();
                                        h();
                                        i();
                                    }
                                    if (this.X.R() == 2) {
                                        this.v0.showVideoEndCover();
                                    } else {
                                        this.v0.showEndcard(this.X.v2());
                                    }
                                }
                                break;
                            case 13:
                                this.u0.closeVideoOperate(0, 2);
                                break;
                            case 14:
                                if (!this.y0) {
                                    this.u0.closeVideoOperate(0, 1);
                                }
                                break;
                            case 15:
                                if (obj != null && (obj instanceof AnythinkVideoView.t)) {
                                    AnythinkVideoView.t tVar = (AnythinkVideoView.t) obj;
                                    int videoInteractiveType = this.v0.getVideoInteractiveType();
                                    if (this.X.R() == 2) {
                                        this.v0.showVideoClickView(1);
                                    } else if (videoInteractiveType >= 0 && tVar.f34819a >= videoInteractiveType) {
                                        this.v0.showVideoClickView(1);
                                        this.u0.soundOperate(0, 1);
                                    }
                                    this.y0 = tVar.f34821c;
                                    if (this.X.t0() != 5) {
                                        int i4 = this.w0;
                                        if (((i4 >= 0 && ((i3 = tVar.f34819a) >= i4 || i3 == tVar.f34820b)) || (this.X.o2() > 0 && (tVar.f34819a > this.X.o2() || tVar.f34819a == tVar.f34820b))) && !this.y0) {
                                            this.u0.closeVideoOperate(0, 2);
                                            this.y0 = true;
                                        }
                                    } else {
                                        a(tVar.f34819a, tVar.f34820b);
                                    }
                                }
                                break;
                        }
                    } else {
                        AnythinkContainerView anythinkContainerView2 = this.v0;
                        if (anythinkContainerView2 == null) {
                            AnythinkVideoView anythinkVideoView3 = this.u0;
                            if (anythinkVideoView3 != null) {
                                anythinkVideoView3.showAlertView();
                            }
                        } else if (anythinkContainerView2.showAlertWebView()) {
                            AnythinkVideoView anythinkVideoView4 = this.u0;
                            if (anythinkVideoView4 != null) {
                                anythinkVideoView4.alertWebViewShowed();
                            }
                        } else {
                            AnythinkVideoView anythinkVideoView5 = this.u0;
                            if (anythinkVideoView5 != null) {
                                anythinkVideoView5.showAlertView();
                            }
                        }
                    }
                } else if (obj != null && (obj instanceof Integer)) {
                    this.u0.soundOperate((((Integer) obj).intValue() == 1 ? 2 : 1).intValue(), -1);
                }
            } else if (!this.v0.endCardShowing()) {
                int videoInteractiveType2 = this.v0.getVideoInteractiveType();
                if (videoInteractiveType2 != -2) {
                    if (videoInteractiveType2 == -1) {
                        if (this.v0.isLast()) {
                            this.v0.showVideoClickView(1);
                            this.u0.soundOperate(0, 1);
                            p();
                        } else {
                            this.v0.showVideoClickView(-1);
                            this.u0.soundOperate(0, 2);
                            n();
                        }
                    }
                } else if (this.v0.miniCardLoaded()) {
                    this.v0.showVideoClickView(2);
                }
            }
        }
        super.a(i2, obj);
    }

    private void a(int i2, int i3) {
        com.smartdigimkt.x.d dVar;
        if (this.y0 || this.u0 == null || (dVar = this.X) == null) {
            return;
        }
        int i4 = this.w0;
        int i5 = (i4 < 0 || i2 < i4) ? 1 : 2;
        if (i5 != 2 && (dVar.o2() != 0 ? i2 > this.X.o2() : this.u0.mCurrPlayNum > 1)) {
            i5 = 2;
        }
        if (i5 != 2 && this.u0.mCurrPlayNum > 1 && i2 == i3) {
            i5 = 2;
        }
        if (i5 == 2) {
            this.u0.closeVideoOperate(0, i5);
            this.y0 = true;
        }
    }
}
