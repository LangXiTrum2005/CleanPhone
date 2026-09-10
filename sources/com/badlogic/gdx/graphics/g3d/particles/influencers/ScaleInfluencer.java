package com.badlogic.gdx.graphics.g3d.particles.influencers;

import com.badlogic.gdx.graphics.g3d.particles.ParticleChannels;
import com.badlogic.gdx.graphics.g3d.particles.ParticleControllerComponent;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3950lJ;

/* JADX INFO: loaded from: classes.dex */
public class ScaleInfluencer extends SimpleInfluencer {
    public ScaleInfluencer() {
        this.valueChannelDescriptor = ParticleChannels.Scale;
    }

    @Override // com.badlogic.gdx.graphics.g3d.particles.influencers.SimpleInfluencer, com.badlogic.gdx.graphics.g3d.particles.ParticleControllerComponent
    public void activateParticles(int i, int i2) {
        if (this.value.isRelative()) {
            int i3 = this.valueChannel.strideSize;
            int i4 = i * i3;
            int i5 = i * this.interpolationChannel.strideSize;
            int i6 = (i2 * i3) + i4;
            while (i4 < i6) {
                float fNewLowValue = this.value.newLowValue() * this.controller.scale.x;
                float fNewHighValue = this.value.newHighValue() * this.controller.scale.x;
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
            float fNewLowValue2 = this.value.newLowValue() * this.controller.scale.x;
            float fNewHighValue2 = (this.value.newHighValue() * this.controller.scale.x) - fNewLowValue2;
            float[] fArr2 = this.interpolationChannel.data;
            fArr2[i9] = fNewLowValue2;
            fArr2[i9 + 1] = fNewHighValue2;
            this.valueChannel.data[i8] = AbstractC3950lJ.i(this.value, 0.0f, fNewHighValue2, fNewLowValue2);
            i8 += this.valueChannel.strideSize;
            i9 += this.interpolationChannel.strideSize;
        }
    }

    @Override // com.badlogic.gdx.graphics.g3d.particles.ParticleControllerComponent
    public ParticleControllerComponent copy() {
        return new ScaleInfluencer(this);
    }

    public ScaleInfluencer(ScaleInfluencer scaleInfluencer) {
        super(scaleInfluencer);
    }
}
