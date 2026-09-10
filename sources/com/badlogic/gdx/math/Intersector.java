package com.badlogic.gdx.math;

import com.badlogic.gdx.math.collision.BoundingBox;
import com.badlogic.gdx.math.collision.OrientedBoundingBox;
import com.badlogic.gdx.math.collision.Ray;
import com.badlogic.gdx.utils.Array;
import com.badlogic.gdx.utils.FloatArray;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3950lJ;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC5044xl;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class Intersector {
    private static final Vector3 v0 = new Vector3();
    private static final Vector3 v1 = new Vector3();
    private static final Vector3 v2 = new Vector3();
    private static final FloatArray floatArray = new FloatArray();
    private static final FloatArray floatArray2 = new FloatArray();
    private static final Vector2 ip = new Vector2();
    private static final Vector2 ep1 = new Vector2();
    private static final Vector2 ep2 = new Vector2();
    private static final Vector2 s = new Vector2();
    private static final Vector2 e = new Vector2();
    static Vector2 v2a = new Vector2();
    static Vector2 v2b = new Vector2();
    static Vector2 v2c = new Vector2();
    static Vector2 v2d = new Vector2();
    private static final Plane p = new Plane(new Vector3(), 0.0f);
    private static final Vector3 i = new Vector3();
    private static final Vector3 dir = new Vector3();
    private static final Vector3 start = new Vector3();
    static Vector3 best = new Vector3();
    static Vector3 tmp = new Vector3();
    static Vector3 tmp1 = new Vector3();
    static Vector3 tmp2 = new Vector3();
    static Vector3 tmp3 = new Vector3();
    static Vector3 intersection = new Vector3();

    public static class MinimumTranslationVector {
        public Vector2 normal = new Vector2();
        public float depth = 0.0f;
    }

    public static class SplitTriangle {
        public float[] back;
        float[] edgeSplit;
        public float[] front;
        public int numBack;
        public int numFront;
        public int total;
        boolean frontCurrent = false;
        int frontOffset = 0;
        int backOffset = 0;

        public SplitTriangle(int i) {
            int i2 = i * 6;
            this.front = new float[i2];
            this.back = new float[i2];
            this.edgeSplit = new float[i];
        }

        public void add(float[] fArr, int i, int i2) {
            if (this.frontCurrent) {
                System.arraycopy(fArr, i, this.front, this.frontOffset, i2);
                this.frontOffset += i2;
            } else {
                System.arraycopy(fArr, i, this.back, this.backOffset, i2);
                this.backOffset += i2;
            }
        }

        public boolean getSide() {
            return this.frontCurrent;
        }

        public void reset() {
            this.frontCurrent = false;
            this.frontOffset = 0;
            this.backOffset = 0;
            this.numFront = 0;
            this.numBack = 0;
            this.total = 0;
        }

        public void setSide(boolean z) {
            this.frontCurrent = z;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("SplitTriangle [front=");
            sb.append(Arrays.toString(this.front));
            sb.append(", back=");
            sb.append(Arrays.toString(this.back));
            sb.append(", numFront=");
            sb.append(this.numFront);
            sb.append(", numBack=");
            sb.append(this.numBack);
            sb.append(", total=");
            return AbstractC5044xl.o(sb, this.total, "]");
        }
    }

    private Intersector() {
    }

    public static float det(float f, float f2, float f3, float f4) {
        return (f * f4) - (f2 * f3);
    }

    public static double detd(double d, double d2, double d3, double d4) {
        return (d * d4) - (d2 * d3);
    }

    public static float distanceLinePoint(float f, float f2, float f3, float f4, float f5, float f6) {
        float f7 = f3 - f;
        float f8 = f4 - f2;
        return Math.abs(((f5 - f) * f8) - ((f6 - f2) * f7)) / Vector2.len(f7, f8);
    }

    public static float distanceSegmentPoint(float f, float f2, float f3, float f4, float f5, float f6) {
        return nearestSegmentPoint(f, f2, f3, f4, f5, f6, v2a).dst(f5, f6);
    }

    public static boolean hasOverlap(Vector3[] vector3Arr, Vector3[] vector3Arr2, Vector3[] vector3Arr3) {
        for (Vector3 vector3 : vector3Arr) {
            float fMax = -3.4028235E38f;
            float fMin = Float.MAX_VALUE;
            float fMin2 = Float.MAX_VALUE;
            float fMax2 = -3.4028235E38f;
            for (Vector3 vector4 : vector3Arr2) {
                float fDot = vector4.dot(vector3);
                fMin2 = Math.min(fMin2, fDot);
                fMax2 = Math.max(fMax2, fDot);
            }
            for (Vector3 vector5 : vector3Arr3) {
                float fDot2 = vector5.dot(vector3);
                fMin = Math.min(fMin, fDot2);
                fMax = Math.max(fMax, fDot2);
            }
            if (fMax2 < fMin || fMax < fMin2) {
                return false;
            }
        }
        return true;
    }

    public static boolean intersectBoundsPlaneFast(BoundingBox boundingBox, Plane plane) {
        return intersectBoundsPlaneFast(boundingBox.getCenter(tmp1), boundingBox.getDimensions(tmp2).scl(0.5f), plane.normal, plane.d);
    }

    public static boolean intersectFrustumBounds(Frustum frustum, BoundingBox boundingBox) {
        if (frustum.pointInFrustum(boundingBox.getCorner000(tmp)) || frustum.pointInFrustum(boundingBox.getCorner001(tmp)) || frustum.pointInFrustum(boundingBox.getCorner010(tmp)) || frustum.pointInFrustum(boundingBox.getCorner011(tmp)) || frustum.pointInFrustum(boundingBox.getCorner100(tmp)) || frustum.pointInFrustum(boundingBox.getCorner101(tmp)) || frustum.pointInFrustum(boundingBox.getCorner110(tmp)) || frustum.pointInFrustum(boundingBox.getCorner111(tmp))) {
            return true;
        }
        boolean zContains = false;
        for (Vector3 vector3 : frustum.planePoints) {
            zContains |= boundingBox.contains(vector3);
        }
        return zContains;
    }

    public static float intersectLinePlane(float f, float f2, float f3, float f4, float f5, float f6, Plane plane, Vector3 vector3) {
        Vector3 vector3Sub = tmp.set(f4, f5, f6).sub(f, f2, f3);
        Vector3 vector4 = tmp2.set(f, f2, f3);
        float fDot = vector3Sub.dot(plane.getNormal());
        if (fDot != 0.0f) {
            float f7 = (-(plane.getD() + vector4.dot(plane.getNormal()))) / fDot;
            if (vector3 != null) {
                vector3.set(vector4).add(vector3Sub.scl(f7));
            }
            return f7;
        }
        if (plane.testPoint(vector4) != Plane.PlaneSide.OnPlane) {
            return -1.0f;
        }
        if (vector3 != null) {
            vector3.set(vector4);
        }
        return 0.0f;
    }

    public static boolean intersectLinePolygon(Vector2 vector2, Vector2 vector3, Polygon polygon) {
        float[] transformedVertices = polygon.getTransformedVertices();
        float f = vector2.x;
        float f2 = vector2.y;
        float f3 = vector3.x;
        float f4 = vector3.y;
        int length = transformedVertices.length;
        float f5 = transformedVertices[length - 2];
        float f6 = transformedVertices[length - 1];
        int i2 = 0;
        while (i2 < length) {
            float f7 = transformedVertices[i2];
            float f8 = transformedVertices[i2 + 1];
            float f9 = f8 - f6;
            float f10 = f7 - f5;
            float f11 = ((f3 - f) * f9) - ((f4 - f2) * f10);
            if (f11 != 0.0f) {
                float fG = AbstractC3950lJ.g(f9, f - f5, f10 * (f2 - f6), f11);
                if (fG >= 0.0f && fG <= 1.0f) {
                    return true;
                }
            }
            i2 += 2;
            f5 = f7;
            f6 = f8;
        }
        return false;
    }

    public static boolean intersectLines(Vector2 vector2, Vector2 vector3, Vector2 vector4, Vector2 vector5, Vector2 vector6) {
        return intersectLines(vector2.x, vector2.y, vector3.x, vector3.y, vector4.x, vector4.y, vector5.x, vector5.y, vector6);
    }

    public static boolean intersectPlanes(Plane plane, Plane plane2, Plane plane3, Vector3 vector3) {
        tmp1.set(plane.normal).crs(plane2.normal);
        tmp2.set(plane2.normal).crs(plane3.normal);
        tmp3.set(plane3.normal).crs(plane.normal);
        float f = -plane.normal.dot(tmp2);
        if (Math.abs(f) < 1.0E-6f) {
            return false;
        }
        tmp1.scl(plane3.d);
        tmp2.scl(plane.d);
        tmp3.scl(plane2.d);
        Vector3 vector4 = tmp1;
        float f2 = vector4.x;
        Vector3 vector5 = tmp2;
        float f3 = f2 + vector5.x;
        Vector3 vector6 = tmp3;
        vector3.set(f3 + vector6.x, vector4.y + vector5.y + vector6.y, vector4.z + vector5.z + vector6.z);
        vector3.scl(1.0f / f);
        return true;
    }

    public static boolean intersectPolygonEdges(FloatArray floatArray3, FloatArray floatArray4) {
        int i2 = floatArray3.size;
        int i3 = i2 - 2;
        int i4 = floatArray4.size;
        int i5 = i4 - 2;
        float[] fArr = floatArray3.items;
        float[] fArr2 = floatArray4.items;
        float f = fArr[i3];
        float f2 = fArr[i2 - 1];
        int i6 = 0;
        while (i6 <= i3) {
            float f3 = fArr[i6];
            float f4 = fArr[i6 + 1];
            float f5 = fArr2[i5];
            float f6 = fArr2[i4 - 1];
            int i7 = 0;
            while (i7 <= i5) {
                float f7 = fArr2[i7];
                float f8 = fArr2[i7 + 1];
                int i8 = i7;
                int i9 = i6;
                if (intersectSegments(f, f2, f3, f4, f5, f6, f7, f8, null)) {
                    return true;
                }
                i7 = i8 + 2;
                f5 = f7;
                f6 = f8;
                i6 = i9;
            }
            i6 += 2;
            f = f3;
            f2 = f4;
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v5 */
    public static boolean intersectPolygons(Polygon polygon, Polygon polygon2, Polygon polygon3) {
        ?? r2 = 0;
        if (polygon.getVertices().length == 0 || polygon2.getVertices().length == 0) {
            return false;
        }
        Vector2 vector2 = ip;
        Vector2 vector3 = ep1;
        Vector2 vector4 = ep2;
        Vector2 vector5 = s;
        Vector2 vector6 = e;
        FloatArray floatArray3 = floatArray;
        FloatArray floatArray4 = floatArray2;
        floatArray3.clear();
        floatArray4.clear();
        floatArray4.addAll(polygon.getTransformedVertices());
        float[] transformedVertices = polygon2.getTransformedVertices();
        int length = transformedVertices.length - 2;
        int i2 = 0;
        while (i2 <= length) {
            vector3.set(transformedVertices[i2], transformedVertices[i2 + 1]);
            if (i2 < length) {
                vector4.set(transformedVertices[i2 + 2], transformedVertices[i2 + 3]);
            } else {
                vector4.set(transformedVertices[r2], transformedVertices[1]);
            }
            int i3 = floatArray4.size;
            if (i3 == 0) {
                return r2;
            }
            vector5.set(floatArray4.get(i3 - 2), floatArray4.get(floatArray4.size - 1));
            for (int i4 = 0; i4 < floatArray4.size; i4 += 2) {
                vector6.set(floatArray4.get(i4), floatArray4.get(i4 + 1));
                boolean z = pointLineSide(vector4, vector3, vector5) > 0;
                if (pointLineSide(vector4, vector3, vector6) > 0) {
                    if (!z) {
                        intersectLines(vector5, vector6, vector3, vector4, vector2);
                        int i5 = floatArray3.size;
                        if (i5 < 2 || floatArray3.get(i5 - 2) != vector2.x || floatArray3.get(floatArray3.size - 1) != vector2.y) {
                            floatArray3.add(vector2.x);
                            floatArray3.add(vector2.y);
                        }
                    }
                    floatArray3.add(vector6.x);
                    floatArray3.add(vector6.y);
                } else if (z) {
                    intersectLines(vector5, vector6, vector3, vector4, vector2);
                    floatArray3.add(vector2.x);
                    floatArray3.add(vector2.y);
                }
                vector5.set(vector6.x, vector6.y);
            }
            floatArray4.clear();
            floatArray4.addAll(floatArray3);
            floatArray3.clear();
            i2 += 2;
            r2 = 0;
        }
        if (floatArray4.size >= 6 && floatArray4.get(0) == floatArray4.get(floatArray4.size - 2) && floatArray4.get(1) == floatArray4.get(floatArray4.size - 1)) {
            floatArray4.setSize(floatArray4.size - 2);
        }
        if (floatArray4.size < 6) {
            return false;
        }
        if (polygon3 != null) {
            polygon3.resetTransformations();
            if (polygon3.getVertices().length == floatArray4.size) {
                System.arraycopy(floatArray4.items, 0, polygon3.getVertices(), 0, floatArray4.size);
            } else {
                polygon3.setVertices(floatArray4.toArray());
            }
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:113:0x01f4  */
    /* JADX WARN: Code duplicated, block: B:22:0x005d  */
    public static boolean intersectRayBounds(Ray ray, BoundingBox boundingBox, Vector3 vector3) {
        boolean z;
        float f;
        boolean z2 = true;
        if (boundingBox.contains(ray.origin)) {
            if (vector3 != null) {
                vector3.set(ray.origin);
            }
            return true;
        }
        float f2 = ray.origin.x;
        float f3 = boundingBox.min.x;
        if (f2 <= f3) {
            Vector3 vector4 = ray.direction;
            float f4 = vector4.x;
            if (f4 > 0.0f) {
                f = (f3 - f2) / f4;
                if (f >= 0.0f) {
                    Vector3 vector5 = v2;
                    vector5.set(vector4).scl(f).add(ray.origin);
                    float f5 = vector5.y;
                    Vector3 vector6 = boundingBox.min;
                    if (f5 >= vector6.y) {
                        Vector3 vector7 = boundingBox.max;
                        if (f5 <= vector7.y) {
                            float f6 = vector5.z;
                            if (f6 < vector6.z || f6 > vector7.z) {
                                z = false;
                                f = 0.0f;
                            } else {
                                z = true;
                            }
                        } else {
                            z = false;
                            f = 0.0f;
                        }
                    } else {
                        z = false;
                        f = 0.0f;
                    }
                } else {
                    z = false;
                    f = 0.0f;
                }
            } else {
                z = false;
                f = 0.0f;
            }
        } else {
            z = false;
            f = 0.0f;
        }
        float f7 = ray.origin.x;
        float f8 = boundingBox.max.x;
        if (f7 >= f8) {
            Vector3 vector8 = ray.direction;
            float f9 = vector8.x;
            if (f9 < 0.0f) {
                float f10 = (f8 - f7) / f9;
                if (f10 >= 0.0f) {
                    Vector3 vector9 = v2;
                    vector9.set(vector8).scl(f10).add(ray.origin);
                    float f11 = vector9.y;
                    Vector3 vector10 = boundingBox.min;
                    if (f11 >= vector10.y) {
                        Vector3 vector11 = boundingBox.max;
                        if (f11 <= vector11.y) {
                            float f12 = vector9.z;
                            if (f12 >= vector10.z && f12 <= vector11.z && (!z || f10 < f)) {
                                f = f10;
                                z = true;
                            }
                        }
                    }
                }
            }
        }
        float f13 = ray.origin.y;
        float f14 = boundingBox.min.y;
        if (f13 <= f14) {
            Vector3 vector12 = ray.direction;
            float f15 = vector12.y;
            if (f15 > 0.0f) {
                float f16 = (f14 - f13) / f15;
                if (f16 >= 0.0f) {
                    Vector3 vector13 = v2;
                    vector13.set(vector12).scl(f16).add(ray.origin);
                    float f17 = vector13.x;
                    Vector3 vector14 = boundingBox.min;
                    if (f17 >= vector14.x) {
                        Vector3 vector15 = boundingBox.max;
                        if (f17 <= vector15.x) {
                            float f18 = vector13.z;
                            if (f18 >= vector14.z && f18 <= vector15.z && (!z || f16 < f)) {
                                f = f16;
                                z = true;
                            }
                        }
                    }
                }
            }
        }
        float f19 = ray.origin.y;
        float f20 = boundingBox.max.y;
        if (f19 >= f20) {
            Vector3 vector16 = ray.direction;
            float f21 = vector16.y;
            if (f21 < 0.0f) {
                float f22 = (f20 - f19) / f21;
                if (f22 >= 0.0f) {
                    Vector3 vector17 = v2;
                    vector17.set(vector16).scl(f22).add(ray.origin);
                    float f23 = vector17.x;
                    Vector3 vector18 = boundingBox.min;
                    if (f23 >= vector18.x) {
                        Vector3 vector19 = boundingBox.max;
                        if (f23 <= vector19.x) {
                            float f24 = vector17.z;
                            if (f24 >= vector18.z && f24 <= vector19.z && (!z || f22 < f)) {
                                f = f22;
                                z = true;
                            }
                        }
                    }
                }
            }
        }
        float f25 = ray.origin.z;
        float f26 = boundingBox.min.z;
        if (f25 <= f26) {
            Vector3 vector20 = ray.direction;
            float f27 = vector20.z;
            if (f27 > 0.0f) {
                float f28 = (f26 - f25) / f27;
                if (f28 >= 0.0f) {
                    Vector3 vector21 = v2;
                    vector21.set(vector20).scl(f28).add(ray.origin);
                    float f29 = vector21.x;
                    Vector3 vector22 = boundingBox.min;
                    if (f29 >= vector22.x) {
                        Vector3 vector23 = boundingBox.max;
                        if (f29 <= vector23.x) {
                            float f30 = vector21.y;
                            if (f30 >= vector22.y && f30 <= vector23.y && (!z || f28 < f)) {
                                f = f28;
                                z = true;
                            }
                        }
                    }
                }
            }
        }
        float f31 = ray.origin.z;
        float f32 = boundingBox.max.z;
        if (f31 >= f32) {
            Vector3 vector24 = ray.direction;
            float f33 = vector24.z;
            if (f33 < 0.0f) {
                float f34 = (f32 - f31) / f33;
                if (f34 >= 0.0f) {
                    Vector3 vector25 = v2;
                    vector25.set(vector24).scl(f34).add(ray.origin);
                    float f35 = vector25.x;
                    Vector3 vector26 = boundingBox.min;
                    if (f35 >= vector26.x) {
                        Vector3 vector27 = boundingBox.max;
                        if (f35 <= vector27.x) {
                            float f36 = vector25.y;
                            if (f36 < vector26.y || f36 > vector27.y || (z && f34 >= f)) {
                                z2 = z;
                            } else {
                                f = f34;
                            }
                        } else {
                            z2 = z;
                        }
                    } else {
                        z2 = z;
                    }
                } else {
                    z2 = z;
                }
            } else {
                z2 = z;
            }
        } else {
            z2 = z;
        }
        if (z2 && vector3 != null) {
            vector3.set(ray.direction).scl(f).add(ray.origin);
            float f37 = vector3.x;
            Vector3 vector28 = boundingBox.min;
            float f38 = vector28.x;
            if (f37 < f38) {
                vector3.x = f38;
            } else {
                float f39 = boundingBox.max.x;
                if (f37 > f39) {
                    vector3.x = f39;
                }
            }
            float f40 = vector3.y;
            float f41 = vector28.y;
            if (f40 < f41) {
                vector3.y = f41;
            } else {
                float f42 = boundingBox.max.y;
                if (f40 > f42) {
                    vector3.y = f42;
                }
            }
            float f43 = vector3.z;
            float f44 = vector28.z;
            if (f43 < f44) {
                vector3.z = f44;
            } else {
                float f45 = boundingBox.max.z;
                if (f43 > f45) {
                    vector3.z = f45;
                }
            }
        }
        return z2;
    }

    public static boolean intersectRayBoundsFast(Ray ray, BoundingBox boundingBox) {
        return intersectRayBoundsFast(ray, boundingBox.getCenter(tmp1), boundingBox.getDimensions(tmp2));
    }

    public static boolean intersectRayOrientedBounds(Ray ray, OrientedBoundingBox orientedBoundingBox, Vector3 vector3) {
        return intersectRayOrientedBounds(ray, orientedBoundingBox.getBounds(), orientedBoundingBox.getTransform(), vector3);
    }

    public static boolean intersectRayOrientedBoundsFast(Ray ray, OrientedBoundingBox orientedBoundingBox) {
        return intersectRayOrientedBounds(ray, orientedBoundingBox, null);
    }

    public static boolean intersectRayPlane(Ray ray, Plane plane, Vector3 vector3) {
        float fDot = ray.direction.dot(plane.getNormal());
        if (fDot == 0.0f) {
            if (plane.testPoint(ray.origin) != Plane.PlaneSide.OnPlane) {
                return false;
            }
            if (vector3 != null) {
                vector3.set(ray.origin);
            }
            return true;
        }
        float f = (-(plane.getD() + ray.origin.dot(plane.getNormal()))) / fDot;
        if (f < 0.0f) {
            return false;
        }
        if (vector3 != null) {
            vector3.set(ray.origin).add(v0.set(ray.direction).scl(f));
        }
        return true;
    }

    public static float intersectRayRay(Vector2 vector2, Vector2 vector3, Vector2 vector4, Vector2 vector5) {
        float f = vector4.x - vector2.x;
        float f2 = vector4.y - vector2.y;
        float f3 = vector3.x;
        float f4 = vector5.y;
        float f5 = vector3.y;
        float f6 = vector5.x;
        float f7 = (f3 * f4) - (f5 * f6);
        if (f7 == 0.0f) {
            return Float.POSITIVE_INFINITY;
        }
        return ((f4 / f7) * f) - (f2 * (f6 / f7));
    }

    public static boolean intersectRaySphere(Ray ray, Vector3 vector3, float f, Vector3 vector4) {
        Vector3 vector5 = ray.direction;
        float f2 = vector3.x;
        Vector3 vector6 = ray.origin;
        float fDot = vector5.dot(f2 - vector6.x, vector3.y - vector6.y, vector3.z - vector6.z);
        if (fDot < 0.0f) {
            return false;
        }
        Vector3 vector7 = ray.origin;
        float f3 = vector7.x;
        Vector3 vector8 = ray.direction;
        float fDst2 = vector3.dst2((vector8.x * fDot) + f3, (vector8.y * fDot) + vector7.y, (vector8.z * fDot) + vector7.z);
        float f4 = f * f;
        if (fDst2 > f4) {
            return false;
        }
        if (vector4 == null) {
            return true;
        }
        vector4.set(ray.direction).scl(fDot - ((float) Math.sqrt(f4 - fDst2))).add(ray.origin);
        return true;
    }

    public static boolean intersectRayTriangle(Ray ray, Vector3 vector3, Vector3 vector4, Vector3 vector5, Vector3 vector6) {
        Vector3 vector3Sub = v0.set(vector4).sub(vector3);
        Vector3 vector3Sub2 = v1.set(vector5).sub(vector3);
        Vector3 vector3Crs = v2.set(ray.direction).crs(vector3Sub2);
        float fDot = vector3Sub.dot(vector3Crs);
        if (MathUtils.isZero(fDot)) {
            Plane plane = p;
            plane.set(vector3, vector4, vector5);
            if (plane.testPoint(ray.origin) != Plane.PlaneSide.OnPlane || !isPointInTriangle(ray.origin, vector3, vector4, vector5)) {
                return false;
            }
            if (vector6 != null) {
                vector6.set(ray.origin);
            }
            return true;
        }
        float f = 1.0f / fDot;
        Vector3 vector3Sub3 = i.set(ray.origin).sub(vector3);
        float fDot2 = vector3Sub3.dot(vector3Crs) * f;
        if (fDot2 >= 0.0f && fDot2 <= 1.0f) {
            Vector3 vector3Crs2 = vector3Sub3.crs(vector3Sub);
            float fDot3 = ray.direction.dot(vector3Crs2) * f;
            if (fDot3 >= 0.0f && fDot2 + fDot3 <= 1.0f) {
                float fDot4 = vector3Sub2.dot(vector3Crs2) * f;
                if (fDot4 < 0.0f) {
                    return false;
                }
                if (vector6 != null) {
                    if (fDot4 <= 1.0E-6f) {
                        vector6.set(ray.origin);
                    } else {
                        ray.getEndPoint(vector6, fDot4);
                    }
                }
                return true;
            }
        }
        return false;
    }

    public static boolean intersectRayTriangles(Ray ray, float[] fArr, Vector3 vector3) {
        if (fArr.length % 9 != 0) {
            throw new RuntimeException("triangles array size is not a multiple of 9");
        }
        float f = Float.MAX_VALUE;
        boolean z = false;
        for (int i2 = 0; i2 < fArr.length; i2 += 9) {
            if (intersectRayTriangle(ray, tmp1.set(fArr[i2], fArr[i2 + 1], fArr[i2 + 2]), tmp2.set(fArr[i2 + 3], fArr[i2 + 4], fArr[i2 + 5]), tmp3.set(fArr[i2 + 6], fArr[i2 + 7], fArr[i2 + 8]), tmp)) {
                float fDst2 = ray.origin.dst2(tmp);
                if (fDst2 < f) {
                    best.set(tmp);
                    f = fDst2;
                    z = true;
                }
            }
        }
        if (!z) {
            return false;
        }
        if (vector3 != null) {
            vector3.set(best);
        }
        return true;
    }

    public static boolean intersectRectangles(Rectangle rectangle, Rectangle rectangle2, Rectangle rectangle3) {
        if (!rectangle.overlaps(rectangle2)) {
            return false;
        }
        rectangle3.x = Math.max(rectangle.x, rectangle2.x);
        rectangle3.width = Math.min(rectangle.x + rectangle.width, rectangle2.x + rectangle2.width) - rectangle3.x;
        rectangle3.y = Math.max(rectangle.y, rectangle2.y);
        rectangle3.height = Math.min(rectangle.y + rectangle.height, rectangle2.y + rectangle2.height) - rectangle3.y;
        return true;
    }

    public static boolean intersectSegmentCircle(Vector2 vector2, Vector2 vector3, Vector2 vector4, float f) {
        tmp.set(vector3.x - vector2.x, vector3.y - vector2.y, 0.0f);
        tmp1.set(vector4.x - vector2.x, vector4.y - vector2.y, 0.0f);
        float fLen = tmp.len();
        float fDot = tmp1.dot(tmp.nor());
        if (fDot <= 0.0f) {
            tmp2.set(vector2.x, vector2.y, 0.0f);
        } else if (fDot >= fLen) {
            tmp2.set(vector3.x, vector3.y, 0.0f);
        } else {
            tmp3.set(tmp.scl(fDot));
            Vector3 vector5 = tmp2;
            Vector3 vector6 = tmp3;
            vector5.set(vector6.x + vector2.x, vector6.y + vector2.y, 0.0f);
        }
        float f2 = vector4.x;
        Vector3 vector7 = tmp2;
        float f3 = f2 - vector7.x;
        float f4 = vector4.y - vector7.y;
        return (f4 * f4) + (f3 * f3) <= f;
    }

    public static boolean intersectSegmentPlane(Vector3 vector3, Vector3 vector4, Plane plane, Vector3 vector5) {
        Vector3 vector3Sub = v0.set(vector4).sub(vector3);
        float fDot = vector3Sub.dot(plane.getNormal());
        if (fDot == 0.0f) {
            return false;
        }
        float f = (-(plane.getD() + vector3.dot(plane.getNormal()))) / fDot;
        if (f < 0.0f || f > 1.0f) {
            return false;
        }
        vector5.set(vector3).add(vector3Sub.scl(f));
        return true;
    }

    public static boolean intersectSegmentPolygon(Vector2 vector2, Vector2 vector3, Polygon polygon) {
        float[] transformedVertices = polygon.getTransformedVertices();
        float f = vector2.x;
        float f2 = vector2.y;
        float f3 = vector3.x;
        float f4 = vector3.y;
        int length = transformedVertices.length;
        float f5 = transformedVertices[length - 2];
        float f6 = transformedVertices[length - 1];
        int i2 = 0;
        while (i2 < length) {
            float f7 = transformedVertices[i2];
            float f8 = transformedVertices[i2 + 1];
            float f9 = f8 - f6;
            float f10 = f3 - f;
            float f11 = f7 - f5;
            float f12 = f4 - f2;
            float f13 = (f9 * f10) - (f11 * f12);
            if (f13 != 0.0f) {
                float f14 = f2 - f6;
                float f15 = f - f5;
                float fG = AbstractC3950lJ.g(f9, f15, f11 * f14, f13);
                if (fG >= 0.0f && fG <= 1.0f) {
                    float fG2 = AbstractC3950lJ.g(f12, f15, f10 * f14, f13);
                    if (fG2 >= 0.0f && fG2 <= 1.0f) {
                        return true;
                    }
                }
            }
            i2 += 2;
            f5 = f7;
            f6 = f8;
        }
        return false;
    }

    public static boolean intersectSegmentRectangle(float f, float f2, float f3, float f4, Rectangle rectangle) {
        float f5 = rectangle.x;
        float f6 = f5 + rectangle.width;
        float f7 = rectangle.y;
        float f8 = f7 + rectangle.height;
        if (intersectSegments(f, f2, f3, f4, f5, f7, f5, f8, null)) {
            return true;
        }
        float f9 = rectangle.x;
        float f10 = rectangle.y;
        if (intersectSegments(f, f2, f3, f4, f9, f10, f6, f10, null) || intersectSegments(f, f2, f3, f4, f6, rectangle.y, f6, f8, null) || intersectSegments(f, f2, f3, f4, rectangle.x, f8, f6, f8, null)) {
            return true;
        }
        return rectangle.contains(f, f2);
    }

    public static boolean intersectSegments(Vector2 vector2, Vector2 vector3, Vector2 vector4, Vector2 vector5, Vector2 vector6) {
        return intersectSegments(vector2.x, vector2.y, vector3.x, vector3.y, vector4.x, vector4.y, vector5.x, vector5.y, vector6);
    }

    public static boolean isPointInPolygon(Array<Vector2> array, Vector2 vector2) {
        Vector2 vector2Peek = array.peek();
        float f = vector2.x;
        float f2 = vector2.y;
        int i2 = 0;
        boolean z = false;
        while (i2 < array.size) {
            Vector2 vector3 = array.get(i2);
            float f3 = vector3.y;
            if ((f3 < f2 && vector2Peek.y >= f2) || (vector2Peek.y < f2 && f3 >= f2)) {
                float f4 = vector3.x;
                if (AbstractC5044xl.w(vector2Peek.x, f4, (f2 - f3) / (vector2Peek.y - f3), f4) < f) {
                    z = !z;
                }
            }
            i2++;
            vector2Peek = vector3;
        }
        return z;
    }

    public static boolean isPointInTriangle(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8) {
        float f9 = f - f3;
        float f10 = f2 - f4;
        boolean z = ((f5 - f3) * f10) - ((f6 - f4) * f9) > 0.0f;
        if ((((f7 - f3) * f10) - ((f8 - f4) * f9) > 0.0f) == z) {
            return false;
        }
        return (((((f2 - f6) * (f7 - f5)) - ((f - f5) * (f8 - f6))) > 0.0f ? 1 : ((((f2 - f6) * (f7 - f5)) - ((f - f5) * (f8 - f6))) == 0.0f ? 0 : -1)) > 0) == z;
    }

    public static Vector2 nearestSegmentPoint(Vector2 vector2, Vector2 vector3, Vector2 vector4, Vector2 vector5) {
        float fDst2 = vector2.dst2(vector3);
        if (fDst2 == 0.0f) {
            return vector5.set(vector2);
        }
        float f = vector4.x;
        float f2 = vector2.x;
        float f3 = vector3.x;
        float f4 = (f3 - f2) * (f - f2);
        float f5 = vector4.y;
        float f6 = vector2.y;
        float f7 = vector3.y;
        float f8 = (((f7 - f6) * (f5 - f6)) + f4) / fDst2;
        if (f8 <= 0.0f) {
            return vector5.set(vector2);
        }
        return f8 >= 1.0f ? vector5.set(vector3) : vector5.set(AbstractC5044xl.w(f3, f2, f8, f2), AbstractC5044xl.w(f7, f6, f8, f6));
    }

    public static boolean overlapConvexPolygons(Polygon polygon, Polygon polygon2) {
        return overlapConvexPolygons(polygon, polygon2, (MinimumTranslationVector) null);
    }

    public static boolean overlaps(Circle circle, Circle circle2) {
        return circle.overlaps(circle2);
    }

    /* JADX WARN: Code duplicated, block: B:45:0x00c4 A[PHI: r6
  0x00c4: PHI (r6v10 float) = (r6v4 float), (r6v11 float) binds: [B:53:0x00d1, B:43:0x00c1] A[DONT_GENERATE, DONT_INLINE]] */
    private static boolean overlapsOnAxisOfShape(float[] fArr, int i2, int i3, float[] fArr2, int i4, int i5, MinimumTranslationVector minimumTranslationVector, boolean z) {
        float f;
        float f2;
        int i6 = i2 + i3;
        int i7 = i4 + i5;
        int i8 = i2;
        while (i8 < i6) {
            float f3 = fArr[i8];
            float f4 = fArr[i8 + 1];
            int i9 = i8 + 2;
            float f5 = fArr[i9 % i3];
            float f6 = f4 - fArr[(i8 + 3) % i3];
            float f7 = -(f3 - f5);
            float fLen = Vector2.len(f6, f7);
            float f8 = f6 / fLen;
            float f9 = f7 / fLen;
            float fMax = -3.4028235E38f;
            float fMin = Float.MAX_VALUE;
            float fMin2 = Float.MAX_VALUE;
            float fMax2 = -3.4028235E38f;
            for (int i10 = i2; i10 < i6; i10 += 2) {
                float f10 = (fArr[i10 + 1] * f9) + (fArr[i10] * f8);
                fMin2 = Math.min(fMin2, f10);
                fMax2 = Math.max(fMax2, f10);
            }
            for (int i11 = i4; i11 < i7; i11 += 2) {
                float f11 = (fArr2[i11 + 1] * f9) + (fArr2[i11] * f8);
                fMin = Math.min(fMin, f11);
                fMax = Math.max(fMax, f11);
            }
            if (fMax2 < fMin || fMax < fMin2) {
                return false;
            }
            if (minimumTranslationVector != null) {
                float fMin3 = Math.min(fMax2, fMax) - Math.max(fMin2, fMin);
                boolean z2 = fMin2 < fMin && fMax2 > fMax;
                boolean z3 = fMin < fMin2 && fMax > fMax2;
                if (z2 || z3) {
                    float fAbs = Math.abs(fMin2 - fMin);
                    float fAbs2 = Math.abs(fMax2 - fMax);
                    fMin3 += Math.min(fAbs, fAbs2);
                    f = fAbs;
                    f2 = fAbs2;
                } else {
                    f = 0.0f;
                    f2 = 0.0f;
                }
                if (minimumTranslationVector.depth > fMin3) {
                    minimumTranslationVector.depth = fMin3;
                    if (z) {
                        boolean z4 = fMin2 < fMin;
                        if (!z4) {
                            f8 = -f8;
                        }
                        if (!z4) {
                            f9 = -f9;
                        }
                    } else {
                        boolean z5 = fMin2 > fMin;
                        if (!z5) {
                            f8 = -f8;
                        }
                        if (!z5) {
                            f9 = -f9;
                        }
                    }
                    if (z2 || z3) {
                        boolean z6 = f > f2;
                        if (!z6) {
                            f8 = -f8;
                        }
                        if (!z6) {
                            f9 = -f9;
                        }
                    }
                    minimumTranslationVector.normal.set(f8, f9);
                }
            }
            i8 = i9;
        }
        return true;
    }

    public static int pointLineSide(Vector2 vector2, Vector2 vector3, Vector2 vector4) {
        float f = vector3.x;
        float f2 = vector2.x;
        float f3 = vector4.y;
        float f4 = vector2.y;
        return (int) Math.signum(((f3 - f4) * (f - f2)) - ((vector4.x - f2) * (vector3.y - f4)));
    }

    private static void splitEdge(float[] fArr, int i2, int i3, int i4, Plane plane, float[] fArr2, int i5) {
        float fIntersectLinePlane = intersectLinePlane(fArr[i2], fArr[i2 + 1], fArr[i2 + 2], fArr[i3], fArr[i3 + 1], fArr[i3 + 2], plane, intersection);
        Vector3 vector3 = intersection;
        fArr2[i5] = vector3.x;
        fArr2[i5 + 1] = vector3.y;
        fArr2[i5 + 2] = vector3.z;
        for (int i6 = 3; i6 < i4; i6++) {
            float f = fArr[i2 + i6];
            fArr2[i5 + i6] = AbstractC5044xl.w(fArr[i3 + i6], f, fIntersectLinePlane, f);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void splitTriangle(float[] fArr, Plane plane, SplitTriangle splitTriangle) {
        int length = fArr.length / 3;
        Plane.PlaneSide planeSideTestPoint = plane.testPoint(fArr[0], fArr[1], fArr[2]);
        Plane.PlaneSide planeSide = Plane.PlaneSide.Back;
        int i2 = planeSideTestPoint == planeSide ? 1 : 0;
        int i3 = plane.testPoint(fArr[length], fArr[length + 1], fArr[length + 2]) == planeSide ? 1 : 0;
        int i4 = length * 2;
        int i5 = plane.testPoint(fArr[i4], fArr[i4 + 1], fArr[i4 + 2]) == planeSide ? 1 : 0;
        splitTriangle.reset();
        if (i2 == i3 && i3 == i5) {
            splitTriangle.total = 1;
            if (i2 != 0) {
                splitTriangle.numBack = 1;
                System.arraycopy(fArr, 0, splitTriangle.back, 0, fArr.length);
                return;
            } else {
                splitTriangle.numFront = 1;
                System.arraycopy(fArr, 0, splitTriangle.front, 0, fArr.length);
                return;
            }
        }
        splitTriangle.total = 3;
        int i6 = (i2 ^ 1) + (i3 ^ 1) + (i5 ^ 1);
        splitTriangle.numFront = i6;
        splitTriangle.numBack = 3 - i6;
        splitTriangle.setSide(i2 ^ 1);
        if (i2 != i3) {
            splitEdge(fArr, 0, length, length, plane, splitTriangle.edgeSplit, 0);
            splitTriangle.add(fArr, 0, length);
            splitTriangle.add(splitTriangle.edgeSplit, 0, length);
            splitTriangle.setSide(!splitTriangle.getSide());
            splitTriangle.add(splitTriangle.edgeSplit, 0, length);
        } else {
            splitTriangle.add(fArr, 0, length);
        }
        int i7 = length + length;
        int i8 = i5;
        if (i3 != i8) {
            splitEdge(fArr, length, i7, length, plane, splitTriangle.edgeSplit, 0);
            splitTriangle.add(fArr, length, length);
            splitTriangle.add(splitTriangle.edgeSplit, 0, length);
            splitTriangle.setSide(!splitTriangle.getSide());
            splitTriangle.add(splitTriangle.edgeSplit, 0, length);
        } else {
            splitTriangle.add(fArr, length, length);
        }
        if (i8 != i2) {
            splitEdge(fArr, i7, 0, length, plane, splitTriangle.edgeSplit, 0);
            splitTriangle.add(fArr, i7, length);
            splitTriangle.add(splitTriangle.edgeSplit, 0, length);
            splitTriangle.setSide(!splitTriangle.getSide());
            splitTriangle.add(splitTriangle.edgeSplit, 0, length);
        } else {
            splitTriangle.add(fArr, i7, length);
        }
        if (splitTriangle.numFront == 2) {
            float[] fArr2 = splitTriangle.front;
            System.arraycopy(fArr2, i4, fArr2, length * 3, i4);
            float[] fArr3 = splitTriangle.front;
            System.arraycopy(fArr3, 0, fArr3, length * 5, length);
            return;
        }
        float[] fArr4 = splitTriangle.back;
        System.arraycopy(fArr4, i4, fArr4, length * 3, i4);
        float[] fArr5 = splitTriangle.back;
        System.arraycopy(fArr5, 0, fArr5, length * 5, length);
    }

    public static float distanceSegmentPoint(Vector2 vector2, Vector2 vector3, Vector2 vector4) {
        return nearestSegmentPoint(vector2, vector3, vector4, v2a).dst(vector4);
    }

    public static boolean intersectBoundsPlaneFast(Vector3 vector3, Vector3 vector4, Vector3 vector5, float f) {
        return Math.abs(vector5.dot(vector3) - f) <= (Math.abs(vector5.z) * vector4.z) + ((Math.abs(vector5.y) * vector4.y) + (Math.abs(vector5.x) * vector4.x));
    }

    public static boolean intersectLines(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, Vector2 vector2) {
        float f9 = f8 - f6;
        float f10 = f3 - f;
        float f11 = f7 - f5;
        float f12 = f4 - f2;
        float f13 = (f9 * f10) - (f11 * f12);
        if (f13 == 0.0f) {
            return false;
        }
        if (vector2 == null) {
            return true;
        }
        float f14 = (((f2 - f6) * f11) - ((f - f5) * f9)) / f13;
        vector2.set((f10 * f14) + f, (f12 * f14) + f2);
        return true;
    }

    public static boolean intersectRayBoundsFast(Ray ray, Vector3 vector3, Vector3 vector4) {
        Vector3 vector5 = ray.direction;
        float f = 1.0f / vector5.x;
        float f2 = 1.0f / vector5.y;
        float f3 = 1.0f / vector5.z;
        float f4 = vector3.x;
        float f5 = vector4.x;
        Vector3 vector6 = ray.origin;
        float f6 = vector6.x;
        float f7 = ((f4 - (f5 * 0.5f)) - f6) * f;
        float f8 = (((f5 * 0.5f) + f4) - f6) * f;
        if (f7 > f8) {
            f7 = f8;
            f8 = f7;
        }
        float f9 = vector3.y;
        float f10 = vector4.y;
        float f11 = vector6.y;
        float f12 = ((f9 - (f10 * 0.5f)) - f11) * f2;
        float f13 = (((f10 * 0.5f) + f9) - f11) * f2;
        if (f12 > f13) {
            f12 = f13;
            f13 = f12;
        }
        float f14 = vector3.z;
        float f15 = vector4.z;
        float f16 = vector6.z;
        float f17 = ((f14 - (f15 * 0.5f)) - f16) * f3;
        float f18 = (((f15 * 0.5f) + f14) - f16) * f3;
        if (f17 > f18) {
            f17 = f18;
            f18 = f17;
        }
        float fMax = Math.max(Math.max(f7, f12), f17);
        float fMin = Math.min(Math.min(f8, f13), f18);
        return fMin >= 0.0f && fMin >= fMax;
    }

    public static boolean intersectRayOrientedBoundsFast(Ray ray, BoundingBox boundingBox, Matrix4 matrix4) {
        return intersectRayOrientedBounds(ray, boundingBox, matrix4, null);
    }

    public static boolean intersectSegments(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, Vector2 vector2) {
        float f9 = f8 - f6;
        float f10 = f3 - f;
        float f11 = f7 - f5;
        float f12 = f4 - f2;
        float f13 = (f9 * f10) - (f11 * f12);
        if (f13 == 0.0f) {
            return false;
        }
        float f14 = f2 - f6;
        float f15 = f - f5;
        float fG = AbstractC3950lJ.g(f9, f15, f11 * f14, f13);
        if (fG >= 0.0f && fG <= 1.0f) {
            float fG2 = AbstractC3950lJ.g(f12, f15, f14 * f10, f13);
            if (fG2 >= 0.0f && fG2 <= 1.0f) {
                if (vector2 == null) {
                    return true;
                }
                vector2.set((f10 * fG) + f, (f12 * fG) + f2);
                return true;
            }
        }
        return false;
    }

    public static boolean isPointInTriangle(Vector3 vector3, Vector3 vector4, Vector3 vector5, Vector3 vector6) {
        Vector3 vector7 = v0;
        vector7.set(vector4).sub(vector3);
        Vector3 vector8 = v1;
        vector8.set(vector5).sub(vector3);
        Vector3 vector9 = v2;
        vector9.set(vector6).sub(vector3);
        vector8.crs(vector9);
        vector9.crs(vector7);
        if (vector8.dot(vector9) < 0.0f) {
            return false;
        }
        vector7.crs(vector9.set(vector5).sub(vector3));
        return vector8.dot(vector7) >= 0.0f;
    }

    public static boolean overlapConvexPolygons(Polygon polygon, Polygon polygon2, MinimumTranslationVector minimumTranslationVector) {
        return overlapConvexPolygons(polygon.getTransformedVertices(), polygon2.getTransformedVertices(), minimumTranslationVector);
    }

    public static boolean overlaps(Rectangle rectangle, Rectangle rectangle2) {
        return rectangle.overlaps(rectangle2);
    }

    public static int pointLineSide(float f, float f2, float f3, float f4, float f5, float f6) {
        return (int) Math.signum(((f6 - f2) * (f3 - f)) - ((f5 - f) * (f4 - f2)));
    }

    public static boolean overlapConvexPolygons(float[] fArr, float[] fArr2, MinimumTranslationVector minimumTranslationVector) {
        return overlapConvexPolygons(fArr, 0, fArr.length, fArr2, 0, fArr2.length, minimumTranslationVector);
    }

    public static boolean overlaps(Circle circle, Rectangle rectangle) {
        float f = circle.x;
        float f2 = circle.y;
        float f3 = rectangle.x;
        if (f >= f3) {
            float f4 = rectangle.width;
            f3 = f > f3 + f4 ? f3 + f4 : f;
        }
        float f5 = rectangle.y;
        if (f2 >= f5) {
            float f6 = rectangle.height;
            f5 = f2 > f5 + f6 ? f5 + f6 : f2;
        }
        float f7 = f3 - f;
        float f8 = f5 - f2;
        float f9 = (f8 * f8) + (f7 * f7);
        float f10 = circle.radius;
        return f9 < f10 * f10;
    }

    /* JADX WARN: Code restructure failed: missing block: B:62:0x012f, code lost:
    
        if ((r2 + r18.max.z) >= 0.0f) goto L64;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean intersectRayOrientedBounds(com.badlogic.gdx.math.collision.Ray r17, com.badlogic.gdx.math.collision.BoundingBox r18, com.badlogic.gdx.math.Matrix4 r19, com.badlogic.gdx.math.Vector3 r20) {
        /*
            Method dump skipped, instruction units count: 313
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.badlogic.gdx.math.Intersector.intersectRayOrientedBounds(com.badlogic.gdx.math.collision.Ray, com.badlogic.gdx.math.collision.BoundingBox, com.badlogic.gdx.math.Matrix4, com.badlogic.gdx.math.Vector3):boolean");
    }

    public static boolean overlapConvexPolygons(float[] fArr, int i2, int i3, float[] fArr2, int i4, int i5, MinimumTranslationVector minimumTranslationVector) {
        if (minimumTranslationVector != null) {
            minimumTranslationVector.depth = Float.MAX_VALUE;
            minimumTranslationVector.normal.setZero();
        }
        boolean zOverlapsOnAxisOfShape = overlapsOnAxisOfShape(fArr2, i4, i5, fArr, i2, i3, minimumTranslationVector, true);
        if (zOverlapsOnAxisOfShape) {
            zOverlapsOnAxisOfShape = overlapsOnAxisOfShape(fArr, i2, i3, fArr2, i4, i5, minimumTranslationVector, false);
        }
        if (zOverlapsOnAxisOfShape) {
            return true;
        }
        if (minimumTranslationVector == null) {
            return false;
        }
        minimumTranslationVector.depth = 0.0f;
        minimumTranslationVector.normal.setZero();
        return false;
    }

    public static boolean isPointInPolygon(float[] fArr, int i2, int i3, float f, float f2) {
        float f3 = fArr[i2];
        float f4 = fArr[i2 + 1];
        int i4 = i2 + 3;
        int i5 = i2 + i3;
        boolean z = false;
        float f5 = f4;
        while (i4 < i5) {
            float f6 = fArr[i4];
            if ((f6 < f2 && f5 >= f2) || (f5 < f2 && f6 >= f2)) {
                float f7 = fArr[i4 - 1];
                if (AbstractC5044xl.w(fArr[i4 - 3], f7, (f2 - f6) / (f5 - f6), f7) < f) {
                    z = !z;
                }
            }
            i4 += 2;
            f5 = f6;
        }
        if ((f4 >= f2 || f5 < f2) && (f5 >= f2 || f4 < f2)) {
            return z;
        }
        return AbstractC5044xl.w(fArr[i4 + (-3)], f3, (f2 - f4) / (f5 - f4), f3) < f ? !z : z;
    }

    public static Vector2 nearestSegmentPoint(float f, float f2, float f3, float f4, float f5, float f6, Vector2 vector2) {
        float f7 = f3 - f;
        float f8 = f4 - f2;
        float f9 = (f8 * f8) + (f7 * f7);
        if (f9 == 0.0f) {
            return vector2.set(f, f2);
        }
        float f10 = (((f6 - f2) * f8) + ((f5 - f) * f7)) / f9;
        if (f10 <= 0.0f) {
            return vector2.set(f, f2);
        }
        if (f10 >= 1.0f) {
            return vector2.set(f3, f4);
        }
        return vector2.set((f7 * f10) + f, (f10 * f8) + f2);
    }

    public static boolean intersectFrustumBounds(Frustum frustum, OrientedBoundingBox orientedBoundingBox) {
        boolean zPointInFrustum = false;
        for (Vector3 vector3 : orientedBoundingBox.getVertices()) {
            zPointInFrustum |= frustum.pointInFrustum(vector3);
        }
        if (zPointInFrustum) {
            return true;
        }
        boolean zContains = false;
        for (Vector3 vector4 : frustum.planePoints) {
            zContains |= orientedBoundingBox.contains(vector4);
        }
        return zContains;
    }

    public static boolean intersectSegmentRectangle(Vector2 vector2, Vector2 vector3, Rectangle rectangle) {
        return intersectSegmentRectangle(vector2.x, vector2.y, vector3.x, vector3.y, rectangle);
    }

    public static boolean isPointInTriangle(Vector2 vector2, Vector2 vector3, Vector2 vector4, Vector2 vector5) {
        return isPointInTriangle(vector2.x, vector2.y, vector3.x, vector3.y, vector4.x, vector4.y, vector5.x, vector5.y);
    }

    public static boolean intersectRayTriangles(Ray ray, float[] fArr, short[] sArr, int i2, Vector3 vector3) {
        if (sArr.length % 3 == 0) {
            float f = Float.MAX_VALUE;
            boolean z = false;
            for (int i3 = 0; i3 < sArr.length; i3 += 3) {
                int i4 = sArr[i3] * i2;
                int i5 = sArr[i3 + 1] * i2;
                int i6 = sArr[i3 + 2] * i2;
                if (intersectRayTriangle(ray, tmp1.set(fArr[i4], fArr[i4 + 1], fArr[i4 + 2]), tmp2.set(fArr[i5], fArr[i5 + 1], fArr[i5 + 2]), tmp3.set(fArr[i6], fArr[i6 + 1], fArr[i6 + 2]), tmp)) {
                    float fDst2 = ray.origin.dst2(tmp);
                    if (fDst2 < f) {
                        best.set(tmp);
                        f = fDst2;
                        z = true;
                    }
                }
            }
            if (!z) {
                return false;
            }
            if (vector3 != null) {
                vector3.set(best);
            }
            return true;
        }
        throw new RuntimeException("triangle list size is not a multiple of 3");
    }

    public static boolean intersectSegmentCircle(Vector2 vector2, Vector2 vector3, Circle circle, MinimumTranslationVector minimumTranslationVector) {
        v2a.set(vector3).sub(vector2);
        v2b.set(circle.x - vector2.x, circle.y - vector2.y);
        float fLen = v2a.len();
        float fDot = v2b.dot(v2a.nor());
        if (fDot <= 0.0f) {
            v2c.set(vector2);
        } else if (fDot >= fLen) {
            v2c.set(vector3);
        } else {
            v2d.set(v2a.scl(fDot));
            v2c.set(v2d).add(vector2);
        }
        Vector2 vector4 = v2a;
        Vector2 vector5 = v2c;
        vector4.set(vector5.x - circle.x, vector5.y - circle.y);
        if (minimumTranslationVector != null) {
            if (v2a.equals(Vector2.Zero)) {
                v2d.set(vector3.y - vector2.y, vector2.x - vector3.x);
                minimumTranslationVector.normal.set(v2d).nor();
                minimumTranslationVector.depth = circle.radius;
            } else {
                minimumTranslationVector.normal.set(v2a).nor();
                minimumTranslationVector.depth = circle.radius - v2a.len();
            }
        }
        float fLen2 = v2a.len2();
        float f = circle.radius;
        return fLen2 <= f * f;
    }

    public static boolean intersectRayTriangles(Ray ray, List<Vector3> list, Vector3 vector3) {
        if (list.size() % 3 == 0) {
            float f = Float.MAX_VALUE;
            boolean z = false;
            for (int i2 = 0; i2 < list.size(); i2 += 3) {
                if (intersectRayTriangle(ray, list.get(i2), list.get(i2 + 1), list.get(i2 + 2), tmp)) {
                    float fDst2 = ray.origin.dst2(tmp);
                    if (fDst2 < f) {
                        best.set(tmp);
                        f = fDst2;
                        z = true;
                    }
                }
            }
            if (!z) {
                return false;
            }
            if (vector3 != null) {
                vector3.set(best);
            }
            return true;
        }
        throw new RuntimeException("triangle list size is not a multiple of 3");
    }

    public static boolean intersectPolygons(FloatArray floatArray3, FloatArray floatArray4) {
        float[] fArr = floatArray3.items;
        int i2 = floatArray3.size;
        float[] fArr2 = floatArray4.items;
        if (isPointInPolygon(fArr, 0, i2, fArr2[0], fArr2[1])) {
            return true;
        }
        float[] fArr3 = floatArray4.items;
        int i3 = floatArray4.size;
        float[] fArr4 = floatArray3.items;
        if (isPointInPolygon(fArr3, 0, i3, fArr4[0], fArr4[1])) {
            return true;
        }
        return intersectPolygonEdges(floatArray3, floatArray4);
    }
}
