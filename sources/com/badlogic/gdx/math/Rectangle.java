package com.badlogic.gdx.math;

import com.badlogic.gdx.utils.GdxRuntimeException;
import com.badlogic.gdx.utils.NumberUtils;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.DM;
import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public class Rectangle implements Serializable, Shape2D {
    private static final long serialVersionUID = 5733252015138115702L;
    public static final Rectangle tmp = new Rectangle();
    public static final Rectangle tmp2 = new Rectangle();
    public float height;
    public float width;
    public float x;
    public float y;

    public Rectangle() {
    }

    public float area() {
        return this.width * this.height;
    }

    @Override // com.badlogic.gdx.math.Shape2D
    public boolean contains(float f, float f2) {
        float f3 = this.x;
        if (f3 <= f && f3 + this.width >= f) {
            float f4 = this.y;
            if (f4 <= f2 && f4 + this.height >= f2) {
                return true;
            }
        }
        return false;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Rectangle rectangle = (Rectangle) obj;
        return NumberUtils.floatToRawIntBits(this.height) == NumberUtils.floatToRawIntBits(rectangle.height) && NumberUtils.floatToRawIntBits(this.width) == NumberUtils.floatToRawIntBits(rectangle.width) && NumberUtils.floatToRawIntBits(this.x) == NumberUtils.floatToRawIntBits(rectangle.x) && NumberUtils.floatToRawIntBits(this.y) == NumberUtils.floatToRawIntBits(rectangle.y);
    }

    public Rectangle fitInside(Rectangle rectangle) {
        float aspectRatio = getAspectRatio();
        if (aspectRatio < rectangle.getAspectRatio()) {
            float f = rectangle.height;
            setSize(aspectRatio * f, f);
        } else {
            float f2 = rectangle.width;
            setSize(f2, f2 / aspectRatio);
        }
        setPosition(((rectangle.width / 2.0f) + rectangle.x) - (this.width / 2.0f), ((rectangle.height / 2.0f) + rectangle.y) - (this.height / 2.0f));
        return this;
    }

    public Rectangle fitOutside(Rectangle rectangle) {
        float aspectRatio = getAspectRatio();
        if (aspectRatio > rectangle.getAspectRatio()) {
            float f = rectangle.height;
            setSize(aspectRatio * f, f);
        } else {
            float f2 = rectangle.width;
            setSize(f2, f2 / aspectRatio);
        }
        setPosition(((rectangle.width / 2.0f) + rectangle.x) - (this.width / 2.0f), ((rectangle.height / 2.0f) + rectangle.y) - (this.height / 2.0f));
        return this;
    }

    public Rectangle fromString(String str) {
        int iIndexOf = str.indexOf(44, 1);
        int i = iIndexOf + 1;
        int iIndexOf2 = str.indexOf(44, i);
        int i2 = iIndexOf2 + 1;
        int iIndexOf3 = str.indexOf(44, i2);
        if (iIndexOf != -1 && iIndexOf2 != -1 && iIndexOf3 != -1 && str.charAt(0) == '[' && str.charAt(str.length() - 1) == ']') {
            try {
                return set(Float.parseFloat(str.substring(1, iIndexOf)), Float.parseFloat(str.substring(i, iIndexOf2)), Float.parseFloat(str.substring(i2, iIndexOf3)), Float.parseFloat(str.substring(iIndexOf3 + 1, str.length() - 1)));
            } catch (NumberFormatException unused) {
            }
        }
        throw new GdxRuntimeException("Malformed Rectangle: ".concat(str));
    }

    public float getAspectRatio() {
        float f = this.height;
        if (f == 0.0f) {
            return Float.NaN;
        }
        return this.width / f;
    }

    public Vector2 getCenter(Vector2 vector2) {
        vector2.x = (this.width / 2.0f) + this.x;
        vector2.y = (this.height / 2.0f) + this.y;
        return vector2;
    }

    public float getHeight() {
        return this.height;
    }

    public Vector2 getPosition(Vector2 vector2) {
        return vector2.set(this.x, this.y);
    }

    public Vector2 getSize(Vector2 vector2) {
        return vector2.set(this.width, this.height);
    }

    public float getWidth() {
        return this.width;
    }

    public float getX() {
        return this.x;
    }

    public float getY() {
        return this.y;
    }

    public int hashCode() {
        return NumberUtils.floatToRawIntBits(this.y) + ((NumberUtils.floatToRawIntBits(this.x) + ((NumberUtils.floatToRawIntBits(this.width) + ((NumberUtils.floatToRawIntBits(this.height) + 31) * 31)) * 31)) * 31);
    }

    public Rectangle merge(Rectangle rectangle) {
        float fMin = Math.min(this.x, rectangle.x);
        float fMax = Math.max(this.x + this.width, rectangle.x + rectangle.width);
        this.x = fMin;
        this.width = fMax - fMin;
        float fMin2 = Math.min(this.y, rectangle.y);
        float fMax2 = Math.max(this.y + this.height, rectangle.y + rectangle.height);
        this.y = fMin2;
        this.height = fMax2 - fMin2;
        return this;
    }

    public boolean overlaps(Rectangle rectangle) {
        float f = this.x;
        float f2 = rectangle.x;
        if (f < rectangle.width + f2 && f + this.width > f2) {
            float f3 = this.y;
            float f4 = rectangle.y;
            if (f3 < rectangle.height + f4 && f3 + this.height > f4) {
                return true;
            }
        }
        return false;
    }

    public float perimeter() {
        return (this.width + this.height) * 2.0f;
    }

    public Rectangle set(float f, float f2, float f3, float f4) {
        this.x = f;
        this.y = f2;
        this.width = f3;
        this.height = f4;
        return this;
    }

    public Rectangle setCenter(float f, float f2) {
        setPosition(f - (this.width / 2.0f), f2 - (this.height / 2.0f));
        return this;
    }

    public Rectangle setHeight(float f) {
        this.height = f;
        return this;
    }

    public Rectangle setPosition(Vector2 vector2) {
        this.x = vector2.x;
        this.y = vector2.y;
        return this;
    }

    public Rectangle setSize(float f, float f2) {
        this.width = f;
        this.height = f2;
        return this;
    }

    public Rectangle setWidth(float f) {
        this.width = f;
        return this;
    }

    public Rectangle setX(float f) {
        this.x = f;
        return this;
    }

    public Rectangle setY(float f) {
        this.y = f;
        return this;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        sb.append(this.x);
        sb.append(",");
        sb.append(this.y);
        sb.append(",");
        sb.append(this.width);
        sb.append(",");
        return DM.j(sb, this.height, "]");
    }

    public Rectangle(float f, float f2, float f3, float f4) {
        this.x = f;
        this.y = f2;
        this.width = f3;
        this.height = f4;
    }

    @Override // com.badlogic.gdx.math.Shape2D
    public boolean contains(Vector2 vector2) {
        return contains(vector2.x, vector2.y);
    }

    public Rectangle setCenter(Vector2 vector2) {
        setPosition(vector2.x - (this.width / 2.0f), vector2.y - (this.height / 2.0f));
        return this;
    }

    public boolean contains(Circle circle) {
        float f = circle.x;
        float f2 = circle.radius;
        float f3 = f - f2;
        float f4 = this.x;
        if (f3 >= f4 && f + f2 <= f4 + this.width) {
            float f5 = circle.y;
            float f6 = f5 - f2;
            float f7 = this.y;
            if (f6 >= f7 && f5 + f2 <= f7 + this.height) {
                return true;
            }
        }
        return false;
    }

    public Rectangle setPosition(float f, float f2) {
        this.x = f;
        this.y = f2;
        return this;
    }

    public Rectangle setSize(float f) {
        this.width = f;
        this.height = f;
        return this;
    }

    public boolean contains(Rectangle rectangle) {
        float f = rectangle.x;
        float f2 = rectangle.width + f;
        float f3 = rectangle.y;
        float f4 = rectangle.height + f3;
        float f5 = this.x;
        if (f > f5) {
            float f6 = this.width;
            if (f < f5 + f6 && f2 > f5 && f2 < f5 + f6) {
                float f7 = this.y;
                if (f3 > f7) {
                    float f8 = this.height;
                    if (f3 < f7 + f8 && f4 > f7 && f4 < f7 + f8) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public Rectangle set(Rectangle rectangle) {
        this.x = rectangle.x;
        this.y = rectangle.y;
        this.width = rectangle.width;
        this.height = rectangle.height;
        return this;
    }

    public Rectangle(Rectangle rectangle) {
        this.x = rectangle.x;
        this.y = rectangle.y;
        this.width = rectangle.width;
        this.height = rectangle.height;
    }

    public Rectangle merge(float f, float f2) {
        float fMin = Math.min(this.x, f);
        float fMax = Math.max(this.x + this.width, f);
        this.x = fMin;
        this.width = fMax - fMin;
        float fMin2 = Math.min(this.y, f2);
        float fMax2 = Math.max(this.y + this.height, f2);
        this.y = fMin2;
        this.height = fMax2 - fMin2;
        return this;
    }

    public Rectangle merge(Vector2 vector2) {
        return merge(vector2.x, vector2.y);
    }

    public Rectangle merge(Vector2[] vector2Arr) {
        float fMin = this.x;
        float fMax = this.width + fMin;
        float fMin2 = this.y;
        float fMax2 = this.height + fMin2;
        for (Vector2 vector2 : vector2Arr) {
            fMin = Math.min(fMin, vector2.x);
            fMax = Math.max(fMax, vector2.x);
            fMin2 = Math.min(fMin2, vector2.y);
            fMax2 = Math.max(fMax2, vector2.y);
        }
        this.x = fMin;
        this.width = fMax - fMin;
        this.y = fMin2;
        this.height = fMax2 - fMin2;
        return this;
    }
}
