package io.flutter.plugin.platform;

import android.content.Context;
import androidx.annotation.Nullable;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class e {
    private final xi.l createArgsCodec;

    public e(xi.l lVar) {
        this.createArgsCodec = lVar;
    }

    public abstract d create(Context context, int i10, Object obj);

    @Nullable
    public final xi.l getCreateArgsCodec() {
        return this.createArgsCodec;
    }
}
