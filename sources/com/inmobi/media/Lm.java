package com.inmobi.media;

import androidx.media3.common.Metadata;
import androidx.media3.common.PlaybackException;
import androidx.media3.common.cord;
import androidx.media3.common.formularize;
import androidx.media3.common.gintrap;
import androidx.media3.common.kattegat;
import androidx.media3.common.oilcan;
import androidx.media3.common.polder;
import androidx.media3.common.preprohormone;
import androidx.media3.common.saneness;
import androidx.media3.common.supplicat;
import androidx.media3.exoplayer.adultoid;
import java.util.List;
import kotlinx.coroutines.kowloon;
import libya.attabal;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class Lm implements cord.wireman {
    public final /* synthetic */ kowloon a;
    public final /* synthetic */ K2 b;
    public final /* synthetic */ String c;
    public final /* synthetic */ InterfaceC3072m9 d;
    public final /* synthetic */ adultoid e;

    public Lm(kowloon kowloonVar, K2 k2, String str, InterfaceC3072m9 interfaceC3072m9, adultoid adultoidVar) {
        this.a = kowloonVar;
        this.b = k2;
        this.c = str;
        this.d = interfaceC3072m9;
        this.e = adultoidVar;
    }

    @Override // androidx.media3.common.cord.wireman
    public /* bridge */ /* synthetic */ void onAudioAttributesChanged(saneness sanenessVar) {
        super.onAudioAttributesChanged(sanenessVar);
    }

    @Override // androidx.media3.common.cord.wireman
    public /* bridge */ /* synthetic */ void onAudioSessionIdChanged(int i) {
        super.onAudioSessionIdChanged(i);
    }

    @Override // androidx.media3.common.cord.wireman
    public /* bridge */ /* synthetic */ void onAvailableCommandsChanged(cord.saneness sanenessVar) {
        super.onAvailableCommandsChanged(sanenessVar);
    }

    @Override // androidx.media3.common.cord.wireman
    @Deprecated
    public /* bridge */ /* synthetic */ void onCues(List list) {
        super.onCues((List<attabal>) list);
    }

    @Override // androidx.media3.common.cord.wireman
    public /* bridge */ /* synthetic */ void onDeviceInfoChanged(formularize formularizeVar) {
        super.onDeviceInfoChanged(formularizeVar);
    }

    @Override // androidx.media3.common.cord.wireman
    public /* bridge */ /* synthetic */ void onDeviceVolumeChanged(int i, boolean z) {
        super.onDeviceVolumeChanged(i, z);
    }

    @Override // androidx.media3.common.cord.wireman
    public /* bridge */ /* synthetic */ void onEvents(cord cordVar, cord.dern dernVar) {
        super.onEvents(cordVar, dernVar);
    }

    @Override // androidx.media3.common.cord.wireman
    public /* bridge */ /* synthetic */ void onIsLoadingChanged(boolean z) {
        super.onIsLoadingChanged(z);
    }

    @Override // androidx.media3.common.cord.wireman
    public /* bridge */ /* synthetic */ void onIsPlayingChanged(boolean z) {
        super.onIsPlayingChanged(z);
    }

    @Override // androidx.media3.common.cord.wireman
    @Deprecated
    public /* bridge */ /* synthetic */ void onLoadingChanged(boolean z) {
        super.onLoadingChanged(z);
    }

    @Override // androidx.media3.common.cord.wireman
    public /* bridge */ /* synthetic */ void onMaxSeekToPreviousPositionChanged(long j) {
        super.onMaxSeekToPreviousPositionChanged(j);
    }

    @Override // androidx.media3.common.cord.wireman
    public /* bridge */ /* synthetic */ void onMediaItemTransition(androidx.media3.common.adultoid adultoidVar, int i) {
        super.onMediaItemTransition(adultoidVar, i);
    }

    @Override // androidx.media3.common.cord.wireman
    public /* bridge */ /* synthetic */ void onMediaMetadataChanged(gintrap gintrapVar) {
        super.onMediaMetadataChanged(gintrapVar);
    }

    @Override // androidx.media3.common.cord.wireman
    public /* bridge */ /* synthetic */ void onMetadata(Metadata metadata) {
        super.onMetadata(metadata);
    }

    @Override // androidx.media3.common.cord.wireman
    public /* bridge */ /* synthetic */ void onPlayWhenReadyChanged(boolean z, int i) {
        super.onPlayWhenReadyChanged(z, i);
    }

    @Override // androidx.media3.common.cord.wireman
    public /* bridge */ /* synthetic */ void onPlaybackParametersChanged(preprohormone preprohormoneVar) {
        super.onPlaybackParametersChanged(preprohormoneVar);
    }

    @Override // androidx.media3.common.cord.wireman
    public final void onPlaybackStateChanged(int i) {
        if (i == 3) {
            if (this.a.isActive()) {
                int iA = this.b.a(this.c);
                InterfaceC3072m9 interfaceC3072m9 = this.d;
                if (interfaceC3072m9 != null) {
                    ((C3097n9) interfaceC3072m9).a("VideoLoaderHelper", "Media loaded successfully from URL with cache progress: " + iA);
                }
                P4.a(this.a, new C2896f8(iA, this.e.getDuration(), this.c));
            }
            this.e.impromptu(this);
        }
    }

    @Override // androidx.media3.common.cord.wireman
    public /* bridge */ /* synthetic */ void onPlaybackSuppressionReasonChanged(int i) {
        super.onPlaybackSuppressionReasonChanged(i);
    }

    @Override // androidx.media3.common.cord.wireman
    public final void onPlayerError(PlaybackException error) {
        Intrinsics.checkNotNullParameter(error, "error");
        InterfaceC3072m9 interfaceC3072m9 = this.d;
        if (interfaceC3072m9 != null) {
            ((C3097n9) interfaceC3072m9).b("VideoLoaderHelper", "Failed to load URL (" + this.c + "): " + error.getMessage());
        }
        if (this.a.isActive()) {
            P4.a(this.a, new C2819c8(Am.NETWORK));
        }
        this.e.impromptu(this);
        this.e.stop();
        this.e.dern();
    }

    @Override // androidx.media3.common.cord.wireman
    public /* bridge */ /* synthetic */ void onPlayerErrorChanged(PlaybackException playbackException) {
        super.onPlayerErrorChanged(playbackException);
    }

    @Override // androidx.media3.common.cord.wireman
    @Deprecated
    public /* bridge */ /* synthetic */ void onPlayerStateChanged(boolean z, int i) {
        super.onPlayerStateChanged(z, i);
    }

    @Override // androidx.media3.common.cord.wireman
    public /* bridge */ /* synthetic */ void onPlaylistMetadataChanged(gintrap gintrapVar) {
        super.onPlaylistMetadataChanged(gintrapVar);
    }

    @Override // androidx.media3.common.cord.wireman
    @Deprecated
    public /* bridge */ /* synthetic */ void onPositionDiscontinuity(int i) {
        super.onPositionDiscontinuity(i);
    }

    @Override // androidx.media3.common.cord.wireman
    public /* bridge */ /* synthetic */ void onRenderedFirstFrame() {
        super.onRenderedFirstFrame();
    }

    @Override // androidx.media3.common.cord.wireman
    public /* bridge */ /* synthetic */ void onRepeatModeChanged(int i) {
        super.onRepeatModeChanged(i);
    }

    @Override // androidx.media3.common.cord.wireman
    public /* bridge */ /* synthetic */ void onSeekBackIncrementChanged(long j) {
        super.onSeekBackIncrementChanged(j);
    }

    @Override // androidx.media3.common.cord.wireman
    public /* bridge */ /* synthetic */ void onSeekForwardIncrementChanged(long j) {
        super.onSeekForwardIncrementChanged(j);
    }

    @Override // androidx.media3.common.cord.wireman
    public /* bridge */ /* synthetic */ void onShuffleModeEnabledChanged(boolean z) {
        super.onShuffleModeEnabledChanged(z);
    }

    @Override // androidx.media3.common.cord.wireman
    public /* bridge */ /* synthetic */ void onSkipSilenceEnabledChanged(boolean z) {
        super.onSkipSilenceEnabledChanged(z);
    }

    @Override // androidx.media3.common.cord.wireman
    public /* bridge */ /* synthetic */ void onSurfaceSizeChanged(int i, int i2) {
        super.onSurfaceSizeChanged(i, i2);
    }

    @Override // androidx.media3.common.cord.wireman
    public /* bridge */ /* synthetic */ void onTimelineChanged(oilcan oilcanVar, int i) {
        super.onTimelineChanged(oilcanVar, i);
    }

    @Override // androidx.media3.common.cord.wireman
    public /* bridge */ /* synthetic */ void onTrackSelectionParametersChanged(kattegat kattegatVar) {
        super.onTrackSelectionParametersChanged(kattegatVar);
    }

    @Override // androidx.media3.common.cord.wireman
    public /* bridge */ /* synthetic */ void onTracksChanged(supplicat supplicatVar) {
        super.onTracksChanged(supplicatVar);
    }

    @Override // androidx.media3.common.cord.wireman
    public /* bridge */ /* synthetic */ void onVideoSizeChanged(polder polderVar) {
        super.onVideoSizeChanged(polderVar);
    }

    @Override // androidx.media3.common.cord.wireman
    public /* bridge */ /* synthetic */ void onVolumeChanged(float f) {
        super.onVolumeChanged(f);
    }

    @Override // androidx.media3.common.cord.wireman
    public /* bridge */ /* synthetic */ void onCues(libya.saneness sanenessVar) {
        super.onCues(sanenessVar);
    }

    @Override // androidx.media3.common.cord.wireman
    public /* bridge */ /* synthetic */ void onPositionDiscontinuity(cord.marial marialVar, cord.marial marialVar2, int i) {
        super.onPositionDiscontinuity(marialVar, marialVar2, i);
    }
}
