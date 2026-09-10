package com.badlogic.gdx.scenes.scene2d.ui;

import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.badlogic.gdx.scenes.scene2d.Actor;
import com.badlogic.gdx.scenes.scene2d.Touchable;
import com.badlogic.gdx.scenes.scene2d.utils.Layout;
import com.badlogic.gdx.utils.FloatArray;
import com.badlogic.gdx.utils.SnapshotArray;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.DM;

/* JADX INFO: loaded from: classes.dex */
public class VerticalGroup extends WidgetGroup {
    private int columnAlign;
    private FloatArray columnSizes;
    private boolean expand;
    private float fill;
    private float lastPrefWidth;
    private float padBottom;
    private float padLeft;
    private float padRight;
    private float padTop;
    private float prefHeight;
    private float prefWidth;
    private boolean reverse;
    private float space;
    private boolean wrap;
    private float wrapSpace;
    private boolean sizeInvalid = true;
    private int align = 2;
    private boolean round = true;

    public VerticalGroup() {
        setTouchable(Touchable.childrenOnly);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void computeSize() {
        int i;
        float width;
        float height;
        int i2 = 0;
        this.sizeInvalid = false;
        SnapshotArray<Actor> children = getChildren();
        int i3 = children.size;
        this.prefWidth = 0.0f;
        if (this.wrap) {
            this.prefHeight = 0.0f;
            FloatArray floatArray = this.columnSizes;
            if (floatArray == null) {
                this.columnSizes = new FloatArray();
            } else {
                floatArray.clear();
            }
            FloatArray floatArray2 = this.columnSizes;
            float f = this.space;
            float f2 = this.wrapSpace;
            float f3 = this.padTop + this.padBottom;
            float height2 = getHeight() - f3;
            if (this.reverse) {
                i2 = i3 - 1;
                i3 = -1;
                i = -1;
            } else {
                i = 1;
            }
            float f4 = 0.0f;
            float fMax = 0.0f;
            float f5 = 0.0f;
            while (i2 != i3) {
                Actor actor = children.get(i2);
                if (actor instanceof Layout) {
                    Layout layout = (Layout) actor;
                    width = layout.getPrefWidth();
                    height = layout.getPrefHeight();
                    if (height > height2) {
                        height = Math.max(height2, layout.getMinHeight());
                    }
                } else {
                    width = actor.getWidth();
                    height = actor.getHeight();
                }
                float f6 = height + (f4 > 0.0f ? f : 0.0f);
                if (f4 + f6 <= height2 || f4 <= 0.0f) {
                    height = f6;
                } else {
                    floatArray2.add(f4);
                    floatArray2.add(fMax);
                    this.prefHeight = Math.max(this.prefHeight, f4 + f3);
                    if (f5 > 0.0f) {
                        f5 += f2;
                    }
                    f5 += fMax;
                    f4 = 0.0f;
                    fMax = 0.0f;
                }
                f4 += height;
                fMax = Math.max(fMax, width);
                i2 += i;
            }
            floatArray2.add(f4);
            floatArray2.add(fMax);
            this.prefHeight = Math.max(this.prefHeight, f4 + f3);
            if (f5 > 0.0f) {
                f5 += f2;
            }
            this.prefWidth = Math.max(this.prefWidth, f5 + fMax);
        } else {
            this.prefHeight = (this.space * (i3 - 1)) + this.padTop + this.padBottom;
            while (i2 < i3) {
                Actor actor2 = children.get(i2);
                if (actor2 instanceof Layout) {
                    Layout layout2 = (Layout) actor2;
                    this.prefWidth = Math.max(this.prefWidth, layout2.getPrefWidth());
                    this.prefHeight = layout2.getPrefHeight() + this.prefHeight;
                } else {
                    this.prefWidth = Math.max(this.prefWidth, actor2.getWidth());
                    this.prefHeight = actor2.getHeight() + this.prefHeight;
                }
                i2++;
            }
        }
        float f7 = this.padLeft + this.padRight + this.prefWidth;
        this.prefWidth = f7;
        if (this.round) {
            this.prefWidth = (float) Math.ceil(f7);
            this.prefHeight = (float) Math.ceil(this.prefHeight);
        }
    }

    /* JADX WARN: Code duplicated, block: B:14:0x004b  */
    /* JADX WARN: Code duplicated, block: B:15:0x0051  */
    /* JADX WARN: Code duplicated, block: B:17:0x0055  */
    /* JADX WARN: Code duplicated, block: B:20:0x006d  */
    /* JADX WARN: Code duplicated, block: B:21:0x0073  */
    /* JADX WARN: Code duplicated, block: B:24:0x0080  */
    /* JADX WARN: Code duplicated, block: B:26:0x008e  */
    /* JADX WARN: Code duplicated, block: B:28:0x009d  */
    /* JADX WARN: Code duplicated, block: B:30:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:31:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:37:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:39:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:41:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:43:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:44:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:46:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:50:0x0106  */
    /* JADX WARN: Code duplicated, block: B:53:0x010e  */
    /* JADX WARN: Code duplicated, block: B:60:0x0127  */
    /* JADX WARN: Code duplicated, block: B:61:0x012b  */
    /* JADX WARN: Code duplicated, block: B:63:0x012f  */
    /* JADX WARN: Code duplicated, block: B:64:0x0138  */
    /* JADX WARN: Code duplicated, block: B:67:0x0141  */
    /* JADX WARN: Code duplicated, block: B:68:0x0163  */
    /* JADX WARN: Code duplicated, block: B:70:0x016e  */
    /* JADX WARN: Code duplicated, block: B:75:0x0171 A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    private void layoutWrapped() {
        float width;
        float f;
        int i;
        FloatArray floatArray;
        SnapshotArray<Actor> children;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        float f2;
        float f3;
        Actor actor;
        float width2;
        float height;
        Layout layout;
        float f4;
        int iMin;
        float f5;
        float f6;
        float fMax;
        float fC;
        float f7;
        float maxWidth;
        VerticalGroup verticalGroup = this;
        float prefWidth = getPrefWidth();
        if (prefWidth != verticalGroup.lastPrefWidth) {
            verticalGroup.lastPrefWidth = prefWidth;
            invalidateHierarchy();
        }
        int i7 = verticalGroup.align;
        boolean z = verticalGroup.round;
        float f8 = verticalGroup.space;
        float f9 = verticalGroup.padLeft;
        float f10 = verticalGroup.fill;
        float f11 = verticalGroup.wrapSpace;
        float f12 = (verticalGroup.prefHeight - verticalGroup.padTop) - verticalGroup.padBottom;
        float height2 = getHeight();
        float fC2 = (verticalGroup.prefHeight - verticalGroup.padTop) + f8;
        if ((i7 & 16) == 0) {
            if ((i7 & 8) == 0) {
                width = (getWidth() - prefWidth) / 2.0f;
            }
            if ((i7 & 2) != 0) {
                fC2 += height2 - verticalGroup.prefHeight;
            } else if ((i7 & 4) == 0) {
                fC2 = DM.c(height2, verticalGroup.prefHeight, 2.0f, fC2);
            }
            f = height2 - verticalGroup.padTop;
            i = verticalGroup.columnAlign;
            floatArray = verticalGroup.columnSizes;
            children = getChildren();
            i2 = children.size;
            i3 = 0;
            if (verticalGroup.reverse) {
                i5 = i2 - 1;
                i4 = -1;
                i6 = -1;
            } else {
                i4 = i2;
                i5 = 0;
                i6 = 1;
            }
            f2 = 0.0f;
            f3 = 0.0f;
            while (i5 != i4) {
                actor = children.get(i5);
                SnapshotArray<Actor> snapshotArray = children;
                if (actor instanceof Layout) {
                    layout = (Layout) actor;
                    width2 = layout.getPrefWidth();
                    height = layout.getPrefHeight();
                    if (height > f) {
                        height = Math.max(f, layout.getMinHeight());
                    }
                } else {
                    width2 = actor.getWidth();
                    height = actor.getHeight();
                    layout = null;
                }
                f4 = height;
                float f13 = f;
                if ((f2 - f4) - f8 >= verticalGroup.padBottom || i3 == 0) {
                    iMin = Math.min(i3, floatArray.size - 2);
                    if ((i & 4) != 0) {
                        f5 = f12 - floatArray.get(iMin);
                    } else {
                        if ((i & 2) == 0) {
                            f5 = (f12 - floatArray.get(iMin)) / 2.0f;
                        } else {
                            f2 = fC2;
                        }
                        if (iMin > 0) {
                            f9 = f9 + f11 + f3;
                        }
                        f3 = floatArray.get(iMin + 1);
                        i3 = iMin + 2;
                    }
                    f2 = fC2 - f5;
                    if (iMin > 0) {
                        f9 = f9 + f11 + f3;
                    }
                    f3 = floatArray.get(iMin + 1);
                    i3 = iMin + 2;
                }
                f6 = f3;
                if (f10 > 0.0f) {
                    width2 = f6 * f10;
                }
                fMax = width2;
                FloatArray floatArray2 = floatArray;
                if (layout != null) {
                    fMax = Math.max(fMax, layout.getMinWidth());
                    maxWidth = layout.getMaxWidth();
                    if (maxWidth > 0.0f && fMax > maxWidth) {
                        fMax = maxWidth;
                    }
                }
                if ((i & 16) != 0) {
                    fC = (f6 - fMax) + f9;
                } else if ((i & 8) == 0) {
                    fC = DM.c(f6, fMax, 2.0f, f9);
                } else {
                    fC = f9;
                }
                int i8 = i;
                f7 = f2 - (f4 + f8);
                if (z) {
                    actor.setBounds((float) Math.floor(fC), (float) Math.floor(f7), (float) Math.ceil(fMax), (float) Math.ceil(f4));
                } else {
                    actor.setBounds(fC, f7, fMax, f4);
                }
                if (layout != null) {
                    layout.validate();
                }
                i5 += i6;
                verticalGroup = this;
                z = z;
                floatArray = floatArray2;
                children = snapshotArray;
                f8 = f8;
                i4 = i4;
                f9 = f9;
                f2 = f7;
                f3 = f6;
                i = i8;
                f = f13;
            }
        }
        width = getWidth() - prefWidth;
        f9 += width;
        if ((i7 & 2) != 0) {
            fC2 += height2 - verticalGroup.prefHeight;
        } else if ((i7 & 4) == 0) {
            fC2 = DM.c(height2, verticalGroup.prefHeight, 2.0f, fC2);
        }
        f = height2 - verticalGroup.padTop;
        i = verticalGroup.columnAlign;
        floatArray = verticalGroup.columnSizes;
        children = getChildren();
        i2 = children.size;
        i3 = 0;
        if (verticalGroup.reverse) {
            i5 = i2 - 1;
            i4 = -1;
            i6 = -1;
        } else {
            i4 = i2;
            i5 = 0;
            i6 = 1;
        }
        f2 = 0.0f;
        f3 = 0.0f;
        while (i5 != i4) {
            actor = children.get(i5);
            SnapshotArray<Actor> snapshotArray2 = children;
            if (actor instanceof Layout) {
                layout = (Layout) actor;
                width2 = layout.getPrefWidth();
                height = layout.getPrefHeight();
                if (height > f) {
                    height = Math.max(f, layout.getMinHeight());
                }
            } else {
                width2 = actor.getWidth();
                height = actor.getHeight();
                layout = null;
            }
            f4 = height;
            float f14 = f;
            if ((f2 - f4) - f8 >= verticalGroup.padBottom) {
                iMin = Math.min(i3, floatArray.size - 2);
                if ((i & 4) != 0) {
                    f5 = f12 - floatArray.get(iMin);
                } else {
                    if ((i & 2) == 0) {
                        f5 = (f12 - floatArray.get(iMin)) / 2.0f;
                    } else {
                        f2 = fC2;
                    }
                    if (iMin > 0) {
                        f9 = f9 + f11 + f3;
                    }
                    f3 = floatArray.get(iMin + 1);
                    i3 = iMin + 2;
                }
                f2 = fC2 - f5;
                if (iMin > 0) {
                    f9 = f9 + f11 + f3;
                }
                f3 = floatArray.get(iMin + 1);
                i3 = iMin + 2;
            } else {
                iMin = Math.min(i3, floatArray.size - 2);
                if ((i & 4) != 0) {
                    f5 = f12 - floatArray.get(iMin);
                } else {
                    if ((i & 2) == 0) {
                        f5 = (f12 - floatArray.get(iMin)) / 2.0f;
                    } else {
                        f2 = fC2;
                    }
                    if (iMin > 0) {
                        f9 = f9 + f11 + f3;
                    }
                    f3 = floatArray.get(iMin + 1);
                    i3 = iMin + 2;
                }
                f2 = fC2 - f5;
                if (iMin > 0) {
                    f9 = f9 + f11 + f3;
                }
                f3 = floatArray.get(iMin + 1);
                i3 = iMin + 2;
            }
            f6 = f3;
            if (f10 > 0.0f) {
                width2 = f6 * f10;
            }
            fMax = width2;
            FloatArray floatArray3 = floatArray;
            if (layout != null) {
                fMax = Math.max(fMax, layout.getMinWidth());
                maxWidth = layout.getMaxWidth();
                if (maxWidth > 0.0f) {
                    fMax = maxWidth;
                }
            }
            if ((i & 16) != 0) {
                fC = (f6 - fMax) + f9;
            } else if ((i & 8) == 0) {
                fC = DM.c(f6, fMax, 2.0f, f9);
            } else {
                fC = f9;
            }
            int i9 = i;
            f7 = f2 - (f4 + f8);
            if (z) {
                actor.setBounds((float) Math.floor(fC), (float) Math.floor(f7), (float) Math.ceil(fMax), (float) Math.ceil(f4));
            } else {
                actor.setBounds(fC, f7, fMax, f4);
            }
            if (layout != null) {
                layout.validate();
            }
            i5 += i6;
            verticalGroup = this;
            z = z;
            floatArray = floatArray3;
            children = snapshotArray2;
            f8 = f8;
            i4 = i4;
            f9 = f9;
            f2 = f7;
            f3 = f6;
            i = i9;
            f = f14;
        }
    }

    public VerticalGroup align(int i) {
        this.align = i;
        return this;
    }

    public VerticalGroup bottom() {
        this.align = (this.align | 4) & (-3);
        return this;
    }

    public VerticalGroup center() {
        this.align = 1;
        return this;
    }

    public VerticalGroup columnAlign(int i) {
        this.columnAlign = i;
        return this;
    }

    public VerticalGroup columnBottom() {
        this.columnAlign = (this.columnAlign | 4) & (-3);
        return this;
    }

    public VerticalGroup columnCenter() {
        this.columnAlign = 1;
        return this;
    }

    public VerticalGroup columnLeft() {
        this.columnAlign = (this.columnAlign | 8) & (-17);
        return this;
    }

    public VerticalGroup columnRight() {
        this.columnAlign = (this.columnAlign | 16) & (-9);
        return this;
    }

    public VerticalGroup columnTop() {
        this.columnAlign = (this.columnAlign | 2) & (-5);
        return this;
    }

    @Override // com.badlogic.gdx.scenes.scene2d.Actor
    public void drawDebugBounds(ShapeRenderer shapeRenderer) {
        super.drawDebugBounds(shapeRenderer);
        if (getDebug()) {
            shapeRenderer.set(ShapeRenderer.ShapeType.Line);
            if (getStage() != null) {
                shapeRenderer.setColor(getStage().getDebugColor());
            }
            shapeRenderer.rect(getX() + this.padLeft, getY() + this.padBottom, getOriginX(), getOriginY(), (getWidth() - this.padLeft) - this.padRight, (getHeight() - this.padBottom) - this.padTop, getScaleX(), getScaleY(), getRotation());
        }
    }

    public VerticalGroup expand() {
        this.expand = true;
        return this;
    }

    public VerticalGroup fill() {
        this.fill = 1.0f;
        return this;
    }

    public int getAlign() {
        return this.align;
    }

    public int getColumns() {
        if (this.wrap) {
            return this.columnSizes.size >> 1;
        }
        return 1;
    }

    public boolean getExpand() {
        return this.expand;
    }

    public float getFill() {
        return this.fill;
    }

    public float getPadBottom() {
        return this.padBottom;
    }

    public float getPadLeft() {
        return this.padLeft;
    }

    public float getPadRight() {
        return this.padRight;
    }

    public float getPadTop() {
        return this.padTop;
    }

    @Override // com.badlogic.gdx.scenes.scene2d.ui.WidgetGroup, com.badlogic.gdx.scenes.scene2d.utils.Layout
    public float getPrefHeight() {
        if (this.wrap) {
            return 0.0f;
        }
        if (this.sizeInvalid) {
            computeSize();
        }
        return this.prefHeight;
    }

    @Override // com.badlogic.gdx.scenes.scene2d.ui.WidgetGroup, com.badlogic.gdx.scenes.scene2d.utils.Layout
    public float getPrefWidth() {
        if (this.sizeInvalid) {
            computeSize();
        }
        return this.prefWidth;
    }

    public boolean getReverse() {
        return this.reverse;
    }

    public float getSpace() {
        return this.space;
    }

    public boolean getWrap() {
        return this.wrap;
    }

    public float getWrapSpace() {
        return this.wrapSpace;
    }

    public VerticalGroup grow() {
        this.expand = true;
        this.fill = 1.0f;
        return this;
    }

    @Override // com.badlogic.gdx.scenes.scene2d.ui.WidgetGroup, com.badlogic.gdx.scenes.scene2d.utils.Layout
    public void invalidate() {
        super.invalidate();
        this.sizeInvalid = true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.badlogic.gdx.scenes.scene2d.ui.WidgetGroup, com.badlogic.gdx.scenes.scene2d.utils.Layout
    public void layout() {
        int i;
        int i2;
        int i3;
        float width;
        float height;
        Layout layout;
        float fC;
        if (this.sizeInvalid) {
            computeSize();
        }
        if (this.wrap) {
            layoutWrapped();
            return;
        }
        boolean z = this.round;
        int i4 = this.align;
        float f = this.space;
        float width2 = this.padLeft;
        float f2 = this.fill;
        float width3 = ((this.expand ? getWidth() : this.prefWidth) - width2) - this.padRight;
        float fC2 = (this.prefHeight - this.padTop) + f;
        if ((i4 & 2) != 0) {
            fC2 += getHeight() - this.prefHeight;
        } else if ((i4 & 4) == 0) {
            fC2 = DM.c(getHeight(), this.prefHeight, 2.0f, fC2);
        }
        if ((i4 & 8) == 0) {
            width2 = (i4 & 16) != 0 ? (getWidth() - this.padRight) - width3 : width2 + ((((getWidth() - width2) - this.padRight) - width3) / 2.0f);
        }
        int i5 = this.columnAlign;
        SnapshotArray<Actor> children = getChildren();
        int i6 = children.size;
        if (this.reverse) {
            i2 = i6 - 1;
            i = -1;
            i3 = -1;
        } else {
            i = i6;
            i2 = 0;
            i3 = 1;
        }
        while (i2 != i) {
            Actor actor = children.get(i2);
            if (actor instanceof Layout) {
                layout = (Layout) actor;
                width = layout.getPrefWidth();
                height = layout.getPrefHeight();
            } else {
                width = actor.getWidth();
                height = actor.getHeight();
                layout = null;
            }
            float f3 = height;
            if (f2 > 0.0f) {
                width = width3 * f2;
            }
            if (layout != null) {
                width = Math.max(width, layout.getMinWidth());
                float maxWidth = layout.getMaxWidth();
                if (maxWidth > 0.0f && width > maxWidth) {
                    width = maxWidth;
                }
            }
            if ((i5 & 16) != 0) {
                fC = (width3 - width) + width2;
            } else {
                fC = (i5 & 8) == 0 ? DM.c(width3, width, 2.0f, width2) : width2;
            }
            fC2 -= f3 + f;
            if (z) {
                actor.setBounds((float) Math.floor(fC), (float) Math.floor(fC2), (float) Math.ceil(width), (float) Math.ceil(f3));
            } else {
                actor.setBounds(fC, fC2, width, f3);
            }
            if (layout != null) {
                layout.validate();
            }
            i2 += i3;
            z = z;
            i5 = i5;
            f = f;
            width2 = width2;
            f2 = f2;
        }
    }

    public VerticalGroup left() {
        this.align = (this.align | 8) & (-17);
        return this;
    }

    public VerticalGroup pad(float f) {
        this.padTop = f;
        this.padLeft = f;
        this.padBottom = f;
        this.padRight = f;
        return this;
    }

    public VerticalGroup padBottom(float f) {
        this.padBottom = f;
        return this;
    }

    public VerticalGroup padLeft(float f) {
        this.padLeft = f;
        return this;
    }

    public VerticalGroup padRight(float f) {
        this.padRight = f;
        return this;
    }

    public VerticalGroup padTop(float f) {
        this.padTop = f;
        return this;
    }

    public VerticalGroup reverse() {
        this.reverse = true;
        return this;
    }

    public VerticalGroup right() {
        this.align = (this.align | 16) & (-9);
        return this;
    }

    public void setRound(boolean z) {
        this.round = z;
    }

    public VerticalGroup space(float f) {
        this.space = f;
        return this;
    }

    public VerticalGroup top() {
        this.align = (this.align | 2) & (-5);
        return this;
    }

    public VerticalGroup wrap() {
        this.wrap = true;
        return this;
    }

    public VerticalGroup wrapSpace(float f) {
        this.wrapSpace = f;
        return this;
    }

    public VerticalGroup expand(boolean z) {
        this.expand = z;
        return this;
    }

    public VerticalGroup fill(float f) {
        this.fill = f;
        return this;
    }

    public VerticalGroup reverse(boolean z) {
        this.reverse = z;
        return this;
    }

    public VerticalGroup wrap(boolean z) {
        this.wrap = z;
        return this;
    }

    public VerticalGroup pad(float f, float f2, float f3, float f4) {
        this.padTop = f;
        this.padLeft = f2;
        this.padBottom = f3;
        this.padRight = f4;
        return this;
    }
}
