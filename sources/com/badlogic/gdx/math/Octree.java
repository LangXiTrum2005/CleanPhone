package com.badlogic.gdx.math;

import com.badlogic.gdx.math.collision.BoundingBox;
import com.badlogic.gdx.math.collision.Ray;
import com.badlogic.gdx.utils.Array;
import com.badlogic.gdx.utils.ObjectSet;
import com.badlogic.gdx.utils.Pool;

/* JADX INFO: loaded from: classes.dex */
public class Octree<T> {
    static final Vector3 tmp = new Vector3();
    final Collider<T> collider;
    final int maxItemsPerNode;
    final Pool<Octree<T>.OctreeNode> nodePool = new Pool<Octree<T>.OctreeNode>() { // from class: com.badlogic.gdx.math.Octree.1
        @Override // com.badlogic.gdx.utils.Pool
        public Octree<T>.OctreeNode newObject() {
            return new OctreeNode();
        }
    };
    protected Octree<T>.OctreeNode root;

    public interface Collider<T> {
        float intersects(Ray ray, T t);

        boolean intersects(Frustum frustum, T t);

        boolean intersects(BoundingBox boundingBox, T t);
    }

    public static class RayCastResult<T> {
        float distance;
        T geometry;
        float maxDistanceSq = Float.MAX_VALUE;
    }

    public Octree(Vector3 vector3, Vector3 vector4, int i, int i2, Collider<T> collider) {
        this.root = createNode(new Vector3(Math.min(vector3.x, vector4.x), Math.min(vector3.y, vector4.y), Math.min(vector3.z, vector4.z)), new Vector3(Math.max(vector3.x, vector4.x), Math.max(vector3.y, vector4.y), Math.max(vector3.z, vector4.z)), i);
        this.collider = collider;
        this.maxItemsPerNode = i2;
    }

    public void add(T t) {
        this.root.add(t);
    }

    public Octree<T>.OctreeNode createNode(Vector3 vector3, Vector3 vector4, int i) {
        Octree<T>.OctreeNode octreeNodeObtain = this.nodePool.obtain();
        octreeNodeObtain.bounds.set(vector3, vector4);
        octreeNodeObtain.level = i;
        octreeNodeObtain.leaf = true;
        return octreeNodeObtain;
    }

    public ObjectSet<T> getAll(ObjectSet<T> objectSet) {
        this.root.getAll(objectSet);
        return objectSet;
    }

    public ObjectSet<BoundingBox> getNodesBoxes(ObjectSet<BoundingBox> objectSet) {
        this.root.getBoundingBox(objectSet);
        return objectSet;
    }

    public ObjectSet<T> query(BoundingBox boundingBox, ObjectSet<T> objectSet) {
        this.root.query(boundingBox, objectSet);
        return objectSet;
    }

    public T rayCast(Ray ray, RayCastResult<T> rayCastResult) {
        rayCastResult.distance = rayCastResult.maxDistanceSq;
        this.root.rayCast(ray, rayCastResult);
        return rayCastResult.geometry;
    }

    public void remove(T t) {
        this.root.remove(t);
    }

    public void update(T t) {
        this.root.remove(t);
        this.root.add(t);
    }

    public ObjectSet<T> query(Frustum frustum, ObjectSet<T> objectSet) {
        this.root.query(frustum, objectSet);
        return objectSet;
    }

    public class OctreeNode {
        final BoundingBox bounds = new BoundingBox();
        private OctreeNode[] children;
        private final Array<T> geometries;
        boolean leaf;
        int level;

        public OctreeNode() {
            this.geometries = new Array<>(Math.min(16, Octree.this.maxItemsPerNode));
        }

        private void clearChildren() {
            for (int i = 0; i < 8; i++) {
                this.children[i].free();
                this.children[i] = null;
            }
        }

        private void free() {
            this.geometries.clear();
            if (!this.leaf) {
                clearChildren();
            }
            Octree.this.nodePool.free(this);
        }

        private void merge() {
            clearChildren();
            this.leaf = true;
        }

        private void split() {
            BoundingBox boundingBox = this.bounds;
            Vector3 vector3 = boundingBox.max;
            float f = vector3.x;
            Vector3 vector4 = boundingBox.min;
            float f2 = (f + vector4.x) * 0.5f;
            float f3 = (vector3.y + vector4.y) * 0.5f;
            float f4 = (vector3.z + vector4.z) * 0.5f;
            int i = this.level - 1;
            this.leaf = false;
            if (this.children == null) {
                this.children = new OctreeNode[8];
            }
            OctreeNode[] octreeNodeArr = this.children;
            Octree octree = Octree.this;
            Vector3 vector5 = new Vector3(this.bounds.min.x, f3, f4);
            Vector3 vector6 = this.bounds.max;
            octreeNodeArr[0] = octree.createNode(vector5, new Vector3(f2, vector6.y, vector6.z), i);
            OctreeNode[] octreeNodeArr2 = this.children;
            Octree octree2 = Octree.this;
            Vector3 vector7 = new Vector3(f2, f3, f4);
            Vector3 vector8 = this.bounds.max;
            octreeNodeArr2[1] = octree2.createNode(vector7, new Vector3(vector8.x, vector8.y, vector8.z), i);
            OctreeNode[] octreeNodeArr3 = this.children;
            Octree octree3 = Octree.this;
            Vector3 vector9 = new Vector3(f2, f3, this.bounds.min.z);
            Vector3 vector10 = this.bounds.max;
            octreeNodeArr3[2] = octree3.createNode(vector9, new Vector3(vector10.x, vector10.y, f4), i);
            OctreeNode[] octreeNodeArr4 = this.children;
            Octree octree4 = Octree.this;
            Vector3 vector11 = this.bounds.min;
            octreeNodeArr4[3] = octree4.createNode(new Vector3(vector11.x, f3, vector11.z), new Vector3(f2, this.bounds.max.y, f4), i);
            OctreeNode[] octreeNodeArr5 = this.children;
            Octree octree5 = Octree.this;
            Vector3 vector12 = this.bounds.min;
            octreeNodeArr5[4] = octree5.createNode(new Vector3(vector12.x, vector12.y, f4), new Vector3(f2, f3, this.bounds.max.z), i);
            OctreeNode[] octreeNodeArr6 = this.children;
            Octree octree6 = Octree.this;
            Vector3 vector13 = new Vector3(f2, this.bounds.min.y, f4);
            Vector3 vector14 = this.bounds.max;
            octreeNodeArr6[5] = octree6.createNode(vector13, new Vector3(vector14.x, f3, vector14.z), i);
            OctreeNode[] octreeNodeArr7 = this.children;
            Octree octree7 = Octree.this;
            Vector3 vector15 = this.bounds.min;
            octreeNodeArr7[6] = octree7.createNode(new Vector3(f2, vector15.y, vector15.z), new Vector3(this.bounds.max.x, f3, f4), i);
            OctreeNode[] octreeNodeArr8 = this.children;
            Octree octree8 = Octree.this;
            Vector3 vector16 = this.bounds.min;
            octreeNodeArr8[7] = octree8.createNode(new Vector3(vector16.x, vector16.y, vector16.z), new Vector3(f2, f3, f4), i);
            for (OctreeNode octreeNode : this.children) {
                Array.ArrayIterator<T> it = this.geometries.iterator();
                while (it.hasNext()) {
                    octreeNode.add(it.next());
                }
            }
            this.geometries.clear();
        }

        public void add(T t) {
            if (Octree.this.collider.intersects(this.bounds, t)) {
                int i = 0;
                if (!this.leaf) {
                    OctreeNode[] octreeNodeArr = this.children;
                    int length = octreeNodeArr.length;
                    while (i < length) {
                        octreeNodeArr[i].add(t);
                        i++;
                    }
                    return;
                }
                Array<T> array = this.geometries;
                if (array.size < Octree.this.maxItemsPerNode || this.level <= 0) {
                    array.add(t);
                    return;
                }
                split();
                OctreeNode[] octreeNodeArr2 = this.children;
                int length2 = octreeNodeArr2.length;
                while (i < length2) {
                    octreeNodeArr2[i].add(t);
                    i++;
                }
            }
        }

        public void getAll(ObjectSet<T> objectSet) {
            if (!this.leaf) {
                for (OctreeNode octreeNode : this.children) {
                    octreeNode.getAll(objectSet);
                }
            }
            objectSet.addAll(this.geometries);
        }

        public void getBoundingBox(ObjectSet<BoundingBox> objectSet) {
            if (!this.leaf) {
                for (OctreeNode octreeNode : this.children) {
                    octreeNode.getBoundingBox(objectSet);
                }
            }
            objectSet.add(this.bounds);
        }

        public boolean isLeaf() {
            return this.leaf;
        }

        public void query(BoundingBox boundingBox, ObjectSet<T> objectSet) {
            if (boundingBox.intersects(this.bounds)) {
                if (this.leaf) {
                    Array.ArrayIterator<T> it = this.geometries.iterator();
                    while (it.hasNext()) {
                        T next = it.next();
                        if (Octree.this.collider.intersects(this.bounds, next)) {
                            objectSet.add(next);
                        }
                    }
                    return;
                }
                for (OctreeNode octreeNode : this.children) {
                    octreeNode.query(boundingBox, objectSet);
                }
            }
        }

        public void rayCast(Ray ray, RayCastResult<T> rayCastResult) {
            BoundingBox boundingBox = this.bounds;
            Vector3 vector3 = Octree.tmp;
            if (Intersector.intersectRayBounds(ray, boundingBox, vector3) && vector3.dst2(ray.origin) < rayCastResult.maxDistanceSq) {
                if (!this.leaf) {
                    for (OctreeNode octreeNode : this.children) {
                        octreeNode.rayCast(ray, rayCastResult);
                    }
                    return;
                }
                Array.ArrayIterator<T> it = this.geometries.iterator();
                while (it.hasNext()) {
                    T next = it.next();
                    float fIntersects = Octree.this.collider.intersects(ray, next);
                    if (rayCastResult.geometry == null || fIntersects < rayCastResult.distance) {
                        rayCastResult.geometry = next;
                        rayCastResult.distance = fIntersects;
                    }
                }
            }
        }

        public boolean remove(T t) {
            if (this.leaf) {
                return this.geometries.removeValue(t, true);
            }
            boolean zRemove = false;
            for (OctreeNode octreeNode : this.children) {
                zRemove |= octreeNode.remove(t);
            }
            if (zRemove) {
                ObjectSet<T> objectSet = new ObjectSet<>();
                for (OctreeNode octreeNode2 : this.children) {
                    octreeNode2.getAll(objectSet);
                }
                if (objectSet.size <= Octree.this.maxItemsPerNode) {
                    ObjectSet.ObjectSetIterator<T> it = objectSet.iterator();
                    while (it.hasNext()) {
                        this.geometries.add(it.next());
                    }
                    merge();
                }
            }
            return zRemove;
        }

        public void query(Frustum frustum, ObjectSet<T> objectSet) {
            if (Intersector.intersectFrustumBounds(frustum, this.bounds)) {
                if (!this.leaf) {
                    for (OctreeNode octreeNode : this.children) {
                        octreeNode.query(frustum, objectSet);
                    }
                    return;
                }
                Array.ArrayIterator<T> it = this.geometries.iterator();
                while (it.hasNext()) {
                    T next = it.next();
                    if (Octree.this.collider.intersects(frustum, next)) {
                        objectSet.add(next);
                    }
                }
            }
        }
    }
}
