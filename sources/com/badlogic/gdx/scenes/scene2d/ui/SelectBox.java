package com.badlogic.gdx.scenes.scene2d.ui;

import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.GlyphLayout;
import com.badlogic.gdx.math.Interpolation;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.scenes.scene2d.Actor;
import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.InputListener;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.Touchable;
import com.badlogic.gdx.scenes.scene2d.actions.Actions;
import com.badlogic.gdx.scenes.scene2d.utils.ArraySelection;
import com.badlogic.gdx.scenes.scene2d.utils.ClickListener;
import com.badlogic.gdx.scenes.scene2d.utils.Disableable;
import com.badlogic.gdx.scenes.scene2d.utils.Drawable;
import com.badlogic.gdx.utils.Array;
import com.badlogic.gdx.utils.Null;
import com.badlogic.gdx.utils.OrderedSet;
import com.badlogic.gdx.utils.Pool;
import com.badlogic.gdx.utils.Pools;

/* JADX INFO: loaded from: classes.dex */
public class SelectBox<T> extends Widget implements Disableable {
    static final Vector2 temp = new Vector2();
    private int alignment;
    private ClickListener clickListener;
    boolean disabled;
    final Array<T> items;
    private float prefHeight;
    private float prefWidth;
    SelectBoxScrollPane<T> scrollPane;
    boolean selectedPrefWidth;
    final ArraySelection<T> selection;
    SelectBoxStyle style;

    public static class SelectBoxScrollPane<T> extends ScrollPane {
        private InputListener hideListener;
        final List<T> list;
        int maxListCount;
        private Actor previousScrollFocus;
        final SelectBox<T> selectBox;
        private final Vector2 stagePosition;

        public SelectBoxScrollPane(final SelectBox<T> selectBox) {
            super((Actor) null, selectBox.style.scrollStyle);
            this.stagePosition = new Vector2();
            this.selectBox = selectBox;
            setOverscroll(false, false);
            setFadeScrollBars(false);
            setScrollingDisabled(true, false);
            List<T> listNewList = newList();
            this.list = listNewList;
            listNewList.setTouchable(Touchable.disabled);
            listNewList.setTypeToSelect(true);
            setActor(listNewList);
            listNewList.addListener(new ClickListener() { // from class: com.badlogic.gdx.scenes.scene2d.ui.SelectBox.SelectBoxScrollPane.1
                @Override // com.badlogic.gdx.scenes.scene2d.utils.ClickListener
                public void clicked(InputEvent inputEvent, float f, float f2) {
                    T selected = SelectBoxScrollPane.this.list.getSelected();
                    if (selected != null) {
                        selectBox.selection.items().clear(51);
                    }
                    selectBox.selection.choose(selected);
                    SelectBoxScrollPane.this.hide();
                }

                @Override // com.badlogic.gdx.scenes.scene2d.InputListener
                public boolean mouseMoved(InputEvent inputEvent, float f, float f2) {
                    int itemIndexAt = SelectBoxScrollPane.this.list.getItemIndexAt(f2);
                    if (itemIndexAt == -1) {
                        return true;
                    }
                    SelectBoxScrollPane.this.list.setSelectedIndex(itemIndexAt);
                    return true;
                }
            });
            addListener(new InputListener() { // from class: com.badlogic.gdx.scenes.scene2d.ui.SelectBox.SelectBoxScrollPane.2
                @Override // com.badlogic.gdx.scenes.scene2d.InputListener
                public void exit(InputEvent inputEvent, float f, float f2, int i, @Null Actor actor) {
                    Object selected;
                    if ((actor == null || !SelectBoxScrollPane.this.isAscendantOf(actor)) && (selected = selectBox.getSelected()) != null) {
                        SelectBoxScrollPane.this.list.selection.set((T) selected);
                    }
                }
            });
            this.hideListener = new InputListener() { // from class: com.badlogic.gdx.scenes.scene2d.ui.SelectBox.SelectBoxScrollPane.3
                @Override // com.badlogic.gdx.scenes.scene2d.InputListener
                public boolean keyDown(InputEvent inputEvent, int i) {
                    if (i == 66) {
                        selectBox.selection.choose(SelectBoxScrollPane.this.list.getSelected());
                    } else if (i != 111) {
                        if (i != 160) {
                            return false;
                        }
                        selectBox.selection.choose(SelectBoxScrollPane.this.list.getSelected());
                    }
                    SelectBoxScrollPane.this.hide();
                    inputEvent.stop();
                    return true;
                }

                @Override // com.badlogic.gdx.scenes.scene2d.InputListener
                public boolean touchDown(InputEvent inputEvent, float f, float f2, int i, int i2) {
                    if (SelectBoxScrollPane.this.isAscendantOf(inputEvent.getTarget())) {
                        return false;
                    }
                    SelectBoxScrollPane.this.list.selection.set((T) selectBox.getSelected());
                    SelectBoxScrollPane.this.hide();
                    return false;
                }
            };
        }

        @Override // com.badlogic.gdx.scenes.scene2d.ui.ScrollPane, com.badlogic.gdx.scenes.scene2d.Group, com.badlogic.gdx.scenes.scene2d.Actor
        public void act(float f) {
            super.act(f);
            toFront();
        }

        @Override // com.badlogic.gdx.scenes.scene2d.ui.ScrollPane, com.badlogic.gdx.scenes.scene2d.ui.WidgetGroup, com.badlogic.gdx.scenes.scene2d.Group, com.badlogic.gdx.scenes.scene2d.Actor
        public void draw(Batch batch, float f) {
            SelectBox<T> selectBox = this.selectBox;
            Vector2 vector2 = SelectBox.temp;
            selectBox.localToStageCoordinates(vector2.set(0.0f, 0.0f));
            if (!vector2.equals(this.stagePosition)) {
                hide();
            }
            super.draw(batch, f);
        }

        public List<T> getList() {
            return this.list;
        }

        public SelectBox<T> getSelectBox() {
            return this.selectBox;
        }

        public void hide() {
            if (this.list.isTouchable() && hasParent()) {
                this.list.setTouchable(Touchable.disabled);
                Stage stage = getStage();
                if (stage != null) {
                    stage.removeCaptureListener(this.hideListener);
                    stage.removeListener(this.list.getKeyListener());
                    Actor actor = this.previousScrollFocus;
                    if (actor != null && actor.getStage() == null) {
                        this.previousScrollFocus = null;
                    }
                    Actor scrollFocus = stage.getScrollFocus();
                    if (scrollFocus == null || isAscendantOf(scrollFocus)) {
                        stage.setScrollFocus(this.previousScrollFocus);
                    }
                }
                clearActions();
                this.selectBox.onHide(this);
            }
        }

        public List<T> newList() {
            return new List<T>(this.selectBox.style.listStyle) { // from class: com.badlogic.gdx.scenes.scene2d.ui.SelectBox.SelectBoxScrollPane.4
                @Override // com.badlogic.gdx.scenes.scene2d.ui.List
                public String toString(T t) {
                    return SelectBoxScrollPane.this.selectBox.toString(t);
                }
            };
        }

        @Override // com.badlogic.gdx.scenes.scene2d.Group, com.badlogic.gdx.scenes.scene2d.Actor
        public void setStage(Stage stage) {
            Stage stage2 = getStage();
            if (stage2 != null) {
                stage2.removeCaptureListener(this.hideListener);
                stage2.removeListener(this.list.getKeyListener());
            }
            super.setStage(stage);
        }

        /* JADX WARN: Code duplicated, block: B:29:0x00db A[PHI: r3
  0x00db: PHI (r3v16 float) = (r3v15 float), (r3v17 float) binds: [B:25:0x00c5, B:27:0x00d8] A[DONT_GENERATE, DONT_INLINE]] */
        public void show(Stage stage) {
            float f;
            if (this.list.isTouchable()) {
                return;
            }
            stage.addActor(this);
            stage.addCaptureListener(this.hideListener);
            stage.addListener(this.list.getKeyListener());
            this.selectBox.localToStageCoordinates(this.stagePosition.set(0.0f, 0.0f));
            float itemHeight = this.list.getItemHeight();
            int i = this.maxListCount;
            float fMin = (i <= 0 ? this.selectBox.items.size : Math.min(i, this.selectBox.items.size)) * itemHeight;
            Drawable drawable = getStyle().background;
            if (drawable != null) {
                fMin += drawable.getBottomHeight() + drawable.getTopHeight();
            }
            Drawable drawable2 = this.list.getStyle().background;
            if (drawable2 != null) {
                fMin += drawable2.getBottomHeight() + drawable2.getTopHeight();
            }
            float f2 = this.stagePosition.y;
            float height = (stage.getHeight() - f2) - this.selectBox.getHeight();
            boolean z = true;
            if (fMin > f2) {
                if (height > f2) {
                    fMin = Math.min(fMin, height);
                    z = false;
                } else {
                    fMin = f2;
                }
            }
            if (z) {
                setY(this.stagePosition.y - fMin);
            } else {
                setY(this.selectBox.getHeight() + this.stagePosition.y);
            }
            setHeight(fMin);
            validate();
            float fMax = Math.max(getPrefWidth(), this.selectBox.getWidth());
            setWidth(fMax);
            float width = this.stagePosition.x;
            if (fMax + width > stage.getWidth()) {
                width -= (getWidth() - this.selectBox.getWidth()) - 1.0f;
                f = width >= 0.0f ? width : 0.0f;
            }
            setX(f);
            validate();
            scrollTo(0.0f, (this.list.getHeight() - (this.selectBox.getSelectedIndex() * itemHeight)) - (itemHeight / 2.0f), 0.0f, 0.0f, true, true);
            updateVisualScroll();
            this.previousScrollFocus = null;
            Actor scrollFocus = stage.getScrollFocus();
            if (scrollFocus != null && !scrollFocus.isDescendantOf(this)) {
                this.previousScrollFocus = scrollFocus;
            }
            stage.setScrollFocus(this);
            this.list.selection.set(this.selectBox.getSelected());
            this.list.setTouchable(Touchable.enabled);
            clearActions();
            this.selectBox.onShow(this, z);
        }
    }

    public SelectBox(Skin skin) {
        this((SelectBoxStyle) skin.get(SelectBoxStyle.class));
    }

    public void clearItems() {
        Array<T> array = this.items;
        if (array.size == 0) {
            return;
        }
        array.clear();
        this.selection.clear();
        this.scrollPane.list.clearItems();
        invalidateHierarchy();
    }

    @Override // com.badlogic.gdx.scenes.scene2d.ui.Widget, com.badlogic.gdx.scenes.scene2d.Actor
    public void draw(Batch batch, float f) {
        float bottomHeight;
        float f2;
        validate();
        Drawable backgroundDrawable = getBackgroundDrawable();
        Color fontColor = getFontColor();
        BitmapFont bitmapFont = this.style.font;
        Color color = getColor();
        float x = getX();
        float y = getY();
        float width = getWidth();
        float height = getHeight();
        batch.setColor(color.r, color.g, color.b, color.f202a * f);
        if (backgroundDrawable != null) {
            backgroundDrawable.draw(batch, x, y, width, height);
        }
        T tFirst = this.selection.first();
        if (tFirst != null) {
            if (backgroundDrawable != null) {
                width -= backgroundDrawable.getRightWidth() + backgroundDrawable.getLeftWidth();
                float topHeight = height - (backgroundDrawable.getTopHeight() + backgroundDrawable.getBottomHeight());
                float leftWidth = backgroundDrawable.getLeftWidth() + x;
                bottomHeight = y + ((int) ((bitmapFont.getData().capHeight / 2.0f) + backgroundDrawable.getBottomHeight() + (topHeight / 2.0f)));
                f2 = leftWidth;
            } else {
                bottomHeight = y + ((int) ((bitmapFont.getData().capHeight / 2.0f) + (height / 2.0f)));
                f2 = x;
            }
            float f3 = bottomHeight;
            float f4 = width;
            bitmapFont.setColor(fontColor.r, fontColor.g, fontColor.b, fontColor.f202a * f);
            drawItem(batch, bitmapFont, tFirst, f2, f3, f4);
        }
    }

    public GlyphLayout drawItem(Batch batch, BitmapFont bitmapFont, T t, float f, float f2, float f3) {
        String string = toString(t);
        return bitmapFont.draw(batch, string, f, f2, 0, string.length(), f3, this.alignment, false, "...");
    }

    @Null
    public Drawable getBackgroundDrawable() {
        Drawable drawable;
        Drawable drawable2;
        Drawable drawable3;
        if (isDisabled() && (drawable3 = this.style.backgroundDisabled) != null) {
            return drawable3;
        }
        if (!this.scrollPane.hasParent() || (drawable2 = this.style.backgroundOpen) == null) {
            return (!isOver() || (drawable = this.style.backgroundOver) == null) ? this.style.background : drawable;
        }
        return drawable2;
    }

    public ClickListener getClickListener() {
        return this.clickListener;
    }

    public Color getFontColor() {
        Color color;
        if (!isDisabled() || (color = this.style.disabledFontColor) == null) {
            return (this.style.overFontColor == null || !(isOver() || this.scrollPane.hasParent())) ? this.style.fontColor : this.style.overFontColor;
        }
        return color;
    }

    public Array<T> getItems() {
        return this.items;
    }

    public List<T> getList() {
        return this.scrollPane.list;
    }

    public int getMaxListCount() {
        return this.scrollPane.maxListCount;
    }

    public float getMaxSelectedPrefWidth() {
        GlyphLayout glyphLayout = (GlyphLayout) Pools.get(GlyphLayout.class).obtain();
        float fMax = 0.0f;
        int i = 0;
        while (true) {
            Array<T> array = this.items;
            if (i >= array.size) {
                break;
            }
            glyphLayout.setText(this.style.font, toString(array.get(i)));
            fMax = Math.max(glyphLayout.width, fMax);
            i++;
        }
        Drawable drawable = this.style.background;
        if (drawable == null) {
            return fMax;
        }
        return Math.max(drawable.getRightWidth() + drawable.getLeftWidth() + fMax, drawable.getMinWidth());
    }

    @Override // com.badlogic.gdx.scenes.scene2d.ui.Widget, com.badlogic.gdx.scenes.scene2d.utils.Layout
    public float getPrefHeight() {
        validate();
        return this.prefHeight;
    }

    @Override // com.badlogic.gdx.scenes.scene2d.ui.Widget, com.badlogic.gdx.scenes.scene2d.utils.Layout
    public float getPrefWidth() {
        validate();
        return this.prefWidth;
    }

    public SelectBoxScrollPane getScrollPane() {
        return this.scrollPane;
    }

    @Null
    public T getSelected() {
        return this.selection.first();
    }

    public int getSelectedIndex() {
        OrderedSet<T> orderedSetItems = this.selection.items();
        if (orderedSetItems.size == 0) {
            return -1;
        }
        return this.items.indexOf(orderedSetItems.first(), false);
    }

    public boolean getSelectedPrefWidth() {
        return this.selectedPrefWidth;
    }

    public ArraySelection<T> getSelection() {
        return this.selection;
    }

    public SelectBoxStyle getStyle() {
        return this.style;
    }

    @Deprecated
    public void hideList() {
        hideScrollPane();
    }

    public void hideScrollPane() {
        this.scrollPane.hide();
    }

    @Override // com.badlogic.gdx.scenes.scene2d.utils.Disableable
    public boolean isDisabled() {
        return this.disabled;
    }

    public boolean isOver() {
        return this.clickListener.isOver();
    }

    @Override // com.badlogic.gdx.scenes.scene2d.ui.Widget, com.badlogic.gdx.scenes.scene2d.utils.Layout
    public void layout() {
        SelectBoxStyle selectBoxStyle = this.style;
        Drawable drawable = selectBoxStyle.background;
        BitmapFont bitmapFont = selectBoxStyle.font;
        if (drawable != null) {
            this.prefHeight = Math.max((bitmapFont.getCapHeight() + (drawable.getBottomHeight() + drawable.getTopHeight())) - (bitmapFont.getDescent() * 2.0f), drawable.getMinHeight());
        } else {
            this.prefHeight = bitmapFont.getCapHeight() - (bitmapFont.getDescent() * 2.0f);
        }
        Pool pool = Pools.get(GlyphLayout.class);
        GlyphLayout glyphLayout = (GlyphLayout) pool.obtain();
        if (this.selectedPrefWidth) {
            this.prefWidth = 0.0f;
            if (drawable != null) {
                this.prefWidth = drawable.getRightWidth() + drawable.getLeftWidth();
            }
            T selected = getSelected();
            if (selected != null) {
                glyphLayout.setText(bitmapFont, toString(selected));
                this.prefWidth += glyphLayout.width;
            }
        } else {
            int i = 0;
            float fMax = 0.0f;
            while (true) {
                Array<T> array = this.items;
                if (i >= array.size) {
                    break;
                }
                glyphLayout.setText(bitmapFont, toString(array.get(i)));
                fMax = Math.max(glyphLayout.width, fMax);
                i++;
            }
            this.prefWidth = fMax;
            if (drawable != null) {
                this.prefWidth = Math.max(drawable.getRightWidth() + drawable.getLeftWidth() + fMax, drawable.getMinWidth());
            }
            SelectBoxStyle selectBoxStyle2 = this.style;
            List.ListStyle listStyle = selectBoxStyle2.listStyle;
            ScrollPane.ScrollPaneStyle scrollPaneStyle = selectBoxStyle2.scrollStyle;
            float rightWidth = listStyle.selection.getRightWidth() + listStyle.selection.getLeftWidth() + fMax;
            Drawable drawable2 = scrollPaneStyle.background;
            if (drawable2 != null) {
                rightWidth = Math.max(drawable2.getRightWidth() + drawable2.getLeftWidth() + rightWidth, drawable2.getMinWidth());
            }
            SelectBoxScrollPane<T> selectBoxScrollPane = this.scrollPane;
            if (selectBoxScrollPane == null || !selectBoxScrollPane.disableY) {
                Drawable drawable3 = this.style.scrollStyle.vScroll;
                float minWidth = drawable3 != null ? drawable3.getMinWidth() : 0.0f;
                Drawable drawable4 = this.style.scrollStyle.vScrollKnob;
                rightWidth += Math.max(minWidth, drawable4 != null ? drawable4.getMinWidth() : 0.0f);
            }
            this.prefWidth = Math.max(this.prefWidth, rightWidth);
        }
        pool.free(glyphLayout);
    }

    public SelectBoxScrollPane<T> newScrollPane() {
        return new SelectBoxScrollPane<>(this);
    }

    public void onHide(Actor actor) {
        actor.getColor().f202a = 1.0f;
        actor.addAction(Actions.sequence(Actions.fadeOut(0.15f, Interpolation.fade), Actions.removeActor()));
    }

    public void onShow(Actor actor, boolean z) {
        actor.getColor().f202a = 0.0f;
        actor.addAction(Actions.fadeIn(0.3f, Interpolation.fade));
    }

    public void setAlignment(int i) {
        this.alignment = i;
    }

    @Override // com.badlogic.gdx.scenes.scene2d.utils.Disableable
    public void setDisabled(boolean z) {
        if (z && !this.disabled) {
            hideScrollPane();
        }
        this.disabled = z;
    }

    public void setItems(T... tArr) {
        if (tArr == null) {
            throw new IllegalArgumentException("newItems cannot be null.");
        }
        float prefWidth = getPrefWidth();
        this.items.clear();
        this.items.addAll(tArr);
        this.selection.validate();
        this.scrollPane.list.setItems(this.items);
        invalidate();
        if (prefWidth != getPrefWidth()) {
            invalidateHierarchy();
        }
    }

    public void setMaxListCount(int i) {
        this.scrollPane.maxListCount = i;
    }

    public void setScrollingDisabled(boolean z) {
        this.scrollPane.setScrollingDisabled(true, z);
        invalidateHierarchy();
    }

    public void setSelected(@Null T t) {
        if (this.items.contains(t, false)) {
            this.selection.set(t);
            return;
        }
        Array<T> array = this.items;
        if (array.size > 0) {
            this.selection.set(array.first());
        } else {
            this.selection.clear();
        }
    }

    public void setSelectedIndex(int i) {
        this.selection.set(this.items.get(i));
    }

    public void setSelectedPrefWidth(boolean z) {
        this.selectedPrefWidth = z;
    }

    @Override // com.badlogic.gdx.scenes.scene2d.Actor
    public void setStage(Stage stage) {
        if (stage == null) {
            this.scrollPane.hide();
        }
        super.setStage(stage);
    }

    public void setStyle(SelectBoxStyle selectBoxStyle) {
        if (selectBoxStyle == null) {
            throw new IllegalArgumentException("style cannot be null.");
        }
        this.style = selectBoxStyle;
        SelectBoxScrollPane<T> selectBoxScrollPane = this.scrollPane;
        if (selectBoxScrollPane != null) {
            selectBoxScrollPane.setStyle(selectBoxStyle.scrollStyle);
            this.scrollPane.list.setStyle(selectBoxStyle.listStyle);
        }
        invalidateHierarchy();
    }

    @Deprecated
    public void showList() {
        showScrollPane();
    }

    public void showScrollPane() {
        if (this.items.size == 0 || getStage() == null) {
            return;
        }
        this.scrollPane.show(getStage());
    }

    public String toString(T t) {
        return t.toString();
    }

    public static class SelectBoxStyle {

        @Null
        public Drawable background;

        @Null
        public Drawable backgroundDisabled;

        @Null
        public Drawable backgroundOpen;

        @Null
        public Drawable backgroundOver;

        @Null
        public Color disabledFontColor;
        public BitmapFont font;
        public Color fontColor;
        public List.ListStyle listStyle;

        @Null
        public Color overFontColor;
        public ScrollPane.ScrollPaneStyle scrollStyle;

        public SelectBoxStyle() {
            this.fontColor = new Color(1.0f, 1.0f, 1.0f, 1.0f);
        }

        public SelectBoxStyle(BitmapFont bitmapFont, Color color, @Null Drawable drawable, ScrollPane.ScrollPaneStyle scrollPaneStyle, List.ListStyle listStyle) {
            Color color2 = new Color(1.0f, 1.0f, 1.0f, 1.0f);
            this.fontColor = color2;
            this.font = bitmapFont;
            color2.set(color);
            this.background = drawable;
            this.scrollStyle = scrollPaneStyle;
            this.listStyle = listStyle;
        }

        public SelectBoxStyle(SelectBoxStyle selectBoxStyle) {
            Color color = new Color(1.0f, 1.0f, 1.0f, 1.0f);
            this.fontColor = color;
            this.font = selectBoxStyle.font;
            color.set(selectBoxStyle.fontColor);
            if (selectBoxStyle.overFontColor != null) {
                this.overFontColor = new Color(selectBoxStyle.overFontColor);
            }
            if (selectBoxStyle.disabledFontColor != null) {
                this.disabledFontColor = new Color(selectBoxStyle.disabledFontColor);
            }
            this.background = selectBoxStyle.background;
            this.scrollStyle = new ScrollPane.ScrollPaneStyle(selectBoxStyle.scrollStyle);
            this.listStyle = new List.ListStyle(selectBoxStyle.listStyle);
            this.backgroundOver = selectBoxStyle.backgroundOver;
            this.backgroundOpen = selectBoxStyle.backgroundOpen;
            this.backgroundDisabled = selectBoxStyle.backgroundDisabled;
        }
    }

    public SelectBox(Skin skin, String str) {
        this((SelectBoxStyle) skin.get(str, SelectBoxStyle.class));
    }

    public SelectBox(SelectBoxStyle selectBoxStyle) {
        Array<T> array = new Array<>();
        this.items = array;
        this.alignment = 8;
        ArraySelection<T> arraySelection = new ArraySelection(array) { // from class: com.badlogic.gdx.scenes.scene2d.ui.SelectBox.1
            @Override // com.badlogic.gdx.scenes.scene2d.utils.Selection
            public boolean fireChangeEvent() {
                SelectBox selectBox = SelectBox.this;
                if (selectBox.selectedPrefWidth) {
                    selectBox.invalidateHierarchy();
                }
                return super.fireChangeEvent();
            }
        };
        this.selection = arraySelection;
        setStyle(selectBoxStyle);
        setSize(getPrefWidth(), getPrefHeight());
        arraySelection.setActor(this);
        arraySelection.setRequired(true);
        this.scrollPane = newScrollPane();
        ClickListener clickListener = new ClickListener() { // from class: com.badlogic.gdx.scenes.scene2d.ui.SelectBox.2
            @Override // com.badlogic.gdx.scenes.scene2d.utils.ClickListener, com.badlogic.gdx.scenes.scene2d.InputListener
            public boolean touchDown(InputEvent inputEvent, float f, float f2, int i, int i2) {
                if ((i == 0 && i2 != 0) || SelectBox.this.isDisabled()) {
                    return false;
                }
                if (SelectBox.this.scrollPane.hasParent()) {
                    SelectBox.this.hideScrollPane();
                    return true;
                }
                SelectBox.this.showScrollPane();
                return true;
            }
        };
        this.clickListener = clickListener;
        addListener(clickListener);
    }

    public void setItems(Array<T> array) {
        if (array != null) {
            float prefWidth = getPrefWidth();
            Array<T> array2 = this.items;
            if (array != array2) {
                array2.clear();
                this.items.addAll(array);
            }
            this.selection.validate();
            this.scrollPane.list.setItems(this.items);
            invalidate();
            if (prefWidth != getPrefWidth()) {
                invalidateHierarchy();
                return;
            }
            return;
        }
        throw new IllegalArgumentException("newItems cannot be null.");
    }
}
