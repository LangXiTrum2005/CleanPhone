package com.startapp.sdk.internal;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.applovin.impl.Z;
import com.startapp.sdk.adsbase.AdsCommonMetaData;
import com.startapp.sdk.adsbase.remoteconfig.MetaDataStyle;
import com.startapp.sdk.json.RatingBar;
import com.startapp.startappsdk.R;

/* JADX INFO: loaded from: classes6.dex */
public final class tb {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f41514h = R.id.io_start_list3d_photo;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f41515i = R.id.io_start_list3d_title;
    public static final int j = R.id.io_start_list3d_description;
    public static final int k = R.id.io_start_list3d_download;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f41516l = R.id.io_start_list3d_rating;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RelativeLayout f41517a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ImageView f41518b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextView f41519c;
    public final TextView d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final TextView f41520e;
    public final RatingBar f;
    public MetaDataStyle g = null;

    public tb(Context context) {
        context.setTheme(android.R.style.Theme);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-2, -2);
        RelativeLayout relativeLayout = new RelativeLayout(context);
        this.f41517a = relativeLayout;
        relativeLayout.setBackgroundDrawable(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{AdsCommonMetaData.k().p(), AdsCommonMetaData.k().o()}));
        relativeLayout.setLayoutParams(layoutParams);
        int iRound = Math.round(TypedValue.applyDimension(1, 3, context.getResources().getDisplayMetrics()));
        int iRound2 = Math.round(TypedValue.applyDimension(1, 4, context.getResources().getDisplayMetrics()));
        int iRound3 = Math.round(TypedValue.applyDimension(1, 5, context.getResources().getDisplayMetrics()));
        int iRound4 = Math.round(TypedValue.applyDimension(1, 6, context.getResources().getDisplayMetrics()));
        int iRound5 = Math.round(TypedValue.applyDimension(1, 10, context.getResources().getDisplayMetrics()));
        int iRound6 = Math.round(TypedValue.applyDimension(1, 84, context.getResources().getDisplayMetrics()));
        relativeLayout.setPadding(iRound5, iRound, iRound5, iRound);
        relativeLayout.setTag(this);
        ImageView imageView = new ImageView(context);
        this.f41518b = imageView;
        int i2 = f41514h;
        imageView.setId(i2);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(iRound6, iRound6);
        layoutParams2.addRule(15);
        imageView.setLayoutParams(layoutParams2);
        imageView.setPadding(0, 0, iRound4, 0);
        TextView textView = new TextView(context);
        this.f41519c = textView;
        int i3 = f41515i;
        textView.setId(i3);
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams3.addRule(17, i2);
        layoutParams3.addRule(6, i2);
        textView.setLayoutParams(layoutParams3);
        textView.setPadding(0, 0, 0, iRound3);
        textView.setTextColor(AdsCommonMetaData.k().q().intValue());
        textView.setTextSize(AdsCommonMetaData.k().s().intValue());
        textView.setSingleLine(true);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        li.a(textView, AdsCommonMetaData.k().r());
        TextView textView2 = new TextView(context);
        this.d = textView2;
        textView2.setId(j);
        RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams4.addRule(17, i2);
        layoutParams4.addRule(3, i3);
        layoutParams4.setMargins(0, 0, 0, iRound3);
        textView2.setLayoutParams(layoutParams4);
        textView2.setTextColor(AdsCommonMetaData.k().l().intValue());
        textView2.setTextSize(AdsCommonMetaData.k().n().intValue());
        textView2.setSingleLine(true);
        textView2.setEllipsize(truncateAt);
        li.a(textView2, AdsCommonMetaData.k().m());
        RatingBar ratingBar = new RatingBar(context);
        this.f = ratingBar;
        RelativeLayout.LayoutParams layoutParamsG = Z.g(-2, -2, 17, i2);
        layoutParamsG.addRule(8, i2);
        layoutParamsG.setMargins(0, 0, 0, -iRound3);
        ratingBar.setLayoutParams(layoutParamsG);
        ratingBar.setPadding(0, 0, 0, iRound2);
        ratingBar.setId(f41516l);
        TextView textView3 = new TextView(context);
        this.f41520e = textView3;
        RelativeLayout.LayoutParams layoutParams5 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams5.addRule(21);
        layoutParams5.addRule(8, i2);
        textView3.setLayoutParams(layoutParams5);
        textView3.setText("Download");
        textView3.setTextColor(-1);
        textView3.setTextSize(12.0f);
        textView3.setTypeface(null, 1);
        textView3.setPadding(iRound5, iRound4, iRound5, iRound4);
        textView3.setId(k);
        textView3.setShadowLayer(2.5f, -3.0f, 3.0f, -9013642);
        textView3.setBackgroundDrawable(new sb(new RoundRectShape(new float[]{10.0f, 10.0f, 10.0f, 10.0f, 10.0f, 10.0f, 10.0f, 10.0f}, null, null)));
        relativeLayout.addView(imageView);
        relativeLayout.addView(textView);
        relativeLayout.addView(textView2);
        relativeLayout.addView(ratingBar);
        relativeLayout.addView(textView3);
    }
}
