package com.badlogic.gdx.utils.viewport;

import com.badlogic.gdx.graphics.Camera;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.utils.Scaling;

/* JADX INFO: loaded from: classes.dex */
public class ExtendViewport extends Viewport {
    private float maxWorldHeight;
    private float maxWorldWidth;
    private float minWorldHeight;
    private float minWorldWidth;
    private Scaling scaling;

    public ExtendViewport(float f, float f2) {
        this(f, f2, 0.0f, 0.0f, new OrthographicCamera());
    }

    public float getMaxWorldHeight() {
        return this.maxWorldHeight;
    }

    public float getMaxWorldWidth() {
        return this.maxWorldWidth;
    }

    public float getMinWorldHeight() {
        return this.minWorldHeight;
    }

    public float getMinWorldWidth() {
        return this.minWorldWidth;
    }

    public void setMaxWorldHeight(float f) {
        this.maxWorldHeight = f;
    }

    public void setMaxWorldWidth(float f) {
        this.maxWorldWidth = f;
    }

    public void setMinWorldHeight(float f) {
        this.minWorldHeight = f;
    }

    public void setMinWorldWidth(float f) {
        this.minWorldWidth = f;
    }

    public void setScaling(Scaling scaling) {
        this.scaling = scaling;
    }

    @Override // com.badlogic.gdx.utils.viewport.Viewport
    public void update(int i, int i2, boolean z) {
        float f = this.minWorldWidth;
        float f2 = this.minWorldHeight;
        Vector2 vector2Apply = this.scaling.apply(f, f2, i, i2);
        int iRound = Math.round(vector2Apply.x);
        int iRound2 = Math.round(vector2Apply.y);
        if (iRound < i) {
            float f3 = iRound2;
            float f4 = f3 / f2;
            float fMin = (i - iRound) * (f2 / f3);
            float f5 = this.maxWorldWidth;
            if (f5 > 0.0f) {
                fMin = Math.min(fMin, f5 - this.minWorldWidth);
            }
            f += fMin;
            iRound += Math.round(fMin * f4);
        }
        if (iRound2 < i2) {
            float f6 = iRound;
            float f7 = f6 / f;
            float fMin2 = (i2 - iRound2) * (f / f6);
            float f8 = this.maxWorldHeight;
            if (f8 > 0.0f) {
                fMin2 = Math.min(fMin2, f8 - this.minWorldHeight);
            }
            f2 += fMin2;
            iRound2 += Math.round(fMin2 * f7);
        }
        setWorldSize(f, f2);
        setScreenBounds((i - iRound) / 2, (i2 - iRound2) / 2, iRound, iRound2);
        apply(z);
    }

    public ExtendViewport(float f, float f2, Camera camera) {
        this(f, f2, 0.0f, 0.0f, camera);
    }

    public ExtendViewport(float f, float f2, float f3, float f4) {
        this(f, f2, f3, f4, new OrthographicCamera());
    }

    public ExtendViewport(float f, float f2, float f3, float f4, Camera camera) {
        this.scaling = Scaling.fit;
        this.minWorldWidth = f;
        this.minWorldHeight = f2;
        this.maxWorldWidth = f3;
        this.maxWorldHeight = f4;
        setCamera(camera);
    }
}
