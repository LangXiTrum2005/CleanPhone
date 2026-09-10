package com.badlogic.gdx.graphics.glutils;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.math.MathUtils;
import com.badlogic.gdx.math.Matrix4;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.math.Vector3;
import com.badlogic.gdx.utils.Disposable;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC5044xl;

/* JADX INFO: loaded from: classes.dex */
public class ShapeRenderer implements Disposable {
    private boolean autoShapeType;
    private final Color color;
    private final Matrix4 combinedMatrix;
    private float defaultRectLineWidth;
    private boolean matrixDirty;
    private final Matrix4 projectionMatrix;
    private final ImmediateModeRenderer renderer;
    private ShapeType shapeType;
    private final Vector2 tmp;
    private final Matrix4 transformMatrix;

    public enum ShapeType {
        Point(0),
        Line(1),
        Filled(4);

        private final int glType;

        ShapeType(int i) {
            this.glType = i;
        }

        public int getGlType() {
            return this.glType;
        }
    }

    public ShapeRenderer() {
        this(5000);
    }

    public void arc(float f, float f2, float f3, float f4, float f5) {
        arc(f, f2, f3, f4, f5, Math.max(1, (int) ((f5 / 360.0f) * ((float) Math.cbrt(f3)) * 6.0f)));
    }

    public void begin() {
        if (!this.autoShapeType) {
            throw new IllegalStateException("autoShapeType must be true to use this method.");
        }
        begin(ShapeType.Line);
    }

    public void box(float f, float f2, float f3, float f4, float f5, float f6) {
        float f7 = -f6;
        float floatBits = this.color.toFloatBits();
        ShapeType shapeType = this.shapeType;
        ShapeType shapeType2 = ShapeType.Line;
        if (shapeType == shapeType2) {
            check(shapeType2, ShapeType.Filled, 24);
            this.renderer.color(floatBits);
            this.renderer.vertex(f, f2, f3);
            this.renderer.color(floatBits);
            float f8 = f4 + f;
            this.renderer.vertex(f8, f2, f3);
            this.renderer.color(floatBits);
            this.renderer.vertex(f8, f2, f3);
            this.renderer.color(floatBits);
            float f9 = f7 + f3;
            this.renderer.vertex(f8, f2, f9);
            this.renderer.color(floatBits);
            this.renderer.vertex(f8, f2, f9);
            this.renderer.color(floatBits);
            this.renderer.vertex(f, f2, f9);
            this.renderer.color(floatBits);
            this.renderer.vertex(f, f2, f9);
            this.renderer.color(floatBits);
            this.renderer.vertex(f, f2, f3);
            this.renderer.color(floatBits);
            this.renderer.vertex(f, f2, f3);
            this.renderer.color(floatBits);
            float f10 = f5 + f2;
            this.renderer.vertex(f, f10, f3);
            this.renderer.color(floatBits);
            this.renderer.vertex(f, f10, f3);
            this.renderer.color(floatBits);
            this.renderer.vertex(f8, f10, f3);
            this.renderer.color(floatBits);
            this.renderer.vertex(f8, f10, f3);
            this.renderer.color(floatBits);
            this.renderer.vertex(f8, f10, f9);
            this.renderer.color(floatBits);
            this.renderer.vertex(f8, f10, f9);
            this.renderer.color(floatBits);
            this.renderer.vertex(f, f10, f9);
            this.renderer.color(floatBits);
            this.renderer.vertex(f, f10, f9);
            this.renderer.color(floatBits);
            this.renderer.vertex(f, f10, f3);
            this.renderer.color(floatBits);
            this.renderer.vertex(f8, f2, f3);
            this.renderer.color(floatBits);
            this.renderer.vertex(f8, f10, f3);
            this.renderer.color(floatBits);
            this.renderer.vertex(f8, f2, f9);
            this.renderer.color(floatBits);
            this.renderer.vertex(f8, f10, f9);
            this.renderer.color(floatBits);
            this.renderer.vertex(f, f2, f9);
            this.renderer.color(floatBits);
            this.renderer.vertex(f, f10, f9);
            return;
        }
        check(shapeType2, ShapeType.Filled, 36);
        this.renderer.color(floatBits);
        this.renderer.vertex(f, f2, f3);
        this.renderer.color(floatBits);
        float f11 = f4 + f;
        this.renderer.vertex(f11, f2, f3);
        this.renderer.color(floatBits);
        float f12 = f5 + f2;
        this.renderer.vertex(f11, f12, f3);
        this.renderer.color(floatBits);
        this.renderer.vertex(f, f2, f3);
        this.renderer.color(floatBits);
        this.renderer.vertex(f11, f12, f3);
        this.renderer.color(floatBits);
        this.renderer.vertex(f, f12, f3);
        this.renderer.color(floatBits);
        float f13 = f7 + f3;
        this.renderer.vertex(f11, f2, f13);
        this.renderer.color(floatBits);
        this.renderer.vertex(f, f2, f13);
        this.renderer.color(floatBits);
        this.renderer.vertex(f11, f12, f13);
        this.renderer.color(floatBits);
        this.renderer.vertex(f11, f12, f13);
        this.renderer.color(floatBits);
        this.renderer.vertex(f, f2, f13);
        this.renderer.color(floatBits);
        this.renderer.vertex(f, f12, f13);
        this.renderer.color(floatBits);
        this.renderer.vertex(f, f2, f13);
        this.renderer.color(floatBits);
        this.renderer.vertex(f, f2, f3);
        this.renderer.color(floatBits);
        this.renderer.vertex(f, f12, f3);
        this.renderer.color(floatBits);
        this.renderer.vertex(f, f2, f13);
        this.renderer.color(floatBits);
        this.renderer.vertex(f, f12, f3);
        this.renderer.color(floatBits);
        this.renderer.vertex(f, f12, f13);
        this.renderer.color(floatBits);
        this.renderer.vertex(f11, f2, f3);
        this.renderer.color(floatBits);
        this.renderer.vertex(f11, f2, f13);
        this.renderer.color(floatBits);
        this.renderer.vertex(f11, f12, f13);
        this.renderer.color(floatBits);
        this.renderer.vertex(f11, f2, f3);
        this.renderer.color(floatBits);
        this.renderer.vertex(f11, f12, f13);
        this.renderer.color(floatBits);
        this.renderer.vertex(f11, f12, f3);
        this.renderer.color(floatBits);
        this.renderer.vertex(f, f12, f3);
        this.renderer.color(floatBits);
        this.renderer.vertex(f11, f12, f3);
        this.renderer.color(floatBits);
        this.renderer.vertex(f11, f12, f13);
        this.renderer.color(floatBits);
        this.renderer.vertex(f, f12, f3);
        this.renderer.color(floatBits);
        this.renderer.vertex(f11, f12, f13);
        this.renderer.color(floatBits);
        this.renderer.vertex(f, f12, f13);
        this.renderer.color(floatBits);
        this.renderer.vertex(f, f2, f13);
        this.renderer.color(floatBits);
        this.renderer.vertex(f11, f2, f13);
        this.renderer.color(floatBits);
        this.renderer.vertex(f11, f2, f3);
        this.renderer.color(floatBits);
        this.renderer.vertex(f, f2, f13);
        this.renderer.color(floatBits);
        this.renderer.vertex(f11, f2, f3);
        this.renderer.color(floatBits);
        this.renderer.vertex(f, f2, f3);
    }

    public final void check(ShapeType shapeType, ShapeType shapeType2, int i) {
        ShapeType shapeType3 = this.shapeType;
        if (shapeType3 == null) {
            throw new IllegalStateException("begin must be called first.");
        }
        if (shapeType3 == shapeType || shapeType3 == shapeType2) {
            if (this.matrixDirty) {
                end();
                begin(shapeType3);
                return;
            } else {
                if (this.renderer.getMaxVertices() - this.renderer.getNumVertices() < i) {
                    ShapeType shapeType4 = this.shapeType;
                    end();
                    begin(shapeType4);
                    return;
                }
                return;
            }
        }
        if (this.autoShapeType) {
            end();
            begin(shapeType);
        } else {
            if (shapeType2 == null) {
                throw new IllegalStateException("Must call begin(ShapeType." + shapeType + ").");
            }
            throw new IllegalStateException("Must call begin(ShapeType." + shapeType + ") or begin(ShapeType." + shapeType2 + ").");
        }
    }

    public void circle(float f, float f2, float f3) {
        circle(f, f2, f3, Math.max(1, (int) (((float) Math.cbrt(f3)) * 6.0f)));
    }

    public void cone(float f, float f2, float f3, float f4, float f5) {
        cone(f, f2, f3, f4, f5, Math.max(1, (int) (((float) Math.sqrt(f4)) * 4.0f)));
    }

    public void curve(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, int i) {
        check(ShapeType.Line, null, (i * 2) + 2);
        float floatBits = this.color.toFloatBits();
        float f9 = 1.0f / i;
        float f10 = f9 * f9;
        float f11 = f10 * f9;
        float f12 = f9 * 3.0f;
        float f13 = f10 * 3.0f;
        float f14 = f10 * 6.0f;
        float f15 = 6.0f * f11;
        float f16 = (f - (f3 * 2.0f)) + f5;
        float f17 = (f2 - (2.0f * f4)) + f6;
        float f18 = (((f3 - f5) * 3.0f) - f) + f7;
        float f19 = (((f4 - f6) * 3.0f) - f2) + f8;
        float f20 = (f18 * f11) + (f16 * f13) + ((f3 - f) * f12);
        float f21 = (f11 * f19) + (f13 * f17) + ((f4 - f2) * f12);
        float f22 = f18 * f15;
        float f23 = (f16 * f14) + f22;
        float f24 = f19 * f15;
        float f25 = (f17 * f14) + f24;
        float f26 = f2;
        int i2 = i;
        float f27 = f;
        while (true) {
            int i3 = i2 - 1;
            if (i2 <= 0) {
                this.renderer.color(floatBits);
                this.renderer.vertex(f27, f26, 0.0f);
                this.renderer.color(floatBits);
                this.renderer.vertex(f7, f8, 0.0f);
                return;
            }
            this.renderer.color(floatBits);
            this.renderer.vertex(f27, f26, 0.0f);
            f27 += f20;
            f26 += f21;
            f20 += f23;
            f21 += f25;
            f23 += f22;
            f25 += f24;
            this.renderer.color(floatBits);
            this.renderer.vertex(f27, f26, 0.0f);
            i2 = i3;
        }
    }

    @Override // com.badlogic.gdx.utils.Disposable
    public void dispose() {
        this.renderer.dispose();
    }

    public void ellipse(float f, float f2, float f3, float f4) {
        ellipse(f, f2, f3, f4, Math.max(1, (int) (((float) Math.cbrt(Math.max(f3 * 0.5f, 0.5f * f4))) * 12.0f)));
    }

    public void end() {
        this.renderer.end();
        this.shapeType = null;
    }

    public void flush() {
        ShapeType shapeType = this.shapeType;
        if (shapeType == null) {
            return;
        }
        end();
        begin(shapeType);
    }

    public Color getColor() {
        return this.color;
    }

    public ShapeType getCurrentType() {
        return this.shapeType;
    }

    public Matrix4 getProjectionMatrix() {
        return this.projectionMatrix;
    }

    public ImmediateModeRenderer getRenderer() {
        return this.renderer;
    }

    public Matrix4 getTransformMatrix() {
        return this.transformMatrix;
    }

    public void identity() {
        this.transformMatrix.idt();
        this.matrixDirty = true;
    }

    public boolean isDrawing() {
        return this.shapeType != null;
    }

    public final void line(float f, float f2, float f3, float f4, float f5, float f6) {
        Color color = this.color;
        line(f, f2, f3, f4, f5, f6, color, color);
    }

    public void point(float f, float f2, float f3) {
        ShapeType shapeType = this.shapeType;
        if (shapeType == ShapeType.Line) {
            float f4 = this.defaultRectLineWidth * 0.5f;
            line(f - f4, f2 - f4, f3, f + f4, f2 + f4, f3);
        } else if (shapeType == ShapeType.Filled) {
            float f5 = this.defaultRectLineWidth;
            float f6 = 0.5f * f5;
            box(f - f6, f2 - f6, f3 - f6, f5, f5, f5);
        } else {
            check(ShapeType.Point, null, 1);
            this.renderer.color(this.color);
            this.renderer.vertex(f, f2, f3);
        }
    }

    public void polygon(float[] fArr, int i, int i2) {
        float f;
        float f2;
        if (i2 < 6) {
            throw new IllegalArgumentException("Polygons must contain at least 3 points.");
        }
        if (i2 % 2 != 0) {
            throw new IllegalArgumentException("Polygons must have an even number of vertices.");
        }
        check(ShapeType.Line, null, i2);
        float floatBits = this.color.toFloatBits();
        float f3 = fArr[0];
        float f4 = fArr[1];
        int i3 = i + i2;
        while (i < i3) {
            float f5 = fArr[i];
            float f6 = fArr[i + 1];
            int i4 = i + 2;
            if (i4 >= i2) {
                f = f3;
                f2 = f4;
            } else {
                f = fArr[i4];
                f2 = fArr[i + 3];
            }
            this.renderer.color(floatBits);
            this.renderer.vertex(f5, f6, 0.0f);
            this.renderer.color(floatBits);
            this.renderer.vertex(f, f2, 0.0f);
            i = i4;
        }
    }

    public void polyline(float[] fArr, int i, int i2) {
        if (i2 < 4) {
            throw new IllegalArgumentException("Polylines must contain at least 2 points.");
        }
        if (i2 % 2 != 0) {
            throw new IllegalArgumentException("Polylines must have an even number of vertices.");
        }
        check(ShapeType.Line, null, i2);
        float floatBits = this.color.toFloatBits();
        int i3 = (i2 + i) - 2;
        while (i < i3) {
            float f = fArr[i];
            float f2 = fArr[i + 1];
            int i4 = i + 2;
            float f3 = fArr[i4];
            float f4 = fArr[i + 3];
            this.renderer.color(floatBits);
            this.renderer.vertex(f, f2, 0.0f);
            this.renderer.color(floatBits);
            this.renderer.vertex(f3, f4, 0.0f);
            i = i4;
        }
    }

    public void rect(float f, float f2, float f3, float f4) {
        ShapeType shapeType = ShapeType.Line;
        check(shapeType, ShapeType.Filled, 8);
        float floatBits = this.color.toFloatBits();
        if (this.shapeType != shapeType) {
            this.renderer.color(floatBits);
            this.renderer.vertex(f, f2, 0.0f);
            this.renderer.color(floatBits);
            float f5 = f3 + f;
            this.renderer.vertex(f5, f2, 0.0f);
            this.renderer.color(floatBits);
            float f6 = f4 + f2;
            this.renderer.vertex(f5, f6, 0.0f);
            this.renderer.color(floatBits);
            this.renderer.vertex(f5, f6, 0.0f);
            this.renderer.color(floatBits);
            this.renderer.vertex(f, f6, 0.0f);
            this.renderer.color(floatBits);
            this.renderer.vertex(f, f2, 0.0f);
            return;
        }
        this.renderer.color(floatBits);
        this.renderer.vertex(f, f2, 0.0f);
        this.renderer.color(floatBits);
        float f7 = f3 + f;
        this.renderer.vertex(f7, f2, 0.0f);
        this.renderer.color(floatBits);
        this.renderer.vertex(f7, f2, 0.0f);
        this.renderer.color(floatBits);
        float f8 = f4 + f2;
        this.renderer.vertex(f7, f8, 0.0f);
        this.renderer.color(floatBits);
        this.renderer.vertex(f7, f8, 0.0f);
        this.renderer.color(floatBits);
        this.renderer.vertex(f, f8, 0.0f);
        this.renderer.color(floatBits);
        this.renderer.vertex(f, f8, 0.0f);
        this.renderer.color(floatBits);
        this.renderer.vertex(f, f2, 0.0f);
    }

    public void rectLine(float f, float f2, float f3, float f4, float f5) {
        ShapeType shapeType = ShapeType.Line;
        check(shapeType, ShapeType.Filled, 8);
        float floatBits = this.color.toFloatBits();
        Vector2 vector2Nor = this.tmp.set(f4 - f2, f - f3).nor();
        float f6 = f5 * 0.5f;
        float f7 = vector2Nor.x * f6;
        float f8 = vector2Nor.y * f6;
        if (this.shapeType != shapeType) {
            this.renderer.color(floatBits);
            this.renderer.vertex(f + f7, f2 + f8, 0.0f);
            this.renderer.color(floatBits);
            float f9 = f - f7;
            float f10 = f2 - f8;
            this.renderer.vertex(f9, f10, 0.0f);
            this.renderer.color(floatBits);
            float f11 = f3 + f7;
            float f12 = f4 + f8;
            this.renderer.vertex(f11, f12, 0.0f);
            this.renderer.color(floatBits);
            this.renderer.vertex(f3 - f7, f4 - f8, 0.0f);
            this.renderer.color(floatBits);
            this.renderer.vertex(f11, f12, 0.0f);
            this.renderer.color(floatBits);
            this.renderer.vertex(f9, f10, 0.0f);
            return;
        }
        this.renderer.color(floatBits);
        float f13 = f + f7;
        float f14 = f2 + f8;
        this.renderer.vertex(f13, f14, 0.0f);
        this.renderer.color(floatBits);
        float f15 = f - f7;
        float f16 = f2 - f8;
        this.renderer.vertex(f15, f16, 0.0f);
        this.renderer.color(floatBits);
        float f17 = f3 + f7;
        float f18 = f4 + f8;
        this.renderer.vertex(f17, f18, 0.0f);
        this.renderer.color(floatBits);
        float f19 = f3 - f7;
        float f20 = f4 - f8;
        this.renderer.vertex(f19, f20, 0.0f);
        this.renderer.color(floatBits);
        this.renderer.vertex(f17, f18, 0.0f);
        this.renderer.color(floatBits);
        this.renderer.vertex(f13, f14, 0.0f);
        this.renderer.color(floatBits);
        this.renderer.vertex(f19, f20, 0.0f);
        this.renderer.color(floatBits);
        this.renderer.vertex(f15, f16, 0.0f);
    }

    public void rotate(float f, float f2, float f3, float f4) {
        this.transformMatrix.rotate(f, f2, f3, f4);
        this.matrixDirty = true;
    }

    public void scale(float f, float f2, float f3) {
        this.transformMatrix.scale(f, f2, f3);
        this.matrixDirty = true;
    }

    public void set(ShapeType shapeType) {
        ShapeType shapeType2 = this.shapeType;
        if (shapeType2 == shapeType) {
            return;
        }
        if (shapeType2 == null) {
            throw new IllegalStateException("begin must be called first.");
        }
        if (!this.autoShapeType) {
            throw new IllegalStateException("autoShapeType must be enabled.");
        }
        end();
        begin(shapeType);
    }

    public void setAutoShapeType(boolean z) {
        this.autoShapeType = z;
    }

    public void setColor(Color color) {
        this.color.set(color);
    }

    public void setProjectionMatrix(Matrix4 matrix4) {
        this.projectionMatrix.set(matrix4);
        this.matrixDirty = true;
    }

    public void setTransformMatrix(Matrix4 matrix4) {
        this.transformMatrix.set(matrix4);
        this.matrixDirty = true;
    }

    public void translate(float f, float f2, float f3) {
        this.transformMatrix.translate(f, f2, f3);
        this.matrixDirty = true;
    }

    public void triangle(float f, float f2, float f3, float f4, float f5, float f6) {
        ShapeType shapeType = ShapeType.Line;
        check(shapeType, ShapeType.Filled, 6);
        float floatBits = this.color.toFloatBits();
        if (this.shapeType != shapeType) {
            this.renderer.color(floatBits);
            this.renderer.vertex(f, f2, 0.0f);
            this.renderer.color(floatBits);
            this.renderer.vertex(f3, f4, 0.0f);
            this.renderer.color(floatBits);
            this.renderer.vertex(f5, f6, 0.0f);
            return;
        }
        this.renderer.color(floatBits);
        this.renderer.vertex(f, f2, 0.0f);
        this.renderer.color(floatBits);
        this.renderer.vertex(f3, f4, 0.0f);
        this.renderer.color(floatBits);
        this.renderer.vertex(f3, f4, 0.0f);
        this.renderer.color(floatBits);
        this.renderer.vertex(f5, f6, 0.0f);
        this.renderer.color(floatBits);
        this.renderer.vertex(f5, f6, 0.0f);
        this.renderer.color(floatBits);
        this.renderer.vertex(f, f2, 0.0f);
    }

    public void updateMatrices() {
        this.matrixDirty = true;
    }

    public void x(float f, float f2, float f3) {
        float f4 = f - f3;
        float f5 = f2 - f3;
        float f6 = f + f3;
        float f7 = f2 + f3;
        line(f4, f5, f6, f7);
        line(f4, f7, f6, f5);
    }

    public ShapeRenderer(int i) {
        this(i, null);
    }

    public void arc(float f, float f2, float f3, float f4, float f5, int i) {
        if (i <= 0) {
            throw new IllegalArgumentException("segments must be > 0.");
        }
        float floatBits = this.color.toFloatBits();
        float f6 = ((f5 / 360.0f) * 6.2831855f) / i;
        float fCos = MathUtils.cos(f6);
        float fSin = MathUtils.sin(f6);
        float f7 = f4 * 0.017453292f;
        float fCos2 = MathUtils.cos(f7) * f3;
        float fSin2 = MathUtils.sin(f7) * f3;
        ShapeType shapeType = this.shapeType;
        ShapeType shapeType2 = ShapeType.Line;
        int i2 = 0;
        if (shapeType == shapeType2) {
            check(shapeType2, ShapeType.Filled, (i * 2) + 2);
            this.renderer.color(floatBits);
            this.renderer.vertex(f, f2, 0.0f);
            this.renderer.color(floatBits);
            this.renderer.vertex(f + fCos2, f2 + fSin2, 0.0f);
            while (i2 < i) {
                this.renderer.color(floatBits);
                this.renderer.vertex(f + fCos2, f2 + fSin2, 0.0f);
                float f8 = (fCos * fCos2) - (fSin * fSin2);
                fSin2 = (fSin2 * fCos) + (fCos2 * fSin);
                this.renderer.color(floatBits);
                this.renderer.vertex(f + f8, f2 + fSin2, 0.0f);
                i2++;
                fCos2 = f8;
            }
            this.renderer.color(floatBits);
            this.renderer.vertex(fCos2 + f, fSin2 + f2, 0.0f);
        } else {
            check(shapeType2, ShapeType.Filled, (i * 3) + 3);
            while (i2 < i) {
                this.renderer.color(floatBits);
                this.renderer.vertex(f, f2, 0.0f);
                this.renderer.color(floatBits);
                this.renderer.vertex(f + fCos2, f2 + fSin2, 0.0f);
                float f9 = (fCos * fCos2) - (fSin * fSin2);
                fSin2 = (fSin2 * fCos) + (fCos2 * fSin);
                this.renderer.color(floatBits);
                this.renderer.vertex(f + f9, f2 + fSin2, 0.0f);
                i2++;
                fCos2 = f9;
            }
            this.renderer.color(floatBits);
            this.renderer.vertex(f, f2, 0.0f);
            this.renderer.color(floatBits);
            this.renderer.vertex(fCos2 + f, fSin2 + f2, 0.0f);
        }
        this.renderer.color(floatBits);
        this.renderer.vertex(f + 0.0f, f2 + 0.0f, 0.0f);
    }

    public void circle(float f, float f2, float f3, int i) {
        if (i <= 0) {
            throw new IllegalArgumentException("segments must be > 0.");
        }
        float floatBits = this.color.toFloatBits();
        float f4 = 6.2831855f / i;
        float fCos = MathUtils.cos(f4);
        float fSin = MathUtils.sin(f4);
        ShapeType shapeType = this.shapeType;
        ShapeType shapeType2 = ShapeType.Line;
        int i2 = 0;
        if (shapeType == shapeType2) {
            check(shapeType2, ShapeType.Filled, (i * 2) + 2);
            float f5 = f3;
            float f6 = 0.0f;
            while (i2 < i) {
                this.renderer.color(floatBits);
                this.renderer.vertex(f + f5, f2 + f6, 0.0f);
                float f7 = (fCos * f5) - (fSin * f6);
                f6 = (f6 * fCos) + (f5 * fSin);
                this.renderer.color(floatBits);
                this.renderer.vertex(f + f7, f2 + f6, 0.0f);
                i2++;
                f5 = f7;
            }
            this.renderer.color(floatBits);
            this.renderer.vertex(f5 + f, f6 + f2, 0.0f);
        } else {
            check(shapeType2, ShapeType.Filled, (i * 3) + 3);
            int i3 = i - 1;
            float f8 = f3;
            float f9 = 0.0f;
            while (i2 < i3) {
                this.renderer.color(floatBits);
                this.renderer.vertex(f, f2, 0.0f);
                this.renderer.color(floatBits);
                this.renderer.vertex(f + f8, f2 + f9, 0.0f);
                float f10 = (fCos * f8) - (fSin * f9);
                f9 = (f9 * fCos) + (f8 * fSin);
                this.renderer.color(floatBits);
                this.renderer.vertex(f + f10, f2 + f9, 0.0f);
                i2++;
                f8 = f10;
            }
            this.renderer.color(floatBits);
            this.renderer.vertex(f, f2, 0.0f);
            this.renderer.color(floatBits);
            this.renderer.vertex(f8 + f, f9 + f2, 0.0f);
        }
        this.renderer.color(floatBits);
        this.renderer.vertex(f + f3, f2 + 0.0f, 0.0f);
    }

    public void cone(float f, float f2, float f3, float f4, float f5, int i) {
        float f6;
        float f7;
        if (i <= 0) {
            throw new IllegalArgumentException("segments must be > 0.");
        }
        ShapeType shapeType = ShapeType.Line;
        check(shapeType, ShapeType.Filled, (i * 4) + 2);
        float floatBits = this.color.toFloatBits();
        float f8 = 6.2831855f / i;
        float fCos = MathUtils.cos(f8);
        float fSin = MathUtils.sin(f8);
        int i2 = 0;
        if (this.shapeType == shapeType) {
            f6 = f4;
            f7 = 0.0f;
            while (i2 < i) {
                this.renderer.color(floatBits);
                float f9 = f + f6;
                float f10 = f2 + f7;
                this.renderer.vertex(f9, f10, f3);
                this.renderer.color(floatBits);
                this.renderer.vertex(f, f2, f3 + f5);
                this.renderer.color(floatBits);
                this.renderer.vertex(f9, f10, f3);
                float f11 = (fCos * f6) - (fSin * f7);
                f7 = (f7 * fCos) + (f6 * fSin);
                this.renderer.color(floatBits);
                this.renderer.vertex(f + f11, f2 + f7, f3);
                i2++;
                f6 = f11;
            }
            this.renderer.color(floatBits);
            this.renderer.vertex(f + f6, f2 + f7, f3);
        } else {
            int i3 = i - 1;
            f6 = f4;
            f7 = 0.0f;
            while (i2 < i3) {
                this.renderer.color(floatBits);
                this.renderer.vertex(f, f2, f3);
                this.renderer.color(floatBits);
                float f12 = f + f6;
                float f13 = f2 + f7;
                this.renderer.vertex(f12, f13, f3);
                float f14 = (fCos * f6) - (fSin * f7);
                f7 = (f7 * fCos) + (f6 * fSin);
                this.renderer.color(floatBits);
                float f15 = f + f14;
                float f16 = f2 + f7;
                this.renderer.vertex(f15, f16, f3);
                this.renderer.color(floatBits);
                this.renderer.vertex(f12, f13, f3);
                this.renderer.color(floatBits);
                this.renderer.vertex(f15, f16, f3);
                this.renderer.color(floatBits);
                this.renderer.vertex(f, f2, f3 + f5);
                i2++;
                f6 = f14;
            }
            this.renderer.color(floatBits);
            this.renderer.vertex(f, f2, f3);
            this.renderer.color(floatBits);
            this.renderer.vertex(f + f6, f2 + f7, f3);
        }
        this.renderer.color(floatBits);
        float f17 = f + f4;
        float f18 = 0.0f + f2;
        this.renderer.vertex(f17, f18, f3);
        if (this.shapeType != ShapeType.Line) {
            this.renderer.color(floatBits);
            this.renderer.vertex(f6 + f, f7 + f2, f3);
            this.renderer.color(floatBits);
            this.renderer.vertex(f17, f18, f3);
            this.renderer.color(floatBits);
            this.renderer.vertex(f, f2, f3 + f5);
        }
    }

    public void ellipse(float f, float f2, float f3, float f4, int i) {
        if (i <= 0) {
            throw new IllegalArgumentException("segments must be > 0.");
        }
        ShapeType shapeType = ShapeType.Line;
        check(shapeType, ShapeType.Filled, i * 3);
        float floatBits = this.color.toFloatBits();
        float f5 = 6.2831855f / i;
        float f6 = (f3 / 2.0f) + f;
        float f7 = (f4 / 2.0f) + f2;
        int i2 = 0;
        if (this.shapeType == shapeType) {
            while (i2 < i) {
                this.renderer.color(floatBits);
                float f8 = f3 * 0.5f;
                float f9 = i2 * f5;
                float f10 = f4 * 0.5f;
                this.renderer.vertex((MathUtils.cos(f9) * f8) + f6, (MathUtils.sin(f9) * f10) + f7, 0.0f);
                this.renderer.color(floatBits);
                i2++;
                float f11 = i2 * f5;
                this.renderer.vertex((MathUtils.cos(f11) * f8) + f6, (MathUtils.sin(f11) * f10) + f7, 0.0f);
            }
            return;
        }
        while (i2 < i) {
            this.renderer.color(floatBits);
            float f12 = f3 * 0.5f;
            float f13 = i2 * f5;
            float f14 = f4 * 0.5f;
            this.renderer.vertex((MathUtils.cos(f13) * f12) + f6, (MathUtils.sin(f13) * f14) + f7, 0.0f);
            this.renderer.color(floatBits);
            this.renderer.vertex(f6, f7, 0.0f);
            this.renderer.color(floatBits);
            i2++;
            float f15 = i2 * f5;
            this.renderer.vertex((MathUtils.cos(f15) * f12) + f6, (MathUtils.sin(f15) * f14) + f7, 0.0f);
        }
    }

    public final void line(Vector3 vector3, Vector3 vector4) {
        float f = vector3.x;
        float f2 = vector3.y;
        float f3 = vector3.z;
        float f4 = vector4.x;
        float f5 = vector4.y;
        float f6 = vector4.z;
        Color color = this.color;
        line(f, f2, f3, f4, f5, f6, color, color);
    }

    public void setColor(float f, float f2, float f3, float f4) {
        this.color.set(f, f2, f3, f4);
    }

    public ShapeRenderer(int i, ShaderProgram shaderProgram) {
        this.matrixDirty = false;
        Matrix4 matrix4 = new Matrix4();
        this.projectionMatrix = matrix4;
        this.transformMatrix = new Matrix4();
        this.combinedMatrix = new Matrix4();
        this.tmp = new Vector2();
        this.color = new Color(1.0f, 1.0f, 1.0f, 1.0f);
        this.defaultRectLineWidth = 0.75f;
        if (shaderProgram == null) {
            this.renderer = new ImmediateModeRenderer20(i, false, true, 0);
        } else {
            this.renderer = new ImmediateModeRenderer20(i, false, true, 0, shaderProgram);
        }
        matrix4.setToOrtho2D(0.0f, 0.0f, Gdx.graphics.getWidth(), Gdx.graphics.getHeight());
        this.matrixDirty = true;
    }

    public final void line(float f, float f2, float f3, float f4) {
        Color color = this.color;
        line(f, f2, 0.0f, f3, f4, 0.0f, color, color);
    }

    public void x(Vector2 vector2, float f) {
        x(vector2.x, vector2.y, f);
    }

    public void begin(ShapeType shapeType) {
        if (this.shapeType == null) {
            this.shapeType = shapeType;
            if (this.matrixDirty) {
                this.combinedMatrix.set(this.projectionMatrix);
                Matrix4.mul(this.combinedMatrix.val, this.transformMatrix.val);
                this.matrixDirty = false;
            }
            this.renderer.begin(this.combinedMatrix, this.shapeType.getGlType());
            return;
        }
        throw new IllegalStateException("Call end() before beginning a new shape batch.");
    }

    public final void line(Vector2 vector2, Vector2 vector3) {
        float f = vector2.x;
        float f2 = vector2.y;
        float f3 = vector3.x;
        float f4 = vector3.y;
        Color color = this.color;
        line(f, f2, 0.0f, f3, f4, 0.0f, color, color);
    }

    public final void line(float f, float f2, float f3, float f4, Color color, Color color2) {
        line(f, f2, 0.0f, f3, f4, 0.0f, color, color2);
    }

    public void line(float f, float f2, float f3, float f4, float f5, float f6, Color color, Color color2) {
        if (this.shapeType == ShapeType.Filled) {
            rectLine(f, f2, f4, f5, this.defaultRectLineWidth, color, color2);
            return;
        }
        check(ShapeType.Line, null, 2);
        this.renderer.color(color.r, color.g, color.b, color.f202a);
        this.renderer.vertex(f, f2, f3);
        this.renderer.color(color2.r, color2.g, color2.b, color2.f202a);
        this.renderer.vertex(f4, f5, f6);
    }

    public void polyline(float[] fArr) {
        polyline(fArr, 0, fArr.length);
    }

    public void polygon(float[] fArr) {
        polygon(fArr, 0, fArr.length);
    }

    public void ellipse(float f, float f2, float f3, float f4, float f5) {
        ellipse(f, f2, f3, f4, f5, Math.max(1, (int) (((float) Math.cbrt(Math.max(f3 * 0.5f, 0.5f * f4))) * 12.0f)));
    }

    public void ellipse(float f, float f2, float f3, float f4, float f5, int i) {
        if (i > 0) {
            ShapeType shapeType = ShapeType.Line;
            check(shapeType, ShapeType.Filled, i * 3);
            float floatBits = this.color.toFloatBits();
            float f6 = 6.2831855f / i;
            float f7 = (3.1415927f * f5) / 180.0f;
            float fSin = MathUtils.sin(f7);
            float fCos = MathUtils.cos(f7);
            float f8 = (f3 / 2.0f) + f;
            float f9 = (f4 / 2.0f) + f2;
            float f10 = 0.5f;
            float f11 = f3 * 0.5f;
            int i2 = 0;
            if (this.shapeType == shapeType) {
                float f12 = f11;
                float f13 = 0.0f;
                while (i2 < i) {
                    this.renderer.color(floatBits);
                    this.renderer.vertex(((fCos * f12) + f8) - (fSin * f13), (f13 * fCos) + (f12 * fSin) + f9, 0.0f);
                    i2++;
                    float f14 = i2 * f6;
                    float fCos2 = MathUtils.cos(f14) * f11;
                    float fSin2 = MathUtils.sin(f14) * f4 * f10;
                    this.renderer.color(floatBits);
                    this.renderer.vertex(((fCos * fCos2) + f8) - (fSin * fSin2), (fCos * fSin2) + (fSin * fCos2) + f9, 0.0f);
                    f10 = 0.5f;
                    f13 = fSin2;
                    f12 = fCos2;
                }
                return;
            }
            float f15 = f11;
            float f16 = 0.0f;
            while (i2 < i) {
                this.renderer.color(floatBits);
                this.renderer.vertex(((fCos * f15) + f8) - (fSin * f16), (f16 * fCos) + (f15 * fSin) + f9, 0.0f);
                this.renderer.color(floatBits);
                this.renderer.vertex(f8, f9, 0.0f);
                i2++;
                float f17 = i2 * f6;
                float fCos3 = MathUtils.cos(f17) * f11;
                float fSin3 = MathUtils.sin(f17) * f4 * 0.5f;
                this.renderer.color(floatBits);
                this.renderer.vertex(((fCos * fCos3) + f8) - (fSin * fSin3), (fCos * fSin3) + (fSin * fCos3) + f9, 0.0f);
                f16 = fSin3;
                f15 = fCos3;
            }
            return;
        }
        throw new IllegalArgumentException("segments must be > 0.");
    }

    public void triangle(float f, float f2, float f3, float f4, float f5, float f6, Color color, Color color2, Color color3) {
        ShapeType shapeType = ShapeType.Line;
        check(shapeType, ShapeType.Filled, 6);
        if (this.shapeType == shapeType) {
            this.renderer.color(color.r, color.g, color.b, color.f202a);
            this.renderer.vertex(f, f2, 0.0f);
            this.renderer.color(color2.r, color2.g, color2.b, color2.f202a);
            this.renderer.vertex(f3, f4, 0.0f);
            this.renderer.color(color2.r, color2.g, color2.b, color2.f202a);
            this.renderer.vertex(f3, f4, 0.0f);
            this.renderer.color(color3.r, color3.g, color3.b, color3.f202a);
            this.renderer.vertex(f5, f6, 0.0f);
            this.renderer.color(color3.r, color3.g, color3.b, color3.f202a);
            this.renderer.vertex(f5, f6, 0.0f);
            this.renderer.color(color.r, color.g, color.b, color.f202a);
            this.renderer.vertex(f, f2, 0.0f);
            return;
        }
        this.renderer.color(color.r, color.g, color.b, color.f202a);
        this.renderer.vertex(f, f2, 0.0f);
        this.renderer.color(color2.r, color2.g, color2.b, color2.f202a);
        this.renderer.vertex(f3, f4, 0.0f);
        this.renderer.color(color3.r, color3.g, color3.b, color3.f202a);
        this.renderer.vertex(f5, f6, 0.0f);
    }

    public void rect(float f, float f2, float f3, float f4, Color color, Color color2, Color color3, Color color4) {
        ShapeType shapeType = ShapeType.Line;
        check(shapeType, ShapeType.Filled, 8);
        if (this.shapeType == shapeType) {
            this.renderer.color(color.r, color.g, color.b, color.f202a);
            this.renderer.vertex(f, f2, 0.0f);
            this.renderer.color(color2.r, color2.g, color2.b, color2.f202a);
            float f5 = f3 + f;
            this.renderer.vertex(f5, f2, 0.0f);
            this.renderer.color(color2.r, color2.g, color2.b, color2.f202a);
            this.renderer.vertex(f5, f2, 0.0f);
            this.renderer.color(color3.r, color3.g, color3.b, color3.f202a);
            float f6 = f4 + f2;
            this.renderer.vertex(f5, f6, 0.0f);
            this.renderer.color(color3.r, color3.g, color3.b, color3.f202a);
            this.renderer.vertex(f5, f6, 0.0f);
            this.renderer.color(color4.r, color4.g, color4.b, color4.f202a);
            this.renderer.vertex(f, f6, 0.0f);
            this.renderer.color(color4.r, color4.g, color4.b, color4.f202a);
            this.renderer.vertex(f, f6, 0.0f);
            this.renderer.color(color.r, color.g, color.b, color.f202a);
            this.renderer.vertex(f, f2, 0.0f);
            return;
        }
        this.renderer.color(color.r, color.g, color.b, color.f202a);
        this.renderer.vertex(f, f2, 0.0f);
        this.renderer.color(color2.r, color2.g, color2.b, color2.f202a);
        float f7 = f3 + f;
        this.renderer.vertex(f7, f2, 0.0f);
        this.renderer.color(color3.r, color3.g, color3.b, color3.f202a);
        float f8 = f4 + f2;
        this.renderer.vertex(f7, f8, 0.0f);
        this.renderer.color(color3.r, color3.g, color3.b, color3.f202a);
        this.renderer.vertex(f7, f8, 0.0f);
        this.renderer.color(color4.r, color4.g, color4.b, color4.f202a);
        this.renderer.vertex(f, f8, 0.0f);
        this.renderer.color(color.r, color.g, color.b, color.f202a);
        this.renderer.vertex(f, f2, 0.0f);
    }

    public void rectLine(float f, float f2, float f3, float f4, float f5, Color color, Color color2) {
        ShapeType shapeType = ShapeType.Line;
        check(shapeType, ShapeType.Filled, 8);
        float floatBits = color.toFloatBits();
        float floatBits2 = color2.toFloatBits();
        Vector2 vector2Nor = this.tmp.set(f4 - f2, f - f3).nor();
        float f6 = f5 * 0.5f;
        float f7 = vector2Nor.x * f6;
        float f8 = vector2Nor.y * f6;
        if (this.shapeType == shapeType) {
            this.renderer.color(floatBits);
            float f9 = f + f7;
            float f10 = f2 + f8;
            this.renderer.vertex(f9, f10, 0.0f);
            this.renderer.color(floatBits);
            float f11 = f - f7;
            float f12 = f2 - f8;
            this.renderer.vertex(f11, f12, 0.0f);
            this.renderer.color(floatBits2);
            float f13 = f3 + f7;
            float f14 = f4 + f8;
            this.renderer.vertex(f13, f14, 0.0f);
            this.renderer.color(floatBits2);
            float f15 = f3 - f7;
            float f16 = f4 - f8;
            this.renderer.vertex(f15, f16, 0.0f);
            this.renderer.color(floatBits2);
            this.renderer.vertex(f13, f14, 0.0f);
            this.renderer.color(floatBits);
            this.renderer.vertex(f9, f10, 0.0f);
            this.renderer.color(floatBits2);
            this.renderer.vertex(f15, f16, 0.0f);
            this.renderer.color(floatBits);
            this.renderer.vertex(f11, f12, 0.0f);
            return;
        }
        this.renderer.color(floatBits);
        this.renderer.vertex(f + f7, f2 + f8, 0.0f);
        this.renderer.color(floatBits);
        float f17 = f - f7;
        float f18 = f2 - f8;
        this.renderer.vertex(f17, f18, 0.0f);
        this.renderer.color(floatBits2);
        float f19 = f3 + f7;
        float f20 = f4 + f8;
        this.renderer.vertex(f19, f20, 0.0f);
        this.renderer.color(floatBits2);
        this.renderer.vertex(f3 - f7, f4 - f8, 0.0f);
        this.renderer.color(floatBits2);
        this.renderer.vertex(f19, f20, 0.0f);
        this.renderer.color(floatBits);
        this.renderer.vertex(f17, f18, 0.0f);
    }

    public void rect(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9) {
        Color color = this.color;
        rect(f, f2, f3, f4, f5, f6, f7, f8, f9, color, color, color, color);
    }

    public void rect(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, Color color, Color color2, Color color3, Color color4) {
        ShapeType shapeType = ShapeType.Line;
        check(shapeType, ShapeType.Filled, 8);
        float fCosDeg = MathUtils.cosDeg(f9);
        float fSinDeg = MathUtils.sinDeg(f9);
        float f10 = -f3;
        float f11 = -f4;
        float f12 = f5 - f3;
        float f13 = f6 - f4;
        if (f7 != 1.0f || f8 != 1.0f) {
            f10 *= f7;
            f11 *= f8;
            f12 *= f7;
            f13 *= f8;
        }
        float f14 = f + f3;
        float f15 = f2 + f4;
        float f16 = fSinDeg * f11;
        float f17 = ((fCosDeg * f10) - f16) + f14;
        float f18 = f11 * fCosDeg;
        float f19 = (f10 * fSinDeg) + f18 + f15;
        float f20 = fCosDeg * f12;
        float f21 = (f20 - f16) + f14;
        float f22 = f12 * fSinDeg;
        float f23 = f18 + f22 + f15;
        float f24 = (f20 - (fSinDeg * f13)) + f14;
        float fD = AbstractC5044xl.d(fCosDeg, f13, f22, f15);
        float f25 = (f24 - f21) + f17;
        float f26 = fD - (f23 - f19);
        if (this.shapeType == shapeType) {
            this.renderer.color(color.r, color.g, color.b, color.f202a);
            this.renderer.vertex(f17, f19, 0.0f);
            this.renderer.color(color2.r, color2.g, color2.b, color2.f202a);
            this.renderer.vertex(f21, f23, 0.0f);
            this.renderer.color(color2.r, color2.g, color2.b, color2.f202a);
            this.renderer.vertex(f21, f23, 0.0f);
            this.renderer.color(color3.r, color3.g, color3.b, color3.f202a);
            this.renderer.vertex(f24, fD, 0.0f);
            this.renderer.color(color3.r, color3.g, color3.b, color3.f202a);
            this.renderer.vertex(f24, fD, 0.0f);
            this.renderer.color(color4.r, color4.g, color4.b, color4.f202a);
            this.renderer.vertex(f25, f26, 0.0f);
            this.renderer.color(color4.r, color4.g, color4.b, color4.f202a);
            this.renderer.vertex(f25, f26, 0.0f);
            this.renderer.color(color.r, color.g, color.b, color.f202a);
            this.renderer.vertex(f17, f19, 0.0f);
            return;
        }
        this.renderer.color(color.r, color.g, color.b, color.f202a);
        this.renderer.vertex(f17, f19, 0.0f);
        this.renderer.color(color2.r, color2.g, color2.b, color2.f202a);
        this.renderer.vertex(f21, f23, 0.0f);
        this.renderer.color(color3.r, color3.g, color3.b, color3.f202a);
        this.renderer.vertex(f24, fD, 0.0f);
        this.renderer.color(color3.r, color3.g, color3.b, color3.f202a);
        this.renderer.vertex(f24, fD, 0.0f);
        this.renderer.color(color4.r, color4.g, color4.b, color4.f202a);
        this.renderer.vertex(f25, f26, 0.0f);
        this.renderer.color(color.r, color.g, color.b, color.f202a);
        this.renderer.vertex(f17, f19, 0.0f);
    }

    public void rectLine(Vector2 vector2, Vector2 vector3, float f) {
        rectLine(vector2.x, vector2.y, vector3.x, vector3.y, f);
    }
}
