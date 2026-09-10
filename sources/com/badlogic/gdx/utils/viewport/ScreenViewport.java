package com.badlogic.gdx.utils.viewport;

import com.badlogic.gdx.graphics.Camera;
import com.badlogic.gdx.graphics.OrthographicCamera;

/* JADX INFO: loaded from: classes.dex */
public class ScreenViewport extends Viewport {
    private float unitsPerPixel;

    public ScreenViewport() {
        this(new OrthographicCamera());
    }

    public float getUnitsPerPixel() {
        return this.unitsPerPixel;
    }

    public void setUnitsPerPixel(float f) {
        this.unitsPerPixel = f;
    }

    @Override // com.badlogic.gdx.utils.viewport.Viewport
    public void update(int i, int i2, boolean z) {
        setScreenBounds(0, 0, i, i2);
        float f = this.unitsPerPixel;
        setWorldSize(i * f, i2 * f);
        apply(z);
    }

    public ScreenViewport(Camera camera) {
        this.unitsPerPixel = 1.0f;
        setCamera(camera);
    }
}
