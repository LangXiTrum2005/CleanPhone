package com.badlogic.gdx.scenes.scene2d.ui;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.scenes.scene2d.Actor;
import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.InputListener;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.Touchable;
import com.badlogic.gdx.utils.Null;

/* JADX INFO: loaded from: classes.dex */
public class Tooltip<T extends Actor> extends InputListener {
    static Vector2 tmp = new Vector2();
    boolean always;
    final Container<T> container;
    boolean instant;
    private final TooltipManager manager;
    Actor targetActor;
    boolean touchIndependent;

    public Tooltip(@Null T t) {
        this(t, TooltipManager.getInstance());
    }

    private void setContainerPosition(Actor actor, float f, float f2) {
        this.targetActor = actor;
        Stage stage = actor.getStage();
        if (stage == null) {
            return;
        }
        this.container.setSize(this.manager.maxWidth, 2.1474836E9f);
        this.container.validate();
        Container<T> container = this.container;
        container.width(container.getActor().getWidth());
        this.container.pack();
        TooltipManager tooltipManager = this.manager;
        float f3 = tooltipManager.offsetX;
        float f4 = tooltipManager.offsetY;
        float f5 = tooltipManager.edgeDistance;
        float f6 = f + f3;
        Vector2 vector2LocalToStageCoordinates = actor.localToStageCoordinates(tmp.set(f6, (f2 - f4) - this.container.getHeight()));
        if (vector2LocalToStageCoordinates.y < f5) {
            vector2LocalToStageCoordinates = actor.localToStageCoordinates(tmp.set(f6, f2 + f4));
        }
        if (vector2LocalToStageCoordinates.x < f5) {
            vector2LocalToStageCoordinates.x = f5;
        }
        if (this.container.getWidth() + vector2LocalToStageCoordinates.x > stage.getWidth() - f5) {
            vector2LocalToStageCoordinates.x = (stage.getWidth() - f5) - this.container.getWidth();
        }
        if (this.container.getHeight() + vector2LocalToStageCoordinates.y > stage.getHeight() - f5) {
            vector2LocalToStageCoordinates.y = (stage.getHeight() - f5) - this.container.getHeight();
        }
        this.container.setPosition(vector2LocalToStageCoordinates.x, vector2LocalToStageCoordinates.y);
        Vector2 vector2LocalToStageCoordinates2 = actor.localToStageCoordinates(tmp.set(actor.getWidth() / 2.0f, actor.getHeight() / 2.0f));
        vector2LocalToStageCoordinates2.sub(this.container.getX(), this.container.getY());
        this.container.setOrigin(vector2LocalToStageCoordinates2.x, vector2LocalToStageCoordinates2.y);
    }

    @Override // com.badlogic.gdx.scenes.scene2d.InputListener
    public void enter(InputEvent inputEvent, float f, float f2, int i, @Null Actor actor) {
        if (i != -1) {
            return;
        }
        if (this.touchIndependent && Gdx.input.isTouched()) {
            return;
        }
        Actor listenerActor = inputEvent.getListenerActor();
        if (actor == null || !actor.isDescendantOf(listenerActor)) {
            setContainerPosition(listenerActor, f, f2);
            this.manager.enter(this);
        }
    }

    @Override // com.badlogic.gdx.scenes.scene2d.InputListener
    public void exit(InputEvent inputEvent, float f, float f2, int i, @Null Actor actor) {
        if (actor == null || !actor.isDescendantOf(inputEvent.getListenerActor())) {
            hide();
        }
    }

    @Null
    public T getActor() {
        return (T) this.container.getActor();
    }

    public Container<T> getContainer() {
        return this.container;
    }

    public TooltipManager getManager() {
        return this.manager;
    }

    public void hide() {
        this.manager.hide(this);
    }

    @Override // com.badlogic.gdx.scenes.scene2d.InputListener
    public boolean mouseMoved(InputEvent inputEvent, float f, float f2) {
        if (this.container.hasParent()) {
            return false;
        }
        setContainerPosition(inputEvent.getListenerActor(), f, f2);
        return true;
    }

    public void setActor(@Null T t) {
        this.container.setActor(t);
    }

    public void setAlways(boolean z) {
        this.always = z;
    }

    public void setInstant(boolean z) {
        this.instant = z;
    }

    public void setTouchIndependent(boolean z) {
        this.touchIndependent = z;
    }

    @Override // com.badlogic.gdx.scenes.scene2d.InputListener
    public boolean touchDown(InputEvent inputEvent, float f, float f2, int i, int i2) {
        if (this.instant) {
            this.container.toFront();
            return false;
        }
        this.manager.touchDown(this);
        return false;
    }

    public Tooltip(@Null T t, TooltipManager tooltipManager) {
        this.manager = tooltipManager;
        Container<T> container = new Container(t) { // from class: com.badlogic.gdx.scenes.scene2d.ui.Tooltip.1
            @Override // com.badlogic.gdx.scenes.scene2d.Group, com.badlogic.gdx.scenes.scene2d.Actor
            public void act(float f) {
                super.act(f);
                Actor actor = Tooltip.this.targetActor;
                if (actor == null || actor.getStage() != null) {
                    return;
                }
                remove();
            }
        };
        this.container = container;
        container.setTouchable(Touchable.disabled);
    }
}
