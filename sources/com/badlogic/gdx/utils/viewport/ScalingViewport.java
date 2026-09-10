package com.badlogic.gdx.utils.viewport;

import com.badlogic.gdx.graphics.Camera;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.utils.Scaling;

/* JADX INFO: loaded from: classes.dex */
public class ScalingViewport extends Viewport {
    private Scaling scaling;

    public ScalingViewport(Scaling scaling, float f, float f2) {
        this(scaling, f, f2, new OrthographicCamera());
    }

    public Scaling getScaling() {
        return this.scaling;
    }

    public void setScaling(Scaling scaling) {
        this.scaling = scaling;
    }

    @Override // com.badlogic.gdx.utils.viewport.Viewport
    public void update(int i, int i2, boolean z) {
        Vector2 vector2Apply = this.scaling.apply(getWorldWidth(), getWorldHeight(), i, i2);
        int iRound = Math.round(vector2Apply.x);
        int iRound2 = Math.round(vector2Apply.y);
        setScreenBounds((i - iRound) / 2, (i2 - iRound2) / 2, iRound, iRound2);
        apply(z);
    }

    public ScalingViewport(Scaling scaling, float f, float f2, Camera camera) {
        this.scaling = scaling;
        setWorldSize(f, f2);
        setCamera(camera);
    }
}
