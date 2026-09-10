package androidx.media3.exoplayer.mediacodec;

import java.util.Comparator;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class f implements Comparator {
    public final /* synthetic */ MediaCodecUtil.ScoreProvider X;

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        Pattern pattern = MediaCodecUtil.f6305a;
        MediaCodecUtil.ScoreProvider scoreProvider = this.X;
        return scoreProvider.a(obj2) - scoreProvider.a(obj);
    }
}
