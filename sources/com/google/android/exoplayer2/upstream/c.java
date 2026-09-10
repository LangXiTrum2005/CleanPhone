package com.google.android.exoplayer2.upstream;

import com.google.common.base.Predicate;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class c implements Predicate {
    public final /* synthetic */ int X;

    @Override // com.google.common.base.Predicate
    public final boolean apply(Object obj) {
        switch (this.X) {
            case 0:
                return ((String) obj) != null;
            default:
                return ((Map.Entry) obj).getKey() != null;
        }
    }
}
