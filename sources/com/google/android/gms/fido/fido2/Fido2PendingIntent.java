package com.google.android.gms.fido.fido2;

import android.app.Activity;
import android.content.IntentSender;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public interface Fido2PendingIntent {
    boolean hasPendingIntent();

    void launchPendingIntent(Activity activity, int i2) throws IntentSender.SendIntentException;
}
