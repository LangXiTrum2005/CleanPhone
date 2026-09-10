package com.mbridge.msdk.dycreator.bridge;

import com.mbridge.msdk.dycreator.viewdata.base.a;
import com.mbridge.msdk.dycreator.wrapper.DyOption;
import com.mbridge.msdk.foundation.entity.CampaignEx;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class MBSplashData implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private DyOption f33160a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f33161b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f33162c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f33163d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f33164e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private CampaignEx f33165f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f33166g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f33167h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private float f33168i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private float f33169j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f33170k = 0;

    public MBSplashData(DyOption dyOption) {
        this.f33160a = dyOption;
        this.f33165f = dyOption.getCampaignEx();
    }

    public String getAdClickText() {
        return this.f33162c;
    }

    public String getAppInfo() {
        return this.f33161b;
    }

    @Override // com.mbridge.msdk.dycreator.viewdata.base.a
    public CampaignEx getBindData() {
        return this.f33165f;
    }

    public int getClickType() {
        return this.f33170k;
    }

    public String getCountDownText() {
        return this.f33163d;
    }

    public DyOption getDyOption() {
        return this.f33160a;
    }

    @Override // com.mbridge.msdk.dycreator.viewdata.base.a
    public DyOption getEffectData() {
        return this.f33160a;
    }

    public int getLogoImage() {
        return this.f33167h;
    }

    public String getLogoText() {
        return this.f33164e;
    }

    public int getNoticeImage() {
        return this.f33166g;
    }

    public float getxInScreen() {
        return this.f33168i;
    }

    public float getyInScreen() {
        return this.f33169j;
    }

    public void setAdClickText(String str) {
        this.f33162c = str;
    }

    public void setAppInfo(String str) {
        this.f33161b = str;
    }

    public void setClickType(int i10) {
        this.f33170k = i10;
    }

    public void setCountDownText(String str) {
        this.f33163d = str;
    }

    public void setLogoImage(int i10) {
        this.f33167h = i10;
    }

    public void setLogoText(String str) {
        this.f33164e = str;
    }

    public void setNoticeImage(int i10) {
        this.f33166g = i10;
    }

    public void setxInScreen(float f10) {
        this.f33168i = f10;
    }

    public void setyInScreen(float f10) {
        this.f33169j = f10;
    }
}
