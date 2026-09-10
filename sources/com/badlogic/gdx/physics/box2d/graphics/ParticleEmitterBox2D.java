package com.badlogic.gdx.physics.box2d.graphics;

import com.badlogic.gdx.graphics.g2d.ParticleEmitter;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.math.MathUtils;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.physics.box2d.Fixture;
import com.badlogic.gdx.physics.box2d.RayCastCallback;
import com.badlogic.gdx.physics.box2d.World;
import java.io.BufferedReader;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public class ParticleEmitterBox2D extends ParticleEmitter {
    private static final float EPSILON = 0.001f;
    final Vector2 endPoint;
    float normalAngle;
    boolean particleCollided;
    final RayCastCallback rayCallBack;
    final Vector2 startPoint;
    final World world;

    public class ParticleBox2D extends ParticleEmitter.Particle {
        public ParticleBox2D(Sprite sprite) {
            super(sprite);
        }

        @Override // com.badlogic.gdx.graphics.g2d.Sprite
        public void translate(float f, float f2) {
            if ((f2 * f2) + (f * f) < ParticleEmitterBox2D.EPSILON) {
                return;
            }
            float width = (getWidth() / 2.0f) + getX();
            float height = (getHeight() / 2.0f) + getY();
            ParticleEmitterBox2D particleEmitterBox2D = ParticleEmitterBox2D.this;
            particleEmitterBox2D.particleCollided = false;
            particleEmitterBox2D.startPoint.set(width, height);
            ParticleEmitterBox2D.this.endPoint.set(width + f, height + f2);
            ParticleEmitterBox2D particleEmitterBox2D2 = ParticleEmitterBox2D.this;
            World world = particleEmitterBox2D2.world;
            if (world != null) {
                world.rayCast(particleEmitterBox2D2.rayCallBack, particleEmitterBox2D2.startPoint, particleEmitterBox2D2.endPoint);
            }
            ParticleEmitterBox2D particleEmitterBox2D3 = ParticleEmitterBox2D.this;
            if (particleEmitterBox2D3.particleCollided) {
                float f3 = ((particleEmitterBox2D3.normalAngle * 2.0f) - this.angle) - 180.0f;
                this.angle = f3;
                this.angleCos = MathUtils.cosDeg(f3);
                float fSinDeg = MathUtils.sinDeg(this.angle);
                this.angleSin = fSinDeg;
                f *= this.angleCos;
                f2 *= fSinDeg;
            }
            super.translate(f, f2);
        }
    }

    public ParticleEmitterBox2D(World world) {
        this.startPoint = new Vector2();
        this.endPoint = new Vector2();
        this.rayCallBack = new RayCastCallback() { // from class: com.badlogic.gdx.physics.box2d.graphics.ParticleEmitterBox2D.1
            @Override // com.badlogic.gdx.physics.box2d.RayCastCallback
            public float reportRayFixture(Fixture fixture, Vector2 vector2, Vector2 vector3, float f) {
                ParticleEmitterBox2D particleEmitterBox2D = ParticleEmitterBox2D.this;
                particleEmitterBox2D.particleCollided = true;
                particleEmitterBox2D.normalAngle = MathUtils.atan2(vector3.y, vector3.x) * 57.295776f;
                return f;
            }
        };
        this.world = world;
    }

    @Override // com.badlogic.gdx.graphics.g2d.ParticleEmitter
    public ParticleEmitter.Particle newParticle(Sprite sprite) {
        return new ParticleBox2D(sprite);
    }

    public ParticleEmitterBox2D(World world, BufferedReader bufferedReader) throws IOException {
        super(bufferedReader);
        this.startPoint = new Vector2();
        this.endPoint = new Vector2();
        this.rayCallBack = new RayCastCallback() { // from class: com.badlogic.gdx.physics.box2d.graphics.ParticleEmitterBox2D.1
            @Override // com.badlogic.gdx.physics.box2d.RayCastCallback
            public float reportRayFixture(Fixture fixture, Vector2 vector2, Vector2 vector3, float f) {
                ParticleEmitterBox2D particleEmitterBox2D = ParticleEmitterBox2D.this;
                particleEmitterBox2D.particleCollided = true;
                particleEmitterBox2D.normalAngle = MathUtils.atan2(vector3.y, vector3.x) * 57.295776f;
                return f;
            }
        };
        this.world = world;
    }

    public ParticleEmitterBox2D(World world, ParticleEmitter particleEmitter) {
        super(particleEmitter);
        this.startPoint = new Vector2();
        this.endPoint = new Vector2();
        this.rayCallBack = new RayCastCallback() { // from class: com.badlogic.gdx.physics.box2d.graphics.ParticleEmitterBox2D.1
            @Override // com.badlogic.gdx.physics.box2d.RayCastCallback
            public float reportRayFixture(Fixture fixture, Vector2 vector2, Vector2 vector3, float f) {
                ParticleEmitterBox2D particleEmitterBox2D = ParticleEmitterBox2D.this;
                particleEmitterBox2D.particleCollided = true;
                particleEmitterBox2D.normalAngle = MathUtils.atan2(vector3.y, vector3.x) * 57.295776f;
                return f;
            }
        };
        this.world = world;
    }
}
