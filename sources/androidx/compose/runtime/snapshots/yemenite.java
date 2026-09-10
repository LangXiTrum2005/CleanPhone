package androidx.compose.runtime.snapshots;

import androidx.collection.ScatterSet;
import androidx.compose.runtime.collection.ScatterSetWrapper;
import androidx.compose.runtime.liable;
import androidx.compose.runtime.lightstruck;
import androidx.compose.runtime.tailoring;
import com.google.android.gms.ads.RequestConfiguration;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import p002kotlin.KotlinNothingValueException;
import p002kotlin.Metadata;
import p002kotlin.Unit;
import p002kotlin.collections.CollectionsKt;
import p002kotlin.jvm.functions.Function0;
import p002kotlin.jvm.functions.Function1;
import p002kotlin.jvm.functions.Function2;
import p002kotlin.jvm.internal.Intrinsics;
import saneness.retroflection;

/* JADX INFO: compiled from: SnapshotStateObserver.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\"\n\u0002\b\u0005\n\u0002\u0010\u0001\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001:\u0001'B!\u0012\u0018\u0010\u0005\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0004\u0012\u00020\u00040\u0002¢\u0006\u0004\b\u0006\u0010\u0007JA\u0010\f\u001a\u00020\u0004\"\b\b\u0000\u0010\b*\u00020\u00012\u0006\u0010\t\u001a\u00028\u00002\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00040\u00022\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u000e\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ!\u0010\u0012\u001a\u00020\u00042\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00100\u0002¢\u0006\u0004\b\u0012\u0010\u0007J\r\u0010\u0013\u001a\u00020\u0004¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0015\u001a\u00020\u0004¢\u0006\u0004\b\u0015\u0010\u0014J\r\u0010\u0016\u001a\u00020\u0004¢\u0006\u0004\b\u0016\u0010\u0014J\u000f\u0010\u0017\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0019\u0010\u0014J\u001d\u0010\u001c\u001a\u00020\u00042\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00010\u001aH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u001aH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010!\u001a\u00020 H\u0002¢\u0006\u0004\b!\u0010\"J-\u0010%\u001a\u00020$\"\b\b\u0000\u0010\b*\u00020\u00012\u0012\u0010#\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00040\u0002H\u0002¢\u0006\u0004\b%\u0010&R&\u0010\u0005\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R(\u0010-\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u00010)j\n\u0012\u0006\u0012\u0004\u0018\u00010\u0001`*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0016\u00100\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010/R,\u00104\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u001a\u0012\u0004\u0012\u000202\u0012\u0004\u0012\u00020\u0004018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u00103R \u00106\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00040\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u0010(R\u001a\u00109\u001a\b\u0012\u0004\u0012\u00020$078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u00108R\u0018\u0010<\u001a\u00060\u0001j\u0002`:8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010;R\u0018\u0010?\u001a\u0004\u0018\u00010=8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010>R\u0016\u0010@\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010/R\u0018\u0010B\u001a\u0004\u0018\u00010$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010AR\u0016\u0010E\u001a\u00020C8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010D¨\u0006F"}, d2 = {"Landroidx/compose/runtime/snapshots/yemenite;", "", "Lkotlin/Function1;", "Lkotlin/Function0;", "", "onChangedExecutor", "<init>", "(Lkotlin/jvm/functions/Function1;)V", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "scope", "onValueChangedForScope", "block", "apical", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;)V", "competently", "(Ljava/lang/Object;)V", "", "predicate", "impromptu", "monoploid", "()V", "polloi", "beachfront", "taiyuan", "()Z", "kowloon", "", "set", "wireman", "(Ljava/util/Set;)V", "impassible", "()Ljava/util/Set;", "", "triweekly", "()Ljava/lang/Void;", "onChanged", "Landroidx/compose/runtime/snapshots/yemenite$attabal;", "cutely", "(Lkotlin/jvm/functions/Function1;)Landroidx/compose/runtime/snapshots/yemenite$attabal;", "attabal", "Lkotlin/jvm/functions/Function1;", "Ljava/util/concurrent/atomic/AtomicReference;", "Landroidx/compose/runtime/internal/AtomicReference;", "saneness", "Ljava/util/concurrent/atomic/AtomicReference;", "pendingChanges", "dern", "Z", "sendingNotifications", "Lkotlin/Function2;", "Landroidx/compose/runtime/snapshots/formularize;", "Lkotlin/jvm/functions/Function2;", "applyObserver", "marial", "readObserver", "Landroidx/compose/runtime/collection/dern;", "Landroidx/compose/runtime/collection/dern;", "observedScopeMaps", "Landroidx/compose/runtime/platform/SynchronizedObject;", "Ljava/lang/Object;", "observedScopeMapsLock", "Landroidx/compose/runtime/snapshots/competently;", "Landroidx/compose/runtime/snapshots/competently;", "applyUnsubscribe", "isPaused", "Landroidx/compose/runtime/snapshots/yemenite$attabal;", "currentMap", "", "J", "currentMapThreadId", "runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class yemenite {

    /* JADX INFO: renamed from: formularize, reason: collision with root package name */
    public static final int f6271formularize = 8;

    /* JADX INFO: renamed from: attabal, reason: collision with root package name and from kotlin metadata */
    public final Function1<Function0<Unit>, Unit> onChangedExecutor;

    /* JADX INFO: renamed from: cutely, reason: collision with root package name and from kotlin metadata */
    public attabal currentMap;

    /* JADX INFO: renamed from: dern, reason: collision with root package name and from kotlin metadata */
    public boolean sendingNotifications;

    /* JADX INFO: renamed from: impromptu, reason: collision with root package name and from kotlin metadata */
    public competently applyUnsubscribe;

    /* JADX INFO: renamed from: taiyuan, reason: collision with root package name and from kotlin metadata */
    public boolean isPaused;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name and from kotlin metadata */
    public final AtomicReference<Object> pendingChanges = new AtomicReference<>(null);

    /* JADX INFO: renamed from: wireman, reason: collision with root package name and from kotlin metadata */
    public final Function2<Set<? extends Object>, formularize, Unit> applyObserver = new Function2() { // from class: androidx.compose.runtime.snapshots.stratoscope
        @Override // p002kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return yemenite.marial(this.f6247kowloon, (Set) obj, (formularize) obj2);
        }
    };

    /* JADX INFO: renamed from: marial, reason: collision with root package name and from kotlin metadata */
    public final Function1<Object, Unit> readObserver = new Function1() { // from class: androidx.compose.runtime.snapshots.trm
        @Override // p002kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            return yemenite.formularize(this.f6258kowloon, obj);
        }
    };

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name and from kotlin metadata */
    public final androidx.compose.runtime.collection.dern<attabal> observedScopeMaps = new androidx.compose.runtime.collection.dern<>(new attabal[16], 0);

    /* JADX INFO: renamed from: competently, reason: collision with root package name and from kotlin metadata */
    public final Object observedScopeMapsLock = new Object();

    /* JADX INFO: renamed from: apical, reason: collision with root package name and from kotlin metadata */
    public long currentMapThreadId = -1;

    /* JADX INFO: compiled from: SnapshotStateObserver.kt */
    @Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\"\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\u001b\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\b\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0001¢\u0006\u0004\b\b\u0010\tJ7\u0010\u000e\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u00012\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00030\u00022\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00030\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0010\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u0001¢\u0006\u0004\b\u0010\u0010\tJ!\u0010\u0013\u001a\u00020\u00032\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00110\u0002¢\u0006\u0004\b\u0013\u0010\u0006J\r\u0010\u0014\u001a\u00020\u0011¢\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\u0016\u001a\u00020\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u001b\u0010\u001a\u001a\u00020\u00112\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00010\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ\u0019\u0010\u001e\u001a\u00020\u00032\n\u0010\u001d\u001a\u0006\u0012\u0002\b\u00030\u001c¢\u0006\u0004\b\u001e\u0010\u001fJ\r\u0010 \u001a\u00020\u0003¢\u0006\u0004\b \u0010\u0017J5\u0010&\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00012\u0006\u0010\"\u001a\u00020!2\u0006\u0010#\u001a\u00020\u00012\f\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00010$H\u0002¢\u0006\u0004\b&\u0010'J\u0017\u0010(\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u0001H\u0002¢\u0006\u0004\b(\u0010\tJ\u001f\u0010)\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\u0001H\u0002¢\u0006\u0004\b)\u0010*R#\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R\u0018\u0010#\u001a\u0004\u0018\u00010\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u00100R\u001e\u00102\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u00101R\u0016\u0010\"\u001a\u00020!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u00103R \u00106\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0001048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u00105R&\u00108\u001a\u0014\u0012\u0004\u0012\u00020\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010$078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u00105R\u001a\u0010;\u001a\b\u0012\u0004\u0012\u00020\u0001098\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010:R\u001e\u0010>\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u001c0<8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010=R\u0017\u0010C\u001a\u00020?8\u0006¢\u0006\f\n\u0004\b\u000e\u0010@\u001a\u0004\bA\u0010BR\u0016\u0010D\u001a\u00020!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u00103R$\u0010E\u001a\u0012\u0012\u0004\u0012\u00020\u0001\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u001c048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u00105R<\u0010I\u001a*\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u001c\u0012\u0006\u0012\u0004\u0018\u00010\u00010Fj\u0014\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u001c\u0012\u0006\u0012\u0004\u0018\u00010\u0001`G8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010H¨\u0006J"}, d2 = {"Landroidx/compose/runtime/snapshots/yemenite$attabal;", "", "Lkotlin/Function1;", "", "onChanged", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "value", "apical", "(Ljava/lang/Object;)V", "scope", "readObserver", "Lkotlin/Function0;", "block", "taiyuan", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;)V", "marial", "", "predicate", "triweekly", "competently", "()Z", "dern", "()V", "", "changes", "cutely", "(Ljava/util/Set;)Z", "Landroidx/compose/runtime/polder;", "derivedState", "kowloon", "(Landroidx/compose/runtime/polder;)V", "impromptu", "", "currentToken", "currentScope", "Landroidx/collection/polder;", "recordedValues", "formularize", "(Ljava/lang/Object;ILjava/lang/Object;Landroidx/collection/polder;)V", "wireman", "impassible", "(Ljava/lang/Object;Ljava/lang/Object;)V", "attabal", "Lkotlin/jvm/functions/Function1;", "beachfront", "()Lkotlin/jvm/functions/Function1;", "saneness", "Ljava/lang/Object;", "Landroidx/collection/polder;", "currentScopeReads", "I", "Landroidx/compose/runtime/collection/beachfront;", "Landroidx/collection/grimness;", "valueToScopes", "Landroidx/collection/grimness;", "scopeToValues", "Landroidx/collection/saran;", "Landroidx/collection/saran;", "invalidated", "Landroidx/compose/runtime/collection/dern;", "Landroidx/compose/runtime/collection/dern;", "statesToReread", "Landroidx/compose/runtime/seminary;", "Landroidx/compose/runtime/seminary;", "getDerivedStateObserver", "()Landroidx/compose/runtime/seminary;", "derivedStateObserver", "deriveStateScopeCount", "dependencyToDerivedStates", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "Ljava/util/HashMap;", "recordedDerivedStateValues", "runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class attabal {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name and from kotlin metadata */
        public final Function1<Object, Unit> onChanged;

        /* JADX INFO: renamed from: cutely, reason: collision with root package name and from kotlin metadata */
        public int deriveStateScopeCount;

        /* JADX INFO: renamed from: dern, reason: collision with root package name and from kotlin metadata */
        public androidx.collection.polder<Object> currentScopeReads;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name and from kotlin metadata */
        public Object currentScope;

        /* JADX INFO: renamed from: wireman, reason: collision with root package name and from kotlin metadata */
        public int currentToken = -1;

        /* JADX INFO: renamed from: marial, reason: collision with root package name and from kotlin metadata */
        public final androidx.collection.grimness<Object, Object> valueToScopes = androidx.compose.runtime.collection.beachfront.wireman(null, 1, null);

        /* JADX INFO: renamed from: beachfront, reason: collision with root package name and from kotlin metadata */
        public final androidx.collection.grimness<Object, androidx.collection.polder<Object>> scopeToValues = new androidx.collection.grimness<>(0, 1, null);

        /* JADX INFO: renamed from: competently, reason: collision with root package name and from kotlin metadata */
        public final androidx.collection.saran<Object> invalidated = new androidx.collection.saran<>(0, 1, null);

        /* JADX INFO: renamed from: impromptu, reason: collision with root package name and from kotlin metadata */
        public final androidx.compose.runtime.collection.dern<androidx.compose.runtime.polder<?>> statesToReread = new androidx.compose.runtime.collection.dern<>(new androidx.compose.runtime.polder[16], 0);

        /* JADX INFO: renamed from: taiyuan, reason: collision with root package name and from kotlin metadata */
        public final androidx.compose.runtime.seminary derivedStateObserver = new C0040attabal();

        /* JADX INFO: renamed from: apical, reason: collision with root package name and from kotlin metadata */
        public final androidx.collection.grimness<Object, Object> dependencyToDerivedStates = androidx.compose.runtime.collection.beachfront.wireman(null, 1, null);

        /* JADX INFO: renamed from: formularize, reason: collision with root package name and from kotlin metadata */
        public final HashMap<androidx.compose.runtime.polder<?>, Object> recordedDerivedStateValues = new HashMap<>();

        /* JADX INFO: renamed from: androidx.compose.runtime.snapshots.yemenite$attabal$attabal, reason: collision with other inner class name */
        /* JADX INFO: compiled from: SnapshotStateObserver.kt */
        @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001b\u0010\u0005\u001a\u00020\u00042\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u001b\u0010\u0007\u001a\u00020\u00042\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"androidx/compose/runtime/snapshots/yemenite$attabal$attabal", "Landroidx/compose/runtime/seminary;", "Landroidx/compose/runtime/polder;", "derivedState", "", "saneness", "(Landroidx/compose/runtime/polder;)V", "attabal", "runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class C0040attabal implements androidx.compose.runtime.seminary {
            public C0040attabal() {
            }

            @Override // androidx.compose.runtime.seminary
            public void attabal(androidx.compose.runtime.polder<?> derivedState) {
                attabal.this.deriveStateScopeCount--;
            }

            @Override // androidx.compose.runtime.seminary
            public void saneness(androidx.compose.runtime.polder<?> derivedState) {
                attabal.this.deriveStateScopeCount++;
            }
        }

        public attabal(Function1<Object, Unit> function1) {
            this.onChanged = function1;
        }

        public final void apical(Object value) {
            Object obj = this.currentScope;
            Intrinsics.beachfront(obj);
            int i = this.currentToken;
            androidx.collection.polder<Object> polderVar = this.currentScopeReads;
            if (polderVar == null) {
                polderVar = new androidx.collection.polder<>(0, 1, null);
                this.currentScopeReads = polderVar;
                this.scopeToValues.graveside(obj, polderVar);
                Unit unit = Unit.f29295attabal;
            }
            formularize(value, i, obj, polderVar);
        }

        public final Function1<Object, Unit> beachfront() {
            return this.onChanged;
        }

        public final boolean competently() {
            return this.scopeToValues.competently();
        }

        /* JADX WARN: Code duplicated, block: B:102:0x0245  */
        /* JADX WARN: Code duplicated, block: B:122:0x02a8 A[DONT_INVERT, PHI: r11
  0x02a8: PHI (r11v44 boolean) = (r11v43 boolean), (r11v45 boolean) binds: [B:113:0x0280, B:121:0x02a6] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:123:0x02aa A[LOOP:6: B:112:0x0276->B:123:0x02aa, LOOP_END] */
        /* JADX WARN: Code duplicated, block: B:181:0x0402 A[DONT_INVERT, PHI: r13
  0x0402: PHI (r13v8 boolean) = (r13v7 boolean), (r13v10 boolean) binds: [B:172:0x03d6, B:180:0x0400] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:182:0x0404 A[LOOP:14: B:171:0x03c8->B:182:0x0404, LOOP_END] */
        /* JADX WARN: Code duplicated, block: B:185:0x0414  */
        /* JADX WARN: Code duplicated, block: B:219:0x04ca A[DONT_INVERT, PHI: r11
  0x04ca: PHI (r11v15 boolean) = (r11v14 boolean), (r11v16 boolean) binds: [B:210:0x04a2, B:218:0x04c8] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:220:0x04cc A[LOOP:18: B:209:0x0498->B:220:0x04cc, LOOP_END] */
        /* JADX WARN: Code duplicated, block: B:224:0x04dc  */
        /* JADX WARN: Code duplicated, block: B:264:0x0162 A[EDGE_INSN: B:264:0x0162->B:61:0x0162 BREAK  A[LOOP:4: B:46:0x010c->B:58:0x0148], SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:269:0x02b1 A[EDGE_INSN: B:269:0x02b1->B:125:0x02b1 BREAK  A[LOOP:6: B:112:0x0276->B:123:0x02aa], SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:274:0x023c A[EDGE_INSN: B:274:0x023c->B:100:0x023c BREAK  A[LOOP:8: B:87:0x0201->B:98:0x0235], SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:288:0x040b A[EDGE_INSN: B:288:0x040b->B:183:0x040b BREAK  A[LOOP:14: B:171:0x03c8->B:182:0x0404], SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:296:0x04d3 A[EDGE_INSN: B:296:0x04d3->B:222:0x04d3 BREAK  A[LOOP:18: B:209:0x0498->B:220:0x04cc], SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:57:0x0146 A[DONT_INVERT, PHI: r37
  0x0146: PHI (r37v5 boolean) = (r37v4 boolean), (r37v6 boolean) binds: [B:47:0x011a, B:56:0x0144] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:58:0x0148 A[LOOP:4: B:46:0x010c->B:58:0x0148, LOOP_END] */
        /* JADX WARN: Code duplicated, block: B:60:0x015c  */
        /* JADX WARN: Code duplicated, block: B:97:0x0233 A[DONT_INVERT, PHI: r11
  0x0233: PHI (r11v55 boolean) = (r11v54 boolean), (r11v56 boolean) binds: [B:88:0x020b, B:96:0x0231] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:98:0x0235 A[LOOP:8: B:87:0x0201->B:98:0x0235, LOOP_END] */
        public final boolean cutely(Set<? extends Object> changes) {
            boolean z;
            Iterator it;
            androidx.collection.grimness<Object, Object> grimnessVar;
            Object objDern;
            long[] jArr;
            Object[] objArr;
            Iterator it2;
            androidx.collection.grimness<Object, Object> grimnessVar2;
            long[] jArr2;
            Object[] objArr2;
            long[] jArr3;
            Object[] objArr3;
            String str;
            int i;
            Object[] objArr4;
            String str2;
            int i2;
            int i3;
            long j;
            int i4;
            int i5;
            Object obj;
            Object obj2;
            String str3;
            Object obj3;
            int i6;
            long j2;
            int i7;
            androidx.collection.grimness<Object, Object> grimnessVar3 = this.dependencyToDerivedStates;
            HashMap<androidx.compose.runtime.polder<?>, Object> map = this.recordedDerivedStateValues;
            androidx.collection.grimness<Object, Object> grimnessVar4 = this.valueToScopes;
            androidx.collection.saran<Object> saranVar = this.invalidated;
            String str4 = "null cannot be cast to non-null type androidx.compose.runtime.DerivedState<kotlin.Any?>";
            int i8 = 8;
            if (changes instanceof ScatterSetWrapper) {
                ScatterSet scatterSetSaneness = ((ScatterSetWrapper) changes).saneness();
                Object[] objArr5 = scatterSetSaneness.elements;
                long[] jArr4 = scatterSetSaneness.com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode.TAG_METADATA java.lang.String;
                int length = jArr4.length - 2;
                if (length >= 0) {
                    int i9 = 0;
                    z = false;
                    while (true) {
                        long j3 = jArr4[i9];
                        if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i10 = 8 - ((~(i9 - length)) >>> 31);
                            int i11 = 0;
                            while (i11 < i10) {
                                if ((j3 & 255) < 128) {
                                    int i12 = i8;
                                    Object obj4 = objArr5[(i9 << 3) + i11];
                                    if (obj4 instanceof seminary) {
                                        objArr4 = objArr5;
                                        if (!((seminary) obj4).graveside(impromptu.attabal(2))) {
                                            str2 = str4;
                                            i2 = length;
                                            i3 = i9;
                                            j = j3;
                                            i4 = i10;
                                        }
                                        i5 = 8;
                                    } else {
                                        objArr4 = objArr5;
                                    }
                                    if (androidx.compose.runtime.collection.beachfront.marial(grimnessVar3, obj4)) {
                                        Object objDern2 = grimnessVar3.dern(obj4);
                                        if (objDern2 == null) {
                                            str2 = str4;
                                            obj2 = obj4;
                                            i2 = length;
                                            i3 = i9;
                                            j = j3;
                                            i4 = i10;
                                        } else if (objDern2 instanceof androidx.collection.saran) {
                                            androidx.collection.saran saranVar2 = (androidx.collection.saran) objDern2;
                                            Object[] objArr6 = saranVar2.elements;
                                            long[] jArr5 = saranVar2.com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode.TAG_METADATA java.lang.String;
                                            int length2 = jArr5.length - 2;
                                            if (length2 >= 0) {
                                                j = j3;
                                                int i13 = 0;
                                                boolean z2 = z;
                                                while (true) {
                                                    long j4 = jArr5[i13];
                                                    i2 = length;
                                                    i3 = i9;
                                                    if ((((~j4) << 7) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                        int i14 = 8 - ((~(i13 - length2)) >>> 31);
                                                        int i15 = 0;
                                                        while (i15 < i14) {
                                                            if ((j4 & 255) < 128) {
                                                                i6 = i15;
                                                                androidx.compose.runtime.polder<?> polderVar = (androidx.compose.runtime.polder) objArr6[(i13 << 3) + i15];
                                                                Intrinsics.competently(polderVar, str4);
                                                                j2 = j4;
                                                                Object obj5 = map.get(polderVar);
                                                                tailoring<?> tailoringVarAttabal = polderVar.attabal();
                                                                if (tailoringVarAttabal == null) {
                                                                    tailoringVarAttabal = liable.competently();
                                                                }
                                                                boolean z3 = z2;
                                                                if (tailoringVarAttabal.saneness(polderVar.molybdenite().attabal(), obj5)) {
                                                                    str3 = str4;
                                                                    obj3 = obj4;
                                                                    i7 = i10;
                                                                    this.statesToReread.saneness(polderVar);
                                                                    z2 = z3;
                                                                } else {
                                                                    Object objDern3 = grimnessVar4.dern(polderVar);
                                                                    if (objDern3 == null) {
                                                                        str3 = str4;
                                                                        obj3 = obj4;
                                                                        i7 = i10;
                                                                        z2 = z3;
                                                                    } else if (objDern3 instanceof androidx.collection.saran) {
                                                                        androidx.collection.saran saranVar3 = (androidx.collection.saran) objDern3;
                                                                        Object[] objArr7 = saranVar3.elements;
                                                                        long[] jArr6 = saranVar3.com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode.TAG_METADATA java.lang.String;
                                                                        int length3 = jArr6.length - 2;
                                                                        if (length3 >= 0) {
                                                                            i7 = i10;
                                                                            int i16 = 0;
                                                                            while (true) {
                                                                                long j5 = jArr6[i16];
                                                                                str3 = str4;
                                                                                obj3 = obj4;
                                                                                if ((((~j5) << 7) & j5 & (-9187201950435737472L)) == -9187201950435737472L) {
                                                                                    if (i16 != length3) {
                                                                                        break;
                                                                                        break;
                                                                                    }
                                                                                    i16++;
                                                                                    str4 = str3;
                                                                                    obj4 = obj3;
                                                                                    i12 = 8;
                                                                                } else {
                                                                                    int i17 = 8 - ((~(i16 - length3)) >>> 31);
                                                                                    for (int i18 = 0; i18 < i17; i18++) {
                                                                                        if ((j5 & 255) < 128) {
                                                                                            saranVar.impromptu(objArr7[(i16 << 3) + i18]);
                                                                                            z3 = true;
                                                                                        }
                                                                                        j5 >>= i12;
                                                                                    }
                                                                                    if (i17 != i12) {
                                                                                        break;
                                                                                    }
                                                                                    if (i16 != length3) {
                                                                                        break;
                                                                                    }
                                                                                    i16++;
                                                                                    str4 = str3;
                                                                                    obj4 = obj3;
                                                                                    i12 = 8;
                                                                                }
                                                                            }
                                                                        } else {
                                                                            str3 = str4;
                                                                            obj3 = obj4;
                                                                            i7 = i10;
                                                                        }
                                                                        z2 = z3;
                                                                    } else {
                                                                        str3 = str4;
                                                                        obj3 = obj4;
                                                                        i7 = i10;
                                                                        saranVar.impromptu(objDern3);
                                                                        z2 = true;
                                                                    }
                                                                    Unit unit = Unit.f29295attabal;
                                                                }
                                                            } else {
                                                                str3 = str4;
                                                                obj3 = obj4;
                                                                i6 = i15;
                                                                j2 = j4;
                                                                i7 = i10;
                                                            }
                                                            j4 = j2 >> 8;
                                                            i15 = i6 + 1;
                                                            i12 = 8;
                                                            i10 = i7;
                                                            str4 = str3;
                                                            obj4 = obj3;
                                                        }
                                                        str2 = str4;
                                                        obj2 = obj4;
                                                        boolean z4 = z2;
                                                        i4 = i10;
                                                        if (i14 != i12) {
                                                            z = z4;
                                                            break;
                                                        }
                                                        z2 = z4;
                                                    } else {
                                                        str2 = str4;
                                                        obj2 = obj4;
                                                        i4 = i10;
                                                    }
                                                    if (i13 == length2) {
                                                        z = z2;
                                                        break;
                                                    }
                                                    i13++;
                                                    length = i2;
                                                    i9 = i3;
                                                    i10 = i4;
                                                    str4 = str2;
                                                    obj4 = obj2;
                                                    i12 = 8;
                                                }
                                            } else {
                                                str2 = str4;
                                                obj2 = obj4;
                                                i2 = length;
                                                i3 = i9;
                                                j = j3;
                                                i4 = i10;
                                            }
                                        } else {
                                            str2 = str4;
                                            obj2 = obj4;
                                            i2 = length;
                                            i3 = i9;
                                            j = j3;
                                            i4 = i10;
                                            androidx.compose.runtime.polder<?> polderVar2 = (androidx.compose.runtime.polder) objDern2;
                                            Object obj6 = map.get(polderVar2);
                                            tailoring<?> tailoringVarAttabal2 = polderVar2.attabal();
                                            if (tailoringVarAttabal2 == null) {
                                                tailoringVarAttabal2 = liable.competently();
                                            }
                                            if (tailoringVarAttabal2.saneness(polderVar2.molybdenite().attabal(), obj6)) {
                                                this.statesToReread.saneness(polderVar2);
                                            } else {
                                                Object objDern4 = grimnessVar4.dern(polderVar2);
                                                if (objDern4 != null) {
                                                    if (objDern4 instanceof androidx.collection.saran) {
                                                        androidx.collection.saran saranVar4 = (androidx.collection.saran) objDern4;
                                                        Object[] objArr8 = saranVar4.elements;
                                                        long[] jArr7 = saranVar4.com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode.TAG_METADATA java.lang.String;
                                                        int length4 = jArr7.length - 2;
                                                        if (length4 >= 0) {
                                                            int i19 = 0;
                                                            while (true) {
                                                                long j6 = jArr7[i19];
                                                                if ((((~j6) << 7) & j6 & (-9187201950435737472L)) == -9187201950435737472L) {
                                                                    if (i19 != length4) {
                                                                        break;
                                                                        break;
                                                                    }
                                                                    i19++;
                                                                } else {
                                                                    int i20 = 8 - ((~(i19 - length4)) >>> 31);
                                                                    for (int i21 = 0; i21 < i20; i21++) {
                                                                        if ((j6 & 255) < 128) {
                                                                            saranVar.impromptu(objArr8[(i19 << 3) + i21]);
                                                                            z = true;
                                                                        }
                                                                        j6 >>= 8;
                                                                    }
                                                                    if (i20 != 8) {
                                                                        break;
                                                                    }
                                                                    if (i19 != length4) {
                                                                        break;
                                                                    }
                                                                    i19++;
                                                                }
                                                            }
                                                        }
                                                    } else {
                                                        saranVar.impromptu(objDern4);
                                                        z = true;
                                                    }
                                                }
                                                Unit unit2 = Unit.f29295attabal;
                                            }
                                        }
                                        obj = obj2;
                                    } else {
                                        str2 = str4;
                                        i2 = length;
                                        i3 = i9;
                                        j = j3;
                                        i4 = i10;
                                        obj = obj4;
                                    }
                                    Object objDern5 = grimnessVar4.dern(obj);
                                    if (objDern5 != null) {
                                        if (objDern5 instanceof androidx.collection.saran) {
                                            androidx.collection.saran saranVar5 = (androidx.collection.saran) objDern5;
                                            Object[] objArr9 = saranVar5.elements;
                                            long[] jArr8 = saranVar5.com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode.TAG_METADATA java.lang.String;
                                            int length5 = jArr8.length - 2;
                                            if (length5 >= 0) {
                                                int i22 = 0;
                                                while (true) {
                                                    long j7 = jArr8[i22];
                                                    if ((((~j7) << 7) & j7 & (-9187201950435737472L)) == -9187201950435737472L) {
                                                        if (i22 != length5) {
                                                            break;
                                                            break;
                                                        }
                                                        i22++;
                                                    } else {
                                                        int i23 = 8 - ((~(i22 - length5)) >>> 31);
                                                        for (int i24 = 0; i24 < i23; i24++) {
                                                            if ((j7 & 255) < 128) {
                                                                saranVar.impromptu(objArr9[(i22 << 3) + i24]);
                                                                z = true;
                                                            }
                                                            j7 >>= 8;
                                                        }
                                                        if (i23 != 8) {
                                                            break;
                                                        }
                                                        if (i22 != length5) {
                                                            break;
                                                        }
                                                        i22++;
                                                    }
                                                }
                                            }
                                        } else {
                                            saranVar.impromptu(objDern5);
                                            z = true;
                                        }
                                    }
                                    i5 = 8;
                                } else {
                                    objArr4 = objArr5;
                                    str2 = str4;
                                    i2 = length;
                                    i3 = i9;
                                    j = j3;
                                    i4 = i10;
                                    i5 = i8;
                                }
                                j3 = j >> i5;
                                i11++;
                                objArr5 = objArr4;
                                i8 = i5;
                                jArr4 = jArr4;
                                length = i2;
                                i9 = i3;
                                i10 = i4;
                                str4 = str2;
                            }
                            jArr3 = jArr4;
                            objArr3 = objArr5;
                            str = str4;
                            int i25 = length;
                            int i26 = i9;
                            if (i10 != i8) {
                                break;
                            }
                            length = i25;
                            i = i26;
                        } else {
                            jArr3 = jArr4;
                            objArr3 = objArr5;
                            str = str4;
                            i = i9;
                        }
                        if (i == length) {
                            break;
                        }
                        i9 = i + 1;
                        objArr5 = objArr3;
                        jArr4 = jArr3;
                        str4 = str;
                        i8 = 8;
                    }
                } else {
                    z = false;
                }
            } else {
                Iterator it3 = changes.iterator();
                z = false;
                while (it3.hasNext()) {
                    Object next = it3.next();
                    if (!(next instanceof seminary) || ((seminary) next).graveside(impromptu.attabal(2))) {
                        if (!androidx.compose.runtime.collection.beachfront.marial(grimnessVar3, next) || (objDern = grimnessVar3.dern(next)) == null) {
                            it = it3;
                            grimnessVar = grimnessVar3;
                        } else if (objDern instanceof androidx.collection.saran) {
                            androidx.collection.saran saranVar6 = (androidx.collection.saran) objDern;
                            Object[] objArr10 = saranVar6.elements;
                            long[] jArr9 = saranVar6.com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode.TAG_METADATA java.lang.String;
                            int length6 = jArr9.length - 2;
                            if (length6 >= 0) {
                                int i27 = 0;
                                while (true) {
                                    long j8 = jArr9[i27];
                                    if ((((~j8) << 7) & j8 & (-9187201950435737472L)) != -9187201950435737472L) {
                                        int i28 = 8 - ((~(i27 - length6)) >>> 31);
                                        int i29 = 0;
                                        while (i29 < i28) {
                                            if ((j8 & 255) < 128) {
                                                it2 = it3;
                                                androidx.compose.runtime.polder<?> polderVar3 = (androidx.compose.runtime.polder) objArr10[(i27 << 3) + i29];
                                                grimnessVar2 = grimnessVar3;
                                                Intrinsics.competently(polderVar3, "null cannot be cast to non-null type androidx.compose.runtime.DerivedState<kotlin.Any?>");
                                                Object obj7 = map.get(polderVar3);
                                                tailoring<?> tailoringVarAttabal3 = polderVar3.attabal();
                                                if (tailoringVarAttabal3 == null) {
                                                    tailoringVarAttabal3 = liable.competently();
                                                }
                                                jArr2 = jArr9;
                                                objArr2 = objArr10;
                                                if (tailoringVarAttabal3.saneness(polderVar3.molybdenite().attabal(), obj7)) {
                                                    j8 = j8;
                                                    this.statesToReread.saneness(polderVar3);
                                                } else {
                                                    Object objDern6 = grimnessVar4.dern(polderVar3);
                                                    if (objDern6 != null) {
                                                        if (objDern6 instanceof androidx.collection.saran) {
                                                            androidx.collection.saran saranVar7 = (androidx.collection.saran) objDern6;
                                                            Object[] objArr11 = saranVar7.elements;
                                                            long[] jArr10 = saranVar7.com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode.TAG_METADATA java.lang.String;
                                                            int length7 = jArr10.length - 2;
                                                            if (length7 >= 0) {
                                                                int i30 = 0;
                                                                boolean z5 = z;
                                                                while (true) {
                                                                    long j9 = jArr10[i30];
                                                                    long[] jArr11 = jArr10;
                                                                    Object[] objArr12 = objArr11;
                                                                    if ((((~j9) << 7) & j9 & (-9187201950435737472L)) == -9187201950435737472L) {
                                                                        if (i30 != length7) {
                                                                            break;
                                                                            break;
                                                                        }
                                                                        i30++;
                                                                        objArr11 = objArr12;
                                                                        jArr10 = jArr11;
                                                                    } else {
                                                                        int i31 = 8 - ((~(i30 - length7)) >>> 31);
                                                                        for (int i32 = 0; i32 < i31; i32++) {
                                                                            if ((j9 & 255) < 128) {
                                                                                saranVar.impromptu(objArr12[(i30 << 3) + i32]);
                                                                                z5 = true;
                                                                            }
                                                                            j9 >>= 8;
                                                                        }
                                                                        if (i31 != 8) {
                                                                            break;
                                                                        }
                                                                        if (i30 != length7) {
                                                                            break;
                                                                        }
                                                                        i30++;
                                                                        objArr11 = objArr12;
                                                                        jArr10 = jArr11;
                                                                    }
                                                                }
                                                                z = z5;
                                                            }
                                                        } else {
                                                            saranVar.impromptu(objDern6);
                                                            z = true;
                                                        }
                                                    }
                                                    Unit unit3 = Unit.f29295attabal;
                                                }
                                            } else {
                                                it2 = it3;
                                                grimnessVar2 = grimnessVar3;
                                                jArr2 = jArr9;
                                                objArr2 = objArr10;
                                                j8 = j8;
                                            }
                                            j8 >>= 8;
                                            i29++;
                                            it3 = it2;
                                            grimnessVar3 = grimnessVar2;
                                            jArr9 = jArr2;
                                            objArr10 = objArr2;
                                        }
                                        it = it3;
                                        grimnessVar = grimnessVar3;
                                        jArr = jArr9;
                                        objArr = objArr10;
                                        if (i28 != 8) {
                                            break;
                                        }
                                    } else {
                                        it = it3;
                                        grimnessVar = grimnessVar3;
                                        jArr = jArr9;
                                        objArr = objArr10;
                                    }
                                    if (i27 == length6) {
                                        break;
                                    }
                                    i27++;
                                    it3 = it;
                                    grimnessVar3 = grimnessVar;
                                    jArr9 = jArr;
                                    objArr10 = objArr;
                                }
                            } else {
                                it = it3;
                                grimnessVar = grimnessVar3;
                            }
                        } else {
                            it = it3;
                            grimnessVar = grimnessVar3;
                            androidx.compose.runtime.polder<?> polderVar4 = (androidx.compose.runtime.polder) objDern;
                            Object obj8 = map.get(polderVar4);
                            tailoring<?> tailoringVarAttabal4 = polderVar4.attabal();
                            if (tailoringVarAttabal4 == null) {
                                tailoringVarAttabal4 = liable.competently();
                            }
                            if (tailoringVarAttabal4.saneness(polderVar4.molybdenite().attabal(), obj8)) {
                                this.statesToReread.saneness(polderVar4);
                            } else {
                                Object objDern7 = grimnessVar4.dern(polderVar4);
                                if (objDern7 != null) {
                                    if (objDern7 instanceof androidx.collection.saran) {
                                        androidx.collection.saran saranVar8 = (androidx.collection.saran) objDern7;
                                        Object[] objArr13 = saranVar8.elements;
                                        long[] jArr12 = saranVar8.com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode.TAG_METADATA java.lang.String;
                                        int length8 = jArr12.length - 2;
                                        if (length8 >= 0) {
                                            int i33 = 0;
                                            while (true) {
                                                long j10 = jArr12[i33];
                                                if ((((~j10) << 7) & j10 & (-9187201950435737472L)) == -9187201950435737472L) {
                                                    if (i33 != length8) {
                                                        break;
                                                        break;
                                                    }
                                                    i33++;
                                                } else {
                                                    int i34 = 8 - ((~(i33 - length8)) >>> 31);
                                                    for (int i35 = 0; i35 < i34; i35++) {
                                                        if ((j10 & 255) < 128) {
                                                            saranVar.impromptu(objArr13[(i33 << 3) + i35]);
                                                            z = true;
                                                        }
                                                        j10 >>= 8;
                                                    }
                                                    if (i34 != 8) {
                                                        break;
                                                    }
                                                    if (i33 != length8) {
                                                        break;
                                                    }
                                                    i33++;
                                                }
                                            }
                                        }
                                    } else {
                                        saranVar.impromptu(objDern7);
                                        z = true;
                                    }
                                }
                                Unit unit4 = Unit.f29295attabal;
                            }
                        }
                        Object objDern8 = grimnessVar4.dern(next);
                        if (objDern8 != null) {
                            if (objDern8 instanceof androidx.collection.saran) {
                                androidx.collection.saran saranVar9 = (androidx.collection.saran) objDern8;
                                Object[] objArr14 = saranVar9.elements;
                                long[] jArr13 = saranVar9.com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode.TAG_METADATA java.lang.String;
                                int length9 = jArr13.length - 2;
                                if (length9 >= 0) {
                                    int i36 = 0;
                                    while (true) {
                                        long j11 = jArr13[i36];
                                        if ((((~j11) << 7) & j11 & (-9187201950435737472L)) != -9187201950435737472L) {
                                            int i37 = 8 - ((~(i36 - length9)) >>> 31);
                                            for (int i38 = 0; i38 < i37; i38++) {
                                                if ((j11 & 255) < 128) {
                                                    saranVar.impromptu(objArr14[(i36 << 3) + i38]);
                                                    z = true;
                                                }
                                                j11 >>= 8;
                                            }
                                            if (i37 != 8) {
                                                break;
                                            }
                                        }
                                        if (i36 == length9) {
                                            break;
                                        }
                                        i36++;
                                    }
                                }
                            } else {
                                saranVar.impromptu(objDern8);
                                z = true;
                            }
                        }
                        it3 = it;
                        grimnessVar3 = grimnessVar;
                    } else {
                        it = it3;
                        grimnessVar = grimnessVar3;
                    }
                    it3 = it;
                    grimnessVar3 = grimnessVar;
                }
            }
            if (this.statesToReread.getSize() != 0) {
                androidx.compose.runtime.collection.dern<androidx.compose.runtime.polder<?>> dernVar = this.statesToReread;
                androidx.compose.runtime.polder<?>[] polderVarArr = dernVar.content;
                int size = dernVar.getSize();
                for (int i39 = 0; i39 < size; i39++) {
                    kowloon(polderVarArr[i39]);
                }
                this.statesToReread.impromptu();
            }
            return z;
        }

        public final void dern() {
            androidx.compose.runtime.collection.beachfront.saneness(this.valueToScopes);
            this.scopeToValues.taiyuan();
            androidx.compose.runtime.collection.beachfront.saneness(this.dependencyToDerivedStates);
            this.recordedDerivedStateValues.clear();
        }

        public final void formularize(Object value, int currentToken, Object currentScope, androidx.collection.polder<Object> recordedValues) {
            int i;
            int i2;
            int i3;
            if (this.deriveStateScopeCount > 0) {
                return;
            }
            int iMonoploid = recordedValues.monoploid(value, currentToken, -1);
            int i4 = 2;
            if (!(value instanceof androidx.compose.runtime.polder) || iMonoploid == currentToken) {
                i = 2;
                i2 = -1;
            } else {
                androidx.compose.runtime.polder.attabal attabalVarMolybdenite = ((androidx.compose.runtime.polder) value).molybdenite();
                this.recordedDerivedStateValues.put(value, attabalVarMolybdenite.attabal());
                androidx.collection.creditor<polder> creditorVarSaneness = attabalVarMolybdenite.saneness();
                androidx.collection.grimness<Object, Object> grimnessVar = this.dependencyToDerivedStates;
                androidx.compose.runtime.collection.beachfront.impromptu(grimnessVar, value);
                Object[] objArr = creditorVarSaneness.keys;
                long[] jArr = creditorVarSaneness.com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode.TAG_METADATA java.lang.String;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i5 = 0;
                    while (true) {
                        long j = jArr[i5];
                        if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i6 = 8 - ((~(i5 - length)) >>> 31);
                            int i7 = 0;
                            while (i7 < i6) {
                                if ((j & 255) < 128) {
                                    i3 = i4;
                                    polder polderVar = (polder) objArr[(i5 << 3) + i7];
                                    if (polderVar instanceof seminary) {
                                        ((seminary) polderVar).adultoid(impromptu.attabal(i3));
                                    }
                                    androidx.compose.runtime.collection.beachfront.attabal(grimnessVar, polderVar, value);
                                } else {
                                    i3 = i4;
                                }
                                j >>= 8;
                                i7++;
                                i4 = i3;
                            }
                            i = i4;
                            if (i6 != 8) {
                                break;
                            }
                        } else {
                            i = i4;
                        }
                        if (i5 == length) {
                            break;
                        }
                        i5++;
                        i4 = i;
                    }
                } else {
                    i = 2;
                }
                i2 = -1;
            }
            if (iMonoploid == i2) {
                if (value instanceof seminary) {
                    ((seminary) value).adultoid(impromptu.attabal(i));
                }
                androidx.compose.runtime.collection.beachfront.attabal(this.valueToScopes, value, currentScope);
            }
        }

        public final void impassible(Object scope, Object value) {
            androidx.compose.runtime.collection.beachfront.competently(this.valueToScopes, value, scope);
            if (!(value instanceof androidx.compose.runtime.polder) || androidx.compose.runtime.collection.beachfront.marial(this.valueToScopes, value)) {
                return;
            }
            androidx.compose.runtime.collection.beachfront.impromptu(this.dependencyToDerivedStates, value);
            this.recordedDerivedStateValues.remove(value);
        }

        /* JADX WARN: Code duplicated, block: B:14:0x0044 A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:15:0x0046 A[LOOP:0: B:5:0x0011->B:15:0x0046, LOOP_END] */
        /* JADX WARN: Code duplicated, block: B:19:0x0049 A[EDGE_INSN: B:19:0x0049->B:16:0x0049 BREAK  A[LOOP:0: B:5:0x0011->B:15:0x0046], SYNTHETIC] */
        public final void impromptu() {
            androidx.collection.saran<Object> saranVar = this.invalidated;
            Function1<Object, Unit> function1 = this.onChanged;
            Object[] objArr = saranVar.elements;
            long[] jArr = saranVar.com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode.TAG_METADATA java.lang.String;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i = 0;
                while (true) {
                    long j = jArr[i];
                    if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                        if (i != length) {
                            break;
                            break;
                        }
                        i++;
                    } else {
                        int i2 = 8 - ((~(i - length)) >>> 31);
                        for (int i3 = 0; i3 < i2; i3++) {
                            if ((255 & j) < 128) {
                                function1.invoke(objArr[(i << 3) + i3]);
                            }
                            j >>= 8;
                        }
                        if (i2 != 8) {
                            break;
                        } else if (i != length) {
                            break;
                        } else {
                            i++;
                        }
                    }
                }
            }
            saranVar.impassible();
        }

        public final void kowloon(androidx.compose.runtime.polder<?> derivedState) {
            long[] jArr;
            androidx.collection.polder<Object> polderVar;
            androidx.collection.grimness<Object, androidx.collection.polder<Object>> grimnessVar = this.scopeToValues;
            int iHashCode = Long.hashCode(adultoid.grimness().getSnapshotId());
            Object objDern = this.valueToScopes.dern(derivedState);
            if (objDern == null) {
                return;
            }
            if (!(objDern instanceof androidx.collection.saran)) {
                androidx.collection.polder<Object> polderVarDern = grimnessVar.dern(objDern);
                if (polderVarDern == null) {
                    polderVarDern = new androidx.collection.polder<>(0, 1, null);
                    grimnessVar.graveside(objDern, polderVarDern);
                    Unit unit = Unit.f29295attabal;
                }
                formularize(derivedState, iHashCode, objDern, polderVarDern);
                return;
            }
            androidx.collection.saran saranVar = (androidx.collection.saran) objDern;
            Object[] objArr = saranVar.elements;
            long[] jArr2 = saranVar.com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode.TAG_METADATA java.lang.String;
            int length = jArr2.length - 2;
            if (length < 0) {
                return;
            }
            int i = 0;
            while (true) {
                long j = jArr2[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8;
                    int i3 = 8 - ((~(i - length)) >>> 31);
                    int i4 = 0;
                    while (i4 < i3) {
                        if ((j & 255) < 128) {
                            Object obj = objArr[(i << 3) + i4];
                            androidx.collection.polder<Object> polderVarDern2 = grimnessVar.dern(obj);
                            if (polderVarDern2 == null) {
                                polderVar = new androidx.collection.polder<>(0, 1, null);
                                grimnessVar.graveside(obj, polderVar);
                                Unit unit2 = Unit.f29295attabal;
                            } else {
                                polderVar = polderVarDern2;
                            }
                            formularize(derivedState, iHashCode, obj, polderVar);
                        }
                        j >>= i2;
                        i4++;
                        i2 = i2;
                        jArr2 = jArr2;
                    }
                    jArr = jArr2;
                    if (i3 != i2) {
                        return;
                    }
                } else {
                    jArr = jArr2;
                }
                if (i == length) {
                    return;
                }
                i++;
                jArr2 = jArr;
            }
        }

        public final void marial(Object scope) {
            androidx.collection.polder<Object> polderVarMonoploid = this.scopeToValues.monoploid(scope);
            if (polderVarMonoploid == null) {
                return;
            }
            Object[] objArr = polderVarMonoploid.keys;
            int[] iArr = polderVarMonoploid.values;
            long[] jArr = polderVarMonoploid.com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode.TAG_METADATA java.lang.String;
            int length = jArr.length - 2;
            if (length < 0) {
                return;
            }
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            int i4 = (i << 3) + i3;
                            Object obj = objArr[i4];
                            int i5 = iArr[i4];
                            impassible(scope, obj);
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        return;
                    }
                }
                if (i == length) {
                    return;
                } else {
                    i++;
                }
            }
        }

        public final void taiyuan(Object scope, Function1<Object, Unit> readObserver, Function0<Unit> block) {
            Object obj = this.currentScope;
            androidx.collection.polder<Object> polderVar = this.currentScopeReads;
            int i = this.currentToken;
            this.currentScope = scope;
            this.currentScopeReads = this.scopeToValues.dern(scope);
            if (this.currentToken == -1) {
                this.currentToken = Long.hashCode(adultoid.grimness().getSnapshotId());
            }
            androidx.compose.runtime.seminary seminaryVar = this.derivedStateObserver;
            androidx.compose.runtime.collection.dern<androidx.compose.runtime.seminary> dernVarAttabal = liable.attabal();
            try {
                dernVarAttabal.saneness(seminaryVar);
                formularize.INSTANCE.impromptu(readObserver, null, block);
                dernVarAttabal.molybdenite(dernVarAttabal.getSize() - 1);
                Object obj2 = this.currentScope;
                Intrinsics.beachfront(obj2);
                wireman(obj2);
                this.currentScope = obj;
                this.currentScopeReads = polderVar;
                this.currentToken = i;
            } catch (Throwable th) {
                dernVarAttabal.molybdenite(dernVarAttabal.getSize() - 1);
                throw th;
            }
        }

        /* JADX WARN: Code duplicated, block: B:27:0x009d A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:28:0x009f A[LOOP:2: B:16:0x0066->B:28:0x009f, LOOP_END] */
        /* JADX WARN: Code duplicated, block: B:29:0x00a8  */
        /* JADX WARN: Code duplicated, block: B:49:0x00ac A[EDGE_INSN: B:49:0x00ac->B:30:0x00ac BREAK  A[LOOP:2: B:16:0x0066->B:28:0x009f], SYNTHETIC] */
        public final void triweekly(Function1<Object, Boolean> predicate) {
            long[] jArr;
            long[] jArr2;
            long j;
            char c;
            long j2;
            int i;
            androidx.collection.grimness<Object, androidx.collection.polder<Object>> grimnessVar = this.scopeToValues;
            long[] jArr3 = grimnessVar.com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode.TAG_METADATA java.lang.String;
            int length = jArr3.length - 2;
            if (length < 0) {
                return;
            }
            int i2 = 0;
            while (true) {
                long j3 = jArr3[i2];
                char c2 = 7;
                long j4 = -9187201950435737472L;
                if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i3 = 8;
                    int i4 = 8 - ((~(i2 - length)) >>> 31);
                    int i5 = 0;
                    while (i5 < i4) {
                        if ((j3 & 255) < 128) {
                            int i6 = (i2 << 3) + i5;
                            c = c2;
                            Object obj = grimnessVar.keys[i6];
                            j2 = j4;
                            androidx.collection.polder polderVar = (androidx.collection.polder) grimnessVar.values[i6];
                            Boolean boolInvoke = predicate.invoke(obj);
                            if (boolInvoke.booleanValue()) {
                                Object[] objArr = polderVar.keys;
                                int[] iArr = polderVar.values;
                                long[] jArr4 = polderVar.com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode.TAG_METADATA java.lang.String;
                                int i7 = i3;
                                int length2 = jArr4.length - 2;
                                if (length2 >= 0) {
                                    jArr2 = jArr3;
                                    j = j3;
                                    int i8 = 0;
                                    while (true) {
                                        long j5 = jArr4[i8];
                                        long[] jArr5 = jArr4;
                                        if ((((~j5) << c) & j5 & j2) != j2) {
                                            int i9 = 8 - ((~(i8 - length2)) >>> 31);
                                            for (int i10 = 0; i10 < i9; i10++) {
                                                if ((j5 & 255) < 128) {
                                                    int i11 = (i8 << 3) + i10;
                                                    Object obj2 = objArr[i11];
                                                    int i12 = iArr[i11];
                                                    impassible(obj, obj2);
                                                }
                                                j5 >>= i7;
                                            }
                                            if (i9 != i7) {
                                                break;
                                            }
                                            if (i8 != length2) {
                                                break;
                                            }
                                            i8++;
                                            jArr4 = jArr5;
                                            i7 = 8;
                                        } else if (i8 != length2) {
                                            break;
                                            break;
                                        } else {
                                            i8++;
                                            jArr4 = jArr5;
                                            i7 = 8;
                                        }
                                    }
                                } else {
                                    jArr2 = jArr3;
                                    j = j3;
                                }
                            } else {
                                jArr2 = jArr3;
                                j = j3;
                            }
                            if (boolInvoke.booleanValue()) {
                                grimnessVar.polloi(i6);
                            }
                            i = 8;
                        } else {
                            jArr2 = jArr3;
                            j = j3;
                            c = c2;
                            j2 = j4;
                            i = i3;
                        }
                        i5++;
                        i3 = i;
                        j3 = j >> i;
                        c2 = c;
                        j4 = j2;
                        jArr3 = jArr2;
                    }
                    jArr = jArr3;
                    if (i4 != i3) {
                        return;
                    }
                } else {
                    jArr = jArr3;
                }
                if (i2 == length) {
                    return;
                }
                i2++;
                jArr3 = jArr;
            }
        }

        public final void wireman(Object scope) {
            int i = this.currentToken;
            androidx.collection.polder<Object> polderVar = this.currentScopeReads;
            if (polderVar == null) {
                return;
            }
            long[] jArr = polderVar.com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode.TAG_METADATA java.lang.String;
            int length = jArr.length - 2;
            if (length < 0) {
                return;
            }
            int i2 = 0;
            while (true) {
                long j = jArr[i2];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i3 = 8 - ((~(i2 - length)) >>> 31);
                    for (int i4 = 0; i4 < i3; i4++) {
                        if ((255 & j) < 128) {
                            int i5 = (i2 << 3) + i4;
                            Object obj = polderVar.keys[i5];
                            boolean z = polderVar.values[i5] != i;
                            if (z) {
                                impassible(scope, obj);
                            }
                            if (z) {
                                polderVar.polloi(i5);
                            }
                        }
                        j >>= 8;
                    }
                    if (i3 != 8) {
                        return;
                    }
                }
                if (i2 == length) {
                    return;
                } else {
                    i2++;
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public yemenite(Function1<? super Function0<Unit>, Unit> function1) {
        this.onChangedExecutor = function1;
    }

    public static final Unit arytenoidectomy(yemenite yemeniteVar) {
        do {
            synchronized (yemeniteVar.observedScopeMapsLock) {
                try {
                    if (!yemeniteVar.sendingNotifications) {
                        yemeniteVar.sendingNotifications = true;
                        try {
                            androidx.compose.runtime.collection.dern<attabal> dernVar = yemeniteVar.observedScopeMaps;
                            attabal[] attabalVarArr = dernVar.content;
                            int size = dernVar.getSize();
                            for (int i = 0; i < size; i++) {
                                attabalVarArr[i].impromptu();
                            }
                            yemeniteVar.sendingNotifications = false;
                        } catch (Throwable th) {
                            yemeniteVar.sendingNotifications = false;
                            throw th;
                        }
                    }
                    Unit unit = Unit.f29295attabal;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        } while (yemeniteVar.taiyuan());
        return Unit.f29295attabal;
    }

    public static final Unit formularize(yemenite yemeniteVar, Object obj) {
        if (!yemeniteVar.isPaused) {
            synchronized (yemeniteVar.observedScopeMapsLock) {
                attabal attabalVar = yemeniteVar.currentMap;
                Intrinsics.beachfront(attabalVar);
                attabalVar.apical(obj);
                Unit unit = Unit.f29295attabal;
            }
        }
        return Unit.f29295attabal;
    }

    public static final Unit marial(yemenite yemeniteVar, Set set, formularize formularizeVar) {
        yemeniteVar.wireman(set);
        if (yemeniteVar.taiyuan()) {
            yemeniteVar.kowloon();
        }
        return Unit.f29295attabal;
    }

    public final <T> void apical(T scope, Function1<? super T, Unit> onValueChangedForScope, Function0<Unit> block) {
        attabal attabalVarCutely;
        synchronized (this.observedScopeMapsLock) {
            attabalVarCutely = cutely(onValueChangedForScope);
        }
        boolean z = this.isPaused;
        attabal attabalVar = this.currentMap;
        long j = this.currentMapThreadId;
        if (j != -1) {
            if (!(j == cuirassed.monoploid.attabal())) {
                lightstruck.attabal("Detected multithreaded access to SnapshotStateObserver: previousThreadId=" + j + "), currentThread={id=" + cuirassed.monoploid.attabal() + ", name=" + cuirassed.monoploid.saneness() + "}. Note that observation on multiple threads in layout/draw is not supported. Make sure your measure/layout/draw for each Owner (AndroidComposeView) is executed on the same thread.");
            }
        }
        try {
            this.isPaused = false;
            this.currentMap = attabalVarCutely;
            this.currentMapThreadId = cuirassed.monoploid.attabal();
            attabalVarCutely.taiyuan(scope, this.readObserver, block);
        } finally {
            this.currentMap = attabalVar;
            this.isPaused = z;
            this.currentMapThreadId = j;
        }
    }

    public final void beachfront() {
        synchronized (this.observedScopeMapsLock) {
            try {
                androidx.compose.runtime.collection.dern<attabal> dernVar = this.observedScopeMaps;
                attabal[] attabalVarArr = dernVar.content;
                int size = dernVar.getSize();
                for (int i = 0; i < size; i++) {
                    attabalVarArr[i].dern();
                }
                Unit unit = Unit.f29295attabal;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void competently(Object scope) {
        synchronized (this.observedScopeMapsLock) {
            try {
                androidx.compose.runtime.collection.dern<attabal> dernVar = this.observedScopeMaps;
                int size = dernVar.getSize();
                int i = 0;
                for (int i2 = 0; i2 < size; i2++) {
                    attabal attabalVar = dernVar.content[i2];
                    attabalVar.marial(scope);
                    if (!attabalVar.competently()) {
                        i++;
                    } else if (i > 0) {
                        attabal[] attabalVarArr = dernVar.content;
                        attabalVarArr[i2 - i] = attabalVarArr[i2];
                    }
                }
                int i3 = size - i;
                p002kotlin.collections.arytenoidectomy.molybdenite(dernVar.content, null, i3, size);
                dernVar.rotuma(i3);
                Unit unit = Unit.f29295attabal;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final <T> attabal cutely(Function1<? super T, Unit> onChanged) {
        attabal attabalVar;
        androidx.compose.runtime.collection.dern<attabal> dernVar = this.observedScopeMaps;
        attabal[] attabalVarArr = dernVar.content;
        int size = dernVar.getSize();
        int i = 0;
        while (true) {
            if (i >= size) {
                attabalVar = null;
                break;
            }
            attabalVar = attabalVarArr[i];
            if (attabalVar.beachfront() == onChanged) {
                break;
            }
            i++;
        }
        attabal attabalVar2 = attabalVar;
        if (attabalVar2 != null) {
            return attabalVar2;
        }
        Intrinsics.competently(onChanged, "null cannot be cast to non-null type kotlin.Function1<kotlin.Any, kotlin.Unit>");
        attabal attabalVar3 = new attabal((Function1) p002kotlin.jvm.internal.rotuma.beachfront(onChanged, 1));
        this.observedScopeMaps.saneness(attabalVar3);
        return attabalVar3;
    }

    public final Set<Object> impassible() {
        Object obj;
        Object objSubList;
        Set<Object> set;
        do {
            obj = this.pendingChanges.get();
            objSubList = null;
            if (obj == null) {
                return null;
            }
            if (obj instanceof Set) {
                set = (Set) obj;
            } else {
                if (!(obj instanceof List)) {
                    triweekly();
                    throw new KotlinNothingValueException();
                }
                List list = (List) obj;
                Set<Object> set2 = (Set) list.get(0);
                if (list.size() == 2) {
                    objSubList = list.get(1);
                } else if (list.size() > 2) {
                    objSubList = list.subList(1, list.size());
                }
                set = set2;
            }
        } while (!retroflection.attabal(this.pendingChanges, obj, objSubList));
        return set;
    }

    public final void impromptu(Function1<Object, Boolean> predicate) {
        synchronized (this.observedScopeMapsLock) {
            try {
                androidx.compose.runtime.collection.dern<attabal> dernVar = this.observedScopeMaps;
                int size = dernVar.getSize();
                int i = 0;
                for (int i2 = 0; i2 < size; i2++) {
                    attabal attabalVar = dernVar.content[i2];
                    attabalVar.triweekly(predicate);
                    if (!attabalVar.competently()) {
                        i++;
                    } else if (i > 0) {
                        attabal[] attabalVarArr = dernVar.content;
                        attabalVarArr[i2 - i] = attabalVarArr[i2];
                    }
                }
                int i3 = size - i;
                p002kotlin.collections.arytenoidectomy.molybdenite(dernVar.content, null, i3, size);
                dernVar.rotuma(i3);
                Unit unit = Unit.f29295attabal;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void kowloon() {
        this.onChangedExecutor.invoke(new Function0() { // from class: androidx.compose.runtime.snapshots.oilcan
            @Override // p002kotlin.jvm.functions.Function0
            public final Object invoke() {
                return yemenite.arytenoidectomy(this.f6220kowloon);
            }
        });
    }

    public final void monoploid() {
        this.applyUnsubscribe = formularize.INSTANCE.taiyuan(this.applyObserver);
    }

    public final void polloi() {
        competently competentlyVar = this.applyUnsubscribe;
        if (competentlyVar != null) {
            competentlyVar.attabal();
        }
    }

    public final boolean taiyuan() {
        boolean z;
        synchronized (this.observedScopeMapsLock) {
            z = this.sendingNotifications;
        }
        if (z) {
            return false;
        }
        boolean z2 = false;
        while (true) {
            Set<? extends Object> setImpassible = impassible();
            if (setImpassible == null) {
                return z2;
            }
            synchronized (this.observedScopeMapsLock) {
                try {
                    androidx.compose.runtime.collection.dern<attabal> dernVar = this.observedScopeMaps;
                    attabal[] attabalVarArr = dernVar.content;
                    int size = dernVar.getSize();
                    for (int i = 0; i < size; i++) {
                        z2 = attabalVarArr[i].cutely(setImpassible) || z2;
                    }
                    Unit unit = Unit.f29295attabal;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public final Void triweekly() {
        androidx.compose.runtime.polloi.dovishness("Unexpected notification");
        throw new KotlinNothingValueException();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void wireman(Set<? extends Object> set) {
        Object obj;
        List listUnconsolidated;
        do {
            obj = this.pendingChanges.get();
            if (obj == null) {
                listUnconsolidated = set;
            } else if (obj instanceof Set) {
                listUnconsolidated = p002kotlin.collections.adultoid.kowloon(obj, set);
            } else {
                if (!(obj instanceof List)) {
                    triweekly();
                    throw new KotlinNothingValueException();
                }
                listUnconsolidated = CollectionsKt.unconsolidated((Collection) obj, p002kotlin.collections.graveside.marial(set));
            }
        } while (!retroflection.attabal(this.pendingChanges, obj, listUnconsolidated));
    }
}
