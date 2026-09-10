package com.google.android.exoplayer2.metadata.id3;

import com.google.android.exoplayer2.metadata.Metadata;

/* JADX INFO: loaded from: classes3.dex */
public abstract class Id3Frame implements Metadata.Entry {
    public final String X;

    public Id3Frame(String str) {
        this.X = str;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        return this.X;
    }
}
