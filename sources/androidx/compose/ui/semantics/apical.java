package androidx.compose.ui.semantics;

import androidx.compose.ui.platform.permissivist;
import com.google.android.gms.ads.RequestConfiguration;
import com.ironsource.C3414a2;
import com.ironsource.X3;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import p002kotlin.Metadata;
import p002kotlin.jvm.functions.Function0;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: SemanticsConfiguration.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0002\u0010&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010(\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u00012\u001a\u0012\u0016\u0012\u0014\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00030\u0002B\u0007¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\n\u001a\u00028\u0000\"\u0004\b\u0000\u0010\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0086\u0002¢\u0006\u0004\b\n\u0010\u000bJ/\u0010\u000e\u001a\u00028\u0000\"\u0004\b\u0000\u0010\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\f¢\u0006\u0004\b\u000e\u0010\u000fJ3\u0010\u0010\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042\u000e\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\f¢\u0006\u0004\b\u0010\u0010\u000fJ(\u0010\u0012\u001a\u001a\u0012\u0016\u0012\u0014\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00030\u0011H\u0096\u0002¢\u0006\u0004\b\u0012\u0010\u0013J,\u0010\u0016\u001a\u00020\u0015\"\u0004\b\u0000\u0010\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042\u0006\u0010\u0014\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u0016\u0010\u0017J$\u0010\u0019\u001a\u00020\u0018\"\u0004\b\u0000\u0010\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0086\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u0018H\u0000¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001e\u001a\u00020\u00152\u0006\u0010\u001d\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010!\u001a\u00020\u00152\u0006\u0010 \u001a\u00020\u0000H\u0000¢\u0006\u0004\b!\u0010\u001fJ\r\u0010\"\u001a\u00020\u0000¢\u0006\u0004\b\"\u0010#J\u001a\u0010%\u001a\u00020\u00182\b\u0010$\u001a\u0004\u0018\u00010\u0005H\u0096\u0002¢\u0006\u0004\b%\u0010&J\u000f\u0010(\u001a\u00020'H\u0016¢\u0006\u0004\b(\u0010)J\u000f\u0010+\u001a\u00020*H\u0016¢\u0006\u0004\b+\u0010,R&\u0010/\u001a\u0014\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010.R\"\u00105\u001a\u00020\u00188\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b0\u00101\u001a\u0004\b2\u0010\u001c\"\u0004\b3\u00104R\"\u00107\u001a\u00020\u00188\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b3\u00101\u001a\u0004\b6\u0010\u001c\"\u0004\b0\u00104¨\u00068"}, d2 = {"Landroidx/compose/ui/semantics/apical;", "Landroidx/compose/ui/semantics/monoploid;", "", "", "Landroidx/compose/ui/semantics/SemanticsPropertyKey;", "", "<init>", "()V", RequestConfiguration.MAX_AD_CONTENT_RATING_T, X3.i.W, "impromptu", "(Landroidx/compose/ui/semantics/SemanticsPropertyKey;)Ljava/lang/Object;", "Lkotlin/Function0;", "defaultValue", "taiyuan", "(Landroidx/compose/ui/semantics/SemanticsPropertyKey;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "cutely", "", "iterator", "()Ljava/util/Iterator;", "value", "", "saneness", "(Landroidx/compose/ui/semantics/SemanticsPropertyKey;Ljava/lang/Object;)V", "", "marial", "(Landroidx/compose/ui/semantics/SemanticsPropertyKey;)Z", "beachfront", "()Z", "child", "kowloon", "(Landroidx/compose/ui/semantics/apical;)V", "peer", "wireman", "competently", "()Landroidx/compose/ui/semantics/apical;", C3414a2.d, "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "", "Ljava/util/Map;", "props", "arytenoidectomy", "Z", "triweekly", "monoploid", "(Z)V", "isMergingSemanticsOfDescendants", "impassible", "isClearingSemantics", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class apical implements monoploid, Iterable<Map.Entry<? extends SemanticsPropertyKey<?>, ? extends Object>>, unready.attabal {

    /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name and from kotlin metadata */
    public boolean isMergingSemanticsOfDescendants;

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name and from kotlin metadata */
    public final Map<SemanticsPropertyKey<?>, Object> props = new LinkedHashMap();

    /* JADX INFO: renamed from: monoploid, reason: collision with root package name and from kotlin metadata */
    public boolean isClearingSemantics;

    public final void arytenoidectomy(boolean z) {
        this.isClearingSemantics = z;
    }

    public final boolean beachfront() {
        Set<SemanticsPropertyKey<?>> setKeySet = this.props.keySet();
        if ((setKeySet instanceof Collection) && setKeySet.isEmpty()) {
            return false;
        }
        Iterator<T> it = setKeySet.iterator();
        while (it.hasNext()) {
            if (((SemanticsPropertyKey) it.next()).getIsImportantForAccessibility()) {
                return true;
            }
        }
        return false;
    }

    public final apical competently() {
        apical apicalVar = new apical();
        apicalVar.isMergingSemanticsOfDescendants = this.isMergingSemanticsOfDescendants;
        apicalVar.isClearingSemantics = this.isClearingSemantics;
        apicalVar.props.putAll(this.props);
        return apicalVar;
    }

    public final <T> T cutely(SemanticsPropertyKey<T> key, Function0<? extends T> defaultValue) {
        T t = (T) this.props.get(key);
        return t == null ? defaultValue.invoke() : t;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof apical)) {
            return false;
        }
        apical apicalVar = (apical) other;
        return Intrinsics.wireman(this.props, apicalVar.props) && this.isMergingSemanticsOfDescendants == apicalVar.isMergingSemanticsOfDescendants && this.isClearingSemantics == apicalVar.isClearingSemantics;
    }

    public int hashCode() {
        return (((this.props.hashCode() * 31) + Boolean.hashCode(this.isMergingSemanticsOfDescendants)) * 31) + Boolean.hashCode(this.isClearingSemantics);
    }

    /* JADX INFO: renamed from: impassible, reason: from getter */
    public final boolean getIsClearingSemantics() {
        return this.isClearingSemantics;
    }

    public final <T> T impromptu(SemanticsPropertyKey<T> key) {
        T t = (T) this.props.get(key);
        if (t != null) {
            return t;
        }
        throw new IllegalStateException("Key not present: " + key + " - consider getOrElse or getOrNull");
    }

    @Override // java.lang.Iterable
    public Iterator<Map.Entry<? extends SemanticsPropertyKey<?>, ? extends Object>> iterator() {
        return this.props.entrySet().iterator();
    }

    public final void kowloon(apical child) {
        for (Map.Entry<SemanticsPropertyKey<?>, Object> entry : child.props.entrySet()) {
            SemanticsPropertyKey<?> key = entry.getKey();
            Object value = entry.getValue();
            Object obj = this.props.get(key);
            Intrinsics.competently(key, "null cannot be cast to non-null type androidx.compose.ui.semantics.SemanticsPropertyKey<kotlin.Any?>");
            Object objDern = key.dern(obj, value);
            if (objDern != null) {
                this.props.put(key, objDern);
            }
        }
    }

    public final <T> boolean marial(SemanticsPropertyKey<T> key) {
        return this.props.containsKey(key);
    }

    public final void monoploid(boolean z) {
        this.isMergingSemanticsOfDescendants = z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.compose.ui.semantics.monoploid
    public <T> void saneness(SemanticsPropertyKey<T> key, T value) {
        if (!(value instanceof AccessibilityAction) || !marial(key)) {
            this.props.put(key, value);
            return;
        }
        Object obj = this.props.get(key);
        Intrinsics.competently(obj, "null cannot be cast to non-null type androidx.compose.ui.semantics.AccessibilityAction<*>");
        AccessibilityAction accessibilityAction = (AccessibilityAction) obj;
        Map<SemanticsPropertyKey<?>, Object> map = this.props;
        AccessibilityAction accessibilityAction2 = (AccessibilityAction) value;
        String label = accessibilityAction2.getLabel();
        if (label == null) {
            label = accessibilityAction.getLabel();
        }
        patroclinal.beachfront beachfrontVarAttabal = accessibilityAction2.attabal();
        if (beachfrontVarAttabal == null) {
            beachfrontVarAttabal = accessibilityAction.attabal();
        }
        map.put(key, new AccessibilityAction(label, beachfrontVarAttabal));
    }

    public final <T> T taiyuan(SemanticsPropertyKey<T> key, Function0<? extends T> defaultValue) {
        T t = (T) this.props.get(key);
        return t == null ? defaultValue.invoke() : t;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        String str = "";
        if (this.isMergingSemanticsOfDescendants) {
            sb.append("");
            sb.append("mergeDescendants=true");
            str = ", ";
        }
        if (this.isClearingSemantics) {
            sb.append(str);
            sb.append("isClearingSemantics=true");
            str = ", ";
        }
        for (Map.Entry<SemanticsPropertyKey<?>, Object> entry : this.props.entrySet()) {
            SemanticsPropertyKey<?> key = entry.getKey();
            Object value = entry.getValue();
            sb.append(str);
            sb.append(key.getName());
            sb.append(" : ");
            sb.append(value);
            str = ", ";
        }
        return permissivist.attabal(this, null) + "{ " + ((Object) sb) + " }";
    }

    /* JADX INFO: renamed from: triweekly, reason: from getter */
    public final boolean getIsMergingSemanticsOfDescendants() {
        return this.isMergingSemanticsOfDescendants;
    }

    public final void wireman(apical peer) {
        if (peer.isMergingSemanticsOfDescendants) {
            this.isMergingSemanticsOfDescendants = true;
        }
        if (peer.isClearingSemantics) {
            this.isClearingSemantics = true;
        }
        for (Map.Entry<SemanticsPropertyKey<?>, Object> entry : peer.props.entrySet()) {
            SemanticsPropertyKey<?> key = entry.getKey();
            Object value = entry.getValue();
            if (!this.props.containsKey(key)) {
                this.props.put(key, value);
            } else if (value instanceof AccessibilityAction) {
                Object obj = this.props.get(key);
                Intrinsics.competently(obj, "null cannot be cast to non-null type androidx.compose.ui.semantics.AccessibilityAction<*>");
                AccessibilityAction accessibilityAction = (AccessibilityAction) obj;
                Map<SemanticsPropertyKey<?>, Object> map = this.props;
                String label = accessibilityAction.getLabel();
                if (label == null) {
                    label = ((AccessibilityAction) value).getLabel();
                }
                patroclinal.beachfront beachfrontVarAttabal = accessibilityAction.attabal();
                if (beachfrontVarAttabal == null) {
                    beachfrontVarAttabal = ((AccessibilityAction) value).attabal();
                }
                map.put(key, new AccessibilityAction(label, beachfrontVarAttabal));
            }
        }
    }
}
