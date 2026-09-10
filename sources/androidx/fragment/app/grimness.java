package androidx.fragment.app;

import android.view.View;
import com.unity3d.services.ads.adunit.AdUnitActivity;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p002kotlin.Metadata;
import p002kotlin.collections.CollectionsKt;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: FragmentTransition.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010 \n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J)\u0010\u0007\u001a\u0004\u0018\u00010\u0005*\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0006\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\u0007\u0010\bJ3\u0010\f\u001a\u00020\u000b*\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00042\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\t0\u0004H\u0007¢\u0006\u0004\b\f\u0010\rJC\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u00112\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\t0\u00042\u0006\u0010\u0014\u001a\u00020\u0011H\u0007¢\u0006\u0004\b\u0015\u0010\u0016J%\u0010\u001b\u001a\u00020\u000b2\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\t0\u00172\u0006\u0010\u001a\u001a\u00020\u0019H\u0007¢\u0006\u0004\b\u001b\u0010\u001cJ\u0011\u0010\u001e\u001a\u0004\u0018\u00010\u001dH\u0002¢\u0006\u0004\b\u001e\u0010\u001fR\u0016\u0010!\u001a\u0004\u0018\u00010\u001d8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010 R\u0016\u0010\"\u001a\u0004\u0018\u00010\u001d8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010 ¨\u0006#"}, d2 = {"Landroidx/fragment/app/grimness;", "", "<init>", "()V", "Landroidx/collection/attabal;", "", "value", "saneness", "(Landroidx/collection/attabal;Ljava/lang/String;)Ljava/lang/String;", "Landroid/view/View;", "namedViews", "", "wireman", "(Landroidx/collection/attabal;Landroidx/collection/attabal;)V", "Landroidx/fragment/app/Fragment;", "inFragment", "outFragment", "", "isPop", "sharedElements", "isStart", "attabal", "(Landroidx/fragment/app/Fragment;Landroidx/fragment/app/Fragment;ZLandroidx/collection/attabal;Z)V", "", AdUnitActivity.EXTRA_VIEWS, "", "visibility", "marial", "(Ljava/util/List;I)V", "Landroidx/fragment/app/privatdozent;", "dern", "()Landroidx/fragment/app/privatdozent;", "Landroidx/fragment/app/privatdozent;", "PLATFORM_IMPL", "SUPPORT_IMPL", "fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class grimness {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public static final grimness f10320attabal;

    /* JADX INFO: renamed from: dern, reason: collision with root package name and from kotlin metadata */
    public static final privatdozent SUPPORT_IMPL;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name and from kotlin metadata */
    public static final privatdozent PLATFORM_IMPL;

    static {
        grimness grimnessVar = new grimness();
        f10320attabal = grimnessVar;
        PLATFORM_IMPL = new saran();
        SUPPORT_IMPL = grimnessVar.dern();
    }

    public static final void attabal(Fragment inFragment, Fragment outFragment, boolean isPop, androidx.collection.attabal<String, View> sharedElements, boolean isStart) {
        Intrinsics.checkNotNullParameter(inFragment, "inFragment");
        Intrinsics.checkNotNullParameter(outFragment, "outFragment");
        Intrinsics.checkNotNullParameter(sharedElements, "sharedElements");
        igbo.rotuma enterTransitionCallback = isPop ? outFragment.getEnterTransitionCallback() : inFragment.getEnterTransitionCallback();
        if (enterTransitionCallback != null) {
            ArrayList arrayList = new ArrayList(sharedElements.size());
            Iterator<Map.Entry<String, View>> it = sharedElements.entrySet().iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().getValue());
            }
            ArrayList arrayList2 = new ArrayList(sharedElements.size());
            Iterator<Map.Entry<String, View>> it2 = sharedElements.entrySet().iterator();
            while (it2.hasNext()) {
                arrayList2.add(it2.next().getKey());
            }
            if (isStart) {
                enterTransitionCallback.dern(arrayList2, arrayList, null);
            } else {
                enterTransitionCallback.saneness(arrayList2, arrayList, null);
            }
        }
    }

    public static final void marial(List<? extends View> views, int visibility) {
        Intrinsics.checkNotNullParameter(views, "views");
        Iterator<T> it = views.iterator();
        while (it.hasNext()) {
            ((View) it.next()).setVisibility(visibility);
        }
    }

    public static final String saneness(androidx.collection.attabal<String, String> attabalVar, String value) {
        Intrinsics.checkNotNullParameter(attabalVar, "<this>");
        Intrinsics.checkNotNullParameter(value, "value");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, String> entry : attabalVar.entrySet()) {
            if (Intrinsics.wireman(entry.getValue(), value)) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        ArrayList arrayList = new ArrayList(linkedHashMap.size());
        Iterator it = linkedHashMap.entrySet().iterator();
        while (it.hasNext()) {
            arrayList.add((String) ((Map.Entry) it.next()).getKey());
        }
        return (String) CollectionsKt.firstOrNull(arrayList);
    }

    public static final void wireman(androidx.collection.attabal<String, String> attabalVar, androidx.collection.attabal<String, View> namedViews) {
        Intrinsics.checkNotNullParameter(attabalVar, "<this>");
        Intrinsics.checkNotNullParameter(namedViews, "namedViews");
        int size = attabalVar.getSize();
        while (true) {
            size--;
            if (-1 >= size) {
                return;
            }
            if (!namedViews.containsKey(attabalVar.formularize(size))) {
                attabalVar.taiyuan(size);
            }
        }
    }

    public final privatdozent dern() {
        try {
            Intrinsics.competently(androidx.transition.attabal.class, "null cannot be cast to non-null type java.lang.Class<androidx.fragment.app.FragmentTransitionImpl>");
            return (privatdozent) androidx.transition.attabal.class.getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
            return null;
        }
    }
}
