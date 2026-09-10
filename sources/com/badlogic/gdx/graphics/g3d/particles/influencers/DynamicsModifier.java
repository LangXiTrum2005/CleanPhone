package com.badlogic.gdx.graphics.g3d.particles.influencers;

import com.badlogic.gdx.graphics.g3d.particles.ParallelArray;
import com.badlogic.gdx.graphics.g3d.particles.ParticleChannels;
import com.badlogic.gdx.graphics.g3d.particles.ParticleControllerComponent;
import com.badlogic.gdx.graphics.g3d.particles.values.ScaledNumericValue;
import com.badlogic.gdx.math.MathUtils;
import com.badlogic.gdx.math.Matrix4;
import com.badlogic.gdx.math.Quaternion;
import com.badlogic.gdx.math.Vector3;
import com.badlogic.gdx.utils.Json;
import com.badlogic.gdx.utils.JsonValue;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3950lJ;

/* JADX INFO: loaded from: classes.dex */
public abstract class DynamicsModifier extends Influencer {
    public boolean isGlobal;
    protected ParallelArray.FloatChannel lifeChannel;
    protected static final Vector3 TMP_V1 = new Vector3();
    protected static final Vector3 TMP_V2 = new Vector3();
    protected static final Vector3 TMP_V3 = new Vector3();
    protected static final Quaternion TMP_Q = new Quaternion();

    public static class BrownianAcceleration extends Strength {
        ParallelArray.FloatChannel accelerationChannel;

        public BrownianAcceleration() {
        }

        @Override // com.badlogic.gdx.graphics.g3d.particles.influencers.DynamicsModifier.Strength, com.badlogic.gdx.graphics.g3d.particles.influencers.DynamicsModifier, com.badlogic.gdx.graphics.g3d.particles.ParticleControllerComponent
        public void allocateChannels() {
            super.allocateChannels();
            this.accelerationChannel = (ParallelArray.FloatChannel) this.controller.particles.addChannel(ParticleChannels.Acceleration);
        }

        @Override // com.badlogic.gdx.graphics.g3d.particles.ParticleControllerComponent
        public void update() {
            int i = this.controller.particles.size;
            int i2 = 2;
            int i3 = 0;
            int i4 = 0;
            int i5 = 0;
            while (i3 < i) {
                float[] fArr = this.strengthChannel.data;
                float f = fArr[i4];
                float fI = AbstractC3950lJ.i(this.strengthValue, this.lifeChannel.data[i2], fArr[i4 + 1], f);
                Vector3 vector3 = DynamicsModifier.TMP_V3;
                vector3.set(MathUtils.random(-1.0f, 1.0f), MathUtils.random(-1.0f, 1.0f), MathUtils.random(-1.0f, 1.0f)).nor().scl(fI);
                ParallelArray.FloatChannel floatChannel = this.accelerationChannel;
                float[] fArr2 = floatChannel.data;
                fArr2[i5] = fArr2[i5] + vector3.x;
                int i6 = i5 + 1;
                fArr2[i6] = fArr2[i6] + vector3.y;
                int i7 = i5 + 2;
                fArr2[i7] = fArr2[i7] + vector3.z;
                i3++;
                i4 += this.strengthChannel.strideSize;
                i5 += floatChannel.strideSize;
                i2 += this.lifeChannel.strideSize;
            }
        }

        public BrownianAcceleration(BrownianAcceleration brownianAcceleration) {
            super(brownianAcceleration);
        }

        @Override // com.badlogic.gdx.graphics.g3d.particles.ParticleControllerComponent
        public BrownianAcceleration copy() {
            return new BrownianAcceleration(this);
        }
    }

    public static class CentripetalAcceleration extends Strength {
        ParallelArray.FloatChannel accelerationChannel;
        ParallelArray.FloatChannel positionChannel;

        public CentripetalAcceleration() {
        }

        @Override // com.badlogic.gdx.graphics.g3d.particles.influencers.DynamicsModifier.Strength, com.badlogic.gdx.graphics.g3d.particles.influencers.DynamicsModifier, com.badlogic.gdx.graphics.g3d.particles.ParticleControllerComponent
        public void allocateChannels() {
            super.allocateChannels();
            this.accelerationChannel = (ParallelArray.FloatChannel) this.controller.particles.addChannel(ParticleChannels.Acceleration);
            this.positionChannel = (ParallelArray.FloatChannel) this.controller.particles.addChannel(ParticleChannels.Position);
        }

        @Override // com.badlogic.gdx.graphics.g3d.particles.ParticleControllerComponent
        public void update() {
            float f;
            float f2;
            float f3;
            if (this.isGlobal) {
                f = 0.0f;
                f2 = 0.0f;
                f3 = 0.0f;
            } else {
                float[] fArr = this.controller.transform.val;
                f = fArr[12];
                f3 = fArr[13];
                f2 = fArr[14];
            }
            int i = this.controller.particles.size;
            int i2 = 2;
            int i3 = 0;
            int i4 = 0;
            int i5 = 0;
            int i6 = 0;
            while (i3 < i) {
                float[] fArr2 = this.strengthChannel.data;
                float f4 = fArr2[i4];
                float fI = AbstractC3950lJ.i(this.strengthValue, this.lifeChannel.data[i2], fArr2[i4 + 1], f4);
                Vector3 vector3 = DynamicsModifier.TMP_V3;
                float[] fArr3 = this.positionChannel.data;
                vector3.set(fArr3[i5] - f, fArr3[i5 + 1] - f3, fArr3[i5 + 2] - f2).nor().scl(fI);
                ParallelArray.FloatChannel floatChannel = this.accelerationChannel;
                float[] fArr4 = floatChannel.data;
                fArr4[i6] = fArr4[i6] + vector3.x;
                int i7 = i6 + 1;
                fArr4[i7] = fArr4[i7] + vector3.y;
                int i8 = i6 + 2;
                fArr4[i8] = fArr4[i8] + vector3.z;
                i3++;
                i5 += this.positionChannel.strideSize;
                i4 += this.strengthChannel.strideSize;
                i6 += floatChannel.strideSize;
                i2 += this.lifeChannel.strideSize;
            }
        }

        public CentripetalAcceleration(CentripetalAcceleration centripetalAcceleration) {
            super(centripetalAcceleration);
        }

        @Override // com.badlogic.gdx.graphics.g3d.particles.ParticleControllerComponent
        public CentripetalAcceleration copy() {
            return new CentripetalAcceleration(this);
        }
    }

    public static class FaceDirection extends DynamicsModifier {
        ParallelArray.FloatChannel accellerationChannel;
        ParallelArray.FloatChannel rotationChannel;

        public FaceDirection() {
        }

        @Override // com.badlogic.gdx.graphics.g3d.particles.influencers.DynamicsModifier, com.badlogic.gdx.graphics.g3d.particles.ParticleControllerComponent
        public void allocateChannels() {
            this.rotationChannel = (ParallelArray.FloatChannel) this.controller.particles.addChannel(ParticleChannels.Rotation3D);
            this.accellerationChannel = (ParallelArray.FloatChannel) this.controller.particles.addChannel(ParticleChannels.Acceleration);
        }

        @Override // com.badlogic.gdx.graphics.g3d.particles.ParticleControllerComponent
        public ParticleControllerComponent copy() {
            return new FaceDirection(this);
        }

        @Override // com.badlogic.gdx.graphics.g3d.particles.ParticleControllerComponent
        public void update() {
            int i = this.controller.particles.size * this.rotationChannel.strideSize;
            int i2 = 0;
            int i3 = 0;
            while (i2 < i) {
                Vector3 vector3 = DynamicsModifier.TMP_V1;
                float[] fArr = this.accellerationChannel.data;
                Vector3 vector3Nor = vector3.set(fArr[i3], fArr[i3 + 1], fArr[i3 + 2]).nor();
                Vector3 vector3Nor2 = DynamicsModifier.TMP_V2.set(vector3).crs(Vector3.Y).nor().crs(vector3).nor();
                Vector3 vector3Nor3 = DynamicsModifier.TMP_V3.set(vector3Nor2).crs(vector3Nor).nor();
                Quaternion quaternion = DynamicsModifier.TMP_Q;
                quaternion.setFromAxes(false, vector3Nor3.x, vector3Nor2.x, vector3Nor.x, vector3Nor3.y, vector3Nor2.y, vector3Nor.y, vector3Nor3.z, vector3Nor2.z, vector3Nor.z);
                ParallelArray.FloatChannel floatChannel = this.rotationChannel;
                float[] fArr2 = floatChannel.data;
                fArr2[i2] = quaternion.x;
                fArr2[i2 + 1] = quaternion.y;
                fArr2[i2 + 2] = quaternion.z;
                fArr2[i2 + 3] = quaternion.w;
                i2 += floatChannel.strideSize;
                i3 += this.accellerationChannel.strideSize;
            }
        }

        public FaceDirection(FaceDirection faceDirection) {
            super(faceDirection);
        }
    }

    public static class PolarAcceleration extends Angular {
        ParallelArray.FloatChannel directionalVelocityChannel;

        public PolarAcceleration() {
        }

        @Override // com.badlogic.gdx.graphics.g3d.particles.influencers.DynamicsModifier.Angular, com.badlogic.gdx.graphics.g3d.particles.influencers.DynamicsModifier.Strength, com.badlogic.gdx.graphics.g3d.particles.influencers.DynamicsModifier, com.badlogic.gdx.graphics.g3d.particles.ParticleControllerComponent
        public void allocateChannels() {
            super.allocateChannels();
            this.directionalVelocityChannel = (ParallelArray.FloatChannel) this.controller.particles.addChannel(ParticleChannels.Acceleration);
        }

        @Override // com.badlogic.gdx.graphics.g3d.particles.ParticleControllerComponent
        public void update() {
            int i = this.controller.particles.size * this.directionalVelocityChannel.strideSize;
            int i2 = 0;
            int i3 = 0;
            int i4 = 0;
            int i5 = 2;
            while (i2 < i) {
                float f = this.lifeChannel.data[i5];
                float[] fArr = this.strengthChannel.data;
                float f2 = fArr[i3];
                float fI = AbstractC3950lJ.i(this.strengthValue, f, fArr[i3 + 1], f2);
                float[] fArr2 = this.angularChannel.data;
                float f3 = fArr2[i4 + 2];
                float fI2 = AbstractC3950lJ.i(this.phiValue, f, fArr2[i4 + 3], f3);
                float[] fArr3 = this.angularChannel.data;
                float f4 = fArr3[i4];
                float fI3 = AbstractC3950lJ.i(this.thetaValue, f, fArr3[i4 + 1], f4);
                float fCosDeg = MathUtils.cosDeg(fI3);
                float fSinDeg = MathUtils.sinDeg(fI3);
                float fCosDeg2 = MathUtils.cosDeg(fI2);
                float fSinDeg2 = MathUtils.sinDeg(fI2);
                Vector3 vector3 = DynamicsModifier.TMP_V3;
                vector3.set(fCosDeg * fSinDeg2, fCosDeg2, fSinDeg * fSinDeg2).nor().scl(fI);
                if (!this.isGlobal) {
                    Matrix4 matrix4 = this.controller.transform;
                    Quaternion quaternion = DynamicsModifier.TMP_Q;
                    matrix4.getRotation(quaternion, true);
                    vector3.mul(quaternion);
                }
                ParallelArray.FloatChannel floatChannel = this.directionalVelocityChannel;
                float[] fArr4 = floatChannel.data;
                fArr4[i2] = fArr4[i2] + vector3.x;
                int i6 = i2 + 1;
                fArr4[i6] = fArr4[i6] + vector3.y;
                int i7 = i2 + 2;
                fArr4[i7] = fArr4[i7] + vector3.z;
                i3 += this.strengthChannel.strideSize;
                i2 += floatChannel.strideSize;
                i4 += this.angularChannel.strideSize;
                i5 += this.lifeChannel.strideSize;
            }
        }

        public PolarAcceleration(PolarAcceleration polarAcceleration) {
            super(polarAcceleration);
        }

        @Override // com.badlogic.gdx.graphics.g3d.particles.ParticleControllerComponent
        public PolarAcceleration copy() {
            return new PolarAcceleration(this);
        }
    }

    public static class Rotational2D extends Strength {
        ParallelArray.FloatChannel rotationalVelocity2dChannel;

        public Rotational2D() {
        }

        @Override // com.badlogic.gdx.graphics.g3d.particles.influencers.DynamicsModifier.Strength, com.badlogic.gdx.graphics.g3d.particles.influencers.DynamicsModifier, com.badlogic.gdx.graphics.g3d.particles.ParticleControllerComponent
        public void allocateChannels() {
            super.allocateChannels();
            this.rotationalVelocity2dChannel = (ParallelArray.FloatChannel) this.controller.particles.addChannel(ParticleChannels.AngularVelocity2D);
        }

        @Override // com.badlogic.gdx.graphics.g3d.particles.ParticleControllerComponent
        public void update() {
            int i = this.controller.particles.size * this.rotationalVelocity2dChannel.strideSize;
            int i2 = 0;
            int i3 = 0;
            int i4 = 2;
            while (i2 < i) {
                float[] fArr = this.rotationalVelocity2dChannel.data;
                float f = fArr[i2];
                float[] fArr2 = this.strengthChannel.data;
                fArr[i2] = (this.strengthValue.getScale(this.lifeChannel.data[i4]) * fArr2[i3 + 1]) + fArr2[i3] + f;
                i3 += this.strengthChannel.strideSize;
                i2 += this.rotationalVelocity2dChannel.strideSize;
                i4 += this.lifeChannel.strideSize;
            }
        }

        public Rotational2D(Rotational2D rotational2D) {
            super(rotational2D);
        }

        @Override // com.badlogic.gdx.graphics.g3d.particles.ParticleControllerComponent
        public Rotational2D copy() {
            return new Rotational2D(this);
        }
    }

    public static class Rotational3D extends Angular {
        ParallelArray.FloatChannel rotationChannel;
        ParallelArray.FloatChannel rotationalForceChannel;

        public Rotational3D() {
        }

        @Override // com.badlogic.gdx.graphics.g3d.particles.influencers.DynamicsModifier.Angular, com.badlogic.gdx.graphics.g3d.particles.influencers.DynamicsModifier.Strength, com.badlogic.gdx.graphics.g3d.particles.influencers.DynamicsModifier, com.badlogic.gdx.graphics.g3d.particles.ParticleControllerComponent
        public void allocateChannels() {
            super.allocateChannels();
            this.rotationChannel = (ParallelArray.FloatChannel) this.controller.particles.addChannel(ParticleChannels.Rotation3D);
            this.rotationalForceChannel = (ParallelArray.FloatChannel) this.controller.particles.addChannel(ParticleChannels.AngularVelocity3D);
        }

        @Override // com.badlogic.gdx.graphics.g3d.particles.ParticleControllerComponent
        public void update() {
            int i = this.controller.particles.size * this.rotationalForceChannel.strideSize;
            int i2 = 0;
            int i3 = 0;
            int i4 = 0;
            int i5 = 2;
            while (i2 < i) {
                float f = this.lifeChannel.data[i5];
                float[] fArr = this.strengthChannel.data;
                float f2 = fArr[i3];
                float fI = AbstractC3950lJ.i(this.strengthValue, f, fArr[i3 + 1], f2);
                float[] fArr2 = this.angularChannel.data;
                float f3 = fArr2[i4 + 2];
                float fI2 = AbstractC3950lJ.i(this.phiValue, f, fArr2[i4 + 3], f3);
                float[] fArr3 = this.angularChannel.data;
                float f4 = fArr3[i4];
                float fI3 = AbstractC3950lJ.i(this.thetaValue, f, fArr3[i4 + 1], f4);
                float fCosDeg = MathUtils.cosDeg(fI3);
                float fSinDeg = MathUtils.sinDeg(fI3);
                float fCosDeg2 = MathUtils.cosDeg(fI2);
                float fSinDeg2 = MathUtils.sinDeg(fI2);
                Vector3 vector3 = DynamicsModifier.TMP_V3;
                vector3.set(fCosDeg * fSinDeg2, fCosDeg2, fSinDeg * fSinDeg2);
                vector3.scl(fI * 0.017453292f);
                ParallelArray.FloatChannel floatChannel = this.rotationalForceChannel;
                float[] fArr4 = floatChannel.data;
                fArr4[i2] = fArr4[i2] + vector3.x;
                int i6 = i2 + 1;
                fArr4[i6] = fArr4[i6] + vector3.y;
                int i7 = i2 + 2;
                fArr4[i7] = fArr4[i7] + vector3.z;
                i3 += this.strengthChannel.strideSize;
                i2 += floatChannel.strideSize;
                i4 += this.angularChannel.strideSize;
                i5 += this.lifeChannel.strideSize;
            }
        }

        public Rotational3D(Rotational3D rotational3D) {
            super(rotational3D);
        }

        @Override // com.badlogic.gdx.graphics.g3d.particles.ParticleControllerComponent
        public Rotational3D copy() {
            return new Rotational3D(this);
        }
    }

    public static class TangentialAcceleration extends Angular {
        ParallelArray.FloatChannel directionalVelocityChannel;
        ParallelArray.FloatChannel positionChannel;

        public TangentialAcceleration() {
        }

        @Override // com.badlogic.gdx.graphics.g3d.particles.influencers.DynamicsModifier.Angular, com.badlogic.gdx.graphics.g3d.particles.influencers.DynamicsModifier.Strength, com.badlogic.gdx.graphics.g3d.particles.influencers.DynamicsModifier, com.badlogic.gdx.graphics.g3d.particles.ParticleControllerComponent
        public void allocateChannels() {
            super.allocateChannels();
            this.directionalVelocityChannel = (ParallelArray.FloatChannel) this.controller.particles.addChannel(ParticleChannels.Acceleration);
            this.positionChannel = (ParallelArray.FloatChannel) this.controller.particles.addChannel(ParticleChannels.Position);
        }

        @Override // com.badlogic.gdx.graphics.g3d.particles.ParticleControllerComponent
        public void update() {
            int i = this.controller.particles.size * this.directionalVelocityChannel.strideSize;
            int i2 = 0;
            int i3 = 0;
            int i4 = 0;
            int i5 = 0;
            int i6 = 2;
            while (i2 < i) {
                float f = this.lifeChannel.data[i6];
                float[] fArr = this.strengthChannel.data;
                float f2 = fArr[i3];
                float fI = AbstractC3950lJ.i(this.strengthValue, f, fArr[i3 + 1], f2);
                float[] fArr2 = this.angularChannel.data;
                float f3 = fArr2[i4 + 2];
                float fI2 = AbstractC3950lJ.i(this.phiValue, f, fArr2[i4 + 3], f3);
                float[] fArr3 = this.angularChannel.data;
                float f4 = fArr3[i4];
                float fI3 = AbstractC3950lJ.i(this.thetaValue, f, fArr3[i4 + 1], f4);
                float fCosDeg = MathUtils.cosDeg(fI3);
                float fSinDeg = MathUtils.sinDeg(fI3);
                float fCosDeg2 = MathUtils.cosDeg(fI2);
                float fSinDeg2 = MathUtils.sinDeg(fI2);
                Vector3 vector3 = DynamicsModifier.TMP_V3;
                vector3.set(fCosDeg * fSinDeg2, fCosDeg2, fSinDeg * fSinDeg2);
                Vector3 vector4 = DynamicsModifier.TMP_V1;
                float[] fArr4 = this.positionChannel.data;
                vector4.set(fArr4[i5], fArr4[i5 + 1], fArr4[i5 + 2]);
                if (!this.isGlobal) {
                    Matrix4 matrix4 = this.controller.transform;
                    Vector3 vector5 = DynamicsModifier.TMP_V2;
                    matrix4.getTranslation(vector5);
                    vector4.sub(vector5);
                    Matrix4 matrix5 = this.controller.transform;
                    Quaternion quaternion = DynamicsModifier.TMP_Q;
                    matrix5.getRotation(quaternion, true);
                    vector3.mul(quaternion);
                }
                vector3.crs(vector4).nor().scl(fI);
                ParallelArray.FloatChannel floatChannel = this.directionalVelocityChannel;
                float[] fArr5 = floatChannel.data;
                fArr5[i2] = fArr5[i2] + vector3.x;
                int i7 = i2 + 1;
                fArr5[i7] = fArr5[i7] + vector3.y;
                int i8 = i2 + 2;
                fArr5[i8] = fArr5[i8] + vector3.z;
                i3 += this.strengthChannel.strideSize;
                i2 += floatChannel.strideSize;
                i4 += this.angularChannel.strideSize;
                i6 += this.lifeChannel.strideSize;
                i5 += this.positionChannel.strideSize;
            }
        }

        public TangentialAcceleration(TangentialAcceleration tangentialAcceleration) {
            super(tangentialAcceleration);
        }

        @Override // com.badlogic.gdx.graphics.g3d.particles.ParticleControllerComponent
        public TangentialAcceleration copy() {
            return new TangentialAcceleration(this);
        }
    }

    public DynamicsModifier() {
        this.isGlobal = false;
    }

    @Override // com.badlogic.gdx.graphics.g3d.particles.ParticleControllerComponent
    public void allocateChannels() {
        this.lifeChannel = (ParallelArray.FloatChannel) this.controller.particles.addChannel(ParticleChannels.Life);
    }

    @Override // com.badlogic.gdx.graphics.g3d.particles.ParticleControllerComponent, com.badlogic.gdx.utils.Json.Serializable
    public void read(Json json, JsonValue jsonValue) {
        super.read(json, jsonValue);
        this.isGlobal = ((Boolean) json.readValue("isGlobal", Boolean.TYPE, jsonValue)).booleanValue();
    }

    @Override // com.badlogic.gdx.graphics.g3d.particles.ParticleControllerComponent, com.badlogic.gdx.utils.Json.Serializable
    public void write(Json json) {
        super.write(json);
        json.writeValue("isGlobal", Boolean.valueOf(this.isGlobal));
    }

    public static abstract class Strength extends DynamicsModifier {
        protected ParallelArray.FloatChannel strengthChannel;
        public ScaledNumericValue strengthValue;

        public Strength() {
            this.strengthValue = new ScaledNumericValue();
        }

        @Override // com.badlogic.gdx.graphics.g3d.particles.ParticleControllerComponent
        public void activateParticles(int i, int i2) {
            int i3 = this.strengthChannel.strideSize;
            int i4 = i * i3;
            int i5 = (i2 * i3) + i4;
            while (i4 < i5) {
                float fNewLowValue = this.strengthValue.newLowValue();
                float fNewHighValue = this.strengthValue.newHighValue();
                if (!this.strengthValue.isRelative()) {
                    fNewHighValue -= fNewLowValue;
                }
                ParallelArray.FloatChannel floatChannel = this.strengthChannel;
                float[] fArr = floatChannel.data;
                fArr[i4] = fNewLowValue;
                fArr[i4 + 1] = fNewHighValue;
                i4 += floatChannel.strideSize;
            }
        }

        @Override // com.badlogic.gdx.graphics.g3d.particles.influencers.DynamicsModifier, com.badlogic.gdx.graphics.g3d.particles.ParticleControllerComponent
        public void allocateChannels() {
            super.allocateChannels();
            ParallelArray.ChannelDescriptor channelDescriptor = ParticleChannels.Interpolation;
            channelDescriptor.id = this.controller.particleChannels.newId();
            this.strengthChannel = (ParallelArray.FloatChannel) this.controller.particles.addChannel(channelDescriptor);
        }

        @Override // com.badlogic.gdx.graphics.g3d.particles.influencers.DynamicsModifier, com.badlogic.gdx.graphics.g3d.particles.ParticleControllerComponent, com.badlogic.gdx.utils.Json.Serializable
        public void read(Json json, JsonValue jsonValue) {
            super.read(json, jsonValue);
            this.strengthValue = (ScaledNumericValue) json.readValue("strengthValue", ScaledNumericValue.class, jsonValue);
        }

        @Override // com.badlogic.gdx.graphics.g3d.particles.influencers.DynamicsModifier, com.badlogic.gdx.graphics.g3d.particles.ParticleControllerComponent, com.badlogic.gdx.utils.Json.Serializable
        public void write(Json json) {
            super.write(json);
            json.writeValue("strengthValue", this.strengthValue);
        }

        public Strength(Strength strength) {
            super(strength);
            ScaledNumericValue scaledNumericValue = new ScaledNumericValue();
            this.strengthValue = scaledNumericValue;
            scaledNumericValue.load(strength.strengthValue);
        }
    }

    public static abstract class Angular extends Strength {
        protected ParallelArray.FloatChannel angularChannel;
        public ScaledNumericValue phiValue;
        public ScaledNumericValue thetaValue;

        public Angular() {
            this.thetaValue = new ScaledNumericValue();
            this.phiValue = new ScaledNumericValue();
        }

        @Override // com.badlogic.gdx.graphics.g3d.particles.influencers.DynamicsModifier.Strength, com.badlogic.gdx.graphics.g3d.particles.ParticleControllerComponent
        public void activateParticles(int i, int i2) {
            super.activateParticles(i, i2);
            int i3 = this.angularChannel.strideSize;
            int i4 = i * i3;
            int i5 = (i2 * i3) + i4;
            while (i4 < i5) {
                float fNewLowValue = this.thetaValue.newLowValue();
                float fNewHighValue = this.thetaValue.newHighValue();
                if (!this.thetaValue.isRelative()) {
                    fNewHighValue -= fNewLowValue;
                }
                float[] fArr = this.angularChannel.data;
                fArr[i4] = fNewLowValue;
                fArr[i4 + 1] = fNewHighValue;
                float fNewLowValue2 = this.phiValue.newLowValue();
                float fNewHighValue2 = this.phiValue.newHighValue();
                if (!this.phiValue.isRelative()) {
                    fNewHighValue2 -= fNewLowValue2;
                }
                ParallelArray.FloatChannel floatChannel = this.angularChannel;
                float[] fArr2 = floatChannel.data;
                fArr2[i4 + 2] = fNewLowValue2;
                fArr2[i4 + 3] = fNewHighValue2;
                i4 += floatChannel.strideSize;
            }
        }

        @Override // com.badlogic.gdx.graphics.g3d.particles.influencers.DynamicsModifier.Strength, com.badlogic.gdx.graphics.g3d.particles.influencers.DynamicsModifier, com.badlogic.gdx.graphics.g3d.particles.ParticleControllerComponent
        public void allocateChannels() {
            super.allocateChannels();
            ParallelArray.ChannelDescriptor channelDescriptor = ParticleChannels.Interpolation4;
            channelDescriptor.id = this.controller.particleChannels.newId();
            this.angularChannel = (ParallelArray.FloatChannel) this.controller.particles.addChannel(channelDescriptor);
        }

        @Override // com.badlogic.gdx.graphics.g3d.particles.influencers.DynamicsModifier.Strength, com.badlogic.gdx.graphics.g3d.particles.influencers.DynamicsModifier, com.badlogic.gdx.graphics.g3d.particles.ParticleControllerComponent, com.badlogic.gdx.utils.Json.Serializable
        public void read(Json json, JsonValue jsonValue) {
            super.read(json, jsonValue);
            this.thetaValue = (ScaledNumericValue) json.readValue("thetaValue", ScaledNumericValue.class, jsonValue);
            this.phiValue = (ScaledNumericValue) json.readValue("phiValue", ScaledNumericValue.class, jsonValue);
        }

        @Override // com.badlogic.gdx.graphics.g3d.particles.influencers.DynamicsModifier.Strength, com.badlogic.gdx.graphics.g3d.particles.influencers.DynamicsModifier, com.badlogic.gdx.graphics.g3d.particles.ParticleControllerComponent, com.badlogic.gdx.utils.Json.Serializable
        public void write(Json json) {
            super.write(json);
            json.writeValue("thetaValue", this.thetaValue);
            json.writeValue("phiValue", this.phiValue);
        }

        public Angular(Angular angular) {
            super(angular);
            this.thetaValue = new ScaledNumericValue();
            this.phiValue = new ScaledNumericValue();
            this.thetaValue.load(angular.thetaValue);
            this.phiValue.load(angular.phiValue);
        }
    }

    public DynamicsModifier(DynamicsModifier dynamicsModifier) {
        this.isGlobal = false;
        this.isGlobal = dynamicsModifier.isGlobal;
    }
}
