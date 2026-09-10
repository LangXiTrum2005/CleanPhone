package com.startapp.sdk.adsbase.adinformation;

import android.content.Context;
import android.graphics.Color;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.startapp.sdk.adsbase.model.AdPreferences;
import com.startapp.sdk.internal.c0;
import com.startapp.sdk.internal.i0;
import com.startapp.sdk.internal.li;
import com.vungle.ads.internal.protos.Sdk;

/* JADX INFO: loaded from: classes6.dex */
public class AdInformationView extends RelativeLayout {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int f40600e = Color.rgb(0, Sdk.SDKError.Reason.AD_RESPONSE_TIMED_OUT_VALUE, 134);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final RelativeLayout f40601a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AdInformationConfig f40602b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ImageResourceConfig f40603c;
    private final AdInformationPositions.Position d;

    public AdInformationView(Context context, AdInformationObject$Size adInformationObject$Size, AdPreferences.Placement placement, AdInformationOverrides adInformationOverrides, a aVar, boolean z2) {
        super(context);
        c0 c0Var = new c0(aVar);
        AdInformationConfig adInformationConfigA = AdInformationMetaData.c().a();
        this.f40602b = adInformationConfigA;
        if (adInformationConfigA == null) {
            this.f40602b = AdInformationConfig.createAdInformationConfig();
        }
        ImageResourceConfig imageResourceConfig = this.f40602b.getImageResourceConfig(adInformationObject$Size.a());
        this.f40603c = imageResourceConfig;
        if (adInformationOverrides == null || !adInformationOverrides.e()) {
            this.d = this.f40602b.getPosition(placement);
        } else {
            this.d = adInformationOverrides.b();
        }
        ImageView imageView = new ImageView(getContext());
        imageView.setContentDescription("info");
        imageView.setId(i0.f41077i);
        imageView.setImageBitmap(imageResourceConfig.a(getContext()));
        RelativeLayout relativeLayout = new RelativeLayout(getContext());
        this.f40601a = relativeLayout;
        relativeLayout.setBackgroundColor(0);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(li.a(getContext(), imageResourceConfig.d()), li.a(getContext(), imageResourceConfig.a()));
        layoutParams.setMargins(0, 0, 0, 0);
        imageView.setPadding(0, 0, 0, 0);
        this.d.addRules(layoutParams);
        relativeLayout.addView(imageView, layoutParams);
        relativeLayout.setOnClickListener(c0Var);
        if (z2) {
            TextView textView = new TextView(getContext());
            textView.setText("AD");
            textView.setTextColor(f40600e);
            textView.setTextSize(1, adInformationObject$Size == AdInformationObject$Size.LARGE ? 18.0f : 12.0f);
            RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(li.a(getContext(), imageResourceConfig.d()), li.a(getContext(), imageResourceConfig.a()));
            layoutParams2.setMargins(0, 0, 0, 0);
            textView.setPadding(0, 0, 0, 0);
            layoutParams2.addRule(17, imageView.getId());
            layoutParams2.addRule(8, imageView.getId());
            relativeLayout.addView(textView, layoutParams2);
        }
        addView(relativeLayout, new RelativeLayout.LayoutParams(b(), a()));
    }

    public final int a() {
        return (int) (this.f40602b.getFatFingerFactor() * li.a(getContext(), this.f40603c.a()));
    }

    public final int b() {
        return (int) (this.f40602b.getFatFingerFactor() * li.a(getContext(), this.f40603c.d()));
    }

    public final int c() {
        return li.a(getContext(), this.f40603c.a());
    }

    public final AdInformationPositions.Position d() {
        AdInformationPositions.Position position = this.d;
        return position != null ? position : AdInformationPositions.Position.BOTTOM_LEFT;
    }

    public final int e() {
        return li.a(getContext(), this.f40603c.d());
    }
}
