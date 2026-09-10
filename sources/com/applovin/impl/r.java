package com.applovin.impl;

import android.R;
import android.app.Activity;
import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.applovin.sdk.AppLovinSdkUtils;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public class r extends Dialog {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ViewGroup f9120a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private AppLovinSdkUtils.Size f9121b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Activity f9122c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private RelativeLayout f9123d;

    public r(ViewGroup viewGroup, AppLovinSdkUtils.Size size, Activity activity) {
        super(activity, R.style.Theme.Translucent.NoTitleBar);
        this.f9120a = viewGroup;
        this.f9121b = size;
        this.f9122c = activity;
        requestWindowFeature(1);
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        this.f9123d.removeView(this.f9120a);
        super.dismiss();
    }

    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(AppLovinSdkUtils.dpToPx(this.f9122c, this.f9121b.getWidth()), AppLovinSdkUtils.dpToPx(this.f9122c, this.f9121b.getHeight()));
        layoutParams.addRule(13);
        this.f9120a.setLayoutParams(layoutParams);
        int iDpToPx = AppLovinSdkUtils.dpToPx(this.f9122c, 60);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(iDpToPx, iDpToPx);
        layoutParams2.addRule(14);
        layoutParams2.addRule(12);
        ImageButton imageButton = new ImageButton(this.f9122c);
        imageButton.setLayoutParams(layoutParams2);
        imageButton.setImageDrawable(this.f9122c.getResources().getDrawable(com.applovin.sdk.R.drawable.applovin_ic_x_mark));
        imageButton.setScaleType(ImageView.ScaleType.FIT_CENTER);
        imageButton.setColorFilter(-1);
        imageButton.setBackground(null);
        final int i10 = 0;
        imageButton.setOnClickListener(new View.OnClickListener(this) { // from class: com.applovin.impl.z9

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ r f10329b;

            {
                this.f10329b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i11 = i10;
                r rVar = this.f10329b;
                switch (i11) {
                    case 0:
                        rVar.a(view);
                        break;
                    default:
                        rVar.b(view);
                        break;
                }
            }
        });
        RelativeLayout relativeLayout = new RelativeLayout(this.f9122c);
        this.f9123d = relativeLayout;
        relativeLayout.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
        this.f9123d.setBackgroundColor(Integer.MIN_VALUE);
        this.f9123d.addView(imageButton);
        this.f9123d.addView(this.f9120a);
        final int i11 = 1;
        this.f9123d.setOnClickListener(new View.OnClickListener(this) { // from class: com.applovin.impl.z9

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ r f10329b;

            {
                this.f10329b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i12 = i11;
                r rVar = this.f10329b;
                switch (i12) {
                    case 0:
                        rVar.a(view);
                        break;
                    default:
                        rVar.b(view);
                        break;
                }
            }
        });
        setContentView(this.f9123d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(View view) {
        dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(View view) {
        dismiss();
    }
}
