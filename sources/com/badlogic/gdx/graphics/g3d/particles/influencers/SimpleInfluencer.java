package com.badlogic.gdx.graphics.g3d.particles.influencers;

import com.badlogic.gdx.graphics.g3d.particles.ParallelArray;
import com.badlogic.gdx.graphics.g3d.particles.ParticleChannels;
import com.badlogic.gdx.graphics.g3d.particles.values.ScaledNumericValue;
import com.badlogic.gdx.utils.Json;
import com.badlogic.gdx.utils.JsonValue;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3950lJ;

/* JADX INFO: loaded from: classes.dex */
public abstract class SimpleInfluencer extends Influencer {
    ParallelArray.FloatChannel interpolationChannel;
    ParallelArray.FloatChannel lifeChannel;
    public ScaledNumericValue value;
    ParallelArray.FloatChannel valueChannel;
    ParallelArray.ChannelDescriptor valueChannelDescriptor;

    public SimpleInfluencer() {
        ScaledNumericValue scaledNumericValue = new ScaledNumericValue();
        this.value = scaledNumericValue;
        scaledNumericValue.setHigh(1.0f);
    }

    private void set(SimpleInfluencer simpleInfluencer) {
        this.value.load(simpleInfluencer.value);
        this.valueChannelDescriptor = simpleInfluencer.valueChannelDescriptor;
    }

    @Override // com.badlogic.gdx.graphics.g3d.particles.ParticleControllerComponent
    public void activateParticles(int i, int i2) {
        if (this.value.isRelative()) {
            int i3 = this.valueChannel.strideSize;
            int i4 = i * i3;
            int i5 = i * this.interpolationChannel.strideSize;
            int i6 = (i2 * i3) + i4;
            while (i4 < i6) {
                float fNewLowValue = this.value.newLowValue();
                float fNewHighValue = this.value.newHighValue();
                float[] fArr = this.interpolationChannel.data;
                fArr[i5] = fNewLowValue;
                fArr[i5 + 1] = fNewHighValue;
                this.valueChannel.data[i4] = AbstractC3950lJ.i(this.value, 0.0f, fNewHighValue, fNewLowValue);
                i4 += this.valueChannel.strideSize;
                i5 += this.interpolationChannel.strideSize;
            }
            return;
        }
        int i7 = this.valueChannel.strideSize;
        int i8 = i * i7;
        int i9 = i * this.interpolationChannel.strideSize;
        int i10 = (i2 * i7) + i8;
        while (i8 < i10) {
            float fNewLowValue2 = this.value.newLowValue();
            float fNewHighValue2 = this.value.newHighValue() - fNewLowValue2;
            float[] fArr2 = this.interpolationChannel.data;
            fArr2[i9] = fNewLowValue2;
            fArr2[i9 + 1] = fNewHighValue2;
            this.valueChannel.data[i8] = AbstractC3950lJ.i(this.value, 0.0f, fNewHighValue2, fNewLowValue2);
            i8 += this.valueChannel.strideSize;
            i9 += this.interpolationChannel.strideSize;
        }
    }

    @Override // com.badlogic.gdx.graphics.g3d.particles.ParticleControllerComponent
    public void allocateChannels() {
        this.valueChannel = (ParallelArray.FloatChannel) this.controller.particles.addChannel(this.valueChannelDescriptor);
        ParallelArray.ChannelDescriptor channelDescriptor = ParticleChannels.Interpolation;
        channelDescriptor.id = this.controller.particleChannels.newId();
        this.interpolationChannel = (ParallelArray.FloatChannel) this.controller.particles.addChannel(channelDescriptor);
        this.lifeChannel = (ParallelArray.FloatChannel) this.controller.particles.addChannel(ParticleChannels.Life);
    }

    @Override // com.badlogic.gdx.graphics.g3d.particles.ParticleControllerComponent, com.badlogic.gdx.utils.Json.Serializable
    public void read(Json json, JsonValue jsonValue) {
        this.value = (ScaledNumericValue) json.readValue(AppMeasurementSdk.ConditionalUserProperty.VALUE, ScaledNumericValue.class, jsonValue);
    }

    @Override // com.badlogic.gdx.graphics.g3d.particles.ParticleControllerComponent
    public void update() {
        int i = this.controller.particles.size * this.valueChannel.strideSize;
        int i2 = 0;
        int i3 = 0;
        int i4 = 2;
        while (i2 < i) {
            float[] fArr = this.valueChannel.data;
            float[] fArr2 = this.interpolationChannel.data;
            float f = fArr2[i3];
            fArr[i2] = AbstractC3950lJ.i(this.value, this.lifeChannel.data[i4], fArr2[i3 + 1], f);
            i2 += this.valueChannel.strideSize;
            i3 += this.interpolationChannel.strideSize;
            i4 += this.lifeChannel.strideSize;
        }
    }

    @Override // com.badlogic.gdx.graphics.g3d.particles.ParticleControllerComponent, com.badlogic.gdx.utils.Json.Serializable
    public void write(Json json) {
        json.writeValue(AppMeasurementSdk.ConditionalUserProperty.VALUE, this.value);
    }

    public SimpleInfluencer(SimpleInfluencer simpleInfluencer) {
        this();
        set(simpleInfluencer);
    }
}
