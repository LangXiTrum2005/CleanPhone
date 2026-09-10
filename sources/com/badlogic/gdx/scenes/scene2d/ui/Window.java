package com.badlogic.gdx.scenes.scene2d.ui;

import com.badlogic.gdx.graphics.Camera;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.scenes.scene2d.Actor;
import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.InputListener;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.Touchable;
import com.badlogic.gdx.scenes.scene2d.utils.Drawable;
import com.badlogic.gdx.utils.Null;

/* JADX INFO: loaded from: classes.dex */
public class Window extends Table {
    private static final int MOVE = 32;
    private static final Vector2 tmpPosition = new Vector2();
    private static final Vector2 tmpSize = new Vector2();
    protected boolean dragging;
    boolean drawTitleTable;
    protected int edge;
    boolean isModal;
    boolean isMovable;
    boolean isResizable;
    boolean keepWithinStage;
    int resizeBorder;
    private WindowStyle style;
    Label titleLabel;
    Table titleTable;

    public Window(String str, Skin skin) {
        this(str, (WindowStyle) skin.get(WindowStyle.class));
        setSkin(skin);
    }

    @Override // com.badlogic.gdx.scenes.scene2d.ui.Table, com.badlogic.gdx.scenes.scene2d.ui.WidgetGroup, com.badlogic.gdx.scenes.scene2d.Group, com.badlogic.gdx.scenes.scene2d.Actor
    public void draw(Batch batch, float f) {
        Stage stage = getStage();
        if (stage != null) {
            if (stage.getKeyboardFocus() == null) {
                stage.setKeyboardFocus(this);
            }
            keepWithinStage();
            if (this.style.stageBackground != null) {
                Vector2 vector2 = tmpPosition;
                stageToLocalCoordinates(vector2.set(0.0f, 0.0f));
                Vector2 vector3 = tmpSize;
                stageToLocalCoordinates(vector3.set(stage.getWidth(), stage.getHeight()));
                drawStageBackground(batch, f, getX() + vector2.x, getY() + vector2.y, getX() + vector3.x, getY() + vector3.y);
            }
        }
        super.draw(batch, f);
    }

    @Override // com.badlogic.gdx.scenes.scene2d.ui.Table
    public void drawBackground(Batch batch, float f, float f2, float f3) {
        super.drawBackground(batch, f, f2, f3);
        this.titleTable.getColor().f202a = getColor().f202a;
        float padTop = getPadTop();
        float padLeft = getPadLeft();
        this.titleTable.setSize((getWidth() - padLeft) - getPadRight(), padTop);
        this.titleTable.setPosition(padLeft, getHeight() - padTop);
        this.drawTitleTable = true;
        this.titleTable.draw(batch, f);
        this.drawTitleTable = false;
    }

    public void drawStageBackground(Batch batch, float f, float f2, float f3, float f4, float f5) {
        Color color = getColor();
        batch.setColor(color.r, color.g, color.b, color.f202a * f);
        this.style.stageBackground.draw(batch, f2, f3, f4, f5);
    }

    @Override // com.badlogic.gdx.scenes.scene2d.ui.Table, com.badlogic.gdx.scenes.scene2d.ui.WidgetGroup, com.badlogic.gdx.scenes.scene2d.utils.Layout
    public float getPrefWidth() {
        return Math.max(super.getPrefWidth(), getPadRight() + getPadLeft() + this.titleTable.getPrefWidth());
    }

    public WindowStyle getStyle() {
        return this.style;
    }

    public Label getTitleLabel() {
        return this.titleLabel;
    }

    public Table getTitleTable() {
        return this.titleTable;
    }

    @Override // com.badlogic.gdx.scenes.scene2d.ui.Table, com.badlogic.gdx.scenes.scene2d.ui.WidgetGroup, com.badlogic.gdx.scenes.scene2d.Group, com.badlogic.gdx.scenes.scene2d.Actor
    @Null
    public Actor hit(float f, float f2, boolean z) {
        if (!isVisible()) {
            return null;
        }
        Actor actorHit = super.hit(f, f2, z);
        if (actorHit == null && this.isModal && (!z || getTouchable() == Touchable.enabled)) {
            return this;
        }
        float height = getHeight();
        if (actorHit != null && actorHit != this && f2 <= height && f2 >= height - getPadTop() && f >= 0.0f && f <= getWidth()) {
            Actor parent = actorHit;
            while (parent.getParent() != this) {
                parent = parent.getParent();
            }
            if (getCell(parent) != null) {
                return this;
            }
        }
        return actorHit;
    }

    public boolean isDragging() {
        return this.dragging;
    }

    public boolean isModal() {
        return this.isModal;
    }

    public boolean isMovable() {
        return this.isMovable;
    }

    public boolean isResizable() {
        return this.isResizable;
    }

    public void keepWithinStage() {
        Stage stage;
        if (this.keepWithinStage && (stage = getStage()) != null) {
            Camera camera = stage.getCamera();
            if (!(camera instanceof OrthographicCamera)) {
                if (getParent() == stage.getRoot()) {
                    float width = stage.getWidth();
                    float height = stage.getHeight();
                    if (getX() < 0.0f) {
                        setX(0.0f);
                    }
                    if (getRight() > width) {
                        setX(width - getWidth());
                    }
                    if (getY() < 0.0f) {
                        setY(0.0f);
                    }
                    if (getTop() > height) {
                        setY(height - getHeight());
                        return;
                    }
                    return;
                }
                return;
            }
            OrthographicCamera orthographicCamera = (OrthographicCamera) camera;
            float width2 = stage.getWidth();
            float height2 = stage.getHeight();
            float x = getX(16);
            float f = camera.position.x;
            float f2 = x - f;
            float f3 = width2 / 2.0f;
            float f4 = orthographicCamera.zoom;
            if (f2 > f3 / f4) {
                setPosition((f3 / f4) + f, getY(16), 16);
            }
            float x2 = getX(8);
            float f5 = camera.position.x;
            float f6 = x2 - f5;
            float f7 = orthographicCamera.zoom;
            if (f6 < ((-width2) / 2.0f) / f7) {
                setPosition(f5 - (f3 / f7), getY(8), 8);
            }
            float f8 = height2 / 2.0f;
            if (getY(2) - camera.position.y > f8 / orthographicCamera.zoom) {
                setPosition(getX(2), (f8 / orthographicCamera.zoom) + camera.position.y, 2);
            }
            if (getY(4) - camera.position.y < ((-height2) / 2.0f) / orthographicCamera.zoom) {
                setPosition(getX(4), camera.position.y - (f8 / orthographicCamera.zoom), 4);
            }
        }
    }

    public Label newLabel(String str, Label.LabelStyle labelStyle) {
        return new Label(str, labelStyle);
    }

    public void setKeepWithinStage(boolean z) {
        this.keepWithinStage = z;
    }

    public void setModal(boolean z) {
        this.isModal = z;
    }

    public void setMovable(boolean z) {
        this.isMovable = z;
    }

    public void setResizable(boolean z) {
        this.isResizable = z;
    }

    public void setResizeBorder(int i) {
        this.resizeBorder = i;
    }

    public void setStyle(WindowStyle windowStyle) {
        if (windowStyle == null) {
            throw new IllegalArgumentException("style cannot be null.");
        }
        this.style = windowStyle;
        setBackground(windowStyle.background);
        this.titleLabel.setStyle(new Label.LabelStyle(windowStyle.titleFont, windowStyle.titleFontColor));
        invalidateHierarchy();
    }

    public static class WindowStyle {

        @Null
        public Drawable background;

        @Null
        public Drawable stageBackground;
        public BitmapFont titleFont;

        @Null
        public Color titleFontColor;

        public WindowStyle() {
            this.titleFontColor = new Color(1.0f, 1.0f, 1.0f, 1.0f);
        }

        public WindowStyle(BitmapFont bitmapFont, Color color, @Null Drawable drawable) {
            Color color2 = new Color(1.0f, 1.0f, 1.0f, 1.0f);
            this.titleFontColor = color2;
            this.titleFont = bitmapFont;
            color2.set(color);
            this.background = drawable;
        }

        public WindowStyle(WindowStyle windowStyle) {
            this.titleFontColor = new Color(1.0f, 1.0f, 1.0f, 1.0f);
            this.titleFont = windowStyle.titleFont;
            if (windowStyle.titleFontColor != null) {
                this.titleFontColor = new Color(windowStyle.titleFontColor);
            }
            this.background = windowStyle.background;
            this.stageBackground = windowStyle.stageBackground;
        }
    }

    public Window(String str, Skin skin, String str2) {
        this(str, (WindowStyle) skin.get(str2, WindowStyle.class));
        setSkin(skin);
    }

    public Window(String str, WindowStyle windowStyle) {
        this.isMovable = true;
        this.resizeBorder = 8;
        this.keepWithinStage = true;
        if (str != null) {
            setTouchable(Touchable.enabled);
            setClip(true);
            Label labelNewLabel = newLabel(str, new Label.LabelStyle(windowStyle.titleFont, windowStyle.titleFontColor));
            this.titleLabel = labelNewLabel;
            labelNewLabel.setEllipsis(true);
            Table table = new Table() { // from class: com.badlogic.gdx.scenes.scene2d.ui.Window.1
                @Override // com.badlogic.gdx.scenes.scene2d.ui.Table, com.badlogic.gdx.scenes.scene2d.ui.WidgetGroup, com.badlogic.gdx.scenes.scene2d.Group, com.badlogic.gdx.scenes.scene2d.Actor
                public void draw(Batch batch, float f) {
                    if (Window.this.drawTitleTable) {
                        super.draw(batch, f);
                    }
                }
            };
            this.titleTable = table;
            table.add(this.titleLabel).growX().minWidth(0.0f);
            addActor(this.titleTable);
            setStyle(windowStyle);
            setWidth(150.0f);
            setHeight(150.0f);
            addCaptureListener(new InputListener() { // from class: com.badlogic.gdx.scenes.scene2d.ui.Window.2
                @Override // com.badlogic.gdx.scenes.scene2d.InputListener
                public boolean touchDown(InputEvent inputEvent, float f, float f2, int i, int i2) {
                    Window.this.toFront();
                    return false;
                }
            });
            addListener(new InputListener() { // from class: com.badlogic.gdx.scenes.scene2d.ui.Window.3
                float lastX;
                float lastY;
                float startX;
                float startY;

                private void updateEdge(float f, float f2) {
                    Window window = Window.this;
                    float f3 = window.resizeBorder / 2.0f;
                    float width = window.getWidth();
                    float height = Window.this.getHeight();
                    float padTop = Window.this.getPadTop();
                    float padLeft = Window.this.getPadLeft();
                    float padBottom = Window.this.getPadBottom();
                    float padRight = width - Window.this.getPadRight();
                    Window window2 = Window.this;
                    window2.edge = 0;
                    if (window2.isResizable && f >= padLeft - f3 && f <= padRight + f3 && f2 >= padBottom - f3) {
                        if (f < padLeft + f3) {
                            window2.edge = 8;
                        }
                        if (f > padRight - f3) {
                            window2.edge |= 16;
                        }
                        if (f2 < padBottom + f3) {
                            window2.edge |= 4;
                        }
                        int i = window2.edge;
                        if (i != 0) {
                            f3 += 25.0f;
                        }
                        if (f < padLeft + f3) {
                            window2.edge = i | 8;
                        }
                        if (f > padRight - f3) {
                            window2.edge |= 16;
                        }
                        if (f2 < padBottom + f3) {
                            window2.edge |= 4;
                        }
                    }
                    if (!window2.isMovable || window2.edge != 0 || f2 > height || f2 < height - padTop || f < padLeft || f > padRight) {
                        return;
                    }
                    window2.edge = 32;
                }

                @Override // com.badlogic.gdx.scenes.scene2d.InputListener
                public boolean keyDown(InputEvent inputEvent, int i) {
                    return Window.this.isModal;
                }

                @Override // com.badlogic.gdx.scenes.scene2d.InputListener
                public boolean keyTyped(InputEvent inputEvent, char c) {
                    return Window.this.isModal;
                }

                @Override // com.badlogic.gdx.scenes.scene2d.InputListener
                public boolean keyUp(InputEvent inputEvent, int i) {
                    return Window.this.isModal;
                }

                @Override // com.badlogic.gdx.scenes.scene2d.InputListener
                public boolean mouseMoved(InputEvent inputEvent, float f, float f2) {
                    updateEdge(f, f2);
                    return Window.this.isModal;
                }

                public boolean scrolled(InputEvent inputEvent, float f, float f2, int i) {
                    return Window.this.isModal;
                }

                @Override // com.badlogic.gdx.scenes.scene2d.InputListener
                public boolean touchDown(InputEvent inputEvent, float f, float f2, int i, int i2) {
                    if (i2 == 0) {
                        updateEdge(f, f2);
                        Window window = Window.this;
                        window.dragging = window.edge != 0;
                        this.startX = f;
                        this.startY = f2;
                        this.lastX = f - window.getWidth();
                        this.lastY = f2 - Window.this.getHeight();
                    }
                    Window window2 = Window.this;
                    return window2.edge != 0 || window2.isModal;
                }

                @Override // com.badlogic.gdx.scenes.scene2d.InputListener
                public void touchDragged(InputEvent inputEvent, float f, float f2, int i) {
                    Window window = Window.this;
                    if (window.dragging) {
                        float width = window.getWidth();
                        float height = Window.this.getHeight();
                        float x = Window.this.getX();
                        float y = Window.this.getY();
                        float minWidth = Window.this.getMinWidth();
                        Window.this.getMaxWidth();
                        float minHeight = Window.this.getMinHeight();
                        Window.this.getMaxHeight();
                        Stage stage = Window.this.getStage();
                        Window window2 = Window.this;
                        boolean z = window2.keepWithinStage && stage != null && window2.getParent() == stage.getRoot();
                        int i2 = Window.this.edge;
                        if ((i2 & 32) != 0) {
                            x += f - this.startX;
                            y += f2 - this.startY;
                        }
                        if ((i2 & 8) != 0) {
                            float f3 = f - this.startX;
                            if (width - f3 < minWidth) {
                                f3 = -(minWidth - width);
                            }
                            if (z && x + f3 < 0.0f) {
                                f3 = -x;
                            }
                            width -= f3;
                            x += f3;
                        }
                        if ((i2 & 4) != 0) {
                            float f4 = f2 - this.startY;
                            if (height - f4 < minHeight) {
                                f4 = -(minHeight - height);
                            }
                            if (z && y + f4 < 0.0f) {
                                f4 = -y;
                            }
                            height -= f4;
                            y += f4;
                        }
                        if ((i2 & 16) != 0) {
                            float width2 = (f - this.lastX) - width;
                            if (width + width2 < minWidth) {
                                width2 = minWidth - width;
                            }
                            if (z && x + width + width2 > stage.getWidth()) {
                                width2 = (stage.getWidth() - x) - width;
                            }
                            width += width2;
                        }
                        if ((Window.this.edge & 2) != 0) {
                            float height2 = (f2 - this.lastY) - height;
                            if (height + height2 < minHeight) {
                                height2 = minHeight - height;
                            }
                            if (z && y + height + height2 > stage.getHeight()) {
                                height2 = (stage.getHeight() - y) - height;
                            }
                            height += height2;
                        }
                        Window.this.setBounds(Math.round(x), Math.round(y), Math.round(width), Math.round(height));
                    }
                }

                @Override // com.badlogic.gdx.scenes.scene2d.InputListener
                public void touchUp(InputEvent inputEvent, float f, float f2, int i, int i2) {
                    Window.this.dragging = false;
                }
            });
            return;
        }
        throw new IllegalArgumentException("title cannot be null.");
    }
}
