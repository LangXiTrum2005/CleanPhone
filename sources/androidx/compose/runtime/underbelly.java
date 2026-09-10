package androidx.compose.runtime;

import androidx.collection.ObjectList;
import com.ironsource.X3;
import p002kotlin.Metadata;
import p002kotlin.jvm.functions.Function1;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Recomposer.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\t\u001a\u00020\b2\u000e\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\r\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\u0003J\u001f\u0010\r\u001a\u0004\u0018\u00010\u00062\u000e\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0004¢\u0006\u0004\b\r\u0010\u000eJ \u0010\u0010\u001a\u00020\u000f2\u000e\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0004H\u0086\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015R(\u0010\u0019\u001a\u0016\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0004\u0012\u0004\u0012\u00020\u00060\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R(\u0010\u001a\u001a\u0016\u0012\u0004\u0012\u00020\u0012\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00040\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0018¨\u0006\u001b"}, d2 = {"Landroidx/compose/runtime/underbelly;", "", "<init>", "()V", "Landroidx/compose/runtime/itchy;", "content", "Landroidx/compose/runtime/preterite;", "nestedContent", "", "saneness", "(Landroidx/compose/runtime/itchy;Landroidx/compose/runtime/preterite;)V", "dern", X3.i.W, "marial", "(Landroidx/compose/runtime/itchy;)Landroidx/compose/runtime/preterite;", "", "wireman", "(Landroidx/compose/runtime/itchy;)Z", "Landroidx/compose/runtime/nosophobia;", "reference", "beachfront", "(Landroidx/compose/runtime/nosophobia;)V", "Landroidx/compose/runtime/collection/saneness;", "attabal", "Landroidx/collection/grimness;", "contentMap", "containerMap", "runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class underbelly {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name and from kotlin metadata */
    public final androidx.collection.grimness<Object, Object> contentMap = androidx.compose.runtime.collection.saneness.marial(null, 1, null);

    /* JADX INFO: renamed from: saneness, reason: collision with root package name and from kotlin metadata */
    public final androidx.collection.grimness<Object, Object> containerMap = androidx.compose.runtime.collection.saneness.marial(null, 1, null);

    public static final boolean competently(nosophobia nosophobiaVar, preterite preteriteVar) {
        return Intrinsics.wireman(preteriteVar.getContainer(), nosophobiaVar);
    }

    public final void beachfront(final nosophobia reference) {
        Object objDern = this.containerMap.dern(reference);
        if (objDern != null) {
            if (!(objDern instanceof androidx.collection.seminary)) {
                Intrinsics.competently(objDern, "null cannot be cast to non-null type V of androidx.compose.runtime.collection.MultiValueMap");
                androidx.compose.runtime.collection.saneness.triweekly(this.contentMap, (itchy) objDern, new Function1() { // from class: androidx.compose.runtime.sensatory
                    @Override // p002kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return Boolean.valueOf(underbelly.competently(reference, (preterite) obj));
                    }
                });
                return;
            }
            ObjectList objectList = (ObjectList) objDern;
            Object[] objArr = objectList.content;
            int i = objectList._size;
            for (int i2 = 0; i2 < i; i2++) {
                Object obj = objArr[i2];
                Intrinsics.competently(obj, "null cannot be cast to non-null type V of androidx.compose.runtime.collection.MultiValueMap");
                androidx.compose.runtime.collection.saneness.triweekly(this.contentMap, (itchy) obj, new Function1() { // from class: androidx.compose.runtime.sensatory
                    @Override // p002kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return Boolean.valueOf(underbelly.competently(reference, (preterite) obj2));
                    }
                });
            }
        }
    }

    public final void dern() {
        androidx.compose.runtime.collection.saneness.dern(this.contentMap);
        androidx.compose.runtime.collection.saneness.dern(this.containerMap);
    }

    public final preterite marial(itchy<Object> key) {
        preterite preteriteVar = (preterite) androidx.compose.runtime.collection.saneness.impassible(this.contentMap, key);
        if (androidx.compose.runtime.collection.saneness.cutely(this.contentMap)) {
            androidx.compose.runtime.collection.saneness.dern(this.containerMap);
        }
        return preteriteVar;
    }

    public final void saneness(itchy<Object> content, preterite nestedContent) {
        androidx.compose.runtime.collection.saneness.attabal(this.contentMap, content, nestedContent);
        androidx.compose.runtime.collection.saneness.attabal(this.containerMap, nestedContent.getContainer(), content);
    }

    public final boolean wireman(itchy<Object> key) {
        return androidx.compose.runtime.collection.saneness.beachfront(this.contentMap, key);
    }
}
