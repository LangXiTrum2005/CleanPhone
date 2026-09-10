package com.badlogic.gdx.graphics.g3d.utils;

import com.badlogic.gdx.graphics.g3d.ModelInstance;
import com.badlogic.gdx.graphics.g3d.model.Animation;
import com.badlogic.gdx.math.MathUtils;
import com.badlogic.gdx.utils.GdxRuntimeException;
import com.badlogic.gdx.utils.Pool;

/* JADX INFO: loaded from: classes.dex */
public class AnimationController extends BaseAnimationController {
    public boolean allowSameAnimation;
    protected final Pool<AnimationDesc> animationPool;
    public AnimationDesc current;
    public boolean inAction;
    private boolean justChangedAnimation;
    public boolean paused;
    public AnimationDesc previous;
    public AnimationDesc queued;
    public float queuedTransitionTime;
    public float transitionCurrentTime;
    public float transitionTargetTime;

    public static class AnimationDesc {
        public Animation animation;
        public float duration;
        public AnimationListener listener;
        public int loopCount;
        public float offset;
        public float speed;
        public float time;

        public float update(float f) {
            int iAbs;
            AnimationListener animationListener;
            if (this.loopCount == 0 || this.animation == null) {
                return f;
            }
            float f2 = this.speed * f;
            if (MathUtils.isZero(this.duration)) {
                iAbs = 1;
            } else {
                float f3 = this.time + f2;
                this.time = f3;
                if (this.speed < 0.0f) {
                    float f4 = this.duration;
                    float f5 = f4 - f3;
                    iAbs = (int) Math.abs(f5 / f4);
                    this.time = this.duration - Math.abs(f5 % this.duration);
                } else {
                    iAbs = (int) Math.abs(f3 / this.duration);
                    this.time = Math.abs(this.time % this.duration);
                }
            }
            for (int i = 0; i < iAbs; i++) {
                int i2 = this.loopCount;
                if (i2 > 0) {
                    this.loopCount = i2 - 1;
                }
                if (this.loopCount != 0 && (animationListener = this.listener) != null) {
                    animationListener.onLoop(this);
                }
                if (this.loopCount == 0) {
                    float f6 = this.duration;
                    float f7 = ((iAbs - 1) - i) * f6;
                    float f8 = this.time;
                    if (f2 < 0.0f) {
                        f8 = f6 - f8;
                    }
                    float f9 = f7 + f8;
                    this.time = f2 >= 0.0f ? f6 : 0.0f;
                    AnimationListener animationListener2 = this.listener;
                    if (animationListener2 != null) {
                        animationListener2.onEnd(this);
                    }
                    return f9;
                }
            }
            return -1.0f;
        }
    }

    public interface AnimationListener {
        void onEnd(AnimationDesc animationDesc);

        void onLoop(AnimationDesc animationDesc);
    }

    public AnimationController(ModelInstance modelInstance) {
        super(modelInstance);
        this.animationPool = new Pool<AnimationDesc>() { // from class: com.badlogic.gdx.graphics.g3d.utils.AnimationController.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.badlogic.gdx.utils.Pool
            public AnimationDesc newObject() {
                return new AnimationDesc();
            }
        };
        this.justChangedAnimation = false;
    }

    private AnimationDesc obtain(Animation animation, float f, float f2, int i, float f3, AnimationListener animationListener) {
        if (animation == null) {
            return null;
        }
        AnimationDesc animationDescObtain = this.animationPool.obtain();
        animationDescObtain.animation = animation;
        animationDescObtain.listener = animationListener;
        animationDescObtain.loopCount = i;
        animationDescObtain.speed = f3;
        animationDescObtain.offset = f;
        if (f2 < 0.0f) {
            f2 = animation.duration - f;
        }
        animationDescObtain.duration = f2;
        animationDescObtain.time = f3 < 0.0f ? f2 : 0.0f;
        return animationDescObtain;
    }

    public AnimationDesc action(String str, int i, float f, AnimationListener animationListener, float f2) {
        return action(str, 0.0f, -1.0f, i, f, animationListener, f2);
    }

    public AnimationDesc animate(String str, float f) {
        return animate(str, 1, 1.0f, null, f);
    }

    public AnimationDesc queue(String str, int i, float f, AnimationListener animationListener, float f2) {
        return queue(str, 0.0f, -1.0f, i, f, animationListener, f2);
    }

    public AnimationDesc setAnimation(String str) {
        return setAnimation(str, 1, 1.0f, null);
    }

    public void update(float f) {
        AnimationDesc animationDesc;
        if (this.paused) {
            return;
        }
        AnimationDesc animationDesc2 = this.previous;
        if (animationDesc2 != null) {
            float f2 = this.transitionCurrentTime + f;
            this.transitionCurrentTime = f2;
            if (f2 >= this.transitionTargetTime) {
                removeAnimation(animationDesc2.animation);
                this.justChangedAnimation = true;
                this.animationPool.free(this.previous);
                this.previous = null;
            }
        }
        if (this.justChangedAnimation) {
            this.target.calculateTransforms();
            this.justChangedAnimation = false;
        }
        AnimationDesc animationDesc3 = this.current;
        if (animationDesc3 == null || animationDesc3.loopCount == 0 || animationDesc3.animation == null) {
            return;
        }
        float fUpdate = animationDesc3.update(f);
        if (fUpdate >= 0.0f && (animationDesc = this.queued) != null) {
            this.inAction = false;
            animate(animationDesc, this.queuedTransitionTime);
            this.queued = null;
            if (fUpdate > 0.0f) {
                update(fUpdate);
                return;
            }
            return;
        }
        AnimationDesc animationDesc4 = this.previous;
        if (animationDesc4 == null) {
            AnimationDesc animationDesc5 = this.current;
            applyAnimation(animationDesc5.animation, animationDesc5.offset + animationDesc5.time);
        } else {
            Animation animation = animationDesc4.animation;
            float f3 = animationDesc4.offset + animationDesc4.time;
            AnimationDesc animationDesc6 = this.current;
            applyAnimations(animation, f3, animationDesc6.animation, animationDesc6.offset + animationDesc6.time, this.transitionCurrentTime / this.transitionTargetTime);
        }
    }

    public AnimationDesc action(String str, float f, float f2, int i, float f3, AnimationListener animationListener, float f4) {
        return action(obtain(str, f, f2, i, f3, animationListener), f4);
    }

    public AnimationDesc animate(String str, AnimationListener animationListener, float f) {
        return animate(str, 1, 1.0f, animationListener, f);
    }

    public AnimationDesc queue(String str, float f, float f2, int i, float f3, AnimationListener animationListener, float f4) {
        return queue(obtain(str, f, f2, i, f3, animationListener), f4);
    }

    public AnimationDesc setAnimation(String str, int i) {
        return setAnimation(str, i, 1.0f, null);
    }

    public AnimationDesc action(Animation animation, float f, float f2, int i, float f3, AnimationListener animationListener, float f4) {
        return action(obtain(animation, f, f2, i, f3, animationListener), f4);
    }

    public AnimationDesc animate(String str, int i, AnimationListener animationListener, float f) {
        return animate(str, i, 1.0f, animationListener, f);
    }

    public AnimationDesc queue(Animation animation, float f, float f2, int i, float f3, AnimationListener animationListener, float f4) {
        return queue(obtain(animation, f, f2, i, f3, animationListener), f4);
    }

    public AnimationDesc setAnimation(String str, AnimationListener animationListener) {
        return setAnimation(str, 1, 1.0f, animationListener);
    }

    public AnimationDesc action(AnimationDesc animationDesc, float f) {
        if (animationDesc.loopCount >= 0) {
            AnimationDesc animationDesc2 = this.current;
            if (animationDesc2 != null && animationDesc2.loopCount != 0) {
                AnimationDesc animationDescObtain = this.inAction ? null : obtain(animationDesc2);
                this.inAction = false;
                animate(animationDesc, f);
                this.inAction = true;
                if (animationDescObtain != null) {
                    queue(animationDescObtain, f);
                }
            } else {
                animate(animationDesc, f);
            }
            return animationDesc;
        }
        throw new GdxRuntimeException("An action cannot be continuous");
    }

    public AnimationDesc animate(String str, int i, float f, AnimationListener animationListener, float f2) {
        return animate(str, 0.0f, -1.0f, i, f, animationListener, f2);
    }

    public AnimationDesc queue(AnimationDesc animationDesc, float f) {
        AnimationDesc animationDesc2 = this.current;
        if (animationDesc2 != null && animationDesc2.loopCount != 0) {
            AnimationDesc animationDesc3 = this.queued;
            if (animationDesc3 != null) {
                this.animationPool.free(animationDesc3);
            }
            this.queued = animationDesc;
            this.queuedTransitionTime = f;
            AnimationDesc animationDesc4 = this.current;
            if (animationDesc4.loopCount < 0) {
                animationDesc4.loopCount = 1;
            }
        } else {
            animate(animationDesc, f);
        }
        return animationDesc;
    }

    public AnimationDesc setAnimation(String str, int i, AnimationListener animationListener) {
        return setAnimation(str, i, 1.0f, animationListener);
    }

    public AnimationDesc animate(String str, float f, float f2, int i, float f3, AnimationListener animationListener, float f4) {
        return animate(obtain(str, f, f2, i, f3, animationListener), f4);
    }

    public AnimationDesc setAnimation(String str, int i, float f, AnimationListener animationListener) {
        return setAnimation(str, 0.0f, -1.0f, i, f, animationListener);
    }

    public AnimationDesc animate(Animation animation, float f, float f2, int i, float f3, AnimationListener animationListener, float f4) {
        return animate(obtain(animation, f, f2, i, f3, animationListener), f4);
    }

    public AnimationDesc setAnimation(String str, float f, float f2, int i, float f3, AnimationListener animationListener) {
        return setAnimation(obtain(str, f, f2, i, f3, animationListener));
    }

    public AnimationDesc animate(AnimationDesc animationDesc, float f) {
        AnimationDesc animationDesc2 = this.current;
        if (animationDesc2 != null && animationDesc2.loopCount != 0) {
            if (this.inAction) {
                queue(animationDesc, f);
            } else if (!this.allowSameAnimation && animationDesc != null && animationDesc2.animation == animationDesc.animation) {
                animationDesc.time = animationDesc2.time;
                this.animationPool.free(animationDesc2);
                this.current = animationDesc;
            } else {
                AnimationDesc animationDesc3 = this.previous;
                if (animationDesc3 != null) {
                    removeAnimation(animationDesc3.animation);
                    this.animationPool.free(this.previous);
                }
                this.previous = this.current;
                this.current = animationDesc;
                this.transitionCurrentTime = 0.0f;
                this.transitionTargetTime = f;
            }
        } else {
            this.current = animationDesc;
        }
        return animationDesc;
    }

    public AnimationDesc setAnimation(Animation animation, float f, float f2, int i, float f3, AnimationListener animationListener) {
        return setAnimation(obtain(animation, f, f2, i, f3, animationListener));
    }

    public AnimationDesc setAnimation(AnimationDesc animationDesc) {
        AnimationDesc animationDesc2 = this.current;
        if (animationDesc2 == null) {
            this.current = animationDesc;
        } else {
            if (!this.allowSameAnimation && animationDesc != null && animationDesc2.animation == animationDesc.animation) {
                animationDesc.time = animationDesc2.time;
            } else {
                removeAnimation(animationDesc2.animation);
            }
            this.animationPool.free(this.current);
            this.current = animationDesc;
        }
        this.justChangedAnimation = true;
        return animationDesc;
    }

    private AnimationDesc obtain(String str, float f, float f2, int i, float f3, AnimationListener animationListener) {
        if (str == null) {
            return null;
        }
        Animation animation = this.target.getAnimation(str);
        if (animation != null) {
            return obtain(animation, f, f2, i, f3, animationListener);
        }
        throw new GdxRuntimeException("Unknown animation: ".concat(str));
    }

    private AnimationDesc obtain(AnimationDesc animationDesc) {
        return obtain(animationDesc.animation, animationDesc.offset, animationDesc.duration, animationDesc.loopCount, animationDesc.speed, animationDesc.listener);
    }
}
