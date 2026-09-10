package com.google.android.exoplayer2.text.cea;

import java.util.Comparator;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class a implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return Integer.compare(((Cea708Decoder.Cea708CueInfo) obj2).f18500b, ((Cea708Decoder.Cea708CueInfo) obj).f18500b);
    }
}
