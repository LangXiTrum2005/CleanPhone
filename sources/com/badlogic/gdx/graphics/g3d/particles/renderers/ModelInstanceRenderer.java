package com.badlogic.gdx.graphics.g3d.particles.renderers;

import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.g3d.ModelInstance;
import com.badlogic.gdx.graphics.g3d.attributes.BlendingAttribute;
import com.badlogic.gdx.graphics.g3d.attributes.ColorAttribute;
import com.badlogic.gdx.graphics.g3d.particles.ParallelArray;
import com.badlogic.gdx.graphics.g3d.particles.ParticleChannels;
import com.badlogic.gdx.graphics.g3d.particles.ParticleControllerComponent;
import com.badlogic.gdx.graphics.g3d.particles.batches.ModelInstanceParticleBatch;
import com.badlogic.gdx.graphics.g3d.particles.batches.ParticleBatch;

/* JADX INFO: loaded from: classes.dex */
public class ModelInstanceRenderer extends ParticleControllerRenderer<ModelInstanceControllerRenderData, ModelInstanceParticleBatch> {
    private boolean hasColor;
    private boolean hasRotation;
    private boolean hasScale;

    public ModelInstanceRenderer() {
        super(new ModelInstanceControllerRenderData());
    }

    @Override // com.badlogic.gdx.graphics.g3d.particles.ParticleControllerComponent
    public void allocateChannels() {
        ((ModelInstanceControllerRenderData) this.renderData).positionChannel = (ParallelArray.FloatChannel) this.controller.particles.addChannel(ParticleChannels.Position);
    }

    @Override // com.badlogic.gdx.graphics.g3d.particles.ParticleControllerComponent
    public ParticleControllerComponent copy() {
        return new ModelInstanceRenderer((ModelInstanceParticleBatch) this.batch);
    }

    @Override // com.badlogic.gdx.graphics.g3d.particles.ParticleControllerComponent
    public void init() {
        ((ModelInstanceControllerRenderData) this.renderData).modelInstanceChannel = (ParallelArray.ObjectChannel) this.controller.particles.getChannel(ParticleChannels.ModelInstance);
        ((ModelInstanceControllerRenderData) this.renderData).colorChannel = (ParallelArray.FloatChannel) this.controller.particles.getChannel(ParticleChannels.Color);
        ((ModelInstanceControllerRenderData) this.renderData).scaleChannel = (ParallelArray.FloatChannel) this.controller.particles.getChannel(ParticleChannels.Scale);
        ((ModelInstanceControllerRenderData) this.renderData).rotationChannel = (ParallelArray.FloatChannel) this.controller.particles.getChannel(ParticleChannels.Rotation3D);
        D d = this.renderData;
        this.hasColor = ((ModelInstanceControllerRenderData) d).colorChannel != null;
        this.hasScale = ((ModelInstanceControllerRenderData) d).scaleChannel != null;
        this.hasRotation = ((ModelInstanceControllerRenderData) d).rotationChannel != null;
    }

    @Override // com.badlogic.gdx.graphics.g3d.particles.renderers.ParticleControllerRenderer
    public boolean isCompatible(ParticleBatch<?> particleBatch) {
        return particleBatch instanceof ModelInstanceParticleBatch;
    }

    @Override // com.badlogic.gdx.graphics.g3d.particles.renderers.ParticleControllerRenderer, com.badlogic.gdx.graphics.g3d.particles.ParticleControllerComponent
    public void update() {
        float f;
        float f2;
        float f3;
        float f4;
        int i = this.controller.particles.size;
        int i2 = 0;
        int i3 = 0;
        while (i2 < i) {
            D d = this.renderData;
            ModelInstance modelInstance = ((ModelInstanceControllerRenderData) d).modelInstanceChannel.data[i2];
            float f5 = this.hasScale ? ((ModelInstanceControllerRenderData) d).scaleChannel.data[i2] : 1.0f;
            if (this.hasRotation) {
                int i4 = ((ModelInstanceControllerRenderData) d).rotationChannel.strideSize * i2;
                float f6 = ((ModelInstanceControllerRenderData) d).rotationChannel.data[i4];
                float f7 = ((ModelInstanceControllerRenderData) d).rotationChannel.data[i4 + 1];
                float f8 = ((ModelInstanceControllerRenderData) d).rotationChannel.data[i4 + 2];
                f4 = ((ModelInstanceControllerRenderData) d).rotationChannel.data[i4 + 3];
                f = f6;
                f2 = f7;
                f3 = f8;
            } else {
                f = 0.0f;
                f2 = 0.0f;
                f3 = 0.0f;
                f4 = 1.0f;
            }
            modelInstance.transform.set(((ModelInstanceControllerRenderData) d).positionChannel.data[i3], ((ModelInstanceControllerRenderData) d).positionChannel.data[i3 + 1], ((ModelInstanceControllerRenderData) d).positionChannel.data[i3 + 2], f, f2, f3, f4, f5, f5, f5);
            if (this.hasColor) {
                int i5 = ((ModelInstanceControllerRenderData) this.renderData).colorChannel.strideSize * i2;
                ColorAttribute colorAttribute = (ColorAttribute) modelInstance.materials.get(0).get(ColorAttribute.Diffuse);
                BlendingAttribute blendingAttribute = (BlendingAttribute) modelInstance.materials.get(0).get(BlendingAttribute.Type);
                Color color = colorAttribute.color;
                D d2 = this.renderData;
                color.r = ((ModelInstanceControllerRenderData) d2).colorChannel.data[i5];
                color.g = ((ModelInstanceControllerRenderData) d2).colorChannel.data[i5 + 1];
                color.b = ((ModelInstanceControllerRenderData) d2).colorChannel.data[i5 + 2];
                if (blendingAttribute != null) {
                    blendingAttribute.opacity = ((ModelInstanceControllerRenderData) d2).colorChannel.data[i5 + 3];
                }
            }
            i2++;
            i3 += ((ModelInstanceControllerRenderData) this.renderData).positionChannel.strideSize;
        }
        super.update();
    }

    public ModelInstanceRenderer(ModelInstanceParticleBatch modelInstanceParticleBatch) {
        this();
        setBatch(modelInstanceParticleBatch);
    }
}
