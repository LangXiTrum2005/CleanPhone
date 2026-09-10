package com.applovin.impl;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import com.applovin.adview.AppLovinAdView;
import com.applovin.sdk.AppLovinSdkUtils;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public class d2 extends x1 {
    public d2(com.applovin.impl.sdk.ad.b bVar, Activity activity, com.applovin.impl.sdk.l lVar) {
        super(bVar, activity, lVar);
    }

    @Override // com.applovin.impl.x1
    public /* bridge */ /* synthetic */ void a(com.applovin.impl.adview.g gVar) {
        super.a(gVar);
    }

    @Override // com.applovin.impl.x1
    public /* bridge */ /* synthetic */ void a(View view) {
        super.a(view);
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0088  */
    /* JADX WARN: Code duplicated, block: B:20:0x0090  */
    /* JADX WARN: Code duplicated, block: B:23:0x009e  */
    /* JADX WARN: Code duplicated, block: B:25:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:27:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:29:0x0131  */
    /* JADX WARN: Code duplicated, block: B:31:0x0153  */
    /* JADX WARN: Code duplicated, block: B:33:0x015d  */
    /* JADX WARN: Code duplicated, block: B:35:0x019e  */
    /* JADX WARN: Code duplicated, block: B:37:0x01a7  */
    /* JADX WARN: Code duplicated, block: B:39:0x01ad  */
    public void a(ImageView imageView, com.applovin.impl.adview.g gVar, a aVar, ProgressBar progressBar, k0 k0Var, View view, View view2, AppLovinAdView appLovinAdView, com.applovin.impl.adview.k kVar, ImageView imageView2, ViewGroup viewGroup) {
        int i10;
        FrameLayout.LayoutParams layoutParams;
        r7 r7Var;
        if (this.f9987c.h0() == com.applovin.impl.sdk.ad.b.e.TOP) {
            layoutParams = new FrameLayout.LayoutParams(-1, -2, 48);
        } else if (this.f9987c.h0() == com.applovin.impl.sdk.ad.b.e.BOTTOM) {
            layoutParams = new FrameLayout.LayoutParams(-1, -2, 80);
        } else {
            if (this.f9987c.h0() == com.applovin.impl.sdk.ad.b.e.LEFT) {
                layoutParams = new FrameLayout.LayoutParams(-2, -1, 3);
            } else if (this.f9987c.h0() == com.applovin.impl.sdk.ad.b.e.RIGHT) {
                i10 = 5;
                layoutParams = new FrameLayout.LayoutParams(-2, -1, 5);
            } else {
                i10 = 5;
                layoutParams = this.f9989e;
            }
            appLovinAdView.setLayoutParams(this.f9989e);
            this.f9988d.addView(appLovinAdView);
            view2.setLayoutParams(this.f9989e);
            this.f9988d.addView(view2);
            view.setLayoutParams(layoutParams);
            this.f9988d.addView(view);
            if (gVar != null) {
                if (this.f9987c.y0()) {
                    i10 = 3;
                }
                a(this.f9987c.n(), i10 | 48, gVar);
            }
            if (imageView != null) {
                int iDpToPx = AppLovinSdkUtils.dpToPx(this.f9986b, ((Integer) this.f9985a.a(z4.f10166i2)).intValue());
                FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(iDpToPx, iDpToPx, ((Integer) this.f9985a.a(z4.f10184k2)).intValue());
                int iDpToPx2 = AppLovinSdkUtils.dpToPx(this.f9986b, ((Integer) this.f9985a.a(z4.f10175j2)).intValue());
                layoutParams2.setMargins(iDpToPx2, iDpToPx2, iDpToPx2, iDpToPx2);
                this.f9988d.addView(imageView, layoutParams2);
            }
            if (aVar != null) {
                this.f9988d.addView(aVar, this.f9989e);
            }
            if (k0Var != null) {
                int iDpToPx3 = AppLovinSdkUtils.dpToPx(this.f9986b, ((Integer) this.f9985a.a(z4.V1)).intValue());
                FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(iDpToPx3, iDpToPx3, ((Integer) this.f9985a.a(z4.U1)).intValue());
                int iDpToPx4 = AppLovinSdkUtils.dpToPx(this.f9986b, ((Integer) this.f9985a.a(z4.T1)).intValue());
                layoutParams3.setMargins(iDpToPx4, iDpToPx4, iDpToPx4, iDpToPx4);
                this.f9988d.addView(k0Var, layoutParams3);
            }
            if (progressBar != null) {
                FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams(-1, 20, 80);
                layoutParams4.setMargins(0, 0, 0, ((Integer) this.f9985a.a(z4.f10209n2)).intValue());
                this.f9988d.addView(progressBar, layoutParams4);
            }
            if (imageView2 != null) {
                r7Var = (r7) this.f9987c;
                if (r7Var.n1()) {
                    int iDpToPx5 = AppLovinSdkUtils.dpToPx(this.f9986b, r7Var.h1().g());
                    int iDpToPx6 = AppLovinSdkUtils.dpToPx(this.f9986b, r7Var.h1().d());
                    int iDpToPx7 = AppLovinSdkUtils.dpToPx(this.f9986b, ((Integer) this.f9985a.a(z4.c5)).intValue());
                    FrameLayout.LayoutParams layoutParams5 = new FrameLayout.LayoutParams(iDpToPx5, iDpToPx6, 83);
                    layoutParams5.setMargins(iDpToPx7, iDpToPx7, iDpToPx7, iDpToPx7);
                    this.f9988d.addView(imageView2, layoutParams5);
                }
            }
            if (kVar != null) {
                this.f9988d.addView(kVar, this.f9989e);
            }
            if (viewGroup != null) {
                viewGroup.addView(this.f9988d);
            } else {
                this.f9986b.setContentView(this.f9988d);
            }
        }
        i10 = 5;
        appLovinAdView.setLayoutParams(this.f9989e);
        this.f9988d.addView(appLovinAdView);
        view2.setLayoutParams(this.f9989e);
        this.f9988d.addView(view2);
        view.setLayoutParams(layoutParams);
        this.f9988d.addView(view);
        if (gVar != null) {
            if (this.f9987c.y0()) {
                i10 = 3;
            }
            a(this.f9987c.n(), i10 | 48, gVar);
        }
        if (imageView != null) {
            int iDpToPx8 = AppLovinSdkUtils.dpToPx(this.f9986b, ((Integer) this.f9985a.a(z4.f10166i2)).intValue());
            FrameLayout.LayoutParams layoutParams6 = new FrameLayout.LayoutParams(iDpToPx8, iDpToPx8, ((Integer) this.f9985a.a(z4.f10184k2)).intValue());
            int iDpToPx9 = AppLovinSdkUtils.dpToPx(this.f9986b, ((Integer) this.f9985a.a(z4.f10175j2)).intValue());
            layoutParams6.setMargins(iDpToPx9, iDpToPx9, iDpToPx9, iDpToPx9);
            this.f9988d.addView(imageView, layoutParams6);
        }
        if (aVar != null) {
            this.f9988d.addView(aVar, this.f9989e);
        }
        if (k0Var != null) {
            int iDpToPx10 = AppLovinSdkUtils.dpToPx(this.f9986b, ((Integer) this.f9985a.a(z4.V1)).intValue());
            FrameLayout.LayoutParams layoutParams7 = new FrameLayout.LayoutParams(iDpToPx10, iDpToPx10, ((Integer) this.f9985a.a(z4.U1)).intValue());
            int iDpToPx11 = AppLovinSdkUtils.dpToPx(this.f9986b, ((Integer) this.f9985a.a(z4.T1)).intValue());
            layoutParams7.setMargins(iDpToPx11, iDpToPx11, iDpToPx11, iDpToPx11);
            this.f9988d.addView(k0Var, layoutParams7);
        }
        if (progressBar != null) {
            FrameLayout.LayoutParams layoutParams8 = new FrameLayout.LayoutParams(-1, 20, 80);
            layoutParams8.setMargins(0, 0, 0, ((Integer) this.f9985a.a(z4.f10209n2)).intValue());
            this.f9988d.addView(progressBar, layoutParams8);
        }
        if (imageView2 != null) {
            r7Var = (r7) this.f9987c;
            if (r7Var.n1()) {
                int iDpToPx12 = AppLovinSdkUtils.dpToPx(this.f9986b, r7Var.h1().g());
                int iDpToPx13 = AppLovinSdkUtils.dpToPx(this.f9986b, r7Var.h1().d());
                int iDpToPx14 = AppLovinSdkUtils.dpToPx(this.f9986b, ((Integer) this.f9985a.a(z4.c5)).intValue());
                FrameLayout.LayoutParams layoutParams9 = new FrameLayout.LayoutParams(iDpToPx12, iDpToPx13, 83);
                layoutParams9.setMargins(iDpToPx14, iDpToPx14, iDpToPx14, iDpToPx14);
                this.f9988d.addView(imageView2, layoutParams9);
            }
        }
        if (kVar != null) {
            this.f9988d.addView(kVar, this.f9989e);
        }
        if (viewGroup != null) {
            viewGroup.addView(this.f9988d);
        } else {
            this.f9986b.setContentView(this.f9988d);
        }
    }

    public void a(com.applovin.impl.adview.g gVar, com.applovin.impl.adview.k kVar, View view, ProgressBar progressBar) {
        if (view != null) {
            view.setVisibility(0);
        }
        if (((Boolean) this.f9985a.a(z4.Z6)).booleanValue()) {
            s.b(this.f9988d, view);
        } else {
            s.a(this.f9988d, view);
        }
        if (gVar != null) {
            a(this.f9987c.n(), (this.f9987c.s0() ? 3 : 5) | 48, gVar);
        }
        if (progressBar != null) {
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, 20, ((Boolean) this.f9985a.a(z4.f10261u2)).booleanValue() ? 80 : 48);
            layoutParams.setMargins(0, 0, 0, ((Integer) this.f9985a.a(z4.f10268v2)).intValue());
            this.f9988d.addView(progressBar, layoutParams);
        }
        if (kVar != null) {
            this.f9988d.addView(kVar, this.f9989e);
        }
    }
}
