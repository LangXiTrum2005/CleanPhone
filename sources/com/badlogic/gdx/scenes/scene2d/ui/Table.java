package com.badlogic.gdx.scenes.scene2d.ui;

import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.scenes.scene2d.Actor;
import com.badlogic.gdx.scenes.scene2d.Touchable;
import com.badlogic.gdx.scenes.scene2d.utils.Drawable;
import com.badlogic.gdx.scenes.scene2d.utils.Layout;
import com.badlogic.gdx.utils.Array;
import com.badlogic.gdx.utils.Null;
import com.badlogic.gdx.utils.Pool;
import com.badlogic.gdx.utils.Pools;
import com.badlogic.gdx.utils.SnapshotArray;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.DM;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public class Table extends WidgetGroup {
    private static float[] columnWeightedWidth;
    private static float[] rowWeightedHeight;
    int align;

    @Null
    Drawable background;
    private final Cell cellDefaults;
    private final Array<Cell> cells;
    private boolean clip;
    private final Array<Cell> columnDefaults;
    private float[] columnMinWidth;
    private float[] columnPrefWidth;
    private float[] columnWidth;
    private int columns;
    Debug debug;
    Array<DebugRect> debugRects;
    private float[] expandHeight;
    private float[] expandWidth;
    private boolean implicitEndRow;
    Value padBottom;
    Value padLeft;
    Value padRight;
    Value padTop;
    boolean round;
    private Cell rowDefaults;
    private float[] rowHeight;
    private float[] rowMinHeight;
    private float[] rowPrefHeight;
    private int rows;
    private boolean sizeInvalid;

    @Null
    private Skin skin;
    private float tableMinHeight;
    private float tableMinWidth;
    private float tablePrefHeight;
    private float tablePrefWidth;
    public static Color debugTableColor = new Color(0.0f, 0.0f, 1.0f, 1.0f);
    public static Color debugCellColor = new Color(1.0f, 0.0f, 0.0f, 1.0f);
    public static Color debugActorColor = new Color(0.0f, 1.0f, 0.0f, 1.0f);
    static final Pool<Cell> cellPool = new Pool<Cell>() { // from class: com.badlogic.gdx.scenes.scene2d.ui.Table.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.badlogic.gdx.utils.Pool
        public Cell newObject() {
            return new Cell();
        }
    };
    public static Value backgroundTop = new Value() { // from class: com.badlogic.gdx.scenes.scene2d.ui.Table.2
        @Override // com.badlogic.gdx.scenes.scene2d.ui.Value
        public float get(@Null Actor actor) {
            Drawable drawable = ((Table) actor).background;
            if (drawable == null) {
                return 0.0f;
            }
            return drawable.getTopHeight();
        }
    };
    public static Value backgroundLeft = new Value() { // from class: com.badlogic.gdx.scenes.scene2d.ui.Table.3
        @Override // com.badlogic.gdx.scenes.scene2d.ui.Value
        public float get(@Null Actor actor) {
            Drawable drawable = ((Table) actor).background;
            if (drawable == null) {
                return 0.0f;
            }
            return drawable.getLeftWidth();
        }
    };
    public static Value backgroundBottom = new Value() { // from class: com.badlogic.gdx.scenes.scene2d.ui.Table.4
        @Override // com.badlogic.gdx.scenes.scene2d.ui.Value
        public float get(@Null Actor actor) {
            Drawable drawable = ((Table) actor).background;
            if (drawable == null) {
                return 0.0f;
            }
            return drawable.getBottomHeight();
        }
    };
    public static Value backgroundRight = new Value() { // from class: com.badlogic.gdx.scenes.scene2d.ui.Table.5
        @Override // com.badlogic.gdx.scenes.scene2d.ui.Value
        public float get(@Null Actor actor) {
            Drawable drawable = ((Table) actor).background;
            if (drawable == null) {
                return 0.0f;
            }
            return drawable.getRightWidth();
        }
    };

    public enum Debug {
        none,
        all,
        table,
        cell,
        actor
    }

    public static class DebugRect extends Rectangle {
        static Pool<DebugRect> pool = Pools.get(DebugRect.class);
        Color color;
    }

    public Table() {
        this(null);
    }

    private void addDebugRect(float f, float f2, float f3, float f4, Color color) {
        DebugRect debugRectObtain = DebugRect.pool.obtain();
        debugRectObtain.color = color;
        debugRectObtain.set(f, f2, f3, f4);
        this.debugRects.add(debugRectObtain);
    }

    private void addDebugRects(float f, float f2, float f3, float f4) {
        clearDebugRects();
        Debug debug = this.debug;
        if (debug == Debug.table || debug == Debug.all) {
            addDebugRect(0.0f, 0.0f, getWidth(), getHeight(), debugTableColor);
            addDebugRect(f, getHeight() - f2, f3, -f4, debugTableColor);
        }
        int i = this.cells.size;
        float f5 = f;
        for (int i2 = 0; i2 < i; i2++) {
            Cell cell = this.cells.get(i2);
            Debug debug2 = this.debug;
            if (debug2 == Debug.actor || debug2 == Debug.all) {
                addDebugRect(cell.actorX, cell.actorY, cell.actorWidth, cell.actorHeight, debugActorColor);
            }
            int i3 = cell.column;
            int iIntValue = cell.colspan.intValue() + i3;
            float f6 = 0.0f;
            while (i3 < iIntValue) {
                f6 += this.columnWidth[i3];
                i3++;
            }
            float f7 = cell.computedPadLeft;
            float f8 = f6 - (cell.computedPadRight + f7);
            float f9 = f5 + f7;
            Debug debug3 = this.debug;
            if (debug3 == Debug.cell || debug3 == Debug.all) {
                float f10 = this.rowHeight[cell.row];
                float f11 = cell.computedPadTop;
                float f12 = (f10 - f11) - cell.computedPadBottom;
                addDebugRect(f9, getHeight() - (f11 + f2), f8, -f12, debugCellColor);
            }
            if (cell.endRow) {
                f2 += this.rowHeight[cell.row];
                f5 = f;
            } else {
                f5 = f8 + cell.computedPadRight + f9;
            }
        }
    }

    private void clearDebugRects() {
        if (this.debugRects == null) {
            this.debugRects = new Array<>();
        }
        DebugRect.pool.freeAll(this.debugRects);
        this.debugRects.clear();
    }

    private void computeSize() {
        this.sizeInvalid = false;
        Array<Cell> array = this.cells;
        Cell[] cellArr = array.items;
        int i = array.size;
        if (i > 0 && !cellArr[i - 1].endRow) {
            endRow();
            this.implicitEndRow = true;
        }
        int i2 = this.columns;
        int i3 = this.rows;
        float[] fArrEnsureSize = ensureSize(this.columnMinWidth, i2);
        this.columnMinWidth = fArrEnsureSize;
        float[] fArrEnsureSize2 = ensureSize(this.rowMinHeight, i3);
        this.rowMinHeight = fArrEnsureSize2;
        float[] fArrEnsureSize3 = ensureSize(this.columnPrefWidth, i2);
        this.columnPrefWidth = fArrEnsureSize3;
        float[] fArrEnsureSize4 = ensureSize(this.rowPrefHeight, i3);
        this.rowPrefHeight = fArrEnsureSize4;
        this.columnWidth = ensureSize(this.columnWidth, i2);
        this.rowHeight = ensureSize(this.rowHeight, i3);
        float[] fArrEnsureSize5 = ensureSize(this.expandWidth, i2);
        this.expandWidth = fArrEnsureSize5;
        float[] fArrEnsureSize6 = ensureSize(this.expandHeight, i3);
        this.expandHeight = fArrEnsureSize6;
        int i4 = 0;
        float f = 0.0f;
        while (i4 < i) {
            Cell cell = cellArr[i4];
            int i5 = cell.column;
            int i6 = cell.row;
            int i7 = i;
            int iIntValue = cell.colspan.intValue();
            int i8 = i4;
            Actor actor = cell.actor;
            float[] fArr = fArrEnsureSize2;
            if (cell.expandY.intValue() != 0 && fArrEnsureSize6[i6] == 0.0f) {
                fArrEnsureSize6[i6] = cell.expandY.intValue();
            }
            if (iIntValue == 1 && cell.expandX.intValue() != 0 && fArrEnsureSize5[i5] == 0.0f) {
                fArrEnsureSize5[i5] = cell.expandX.intValue();
            }
            float[] fArr2 = fArrEnsureSize6;
            cell.computedPadLeft = cell.padLeft.get(actor) + (i5 == 0 ? 0.0f : Math.max(0.0f, cell.spaceLeft.get(actor) - f));
            float f2 = cell.padTop.get(actor);
            cell.computedPadTop = f2;
            int i9 = cell.cellAboveIndex;
            if (i9 != -1) {
                cell.computedPadTop = Math.max(0.0f, cell.spaceTop.get(actor) - cellArr[i9].spaceBottom.get(actor)) + f2;
            }
            float f3 = cell.spaceRight.get(actor);
            cell.computedPadRight = cell.padRight.get(actor) + (i5 + iIntValue == i2 ? 0.0f : f3);
            cell.computedPadBottom = cell.padBottom.get(actor) + (i6 == i3 + (-1) ? 0.0f : cell.spaceBottom.get(actor));
            float f4 = cell.prefWidth.get(actor);
            float f5 = cell.prefHeight.get(actor);
            float f6 = cell.minWidth.get(actor);
            int i10 = i3;
            float fCeil = cell.minHeight.get(actor);
            int i11 = i2;
            float fCeil2 = cell.maxWidth.get(actor);
            float[] fArr3 = fArrEnsureSize5;
            float fCeil3 = cell.maxHeight.get(actor);
            if (f4 < f6) {
                f4 = f6;
            }
            if (f5 < fCeil) {
                f5 = fCeil;
            }
            if (fCeil2 <= 0.0f || f4 <= fCeil2) {
                fCeil2 = f4;
            }
            if (fCeil3 <= 0.0f || f5 <= fCeil3) {
                fCeil3 = f5;
            }
            if (this.round) {
                float fCeil4 = (float) Math.ceil(f6);
                fCeil = (float) Math.ceil(fCeil);
                fCeil2 = (float) Math.ceil(fCeil2);
                fCeil3 = (float) Math.ceil(fCeil3);
                f6 = fCeil4;
            }
            if (iIntValue == 1) {
                float f7 = cell.computedPadLeft + cell.computedPadRight;
                fArrEnsureSize3[i5] = Math.max(fArrEnsureSize3[i5], fCeil2 + f7);
                fArrEnsureSize[i5] = Math.max(fArrEnsureSize[i5], f6 + f7);
            }
            float f8 = cell.computedPadTop + cell.computedPadBottom;
            fArrEnsureSize4[i6] = Math.max(fArrEnsureSize4[i6], fCeil3 + f8);
            fArr[i6] = Math.max(fArr[i6], fCeil + f8);
            i4 = i8 + 1;
            i = i7;
            fArrEnsureSize2 = fArr;
            fArrEnsureSize6 = fArr2;
            f = f3;
            i3 = i10;
            i2 = i11;
            fArrEnsureSize5 = fArr3;
        }
        int i12 = i2;
        int i13 = i3;
        float[] fArr4 = fArrEnsureSize2;
        float[] fArr5 = fArrEnsureSize5;
        int i14 = i;
        float fMax = 0.0f;
        float fMax2 = 0.0f;
        float fMax3 = 0.0f;
        float fMax4 = 0.0f;
        for (int i15 = 0; i15 < i14; i15++) {
            Cell cell2 = cellArr[i15];
            int i16 = cell2.column;
            int iIntValue2 = cell2.expandX.intValue();
            if (iIntValue2 != 0) {
                int iIntValue3 = cell2.colspan.intValue() + i16;
                int i17 = i16;
                while (true) {
                    if (i17 >= iIntValue3) {
                        int i18 = i16;
                        while (i18 < iIntValue3) {
                            fArr5[i18] = iIntValue2;
                            i18++;
                            iIntValue3 = iIntValue3;
                        }
                        break;
                    }
                    if (fArr5[i17] != 0.0f) {
                        break;
                    } else {
                        i17++;
                    }
                }
            }
            Boolean bool = cell2.uniformX;
            Boolean bool2 = Boolean.TRUE;
            if (bool == bool2 && cell2.colspan.intValue() == 1) {
                float f9 = cell2.computedPadLeft + cell2.computedPadRight;
                fMax3 = Math.max(fMax3, fArrEnsureSize[i16] - f9);
                fMax = Math.max(fMax, fArrEnsureSize3[i16] - f9);
            }
            if (cell2.uniformY == bool2) {
                float f10 = cell2.computedPadTop + cell2.computedPadBottom;
                fMax4 = Math.max(fMax4, fArr4[cell2.row] - f10);
                fMax2 = Math.max(fMax2, fArrEnsureSize4[cell2.row] - f10);
            }
        }
        if (fMax > 0.0f || fMax2 > 0.0f) {
            for (int i19 = 0; i19 < i14; i19++) {
                Cell cell3 = cellArr[i19];
                if (fMax > 0.0f && cell3.uniformX == Boolean.TRUE && cell3.colspan.intValue() == 1) {
                    float f11 = cell3.computedPadLeft + cell3.computedPadRight;
                    int i20 = cell3.column;
                    fArrEnsureSize[i20] = fMax3 + f11;
                    fArrEnsureSize3[i20] = f11 + fMax;
                }
                if (fMax2 > 0.0f && cell3.uniformY == Boolean.TRUE) {
                    float f12 = cell3.computedPadTop + cell3.computedPadBottom;
                    int i21 = cell3.row;
                    fArr4[i21] = fMax4 + f12;
                    fArrEnsureSize4[i21] = f12 + fMax2;
                }
            }
        }
        for (int i22 = 0; i22 < i14; i22++) {
            Cell cell4 = cellArr[i22];
            int iIntValue4 = cell4.colspan.intValue();
            if (iIntValue4 != 1) {
                int i23 = cell4.column;
                Actor actor2 = cell4.actor;
                float fCeil5 = cell4.minWidth.get(actor2);
                float f13 = cell4.prefWidth.get(actor2);
                float fCeil6 = cell4.maxWidth.get(actor2);
                if (f13 < fCeil5) {
                    f13 = fCeil5;
                }
                if (fCeil6 <= 0.0f || f13 <= fCeil6) {
                    fCeil6 = f13;
                }
                if (this.round) {
                    fCeil5 = (float) Math.ceil(fCeil5);
                    fCeil6 = (float) Math.ceil(fCeil6);
                }
                float f14 = -(cell4.computedPadLeft + cell4.computedPadRight);
                int i24 = i23 + iIntValue4;
                float f15 = f14;
                float f16 = 0.0f;
                for (int i25 = i23; i25 < i24; i25++) {
                    f14 += fArrEnsureSize[i25];
                    f15 += fArrEnsureSize3[i25];
                    f16 += fArr5[i25];
                }
                float fMax5 = Math.max(0.0f, fCeil5 - f14);
                float fMax6 = Math.max(0.0f, fCeil6 - f15);
                while (i23 < i24) {
                    float f17 = f16 == 0.0f ? 1.0f / iIntValue4 : fArr5[i23] / f16;
                    fArrEnsureSize[i23] = (fMax5 * f17) + fArrEnsureSize[i23];
                    fArrEnsureSize3[i23] = (f17 * fMax6) + fArrEnsureSize3[i23];
                    i23++;
                }
            }
        }
        float f18 = this.padRight.get(this) + this.padLeft.get(this);
        float f19 = this.padBottom.get(this) + this.padTop.get(this);
        this.tableMinWidth = f18;
        this.tablePrefWidth = f18;
        for (int i26 = 0; i26 < i12; i26++) {
            this.tableMinWidth += fArrEnsureSize[i26];
            this.tablePrefWidth += fArrEnsureSize3[i26];
        }
        this.tableMinHeight = f19;
        this.tablePrefHeight = f19;
        for (int i27 = 0; i27 < i13; i27++) {
            float f20 = this.tableMinHeight;
            float f21 = fArr4[i27];
            this.tableMinHeight = f20 + f21;
            this.tablePrefHeight = Math.max(f21, fArrEnsureSize4[i27]) + this.tablePrefHeight;
        }
        this.tablePrefWidth = Math.max(this.tableMinWidth, this.tablePrefWidth);
        this.tablePrefHeight = Math.max(this.tableMinHeight, this.tablePrefHeight);
    }

    private void drawDebugRects(ShapeRenderer shapeRenderer) {
        float x;
        float y;
        if (this.debugRects == null || !getDebug()) {
            return;
        }
        shapeRenderer.set(ShapeRenderer.ShapeType.Line);
        if (getStage() != null) {
            shapeRenderer.setColor(getStage().getDebugColor());
        }
        if (isTransform()) {
            x = 0.0f;
            y = 0.0f;
        } else {
            x = getX();
            y = getY();
        }
        int i = this.debugRects.size;
        for (int i2 = 0; i2 < i; i2++) {
            DebugRect debugRect = this.debugRects.get(i2);
            shapeRenderer.setColor(debugRect.color);
            shapeRenderer.rect(debugRect.x + x, debugRect.y + y, debugRect.width, debugRect.height);
        }
    }

    private void endRow() {
        Array<Cell> array = this.cells;
        Cell[] cellArr = array.items;
        int iIntValue = 0;
        for (int i = array.size - 1; i >= 0; i--) {
            Cell cell = cellArr[i];
            if (cell.endRow) {
                break;
            }
            iIntValue += cell.colspan.intValue();
        }
        this.columns = Math.max(this.columns, iIntValue);
        this.rows++;
        this.cells.peek().endRow = true;
    }

    private float[] ensureSize(float[] fArr, int i) {
        if (fArr == null || fArr.length < i) {
            return new float[i];
        }
        Arrays.fill(fArr, 0, i, 0.0f);
        return fArr;
    }

    private Cell obtainCell() {
        Cell cellObtain = cellPool.obtain();
        cellObtain.setTable(this);
        return cellObtain;
    }

    public <T extends Actor> Cell<T> add(@Null T t) {
        Cell<T> cellObtainCell = obtainCell();
        cellObtainCell.actor = t;
        if (this.implicitEndRow) {
            this.implicitEndRow = false;
            this.rows--;
            this.cells.peek().endRow = false;
        }
        Array<Cell> array = this.cells;
        int i = array.size;
        if (i > 0) {
            Cell cellPeek = array.peek();
            if (cellPeek.endRow) {
                cellObtainCell.column = 0;
                cellObtainCell.row = cellPeek.row + 1;
            } else {
                cellObtainCell.column = cellPeek.colspan.intValue() + cellPeek.column;
                cellObtainCell.row = cellPeek.row;
            }
            if (cellObtainCell.row > 0) {
                Cell[] cellArr = this.cells.items;
                loop0: for (int i2 = i - 1; i2 >= 0; i2--) {
                    Cell cell = cellArr[i2];
                    int i3 = cell.column;
                    int iIntValue = cell.colspan.intValue() + i3;
                    while (i3 < iIntValue) {
                        if (i3 == cellObtainCell.column) {
                            cellObtainCell.cellAboveIndex = i2;
                            break loop0;
                        }
                        i3++;
                    }
                }
            }
        } else {
            cellObtainCell.column = 0;
            cellObtainCell.row = 0;
        }
        this.cells.add(cellObtainCell);
        cellObtainCell.set(this.cellDefaults);
        int i4 = cellObtainCell.column;
        Array<Cell> array2 = this.columnDefaults;
        if (i4 < array2.size) {
            cellObtainCell.merge(array2.get(i4));
        }
        cellObtainCell.merge(this.rowDefaults);
        if (t != null) {
            addActor(t);
        }
        return cellObtainCell;
    }

    public Table align(int i) {
        this.align = i;
        return this;
    }

    public Table background(@Null Drawable drawable) {
        setBackground(drawable);
        return this;
    }

    public Table bottom() {
        this.align = (this.align | 4) & (-3);
        return this;
    }

    public Table center() {
        this.align = 1;
        return this;
    }

    @Override // com.badlogic.gdx.scenes.scene2d.Group
    public void clearChildren(boolean z) {
        Array<Cell> array = this.cells;
        Cell[] cellArr = array.items;
        for (int i = array.size - 1; i >= 0; i--) {
            Actor actor = cellArr[i].actor;
            if (actor != null) {
                actor.remove();
            }
        }
        Pool<Cell> pool = cellPool;
        pool.freeAll(this.cells);
        this.cells.clear();
        this.rows = 0;
        this.columns = 0;
        Cell cell = this.rowDefaults;
        if (cell != null) {
            pool.free(cell);
        }
        this.rowDefaults = null;
        this.implicitEndRow = false;
        super.clearChildren(z);
    }

    public Table clip() {
        setClip(true);
        return this;
    }

    public Cell columnDefaults(int i) {
        Array<Cell> array = this.columnDefaults;
        Cell cellObtainCell = array.size > i ? array.get(i) : null;
        if (cellObtainCell == null) {
            cellObtainCell = obtainCell();
            cellObtainCell.clear();
            Array<Cell> array2 = this.columnDefaults;
            int i2 = array2.size;
            if (i >= i2) {
                while (i2 < i) {
                    this.columnDefaults.add(null);
                    i2++;
                }
                this.columnDefaults.add(cellObtainCell);
            } else {
                array2.set(i, cellObtainCell);
            }
        }
        return cellObtainCell;
    }

    public Table debugActor() {
        super.setDebug(true);
        Debug debug = this.debug;
        Debug debug2 = Debug.actor;
        if (debug != debug2) {
            this.debug = debug2;
            invalidate();
        }
        return this;
    }

    public Table debugCell() {
        super.setDebug(true);
        Debug debug = this.debug;
        Debug debug2 = Debug.cell;
        if (debug != debug2) {
            this.debug = debug2;
            invalidate();
        }
        return this;
    }

    public Table debugTable() {
        super.setDebug(true);
        Debug debug = this.debug;
        Debug debug2 = Debug.table;
        if (debug != debug2) {
            this.debug = debug2;
            invalidate();
        }
        return this;
    }

    public Cell defaults() {
        return this.cellDefaults;
    }

    @Override // com.badlogic.gdx.scenes.scene2d.ui.WidgetGroup, com.badlogic.gdx.scenes.scene2d.Group, com.badlogic.gdx.scenes.scene2d.Actor
    public void draw(Batch batch, float f) {
        validate();
        if (!isTransform()) {
            drawBackground(batch, f, getX(), getY());
            super.draw(batch, f);
            return;
        }
        applyTransform(batch, computeTransform());
        drawBackground(batch, f, 0.0f, 0.0f);
        if (this.clip) {
            batch.flush();
            float f2 = this.padLeft.get(this);
            float f3 = this.padBottom.get(this);
            if (clipBegin(f2, f3, (getWidth() - f2) - this.padRight.get(this), (getHeight() - f3) - this.padTop.get(this))) {
                drawChildren(batch, f);
                batch.flush();
                clipEnd();
            }
        } else {
            drawChildren(batch, f);
        }
        resetTransform(batch);
    }

    public void drawBackground(Batch batch, float f, float f2, float f3) {
        if (this.background == null) {
            return;
        }
        Color color = getColor();
        batch.setColor(color.r, color.g, color.b, color.f202a * f);
        this.background.draw(batch, f2, f3, getWidth(), getHeight());
    }

    @Override // com.badlogic.gdx.scenes.scene2d.Group, com.badlogic.gdx.scenes.scene2d.Actor
    public void drawDebug(ShapeRenderer shapeRenderer) {
        float f;
        float f2;
        if (!isTransform()) {
            drawDebugRects(shapeRenderer);
            super.drawDebug(shapeRenderer);
            return;
        }
        applyTransform(shapeRenderer, computeTransform());
        drawDebugRects(shapeRenderer);
        if (this.clip) {
            shapeRenderer.flush();
            float width = getWidth();
            float height = getHeight();
            if (this.background != null) {
                f = this.padLeft.get(this);
                f2 = this.padBottom.get(this);
                width -= this.padRight.get(this) + f;
                height -= this.padTop.get(this) + f2;
            } else {
                f = 0.0f;
                f2 = 0.0f;
            }
            if (clipBegin(f, f2, width, height)) {
                drawDebugChildren(shapeRenderer);
                clipEnd();
            }
        } else {
            drawDebugChildren(shapeRenderer);
        }
        resetTransform(shapeRenderer);
    }

    @Override // com.badlogic.gdx.scenes.scene2d.Actor
    public void drawDebugBounds(ShapeRenderer shapeRenderer) {
    }

    public int getAlign() {
        return this.align;
    }

    @Null
    public Drawable getBackground() {
        return this.background;
    }

    @Null
    public <T extends Actor> Cell<T> getCell(T t) {
        if (t == null) {
            throw new IllegalArgumentException("actor cannot be null.");
        }
        Array<Cell> array = this.cells;
        Cell<T>[] cellArr = array.items;
        int i = array.size;
        for (int i2 = 0; i2 < i; i2++) {
            Cell<T> cell = cellArr[i2];
            if (cell.actor == t) {
                return cell;
            }
        }
        return null;
    }

    public Array<Cell> getCells() {
        return this.cells;
    }

    public boolean getClip() {
        return this.clip;
    }

    public float getColumnMinWidth(int i) {
        if (this.sizeInvalid) {
            computeSize();
        }
        return this.columnMinWidth[i];
    }

    public float getColumnPrefWidth(int i) {
        if (this.sizeInvalid) {
            computeSize();
        }
        return this.columnPrefWidth[i];
    }

    public float getColumnWidth(int i) {
        float[] fArr = this.columnWidth;
        if (fArr == null) {
            return 0.0f;
        }
        return fArr[i];
    }

    public int getColumns() {
        return this.columns;
    }

    @Override // com.badlogic.gdx.scenes.scene2d.ui.WidgetGroup, com.badlogic.gdx.scenes.scene2d.utils.Layout
    public float getMinHeight() {
        if (this.sizeInvalid) {
            computeSize();
        }
        return this.tableMinHeight;
    }

    @Override // com.badlogic.gdx.scenes.scene2d.ui.WidgetGroup, com.badlogic.gdx.scenes.scene2d.utils.Layout
    public float getMinWidth() {
        if (this.sizeInvalid) {
            computeSize();
        }
        return this.tableMinWidth;
    }

    public float getPadBottom() {
        return this.padBottom.get(this);
    }

    public Value getPadBottomValue() {
        return this.padBottom;
    }

    public float getPadLeft() {
        return this.padLeft.get(this);
    }

    public Value getPadLeftValue() {
        return this.padLeft;
    }

    public float getPadRight() {
        return this.padRight.get(this);
    }

    public Value getPadRightValue() {
        return this.padRight;
    }

    public float getPadTop() {
        return this.padTop.get(this);
    }

    public Value getPadTopValue() {
        return this.padTop;
    }

    public float getPadX() {
        return this.padRight.get(this) + this.padLeft.get(this);
    }

    public float getPadY() {
        return this.padBottom.get(this) + this.padTop.get(this);
    }

    @Override // com.badlogic.gdx.scenes.scene2d.ui.WidgetGroup, com.badlogic.gdx.scenes.scene2d.utils.Layout
    public float getPrefHeight() {
        if (this.sizeInvalid) {
            computeSize();
        }
        float f = this.tablePrefHeight;
        Drawable drawable = this.background;
        return drawable != null ? Math.max(f, drawable.getMinHeight()) : f;
    }

    @Override // com.badlogic.gdx.scenes.scene2d.ui.WidgetGroup, com.badlogic.gdx.scenes.scene2d.utils.Layout
    public float getPrefWidth() {
        if (this.sizeInvalid) {
            computeSize();
        }
        float f = this.tablePrefWidth;
        Drawable drawable = this.background;
        return drawable != null ? Math.max(f, drawable.getMinWidth()) : f;
    }

    public int getRow(float f) {
        int i = this.cells.size;
        if (i == 0) {
            return -1;
        }
        float padTop = getPadTop() + f;
        Cell[] cellArr = this.cells.items;
        int i2 = 0;
        int i3 = 0;
        while (i2 < i) {
            int i4 = i2 + 1;
            Cell cell = cellArr[i2];
            if (cell.actorY + cell.computedPadTop < padTop) {
                return i3;
            }
            if (cell.endRow) {
                i3++;
            }
            i2 = i4;
        }
        return -1;
    }

    public float getRowHeight(int i) {
        float[] fArr = this.rowHeight;
        if (fArr == null) {
            return 0.0f;
        }
        return fArr[i];
    }

    public float getRowMinHeight(int i) {
        if (this.sizeInvalid) {
            computeSize();
        }
        return this.rowMinHeight[i];
    }

    public float getRowPrefHeight(int i) {
        if (this.sizeInvalid) {
            computeSize();
        }
        return this.rowPrefHeight[i];
    }

    public int getRows() {
        return this.rows;
    }

    @Null
    public Skin getSkin() {
        return this.skin;
    }

    public Debug getTableDebug() {
        return this.debug;
    }

    @Override // com.badlogic.gdx.scenes.scene2d.ui.WidgetGroup, com.badlogic.gdx.scenes.scene2d.Group, com.badlogic.gdx.scenes.scene2d.Actor
    @Null
    public Actor hit(float f, float f2, boolean z) {
        if (!this.clip || (!(z && getTouchable() == Touchable.disabled) && f >= 0.0f && f < getWidth() && f2 >= 0.0f && f2 < getHeight())) {
            return super.hit(f, f2, z);
        }
        return null;
    }

    @Override // com.badlogic.gdx.scenes.scene2d.ui.WidgetGroup, com.badlogic.gdx.scenes.scene2d.utils.Layout
    public void invalidate() {
        this.sizeInvalid = true;
        super.invalidate();
    }

    /* JADX WARN: Code duplicated, block: B:118:0x029e  */
    /* JADX WARN: Code duplicated, block: B:120:0x02af A[LOOP:14: B:119:0x02ad->B:120:0x02af, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:123:0x02d0  */
    /* JADX WARN: Code duplicated, block: B:125:0x02f0  */
    /* JADX WARN: Code duplicated, block: B:126:0x02f9  */
    /* JADX WARN: Code duplicated, block: B:129:0x0301  */
    /* JADX WARN: Code duplicated, block: B:131:0x0328  */
    /* JADX WARN: Code duplicated, block: B:132:0x0331  */
    /* JADX WARN: Code duplicated, block: B:135:0x033c  */
    /* JADX WARN: Code duplicated, block: B:136:0x033f  */
    /* JADX WARN: Code duplicated, block: B:138:0x0343  */
    /* JADX WARN: Code duplicated, block: B:139:0x034b  */
    /* JADX WARN: Code duplicated, block: B:142:0x0359  */
    /* JADX WARN: Code duplicated, block: B:144:0x0360  */
    /* JADX WARN: Code duplicated, block: B:146:0x0364  */
    /* JADX WARN: Code duplicated, block: B:147:0x0371  */
    /* JADX WARN: Code duplicated, block: B:150:0x0391  */
    /* JADX WARN: Code duplicated, block: B:151:0x03bb  */
    /* JADX WARN: Code duplicated, block: B:154:0x03c0  */
    /* JADX WARN: Code duplicated, block: B:155:0x03ce  */
    /* JADX WARN: Code duplicated, block: B:158:0x03d4  */
    /* JADX WARN: Code duplicated, block: B:159:0x03db  */
    /* JADX WARN: Code duplicated, block: B:163:0x03fb  */
    /* JADX WARN: Code duplicated, block: B:165:0x0401  */
    /* JADX WARN: Code duplicated, block: B:169:0x040f  */
    /* JADX WARN: Code duplicated, block: B:198:0x0406 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:201:? A[RETURN, SYNTHETIC] */
    @Override // com.badlogic.gdx.scenes.scene2d.ui.WidgetGroup, com.badlogic.gdx.scenes.scene2d.utils.Layout
    public void layout() {
        float[] fArr;
        float[] fArr2;
        float fC;
        float f;
        float f2;
        float f3;
        int i;
        float f4;
        Actor[] actorArr;
        int i2;
        int i3;
        Object obj;
        Cell cell;
        int i4;
        int iIntValue;
        float f5;
        float f6;
        float f7;
        float fFloatValue;
        float fFloatValue2;
        int i5;
        float[] fArr3;
        int iIntValue2;
        Actor actor;
        float f8;
        float f9;
        Table table = this;
        if (table.sizeInvalid) {
            computeSize();
        }
        float width = getWidth();
        float height = getHeight();
        int i6 = table.columns;
        int i7 = table.rows;
        float[] fArr4 = table.columnWidth;
        float[] fArr5 = table.rowHeight;
        float f10 = table.padLeft.get(table);
        float f11 = table.padRight.get(table) + f10;
        float f12 = table.padTop.get(table);
        float f13 = table.padBottom.get(table) + f12;
        float f14 = table.tablePrefWidth;
        float f15 = table.tableMinWidth;
        float f16 = f14 - f15;
        if (f16 == 0.0f) {
            fArr = table.columnMinWidth;
        } else {
            float fMin = Math.min(f16, Math.max(0.0f, width - f15));
            float[] fArrEnsureSize = table.ensureSize(columnWeightedWidth, i6);
            columnWeightedWidth = fArrEnsureSize;
            float[] fArr6 = table.columnMinWidth;
            float[] fArr7 = table.columnPrefWidth;
            for (int i8 = 0; i8 < i6; i8++) {
                float f17 = fArr7[i8];
                float f18 = fArr6[i8];
                fArrEnsureSize[i8] = (((f17 - f18) / f16) * fMin) + f18;
            }
            fArr = fArrEnsureSize;
        }
        float f19 = table.tablePrefHeight - table.tableMinHeight;
        if (f19 == 0.0f) {
            fArr2 = table.rowMinHeight;
        } else {
            float[] fArrEnsureSize2 = table.ensureSize(rowWeightedHeight, i7);
            rowWeightedHeight = fArrEnsureSize2;
            float fMin2 = Math.min(f19, Math.max(0.0f, height - table.tableMinHeight));
            float[] fArr8 = table.rowMinHeight;
            float[] fArr9 = table.rowPrefHeight;
            for (int i9 = 0; i9 < i7; i9++) {
                float f20 = fArr9[i9];
                float f21 = fArr8[i9];
                fArrEnsureSize2[i9] = (((f20 - f21) / f19) * fMin2) + f21;
            }
            fArr2 = fArrEnsureSize2;
        }
        Array<Cell> array = table.cells;
        Cell[] cellArr = array.items;
        int i10 = array.size;
        int i11 = 0;
        while (i11 < i10) {
            Cell cell2 = cellArr[i11];
            int i12 = cell2.column;
            Cell[] cellArr2 = cellArr;
            int i13 = cell2.row;
            int i14 = i10;
            Actor actor2 = cell2.actor;
            float f22 = height;
            int iIntValue3 = cell2.colspan.intValue();
            float f23 = f13;
            int i15 = i12 + iIntValue3;
            float f24 = width;
            int i16 = i7;
            float f25 = 0.0f;
            for (int i17 = i12; i17 < i15; i17++) {
                f25 += fArr[i17];
            }
            float f26 = fArr2[i13];
            float f27 = cell2.prefWidth.get(actor2);
            float[] fArr10 = fArr2;
            float f28 = cell2.prefHeight.get(actor2);
            float[] fArr11 = fArr;
            float f29 = cell2.minWidth.get(actor2);
            float f30 = f11;
            float f31 = cell2.minHeight.get(actor2);
            int i18 = i6;
            float f32 = cell2.maxWidth.get(actor2);
            float f33 = cell2.maxHeight.get(actor2);
            if (f27 < f29) {
                f27 = f29;
            }
            if (f28 < f31) {
                f28 = f31;
            }
            if (f32 <= 0.0f || f27 <= f32) {
                f32 = f27;
            }
            if (f33 <= 0.0f || f28 <= f33) {
                f33 = f28;
            }
            cell2.actorWidth = Math.min((f25 - cell2.computedPadLeft) - cell2.computedPadRight, f32);
            cell2.actorHeight = Math.min((f26 - cell2.computedPadTop) - cell2.computedPadBottom, f33);
            if (iIntValue3 == 1) {
                fArr4[i12] = Math.max(fArr4[i12], f25);
            }
            fArr5[i13] = Math.max(fArr5[i13], f26);
            i11++;
            table = this;
            cellArr = cellArr2;
            i10 = i14;
            height = f22;
            f13 = f23;
            i7 = i16;
            width = f24;
            fArr2 = fArr10;
            fArr = fArr11;
            f11 = f30;
            i6 = i18;
        }
        float f34 = width;
        float f35 = height;
        int i19 = i6;
        int i20 = i7;
        int i21 = i10;
        float f36 = f11;
        float f37 = f13;
        float[] fArr12 = fArr;
        Cell[] cellArr3 = cellArr;
        float[] fArr13 = table.expandWidth;
        float[] fArr14 = table.expandHeight;
        float f38 = 0.0f;
        for (int i22 = 0; i22 < i19; i22++) {
            f38 += fArr13[i22];
        }
        float f39 = 0.0f;
        if (f38 > 0.0f) {
            float f40 = f34 - f36;
            for (int i23 = 0; i23 < i19; i23++) {
                f40 -= fArr4[i23];
            }
            if (f40 > 0.0f) {
                float f41 = 0.0f;
                int i24 = 0;
                int i25 = 0;
                while (i24 < i19) {
                    float f42 = fArr13[i24];
                    if (f42 != f39) {
                        float f43 = (f42 * f40) / f38;
                        fArr4[i24] = fArr4[i24] + f43;
                        f41 += f43;
                        i25 = i24;
                    }
                    i24++;
                    f39 = 0.0f;
                }
                fArr4[i25] = (f40 - f41) + fArr4[i25];
            }
        }
        float f44 = 0.0f;
        for (int i26 = 0; i26 < i20; i26++) {
            f44 += fArr14[i26];
        }
        float f45 = 0.0f;
        if (f44 > 0.0f) {
            float f46 = f35 - f37;
            for (int i27 = 0; i27 < i20; i27++) {
                f46 -= fArr5[i27];
            }
            if (f46 > 0.0f) {
                float f47 = 0.0f;
                int i28 = 0;
                int i29 = 0;
                while (i28 < i20) {
                    float f48 = fArr14[i28];
                    if (f48 != f45) {
                        float f49 = (f48 * f46) / f44;
                        fArr5[i28] = fArr5[i28] + f49;
                        f47 += f49;
                        i29 = i28;
                    }
                    i28++;
                    f45 = 0.0f;
                }
                fArr5[i29] = (f46 - f47) + fArr5[i29];
            }
        }
        int i30 = i21;
        for (int i31 = 0; i31 < i30; i31++) {
            Cell cell3 = cellArr3[i31];
            int iIntValue4 = cell3.colspan.intValue();
            if (iIntValue4 != 1) {
                int i32 = cell3.column;
                int i33 = i32 + iIntValue4;
                float f50 = 0.0f;
                while (i32 < i33) {
                    f50 += fArr12[i32] - fArr4[i32];
                    i32++;
                }
                float fMax = (f50 - Math.max(0.0f, cell3.computedPadLeft + cell3.computedPadRight)) / iIntValue4;
                if (fMax > 0.0f) {
                    int i34 = cell3.column;
                    int i35 = iIntValue4 + i34;
                    while (i34 < i35) {
                        fArr4[i34] = fArr4[i34] + fMax;
                        i34++;
                    }
                }
            }
        }
        float f51 = f36;
        for (int i36 = 0; i36 < i19; i36++) {
            f51 += fArr4[i36];
        }
        float f52 = f37;
        for (int i37 = 0; i37 < i20; i37++) {
            f52 += fArr5[i37];
        }
        int i38 = table.align;
        float fC2 = (i38 & 16) != 0 ? (f34 - f51) + f10 : (i38 & 8) == 0 ? DM.c(f34, f51, 2.0f, f10) : f10;
        if ((i38 & 4) == 0) {
            if ((i38 & 2) == 0) {
                fC = f12;
                f = f35;
                fC = DM.c(f, f52, 2.0f, fC);
            }
            f2 = fC2;
            f3 = fC;
            i = 0;
            while (i < i30) {
                cell = cellArr3[i];
                i4 = cell.column;
                iIntValue = cell.colspan.intValue() + i4;
                f5 = 0.0f;
                while (i4 < iIntValue) {
                    f5 += fArr4[i4];
                    i4++;
                }
                float f53 = cell.computedPadLeft;
                f6 = f5 - (cell.computedPadRight + f53);
                f7 = f2 + f53;
                fFloatValue = cell.fillX.floatValue();
                fFloatValue2 = cell.fillY.floatValue();
                if (fFloatValue > 0.0f) {
                    i5 = i30;
                    fArr3 = fArr4;
                    cell.actorWidth = Math.max(fFloatValue * f6, cell.minWidth.get(cell.actor));
                    f9 = cell.maxWidth.get(cell.actor);
                    if (f9 > 0.0f) {
                        cell.actorWidth = Math.min(cell.actorWidth, f9);
                    }
                } else {
                    i5 = i30;
                    fArr3 = fArr4;
                }
                if (fFloatValue2 > 0.0f) {
                    cell.actorHeight = Math.max(((fArr5[cell.row] * fFloatValue2) - cell.computedPadTop) - cell.computedPadBottom, cell.minHeight.get(cell.actor));
                    f8 = cell.maxHeight.get(cell.actor);
                    if (f8 > 0.0f) {
                        cell.actorHeight = Math.min(cell.actorHeight, f8);
                    }
                }
                iIntValue2 = cell.align.intValue();
                if ((iIntValue2 & 8) != 0) {
                    cell.actorX = f7;
                } else if ((iIntValue2 & 16) != 0) {
                    cell.actorX = (f7 + f6) - cell.actorWidth;
                } else {
                    cell.actorX = DM.c(f6, cell.actorWidth, 2.0f, f7);
                }
                if ((iIntValue2 & 2) != 0) {
                    cell.actorY = cell.computedPadTop;
                } else {
                    if ((iIntValue2 & 4) != 0) {
                        cell.actorY = (fArr5[cell.row] - cell.actorHeight) - cell.computedPadBottom;
                    } else {
                        cell.actorY = (((fArr5[cell.row] - cell.actorHeight) + cell.computedPadTop) - cell.computedPadBottom) / 2.0f;
                    }
                    cell.actorY = ((f - f3) - cell.actorY) - cell.actorHeight;
                    if (table.round) {
                        cell.actorWidth = (float) Math.ceil(cell.actorWidth);
                        cell.actorHeight = (float) Math.ceil(cell.actorHeight);
                        cell.actorX = (float) Math.floor(cell.actorX);
                        cell.actorY = (float) Math.floor(cell.actorY);
                    }
                    actor = cell.actor;
                    if (actor != null) {
                        actor.setBounds(cell.actorX, cell.actorY, cell.actorWidth, cell.actorHeight);
                    }
                    if (cell.endRow) {
                        f3 += fArr5[cell.row];
                        f2 = fC2;
                    } else {
                        f2 = f6 + cell.computedPadRight + f7;
                    }
                    i++;
                    fC = fC;
                    fArr4 = fArr3;
                    i30 = i5;
                    f = f;
                }
                cell.actorY = ((f - f3) - cell.actorY) - cell.actorHeight;
                if (table.round) {
                    cell.actorWidth = (float) Math.ceil(cell.actorWidth);
                    cell.actorHeight = (float) Math.ceil(cell.actorHeight);
                    cell.actorX = (float) Math.floor(cell.actorX);
                    cell.actorY = (float) Math.floor(cell.actorY);
                }
                actor = cell.actor;
                if (actor != null) {
                    actor.setBounds(cell.actorX, cell.actorY, cell.actorWidth, cell.actorHeight);
                }
                if (cell.endRow) {
                    f3 += fArr5[cell.row];
                    f2 = fC2;
                } else {
                    f2 = f6 + cell.computedPadRight + f7;
                }
                i++;
                fC = fC;
                fArr4 = fArr3;
                i30 = i5;
                f = f;
            }
            f4 = fC;
            SnapshotArray<Actor> children = getChildren();
            actorArr = children.items;
            i2 = children.size;
            for (i3 = 0; i3 < i2; i3++) {
                obj = actorArr[i3];
                if (obj instanceof Layout) {
                    ((Layout) obj).validate();
                }
            }
            if (table.debug != Debug.none) {
                table.addDebugRects(fC2, f4, f51 - f36, f52 - f37);
            }
        }
        fC = (f35 - f52) + f12;
        fC = f12;
        f = f35;
        f2 = fC2;
        f3 = fC;
        i = 0;
        while (i < i30) {
            cell = cellArr3[i];
            i4 = cell.column;
            iIntValue = cell.colspan.intValue() + i4;
            f5 = 0.0f;
            while (i4 < iIntValue) {
                f5 += fArr4[i4];
                i4++;
            }
            float f54 = cell.computedPadLeft;
            f6 = f5 - (cell.computedPadRight + f54);
            f7 = f2 + f54;
            fFloatValue = cell.fillX.floatValue();
            fFloatValue2 = cell.fillY.floatValue();
            if (fFloatValue > 0.0f) {
                i5 = i30;
                fArr3 = fArr4;
                cell.actorWidth = Math.max(fFloatValue * f6, cell.minWidth.get(cell.actor));
                f9 = cell.maxWidth.get(cell.actor);
                if (f9 > 0.0f) {
                    cell.actorWidth = Math.min(cell.actorWidth, f9);
                }
            } else {
                i5 = i30;
                fArr3 = fArr4;
            }
            if (fFloatValue2 > 0.0f) {
                cell.actorHeight = Math.max(((fArr5[cell.row] * fFloatValue2) - cell.computedPadTop) - cell.computedPadBottom, cell.minHeight.get(cell.actor));
                f8 = cell.maxHeight.get(cell.actor);
                if (f8 > 0.0f) {
                    cell.actorHeight = Math.min(cell.actorHeight, f8);
                }
            }
            iIntValue2 = cell.align.intValue();
            if ((iIntValue2 & 8) != 0) {
                cell.actorX = f7;
            } else if ((iIntValue2 & 16) != 0) {
                cell.actorX = (f7 + f6) - cell.actorWidth;
            } else {
                cell.actorX = DM.c(f6, cell.actorWidth, 2.0f, f7);
            }
            if ((iIntValue2 & 2) != 0) {
                cell.actorY = cell.computedPadTop;
            } else {
                if ((iIntValue2 & 4) != 0) {
                    cell.actorY = (fArr5[cell.row] - cell.actorHeight) - cell.computedPadBottom;
                } else {
                    cell.actorY = (((fArr5[cell.row] - cell.actorHeight) + cell.computedPadTop) - cell.computedPadBottom) / 2.0f;
                }
                cell.actorY = ((f - f3) - cell.actorY) - cell.actorHeight;
                if (table.round) {
                    cell.actorWidth = (float) Math.ceil(cell.actorWidth);
                    cell.actorHeight = (float) Math.ceil(cell.actorHeight);
                    cell.actorX = (float) Math.floor(cell.actorX);
                    cell.actorY = (float) Math.floor(cell.actorY);
                }
                actor = cell.actor;
                if (actor != null) {
                    actor.setBounds(cell.actorX, cell.actorY, cell.actorWidth, cell.actorHeight);
                }
                if (cell.endRow) {
                    f3 += fArr5[cell.row];
                    f2 = fC2;
                } else {
                    f2 = f6 + cell.computedPadRight + f7;
                }
                i++;
                fC = fC;
                fArr4 = fArr3;
                i30 = i5;
                f = f;
            }
            cell.actorY = ((f - f3) - cell.actorY) - cell.actorHeight;
            if (table.round) {
                cell.actorWidth = (float) Math.ceil(cell.actorWidth);
                cell.actorHeight = (float) Math.ceil(cell.actorHeight);
                cell.actorX = (float) Math.floor(cell.actorX);
                cell.actorY = (float) Math.floor(cell.actorY);
            }
            actor = cell.actor;
            if (actor != null) {
                actor.setBounds(cell.actorX, cell.actorY, cell.actorWidth, cell.actorHeight);
            }
            if (cell.endRow) {
                f3 += fArr5[cell.row];
                f2 = fC2;
            } else {
                f2 = f6 + cell.computedPadRight + f7;
            }
            i++;
            fC = fC;
            fArr4 = fArr3;
            i30 = i5;
            f = f;
        }
        f4 = fC;
        SnapshotArray<Actor> children2 = getChildren();
        actorArr = children2.items;
        i2 = children2.size;
        while (i3 < i2) {
            obj = actorArr[i3];
            if (obj instanceof Layout) {
                ((Layout) obj).validate();
            }
        }
        if (table.debug != Debug.none) {
            table.addDebugRects(fC2, f4, f51 - f36, f52 - f37);
        }
    }

    public Table left() {
        this.align = (this.align | 8) & (-17);
        return this;
    }

    public Table pad(Value value) {
        if (value == null) {
            throw new IllegalArgumentException("pad cannot be null.");
        }
        this.padTop = value;
        this.padLeft = value;
        this.padBottom = value;
        this.padRight = value;
        this.sizeInvalid = true;
        return this;
    }

    public Table padBottom(Value value) {
        if (value == null) {
            throw new IllegalArgumentException("padBottom cannot be null.");
        }
        this.padBottom = value;
        this.sizeInvalid = true;
        return this;
    }

    public Table padLeft(Value value) {
        if (value == null) {
            throw new IllegalArgumentException("padLeft cannot be null.");
        }
        this.padLeft = value;
        this.sizeInvalid = true;
        return this;
    }

    public Table padRight(Value value) {
        if (value == null) {
            throw new IllegalArgumentException("padRight cannot be null.");
        }
        this.padRight = value;
        this.sizeInvalid = true;
        return this;
    }

    public Table padTop(Value value) {
        if (value == null) {
            throw new IllegalArgumentException("padTop cannot be null.");
        }
        this.padTop = value;
        this.sizeInvalid = true;
        return this;
    }

    @Override // com.badlogic.gdx.scenes.scene2d.Group
    public boolean removeActor(Actor actor) {
        return removeActor(actor, true);
    }

    @Override // com.badlogic.gdx.scenes.scene2d.Group
    public Actor removeActorAt(int i, boolean z) {
        Actor actorRemoveActorAt = super.removeActorAt(i, z);
        Cell cell = getCell(actorRemoveActorAt);
        if (cell != null) {
            cell.actor = null;
        }
        return actorRemoveActorAt;
    }

    public void reset() {
        clearChildren();
        this.padTop = backgroundTop;
        this.padLeft = backgroundLeft;
        this.padBottom = backgroundBottom;
        this.padRight = backgroundRight;
        this.align = 1;
        debug(Debug.none);
        this.cellDefaults.reset();
        int i = this.columnDefaults.size;
        for (int i2 = 0; i2 < i; i2++) {
            Cell cell = this.columnDefaults.get(i2);
            if (cell != null) {
                cellPool.free(cell);
            }
        }
        this.columnDefaults.clear();
    }

    public Table right() {
        this.align = (this.align | 16) & (-9);
        return this;
    }

    public Cell row() {
        Array<Cell> array = this.cells;
        if (array.size > 0) {
            if (!this.implicitEndRow) {
                if (array.peek().endRow) {
                    return this.rowDefaults;
                }
                endRow();
            }
            invalidate();
        }
        this.implicitEndRow = false;
        Cell cell = this.rowDefaults;
        if (cell != null) {
            cellPool.free(cell);
        }
        Cell cellObtainCell = obtainCell();
        this.rowDefaults = cellObtainCell;
        cellObtainCell.clear();
        return this.rowDefaults;
    }

    public void setBackground(String str) {
        Skin skin = this.skin;
        if (skin == null) {
            throw new IllegalStateException("Table must have a skin set to use this method.");
        }
        setBackground(skin.getDrawable(str));
    }

    public void setClip(boolean z) {
        this.clip = z;
        setTransform(z);
        invalidate();
    }

    @Override // com.badlogic.gdx.scenes.scene2d.Actor
    public void setDebug(boolean z) {
        debug(z ? Debug.all : Debug.none);
    }

    public void setRound(boolean z) {
        this.round = z;
    }

    public void setSkin(@Null Skin skin) {
        this.skin = skin;
    }

    public Cell<Stack> stack(@Null Actor... actorArr) {
        Stack stack = new Stack();
        if (actorArr != null) {
            for (Actor actor : actorArr) {
                stack.addActor(actor);
            }
        }
        return add(stack);
    }

    public Table top() {
        this.align = (this.align | 2) & (-5);
        return this;
    }

    public Table(@Null Skin skin) {
        this.cells = new Array<>(4);
        this.columnDefaults = new Array<>(2);
        this.sizeInvalid = true;
        this.padTop = backgroundTop;
        this.padLeft = backgroundLeft;
        this.padBottom = backgroundBottom;
        this.padRight = backgroundRight;
        this.align = 1;
        this.debug = Debug.none;
        this.round = true;
        this.skin = skin;
        this.cellDefaults = obtainCell();
        setTransform(false);
        setTouchable(Touchable.childrenOnly);
    }

    public Table background(String str) {
        setBackground(str);
        return this;
    }

    public Table clip(boolean z) {
        setClip(z);
        return this;
    }

    @Override // com.badlogic.gdx.scenes.scene2d.Actor
    public Table debug() {
        super.debug();
        return this;
    }

    @Override // com.badlogic.gdx.scenes.scene2d.Group
    public Table debugAll() {
        super.debugAll();
        return this;
    }

    @Override // com.badlogic.gdx.scenes.scene2d.Group
    public boolean removeActor(Actor actor, boolean z) {
        if (!super.removeActor(actor, z)) {
            return false;
        }
        Cell cell = getCell(actor);
        if (cell == null) {
            return true;
        }
        cell.actor = null;
        return true;
    }

    public Table debug(Debug debug) {
        Debug debug2 = Debug.none;
        super.setDebug(debug != debug2);
        if (this.debug != debug) {
            this.debug = debug;
            if (debug == debug2) {
                clearDebugRects();
            } else {
                invalidate();
            }
        }
        return this;
    }

    public Table padBottom(float f) {
        this.padBottom = Value.Fixed.valueOf(f);
        this.sizeInvalid = true;
        return this;
    }

    public Table padLeft(float f) {
        this.padLeft = Value.Fixed.valueOf(f);
        this.sizeInvalid = true;
        return this;
    }

    public Table padRight(float f) {
        this.padRight = Value.Fixed.valueOf(f);
        this.sizeInvalid = true;
        return this;
    }

    public Table padTop(float f) {
        this.padTop = Value.Fixed.valueOf(f);
        this.sizeInvalid = true;
        return this;
    }

    public void setBackground(@Null Drawable drawable) {
        if (this.background == drawable) {
            return;
        }
        float padTop = getPadTop();
        float padLeft = getPadLeft();
        float padBottom = getPadBottom();
        float padRight = getPadRight();
        this.background = drawable;
        float padTop2 = getPadTop();
        float padLeft2 = getPadLeft();
        float padBottom2 = getPadBottom();
        float padRight2 = getPadRight();
        if (padTop + padBottom != padTop2 + padBottom2 || padLeft + padRight != padLeft2 + padRight2) {
            invalidateHierarchy();
        } else {
            if (padTop == padTop2 && padLeft == padLeft2 && padBottom == padBottom2 && padRight == padRight2) {
                return;
            }
            invalidate();
        }
    }

    public Table pad(Value value, Value value2, Value value3, Value value4) {
        if (value == null) {
            throw new IllegalArgumentException("top cannot be null.");
        }
        if (value2 == null) {
            throw new IllegalArgumentException("left cannot be null.");
        }
        if (value3 == null) {
            throw new IllegalArgumentException("bottom cannot be null.");
        }
        if (value4 != null) {
            this.padTop = value;
            this.padLeft = value2;
            this.padBottom = value3;
            this.padRight = value4;
            this.sizeInvalid = true;
            return this;
        }
        throw new IllegalArgumentException("right cannot be null.");
    }

    public Table pad(float f) {
        pad(Value.Fixed.valueOf(f));
        return this;
    }

    public Table pad(float f, float f2, float f3, float f4) {
        this.padTop = Value.Fixed.valueOf(f);
        this.padLeft = Value.Fixed.valueOf(f2);
        this.padBottom = Value.Fixed.valueOf(f3);
        this.padRight = Value.Fixed.valueOf(f4);
        this.sizeInvalid = true;
        return this;
    }

    public Table add(Actor... actorArr) {
        for (Actor actor : actorArr) {
            add(actor);
        }
        return this;
    }

    public Cell<Label> add(@Null CharSequence charSequence) {
        if (this.skin != null) {
            return add(new Label(charSequence, this.skin));
        }
        throw new IllegalStateException("Table must have a skin set to use this method.");
    }

    public Cell<Label> add(@Null CharSequence charSequence, String str) {
        if (this.skin != null) {
            return add(new Label(charSequence, (Label.LabelStyle) this.skin.get(str, Label.LabelStyle.class)));
        }
        throw new IllegalStateException("Table must have a skin set to use this method.");
    }

    public Cell<Label> add(@Null CharSequence charSequence, String str, @Null Color color) {
        if (this.skin != null) {
            return add(new Label(charSequence, new Label.LabelStyle(this.skin.getFont(str), color)));
        }
        throw new IllegalStateException("Table must have a skin set to use this method.");
    }

    public Cell<Label> add(@Null CharSequence charSequence, String str, String str2) {
        if (this.skin != null) {
            return add(new Label(charSequence, new Label.LabelStyle(this.skin.getFont(str), this.skin.getColor(str2))));
        }
        throw new IllegalStateException("Table must have a skin set to use this method.");
    }

    public Cell add() {
        return add((Actor) null);
    }
}
