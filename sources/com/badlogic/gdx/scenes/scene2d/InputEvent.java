package com.badlogic.gdx.scenes.scene2d;

import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.utils.Null;

/* JADX INFO: loaded from: classes.dex */
public class InputEvent extends Event {
    private int button;
    private char character;
    private int keyCode;
    private int pointer;

    @Null
    private Actor relatedActor;
    private float scrollAmountX;
    private float scrollAmountY;
    private float stageX;
    private float stageY;
    private boolean touchFocus = true;
    private Type type;

    public enum Type {
        touchDown,
        touchUp,
        touchDragged,
        mouseMoved,
        enter,
        exit,
        scrolled,
        keyDown,
        keyUp,
        keyTyped
    }

    public int getButton() {
        return this.button;
    }

    public char getCharacter() {
        return this.character;
    }

    public int getKeyCode() {
        return this.keyCode;
    }

    public int getPointer() {
        return this.pointer;
    }

    @Null
    public Actor getRelatedActor() {
        return this.relatedActor;
    }

    public float getScrollAmountX() {
        return this.scrollAmountX;
    }

    public float getScrollAmountY() {
        return this.scrollAmountY;
    }

    public float getStageX() {
        return this.stageX;
    }

    public float getStageY() {
        return this.stageY;
    }

    public boolean getTouchFocus() {
        return this.touchFocus;
    }

    public Type getType() {
        return this.type;
    }

    public boolean isTouchFocusCancel() {
        return this.stageX == -2.1474836E9f || this.stageY == -2.1474836E9f;
    }

    @Override // com.badlogic.gdx.scenes.scene2d.Event, com.badlogic.gdx.utils.Pool.Poolable
    public void reset() {
        super.reset();
        this.relatedActor = null;
        this.button = -1;
    }

    public void setButton(int i) {
        this.button = i;
    }

    public void setCharacter(char c) {
        this.character = c;
    }

    public void setKeyCode(int i) {
        this.keyCode = i;
    }

    public void setPointer(int i) {
        this.pointer = i;
    }

    public void setRelatedActor(@Null Actor actor) {
        this.relatedActor = actor;
    }

    public void setScrollAmountX(float f) {
        this.scrollAmountX = f;
    }

    public void setScrollAmountY(float f) {
        this.scrollAmountY = f;
    }

    public void setStageX(float f) {
        this.stageX = f;
    }

    public void setStageY(float f) {
        this.stageY = f;
    }

    public void setTouchFocus(boolean z) {
        this.touchFocus = z;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public Vector2 toCoordinates(Actor actor, Vector2 vector2) {
        vector2.set(this.stageX, this.stageY);
        actor.stageToLocalCoordinates(vector2);
        return vector2;
    }

    public String toString() {
        return this.type.toString();
    }
}
