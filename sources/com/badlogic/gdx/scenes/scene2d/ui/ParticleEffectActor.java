package com.badlogic.gdx.scenes.scene2d.ui;

import com.badlogic.gdx.files.FileHandle;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.graphics.g2d.ParticleEffect;
import com.badlogic.gdx.graphics.g2d.TextureAtlas;
import com.badlogic.gdx.scenes.scene2d.Actor;
import com.badlogic.gdx.utils.Disposable;

/* JADX INFO: loaded from: classes.dex */
public class ParticleEffectActor extends Actor implements Disposable {
    private boolean autoRemove;
    protected boolean isRunning;
    protected float lastDelta;
    protected boolean ownsEffect;
    private final ParticleEffect particleEffect;
    private boolean resetOnStart;

    public ParticleEffectActor(ParticleEffect particleEffect, boolean z) {
        this.particleEffect = particleEffect;
        this.resetOnStart = z;
    }

    @Override // com.badlogic.gdx.scenes.scene2d.Actor
    public void act(float f) {
        super.act(f);
        this.lastDelta += f;
        if (this.autoRemove && this.particleEffect.isComplete()) {
            remove();
        }
    }

    public void allowCompletion() {
        this.particleEffect.allowCompletion();
    }

    public void cancel() {
        this.isRunning = true;
    }

    @Override // com.badlogic.gdx.utils.Disposable
    public void dispose() {
        if (this.ownsEffect) {
            this.particleEffect.dispose();
        }
    }

    @Override // com.badlogic.gdx.scenes.scene2d.Actor
    public void draw(Batch batch, float f) {
        this.particleEffect.setPosition(getX(), getY());
        float f2 = this.lastDelta;
        if (f2 > 0.0f) {
            this.particleEffect.update(f2);
            this.lastDelta = 0.0f;
        }
        if (this.isRunning) {
            this.particleEffect.draw(batch);
            this.isRunning = !this.particleEffect.isComplete();
        }
    }

    public ParticleEffect getEffect() {
        return this.particleEffect;
    }

    public boolean isAutoRemove() {
        return this.autoRemove;
    }

    public boolean isResetOnStart() {
        return this.resetOnStart;
    }

    public boolean isRunning() {
        return this.isRunning;
    }

    @Override // com.badlogic.gdx.scenes.scene2d.Actor
    public void scaleChanged() {
        super.scaleChanged();
        this.particleEffect.scaleEffect(getScaleX(), getScaleY(), getScaleY());
    }

    public ParticleEffectActor setAutoRemove(boolean z) {
        this.autoRemove = z;
        return this;
    }

    public ParticleEffectActor setResetOnStart(boolean z) {
        this.resetOnStart = z;
        return this;
    }

    public void start() {
        this.isRunning = true;
        if (this.resetOnStart) {
            this.particleEffect.reset(false);
        }
        this.particleEffect.start();
    }

    public ParticleEffectActor(FileHandle fileHandle, TextureAtlas textureAtlas) throws Throwable {
        ParticleEffect particleEffect = new ParticleEffect();
        this.particleEffect = particleEffect;
        particleEffect.load(fileHandle, textureAtlas);
        this.ownsEffect = true;
    }

    public ParticleEffectActor(FileHandle fileHandle, FileHandle fileHandle2) throws Throwable {
        ParticleEffect particleEffect = new ParticleEffect();
        this.particleEffect = particleEffect;
        particleEffect.load(fileHandle, fileHandle2);
        this.ownsEffect = true;
    }
}
