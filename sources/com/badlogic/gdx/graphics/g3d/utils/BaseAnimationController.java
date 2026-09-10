package com.badlogic.gdx.graphics.g3d.utils;

import com.badlogic.gdx.graphics.g3d.ModelInstance;
import com.badlogic.gdx.graphics.g3d.model.Animation;
import com.badlogic.gdx.graphics.g3d.model.Node;
import com.badlogic.gdx.graphics.g3d.model.NodeAnimation;
import com.badlogic.gdx.graphics.g3d.model.NodeKeyframe;
import com.badlogic.gdx.math.Matrix4;
import com.badlogic.gdx.math.Quaternion;
import com.badlogic.gdx.math.Vector3;
import com.badlogic.gdx.utils.Array;
import com.badlogic.gdx.utils.GdxRuntimeException;
import com.badlogic.gdx.utils.ObjectMap;
import com.badlogic.gdx.utils.Pool;

/* JADX INFO: loaded from: classes.dex */
public class BaseAnimationController {
    public final ModelInstance target;
    private static final ObjectMap<Node, Transform> transforms = new ObjectMap<>();
    private static final Transform tmpT = new Transform();
    private final Pool<Transform> transformPool = new Pool<Transform>() { // from class: com.badlogic.gdx.graphics.g3d.utils.BaseAnimationController.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.badlogic.gdx.utils.Pool
        public Transform newObject() {
            return new Transform();
        }
    };
    private boolean applying = false;

    public static final class Transform implements Pool.Poolable {
        public final Vector3 translation = new Vector3();
        public final Quaternion rotation = new Quaternion();
        public final Vector3 scale = new Vector3(1.0f, 1.0f, 1.0f);

        public Transform idt() {
            this.translation.set(0.0f, 0.0f, 0.0f);
            this.rotation.idt();
            this.scale.set(1.0f, 1.0f, 1.0f);
            return this;
        }

        public Transform lerp(Transform transform, float f) {
            return lerp(transform.translation, transform.rotation, transform.scale, f);
        }

        @Override // com.badlogic.gdx.utils.Pool.Poolable
        public void reset() {
            idt();
        }

        public Transform set(Vector3 vector3, Quaternion quaternion, Vector3 vector4) {
            this.translation.set(vector3);
            this.rotation.set(quaternion);
            this.scale.set(vector4);
            return this;
        }

        public Matrix4 toMatrix4(Matrix4 matrix4) {
            return matrix4.set(this.translation, this.rotation, this.scale);
        }

        public String toString() {
            return this.translation.toString() + " - " + this.rotation.toString() + " - " + this.scale.toString();
        }

        public Transform lerp(Vector3 vector3, Quaternion quaternion, Vector3 vector4, float f) {
            this.translation.lerp(vector3, f);
            this.rotation.slerp(quaternion, f);
            this.scale.lerp(vector4, f);
            return this;
        }

        public Transform set(Transform transform) {
            return set(transform.translation, transform.rotation, transform.scale);
        }
    }

    public BaseAnimationController(ModelInstance modelInstance) {
        this.target = modelInstance;
    }

    private static final void applyNodeAnimationBlending(NodeAnimation nodeAnimation, ObjectMap<Node, Transform> objectMap, Pool<Transform> pool, float f, float f2) {
        Node node = nodeAnimation.node;
        node.isAnimated = true;
        Transform nodeAnimationTransform = getNodeAnimationTransform(nodeAnimation, f2);
        Transform transform = objectMap.get(node, null);
        if (transform != null) {
            if (f > 0.999999f) {
                transform.set(nodeAnimationTransform);
                return;
            } else {
                transform.lerp(nodeAnimationTransform, f);
                return;
            }
        }
        if (f > 0.999999f) {
            objectMap.put(node, pool.obtain().set(nodeAnimationTransform));
        } else {
            objectMap.put(node, pool.obtain().set(node.translation, node.rotation, node.scale).lerp(nodeAnimationTransform, f));
        }
    }

    private static final void applyNodeAnimationDirectly(NodeAnimation nodeAnimation, float f) {
        Node node = nodeAnimation.node;
        node.isAnimated = true;
        getNodeAnimationTransform(nodeAnimation, f).toMatrix4(node.localTransform);
    }

    public static final <T> int getFirstKeyframeIndexAtTime(Array<NodeKeyframe<T>> array, float f) {
        int i = array.size - 1;
        int i2 = 0;
        if (i > 0 && f >= array.get(0).keytime && f <= array.get(i).keytime) {
            while (i2 < i) {
                int i3 = (i2 + i) / 2;
                int i4 = i3 + 1;
                if (f > array.get(i4).keytime) {
                    i2 = i4;
                } else {
                    if (f >= array.get(i3).keytime) {
                        return i3;
                    }
                    i = i3 - 1;
                }
            }
        }
        return i2;
    }

    private static final Transform getNodeAnimationTransform(NodeAnimation nodeAnimation, float f) {
        Transform transform = tmpT;
        getTranslationAtTime(nodeAnimation, f, transform.translation);
        getRotationAtTime(nodeAnimation, f, transform.rotation);
        getScalingAtTime(nodeAnimation, f, transform.scale);
        return transform;
    }

    private static final Quaternion getRotationAtTime(NodeAnimation nodeAnimation, float f, Quaternion quaternion) {
        Array<NodeKeyframe<Quaternion>> array = nodeAnimation.rotation;
        if (array == null) {
            return quaternion.set(nodeAnimation.node.rotation);
        }
        if (array.size == 1) {
            return quaternion.set(array.get(0).value);
        }
        int firstKeyframeIndexAtTime = getFirstKeyframeIndexAtTime(array, f);
        NodeKeyframe<Quaternion> nodeKeyframe = nodeAnimation.rotation.get(firstKeyframeIndexAtTime);
        quaternion.set(nodeKeyframe.value);
        int i = firstKeyframeIndexAtTime + 1;
        Array<NodeKeyframe<Quaternion>> array2 = nodeAnimation.rotation;
        if (i < array2.size) {
            NodeKeyframe<Quaternion> nodeKeyframe2 = array2.get(i);
            float f2 = nodeKeyframe.keytime;
            quaternion.slerp(nodeKeyframe2.value, (f - f2) / (nodeKeyframe2.keytime - f2));
        }
        return quaternion;
    }

    private static final Vector3 getScalingAtTime(NodeAnimation nodeAnimation, float f, Vector3 vector3) {
        Array<NodeKeyframe<Vector3>> array = nodeAnimation.scaling;
        if (array == null) {
            return vector3.set(nodeAnimation.node.scale);
        }
        if (array.size == 1) {
            return vector3.set(array.get(0).value);
        }
        int firstKeyframeIndexAtTime = getFirstKeyframeIndexAtTime(array, f);
        NodeKeyframe<Vector3> nodeKeyframe = nodeAnimation.scaling.get(firstKeyframeIndexAtTime);
        vector3.set(nodeKeyframe.value);
        int i = firstKeyframeIndexAtTime + 1;
        Array<NodeKeyframe<Vector3>> array2 = nodeAnimation.scaling;
        if (i < array2.size) {
            NodeKeyframe<Vector3> nodeKeyframe2 = array2.get(i);
            float f2 = nodeKeyframe.keytime;
            vector3.lerp(nodeKeyframe2.value, (f - f2) / (nodeKeyframe2.keytime - f2));
        }
        return vector3;
    }

    private static final Vector3 getTranslationAtTime(NodeAnimation nodeAnimation, float f, Vector3 vector3) {
        Array<NodeKeyframe<Vector3>> array = nodeAnimation.translation;
        if (array == null) {
            return vector3.set(nodeAnimation.node.translation);
        }
        if (array.size == 1) {
            return vector3.set(array.get(0).value);
        }
        int firstKeyframeIndexAtTime = getFirstKeyframeIndexAtTime(array, f);
        NodeKeyframe<Vector3> nodeKeyframe = nodeAnimation.translation.get(firstKeyframeIndexAtTime);
        vector3.set(nodeKeyframe.value);
        int i = firstKeyframeIndexAtTime + 1;
        Array<NodeKeyframe<Vector3>> array2 = nodeAnimation.translation;
        if (i < array2.size) {
            NodeKeyframe<Vector3> nodeKeyframe2 = array2.get(i);
            float f2 = nodeKeyframe.keytime;
            vector3.lerp(nodeKeyframe2.value, (f - f2) / (nodeKeyframe2.keytime - f2));
        }
        return vector3;
    }

    public void apply(Animation animation, float f, float f2) {
        if (!this.applying) {
            throw new GdxRuntimeException("You must call begin() before adding an animation");
        }
        applyAnimation(transforms, this.transformPool, f2, animation, f);
    }

    public void applyAnimation(Animation animation, float f) {
        if (this.applying) {
            throw new GdxRuntimeException("Call end() first");
        }
        applyAnimation(null, null, 1.0f, animation, f);
        this.target.calculateTransforms();
    }

    public void applyAnimations(Animation animation, float f, Animation animation2, float f2, float f3) {
        if (animation2 == null || f3 == 0.0f) {
            applyAnimation(animation, f);
            return;
        }
        if (animation == null || f3 == 1.0f) {
            applyAnimation(animation2, f2);
        } else {
            if (this.applying) {
                throw new GdxRuntimeException("Call end() first");
            }
            begin();
            apply(animation, f, 1.0f);
            apply(animation2, f2, f3);
            end();
        }
    }

    public void begin() {
        if (this.applying) {
            throw new GdxRuntimeException("You must call end() after each call to being()");
        }
        this.applying = true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void end() {
        if (!this.applying) {
            throw new GdxRuntimeException("You must call begin() first");
        }
        ObjectMap.Entries<Node, Transform> it = transforms.entries().iterator();
        while (it.hasNext()) {
            ObjectMap.Entry next = it.next();
            ((Transform) next.value).toMatrix4(((Node) next.key).localTransform);
            this.transformPool.free((Transform) next.value);
        }
        transforms.clear();
        this.target.calculateTransforms();
        this.applying = false;
    }

    public void removeAnimation(Animation animation) {
        Array.ArrayIterator<NodeAnimation> it = animation.nodeAnimations.iterator();
        while (it.hasNext()) {
            it.next().node.isAnimated = false;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void applyAnimation(ObjectMap<Node, Transform> objectMap, Pool<Transform> pool, float f, Animation animation, float f2) {
        if (objectMap == null) {
            Array.ArrayIterator<NodeAnimation> it = animation.nodeAnimations.iterator();
            while (it.hasNext()) {
                applyNodeAnimationDirectly(it.next(), f2);
            }
            return;
        }
        ObjectMap.Keys<Node> it2 = objectMap.keys().iterator();
        while (it2.hasNext()) {
            it2.next().isAnimated = false;
        }
        Array.ArrayIterator<NodeAnimation> it3 = animation.nodeAnimations.iterator();
        while (it3.hasNext()) {
            applyNodeAnimationBlending(it3.next(), objectMap, pool, f, f2);
        }
        ObjectMap.Entries<Node, Transform> it4 = objectMap.entries().iterator();
        while (it4.hasNext()) {
            ObjectMap.Entry next = it4.next();
            K k = next.key;
            if (!((Node) k).isAnimated) {
                ((Node) k).isAnimated = true;
                ((Transform) next.value).lerp(((Node) k).translation, ((Node) k).rotation, ((Node) k).scale, f);
            }
        }
    }
}
