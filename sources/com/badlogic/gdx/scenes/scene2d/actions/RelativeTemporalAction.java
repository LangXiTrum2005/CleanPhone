package com.badlogic.gdx.scenes.scene2d.actions;

/* JADX INFO: loaded from: classes.dex */
public abstract class RelativeTemporalAction extends TemporalAction {
    private float lastPercent;

    @Override // com.badlogic.gdx.scenes.scene2d.actions.TemporalAction
    public void begin() {
        this.lastPercent = 0.0f;
    }

    @Override // com.badlogic.gdx.scenes.scene2d.actions.TemporalAction
    public void update(float f) {
        updateRelative(f - this.lastPercent);
        this.lastPercent = f;
    }

    public abstract void updateRelative(float f);
}
