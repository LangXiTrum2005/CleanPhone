package com.google.android.exoplayer2.audio;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.database.ContentObserver;

/* JADX INFO: loaded from: classes3.dex */
public final class AudioCapabilitiesReceiver {

    public final class ExternalSurroundSoundSettingObserver extends ContentObserver {
        @Override // android.database.ContentObserver
        public final void onChange(boolean z2) {
            throw null;
        }
    }

    public final class HdmiAudioPlugBroadcastReceiver extends BroadcastReceiver {
        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            if (isInitialStickyBroadcast()) {
                return;
            }
            AudioCapabilities.a(context, intent);
            throw null;
        }
    }

    public interface Listener {
    }
}
