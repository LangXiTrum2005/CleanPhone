package com.badlogic.gdx.maps.tiled;

import com.badlogic.gdx.graphics.Pixmap;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.maps.MapLayer;

/* JADX INFO: loaded from: classes.dex */
public class TiledMapImageLayer extends MapLayer {
    private TextureRegion region;
    private boolean repeatX;
    private boolean repeatY;
    private boolean supportsTransparency;
    private float x;
    private float y;

    /* JADX INFO: renamed from: com.badlogic.gdx.maps.tiled.TiledMapImageLayer$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$badlogic$gdx$graphics$Pixmap$Format;

        static {
            int[] iArr = new int[Pixmap.Format.values().length];
            $SwitchMap$com$badlogic$gdx$graphics$Pixmap$Format = iArr;
            try {
                iArr[Pixmap.Format.Alpha.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$badlogic$gdx$graphics$Pixmap$Format[Pixmap.Format.LuminanceAlpha.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$badlogic$gdx$graphics$Pixmap$Format[Pixmap.Format.RGBA4444.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$badlogic$gdx$graphics$Pixmap$Format[Pixmap.Format.RGBA8888.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public TiledMapImageLayer(TextureRegion textureRegion, float f, float f2, boolean z, boolean z2) {
        this.region = textureRegion;
        this.x = f;
        this.y = f2;
        this.repeatX = z;
        this.repeatY = z2;
        this.supportsTransparency = checkTransparencySupport(textureRegion);
    }

    private boolean checkTransparencySupport(TextureRegion textureRegion) {
        Pixmap.Format format = textureRegion.getTexture().getTextureData().getFormat();
        return format != null && formatHasAlpha(format);
    }

    private boolean formatHasAlpha(Pixmap.Format format) {
        int i = AnonymousClass1.$SwitchMap$com$badlogic$gdx$graphics$Pixmap$Format[format.ordinal()];
        return i == 1 || i == 2 || i == 3 || i == 4;
    }

    public TextureRegion getTextureRegion() {
        return this.region;
    }

    public float getX() {
        return this.x;
    }

    public float getY() {
        return this.y;
    }

    public boolean isRepeatX() {
        return this.repeatX;
    }

    public boolean isRepeatY() {
        return this.repeatY;
    }

    public void setRepeatX(boolean z) {
        this.repeatX = z;
    }

    public void setRepeatY(boolean z) {
        this.repeatY = z;
    }

    public void setTextureRegion(TextureRegion textureRegion) {
        this.region = textureRegion;
    }

    public void setX(float f) {
        this.x = f;
    }

    public void setY(float f) {
        this.y = f;
    }

    public boolean supportsTransparency() {
        return this.supportsTransparency;
    }
}
