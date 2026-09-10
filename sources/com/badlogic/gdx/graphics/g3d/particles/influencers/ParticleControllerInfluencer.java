package com.badlogic.gdx.graphics.g3d.particles.influencers;

import com.badlogic.gdx.assets.AssetDescriptor;
import com.badlogic.gdx.assets.AssetManager;
import com.badlogic.gdx.graphics.g3d.particles.ParallelArray;
import com.badlogic.gdx.graphics.g3d.particles.ParticleChannels;
import com.badlogic.gdx.graphics.g3d.particles.ParticleController;
import com.badlogic.gdx.graphics.g3d.particles.ParticleEffect;
import com.badlogic.gdx.graphics.g3d.particles.ResourceData;
import com.badlogic.gdx.utils.Array;
import com.badlogic.gdx.utils.IntArray;
import com.badlogic.gdx.utils.Pool;

/* JADX INFO: loaded from: classes.dex */
public abstract class ParticleControllerInfluencer extends Influencer {
    ParallelArray.ObjectChannel<ParticleController> particleControllerChannel;
    public Array<ParticleController> templates;

    public static class Random extends ParticleControllerInfluencer {
        ParticleControllerPool pool;

        public class ParticleControllerPool extends Pool<ParticleController> {
            public ParticleControllerPool() {
            }

            @Override // com.badlogic.gdx.utils.Pool
            public void clear() {
                int free = Random.this.pool.getFree();
                for (int i = 0; i < free; i++) {
                    Random.this.pool.obtain().dispose();
                }
                super.clear();
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.badlogic.gdx.utils.Pool
            public ParticleController newObject() {
                ParticleController particleControllerCopy = Random.this.templates.random().copy();
                particleControllerCopy.init();
                return particleControllerCopy;
            }
        }

        public Random() {
            this.pool = new ParticleControllerPool();
        }

        @Override // com.badlogic.gdx.graphics.g3d.particles.ParticleControllerComponent
        public void activateParticles(int i, int i2) {
            int i3 = i2 + i;
            while (i < i3) {
                ParticleController particleControllerObtain = this.pool.obtain();
                particleControllerObtain.start();
                this.particleControllerChannel.data[i] = particleControllerObtain;
                i++;
            }
        }

        @Override // com.badlogic.gdx.graphics.g3d.particles.influencers.ParticleControllerInfluencer, com.badlogic.gdx.graphics.g3d.particles.ParticleControllerComponent, com.badlogic.gdx.utils.Disposable
        public void dispose() {
            this.pool.clear();
            super.dispose();
        }

        @Override // com.badlogic.gdx.graphics.g3d.particles.ParticleControllerComponent
        public void init() {
            this.pool.clear();
            for (int i = 0; i < this.controller.emitter.maxParticleCount; i++) {
                ParticleControllerPool particleControllerPool = this.pool;
                particleControllerPool.free(particleControllerPool.newObject());
            }
        }

        @Override // com.badlogic.gdx.graphics.g3d.particles.ParticleControllerComponent
        public void killParticles(int i, int i2) {
            int i3 = i2 + i;
            while (i < i3) {
                ParticleController particleController = this.particleControllerChannel.data[i];
                particleController.end();
                this.pool.free(particleController);
                this.particleControllerChannel.data[i] = null;
                i++;
            }
        }

        @Override // com.badlogic.gdx.graphics.g3d.particles.ParticleControllerComponent
        public Random copy() {
            return new Random(this);
        }

        public Random(ParticleController... particleControllerArr) {
            super(particleControllerArr);
            this.pool = new ParticleControllerPool();
        }

        public Random(Random random) {
            super(random);
            this.pool = new ParticleControllerPool();
        }
    }

    public static class Single extends ParticleControllerInfluencer {
        public Single(ParticleController... particleControllerArr) {
            super(particleControllerArr);
        }

        @Override // com.badlogic.gdx.graphics.g3d.particles.ParticleControllerComponent
        public void activateParticles(int i, int i2) {
            int i3 = i2 + i;
            while (i < i3) {
                this.particleControllerChannel.data[i].start();
                i++;
            }
        }

        @Override // com.badlogic.gdx.graphics.g3d.particles.ParticleControllerComponent
        public void init() {
            ParticleController particleControllerFirst = this.templates.first();
            int i = this.controller.particles.capacity;
            for (int i2 = 0; i2 < i; i2++) {
                ParticleController particleControllerCopy = particleControllerFirst.copy();
                particleControllerCopy.init();
                this.particleControllerChannel.data[i2] = particleControllerCopy;
            }
        }

        @Override // com.badlogic.gdx.graphics.g3d.particles.ParticleControllerComponent
        public void killParticles(int i, int i2) {
            int i3 = i2 + i;
            while (i < i3) {
                this.particleControllerChannel.data[i].end();
                i++;
            }
        }

        public Single() {
        }

        @Override // com.badlogic.gdx.graphics.g3d.particles.ParticleControllerComponent
        public Single copy() {
            return new Single(this);
        }

        public Single(Single single) {
            super(single);
        }
    }

    public ParticleControllerInfluencer() {
        this.templates = new Array<>(true, 1, ParticleController.class);
    }

    @Override // com.badlogic.gdx.graphics.g3d.particles.ParticleControllerComponent
    public void allocateChannels() {
        this.particleControllerChannel = (ParallelArray.ObjectChannel) this.controller.particles.addChannel(ParticleChannels.ParticleController);
    }

    @Override // com.badlogic.gdx.graphics.g3d.particles.ParticleControllerComponent, com.badlogic.gdx.utils.Disposable
    public void dispose() {
        if (this.controller != null) {
            for (int i = 0; i < this.controller.particles.size; i++) {
                ParticleController particleController = this.particleControllerChannel.data[i];
                if (particleController != null) {
                    particleController.dispose();
                    this.particleControllerChannel.data[i] = null;
                }
            }
        }
    }

    @Override // com.badlogic.gdx.graphics.g3d.particles.ParticleControllerComponent
    public void end() {
        for (int i = 0; i < this.controller.particles.size; i++) {
            this.particleControllerChannel.data[i].end();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.badlogic.gdx.graphics.g3d.particles.ParticleControllerComponent, com.badlogic.gdx.graphics.g3d.particles.ResourceData.Configurable
    public void load(AssetManager assetManager, ResourceData resourceData) {
        ResourceData.SaveData saveData = resourceData.getSaveData();
        Array.ArrayIterator it = ((Array) saveData.load("indices")).iterator();
        while (true) {
            AssetDescriptor assetDescriptorLoadAsset = saveData.loadAsset();
            if (assetDescriptorLoadAsset == null) {
                return;
            }
            ParticleEffect particleEffect = (ParticleEffect) assetManager.get(assetDescriptorLoadAsset);
            if (particleEffect == null) {
                throw new RuntimeException("Template is null");
            }
            Array<ParticleController> controllers = particleEffect.getControllers();
            IntArray intArray = (IntArray) it.next();
            int i = intArray.size;
            for (int i2 = 0; i2 < i; i2++) {
                this.templates.add(controllers.get(intArray.get(i2)));
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.badlogic.gdx.graphics.g3d.particles.ParticleControllerComponent, com.badlogic.gdx.graphics.g3d.particles.ResourceData.Configurable
    public void save(AssetManager assetManager, ResourceData resourceData) {
        ResourceData.SaveData saveDataCreateSaveData = resourceData.createSaveData();
        Array all = assetManager.getAll(ParticleEffect.class, new Array());
        Array array = new Array(this.templates);
        Array array2 = new Array();
        for (int i = 0; i < all.size && array.size > 0; i++) {
            ParticleEffect particleEffect = (ParticleEffect) all.get(i);
            Array<ParticleController> controllers = particleEffect.getControllers();
            Array.ArrayIterator it = array.iterator();
            IntArray intArray = null;
            while (it.hasNext()) {
                int iIndexOf = controllers.indexOf((ParticleController) it.next(), true);
                if (iIndexOf > -1) {
                    if (intArray == null) {
                        intArray = new IntArray();
                    }
                    it.remove();
                    intArray.add(iIndexOf);
                }
            }
            if (intArray != null) {
                saveDataCreateSaveData.saveAsset(assetManager.getAssetFileName(particleEffect), ParticleEffect.class);
                array2.add(intArray);
            }
        }
        saveDataCreateSaveData.save("indices", array2);
    }

    public ParticleControllerInfluencer(ParticleController... particleControllerArr) {
        this.templates = new Array<>(particleControllerArr);
    }

    public ParticleControllerInfluencer(ParticleControllerInfluencer particleControllerInfluencer) {
        this(particleControllerInfluencer.templates.items);
    }
}
