package com.badlogic.gdx.scenes.scene2d.ui;

import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.badlogic.gdx.scenes.scene2d.Actor;
import com.badlogic.gdx.scenes.scene2d.Touchable;
import com.badlogic.gdx.scenes.scene2d.utils.Layout;
import com.badlogic.gdx.utils.FloatArray;
import com.badlogic.gdx.utils.SnapshotArray;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.DM;

/* JADX INFO: loaded from: classes.dex */
public class HorizontalGroup extends WidgetGroup {
    private boolean expand;
    private float fill;
    private float lastPrefHeight;
    private float padBottom;
    private float padLeft;
    private float padRight;
    private float padTop;
    private float prefHeight;
    private float prefWidth;
    private boolean reverse;
    private int rowAlign;
    private FloatArray rowSizes;
    private float space;
    private boolean wrap;
    private boolean wrapReverse;
    private float wrapSpace;
    private boolean sizeInvalid = true;
    private int align = 8;
    private boolean round = true;

    public HorizontalGroup() {
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
        float f = 0.0f;
        this.prefHeight = 0.0f;
        if (this.wrap) {
            this.prefWidth = 0.0f;
            FloatArray floatArray = this.rowSizes;
            if (floatArray == null) {
                this.rowSizes = new FloatArray();
            } else {
                floatArray.clear();
            }
            FloatArray floatArray2 = this.rowSizes;
            float f2 = this.space;
            float f3 = this.wrapSpace;
            float f4 = this.padLeft + this.padRight;
            float width2 = getWidth() - f4;
            if (this.reverse) {
                i2 = i3 - 1;
                i3 = -1;
                i = -1;
            } else {
                i = 1;
            }
            float f5 = 0.0f;
            float fMax = 0.0f;
            float f6 = 0.0f;
            while (i2 != i3) {
                Actor actor = children.get(i2);
                if (actor instanceof Layout) {
                    Layout layout = (Layout) actor;
                    width = layout.getPrefWidth();
                    if (width > width2) {
                        width = Math.max(width2, layout.getMinWidth());
                    }
                    height = layout.getPrefHeight();
                } else {
                    width = actor.getWidth();
                    height = actor.getHeight();
                }
                float f7 = width + (f5 > f ? f2 : 0.0f);
                if (f5 + f7 <= width2 || f5 <= f) {
                    width = f7;
                } else {
                    floatArray2.add(f5);
                    floatArray2.add(fMax);
                    this.prefWidth = Math.max(this.prefWidth, f5 + f4);
                    if (f6 > 0.0f) {
                        f6 += f3;
                    }
                    f6 += fMax;
                    f5 = 0.0f;
                    fMax = 0.0f;
                }
                f5 += width;
                fMax = Math.max(fMax, height);
                i2 += i;
                f = 0.0f;
            }
            floatArray2.add(f5);
            floatArray2.add(fMax);
            this.prefWidth = Math.max(this.prefWidth, f5 + f4);
            if (f6 > 0.0f) {
                f6 += f3;
            }
            this.prefHeight = Math.max(this.prefHeight, f6 + fMax);
        } else {
            this.prefWidth = (this.space * (i3 - 1)) + this.padLeft + this.padRight;
            while (i2 < i3) {
                Actor actor2 = children.get(i2);
                if (actor2 instanceof Layout) {
                    Layout layout2 = (Layout) actor2;
                    this.prefWidth = layout2.getPrefWidth() + this.prefWidth;
                    this.prefHeight = Math.max(this.prefHeight, layout2.getPrefHeight());
                } else {
                    this.prefWidth = actor2.getWidth() + this.prefWidth;
                    this.prefHeight = Math.max(this.prefHeight, actor2.getHeight());
                }
                i2++;
            }
        }
        this.prefHeight = this.padTop + this.padBottom + this.prefHeight;
        if (this.round) {
            this.prefWidth = (float) Math.ceil(this.prefWidth);
            this.prefHeight = (float) Math.ceil(this.prefHeight);
        }
    }

    /* JADX WARN: Code duplicated, block: B:14:0x004a  */
    /* JADX WARN: Code duplicated, block: B:15:0x0055  */
    /* JADX WARN: Code duplicated, block: B:18:0x005b  */
    /* JADX WARN: Code duplicated, block: B:19:0x0061  */
    /* JADX WARN: Code duplicated, block: B:21:0x0065  */
    /* JADX WARN: Code duplicated, block: B:24:0x007e  */
    /* JADX WARN: Code duplicated, block: B:25:0x0083  */
    /* JADX WARN: Code duplicated, block: B:28:0x008f  */
    /* JADX WARN: Code duplicated, block: B:30:0x009f  */
    /* JADX WARN: Code duplicated, block: B:32:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:33:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:36:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:40:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:44:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:46:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:48:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:49:0x0109  */
    /* JADX WARN: Code duplicated, block: B:52:0x0114  */
    /* JADX WARN: Code duplicated, block: B:56:0x0124  */
    /* JADX WARN: Code duplicated, block: B:59:0x012e  */
    /* JADX WARN: Code duplicated, block: B:66:0x0147  */
    /* JADX WARN: Code duplicated, block: B:67:0x014b  */
    /* JADX WARN: Code duplicated, block: B:69:0x014f  */
    /* JADX WARN: Code duplicated, block: B:70:0x0158  */
    /* JADX WARN: Code duplicated, block: B:72:0x015b  */
    /* JADX WARN: Code duplicated, block: B:73:0x0180  */
    /* JADX WARN: Code duplicated, block: B:76:0x0191  */
    /* JADX WARN: Code duplicated, block: B:81:0x0194 A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    private void layoutWrapped() {
        float height;
        float f;
        float f2;
        int i;
        FloatArray floatArray;
        SnapshotArray<Actor> children;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        float f3;
        float f4;
        Actor actor;
        float width;
        float height2;
        Layout layout;
        float f5;
        float f6;
        int iMin;
        float f7;
        float f8;
        float f9;
        float fMax;
        float fC;
        float maxHeight;
        float prefHeight = getPrefHeight();
        if (prefHeight != this.lastPrefHeight) {
            this.lastPrefHeight = prefHeight;
            invalidateHierarchy();
        }
        int i7 = this.align;
        boolean z = this.round;
        float f10 = this.space;
        float f11 = this.fill;
        float f12 = this.wrapSpace;
        float f13 = (this.prefWidth - this.padLeft) - this.padRight;
        float f14 = prefHeight - this.padTop;
        float width2 = getWidth();
        float fC2 = this.padLeft;
        if ((i7 & 2) == 0) {
            if ((i7 & 4) == 0) {
                height = (getHeight() - prefHeight) / 2.0f;
            }
            if (this.wrapReverse) {
                f14 -= this.rowSizes.get(1) + prefHeight;
                f = 1.0f;
            } else {
                f = -1.0f;
            }
            if ((i7 & 16) != 0) {
                fC2 += width2 - this.prefWidth;
            } else if ((i7 & 8) == 0) {
                fC2 = DM.c(width2, this.prefWidth, 2.0f, fC2);
            }
            f2 = width2 - this.padRight;
            i = this.rowAlign;
            floatArray = this.rowSizes;
            children = getChildren();
            i2 = children.size;
            if (this.reverse) {
                i5 = i2 - 1;
                i4 = -1;
                i3 = -1;
            } else {
                i3 = i2;
                i4 = 1;
                i5 = 0;
            }
            i6 = 0;
            f3 = 0.0f;
            f4 = 0.0f;
            while (i5 != i3) {
                int i8 = i3;
                actor = children.get(i5);
                SnapshotArray<Actor> snapshotArray = children;
                if (actor instanceof Layout) {
                    layout = (Layout) actor;
                    width = layout.getPrefWidth();
                    if (width > f2) {
                        width = Math.max(f2, layout.getMinWidth());
                    }
                    height2 = layout.getPrefHeight();
                } else {
                    i4 = i4;
                    width = actor.getWidth();
                    height2 = actor.getHeight();
                    layout = null;
                }
                f5 = width;
                f6 = height2;
                if (f3 + f5 <= f2 || i6 == 0) {
                    iMin = Math.min(i6, floatArray.size - 2);
                    if ((i & 16) != 0) {
                        f8 = f13 - floatArray.get(iMin);
                    } else {
                        if ((i & 8) == 0) {
                            f8 = (f13 - floatArray.get(iMin)) / 2.0f;
                        } else {
                            f7 = fC2;
                        }
                        f9 = floatArray.get(iMin + 1);
                        if (iMin > 0) {
                            f14 = (f12 * f) + f14;
                        }
                        i6 = iMin + 2;
                        f14 = (f9 * f) + f14;
                    }
                    f7 = f8 + fC2;
                    f9 = floatArray.get(iMin + 1);
                    if (iMin > 0) {
                        f14 = (f12 * f) + f14;
                    }
                    i6 = iMin + 2;
                    f14 = (f9 * f) + f14;
                } else {
                    f9 = f4;
                    f7 = f3;
                }
                if (f11 > 0.0f) {
                    f6 = f9 * f11;
                }
                int i9 = i6;
                fMax = f6;
                float f15 = f;
                if (layout != null) {
                    fMax = Math.max(fMax, layout.getMinHeight());
                    maxHeight = layout.getMaxHeight();
                    if (maxHeight > 0.0f && fMax > maxHeight) {
                        fMax = maxHeight;
                    }
                }
                if ((i & 2) != 0) {
                    fC = (f9 - fMax) + f14;
                } else if ((i & 4) == 0) {
                    fC = DM.c(f9, fMax, 2.0f, f14);
                } else {
                    fC = f14;
                }
                if (z) {
                    actor.setBounds((float) Math.floor(f7), (float) Math.floor(fC), (float) Math.ceil(f5), (float) Math.ceil(fMax));
                } else {
                    actor.setBounds(f7, fC, f5, fMax);
                }
                float f16 = f5 + f10 + f7;
                if (layout != null) {
                    layout.validate();
                }
                i5 += i4;
                f11 = f11;
                f2 = f2;
                f13 = f13;
                children = snapshotArray;
                i3 = i8;
                f = f15;
                i4 = i4;
                z = z;
                i = i;
                f12 = f12;
                f4 = f9;
                f3 = f16;
                i6 = i9;
            }
        }
        height = getHeight() - prefHeight;
        f14 += height;
        if (this.wrapReverse) {
            f14 -= this.rowSizes.get(1) + prefHeight;
            f = 1.0f;
        } else {
            f = -1.0f;
        }
        if ((i7 & 16) != 0) {
            fC2 += width2 - this.prefWidth;
        } else if ((i7 & 8) == 0) {
            fC2 = DM.c(width2, this.prefWidth, 2.0f, fC2);
        }
        f2 = width2 - this.padRight;
        i = this.rowAlign;
        floatArray = this.rowSizes;
        children = getChildren();
        i2 = children.size;
        if (this.reverse) {
            i5 = i2 - 1;
            i4 = -1;
            i3 = -1;
        } else {
            i3 = i2;
            i4 = 1;
            i5 = 0;
        }
        i6 = 0;
        f3 = 0.0f;
        f4 = 0.0f;
        while (i5 != i3) {
            int i10 = i3;
            actor = children.get(i5);
            SnapshotArray<Actor> snapshotArray2 = children;
            if (actor instanceof Layout) {
                layout = (Layout) actor;
                width = layout.getPrefWidth();
                if (width > f2) {
                    width = Math.max(f2, layout.getMinWidth());
                }
                height2 = layout.getPrefHeight();
            } else {
                i4 = i4;
                width = actor.getWidth();
                height2 = actor.getHeight();
                layout = null;
            }
            f5 = width;
            f6 = height2;
            if (f3 + f5 <= f2) {
                iMin = Math.min(i6, floatArray.size - 2);
                if ((i & 16) != 0) {
                    f8 = f13 - floatArray.get(iMin);
                } else {
                    if ((i & 8) == 0) {
                        f8 = (f13 - floatArray.get(iMin)) / 2.0f;
                    } else {
                        f7 = fC2;
                    }
                    f9 = floatArray.get(iMin + 1);
                    if (iMin > 0) {
                        f14 = (f12 * f) + f14;
                    }
                    i6 = iMin + 2;
                    f14 = (f9 * f) + f14;
                }
                f7 = f8 + fC2;
                f9 = floatArray.get(iMin + 1);
                if (iMin > 0) {
                    f14 = (f12 * f) + f14;
                }
                i6 = iMin + 2;
                f14 = (f9 * f) + f14;
            } else {
                iMin = Math.min(i6, floatArray.size - 2);
                if ((i & 16) != 0) {
                    f8 = f13 - floatArray.get(iMin);
                } else {
                    if ((i & 8) == 0) {
                        f8 = (f13 - floatArray.get(iMin)) / 2.0f;
                    } else {
                        f7 = fC2;
                    }
                    f9 = floatArray.get(iMin + 1);
                    if (iMin > 0) {
                        f14 = (f12 * f) + f14;
                    }
                    i6 = iMin + 2;
                    f14 = (f9 * f) + f14;
                }
                f7 = f8 + fC2;
                f9 = floatArray.get(iMin + 1);
                if (iMin > 0) {
                    f14 = (f12 * f) + f14;
                }
                i6 = iMin + 2;
                f14 = (f9 * f) + f14;
            }
            if (f11 > 0.0f) {
                f6 = f9 * f11;
            }
            int i11 = i6;
            fMax = f6;
            float f17 = f;
            if (layout != null) {
                fMax = Math.max(fMax, layout.getMinHeight());
                maxHeight = layout.getMaxHeight();
                if (maxHeight > 0.0f) {
                    fMax = maxHeight;
                }
            }
            if ((i & 2) != 0) {
                fC = (f9 - fMax) + f14;
            } else if ((i & 4) == 0) {
                fC = DM.c(f9, fMax, 2.0f, f14);
            } else {
                fC = f14;
            }
            if (z) {
                actor.setBounds((float) Math.floor(f7), (float) Math.floor(fC), (float) Math.ceil(f5), (float) Math.ceil(fMax));
            } else {
                actor.setBounds(f7, fC, f5, fMax);
            }
            float f18 = f5 + f10 + f7;
            if (layout != null) {
                layout.validate();
            }
            i5 += i4;
            f11 = f11;
            f2 = f2;
            f13 = f13;
            children = snapshotArray2;
            i3 = i10;
            f = f17;
            i4 = i4;
            z = z;
            i = i;
            f12 = f12;
            f4 = f9;
            f3 = f18;
            i6 = i11;
        }
    }

    public HorizontalGroup align(int i) {
        this.align = i;
        return this;
    }

    public HorizontalGroup bottom() {
        this.align = (this.align | 4) & (-3);
        return this;
    }

    public HorizontalGroup center() {
        this.align = 1;
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

    public HorizontalGroup expand() {
        this.expand = true;
        return this;
    }

    public HorizontalGroup fill() {
        this.fill = 1.0f;
        return this;
    }

    public int getAlign() {
        return this.align;
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
        if (this.sizeInvalid) {
            computeSize();
        }
        return this.prefHeight;
    }

    @Override // com.badlogic.gdx.scenes.scene2d.ui.WidgetGroup, com.badlogic.gdx.scenes.scene2d.utils.Layout
    public float getPrefWidth() {
        if (this.wrap) {
            return 0.0f;
        }
        if (this.sizeInvalid) {
            computeSize();
        }
        return this.prefWidth;
    }

    public boolean getReverse() {
        return this.reverse;
    }

    public int getRows() {
        if (this.wrap) {
            return this.rowSizes.size >> 1;
        }
        return 1;
    }

    public float getSpace() {
        return this.space;
    }

    public boolean getWrap() {
        return this.wrap;
    }

    public boolean getWrapReverse() {
        return this.wrapReverse;
    }

    public float getWrapSpace() {
        return this.wrapSpace;
    }

    public HorizontalGroup grow() {
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
        float height2 = this.padBottom;
        float f2 = this.fill;
        float height3 = ((this.expand ? getHeight() : this.prefHeight) - this.padTop) - height2;
        float fC2 = this.padLeft;
        if ((i4 & 16) != 0) {
            fC2 += getWidth() - this.prefWidth;
        } else if ((i4 & 8) == 0) {
            fC2 = DM.c(getWidth(), this.prefWidth, 2.0f, fC2);
        }
        if ((i4 & 4) == 0) {
            height2 = (i4 & 2) != 0 ? (getHeight() - this.padTop) - height3 : height2 + ((((getHeight() - height2) - this.padTop) - height3) / 2.0f);
        }
        int i5 = this.rowAlign;
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
            if (f2 > 0.0f) {
                height = height3 * f2;
            }
            float fMax = height;
            if (layout != null) {
                fMax = Math.max(fMax, layout.getMinHeight());
                float maxHeight = layout.getMaxHeight();
                if (maxHeight > 0.0f && fMax > maxHeight) {
                    fMax = maxHeight;
                }
            }
            if ((i5 & 2) != 0) {
                fC = (height3 - fMax) + height2;
            } else {
                fC = (i5 & 4) == 0 ? DM.c(height3, fMax, 2.0f, height2) : height2;
            }
            if (z) {
                actor.setBounds((float) Math.floor(fC2), (float) Math.floor(fC), (float) Math.ceil(width), (float) Math.ceil(fMax));
            } else {
                actor.setBounds(fC2, fC, width, fMax);
            }
            fC2 += width + f;
            if (layout != null) {
                layout.validate();
            }
            i2 += i3;
            f2 = f2;
            z = z;
            i5 = i5;
            height2 = height2;
            height3 = height3;
        }
    }

    public HorizontalGroup left() {
        this.align = (this.align | 8) & (-17);
        return this;
    }

    public HorizontalGroup pad(float f) {
        this.padTop = f;
        this.padLeft = f;
        this.padBottom = f;
        this.padRight = f;
        return this;
    }

    public HorizontalGroup padBottom(float f) {
        this.padBottom = f;
        return this;
    }

    public HorizontalGroup padLeft(float f) {
        this.padLeft = f;
        return this;
    }

    public HorizontalGroup padRight(float f) {
        this.padRight = f;
        return this;
    }

    public HorizontalGroup padTop(float f) {
        this.padTop = f;
        return this;
    }

    public HorizontalGroup reverse() {
        this.reverse = true;
        return this;
    }

    public HorizontalGroup right() {
        this.align = (this.align | 16) & (-9);
        return this;
    }

    public HorizontalGroup rowAlign(int i) {
        this.rowAlign = i;
        return this;
    }

    public HorizontalGroup rowBottom() {
        this.rowAlign = (this.rowAlign | 4) & (-3);
        return this;
    }

    public HorizontalGroup rowCenter() {
        this.rowAlign = 1;
        return this;
    }

    public HorizontalGroup rowLeft() {
        this.rowAlign = (this.rowAlign | 8) & (-17);
        return this;
    }

    public HorizontalGroup rowRight() {
        this.rowAlign = (this.rowAlign | 16) & (-9);
        return this;
    }

    public HorizontalGroup rowTop() {
        this.rowAlign = (this.rowAlign | 2) & (-5);
        return this;
    }

    public void setRound(boolean z) {
        this.round = z;
    }

    public HorizontalGroup space(float f) {
        this.space = f;
        return this;
    }

    public HorizontalGroup top() {
        this.align = (this.align | 2) & (-5);
        return this;
    }

    public HorizontalGroup wrap() {
        this.wrap = true;
        return this;
    }

    public HorizontalGroup wrapReverse() {
        this.wrapReverse = true;
        return this;
    }

    public HorizontalGroup wrapSpace(float f) {
        this.wrapSpace = f;
        return this;
    }

    public HorizontalGroup expand(boolean z) {
        this.expand = z;
        return this;
    }

    public HorizontalGroup fill(float f) {
        this.fill = f;
        return this;
    }

    public HorizontalGroup reverse(boolean z) {
        this.reverse = z;
        return this;
    }

    public HorizontalGroup wrap(boolean z) {
        this.wrap = z;
        return this;
    }

    public HorizontalGroup wrapReverse(boolean z) {
        this.wrapReverse = z;
        return this;
    }

    public HorizontalGroup pad(float f, float f2, float f3, float f4) {
        this.padTop = f;
        this.padLeft = f2;
        this.padBottom = f3;
        this.padRight = f4;
        return this;
    }
}
