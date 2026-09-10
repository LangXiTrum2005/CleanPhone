package com.bykv.vk.openvk.ri.ri.ri.di;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.util.AttributeSet;
import android.view.SurfaceHolder;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import eliminate.saneness;

/* JADX INFO: loaded from: classes2.dex */
public class ka extends TextureView implements TextureView.SurfaceTextureListener, attabal {

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
    public saneness f17962kowloon;

    public ka(Context context) {
        this(context, null);
    }

    @Override // com.bykv.vk.openvk.ri.ri.ri.di.attabal
    public void attabal(saneness sanenessVar) {
        this.f17962kowloon = sanenessVar;
        setSurfaceTextureListener(this);
    }

    @Override // com.bykv.vk.openvk.ri.ri.ri.di.attabal
    public SurfaceHolder getHolder() {
        return null;
    }

    @Override // android.view.TextureView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        try {
            super.onDetachedFromWindow();
        } catch (Throwable unused) {
        }
    }

    @Override // android.view.TextureView, android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        saneness sanenessVar = this.f17962kowloon;
        if (sanenessVar != null) {
            sanenessVar.ri(surfaceTexture, i, i2);
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        saneness sanenessVar = this.f17962kowloon;
        if (sanenessVar != null) {
            return sanenessVar.ri(surfaceTexture);
        }
        return false;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        saneness sanenessVar = this.f17962kowloon;
        if (sanenessVar != null) {
            sanenessVar.lr(surfaceTexture);
        }
    }

    @Override // android.view.View
    public void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
    }

    @Override // com.bykv.vk.openvk.ri.ri.ri.di.attabal
    public void ri(int i, int i2) {
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        layoutParams.height = i2;
        layoutParams.width = i;
        setLayoutParams(layoutParams);
    }

    public ka(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // com.bykv.vk.openvk.ri.ri.ri.di.attabal
    public View getView() {
        return this;
    }

    public void setWindowVisibilityChangedListener(attabal.InterfaceC0184attabal interfaceC0184attabal) {
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
    }
}
