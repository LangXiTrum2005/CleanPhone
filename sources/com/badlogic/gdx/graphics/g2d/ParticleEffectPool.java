package com.badlogic.gdx.graphics.g2d;

import com.badlogic.gdx.utils.Array;
import com.badlogic.gdx.utils.Pool;

/* JADX INFO: loaded from: classes.dex */
public class ParticleEffectPool extends Pool<PooledEffect> {
    private final ParticleEffect effect;

    public class PooledEffect extends ParticleEffect {
        public PooledEffect(ParticleEffect particleEffect) {
            super(particleEffect);
        }

        public void free() {
            ParticleEffectPool.this.free(this);
        }
    }

    public ParticleEffectPool(ParticleEffect particleEffect, int i, int i2) {
        super(i, i2);
        this.effect = particleEffect;
    }

    @Override // com.badlogic.gdx.utils.Pool
    public void free(PooledEffect pooledEffect) {
        super.free(pooledEffect);
        pooledEffect.reset(false);
        float f = pooledEffect.xSizeScale;
        ParticleEffect particleEffect = this.effect;
        if (f == particleEffect.xSizeScale && pooledEffect.ySizeScale == particleEffect.ySizeScale && pooledEffect.motionScale == particleEffect.motionScale) {
            return;
        }
        Array<ParticleEmitter> emitters = pooledEffect.getEmitters();
        Array<ParticleEmitter> emitters2 = this.effect.getEmitters();
        for (int i = 0; i < emitters.size; i++) {
            ParticleEmitter particleEmitter = emitters.get(i);
            ParticleEmitter particleEmitter2 = emitters2.get(i);
            particleEmitter.matchSize(particleEmitter2);
            particleEmitter.matchMotion(particleEmitter2);
        }
        ParticleEffect particleEffect2 = this.effect;
        pooledEffect.xSizeScale = particleEffect2.xSizeScale;
        pooledEffect.ySizeScale = particleEffect2.ySizeScale;
        pooledEffect.motionScale = particleEffect2.motionScale;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.badlogic.gdx.utils.Pool
    public PooledEffect newObject() {
        PooledEffect pooledEffect = new PooledEffect(this.effect);
        pooledEffect.start();
        return pooledEffect;
    }
}
