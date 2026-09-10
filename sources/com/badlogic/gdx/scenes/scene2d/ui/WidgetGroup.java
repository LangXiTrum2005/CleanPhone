package com.badlogic.gdx.scenes.scene2d.ui;

import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.scenes.scene2d.Actor;
import com.badlogic.gdx.scenes.scene2d.Group;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.utils.Layout;
import com.badlogic.gdx.utils.SnapshotArray;

/* JADX INFO: loaded from: classes.dex */
public class WidgetGroup extends Group implements Layout {
    private boolean fillParent;
    private boolean needsLayout = true;
    private boolean layoutEnabled = true;

    public WidgetGroup() {
    }

    @Override // com.badlogic.gdx.scenes.scene2d.Group
    public void childrenChanged() {
        invalidateHierarchy();
    }

    @Override // com.badlogic.gdx.scenes.scene2d.Group, com.badlogic.gdx.scenes.scene2d.Actor
    public void draw(Batch batch, float f) {
        validate();
        super.draw(batch, f);
    }

    public float getMaxHeight() {
        return 0.0f;
    }

    public float getMaxWidth() {
        return 0.0f;
    }

    public float getMinHeight() {
        return getPrefHeight();
    }

    public float getMinWidth() {
        return getPrefWidth();
    }

    public float getPrefHeight() {
        return 0.0f;
    }

    public float getPrefWidth() {
        return 0.0f;
    }

    @Override // com.badlogic.gdx.scenes.scene2d.Group, com.badlogic.gdx.scenes.scene2d.Actor
    public Actor hit(float f, float f2, boolean z) {
        validate();
        return super.hit(f, f2, z);
    }

    public void invalidate() {
        this.needsLayout = true;
    }

    @Override // com.badlogic.gdx.scenes.scene2d.utils.Layout
    public void invalidateHierarchy() {
        invalidate();
        Object parent = getParent();
        if (parent instanceof Layout) {
            ((Layout) parent).invalidateHierarchy();
        }
    }

    public void layout() {
    }

    public boolean needsLayout() {
        return this.needsLayout;
    }

    @Override // com.badlogic.gdx.scenes.scene2d.utils.Layout
    public void pack() {
        setSize(getPrefWidth(), getPrefHeight());
        validate();
        setSize(getPrefWidth(), getPrefHeight());
        validate();
    }

    @Override // com.badlogic.gdx.scenes.scene2d.utils.Layout
    public void setFillParent(boolean z) {
        this.fillParent = z;
    }

    @Override // com.badlogic.gdx.scenes.scene2d.utils.Layout
    public void setLayoutEnabled(boolean z) {
        this.layoutEnabled = z;
        setLayoutEnabled(this, z);
    }

    @Override // com.badlogic.gdx.scenes.scene2d.Actor
    public void sizeChanged() {
        invalidate();
    }

    @Override // com.badlogic.gdx.scenes.scene2d.utils.Layout
    public void validate() {
        if (this.layoutEnabled) {
            Group parent = getParent();
            if (this.fillParent && parent != null) {
                Stage stage = getStage();
                if (stage == null || parent != stage.getRoot()) {
                    setSize(parent.getWidth(), parent.getHeight());
                } else {
                    setSize(stage.getWidth(), stage.getHeight());
                }
            }
            if (this.needsLayout) {
                this.needsLayout = false;
                layout();
                if (!this.needsLayout || (parent instanceof WidgetGroup)) {
                    return;
                }
                for (int i = 0; i < 5; i++) {
                    this.needsLayout = false;
                    layout();
                    if (!this.needsLayout) {
                        return;
                    }
                }
            }
        }
    }

    private void setLayoutEnabled(Group group, boolean z) {
        SnapshotArray<Actor> children = group.getChildren();
        int i = children.size;
        for (int i2 = 0; i2 < i; i2++) {
            Object obj = (Actor) children.get(i2);
            if (obj instanceof Layout) {
                ((Layout) obj).setLayoutEnabled(z);
            } else if (obj instanceof Group) {
                setLayoutEnabled((Group) obj, z);
            }
        }
    }

    public WidgetGroup(Actor... actorArr) {
        for (Actor actor : actorArr) {
            addActor(actor);
        }
    }
}
