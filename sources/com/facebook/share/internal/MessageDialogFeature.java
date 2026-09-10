package com.facebook.share.internal;

import com.facebook.internal.DialogFeature;

/* JADX INFO: loaded from: classes3.dex */
public enum MessageDialogFeature implements DialogFeature {
    MESSAGE_DIALOG(20140204),
    /* JADX INFO: Fake field, exist only in values array */
    PHOTOS(20140324),
    /* JADX INFO: Fake field, exist only in values array */
    VIDEO(20141218),
    MESSENGER_GENERIC_TEMPLATE(20171115),
    MESSENGER_OPEN_GRAPH_MUSIC_TEMPLATE(20171115),
    MESSENGER_MEDIA_TEMPLATE(20171115);

    public final int X;

    MessageDialogFeature(int i2) {
        this.X = i2;
    }

    @Override // com.facebook.internal.DialogFeature
    public final int d() {
        return this.X;
    }

    @Override // com.facebook.internal.DialogFeature
    public final String g() {
        return "com.facebook.platform.action.request.MESSAGE_DIALOG";
    }
}
