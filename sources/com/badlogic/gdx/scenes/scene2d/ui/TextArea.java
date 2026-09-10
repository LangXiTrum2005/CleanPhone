package com.badlogic.gdx.scenes.scene2d.ui;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.GlyphLayout;
import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.InputListener;
import com.badlogic.gdx.scenes.scene2d.utils.Drawable;
import com.badlogic.gdx.utils.IntArray;
import com.badlogic.gdx.utils.Null;
import com.badlogic.gdx.utils.Pool;
import com.badlogic.gdx.utils.Pools;

/* JADX INFO: loaded from: classes.dex */
public class TextArea extends TextField {
    int cursorLine;
    int firstLineShowing;
    private String lastText;
    IntArray linesBreak;
    private int linesShowing;
    float moveOffset;
    private float prefRows;

    public class TextAreaListener extends TextField.TextFieldClickListener {
        public TextAreaListener() {
            super();
        }

        @Override // com.badlogic.gdx.scenes.scene2d.ui.TextField.TextFieldClickListener
        public boolean checkFocusTraversal(char c) {
            return TextArea.this.focusTraversal && c == '\t';
        }

        @Override // com.badlogic.gdx.scenes.scene2d.ui.TextField.TextFieldClickListener
        public void goEnd(boolean z) {
            if (!z) {
                TextArea textArea = TextArea.this;
                if (textArea.cursorLine < textArea.getLines()) {
                    TextArea textArea2 = TextArea.this;
                    int i = textArea2.cursorLine;
                    int i2 = (i * 2) + 1;
                    IntArray intArray = textArea2.linesBreak;
                    if (i2 < intArray.size) {
                        textArea2.cursor = intArray.get((i * 2) + 1);
                        return;
                    }
                    return;
                }
            }
            TextArea textArea3 = TextArea.this;
            textArea3.cursor = textArea3.text.length();
        }

        @Override // com.badlogic.gdx.scenes.scene2d.ui.TextField.TextFieldClickListener
        public void goHome(boolean z) {
            if (z) {
                TextArea.this.cursor = 0;
                return;
            }
            TextArea textArea = TextArea.this;
            int i = textArea.cursorLine;
            int i2 = i * 2;
            IntArray intArray = textArea.linesBreak;
            if (i2 < intArray.size) {
                textArea.cursor = intArray.get(i * 2);
            }
        }

        @Override // com.badlogic.gdx.scenes.scene2d.ui.TextField.TextFieldClickListener, com.badlogic.gdx.scenes.scene2d.InputListener
        public boolean keyDown(InputEvent inputEvent, int i) {
            boolean zKeyDown = super.keyDown(inputEvent, i);
            if (!TextArea.this.hasKeyboardFocus()) {
                return zKeyDown;
            }
            boolean z = Gdx.input.isKeyPressed(59) || Gdx.input.isKeyPressed(60);
            if (i != 20) {
                if (i == 19) {
                    if (z) {
                        TextArea textArea = TextArea.this;
                        if (!textArea.hasSelection) {
                            textArea.selectionStart = textArea.cursor;
                            textArea.hasSelection = true;
                        }
                    } else {
                        TextArea.this.clearSelection();
                    }
                    TextArea textArea2 = TextArea.this;
                    textArea2.moveCursorLine(textArea2.cursorLine - 1);
                } else {
                    TextArea.this.moveOffset = -1.0f;
                }
                TextArea.this.showCursor();
                return true;
            }
            if (z) {
                TextArea textArea3 = TextArea.this;
                if (!textArea3.hasSelection) {
                    textArea3.selectionStart = textArea3.cursor;
                    textArea3.hasSelection = true;
                }
            } else {
                TextArea.this.clearSelection();
            }
            TextArea textArea4 = TextArea.this;
            textArea4.moveCursorLine(textArea4.cursorLine + 1);
            scheduleKeyRepeatTask(i);
            TextArea.this.showCursor();
            return true;
        }

        @Override // com.badlogic.gdx.scenes.scene2d.ui.TextField.TextFieldClickListener, com.badlogic.gdx.scenes.scene2d.InputListener
        public boolean keyTyped(InputEvent inputEvent, char c) {
            boolean zKeyTyped = super.keyTyped(inputEvent, c);
            TextArea.this.showCursor();
            return zKeyTyped;
        }

        @Override // com.badlogic.gdx.scenes.scene2d.ui.TextField.TextFieldClickListener
        public void setCursorPosition(float f, float f2) {
            TextArea textArea = TextArea.this;
            textArea.moveOffset = -1.0f;
            TextField.TextFieldStyle textFieldStyle = textArea.style;
            Drawable drawable = textFieldStyle.background;
            BitmapFont bitmapFont = textFieldStyle.font;
            float height = textArea.getHeight();
            if (drawable != null) {
                height -= drawable.getTopHeight();
                f -= drawable.getLeftWidth();
            }
            float fMax = Math.max(0.0f, f);
            if (drawable != null) {
                f2 -= drawable.getTopHeight();
            }
            TextArea textArea2 = TextArea.this;
            int iFloor = (int) Math.floor((height - f2) / bitmapFont.getLineHeight());
            TextArea textArea3 = TextArea.this;
            textArea2.cursorLine = iFloor + textArea3.firstLineShowing;
            textArea3.cursorLine = Math.max(0, Math.min(textArea3.cursorLine, textArea3.getLines() - 1));
            super.setCursorPosition(fMax, f2);
            TextArea.this.updateCurrentLine();
        }
    }

    public TextArea(String str, Skin skin) {
        super(str, skin);
    }

    private int calculateCurrentLineIndex(int i) {
        int i2 = 0;
        while (true) {
            IntArray intArray = this.linesBreak;
            if (i2 >= intArray.size || i <= intArray.items[i2]) {
                break;
            }
            i2++;
        }
        return i2;
    }

    @Override // com.badlogic.gdx.scenes.scene2d.ui.TextField
    public void calculateOffsets() {
        super.calculateOffsets();
        if (this.text.equals(this.lastText)) {
            return;
        }
        this.lastText = this.text;
        BitmapFont bitmapFont = this.style.font;
        float width = getWidth();
        Drawable drawable = this.style.background;
        float rightWidth = width - (drawable != null ? this.style.background.getRightWidth() + drawable.getLeftWidth() : 0.0f);
        this.linesBreak.clear();
        Pool pool = Pools.get(GlyphLayout.class);
        GlyphLayout glyphLayout = (GlyphLayout) pool.obtain();
        int i = 0;
        int i2 = 0;
        for (int i3 = 0; i3 < this.text.length(); i3++) {
            char cCharAt = this.text.charAt(i3);
            if (cCharAt == '\r' || cCharAt == '\n') {
                this.linesBreak.add(i);
                this.linesBreak.add(i3);
                i = i3 + 1;
            } else {
                if (!continueCursor(i3, 0)) {
                    i2 = i3;
                }
                glyphLayout.setText(bitmapFont, this.text.subSequence(i, i3 + 1));
                if (glyphLayout.width > rightWidth) {
                    if (i >= i2) {
                        i2 = i3 - 1;
                    }
                    this.linesBreak.add(i);
                    i2++;
                    this.linesBreak.add(i2);
                    i = i2;
                }
            }
        }
        pool.free(glyphLayout);
        if (i < this.text.length()) {
            this.linesBreak.add(i);
            this.linesBreak.add(this.text.length());
        }
        showCursor();
    }

    @Override // com.badlogic.gdx.scenes.scene2d.ui.TextField
    public boolean continueCursor(int i, int i2) {
        int[] iArr;
        int i3;
        int iCalculateCurrentLineIndex = calculateCurrentLineIndex(i + i2);
        if (super.continueCursor(i, i2)) {
            if (iCalculateCurrentLineIndex >= 0) {
                IntArray intArray = this.linesBreak;
                if (iCalculateCurrentLineIndex >= intArray.size - 2 || (i3 = (iArr = intArray.items)[iCalculateCurrentLineIndex + 1]) != i || i3 == iArr[iCalculateCurrentLineIndex + 2]) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // com.badlogic.gdx.scenes.scene2d.ui.TextField
    public InputListener createInputListener() {
        return new TextAreaListener();
    }

    @Override // com.badlogic.gdx.scenes.scene2d.ui.TextField
    public void drawCursor(Drawable drawable, Batch batch, BitmapFont bitmapFont, float f, float f2) {
        drawable.draw(batch, getCursorX() + f, getCursorY() + f2, drawable.getMinWidth(), bitmapFont.getLineHeight());
    }

    /* JADX WARN: Code duplicated, block: B:29:0x008b  */
    @Override // com.badlogic.gdx.scenes.scene2d.ui.TextField
    public void drawSelection(Drawable drawable, Batch batch, BitmapFont bitmapFont, float f, float f2) {
        float f3;
        float f4;
        int i = this.firstLineShowing * 2;
        int iMin = Math.min(this.cursor, this.selectionStart);
        int iMax = Math.max(this.cursor, this.selectionStart);
        BitmapFont.BitmapFontData data = bitmapFont.getData();
        float lineHeight = this.style.font.getLineHeight();
        float lineHeight2 = 0.0f;
        while (true) {
            int i2 = i + 1;
            IntArray intArray = this.linesBreak;
            if (i2 >= intArray.size || i >= (this.firstLineShowing + this.linesShowing) * 2) {
                return;
            }
            int i3 = intArray.get(i);
            int i4 = this.linesBreak.get(i2);
            if ((iMin >= i3 || iMin >= i4 || iMax >= i3 || iMax >= i4) && (iMin <= i3 || iMin <= i4 || iMax <= i3 || iMax <= i4)) {
                int iMax2 = Math.max(i3, iMin);
                int iMin2 = Math.min(i4, iMax);
                BitmapFont.Glyph glyph = data.getGlyph(this.displayText.charAt(i3));
                if (glyph == null) {
                    f3 = 0.0f;
                    f4 = 0.0f;
                } else if (iMax2 == i3) {
                    f4 = glyph.fixedWidth ? 0.0f : ((-glyph.xoffset) * data.scaleX) - data.padLeft;
                    f3 = 0.0f;
                } else {
                    if (glyph.fixedWidth) {
                        f3 = 0.0f;
                    } else {
                        f3 = ((-glyph.xoffset) * data.scaleX) - data.padLeft;
                    }
                    f4 = 0.0f;
                }
                drawable.draw(batch, f + (this.glyphPositions.get(iMax2) - this.glyphPositions.get(i3)) + f3, (f2 - lineHeight) - lineHeight2, (this.glyphPositions.get(iMin2) - this.glyphPositions.get(iMax2)) + f4, bitmapFont.getLineHeight());
            }
            lineHeight2 += bitmapFont.getLineHeight();
            i += 2;
        }
    }

    @Override // com.badlogic.gdx.scenes.scene2d.ui.TextField
    public void drawText(Batch batch, BitmapFont bitmapFont, float f, float f2) {
        float lineHeight = (-(this.style.font.getLineHeight() - this.textHeight)) / 2.0f;
        for (int i = this.firstLineShowing * 2; i < (this.firstLineShowing + this.linesShowing) * 2; i += 2) {
            IntArray intArray = this.linesBreak;
            if (i >= intArray.size) {
                return;
            }
            int[] iArr = intArray.items;
            bitmapFont.draw(batch, this.displayText, f, f2 + lineHeight, iArr[i], iArr[i + 1], 0.0f, 8, false);
            lineHeight -= bitmapFont.getLineHeight();
        }
    }

    public int getCursorLine() {
        return this.cursorLine;
    }

    public float getCursorX() {
        BitmapFont.BitmapFontData data = this.style.font.getData();
        float f = 0.0f;
        if (this.cursor < this.glyphPositions.size) {
            int i = this.cursorLine;
            int i2 = i * 2;
            IntArray intArray = this.linesBreak;
            if (i2 < intArray.size) {
                int i3 = intArray.items[i * 2];
                BitmapFont.Glyph glyph = data.getGlyph(this.displayText.charAt(i3));
                if (glyph != null && !glyph.fixedWidth) {
                    f = ((-glyph.xoffset) * data.scaleX) - data.padLeft;
                }
                f += this.glyphPositions.get(this.cursor) - this.glyphPositions.get(i3);
            }
        }
        return f + data.cursorX;
    }

    public float getCursorY() {
        return this.style.font.getLineHeight() * (-((this.cursorLine - this.firstLineShowing) + 1));
    }

    public int getFirstLineShowing() {
        return this.firstLineShowing;
    }

    public int getLines() {
        return (newLineAtEnd() ? 1 : 0) + (this.linesBreak.size / 2);
    }

    public int getLinesShowing() {
        return this.linesShowing;
    }

    @Override // com.badlogic.gdx.scenes.scene2d.ui.TextField, com.badlogic.gdx.scenes.scene2d.ui.Widget, com.badlogic.gdx.scenes.scene2d.utils.Layout
    public float getPrefHeight() {
        if (this.prefRows <= 0.0f) {
            return super.getPrefHeight();
        }
        float fCeil = (float) Math.ceil(this.style.font.getLineHeight() * this.prefRows);
        Drawable drawable = this.style.background;
        if (drawable == null) {
            return fCeil;
        }
        return Math.max(this.style.background.getTopHeight() + drawable.getBottomHeight() + fCeil, this.style.background.getMinHeight());
    }

    @Override // com.badlogic.gdx.scenes.scene2d.ui.TextField
    public float getTextY(BitmapFont bitmapFont, @Null Drawable drawable) {
        float height = getHeight();
        if (drawable != null) {
            height -= drawable.getTopHeight();
        }
        return bitmapFont.usesIntegerPositions() ? (int) height : height;
    }

    @Override // com.badlogic.gdx.scenes.scene2d.ui.TextField
    public void initialize() {
        super.initialize();
        this.writeEnters = true;
        this.linesBreak = new IntArray();
        this.cursorLine = 0;
        this.firstLineShowing = 0;
        this.moveOffset = -1.0f;
        this.linesShowing = 0;
    }

    @Override // com.badlogic.gdx.scenes.scene2d.ui.TextField
    public int letterUnderCursor(float f) {
        IntArray intArray = this.linesBreak;
        int i = intArray.size;
        if (i <= 0) {
            return 0;
        }
        int i2 = this.cursorLine;
        if (i2 * 2 >= i) {
            return this.text.length();
        }
        float[] fArr = this.glyphPositions.items;
        int[] iArr = intArray.items;
        int i3 = iArr[i2 * 2];
        float f2 = f + fArr[i3];
        int i4 = iArr[(i2 * 2) + 1];
        while (i3 < i4 && fArr[i3] <= f2) {
            i3++;
        }
        return (i3 <= 0 || fArr[i3] - f2 > f2 - fArr[i3 + (-1)]) ? Math.max(0, i3 - 1) : i3;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x002c  */
    @Override // com.badlogic.gdx.scenes.scene2d.ui.TextField
    public void moveCursor(boolean z, boolean z2) {
        int i = z ? 1 : -1;
        int i2 = this.cursorLine;
        int i3 = (i2 * 2) + i;
        if (i3 >= 0) {
            int i4 = i3 + 1;
            IntArray intArray = this.linesBreak;
            if (i4 < intArray.size) {
                int[] iArr = intArray.items;
                int i5 = iArr[i3];
                int i6 = this.cursor;
                if (i5 == i6 && iArr[i4] == i6) {
                    this.cursorLine = i2 + i;
                    if (z2) {
                        super.moveCursor(z, z2);
                    }
                    showCursor();
                } else {
                    super.moveCursor(z, z2);
                }
            } else {
                super.moveCursor(z, z2);
            }
        } else {
            super.moveCursor(z, z2);
        }
        updateCurrentLine();
    }

    public void moveCursorLine(int i) {
        if (i < 0) {
            this.cursorLine = 0;
            this.cursor = 0;
            this.moveOffset = -1.0f;
            return;
        }
        if (i >= getLines()) {
            int lines = getLines() - 1;
            this.cursor = this.text.length();
            if (i > getLines() || lines == this.cursorLine) {
                this.moveOffset = -1.0f;
            }
            this.cursorLine = lines;
            return;
        }
        int i2 = this.cursorLine;
        if (i != i2) {
            if (this.moveOffset < 0.0f) {
                this.moveOffset = this.linesBreak.size > i2 * 2 ? this.glyphPositions.get(this.cursor) - this.glyphPositions.get(this.linesBreak.get(this.cursorLine * 2)) : 0.0f;
            }
            this.cursorLine = i;
            int i3 = i * 2;
            IntArray intArray = this.linesBreak;
            this.cursor = i3 >= intArray.size ? this.text.length() : intArray.get(i * 2);
            while (this.cursor < this.text.length() && this.cursor <= this.linesBreak.get((this.cursorLine * 2) + 1) - 1 && this.glyphPositions.get(this.cursor) - this.glyphPositions.get(this.linesBreak.get(this.cursorLine * 2)) < this.moveOffset) {
                this.cursor++;
            }
            showCursor();
        }
    }

    public boolean newLineAtEnd() {
        if (this.text.length() != 0) {
            String str = this.text;
            if (str.charAt(str.length() - 1) == '\n') {
                return true;
            }
            String str2 = this.text;
            if (str2.charAt(str2.length() - 1) == '\r') {
                return true;
            }
        }
        return false;
    }

    public void setPrefRows(float f) {
        this.prefRows = f;
    }

    @Override // com.badlogic.gdx.scenes.scene2d.ui.TextField
    public void setSelection(int i, int i2) {
        super.setSelection(i, i2);
        updateCurrentLine();
    }

    @Override // com.badlogic.gdx.scenes.scene2d.ui.TextField
    public void setStyle(TextField.TextFieldStyle textFieldStyle) {
        if (textFieldStyle == null) {
            throw new IllegalArgumentException("style cannot be null.");
        }
        this.style = textFieldStyle;
        this.textHeight = textFieldStyle.font.getCapHeight() - textFieldStyle.font.getDescent();
        if (this.text != null) {
            updateDisplayText();
        }
        invalidateHierarchy();
    }

    public void showCursor() {
        updateCurrentLine();
        updateFirstLineShowing();
    }

    @Override // com.badlogic.gdx.scenes.scene2d.ui.Widget, com.badlogic.gdx.scenes.scene2d.Actor
    public void sizeChanged() {
        float topHeight;
        this.lastText = null;
        TextField.TextFieldStyle textFieldStyle = this.style;
        BitmapFont bitmapFont = textFieldStyle.font;
        Drawable drawable = textFieldStyle.background;
        float height = getHeight();
        if (drawable == null) {
            topHeight = 0.0f;
        } else {
            topHeight = drawable.getTopHeight() + drawable.getBottomHeight();
        }
        this.linesShowing = (int) Math.floor((height - topHeight) / bitmapFont.getLineHeight());
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0020  */
    /* JADX WARN: Code duplicated, block: B:12:0x0028  */
    /* JADX WARN: Code duplicated, block: B:18:0x0050  */
    public void updateCurrentLine() {
        int iCalculateCurrentLineIndex = calculateCurrentLineIndex(this.cursor);
        int i = iCalculateCurrentLineIndex / 2;
        if (iCalculateCurrentLineIndex % 2 != 0) {
            int i2 = iCalculateCurrentLineIndex + 1;
            IntArray intArray = this.linesBreak;
            if (i2 < intArray.size) {
                int i3 = this.cursor;
                int[] iArr = intArray.items;
                int i4 = iArr[iCalculateCurrentLineIndex];
                if (i3 != i4 || iArr[i2] != i4) {
                    if (i >= this.linesBreak.size / 2 || this.text.length() == 0) {
                        this.cursorLine = i;
                    } else {
                        String str = this.text;
                        if (str.charAt(str.length() - 1) != '\n') {
                            String str2 = this.text;
                            if (str2.charAt(str2.length() - 1) == '\r') {
                                this.cursorLine = i;
                            }
                        } else {
                            this.cursorLine = i;
                        }
                    }
                }
            } else if (i >= this.linesBreak.size / 2) {
                this.cursorLine = i;
            } else {
                this.cursorLine = i;
            }
        } else if (i >= this.linesBreak.size / 2) {
            this.cursorLine = i;
        } else {
            this.cursorLine = i;
        }
        updateFirstLineShowing();
    }

    public void updateFirstLineShowing() {
        int i = this.cursorLine;
        int i2 = this.firstLineShowing;
        if (i == i2) {
            return;
        }
        int i3 = i >= i2 ? 1 : -1;
        while (true) {
            int i4 = this.firstLineShowing;
            int i5 = this.cursorLine;
            if (i4 <= i5 && (this.linesShowing + i4) - 1 >= i5) {
                return;
            } else {
                this.firstLineShowing = i4 + i3;
            }
        }
    }

    public TextArea(String str, Skin skin, String str2) {
        super(str, skin, str2);
    }

    public TextArea(String str, TextField.TextFieldStyle textFieldStyle) {
        super(str, textFieldStyle);
    }
}
