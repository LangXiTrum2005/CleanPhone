package com.google.android.exoplayer2.text.webvtt;

import java.util.Comparator;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class a implements Comparator {
    public final /* synthetic */ int X;

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.X) {
            case 0:
                return Integer.compare(((WebvttCueParser.Element) obj).f18648a.f18651b, ((WebvttCueParser.Element) obj2).f18648a.f18651b);
            default:
                return Long.compare(((WebvttCueInfo) obj).f18642b, ((WebvttCueInfo) obj2).f18642b);
        }
    }
}
