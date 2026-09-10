package com.badlogic.gdx.scenes.scene2d.ui;

import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.BitmapFontCache;
import com.badlogic.gdx.graphics.g2d.GlyphLayout;
import com.badlogic.gdx.scenes.scene2d.utils.Drawable;
import com.badlogic.gdx.utils.Null;
import com.badlogic.gdx.utils.StringBuilder;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.DM;

/* JADX INFO: loaded from: classes.dex */
public class Label extends Widget {
    private BitmapFontCache cache;

    @Null
    private String ellipsis;
    private boolean fontScaleChanged;
    private float fontScaleX;
    private float fontScaleY;
    private int intValue;
    private int labelAlign;
    private float lastPrefHeight;
    private final GlyphLayout layout;
    private int lineAlign;
    private float prefHeight;
    private boolean prefSizeInvalid;
    private float prefWidth;
    private LabelStyle style;
    private final StringBuilder text;
    private boolean wrap;
    private static final Color tempColor = new Color();
    private static final GlyphLayout prefSizeLayout = new GlyphLayout();

    public static class LabelStyle {

        @Null
        public Drawable background;
        public BitmapFont font;

        @Null
        public Color fontColor;

        public LabelStyle() {
        }

        public LabelStyle(BitmapFont bitmapFont, @Null Color color) {
            this.font = bitmapFont;
            this.fontColor = color;
        }

        public LabelStyle(LabelStyle labelStyle) {
            this.font = labelStyle.font;
            if (labelStyle.fontColor != null) {
                this.fontColor = new Color(labelStyle.fontColor);
            }
            this.background = labelStyle.background;
        }
    }

    public Label(@Null CharSequence charSequence, Skin skin) {
        this(charSequence, (LabelStyle) skin.get(LabelStyle.class));
    }

    private void scaleAndComputePrefSize() {
        BitmapFont font = this.cache.getFont();
        float scaleX = font.getScaleX();
        float scaleY = font.getScaleY();
        if (this.fontScaleChanged) {
            font.getData().setScale(this.fontScaleX, this.fontScaleY);
        }
        computePrefSize(prefSizeLayout);
        if (this.fontScaleChanged) {
            font.getData().setScale(scaleX, scaleY);
        }
    }

    public void computePrefSize(GlyphLayout glyphLayout) {
        this.prefSizeInvalid = false;
        if (this.wrap && this.ellipsis == null) {
            float width = getWidth();
            Drawable drawable = this.style.background;
            if (drawable != null) {
                width = (Math.max(width, drawable.getMinWidth()) - this.style.background.getLeftWidth()) - this.style.background.getRightWidth();
            }
            glyphLayout.setText(this.cache.getFont(), this.text, Color.WHITE, width, 8, true);
        } else {
            glyphLayout.setText(this.cache.getFont(), this.text);
        }
        this.prefWidth = glyphLayout.width;
        this.prefHeight = glyphLayout.height;
    }

    @Override // com.badlogic.gdx.scenes.scene2d.ui.Widget, com.badlogic.gdx.scenes.scene2d.Actor
    public void draw(Batch batch, float f) {
        validate();
        Color color = tempColor.set(getColor());
        float f2 = color.f202a * f;
        color.f202a = f2;
        if (this.style.background != null) {
            batch.setColor(color.r, color.g, color.b, f2);
            this.style.background.draw(batch, getX(), getY(), getWidth(), getHeight());
        }
        Color color2 = this.style.fontColor;
        if (color2 != null) {
            color.mul(color2);
        }
        this.cache.tint(color);
        this.cache.setPosition(getX(), getY());
        this.cache.draw(batch);
    }

    public BitmapFontCache getBitmapFontCache() {
        return this.cache;
    }

    public float getFontScaleX() {
        return this.fontScaleX;
    }

    public float getFontScaleY() {
        return this.fontScaleY;
    }

    public GlyphLayout getGlyphLayout() {
        return this.layout;
    }

    public int getLabelAlign() {
        return this.labelAlign;
    }

    public int getLineAlign() {
        return this.lineAlign;
    }

    @Override // com.badlogic.gdx.scenes.scene2d.ui.Widget, com.badlogic.gdx.scenes.scene2d.utils.Layout
    public float getPrefHeight() {
        if (this.prefSizeInvalid) {
            scaleAndComputePrefSize();
        }
        float descent = this.prefHeight - ((this.style.font.getDescent() * (this.fontScaleChanged ? this.fontScaleY / this.style.font.getScaleY() : 1.0f)) * 2.0f);
        Drawable drawable = this.style.background;
        if (drawable != null) {
            return Math.max(drawable.getBottomHeight() + drawable.getTopHeight() + descent, drawable.getMinHeight());
        }
        return descent;
    }

    @Override // com.badlogic.gdx.scenes.scene2d.ui.Widget, com.badlogic.gdx.scenes.scene2d.utils.Layout
    public float getPrefWidth() {
        if (this.wrap) {
            return 0.0f;
        }
        if (this.prefSizeInvalid) {
            scaleAndComputePrefSize();
        }
        float f = this.prefWidth;
        Drawable drawable = this.style.background;
        if (drawable == null) {
            return f;
        }
        return Math.max(drawable.getRightWidth() + drawable.getLeftWidth() + f, drawable.getMinWidth());
    }

    public LabelStyle getStyle() {
        return this.style;
    }

    public StringBuilder getText() {
        return this.text;
    }

    public boolean getWrap() {
        return this.wrap;
    }

    @Override // com.badlogic.gdx.scenes.scene2d.ui.Widget, com.badlogic.gdx.scenes.scene2d.utils.Layout
    public void invalidate() {
        super.invalidate();
        this.prefSizeInvalid = true;
    }

    /* JADX WARN: Code duplicated, block: B:36:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:38:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:39:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:41:0x0112  */
    /* JADX WARN: Code duplicated, block: B:43:0x011a  */
    /* JADX WARN: Code duplicated, block: B:45:0x0126  */
    /* JADX WARN: Code duplicated, block: B:46:0x012b  */
    /* JADX WARN: Code duplicated, block: B:48:0x013a  */
    /* JADX WARN: Code duplicated, block: B:51:0x014c  */
    /* JADX WARN: Code duplicated, block: B:54:0x016d  */
    /* JADX WARN: Code duplicated, block: B:56:? A[RETURN, SYNTHETIC] */
    @Override // com.badlogic.gdx.scenes.scene2d.ui.Widget, com.badlogic.gdx.scenes.scene2d.utils.Layout
    public void layout() {
        float rightWidth;
        float topHeight;
        float f;
        float fC;
        GlyphLayout glyphLayout;
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        float f7;
        int i;
        float f8;
        float f9;
        float fC2;
        float f10;
        float f11;
        BitmapFont font = this.cache.getFont();
        float scaleX = font.getScaleX();
        float scaleY = font.getScaleY();
        if (this.fontScaleChanged) {
            font.getData().setScale(this.fontScaleX, this.fontScaleY);
        }
        boolean z = this.wrap && this.ellipsis == null;
        if (z) {
            float prefHeight = getPrefHeight();
            if (prefHeight != this.lastPrefHeight) {
                this.lastPrefHeight = prefHeight;
                invalidateHierarchy();
            }
        }
        float width = getWidth();
        float height = getHeight();
        Drawable drawable = this.style.background;
        if (drawable != null) {
            float leftWidth = drawable.getLeftWidth();
            float bottomHeight = drawable.getBottomHeight();
            rightWidth = width - (drawable.getRightWidth() + drawable.getLeftWidth());
            topHeight = height - (drawable.getTopHeight() + drawable.getBottomHeight());
            fC = leftWidth;
            f = bottomHeight;
        } else {
            rightWidth = width;
            topHeight = height;
            f = 0.0f;
            fC = 0.0f;
        }
        GlyphLayout glyphLayout2 = this.layout;
        if (z || this.text.indexOf("\n") != -1) {
            StringBuilder stringBuilder = this.text;
            glyphLayout = glyphLayout2;
            f2 = f;
            float f12 = fC;
            f3 = topHeight;
            f4 = scaleX;
            float f13 = rightWidth;
            glyphLayout2.setText(font, stringBuilder, 0, stringBuilder.length, Color.WHITE, rightWidth, this.lineAlign, z, this.ellipsis);
            float f14 = glyphLayout.width;
            float f15 = glyphLayout.height;
            int i2 = this.labelAlign;
            if ((i2 & 8) == 0) {
                fC = (i2 & 16) != 0 ? (f13 - f14) + f12 : DM.c(f13, f14, 2.0f, f12);
                f5 = f14;
                f6 = f15;
            } else {
                f5 = f14;
                f6 = f15;
                f7 = f12;
            }
            i = this.labelAlign;
            if ((i & 2) != 0) {
                if (this.cache.getFont().isFlipped()) {
                    f11 = 0.0f;
                } else {
                    f11 = f3 - f6;
                }
                fC2 = this.style.font.getDescent() + f2 + f11;
            } else {
                f8 = f2;
                f9 = f3;
                if ((i & 4) != 0) {
                    if (this.cache.getFont().isFlipped()) {
                        f10 = f9 - f6;
                    } else {
                        f10 = 0.0f;
                    }
                    fC2 = (f8 + f10) - this.style.font.getDescent();
                } else {
                    fC2 = DM.c(f9, f6, 2.0f, f8);
                }
            }
            if (!this.cache.getFont().isFlipped()) {
                fC2 += f6;
            }
            float f16 = fC2;
            StringBuilder stringBuilder2 = this.text;
            glyphLayout.setText(font, stringBuilder2, 0, stringBuilder2.length, Color.WHITE, f5, this.lineAlign, z, this.ellipsis);
            this.cache.setText(glyphLayout, f7, f16);
            if (this.fontScaleChanged) {
                font.getData().setScale(f4, scaleY);
            }
        }
        f6 = font.getData().capHeight;
        glyphLayout = glyphLayout2;
        f2 = f;
        f3 = topHeight;
        f5 = rightWidth;
        f4 = scaleX;
        f7 = fC;
        i = this.labelAlign;
        if ((i & 2) != 0) {
            if (this.cache.getFont().isFlipped()) {
                f11 = 0.0f;
            } else {
                f11 = f3 - f6;
            }
            fC2 = this.style.font.getDescent() + f2 + f11;
        } else {
            f8 = f2;
            f9 = f3;
            if ((i & 4) != 0) {
                if (this.cache.getFont().isFlipped()) {
                    f10 = f9 - f6;
                } else {
                    f10 = 0.0f;
                }
                fC2 = (f8 + f10) - this.style.font.getDescent();
            } else {
                fC2 = DM.c(f9, f6, 2.0f, f8);
            }
        }
        if (!this.cache.getFont().isFlipped()) {
            fC2 += f6;
        }
        float f17 = fC2;
        StringBuilder stringBuilder3 = this.text;
        glyphLayout.setText(font, stringBuilder3, 0, stringBuilder3.length, Color.WHITE, f5, this.lineAlign, z, this.ellipsis);
        this.cache.setText(glyphLayout, f7, f17);
        if (this.fontScaleChanged) {
            font.getData().setScale(f4, scaleY);
        }
    }

    public void setAlignment(int i) {
        setAlignment(i, i);
    }

    public void setEllipsis(@Null String str) {
        this.ellipsis = str;
    }

    public void setFontScale(float f) {
        setFontScale(f, f);
    }

    public void setFontScaleX(float f) {
        setFontScale(f, this.fontScaleY);
    }

    public void setFontScaleY(float f) {
        setFontScale(this.fontScaleX, f);
    }

    public void setStyle(LabelStyle labelStyle) {
        if (labelStyle == null) {
            throw new IllegalArgumentException("style cannot be null.");
        }
        BitmapFont bitmapFont = labelStyle.font;
        if (bitmapFont == null) {
            throw new IllegalArgumentException("Missing LabelStyle font.");
        }
        this.style = labelStyle;
        this.cache = bitmapFont.newFontCache();
        invalidateHierarchy();
    }

    public boolean setText(int i) {
        if (this.intValue == i) {
            return false;
        }
        this.text.clear();
        this.text.append(i);
        this.intValue = i;
        invalidateHierarchy();
        return true;
    }

    public void setWrap(boolean z) {
        this.wrap = z;
        invalidateHierarchy();
    }

    public boolean textEquals(CharSequence charSequence) {
        StringBuilder stringBuilder = this.text;
        int i = stringBuilder.length;
        char[] cArr = stringBuilder.chars;
        if (i != charSequence.length()) {
            return false;
        }
        for (int i2 = 0; i2 < i; i2++) {
            if (cArr[i2] != charSequence.charAt(i2)) {
                return false;
            }
        }
        return true;
    }

    @Override // com.badlogic.gdx.scenes.scene2d.Actor
    public String toString() {
        String name = getName();
        if (name != null) {
            return name;
        }
        String name2 = getClass().getName();
        int iLastIndexOf = name2.lastIndexOf(46);
        if (iLastIndexOf != -1) {
            name2 = name2.substring(iLastIndexOf + 1);
        }
        StringBuilder sb = new StringBuilder();
        sb.append(name2.indexOf(36) != -1 ? "Label " : "");
        sb.append(name2);
        sb.append(": ");
        sb.append((Object) this.text);
        return sb.toString();
    }

    public Label(@Null CharSequence charSequence, Skin skin, String str) {
        this(charSequence, (LabelStyle) skin.get(str, LabelStyle.class));
    }

    public void setAlignment(int i, int i2) {
        this.labelAlign = i;
        if ((i2 & 8) != 0) {
            this.lineAlign = 8;
        } else if ((i2 & 16) != 0) {
            this.lineAlign = 16;
        } else {
            this.lineAlign = 1;
        }
        invalidate();
    }

    public void setEllipsis(boolean z) {
        if (z) {
            this.ellipsis = "...";
        } else {
            this.ellipsis = null;
        }
    }

    public void setFontScale(float f, float f2) {
        this.fontScaleChanged = true;
        this.fontScaleX = f;
        this.fontScaleY = f2;
        invalidateHierarchy();
    }

    public Label(@Null CharSequence charSequence, Skin skin, String str, Color color) {
        this(charSequence, new LabelStyle(skin.getFont(str), color));
    }

    public Label(@Null CharSequence charSequence, Skin skin, String str, String str2) {
        this(charSequence, new LabelStyle(skin.getFont(str), skin.getColor(str2)));
    }

    public Label(@Null CharSequence charSequence, LabelStyle labelStyle) {
        this.layout = new GlyphLayout();
        StringBuilder stringBuilder = new StringBuilder();
        this.text = stringBuilder;
        this.intValue = Integer.MIN_VALUE;
        this.labelAlign = 8;
        this.lineAlign = 8;
        this.prefSizeInvalid = true;
        this.fontScaleX = 1.0f;
        this.fontScaleY = 1.0f;
        this.fontScaleChanged = false;
        if (charSequence != null) {
            stringBuilder.append(charSequence);
        }
        setStyle(labelStyle);
        if (charSequence == null || charSequence.length() <= 0) {
            return;
        }
        setSize(getPrefWidth(), getPrefHeight());
    }

    public void setText(@Null CharSequence charSequence) {
        if (charSequence == null) {
            StringBuilder stringBuilder = this.text;
            if (stringBuilder.length == 0) {
                return;
            } else {
                stringBuilder.clear();
            }
        } else if (charSequence instanceof StringBuilder) {
            if (this.text.equals(charSequence)) {
                return;
            }
            this.text.clear();
            this.text.append((StringBuilder) charSequence);
        } else {
            if (textEquals(charSequence)) {
                return;
            }
            this.text.clear();
            this.text.append(charSequence);
        }
        this.intValue = Integer.MIN_VALUE;
        invalidateHierarchy();
    }
}
