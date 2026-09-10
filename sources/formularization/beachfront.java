package formularization;

import p002kotlin.Metadata;
import pigboat.stratoscope;

/* JADX INFO: compiled from: Mutex.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0017\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0003\u0010\u0004\"\u0014\u0010\u0007\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0006\"\u0014\u0010\t\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0006¨\u0006\n"}, d2 = {"", "locked", "Lformularization/attabal;", "attabal", "(Z)Lformularization/attabal;", "Lpigboat/stratoscope;", "Lpigboat/stratoscope;", "NO_OWNER", "saneness", "ON_LOCK_ALREADY_LOCKED_BY_OWNER", "kotlinx-coroutines-core"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class beachfront {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public static final stratoscope f26506attabal = new stratoscope("NO_OWNER");

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public static final stratoscope f26507saneness = new stratoscope("ALREADY_LOCKED_BY_OWNER");

    public static final attabal attabal(boolean z) {
        return new kotlinx.coroutines.sync.attabal(z);
    }

    public static /* synthetic */ attabal saneness(boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return attabal(z);
    }
}
