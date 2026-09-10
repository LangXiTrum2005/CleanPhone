package com.facebook.ads.internal.api;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.facebook.ads.internal.dynamicloading.DynamicLoaderFactory;

/* JADX INFO: loaded from: classes3.dex */
public abstract class AdComponentFrameLayout extends FrameLayout implements AdComponentView {
    private AdComponentViewApi mAdComponentViewApi;
    private final AdComponentViewParentApi mAdComponentViewParentApi;

    public AdComponentFrameLayout(Context context) {
        super(context);
        this.mAdComponentViewParentApi = new AdComponentViewParentApi() { // from class: com.facebook.ads.internal.api.AdComponentFrameLayout.1
            @Override // com.facebook.ads.internal.api.AdComponentView
            public void addView(View view, int i2, ViewGroup.LayoutParams layoutParams) {
                AdComponentFrameLayout.super.addView(view, i2, layoutParams);
            }

            @Override // com.facebook.ads.internal.api.AdComponentViewParentApi
            public void bringChildToFront(View view) {
                AdComponentFrameLayout.super.bringChildToFront(view);
            }

            @Override // com.facebook.ads.internal.api.AdComponentViewParentApi
            public void onAttachedToWindow() {
                AdComponentFrameLayout.super.onAttachedToWindow();
            }

            @Override // com.facebook.ads.internal.api.AdComponentViewParentApi
            public void onDetachedFromWindow() {
                AdComponentFrameLayout.super.onDetachedFromWindow();
            }

            @Override // com.facebook.ads.internal.api.AdComponentViewParentApi
            public void onMeasure(int i2, int i3) {
                AdComponentFrameLayout.super.onMeasure(i2, i3);
            }

            @Override // com.facebook.ads.internal.api.AdComponentViewParentApi
            public void onVisibilityChanged(View view, int i2) {
                AdComponentFrameLayout.super.onVisibilityChanged(view, i2);
            }

            @Override // com.facebook.ads.internal.api.AdComponentView
            public void onWindowFocusChanged(boolean z2) {
                AdComponentFrameLayout.super.onWindowFocusChanged(z2);
            }

            @Override // com.facebook.ads.internal.api.AdComponentView
            public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
                AdComponentFrameLayout.super.setLayoutParams(layoutParams);
            }

            @Override // com.facebook.ads.internal.api.AdComponentViewParentApi
            public void setMeasuredDimension(int i2, int i3) {
                AdComponentFrameLayout.super.setMeasuredDimension(i2, i3);
            }

            @Override // com.facebook.ads.internal.api.AdComponentView
            public void addView(View view) {
                AdComponentFrameLayout.super.addView(view);
            }

            @Override // com.facebook.ads.internal.api.AdComponentView
            public void addView(View view, int i2) {
                AdComponentFrameLayout.super.addView(view, i2);
            }

            @Override // com.facebook.ads.internal.api.AdComponentView, android.view.ViewManager
            public void addView(View view, ViewGroup.LayoutParams layoutParams) {
                AdComponentFrameLayout.super.addView(view, layoutParams);
            }

            @Override // com.facebook.ads.internal.api.AdComponentView
            public void addView(View view, int i2, int i3) {
                AdComponentFrameLayout.super.addView(view, i2, i3);
            }
        };
    }

    @Override // android.view.ViewGroup, com.facebook.ads.internal.api.AdComponentView
    public void addView(View view) {
        AdComponentViewApi adComponentViewApi = this.mAdComponentViewApi;
        if (adComponentViewApi != null) {
            adComponentViewApi.addView(view);
        } else {
            super.addView(view);
        }
    }

    public void attachAdComponentViewApi(AdComponentViewApiProvider adComponentViewApiProvider) {
        if (DynamicLoaderFactory.isFallbackMode()) {
            return;
        }
        if (this.mAdComponentViewApi != null) {
            throw new IllegalStateException("AdComponentViewApi can't be attached more then once.");
        }
        adComponentViewApiProvider.getAdComponentViewApi().onAttachedToView(this, this.mAdComponentViewParentApi);
        this.mAdComponentViewApi = adComponentViewApiProvider.getAdComponentViewApi();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        AdComponentViewApi adComponentViewApi = this.mAdComponentViewApi;
        if (adComponentViewApi != null) {
            adComponentViewApi.onAttachedToWindow();
        } else {
            super.onAttachedToWindow();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        AdComponentViewApi adComponentViewApi = this.mAdComponentViewApi;
        if (adComponentViewApi != null) {
            adComponentViewApi.onDetachedFromWindow();
        } else {
            super.onDetachedFromWindow();
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i2, int i3) {
        AdComponentViewApi adComponentViewApi = this.mAdComponentViewApi;
        if (adComponentViewApi != null) {
            adComponentViewApi.onMeasure(i2, i3);
        } else {
            super.onMeasure(i2, i3);
        }
    }

    @Override // android.view.View
    public void onVisibilityChanged(View view, int i2) {
        AdComponentViewApi adComponentViewApi = this.mAdComponentViewApi;
        if (adComponentViewApi != null) {
            adComponentViewApi.onVisibilityChanged(view, i2);
        } else {
            super.onVisibilityChanged(view, i2);
        }
    }

    @Override // android.view.View, com.facebook.ads.internal.api.AdComponentView
    public void onWindowFocusChanged(boolean z2) {
        AdComponentViewApi adComponentViewApi = this.mAdComponentViewApi;
        if (adComponentViewApi != null) {
            adComponentViewApi.onWindowFocusChanged(z2);
        } else {
            super.onWindowFocusChanged(z2);
        }
    }

    @Override // android.view.View, com.facebook.ads.internal.api.AdComponentView
    public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
        AdComponentViewApi adComponentViewApi = this.mAdComponentViewApi;
        if (adComponentViewApi != null) {
            adComponentViewApi.setLayoutParams(layoutParams);
        } else {
            super.setLayoutParams(layoutParams);
        }
    }

    public AdComponentFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mAdComponentViewParentApi = new AdComponentViewParentApi() { // from class: com.facebook.ads.internal.api.AdComponentFrameLayout.1
            @Override // com.facebook.ads.internal.api.AdComponentView
            public void addView(View view, int i2, ViewGroup.LayoutParams layoutParams) {
                AdComponentFrameLayout.super.addView(view, i2, layoutParams);
            }

            @Override // com.facebook.ads.internal.api.AdComponentViewParentApi
            public void bringChildToFront(View view) {
                AdComponentFrameLayout.super.bringChildToFront(view);
            }

            @Override // com.facebook.ads.internal.api.AdComponentViewParentApi
            public void onAttachedToWindow() {
                AdComponentFrameLayout.super.onAttachedToWindow();
            }

            @Override // com.facebook.ads.internal.api.AdComponentViewParentApi
            public void onDetachedFromWindow() {
                AdComponentFrameLayout.super.onDetachedFromWindow();
            }

            @Override // com.facebook.ads.internal.api.AdComponentViewParentApi
            public void onMeasure(int i2, int i3) {
                AdComponentFrameLayout.super.onMeasure(i2, i3);
            }

            @Override // com.facebook.ads.internal.api.AdComponentViewParentApi
            public void onVisibilityChanged(View view, int i2) {
                AdComponentFrameLayout.super.onVisibilityChanged(view, i2);
            }

            @Override // com.facebook.ads.internal.api.AdComponentView
            public void onWindowFocusChanged(boolean z2) {
                AdComponentFrameLayout.super.onWindowFocusChanged(z2);
            }

            @Override // com.facebook.ads.internal.api.AdComponentView
            public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
                AdComponentFrameLayout.super.setLayoutParams(layoutParams);
            }

            @Override // com.facebook.ads.internal.api.AdComponentViewParentApi
            public void setMeasuredDimension(int i2, int i3) {
                AdComponentFrameLayout.super.setMeasuredDimension(i2, i3);
            }

            @Override // com.facebook.ads.internal.api.AdComponentView
            public void addView(View view) {
                AdComponentFrameLayout.super.addView(view);
            }

            @Override // com.facebook.ads.internal.api.AdComponentView
            public void addView(View view, int i2) {
                AdComponentFrameLayout.super.addView(view, i2);
            }

            @Override // com.facebook.ads.internal.api.AdComponentView, android.view.ViewManager
            public void addView(View view, ViewGroup.LayoutParams layoutParams) {
                AdComponentFrameLayout.super.addView(view, layoutParams);
            }

            @Override // com.facebook.ads.internal.api.AdComponentView
            public void addView(View view, int i2, int i3) {
                AdComponentFrameLayout.super.addView(view, i2, i3);
            }
        };
    }

    @Override // android.view.ViewGroup, com.facebook.ads.internal.api.AdComponentView
    public void addView(View view, int i2) {
        AdComponentViewApi adComponentViewApi = this.mAdComponentViewApi;
        if (adComponentViewApi != null) {
            adComponentViewApi.addView(view, i2);
        } else {
            super.addView(view, i2);
        }
    }

    public AdComponentFrameLayout(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.mAdComponentViewParentApi = new AdComponentViewParentApi() { // from class: com.facebook.ads.internal.api.AdComponentFrameLayout.1
            @Override // com.facebook.ads.internal.api.AdComponentView
            public void addView(View view, int i3, ViewGroup.LayoutParams layoutParams) {
                AdComponentFrameLayout.super.addView(view, i3, layoutParams);
            }

            @Override // com.facebook.ads.internal.api.AdComponentViewParentApi
            public void bringChildToFront(View view) {
                AdComponentFrameLayout.super.bringChildToFront(view);
            }

            @Override // com.facebook.ads.internal.api.AdComponentViewParentApi
            public void onAttachedToWindow() {
                AdComponentFrameLayout.super.onAttachedToWindow();
            }

            @Override // com.facebook.ads.internal.api.AdComponentViewParentApi
            public void onDetachedFromWindow() {
                AdComponentFrameLayout.super.onDetachedFromWindow();
            }

            @Override // com.facebook.ads.internal.api.AdComponentViewParentApi
            public void onMeasure(int i3, int i4) {
                AdComponentFrameLayout.super.onMeasure(i3, i4);
            }

            @Override // com.facebook.ads.internal.api.AdComponentViewParentApi
            public void onVisibilityChanged(View view, int i3) {
                AdComponentFrameLayout.super.onVisibilityChanged(view, i3);
            }

            @Override // com.facebook.ads.internal.api.AdComponentView
            public void onWindowFocusChanged(boolean z2) {
                AdComponentFrameLayout.super.onWindowFocusChanged(z2);
            }

            @Override // com.facebook.ads.internal.api.AdComponentView
            public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
                AdComponentFrameLayout.super.setLayoutParams(layoutParams);
            }

            @Override // com.facebook.ads.internal.api.AdComponentViewParentApi
            public void setMeasuredDimension(int i3, int i4) {
                AdComponentFrameLayout.super.setMeasuredDimension(i3, i4);
            }

            @Override // com.facebook.ads.internal.api.AdComponentView
            public void addView(View view) {
                AdComponentFrameLayout.super.addView(view);
            }

            @Override // com.facebook.ads.internal.api.AdComponentView
            public void addView(View view, int i3) {
                AdComponentFrameLayout.super.addView(view, i3);
            }

            @Override // com.facebook.ads.internal.api.AdComponentView, android.view.ViewManager
            public void addView(View view, ViewGroup.LayoutParams layoutParams) {
                AdComponentFrameLayout.super.addView(view, layoutParams);
            }

            @Override // com.facebook.ads.internal.api.AdComponentView
            public void addView(View view, int i3, int i4) {
                AdComponentFrameLayout.super.addView(view, i3, i4);
            }
        };
    }

    public AdComponentFrameLayout(Context context, AttributeSet attributeSet, int i2, int i3) {
        super(context, attributeSet, i2, i3);
        this.mAdComponentViewParentApi = new AdComponentViewParentApi() { // from class: com.facebook.ads.internal.api.AdComponentFrameLayout.1
            @Override // com.facebook.ads.internal.api.AdComponentView
            public void addView(View view, int i4, ViewGroup.LayoutParams layoutParams) {
                AdComponentFrameLayout.super.addView(view, i4, layoutParams);
            }

            @Override // com.facebook.ads.internal.api.AdComponentViewParentApi
            public void bringChildToFront(View view) {
                AdComponentFrameLayout.super.bringChildToFront(view);
            }

            @Override // com.facebook.ads.internal.api.AdComponentViewParentApi
            public void onAttachedToWindow() {
                AdComponentFrameLayout.super.onAttachedToWindow();
            }

            @Override // com.facebook.ads.internal.api.AdComponentViewParentApi
            public void onDetachedFromWindow() {
                AdComponentFrameLayout.super.onDetachedFromWindow();
            }

            @Override // com.facebook.ads.internal.api.AdComponentViewParentApi
            public void onMeasure(int i4, int i5) {
                AdComponentFrameLayout.super.onMeasure(i4, i5);
            }

            @Override // com.facebook.ads.internal.api.AdComponentViewParentApi
            public void onVisibilityChanged(View view, int i4) {
                AdComponentFrameLayout.super.onVisibilityChanged(view, i4);
            }

            @Override // com.facebook.ads.internal.api.AdComponentView
            public void onWindowFocusChanged(boolean z2) {
                AdComponentFrameLayout.super.onWindowFocusChanged(z2);
            }

            @Override // com.facebook.ads.internal.api.AdComponentView
            public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
                AdComponentFrameLayout.super.setLayoutParams(layoutParams);
            }

            @Override // com.facebook.ads.internal.api.AdComponentViewParentApi
            public void setMeasuredDimension(int i4, int i5) {
                AdComponentFrameLayout.super.setMeasuredDimension(i4, i5);
            }

            @Override // com.facebook.ads.internal.api.AdComponentView
            public void addView(View view) {
                AdComponentFrameLayout.super.addView(view);
            }

            @Override // com.facebook.ads.internal.api.AdComponentView
            public void addView(View view, int i4) {
                AdComponentFrameLayout.super.addView(view, i4);
            }

            @Override // com.facebook.ads.internal.api.AdComponentView, android.view.ViewManager
            public void addView(View view, ViewGroup.LayoutParams layoutParams) {
                AdComponentFrameLayout.super.addView(view, layoutParams);
            }

            @Override // com.facebook.ads.internal.api.AdComponentView
            public void addView(View view, int i4, int i5) {
                AdComponentFrameLayout.super.addView(view, i4, i5);
            }
        };
    }

    @Override // android.view.ViewGroup, android.view.ViewManager, com.facebook.ads.internal.api.AdComponentView
    public void addView(View view, ViewGroup.LayoutParams layoutParams) {
        AdComponentViewApi adComponentViewApi = this.mAdComponentViewApi;
        if (adComponentViewApi != null) {
            adComponentViewApi.addView(view, layoutParams);
        } else {
            super.addView(view, layoutParams);
        }
    }

    @Override // android.view.ViewGroup, com.facebook.ads.internal.api.AdComponentView
    public void addView(View view, int i2, int i3) {
        AdComponentViewApi adComponentViewApi = this.mAdComponentViewApi;
        if (adComponentViewApi != null) {
            adComponentViewApi.addView(view, i2, i3);
        } else {
            super.addView(view, i2, i3);
        }
    }

    @Override // android.view.ViewGroup, com.facebook.ads.internal.api.AdComponentView
    public void addView(View view, int i2, ViewGroup.LayoutParams layoutParams) {
        AdComponentViewApi adComponentViewApi = this.mAdComponentViewApi;
        if (adComponentViewApi != null) {
            adComponentViewApi.addView(view, i2, layoutParams);
        } else {
            super.addView(view, i2, layoutParams);
        }
    }
}
