package androidx.compose.runtime;

import com.google.android.gms.ads.RequestConfiguration;
import cuirassed.IntRef;
import p002kotlin.Metadata;
import p002kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: DerivedState.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000(\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a)\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\u0004\b\u0000\u0010\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0007¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0015\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0000¢\u0006\u0004\b\b\u0010\t\"\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r\" \u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\r¨\u0006\u0010"}, d2 = {RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Lkotlin/Function0;", "calculation", "Landroidx/compose/runtime/tout;", "dern", "(Lkotlin/jvm/functions/Function0;)Landroidx/compose/runtime/tout;", "Landroidx/compose/runtime/collection/dern;", "Landroidx/compose/runtime/seminary;", "saneness", "()Landroidx/compose/runtime/collection/dern;", "Lcuirassed/formularize;", "Lcuirassed/beachfront;", "attabal", "Lcuirassed/formularize;", "calculationBlockNestedLevel", "derivedStateObservers", "runtime"}, k = 5, mv = {2, 0, 0}, xi = 48, xs = "androidx/compose/runtime/SnapshotStateKt")
public final /* synthetic */ class vir {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public static final cuirassed.formularize<IntRef> f6330attabal = new cuirassed.formularize<>();

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public static final cuirassed.formularize<androidx.compose.runtime.collection.dern<seminary>> f6331saneness = new cuirassed.formularize<>();

    public static final <T> tout<T> dern(Function0<? extends T> function0) {
        return new merc(function0, null);
    }

    public static final androidx.compose.runtime.collection.dern<seminary> saneness() {
        cuirassed.formularize<androidx.compose.runtime.collection.dern<seminary>> formularizeVar = f6331saneness;
        androidx.compose.runtime.collection.dern<seminary> dernVarAttabal = formularizeVar.attabal();
        if (dernVarAttabal != null) {
            return dernVarAttabal;
        }
        androidx.compose.runtime.collection.dern<seminary> dernVar = new androidx.compose.runtime.collection.dern<>(new seminary[0], 0);
        formularizeVar.saneness(dernVar);
        return dernVar;
    }
}
