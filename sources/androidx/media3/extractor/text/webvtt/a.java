package androidx.media3.extractor.text.webvtt;

import java.util.Comparator;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements Comparator {
    public final /* synthetic */ int X;

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.X) {
            case 0:
                return Integer.compare(((WebvttCueParser.Element) obj).f7415a.f7418b, ((WebvttCueParser.Element) obj2).f7415a.f7418b);
            default:
                return Long.compare(((WebvttCueInfo) obj).f7409b, ((WebvttCueInfo) obj2).f7409b);
        }
    }
}
