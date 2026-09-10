package com.badlogic.gdx.graphics.g3d.particles.influencers;

import com.badlogic.gdx.graphics.g3d.particles.ParallelArray;
import com.badlogic.gdx.graphics.g3d.particles.ParticleChannels;
import com.badlogic.gdx.graphics.g3d.particles.values.GradientColorValue;
import com.badlogic.gdx.graphics.g3d.particles.values.ScaledNumericValue;
import com.badlogic.gdx.math.MathUtils;
import com.badlogic.gdx.utils.Json;
import com.badlogic.gdx.utils.JsonValue;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3950lJ;

/* JADX INFO: loaded from: classes.dex */
public abstract class ColorInfluencer extends Influencer {
    ParallelArray.FloatChannel colorChannel;

    public static class Random extends ColorInfluencer {
        ParallelArray.FloatChannel colorChannel;

        @Override // com.badlogic.gdx.graphics.g3d.particles.ParticleControllerComponent
        public void activateParticles(int i, int i2) {
            int i3 = this.colorChannel.strideSize;
            int i4 = i * i3;
            int i5 = (i2 * i3) + i4;
            while (i4 < i5) {
                this.colorChannel.data[i4] = MathUtils.random();
                this.colorChannel.data[i4 + 1] = MathUtils.random();
                this.colorChannel.data[i4 + 2] = MathUtils.random();
                this.colorChannel.data[i4 + 3] = MathUtils.random();
                i4 += this.colorChannel.strideSize;
            }
        }

        @Override // com.badlogic.gdx.graphics.g3d.particles.influencers.ColorInfluencer, com.badlogic.gdx.graphics.g3d.particles.ParticleControllerComponent
        public void allocateChannels() {
            this.colorChannel = (ParallelArray.FloatChannel) this.controller.particles.addChannel(ParticleChannels.Color);
        }

        @Override // com.badlogic.gdx.graphics.g3d.particles.ParticleControllerComponent
        public Random copy() {
            return new Random();
        }
    }

    public static class Single extends ColorInfluencer {
        ParallelArray.FloatChannel alphaInterpolationChannel;
        public ScaledNumericValue alphaValue;
        public GradientColorValue colorValue;
        ParallelArray.FloatChannel lifeChannel;

        public Single() {
            this.colorValue = new GradientColorValue();
            ScaledNumericValue scaledNumericValue = new ScaledNumericValue();
            this.alphaValue = scaledNumericValue;
            scaledNumericValue.setHigh(1.0f);
        }

        @Override // com.badlogic.gdx.graphics.g3d.particles.ParticleControllerComponent
        public void activateParticles(int i, int i2) {
            int i3 = this.colorChannel.strideSize;
            int i4 = i * i3;
            int i5 = this.alphaInterpolationChannel.strideSize * i;
            int i6 = (i * this.lifeChannel.strideSize) + 2;
            int i7 = (i2 * i3) + i4;
            while (i4 < i7) {
                float fNewLowValue = this.alphaValue.newLowValue();
                float fNewHighValue = this.alphaValue.newHighValue() - fNewLowValue;
                this.colorValue.getColor(0.0f, this.colorChannel.data, i4);
                this.colorChannel.data[i4 + 3] = AbstractC3950lJ.i(this.alphaValue, this.lifeChannel.data[i6], fNewHighValue, fNewLowValue);
                ParallelArray.FloatChannel floatChannel = this.alphaInterpolationChannel;
                float[] fArr = floatChannel.data;
                fArr[i5] = fNewLowValue;
                fArr[i5 + 1] = fNewHighValue;
                i4 += this.colorChannel.strideSize;
                i5 += floatChannel.strideSize;
                i6 += this.lifeChannel.strideSize;
            }
        }

        @Override // com.badlogic.gdx.graphics.g3d.particles.influencers.ColorInfluencer, com.badlogic.gdx.graphics.g3d.particles.ParticleControllerComponent
        public void allocateChannels() {
            super.allocateChannels();
            ParallelArray.ChannelDescriptor channelDescriptor = ParticleChannels.Interpolation;
            channelDescriptor.id = this.controller.particleChannels.newId();
            this.alphaInterpolationChannel = (ParallelArray.FloatChannel) this.controller.particles.addChannel(channelDescriptor);
            this.lifeChannel = (ParallelArray.FloatChannel) this.controller.particles.addChannel(ParticleChannels.Life);
        }

        @Override // com.badlogic.gdx.graphics.g3d.particles.ParticleControllerComponent, com.badlogic.gdx.utils.Json.Serializable
        public void read(Json json, JsonValue jsonValue) {
            this.alphaValue = (ScaledNumericValue) json.readValue("alpha", ScaledNumericValue.class, jsonValue);
            this.colorValue = (GradientColorValue) json.readValue("color", GradientColorValue.class, jsonValue);
        }

        public void set(Single single) {
            this.colorValue.load(single.colorValue);
            this.alphaValue.load(single.alphaValue);
        }

        @Override // com.badlogic.gdx.graphics.g3d.particles.ParticleControllerComponent
        public void update() {
            int i = this.controller.particles.size * this.colorChannel.strideSize;
            int i2 = 0;
            int i3 = 0;
            int i4 = 2;
            while (i2 < i) {
                float f = this.lifeChannel.data[i4];
                this.colorValue.getColor(f, this.colorChannel.data, i2);
                float[] fArr = this.alphaInterpolationChannel.data;
                float f2 = fArr[i3];
                this.colorChannel.data[i2 + 3] = AbstractC3950lJ.i(this.alphaValue, f, fArr[i3 + 1], f2);
                i2 += this.colorChannel.strideSize;
                i3 += this.alphaInterpolationChannel.strideSize;
                i4 += this.lifeChannel.strideSize;
            }
        }

        @Override // com.badlogic.gdx.graphics.g3d.particles.ParticleControllerComponent, com.badlogic.gdx.utils.Json.Serializable
        public void write(Json json) {
            json.writeValue("alpha", this.alphaValue);
            json.writeValue("color", this.colorValue);
        }

        @Override // com.badlogic.gdx.graphics.g3d.particles.ParticleControllerComponent
        public Single copy() {
            return new Single(this);
        }

        public Single(Single single) {
            this();
            set(single);
        }
    }

    @Override // com.badlogic.gdx.graphics.g3d.particles.ParticleControllerComponent
    public void allocateChannels() {
        this.colorChannel = (ParallelArray.FloatChannel) this.controller.particles.addChannel(ParticleChannels.Color);
    }
}
