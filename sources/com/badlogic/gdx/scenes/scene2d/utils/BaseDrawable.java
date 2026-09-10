package com.badlogic.gdx.scenes.scene2d.utils;

import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.utils.Null;
import com.badlogic.gdx.utils.reflect.ClassReflection;

/* JADX INFO: loaded from: classes.dex */
public class BaseDrawable implements Drawable {
    private float bottomHeight;
    private float leftWidth;
    private float minHeight;
    private float minWidth;

    @Null
    private String name;
    private float rightWidth;
    private float topHeight;

    public BaseDrawable() {
    }

    @Override // com.badlogic.gdx.scenes.scene2d.utils.Drawable
    public void draw(Batch batch, float f, float f2, float f3, float f4) {
    }

    @Override // com.badlogic.gdx.scenes.scene2d.utils.Drawable
    public float getBottomHeight() {
        return this.bottomHeight;
    }

    @Override // com.badlogic.gdx.scenes.scene2d.utils.Drawable
    public float getLeftWidth() {
        return this.leftWidth;
    }

    @Override // com.badlogic.gdx.scenes.scene2d.utils.Drawable
    public float getMinHeight() {
        return this.minHeight;
    }

    @Override // com.badlogic.gdx.scenes.scene2d.utils.Drawable
    public float getMinWidth() {
        return this.minWidth;
    }

    @Null
    public String getName() {
        return this.name;
    }

    @Override // com.badlogic.gdx.scenes.scene2d.utils.Drawable
    public float getRightWidth() {
        return this.rightWidth;
    }

    @Override // com.badlogic.gdx.scenes.scene2d.utils.Drawable
    public float getTopHeight() {
        return this.topHeight;
    }

    @Override // com.badlogic.gdx.scenes.scene2d.utils.Drawable
    public void setBottomHeight(float f) {
        this.bottomHeight = f;
    }

    @Override // com.badlogic.gdx.scenes.scene2d.utils.Drawable
    public void setLeftWidth(float f) {
        this.leftWidth = f;
    }

    @Override // com.badlogic.gdx.scenes.scene2d.utils.Drawable
    public void setMinHeight(float f) {
        this.minHeight = f;
    }

    public void setMinSize(float f, float f2) {
        setMinWidth(f);
        setMinHeight(f2);
    }

    @Override // com.badlogic.gdx.scenes.scene2d.utils.Drawable
    public void setMinWidth(float f) {
        this.minWidth = f;
    }

    public void setName(@Null String str) {
        this.name = str;
    }

    public void setPadding(float f, float f2, float f3, float f4) {
        setTopHeight(f);
        setLeftWidth(f2);
        setBottomHeight(f3);
        setRightWidth(f4);
    }

    @Override // com.badlogic.gdx.scenes.scene2d.utils.Drawable
    public void setRightWidth(float f) {
        this.rightWidth = f;
    }

    @Override // com.badlogic.gdx.scenes.scene2d.utils.Drawable
    public void setTopHeight(float f) {
        this.topHeight = f;
    }

    @Null
    public String toString() {
        String str = this.name;
        return str == null ? ClassReflection.getSimpleName(getClass()) : str;
    }

    public BaseDrawable(Drawable drawable) {
        if (drawable instanceof BaseDrawable) {
            this.name = ((BaseDrawable) drawable).getName();
        }
        this.leftWidth = drawable.getLeftWidth();
        this.rightWidth = drawable.getRightWidth();
        this.topHeight = drawable.getTopHeight();
        this.bottomHeight = drawable.getBottomHeight();
        this.minWidth = drawable.getMinWidth();
        this.minHeight = drawable.getMinHeight();
    }
}
