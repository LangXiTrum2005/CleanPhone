package com.mbridge.msdk.playercommon.exoplayer2.text.cea;

import android.text.Layout;
import androidx.annotation.NonNull;
import com.mbridge.msdk.playercommon.exoplayer2.text.Cue;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
final class Cea708Cue extends Cue implements Comparable<Cea708Cue> {
    public static final int PRIORITY_UNSET = -1;
    public final int priority;

    public Cea708Cue(CharSequence charSequence, Layout.Alignment alignment, float f10, int i10, int i11, float f11, int i12, float f12, boolean z10, int i13, int i14) {
        super(charSequence, alignment, f10, i10, i11, f11, i12, f12, z10, i13);
        this.priority = i14;
    }

    @Override // java.lang.Comparable
    public int compareTo(@NonNull Cea708Cue cea708Cue) {
        int i10 = cea708Cue.priority;
        int i11 = this.priority;
        if (i10 < i11) {
            return -1;
        }
        return i10 > i11 ? 1 : 0;
    }
}
