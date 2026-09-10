package com.google.android.exoplayer2.extractor.metadata.vorbis;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.ads.redexgen.core.C1111Vp;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class VorbisComment extends com.google.android.exoplayer2.extractor.metadata.flac.VorbisComment {
    public static final Parcelable.Creator<VorbisComment> CREATOR = new C1111Vp();

    public VorbisComment(Parcel parcel) {
        super(parcel);
    }

    public VorbisComment(String str, String str2) {
        super(str, str2);
    }
}
