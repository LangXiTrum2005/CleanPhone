package com.badlogic.gdx.scenes.scene2d;

import com.badlogic.gdx.Application;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.InputAdapter;
import com.badlogic.gdx.graphics.Camera;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.badlogic.gdx.math.Matrix4;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.scenes.scene2d.ui.Table;
import com.badlogic.gdx.scenes.scene2d.utils.FocusListener;
import com.badlogic.gdx.utils.Array;
import com.badlogic.gdx.utils.Disposable;
import com.badlogic.gdx.utils.Null;
import com.badlogic.gdx.utils.Pool;
import com.badlogic.gdx.utils.Pools;
import com.badlogic.gdx.utils.Scaling;
import com.badlogic.gdx.utils.SnapshotArray;
import com.badlogic.gdx.utils.viewport.ScalingViewport;
import com.badlogic.gdx.utils.viewport.Viewport;

/* JADX INFO: loaded from: classes.dex */
public class Stage extends InputAdapter implements Disposable {
    static boolean debug;
    private boolean actionsRequestRendering;
    private final Batch batch;
    private boolean debugAll;
    private final Color debugColor;
    private boolean debugInvisible;
    private boolean debugParentUnderMouse;
    private ShapeRenderer debugShapes;
    private Table.Debug debugTableUnderMouse;
    private boolean debugUnderMouse;

    @Null
    private Actor keyboardFocus;

    @Null
    private Actor mouseOverActor;
    private int mouseScreenX;
    private int mouseScreenY;
    private boolean ownsBatch;
    private final Actor[] pointerOverActors;
    private final int[] pointerScreenX;
    private final int[] pointerScreenY;
    private final boolean[] pointerTouched;
    private Group root;

    @Null
    private Actor scrollFocus;
    private final Vector2 tempCoords;
    final SnapshotArray<TouchFocus> touchFocuses;
    private Viewport viewport;

    public static final class TouchFocus implements Pool.Poolable {
        int button;
        EventListener listener;
        Actor listenerActor;
        int pointer;
        Actor target;

        @Override // com.badlogic.gdx.utils.Pool.Poolable
        public void reset() {
            this.listenerActor = null;
            this.listener = null;
            this.target = null;
        }
    }

    public Stage() {
        this(new ScalingViewport(Scaling.stretch, Gdx.graphics.getWidth(), Gdx.graphics.getHeight(), new OrthographicCamera()), new SpriteBatch());
        this.ownsBatch = true;
    }

    private void disableDebug(Actor actor, Actor actor2) {
        if (actor == actor2) {
            return;
        }
        actor.setDebug(false);
        if (actor instanceof Group) {
            SnapshotArray<Actor> snapshotArray = ((Group) actor).children;
            int i = snapshotArray.size;
            for (int i2 = 0; i2 < i; i2++) {
                disableDebug(snapshotArray.get(i2), actor2);
            }
        }
    }

    private void drawDebug() {
        Group group;
        if (this.debugShapes == null) {
            ShapeRenderer shapeRenderer = new ShapeRenderer();
            this.debugShapes = shapeRenderer;
            shapeRenderer.setAutoShapeType(true);
        }
        if (this.debugUnderMouse || this.debugParentUnderMouse || this.debugTableUnderMouse != Table.Debug.none) {
            screenToStageCoordinates(this.tempCoords.set(Gdx.input.getX(), Gdx.input.getY()));
            Vector2 vector2 = this.tempCoords;
            Actor actorHit = hit(vector2.x, vector2.y, true);
            if (actorHit == null) {
                return;
            }
            if (this.debugParentUnderMouse && (group = actorHit.parent) != null) {
                actorHit = group;
            }
            if (this.debugTableUnderMouse == Table.Debug.none) {
                actorHit.setDebug(true);
            } else {
                while (actorHit != null && !(actorHit instanceof Table)) {
                    actorHit = actorHit.parent;
                }
                if (actorHit == null) {
                    return;
                } else {
                    ((Table) actorHit).debug(this.debugTableUnderMouse);
                }
            }
            if (this.debugAll && (actorHit instanceof Group)) {
                ((Group) actorHit).debugAll();
            }
            disableDebug(this.root, actorHit);
        } else if (this.debugAll) {
            this.root.debugAll();
        }
        Gdx.gl.glEnable(GL20.GL_BLEND);
        this.debugShapes.setProjectionMatrix(this.viewport.getCamera().combined);
        this.debugShapes.begin();
        this.root.drawDebug(this.debugShapes);
        this.debugShapes.end();
        Gdx.gl.glDisable(GL20.GL_BLEND);
    }

    @Null
    private Actor fireEnterAndExit(@Null Actor actor, int i, int i2, int i3) {
        screenToStageCoordinates(this.tempCoords.set(i, i2));
        Vector2 vector2 = this.tempCoords;
        Actor actorHit = hit(vector2.x, vector2.y, true);
        if (actorHit == actor) {
            return actor;
        }
        if (actor != null) {
            InputEvent inputEvent = (InputEvent) Pools.obtain(InputEvent.class);
            inputEvent.setType(InputEvent.Type.exit);
            inputEvent.setStage(this);
            inputEvent.setStageX(this.tempCoords.x);
            inputEvent.setStageY(this.tempCoords.y);
            inputEvent.setPointer(i3);
            inputEvent.setRelatedActor(actorHit);
            actor.fire(inputEvent);
            Pools.free(inputEvent);
        }
        if (actorHit != null) {
            InputEvent inputEvent2 = (InputEvent) Pools.obtain(InputEvent.class);
            inputEvent2.setType(InputEvent.Type.enter);
            inputEvent2.setStage(this);
            inputEvent2.setStageX(this.tempCoords.x);
            inputEvent2.setStageY(this.tempCoords.y);
            inputEvent2.setPointer(i3);
            inputEvent2.setRelatedActor(actor);
            actorHit.fire(inputEvent2);
            Pools.free(inputEvent2);
        }
        return actorHit;
    }

    private void fireExit(Actor actor, int i, int i2, int i3) {
        screenToStageCoordinates(this.tempCoords.set(i, i2));
        InputEvent inputEvent = (InputEvent) Pools.obtain(InputEvent.class);
        inputEvent.setType(InputEvent.Type.exit);
        inputEvent.setStage(this);
        inputEvent.setStageX(this.tempCoords.x);
        inputEvent.setStageY(this.tempCoords.y);
        inputEvent.setPointer(i3);
        inputEvent.setRelatedActor(actor);
        actor.fire(inputEvent);
        Pools.free(inputEvent);
    }

    public void act() {
        act(Math.min(Gdx.graphics.getDeltaTime(), 0.033333335f));
    }

    public void actorRemoved(Actor actor) {
        int length = this.pointerOverActors.length;
        for (int i = 0; i < length; i++) {
            Actor[] actorArr = this.pointerOverActors;
            if (actor == actorArr[i]) {
                actorArr[i] = null;
                fireExit(actor, this.pointerScreenX[i], this.pointerScreenY[i], i);
            }
        }
        if (actor == this.mouseOverActor) {
            this.mouseOverActor = null;
            fireExit(actor, this.mouseScreenX, this.mouseScreenY, -1);
        }
    }

    public void addAction(Action action) {
        this.root.addAction(action);
    }

    public void addActor(Actor actor) {
        this.root.addActor(actor);
    }

    public boolean addCaptureListener(EventListener eventListener) {
        return this.root.addCaptureListener(eventListener);
    }

    public boolean addListener(EventListener eventListener) {
        return this.root.addListener(eventListener);
    }

    public void addTouchFocus(EventListener eventListener, Actor actor, Actor actor2, int i, int i2) {
        TouchFocus touchFocus = (TouchFocus) Pools.obtain(TouchFocus.class);
        touchFocus.listenerActor = actor;
        touchFocus.target = actor2;
        touchFocus.listener = eventListener;
        touchFocus.pointer = i;
        touchFocus.button = i2;
        this.touchFocuses.add(touchFocus);
    }

    public void calculateScissors(Rectangle rectangle, Rectangle rectangle2) {
        ShapeRenderer shapeRenderer = this.debugShapes;
        this.viewport.calculateScissors((shapeRenderer == null || !shapeRenderer.isDrawing()) ? this.batch.getTransformMatrix() : this.debugShapes.getTransformMatrix(), rectangle, rectangle2);
    }

    public void cancelTouchFocus(Actor actor) {
        SnapshotArray<TouchFocus> snapshotArray = this.touchFocuses;
        TouchFocus[] touchFocusArrBegin = snapshotArray.begin();
        int i = snapshotArray.size;
        InputEvent inputEvent = null;
        for (int i2 = 0; i2 < i; i2++) {
            TouchFocus touchFocus = touchFocusArrBegin[i2];
            if (touchFocus.listenerActor == actor && snapshotArray.removeValue(touchFocus, true)) {
                if (inputEvent == null) {
                    inputEvent = (InputEvent) Pools.obtain(InputEvent.class);
                    inputEvent.setType(InputEvent.Type.touchUp);
                    inputEvent.setStage(this);
                    inputEvent.setStageX(-2.1474836E9f);
                    inputEvent.setStageY(-2.1474836E9f);
                }
                inputEvent.setTarget(touchFocus.target);
                inputEvent.setListenerActor(touchFocus.listenerActor);
                inputEvent.setPointer(touchFocus.pointer);
                inputEvent.setButton(touchFocus.button);
                touchFocus.listener.handle(inputEvent);
            }
        }
        snapshotArray.end();
        if (inputEvent != null) {
            Pools.free(inputEvent);
        }
    }

    public void cancelTouchFocusExcept(@Null EventListener eventListener, @Null Actor actor) {
        InputEvent inputEvent = (InputEvent) Pools.obtain(InputEvent.class);
        inputEvent.setType(InputEvent.Type.touchUp);
        inputEvent.setStage(this);
        inputEvent.setStageX(-2.1474836E9f);
        inputEvent.setStageY(-2.1474836E9f);
        SnapshotArray<TouchFocus> snapshotArray = this.touchFocuses;
        TouchFocus[] touchFocusArrBegin = snapshotArray.begin();
        int i = snapshotArray.size;
        for (int i2 = 0; i2 < i; i2++) {
            TouchFocus touchFocus = touchFocusArrBegin[i2];
            if ((touchFocus.listener != eventListener || touchFocus.listenerActor != actor) && snapshotArray.removeValue(touchFocus, true)) {
                inputEvent.setTarget(touchFocus.target);
                inputEvent.setListenerActor(touchFocus.listenerActor);
                inputEvent.setPointer(touchFocus.pointer);
                inputEvent.setButton(touchFocus.button);
                touchFocus.listener.handle(inputEvent);
            }
        }
        snapshotArray.end();
        Pools.free(inputEvent);
    }

    public void clear() {
        unfocusAll();
        this.root.clear();
    }

    @Override // com.badlogic.gdx.utils.Disposable
    public void dispose() {
        clear();
        if (this.ownsBatch) {
            this.batch.dispose();
        }
        ShapeRenderer shapeRenderer = this.debugShapes;
        if (shapeRenderer != null) {
            shapeRenderer.dispose();
        }
    }

    public void draw() {
        Camera camera = this.viewport.getCamera();
        camera.update();
        if (this.root.isVisible()) {
            Batch batch = this.batch;
            batch.setProjectionMatrix(camera.combined);
            batch.begin();
            this.root.draw(batch, 1.0f);
            batch.end();
            if (debug) {
                drawDebug();
            }
        }
    }

    public boolean getActionsRequestRendering() {
        return this.actionsRequestRendering;
    }

    public Array<Actor> getActors() {
        return this.root.children;
    }

    public Batch getBatch() {
        return this.batch;
    }

    public Camera getCamera() {
        return this.viewport.getCamera();
    }

    public Color getDebugColor() {
        return this.debugColor;
    }

    public float getHeight() {
        return this.viewport.getWorldHeight();
    }

    @Null
    public Actor getKeyboardFocus() {
        return this.keyboardFocus;
    }

    public Group getRoot() {
        return this.root;
    }

    @Null
    public Actor getScrollFocus() {
        return this.scrollFocus;
    }

    public Viewport getViewport() {
        return this.viewport;
    }

    public float getWidth() {
        return this.viewport.getWorldWidth();
    }

    @Null
    public Actor hit(float f, float f2, boolean z) {
        this.root.parentToLocalCoordinates(this.tempCoords.set(f, f2));
        Group group = this.root;
        Vector2 vector2 = this.tempCoords;
        return group.hit(vector2.x, vector2.y, z);
    }

    public boolean isDebugAll() {
        return this.debugAll;
    }

    public boolean isInsideViewport(int i, int i2) {
        int screenX = this.viewport.getScreenX();
        int screenWidth = this.viewport.getScreenWidth() + screenX;
        int screenY = this.viewport.getScreenY();
        int screenHeight = this.viewport.getScreenHeight() + screenY;
        int height = (Gdx.graphics.getHeight() - 1) - i2;
        return i >= screenX && i < screenWidth && height >= screenY && height < screenHeight;
    }

    @Override // com.badlogic.gdx.InputAdapter, com.badlogic.gdx.InputProcessor
    public boolean keyDown(int i) {
        Actor actor = this.keyboardFocus;
        if (actor == null) {
            actor = this.root;
        }
        InputEvent inputEvent = (InputEvent) Pools.obtain(InputEvent.class);
        inputEvent.setType(InputEvent.Type.keyDown);
        inputEvent.setStage(this);
        inputEvent.setKeyCode(i);
        actor.fire(inputEvent);
        boolean zIsHandled = inputEvent.isHandled();
        Pools.free(inputEvent);
        return zIsHandled;
    }

    @Override // com.badlogic.gdx.InputAdapter, com.badlogic.gdx.InputProcessor
    public boolean keyTyped(char c) {
        Actor actor = this.keyboardFocus;
        if (actor == null) {
            actor = this.root;
        }
        InputEvent inputEvent = (InputEvent) Pools.obtain(InputEvent.class);
        inputEvent.setType(InputEvent.Type.keyTyped);
        inputEvent.setStage(this);
        inputEvent.setCharacter(c);
        actor.fire(inputEvent);
        boolean zIsHandled = inputEvent.isHandled();
        Pools.free(inputEvent);
        return zIsHandled;
    }

    @Override // com.badlogic.gdx.InputAdapter, com.badlogic.gdx.InputProcessor
    public boolean keyUp(int i) {
        Actor actor = this.keyboardFocus;
        if (actor == null) {
            actor = this.root;
        }
        InputEvent inputEvent = (InputEvent) Pools.obtain(InputEvent.class);
        inputEvent.setType(InputEvent.Type.keyUp);
        inputEvent.setStage(this);
        inputEvent.setKeyCode(i);
        actor.fire(inputEvent);
        boolean zIsHandled = inputEvent.isHandled();
        Pools.free(inputEvent);
        return zIsHandled;
    }

    @Override // com.badlogic.gdx.InputAdapter, com.badlogic.gdx.InputProcessor
    public boolean mouseMoved(int i, int i2) {
        this.mouseScreenX = i;
        this.mouseScreenY = i2;
        if (!isInsideViewport(i, i2)) {
            return false;
        }
        screenToStageCoordinates(this.tempCoords.set(i, i2));
        InputEvent inputEvent = (InputEvent) Pools.obtain(InputEvent.class);
        inputEvent.setType(InputEvent.Type.mouseMoved);
        inputEvent.setStage(this);
        inputEvent.setStageX(this.tempCoords.x);
        inputEvent.setStageY(this.tempCoords.y);
        Vector2 vector2 = this.tempCoords;
        Actor actorHit = hit(vector2.x, vector2.y, true);
        if (actorHit == null) {
            actorHit = this.root;
        }
        actorHit.fire(inputEvent);
        boolean zIsHandled = inputEvent.isHandled();
        Pools.free(inputEvent);
        return zIsHandled;
    }

    public boolean removeCaptureListener(EventListener eventListener) {
        return this.root.removeCaptureListener(eventListener);
    }

    public boolean removeListener(EventListener eventListener) {
        return this.root.removeListener(eventListener);
    }

    public void removeTouchFocus(EventListener eventListener, Actor actor, Actor actor2, int i, int i2) {
        SnapshotArray<TouchFocus> snapshotArray = this.touchFocuses;
        for (int i3 = snapshotArray.size - 1; i3 >= 0; i3--) {
            TouchFocus touchFocus = snapshotArray.get(i3);
            if (touchFocus.listener == eventListener && touchFocus.listenerActor == actor && touchFocus.target == actor2 && touchFocus.pointer == i && touchFocus.button == i2) {
                snapshotArray.removeIndex(i3);
                Pools.free(touchFocus);
            }
        }
    }

    public Vector2 screenToStageCoordinates(Vector2 vector2) {
        this.viewport.unproject(vector2);
        return vector2;
    }

    @Override // com.badlogic.gdx.InputAdapter, com.badlogic.gdx.InputProcessor
    public boolean scrolled(float f, float f2) {
        Actor actor = this.scrollFocus;
        if (actor == null) {
            actor = this.root;
        }
        screenToStageCoordinates(this.tempCoords.set(this.mouseScreenX, this.mouseScreenY));
        InputEvent inputEvent = (InputEvent) Pools.obtain(InputEvent.class);
        inputEvent.setType(InputEvent.Type.scrolled);
        inputEvent.setStage(this);
        inputEvent.setStageX(this.tempCoords.x);
        inputEvent.setStageY(this.tempCoords.y);
        inputEvent.setScrollAmountX(f);
        inputEvent.setScrollAmountY(f2);
        actor.fire(inputEvent);
        boolean zIsHandled = inputEvent.isHandled();
        Pools.free(inputEvent);
        return zIsHandled;
    }

    public void setActionsRequestRendering(boolean z) {
        this.actionsRequestRendering = z;
    }

    public void setDebugAll(boolean z) {
        if (this.debugAll == z) {
            return;
        }
        this.debugAll = z;
        if (z) {
            debug = true;
        } else {
            this.root.setDebug(false, true);
        }
    }

    public void setDebugInvisible(boolean z) {
        this.debugInvisible = z;
    }

    public void setDebugParentUnderMouse(boolean z) {
        if (this.debugParentUnderMouse == z) {
            return;
        }
        this.debugParentUnderMouse = z;
        if (z) {
            debug = true;
        } else {
            this.root.setDebug(false, true);
        }
    }

    public void setDebugTableUnderMouse(@Null Table.Debug debug2) {
        if (debug2 == null) {
            debug2 = Table.Debug.none;
        }
        if (this.debugTableUnderMouse == debug2) {
            return;
        }
        this.debugTableUnderMouse = debug2;
        if (debug2 != Table.Debug.none) {
            debug = true;
        } else {
            this.root.setDebug(false, true);
        }
    }

    public void setDebugUnderMouse(boolean z) {
        if (this.debugUnderMouse == z) {
            return;
        }
        this.debugUnderMouse = z;
        if (z) {
            debug = true;
        } else {
            this.root.setDebug(false, true);
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public boolean setKeyboardFocus(@Null Actor actor) {
        if (this.keyboardFocus == actor) {
            return true;
        }
        FocusListener.FocusEvent focusEvent = (FocusListener.FocusEvent) Pools.obtain(FocusListener.FocusEvent.class);
        focusEvent.setStage(this);
        focusEvent.setType(FocusListener.FocusEvent.Type.keyboard);
        Actor actor2 = this.keyboardFocus;
        if (actor2 != null) {
            focusEvent.setFocused(false);
            focusEvent.setRelatedActor(actor);
            actor2.fire(focusEvent);
        }
        boolean z = !focusEvent.isCancelled();
        if (z) {
            this.keyboardFocus = actor;
            if (actor != null) {
                focusEvent.setFocused(true);
                focusEvent.setRelatedActor(actor2);
                actor.fire(focusEvent);
                z = !focusEvent.isCancelled();
                if (!z) {
                    this.keyboardFocus = actor2;
                }
            }
        }
        Pools.free(focusEvent);
        return z;
    }

    public void setRoot(Group group) {
        Group group2 = group.parent;
        if (group2 != null) {
            group2.removeActor(group, false);
        }
        this.root = group;
        group.setParent(null);
        group.setStage(this);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public boolean setScrollFocus(@Null Actor actor) {
        if (this.scrollFocus == actor) {
            return true;
        }
        FocusListener.FocusEvent focusEvent = (FocusListener.FocusEvent) Pools.obtain(FocusListener.FocusEvent.class);
        focusEvent.setStage(this);
        focusEvent.setType(FocusListener.FocusEvent.Type.scroll);
        Actor actor2 = this.scrollFocus;
        if (actor2 != null) {
            focusEvent.setFocused(false);
            focusEvent.setRelatedActor(actor);
            actor2.fire(focusEvent);
        }
        boolean z = !focusEvent.isCancelled();
        if (z) {
            this.scrollFocus = actor;
            if (actor != null) {
                focusEvent.setFocused(true);
                focusEvent.setRelatedActor(actor2);
                actor.fire(focusEvent);
                z = !focusEvent.isCancelled();
                if (!z) {
                    this.scrollFocus = actor2;
                }
            }
        }
        Pools.free(focusEvent);
        return z;
    }

    public void setViewport(Viewport viewport) {
        this.viewport = viewport;
    }

    public Vector2 stageToScreenCoordinates(Vector2 vector2) {
        this.viewport.project(vector2);
        vector2.y = Gdx.graphics.getHeight() - vector2.y;
        return vector2;
    }

    public Vector2 toScreenCoordinates(Vector2 vector2, Matrix4 matrix4) {
        return this.viewport.toScreenCoordinates(vector2, matrix4);
    }

    @Override // com.badlogic.gdx.InputAdapter, com.badlogic.gdx.InputProcessor
    public boolean touchCancelled(int i, int i2, int i3, int i4) {
        cancelTouchFocus();
        return false;
    }

    @Override // com.badlogic.gdx.InputAdapter, com.badlogic.gdx.InputProcessor
    public boolean touchDown(int i, int i2, int i3, int i4) {
        if (!isInsideViewport(i, i2)) {
            return false;
        }
        this.pointerTouched[i3] = true;
        this.pointerScreenX[i3] = i;
        this.pointerScreenY[i3] = i2;
        screenToStageCoordinates(this.tempCoords.set(i, i2));
        InputEvent inputEvent = (InputEvent) Pools.obtain(InputEvent.class);
        inputEvent.setType(InputEvent.Type.touchDown);
        inputEvent.setStage(this);
        inputEvent.setStageX(this.tempCoords.x);
        inputEvent.setStageY(this.tempCoords.y);
        inputEvent.setPointer(i3);
        inputEvent.setButton(i4);
        Vector2 vector2 = this.tempCoords;
        Actor actorHit = hit(vector2.x, vector2.y, true);
        if (actorHit != null) {
            actorHit.fire(inputEvent);
        } else if (this.root.getTouchable() == Touchable.enabled) {
            this.root.fire(inputEvent);
        }
        boolean zIsHandled = inputEvent.isHandled();
        Pools.free(inputEvent);
        return zIsHandled;
    }

    @Override // com.badlogic.gdx.InputAdapter, com.badlogic.gdx.InputProcessor
    public boolean touchDragged(int i, int i2, int i3) {
        this.pointerScreenX[i3] = i;
        this.pointerScreenY[i3] = i2;
        this.mouseScreenX = i;
        this.mouseScreenY = i2;
        if (this.touchFocuses.size == 0) {
            return false;
        }
        screenToStageCoordinates(this.tempCoords.set(i, i2));
        InputEvent inputEvent = (InputEvent) Pools.obtain(InputEvent.class);
        inputEvent.setType(InputEvent.Type.touchDragged);
        inputEvent.setStage(this);
        inputEvent.setStageX(this.tempCoords.x);
        inputEvent.setStageY(this.tempCoords.y);
        inputEvent.setPointer(i3);
        SnapshotArray<TouchFocus> snapshotArray = this.touchFocuses;
        TouchFocus[] touchFocusArrBegin = snapshotArray.begin();
        int i4 = snapshotArray.size;
        for (int i5 = 0; i5 < i4; i5++) {
            TouchFocus touchFocus = touchFocusArrBegin[i5];
            if (touchFocus.pointer == i3 && snapshotArray.contains(touchFocus, true)) {
                inputEvent.setTarget(touchFocus.target);
                inputEvent.setListenerActor(touchFocus.listenerActor);
                if (touchFocus.listener.handle(inputEvent)) {
                    inputEvent.handle();
                }
            }
        }
        snapshotArray.end();
        boolean zIsHandled = inputEvent.isHandled();
        Pools.free(inputEvent);
        return zIsHandled;
    }

    @Override // com.badlogic.gdx.InputAdapter, com.badlogic.gdx.InputProcessor
    public boolean touchUp(int i, int i2, int i3, int i4) {
        this.pointerTouched[i3] = false;
        this.pointerScreenX[i3] = i;
        this.pointerScreenY[i3] = i2;
        if (this.touchFocuses.size == 0) {
            return false;
        }
        screenToStageCoordinates(this.tempCoords.set(i, i2));
        InputEvent inputEvent = (InputEvent) Pools.obtain(InputEvent.class);
        inputEvent.setType(InputEvent.Type.touchUp);
        inputEvent.setStage(this);
        inputEvent.setStageX(this.tempCoords.x);
        inputEvent.setStageY(this.tempCoords.y);
        inputEvent.setPointer(i3);
        inputEvent.setButton(i4);
        SnapshotArray<TouchFocus> snapshotArray = this.touchFocuses;
        TouchFocus[] touchFocusArrBegin = snapshotArray.begin();
        int i5 = snapshotArray.size;
        for (int i6 = 0; i6 < i5; i6++) {
            TouchFocus touchFocus = touchFocusArrBegin[i6];
            if (touchFocus.pointer == i3 && touchFocus.button == i4 && snapshotArray.removeValue(touchFocus, true)) {
                inputEvent.setTarget(touchFocus.target);
                inputEvent.setListenerActor(touchFocus.listenerActor);
                if (touchFocus.listener.handle(inputEvent)) {
                    inputEvent.handle();
                }
                Pools.free(touchFocus);
            }
        }
        snapshotArray.end();
        boolean zIsHandled = inputEvent.isHandled();
        Pools.free(inputEvent);
        return zIsHandled;
    }

    public void unfocus(Actor actor) {
        cancelTouchFocus(actor);
        Actor actor2 = this.scrollFocus;
        if (actor2 != null && actor2.isDescendantOf(actor)) {
            setScrollFocus(null);
        }
        Actor actor3 = this.keyboardFocus;
        if (actor3 == null || !actor3.isDescendantOf(actor)) {
            return;
        }
        setKeyboardFocus(null);
    }

    public void unfocusAll() {
        setScrollFocus(null);
        setKeyboardFocus(null);
        cancelTouchFocus();
    }

    public void act(float f) {
        int length = this.pointerOverActors.length;
        for (int i = 0; i < length; i++) {
            Actor[] actorArr = this.pointerOverActors;
            Actor actor = actorArr[i];
            if (this.pointerTouched[i]) {
                actorArr[i] = fireEnterAndExit(actor, this.pointerScreenX[i], this.pointerScreenY[i], i);
            } else if (actor != null) {
                actorArr[i] = null;
                fireExit(actor, this.pointerScreenX[i], this.pointerScreenY[i], i);
            }
        }
        Application.ApplicationType type = Gdx.app.getType();
        if (type == Application.ApplicationType.Desktop || type == Application.ApplicationType.Applet || type == Application.ApplicationType.WebGL) {
            this.mouseOverActor = fireEnterAndExit(this.mouseOverActor, this.mouseScreenX, this.mouseScreenY, -1);
        }
        this.root.act(f);
    }

    public Stage(Viewport viewport) {
        this(viewport, new SpriteBatch());
        this.ownsBatch = true;
    }

    public Stage(Viewport viewport, Batch batch) {
        this.tempCoords = new Vector2();
        this.pointerOverActors = new Actor[20];
        this.pointerTouched = new boolean[20];
        this.pointerScreenX = new int[20];
        this.pointerScreenY = new int[20];
        this.touchFocuses = new SnapshotArray<>(true, 4, TouchFocus.class);
        this.actionsRequestRendering = true;
        this.debugTableUnderMouse = Table.Debug.none;
        this.debugColor = new Color(0.0f, 1.0f, 0.0f, 0.85f);
        if (viewport == null) {
            throw new IllegalArgumentException("viewport cannot be null.");
        }
        if (batch != null) {
            this.viewport = viewport;
            this.batch = batch;
            Group group = new Group();
            this.root = group;
            group.setStage(this);
            viewport.update(Gdx.graphics.getWidth(), Gdx.graphics.getHeight(), true);
            return;
        }
        throw new IllegalArgumentException("batch cannot be null.");
    }

    public void setDebugTableUnderMouse(boolean z) {
        setDebugTableUnderMouse(z ? Table.Debug.all : Table.Debug.none);
    }

    public void cancelTouchFocus() {
        cancelTouchFocusExcept(null, null);
    }
}
