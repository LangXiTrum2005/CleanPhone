package androidx.p001lifecycle;

import android.os.Bundle;
import claque.wireman;
import com.ironsource.X3;
import inrooted.beachfront;
import inrooted.cutely;
import inrooted.dern;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import p002kotlin.Metadata;
import p002kotlin.Pair;
import p002kotlin.collections.seminary;
import p002kotlin.jvm.functions.Function0;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.saneness;
import patroclinal.formularize;
import patroclinal.taiyuan;

/* JADX INFO: compiled from: SavedStateHandleSupport.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0013\u0010\n\u001a\u00060\bj\u0002`\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\r\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\u0011\u001a\n\u0018\u00010\bj\u0004\u0018\u0001`\t2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0013R\u0016\u0010\u0017\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001e\u0010\u0019\u001a\n\u0018\u00010\bj\u0004\u0018\u0001`\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0018R\u001b\u0010\u001e\u001a\u00020\u001a8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001b\u0010\u001d¨\u0006\u001f"}, d2 = {"Landroidx/lifecycle/polder;", "Linrooted/beachfront$saneness;", "Linrooted/beachfront;", "savedStateRegistry", "Landroidx/lifecycle/splinterproof;", "viewModelStoreOwner", "<init>", "(Linrooted/beachfront;Landroidx/lifecycle/splinterproof;)V", "Landroid/os/Bundle;", "Landroidx/savedstate/SavedState;", "attabal", "()Landroid/os/Bundle;", "", "marial", "()V", "", X3.i.W, "dern", "(Ljava/lang/String;)Landroid/os/Bundle;", "Linrooted/beachfront;", "", "saneness", "Z", "restored", "Landroid/os/Bundle;", "restoredState", "Landroidx/lifecycle/seminary;", "wireman", "Lpatroclinal/taiyuan;", "()Landroidx/lifecycle/seminary;", "viewModel", "lifecycle-viewmodel-savedstate"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class polder implements beachfront.saneness {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name and from kotlin metadata */
    public final beachfront savedStateRegistry;

    /* JADX INFO: renamed from: dern, reason: collision with root package name and from kotlin metadata */
    public Bundle restoredState;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name and from kotlin metadata */
    public boolean restored;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name and from kotlin metadata */
    public final taiyuan viewModel;

    public polder(beachfront savedStateRegistry, final splinterproof viewModelStoreOwner) {
        Intrinsics.checkNotNullParameter(savedStateRegistry, "savedStateRegistry");
        Intrinsics.checkNotNullParameter(viewModelStoreOwner, "viewModelStoreOwner");
        this.savedStateRegistry = savedStateRegistry;
        this.viewModel = saneness.saneness(new Function0() { // from class: androidx.lifecycle.merc
            @Override // p002kotlin.jvm.functions.Function0
            public final Object invoke() {
                return polder.beachfront(viewModelStoreOwner);
            }
        });
    }

    public static final seminary beachfront(splinterproof splinterproofVar) {
        return restrictive.marial(splinterproofVar);
    }

    @Override // inrooted.beachfront.saneness
    public Bundle attabal() {
        Pair[] pairArr;
        Map mapTaiyuan = seminary.taiyuan();
        if (mapTaiyuan.isEmpty()) {
            pairArr = new Pair[0];
        } else {
            ArrayList arrayList = new ArrayList(mapTaiyuan.size());
            for (Map.Entry entry : mapTaiyuan.entrySet()) {
                arrayList.add(formularize.attabal((String) entry.getKey(), entry.getValue()));
            }
            pairArr = (Pair[]) arrayList.toArray(new Pair[0]);
        }
        Bundle bundleAttabal = wireman.attabal((Pair[]) Arrays.copyOf(pairArr, pairArr.length));
        Bundle bundleAttabal2 = cutely.attabal(bundleAttabal);
        Bundle bundle = this.restoredState;
        if (bundle != null) {
            cutely.saneness(bundleAttabal2, bundle);
        }
        for (Map.Entry<String, sealless> entry2 : wireman().marial().entrySet()) {
            String key = entry2.getKey();
            Bundle bundleAttabal3 = entry2.getValue().attabal().attabal();
            if (!dern.beachfront(dern.attabal(bundleAttabal3))) {
                cutely.dern(bundleAttabal2, key, bundleAttabal3);
            }
        }
        this.restored = false;
        return bundleAttabal;
    }

    public final Bundle dern(String key) {
        Pair[] pairArr;
        Intrinsics.checkNotNullParameter(key, "key");
        marial();
        Bundle bundle = this.restoredState;
        if (bundle == null || !dern.saneness(dern.attabal(bundle), key)) {
            return null;
        }
        Bundle bundleWireman = dern.wireman(dern.attabal(bundle), key);
        if (bundleWireman == null) {
            Map mapTaiyuan = seminary.taiyuan();
            if (mapTaiyuan.isEmpty()) {
                pairArr = new Pair[0];
            } else {
                ArrayList arrayList = new ArrayList(mapTaiyuan.size());
                for (Map.Entry entry : mapTaiyuan.entrySet()) {
                    arrayList.add(formularize.attabal((String) entry.getKey(), entry.getValue()));
                }
                pairArr = (Pair[]) arrayList.toArray(new Pair[0]);
            }
            bundleWireman = wireman.attabal((Pair[]) Arrays.copyOf(pairArr, pairArr.length));
            cutely.attabal(bundleWireman);
        }
        cutely.marial(cutely.attabal(bundle), key);
        if (dern.beachfront(dern.attabal(bundle))) {
            this.restoredState = null;
        }
        return bundleWireman;
    }

    public final void marial() {
        Pair[] pairArr;
        if (this.restored) {
            return;
        }
        Bundle bundleAttabal = this.savedStateRegistry.attabal("androidx.lifecycle.internal.SavedStateHandlesProvider");
        Map mapTaiyuan = seminary.taiyuan();
        if (mapTaiyuan.isEmpty()) {
            pairArr = new Pair[0];
        } else {
            ArrayList arrayList = new ArrayList(mapTaiyuan.size());
            for (Map.Entry entry : mapTaiyuan.entrySet()) {
                arrayList.add(formularize.attabal((String) entry.getKey(), entry.getValue()));
            }
            pairArr = (Pair[]) arrayList.toArray(new Pair[0]);
        }
        Bundle bundleAttabal2 = wireman.attabal((Pair[]) Arrays.copyOf(pairArr, pairArr.length));
        Bundle bundleAttabal3 = cutely.attabal(bundleAttabal2);
        Bundle bundle = this.restoredState;
        if (bundle != null) {
            cutely.saneness(bundleAttabal3, bundle);
        }
        if (bundleAttabal != null) {
            cutely.saneness(bundleAttabal3, bundleAttabal);
        }
        this.restoredState = bundleAttabal2;
        this.restored = true;
        wireman();
    }

    public final seminary wireman() {
        return (seminary) this.viewModel.getValue();
    }
}
