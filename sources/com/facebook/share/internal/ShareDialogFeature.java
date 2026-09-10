package com.facebook.share.internal;

import com.facebook.internal.DialogFeature;

/* JADX INFO: loaded from: classes3.dex */
public enum ShareDialogFeature implements DialogFeature {
    SHARE_DIALOG(20130618),
    PHOTOS(20140204),
    VIDEO(20141028),
    MULTIMEDIA(20160327),
    HASHTAG(20160327),
    LINK_SHARE_QUOTES(20160327);

    public final int X;

    ShareDialogFeature(int i2) {
        this.X = i2;
    }

    @Override // com.facebook.internal.DialogFeature
    public final int d() {
        return this.X;
    }

    @Override // com.facebook.internal.DialogFeature
    public final String g() {
        return "com.facebook.platform.action.request.FEED_DIALOG";
    }
}
