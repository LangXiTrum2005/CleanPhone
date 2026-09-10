package androidx.media3.ui;

/* JADX INFO: loaded from: classes.dex */
public interface TimeBar {

    public interface OnScrubListener {
        void m(long j);

        void r(long j);

        void s(long j, boolean z2);
    }

    void a(OnScrubListener onScrubListener);

    void b(long[] jArr, boolean[] zArr, int i2);

    long getPreferredUpdateDelay();

    void setBufferedPosition(long j);

    void setDuration(long j);

    void setEnabled(boolean z2);

    void setPosition(long j);
}
