package com.badlogic.gdx.scenes.scene2d.ui;

import com.badlogic.gdx.scenes.scene2d.Actor;
import com.badlogic.gdx.scenes.scene2d.utils.Layout;
import com.badlogic.gdx.utils.Null;

/* JADX INFO: loaded from: classes.dex */
public abstract class Value {
    public static final Fixed zero = new Fixed(0.0f);
    public static Value minWidth = new Value() { // from class: com.badlogic.gdx.scenes.scene2d.ui.Value.1
        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.badlogic.gdx.scenes.scene2d.ui.Value
        public float get(@Null Actor actor) {
            if (actor instanceof Layout) {
                return ((Layout) actor).getMinWidth();
            }
            if (actor == 0) {
                return 0.0f;
            }
            return actor.getWidth();
        }
    };
    public static Value minHeight = new Value() { // from class: com.badlogic.gdx.scenes.scene2d.ui.Value.2
        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.badlogic.gdx.scenes.scene2d.ui.Value
        public float get(@Null Actor actor) {
            if (actor instanceof Layout) {
                return ((Layout) actor).getMinHeight();
            }
            if (actor == 0) {
                return 0.0f;
            }
            return actor.getHeight();
        }
    };
    public static Value prefWidth = new Value() { // from class: com.badlogic.gdx.scenes.scene2d.ui.Value.3
        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.badlogic.gdx.scenes.scene2d.ui.Value
        public float get(@Null Actor actor) {
            if (actor instanceof Layout) {
                return ((Layout) actor).getPrefWidth();
            }
            if (actor == 0) {
                return 0.0f;
            }
            return actor.getWidth();
        }
    };
    public static Value prefHeight = new Value() { // from class: com.badlogic.gdx.scenes.scene2d.ui.Value.4
        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.badlogic.gdx.scenes.scene2d.ui.Value
        public float get(@Null Actor actor) {
            if (actor instanceof Layout) {
                return ((Layout) actor).getPrefHeight();
            }
            if (actor == 0) {
                return 0.0f;
            }
            return actor.getHeight();
        }
    };
    public static Value maxWidth = new Value() { // from class: com.badlogic.gdx.scenes.scene2d.ui.Value.5
        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.badlogic.gdx.scenes.scene2d.ui.Value
        public float get(@Null Actor actor) {
            if (actor instanceof Layout) {
                return ((Layout) actor).getMaxWidth();
            }
            if (actor == 0) {
                return 0.0f;
            }
            return actor.getWidth();
        }
    };
    public static Value maxHeight = new Value() { // from class: com.badlogic.gdx.scenes.scene2d.ui.Value.6
        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.badlogic.gdx.scenes.scene2d.ui.Value
        public float get(@Null Actor actor) {
            if (actor instanceof Layout) {
                return ((Layout) actor).getMaxHeight();
            }
            if (actor == 0) {
                return 0.0f;
            }
            return actor.getHeight();
        }
    };

    public static class Fixed extends Value {
        static final Fixed[] cache = new Fixed[111];
        private final float value;

        public Fixed(float f) {
            this.value = f;
        }

        public static Fixed valueOf(float f) {
            if (f == 0.0f) {
                return Value.zero;
            }
            if (f >= -10.0f && f <= 100.0f) {
                int i = (int) f;
                if (f == i) {
                    Fixed[] fixedArr = cache;
                    int i2 = i + 10;
                    Fixed fixed = fixedArr[i2];
                    if (fixed != null) {
                        return fixed;
                    }
                    Fixed fixed2 = new Fixed(f);
                    fixedArr[i2] = fixed2;
                    return fixed2;
                }
            }
            return new Fixed(f);
        }

        @Override // com.badlogic.gdx.scenes.scene2d.ui.Value
        public float get(@Null Actor actor) {
            return this.value;
        }

        public String toString() {
            return Float.toString(this.value);
        }
    }

    public static Value percentHeight(final float f) {
        return new Value() { // from class: com.badlogic.gdx.scenes.scene2d.ui.Value.8
            @Override // com.badlogic.gdx.scenes.scene2d.ui.Value
            public float get(@Null Actor actor) {
                return actor.getHeight() * f;
            }
        };
    }

    public static Value percentWidth(final float f) {
        return new Value() { // from class: com.badlogic.gdx.scenes.scene2d.ui.Value.7
            @Override // com.badlogic.gdx.scenes.scene2d.ui.Value
            public float get(@Null Actor actor) {
                return actor.getWidth() * f;
            }
        };
    }

    public float get() {
        return get(null);
    }

    public abstract float get(@Null Actor actor);

    public static Value percentHeight(final float f, final Actor actor) {
        if (actor != null) {
            return new Value() { // from class: com.badlogic.gdx.scenes.scene2d.ui.Value.10
                @Override // com.badlogic.gdx.scenes.scene2d.ui.Value
                public float get(@Null Actor actor2) {
                    return actor.getHeight() * f;
                }
            };
        }
        throw new IllegalArgumentException("actor cannot be null.");
    }

    public static Value percentWidth(final float f, final Actor actor) {
        if (actor != null) {
            return new Value() { // from class: com.badlogic.gdx.scenes.scene2d.ui.Value.9
                @Override // com.badlogic.gdx.scenes.scene2d.ui.Value
                public float get(@Null Actor actor2) {
                    return actor.getWidth() * f;
                }
            };
        }
        throw new IllegalArgumentException("actor cannot be null.");
    }
}
