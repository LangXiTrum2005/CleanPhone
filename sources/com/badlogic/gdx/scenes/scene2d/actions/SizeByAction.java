package com.badlogic.gdx.scenes.scene2d.actions;

/* JADX INFO: loaded from: classes.dex */
public class SizeByAction extends RelativeTemporalAction {
    private float amountHeight;
    private float amountWidth;

    public float getAmountHeight() {
        return this.amountHeight;
    }

    public float getAmountWidth() {
        return this.amountWidth;
    }

    public void setAmount(float f, float f2) {
        this.amountWidth = f;
        this.amountHeight = f2;
    }

    public void setAmountHeight(float f) {
        this.amountHeight = f;
    }

    public void setAmountWidth(float f) {
        this.amountWidth = f;
    }

    @Override // com.badlogic.gdx.scenes.scene2d.actions.RelativeTemporalAction
    public void updateRelative(float f) {
        this.target.sizeBy(this.amountWidth * f, this.amountHeight * f);
    }
}
