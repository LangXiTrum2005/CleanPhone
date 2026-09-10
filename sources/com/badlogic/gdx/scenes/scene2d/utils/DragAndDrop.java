package com.badlogic.gdx.scenes.scene2d.utils;

import androidx.recyclerview.widget.ItemTouchHelper;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.scenes.scene2d.Actor;
import com.badlogic.gdx.scenes.scene2d.EventListener;
import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.utils.Array;
import com.badlogic.gdx.utils.Null;
import com.badlogic.gdx.utils.ObjectMap;

/* JADX INFO: loaded from: classes.dex */
public class DragAndDrop {
    static final Vector2 tmpVector = new Vector2();
    private int button;
    Actor dragActor;
    Source dragSource;
    long dragValidTime;
    boolean isValidTarget;
    Payload payload;
    boolean removeDragActor;
    Target target;
    float touchOffsetX;
    float touchOffsetY;
    final Array<Target> targets = new Array<>(8);
    final ObjectMap<Source, DragListener> sourceListeners = new ObjectMap<>(8);
    private float tapSquareSize = 8.0f;
    float dragActorX = 0.0f;
    float dragActorY = 0.0f;
    int dragTime = ItemTouchHelper.Callback.DEFAULT_SWIPE_ANIMATION_DURATION;
    int activePointer = -1;
    boolean cancelTouchFocus = true;
    boolean keepWithinStage = true;

    public static class Payload {

        @Null
        Actor dragActor;

        @Null
        Actor invalidDragActor;

        @Null
        Object object;

        @Null
        Actor validDragActor;

        @Null
        public Actor getDragActor() {
            return this.dragActor;
        }

        @Null
        public Actor getInvalidDragActor() {
            return this.invalidDragActor;
        }

        @Null
        public Object getObject() {
            return this.object;
        }

        @Null
        public Actor getValidDragActor() {
            return this.validDragActor;
        }

        public void setDragActor(@Null Actor actor) {
            this.dragActor = actor;
        }

        public void setInvalidDragActor(@Null Actor actor) {
            this.invalidDragActor = actor;
        }

        public void setObject(@Null Object obj) {
            this.object = obj;
        }

        public void setValidDragActor(@Null Actor actor) {
            this.validDragActor = actor;
        }
    }

    public static abstract class Source {
        final Actor actor;

        public Source(Actor actor) {
            if (actor == null) {
                throw new IllegalArgumentException("actor cannot be null.");
            }
            this.actor = actor;
        }

        public void drag(InputEvent inputEvent, float f, float f2, int i) {
        }

        @Null
        public abstract Payload dragStart(InputEvent inputEvent, float f, float f2, int i);

        public void dragStop(InputEvent inputEvent, float f, float f2, int i, @Null Payload payload, @Null Target target) {
        }

        public Actor getActor() {
            return this.actor;
        }
    }

    public static abstract class Target {
        final Actor actor;

        public Target(Actor actor) {
            if (actor == null) {
                throw new IllegalArgumentException("actor cannot be null.");
            }
            this.actor = actor;
            Stage stage = actor.getStage();
            if (stage != null && actor == stage.getRoot()) {
                throw new IllegalArgumentException("The stage root cannot be a drag and drop target.");
            }
        }

        public abstract boolean drag(Source source, Payload payload, float f, float f2, int i);

        public abstract void drop(Source source, Payload payload, float f, float f2, int i);

        public Actor getActor() {
            return this.actor;
        }

        public void reset(Source source, Payload payload) {
        }
    }

    public void addSource(final Source source) {
        DragListener dragListener = new DragListener() { // from class: com.badlogic.gdx.scenes.scene2d.utils.DragAndDrop.1
            @Override // com.badlogic.gdx.scenes.scene2d.utils.DragListener
            public void drag(InputEvent inputEvent, float f, float f2, int i) {
                float x;
                float y;
                Target target;
                DragAndDrop dragAndDrop = DragAndDrop.this;
                if (dragAndDrop.payload != null && i == dragAndDrop.activePointer) {
                    source.drag(inputEvent, f, f2, i);
                    Stage stage = inputEvent.getStage();
                    Actor actor = DragAndDrop.this.dragActor;
                    if (actor != null) {
                        x = actor.getX();
                        y = actor.getY();
                        actor.setPosition(2.1474836E9f, 2.1474836E9f);
                    } else {
                        x = 0.0f;
                        y = 0.0f;
                    }
                    float stageX = inputEvent.getStageX() + DragAndDrop.this.touchOffsetX;
                    float stageY = inputEvent.getStageY() + DragAndDrop.this.touchOffsetY;
                    Actor actorHit = inputEvent.getStage().hit(stageX, stageY, true);
                    if (actorHit == null) {
                        actorHit = inputEvent.getStage().hit(stageX, stageY, false);
                    }
                    if (actor != null) {
                        actor.setPosition(x, y);
                    }
                    DragAndDrop dragAndDrop2 = DragAndDrop.this;
                    dragAndDrop2.isValidTarget = false;
                    Actor actor2 = null;
                    if (actorHit == null) {
                        target = null;
                        break;
                    }
                    int i2 = dragAndDrop2.targets.size;
                    int i3 = 0;
                    while (true) {
                        if (i3 >= i2) {
                            target = null;
                            break;
                        }
                        Target target2 = DragAndDrop.this.targets.get(i3);
                        if (target2.actor.isAscendantOf(actorHit)) {
                            target2.actor.stageToLocalCoordinates(DragAndDrop.tmpVector.set(stageX, stageY));
                            target = target2;
                            break;
                        }
                        i3++;
                    }
                    DragAndDrop dragAndDrop3 = DragAndDrop.this;
                    Target target3 = dragAndDrop3.target;
                    if (target != target3) {
                        if (target3 != null) {
                            target3.reset(source, dragAndDrop3.payload);
                        }
                        DragAndDrop.this.target = target;
                    }
                    if (target != null) {
                        DragAndDrop dragAndDrop4 = DragAndDrop.this;
                        Source source2 = source;
                        Payload payload = dragAndDrop4.payload;
                        Vector2 vector2 = DragAndDrop.tmpVector;
                        dragAndDrop4.isValidTarget = target.drag(source2, payload, vector2.x, vector2.y, i);
                    }
                    DragAndDrop dragAndDrop5 = DragAndDrop.this;
                    if (dragAndDrop5.target != null) {
                        actor2 = dragAndDrop5.isValidTarget ? dragAndDrop5.payload.validDragActor : dragAndDrop5.payload.invalidDragActor;
                    }
                    if (actor2 == null) {
                        actor2 = dragAndDrop5.payload.dragActor;
                    }
                    if (actor2 != actor) {
                        if (actor != null && dragAndDrop5.removeDragActor) {
                            actor.remove();
                        }
                        DragAndDrop dragAndDrop6 = DragAndDrop.this;
                        dragAndDrop6.dragActor = actor2;
                        dragAndDrop6.removeDragActor = actor2.getStage() == null;
                        if (DragAndDrop.this.removeDragActor) {
                            stage.addActor(actor2);
                        }
                    }
                    if (actor2 == null) {
                        return;
                    }
                    float stageX2 = (inputEvent.getStageX() - actor2.getWidth()) + DragAndDrop.this.dragActorX;
                    float stageY2 = inputEvent.getStageY();
                    DragAndDrop dragAndDrop7 = DragAndDrop.this;
                    float height = stageY2 + dragAndDrop7.dragActorY;
                    if (dragAndDrop7.keepWithinStage) {
                        if (stageX2 < 0.0f) {
                            stageX2 = 0.0f;
                        }
                        float f3 = height >= 0.0f ? height : 0.0f;
                        if (actor2.getWidth() + stageX2 > stage.getWidth()) {
                            stageX2 = stage.getWidth() - actor2.getWidth();
                        }
                        height = actor2.getHeight() + f3 > stage.getHeight() ? stage.getHeight() - actor2.getHeight() : f3;
                    }
                    actor2.setPosition(stageX2, height);
                }
            }

            @Override // com.badlogic.gdx.scenes.scene2d.utils.DragListener
            public void dragStart(InputEvent inputEvent, float f, float f2, int i) {
                Stage stage;
                DragAndDrop dragAndDrop = DragAndDrop.this;
                if (dragAndDrop.activePointer != -1) {
                    inputEvent.stop();
                    return;
                }
                dragAndDrop.activePointer = i;
                long jCurrentTimeMillis = System.currentTimeMillis();
                DragAndDrop dragAndDrop2 = DragAndDrop.this;
                dragAndDrop.dragValidTime = jCurrentTimeMillis + ((long) dragAndDrop2.dragTime);
                Source source2 = source;
                dragAndDrop2.dragSource = source2;
                dragAndDrop2.payload = source2.dragStart(inputEvent, getTouchDownX(), getTouchDownY(), i);
                inputEvent.stop();
                DragAndDrop dragAndDrop3 = DragAndDrop.this;
                if (!dragAndDrop3.cancelTouchFocus || dragAndDrop3.payload == null || (stage = source.getActor().getStage()) == null) {
                    return;
                }
                stage.cancelTouchFocusExcept(this, source.getActor());
            }

            @Override // com.badlogic.gdx.scenes.scene2d.utils.DragListener
            public void dragStop(InputEvent inputEvent, float f, float f2, int i) {
                DragAndDrop dragAndDrop = DragAndDrop.this;
                if (i != dragAndDrop.activePointer) {
                    return;
                }
                dragAndDrop.activePointer = -1;
                if (dragAndDrop.payload == null) {
                    return;
                }
                long jCurrentTimeMillis = System.currentTimeMillis();
                DragAndDrop dragAndDrop2 = DragAndDrop.this;
                if (jCurrentTimeMillis < dragAndDrop2.dragValidTime) {
                    dragAndDrop2.isValidTarget = false;
                } else if (!dragAndDrop2.isValidTarget && dragAndDrop2.target != null) {
                    float stageX = inputEvent.getStageX() + DragAndDrop.this.touchOffsetX;
                    float stageY = inputEvent.getStageY();
                    DragAndDrop dragAndDrop3 = DragAndDrop.this;
                    float f3 = stageY + dragAndDrop3.touchOffsetY;
                    Actor actor = dragAndDrop3.target.actor;
                    Vector2 vector2 = DragAndDrop.tmpVector;
                    actor.stageToLocalCoordinates(vector2.set(stageX, f3));
                    DragAndDrop dragAndDrop4 = DragAndDrop.this;
                    dragAndDrop4.isValidTarget = dragAndDrop4.target.drag(source, dragAndDrop4.payload, vector2.x, vector2.y, i);
                }
                DragAndDrop dragAndDrop5 = DragAndDrop.this;
                Actor actor2 = dragAndDrop5.dragActor;
                if (actor2 != null && dragAndDrop5.removeDragActor) {
                    actor2.remove();
                }
                if (DragAndDrop.this.isValidTarget) {
                    float stageX2 = inputEvent.getStageX() + DragAndDrop.this.touchOffsetX;
                    float stageY2 = inputEvent.getStageY();
                    DragAndDrop dragAndDrop6 = DragAndDrop.this;
                    float f4 = stageY2 + dragAndDrop6.touchOffsetY;
                    Actor actor3 = dragAndDrop6.target.actor;
                    Vector2 vector3 = DragAndDrop.tmpVector;
                    actor3.stageToLocalCoordinates(vector3.set(stageX2, f4));
                    DragAndDrop dragAndDrop7 = DragAndDrop.this;
                    dragAndDrop7.target.drop(source, dragAndDrop7.payload, vector3.x, vector3.y, i);
                }
                Source source2 = source;
                DragAndDrop dragAndDrop8 = DragAndDrop.this;
                source2.dragStop(inputEvent, f, f2, i, dragAndDrop8.payload, dragAndDrop8.isValidTarget ? dragAndDrop8.target : null);
                DragAndDrop dragAndDrop9 = DragAndDrop.this;
                Target target = dragAndDrop9.target;
                if (target != null) {
                    target.reset(source, dragAndDrop9.payload);
                }
                DragAndDrop dragAndDrop10 = DragAndDrop.this;
                dragAndDrop10.dragSource = null;
                dragAndDrop10.payload = null;
                dragAndDrop10.target = null;
                dragAndDrop10.isValidTarget = false;
                dragAndDrop10.dragActor = null;
            }
        };
        dragListener.setTapSquareSize(this.tapSquareSize);
        dragListener.setButton(this.button);
        source.actor.addCaptureListener(dragListener);
        this.sourceListeners.put(source, dragListener);
    }

    public void addTarget(Target target) {
        this.targets.add(target);
    }

    public void cancelTouchFocusExcept(Source source) {
        Stage stage;
        DragListener dragListener = this.sourceListeners.get(source);
        if (dragListener == null || (stage = source.getActor().getStage()) == null) {
            return;
        }
        stage.cancelTouchFocusExcept(dragListener, source.getActor());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void clear() {
        this.targets.clear();
        ObjectMap.Entries<Source, DragListener> it = this.sourceListeners.entries().iterator();
        while (it.hasNext()) {
            ObjectMap.Entry next = it.next();
            ((Source) next.key).actor.removeCaptureListener((EventListener) next.value);
        }
        this.sourceListeners.clear(8);
    }

    @Null
    public Actor getDragActor() {
        return this.dragActor;
    }

    @Null
    public Payload getDragPayload() {
        return this.payload;
    }

    @Null
    public Source getDragSource() {
        return this.dragSource;
    }

    public int getDragTime() {
        return this.dragTime;
    }

    public boolean isDragValid() {
        return this.payload != null && System.currentTimeMillis() >= this.dragValidTime;
    }

    public boolean isDragging() {
        return this.payload != null;
    }

    public void removeSource(Source source) {
        source.actor.removeCaptureListener(this.sourceListeners.remove(source));
    }

    public void removeTarget(Target target) {
        this.targets.removeValue(target, true);
    }

    public void setButton(int i) {
        this.button = i;
    }

    public void setCancelTouchFocus(boolean z) {
        this.cancelTouchFocus = z;
    }

    public void setDragActorPosition(float f, float f2) {
        this.dragActorX = f;
        this.dragActorY = f2;
    }

    public void setDragTime(int i) {
        this.dragTime = i;
    }

    public void setKeepWithinStage(boolean z) {
        this.keepWithinStage = z;
    }

    public void setTapSquareSize(float f) {
        this.tapSquareSize = f;
    }

    public void setTouchOffset(float f, float f2) {
        this.touchOffsetX = f;
        this.touchOffsetY = f2;
    }
}
