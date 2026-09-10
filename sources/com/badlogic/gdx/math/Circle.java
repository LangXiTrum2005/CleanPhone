package com.badlogic.gdx.math;

import com.badlogic.gdx.utils.NumberUtils;
import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public class Circle implements Serializable, Shape2D {
    public float radius;
    public float x;
    public float y;

    public Circle() {
    }

    public float area() {
        float f = this.radius;
        return f * f * 3.1415927f;
    }

    public float circumference() {
        return this.radius * 6.2831855f;
    }

    @Override // com.badlogic.gdx.math.Shape2D
    public boolean contains(float f, float f2) {
        float f3 = this.x - f;
        float f4 = this.y - f2;
        float f5 = (f4 * f4) + (f3 * f3);
        float f6 = this.radius;
        return f5 <= f6 * f6;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != getClass()) {
            return false;
        }
        Circle circle = (Circle) obj;
        return this.x == circle.x && this.y == circle.y && this.radius == circle.radius;
    }

    public int hashCode() {
        return NumberUtils.floatToRawIntBits(this.y) + ((NumberUtils.floatToRawIntBits(this.x) + ((NumberUtils.floatToRawIntBits(this.radius) + 41) * 41)) * 41);
    }

    public boolean overlaps(Circle circle) {
        float f = this.x - circle.x;
        float f2 = this.y - circle.y;
        float f3 = (f2 * f2) + (f * f);
        float f4 = this.radius + circle.radius;
        return f3 < f4 * f4;
    }

    public void set(float f, float f2, float f3) {
        this.x = f;
        this.y = f2;
        this.radius = f3;
    }

    public void setPosition(Vector2 vector2) {
        this.x = vector2.x;
        this.y = vector2.y;
    }

    public void setRadius(float f) {
        this.radius = f;
    }

    public void setX(float f) {
        this.x = f;
    }

    public void setY(float f) {
        this.y = f;
    }

    public String toString() {
        return this.x + "," + this.y + "," + this.radius;
    }

    public Circle(float f, float f2, float f3) {
        this.x = f;
        this.y = f2;
        this.radius = f3;
    }

    public void setPosition(float f, float f2) {
        this.x = f;
        this.y = f2;
    }

    @Override // com.badlogic.gdx.math.Shape2D
    public boolean contains(Vector2 vector2) {
        float f = this.x - vector2.x;
        float f2 = this.y - vector2.y;
        float f3 = (f2 * f2) + (f * f);
        float f4 = this.radius;
        return f3 <= f4 * f4;
    }

    public void set(Vector2 vector2, float f) {
        this.x = vector2.x;
        this.y = vector2.y;
        this.radius = f;
    }

    public Circle(Vector2 vector2, float f) {
        this.x = vector2.x;
        this.y = vector2.y;
        this.radius = f;
    }

    public boolean contains(Circle circle) {
        float f = this.radius;
        float f2 = circle.radius;
        float f3 = f - f2;
        if (f3 < 0.0f) {
            return false;
        }
        float f4 = this.x - circle.x;
        float f5 = this.y - circle.y;
        float f6 = (f5 * f5) + (f4 * f4);
        float f7 = f + f2;
        return f3 * f3 >= f6 && f6 < f7 * f7;
    }

    public void set(Circle circle) {
        this.x = circle.x;
        this.y = circle.y;
        this.radius = circle.radius;
    }

    public Circle(Circle circle) {
        this.x = circle.x;
        this.y = circle.y;
        this.radius = circle.radius;
    }

    public void set(Vector2 vector2, Vector2 vector3) {
        float f = vector2.x;
        this.x = f;
        float f2 = vector2.y;
        this.y = f2;
        this.radius = Vector2.len(f - vector3.x, f2 - vector3.y);
    }

    public Circle(Vector2 vector2, Vector2 vector3) {
        float f = vector2.x;
        this.x = f;
        float f2 = vector2.y;
        this.y = f2;
        this.radius = Vector2.len(f - vector3.x, f2 - vector3.y);
    }
}
