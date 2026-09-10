package androidx.media3.exoplayer.trackselection;

import com.p004ironsource.mediationsdk.logger.IronSourceError;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class TrackSelectionArray {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f6536a;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || TrackSelectionArray.class != obj.getClass()) {
            return false;
        }
        return Arrays.equals((Object[]) null, (Object[]) null);
    }

    public final int hashCode() {
        if (this.f6536a == 0) {
            this.f6536a = Arrays.hashCode((Object[]) null) + IronSourceError.ERROR_NON_EXISTENT_INSTANCE;
        }
        return this.f6536a;
    }
}
