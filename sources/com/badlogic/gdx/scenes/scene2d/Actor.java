package com.badlogic.gdx.scenes.scene2d;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.scenes.scene2d.utils.ScissorStack;
import com.badlogic.gdx.utils.Array;
import com.badlogic.gdx.utils.DelayedRemovalArray;
import com.badlogic.gdx.utils.Null;
import com.badlogic.gdx.utils.Pools;
import com.badlogic.gdx.utils.SnapshotArray;
import com.badlogic.gdx.utils.reflect.ClassReflection;

/* JADX INFO: loaded from: classes.dex */
public class Actor {
    private boolean debug;
    float height;

    @Null
    private String name;
    float originX;
    float originY;

    @Null
    Group parent;
    float rotation;

    @Null
    private Stage stage;

    @Null
    private Object userObject;
    float width;
    float x;
    float y;
    private final DelayedRemovalArray<EventListener> listeners = new DelayedRemovalArray<>(0);
    private final DelayedRemovalArray<EventListener> captureListeners = new DelayedRemovalArray<>(0);
    private final Array<Action> actions = new Array<>(0);
    private Touchable touchable = Touchable.enabled;
    private boolean visible = true;
    float scaleX = 1.0f;
    float scaleY = 1.0f;
    final Color color = new Color(1.0f, 1.0f, 1.0f, 1.0f);

    public void act(float f) {
        Array<Action> array = this.actions;
        if (array.size == 0) {
            return;
        }
        Stage stage = this.stage;
        if (stage != null && stage.getActionsRequestRendering()) {
            Gdx.graphics.requestRendering();
        }
        int i = 0;
        while (i < array.size) {
            try {
                Action action = array.get(i);
                if (action.act(f) && i < array.size) {
                    int iIndexOf = array.get(i) == action ? i : array.indexOf(action, true);
                    if (iIndexOf != -1) {
                        array.removeIndex(iIndexOf);
                        action.setActor(null);
                        i--;
                    }
                }
                i++;
            } catch (RuntimeException e) {
                String string = toString();
                throw new RuntimeException("Actor: " + string.substring(0, Math.min(string.length(), 128)), e);
            }
        }
    }

    public void addAction(Action action) {
        action.setActor(this);
        this.actions.add(action);
        Stage stage = this.stage;
        if (stage == null || !stage.getActionsRequestRendering()) {
            return;
        }
        Gdx.graphics.requestRendering();
    }

    public boolean addCaptureListener(EventListener eventListener) {
        if (eventListener == null) {
            throw new IllegalArgumentException("listener cannot be null.");
        }
        if (!this.captureListeners.contains(eventListener, true)) {
            this.captureListeners.add(eventListener);
        }
        return true;
    }

    public boolean addListener(EventListener eventListener) {
        if (eventListener == null) {
            throw new IllegalArgumentException("listener cannot be null.");
        }
        if (this.listeners.contains(eventListener, true)) {
            return false;
        }
        this.listeners.add(eventListener);
        return true;
    }

    @Deprecated
    public boolean ancestorsVisible() {
        return ascendantsVisible();
    }

    public boolean ascendantsVisible() {
        Actor actor = this;
        while (actor.isVisible()) {
            actor = actor.parent;
            if (actor == null) {
                return true;
            }
        }
        return false;
    }

    public void clear() {
        clearActions();
        clearListeners();
    }

    public void clearActions() {
        for (int i = this.actions.size - 1; i >= 0; i--) {
            this.actions.get(i).setActor(null);
        }
        this.actions.clear();
    }

    public void clearListeners() {
        this.listeners.clear();
        this.captureListeners.clear();
    }

    public boolean clipBegin() {
        return clipBegin(this.x, this.y, this.width, this.height);
    }

    public void clipEnd() {
        Pools.free(ScissorStack.popScissors());
    }

    public Actor debug() {
        setDebug(true);
        return this;
    }

    public void draw(Batch batch, float f) {
    }

    public void drawDebug(ShapeRenderer shapeRenderer) {
        drawDebugBounds(shapeRenderer);
    }

    public void drawDebugBounds(ShapeRenderer shapeRenderer) {
        if (this.debug) {
            shapeRenderer.set(ShapeRenderer.ShapeType.Line);
            Stage stage = this.stage;
            if (stage != null) {
                shapeRenderer.setColor(stage.getDebugColor());
            }
            shapeRenderer.rect(this.x, this.y, this.originX, this.originY, this.width, this.height, this.scaleX, this.scaleY, this.rotation);
        }
    }

    public boolean fire(Event event) {
        boolean zIsCancelled;
        if (event.getStage() == null) {
            event.setStage(getStage());
        }
        event.setTarget(this);
        Array array = (Array) Pools.obtain(Array.class);
        for (Group group = this.parent; group != null; group = group.parent) {
            array.add(group);
        }
        try {
            Object[] objArr = array.items;
            for (int i = array.size - 1; i >= 0; i--) {
                ((Group) objArr[i]).notify(event, true);
                if (event.isStopped()) {
                    zIsCancelled = event.isCancelled();
                    return zIsCancelled;
                }
            }
            notify(event, true);
            if (event.isStopped()) {
                zIsCancelled = event.isCancelled();
            } else {
                notify(event, false);
                if (event.getBubbles() && !event.isStopped()) {
                    int i2 = array.size;
                    for (int i3 = 0; i3 < i2; i3++) {
                        ((Group) objArr[i3]).notify(event, false);
                        if (event.isStopped()) {
                            zIsCancelled = event.isCancelled();
                        }
                    }
                    zIsCancelled = event.isCancelled();
                } else {
                    zIsCancelled = event.isCancelled();
                }
            }
            return zIsCancelled;
        } finally {
            array.clear();
            Pools.free(array);
        }
    }

    @Null
    public <T extends Actor> T firstAscendant(Class<T> cls) {
        if (cls == null) {
            throw new IllegalArgumentException("actor cannot be null.");
        }
        Group group = (T) this;
        while (!ClassReflection.isInstance(cls, group)) {
            group = group.parent;
            if (group == null) {
                return null;
            }
        }
        return group;
    }

    public Array<Action> getActions() {
        return this.actions;
    }

    public DelayedRemovalArray<EventListener> getCaptureListeners() {
        return this.captureListeners;
    }

    public Color getColor() {
        return this.color;
    }

    public boolean getDebug() {
        return this.debug;
    }

    public float getHeight() {
        return this.height;
    }

    public DelayedRemovalArray<EventListener> getListeners() {
        return this.listeners;
    }

    @Null
    public String getName() {
        return this.name;
    }

    public float getOriginX() {
        return this.originX;
    }

    public float getOriginY() {
        return this.originY;
    }

    @Null
    public Group getParent() {
        return this.parent;
    }

    public float getRight() {
        return this.x + this.width;
    }

    public float getRotation() {
        return this.rotation;
    }

    public float getScaleX() {
        return this.scaleX;
    }

    public float getScaleY() {
        return this.scaleY;
    }

    @Null
    public Stage getStage() {
        return this.stage;
    }

    public float getTop() {
        return this.y + this.height;
    }

    public Touchable getTouchable() {
        return this.touchable;
    }

    @Null
    public Object getUserObject() {
        return this.userObject;
    }

    public float getWidth() {
        return this.width;
    }

    public float getX() {
        return this.x;
    }

    public float getY() {
        return this.y;
    }

    public int getZIndex() {
        Group group = this.parent;
        if (group == null) {
            return -1;
        }
        return group.children.indexOf(this, true);
    }

    public boolean hasActions() {
        return this.actions.size > 0;
    }

    public boolean hasKeyboardFocus() {
        Stage stage = getStage();
        return stage != null && stage.getKeyboardFocus() == this;
    }

    public boolean hasParent() {
        return this.parent != null;
    }

    public boolean hasScrollFocus() {
        Stage stage = getStage();
        return stage != null && stage.getScrollFocus() == this;
    }

    @Null
    public Actor hit(float f, float f2, boolean z) {
        if ((!z || this.touchable == Touchable.enabled) && isVisible() && f >= 0.0f && f < this.width && f2 >= 0.0f && f2 < this.height) {
            return this;
        }
        return null;
    }

    public boolean isAscendantOf(Actor actor) {
        if (actor == null) {
            throw new IllegalArgumentException("actor cannot be null.");
        }
        while (actor != this) {
            actor = actor.parent;
            if (actor == null) {
                return false;
            }
        }
        return true;
    }

    public boolean isDescendantOf(Actor actor) {
        if (actor == null) {
            throw new IllegalArgumentException("actor cannot be null.");
        }
        Actor actor2 = this;
        while (actor2 != actor) {
            actor2 = actor2.parent;
            if (actor2 == null) {
                return false;
            }
        }
        return true;
    }

    public boolean isTouchFocusListener() {
        Stage stage = getStage();
        if (stage == null) {
            return false;
        }
        int i = stage.touchFocuses.size;
        for (int i2 = 0; i2 < i; i2++) {
            if (stage.touchFocuses.get(i2).listenerActor == this) {
                return true;
            }
        }
        return false;
    }

    public boolean isTouchFocusTarget() {
        Stage stage = getStage();
        if (stage == null) {
            return false;
        }
        int i = stage.touchFocuses.size;
        for (int i2 = 0; i2 < i; i2++) {
            if (stage.touchFocuses.get(i2).target == this) {
                return true;
            }
        }
        return false;
    }

    public boolean isTouchable() {
        return this.touchable == Touchable.enabled;
    }

    public boolean isVisible() {
        return this.visible;
    }

    public Vector2 localToActorCoordinates(Actor actor, Vector2 vector2) {
        localToStageCoordinates(vector2);
        return actor.stageToLocalCoordinates(vector2);
    }

    public Vector2 localToAscendantCoordinates(@Null Actor actor, Vector2 vector2) {
        Actor actor2 = this;
        do {
            actor2.localToParentCoordinates(vector2);
            actor2 = actor2.parent;
            if (actor2 == actor) {
                return vector2;
            }
        } while (actor2 != null);
        throw new IllegalArgumentException("Actor is not an ascendant: " + actor);
    }

    public Vector2 localToParentCoordinates(Vector2 vector2) {
        float f = -this.rotation;
        float f2 = this.scaleX;
        float f3 = this.scaleY;
        float f4 = this.x;
        float f5 = this.y;
        if (f != 0.0f) {
            double d = f * 0.017453292f;
            float fCos = (float) Math.cos(d);
            float fSin = (float) Math.sin(d);
            float f6 = this.originX;
            float f7 = this.originY;
            float f8 = (vector2.x - f6) * f2;
            float f9 = (vector2.y - f7) * f3;
            vector2.x = (f9 * fSin) + (f8 * fCos) + f6 + f4;
            vector2.y = (f9 * fCos) + (f8 * (-fSin)) + f7 + f5;
        } else if (f2 == 1.0f && f3 == 1.0f) {
            vector2.x += f4;
            vector2.y += f5;
        } else {
            float f10 = this.originX;
            float f11 = this.originY;
            vector2.x = ((vector2.x - f10) * f2) + f10 + f4;
            vector2.y = ((vector2.y - f11) * f3) + f11 + f5;
        }
        return vector2;
    }

    public Vector2 localToScreenCoordinates(Vector2 vector2) {
        Stage stage = this.stage;
        return stage == null ? vector2 : stage.stageToScreenCoordinates(localToAscendantCoordinates(null, vector2));
    }

    public Vector2 localToStageCoordinates(Vector2 vector2) {
        return localToAscendantCoordinates(null, vector2);
    }

    public void moveBy(float f, float f2) {
        if (f == 0.0f && f2 == 0.0f) {
            return;
        }
        this.x += f;
        this.y += f2;
        positionChanged();
    }

    public boolean notify(Event event, boolean z) {
        if (event.getTarget() == null) {
            throw new IllegalArgumentException("The event target cannot be null.");
        }
        DelayedRemovalArray<EventListener> delayedRemovalArray = z ? this.captureListeners : this.listeners;
        if (delayedRemovalArray.size == 0) {
            return event.isCancelled();
        }
        event.setListenerActor(this);
        event.setCapture(z);
        if (event.getStage() == null) {
            event.setStage(this.stage);
        }
        try {
            delayedRemovalArray.begin();
            int i = delayedRemovalArray.size;
            for (int i2 = 0; i2 < i; i2++) {
                if (delayedRemovalArray.get(i2).handle(event)) {
                    event.handle();
                }
            }
            delayedRemovalArray.end();
            return event.isCancelled();
        } catch (RuntimeException e) {
            String string = toString();
            throw new RuntimeException("Actor: " + string.substring(0, Math.min(string.length(), 128)), e);
        }
    }

    public Vector2 parentToLocalCoordinates(Vector2 vector2) {
        float f = this.rotation;
        float f2 = this.scaleX;
        float f3 = this.scaleY;
        float f4 = this.x;
        float f5 = this.y;
        if (f != 0.0f) {
            double d = f * 0.017453292f;
            float fCos = (float) Math.cos(d);
            float fSin = (float) Math.sin(d);
            float f6 = this.originX;
            float f7 = this.originY;
            float f8 = (vector2.x - f4) - f6;
            float f9 = (vector2.y - f5) - f7;
            vector2.x = (((f9 * fSin) + (f8 * fCos)) / f2) + f6;
            vector2.y = (((f9 * fCos) + (f8 * (-fSin))) / f3) + f7;
        } else if (f2 == 1.0f && f3 == 1.0f) {
            vector2.x -= f4;
            vector2.y -= f5;
        } else {
            float f10 = this.originX;
            float f11 = this.originY;
            vector2.x = (((vector2.x - f4) - f10) / f2) + f10;
            vector2.y = (((vector2.y - f5) - f11) / f3) + f11;
        }
        return vector2;
    }

    public void positionChanged() {
    }

    public boolean remove() {
        Group group = this.parent;
        if (group != null) {
            return group.removeActor(this, true);
        }
        return false;
    }

    public void removeAction(@Null Action action) {
        if (action == null || !this.actions.removeValue(action, true)) {
            return;
        }
        action.setActor(null);
    }

    public boolean removeCaptureListener(EventListener eventListener) {
        if (eventListener != null) {
            return this.captureListeners.removeValue(eventListener, true);
        }
        throw new IllegalArgumentException("listener cannot be null.");
    }

    public boolean removeListener(EventListener eventListener) {
        if (eventListener != null) {
            return this.listeners.removeValue(eventListener, true);
        }
        throw new IllegalArgumentException("listener cannot be null.");
    }

    public void rotateBy(float f) {
        if (f != 0.0f) {
            this.rotation = (this.rotation + f) % 360.0f;
            rotationChanged();
        }
    }

    public void rotationChanged() {
    }

    public void scaleBy(float f) {
        if (f != 0.0f) {
            this.scaleX += f;
            this.scaleY += f;
            scaleChanged();
        }
    }

    public void scaleChanged() {
    }

    public Vector2 screenToLocalCoordinates(Vector2 vector2) {
        Stage stage = this.stage;
        return stage == null ? vector2 : stageToLocalCoordinates(stage.screenToStageCoordinates(vector2));
    }

    public void setBounds(float f, float f2, float f3, float f4) {
        if (this.x != f || this.y != f2) {
            this.x = f;
            this.y = f2;
            positionChanged();
        }
        if (this.width == f3 && this.height == f4) {
            return;
        }
        this.width = f3;
        this.height = f4;
        sizeChanged();
    }

    public void setColor(Color color) {
        this.color.set(color);
    }

    public void setDebug(boolean z) {
        this.debug = z;
        if (z) {
            Stage.debug = true;
        }
    }

    public void setHeight(float f) {
        if (this.height != f) {
            this.height = f;
            sizeChanged();
        }
    }

    public void setName(@Null String str) {
        this.name = str;
    }

    public void setOrigin(float f, float f2) {
        this.originX = f;
        this.originY = f2;
    }

    public void setOriginX(float f) {
        this.originX = f;
    }

    public void setOriginY(float f) {
        this.originY = f;
    }

    public void setParent(@Null Group group) {
        this.parent = group;
    }

    public void setPosition(float f, float f2) {
        if (this.x == f && this.y == f2) {
            return;
        }
        this.x = f;
        this.y = f2;
        positionChanged();
    }

    public void setRotation(float f) {
        if (this.rotation != f) {
            this.rotation = f;
            rotationChanged();
        }
    }

    public void setScale(float f) {
        if (this.scaleX == f && this.scaleY == f) {
            return;
        }
        this.scaleX = f;
        this.scaleY = f;
        scaleChanged();
    }

    public void setScaleX(float f) {
        if (this.scaleX != f) {
            this.scaleX = f;
            scaleChanged();
        }
    }

    public void setScaleY(float f) {
        if (this.scaleY != f) {
            this.scaleY = f;
            scaleChanged();
        }
    }

    public void setSize(float f, float f2) {
        if (this.width == f && this.height == f2) {
            return;
        }
        this.width = f;
        this.height = f2;
        sizeChanged();
    }

    public void setStage(Stage stage) {
        this.stage = stage;
    }

    public void setTouchable(Touchable touchable) {
        this.touchable = touchable;
    }

    public void setUserObject(@Null Object obj) {
        this.userObject = obj;
    }

    public void setVisible(boolean z) {
        this.visible = z;
    }

    public void setWidth(float f) {
        if (this.width != f) {
            this.width = f;
            sizeChanged();
        }
    }

    public void setX(float f) {
        if (this.x != f) {
            this.x = f;
            positionChanged();
        }
    }

    public void setY(float f) {
        if (this.y != f) {
            this.y = f;
            positionChanged();
        }
    }

    public boolean setZIndex(int i) {
        SnapshotArray<Actor> snapshotArray;
        int i2;
        if (i < 0) {
            throw new IllegalArgumentException("ZIndex cannot be < 0.");
        }
        Group group = this.parent;
        if (group == null || (i2 = (snapshotArray = group.children).size) <= 1) {
            return false;
        }
        int iMin = Math.min(i, i2 - 1);
        if (snapshotArray.get(iMin) == this || !snapshotArray.removeValue(this, true)) {
            return false;
        }
        snapshotArray.insert(iMin, this);
        return true;
    }

    public void sizeBy(float f) {
        if (f != 0.0f) {
            this.width += f;
            this.height += f;
            sizeChanged();
        }
    }

    public void sizeChanged() {
    }

    public Vector2 stageToLocalCoordinates(Vector2 vector2) {
        Group group = this.parent;
        if (group != null) {
            group.stageToLocalCoordinates(vector2);
        }
        parentToLocalCoordinates(vector2);
        return vector2;
    }

    public void toBack() {
        setZIndex(0);
    }

    public void toFront() {
        setZIndex(Integer.MAX_VALUE);
    }

    public String toString() {
        String str = this.name;
        if (str != null) {
            return str;
        }
        String name = getClass().getName();
        int iLastIndexOf = name.lastIndexOf(46);
        return iLastIndexOf != -1 ? name.substring(iLastIndexOf + 1) : name;
    }

    public boolean clipBegin(float f, float f2, float f3, float f4) {
        Stage stage;
        if (f3 <= 0.0f || f4 <= 0.0f || (stage = this.stage) == null) {
            return false;
        }
        Rectangle rectangle = Rectangle.tmp;
        rectangle.x = f;
        rectangle.y = f2;
        rectangle.width = f3;
        rectangle.height = f4;
        Rectangle rectangle2 = (Rectangle) Pools.obtain(Rectangle.class);
        stage.calculateScissors(rectangle, rectangle2);
        if (ScissorStack.pushScissors(rectangle2)) {
            return true;
        }
        Pools.free(rectangle2);
        return false;
    }

    public float getX(int i) {
        float f = this.x;
        if ((i & 16) != 0) {
            return f + this.width;
        }
        return (i & 8) == 0 ? f + (this.width / 2.0f) : f;
    }

    public float getY(int i) {
        float f = this.y;
        if ((i & 2) != 0) {
            return f + this.height;
        }
        return (i & 4) == 0 ? f + (this.height / 2.0f) : f;
    }

    public void setColor(float f, float f2, float f3, float f4) {
        this.color.set(f, f2, f3, f4);
    }

    public void setOrigin(int i) {
        if ((i & 8) != 0) {
            this.originX = 0.0f;
        } else if ((i & 16) != 0) {
            this.originX = this.width;
        } else {
            this.originX = this.width / 2.0f;
        }
        if ((i & 4) != 0) {
            this.originY = 0.0f;
        } else if ((i & 2) != 0) {
            this.originY = this.height;
        } else {
            this.originY = this.height / 2.0f;
        }
    }

    public void scaleBy(float f, float f2) {
        if (f == 0.0f && f2 == 0.0f) {
            return;
        }
        this.scaleX += f;
        this.scaleY += f2;
        scaleChanged();
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0018  */
    /* JADX WARN: Code duplicated, block: B:13:? A[RETURN, SYNTHETIC] */
    public void setX(float f, int i) {
        float f2;
        if ((i & 16) == 0) {
            if ((i & 8) == 0) {
                f2 = this.width / 2.0f;
            }
            if (this.x != f) {
                this.x = f;
                positionChanged();
            }
        }
        f2 = this.width;
        f -= f2;
        if (this.x != f) {
            this.x = f;
            positionChanged();
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0018  */
    /* JADX WARN: Code duplicated, block: B:13:? A[RETURN, SYNTHETIC] */
    public void setY(float f, int i) {
        float f2;
        if ((i & 2) == 0) {
            if ((i & 4) == 0) {
                f2 = this.height / 2.0f;
            }
            if (this.y != f) {
                this.y = f;
                positionChanged();
            }
        }
        f2 = this.height;
        f -= f2;
        if (this.y != f) {
            this.y = f;
            positionChanged();
        }
    }

    public void sizeBy(float f, float f2) {
        if (f == 0.0f && f2 == 0.0f) {
            return;
        }
        this.width += f;
        this.height += f2;
        sizeChanged();
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0016  */
    /* JADX WARN: Code duplicated, block: B:13:0x001a  */
    /* JADX WARN: Code duplicated, block: B:15:0x001e  */
    /* JADX WARN: Code duplicated, block: B:18:0x0028  */
    public void setPosition(float f, float f2, int i) {
        float f3;
        float f4;
        if ((i & 16) != 0) {
            f3 = this.width;
        } else {
            if ((i & 8) == 0) {
                f3 = this.width / 2.0f;
            }
            if ((i & 2) == 0) {
                if ((i & 4) == 0) {
                    f4 = this.height / 2.0f;
                }
                if (this.x == f || this.y != f2) {
                    this.x = f;
                    this.y = f2;
                    positionChanged();
                }
                return;
            }
            f4 = this.height;
            f2 -= f4;
            if (this.x == f) {
            }
            this.x = f;
            this.y = f2;
            positionChanged();
        }
        f -= f3;
        if ((i & 2) == 0) {
            f4 = this.height;
        } else {
            if ((i & 4) == 0) {
                f4 = this.height / 2.0f;
            }
            if (this.x == f) {
            }
            this.x = f;
            this.y = f2;
            positionChanged();
        }
        f2 -= f4;
        if (this.x == f) {
        }
        this.x = f;
        this.y = f2;
        positionChanged();
    }

    public void setScale(float f, float f2) {
        if (this.scaleX == f && this.scaleY == f2) {
            return;
        }
        this.scaleX = f;
        this.scaleY = f2;
        scaleChanged();
    }
}
