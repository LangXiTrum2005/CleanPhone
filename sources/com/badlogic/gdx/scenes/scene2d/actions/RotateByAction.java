package com.badlogic.gdx.scenes.scene2d.actions;

/* JADX INFO: loaded from: classes.dex */
public class RotateByAction extends RelativeTemporalAction {
    private float amount;

    public float getAmount() {
        return this.amount;
    }

    public void setAmount(float f) {
        this.amount = f;
    }

    @Override // com.badlogic.gdx.scenes.scene2d.actions.RelativeTemporalAction
    public void updateRelative(float f) {
        this.target.rotateBy(this.amount * f);
    }
}
