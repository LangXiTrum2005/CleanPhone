package com.badlogic.gdx.graphics.g3d.particles.emitters;

import com.badlogic.gdx.graphics.g3d.particles.ParallelArray;
import com.badlogic.gdx.graphics.g3d.particles.ParticleChannels;
import com.badlogic.gdx.graphics.g3d.particles.ParticleController;
import com.badlogic.gdx.graphics.g3d.particles.ParticleControllerComponent;
import com.badlogic.gdx.graphics.g3d.particles.values.RangedNumericValue;
import com.badlogic.gdx.graphics.g3d.particles.values.ScaledNumericValue;
import com.badlogic.gdx.utils.Json;
import com.badlogic.gdx.utils.JsonValue;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3950lJ;

/* JADX INFO: loaded from: classes.dex */
public class RegularEmitter extends Emitter implements Json.Serializable {
    private boolean continuous;
    protected float delay;
    protected float delayTimer;
    public RangedNumericValue delayValue;
    protected float duration;
    protected float durationTimer;
    public RangedNumericValue durationValue;
    protected int emission;
    protected int emissionDelta;
    protected int emissionDiff;
    private EmissionMode emissionMode;
    public ScaledNumericValue emissionValue;
    protected int life;
    private ParallelArray.FloatChannel lifeChannel;
    protected int lifeDiff;
    protected int lifeOffset;
    protected int lifeOffsetDiff;
    public ScaledNumericValue lifeOffsetValue;
    public ScaledNumericValue lifeValue;

    public enum EmissionMode {
        Enabled,
        EnabledUntilCycleEnd,
        Disabled
    }

    public RegularEmitter() {
        this.delayValue = new RangedNumericValue();
        this.durationValue = new RangedNumericValue();
        this.lifeOffsetValue = new ScaledNumericValue();
        this.lifeValue = new ScaledNumericValue();
        this.emissionValue = new ScaledNumericValue();
        this.durationValue.setActive(true);
        this.emissionValue.setActive(true);
        this.lifeValue.setActive(true);
        this.continuous = true;
        this.emissionMode = EmissionMode.Enabled;
    }

    private void addParticles(int i) {
        int iMin = Math.min(i, this.maxParticleCount - this.controller.particles.size);
        if (iMin <= 0) {
            return;
        }
        ParticleController particleController = this.controller;
        particleController.activateParticles(particleController.particles.size, iMin);
        this.controller.particles.size += iMin;
    }

    @Override // com.badlogic.gdx.graphics.g3d.particles.ParticleControllerComponent
    public void activateParticles(int i, int i2) {
        int i3;
        int scale = this.life + ((int) (this.lifeValue.getScale(this.percent) * this.lifeDiff));
        int i4 = (int) AbstractC3950lJ.i(this.lifeOffsetValue, this.percent, this.lifeOffsetDiff, this.lifeOffset);
        if (i4 > 0) {
            if (i4 >= scale) {
                i4 = scale - 1;
            }
            i3 = scale - i4;
        } else {
            i3 = scale;
        }
        float f = i3;
        float f2 = scale;
        float f3 = 1.0f - (f / f2);
        int i5 = this.lifeChannel.strideSize;
        int i6 = i * i5;
        int i7 = (i2 * i5) + i6;
        while (i6 < i7) {
            ParallelArray.FloatChannel floatChannel = this.lifeChannel;
            float[] fArr = floatChannel.data;
            fArr[i6] = f;
            fArr[i6 + 1] = f2;
            fArr[i6 + 2] = f3;
            i6 += floatChannel.strideSize;
        }
    }

    @Override // com.badlogic.gdx.graphics.g3d.particles.ParticleControllerComponent
    public void allocateChannels() {
        this.lifeChannel = (ParallelArray.FloatChannel) this.controller.particles.addChannel(ParticleChannels.Life);
    }

    @Override // com.badlogic.gdx.graphics.g3d.particles.ParticleControllerComponent
    public ParticleControllerComponent copy() {
        return new RegularEmitter(this);
    }

    public RangedNumericValue getDelay() {
        return this.delayValue;
    }

    public RangedNumericValue getDuration() {
        return this.durationValue;
    }

    public ScaledNumericValue getEmission() {
        return this.emissionValue;
    }

    public EmissionMode getEmissionMode() {
        return this.emissionMode;
    }

    public ScaledNumericValue getLife() {
        return this.lifeValue;
    }

    public ScaledNumericValue getLifeOffset() {
        return this.lifeOffsetValue;
    }

    public float getPercentComplete() {
        if (this.delayTimer < this.delay) {
            return 0.0f;
        }
        return Math.min(1.0f, this.durationTimer / this.duration);
    }

    @Override // com.badlogic.gdx.graphics.g3d.particles.emitters.Emitter, com.badlogic.gdx.graphics.g3d.particles.ParticleControllerComponent
    public void init() {
        super.init();
        this.emissionDelta = 0;
        this.durationTimer = this.duration;
    }

    @Override // com.badlogic.gdx.graphics.g3d.particles.emitters.Emitter
    public boolean isComplete() {
        return this.delayTimer >= this.delay && this.durationTimer >= this.duration && this.controller.particles.size == 0;
    }

    public boolean isContinuous() {
        return this.continuous;
    }

    @Override // com.badlogic.gdx.graphics.g3d.particles.emitters.Emitter, com.badlogic.gdx.graphics.g3d.particles.ParticleControllerComponent, com.badlogic.gdx.utils.Json.Serializable
    public void read(Json json, JsonValue jsonValue) {
        super.read(json, jsonValue);
        this.continuous = ((Boolean) json.readValue("continous", Boolean.TYPE, jsonValue)).booleanValue();
        this.emissionValue = (ScaledNumericValue) json.readValue("emission", ScaledNumericValue.class, jsonValue);
        this.delayValue = (RangedNumericValue) json.readValue("delay", RangedNumericValue.class, jsonValue);
        this.durationValue = (RangedNumericValue) json.readValue("duration", RangedNumericValue.class, jsonValue);
        this.lifeValue = (ScaledNumericValue) json.readValue("life", ScaledNumericValue.class, jsonValue);
        this.lifeOffsetValue = (ScaledNumericValue) json.readValue("lifeOffset", ScaledNumericValue.class, jsonValue);
    }

    public void set(RegularEmitter regularEmitter) {
        super.set((Emitter) regularEmitter);
        this.delayValue.load(regularEmitter.delayValue);
        this.durationValue.load(regularEmitter.durationValue);
        this.lifeOffsetValue.load(regularEmitter.lifeOffsetValue);
        this.lifeValue.load(regularEmitter.lifeValue);
        this.emissionValue.load(regularEmitter.emissionValue);
        this.emission = regularEmitter.emission;
        this.emissionDiff = regularEmitter.emissionDiff;
        this.emissionDelta = regularEmitter.emissionDelta;
        this.lifeOffset = regularEmitter.lifeOffset;
        this.lifeOffsetDiff = regularEmitter.lifeOffsetDiff;
        this.life = regularEmitter.life;
        this.lifeDiff = regularEmitter.lifeDiff;
        this.duration = regularEmitter.duration;
        this.delay = regularEmitter.delay;
        this.durationTimer = regularEmitter.durationTimer;
        this.delayTimer = regularEmitter.delayTimer;
        this.continuous = regularEmitter.continuous;
    }

    public void setContinuous(boolean z) {
        this.continuous = z;
    }

    public void setEmissionMode(EmissionMode emissionMode) {
        this.emissionMode = emissionMode;
    }

    @Override // com.badlogic.gdx.graphics.g3d.particles.ParticleControllerComponent
    public void start() {
        RangedNumericValue rangedNumericValue = this.delayValue;
        this.delay = rangedNumericValue.active ? rangedNumericValue.newLowValue() : 0.0f;
        this.delayTimer = 0.0f;
        this.durationTimer = 0.0f;
        float fNewLowValue = this.durationValue.newLowValue();
        this.duration = fNewLowValue;
        this.percent = this.durationTimer / fNewLowValue;
        this.emission = (int) this.emissionValue.newLowValue();
        this.emissionDiff = (int) this.emissionValue.newHighValue();
        if (!this.emissionValue.isRelative()) {
            this.emissionDiff -= this.emission;
        }
        this.life = (int) this.lifeValue.newLowValue();
        this.lifeDiff = (int) this.lifeValue.newHighValue();
        if (!this.lifeValue.isRelative()) {
            this.lifeDiff -= this.life;
        }
        ScaledNumericValue scaledNumericValue = this.lifeOffsetValue;
        this.lifeOffset = scaledNumericValue.active ? (int) scaledNumericValue.newLowValue() : 0;
        this.lifeOffsetDiff = (int) this.lifeOffsetValue.newHighValue();
        if (this.lifeOffsetValue.isRelative()) {
            return;
        }
        this.lifeOffsetDiff -= this.lifeOffset;
    }

    @Override // com.badlogic.gdx.graphics.g3d.particles.ParticleControllerComponent
    public void update() {
        ParticleController particleController;
        int i;
        ParticleController particleController2 = this.controller;
        float f = particleController2.deltaTime * 1000.0f;
        float f2 = this.delayTimer;
        int i2 = 0;
        if (f2 < this.delay) {
            this.delayTimer = f2 + f;
        } else {
            EmissionMode emissionMode = this.emissionMode;
            boolean z = emissionMode != EmissionMode.Disabled;
            float f3 = this.durationTimer;
            float f4 = this.duration;
            if (f3 < f4) {
                float f5 = f3 + f;
                this.durationTimer = f5;
                this.percent = f5 / f4;
            } else if (this.continuous && z && emissionMode == EmissionMode.Enabled) {
                particleController2.start();
            }
            if (z) {
                this.emissionDelta = (int) (this.emissionDelta + f);
                float fI = AbstractC3950lJ.i(this.emissionValue, this.percent, this.emissionDiff, this.emission);
                if (fI > 0.0f) {
                    float f6 = 1000.0f / fI;
                    int i3 = this.emissionDelta;
                    if (i3 >= f6) {
                        int iMin = Math.min((int) (i3 / f6), this.maxParticleCount - this.controller.particles.size);
                        this.emissionDelta = (int) (((int) (this.emissionDelta - (iMin * f6))) % f6);
                        addParticles(iMin);
                    }
                }
                int i4 = this.controller.particles.size;
                int i5 = this.minParticleCount;
                if (i4 < i5) {
                    addParticles(i5 - i4);
                }
            }
        }
        int i6 = this.controller.particles.size;
        int i7 = 0;
        while (true) {
            particleController = this.controller;
            ParallelArray parallelArray = particleController.particles;
            i = parallelArray.size;
            if (i2 >= i) {
                break;
            }
            ParallelArray.FloatChannel floatChannel = this.lifeChannel;
            float[] fArr = floatChannel.data;
            float f7 = fArr[i7] - f;
            fArr[i7] = f7;
            if (f7 <= 0.0f) {
                parallelArray.removeElement(i2);
            } else {
                fArr[i7 + 2] = 1.0f - (f7 / fArr[i7 + 1]);
                i2++;
                i7 += floatChannel.strideSize;
            }
        }
        if (i < i6) {
            particleController.killParticles(i, i6 - i);
        }
    }

    @Override // com.badlogic.gdx.graphics.g3d.particles.emitters.Emitter, com.badlogic.gdx.graphics.g3d.particles.ParticleControllerComponent, com.badlogic.gdx.utils.Json.Serializable
    public void write(Json json) {
        super.write(json);
        json.writeValue("continous", Boolean.valueOf(this.continuous));
        json.writeValue("emission", this.emissionValue);
        json.writeValue("delay", this.delayValue);
        json.writeValue("duration", this.durationValue);
        json.writeValue("life", this.lifeValue);
        json.writeValue("lifeOffset", this.lifeOffsetValue);
    }

    public RegularEmitter(RegularEmitter regularEmitter) {
        this();
        set(regularEmitter);
    }
}
