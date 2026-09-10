package phrasemonger;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.Property;
import androidx.collection.splinterproof;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: MotionSpec.java */
/* JADX INFO: loaded from: classes3.dex */
public class taiyuan {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final splinterproof<String, cutely> f35312attabal = new splinterproof<>();

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final splinterproof<String, PropertyValuesHolder[]> f35313saneness = new splinterproof<>();

    public static void attabal(taiyuan taiyuanVar, Animator animator) {
        if (animator instanceof ObjectAnimator) {
            ObjectAnimator objectAnimator = (ObjectAnimator) animator;
            taiyuanVar.formularize(objectAnimator.getPropertyName(), objectAnimator.getValues());
            taiyuanVar.impassible(objectAnimator.getPropertyName(), cutely.saneness(objectAnimator));
        } else {
            throw new IllegalArgumentException("Animator must be an ObjectAnimator: " + animator);
        }
    }

    public static taiyuan dern(Context context, TypedArray typedArray, int i) {
        int resourceId;
        if (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0) {
            return null;
        }
        return wireman(context, resourceId);
    }

    public static taiyuan marial(List<Animator> list) {
        taiyuan taiyuanVar = new taiyuan();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            attabal(taiyuanVar, list.get(i));
        }
        return taiyuanVar;
    }

    public static taiyuan wireman(Context context, int i) {
        try {
            Animator animatorLoadAnimator = AnimatorInflater.loadAnimator(context, i);
            if (animatorLoadAnimator instanceof AnimatorSet) {
                return marial(((AnimatorSet) animatorLoadAnimator).getChildAnimations());
            }
            if (animatorLoadAnimator == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(animatorLoadAnimator);
            return marial(arrayList);
        } catch (Exception unused) {
            Integer.toHexString(i);
            return null;
        }
    }

    public boolean apical(String str) {
        return this.f35312attabal.get(str) != null;
    }

    public <T> ObjectAnimator beachfront(String str, T t, Property<T, ?> property) {
        ObjectAnimator objectAnimatorOfPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(t, competently(str));
        objectAnimatorOfPropertyValuesHolder.setProperty(property);
        impromptu(str).attabal(objectAnimatorOfPropertyValuesHolder);
        return objectAnimatorOfPropertyValuesHolder;
    }

    public PropertyValuesHolder[] competently(String str) {
        if (cutely(str)) {
            return saneness(this.f35313saneness.get(str));
        }
        throw new IllegalArgumentException();
    }

    public boolean cutely(String str) {
        return this.f35313saneness.get(str) != null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof taiyuan) {
            return this.f35312attabal.equals(((taiyuan) obj).f35312attabal);
        }
        return false;
    }

    public void formularize(String str, PropertyValuesHolder[] propertyValuesHolderArr) {
        this.f35313saneness.put(str, propertyValuesHolderArr);
    }

    public int hashCode() {
        return this.f35312attabal.hashCode();
    }

    public void impassible(String str, cutely cutelyVar) {
        this.f35312attabal.put(str, cutelyVar);
    }

    public cutely impromptu(String str) {
        if (apical(str)) {
            return this.f35312attabal.get(str);
        }
        throw new IllegalArgumentException();
    }

    public final PropertyValuesHolder[] saneness(PropertyValuesHolder[] propertyValuesHolderArr) {
        PropertyValuesHolder[] propertyValuesHolderArr2 = new PropertyValuesHolder[propertyValuesHolderArr.length];
        for (int i = 0; i < propertyValuesHolderArr.length; i++) {
            propertyValuesHolderArr2[i] = propertyValuesHolderArr[i].clone();
        }
        return propertyValuesHolderArr2;
    }

    public long taiyuan() {
        int size = this.f35312attabal.getSize();
        long jMax = 0;
        for (int i = 0; i < size; i++) {
            cutely cutelyVarFormularize = this.f35312attabal.formularize(i);
            jMax = Math.max(jMax, cutelyVarFormularize.dern() + cutelyVarFormularize.wireman());
        }
        return jMax;
    }

    public String toString() {
        return '\n' + getClass().getName() + '{' + Integer.toHexString(System.identityHashCode(this)) + " timings: " + this.f35312attabal + "}\n";
    }
}
