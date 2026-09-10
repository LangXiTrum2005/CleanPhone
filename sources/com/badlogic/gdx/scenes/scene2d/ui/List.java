package com.badlogic.gdx.scenes.scene2d.ui;

import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.GlyphLayout;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.scenes.scene2d.Actor;
import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.InputListener;
import com.badlogic.gdx.scenes.scene2d.utils.ArraySelection;
import com.badlogic.gdx.scenes.scene2d.utils.Cullable;
import com.badlogic.gdx.scenes.scene2d.utils.Drawable;
import com.badlogic.gdx.scenes.scene2d.utils.UIUtils;
import com.badlogic.gdx.utils.Array;
import com.badlogic.gdx.utils.Null;
import com.badlogic.gdx.utils.OrderedSet;
import com.badlogic.gdx.utils.Pool;
import com.badlogic.gdx.utils.Pools;

/* JADX INFO: loaded from: classes.dex */
public class List<T> extends Widget implements Cullable {
    private int alignment;
    private Rectangle cullingArea;
    float itemHeight;
    final Array<T> items;
    private InputListener keyListener;
    int overIndex;
    private float prefHeight;
    private float prefWidth;
    int pressedIndex;
    ArraySelection<T> selection;
    ListStyle style;
    boolean typeToSelect;

    public List(Skin skin) {
        this((ListStyle) skin.get(ListStyle.class));
    }

    public void clearItems() {
        Array<T> array = this.items;
        if (array.size == 0) {
            return;
        }
        array.clear();
        this.overIndex = -1;
        this.pressedIndex = -1;
        this.selection.clear();
        invalidateHierarchy();
    }

    /* JADX WARN: Code duplicated, block: B:19:0x009b  */
    /* JADX WARN: Code duplicated, block: B:24:0x00b1 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:25:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:26:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:28:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:31:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:34:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:41:0x0103 A[SYNTHETIC] */
    @Override // com.badlogic.gdx.scenes.scene2d.ui.Widget, com.badlogic.gdx.scenes.scene2d.Actor
    public void draw(Batch batch, float f) {
        boolean zContains;
        Drawable drawable;
        Drawable drawable2;
        int i;
        validate();
        drawBackground(batch, f);
        ListStyle listStyle = this.style;
        BitmapFont bitmapFont = listStyle.font;
        Drawable drawable3 = listStyle.selection;
        Color color = listStyle.fontColorSelected;
        Color color2 = listStyle.fontColorUnselected;
        Color color3 = getColor();
        batch.setColor(color3.r, color3.g, color3.b, color3.f202a * f);
        float x = getX();
        float y = getY();
        float width = getWidth();
        float height = getHeight();
        Drawable drawable4 = this.style.background;
        if (drawable4 != null) {
            float leftWidth = drawable4.getLeftWidth();
            x += leftWidth;
            height -= drawable4.getTopHeight();
            width -= drawable4.getRightWidth() + leftWidth;
        }
        float f2 = x;
        float f3 = width;
        float leftWidth2 = drawable3.getLeftWidth();
        float rightWidth = (f3 - leftWidth2) - drawable3.getRightWidth();
        float topHeight = drawable3.getTopHeight() - bitmapFont.getDescent();
        bitmapFont.setColor(color2.r, color2.g, color2.b, color2.f202a * f);
        float f4 = height;
        int i2 = 0;
        while (true) {
            Array<T> array = this.items;
            if (i2 >= array.size) {
                return;
            }
            Rectangle rectangle = this.cullingArea;
            if (rectangle != null) {
                float f5 = f4 - this.itemHeight;
                float f6 = rectangle.y;
                if (f5 <= rectangle.height + f6 && f4 >= f6) {
                    T t = array.get(i2);
                    zContains = this.selection.contains(t);
                    if (this.pressedIndex != i2 && (drawable = this.style.down) != null) {
                        drawable2 = drawable;
                    } else if (zContains) {
                        bitmapFont.setColor(color.r, color.g, color.b, color.f202a * f);
                        drawable2 = drawable3;
                    } else {
                        if (this.overIndex == i2 || (drawable = this.style.over) == null) {
                            drawable = null;
                        }
                        drawable2 = drawable;
                    }
                    float f7 = y + f4;
                    float f8 = this.itemHeight;
                    drawSelection(batch, drawable2, f2, f7 - f8, f3, f8);
                    float f9 = f7 - topHeight;
                    i = i2;
                    drawItem(batch, bitmapFont, i2, t, f2 + leftWidth2, f9, rightWidth);
                    if (zContains) {
                        bitmapFont.setColor(color2.r, color2.g, color2.b, color2.f202a * f);
                    }
                } else if (f4 < f6) {
                    return;
                } else {
                    i = i2;
                }
            } else {
                T t2 = array.get(i2);
                zContains = this.selection.contains(t2);
                if (this.pressedIndex != i2) {
                    if (zContains) {
                        bitmapFont.setColor(color.r, color.g, color.b, color.f202a * f);
                        drawable2 = drawable3;
                    } else {
                        if (this.overIndex == i2) {
                            drawable = null;
                        } else {
                            drawable = null;
                        }
                        drawable2 = drawable;
                    }
                } else if (zContains) {
                    bitmapFont.setColor(color.r, color.g, color.b, color.f202a * f);
                    drawable2 = drawable3;
                } else {
                    if (this.overIndex == i2) {
                        drawable = null;
                    } else {
                        drawable = null;
                    }
                    drawable2 = drawable;
                }
                float f10 = y + f4;
                float f11 = this.itemHeight;
                drawSelection(batch, drawable2, f2, f10 - f11, f3, f11);
                float f12 = f10 - topHeight;
                i = i2;
                drawItem(batch, bitmapFont, i2, t2, f2 + leftWidth2, f12, rightWidth);
                if (zContains) {
                    bitmapFont.setColor(color2.r, color2.g, color2.b, color2.f202a * f);
                }
            }
            f4 -= this.itemHeight;
            i2 = i + 1;
        }
    }

    public void drawBackground(Batch batch, float f) {
        if (this.style.background != null) {
            Color color = getColor();
            batch.setColor(color.r, color.g, color.b, color.f202a * f);
            this.style.background.draw(batch, getX(), getY(), getWidth(), getHeight());
        }
    }

    public GlyphLayout drawItem(Batch batch, BitmapFont bitmapFont, int i, T t, float f, float f2, float f3) {
        String string = toString(t);
        return bitmapFont.draw(batch, string, f, f2, 0, string.length(), f3, this.alignment, false, "...");
    }

    public void drawSelection(Batch batch, @Null Drawable drawable, float f, float f2, float f3, float f4) {
        if (drawable != null) {
            drawable.draw(batch, f, f2, f3, f4);
        }
    }

    public int getAlignment() {
        return this.alignment;
    }

    public Rectangle getCullingArea() {
        return this.cullingArea;
    }

    @Null
    public T getItemAt(float f) {
        int itemIndexAt = getItemIndexAt(f);
        if (itemIndexAt == -1) {
            return null;
        }
        return this.items.get(itemIndexAt);
    }

    public float getItemHeight() {
        return this.itemHeight;
    }

    public int getItemIndexAt(float f) {
        float height = getHeight();
        Drawable drawable = this.style.background;
        if (drawable != null) {
            height -= drawable.getBottomHeight() + drawable.getTopHeight();
            f -= drawable.getBottomHeight();
        }
        int i = (int) ((height - f) / this.itemHeight);
        if (i < 0 || i >= this.items.size) {
            return -1;
        }
        return i;
    }

    public Array<T> getItems() {
        return this.items;
    }

    public InputListener getKeyListener() {
        return this.keyListener;
    }

    public T getOverItem() {
        int i = this.overIndex;
        if (i == -1) {
            return null;
        }
        return this.items.get(i);
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

    public T getPressedItem() {
        int i = this.pressedIndex;
        if (i == -1) {
            return null;
        }
        return this.items.get(i);
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

    public ArraySelection<T> getSelection() {
        return this.selection;
    }

    public ListStyle getStyle() {
        return this.style;
    }

    @Override // com.badlogic.gdx.scenes.scene2d.ui.Widget, com.badlogic.gdx.scenes.scene2d.utils.Layout
    public void layout() {
        ListStyle listStyle = this.style;
        BitmapFont bitmapFont = listStyle.font;
        Drawable drawable = listStyle.selection;
        float capHeight = bitmapFont.getCapHeight() - (bitmapFont.getDescent() * 2.0f);
        this.itemHeight = capHeight;
        this.itemHeight = drawable.getBottomHeight() + drawable.getTopHeight() + capHeight;
        this.prefWidth = 0.0f;
        Pool pool = Pools.get(GlyphLayout.class);
        GlyphLayout glyphLayout = (GlyphLayout) pool.obtain();
        int i = 0;
        while (true) {
            Array<T> array = this.items;
            if (i >= array.size) {
                break;
            }
            glyphLayout.setText(bitmapFont, toString(array.get(i)));
            this.prefWidth = Math.max(glyphLayout.width, this.prefWidth);
            i++;
        }
        pool.free(glyphLayout);
        float rightWidth = drawable.getRightWidth() + drawable.getLeftWidth() + this.prefWidth;
        this.prefWidth = rightWidth;
        this.prefHeight = this.items.size * this.itemHeight;
        Drawable drawable2 = this.style.background;
        if (drawable2 != null) {
            this.prefWidth = Math.max(drawable2.getRightWidth() + drawable2.getLeftWidth() + rightWidth, drawable2.getMinWidth());
            this.prefHeight = Math.max(drawable2.getBottomHeight() + drawable2.getTopHeight() + this.prefHeight, drawable2.getMinHeight());
        }
    }

    public void setAlignment(int i) {
        this.alignment = i;
    }

    @Override // com.badlogic.gdx.scenes.scene2d.utils.Cullable
    public void setCullingArea(@Null Rectangle rectangle) {
        this.cullingArea = rectangle;
    }

    public void setItems(T... tArr) {
        if (tArr == null) {
            throw new IllegalArgumentException("newItems cannot be null.");
        }
        float prefWidth = getPrefWidth();
        float prefHeight = getPrefHeight();
        this.items.clear();
        this.items.addAll(tArr);
        this.overIndex = -1;
        this.pressedIndex = -1;
        this.selection.validate();
        invalidate();
        if (prefWidth == getPrefWidth() && prefHeight == getPrefHeight()) {
            return;
        }
        invalidateHierarchy();
    }

    public void setSelected(@Null T t) {
        if (this.items.contains(t, false)) {
            this.selection.set(t);
            return;
        }
        if (this.selection.getRequired()) {
            Array<T> array = this.items;
            if (array.size > 0) {
                this.selection.set(array.first());
                return;
            }
        }
        this.selection.clear();
    }

    public void setSelectedIndex(int i) {
        if (i >= -1) {
            Array<T> array = this.items;
            if (i < array.size) {
                if (i == -1) {
                    this.selection.clear();
                    return;
                } else {
                    this.selection.set(array.get(i));
                    return;
                }
            }
        }
        throw new IllegalArgumentException("index must be >= -1 and < " + this.items.size + ": " + i);
    }

    public void setSelection(ArraySelection<T> arraySelection) {
        this.selection = arraySelection;
    }

    public void setStyle(ListStyle listStyle) {
        if (listStyle == null) {
            throw new IllegalArgumentException("style cannot be null.");
        }
        this.style = listStyle;
        invalidateHierarchy();
    }

    public void setTypeToSelect(boolean z) {
        this.typeToSelect = z;
    }

    public String toString(T t) {
        return t.toString();
    }

    public List(Skin skin, String str) {
        this((ListStyle) skin.get(str, ListStyle.class));
    }

    public static class ListStyle {

        @Null
        public Drawable background;

        @Null
        public Drawable down;
        public BitmapFont font;
        public Color fontColorSelected = new Color(1.0f, 1.0f, 1.0f, 1.0f);
        public Color fontColorUnselected = new Color(1.0f, 1.0f, 1.0f, 1.0f);

        @Null
        public Drawable over;
        public Drawable selection;

        public ListStyle() {
        }

        public ListStyle(BitmapFont bitmapFont, Color color, Color color2, Drawable drawable) {
            this.font = bitmapFont;
            this.fontColorSelected.set(color);
            this.fontColorUnselected.set(color2);
            this.selection = drawable;
        }

        public ListStyle(ListStyle listStyle) {
            this.font = listStyle.font;
            this.fontColorSelected.set(listStyle.fontColorSelected);
            this.fontColorUnselected.set(listStyle.fontColorUnselected);
            this.selection = listStyle.selection;
            this.down = listStyle.down;
            this.over = listStyle.over;
            this.background = listStyle.background;
        }
    }

    public List(ListStyle listStyle) {
        Array<T> array = new Array<>();
        this.items = array;
        ArraySelection<T> arraySelection = new ArraySelection<>(array);
        this.selection = arraySelection;
        this.alignment = 8;
        this.pressedIndex = -1;
        this.overIndex = -1;
        arraySelection.setActor(this);
        this.selection.setRequired(true);
        setStyle(listStyle);
        setSize(getPrefWidth(), getPrefHeight());
        InputListener inputListener = new InputListener() { // from class: com.badlogic.gdx.scenes.scene2d.ui.List.1
            String prefix;
            long typeTimeout;

            @Override // com.badlogic.gdx.scenes.scene2d.InputListener
            public boolean keyDown(InputEvent inputEvent, int i) {
                if (List.this.items.isEmpty()) {
                    return false;
                }
                if (i == 3) {
                    List.this.setSelectedIndex(0);
                    return true;
                }
                if (i != 29) {
                    if (i == 111) {
                        if (List.this.getStage() != null) {
                            List.this.getStage().setKeyboardFocus(null);
                        }
                        return true;
                    }
                    if (i == 123) {
                        List list = List.this;
                        list.setSelectedIndex(list.items.size - 1);
                        return true;
                    }
                    if (i == 19) {
                        List list2 = List.this;
                        int iIndexOf = list2.items.indexOf((T) list2.getSelected(), false) - 1;
                        if (iIndexOf < 0) {
                            iIndexOf = List.this.items.size - 1;
                        }
                        List.this.setSelectedIndex(iIndexOf);
                        return true;
                    }
                    if (i == 20) {
                        List list3 = List.this;
                        int iIndexOf2 = list3.items.indexOf((T) list3.getSelected(), false) + 1;
                        List list4 = List.this;
                        list4.setSelectedIndex(iIndexOf2 < list4.items.size ? iIndexOf2 : 0);
                        return true;
                    }
                } else if (UIUtils.ctrl() && List.this.selection.getMultiple()) {
                    List.this.selection.clear();
                    List list5 = List.this;
                    list5.selection.addAll(list5.items);
                    return true;
                }
                return false;
            }

            @Override // com.badlogic.gdx.scenes.scene2d.InputListener
            public boolean keyTyped(InputEvent inputEvent, char c) {
                if (!List.this.typeToSelect) {
                    return false;
                }
                long jCurrentTimeMillis = System.currentTimeMillis();
                if (jCurrentTimeMillis > this.typeTimeout) {
                    this.prefix = "";
                }
                this.typeTimeout = jCurrentTimeMillis + 300;
                this.prefix += Character.toLowerCase(c);
                int i = List.this.items.size;
                for (int i2 = 0; i2 < i; i2++) {
                    List list = List.this;
                    if (list.toString(list.items.get(i2)).toLowerCase().startsWith(this.prefix)) {
                        List.this.setSelectedIndex(i2);
                        break;
                    }
                }
                return false;
            }
        };
        this.keyListener = inputListener;
        addListener(inputListener);
        addListener(new InputListener() { // from class: com.badlogic.gdx.scenes.scene2d.ui.List.2
            @Override // com.badlogic.gdx.scenes.scene2d.InputListener
            public void exit(InputEvent inputEvent, float f, float f2, int i, Actor actor) {
                if (i == 0) {
                    List.this.pressedIndex = -1;
                }
                if (i == -1) {
                    List.this.overIndex = -1;
                }
            }

            @Override // com.badlogic.gdx.scenes.scene2d.InputListener
            public boolean mouseMoved(InputEvent inputEvent, float f, float f2) {
                List list = List.this;
                list.overIndex = list.getItemIndexAt(f2);
                return false;
            }

            @Override // com.badlogic.gdx.scenes.scene2d.InputListener
            public boolean touchDown(InputEvent inputEvent, float f, float f2, int i, int i2) {
                int itemIndexAt;
                if (i != 0 || i2 != 0 || List.this.selection.isDisabled()) {
                    return true;
                }
                if (List.this.getStage() != null) {
                    List.this.getStage().setKeyboardFocus(List.this);
                }
                List list = List.this;
                if (list.items.size == 0 || (itemIndexAt = list.getItemIndexAt(f2)) == -1) {
                    return true;
                }
                List list2 = List.this;
                list2.selection.choose(list2.items.get(itemIndexAt));
                List.this.pressedIndex = itemIndexAt;
                return true;
            }

            @Override // com.badlogic.gdx.scenes.scene2d.InputListener
            public void touchDragged(InputEvent inputEvent, float f, float f2, int i) {
                List list = List.this;
                list.overIndex = list.getItemIndexAt(f2);
            }

            @Override // com.badlogic.gdx.scenes.scene2d.InputListener
            public void touchUp(InputEvent inputEvent, float f, float f2, int i, int i2) {
                if (i == 0 && i2 == 0) {
                    List.this.pressedIndex = -1;
                }
            }
        });
    }

    public void setItems(Array array) {
        if (array != null) {
            float prefWidth = getPrefWidth();
            float prefHeight = getPrefHeight();
            Array<T> array2 = this.items;
            if (array != array2) {
                array2.clear();
                this.items.addAll(array);
            }
            this.overIndex = -1;
            this.pressedIndex = -1;
            this.selection.validate();
            invalidate();
            if (prefWidth == getPrefWidth() && prefHeight == getPrefHeight()) {
                return;
            }
            invalidateHierarchy();
            return;
        }
        throw new IllegalArgumentException("newItems cannot be null.");
    }
}
