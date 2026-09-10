package pruinose;

import android.os.Bundle;
import claque.wireman;
import com.google.android.gms.ads.RequestConfiguration;
import com.ironsource.X3;
import inrooted.beachfront;
import inrooted.cutely;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlinx.coroutines.flow.formularize;
import p002kotlin.Metadata;
import p002kotlin.Pair;
import p002kotlin.collections.seminary;
import p002kotlin.jvm.internal.DefaultConstructorMarker;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: SavedStateHandleImpl.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0016\b\u0002\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J(\u0010\u000b\u001a\u00020\n\"\u0004\b\u0000\u0010\u00072\u0006\u0010\b\u001a\u00020\u00032\b\u0010\t\u001a\u0004\u0018\u00018\u0000H\u0087\u0002¢\u0006\u0004\b\u000b\u0010\fR%\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00010\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R \u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00130\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u000fR(\u0010\u0018\u001a\u0016\u0012\u0004\u0012\u00020\u0003\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00160\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u000fR+\u0010\u001a\u001a\u0016\u0012\u0004\u0012\u00020\u0003\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00160\r8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u000f\u001a\u0004\b\u0019\u0010\u0011R\u0017\u0010\u001e\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u0014\u0010\u001d¨\u0006\u001f"}, d2 = {"Lpruinose/saneness;", "", "", "", "initialState", "<init>", "(Ljava/util/Map;)V", RequestConfiguration.MAX_AD_CONTENT_RATING_T, X3.i.W, "value", "", "wireman", "(Ljava/lang/String;Ljava/lang/Object;)V", "", "attabal", "Ljava/util/Map;", "getRegular", "()Ljava/util/Map;", "regular", "Linrooted/beachfront$saneness;", "saneness", "providers", "Lkotlinx/coroutines/flow/formularize;", "dern", "flows", "getMutableFlows", "mutableFlows", "marial", "Linrooted/beachfront$saneness;", "()Linrooted/beachfront$saneness;", "savedStateProvider", "lifecycle-viewmodel-savedstate"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class saneness {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name and from kotlin metadata */
    public final Map<String, Object> regular;

    /* JADX INFO: renamed from: dern, reason: collision with root package name and from kotlin metadata */
    public final Map<String, formularize<Object>> flows;

    /* JADX INFO: renamed from: marial, reason: collision with root package name and from kotlin metadata */
    public final beachfront.saneness savedStateProvider;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name and from kotlin metadata */
    public final Map<String, beachfront.saneness> providers;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name and from kotlin metadata */
    public final Map<String, formularize<Object>> mutableFlows;

    public saneness(Map<String, ? extends Object> initialState) {
        Intrinsics.checkNotNullParameter(initialState, "initialState");
        this.regular = seminary.stratoscope(initialState);
        this.providers = new LinkedHashMap();
        this.flows = new LinkedHashMap();
        this.mutableFlows = new LinkedHashMap();
        this.savedStateProvider = new beachfront.saneness() { // from class: pruinose.attabal
            @Override // inrooted.beachfront.saneness
            public final Bundle attabal() {
                return saneness.dern(this.f36002attabal);
            }
        };
    }

    public static final Bundle dern(saneness sanenessVar) {
        Pair[] pairArr;
        for (Map.Entry entry : seminary.rotuma(sanenessVar.mutableFlows).entrySet()) {
            sanenessVar.wireman((String) entry.getKey(), ((formularize) entry.getValue()).getValue());
        }
        for (Map.Entry entry2 : seminary.rotuma(sanenessVar.providers).entrySet()) {
            sanenessVar.wireman((String) entry2.getKey(), ((beachfront.saneness) entry2.getValue()).attabal());
        }
        Map<String, Object> map = sanenessVar.regular;
        if (map.isEmpty()) {
            pairArr = new Pair[0];
        } else {
            ArrayList arrayList = new ArrayList(map.size());
            for (Map.Entry<String, Object> entry3 : map.entrySet()) {
                arrayList.add(patroclinal.formularize.attabal(entry3.getKey(), entry3.getValue()));
            }
            pairArr = (Pair[]) arrayList.toArray(new Pair[0]);
        }
        Bundle bundleAttabal = wireman.attabal((Pair[]) Arrays.copyOf(pairArr, pairArr.length));
        cutely.attabal(bundleAttabal);
        return bundleAttabal;
    }

    /* JADX INFO: renamed from: saneness, reason: from getter */
    public final beachfront.saneness getSavedStateProvider() {
        return this.savedStateProvider;
    }

    public final <T> void wireman(String key, T value) {
        Intrinsics.checkNotNullParameter(key, "key");
        this.regular.put(key, value);
        formularize<Object> formularizeVar = this.flows.get(key);
        if (formularizeVar != null) {
            formularizeVar.setValue(value);
        }
        formularize<Object> formularizeVar2 = this.mutableFlows.get(key);
        if (formularizeVar2 != null) {
            formularizeVar2.setValue(value);
        }
    }

    public /* synthetic */ saneness(Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? seminary.taiyuan() : map);
    }
}
