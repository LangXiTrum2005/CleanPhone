package com.facebook.ads;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.facebook.ads.internal.api.AdNativeComponentView;
import com.facebook.ads.internal.api.AdViewConstructorParams;
import com.facebook.ads.internal.api.MediaViewApi;
import com.facebook.ads.internal.dynamicloading.DynamicLoaderFactory;

/* JADX INFO: loaded from: classes3.dex */
public class MediaView extends AdNativeComponentView {
    private AdViewConstructorParams mConstructorParams;
    private MediaViewApi mMediaViewApi;

    public MediaView(Context context) {
        super(context);
        initializeSelf(new AdViewConstructorParams(context));
    }

    private void initializeSelf(AdViewConstructorParams adViewConstructorParams) {
        this.mConstructorParams = adViewConstructorParams;
        MediaViewApi mediaViewApiCreateMediaViewApi = DynamicLoaderFactory.makeLoader(adViewConstructorParams.getContext()).createMediaViewApi();
        this.mMediaViewApi = mediaViewApiCreateMediaViewApi;
        attachAdComponentViewApi(mediaViewApiCreateMediaViewApi);
        this.mMediaViewApi.initialize(adViewConstructorParams, this);
    }

    public void destroy() {
        this.mMediaViewApi.destroy();
    }

    @Override // com.facebook.ads.internal.api.AdNativeComponentView
    public View getAdContentsView() {
        return this.mMediaViewApi.getAdContentsView();
    }

    public int getMediaHeight() {
        return this.mMediaViewApi.getMediaHeight();
    }

    public MediaViewApi getMediaViewApi() {
        return this.mMediaViewApi;
    }

    public int getMediaWidth() {
        return this.mMediaViewApi.getMediaWidth();
    }

    public int getVideoDuration() {
        return this.mMediaViewApi.getVideoDuration();
    }

    public boolean isVideoContent() {
        return this.mMediaViewApi.isVideoContent();
    }

    public void repair(Throwable th) {
        post(new Runnable() { // from class: com.facebook.ads.MediaView.1
            @Override // java.lang.Runnable
            public final void run() {
                MediaView mediaView = MediaView.this;
                mediaView.removeAllViews();
                ((AdNativeComponentView) mediaView).mAdComponentViewApi = null;
                mediaView.mMediaViewApi = DynamicLoaderFactory.makeLoader(mediaView.mConstructorParams.getContext()).createMediaViewApi();
                mediaView.attachAdComponentViewApi(mediaView.mMediaViewApi);
                mediaView.mMediaViewApi.initialize(mediaView.mConstructorParams, mediaView);
            }
        });
    }

    public void setListener(MediaViewListener mediaViewListener) {
        this.mMediaViewApi.setListener(mediaViewListener);
    }

    public void setVideoRenderer(MediaViewVideoRenderer mediaViewVideoRenderer) {
        this.mMediaViewApi.setVideoRenderer(mediaViewVideoRenderer);
    }

    public MediaView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        initializeSelf(new AdViewConstructorParams(context, attributeSet));
    }

    public MediaView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        initializeSelf(new AdViewConstructorParams(context, attributeSet, i2));
    }

    public MediaView(Context context, AttributeSet attributeSet, int i2, int i3) {
        super(context, attributeSet, i2, i3);
        initializeSelf(new AdViewConstructorParams(context, attributeSet, i2, i3));
    }
}
