package com.badlogic.gdx.scenes.scene2d.ui;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.badlogic.gdx.math.Interpolation;
import com.badlogic.gdx.math.MathUtils;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.scenes.scene2d.Actor;
import com.badlogic.gdx.scenes.scene2d.Event;
import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.InputListener;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.Touchable;
import com.badlogic.gdx.scenes.scene2d.utils.ActorGestureListener;
import com.badlogic.gdx.scenes.scene2d.utils.Cullable;
import com.badlogic.gdx.scenes.scene2d.utils.Drawable;
import com.badlogic.gdx.scenes.scene2d.utils.Layout;
import com.badlogic.gdx.utils.Null;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC5044xl;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.DM;

/* JADX INFO: loaded from: classes.dex */
public class ScrollPane extends WidgetGroup {
    private Actor actor;
    final Rectangle actorArea;
    private final Rectangle actorCullingArea;
    float amountX;
    float amountY;
    boolean cancelTouchFocus;
    private boolean clamp;
    boolean disableX;
    boolean disableY;
    int draggingPointer;
    float fadeAlpha;
    float fadeAlphaSeconds;
    float fadeDelay;
    float fadeDelaySeconds;
    boolean fadeScrollBars;
    boolean flickScroll;
    private ActorGestureListener flickScrollListener;
    float flingTime;
    float flingTimer;
    private boolean forceScrollX;
    private boolean forceScrollY;
    final Rectangle hKnobBounds;
    final Rectangle hScrollBounds;
    boolean hScrollOnBottom;
    final Vector2 lastPoint;
    float maxX;
    float maxY;
    private float overscrollDistance;
    private float overscrollSpeedMax;
    private float overscrollSpeedMin;
    private boolean overscrollX;
    private boolean overscrollY;
    boolean scrollBarTouch;
    boolean scrollX;
    boolean scrollY;
    private boolean scrollbarsOnTop;
    boolean smoothScrolling;
    private ScrollPaneStyle style;
    boolean touchScrollH;
    boolean touchScrollV;
    final Rectangle vKnobBounds;
    final Rectangle vScrollBounds;
    boolean vScrollOnRight;
    private boolean variableSizeKnobs;
    float velocityX;
    float velocityY;
    float visualAmountX;
    float visualAmountY;

    public static class ScrollPaneStyle {

        @Null
        public Drawable background;

        @Null
        public Drawable corner;

        @Null
        public Drawable hScroll;

        @Null
        public Drawable hScrollKnob;

        @Null
        public Drawable vScroll;

        @Null
        public Drawable vScrollKnob;

        public ScrollPaneStyle() {
        }

        public ScrollPaneStyle(@Null Drawable drawable, @Null Drawable drawable2, @Null Drawable drawable3, @Null Drawable drawable4, @Null Drawable drawable5) {
            this.background = drawable;
            this.hScroll = drawable2;
            this.hScrollKnob = drawable3;
            this.vScroll = drawable4;
            this.vScrollKnob = drawable5;
        }

        public ScrollPaneStyle(ScrollPaneStyle scrollPaneStyle) {
            this.background = scrollPaneStyle.background;
            this.corner = scrollPaneStyle.corner;
            this.hScroll = scrollPaneStyle.hScroll;
            this.hScrollKnob = scrollPaneStyle.hScrollKnob;
            this.vScroll = scrollPaneStyle.vScroll;
            this.vScrollKnob = scrollPaneStyle.vScrollKnob;
        }
    }

    public ScrollPane(@Null Actor actor) {
        this(actor, new ScrollPaneStyle());
    }

    private void updateActorPosition() {
        Rectangle rectangle = this.actorArea;
        float f = rectangle.x - (this.scrollX ? (int) this.visualAmountX : 0);
        float f2 = rectangle.y - ((int) (this.scrollY ? this.maxY - this.visualAmountY : this.maxY));
        this.actor.setPosition(f, f2);
        Object obj = this.actor;
        if (obj instanceof Cullable) {
            Rectangle rectangle2 = this.actorCullingArea;
            Rectangle rectangle3 = this.actorArea;
            rectangle2.x = rectangle3.x - f;
            rectangle2.y = rectangle3.y - f2;
            rectangle2.width = rectangle3.width;
            rectangle2.height = rectangle3.height;
            ((Cullable) obj).setCullingArea(rectangle2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x020c A[DONT_INVERT, PHI: r1
  0x020c: PHI (r1v5 boolean) = (r1v4 boolean), (r1v6 boolean), (r1v6 boolean), (r1v6 boolean) binds: [B:71:0x0161, B:88:0x01ba, B:90:0x01be, B:97:0x01e8] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:108:? A[RETURN, SYNTHETIC] */
    @Override // com.badlogic.gdx.scenes.scene2d.Group, com.badlogic.gdx.scenes.scene2d.Actor
    public void act(float f) {
        boolean z;
        super.act(f);
        boolean zIsPanning = this.flickScrollListener.getGestureDetector().isPanning();
        float f2 = this.fadeAlpha;
        if (f2 <= 0.0f || !this.fadeScrollBars || zIsPanning || this.touchScrollH || this.touchScrollV) {
            z = false;
        } else {
            float f3 = this.fadeDelay - f;
            this.fadeDelay = f3;
            if (f3 <= 0.0f) {
                this.fadeAlpha = Math.max(0.0f, f2 - f);
            }
            z = true;
        }
        if (this.flingTimer > 0.0f) {
            setScrollbarsVisible(true);
            float f4 = this.flingTimer / this.flingTime;
            this.amountX = AbstractC5044xl.x(this.velocityX, f4, f, this.amountX);
            this.amountY = AbstractC5044xl.x(this.velocityY, f4, f, this.amountY);
            clamp();
            float f5 = this.amountX;
            float f6 = this.overscrollDistance;
            if (f5 == (-f6)) {
                this.velocityX = 0.0f;
            }
            if (f5 >= this.maxX + f6) {
                this.velocityX = 0.0f;
            }
            float f7 = this.amountY;
            if (f7 == (-f6)) {
                this.velocityY = 0.0f;
            }
            if (f7 >= this.maxY + f6) {
                this.velocityY = 0.0f;
            }
            float f8 = this.flingTimer - f;
            this.flingTimer = f8;
            if (f8 <= 0.0f) {
                this.velocityX = 0.0f;
                this.velocityY = 0.0f;
            }
            z = true;
        }
        if (!this.smoothScrolling || this.flingTimer > 0.0f || zIsPanning || ((this.touchScrollH && (!this.scrollX || this.maxX / (this.hScrollBounds.width - this.hKnobBounds.width) <= this.actorArea.width * 0.1f)) || (this.touchScrollV && (!this.scrollY || this.maxY / (this.vScrollBounds.height - this.vKnobBounds.height) <= this.actorArea.height * 0.1f)))) {
            float f9 = this.visualAmountX;
            float f10 = this.amountX;
            if (f9 != f10) {
                visualScrollX(f10);
            }
            float f11 = this.visualAmountY;
            float f12 = this.amountY;
            if (f11 != f12) {
                visualScrollY(f12);
            }
        } else {
            float f13 = this.visualAmountX;
            float f14 = this.amountX;
            if (f13 != f14) {
                if (f13 < f14) {
                    visualScrollX(Math.min(f14, Math.max(f * 200.0f, (f14 - f13) * 7.0f * f) + f13));
                } else {
                    visualScrollX(Math.max(f14, f13 - Math.max(f * 200.0f, ((f13 - f14) * 7.0f) * f)));
                }
                z = true;
            }
            float f15 = this.visualAmountY;
            float f16 = this.amountY;
            if (f15 != f16) {
                if (f15 < f16) {
                    visualScrollY(Math.min(f16, Math.max(200.0f * f, (f16 - f15) * 7.0f * f) + f15));
                } else {
                    visualScrollY(Math.max(f16, f15 - Math.max(200.0f * f, ((f15 - f16) * 7.0f) * f)));
                }
                z = true;
            }
        }
        if (!zIsPanning) {
            if (this.overscrollX && this.scrollX) {
                float f17 = this.amountX;
                if (f17 < 0.0f) {
                    setScrollbarsVisible(true);
                    float f18 = this.amountX;
                    float f19 = this.overscrollSpeedMin;
                    float f20 = (((((this.overscrollSpeedMax - f19) * (-f18)) / this.overscrollDistance) + f19) * f) + f18;
                    this.amountX = f20;
                    if (f20 > 0.0f) {
                        scrollX(0.0f);
                    }
                } else if (f17 > this.maxX) {
                    setScrollbarsVisible(true);
                    float f21 = this.amountX;
                    float f22 = this.overscrollSpeedMin;
                    float f23 = this.overscrollSpeedMax - f22;
                    float f24 = this.maxX;
                    float f25 = f21 - ((((f23 * (-(f24 - f21))) / this.overscrollDistance) + f22) * f);
                    this.amountX = f25;
                    if (f25 < f24) {
                        scrollX(f24);
                    }
                }
                z = true;
            }
            if (this.overscrollY && this.scrollY) {
                float f26 = this.amountY;
                if (f26 < 0.0f) {
                    setScrollbarsVisible(true);
                    float f27 = this.amountY;
                    float f28 = this.overscrollSpeedMin;
                    float f29 = (((((this.overscrollSpeedMax - f28) * (-f27)) / this.overscrollDistance) + f28) * f) + f27;
                    this.amountY = f29;
                    if (f29 > 0.0f) {
                        scrollY(0.0f);
                    }
                } else if (f26 > this.maxY) {
                    setScrollbarsVisible(true);
                    float f30 = this.amountY;
                    float f31 = this.overscrollSpeedMin;
                    float f32 = this.overscrollSpeedMax - f31;
                    float f33 = this.maxY;
                    float f34 = f30 - ((((f32 * (-(f33 - f30))) / this.overscrollDistance) + f31) * f);
                    this.amountY = f34;
                    if (f34 < f33) {
                        scrollY(f33);
                    }
                } else if (!z) {
                    return;
                }
            } else if (!z) {
                return;
            }
        } else if (!z) {
            return;
        }
        Stage stage = getStage();
        if (stage == null || !stage.getActionsRequestRendering()) {
            return;
        }
        Gdx.graphics.requestRendering();
    }

    @Override // com.badlogic.gdx.scenes.scene2d.Group
    @Deprecated
    public void addActor(Actor actor) {
        throw new UnsupportedOperationException("Use ScrollPane#setActor.");
    }

    @Override // com.badlogic.gdx.scenes.scene2d.Group
    @Deprecated
    public void addActorAfter(Actor actor, Actor actor2) {
        throw new UnsupportedOperationException("Use ScrollPane#setActor.");
    }

    @Override // com.badlogic.gdx.scenes.scene2d.Group
    @Deprecated
    public void addActorAt(int i, Actor actor) {
        throw new UnsupportedOperationException("Use ScrollPane#setActor.");
    }

    @Override // com.badlogic.gdx.scenes.scene2d.Group
    @Deprecated
    public void addActorBefore(Actor actor, Actor actor2) {
        throw new UnsupportedOperationException("Use ScrollPane#setActor.");
    }

    public void addCaptureListener() {
        addCaptureListener(new InputListener() { // from class: com.badlogic.gdx.scenes.scene2d.ui.ScrollPane.1
            private float handlePosition;

            @Override // com.badlogic.gdx.scenes.scene2d.InputListener
            public boolean mouseMoved(InputEvent inputEvent, float f, float f2) {
                ScrollPane scrollPane = ScrollPane.this;
                if (scrollPane.flickScroll) {
                    return false;
                }
                scrollPane.setScrollbarsVisible(true);
                return false;
            }

            @Override // com.badlogic.gdx.scenes.scene2d.InputListener
            public boolean touchDown(InputEvent inputEvent, float f, float f2, int i, int i2) {
                ScrollPane scrollPane = ScrollPane.this;
                if (scrollPane.draggingPointer != -1) {
                    return false;
                }
                if (i == 0 && i2 != 0) {
                    return false;
                }
                if (scrollPane.getStage() != null) {
                    ScrollPane.this.getStage().setScrollFocus(ScrollPane.this);
                }
                ScrollPane scrollPane2 = ScrollPane.this;
                if (!scrollPane2.flickScroll) {
                    scrollPane2.setScrollbarsVisible(true);
                }
                ScrollPane scrollPane3 = ScrollPane.this;
                if (scrollPane3.fadeAlpha == 0.0f) {
                    return false;
                }
                if (scrollPane3.scrollBarTouch && scrollPane3.scrollX && scrollPane3.hScrollBounds.contains(f, f2)) {
                    inputEvent.stop();
                    ScrollPane.this.setScrollbarsVisible(true);
                    if (!ScrollPane.this.hKnobBounds.contains(f, f2)) {
                        ScrollPane scrollPane4 = ScrollPane.this;
                        scrollPane4.setScrollX((scrollPane4.actorArea.width * (f >= scrollPane4.hKnobBounds.x ? 1 : -1)) + scrollPane4.amountX);
                        return true;
                    }
                    ScrollPane.this.lastPoint.set(f, f2);
                    ScrollPane scrollPane5 = ScrollPane.this;
                    this.handlePosition = scrollPane5.hKnobBounds.x;
                    scrollPane5.touchScrollH = true;
                    scrollPane5.draggingPointer = i;
                    return true;
                }
                ScrollPane scrollPane6 = ScrollPane.this;
                if (!scrollPane6.scrollBarTouch || !scrollPane6.scrollY || !scrollPane6.vScrollBounds.contains(f, f2)) {
                    return false;
                }
                inputEvent.stop();
                ScrollPane.this.setScrollbarsVisible(true);
                if (!ScrollPane.this.vKnobBounds.contains(f, f2)) {
                    ScrollPane scrollPane7 = ScrollPane.this;
                    scrollPane7.setScrollY((scrollPane7.actorArea.height * (f2 < scrollPane7.vKnobBounds.y ? 1 : -1)) + scrollPane7.amountY);
                    return true;
                }
                ScrollPane.this.lastPoint.set(f, f2);
                ScrollPane scrollPane8 = ScrollPane.this;
                this.handlePosition = scrollPane8.vKnobBounds.y;
                scrollPane8.touchScrollV = true;
                scrollPane8.draggingPointer = i;
                return true;
            }

            @Override // com.badlogic.gdx.scenes.scene2d.InputListener
            public void touchDragged(InputEvent inputEvent, float f, float f2, int i) {
                ScrollPane scrollPane = ScrollPane.this;
                if (i != scrollPane.draggingPointer) {
                    return;
                }
                if (scrollPane.touchScrollH) {
                    float f3 = this.handlePosition + (f - scrollPane.lastPoint.x);
                    this.handlePosition = f3;
                    float fMax = Math.max(scrollPane.hScrollBounds.x, f3);
                    ScrollPane scrollPane2 = ScrollPane.this;
                    Rectangle rectangle = scrollPane2.hScrollBounds;
                    float fMin = Math.min((rectangle.x + rectangle.width) - scrollPane2.hKnobBounds.width, fMax);
                    ScrollPane scrollPane3 = ScrollPane.this;
                    Rectangle rectangle2 = scrollPane3.hScrollBounds;
                    float f4 = rectangle2.width - scrollPane3.hKnobBounds.width;
                    if (f4 != 0.0f) {
                        scrollPane3.setScrollPercentX((fMin - rectangle2.x) / f4);
                    }
                    ScrollPane.this.lastPoint.set(f, f2);
                    return;
                }
                if (scrollPane.touchScrollV) {
                    float f5 = this.handlePosition + (f2 - scrollPane.lastPoint.y);
                    this.handlePosition = f5;
                    float fMax2 = Math.max(scrollPane.vScrollBounds.y, f5);
                    ScrollPane scrollPane4 = ScrollPane.this;
                    Rectangle rectangle3 = scrollPane4.vScrollBounds;
                    float fMin2 = Math.min((rectangle3.y + rectangle3.height) - scrollPane4.vKnobBounds.height, fMax2);
                    ScrollPane scrollPane5 = ScrollPane.this;
                    Rectangle rectangle4 = scrollPane5.vScrollBounds;
                    float f6 = rectangle4.height - scrollPane5.vKnobBounds.height;
                    if (f6 != 0.0f) {
                        scrollPane5.setScrollPercentY(1.0f - ((fMin2 - rectangle4.y) / f6));
                    }
                    ScrollPane.this.lastPoint.set(f, f2);
                }
            }

            @Override // com.badlogic.gdx.scenes.scene2d.InputListener
            public void touchUp(InputEvent inputEvent, float f, float f2, int i, int i2) {
                ScrollPane scrollPane = ScrollPane.this;
                if (i != scrollPane.draggingPointer) {
                    return;
                }
                scrollPane.cancel();
            }
        });
    }

    public void addScrollListener() {
        addListener(new InputListener() { // from class: com.badlogic.gdx.scenes.scene2d.ui.ScrollPane.3
            /* JADX WARN: Code duplicated, block: B:21:0x002d  */
            @Override // com.badlogic.gdx.scenes.scene2d.InputListener
            public boolean scrolled(InputEvent inputEvent, float f, float f2, float f3, float f4) {
                inputEvent.cancel();
                ScrollPane.this.setScrollbarsVisible(true);
                ScrollPane scrollPane = ScrollPane.this;
                boolean z = scrollPane.scrollY;
                if (!z && !scrollPane.scrollX) {
                    return false;
                }
                if (z) {
                    if (scrollPane.scrollX || f4 != 0.0f) {
                        f4 = f3;
                        f3 = f4;
                    } else {
                        f4 = f3;
                    }
                } else if (scrollPane.scrollX && f3 == 0.0f) {
                    f3 = f4;
                } else {
                    f4 = f3;
                    f3 = f4;
                }
                scrollPane.setScrollY((scrollPane.getMouseWheelY() * f3) + scrollPane.amountY);
                ScrollPane scrollPane2 = ScrollPane.this;
                scrollPane2.setScrollX((scrollPane2.getMouseWheelX() * f4) + scrollPane2.amountX);
                return true;
            }
        });
    }

    public void cancel() {
        this.draggingPointer = -1;
        this.touchScrollH = false;
        this.touchScrollV = false;
        this.flickScrollListener.getGestureDetector().cancel();
    }

    public void cancelTouchFocus() {
        Stage stage = getStage();
        if (stage != null) {
            stage.cancelTouchFocusExcept(this.flickScrollListener, this);
        }
    }

    public void clamp() {
        float fClamp;
        float fClamp2;
        if (this.clamp) {
            if (this.overscrollX) {
                float f = this.amountX;
                float f2 = this.overscrollDistance;
                fClamp = MathUtils.clamp(f, -f2, this.maxX + f2);
            } else {
                fClamp = MathUtils.clamp(this.amountX, 0.0f, this.maxX);
            }
            scrollX(fClamp);
            if (this.overscrollY) {
                float f3 = this.amountY;
                float f4 = this.overscrollDistance;
                fClamp2 = MathUtils.clamp(f3, -f4, this.maxY + f4);
            } else {
                fClamp2 = MathUtils.clamp(this.amountY, 0.0f, this.maxY);
            }
            scrollY(fClamp2);
        }
    }

    @Override // com.badlogic.gdx.scenes.scene2d.ui.WidgetGroup, com.badlogic.gdx.scenes.scene2d.Group, com.badlogic.gdx.scenes.scene2d.Actor
    public void draw(Batch batch, float f) {
        if (this.actor == null) {
            return;
        }
        validate();
        applyTransform(batch, computeTransform());
        if (this.scrollX) {
            Rectangle rectangle = this.hKnobBounds;
            Rectangle rectangle2 = this.hScrollBounds;
            rectangle.x = rectangle2.x + ((int) (getVisualScrollPercentX() * (rectangle2.width - rectangle.width)));
        }
        if (this.scrollY) {
            Rectangle rectangle3 = this.vKnobBounds;
            Rectangle rectangle4 = this.vScrollBounds;
            rectangle3.y = rectangle4.y + ((int) ((1.0f - getVisualScrollPercentY()) * (rectangle4.height - rectangle3.height)));
        }
        updateActorPosition();
        Color color = getColor();
        float fApply = color.f202a * f;
        if (this.style.background != null) {
            batch.setColor(color.r, color.g, color.b, fApply);
            this.style.background.draw(batch, 0.0f, 0.0f, getWidth(), getHeight());
        }
        batch.flush();
        Rectangle rectangle5 = this.actorArea;
        if (clipBegin(rectangle5.x, rectangle5.y, rectangle5.width, rectangle5.height)) {
            drawChildren(batch, f);
            batch.flush();
            clipEnd();
        }
        batch.setColor(color.r, color.g, color.b, fApply);
        if (this.fadeScrollBars) {
            fApply *= Interpolation.fade.apply(this.fadeAlpha / this.fadeAlphaSeconds);
        }
        drawScrollBars(batch, color.r, color.g, color.b, fApply);
        resetTransform(batch);
    }

    @Override // com.badlogic.gdx.scenes.scene2d.Group, com.badlogic.gdx.scenes.scene2d.Actor
    public void drawDebug(ShapeRenderer shapeRenderer) {
        drawDebugBounds(shapeRenderer);
        applyTransform(shapeRenderer, computeTransform());
        Rectangle rectangle = this.actorArea;
        if (clipBegin(rectangle.x, rectangle.y, rectangle.width, rectangle.height)) {
            drawDebugChildren(shapeRenderer);
            shapeRenderer.flush();
            clipEnd();
        }
        resetTransform(shapeRenderer);
    }

    public void drawScrollBars(Batch batch, float f, float f2, float f3, float f4) {
        Drawable drawable;
        if (f4 <= 0.0f) {
            return;
        }
        batch.setColor(f, f2, f3, f4);
        boolean z = false;
        boolean z2 = this.scrollX && this.hKnobBounds.width > 0.0f;
        if (this.scrollY && this.vKnobBounds.height > 0.0f) {
            z = true;
        }
        if (z2) {
            if (z && (drawable = this.style.corner) != null) {
                Rectangle rectangle = this.hScrollBounds;
                float f5 = rectangle.x + rectangle.width;
                float f6 = rectangle.y;
                Rectangle rectangle2 = this.vScrollBounds;
                drawable.draw(batch, f5, f6, rectangle2.width, rectangle2.y);
            }
            Drawable drawable2 = this.style.hScroll;
            if (drawable2 != null) {
                Rectangle rectangle3 = this.hScrollBounds;
                drawable2.draw(batch, rectangle3.x, rectangle3.y, rectangle3.width, rectangle3.height);
            }
            Drawable drawable3 = this.style.hScrollKnob;
            if (drawable3 != null) {
                Rectangle rectangle4 = this.hKnobBounds;
                drawable3.draw(batch, rectangle4.x, rectangle4.y, rectangle4.width, rectangle4.height);
            }
        }
        if (z) {
            Drawable drawable4 = this.style.vScroll;
            if (drawable4 != null) {
                Rectangle rectangle5 = this.vScrollBounds;
                drawable4.draw(batch, rectangle5.x, rectangle5.y, rectangle5.width, rectangle5.height);
            }
            Drawable drawable5 = this.style.vScrollKnob;
            if (drawable5 != null) {
                Rectangle rectangle6 = this.vKnobBounds;
                drawable5.draw(batch, rectangle6.x, rectangle6.y, rectangle6.width, rectangle6.height);
            }
        }
    }

    public void fling(float f, float f2, float f3) {
        this.flingTimer = f;
        this.velocityX = f2;
        this.velocityY = f3;
    }

    @Null
    public Actor getActor() {
        return this.actor;
    }

    public boolean getFadeScrollBars() {
        return this.fadeScrollBars;
    }

    public ActorGestureListener getFlickScrollListener() {
        return new ActorGestureListener() { // from class: com.badlogic.gdx.scenes.scene2d.ui.ScrollPane.2
            @Override // com.badlogic.gdx.scenes.scene2d.utils.ActorGestureListener
            public void fling(InputEvent inputEvent, float f, float f2, int i) {
                if (Math.abs(f) <= 150.0f || !ScrollPane.this.scrollX) {
                    f = 0.0f;
                }
                float f3 = (Math.abs(f2) <= 150.0f || !ScrollPane.this.scrollY) ? 0.0f : -f2;
                if (f == 0.0f && f3 == 0.0f) {
                    return;
                }
                ScrollPane scrollPane = ScrollPane.this;
                if (scrollPane.cancelTouchFocus) {
                    scrollPane.cancelTouchFocus();
                }
                ScrollPane scrollPane2 = ScrollPane.this;
                scrollPane2.fling(scrollPane2.flingTime, f, f3);
            }

            @Override // com.badlogic.gdx.scenes.scene2d.utils.ActorGestureListener, com.badlogic.gdx.scenes.scene2d.EventListener
            public boolean handle(Event event) {
                if (super.handle(event)) {
                    if (((InputEvent) event).getType() != InputEvent.Type.touchDown) {
                        return true;
                    }
                    ScrollPane.this.flingTimer = 0.0f;
                    return true;
                }
                if (!(event instanceof InputEvent) || !((InputEvent) event).isTouchFocusCancel()) {
                    return false;
                }
                ScrollPane.this.cancel();
                return false;
            }

            @Override // com.badlogic.gdx.scenes.scene2d.utils.ActorGestureListener
            public void pan(InputEvent inputEvent, float f, float f2, float f3, float f4) {
                ScrollPane.this.setScrollbarsVisible(true);
                ScrollPane scrollPane = ScrollPane.this;
                if (!scrollPane.scrollX) {
                    f3 = 0.0f;
                }
                if (!scrollPane.scrollY) {
                    f4 = 0.0f;
                }
                scrollPane.amountX -= f3;
                scrollPane.amountY += f4;
                scrollPane.clamp();
                ScrollPane scrollPane2 = ScrollPane.this;
                if (scrollPane2.cancelTouchFocus) {
                    if (f3 == 0.0f && f4 == 0.0f) {
                        return;
                    }
                    scrollPane2.cancelTouchFocus();
                }
            }
        };
    }

    public float getMaxX() {
        return this.maxX;
    }

    public float getMaxY() {
        return this.maxY;
    }

    @Override // com.badlogic.gdx.scenes.scene2d.ui.WidgetGroup, com.badlogic.gdx.scenes.scene2d.utils.Layout
    public float getMinHeight() {
        return 0.0f;
    }

    @Override // com.badlogic.gdx.scenes.scene2d.ui.WidgetGroup, com.badlogic.gdx.scenes.scene2d.utils.Layout
    public float getMinWidth() {
        return 0.0f;
    }

    public float getMouseWheelX() {
        float f = this.actorArea.width;
        return Math.min(f, Math.max(0.9f * f, this.maxX * 0.1f) / 4.0f);
    }

    public float getMouseWheelY() {
        float f = this.actorArea.height;
        return Math.min(f, Math.max(0.9f * f, this.maxY * 0.1f) / 4.0f);
    }

    public float getOverscrollDistance() {
        return this.overscrollDistance;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.badlogic.gdx.scenes.scene2d.ui.WidgetGroup, com.badlogic.gdx.scenes.scene2d.utils.Layout
    public float getPrefHeight() {
        float height;
        Actor actor = this.actor;
        if (actor instanceof Layout) {
            height = ((Layout) actor).getPrefHeight();
        } else {
            height = actor != 0 ? actor.getHeight() : 0.0f;
        }
        Drawable drawable = this.style.background;
        if (drawable != null) {
            height = Math.max(drawable.getBottomHeight() + drawable.getTopHeight() + height, drawable.getMinHeight());
        }
        if (!this.scrollX) {
            return height;
        }
        Drawable drawable2 = this.style.hScrollKnob;
        float minHeight = drawable2 != null ? drawable2.getMinHeight() : 0.0f;
        Drawable drawable3 = this.style.hScroll;
        if (drawable3 != null) {
            minHeight = Math.max(minHeight, drawable3.getMinHeight());
        }
        return height + minHeight;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.badlogic.gdx.scenes.scene2d.ui.WidgetGroup, com.badlogic.gdx.scenes.scene2d.utils.Layout
    public float getPrefWidth() {
        float width;
        Actor actor = this.actor;
        if (actor instanceof Layout) {
            width = ((Layout) actor).getPrefWidth();
        } else {
            width = actor != 0 ? actor.getWidth() : 0.0f;
        }
        Drawable drawable = this.style.background;
        if (drawable != null) {
            width = Math.max(drawable.getRightWidth() + drawable.getLeftWidth() + width, drawable.getMinWidth());
        }
        if (!this.scrollY) {
            return width;
        }
        Drawable drawable2 = this.style.vScrollKnob;
        float minWidth = drawable2 != null ? drawable2.getMinWidth() : 0.0f;
        Drawable drawable3 = this.style.vScroll;
        if (drawable3 != null) {
            minWidth = Math.max(minWidth, drawable3.getMinWidth());
        }
        return width + minWidth;
    }

    public float getScrollBarHeight() {
        if (!this.scrollX) {
            return 0.0f;
        }
        Drawable drawable = this.style.hScrollKnob;
        float minHeight = drawable != null ? drawable.getMinHeight() : 0.0f;
        Drawable drawable2 = this.style.hScroll;
        return drawable2 != null ? Math.max(minHeight, drawable2.getMinHeight()) : minHeight;
    }

    public float getScrollBarWidth() {
        if (!this.scrollY) {
            return 0.0f;
        }
        Drawable drawable = this.style.vScrollKnob;
        float minWidth = drawable != null ? drawable.getMinWidth() : 0.0f;
        Drawable drawable2 = this.style.vScroll;
        return drawable2 != null ? Math.max(minWidth, drawable2.getMinWidth()) : minWidth;
    }

    public float getScrollHeight() {
        return this.actorArea.height;
    }

    public float getScrollPercentX() {
        float f = this.maxX;
        if (f == 0.0f) {
            return 0.0f;
        }
        return MathUtils.clamp(this.amountX / f, 0.0f, 1.0f);
    }

    public float getScrollPercentY() {
        float f = this.maxY;
        if (f == 0.0f) {
            return 0.0f;
        }
        return MathUtils.clamp(this.amountY / f, 0.0f, 1.0f);
    }

    public float getScrollWidth() {
        return this.actorArea.width;
    }

    public float getScrollX() {
        return this.amountX;
    }

    public float getScrollY() {
        return this.amountY;
    }

    public ScrollPaneStyle getStyle() {
        return this.style;
    }

    public boolean getVariableSizeKnobs() {
        return this.variableSizeKnobs;
    }

    public float getVelocityX() {
        return this.velocityX;
    }

    public float getVelocityY() {
        return this.velocityY;
    }

    public float getVisualScrollPercentX() {
        float f = this.maxX;
        if (f == 0.0f) {
            return 0.0f;
        }
        return MathUtils.clamp(this.visualAmountX / f, 0.0f, 1.0f);
    }

    public float getVisualScrollPercentY() {
        float f = this.maxY;
        if (f == 0.0f) {
            return 0.0f;
        }
        return MathUtils.clamp(this.visualAmountY / f, 0.0f, 1.0f);
    }

    public float getVisualScrollX() {
        if (this.scrollX) {
            return this.visualAmountX;
        }
        return 0.0f;
    }

    public float getVisualScrollY() {
        if (this.scrollY) {
            return this.visualAmountY;
        }
        return 0.0f;
    }

    @Null
    @Deprecated
    public Actor getWidget() {
        return this.actor;
    }

    @Override // com.badlogic.gdx.scenes.scene2d.ui.WidgetGroup, com.badlogic.gdx.scenes.scene2d.Group, com.badlogic.gdx.scenes.scene2d.Actor
    @Null
    public Actor hit(float f, float f2, boolean z) {
        if (f < 0.0f || f >= getWidth() || f2 < 0.0f || f2 >= getHeight()) {
            return null;
        }
        if (z && getTouchable() == Touchable.enabled && isVisible()) {
            if (this.scrollX && this.touchScrollH && this.hScrollBounds.contains(f, f2)) {
                return this;
            }
            if (this.scrollY && this.touchScrollV && this.vScrollBounds.contains(f, f2)) {
                return this;
            }
        }
        return super.hit(f, f2, z);
    }

    public boolean isBottomEdge() {
        return !this.scrollY || this.amountY >= this.maxY;
    }

    public boolean isDragging() {
        return this.draggingPointer != -1;
    }

    public boolean isFlinging() {
        return this.flingTimer > 0.0f;
    }

    public boolean isForceScrollX() {
        return this.forceScrollX;
    }

    public boolean isForceScrollY() {
        return this.forceScrollY;
    }

    public boolean isLeftEdge() {
        return !this.scrollX || this.amountX <= 0.0f;
    }

    public boolean isPanning() {
        return this.flickScrollListener.getGestureDetector().isPanning();
    }

    public boolean isRightEdge() {
        return !this.scrollX || this.amountX >= this.maxX;
    }

    public boolean isScrollX() {
        return this.scrollX;
    }

    public boolean isScrollY() {
        return this.scrollY;
    }

    public boolean isScrollingDisabledX() {
        return this.disableX;
    }

    public boolean isScrollingDisabledY() {
        return this.disableY;
    }

    public boolean isTopEdge() {
        return !this.scrollY || this.amountY <= 0.0f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.badlogic.gdx.scenes.scene2d.ui.WidgetGroup, com.badlogic.gdx.scenes.scene2d.utils.Layout
    public void layout() {
        float bottomHeight;
        float minWidth;
        float rightWidth;
        float topHeight;
        float width;
        float height;
        float f;
        ScrollPaneStyle scrollPaneStyle = this.style;
        Drawable drawable = scrollPaneStyle.background;
        Drawable drawable2 = scrollPaneStyle.hScrollKnob;
        Drawable drawable3 = scrollPaneStyle.vScrollKnob;
        if (drawable != null) {
            minWidth = drawable.getLeftWidth();
            rightWidth = drawable.getRightWidth();
            topHeight = drawable.getTopHeight();
            bottomHeight = drawable.getBottomHeight();
        } else {
            bottomHeight = 0.0f;
            minWidth = 0.0f;
            rightWidth = 0.0f;
            topHeight = 0.0f;
        }
        float width2 = getWidth();
        float height2 = getHeight() - topHeight;
        this.actorArea.set(minWidth, bottomHeight, (width2 - minWidth) - rightWidth, height2 - bottomHeight);
        if (this.actor == null) {
            return;
        }
        float minHeight = drawable2 != null ? drawable2.getMinHeight() : 0.0f;
        Drawable drawable4 = this.style.hScroll;
        if (drawable4 != null) {
            minHeight = Math.max(minHeight, drawable4.getMinHeight());
        }
        float minWidth2 = drawable3 != null ? drawable3.getMinWidth() : 0.0f;
        Drawable drawable5 = this.style.vScroll;
        if (drawable5 != null) {
            minWidth2 = Math.max(minWidth2, drawable5.getMinWidth());
        }
        Actor actor = this.actor;
        if (actor instanceof Layout) {
            Layout layout = (Layout) actor;
            width = layout.getPrefWidth();
            height = layout.getPrefHeight();
        } else {
            width = actor.getWidth();
            height = this.actor.getHeight();
        }
        boolean z = this.forceScrollX || (width > this.actorArea.width && !this.disableX);
        this.scrollX = z;
        boolean z2 = this.forceScrollY || (height > this.actorArea.height && !this.disableY);
        this.scrollY = z2;
        if (this.scrollbarsOnTop) {
            f = bottomHeight;
        } else {
            if (z2) {
                Rectangle rectangle = this.actorArea;
                float f2 = rectangle.width - minWidth2;
                rectangle.width = f2;
                f = bottomHeight;
                if (!this.vScrollOnRight) {
                    rectangle.x += minWidth2;
                }
                if (!z && width > f2 && !this.disableX) {
                    this.scrollX = true;
                }
            } else {
                f = bottomHeight;
            }
            if (this.scrollX) {
                Rectangle rectangle2 = this.actorArea;
                float f3 = rectangle2.height - minHeight;
                rectangle2.height = f3;
                if (this.hScrollOnBottom) {
                    rectangle2.y += minHeight;
                }
                if (!z2 && height > f3 && !this.disableY) {
                    this.scrollY = true;
                    rectangle2.width -= minWidth2;
                    if (!this.vScrollOnRight) {
                        rectangle2.x += minWidth2;
                    }
                }
            }
        }
        float fMax = this.disableX ? this.actorArea.width : Math.max(this.actorArea.width, width);
        float fMax2 = this.disableY ? this.actorArea.height : Math.max(this.actorArea.height, height);
        Rectangle rectangle3 = this.actorArea;
        float f4 = fMax - rectangle3.width;
        this.maxX = f4;
        this.maxY = fMax2 - rectangle3.height;
        scrollX(MathUtils.clamp(this.amountX, 0.0f, f4));
        scrollY(MathUtils.clamp(this.amountY, 0.0f, this.maxY));
        if (this.scrollX) {
            if (drawable2 != null) {
                this.hScrollBounds.set(this.scrollbarsOnTop ? minWidth : this.actorArea.x, this.hScrollOnBottom ? f : height2 - minHeight, this.actorArea.width, minHeight);
                if (this.scrollY && this.scrollbarsOnTop) {
                    Rectangle rectangle4 = this.hScrollBounds;
                    rectangle4.width -= minWidth2;
                    if (!this.vScrollOnRight) {
                        rectangle4.x += minWidth2;
                    }
                }
                if (this.variableSizeKnobs) {
                    this.hKnobBounds.width = Math.max(drawable2.getMinWidth(), (int) ((this.hScrollBounds.width * this.actorArea.width) / fMax));
                } else {
                    this.hKnobBounds.width = drawable2.getMinWidth();
                }
                Rectangle rectangle5 = this.hKnobBounds;
                if (rectangle5.width > fMax) {
                    rectangle5.width = 0.0f;
                }
                rectangle5.height = drawable2.getMinHeight();
                Rectangle rectangle6 = this.hKnobBounds;
                Rectangle rectangle7 = this.hScrollBounds;
                rectangle6.x = rectangle7.x + ((int) (getScrollPercentX() * (rectangle7.width - rectangle6.width)));
                this.hKnobBounds.y = this.hScrollBounds.y;
            } else {
                this.hScrollBounds.set(0.0f, 0.0f, 0.0f, 0.0f);
                this.hKnobBounds.set(0.0f, 0.0f, 0.0f, 0.0f);
            }
        }
        if (this.scrollY) {
            if (drawable3 != null) {
                this.vScrollBounds.set(this.vScrollOnRight ? (width2 - rightWidth) - minWidth2 : minWidth, this.scrollbarsOnTop ? f : this.actorArea.y, minWidth2, this.actorArea.height);
                if (this.scrollX && this.scrollbarsOnTop) {
                    Rectangle rectangle8 = this.vScrollBounds;
                    rectangle8.height -= minHeight;
                    if (this.hScrollOnBottom) {
                        rectangle8.y += minHeight;
                    }
                }
                this.vKnobBounds.width = drawable3.getMinWidth();
                if (this.variableSizeKnobs) {
                    this.vKnobBounds.height = Math.max(drawable3.getMinHeight(), (int) ((this.vScrollBounds.height * this.actorArea.height) / fMax2));
                } else {
                    this.vKnobBounds.height = drawable3.getMinHeight();
                }
                Rectangle rectangle9 = this.vKnobBounds;
                if (rectangle9.height > fMax2) {
                    rectangle9.height = 0.0f;
                }
                if (this.vScrollOnRight) {
                    minWidth = (width2 - rightWidth) - drawable3.getMinWidth();
                }
                rectangle9.x = minWidth;
                Rectangle rectangle10 = this.vKnobBounds;
                Rectangle rectangle11 = this.vScrollBounds;
                rectangle10.y = rectangle11.y + ((int) ((1.0f - getScrollPercentY()) * (rectangle11.height - rectangle10.height)));
            } else {
                this.vScrollBounds.set(0.0f, 0.0f, 0.0f, 0.0f);
                this.vKnobBounds.set(0.0f, 0.0f, 0.0f, 0.0f);
            }
        }
        updateActorPosition();
        Actor actor2 = this.actor;
        if (actor2 instanceof Layout) {
            actor2.setSize(fMax, fMax2);
            ((Layout) this.actor).validate();
        }
    }

    @Override // com.badlogic.gdx.scenes.scene2d.Group
    public boolean removeActor(Actor actor) {
        if (actor == null) {
            throw new IllegalArgumentException("actor cannot be null.");
        }
        if (actor != this.actor) {
            return false;
        }
        setActor(null);
        return true;
    }

    @Override // com.badlogic.gdx.scenes.scene2d.Group
    public Actor removeActorAt(int i, boolean z) {
        Actor actorRemoveActorAt = super.removeActorAt(i, z);
        if (actorRemoveActorAt == this.actor) {
            this.actor = null;
        }
        return actorRemoveActorAt;
    }

    public void scrollTo(float f, float f2, float f3, float f4) {
        scrollTo(f, f2, f3, f4, false, false);
    }

    public void scrollX(float f) {
        this.amountX = f;
    }

    public void scrollY(float f) {
        this.amountY = f;
    }

    public void setActor(@Null Actor actor) {
        Actor actor2 = this.actor;
        if (actor2 == this) {
            throw new IllegalArgumentException("actor cannot be the ScrollPane.");
        }
        if (actor2 != null) {
            super.removeActor(actor2);
        }
        this.actor = actor;
        if (actor != null) {
            super.addActor(actor);
        }
    }

    public void setCancelTouchFocus(boolean z) {
        this.cancelTouchFocus = z;
    }

    public void setClamp(boolean z) {
        this.clamp = z;
    }

    public void setFadeScrollBars(boolean z) {
        if (this.fadeScrollBars == z) {
            return;
        }
        this.fadeScrollBars = z;
        if (!z) {
            this.fadeAlpha = this.fadeAlphaSeconds;
        }
        invalidate();
    }

    public void setFlickScroll(boolean z) {
        if (this.flickScroll == z) {
            return;
        }
        this.flickScroll = z;
        if (z) {
            addListener(this.flickScrollListener);
        } else {
            removeListener(this.flickScrollListener);
        }
        invalidate();
    }

    public void setFlickScrollTapSquareSize(float f) {
        this.flickScrollListener.getGestureDetector().setTapSquareSize(f);
    }

    public void setFlingTime(float f) {
        this.flingTime = f;
    }

    public void setForceScroll(boolean z, boolean z2) {
        this.forceScrollX = z;
        this.forceScrollY = z2;
    }

    public void setOverscroll(boolean z, boolean z2) {
        this.overscrollX = z;
        this.overscrollY = z2;
    }

    public void setScrollBarPositions(boolean z, boolean z2) {
        this.hScrollOnBottom = z;
        this.vScrollOnRight = z2;
    }

    public void setScrollBarTouch(boolean z) {
        this.scrollBarTouch = z;
    }

    public void setScrollPercentX(float f) {
        scrollX(MathUtils.clamp(f, 0.0f, 1.0f) * this.maxX);
    }

    public void setScrollPercentY(float f) {
        scrollY(MathUtils.clamp(f, 0.0f, 1.0f) * this.maxY);
    }

    public void setScrollX(float f) {
        scrollX(MathUtils.clamp(f, 0.0f, this.maxX));
    }

    public void setScrollY(float f) {
        scrollY(MathUtils.clamp(f, 0.0f, this.maxY));
    }

    public void setScrollbarsOnTop(boolean z) {
        this.scrollbarsOnTop = z;
        invalidate();
    }

    public void setScrollbarsVisible(boolean z) {
        if (z) {
            this.fadeAlpha = this.fadeAlphaSeconds;
            this.fadeDelay = this.fadeDelaySeconds;
        } else {
            this.fadeAlpha = 0.0f;
            this.fadeDelay = 0.0f;
        }
    }

    public void setScrollingDisabled(boolean z, boolean z2) {
        if (z == this.disableX && z2 == this.disableY) {
            return;
        }
        this.disableX = z;
        this.disableY = z2;
        invalidate();
    }

    public void setSmoothScrolling(boolean z) {
        this.smoothScrolling = z;
    }

    public void setStyle(ScrollPaneStyle scrollPaneStyle) {
        if (scrollPaneStyle == null) {
            throw new IllegalArgumentException("style cannot be null.");
        }
        this.style = scrollPaneStyle;
        invalidateHierarchy();
    }

    public void setVariableSizeKnobs(boolean z) {
        this.variableSizeKnobs = z;
    }

    public void setVelocityX(float f) {
        this.velocityX = f;
    }

    public void setVelocityY(float f) {
        this.velocityY = f;
    }

    @Deprecated
    public void setWidget(@Null Actor actor) {
        setActor(actor);
    }

    public void setupFadeScrollBars(float f, float f2) {
        this.fadeAlphaSeconds = f;
        this.fadeDelaySeconds = f2;
    }

    public void setupOverscroll(float f, float f2, float f3) {
        this.overscrollDistance = f;
        this.overscrollSpeedMin = f2;
        this.overscrollSpeedMax = f3;
    }

    public void updateVisualScroll() {
        this.visualAmountX = this.amountX;
        this.visualAmountY = this.amountY;
    }

    public void visualScrollX(float f) {
        this.visualAmountX = f;
    }

    public void visualScrollY(float f) {
        this.visualAmountY = f;
    }

    public ScrollPane(@Null Actor actor, Skin skin) {
        this(actor, (ScrollPaneStyle) skin.get(ScrollPaneStyle.class));
    }

    public void scrollTo(float f, float f2, float f3, float f4, boolean z, boolean z2) {
        validate();
        scrollX(MathUtils.clamp(z ? DM.c(f3, this.actorArea.width, 2.0f, f) : MathUtils.clamp(this.amountX, f, (f3 + f) - this.actorArea.width), 0.0f, this.maxX));
        float f5 = this.amountY;
        float f6 = this.maxY - f2;
        scrollY(MathUtils.clamp(z2 ? ((this.actorArea.height + f4) / 2.0f) + f6 : MathUtils.clamp(f5, f4 + f6, f6 + this.actorArea.height), 0.0f, this.maxY));
    }

    public ScrollPane(@Null Actor actor, Skin skin, String str) {
        this(actor, (ScrollPaneStyle) skin.get(str, ScrollPaneStyle.class));
    }

    public ScrollPane(@Null Actor actor, ScrollPaneStyle scrollPaneStyle) {
        this.actorArea = new Rectangle();
        this.hScrollBounds = new Rectangle();
        this.hKnobBounds = new Rectangle();
        this.vScrollBounds = new Rectangle();
        this.vKnobBounds = new Rectangle();
        this.actorCullingArea = new Rectangle();
        this.vScrollOnRight = true;
        this.hScrollOnBottom = true;
        this.lastPoint = new Vector2();
        this.fadeScrollBars = true;
        this.smoothScrolling = true;
        this.scrollBarTouch = true;
        this.fadeAlphaSeconds = 1.0f;
        this.fadeDelaySeconds = 1.0f;
        this.cancelTouchFocus = true;
        this.flickScroll = true;
        this.flingTime = 1.0f;
        this.overscrollX = true;
        this.overscrollY = true;
        this.overscrollDistance = 50.0f;
        this.overscrollSpeedMin = 30.0f;
        this.overscrollSpeedMax = 200.0f;
        this.clamp = true;
        this.variableSizeKnobs = true;
        this.draggingPointer = -1;
        if (scrollPaneStyle != null) {
            this.style = scrollPaneStyle;
            setActor(actor);
            setSize(150.0f, 150.0f);
            addCaptureListener();
            ActorGestureListener flickScrollListener = getFlickScrollListener();
            this.flickScrollListener = flickScrollListener;
            addListener(flickScrollListener);
            addScrollListener();
            return;
        }
        throw new IllegalArgumentException("style cannot be null.");
    }

    @Override // com.badlogic.gdx.scenes.scene2d.Group
    public boolean removeActor(Actor actor, boolean z) {
        if (actor != null) {
            if (actor != this.actor) {
                return false;
            }
            this.actor = null;
            return super.removeActor(actor, z);
        }
        throw new IllegalArgumentException("actor cannot be null.");
    }
}
