package com.badlogic.gdx.graphics.g2d;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.math.MathUtils;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.math.collision.BoundingBox;
import com.badlogic.gdx.utils.Array;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3888ke0;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC5044xl;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.Writer;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public class ParticleEmitter {
    private static final int UPDATE_ANGLE = 2;
    private static final int UPDATE_GRAVITY = 32;
    private static final int UPDATE_ROTATION = 4;
    private static final int UPDATE_SCALE = 1;
    private static final int UPDATE_SPRITE = 128;
    private static final int UPDATE_TINT = 64;
    private static final int UPDATE_VELOCITY = 8;
    private static final int UPDATE_WIND = 16;
    private float accumulator;
    private boolean[] active;
    private int activeCount;
    private boolean additive;
    private boolean aligned;
    private boolean allowCompletion;
    private ScaledNumericValue angleValue;
    private boolean attached;
    private boolean behind;
    private BoundingBox bounds;
    boolean cleansUpBlendFunction;
    private boolean continuous;
    private float delay;
    private float delayTimer;
    private RangedNumericValue delayValue;
    public float duration;
    public float durationTimer;
    private RangedNumericValue durationValue;
    private int emission;
    private int emissionDelta;
    private int emissionDiff;
    private ScaledNumericValue emissionValue;
    private boolean firstUpdate;
    private boolean flipX;
    private boolean flipY;
    private ScaledNumericValue gravityValue;
    private Array<String> imagePaths;
    private int life;
    private int lifeDiff;
    private int lifeOffset;
    private int lifeOffsetDiff;
    private IndependentScaledNumericValue lifeOffsetValue;
    private IndependentScaledNumericValue lifeValue;
    private int maxParticleCount;
    private int minParticleCount;
    private RangedNumericValue[] motionValues;
    private String name;
    private Particle[] particles;
    private boolean premultipliedAlpha;
    private ScaledNumericValue rotationValue;
    private float spawnHeight;
    private float spawnHeightDiff;
    private ScaledNumericValue spawnHeightValue;
    private SpawnShapeValue spawnShapeValue;
    private float spawnWidth;
    private float spawnWidthDiff;
    private ScaledNumericValue spawnWidthValue;
    private SpriteMode spriteMode;
    private Array<Sprite> sprites;
    private GradientColorValue tintValue;
    private ScaledNumericValue transparencyValue;
    private int updateFlags;
    private ScaledNumericValue velocityValue;
    private ScaledNumericValue windValue;
    private float x;
    private RangedNumericValue xOffsetValue;
    private ScaledNumericValue xScaleValue;
    private RangedNumericValue[] xSizeValues;
    private float y;
    private RangedNumericValue yOffsetValue;
    private ScaledNumericValue yScaleValue;
    private RangedNumericValue[] ySizeValues;

    /* JADX INFO: renamed from: com.badlogic.gdx.graphics.g2d.ParticleEmitter$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$badlogic$gdx$graphics$g2d$ParticleEmitter$SpawnEllipseSide;
        static final /* synthetic */ int[] $SwitchMap$com$badlogic$gdx$graphics$g2d$ParticleEmitter$SpawnShape;
        static final /* synthetic */ int[] $SwitchMap$com$badlogic$gdx$graphics$g2d$ParticleEmitter$SpriteMode;

        static {
            int[] iArr = new int[SpawnShape.values().length];
            $SwitchMap$com$badlogic$gdx$graphics$g2d$ParticleEmitter$SpawnShape = iArr;
            try {
                iArr[SpawnShape.square.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$badlogic$gdx$graphics$g2d$ParticleEmitter$SpawnShape[SpawnShape.ellipse.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$badlogic$gdx$graphics$g2d$ParticleEmitter$SpawnShape[SpawnShape.line.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[SpawnEllipseSide.values().length];
            $SwitchMap$com$badlogic$gdx$graphics$g2d$ParticleEmitter$SpawnEllipseSide = iArr2;
            try {
                iArr2[SpawnEllipseSide.top.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$badlogic$gdx$graphics$g2d$ParticleEmitter$SpawnEllipseSide[SpawnEllipseSide.bottom.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            int[] iArr3 = new int[SpriteMode.values().length];
            $SwitchMap$com$badlogic$gdx$graphics$g2d$ParticleEmitter$SpriteMode = iArr3;
            try {
                iArr3[SpriteMode.single.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$badlogic$gdx$graphics$g2d$ParticleEmitter$SpriteMode[SpriteMode.animated.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$com$badlogic$gdx$graphics$g2d$ParticleEmitter$SpriteMode[SpriteMode.random.ordinal()] = 3;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    public static class Particle extends Sprite {
        protected float angle;
        protected float angleCos;
        protected float angleDiff;
        protected float angleSin;
        protected int currentLife;
        protected int frame;
        protected float gravity;
        protected float gravityDiff;
        protected int life;
        protected float rotation;
        protected float rotationDiff;
        protected float[] tint;
        protected float transparency;
        protected float transparencyDiff;
        protected float velocity;
        protected float velocityDiff;
        protected float wind;
        protected float windDiff;
        protected float xScale;
        protected float xScaleDiff;
        protected float yScale;
        protected float yScaleDiff;

        public Particle(Sprite sprite) {
            super(sprite);
        }
    }

    public enum SpawnEllipseSide {
        both,
        top,
        bottom
    }

    public enum SpawnShape {
        point,
        line,
        square,
        ellipse
    }

    public enum SpriteMode {
        single,
        random,
        animated
    }

    public ParticleEmitter() {
        this.delayValue = new RangedNumericValue();
        this.lifeOffsetValue = new IndependentScaledNumericValue();
        this.durationValue = new RangedNumericValue();
        this.lifeValue = new IndependentScaledNumericValue();
        this.emissionValue = new ScaledNumericValue();
        this.xScaleValue = new ScaledNumericValue();
        this.yScaleValue = new ScaledNumericValue();
        this.rotationValue = new ScaledNumericValue();
        this.velocityValue = new ScaledNumericValue();
        this.angleValue = new ScaledNumericValue();
        this.windValue = new ScaledNumericValue();
        this.gravityValue = new ScaledNumericValue();
        this.transparencyValue = new ScaledNumericValue();
        this.tintValue = new GradientColorValue();
        this.xOffsetValue = new ScaledNumericValue();
        this.yOffsetValue = new ScaledNumericValue();
        this.spawnWidthValue = new ScaledNumericValue();
        this.spawnHeightValue = new ScaledNumericValue();
        this.spawnShapeValue = new SpawnShapeValue();
        this.spriteMode = SpriteMode.single;
        this.maxParticleCount = 4;
        this.duration = 1.0f;
        this.additive = true;
        this.premultipliedAlpha = false;
        this.cleansUpBlendFunction = true;
        initialize();
    }

    /* JADX WARN: Code duplicated, block: B:103:0x0301  */
    /* JADX WARN: Code duplicated, block: B:105:0x0305  */
    /* JADX WARN: Code duplicated, block: B:110:? A[RETURN, SYNTHETIC] */
    private void activateParticle(int i) {
        Sprite spriteFirst;
        float scale;
        float fRandom;
        int scale2;
        int i2;
        float fRandom2;
        float fRandom3;
        float f;
        float fRandom4;
        int i3 = AnonymousClass1.$SwitchMap$com$badlogic$gdx$graphics$g2d$ParticleEmitter$SpriteMode[this.spriteMode.ordinal()];
        if (i3 == 1 || i3 == 2) {
            spriteFirst = this.sprites.first();
        } else {
            spriteFirst = i3 != 3 ? null : this.sprites.random();
        }
        Particle[] particleArr = this.particles;
        Particle particleNewParticle = particleArr[i];
        if (particleNewParticle == null) {
            particleNewParticle = newParticle(spriteFirst);
            particleArr[i] = particleNewParticle;
            particleNewParticle.flip(this.flipX, this.flipY);
        } else {
            particleNewParticle.set(spriteFirst);
        }
        float f2 = this.durationTimer / this.duration;
        int i4 = this.updateFlags;
        if (this.lifeValue.independent) {
            generateLifeValues();
        }
        if (this.lifeOffsetValue.independent) {
            generateLifeOffsetValues();
        }
        int scale3 = this.life + ((int) (this.lifeValue.getScale(f2) * this.lifeDiff));
        particleNewParticle.life = scale3;
        particleNewParticle.currentLife = scale3;
        ScaledNumericValue scaledNumericValue = this.velocityValue;
        if (scaledNumericValue.active) {
            particleNewParticle.velocity = scaledNumericValue.newLowValue();
            float fNewHighValue = this.velocityValue.newHighValue();
            particleNewParticle.velocityDiff = fNewHighValue;
            if (!this.velocityValue.relative) {
                particleNewParticle.velocityDiff = fNewHighValue - particleNewParticle.velocity;
            }
        }
        particleNewParticle.angle = this.angleValue.newLowValue();
        float fNewHighValue2 = this.angleValue.newHighValue();
        particleNewParticle.angleDiff = fNewHighValue2;
        ScaledNumericValue scaledNumericValue2 = this.angleValue;
        if (!scaledNumericValue2.relative) {
            particleNewParticle.angleDiff = fNewHighValue2 - particleNewParticle.angle;
        }
        int i5 = i4 & 2;
        if (i5 == 0) {
            scale = (scaledNumericValue2.getScale(0.0f) * particleNewParticle.angleDiff) + particleNewParticle.angle;
            particleNewParticle.angle = scale;
            particleNewParticle.angleCos = MathUtils.cosDeg(scale);
            particleNewParticle.angleSin = MathUtils.sinDeg(scale);
        } else {
            scale = 0.0f;
        }
        float width = spriteFirst.getWidth();
        float height = spriteFirst.getHeight();
        particleNewParticle.xScale = this.xScaleValue.newLowValue() / width;
        float fNewHighValue3 = this.xScaleValue.newHighValue() / width;
        particleNewParticle.xScaleDiff = fNewHighValue3;
        ScaledNumericValue scaledNumericValue3 = this.xScaleValue;
        if (!scaledNumericValue3.relative) {
            particleNewParticle.xScaleDiff = fNewHighValue3 - particleNewParticle.xScale;
        }
        ScaledNumericValue scaledNumericValue4 = this.yScaleValue;
        if (scaledNumericValue4.active) {
            particleNewParticle.yScale = scaledNumericValue4.newLowValue() / height;
            float fNewHighValue4 = this.yScaleValue.newHighValue() / height;
            particleNewParticle.yScaleDiff = fNewHighValue4;
            if (!this.yScaleValue.relative) {
                particleNewParticle.yScaleDiff = fNewHighValue4 - particleNewParticle.yScale;
            }
            particleNewParticle.setScale((this.xScaleValue.getScale(0.0f) * particleNewParticle.xScaleDiff) + particleNewParticle.xScale, (this.yScaleValue.getScale(0.0f) * particleNewParticle.yScaleDiff) + particleNewParticle.yScale);
        } else {
            particleNewParticle.setScale((scaledNumericValue3.getScale(0.0f) * particleNewParticle.xScaleDiff) + particleNewParticle.xScale);
        }
        ScaledNumericValue scaledNumericValue5 = this.rotationValue;
        if (scaledNumericValue5.active) {
            particleNewParticle.rotation = scaledNumericValue5.newLowValue();
            float fNewHighValue5 = this.rotationValue.newHighValue();
            particleNewParticle.rotationDiff = fNewHighValue5;
            ScaledNumericValue scaledNumericValue6 = this.rotationValue;
            if (!scaledNumericValue6.relative) {
                particleNewParticle.rotationDiff = fNewHighValue5 - particleNewParticle.rotation;
            }
            float scale4 = (scaledNumericValue6.getScale(0.0f) * particleNewParticle.rotationDiff) + particleNewParticle.rotation;
            if (this.aligned) {
                scale4 += scale;
            }
            particleNewParticle.setRotation(scale4);
        }
        ScaledNumericValue scaledNumericValue7 = this.windValue;
        if (scaledNumericValue7.active) {
            particleNewParticle.wind = scaledNumericValue7.newLowValue();
            float fNewHighValue6 = this.windValue.newHighValue();
            particleNewParticle.windDiff = fNewHighValue6;
            if (!this.windValue.relative) {
                particleNewParticle.windDiff = fNewHighValue6 - particleNewParticle.wind;
            }
        }
        ScaledNumericValue scaledNumericValue8 = this.gravityValue;
        if (scaledNumericValue8.active) {
            particleNewParticle.gravity = scaledNumericValue8.newLowValue();
            float fNewHighValue7 = this.gravityValue.newHighValue();
            particleNewParticle.gravityDiff = fNewHighValue7;
            if (!this.gravityValue.relative) {
                particleNewParticle.gravityDiff = fNewHighValue7 - particleNewParticle.gravity;
            }
        }
        float[] fArr = particleNewParticle.tint;
        if (fArr == null) {
            fArr = new float[3];
            particleNewParticle.tint = fArr;
        }
        float[] color = this.tintValue.getColor(0.0f);
        fArr[0] = color[0];
        fArr[1] = color[1];
        fArr[2] = color[2];
        particleNewParticle.transparency = this.transparencyValue.newLowValue();
        particleNewParticle.transparencyDiff = this.transparencyValue.newHighValue() - particleNewParticle.transparency;
        float fRandom5 = this.x;
        RangedNumericValue rangedNumericValue = this.xOffsetValue;
        if (rangedNumericValue.active) {
            fRandom5 += rangedNumericValue.newLowValue();
        }
        float fNewLowValue = this.y;
        RangedNumericValue rangedNumericValue2 = this.yOffsetValue;
        if (rangedNumericValue2.active) {
            fNewLowValue += rangedNumericValue2.newLowValue();
        }
        int i6 = AnonymousClass1.$SwitchMap$com$badlogic$gdx$graphics$g2d$ParticleEmitter$SpawnShape[this.spawnShapeValue.shape.ordinal()];
        if (i6 != 1) {
            if (i6 == 2) {
                float scale5 = (this.spawnWidthValue.getScale(f2) * this.spawnWidthDiff) + this.spawnWidth;
                float f3 = scale5 * 0.5f;
                float scale6 = ((this.spawnHeightValue.getScale(f2) * this.spawnHeightDiff) + this.spawnHeight) * 0.5f;
                if (f3 != 0.0f && scale6 != 0.0f) {
                    float f4 = f3 / scale6;
                    SpawnShapeValue spawnShapeValue = this.spawnShapeValue;
                    if (spawnShapeValue.edges) {
                        int i7 = AnonymousClass1.$SwitchMap$com$badlogic$gdx$graphics$g2d$ParticleEmitter$SpawnEllipseSide[spawnShapeValue.side.ordinal()];
                        if (i7 != 1) {
                            fRandom4 = i7 != 2 ? MathUtils.random(360.0f) : MathUtils.random(179.0f);
                        } else {
                            fRandom4 = -MathUtils.random(179.0f);
                        }
                        float fCosDeg = MathUtils.cosDeg(fRandom4);
                        float fSinDeg = MathUtils.sinDeg(fRandom4);
                        fRandom5 += fCosDeg * f3;
                        fNewLowValue += (f3 * fSinDeg) / f4;
                        if (i5 == 0) {
                            particleNewParticle.angle = fRandom4;
                            particleNewParticle.angleCos = fCosDeg;
                            particleNewParticle.angleSin = fSinDeg;
                        }
                    } else {
                        float f5 = f3 * f3;
                        do {
                            fRandom2 = MathUtils.random(scale5) - f3;
                            fRandom3 = MathUtils.random(scale5) - f3;
                        } while ((fRandom3 * fRandom3) + (fRandom2 * fRandom2) > f5);
                        fRandom5 += fRandom2;
                        f = fRandom3 / f4;
                        fNewLowValue += f;
                    }
                }
            } else if (i6 == 3) {
                float scale7 = (this.spawnWidthValue.getScale(f2) * this.spawnWidthDiff) + this.spawnWidth;
                float scale8 = (this.spawnHeightValue.getScale(f2) * this.spawnHeightDiff) + this.spawnHeight;
                if (scale7 != 0.0f) {
                    float fRandom6 = MathUtils.random() * scale7;
                    fRandom5 += fRandom6;
                    f = (scale8 / scale7) * fRandom6;
                    fNewLowValue += f;
                } else {
                    fRandom = MathUtils.random() * scale8;
                }
            }
            particleNewParticle.setBounds(fRandom5 - (width * 0.5f), fNewLowValue - (0.5f * height), width, height);
            scale2 = (int) ((this.lifeOffsetValue.getScale(f2) * this.lifeOffsetDiff) + this.lifeOffset);
            if (scale2 > 0) {
                i2 = particleNewParticle.currentLife;
                if (scale2 >= i2) {
                    scale2 = i2 - 1;
                }
                updateParticle(particleNewParticle, scale2 / 1000.0f, scale2);
            }
        }
        float scale9 = (this.spawnWidthValue.getScale(f2) * this.spawnWidthDiff) + this.spawnWidth;
        float scale10 = (this.spawnHeightValue.getScale(f2) * this.spawnHeightDiff) + this.spawnHeight;
        fRandom5 += MathUtils.random(scale9) - (scale9 * 0.5f);
        fRandom = MathUtils.random(scale10) - (scale10 * 0.5f);
        fNewLowValue += fRandom;
        particleNewParticle.setBounds(fRandom5 - (width * 0.5f), fNewLowValue - (0.5f * height), width, height);
        scale2 = (int) ((this.lifeOffsetValue.getScale(f2) * this.lifeOffsetDiff) + this.lifeOffset);
        if (scale2 > 0) {
            i2 = particleNewParticle.currentLife;
            if (scale2 >= i2) {
                scale2 = i2 - 1;
            }
            updateParticle(particleNewParticle, scale2 / 1000.0f, scale2);
        }
    }

    private void generateLifeOffsetValues() {
        IndependentScaledNumericValue independentScaledNumericValue = this.lifeOffsetValue;
        this.lifeOffset = independentScaledNumericValue.active ? (int) independentScaledNumericValue.newLowValue() : 0;
        int iNewHighValue = (int) this.lifeOffsetValue.newHighValue();
        this.lifeOffsetDiff = iNewHighValue;
        if (this.lifeOffsetValue.relative) {
            return;
        }
        this.lifeOffsetDiff = iNewHighValue - this.lifeOffset;
    }

    private void generateLifeValues() {
        this.life = (int) this.lifeValue.newLowValue();
        int iNewHighValue = (int) this.lifeValue.newHighValue();
        this.lifeDiff = iNewHighValue;
        if (this.lifeValue.relative) {
            return;
        }
        this.lifeDiff = iNewHighValue - this.life;
    }

    private void initialize() {
        this.sprites = new Array<>();
        this.imagePaths = new Array<>();
        this.durationValue.setAlwaysActive(true);
        this.emissionValue.setAlwaysActive(true);
        this.lifeValue.setAlwaysActive(true);
        this.xScaleValue.setAlwaysActive(true);
        this.transparencyValue.setAlwaysActive(true);
        this.spawnShapeValue.setAlwaysActive(true);
        this.spawnWidthValue.setAlwaysActive(true);
        this.spawnHeightValue.setAlwaysActive(true);
    }

    public static boolean readBoolean(String str) throws IOException {
        return Boolean.parseBoolean(readString(str));
    }

    public static float readFloat(BufferedReader bufferedReader, String str) throws IOException {
        return Float.parseFloat(readString(bufferedReader, str));
    }

    public static int readInt(BufferedReader bufferedReader, String str) throws IOException {
        return Integer.parseInt(readString(bufferedReader, str));
    }

    public static String readString(String str) throws IOException {
        return str.substring(str.indexOf(":") + 1).trim();
    }

    private void restart() {
        RangedNumericValue rangedNumericValue = this.delayValue;
        this.delay = rangedNumericValue.active ? rangedNumericValue.newLowValue() : 0.0f;
        this.delayTimer = 0.0f;
        this.durationTimer -= this.duration;
        this.duration = this.durationValue.newLowValue();
        this.emission = (int) this.emissionValue.newLowValue();
        int iNewHighValue = (int) this.emissionValue.newHighValue();
        this.emissionDiff = iNewHighValue;
        if (!this.emissionValue.relative) {
            this.emissionDiff = iNewHighValue - this.emission;
        }
        if (!this.lifeValue.independent) {
            generateLifeValues();
        }
        if (!this.lifeOffsetValue.independent) {
            generateLifeOffsetValues();
        }
        this.spawnWidth = this.spawnWidthValue.newLowValue();
        float fNewHighValue = this.spawnWidthValue.newHighValue();
        this.spawnWidthDiff = fNewHighValue;
        if (!this.spawnWidthValue.relative) {
            this.spawnWidthDiff = fNewHighValue - this.spawnWidth;
        }
        this.spawnHeight = this.spawnHeightValue.newLowValue();
        float fNewHighValue2 = this.spawnHeightValue.newHighValue();
        this.spawnHeightDiff = fNewHighValue2;
        if (!this.spawnHeightValue.relative) {
            this.spawnHeightDiff = fNewHighValue2 - this.spawnHeight;
        }
        this.updateFlags = 0;
        ScaledNumericValue scaledNumericValue = this.angleValue;
        if (scaledNumericValue.active && scaledNumericValue.timeline.length > 1) {
            this.updateFlags = 2;
        }
        if (this.velocityValue.active) {
            this.updateFlags |= 8;
        }
        if (this.xScaleValue.timeline.length > 1) {
            this.updateFlags |= 1;
        }
        ScaledNumericValue scaledNumericValue2 = this.yScaleValue;
        if (scaledNumericValue2.active && scaledNumericValue2.timeline.length > 1) {
            this.updateFlags |= 1;
        }
        ScaledNumericValue scaledNumericValue3 = this.rotationValue;
        if (scaledNumericValue3.active && scaledNumericValue3.timeline.length > 1) {
            this.updateFlags |= 4;
        }
        if (this.windValue.active) {
            this.updateFlags |= 16;
        }
        if (this.gravityValue.active) {
            this.updateFlags |= 32;
        }
        if (this.tintValue.timeline.length > 1) {
            this.updateFlags |= 64;
        }
        if (this.spriteMode == SpriteMode.animated) {
            this.updateFlags |= 128;
        }
    }

    private boolean updateParticle(Particle particle, float f, int i) {
        float scale;
        float scale2;
        int i2 = particle.currentLife - i;
        if (i2 <= 0) {
            return false;
        }
        particle.currentLife = i2;
        float f2 = 1.0f - (i2 / particle.life);
        int i3 = this.updateFlags;
        if ((i3 & 1) != 0) {
            if (this.yScaleValue.active) {
                particle.setScale((this.xScaleValue.getScale(f2) * particle.xScaleDiff) + particle.xScale, (this.yScaleValue.getScale(f2) * particle.yScaleDiff) + particle.yScale);
            } else {
                particle.setScale((this.xScaleValue.getScale(f2) * particle.xScaleDiff) + particle.xScale);
            }
        }
        if ((i3 & 8) != 0) {
            float scale3 = ((this.velocityValue.getScale(f2) * particle.velocityDiff) + particle.velocity) * f;
            if ((i3 & 2) != 0) {
                float scale4 = (this.angleValue.getScale(f2) * particle.angleDiff) + particle.angle;
                scale = MathUtils.cosDeg(scale4) * scale3;
                scale2 = MathUtils.sinDeg(scale4) * scale3;
                if ((i3 & 4) != 0) {
                    float scale5 = (this.rotationValue.getScale(f2) * particle.rotationDiff) + particle.rotation;
                    if (this.aligned) {
                        scale5 += scale4;
                    }
                    particle.setRotation(scale5);
                }
            } else {
                scale = particle.angleCos * scale3;
                scale2 = particle.angleSin * scale3;
                if (this.aligned || (i3 & 4) != 0) {
                    float scale6 = (this.rotationValue.getScale(f2) * particle.rotationDiff) + particle.rotation;
                    if (this.aligned) {
                        scale6 += particle.angle;
                    }
                    particle.setRotation(scale6);
                }
            }
            if ((i3 & 16) != 0) {
                scale += ((this.windValue.getScale(f2) * particle.windDiff) + particle.wind) * f;
            }
            if ((i3 & 32) != 0) {
                scale2 += ((this.gravityValue.getScale(f2) * particle.gravityDiff) + particle.gravity) * f;
            }
            particle.translate(scale, scale2);
        } else if ((i3 & 4) != 0) {
            particle.setRotation((this.rotationValue.getScale(f2) * particle.rotationDiff) + particle.rotation);
        }
        float[] color = (i3 & 64) != 0 ? this.tintValue.getColor(f2) : particle.tint;
        if (this.premultipliedAlpha) {
            float f3 = this.additive ? 0.0f : 1.0f;
            float scale7 = (this.transparencyValue.getScale(f2) * particle.transparencyDiff) + particle.transparency;
            particle.setColor(color[0] * scale7, color[1] * scale7, color[2] * scale7, scale7 * f3);
        } else {
            particle.setColor(color[0], color[1], color[2], (this.transparencyValue.getScale(f2) * particle.transparencyDiff) + particle.transparency);
        }
        if ((i3 & 128) != 0) {
            int i4 = this.sprites.size;
            int iMin = Math.min((int) (f2 * i4), i4 - 1);
            if (particle.frame != iMin) {
                Sprite sprite = this.sprites.get(iMin);
                float width = particle.getWidth();
                float height = particle.getHeight();
                particle.setRegion(sprite);
                particle.setSize(sprite.getWidth(), sprite.getHeight());
                particle.setOrigin(sprite.getOriginX(), sprite.getOriginY());
                particle.translate((width - sprite.getWidth()) * 0.5f, (height - sprite.getHeight()) * 0.5f);
                particle.frame = iMin;
            }
        }
        return true;
    }

    public void addParticle() {
        int i = this.activeCount;
        if (i == this.maxParticleCount) {
            return;
        }
        boolean[] zArr = this.active;
        int length = zArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            if (!zArr[i2]) {
                activateParticle(i2);
                zArr[i2] = true;
                this.activeCount = i + 1;
                return;
            }
        }
    }

    public void addParticles(int i) {
        int iMin = Math.min(i, this.maxParticleCount - this.activeCount);
        if (iMin == 0) {
            return;
        }
        boolean[] zArr = this.active;
        int length = zArr.length;
        int i2 = 0;
        int i3 = 0;
        loop0: while (i2 < iMin) {
            while (true) {
                if (i3 >= length) {
                    break loop0;
                } else if (!zArr[i3]) {
                    break;
                } else {
                    i3++;
                }
            }
            activateParticle(i3);
            zArr[i3] = true;
            i2++;
            i3++;
        }
        this.activeCount += iMin;
    }

    public void allowCompletion() {
        this.allowCompletion = true;
        this.durationTimer = this.duration;
    }

    public boolean cleansUpBlendFunction() {
        return this.cleansUpBlendFunction;
    }

    public void draw(Batch batch) {
        if (this.premultipliedAlpha) {
            batch.setBlendFunction(1, GL20.GL_ONE_MINUS_SRC_ALPHA);
        } else if (this.additive) {
            batch.setBlendFunction(GL20.GL_SRC_ALPHA, 1);
        } else {
            batch.setBlendFunction(GL20.GL_SRC_ALPHA, GL20.GL_ONE_MINUS_SRC_ALPHA);
        }
        Particle[] particleArr = this.particles;
        boolean[] zArr = this.active;
        int length = zArr.length;
        for (int i = 0; i < length; i++) {
            if (zArr[i]) {
                particleArr[i].draw(batch);
            }
        }
        if (this.cleansUpBlendFunction) {
            if (this.additive || this.premultipliedAlpha) {
                batch.setBlendFunction(GL20.GL_SRC_ALPHA, GL20.GL_ONE_MINUS_SRC_ALPHA);
            }
        }
    }

    public void flipY() {
        ScaledNumericValue scaledNumericValue = this.angleValue;
        scaledNumericValue.setHigh(-scaledNumericValue.getHighMin(), -this.angleValue.getHighMax());
        ScaledNumericValue scaledNumericValue2 = this.angleValue;
        scaledNumericValue2.setLow(-scaledNumericValue2.getLowMin(), -this.angleValue.getLowMax());
        ScaledNumericValue scaledNumericValue3 = this.gravityValue;
        scaledNumericValue3.setHigh(-scaledNumericValue3.getHighMin(), -this.gravityValue.getHighMax());
        ScaledNumericValue scaledNumericValue4 = this.gravityValue;
        scaledNumericValue4.setLow(-scaledNumericValue4.getLowMin(), -this.gravityValue.getLowMax());
        ScaledNumericValue scaledNumericValue5 = this.windValue;
        scaledNumericValue5.setHigh(-scaledNumericValue5.getHighMin(), -this.windValue.getHighMax());
        ScaledNumericValue scaledNumericValue6 = this.windValue;
        scaledNumericValue6.setLow(-scaledNumericValue6.getLowMin(), -this.windValue.getLowMax());
        ScaledNumericValue scaledNumericValue7 = this.rotationValue;
        scaledNumericValue7.setHigh(-scaledNumericValue7.getHighMin(), -this.rotationValue.getHighMax());
        ScaledNumericValue scaledNumericValue8 = this.rotationValue;
        scaledNumericValue8.setLow(-scaledNumericValue8.getLowMin(), -this.rotationValue.getLowMax());
        RangedNumericValue rangedNumericValue = this.yOffsetValue;
        rangedNumericValue.setLow(-rangedNumericValue.getLowMin(), -this.yOffsetValue.getLowMax());
    }

    public int getActiveCount() {
        return this.activeCount;
    }

    public boolean getAllowCompletion() {
        return this.allowCompletion;
    }

    public ScaledNumericValue getAngle() {
        return this.angleValue;
    }

    public BoundingBox getBoundingBox() {
        if (this.bounds == null) {
            this.bounds = new BoundingBox();
        }
        Particle[] particleArr = this.particles;
        boolean[] zArr = this.active;
        BoundingBox boundingBox = this.bounds;
        boundingBox.inf();
        int length = zArr.length;
        for (int i = 0; i < length; i++) {
            if (zArr[i]) {
                Rectangle boundingRectangle = particleArr[i].getBoundingRectangle();
                boundingBox.ext(boundingRectangle.x, boundingRectangle.y, 0.0f);
                boundingBox.ext(boundingRectangle.x + boundingRectangle.width, boundingRectangle.y + boundingRectangle.height, 0.0f);
            }
        }
        return boundingBox;
    }

    public RangedNumericValue getDelay() {
        return this.delayValue;
    }

    public RangedNumericValue getDuration() {
        return this.durationValue;
    }

    public ScaledNumericValue getEmission() {
        return this.emissionValue;
    }

    public ScaledNumericValue getGravity() {
        return this.gravityValue;
    }

    public Array<String> getImagePaths() {
        return this.imagePaths;
    }

    public ScaledNumericValue getLife() {
        return this.lifeValue;
    }

    public ScaledNumericValue getLifeOffset() {
        return this.lifeOffsetValue;
    }

    public int getMaxParticleCount() {
        return this.maxParticleCount;
    }

    public int getMinParticleCount() {
        return this.minParticleCount;
    }

    public RangedNumericValue[] getMotionValues() {
        if (this.motionValues == null) {
            this.motionValues = new RangedNumericValue[]{this.velocityValue, this.windValue, this.gravityValue};
        }
        return this.motionValues;
    }

    public String getName() {
        return this.name;
    }

    public Particle[] getParticles() {
        return this.particles;
    }

    public float getPercentComplete() {
        if (this.delayTimer < this.delay) {
            return 0.0f;
        }
        return Math.min(1.0f, this.durationTimer / this.duration);
    }

    public ScaledNumericValue getRotation() {
        return this.rotationValue;
    }

    public ScaledNumericValue getSpawnHeight() {
        return this.spawnHeightValue;
    }

    public SpawnShapeValue getSpawnShape() {
        return this.spawnShapeValue;
    }

    public ScaledNumericValue getSpawnWidth() {
        return this.spawnWidthValue;
    }

    public SpriteMode getSpriteMode() {
        return this.spriteMode;
    }

    public Array<Sprite> getSprites() {
        return this.sprites;
    }

    public GradientColorValue getTint() {
        return this.tintValue;
    }

    public ScaledNumericValue getTransparency() {
        return this.transparencyValue;
    }

    public ScaledNumericValue getVelocity() {
        return this.velocityValue;
    }

    public ScaledNumericValue getWind() {
        return this.windValue;
    }

    public float getX() {
        return this.x;
    }

    public RangedNumericValue getXOffsetValue() {
        return this.xOffsetValue;
    }

    public ScaledNumericValue getXScale() {
        return this.xScaleValue;
    }

    public RangedNumericValue[] getXSizeValues() {
        if (this.xSizeValues == null) {
            this.xSizeValues = new RangedNumericValue[]{this.xScaleValue, this.spawnWidthValue, this.xOffsetValue};
        }
        return this.xSizeValues;
    }

    public float getY() {
        return this.y;
    }

    public RangedNumericValue getYOffsetValue() {
        return this.yOffsetValue;
    }

    public ScaledNumericValue getYScale() {
        return this.yScaleValue;
    }

    public RangedNumericValue[] getYSizeValues() {
        if (this.ySizeValues == null) {
            this.ySizeValues = new RangedNumericValue[]{this.yScaleValue, this.spawnHeightValue, this.yOffsetValue};
        }
        return this.ySizeValues;
    }

    public boolean isAdditive() {
        return this.additive;
    }

    public boolean isAligned() {
        return this.aligned;
    }

    public boolean isAttached() {
        return this.attached;
    }

    public boolean isBehind() {
        return this.behind;
    }

    public boolean isComplete() {
        return (!this.continuous || this.allowCompletion) && this.delayTimer >= this.delay && this.durationTimer >= this.duration && this.activeCount == 0;
    }

    public boolean isContinuous() {
        return this.continuous;
    }

    public boolean isPremultipliedAlpha() {
        return this.premultipliedAlpha;
    }

    public void load(BufferedReader bufferedReader) throws IOException {
        try {
            this.name = readString(bufferedReader, "name");
            bufferedReader.readLine();
            this.delayValue.load(bufferedReader);
            bufferedReader.readLine();
            this.durationValue.load(bufferedReader);
            bufferedReader.readLine();
            setMinParticleCount(readInt(bufferedReader, "minParticleCount"));
            setMaxParticleCount(readInt(bufferedReader, "maxParticleCount"));
            bufferedReader.readLine();
            this.emissionValue.load(bufferedReader);
            bufferedReader.readLine();
            this.lifeValue.load(bufferedReader);
            bufferedReader.readLine();
            this.lifeOffsetValue.load(bufferedReader);
            bufferedReader.readLine();
            this.xOffsetValue.load(bufferedReader);
            bufferedReader.readLine();
            this.yOffsetValue.load(bufferedReader);
            bufferedReader.readLine();
            this.spawnShapeValue.load(bufferedReader);
            bufferedReader.readLine();
            this.spawnWidthValue.load(bufferedReader);
            bufferedReader.readLine();
            this.spawnHeightValue.load(bufferedReader);
            if (bufferedReader.readLine().trim().equals("- Scale -")) {
                this.xScaleValue.load(bufferedReader);
                this.yScaleValue.setActive(false);
            } else {
                this.xScaleValue.load(bufferedReader);
                bufferedReader.readLine();
                this.yScaleValue.load(bufferedReader);
            }
            bufferedReader.readLine();
            this.velocityValue.load(bufferedReader);
            bufferedReader.readLine();
            this.angleValue.load(bufferedReader);
            bufferedReader.readLine();
            this.rotationValue.load(bufferedReader);
            bufferedReader.readLine();
            this.windValue.load(bufferedReader);
            bufferedReader.readLine();
            this.gravityValue.load(bufferedReader);
            bufferedReader.readLine();
            this.tintValue.load(bufferedReader);
            bufferedReader.readLine();
            this.transparencyValue.load(bufferedReader);
            bufferedReader.readLine();
            this.attached = readBoolean(bufferedReader, "attached");
            this.continuous = readBoolean(bufferedReader, "continuous");
            this.aligned = readBoolean(bufferedReader, "aligned");
            this.additive = readBoolean(bufferedReader, "additive");
            this.behind = readBoolean(bufferedReader, "behind");
            String line = bufferedReader.readLine();
            if (line.startsWith("premultipliedAlpha")) {
                this.premultipliedAlpha = readBoolean(line);
                line = bufferedReader.readLine();
            }
            if (line.startsWith("spriteMode")) {
                this.spriteMode = SpriteMode.valueOf(readString(line));
                bufferedReader.readLine();
            }
            Array<String> array = new Array<>();
            while (true) {
                String line2 = bufferedReader.readLine();
                if (line2 == null || line2.isEmpty()) {
                    break;
                } else {
                    array.add(line2);
                }
            }
            setImagePaths(array);
        } catch (RuntimeException e) {
            if (this.name == null) {
                throw e;
            }
            throw new RuntimeException("Error parsing emitter: " + this.name, e);
        }
    }

    public void matchMotion(ParticleEmitter particleEmitter) {
        RangedNumericValue[] motionValues = getMotionValues();
        RangedNumericValue[] motionValues2 = particleEmitter.getMotionValues();
        for (int i = 0; i < motionValues.length; i++) {
            motionValues[i].set(motionValues2[i]);
        }
    }

    public void matchSize(ParticleEmitter particleEmitter) {
        matchXSize(particleEmitter);
        matchYSize(particleEmitter);
    }

    public void matchXSize(ParticleEmitter particleEmitter) {
        RangedNumericValue[] xSizeValues = getXSizeValues();
        RangedNumericValue[] xSizeValues2 = particleEmitter.getXSizeValues();
        for (int i = 0; i < xSizeValues.length; i++) {
            xSizeValues[i].set(xSizeValues2[i]);
        }
    }

    public void matchYSize(ParticleEmitter particleEmitter) {
        RangedNumericValue[] ySizeValues = getYSizeValues();
        RangedNumericValue[] ySizeValues2 = particleEmitter.getYSizeValues();
        for (int i = 0; i < ySizeValues.length; i++) {
            ySizeValues[i].set(ySizeValues2[i]);
        }
    }

    public Particle newParticle(Sprite sprite) {
        return new Particle(sprite);
    }

    public void preAllocateParticles() {
        if (this.sprites.isEmpty()) {
            throw new IllegalStateException("ParticleEmitter.setSprites() must have been called before preAllocateParticles()");
        }
        int i = 0;
        while (true) {
            Particle[] particleArr = this.particles;
            if (i >= particleArr.length) {
                return;
            }
            if (particleArr[i] == null) {
                Particle particleNewParticle = newParticle(this.sprites.first());
                particleArr[i] = particleNewParticle;
                particleNewParticle.flip(this.flipX, this.flipY);
            }
            i++;
        }
    }

    public void reset() {
        reset(true);
    }

    public void save(Writer writer) throws IOException {
        writer.write(this.name + "\n");
        writer.write("- Delay -\n");
        this.delayValue.save(writer);
        writer.write("- Duration - \n");
        this.durationValue.save(writer);
        writer.write("- Count - \n");
        writer.write("min: " + this.minParticleCount + "\n");
        writer.write("max: " + this.maxParticleCount + "\n");
        writer.write("- Emission - \n");
        this.emissionValue.save(writer);
        writer.write("- Life - \n");
        this.lifeValue.save(writer);
        writer.write("- Life Offset - \n");
        this.lifeOffsetValue.save(writer);
        writer.write("- X Offset - \n");
        this.xOffsetValue.save(writer);
        writer.write("- Y Offset - \n");
        this.yOffsetValue.save(writer);
        writer.write("- Spawn Shape - \n");
        this.spawnShapeValue.save(writer);
        writer.write("- Spawn Width - \n");
        this.spawnWidthValue.save(writer);
        writer.write("- Spawn Height - \n");
        this.spawnHeightValue.save(writer);
        writer.write("- X Scale - \n");
        this.xScaleValue.save(writer);
        writer.write("- Y Scale - \n");
        this.yScaleValue.save(writer);
        writer.write("- Velocity - \n");
        this.velocityValue.save(writer);
        writer.write("- Angle - \n");
        this.angleValue.save(writer);
        writer.write("- Rotation - \n");
        this.rotationValue.save(writer);
        writer.write("- Wind - \n");
        this.windValue.save(writer);
        writer.write("- Gravity - \n");
        this.gravityValue.save(writer);
        writer.write("- Tint - \n");
        this.tintValue.save(writer);
        writer.write("- Transparency - \n");
        this.transparencyValue.save(writer);
        writer.write("- Options - \n");
        writer.write("attached: " + this.attached + "\n");
        writer.write("continuous: " + this.continuous + "\n");
        writer.write("aligned: " + this.aligned + "\n");
        writer.write("additive: " + this.additive + "\n");
        writer.write("behind: " + this.behind + "\n");
        writer.write("premultipliedAlpha: " + this.premultipliedAlpha + "\n");
        writer.write("spriteMode: " + this.spriteMode.toString() + "\n");
        writer.write("- Image Paths -\n");
        Array.ArrayIterator<String> it = this.imagePaths.iterator();
        while (it.hasNext()) {
            writer.write(it.next() + "\n");
        }
        writer.write("\n");
    }

    public void scaleMotion(float f) {
        if (f == 1.0f) {
            return;
        }
        for (RangedNumericValue rangedNumericValue : getMotionValues()) {
            rangedNumericValue.scale(f);
        }
    }

    public void scaleSize(float f) {
        if (f == 1.0f) {
            return;
        }
        scaleSize(f, f);
    }

    public void setAdditive(boolean z) {
        this.additive = z;
    }

    public void setAligned(boolean z) {
        this.aligned = z;
    }

    public void setAttached(boolean z) {
        this.attached = z;
    }

    public void setBehind(boolean z) {
        this.behind = z;
    }

    public void setCleansUpBlendFunction(boolean z) {
        this.cleansUpBlendFunction = z;
    }

    public void setContinuous(boolean z) {
        this.continuous = z;
    }

    public void setFlip(boolean z, boolean z2) {
        this.flipX = z;
        this.flipY = z2;
        Particle[] particleArr = this.particles;
        if (particleArr == null) {
            return;
        }
        int length = particleArr.length;
        for (int i = 0; i < length; i++) {
            Particle particle = this.particles[i];
            if (particle != null) {
                particle.flip(z, z2);
            }
        }
    }

    public void setImagePaths(Array<String> array) {
        this.imagePaths = array;
    }

    public void setMaxParticleCount(int i) {
        this.maxParticleCount = i;
        this.active = new boolean[i];
        this.activeCount = 0;
        this.particles = new Particle[i];
    }

    public void setMinParticleCount(int i) {
        this.minParticleCount = i;
    }

    public void setName(String str) {
        this.name = str;
    }

    public void setPosition(float f, float f2) {
        if (this.attached) {
            float f3 = f - this.x;
            float f4 = f2 - this.y;
            boolean[] zArr = this.active;
            int length = zArr.length;
            for (int i = 0; i < length; i++) {
                if (zArr[i]) {
                    this.particles[i].translate(f3, f4);
                }
            }
        }
        this.x = f;
        this.y = f2;
    }

    public void setPremultipliedAlpha(boolean z) {
        this.premultipliedAlpha = z;
    }

    public void setSpriteMode(SpriteMode spriteMode) {
        this.spriteMode = spriteMode;
    }

    public void setSprites(Array<Sprite> array) {
        Sprite spriteFirst;
        this.sprites = array;
        if (array.size == 0) {
            return;
        }
        int length = this.particles.length;
        for (int i = 0; i < length; i++) {
            Particle particle = this.particles[i];
            if (particle == null) {
                return;
            }
            int i2 = AnonymousClass1.$SwitchMap$com$badlogic$gdx$graphics$g2d$ParticleEmitter$SpriteMode[this.spriteMode.ordinal()];
            if (i2 == 1) {
                spriteFirst = array.first();
            } else if (i2 != 2) {
                spriteFirst = i2 != 3 ? null : array.random();
            } else {
                float f = 1.0f - (particle.currentLife / particle.life);
                int i3 = array.size;
                int iMin = Math.min((int) (f * i3), i3 - 1);
                particle.frame = iMin;
                spriteFirst = array.get(iMin);
            }
            particle.setRegion(spriteFirst);
            particle.setOrigin(spriteFirst.getOriginX(), spriteFirst.getOriginY());
        }
    }

    public void start() {
        this.firstUpdate = true;
        this.allowCompletion = false;
        restart();
    }

    public void update(float f) {
        float f2 = (f * 1000.0f) + this.accumulator;
        this.accumulator = f2;
        if (f2 < 1.0f) {
            return;
        }
        int i = (int) f2;
        float f3 = i;
        this.accumulator = f2 - f3;
        float f4 = this.delayTimer;
        if (f4 < this.delay) {
            this.delayTimer = f4 + f3;
        } else {
            if (this.firstUpdate) {
                this.firstUpdate = false;
                addParticle();
            }
            float f5 = this.durationTimer;
            if (f5 < this.duration) {
                this.durationTimer = f5 + f3;
            } else if (this.continuous && !this.allowCompletion) {
                restart();
            }
            this.emissionDelta += i;
            float scale = (this.emissionValue.getScale(this.durationTimer / this.duration) * this.emissionDiff) + this.emission;
            if (scale > 0.0f) {
                float f6 = 1000.0f / scale;
                int i2 = this.emissionDelta;
                if (i2 >= f6) {
                    int iMin = Math.min((int) (i2 / f6), this.maxParticleCount - this.activeCount);
                    this.emissionDelta = (int) (((int) (this.emissionDelta - (iMin * f6))) % f6);
                    addParticles(iMin);
                }
            }
            int i3 = this.activeCount;
            int i4 = this.minParticleCount;
            if (i3 < i4) {
                addParticles(i4 - i3);
            }
        }
        boolean[] zArr = this.active;
        int i5 = this.activeCount;
        Particle[] particleArr = this.particles;
        int length = zArr.length;
        for (int i6 = 0; i6 < length; i6++) {
            if (zArr[i6] && !updateParticle(particleArr[i6], f, i)) {
                zArr[i6] = false;
                i5--;
            }
        }
        this.activeCount = i5;
    }

    public static class RangedNumericValue extends ParticleValue {
        private float lowMax;
        private float lowMin;

        public float getLowMax() {
            return this.lowMax;
        }

        public float getLowMin() {
            return this.lowMin;
        }

        @Override // com.badlogic.gdx.graphics.g2d.ParticleEmitter.ParticleValue
        public void load(BufferedReader bufferedReader) throws IOException {
            super.load(bufferedReader);
            if (this.active) {
                this.lowMin = ParticleEmitter.readFloat(bufferedReader, "lowMin");
                this.lowMax = ParticleEmitter.readFloat(bufferedReader, "lowMax");
            }
        }

        public float newLowValue() {
            float f = this.lowMin;
            return (MathUtils.random() * (this.lowMax - f)) + f;
        }

        @Override // com.badlogic.gdx.graphics.g2d.ParticleEmitter.ParticleValue
        public void save(Writer writer) throws IOException {
            super.save(writer);
            if (this.active) {
                writer.write("lowMin: " + this.lowMin + "\n");
                writer.write("lowMax: " + this.lowMax + "\n");
            }
        }

        public void scale(float f) {
            this.lowMin *= f;
            this.lowMax *= f;
        }

        public void set(RangedNumericValue rangedNumericValue) {
            this.lowMin = rangedNumericValue.lowMin;
            this.lowMax = rangedNumericValue.lowMax;
        }

        public void setLow(float f) {
            this.lowMin = f;
            this.lowMax = f;
        }

        public void setLowMax(float f) {
            this.lowMax = f;
        }

        public void setLowMin(float f) {
            this.lowMin = f;
        }

        public void setLow(float f, float f2) {
            this.lowMin = f;
            this.lowMax = f2;
        }

        public void load(RangedNumericValue rangedNumericValue) {
            super.load((ParticleValue) rangedNumericValue);
            this.lowMax = rangedNumericValue.lowMax;
            this.lowMin = rangedNumericValue.lowMin;
        }
    }

    public static class ScaledNumericValue extends RangedNumericValue {
        private float highMax;
        private float highMin;
        boolean relative;
        private float[] scaling = {1.0f};
        float[] timeline = {0.0f};

        public float getHighMax() {
            return this.highMax;
        }

        public float getHighMin() {
            return this.highMin;
        }

        public float getScale(float f) {
            float[] fArr = this.timeline;
            int length = fArr.length;
            int i = 1;
            while (true) {
                if (i >= length) {
                    i = -1;
                    break;
                }
                if (fArr[i] > f) {
                    break;
                }
                i++;
            }
            if (i == -1) {
                return this.scaling[length - 1];
            }
            float[] fArr2 = this.scaling;
            int i2 = i - 1;
            float f2 = fArr2[i2];
            float f3 = fArr[i2];
            return (((f - f3) / (fArr[i] - f3)) * (fArr2[i] - f2)) + f2;
        }

        public float[] getScaling() {
            return this.scaling;
        }

        public float[] getTimeline() {
            return this.timeline;
        }

        public boolean isRelative() {
            return this.relative;
        }

        @Override // com.badlogic.gdx.graphics.g2d.ParticleEmitter.RangedNumericValue, com.badlogic.gdx.graphics.g2d.ParticleEmitter.ParticleValue
        public void load(BufferedReader bufferedReader) throws IOException {
            super.load(bufferedReader);
            if (!this.active) {
                return;
            }
            this.highMin = ParticleEmitter.readFloat(bufferedReader, "highMin");
            this.highMax = ParticleEmitter.readFloat(bufferedReader, "highMax");
            this.relative = ParticleEmitter.readBoolean(bufferedReader, "relative");
            this.scaling = new float[ParticleEmitter.readInt(bufferedReader, "scalingCount")];
            int i = 0;
            int i2 = 0;
            while (true) {
                float[] fArr = this.scaling;
                if (i2 >= fArr.length) {
                    break;
                }
                fArr[i2] = ParticleEmitter.readFloat(bufferedReader, "scaling" + i2);
                i2++;
            }
            this.timeline = new float[ParticleEmitter.readInt(bufferedReader, "timelineCount")];
            while (true) {
                float[] fArr2 = this.timeline;
                if (i >= fArr2.length) {
                    return;
                }
                fArr2[i] = ParticleEmitter.readFloat(bufferedReader, "timeline" + i);
                i++;
            }
        }

        public float newHighValue() {
            float f = this.highMin;
            return (MathUtils.random() * (this.highMax - f)) + f;
        }

        @Override // com.badlogic.gdx.graphics.g2d.ParticleEmitter.RangedNumericValue, com.badlogic.gdx.graphics.g2d.ParticleEmitter.ParticleValue
        public void save(Writer writer) throws IOException {
            super.save(writer);
            if (this.active) {
                writer.write("highMin: " + this.highMin + "\n");
                writer.write("highMax: " + this.highMax + "\n");
                writer.write("relative: " + this.relative + "\n");
                writer.write("scalingCount: " + this.scaling.length + "\n");
                for (int i = 0; i < this.scaling.length; i++) {
                    StringBuilder sbQ = AbstractC5044xl.q("scaling", i, ": ");
                    sbQ.append(this.scaling[i]);
                    sbQ.append("\n");
                    writer.write(sbQ.toString());
                }
                writer.write("timelineCount: " + this.timeline.length + "\n");
                for (int i2 = 0; i2 < this.timeline.length; i2++) {
                    StringBuilder sbQ2 = AbstractC5044xl.q("timeline", i2, ": ");
                    sbQ2.append(this.timeline[i2]);
                    sbQ2.append("\n");
                    writer.write(sbQ2.toString());
                }
            }
        }

        @Override // com.badlogic.gdx.graphics.g2d.ParticleEmitter.RangedNumericValue
        public void scale(float f) {
            super.scale(f);
            this.highMin *= f;
            this.highMax *= f;
        }

        @Override // com.badlogic.gdx.graphics.g2d.ParticleEmitter.RangedNumericValue
        public void set(RangedNumericValue rangedNumericValue) {
            if (rangedNumericValue instanceof ScaledNumericValue) {
                set((ScaledNumericValue) rangedNumericValue);
            } else {
                super.set(rangedNumericValue);
            }
        }

        public void setHigh(float f) {
            this.highMin = f;
            this.highMax = f;
        }

        public void setHighMax(float f) {
            this.highMax = f;
        }

        public void setHighMin(float f) {
            this.highMin = f;
        }

        public void setRelative(boolean z) {
            this.relative = z;
        }

        public void setScaling(float[] fArr) {
            this.scaling = fArr;
        }

        public void setTimeline(float[] fArr) {
            this.timeline = fArr;
        }

        public void setHigh(float f, float f2) {
            this.highMin = f;
            this.highMax = f2;
        }

        public void set(ScaledNumericValue scaledNumericValue) {
            super.set((RangedNumericValue) scaledNumericValue);
            this.highMin = scaledNumericValue.highMin;
            this.highMax = scaledNumericValue.highMax;
            float[] fArr = this.scaling;
            int length = fArr.length;
            float[] fArr2 = scaledNumericValue.scaling;
            if (length != fArr2.length) {
                this.scaling = Arrays.copyOf(fArr2, fArr2.length);
            } else {
                System.arraycopy(fArr2, 0, fArr, 0, fArr.length);
            }
            float[] fArr3 = this.timeline;
            int length2 = fArr3.length;
            float[] fArr4 = scaledNumericValue.timeline;
            if (length2 != fArr4.length) {
                this.timeline = Arrays.copyOf(fArr4, fArr4.length);
            } else {
                System.arraycopy(fArr4, 0, fArr3, 0, fArr3.length);
            }
            this.relative = scaledNumericValue.relative;
        }

        public void load(ScaledNumericValue scaledNumericValue) {
            super.load((RangedNumericValue) scaledNumericValue);
            this.highMax = scaledNumericValue.highMax;
            this.highMin = scaledNumericValue.highMin;
            float[] fArr = new float[scaledNumericValue.scaling.length];
            this.scaling = fArr;
            System.arraycopy(scaledNumericValue.scaling, 0, fArr, 0, fArr.length);
            float[] fArr2 = new float[scaledNumericValue.timeline.length];
            this.timeline = fArr2;
            System.arraycopy(scaledNumericValue.timeline, 0, fArr2, 0, fArr2.length);
            this.relative = scaledNumericValue.relative;
        }
    }

    public static boolean readBoolean(BufferedReader bufferedReader, String str) throws IOException {
        return Boolean.parseBoolean(readString(bufferedReader, str));
    }

    public static String readString(BufferedReader bufferedReader, String str) throws IOException {
        String line = bufferedReader.readLine();
        if (line != null) {
            return readString(line);
        }
        throw new IOException(AbstractC3888ke0.i("Missing value: ", str));
    }

    public void reset(boolean z) {
        this.emissionDelta = 0;
        this.durationTimer = this.duration;
        boolean[] zArr = this.active;
        int length = zArr.length;
        for (int i = 0; i < length; i++) {
            zArr[i] = false;
        }
        this.activeCount = 0;
        if (z) {
            start();
        }
    }

    public void scaleSize(float f, float f2) {
        if (f == 1.0f && f2 == 1.0f) {
            return;
        }
        for (RangedNumericValue rangedNumericValue : getXSizeValues()) {
            rangedNumericValue.scale(f);
        }
        for (RangedNumericValue rangedNumericValue2 : getYSizeValues()) {
            rangedNumericValue2.scale(f2);
        }
    }

    public static class IndependentScaledNumericValue extends ScaledNumericValue {
        boolean independent;

        public boolean isIndependent() {
            return this.independent;
        }

        @Override // com.badlogic.gdx.graphics.g2d.ParticleEmitter.ScaledNumericValue, com.badlogic.gdx.graphics.g2d.ParticleEmitter.RangedNumericValue, com.badlogic.gdx.graphics.g2d.ParticleEmitter.ParticleValue
        public void load(BufferedReader bufferedReader) throws IOException {
            super.load(bufferedReader);
            if (bufferedReader.markSupported()) {
                bufferedReader.mark(100);
            }
            String line = bufferedReader.readLine();
            if (line == null) {
                throw new IOException("Missing value: independent");
            }
            if (line.contains("independent")) {
                this.independent = Boolean.parseBoolean(ParticleEmitter.readString(line));
            } else if (bufferedReader.markSupported()) {
                bufferedReader.reset();
            } else {
                Gdx.app.error("ParticleEmitter", "The loaded particle effect descriptor file uses an old invalid format. Please download the latest version of the Particle Editor tool and recreate the file by loading and saving it again.");
                throw new IOException("The loaded particle effect descriptor file uses an old invalid format. Please download the latest version of the Particle Editor tool and recreate the file by loading and saving it again.");
            }
        }

        @Override // com.badlogic.gdx.graphics.g2d.ParticleEmitter.ScaledNumericValue, com.badlogic.gdx.graphics.g2d.ParticleEmitter.RangedNumericValue, com.badlogic.gdx.graphics.g2d.ParticleEmitter.ParticleValue
        public void save(Writer writer) throws IOException {
            super.save(writer);
            writer.write("independent: " + this.independent + "\n");
        }

        @Override // com.badlogic.gdx.graphics.g2d.ParticleEmitter.ScaledNumericValue, com.badlogic.gdx.graphics.g2d.ParticleEmitter.RangedNumericValue
        public void set(RangedNumericValue rangedNumericValue) {
            if (rangedNumericValue instanceof IndependentScaledNumericValue) {
                set((IndependentScaledNumericValue) rangedNumericValue);
            } else {
                super.set(rangedNumericValue);
            }
        }

        public void setIndependent(boolean z) {
            this.independent = z;
        }

        @Override // com.badlogic.gdx.graphics.g2d.ParticleEmitter.ScaledNumericValue
        public void set(ScaledNumericValue scaledNumericValue) {
            if (scaledNumericValue instanceof IndependentScaledNumericValue) {
                set((IndependentScaledNumericValue) scaledNumericValue);
            } else {
                super.set(scaledNumericValue);
            }
        }

        public void set(IndependentScaledNumericValue independentScaledNumericValue) {
            super.set((ScaledNumericValue) independentScaledNumericValue);
            this.independent = independentScaledNumericValue.independent;
        }

        public void load(IndependentScaledNumericValue independentScaledNumericValue) {
            super.load((ScaledNumericValue) independentScaledNumericValue);
            this.independent = independentScaledNumericValue.independent;
        }
    }

    public static class NumericValue extends ParticleValue {
        private float value;

        public float getValue() {
            return this.value;
        }

        @Override // com.badlogic.gdx.graphics.g2d.ParticleEmitter.ParticleValue
        public void load(BufferedReader bufferedReader) throws IOException {
            super.load(bufferedReader);
            if (this.active) {
                this.value = ParticleEmitter.readFloat(bufferedReader, AppMeasurementSdk.ConditionalUserProperty.VALUE);
            }
        }

        @Override // com.badlogic.gdx.graphics.g2d.ParticleEmitter.ParticleValue
        public void save(Writer writer) throws IOException {
            super.save(writer);
            if (this.active) {
                writer.write("value: " + this.value + "\n");
            }
        }

        public void setValue(float f) {
            this.value = f;
        }

        public void load(NumericValue numericValue) {
            super.load((ParticleValue) numericValue);
            this.value = numericValue.value;
        }
    }

    public static class ParticleValue {
        boolean active;
        boolean alwaysActive;

        public boolean isActive() {
            return this.alwaysActive || this.active;
        }

        public boolean isAlwaysActive() {
            return this.alwaysActive;
        }

        public void load(BufferedReader bufferedReader) throws IOException {
            if (this.alwaysActive) {
                this.active = true;
            } else {
                this.active = ParticleEmitter.readBoolean(bufferedReader, AppMeasurementSdk.ConditionalUserProperty.ACTIVE);
            }
        }

        public void save(Writer writer) throws IOException {
            if (this.alwaysActive) {
                this.active = true;
                return;
            }
            writer.write("active: " + this.active + "\n");
        }

        public void setActive(boolean z) {
            this.active = z;
        }

        public void setAlwaysActive(boolean z) {
            this.alwaysActive = z;
        }

        public void load(ParticleValue particleValue) {
            this.active = particleValue.active;
            this.alwaysActive = particleValue.alwaysActive;
        }
    }

    public static class SpawnShapeValue extends ParticleValue {
        boolean edges;
        SpawnShape shape = SpawnShape.point;
        SpawnEllipseSide side = SpawnEllipseSide.both;

        public SpawnShape getShape() {
            return this.shape;
        }

        public SpawnEllipseSide getSide() {
            return this.side;
        }

        public boolean isEdges() {
            return this.edges;
        }

        @Override // com.badlogic.gdx.graphics.g2d.ParticleEmitter.ParticleValue
        public void load(BufferedReader bufferedReader) throws IOException {
            super.load(bufferedReader);
            if (this.active) {
                SpawnShape spawnShapeValueOf = SpawnShape.valueOf(ParticleEmitter.readString(bufferedReader, "shape"));
                this.shape = spawnShapeValueOf;
                if (spawnShapeValueOf == SpawnShape.ellipse) {
                    this.edges = ParticleEmitter.readBoolean(bufferedReader, "edges");
                    this.side = SpawnEllipseSide.valueOf(ParticleEmitter.readString(bufferedReader, "side"));
                }
            }
        }

        @Override // com.badlogic.gdx.graphics.g2d.ParticleEmitter.ParticleValue
        public void save(Writer writer) throws IOException {
            super.save(writer);
            if (this.active) {
                writer.write("shape: " + this.shape + "\n");
                if (this.shape == SpawnShape.ellipse) {
                    writer.write("edges: " + this.edges + "\n");
                    writer.write("side: " + this.side + "\n");
                }
            }
        }

        public void setEdges(boolean z) {
            this.edges = z;
        }

        public void setShape(SpawnShape spawnShape) {
            this.shape = spawnShape;
        }

        public void setSide(SpawnEllipseSide spawnEllipseSide) {
            this.side = spawnEllipseSide;
        }

        public void load(SpawnShapeValue spawnShapeValue) {
            super.load((ParticleValue) spawnShapeValue);
            this.shape = spawnShapeValue.shape;
            this.edges = spawnShapeValue.edges;
            this.side = spawnShapeValue.side;
        }
    }

    public static class GradientColorValue extends ParticleValue {
        private static float[] temp = new float[4];
        private float[] colors = {1.0f, 1.0f, 1.0f};
        float[] timeline = {0.0f};

        public GradientColorValue() {
            this.alwaysActive = true;
        }

        public float[] getColor(float f) {
            float[] fArr = this.timeline;
            int length = fArr.length;
            int i = 1;
            int i2 = 0;
            while (true) {
                if (i >= length) {
                    i = -1;
                    break;
                }
                if (fArr[i] > f) {
                    break;
                }
                i2 = i;
                i++;
            }
            float f2 = fArr[i2];
            int i3 = i2 * 3;
            float[] fArr2 = this.colors;
            float f3 = fArr2[i3];
            float f4 = fArr2[i3 + 1];
            float f5 = fArr2[i3 + 2];
            if (i == -1) {
                float[] fArr3 = temp;
                fArr3[0] = f3;
                fArr3[1] = f4;
                fArr3[2] = f5;
                return fArr3;
            }
            float f6 = (f - f2) / (fArr[i] - f2);
            int i4 = i * 3;
            float[] fArr4 = temp;
            fArr4[0] = AbstractC5044xl.w(fArr2[i4], f3, f6, f3);
            fArr4[1] = AbstractC5044xl.w(fArr2[i4 + 1], f4, f6, f4);
            fArr4[2] = AbstractC5044xl.w(fArr2[i4 + 2], f5, f6, f5);
            return fArr4;
        }

        public float[] getColors() {
            return this.colors;
        }

        public float[] getTimeline() {
            return this.timeline;
        }

        @Override // com.badlogic.gdx.graphics.g2d.ParticleEmitter.ParticleValue
        public void load(BufferedReader bufferedReader) throws IOException {
            super.load(bufferedReader);
            if (!this.active) {
                return;
            }
            this.colors = new float[ParticleEmitter.readInt(bufferedReader, "colorsCount")];
            int i = 0;
            int i2 = 0;
            while (true) {
                float[] fArr = this.colors;
                if (i2 >= fArr.length) {
                    break;
                }
                fArr[i2] = ParticleEmitter.readFloat(bufferedReader, "colors" + i2);
                i2++;
            }
            this.timeline = new float[ParticleEmitter.readInt(bufferedReader, "timelineCount")];
            while (true) {
                float[] fArr2 = this.timeline;
                if (i >= fArr2.length) {
                    return;
                }
                fArr2[i] = ParticleEmitter.readFloat(bufferedReader, "timeline" + i);
                i++;
            }
        }

        @Override // com.badlogic.gdx.graphics.g2d.ParticleEmitter.ParticleValue
        public void save(Writer writer) throws IOException {
            super.save(writer);
            if (this.active) {
                writer.write("colorsCount: " + this.colors.length + "\n");
                for (int i = 0; i < this.colors.length; i++) {
                    StringBuilder sbQ = AbstractC5044xl.q("colors", i, ": ");
                    sbQ.append(this.colors[i]);
                    sbQ.append("\n");
                    writer.write(sbQ.toString());
                }
                writer.write("timelineCount: " + this.timeline.length + "\n");
                for (int i2 = 0; i2 < this.timeline.length; i2++) {
                    StringBuilder sbQ2 = AbstractC5044xl.q("timeline", i2, ": ");
                    sbQ2.append(this.timeline[i2]);
                    sbQ2.append("\n");
                    writer.write(sbQ2.toString());
                }
            }
        }

        public void setColors(float[] fArr) {
            this.colors = fArr;
        }

        public void setTimeline(float[] fArr) {
            this.timeline = fArr;
        }

        public void load(GradientColorValue gradientColorValue) {
            super.load((ParticleValue) gradientColorValue);
            float[] fArr = new float[gradientColorValue.colors.length];
            this.colors = fArr;
            System.arraycopy(gradientColorValue.colors, 0, fArr, 0, fArr.length);
            float[] fArr2 = new float[gradientColorValue.timeline.length];
            this.timeline = fArr2;
            System.arraycopy(gradientColorValue.timeline, 0, fArr2, 0, fArr2.length);
        }
    }

    public void draw(Batch batch, float f) {
        float f2 = (f * 1000.0f) + this.accumulator;
        this.accumulator = f2;
        if (f2 < 1.0f) {
            draw(batch);
            return;
        }
        int i = (int) f2;
        float f3 = i;
        this.accumulator = f2 - f3;
        if (this.premultipliedAlpha) {
            batch.setBlendFunction(1, GL20.GL_ONE_MINUS_SRC_ALPHA);
        } else if (this.additive) {
            batch.setBlendFunction(GL20.GL_SRC_ALPHA, 1);
        } else {
            batch.setBlendFunction(GL20.GL_SRC_ALPHA, GL20.GL_ONE_MINUS_SRC_ALPHA);
        }
        Particle[] particleArr = this.particles;
        boolean[] zArr = this.active;
        int i2 = this.activeCount;
        int length = zArr.length;
        for (int i3 = 0; i3 < length; i3++) {
            if (zArr[i3]) {
                Particle particle = particleArr[i3];
                if (updateParticle(particle, f, i)) {
                    particle.draw(batch);
                } else {
                    zArr[i3] = false;
                    i2--;
                }
            }
        }
        this.activeCount = i2;
        if (this.cleansUpBlendFunction && (this.additive || this.premultipliedAlpha)) {
            batch.setBlendFunction(GL20.GL_SRC_ALPHA, GL20.GL_ONE_MINUS_SRC_ALPHA);
        }
        float f4 = this.delayTimer;
        if (f4 < this.delay) {
            this.delayTimer = f4 + f3;
            return;
        }
        if (this.firstUpdate) {
            this.firstUpdate = false;
            addParticle();
        }
        float f5 = this.durationTimer;
        if (f5 < this.duration) {
            this.durationTimer = f5 + f3;
        } else if (!this.continuous || this.allowCompletion) {
            return;
        } else {
            restart();
        }
        this.emissionDelta += i;
        float scale = (this.emissionValue.getScale(this.durationTimer / this.duration) * this.emissionDiff) + this.emission;
        if (scale > 0.0f) {
            float f6 = 1000.0f / scale;
            int i4 = this.emissionDelta;
            if (i4 >= f6) {
                int iMin = Math.min((int) (i4 / f6), this.maxParticleCount - i2);
                this.emissionDelta = (int) (((int) (this.emissionDelta - (iMin * f6))) % f6);
                addParticles(iMin);
            }
        }
        int i5 = this.minParticleCount;
        if (i2 < i5) {
            addParticles(i5 - i2);
        }
    }

    public ParticleEmitter(BufferedReader bufferedReader) throws IOException {
        this.delayValue = new RangedNumericValue();
        this.lifeOffsetValue = new IndependentScaledNumericValue();
        this.durationValue = new RangedNumericValue();
        this.lifeValue = new IndependentScaledNumericValue();
        this.emissionValue = new ScaledNumericValue();
        this.xScaleValue = new ScaledNumericValue();
        this.yScaleValue = new ScaledNumericValue();
        this.rotationValue = new ScaledNumericValue();
        this.velocityValue = new ScaledNumericValue();
        this.angleValue = new ScaledNumericValue();
        this.windValue = new ScaledNumericValue();
        this.gravityValue = new ScaledNumericValue();
        this.transparencyValue = new ScaledNumericValue();
        this.tintValue = new GradientColorValue();
        this.xOffsetValue = new ScaledNumericValue();
        this.yOffsetValue = new ScaledNumericValue();
        this.spawnWidthValue = new ScaledNumericValue();
        this.spawnHeightValue = new ScaledNumericValue();
        this.spawnShapeValue = new SpawnShapeValue();
        this.spriteMode = SpriteMode.single;
        this.maxParticleCount = 4;
        this.duration = 1.0f;
        this.additive = true;
        this.premultipliedAlpha = false;
        this.cleansUpBlendFunction = true;
        initialize();
        load(bufferedReader);
    }

    public ParticleEmitter(ParticleEmitter particleEmitter) {
        this.delayValue = new RangedNumericValue();
        this.lifeOffsetValue = new IndependentScaledNumericValue();
        this.durationValue = new RangedNumericValue();
        this.lifeValue = new IndependentScaledNumericValue();
        this.emissionValue = new ScaledNumericValue();
        this.xScaleValue = new ScaledNumericValue();
        this.yScaleValue = new ScaledNumericValue();
        this.rotationValue = new ScaledNumericValue();
        this.velocityValue = new ScaledNumericValue();
        this.angleValue = new ScaledNumericValue();
        this.windValue = new ScaledNumericValue();
        this.gravityValue = new ScaledNumericValue();
        this.transparencyValue = new ScaledNumericValue();
        this.tintValue = new GradientColorValue();
        this.xOffsetValue = new ScaledNumericValue();
        this.yOffsetValue = new ScaledNumericValue();
        this.spawnWidthValue = new ScaledNumericValue();
        this.spawnHeightValue = new ScaledNumericValue();
        this.spawnShapeValue = new SpawnShapeValue();
        this.spriteMode = SpriteMode.single;
        this.maxParticleCount = 4;
        this.duration = 1.0f;
        this.additive = true;
        this.premultipliedAlpha = false;
        this.cleansUpBlendFunction = true;
        this.sprites = new Array<>(particleEmitter.sprites);
        this.name = particleEmitter.name;
        this.imagePaths = new Array<>(particleEmitter.imagePaths);
        setMaxParticleCount(particleEmitter.maxParticleCount);
        this.minParticleCount = particleEmitter.minParticleCount;
        this.delayValue.load(particleEmitter.delayValue);
        this.durationValue.load(particleEmitter.durationValue);
        this.emissionValue.load(particleEmitter.emissionValue);
        this.lifeValue.load(particleEmitter.lifeValue);
        this.lifeOffsetValue.load(particleEmitter.lifeOffsetValue);
        this.xScaleValue.load(particleEmitter.xScaleValue);
        this.yScaleValue.load(particleEmitter.yScaleValue);
        this.rotationValue.load(particleEmitter.rotationValue);
        this.velocityValue.load(particleEmitter.velocityValue);
        this.angleValue.load(particleEmitter.angleValue);
        this.windValue.load(particleEmitter.windValue);
        this.gravityValue.load(particleEmitter.gravityValue);
        this.transparencyValue.load(particleEmitter.transparencyValue);
        this.tintValue.load(particleEmitter.tintValue);
        this.xOffsetValue.load(particleEmitter.xOffsetValue);
        this.yOffsetValue.load(particleEmitter.yOffsetValue);
        this.spawnWidthValue.load(particleEmitter.spawnWidthValue);
        this.spawnHeightValue.load(particleEmitter.spawnHeightValue);
        this.spawnShapeValue.load(particleEmitter.spawnShapeValue);
        this.attached = particleEmitter.attached;
        this.continuous = particleEmitter.continuous;
        this.aligned = particleEmitter.aligned;
        this.behind = particleEmitter.behind;
        this.additive = particleEmitter.additive;
        this.premultipliedAlpha = particleEmitter.premultipliedAlpha;
        this.cleansUpBlendFunction = particleEmitter.cleansUpBlendFunction;
        this.spriteMode = particleEmitter.spriteMode;
        setPosition(particleEmitter.getX(), particleEmitter.getY());
    }
}
