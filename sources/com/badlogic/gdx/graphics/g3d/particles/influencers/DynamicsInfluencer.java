package com.badlogic.gdx.graphics.g3d.particles.influencers;

import com.badlogic.gdx.graphics.g3d.particles.ParallelArray;
import com.badlogic.gdx.graphics.g3d.particles.ParticleChannels;
import com.badlogic.gdx.graphics.g3d.particles.ParticleController;
import com.badlogic.gdx.graphics.g3d.particles.ParticleControllerComponent;
import com.badlogic.gdx.math.MathUtils;
import com.badlogic.gdx.math.Quaternion;
import com.badlogic.gdx.utils.Array;
import com.badlogic.gdx.utils.Json;
import com.badlogic.gdx.utils.JsonValue;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public class DynamicsInfluencer extends Influencer {
    private ParallelArray.FloatChannel accellerationChannel;
    private ParallelArray.FloatChannel angularVelocityChannel;
    boolean has2dAngularVelocity;
    boolean has3dAngularVelocity;
    boolean hasAcceleration;
    private ParallelArray.FloatChannel positionChannel;
    private ParallelArray.FloatChannel previousPositionChannel;
    private ParallelArray.FloatChannel rotationChannel;
    public Array<DynamicsModifier> velocities;

    public DynamicsInfluencer() {
        this.velocities = new Array<>(true, 3, DynamicsModifier.class);
    }

    @Override // com.badlogic.gdx.graphics.g3d.particles.ParticleControllerComponent
    public void activateParticles(int i, int i2) {
        if (this.hasAcceleration) {
            int i3 = this.positionChannel.strideSize;
            int i4 = i * i3;
            int i5 = (i3 * i2) + i4;
            while (i4 < i5) {
                float[] fArr = this.previousPositionChannel.data;
                ParallelArray.FloatChannel floatChannel = this.positionChannel;
                float[] fArr2 = floatChannel.data;
                fArr[i4] = fArr2[i4];
                int i6 = i4 + 1;
                fArr[i6] = fArr2[i6];
                int i7 = i4 + 2;
                fArr[i7] = fArr2[i7];
                i4 += floatChannel.strideSize;
            }
        }
        if (this.has2dAngularVelocity) {
            int i8 = this.rotationChannel.strideSize;
            int i9 = i * i8;
            int i10 = (i8 * i2) + i9;
            while (i9 < i10) {
                ParallelArray.FloatChannel floatChannel2 = this.rotationChannel;
                float[] fArr3 = floatChannel2.data;
                fArr3[i9] = 1.0f;
                fArr3[i9 + 1] = 0.0f;
                i9 += floatChannel2.strideSize;
            }
        } else if (this.has3dAngularVelocity) {
            int i11 = this.rotationChannel.strideSize;
            int i12 = i * i11;
            int i13 = (i11 * i2) + i12;
            while (i12 < i13) {
                ParallelArray.FloatChannel floatChannel3 = this.rotationChannel;
                float[] fArr4 = floatChannel3.data;
                fArr4[i12] = 0.0f;
                fArr4[i12 + 1] = 0.0f;
                fArr4[i12 + 2] = 0.0f;
                fArr4[i12 + 3] = 1.0f;
                i12 += floatChannel3.strideSize;
            }
        }
        int i14 = 0;
        while (true) {
            Array<DynamicsModifier> array = this.velocities;
            if (i14 >= array.size) {
                return;
            }
            array.items[i14].activateParticles(i, i2);
            i14++;
        }
    }

    @Override // com.badlogic.gdx.graphics.g3d.particles.ParticleControllerComponent
    public void allocateChannels() {
        int i = 0;
        while (true) {
            Array<DynamicsModifier> array = this.velocities;
            if (i >= array.size) {
                break;
            }
            array.items[i].allocateChannels();
            i++;
        }
        ParallelArray.FloatChannel floatChannel = (ParallelArray.FloatChannel) this.controller.particles.getChannel(ParticleChannels.Acceleration);
        this.accellerationChannel = floatChannel;
        boolean z = floatChannel != null;
        this.hasAcceleration = z;
        if (z) {
            this.positionChannel = (ParallelArray.FloatChannel) this.controller.particles.addChannel(ParticleChannels.Position);
            this.previousPositionChannel = (ParallelArray.FloatChannel) this.controller.particles.addChannel(ParticleChannels.PreviousPosition);
        }
        ParallelArray.FloatChannel floatChannel2 = (ParallelArray.FloatChannel) this.controller.particles.getChannel(ParticleChannels.AngularVelocity2D);
        this.angularVelocityChannel = floatChannel2;
        boolean z2 = floatChannel2 != null;
        this.has2dAngularVelocity = z2;
        if (z2) {
            this.rotationChannel = (ParallelArray.FloatChannel) this.controller.particles.addChannel(ParticleChannels.Rotation2D);
            this.has3dAngularVelocity = false;
            return;
        }
        ParallelArray.FloatChannel floatChannel3 = (ParallelArray.FloatChannel) this.controller.particles.getChannel(ParticleChannels.AngularVelocity3D);
        this.angularVelocityChannel = floatChannel3;
        boolean z3 = floatChannel3 != null;
        this.has3dAngularVelocity = z3;
        if (z3) {
            this.rotationChannel = (ParallelArray.FloatChannel) this.controller.particles.addChannel(ParticleChannels.Rotation3D);
        }
    }

    @Override // com.badlogic.gdx.graphics.g3d.particles.ParticleControllerComponent
    public void init() {
        int i = 0;
        while (true) {
            Array<DynamicsModifier> array = this.velocities;
            if (i >= array.size) {
                return;
            }
            array.items[i].init();
            i++;
        }
    }

    @Override // com.badlogic.gdx.graphics.g3d.particles.ParticleControllerComponent, com.badlogic.gdx.utils.Json.Serializable
    public void read(Json json, JsonValue jsonValue) {
        this.velocities.addAll((Array<? extends DynamicsModifier>) json.readValue("velocities", Array.class, DynamicsModifier.class, jsonValue));
    }

    @Override // com.badlogic.gdx.graphics.g3d.particles.ParticleControllerComponent
    public void set(ParticleController particleController) {
        super.set(particleController);
        int i = 0;
        while (true) {
            Array<DynamicsModifier> array = this.velocities;
            if (i >= array.size) {
                return;
            }
            array.items[i].set(particleController);
            i++;
        }
    }

    @Override // com.badlogic.gdx.graphics.g3d.particles.ParticleControllerComponent
    public void update() {
        if (this.hasAcceleration) {
            ParallelArray.FloatChannel floatChannel = this.accellerationChannel;
            Arrays.fill(floatChannel.data, 0, this.controller.particles.size * floatChannel.strideSize, 0.0f);
        }
        if (this.has2dAngularVelocity || this.has3dAngularVelocity) {
            ParallelArray.FloatChannel floatChannel2 = this.angularVelocityChannel;
            Arrays.fill(floatChannel2.data, 0, this.controller.particles.size * floatChannel2.strideSize, 0.0f);
        }
        int i = 0;
        while (true) {
            Array<DynamicsModifier> array = this.velocities;
            if (i >= array.size) {
                break;
            }
            array.items[i].update();
            i++;
        }
        if (this.hasAcceleration) {
            int i2 = 0;
            int i3 = 0;
            while (true) {
                ParticleController particleController = this.controller;
                if (i2 >= particleController.particles.size) {
                    break;
                }
                ParallelArray.FloatChannel floatChannel3 = this.positionChannel;
                float[] fArr = floatChannel3.data;
                float f = fArr[i3];
                int i4 = i3 + 1;
                float f2 = fArr[i4];
                int i5 = i3 + 2;
                float f3 = fArr[i5];
                float[] fArr2 = this.previousPositionChannel.data;
                float f4 = (f * 2.0f) - fArr2[i3];
                float[] fArr3 = this.accellerationChannel.data;
                float f5 = fArr3[i3];
                float f6 = particleController.deltaTimeSqr;
                fArr[i3] = (f5 * f6) + f4;
                fArr[i4] = (fArr3[i4] * f6) + ((f2 * 2.0f) - fArr2[i4]);
                fArr[i5] = (fArr3[i5] * f6) + ((2.0f * f3) - fArr2[i5]);
                fArr2[i3] = f;
                fArr2[i4] = f2;
                fArr2[i5] = f3;
                i2++;
                i3 += floatChannel3.strideSize;
            }
        }
        if (!this.has2dAngularVelocity) {
            if (this.has3dAngularVelocity) {
                int i6 = 0;
                int i7 = 0;
                int i8 = 0;
                while (i7 < this.controller.particles.size) {
                    float[] fArr4 = this.angularVelocityChannel.data;
                    float f7 = fArr4[i8];
                    float f8 = fArr4[i8 + 1];
                    float f9 = fArr4[i8 + 2];
                    float[] fArr5 = this.rotationChannel.data;
                    float f10 = fArr5[i6];
                    int i9 = i6 + 1;
                    float f11 = fArr5[i9];
                    int i10 = i6 + 2;
                    float f12 = fArr5[i10];
                    int i11 = i6 + 3;
                    float f13 = fArr5[i11];
                    Quaternion quaternion = ParticleControllerComponent.TMP_Q;
                    quaternion.set(f7, f8, f9, 0.0f).mul(f10, f11, f12, f13).mul(this.controller.deltaTime * 0.5f).add(f10, f11, f12, f13).nor();
                    ParallelArray.FloatChannel floatChannel4 = this.rotationChannel;
                    float[] fArr6 = floatChannel4.data;
                    fArr6[i6] = quaternion.x;
                    fArr6[i9] = quaternion.y;
                    fArr6[i10] = quaternion.z;
                    fArr6[i11] = quaternion.w;
                    i7++;
                    i6 += floatChannel4.strideSize;
                    i8 += this.angularVelocityChannel.strideSize;
                }
                return;
            }
            return;
        }
        int i12 = 0;
        int i13 = 0;
        while (true) {
            ParticleController particleController2 = this.controller;
            if (i12 >= particleController2.particles.size) {
                return;
            }
            float f14 = this.angularVelocityChannel.data[i12] * particleController2.deltaTime;
            if (f14 != 0.0f) {
                float fCosDeg = MathUtils.cosDeg(f14);
                float fSinDeg = MathUtils.sinDeg(f14);
                float[] fArr7 = this.rotationChannel.data;
                float f15 = fArr7[i13];
                int i14 = i13 + 1;
                float f16 = fArr7[i14];
                float f17 = (f15 * fCosDeg) - (f16 * fSinDeg);
                fArr7[i13] = f17;
                fArr7[i14] = (f15 * fSinDeg) + (f16 * fCosDeg);
            }
            i12++;
            i13 += this.rotationChannel.strideSize;
        }
    }

    @Override // com.badlogic.gdx.graphics.g3d.particles.ParticleControllerComponent, com.badlogic.gdx.utils.Json.Serializable
    public void write(Json json) {
        json.writeValue("velocities", this.velocities, Array.class, DynamicsModifier.class);
    }

    @Override // com.badlogic.gdx.graphics.g3d.particles.ParticleControllerComponent
    public DynamicsInfluencer copy() {
        return new DynamicsInfluencer(this);
    }

    public DynamicsInfluencer(DynamicsModifier... dynamicsModifierArr) {
        this.velocities = new Array<>(true, dynamicsModifierArr.length, DynamicsModifier.class);
        for (DynamicsModifier dynamicsModifier : dynamicsModifierArr) {
            this.velocities.add((DynamicsModifier) dynamicsModifier.copy());
        }
    }

    public DynamicsInfluencer(DynamicsInfluencer dynamicsInfluencer) {
        this((DynamicsModifier[]) dynamicsInfluencer.velocities.toArray(DynamicsModifier.class));
    }
}
