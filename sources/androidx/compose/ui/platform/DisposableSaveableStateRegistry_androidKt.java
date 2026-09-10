package androidx.compose.ui.platform;

import android.os.Binder;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Size;
import android.util.SizeF;
import android.util.SparseArray;
import android.view.View;
import androidx.compose.runtime.liable;
import com.mbridge.msdk.MBridgeConstans;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p002kotlin.Metadata;
import p002kotlin.Unit;
import p002kotlin.jvm.functions.Function0;
import p002kotlin.jvm.functions.Function1;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: DisposableSaveableStateRegistry.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u001f\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u001f\u0010\n\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\n\u0010\u000b\u001a\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010\u001a)\u0010\u0014\u001a\u0018\u0012\u0004\u0012\u00020\u0007\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\u0013\u0018\u00010\u0012*\u00020\u0011H\u0002¢\u0006\u0004\b\u0014\u0010\u0015\u001a'\u0010\u0016\u001a\u00020\u0011*\u0016\u0012\u0004\u0012\u00020\u0007\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\u00130\u0012H\u0002¢\u0006\u0004\b\u0016\u0010\u0017\"\"\u0010\u001c\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\f0\u00190\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, d2 = {"Landroid/view/View;", MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW, "Linrooted/taiyuan;", "owner", "Landroidx/compose/ui/platform/mathsort;", "saneness", "(Landroid/view/View;Linrooted/taiyuan;)Landroidx/compose/ui/platform/mathsort;", "", "id", "savedStateRegistryOwner", "dern", "(Ljava/lang/String;Linrooted/taiyuan;)Landroidx/compose/ui/platform/mathsort;", "", "value", "", "beachfront", "(Ljava/lang/Object;)Z", "Landroid/os/Bundle;", "", "", "impromptu", "(Landroid/os/Bundle;)Ljava/util/Map;", "competently", "(Ljava/util/Map;)Landroid/os/Bundle;", "", "Ljava/lang/Class;", "attabal", "[Ljava/lang/Class;", "AcceptableClasses", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class DisposableSaveableStateRegistry_androidKt {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public static final Class<? extends Object>[] f7301attabal = {Serializable.class, Parcelable.class, String.class, SparseArray.class, Binder.class, Size.class, SizeF.class};

    public static final boolean beachfront(Object obj) {
        if (obj instanceof androidx.compose.runtime.snapshots.dovishness) {
            androidx.compose.runtime.snapshots.dovishness dovishnessVar = (androidx.compose.runtime.snapshots.dovishness) obj;
            if (dovishnessVar.attabal() != liable.marial() && dovishnessVar.attabal() != liable.competently() && dovishnessVar.attabal() != liable.beachfront()) {
                return false;
            }
            T value = dovishnessVar.getValue();
            if (value == 0) {
                return true;
            }
            return beachfront(value);
        }
        if ((obj instanceof patroclinal.beachfront) && (obj instanceof Serializable)) {
            return false;
        }
        for (Class<? extends Object> cls : f7301attabal) {
            if (cls.isInstance(obj)) {
                return true;
            }
        }
        return false;
    }

    public static final Bundle competently(Map<String, ? extends List<? extends Object>> map) {
        Bundle bundle = new Bundle();
        for (Map.Entry<String, ? extends List<? extends Object>> entry : map.entrySet()) {
            String key = entry.getKey();
            List<? extends Object> value = entry.getValue();
            bundle.putParcelableArrayList(key, value instanceof ArrayList ? (ArrayList) value : new ArrayList<>(value));
        }
        return bundle;
    }

    public static final mathsort dern(String str, inrooted.taiyuan taiyuanVar) {
        final boolean z;
        final String str2 = stratoscope.saneness.class.getSimpleName() + ':' + str;
        final inrooted.beachfront savedStateRegistry = taiyuanVar.getSavedStateRegistry();
        Bundle bundleAttabal = savedStateRegistry.attabal(str2);
        final stratoscope.saneness sanenessVarDern = stratoscope.marial.dern(bundleAttabal != null ? impromptu(bundleAttabal) : null, new Function1<Object, Boolean>() { // from class: androidx.compose.ui.platform.DisposableSaveableStateRegistry_androidKt$DisposableSaveableStateRegistry$saveableStateRegistry$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p002kotlin.jvm.functions.Function1
            public final Boolean invoke(Object obj) {
                return Boolean.valueOf(DisposableSaveableStateRegistry_androidKt.beachfront(obj));
            }
        });
        try {
            savedStateRegistry.dern(str2, new inrooted.beachfront.saneness() { // from class: androidx.compose.ui.platform.splinterproof
                @Override // inrooted.beachfront.saneness
                public final Bundle attabal() {
                    return DisposableSaveableStateRegistry_androidKt.wireman(sanenessVarDern);
                }
            });
            z = true;
        } catch (IllegalArgumentException unused) {
            z = false;
        }
        return new mathsort(sanenessVarDern, new Function0<Unit>() { // from class: androidx.compose.ui.platform.DisposableSaveableStateRegistry_androidKt$DisposableSaveableStateRegistry$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // p002kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.f29295attabal;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                if (z) {
                    savedStateRegistry.marial(str2);
                }
            }
        });
    }

    public static final Map<String, List<Object>> impromptu(Bundle bundle) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (String str : bundle.keySet()) {
            ArrayList parcelableArrayList = bundle.getParcelableArrayList(str);
            Intrinsics.competently(parcelableArrayList, "null cannot be cast to non-null type java.util.ArrayList<kotlin.Any?>{ kotlin.collections.TypeAliasesKt.ArrayList<kotlin.Any?> }");
            linkedHashMap.put(str, parcelableArrayList);
        }
        return linkedHashMap;
    }

    public static final mathsort saneness(View view, inrooted.taiyuan taiyuanVar) {
        Object parent = view.getParent();
        Intrinsics.competently(parent, "null cannot be cast to non-null type android.view.View");
        View view2 = (View) parent;
        Object tag = view2.getTag(yemenite.wireman.compose_view_saveable_id_tag);
        String strValueOf = tag instanceof String ? (String) tag : null;
        if (strValueOf == null) {
            strValueOf = String.valueOf(view2.getId());
        }
        return dern(strValueOf, taiyuanVar);
    }

    public static final Bundle wireman(stratoscope.saneness sanenessVar) {
        return competently(sanenessVar.attabal());
    }
}
