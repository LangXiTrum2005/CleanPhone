package com.badlogic.gdx.graphics.g2d;

import com.badlogic.gdx.files.FileHandle;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.math.collision.BoundingBox;
import com.badlogic.gdx.utils.Array;
import com.badlogic.gdx.utils.Disposable;
import com.badlogic.gdx.utils.GdxRuntimeException;
import com.badlogic.gdx.utils.ObjectMap;
import com.badlogic.gdx.utils.StreamUtils;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3888ke0;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.DM;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Writer;

/* JADX INFO: loaded from: classes.dex */
public class ParticleEffect implements Disposable {
    private BoundingBox bounds;
    private final Array<ParticleEmitter> emitters;
    protected float motionScale;
    private boolean ownsTexture;
    protected float xSizeScale;
    protected float ySizeScale;

    public ParticleEffect() {
        this.xSizeScale = 1.0f;
        this.ySizeScale = 1.0f;
        this.motionScale = 1.0f;
        this.emitters = new Array<>(8);
    }

    public void allowCompletion() {
        int i = this.emitters.size;
        for (int i2 = 0; i2 < i; i2++) {
            this.emitters.get(i2).allowCompletion();
        }
    }

    @Override // com.badlogic.gdx.utils.Disposable
    public void dispose() {
        if (this.ownsTexture) {
            int i = this.emitters.size;
            for (int i2 = 0; i2 < i; i2++) {
                Array.ArrayIterator<Sprite> it = this.emitters.get(i2).getSprites().iterator();
                while (it.hasNext()) {
                    it.next().getTexture().dispose();
                }
            }
        }
    }

    public void draw(Batch batch) {
        int i = this.emitters.size;
        for (int i2 = 0; i2 < i; i2++) {
            this.emitters.get(i2).draw(batch);
        }
    }

    public ParticleEmitter findEmitter(String str) {
        int i = this.emitters.size;
        for (int i2 = 0; i2 < i; i2++) {
            ParticleEmitter particleEmitter = this.emitters.get(i2);
            if (particleEmitter.getName().equals(str)) {
                return particleEmitter;
            }
        }
        return null;
    }

    public void flipY() {
        int i = this.emitters.size;
        for (int i2 = 0; i2 < i; i2++) {
            this.emitters.get(i2).flipY();
        }
    }

    public BoundingBox getBoundingBox() {
        if (this.bounds == null) {
            this.bounds = new BoundingBox();
        }
        BoundingBox boundingBox = this.bounds;
        boundingBox.inf();
        Array.ArrayIterator<ParticleEmitter> it = this.emitters.iterator();
        while (it.hasNext()) {
            boundingBox.ext(it.next().getBoundingBox());
        }
        return boundingBox;
    }

    public Array<ParticleEmitter> getEmitters() {
        return this.emitters;
    }

    public boolean isComplete() {
        int i = this.emitters.size;
        for (int i2 = 0; i2 < i; i2++) {
            if (!this.emitters.get(i2).isComplete()) {
                return false;
            }
        }
        return true;
    }

    public void load(FileHandle fileHandle, FileHandle fileHandle2) throws Throwable {
        loadEmitters(fileHandle);
        loadEmitterImages(fileHandle2);
    }

    public void loadEmitterImages(TextureAtlas textureAtlas) {
        loadEmitterImages(textureAtlas, null);
    }

    public void loadEmitters(FileHandle fileHandle) throws Throwable {
        InputStream inputStream = fileHandle.read();
        this.emitters.clear();
        BufferedReader bufferedReader = null;
        try {
            try {
                BufferedReader bufferedReader2 = new BufferedReader(new InputStreamReader(inputStream), 512);
                do {
                    try {
                        this.emitters.add(newEmitter(bufferedReader2));
                    } catch (IOException e) {
                        e = e;
                        bufferedReader = bufferedReader2;
                        throw new GdxRuntimeException("Error loading effect: " + fileHandle, e);
                    } catch (Throwable th) {
                        th = th;
                        bufferedReader = bufferedReader2;
                        StreamUtils.closeQuietly(bufferedReader);
                        throw th;
                    }
                } while (bufferedReader2.readLine() != null);
                StreamUtils.closeQuietly(bufferedReader2);
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (IOException e2) {
            e = e2;
        }
    }

    public Texture loadTexture(FileHandle fileHandle) {
        return new Texture(fileHandle, false);
    }

    public ParticleEmitter newEmitter(BufferedReader bufferedReader) throws IOException {
        return new ParticleEmitter(bufferedReader);
    }

    public void preAllocateParticles() {
        Array.ArrayIterator<ParticleEmitter> it = this.emitters.iterator();
        while (it.hasNext()) {
            it.next().preAllocateParticles();
        }
    }

    public void reset() {
        reset(true, true);
    }

    public void save(Writer writer) throws IOException {
        int i = this.emitters.size;
        int i2 = 0;
        int i3 = 0;
        while (i2 < i) {
            ParticleEmitter particleEmitter = this.emitters.get(i2);
            int i4 = i3 + 1;
            if (i3 > 0) {
                writer.write("\n");
            }
            particleEmitter.save(writer);
            i2++;
            i3 = i4;
        }
    }

    public void scaleEffect(float f) {
        scaleEffect(f, f, f);
    }

    public void setDuration(int i) {
        int i2 = this.emitters.size;
        for (int i3 = 0; i3 < i2; i3++) {
            ParticleEmitter particleEmitter = this.emitters.get(i3);
            particleEmitter.setContinuous(false);
            particleEmitter.duration = i;
            particleEmitter.durationTimer = 0.0f;
        }
    }

    public void setEmittersCleanUpBlendFunction(boolean z) {
        int i = this.emitters.size;
        for (int i2 = 0; i2 < i; i2++) {
            this.emitters.get(i2).setCleansUpBlendFunction(z);
        }
    }

    public void setFlip(boolean z, boolean z2) {
        int i = this.emitters.size;
        for (int i2 = 0; i2 < i; i2++) {
            this.emitters.get(i2).setFlip(z, z2);
        }
    }

    public void setPosition(float f, float f2) {
        int i = this.emitters.size;
        for (int i2 = 0; i2 < i; i2++) {
            this.emitters.get(i2).setPosition(f, f2);
        }
    }

    public void start() {
        int i = this.emitters.size;
        for (int i2 = 0; i2 < i; i2++) {
            this.emitters.get(i2).start();
        }
    }

    public void update(float f) {
        int i = this.emitters.size;
        for (int i2 = 0; i2 < i; i2++) {
            this.emitters.get(i2).update(f);
        }
    }

    public void loadEmitterImages(TextureAtlas textureAtlas, String str) {
        int i = this.emitters.size;
        for (int i2 = 0; i2 < i; i2++) {
            ParticleEmitter particleEmitter = this.emitters.get(i2);
            if (particleEmitter.getImagePaths().size != 0) {
                Array<Sprite> array = new Array<>();
                Array.ArrayIterator<String> it = particleEmitter.getImagePaths().iterator();
                while (it.hasNext()) {
                    String name = new File(it.next().replace('\\', '/')).getName();
                    int iLastIndexOf = name.lastIndexOf(46);
                    if (iLastIndexOf != -1) {
                        name = name.substring(0, iLastIndexOf);
                    }
                    if (str != null) {
                        name = DM.h(str, name);
                    }
                    Sprite spriteCreateSprite = textureAtlas.createSprite(name);
                    if (spriteCreateSprite == null) {
                        throw new IllegalArgumentException(AbstractC3888ke0.i("Atlas is missing region: ", name));
                    }
                    array.add(spriteCreateSprite);
                }
                particleEmitter.setSprites(array);
            }
        }
    }

    public ParticleEmitter newEmitter(ParticleEmitter particleEmitter) {
        return new ParticleEmitter(particleEmitter);
    }

    public void reset(boolean z) {
        reset(z, true);
    }

    public void scaleEffect(float f, float f2) {
        scaleEffect(f, f, f2);
    }

    public void draw(Batch batch, float f) {
        int i = this.emitters.size;
        for (int i2 = 0; i2 < i; i2++) {
            this.emitters.get(i2).draw(batch, f);
        }
    }

    public void load(FileHandle fileHandle, TextureAtlas textureAtlas) throws Throwable {
        load(fileHandle, textureAtlas, null);
    }

    public void reset(boolean z, boolean z2) {
        int i = this.emitters.size;
        for (int i2 = 0; i2 < i; i2++) {
            this.emitters.get(i2).reset(z2);
        }
        if (z) {
            float f = this.xSizeScale;
            if (f == 1.0f && this.ySizeScale == 1.0f && this.motionScale == 1.0f) {
                return;
            }
            scaleEffect(1.0f / f, 1.0f / this.ySizeScale, 1.0f / this.motionScale);
            this.motionScale = 1.0f;
            this.ySizeScale = 1.0f;
            this.xSizeScale = 1.0f;
        }
    }

    public void scaleEffect(float f, float f2, float f3) {
        this.xSizeScale *= f;
        this.ySizeScale *= f2;
        this.motionScale *= f3;
        Array.ArrayIterator<ParticleEmitter> it = this.emitters.iterator();
        while (it.hasNext()) {
            ParticleEmitter next = it.next();
            next.scaleSize(f, f2);
            next.scaleMotion(f3);
        }
    }

    public void load(FileHandle fileHandle, TextureAtlas textureAtlas, String str) throws Throwable {
        loadEmitters(fileHandle);
        loadEmitterImages(textureAtlas, str);
    }

    public ParticleEffect(ParticleEffect particleEffect) {
        this.xSizeScale = 1.0f;
        this.ySizeScale = 1.0f;
        this.motionScale = 1.0f;
        this.emitters = new Array<>(true, particleEffect.emitters.size);
        int i = particleEffect.emitters.size;
        for (int i2 = 0; i2 < i; i2++) {
            this.emitters.add(newEmitter(particleEffect.emitters.get(i2)));
        }
    }

    public void loadEmitterImages(FileHandle fileHandle) {
        this.ownsTexture = true;
        ObjectMap objectMap = new ObjectMap(this.emitters.size);
        int i = this.emitters.size;
        for (int i2 = 0; i2 < i; i2++) {
            ParticleEmitter particleEmitter = this.emitters.get(i2);
            if (particleEmitter.getImagePaths().size != 0) {
                Array<Sprite> array = new Array<>();
                Array.ArrayIterator<String> it = particleEmitter.getImagePaths().iterator();
                while (it.hasNext()) {
                    String name = new File(it.next().replace('\\', '/')).getName();
                    Sprite sprite = (Sprite) objectMap.get(name);
                    if (sprite == null) {
                        sprite = new Sprite(loadTexture(fileHandle.child(name)));
                        objectMap.put(name, sprite);
                    }
                    array.add(sprite);
                }
                particleEmitter.setSprites(array);
            }
        }
    }
}
