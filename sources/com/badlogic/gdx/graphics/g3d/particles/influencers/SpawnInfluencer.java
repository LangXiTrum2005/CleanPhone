package com.badlogic.gdx.graphics.g3d.particles.influencers;

import com.badlogic.gdx.assets.AssetManager;
import com.badlogic.gdx.graphics.g3d.particles.ParallelArray;
import com.badlogic.gdx.graphics.g3d.particles.ParticleChannels;
import com.badlogic.gdx.graphics.g3d.particles.ParticleControllerComponent;
import com.badlogic.gdx.graphics.g3d.particles.ResourceData;
import com.badlogic.gdx.graphics.g3d.particles.values.PointSpawnShapeValue;
import com.badlogic.gdx.graphics.g3d.particles.values.SpawnShapeValue;
import com.badlogic.gdx.math.Matrix4;
import com.badlogic.gdx.math.Quaternion;
import com.badlogic.gdx.math.Vector3;
import com.badlogic.gdx.utils.Json;
import com.badlogic.gdx.utils.JsonValue;

/* JADX INFO: loaded from: classes.dex */
public class SpawnInfluencer extends Influencer {
    ParallelArray.FloatChannel positionChannel;
    ParallelArray.FloatChannel rotationChannel;
    public SpawnShapeValue spawnShapeValue;

    public SpawnInfluencer() {
        this.spawnShapeValue = new PointSpawnShapeValue();
    }

    @Override // com.badlogic.gdx.graphics.g3d.particles.ParticleControllerComponent
    public void activateParticles(int i, int i2) {
        int i3 = this.positionChannel.strideSize;
        int i4 = i * i3;
        int i5 = (i3 * i2) + i4;
        while (i4 < i5) {
            SpawnShapeValue spawnShapeValue = this.spawnShapeValue;
            Vector3 vector3 = ParticleControllerComponent.TMP_V1;
            spawnShapeValue.spawn(vector3, this.controller.emitter.percent);
            vector3.mul(this.controller.transform);
            ParallelArray.FloatChannel floatChannel = this.positionChannel;
            float[] fArr = floatChannel.data;
            fArr[i4] = vector3.x;
            fArr[i4 + 1] = vector3.y;
            fArr[i4 + 2] = vector3.z;
            i4 += floatChannel.strideSize;
        }
        int i6 = this.rotationChannel.strideSize;
        int i7 = i * i6;
        int i8 = (i2 * i6) + i7;
        while (i7 < i8) {
            Matrix4 matrix4 = this.controller.transform;
            Quaternion quaternion = ParticleControllerComponent.TMP_Q;
            matrix4.getRotation(quaternion, true);
            ParallelArray.FloatChannel floatChannel2 = this.rotationChannel;
            float[] fArr2 = floatChannel2.data;
            fArr2[i7] = quaternion.x;
            fArr2[i7 + 1] = quaternion.y;
            fArr2[i7 + 2] = quaternion.z;
            fArr2[i7 + 3] = quaternion.w;
            i7 += floatChannel2.strideSize;
        }
    }

    @Override // com.badlogic.gdx.graphics.g3d.particles.ParticleControllerComponent
    public void allocateChannels() {
        this.positionChannel = (ParallelArray.FloatChannel) this.controller.particles.addChannel(ParticleChannels.Position);
        this.rotationChannel = (ParallelArray.FloatChannel) this.controller.particles.addChannel(ParticleChannels.Rotation3D);
    }

    @Override // com.badlogic.gdx.graphics.g3d.particles.ParticleControllerComponent
    public void init() {
        this.spawnShapeValue.init();
    }

    @Override // com.badlogic.gdx.graphics.g3d.particles.ParticleControllerComponent, com.badlogic.gdx.graphics.g3d.particles.ResourceData.Configurable
    public void load(AssetManager assetManager, ResourceData resourceData) {
        this.spawnShapeValue.load(assetManager, resourceData);
    }

    @Override // com.badlogic.gdx.graphics.g3d.particles.ParticleControllerComponent, com.badlogic.gdx.utils.Json.Serializable
    public void read(Json json, JsonValue jsonValue) {
        this.spawnShapeValue = (SpawnShapeValue) json.readValue("spawnShape", SpawnShapeValue.class, jsonValue);
    }

    @Override // com.badlogic.gdx.graphics.g3d.particles.ParticleControllerComponent, com.badlogic.gdx.graphics.g3d.particles.ResourceData.Configurable
    public void save(AssetManager assetManager, ResourceData resourceData) {
        this.spawnShapeValue.save(assetManager, resourceData);
    }

    @Override // com.badlogic.gdx.graphics.g3d.particles.ParticleControllerComponent
    public void start() {
        this.spawnShapeValue.start();
    }

    @Override // com.badlogic.gdx.graphics.g3d.particles.ParticleControllerComponent, com.badlogic.gdx.utils.Json.Serializable
    public void write(Json json) {
        json.writeValue("spawnShape", this.spawnShapeValue, SpawnShapeValue.class);
    }

    @Override // com.badlogic.gdx.graphics.g3d.particles.ParticleControllerComponent
    public SpawnInfluencer copy() {
        return new SpawnInfluencer(this);
    }

    public SpawnInfluencer(SpawnShapeValue spawnShapeValue) {
        this.spawnShapeValue = spawnShapeValue;
    }

    public SpawnInfluencer(SpawnInfluencer spawnInfluencer) {
        this.spawnShapeValue = spawnInfluencer.spawnShapeValue.copy();
    }
}
