package androidx.p001lifecycle;

import android.os.Bundle;
import inrooted.beachfront;
import inrooted.dern;
import java.util.LinkedHashMap;
import java.util.Map;
import p002kotlin.Metadata;
import p002kotlin.jvm.internal.DefaultConstructorMarker;
import p002kotlin.jvm.internal.Intrinsics;
import pruinose.saneness;

/* JADX INFO: compiled from: SavedStateHandle.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00122\u00020\u0001:\u0001\tB\u001f\b\u0017\u0012\u0014\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006B\t\b\u0017¢\u0006\u0004\b\u0005\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\t\u0010\nR$\u0010\r\u001a\u0012\u0012\u0004\u0012\u00020\u0003\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00010\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\fR\u0016\u0010\u0011\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0013"}, d2 = {"Landroidx/lifecycle/sealless;", "", "", "", "initialState", "<init>", "(Ljava/util/Map;)V", "()V", "Linrooted/beachfront$saneness;", "attabal", "()Linrooted/beachfront$saneness;", "", "Ljava/util/Map;", "liveDatas", "Lpruinose/saneness;", "saneness", "Lpruinose/saneness;", "impl", "dern", "lifecycle-viewmodel-savedstate"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class sealless {

    /* JADX INFO: renamed from: dern, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: attabal, reason: collision with root package name and from kotlin metadata */
    public final Map<String, Object> liveDatas;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name and from kotlin metadata */
    public saneness impl;

    /* JADX INFO: renamed from: androidx.lifecycle.sealless$attabal, reason: from kotlin metadata */
    /* JADX INFO: compiled from: SavedStateHandle.android.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J/\u0010\t\u001a\u00020\b2\u000e\u0010\u0006\u001a\n\u0018\u00010\u0004j\u0004\u0018\u0001`\u00052\u000e\u0010\u0007\u001a\n\u0018\u00010\u0004j\u0004\u0018\u0001`\u0005H\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Landroidx/lifecycle/sealless$attabal;", "", "<init>", "()V", "Landroid/os/Bundle;", "Landroidx/savedstate/SavedState;", "restoredState", "defaultState", "Landroidx/lifecycle/sealless;", "attabal", "(Landroid/os/Bundle;Landroid/os/Bundle;)Landroidx/lifecycle/sealless;", "lifecycle-viewmodel-savedstate"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final sealless attabal(Bundle restoredState, Bundle defaultState) {
            if (restoredState == null) {
                restoredState = defaultState;
            }
            if (restoredState == null) {
                return new sealless();
            }
            ClassLoader classLoader = sealless.class.getClassLoader();
            Intrinsics.beachfront(classLoader);
            restoredState.setClassLoader(classLoader);
            return new sealless(dern.competently(dern.attabal(restoredState)));
        }

        public Companion() {
        }
    }

    public sealless(Map<String, ? extends Object> initialState) {
        Intrinsics.checkNotNullParameter(initialState, "initialState");
        this.liveDatas = new LinkedHashMap();
        this.impl = new saneness(initialState);
    }

    public final beachfront.saneness attabal() {
        return this.impl.getSavedStateProvider();
    }

    public sealless() {
        this.liveDatas = new LinkedHashMap();
        this.impl = new saneness(null, 1, 0 == true ? 1 : 0);
    }
}
