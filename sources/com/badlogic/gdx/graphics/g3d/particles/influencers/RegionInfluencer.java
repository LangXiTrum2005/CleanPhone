package com.badlogic.gdx.graphics.g3d.particles.influencers;

import com.badlogic.gdx.assets.AssetManager;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.TextureAtlas;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.graphics.g3d.particles.ParallelArray;
import com.badlogic.gdx.graphics.g3d.particles.ParticleChannels;
import com.badlogic.gdx.graphics.g3d.particles.ResourceData;
import com.badlogic.gdx.utils.Array;
import com.badlogic.gdx.utils.Json;
import com.badlogic.gdx.utils.JsonValue;

/* JADX INFO: loaded from: classes.dex */
public abstract class RegionInfluencer extends Influencer {
    private static final String ASSET_DATA = "atlasAssetData";
    public String atlasName;
    ParallelArray.FloatChannel regionChannel;
    public Array<AspectTextureRegion> regions;

    public static class Animated extends RegionInfluencer {
        ParallelArray.FloatChannel lifeChannel;

        public Animated() {
        }

        @Override // com.badlogic.gdx.graphics.g3d.particles.influencers.RegionInfluencer, com.badlogic.gdx.graphics.g3d.particles.ParticleControllerComponent
        public void allocateChannels() {
            super.allocateChannels();
            this.lifeChannel = (ParallelArray.FloatChannel) this.controller.particles.addChannel(ParticleChannels.Life);
        }

        @Override // com.badlogic.gdx.graphics.g3d.particles.ParticleControllerComponent
        public void update() {
            int i = this.controller.particles.size * this.regionChannel.strideSize;
            int i2 = 0;
            int i3 = 2;
            while (i2 < i) {
                Array<AspectTextureRegion> array = this.regions;
                AspectTextureRegion aspectTextureRegion = array.get((int) (this.lifeChannel.data[i3] * (array.size - 1)));
                ParallelArray.FloatChannel floatChannel = this.regionChannel;
                float[] fArr = floatChannel.data;
                fArr[i2] = aspectTextureRegion.u;
                fArr[i2 + 1] = aspectTextureRegion.v;
                fArr[i2 + 2] = aspectTextureRegion.u2;
                fArr[i2 + 3] = aspectTextureRegion.v2;
                fArr[i2 + 4] = 0.5f;
                fArr[i2 + 5] = aspectTextureRegion.halfInvAspectRatio;
                i2 += floatChannel.strideSize;
                i3 += this.lifeChannel.strideSize;
            }
        }

        public Animated(Animated animated) {
            super(animated);
        }

        @Override // com.badlogic.gdx.graphics.g3d.particles.ParticleControllerComponent
        public Animated copy() {
            return new Animated(this);
        }

        public Animated(TextureRegion textureRegion) {
            super(textureRegion);
        }

        public Animated(Texture texture) {
            super(texture);
        }
    }

    public static class AspectTextureRegion {
        public float halfInvAspectRatio;
        public String imageName;
        public float u;
        public float u2;
        public float v;
        public float v2;

        public AspectTextureRegion() {
        }

        public void set(TextureRegion textureRegion) {
            this.u = textureRegion.getU();
            this.v = textureRegion.getV();
            this.u2 = textureRegion.getU2();
            this.v2 = textureRegion.getV2();
            this.halfInvAspectRatio = (textureRegion.getRegionHeight() / textureRegion.getRegionWidth()) * 0.5f;
            if (textureRegion instanceof TextureAtlas.AtlasRegion) {
                this.imageName = ((TextureAtlas.AtlasRegion) textureRegion).name;
            }
        }

        public void updateUV(TextureAtlas textureAtlas) {
            String str = this.imageName;
            if (str == null) {
                return;
            }
            TextureAtlas.AtlasRegion atlasRegionFindRegion = textureAtlas.findRegion(str);
            this.u = atlasRegionFindRegion.getU();
            this.v = atlasRegionFindRegion.getV();
            this.u2 = atlasRegionFindRegion.getU2();
            this.v2 = atlasRegionFindRegion.getV2();
            this.halfInvAspectRatio = (atlasRegionFindRegion.getRegionHeight() / atlasRegionFindRegion.getRegionWidth()) * 0.5f;
        }

        public AspectTextureRegion(AspectTextureRegion aspectTextureRegion) {
            set(aspectTextureRegion);
        }

        public AspectTextureRegion(TextureRegion textureRegion) {
            set(textureRegion);
        }

        public void set(AspectTextureRegion aspectTextureRegion) {
            this.u = aspectTextureRegion.u;
            this.v = aspectTextureRegion.v;
            this.u2 = aspectTextureRegion.u2;
            this.v2 = aspectTextureRegion.v2;
            this.halfInvAspectRatio = aspectTextureRegion.halfInvAspectRatio;
            this.imageName = aspectTextureRegion.imageName;
        }
    }

    public static class Random extends RegionInfluencer {
        public Random() {
        }

        @Override // com.badlogic.gdx.graphics.g3d.particles.ParticleControllerComponent
        public void activateParticles(int i, int i2) {
            int i3 = this.regionChannel.strideSize;
            int i4 = i * i3;
            int i5 = (i2 * i3) + i4;
            while (i4 < i5) {
                AspectTextureRegion aspectTextureRegionRandom = this.regions.random();
                ParallelArray.FloatChannel floatChannel = this.regionChannel;
                float[] fArr = floatChannel.data;
                fArr[i4] = aspectTextureRegionRandom.u;
                fArr[i4 + 1] = aspectTextureRegionRandom.v;
                fArr[i4 + 2] = aspectTextureRegionRandom.u2;
                fArr[i4 + 3] = aspectTextureRegionRandom.v2;
                fArr[i4 + 4] = 0.5f;
                fArr[i4 + 5] = aspectTextureRegionRandom.halfInvAspectRatio;
                i4 += floatChannel.strideSize;
            }
        }

        public Random(Random random) {
            super(random);
        }

        @Override // com.badlogic.gdx.graphics.g3d.particles.ParticleControllerComponent
        public Random copy() {
            return new Random(this);
        }

        public Random(TextureRegion textureRegion) {
            super(textureRegion);
        }

        public Random(Texture texture) {
            super(texture);
        }
    }

    public static class Single extends RegionInfluencer {
        public Single() {
        }

        @Override // com.badlogic.gdx.graphics.g3d.particles.ParticleControllerComponent
        public void init() {
            int i = 0;
            AspectTextureRegion aspectTextureRegion = this.regions.items[0];
            int i2 = this.controller.emitter.maxParticleCount * this.regionChannel.strideSize;
            while (i < i2) {
                ParallelArray.FloatChannel floatChannel = this.regionChannel;
                float[] fArr = floatChannel.data;
                fArr[i] = aspectTextureRegion.u;
                fArr[i + 1] = aspectTextureRegion.v;
                fArr[i + 2] = aspectTextureRegion.u2;
                fArr[i + 3] = aspectTextureRegion.v2;
                fArr[i + 4] = 0.5f;
                fArr[i + 5] = aspectTextureRegion.halfInvAspectRatio;
                i += floatChannel.strideSize;
            }
        }

        public Single(Single single) {
            super(single);
        }

        @Override // com.badlogic.gdx.graphics.g3d.particles.ParticleControllerComponent
        public Single copy() {
            return new Single(this);
        }

        public Single(TextureRegion textureRegion) {
            super(textureRegion);
        }

        public Single(Texture texture) {
            super(texture);
        }
    }

    public RegionInfluencer(int i) {
        this.regions = new Array<>(false, i, AspectTextureRegion.class);
    }

    public void add(TextureRegion... textureRegionArr) {
        this.regions.ensureCapacity(textureRegionArr.length);
        for (TextureRegion textureRegion : textureRegionArr) {
            this.regions.add(new AspectTextureRegion(textureRegion));
        }
    }

    @Override // com.badlogic.gdx.graphics.g3d.particles.ParticleControllerComponent
    public void allocateChannels() {
        this.regionChannel = (ParallelArray.FloatChannel) this.controller.particles.addChannel(ParticleChannels.TextureRegion);
    }

    public void clear() {
        this.atlasName = null;
        this.regions.clear();
    }

    @Override // com.badlogic.gdx.graphics.g3d.particles.ParticleControllerComponent, com.badlogic.gdx.graphics.g3d.particles.ResourceData.Configurable
    public void load(AssetManager assetManager, ResourceData resourceData) {
        super.load(assetManager, resourceData);
        ResourceData.SaveData saveData = resourceData.getSaveData(ASSET_DATA);
        if (saveData == null) {
            return;
        }
        TextureAtlas textureAtlas = (TextureAtlas) assetManager.get(saveData.loadAsset());
        Array.ArrayIterator<AspectTextureRegion> it = this.regions.iterator();
        while (it.hasNext()) {
            it.next().updateUV(textureAtlas);
        }
    }

    @Override // com.badlogic.gdx.graphics.g3d.particles.ParticleControllerComponent, com.badlogic.gdx.utils.Json.Serializable
    public void read(Json json, JsonValue jsonValue) {
        this.regions.clear();
        this.regions.addAll((Array<? extends AspectTextureRegion>) json.readValue("regions", Array.class, AspectTextureRegion.class, jsonValue));
    }

    @Override // com.badlogic.gdx.graphics.g3d.particles.ParticleControllerComponent, com.badlogic.gdx.graphics.g3d.particles.ResourceData.Configurable
    public void save(AssetManager assetManager, ResourceData resourceData) {
        super.save(assetManager, resourceData);
        if (this.atlasName != null) {
            ResourceData.SaveData saveData = resourceData.getSaveData(ASSET_DATA);
            if (saveData == null) {
                saveData = resourceData.createSaveData(ASSET_DATA);
            }
            saveData.saveAsset(this.atlasName, TextureAtlas.class);
        }
    }

    public void setAtlasName(String str) {
        this.atlasName = str;
    }

    @Override // com.badlogic.gdx.graphics.g3d.particles.ParticleControllerComponent, com.badlogic.gdx.utils.Json.Serializable
    public void write(Json json) {
        json.writeValue("regions", this.regions, Array.class, AspectTextureRegion.class);
    }

    public RegionInfluencer() {
        this(1);
        AspectTextureRegion aspectTextureRegion = new AspectTextureRegion();
        aspectTextureRegion.v = 0.0f;
        aspectTextureRegion.u = 0.0f;
        aspectTextureRegion.v2 = 1.0f;
        aspectTextureRegion.u2 = 1.0f;
        aspectTextureRegion.halfInvAspectRatio = 0.5f;
        this.regions.add(aspectTextureRegion);
    }

    public RegionInfluencer(TextureRegion... textureRegionArr) {
        setAtlasName(null);
        this.regions = new Array<>(false, textureRegionArr.length, AspectTextureRegion.class);
        add(textureRegionArr);
    }

    public RegionInfluencer(Texture texture) {
        this(new TextureRegion(texture));
    }

    public RegionInfluencer(RegionInfluencer regionInfluencer) {
        this(regionInfluencer.regions.size);
        this.regions.ensureCapacity(regionInfluencer.regions.size);
        int i = 0;
        while (true) {
            Array<AspectTextureRegion> array = regionInfluencer.regions;
            if (i >= array.size) {
                return;
            }
            this.regions.add(new AspectTextureRegion(array.get(i)));
            i++;
        }
    }
}
