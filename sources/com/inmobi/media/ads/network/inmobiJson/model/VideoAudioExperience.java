package com.inmobi.media.ads.network.inmobiJson.model;

import p002kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0015\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0006\u0010\u0007R$\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\t\u001a\u0004\u0018\u00010\n@BX\u0086\u000e¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\f\u0010\rR$\u0010\u000f\u001a\u0004\u0018\u00010\n2\b\u0010\t\u001a\u0004\u0018\u00010\n@BX\u0086\u000e¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\u0010\u0010\rR\"\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\u0010\t\u001a\u0004\u0018\u00010\u0011@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R$\u0010\u0015\u001a\u0004\u0018\u00010\n2\b\u0010\t\u001a\u0004\u0018\u00010\n@BX\u0086\u000e¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\u0016\u0010\r¨\u0006\u0017"}, d2 = {"Lcom/inmobi/media/ads/network/inmobiJson/model/VideoAudioExperience;", "", "<init>", "()V", "startMuted", "", "getStartMuted", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "value", "", "muteIconWidth", "getMuteIconWidth", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "muteIconHeight", "getMuteIconHeight", "", "muteIconMargin", "getMuteIconMargin", "()[I", "muteIconPosition", "getMuteIconPosition", "media_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class VideoAudioExperience {
    private Integer muteIconHeight;
    private int[] muteIconMargin;
    private Integer muteIconPosition;
    private Integer muteIconWidth;
    private final Boolean startMuted;

    public final Integer getMuteIconHeight() {
        return this.muteIconHeight;
    }

    public final int[] getMuteIconMargin() {
        return this.muteIconMargin;
    }

    public final Integer getMuteIconPosition() {
        return this.muteIconPosition;
    }

    public final Integer getMuteIconWidth() {
        return this.muteIconWidth;
    }

    public final Boolean getStartMuted() {
        return this.startMuted;
    }
}
