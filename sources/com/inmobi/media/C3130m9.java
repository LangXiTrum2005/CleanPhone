package com.inmobi.media;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.inmobi.media.m9, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C3130m9 extends RelativeLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f23813a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public C3114l9 f23814b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ImageView f23815c;
    public ProgressBar d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3130m9(Context context) {
        super(context);
        Intrinsics.f(context, "context");
        this.f23813a = "m9";
        Context context2 = getContext();
        Intrinsics.e(context2, "getContext(...)");
        setVideoView(new C3114l9(context2));
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams.addRule(13);
        addView(getVideoView(), layoutParams);
        ImageView imageView = new ImageView(getContext());
        imageView.setScaleType(ImageView.ScaleType.FIT_XY);
        imageView.setVisibility(8);
        setPosterImage(imageView);
        addView(getPosterImage(), layoutParams);
        ProgressBar progressBar = new ProgressBar(getContext());
        progressBar.setVisibility(8);
        setProgressBar(progressBar);
        addView(getProgressBar(), androidx.media3.extractor.text.ttml.a.f(-2, -2, 13));
        Context context3 = getContext();
        Intrinsics.e(context3, "getContext(...)");
        C3002e9 c3002e9 = new C3002e9(context3, null, 0);
        ViewGroup.LayoutParams layoutParamsF = androidx.media3.extractor.text.ttml.a.f(-1, -1, 13);
        getVideoView().setMediaController(c3002e9);
        addView(c3002e9, layoutParamsF);
    }

    public final ImageView getPosterImage() {
        ImageView imageView = this.f23815c;
        if (imageView != null) {
            return imageView;
        }
        Intrinsics.m("posterImage");
        throw null;
    }

    public final ProgressBar getProgressBar() {
        ProgressBar progressBar = this.d;
        if (progressBar != null) {
            return progressBar;
        }
        Intrinsics.m("progressBar");
        throw null;
    }

    public final C3114l9 getVideoView() {
        C3114l9 c3114l9 = this.f23814b;
        if (c3114l9 != null) {
            return c3114l9;
        }
        Intrinsics.m("videoView");
        throw null;
    }

    public final void setPosterImage(ImageView imageView) {
        Intrinsics.f(imageView, "<set-?>");
        this.f23815c = imageView;
    }

    public final void setProgressBar(ProgressBar progressBar) {
        Intrinsics.f(progressBar, "<set-?>");
        this.d = progressBar;
    }

    public final void setVideoView(C3114l9 c3114l9) {
        Intrinsics.f(c3114l9, "<set-?>");
        this.f23814b = c3114l9;
    }

    public final void setPosterImage(Bitmap bitmap) {
        getPosterImage().setImageBitmap(bitmap);
    }
}
