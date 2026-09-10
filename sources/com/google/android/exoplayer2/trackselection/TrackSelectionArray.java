package com.google.android.exoplayer2.trackselection;

import com.p004ironsource.mediationsdk.logger.IronSourceError;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class TrackSelectionArray {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f18692a;

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
        if (this.f18692a == 0) {
            this.f18692a = Arrays.hashCode((Object[]) null) + IronSourceError.ERROR_NON_EXISTENT_INSTANCE;
        }
        return this.f18692a;
    }
}
