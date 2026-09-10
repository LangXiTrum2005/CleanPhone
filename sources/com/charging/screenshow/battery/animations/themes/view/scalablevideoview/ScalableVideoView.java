package com.charging.screenshow.battery.animations.themes.view.scalablevideoview;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.graphics.SurfaceTexture;
import android.media.MediaPlayer;
import android.util.AttributeSet;
import android.view.Surface;
import android.view.TextureView;
import com.charging.screenshow.battery.animations.themes.R;
import java.io.FileDescriptor;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public class ScalableVideoView extends TextureView implements TextureView.SurfaceTextureListener, MediaPlayer.OnVideoSizeChangedListener {
    public MediaPlayer e0;
    public ScalableType f0;

    public ScalableVideoView(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes;
        super(context, attributeSet, 0);
        this.f0 = ScalableType.X;
        if (attributeSet == null || (typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.f13025a, 0, 0)) == null) {
            return;
        }
        int i2 = typedArrayObtainStyledAttributes.getInt(0, 0);
        typedArrayObtainStyledAttributes.recycle();
        this.f0 = ScalableType.values()[i2];
    }

    private void setDataSource(AssetFileDescriptor assetFileDescriptor) throws IOException {
        FileDescriptor fileDescriptor = assetFileDescriptor.getFileDescriptor();
        long startOffset = assetFileDescriptor.getStartOffset();
        long length = assetFileDescriptor.getLength();
        a();
        this.e0.setDataSource(fileDescriptor, startOffset, length);
        assetFileDescriptor.close();
    }

    public final void a() {
        MediaPlayer mediaPlayer = this.e0;
        if (mediaPlayer != null) {
            mediaPlayer.reset();
            return;
        }
        MediaPlayer mediaPlayer2 = new MediaPlayer();
        this.e0 = mediaPlayer2;
        mediaPlayer2.setOnVideoSizeChangedListener(this);
        setSurfaceTextureListener(this);
    }

    public final void b(int i2, int i3) {
        Matrix matrixD;
        if (i2 == 0 || i3 == 0) {
            return;
        }
        int width = getWidth();
        int height = getHeight();
        Size size = new Size(width, height);
        Size size2 = new Size(i2, i3);
        ScaleManager scaleManager = new ScaleManager();
        scaleManager.f13336a = size;
        scaleManager.f13337b = size2;
        int iOrdinal = this.f0.ordinal();
        PivotPoint pivotPoint = PivotPoint.f13334Y;
        PivotPoint pivotPoint2 = PivotPoint.Z;
        PivotPoint pivotPoint3 = PivotPoint.e0;
        PivotPoint pivotPoint4 = PivotPoint.g0;
        PivotPoint pivotPoint5 = PivotPoint.h0;
        PivotPoint pivotPoint6 = PivotPoint.i0;
        PivotPoint pivotPoint7 = PivotPoint.f0;
        PivotPoint pivotPoint8 = PivotPoint.j0;
        PivotPoint pivotPoint9 = PivotPoint.X;
        switch (iOrdinal) {
            case 0:
                matrixD = scaleManager.d(i2 / width, i3 / height, pivotPoint9);
                break;
            case 1:
                matrixD = scaleManager.d(1.0f, 1.0f, pivotPoint9);
                break;
            case 2:
                matrixD = scaleManager.b(pivotPoint9);
                break;
            case 3:
                matrixD = scaleManager.b(pivotPoint7);
                break;
            case 4:
                matrixD = scaleManager.b(pivotPoint8);
                break;
            case 5:
                matrixD = scaleManager.e(pivotPoint9);
                break;
            case 6:
                matrixD = scaleManager.e(pivotPoint);
                break;
            case 7:
                matrixD = scaleManager.e(pivotPoint2);
                break;
            case 8:
                matrixD = scaleManager.e(pivotPoint3);
                break;
            case 9:
                matrixD = scaleManager.e(pivotPoint7);
                break;
            case 10:
                matrixD = scaleManager.e(pivotPoint4);
                break;
            case 11:
                matrixD = scaleManager.e(pivotPoint5);
                break;
            case 12:
                matrixD = scaleManager.e(pivotPoint6);
                break;
            case 13:
                matrixD = scaleManager.e(pivotPoint8);
                break;
            case 14:
                matrixD = scaleManager.a(pivotPoint9);
                break;
            case 15:
                matrixD = scaleManager.a(pivotPoint);
                break;
            case 16:
                matrixD = scaleManager.a(pivotPoint2);
                break;
            case 17:
                matrixD = scaleManager.a(pivotPoint3);
                break;
            case 18:
                matrixD = scaleManager.a(pivotPoint7);
                break;
            case 19:
                matrixD = scaleManager.a(pivotPoint4);
                break;
            case 20:
                matrixD = scaleManager.a(pivotPoint5);
                break;
            case 21:
                matrixD = scaleManager.a(pivotPoint6);
                break;
            case 22:
                matrixD = scaleManager.a(pivotPoint8);
                break;
            case 23:
                matrixD = (i3 <= width && i3 <= height) ? scaleManager.e(pivotPoint9) : scaleManager.b(pivotPoint9);
                break;
            case 24:
                matrixD = (i3 <= width && i3 <= height) ? scaleManager.e(pivotPoint7) : scaleManager.b(pivotPoint7);
                break;
            case 25:
                matrixD = (i3 <= width && i3 <= height) ? scaleManager.e(pivotPoint8) : scaleManager.b(pivotPoint8);
                break;
            default:
                matrixD = null;
                break;
        }
        if (matrixD != null) {
            setTransform(matrixD);
        }
    }

    public int getCurrentPosition() {
        return this.e0.getCurrentPosition();
    }

    public int getDuration() {
        return this.e0.getDuration();
    }

    public int getVideoHeight() {
        return this.e0.getVideoHeight();
    }

    public int getVideoWidth() {
        return this.e0.getVideoWidth();
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        MediaPlayer mediaPlayer = this.e0;
        if (mediaPlayer == null) {
            return;
        }
        if (mediaPlayer.isPlaying()) {
            this.e0.stop();
        }
        this.e0.reset();
        this.e0.release();
        this.e0 = null;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i2, int i3) {
        Surface surface = new Surface(surfaceTexture);
        MediaPlayer mediaPlayer = this.e0;
        if (mediaPlayer != null) {
            mediaPlayer.setSurface(surface);
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        return false;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i2, int i3) {
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    @Override // android.media.MediaPlayer.OnVideoSizeChangedListener
    public final void onVideoSizeChanged(MediaPlayer mediaPlayer, int i2, int i3) {
        b(i2, i3);
    }

    public void setAssetData(String str) throws IOException {
        setDataSource(getContext().getAssets().openFd(str));
    }

    public void setLooping(boolean z2) {
        this.e0.setLooping(z2);
    }

    public void setOnCompletionListener(MediaPlayer.OnCompletionListener onCompletionListener) {
        this.e0.setOnCompletionListener(onCompletionListener);
    }

    public void setOnErrorListener(MediaPlayer.OnErrorListener onErrorListener) {
        this.e0.setOnErrorListener(onErrorListener);
    }

    public void setOnInfoListener(MediaPlayer.OnInfoListener onInfoListener) {
        this.e0.setOnInfoListener(onInfoListener);
    }

    public void setRawData(int i2) throws IOException {
        setDataSource(getResources().openRawResourceFd(i2));
    }

    public void setScalableType(ScalableType scalableType) {
        this.f0 = scalableType;
        b(getVideoWidth(), getVideoHeight());
    }

    public void setDataSource(String str) throws IOException {
        a();
        this.e0.setDataSource(str);
    }

    public void setDataSource(FileDescriptor fileDescriptor) throws IOException {
        a();
        this.e0.setDataSource(fileDescriptor);
    }
}
