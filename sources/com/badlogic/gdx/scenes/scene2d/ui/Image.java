package com.badlogic.gdx.scenes.scene2d.ui;

import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.graphics.g2d.NinePatch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.scenes.scene2d.utils.Drawable;
import com.badlogic.gdx.scenes.scene2d.utils.NinePatchDrawable;
import com.badlogic.gdx.scenes.scene2d.utils.TextureRegionDrawable;
import com.badlogic.gdx.scenes.scene2d.utils.TransformDrawable;
import com.badlogic.gdx.utils.Null;
import com.badlogic.gdx.utils.Scaling;

/* JADX INFO: loaded from: classes.dex */
public class Image extends Widget {
    private int align;
    private Drawable drawable;
    private float imageHeight;
    private float imageWidth;
    private float imageX;
    private float imageY;
    private Scaling scaling;

    public Image() {
        this((Drawable) null);
    }

    @Override // com.badlogic.gdx.scenes.scene2d.ui.Widget, com.badlogic.gdx.scenes.scene2d.Actor
    public void draw(Batch batch, float f) {
        validate();
        Color color = getColor();
        batch.setColor(color.r, color.g, color.b, color.f202a * f);
        float x = getX();
        float y = getY();
        float scaleX = getScaleX();
        float scaleY = getScaleY();
        if (this.drawable instanceof TransformDrawable) {
            float rotation = getRotation();
            if (scaleX != 1.0f || scaleY != 1.0f || rotation != 0.0f) {
                ((TransformDrawable) this.drawable).draw(batch, x + this.imageX, y + this.imageY, getOriginX() - this.imageX, getOriginY() - this.imageY, this.imageWidth, this.imageHeight, scaleX, scaleY, rotation);
                return;
            }
        }
        Drawable drawable = this.drawable;
        if (drawable != null) {
            drawable.draw(batch, x + this.imageX, y + this.imageY, this.imageWidth * scaleX, this.imageHeight * scaleY);
        }
    }

    public int getAlign() {
        return this.align;
    }

    @Null
    public Drawable getDrawable() {
        return this.drawable;
    }

    public float getImageHeight() {
        return this.imageHeight;
    }

    public float getImageWidth() {
        return this.imageWidth;
    }

    public float getImageX() {
        return this.imageX;
    }

    public float getImageY() {
        return this.imageY;
    }

    @Override // com.badlogic.gdx.scenes.scene2d.ui.Widget, com.badlogic.gdx.scenes.scene2d.utils.Layout
    public float getMinHeight() {
        return 0.0f;
    }

    @Override // com.badlogic.gdx.scenes.scene2d.ui.Widget, com.badlogic.gdx.scenes.scene2d.utils.Layout
    public float getMinWidth() {
        return 0.0f;
    }

    @Override // com.badlogic.gdx.scenes.scene2d.ui.Widget, com.badlogic.gdx.scenes.scene2d.utils.Layout
    public float getPrefHeight() {
        Drawable drawable = this.drawable;
        if (drawable != null) {
            return drawable.getMinHeight();
        }
        return 0.0f;
    }

    @Override // com.badlogic.gdx.scenes.scene2d.ui.Widget, com.badlogic.gdx.scenes.scene2d.utils.Layout
    public float getPrefWidth() {
        Drawable drawable = this.drawable;
        if (drawable != null) {
            return drawable.getMinWidth();
        }
        return 0.0f;
    }

    @Override // com.badlogic.gdx.scenes.scene2d.ui.Widget, com.badlogic.gdx.scenes.scene2d.utils.Layout
    public void layout() {
        Drawable drawable = this.drawable;
        if (drawable == null) {
            return;
        }
        float minWidth = drawable.getMinWidth();
        float minHeight = this.drawable.getMinHeight();
        float width = getWidth();
        float height = getHeight();
        Vector2 vector2Apply = this.scaling.apply(minWidth, minHeight, width, height);
        float f = vector2Apply.x;
        this.imageWidth = f;
        float f2 = vector2Apply.y;
        this.imageHeight = f2;
        int i = this.align;
        if ((i & 8) != 0) {
            this.imageX = 0.0f;
        } else if ((i & 16) != 0) {
            this.imageX = (int) (width - f);
        } else {
            this.imageX = (int) ((width / 2.0f) - (f / 2.0f));
        }
        if ((i & 2) != 0) {
            this.imageY = (int) (height - f2);
        } else if ((i & 4) != 0) {
            this.imageY = 0.0f;
        } else {
            this.imageY = (int) ((height / 2.0f) - (f2 / 2.0f));
        }
    }

    public void setAlign(int i) {
        this.align = i;
        invalidate();
    }

    public void setDrawable(Skin skin, String str) {
        setDrawable(skin.getDrawable(str));
    }

    public void setScaling(Scaling scaling) {
        if (scaling == null) {
            throw new IllegalArgumentException("scaling cannot be null.");
        }
        this.scaling = scaling;
        invalidate();
    }

    @Override // com.badlogic.gdx.scenes.scene2d.Actor
    public String toString() {
        String name = getName();
        if (name != null) {
            return name;
        }
        String name2 = getClass().getName();
        int iLastIndexOf = name2.lastIndexOf(46);
        if (iLastIndexOf != -1) {
            name2 = name2.substring(iLastIndexOf + 1);
        }
        StringBuilder sb = new StringBuilder();
        sb.append(name2.indexOf(36) != -1 ? "Image " : "");
        sb.append(name2);
        sb.append(": ");
        sb.append(this.drawable);
        return sb.toString();
    }

    public Image(@Null NinePatch ninePatch) {
        this(new NinePatchDrawable(ninePatch), Scaling.stretch, 1);
    }

    public void setDrawable(@Null Drawable drawable) {
        if (this.drawable == drawable) {
            return;
        }
        if (drawable == null || getPrefWidth() != drawable.getMinWidth() || getPrefHeight() != drawable.getMinHeight()) {
            invalidateHierarchy();
        }
        this.drawable = drawable;
    }

    public Image(@Null TextureRegion textureRegion) {
        this(new TextureRegionDrawable(textureRegion), Scaling.stretch, 1);
    }

    public Image(Texture texture) {
        this(new TextureRegionDrawable(new TextureRegion(texture)));
    }

    public Image(Skin skin, String str) {
        this(skin.getDrawable(str), Scaling.stretch, 1);
    }

    public Image(@Null Drawable drawable) {
        this(drawable, Scaling.stretch, 1);
    }

    public Image(@Null Drawable drawable, Scaling scaling) {
        this(drawable, scaling, 1);
    }

    public Image(@Null Drawable drawable, Scaling scaling, int i) {
        this.align = 1;
        setDrawable(drawable);
        this.scaling = scaling;
        this.align = i;
        setSize(getPrefWidth(), getPrefHeight());
    }
}
