package com.inmobi.media.videoPlayer.model;

import p002kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000e\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\u0007\"\u0004\b\f\u0010\tR\u001a\u0010\r\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u0007\"\u0004\b\u000f\u0010\tR\u001a\u0010\u0010\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0007\"\u0004\b\u0012\u0010\t¨\u0006\u0013"}, d2 = {"Lcom/inmobi/media/videoPlayer/model/TrackPercentage;", "", "<init>", "()V", "q1", "", "getQ1", "()I", "setQ1", "(I)V", "q2", "getQ2", "setQ2", "q3", "getQ3", "setQ3", "q4", "getQ4", "setQ4", "media_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class TrackPercentage {
    private int q1 = 25;
    private int q2 = 50;
    private int q3 = 75;
    private int q4 = 100;

    public final int getQ1() {
        return this.q1;
    }

    public final int getQ2() {
        return this.q2;
    }

    public final int getQ3() {
        return this.q3;
    }

    public final int getQ4() {
        return this.q4;
    }

    public final void setQ1(int i) {
        this.q1 = i;
    }

    public final void setQ2(int i) {
        this.q2 = i;
    }

    public final void setQ3(int i) {
        this.q3 = i;
    }

    public final void setQ4(int i) {
        this.q4 = i;
    }
}
