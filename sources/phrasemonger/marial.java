package phrasemonger;

import android.util.Property;
import android.view.ViewGroup;

/* JADX INFO: compiled from: ChildrenAlphaProperty.java */
/* JADX INFO: loaded from: classes3.dex */
public class marial extends Property<ViewGroup, Float> {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public static final Property<ViewGroup, Float> f35306attabal = new marial("childrenAlpha");

    public marial(String str) {
        super(Float.class, str);
    }

    @Override // android.util.Property
    /* JADX INFO: renamed from: attabal, reason: merged with bridge method [inline-methods] */
    public Float get(ViewGroup viewGroup) {
        Float f = (Float) viewGroup.getTag(bubbles.competently.mtrl_internal_children_alpha_tag);
        return f != null ? f : Float.valueOf(1.0f);
    }

    @Override // android.util.Property
    /* JADX INFO: renamed from: saneness, reason: merged with bridge method [inline-methods] */
    public void set(ViewGroup viewGroup, Float f) {
        float fFloatValue = f.floatValue();
        viewGroup.setTag(bubbles.competently.mtrl_internal_children_alpha_tag, f);
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            viewGroup.getChildAt(i).setAlpha(fFloatValue);
        }
    }
}
